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
    CompletableFuture<AigcChatCompletionStreamResponse> aigcChatCompletionStream(AigcChatCompletionStreamRequest request);

<ReturnT> CompletableFuture<ReturnT> aigcChatCompletionStreamWithAsyncResponseHandler(AigcChatCompletionStreamRequest request, AsyncResponseHandler<AigcChatCompletionStreamResponse, ReturnT> responseHandler);

    ResponseIterable<AigcChatCompletionStreamResponseBody> aigcChatCompletionStreamWithResponseIterable(AigcChatCompletionStreamRequest request);

    /**
     * @param request the request parameters of CuaChatCompletionStream  CuaChatCompletionStreamRequest
     * @return CuaChatCompletionStreamResponse
     */
    CompletableFuture<CuaChatCompletionStreamResponse> cuaChatCompletionStream(CuaChatCompletionStreamRequest request);

<ReturnT> CompletableFuture<ReturnT> cuaChatCompletionStreamWithAsyncResponseHandler(CuaChatCompletionStreamRequest request, AsyncResponseHandler<CuaChatCompletionStreamResponse, ReturnT> responseHandler);

    ResponseIterable<CuaChatCompletionStreamResponseBody> cuaChatCompletionStreamWithResponseIterable(CuaChatCompletionStreamRequest request);

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
    CompletableFuture<GuiChatCompletionStreamResponse> guiChatCompletionStream(GuiChatCompletionStreamRequest request);

<ReturnT> CompletableFuture<ReturnT> guiChatCompletionStreamWithAsyncResponseHandler(GuiChatCompletionStreamRequest request, AsyncResponseHandler<GuiChatCompletionStreamResponse, ReturnT> responseHandler);

    ResponseIterable<GuiChatCompletionStreamResponseBody> guiChatCompletionStreamWithResponseIterable(GuiChatCompletionStreamRequest request);

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
    CompletableFuture<PaChatCompletionStreamResponse> paChatCompletionStream(PaChatCompletionStreamRequest request);

<ReturnT> CompletableFuture<ReturnT> paChatCompletionStreamWithAsyncResponseHandler(PaChatCompletionStreamRequest request, AsyncResponseHandler<PaChatCompletionStreamResponse, ReturnT> responseHandler);

    ResponseIterable<PaChatCompletionStreamResponseBody> paChatCompletionStreamWithResponseIterable(PaChatCompletionStreamRequest request);

}
