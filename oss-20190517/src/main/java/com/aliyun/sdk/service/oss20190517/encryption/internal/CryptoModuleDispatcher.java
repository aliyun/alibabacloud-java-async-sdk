package com.aliyun.sdk.service.oss20190517.encryption.internal;

import com.aliyun.sdk.service.oss20190517.encryption.CryptoConfiguration;
import com.aliyun.sdk.service.oss20190517.encryption.EncryptionMaterials;
import com.aliyun.sdk.service.oss20190517.encryption.models.*;
import com.aliyun.sdk.service.oss20190517.models.GetObjectRequest;
import com.aliyun.sdk.service.oss20190517.models.GetObjectResponse;
import com.aliyun.sdk.service.oss20190517.models.PutObjectRequest;
import com.aliyun.sdk.service.oss20190517.models.PutObjectResponse;
import darabonba.core.async.AsyncResponseHandler;
import darabonba.core.sync.RequestBody;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class CryptoModuleDispatcher implements CryptoModule {
    private final CryptoModuleAesCtr cryptoModule;

    public CryptoModuleDispatcher(OSSDirect ossDirect,
                                  EncryptionMaterials encryptionMaterials,
                                  CryptoConfiguration cryptoConfig) {
        cryptoConfig = cryptoConfig.clone();
        this.cryptoModule = new CryptoModuleAesCtr(ossDirect, encryptionMaterials, cryptoConfig);
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> getObjectSecurely(GetObjectRequest request, Map<String, String> headers, AsyncResponseHandler<GetObjectResponse, ReturnT> responseHandler) {
        return cryptoModule.getObjectSecurely(request, headers, responseHandler);
    }

    @Override
    public CompletableFuture<PutObjectResponse> putObjectSecurely(PutObjectRequest request) {
        return cryptoModule.putObjectSecurely(request);
    }

    @Override
    public CompletableFuture<PutObjectResponse> putObjectSecurely(PutObjectRequest request, RequestBody requestBody) {
        return cryptoModule.putObjectSecurely(request, requestBody);
    }

    @Override
    public CompletableFuture<InitiateMultipartUploadEncryptionResponse> initiateMultipartUploadSecurely(InitiateMultipartUploadEncryptionRequest request) {
        return cryptoModule.initiateMultipartUploadSecurely(request);
    }

    @Override
    public CompletableFuture<UploadPartEncryptionResponse> uploadPartSecurely(UploadPartEncryptionRequest request) {
        return cryptoModule.uploadPartSecurely(request);
    }

    @Override
    public CompletableFuture<UploadPartEncryptionResponse> uploadPartSecurely(UploadPartEncryptionRequest request, RequestBody requestBody) {
        return cryptoModule.uploadPartSecurely(request, requestBody);
    }

    @Override
    public CompletableFuture<CompleteMultipartUploadEncryptionResponse> completeMultipartUploadSecurely(CompleteMultipartUploadEncryptionRequest request) {
        return cryptoModule.completeMultipartUploadSecurely(request);
    }
}
