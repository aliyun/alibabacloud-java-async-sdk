package com.aliyun.sdk.service.oss20190517.encryption.internal;

import com.aliyun.sdk.service.oss20190517.encryption.models.*;
import com.aliyun.sdk.service.oss20190517.models.GetObjectRequest;
import com.aliyun.sdk.service.oss20190517.models.GetObjectResponse;
import com.aliyun.sdk.service.oss20190517.models.PutObjectRequest;
import com.aliyun.sdk.service.oss20190517.models.PutObjectResponse;
import darabonba.core.async.AsyncResponseHandler;
import darabonba.core.sync.RequestBody;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * An interafce used to implements different crypto module.
 */
public interface CryptoModule {

    <ReturnT> CompletableFuture<ReturnT> getObjectSecurely(GetObjectRequest request, Map<String, String> headers, AsyncResponseHandler<GetObjectResponse, ReturnT> responseHandler);

    CompletableFuture<PutObjectResponse> putObjectSecurely(PutObjectRequest request);

    CompletableFuture<PutObjectResponse> putObjectSecurely(PutObjectRequest request, RequestBody requestBody);

    CompletableFuture<InitiateMultipartUploadEncryptionResponse> initiateMultipartUploadSecurely(InitiateMultipartUploadEncryptionRequest request);

    CompletableFuture<UploadPartEncryptionResponse> uploadPartSecurely(UploadPartEncryptionRequest request);

    CompletableFuture<UploadPartEncryptionResponse> uploadPartSecurely(UploadPartEncryptionRequest request, RequestBody requestBody);

    CompletableFuture<CompleteMultipartUploadEncryptionResponse> completeMultipartUploadSecurely(CompleteMultipartUploadEncryptionRequest request);
}
