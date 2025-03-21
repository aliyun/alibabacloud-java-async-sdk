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

    /**
     * @param request the request parameters of CancelSpecReviewTask  CancelSpecReviewTaskRequest
     * @return CancelSpecReviewTaskResponse
     */
    CompletableFuture<CancelSpecReviewTaskResponse> cancelSpecReviewTask(CancelSpecReviewTaskRequest request);

    /**
     * @param request the request parameters of CreateApp  CreateAppRequest
     * @return CreateAppResponse
     */
    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    /**
     * @param request the request parameters of CreateEndpoint  CreateEndpointRequest
     * @return CreateEndpointResponse
     */
    CompletableFuture<CreateEndpointResponse> createEndpoint(CreateEndpointRequest request);

    /**
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteApp  DeleteAppRequest
     * @return DeleteAppResponse
     */
    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    /**
     * @param request the request parameters of DeleteDict  DeleteDictRequest
     * @return DeleteDictResponse
     */
    CompletableFuture<DeleteDictResponse> deleteDict(DeleteDictRequest request);

    /**
     * @param request the request parameters of DeleteEndpoint  DeleteEndpointRequest
     * @return DeleteEndpointResponse
     */
    CompletableFuture<DeleteEndpointResponse> deleteEndpoint(DeleteEndpointRequest request);

    /**
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * @param request the request parameters of GetApp  GetAppRequest
     * @return GetAppResponse
     */
    CompletableFuture<GetAppResponse> getApp(GetAppRequest request);

    /**
     * @param request the request parameters of GetAppQuota  GetAppQuotaRequest
     * @return GetAppQuotaResponse
     */
    CompletableFuture<GetAppQuotaResponse> getAppQuota(GetAppQuotaRequest request);

    /**
     * @param request the request parameters of GetMonitorData  GetMonitorDataRequest
     * @return GetMonitorDataResponse
     */
    CompletableFuture<GetMonitorDataResponse> getMonitorData(GetMonitorDataRequest request);

    /**
     * @param request the request parameters of GetSnapshotSetting  GetSnapshotSettingRequest
     * @return GetSnapshotSettingResponse
     */
    CompletableFuture<GetSnapshotSettingResponse> getSnapshotSetting(GetSnapshotSettingRequest request);

    /**
     * @param request the request parameters of GetSpecReviewTask  GetSpecReviewTaskRequest
     * @return GetSpecReviewTaskResponse
     */
    CompletableFuture<GetSpecReviewTaskResponse> getSpecReviewTask(GetSpecReviewTaskRequest request);

    /**
     * @param request the request parameters of ListApps  ListAppsRequest
     * @return ListAppsResponse
     */
    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    /**
     * @param request the request parameters of ListDicts  ListDictsRequest
     * @return ListDictsResponse
     */
    CompletableFuture<ListDictsResponse> listDicts(ListDictsRequest request);

    /**
     * @param request the request parameters of ListEndpoints  ListEndpointsRequest
     * @return ListEndpointsResponse
     */
    CompletableFuture<ListEndpointsResponse> listEndpoints(ListEndpointsRequest request);

    /**
     * @param request the request parameters of ListIndices  ListIndicesRequest
     * @return ListIndicesResponse
     */
    CompletableFuture<ListIndicesResponse> listIndices(ListIndicesRequest request);

    /**
     * @param request the request parameters of ListSnapshotRepositories  ListSnapshotRepositoriesRequest
     * @return ListSnapshotRepositoriesResponse
     */
    CompletableFuture<ListSnapshotRepositoriesResponse> listSnapshotRepositories(ListSnapshotRepositoriesRequest request);

    /**
     * @param request the request parameters of ListSnapshots  ListSnapshotsRequest
     * @return ListSnapshotsResponse
     */
    CompletableFuture<ListSnapshotsResponse> listSnapshots(ListSnapshotsRequest request);

    /**
     * @param request the request parameters of ListSpecReviewTasks  ListSpecReviewTasksRequest
     * @return ListSpecReviewTasksResponse
     */
    CompletableFuture<ListSpecReviewTasksResponse> listSpecReviewTasks(ListSpecReviewTasksRequest request);

    /**
     * @param request the request parameters of UpdateApp  UpdateAppRequest
     * @return UpdateAppResponse
     */
    CompletableFuture<UpdateAppResponse> updateApp(UpdateAppRequest request);

    /**
     * @param request the request parameters of UpdateDict  UpdateDictRequest
     * @return UpdateDictResponse
     */
    CompletableFuture<UpdateDictResponse> updateDict(UpdateDictRequest request);

    /**
     * @param request the request parameters of UpdateEndpoint  UpdateEndpointRequest
     * @return UpdateEndpointResponse
     */
    CompletableFuture<UpdateEndpointResponse> updateEndpoint(UpdateEndpointRequest request);

    /**
     * @param request the request parameters of UpdateSnapshotSetting  UpdateSnapshotSettingRequest
     * @return UpdateSnapshotSettingResponse
     */
    CompletableFuture<UpdateSnapshotSettingResponse> updateSnapshotSetting(UpdateSnapshotSettingRequest request);

}
