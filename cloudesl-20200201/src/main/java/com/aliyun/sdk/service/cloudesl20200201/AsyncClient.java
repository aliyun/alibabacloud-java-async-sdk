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

    CompletableFuture<AddCompanyTemplateResponse> addCompanyTemplate(AddCompanyTemplateRequest request);

    CompletableFuture<AddUserResponse> addUser(AddUserRequest request);

    CompletableFuture<ApplyCompanyTemplateVersionToStoresResponse> applyCompanyTemplateVersionToStores(ApplyCompanyTemplateVersionToStoresRequest request);

    CompletableFuture<AssignUserResponse> assignUser(AssignUserRequest request);

    CompletableFuture<BatchInsertItemsResponse> batchInsertItems(BatchInsertItemsRequest request);

    CompletableFuture<BindEslDeviceResponse> bindEslDevice(BindEslDeviceRequest request);

    CompletableFuture<CreateStoreResponse> createStore(CreateStoreRequest request);

    CompletableFuture<DeleteApDeviceResponse> deleteApDevice(DeleteApDeviceRequest request);

    CompletableFuture<DeleteCompanyTemplateResponse> deleteCompanyTemplate(DeleteCompanyTemplateRequest request);

    CompletableFuture<DeleteItemResponse> deleteItem(DeleteItemRequest request);

    CompletableFuture<DeleteStoreResponse> deleteStore(DeleteStoreRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DescribeApDevicesResponse> describeApDevices(DescribeApDevicesRequest request);

    CompletableFuture<DescribeAvailableEslModelsResponse> describeAvailableEslModels(DescribeAvailableEslModelsRequest request);

    CompletableFuture<DescribeBindersResponse> describeBinders(DescribeBindersRequest request);

    CompletableFuture<DescribeCompanyTemplateVersionsResponse> describeCompanyTemplateVersions(DescribeCompanyTemplateVersionsRequest request);

    CompletableFuture<DescribeEslDeviceResponse> describeEslDevice(DescribeEslDeviceRequest request);

    CompletableFuture<DescribeEslDevicesResponse> describeEslDevices(DescribeEslDevicesRequest request);

    CompletableFuture<DescribeEslModelByTemplateVersionResponse> describeEslModelByTemplateVersion(DescribeEslModelByTemplateVersionRequest request);

    CompletableFuture<DescribeItemsResponse> describeItems(DescribeItemsRequest request);

    CompletableFuture<DescribeStoreByTemplateVersionResponse> describeStoreByTemplateVersion(DescribeStoreByTemplateVersionRequest request);

    CompletableFuture<DescribeStoreConfigResponse> describeStoreConfig(DescribeStoreConfigRequest request);

    CompletableFuture<DescribeStoresResponse> describeStores(DescribeStoresRequest request);

    CompletableFuture<DescribeTemplateByModelResponse> describeTemplateByModel(DescribeTemplateByModelRequest request);

    CompletableFuture<DescribeUserLogResponse> describeUserLog(DescribeUserLogRequest request);

    CompletableFuture<DescribeUsersResponse> describeUsers(DescribeUsersRequest request);

    CompletableFuture<GetUserResponse> getUser(GetUserRequest request);

    CompletableFuture<QueryTemplateListByGroupIdResponse> queryTemplateListByGroupId(QueryTemplateListByGroupIdRequest request);

    CompletableFuture<SyncAddMaterialResponse> syncAddMaterial(SyncAddMaterialRequest request);

    CompletableFuture<UnassignUserResponse> unassignUser(UnassignUserRequest request);

    CompletableFuture<UnbindEslDeviceResponse> unbindEslDevice(UnbindEslDeviceRequest request);

    CompletableFuture<UpdateEslDeviceLightResponse> updateEslDeviceLight(UpdateEslDeviceLightRequest request);

    CompletableFuture<UpdateStoreResponse> updateStore(UpdateStoreRequest request);

    CompletableFuture<UpdateStoreConfigResponse> updateStoreConfig(UpdateStoreConfigRequest request);

}
