// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openagent20260801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.openagent20260801.models.*;
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
     * <p>Cancels a specified run and returns the run status after the cancellation.</p>
     * 
     * @param request the request parameters of CancelRun  CancelRunRequest
     * @return CancelRunResponse
     */
    CompletableFuture<CancelRunResponse> cancelRun(CancelRunRequest request);

    /**
     * <b>description</b> :
     * <p>Creates a session and returns the session information. Use the returned sessionId for subsequent operations such as sending messages, querying records, and updating the session.</p>
     * 
     * @param request the request parameters of CreateSession  CreateSessionRequest
     * @return CreateSessionResponse
     */
    CompletableFuture<CreateSessionResponse> createSession(CreateSessionRequest request);

    /**
     * <b>description</b> :
     * <p>Deletes a specified session. Returns 404 Session.NotFound if the session does not exist or has been deleted.</p>
     * 
     * @param request the request parameters of DeleteSession  DeleteSessionRequest
     * @return DeleteSessionResponse
     */
    CompletableFuture<DeleteSessionResponse> deleteSession(DeleteSessionRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the read-only mode switch for the current account. The read-only mode is enabled by default if it is not configured.</p>
     * 
     * @param request the request parameters of GetReadonlyMode  GetReadonlyModeRequest
     * @return GetReadonlyModeResponse
     */
    CompletableFuture<GetReadonlyModeResponse> getReadonlyMode(GetReadonlyModeRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the status and interrupt information of a specified run.</p>
     * 
     * @param request the request parameters of GetRun  GetRunRequest
     * @return GetRunResponse
     */
    CompletableFuture<GetRunResponse> getRun(GetRunRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the title, status, pinning information, and the ID and status of the most recent run of a specified session.</p>
     * 
     * @param request the request parameters of GetSession  GetSessionRequest
     * @return GetSessionResponse
     */
    CompletableFuture<GetSessionResponse> getSession(GetSessionRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a paging query on the message timeline of a specified session. Use the returned nextToken to retrieve the next page.</p>
     * 
     * @param request the request parameters of ListMessages  ListMessagesRequest
     * @return ListMessagesResponse
     */
    CompletableFuture<ListMessagesResponse> listMessages(ListMessagesRequest request);

    /**
     * <b>description</b> :
     * <p>Uses paging to query the list of sessions accessible to the current identity used to invoke. Use the returned nextToken to retrieve the next page.</p>
     * 
     * @param request the request parameters of ListSessions  ListSessionsRequest
     * @return ListSessionsResponse
     */
    CompletableFuture<ListSessionsResponse> listSessions(ListSessionsRequest request);

    /**
     * <b>description</b> :
     * <p>Sends a message to a specified session, submits interrupt handling results, or reconnects to a specified run. Returns the run progress and results through a Server-Sent Events (SSE) event stream.</p>
     * 
     * @param request the request parameters of SendMessage  SendMessageRequest
     * @return SendMessageResponse
     */
    CompletableFuture<SendMessageResponse> sendMessage(SendMessageRequest request);

    ResponseIterable<String> sendMessageWithResponseIterable(SendMessageRequest request);

    /**
     * <b>description</b> :
     * <p>Enables or disables the read-only mode for the current account.</p>
     * 
     * @param request the request parameters of UpdateReadonlyMode  UpdateReadonlyModeRequest
     * @return UpdateReadonlyModeResponse
     */
    CompletableFuture<UpdateReadonlyModeResponse> updateReadonlyMode(UpdateReadonlyModeRequest request);

    /**
     * <b>description</b> :
     * <p>Updates the title or pinned status of a specified session. Specify at least one of the title and pinned fields. Unspecified fields remain unchanged.</p>
     * 
     * @param request the request parameters of UpdateSession  UpdateSessionRequest
     * @return UpdateSessionResponse
     */
    CompletableFuture<UpdateSessionResponse> updateSession(UpdateSessionRequest request);

}
