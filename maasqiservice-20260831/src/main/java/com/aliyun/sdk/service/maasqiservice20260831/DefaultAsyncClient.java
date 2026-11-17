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
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Install the SDK from the SDK Center.</li>
     * <li>Activate the Creative Agent service and prepare the published instance ID and the corresponding instance access key.</li>
     * <li>Creative Agent provides the lite and dedicated editions. The lite edition performs generation or editing based on whether a reference image is provided. The dedicated edition uses a Planner to schedule and execute creative tasks.</li>
     * <li>Use the SDK to complete AccessKey authentication. The instance access key must be placed in the X-QI-Agent-Api-Key header and cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type: application/json and Accept: text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: POST /aigc/v1/chat/completions.</li>
     * <li>Specify the instance through X-QI-Instance-Id and execute according to the published configuration of the instance. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>This operation returns incremental events rather than a complete JSON response. Continuously read the stream until it ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id in the first turn. Save the session ID returned by the server from the qi_session_id field in the SSE body and pass the same value back in subsequent turns. Do not rely on the gateway to pass through custom response headers. Use different IDs for different sessions and send requests in sequence for the same session.</p>
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
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>The Camera Agent service is activated. The ID of a published CameraStandard instance and the corresponding instance access key are prepared.</li>
     * <li>AccessKey authentication is completed by using SDK or OpenAPI signatures. The instance key is provided in the <code>X-QI-Agent-Api-Key</code> header and cannot replace the AccessKey signature.</li>
     * <li>The <code>Content-Type</code> header is set to <code>application/json</code>. If <code>stream</code> is set to <code>true</code>, SSE is used and the <code>Accept</code> header is set to <code>text/event-stream</code>. Otherwise, a JSON response is returned.</li>
     * </ul>
     * <h3>Call method</h3>
     * <p>Send a <code>POST /camera/v1/chat/completions</code> request. Specify the instance by using the <code>X-QI-Instance-Id</code> header and provide the raw value of the key. Submit one <code>role=user</code> message and one image per request. The recognition scene, model, and thresholds use the published configuration of the instance.</p>
     * <h3>Session management</h3>
     * <p>You can omit the <code>X-QI-Session-Id</code> header in the first request and make sequential calls within the same session. The <code>scene_id</code> parameter is required for person recognition but must be omitted for food recognition. Session management handles execution and idempotency, while the scene ID manages person deduplication. The same scene can be reused across sessions, but calls must be sequential. Create a new session when you switch the published version or recognition scene. For person recognition, create a new scene at the same time.</p>
     * 
     * @param request the request parameters of CameraChatCompletionStream  CameraChatCompletionStreamRequest
     * @return CameraChatCompletionStreamResponse
     */
    @Override
    public CompletableFuture<CameraChatCompletionStreamResponse> cameraChatCompletionStream(CameraChatCompletionStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CameraChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/camera/v1/chat/completions").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CameraChatCompletionStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CameraChatCompletionStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> cameraChatCompletionStreamWithAsyncResponseHandler(CameraChatCompletionStreamRequest request, AsyncResponseHandler<CameraChatCompletionStreamResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CameraChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/camera/v1/chat/completions").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(CameraChatCompletionStreamResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((CameraChatCompletionStreamResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<String> cameraChatCompletionStreamWithResponseIterable(CameraChatCompletionStreamRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("CameraChatCompletionStream").setMethod(HttpMethod.POST).setPathRegex("/camera/v1/chat/completions").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        CameraChatCompletionStreamResponseBodyIterator iterator = CameraChatCompletionStreamResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * <b>description</b> :
     * <p>调试当前租户的 Camera Agent，支持美食或人物识别。省略 config 使用实例草稿，临时配置仅用于本次调用。通过 POP 鉴权，无需 Agent Key。</p>
     * 
     * @param request the request parameters of CameraConsoleDebugStream  CameraConsoleDebugStreamRequest
     * @return CameraConsoleDebugStreamResponse
     */
    @Override
    public CompletableFuture<CameraConsoleDebugStreamResponse> cameraConsoleDebugStream(CameraConsoleDebugStreamRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CameraConsoleDebugStream").setMethod(HttpMethod.POST).setPathRegex("/api/console/camera/agents/debug").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CameraConsoleDebugStreamResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CameraConsoleDebugStreamResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public <ReturnT> CompletableFuture<ReturnT> cameraConsoleDebugStreamWithAsyncResponseHandler(CameraConsoleDebugStreamRequest request, AsyncResponseHandler<CameraConsoleDebugStreamResponse, ReturnT> responseHandler) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CameraConsoleDebugStream").setMethod(HttpMethod.POST).setPathRegex("/api/console/camera/agents/debug").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withResponseHandler(responseHandler).withOutput(CameraConsoleDebugStreamResponse.create());
            return this.handler.execute(params)
                    .thenCompose((output) -> CompletableFuture.completedFuture(responseHandler.transform((CameraConsoleDebugStreamResponse)output)));
        } catch (Exception e) {
            CompletableFuture<ReturnT> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<String> cameraConsoleDebugStreamWithResponseIterable(CameraConsoleDebugStreamRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("CameraConsoleDebugStream").setMethod(HttpMethod.POST).setPathRegex("/api/console/camera/agents/debug").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        CameraConsoleDebugStreamResponseBodyIterator iterator = CameraConsoleDebugStreamResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * <b>description</b> :
     * <p>This topic retains the section names and order of the previous version. For version differences, see Release notes. This topic is compiled based on the official API reference of the previous version, subsequent call instructions from the service provider, and pre-release call observations. It does not indicate that a full audit of the new version of the service source code or the official gateway has been completed. No new API version number is provided.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Install the official SDK applicable to the target endpoint from the SDK center.</li>
     * <li>Activate the CUA Agent service and prepare the published CUA instance ID and its access key.</li>
     * <li>CUA is only available in Standard Edition.</li>
     * <li>The official POP/OpenAPI endpoint uses the Alibaba Cloud SDK or OpenAPI signature to complete AccessKey authentication. The instance access key is separately placed in <code>X-QI-Agent-Api-Key</code> and cannot replace the AccessKey signature.</li>
     * <li>Set <code>Content-Type: application/json</code> and <code>Accept: text/event-stream</code>. The <code>stream</code> parameter must be set to <code>true</code>.</li>
     * <li>Use the target endpoint confirmed by the service provider. The authentication behavior of the pre-release direct business endpoint cannot be extrapolated to mean that the official endpoint does not require an AK signature.</li>
     * <li>The client must have the capabilities of taking screenshots, fully parsing SSE, executing actions, and returning actual results. Code and commands must be executed in a controlled and authorized environment. Manual confirmation should be added for sensitive operations.</li>
     * </ul>
     * <h2>Call methods</h2>
     * <ul>
     * <li>Method and path: <code>POST /cua/v1/chat/completions</code>.</li>
     * <li><code>X-QI-Instance-Id</code> specifies the instance and is executed according to the published CUA Standard Edition configuration. The <code>model</code> parameter in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE events, not a complete JSON object. Continue reading until the end and check for errors within the stream.</li>
     * <li>CUA returns the complete action after the single-step model decision is completed, rather than outputting token by token. Heartbeats are used to maintain the connection during the waiting phase.</li>
     * <li>The mode is selected through <code>metadata.actionMode</code> in the request body: <code>gui-only</code> or <code>gui+cli</code>. This is a field supplemented by subsequent service instructions, not a model name or request header.</li>
     * <li>Do not use <code>stream:false</code> to replace this API operation. Non-streaming mode may result in no response bytes for a long time before the model finishes, which increases the risk of intermediate link timeouts.</li>
     * </ul>
     * <h2>Session management</h2>
     * <p>In the first round, you can omit or leave <code>X-QI-Session-Id</code> empty, save <code>qi_session_id</code> from the SSE body, and reuse it through the request header with the same name in subsequent rounds. Do not rely on the gateway to pass through custom response headers. The actual identifier is subject to the SSE body.
     * <code>X-QI-Request-Id</code> can be generated by the server. We recommend that the client explicitly generate it to facilitate recovery and troubleshooting:</p>
     * <ul>
     * <li>New step: new request ID.</li>
     * <li>Retry the same step: same session, same request ID, and same request body.</li>
     * <li>Calls within the same session must be strictly sequential. Do not send different steps in parallel. Use different sessions for different tasks.</li>
     * <li>Explicitly select <code>actionMode</code> in the first round and keep it consistent in subsequent rounds. If you need to change the mode, create a new session. You cannot switch modes within the same session.</li>
     * <li>If the stream is disconnected before <code>qi_session_id</code> is obtained in the first round, the recovery method must be handled according to the rules confirmed by the service provider. You cannot assume that the request ID can be deduplicated across unknown sessions.</li>
     * <li>Save the session/request ID immediately when the identity event is obtained, but do not treat the identity event as a complete return of the action.</li>
     * <li>Stop continuing after receiving <code>finished</code>. The current documentation does not provide an independent session release API operation. Do not construct additional release requests on your own.</li>
     * </ul>
     * <h2>Rate limit</h2>
     * <p>The current API request rate for the cloud service is not exposed. Do not treat the client concurrency configuration as the concurrency or QPS commitment allowed by the service. You should confirm the capacity, queuing, and quotas with the service provider.
     * Limits provided in subsequent service instructions:</p>
     * <ul>
     * <li>The current request body limit is <strong>8 MB</strong>, including the fully serialized JSON, not just images.</li>
     * <li>Exactly one current screenshot is required for each step. Do not pass multiple images or screenshot history.</li>
     * <li>A keepalive message is sent approximately every <strong>15 seconds</strong> during the waiting period. This interval is not a response latency SLA, and you cannot rely on heartbeats when an HTTP/SSE response has not been established.</li>
     * </ul>
     * 
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
     * <li>Install the SDK from the SDK center.</li>
     * <li>Activate the Mobile-Use Agent service and prepare the published Mobile-Use Agent instance ID and its access key.</li>
     * <li>Mobile-Use Agent provides the standard and exclusive editions. Call the API based on the edition of the selected instance.</li>
     * <li>Use the SDK to complete AccessKey authentication. Place the instance access key in the X-QI-Agent-Api-Key header, which cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type to application/json and Accept to text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: <code>POST /gui/v1/chat/completions</code>.</li>
     * <li>X-QI-Instance-Id specifies the instance and executes based on the published configuration. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE incremental events, not a complete JSON object. Continuously read until the stream ends and check for errors within the stream.</li>
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
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Install the SDK from the SDK center.</li>
     * <li>Activate the Mobile Planner Agent service and prepare the ID and access key of a published Mobile Planner Agent instance.</li>
     * <li>Use the SDK to complete AccessKey authentication. Place the instance access key in the X-QI-Agent-Api-Key header, which cannot replace the AccessKey signature.</li>
     * <li>Set Content-Type to application/json and Accept to text/event-stream. The stream parameter must be set to true.</li>
     * </ul>
     * <h3>Call methods</h3>
     * <ul>
     * <li>Method and path: <code>POST /pa/v1/chat/completions</code>.</li>
     * <li>Use X-QI-Instance-Id to specify the instance and execute it based on the published configuration. The model field in the request body is a compatibility placeholder and cannot be used to switch models.</li>
     * <li>The response consists of SSE incremental events rather than a complete JSON object. Continuously read the stream until it ends and check for errors within the stream.</li>
     * </ul>
     * <h3>Session management</h3>
     * <p>You can omit X-QI-Session-Id in the first turn and save the qi_session_id from the SSE body. Pass it back in the request header with the same name in subsequent turns to continue the session. Make sequential calls within the same session and use different identifiers for different sessions. Do not rely on the gateway to pass through custom response headers. The actual identifier is subject to the SSE body.</p>
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
