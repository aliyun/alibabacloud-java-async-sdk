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

    CompletableFuture<ApplyScheduledPlanResponse> applyScheduledPlan(ApplyScheduledPlanRequest request);

    CompletableFuture<CreateDeploymentResponse> createDeployment(CreateDeploymentRequest request);

    CompletableFuture<CreateDeploymentDraftResponse> createDeploymentDraft(CreateDeploymentDraftRequest request);

    CompletableFuture<CreateDeploymentTargetResponse> createDeploymentTarget(CreateDeploymentTargetRequest request);

    CompletableFuture<CreateFolderResponse> createFolder(CreateFolderRequest request);

    CompletableFuture<CreateMemberResponse> createMember(CreateMemberRequest request);

    CompletableFuture<CreateSavepointResponse> createSavepoint(CreateSavepointRequest request);

    CompletableFuture<CreateScheduledPlanResponse> createScheduledPlan(CreateScheduledPlanRequest request);

    CompletableFuture<CreateSessionClusterResponse> createSessionCluster(CreateSessionClusterRequest request);

    CompletableFuture<CreateUdfArtifactResponse> createUdfArtifact(CreateUdfArtifactRequest request);

    CompletableFuture<CreateVariableResponse> createVariable(CreateVariableRequest request);

    CompletableFuture<DeleteCustomConnectorResponse> deleteCustomConnector(DeleteCustomConnectorRequest request);

    CompletableFuture<DeleteDeploymentResponse> deleteDeployment(DeleteDeploymentRequest request);

    CompletableFuture<DeleteDeploymentDraftResponse> deleteDeploymentDraft(DeleteDeploymentDraftRequest request);

    CompletableFuture<DeleteDeploymentTargetResponse> deleteDeploymentTarget(DeleteDeploymentTargetRequest request);

    CompletableFuture<DeleteFolderResponse> deleteFolder(DeleteFolderRequest request);

    CompletableFuture<DeleteJobResponse> deleteJob(DeleteJobRequest request);

    CompletableFuture<DeleteMemberResponse> deleteMember(DeleteMemberRequest request);

    CompletableFuture<DeleteSavepointResponse> deleteSavepoint(DeleteSavepointRequest request);

    CompletableFuture<DeleteScheduledPlanResponse> deleteScheduledPlan(DeleteScheduledPlanRequest request);

    CompletableFuture<DeleteSessionClusterResponse> deleteSessionCluster(DeleteSessionClusterRequest request);

    CompletableFuture<DeleteUdfArtifactResponse> deleteUdfArtifact(DeleteUdfArtifactRequest request);

    CompletableFuture<DeleteUdfFunctionResponse> deleteUdfFunction(DeleteUdfFunctionRequest request);

    CompletableFuture<DeleteVariableResponse> deleteVariable(DeleteVariableRequest request);

    CompletableFuture<DeployDeploymentDraftAsyncResponse> deployDeploymentDraftAsync(DeployDeploymentDraftAsyncRequest request);

    CompletableFuture<ExecuteSqlStatementResponse> executeSqlStatement(ExecuteSqlStatementRequest request);

    CompletableFuture<FlinkApiProxyResponse> flinkApiProxy(FlinkApiProxyRequest request);

    CompletableFuture<GenerateResourcePlanWithFlinkConfAsyncResponse> generateResourcePlanWithFlinkConfAsync(GenerateResourcePlanWithFlinkConfAsyncRequest request);

    CompletableFuture<GetAppliedScheduledPlanResponse> getAppliedScheduledPlan(GetAppliedScheduledPlanRequest request);

    CompletableFuture<GetCatalogsResponse> getCatalogs(GetCatalogsRequest request);

    CompletableFuture<GetDatabasesResponse> getDatabases(GetDatabasesRequest request);

    CompletableFuture<GetDeployDeploymentDraftResultResponse> getDeployDeploymentDraftResult(GetDeployDeploymentDraftResultRequest request);

    CompletableFuture<GetDeploymentResponse> getDeployment(GetDeploymentRequest request);

    CompletableFuture<GetDeploymentDraftResponse> getDeploymentDraft(GetDeploymentDraftRequest request);

    CompletableFuture<GetDeploymentDraftLockResponse> getDeploymentDraftLock(GetDeploymentDraftLockRequest request);

    CompletableFuture<GetEventsResponse> getEvents(GetEventsRequest request);

    CompletableFuture<GetFolderResponse> getFolder(GetFolderRequest request);

    CompletableFuture<GetGenerateResourcePlanResultResponse> getGenerateResourcePlanResult(GetGenerateResourcePlanResultRequest request);

    CompletableFuture<GetHotUpdateJobResultResponse> getHotUpdateJobResult(GetHotUpdateJobResultRequest request);

    CompletableFuture<GetJobResponse> getJob(GetJobRequest request);

    CompletableFuture<GetLatestJobStartLogResponse> getLatestJobStartLog(GetLatestJobStartLogRequest request);

    CompletableFuture<GetLineageInfoResponse> getLineageInfo(GetLineageInfoRequest request);

    CompletableFuture<GetMemberResponse> getMember(GetMemberRequest request);

    CompletableFuture<GetSavepointResponse> getSavepoint(GetSavepointRequest request);

    CompletableFuture<GetSessionClusterResponse> getSessionCluster(GetSessionClusterRequest request);

    CompletableFuture<GetTablesResponse> getTables(GetTablesRequest request);

    CompletableFuture<GetUdfArtifactsResponse> getUdfArtifacts(GetUdfArtifactsRequest request);

    CompletableFuture<HotUpdateJobResponse> hotUpdateJob(HotUpdateJobRequest request);

    CompletableFuture<ListCustomConnectorsResponse> listCustomConnectors(ListCustomConnectorsRequest request);

    CompletableFuture<ListDeploymentDraftsResponse> listDeploymentDrafts(ListDeploymentDraftsRequest request);

    CompletableFuture<ListDeploymentTargetsResponse> listDeploymentTargets(ListDeploymentTargetsRequest request);

    CompletableFuture<ListDeploymentsResponse> listDeployments(ListDeploymentsRequest request);

    CompletableFuture<ListEditableNamespaceResponse> listEditableNamespace(ListEditableNamespaceRequest request);

    CompletableFuture<ListEngineVersionMetadataResponse> listEngineVersionMetadata(ListEngineVersionMetadataRequest request);

    CompletableFuture<ListJobsResponse> listJobs(ListJobsRequest request);

    CompletableFuture<ListMembersResponse> listMembers(ListMembersRequest request);

    CompletableFuture<ListSavepointsResponse> listSavepoints(ListSavepointsRequest request);

    CompletableFuture<ListScheduledPlanResponse> listScheduledPlan(ListScheduledPlanRequest request);

    CompletableFuture<ListScheduledPlanExecutedHistoryResponse> listScheduledPlanExecutedHistory(ListScheduledPlanExecutedHistoryRequest request);

    CompletableFuture<ListSessionClustersResponse> listSessionClusters(ListSessionClustersRequest request);

    CompletableFuture<ListVariablesResponse> listVariables(ListVariablesRequest request);

    CompletableFuture<RegisterCustomConnectorResponse> registerCustomConnector(RegisterCustomConnectorRequest request);

    CompletableFuture<RegisterUdfFunctionResponse> registerUdfFunction(RegisterUdfFunctionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<StartJobResponse> startJob(StartJobRequest request);

    CompletableFuture<StartJobWithParamsResponse> startJobWithParams(StartJobWithParamsRequest request);

    CompletableFuture<StartSessionClusterResponse> startSessionCluster(StartSessionClusterRequest request);

    CompletableFuture<StopApplyScheduledPlanResponse> stopApplyScheduledPlan(StopApplyScheduledPlanRequest request);

    CompletableFuture<StopJobResponse> stopJob(StopJobRequest request);

    CompletableFuture<StopSessionClusterResponse> stopSessionCluster(StopSessionClusterRequest request);

    CompletableFuture<UpdateDeploymentResponse> updateDeployment(UpdateDeploymentRequest request);

    CompletableFuture<UpdateDeploymentDraftResponse> updateDeploymentDraft(UpdateDeploymentDraftRequest request);

    CompletableFuture<UpdateDeploymentTargetResponse> updateDeploymentTarget(UpdateDeploymentTargetRequest request);

    CompletableFuture<UpdateFolderResponse> updateFolder(UpdateFolderRequest request);

    CompletableFuture<UpdateMemberResponse> updateMember(UpdateMemberRequest request);

    CompletableFuture<UpdateScheduledPlanResponse> updateScheduledPlan(UpdateScheduledPlanRequest request);

    CompletableFuture<UpdateSessionClusterResponse> updateSessionCluster(UpdateSessionClusterRequest request);

    CompletableFuture<UpdateUdfArtifactResponse> updateUdfArtifact(UpdateUdfArtifactRequest request);

    CompletableFuture<ValidateSqlStatementResponse> validateSqlStatement(ValidateSqlStatementRequest request);

}
