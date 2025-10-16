// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.agentrun20250910.models.*;
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
        this.product = "AgentRun";
        this.version = "2025-09-10";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>创建一个新的智能体运行时实例，用于执行AI代理任务。智能体运行时是AgentRun服务的核心组件，提供代码执行、浏览器操作、内存管理等能力。</p>
     * 
     * @param request the request parameters of CreateAgentRuntime  CreateAgentRuntimeRequest
     * @return CreateAgentRuntimeResponse
     */
    @Override
    public CompletableFuture<CreateAgentRuntimeResponse> createAgentRuntime(CreateAgentRuntimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentRuntime").setMethod(HttpMethod.POST).setPathRegex("/2025-09-10/agents/runtimes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentRuntimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentRuntimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>为指定的智能体运行时创建新的端点，用于外部访问和调用。端点是智能体运行时对外提供服务的入口。</p>
     * 
     * @param request the request parameters of CreateAgentRuntimeEndpoint  CreateAgentRuntimeEndpointRequest
     * @return CreateAgentRuntimeEndpointResponse
     */
    @Override
    public CompletableFuture<CreateAgentRuntimeEndpointResponse> createAgentRuntimeEndpoint(CreateAgentRuntimeEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateAgentRuntimeEndpoint").setMethod(HttpMethod.POST).setPathRegex("/2025-09-10/agents/runtimes/{agentRuntimeId}/endpoints").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentRuntimeEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentRuntimeEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>创建一个新的浏览器实例，用于执行网页自动化任务。浏览器实例提供网页浏览、元素操作、截图录制等功能。</p>
     * 
     * @param request the request parameters of CreateBrowser  CreateBrowserRequest
     * @return CreateBrowserResponse
     */
    @Override
    public CompletableFuture<CreateBrowserResponse> createBrowser(CreateBrowserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateBrowser").setMethod(HttpMethod.POST).setPathRegex("/2025-09-10/agents/browsers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBrowserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBrowserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>创建一个新的代码解释器实例，用于执行代码解释和运行任务。代码解释器提供Python代码执行、数据处理、机器学习等功能。</p>
     * 
     * @param request the request parameters of CreateCodeInterpreter  CreateCodeInterpreterRequest
     * @return CreateCodeInterpreterResponse
     */
    @Override
    public CompletableFuture<CreateCodeInterpreterResponse> createCodeInterpreter(CreateCodeInterpreterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateCodeInterpreter").setMethod(HttpMethod.POST).setPathRegex("/2025-09-10/agents/code-interpreters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCodeInterpreterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCodeInterpreterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMemory  CreateMemoryRequest
     * @return CreateMemoryResponse
     */
    @Override
    public CompletableFuture<CreateMemoryResponse> createMemory(CreateMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMemory").setMethod(HttpMethod.POST).setPathRegex("/2025-09-10/agents/memories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateMemoryEvent  CreateMemoryEventRequest
     * @return CreateMemoryEventResponse
     */
    @Override
    public CompletableFuture<CreateMemoryEventResponse> createMemoryEvent(CreateMemoryEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateMemoryEvent").setMethod(HttpMethod.POST).setPathRegex("/2025-09-10/agents/memories/{memoryName}/events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateMemoryEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateMemoryEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>删除指定的智能体运行时实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * @param request the request parameters of DeleteAgentRuntime  DeleteAgentRuntimeRequest
     * @return DeleteAgentRuntimeResponse
     */
    @Override
    public CompletableFuture<DeleteAgentRuntimeResponse> deleteAgentRuntime(DeleteAgentRuntimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentRuntime").setMethod(HttpMethod.DELETE).setPathRegex("/2025-09-10/agents/runtimes/{agentRuntimeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentRuntimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentRuntimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteAgentRuntimeEndpoint  DeleteAgentRuntimeEndpointRequest
     * @return DeleteAgentRuntimeEndpointResponse
     */
    @Override
    public CompletableFuture<DeleteAgentRuntimeEndpointResponse> deleteAgentRuntimeEndpoint(DeleteAgentRuntimeEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteAgentRuntimeEndpoint").setMethod(HttpMethod.DELETE).setPathRegex("/2025-09-10/agents/runtimes/{agentRuntimeId}/endpoints/{agentRuntimeEndpointId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAgentRuntimeEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAgentRuntimeEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>删除指定的浏览器实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * @param request the request parameters of DeleteBrowser  DeleteBrowserRequest
     * @return DeleteBrowserResponse
     */
    @Override
    public CompletableFuture<DeleteBrowserResponse> deleteBrowser(DeleteBrowserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteBrowser").setMethod(HttpMethod.DELETE).setPathRegex("/2025-09-10/agents/browsers/{browserId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBrowserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBrowserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>删除指定的代码解释器实例，包括其所有相关资源和数据。删除操作不可逆，请谨慎操作。</p>
     * 
     * @param request the request parameters of DeleteCodeInterpreter  DeleteCodeInterpreterRequest
     * @return DeleteCodeInterpreterResponse
     */
    @Override
    public CompletableFuture<DeleteCodeInterpreterResponse> deleteCodeInterpreter(DeleteCodeInterpreterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteCodeInterpreter").setMethod(HttpMethod.DELETE).setPathRegex("/2025-09-10/agents/code-interpreters/{codeInterpreterId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCodeInterpreterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCodeInterpreterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteMemory  DeleteMemoryRequest
     * @return DeleteMemoryResponse
     */
    @Override
    public CompletableFuture<DeleteMemoryResponse> deleteMemory(DeleteMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteMemory").setMethod(HttpMethod.DELETE).setPathRegex("/2025-09-10/agents/memories/{memoryName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>根据智能体运行时ID获取指定智能体运行时的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * @param request the request parameters of GetAgentRuntime  GetAgentRuntimeRequest
     * @return GetAgentRuntimeResponse
     */
    @Override
    public CompletableFuture<GetAgentRuntimeResponse> getAgentRuntime(GetAgentRuntimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentRuntime").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/runtimes/{agentRuntimeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentRuntimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentRuntimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAgentRuntimeEndpoint  GetAgentRuntimeEndpointRequest
     * @return GetAgentRuntimeEndpointResponse
     */
    @Override
    public CompletableFuture<GetAgentRuntimeEndpointResponse> getAgentRuntimeEndpoint(GetAgentRuntimeEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetAgentRuntimeEndpoint").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/runtimes/{agentRuntimeId}/endpoints/{agentRuntimeEndpointId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAgentRuntimeEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAgentRuntimeEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>根据浏览器ID获取指定浏览器实例的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * @param request the request parameters of GetBrowser  GetBrowserRequest
     * @return GetBrowserResponse
     */
    @Override
    public CompletableFuture<GetBrowserResponse> getBrowser(GetBrowserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetBrowser").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/browsers/{browserId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBrowserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBrowserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>根据代码解释器ID获取指定代码解释器实例的详细信息，包括配置、状态、资源使用情况等。</p>
     * 
     * @param request the request parameters of GetCodeInterpreter  GetCodeInterpreterRequest
     * @return GetCodeInterpreterResponse
     */
    @Override
    public CompletableFuture<GetCodeInterpreterResponse> getCodeInterpreter(GetCodeInterpreterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetCodeInterpreter").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/code-interpreters/{codeInterpreterId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCodeInterpreterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCodeInterpreterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMemory  GetMemoryRequest
     * @return GetMemoryResponse
     */
    @Override
    public CompletableFuture<GetMemoryResponse> getMemory(GetMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMemory").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/memories/{memoryName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetMemoryEvent  GetMemoryEventRequest
     * @return GetMemoryEventResponse
     */
    @Override
    public CompletableFuture<GetMemoryEventResponse> getMemoryEvent(GetMemoryEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMemoryEvent").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/memories/{memoryName}/sessions/{sessionId}/events/{eventId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMemoryEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMemoryEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>根据会话ID获取指定内存会话的详细信息，包括会话中的事件记录、时间戳等。用于查看和管理对话历史。</p>
     * 
     * @param request the request parameters of GetMemorySession  GetMemorySessionRequest
     * @return GetMemorySessionResponse
     */
    @Override
    public CompletableFuture<GetMemorySessionResponse> getMemorySession(GetMemorySessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetMemorySession").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/memories/{memoryName}/sessions/{sessionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetMemorySessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetMemorySessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>获取指定智能体运行时的所有端点列表，支持按名称过滤和分页查询。端点用于外部系统访问智能体运行时服务。</p>
     * 
     * @param request the request parameters of ListAgentRuntimeEndpoints  ListAgentRuntimeEndpointsRequest
     * @return ListAgentRuntimeEndpointsResponse
     */
    @Override
    public CompletableFuture<ListAgentRuntimeEndpointsResponse> listAgentRuntimeEndpoints(ListAgentRuntimeEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentRuntimeEndpoints").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/runtimes/{agentRuntimeId}/endpoints").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentRuntimeEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentRuntimeEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAgentRuntimeVersions  ListAgentRuntimeVersionsRequest
     * @return ListAgentRuntimeVersionsResponse
     */
    @Override
    public CompletableFuture<ListAgentRuntimeVersionsResponse> listAgentRuntimeVersions(ListAgentRuntimeVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentRuntimeVersions").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/runtimes/{agentRuntimeId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentRuntimeVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentRuntimeVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>获取当前用户的所有智能体运行时列表，支持按名称、标签等条件过滤，支持分页查询。</p>
     * 
     * @param request the request parameters of ListAgentRuntimes  ListAgentRuntimesRequest
     * @return ListAgentRuntimesResponse
     */
    @Override
    public CompletableFuture<ListAgentRuntimesResponse> listAgentRuntimes(ListAgentRuntimesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListAgentRuntimes").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/runtimes").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAgentRuntimesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAgentRuntimesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>获取当前用户的所有浏览器实例列表，支持按名称、状态等条件过滤，支持分页查询。</p>
     * 
     * @param request the request parameters of ListBrowsers  ListBrowsersRequest
     * @return ListBrowsersResponse
     */
    @Override
    public CompletableFuture<ListBrowsersResponse> listBrowsers(ListBrowsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListBrowsers").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/browsers").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBrowsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBrowsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>获取当前用户的所有代码解释器实例列表，支持按名称等条件过滤，支持分页查询。</p>
     * 
     * @param request the request parameters of ListCodeInterpreters  ListCodeInterpretersRequest
     * @return ListCodeInterpretersResponse
     */
    @Override
    public CompletableFuture<ListCodeInterpretersResponse> listCodeInterpreters(ListCodeInterpretersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListCodeInterpreters").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/code-interpreters").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCodeInterpretersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCodeInterpretersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMemory  ListMemoryRequest
     * @return ListMemoryResponse
     */
    @Override
    public CompletableFuture<ListMemoryResponse> listMemory(ListMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMemory").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/memories").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListMemoryEvent  ListMemoryEventRequest
     * @return ListMemoryEventResponse
     */
    @Override
    public CompletableFuture<ListMemoryEventResponse> listMemoryEvent(ListMemoryEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMemoryEvent").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/memories/{memoryName}/sessions/{sessionId}/events").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMemoryEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMemoryEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>获取指定内存实例的所有会话列表，支持按时间范围过滤和分页查询。会话是AgentRun中用于存储对话历史和管理上下文的重要组件。</p>
     * 
     * @param request the request parameters of ListMemorySessions  ListMemorySessionsRequest
     * @return ListMemorySessionsResponse
     */
    @Override
    public CompletableFuture<ListMemorySessionsResponse> listMemorySessions(ListMemorySessionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMemorySessions").setMethod(HttpMethod.GET).setPathRegex("/2025-09-10/agents/memories/{memoryName}/sessions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMemorySessionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMemorySessionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>为指定的智能体运行时发布新版本，用于版本管理和部署。新版本可以包含代码更新、配置变更等内容。</p>
     * 
     * @param request the request parameters of PublishRuntimeVersion  PublishRuntimeVersionRequest
     * @return PublishRuntimeVersionResponse
     */
    @Override
    public CompletableFuture<PublishRuntimeVersionResponse> publishRuntimeVersion(PublishRuntimeVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PublishRuntimeVersion").setMethod(HttpMethod.POST).setPathRegex("/2025-09-10/agents/runtimes/{agentRuntimeId}/versions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishRuntimeVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishRuntimeVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RetrieveMemory  RetrieveMemoryRequest
     * @return RetrieveMemoryResponse
     */
    @Override
    public CompletableFuture<RetrieveMemoryResponse> retrieveMemory(RetrieveMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("RetrieveMemory").setMethod(HttpMethod.POST).setPathRegex("/2025-09-10/agents/memories/{memoryName}/records").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetrieveMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetrieveMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>更新指定智能体运行时的配置信息，包括资源分配、网络配置、环境变量等。更新操作会触发运行时重启。</p>
     * 
     * @param request the request parameters of UpdateAgentRuntime  UpdateAgentRuntimeRequest
     * @return UpdateAgentRuntimeResponse
     */
    @Override
    public CompletableFuture<UpdateAgentRuntimeResponse> updateAgentRuntime(UpdateAgentRuntimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentRuntime").setMethod(HttpMethod.PUT).setPathRegex("/2025-09-10/agents/runtimes/{agentRuntimeId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentRuntimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentRuntimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAgentRuntimeEndpoint  UpdateAgentRuntimeEndpointRequest
     * @return UpdateAgentRuntimeEndpointResponse
     */
    @Override
    public CompletableFuture<UpdateAgentRuntimeEndpointResponse> updateAgentRuntimeEndpoint(UpdateAgentRuntimeEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateAgentRuntimeEndpoint").setMethod(HttpMethod.PUT).setPathRegex("/2025-09-10/agents/runtimes/{agentRuntimeId}/endpoints/{agentRuntimeEndpointId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAgentRuntimeEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAgentRuntimeEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateMemory  UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    @Override
    public CompletableFuture<UpdateMemoryResponse> updateMemory(UpdateMemoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateMemory").setMethod(HttpMethod.PUT).setPathRegex("/2025-09-10/agents/memories/{memoryName}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateMemoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateMemoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
