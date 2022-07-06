// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sls20201230.models.*;
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

    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    CompletableFuture<CreateIndexResponse> createIndex(CreateIndexRequest request);

    CompletableFuture<CreateLogStoreResponse> createLogStore(CreateLogStoreRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateSavedSearchResponse> createSavedSearch(CreateSavedSearchRequest request);

    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    CompletableFuture<DeleteIndexResponse> deleteIndex(DeleteIndexRequest request);

    CompletableFuture<DeleteLogStoreResponse> deleteLogStore(DeleteLogStoreRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<GetContextLogsResponse> getContextLogs(GetContextLogsRequest request);

    CompletableFuture<GetCursorResponse> getCursor(GetCursorRequest request);

    CompletableFuture<GetCursorTimeResponse> getCursorTime(GetCursorTimeRequest request);

    CompletableFuture<GetHistogramsResponse> getHistograms(GetHistogramsRequest request);

    CompletableFuture<GetIndexResponse> getIndex(GetIndexRequest request);

    CompletableFuture<GetLogStoreResponse> getLogStore(GetLogStoreRequest request);

    CompletableFuture<GetLogsResponse> getLogs(GetLogsRequest request);

    CompletableFuture<GetProjectResponse> getProject(GetProjectRequest request);

    CompletableFuture<GetProjectLogsResponse> getProjectLogs(GetProjectLogsRequest request);

    CompletableFuture<GetSavedSearchResponse> getSavedSearch(GetSavedSearchRequest request);

    CompletableFuture<ListConsumerGroupResponse> listConsumerGroup(ListConsumerGroupRequest request);

    CompletableFuture<ListLogStoresResponse> listLogStores(ListLogStoresRequest request);

    CompletableFuture<ListProjectResponse> listProject(ListProjectRequest request);

    CompletableFuture<ListSavedSearchResponse> listSavedSearch(ListSavedSearchRequest request);

    CompletableFuture<ListShardsResponse> listShards(ListShardsRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<MergeShardsResponse> mergeShards(MergeShardsRequest request);

    CompletableFuture<SplitShardResponse> splitShard(SplitShardRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request);

    CompletableFuture<UpdateIndexResponse> updateIndex(UpdateIndexRequest request);

    CompletableFuture<UpdateLogStoreResponse> updateLogStore(UpdateLogStoreRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    CompletableFuture<UpdateSavedSearchResponse> updateSavedSearch(UpdateSavedSearchRequest request);

}
