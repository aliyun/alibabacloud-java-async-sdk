// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.quanmiaolightapp20240801.models.*;
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
     * @param request the request parameters of GenerateBroadcastNews  GenerateBroadcastNewsRequest
     * @return GenerateBroadcastNewsResponse
     */
    CompletableFuture<GenerateBroadcastNewsResponse> generateBroadcastNews(GenerateBroadcastNewsRequest request);

    /**
     * @param request the request parameters of ListHotTopicSummaries  ListHotTopicSummariesRequest
     * @return ListHotTopicSummariesResponse
     */
    CompletableFuture<ListHotTopicSummariesResponse> listHotTopicSummaries(ListHotTopicSummariesRequest request);

    /**
     * @param request the request parameters of RunCommentGeneration  RunCommentGenerationRequest
     * @return RunCommentGenerationResponse
     */
    CompletableFuture<RunCommentGenerationResponse> runCommentGeneration(RunCommentGenerationRequest request);

<ReturnT> CompletableFuture<ReturnT> runCommentGenerationWithAsyncResponseHandler(RunCommentGenerationRequest request, AsyncResponseHandler<RunCommentGenerationResponse, ReturnT> responseHandler);

    ResponseIterable<RunCommentGenerationResponseBody> runCommentGenerationWithResponseIterable(RunCommentGenerationRequest request);

    /**
     * @param request the request parameters of RunHotTopicChat  RunHotTopicChatRequest
     * @return RunHotTopicChatResponse
     */
    CompletableFuture<RunHotTopicChatResponse> runHotTopicChat(RunHotTopicChatRequest request);

<ReturnT> CompletableFuture<ReturnT> runHotTopicChatWithAsyncResponseHandler(RunHotTopicChatRequest request, AsyncResponseHandler<RunHotTopicChatResponse, ReturnT> responseHandler);

    ResponseIterable<RunHotTopicChatResponseBody> runHotTopicChatWithResponseIterable(RunHotTopicChatRequest request);

    /**
     * @param request the request parameters of RunHotTopicSummary  RunHotTopicSummaryRequest
     * @return RunHotTopicSummaryResponse
     */
    CompletableFuture<RunHotTopicSummaryResponse> runHotTopicSummary(RunHotTopicSummaryRequest request);

<ReturnT> CompletableFuture<ReturnT> runHotTopicSummaryWithAsyncResponseHandler(RunHotTopicSummaryRequest request, AsyncResponseHandler<RunHotTopicSummaryResponse, ReturnT> responseHandler);

    ResponseIterable<RunHotTopicSummaryResponseBody> runHotTopicSummaryWithResponseIterable(RunHotTopicSummaryRequest request);

    /**
     * @param request the request parameters of RunMarketingInformationExtract  RunMarketingInformationExtractRequest
     * @return RunMarketingInformationExtractResponse
     */
    CompletableFuture<RunMarketingInformationExtractResponse> runMarketingInformationExtract(RunMarketingInformationExtractRequest request);

<ReturnT> CompletableFuture<ReturnT> runMarketingInformationExtractWithAsyncResponseHandler(RunMarketingInformationExtractRequest request, AsyncResponseHandler<RunMarketingInformationExtractResponse, ReturnT> responseHandler);

    ResponseIterable<RunMarketingInformationExtractResponseBody> runMarketingInformationExtractWithResponseIterable(RunMarketingInformationExtractRequest request);

    /**
     * @param request the request parameters of RunMarketingInformationWriting  RunMarketingInformationWritingRequest
     * @return RunMarketingInformationWritingResponse
     */
    CompletableFuture<RunMarketingInformationWritingResponse> runMarketingInformationWriting(RunMarketingInformationWritingRequest request);

<ReturnT> CompletableFuture<ReturnT> runMarketingInformationWritingWithAsyncResponseHandler(RunMarketingInformationWritingRequest request, AsyncResponseHandler<RunMarketingInformationWritingResponse, ReturnT> responseHandler);

    ResponseIterable<RunMarketingInformationWritingResponseBody> runMarketingInformationWritingWithResponseIterable(RunMarketingInformationWritingRequest request);

    /**
     * @param request the request parameters of RunScriptContinue  RunScriptContinueRequest
     * @return RunScriptContinueResponse
     */
    CompletableFuture<RunScriptContinueResponse> runScriptContinue(RunScriptContinueRequest request);

<ReturnT> CompletableFuture<ReturnT> runScriptContinueWithAsyncResponseHandler(RunScriptContinueRequest request, AsyncResponseHandler<RunScriptContinueResponse, ReturnT> responseHandler);

    ResponseIterable<RunScriptContinueResponseBody> runScriptContinueWithResponseIterable(RunScriptContinueRequest request);

    /**
     * @param request the request parameters of RunScriptPlanning  RunScriptPlanningRequest
     * @return RunScriptPlanningResponse
     */
    CompletableFuture<RunScriptPlanningResponse> runScriptPlanning(RunScriptPlanningRequest request);

<ReturnT> CompletableFuture<ReturnT> runScriptPlanningWithAsyncResponseHandler(RunScriptPlanningRequest request, AsyncResponseHandler<RunScriptPlanningResponse, ReturnT> responseHandler);

    ResponseIterable<RunScriptPlanningResponseBody> runScriptPlanningWithResponseIterable(RunScriptPlanningRequest request);

    /**
     * @param request the request parameters of RunStyleWriting  RunStyleWritingRequest
     * @return RunStyleWritingResponse
     */
    CompletableFuture<RunStyleWritingResponse> runStyleWriting(RunStyleWritingRequest request);

<ReturnT> CompletableFuture<ReturnT> runStyleWritingWithAsyncResponseHandler(RunStyleWritingRequest request, AsyncResponseHandler<RunStyleWritingResponse, ReturnT> responseHandler);

    ResponseIterable<RunStyleWritingResponseBody> runStyleWritingWithResponseIterable(RunStyleWritingRequest request);

    /**
     * @param request the request parameters of RunVideoAnalysis  RunVideoAnalysisRequest
     * @return RunVideoAnalysisResponse
     */
    CompletableFuture<RunVideoAnalysisResponse> runVideoAnalysis(RunVideoAnalysisRequest request);

<ReturnT> CompletableFuture<ReturnT> runVideoAnalysisWithAsyncResponseHandler(RunVideoAnalysisRequest request, AsyncResponseHandler<RunVideoAnalysisResponse, ReturnT> responseHandler);

    ResponseIterable<RunVideoAnalysisResponseBody> runVideoAnalysisWithResponseIterable(RunVideoAnalysisRequest request);

}
