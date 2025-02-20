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
     * @param request the request parameters of AnalyzeImage  AnalyzeImageRequest
     * @return AnalyzeImageResponse
     */
    CompletableFuture<AnalyzeImageResponse> analyzeImage(AnalyzeImageRequest request);

    ResponseIterable<AnalyzeImageResponseBody> analyzeImageWithResponseIterable(AnalyzeImageRequest request);

    /**
     * @param request the request parameters of CreateTask  CreateTaskRequest
     * @return CreateTaskResponse
     */
    CompletableFuture<CreateTaskResponse> createTask(CreateTaskRequest request);

    /**
     * @param request the request parameters of CreateVocab  CreateVocabRequest
     * @return CreateVocabResponse
     */
    CompletableFuture<CreateVocabResponse> createVocab(CreateVocabRequest request);

    /**
     * @param request the request parameters of DeleteVocab  DeleteVocabRequest
     * @return DeleteVocabResponse
     */
    CompletableFuture<DeleteVocabResponse> deleteVocab(DeleteVocabRequest request);

    /**
     * @param request the request parameters of GetTaskResult  GetTaskResultRequest
     * @return GetTaskResultResponse
     */
    CompletableFuture<GetTaskResultResponse> getTaskResult(GetTaskResultRequest request);

    /**
     * @param request the request parameters of GetVocab  GetVocabRequest
     * @return GetVocabResponse
     */
    CompletableFuture<GetVocabResponse> getVocab(GetVocabRequest request);

    /**
     * @param request the request parameters of ListVocab  ListVocabRequest
     * @return ListVocabResponse
     */
    CompletableFuture<ListVocabResponse> listVocab(ListVocabRequest request);

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

    /**
     * @param request the request parameters of UpdateVocab  UpdateVocabRequest
     * @return UpdateVocabResponse
     */
    CompletableFuture<UpdateVocabResponse> updateVocab(UpdateVocabRequest request);

}
