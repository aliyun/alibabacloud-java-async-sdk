// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pai_dsw20220101.models.*;
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
     * @param request the request parameters of CreateIdleInstanceCuller  CreateIdleInstanceCullerRequest
     * @return CreateIdleInstanceCullerResponse
     */
    CompletableFuture<CreateIdleInstanceCullerResponse> createIdleInstanceCuller(CreateIdleInstanceCullerRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateInstanceShutdownTimer  CreateInstanceShutdownTimerRequest
     * @return CreateInstanceShutdownTimerResponse
     */
    CompletableFuture<CreateInstanceShutdownTimerResponse> createInstanceShutdownTimer(CreateInstanceShutdownTimerRequest request);

    /**
     * @param request the request parameters of CreateInstanceSnapshot  CreateInstanceSnapshotRequest
     * @return CreateInstanceSnapshotResponse
     */
    CompletableFuture<CreateInstanceSnapshotResponse> createInstanceSnapshot(CreateInstanceSnapshotRequest request);

    /**
     * @param request the request parameters of DeleteIdleInstanceCuller  DeleteIdleInstanceCullerRequest
     * @return DeleteIdleInstanceCullerResponse
     */
    CompletableFuture<DeleteIdleInstanceCullerResponse> deleteIdleInstanceCuller(DeleteIdleInstanceCullerRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteInstanceLabels  DeleteInstanceLabelsRequest
     * @return DeleteInstanceLabelsResponse
     */
    CompletableFuture<DeleteInstanceLabelsResponse> deleteInstanceLabels(DeleteInstanceLabelsRequest request);

    /**
     * @param request the request parameters of DeleteInstanceShutdownTimer  DeleteInstanceShutdownTimerRequest
     * @return DeleteInstanceShutdownTimerResponse
     */
    CompletableFuture<DeleteInstanceShutdownTimerResponse> deleteInstanceShutdownTimer(DeleteInstanceShutdownTimerRequest request);

    /**
     * @param request the request parameters of DeleteInstanceSnapshot  DeleteInstanceSnapshotRequest
     * @return DeleteInstanceSnapshotResponse
     */
    CompletableFuture<DeleteInstanceSnapshotResponse> deleteInstanceSnapshot(DeleteInstanceSnapshotRequest request);

    /**
     * @param request the request parameters of GetIdleInstanceCuller  GetIdleInstanceCullerRequest
     * @return GetIdleInstanceCullerResponse
     */
    CompletableFuture<GetIdleInstanceCullerResponse> getIdleInstanceCuller(GetIdleInstanceCullerRequest request);

    /**
     * @param request the request parameters of GetInstance  GetInstanceRequest
     * @return GetInstanceResponse
     */
    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    /**
     * @param request the request parameters of GetInstanceEvents  GetInstanceEventsRequest
     * @return GetInstanceEventsResponse
     */
    CompletableFuture<GetInstanceEventsResponse> getInstanceEvents(GetInstanceEventsRequest request);

    /**
     * @param request the request parameters of GetInstanceMetrics  GetInstanceMetricsRequest
     * @return GetInstanceMetricsResponse
     */
    CompletableFuture<GetInstanceMetricsResponse> getInstanceMetrics(GetInstanceMetricsRequest request);

    /**
     * @param request the request parameters of GetInstanceShutdownTimer  GetInstanceShutdownTimerRequest
     * @return GetInstanceShutdownTimerResponse
     */
    CompletableFuture<GetInstanceShutdownTimerResponse> getInstanceShutdownTimer(GetInstanceShutdownTimerRequest request);

    /**
     * @param request the request parameters of GetInstanceSnapshot  GetInstanceSnapshotRequest
     * @return GetInstanceSnapshotResponse
     */
    CompletableFuture<GetInstanceSnapshotResponse> getInstanceSnapshot(GetInstanceSnapshotRequest request);

    /**
     * @param request the request parameters of GetLifecycle  GetLifecycleRequest
     * @return GetLifecycleResponse
     */
    CompletableFuture<GetLifecycleResponse> getLifecycle(GetLifecycleRequest request);

    /**
     * @param request the request parameters of GetMetrics  GetMetricsRequest
     * @return GetMetricsResponse
     */
    CompletableFuture<GetMetricsResponse> getMetrics(GetMetricsRequest request);

    /**
     * @param request the request parameters of GetResourceGroupStatistics  GetResourceGroupStatisticsRequest
     * @return GetResourceGroupStatisticsResponse
     */
    CompletableFuture<GetResourceGroupStatisticsResponse> getResourceGroupStatistics(GetResourceGroupStatisticsRequest request);

    /**
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    /**
     * @param request the request parameters of GetUserConfig  GetUserConfigRequest
     * @return GetUserConfigResponse
     */
    CompletableFuture<GetUserConfigResponse> getUserConfig(GetUserConfigRequest request);

    /**
     * @param request the request parameters of ListEcsSpecs  ListEcsSpecsRequest
     * @return ListEcsSpecsResponse
     */
    CompletableFuture<ListEcsSpecsResponse> listEcsSpecs(ListEcsSpecsRequest request);

    /**
     * @param request the request parameters of ListInstanceSnapshot  ListInstanceSnapshotRequest
     * @return ListInstanceSnapshotResponse
     */
    CompletableFuture<ListInstanceSnapshotResponse> listInstanceSnapshot(ListInstanceSnapshotRequest request);

    /**
     * @param request the request parameters of ListInstanceStatistics  ListInstanceStatisticsRequest
     * @return ListInstanceStatisticsResponse
     */
    CompletableFuture<ListInstanceStatisticsResponse> listInstanceStatistics(ListInstanceStatisticsRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * @param request the request parameters of UpdateInstanceLabels  UpdateInstanceLabelsRequest
     * @return UpdateInstanceLabelsResponse
     */
    CompletableFuture<UpdateInstanceLabelsResponse> updateInstanceLabels(UpdateInstanceLabelsRequest request);

}
