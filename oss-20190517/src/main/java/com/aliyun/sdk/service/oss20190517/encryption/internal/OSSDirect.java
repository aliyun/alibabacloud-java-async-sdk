package com.aliyun.sdk.service.oss20190517.encryption.internal;

import com.aliyun.sdk.service.oss20190517.models.*;
import darabonba.core.async.AsyncResponseHandler;
import darabonba.core.sync.RequestBody;

import java.util.concurrent.CompletableFuture;

/**
 * Used to provide direct access to the underlying/original OSS client methods
 * free of any added cryptographic functionalities.
 */
public interface OSSDirect {

    <ReturnT> CompletableFuture<ReturnT> getObjectWithAsyncResponseHandler(GetObjectRequest request, AsyncResponseHandler<GetObjectResponse, ReturnT> responseHandler);

    CompletableFuture<PutObjectResponse> putObject(PutObjectRequest request);

    CompletableFuture<PutObjectResponse> putObjectWithRequestBody(PutObjectRequest request, RequestBody requestBody);

    CompletableFuture<InitiateMultipartUploadResponse> initiateMultipartUpload(InitiateMultipartUploadRequest request);

    CompletableFuture<UploadPartResponse> uploadPart(UploadPartRequest request);

    CompletableFuture<UploadPartResponse> uploadPartWithRequestBody(UploadPartRequest request, RequestBody requestBody);

    CompletableFuture<CompleteMultipartUploadResponse> completeMultipartUpload(CompleteMultipartUploadRequest request);

}
