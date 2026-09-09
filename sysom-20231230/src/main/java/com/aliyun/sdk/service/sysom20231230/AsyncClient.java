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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The diagnosis feature requires a service-linked role to be created under the Resource Access Management (RAM) user. Invoking this operation automatically checks whether the service-linked role exists and creates it if it does not. The RAM user that invokes this operation must have the ram:CreateServiceLinkedRole permission.</notice>
     * Take note of the following items when you invoke this operation to authorize SysOM to diagnose ECS instances:</p>
     * </blockquote>
     * <ul>
     * <li>Each authorization is valid for 7 days. After 7 days, the authorization expires and you must invoke this operation again to re-authorize.</li>
     * <li>If the SysOM service-linked role (AliyunServiceRoleForSysom) does not exist when you invoke this operation, automatic creation is performed. The Resource Access Management (RAM) user that invokes this operation must have the <code>ram:CreateServiceLinkedRole</code> permission.</li>
     * <li>When you invoke this operation to authorize diagnosis on a specific instance, the label <code>sysom:diagnosis</code> is automatically associated with the target ECS instance. SysOM only allows diagnosis on instances that have this label.</li>
     * </ul>
     * 
     * @param request the request parameters of AuthDiagnosis  AuthDiagnosisRequest
     * @return AuthDiagnosisResponse
     */
    CompletableFuture<AuthDiagnosisResponse> authDiagnosis(AuthDiagnosisRequest request);

    /**
     * <b>description</b> :
     * <p>The instance list returned by this operation contains only instances that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of CheckInstanceSupport  CheckInstanceSupportRequest
     * @return CheckInstanceSupportResponse
     */
    CompletableFuture<CheckInstanceSupportResponse> checkInstanceSupport(CheckInstanceSupportRequest request);

    /**
     * @param request the request parameters of CpuHighAgentStreamResponse  CpuHighAgentStreamResponseRequest
     * @return CpuHighAgentStreamResponseResponse
     */
    CompletableFuture<CpuHighAgentStreamResponseResponse> cpuHighAgentStreamResponse(CpuHighAgentStreamResponseRequest request);

