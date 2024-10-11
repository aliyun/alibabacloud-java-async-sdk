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

    /**
     * @param request the request parameters of AnalyzeConversation  AnalyzeConversationRequest
     * @return AnalyzeConversationResponse
     */
    CompletableFuture<AnalyzeConversationResponse> analyzeConversation(AnalyzeConversationRequest request);

<ReturnT> CompletableFuture<ReturnT> analyzeConversationWithAsyncResponseHandler(AnalyzeConversationRequest request, AsyncResponseHandler<AnalyzeConversationResponse, ReturnT> responseHandler);

    ResponseIterable<AnalyzeConversationResponseBody> analyzeConversationWithResponseIterable(AnalyzeConversationRequest request);

    /**
     * @param request the request parameters of CreateConversationAnalysisTask  CreateConversationAnalysisTaskRequest
     * @return CreateConversationAnalysisTaskResponse
     */
    CompletableFuture<CreateConversationAnalysisTaskResponse> createConversationAnalysisTask(CreateConversationAnalysisTaskRequest request);

    /**
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    /**
     * @param request the request parameters of GetTaskResult  GetTaskResultRequest
     * @return GetTaskResultResponse
     */
    CompletableFuture<GetTaskResultResponse> getTaskResult(GetTaskResultRequest request);

    /**
     * @param request the request parameters of RunCompletion  RunCompletionRequest
     * @return RunCompletionResponse
     */
    CompletableFuture<RunCompletionResponse> runCompletion(RunCompletionRequest request);

    ResponseIterable<RunCompletionResponseBody> runCompletionWithResponseIterable(RunCompletionRequest request);

    /**
     * @param request the request parameters of RunCompletionMessage  RunCompletionMessageRequest
     * @return RunCompletionMessageResponse
     */
    CompletableFuture<RunCompletionMessageResponse> runCompletionMessage(RunCompletionMessageRequest request);

    ResponseIterable<RunCompletionMessageResponseBody> runCompletionMessageWithResponseIterable(RunCompletionMessageRequest request);

}
