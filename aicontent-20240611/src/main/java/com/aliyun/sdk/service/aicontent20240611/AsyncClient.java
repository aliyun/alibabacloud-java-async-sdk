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
     * @param request the request parameters of ModelRouterBatchBindModelGroup  ModelRouterBatchBindModelGroupRequest
     * @return ModelRouterBatchBindModelGroupResponse
     */
    CompletableFuture<ModelRouterBatchBindModelGroupResponse> modelRouterBatchBindModelGroup(ModelRouterBatchBindModelGroupRequest request);

    /**
     * @param request the request parameters of ModelRouterBatchCreateMemberApiKeys  ModelRouterBatchCreateMemberApiKeysRequest
     * @return ModelRouterBatchCreateMemberApiKeysResponse
     */
    CompletableFuture<ModelRouterBatchCreateMemberApiKeysResponse> modelRouterBatchCreateMemberApiKeys(ModelRouterBatchCreateMemberApiKeysRequest request);

    /**
     * @param request the request parameters of ModelRouterBatchCreateModel  ModelRouterBatchCreateModelRequest
     * @return ModelRouterBatchCreateModelResponse
     */
    CompletableFuture<ModelRouterBatchCreateModelResponse> modelRouterBatchCreateModel(ModelRouterBatchCreateModelRequest request);

    /**
     * @param request the request parameters of ModelRouterBatchDisableMemberApiKeys  ModelRouterBatchDisableMemberApiKeysRequest
     * @return ModelRouterBatchDisableMemberApiKeysResponse
     */
    CompletableFuture<ModelRouterBatchDisableMemberApiKeysResponse> modelRouterBatchDisableMemberApiKeys(ModelRouterBatchDisableMemberApiKeysRequest request);

    /**
     * @param request the request parameters of ModelRouterBatchResetMemberAuthorization  ModelRouterBatchResetMemberAuthorizationRequest
     * @return ModelRouterBatchResetMemberAuthorizationResponse
     */
    CompletableFuture<ModelRouterBatchResetMemberAuthorizationResponse> modelRouterBatchResetMemberAuthorization(ModelRouterBatchResetMemberAuthorizationRequest request);

    /**
     * @param request the request parameters of ModelRouterBatchSetMemberAuthorization  ModelRouterBatchSetMemberAuthorizationRequest
     * @return ModelRouterBatchSetMemberAuthorizationResponse
     */
    CompletableFuture<ModelRouterBatchSetMemberAuthorizationResponse> modelRouterBatchSetMemberAuthorization(ModelRouterBatchSetMemberAuthorizationRequest request);

    /**
     * @param request the request parameters of ModelRouterBillingCostTabs  ModelRouterBillingCostTabsRequest
     * @return ModelRouterBillingCostTabsResponse
     */
    CompletableFuture<ModelRouterBillingCostTabsResponse> modelRouterBillingCostTabs(ModelRouterBillingCostTabsRequest request);

    /**
     * @param request the request parameters of ModelRouterChatCompletions  ModelRouterChatCompletionsRequest
     * @return ModelRouterChatCompletionsResponse
     */
    CompletableFuture<ModelRouterChatCompletionsResponse> modelRouterChatCompletions(ModelRouterChatCompletionsRequest request);

