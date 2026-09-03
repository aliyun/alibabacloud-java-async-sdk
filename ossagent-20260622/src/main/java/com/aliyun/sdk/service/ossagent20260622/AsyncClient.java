// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossagent20260622;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ossagent20260622.models.*;
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
     * @param request the request parameters of Chat  ChatRequest
     * @return ChatResponse
     */
    CompletableFuture<ChatResponse> chat(ChatRequest request);

<ReturnT> CompletableFuture<ReturnT> chatWithAsyncResponseHandler(ChatRequest request, AsyncResponseHandler<ChatResponse, ReturnT> responseHandler);

    ResponseIterable<String> chatWithResponseIterable(ChatRequest request);

    /**
     * @param request the request parameters of Confirm  ConfirmRequest
     * @return ConfirmResponse
     */
    CompletableFuture<ConfirmResponse> confirm(ConfirmRequest request);

<ReturnT> CompletableFuture<ReturnT> confirmWithAsyncResponseHandler(ConfirmRequest request, AsyncResponseHandler<ConfirmResponse, ReturnT> responseHandler);

    ResponseIterable<String> confirmWithResponseIterable(ConfirmRequest request);

    /**
     * @param request the request parameters of GetSessionContent  GetSessionContentRequest
     * @return GetSessionContentResponse
     */
    CompletableFuture<GetSessionContentResponse> getSessionContent(GetSessionContentRequest request);

    /**
     * @param request the request parameters of Interrupt  InterruptRequest
     * @return InterruptResponse
     */
    CompletableFuture<InterruptResponse> interrupt(InterruptRequest request);

}
