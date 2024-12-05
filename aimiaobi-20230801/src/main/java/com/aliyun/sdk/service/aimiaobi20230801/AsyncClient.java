// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aimiaobi20230801.models.*;
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
     * @param request the request parameters of CancelAsyncTask  CancelAsyncTaskRequest
     * @return CancelAsyncTaskResponse
     */
    CompletableFuture<CancelAsyncTaskResponse> cancelAsyncTask(CancelAsyncTaskRequest request);

    /**
     * @param request the request parameters of ClearIntervenes  ClearIntervenesRequest
     * @return ClearIntervenesResponse
     */
    CompletableFuture<ClearIntervenesResponse> clearIntervenes(ClearIntervenesRequest request);

    /**
     * @param request the request parameters of CreateGeneratedContent  CreateGeneratedContentRequest
     * @return CreateGeneratedContentResponse
     */
    CompletableFuture<CreateGeneratedContentResponse> createGeneratedContent(CreateGeneratedContentRequest request);

    /**
     * @param request the request parameters of CreateToken  CreateTokenRequest
     * @return CreateTokenResponse
     */
    CompletableFuture<CreateTokenResponse> createToken(CreateTokenRequest request);

    /**
     * @param request the request parameters of DeleteCustomText  DeleteCustomTextRequest
     * @return DeleteCustomTextResponse
     */
    CompletableFuture<DeleteCustomTextResponse> deleteCustomText(DeleteCustomTextRequest request);

    /**
     * @param request the request parameters of DeleteCustomTopicByTopic  DeleteCustomTopicByTopicRequest
     * @return DeleteCustomTopicByTopicResponse
     */
    CompletableFuture<DeleteCustomTopicByTopicResponse> deleteCustomTopicByTopic(DeleteCustomTopicByTopicRequest request);

    /**
     * @param request the request parameters of DeleteCustomTopicViewPointById  DeleteCustomTopicViewPointByIdRequest
     * @return DeleteCustomTopicViewPointByIdResponse
     */
    CompletableFuture<DeleteCustomTopicViewPointByIdResponse> deleteCustomTopicViewPointById(DeleteCustomTopicViewPointByIdRequest request);

    /**
     * @param request the request parameters of DeleteGeneratedContent  DeleteGeneratedContentRequest
     * @return DeleteGeneratedContentResponse
     */
    CompletableFuture<DeleteGeneratedContentResponse> deleteGeneratedContent(DeleteGeneratedContentRequest request);

    /**
     * @param request the request parameters of DeleteInterveneRule  DeleteInterveneRuleRequest
     * @return DeleteInterveneRuleResponse
     */
    CompletableFuture<DeleteInterveneRuleResponse> deleteInterveneRule(DeleteInterveneRuleRequest request);

    /**
     * @param request the request parameters of DeleteMaterialById  DeleteMaterialByIdRequest
     * @return DeleteMaterialByIdResponse
     */
    CompletableFuture<DeleteMaterialByIdResponse> deleteMaterialById(DeleteMaterialByIdRequest request);

    /**
     * @param request the request parameters of DocumentExtraction  DocumentExtractionRequest
     * @return DocumentExtractionResponse
     */
    CompletableFuture<DocumentExtractionResponse> documentExtraction(DocumentExtractionRequest request);

    /**
     * @param request the request parameters of ExportGeneratedContent  ExportGeneratedContentRequest
     * @return ExportGeneratedContentResponse
     */
    CompletableFuture<ExportGeneratedContentResponse> exportGeneratedContent(ExportGeneratedContentRequest request);

    /**
     * @param request the request parameters of ExportHotTopicPlanningProposals  ExportHotTopicPlanningProposalsRequest
     * @return ExportHotTopicPlanningProposalsResponse
     */
    CompletableFuture<ExportHotTopicPlanningProposalsResponse> exportHotTopicPlanningProposals(ExportHotTopicPlanningProposalsRequest request);

    /**
     * @param request the request parameters of ExportIntervenes  ExportIntervenesRequest
     * @return ExportIntervenesResponse
     */
    CompletableFuture<ExportIntervenesResponse> exportIntervenes(ExportIntervenesRequest request);

    /**
     * @param request the request parameters of FeedbackDialogue  FeedbackDialogueRequest
     * @return FeedbackDialogueResponse
     */
    CompletableFuture<FeedbackDialogueResponse> feedbackDialogue(FeedbackDialogueRequest request);

    /**
     * @param request the request parameters of FetchImageTask  FetchImageTaskRequest
     * @return FetchImageTaskResponse
     */
    CompletableFuture<FetchImageTaskResponse> fetchImageTask(FetchImageTaskRequest request);

    /**
     * @param request the request parameters of GenerateFileUrlByKey  GenerateFileUrlByKeyRequest
     * @return GenerateFileUrlByKeyResponse
     */
    CompletableFuture<GenerateFileUrlByKeyResponse> generateFileUrlByKey(GenerateFileUrlByKeyRequest request);

    /**
     * @param request the request parameters of GenerateImageTask  GenerateImageTaskRequest
     * @return GenerateImageTaskResponse
     */
    CompletableFuture<GenerateImageTaskResponse> generateImageTask(GenerateImageTaskRequest request);

    /**
     * @param request the request parameters of GenerateUploadConfig  GenerateUploadConfigRequest
     * @return GenerateUploadConfigResponse
     */
    CompletableFuture<GenerateUploadConfigResponse> generateUploadConfig(GenerateUploadConfigRequest request);

    /**
     * @param request the request parameters of GenerateViewPoint  GenerateViewPointRequest
     * @return GenerateViewPointResponse
     */
    CompletableFuture<GenerateViewPointResponse> generateViewPoint(GenerateViewPointRequest request);

    /**
     * @param request the request parameters of GetCategoriesByTaskId  GetCategoriesByTaskIdRequest
     * @return GetCategoriesByTaskIdResponse
     */
    CompletableFuture<GetCategoriesByTaskIdResponse> getCategoriesByTaskId(GetCategoriesByTaskIdRequest request);

    /**
     * @param request the request parameters of GetCustomHotTopicBroadcastJob  GetCustomHotTopicBroadcastJobRequest
     * @return GetCustomHotTopicBroadcastJobResponse
     */
    CompletableFuture<GetCustomHotTopicBroadcastJobResponse> getCustomHotTopicBroadcastJob(GetCustomHotTopicBroadcastJobRequest request);

    /**
     * @param request the request parameters of GetCustomText  GetCustomTextRequest
     * @return GetCustomTextResponse
     */
    CompletableFuture<GetCustomTextResponse> getCustomText(GetCustomTextRequest request);

    /**
     * @param request the request parameters of GetCustomTopicSelectionPerspectiveAnalysisTask  GetCustomTopicSelectionPerspectiveAnalysisTaskRequest
     * @return GetCustomTopicSelectionPerspectiveAnalysisTaskResponse
     */
    CompletableFuture<GetCustomTopicSelectionPerspectiveAnalysisTaskResponse> getCustomTopicSelectionPerspectiveAnalysisTask(GetCustomTopicSelectionPerspectiveAnalysisTaskRequest request);

    /**
     * @param request the request parameters of GetDataSourceOrderConfig  GetDataSourceOrderConfigRequest
     * @return GetDataSourceOrderConfigResponse
     */
    CompletableFuture<GetDataSourceOrderConfigResponse> getDataSourceOrderConfig(GetDataSourceOrderConfigRequest request);

    /**
     * @param request the request parameters of GetDocClusterTask  GetDocClusterTaskRequest
     * @return GetDocClusterTaskResponse
     */
    CompletableFuture<GetDocClusterTaskResponse> getDocClusterTask(GetDocClusterTaskRequest request);

    /**
     * @param request the request parameters of GetEnterpriseVocAnalysisTask  GetEnterpriseVocAnalysisTaskRequest
     * @return GetEnterpriseVocAnalysisTaskResponse
     */
    CompletableFuture<GetEnterpriseVocAnalysisTaskResponse> getEnterpriseVocAnalysisTask(GetEnterpriseVocAnalysisTaskRequest request);

    /**
     * @param request the request parameters of GetGeneratedContent  GetGeneratedContentRequest
     * @return GetGeneratedContentResponse
     */
    CompletableFuture<GetGeneratedContentResponse> getGeneratedContent(GetGeneratedContentRequest request);

    /**
     * @param request the request parameters of GetHotTopicBroadcast  GetHotTopicBroadcastRequest
     * @return GetHotTopicBroadcastResponse
     */
    CompletableFuture<GetHotTopicBroadcastResponse> getHotTopicBroadcast(GetHotTopicBroadcastRequest request);

    /**
     * @param request the request parameters of GetInterveneGlobalReply  GetInterveneGlobalReplyRequest
     * @return GetInterveneGlobalReplyResponse
     */
    CompletableFuture<GetInterveneGlobalReplyResponse> getInterveneGlobalReply(GetInterveneGlobalReplyRequest request);

    /**
     * @param request the request parameters of GetInterveneImportTaskInfo  GetInterveneImportTaskInfoRequest
     * @return GetInterveneImportTaskInfoResponse
     */
    CompletableFuture<GetInterveneImportTaskInfoResponse> getInterveneImportTaskInfo(GetInterveneImportTaskInfoRequest request);

    /**
     * @param request the request parameters of GetInterveneRuleDetail  GetInterveneRuleDetailRequest
     * @return GetInterveneRuleDetailResponse
     */
    CompletableFuture<GetInterveneRuleDetailResponse> getInterveneRuleDetail(GetInterveneRuleDetailRequest request);

    /**
     * @param request the request parameters of GetInterveneTemplateFileUrl  GetInterveneTemplateFileUrlRequest
     * @return GetInterveneTemplateFileUrlResponse
     */
    CompletableFuture<GetInterveneTemplateFileUrlResponse> getInterveneTemplateFileUrl(GetInterveneTemplateFileUrlRequest request);

    /**
     * @param request the request parameters of GetMaterialById  GetMaterialByIdRequest
     * @return GetMaterialByIdResponse
     */
    CompletableFuture<GetMaterialByIdResponse> getMaterialById(GetMaterialByIdRequest request);

    /**
     * @param request the request parameters of GetProperties  GetPropertiesRequest
     * @return GetPropertiesResponse
     */
    CompletableFuture<GetPropertiesResponse> getProperties(GetPropertiesRequest request);

    /**
     * @param request the request parameters of GetSmartClipTask  GetSmartClipTaskRequest
     * @return GetSmartClipTaskResponse
     */
    CompletableFuture<GetSmartClipTaskResponse> getSmartClipTask(GetSmartClipTaskRequest request);

    /**
     * @param request the request parameters of GetTopicById  GetTopicByIdRequest
     * @return GetTopicByIdResponse
     */
    CompletableFuture<GetTopicByIdResponse> getTopicById(GetTopicByIdRequest request);

    /**
     * @param request the request parameters of GetTopicSelectionPerspectiveAnalysisTask  GetTopicSelectionPerspectiveAnalysisTaskRequest
     * @return GetTopicSelectionPerspectiveAnalysisTaskResponse
     */
    CompletableFuture<GetTopicSelectionPerspectiveAnalysisTaskResponse> getTopicSelectionPerspectiveAnalysisTask(GetTopicSelectionPerspectiveAnalysisTaskRequest request);

    /**
     * @param request the request parameters of ImportInterveneFile  ImportInterveneFileRequest
     * @return ImportInterveneFileResponse
     */
    CompletableFuture<ImportInterveneFileResponse> importInterveneFile(ImportInterveneFileRequest request);

    /**
     * @param request the request parameters of ImportInterveneFileAsync  ImportInterveneFileAsyncRequest
     * @return ImportInterveneFileAsyncResponse
     */
    CompletableFuture<ImportInterveneFileAsyncResponse> importInterveneFileAsync(ImportInterveneFileAsyncRequest request);

    /**
     * @param request the request parameters of InsertInterveneGlobalReply  InsertInterveneGlobalReplyRequest
     * @return InsertInterveneGlobalReplyResponse
     */
    CompletableFuture<InsertInterveneGlobalReplyResponse> insertInterveneGlobalReply(InsertInterveneGlobalReplyRequest request);

    /**
     * @param request the request parameters of InsertInterveneRule  InsertInterveneRuleRequest
     * @return InsertInterveneRuleResponse
     */
    CompletableFuture<InsertInterveneRuleResponse> insertInterveneRule(InsertInterveneRuleRequest request);

    /**
     * @param request the request parameters of ListAnalysisTagDetailByTaskId  ListAnalysisTagDetailByTaskIdRequest
     * @return ListAnalysisTagDetailByTaskIdResponse
     */
    CompletableFuture<ListAnalysisTagDetailByTaskIdResponse> listAnalysisTagDetailByTaskId(ListAnalysisTagDetailByTaskIdRequest request);

    /**
     * @param request the request parameters of ListAsyncTasks  ListAsyncTasksRequest
     * @return ListAsyncTasksResponse
     */
    CompletableFuture<ListAsyncTasksResponse> listAsyncTasks(ListAsyncTasksRequest request);

    /**
     * @param request the request parameters of ListBuildConfigs  ListBuildConfigsRequest
     * @return ListBuildConfigsResponse
     */
    CompletableFuture<ListBuildConfigsResponse> listBuildConfigs(ListBuildConfigsRequest request);

    /**
     * @param request the request parameters of ListCustomText  ListCustomTextRequest
     * @return ListCustomTextResponse
     */
    CompletableFuture<ListCustomTextResponse> listCustomText(ListCustomTextRequest request);

    /**
     * @param request the request parameters of ListCustomViewPoints  ListCustomViewPointsRequest
     * @return ListCustomViewPointsResponse
     */
    CompletableFuture<ListCustomViewPointsResponse> listCustomViewPoints(ListCustomViewPointsRequest request);

    /**
     * @param request the request parameters of ListDialogues  ListDialoguesRequest
     * @return ListDialoguesResponse
     */
    CompletableFuture<ListDialoguesResponse> listDialogues(ListDialoguesRequest request);

    /**
     * @param request the request parameters of ListFreshViewPoints  ListFreshViewPointsRequest
     * @return ListFreshViewPointsResponse
     */
    CompletableFuture<ListFreshViewPointsResponse> listFreshViewPoints(ListFreshViewPointsRequest request);

    /**
     * @param request the request parameters of ListGeneratedContents  ListGeneratedContentsRequest
     * @return ListGeneratedContentsResponse
     */
    CompletableFuture<ListGeneratedContentsResponse> listGeneratedContents(ListGeneratedContentsRequest request);

    /**
     * @param request the request parameters of ListHotNewsWithType  ListHotNewsWithTypeRequest
     * @return ListHotNewsWithTypeResponse
     */
    CompletableFuture<ListHotNewsWithTypeResponse> listHotNewsWithType(ListHotNewsWithTypeRequest request);

    /**
     * @param request the request parameters of ListHotSources  ListHotSourcesRequest
     * @return ListHotSourcesResponse
     */
    CompletableFuture<ListHotSourcesResponse> listHotSources(ListHotSourcesRequest request);

    /**
     * @param request the request parameters of ListHotTopics  ListHotTopicsRequest
     * @return ListHotTopicsResponse
     */
    CompletableFuture<ListHotTopicsResponse> listHotTopics(ListHotTopicsRequest request);

    /**
     * @param request the request parameters of ListHotViewPoints  ListHotViewPointsRequest
     * @return ListHotViewPointsResponse
     */
    CompletableFuture<ListHotViewPointsResponse> listHotViewPoints(ListHotViewPointsRequest request);

    /**
     * @param request the request parameters of ListInterveneCnt  ListInterveneCntRequest
     * @return ListInterveneCntResponse
     */
    CompletableFuture<ListInterveneCntResponse> listInterveneCnt(ListInterveneCntRequest request);

    /**
     * @param request the request parameters of ListInterveneImportTasks  ListInterveneImportTasksRequest
     * @return ListInterveneImportTasksResponse
     */
    CompletableFuture<ListInterveneImportTasksResponse> listInterveneImportTasks(ListInterveneImportTasksRequest request);

    /**
     * @param request the request parameters of ListInterveneRules  ListInterveneRulesRequest
     * @return ListInterveneRulesResponse
     */
    CompletableFuture<ListInterveneRulesResponse> listInterveneRules(ListInterveneRulesRequest request);

    /**
     * @param request the request parameters of ListIntervenes  ListIntervenesRequest
     * @return ListIntervenesResponse
     */
    CompletableFuture<ListIntervenesResponse> listIntervenes(ListIntervenesRequest request);

    /**
     * @param request the request parameters of ListMaterialDocuments  ListMaterialDocumentsRequest
     * @return ListMaterialDocumentsResponse
     */
    CompletableFuture<ListMaterialDocumentsResponse> listMaterialDocuments(ListMaterialDocumentsRequest request);

    /**
     * @param request the request parameters of ListPlanningProposal  ListPlanningProposalRequest
     * @return ListPlanningProposalResponse
     */
    CompletableFuture<ListPlanningProposalResponse> listPlanningProposal(ListPlanningProposalRequest request);

    /**
     * @param request the request parameters of ListTimedViewAttitude  ListTimedViewAttitudeRequest
     * @return ListTimedViewAttitudeResponse
     */
    CompletableFuture<ListTimedViewAttitudeResponse> listTimedViewAttitude(ListTimedViewAttitudeRequest request);

    /**
     * @param request the request parameters of ListTopicRecommendEventList  ListTopicRecommendEventListRequest
     * @return ListTopicRecommendEventListResponse
     */
    CompletableFuture<ListTopicRecommendEventListResponse> listTopicRecommendEventList(ListTopicRecommendEventListRequest request);

    /**
     * @param request the request parameters of ListTopicViewPointRecommendEventList  ListTopicViewPointRecommendEventListRequest
     * @return ListTopicViewPointRecommendEventListResponse
     */
    CompletableFuture<ListTopicViewPointRecommendEventListResponse> listTopicViewPointRecommendEventList(ListTopicViewPointRecommendEventListRequest request);

    /**
     * @param request the request parameters of ListVersions  ListVersionsRequest
     * @return ListVersionsResponse
     */
    CompletableFuture<ListVersionsResponse> listVersions(ListVersionsRequest request);

    /**
     * @param request the request parameters of ListWebReviewPoints  ListWebReviewPointsRequest
     * @return ListWebReviewPointsResponse
     */
    CompletableFuture<ListWebReviewPointsResponse> listWebReviewPoints(ListWebReviewPointsRequest request);

    /**
     * @param request the request parameters of QueryAsyncTask  QueryAsyncTaskRequest
     * @return QueryAsyncTaskResponse
     */
    CompletableFuture<QueryAsyncTaskResponse> queryAsyncTask(QueryAsyncTaskRequest request);

    /**
     * @param request the request parameters of RunAbbreviationContent  RunAbbreviationContentRequest
     * @return RunAbbreviationContentResponse
     */
    CompletableFuture<RunAbbreviationContentResponse> runAbbreviationContent(RunAbbreviationContentRequest request);

    ResponseIterable<RunAbbreviationContentResponseBody> runAbbreviationContentWithResponseIterable(RunAbbreviationContentRequest request);

    /**
     * @param request the request parameters of RunContinueContent  RunContinueContentRequest
     * @return RunContinueContentResponse
     */
    CompletableFuture<RunContinueContentResponse> runContinueContent(RunContinueContentRequest request);

    ResponseIterable<RunContinueContentResponseBody> runContinueContentWithResponseIterable(RunContinueContentRequest request);

    /**
     * @param request the request parameters of RunCustomHotTopicAnalysis  RunCustomHotTopicAnalysisRequest
     * @return RunCustomHotTopicAnalysisResponse
     */
    CompletableFuture<RunCustomHotTopicAnalysisResponse> runCustomHotTopicAnalysis(RunCustomHotTopicAnalysisRequest request);

    ResponseIterable<RunCustomHotTopicAnalysisResponseBody> runCustomHotTopicAnalysisWithResponseIterable(RunCustomHotTopicAnalysisRequest request);

    /**
     * @param request the request parameters of RunCustomHotTopicViewPointAnalysis  RunCustomHotTopicViewPointAnalysisRequest
     * @return RunCustomHotTopicViewPointAnalysisResponse
     */
    CompletableFuture<RunCustomHotTopicViewPointAnalysisResponse> runCustomHotTopicViewPointAnalysis(RunCustomHotTopicViewPointAnalysisRequest request);

    ResponseIterable<RunCustomHotTopicViewPointAnalysisResponseBody> runCustomHotTopicViewPointAnalysisWithResponseIterable(RunCustomHotTopicViewPointAnalysisRequest request);

    /**
     * @param request the request parameters of RunExpandContent  RunExpandContentRequest
     * @return RunExpandContentResponse
     */
    CompletableFuture<RunExpandContentResponse> runExpandContent(RunExpandContentRequest request);

    ResponseIterable<RunExpandContentResponseBody> runExpandContentWithResponseIterable(RunExpandContentRequest request);

    /**
     * @param request the request parameters of RunKeywordsExtractionGeneration  RunKeywordsExtractionGenerationRequest
     * @return RunKeywordsExtractionGenerationResponse
     */
    CompletableFuture<RunKeywordsExtractionGenerationResponse> runKeywordsExtractionGeneration(RunKeywordsExtractionGenerationRequest request);

    ResponseIterable<RunKeywordsExtractionGenerationResponseBody> runKeywordsExtractionGenerationWithResponseIterable(RunKeywordsExtractionGenerationRequest request);

    /**
     * @param request the request parameters of RunStepByStepWriting  RunStepByStepWritingRequest
     * @return RunStepByStepWritingResponse
     */
    CompletableFuture<RunStepByStepWritingResponse> runStepByStepWriting(RunStepByStepWritingRequest request);

    ResponseIterable<RunStepByStepWritingResponseBody> runStepByStepWritingWithResponseIterable(RunStepByStepWritingRequest request);

    /**
     * @param request the request parameters of RunStyleFeatureAnalysis  RunStyleFeatureAnalysisRequest
     * @return RunStyleFeatureAnalysisResponse
     */
    CompletableFuture<RunStyleFeatureAnalysisResponse> runStyleFeatureAnalysis(RunStyleFeatureAnalysisRequest request);

    ResponseIterable<RunStyleFeatureAnalysisResponseBody> runStyleFeatureAnalysisWithResponseIterable(RunStyleFeatureAnalysisRequest request);

    /**
     * @param request the request parameters of RunSummaryGenerate  RunSummaryGenerateRequest
     * @return RunSummaryGenerateResponse
     */
    CompletableFuture<RunSummaryGenerateResponse> runSummaryGenerate(RunSummaryGenerateRequest request);

    ResponseIterable<RunSummaryGenerateResponseBody> runSummaryGenerateWithResponseIterable(RunSummaryGenerateRequest request);

    /**
     * @param request the request parameters of RunTextPolishing  RunTextPolishingRequest
     * @return RunTextPolishingResponse
     */
    CompletableFuture<RunTextPolishingResponse> runTextPolishing(RunTextPolishingRequest request);

    ResponseIterable<RunTextPolishingResponseBody> runTextPolishingWithResponseIterable(RunTextPolishingRequest request);

    /**
     * @param request the request parameters of RunTitleGeneration  RunTitleGenerationRequest
     * @return RunTitleGenerationResponse
     */
    CompletableFuture<RunTitleGenerationResponse> runTitleGeneration(RunTitleGenerationRequest request);

    ResponseIterable<RunTitleGenerationResponseBody> runTitleGenerationWithResponseIterable(RunTitleGenerationRequest request);

    /**
     * @param request the request parameters of RunTranslateGeneration  RunTranslateGenerationRequest
     * @return RunTranslateGenerationResponse
     */
    CompletableFuture<RunTranslateGenerationResponse> runTranslateGeneration(RunTranslateGenerationRequest request);

    ResponseIterable<RunTranslateGenerationResponseBody> runTranslateGenerationWithResponseIterable(RunTranslateGenerationRequest request);

    /**
     * @param request the request parameters of RunWriteToneGeneration  RunWriteToneGenerationRequest
     * @return RunWriteToneGenerationResponse
     */
    CompletableFuture<RunWriteToneGenerationResponse> runWriteToneGeneration(RunWriteToneGenerationRequest request);

    ResponseIterable<RunWriteToneGenerationResponseBody> runWriteToneGenerationWithResponseIterable(RunWriteToneGenerationRequest request);

    /**
     * @param request the request parameters of RunWriting  RunWritingRequest
     * @return RunWritingResponse
     */
    CompletableFuture<RunWritingResponse> runWriting(RunWritingRequest request);

    ResponseIterable<RunWritingResponseBody> runWritingWithResponseIterable(RunWritingRequest request);

    /**
     * @param request the request parameters of SaveCustomText  SaveCustomTextRequest
     * @return SaveCustomTextResponse
     */
    CompletableFuture<SaveCustomTextResponse> saveCustomText(SaveCustomTextRequest request);

    /**
     * @param request the request parameters of SaveDataSourceOrderConfig  SaveDataSourceOrderConfigRequest
     * @return SaveDataSourceOrderConfigResponse
     */
    CompletableFuture<SaveDataSourceOrderConfigResponse> saveDataSourceOrderConfig(SaveDataSourceOrderConfigRequest request);

    /**
     * @param request the request parameters of SaveMaterialDocument  SaveMaterialDocumentRequest
     * @return SaveMaterialDocumentResponse
     */
    CompletableFuture<SaveMaterialDocumentResponse> saveMaterialDocument(SaveMaterialDocumentRequest request);

    /**
     * @param request the request parameters of SearchNews  SearchNewsRequest
     * @return SearchNewsResponse
     */
    CompletableFuture<SearchNewsResponse> searchNews(SearchNewsRequest request);

    /**
     * @param request the request parameters of SubmitAsyncTask  SubmitAsyncTaskRequest
     * @return SubmitAsyncTaskResponse
     */
    CompletableFuture<SubmitAsyncTaskResponse> submitAsyncTask(SubmitAsyncTaskRequest request);

    /**
     * @param request the request parameters of SubmitCustomHotTopicBroadcastJob  SubmitCustomHotTopicBroadcastJobRequest
     * @return SubmitCustomHotTopicBroadcastJobResponse
     */
    CompletableFuture<SubmitCustomHotTopicBroadcastJobResponse> submitCustomHotTopicBroadcastJob(SubmitCustomHotTopicBroadcastJobRequest request);

    /**
     * @param request the request parameters of SubmitCustomTopicSelectionPerspectiveAnalysisTask  SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest
     * @return SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponse
     */
    CompletableFuture<SubmitCustomTopicSelectionPerspectiveAnalysisTaskResponse> submitCustomTopicSelectionPerspectiveAnalysisTask(SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest request);

    /**
     * @param request the request parameters of SubmitDocClusterTask  SubmitDocClusterTaskRequest
     * @return SubmitDocClusterTaskResponse
     */
    CompletableFuture<SubmitDocClusterTaskResponse> submitDocClusterTask(SubmitDocClusterTaskRequest request);

    /**
     * @param request the request parameters of SubmitEnterpriseVocAnalysisTask  SubmitEnterpriseVocAnalysisTaskRequest
     * @return SubmitEnterpriseVocAnalysisTaskResponse
     */
    CompletableFuture<SubmitEnterpriseVocAnalysisTaskResponse> submitEnterpriseVocAnalysisTask(SubmitEnterpriseVocAnalysisTaskRequest request);

    /**
     * @param request the request parameters of SubmitSmartClipTask  SubmitSmartClipTaskRequest
     * @return SubmitSmartClipTaskResponse
     */
    CompletableFuture<SubmitSmartClipTaskResponse> submitSmartClipTask(SubmitSmartClipTaskRequest request);

    /**
     * @param request the request parameters of SubmitTopicSelectionPerspectiveAnalysisTask  SubmitTopicSelectionPerspectiveAnalysisTaskRequest
     * @return SubmitTopicSelectionPerspectiveAnalysisTaskResponse
     */
    CompletableFuture<SubmitTopicSelectionPerspectiveAnalysisTaskResponse> submitTopicSelectionPerspectiveAnalysisTask(SubmitTopicSelectionPerspectiveAnalysisTaskRequest request);

    /**
     * @param request the request parameters of UpdateCustomText  UpdateCustomTextRequest
     * @return UpdateCustomTextResponse
     */
    CompletableFuture<UpdateCustomTextResponse> updateCustomText(UpdateCustomTextRequest request);

    /**
     * @param request the request parameters of UpdateGeneratedContent  UpdateGeneratedContentRequest
     * @return UpdateGeneratedContentResponse
     */
    CompletableFuture<UpdateGeneratedContentResponse> updateGeneratedContent(UpdateGeneratedContentRequest request);

    /**
     * @param request the request parameters of UpdateMaterialDocument  UpdateMaterialDocumentRequest
     * @return UpdateMaterialDocumentResponse
     */
    CompletableFuture<UpdateMaterialDocumentResponse> updateMaterialDocument(UpdateMaterialDocumentRequest request);

    /**
     * @param request the request parameters of ValidateUploadTemplate  ValidateUploadTemplateRequest
     * @return ValidateUploadTemplateResponse
     */
    CompletableFuture<ValidateUploadTemplateResponse> validateUploadTemplate(ValidateUploadTemplateRequest request);

}
