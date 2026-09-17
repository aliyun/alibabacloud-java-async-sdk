// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220602;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.hologram20220602.models.*;
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
        this.product = "Hologram";
        this.version = "2022-06-02";
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于创建一个新的 Agent 会话。</li>
     * <li>通过 <code>_meta.agent.agentName</code> 指定绑定的 Agent 名称，这是必填项。</li>
     * <li>可以通过 <code>_meta.config.sessionSource</code> 透传会话来源标识，便于后续按来源检索。</li>
     * <li>支持通过 <code>_meta.config.sessionTags[].sessionTagCode</code> 传入会话标签。</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAgentSession  CreateAgentSessionRequest
     * @return CreateAgentSessionResponse
     */
    @Override
    public CompletableFuture<CreateAgentSessionResponse> createAgentSession(CreateAgentSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAgentSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAgentSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于向指定的会话 ID 发送用户的 Prompt，并以 SSE（Server-Sent Events）流式方式接收来自 Agent 的响应。</li>
     * <li>响应可能包括消息分片、思考过程、工具调用状态更新等信息。</li>
     * <li>如果指定的会话不存在，将通过 SSE 错误帧返回 400 错误。</li>
     * <li><code>stopReason</code>字段指示了 Agent 停止本轮对话的原因。</li>
     * <li>可选地提供额外元信息<code>Meta</code>来传递更多上下文给服务端。</li>
     * <li>返回的内容符合开源协议 Agent Client Protocol (ACP) 的规范。</li>
     * </ul>
     * 
     * @param request the request parameters of PromptAgentSession  PromptAgentSessionRequest
     * @return PromptAgentSessionResponse
     */
    @Override
    public CompletableFuture<PromptAgentSessionResponse> promptAgentSession(PromptAgentSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PromptAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PromptAgentSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PromptAgentSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<PromptAgentSessionResponseBody> promptAgentSessionWithResponseIterable(PromptAgentSessionRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("PromptAgentSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
        PromptAgentSessionResponseBodyIterator iterator = PromptAgentSessionResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

}
