// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mpaas20201028.models.*;
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

    CompletableFuture<AddMdsMiniConfigResponse> addMdsMiniConfig(AddMdsMiniConfigRequest request);

    CompletableFuture<CancelPushSchedulerResponse> cancelPushScheduler(CancelPushSchedulerRequest request);

    CompletableFuture<ChangeMcubeMiniTaskStatusResponse> changeMcubeMiniTaskStatus(ChangeMcubeMiniTaskStatusRequest request);

    CompletableFuture<ChangeMcubeNebulaTaskStatusResponse> changeMcubeNebulaTaskStatus(ChangeMcubeNebulaTaskStatusRequest request);

    CompletableFuture<ChangeMcubePublicTaskStatusResponse> changeMcubePublicTaskStatus(ChangeMcubePublicTaskStatusRequest request);

    CompletableFuture<CopyMcdpGroupResponse> copyMcdpGroup(CopyMcdpGroupRequest request);

    CompletableFuture<CreateLinkResponse> createLink(CreateLinkRequest request);

    CompletableFuture<CreateMasCrowdResponse> createMasCrowd(CreateMasCrowdRequest request);

    CompletableFuture<CreateMasFunnelResponse> createMasFunnel(CreateMasFunnelRequest request);

    CompletableFuture<CreateMcdpEventResponse> createMcdpEvent(CreateMcdpEventRequest request);

    CompletableFuture<CreateMcdpEventAttributeResponse> createMcdpEventAttribute(CreateMcdpEventAttributeRequest request);

    CompletableFuture<CreateMcdpGroupResponse> createMcdpGroup(CreateMcdpGroupRequest request);

    CompletableFuture<CreateMcdpMaterialResponse> createMcdpMaterial(CreateMcdpMaterialRequest request);

    CompletableFuture<CreateMcdpZoneResponse> createMcdpZone(CreateMcdpZoneRequest request);

    CompletableFuture<CreateMcubeMiniAppResponse> createMcubeMiniApp(CreateMcubeMiniAppRequest request);

    CompletableFuture<CreateMcubeMiniTaskResponse> createMcubeMiniTask(CreateMcubeMiniTaskRequest request);

    CompletableFuture<CreateMcubeNebulaAppResponse> createMcubeNebulaApp(CreateMcubeNebulaAppRequest request);

    CompletableFuture<CreateMcubeNebulaResourceResponse> createMcubeNebulaResource(CreateMcubeNebulaResourceRequest request);

    CompletableFuture<CreateMcubeNebulaTaskResponse> createMcubeNebulaTask(CreateMcubeNebulaTaskRequest request);

    CompletableFuture<CreateMcubeUpgradePackageResponse> createMcubeUpgradePackage(CreateMcubeUpgradePackageRequest request);

    CompletableFuture<CreateMcubeUpgradeTaskResponse> createMcubeUpgradeTask(CreateMcubeUpgradeTaskRequest request);

    CompletableFuture<CreateMcubeVhostResponse> createMcubeVhost(CreateMcubeVhostRequest request);

    CompletableFuture<CreateMcubeWhitelistResponse> createMcubeWhitelist(CreateMcubeWhitelistRequest request);

    CompletableFuture<CreateMcubeWhitelistForIdeResponse> createMcubeWhitelistForIde(CreateMcubeWhitelistForIdeRequest request);

    CompletableFuture<CreateMdsMiniprogramTaskResponse> createMdsMiniprogramTask(CreateMdsMiniprogramTaskRequest request);

    CompletableFuture<CreateMsaEnhanceResponse> createMsaEnhance(CreateMsaEnhanceRequest request);

    CompletableFuture<CreateOpenGlobalDataResponse> createOpenGlobalData(CreateOpenGlobalDataRequest request);

    CompletableFuture<CreateOpenSingleDataResponse> createOpenSingleData(CreateOpenSingleDataRequest request);

    CompletableFuture<DeleteCubecardWhitelistContentResponse> deleteCubecardWhitelistContent(DeleteCubecardWhitelistContentRequest request);

    CompletableFuture<DeleteMcdpAimResponse> deleteMcdpAim(DeleteMcdpAimRequest request);

    CompletableFuture<DeleteMcdpCrowdResponse> deleteMcdpCrowd(DeleteMcdpCrowdRequest request);

    CompletableFuture<DeleteMcdpEventAttributeByIdResponse> deleteMcdpEventAttributeById(DeleteMcdpEventAttributeByIdRequest request);

    CompletableFuture<DeleteMcdpEventByIdResponse> deleteMcdpEventById(DeleteMcdpEventByIdRequest request);

    CompletableFuture<DeleteMcdpMaterialResponse> deleteMcdpMaterial(DeleteMcdpMaterialRequest request);

    CompletableFuture<DeleteMcdpZoneResponse> deleteMcdpZone(DeleteMcdpZoneRequest request);

    CompletableFuture<DeleteMcubeMiniAppResponse> deleteMcubeMiniApp(DeleteMcubeMiniAppRequest request);

    CompletableFuture<DeleteMcubeNebulaAppResponse> deleteMcubeNebulaApp(DeleteMcubeNebulaAppRequest request);

    CompletableFuture<DeleteMcubeUpgradeResourceResponse> deleteMcubeUpgradeResource(DeleteMcubeUpgradeResourceRequest request);

    CompletableFuture<DeleteMcubeWhitelistResponse> deleteMcubeWhitelist(DeleteMcubeWhitelistRequest request);

    CompletableFuture<DeleteMdsWhitelistContentResponse> deleteMdsWhitelistContent(DeleteMdsWhitelistContentRequest request);

    CompletableFuture<ExistMcubeRsaKeyResponse> existMcubeRsaKey(ExistMcubeRsaKeyRequest request);

    CompletableFuture<ExportMappCenterAppConfigResponse> exportMappCenterAppConfig(ExportMappCenterAppConfigRequest request);

    CompletableFuture<GetFileTokenForUploadToMsaResponse> getFileTokenForUploadToMsa(GetFileTokenForUploadToMsaRequest request);

    CompletableFuture<GetLogUrlInMsaResponse> getLogUrlInMsa(GetLogUrlInMsaRequest request);

    CompletableFuture<GetMcubeFileTokenResponse> getMcubeFileToken(GetMcubeFileTokenRequest request);

    CompletableFuture<GetMcubeNebulaResourceResponse> getMcubeNebulaResource(GetMcubeNebulaResourceRequest request);

    CompletableFuture<GetMcubeNebulaTaskDetailResponse> getMcubeNebulaTaskDetail(GetMcubeNebulaTaskDetailRequest request);

    CompletableFuture<GetMcubeUpgradePackageInfoResponse> getMcubeUpgradePackageInfo(GetMcubeUpgradePackageInfoRequest request);

    CompletableFuture<GetMcubeUpgradeTaskInfoResponse> getMcubeUpgradeTaskInfo(GetMcubeUpgradeTaskInfoRequest request);

    CompletableFuture<GetMdsMiniConfigResponse> getMdsMiniConfig(GetMdsMiniConfigRequest request);

    CompletableFuture<GetUserAppDonwloadUrlInMsaResponse> getUserAppDonwloadUrlInMsa(GetUserAppDonwloadUrlInMsaRequest request);

    CompletableFuture<GetUserAppEnhanceProcessInMsaResponse> getUserAppEnhanceProcessInMsa(GetUserAppEnhanceProcessInMsaRequest request);

    CompletableFuture<GetUserAppUploadProcessInMsaResponse> getUserAppUploadProcessInMsa(GetUserAppUploadProcessInMsaRequest request);

    CompletableFuture<ListMappCenterAppsResponse> listMappCenterApps(ListMappCenterAppsRequest request);

    CompletableFuture<ListMappCenterWorkspacesResponse> listMappCenterWorkspaces(ListMappCenterWorkspacesRequest request);

    CompletableFuture<ListMcdpAimResponse> listMcdpAim(ListMcdpAimRequest request);

    CompletableFuture<ListMcubeMiniAppsResponse> listMcubeMiniApps(ListMcubeMiniAppsRequest request);

    CompletableFuture<ListMcubeMiniPackagesResponse> listMcubeMiniPackages(ListMcubeMiniPackagesRequest request);

    CompletableFuture<ListMcubeMiniTasksResponse> listMcubeMiniTasks(ListMcubeMiniTasksRequest request);

    CompletableFuture<ListMcubeNebulaAppsResponse> listMcubeNebulaApps(ListMcubeNebulaAppsRequest request);

    CompletableFuture<ListMcubeNebulaResourcesResponse> listMcubeNebulaResources(ListMcubeNebulaResourcesRequest request);

    CompletableFuture<ListMcubeNebulaTasksResponse> listMcubeNebulaTasks(ListMcubeNebulaTasksRequest request);

    CompletableFuture<ListMcubeUpgradePackagesResponse> listMcubeUpgradePackages(ListMcubeUpgradePackagesRequest request);

    CompletableFuture<ListMcubeUpgradeTasksResponse> listMcubeUpgradeTasks(ListMcubeUpgradeTasksRequest request);

    CompletableFuture<ListMcubeWhitelistsResponse> listMcubeWhitelists(ListMcubeWhitelistsRequest request);

    CompletableFuture<ListMgsApiResponse> listMgsApi(ListMgsApiRequest request);

    CompletableFuture<LogMsaQueryResponse> logMsaQuery(LogMsaQueryRequest request);

    CompletableFuture<MTRSOCRServiceResponse> mTRSOCRService(MTRSOCRServiceRequest request);

    CompletableFuture<OpenApiAddActiveCodeResponse> openApiAddActiveCode(OpenApiAddActiveCodeRequest request);

    CompletableFuture<OpenApiAddActiveSceneResponse> openApiAddActiveScene(OpenApiAddActiveSceneRequest request);

    CompletableFuture<OpenApiCallbackResponse> openApiCallback(OpenApiCallbackRequest request);

    CompletableFuture<OpenApiDecodeResponse> openApiDecode(OpenApiDecodeRequest request);

    CompletableFuture<OpenApiDeleteActiveCodeResponse> openApiDeleteActiveCode(OpenApiDeleteActiveCodeRequest request);

    CompletableFuture<OpenApiEncodeResponse> openApiEncode(OpenApiEncodeRequest request);

    CompletableFuture<OpenApiQueryActiveCodeResponse> openApiQueryActiveCode(OpenApiQueryActiveCodeRequest request);

    CompletableFuture<OpenApiQueryActiveSceneResponse> openApiQueryActiveScene(OpenApiQueryActiveSceneRequest request);

    CompletableFuture<OpenApiUniqueEncodeResponse> openApiUniqueEncode(OpenApiUniqueEncodeRequest request);

    CompletableFuture<OpenApiUpdateActiveCodeResponse> openApiUpdateActiveCode(OpenApiUpdateActiveCodeRequest request);

    CompletableFuture<OpenApiUpdateActiveSceneResponse> openApiUpdateActiveScene(OpenApiUpdateActiveSceneRequest request);

    CompletableFuture<PushBindResponse> pushBind(PushBindRequest request);

    CompletableFuture<PushBroadcastResponse> pushBroadcast(PushBroadcastRequest request);

    CompletableFuture<PushMultipleResponse> pushMultiple(PushMultipleRequest request);

    CompletableFuture<PushReportResponse> pushReport(PushReportRequest request);

    CompletableFuture<PushSimpleResponse> pushSimple(PushSimpleRequest request);

    CompletableFuture<PushTemplateResponse> pushTemplate(PushTemplateRequest request);

    CompletableFuture<PushUnBindResponse> pushUnBind(PushUnBindRequest request);

    CompletableFuture<QueryInfoFromMdpResponse> queryInfoFromMdp(QueryInfoFromMdpRequest request);

    CompletableFuture<QueryLinkResponse> queryLink(QueryLinkRequest request);

    CompletableFuture<QueryMappCenterAppResponse> queryMappCenterApp(QueryMappCenterAppRequest request);

    CompletableFuture<QueryMcdpAimResponse> queryMcdpAim(QueryMcdpAimRequest request);

    CompletableFuture<QueryMcdpZoneResponse> queryMcdpZone(QueryMcdpZoneRequest request);

    CompletableFuture<QueryMcubeMiniPackageResponse> queryMcubeMiniPackage(QueryMcubeMiniPackageRequest request);

    CompletableFuture<QueryMcubeMiniTaskResponse> queryMcubeMiniTask(QueryMcubeMiniTaskRequest request);

    CompletableFuture<QueryMcubeVhostResponse> queryMcubeVhost(QueryMcubeVhostRequest request);

    CompletableFuture<QueryMdsUpgradeTaskDetailResponse> queryMdsUpgradeTaskDetail(QueryMdsUpgradeTaskDetailRequest request);

    CompletableFuture<QueryMgsApipageResponse> queryMgsApipage(QueryMgsApipageRequest request);

    CompletableFuture<QueryMgsApirestResponse> queryMgsApirest(QueryMgsApirestRequest request);

    CompletableFuture<QueryMgsTestreqbodyautogenResponse> queryMgsTestreqbodyautogen(QueryMgsTestreqbodyautogenRequest request);

    CompletableFuture<QueryMpsSchedulerListResponse> queryMpsSchedulerList(QueryMpsSchedulerListRequest request);

    CompletableFuture<QueryPushAnalysisCoreIndexResponse> queryPushAnalysisCoreIndex(QueryPushAnalysisCoreIndexRequest request);

    CompletableFuture<QueryPushAnalysisTaskDetailResponse> queryPushAnalysisTaskDetail(QueryPushAnalysisTaskDetailRequest request);

    CompletableFuture<QueryPushAnalysisTaskListResponse> queryPushAnalysisTaskList(QueryPushAnalysisTaskListRequest request);

    CompletableFuture<QueryPushSchedulerListResponse> queryPushSchedulerList(QueryPushSchedulerListRequest request);

    CompletableFuture<RevokePushMessageResponse> revokePushMessage(RevokePushMessageRequest request);

    CompletableFuture<RevokePushTaskResponse> revokePushTask(RevokePushTaskRequest request);

    CompletableFuture<RunMsaDiffResponse> runMsaDiff(RunMsaDiffRequest request);

    CompletableFuture<SaveMgsApirestResponse> saveMgsApirest(SaveMgsApirestRequest request);

    CompletableFuture<StartUserAppAsyncEnhanceInMsaResponse> startUserAppAsyncEnhanceInMsa(StartUserAppAsyncEnhanceInMsaRequest request);

    CompletableFuture<UpdateMcubeWhitelistResponse> updateMcubeWhitelist(UpdateMcubeWhitelistRequest request);

    CompletableFuture<UpdateMpaasAppInfoResponse> updateMpaasAppInfo(UpdateMpaasAppInfoRequest request);

    CompletableFuture<UploadBitcodeToMsaResponse> uploadBitcodeToMsa(UploadBitcodeToMsaRequest request);

    CompletableFuture<UploadMcubeMiniPackageResponse> uploadMcubeMiniPackage(UploadMcubeMiniPackageRequest request);

    CompletableFuture<UploadMcubeRsaKeyResponse> uploadMcubeRsaKey(UploadMcubeRsaKeyRequest request);

    CompletableFuture<UploadUserAppToMsaResponse> uploadUserAppToMsa(UploadUserAppToMsaRequest request);

}
