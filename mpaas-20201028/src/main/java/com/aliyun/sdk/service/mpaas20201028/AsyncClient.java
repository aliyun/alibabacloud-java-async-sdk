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

    /**
     * @param request the request parameters of AddMdsMiniConfig  AddMdsMiniConfigRequest
     * @return AddMdsMiniConfigResponse
     */
    CompletableFuture<AddMdsMiniConfigResponse> addMdsMiniConfig(AddMdsMiniConfigRequest request);

    /**
     * @param request the request parameters of CancelPushScheduler  CancelPushSchedulerRequest
     * @return CancelPushSchedulerResponse
     */
    CompletableFuture<CancelPushSchedulerResponse> cancelPushScheduler(CancelPushSchedulerRequest request);

    /**
     * @param request the request parameters of ChangeMcubeMiniTaskStatus  ChangeMcubeMiniTaskStatusRequest
     * @return ChangeMcubeMiniTaskStatusResponse
     */
    CompletableFuture<ChangeMcubeMiniTaskStatusResponse> changeMcubeMiniTaskStatus(ChangeMcubeMiniTaskStatusRequest request);

    /**
     * @param request the request parameters of ChangeMcubeNebulaTaskStatus  ChangeMcubeNebulaTaskStatusRequest
     * @return ChangeMcubeNebulaTaskStatusResponse
     */
    CompletableFuture<ChangeMcubeNebulaTaskStatusResponse> changeMcubeNebulaTaskStatus(ChangeMcubeNebulaTaskStatusRequest request);

    /**
     * @param request the request parameters of ChangeMcubePublicTaskStatus  ChangeMcubePublicTaskStatusRequest
     * @return ChangeMcubePublicTaskStatusResponse
     */
    CompletableFuture<ChangeMcubePublicTaskStatusResponse> changeMcubePublicTaskStatus(ChangeMcubePublicTaskStatusRequest request);

    /**
     * @param request the request parameters of ChangeMdsCubeTaskStatus  ChangeMdsCubeTaskStatusRequest
     * @return ChangeMdsCubeTaskStatusResponse
     */
    CompletableFuture<ChangeMdsCubeTaskStatusResponse> changeMdsCubeTaskStatus(ChangeMdsCubeTaskStatusRequest request);

    /**
     * @param request the request parameters of CopyMcdpGroup  CopyMcdpGroupRequest
     * @return CopyMcdpGroupResponse
     */
    CompletableFuture<CopyMcdpGroupResponse> copyMcdpGroup(CopyMcdpGroupRequest request);

    /**
     * @param request the request parameters of CreateLink  CreateLinkRequest
     * @return CreateLinkResponse
     */
    CompletableFuture<CreateLinkResponse> createLink(CreateLinkRequest request);

    /**
     * @param request the request parameters of CreateMcdpGroup  CreateMcdpGroupRequest
     * @return CreateMcdpGroupResponse
     */
    CompletableFuture<CreateMcdpGroupResponse> createMcdpGroup(CreateMcdpGroupRequest request);

    /**
     * @param request the request parameters of CreateMcdpMaterial  CreateMcdpMaterialRequest
     * @return CreateMcdpMaterialResponse
     */
    CompletableFuture<CreateMcdpMaterialResponse> createMcdpMaterial(CreateMcdpMaterialRequest request);

    /**
     * @param request the request parameters of CreateMcdpZone  CreateMcdpZoneRequest
     * @return CreateMcdpZoneResponse
     */
    CompletableFuture<CreateMcdpZoneResponse> createMcdpZone(CreateMcdpZoneRequest request);

    /**
     * @param request the request parameters of CreateMcubeMiniApp  CreateMcubeMiniAppRequest
     * @return CreateMcubeMiniAppResponse
     */
    CompletableFuture<CreateMcubeMiniAppResponse> createMcubeMiniApp(CreateMcubeMiniAppRequest request);

    /**
     * @param request the request parameters of CreateMcubeMiniTask  CreateMcubeMiniTaskRequest
     * @return CreateMcubeMiniTaskResponse
     */
    CompletableFuture<CreateMcubeMiniTaskResponse> createMcubeMiniTask(CreateMcubeMiniTaskRequest request);

    /**
     * @param request the request parameters of CreateMcubeNebulaApp  CreateMcubeNebulaAppRequest
     * @return CreateMcubeNebulaAppResponse
     */
    CompletableFuture<CreateMcubeNebulaAppResponse> createMcubeNebulaApp(CreateMcubeNebulaAppRequest request);

    /**
     * @param request the request parameters of CreateMcubeNebulaResource  CreateMcubeNebulaResourceRequest
     * @return CreateMcubeNebulaResourceResponse
     */
    CompletableFuture<CreateMcubeNebulaResourceResponse> createMcubeNebulaResource(CreateMcubeNebulaResourceRequest request);

    /**
     * @param request the request parameters of CreateMcubeNebulaTask  CreateMcubeNebulaTaskRequest
     * @return CreateMcubeNebulaTaskResponse
     */
    CompletableFuture<CreateMcubeNebulaTaskResponse> createMcubeNebulaTask(CreateMcubeNebulaTaskRequest request);

    /**
     * @param request the request parameters of CreateMcubeUpgradePackage  CreateMcubeUpgradePackageRequest
     * @return CreateMcubeUpgradePackageResponse
     */
    CompletableFuture<CreateMcubeUpgradePackageResponse> createMcubeUpgradePackage(CreateMcubeUpgradePackageRequest request);

    /**
     * @param request the request parameters of CreateMcubeUpgradeTask  CreateMcubeUpgradeTaskRequest
     * @return CreateMcubeUpgradeTaskResponse
     */
    CompletableFuture<CreateMcubeUpgradeTaskResponse> createMcubeUpgradeTask(CreateMcubeUpgradeTaskRequest request);

    /**
     * @param request the request parameters of CreateMcubeVhost  CreateMcubeVhostRequest
     * @return CreateMcubeVhostResponse
     */
    CompletableFuture<CreateMcubeVhostResponse> createMcubeVhost(CreateMcubeVhostRequest request);

    /**
     * @param request the request parameters of CreateMcubeWhitelist  CreateMcubeWhitelistRequest
     * @return CreateMcubeWhitelistResponse
     */
    CompletableFuture<CreateMcubeWhitelistResponse> createMcubeWhitelist(CreateMcubeWhitelistRequest request);

    /**
     * @param request the request parameters of CreateMcubeWhitelistForIde  CreateMcubeWhitelistForIdeRequest
     * @return CreateMcubeWhitelistForIdeResponse
     */
    CompletableFuture<CreateMcubeWhitelistForIdeResponse> createMcubeWhitelistForIde(CreateMcubeWhitelistForIdeRequest request);

    /**
     * @param request the request parameters of CreateMdsCubeResource  CreateMdsCubeResourceRequest
     * @return CreateMdsCubeResourceResponse
     */
    CompletableFuture<CreateMdsCubeResourceResponse> createMdsCubeResource(CreateMdsCubeResourceRequest request);

    /**
     * @param request the request parameters of CreateMdsCubeTask  CreateMdsCubeTaskRequest
     * @return CreateMdsCubeTaskResponse
     */
    CompletableFuture<CreateMdsCubeTaskResponse> createMdsCubeTask(CreateMdsCubeTaskRequest request);

    /**
     * @param request the request parameters of CreateMdsCubeTemplate  CreateMdsCubeTemplateRequest
     * @return CreateMdsCubeTemplateResponse
     */
    CompletableFuture<CreateMdsCubeTemplateResponse> createMdsCubeTemplate(CreateMdsCubeTemplateRequest request);

    /**
     * @param request the request parameters of CreateMdsMiniprogramTask  CreateMdsMiniprogramTaskRequest
     * @return CreateMdsMiniprogramTaskResponse
     */
    CompletableFuture<CreateMdsMiniprogramTaskResponse> createMdsMiniprogramTask(CreateMdsMiniprogramTaskRequest request);

    /**
     * @param request the request parameters of CreateOpenGlobalData  CreateOpenGlobalDataRequest
     * @return CreateOpenGlobalDataResponse
     */
    CompletableFuture<CreateOpenGlobalDataResponse> createOpenGlobalData(CreateOpenGlobalDataRequest request);

    /**
     * @param request the request parameters of CreateOpenSingleData  CreateOpenSingleDataRequest
     * @return CreateOpenSingleDataResponse
     */
    CompletableFuture<CreateOpenSingleDataResponse> createOpenSingleData(CreateOpenSingleDataRequest request);

    /**
     * @param request the request parameters of CreateTemplate  CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    CompletableFuture<CreateTemplateResponse> createTemplate(CreateTemplateRequest request);

    /**
     * @param request the request parameters of DeleteCubecardWhitelistContent  DeleteCubecardWhitelistContentRequest
     * @return DeleteCubecardWhitelistContentResponse
     */
    CompletableFuture<DeleteCubecardWhitelistContentResponse> deleteCubecardWhitelistContent(DeleteCubecardWhitelistContentRequest request);

    /**
     * @param request the request parameters of DeleteMcdpAim  DeleteMcdpAimRequest
     * @return DeleteMcdpAimResponse
     */
    CompletableFuture<DeleteMcdpAimResponse> deleteMcdpAim(DeleteMcdpAimRequest request);

    /**
     * @param request the request parameters of DeleteMcdpCrowd  DeleteMcdpCrowdRequest
     * @return DeleteMcdpCrowdResponse
     */
    CompletableFuture<DeleteMcdpCrowdResponse> deleteMcdpCrowd(DeleteMcdpCrowdRequest request);

    /**
     * @param request the request parameters of DeleteMcdpZone  DeleteMcdpZoneRequest
     * @return DeleteMcdpZoneResponse
     */
    CompletableFuture<DeleteMcdpZoneResponse> deleteMcdpZone(DeleteMcdpZoneRequest request);

    /**
     * @param request the request parameters of DeleteMcubeMiniApp  DeleteMcubeMiniAppRequest
     * @return DeleteMcubeMiniAppResponse
     */
    CompletableFuture<DeleteMcubeMiniAppResponse> deleteMcubeMiniApp(DeleteMcubeMiniAppRequest request);

    /**
     * @param request the request parameters of DeleteMcubeNebulaApp  DeleteMcubeNebulaAppRequest
     * @return DeleteMcubeNebulaAppResponse
     */
    CompletableFuture<DeleteMcubeNebulaAppResponse> deleteMcubeNebulaApp(DeleteMcubeNebulaAppRequest request);

    /**
     * @param request the request parameters of DeleteMcubeUpgradeResource  DeleteMcubeUpgradeResourceRequest
     * @return DeleteMcubeUpgradeResourceResponse
     */
    CompletableFuture<DeleteMcubeUpgradeResourceResponse> deleteMcubeUpgradeResource(DeleteMcubeUpgradeResourceRequest request);

    /**
     * @param request the request parameters of DeleteMcubeWhitelist  DeleteMcubeWhitelistRequest
     * @return DeleteMcubeWhitelistResponse
     */
    CompletableFuture<DeleteMcubeWhitelistResponse> deleteMcubeWhitelist(DeleteMcubeWhitelistRequest request);

    /**
     * @param request the request parameters of DeleteMdsWhitelistContent  DeleteMdsWhitelistContentRequest
     * @return DeleteMdsWhitelistContentResponse
     */
    CompletableFuture<DeleteMdsWhitelistContentResponse> deleteMdsWhitelistContent(DeleteMdsWhitelistContentRequest request);

    /**
     * @param request the request parameters of DeleteTemplate  DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    CompletableFuture<DeleteTemplateResponse> deleteTemplate(DeleteTemplateRequest request);

    /**
     * @param request the request parameters of ExistMcubeRsaKey  ExistMcubeRsaKeyRequest
     * @return ExistMcubeRsaKeyResponse
     */
    CompletableFuture<ExistMcubeRsaKeyResponse> existMcubeRsaKey(ExistMcubeRsaKeyRequest request);

    /**
     * @param request the request parameters of ExportMappCenterAppConfig  ExportMappCenterAppConfigRequest
     * @return ExportMappCenterAppConfigResponse
     */
    CompletableFuture<ExportMappCenterAppConfigResponse> exportMappCenterAppConfig(ExportMappCenterAppConfigRequest request);

    /**
     * @param request the request parameters of GetFileTokenForUploadToMsa  GetFileTokenForUploadToMsaRequest
     * @return GetFileTokenForUploadToMsaResponse
     */
    CompletableFuture<GetFileTokenForUploadToMsaResponse> getFileTokenForUploadToMsa(GetFileTokenForUploadToMsaRequest request);

    /**
     * @param request the request parameters of GetLogUrlInMsa  GetLogUrlInMsaRequest
     * @return GetLogUrlInMsaResponse
     */
    CompletableFuture<GetLogUrlInMsaResponse> getLogUrlInMsa(GetLogUrlInMsaRequest request);

    /**
     * @param request the request parameters of GetMcubeFileToken  GetMcubeFileTokenRequest
     * @return GetMcubeFileTokenResponse
     */
    CompletableFuture<GetMcubeFileTokenResponse> getMcubeFileToken(GetMcubeFileTokenRequest request);

    /**
     * @param request the request parameters of GetMcubeNebulaResource  GetMcubeNebulaResourceRequest
     * @return GetMcubeNebulaResourceResponse
     */
    CompletableFuture<GetMcubeNebulaResourceResponse> getMcubeNebulaResource(GetMcubeNebulaResourceRequest request);

    /**
     * @param request the request parameters of GetMcubeNebulaTaskDetail  GetMcubeNebulaTaskDetailRequest
     * @return GetMcubeNebulaTaskDetailResponse
     */
    CompletableFuture<GetMcubeNebulaTaskDetailResponse> getMcubeNebulaTaskDetail(GetMcubeNebulaTaskDetailRequest request);

    /**
     * @param request the request parameters of GetMcubeUpgradePackageInfo  GetMcubeUpgradePackageInfoRequest
     * @return GetMcubeUpgradePackageInfoResponse
     */
    CompletableFuture<GetMcubeUpgradePackageInfoResponse> getMcubeUpgradePackageInfo(GetMcubeUpgradePackageInfoRequest request);

    /**
     * @param request the request parameters of GetMcubeUpgradeTaskInfo  GetMcubeUpgradeTaskInfoRequest
     * @return GetMcubeUpgradeTaskInfoResponse
     */
    CompletableFuture<GetMcubeUpgradeTaskInfoResponse> getMcubeUpgradeTaskInfo(GetMcubeUpgradeTaskInfoRequest request);

    /**
     * @param request the request parameters of GetMdsMiniConfig  GetMdsMiniConfigRequest
     * @return GetMdsMiniConfigResponse
     */
    CompletableFuture<GetMdsMiniConfigResponse> getMdsMiniConfig(GetMdsMiniConfigRequest request);

    /**
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * @param request the request parameters of GetUserAppDonwloadUrlInMsa  GetUserAppDonwloadUrlInMsaRequest
     * @return GetUserAppDonwloadUrlInMsaResponse
     */
    CompletableFuture<GetUserAppDonwloadUrlInMsaResponse> getUserAppDonwloadUrlInMsa(GetUserAppDonwloadUrlInMsaRequest request);

    /**
     * @param request the request parameters of GetUserAppEnhanceProcessInMsa  GetUserAppEnhanceProcessInMsaRequest
     * @return GetUserAppEnhanceProcessInMsaResponse
     */
    CompletableFuture<GetUserAppEnhanceProcessInMsaResponse> getUserAppEnhanceProcessInMsa(GetUserAppEnhanceProcessInMsaRequest request);

    /**
     * @param request the request parameters of GetUserAppUploadProcessInMsa  GetUserAppUploadProcessInMsaRequest
     * @return GetUserAppUploadProcessInMsaResponse
     */
    CompletableFuture<GetUserAppUploadProcessInMsaResponse> getUserAppUploadProcessInMsa(GetUserAppUploadProcessInMsaRequest request);

    /**
     * @param request the request parameters of ListAnalysisCoreIndex  ListAnalysisCoreIndexRequest
     * @return ListAnalysisCoreIndexResponse
     */
    CompletableFuture<ListAnalysisCoreIndexResponse> listAnalysisCoreIndex(ListAnalysisCoreIndexRequest request);

    /**
     * @param request the request parameters of ListCubecardApps  ListCubecardAppsRequest
     * @return ListCubecardAppsResponse
     */
    CompletableFuture<ListCubecardAppsResponse> listCubecardApps(ListCubecardAppsRequest request);

    /**
     * @param request the request parameters of ListMappCenterApps  ListMappCenterAppsRequest
     * @return ListMappCenterAppsResponse
     */
    CompletableFuture<ListMappCenterAppsResponse> listMappCenterApps(ListMappCenterAppsRequest request);

    /**
     * @param request the request parameters of ListMappCenterWorkspaces  ListMappCenterWorkspacesRequest
     * @return ListMappCenterWorkspacesResponse
     */
    CompletableFuture<ListMappCenterWorkspacesResponse> listMappCenterWorkspaces(ListMappCenterWorkspacesRequest request);

    /**
     * @param request the request parameters of ListMcdpAim  ListMcdpAimRequest
     * @return ListMcdpAimResponse
     */
    CompletableFuture<ListMcdpAimResponse> listMcdpAim(ListMcdpAimRequest request);

    /**
     * @param request the request parameters of ListMcubeMiniApps  ListMcubeMiniAppsRequest
     * @return ListMcubeMiniAppsResponse
     */
    CompletableFuture<ListMcubeMiniAppsResponse> listMcubeMiniApps(ListMcubeMiniAppsRequest request);

    /**
     * @param request the request parameters of ListMcubeMiniPackages  ListMcubeMiniPackagesRequest
     * @return ListMcubeMiniPackagesResponse
     */
    CompletableFuture<ListMcubeMiniPackagesResponse> listMcubeMiniPackages(ListMcubeMiniPackagesRequest request);

    /**
     * @param request the request parameters of ListMcubeMiniTasks  ListMcubeMiniTasksRequest
     * @return ListMcubeMiniTasksResponse
     */
    CompletableFuture<ListMcubeMiniTasksResponse> listMcubeMiniTasks(ListMcubeMiniTasksRequest request);

    /**
     * @param request the request parameters of ListMcubeNebulaApps  ListMcubeNebulaAppsRequest
     * @return ListMcubeNebulaAppsResponse
     */
    CompletableFuture<ListMcubeNebulaAppsResponse> listMcubeNebulaApps(ListMcubeNebulaAppsRequest request);

    /**
     * @param request the request parameters of ListMcubeNebulaResources  ListMcubeNebulaResourcesRequest
     * @return ListMcubeNebulaResourcesResponse
     */
    CompletableFuture<ListMcubeNebulaResourcesResponse> listMcubeNebulaResources(ListMcubeNebulaResourcesRequest request);

    /**
     * @param request the request parameters of ListMcubeNebulaTasks  ListMcubeNebulaTasksRequest
     * @return ListMcubeNebulaTasksResponse
     */
    CompletableFuture<ListMcubeNebulaTasksResponse> listMcubeNebulaTasks(ListMcubeNebulaTasksRequest request);

    /**
     * @param request the request parameters of ListMcubeUpgradePackages  ListMcubeUpgradePackagesRequest
     * @return ListMcubeUpgradePackagesResponse
     */
    CompletableFuture<ListMcubeUpgradePackagesResponse> listMcubeUpgradePackages(ListMcubeUpgradePackagesRequest request);

    /**
     * @param request the request parameters of ListMcubeUpgradeTasks  ListMcubeUpgradeTasksRequest
     * @return ListMcubeUpgradeTasksResponse
     */
    CompletableFuture<ListMcubeUpgradeTasksResponse> listMcubeUpgradeTasks(ListMcubeUpgradeTasksRequest request);

    /**
     * @param request the request parameters of ListMcubeWhitelists  ListMcubeWhitelistsRequest
     * @return ListMcubeWhitelistsResponse
     */
    CompletableFuture<ListMcubeWhitelistsResponse> listMcubeWhitelists(ListMcubeWhitelistsRequest request);

    /**
     * @param request the request parameters of ListMdsCubeResources  ListMdsCubeResourcesRequest
     * @return ListMdsCubeResourcesResponse
     */
    CompletableFuture<ListMdsCubeResourcesResponse> listMdsCubeResources(ListMdsCubeResourcesRequest request);

    /**
     * @param request the request parameters of ListMdsCubeTasks  ListMdsCubeTasksRequest
     * @return ListMdsCubeTasksResponse
     */
    CompletableFuture<ListMdsCubeTasksResponse> listMdsCubeTasks(ListMdsCubeTasksRequest request);

    /**
     * @param request the request parameters of ListMdsCubeTemplates  ListMdsCubeTemplatesRequest
     * @return ListMdsCubeTemplatesResponse
     */
    CompletableFuture<ListMdsCubeTemplatesResponse> listMdsCubeTemplates(ListMdsCubeTemplatesRequest request);

    /**
     * @param request the request parameters of ListMgsApi  ListMgsApiRequest
     * @return ListMgsApiResponse
     */
    CompletableFuture<ListMgsApiResponse> listMgsApi(ListMgsApiRequest request);

    /**
     * @param request the request parameters of ListTemplatePage  ListTemplatePageRequest
     * @return ListTemplatePageResponse
     */
    CompletableFuture<ListTemplatePageResponse> listTemplatePage(ListTemplatePageRequest request);

    /**
     * @param request the request parameters of MTRSOCRService  MTRSOCRServiceRequest
     * @return MTRSOCRServiceResponse
     */
    CompletableFuture<MTRSOCRServiceResponse> mTRSOCRService(MTRSOCRServiceRequest request);

    /**
     * @param request the request parameters of PushBind  PushBindRequest
     * @return PushBindResponse
     */
    CompletableFuture<PushBindResponse> pushBind(PushBindRequest request);

    /**
     * @param request the request parameters of PushBroadcast  PushBroadcastRequest
     * @return PushBroadcastResponse
     */
    CompletableFuture<PushBroadcastResponse> pushBroadcast(PushBroadcastRequest request);

    /**
     * @param request the request parameters of PushMultiple  PushMultipleRequest
     * @return PushMultipleResponse
     */
    CompletableFuture<PushMultipleResponse> pushMultiple(PushMultipleRequest request);

    /**
     * @param request the request parameters of PushQueryDeviceState  PushQueryDeviceStateRequest
     * @return PushQueryDeviceStateResponse
     */
    CompletableFuture<PushQueryDeviceStateResponse> pushQueryDeviceState(PushQueryDeviceStateRequest request);

    /**
     * @param request the request parameters of PushReport  PushReportRequest
     * @return PushReportResponse
     */
    CompletableFuture<PushReportResponse> pushReport(PushReportRequest request);

    /**
     * @param request the request parameters of PushSimple  PushSimpleRequest
     * @return PushSimpleResponse
     */
    CompletableFuture<PushSimpleResponse> pushSimple(PushSimpleRequest request);

    /**
     * @param request the request parameters of PushTemplate  PushTemplateRequest
     * @return PushTemplateResponse
     */
    CompletableFuture<PushTemplateResponse> pushTemplate(PushTemplateRequest request);

    /**
     * @param request the request parameters of PushUnBind  PushUnBindRequest
     * @return PushUnBindResponse
     */
    CompletableFuture<PushUnBindResponse> pushUnBind(PushUnBindRequest request);

    /**
     * @param request the request parameters of QueryCubecardFiletoken  QueryCubecardFiletokenRequest
     * @return QueryCubecardFiletokenResponse
     */
    CompletableFuture<QueryCubecardFiletokenResponse> queryCubecardFiletoken(QueryCubecardFiletokenRequest request);

    /**
     * @param request the request parameters of QueryInfoFromMdp  QueryInfoFromMdpRequest
     * @return QueryInfoFromMdpResponse
     */
    CompletableFuture<QueryInfoFromMdpResponse> queryInfoFromMdp(QueryInfoFromMdpRequest request);

    /**
     * @param request the request parameters of QueryLink  QueryLinkRequest
     * @return QueryLinkResponse
     */
    CompletableFuture<QueryLinkResponse> queryLink(QueryLinkRequest request);

    /**
     * @param request the request parameters of QueryMappCenterApp  QueryMappCenterAppRequest
     * @return QueryMappCenterAppResponse
     */
    CompletableFuture<QueryMappCenterAppResponse> queryMappCenterApp(QueryMappCenterAppRequest request);

    /**
     * @param request the request parameters of QueryMcdpAim  QueryMcdpAimRequest
     * @return QueryMcdpAimResponse
     */
    CompletableFuture<QueryMcdpAimResponse> queryMcdpAim(QueryMcdpAimRequest request);

    /**
     * @param request the request parameters of QueryMcdpZone  QueryMcdpZoneRequest
     * @return QueryMcdpZoneResponse
     */
    CompletableFuture<QueryMcdpZoneResponse> queryMcdpZone(QueryMcdpZoneRequest request);

    /**
     * @param request the request parameters of QueryMcubeMiniPackage  QueryMcubeMiniPackageRequest
     * @return QueryMcubeMiniPackageResponse
     */
    CompletableFuture<QueryMcubeMiniPackageResponse> queryMcubeMiniPackage(QueryMcubeMiniPackageRequest request);

    /**
     * @param request the request parameters of QueryMcubeMiniTask  QueryMcubeMiniTaskRequest
     * @return QueryMcubeMiniTaskResponse
     */
    CompletableFuture<QueryMcubeMiniTaskResponse> queryMcubeMiniTask(QueryMcubeMiniTaskRequest request);

    /**
     * @param request the request parameters of QueryMcubeVhost  QueryMcubeVhostRequest
     * @return QueryMcubeVhostResponse
     */
    CompletableFuture<QueryMcubeVhostResponse> queryMcubeVhost(QueryMcubeVhostRequest request);

    /**
     * @param request the request parameters of QueryMdsUpgradeTaskDetail  QueryMdsUpgradeTaskDetailRequest
     * @return QueryMdsUpgradeTaskDetailResponse
     */
    CompletableFuture<QueryMdsUpgradeTaskDetailResponse> queryMdsUpgradeTaskDetail(QueryMdsUpgradeTaskDetailRequest request);

    /**
     * @param request the request parameters of QueryMgsApipage  QueryMgsApipageRequest
     * @return QueryMgsApipageResponse
     */
    CompletableFuture<QueryMgsApipageResponse> queryMgsApipage(QueryMgsApipageRequest request);

    /**
     * @param request the request parameters of QueryMgsApirest  QueryMgsApirestRequest
     * @return QueryMgsApirestResponse
     */
    CompletableFuture<QueryMgsApirestResponse> queryMgsApirest(QueryMgsApirestRequest request);

    /**
     * @param request the request parameters of QueryMgsTestreqbodyautogen  QueryMgsTestreqbodyautogenRequest
     * @return QueryMgsTestreqbodyautogenResponse
     */
    CompletableFuture<QueryMgsTestreqbodyautogenResponse> queryMgsTestreqbodyautogen(QueryMgsTestreqbodyautogenRequest request);

    /**
     * @param request the request parameters of QueryMpsSchedulerList  QueryMpsSchedulerListRequest
     * @return QueryMpsSchedulerListResponse
     */
    CompletableFuture<QueryMpsSchedulerListResponse> queryMpsSchedulerList(QueryMpsSchedulerListRequest request);

    /**
     * @param request the request parameters of QueryPushAnalysisCoreIndex  QueryPushAnalysisCoreIndexRequest
     * @return QueryPushAnalysisCoreIndexResponse
     */
    CompletableFuture<QueryPushAnalysisCoreIndexResponse> queryPushAnalysisCoreIndex(QueryPushAnalysisCoreIndexRequest request);

    /**
     * @param request the request parameters of QueryPushAnalysisTaskDetail  QueryPushAnalysisTaskDetailRequest
     * @return QueryPushAnalysisTaskDetailResponse
     */
    CompletableFuture<QueryPushAnalysisTaskDetailResponse> queryPushAnalysisTaskDetail(QueryPushAnalysisTaskDetailRequest request);

    /**
     * @param request the request parameters of QueryPushAnalysisTaskList  QueryPushAnalysisTaskListRequest
     * @return QueryPushAnalysisTaskListResponse
     */
    CompletableFuture<QueryPushAnalysisTaskListResponse> queryPushAnalysisTaskList(QueryPushAnalysisTaskListRequest request);

    /**
     * @param request the request parameters of QueryPushSchedulerList  QueryPushSchedulerListRequest
     * @return QueryPushSchedulerListResponse
     */
    CompletableFuture<QueryPushSchedulerListResponse> queryPushSchedulerList(QueryPushSchedulerListRequest request);

    /**
     * @param request the request parameters of RevokePushMessage  RevokePushMessageRequest
     * @return RevokePushMessageResponse
     */
    CompletableFuture<RevokePushMessageResponse> revokePushMessage(RevokePushMessageRequest request);

    /**
     * @param request the request parameters of RevokePushTask  RevokePushTaskRequest
     * @return RevokePushTaskResponse
     */
    CompletableFuture<RevokePushTaskResponse> revokePushTask(RevokePushTaskRequest request);

    /**
     * @param request the request parameters of RunMsaDiff  RunMsaDiffRequest
     * @return RunMsaDiffResponse
     */
    CompletableFuture<RunMsaDiffResponse> runMsaDiff(RunMsaDiffRequest request);

    /**
     * @param request the request parameters of SaveMgsApirest  SaveMgsApirestRequest
     * @return SaveMgsApirestResponse
     */
    CompletableFuture<SaveMgsApirestResponse> saveMgsApirest(SaveMgsApirestRequest request);

    /**
     * @param request the request parameters of StartUserAppAsyncEnhanceInMsa  StartUserAppAsyncEnhanceInMsaRequest
     * @return StartUserAppAsyncEnhanceInMsaResponse
     */
    CompletableFuture<StartUserAppAsyncEnhanceInMsaResponse> startUserAppAsyncEnhanceInMsa(StartUserAppAsyncEnhanceInMsaRequest request);

    /**
     * @param request the request parameters of UpdateLink  UpdateLinkRequest
     * @return UpdateLinkResponse
     */
    CompletableFuture<UpdateLinkResponse> updateLink(UpdateLinkRequest request);

    /**
     * @param request the request parameters of UpdateMcubeWhitelist  UpdateMcubeWhitelistRequest
     * @return UpdateMcubeWhitelistResponse
     */
    CompletableFuture<UpdateMcubeWhitelistResponse> updateMcubeWhitelist(UpdateMcubeWhitelistRequest request);

    /**
     * @param request the request parameters of UpdateMdsCubeResource  UpdateMdsCubeResourceRequest
     * @return UpdateMdsCubeResourceResponse
     */
    CompletableFuture<UpdateMdsCubeResourceResponse> updateMdsCubeResource(UpdateMdsCubeResourceRequest request);

    /**
     * @param request the request parameters of UpdateMpaasAppInfo  UpdateMpaasAppInfoRequest
     * @return UpdateMpaasAppInfoResponse
     */
    CompletableFuture<UpdateMpaasAppInfoResponse> updateMpaasAppInfo(UpdateMpaasAppInfoRequest request);

    /**
     * @param request the request parameters of UploadBitcodeToMsa  UploadBitcodeToMsaRequest
     * @return UploadBitcodeToMsaResponse
     */
    CompletableFuture<UploadBitcodeToMsaResponse> uploadBitcodeToMsa(UploadBitcodeToMsaRequest request);

    /**
     * @param request the request parameters of UploadMcubeMiniPackage  UploadMcubeMiniPackageRequest
     * @return UploadMcubeMiniPackageResponse
     */
    CompletableFuture<UploadMcubeMiniPackageResponse> uploadMcubeMiniPackage(UploadMcubeMiniPackageRequest request);

    /**
     * @param request the request parameters of UploadMcubeRsaKey  UploadMcubeRsaKeyRequest
     * @return UploadMcubeRsaKeyResponse
     */
    CompletableFuture<UploadMcubeRsaKeyResponse> uploadMcubeRsaKey(UploadMcubeRsaKeyRequest request);

    /**
     * @param request the request parameters of UploadUserAppToMsa  UploadUserAppToMsaRequest
     * @return UploadUserAppToMsaResponse
     */
    CompletableFuture<UploadUserAppToMsaResponse> uploadUserAppToMsa(UploadUserAppToMsaRequest request);

}
