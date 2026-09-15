// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasqiservice20260831;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.maasqiservice20260831.models.*;
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
     * @param request the request parameters of AigcChatCompletionStream  AigcChatCompletionStreamRequest
     * @return AigcChatCompletionStreamResponse
     */
    CompletableFuture<AigcChatCompletionStreamResponse> aigcChatCompletionStream(AigcChatCompletionStreamRequest request);

<ReturnT> CompletableFuture<ReturnT> aigcChatCompletionStreamWithAsyncResponseHandler(AigcChatCompletionStreamRequest request, AsyncResponseHandler<AigcChatCompletionStreamResponse, ReturnT> responseHandler);

    ResponseIterable<AigcChatCompletionStreamResponseBody> aigcChatCompletionStreamWithResponseIterable(AigcChatCompletionStreamRequest request);

    /**
     * @param request the request parameters of GuiChatCompletionStream  GuiChatCompletionStreamRequest
     * @return GuiChatCompletionStreamResponse
     */
    CompletableFuture<GuiChatCompletionStreamResponse> guiChatCompletionStream(GuiChatCompletionStreamRequest request);

<ReturnT> CompletableFuture<ReturnT> guiChatCompletionStreamWithAsyncResponseHandler(GuiChatCompletionStreamRequest request, AsyncResponseHandler<GuiChatCompletionStreamResponse, ReturnT> responseHandler);

    ResponseIterable<GuiChatCompletionStreamResponseBody> guiChatCompletionStreamWithResponseIterable(GuiChatCompletionStreamRequest request);

    /**
     * @param request the request parameters of PaChatCompletionStream  PaChatCompletionStreamRequest
     * @return PaChatCompletionStreamResponse
     */
    CompletableFuture<PaChatCompletionStreamResponse> paChatCompletionStream(PaChatCompletionStreamRequest request);

<ReturnT> CompletableFuture<ReturnT> paChatCompletionStreamWithAsyncResponseHandler(PaChatCompletionStreamRequest request, AsyncResponseHandler<PaChatCompletionStreamResponse, ReturnT> responseHandler);

    ResponseIterable<PaChatCompletionStreamResponseBody> paChatCompletionStreamWithResponseIterable(PaChatCompletionStreamRequest request);

}
