// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517;

import com.aliyun.oss20190517.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<AbortBucketWormResponse> abortBucketWorm(AbortBucketWormRequest request);

    CompletableFuture<AbortMultipartUploadResponse> abortMultipartUpload(AbortMultipartUploadRequest request);

    CompletableFuture<AppendObjectResponse> appendObject(AppendObjectRequest request);

    CompletableFuture<AppendObjectResponse> appendObjectWithRequestBody(AppendObjectRequest request, RequestBody requestBody);

    CompletableFuture<CompleteBucketWormResponse> completeBucketWorm(CompleteBucketWormRequest request);

    CompletableFuture<CompleteMultipartUploadResponse> completeMultipartUpload(CompleteMultipartUploadRequest request);

    CompletableFuture<CopyObjectResponse> copyObject(CopyObjectRequest request);

    CompletableFuture<CopyObjectResponse> copyObjectWithRequestBody(CopyObjectRequest request, RequestBody requestBody);

    CompletableFuture<DeleteBucketResponse> deleteBucket(DeleteBucketRequest request);

    CompletableFuture<DeleteBucketCorsResponse> deleteBucketCors(DeleteBucketCorsRequest request);

    CompletableFuture<DeleteBucketEncryptionResponse> deleteBucketEncryption(DeleteBucketEncryptionRequest request);

    CompletableFuture<DeleteBucketInventoryResponse> deleteBucketInventory(DeleteBucketInventoryRequest request);

    CompletableFuture<DeleteBucketLifecycleResponse> deleteBucketLifecycle(DeleteBucketLifecycleRequest request);

    CompletableFuture<DeleteBucketLoggingResponse> deleteBucketLogging(DeleteBucketLoggingRequest request);

    CompletableFuture<DeleteBucketPolicyResponse> deleteBucketPolicy(DeleteBucketPolicyRequest request);

    CompletableFuture<DeleteBucketReplicationResponse> deleteBucketReplication(DeleteBucketReplicationRequest request);

    CompletableFuture<DeleteBucketTagsResponse> deleteBucketTags(DeleteBucketTagsRequest request);

    CompletableFuture<DeleteBucketWebsiteResponse> deleteBucketWebsite(DeleteBucketWebsiteRequest request);

    CompletableFuture<DeleteLiveChannelResponse> deleteLiveChannel(DeleteLiveChannelRequest request);

    CompletableFuture<DeleteMultipleObjectsResponse> deleteMultipleObjects(DeleteMultipleObjectsRequest request);

    CompletableFuture<DeleteObjectResponse> deleteObject(DeleteObjectRequest request);

    CompletableFuture<DeleteObjectResponse> deleteObjectWithRequestBody(DeleteObjectRequest request, RequestBody requestBody);

    CompletableFuture<DeleteObjectTaggingResponse> deleteObjectTagging(DeleteObjectTaggingRequest request);

    CompletableFuture<ExtendBucketWormResponse> extendBucketWorm(ExtendBucketWormRequest request);

    CompletableFuture<GetBucketResponse> getBucket(GetBucketRequest request);

    CompletableFuture<GetBucketAclResponse> getBucketAcl(GetBucketAclRequest request);

    CompletableFuture<GetBucketCorsResponse> getBucketCors(GetBucketCorsRequest request);

    CompletableFuture<GetBucketEncryptionResponse> getBucketEncryption(GetBucketEncryptionRequest request);

    CompletableFuture<GetBucketInfoResponse> getBucketInfo(GetBucketInfoRequest request);

    CompletableFuture<GetBucketInventoryResponse> getBucketInventory(GetBucketInventoryRequest request);

    CompletableFuture<GetBucketLifecycleResponse> getBucketLifecycle(GetBucketLifecycleRequest request);

    CompletableFuture<GetBucketLocationResponse> getBucketLocation(GetBucketLocationRequest request);

    CompletableFuture<GetBucketLoggingResponse> getBucketLogging(GetBucketLoggingRequest request);

    CompletableFuture<GetBucketPolicyResponse> getBucketPolicy(GetBucketPolicyRequest request);

    CompletableFuture<GetBucketRefererResponse> getBucketReferer(GetBucketRefererRequest request);

    CompletableFuture<GetBucketReplicationResponse> getBucketReplication(GetBucketReplicationRequest request);

    CompletableFuture<GetBucketReplicationLocationResponse> getBucketReplicationLocation(GetBucketReplicationLocationRequest request);

    CompletableFuture<GetBucketReplicationProgressResponse> getBucketReplicationProgress(GetBucketReplicationProgressRequest request);

    CompletableFuture<GetBucketRequestPaymentResponse> getBucketRequestPayment(GetBucketRequestPaymentRequest request);

    CompletableFuture<GetBucketTagsResponse> getBucketTags(GetBucketTagsRequest request);

    CompletableFuture<GetBucketTransferAccelerationResponse> getBucketTransferAcceleration(GetBucketTransferAccelerationRequest request);

    CompletableFuture<GetBucketVersioningResponse> getBucketVersioning(GetBucketVersioningRequest request);

    CompletableFuture<GetBucketWebsiteResponse> getBucketWebsite(GetBucketWebsiteRequest request);

    CompletableFuture<GetBucketWormResponse> getBucketWorm(GetBucketWormRequest request);

    CompletableFuture<GetLiveChannelHistoryResponse> getLiveChannelHistory(GetLiveChannelHistoryRequest request);

    CompletableFuture<GetLiveChannelInfoResponse> getLiveChannelInfo(GetLiveChannelInfoRequest request);

    CompletableFuture<GetLiveChannelStatResponse> getLiveChannelStat(GetLiveChannelStatRequest request);

    CompletableFuture<GetObjectResponse> getObject(GetObjectRequest request);

    CompletableFuture<GetObjectAclResponse> getObjectAcl(GetObjectAclRequest request);

    CompletableFuture<GetObjectMetaResponse> getObjectMeta(GetObjectMetaRequest request);

    CompletableFuture<GetObjectMetaResponse> getObjectMetaWithRequestBody(GetObjectMetaRequest request, RequestBody requestBody);

    CompletableFuture<GetObjectTaggingResponse> getObjectTagging(GetObjectTaggingRequest request);

    CompletableFuture<GetServiceResponse> getService(GetServiceRequest request);

    CompletableFuture<GetSymlinkResponse> getSymlink(GetSymlinkRequest request);

    CompletableFuture<GetVodPlaylistResponse> getVodPlaylist(GetVodPlaylistRequest request);

    CompletableFuture<HeadObjectResponse> headObject(HeadObjectRequest request);

    CompletableFuture<InitiateBucketWormResponse> initiateBucketWorm(InitiateBucketWormRequest request);

    CompletableFuture<InitiateMultipartUploadResponse> initiateMultipartUpload(InitiateMultipartUploadRequest request);

    CompletableFuture<ListBucketInventoryResponse> listBucketInventory(ListBucketInventoryRequest request);

    CompletableFuture<ListBucketsResponse> listBuckets(ListBucketsRequest request);

    CompletableFuture<ListLiveChannelResponse> listLiveChannel(ListLiveChannelRequest request);

    CompletableFuture<ListMultipartUploadsResponse> listMultipartUploads(ListMultipartUploadsRequest request);

    CompletableFuture<ListObjectVersionsResponse> listObjectVersions(ListObjectVersionsRequest request);

    CompletableFuture<ListObjectsResponse> listObjects(ListObjectsRequest request);

    CompletableFuture<ListObjectsV2Response> listObjectsV2(ListObjectsV2Request request);

    CompletableFuture<ListPartsResponse> listParts(ListPartsRequest request);

    CompletableFuture<OptionObjectResponse> optionObject(OptionObjectRequest request);

    CompletableFuture<PostObjectResponse> postObject(PostObjectRequest request);

    CompletableFuture<PostVodPlaylistResponse> postVodPlaylist(PostVodPlaylistRequest request);

    CompletableFuture<PutBucketResponse> putBucket(PutBucketRequest request);

    CompletableFuture<PutBucketAclResponse> putBucketAcl(PutBucketAclRequest request);

    CompletableFuture<PutBucketCorsResponse> putBucketCors(PutBucketCorsRequest request);

    CompletableFuture<PutBucketEncryptionResponse> putBucketEncryption(PutBucketEncryptionRequest request);

    CompletableFuture<PutBucketInventoryResponse> putBucketInventory(PutBucketInventoryRequest request);

    CompletableFuture<PutBucketLifecycleResponse> putBucketLifecycle(PutBucketLifecycleRequest request);

    CompletableFuture<PutBucketLoggingResponse> putBucketLogging(PutBucketLoggingRequest request);

    CompletableFuture<PutBucketPolicyResponse> putBucketPolicy(PutBucketPolicyRequest request);

    CompletableFuture<PutBucketRefererResponse> putBucketReferer(PutBucketRefererRequest request);

    CompletableFuture<PutBucketReplicationResponse> putBucketReplication(PutBucketReplicationRequest request);

    CompletableFuture<PutBucketRequestPaymentResponse> putBucketRequestPayment(PutBucketRequestPaymentRequest request);

    CompletableFuture<PutBucketTagsResponse> putBucketTags(PutBucketTagsRequest request);

    CompletableFuture<PutBucketTransferAccelerationResponse> putBucketTransferAcceleration(PutBucketTransferAccelerationRequest request);

    CompletableFuture<PutBucketVersioningResponse> putBucketVersioning(PutBucketVersioningRequest request);

    CompletableFuture<PutBucketWebsiteResponse> putBucketWebsite(PutBucketWebsiteRequest request);

    CompletableFuture<PutLiveChannelResponse> putLiveChannel(PutLiveChannelRequest request);

    CompletableFuture<PutLiveChannelStatusResponse> putLiveChannelStatus(PutLiveChannelStatusRequest request);

    CompletableFuture<PutObjectResponse> putObject(PutObjectRequest request);

    CompletableFuture<PutObjectResponse> putObjectWithRequestBody(PutObjectRequest request, RequestBody requestBody);

    CompletableFuture<PutObjectAclResponse> putObjectAcl(PutObjectAclRequest request);

    CompletableFuture<PutObjectTaggingResponse> putObjectTagging(PutObjectTaggingRequest request);

    CompletableFuture<PutSymlinkResponse> putSymlink(PutSymlinkRequest request);

    CompletableFuture<RestoreObjectResponse> restoreObject(RestoreObjectRequest request);

    CompletableFuture<SelectObjectResponse> selectObject(SelectObjectRequest request);

    CompletableFuture<UploadPartResponse> uploadPart(UploadPartRequest request);

    CompletableFuture<UploadPartResponse> uploadPartWithRequestBody(UploadPartRequest request, RequestBody requestBody);

    CompletableFuture<UploadPartCopyResponse> uploadPartCopy(UploadPartCopyRequest request);

}
