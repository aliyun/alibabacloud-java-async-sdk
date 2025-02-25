// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.companyreg20200306.models.*;
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

    CompletableFuture<BindProduceAuthorizationResponse> bindProduceAuthorization(BindProduceAuthorizationRequest request);

    CompletableFuture<CloseIntentionForPartnerResponse> closeIntentionForPartner(CloseIntentionForPartnerRequest request);

    CompletableFuture<CloseUserIntentionResponse> closeUserIntention(CloseUserIntentionRequest request);

    CompletableFuture<CreateBusinessOpportunityResponse> createBusinessOpportunity(CreateBusinessOpportunityRequest request);

    CompletableFuture<CreateProduceForPartnerResponse> createProduceForPartner(CreateProduceForPartnerRequest request);

    CompletableFuture<DescribePartnerConfigResponse> describePartnerConfig(DescribePartnerConfigRequest request);

    CompletableFuture<GenerateUploadFilePolicyResponse> generateUploadFilePolicy(GenerateUploadFilePolicyRequest request);

    CompletableFuture<GetAlipayUrlResponse> getAlipayUrl(GetAlipayUrlRequest request);

    CompletableFuture<ListIntentionNoteResponse> listIntentionNote(ListIntentionNoteRequest request);

    CompletableFuture<ListProduceAuthorizationResponse> listProduceAuthorization(ListProduceAuthorizationRequest request);

    CompletableFuture<ListUserDetailSolutionsResponse> listUserDetailSolutions(ListUserDetailSolutionsRequest request);

    CompletableFuture<ListUserIntentionNotesResponse> listUserIntentionNotes(ListUserIntentionNotesRequest request);

    CompletableFuture<ListUserIntentionsResponse> listUserIntentions(ListUserIntentionsRequest request);

    CompletableFuture<ListUserProduceOperateLogsResponse> listUserProduceOperateLogs(ListUserProduceOperateLogsRequest request);

    CompletableFuture<ListUserSolutionsResponse> listUserSolutions(ListUserSolutionsRequest request);

    CompletableFuture<OperateProduceForPartnerResponse> operateProduceForPartner(OperateProduceForPartnerRequest request);

    CompletableFuture<PutMeasureDataResponse> putMeasureData(PutMeasureDataRequest request);

    CompletableFuture<PutMeasureReadyFlagResponse> putMeasureReadyFlag(PutMeasureReadyFlagRequest request);

    CompletableFuture<QueryAvailableNumbersResponse> queryAvailableNumbers(QueryAvailableNumbersRequest request);

    CompletableFuture<QueryBagRemainingResponse> queryBagRemaining(QueryBagRemainingRequest request);

    CompletableFuture<QueryCommodityConfigResponse> queryCommodityConfig(QueryCommodityConfigRequest request);

    CompletableFuture<QueryInstanceResponse> queryInstance(QueryInstanceRequest request);

    CompletableFuture<QueryPartnerIntentionListResponse> queryPartnerIntentionList(QueryPartnerIntentionListRequest request);

    CompletableFuture<QueryPartnerProduceListResponse> queryPartnerProduceList(QueryPartnerProduceListRequest request);

    CompletableFuture<QueryUserNeedAuthResponse> queryUserNeedAuth(QueryUserNeedAuthRequest request);

    CompletableFuture<RecordPostBackResponse> recordPostBack(RecordPostBackRequest request);

    CompletableFuture<RejectSolutionResponse> rejectSolution(RejectSolutionRequest request);

    CompletableFuture<RejectUserSolutionResponse> rejectUserSolution(RejectUserSolutionRequest request);

    CompletableFuture<ReleaseProduceAuthorizationResponse> releaseProduceAuthorization(ReleaseProduceAuthorizationRequest request);

    CompletableFuture<StartBackToBackCallResponse> startBackToBackCall(StartBackToBackCallRequest request);

    CompletableFuture<SubmitIntentionNoteResponse> submitIntentionNote(SubmitIntentionNoteRequest request);

    CompletableFuture<SubmitSolutionResponse> submitSolution(SubmitSolutionRequest request);

    CompletableFuture<TransferIntentionOwnerResponse> transferIntentionOwner(TransferIntentionOwnerRequest request);

    CompletableFuture<TransferProduceOwnerResponse> transferProduceOwner(TransferProduceOwnerRequest request);

}
