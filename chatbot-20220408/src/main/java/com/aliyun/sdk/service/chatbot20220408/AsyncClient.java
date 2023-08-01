// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.chatbot20220408.models.*;
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

    CompletableFuture<AssociateResponse> associate(AssociateRequest request);

    CompletableFuture<BeginSessionResponse> beginSession(BeginSessionRequest request);

    CompletableFuture<CancelInstancePublishTaskResponse> cancelInstancePublishTask(CancelInstancePublishTaskRequest request);

    CompletableFuture<CancelPublishTaskResponse> cancelPublishTask(CancelPublishTaskRequest request);

    CompletableFuture<ChatResponse> chat(ChatRequest request);

    CompletableFuture<ContinueInstancePublishTaskResponse> continueInstancePublishTask(ContinueInstancePublishTaskRequest request);

    CompletableFuture<CreateCategoryResponse> createCategory(CreateCategoryRequest request);

    CompletableFuture<CreateConnQuestionResponse> createConnQuestion(CreateConnQuestionRequest request);

    CompletableFuture<CreateDSEntityResponse> createDSEntity(CreateDSEntityRequest request);

    CompletableFuture<CreateDSEntityValueResponse> createDSEntityValue(CreateDSEntityValueRequest request);

    CompletableFuture<CreateFaqResponse> createFaq(CreateFaqRequest request);

    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    CompletableFuture<CreateInstancePublishTaskResponse> createInstancePublishTask(CreateInstancePublishTaskRequest request);

    CompletableFuture<CreateIntentResponse> createIntent(CreateIntentRequest request);

    CompletableFuture<CreateLgfResponse> createLgf(CreateLgfRequest request);

    CompletableFuture<CreatePerspectiveResponse> createPerspective(CreatePerspectiveRequest request);

    CompletableFuture<CreatePublishTaskResponse> createPublishTask(CreatePublishTaskRequest request);

    CompletableFuture<CreateSimQuestionResponse> createSimQuestion(CreateSimQuestionRequest request);

    CompletableFuture<CreateSolutionResponse> createSolution(CreateSolutionRequest request);

    CompletableFuture<CreateUserSayResponse> createUserSay(CreateUserSayRequest request);

    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    CompletableFuture<DeleteConnQuestionResponse> deleteConnQuestion(DeleteConnQuestionRequest request);

    CompletableFuture<DeleteDSEntityResponse> deleteDSEntity(DeleteDSEntityRequest request);

    CompletableFuture<DeleteDSEntityValueResponse> deleteDSEntityValue(DeleteDSEntityValueRequest request);

    CompletableFuture<DeleteFaqResponse> deleteFaq(DeleteFaqRequest request);

    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    CompletableFuture<DeleteIntentResponse> deleteIntent(DeleteIntentRequest request);

    CompletableFuture<DeleteLgfResponse> deleteLgf(DeleteLgfRequest request);

    CompletableFuture<DeletePerspectiveResponse> deletePerspective(DeletePerspectiveRequest request);

    CompletableFuture<DeleteSimQuestionResponse> deleteSimQuestion(DeleteSimQuestionRequest request);

    CompletableFuture<DeleteSolutionResponse> deleteSolution(DeleteSolutionRequest request);

    CompletableFuture<DeleteUserSayResponse> deleteUserSay(DeleteUserSayRequest request);

    CompletableFuture<DescribeCategoryResponse> describeCategory(DescribeCategoryRequest request);

    CompletableFuture<DescribeDSEntityResponse> describeDSEntity(DescribeDSEntityRequest request);

    CompletableFuture<DescribeFaqResponse> describeFaq(DescribeFaqRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeIntentResponse> describeIntent(DescribeIntentRequest request);

    CompletableFuture<DescribePerspectiveResponse> describePerspective(DescribePerspectiveRequest request);

    CompletableFuture<FeedbackResponse> feedback(FeedbackRequest request);

    CompletableFuture<GenerateUserAccessTokenResponse> generateUserAccessToken(GenerateUserAccessTokenRequest request);

    CompletableFuture<GetAgentInfoResponse> getAgentInfo(GetAgentInfoRequest request);

    CompletableFuture<GetAsyncResultResponse> getAsyncResult(GetAsyncResultRequest request);

    CompletableFuture<GetInstancePublishTaskStateResponse> getInstancePublishTaskState(GetInstancePublishTaskStateRequest request);

    CompletableFuture<GetPublishTaskStateResponse> getPublishTaskState(GetPublishTaskStateRequest request);

    CompletableFuture<InitIMConnectResponse> initIMConnect(InitIMConnectRequest request);

    CompletableFuture<LinkInstanceCategoryResponse> linkInstanceCategory(LinkInstanceCategoryRequest request);

    CompletableFuture<ListAgentResponse> listAgent(ListAgentRequest request);

    CompletableFuture<ListCategoryResponse> listCategory(ListCategoryRequest request);

    CompletableFuture<ListConnQuestionResponse> listConnQuestion(ListConnQuestionRequest request);

    CompletableFuture<ListDSEntityResponse> listDSEntity(ListDSEntityRequest request);

    CompletableFuture<ListDSEntityValueResponse> listDSEntityValue(ListDSEntityValueRequest request);

    CompletableFuture<ListInstanceResponse> listInstance(ListInstanceRequest request);

    CompletableFuture<ListIntentResponse> listIntent(ListIntentRequest request);

    CompletableFuture<ListLgfResponse> listLgf(ListLgfRequest request);

    CompletableFuture<ListSaasInfoResponse> listSaasInfo(ListSaasInfoRequest request);

    CompletableFuture<ListSaasPermissionGroupInfosResponse> listSaasPermissionGroupInfos(ListSaasPermissionGroupInfosRequest request);

    CompletableFuture<ListSimQuestionResponse> listSimQuestion(ListSimQuestionRequest request);

    CompletableFuture<ListSolutionResponse> listSolution(ListSolutionRequest request);

    CompletableFuture<ListUserSayResponse> listUserSay(ListUserSayRequest request);

    CompletableFuture<NluResponse> nlu(NluRequest request);

    CompletableFuture<QueryPerspectivesResponse> queryPerspectives(QueryPerspectivesRequest request);

    CompletableFuture<SearchFaqResponse> searchFaq(SearchFaqRequest request);

    CompletableFuture<UpdateCategoryResponse> updateCategory(UpdateCategoryRequest request);

    CompletableFuture<UpdateConnQuestionResponse> updateConnQuestion(UpdateConnQuestionRequest request);

    CompletableFuture<UpdateDSEntityResponse> updateDSEntity(UpdateDSEntityRequest request);

    CompletableFuture<UpdateDSEntityValueResponse> updateDSEntityValue(UpdateDSEntityValueRequest request);

    CompletableFuture<UpdateFaqResponse> updateFaq(UpdateFaqRequest request);

    CompletableFuture<UpdateInstanceResponse> updateInstance(UpdateInstanceRequest request);

    CompletableFuture<UpdateIntentResponse> updateIntent(UpdateIntentRequest request);

    CompletableFuture<UpdateLgfResponse> updateLgf(UpdateLgfRequest request);

    CompletableFuture<UpdatePerspectiveResponse> updatePerspective(UpdatePerspectiveRequest request);

    CompletableFuture<UpdateSimQuestionResponse> updateSimQuestion(UpdateSimQuestionRequest request);

    CompletableFuture<UpdateSolutionResponse> updateSolution(UpdateSolutionRequest request);

    CompletableFuture<UpdateUserSayResponse> updateUserSay(UpdateUserSayRequest request);

}
