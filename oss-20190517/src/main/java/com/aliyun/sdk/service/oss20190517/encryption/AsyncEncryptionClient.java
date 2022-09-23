package com.aliyun.sdk.service.oss20190517.encryption;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.oss20190517.encryption.internal.DefaultAsyncEncryptionClient;
import com.aliyun.sdk.service.oss20190517.encryption.models.*;
import com.aliyun.sdk.service.oss20190517.models.*;
import darabonba.core.async.AsyncResponseHandler;
import darabonba.core.sync.RequestBody;

import java.util.concurrent.CompletableFuture;

public interface AsyncEncryptionClient extends SdkAutoCloseable {
    static DefaultAsyncEncryptionClient.Builder builder() {
        return new DefaultAsyncEncryptionClient.Builder();
    }

    static AsyncEncryptionClient create() {
        return builder().build();
    }

    CompletableFuture<HeadObjectResponse> headObject(HeadObjectRequest request);

    CompletableFuture<GetObjectMetaResponse> getObjectMeta(GetObjectMetaRequest request);

    CompletableFuture<PutObjectTaggingResponse> putObjectTagging(PutObjectTaggingRequest request);

    CompletableFuture<GetObjectTaggingResponse> getObjectTagging(GetObjectTaggingRequest request);

    CompletableFuture<DeleteObjectTaggingResponse> deleteObjectTagging(DeleteObjectTaggingRequest request);

    CompletableFuture<PutObjectAclResponse> putObjectAcl(PutObjectAclRequest request);

    CompletableFuture<GetObjectAclResponse> getObjectAcl(GetObjectAclRequest request);

    CompletableFuture<GetObjectResponse> getObject(GetObjectRequest request);

    <ReturnT> CompletableFuture<ReturnT> getObjectWithAsyncResponseHandler(GetObjectRequest request, AsyncResponseHandler<GetObjectResponse, ReturnT> responseHandler);

    CompletableFuture<PutObjectResponse> putObject(PutObjectRequest request);

    CompletableFuture<PutObjectResponse> putObjectWithRequestBody(PutObjectRequest request, RequestBody requestBody);

    CompletableFuture<InitiateMultipartUploadEncryptionResponse> initiateMultipartUpload(InitiateMultipartUploadEncryptionRequest request);

    CompletableFuture<UploadPartEncryptionResponse> uploadPart(UploadPartEncryptionRequest request);

    CompletableFuture<UploadPartEncryptionResponse> uploadPartWithRequestBody(UploadPartEncryptionRequest request, RequestBody requestBody);

    CompletableFuture<CompleteMultipartUploadEncryptionResponse> completeMultipartUpload(CompleteMultipartUploadEncryptionRequest request);

    CompletableFuture<AbortMultipartUploadResponse> abortMultipartUpload(AbortMultipartUploadRequest request);

    CompletableFuture<ListMultipartUploadsResponse> listMultipartUploads(ListMultipartUploadsRequest request);

    CompletableFuture<ListPartsResponse> listParts(ListPartsRequest request);
}

