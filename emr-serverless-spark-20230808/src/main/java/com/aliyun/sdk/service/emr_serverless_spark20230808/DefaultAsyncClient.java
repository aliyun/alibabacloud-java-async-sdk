// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.emr_serverless_spark20230808.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "emr-serverless-spark";
        this.version = "2023-08-08";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddMembers  AddMembersRequest
     * @return AddMembersResponse
     */
    @Override
    public CompletableFuture<AddMembersResponse> addMembers(AddMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AddMembers").setMethod(HttpMethod.POST).setPathRegex("/api/v1/auth/members").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CancelJobRun  CancelJobRunRequest
     * @return CancelJobRunResponse
     */
    @Override
    public CompletableFuture<CancelJobRunResponse> cancelJobRun(CancelJobRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelJobRun").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/workspaces/{workspaceId}/jobRuns/{jobRunId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelJobRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelJobRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSqlStatement  CreateSqlStatementRequest
     * @return CreateSqlStatementResponse
     */
    @Override
    public CompletableFuture<CreateSqlStatementResponse> createSqlStatement(CreateSqlStatementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSqlStatement").setMethod(HttpMethod.PUT).setPathRegex("/api/interactive/v1/workspace/{workspaceId}/statement").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSqlStatementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSqlStatementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJobRun  GetJobRunRequest
     * @return GetJobRunResponse
     */
    @Override
    public CompletableFuture<GetJobRunResponse> getJobRun(GetJobRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetJobRun").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/jobRuns/{jobRunId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSessionCluster  GetSessionClusterRequest
     * @return GetSessionClusterResponse
     */
    @Override
    public CompletableFuture<GetSessionClusterResponse> getSessionCluster(GetSessionClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSessionCluster").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/sessionClusters/{sessionClusterId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSessionClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSessionClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSqlStatement  GetSqlStatementRequest
     * @return GetSqlStatementResponse
     */
    @Override
    public CompletableFuture<GetSqlStatementResponse> getSqlStatement(GetSqlStatementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSqlStatement").setMethod(HttpMethod.GET).setPathRegex("/api/interactive/v1/workspace/{workspaceId}/statement/{statementId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSqlStatementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSqlStatementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GrantRoleToUsers  GrantRoleToUsersRequest
     * @return GrantRoleToUsersResponse
     */
    @Override
    public CompletableFuture<GrantRoleToUsersResponse> grantRoleToUsers(GrantRoleToUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GrantRoleToUsers").setMethod(HttpMethod.POST).setPathRegex("/api/v1/auth/roles/grant").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantRoleToUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantRoleToUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListJobRuns  ListJobRunsRequest
     * @return ListJobRunsResponse
     */
    @Override
    public CompletableFuture<ListJobRunsResponse> listJobRuns(ListJobRunsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListJobRuns").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/jobRuns").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobRunsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobRunsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLogContents  ListLogContentsRequest
     * @return ListLogContentsResponse
     */
    @Override
    public CompletableFuture<ListLogContentsResponse> listLogContents(ListLogContentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLogContents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/action/listLogContents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLogContentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLogContentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListReleaseVersions  ListReleaseVersionsRequest
     * @return ListReleaseVersionsResponse
     */
    @Override
    public CompletableFuture<ListReleaseVersionsResponse> listReleaseVersions(ListReleaseVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListReleaseVersions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/releaseVersions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListReleaseVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListReleaseVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSessionClusters  ListSessionClustersRequest
     * @return ListSessionClustersResponse
     */
    @Override
    public CompletableFuture<ListSessionClustersResponse> listSessionClusters(ListSessionClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSessionClusters").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/sessionClusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSessionClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSessionClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkspaceQueues  ListWorkspaceQueuesRequest
     * @return ListWorkspaceQueuesResponse
     */
    @Override
    public CompletableFuture<ListWorkspaceQueuesResponse> listWorkspaceQueues(ListWorkspaceQueuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkspaceQueues").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/queues").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkspaceQueuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkspaceQueuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListWorkspaces  ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    @Override
    public CompletableFuture<ListWorkspacesResponse> listWorkspaces(ListWorkspacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListWorkspaces").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListWorkspacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListWorkspacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartJobRun  StartJobRunRequest
     * @return StartJobRunResponse
     */
    @Override
    public CompletableFuture<StartJobRunResponse> startJobRun(StartJobRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartJobRun").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces/{workspaceId}/jobRuns").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartJobRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartJobRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartSessionCluster  StartSessionClusterRequest
     * @return StartSessionClusterResponse
     */
    @Override
    public CompletableFuture<StartSessionClusterResponse> startSessionCluster(StartSessionClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartSessionCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces/{workspaceId}/sessionClusters/action/startSessionCluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartSessionClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartSessionClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopSessionCluster  StopSessionClusterRequest
     * @return StopSessionClusterResponse
     */
    @Override
    public CompletableFuture<StopSessionClusterResponse> stopSessionCluster(StopSessionClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopSessionCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces/{workspaceId}/sessionClusters/action/stopSessionCluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopSessionClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopSessionClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of TerminateSqlStatement  TerminateSqlStatementRequest
     * @return TerminateSqlStatementResponse
     */
    @Override
    public CompletableFuture<TerminateSqlStatementResponse> terminateSqlStatement(TerminateSqlStatementRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("TerminateSqlStatement").setMethod(HttpMethod.POST).setPathRegex("/api/interactive/v1/workspace/{workspaceId}/statement/{statementId}/terminate").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminateSqlStatementResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminateSqlStatementResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
