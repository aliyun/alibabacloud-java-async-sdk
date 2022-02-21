// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.chatbot20171011.models.*;
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

    CompletableFuture<ActivatePerspectiveResponse> activatePerspective(ActivatePerspectiveRequest request);

    CompletableFuture<AddSynonymResponse> addSynonym(AddSynonymRequest request);

    CompletableFuture<AppendEntityMemberResponse> appendEntityMember(AppendEntityMemberRequest request);

    CompletableFuture<AssociateResponse> associate(AssociateRequest request);

    CompletableFuture<ChatResponse> chat(ChatRequest request);

    CompletableFuture<CreateBizDataRangeResponse> createBizDataRange(CreateBizDataRangeRequest request);

    CompletableFuture<CreateBotResponse> createBot(CreateBotRequest request);

    CompletableFuture<CreateCategoryResponse> createCategory(CreateCategoryRequest request);

    CompletableFuture<CreateClusterLoopResponse> createClusterLoop(CreateClusterLoopRequest request);

    CompletableFuture<CreateCoreWordResponse> createCoreWord(CreateCoreWordRequest request);

    CompletableFuture<CreateDialogResponse> createDialog(CreateDialogRequest request);

    CompletableFuture<CreateEntityResponse> createEntity(CreateEntityRequest request);

    CompletableFuture<CreateIntentResponse> createIntent(CreateIntentRequest request);

    CompletableFuture<CreateKnowledgeResponse> createKnowledge(CreateKnowledgeRequest request);

    CompletableFuture<CreatePerspectiveResponse> createPerspective(CreatePerspectiveRequest request);

    CompletableFuture<CreateSimilarityLoopResponse> createSimilarityLoop(CreateSimilarityLoopRequest request);

    CompletableFuture<DeleteBizDataRangeResponse> deleteBizDataRange(DeleteBizDataRangeRequest request);

    CompletableFuture<DeleteBotResponse> deleteBot(DeleteBotRequest request);

    CompletableFuture<DeleteCategoryResponse> deleteCategory(DeleteCategoryRequest request);

    CompletableFuture<DeleteCoreWordResponse> deleteCoreWord(DeleteCoreWordRequest request);

    CompletableFuture<DeleteDialogResponse> deleteDialog(DeleteDialogRequest request);

    CompletableFuture<DeleteEntityResponse> deleteEntity(DeleteEntityRequest request);

    CompletableFuture<DeleteIntentResponse> deleteIntent(DeleteIntentRequest request);

    CompletableFuture<DeleteKnowledgeResponse> deleteKnowledge(DeleteKnowledgeRequest request);

    CompletableFuture<DescribeBizDataRangeResponse> describeBizDataRange(DescribeBizDataRangeRequest request);

    CompletableFuture<DescribeBotResponse> describeBot(DescribeBotRequest request);

    CompletableFuture<DescribeCategoryResponse> describeCategory(DescribeCategoryRequest request);

    CompletableFuture<DescribeCoreWordResponse> describeCoreWord(DescribeCoreWordRequest request);

    CompletableFuture<DescribeDialogResponse> describeDialog(DescribeDialogRequest request);

    CompletableFuture<DescribeDialogFlowResponse> describeDialogFlow(DescribeDialogFlowRequest request);

    CompletableFuture<DescribeEntitiesResponse> describeEntities(DescribeEntitiesRequest request);

    CompletableFuture<DescribeIntentResponse> describeIntent(DescribeIntentRequest request);

    CompletableFuture<DescribeKnowledgeResponse> describeKnowledge(DescribeKnowledgeRequest request);

    CompletableFuture<DescribePerspectiveResponse> describePerspective(DescribePerspectiveRequest request);

    CompletableFuture<DisableDialogFlowResponse> disableDialogFlow(DisableDialogFlowRequest request);

    CompletableFuture<DisableKnowledgeResponse> disableKnowledge(DisableKnowledgeRequest request);

    CompletableFuture<FeedbackResponse> feedback(FeedbackRequest request);

    CompletableFuture<GetAsyncResultResponse> getAsyncResult(GetAsyncResultRequest request);

    CompletableFuture<GetBotChatDataResponse> getBotChatData(GetBotChatDataRequest request);

    CompletableFuture<GetBotDsStatDataResponse> getBotDsStatData(GetBotDsStatDataRequest request);

    CompletableFuture<GetBotKnowledgeStatDataResponse> getBotKnowledgeStatData(GetBotKnowledgeStatDataRequest request);

    CompletableFuture<GetBotSessionDataResponse> getBotSessionData(GetBotSessionDataRequest request);

    CompletableFuture<GetConversationListResponse> getConversationList(GetConversationListRequest request);

    CompletableFuture<ListBotChatHistorysResponse> listBotChatHistorys(ListBotChatHistorysRequest request);

    CompletableFuture<ListBotColdDsDatasResponse> listBotColdDsDatas(ListBotColdDsDatasRequest request);

    CompletableFuture<ListBotColdKnowledgesResponse> listBotColdKnowledges(ListBotColdKnowledgesRequest request);

    CompletableFuture<ListBotDsDetailsResponse> listBotDsDetails(ListBotDsDetailsRequest request);

    CompletableFuture<ListBotHotDsDatasResponse> listBotHotDsDatas(ListBotHotDsDatasRequest request);

    CompletableFuture<ListBotHotKnowledgesResponse> listBotHotKnowledges(ListBotHotKnowledgesRequest request);

    CompletableFuture<ListBotKnowledgeDetailsResponse> listBotKnowledgeDetails(ListBotKnowledgeDetailsRequest request);

    CompletableFuture<ListBotReceptionDetailDatasResponse> listBotReceptionDetailDatas(ListBotReceptionDetailDatasRequest request);

    CompletableFuture<ListConversationLogsResponse> listConversationLogs(ListConversationLogsRequest request);

    CompletableFuture<MoveKnowledgeCategoryResponse> moveKnowledgeCategory(MoveKnowledgeCategoryRequest request);

    CompletableFuture<PublishDialogFlowResponse> publishDialogFlow(PublishDialogFlowRequest request);

    CompletableFuture<PublishKnowledgeResponse> publishKnowledge(PublishKnowledgeRequest request);

    CompletableFuture<QueryBizDataRangesResponse> queryBizDataRanges(QueryBizDataRangesRequest request);

    CompletableFuture<QueryBotsResponse> queryBots(QueryBotsRequest request);

    CompletableFuture<QueryCategoriesResponse> queryCategories(QueryCategoriesRequest request);

    CompletableFuture<QueryCoreWordsResponse> queryCoreWords(QueryCoreWordsRequest request);

    CompletableFuture<QueryDialogsResponse> queryDialogs(QueryDialogsRequest request);

    CompletableFuture<QueryEntitiesResponse> queryEntities(QueryEntitiesRequest request);

    CompletableFuture<QueryIntentsResponse> queryIntents(QueryIntentsRequest request);

    CompletableFuture<QueryKnowledgesResponse> queryKnowledges(QueryKnowledgesRequest request);

    CompletableFuture<QueryLoopListResponse> queryLoopList(QueryLoopListRequest request);

    CompletableFuture<QueryLoopResultResponse> queryLoopResult(QueryLoopResultRequest request);

    CompletableFuture<QueryLoopStatusResponse> queryLoopStatus(QueryLoopStatusRequest request);

    CompletableFuture<QueryPerspectivesResponse> queryPerspectives(QueryPerspectivesRequest request);

    CompletableFuture<QuerySystemEntitiesResponse> querySystemEntities(QuerySystemEntitiesRequest request);

    CompletableFuture<RemoveEntityMemberResponse> removeEntityMember(RemoveEntityMemberRequest request);

    CompletableFuture<RemoveSynonymResponse> removeSynonym(RemoveSynonymRequest request);

    CompletableFuture<SearchQaResponse> searchQa(SearchQaRequest request);

    CompletableFuture<TestDialogFlowResponse> testDialogFlow(TestDialogFlowRequest request);

    CompletableFuture<TestGrayResponse> testGray(TestGrayRequest request);

    CompletableFuture<UpdateBizDataRangeResponse> updateBizDataRange(UpdateBizDataRangeRequest request);

    CompletableFuture<UpdateCategoryResponse> updateCategory(UpdateCategoryRequest request);

    CompletableFuture<UpdateCoreWordResponse> updateCoreWord(UpdateCoreWordRequest request);

    CompletableFuture<UpdateDialogResponse> updateDialog(UpdateDialogRequest request);

    CompletableFuture<UpdateDialogFlowResponse> updateDialogFlow(UpdateDialogFlowRequest request);

    CompletableFuture<UpdateEntityResponse> updateEntity(UpdateEntityRequest request);

    CompletableFuture<UpdateIntentResponse> updateIntent(UpdateIntentRequest request);

    CompletableFuture<UpdateKnowledgeResponse> updateKnowledge(UpdateKnowledgeRequest request);

    CompletableFuture<UpdatePerspectiveResponse> updatePerspective(UpdatePerspectiveRequest request);

}
