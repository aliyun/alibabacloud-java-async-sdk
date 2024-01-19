// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkedmall20180116.models.*;
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

    CompletableFuture<AddAddressResponse> addAddress(AddAddressRequest request);

    CompletableFuture<AddItemLimitRuleResponse> addItemLimitRule(AddItemLimitRuleRequest request);

    CompletableFuture<AddItemToSubBizsResponse> addItemToSubBizs(AddItemToSubBizsRequest request);

    CompletableFuture<AddSupplierNewItemsResponse> addSupplierNewItems(AddSupplierNewItemsRequest request);

    CompletableFuture<ApplyRefundResponse> applyRefund(ApplyRefundRequest request);

    CompletableFuture<ApplyRefundWithDesignatedTbUidResponse> applyRefundWithDesignatedTbUid(ApplyRefundWithDesignatedTbUidRequest request);

    CompletableFuture<BatchRegistAnonymousTbAccountResponse> batchRegistAnonymousTbAccount(BatchRegistAnonymousTbAccountRequest request);

    CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request);

    CompletableFuture<CancelOrderWithDesignatedTbUidResponse> cancelOrderWithDesignatedTbUid(CancelOrderWithDesignatedTbUidRequest request);

    CompletableFuture<CancelRealTbAccountSupportResponse> cancelRealTbAccountSupport(CancelRealTbAccountSupportRequest request);

    CompletableFuture<CancelRefundResponse> cancelRefund(CancelRefundRequest request);

    CompletableFuture<CancelRefundWithDesignatedTbUidResponse> cancelRefundWithDesignatedTbUid(CancelRefundWithDesignatedTbUidRequest request);

    CompletableFuture<ConfirmDisburseResponse> confirmDisburse(ConfirmDisburseRequest request);

    CompletableFuture<ConfirmDisburseWithDesignatedTbUidResponse> confirmDisburseWithDesignatedTbUid(ConfirmDisburseWithDesignatedTbUidRequest request);

    CompletableFuture<CreateMovieTicketOrderResponse> createMovieTicketOrder(CreateMovieTicketOrderRequest request);

    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    CompletableFuture<CreateOrderPayUrlForOutDiscountResponse> createOrderPayUrlForOutDiscount(CreateOrderPayUrlForOutDiscountRequest request);

    CompletableFuture<CreateOrderTransactionDetailFileResponse> createOrderTransactionDetailFile(CreateOrderTransactionDetailFileRequest request);

    CompletableFuture<CreateOrderV2Response> createOrderV2(CreateOrderV2Request request);

    CompletableFuture<CreateOrderWithDesignatedTbUidResponse> createOrderWithDesignatedTbUid(CreateOrderWithDesignatedTbUidRequest request);

    CompletableFuture<CreateOutDiscountOrderWithDesignatedTbUidResponse> createOutDiscountOrderWithDesignatedTbUid(CreateOutDiscountOrderWithDesignatedTbUidRequest request);

    CompletableFuture<CreatePayUrlResponse> createPayUrl(CreatePayUrlRequest request);

    CompletableFuture<CreateSettleConfirmResponse> createSettleConfirm(CreateSettleConfirmRequest request);

    CompletableFuture<CreateVirtualProductOrderResponse> createVirtualProductOrder(CreateVirtualProductOrderRequest request);

    CompletableFuture<CreateWithholdTradeResponse> createWithholdTrade(CreateWithholdTradeRequest request);

    CompletableFuture<DeductUserPointResponse> deductUserPoint(DeductUserPointRequest request);

    CompletableFuture<DeleteBizItemsResponse> deleteBizItems(DeleteBizItemsRequest request);

    CompletableFuture<DeleteItemLimitRuleResponse> deleteItemLimitRule(DeleteItemLimitRuleRequest request);

    CompletableFuture<DownloadCpsBillFileResponse> downloadCpsBillFile(DownloadCpsBillFileRequest request);

    CompletableFuture<DownloadItemBillFileResponse> downloadItemBillFile(DownloadItemBillFileRequest request);

    CompletableFuture<DownloadOrderTransactionDetailFileResponse> downloadOrderTransactionDetailFile(DownloadOrderTransactionDetailFileRequest request);

    CompletableFuture<EnableOrderResponse> enableOrder(EnableOrderRequest request);

    CompletableFuture<EnableOrderWithDesignatedTbUidResponse> enableOrderWithDesignatedTbUid(EnableOrderWithDesignatedTbUidRequest request);

    CompletableFuture<ExecuteNodeResponse> executeNode(ExecuteNodeRequest request);

    CompletableFuture<FreezeUserPointResponse> freezeUserPoint(FreezeUserPointRequest request);

    CompletableFuture<GetActivityGameInfoResponse> getActivityGameInfo(GetActivityGameInfoRequest request);

    CompletableFuture<GetCategoryChainResponse> getCategoryChain(GetCategoryChainRequest request);

    CompletableFuture<GetCategoryListResponse> getCategoryList(GetCategoryListRequest request);

    CompletableFuture<GetCustomServiceUrlResponse> getCustomServiceUrl(GetCustomServiceUrlRequest request);

    CompletableFuture<GetGuidePageResponse> getGuidePage(GetGuidePageRequest request);

    CompletableFuture<GetItemPromotionResponse> getItemPromotion(GetItemPromotionRequest request);

    CompletableFuture<GetLoginPageResponse> getLoginPage(GetLoginPageRequest request);

    CompletableFuture<GetSwitchUrlResponse> getSwitchUrl(GetSwitchUrlRequest request);

    CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request);

    CompletableFuture<GetUserTokenPageResponse> getUserTokenPage(GetUserTokenPageRequest request);

    CompletableFuture<GetWithholdSignPageUrlResponse> getWithholdSignPageUrl(GetWithholdSignPageUrlRequest request);

    CompletableFuture<GiveUserPointResponse> giveUserPoint(GiveUserPointRequest request);

    CompletableFuture<GrantPromotionToUserResponse> grantPromotionToUser(GrantPromotionToUserRequest request);

    CompletableFuture<GrantUserPointResponse> grantUserPoint(GrantUserPointRequest request);

    CompletableFuture<InitApplyRefundResponse> initApplyRefund(InitApplyRefundRequest request);

    CompletableFuture<InitApplyRefundWithDesignatedTbUidResponse> initApplyRefundWithDesignatedTbUid(InitApplyRefundWithDesignatedTbUidRequest request);

    CompletableFuture<InitModifyRefundResponse> initModifyRefund(InitModifyRefundRequest request);

    CompletableFuture<InitModifyRefundWithDesignatedTbUidResponse> initModifyRefundWithDesignatedTbUid(InitModifyRefundWithDesignatedTbUidRequest request);

    CompletableFuture<ListActivityAtmosphereResponse> listActivityAtmosphere(ListActivityAtmosphereRequest request);

    CompletableFuture<ListActivityGameInfoResponse> listActivityGameInfo(ListActivityGameInfoRequest request);

    CompletableFuture<ListItemActivitiesResponse> listItemActivities(ListItemActivitiesRequest request);

    CompletableFuture<ListUserGameProcessResponse> listUserGameProcess(ListUserGameProcessRequest request);

    CompletableFuture<ListUserPointRecordsResponse> listUserPointRecords(ListUserPointRecordsRequest request);

    CompletableFuture<ModifyBasicAndBizItemsResponse> modifyBasicAndBizItems(ModifyBasicAndBizItemsRequest request);

    CompletableFuture<ModifyBasicItemSupplierPriceResponse> modifyBasicItemSupplierPrice(ModifyBasicItemSupplierPriceRequest request);

    CompletableFuture<ModifyBizItemsResponse> modifyBizItems(ModifyBizItemsRequest request);

    CompletableFuture<ModifyItemLimitRuleResponse> modifyItemLimitRule(ModifyItemLimitRuleRequest request);

    CompletableFuture<ModifyOrderDeliveryAddressResponse> modifyOrderDeliveryAddress(ModifyOrderDeliveryAddressRequest request);

    CompletableFuture<ModifyRefundResponse> modifyRefund(ModifyRefundRequest request);

    CompletableFuture<ModifyRefundWithDesignatedTbUidResponse> modifyRefundWithDesignatedTbUid(ModifyRefundWithDesignatedTbUidRequest request);

    CompletableFuture<ModifySettleAccountResponse> modifySettleAccount(ModifySettleAccountRequest request);

    CompletableFuture<ModifySupplierPriceAndPriceCentResponse> modifySupplierPriceAndPriceCent(ModifySupplierPriceAndPriceCentRequest request);

    CompletableFuture<NotifyPayOrderStatusResponse> notifyPayOrderStatus(NotifyPayOrderStatusRequest request);

    CompletableFuture<NotifyWithholdFundResponse> notifyWithholdFund(NotifyWithholdFundRequest request);

    CompletableFuture<OpenRealTbAccountSupportResponse> openRealTbAccountSupport(OpenRealTbAccountSupportRequest request);

    CompletableFuture<PushUserGameProcessResponse> pushUserGameProcess(PushUserGameProcessRequest request);

    CompletableFuture<QueryActivityItemsResponse> queryActivityItems(QueryActivityItemsRequest request);

    CompletableFuture<QueryAddressResponse> queryAddress(QueryAddressRequest request);

    CompletableFuture<QueryAddressDetailResponse> queryAddressDetail(QueryAddressDetailRequest request);

    CompletableFuture<QueryAddressListResponse> queryAddressList(QueryAddressListRequest request);

    CompletableFuture<QueryAdvertisementSettleInfoResponse> queryAdvertisementSettleInfo(QueryAdvertisementSettleInfoRequest request);

    CompletableFuture<QueryAgreementResponse> queryAgreement(QueryAgreementRequest request);

    CompletableFuture<QueryAllCinemasResponse> queryAllCinemas(QueryAllCinemasRequest request);

    CompletableFuture<QueryAllCitiesResponse> queryAllCities(QueryAllCitiesRequest request);

    CompletableFuture<QueryBatchRegistAnonymousTbAccountResultResponse> queryBatchRegistAnonymousTbAccountResult(QueryBatchRegistAnonymousTbAccountResultRequest request);

    CompletableFuture<QueryBestSession4ItemsResponse> queryBestSession4Items(QueryBestSession4ItemsRequest request);

    CompletableFuture<QueryBizItemListResponse> queryBizItemList(QueryBizItemListRequest request);

    CompletableFuture<QueryBizItemListV2Response> queryBizItemListV2(QueryBizItemListV2Request request);

    CompletableFuture<QueryBizItemListWithCacheResponse> queryBizItemListWithCache(QueryBizItemListWithCacheRequest request);

    CompletableFuture<QueryBizItemsResponse> queryBizItems(QueryBizItemsRequest request);

    CompletableFuture<QueryBizItemsWithActivityResponse> queryBizItemsWithActivity(QueryBizItemsWithActivityRequest request);

    CompletableFuture<QueryBudgetTicketItemListByBizIdResponse> queryBudgetTicketItemListByBizId(QueryBudgetTicketItemListByBizIdRequest request);

    CompletableFuture<QueryChannelItemBillDownloadUrlResponse> queryChannelItemBillDownloadUrl(QueryChannelItemBillDownloadUrlRequest request);

    CompletableFuture<QueryGuideItemGroupResponse> queryGuideItemGroup(QueryGuideItemGroupRequest request);

    CompletableFuture<QueryGuideItemGroupForCrowdOperationResponse> queryGuideItemGroupForCrowdOperation(QueryGuideItemGroupForCrowdOperationRequest request);

    CompletableFuture<QueryGuideItemGroupWithOutInventoryResponse> queryGuideItemGroupWithOutInventory(QueryGuideItemGroupWithOutInventoryRequest request);

    CompletableFuture<QueryHotMoviesResponse> queryHotMovies(QueryHotMoviesRequest request);

    CompletableFuture<QueryInventoryOfItemsInBizItemGroupResponse> queryInventoryOfItemsInBizItemGroup(QueryInventoryOfItemsInBizItemGroupRequest request);

    CompletableFuture<QueryItemDetailResponse> queryItemDetail(QueryItemDetailRequest request);

    CompletableFuture<QueryItemDetailInnerResponse> queryItemDetailInner(QueryItemDetailInnerRequest request);

    CompletableFuture<QueryItemDetailTeaResponse> queryItemDetailTea(QueryItemDetailTeaRequest request);

    CompletableFuture<QueryItemInSubBizsResponse> queryItemInSubBizs(QueryItemInSubBizsRequest request);

    CompletableFuture<QueryItemInventoryResponse> queryItemInventory(QueryItemInventoryRequest request);

    CompletableFuture<QueryItemInventoryV2Response> queryItemInventoryV2(QueryItemInventoryV2Request request);

    CompletableFuture<QueryItemNextCycleRestrictionResponse> queryItemNextCycleRestriction(QueryItemNextCycleRestrictionRequest request);

    CompletableFuture<QueryLogisticsResponse> queryLogistics(QueryLogisticsRequest request);

    CompletableFuture<QueryMediaSettleInfoResponse> queryMediaSettleInfo(QueryMediaSettleInfoRequest request);

    CompletableFuture<QueryMessagesResponse> queryMessages(QueryMessagesRequest request);

    CompletableFuture<QueryMovieCommentsResponse> queryMovieComments(QueryMovieCommentsRequest request);

    CompletableFuture<QueryMovieSchedulesResponse> queryMovieSchedules(QueryMovieSchedulesRequest request);

    CompletableFuture<QueryMovieSeatsResponse> queryMovieSeats(QueryMovieSeatsRequest request);

    CompletableFuture<QueryMovieTicketsResponse> queryMovieTickets(QueryMovieTicketsRequest request);

    CompletableFuture<QueryOrderAndPaymentListResponse> queryOrderAndPaymentList(QueryOrderAndPaymentListRequest request);

    CompletableFuture<QueryOrderAndPaymentListWithDesignatedTbUidResponse> queryOrderAndPaymentListWithDesignatedTbUid(QueryOrderAndPaymentListWithDesignatedTbUidRequest request);

    CompletableFuture<QueryOrderCommissionRateResponse> queryOrderCommissionRate(QueryOrderCommissionRateRequest request);

    CompletableFuture<QueryOrderDetailInnerResponse> queryOrderDetailInner(QueryOrderDetailInnerRequest request);

    CompletableFuture<QueryOrderIdByPayIdResponse> queryOrderIdByPayId(QueryOrderIdByPayIdRequest request);

    CompletableFuture<QueryOrderInfoAfterSaleResponse> queryOrderInfoAfterSale(QueryOrderInfoAfterSaleRequest request);

    CompletableFuture<QueryOrderItemInfoByPaymentIdForAiZhanYouResponse> queryOrderItemInfoByPaymentIdForAiZhanYou(QueryOrderItemInfoByPaymentIdForAiZhanYouRequest request);

    CompletableFuture<QueryOrderListResponse> queryOrderList(QueryOrderListRequest request);

    CompletableFuture<QueryOrderListWithDesignatedTbUidResponse> queryOrderListWithDesignatedTbUid(QueryOrderListWithDesignatedTbUidRequest request);

    CompletableFuture<QueryOrderLogisticsResponse> queryOrderLogistics(QueryOrderLogisticsRequest request);

    CompletableFuture<QueryOrderLogisticsWithDesignatedTbUidResponse> queryOrderLogisticsWithDesignatedTbUid(QueryOrderLogisticsWithDesignatedTbUidRequest request);

    CompletableFuture<QueryRealTbAccountSupportResponse> queryRealTbAccountSupport(QueryRealTbAccountSupportRequest request);

    CompletableFuture<QueryRefundApplicationDetailResponse> queryRefundApplicationDetail(QueryRefundApplicationDetailRequest request);

    CompletableFuture<QueryRefundApplyWithDesignatedTbUidResponse> queryRefundApplyWithDesignatedTbUid(QueryRefundApplyWithDesignatedTbUidRequest request);

    CompletableFuture<QuerySellerLicenseResponse> querySellerLicense(QuerySellerLicenseRequest request);

    CompletableFuture<QueryStatementsResponse> queryStatements(QueryStatementsRequest request);

    CompletableFuture<QuerySupplierItemBillDownloadUrlResponse> querySupplierItemBillDownloadUrl(QuerySupplierItemBillDownloadUrlRequest request);

    CompletableFuture<QueryUnfinishedActivitiesResponse> queryUnfinishedActivities(QueryUnfinishedActivitiesRequest request);

    CompletableFuture<QueryUnfinishedSessionsResponse> queryUnfinishedSessions(QueryUnfinishedSessionsRequest request);

    CompletableFuture<QueryUnfinishedSessions4ItemsResponse> queryUnfinishedSessions4Items(QueryUnfinishedSessions4ItemsRequest request);

    CompletableFuture<QueryUpcomingMoviesResponse> queryUpcomingMovies(QueryUpcomingMoviesRequest request);

    CompletableFuture<QueryUserAccountResponse> queryUserAccount(QueryUserAccountRequest request);

    CompletableFuture<QueryUserGameProcessResponse> queryUserGameProcess(QueryUserGameProcessRequest request);

    CompletableFuture<QueryUserPointResponse> queryUserPoint(QueryUserPointRequest request);

    CompletableFuture<QueryWithholdTradeResponse> queryWithholdTrade(QueryWithholdTradeRequest request);

    CompletableFuture<RebindTbAccountResponse> rebindTbAccount(RebindTbAccountRequest request);

    CompletableFuture<RefreshSettlementOrderAccountResponse> refreshSettlementOrderAccount(RefreshSettlementOrderAccountRequest request);

    CompletableFuture<RefundOrderResponse> refundOrder(RefundOrderRequest request);

    CompletableFuture<RefundPointResponse> refundPoint(RefundPointRequest request);

    CompletableFuture<RefundUserPointResponse> refundUserPoint(RefundUserPointRequest request);

    CompletableFuture<RefuseMerchantSyncTaskResponse> refuseMerchantSyncTask(RefuseMerchantSyncTaskRequest request);

    CompletableFuture<RegistAnonymousTbAccountResponse> registAnonymousTbAccount(RegistAnonymousTbAccountRequest request);

    CompletableFuture<RegisterSettleAccountResponse> registerSettleAccount(RegisterSettleAccountRequest request);

    CompletableFuture<RegisterUserAccountResponse> registerUserAccount(RegisterUserAccountRequest request);

    CompletableFuture<ReleaseMovieSeatResponse> releaseMovieSeat(ReleaseMovieSeatRequest request);

    CompletableFuture<RemoveAddressResponse> removeAddress(RemoveAddressRequest request);

    CompletableFuture<RemoveMessagesResponse> removeMessages(RemoveMessagesRequest request);

    CompletableFuture<RenderH5OrderResponse> renderH5Order(RenderH5OrderRequest request);

    CompletableFuture<RenderOrderResponse> renderOrder(RenderOrderRequest request);

    CompletableFuture<RenderOrderWithDesignatedTbUidResponse> renderOrderWithDesignatedTbUid(RenderOrderWithDesignatedTbUidRequest request);

    CompletableFuture<RepayForPayUrlResponse> repayForPayUrl(RepayForPayUrlRequest request);

    CompletableFuture<RepayOrderResponse> repayOrder(RepayOrderRequest request);

    CompletableFuture<RepayWithDesignatedTbUidResponse> repayWithDesignatedTbUid(RepayWithDesignatedTbUidRequest request);

    CompletableFuture<ReserveMovieSeatResponse> reserveMovieSeat(ReserveMovieSeatRequest request);

    CompletableFuture<SettleOrderResponse> settleOrder(SettleOrderRequest request);

    CompletableFuture<StartUserGameResponse> startUserGame(StartUserGameRequest request);

    CompletableFuture<SubmitReturnGoodLogisticsResponse> submitReturnGoodLogistics(SubmitReturnGoodLogisticsRequest request);

    CompletableFuture<SubmitReturnGoodLogisticsWithDesignatedTbUidResponse> submitReturnGoodLogisticsWithDesignatedTbUid(SubmitReturnGoodLogisticsWithDesignatedTbUidRequest request);

    CompletableFuture<SyncMerchantInfoResponse> syncMerchantInfo(SyncMerchantInfoRequest request);

    CompletableFuture<UnFreezeUserPointResponse> unFreezeUserPoint(UnFreezeUserPointRequest request);

    CompletableFuture<UnsignWithholdAgreementResponse> unsignWithholdAgreement(UnsignWithholdAgreementRequest request);

    CompletableFuture<UpdateAddressResponse> updateAddress(UpdateAddressRequest request);

    CompletableFuture<ValidateTaobaoAccountResponse> validateTaobaoAccount(ValidateTaobaoAccountRequest request);

}
