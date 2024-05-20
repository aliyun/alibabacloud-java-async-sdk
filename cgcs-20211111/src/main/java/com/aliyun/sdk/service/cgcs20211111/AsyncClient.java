// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cgcs20211111.models.*;
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

    CompletableFuture<BatchCheckSessionResponse> batchCheckSession(BatchCheckSessionRequest request);

    CompletableFuture<CancelReserveTaskResponse> cancelReserveTask(CancelReserveTaskRequest request);

    CompletableFuture<CreateAdaptationResponse> createAdaptation(CreateAdaptationRequest request);

    CompletableFuture<CreateAppResponse> createApp(CreateAppRequest request);

    CompletableFuture<CreateAppSessionResponse> createAppSession(CreateAppSessionRequest request);

    CompletableFuture<CreateAppSessionBatchResponse> createAppSessionBatch(CreateAppSessionBatchRequest request);

    CompletableFuture<CreateAppSessionBatchSyncResponse> createAppSessionBatchSync(CreateAppSessionBatchSyncRequest request);

    CompletableFuture<CreateAppSessionSyncResponse> createAppSessionSync(CreateAppSessionSyncRequest request);

    CompletableFuture<CreateAppVersionResponse> createAppVersion(CreateAppVersionRequest request);

    CompletableFuture<CreateCapacityReservationResponse> createCapacityReservation(CreateCapacityReservationRequest request);

    CompletableFuture<DeleteAppResponse> deleteApp(DeleteAppRequest request);

    CompletableFuture<DeleteAppVersionResponse> deleteAppVersion(DeleteAppVersionRequest request);

    CompletableFuture<GetAdaptationResponse> getAdaptation(GetAdaptationRequest request);

    CompletableFuture<GetAppResponse> getApp(GetAppRequest request);

    CompletableFuture<GetAppCcuResponse> getAppCcu(GetAppCcuRequest request);

    CompletableFuture<GetAppSessionResponse> getAppSession(GetAppSessionRequest request);

    CompletableFuture<GetAppVersionResponse> getAppVersion(GetAppVersionRequest request);

    CompletableFuture<GetCapacityResponse> getCapacity(GetCapacityRequest request);

    CompletableFuture<GetReserveTaskDetailResponse> getReserveTaskDetail(GetReserveTaskDetailRequest request);

    CompletableFuture<GetResourcePublicIPsResponse> getResourcePublicIPs(GetResourcePublicIPsRequest request);

    CompletableFuture<ListAppResponse> listApp(ListAppRequest request);

    CompletableFuture<ListAppSessionsResponse> listAppSessions(ListAppSessionsRequest request);

    CompletableFuture<ListAppVersionResponse> listAppVersion(ListAppVersionRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ModifyAppResponse> modifyApp(ModifyAppRequest request);

    CompletableFuture<ModifyAppVersionResponse> modifyAppVersion(ModifyAppVersionRequest request);

    CompletableFuture<ReleaseCapacityResponse> releaseCapacity(ReleaseCapacityRequest request);

    CompletableFuture<ReleaseCapacityByBatchResponse> releaseCapacityByBatch(ReleaseCapacityByBatchRequest request);

    CompletableFuture<ReleaseInstancesResponse> releaseInstances(ReleaseInstancesRequest request);

    CompletableFuture<ReserveInstancesResponse> reserveInstances(ReserveInstancesRequest request);

    CompletableFuture<SendBizCocChangeCallbackResponse> sendBizCocChangeCallback(SendBizCocChangeCallbackRequest request);

    CompletableFuture<StopAppSessionResponse> stopAppSession(StopAppSessionRequest request);

    CompletableFuture<StopAppSessionBatchResponse> stopAppSessionBatch(StopAppSessionBatchRequest request);

    CompletableFuture<UpdateSessionBizStatusResponse> updateSessionBizStatus(UpdateSessionBizStatusRequest request);

}
