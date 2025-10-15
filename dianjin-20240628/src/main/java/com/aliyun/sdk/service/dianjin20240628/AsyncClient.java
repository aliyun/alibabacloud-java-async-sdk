// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dianjin20240628.models.*;
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
     * @param request the request parameters of CreateAnnualDocSummaryTask  CreateAnnualDocSummaryTaskRequest
     * @return CreateAnnualDocSummaryTaskResponse
     */
    CompletableFuture<CreateAnnualDocSummaryTaskResponse> createAnnualDocSummaryTask(CreateAnnualDocSummaryTaskRequest request);

    /**
     * @param request the request parameters of CreateDialog  CreateDialogRequest
     * @return CreateDialogResponse
     */
    CompletableFuture<CreateDialogResponse> createDialog(CreateDialogRequest request);

    /**
     * @param request the request parameters of CreateDialogAnalysisTask  CreateDialogAnalysisTaskRequest
     * @return CreateDialogAnalysisTaskResponse
     */
    CompletableFuture<CreateDialogAnalysisTaskResponse> createDialogAnalysisTask(CreateDialogAnalysisTaskRequest request);

    /**
     * @param request the request parameters of CreateDocsSummaryTask  CreateDocsSummaryTaskRequest
     * @return CreateDocsSummaryTaskResponse
     */
    CompletableFuture<CreateDocsSummaryTaskResponse> createDocsSummaryTask(CreateDocsSummaryTaskRequest request);

    /**
     * @param request the request parameters of CreateFinReportSummaryTask  CreateFinReportSummaryTaskRequest
     * @return CreateFinReportSummaryTaskResponse
     */
    CompletableFuture<CreateFinReportSummaryTaskResponse> createFinReportSummaryTask(CreateFinReportSummaryTaskRequest request);

    /**
     * @param request the request parameters of CreateLibrary  CreateLibraryRequest
     * @return CreateLibraryResponse
     */
    CompletableFuture<CreateLibraryResponse> createLibrary(CreateLibraryRequest request);

    /**
     * @param request the request parameters of CreatePdfTranslateTask  CreatePdfTranslateTaskRequest
     * @return CreatePdfTranslateTaskResponse
     */
    CompletableFuture<CreatePdfTranslateTaskResponse> createPdfTranslateTask(CreatePdfTranslateTaskRequest request);

    /**
     * @param request the request parameters of CreatePredefinedDocument  CreatePredefinedDocumentRequest
     * @return CreatePredefinedDocumentResponse
     */
    CompletableFuture<CreatePredefinedDocumentResponse> createPredefinedDocument(CreatePredefinedDocumentRequest request);

    /**
     * @param request the request parameters of CreateQualityCheckTask  CreateQualityCheckTaskRequest
     * @return CreateQualityCheckTaskResponse
     */
    CompletableFuture<CreateQualityCheckTaskResponse> createQualityCheckTask(CreateQualityCheckTaskRequest request);

    /**
     * @param request the request parameters of DeleteDocument  DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    CompletableFuture<DeleteDocumentResponse> deleteDocument(DeleteDocumentRequest request);

    /**
     * @param request the request parameters of DeleteLibrary  DeleteLibraryRequest
     * @return DeleteLibraryResponse
     */
    CompletableFuture<DeleteLibraryResponse> deleteLibrary(DeleteLibraryRequest request);

    /**
     * @param request the request parameters of EvictTask  EvictTaskRequest
     * @return EvictTaskResponse
     */
    CompletableFuture<EvictTaskResponse> evictTask(EvictTaskRequest request);

    /**
     * @param request the request parameters of GenDocQaResult  GenDocQaResultRequest
     * @return GenDocQaResultResponse
     */
    CompletableFuture<GenDocQaResultResponse> genDocQaResult(GenDocQaResultRequest request);

    /**
     * @param request the request parameters of GetAppConfig  GetAppConfigRequest
     * @return GetAppConfigResponse
     */
    CompletableFuture<GetAppConfigResponse> getAppConfig(GetAppConfigRequest request);

    /**
     * @param request the request parameters of GetChatQuestionResp  GetChatQuestionRespRequest
     * @return GetChatQuestionRespResponse
     */
    CompletableFuture<GetChatQuestionRespResponse> getChatQuestionResp(GetChatQuestionRespRequest request);

    /**
     * @param request the request parameters of GetDialogAnalysisResult  GetDialogAnalysisResultRequest
     * @return GetDialogAnalysisResultResponse
     */
    CompletableFuture<GetDialogAnalysisResultResponse> getDialogAnalysisResult(GetDialogAnalysisResultRequest request);

    /**
     * @param request the request parameters of GetDialogDetail  GetDialogDetailRequest
     * @return GetDialogDetailResponse
     */
    CompletableFuture<GetDialogDetailResponse> getDialogDetail(GetDialogDetailRequest request);

    /**
     * @param request the request parameters of GetDialogLog  GetDialogLogRequest
     * @return GetDialogLogResponse
     */
    CompletableFuture<GetDialogLogResponse> getDialogLog(GetDialogLogRequest request);

    /**
     * @param request the request parameters of GetDocumentChunkList  GetDocumentChunkListRequest
     * @return GetDocumentChunkListResponse
     */
    CompletableFuture<GetDocumentChunkListResponse> getDocumentChunkList(GetDocumentChunkListRequest request);

    /**
     * @param request the request parameters of GetDocumentList  GetDocumentListRequest
     * @return GetDocumentListResponse
     */
    CompletableFuture<GetDocumentListResponse> getDocumentList(GetDocumentListRequest request);

    /**
     * @param request the request parameters of GetDocumentUrl  GetDocumentUrlRequest
     * @return GetDocumentUrlResponse
     */
    CompletableFuture<GetDocumentUrlResponse> getDocumentUrl(GetDocumentUrlRequest request);

    /**
     * @param request the request parameters of GetFilterDocumentList  GetFilterDocumentListRequest
     * @return GetFilterDocumentListResponse
     */
    CompletableFuture<GetFilterDocumentListResponse> getFilterDocumentList(GetFilterDocumentListRequest request);

    /**
     * @param request the request parameters of GetHistoryListByBizType  GetHistoryListByBizTypeRequest
     * @return GetHistoryListByBizTypeResponse
     */
    CompletableFuture<GetHistoryListByBizTypeResponse> getHistoryListByBizType(GetHistoryListByBizTypeRequest request);

    /**
     * @param request the request parameters of GetLibrary  GetLibraryRequest
     * @return GetLibraryResponse
     */
    CompletableFuture<GetLibraryResponse> getLibrary(GetLibraryRequest request);

    /**
     * @param request the request parameters of GetLibraryList  GetLibraryListRequest
     * @return GetLibraryListResponse
     */
    CompletableFuture<GetLibraryListResponse> getLibraryList(GetLibraryListRequest request);

    /**
     * @param request the request parameters of GetParseResult  GetParseResultRequest
     * @return GetParseResultResponse
     */
    CompletableFuture<GetParseResultResponse> getParseResult(GetParseResultRequest request);

    /**
     * @param request the request parameters of GetQualityCheckTaskResult  GetQualityCheckTaskResultRequest
     * @return GetQualityCheckTaskResultResponse
     */
    CompletableFuture<GetQualityCheckTaskResultResponse> getQualityCheckTaskResult(GetQualityCheckTaskResultRequest request);

    /**
     * @param request the request parameters of GetSummaryTaskResult  GetSummaryTaskResultRequest
     * @return GetSummaryTaskResultResponse
     */
    CompletableFuture<GetSummaryTaskResultResponse> getSummaryTaskResult(GetSummaryTaskResultRequest request);

    /**
     * @param request the request parameters of GetTaskResult  GetTaskResultRequest
     * @return GetTaskResultResponse
     */
    CompletableFuture<GetTaskResultResponse> getTaskResult(GetTaskResultRequest request);

    /**
     * @param request the request parameters of GetTaskStatus  GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    CompletableFuture<GetTaskStatusResponse> getTaskStatus(GetTaskStatusRequest request);

    /**
     * @param request the request parameters of InvokePlugin  InvokePluginRequest
     * @return InvokePluginResponse
     */
    CompletableFuture<InvokePluginResponse> invokePlugin(InvokePluginRequest request);

    /**
     * @param request the request parameters of PreviewDocument  PreviewDocumentRequest
     * @return PreviewDocumentResponse
     */
    CompletableFuture<PreviewDocumentResponse> previewDocument(PreviewDocumentRequest request);

    /**
     * @param request the request parameters of ReIndex  ReIndexRequest
     * @return ReIndexResponse
     */
    CompletableFuture<ReIndexResponse> reIndex(ReIndexRequest request);

    /**
     * @param request the request parameters of RealTimeDialog  RealTimeDialogRequest
     * @return RealTimeDialogResponse
     */
    CompletableFuture<RealTimeDialogResponse> realTimeDialog(RealTimeDialogRequest request);

    ResponseIterable<RealTimeDialogResponseBody> realTimeDialogWithResponseIterable(RealTimeDialogRequest request);

    /**
     * @param request the request parameters of RealtimeDialogAssist  RealtimeDialogAssistRequest
     * @return RealtimeDialogAssistResponse
     */
    CompletableFuture<RealtimeDialogAssistResponse> realtimeDialogAssist(RealtimeDialogAssistRequest request);

    /**
     * @param request the request parameters of RebuildTask  RebuildTaskRequest
     * @return RebuildTaskResponse
     */
    CompletableFuture<RebuildTaskResponse> rebuildTask(RebuildTaskRequest request);

    /**
     * @param request the request parameters of RecallDocument  RecallDocumentRequest
     * @return RecallDocumentResponse
     */
    CompletableFuture<RecallDocumentResponse> recallDocument(RecallDocumentRequest request);

    /**
     * @param request the request parameters of RecognizeIntention  RecognizeIntentionRequest
     * @return RecognizeIntentionResponse
     */
    CompletableFuture<RecognizeIntentionResponse> recognizeIntention(RecognizeIntentionRequest request);

    /**
     * @param request the request parameters of RunAgent  RunAgentRequest
     * @return RunAgentResponse
     */
    CompletableFuture<RunAgentResponse> runAgent(RunAgentRequest request);

