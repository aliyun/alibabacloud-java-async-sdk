// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220602;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.hologram20220602.models.*;
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
    CompletableFuture<CreateAgentSessionResponse> createAgentSession(CreateAgentSessionRequest request);

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
    CompletableFuture<PromptAgentSessionResponse> promptAgentSession(PromptAgentSessionRequest request);

    ResponseIterable<PromptAgentSessionResponseBody> promptAgentSessionWithResponseIterable(PromptAgentSessionRequest request);

}
