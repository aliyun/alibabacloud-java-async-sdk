// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20200710;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.mpaas20200710.models.*;
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
     * @param request the request parameters of CancelMpsScheduler  CancelMpsSchedulerRequest
     * @return CancelMpsSchedulerResponse
     */
    CompletableFuture<CancelMpsSchedulerResponse> cancelMpsScheduler(CancelMpsSchedulerRequest request);

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
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * @param request the request parameters of ListAnalysisCoreIndex  ListAnalysisCoreIndexRequest
     * @return ListAnalysisCoreIndexResponse
     */
    CompletableFuture<ListAnalysisCoreIndexResponse> listAnalysisCoreIndex(ListAnalysisCoreIndexRequest request);

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
     * @param request the request parameters of ListTemplatePage  ListTemplatePageRequest
     * @return ListTemplatePageResponse
     */
    CompletableFuture<ListTemplatePageResponse> listTemplatePage(ListTemplatePageRequest request);

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
     * @param request the request parameters of UpdateMcubeWhitelist  UpdateMcubeWhitelistRequest
     * @return UpdateMcubeWhitelistResponse
     */
    CompletableFuture<UpdateMcubeWhitelistResponse> updateMcubeWhitelist(UpdateMcubeWhitelistRequest request);

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

}
