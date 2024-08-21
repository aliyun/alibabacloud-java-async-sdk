// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.contactcenterai20240603.models.*;
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

    CompletableFuture<AnalyzeConversationResponse> analyzeConversation(AnalyzeConversationRequest request);

<ReturnT> CompletableFuture<ReturnT> analyzeConversationWithAsyncResponseHandler(AnalyzeConversationRequest request, AsyncResponseHandler<AnalyzeConversationResponse, ReturnT> responseHandler);

    ResponseIterable<AnalyzeConversationResponseBody> analyzeConversationWithResponseIterable(AnalyzeConversationRequest request);

    CompletableFuture<RunCompletionResponse> runCompletion(RunCompletionRequest request);

    ResponseIterable<RunCompletionResponseBody> runCompletionWithResponseIterable(RunCompletionRequest request);

    CompletableFuture<RunCompletionMessageResponse> runCompletionMessage(RunCompletionMessageRequest request);

    ResponseIterable<RunCompletionMessageResponseBody> runCompletionMessageWithResponseIterable(RunCompletionMessageRequest request);

}
