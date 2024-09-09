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

    CompletableFuture<CancelAsyncTaskResponse> cancelAsyncTask(CancelAsyncTaskRequest request);

    CompletableFuture<ClearIntervenesResponse> clearIntervenes(ClearIntervenesRequest request);

    CompletableFuture<CreateGeneratedContentResponse> createGeneratedContent(CreateGeneratedContentRequest request);

    CompletableFuture<CreateTokenResponse> createToken(CreateTokenRequest request);

    CompletableFuture<DeleteCustomTextResponse> deleteCustomText(DeleteCustomTextRequest request);

    CompletableFuture<DeleteGeneratedContentResponse> deleteGeneratedContent(DeleteGeneratedContentRequest request);

    CompletableFuture<DeleteInterveneRuleResponse> deleteInterveneRule(DeleteInterveneRuleRequest request);

    CompletableFuture<DeleteMaterialByIdResponse> deleteMaterialById(DeleteMaterialByIdRequest request);

    CompletableFuture<DocumentExtractionResponse> documentExtraction(DocumentExtractionRequest request);

    CompletableFuture<ExportGeneratedContentResponse> exportGeneratedContent(ExportGeneratedContentRequest request);

    CompletableFuture<ExportIntervenesResponse> exportIntervenes(ExportIntervenesRequest request);

    CompletableFuture<FeedbackDialogueResponse> feedbackDialogue(FeedbackDialogueRequest request);

    CompletableFuture<FetchImageTaskResponse> fetchImageTask(FetchImageTaskRequest request);

    CompletableFuture<GenerateFileUrlByKeyResponse> generateFileUrlByKey(GenerateFileUrlByKeyRequest request);

    CompletableFuture<GenerateImageTaskResponse> generateImageTask(GenerateImageTaskRequest request);

    CompletableFuture<GenerateUploadConfigResponse> generateUploadConfig(GenerateUploadConfigRequest request);

    CompletableFuture<GenerateViewPointResponse> generateViewPoint(GenerateViewPointRequest request);

    CompletableFuture<GetCustomTextResponse> getCustomText(GetCustomTextRequest request);

    CompletableFuture<GetDataSourceOrderConfigResponse> getDataSourceOrderConfig(GetDataSourceOrderConfigRequest request);

    CompletableFuture<GetGeneratedContentResponse> getGeneratedContent(GetGeneratedContentRequest request);

    CompletableFuture<GetInterveneGlobalReplyResponse> getInterveneGlobalReply(GetInterveneGlobalReplyRequest request);

    CompletableFuture<GetInterveneImportTaskInfoResponse> getInterveneImportTaskInfo(GetInterveneImportTaskInfoRequest request);

    CompletableFuture<GetInterveneRuleDetailResponse> getInterveneRuleDetail(GetInterveneRuleDetailRequest request);

    CompletableFuture<GetInterveneTemplateFileUrlResponse> getInterveneTemplateFileUrl(GetInterveneTemplateFileUrlRequest request);

    CompletableFuture<GetMaterialByIdResponse> getMaterialById(GetMaterialByIdRequest request);

    CompletableFuture<GetPropertiesResponse> getProperties(GetPropertiesRequest request);

    CompletableFuture<ImportInterveneFileResponse> importInterveneFile(ImportInterveneFileRequest request);

    CompletableFuture<ImportInterveneFileAsyncResponse> importInterveneFileAsync(ImportInterveneFileAsyncRequest request);

    CompletableFuture<InsertInterveneGlobalReplyResponse> insertInterveneGlobalReply(InsertInterveneGlobalReplyRequest request);

    CompletableFuture<InsertInterveneRuleResponse> insertInterveneRule(InsertInterveneRuleRequest request);

    CompletableFuture<ListAsyncTasksResponse> listAsyncTasks(ListAsyncTasksRequest request);

    CompletableFuture<ListBuildConfigsResponse> listBuildConfigs(ListBuildConfigsRequest request);

    CompletableFuture<ListCustomTextResponse> listCustomText(ListCustomTextRequest request);

    CompletableFuture<ListDialoguesResponse> listDialogues(ListDialoguesRequest request);

    CompletableFuture<ListGeneratedContentsResponse> listGeneratedContents(ListGeneratedContentsRequest request);

    CompletableFuture<ListHotNewsWithTypeResponse> listHotNewsWithType(ListHotNewsWithTypeRequest request);

    CompletableFuture<ListInterveneCntResponse> listInterveneCnt(ListInterveneCntRequest request);

    CompletableFuture<ListInterveneImportTasksResponse> listInterveneImportTasks(ListInterveneImportTasksRequest request);

    CompletableFuture<ListInterveneRulesResponse> listInterveneRules(ListInterveneRulesRequest request);

    CompletableFuture<ListIntervenesResponse> listIntervenes(ListIntervenesRequest request);

    CompletableFuture<ListMaterialDocumentsResponse> listMaterialDocuments(ListMaterialDocumentsRequest request);

    CompletableFuture<ListVersionsResponse> listVersions(ListVersionsRequest request);

    CompletableFuture<QueryAsyncTaskResponse> queryAsyncTask(QueryAsyncTaskRequest request);

    CompletableFuture<RunAbbreviationContentResponse> runAbbreviationContent(RunAbbreviationContentRequest request);

    ResponseIterable<RunAbbreviationContentResponseBody> runAbbreviationContentWithResponseIterable(RunAbbreviationContentRequest request);

    CompletableFuture<RunContinueContentResponse> runContinueContent(RunContinueContentRequest request);

    ResponseIterable<RunContinueContentResponseBody> runContinueContentWithResponseIterable(RunContinueContentRequest request);

    CompletableFuture<RunExpandContentResponse> runExpandContent(RunExpandContentRequest request);

    ResponseIterable<RunExpandContentResponseBody> runExpandContentWithResponseIterable(RunExpandContentRequest request);

    CompletableFuture<RunKeywordsExtractionGenerationResponse> runKeywordsExtractionGeneration(RunKeywordsExtractionGenerationRequest request);

    ResponseIterable<RunKeywordsExtractionGenerationResponseBody> runKeywordsExtractionGenerationWithResponseIterable(RunKeywordsExtractionGenerationRequest request);

    CompletableFuture<RunStyleFeatureAnalysisResponse> runStyleFeatureAnalysis(RunStyleFeatureAnalysisRequest request);

    ResponseIterable<RunStyleFeatureAnalysisResponseBody> runStyleFeatureAnalysisWithResponseIterable(RunStyleFeatureAnalysisRequest request);

    CompletableFuture<RunSummaryGenerateResponse> runSummaryGenerate(RunSummaryGenerateRequest request);

    ResponseIterable<RunSummaryGenerateResponseBody> runSummaryGenerateWithResponseIterable(RunSummaryGenerateRequest request);

    CompletableFuture<RunTextPolishingResponse> runTextPolishing(RunTextPolishingRequest request);

    ResponseIterable<RunTextPolishingResponseBody> runTextPolishingWithResponseIterable(RunTextPolishingRequest request);

    CompletableFuture<RunTitleGenerationResponse> runTitleGeneration(RunTitleGenerationRequest request);

    ResponseIterable<RunTitleGenerationResponseBody> runTitleGenerationWithResponseIterable(RunTitleGenerationRequest request);

    CompletableFuture<RunTranslateGenerationResponse> runTranslateGeneration(RunTranslateGenerationRequest request);

    ResponseIterable<RunTranslateGenerationResponseBody> runTranslateGenerationWithResponseIterable(RunTranslateGenerationRequest request);

    CompletableFuture<RunWriteToneGenerationResponse> runWriteToneGeneration(RunWriteToneGenerationRequest request);

    ResponseIterable<RunWriteToneGenerationResponseBody> runWriteToneGenerationWithResponseIterable(RunWriteToneGenerationRequest request);

    CompletableFuture<RunWritingResponse> runWriting(RunWritingRequest request);

    ResponseIterable<RunWritingResponseBody> runWritingWithResponseIterable(RunWritingRequest request);

    CompletableFuture<SaveCustomTextResponse> saveCustomText(SaveCustomTextRequest request);

    CompletableFuture<SaveDataSourceOrderConfigResponse> saveDataSourceOrderConfig(SaveDataSourceOrderConfigRequest request);

    CompletableFuture<SaveMaterialDocumentResponse> saveMaterialDocument(SaveMaterialDocumentRequest request);

    CompletableFuture<SearchNewsResponse> searchNews(SearchNewsRequest request);

    CompletableFuture<SubmitAsyncTaskResponse> submitAsyncTask(SubmitAsyncTaskRequest request);

    CompletableFuture<UpdateCustomTextResponse> updateCustomText(UpdateCustomTextRequest request);

    CompletableFuture<UpdateGeneratedContentResponse> updateGeneratedContent(UpdateGeneratedContentRequest request);

    CompletableFuture<UpdateMaterialDocumentResponse> updateMaterialDocument(UpdateMaterialDocumentRequest request);

}
