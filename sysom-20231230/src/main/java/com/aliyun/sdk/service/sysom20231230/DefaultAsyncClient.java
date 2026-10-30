// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.sysom20231230.models.*;
import darabonba.core.sse.SSEHttpResponseHandler;
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
        this.product = "SysOM";
        this.version = "2023-12-30";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: The diagnostics feature requires a service-linked role to be created under the Resource Access Management (RAM) user. Invoking this operation automatically checks whether the service-linked role exists and creates it if it does not. The RAM user that invokes this operation must have the ram:CreateServiceLinkedRole permission.</notice>
     * Note the following when you invoke this operation to authorize SysOM to diagnose ECS instances:</p>
     * </blockquote>
     * <ul>
     * <li>Each authorization is valid for 7 days. After 7 days, the authorization expires and you must invoke this operation again to re-authorize.</li>
     * <li>If the SysOM service-linked role (AliyunServiceRoleForSysom) does not exist when you invoke this operation, automatic creation is performed. The Resource Access Management (RAM) user that invokes this operation must have the <code>ram:CreateServiceLinkedRole</code> permission.</li>
     * <li>When you invoke this operation to authorize diagnostics on a specific instance, the label <code>sysom:diagnosis</code> is automatically associated with the target ECS instance. SysOM only allows diagnostics on instances that have this label.</li>
     * </ul>
     * 
     * @param request the request parameters of AuthDiagnosis  AuthDiagnosisRequest
     * @return AuthDiagnosisResponse
     */
    @Override
    public CompletableFuture<AuthDiagnosisResponse> authDiagnosis(AuthDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AuthDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/diagnosis/auth").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The instance list retrieved by this operation contains only machines managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of CheckAgentConfigSupported  CheckAgentConfigSupportedRequest
     * @return CheckAgentConfigSupportedResponse
     */
    @Override
    public CompletableFuture<CheckAgentConfigSupportedResponse> checkAgentConfigSupported(CheckAgentConfigSupportedRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckAgentConfigSupported").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/checkAgentConfigSupported").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckAgentConfigSupportedResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckAgentConfigSupportedResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this operation contains only instances that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of CheckInstanceSupport  CheckInstanceSupportRequest
     * @return CheckInstanceSupportResponse
     */
    @Override
    public CompletableFuture<CheckInstanceSupportResponse> checkInstanceSupport(CheckInstanceSupportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CheckInstanceSupport").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/supportInstanceList/checkInstanceSupport").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckInstanceSupportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckInstanceSupportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CpuHighAgentStreamResponse  CpuHighAgentStreamResponseRequest
     * @return CpuHighAgentStreamResponseResponse
     */
    @Override
    public CompletableFuture<CpuHighAgentStreamResponseResponse> cpuHighAgentStreamResponse(CpuHighAgentStreamResponseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CpuHighAgentStreamResponse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/highCpuAgent/streamResponse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CpuHighAgentStreamResponseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CpuHighAgentStreamResponseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> cpuHighAgentStreamResponseWithAsyncResponseHandler(CpuHighAgentStreamResponseRequest request, AsyncResponseHandler<CpuHighAgentStreamResponseResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CpuHighAgentStreamResponse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/highCpuAgent/streamResponse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(CpuHighAgentStreamResponseResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((CpuHighAgentStreamResponseResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<CpuHighAgentStreamResponseResponseBody> cpuHighAgentStreamResponseWithResponseIterable(CpuHighAgentStreamResponseRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("CpuHighAgentStreamResponse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/highCpuAgent/streamResponse").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        CpuHighAgentStreamResponseResponseBodyIterator iterator = CpuHighAgentStreamResponseResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of CreateAgentConfig  CreateAgentConfigRequest
     * @return CreateAgentConfigResponse
     */
    @Override
    public CompletableFuture<CreateAgentConfigResponse> createAgentConfig(CreateAgentConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentConfig").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/createAgentConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAlertDestination  CreateAlertDestinationRequest
     * @return CreateAlertDestinationResponse
     */
    @Override
    public CompletableFuture<CreateAlertDestinationResponse> createAlertDestination(CreateAlertDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAlertDestination").setMethod(HttpMethod.POST).setPathRegex("/api/v1/alertPusher/alert/createDestination").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAlertDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAlertDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateAlertStrategy  CreateAlertStrategyRequest
     * @return CreateAlertStrategyResponse
     */
    @Override
    public CompletableFuture<CreateAlertStrategyResponse> createAlertStrategy(CreateAlertStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAlertStrategy").setMethod(HttpMethod.POST).setPathRegex("/api/v1/alertPusher/alert/createStrategy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAlertStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAlertStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Use this operation together with the call_sseapi operation in the aliyun-tea-openapi-inner package.</li>
     * <li>Populate the parameters based on the input parameters of the general LLM service, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned string to a dictionary before use. Refer to the response format of the general LLM service.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateClusterVpcEndpointConnection  CreateClusterVpcEndpointConnectionRequest
     * @return CreateClusterVpcEndpointConnectionResponse
     */
    @Override
    public CompletableFuture<CreateClusterVpcEndpointConnectionResponse> createClusterVpcEndpointConnection(CreateClusterVpcEndpointConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateClusterVpcEndpointConnection").setMethod(HttpMethod.POST).setPathRegex("/api/v1/k8sProxy/access/createClusterVpcEndpointConnection").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateClusterVpcEndpointConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateClusterVpcEndpointConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>本接口仅创建会话，不发送消息，也不触发 Agent 执行。</li>
     * <li>创建成功后，使用返回的 sessionId 调用 GenerateCopilotStreamResponse 发送消息。</li>
     * <li>会话 ID 由服务端生成，不支持调用方指定。</li>
     * <li>每次成功调用均创建一个独立会话。本接口不提供客户端幂等参数，重复调用可能创建多个会话。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCopilotSession  CreateCopilotSessionRequest
     * @return CreateCopilotSessionResponse
     */
    @Override
    public CompletableFuture<CreateCopilotSessionResponse> createCopilotSession(CreateCopilotSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCopilotSession").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/sessions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCopilotSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCopilotSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateInstanceInspection  CreateInstanceInspectionRequest
     * @return CreateInstanceInspectionResponse
     */
    @Override
    public CompletableFuture<CreateInstanceInspectionResponse> createInstanceInspection(CreateInstanceInspectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateInstanceInspection").setMethod(HttpMethod.POST).setPathRegex("/api/v1/inspection/createInstanceInspection").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceInspectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceInspectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateVmcoreDiagnosisTask  CreateVmcoreDiagnosisTaskRequest
     * @return CreateVmcoreDiagnosisTaskResponse
     */
    @Override
    public CompletableFuture<CreateVmcoreDiagnosisTaskResponse> createVmcoreDiagnosisTask(CreateVmcoreDiagnosisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateVmcoreDiagnosisTask").setMethod(HttpMethod.POST).setPathRegex("/api/v1/crashAgent/diagnosis/createDiagnosisTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVmcoreDiagnosisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVmcoreDiagnosisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAgentConfig  DeleteAgentConfigRequest
     * @return DeleteAgentConfigResponse
     */
    @Override
    public CompletableFuture<DeleteAgentConfigResponse> deleteAgentConfig(DeleteAgentConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentConfig").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/am/agent/deleteAgentConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAlertDestination  DeleteAlertDestinationRequest
     * @return DeleteAlertDestinationResponse
     */
    @Override
    public CompletableFuture<DeleteAlertDestinationResponse> deleteAlertDestination(DeleteAlertDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAlertDestination").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/alertPusher/alert/deleteDestination").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAlertDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAlertDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAlertStrategy  DeleteAlertStrategyRequest
     * @return DeleteAlertStrategyResponse
     */
    @Override
    public CompletableFuture<DeleteAlertStrategyResponse> deleteAlertStrategy(DeleteAlertStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAlertStrategy").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/alertPusher/alert/deleteStrategy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAlertStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAlertStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>仅支持删除当前用户的会话。</li>
     * <li>会话存在尚未结束的执行时，不允许删除。请先通过 GenerateCopilotStreamResponse 接口发送 action=stop，确认执行结束后再删除。</li>
     * <li>删除后，无法再通过会话查询接口获取该会话及其历史记录。</li>
     * <li>会话不存在或不属于当前用户时返回错误。重复删除同一个会话不保证成功。</li>
     * <li>删除会话不会撤销已经执行的操作，也不会删除产生该会话的定时任务。</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCopilotSession  DeleteCopilotSessionRequest
     * @return DeleteCopilotSessionResponse
     */
    @Override
    public CompletableFuture<DeleteCopilotSessionResponse> deleteCopilotSession(DeleteCopilotSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCopilotSession").setMethod(HttpMethod.DELETE).setPathRegex("/api/v1/copilot/delete-session").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCopilotSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCopilotSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of DescribeMetricList  DescribeMetricListRequest
     * @return DescribeMetricListResponse
     */
    @Override
    public CompletableFuture<DescribeMetricListResponse> describeMetricList(DescribeMetricListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DescribeMetricList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/proxy/get/describeMetricList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeMetricListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeMetricListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Populate parameters according to the standard LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned data from a string to a dict before use. Refer to the standard LLM service response format.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateCopilotResponse  GenerateCopilotResponseRequest
     * @return GenerateCopilotResponseResponse
     */
    @Override
    public CompletableFuture<GenerateCopilotResponseResponse> generateCopilotResponse(GenerateCopilotResponseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateCopilotResponse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/generate_copilot_response").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateCopilotResponseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateCopilotResponseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Use this operation together with the call_sseapi interface in the aliyun-tea-openapi-inner package.</li>
     * <li>Populate the parameters based on the standard LLM service input parameters, convert them to a string, and assign the string to llmParamString.</li>
     * <li>Convert the returned string data to a dict before use. Refer to the standard LLM service response format.</li>
     * </ul>
     * 
     * @param request the request parameters of GenerateCopilotStreamResponse  GenerateCopilotStreamResponseRequest
     * @return GenerateCopilotStreamResponseResponse
     */
    @Override
    public CompletableFuture<GenerateCopilotStreamResponseResponse> generateCopilotStreamResponse(GenerateCopilotStreamResponseRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GenerateCopilotStreamResponse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/generate_copilot_stream_response").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GenerateCopilotStreamResponseResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GenerateCopilotStreamResponseResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<GenerateCopilotStreamResponseResponseBody> generateCopilotStreamResponseWithResponseIterable(GenerateCopilotStreamResponseRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("GenerateCopilotStreamResponse").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/generate_copilot_stream_response").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        GenerateCopilotStreamResponseResponseBodyIterator iterator = GenerateCopilotStreamResponseResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of GetAIQueryResult  GetAIQueryResultRequest
     * @return GetAIQueryResultResponse
     */
    @Override
    public CompletableFuture<GetAIQueryResultResponse> getAIQueryResult(GetAIQueryResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAIQueryResult").setMethod(HttpMethod.POST).setPathRegex("/api/v1/app_observ/aiAnalysis/query_result").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAIQueryResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAIQueryResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAbnormalEventsCount  GetAbnormalEventsCountRequest
     * @return GetAbnormalEventsCountResponse
     */
    @Override
    public CompletableFuture<GetAbnormalEventsCountResponse> getAbnormalEventsCount(GetAbnormalEventsCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAbnormalEventsCount").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/abnormaly_events_count").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAbnormalEventsCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAbnormalEventsCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgent  GetAgentRequest
     * @return GetAgentResponse
     */
    @Override
    public CompletableFuture<GetAgentResponse> getAgent(GetAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgent").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/get_agent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgentConfig  GetAgentConfigRequest
     * @return GetAgentConfigResponse
     */
    @Override
    public CompletableFuture<GetAgentConfigResponse> getAgentConfig(GetAgentConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentConfig").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/getAgentConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgentTask  GetAgentTaskRequest
     * @return GetAgentTaskResponse
     */
    @Override
    public CompletableFuture<GetAgentTaskResponse> getAgentTask(GetAgentTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/get_agent_task").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The diagnostic process is asynchronous. Therefore, when you call this operation, the diagnosis may still be in progress. You can check the <code>data.status</code> field in the response to determine the status. If <code>data.status</code> is <code>Success</code>, the diagnosis is successful, and you can read the diagnostic results from <code>data.result</code>.</p>
     * 
     * @param request the request parameters of GetAifgResult  GetAifgResultRequest
     * @return GetAifgResultResponse
     */
    @Override
    public CompletableFuture<GetAifgResultResponse> getAifgResult(GetAifgResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAifgResult").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aifg/getAifgResult").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAifgResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAifgResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The diagnostic process is asynchronous. Therefore, when you call this operation, the diagnosis may still be in progress. You can check the <code>data.status</code> field in the response to determine the status. If <code>data.status</code> is <code>Success</code>, the diagnosis is successful, and you can read the diagnostic results from <code>data.result</code>.</p>
     * 
     * @param request the request parameters of GetAifgUrl  GetAifgUrlRequest
     * @return GetAifgUrlResponse
     */
    @Override
    public CompletableFuture<GetAifgUrlResponse> getAifgUrl(GetAifgUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAifgUrl").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aifg/getAifgUrl").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAifgUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAifgUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlertDestination  GetAlertDestinationRequest
     * @return GetAlertDestinationResponse
     */
    @Override
    public CompletableFuture<GetAlertDestinationResponse> getAlertDestination(GetAlertDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlertDestination").setMethod(HttpMethod.GET).setPathRegex("/api/v1/alertPusher/alert/getDestination").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlertDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlertDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAlertStrategy  GetAlertStrategyRequest
     * @return GetAlertStrategyResponse
     */
    @Override
    public CompletableFuture<GetAlertStrategyResponse> getAlertStrategy(GetAlertStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAlertStrategy").setMethod(HttpMethod.GET).setPathRegex("/api/v1/alertPusher/alert/getStrategy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAlertStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAlertStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetConfigByName  GetConfigByNameRequest
     * @return GetConfigByNameResponse
     */
    @Override
    public CompletableFuture<GetConfigByNameResponse> getConfigByName(GetConfigByNameRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetConfigByName").setMethod(HttpMethod.GET).setPathRegex("/api/v1/configManage/config/getConfigByName").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetConfigByNameResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetConfigByNameResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCopilotHistory  GetCopilotHistoryRequest
     * @return GetCopilotHistoryResponse
     */
    @Override
    public CompletableFuture<GetCopilotHistoryResponse> getCopilotHistory(GetCopilotHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCopilotHistory").setMethod(HttpMethod.POST).setPathRegex("/api/v1/copilot/get_copilot_history").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCopilotHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCopilotHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>仅支持查询当前用户的会话，一次查询一个会话。</li>
     * <li>返回会话详情及执行摘要，不返回聊天内容。查询历史消息和事件，请调用 ListCopilotSessionMessages。</li>
     * <li>会话的 status 表示是否归档。判断是否正在执行，应读取 activeTurn。</li>
     * <li>lastTurn 表示最近一次执行，不一定已经结束；执行过程中，activeTurn 和 lastTurn 可以指向同一轮执行。</li>
     * <li>会话不存在、已删除或不属于当前用户时返回错误。</li>
     * </ul>
     * 
     * @param request the request parameters of GetCopilotSession  GetCopilotSessionRequest
     * @return GetCopilotSessionResponse
     */
    @Override
    public CompletableFuture<GetCopilotSessionResponse> getCopilotSession(GetCopilotSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCopilotSession").setMethod(HttpMethod.GET).setPathRegex("/api/v1/copilot/sessions/{sessionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCopilotSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCopilotSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries published hotfixes in batches by CVE ID. You can filter the results by full kernel version.</p>
     * 
     * @param request the request parameters of GetCveHotfix  GetCveHotfixRequest
     * @return GetCveHotfixResponse
     */
    @Override
    public CompletableFuture<GetCveHotfixResponse> getCveHotfix(GetCveHotfixRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCveHotfix").setMethod(HttpMethod.POST).setPathRegex("/api/v1/hotfixManager/hotfixes/cve").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCveHotfixResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCveHotfixResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The diagnostic process is asynchronous. When you call this operation, the diagnosis may still be running. You can check the <code>data.status</code> field in the response to determine the status. When <code>data.status == Success</code>, the diagnosis is complete and you can read the diagnostic results from <code>data.result</code>.</p>
     * 
     * @param request the request parameters of GetDiagnosisResult  GetDiagnosisResultRequest
     * @return GetDiagnosisResultResponse
     */
    @Override
    public CompletableFuture<GetDiagnosisResultResponse> getDiagnosisResult(GetDiagnosisResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetDiagnosisResult").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/diagnosis/get_diagnosis_results").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDiagnosisResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDiagnosisResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you install the component for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is managed for the first time, the component is installed on all ECS instances currently in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on the instance without user intervention.</li>
     * </ol>
     * 
     * @param request the request parameters of GetGpuClusterArgsOptions  GetGpuClusterArgsOptionsRequest
     * @return GetGpuClusterArgsOptionsResponse
     */
    @Override
    public CompletableFuture<GetGpuClusterArgsOptionsResponse> getGpuClusterArgsOptions(GetGpuClusterArgsOptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGpuClusterArgsOptions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aiTopology/topology/listClusterTopologyOptions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGpuClusterArgsOptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGpuClusterArgsOptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you install the component for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is managed for the first time, the component is installed on all ECS instances currently in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on it without user intervention.</li>
     * </ol>
     * 
     * @param request the request parameters of GetGpuClusterListAlarmRecord  GetGpuClusterListAlarmRecordRequest
     * @return GetGpuClusterListAlarmRecordResponse
     */
    @Override
    public CompletableFuture<GetGpuClusterListAlarmRecordResponse> getGpuClusterListAlarmRecord(GetGpuClusterListAlarmRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGpuClusterListAlarmRecord").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aiTopology/topology/listAlarmRecord").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGpuClusterListAlarmRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGpuClusterListAlarmRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you install the component for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is initially managed, the component is installed on all ECS instances currently in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on the instance without user intervention.</li>
     * </ol>
     * 
     * @param request the request parameters of GetGpuClusterTopology  GetGpuClusterTopologyRequest
     * @return GetGpuClusterTopologyResponse
     */
    @Override
    public CompletableFuture<GetGpuClusterTopologyResponse> getGpuClusterTopology(GetGpuClusterTopologyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetGpuClusterTopology").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aiTopology/topology/clusterTopology").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetGpuClusterTopologyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetGpuClusterTopologyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHealthPercentage  GetHealthPercentageRequest
     * @return GetHealthPercentageResponse
     */
    @Override
    public CompletableFuture<GetHealthPercentageResponse> getHealthPercentage(GetHealthPercentageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHealthPercentage").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/health_percentage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHealthPercentageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHealthPercentageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHostCount  GetHostCountRequest
     * @return GetHostCountResponse
     */
    @Override
    public CompletableFuture<GetHostCountResponse> getHostCount(GetHostCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHostCount").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/host_count").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHostCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHostCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotSpotUniqList  GetHotSpotUniqListRequest
     * @return GetHotSpotUniqListResponse
     */
    @Override
    public CompletableFuture<GetHotSpotUniqListResponse> getHotSpotUniqList(GetHotSpotUniqListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotSpotUniqList").setMethod(HttpMethod.POST).setPathRegex("/api/v1/livetrace_proxy/hotspot_uniq_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotSpotUniqListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotSpotUniqListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The hotfix task process is asynchronous. When you call this operation, the task may still be running. You can check the <code>data.status</code> field in the response to determine the task status. If <code>data.status</code> is <code>Success</code>, the task succeeded, and you can obtain the task result from the <code>data.result</code> field.</p>
     * 
     * @param request the request parameters of GetHotfixTask  GetHotfixTaskRequest
     * @return GetHotfixTaskResponse
     */
    @Override
    public CompletableFuture<GetHotfixTaskResponse> getHotfixTask(GetHotfixTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotfixTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/hotfix_manager/task/get").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotfixTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotfixTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotspotAnalysis  GetHotspotAnalysisRequest
     * @return GetHotspotAnalysisResponse
     */
    @Override
    public CompletableFuture<GetHotspotAnalysisResponse> getHotspotAnalysis(GetHotspotAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotspotAnalysis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/livetrace_hotspot_analysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotspotAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotspotAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotspotCompare  GetHotspotCompareRequest
     * @return GetHotspotCompareResponse
     */
    @Override
    public CompletableFuture<GetHotspotCompareResponse> getHotspotCompare(GetHotspotCompareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotspotCompare").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/livetrace_hotspot_compare").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotspotCompareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotspotCompareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotspotInstanceList  GetHotspotInstanceListRequest
     * @return GetHotspotInstanceListResponse
     */
    @Override
    public CompletableFuture<GetHotspotInstanceListResponse> getHotspotInstanceList(GetHotspotInstanceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotspotInstanceList").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/livetrace_hotspot_instance_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotspotInstanceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotspotInstanceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotspotPidList  GetHotspotPidListRequest
     * @return GetHotspotPidListResponse
     */
    @Override
    public CompletableFuture<GetHotspotPidListResponse> getHotspotPidList(GetHotspotPidListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotspotPidList").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/livetrace_hotspot_pid_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotspotPidListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotspotPidListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHotspotTracking  GetHotspotTrackingRequest
     * @return GetHotspotTrackingResponse
     */
    @Override
    public CompletableFuture<GetHotspotTrackingResponse> getHotspotTracking(GetHotspotTrackingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetHotspotTracking").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/livetrace_hotspot_tracking").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHotspotTrackingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHotspotTrackingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInspectionReport  GetInspectionReportRequest
     * @return GetInspectionReportResponse
     */
    @Override
    public CompletableFuture<GetInspectionReportResponse> getInspectionReport(GetInspectionReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInspectionReport").setMethod(HttpMethod.GET).setPathRegex("/api/v1/inspection/getInspectionReport").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInspectionReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInspectionReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetInstantScore  GetInstantScoreRequest
     * @return GetInstantScoreResponse
     */
    @Override
    public CompletableFuture<GetInstantScoreResponse> getInstantScore(GetInstantScoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetInstantScore").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/instant/score").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstantScoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstantScoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you install components for the target ACK cluster:</p>
     * <ol>
     * <li>When the cluster is managed for the first time, the system installs components on all Elastic Compute Service (ECS) instances in the cluster. If the cluster has more than 50 nodes, only 50 nodes are installed in the first batch.</li>
     * <li>The Operating System console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the Operating System console automatically installs components without user intervention.</li>
     * </ol>
     * 
     * @param request the request parameters of GetListGpuCluster  GetListGpuClusterRequest
     * @return GetListGpuClusterResponse
     */
    @Override
    public CompletableFuture<GetListGpuClusterResponse> getListGpuCluster(GetListGpuClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetListGpuCluster").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aiTopology/topology/listCluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetListGpuClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetListGpuClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetListRecord  GetListRecordRequest
     * @return GetListRecordResponse
     */
    @Override
    public CompletableFuture<GetListRecordResponse> getListRecord(GetListRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetListRecord").setMethod(HttpMethod.GET).setPathRegex("/api/v1/app_observ/aiAnalysis/list_record").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetListRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetListRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetProblemPercentage  GetProblemPercentageRequest
     * @return GetProblemPercentageResponse
     */
    @Override
    public CompletableFuture<GetProblemPercentageResponse> getProblemPercentage(GetProblemPercentageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetProblemPercentage").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/problem_percentage").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetProblemPercentageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetProblemPercentageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetRangeScore  GetRangeScoreRequest
     * @return GetRangeScoreResponse
     */
    @Override
    public CompletableFuture<GetRangeScoreResponse> getRangeScore(GetRangeScoreRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRangeScore").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/score").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRangeScoreResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRangeScoreResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetResources  GetResourcesRequest
     * @return GetResourcesResponse
     */
    @Override
    public CompletableFuture<GetResourcesResponse> getResources(GetResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetResources").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/instant/resource").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the service configuration status.</p>
     * 
     * @param request the request parameters of GetServiceFuncStatus  GetServiceFuncStatusRequest
     * @return GetServiceFuncStatusResponse
     */
    @Override
    public CompletableFuture<GetServiceFuncStatusResponse> getServiceFuncStatus(GetServiceFuncStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetServiceFuncStatus").setMethod(HttpMethod.GET).setPathRegex("/api/v1/func-switch/get-service-func-status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetServiceFuncStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetServiceFuncStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVmcoreDiagnosisTask  GetVmcoreDiagnosisTaskRequest
     * @return GetVmcoreDiagnosisTaskResponse
     */
    @Override
    public CompletableFuture<GetVmcoreDiagnosisTaskResponse> getVmcoreDiagnosisTask(GetVmcoreDiagnosisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetVmcoreDiagnosisTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/crashAgent/diagnosis/queryTask").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVmcoreDiagnosisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVmcoreDiagnosisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Some SysOM API operations require role assumption based on the <code>AliyunServiceRoleForSysom</code> service-linked role. Before using SysOM features, invoke this operation to perform initialization and ensure that the service-linked role has been created.</p>
     * <ul>
     * <li><code>check_only</code>: If this parameter is set to True, only a check is performed to determine whether the service-linked role exists. The service-linked role is not created. If this parameter is set to False or left empty, automatic creation of the service-linked role is performed if it does not exist.<blockquote>
     * <p>Note: When you call this operation to initialize the role, you agree to the user agreement of the operating system console by default. For more information, see <a href="https://www.alibabacloud.com/help/en/alinux/product-overview/os-console-overview">Operating system console overview</a> and <a href="https://terms.aliyun.com/legal-agreement/terms/suit_bu1_ali_cloud/suit_bu1_ali_cloud202001091714_51956.html">Alibaba Cloud Service Trial Terms</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of InitialSysom  InitialSysomRequest
     * @return InitialSysomResponse
     */
    @Override
    public CompletableFuture<InitialSysomResponse> initialSysom(InitialSysomRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InitialSysom").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/initial").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitialSysomResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitialSysomResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to install an agent is asynchronous. After you call this operation, a task_id is returned. You can use this ID to call the GetAgentTask operation to query the task execution status.</p>
     * 
     * @param request the request parameters of InstallAgent  InstallAgentRequest
     * @return InstallAgentResponse
     */
    @Override
    public CompletableFuture<InstallAgentResponse> installAgent(InstallAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallAgent").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/install_agent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you install a component on the target ACK cluster:</p>
     * <ol>
     * <li>First, when the cluster is managed for the first time, the component is installed on all existing ECS instances in the cluster. If the cluster contains more than 50 nodes, only 50 instances are included in the first batch.</li>
     * <li>Then, the operating system console periodically checks the scaling status of the managed cluster. When a new ECS instance is added to the cluster, the operating system console automatically installs the component on the instance without user intervention.</li>
     * </ol>
     * 
     * @param request the request parameters of InstallAgentForCluster  InstallAgentForClusterRequest
     * @return InstallAgentForClusterResponse
     */
    @Override
    public CompletableFuture<InstallAgentForClusterResponse> installAgentForCluster(InstallAgentForClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallAgentForCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/install_agent_by_cluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallAgentForClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallAgentForClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to install an Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to check the task execution status.</p>
     * 
     * @param request the request parameters of InstallAgentWithType  InstallAgentWithTypeRequest
     * @return InstallAgentWithTypeResponse
     */
    @Override
    public CompletableFuture<InstallAgentWithTypeResponse> installAgentWithType(InstallAgentWithTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallAgentWithType").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/installAgent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallAgentWithTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallAgentWithTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to install hotfixes is asynchronous. After the operation is called, a task_id is returned. You can use this ID to call the GetHotfixTask operation to query the execution status of the task.</p>
     * 
     * @param request the request parameters of InstallHotfix  InstallHotfixRequest
     * @return InstallHotfixResponse
     */
    @Override
    public CompletableFuture<InstallHotfixResponse> installHotfix(InstallHotfixRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InstallHotfix").setMethod(HttpMethod.POST).setPathRegex("/api/v1/hotfix_manager/hotfix/install").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallHotfixResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallHotfixResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InvokeAnomalyDiagnosis  InvokeAnomalyDiagnosisRequest
     * @return InvokeAnomalyDiagnosisResponse
     */
    @Override
    public CompletableFuture<InvokeAnomalyDiagnosisResponse> invokeAnomalyDiagnosis(InvokeAnomalyDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeAnomalyDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/cluster_health/diagnosis/invoke_anomaly_diagnose").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeAnomalyDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeAnomalyDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<InvokeDiagnosisResponse> invokeDiagnosis(InvokeDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("InvokeDiagnosis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/diagnosis/invoke_diagnosis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAbnormalyEvents  ListAbnormalyEventsRequest
     * @return ListAbnormalyEventsResponse
     */
    @Override
    public CompletableFuture<ListAbnormalyEventsResponse> listAbnormalyEvents(ListAbnormalyEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAbnormalyEvents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/abnormaly_events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAbnormalyEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAbnormalyEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentInstallRecords  ListAgentInstallRecordsRequest
     * @return ListAgentInstallRecordsResponse
     */
    @Override
    public CompletableFuture<ListAgentInstallRecordsResponse> listAgentInstallRecords(ListAgentInstallRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentInstallRecords").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/list_agent_install_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentInstallRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentInstallRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgents  ListAgentsRequest
     * @return ListAgentsResponse
     */
    @Override
    public CompletableFuture<ListAgentsResponse> listAgents(ListAgentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgents").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/list_agents").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation retrieves the list of regions where the current user has machines managed by SysOM. If a user has ECS instances in a region but they are not managed by SysOM, the region will not appear in the API response.</p>
     * 
     * @param request the request parameters of ListAifgJobs  ListAifgJobsRequest
     * @return ListAifgJobsResponse
     */
    @Override
    public CompletableFuture<ListAifgJobsResponse> listAifgJobs(ListAifgJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAifgJobs").setMethod(HttpMethod.GET).setPathRegex("/api/v1/aifg/listAifgJobs").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAifgJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAifgJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlertDestinations  ListAlertDestinationsRequest
     * @return ListAlertDestinationsResponse
     */
    @Override
    public CompletableFuture<ListAlertDestinationsResponse> listAlertDestinations(ListAlertDestinationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAlertDestinations").setMethod(HttpMethod.GET).setPathRegex("/api/v1/alertPusher/alert/listDestinations").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlertDestinationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlertDestinationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlertItems  ListAlertItemsRequest
     * @return ListAlertItemsResponse
     */
    @Override
    public CompletableFuture<ListAlertItemsResponse> listAlertItems(ListAlertItemsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAlertItems").setMethod(HttpMethod.GET).setPathRegex("/api/v1/alertPusher/alert/listItems").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlertItemsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlertItemsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAlertStrategies  ListAlertStrategiesRequest
     * @return ListAlertStrategiesResponse
     */
    @Override
    public CompletableFuture<ListAlertStrategiesResponse> listAlertStrategies(ListAlertStrategiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAlertStrategies").setMethod(HttpMethod.GET).setPathRegex("/api/v1/alertPusher/alert/listStrategies").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAlertStrategiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAlertStrategiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAllInstances  ListAllInstancesRequest
     * @return ListAllInstancesResponse
     */
    @Override
    public CompletableFuture<ListAllInstancesResponse> listAllInstances(ListAllInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAllInstances").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/listAllInstances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAllInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAllInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusterAgentInstallRecords  ListClusterAgentInstallRecordsRequest
     * @return ListClusterAgentInstallRecordsResponse
     */
    @Override
    public CompletableFuture<ListClusterAgentInstallRecordsResponse> listClusterAgentInstallRecords(ListClusterAgentInstallRecordsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusterAgentInstallRecords").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/list_cluster_agent_install_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClusterAgentInstallRecordsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClusterAgentInstallRecordsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListClusters  ListClustersRequest
     * @return ListClustersResponse
     */
    @Override
    public CompletableFuture<ListClustersResponse> listClusters(ListClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListClusters").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/cluster/list_clusters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDiagnosis  ListDiagnosisRequest
     * @return ListDiagnosisResponse
     */
    @Override
    public CompletableFuture<ListDiagnosisResponse> listDiagnosis(ListDiagnosisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListDiagnosis").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/diagnosis/list_diagnosis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDiagnosisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDiagnosisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceHealth  ListInstanceHealthRequest
     * @return ListInstanceHealthResponse
     */
    @Override
    public CompletableFuture<ListInstanceHealthResponse> listInstanceHealth(ListInstanceHealthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceHealth").setMethod(HttpMethod.GET).setPathRegex("/api/v1/openapi/cluster_health/range/instance_health_list").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceHealthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceHealthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstanceInfo  ListInstanceInfoRequest
     * @return ListInstanceInfoResponse
     */
    @Override
    public CompletableFuture<ListInstanceInfoResponse> listInstanceInfo(ListInstanceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceInfo").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/listInstanceInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the list of machines managed by SysOM.</p>
     * 
     * @param request the request parameters of ListInstanceStatus  ListInstanceStatusRequest
     * @return ListInstanceStatusResponse
     */
    @Override
    public CompletableFuture<ListInstanceStatusResponse> listInstanceStatus(ListInstanceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstanceStatus").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/list_instance_status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstanceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstanceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation retrieves the list of instances that are already managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of ListInstances  ListInstancesRequest
     * @return ListInstancesResponse
     */
    @Override
    public CompletableFuture<ListInstancesResponse> listInstances(ListInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstances").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/list_instances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The instance list retrieved by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of ListInstancesEcsInfoList  ListInstancesEcsInfoListRequest
     * @return ListInstancesEcsInfoListResponse
     */
    @Override
    public CompletableFuture<ListInstancesEcsInfoListResponse> listInstancesEcsInfoList(ListInstancesEcsInfoListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstancesEcsInfoList").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/listInstancesEcsInfoList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesEcsInfoListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesEcsInfoListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The instance list returned by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of ListInstancesWithEcsInfo  ListInstancesWithEcsInfoRequest
     * @return ListInstancesWithEcsInfoResponse
     */
    @Override
    public CompletableFuture<ListInstancesWithEcsInfoResponse> listInstancesWithEcsInfo(ListInstancesWithEcsInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListInstancesWithEcsInfo").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/listInstancesWithEcsInfo").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesWithEcsInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesWithEcsInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The instance list retrieved by this operation contains only machines that are managed by SysOM. If an ECS instance exists but is not managed by SysOM, it does not appear in the list.</p>
     * 
     * @param request the request parameters of ListPluginsInstances  ListPluginsInstancesRequest
     * @return ListPluginsInstancesResponse
     */
    @Override
    public CompletableFuture<ListPluginsInstancesResponse> listPluginsInstances(ListPluginsInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPluginsInstances").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/agent/listPluginsInstances").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPluginsInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPluginsInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPodsOfInstance  ListPodsOfInstanceRequest
     * @return ListPodsOfInstanceResponse
     */
    @Override
    public CompletableFuture<ListPodsOfInstanceResponse> listPodsOfInstance(ListPodsOfInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListPodsOfInstance").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/list_pod_of_instance").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPodsOfInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPodsOfInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation retrieves the list of regions where the current user has instances managed by SysOM. If you have ECS instances in a region but they are not managed by SysOM, the region is not included in the response.</p>
     * 
     * @param request the request parameters of ListRegions  ListRegionsRequest
     * @return ListRegionsResponse
     */
    @Override
    public CompletableFuture<ListRegionsResponse> listRegions(ListRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListRegions").setMethod(HttpMethod.GET).setPathRegex("/api/v1/am/instance/list_regions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVmcoreDiagnosisTask  ListVmcoreDiagnosisTaskRequest
     * @return ListVmcoreDiagnosisTaskResponse
     */
    @Override
    public CompletableFuture<ListVmcoreDiagnosisTaskResponse> listVmcoreDiagnosisTask(ListVmcoreDiagnosisTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListVmcoreDiagnosisTask").setMethod(HttpMethod.GET).setPathRegex("/api/v1/crashAgent/diagnosis/queryTaskList").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVmcoreDiagnosisTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVmcoreDiagnosisTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Calling this API operation to install the agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetHotfixTask operation to query the execution status of the task.</p>
     * 
     * @param request the request parameters of QueryHotfixStatus  QueryHotfixStatusRequest
     * @return QueryHotfixStatusResponse
     */
    @Override
    public CompletableFuture<QueryHotfixStatusResponse> queryHotfixStatus(QueryHotfixStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("QueryHotfixStatus").setMethod(HttpMethod.POST).setPathRegex("/api/v1/hotfix_manager/hotfix/query_status").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryHotfixStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryHotfixStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartAIAnalysis  StartAIAnalysisRequest
     * @return StartAIAnalysisResponse
     */
    @Override
    public CompletableFuture<StartAIAnalysisResponse> startAIAnalysis(StartAIAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartAIAnalysis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/start_ai_analysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAIAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAIAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Currently, only comparative analysis of the same PID across different steps within the same AI Infra analysis record is supported.</p>
     * 
     * @param request the request parameters of StartAIDiffAnalysis  StartAIDiffAnalysisRequest
     * @return StartAIDiffAnalysisResponse
     */
    @Override
    public CompletableFuture<StartAIDiffAnalysisResponse> startAIDiffAnalysis(StartAIDiffAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartAIDiffAnalysis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/appObserv/aiAnalysis/diffAnalysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAIDiffAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAIDiffAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Currently, only comparative analysis of the same PID across different steps under the same AI Infra analysis record is supported.</p>
     * 
     * @param request the request parameters of StartAifgAnalysis  StartAifgAnalysisRequest
     * @return StartAifgAnalysisResponse
     */
    @Override
    public CompletableFuture<StartAifgAnalysisResponse> startAifgAnalysis(StartAifgAnalysisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("StartAifgAnalysis").setMethod(HttpMethod.POST).setPathRegex("/api/v1/aifg/startAifgAnalysis").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartAifgAnalysisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartAifgAnalysisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to uninstall an Agent is asynchronous. After the call, a task_id is returned. You can use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * @param request the request parameters of UninstallAgent  UninstallAgentRequest
     * @return UninstallAgentResponse
     */
    @Override
    public CompletableFuture<UninstallAgentResponse> uninstallAgent(UninstallAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UninstallAgent").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/uninstall_agent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UninstallAgentForCluster  UninstallAgentForClusterRequest
     * @return UninstallAgentForClusterResponse
     */
    @Override
    public CompletableFuture<UninstallAgentForClusterResponse> uninstallAgentForCluster(UninstallAgentForClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UninstallAgentForCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/uninstall_agent_by_cluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallAgentForClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallAgentForClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to uninstall an Agent is asynchronous. After the call, a task_id is returned. Use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * @param request the request parameters of UninstallAgentWithType  UninstallAgentWithTypeRequest
     * @return UninstallAgentWithTypeResponse
     */
    @Override
    public CompletableFuture<UninstallAgentWithTypeResponse> uninstallAgentWithType(UninstallAgentWithTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UninstallAgentWithType").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/uninstallAgent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallAgentWithTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallAgentWithTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Calling this API to install the agent is asynchronous. After you call this API, a task_id is returned. You can use this ID to call the GetHotfixTask API to obtain the execution status of the task.</p>
     * 
     * @param request the request parameters of UninstallHotfix  UninstallHotfixRequest
     * @return UninstallHotfixResponse
     */
    @Override
    public CompletableFuture<UninstallHotfixResponse> uninstallHotfix(UninstallHotfixRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UninstallHotfix").setMethod(HttpMethod.POST).setPathRegex("/api/v1/hotfix_manager/hotfix/uninstall").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UninstallHotfixResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UninstallHotfixResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After the configuration is updated, the new configuration is delivered to all resources to which the configuration is applied.</p>
     * 
     * @param request the request parameters of UpdateAgentConfig  UpdateAgentConfigRequest
     * @return UpdateAgentConfigResponse
     */
    @Override
    public CompletableFuture<UpdateAgentConfigResponse> updateAgentConfig(UpdateAgentConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentConfig").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/am/agent/updateAgentConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>、</p>
     * 
     * @param request the request parameters of UpdateAlertDestination  UpdateAlertDestinationRequest
     * @return UpdateAlertDestinationResponse
     */
    @Override
    public CompletableFuture<UpdateAlertDestinationResponse> updateAlertDestination(UpdateAlertDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAlertDestination").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/alertPusher/alert/updateDestination").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAlertDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAlertDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAlertEnabled  UpdateAlertEnabledRequest
     * @return UpdateAlertEnabledResponse
     */
    @Override
    public CompletableFuture<UpdateAlertEnabledResponse> updateAlertEnabled(UpdateAlertEnabledRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAlertEnabled").setMethod(HttpMethod.POST).setPathRegex("/api/v1/alertPusher/alert/updateEnabled").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAlertEnabledResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAlertEnabledResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAlertStrategy  UpdateAlertStrategyRequest
     * @return UpdateAlertStrategyResponse
     */
    @Override
    public CompletableFuture<UpdateAlertStrategyResponse> updateAlertStrategy(UpdateAlertStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAlertStrategy").setMethod(HttpMethod.POST).setPathRegex("/api/v1/alertPusher/alert/updateStrategy").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAlertStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAlertStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateClusterAgentConfig  UpdateClusterAgentConfigRequest
     * @return UpdateClusterAgentConfigResponse
     */
    @Override
    public CompletableFuture<UpdateClusterAgentConfigResponse> updateClusterAgentConfig(UpdateClusterAgentConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateClusterAgentConfig").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/am/agent/updateClusterAgentConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateClusterAgentConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateClusterAgentConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEventsAttention  UpdateEventsAttentionRequest
     * @return UpdateEventsAttentionResponse
     */
    @Override
    public CompletableFuture<UpdateEventsAttentionResponse> updateEventsAttention(UpdateEventsAttentionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateEventsAttention").setMethod(HttpMethod.POST).setPathRegex("/api/v1/openapi/proxy/post/cluster_update_events_attention").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEventsAttentionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEventsAttentionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateFuncSwitchRecordResponse> updateFuncSwitchRecord(UpdateFuncSwitchRecordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateFuncSwitchRecord").setMethod(HttpMethod.GET).setPathRegex("/api/v1/func-switch/update-service-func-switch").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFuncSwitchRecordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFuncSwitchRecordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateInstanceAgentConfig  UpdateInstanceAgentConfigRequest
     * @return UpdateInstanceAgentConfigResponse
     */
    @Override
    public CompletableFuture<UpdateInstanceAgentConfigResponse> updateInstanceAgentConfig(UpdateInstanceAgentConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateInstanceAgentConfig").setMethod(HttpMethod.PUT).setPathRegex("/api/v1/am/agent/updateInstanceAgentConfig").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateInstanceAgentConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateInstanceAgentConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to update an Agent is asynchronous. After the call, a task_id is returned. Use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * @param request the request parameters of UpgradeAgent  UpgradeAgentRequest
     * @return UpgradeAgentResponse
     */
    @Override
    public CompletableFuture<UpgradeAgentResponse> upgradeAgent(UpgradeAgentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeAgent").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/upgrade_agent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeAgentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeAgentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeAgentForCluster  UpgradeAgentForClusterRequest
     * @return UpgradeAgentForClusterResponse
     */
    @Override
    public CompletableFuture<UpgradeAgentForClusterResponse> upgradeAgentForCluster(UpgradeAgentForClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeAgentForCluster").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/upgrade_agent_by_cluster").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeAgentForClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeAgentForClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Calling this operation to update an Agent is asynchronous. After the call, a task_id is returned. Use this ID to call the GetAgentTask operation to retrieve the execution status of the task.</p>
     * 
     * @param request the request parameters of UpgradeAgentWithType  UpgradeAgentWithTypeRequest
     * @return UpgradeAgentWithTypeResponse
     */
    @Override
    public CompletableFuture<UpgradeAgentWithTypeResponse> upgradeAgentWithType(UpgradeAgentWithTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpgradeAgentWithType").setMethod(HttpMethod.POST).setPathRegex("/api/v1/am/agent/upgradeAgent").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeAgentWithTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeAgentWithTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
