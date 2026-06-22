// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafkakopilot20260414;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alikafkakopilot20260414.models.*;
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
     * @param request the request parameters of KopilotChatStream  KopilotChatStreamRequest
     * @return KopilotChatStreamResponse
     */
    CompletableFuture<KopilotChatStreamResponse> kopilotChatStream(KopilotChatStreamRequest request);

    ResponseIterable<KopilotChatStreamResponseBody> kopilotChatStreamWithResponseIterable(KopilotChatStreamRequest request);

    /**
     * @param request the request parameters of KopilotFeedback  KopilotFeedbackRequest
     * @return KopilotFeedbackResponse
     */
    CompletableFuture<KopilotFeedbackResponse> kopilotFeedback(KopilotFeedbackRequest request);

    /**
     * @param request the request parameters of KopilotListConversationChatMessages  KopilotListConversationChatMessagesRequest
     * @return KopilotListConversationChatMessagesResponse
     */
    CompletableFuture<KopilotListConversationChatMessagesResponse> kopilotListConversationChatMessages(KopilotListConversationChatMessagesRequest request);

    /**
     * @param request the request parameters of KopilotListConversations  KopilotListConversationsRequest
     * @return KopilotListConversationsResponse
     */
    CompletableFuture<KopilotListConversationsResponse> kopilotListConversations(KopilotListConversationsRequest request);

    /**
     * @param request the request parameters of KopilotQueryStatus  KopilotQueryStatusRequest
     * @return KopilotQueryStatusResponse
     */
    CompletableFuture<KopilotQueryStatusResponse> kopilotQueryStatus(KopilotQueryStatusRequest request);

}
