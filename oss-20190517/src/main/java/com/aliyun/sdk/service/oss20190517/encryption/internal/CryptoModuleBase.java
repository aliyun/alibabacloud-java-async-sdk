package com.aliyun.sdk.service.oss20190517.encryption.internal;

import com.aliyun.core.utils.Base64Util;
import com.aliyun.core.utils.ParseUtil;
import com.aliyun.core.utils.Validate;
import com.aliyun.sdk.gateway.oss.exception.OSSClientException;
import com.aliyun.sdk.service.oss20190517.encryption.ContentCryptoMaterial;
import com.aliyun.sdk.service.oss20190517.encryption.CryptoConfiguration;
import com.aliyun.sdk.service.oss20190517.encryption.EncryptionMaterials;
import com.aliyun.sdk.service.oss20190517.encryption.crypto.CryptoCipher;
import com.aliyun.sdk.service.oss20190517.encryption.crypto.CryptoScheme;
import com.aliyun.sdk.service.oss20190517.encryption.models.*;
import com.aliyun.sdk.service.oss20190517.models.*;
import darabonba.core.async.AsyncResponseHandler;
import darabonba.core.sync.RequestBody;

import javax.crypto.SecretKey;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;


public abstract class CryptoModuleBase implements CryptoModule {
    protected static final int DEFAULT_BUFFER_SIZE = 1024 * 2;
    protected final EncryptionMaterials encryptionMaterials;
    protected final CryptoConfiguration cryptoConfig;
    protected final OSSDirect ossDirect;
    protected final String encryptionClientUserAgent;

