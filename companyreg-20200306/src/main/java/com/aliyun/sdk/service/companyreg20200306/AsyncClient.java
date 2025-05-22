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

    /**
     * @param request the request parameters of BindProduceAuthorization  BindProduceAuthorizationRequest
     * @return BindProduceAuthorizationResponse
     */
    CompletableFuture<BindProduceAuthorizationResponse> bindProduceAuthorization(BindProduceAuthorizationRequest request);

    /**
     * @param request the request parameters of CloseIntentionForPartner  CloseIntentionForPartnerRequest
     * @return CloseIntentionForPartnerResponse
     */
    CompletableFuture<CloseIntentionForPartnerResponse> closeIntentionForPartner(CloseIntentionForPartnerRequest request);

    /**
     * @param request the request parameters of CloseUserIntention  CloseUserIntentionRequest
     * @return CloseUserIntentionResponse
     */
    CompletableFuture<CloseUserIntentionResponse> closeUserIntention(CloseUserIntentionRequest request);

    /**
     * @param request the request parameters of CreateBusinessOpportunity  CreateBusinessOpportunityRequest
     * @return CreateBusinessOpportunityResponse
     */
    CompletableFuture<CreateBusinessOpportunityResponse> createBusinessOpportunity(CreateBusinessOpportunityRequest request);

    /**
     * @param request the request parameters of CreateProduceForPartner  CreateProduceForPartnerRequest
     * @return CreateProduceForPartnerResponse
     */
    CompletableFuture<CreateProduceForPartnerResponse> createProduceForPartner(CreateProduceForPartnerRequest request);

    /**
     * @param request the request parameters of DescribePartnerConfig  DescribePartnerConfigRequest
     * @return DescribePartnerConfigResponse
     */
    CompletableFuture<DescribePartnerConfigResponse> describePartnerConfig(DescribePartnerConfigRequest request);

    /**
     * @param request the request parameters of GenerateUploadFilePolicy  GenerateUploadFilePolicyRequest
     * @return GenerateUploadFilePolicyResponse
     */
    CompletableFuture<GenerateUploadFilePolicyResponse> generateUploadFilePolicy(GenerateUploadFilePolicyRequest request);

    /**
     * @param request the request parameters of GetAlipayUrl  GetAlipayUrlRequest
     * @return GetAlipayUrlResponse
     */
    CompletableFuture<GetAlipayUrlResponse> getAlipayUrl(GetAlipayUrlRequest request);

    /**
     * @param request the request parameters of ListIntentionNote  ListIntentionNoteRequest
     * @return ListIntentionNoteResponse
     */
    CompletableFuture<ListIntentionNoteResponse> listIntentionNote(ListIntentionNoteRequest request);

    /**
     * @param request the request parameters of ListProduceAuthorization  ListProduceAuthorizationRequest
     * @return ListProduceAuthorizationResponse
     */
    CompletableFuture<ListProduceAuthorizationResponse> listProduceAuthorization(ListProduceAuthorizationRequest request);

    /**
     * @param request the request parameters of ListUserDetailSolutions  ListUserDetailSolutionsRequest
     * @return ListUserDetailSolutionsResponse
     */
    CompletableFuture<ListUserDetailSolutionsResponse> listUserDetailSolutions(ListUserDetailSolutionsRequest request);

    /**
     * @param request the request parameters of ListUserIntentionNotes  ListUserIntentionNotesRequest
     * @return ListUserIntentionNotesResponse
     */
    CompletableFuture<ListUserIntentionNotesResponse> listUserIntentionNotes(ListUserIntentionNotesRequest request);

    /**
     * @param request the request parameters of ListUserIntentions  ListUserIntentionsRequest
     * @return ListUserIntentionsResponse
     */
    CompletableFuture<ListUserIntentionsResponse> listUserIntentions(ListUserIntentionsRequest request);

    /**
     * @param request the request parameters of ListUserProduceOperateLogs  ListUserProduceOperateLogsRequest
     * @return ListUserProduceOperateLogsResponse
     */
    CompletableFuture<ListUserProduceOperateLogsResponse> listUserProduceOperateLogs(ListUserProduceOperateLogsRequest request);

    /**
     * @param request the request parameters of ListUserSolutions  ListUserSolutionsRequest
     * @return ListUserSolutionsResponse
     */
    CompletableFuture<ListUserSolutionsResponse> listUserSolutions(ListUserSolutionsRequest request);

    /**
     * @param request the request parameters of OperateProduceForPartner  OperateProduceForPartnerRequest
     * @return OperateProduceForPartnerResponse
     */
    CompletableFuture<OperateProduceForPartnerResponse> operateProduceForPartner(OperateProduceForPartnerRequest request);

    /**
     * @param request the request parameters of PutMeasureData  PutMeasureDataRequest
     * @return PutMeasureDataResponse
     */
    CompletableFuture<PutMeasureDataResponse> putMeasureData(PutMeasureDataRequest request);

    /**
     * @param request the request parameters of PutMeasureReadyFlag  PutMeasureReadyFlagRequest
     * @return PutMeasureReadyFlagResponse
     */
    CompletableFuture<PutMeasureReadyFlagResponse> putMeasureReadyFlag(PutMeasureReadyFlagRequest request);

    /**
     * @param request the request parameters of QueryAvailableNumbers  QueryAvailableNumbersRequest
     * @return QueryAvailableNumbersResponse
     */
    CompletableFuture<QueryAvailableNumbersResponse> queryAvailableNumbers(QueryAvailableNumbersRequest request);

    /**
     * @param request the request parameters of QueryBagRemaining  QueryBagRemainingRequest
     * @return QueryBagRemainingResponse
     */
    CompletableFuture<QueryBagRemainingResponse> queryBagRemaining(QueryBagRemainingRequest request);

    /**
     * @param request the request parameters of QueryInstance  QueryInstanceRequest
     * @return QueryInstanceResponse
     */
    CompletableFuture<QueryInstanceResponse> queryInstance(QueryInstanceRequest request);

    /**
     * @param request the request parameters of QueryPartnerIntentionList  QueryPartnerIntentionListRequest
     * @return QueryPartnerIntentionListResponse
     */
    CompletableFuture<QueryPartnerIntentionListResponse> queryPartnerIntentionList(QueryPartnerIntentionListRequest request);

    /**
     * @param request the request parameters of QueryPartnerProduceList  QueryPartnerProduceListRequest
     * @return QueryPartnerProduceListResponse
     */
    CompletableFuture<QueryPartnerProduceListResponse> queryPartnerProduceList(QueryPartnerProduceListRequest request);

    /**
     * @param request the request parameters of QueryUserNeedAuth  QueryUserNeedAuthRequest
     * @return QueryUserNeedAuthResponse
     */
    CompletableFuture<QueryUserNeedAuthResponse> queryUserNeedAuth(QueryUserNeedAuthRequest request);

    /**
     * @param request the request parameters of RecordPostBack  RecordPostBackRequest
     * @return RecordPostBackResponse
     */
    CompletableFuture<RecordPostBackResponse> recordPostBack(RecordPostBackRequest request);

    /**
     * @param request the request parameters of RejectSolution  RejectSolutionRequest
     * @return RejectSolutionResponse
     */
    CompletableFuture<RejectSolutionResponse> rejectSolution(RejectSolutionRequest request);

    /**
     * @param request the request parameters of RejectUserSolution  RejectUserSolutionRequest
     * @return RejectUserSolutionResponse
     */
    CompletableFuture<RejectUserSolutionResponse> rejectUserSolution(RejectUserSolutionRequest request);

    /**
     * @param request the request parameters of ReleaseProduceAuthorization  ReleaseProduceAuthorizationRequest
     * @return ReleaseProduceAuthorizationResponse
     */
    CompletableFuture<ReleaseProduceAuthorizationResponse> releaseProduceAuthorization(ReleaseProduceAuthorizationRequest request);

    /**
     * @param request the request parameters of StartBackToBackCall  StartBackToBackCallRequest
     * @return StartBackToBackCallResponse
     */
    CompletableFuture<StartBackToBackCallResponse> startBackToBackCall(StartBackToBackCallRequest request);

    /**
     * @param request the request parameters of SubmitIntentionForPartner  SubmitIntentionForPartnerRequest
     * @return SubmitIntentionForPartnerResponse
     */
    CompletableFuture<SubmitIntentionForPartnerResponse> submitIntentionForPartner(SubmitIntentionForPartnerRequest request);

    /**
     * @param request the request parameters of SubmitIntentionNote  SubmitIntentionNoteRequest
     * @return SubmitIntentionNoteResponse
     */
    CompletableFuture<SubmitIntentionNoteResponse> submitIntentionNote(SubmitIntentionNoteRequest request);

    /**
     * @param request the request parameters of SubmitSolution  SubmitSolutionRequest
     * @return SubmitSolutionResponse
     */
    CompletableFuture<SubmitSolutionResponse> submitSolution(SubmitSolutionRequest request);

    /**
     * @param request the request parameters of TransferIntentionOwner  TransferIntentionOwnerRequest
     * @return TransferIntentionOwnerResponse
     */
    CompletableFuture<TransferIntentionOwnerResponse> transferIntentionOwner(TransferIntentionOwnerRequest request);

    /**
     * @param request the request parameters of TransferProduceOwner  TransferProduceOwnerRequest
     * @return TransferProduceOwnerResponse
     */
    CompletableFuture<TransferProduceOwnerResponse> transferProduceOwner(TransferProduceOwnerRequest request);

}
