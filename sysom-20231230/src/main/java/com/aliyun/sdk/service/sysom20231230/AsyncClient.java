// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.sysom20231230.models.*;
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
     * @param request the request parameters of AuthDiagnosis  AuthDiagnosisRequest
     * @return AuthDiagnosisResponse
     */
    CompletableFuture<AuthDiagnosisResponse> authDiagnosis(AuthDiagnosisRequest request);

    /**
     * @param request the request parameters of CheckInstanceSupport  CheckInstanceSupportRequest
     * @return CheckInstanceSupportResponse
     */
    CompletableFuture<CheckInstanceSupportResponse> checkInstanceSupport(CheckInstanceSupportRequest request);

    /**
     * @param request the request parameters of GenerateCopilotResponse  GenerateCopilotResponseRequest
     * @return GenerateCopilotResponseResponse
     */
    CompletableFuture<GenerateCopilotResponseResponse> generateCopilotResponse(GenerateCopilotResponseRequest request);

    /**
     * @param request the request parameters of GenerateCopilotStreamResponse  GenerateCopilotStreamResponseRequest
     * @return GenerateCopilotStreamResponseResponse
     */
    CompletableFuture<GenerateCopilotStreamResponseResponse> generateCopilotStreamResponse(GenerateCopilotStreamResponseRequest request);

    ResponseIterable<GenerateCopilotStreamResponseResponseBody> generateCopilotStreamResponseWithResponseIterable(GenerateCopilotStreamResponseRequest request);

    /**
     * @param request the request parameters of GetAIQueryResult  GetAIQueryResultRequest
     * @return GetAIQueryResultResponse
     */
    CompletableFuture<GetAIQueryResultResponse> getAIQueryResult(GetAIQueryResultRequest request);

    /**
     * @param request the request parameters of GetAbnormalEventsCount  GetAbnormalEventsCountRequest
     * @return GetAbnormalEventsCountResponse
     */
    CompletableFuture<GetAbnormalEventsCountResponse> getAbnormalEventsCount(GetAbnormalEventsCountRequest request);

    /**
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request);

    /**
     * @param request the request parameters of GetAgentTask  GetAgentTaskRequest
     * @return GetAgentTaskResponse
     */
    CompletableFuture<GetAgentTaskResponse> getAgentTask(GetAgentTaskRequest request);

    /**
     * @param request the request parameters of GetCopilotHistory  GetCopilotHistoryRequest
     * @return GetCopilotHistoryResponse
     */
    CompletableFuture<GetCopilotHistoryResponse> getCopilotHistory(GetCopilotHistoryRequest request);

    /**
     * @param request the request parameters of GetDiagnosisResult  GetDiagnosisResultRequest
     * @return GetDiagnosisResultResponse
     */
    CompletableFuture<GetDiagnosisResultResponse> getDiagnosisResult(GetDiagnosisResultRequest request);

    /**
     * @param request the request parameters of GetHealthPercentage  GetHealthPercentageRequest
     * @return GetHealthPercentageResponse
     */
    CompletableFuture<GetHealthPercentageResponse> getHealthPercentage(GetHealthPercentageRequest request);

    /**
     * @param request the request parameters of GetHostCount  GetHostCountRequest
     * @return GetHostCountResponse
     */
    CompletableFuture<GetHostCountResponse> getHostCount(GetHostCountRequest request);

    /**
     * @param request the request parameters of GetHotSpotUniqList  GetHotSpotUniqListRequest
     * @return GetHotSpotUniqListResponse
     */
    CompletableFuture<GetHotSpotUniqListResponse> getHotSpotUniqList(GetHotSpotUniqListRequest request);

    /**
     * @param request the request parameters of GetHotspotAnalysis  GetHotspotAnalysisRequest
     * @return GetHotspotAnalysisResponse
     */
    CompletableFuture<GetHotspotAnalysisResponse> getHotspotAnalysis(GetHotspotAnalysisRequest request);

    /**
     * @param request the request parameters of GetHotspotCompare  GetHotspotCompareRequest
     * @return GetHotspotCompareResponse
     */
    CompletableFuture<GetHotspotCompareResponse> getHotspotCompare(GetHotspotCompareRequest request);

    /**
     * @param request the request parameters of GetHotspotInstanceList  GetHotspotInstanceListRequest
     * @return GetHotspotInstanceListResponse
     */
    CompletableFuture<GetHotspotInstanceListResponse> getHotspotInstanceList(GetHotspotInstanceListRequest request);

    /**
     * @param request the request parameters of GetHotspotPidList  GetHotspotPidListRequest
     * @return GetHotspotPidListResponse
     */
    CompletableFuture<GetHotspotPidListResponse> getHotspotPidList(GetHotspotPidListRequest request);

    /**
     * @param request the request parameters of GetHotspotTracking  GetHotspotTrackingRequest
     * @return GetHotspotTrackingResponse
     */
    CompletableFuture<GetHotspotTrackingResponse> getHotspotTracking(GetHotspotTrackingRequest request);

    /**
     * @param request the request parameters of GetInstantScore  GetInstantScoreRequest
     * @return GetInstantScoreResponse
     */
    CompletableFuture<GetInstantScoreResponse> getInstantScore(GetInstantScoreRequest request);

    /**
     * @param request the request parameters of GetListRecord  GetListRecordRequest
     * @return GetListRecordResponse
     */
    CompletableFuture<GetListRecordResponse> getListRecord(GetListRecordRequest request);

    /**
     * @param request the request parameters of GetProblemPercentage  GetProblemPercentageRequest
     * @return GetProblemPercentageResponse
     */
    CompletableFuture<GetProblemPercentageResponse> getProblemPercentage(GetProblemPercentageRequest request);

    /**
     * @param request the request parameters of GetRangeScore  GetRangeScoreRequest
     * @return GetRangeScoreResponse
     */
    CompletableFuture<GetRangeScoreResponse> getRangeScore(GetRangeScoreRequest request);

    /**
     * @param request the request parameters of GetResources  GetResourcesRequest
     * @return GetResourcesResponse
     */
    CompletableFuture<GetResourcesResponse> getResources(GetResourcesRequest request);

    /**
     * @param request the request parameters of GetServiceFuncStatus  GetServiceFuncStatusRequest
     * @return GetServiceFuncStatusResponse
     */
    CompletableFuture<GetServiceFuncStatusResponse> getServiceFuncStatus(GetServiceFuncStatusRequest request);

    /**
     * @param request the request parameters of InitialSysom  InitialSysomRequest
     * @return InitialSysomResponse
     */
    CompletableFuture<InitialSysomResponse> initialSysom(InitialSysomRequest request);

    /**
     * @param request the request parameters of InstallAgent  InstallAgentRequest
     * @return InstallAgentResponse
     */
    CompletableFuture<InstallAgentResponse> installAgent(InstallAgentRequest request);

    /**
     * @param request the request parameters of InstallAgentForCluster  InstallAgentForClusterRequest
     * @return InstallAgentForClusterResponse
     */
    CompletableFuture<InstallAgentForClusterResponse> installAgentForCluster(InstallAgentForClusterRequest request);

    /**
     * @param request the request parameters of InvokeAnomalyDiagnosis  InvokeAnomalyDiagnosisRequest
     * @return InvokeAnomalyDiagnosisResponse
     */
    CompletableFuture<InvokeAnomalyDiagnosisResponse> invokeAnomalyDiagnosis(InvokeAnomalyDiagnosisRequest request);

    /**
     * @param request the request parameters of InvokeDiagnosis  InvokeDiagnosisRequest
     * @return InvokeDiagnosisResponse
     */
    CompletableFuture<InvokeDiagnosisResponse> invokeDiagnosis(InvokeDiagnosisRequest request);

    /**
     * @param request the request parameters of ListAbnormalyEvents  ListAbnormalyEventsRequest
     * @return ListAbnormalyEventsResponse
     */
    CompletableFuture<ListAbnormalyEventsResponse> listAbnormalyEvents(ListAbnormalyEventsRequest request);

    /**
     * @param request the request parameters of ListAgentInstallRecords  ListAgentInstallRecordsRequest
     * @return ListAgentInstallRecordsResponse
     */
    CompletableFuture<ListAgentInstallRecordsResponse> listAgentInstallRecords(ListAgentInstallRecordsRequest request);

    /**
     * @param request the request parameters of ListAgents  ListAgentsRequest
     * @return ListAgentsResponse
     */
    CompletableFuture<ListAgentsResponse> listAgents(ListAgentsRequest request);

    /**
     * @param request the request parameters of ListClusterAgentInstallRecords  ListClusterAgentInstallRecordsRequest
     * @return ListClusterAgentInstallRecordsResponse
     */
    CompletableFuture<ListClusterAgentInstallRecordsResponse> listClusterAgentInstallRecords(ListClusterAgentInstallRecordsRequest request);

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request);

    /**
     * @param request the request parameters of ListDiagnosis  ListDiagnosisRequest
     * @return ListDiagnosisResponse
     */
    CompletableFuture<ListDiagnosisResponse> listDiagnosis(ListDiagnosisRequest request);

    /**
     * @param request the request parameters of ListInstanceHealth  ListInstanceHealthRequest
     * @return ListInstanceHealthResponse
     */
    CompletableFuture<ListInstanceHealthResponse> listInstanceHealth(ListInstanceHealthRequest request);

    /**
     * @param request the request parameters of ListInstanceStatus  ListInstanceStatusRequest
     * @return ListInstanceStatusResponse
     */
    CompletableFuture<ListInstanceStatusResponse> listInstanceStatus(ListInstanceStatusRequest request);

    /**
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * @param request the request parameters of ListInstancesEcsInfoList  ListInstancesEcsInfoListRequest
     * @return ListInstancesEcsInfoListResponse
     */
    CompletableFuture<ListInstancesEcsInfoListResponse> listInstancesEcsInfoList(ListInstancesEcsInfoListRequest request);

    /**
     * @param request the request parameters of ListInstancesWithEcsInfo  ListInstancesWithEcsInfoRequest
     * @return ListInstancesWithEcsInfoResponse
     */
    CompletableFuture<ListInstancesWithEcsInfoResponse> listInstancesWithEcsInfo(ListInstancesWithEcsInfoRequest request);

    /**
     * @param request the request parameters of ListPluginsInstances  ListPluginsInstancesRequest
     * @return ListPluginsInstancesResponse
     */
    CompletableFuture<ListPluginsInstancesResponse> listPluginsInstances(ListPluginsInstancesRequest request);

    /**
     * @param request the request parameters of ListPodsOfInstance  ListPodsOfInstanceRequest
     * @return ListPodsOfInstanceResponse
     */
    CompletableFuture<ListPodsOfInstanceResponse> listPodsOfInstance(ListPodsOfInstanceRequest request);

    /**
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * @param request the request parameters of StartAIAnalysis  StartAIAnalysisRequest
     * @return StartAIAnalysisResponse
     */
    CompletableFuture<StartAIAnalysisResponse> startAIAnalysis(StartAIAnalysisRequest request);

    /**
     * @param request the request parameters of UninstallAgent  UninstallAgentRequest
     * @return UninstallAgentResponse
     */
    CompletableFuture<UninstallAgentResponse> uninstallAgent(UninstallAgentRequest request);

    /**
     * @param request the request parameters of UninstallAgentForCluster  UninstallAgentForClusterRequest
     * @return UninstallAgentForClusterResponse
     */
    CompletableFuture<UninstallAgentForClusterResponse> uninstallAgentForCluster(UninstallAgentForClusterRequest request);

    /**
     * @param request the request parameters of UpdateEventsAttention  UpdateEventsAttentionRequest
     * @return UpdateEventsAttentionResponse
     */
    CompletableFuture<UpdateEventsAttentionResponse> updateEventsAttention(UpdateEventsAttentionRequest request);

    /**
     * @param request the request parameters of UpdateFuncSwitchRecord  UpdateFuncSwitchRecordRequest
     * @return UpdateFuncSwitchRecordResponse
     */
    CompletableFuture<UpdateFuncSwitchRecordResponse> updateFuncSwitchRecord(UpdateFuncSwitchRecordRequest request);

    /**
     * @param request the request parameters of UpgradeAgent  UpgradeAgentRequest
     * @return UpgradeAgentResponse
     */
    CompletableFuture<UpgradeAgentResponse> upgradeAgent(UpgradeAgentRequest request);

    /**
     * @param request the request parameters of UpgradeAgentForCluster  UpgradeAgentForClusterRequest
     * @return UpgradeAgentForClusterResponse
     */
    CompletableFuture<UpgradeAgentForClusterResponse> upgradeAgentForCluster(UpgradeAgentForClusterRequest request);

}
