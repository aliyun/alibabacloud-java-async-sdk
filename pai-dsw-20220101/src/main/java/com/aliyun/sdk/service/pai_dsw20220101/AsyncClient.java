// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pai_dsw20220101.models.*;
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

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateInstanceShutdownTimerResponse> createInstanceShutdownTimer(CreateInstanceShutdownTimerRequest request);

    CompletableFuture<CreateInstanceSnapshotResponse> createInstanceSnapshot(CreateInstanceSnapshotRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteInstanceShutdownTimerResponse> deleteInstanceShutdownTimer(DeleteInstanceShutdownTimerRequest request);

    CompletableFuture<DeleteInstanceSnapshotResponse> deleteInstanceSnapshot(DeleteInstanceSnapshotRequest request);

    CompletableFuture<GetInstanceResponse> getInstance(GetInstanceRequest request);

    CompletableFuture<GetInstanceShutdownTimerResponse> getInstanceShutdownTimer(GetInstanceShutdownTimerRequest request);

    CompletableFuture<GetInstanceSnapshotResponse> getInstanceSnapshot(GetInstanceSnapshotRequest request);

    CompletableFuture<GetUserConfigResponse> getUserConfig(GetUserConfigRequest request);

    CompletableFuture<ListDemoCategoriesResponse> listDemoCategories(ListDemoCategoriesRequest request);

    CompletableFuture<ListDemosResponse> listDemos(ListDemosRequest request);

    CompletableFuture<ListEcsSpecsResponse> listEcsSpecs(ListEcsSpecsRequest request);

    CompletableFuture<ListInstanceSnapshotResponse> listInstanceSnapshot(ListInstanceSnapshotRequest request);

    CompletableFuture<ListInstanceStatisticsResponse> listInstanceStatistics(ListInstanceStatisticsRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

}