<ReturnT> CompletableFuture<ReturnT> cpuHighAgentStreamResponseWithAsyncResponseHandler(CpuHighAgentStreamResponseRequest request, AsyncResponseHandler<CpuHighAgentStreamResponseResponse, ReturnT> responseHandler);

    ResponseIterable<CpuHighAgentStreamResponseResponseBody> cpuHighAgentStreamResponseWithResponseIterable(CpuHighAgentStreamResponseRequest request);

    /**
     * @param request the request parameters of CreateAlertDestination  CreateAlertDestinationRequest
     * @return CreateAlertDestinationResponse
     */
    CompletableFuture<CreateAlertDestinationResponse> createAlertDestination(CreateAlertDestinationRequest request);

    /**
     * @param request the request parameters of CreateAlertStrategy  CreateAlertStrategyRequest
     * @return CreateAlertStrategyResponse
     */
    CompletableFuture<CreateAlertStrategyResponse> createAlertStrategy(CreateAlertStrategyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Use this operation with the call_sseapi interface of the aliyun-tea-openapi-inner package.</li>
     * <li>Populate the parameters based on the general LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned data from a string to a dict before use. Refer to the general LLM service response format.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateClusterVpcEndpointConnection  CreateClusterVpcEndpointConnectionRequest
     * @return CreateClusterVpcEndpointConnectionResponse
     */
    CompletableFuture<CreateClusterVpcEndpointConnectionResponse> createClusterVpcEndpointConnection(CreateClusterVpcEndpointConnectionRequest request);

    /**
     * @param request the request parameters of CreateInstanceInspection  CreateInstanceInspectionRequest
     * @return CreateInstanceInspectionResponse
     */
    CompletableFuture<CreateInstanceInspectionResponse> createInstanceInspection(CreateInstanceInspectionRequest request);

    /**
     * @param request the request parameters of CreateVmcoreDiagnosisTask  CreateVmcoreDiagnosisTaskRequest
     * @return CreateVmcoreDiagnosisTaskResponse
     */
    CompletableFuture<CreateVmcoreDiagnosisTaskResponse> createVmcoreDiagnosisTask(CreateVmcoreDiagnosisTaskRequest request);

    /**
     * @param request the request parameters of DeleteAlertDestination  DeleteAlertDestinationRequest
     * @return DeleteAlertDestinationResponse
     */
    CompletableFuture<DeleteAlertDestinationResponse> deleteAlertDestination(DeleteAlertDestinationRequest request);

    /**
     * @param request the request parameters of DeleteAlertStrategy  DeleteAlertStrategyRequest
     * @return DeleteAlertStrategyResponse
     */
    CompletableFuture<DeleteAlertStrategyResponse> deleteAlertStrategy(DeleteAlertStrategyRequest request);

    /**
     * <b>description</b> :
     * <p>The instance list retrieved by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of DescribeMetricList  DescribeMetricListRequest
     * @return DescribeMetricListResponse
     */
    CompletableFuture<DescribeMetricListResponse> describeMetricList(DescribeMetricListRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Populate the parameters based on the standard LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned data from a string to a dict before use. Refer to the standard LLM service response format.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateCopilotResponse  GenerateCopilotResponseRequest
     * @return GenerateCopilotResponseResponse
     */
    CompletableFuture<GenerateCopilotResponseResponse> generateCopilotResponse(GenerateCopilotResponseRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Use this operation together with the call_sseapi interface in the aliyun-tea-openapi-inner package.</li>
     * <li>Populate parameters based on the standard LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned string data to a dict before use. Refer to the standard LLM service response format.</li>
     * </ul>
     * 
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
     * @param request the request parameters of GetAlertDestination  GetAlertDestinationRequest
     * @return GetAlertDestinationResponse
     */
    CompletableFuture<GetAlertDestinationResponse> getAlertDestination(GetAlertDestinationRequest request);

    /**
     * @param request the request parameters of GetAlertStrategy  GetAlertStrategyRequest
     * @return GetAlertStrategyResponse
     */
    CompletableFuture<GetAlertStrategyResponse> getAlertStrategy(GetAlertStrategyRequest request);

    /**
     * @param request the request parameters of GetConfigByName  GetConfigByNameRequest
     * @return GetConfigByNameResponse
     */
    CompletableFuture<GetConfigByNameResponse> getConfigByName(GetConfigByNameRequest request);

    /**
     * @param request the request parameters of GetCopilotHistory  GetCopilotHistoryRequest
     * @return GetCopilotHistoryResponse
     */
    CompletableFuture<GetCopilotHistoryResponse> getCopilotHistory(GetCopilotHistoryRequest request);

    /**
     * <b>description</b> :
     * <p>The diagnostic process is asynchronous. When you call this operation, the diagnosis may still be running. You can check the <code>data.status</code> field in the response to determine the status. When <code>data.status == Success</code>, the diagnosis is complete and you can read the diagnostic result from <code>data.result</code>.</p>
     * 
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
     * @param request the request parameters of GetInspectionReport  GetInspectionReportRequest
     * @return GetInspectionReportResponse
     */
    CompletableFuture<GetInspectionReportResponse> getInspectionReport(GetInspectionReportRequest request);

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
     * <b>description</b> :
     * <p>Retrieves the service configuration status.</p>
     * 
     * @param request the request parameters of GetServiceFuncStatus  GetServiceFuncStatusRequest
     * @return GetServiceFuncStatusResponse
     */
    CompletableFuture<GetServiceFuncStatusResponse> getServiceFuncStatus(GetServiceFuncStatusRequest request);

    /**
     * @param request the request parameters of GetVmcoreDiagnosisTask  GetVmcoreDiagnosisTaskRequest
     * @return GetVmcoreDiagnosisTaskResponse
     */
    CompletableFuture<GetVmcoreDiagnosisTaskResponse> getVmcoreDiagnosisTask(GetVmcoreDiagnosisTaskRequest request);

    /**
     * <b>description</b> :
     * <p>Some SysOM API operations require role assumption based on the <code>AliyunServiceRoleForSysom</code> service-linked role. Before using SysOM features, invoke this operation to perform initialization and ensure that the service-linked role has been created.</p>
     * <ul>
     * <li><code>check_only</code>: If this parameter is set to True, the operation only checks whether the service-linked role exists and does not create it. If this parameter is set to False or left empty, invoking this operation triggers automatic creation of the service-linked role if it does not exist.<blockquote>
     * <p>Note: When you call this operation to initialize the role through the API, you agree to the user agreement of the operating system console by default. For more information, refer to: <a href="https://www.alibabacloud.com/help/en/alinux/product-overview/os-console-overview">Operating system console overview</a>, <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202001091714_51956.html">Alibaba Cloud Service Trial Terms</a></p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of InitialSysom  InitialSysomRequest
     * @return InitialSysomResponse
     */
    CompletableFuture<InitialSysomResponse> initialSysom(InitialSysomRequest request);

    /**
     * <b>description</b> :
     * <p>Calling this operation to install an Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to query the task execution status.</p>
     * 
     * @param request the request parameters of InstallAgent  InstallAgentRequest
     * @return InstallAgentResponse
     */
    CompletableFuture<InstallAgentResponse> installAgent(InstallAgentRequest request);

    /**
     * <b>description</b> :
     * <p>After you install a component on the target ACK cluster:</p>
     * <ol>
     * <li>First, when the cluster is managed for the first time, the component is installed on all existing ECS instances in the cluster. If the cluster contains more than 50 nodes, only 50 instances are processed in the first batch.</li>
     * <li>Then, the operating system console periodically checks the scaling status of the managed cluster in each epoch. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on the instance without user intervention.</li>
     * </ol>
     * 
     * @param request the request parameters of InstallAgentForCluster  InstallAgentForClusterRequest
     * @return InstallAgentForClusterResponse
     */
    CompletableFuture<InstallAgentForClusterResponse> installAgentForCluster(InstallAgentForClusterRequest request);

    /**
     * <b>description</b> :
     * <p>Calling this operation to install an Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to retrieve the task execution status.</p>
     * 
     * @param request the request parameters of InstallAgentWithType  InstallAgentWithTypeRequest
     * @return InstallAgentWithTypeResponse
     */
    CompletableFuture<InstallAgentWithTypeResponse> installAgentWithType(InstallAgentWithTypeRequest request);

    /**
     * @param request the request parameters of InvokeAnomalyDiagnosis  InvokeAnomalyDiagnosisRequest
     * @return InvokeAnomalyDiagnosisResponse
     */
    CompletableFuture<InvokeAnomalyDiagnosisResponse> invokeAnomalyDiagnosis(InvokeAnomalyDiagnosisRequest request);

    /**
     * <b>description</b> :
     * <p>The following requirements must be met to diagnose a target ECS instance:</p>
     * <ul>
     * <li>The target ECS instance status must be Running.</li>
     * <li>Cloud Assistant must be installed on the target ECS instance. If it is not installed, refer to <a href="https://www.alibabacloud.com/help/en/ecs/user-guide/install-the-cloud-assistant-agent">Install the Cloud Assistant Agent</a> for installation.</li>
     * <li>You must invoke the AuthDiagnosis operation to authorize SysOM to diagnose the target ECS instance. If authorization is not granted, this operation directly fails.</li>
     * <li>This operation depends on the SysOM service-linked role (AliyunServiceRoleForSysom) being created. This operation does not automatically create the service-linked role. If the service-linked role does not exist, first invoke AuthDiagnosis to associate the authorization. That operation creates the aforementioned service-linked role.</li>
     * </ul>
     * 
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
     * @param request the request parameters of ListAlertDestinations  ListAlertDestinationsRequest
     * @return ListAlertDestinationsResponse
     */
    CompletableFuture<ListAlertDestinationsResponse> listAlertDestinations(ListAlertDestinationsRequest request);

    /**
     * @param request the request parameters of ListAlertItems  ListAlertItemsRequest
     * @return ListAlertItemsResponse
     */
    CompletableFuture<ListAlertItemsResponse> listAlertItems(ListAlertItemsRequest request);

    /**
     * @param request the request parameters of ListAlertStrategies  ListAlertStrategiesRequest
     * @return ListAlertStrategiesResponse
     */
    CompletableFuture<ListAlertStrategiesResponse> listAlertStrategies(ListAlertStrategiesRequest request);

    /**
     * @param request the request parameters of ListAllInstances  ListAllInstancesRequest
     * @return ListAllInstancesResponse
     */
    CompletableFuture<ListAllInstancesResponse> listAllInstances(ListAllInstancesRequest request);

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
     * @param request the request parameters of ListInstanceInfo  ListInstanceInfoRequest
     * @return ListInstanceInfoResponse
     */
    CompletableFuture<ListInstanceInfoResponse> listInstanceInfo(ListInstanceInfoRequest request);

    /**
     * <b>description</b> :
     * <p>Retrieves the list of machines managed by SysOM.</p>
     * 
     * @param request the request parameters of ListInstanceStatus  ListInstanceStatusRequest
     * @return ListInstanceStatusResponse
     */
    CompletableFuture<ListInstanceStatusResponse> listInstanceStatus(ListInstanceStatusRequest request);

    /**
     * <b>description</b> :
     * <p>This operation retrieves the list of instances that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>The instance list retrieved by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of ListInstancesEcsInfoList  ListInstancesEcsInfoListRequest
     * @return ListInstancesEcsInfoListResponse
     */
    CompletableFuture<ListInstancesEcsInfoListResponse> listInstancesEcsInfoList(ListInstancesEcsInfoListRequest request);

    /**
     * <b>description</b> :
     * <p>The instance list returned by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of ListInstancesWithEcsInfo  ListInstancesWithEcsInfoRequest
     * @return ListInstancesWithEcsInfoResponse
     */
    CompletableFuture<ListInstancesWithEcsInfoResponse> listInstancesWithEcsInfo(ListInstancesWithEcsInfoRequest request);

    /**
     * <b>description</b> :
     * <p>The instance list retrieved by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
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
     * <b>description</b> :
     * <p>This operation retrieves the list of regions where the current user has instances managed by SysOM. If a user has ECS instances in a region but none of them are managed by SysOM, that region is not included in the response.</p>
     * 
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request);

    /**
     * @param request the request parameters of ListVmcoreDiagnosisTask  ListVmcoreDiagnosisTaskRequest
     * @return ListVmcoreDiagnosisTaskResponse
     */
    CompletableFuture<ListVmcoreDiagnosisTaskResponse> listVmcoreDiagnosisTask(ListVmcoreDiagnosisTaskRequest request);

    /**
     * @param request the request parameters of StartAIAnalysis  StartAIAnalysisRequest
     * @return StartAIAnalysisResponse
     */
    CompletableFuture<StartAIAnalysisResponse> startAIAnalysis(StartAIAnalysisRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, only comparative analysis of the same pid across different steps within the same AI Infra analysis record is supported.</p>
     * 
     * @param request the request parameters of StartAIDiffAnalysis  StartAIDiffAnalysisRequest
     * @return StartAIDiffAnalysisResponse
     */
    CompletableFuture<StartAIDiffAnalysisResponse> startAIDiffAnalysis(StartAIDiffAnalysisRequest request);

    /**
     * <b>description</b> :
     * <p>Calling this operation to uninstall an Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
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
     * <b>description</b> :
     * <p>Calling this operation to uninstall an Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * @param request the request parameters of UninstallAgentWithType  UninstallAgentWithTypeRequest
     * @return UninstallAgentWithTypeResponse
     */
    CompletableFuture<UninstallAgentWithTypeResponse> uninstallAgentWithType(UninstallAgentWithTypeRequest request);

    /**
     * <b>description</b> :
     * <p>、</p>
     * 
     * @param request the request parameters of UpdateAlertDestination  UpdateAlertDestinationRequest
     * @return UpdateAlertDestinationResponse
     */
    CompletableFuture<UpdateAlertDestinationResponse> updateAlertDestination(UpdateAlertDestinationRequest request);

    /**
     * @param request the request parameters of UpdateAlertEnabled  UpdateAlertEnabledRequest
     * @return UpdateAlertEnabledResponse
     */
    CompletableFuture<UpdateAlertEnabledResponse> updateAlertEnabled(UpdateAlertEnabledRequest request);

    /**
     * @param request the request parameters of UpdateAlertStrategy  UpdateAlertStrategyRequest
     * @return UpdateAlertStrategyResponse
     */
    CompletableFuture<UpdateAlertStrategyResponse> updateAlertStrategy(UpdateAlertStrategyRequest request);

    /**
     * @param request the request parameters of UpdateEventsAttention  UpdateEventsAttentionRequest
     * @return UpdateEventsAttentionResponse
     */
    CompletableFuture<UpdateEventsAttentionResponse> updateEventsAttention(UpdateEventsAttentionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Populate parameters according to the general LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned data from a string to a dict before use. Refer to the general LLM service response format.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateFuncSwitchRecord  UpdateFuncSwitchRecordRequest
     * @return UpdateFuncSwitchRecordResponse
     */
    CompletableFuture<UpdateFuncSwitchRecordResponse> updateFuncSwitchRecord(UpdateFuncSwitchRecordRequest request);

    /**
     * <b>description</b> :
     * <p>Calling this operation to update the Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * @param request the request parameters of UpgradeAgent  UpgradeAgentRequest
     * @return UpgradeAgentResponse
     */
    CompletableFuture<UpgradeAgentResponse> upgradeAgent(UpgradeAgentRequest request);

    /**
     * @param request the request parameters of UpgradeAgentForCluster  UpgradeAgentForClusterRequest
     * @return UpgradeAgentForClusterResponse
     */
    CompletableFuture<UpgradeAgentForClusterResponse> upgradeAgentForCluster(UpgradeAgentForClusterRequest request);

    /**
     * <b>description</b> :
     * <p>Calling this operation to update the Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * @param request the request parameters of UpgradeAgentWithType  UpgradeAgentWithTypeRequest
     * @return UpgradeAgentWithTypeResponse
     */
    CompletableFuture<UpgradeAgentWithTypeResponse> upgradeAgentWithType(UpgradeAgentWithTypeRequest request);

}
