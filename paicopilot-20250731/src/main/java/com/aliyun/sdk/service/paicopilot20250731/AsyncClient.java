// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paicopilot20250731;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.paicopilot20250731.models.*;
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
     * @param request the request parameters of CreateChat  CreateChatRequest
     * @return CreateChatResponse
     */
    CompletableFuture<CreateChatResponse> createChat(CreateChatRequest request);

    ResponseIterable<CreateChatResponseBody> createChatWithResponseIterable(CreateChatRequest request);

    /**
     * @param request the request parameters of CreateSession  CreateSessionRequest
     * @return CreateSessionResponse
     */
    CompletableFuture<CreateSessionResponse> createSession(CreateSessionRequest request);

    /**
     * @param request the request parameters of DeleteChat  DeleteChatRequest
     * @return DeleteChatResponse
     */
    CompletableFuture<DeleteChatResponse> deleteChat(DeleteChatRequest request);

    /**
     * @param request the request parameters of DeleteSession  DeleteSessionRequest
     * @return DeleteSessionResponse
     */
    CompletableFuture<DeleteSessionResponse> deleteSession(DeleteSessionRequest request);

    /**
     * @param request the request parameters of GetChat  GetChatRequest
     * @return GetChatResponse
     */
    CompletableFuture<GetChatResponse> getChat(GetChatRequest request);

    /**
     * @param request the request parameters of GetSession  GetSessionRequest
     * @return GetSessionResponse
     */
    CompletableFuture<GetSessionResponse> getSession(GetSessionRequest request);

    /**
     * @param request the request parameters of ListChats  ListChatsRequest
     * @return ListChatsResponse
     */
    CompletableFuture<ListChatsResponse> listChats(ListChatsRequest request);

    /**
     * @param request the request parameters of ListSessions  ListSessionsRequest
     * @return ListSessionsResponse
     */
    CompletableFuture<ListSessionsResponse> listSessions(ListSessionsRequest request);

    /**
     * @param request the request parameters of SearchInfo  SearchInfoRequest
     * @return SearchInfoResponse
     */
    CompletableFuture<SearchInfoResponse> searchInfo(SearchInfoRequest request);

}
