// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cloudesl20200201.models.*;
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

    CompletableFuture<AddUserResponse> addUser(AddUserRequest request);

    CompletableFuture<AssignUserResponse> assignUser(AssignUserRequest request);

    CompletableFuture<BatchInsertItemsResponse> batchInsertItems(BatchInsertItemsRequest request);

    CompletableFuture<BindEslDeviceResponse> bindEslDevice(BindEslDeviceRequest request);

    CompletableFuture<ConfirmServerLocationResponse> confirmServerLocation(ConfirmServerLocationRequest request);

    CompletableFuture<CreateStoreResponse> createStore(CreateStoreRequest request);

    CompletableFuture<DeleteApDeviceResponse> deleteApDevice(DeleteApDeviceRequest request);

    CompletableFuture<DeleteItemResponse> deleteItem(DeleteItemRequest request);

    CompletableFuture<DeleteStoreResponse> deleteStore(DeleteStoreRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DescribeApDevicesResponse> describeApDevices(DescribeApDevicesRequest request);

    CompletableFuture<DescribeBindersResponse> describeBinders(DescribeBindersRequest request);

    CompletableFuture<DescribeClientPackageResponse> describeClientPackage(DescribeClientPackageRequest request);

    CompletableFuture<DescribeEslDeviceResponse> describeEslDevice(DescribeEslDeviceRequest request);

    CompletableFuture<DescribeEslDevicesResponse> describeEslDevices(DescribeEslDevicesRequest request);

    CompletableFuture<DescribeItemsResponse> describeItems(DescribeItemsRequest request);

    CompletableFuture<DescribeStoreConfigResponse> describeStoreConfig(DescribeStoreConfigRequest request);

    CompletableFuture<DescribeStoresResponse> describeStores(DescribeStoresRequest request);

    CompletableFuture<DescribeUserLogResponse> describeUserLog(DescribeUserLogRequest request);

    CompletableFuture<DescribeUsersResponse> describeUsers(DescribeUsersRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<UnassignUserResponse> unassignUser(UnassignUserRequest request);

    CompletableFuture<UnbindEslDeviceResponse> unbindEslDevice(UnbindEslDeviceRequest request);

    CompletableFuture<UpdateEslDeviceLightResponse> updateEslDeviceLight(UpdateEslDeviceLightRequest request);

    CompletableFuture<UpdateStoreResponse> updateStore(UpdateStoreRequest request);

    CompletableFuture<UpdateStoreConfigResponse> updateStoreConfig(UpdateStoreConfigRequest request);

}
