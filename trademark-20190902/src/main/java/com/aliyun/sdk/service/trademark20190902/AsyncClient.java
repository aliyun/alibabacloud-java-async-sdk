// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.trademark20190902.models.*;
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

    CompletableFuture<BindApplicantResponse> bindApplicant(BindApplicantRequest request);

    CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request);

    CompletableFuture<CheckAuthorizationLetterResponse> checkAuthorizationLetter(CheckAuthorizationLetterRequest request);

    CompletableFuture<CheckBizAvailableResponse> checkBizAvailable(CheckBizAvailableRequest request);

    CompletableFuture<CheckDuplicateApplicantRiskResponse> checkDuplicateApplicantRisk(CheckDuplicateApplicantRiskRequest request);

    CompletableFuture<CheckDuplicateClassificationResponse> checkDuplicateClassification(CheckDuplicateClassificationRequest request);

    CompletableFuture<CheckDuplicateTrademarkResponse> checkDuplicateTrademark(CheckDuplicateTrademarkRequest request);

    CompletableFuture<CheckMaterialValidityResponse> checkMaterialValidity(CheckMaterialValidityRequest request);

    CompletableFuture<CheckTrademarkNameResponse> checkTrademarkName(CheckTrademarkNameRequest request);

    CompletableFuture<CloseTrademarkApplicationResponse> closeTrademarkApplication(CloseTrademarkApplicationRequest request);

    CompletableFuture<CombineAuthorizationLetterResponse> combineAuthorizationLetter(CombineAuthorizationLetterRequest request);

    CompletableFuture<ComplementTrademarkApplicationResponse> complementTrademarkApplication(ComplementTrademarkApplicationRequest request);

    CompletableFuture<ConfirmExpertSolutionResponse> confirmExpertSolution(ConfirmExpertSolutionRequest request);

    CompletableFuture<CreateApplicantResponse> createApplicant(CreateApplicantRequest request);

    CompletableFuture<CreateCommodityOrderResponse> createCommodityOrder(CreateCommodityOrderRequest request);

    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    CompletableFuture<CreateTrademarkApplicationResponse> createTrademarkApplication(CreateTrademarkApplicationRequest request);

    CompletableFuture<DeleteSearchConditionResponse> deleteSearchCondition(DeleteSearchConditionRequest request);

    CompletableFuture<DescribeAdminTrademarkApplicationResponse> describeAdminTrademarkApplication(DescribeAdminTrademarkApplicationRequest request);

    CompletableFuture<DescribeApplicantResponse> describeApplicant(DescribeApplicantRequest request);

    CompletableFuture<DescribePartnerTrademarkApplicationResponse> describePartnerTrademarkApplication(DescribePartnerTrademarkApplicationRequest request);

    CompletableFuture<DescribeQualificationStatusResponse> describeQualificationStatus(DescribeQualificationStatusRequest request);

    /**
      * ****
      *
     */
    CompletableFuture<DescribeSupplementResponse> describeSupplement(DescribeSupplementRequest request);

    CompletableFuture<DescribeTrademarkApplicationResponse> describeTrademarkApplication(DescribeTrademarkApplicationRequest request);

    CompletableFuture<DescribeTrademarkDetailForInnerResponse> describeTrademarkDetailForInner(DescribeTrademarkDetailForInnerRequest request);

    CompletableFuture<GenerateUploadFilePolicyResponse> generateUploadFilePolicy(GenerateUploadFilePolicyRequest request);

    CompletableFuture<GetAlipayUrlResponse> getAlipayUrl(GetAlipayUrlRequest request);

    CompletableFuture<GetOrderConfirmUrlResponse> getOrderConfirmUrl(GetOrderConfirmUrlRequest request);

    CompletableFuture<GetStsByTaobaoUidResponse> getStsByTaobaoUid(GetStsByTaobaoUidRequest request);

    CompletableFuture<ListAdminTrademarkApplicationLogsResponse> listAdminTrademarkApplicationLogs(ListAdminTrademarkApplicationLogsRequest request);

    CompletableFuture<ListAdminTrademarkApplicationsResponse> listAdminTrademarkApplications(ListAdminTrademarkApplicationsRequest request);

    CompletableFuture<ListApplicantsResponse> listApplicants(ListApplicantsRequest request);

    CompletableFuture<ListAreasResponse> listAreas(ListAreasRequest request);

    CompletableFuture<ListClassificationConditionsResponse> listClassificationConditions(ListClassificationConditionsRequest request);

    CompletableFuture<ListClassificationsResponse> listClassifications(ListClassificationsRequest request);

    CompletableFuture<ListTrademarkApplicationLogsResponse> listTrademarkApplicationLogs(ListTrademarkApplicationLogsRequest request);

    CompletableFuture<ListTrademarkApplicationsResponse> listTrademarkApplications(ListTrademarkApplicationsRequest request);

    CompletableFuture<ListTrademarkSearchForInnerResponse> listTrademarkSearchForInner(ListTrademarkSearchForInnerRequest request);

    CompletableFuture<PutMeasureDataResponse> putMeasureData(PutMeasureDataRequest request);

    CompletableFuture<PutMeasureReadyFlagResponse> putMeasureReadyFlag(PutMeasureReadyFlagRequest request);

    CompletableFuture<QueryActivityItemsResponse> queryActivityItems(QueryActivityItemsRequest request);

    CompletableFuture<QueryAliyunUidResponse> queryAliyunUid(QueryAliyunUidRequest request);

    CompletableFuture<QueryDetailItemResponse> queryDetailItem(QueryDetailItemRequest request);

    CompletableFuture<QueryRemainResourcesResponse> queryRemainResources(QueryRemainResourcesRequest request);

    CompletableFuture<RefuseSupplementResponse> refuseSupplement(RefuseSupplementRequest request);

    CompletableFuture<RejectExpertSolutionResponse> rejectExpertSolution(RejectExpertSolutionRequest request);

    CompletableFuture<RemoveApplicantResponse> removeApplicant(RemoveApplicantRequest request);

    CompletableFuture<SaveSearchConditionResponse> saveSearchCondition(SaveSearchConditionRequest request);

    CompletableFuture<SaveTemporaryApplicantResponse> saveTemporaryApplicant(SaveTemporaryApplicantRequest request);

    CompletableFuture<SearchItemsResponse> searchItems(SearchItemsRequest request);

    CompletableFuture<SearchSimilarityResponse> searchSimilarity(SearchSimilarityRequest request);

    CompletableFuture<SearchSimilarityListResponse> searchSimilarityList(SearchSimilarityListRequest request);

    CompletableFuture<SendMessageToUserResponse> sendMessageToUser(SendMessageToUserRequest request);

    /**
      * ***
      *
     */
    CompletableFuture<SubmitSupplementResponse> submitSupplement(SubmitSupplementRequest request);

    CompletableFuture<UpdateApplicantResponse> updateApplicant(UpdateApplicantRequest request);

}
