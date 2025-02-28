// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ververica20220718.models.*;
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
     * @param request the request parameters of ApplyScheduledPlan  ApplyScheduledPlanRequest
     * @return ApplyScheduledPlanResponse
     */
    CompletableFuture<ApplyScheduledPlanResponse> applyScheduledPlan(ApplyScheduledPlanRequest request);

    /**
     * @param request the request parameters of CreateDeployment  CreateDeploymentRequest
     * @return CreateDeploymentResponse
     */
    CompletableFuture<CreateDeploymentResponse> createDeployment(CreateDeploymentRequest request);

    /**
     * @param request the request parameters of CreateDeploymentDraft  CreateDeploymentDraftRequest
     * @return CreateDeploymentDraftResponse
     */
    CompletableFuture<CreateDeploymentDraftResponse> createDeploymentDraft(CreateDeploymentDraftRequest request);

    /**
     * @param request the request parameters of CreateDeploymentTarget  CreateDeploymentTargetRequest
     * @return CreateDeploymentTargetResponse
     */
    CompletableFuture<CreateDeploymentTargetResponse> createDeploymentTarget(CreateDeploymentTargetRequest request);

    /**
     * @param request the request parameters of CreateFolder  CreateFolderRequest
     * @return CreateFolderResponse
     */
    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    /**
     * @param request the request parameters of CreateMember  CreateMemberRequest
     * @return CreateMemberResponse
     */
    CompletableFuture<CreateMemberResponse> createMember(CreateMemberRequest request);

    /**
     * @param request the request parameters of CreateSavepoint  CreateSavepointRequest
     * @return CreateSavepointResponse
     */
    CompletableFuture<CreateSavepointResponse> createSavepoint(CreateSavepointRequest request);

    /**
     * @param request the request parameters of CreateScheduledPlan  CreateScheduledPlanRequest
     * @return CreateScheduledPlanResponse
     */
    CompletableFuture<CreateScheduledPlanResponse> createScheduledPlan(CreateScheduledPlanRequest request);

    /**
     * @param request the request parameters of CreateSessionCluster  CreateSessionClusterRequest
     * @return CreateSessionClusterResponse
     */
    CompletableFuture<CreateSessionClusterResponse> createSessionCluster(CreateSessionClusterRequest request);

    /**
     * @param request the request parameters of CreateUdfArtifact  CreateUdfArtifactRequest
     * @return CreateUdfArtifactResponse
     */
    CompletableFuture<CreateUdfArtifactResponse> createUdfArtifact(CreateUdfArtifactRequest request);

    /**
     * @param request the request parameters of CreateVariable  CreateVariableRequest
     * @return CreateVariableResponse
     */
    CompletableFuture<CreateVariableResponse> createVariable(CreateVariableRequest request);

    /**
     * @param request the request parameters of DeleteCustomConnector  DeleteCustomConnectorRequest
     * @return DeleteCustomConnectorResponse
     */
    CompletableFuture<DeleteCustomConnectorResponse> deleteCustomConnector(DeleteCustomConnectorRequest request);

    /**
     * @param request the request parameters of DeleteDeployment  DeleteDeploymentRequest
     * @return DeleteDeploymentResponse
     */
    CompletableFuture<DeleteDeploymentResponse> deleteDeployment(DeleteDeploymentRequest request);

    /**
     * @param request the request parameters of DeleteDeploymentDraft  DeleteDeploymentDraftRequest
     * @return DeleteDeploymentDraftResponse
     */
    CompletableFuture<DeleteDeploymentDraftResponse> deleteDeploymentDraft(DeleteDeploymentDraftRequest request);

    /**
     * @param request the request parameters of DeleteDeploymentTarget  DeleteDeploymentTargetRequest
     * @return DeleteDeploymentTargetResponse
     */
    CompletableFuture<DeleteDeploymentTargetResponse> deleteDeploymentTarget(DeleteDeploymentTargetRequest request);

    /**
     * @param request the request parameters of DeleteFolder  DeleteFolderRequest
     * @return DeleteFolderResponse
     */
    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    /**
     * @param request the request parameters of DeleteJob  DeleteJobRequest
     * @return DeleteJobResponse
     */
    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    /**
     * @param request the request parameters of DeleteMember  DeleteMemberRequest
     * @return DeleteMemberResponse
     */
    CompletableFuture<DeleteMemberResponse> deleteMember(DeleteMemberRequest request);

    /**
     * @param request the request parameters of DeleteSavepoint  DeleteSavepointRequest
     * @return DeleteSavepointResponse
     */
    CompletableFuture<DeleteSavepointResponse> deleteSavepoint(DeleteSavepointRequest request);

    /**
     * @param request the request parameters of DeleteScheduledPlan  DeleteScheduledPlanRequest
     * @return DeleteScheduledPlanResponse
     */
    CompletableFuture<DeleteScheduledPlanResponse> deleteScheduledPlan(DeleteScheduledPlanRequest request);

    /**
     * @param request the request parameters of DeleteSessionCluster  DeleteSessionClusterRequest
     * @return DeleteSessionClusterResponse
     */
    CompletableFuture<DeleteSessionClusterResponse> deleteSessionCluster(DeleteSessionClusterRequest request);

    /**
     * @param request the request parameters of DeleteUdfArtifact  DeleteUdfArtifactRequest
     * @return DeleteUdfArtifactResponse
     */
    CompletableFuture<DeleteUdfArtifactResponse> deleteUdfArtifact(DeleteUdfArtifactRequest request);

    /**
     * @param request the request parameters of DeleteUdfFunction  DeleteUdfFunctionRequest
     * @return DeleteUdfFunctionResponse
     */
    CompletableFuture<DeleteUdfFunctionResponse> deleteUdfFunction(DeleteUdfFunctionRequest request);

    /**
     * @param request the request parameters of DeleteVariable  DeleteVariableRequest
     * @return DeleteVariableResponse
     */
    CompletableFuture<DeleteVariableResponse> deleteVariable(DeleteVariableRequest request);

    /**
     * @param request the request parameters of DeployDeploymentDraftAsync  DeployDeploymentDraftAsyncRequest
     * @return DeployDeploymentDraftAsyncResponse
     */
    CompletableFuture<DeployDeploymentDraftAsyncResponse> deployDeploymentDraftAsync(DeployDeploymentDraftAsyncRequest request);

    /**
     * @param request the request parameters of ExecuteSqlStatement  ExecuteSqlStatementRequest
     * @return ExecuteSqlStatementResponse
     */
    CompletableFuture<ExecuteSqlStatementResponse> executeSqlStatement(ExecuteSqlStatementRequest request);

    /**
     * @param request the request parameters of FlinkApiProxy  FlinkApiProxyRequest
     * @return FlinkApiProxyResponse
     */
    CompletableFuture<FlinkApiProxyResponse> flinkApiProxy(FlinkApiProxyRequest request);

    /**
     * @param request the request parameters of GenerateResourcePlanWithFlinkConfAsync  GenerateResourcePlanWithFlinkConfAsyncRequest
     * @return GenerateResourcePlanWithFlinkConfAsyncResponse
     */
    CompletableFuture<GenerateResourcePlanWithFlinkConfAsyncResponse> generateResourcePlanWithFlinkConfAsync(GenerateResourcePlanWithFlinkConfAsyncRequest request);

    /**
     * @param request the request parameters of GetAppliedScheduledPlan  GetAppliedScheduledPlanRequest
     * @return GetAppliedScheduledPlanResponse
     */
    CompletableFuture<GetAppliedScheduledPlanResponse> getAppliedScheduledPlan(GetAppliedScheduledPlanRequest request);

    /**
     * @param request the request parameters of GetCatalogs  GetCatalogsRequest
     * @return GetCatalogsResponse
     */
    CompletableFuture<GetCatalogsResponse> getCatalogs(GetCatalogsRequest request);

    /**
     * @param request the request parameters of GetDatabases  GetDatabasesRequest
     * @return GetDatabasesResponse
     */
    CompletableFuture<GetDatabasesResponse> getDatabases(GetDatabasesRequest request);

    /**
     * @param request the request parameters of GetDeployDeploymentDraftResult  GetDeployDeploymentDraftResultRequest
     * @return GetDeployDeploymentDraftResultResponse
     */
    CompletableFuture<GetDeployDeploymentDraftResultResponse> getDeployDeploymentDraftResult(GetDeployDeploymentDraftResultRequest request);

    /**
     * @param request the request parameters of GetDeployment  GetDeploymentRequest
     * @return GetDeploymentResponse
     */
    CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request);

    /**
     * @param request the request parameters of GetDeploymentDraft  GetDeploymentDraftRequest
     * @return GetDeploymentDraftResponse
     */
    CompletableFuture<GetDeploymentDraftResponse> getDeploymentDraft(GetDeploymentDraftRequest request);

    /**
     * @param request the request parameters of GetDeploymentDraftLock  GetDeploymentDraftLockRequest
     * @return GetDeploymentDraftLockResponse
     */
    CompletableFuture<GetDeploymentDraftLockResponse> getDeploymentDraftLock(GetDeploymentDraftLockRequest request);

    /**
     * @param request the request parameters of GetEvents  GetEventsRequest
     * @return GetEventsResponse
     */
    CompletableFuture<GetEventsResponse> getEvents(GetEventsRequest request);

    /**
     * @param request the request parameters of GetFolder  GetFolderRequest
     * @return GetFolderResponse
     */
    CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request);

    /**
     * @param request the request parameters of GetGenerateResourcePlanResult  GetGenerateResourcePlanResultRequest
     * @return GetGenerateResourcePlanResultResponse
     */
    CompletableFuture<GetGenerateResourcePlanResultResponse> getGenerateResourcePlanResult(GetGenerateResourcePlanResultRequest request);

    /**
     * @param request the request parameters of GetHotUpdateJobResult  GetHotUpdateJobResultRequest
     * @return GetHotUpdateJobResultResponse
     */
    CompletableFuture<GetHotUpdateJobResultResponse> getHotUpdateJobResult(GetHotUpdateJobResultRequest request);

    /**
     * @param request the request parameters of GetJob  GetJobRequest
     * @return GetJobResponse
     */
    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    /**
     * @param request the request parameters of GetJobDiagnosis  GetJobDiagnosisRequest
     * @return GetJobDiagnosisResponse
     */
    CompletableFuture<GetJobDiagnosisResponse> getJobDiagnosis(GetJobDiagnosisRequest request);

    /**
     * @param request the request parameters of GetLatestJobStartLog  GetLatestJobStartLogRequest
     * @return GetLatestJobStartLogResponse
     */
    CompletableFuture<GetLatestJobStartLogResponse> getLatestJobStartLog(GetLatestJobStartLogRequest request);

    /**
     * @param request the request parameters of GetLineageInfo  GetLineageInfoRequest
     * @return GetLineageInfoResponse
     */
    CompletableFuture<GetLineageInfoResponse> getLineageInfo(GetLineageInfoRequest request);

    /**
     * @param request the request parameters of GetMember  GetMemberRequest
     * @return GetMemberResponse
     */
    CompletableFuture<GetMemberResponse> getMember(GetMemberRequest request);

    /**
     * @param request the request parameters of GetSavepoint  GetSavepointRequest
     * @return GetSavepointResponse
     */
    CompletableFuture<GetSavepointResponse> getSavepoint(GetSavepointRequest request);

    /**
     * @param request the request parameters of GetSessionCluster  GetSessionClusterRequest
     * @return GetSessionClusterResponse
     */
    CompletableFuture<GetSessionClusterResponse> getSessionCluster(GetSessionClusterRequest request);

    /**
     * @param request the request parameters of GetTables  GetTablesRequest
     * @return GetTablesResponse
     */
    CompletableFuture<GetTablesResponse> getTables(GetTablesRequest request);

    /**
     * @param request the request parameters of GetUdfArtifacts  GetUdfArtifactsRequest
     * @return GetUdfArtifactsResponse
     */
    CompletableFuture<GetUdfArtifactsResponse> getUdfArtifacts(GetUdfArtifactsRequest request);

    /**
     * @param request the request parameters of HotUpdateJob  HotUpdateJobRequest
     * @return HotUpdateJobResponse
     */
    CompletableFuture<HotUpdateJobResponse> hotUpdateJob(HotUpdateJobRequest request);

    /**
     * @param request the request parameters of ListCustomConnectors  ListCustomConnectorsRequest
     * @return ListCustomConnectorsResponse
     */
    CompletableFuture<ListCustomConnectorsResponse> listCustomConnectors(ListCustomConnectorsRequest request);

    /**
     * @param request the request parameters of ListDeploymentDrafts  ListDeploymentDraftsRequest
     * @return ListDeploymentDraftsResponse
     */
    CompletableFuture<ListDeploymentDraftsResponse> listDeploymentDrafts(ListDeploymentDraftsRequest request);

    /**
     * @param request the request parameters of ListDeploymentTargets  ListDeploymentTargetsRequest
     * @return ListDeploymentTargetsResponse
     */
    CompletableFuture<ListDeploymentTargetsResponse> listDeploymentTargets(ListDeploymentTargetsRequest request);

    /**
     * @param request the request parameters of ListDeployments  ListDeploymentsRequest
     * @return ListDeploymentsResponse
     */
    CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request);

    /**
     * @param request the request parameters of ListEditableNamespace  ListEditableNamespaceRequest
     * @return ListEditableNamespaceResponse
     */
    CompletableFuture<ListEditableNamespaceResponse> listEditableNamespace(ListEditableNamespaceRequest request);

    /**
     * @param request the request parameters of ListEngineVersionMetadata  ListEngineVersionMetadataRequest
     * @return ListEngineVersionMetadataResponse
     */
    CompletableFuture<ListEngineVersionMetadataResponse> listEngineVersionMetadata(ListEngineVersionMetadataRequest request);

    /**
     * @param request the request parameters of ListJobs  ListJobsRequest
     * @return ListJobsResponse
     */
    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    /**
     * @param request the request parameters of ListMembers  ListMembersRequest
     * @return ListMembersResponse
     */
    CompletableFuture<ListMembersResponse> listMembers(ListMembersRequest request);

    /**
     * @param request the request parameters of ListSavepoints  ListSavepointsRequest
     * @return ListSavepointsResponse
     */
    CompletableFuture<ListSavepointsResponse> listSavepoints(ListSavepointsRequest request);

    /**
     * @param request the request parameters of ListScheduledPlan  ListScheduledPlanRequest
     * @return ListScheduledPlanResponse
     */
    CompletableFuture<ListScheduledPlanResponse> listScheduledPlan(ListScheduledPlanRequest request);

    /**
     * @param request the request parameters of ListScheduledPlanExecutedHistory  ListScheduledPlanExecutedHistoryRequest
     * @return ListScheduledPlanExecutedHistoryResponse
     */
    CompletableFuture<ListScheduledPlanExecutedHistoryResponse> listScheduledPlanExecutedHistory(ListScheduledPlanExecutedHistoryRequest request);

    /**
     * @param request the request parameters of ListSessionClusters  ListSessionClustersRequest
     * @return ListSessionClustersResponse
     */
    CompletableFuture<ListSessionClustersResponse> listSessionClusters(ListSessionClustersRequest request);

    /**
     * @param request the request parameters of ListVariables  ListVariablesRequest
     * @return ListVariablesResponse
     */
    CompletableFuture<ListVariablesResponse> listVariables(ListVariablesRequest request);

    /**
     * @param request the request parameters of RegisterCustomConnector  RegisterCustomConnectorRequest
     * @return RegisterCustomConnectorResponse
     */
    CompletableFuture<RegisterCustomConnectorResponse> registerCustomConnector(RegisterCustomConnectorRequest request);

    /**
     * @param request the request parameters of RegisterUdfFunction  RegisterUdfFunctionRequest
     * @return RegisterUdfFunctionResponse
     */
    CompletableFuture<RegisterUdfFunctionResponse> registerUdfFunction(RegisterUdfFunctionRequest request);

    /**
     * @deprecated OpenAPI StartJob is deprecated, please use ververica::2022-07-18::StartJobWithParams instead.  * @param request  the request parameters of StartJob  StartJobRequest
     * @return StartJobResponse
     */
    @Deprecated
    CompletableFuture<StartJobResponse> startJob(StartJobRequest request);

    /**
     * @param request the request parameters of StartJobWithParams  StartJobWithParamsRequest
     * @return StartJobWithParamsResponse
     */
    CompletableFuture<StartJobWithParamsResponse> startJobWithParams(StartJobWithParamsRequest request);

    /**
     * @param request the request parameters of StartSessionCluster  StartSessionClusterRequest
     * @return StartSessionClusterResponse
     */
    CompletableFuture<StartSessionClusterResponse> startSessionCluster(StartSessionClusterRequest request);

    /**
     * @param request the request parameters of StopApplyScheduledPlan  StopApplyScheduledPlanRequest
     * @return StopApplyScheduledPlanResponse
     */
    CompletableFuture<StopApplyScheduledPlanResponse> stopApplyScheduledPlan(StopApplyScheduledPlanRequest request);

    /**
     * @param request the request parameters of StopJob  StopJobRequest
     * @return StopJobResponse
     */
    CompletableFuture<StopJobResponse> stopJob(StopJobRequest request);

    /**
     * @param request the request parameters of StopSessionCluster  StopSessionClusterRequest
     * @return StopSessionClusterResponse
     */
    CompletableFuture<StopSessionClusterResponse> stopSessionCluster(StopSessionClusterRequest request);

    /**
     * @param request the request parameters of UpdateDeployment  UpdateDeploymentRequest
     * @return UpdateDeploymentResponse
     */
    CompletableFuture<UpdateDeploymentResponse> updateDeployment(UpdateDeploymentRequest request);

    /**
     * @param request the request parameters of UpdateDeploymentDraft  UpdateDeploymentDraftRequest
     * @return UpdateDeploymentDraftResponse
     */
    CompletableFuture<UpdateDeploymentDraftResponse> updateDeploymentDraft(UpdateDeploymentDraftRequest request);

    /**
     * @param request the request parameters of UpdateDeploymentTarget  UpdateDeploymentTargetRequest
     * @return UpdateDeploymentTargetResponse
     */
    CompletableFuture<UpdateDeploymentTargetResponse> updateDeploymentTarget(UpdateDeploymentTargetRequest request);

    /**
     * @param request the request parameters of UpdateFolder  UpdateFolderRequest
     * @return UpdateFolderResponse
     */
    CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request);

    /**
     * @param request the request parameters of UpdateMember  UpdateMemberRequest
     * @return UpdateMemberResponse
     */
    CompletableFuture<UpdateMemberResponse> updateMember(UpdateMemberRequest request);

    /**
     * @param request the request parameters of UpdateScheduledPlan  UpdateScheduledPlanRequest
     * @return UpdateScheduledPlanResponse
     */
    CompletableFuture<UpdateScheduledPlanResponse> updateScheduledPlan(UpdateScheduledPlanRequest request);

    /**
     * @param request the request parameters of UpdateSessionCluster  UpdateSessionClusterRequest
     * @return UpdateSessionClusterResponse
     */
    CompletableFuture<UpdateSessionClusterResponse> updateSessionCluster(UpdateSessionClusterRequest request);

    /**
     * @param request the request parameters of UpdateUdfArtifact  UpdateUdfArtifactRequest
     * @return UpdateUdfArtifactResponse
     */
    CompletableFuture<UpdateUdfArtifactResponse> updateUdfArtifact(UpdateUdfArtifactRequest request);

    /**
     * @param request the request parameters of UpdateVariable  UpdateVariableRequest
     * @return UpdateVariableResponse
     */
    CompletableFuture<UpdateVariableResponse> updateVariable(UpdateVariableRequest request);

    /**
     * @param request the request parameters of ValidateSqlStatement  ValidateSqlStatementRequest
     * @return ValidateSqlStatementResponse
     */
    CompletableFuture<ValidateSqlStatementResponse> validateSqlStatement(ValidateSqlStatementRequest request);

}