<ReturnT> CompletableFuture<ReturnT> runAgentWithAsyncResponseHandler(RunAgentRequest request, AsyncResponseHandler<RunAgentResponse, ReturnT> responseHandler);

    ResponseIterable<RunAgentResponseBody> runAgentWithResponseIterable(RunAgentRequest request);

    /**
     * @param request the request parameters of RunChatResultGeneration  RunChatResultGenerationRequest
     * @return RunChatResultGenerationResponse
     */
    CompletableFuture<RunChatResultGenerationResponse> runChatResultGeneration(RunChatResultGenerationRequest request);

    ResponseIterable<RunChatResultGenerationResponseBody> runChatResultGenerationWithResponseIterable(RunChatResultGenerationRequest request);

    /**
     * @param request the request parameters of RunDialogAnalysis  RunDialogAnalysisRequest
     * @return RunDialogAnalysisResponse
     */
    CompletableFuture<RunDialogAnalysisResponse> runDialogAnalysis(RunDialogAnalysisRequest request);

<ReturnT> CompletableFuture<ReturnT> runDialogAnalysisWithAsyncResponseHandler(RunDialogAnalysisRequest request, AsyncResponseHandler<RunDialogAnalysisResponse, ReturnT> responseHandler);

    ResponseIterable<RunDialogAnalysisResponseBody> runDialogAnalysisWithResponseIterable(RunDialogAnalysisRequest request);

    /**
     * @param request the request parameters of RunLibraryChatGeneration  RunLibraryChatGenerationRequest
     * @return RunLibraryChatGenerationResponse
     */
    CompletableFuture<RunLibraryChatGenerationResponse> runLibraryChatGeneration(RunLibraryChatGenerationRequest request);

    ResponseIterable<RunLibraryChatGenerationResponseBody> runLibraryChatGenerationWithResponseIterable(RunLibraryChatGenerationRequest request);

    /**
     * @param request the request parameters of SubmitChatQuestion  SubmitChatQuestionRequest
     * @return SubmitChatQuestionResponse
     */
    CompletableFuture<SubmitChatQuestionResponse> submitChatQuestion(SubmitChatQuestionRequest request);

    /**
     * @param request the request parameters of UpdateDocument  UpdateDocumentRequest
     * @return UpdateDocumentResponse
     */
    CompletableFuture<UpdateDocumentResponse> updateDocument(UpdateDocumentRequest request);

    /**
     * @param request the request parameters of UpdateDocumentChunk  UpdateDocumentChunkRequest
     * @return UpdateDocumentChunkResponse
     */
    CompletableFuture<UpdateDocumentChunkResponse> updateDocumentChunk(UpdateDocumentChunkRequest request);

    /**
     * @param request the request parameters of UpdateLibrary  UpdateLibraryRequest
     * @return UpdateLibraryResponse
     */
    CompletableFuture<UpdateLibraryResponse> updateLibrary(UpdateLibraryRequest request);

    /**
     * @param request the request parameters of UpdateQaLibrary  UpdateQaLibraryRequest
     * @return UpdateQaLibraryResponse
     */
    CompletableFuture<UpdateQaLibraryResponse> updateQaLibrary(UpdateQaLibraryRequest request);

}
