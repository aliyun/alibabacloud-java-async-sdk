// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.aicontent20240611.models.*;
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
     * @param request the request parameters of AITeacherExpansionPracticeTaskGenerate  AITeacherExpansionPracticeTaskGenerateRequest
     * @return AITeacherExpansionPracticeTaskGenerateResponse
     */
    CompletableFuture<AITeacherExpansionPracticeTaskGenerateResponse> aITeacherExpansionPracticeTaskGenerate(AITeacherExpansionPracticeTaskGenerateRequest request);

    /**
     * @param request the request parameters of AITeacherSyncPracticeTaskGenerate  AITeacherSyncPracticeTaskGenerateRequest
     * @return AITeacherSyncPracticeTaskGenerateResponse
     */
    CompletableFuture<AITeacherSyncPracticeTaskGenerateResponse> aITeacherSyncPracticeTaskGenerate(AITeacherSyncPracticeTaskGenerateRequest request);

    /**
     * @param request the request parameters of AliyunConsoleOpenApiQueryAliyunConsoleServcieList  AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest
     * @return AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse
     */
    CompletableFuture<AliyunConsoleOpenApiQueryAliyunConsoleServcieListResponse> aliyunConsoleOpenApiQueryAliyunConsoleServcieList(AliyunConsoleOpenApiQueryAliyunConsoleServcieListRequest request);

    /**
     * @param request the request parameters of AliyunConsoleOpenApiQueryAliyunConsoleServiceList  AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest
     * @return AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse
     */
    CompletableFuture<AliyunConsoleOpenApiQueryAliyunConsoleServiceListResponse> aliyunConsoleOpenApiQueryAliyunConsoleServiceList(AliyunConsoleOpenApiQueryAliyunConsoleServiceListRequest request);

    /**
     * @param request the request parameters of AliyunConsoleOpenApiQueryPaidResource  AliyunConsoleOpenApiQueryPaidResourceRequest
     * @return AliyunConsoleOpenApiQueryPaidResourceResponse
     */
    CompletableFuture<AliyunConsoleOpenApiQueryPaidResourceResponse> aliyunConsoleOpenApiQueryPaidResource(AliyunConsoleOpenApiQueryPaidResourceRequest request);

    /**
     * @param request the request parameters of CountOralEvaluationStatisticsCalls  CountOralEvaluationStatisticsCallsRequest
     * @return CountOralEvaluationStatisticsCallsResponse
     */
    CompletableFuture<CountOralEvaluationStatisticsCallsResponse> countOralEvaluationStatisticsCalls(CountOralEvaluationStatisticsCallsRequest request);

    /**
     * @param request the request parameters of CountOralEvaluationStatisticsConcurrent  CountOralEvaluationStatisticsConcurrentRequest
     * @return CountOralEvaluationStatisticsConcurrentResponse
     */
    CompletableFuture<CountOralEvaluationStatisticsConcurrentResponse> countOralEvaluationStatisticsConcurrent(CountOralEvaluationStatisticsConcurrentRequest request);

    /**
     * @param request the request parameters of CountOralEvaluationStatisticsError  CountOralEvaluationStatisticsErrorRequest
     * @return CountOralEvaluationStatisticsErrorResponse
     */
    CompletableFuture<CountOralEvaluationStatisticsErrorResponse> countOralEvaluationStatisticsError(CountOralEvaluationStatisticsErrorRequest request);

    /**
     * @param request the request parameters of CreateAccessWarrant  CreateAccessWarrantRequest
     * @return CreateAccessWarrantResponse
     */
    CompletableFuture<CreateAccessWarrantResponse> createAccessWarrant(CreateAccessWarrantRequest request);

    /**
     * @param request the request parameters of CreateProject  CreateProjectRequest
     * @return CreateProjectResponse
     */
    CompletableFuture<CreateProjectResponse> createProject(CreateProjectRequest request);

    /**
     * @param request the request parameters of ExecuteAITeacherChineseCompositionTutoringWorkflowRun  ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest
     * @return ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse
     */
    CompletableFuture<ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponse> executeAITeacherChineseCompositionTutoringWorkflowRun(ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest request);

    ResponseIterable<ExecuteAITeacherChineseCompositionTutoringWorkflowRunResponseBody> executeAITeacherChineseCompositionTutoringWorkflowRunWithResponseIterable(ExecuteAITeacherChineseCompositionTutoringWorkflowRunRequest request);

    /**
     * @param request the request parameters of ExecuteAITeacherEnglishCompositionTutoringWorkflowRun  ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest
     * @return ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse
     */
    CompletableFuture<ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponse> executeAITeacherEnglishCompositionTutoringWorkflowRun(ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest request);

    ResponseIterable<ExecuteAITeacherEnglishCompositionTutoringWorkflowRunResponseBody> executeAITeacherEnglishCompositionTutoringWorkflowRunWithResponseIterable(ExecuteAITeacherEnglishCompositionTutoringWorkflowRunRequest request);

    /**
     * @param request the request parameters of ExecuteAITeacherEnglishParaphraseChatMessage  ExecuteAITeacherEnglishParaphraseChatMessageRequest
     * @return ExecuteAITeacherEnglishParaphraseChatMessageResponse
     */
    CompletableFuture<ExecuteAITeacherEnglishParaphraseChatMessageResponse> executeAITeacherEnglishParaphraseChatMessage(ExecuteAITeacherEnglishParaphraseChatMessageRequest request);

    ResponseIterable<ExecuteAITeacherEnglishParaphraseChatMessageResponseBody> executeAITeacherEnglishParaphraseChatMessageWithResponseIterable(ExecuteAITeacherEnglishParaphraseChatMessageRequest request);

    /**
     * @param request the request parameters of ExecuteAITeacherExpansionDialogue  ExecuteAITeacherExpansionDialogueRequest
     * @return ExecuteAITeacherExpansionDialogueResponse
     */
    CompletableFuture<ExecuteAITeacherExpansionDialogueResponse> executeAITeacherExpansionDialogue(ExecuteAITeacherExpansionDialogueRequest request);

    /**
     * @param request the request parameters of ExecuteAITeacherExpansionDialogueRefine  ExecuteAITeacherExpansionDialogueRefineRequest
     * @return ExecuteAITeacherExpansionDialogueRefineResponse
     */
    CompletableFuture<ExecuteAITeacherExpansionDialogueRefineResponse> executeAITeacherExpansionDialogueRefine(ExecuteAITeacherExpansionDialogueRefineRequest request);

    /**
     * @param request the request parameters of ExecuteAITeacherExpansionDialogueTranslate  ExecuteAITeacherExpansionDialogueTranslateRequest
     * @return ExecuteAITeacherExpansionDialogueTranslateResponse
     */
    CompletableFuture<ExecuteAITeacherExpansionDialogueTranslateResponse> executeAITeacherExpansionDialogueTranslate(ExecuteAITeacherExpansionDialogueTranslateRequest request);

    /**
     * @param request the request parameters of ExecuteAITeacherGrammarCheck  ExecuteAITeacherGrammarCheckRequest
     * @return ExecuteAITeacherGrammarCheckResponse
     */
    CompletableFuture<ExecuteAITeacherGrammarCheckResponse> executeAITeacherGrammarCheck(ExecuteAITeacherGrammarCheckRequest request);

    /**
     * @param request the request parameters of ExecuteAITeacherSyncDialogue  ExecuteAITeacherSyncDialogueRequest
     * @return ExecuteAITeacherSyncDialogueResponse
     */
    CompletableFuture<ExecuteAITeacherSyncDialogueResponse> executeAITeacherSyncDialogue(ExecuteAITeacherSyncDialogueRequest request);

    /**
     * @param request the request parameters of ExecuteAITeacherSyncDialogueTranslate  ExecuteAITeacherSyncDialogueTranslateRequest
     * @return ExecuteAITeacherSyncDialogueTranslateResponse
     */
    CompletableFuture<ExecuteAITeacherSyncDialogueTranslateResponse> executeAITeacherSyncDialogueTranslate(ExecuteAITeacherSyncDialogueTranslateRequest request);

    /**
     * @param request the request parameters of ExecuteTextbookAssistantDialogue  ExecuteTextbookAssistantDialogueRequest
     * @return ExecuteTextbookAssistantDialogueResponse
     */
    CompletableFuture<ExecuteTextbookAssistantDialogueResponse> executeTextbookAssistantDialogue(ExecuteTextbookAssistantDialogueRequest request);

    /**
     * @param request the request parameters of ExecuteTextbookAssistantDifficulty  ExecuteTextbookAssistantDifficultyRequest
     * @return ExecuteTextbookAssistantDifficultyResponse
     */
    CompletableFuture<ExecuteTextbookAssistantDifficultyResponse> executeTextbookAssistantDifficulty(ExecuteTextbookAssistantDifficultyRequest request);

    /**
     * @param request the request parameters of ExecuteTextbookAssistantGrammarCheck  ExecuteTextbookAssistantGrammarCheckRequest
     * @return ExecuteTextbookAssistantGrammarCheckResponse
     */
    CompletableFuture<ExecuteTextbookAssistantGrammarCheckResponse> executeTextbookAssistantGrammarCheck(ExecuteTextbookAssistantGrammarCheckRequest request);

    /**
     * @param request the request parameters of ExecuteTextbookAssistantRefineByContext  ExecuteTextbookAssistantRefineByContextRequest
     * @return ExecuteTextbookAssistantRefineByContextResponse
     */
    CompletableFuture<ExecuteTextbookAssistantRefineByContextResponse> executeTextbookAssistantRefineByContext(ExecuteTextbookAssistantRefineByContextRequest request);

    /**
     * @param request the request parameters of ExecuteTextbookAssistantRetryConversation  ExecuteTextbookAssistantRetryConversationRequest
     * @return ExecuteTextbookAssistantRetryConversationResponse
     */
    CompletableFuture<ExecuteTextbookAssistantRetryConversationResponse> executeTextbookAssistantRetryConversation(ExecuteTextbookAssistantRetryConversationRequest request);

    /**
     * @param request the request parameters of ExecuteTextbookAssistantSseDialogue  ExecuteTextbookAssistantSseDialogueRequest
     * @return ExecuteTextbookAssistantSseDialogueResponse
     */
    CompletableFuture<ExecuteTextbookAssistantSseDialogueResponse> executeTextbookAssistantSseDialogue(ExecuteTextbookAssistantSseDialogueRequest request);

    ResponseIterable<ExecuteTextbookAssistantSseDialogueResponseBody> executeTextbookAssistantSseDialogueWithResponseIterable(ExecuteTextbookAssistantSseDialogueRequest request);

    /**
     * @param request the request parameters of ExecuteTextbookAssistantStartConversation  ExecuteTextbookAssistantStartConversationRequest
     * @return ExecuteTextbookAssistantStartConversationResponse
     */
    CompletableFuture<ExecuteTextbookAssistantStartConversationResponse> executeTextbookAssistantStartConversation(ExecuteTextbookAssistantStartConversationRequest request);

    /**
     * @param request the request parameters of ExecuteTextbookAssistantSuggestion  ExecuteTextbookAssistantSuggestionRequest
     * @return ExecuteTextbookAssistantSuggestionResponse
     */
    CompletableFuture<ExecuteTextbookAssistantSuggestionResponse> executeTextbookAssistantSuggestion(ExecuteTextbookAssistantSuggestionRequest request);

    /**
     * @param request the request parameters of ExecuteTextbookAssistantTranslate  ExecuteTextbookAssistantTranslateRequest
     * @return ExecuteTextbookAssistantTranslateResponse
     */
    CompletableFuture<ExecuteTextbookAssistantTranslateResponse> executeTextbookAssistantTranslate(ExecuteTextbookAssistantTranslateRequest request);

    /**
     * @param request the request parameters of GetAITeacherExpansionDialogueSuggestion  GetAITeacherExpansionDialogueSuggestionRequest
     * @return GetAITeacherExpansionDialogueSuggestionResponse
     */
    CompletableFuture<GetAITeacherExpansionDialogueSuggestionResponse> getAITeacherExpansionDialogueSuggestion(GetAITeacherExpansionDialogueSuggestionRequest request);

    /**
     * @param request the request parameters of GetAITeacherSyncDialogueSuggestion  GetAITeacherSyncDialogueSuggestionRequest
     * @return GetAITeacherSyncDialogueSuggestionResponse
     */
    CompletableFuture<GetAITeacherSyncDialogueSuggestionResponse> getAITeacherSyncDialogueSuggestion(GetAITeacherSyncDialogueSuggestionRequest request);

    /**
     * @param request the request parameters of GetTextbookAssistantToken  GetTextbookAssistantTokenRequest
     * @return GetTextbookAssistantTokenResponse
     */
    CompletableFuture<GetTextbookAssistantTokenResponse> getTextbookAssistantToken(GetTextbookAssistantTokenRequest request);

    /**
     * @param request the request parameters of ListTextbookAssistantArticleDetails  ListTextbookAssistantArticleDetailsRequest
     * @return ListTextbookAssistantArticleDetailsResponse
     */
    CompletableFuture<ListTextbookAssistantArticleDetailsResponse> listTextbookAssistantArticleDetails(ListTextbookAssistantArticleDetailsRequest request);

    /**
     * @param request the request parameters of ListTextbookAssistantArticles  ListTextbookAssistantArticlesRequest
     * @return ListTextbookAssistantArticlesResponse
     */
    CompletableFuture<ListTextbookAssistantArticlesResponse> listTextbookAssistantArticles(ListTextbookAssistantArticlesRequest request);

    /**
     * @param request the request parameters of ListTextbookAssistantBookDirectories  ListTextbookAssistantBookDirectoriesRequest
     * @return ListTextbookAssistantBookDirectoriesResponse
     */
    CompletableFuture<ListTextbookAssistantBookDirectoriesResponse> listTextbookAssistantBookDirectories(ListTextbookAssistantBookDirectoriesRequest request);

    /**
     * @param request the request parameters of ListTextbookAssistantBooks  ListTextbookAssistantBooksRequest
     * @return ListTextbookAssistantBooksResponse
     */
    CompletableFuture<ListTextbookAssistantBooksResponse> listTextbookAssistantBooks(ListTextbookAssistantBooksRequest request);

    /**
     * @param request the request parameters of ListTextbookAssistantGradeVolumes  ListTextbookAssistantGradeVolumesRequest
     * @return ListTextbookAssistantGradeVolumesResponse
     */
    CompletableFuture<ListTextbookAssistantGradeVolumesResponse> listTextbookAssistantGradeVolumes(ListTextbookAssistantGradeVolumesRequest request);

    /**
     * @param request the request parameters of ListTextbookAssistantSceneDetails  ListTextbookAssistantSceneDetailsRequest
     * @return ListTextbookAssistantSceneDetailsResponse
     */
    CompletableFuture<ListTextbookAssistantSceneDetailsResponse> listTextbookAssistantSceneDetails(ListTextbookAssistantSceneDetailsRequest request);

    /**
     * @param request the request parameters of ModelRouterChatCompletions  ModelRouterChatCompletionsRequest
     * @return ModelRouterChatCompletionsResponse
     */
    CompletableFuture<ModelRouterChatCompletionsResponse> modelRouterChatCompletions(ModelRouterChatCompletionsRequest request);

