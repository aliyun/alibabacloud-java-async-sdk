// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudesl20190801.models.*;
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

    CompletableFuture<ActivateApDeviceResponse> activateApDevice(ActivateApDeviceRequest request);

    CompletableFuture<AddApDeviceResponse> addApDevice(AddApDeviceRequest request);

    CompletableFuture<AddEslDeviceResponse> addEslDevice(AddEslDeviceRequest request);

    CompletableFuture<AddUserResponse> addUser(AddUserRequest request);

    CompletableFuture<AssignUserResponse> assignUser(AssignUserRequest request);

    CompletableFuture<BatchInsertItemsResponse> batchInsertItems(BatchInsertItemsRequest request);

    CompletableFuture<BindEslDeviceResponse> bindEslDevice(BindEslDeviceRequest request);

    CompletableFuture<BindEslDeviceShelfResponse> bindEslDeviceShelf(BindEslDeviceShelfRequest request);

    CompletableFuture<ConfirmLogisticsResponse> confirmLogistics(ConfirmLogisticsRequest request);

    CompletableFuture<CreateStoreResponse> createStore(CreateStoreRequest request);

    CompletableFuture<DeleteApDeviceResponse> deleteApDevice(DeleteApDeviceRequest request);

    CompletableFuture<DeleteEslDeviceResponse> deleteEslDevice(DeleteEslDeviceRequest request);

    CompletableFuture<DeleteItemResponse> deleteItem(DeleteItemRequest request);

    CompletableFuture<DeleteItemBySkuIdResponse> deleteItemBySkuId(DeleteItemBySkuIdRequest request);

    CompletableFuture<DeleteStoreResponse> deleteStore(DeleteStoreRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DescribeAlarmsResponse> describeAlarms(DescribeAlarmsRequest request);

    CompletableFuture<DescribeApDevicesResponse> describeApDevices(DescribeApDevicesRequest request);

    CompletableFuture<DescribeEslDevicesResponse> describeEslDevices(DescribeEslDevicesRequest request);

    CompletableFuture<DescribeItemsResponse> describeItems(DescribeItemsRequest request);

    CompletableFuture<DescribeLogisticsResponse> describeLogistics(DescribeLogisticsRequest request);

    CompletableFuture<DescribePayOrdersResponse> describePayOrders(DescribePayOrdersRequest request);

    CompletableFuture<DescribePlanogramRailsResponse> describePlanogramRails(DescribePlanogramRailsRequest request);

    CompletableFuture<DescribeStoresResponse> describeStores(DescribeStoresRequest request);

    CompletableFuture<DescribeUserLogResponse> describeUserLog(DescribeUserLogRequest request);

    CompletableFuture<DescribeUsersResponse> describeUsers(DescribeUsersRequest request);

    CompletableFuture<GetCompanyResponse> getCompany(GetCompanyRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<MapPlanogramRailResponse> mapPlanogramRail(MapPlanogramRailRequest request);

    CompletableFuture<RefreshTaobaoItemResponse> refreshTaobaoItem(RefreshTaobaoItemRequest request);

    CompletableFuture<UnassignUserResponse> unassignUser(UnassignUserRequest request);

    CompletableFuture<UnbindEslDeviceResponse> unbindEslDevice(UnbindEslDeviceRequest request);

    CompletableFuture<UnbindEslDeviceShelfResponse> unbindEslDeviceShelf(UnbindEslDeviceShelfRequest request);

    CompletableFuture<UnmapPlanogramRailResponse> unmapPlanogramRail(UnmapPlanogramRailRequest request);

    CompletableFuture<UpdateEslDeviceLightResponse> updateEslDeviceLight(UpdateEslDeviceLightRequest request);

    CompletableFuture<UpdateStoreResponse> updateStore(UpdateStoreRequest request);

}
