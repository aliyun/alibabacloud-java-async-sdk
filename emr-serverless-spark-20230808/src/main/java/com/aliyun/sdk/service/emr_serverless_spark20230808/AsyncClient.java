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
     * @param request the request parameters of CreateProcessDefinitionWithSchedule  CreateProcessDefinitionWithScheduleRequest
     * @return CreateProcessDefinitionWithScheduleResponse
     */
    CompletableFuture<CreateProcessDefinitionWithScheduleResponse> createProcessDefinitionWithSchedule(CreateProcessDefinitionWithScheduleRequest request);

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
     * @param request the request parameters of ListJobRuns  ListJobRunsRequest
     * @return ListJobRunsResponse
     */
    CompletableFuture<ListJobRunsResponse> listJobRuns(ListJobRunsRequest request);

    /**
     * @param request the request parameters of ListKyuubiSparkApplications  ListKyuubiSparkApplicationsRequest
     * @return ListKyuubiSparkApplicationsResponse
     */
    CompletableFuture<ListKyuubiSparkApplicationsResponse> listKyuubiSparkApplications(ListKyuubiSparkApplicationsRequest request);

    /**
     * @param request the request parameters of ListLogContents  ListLogContentsRequest
     * @return ListLogContentsResponse
     */
    CompletableFuture<ListLogContentsResponse> listLogContents(ListLogContentsRequest request);

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
     * @param request the request parameters of StartJobRun  StartJobRunRequest
     * @return StartJobRunResponse
     */
    CompletableFuture<StartJobRunResponse> startJobRun(StartJobRunRequest request);

    /**
     * @param request the request parameters of StartProcessInstance  StartProcessInstanceRequest
     * @return StartProcessInstanceResponse
     */
    CompletableFuture<StartProcessInstanceResponse> startProcessInstance(StartProcessInstanceRequest request);

    /**
     * @param request the request parameters of StartSessionCluster  StartSessionClusterRequest
     * @return StartSessionClusterResponse
     */
    CompletableFuture<StartSessionClusterResponse> startSessionCluster(StartSessionClusterRequest request);

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
     * @param request the request parameters of UpdateProcessDefinitionWithSchedule  UpdateProcessDefinitionWithScheduleRequest
     * @return UpdateProcessDefinitionWithScheduleResponse
     */
    CompletableFuture<UpdateProcessDefinitionWithScheduleResponse> updateProcessDefinitionWithSchedule(UpdateProcessDefinitionWithScheduleRequest request);

}