    protected CryptoModuleBase(OSSDirect ossDirect,
                               EncryptionMaterials encryptionMaterials,
                               CryptoConfiguration cryptoConfig) {
        this.encryptionMaterials = encryptionMaterials;
        this.ossDirect = ossDirect;
        this.cryptoConfig = cryptoConfig;
        this.encryptionClientUserAgent = "";
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> getObjectSecurely(GetObjectRequest request, Map<String, String> headers, AsyncResponseHandler<GetObjectResponse, ReturnT> responseHandler) {
        long[] desiredRange = Utils.parseRange(request.getRange());
        long[] cryptoRange = Utils.calcCryptoRange(desiredRange);
        long contentLength = Long.parseLong(Optional.ofNullable(headers.get("Content-Length")).orElse("-1"));
        if (cryptoRange != null) {
            request = request.toBuilder()
                    .range(Utils.toRangeString(cryptoRange))
                    .headerParam("x-oss-range-behavior", "standard")
                    .build();
        }
        CryptoCipher cryptoCipher = createDecryptCryptoCipher(
                createContentMaterialFromMetadata(headers),
                cryptoRange, 0);
        final AsyncDecryptResponseHandler<GetObjectResponse, ReturnT> handler = new AsyncDecryptResponseHandler(responseHandler,
                desiredRange, cryptoRange, contentLength, cryptoCipher);
        return ossDirect.getObjectWithAsyncResponseHandler(request, handler).thenCompose(result -> {
            if (handler.getLastException() != null) {
                CompletableFuture<ReturnT> future = new CompletableFuture<>();
                future.completeExceptionally(handler.getLastException());
                return future;
            }
            return CompletableFuture.completedFuture(result);
        });
    }

    @Override
    public CompletableFuture<PutObjectResponse> putObjectSecurely(PutObjectRequest request) {
        // Update User-Agent.

        // Build content crypto material.
        ContentCryptoMaterial cekMaterial = createContentCryptoMaterialDefault();

        // generate crypto the metadata
        Map<String, String> metadata = generateCryptoMetadata(cekMaterial, request.getHeaderParameters());
        if (request.getMetaData() != null) {
            metadata.putAll(request.getMetaData());
        }

        // Wraps the object data with a cipher input stream
        CryptoCipher cryptoCipher = createEncryptCryptoCipher(cekMaterial, null, 0);
        InputStream body = request.getBody();
        if (body != null) {
            body = new RenewableCipherInputStream(body, cryptoCipher, DEFAULT_BUFFER_SIZE);
        }

        PutObjectRequest req = request.toBuilder()
                .metaData(metadata)
                .body(body)
                .build();
        req.getHeaderParameters().remove("Content-MD5");

        // Put the encrypted object by the oss client
        return ossDirect.putObject(req);
    }

    @Override
    public CompletableFuture<PutObjectResponse> putObjectSecurely(PutObjectRequest request, RequestBody requestBody) {
        // Update User-Agent.

        // Build content crypto material.
        ContentCryptoMaterial cekMaterial = createContentCryptoMaterialDefault();

        // generate crypto the metadata
        Map<String, String> metadata = generateCryptoMetadata(cekMaterial, request.getHeaderParameters());
        if (request.getMetaData() != null) {
            metadata.putAll(request.getMetaData());
        }

        // Wraps the object data with a cipher input stream
        final CryptoCipher cryptoCipher = createEncryptCryptoCipher(cekMaterial, null, 0);
        request = request.toBuilder().metaData(metadata).build();
        request.getHeaderParameters().remove("Content-MD5");

        // Put the encrypted object by the oss client
        return ossDirect.putObjectWithRequestBody(request, RequestBody.fromContentProvider(
                () -> new RenewableCipherInputStream(requestBody.newStream(), cryptoCipher, DEFAULT_BUFFER_SIZE),
                requestBody.contentLength().orElse(null),
                requestBody.contentType().orElse(null))
        );
    }

    @Override
    public CompletableFuture<InitiateMultipartUploadEncryptionResponse> initiateMultipartUploadSecurely(InitiateMultipartUploadEncryptionRequest request) {
        checkMultipartPartSize(request.getPartSize());
        // Update User-Agent.

        // Build content crypto material.
        final ContentCryptoMaterial cekMaterial = createContentCryptoMaterialDefault();

        // generate crypto the metadata
        Map<String, String> metadata = generateMultiPartCryptoMetadata(
                cekMaterial,
                request.getInitiateMultipartUploadRequest().getHeaderParameters(),
                request.getPartSize(),
                request.getDataSize());

        InitiateMultipartUploadRequest.Builder builder = request.getInitiateMultipartUploadRequest().toBuilder();
        for (String key : metadata.keySet()) {
            builder.headerParam("x-oss-meta-" + key, metadata.get(key));
        }

        return ossDirect.initiateMultipartUpload(builder.build()).thenCompose(result ->
                CompletableFuture.completedFuture(InitiateMultipartUploadEncryptionResponse.builder()
                        .initiateMultipartUploadResponse(result)
                        .contentCryptoMaterial(cekMaterial)
                        .partSize(request.getPartSize())
                        .dataSize(request.getDataSize())
                        .build()));
    }

    @Override
    public CompletableFuture<UploadPartEncryptionResponse> uploadPartSecurely(UploadPartEncryptionRequest request) {
        Validate.paramNotNull(request.getContentCryptoMaterial(), "ContentCryptoMaterial");
        checkMultipartPartSize(request.getPartSize());

        // Wraps the object data with a cipher input stream
        long offset = request.getPartSize() * (request.getUploadPartRequest().getPartNumber() - 1);
        long skipBlock = offset / CryptoScheme.BLOCK_SIZE;

        CryptoCipher cryptoCipher = createEncryptCryptoCipher(request.getContentCryptoMaterial(), null, skipBlock);
        InputStream body = request.getUploadPartRequest().getBody();
        if (body != null) {
            body = new RenewableCipherInputStream(body, cryptoCipher, DEFAULT_BUFFER_SIZE);
        }

        UploadPartRequest req = request.getUploadPartRequest().toBuilder()
                .body(body)
                .build();
        req.getHeaderParameters().remove("Content-MD5");

        return ossDirect.uploadPart(req).thenCompose(result ->
                CompletableFuture.completedFuture(UploadPartEncryptionResponse.builder()
                        .uploadPartResponse(result)
                        .build()));
    }

    @Override
    public CompletableFuture<UploadPartEncryptionResponse> uploadPartSecurely(UploadPartEncryptionRequest request, RequestBody requestBody) {
        Validate.paramNotNull(request.getContentCryptoMaterial(), "ContentCryptoMaterial");
        checkMultipartPartSize(request.getPartSize());

        // Wraps the object data with a cipher input stream
        long offset = request.getPartSize() * (request.getUploadPartRequest().getPartNumber() - 1);
        long skipBlock = offset / CryptoScheme.BLOCK_SIZE;

        CryptoCipher cryptoCipher = createEncryptCryptoCipher(request.getContentCryptoMaterial(), null, skipBlock);

        UploadPartRequest req = request.getUploadPartRequest().toBuilder().build();
        req.getHeaderParameters().remove("Content-MD5");

        return ossDirect.uploadPartWithRequestBody(req, RequestBody.fromContentProvider(
                () -> new RenewableCipherInputStream(requestBody.newStream(), cryptoCipher, DEFAULT_BUFFER_SIZE),
                requestBody.contentLength().orElse(null),
                requestBody.contentType().orElse(null)))
                .thenCompose(result ->
                        CompletableFuture.completedFuture(UploadPartEncryptionResponse.builder()
                                .uploadPartResponse(result)
                                .build()));
    }

    @Override
    public CompletableFuture<CompleteMultipartUploadEncryptionResponse> completeMultipartUploadSecurely(CompleteMultipartUploadEncryptionRequest request) {
        return ossDirect.completeMultipartUpload(request.getCompleteMultipartUploadRequest()).thenCompose(result ->
                CompletableFuture.completedFuture(CompleteMultipartUploadEncryptionResponse.builder()
                        .completeMultipartUploadResponse(result)
                        .build()));
    }

    abstract SecretKey generateCEK();

    abstract byte[] generateIV();

    abstract String getContentCipherAlgorithm();

    abstract CryptoCipher createEncryptCryptoCipher(ContentCryptoMaterial cekMaterial, long[] cryptoRange, long skipBlock);

    abstract CryptoCipher createDecryptCryptoCipher(ContentCryptoMaterial cekMaterial, long[] cryptoRange, long skipBlock);

    /**
     * build the encryption materials in the object metadata.
     */
    protected final Map<String, String> generateCryptoMetadata(ContentCryptoMaterial contentCryptoMaterial, Map<String, Object> headers) {
        Map<String, String> metadata = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        //x-oss-meta-client-side-encryption-key
        byte[] encryptedCEK = contentCryptoMaterial.getEncryptedCEK();
        metadata.put(CryptoHeaders.CRYPTO_KEY, Base64Util.encodeToString(encryptedCEK));

        //x-oss-meta-client-side-encryption-start //iv
        // Put the iv into the object metadata
        byte[] encryptedIV = contentCryptoMaterial.getEncryptedIV();
        metadata.put(CryptoHeaders.CRYPTO_IV, Base64Util.encodeToString(encryptedIV));

        //x-oss-meta-client-side-encryption-cek-alg
        // Put the content encrypt key algorithm into the object metadata
        String contentCryptoAlgo = contentCryptoMaterial.getContentCryptoAlgorithm();
        metadata.put(CryptoHeaders.CRYPTO_CEK_ALG, contentCryptoAlgo);

        //x-oss-meta-client-side-encryption-wrap-alg
        // Put the key wrap algorithm into the object metadata
        String keyWrapAlgo = contentCryptoMaterial.getKeyWrapAlgorithm();
        metadata.put(CryptoHeaders.CRYPTO_WRAP_ALG, keyWrapAlgo);

        //x-oss-meta-client-side-encryption-matdesc,json format
        // Put the crypto description into the object metadata
        Map<String, String> materialDesc = contentCryptoMaterial.getMaterialsDescription();
        if (materialDesc != null && materialDesc.size() > 0) {
            String descStr = ParseUtil.toJSONString(materialDesc);
            metadata.put(CryptoHeaders.CRYPTO_MATDESC, descStr);
        }

        //x-oss-meta-client-side-encryption-magic-number-hmac

        //x-oss-meta-client-side-encryption-unencrypted-content-md5
        if (headers.containsKey("Content-MD5")) {
            metadata.put(CryptoHeaders.CRYPTO_UNENCRYPTION_CONTENT_MD5, (String) headers.get("Content-MD5"));
        }

        return metadata;
    }

    protected final Map<String, String> generateMultiPartCryptoMetadata(ContentCryptoMaterial contentCryptoMaterial,
                                                                        Map<String, Object> headers,
                                                                        Long partSize,
                                                                        Long dataSize) {
        Map<String, String> metaData = generateCryptoMetadata(contentCryptoMaterial, headers);
        metaData.put(CryptoHeaders.CRYPTO_PART_SIZE, partSize.toString());
        if (dataSize != null) {
            metaData.put(CryptoHeaders.CRYPTO_DATA_SIZE, dataSize.toString());
        }
        return metaData;
    }

    /**
     * Builds a new content crypto material for encrypting the object achieved.
     */
    protected ContentCryptoMaterial createContentCryptoMaterialDefault() {
        // Generate random CEK IV
        byte[] iv = generateIV();
        SecretKey cek = generateCEK();

        // Build content crypto Materials by encryptionMaterials.
        ContentCryptoMaterial contentMaterial = new ContentCryptoMaterial();
        contentMaterial.setIV(iv);
        contentMaterial.setCEK(cek);
        contentMaterial.setContentCryptoAlgorithm(getContentCipherAlgorithm());
        encryptionMaterials.encryptCEK(contentMaterial);

        return contentMaterial;
    }

    /**
     * Builds a new content crypto material for decrypting the object achieved.
     */
    protected ContentCryptoMaterial createContentMaterialFromMetadata(Map<String, String> headers) {
        // Encrypted CEK and encrypted IV.
        String b64CEK = headers.get(CryptoHeaders.X_OSS_META_CRYPTO_KEY);
        String b64IV = headers.get(CryptoHeaders.X_OSS_META_CRYPTO_IV);
        if (b64CEK == null || b64IV == null) {
            throw new OSSClientException("Content encrypted key  or encrypted iv not found.", null);
        }
        byte[] encryptedCEK = Base64Util.decodeString(b64CEK);
        byte[] encryptedIV = Base64Util.decodeString(b64IV);

        // Key wrap algorithm
        final String keyWrapAlgo = headers.get(CryptoHeaders.X_OSS_META_CRYPTO_WRAP_ALG);
        if (keyWrapAlgo == null)
            throw new OSSClientException("Key wrap algorithm should not be null.", null);

        // CEK algorithm
        String cekAlgo = headers.get(CryptoHeaders.X_OSS_META_CRYPTO_CEK_ALG);

        // Description
        String mateDescString = headers.get(CryptoHeaders.X_OSS_META_CRYPTO_MATDESC);
        Map<String, String> matDesc = Utils.getDescFromJsonString(mateDescString);

        // Decrypt the secured CEK to CEK.
        ContentCryptoMaterial contentMaterial = new ContentCryptoMaterial();
        contentMaterial.setEncryptedCEK(encryptedCEK);
        contentMaterial.setEncryptedIV(encryptedIV);
        contentMaterial.setMaterialsDescription(matDesc);
        contentMaterial.setContentCryptoAlgorithm(cekAlgo);
        contentMaterial.setKeyWrapAlgorithm(keyWrapAlgo);
        encryptionMaterials.decryptCEK(contentMaterial);

        return contentMaterial;
    }

    private void checkMultipartPartSize(Long partSize) {
        Validate.paramNotNull(partSize, "PartSize");
        if (partSize <= 0 || 0 != (partSize % CryptoScheme.BLOCK_SIZE)) {
            throw new IllegalArgumentException("PartSize is not 16 bytes alignment.");
        }
    }
}
