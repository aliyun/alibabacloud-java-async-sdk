package com.aliyun.sdk.service.oss20190517.encryption.internal;

import com.aliyun.auth.credentials.provider.ICredentialProvider;
import com.aliyun.core.http.HttpClient;
import com.aliyun.core.utils.Validate;
import com.aliyun.sdk.gateway.oss.Configuration;
import com.aliyun.sdk.gateway.oss.internal.OSSHeaders;
import com.aliyun.sdk.gateway.oss.policy.OSSUserAgentPolicy;
import com.aliyun.sdk.service.oss20190517.AsyncClient;
import com.aliyun.sdk.service.oss20190517.encryption.AsyncEncryptionClient;
import com.aliyun.sdk.service.oss20190517.encryption.CryptoConfiguration;
import com.aliyun.sdk.service.oss20190517.encryption.EncryptionMaterials;
import com.aliyun.sdk.service.oss20190517.encryption.models.*;
import com.aliyun.sdk.service.oss20190517.models.*;
import darabonba.core.async.AsyncResponseHandler;
import darabonba.core.client.ClientConfiguration;
import darabonba.core.client.ClientOption;
import darabonba.core.client.ClientOverrideConfiguration;
import darabonba.core.client.IClientBuilder;
import darabonba.core.sync.RequestBody;

import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;


public class DefaultAsyncEncryptionClient implements AsyncEncryptionClient {
    private final AsyncClient asyncClient;
    private final EncryptionMaterials encryptionMaterials;
    private final CryptoConfiguration cryptoConfiguration;
    private final OSSDirect ossDirect;

    protected DefaultAsyncEncryptionClient(Builder builder) {
        //Add OSSEncryptionClient to user-agent
        ClientOverrideConfiguration overrideConfiguration = builder.overrideConfiguration;
        if (overrideConfiguration == null) {
            overrideConfiguration = ClientOverrideConfiguration.create();
        }
        overrideConfiguration.setAdditionalUserAgent(additionalUserAgent(builder.overrideConfiguration));

        this.asyncClient = AsyncClient.builder()
                .httpClient(builder.httpClient)
                .region(builder.region)
                .credentialsProvider(builder.credentialsProvider)
                .overrideConfiguration(overrideConfiguration)
                .serviceConfiguration(builder.serviceConfiguration)
                .build();
        this.encryptionMaterials = Validate.paramNotNull(builder.encryptionMaterials, "encryptionMaterials");
        this.cryptoConfiguration = Validate.paramNotNull(builder.cryptoConfiguration, "cryptoConfiguration");
        this.ossDirect = new OSSDirectImpl();
    }

    @Override
    public CompletableFuture<HeadObjectResponse> headObject(HeadObjectRequest request) {
        return asyncClient.headObject(request);
    }

    @Override
    public CompletableFuture<GetObjectMetaResponse> getObjectMeta(GetObjectMetaRequest request) {
        return asyncClient.getObjectMeta(request);
    }

    @Override
    public CompletableFuture<PutObjectTaggingResponse> putObjectTagging(PutObjectTaggingRequest request) {
        return asyncClient.putObjectTagging(request);
    }

    @Override
    public CompletableFuture<GetObjectTaggingResponse> getObjectTagging(GetObjectTaggingRequest request) {
        return asyncClient.getObjectTagging(request);
    }

    @Override
    public CompletableFuture<DeleteObjectTaggingResponse> deleteObjectTagging(DeleteObjectTaggingRequest request) {
        return asyncClient.deleteObjectTagging(request);
    }

    @Override
    public CompletableFuture<PutObjectAclResponse> putObjectAcl(PutObjectAclRequest request) {
        return asyncClient.putObjectAcl(request);
    }

    @Override
    public CompletableFuture<GetObjectAclResponse> getObjectAcl(GetObjectAclRequest request) {
        return asyncClient.getObjectAcl(request);
    }

