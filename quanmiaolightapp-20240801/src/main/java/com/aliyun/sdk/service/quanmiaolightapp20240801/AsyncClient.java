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
     * @param request the request parameters of GenerateOutputFormat  GenerateOutputFormatRequest
     * @return GenerateOutputFormatResponse
     */
    CompletableFuture<GenerateOutputFormatResponse> generateOutputFormat(GenerateOutputFormatRequest request);

    /**
     * @param request the request parameters of GetVideoAnalysisConfig  GetVideoAnalysisConfigRequest
     * @return GetVideoAnalysisConfigResponse
     */
    CompletableFuture<GetVideoAnalysisConfigResponse> getVideoAnalysisConfig(GetVideoAnalysisConfigRequest request);

    /**
     * @param request the request parameters of GetVideoAnalysisTask  GetVideoAnalysisTaskRequest
     * @return GetVideoAnalysisTaskResponse
     */
    CompletableFuture<GetVideoAnalysisTaskResponse> getVideoAnalysisTask(GetVideoAnalysisTaskRequest request);

    /**
     * @param request the request parameters of ListHotTopicSummaries  ListHotTopicSummariesRequest
     * @return ListHotTopicSummariesResponse
     */
    CompletableFuture<ListHotTopicSummariesResponse> listHotTopicSummaries(ListHotTopicSummariesRequest request);

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
     * @param request the request parameters of RunScriptChat  RunScriptChatRequest
     * @return RunScriptChatResponse
     */
    CompletableFuture<RunScriptChatResponse> runScriptChat(RunScriptChatRequest request);

<ReturnT> CompletableFuture<ReturnT> runScriptChatWithAsyncResponseHandler(RunScriptChatRequest request, AsyncResponseHandler<RunScriptChatResponse, ReturnT> responseHandler);

    ResponseIterable<RunScriptChatResponseBody> runScriptChatWithResponseIterable(RunScriptChatRequest request);

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
     * @param request the request parameters of RunScriptRefine  RunScriptRefineRequest
     * @return RunScriptRefineResponse
     */
    CompletableFuture<RunScriptRefineResponse> runScriptRefine(RunScriptRefineRequest request);

<ReturnT> CompletableFuture<ReturnT> runScriptRefineWithAsyncResponseHandler(RunScriptRefineRequest request, AsyncResponseHandler<RunScriptRefineResponse, ReturnT> responseHandler);

    ResponseIterable<RunScriptRefineResponseBody> runScriptRefineWithResponseIterable(RunScriptRefineRequest request);

    /**
     * @param request the request parameters of RunStyleWriting  RunStyleWritingRequest
     * @return RunStyleWritingResponse
     */
    CompletableFuture<RunStyleWritingResponse> runStyleWriting(RunStyleWritingRequest request);

<ReturnT> CompletableFuture<ReturnT> runStyleWritingWithAsyncResponseHandler(RunStyleWritingRequest request, AsyncResponseHandler<RunStyleWritingResponse, ReturnT> responseHandler);

    ResponseIterable<RunStyleWritingResponseBody> runStyleWritingWithResponseIterable(RunStyleWritingRequest request);

    /**
     * @param request the request parameters of RunTagMiningAnalysis  RunTagMiningAnalysisRequest
     * @return RunTagMiningAnalysisResponse
     */
    CompletableFuture<RunTagMiningAnalysisResponse> runTagMiningAnalysis(RunTagMiningAnalysisRequest request);

<ReturnT> CompletableFuture<ReturnT> runTagMiningAnalysisWithAsyncResponseHandler(RunTagMiningAnalysisRequest request, AsyncResponseHandler<RunTagMiningAnalysisResponse, ReturnT> responseHandler);

    ResponseIterable<RunTagMiningAnalysisResponseBody> runTagMiningAnalysisWithResponseIterable(RunTagMiningAnalysisRequest request);

    /**
     * @param request the request parameters of RunVideoAnalysis  RunVideoAnalysisRequest
     * @return RunVideoAnalysisResponse
     */
    CompletableFuture<RunVideoAnalysisResponse> runVideoAnalysis(RunVideoAnalysisRequest request);

<ReturnT> CompletableFuture<ReturnT> runVideoAnalysisWithAsyncResponseHandler(RunVideoAnalysisRequest request, AsyncResponseHandler<RunVideoAnalysisResponse, ReturnT> responseHandler);

    ResponseIterable<RunVideoAnalysisResponseBody> runVideoAnalysisWithResponseIterable(RunVideoAnalysisRequest request);

    /**
     * @param request the request parameters of SubmitVideoAnalysisTask  SubmitVideoAnalysisTaskRequest
     * @return SubmitVideoAnalysisTaskResponse
     */
    CompletableFuture<SubmitVideoAnalysisTaskResponse> submitVideoAnalysisTask(SubmitVideoAnalysisTaskRequest request);

    /**
     * @param request the request parameters of UpdateVideoAnalysisConfig  UpdateVideoAnalysisConfigRequest
     * @return UpdateVideoAnalysisConfigResponse
     */
    CompletableFuture<UpdateVideoAnalysisConfigResponse> updateVideoAnalysisConfig(UpdateVideoAnalysisConfigRequest request);

}