<ReturnT> CompletableFuture<ReturnT> modelRouterChatCompletionsWithAsyncResponseHandler(ModelRouterChatCompletionsRequest request, AsyncResponseHandler<ModelRouterChatCompletionsResponse, ReturnT> responseHandler);

    ResponseIterable<ModelRouterChatCompletionsResponseBody> modelRouterChatCompletionsWithResponseIterable(ModelRouterChatCompletionsRequest request);

    /**
     * @param request the request parameters of ModelRouterCopyApiKey  ModelRouterCopyApiKeyRequest
     * @return ModelRouterCopyApiKeyResponse
     */
    CompletableFuture<ModelRouterCopyApiKeyResponse> modelRouterCopyApiKey(ModelRouterCopyApiKeyRequest request);

    /**
     * @param request the request parameters of ModelRouterCreateApiKey  ModelRouterCreateApiKeyRequest
     * @return ModelRouterCreateApiKeyResponse
     */
    CompletableFuture<ModelRouterCreateApiKeyResponse> modelRouterCreateApiKey(ModelRouterCreateApiKeyRequest request);

    /**
     * @param request the request parameters of ModelRouterCreateClient  ModelRouterCreateClientRequest
     * @return ModelRouterCreateClientResponse
     */
    CompletableFuture<ModelRouterCreateClientResponse> modelRouterCreateClient(ModelRouterCreateClientRequest request);

    /**
     * @param request the request parameters of ModelRouterCreateConversation  ModelRouterCreateConversationRequest
     * @return ModelRouterCreateConversationResponse
     */
    CompletableFuture<ModelRouterCreateConversationResponse> modelRouterCreateConversation(ModelRouterCreateConversationRequest request);

    /**
     * @param request the request parameters of ModelRouterCreateModel  ModelRouterCreateModelRequest
     * @return ModelRouterCreateModelResponse
     */
    CompletableFuture<ModelRouterCreateModelResponse> modelRouterCreateModel(ModelRouterCreateModelRequest request);

    /**
     * @param request the request parameters of ModelRouterDeleteApiKey  ModelRouterDeleteApiKeyRequest
     * @return ModelRouterDeleteApiKeyResponse
     */
    CompletableFuture<ModelRouterDeleteApiKeyResponse> modelRouterDeleteApiKey(ModelRouterDeleteApiKeyRequest request);

    /**
     * @param request the request parameters of ModelRouterDeleteClient  ModelRouterDeleteClientRequest
     * @return ModelRouterDeleteClientResponse
     */
    CompletableFuture<ModelRouterDeleteClientResponse> modelRouterDeleteClient(ModelRouterDeleteClientRequest request);

    /**
     * @param request the request parameters of ModelRouterDeleteConversation  ModelRouterDeleteConversationRequest
     * @return ModelRouterDeleteConversationResponse
     */
    CompletableFuture<ModelRouterDeleteConversationResponse> modelRouterDeleteConversation(ModelRouterDeleteConversationRequest request);

    /**
     * @param request the request parameters of ModelRouterDeleteModel  ModelRouterDeleteModelRequest
     * @return ModelRouterDeleteModelResponse
     */
    CompletableFuture<ModelRouterDeleteModelResponse> modelRouterDeleteModel(ModelRouterDeleteModelRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryApiKey  ModelRouterQueryApiKeyRequest
     * @return ModelRouterQueryApiKeyResponse
     */
    CompletableFuture<ModelRouterQueryApiKeyResponse> modelRouterQueryApiKey(ModelRouterQueryApiKeyRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryApiKeyList  ModelRouterQueryApiKeyListRequest
     * @return ModelRouterQueryApiKeyListResponse
     */
    CompletableFuture<ModelRouterQueryApiKeyListResponse> modelRouterQueryApiKeyList(ModelRouterQueryApiKeyListRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryClientList  ModelRouterQueryClientListRequest
     * @return ModelRouterQueryClientListResponse
     */
    CompletableFuture<ModelRouterQueryClientListResponse> modelRouterQueryClientList(ModelRouterQueryClientListRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryConversation  ModelRouterQueryConversationRequest
     * @return ModelRouterQueryConversationResponse
     */
    CompletableFuture<ModelRouterQueryConversationResponse> modelRouterQueryConversation(ModelRouterQueryConversationRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryConversationList  ModelRouterQueryConversationListRequest
     * @return ModelRouterQueryConversationListResponse
     */
    CompletableFuture<ModelRouterQueryConversationListResponse> modelRouterQueryConversationList(ModelRouterQueryConversationListRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryModel  ModelRouterQueryModelRequest
     * @return ModelRouterQueryModelResponse
     */
    CompletableFuture<ModelRouterQueryModelResponse> modelRouterQueryModel(ModelRouterQueryModelRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryModelList  ModelRouterQueryModelListRequest
     * @return ModelRouterQueryModelListResponse
     */
    CompletableFuture<ModelRouterQueryModelListResponse> modelRouterQueryModelList(ModelRouterQueryModelListRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryModelWithApiKey  ModelRouterQueryModelWithApiKeyRequest
     * @return ModelRouterQueryModelWithApiKeyResponse
     */
    CompletableFuture<ModelRouterQueryModelWithApiKeyResponse> modelRouterQueryModelWithApiKey(ModelRouterQueryModelWithApiKeyRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryNacosProviders  ModelRouterQueryNacosProvidersRequest
     * @return ModelRouterQueryNacosProvidersResponse
     */
    CompletableFuture<ModelRouterQueryNacosProvidersResponse> modelRouterQueryNacosProviders(ModelRouterQueryNacosProvidersRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryNacosTags  ModelRouterQueryNacosTagsRequest
     * @return ModelRouterQueryNacosTagsResponse
     */
    CompletableFuture<ModelRouterQueryNacosTagsResponse> modelRouterQueryNacosTags(ModelRouterQueryNacosTagsRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryObservationCharts  ModelRouterQueryObservationChartsRequest
     * @return ModelRouterQueryObservationChartsResponse
     */
    CompletableFuture<ModelRouterQueryObservationChartsResponse> modelRouterQueryObservationCharts(ModelRouterQueryObservationChartsRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryObservationLogs  ModelRouterQueryObservationLogsRequest
     * @return ModelRouterQueryObservationLogsResponse
     */
    CompletableFuture<ModelRouterQueryObservationLogsResponse> modelRouterQueryObservationLogs(ModelRouterQueryObservationLogsRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryObservationMetrics  ModelRouterQueryObservationMetricsRequest
     * @return ModelRouterQueryObservationMetricsResponse
     */
    CompletableFuture<ModelRouterQueryObservationMetricsResponse> modelRouterQueryObservationMetrics(ModelRouterQueryObservationMetricsRequest request);

    /**
     * @param request the request parameters of ModelRouterUpdateClient  ModelRouterUpdateClientRequest
     * @return ModelRouterUpdateClientResponse
     */
    CompletableFuture<ModelRouterUpdateClientResponse> modelRouterUpdateClient(ModelRouterUpdateClientRequest request);

    /**
     * @param request the request parameters of ModelRouterUpdateConversation  ModelRouterUpdateConversationRequest
     * @return ModelRouterUpdateConversationResponse
     */
    CompletableFuture<ModelRouterUpdateConversationResponse> modelRouterUpdateConversation(ModelRouterUpdateConversationRequest request);

    /**
     * @param request the request parameters of ModelRouterUpdateModel  ModelRouterUpdateModelRequest
     * @return ModelRouterUpdateModelResponse
     */
    CompletableFuture<ModelRouterUpdateModelResponse> modelRouterUpdateModel(ModelRouterUpdateModelRequest request);

    /**
     * @param request the request parameters of PersonalizedTextToImageAddInferenceJob  PersonalizedTextToImageAddInferenceJobRequest
     * @return PersonalizedTextToImageAddInferenceJobResponse
     */
    CompletableFuture<PersonalizedTextToImageAddInferenceJobResponse> personalizedTextToImageAddInferenceJob(PersonalizedTextToImageAddInferenceJobRequest request);

    /**
     * @param request the request parameters of PersonalizedTextToImageQueryImageAsset  PersonalizedTextToImageQueryImageAssetRequest
     * @return PersonalizedTextToImageQueryImageAssetResponse
     */
    CompletableFuture<PersonalizedTextToImageQueryImageAssetResponse> personalizedTextToImageQueryImageAsset(PersonalizedTextToImageQueryImageAssetRequest request);

    /**
     * @param request the request parameters of PersonalizedTextToImageQueryPreModelInferenceJobInfo  PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest
     * @return PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse
     */
    CompletableFuture<PersonalizedTextToImageQueryPreModelInferenceJobInfoResponse> personalizedTextToImageQueryPreModelInferenceJobInfo(PersonalizedTextToImageQueryPreModelInferenceJobInfoRequest request);

    /**
     * @param request the request parameters of Personalizedtxt2imgAddInferenceJob  Personalizedtxt2imgAddInferenceJobRequest
     * @return Personalizedtxt2imgAddInferenceJobResponse
     */
    CompletableFuture<Personalizedtxt2imgAddInferenceJobResponse> personalizedtxt2imgAddInferenceJob(Personalizedtxt2imgAddInferenceJobRequest request);

    /**
     * @param request the request parameters of Personalizedtxt2imgAddModelTrainJob  Personalizedtxt2imgAddModelTrainJobRequest
     * @return Personalizedtxt2imgAddModelTrainJobResponse
     */
    CompletableFuture<Personalizedtxt2imgAddModelTrainJobResponse> personalizedtxt2imgAddModelTrainJob(Personalizedtxt2imgAddModelTrainJobRequest request);

    /**
     * @param request the request parameters of Personalizedtxt2imgQueryImageAsset  Personalizedtxt2imgQueryImageAssetRequest
     * @return Personalizedtxt2imgQueryImageAssetResponse
     */
    CompletableFuture<Personalizedtxt2imgQueryImageAssetResponse> personalizedtxt2imgQueryImageAsset(Personalizedtxt2imgQueryImageAssetRequest request);

    /**
     * @param request the request parameters of Personalizedtxt2imgQueryInferenceJobInfo  Personalizedtxt2imgQueryInferenceJobInfoRequest
     * @return Personalizedtxt2imgQueryInferenceJobInfoResponse
     */
    CompletableFuture<Personalizedtxt2imgQueryInferenceJobInfoResponse> personalizedtxt2imgQueryInferenceJobInfo(Personalizedtxt2imgQueryInferenceJobInfoRequest request);

    /**
     * @param request the request parameters of Personalizedtxt2imgQueryModelTrainJobList  Personalizedtxt2imgQueryModelTrainJobListRequest
     * @return Personalizedtxt2imgQueryModelTrainJobListResponse
     */
    CompletableFuture<Personalizedtxt2imgQueryModelTrainJobListResponse> personalizedtxt2imgQueryModelTrainJobList(Personalizedtxt2imgQueryModelTrainJobListRequest request);

    /**
     * @param request the request parameters of Personalizedtxt2imgQueryModelTrainStatus  Personalizedtxt2imgQueryModelTrainStatusRequest
     * @return Personalizedtxt2imgQueryModelTrainStatusResponse
     */
    CompletableFuture<Personalizedtxt2imgQueryModelTrainStatusResponse> personalizedtxt2imgQueryModelTrainStatus(Personalizedtxt2imgQueryModelTrainStatusRequest request);

    /**
     * @param request the request parameters of QueryApplicationAccessId  QueryApplicationAccessIdRequest
     * @return QueryApplicationAccessIdResponse
     */
    CompletableFuture<QueryApplicationAccessIdResponse> queryApplicationAccessId(QueryApplicationAccessIdRequest request);

    /**
     * @param request the request parameters of QueryProject  QueryProjectRequest
     * @return QueryProjectResponse
     */
    CompletableFuture<QueryProjectResponse> queryProject(QueryProjectRequest request);

    /**
     * @param request the request parameters of QueryProjectList  QueryProjectListRequest
     * @return QueryProjectListResponse
     */
    CompletableFuture<QueryProjectListResponse> queryProjectList(QueryProjectListRequest request);

    /**
     * @param request the request parameters of QueryPurchasedService  QueryPurchasedServiceRequest
     * @return QueryPurchasedServiceResponse
     */
    CompletableFuture<QueryPurchasedServiceResponse> queryPurchasedService(QueryPurchasedServiceRequest request);

    /**
     * @param request the request parameters of UpdateProject  UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    CompletableFuture<UpdateProjectResponse> updateProject(UpdateProjectRequest request);

}
