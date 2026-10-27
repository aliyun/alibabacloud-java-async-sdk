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
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Install the SDK from the SDK Center.</li>
     * <li>Activate the Creative Agent service and prepare the published instance ID and the corresponding instance access key.</li>
     * <li>Creative Agent provides Lite and Dedicated editions. The Lite edition generates or edits images based on whether a reference image is provided. The Dedicated edition uses a Planner to plan and execute creative tasks.</li>
     * <li>Complete AccessKey authentication by using the SDK. The instance access key is placed in X-QI-Agent-Api-Key and cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type: application/json and Accept: text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>How to call</h3>
     * <ul>
     * <li>Method and path: <code>POST /aigc/v1/chat/completions</code>.</li>
     * <li>Specify the instance by using <code>X-QI-Instance-Id</code>. The request is executed based on the published configuration of the specified instance. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>This operation returns incremental events instead of a complete JSON response. Continue reading until the stream ends and check for in-stream errors.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit <code>X-QI-Session-Id</code> for the first turn. Save the session identifier returned by the server from the <code>qi_session_id</code> field in the SSE body, and pass the same value back in subsequent turns. Do not rely on the gateway to pass through custom response headers. Use different identifiers for different sessions and send requests sequentially within the same session.</p>
     * 
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
     * @param request the request parameters of CuaChatCompletionStream  CuaChatCompletionStreamRequest
     * @return CuaChatCompletionStreamResponse
     */
    @Override
    public CompletableFuture<CuaChatCompletionStreamResponse> cuaChatCompletionStream(CuaChatCompletionStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CuaChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/cua/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CuaChatCompletionStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CuaChatCompletionStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> cuaChatCompletionStreamWithAsyncResponseHandler(CuaChatCompletionStreamRequest request, AsyncResponseHandler<CuaChatCompletionStreamResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CuaChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/cua/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(CuaChatCompletionStreamResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((CuaChatCompletionStreamResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<CuaChatCompletionStreamResponseBody> cuaChatCompletionStreamWithResponseIterable(CuaChatCompletionStreamRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("CuaChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/cua/v1/chat/completions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        CuaChatCompletionStreamResponseBodyIterator iterator = CuaChatCompletionStreamResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Install the SDK from the SDK Center.</li>
     * <li>Activate the Mobile-Use Agent service and prepare the ID and access key of a published Mobile-Use Agent instance.</li>
     * <li>Mobile-Use Agent provides the Standard Edition and Dedicated Edition. Call the API based on the edition of the selected instance.</li>
     * <li>Use the SDK to complete AccessKey authentication. Place the instance access key in the X-QI-Agent-Api-Key header, which cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type to application/json and Accept to text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: POST /gui/v1/chat/completions.</li>
     * <li>Use X-QI-Instance-Id to specify the instance and execute based on the published configurations. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE incremental events rather than a complete JSON object. Continuously read the stream until it ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id in the first round. Save the qi_session_id from the SSE body and pass it in the request header with the same name for subsequent calls. Make sequential calls within the same session and use different identifiers for different sessions. Do not rely on the gateway to pass through custom response headers. The actual identifier is subject to the SSE body.</p>
     * 
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
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Install the SDK from the SDK center.</li>
     * <li>Activate the Mobile Planner Agent service and prepare the published Mobile Planner Agent instance ID and its access key.</li>
     * <li>Use the SDK to complete AccessKey authentication. The instance access key is placed in X-QI-Agent-Api-Key and cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type: application/json and Accept: text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>How to call</h3>
     * <ul>
     * <li>Method and path: <code>POST /pa/v1/chat/completions</code>.</li>
     * <li>X-QI-Instance-Id specifies the instance and executes based on the published configuration. The model field in the request body is a compatibility placeholder and cannot switch models.</li>
     * <li>The response consists of SSE incremental events, not a single complete JSON object. Continue reading until the stream ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id for the first turn. Save qi_session_id from the SSE body and pass it back through the request header of the same name in subsequent turns. Call sequentially within the same session. Use different identifiers for different sessions. Do not rely on the gateway to pass through custom response headers. The actual identifier is based on the SSE body.</p>
     * 
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
