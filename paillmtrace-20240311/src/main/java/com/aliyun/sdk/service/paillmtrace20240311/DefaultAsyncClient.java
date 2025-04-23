// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.paillmtrace20240311.models.*;
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
        this.product = "PaiLLMTrace";
        this.version = "2024-03-11";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of CreateOnlineEvalTask  CreateOnlineEvalTaskRequest
     * @return CreateOnlineEvalTaskResponse
     */
    @Override
    public CompletableFuture<CreateOnlineEvalTaskResponse> createOnlineEvalTask(CreateOnlineEvalTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateOnlineEvalTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/PAILLMTrace/onlineevaltasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateOnlineEvalTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateOnlineEvalTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceIdentityRole  CreateServiceIdentityRoleRequest
     * @return CreateServiceIdentityRoleResponse
     */
    @Override
    public CompletableFuture<CreateServiceIdentityRoleResponse> createServiceIdentityRole(CreateServiceIdentityRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateServiceIdentityRole").setMethod(HttpMethod.POST).setPathRegex("/api/v1/PAILLMTrace/ServiceIdentityRole").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceIdentityRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceIdentityRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteOnlineEvalTask  DeleteOnlineEvalTaskRequest
     * @return DeleteOnlineEvalTaskResponse
     */
    @Override
    public CompletableFuture<DeleteOnlineEvalTaskResponse> deleteOnlineEvalTask(DeleteOnlineEvalTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteOnlineEvalTask").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/PAILLMTrace/onlineevaltasks/{TaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteOnlineEvalTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteOnlineEvalTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EvaluateTrace  EvaluateTraceRequest
     * @return EvaluateTraceResponse
     */
    @Override
    public CompletableFuture<EvaluateTraceResponse> evaluateTrace(EvaluateTraceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("EvaluateTrace").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/PAILLMTrace/eval/trace/{TraceId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EvaluateTraceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EvaluateTraceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEvaluationTemplates  GetEvaluationTemplatesRequest
     * @return GetEvaluationTemplatesResponse
     */
    @Override
    public CompletableFuture<GetEvaluationTemplatesResponse> getEvaluationTemplates(GetEvaluationTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetEvaluationTemplates").setMethod(HttpMethod.GET).setPathRegex("/api/v1/PAILLMTrace/eval/templates").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetEvaluationTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetEvaluationTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetOnlineEvalTask  GetOnlineEvalTaskRequest
     * @return GetOnlineEvalTaskResponse
     */
    @Override
    public CompletableFuture<GetOnlineEvalTaskResponse> getOnlineEvalTask(GetOnlineEvalTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetOnlineEvalTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/PAILLMTrace/onlineevaltasks/{TaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetOnlineEvalTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetOnlineEvalTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetServiceIdentityRole  GetServiceIdentityRoleRequest
     * @return GetServiceIdentityRoleResponse
     */
    @Override
    public CompletableFuture<GetServiceIdentityRoleResponse> getServiceIdentityRole(GetServiceIdentityRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceIdentityRole").setMethod(HttpMethod.GET).setPathRegex("/api/v1/PAILLMTrace/ServiceIdentityRole").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceIdentityRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceIdentityRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetXtraceToken  GetXtraceTokenRequest
     * @return GetXtraceTokenResponse
     */
    @Override
    public CompletableFuture<GetXtraceTokenResponse> getXtraceToken(GetXtraceTokenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetXtraceToken").setMethod(HttpMethod.GET).setPathRegex("/api/v1/PAILLMTrace/XtraceToken").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetXtraceTokenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetXtraceTokenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOnlineEvalTaskResults  ListOnlineEvalTaskResultsRequest
     * @return ListOnlineEvalTaskResultsResponse
     */
    @Override
    public CompletableFuture<ListOnlineEvalTaskResultsResponse> listOnlineEvalTaskResults(ListOnlineEvalTaskResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOnlineEvalTaskResults").setMethod(HttpMethod.GET).setPathRegex("/api/v1/PAILLMTrace/onlineevaltaskresults").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOnlineEvalTaskResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOnlineEvalTaskResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListOnlineEvalTasks  ListOnlineEvalTasksRequest
     * @return ListOnlineEvalTasksResponse
     */
    @Override
    public CompletableFuture<ListOnlineEvalTasksResponse> listOnlineEvalTasks(ListOnlineEvalTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListOnlineEvalTasks").setMethod(HttpMethod.GET).setPathRegex("/api/v1/PAILLMTrace/onlineevaltasks").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListOnlineEvalTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListOnlineEvalTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTracesDatas  ListTracesDatasRequest
     * @return ListTracesDatasResponse
     */
    @Override
    public CompletableFuture<ListTracesDatasResponse> listTracesDatas(ListTracesDatasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListTracesDatas").setMethod(HttpMethod.GET).setPathRegex("/api/v1/PAILLMTrace/TracesDatas").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTracesDatasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTracesDatasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopOnlineEvalTask  StopOnlineEvalTaskRequest
     * @return StopOnlineEvalTaskResponse
     */
    @Override
    public CompletableFuture<StopOnlineEvalTaskResponse> stopOnlineEvalTask(StopOnlineEvalTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StopOnlineEvalTask").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/PAILLMTrace/onlineevaltasks/{TaskId}/stop").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopOnlineEvalTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopOnlineEvalTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateOnlineEvalTask  UpdateOnlineEvalTaskRequest
     * @return UpdateOnlineEvalTaskResponse
     */
    @Override
    public CompletableFuture<UpdateOnlineEvalTaskResponse> updateOnlineEvalTask(UpdateOnlineEvalTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateOnlineEvalTask").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/PAILLMTrace/onlineevaltasks/{TaskId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateOnlineEvalTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateOnlineEvalTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
