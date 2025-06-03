// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.kms20160120.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "Kms";
        this.version = "2016-01-20";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>ENCRYPT/DECRYPT</strong>. The following table lists supported encryption algorithms. </p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * <th>Maximum length in bytes</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>256</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>384</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>384</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>SM2 public key encryption algorithm based on elliptic curves</td>
     * <td>6144</td>
     * </tr>
     * <tr>
     * <td>In this example, the asymmetric key whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the decryption algorithm <code>RSAES_OAEP_SHA_1</code> are used to decrypt the ciphertext <code>BQKP+1zK6+ZEMxTP5qaVzcsgXtWplYBKm0NXdSnB5FzliFxE1bSiu4dnEIlca2JpeH7yz1/S6fed630H+hIH6DoM25fTLNcKj+mFB0Xnh9m2+HN59Mn4qyTfcUeadnfCXSWcGBouhXFwcdd2rJ3n337bzTf4jm659gZu3L0i6PLuxM9p7mqdwO0cKJPfGVfhnfMz+f4alMg79WB/NNyE2lyX7/qxvV49ObNrrJbKSFiz8Djocaf0IESNLMbfYI5bXjWkJlX92DQbKhibtQW8ZOJ//ZC6t0AWcUoKL6QDm/dg5koQalcleRinpB+QadFm894sLbVZ9+N4GVsv1W****==</code>.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of AsymmetricDecrypt  AsymmetricDecryptRequest
     * @return AsymmetricDecryptResponse
     */
    @Override
    public CompletableFuture<AsymmetricDecryptResponse> asymmetricDecrypt(AsymmetricDecryptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AsymmetricDecrypt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AsymmetricDecryptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AsymmetricDecryptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only for asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>ENCRYPT/DECRYPT</strong>. The following table lists the supported encryption algorithms: </p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * <th>Maximum number of bytes that can be encrypted</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>190</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>214</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSAES-OAEP using SHA-256 and MGF1 with SHA-256</td>
     * <td>318</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSAES-OAEP using SHA1 and MGF1 with SHA1</td>
     * <td>342</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>SM2 public key encryption algorithm based on elliptic curves</td>
     * <td>6047</td>
     * </tr>
     * <tr>
     * <td>You can use the asymmetric CMK whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the algorithm <code>RSAES_OAEP_SHA_1</code> to encrypt the plaintext <code>SGVsbG8gd29ybGQ=</code> based on the parameter settings provided in this topic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of AsymmetricEncrypt  AsymmetricEncryptRequest
     * @return AsymmetricEncryptResponse
     */
    @Override
    public CompletableFuture<AsymmetricEncryptResponse> asymmetricEncrypt(AsymmetricEncryptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AsymmetricEncrypt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AsymmetricEncryptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AsymmetricEncryptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Generates a signature by using an asymmetric key.</p>
     * 
     * @param request the request parameters of AsymmetricSign  AsymmetricSignRequest
     * @return AsymmetricSignResponse
     */
    @Override
    public CompletableFuture<AsymmetricSignResponse> asymmetricSign(AsymmetricSignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AsymmetricSign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AsymmetricSignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AsymmetricSignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation supports only asymmetric keys for which the <strong>Usage</strong> parameter is set to <strong>SIGN/VERIFY</strong>. The following table describes the supported signature algorithms. </p>
     * <table>
     * <thead>
     * <tr>
     * <th>KeySpec</th>
     * <th>Algorithm</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSASSA-PSS using SHA-256 and MGF1 with SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_2048</td>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSASSA-PKCS1-v1_5 using SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSASSA-PSS using SHA-256 and MGF1 with SHA-256</td>
     * </tr>
     * <tr>
     * <td>RSA_3072</td>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSASSA-PKCS1-v1_5 using SHA-256</td>
     * </tr>
     * <tr>
     * <td>EC_P256</td>
     * <td>ECDSA_SHA_256</td>
     * <td>ECDSA on the P-256 Curve(secp256r1) with a SHA-256 digest</td>
     * </tr>
     * <tr>
     * <td>EC_P256K</td>
     * <td>ECDSA_SHA_256</td>
     * <td>ECDSA on the P-256K Curve(secp256k1) with a SHA-256 digest</td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2DSA</td>
     * <td>SM2 elliptic curve public key encryption algorithm</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p> When you calculate the SM2 signature based on GB/T 32918, the <strong>Digest</strong> parameter is used to calculate the digest value of the combination of Z(A) and M, rather than the SM3 digest value. M indicates the original message to be signed. Z(A) indicates the hash value for User A. The hash value is defined in GB/T 32918.  In this example, the asymmetric key whose ID is <code>5c438b18-05be-40ad-b6c2-3be6752c****</code> and version ID is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code> and the signature algorithm RSA_PSS_SHA_256 are used to verify the signature <code>M2CceNZH00ZgL9ED/ZHFp21YRAvYeZHknJUc207OCZ0N9wNn9As4z2bON3FF3je+1Nu+2+/8Zj50HpMTpzYpMp2R93cYmACCmhaYoKydxylbyGzJR8y9likZRCrkD38lRoS40aBBvv/6iRKzQuo9EGYVcel36cMNg00VmYNBy3pa1rwg3gA4l3cy6kjayZja1WGPkVhrVKsrJMdbpl0ApLjXKuD8rw1n1XLCwCUEL5eLPljTZaAveqdOFQOiZnZEGI27qIiZe7I1fN8tcz6anS/gTM7xRKE++5egEvRWlTQQTJeApnPSiUPA+8ZykNdelQsOQh5SrGoyI4A5pq****==</code> of the digest <code>ZOyIygCyaOW6GjVnihtTFtIS9PNmskdyMlNKiuyjfzw=</code>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AsymmetricVerify  AsymmetricVerifyRequest
     * @return AsymmetricVerifyResponse
     */
    @Override
    public CompletableFuture<AsymmetricVerifyResponse> asymmetricVerify(AsymmetricVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AsymmetricVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AsymmetricVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AsymmetricVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If the deletion task of a CMK is canceled, the CMK returns to the Enabled state.</p>
     * 
     * @param request the request parameters of CancelKeyDeletion  CancelKeyDeletionRequest
     * @return CancelKeyDeletionResponse
     */
    @Override
    public CompletableFuture<CancelKeyDeletionResponse> cancelKeyDeletion(CancelKeyDeletionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelKeyDeletion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelKeyDeletionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelKeyDeletionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Limit: The encryption algorithm in the request parameters must match the key type. 
     * The following table describes the mapping between encryption algorithms and key types.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>SM2PKE</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the encryption algorithm <code>RSAES_OAEP_SHA_256</code> are used to decrypt the data <code>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of CertificatePrivateKeyDecrypt  CertificatePrivateKeyDecryptRequest
     * @return CertificatePrivateKeyDecryptResponse
     */
    @Override
    public CompletableFuture<CertificatePrivateKeyDecryptResponse> certificatePrivateKeyDecrypt(CertificatePrivateKeyDecryptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CertificatePrivateKeyDecrypt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CertificatePrivateKeyDecryptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CertificatePrivateKeyDecryptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  </p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>ECDSA_SHA_256</td>
     * <td>EC_P256</td>
     * </tr>
     * <tr>
     * <td>SM2DSA</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the signature algorithm <code>ECDSA_SHA_256</code> are used to generate a signature for the raw data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of CertificatePrivateKeySign  CertificatePrivateKeySignRequest
     * @return CertificatePrivateKeySignResponse
     */
    @Override
    public CompletableFuture<CertificatePrivateKeySignResponse> certificatePrivateKeySign(CertificatePrivateKeySignRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CertificatePrivateKeySign").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CertificatePrivateKeySignResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CertificatePrivateKeySignResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Limit: The encryption algorithm in the request parameters must match the key type. 
     * The following table describes the mapping between encryption algorithms and key types.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>SM2PKE</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the encryption algorithm <code>RSAES_OAEP_SHA_256</code> are used to encrypt the data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of CertificatePublicKeyEncrypt  CertificatePublicKeyEncryptRequest
     * @return CertificatePublicKeyEncryptResponse
     */
    @Override
    public CompletableFuture<CertificatePublicKeyEncryptResponse> certificatePublicKeyEncrypt(CertificatePublicKeyEncryptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CertificatePublicKeyEncrypt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CertificatePublicKeyEncryptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CertificatePublicKeyEncryptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The signature algorithm in the request parameters must match the key type. The following table describes the mapping between signature algorithms and key types.  </p>
     * <table>
     * <thead>
     * <tr>
     * <th>Algorithm</th>
     * <th>Key Spec</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_PKCS1_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>RSA_PSS_SHA_256</td>
     * <td>RSA_2048</td>
     * </tr>
     * <tr>
     * <td>ECDSA_SHA_256</td>
     * <td>EC_P256</td>
     * </tr>
     * <tr>
     * <td>SM2DSA</td>
     * <td>EC_SM2</td>
     * </tr>
     * <tr>
     * <td>In this example, the certificate whose ID is <code>12345678-1234-1234-1234-12345678****</code> and the signature algorithm <code>ECDSA_SHA_256</code> are used to verify the digital signature <code>ZOyIygCyaOW6Gj****MlNKiuyjfzw=</code> of the raw data <code>VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wcyBvdmVyIHRoZSBsYXp5IGRvZy4=</code>.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of CertificatePublicKeyVerify  CertificatePublicKeyVerifyRequest
     * @return CertificatePublicKeyVerifyResponse
     */
    @Override
    public CompletableFuture<CertificatePublicKeyVerifyResponse> certificatePublicKeyVerify(CertificatePublicKeyVerifyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CertificatePublicKeyVerify").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CertificatePublicKeyVerifyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CertificatePublicKeyVerifyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <p>You can enable only instances of the software key management type. You cannot enable instances of the hardware key management type.</p>
     * 
     * @param request the request parameters of ConnectKmsInstance  ConnectKmsInstanceRequest
     * @return ConnectKmsInstanceResponse
     */
    @Override
    public CompletableFuture<ConnectKmsInstanceResponse> connectKmsInstance(ConnectKmsInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConnectKmsInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConnectKmsInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConnectKmsInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Each alias can be bound to only one CMK at a time.</p>
     * <ul>
     * <li>The aliases of CMKs in the same region must be unique.
     * In this topic, an alias named <code>alias/example</code> is created for a CMK named <code>7906979c-8e06-46a2-be2d-68e3ccbc****</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAlias  CreateAliasRequest
     * @return CreateAliasResponse
     */
    @Override
    public CompletableFuture<CreateAliasResponse> createAlias(CreateAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAlias").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based AAP:
     * 1.Create a network access rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access KMS. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind network access rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. This topic describes how to create an AAP.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * @param request the request parameters of CreateApplicationAccessPoint  CreateApplicationAccessPointRequest
     * @return CreateApplicationAccessPointResponse
     */
    @Override
    public CompletableFuture<CreateApplicationAccessPointResponse> createApplicationAccessPoint(CreateApplicationAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateApplicationAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApplicationAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApplicationAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To create a certificate, you must specify the type of the asymmetric key. Certificates Manager generates a private key and returns a certificate signing request (CSR). Submit the CSR in the Privacy Enhanced Mail (PEM) format to a certificate authority (CA) to obtain the formal certificate and certificate chain. Then, call the <a href="https://help.aliyun.com/document_detail/212136.html">UploadCertificate</a> operation to import the certificate into Certificates Manager.
     * In this example, a certificate is created and the CSR is obtained.</p>
     * 
     * @param request the request parameters of CreateCertificate  CreateCertificateRequest
     * @return CreateCertificateResponse
     */
    @Override
    public CompletableFuture<CreateCertificateResponse> createCertificate(CreateCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP.</p>
     * <h3>Precautions</h3>
     * <p>A client key has a validity period. After a client key expires, applications into which the client key is integrated cannot access the required KMS instance. You must replace the client key before the client key expires. We recommend that you delete the expired client key in KMS after the new client key is used.</p>
     * 
     * @param request the request parameters of CreateClientKey  CreateClientKeyRequest
     * @return CreateClientKeyResponse
     */
    @Override
    public CompletableFuture<CreateClientKeyResponse> createClientKey(CreateClientKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateClientKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClientKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClientKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>KMS supports common symmetric keys and asymmetric keys. For more information, see <a href="https://help.aliyun.com/document_detail/480161.html">Key types and specifications</a>.</p>
     * 
     * @param request the request parameters of CreateKey  CreateKeyRequest
     * @return CreateKeyResponse
     */
    @Override
    public CompletableFuture<CreateKeyResponse> createKey(CreateKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can create a version only for an asymmetric CMK that is in the Enabled state. You can call the <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> operation to create an asymmetric CMK and the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the status of the CMK. The status is specified by the KeyState parameter.</p>
     * <ul>
     * <li>The minimum interval for creating a version of the same CMK is seven days. You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the time when the last version of a CMK was created. The time is specified by the LastRotationDate parameter.</li>
     * <li>If a CMK is in a private key store, you cannot create a version for the CMK.</li>
     * <li>You can create a maximum of 50 versions for a CMK in the same region.
     * You can create a version for the CMK whose ID is <code>0b30658a-ed1a-4922-b8f7-a673ca9c****</code> by using the parameter settings provided in this topic.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateKeyVersion  CreateKeyVersionRequest
     * @return CreateKeyVersionResponse
     */
    @Override
    public CompletableFuture<CreateKeyVersionResponse> createKeyVersion(CreateKeyVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateKeyVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKeyVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKeyVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a KMS instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets. For more information, see <a href="https://help.aliyun.com/document_detail/2539454.html">CreatePolicy</a>.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * @param request the request parameters of CreateNetworkRule  CreateNetworkRuleRequest
     * @return CreateNetworkRuleResponse
     */
    @Override
    public CompletableFuture<CreateNetworkRuleResponse> createNetworkRule(CreateNetworkRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetworkRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNetworkRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNetworkRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>To perform cryptographic operations and retrieve secret values, self-managed applications must use a client key to access a Key Management Service (KMS) instance. The following process shows how to create a client key-based application access point (AAP):
     * 1.Create an access control rule: You can configure the private IP addresses or private CIDR blocks that are allowed to access a KMS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2539407.html">CreateNetworkRule</a>.
     * 2.Create a permission policy: You can configure the keys and secrets that are allowed to access and bind access control rules to the keys and secrets.
     * 3.Create an AAP: You can configure an authentication method and bind a permission policy to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539467.html">CreateApplicationAccessPoint</a>.
     * 4.Create a client key: You can configure the encryption password and validity period of a client key and bind the client key to an AAP. For more information, see <a href="https://help.aliyun.com/document_detail/2539509.html">CreateClientKey</a>.</p>
     * 
     * @param request the request parameters of CreatePolicy  CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    @Override
    public CompletableFuture<CreatePolicyResponse> createPolicy(CreatePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The name of the secret.
     * The value must be 1 to 64 characters in length and can contain letters, digits, underscores (_), forward slashes (/), plus signs (+), equal signs (=), periods (.), hyphens (-), and at signs (@). The following list describes the name requirements for different types of secrets:</p>
     * <ul>
     * <li>If the SecretType parameter is set to Generic or Rds, the name cannot start with <code>acs/</code>.</li>
     * <li>If the SecretType parameter is set to RAMCredentials, set the SecretName parameter to <code>$Auto</code>. In this case, KMS automatically generates a secret name that starts with <code>acs/ram/user/</code>. The name includes the display name of RAM user.</li>
     * <li>If the SecretType parameter is set to ECS, the name must start with <code>acs/ecs/</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecret  CreateSecretRequest
     * @return CreateSecretResponse
     */
    @Override
    public CompletableFuture<CreateSecretResponse> createSecret(CreateSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of Decrypt  DecryptRequest
     * @return DecryptResponse
     */
    @Override
    public CompletableFuture<DecryptResponse> decrypt(DecryptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Decrypt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DecryptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DecryptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAlias  DeleteAliasRequest
     * @return DeleteAliasResponse
     */
    @Override
    public CompletableFuture<DeleteAliasResponse> deleteAlias(DeleteAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAlias").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you delete an AAP, make sure that the AAP is no longer in use. If you delete an AAP that is in use, applications that use the AAP cannot access Key Management Service (KMS). Exercise caution when you delete an AAP.</p>
     * 
     * @param request the request parameters of DeleteApplicationAccessPoint  DeleteApplicationAccessPointRequest
     * @return DeleteApplicationAccessPointResponse
     */
    @Override
    public CompletableFuture<DeleteApplicationAccessPointResponse> deleteApplicationAccessPoint(DeleteApplicationAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApplicationAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApplicationAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApplicationAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After the certificate and its private key and certificate chain are deleted, they cannot be restored. Proceed with caution.
     * In this example, the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> and its private key and certificate chain are deleted.</p>
     * 
     * @param request the request parameters of DeleteCertificate  DeleteCertificateRequest
     * @return DeleteCertificateResponse
     */
    @Override
    public CompletableFuture<DeleteCertificateResponse> deleteCertificate(DeleteCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a client key, make sure that the client key is no longer in use. If you delete a client key that is in use, applications that use the client key cannot access Key Management Service (KMS). Exercise caution when you delete a client key.</p>
     * 
     * @param request the request parameters of DeleteClientKey  DeleteClientKeyRequest
     * @return DeleteClientKeyResponse
     */
    @Override
    public CompletableFuture<DeleteClientKeyResponse> deleteClientKey(DeleteClientKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteClientKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteClientKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteClientKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation does not delete the CMK that is created by using the key material.
     * If the CMK is in the PendingDeletion state, the state of the CMK and the scheduled deletion time do not change after you call this operation. If the CMK is not in the PendingDeletion state, the state of the CMK changes to PendingImport after you call this operation.
     * After you delete the key material, you can upload only the same key material into the CMK.</p>
     * 
     * @param request the request parameters of DeleteKeyMaterial  DeleteKeyMaterialRequest
     * @return DeleteKeyMaterialResponse
     */
    @Override
    public CompletableFuture<DeleteKeyMaterialResponse> deleteKeyMaterial(DeleteKeyMaterialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteKeyMaterial").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteKeyMaterialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteKeyMaterialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a network access rule, make sure that the network access rule is not bound to permission policies. Otherwise, related applications cannot access Key Management Service (KMS).</p>
     * 
     * @param request the request parameters of DeleteNetworkRule  DeleteNetworkRuleRequest
     * @return DeleteNetworkRuleResponse
     */
    @Override
    public CompletableFuture<DeleteNetworkRuleResponse> deleteNetworkRule(DeleteNetworkRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetworkRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNetworkRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNetworkRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a permission policy, make sure that the permission policy is not associated with application access points (AAPs). Otherwise, related applications cannot access Key Management Service (KMS).</p>
     * 
     * @param request the request parameters of DeletePolicy  DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    @Override
    public CompletableFuture<DeletePolicyResponse> deletePolicy(DeletePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you call this operation without specifying a recovery period, the deleted secret can be recovered within 30 days.
     * If you specify a recovery period, the deleted secret can be recovered within the recovery period. You can also forcibly delete a secret. A forcibly deleted secret cannot be recovered.</p>
     * 
     * @param request the request parameters of DeleteSecret  DeleteSecretRequest
     * @return DeleteSecretResponse
     */
    @Override
    public CompletableFuture<DeleteSecretResponse> deleteSecret(DeleteSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccountKmsStatus  DescribeAccountKmsStatusRequest
     * @return DescribeAccountKmsStatusResponse
     */
    @Override
    public CompletableFuture<DescribeAccountKmsStatusResponse> describeAccountKmsStatus(DescribeAccountKmsStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccountKmsStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccountKmsStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccountKmsStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeApplicationAccessPoint  DescribeApplicationAccessPointRequest
     * @return DescribeApplicationAccessPointResponse
     */
    @Override
    public CompletableFuture<DescribeApplicationAccessPointResponse> describeApplicationAccessPoint(DescribeApplicationAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApplicationAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApplicationAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApplicationAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the information about the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is queried. The certificate information includes the certificate ID, creation time, certificate issuer, validity period, serial number, and signature algorithm.</p>
     * 
     * @param request the request parameters of DescribeCertificate  DescribeCertificateRequest
     * @return DescribeCertificateResponse
     */
    @Override
    public CompletableFuture<DescribeCertificateResponse> describeCertificate(DescribeCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the information about the CMK <code>05754286-3ba2-4fa6-8d41-4323aca6****</code> by using parameter settings provided in this topic. The information includes the creator, creation time, status, and deletion protection status of the CMK.</p>
     * 
     * @param request the request parameters of DescribeKey  DescribeKeyRequest
     * @return DescribeKeyResponse
     */
    @Override
    public CompletableFuture<DescribeKeyResponse> describeKey(DescribeKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the information about a version of the CMK <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The ID of the CMK version is <code>2ab1a983-7072-4bbc-a582-584b5bd8****</code>. The response shows that the creation time of the CMK version is <code>2016-03-25T10:42:40Z</code>.</p>
     * 
     * @param request the request parameters of DescribeKeyVersion  DescribeKeyVersionRequest
     * @return DescribeKeyVersionResponse
     */
    @Override
    public CompletableFuture<DescribeKeyVersionResponse> describeKeyVersion(DescribeKeyVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeKeyVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeKeyVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeKeyVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeNetworkRule  DescribeNetworkRuleRequest
     * @return DescribeNetworkRuleResponse
     */
    @Override
    public CompletableFuture<DescribeNetworkRuleResponse> describeNetworkRule(DescribeNetworkRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNetworkRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNetworkRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePolicy  DescribePolicyRequest
     * @return DescribePolicyResponse
     */
    @Override
    public CompletableFuture<DescribePolicyResponse> describePolicy(DescribePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Kms%5C&api=DescribeRegions%5C&type=RPC%5C&version=2016-01-20">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation returns the metadata of a secret. This operation does not return the secret value.
     * In this example, the metadata of the secret named <code>secret001</code> is queried.</p>
     * 
     * @param request the request parameters of DescribeSecret  DescribeSecretRequest
     * @return DescribeSecretResponse
     */
    @Override
    public CompletableFuture<DescribeSecretResponse> describeSecret(DescribeSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If a customer master key (CMK) is disabled, the ciphertext encrypted by using this CMK cannot be decrypted until you re-enable it. You can call the <a href="https://help.aliyun.com/document_detail/35150.html">EnableKey</a> operation to enable the CMK.
     * In this example, the CMK whose ID is <code>1234abcd-12ab-34cd-56ef-12345678****</code> is disabled.</p>
     * 
     * @param request the request parameters of DisableKey  DisableKeyRequest
     * @return DisableKeyResponse
     */
    @Override
    public CompletableFuture<DisableKeyResponse> disableKey(DisableKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableKey  EnableKeyRequest
     * @return EnableKeyResponse
     */
    @Override
    public CompletableFuture<EnableKeyResponse> enableKey(EnableKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  KMS uses the primary version of a specified CMK to encrypt data.</p>
     * <ul>
     * <li>Only data of 6 KB or less can be encrypted. For example, you can call this operation to encrypt RSA keys, database access passwords, or other sensitive information.</li>
     * <li>When you migrate encrypted data across regions, you can call this operation in the destination region to encrypt the plaintext of the data key that is used to encrypt the migrated data in the source region. This way, the ciphertext of the data key is generated in the destination region. You can also call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the data key.</li>
     * </ul>
     * 
     * @param request the request parameters of Encrypt  EncryptRequest
     * @return EncryptResponse
     */
    @Override
    public CompletableFuture<EncryptResponse> encrypt(EncryptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Encrypt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EncryptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EncryptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/134043.html">GenerateDataKeyWithoutPlaintext</a> operation to generate a data key, which is encrypted by a CMK. If you want to distribute the data key to other regions or cryptographic modules, you can call the ExportDataKey operation to use a public key to encrypt the data key.
     * Then, you can import the ciphertext of the data key to the cryptographic module where the private key is stored. This way, the data key is securely distributed from KMS to the cryptographic module. After the data key is imported to the cryptographic module, you can use it to encrypt or decrypt data.</p>
     * 
     * @param request the request parameters of ExportDataKey  ExportDataKeyRequest
     * @return ExportDataKeyResponse
     */
    @Override
    public CompletableFuture<ExportDataKeyResponse> exportDataKey(ExportDataKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportDataKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportDataKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportDataKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you perform the following steps to import your data key to a cryptographic module:</p>
     * <ul>
     * <li>Call the GenerateAndExportDataKey operation to generate a data key and obtain both the ciphertext of the data key encrypted by using the CMK and that encrypted by using the public key.</li>
     * <li>Store the ciphertext of the data key encrypted by using the CMK in KMS Secrets Manager or in a storage service such as ApsaraDB. This ciphertext is used for backup and restoration.</li>
     * <li>Import the ciphertext of the data key encrypted by using the public key to the cryptographic module where the private key is stored. Then, you can use the data key to encrypt or decrypt data.<blockquote>
     * <p> The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the data keys randomly generated by calling this operation. You must take note of the data keys and the returned ciphertext.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GenerateAndExportDataKey  GenerateAndExportDataKeyRequest
     * @return GenerateAndExportDataKeyResponse
     */
    @Override
    public CompletableFuture<GenerateAndExportDataKeyResponse> generateAndExportDataKey(GenerateAndExportDataKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateAndExportDataKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateAndExportDataKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateAndExportDataKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a random data key, encrypts the data key by using the specified customer master key (CMK), and returns the plaintext and ciphertext of the data key. You can use the plaintext of the data key to locally encrypt your data without using KMS and store the encrypted data together with the ciphertext of the data key. You can obtain the plaintext of the data key from the Plaintext parameter in the response and the ciphertext of the data key from the CiphertextBlob parameter in the response.
     * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key. Therefore, you need to store the ciphertext of the data key in persistent storage.
     * We recommend that you locally encrypt data by performing the following steps:
     * 1\. Call the GenerateDataKey operation.
     * 2\. Use the plaintext of the data key that you obtain to locally encrypt data without using KMS. Then, delete the plaintext of the data key from the memory.
     * 3\. Store the encrypted data together with the ciphertext of the data key that you obtain.
     * We recommend that you locally decrypt data by performing the following steps:</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the locally stored ciphertext of the data key. The plaintext of data key is then returned.</li>
     * <li>Use the plaintext of the data key to locally decrypt data and then delete the plaintext of the data key from the memory.
     * In this example, a random data key is generated for the CMK whose ID is <code>7906979c-8e06-46a2-be2d-68e3ccbc****</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateDataKey  GenerateDataKeyRequest
     * @return GenerateDataKeyResponse
     */
    @Override
    public CompletableFuture<GenerateDataKeyResponse> generateDataKey(GenerateDataKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateDataKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateDataKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateDataKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation creates a random data key, encrypts the data key by using a specific symmetric CMK, and returns the ciphertext of the data key. This operation serves the same purpose as the <a href="https://help.aliyun.com/document_detail/28948.html">GenerateDataKey</a> operation. The only difference is that this operation does not return the plaintext of the data key.
     * The CMK that you specify in the request of this operation is only used to encrypt the data key and is not involved in the generation of the data key. KMS does not record or store the generated data key.</p>
     * <blockquote>
     * <ul>
     * <li>This operation applies to the scenario when you do not need to use the data key to immediately encrypt data. Before you can use the data key to encrypt data, you must call the <a href="https://help.aliyun.com/document_detail/28950.html">Decrypt</a> operation to decrypt the ciphertext of the data key.</li>
     * <li>This operation is also suitable for a distributed system with different trust levels. For example, a system stores data in different partitions based on a preset trust policy. A module creates different partitions and generates different data keys for each partition in advance. This module is not involved in data production and consumption after it completes initialization of the control plane. This module is the key provider. When producing and consuming data, modules on the control plane obtain the ciphertext of the data key for a partition first. After decrypting the ciphertext of the data key, modules on the control plane use the plaintext of the data key to encrypt or decrypt data and then clear the plaintext of the data key from the memory. In such a system, the key provider does not need to obtain the plaintext of the data key. It only needs to have the permissions to call the GenerateDataKeyWithoutPlaintext operation. The data producers or consumers do not need to generate new data keys. They only need to have the permissions to call the Decrypt operation.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of GenerateDataKeyWithoutPlaintext  GenerateDataKeyWithoutPlaintextRequest
     * @return GenerateDataKeyWithoutPlaintextResponse
     */
    @Override
    public CompletableFuture<GenerateDataKeyWithoutPlaintextResponse> generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GenerateDataKeyWithoutPlaintext").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateDataKeyWithoutPlaintextResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateDataKeyWithoutPlaintextResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is queried. The certificate, certificate chain, certificate ID, and certificate signing request (CSR) are returned.</p>
     * 
     * @param request the request parameters of GetCertificate  GetCertificateRequest
     * @return GetCertificateResponse
     */
    @Override
    public CompletableFuture<GetCertificateResponse> getCertificate(GetCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetClientKey  GetClientKeyRequest
     * @return GetClientKeyResponse
     */
    @Override
    public CompletableFuture<GetClientKeyResponse> getClientKey(GetClientKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetClientKey").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetClientKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetClientKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetKeyPolicy  GetKeyPolicyRequest
     * @return GetKeyPolicyResponse
     */
    @Override
    public CompletableFuture<GetKeyPolicyResponse> getKeyPolicy(GetKeyPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetKeyPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKeyPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKeyPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetKmsInstance  GetKmsInstanceRequest
     * @return GetKmsInstanceResponse
     */
    @Override
    public CompletableFuture<GetKmsInstanceResponse> getKmsInstance(GetKmsInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetKmsInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKmsInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKmsInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The returned parameters can be used to call the <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/importkeymaterial">ImportKeyMaterial</a> operation.</p>
     * <ul>
     * <li>You can import key material only for CMKs whose Origin parameter is set to EXTERNAL.</li>
     * <li>The public key and token that are returned by the GetParametersForImport operation must be used together. The public key and token can be used to import key material only for the CMK that is specified when you call the operation.</li>
     * <li>The public key and token that are returned vary each time you call the GetParametersForImport operation.</li>
     * <li>You must specify the type of the public key and the encryption algorithm that are used to encrypt key material. The following table lists the types of public keys and the encryption algorithms allowed for each type.   <table>
     * <thead>
     * <tr>
     * <th>Public key type</th>
     * <th>Encryption algorithm</th>
     * <th>Description</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RSA_2048</td>
     * <td>RSAES_PKCS1_V1_5</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_1</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RSAES_OAEP_SHA_256</td>
     * <td>CMKs of all regions and all protection levels are supported.</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Dedicated Key Management Service (KMS) does not support RSAES_OAEP_SHA_1.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>EC_SM2</td>
     * <td>SM2PKE</td>
     * <td>CMKs whose ProtectionLevel is set to HSM are supported. The SM2 algorithm is developed and approved by the State Cryptography Administration of China. The SM2 algorithm can be used only to import key material for a CMK whose ProtectionLevel is set to HSM. You can use the SM2 algorithm only when you enable the Managed HSM feature for KMS in the Chinese mainland. For more information, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/managed-hsm-overview">Overview of Managed HSM</a>.</td>
     * </tr>
     * <tr>
     * <td>For more information, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/import-key-material">Import key material</a>. This topic provides an example on how to query the parameters that are used to import key material for a CMK. The ID of the CMK is <code>1234abcd-12ab-34cd-56ef-12345678****</code>, the encryption algorithm is <code>RSAES_PKCS1_V1_5</code>, and the public key is of the <code>RSA_2048</code> type. The parameters that are returned include the ID of the CMK, the public key that is used to encrypt the key material, the token that is used to import the key material, and the time when the token expires.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GetParametersForImport  GetParametersForImportRequest
     * @return GetParametersForImportResponse
     */
    @Override
    public CompletableFuture<GetParametersForImportResponse> getParametersForImport(GetParametersForImportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetParametersForImport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetParametersForImportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetParametersForImportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetPublicKey  GetPublicKeyRequest
     * @return GetPublicKeyResponse
     */
    @Override
    public CompletableFuture<GetPublicKeyResponse> getPublicKey(GetPublicKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPublicKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPublicKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPublicKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRandomPassword  GetRandomPasswordRequest
     * @return GetRandomPasswordResponse
     */
    @Override
    public CompletableFuture<GetRandomPasswordResponse> getRandomPassword(GetRandomPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRandomPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRandomPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRandomPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSecretPolicy  GetSecretPolicyRequest
     * @return GetSecretPolicyResponse
     */
    @Override
    public CompletableFuture<GetSecretPolicyResponse> getSecretPolicy(GetSecretPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSecretPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSecretPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSecretPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If you do not specify a version number or stage label, Secrets Manager returns the secret value of the version marked with ACSCurrent.
     * If a customer master key (CMK) is specified to encrypt the secret value, you must also have the <code>kms:Decrypt</code> permission on the CMK to call the GetSecretValue operation.
     * In this example, the value of the secret named <code>secret001</code> is obtained. The secret value is returned in the <code>SecretData</code> parameter. The secret value is <code>testdata1</code>.</p>
     * 
     * @param request the request parameters of GetSecretValue  GetSecretValueRequest
     * @return GetSecretValueResponse
     */
    @Override
    public CompletableFuture<GetSecretValueResponse> getSecretValue(GetSecretValueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSecretValue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSecretValueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSecretValueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Call <a href="https://help.aliyun.com/document_detail/28947.html">CreateKey</a> when creating a CMK, you can select its key material source as external. <strong>Origin</strong> set to <strong>EXTERNAL</strong>. This API is used to import the key material into the CMK.</p>
     * <ul>
     * <li>To view the CMK <strong>Origin</strong>, see <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a>.</li>
     * <li>Before importing key material, you need to call the <a href="https://help.aliyun.com/document_detail/68621.html">GetParametersForImport</a> obtain the parameters required to import the key material, including the public key and import token.<blockquote>
     * <ul>
     * <li>The key type of the pair is <strong>Aliyun_AES_256</strong> the key material must be 256 bits. The key type must be <strong>Aliyun_SM4</strong> the CMK and key material must be 128 bits.</li>
     * <li>You can set the expiration time for the key material, or you can set it to never expire.</li>
     * <li>You can reimport the key material and reset the expiration time for the specified CMK at any time, but the same key material must be imported.</li>
     * <li>After the imported key material expires or is deleted, the specified CMK is unavailable until the same key material are imported again.</li>
     * <li>A Key material can be imported to multiple cmks, but any Data or Data Key encrypted by one CMK cannot be decrypted by another CMK.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ImportKeyMaterial  ImportKeyMaterialRequest
     * @return ImportKeyMaterialResponse
     */
    @Override
    public CompletableFuture<ImportKeyMaterialResponse> importKeyMaterial(ImportKeyMaterialRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportKeyMaterial").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportKeyMaterialResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportKeyMaterialResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAliases  ListAliasesRequest
     * @return ListAliasesResponse
     */
    @Override
    public CompletableFuture<ListAliasesResponse> listAliases(ListAliasesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAliases").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAliasesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAliasesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAliasesByKeyId  ListAliasesByKeyIdRequest
     * @return ListAliasesByKeyIdResponse
     */
    @Override
    public CompletableFuture<ListAliasesByKeyIdResponse> listAliasesByKeyId(ListAliasesByKeyIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAliasesByKeyId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAliasesByKeyIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAliasesByKeyIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListApplicationAccessPoints  ListApplicationAccessPointsRequest
     * @return ListApplicationAccessPointsResponse
     */
    @Override
    public CompletableFuture<ListApplicationAccessPointsResponse> listApplicationAccessPoints(ListApplicationAccessPointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApplicationAccessPoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationAccessPointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationAccessPointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClientKeys  ListClientKeysRequest
     * @return ListClientKeysResponse
     */
    @Override
    public CompletableFuture<ListClientKeysResponse> listClientKeys(ListClientKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListClientKeys").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClientKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClientKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKeyVersions  ListKeyVersionsRequest
     * @return ListKeyVersionsResponse
     */
    @Override
    public CompletableFuture<ListKeyVersionsResponse> listKeyVersions(ListKeyVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListKeyVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKeyVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKeyVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKeys  ListKeysRequest
     * @return ListKeysResponse
     */
    @Override
    public CompletableFuture<ListKeysResponse> listKeys(ListKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKmsInstances  ListKmsInstancesRequest
     * @return ListKmsInstancesResponse
     */
    @Override
    public CompletableFuture<ListKmsInstancesResponse> listKmsInstances(ListKmsInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListKmsInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKmsInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKmsInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNetworkRules  ListNetworkRulesRequest
     * @return ListNetworkRulesResponse
     */
    @Override
    public CompletableFuture<ListNetworkRulesResponse> listNetworkRules(ListNetworkRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNetworkRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNetworkRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNetworkRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPolicies  ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    @Override
    public CompletableFuture<ListPoliciesResponse> listPolicies(ListPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Request format: KeyId=&quot;string&quot;</p>
     * 
     * @param request the request parameters of ListResourceTags  ListResourceTagsRequest
     * @return ListResourceTagsResponse
     */
    @Override
    public CompletableFuture<ListResourceTagsResponse> listResourceTags(ListResourceTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListResourceTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListResourceTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListResourceTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The secret value is not included in the returned version information. By default, deprecated secret versions are not returned.</p>
     * 
     * @param request the request parameters of ListSecretVersionIds  ListSecretVersionIdsRequest
     * @return ListSecretVersionIdsResponse
     */
    @Override
    public CompletableFuture<ListSecretVersionIdsResponse> listSecretVersionIds(ListSecretVersionIdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSecretVersionIds").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSecretVersionIdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSecretVersionIdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Specifies whether to return the resource tags of the secret. Valid values:</p>
     * <ul>
     * <li>true: returns the resource tags.</li>
     * <li>false: does not return the resource tags. This is the default value.</li>
     * </ul>
     * 
     * @param request the request parameters of ListSecrets  ListSecretsRequest
     * @return ListSecretsResponse
     */
    @Override
    public CompletableFuture<ListSecretsResponse> listSecrets(ListSecretsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSecrets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSecretsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSecretsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, note that:</p>
     * <ul>
     * <li>KMS is a paid service. For more information about the billing method, see <a href="https://www.alibabacloud.com/help/en/key-management-service/latest/billing-billing">Billing description</a>.</li>
     * <li>An Alibaba Cloud account can activate KMS only once.</li>
     * <li>Make sure that your Alibaba Cloud account has passed real-name authentication.</li>
     * </ul>
     * 
     * @param request the request parameters of OpenKmsService  OpenKmsServiceRequest
     * @return OpenKmsServiceResponse
     */
    @Override
    public CompletableFuture<OpenKmsServiceResponse> openKmsService(OpenKmsServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenKmsService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenKmsServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenKmsServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to store the secret values of new versions. It cannot be used to modify the secret value of an existing version.
     * By default, the newly stored secret value is marked with ACSCurrent, and the mark for the previous version of the secret value is changed from ACSCurrent to ACSPrevious. If you specify the VersionStage parameter, the newly stored secret value is marked with the stage label that you specify.
     * You must specify a version number when you call the operation. Secrets Manager performs operations based on the following rules:</p>
     * <ul>
     * <li>If the specified version number does not exist in the secret, Secrets Manager creates the version and stores the secret value.</li>
     * <li>If the specified version number already exists in the secret and the secret value of the existing version is the same as the secret value that you specify, Secrets Manager ignores the request and returns a success message. The request is idempotent.</li>
     * <li>If the specified version number already exists in the secret but the secret value of the existing version is different from the secret value that you specify, Secrets Manager rejects the request and returns a failure message.
     * Limits: This operation is available only for standard secrets.
     * In this example, the secret value of a new version is stored into the <code>secret001</code> secret. The <code>VersionId</code> parameter is set to <code>00000000000000000000000000000000203</code> as the new version, and the <code>SecretData</code> parameter is set to <code>importantdata</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of PutSecretValue  PutSecretValueRequest
     * @return PutSecretValueResponse
     */
    @Override
    public CompletableFuture<PutSecretValueResponse> putSecretValue(PutSecretValueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PutSecretValue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PutSecretValueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PutSecretValueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation in the following scenarios:</p>
     * <ul>
     * <li>After the CMK that was used to encrypt your data is rotated, you can call this operation to use the latest CMK version to re-encrypt the data. For more information about automatic key rotation, see <a href="https://help.aliyun.com/document_detail/134270.html">Configure automatic key rotation</a>.</li>
     * <li>The CMK that was used to encrypt your data remains unchanged, but EncryptionContext is changed. In this scenario, you can call this operation to re-encrypt the data.</li>
     * <li>You can call this operation to use a CMK in KMS to re-encrypt data or a data key that was previously encrypted by a different CMK.
     * To use the ReEncrypt operation, you must have two permissions:</li>
     * <li>kms:ReEncryptFrom on the source CMK</li>
     * <li>kms:ReEncryptTo on the destination CMK</li>
     * <li>For simplicity, you can specify kms:ReEncrypt\* to allow both of the preceding permissions.</li>
     * </ul>
     * 
     * @param request the request parameters of ReEncrypt  ReEncryptRequest
     * @return ReEncryptResponse
     */
    @Override
    public CompletableFuture<ReEncryptResponse> reEncrypt(ReEncryptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReEncrypt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReEncryptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReEncryptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ReleaseKmsInstance  ReleaseKmsInstanceRequest
     * @return ReleaseKmsInstanceResponse
     */
    @Override
    public CompletableFuture<ReleaseKmsInstanceResponse> releaseKmsInstance(ReleaseKmsInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseKmsInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseKmsInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseKmsInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can only use this operation to restore a deleted secret that is within its recovery period. If you set <strong>ForceDeleteWithoutRecovery</strong> to <strong>true</strong> when you delete the secret, you cannot restore it.</p>
     * 
     * @param request the request parameters of RestoreSecret  RestoreSecretRequest
     * @return RestoreSecretResponse
     */
    @Override
    public CompletableFuture<RestoreSecretResponse> restoreSecret(RestoreSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RestoreSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RestoreSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RestoreSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Limits:
     * • A secret of each Alibaba Cloud account can be rotated for a maximum of 50 times per hour.
     * • The RotateSecret operation is unavailable for standard secrets.
     * In this example, the <code>RdsSecret/Mysql5.4/MyCred</code> secret is manually rotated, and the version number of the secret is set to <code>000000123</code> after the secret is rotated.</p>
     * 
     * @param request the request parameters of RotateSecret  RotateSecretRequest
     * @return RotateSecretResponse
     */
    @Override
    public CompletableFuture<RotateSecretResponse> rotateSecret(RotateSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RotateSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RotateSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RotateSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>During the scheduled period, the CMK is in the PendingDeletion state and cannot be used to encrypt data, decrypt data, or generate data keys.
     * After a CMK is deleted, it cannot be recovered. Data that is encrypted and data keys that are generated by using the CMK cannot be decrypted. To prevent accidental deletion of CMKs, Key Management Service (KMS) allows you to only schedule key deletion tasks. You cannot directly delete CMKs. If you want to delete a CMK, call the <a href="https://help.aliyun.com/document_detail/35151.html">DisableKey</a> operation to disable the CMK.
     * When you call this operation, you must specify a scheduled period between 7 days to 366 days. The scheduled period starts from the time when you submit the request. You can call the <a href="https://help.aliyun.com/document_detail/44197.html">CancelKeyDeletion</a> operation to cancel the key deletion task before the scheduled period ends.</p>
     * 
     * @param request the request parameters of ScheduleKeyDeletion  ScheduleKeyDeletionRequest
     * @return ScheduleKeyDeletionResponse
     */
    @Override
    public CompletableFuture<ScheduleKeyDeletionResponse> scheduleKeyDeletion(ScheduleKeyDeletionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ScheduleKeyDeletion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ScheduleKeyDeletionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ScheduleKeyDeletionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  After you enable deletion protection for a CMK, you cannot delete the CMK. If you want to delete the CMK, you must first disable deletion protection for the CMK.</p>
     * <ul>
     * <li>Before you can call the SetDeletionProtection operation, make sure that the required CMK is not in the Pending Deletion state. You can call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation to query the CMK status, which is specified by the KeyState parameter.
     * You can enable deletion protection for the CMK whose Alibaba Cloud Resource Name (ARN) is <code>acs:kms:cn-hangzhou:123213123****:key/0225f411-b21d-46d1-be5b-93931c82****</code> by using parameter settings provided in this topic. The CMK ARN is specified by the ProtectedResourceArn parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of SetDeletionProtection  SetDeletionProtectionRequest
     * @return SetDeletionProtectionResponse
     */
    @Override
    public CompletableFuture<SetDeletionProtectionResponse> setDeletionProtection(SetDeletionProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetDeletionProtection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetDeletionProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetDeletionProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetKeyPolicy  SetKeyPolicyRequest
     * @return SetKeyPolicyResponse
     */
    @Override
    public CompletableFuture<SetKeyPolicyResponse> setKeyPolicy(SetKeyPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetKeyPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetKeyPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetKeyPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetSecretPolicy  SetSecretPolicyRequest
     * @return SetSecretPolicyResponse
     */
    @Override
    public CompletableFuture<SetSecretPolicyResponse> setSecretPolicy(SetSecretPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetSecretPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetSecretPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetSecretPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can add up to 10 tags to a CMK, secret, or certificate.
     * In this example, the tags <code>[{&quot;TagKey&quot;:&quot;S1key1&quot;,&quot;TagValue&quot;:&quot;S1val1&quot;},{&quot;TagKey&quot;:&quot;S1key2&quot;,&quot;TagValue&quot;:&quot;S2val2&quot;}]</code> are added to the CMK whose ID is <code>08c33a6f-4e0a-4a1b-a3fa-7ddf****</code>.</p>
     * 
     * @param request the request parameters of TagResource  TagResourceRequest
     * @return TagResourceResponse
     */
    @Override
    public CompletableFuture<TagResourceResponse> tagResource(TagResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can add multiple tags to multiple keys or multiple secrets at a time.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>One or more tag keys. Separate multiple tag keys with commas (,).
     * You need to specify only the tag keys, not the tag values.
     * Each tag key must be 1 to 128 bytes in length.</p>
     * 
     * @param request the request parameters of UntagResource  UntagResourceRequest
     * @return UntagResourceResponse
     */
    @Override
    public CompletableFuture<UntagResourceResponse> untagResource(UntagResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can remove multiple tags from multiple keys or multiple secrets at a time. You cannot remove tags that start with aliyun or acs:.
     * If you enter multiple tag keys in the request parameters and only some of the tag keys are associated with resources, the operation can be called and the tags whose keys are associated with resources are removed from the resources.</p>
     * 
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAlias  UpdateAliasRequest
     * @return UpdateAliasResponse
     */
    @Override
    public CompletableFuture<UpdateAliasResponse> updateAlias(UpdateAliasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAlias").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAliasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAliasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The update takes effect immediately after an AAP information is updated. Exercise caution when you perform this operation. You can update the description of an AAP and the permission policies that are associated with the AAP. You cannot update the name of the AAP.</p>
     * 
     * @param request the request parameters of UpdateApplicationAccessPoint  UpdateApplicationAccessPointRequest
     * @return UpdateApplicationAccessPointResponse
     */
    @Override
    public CompletableFuture<UpdateApplicationAccessPointResponse> updateApplicationAccessPoint(UpdateApplicationAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateApplicationAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the status of the certificate whose ID is <code>9a28de48-8d8b-484d-a766-dec4****</code> is updated to INACTIVE.</p>
     * 
     * @param request the request parameters of UpdateCertificateStatus  UpdateCertificateStatusRequest
     * @return UpdateCertificateStatusResponse
     */
    @Override
    public CompletableFuture<UpdateCertificateStatusResponse> updateCertificateStatus(UpdateCertificateStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCertificateStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCertificateStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCertificateStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation replaces the description of a customer master key (CMK) with the description that you specify. The original description of the CMK is specified by the Description parameter when you call the <a href="https://help.aliyun.com/document_detail/28952.html">DescribeKey</a> operation. You can call this operation to add, modify, or delete the description of a CMK.</p>
     * 
     * @param request the request parameters of UpdateKeyDescription  UpdateKeyDescriptionRequest
     * @return UpdateKeyDescriptionResponse
     */
    @Override
    public CompletableFuture<UpdateKeyDescriptionResponse> updateKeyDescription(UpdateKeyDescriptionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateKeyDescription").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKeyDescriptionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKeyDescriptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If your own applications are deployed in multiple VPCs in the same region, you can associate the VPCs except the VPC in which the KMS instance resides with the KMS instance. This topic describes how to configure the VPCs.
     * The VPCs can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. After the configuration is complete, the applications in these VPCs can access the KMS instance.</p>
     * <blockquote>
     * <p>If the VPCs belong to different Alibaba Cloud accounts, you must first configure resource sharing to share the vSwitches of other Alibaba Cloud accounts with the Alibaba Cloud account to which the KMS instance belongs. For more information, see <a href="https://help.aliyun.com/document_detail/2393236.html">Access a KMS instance from multiple VPCs in the same region</a>.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateKmsInstanceBindVpc  UpdateKmsInstanceBindVpcRequest
     * @return UpdateKmsInstanceBindVpcResponse
     */
    @Override
    public CompletableFuture<UpdateKmsInstanceBindVpcResponse> updateKmsInstanceBindVpc(UpdateKmsInstanceBindVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateKmsInstanceBindVpc").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKmsInstanceBindVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKmsInstanceBindVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can update only private IP addresses and description of an access control rule. You cannot update the name and network type of an access control rule.</li>
     * <li>Updating an access control rule affects all permission policies that are bound to the access control rule. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateNetworkRule  UpdateNetworkRuleRequest
     * @return UpdateNetworkRuleResponse
     */
    @Override
    public CompletableFuture<UpdateNetworkRuleResponse> updateNetworkRule(UpdateNetworkRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNetworkRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNetworkRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNetworkRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can update the role-based access control (RBAC) permissions, accessible resources, access control rules, and description of a permission policy. You cannot update the name or scope of a permission policy.</li>
     * <li>Updating a permission policy affects all application access points (AAPs) that are bound to the permission policy. Exercise caution when you perform this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdatePolicy  UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    @Override
    public CompletableFuture<UpdatePolicyResponse> updatePolicy(UpdatePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When automatic key rotation is enabled, KMS automatically creates a key version after the preset rotation period arrives. In addition, KMS sets the new key version as the primary key version.
     * An automatic key rotation policy cannot be configured for the following keys:</p>
     * <ul>
     * <li>Asymmetric key</li>
     * <li>Service-managed key</li>
     * <li>Bring your own key (BYOK) that is imported into KMS</li>
     * <li>Key that is not in the <strong>Enabled</strong> state
     * In this example, automatic key rotation is enabled for a CMK whose ID is <code>1234abcd-12ab-34cd-56ef-12345678****</code>. The automatic rotation period is 30 days.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRotationPolicy  UpdateRotationPolicyRequest
     * @return UpdateRotationPolicyResponse
     */
    @Override
    public CompletableFuture<UpdateRotationPolicyResponse> updateRotationPolicy(UpdateRotationPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRotationPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRotationPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRotationPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, the metadata of the <code>secret001</code> secret is updated. The <code>Description</code> parameter is set to <code>datainfo</code>.</p>
     * 
     * @param request the request parameters of UpdateSecret  UpdateSecretRequest
     * @return UpdateSecretResponse
     */
    @Override
    public CompletableFuture<UpdateSecretResponse> updateSecret(UpdateSecretRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSecret").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSecretResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSecretResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After automatic rotation is enabled, Secrets Manager schedules the first automatic rotation by adding the preset rotation interval to the timestamp of the last rotation.
     * Limits: The UpdateSecretRotationPolicy operation cannot be used to update the rotation policy of generic secrets.
     * In this example, the rotation policy of the <code>RdsSecret/Mysql5.4/MyCred</code> secret is updated. The following settings are modified:</p>
     * <ul>
     * <li>The <code>EnableAutomaticRotation</code> parameter is set to <code>true</code>, which indicates that automatic rotation is enabled.</li>
     * <li>The <code>RotationInterval</code> parameter is set to <code>30d</code>, which indicates that the interval for automatic rotation is 30 days.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSecretRotationPolicy  UpdateSecretRotationPolicyRequest
     * @return UpdateSecretRotationPolicyResponse
     */
    @Override
    public CompletableFuture<UpdateSecretRotationPolicyResponse> updateSecretRotationPolicy(UpdateSecretRotationPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSecretRotationPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSecretRotationPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSecretRotationPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the stage label that marks a secret version.</p>
     * 
     * @param request the request parameters of UpdateSecretVersionStage  UpdateSecretVersionStageRequest
     * @return UpdateSecretVersionStageResponse
     */
    @Override
    public CompletableFuture<UpdateSecretVersionStageResponse> updateSecretVersionStage(UpdateSecretVersionStageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSecretVersionStage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSecretVersionStageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSecretVersionStageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>In this example, a certificate issued by a CA is imported into Certificates Manager. The ID of the certificate in Certificates Manager is <code>12345678-1234-1234-1234-12345678****</code>.</p>
     * 
     * @param request the request parameters of UploadCertificate  UploadCertificateRequest
     * @return UploadCertificateResponse
     */
    @Override
    public CompletableFuture<UploadCertificateResponse> uploadCertificate(UploadCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UploadCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UploadCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UploadCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