<ReturnT> CompletableFuture<ReturnT> modelRouterChatCompletionsWithAsyncResponseHandler(ModelRouterChatCompletionsRequest request, AsyncResponseHandler<ModelRouterChatCompletionsResponse, ReturnT> responseHandler);

    ResponseIterable<ModelRouterChatCompletionsResponseBody> modelRouterChatCompletionsWithResponseIterable(ModelRouterChatCompletionsRequest request);

    /**
     * @param request the request parameters of ModelRouterConfigureClientBalance  ModelRouterConfigureClientBalanceRequest
     * @return ModelRouterConfigureClientBalanceResponse
     */
    CompletableFuture<ModelRouterConfigureClientBalanceResponse> modelRouterConfigureClientBalance(ModelRouterConfigureClientBalanceRequest request);

    /**
     * @param request the request parameters of ModelRouterConfigureMemberBalance  ModelRouterConfigureMemberBalanceRequest
     * @return ModelRouterConfigureMemberBalanceResponse
     */
    CompletableFuture<ModelRouterConfigureMemberBalanceResponse> modelRouterConfigureMemberBalance(ModelRouterConfigureMemberBalanceRequest request);

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
     * @param request the request parameters of ModelRouterCreateBalanceTransaction  ModelRouterCreateBalanceTransactionRequest
     * @return ModelRouterCreateBalanceTransactionResponse
     */
    CompletableFuture<ModelRouterCreateBalanceTransactionResponse> modelRouterCreateBalanceTransaction(ModelRouterCreateBalanceTransactionRequest request);

    /**
     * @param request the request parameters of ModelRouterCreateBillingRule  ModelRouterCreateBillingRuleRequest
     * @return ModelRouterCreateBillingRuleResponse
     */
    CompletableFuture<ModelRouterCreateBillingRuleResponse> modelRouterCreateBillingRule(ModelRouterCreateBillingRuleRequest request);

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
     * @param request the request parameters of ModelRouterCreateMemberApiKey  ModelRouterCreateMemberApiKeyRequest
     * @return ModelRouterCreateMemberApiKeyResponse
     */
    CompletableFuture<ModelRouterCreateMemberApiKeyResponse> modelRouterCreateMemberApiKey(ModelRouterCreateMemberApiKeyRequest request);

    /**
     * @param request the request parameters of ModelRouterCreateMemberBalanceTransaction  ModelRouterCreateMemberBalanceTransactionRequest
     * @return ModelRouterCreateMemberBalanceTransactionResponse
     */
    CompletableFuture<ModelRouterCreateMemberBalanceTransactionResponse> modelRouterCreateMemberBalanceTransaction(ModelRouterCreateMemberBalanceTransactionRequest request);

    /**
     * @param request the request parameters of ModelRouterCreateMemberSubscription  ModelRouterCreateMemberSubscriptionRequest
     * @return ModelRouterCreateMemberSubscriptionResponse
     */
    CompletableFuture<ModelRouterCreateMemberSubscriptionResponse> modelRouterCreateMemberSubscription(ModelRouterCreateMemberSubscriptionRequest request);

    /**
     * @param request the request parameters of ModelRouterCreateModel  ModelRouterCreateModelRequest
     * @return ModelRouterCreateModelResponse
     */
    CompletableFuture<ModelRouterCreateModelResponse> modelRouterCreateModel(ModelRouterCreateModelRequest request);

    /**
     * @param request the request parameters of ModelRouterCreateModelGroup  ModelRouterCreateModelGroupRequest
     * @return ModelRouterCreateModelGroupResponse
     */
    CompletableFuture<ModelRouterCreateModelGroupResponse> modelRouterCreateModelGroup(ModelRouterCreateModelGroupRequest request);

    /**
     * @param request the request parameters of ModelRouterCreateSubscription  ModelRouterCreateSubscriptionRequest
     * @return ModelRouterCreateSubscriptionResponse
     */
    CompletableFuture<ModelRouterCreateSubscriptionResponse> modelRouterCreateSubscription(ModelRouterCreateSubscriptionRequest request);

    /**
     * @param request the request parameters of ModelRouterCreateUser  ModelRouterCreateUserRequest
     * @return ModelRouterCreateUserResponse
     */
    CompletableFuture<ModelRouterCreateUserResponse> modelRouterCreateUser(ModelRouterCreateUserRequest request);

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
     * @param request the request parameters of ModelRouterDeleteModelGroup  ModelRouterDeleteModelGroupRequest
     * @return ModelRouterDeleteModelGroupResponse
     */
    CompletableFuture<ModelRouterDeleteModelGroupResponse> modelRouterDeleteModelGroup(ModelRouterDeleteModelGroupRequest request);

    /**
     * @param request the request parameters of ModelRouterDeleteUser  ModelRouterDeleteUserRequest
     * @return ModelRouterDeleteUserResponse
     */
    CompletableFuture<ModelRouterDeleteUserResponse> modelRouterDeleteUser(ModelRouterDeleteUserRequest request);

    /**
     * @param request the request parameters of ModelRouterExportMemberBalanceOrders  ModelRouterExportMemberBalanceOrdersRequest
     * @return ModelRouterExportMemberBalanceOrdersResponse
     */
    CompletableFuture<ModelRouterExportMemberBalanceOrdersResponse> modelRouterExportMemberBalanceOrders(ModelRouterExportMemberBalanceOrdersRequest request);

    /**
     * @param request the request parameters of ModelRouterGetBillingBillSummary  ModelRouterGetBillingBillSummaryRequest
     * @return ModelRouterGetBillingBillSummaryResponse
     */
    CompletableFuture<ModelRouterGetBillingBillSummaryResponse> modelRouterGetBillingBillSummary(ModelRouterGetBillingBillSummaryRequest request);

    /**
     * @param request the request parameters of ModelRouterGetClientBalance  ModelRouterGetClientBalanceRequest
     * @return ModelRouterGetClientBalanceResponse
     */
    CompletableFuture<ModelRouterGetClientBalanceResponse> modelRouterGetClientBalance(ModelRouterGetClientBalanceRequest request);

    /**
     * @param request the request parameters of ModelRouterGetClientBalanceLogs  ModelRouterGetClientBalanceLogsRequest
     * @return ModelRouterGetClientBalanceLogsResponse
     */
    CompletableFuture<ModelRouterGetClientBalanceLogsResponse> modelRouterGetClientBalanceLogs(ModelRouterGetClientBalanceLogsRequest request);

    /**
     * @param request the request parameters of ModelRouterGetDeptBalanceSummary  ModelRouterGetDeptBalanceSummaryRequest
     * @return ModelRouterGetDeptBalanceSummaryResponse
     */
    CompletableFuture<ModelRouterGetDeptBalanceSummaryResponse> modelRouterGetDeptBalanceSummary(ModelRouterGetDeptBalanceSummaryRequest request);

    /**
     * @param request the request parameters of ModelRouterGetMemberApiKeys  ModelRouterGetMemberApiKeysRequest
     * @return ModelRouterGetMemberApiKeysResponse
     */
    CompletableFuture<ModelRouterGetMemberApiKeysResponse> modelRouterGetMemberApiKeys(ModelRouterGetMemberApiKeysRequest request);

    /**
     * @param request the request parameters of ModelRouterGetMemberBalance  ModelRouterGetMemberBalanceRequest
     * @return ModelRouterGetMemberBalanceResponse
     */
    CompletableFuture<ModelRouterGetMemberBalanceResponse> modelRouterGetMemberBalance(ModelRouterGetMemberBalanceRequest request);

    /**
     * @param request the request parameters of ModelRouterGetMemberBalanceLogs  ModelRouterGetMemberBalanceLogsRequest
     * @return ModelRouterGetMemberBalanceLogsResponse
     */
    CompletableFuture<ModelRouterGetMemberBalanceLogsResponse> modelRouterGetMemberBalanceLogs(ModelRouterGetMemberBalanceLogsRequest request);

    /**
     * @param request the request parameters of ModelRouterGetUserRoles  ModelRouterGetUserRolesRequest
     * @return ModelRouterGetUserRolesResponse
     */
    CompletableFuture<ModelRouterGetUserRolesResponse> modelRouterGetUserRoles(ModelRouterGetUserRolesRequest request);

    /**
     * @param request the request parameters of ModelRouterListBalanceOrders  ModelRouterListBalanceOrdersRequest
     * @return ModelRouterListBalanceOrdersResponse
     */
    CompletableFuture<ModelRouterListBalanceOrdersResponse> modelRouterListBalanceOrders(ModelRouterListBalanceOrdersRequest request);

    /**
     * @param request the request parameters of ModelRouterListDeptMembers  ModelRouterListDeptMembersRequest
     * @return ModelRouterListDeptMembersResponse
     */
    CompletableFuture<ModelRouterListDeptMembersResponse> modelRouterListDeptMembers(ModelRouterListDeptMembersRequest request);

    /**
     * @param request the request parameters of ModelRouterListMemberBalanceOrders  ModelRouterListMemberBalanceOrdersRequest
     * @return ModelRouterListMemberBalanceOrdersResponse
     */
    CompletableFuture<ModelRouterListMemberBalanceOrdersResponse> modelRouterListMemberBalanceOrders(ModelRouterListMemberBalanceOrdersRequest request);

    /**
     * @param request the request parameters of ModelRouterListMemberSubscriptions  ModelRouterListMemberSubscriptionsRequest
     * @return ModelRouterListMemberSubscriptionsResponse
     */
    CompletableFuture<ModelRouterListMemberSubscriptionsResponse> modelRouterListMemberSubscriptions(ModelRouterListMemberSubscriptionsRequest request);

    /**
     * @param request the request parameters of ModelRouterListSubscriptions  ModelRouterListSubscriptionsRequest
     * @return ModelRouterListSubscriptionsResponse
     */
    CompletableFuture<ModelRouterListSubscriptionsResponse> modelRouterListSubscriptions(ModelRouterListSubscriptionsRequest request);

    /**
     * @param request the request parameters of ModelRouterMiguDownloadSource  ModelRouterMiguDownloadSourceRequest
     * @return ModelRouterMiguDownloadSourceResponse
     */
    CompletableFuture<ModelRouterMiguDownloadSourceResponse> modelRouterMiguDownloadSource(ModelRouterMiguDownloadSourceRequest request);

    /**
     * @param request the request parameters of ModelRouterMiguUploadSource  ModelRouterMiguUploadSourceRequest
     * @return ModelRouterMiguUploadSourceResponse
     */
    CompletableFuture<ModelRouterMiguUploadSourceResponse> modelRouterMiguUploadSource(ModelRouterMiguUploadSourceRequest request);

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
     * @param request the request parameters of ModelRouterQueryBillingCostBreakdown  ModelRouterQueryBillingCostBreakdownRequest
     * @return ModelRouterQueryBillingCostBreakdownResponse
     */
    CompletableFuture<ModelRouterQueryBillingCostBreakdownResponse> modelRouterQueryBillingCostBreakdown(ModelRouterQueryBillingCostBreakdownRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryBillingDetails  ModelRouterQueryBillingDetailsRequest
     * @return ModelRouterQueryBillingDetailsResponse
     */
    CompletableFuture<ModelRouterQueryBillingDetailsResponse> modelRouterQueryBillingDetails(ModelRouterQueryBillingDetailsRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryBillingRuleList  ModelRouterQueryBillingRuleListRequest
     * @return ModelRouterQueryBillingRuleListResponse
     */
    CompletableFuture<ModelRouterQueryBillingRuleListResponse> modelRouterQueryBillingRuleList(ModelRouterQueryBillingRuleListRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryClientDiscountLogs  ModelRouterQueryClientDiscountLogsRequest
     * @return ModelRouterQueryClientDiscountLogsResponse
     */
    CompletableFuture<ModelRouterQueryClientDiscountLogsResponse> modelRouterQueryClientDiscountLogs(ModelRouterQueryClientDiscountLogsRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryClientList  ModelRouterQueryClientListRequest
     * @return ModelRouterQueryClientListResponse
     */
    CompletableFuture<ModelRouterQueryClientListResponse> modelRouterQueryClientList(ModelRouterQueryClientListRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryClientTree  ModelRouterQueryClientTreeRequest
     * @return ModelRouterQueryClientTreeResponse
     */
    CompletableFuture<ModelRouterQueryClientTreeResponse> modelRouterQueryClientTree(ModelRouterQueryClientTreeRequest request);

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
     * @param request the request parameters of ModelRouterQueryCostModelDetail  ModelRouterQueryCostModelDetailRequest
     * @return ModelRouterQueryCostModelDetailResponse
     */
    CompletableFuture<ModelRouterQueryCostModelDetailResponse> modelRouterQueryCostModelDetail(ModelRouterQueryCostModelDetailRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryCostModelList  ModelRouterQueryCostModelListRequest
     * @return ModelRouterQueryCostModelListResponse
     */
    CompletableFuture<ModelRouterQueryCostModelListResponse> modelRouterQueryCostModelList(ModelRouterQueryCostModelListRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryCostOverviewMetrics  ModelRouterQueryCostOverviewMetricsRequest
     * @return ModelRouterQueryCostOverviewMetricsResponse
     */
    CompletableFuture<ModelRouterQueryCostOverviewMetricsResponse> modelRouterQueryCostOverviewMetrics(ModelRouterQueryCostOverviewMetricsRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryCostTrendMetrics  ModelRouterQueryCostTrendMetricsRequest
     * @return ModelRouterQueryCostTrendMetricsResponse
     */
    CompletableFuture<ModelRouterQueryCostTrendMetricsResponse> modelRouterQueryCostTrendMetrics(ModelRouterQueryCostTrendMetricsRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryModel  ModelRouterQueryModelRequest
     * @return ModelRouterQueryModelResponse
     */
    CompletableFuture<ModelRouterQueryModelResponse> modelRouterQueryModel(ModelRouterQueryModelRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryModelGroup  ModelRouterQueryModelGroupRequest
     * @return ModelRouterQueryModelGroupResponse
     */
    CompletableFuture<ModelRouterQueryModelGroupResponse> modelRouterQueryModelGroup(ModelRouterQueryModelGroupRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryModelGroupClients  ModelRouterQueryModelGroupClientsRequest
     * @return ModelRouterQueryModelGroupClientsResponse
     */
    CompletableFuture<ModelRouterQueryModelGroupClientsResponse> modelRouterQueryModelGroupClients(ModelRouterQueryModelGroupClientsRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryModelGroupList  ModelRouterQueryModelGroupListRequest
     * @return ModelRouterQueryModelGroupListResponse
     */
    CompletableFuture<ModelRouterQueryModelGroupListResponse> modelRouterQueryModelGroupList(ModelRouterQueryModelGroupListRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryModelGroupModels  ModelRouterQueryModelGroupModelsRequest
     * @return ModelRouterQueryModelGroupModelsResponse
     */
    CompletableFuture<ModelRouterQueryModelGroupModelsResponse> modelRouterQueryModelGroupModels(ModelRouterQueryModelGroupModelsRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryModelGroupUsers  ModelRouterQueryModelGroupUsersRequest
     * @return ModelRouterQueryModelGroupUsersResponse
     */
    CompletableFuture<ModelRouterQueryModelGroupUsersResponse> modelRouterQueryModelGroupUsers(ModelRouterQueryModelGroupUsersRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryModelGroupsByApiKey  ModelRouterQueryModelGroupsByApiKeyRequest
     * @return ModelRouterQueryModelGroupsByApiKeyResponse
     */
    CompletableFuture<ModelRouterQueryModelGroupsByApiKeyResponse> modelRouterQueryModelGroupsByApiKey(ModelRouterQueryModelGroupsByApiKeyRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryModelList  ModelRouterQueryModelListRequest
     * @return ModelRouterQueryModelListResponse
     */
    CompletableFuture<ModelRouterQueryModelListResponse> modelRouterQueryModelList(ModelRouterQueryModelListRequest request);

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
     * @param request the request parameters of ModelRouterQueryUsageBreakdown  ModelRouterQueryUsageBreakdownRequest
     * @return ModelRouterQueryUsageBreakdownResponse
     */
    CompletableFuture<ModelRouterQueryUsageBreakdownResponse> modelRouterQueryUsageBreakdown(ModelRouterQueryUsageBreakdownRequest request);

    /**
     * @param request the request parameters of ModelRouterQueryUserList  ModelRouterQueryUserListRequest
     * @return ModelRouterQueryUserListResponse
     */
    CompletableFuture<ModelRouterQueryUserListResponse> modelRouterQueryUserList(ModelRouterQueryUserListRequest request);

    /**
     * @param request the request parameters of ModelRouterResetMemberAuthorization  ModelRouterResetMemberAuthorizationRequest
     * @return ModelRouterResetMemberAuthorizationResponse
     */
    CompletableFuture<ModelRouterResetMemberAuthorizationResponse> modelRouterResetMemberAuthorization(ModelRouterResetMemberAuthorizationRequest request);

    /**
     * @param request the request parameters of ModelRouterSaveFlowConfig  ModelRouterSaveFlowConfigRequest
     * @return ModelRouterSaveFlowConfigResponse
     */
    CompletableFuture<ModelRouterSaveFlowConfigResponse> modelRouterSaveFlowConfig(ModelRouterSaveFlowConfigRequest request);

    /**
     * @param request the request parameters of ModelRouterSearchClientTree  ModelRouterSearchClientTreeRequest
     * @return ModelRouterSearchClientTreeResponse
     */
    CompletableFuture<ModelRouterSearchClientTreeResponse> modelRouterSearchClientTree(ModelRouterSearchClientTreeRequest request);

    /**
     * @param request the request parameters of ModelRouterSetMemberAuthorization  ModelRouterSetMemberAuthorizationRequest
     * @return ModelRouterSetMemberAuthorizationResponse
     */
    CompletableFuture<ModelRouterSetMemberAuthorizationResponse> modelRouterSetMemberAuthorization(ModelRouterSetMemberAuthorizationRequest request);

    /**
     * @param request the request parameters of ModelRouterSetUserRoles  ModelRouterSetUserRolesRequest
     * @return ModelRouterSetUserRolesResponse
     */
    CompletableFuture<ModelRouterSetUserRolesResponse> modelRouterSetUserRoles(ModelRouterSetUserRolesRequest request);

    /**
     * @param request the request parameters of ModelRouterStopMemberSubscription  ModelRouterStopMemberSubscriptionRequest
     * @return ModelRouterStopMemberSubscriptionResponse
     */
    CompletableFuture<ModelRouterStopMemberSubscriptionResponse> modelRouterStopMemberSubscription(ModelRouterStopMemberSubscriptionRequest request);

    /**
     * @param request the request parameters of ModelRouterStopSubscription  ModelRouterStopSubscriptionRequest
     * @return ModelRouterStopSubscriptionResponse
     */
    CompletableFuture<ModelRouterStopSubscriptionResponse> modelRouterStopSubscription(ModelRouterStopSubscriptionRequest request);

    /**
     * @param request the request parameters of ModelRouterTransferToMember  ModelRouterTransferToMemberRequest
     * @return ModelRouterTransferToMemberResponse
     */
    CompletableFuture<ModelRouterTransferToMemberResponse> modelRouterTransferToMember(ModelRouterTransferToMemberRequest request);

    /**
     * @param request the request parameters of ModelRouterUpdateApiKeyStatus  ModelRouterUpdateApiKeyStatusRequest
     * @return ModelRouterUpdateApiKeyStatusResponse
     */
    CompletableFuture<ModelRouterUpdateApiKeyStatusResponse> modelRouterUpdateApiKeyStatus(ModelRouterUpdateApiKeyStatusRequest request);

    /**
     * @param request the request parameters of ModelRouterUpdateBillingRule  ModelRouterUpdateBillingRuleRequest
     * @return ModelRouterUpdateBillingRuleResponse
     */
    CompletableFuture<ModelRouterUpdateBillingRuleResponse> modelRouterUpdateBillingRule(ModelRouterUpdateBillingRuleRequest request);

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
     * @param request the request parameters of ModelRouterUpdateModelGroup  ModelRouterUpdateModelGroupRequest
     * @return ModelRouterUpdateModelGroupResponse
     */
    CompletableFuture<ModelRouterUpdateModelGroupResponse> modelRouterUpdateModelGroup(ModelRouterUpdateModelGroupRequest request);

    /**
     * @param request the request parameters of ModelRouterUpdateUser  ModelRouterUpdateUserRequest
     * @return ModelRouterUpdateUserResponse
     */
    CompletableFuture<ModelRouterUpdateUserResponse> modelRouterUpdateUser(ModelRouterUpdateUserRequest request);

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
