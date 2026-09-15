// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasqiservice20260831;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.maasqiservice20260831.models.*;
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
        this.product = "MaasQIService";
        this.version = "2026-08-31";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AigcChatCompletionStream  AigcChatCompletionStreamRequest
     * @return AigcChatCompletionStreamResponse
     */
    @Override
    public CompletableFuture<AigcChatCompletionStreamResponse> aigcChatCompletionStream(AigcChatCompletionStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AigcChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/aigc/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AigcChatCompletionStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AigcChatCompletionStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> aigcChatCompletionStreamWithAsyncResponseHandler(AigcChatCompletionStreamRequest request, AsyncResponseHandler<AigcChatCompletionStreamResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("AigcChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/aigc/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(AigcChatCompletionStreamResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((AigcChatCompletionStreamResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<AigcChatCompletionStreamResponseBody> aigcChatCompletionStreamWithResponseIterable(AigcChatCompletionStreamRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("AigcChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/aigc/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        AigcChatCompletionStreamResponseBodyIterator iterator = AigcChatCompletionStreamResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of GuiChatCompletionStream  GuiChatCompletionStreamRequest
     * @return GuiChatCompletionStreamResponse
     */
    @Override
    public CompletableFuture<GuiChatCompletionStreamResponse> guiChatCompletionStream(GuiChatCompletionStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GuiChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/gui/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GuiChatCompletionStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GuiChatCompletionStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> guiChatCompletionStreamWithAsyncResponseHandler(GuiChatCompletionStreamRequest request, AsyncResponseHandler<GuiChatCompletionStreamResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GuiChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/gui/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(GuiChatCompletionStreamResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((GuiChatCompletionStreamResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<GuiChatCompletionStreamResponseBody> guiChatCompletionStreamWithResponseIterable(GuiChatCompletionStreamRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("GuiChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/gui/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        GuiChatCompletionStreamResponseBodyIterator iterator = GuiChatCompletionStreamResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * @param request the request parameters of PaChatCompletionStream  PaChatCompletionStreamRequest
     * @return PaChatCompletionStreamResponse
     */
    @Override
    public CompletableFuture<PaChatCompletionStreamResponse> paChatCompletionStream(PaChatCompletionStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PaChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/pa/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PaChatCompletionStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PaChatCompletionStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> paChatCompletionStreamWithAsyncResponseHandler(PaChatCompletionStreamRequest request, AsyncResponseHandler<PaChatCompletionStreamResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("PaChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/pa/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(PaChatCompletionStreamResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((PaChatCompletionStreamResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<PaChatCompletionStreamResponseBody> paChatCompletionStreamWithResponseIterable(PaChatCompletionStreamRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("PaChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/pa/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        PaChatCompletionStreamResponseBodyIterator iterator = PaChatCompletionStreamResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

}
