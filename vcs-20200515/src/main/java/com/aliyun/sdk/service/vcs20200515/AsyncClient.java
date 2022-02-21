// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vcs20200515.models.*;
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

    CompletableFuture<AddAiotDevicesResponse> addAiotDevices(AddAiotDevicesRequest request);

    CompletableFuture<AddAiotPersonTableResponse> addAiotPersonTable(AddAiotPersonTableRequest request);

    CompletableFuture<AddAiotPersonTableItemResponse> addAiotPersonTableItem(AddAiotPersonTableItemRequest request);

    CompletableFuture<AddAiotPersonTableItemsResponse> addAiotPersonTableItems(AddAiotPersonTableItemsRequest request);

    CompletableFuture<AddAiotPersonTableItemsForTablesResponse> addAiotPersonTableItemsForTables(AddAiotPersonTableItemsForTablesRequest request);

    CompletableFuture<AddAiotVehicleTableItemsResponse> addAiotVehicleTableItems(AddAiotVehicleTableItemsRequest request);

    CompletableFuture<AddCameraForInstanceResponse> addCameraForInstance(AddCameraForInstanceRequest request);

    CompletableFuture<AddChannelResponse> addChannel(AddChannelRequest request);

    CompletableFuture<AddDataSourceResponse> addDataSource(AddDataSourceRequest request);

    CompletableFuture<AddDeviceResponse> addDevice(AddDeviceRequest request);

    CompletableFuture<AddDoubleVerificationGroupsResponse> addDoubleVerificationGroups(AddDoubleVerificationGroupsRequest request);

    CompletableFuture<AddMonitorResponse> addMonitor(AddMonitorRequest request);

    CompletableFuture<AddProfileResponse> addProfile(AddProfileRequest request);

    CompletableFuture<AddProfileCatalogResponse> addProfileCatalog(AddProfileCatalogRequest request);

    CompletableFuture<AddWatchItemsResponse> addWatchItems(AddWatchItemsRequest request);

    CompletableFuture<BatchDeleteInstanceResponse> batchDeleteInstance(BatchDeleteInstanceRequest request);

    CompletableFuture<BindCorpGroupResponse> bindCorpGroup(BindCorpGroupRequest request);

    CompletableFuture<BindDevicesResponse> bindDevices(BindDevicesRequest request);

    CompletableFuture<BindPersonResponse> bindPerson(BindPersonRequest request);

    CompletableFuture<BindUserResponse> bindUser(BindUserRequest request);

    CompletableFuture<ControlAiotDeviceResponse> controlAiotDevice(ControlAiotDeviceRequest request);

    CompletableFuture<CreateAIInstanceResponse> createAIInstance(CreateAIInstanceRequest request);

    CompletableFuture<CreateComputeInstanceResponse> createComputeInstance(CreateComputeInstanceRequest request);

    CompletableFuture<CreateCorpResponse> createCorp(CreateCorpRequest request);

    CompletableFuture<CreateCorpGroupResponse> createCorpGroup(CreateCorpGroupRequest request);

    CompletableFuture<CreateDeviceResponse> createDevice(CreateDeviceRequest request);

    CompletableFuture<CreateModelServiceResponse> createModelService(CreateModelServiceRequest request);

    CompletableFuture<CreateNewDeviceResponse> createNewDevice(CreateNewDeviceRequest request);

    CompletableFuture<CreateScanDeviceResponse> createScanDevice(CreateScanDeviceRequest request);

    CompletableFuture<CreateUserResponse> createUser(CreateUserRequest request);

    CompletableFuture<CreateUserGroupResponse> createUserGroup(CreateUserGroupRequest request);

    CompletableFuture<CreateVideoComposeTaskResponse> createVideoComposeTask(CreateVideoComposeTaskRequest request);

    CompletableFuture<CreateVideoSummaryTaskResponse> createVideoSummaryTask(CreateVideoSummaryTaskRequest request);

    CompletableFuture<CreateWatchPolicyResponse> createWatchPolicy(CreateWatchPolicyRequest request);

    CompletableFuture<CreateWatchTaskResponse> createWatchTask(CreateWatchTaskRequest request);

    CompletableFuture<DeleteAIInstanceResponse> deleteAIInstance(DeleteAIInstanceRequest request);

    CompletableFuture<DeleteAiotDeviceResponse> deleteAiotDevice(DeleteAiotDeviceRequest request);

    CompletableFuture<DeleteAiotPersonTableResponse> deleteAiotPersonTable(DeleteAiotPersonTableRequest request);

    CompletableFuture<DeleteAiotPersonTableItemResponse> deleteAiotPersonTableItem(DeleteAiotPersonTableItemRequest request);

    CompletableFuture<DeleteAiotVehicleTableItemResponse> deleteAiotVehicleTableItem(DeleteAiotVehicleTableItemRequest request);

    CompletableFuture<DeleteChannelResponse> deleteChannel(DeleteChannelRequest request);

    CompletableFuture<DeleteCorpGroupResponse> deleteCorpGroup(DeleteCorpGroupRequest request);

    CompletableFuture<DeleteDataSourceResponse> deleteDataSource(DeleteDataSourceRequest request);

    CompletableFuture<DeleteDataSourcesResponse> deleteDataSources(DeleteDataSourcesRequest request);

    CompletableFuture<DeleteDeviceResponse> deleteDevice(DeleteDeviceRequest request);

    CompletableFuture<DeleteDeviceForInstanceResponse> deleteDeviceForInstance(DeleteDeviceForInstanceRequest request);

    CompletableFuture<DeleteDevicesResponse> deleteDevices(DeleteDevicesRequest request);

    CompletableFuture<DeleteDoubleVerificationGroupResponse> deleteDoubleVerificationGroup(DeleteDoubleVerificationGroupRequest request);

    CompletableFuture<DeleteIPCDeviceResponse> deleteIPCDevice(DeleteIPCDeviceRequest request);

    CompletableFuture<DeleteModelServiceResponse> deleteModelService(DeleteModelServiceRequest request);

    CompletableFuture<DeleteNVRDeviceResponse> deleteNVRDevice(DeleteNVRDeviceRequest request);

    CompletableFuture<DeleteProfileResponse> deleteProfile(DeleteProfileRequest request);

    CompletableFuture<DeleteProfileCatalogResponse> deleteProfileCatalog(DeleteProfileCatalogRequest request);

    CompletableFuture<DeleteProjectResponse> deleteProject(DeleteProjectRequest request);

    CompletableFuture<DeleteRecordsResponse> deleteRecords(DeleteRecordsRequest request);

    CompletableFuture<DeleteUserResponse> deleteUser(DeleteUserRequest request);

    CompletableFuture<DeleteUserGroupResponse> deleteUserGroup(DeleteUserGroupRequest request);

    CompletableFuture<DeleteVideoSummaryTaskResponse> deleteVideoSummaryTask(DeleteVideoSummaryTaskRequest request);

    CompletableFuture<DeleteWatchPoliciesResponse> deleteWatchPolicies(DeleteWatchPoliciesRequest request);

    CompletableFuture<DeleteWatchTasksResponse> deleteWatchTasks(DeleteWatchTasksRequest request);

    CompletableFuture<DescribeAIInstanceResponse> describeAIInstance(DescribeAIInstanceRequest request);

    CompletableFuture<DescribeAiotDevicesResponse> describeAiotDevices(DescribeAiotDevicesRequest request);

    CompletableFuture<DescribeAiotPersonTableItemsResponse> describeAiotPersonTableItems(DescribeAiotPersonTableItemsRequest request);

    CompletableFuture<DescribeAiotPersonTablesResponse> describeAiotPersonTables(DescribeAiotPersonTablesRequest request);

    CompletableFuture<DescribeAiotVehicleTableItemsResponse> describeAiotVehicleTableItems(DescribeAiotVehicleTableItemsRequest request);

    CompletableFuture<DescribeAiotVehicleTablesResponse> describeAiotVehicleTables(DescribeAiotVehicleTablesRequest request);

    CompletableFuture<DescribeCameraForInstanceResponse> describeCameraForInstance(DescribeCameraForInstanceRequest request);

    CompletableFuture<DescribeChannelsResponse> describeChannels(DescribeChannelsRequest request);

    CompletableFuture<DescribeDataSourcesResponse> describeDataSources(DescribeDataSourcesRequest request);

    CompletableFuture<DescribeDevicesResponse> describeDevices(DescribeDevicesRequest request);

    CompletableFuture<DescribeIpcsResponse> describeIpcs(DescribeIpcsRequest request);

    CompletableFuture<DescribeModelServiceResponse> describeModelService(DescribeModelServiceRequest request);

    CompletableFuture<DescribeModelServiceListResponse> describeModelServiceList(DescribeModelServiceListRequest request);

    CompletableFuture<DescribeNvrDevicesResponse> describeNvrDevices(DescribeNvrDevicesRequest request);

    CompletableFuture<DescribeNvrsResponse> describeNvrs(DescribeNvrsRequest request);

    CompletableFuture<DescribeWatchItemsResponse> describeWatchItems(DescribeWatchItemsRequest request);

    CompletableFuture<DescribeWatchPoliciesResponse> describeWatchPolicies(DescribeWatchPoliciesRequest request);

    CompletableFuture<DescribeWatchTasksResponse> describeWatchTasks(DescribeWatchTasksRequest request);

    CompletableFuture<DescribesDoubleVerificationGroupsResponse> describesDoubleVerificationGroups(DescribesDoubleVerificationGroupsRequest request);

    CompletableFuture<GetAiotStorageInfoResponse> getAiotStorageInfo(GetAiotStorageInfoRequest request);

    CompletableFuture<GetBodyOptionsResponse> getBodyOptions(GetBodyOptionsRequest request);

    CompletableFuture<GetCatalogListResponse> getCatalogList(GetCatalogListRequest request);

    CompletableFuture<GetCityCodeResponse> getCityCode(GetCityCodeRequest request);

    CompletableFuture<GetDataSourceStatsResponse> getDataSourceStats(GetDataSourceStatsRequest request);

    CompletableFuture<GetDeviceCaptureStrategyResponse> getDeviceCaptureStrategy(GetDeviceCaptureStrategyRequest request);

    CompletableFuture<GetDeviceConfigResponse> getDeviceConfig(GetDeviceConfigRequest request);

    CompletableFuture<GetDeviceLiveUrlResponse> getDeviceLiveUrl(GetDeviceLiveUrlRequest request);

    CompletableFuture<GetDevicePictureResponse> getDevicePicture(GetDevicePictureRequest request);

    CompletableFuture<GetDeviceStatsResponse> getDeviceStats(GetDeviceStatsRequest request);

    CompletableFuture<GetDeviceVideoUrlResponse> getDeviceVideoUrl(GetDeviceVideoUrlRequest request);

    CompletableFuture<GetFaceModelResultResponse> getFaceModelResult(GetFaceModelResultRequest request);

    CompletableFuture<GetFaceOptionsResponse> getFaceOptions(GetFaceOptionsRequest request);

    CompletableFuture<GetInventoryResponse> getInventory(GetInventoryRequest request);

    CompletableFuture<GetMonitorListResponse> getMonitorList(GetMonitorListRequest request);

    CompletableFuture<GetMonitorResultResponse> getMonitorResult(GetMonitorResultRequest request);

    CompletableFuture<GetPersonDetailResponse> getPersonDetail(GetPersonDetailRequest request);

    CompletableFuture<GetPersonListResponse> getPersonList(GetPersonListRequest request);

    CompletableFuture<GetPictureUrlResponse> getPictureUrl(GetPictureUrlRequest request);

    CompletableFuture<GetProfileDetailResponse> getProfileDetail(GetProfileDetailRequest request);

    CompletableFuture<GetProfileListResponse> getProfileList(GetProfileListRequest request);

    CompletableFuture<GetScanSubDevicesResponse> getScanSubDevices(GetScanSubDevicesRequest request);

    CompletableFuture<GetUserDetailResponse> getUserDetail(GetUserDetailRequest request);

    CompletableFuture<GetVideoComposeResultResponse> getVideoComposeResult(GetVideoComposeResultRequest request);

    CompletableFuture<GetVideoSummaryTaskResultResponse> getVideoSummaryTaskResult(GetVideoSummaryTaskResultRequest request);

    CompletableFuture<InvokeMotorModelResponse> invokeMotorModel(InvokeMotorModelRequest request);

    CompletableFuture<ListAccessNumberResponse> listAccessNumber(ListAccessNumberRequest request);

    CompletableFuture<ListAlgorithmNamesByDeviceIdsResponse> listAlgorithmNamesByDeviceIds(ListAlgorithmNamesByDeviceIdsRequest request);

    CompletableFuture<ListBodyAlgorithmResultsResponse> listBodyAlgorithmResults(ListBodyAlgorithmResultsRequest request);

    CompletableFuture<ListCorpGroupMetricsResponse> listCorpGroupMetrics(ListCorpGroupMetricsRequest request);

    CompletableFuture<ListCorpGroupsResponse> listCorpGroups(ListCorpGroupsRequest request);

    CompletableFuture<ListCorpMetricsResponse> listCorpMetrics(ListCorpMetricsRequest request);

    CompletableFuture<ListCorpsResponse> listCorps(ListCorpsRequest request);

    CompletableFuture<ListDeviceGroupsResponse> listDeviceGroups(ListDeviceGroupsRequest request);

    CompletableFuture<ListDevicesResponse> listDevices(ListDevicesRequest request);

    CompletableFuture<ListEventAlgorithmDetailsResponse> listEventAlgorithmDetails(ListEventAlgorithmDetailsRequest request);

    CompletableFuture<ListEventAlgorithmResultsResponse> listEventAlgorithmResults(ListEventAlgorithmResultsRequest request);

    CompletableFuture<ListFaceAlgorithmResultsResponse> listFaceAlgorithmResults(ListFaceAlgorithmResultsRequest request);

    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    CompletableFuture<ListMetricsResponse> listMetrics(ListMetricsRequest request);

    CompletableFuture<ListMotorAlgorithmResultsResponse> listMotorAlgorithmResults(ListMotorAlgorithmResultsRequest request);

    CompletableFuture<ListNVRChannelDeviceResponse> listNVRChannelDevice(ListNVRChannelDeviceRequest request);

    CompletableFuture<ListNVRDeviceResponse> listNVRDevice(ListNVRDeviceRequest request);

    CompletableFuture<ListPersonTraceResponse> listPersonTrace(ListPersonTraceRequest request);

    CompletableFuture<ListPersonTraceDetailsResponse> listPersonTraceDetails(ListPersonTraceDetailsRequest request);

    CompletableFuture<ListPersonVisitCountResponse> listPersonVisitCount(ListPersonVisitCountRequest request);

    CompletableFuture<ListPersonsResponse> listPersons(ListPersonsRequest request);

    CompletableFuture<ListSubscribeDeviceResponse> listSubscribeDevice(ListSubscribeDeviceRequest request);

    CompletableFuture<ListUserGroupsResponse> listUserGroups(ListUserGroupsRequest request);

    CompletableFuture<ListUsersResponse> listUsers(ListUsersRequest request);

    CompletableFuture<ModifyDeviceResponse> modifyDevice(ModifyDeviceRequest request);

    CompletableFuture<PeekNvrResponse> peekNvr(PeekNvrRequest request);

    CompletableFuture<RaiseDevicesStorageResponse> raiseDevicesStorage(RaiseDevicesStorageRequest request);

    CompletableFuture<RecognizeFaceQualityResponse> recognizeFaceQuality(RecognizeFaceQualityRequest request);

    CompletableFuture<RecognizeImageResponse> recognizeImage(RecognizeImageRequest request);

    CompletableFuture<RegisterDeviceResponse> registerDevice(RegisterDeviceRequest request);

    CompletableFuture<RemoveCameraForInstanceResponse> removeCameraForInstance(RemoveCameraForInstanceRequest request);

    CompletableFuture<RemoveWatchItemsResponse> removeWatchItems(RemoveWatchItemsRequest request);

    CompletableFuture<SaveVideoSummaryTaskVideoResponse> saveVideoSummaryTaskVideo(SaveVideoSummaryTaskVideoRequest request);

    CompletableFuture<ScanSubDeviceResponse> scanSubDevice(ScanSubDeviceRequest request);

    CompletableFuture<SearchBodyResponse> searchBody(SearchBodyRequest request);

    CompletableFuture<SearchFaceResponse> searchFace(SearchFaceRequest request);

    CompletableFuture<SearchObjectResponse> searchObject(SearchObjectRequest request);

    CompletableFuture<SearchTargetResponse> searchTarget(SearchTargetRequest request);

    CompletableFuture<SetAiotStorageInfoResponse> setAiotStorageInfo(SetAiotStorageInfoRequest request);

    CompletableFuture<SetStreamModeResponse> setStreamMode(SetStreamModeRequest request);

    CompletableFuture<StartModelServiceResponse> startModelService(StartModelServiceRequest request);

    CompletableFuture<StartStreamsResponse> startStreams(StartStreamsRequest request);

    CompletableFuture<StopModelServiceResponse> stopModelService(StopModelServiceRequest request);

    CompletableFuture<StopMonitorResponse> stopMonitor(StopMonitorRequest request);

    CompletableFuture<StopStreamsResponse> stopStreams(StopStreamsRequest request);

    CompletableFuture<SubscribeDeviceEventResponse> subscribeDeviceEvent(SubscribeDeviceEventRequest request);

    CompletableFuture<SubscribeSpaceEventResponse> subscribeSpaceEvent(SubscribeSpaceEventRequest request);

    CompletableFuture<SyncDeviceTimeResponse> syncDeviceTime(SyncDeviceTimeRequest request);

    CompletableFuture<UnbindCorpGroupResponse> unbindCorpGroup(UnbindCorpGroupRequest request);

    CompletableFuture<UnbindDevicesResponse> unbindDevices(UnbindDevicesRequest request);

    CompletableFuture<UnbindPersonResponse> unbindPerson(UnbindPersonRequest request);

    CompletableFuture<UnbindUserResponse> unbindUser(UnbindUserRequest request);

    CompletableFuture<UnsubscribeDeviceEventResponse> unsubscribeDeviceEvent(UnsubscribeDeviceEventRequest request);

    CompletableFuture<UnsubscribeSpaceEventResponse> unsubscribeSpaceEvent(UnsubscribeSpaceEventRequest request);

    CompletableFuture<UpdateAiotDeviceResponse> updateAiotDevice(UpdateAiotDeviceRequest request);

    CompletableFuture<UpdateAiotPersonTableResponse> updateAiotPersonTable(UpdateAiotPersonTableRequest request);

    CompletableFuture<UpdateAiotPersonTableItemResponse> updateAiotPersonTableItem(UpdateAiotPersonTableItemRequest request);

    CompletableFuture<UpdateAiotVehicleTableItemResponse> updateAiotVehicleTableItem(UpdateAiotVehicleTableItemRequest request);

    CompletableFuture<UpdateCorpResponse> updateCorp(UpdateCorpRequest request);

    CompletableFuture<UpdateDataSourceResponse> updateDataSource(UpdateDataSourceRequest request);

    CompletableFuture<UpdateDeviceResponse> updateDevice(UpdateDeviceRequest request);

    CompletableFuture<UpdateDeviceCaptureStrategyResponse> updateDeviceCaptureStrategy(UpdateDeviceCaptureStrategyRequest request);

    CompletableFuture<UpdateDevicesStorageResponse> updateDevicesStorage(UpdateDevicesStorageRequest request);

    CompletableFuture<UpdateDoubleVerificationGroupResponse> updateDoubleVerificationGroup(UpdateDoubleVerificationGroupRequest request);

    CompletableFuture<UpdateModelServiceResponse> updateModelService(UpdateModelServiceRequest request);

    CompletableFuture<UpdateMonitorResponse> updateMonitor(UpdateMonitorRequest request);

    CompletableFuture<UpdateProfileResponse> updateProfile(UpdateProfileRequest request);

    CompletableFuture<UpdateProfileCatalogResponse> updateProfileCatalog(UpdateProfileCatalogRequest request);

    CompletableFuture<UpdateUserResponse> updateUser(UpdateUserRequest request);

    CompletableFuture<UpdateUserGroupResponse> updateUserGroup(UpdateUserGroupRequest request);

    CompletableFuture<UpdateWatchPolicyResponse> updateWatchPolicy(UpdateWatchPolicyRequest request);

    CompletableFuture<UpdateWatchTaskResponse> updateWatchTask(UpdateWatchTaskRequest request);

    CompletableFuture<UploadFileResponse> uploadFile(UploadFileRequest request);

    CompletableFuture<UploadImageResponse> uploadImage(UploadImageRequest request);

    CompletableFuture<VerifyDeviceResponse> verifyDevice(VerifyDeviceRequest request);

}
