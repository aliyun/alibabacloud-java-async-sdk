// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkvisual20230630.models.*;
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

    CompletableFuture<BatchBindDeviceResponse> batchBindDevice(BatchBindDeviceRequest request);

    CompletableFuture<BindStorageOrderResponse> bindStorageOrder(BindStorageOrderRequest request);

    CompletableFuture<CheckFreeStorageValidResponse> checkFreeStorageValid(CheckFreeStorageValidRequest request);

    CompletableFuture<ConsumeFreeStorageResponse> consumeFreeStorage(ConsumeFreeStorageRequest request);

    CompletableFuture<CreateAndPayStorageOrderResponse> createAndPayStorageOrder(CreateAndPayStorageOrderRequest request);

    CompletableFuture<EnableFreeStorageResponse> enableFreeStorage(EnableFreeStorageRequest request);

    CompletableFuture<EnableStorageOrderResponse> enableStorageOrder(EnableStorageOrderRequest request);

    CompletableFuture<FreezeFreeStorageResponse> freezeFreeStorage(FreezeFreeStorageRequest request);

    CompletableFuture<FreezeStorageOrderResponse> freezeStorageOrder(FreezeStorageOrderRequest request);

    CompletableFuture<GenerateDeviceResponse> generateDevice(GenerateDeviceRequest request);

    CompletableFuture<GenerateDeviceByBatchIdResponse> generateDeviceByBatchId(GenerateDeviceByBatchIdRequest request);

    CompletableFuture<GetAccountByIdResponse> getAccountById(GetAccountByIdRequest request);

    CompletableFuture<GetDeviceStatusResponse> getDeviceStatus(GetDeviceStatusRequest request);

    CompletableFuture<GetSubDeviceListResponse> getSubDeviceList(GetSubDeviceListRequest request);

    CompletableFuture<GetThingEventSnapshotResponse> getThingEventSnapshot(GetThingEventSnapshotRequest request);

    CompletableFuture<GetThingPropertySnapshotResponse> getThingPropertySnapshot(GetThingPropertySnapshotRequest request);

    CompletableFuture<InvokeThingServiceResponse> invokeThingService(InvokeThingServiceRequest request);

    CompletableFuture<ListBindingAccountByDeviceResponse> listBindingAccountByDevice(ListBindingAccountByDeviceRequest request);

    CompletableFuture<ListBindingDeviceByAccountResponse> listBindingDeviceByAccount(ListBindingDeviceByAccountRequest request);

    CompletableFuture<QueryBatchStatusResponse> queryBatchStatus(QueryBatchStatusRequest request);

    CompletableFuture<QueryDeviceDetailResponse> queryDeviceDetail(QueryDeviceDetailRequest request);

    CompletableFuture<QueryDevicesDownloadUrlResponse> queryDevicesDownloadUrl(QueryDevicesDownloadUrlRequest request);

    CompletableFuture<QueryFreeStorageResponse> queryFreeStorage(QueryFreeStorageRequest request);

    CompletableFuture<QueryGenerateDevicesInfoListResponse> queryGenerateDevicesInfoList(QueryGenerateDevicesInfoListRequest request);

    CompletableFuture<QueryGenerateDevicesRecordResponse> queryGenerateDevicesRecord(QueryGenerateDevicesRecordRequest request);

    CompletableFuture<QueryStorageCommodityListResponse> queryStorageCommodityList(QueryStorageCommodityListRequest request);

    CompletableFuture<QueryStorageOrderResponse> queryStorageOrder(QueryStorageOrderRequest request);

    CompletableFuture<QueryStorageOrderListResponse> queryStorageOrderList(QueryStorageOrderListRequest request);

    CompletableFuture<SetThingPropertyResponse> setThingProperty(SetThingPropertyRequest request);

    CompletableFuture<TransferStorageOrderResponse> transferStorageOrder(TransferStorageOrderRequest request);

    CompletableFuture<UnbindAllUserByDeviceResponse> unbindAllUserByDevice(UnbindAllUserByDeviceRequest request);

    CompletableFuture<UnbindDeviceResponse> unbindDevice(UnbindDeviceRequest request);

    CompletableFuture<UploadDeviceNameListResponse> uploadDeviceNameList(UploadDeviceNameListRequest request);

}
