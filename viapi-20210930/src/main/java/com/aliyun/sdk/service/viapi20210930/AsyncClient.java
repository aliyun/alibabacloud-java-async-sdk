// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.viapi20210930.models.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;

import java.util.concurrent.CompletableFuture;

public interface AsyncClient extends SdkAutoCloseable {

    static DefaultAsyncClientBuilder builder() {
        return new DefaultAsyncClientBuilder();
    }

    static AsyncClient create() {
        return builder().build();
    }

    CompletableFuture<CheckServiceLinkedRoleForDeletingResponse> checkServiceLinkedRoleForDeleting(CheckServiceLinkedRoleForDeletingRequest request);

    CompletableFuture<CreateAiStoreBucketResponse> createAiStoreBucket(CreateAiStoreBucketRequest request);

    CompletableFuture<CreateAiStoreReceiveConfigResponse> createAiStoreReceiveConfig(CreateAiStoreReceiveConfigRequest request);

    CompletableFuture<CreateAiStoreUserTaskResponse> createAiStoreUserTask(CreateAiStoreUserTaskRequest request);

    CompletableFuture<DeleteAiStoreUserTaskResponse> deleteAiStoreUserTask(DeleteAiStoreUserTaskRequest request);

    CompletableFuture<DisableAiStoreUserTaskResponse> disableAiStoreUserTask(DisableAiStoreUserTaskRequest request);

    CompletableFuture<EnableAiStoreUserTaskResponse> enableAiStoreUserTask(EnableAiStoreUserTaskRequest request);

    CompletableFuture<GetAiStoreReceiveConfigResponse> getAiStoreReceiveConfig(GetAiStoreReceiveConfigRequest request);

    CompletableFuture<GetAiStoreUserTaskResponse> getAiStoreUserTask(GetAiStoreUserTaskRequest request);

    CompletableFuture<GetAiStoreUserTaskByNameResponse> getAiStoreUserTaskByName(GetAiStoreUserTaskByNameRequest request);

    CompletableFuture<ListAiStoreBucketsResponse> listAiStoreBuckets(ListAiStoreBucketsRequest request);

    CompletableFuture<QueryAiStoreApiTreeResponse> queryAiStoreApiTree(QueryAiStoreApiTreeRequest request);

    CompletableFuture<QueryAiStoreRegionsResponse> queryAiStoreRegions(QueryAiStoreRegionsRequest request);

    CompletableFuture<QueryAiStoreUserTaskPageResponse> queryAiStoreUserTaskPage(QueryAiStoreUserTaskPageRequest request);

    CompletableFuture<UpdateAiStoreUserTaskResponse> updateAiStoreUserTask(UpdateAiStoreUserTaskRequest request);

}
