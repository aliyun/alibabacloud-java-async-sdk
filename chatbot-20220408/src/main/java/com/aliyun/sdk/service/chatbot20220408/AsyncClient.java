// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.chatbot20220408.models.*;
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
     * @param request the request parameters of ApplyForStreamAccessToken  ApplyForStreamAccessTokenRequest
     * @return ApplyForStreamAccessTokenResponse
     */
    CompletableFuture<ApplyForStreamAccessTokenResponse> applyForStreamAccessToken(ApplyForStreamAccessTokenRequest request);

    /**
     * @param request the request parameters of Associate  AssociateRequest
     * @return AssociateResponse
     */
    CompletableFuture<AssociateResponse> associate(AssociateRequest request);

    /**
     * @param request the request parameters of BeginSession  BeginSessionRequest
     * @return BeginSessionResponse
     */
    CompletableFuture<BeginSessionResponse> beginSession(BeginSessionRequest request);

    /**
     * @param request the request parameters of CancelInstancePublishTask  CancelInstancePublishTaskRequest
     * @return CancelInstancePublishTaskResponse
     */
    CompletableFuture<CancelInstancePublishTaskResponse> cancelInstancePublishTask(CancelInstancePublishTaskRequest request);

    /**
     * @param request the request parameters of CancelPublishTask  CancelPublishTaskRequest
     * @return CancelPublishTaskResponse
     */
    CompletableFuture<CancelPublishTaskResponse> cancelPublishTask(CancelPublishTaskRequest request);

    /**
     * @param request the request parameters of Chat  ChatRequest
     * @return ChatResponse
     */
    CompletableFuture<ChatResponse> chat(ChatRequest request);

    /**
     * @param request the request parameters of ContinueInstancePublishTask  ContinueInstancePublishTaskRequest
     * @return ContinueInstancePublishTaskResponse
     */
    CompletableFuture<ContinueInstancePublishTaskResponse> continueInstancePublishTask(ContinueInstancePublishTaskRequest request);

    /**
     * @param request the request parameters of CreateCategory  CreateCategoryRequest
     * @return CreateCategoryResponse
     */
    CompletableFuture<CreateCategoryResponse> createCategory(CreateCategoryRequest request);

    /**
     * @param request the request parameters of CreateConnQuestion  CreateConnQuestionRequest
     * @return CreateConnQuestionResponse
     */
    CompletableFuture<CreateConnQuestionResponse> createConnQuestion(CreateConnQuestionRequest request);

    /**
     * @param request the request parameters of CreateDSEntity  CreateDSEntityRequest
     * @return CreateDSEntityResponse
     */
    CompletableFuture<CreateDSEntityResponse> createDSEntity(CreateDSEntityRequest request);

    /**
     * @param request the request parameters of CreateDSEntityValue  CreateDSEntityValueRequest
     * @return CreateDSEntityValueResponse
     */
    CompletableFuture<CreateDSEntityValueResponse> createDSEntityValue(CreateDSEntityValueRequest request);

    /**
     * @param request the request parameters of CreateDoc  CreateDocRequest
     * @return CreateDocResponse
     */
    CompletableFuture<CreateDocResponse> createDoc(CreateDocRequest request);

    /**
     * @param request the request parameters of CreateFaq  CreateFaqRequest
     * @return CreateFaqResponse
     */
    CompletableFuture<CreateFaqResponse> createFaq(CreateFaqRequest request);

    /**
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * @param request the request parameters of CreateInstancePublishTask  CreateInstancePublishTaskRequest
     * @return CreateInstancePublishTaskResponse
     */
    CompletableFuture<CreateInstancePublishTaskResponse> createInstancePublishTask(CreateInstancePublishTaskRequest request);

    /**
     * @param request the request parameters of CreateIntent  CreateIntentRequest
     * @return CreateIntentResponse
     */
    CompletableFuture<CreateIntentResponse> createIntent(CreateIntentRequest request);

    /**
     * @param request the request parameters of CreateLgf  CreateLgfRequest
     * @return CreateLgfResponse
     */
    CompletableFuture<CreateLgfResponse> createLgf(CreateLgfRequest request);

    /**
     * @param request the request parameters of CreatePerspective  CreatePerspectiveRequest
     * @return CreatePerspectiveResponse
     */
    CompletableFuture<CreatePerspectiveResponse> createPerspective(CreatePerspectiveRequest request);

    /**
     * @param request the request parameters of CreatePublishTask  CreatePublishTaskRequest
     * @return CreatePublishTaskResponse
     */
    CompletableFuture<CreatePublishTaskResponse> createPublishTask(CreatePublishTaskRequest request);

    /**
     * @param request the request parameters of CreateSimQuestion  CreateSimQuestionRequest
     * @return CreateSimQuestionResponse
     */
    CompletableFuture<CreateSimQuestionResponse> createSimQuestion(CreateSimQuestionRequest request);

    /**
     * @param request the request parameters of CreateSolution  CreateSolutionRequest
     * @return CreateSolutionResponse
     */
    CompletableFuture<CreateSolutionResponse> createSolution(CreateSolutionRequest request);

    /**
     * @param request the request parameters of CreateUserSay  CreateUserSayRequest
     * @return CreateUserSayResponse
     */
    CompletableFuture<CreateUserSayResponse> createUserSay(CreateUserSayRequest request);

    /**
     * @param request the request parameters of DeleteCategory  DeleteCategoryRequest
     * @return DeleteCategoryResponse
     */
    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    /**
     * @param request the request parameters of DeleteConnQuestion  DeleteConnQuestionRequest
     * @return DeleteConnQuestionResponse
     */
    CompletableFuture<DeleteConnQuestionResponse> deleteConnQuestion(DeleteConnQuestionRequest request);

    /**
     * @param request the request parameters of DeleteDSEntity  DeleteDSEntityRequest
     * @return DeleteDSEntityResponse
     */
    CompletableFuture<DeleteDSEntityResponse> deleteDSEntity(DeleteDSEntityRequest request);

    /**
     * @param request the request parameters of DeleteDSEntityValue  DeleteDSEntityValueRequest
     * @return DeleteDSEntityValueResponse
     */
    CompletableFuture<DeleteDSEntityValueResponse> deleteDSEntityValue(DeleteDSEntityValueRequest request);

    /**
     * @param request the request parameters of DeleteDoc  DeleteDocRequest
     * @return DeleteDocResponse
     */
    CompletableFuture<DeleteDocResponse> deleteDoc(DeleteDocRequest request);

    /**
     * @param request the request parameters of DeleteFaq  DeleteFaqRequest
     * @return DeleteFaqResponse
     */
    CompletableFuture<DeleteFaqResponse> deleteFaq(DeleteFaqRequest request);

    /**
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * @param request the request parameters of DeleteIntent  DeleteIntentRequest
     * @return DeleteIntentResponse
     */
    CompletableFuture<DeleteIntentResponse> deleteIntent(DeleteIntentRequest request);

    /**
     * @param request the request parameters of DeleteLgf  DeleteLgfRequest
     * @return DeleteLgfResponse
     */
    CompletableFuture<DeleteLgfResponse> deleteLgf(DeleteLgfRequest request);

    /**
     * @param request the request parameters of DeletePerspective  DeletePerspectiveRequest
     * @return DeletePerspectiveResponse
     */
    CompletableFuture<DeletePerspectiveResponse> deletePerspective(DeletePerspectiveRequest request);

    /**
     * @param request the request parameters of DeleteSimQuestion  DeleteSimQuestionRequest
     * @return DeleteSimQuestionResponse
     */
    CompletableFuture<DeleteSimQuestionResponse> deleteSimQuestion(DeleteSimQuestionRequest request);

    /**
     * @param request the request parameters of DeleteSolution  DeleteSolutionRequest
     * @return DeleteSolutionResponse
     */
    CompletableFuture<DeleteSolutionResponse> deleteSolution(DeleteSolutionRequest request);

    /**
     * @param request the request parameters of DeleteUserSay  DeleteUserSayRequest
     * @return DeleteUserSayResponse
     */
    CompletableFuture<DeleteUserSayResponse> deleteUserSay(DeleteUserSayRequest request);

    /**
     * @param request the request parameters of DescribeCategory  DescribeCategoryRequest
     * @return DescribeCategoryResponse
     */
    CompletableFuture<DescribeCategoryResponse> describeCategory(DescribeCategoryRequest request);

    /**
     * @param request the request parameters of DescribeDSEntity  DescribeDSEntityRequest
     * @return DescribeDSEntityResponse
     */
    CompletableFuture<DescribeDSEntityResponse> describeDSEntity(DescribeDSEntityRequest request);

    /**
     * @param request the request parameters of DescribeDoc  DescribeDocRequest
     * @return DescribeDocResponse
     */
    CompletableFuture<DescribeDocResponse> describeDoc(DescribeDocRequest request);

    /**
     * @param request the request parameters of DescribeFaq  DescribeFaqRequest
     * @return DescribeFaqResponse
     */
    CompletableFuture<DescribeFaqResponse> describeFaq(DescribeFaqRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeIntent  DescribeIntentRequest
     * @return DescribeIntentResponse
     */
    CompletableFuture<DescribeIntentResponse> describeIntent(DescribeIntentRequest request);

    /**
     * @param request the request parameters of DescribePerspective  DescribePerspectiveRequest
     * @return DescribePerspectiveResponse
     */
    CompletableFuture<DescribePerspectiveResponse> describePerspective(DescribePerspectiveRequest request);

    /**
     * @param request the request parameters of Feedback  FeedbackRequest
     * @return FeedbackResponse
     */
    CompletableFuture<FeedbackResponse> feedback(FeedbackRequest request);

    /**
     * @param request the request parameters of GenerateUserAccessToken  GenerateUserAccessTokenRequest
     * @return GenerateUserAccessTokenResponse
     */
    CompletableFuture<GenerateUserAccessTokenResponse> generateUserAccessToken(GenerateUserAccessTokenRequest request);

    /**
     * @param request the request parameters of GetAgentInfo  GetAgentInfoRequest
     * @return GetAgentInfoResponse
     */
    CompletableFuture<GetAgentInfoResponse> getAgentInfo(GetAgentInfoRequest request);

    /**
     * @param request the request parameters of GetAsyncResult  GetAsyncResultRequest
     * @return GetAsyncResultResponse
     */
    CompletableFuture<GetAsyncResultResponse> getAsyncResult(GetAsyncResultRequest request);

    /**
     * @param request the request parameters of GetBotSessionData  GetBotSessionDataRequest
     * @return GetBotSessionDataResponse
     */
    CompletableFuture<GetBotSessionDataResponse> getBotSessionData(GetBotSessionDataRequest request);

    /**
     * @param request the request parameters of GetInstancePublishTaskState  GetInstancePublishTaskStateRequest
     * @return GetInstancePublishTaskStateResponse
     */
    CompletableFuture<GetInstancePublishTaskStateResponse> getInstancePublishTaskState(GetInstancePublishTaskStateRequest request);

    /**
     * @param request the request parameters of GetPublishTaskState  GetPublishTaskStateRequest
     * @return GetPublishTaskStateResponse
     */
    CompletableFuture<GetPublishTaskStateResponse> getPublishTaskState(GetPublishTaskStateRequest request);

    /**
     * @param request the request parameters of InitIMConnect  InitIMConnectRequest
     * @return InitIMConnectResponse
     */
    CompletableFuture<InitIMConnectResponse> initIMConnect(InitIMConnectRequest request);

    /**
     * @param request the request parameters of LinkInstanceCategory  LinkInstanceCategoryRequest
     * @return LinkInstanceCategoryResponse
     */
    CompletableFuture<LinkInstanceCategoryResponse> linkInstanceCategory(LinkInstanceCategoryRequest request);

    /**
     * @param request the request parameters of ListAgent  ListAgentRequest
     * @return ListAgentResponse
     */
    CompletableFuture<ListAgentResponse> listAgent(ListAgentRequest request);

    /**
     * @param request the request parameters of ListCategory  ListCategoryRequest
     * @return ListCategoryResponse
     */
    CompletableFuture<ListCategoryResponse> listCategory(ListCategoryRequest request);

    /**
     * @param request the request parameters of ListConnQuestion  ListConnQuestionRequest
     * @return ListConnQuestionResponse
     */
    CompletableFuture<ListConnQuestionResponse> listConnQuestion(ListConnQuestionRequest request);

    /**
     * @param request the request parameters of ListDSEntity  ListDSEntityRequest
     * @return ListDSEntityResponse
     */
    CompletableFuture<ListDSEntityResponse> listDSEntity(ListDSEntityRequest request);

    /**
     * @param request the request parameters of ListDSEntityValue  ListDSEntityValueRequest
     * @return ListDSEntityValueResponse
     */
    CompletableFuture<ListDSEntityValueResponse> listDSEntityValue(ListDSEntityValueRequest request);

    /**
     * @param request the request parameters of ListInstance  ListInstanceRequest
     * @return ListInstanceResponse
     */
    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    /**
     * @param request the request parameters of ListIntent  ListIntentRequest
     * @return ListIntentResponse
     */
    CompletableFuture<ListIntentResponse> listIntent(ListIntentRequest request);

    /**
     * @param request the request parameters of ListLgf  ListLgfRequest
     * @return ListLgfResponse
     */
    CompletableFuture<ListLgfResponse> listLgf(ListLgfRequest request);

    /**
     * @param request the request parameters of ListSaasInfo  ListSaasInfoRequest
     * @return ListSaasInfoResponse
     */
    CompletableFuture<ListSaasInfoResponse> listSaasInfo(ListSaasInfoRequest request);

    /**
     * @param request the request parameters of ListSaasPermissionGroupInfos  ListSaasPermissionGroupInfosRequest
     * @return ListSaasPermissionGroupInfosResponse
     */
    CompletableFuture<ListSaasPermissionGroupInfosResponse> listSaasPermissionGroupInfos(ListSaasPermissionGroupInfosRequest request);

    /**
     * @param request the request parameters of ListSimQuestion  ListSimQuestionRequest
     * @return ListSimQuestionResponse
     */
    CompletableFuture<ListSimQuestionResponse> listSimQuestion(ListSimQuestionRequest request);

    /**
     * @param request the request parameters of ListSolution  ListSolutionRequest
     * @return ListSolutionResponse
     */
    CompletableFuture<ListSolutionResponse> listSolution(ListSolutionRequest request);

    /**
     * @param request the request parameters of ListTongyiChatHistorys  ListTongyiChatHistorysRequest
     * @return ListTongyiChatHistorysResponse
     */
    CompletableFuture<ListTongyiChatHistorysResponse> listTongyiChatHistorys(ListTongyiChatHistorysRequest request);

    /**
     * @param request the request parameters of ListTongyiConversationLogs  ListTongyiConversationLogsRequest
     * @return ListTongyiConversationLogsResponse
     */
    CompletableFuture<ListTongyiConversationLogsResponse> listTongyiConversationLogs(ListTongyiConversationLogsRequest request);

    /**
     * @param request the request parameters of ListUserSay  ListUserSayRequest
     * @return ListUserSayResponse
     */
    CompletableFuture<ListUserSayResponse> listUserSay(ListUserSayRequest request);

    /**
     * @param request the request parameters of Nlu  NluRequest
     * @return NluResponse
     */
    CompletableFuture<NluResponse> nlu(NluRequest request);

    /**
     * @param request the request parameters of QueryPerspectives  QueryPerspectivesRequest
     * @return QueryPerspectivesResponse
     */
    CompletableFuture<QueryPerspectivesResponse> queryPerspectives(QueryPerspectivesRequest request);

    /**
     * @param request the request parameters of RetryDoc  RetryDocRequest
     * @return RetryDocResponse
     */
    CompletableFuture<RetryDocResponse> retryDoc(RetryDocRequest request);

    /**
     * @param request the request parameters of SearchDoc  SearchDocRequest
     * @return SearchDocResponse
     */
    CompletableFuture<SearchDocResponse> searchDoc(SearchDocRequest request);

    /**
     * @param request the request parameters of SearchFaq  SearchFaqRequest
     * @return SearchFaqResponse
     */
    CompletableFuture<SearchFaqResponse> searchFaq(SearchFaqRequest request);

    /**
     * @param request the request parameters of UpdateCategory  UpdateCategoryRequest
     * @return UpdateCategoryResponse
     */
    CompletableFuture<UpdateCategoryResponse> updateCategory(UpdateCategoryRequest request);

    /**
     * @param request the request parameters of UpdateConnQuestion  UpdateConnQuestionRequest
     * @return UpdateConnQuestionResponse
     */
    CompletableFuture<UpdateConnQuestionResponse> updateConnQuestion(UpdateConnQuestionRequest request);

    /**
     * @param request the request parameters of UpdateDSEntity  UpdateDSEntityRequest
     * @return UpdateDSEntityResponse
     */
    CompletableFuture<UpdateDSEntityResponse> updateDSEntity(UpdateDSEntityRequest request);

    /**
     * @param request the request parameters of UpdateDSEntityValue  UpdateDSEntityValueRequest
     * @return UpdateDSEntityValueResponse
     */
    CompletableFuture<UpdateDSEntityValueResponse> updateDSEntityValue(UpdateDSEntityValueRequest request);

    /**
     * @param request the request parameters of UpdateDoc  UpdateDocRequest
     * @return UpdateDocResponse
     */
    CompletableFuture<UpdateDocResponse> updateDoc(UpdateDocRequest request);

    /**
     * @param request the request parameters of UpdateFaq  UpdateFaqRequest
     * @return UpdateFaqResponse
     */
    CompletableFuture<UpdateFaqResponse> updateFaq(UpdateFaqRequest request);

    /**
     * @param request the request parameters of UpdateInstance  UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    /**
     * @param request the request parameters of UpdateIntent  UpdateIntentRequest
     * @return UpdateIntentResponse
     */
    CompletableFuture<UpdateIntentResponse> updateIntent(UpdateIntentRequest request);

    /**
     * @param request the request parameters of UpdateLgf  UpdateLgfRequest
     * @return UpdateLgfResponse
     */
    CompletableFuture<UpdateLgfResponse> updateLgf(UpdateLgfRequest request);

    /**
     * @param request the request parameters of UpdatePerspective  UpdatePerspectiveRequest
     * @return UpdatePerspectiveResponse
     */
    CompletableFuture<UpdatePerspectiveResponse> updatePerspective(UpdatePerspectiveRequest request);

    /**
     * @param request the request parameters of UpdateSimQuestion  UpdateSimQuestionRequest
     * @return UpdateSimQuestionResponse
     */
    CompletableFuture<UpdateSimQuestionResponse> updateSimQuestion(UpdateSimQuestionRequest request);

    /**
     * @param request the request parameters of UpdateSolution  UpdateSolutionRequest
     * @return UpdateSolutionResponse
     */
    CompletableFuture<UpdateSolutionResponse> updateSolution(UpdateSolutionRequest request);

    /**
     * @param request the request parameters of UpdateUserSay  UpdateUserSayRequest
     * @return UpdateUserSayResponse
     */
    CompletableFuture<UpdateUserSayResponse> updateUserSay(UpdateUserSayRequest request);

}
