// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openagent20260801;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.openagent20260801.models.*;
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
        this.product = "OpenAgent";
        this.version = "2026-08-01";
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
     * <p>Cancels a specified run and returns the run status after the cancellation.</p>
     * 
     * @param request the request parameters of CancelRun  CancelRunRequest
     * @return CancelRunResponse
     */
    @Override
    public CompletableFuture<CancelRunResponse> cancelRun(CancelRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CancelRun").setMethod(HttpMethod.POST).setPathRegex("/openapi/v1/agent/sessions/{sessionId}/runs/{runId}/cancel").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Creates a session and returns the session information. Use the returned sessionId for subsequent operations such as sending messages, querying records, and updating the session.</p>
     * 
     * @param request the request parameters of CreateSession  CreateSessionRequest
     * @return CreateSessionResponse
     */
    @Override
    public CompletableFuture<CreateSessionResponse> createSession(CreateSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("CreateSession").setMethod(HttpMethod.POST).setPathRegex("/openapi/v1/agent/sessions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified session. Returns 404 Session.NotFound if the session does not exist or has been deleted.</p>
     * 
     * @param request the request parameters of DeleteSession  DeleteSessionRequest
     * @return DeleteSessionResponse
     */
    @Override
    public CompletableFuture<DeleteSessionResponse> deleteSession(DeleteSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("DeleteSession").setMethod(HttpMethod.DELETE).setPathRegex("/openapi/v1/agent/sessions/{sessionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the read-only mode switch for the current account. The read-only mode is enabled by default if it is not configured.</p>
     * 
     * @param request the request parameters of GetReadonlyMode  GetReadonlyModeRequest
     * @return GetReadonlyModeResponse
     */
    @Override
    public CompletableFuture<GetReadonlyModeResponse> getReadonlyMode(GetReadonlyModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetReadonlyMode").setMethod(HttpMethod.GET).setPathRegex("/openapi/v1/user/configs/readonly").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetReadonlyModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetReadonlyModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the status and interrupt information of a specified run.</p>
     * 
     * @param request the request parameters of GetRun  GetRunRequest
     * @return GetRunResponse
     */
    @Override
    public CompletableFuture<GetRunResponse> getRun(GetRunRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetRun").setMethod(HttpMethod.GET).setPathRegex("/openapi/v1/agent/sessions/{sessionId}/runs/{runId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRunResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRunResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Queries the title, status, pinning information, and the ID and status of the most recent run of a specified session.</p>
     * 
     * @param request the request parameters of GetSession  GetSessionRequest
     * @return GetSessionResponse
     */
    @Override
    public CompletableFuture<GetSessionResponse> getSession(GetSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("GetSession").setMethod(HttpMethod.GET).setPathRegex("/openapi/v1/agent/sessions/{sessionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query on the message timeline of a specified session. Use the returned nextToken to retrieve the next page.</p>
     * 
     * @param request the request parameters of ListMessages  ListMessagesRequest
     * @return ListMessagesResponse
     */
    @Override
    public CompletableFuture<ListMessagesResponse> listMessages(ListMessagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListMessages").setMethod(HttpMethod.GET).setPathRegex("/openapi/v1/agent/sessions/{sessionId}/messages").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListMessagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListMessagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Uses paging to query the list of sessions accessible to the current identity used to invoke. Use the returned nextToken to retrieve the next page.</p>
     * 
     * @param request the request parameters of ListSessions  ListSessionsRequest
     * @return ListSessionsResponse
     */
    @Override
    public CompletableFuture<ListSessionsResponse> listSessions(ListSessionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("ListSessions").setMethod(HttpMethod.GET).setPathRegex("/openapi/v1/agent/sessions").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSessionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSessionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Sends a message to a specified session, submits interrupt handling results, or reconnects to a specified run. Returns the run progress and results through a Server-Sent Events (SSE) event stream.</p>
     * 
     * @param request the request parameters of SendMessage  SendMessageRequest
     * @return SendMessageResponse
     */
    @Override
    public CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("SendMessage").setMethod(HttpMethod.POST).setPathRegex("/openapi/v1/agent/sessions/{sessionId}/messages").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendMessageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendMessageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public ResponseIterable<String> sendMessageWithResponseIterable(SendMessageRequest request) {
        this.handler.validateRequestModel(request);
        TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.SSE).setAction("SendMessage").setMethod(HttpMethod.POST).setPathRegex("/openapi/v1/agent/sessions/{sessionId}/messages").setBodyType(BodyType.STRING).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
        SendMessageResponseBodyIterator iterator = SendMessageResponseBodyIterator.create();
        ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withHttpResponseHandler(new SSEHttpResponseHandler(iterator));
        this.handler.execute(params);
        return new ResponseIterable<>(iterator);
    }

    /**
     * <b>description</b> :
     * <p>Enables or disables the read-only mode for the current account.</p>
     * 
     * @param request the request parameters of UpdateReadonlyMode  UpdateReadonlyModeRequest
     * @return UpdateReadonlyModeResponse
     */
    @Override
    public CompletableFuture<UpdateReadonlyModeResponse> updateReadonlyMode(UpdateReadonlyModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateReadonlyMode").setMethod(HttpMethod.PUT).setPathRegex("/openapi/v1/user/configs/readonly").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateReadonlyModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateReadonlyModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Updates the title or pinned status of a specified session. Specify at least one of the title and pinned fields. Unspecified fields remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateSession  UpdateSessionRequest
     * @return UpdateSessionResponse
     */
    @Override
    public CompletableFuture<UpdateSessionResponse> updateSession(UpdateSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RESTFUL).setAction("UpdateSession").setMethod(HttpMethod.PATCH).setPathRegex("/openapi/v1/agent/sessions/{sessionId}").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
