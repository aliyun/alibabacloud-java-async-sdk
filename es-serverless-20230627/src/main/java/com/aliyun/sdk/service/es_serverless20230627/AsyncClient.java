// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.es_serverless20230627.models.*;
import darabonba.core.*;
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

    CompletableFuture<CancelSpecReviewTaskResponse> cancelSpecReviewTask(CancelSpecReviewTaskRequest request);

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateEndpointResponse> createEndpoint(CreateEndpointRequest request);

    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    CompletableFuture<DeleteDictResponse> deleteDict(DeleteDictRequest request);

    CompletableFuture<DeleteEndpointResponse> deleteEndpoint(DeleteEndpointRequest request);

    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    CompletableFuture<GetAppResponse> getApp(GetAppRequest request);

    CompletableFuture<GetAppQuotaResponse> getAppQuota(GetAppQuotaRequest request);

    CompletableFuture<GetMonitorDataResponse> getMonitorData(GetMonitorDataRequest request);

    CompletableFuture<GetSnapshotSettingResponse> getSnapshotSetting(GetSnapshotSettingRequest request);

    CompletableFuture<GetSpecReviewTaskResponse> getSpecReviewTask(GetSpecReviewTaskRequest request);

    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    CompletableFuture<ListDictsResponse> listDicts(ListDictsRequest request);

    CompletableFuture<ListEndpointsResponse> listEndpoints(ListEndpointsRequest request);

    CompletableFuture<ListIndicesResponse> listIndices(ListIndicesRequest request);

    CompletableFuture<ListSnapshotRepositoriesResponse> listSnapshotRepositories(ListSnapshotRepositoriesRequest request);

    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    CompletableFuture<ListSpecReviewTasksResponse> listSpecReviewTasks(ListSpecReviewTasksRequest request);

    CompletableFuture<UpdateAppResponse> updateApp(UpdateAppRequest request);

    CompletableFuture<UpdateDictResponse> updateDict(UpdateDictRequest request);

    CompletableFuture<UpdateEndpointResponse> updateEndpoint(UpdateEndpointRequest request);

    CompletableFuture<UpdateSnapshotSettingResponse> updateSnapshotSetting(UpdateSnapshotSettingRequest request);

}
