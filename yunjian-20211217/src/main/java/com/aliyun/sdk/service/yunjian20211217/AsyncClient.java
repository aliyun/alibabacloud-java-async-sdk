// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.yunjian20211217.models.*;
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
     * @param request the request parameters of CreateDemandPlan  CreateDemandPlanRequest
     * @return CreateDemandPlanResponse
     */
    CompletableFuture<CreateDemandPlanResponse> createDemandPlan(CreateDemandPlanRequest request);

    /**
     * @param request the request parameters of CreateDemandPlanV2  CreateDemandPlanV2Request
     * @return CreateDemandPlanV2Response
     */
    CompletableFuture<CreateDemandPlanV2Response> createDemandPlanV2(CreateDemandPlanV2Request request);

    /**
     * @param request the request parameters of DeleteUrgentDemandItem  DeleteUrgentDemandItemRequest
     * @return DeleteUrgentDemandItemResponse
     */
    CompletableFuture<DeleteUrgentDemandItemResponse> deleteUrgentDemandItem(DeleteUrgentDemandItemRequest request);

    /**
     * @param request the request parameters of DeleteUrgentDemandPlan  DeleteUrgentDemandPlanRequest
     * @return DeleteUrgentDemandPlanResponse
     */
    CompletableFuture<DeleteUrgentDemandPlanResponse> deleteUrgentDemandPlan(DeleteUrgentDemandPlanRequest request);

    /**
     * @param request the request parameters of DeliveryItemDetailSyn  DeliveryItemDetailSynRequest
     * @return DeliveryItemDetailSynResponse
     */
    CompletableFuture<DeliveryItemDetailSynResponse> deliveryItemDetailSyn(DeliveryItemDetailSynRequest request);

    /**
     * @param request the request parameters of GetUrgentDemandItemList  GetUrgentDemandItemListRequest
     * @return GetUrgentDemandItemListResponse
     */
    CompletableFuture<GetUrgentDemandItemListResponse> getUrgentDemandItemList(GetUrgentDemandItemListRequest request);

    /**
     * @param request the request parameters of GetUrgentDemandPlanDetail  GetUrgentDemandPlanDetailRequest
     * @return GetUrgentDemandPlanDetailResponse
     */
    CompletableFuture<GetUrgentDemandPlanDetailResponse> getUrgentDemandPlanDetail(GetUrgentDemandPlanDetailRequest request);

    /**
     * @param request the request parameters of GetUrgentDemandPlanList  GetUrgentDemandPlanListRequest
     * @return GetUrgentDemandPlanListResponse
     */
    CompletableFuture<GetUrgentDemandPlanListResponse> getUrgentDemandPlanList(GetUrgentDemandPlanListRequest request);

    /**
     * @param request the request parameters of PageDemandPlanWithDemandInfo  PageDemandPlanWithDemandInfoRequest
     * @return PageDemandPlanWithDemandInfoResponse
     */
    CompletableFuture<PageDemandPlanWithDemandInfoResponse> pageDemandPlanWithDemandInfo(PageDemandPlanWithDemandInfoRequest request);

    /**
     * @param request the request parameters of PushResourcePlan  PushResourcePlanRequest
     * @return PushResourcePlanResponse
     */
    CompletableFuture<PushResourcePlanResponse> pushResourcePlan(PushResourcePlanRequest request);

    /**
     * @param request the request parameters of QueryDeliveredSupplyItems  QueryDeliveredSupplyItemsRequest
     * @return QueryDeliveredSupplyItemsResponse
     */
    CompletableFuture<QueryDeliveredSupplyItemsResponse> queryDeliveredSupplyItems(QueryDeliveredSupplyItemsRequest request);

    /**
     * @param request the request parameters of QueryPeriodBudgetBill  QueryPeriodBudgetBillRequest
     * @return QueryPeriodBudgetBillResponse
     */
    CompletableFuture<QueryPeriodBudgetBillResponse> queryPeriodBudgetBill(QueryPeriodBudgetBillRequest request);

    /**
     * @param request the request parameters of SaveUrgentDemandItem  SaveUrgentDemandItemRequest
     * @return SaveUrgentDemandItemResponse
     */
    CompletableFuture<SaveUrgentDemandItemResponse> saveUrgentDemandItem(SaveUrgentDemandItemRequest request);

    /**
     * @param request the request parameters of SubmitUrgentDemandPlan  SubmitUrgentDemandPlanRequest
     * @return SubmitUrgentDemandPlanResponse
     */
    CompletableFuture<SubmitUrgentDemandPlanResponse> submitUrgentDemandPlan(SubmitUrgentDemandPlanRequest request);

    /**
     * @param request the request parameters of acceptFulfillmentDecision  AcceptFulfillmentDecisionRequest
     * @return AcceptFulfillmentDecisionResponse
     */
    CompletableFuture<AcceptFulfillmentDecisionResponse> acceptFulfillmentDecision(AcceptFulfillmentDecisionRequest request);

}
