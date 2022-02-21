// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.iot20180120.models.*;
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

    CompletableFuture<AddDataForApiSourceResponse> addDataForApiSource(AddDataForApiSourceRequest request);

    CompletableFuture<BatchAddDeviceGroupRelationsResponse> batchAddDeviceGroupRelations(BatchAddDeviceGroupRelationsRequest request);

    CompletableFuture<BatchAddThingTopoResponse> batchAddThingTopo(BatchAddThingTopoRequest request);

    CompletableFuture<BatchBindDeviceToEdgeInstanceWithDriverResponse> batchBindDeviceToEdgeInstanceWithDriver(BatchBindDeviceToEdgeInstanceWithDriverRequest request);

    CompletableFuture<BatchBindDevicesIntoProjectResponse> batchBindDevicesIntoProject(BatchBindDevicesIntoProjectRequest request);

    CompletableFuture<BatchBindProductsIntoProjectResponse> batchBindProductsIntoProject(BatchBindProductsIntoProjectRequest request);

    CompletableFuture<BatchCheckDeviceNamesResponse> batchCheckDeviceNames(BatchCheckDeviceNamesRequest request);

    CompletableFuture<BatchClearEdgeInstanceDeviceConfigResponse> batchClearEdgeInstanceDeviceConfig(BatchClearEdgeInstanceDeviceConfigRequest request);

    CompletableFuture<BatchDeleteDeviceGroupRelationsResponse> batchDeleteDeviceGroupRelations(BatchDeleteDeviceGroupRelationsRequest request);

    CompletableFuture<BatchDeleteEdgeInstanceChannelResponse> batchDeleteEdgeInstanceChannel(BatchDeleteEdgeInstanceChannelRequest request);

    CompletableFuture<BatchGetDeviceBindStatusResponse> batchGetDeviceBindStatus(BatchGetDeviceBindStatusRequest request);

    CompletableFuture<BatchGetDeviceStateResponse> batchGetDeviceState(BatchGetDeviceStateRequest request);

    CompletableFuture<BatchGetEdgeDriverResponse> batchGetEdgeDriver(BatchGetEdgeDriverRequest request);

    CompletableFuture<BatchGetEdgeInstanceChannelResponse> batchGetEdgeInstanceChannel(BatchGetEdgeInstanceChannelRequest request);

    CompletableFuture<BatchGetEdgeInstanceDeviceChannelResponse> batchGetEdgeInstanceDeviceChannel(BatchGetEdgeInstanceDeviceChannelRequest request);

    CompletableFuture<BatchGetEdgeInstanceDeviceConfigResponse> batchGetEdgeInstanceDeviceConfig(BatchGetEdgeInstanceDeviceConfigRequest request);

    CompletableFuture<BatchGetEdgeInstanceDeviceDriverResponse> batchGetEdgeInstanceDeviceDriver(BatchGetEdgeInstanceDeviceDriverRequest request);

    CompletableFuture<BatchGetEdgeInstanceDriverConfigsResponse> batchGetEdgeInstanceDriverConfigs(BatchGetEdgeInstanceDriverConfigsRequest request);

    CompletableFuture<BatchPubResponse> batchPub(BatchPubRequest request);

    CompletableFuture<BatchQueryDeviceDetailResponse> batchQueryDeviceDetail(BatchQueryDeviceDetailRequest request);

    CompletableFuture<BatchRegisterDeviceResponse> batchRegisterDevice(BatchRegisterDeviceRequest request);

    CompletableFuture<BatchRegisterDeviceWithApplyIdResponse> batchRegisterDeviceWithApplyId(BatchRegisterDeviceWithApplyIdRequest request);

    CompletableFuture<BatchSetEdgeInstanceDeviceChannelResponse> batchSetEdgeInstanceDeviceChannel(BatchSetEdgeInstanceDeviceChannelRequest request);

    CompletableFuture<BatchSetEdgeInstanceDeviceConfigResponse> batchSetEdgeInstanceDeviceConfig(BatchSetEdgeInstanceDeviceConfigRequest request);

    CompletableFuture<BatchUnbindDeviceFromEdgeInstanceResponse> batchUnbindDeviceFromEdgeInstance(BatchUnbindDeviceFromEdgeInstanceRequest request);

    CompletableFuture<BatchUnbindProjectDevicesResponse> batchUnbindProjectDevices(BatchUnbindProjectDevicesRequest request);

    CompletableFuture<BatchUnbindProjectProductsResponse> batchUnbindProjectProducts(BatchUnbindProjectProductsRequest request);

    CompletableFuture<BatchUpdateDeviceNicknameResponse> batchUpdateDeviceNickname(BatchUpdateDeviceNicknameRequest request);

    CompletableFuture<BindApplicationToEdgeInstanceResponse> bindApplicationToEdgeInstance(BindApplicationToEdgeInstanceRequest request);

    CompletableFuture<BindDriverToEdgeInstanceResponse> bindDriverToEdgeInstance(BindDriverToEdgeInstanceRequest request);

    CompletableFuture<BindGatewayToEdgeInstanceResponse> bindGatewayToEdgeInstance(BindGatewayToEdgeInstanceRequest request);

    CompletableFuture<BindRoleToEdgeInstanceResponse> bindRoleToEdgeInstance(BindRoleToEdgeInstanceRequest request);

    CompletableFuture<BindSceneRuleToEdgeInstanceResponse> bindSceneRuleToEdgeInstance(BindSceneRuleToEdgeInstanceRequest request);

    CompletableFuture<CancelJobResponse> cancelJob(CancelJobRequest request);

    CompletableFuture<CancelOTAStrategyByJobResponse> cancelOTAStrategyByJob(CancelOTAStrategyByJobRequest request);

    CompletableFuture<CancelOTATaskByDeviceResponse> cancelOTATaskByDevice(CancelOTATaskByDeviceRequest request);

    CompletableFuture<CancelOTATaskByJobResponse> cancelOTATaskByJob(CancelOTATaskByJobRequest request);

    CompletableFuture<CancelReleaseProductResponse> cancelReleaseProduct(CancelReleaseProductRequest request);

    CompletableFuture<ClearEdgeInstanceDriverConfigsResponse> clearEdgeInstanceDriverConfigs(ClearEdgeInstanceDriverConfigsRequest request);

    CompletableFuture<CloseEdgeInstanceDeploymentResponse> closeEdgeInstanceDeployment(CloseEdgeInstanceDeploymentRequest request);

    CompletableFuture<ConfirmOTATaskResponse> confirmOTATask(ConfirmOTATaskRequest request);

    CompletableFuture<CopyThingModelResponse> copyThingModel(CopyThingModelRequest request);

    CompletableFuture<CreateConsumerGroupResponse> createConsumerGroup(CreateConsumerGroupRequest request);

    CompletableFuture<CreateConsumerGroupSubscribeRelationResponse> createConsumerGroupSubscribeRelation(CreateConsumerGroupSubscribeRelationRequest request);

    CompletableFuture<CreateDataAPIServiceResponse> createDataAPIService(CreateDataAPIServiceRequest request);

    CompletableFuture<CreateDeviceDistributeJobResponse> createDeviceDistributeJob(CreateDeviceDistributeJobRequest request);

    CompletableFuture<CreateDeviceGroupResponse> createDeviceGroup(CreateDeviceGroupRequest request);

    CompletableFuture<CreateEdgeDriverResponse> createEdgeDriver(CreateEdgeDriverRequest request);

    CompletableFuture<CreateEdgeDriverVersionResponse> createEdgeDriverVersion(CreateEdgeDriverVersionRequest request);

    CompletableFuture<CreateEdgeInstanceResponse> createEdgeInstance(CreateEdgeInstanceRequest request);

    CompletableFuture<CreateEdgeInstanceChannelResponse> createEdgeInstanceChannel(CreateEdgeInstanceChannelRequest request);

    CompletableFuture<CreateEdgeInstanceDeploymentResponse> createEdgeInstanceDeployment(CreateEdgeInstanceDeploymentRequest request);

    CompletableFuture<CreateEdgeInstanceMessageRoutingResponse> createEdgeInstanceMessageRouting(CreateEdgeInstanceMessageRoutingRequest request);

    CompletableFuture<CreateEdgeOssPreSignedAddressResponse> createEdgeOssPreSignedAddress(CreateEdgeOssPreSignedAddressRequest request);

    CompletableFuture<CreateJobResponse> createJob(CreateJobRequest request);

    CompletableFuture<CreateLoRaNodesTaskResponse> createLoRaNodesTask(CreateLoRaNodesTaskRequest request);

    CompletableFuture<CreateOTADynamicUpgradeJobResponse> createOTADynamicUpgradeJob(CreateOTADynamicUpgradeJobRequest request);

    CompletableFuture<CreateOTAFirmwareResponse> createOTAFirmware(CreateOTAFirmwareRequest request);

    CompletableFuture<CreateOTAModuleResponse> createOTAModule(CreateOTAModuleRequest request);

    CompletableFuture<CreateOTAStaticUpgradeJobResponse> createOTAStaticUpgradeJob(CreateOTAStaticUpgradeJobRequest request);

    CompletableFuture<CreateOTAVerifyJobResponse> createOTAVerifyJob(CreateOTAVerifyJobRequest request);

    CompletableFuture<CreateProductResponse> createProduct(CreateProductRequest request);

    CompletableFuture<CreateProductDistributeJobResponse> createProductDistributeJob(CreateProductDistributeJobRequest request);

    CompletableFuture<CreateProductTagsResponse> createProductTags(CreateProductTagsRequest request);

    CompletableFuture<CreateProductTopicResponse> createProductTopic(CreateProductTopicRequest request);

    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    CompletableFuture<CreateRuleActionResponse> createRuleAction(CreateRuleActionRequest request);

    CompletableFuture<CreateRulengDistributeJobResponse> createRulengDistributeJob(CreateRulengDistributeJobRequest request);

    CompletableFuture<CreateSceneRuleResponse> createSceneRule(CreateSceneRuleRequest request);

    CompletableFuture<CreateSpeechResponse> createSpeech(CreateSpeechRequest request);

    CompletableFuture<CreateStudioAppDomainOpenResponse> createStudioAppDomainOpen(CreateStudioAppDomainOpenRequest request);

    CompletableFuture<CreateSubscribeRelationResponse> createSubscribeRelation(CreateSubscribeRelationRequest request);

    CompletableFuture<CreateThingModelResponse> createThingModel(CreateThingModelRequest request);

    CompletableFuture<CreateThingScriptResponse> createThingScript(CreateThingScriptRequest request);

    CompletableFuture<CreateTopicRouteTableResponse> createTopicRouteTable(CreateTopicRouteTableRequest request);

    CompletableFuture<DeleteConsumerGroupResponse> deleteConsumerGroup(DeleteConsumerGroupRequest request);

    CompletableFuture<DeleteConsumerGroupSubscribeRelationResponse> deleteConsumerGroupSubscribeRelation(DeleteConsumerGroupSubscribeRelationRequest request);

    CompletableFuture<DeleteDeviceResponse> deleteDevice(DeleteDeviceRequest request);

    CompletableFuture<DeleteDeviceDistributeJobResponse> deleteDeviceDistributeJob(DeleteDeviceDistributeJobRequest request);

    CompletableFuture<DeleteDeviceFileResponse> deleteDeviceFile(DeleteDeviceFileRequest request);

    CompletableFuture<DeleteDeviceGroupResponse> deleteDeviceGroup(DeleteDeviceGroupRequest request);

    CompletableFuture<DeleteDevicePropResponse> deleteDeviceProp(DeleteDevicePropRequest request);

    CompletableFuture<DeleteEdgeDriverResponse> deleteEdgeDriver(DeleteEdgeDriverRequest request);

    CompletableFuture<DeleteEdgeDriverVersionResponse> deleteEdgeDriverVersion(DeleteEdgeDriverVersionRequest request);

    CompletableFuture<DeleteEdgeInstanceResponse> deleteEdgeInstance(DeleteEdgeInstanceRequest request);

    CompletableFuture<DeleteEdgeInstanceMessageRoutingResponse> deleteEdgeInstanceMessageRouting(DeleteEdgeInstanceMessageRoutingRequest request);

    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    CompletableFuture<DeleteOTAFirmwareResponse> deleteOTAFirmware(DeleteOTAFirmwareRequest request);

    CompletableFuture<DeleteOTAModuleResponse> deleteOTAModule(DeleteOTAModuleRequest request);

    CompletableFuture<DeleteProductResponse> deleteProduct(DeleteProductRequest request);

    CompletableFuture<DeleteProductTagsResponse> deleteProductTags(DeleteProductTagsRequest request);

    CompletableFuture<DeleteProductTopicResponse> deleteProductTopic(DeleteProductTopicRequest request);

    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    CompletableFuture<DeleteRuleActionResponse> deleteRuleAction(DeleteRuleActionRequest request);

    CompletableFuture<DeleteSceneRuleResponse> deleteSceneRule(DeleteSceneRuleRequest request);

    CompletableFuture<DeleteSpeechResponse> deleteSpeech(DeleteSpeechRequest request);

    CompletableFuture<DeleteStudioAppDomainOpenResponse> deleteStudioAppDomainOpen(DeleteStudioAppDomainOpenRequest request);

    CompletableFuture<DeleteSubscribeRelationResponse> deleteSubscribeRelation(DeleteSubscribeRelationRequest request);

    CompletableFuture<DeleteThingModelResponse> deleteThingModel(DeleteThingModelRequest request);

    CompletableFuture<DeleteTopicRouteTableResponse> deleteTopicRouteTable(DeleteTopicRouteTableRequest request);

    CompletableFuture<DisableDeviceTunnelResponse> disableDeviceTunnel(DisableDeviceTunnelRequest request);

    CompletableFuture<DisableDeviceTunnelShareResponse> disableDeviceTunnelShare(DisableDeviceTunnelShareRequest request);

    CompletableFuture<DisableSceneRuleResponse> disableSceneRule(DisableSceneRuleRequest request);

    CompletableFuture<DisableThingResponse> disableThing(DisableThingRequest request);

    CompletableFuture<EnableDeviceTunnelResponse> enableDeviceTunnel(EnableDeviceTunnelRequest request);

    CompletableFuture<EnableDeviceTunnelShareResponse> enableDeviceTunnelShare(EnableDeviceTunnelShareRequest request);

    CompletableFuture<EnableSceneRuleResponse> enableSceneRule(EnableSceneRuleRequest request);

    CompletableFuture<EnableThingResponse> enableThing(EnableThingRequest request);

    CompletableFuture<GenerateDeviceNameListURLResponse> generateDeviceNameListURL(GenerateDeviceNameListURLRequest request);

    CompletableFuture<GenerateFileUploadURLResponse> generateFileUploadURL(GenerateFileUploadURLRequest request);

    CompletableFuture<GenerateOTAUploadURLResponse> generateOTAUploadURL(GenerateOTAUploadURLRequest request);

    CompletableFuture<GetDataAPIServiceDetailResponse> getDataAPIServiceDetail(GetDataAPIServiceDetailRequest request);

    CompletableFuture<GetDeviceShadowResponse> getDeviceShadow(GetDeviceShadowRequest request);

    CompletableFuture<GetDeviceStatusResponse> getDeviceStatus(GetDeviceStatusRequest request);

    CompletableFuture<GetDeviceTunnelShareStatusResponse> getDeviceTunnelShareStatus(GetDeviceTunnelShareStatusRequest request);

    CompletableFuture<GetDeviceTunnelStatusResponse> getDeviceTunnelStatus(GetDeviceTunnelStatusRequest request);

    CompletableFuture<GetEdgeDriverVersionResponse> getEdgeDriverVersion(GetEdgeDriverVersionRequest request);

    CompletableFuture<GetEdgeInstanceResponse> getEdgeInstance(GetEdgeInstanceRequest request);

    CompletableFuture<GetEdgeInstanceDeploymentResponse> getEdgeInstanceDeployment(GetEdgeInstanceDeploymentRequest request);

    CompletableFuture<GetEdgeInstanceMessageRoutingResponse> getEdgeInstanceMessageRouting(GetEdgeInstanceMessageRoutingRequest request);

    CompletableFuture<GetGatewayBySubDeviceResponse> getGatewayBySubDevice(GetGatewayBySubDeviceRequest request);

    CompletableFuture<GetLoraNodesTaskResponse> getLoraNodesTask(GetLoraNodesTaskRequest request);

    CompletableFuture<GetNodesAddingTaskResponse> getNodesAddingTask(GetNodesAddingTaskRequest request);

    CompletableFuture<GetRuleResponse> getRule(GetRuleRequest request);

    CompletableFuture<GetRuleActionResponse> getRuleAction(GetRuleActionRequest request);

    CompletableFuture<GetSceneRuleResponse> getSceneRule(GetSceneRuleRequest request);

    CompletableFuture<GetSpeechVoiceResponse> getSpeechVoice(GetSpeechVoiceRequest request);

    CompletableFuture<GetStudioAppTokenOpenResponse> getStudioAppTokenOpen(GetStudioAppTokenOpenRequest request);

    CompletableFuture<GetThingModelTslResponse> getThingModelTsl(GetThingModelTslRequest request);

    CompletableFuture<GetThingModelTslPublishedResponse> getThingModelTslPublished(GetThingModelTslPublishedRequest request);

    CompletableFuture<GetThingScriptResponse> getThingScript(GetThingScriptRequest request);

    CompletableFuture<GetThingTemplateResponse> getThingTemplate(GetThingTemplateRequest request);

    CompletableFuture<GetThingTopoResponse> getThingTopo(GetThingTopoRequest request);

    CompletableFuture<ImportThingModelTslResponse> importThingModelTsl(ImportThingModelTslRequest request);

    CompletableFuture<InvokeDataAPIServiceResponse> invokeDataAPIService(InvokeDataAPIServiceRequest request);

    CompletableFuture<InvokeThingServiceResponse> invokeThingService(InvokeThingServiceRequest request);

    CompletableFuture<InvokeThingsServiceResponse> invokeThingsService(InvokeThingsServiceRequest request);

    CompletableFuture<ListAnalyticsDataResponse> listAnalyticsData(ListAnalyticsDataRequest request);

    CompletableFuture<ListDeviceDistributeJobResponse> listDeviceDistributeJob(ListDeviceDistributeJobRequest request);

    CompletableFuture<ListDistributedDeviceResponse> listDistributedDevice(ListDistributedDeviceRequest request);

    CompletableFuture<ListDistributedProductResponse> listDistributedProduct(ListDistributedProductRequest request);

    CompletableFuture<ListJobResponse> listJob(ListJobRequest request);

    CompletableFuture<ListOTAFirmwareResponse> listOTAFirmware(ListOTAFirmwareRequest request);

    CompletableFuture<ListOTAJobByDeviceResponse> listOTAJobByDevice(ListOTAJobByDeviceRequest request);

    CompletableFuture<ListOTAJobByFirmwareResponse> listOTAJobByFirmware(ListOTAJobByFirmwareRequest request);

    CompletableFuture<ListOTAModuleByProductResponse> listOTAModuleByProduct(ListOTAModuleByProductRequest request);

    CompletableFuture<ListOTAModuleVersionsByDeviceResponse> listOTAModuleVersionsByDevice(ListOTAModuleVersionsByDeviceRequest request);

    CompletableFuture<ListOTATaskByJobResponse> listOTATaskByJob(ListOTATaskByJobRequest request);

    CompletableFuture<ListOTAUnfinishedTaskByDeviceResponse> listOTAUnfinishedTaskByDevice(ListOTAUnfinishedTaskByDeviceRequest request);

    CompletableFuture<ListProductByTagsResponse> listProductByTags(ListProductByTagsRequest request);

    CompletableFuture<ListProductTagsResponse> listProductTags(ListProductTagsRequest request);

    CompletableFuture<ListRuleResponse> listRule(ListRuleRequest request);

    CompletableFuture<ListRuleActionsResponse> listRuleActions(ListRuleActionsRequest request);

    CompletableFuture<ListTaskResponse> listTask(ListTaskRequest request);

    CompletableFuture<ListTaskByPageResponse> listTaskByPage(ListTaskByPageRequest request);

    CompletableFuture<ListThingModelVersionResponse> listThingModelVersion(ListThingModelVersionRequest request);

    CompletableFuture<ListThingTemplatesResponse> listThingTemplates(ListThingTemplatesRequest request);

    CompletableFuture<NotifyAddThingTopoResponse> notifyAddThingTopo(NotifyAddThingTopoRequest request);

    CompletableFuture<OpenIotServiceResponse> openIotService(OpenIotServiceRequest request);

    CompletableFuture<PrintByTemplateResponse> printByTemplate(PrintByTemplateRequest request);

    CompletableFuture<PubResponse> pub(PubRequest request);

    CompletableFuture<PubBroadcastResponse> pubBroadcast(PubBroadcastRequest request);

    CompletableFuture<PublishStudioAppResponse> publishStudioApp(PublishStudioAppRequest request);

    CompletableFuture<PublishThingModelResponse> publishThingModel(PublishThingModelRequest request);

    CompletableFuture<PushSpeechResponse> pushSpeech(PushSpeechRequest request);

    CompletableFuture<QueryAppDeviceListResponse> queryAppDeviceList(QueryAppDeviceListRequest request);

    CompletableFuture<QueryBatchRegisterDeviceStatusResponse> queryBatchRegisterDeviceStatus(QueryBatchRegisterDeviceStatusRequest request);

    CompletableFuture<QueryCertUrlByApplyIdResponse> queryCertUrlByApplyId(QueryCertUrlByApplyIdRequest request);

    CompletableFuture<QueryConsumerGroupByGroupIdResponse> queryConsumerGroupByGroupId(QueryConsumerGroupByGroupIdRequest request);

    CompletableFuture<QueryConsumerGroupListResponse> queryConsumerGroupList(QueryConsumerGroupListRequest request);

    CompletableFuture<QueryConsumerGroupStatusResponse> queryConsumerGroupStatus(QueryConsumerGroupStatusRequest request);

    CompletableFuture<QueryDetailSceneRuleLogResponse> queryDetailSceneRuleLog(QueryDetailSceneRuleLogRequest request);

    CompletableFuture<QueryDeviceResponse> queryDevice(QueryDeviceRequest request);

    CompletableFuture<QueryDeviceBySQLResponse> queryDeviceBySQL(QueryDeviceBySQLRequest request);

    CompletableFuture<QueryDeviceByStatusResponse> queryDeviceByStatus(QueryDeviceByStatusRequest request);

    CompletableFuture<QueryDeviceByTagsResponse> queryDeviceByTags(QueryDeviceByTagsRequest request);

    CompletableFuture<QueryDeviceCertResponse> queryDeviceCert(QueryDeviceCertRequest request);

    CompletableFuture<QueryDeviceDesiredPropertyResponse> queryDeviceDesiredProperty(QueryDeviceDesiredPropertyRequest request);

    CompletableFuture<QueryDeviceDetailResponse> queryDeviceDetail(QueryDeviceDetailRequest request);

    CompletableFuture<QueryDeviceDistributeDetailResponse> queryDeviceDistributeDetail(QueryDeviceDistributeDetailRequest request);

    CompletableFuture<QueryDeviceDistributeJobResponse> queryDeviceDistributeJob(QueryDeviceDistributeJobRequest request);

    CompletableFuture<QueryDeviceEventDataResponse> queryDeviceEventData(QueryDeviceEventDataRequest request);

    CompletableFuture<QueryDeviceFileResponse> queryDeviceFile(QueryDeviceFileRequest request);

    CompletableFuture<QueryDeviceFileListResponse> queryDeviceFileList(QueryDeviceFileListRequest request);

    CompletableFuture<QueryDeviceGroupByDeviceResponse> queryDeviceGroupByDevice(QueryDeviceGroupByDeviceRequest request);

    CompletableFuture<QueryDeviceGroupByTagsResponse> queryDeviceGroupByTags(QueryDeviceGroupByTagsRequest request);

    CompletableFuture<QueryDeviceGroupInfoResponse> queryDeviceGroupInfo(QueryDeviceGroupInfoRequest request);

    CompletableFuture<QueryDeviceGroupListResponse> queryDeviceGroupList(QueryDeviceGroupListRequest request);

    CompletableFuture<QueryDeviceGroupTagListResponse> queryDeviceGroupTagList(QueryDeviceGroupTagListRequest request);

    CompletableFuture<QueryDeviceInfoResponse> queryDeviceInfo(QueryDeviceInfoRequest request);

    CompletableFuture<QueryDeviceListByDeviceGroupResponse> queryDeviceListByDeviceGroup(QueryDeviceListByDeviceGroupRequest request);

    CompletableFuture<QueryDeviceOriginalEventDataResponse> queryDeviceOriginalEventData(QueryDeviceOriginalEventDataRequest request);

    CompletableFuture<QueryDeviceOriginalPropertyDataResponse> queryDeviceOriginalPropertyData(QueryDeviceOriginalPropertyDataRequest request);

    CompletableFuture<QueryDeviceOriginalPropertyStatusResponse> queryDeviceOriginalPropertyStatus(QueryDeviceOriginalPropertyStatusRequest request);

    CompletableFuture<QueryDeviceOriginalServiceDataResponse> queryDeviceOriginalServiceData(QueryDeviceOriginalServiceDataRequest request);

    CompletableFuture<QueryDevicePropResponse> queryDeviceProp(QueryDevicePropRequest request);

    CompletableFuture<QueryDevicePropertiesDataResponse> queryDevicePropertiesData(QueryDevicePropertiesDataRequest request);

    CompletableFuture<QueryDevicePropertyDataResponse> queryDevicePropertyData(QueryDevicePropertyDataRequest request);

    CompletableFuture<QueryDevicePropertyStatusResponse> queryDevicePropertyStatus(QueryDevicePropertyStatusRequest request);

    CompletableFuture<QueryDeviceServiceDataResponse> queryDeviceServiceData(QueryDeviceServiceDataRequest request);

    CompletableFuture<QueryDeviceStatisticsResponse> queryDeviceStatistics(QueryDeviceStatisticsRequest request);

    CompletableFuture<QueryEdgeDriverResponse> queryEdgeDriver(QueryEdgeDriverRequest request);

    CompletableFuture<QueryEdgeDriverVersionResponse> queryEdgeDriverVersion(QueryEdgeDriverVersionRequest request);

    CompletableFuture<QueryEdgeInstanceResponse> queryEdgeInstance(QueryEdgeInstanceRequest request);

    CompletableFuture<QueryEdgeInstanceChannelResponse> queryEdgeInstanceChannel(QueryEdgeInstanceChannelRequest request);

    CompletableFuture<QueryEdgeInstanceDeviceResponse> queryEdgeInstanceDevice(QueryEdgeInstanceDeviceRequest request);

    CompletableFuture<QueryEdgeInstanceDeviceByDriverResponse> queryEdgeInstanceDeviceByDriver(QueryEdgeInstanceDeviceByDriverRequest request);

    CompletableFuture<QueryEdgeInstanceDriverResponse> queryEdgeInstanceDriver(QueryEdgeInstanceDriverRequest request);

    CompletableFuture<QueryEdgeInstanceGatewayResponse> queryEdgeInstanceGateway(QueryEdgeInstanceGatewayRequest request);

    CompletableFuture<QueryEdgeInstanceHistoricDeploymentResponse> queryEdgeInstanceHistoricDeployment(QueryEdgeInstanceHistoricDeploymentRequest request);

    CompletableFuture<QueryEdgeInstanceMessageRoutingResponse> queryEdgeInstanceMessageRouting(QueryEdgeInstanceMessageRoutingRequest request);

    CompletableFuture<QueryEdgeInstanceSceneRuleResponse> queryEdgeInstanceSceneRule(QueryEdgeInstanceSceneRuleRequest request);

    CompletableFuture<QueryJobResponse> queryJob(QueryJobRequest request);

    CompletableFuture<QueryJobStatisticsResponse> queryJobStatistics(QueryJobStatisticsRequest request);

    CompletableFuture<QueryLoRaJoinPermissionsResponse> queryLoRaJoinPermissions(QueryLoRaJoinPermissionsRequest request);

    CompletableFuture<QueryMessageInfoResponse> queryMessageInfo(QueryMessageInfoRequest request);

    CompletableFuture<QueryOTAFirmwareResponse> queryOTAFirmware(QueryOTAFirmwareRequest request);

    CompletableFuture<QueryOTAJobResponse> queryOTAJob(QueryOTAJobRequest request);

    CompletableFuture<QueryPageByApplyIdResponse> queryPageByApplyId(QueryPageByApplyIdRequest request);

    CompletableFuture<QueryProductResponse> queryProduct(QueryProductRequest request);

    CompletableFuture<QueryProductCertInfoResponse> queryProductCertInfo(QueryProductCertInfoRequest request);

    CompletableFuture<QueryProductListResponse> queryProductList(QueryProductListRequest request);

    CompletableFuture<QueryProductTopicResponse> queryProductTopic(QueryProductTopicRequest request);

    CompletableFuture<QuerySceneRuleResponse> querySceneRule(QuerySceneRuleRequest request);

    CompletableFuture<QuerySolutionDeviceGroupPageResponse> querySolutionDeviceGroupPage(QuerySolutionDeviceGroupPageRequest request);

    CompletableFuture<QuerySpeechResponse> querySpeech(QuerySpeechRequest request);

    CompletableFuture<QuerySpeechListResponse> querySpeechList(QuerySpeechListRequest request);

    CompletableFuture<QuerySpeechPushJobResponse> querySpeechPushJob(QuerySpeechPushJobRequest request);

    CompletableFuture<QuerySpeechPushJobDeviceResponse> querySpeechPushJobDevice(QuerySpeechPushJobDeviceRequest request);

    CompletableFuture<QuerySpeechPushJobSpeechResponse> querySpeechPushJobSpeech(QuerySpeechPushJobSpeechRequest request);

    CompletableFuture<QueryStudioAppDomainListOpenResponse> queryStudioAppDomainListOpen(QueryStudioAppDomainListOpenRequest request);

    CompletableFuture<QueryStudioAppListResponse> queryStudioAppList(QueryStudioAppListRequest request);

    CompletableFuture<QueryStudioAppPageListOpenResponse> queryStudioAppPageListOpen(QueryStudioAppPageListOpenRequest request);

    CompletableFuture<QueryStudioProjectListResponse> queryStudioProjectList(QueryStudioProjectListRequest request);

    CompletableFuture<QuerySubscribeRelationResponse> querySubscribeRelation(QuerySubscribeRelationRequest request);

    CompletableFuture<QuerySummarySceneRuleLogResponse> querySummarySceneRuleLog(QuerySummarySceneRuleLogRequest request);

    CompletableFuture<QuerySuperDeviceGroupResponse> querySuperDeviceGroup(QuerySuperDeviceGroupRequest request);

    CompletableFuture<QueryTaskResponse> queryTask(QueryTaskRequest request);

    CompletableFuture<QueryThingModelResponse> queryThingModel(QueryThingModelRequest request);

    CompletableFuture<QueryThingModelExtendConfigResponse> queryThingModelExtendConfig(QueryThingModelExtendConfigRequest request);

    CompletableFuture<QueryThingModelExtendConfigPublishedResponse> queryThingModelExtendConfigPublished(QueryThingModelExtendConfigPublishedRequest request);

    CompletableFuture<QueryThingModelPublishedResponse> queryThingModelPublished(QueryThingModelPublishedRequest request);

    CompletableFuture<QueryTopicReverseRouteTableResponse> queryTopicReverseRouteTable(QueryTopicReverseRouteTableRequest request);

    CompletableFuture<QueryTopicRouteTableResponse> queryTopicRouteTable(QueryTopicRouteTableRequest request);

    CompletableFuture<RRpcResponse> rRpc(RRpcRequest request);

    CompletableFuture<RefreshDeviceTunnelSharePasswordResponse> refreshDeviceTunnelSharePassword(RefreshDeviceTunnelSharePasswordRequest request);

    CompletableFuture<RefreshStudioAppTokenOpenResponse> refreshStudioAppTokenOpen(RefreshStudioAppTokenOpenRequest request);

    CompletableFuture<RegisterDeviceResponse> registerDevice(RegisterDeviceRequest request);

    CompletableFuture<ReleaseEdgeDriverVersionResponse> releaseEdgeDriverVersion(ReleaseEdgeDriverVersionRequest request);

    CompletableFuture<ReleaseProductResponse> releaseProduct(ReleaseProductRequest request);

    CompletableFuture<RemoveThingTopoResponse> removeThingTopo(RemoveThingTopoRequest request);

    CompletableFuture<ReplaceEdgeInstanceGatewayResponse> replaceEdgeInstanceGateway(ReplaceEdgeInstanceGatewayRequest request);

    CompletableFuture<RerunJobResponse> rerunJob(RerunJobRequest request);

    CompletableFuture<ResetConsumerGroupPositionResponse> resetConsumerGroupPosition(ResetConsumerGroupPositionRequest request);

    CompletableFuture<ResetThingResponse> resetThing(ResetThingRequest request);

    CompletableFuture<SaveDevicePropResponse> saveDeviceProp(SaveDevicePropRequest request);

    CompletableFuture<SetDeviceDesiredPropertyResponse> setDeviceDesiredProperty(SetDeviceDesiredPropertyRequest request);

    CompletableFuture<SetDeviceGroupTagsResponse> setDeviceGroupTags(SetDeviceGroupTagsRequest request);

    CompletableFuture<SetDevicePropertyResponse> setDeviceProperty(SetDevicePropertyRequest request);

    CompletableFuture<SetDevicesPropertyResponse> setDevicesProperty(SetDevicesPropertyRequest request);

    CompletableFuture<SetEdgeInstanceDriverConfigsResponse> setEdgeInstanceDriverConfigs(SetEdgeInstanceDriverConfigsRequest request);

    CompletableFuture<SetProductCertInfoResponse> setProductCertInfo(SetProductCertInfoRequest request);

    CompletableFuture<SetStudioProjectCooperationResponse> setStudioProjectCooperation(SetStudioProjectCooperationRequest request);

    CompletableFuture<SetupStudioAppAuthModeOpenResponse> setupStudioAppAuthModeOpen(SetupStudioAppAuthModeOpenRequest request);

    CompletableFuture<SpeechByCombinationResponse> speechByCombination(SpeechByCombinationRequest request);

    CompletableFuture<StartCpuResponse> startCpu(StartCpuRequest request);

    CompletableFuture<StartRuleResponse> startRule(StartRuleRequest request);

    CompletableFuture<StopRuleResponse> stopRule(StopRuleRequest request);

    CompletableFuture<SyncSpeechByCombinationResponse> syncSpeechByCombination(SyncSpeechByCombinationRequest request);

    CompletableFuture<TestSpeechResponse> testSpeech(TestSpeechRequest request);

    CompletableFuture<TriggerSceneRuleResponse> triggerSceneRule(TriggerSceneRuleRequest request);

    CompletableFuture<UnbindApplicationFromEdgeInstanceResponse> unbindApplicationFromEdgeInstance(UnbindApplicationFromEdgeInstanceRequest request);

    CompletableFuture<UnbindDriverFromEdgeInstanceResponse> unbindDriverFromEdgeInstance(UnbindDriverFromEdgeInstanceRequest request);

    CompletableFuture<UnbindRoleFromEdgeInstanceResponse> unbindRoleFromEdgeInstance(UnbindRoleFromEdgeInstanceRequest request);

    CompletableFuture<UnbindSceneRuleFromEdgeInstanceResponse> unbindSceneRuleFromEdgeInstance(UnbindSceneRuleFromEdgeInstanceRequest request);

    CompletableFuture<UpdateConsumerGroupResponse> updateConsumerGroup(UpdateConsumerGroupRequest request);

    CompletableFuture<UpdateDeviceGroupResponse> updateDeviceGroup(UpdateDeviceGroupRequest request);

    CompletableFuture<UpdateDeviceShadowResponse> updateDeviceShadow(UpdateDeviceShadowRequest request);

    CompletableFuture<UpdateEdgeDriverVersionResponse> updateEdgeDriverVersion(UpdateEdgeDriverVersionRequest request);

    CompletableFuture<UpdateEdgeInstanceResponse> updateEdgeInstance(UpdateEdgeInstanceRequest request);

    CompletableFuture<UpdateEdgeInstanceChannelResponse> updateEdgeInstanceChannel(UpdateEdgeInstanceChannelRequest request);

    CompletableFuture<UpdateEdgeInstanceMessageRoutingResponse> updateEdgeInstanceMessageRouting(UpdateEdgeInstanceMessageRoutingRequest request);

    CompletableFuture<UpdateJobResponse> updateJob(UpdateJobRequest request);

    CompletableFuture<UpdateOTAModuleResponse> updateOTAModule(UpdateOTAModuleRequest request);

    CompletableFuture<UpdateProductResponse> updateProduct(UpdateProductRequest request);

    CompletableFuture<UpdateProductFilterConfigResponse> updateProductFilterConfig(UpdateProductFilterConfigRequest request);

    CompletableFuture<UpdateProductTagsResponse> updateProductTags(UpdateProductTagsRequest request);

    CompletableFuture<UpdateProductTopicResponse> updateProductTopic(UpdateProductTopicRequest request);

    CompletableFuture<UpdateRuleResponse> updateRule(UpdateRuleRequest request);

    CompletableFuture<UpdateRuleActionResponse> updateRuleAction(UpdateRuleActionRequest request);

    CompletableFuture<UpdateSceneRuleResponse> updateSceneRule(UpdateSceneRuleRequest request);

    CompletableFuture<UpdateSpeechResponse> updateSpeech(UpdateSpeechRequest request);

    CompletableFuture<UpdateSubscribeRelationResponse> updateSubscribeRelation(UpdateSubscribeRelationRequest request);

    CompletableFuture<UpdateThingModelResponse> updateThingModel(UpdateThingModelRequest request);

    CompletableFuture<UpdateThingModelValidationConfigResponse> updateThingModelValidationConfig(UpdateThingModelValidationConfigRequest request);

    CompletableFuture<UpdateThingScriptResponse> updateThingScript(UpdateThingScriptRequest request);

}
