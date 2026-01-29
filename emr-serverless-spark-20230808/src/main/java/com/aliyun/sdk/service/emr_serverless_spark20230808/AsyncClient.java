// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.emr_serverless_spark20230808.models.*;
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
     * @param request the request parameters of AddMembers  AddMembersRequest
     * @return AddMembersResponse
     */
    CompletableFuture<AddMembersResponse> addMembers(AddMembersRequest request);

    /**
     * @param request the request parameters of CancelJobRun  CancelJobRunRequest
     * @return CancelJobRunResponse
     */
    CompletableFuture<CancelJobRunResponse> cancelJobRun(CancelJobRunRequest request);

    /**
     * @param request the request parameters of CancelKyuubiSparkApplication  CancelKyuubiSparkApplicationRequest
     * @return CancelKyuubiSparkApplicationResponse
     */
    CompletableFuture<CancelKyuubiSparkApplicationResponse> cancelKyuubiSparkApplication(CancelKyuubiSparkApplicationRequest request);

    /**
     * @param request the request parameters of CreateKyuubiService  CreateKyuubiServiceRequest
     * @return CreateKyuubiServiceResponse
     */
    CompletableFuture<CreateKyuubiServiceResponse> createKyuubiService(CreateKyuubiServiceRequest request);

    /**
     * @param request the request parameters of CreateKyuubiToken  CreateKyuubiTokenRequest
     * @return CreateKyuubiTokenResponse
     */
    CompletableFuture<CreateKyuubiTokenResponse> createKyuubiToken(CreateKyuubiTokenRequest request);

    /**
     * @param request the request parameters of CreateLivyCompute  CreateLivyComputeRequest
     * @return CreateLivyComputeResponse
     */
    CompletableFuture<CreateLivyComputeResponse> createLivyCompute(CreateLivyComputeRequest request);

    /**
     * @param request the request parameters of CreateLivyComputeToken  CreateLivyComputeTokenRequest
     * @return CreateLivyComputeTokenResponse
     */
    CompletableFuture<CreateLivyComputeTokenResponse> createLivyComputeToken(CreateLivyComputeTokenRequest request);

    /**
     * @param request the request parameters of CreateProcessDefinitionWithSchedule  CreateProcessDefinitionWithScheduleRequest
     * @return CreateProcessDefinitionWithScheduleResponse
     */
    CompletableFuture<CreateProcessDefinitionWithScheduleResponse> createProcessDefinitionWithSchedule(CreateProcessDefinitionWithScheduleRequest request);

    /**
     * @param request the request parameters of CreateRayCluster  CreateRayClusterRequest
     * @return CreateRayClusterResponse
     */
    CompletableFuture<CreateRayClusterResponse> createRayCluster(CreateRayClusterRequest request);

    /**
     * @param request the request parameters of CreateSessionCluster  CreateSessionClusterRequest
     * @return CreateSessionClusterResponse
     */
    CompletableFuture<CreateSessionClusterResponse> createSessionCluster(CreateSessionClusterRequest request);

    /**
     * @param request the request parameters of CreateSqlStatement  CreateSqlStatementRequest
     * @return CreateSqlStatementResponse
     */
    CompletableFuture<CreateSqlStatementResponse> createSqlStatement(CreateSqlStatementRequest request);

    /**
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request);

    /**
     * @param request the request parameters of DeleteKyuubiService  DeleteKyuubiServiceRequest
     * @return DeleteKyuubiServiceResponse
     */
    CompletableFuture<DeleteKyuubiServiceResponse> deleteKyuubiService(DeleteKyuubiServiceRequest request);

    /**
     * @param request the request parameters of DeleteKyuubiToken  DeleteKyuubiTokenRequest
     * @return DeleteKyuubiTokenResponse
     */
    CompletableFuture<DeleteKyuubiTokenResponse> deleteKyuubiToken(DeleteKyuubiTokenRequest request);

    /**
     * @param request the request parameters of DeleteLivyCompute  DeleteLivyComputeRequest
     * @return DeleteLivyComputeResponse
     */
    CompletableFuture<DeleteLivyComputeResponse> deleteLivyCompute(DeleteLivyComputeRequest request);

    /**
     * @param request the request parameters of DeleteLivyComputeToken  DeleteLivyComputeTokenRequest
     * @return DeleteLivyComputeTokenResponse
     */
    CompletableFuture<DeleteLivyComputeTokenResponse> deleteLivyComputeToken(DeleteLivyComputeTokenRequest request);

    /**
     * @param request the request parameters of DeleteRayCluster  DeleteRayClusterRequest
     * @return DeleteRayClusterResponse
     */
    CompletableFuture<DeleteRayClusterResponse> deleteRayCluster(DeleteRayClusterRequest request);

    /**
     * @param request the request parameters of EditWorkspaceQueue  EditWorkspaceQueueRequest
     * @return EditWorkspaceQueueResponse
     */
    CompletableFuture<EditWorkspaceQueueResponse> editWorkspaceQueue(EditWorkspaceQueueRequest request);

    /**
     * @param request the request parameters of GenerateTaskCodes  GenerateTaskCodesRequest
     * @return GenerateTaskCodesResponse
     */
    CompletableFuture<GenerateTaskCodesResponse> generateTaskCodes(GenerateTaskCodesRequest request);

    /**
     * @param request the request parameters of GetCuHours  GetCuHoursRequest
     * @return GetCuHoursResponse
     */
    CompletableFuture<GetCuHoursResponse> getCuHours(GetCuHoursRequest request);

    /**
     * @param request the request parameters of GetDoctorApplication  GetDoctorApplicationRequest
     * @return GetDoctorApplicationResponse
     */
    CompletableFuture<GetDoctorApplicationResponse> getDoctorApplication(GetDoctorApplicationRequest request);

    /**
     * @param request the request parameters of GetJobRun  GetJobRunRequest
     * @return GetJobRunResponse
     */
    CompletableFuture<GetJobRunResponse> getJobRun(GetJobRunRequest request);

    /**
     * @param request the request parameters of GetKyuubiService  GetKyuubiServiceRequest
     * @return GetKyuubiServiceResponse
     */
    CompletableFuture<GetKyuubiServiceResponse> getKyuubiService(GetKyuubiServiceRequest request);

    /**
     * @param request the request parameters of GetKyuubiToken  GetKyuubiTokenRequest
     * @return GetKyuubiTokenResponse
     */
    CompletableFuture<GetKyuubiTokenResponse> getKyuubiToken(GetKyuubiTokenRequest request);

    /**
     * @param request the request parameters of GetLivyCompute  GetLivyComputeRequest
     * @return GetLivyComputeResponse
     */
    CompletableFuture<GetLivyComputeResponse> getLivyCompute(GetLivyComputeRequest request);

    /**
     * @param request the request parameters of GetLivyComputeToken  GetLivyComputeTokenRequest
     * @return GetLivyComputeTokenResponse
     */
    CompletableFuture<GetLivyComputeTokenResponse> getLivyComputeToken(GetLivyComputeTokenRequest request);

    /**
     * @param request the request parameters of GetRayCluster  GetRayClusterRequest
     * @return GetRayClusterResponse
     */
    CompletableFuture<GetRayClusterResponse> getRayCluster(GetRayClusterRequest request);

    /**
     * @param request the request parameters of GetRunConfiguration  GetRunConfigurationRequest
     * @return GetRunConfigurationResponse
     */
    CompletableFuture<GetRunConfigurationResponse> getRunConfiguration(GetRunConfigurationRequest request);

    /**
     * @param request the request parameters of GetSessionCluster  GetSessionClusterRequest
     * @return GetSessionClusterResponse
     */
    CompletableFuture<GetSessionClusterResponse> getSessionCluster(GetSessionClusterRequest request);

    /**
     * @param request the request parameters of GetSqlStatement  GetSqlStatementRequest
     * @return GetSqlStatementResponse
     */
    CompletableFuture<GetSqlStatementResponse> getSqlStatement(GetSqlStatementRequest request);

    /**
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request);

    /**
     * @param request the request parameters of GrantRoleToUsers  GrantRoleToUsersRequest
     * @return GrantRoleToUsersResponse
     */
    CompletableFuture<GrantRoleToUsersResponse> grantRoleToUsers(GrantRoleToUsersRequest request);

    /**
     * @param request the request parameters of ListCatalogs  ListCatalogsRequest
     * @return ListCatalogsResponse
     */
    CompletableFuture<ListCatalogsResponse> listCatalogs(ListCatalogsRequest request);

    /**
     * @param request the request parameters of ListJobExecutors  ListJobExecutorsRequest
     * @return ListJobExecutorsResponse
     */
    CompletableFuture<ListJobExecutorsResponse> listJobExecutors(ListJobExecutorsRequest request);

    /**
     * @param request the request parameters of ListJobRuns  ListJobRunsRequest
     * @return ListJobRunsResponse
     */
    CompletableFuture<ListJobRunsResponse> listJobRuns(ListJobRunsRequest request);

    /**
     * @param request the request parameters of ListKyuubiServices  ListKyuubiServicesRequest
     * @return ListKyuubiServicesResponse
     */
    CompletableFuture<ListKyuubiServicesResponse> listKyuubiServices(ListKyuubiServicesRequest request);

    /**
     * @param request the request parameters of ListKyuubiSparkApplications  ListKyuubiSparkApplicationsRequest
     * @return ListKyuubiSparkApplicationsResponse
     */
    CompletableFuture<ListKyuubiSparkApplicationsResponse> listKyuubiSparkApplications(ListKyuubiSparkApplicationsRequest request);

    /**
     * @param request the request parameters of ListKyuubiToken  ListKyuubiTokenRequest
     * @return ListKyuubiTokenResponse
     */
    CompletableFuture<ListKyuubiTokenResponse> listKyuubiToken(ListKyuubiTokenRequest request);

    /**
     * @param request the request parameters of ListLivyCompute  ListLivyComputeRequest
     * @return ListLivyComputeResponse
     */
    CompletableFuture<ListLivyComputeResponse> listLivyCompute(ListLivyComputeRequest request);

    /**
     * @param request the request parameters of ListLivyComputeSessions  ListLivyComputeSessionsRequest
     * @return ListLivyComputeSessionsResponse
     */
    CompletableFuture<ListLivyComputeSessionsResponse> listLivyComputeSessions(ListLivyComputeSessionsRequest request);

    /**
     * @param request the request parameters of ListLivyComputeToken  ListLivyComputeTokenRequest
     * @return ListLivyComputeTokenResponse
     */
    CompletableFuture<ListLivyComputeTokenResponse> listLivyComputeToken(ListLivyComputeTokenRequest request);

    /**
     * @param request the request parameters of ListLogContents  ListLogContentsRequest
     * @return ListLogContentsResponse
     */
    CompletableFuture<ListLogContentsResponse> listLogContents(ListLogContentsRequest request);

    /**
     * @param request the request parameters of ListMembers  ListMembersRequest
     * @return ListMembersResponse
     */
    CompletableFuture<ListMembersResponse> listMembers(ListMembersRequest request);

    /**
     * @param request the request parameters of ListRayCluster  ListRayClusterRequest
     * @return ListRayClusterResponse
     */
    CompletableFuture<ListRayClusterResponse> listRayCluster(ListRayClusterRequest request);

    /**
     * @param request the request parameters of ListReleaseVersions  ListReleaseVersionsRequest
     * @return ListReleaseVersionsResponse
     */
    CompletableFuture<ListReleaseVersionsResponse> listReleaseVersions(ListReleaseVersionsRequest request);

    /**
     * @param request the request parameters of ListSessionClusters  ListSessionClustersRequest
     * @return ListSessionClustersResponse
     */
    CompletableFuture<ListSessionClustersResponse> listSessionClusters(ListSessionClustersRequest request);

    /**
     * @param request the request parameters of ListSqlStatementContents  ListSqlStatementContentsRequest
     * @return ListSqlStatementContentsResponse
     */
    CompletableFuture<ListSqlStatementContentsResponse> listSqlStatementContents(ListSqlStatementContentsRequest request);

    /**
     * @param request the request parameters of ListTemplate  ListTemplateRequest
     * @return ListTemplateResponse
     */
    CompletableFuture<ListTemplateResponse> listTemplate(ListTemplateRequest request);

    /**
     * @param request the request parameters of ListWorkspaceQueues  ListWorkspaceQueuesRequest
     * @return ListWorkspaceQueuesResponse
     */
    CompletableFuture<ListWorkspaceQueuesResponse> listWorkspaceQueues(ListWorkspaceQueuesRequest request);

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request);

    /**
     * @param request the request parameters of RefreshLivyComputeToken  RefreshLivyComputeTokenRequest
     * @return RefreshLivyComputeTokenResponse
     */
    CompletableFuture<RefreshLivyComputeTokenResponse> refreshLivyComputeToken(RefreshLivyComputeTokenRequest request);

    /**
     * @param request the request parameters of StartJobRun  StartJobRunRequest
     * @return StartJobRunResponse
     */
    CompletableFuture<StartJobRunResponse> startJobRun(StartJobRunRequest request);

    /**
     * @param request the request parameters of StartKyuubiService  StartKyuubiServiceRequest
     * @return StartKyuubiServiceResponse
     */
    CompletableFuture<StartKyuubiServiceResponse> startKyuubiService(StartKyuubiServiceRequest request);

    /**
     * @param request the request parameters of StartLivyCompute  StartLivyComputeRequest
     * @return StartLivyComputeResponse
     */
    CompletableFuture<StartLivyComputeResponse> startLivyCompute(StartLivyComputeRequest request);

    /**
     * @param request the request parameters of StartProcessInstance  StartProcessInstanceRequest
     * @return StartProcessInstanceResponse
     */
    CompletableFuture<StartProcessInstanceResponse> startProcessInstance(StartProcessInstanceRequest request);

    /**
     * @param request the request parameters of StartRayCluster  StartRayClusterRequest
     * @return StartRayClusterResponse
     */
    CompletableFuture<StartRayClusterResponse> startRayCluster(StartRayClusterRequest request);

    /**
     * @param request the request parameters of StartSessionCluster  StartSessionClusterRequest
     * @return StartSessionClusterResponse
     */
    CompletableFuture<StartSessionClusterResponse> startSessionCluster(StartSessionClusterRequest request);

    /**
     * @param request the request parameters of StopKyuubiService  StopKyuubiServiceRequest
     * @return StopKyuubiServiceResponse
     */
    CompletableFuture<StopKyuubiServiceResponse> stopKyuubiService(StopKyuubiServiceRequest request);

    /**
     * @param request the request parameters of StopLivyCompute  StopLivyComputeRequest
     * @return StopLivyComputeResponse
     */
    CompletableFuture<StopLivyComputeResponse> stopLivyCompute(StopLivyComputeRequest request);

    /**
     * @param request the request parameters of StopRayCluster  StopRayClusterRequest
     * @return StopRayClusterResponse
     */
    CompletableFuture<StopRayClusterResponse> stopRayCluster(StopRayClusterRequest request);

    /**
     * @param request the request parameters of StopSessionCluster  StopSessionClusterRequest
     * @return StopSessionClusterResponse
     */
    CompletableFuture<StopSessionClusterResponse> stopSessionCluster(StopSessionClusterRequest request);

    /**
     * @param request the request parameters of TerminateSqlStatement  TerminateSqlStatementRequest
     * @return TerminateSqlStatementResponse
     */
    CompletableFuture<TerminateSqlStatementResponse> terminateSqlStatement(TerminateSqlStatementRequest request);

    /**
     * @param request the request parameters of UpdateKyuubiService  UpdateKyuubiServiceRequest
     * @return UpdateKyuubiServiceResponse
     */
    CompletableFuture<UpdateKyuubiServiceResponse> updateKyuubiService(UpdateKyuubiServiceRequest request);

    /**
     * @param request the request parameters of UpdateKyuubiToken  UpdateKyuubiTokenRequest
     * @return UpdateKyuubiTokenResponse
     */
    CompletableFuture<UpdateKyuubiTokenResponse> updateKyuubiToken(UpdateKyuubiTokenRequest request);

    /**
     * @param request the request parameters of UpdateLivyCompute  UpdateLivyComputeRequest
     * @return UpdateLivyComputeResponse
     */
    CompletableFuture<UpdateLivyComputeResponse> updateLivyCompute(UpdateLivyComputeRequest request);

    /**
     * @param request the request parameters of UpdateProcessDefinitionWithSchedule  UpdateProcessDefinitionWithScheduleRequest
     * @return UpdateProcessDefinitionWithScheduleResponse
     */
    CompletableFuture<UpdateProcessDefinitionWithScheduleResponse> updateProcessDefinitionWithSchedule(UpdateProcessDefinitionWithScheduleRequest request);

    /**
     * @param request the request parameters of UpdateRayCluster  UpdateRayClusterRequest
     * @return UpdateRayClusterResponse
     */
    CompletableFuture<UpdateRayClusterResponse> updateRayCluster(UpdateRayClusterRequest request);

}
