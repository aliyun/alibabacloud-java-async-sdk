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
     * @param request the request parameters of CreateKyuubiToken  CreateKyuubiTokenRequest
     * @return CreateKyuubiTokenResponse
     */
    @Override
    public CompletableFuture<CreateKyuubiTokenResponse> createKyuubiToken(CreateKyuubiTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateKyuubiToken").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces/{workspaceId}/kyuubiService/{kyuubiServiceId}/token").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKyuubiTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKyuubiTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLivyCompute  CreateLivyComputeRequest
     * @return CreateLivyComputeResponse
     */
    @Override
    public CompletableFuture<CreateLivyComputeResponse> createLivyCompute(CreateLivyComputeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLivyCompute").setMethod(HttpMethod.PUT).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLivyComputeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLivyComputeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateLivyComputeToken  CreateLivyComputeTokenRequest
     * @return CreateLivyComputeTokenResponse
     */
    @Override
    public CompletableFuture<CreateLivyComputeTokenResponse> createLivyComputeToken(CreateLivyComputeTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateLivyComputeToken").setMethod(HttpMethod.PUT).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute/{livyComputeId}/token").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLivyComputeTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLivyComputeTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateProcessDefinitionWithSchedule  CreateProcessDefinitionWithScheduleRequest
     * @return CreateProcessDefinitionWithScheduleResponse
     */
    @Override
    public CompletableFuture<CreateProcessDefinitionWithScheduleResponse> createProcessDefinitionWithSchedule(CreateProcessDefinitionWithScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateProcessDefinitionWithSchedule").setMethod(HttpMethod.POST).setPathRegex("/dolphinscheduler/projects/{bizId}/process-definition").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProcessDefinitionWithScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProcessDefinitionWithScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSessionCluster  CreateSessionClusterRequest
     * @return CreateSessionClusterResponse
     */
    @Override
    public CompletableFuture<CreateSessionClusterResponse> createSessionCluster(CreateSessionClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSessionCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces/{workspaceId}/sessionClusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSessionClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSessionClusterResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of CreateWorkspace  CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    @Override
    public CompletableFuture<CreateWorkspaceResponse> createWorkspace(CreateWorkspaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateWorkspace").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateWorkspaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateWorkspaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteKyuubiToken  DeleteKyuubiTokenRequest
     * @return DeleteKyuubiTokenResponse
     */
    @Override
    public CompletableFuture<DeleteKyuubiTokenResponse> deleteKyuubiToken(DeleteKyuubiTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteKyuubiToken").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/workspaces/{workspaceId}/kyuubiService/{kyuubiServiceId}/token/{tokenId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteKyuubiTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteKyuubiTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLivyCompute  DeleteLivyComputeRequest
     * @return DeleteLivyComputeResponse
     */
    @Override
    public CompletableFuture<DeleteLivyComputeResponse> deleteLivyCompute(DeleteLivyComputeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLivyCompute").setMethod(HttpMethod.DELETE).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute/{livyComputeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLivyComputeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLivyComputeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLivyComputeToken  DeleteLivyComputeTokenRequest
     * @return DeleteLivyComputeTokenResponse
     */
    @Override
    public CompletableFuture<DeleteLivyComputeTokenResponse> deleteLivyComputeToken(DeleteLivyComputeTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteLivyComputeToken").setMethod(HttpMethod.DELETE).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute/{livyComputeId}/token/{tokenId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLivyComputeTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLivyComputeTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EditWorkspaceQueue  EditWorkspaceQueueRequest
     * @return EditWorkspaceQueueResponse
     */
    @Override
    public CompletableFuture<EditWorkspaceQueueResponse> editWorkspaceQueue(EditWorkspaceQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EditWorkspaceQueue").setMethod(HttpMethod.POST).setPathRegex("/api/v1/workspaces/queues/action/edit").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EditWorkspaceQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EditWorkspaceQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCuHours  GetCuHoursRequest
     * @return GetCuHoursResponse
     */
    @Override
    public CompletableFuture<GetCuHoursResponse> getCuHours(GetCuHoursRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCuHours").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/metric/cuHours/{queue}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCuHoursResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCuHoursResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDoctorApplication  GetDoctorApplicationRequest
     * @return GetDoctorApplicationResponse
     */
    @Override
    public CompletableFuture<GetDoctorApplicationResponse> getDoctorApplication(GetDoctorApplicationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDoctorApplication").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/runs/{runId}/action/getDoctorApplication").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDoctorApplicationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDoctorApplicationResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetKyuubiToken  GetKyuubiTokenRequest
     * @return GetKyuubiTokenResponse
     */
    @Override
    public CompletableFuture<GetKyuubiTokenResponse> getKyuubiToken(GetKyuubiTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetKyuubiToken").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/kyuubiService/{kyuubiServiceId}/token/{tokenId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetKyuubiTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetKyuubiTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLivyCompute  GetLivyComputeRequest
     * @return GetLivyComputeResponse
     */
    @Override
    public CompletableFuture<GetLivyComputeResponse> getLivyCompute(GetLivyComputeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLivyCompute").setMethod(HttpMethod.GET).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute/{livyComputeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLivyComputeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLivyComputeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLivyComputeToken  GetLivyComputeTokenRequest
     * @return GetLivyComputeTokenResponse
     */
    @Override
    public CompletableFuture<GetLivyComputeTokenResponse> getLivyComputeToken(GetLivyComputeTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetLivyComputeToken").setMethod(HttpMethod.GET).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute/{livyComputeId}/token/{tokenId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLivyComputeTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLivyComputeTokenResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of GetTemplate  GetTemplateRequest
     * @return GetTemplateResponse
     */
    @Override
    public CompletableFuture<GetTemplateResponse> getTemplate(GetTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetTemplate").setMethod(HttpMethod.GET).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/template").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTemplateResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListCatalogs  ListCatalogsRequest
     * @return ListCatalogsResponse
     */
    @Override
    public CompletableFuture<ListCatalogsResponse> listCatalogs(ListCatalogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCatalogs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/catalogs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCatalogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCatalogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListJobExecutors  ListJobExecutorsRequest
     * @return ListJobExecutorsResponse
     */
    @Override
    public CompletableFuture<ListJobExecutorsResponse> listJobExecutors(ListJobExecutorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListJobExecutors").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/jobRuns/{jobRunId}/executors").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListJobExecutorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListJobExecutorsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListKyuubiServices  ListKyuubiServicesRequest
     * @return ListKyuubiServicesResponse
     */
    @Override
    public CompletableFuture<ListKyuubiServicesResponse> listKyuubiServices(ListKyuubiServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListKyuubiServices").setMethod(HttpMethod.GET).setPathRegex("/api/v1/kyuubi/{workspaceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKyuubiServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKyuubiServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKyuubiSparkApplications  ListKyuubiSparkApplicationsRequest
     * @return ListKyuubiSparkApplicationsResponse
     */
    @Override
    public CompletableFuture<ListKyuubiSparkApplicationsResponse> listKyuubiSparkApplications(ListKyuubiSparkApplicationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListKyuubiSparkApplications").setMethod(HttpMethod.GET).setPathRegex("/api/v1/kyuubi/{workspaceId}/{kyuubiServiceId}/applications").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKyuubiSparkApplicationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKyuubiSparkApplicationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListKyuubiToken  ListKyuubiTokenRequest
     * @return ListKyuubiTokenResponse
     */
    @Override
    public CompletableFuture<ListKyuubiTokenResponse> listKyuubiToken(ListKyuubiTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListKyuubiToken").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/kyuubiService/{kyuubiServiceId}/token").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListKyuubiTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListKyuubiTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLivyCompute  ListLivyComputeRequest
     * @return ListLivyComputeResponse
     */
    @Override
    public CompletableFuture<ListLivyComputeResponse> listLivyCompute(ListLivyComputeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLivyCompute").setMethod(HttpMethod.GET).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLivyComputeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLivyComputeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLivyComputeToken  ListLivyComputeTokenRequest
     * @return ListLivyComputeTokenResponse
     */
    @Override
    public CompletableFuture<ListLivyComputeTokenResponse> listLivyComputeToken(ListLivyComputeTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListLivyComputeToken").setMethod(HttpMethod.GET).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute/{livyComputeId}/token").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLivyComputeTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLivyComputeTokenResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListMembers  ListMembersRequest
     * @return ListMembersResponse
     */
    @Override
    public CompletableFuture<ListMembersResponse> listMembers(ListMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMembers").setMethod(HttpMethod.GET).setPathRegex("/api/v1/auth/{workspaceId}/members").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMembersResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of ListSqlStatementContents  ListSqlStatementContentsRequest
     * @return ListSqlStatementContentsResponse
     */
    @Override
    public CompletableFuture<ListSqlStatementContentsResponse> listSqlStatementContents(ListSqlStatementContentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSqlStatementContents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/workspaces/{workspaceId}/action/listSqlStatementContents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSqlStatementContentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSqlStatementContentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTemplate  ListTemplateRequest
     * @return ListTemplateResponse
     */
    @Override
    public CompletableFuture<ListTemplateResponse> listTemplate(ListTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTemplate").setMethod(HttpMethod.GET).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/template/listing").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTemplateResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of RefreshLivyComputeToken  RefreshLivyComputeTokenRequest
     * @return RefreshLivyComputeTokenResponse
     */
    @Override
    public CompletableFuture<RefreshLivyComputeTokenResponse> refreshLivyComputeToken(RefreshLivyComputeTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RefreshLivyComputeToken").setMethod(HttpMethod.POST).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute/{livyComputeId}/token/{tokenId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshLivyComputeTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshLivyComputeTokenResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of StartLivyCompute  StartLivyComputeRequest
     * @return StartLivyComputeResponse
     */
    @Override
    public CompletableFuture<StartLivyComputeResponse> startLivyCompute(StartLivyComputeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartLivyCompute").setMethod(HttpMethod.POST).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute/{livyComputeId}/start").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartLivyComputeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartLivyComputeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartProcessInstance  StartProcessInstanceRequest
     * @return StartProcessInstanceResponse
     */
    @Override
    public CompletableFuture<StartProcessInstanceResponse> startProcessInstance(StartProcessInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartProcessInstance").setMethod(HttpMethod.POST).setPathRegex("/dolphinscheduler/projects/{bizId}/executors/start-process-instance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartProcessInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartProcessInstanceResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of StopLivyCompute  StopLivyComputeRequest
     * @return StopLivyComputeResponse
     */
    @Override
    public CompletableFuture<StopLivyComputeResponse> stopLivyCompute(StopLivyComputeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopLivyCompute").setMethod(HttpMethod.POST).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute/{livyComputeId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopLivyComputeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopLivyComputeResponse> future = new CompletableFuture<>();
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

    /**
     * @param request the request parameters of UpdateKyuubiToken  UpdateKyuubiTokenRequest
     * @return UpdateKyuubiTokenResponse
     */
    @Override
    public CompletableFuture<UpdateKyuubiTokenResponse> updateKyuubiToken(UpdateKyuubiTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateKyuubiToken").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/workspaces/{workspaceId}/kyuubiService/{kyuubiServiceId}/token/{tokenId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateKyuubiTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateKyuubiTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLivyCompute  UpdateLivyComputeRequest
     * @return UpdateLivyComputeResponse
     */
    @Override
    public CompletableFuture<UpdateLivyComputeResponse> updateLivyCompute(UpdateLivyComputeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateLivyCompute").setMethod(HttpMethod.POST).setPathRegex("/api/interactive/v1/workspace/{workspaceBizId}/livycompute/{livyComputeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLivyComputeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLivyComputeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProcessDefinitionWithSchedule  UpdateProcessDefinitionWithScheduleRequest
     * @return UpdateProcessDefinitionWithScheduleResponse
     */
    @Override
    public CompletableFuture<UpdateProcessDefinitionWithScheduleResponse> updateProcessDefinitionWithSchedule(UpdateProcessDefinitionWithScheduleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateProcessDefinitionWithSchedule").setMethod(HttpMethod.PUT).setPathRegex("/dolphinscheduler/projects/{bizId}/process-definition/{code}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProcessDefinitionWithScheduleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProcessDefinitionWithScheduleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
