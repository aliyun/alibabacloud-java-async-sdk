// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossagent20260810;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ossagent20260810.models.*;
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
     * @param request the request parameters of a2a  A2aRequest
     * @return A2aResponse
     */
    CompletableFuture<A2aResponse> a2a(A2aRequest request);

    ResponseIterable<Object> a2aWithResponseIterable(A2aRequest request);

    /**
     * @param request the request parameters of agent_card  AgentCardRequest
     * @return AgentCardResponse
     */
    CompletableFuture<AgentCardResponse> agent_card(AgentCardRequest request);

}