    @Override
    public CompletableFuture<GetObjectResponse> getObject(GetObjectRequest request) {
        return getObjectWithAsyncResponseHandler(request, AsyncResponseHandler.toBytes()).thenCompose(result ->
                CompletableFuture.completedFuture(result.response().toBuilder()
                        .body(new ByteArrayInputStream(result.asByteArrayUnsafe()))
                        .build()));
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> getObjectWithAsyncResponseHandler(GetObjectRequest request, AsyncResponseHandler<GetObjectResponse, ReturnT> responseHandler) {
        return asyncClient.headObject(toHeadObjectRequest(request)).thenCompose(result -> {
            final Map<String, String> headers = result.getHeaders();
            if (Utils.hasEncryptionInfo(headers)) {
                try {
                    CryptoModule crypto = new CryptoModuleDispatcher(ossDirect, encryptionMaterials, cryptoConfiguration);
                    return crypto.getObjectSecurely(request, headers, responseHandler);
                } catch (Exception e) {
                    CompletableFuture<ReturnT> future = new CompletableFuture<>();
                    future.completeExceptionally(e);
                    return future;
                }
            }
            return asyncClient.getObjectWithAsyncResponseHandler(request, responseHandler);
        });
    }

    @Override
    public CompletableFuture<PutObjectResponse> putObject(PutObjectRequest request) {
        try {
            CryptoModule crypto = new CryptoModuleDispatcher(ossDirect, encryptionMaterials, cryptoConfiguration);
            return crypto.putObjectSecurely(request);
        } catch (Exception e) {
            CompletableFuture<PutObjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PutObjectResponse> putObjectWithRequestBody(PutObjectRequest request, RequestBody requestBody) {
        try {
            CryptoModule crypto = new CryptoModuleDispatcher(ossDirect, encryptionMaterials, cryptoConfiguration);
            return crypto.putObjectSecurely(request, requestBody);
        } catch (Exception e) {
            CompletableFuture<PutObjectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<InitiateMultipartUploadEncryptionResponse> initiateMultipartUpload(InitiateMultipartUploadEncryptionRequest request) {
        try {
            CryptoModule crypto = new CryptoModuleDispatcher(ossDirect, encryptionMaterials, cryptoConfiguration);
            return crypto.initiateMultipartUploadSecurely(request);
        } catch (Exception e) {
            CompletableFuture<InitiateMultipartUploadEncryptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UploadPartEncryptionResponse> uploadPart(UploadPartEncryptionRequest request) {
        try {
            CryptoModule crypto = new CryptoModuleDispatcher(ossDirect, encryptionMaterials, cryptoConfiguration);
            return crypto.uploadPartSecurely(request);
        } catch (Exception e) {
            CompletableFuture<UploadPartEncryptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UploadPartEncryptionResponse> uploadPartWithRequestBody(UploadPartEncryptionRequest request, RequestBody requestBody) {
        try {
            CryptoModule crypto = new CryptoModuleDispatcher(ossDirect, encryptionMaterials, cryptoConfiguration);
            return crypto.uploadPartSecurely(request, requestBody);
        } catch (Exception e) {
            CompletableFuture<UploadPartEncryptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CompleteMultipartUploadEncryptionResponse> completeMultipartUpload(CompleteMultipartUploadEncryptionRequest request) {
        try {
            CryptoModule crypto = new CryptoModuleDispatcher(ossDirect, encryptionMaterials, cryptoConfiguration);
            return crypto.completeMultipartUploadSecurely(request);
        } catch (Exception e) {
            CompletableFuture<CompleteMultipartUploadEncryptionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AbortMultipartUploadResponse> abortMultipartUpload(AbortMultipartUploadRequest request) {
        return asyncClient.abortMultipartUpload(request);
    }

    @Override
    public CompletableFuture<ListMultipartUploadsResponse> listMultipartUploads(ListMultipartUploadsRequest request) {
        return asyncClient.listMultipartUploads(request);
    }

    @Override
    public CompletableFuture<ListPartsResponse> listParts(ListPartsRequest request) {
        return asyncClient.listParts(request);
    }

    @Override
    public void close() {
        if (asyncClient != null) {
            asyncClient.close();
        }
    }

    private HeadObjectRequest toHeadObjectRequest(GetObjectRequest request) {
        //head object and issue request
        HeadObjectRequest.Builder builder = HeadObjectRequest.builder().bucket(request.getBucket()).key(request.getKey());
        if (request.getHeaderParameters().containsKey(OSSHeaders.REQUEST_PAYER)) {
            builder.headerParam(OSSHeaders.REQUEST_PAYER, request.getHeaderParameters().get(OSSHeaders.REQUEST_PAYER));
        }
        if (request.getQueryParameters().containsKey("versionId")) {
            builder.versionId((String) request.getQueryParameters().get("versionId"));
        }
        return builder.build();
    }

    private String additionalUserAgent(ClientOverrideConfiguration overrideConfiguration) {
        String  userAgent = "OSSEncryptionClient";
        if (overrideConfiguration != null && overrideConfiguration.additionalUserAgent() != null) {
            userAgent = userAgent + " " + overrideConfiguration.additionalUserAgent();
        }
        return userAgent;
    }

    public static final class Builder implements IClientBuilder<Builder, AsyncEncryptionClient> {
        private HttpClient httpClient;
        private String region;
        private ICredentialProvider credentialsProvider;
        private ClientOverrideConfiguration overrideConfiguration;
        private Configuration serviceConfiguration;
        private EncryptionMaterials encryptionMaterials;
        private CryptoConfiguration cryptoConfiguration;

        @Override
        public AsyncEncryptionClient build() {
            return new DefaultAsyncEncryptionClient(this);
        }

        @Override
        public Builder credentialsProvider(ICredentialProvider credentialsProvider) {
            this.credentialsProvider = credentialsProvider;
            return this;
        }

        @Override
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        @Override
        public Builder overrideConfiguration(ClientOverrideConfiguration overrideConfiguration) {
            this.overrideConfiguration = overrideConfiguration;
            return this;
        }

        public Builder serviceConfiguration(Configuration serviceConfiguration) {
            this.serviceConfiguration = serviceConfiguration;
            return this;
        }

        public Builder httpClient(HttpClient httpClient) {
            this.httpClient = httpClient;
            return this;
        }

        public Builder encryptionMaterials(EncryptionMaterials encryptionMaterials) {
            this.encryptionMaterials = encryptionMaterials;
            return this;
        }

        public Builder cryptoConfiguration(CryptoConfiguration cryptoConfiguration) {
            this.cryptoConfiguration = cryptoConfiguration;
            return this;
        }
    }

    private final class OSSDirectImpl implements OSSDirect {
        @Override
        public <ReturnT> CompletableFuture<ReturnT> getObjectWithAsyncResponseHandler(GetObjectRequest request, AsyncResponseHandler<GetObjectResponse, ReturnT> responseHandler) {
            return asyncClient.getObjectWithAsyncResponseHandler(request, responseHandler);
        }

        @Override
        public CompletableFuture<PutObjectResponse> putObject(PutObjectRequest request) {
            return asyncClient.putObject(request);
        }

        @Override
        public CompletableFuture<PutObjectResponse> putObjectWithRequestBody(PutObjectRequest request, RequestBody requestBody) {
            return asyncClient.putObjectWithRequestBody(request, requestBody);
        }

        @Override
        public CompletableFuture<InitiateMultipartUploadResponse> initiateMultipartUpload(InitiateMultipartUploadRequest request) {
            return asyncClient.initiateMultipartUpload(request);
        }

        @Override
        public CompletableFuture<UploadPartResponse> uploadPart(UploadPartRequest request) {
            return asyncClient.uploadPart(request);
        }

        @Override
        public CompletableFuture<UploadPartResponse> uploadPartWithRequestBody(UploadPartRequest request, RequestBody requestBody) {
            return asyncClient.uploadPartWithRequestBody(request, requestBody);
        }

        @Override
        public CompletableFuture<CompleteMultipartUploadResponse> completeMultipartUpload(CompleteMultipartUploadRequest request) {
            return asyncClient.completeMultipartUpload(request);
        }
    }
}
