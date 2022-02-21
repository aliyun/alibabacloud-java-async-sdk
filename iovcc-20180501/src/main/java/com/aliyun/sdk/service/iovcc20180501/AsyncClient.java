// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.iovcc20180501.models.*;
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

    CompletableFuture<AddUploadedFunctionFileInfoResponse> addUploadedFunctionFileInfo(AddUploadedFunctionFileInfoRequest request);

    CompletableFuture<AddVersionBlackDevicesResponse> addVersionBlackDevices(AddVersionBlackDevicesRequest request);

    CompletableFuture<AddVersionGroupDevicesResponse> addVersionGroupDevices(AddVersionGroupDevicesRequest request);

    CompletableFuture<AddVersionWhiteDevicesResponse> addVersionWhiteDevices(AddVersionWhiteDevicesRequest request);

    CompletableFuture<AddVersionWhiteDevicesByDeviceGroupsResponse> addVersionWhiteDevicesByDeviceGroups(AddVersionWhiteDevicesByDeviceGroupsRequest request);

    CompletableFuture<ConnectAssistDeviceResponse> connectAssistDevice(ConnectAssistDeviceRequest request);

    CompletableFuture<ControlGeoFenceResponse> controlGeoFence(ControlGeoFenceRequest request);

    CompletableFuture<CountActivatedOrNewRegistrationDeviceResponse> countActivatedOrNewRegistrationDevice(CountActivatedOrNewRegistrationDeviceRequest request);

    CompletableFuture<CountDeviceBrandsResponse> countDeviceBrands(CountDeviceBrandsRequest request);

    CompletableFuture<CountDeviceModelsResponse> countDeviceModels(CountDeviceModelsRequest request);

    CompletableFuture<CountDevicesResponse> countDevices(CountDevicesRequest request);

    CompletableFuture<CountProjectsResponse> countProjects(CountProjectsRequest request);

    CompletableFuture<CountYunIdInfoResponse> countYunIdInfo(CountYunIdInfoRequest request);

    CompletableFuture<CreateAppVersionResponse> createAppVersion(CreateAppVersionRequest request);

    CompletableFuture<CreateCustomizedFilterResponse> createCustomizedFilter(CreateCustomizedFilterRequest request);

    CompletableFuture<CreateCustomizedPropertyResponse> createCustomizedProperty(CreateCustomizedPropertyRequest request);

    CompletableFuture<CreateDeviceResponse> createDevice(CreateDeviceRequest request);

    CompletableFuture<CreateDeviceBrandResponse> createDeviceBrand(CreateDeviceBrandRequest request);

    CompletableFuture<CreateDeviceModelResponse> createDeviceModel(CreateDeviceModelRequest request);

    CompletableFuture<CreateGeoFenceResponse> createGeoFence(CreateGeoFenceRequest request);

    CompletableFuture<CreateMqttRootTopicResponse> createMqttRootTopic(CreateMqttRootTopicRequest request);

    CompletableFuture<CreateNamespaceResponse> createNamespace(CreateNamespaceRequest request);

    CompletableFuture<CreateOsVersionResponse> createOsVersion(CreateOsVersionRequest request);

    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    CompletableFuture<CreateProjectAppResponse> createProjectApp(CreateProjectAppRequest request);

    CompletableFuture<CreateRamUserResponse> createRamUser(CreateRamUserRequest request);

    CompletableFuture<CreateRpcServiceResponse> createRpcService(CreateRpcServiceRequest request);

    CompletableFuture<CreateSchemaSubscribeResponse> createSchemaSubscribe(CreateSchemaSubscribeRequest request);

    CompletableFuture<CreateShadowSchemaResponse> createShadowSchema(CreateShadowSchemaRequest request);

    CompletableFuture<CreateSubscribeResponse> createSubscribe(CreateSubscribeRequest request);

    CompletableFuture<CreateTriggerResponse> createTrigger(CreateTriggerRequest request);

    CompletableFuture<CreateUpstreamAppKeyRelationResponse> createUpstreamAppKeyRelation(CreateUpstreamAppKeyRelationRequest request);

    CompletableFuture<CreateUpstreamAppKeyRelationsResponse> createUpstreamAppKeyRelations(CreateUpstreamAppKeyRelationsRequest request);

    CompletableFuture<CreateUpstreamAppServerResponse> createUpstreamAppServer(CreateUpstreamAppServerRequest request);

    CompletableFuture<CreateUserPrivilegeResponse> createUserPrivilege(CreateUserPrivilegeRequest request);

    CompletableFuture<CreateVersionDeviceGroupResponse> createVersionDeviceGroup(CreateVersionDeviceGroupRequest request);

    CompletableFuture<CreateVersionPrepublishResponse> createVersionPrepublish(CreateVersionPrepublishRequest request);

    CompletableFuture<CreateVersionTestResponse> createVersionTest(CreateVersionTestRequest request);

    CompletableFuture<DelayPublishOsVersionResponse> delayPublishOsVersion(DelayPublishOsVersionRequest request);

    CompletableFuture<DeleteAllCustomizedFiltersResponse> deleteAllCustomizedFilters(DeleteAllCustomizedFiltersRequest request);

    CompletableFuture<DeleteAllVersionGroupDevicesResponse> deleteAllVersionGroupDevices(DeleteAllVersionGroupDevicesRequest request);

    CompletableFuture<DeleteCameraShootingRecordResponse> deleteCameraShootingRecord(DeleteCameraShootingRecordRequest request);

    CompletableFuture<DeleteCustomizedFilterResponse> deleteCustomizedFilter(DeleteCustomizedFilterRequest request);

    CompletableFuture<DeleteCustomizedPropertyResponse> deleteCustomizedProperty(DeleteCustomizedPropertyRequest request);

    CompletableFuture<DeleteDeviceResponse> deleteDevice(DeleteDeviceRequest request);

    CompletableFuture<DeleteFunctionFileResponse> deleteFunctionFile(DeleteFunctionFileRequest request);

    CompletableFuture<DeleteGeoFenceResponse> deleteGeoFence(DeleteGeoFenceRequest request);

    CompletableFuture<DeleteMqttRootTopicResponse> deleteMqttRootTopic(DeleteMqttRootTopicRequest request);

    CompletableFuture<DeleteNamespaceResponse> deleteNamespace(DeleteNamespaceRequest request);

    CompletableFuture<DeleteOpenAccountResponse> deleteOpenAccount(DeleteOpenAccountRequest request);

    CompletableFuture<DeleteProjectAppResponse> deleteProjectApp(DeleteProjectAppRequest request);

    CompletableFuture<DeleteRpcServiceResponse> deleteRpcService(DeleteRpcServiceRequest request);

    CompletableFuture<DeleteSchemaSubscribeResponse> deleteSchemaSubscribe(DeleteSchemaSubscribeRequest request);

    CompletableFuture<DeleteShadowSchemaResponse> deleteShadowSchema(DeleteShadowSchemaRequest request);

    CompletableFuture<DeleteTriggerResponse> deleteTrigger(DeleteTriggerRequest request);

    CompletableFuture<DeleteUpstreamAppKeyRelationResponse> deleteUpstreamAppKeyRelation(DeleteUpstreamAppKeyRelationRequest request);

    CompletableFuture<DeleteUpstreamAppServerResponse> deleteUpstreamAppServer(DeleteUpstreamAppServerRequest request);

    CompletableFuture<DeleteVersionAllBlackDevicesResponse> deleteVersionAllBlackDevices(DeleteVersionAllBlackDevicesRequest request);

    CompletableFuture<DeleteVersionAllWhiteDevicesResponse> deleteVersionAllWhiteDevices(DeleteVersionAllWhiteDevicesRequest request);

    CompletableFuture<DeleteVersionBlackDevicesResponse> deleteVersionBlackDevices(DeleteVersionBlackDevicesRequest request);

    CompletableFuture<DeleteVersionBlackDevicesByIdResponse> deleteVersionBlackDevicesById(DeleteVersionBlackDevicesByIdRequest request);

    CompletableFuture<DeleteVersionDeviceGroupResponse> deleteVersionDeviceGroup(DeleteVersionDeviceGroupRequest request);

    CompletableFuture<DeleteVersionGroupDeviceResponse> deleteVersionGroupDevice(DeleteVersionGroupDeviceRequest request);

    CompletableFuture<DeleteVersionGroupDeviceByIdResponse> deleteVersionGroupDeviceById(DeleteVersionGroupDeviceByIdRequest request);

    CompletableFuture<DeleteVersionTestResponse> deleteVersionTest(DeleteVersionTestRequest request);

    CompletableFuture<DeleteVersionWhiteDevicesResponse> deleteVersionWhiteDevices(DeleteVersionWhiteDevicesRequest request);

    CompletableFuture<DeleteVersionWhiteDevicesByIdResponse> deleteVersionWhiteDevicesById(DeleteVersionWhiteDevicesByIdRequest request);

    CompletableFuture<DeployFunctionFileResponse> deployFunctionFile(DeployFunctionFileRequest request);

    CompletableFuture<DescribeApiGatewayAppSecurityResponse> describeApiGatewayAppSecurity(DescribeApiGatewayAppSecurityRequest request);

    CompletableFuture<DescribeAppVersionResponse> describeAppVersion(DescribeAppVersionRequest request);

    CompletableFuture<DescribeAssistRTMPServerAddressResponse> describeAssistRTMPServerAddress(DescribeAssistRTMPServerAddressRequest request);

    CompletableFuture<DescribeAssistReportResponse> describeAssistReport(DescribeAssistReportRequest request);

    CompletableFuture<DescribeAssistWSServerAddressResponse> describeAssistWSServerAddress(DescribeAssistWSServerAddressRequest request);

    CompletableFuture<DescribeCustomizedFilterResponse> describeCustomizedFilter(DescribeCustomizedFilterRequest request);

    CompletableFuture<DescribeDefaultSchemaResponse> describeDefaultSchema(DescribeDefaultSchemaRequest request);

    CompletableFuture<DescribeDeviceResponse> describeDevice(DescribeDeviceRequest request);

    CompletableFuture<DescribeDeviceBrandResponse> describeDeviceBrand(DescribeDeviceBrandRequest request);

    CompletableFuture<DescribeDeviceIdByHardwareIdResponse> describeDeviceIdByHardwareId(DescribeDeviceIdByHardwareIdRequest request);

    CompletableFuture<DescribeDeviceIdByOuterInfoResponse> describeDeviceIdByOuterInfo(DescribeDeviceIdByOuterInfoRequest request);

    CompletableFuture<DescribeDeviceInfoResponse> describeDeviceInfo(DescribeDeviceInfoRequest request);

    CompletableFuture<DescribeDeviceModelResponse> describeDeviceModel(DescribeDeviceModelRequest request);

    CompletableFuture<DescribeDeviceOnlineInfoResponse> describeDeviceOnlineInfo(DescribeDeviceOnlineInfoRequest request);

    CompletableFuture<DescribeDeviceShadowResponse> describeDeviceShadow(DescribeDeviceShadowRequest request);

    CompletableFuture<DescribeDeviceValiditySchemaResponse> describeDeviceValiditySchema(DescribeDeviceValiditySchemaRequest request);

    CompletableFuture<DescribeMessageResponse> describeMessage(DescribeMessageRequest request);

    CompletableFuture<DescribeMqttClientStatusResponse> describeMqttClientStatus(DescribeMqttClientStatusRequest request);

    CompletableFuture<DescribeMqttMessageResponse> describeMqttMessage(DescribeMqttMessageRequest request);

    CompletableFuture<DescribeMqttTopicSubscriptionResponse> describeMqttTopicSubscription(DescribeMqttTopicSubscriptionRequest request);

    CompletableFuture<DescribeOpenAccountResponse> describeOpenAccount(DescribeOpenAccountRequest request);

    CompletableFuture<DescribeOsVersionResponse> describeOsVersion(DescribeOsVersionRequest request);

    CompletableFuture<DescribeProjectResponse> describeProject(DescribeProjectRequest request);

    CompletableFuture<DescribeProjectAppSecurityResponse> describeProjectAppSecurity(DescribeProjectAppSecurityRequest request);

    CompletableFuture<DescribeShadowSchemaResponse> describeShadowSchema(DescribeShadowSchemaRequest request);

    CompletableFuture<DescribeVersionDeviceGroupResponse> describeVersionDeviceGroup(DescribeVersionDeviceGroupRequest request);

    CompletableFuture<DiagnosisVersionResponse> diagnosisVersion(DiagnosisVersionRequest request);

    CompletableFuture<ExecuteCameraShootingCommandResponse> executeCameraShootingCommand(ExecuteCameraShootingCommandRequest request);

    CompletableFuture<ExecuteRemoteCommandResponse> executeRemoteCommand(ExecuteRemoteCommandRequest request);

    CompletableFuture<ExecuteVehicleControlResponse> executeVehicleControl(ExecuteVehicleControlRequest request);

    CompletableFuture<FindAppVersionsResponse> findAppVersions(FindAppVersionsRequest request);

    CompletableFuture<FindCustomizedFiltersResponse> findCustomizedFilters(FindCustomizedFiltersRequest request);

    CompletableFuture<FindCustomizedPropertiesResponse> findCustomizedProperties(FindCustomizedPropertiesRequest request);

    CompletableFuture<FindOsVersionsResponse> findOsVersions(FindOsVersionsRequest request);

    CompletableFuture<FindPrepublishPassedDevicesResponse> findPrepublishPassedDevices(FindPrepublishPassedDevicesRequest request);

    CompletableFuture<FindPrepublishesByParentIdResponse> findPrepublishesByParentId(FindPrepublishesByParentIdRequest request);

    CompletableFuture<FindPrepublishesByVersionIdResponse> findPrepublishesByVersionId(FindPrepublishesByVersionIdRequest request);

    CompletableFuture<FindVersionBlackDevicesResponse> findVersionBlackDevices(FindVersionBlackDevicesRequest request);

    CompletableFuture<FindVersionDeviceGroupsResponse> findVersionDeviceGroups(FindVersionDeviceGroupsRequest request);

    CompletableFuture<FindVersionGroupDevicesResponse> findVersionGroupDevices(FindVersionGroupDevicesRequest request);

    CompletableFuture<FindVersionMessageSendRecordsResponse> findVersionMessageSendRecords(FindVersionMessageSendRecordsRequest request);

    CompletableFuture<FindVersionMessagesResponse> findVersionMessages(FindVersionMessagesRequest request);

    CompletableFuture<FindVersionTestsResponse> findVersionTests(FindVersionTestsRequest request);

    CompletableFuture<FindVersionWhiteDevicesResponse> findVersionWhiteDevices(FindVersionWhiteDevicesRequest request);

    CompletableFuture<GenerateAssistFileUploadUrlResponse> generateAssistFileUploadUrl(GenerateAssistFileUploadUrlRequest request);

    CompletableFuture<GenerateFunctionFileUploadMetaResponse> generateFunctionFileUploadMeta(GenerateFunctionFileUploadMetaRequest request);

    CompletableFuture<GenerateOssPostPolicyResponse> generateOssPostPolicy(GenerateOssPostPolicyRequest request);

    CompletableFuture<GenerateOssUploadMetaResponse> generateOssUploadMeta(GenerateOssUploadMetaRequest request);

    CompletableFuture<GenerateSdkDownloadInfoResponse> generateSdkDownloadInfo(GenerateSdkDownloadInfoRequest request);

    CompletableFuture<GenerateSysAppDownloadInfoResponse> generateSysAppDownloadInfo(GenerateSysAppDownloadInfoRequest request);

    CompletableFuture<GetCommercialVehicleDeviceResponse> getCommercialVehicleDevice(GetCommercialVehicleDeviceRequest request);

    CompletableFuture<GetCommercialVehicleTrackResponse> getCommercialVehicleTrack(GetCommercialVehicleTrackRequest request);

    CompletableFuture<GetDeviceAppUpdateFunnelEventsResponse> getDeviceAppUpdateFunnelEvents(GetDeviceAppUpdateFunnelEventsRequest request);

    CompletableFuture<GetDeviceSystemUpdateFunnelEventsResponse> getDeviceSystemUpdateFunnelEvents(GetDeviceSystemUpdateFunnelEventsRequest request);

    CompletableFuture<GetFenceScopeResponse> getFenceScope(GetFenceScopeRequest request);

    CompletableFuture<GetGeoFenceDetailResponse> getGeoFenceDetail(GetGeoFenceDetailRequest request);

    CompletableFuture<GetNamespaceDataResponse> getNamespaceData(GetNamespaceDataRequest request);

    CompletableFuture<GetNamespaceStatisticsDataResponse> getNamespaceStatisticsData(GetNamespaceStatisticsDataRequest request);

    CompletableFuture<GetOssUploadMetaResponse> getOssUploadMeta(GetOssUploadMetaRequest request);

    CompletableFuture<GetVehicleControlResultResponse> getVehicleControlResult(GetVehicleControlResultRequest request);

    CompletableFuture<GetVehicleTrackResponse> getVehicleTrack(GetVehicleTrackRequest request);

    CompletableFuture<InvokeFunctionResponse> invokeFunction(InvokeFunctionRequest request);

    CompletableFuture<ListAlarmRecordResponse> listAlarmRecord(ListAlarmRecordRequest request);

    CompletableFuture<ListApiGatewayAppsResponse> listApiGatewayApps(ListApiGatewayAppsRequest request);

    CompletableFuture<ListAppsResponse> listApps(ListAppsRequest request);

    CompletableFuture<ListAssistActionDetailsResponse> listAssistActionDetails(ListAssistActionDetailsRequest request);

    CompletableFuture<ListAssistDevicesResponse> listAssistDevices(ListAssistDevicesRequest request);

    CompletableFuture<ListAssistHistoriesResponse> listAssistHistories(ListAssistHistoriesRequest request);

    CompletableFuture<ListAssistHistoryDetailsResponse> listAssistHistoryDetails(ListAssistHistoryDetailsRequest request);

    CompletableFuture<ListCameraShootingAttachmentsResponse> listCameraShootingAttachments(ListCameraShootingAttachmentsRequest request);

    CompletableFuture<ListCameraShootingRecordsResponse> listCameraShootingRecords(ListCameraShootingRecordsRequest request);

    CompletableFuture<ListClientPluginVersionsResponse> listClientPluginVersions(ListClientPluginVersionsRequest request);

    CompletableFuture<ListClientPluginsResponse> listClientPlugins(ListClientPluginsRequest request);

    CompletableFuture<ListClientSdksResponse> listClientSdks(ListClientSdksRequest request);

    CompletableFuture<ListCommercialVehicleDevicesResponse> listCommercialVehicleDevices(ListCommercialVehicleDevicesRequest request);

    CompletableFuture<ListConnectLogsResponse> listConnectLogs(ListConnectLogsRequest request);

    CompletableFuture<ListDeployedFunctionsResponse> listDeployedFunctions(ListDeployedFunctionsRequest request);

    CompletableFuture<ListDeviceBrandsResponse> listDeviceBrands(ListDeviceBrandsRequest request);

    CompletableFuture<ListDeviceModelResponse> listDeviceModel(ListDeviceModelRequest request);

    CompletableFuture<ListDeviceModelsResponse> listDeviceModels(ListDeviceModelsRequest request);

    CompletableFuture<ListDeviceTypesResponse> listDeviceTypes(ListDeviceTypesRequest request);

    CompletableFuture<ListDevicesResponse> listDevices(ListDevicesRequest request);

    CompletableFuture<ListEdgeDevicesResponse> listEdgeDevices(ListEdgeDevicesRequest request);

    CompletableFuture<ListFunctionExecuteLogResponse> listFunctionExecuteLog(ListFunctionExecuteLogRequest request);

    CompletableFuture<ListFunctionFilesResponse> listFunctionFiles(ListFunctionFilesRequest request);

    CompletableFuture<ListFunctionFilesByProjectIdResponse> listFunctionFilesByProjectId(ListFunctionFilesByProjectIdRequest request);

    CompletableFuture<ListGeoFenceResponse> listGeoFence(ListGeoFenceRequest request);

    CompletableFuture<ListGeoFenceDetailResponse> listGeoFenceDetail(ListGeoFenceDetailRequest request);

    CompletableFuture<ListHostDevicesResponse> listHostDevices(ListHostDevicesRequest request);

    CompletableFuture<ListMessageAcksResponse> listMessageAcks(ListMessageAcksRequest request);

    CompletableFuture<ListMessageReceiversResponse> listMessageReceivers(ListMessageReceiversRequest request);

    CompletableFuture<ListMqttClientSubscriptionsResponse> listMqttClientSubscriptions(ListMqttClientSubscriptionsRequest request);

    CompletableFuture<ListMqttMessageLogsResponse> listMqttMessageLogs(ListMqttMessageLogsRequest request);

    CompletableFuture<ListMqttRootTopicsResponse> listMqttRootTopics(ListMqttRootTopicsRequest request);

    CompletableFuture<ListNamespacesResponse> listNamespaces(ListNamespacesRequest request);

    CompletableFuture<ListOfflineMessagesResponse> listOfflineMessages(ListOfflineMessagesRequest request);

    CompletableFuture<ListOpenAccountLinksResponse> listOpenAccountLinks(ListOpenAccountLinksRequest request);

    CompletableFuture<ListOpenAccountsResponse> listOpenAccounts(ListOpenAccountsRequest request);

    CompletableFuture<ListPreChecksResponse> listPreChecks(ListPreChecksRequest request);

    CompletableFuture<ListProjectAppsResponse> listProjectApps(ListProjectAppsRequest request);

    CompletableFuture<ListProjectsResponse> listProjects(ListProjectsRequest request);

    CompletableFuture<ListRealTimeLocationByCityResponse> listRealTimeLocationByCity(ListRealTimeLocationByCityRequest request);

    CompletableFuture<ListRealTimeLocationByDeviceResponse> listRealTimeLocationByDevice(ListRealTimeLocationByDeviceRequest request);

    CompletableFuture<ListRealTimeLocationByModelResponse> listRealTimeLocationByModel(ListRealTimeLocationByModelRequest request);

    CompletableFuture<ListRpcServicesResponse> listRpcServices(ListRpcServicesRequest request);

    CompletableFuture<ListSchemaSubscribesResponse> listSchemaSubscribes(ListSchemaSubscribesRequest request);

    CompletableFuture<ListServicesResponse> listServices(ListServicesRequest request);

    CompletableFuture<ListShadowSchemaDeviceModelsResponse> listShadowSchemaDeviceModels(ListShadowSchemaDeviceModelsRequest request);

    CompletableFuture<ListShadowSchemasResponse> listShadowSchemas(ListShadowSchemasRequest request);

    CompletableFuture<ListSupportFeaturesResponse> listSupportFeatures(ListSupportFeaturesRequest request);

    CompletableFuture<ListTrackByTimeResponse> listTrackByTime(ListTrackByTimeRequest request);

    CompletableFuture<ListTriggersResponse> listTriggers(ListTriggersRequest request);

    CompletableFuture<ListUpstreamAppKeyRelationsResponse> listUpstreamAppKeyRelations(ListUpstreamAppKeyRelationsRequest request);

    CompletableFuture<ListUpstreamAppServersResponse> listUpstreamAppServers(ListUpstreamAppServersRequest request);

    CompletableFuture<ListVehicleResponse> listVehicle(ListVehicleRequest request);

    CompletableFuture<ListVersionDeviceGroupsResponse> listVersionDeviceGroups(ListVersionDeviceGroupsRequest request);

    CompletableFuture<PublishAppVersionResponse> publishAppVersion(PublishAppVersionRequest request);

    CompletableFuture<PublishMqttMessageResponse> publishMqttMessage(PublishMqttMessageRequest request);

    CompletableFuture<PublishOsVersionResponse> publishOsVersion(PublishOsVersionRequest request);

    CompletableFuture<PushConfigInfoResponse> pushConfigInfo(PushConfigInfoRequest request);

    CompletableFuture<PushMessageResponse> pushMessage(PushMessageRequest request);

    CompletableFuture<PushVersionMessageResponse> pushVersionMessage(PushVersionMessageRequest request);

    CompletableFuture<QueryPrepublishPassedDeviceCountResponse> queryPrepublishPassedDeviceCount(QueryPrepublishPassedDeviceCountRequest request);

    CompletableFuture<SetFenceScopeResponse> setFenceScope(SetFenceScopeRequest request);

    CompletableFuture<SubmitAssistReportResponse> submitAssistReport(SubmitAssistReportRequest request);

    CompletableFuture<UpdateApiGatewayAppStatusResponse> updateApiGatewayAppStatus(UpdateApiGatewayAppStatusRequest request);

    CompletableFuture<UpdateAppBlackWhiteVersionsResponse> updateAppBlackWhiteVersions(UpdateAppBlackWhiteVersionsRequest request);

    CompletableFuture<UpdateAppVersionResponse> updateAppVersion(UpdateAppVersionRequest request);

    CompletableFuture<UpdateAppVersionReleaseNoteResponse> updateAppVersionReleaseNote(UpdateAppVersionReleaseNoteRequest request);

    CompletableFuture<UpdateAppVersionRemarkResponse> updateAppVersionRemark(UpdateAppVersionRemarkRequest request);

    CompletableFuture<UpdateAppVersionStatusResponse> updateAppVersionStatus(UpdateAppVersionStatusRequest request);

    CompletableFuture<UpdateCustomizedFilterResponse> updateCustomizedFilter(UpdateCustomizedFilterRequest request);

    CompletableFuture<UpdateDeviceModelResponse> updateDeviceModel(UpdateDeviceModelRequest request);

    CompletableFuture<UpdateGeoFenceResponse> updateGeoFence(UpdateGeoFenceRequest request);

    CompletableFuture<UpdateNamespaceDataResponse> updateNamespaceData(UpdateNamespaceDataRequest request);

    CompletableFuture<UpdateOsBlackWhiteVersionsResponse> updateOsBlackWhiteVersions(UpdateOsBlackWhiteVersionsRequest request);

    CompletableFuture<UpdateOsVersionResponse> updateOsVersion(UpdateOsVersionRequest request);

    CompletableFuture<UpdateOsVersionReleaseNoteResponse> updateOsVersionReleaseNote(UpdateOsVersionReleaseNoteRequest request);

    CompletableFuture<UpdateOsVersionRemarkResponse> updateOsVersionRemark(UpdateOsVersionRemarkRequest request);

    CompletableFuture<UpdateOsVersionStatusResponse> updateOsVersionStatus(UpdateOsVersionStatusRequest request);

    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

    CompletableFuture<UpdateSchemaSubscribeResponse> updateSchemaSubscribe(UpdateSchemaSubscribeRequest request);

    CompletableFuture<UpdateShadowSchemaResponse> updateShadowSchema(UpdateShadowSchemaRequest request);

    CompletableFuture<UpdateTriggerResponse> updateTrigger(UpdateTriggerRequest request);

    CompletableFuture<UpdateUpstreamAppServerResponse> updateUpstreamAppServer(UpdateUpstreamAppServerRequest request);

    CompletableFuture<UpdateVersionDeviceGroupResponse> updateVersionDeviceGroup(UpdateVersionDeviceGroupRequest request);

    CompletableFuture<UpdateVersionPrepublishActiveStatusResponse> updateVersionPrepublishActiveStatus(UpdateVersionPrepublishActiveStatusRequest request);

}
