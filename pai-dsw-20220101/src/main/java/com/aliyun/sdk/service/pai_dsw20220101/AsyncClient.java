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

    CompletableFuture<CreateIdleInstanceCullerResponse> createIdleInstanceCuller(CreateIdleInstanceCullerRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateInstanceShutdownTimerResponse> createInstanceShutdownTimer(CreateInstanceShutdownTimerRequest request);

    CompletableFuture<CreateInstanceSnapshotResponse> createInstanceSnapshot(CreateInstanceSnapshotRequest request);

    CompletableFuture<DeleteIdleInstanceCullerResponse> deleteIdleInstanceCuller(DeleteIdleInstanceCullerRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteInstanceShutdownTimerResponse> deleteInstanceShutdownTimer(DeleteInstanceShutdownTimerRequest request);

    CompletableFuture<DeleteInstanceSnapshotResponse> deleteInstanceSnapshot(DeleteInstanceSnapshotRequest request);

    CompletableFuture<GetIdleInstanceCullerResponse> getIdleInstanceCuller(GetIdleInstanceCullerRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetInstanceEventsResponse> getInstanceEvents(GetInstanceEventsRequest request);

    CompletableFuture<GetInstanceMetricsResponse> getInstanceMetrics(GetInstanceMetricsRequest request);

    CompletableFuture<GetInstanceShutdownTimerResponse> getInstanceShutdownTimer(GetInstanceShutdownTimerRequest request);

    CompletableFuture<GetInstanceSnapshotResponse> getInstanceSnapshot(GetInstanceSnapshotRequest request);

    CompletableFuture<GetLifecycleResponse> getLifecycle(GetLifecycleRequest request);

    CompletableFuture<GetResourceGroupStatisticsResponse> getResourceGroupStatistics(GetResourceGroupStatisticsRequest request);

    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    CompletableFuture<GetUserConfigResponse> getUserConfig(GetUserConfigRequest request);

    CompletableFuture<ListEcsSpecsResponse> listEcsSpecs(ListEcsSpecsRequest request);

    CompletableFuture<ListInstanceSnapshotResponse> listInstanceSnapshot(ListInstanceSnapshotRequest request);

    CompletableFuture<ListInstanceStatisticsResponse> listInstanceStatistics(ListInstanceStatisticsRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

}
