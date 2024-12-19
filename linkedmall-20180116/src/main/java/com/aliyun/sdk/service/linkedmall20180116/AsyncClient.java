// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.linkedmall20180116.models.*;
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
     * @param request the request parameters of AddAddress  AddAddressRequest
     * @return AddAddressResponse
     */
    CompletableFuture<AddAddressResponse> addAddress(AddAddressRequest request);

    /**
     * @param request the request parameters of AddItemLimitRule  AddItemLimitRuleRequest
     * @return AddItemLimitRuleResponse
     */
    CompletableFuture<AddItemLimitRuleResponse> addItemLimitRule(AddItemLimitRuleRequest request);

    /**
     * @param request the request parameters of AddItemToSubBizs  AddItemToSubBizsRequest
     * @return AddItemToSubBizsResponse
     */
    CompletableFuture<AddItemToSubBizsResponse> addItemToSubBizs(AddItemToSubBizsRequest request);

    /**
     * @param request the request parameters of AddSupplierNewItems  AddSupplierNewItemsRequest
     * @return AddSupplierNewItemsResponse
     */
    CompletableFuture<AddSupplierNewItemsResponse> addSupplierNewItems(AddSupplierNewItemsRequest request);

    /**
     * @param request the request parameters of ApplyRefund  ApplyRefundRequest
     * @return ApplyRefundResponse
     */
    CompletableFuture<ApplyRefundResponse> applyRefund(ApplyRefundRequest request);

    /**
     * @param request the request parameters of ApplyRefundWithDesignatedTbUid  ApplyRefundWithDesignatedTbUidRequest
     * @return ApplyRefundWithDesignatedTbUidResponse
     */
    CompletableFuture<ApplyRefundWithDesignatedTbUidResponse> applyRefundWithDesignatedTbUid(ApplyRefundWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of BatchRegistAnonymousTbAccount  BatchRegistAnonymousTbAccountRequest
     * @return BatchRegistAnonymousTbAccountResponse
     */
    CompletableFuture<BatchRegistAnonymousTbAccountResponse> batchRegistAnonymousTbAccount(BatchRegistAnonymousTbAccountRequest request);

    /**
     * @param request the request parameters of CancelOrder  CancelOrderRequest
     * @return CancelOrderResponse
     */
    CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request);

    /**
     * @param request the request parameters of CancelOrderWithDesignatedTbUid  CancelOrderWithDesignatedTbUidRequest
     * @return CancelOrderWithDesignatedTbUidResponse
     */
    CompletableFuture<CancelOrderWithDesignatedTbUidResponse> cancelOrderWithDesignatedTbUid(CancelOrderWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of CancelRealTbAccountSupport  CancelRealTbAccountSupportRequest
     * @return CancelRealTbAccountSupportResponse
     */
    CompletableFuture<CancelRealTbAccountSupportResponse> cancelRealTbAccountSupport(CancelRealTbAccountSupportRequest request);

    /**
     * @param request the request parameters of CancelRefund  CancelRefundRequest
     * @return CancelRefundResponse
     */
    CompletableFuture<CancelRefundResponse> cancelRefund(CancelRefundRequest request);

    /**
     * @param request the request parameters of CancelRefundWithDesignatedTbUid  CancelRefundWithDesignatedTbUidRequest
     * @return CancelRefundWithDesignatedTbUidResponse
     */
    CompletableFuture<CancelRefundWithDesignatedTbUidResponse> cancelRefundWithDesignatedTbUid(CancelRefundWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of ConfirmDisburse  ConfirmDisburseRequest
     * @return ConfirmDisburseResponse
     */
    CompletableFuture<ConfirmDisburseResponse> confirmDisburse(ConfirmDisburseRequest request);

    /**
     * @param request the request parameters of ConfirmDisburseWithDesignatedTbUid  ConfirmDisburseWithDesignatedTbUidRequest
     * @return ConfirmDisburseWithDesignatedTbUidResponse
     */
    CompletableFuture<ConfirmDisburseWithDesignatedTbUidResponse> confirmDisburseWithDesignatedTbUid(ConfirmDisburseWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of CreateOrder  CreateOrderRequest
     * @return CreateOrderResponse
     */
    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    /**
     * @param request the request parameters of CreateOrderPayUrlForOutDiscount  CreateOrderPayUrlForOutDiscountRequest
     * @return CreateOrderPayUrlForOutDiscountResponse
     */
    CompletableFuture<CreateOrderPayUrlForOutDiscountResponse> createOrderPayUrlForOutDiscount(CreateOrderPayUrlForOutDiscountRequest request);

    /**
     * @param request the request parameters of CreateOrderTransactionDetailFile  CreateOrderTransactionDetailFileRequest
     * @return CreateOrderTransactionDetailFileResponse
     */
    CompletableFuture<CreateOrderTransactionDetailFileResponse> createOrderTransactionDetailFile(CreateOrderTransactionDetailFileRequest request);

    /**
     * @param request the request parameters of CreateOrderV2  CreateOrderV2Request
     * @return CreateOrderV2Response
     */
    CompletableFuture<CreateOrderV2Response> createOrderV2(CreateOrderV2Request request);

    /**
     * @param request the request parameters of CreateOrderWithDesignatedTbUid  CreateOrderWithDesignatedTbUidRequest
     * @return CreateOrderWithDesignatedTbUidResponse
     */
    CompletableFuture<CreateOrderWithDesignatedTbUidResponse> createOrderWithDesignatedTbUid(CreateOrderWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of CreateOutDiscountOrderWithDesignatedTbUid  CreateOutDiscountOrderWithDesignatedTbUidRequest
     * @return CreateOutDiscountOrderWithDesignatedTbUidResponse
     */
    CompletableFuture<CreateOutDiscountOrderWithDesignatedTbUidResponse> createOutDiscountOrderWithDesignatedTbUid(CreateOutDiscountOrderWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of CreatePayUrl  CreatePayUrlRequest
     * @return CreatePayUrlResponse
     */
    CompletableFuture<CreatePayUrlResponse> createPayUrl(CreatePayUrlRequest request);

    /**
     * @param request the request parameters of CreateSettleConfirm  CreateSettleConfirmRequest
     * @return CreateSettleConfirmResponse
     */
    CompletableFuture<CreateSettleConfirmResponse> createSettleConfirm(CreateSettleConfirmRequest request);

    /**
     * @param request the request parameters of CreateVirtualProductOrder  CreateVirtualProductOrderRequest
     * @return CreateVirtualProductOrderResponse
     */
    CompletableFuture<CreateVirtualProductOrderResponse> createVirtualProductOrder(CreateVirtualProductOrderRequest request);

    /**
     * @param request the request parameters of CreateWithholdTrade  CreateWithholdTradeRequest
     * @return CreateWithholdTradeResponse
     */
    CompletableFuture<CreateWithholdTradeResponse> createWithholdTrade(CreateWithholdTradeRequest request);

    /**
     * @param request the request parameters of DeductUserPoint  DeductUserPointRequest
     * @return DeductUserPointResponse
     */
    CompletableFuture<DeductUserPointResponse> deductUserPoint(DeductUserPointRequest request);

    /**
     * @param request the request parameters of DeleteBizItems  DeleteBizItemsRequest
     * @return DeleteBizItemsResponse
     */
    CompletableFuture<DeleteBizItemsResponse> deleteBizItems(DeleteBizItemsRequest request);

    /**
     * @param request the request parameters of DeleteItemLimitRule  DeleteItemLimitRuleRequest
     * @return DeleteItemLimitRuleResponse
     */
    CompletableFuture<DeleteItemLimitRuleResponse> deleteItemLimitRule(DeleteItemLimitRuleRequest request);

    /**
     * @param request the request parameters of DownloadCpsBillFile  DownloadCpsBillFileRequest
     * @return DownloadCpsBillFileResponse
     */
    CompletableFuture<DownloadCpsBillFileResponse> downloadCpsBillFile(DownloadCpsBillFileRequest request);

    /**
     * @param request the request parameters of DownloadItemBillFile  DownloadItemBillFileRequest
     * @return DownloadItemBillFileResponse
     */
    CompletableFuture<DownloadItemBillFileResponse> downloadItemBillFile(DownloadItemBillFileRequest request);

    /**
     * @param request the request parameters of DownloadOrderTransactionDetailFile  DownloadOrderTransactionDetailFileRequest
     * @return DownloadOrderTransactionDetailFileResponse
     */
    CompletableFuture<DownloadOrderTransactionDetailFileResponse> downloadOrderTransactionDetailFile(DownloadOrderTransactionDetailFileRequest request);

    /**
     * @param request the request parameters of EnableOrder  EnableOrderRequest
     * @return EnableOrderResponse
     */
    CompletableFuture<EnableOrderResponse> enableOrder(EnableOrderRequest request);

    /**
     * @param request the request parameters of EnableOrderWithDesignatedTbUid  EnableOrderWithDesignatedTbUidRequest
     * @return EnableOrderWithDesignatedTbUidResponse
     */
    CompletableFuture<EnableOrderWithDesignatedTbUidResponse> enableOrderWithDesignatedTbUid(EnableOrderWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of ExecuteNode  ExecuteNodeRequest
     * @return ExecuteNodeResponse
     */
    CompletableFuture<ExecuteNodeResponse> executeNode(ExecuteNodeRequest request);

    /**
     * @param request the request parameters of FreezeUserPoint  FreezeUserPointRequest
     * @return FreezeUserPointResponse
     */
    CompletableFuture<FreezeUserPointResponse> freezeUserPoint(FreezeUserPointRequest request);

    /**
     * @param request the request parameters of GetActivityGameInfo  GetActivityGameInfoRequest
     * @return GetActivityGameInfoResponse
     */
    CompletableFuture<GetActivityGameInfoResponse> getActivityGameInfo(GetActivityGameInfoRequest request);

    /**
     * @param request the request parameters of GetCategoryChain  GetCategoryChainRequest
     * @return GetCategoryChainResponse
     */
    CompletableFuture<GetCategoryChainResponse> getCategoryChain(GetCategoryChainRequest request);

    /**
     * @param request the request parameters of GetCategoryList  GetCategoryListRequest
     * @return GetCategoryListResponse
     */
    CompletableFuture<GetCategoryListResponse> getCategoryList(GetCategoryListRequest request);

    /**
     * @param request the request parameters of GetCustomServiceUrl  GetCustomServiceUrlRequest
     * @return GetCustomServiceUrlResponse
     */
    CompletableFuture<GetCustomServiceUrlResponse> getCustomServiceUrl(GetCustomServiceUrlRequest request);

    /**
     * @param request the request parameters of GetGuidePage  GetGuidePageRequest
     * @return GetGuidePageResponse
     */
    CompletableFuture<GetGuidePageResponse> getGuidePage(GetGuidePageRequest request);

    /**
     * @param request the request parameters of GetItemPromotion  GetItemPromotionRequest
     * @return GetItemPromotionResponse
     */
    CompletableFuture<GetItemPromotionResponse> getItemPromotion(GetItemPromotionRequest request);

    /**
     * @param request the request parameters of GetLoginPage  GetLoginPageRequest
     * @return GetLoginPageResponse
     */
    CompletableFuture<GetLoginPageResponse> getLoginPage(GetLoginPageRequest request);

    /**
     * @param request the request parameters of GetSwitchUrl  GetSwitchUrlRequest
     * @return GetSwitchUrlResponse
     */
    CompletableFuture<GetSwitchUrlResponse> getSwitchUrl(GetSwitchUrlRequest request);

    /**
     * @param request the request parameters of GetUserInfo  GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    CompletableFuture<GetUserInfoResponse> getUserInfo(GetUserInfoRequest request);

    /**
     * @param request the request parameters of GetUserTokenPage  GetUserTokenPageRequest
     * @return GetUserTokenPageResponse
     */
    CompletableFuture<GetUserTokenPageResponse> getUserTokenPage(GetUserTokenPageRequest request);

    /**
     * @param request the request parameters of GetWithholdSignPageUrl  GetWithholdSignPageUrlRequest
     * @return GetWithholdSignPageUrlResponse
     */
    CompletableFuture<GetWithholdSignPageUrlResponse> getWithholdSignPageUrl(GetWithholdSignPageUrlRequest request);

    /**
     * @param request the request parameters of GiveUserPoint  GiveUserPointRequest
     * @return GiveUserPointResponse
     */
    CompletableFuture<GiveUserPointResponse> giveUserPoint(GiveUserPointRequest request);

    /**
     * @param request the request parameters of GrantPromotionToUser  GrantPromotionToUserRequest
     * @return GrantPromotionToUserResponse
     */
    CompletableFuture<GrantPromotionToUserResponse> grantPromotionToUser(GrantPromotionToUserRequest request);

    /**
     * @param request the request parameters of GrantUserPoint  GrantUserPointRequest
     * @return GrantUserPointResponse
     */
    CompletableFuture<GrantUserPointResponse> grantUserPoint(GrantUserPointRequest request);

    /**
     * @param request the request parameters of InitApplyRefund  InitApplyRefundRequest
     * @return InitApplyRefundResponse
     */
    CompletableFuture<InitApplyRefundResponse> initApplyRefund(InitApplyRefundRequest request);

    /**
     * @param request the request parameters of InitApplyRefundWithDesignatedTbUid  InitApplyRefundWithDesignatedTbUidRequest
     * @return InitApplyRefundWithDesignatedTbUidResponse
     */
    CompletableFuture<InitApplyRefundWithDesignatedTbUidResponse> initApplyRefundWithDesignatedTbUid(InitApplyRefundWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of InitModifyRefund  InitModifyRefundRequest
     * @return InitModifyRefundResponse
     */
    CompletableFuture<InitModifyRefundResponse> initModifyRefund(InitModifyRefundRequest request);

    /**
     * @param request the request parameters of InitModifyRefundWithDesignatedTbUid  InitModifyRefundWithDesignatedTbUidRequest
     * @return InitModifyRefundWithDesignatedTbUidResponse
     */
    CompletableFuture<InitModifyRefundWithDesignatedTbUidResponse> initModifyRefundWithDesignatedTbUid(InitModifyRefundWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of ListActivityAtmosphere  ListActivityAtmosphereRequest
     * @return ListActivityAtmosphereResponse
     */
    CompletableFuture<ListActivityAtmosphereResponse> listActivityAtmosphere(ListActivityAtmosphereRequest request);

    /**
     * @param request the request parameters of ListActivityGameInfo  ListActivityGameInfoRequest
     * @return ListActivityGameInfoResponse
     */
    CompletableFuture<ListActivityGameInfoResponse> listActivityGameInfo(ListActivityGameInfoRequest request);

    /**
     * @param request the request parameters of ListItemActivities  ListItemActivitiesRequest
     * @return ListItemActivitiesResponse
     */
    CompletableFuture<ListItemActivitiesResponse> listItemActivities(ListItemActivitiesRequest request);

    /**
     * @param request the request parameters of ListUserGameProcess  ListUserGameProcessRequest
     * @return ListUserGameProcessResponse
     */
    CompletableFuture<ListUserGameProcessResponse> listUserGameProcess(ListUserGameProcessRequest request);

    /**
     * @param request the request parameters of ListUserPointRecords  ListUserPointRecordsRequest
     * @return ListUserPointRecordsResponse
     */
    CompletableFuture<ListUserPointRecordsResponse> listUserPointRecords(ListUserPointRecordsRequest request);

    /**
     * @param request the request parameters of ModifyBasicAndBizItems  ModifyBasicAndBizItemsRequest
     * @return ModifyBasicAndBizItemsResponse
     */
    CompletableFuture<ModifyBasicAndBizItemsResponse> modifyBasicAndBizItems(ModifyBasicAndBizItemsRequest request);

    /**
     * @param request the request parameters of ModifyBasicItemSupplierPrice  ModifyBasicItemSupplierPriceRequest
     * @return ModifyBasicItemSupplierPriceResponse
     */
    CompletableFuture<ModifyBasicItemSupplierPriceResponse> modifyBasicItemSupplierPrice(ModifyBasicItemSupplierPriceRequest request);

    /**
     * @param request the request parameters of ModifyBizItems  ModifyBizItemsRequest
     * @return ModifyBizItemsResponse
     */
    CompletableFuture<ModifyBizItemsResponse> modifyBizItems(ModifyBizItemsRequest request);

    /**
     * @param request the request parameters of ModifyItemLimitRule  ModifyItemLimitRuleRequest
     * @return ModifyItemLimitRuleResponse
     */
    CompletableFuture<ModifyItemLimitRuleResponse> modifyItemLimitRule(ModifyItemLimitRuleRequest request);

    /**
     * @param request the request parameters of ModifyOrderDeliveryAddress  ModifyOrderDeliveryAddressRequest
     * @return ModifyOrderDeliveryAddressResponse
     */
    CompletableFuture<ModifyOrderDeliveryAddressResponse> modifyOrderDeliveryAddress(ModifyOrderDeliveryAddressRequest request);

    /**
     * @param request the request parameters of ModifyRefund  ModifyRefundRequest
     * @return ModifyRefundResponse
     */
    CompletableFuture<ModifyRefundResponse> modifyRefund(ModifyRefundRequest request);

    /**
     * @param request the request parameters of ModifyRefundWithDesignatedTbUid  ModifyRefundWithDesignatedTbUidRequest
     * @return ModifyRefundWithDesignatedTbUidResponse
     */
    CompletableFuture<ModifyRefundWithDesignatedTbUidResponse> modifyRefundWithDesignatedTbUid(ModifyRefundWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of ModifySettleAccount  ModifySettleAccountRequest
     * @return ModifySettleAccountResponse
     */
    CompletableFuture<ModifySettleAccountResponse> modifySettleAccount(ModifySettleAccountRequest request);

    /**
     * @param request the request parameters of ModifySupplierPriceAndPriceCent  ModifySupplierPriceAndPriceCentRequest
     * @return ModifySupplierPriceAndPriceCentResponse
     */
    CompletableFuture<ModifySupplierPriceAndPriceCentResponse> modifySupplierPriceAndPriceCent(ModifySupplierPriceAndPriceCentRequest request);

    /**
     * @param request the request parameters of OpenRealTbAccountSupport  OpenRealTbAccountSupportRequest
     * @return OpenRealTbAccountSupportResponse
     */
    CompletableFuture<OpenRealTbAccountSupportResponse> openRealTbAccountSupport(OpenRealTbAccountSupportRequest request);

    /**
     * @param request the request parameters of PushUserGameProcess  PushUserGameProcessRequest
     * @return PushUserGameProcessResponse
     */
    CompletableFuture<PushUserGameProcessResponse> pushUserGameProcess(PushUserGameProcessRequest request);

    /**
     * @param request the request parameters of QueryActivityItems  QueryActivityItemsRequest
     * @return QueryActivityItemsResponse
     */
    CompletableFuture<QueryActivityItemsResponse> queryActivityItems(QueryActivityItemsRequest request);

    /**
     * @param request the request parameters of QueryAddress  QueryAddressRequest
     * @return QueryAddressResponse
     */
    CompletableFuture<QueryAddressResponse> queryAddress(QueryAddressRequest request);

    /**
     * @param request the request parameters of QueryAddressDetail  QueryAddressDetailRequest
     * @return QueryAddressDetailResponse
     */
    CompletableFuture<QueryAddressDetailResponse> queryAddressDetail(QueryAddressDetailRequest request);

    /**
     * @param request the request parameters of QueryAddressList  QueryAddressListRequest
     * @return QueryAddressListResponse
     */
    CompletableFuture<QueryAddressListResponse> queryAddressList(QueryAddressListRequest request);

    /**
     * @param request the request parameters of QueryAdvertisementSettleInfo  QueryAdvertisementSettleInfoRequest
     * @return QueryAdvertisementSettleInfoResponse
     */
    CompletableFuture<QueryAdvertisementSettleInfoResponse> queryAdvertisementSettleInfo(QueryAdvertisementSettleInfoRequest request);

    /**
     * @param request the request parameters of QueryAgreement  QueryAgreementRequest
     * @return QueryAgreementResponse
     */
    CompletableFuture<QueryAgreementResponse> queryAgreement(QueryAgreementRequest request);

    /**
     * @param request the request parameters of QueryAllCinemas  QueryAllCinemasRequest
     * @return QueryAllCinemasResponse
     */
    CompletableFuture<QueryAllCinemasResponse> queryAllCinemas(QueryAllCinemasRequest request);

    /**
     * @param request the request parameters of QueryAllCities  QueryAllCitiesRequest
     * @return QueryAllCitiesResponse
     */
    CompletableFuture<QueryAllCitiesResponse> queryAllCities(QueryAllCitiesRequest request);

    /**
     * @param request the request parameters of QueryBatchRegistAnonymousTbAccountResult  QueryBatchRegistAnonymousTbAccountResultRequest
     * @return QueryBatchRegistAnonymousTbAccountResultResponse
     */
    CompletableFuture<QueryBatchRegistAnonymousTbAccountResultResponse> queryBatchRegistAnonymousTbAccountResult(QueryBatchRegistAnonymousTbAccountResultRequest request);

    /**
     * @param request the request parameters of QueryBestSession4Items  QueryBestSession4ItemsRequest
     * @return QueryBestSession4ItemsResponse
     */
    CompletableFuture<QueryBestSession4ItemsResponse> queryBestSession4Items(QueryBestSession4ItemsRequest request);

    /**
     * @param request the request parameters of QueryBizItemList  QueryBizItemListRequest
     * @return QueryBizItemListResponse
     */
    CompletableFuture<QueryBizItemListResponse> queryBizItemList(QueryBizItemListRequest request);

    /**
     * @param request the request parameters of QueryBizItemListV2  QueryBizItemListV2Request
     * @return QueryBizItemListV2Response
     */
    CompletableFuture<QueryBizItemListV2Response> queryBizItemListV2(QueryBizItemListV2Request request);

    /**
     * @param request the request parameters of QueryBizItemListWithCache  QueryBizItemListWithCacheRequest
     * @return QueryBizItemListWithCacheResponse
     */
    CompletableFuture<QueryBizItemListWithCacheResponse> queryBizItemListWithCache(QueryBizItemListWithCacheRequest request);

    /**
     * @param request the request parameters of QueryBizItems  QueryBizItemsRequest
     * @return QueryBizItemsResponse
     */
    CompletableFuture<QueryBizItemsResponse> queryBizItems(QueryBizItemsRequest request);

    /**
     * @param request the request parameters of QueryBizItemsWithActivity  QueryBizItemsWithActivityRequest
     * @return QueryBizItemsWithActivityResponse
     */
    CompletableFuture<QueryBizItemsWithActivityResponse> queryBizItemsWithActivity(QueryBizItemsWithActivityRequest request);

    /**
     * @param request the request parameters of QueryBudgetTicketItemListByBizId  QueryBudgetTicketItemListByBizIdRequest
     * @return QueryBudgetTicketItemListByBizIdResponse
     */
    CompletableFuture<QueryBudgetTicketItemListByBizIdResponse> queryBudgetTicketItemListByBizId(QueryBudgetTicketItemListByBizIdRequest request);

    /**
     * @param request the request parameters of QueryChannelItemBillDownloadUrl  QueryChannelItemBillDownloadUrlRequest
     * @return QueryChannelItemBillDownloadUrlResponse
     */
    CompletableFuture<QueryChannelItemBillDownloadUrlResponse> queryChannelItemBillDownloadUrl(QueryChannelItemBillDownloadUrlRequest request);

    /**
     * @param request the request parameters of QueryGuideItemGroup  QueryGuideItemGroupRequest
     * @return QueryGuideItemGroupResponse
     */
    CompletableFuture<QueryGuideItemGroupResponse> queryGuideItemGroup(QueryGuideItemGroupRequest request);

    /**
     * @param request the request parameters of QueryGuideItemGroupForCrowdOperation  QueryGuideItemGroupForCrowdOperationRequest
     * @return QueryGuideItemGroupForCrowdOperationResponse
     */
    CompletableFuture<QueryGuideItemGroupForCrowdOperationResponse> queryGuideItemGroupForCrowdOperation(QueryGuideItemGroupForCrowdOperationRequest request);

    /**
     * @param request the request parameters of QueryGuideItemGroupWithOutInventory  QueryGuideItemGroupWithOutInventoryRequest
     * @return QueryGuideItemGroupWithOutInventoryResponse
     */
    CompletableFuture<QueryGuideItemGroupWithOutInventoryResponse> queryGuideItemGroupWithOutInventory(QueryGuideItemGroupWithOutInventoryRequest request);

    /**
     * @param request the request parameters of QueryHotMovies  QueryHotMoviesRequest
     * @return QueryHotMoviesResponse
     */
    CompletableFuture<QueryHotMoviesResponse> queryHotMovies(QueryHotMoviesRequest request);

    /**
     * @param request the request parameters of QueryInventoryOfItemsInBizItemGroup  QueryInventoryOfItemsInBizItemGroupRequest
     * @return QueryInventoryOfItemsInBizItemGroupResponse
     */
    CompletableFuture<QueryInventoryOfItemsInBizItemGroupResponse> queryInventoryOfItemsInBizItemGroup(QueryInventoryOfItemsInBizItemGroupRequest request);

    /**
     * @param request the request parameters of QueryItemDetail  QueryItemDetailRequest
     * @return QueryItemDetailResponse
     */
    CompletableFuture<QueryItemDetailResponse> queryItemDetail(QueryItemDetailRequest request);

    /**
     * @param request the request parameters of QueryItemDetailInner  QueryItemDetailInnerRequest
     * @return QueryItemDetailInnerResponse
     */
    CompletableFuture<QueryItemDetailInnerResponse> queryItemDetailInner(QueryItemDetailInnerRequest request);

    /**
     * @param request the request parameters of QueryItemDetailTea  QueryItemDetailTeaRequest
     * @return QueryItemDetailTeaResponse
     */
    CompletableFuture<QueryItemDetailTeaResponse> queryItemDetailTea(QueryItemDetailTeaRequest request);

    /**
     * @param request the request parameters of QueryItemInSubBizs  QueryItemInSubBizsRequest
     * @return QueryItemInSubBizsResponse
     */
    CompletableFuture<QueryItemInSubBizsResponse> queryItemInSubBizs(QueryItemInSubBizsRequest request);

    /**
     * @param request the request parameters of QueryItemInventory  QueryItemInventoryRequest
     * @return QueryItemInventoryResponse
     */
    CompletableFuture<QueryItemInventoryResponse> queryItemInventory(QueryItemInventoryRequest request);

    /**
     * @param request the request parameters of QueryItemInventoryV2  QueryItemInventoryV2Request
     * @return QueryItemInventoryV2Response
     */
    CompletableFuture<QueryItemInventoryV2Response> queryItemInventoryV2(QueryItemInventoryV2Request request);

    /**
     * @param request the request parameters of QueryItemNextCycleRestriction  QueryItemNextCycleRestrictionRequest
     * @return QueryItemNextCycleRestrictionResponse
     */
    CompletableFuture<QueryItemNextCycleRestrictionResponse> queryItemNextCycleRestriction(QueryItemNextCycleRestrictionRequest request);

    /**
     * @param request the request parameters of QueryLogistics  QueryLogisticsRequest
     * @return QueryLogisticsResponse
     */
    CompletableFuture<QueryLogisticsResponse> queryLogistics(QueryLogisticsRequest request);

    /**
     * @param request the request parameters of QueryMediaSettleInfo  QueryMediaSettleInfoRequest
     * @return QueryMediaSettleInfoResponse
     */
    CompletableFuture<QueryMediaSettleInfoResponse> queryMediaSettleInfo(QueryMediaSettleInfoRequest request);

    /**
     * @param request the request parameters of QueryMessages  QueryMessagesRequest
     * @return QueryMessagesResponse
     */
    CompletableFuture<QueryMessagesResponse> queryMessages(QueryMessagesRequest request);

    /**
     * @param request the request parameters of QueryMovieComments  QueryMovieCommentsRequest
     * @return QueryMovieCommentsResponse
     */
    CompletableFuture<QueryMovieCommentsResponse> queryMovieComments(QueryMovieCommentsRequest request);

    /**
     * @param request the request parameters of QueryMovieSchedules  QueryMovieSchedulesRequest
     * @return QueryMovieSchedulesResponse
     */
    CompletableFuture<QueryMovieSchedulesResponse> queryMovieSchedules(QueryMovieSchedulesRequest request);

    /**
     * @param request the request parameters of QueryMovieSeats  QueryMovieSeatsRequest
     * @return QueryMovieSeatsResponse
     */
    CompletableFuture<QueryMovieSeatsResponse> queryMovieSeats(QueryMovieSeatsRequest request);

    /**
     * @param request the request parameters of QueryMovieTickets  QueryMovieTicketsRequest
     * @return QueryMovieTicketsResponse
     */
    CompletableFuture<QueryMovieTicketsResponse> queryMovieTickets(QueryMovieTicketsRequest request);

    /**
     * @param request the request parameters of QueryOrderAndPaymentList  QueryOrderAndPaymentListRequest
     * @return QueryOrderAndPaymentListResponse
     */
    CompletableFuture<QueryOrderAndPaymentListResponse> queryOrderAndPaymentList(QueryOrderAndPaymentListRequest request);

    /**
     * @param request the request parameters of QueryOrderAndPaymentListWithDesignatedTbUid  QueryOrderAndPaymentListWithDesignatedTbUidRequest
     * @return QueryOrderAndPaymentListWithDesignatedTbUidResponse
     */
    CompletableFuture<QueryOrderAndPaymentListWithDesignatedTbUidResponse> queryOrderAndPaymentListWithDesignatedTbUid(QueryOrderAndPaymentListWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of QueryOrderCommissionRate  QueryOrderCommissionRateRequest
     * @return QueryOrderCommissionRateResponse
     */
    CompletableFuture<QueryOrderCommissionRateResponse> queryOrderCommissionRate(QueryOrderCommissionRateRequest request);

    /**
     * @param request the request parameters of QueryOrderDetailInner  QueryOrderDetailInnerRequest
     * @return QueryOrderDetailInnerResponse
     */
    CompletableFuture<QueryOrderDetailInnerResponse> queryOrderDetailInner(QueryOrderDetailInnerRequest request);

    /**
     * @param request the request parameters of QueryOrderIdByPayId  QueryOrderIdByPayIdRequest
     * @return QueryOrderIdByPayIdResponse
     */
    CompletableFuture<QueryOrderIdByPayIdResponse> queryOrderIdByPayId(QueryOrderIdByPayIdRequest request);

    /**
     * @param request the request parameters of QueryOrderInfoAfterSale  QueryOrderInfoAfterSaleRequest
     * @return QueryOrderInfoAfterSaleResponse
     */
    CompletableFuture<QueryOrderInfoAfterSaleResponse> queryOrderInfoAfterSale(QueryOrderInfoAfterSaleRequest request);

    /**
     * @param request the request parameters of QueryOrderItemInfoByPaymentIdForAiZhanYou  QueryOrderItemInfoByPaymentIdForAiZhanYouRequest
     * @return QueryOrderItemInfoByPaymentIdForAiZhanYouResponse
     */
    CompletableFuture<QueryOrderItemInfoByPaymentIdForAiZhanYouResponse> queryOrderItemInfoByPaymentIdForAiZhanYou(QueryOrderItemInfoByPaymentIdForAiZhanYouRequest request);

    /**
     * @param request the request parameters of QueryOrderList  QueryOrderListRequest
     * @return QueryOrderListResponse
     */
    CompletableFuture<QueryOrderListResponse> queryOrderList(QueryOrderListRequest request);

    /**
     * @param request the request parameters of QueryOrderListWithDesignatedTbUid  QueryOrderListWithDesignatedTbUidRequest
     * @return QueryOrderListWithDesignatedTbUidResponse
     */
    CompletableFuture<QueryOrderListWithDesignatedTbUidResponse> queryOrderListWithDesignatedTbUid(QueryOrderListWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of QueryOrderLogistics  QueryOrderLogisticsRequest
     * @return QueryOrderLogisticsResponse
     */
    CompletableFuture<QueryOrderLogisticsResponse> queryOrderLogistics(QueryOrderLogisticsRequest request);

    /**
     * @param request the request parameters of QueryOrderLogisticsWithDesignatedTbUid  QueryOrderLogisticsWithDesignatedTbUidRequest
     * @return QueryOrderLogisticsWithDesignatedTbUidResponse
     */
    CompletableFuture<QueryOrderLogisticsWithDesignatedTbUidResponse> queryOrderLogisticsWithDesignatedTbUid(QueryOrderLogisticsWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of QueryRealTbAccountSupport  QueryRealTbAccountSupportRequest
     * @return QueryRealTbAccountSupportResponse
     */
    CompletableFuture<QueryRealTbAccountSupportResponse> queryRealTbAccountSupport(QueryRealTbAccountSupportRequest request);

    /**
     * @param request the request parameters of QueryRefundApplicationDetail  QueryRefundApplicationDetailRequest
     * @return QueryRefundApplicationDetailResponse
     */
    CompletableFuture<QueryRefundApplicationDetailResponse> queryRefundApplicationDetail(QueryRefundApplicationDetailRequest request);

    /**
     * @param request the request parameters of QueryRefundApplyWithDesignatedTbUid  QueryRefundApplyWithDesignatedTbUidRequest
     * @return QueryRefundApplyWithDesignatedTbUidResponse
     */
    CompletableFuture<QueryRefundApplyWithDesignatedTbUidResponse> queryRefundApplyWithDesignatedTbUid(QueryRefundApplyWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of QuerySellerLicense  QuerySellerLicenseRequest
     * @return QuerySellerLicenseResponse
     */
    CompletableFuture<QuerySellerLicenseResponse> querySellerLicense(QuerySellerLicenseRequest request);

    /**
     * @param request the request parameters of QueryStatements  QueryStatementsRequest
     * @return QueryStatementsResponse
     */
    CompletableFuture<QueryStatementsResponse> queryStatements(QueryStatementsRequest request);

    /**
     * @param request the request parameters of QuerySupplierItemBillDownloadUrl  QuerySupplierItemBillDownloadUrlRequest
     * @return QuerySupplierItemBillDownloadUrlResponse
     */
    CompletableFuture<QuerySupplierItemBillDownloadUrlResponse> querySupplierItemBillDownloadUrl(QuerySupplierItemBillDownloadUrlRequest request);

    /**
     * @param request the request parameters of QueryUnfinishedActivities  QueryUnfinishedActivitiesRequest
     * @return QueryUnfinishedActivitiesResponse
     */
    CompletableFuture<QueryUnfinishedActivitiesResponse> queryUnfinishedActivities(QueryUnfinishedActivitiesRequest request);

    /**
     * @param request the request parameters of QueryUnfinishedSessions  QueryUnfinishedSessionsRequest
     * @return QueryUnfinishedSessionsResponse
     */
    CompletableFuture<QueryUnfinishedSessionsResponse> queryUnfinishedSessions(QueryUnfinishedSessionsRequest request);

    /**
     * @param request the request parameters of QueryUnfinishedSessions4Items  QueryUnfinishedSessions4ItemsRequest
     * @return QueryUnfinishedSessions4ItemsResponse
     */
    CompletableFuture<QueryUnfinishedSessions4ItemsResponse> queryUnfinishedSessions4Items(QueryUnfinishedSessions4ItemsRequest request);

    /**
     * @param request the request parameters of QueryUpcomingMovies  QueryUpcomingMoviesRequest
     * @return QueryUpcomingMoviesResponse
     */
    CompletableFuture<QueryUpcomingMoviesResponse> queryUpcomingMovies(QueryUpcomingMoviesRequest request);

    /**
     * @param request the request parameters of QueryUserAccount  QueryUserAccountRequest
     * @return QueryUserAccountResponse
     */
    CompletableFuture<QueryUserAccountResponse> queryUserAccount(QueryUserAccountRequest request);

    /**
     * @param request the request parameters of QueryUserGameProcess  QueryUserGameProcessRequest
     * @return QueryUserGameProcessResponse
     */
    CompletableFuture<QueryUserGameProcessResponse> queryUserGameProcess(QueryUserGameProcessRequest request);

    /**
     * @param request the request parameters of QueryUserPoint  QueryUserPointRequest
     * @return QueryUserPointResponse
     */
    CompletableFuture<QueryUserPointResponse> queryUserPoint(QueryUserPointRequest request);

    /**
     * @param request the request parameters of QueryWithholdTrade  QueryWithholdTradeRequest
     * @return QueryWithholdTradeResponse
     */
    CompletableFuture<QueryWithholdTradeResponse> queryWithholdTrade(QueryWithholdTradeRequest request);

    /**
     * @param request the request parameters of RebindTbAccount  RebindTbAccountRequest
     * @return RebindTbAccountResponse
     */
    CompletableFuture<RebindTbAccountResponse> rebindTbAccount(RebindTbAccountRequest request);

    /**
     * @param request the request parameters of RefreshSettlementOrderAccount  RefreshSettlementOrderAccountRequest
     * @return RefreshSettlementOrderAccountResponse
     */
    CompletableFuture<RefreshSettlementOrderAccountResponse> refreshSettlementOrderAccount(RefreshSettlementOrderAccountRequest request);

    /**
     * @param request the request parameters of RefundOrder  RefundOrderRequest
     * @return RefundOrderResponse
     */
    CompletableFuture<RefundOrderResponse> refundOrder(RefundOrderRequest request);

    /**
     * @param request the request parameters of RefundPoint  RefundPointRequest
     * @return RefundPointResponse
     */
    CompletableFuture<RefundPointResponse> refundPoint(RefundPointRequest request);

    /**
     * @param request the request parameters of RefundUserPoint  RefundUserPointRequest
     * @return RefundUserPointResponse
     */
    CompletableFuture<RefundUserPointResponse> refundUserPoint(RefundUserPointRequest request);

    /**
     * @param request the request parameters of RefuseMerchantSyncTask  RefuseMerchantSyncTaskRequest
     * @return RefuseMerchantSyncTaskResponse
     */
    CompletableFuture<RefuseMerchantSyncTaskResponse> refuseMerchantSyncTask(RefuseMerchantSyncTaskRequest request);

    /**
     * @param request the request parameters of RegistAnonymousTbAccount  RegistAnonymousTbAccountRequest
     * @return RegistAnonymousTbAccountResponse
     */
    CompletableFuture<RegistAnonymousTbAccountResponse> registAnonymousTbAccount(RegistAnonymousTbAccountRequest request);

    /**
     * @param request the request parameters of RegisterSettleAccount  RegisterSettleAccountRequest
     * @return RegisterSettleAccountResponse
     */
    CompletableFuture<RegisterSettleAccountResponse> registerSettleAccount(RegisterSettleAccountRequest request);

    /**
     * @param request the request parameters of RegisterUserAccount  RegisterUserAccountRequest
     * @return RegisterUserAccountResponse
     */
    CompletableFuture<RegisterUserAccountResponse> registerUserAccount(RegisterUserAccountRequest request);

    /**
     * @param request the request parameters of ReleaseMovieSeat  ReleaseMovieSeatRequest
     * @return ReleaseMovieSeatResponse
     */
    CompletableFuture<ReleaseMovieSeatResponse> releaseMovieSeat(ReleaseMovieSeatRequest request);

    /**
     * @param request the request parameters of RemoveAddress  RemoveAddressRequest
     * @return RemoveAddressResponse
     */
    CompletableFuture<RemoveAddressResponse> removeAddress(RemoveAddressRequest request);

    /**
     * @param request the request parameters of RemoveMessages  RemoveMessagesRequest
     * @return RemoveMessagesResponse
     */
    CompletableFuture<RemoveMessagesResponse> removeMessages(RemoveMessagesRequest request);

    /**
     * @param request the request parameters of RenderH5Order  RenderH5OrderRequest
     * @return RenderH5OrderResponse
     */
    CompletableFuture<RenderH5OrderResponse> renderH5Order(RenderH5OrderRequest request);

    /**
     * @param request the request parameters of RenderOrder  RenderOrderRequest
     * @return RenderOrderResponse
     */
    CompletableFuture<RenderOrderResponse> renderOrder(RenderOrderRequest request);

    /**
     * @param request the request parameters of RenderOrderWithDesignatedTbUid  RenderOrderWithDesignatedTbUidRequest
     * @return RenderOrderWithDesignatedTbUidResponse
     */
    CompletableFuture<RenderOrderWithDesignatedTbUidResponse> renderOrderWithDesignatedTbUid(RenderOrderWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of RepayForPayUrl  RepayForPayUrlRequest
     * @return RepayForPayUrlResponse
     */
    CompletableFuture<RepayForPayUrlResponse> repayForPayUrl(RepayForPayUrlRequest request);

    /**
     * @param request the request parameters of RepayOrder  RepayOrderRequest
     * @return RepayOrderResponse
     */
    CompletableFuture<RepayOrderResponse> repayOrder(RepayOrderRequest request);

    /**
     * @param request the request parameters of RepayWithDesignatedTbUid  RepayWithDesignatedTbUidRequest
     * @return RepayWithDesignatedTbUidResponse
     */
    CompletableFuture<RepayWithDesignatedTbUidResponse> repayWithDesignatedTbUid(RepayWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of ReserveMovieSeat  ReserveMovieSeatRequest
     * @return ReserveMovieSeatResponse
     */
    CompletableFuture<ReserveMovieSeatResponse> reserveMovieSeat(ReserveMovieSeatRequest request);

    /**
     * @param request the request parameters of SettleOrder  SettleOrderRequest
     * @return SettleOrderResponse
     */
    CompletableFuture<SettleOrderResponse> settleOrder(SettleOrderRequest request);

    /**
     * @param request the request parameters of StartUserGame  StartUserGameRequest
     * @return StartUserGameResponse
     */
    CompletableFuture<StartUserGameResponse> startUserGame(StartUserGameRequest request);

    /**
     * @param request the request parameters of SubmitReturnGoodLogistics  SubmitReturnGoodLogisticsRequest
     * @return SubmitReturnGoodLogisticsResponse
     */
    CompletableFuture<SubmitReturnGoodLogisticsResponse> submitReturnGoodLogistics(SubmitReturnGoodLogisticsRequest request);

    /**
     * @param request the request parameters of SubmitReturnGoodLogisticsWithDesignatedTbUid  SubmitReturnGoodLogisticsWithDesignatedTbUidRequest
     * @return SubmitReturnGoodLogisticsWithDesignatedTbUidResponse
     */
    CompletableFuture<SubmitReturnGoodLogisticsWithDesignatedTbUidResponse> submitReturnGoodLogisticsWithDesignatedTbUid(SubmitReturnGoodLogisticsWithDesignatedTbUidRequest request);

    /**
     * @param request the request parameters of SyncMerchantInfo  SyncMerchantInfoRequest
     * @return SyncMerchantInfoResponse
     */
    CompletableFuture<SyncMerchantInfoResponse> syncMerchantInfo(SyncMerchantInfoRequest request);

    /**
     * @param request the request parameters of UnFreezeUserPoint  UnFreezeUserPointRequest
     * @return UnFreezeUserPointResponse
     */
    CompletableFuture<UnFreezeUserPointResponse> unFreezeUserPoint(UnFreezeUserPointRequest request);

    /**
     * @param request the request parameters of UnsignWithholdAgreement  UnsignWithholdAgreementRequest
     * @return UnsignWithholdAgreementResponse
     */
    CompletableFuture<UnsignWithholdAgreementResponse> unsignWithholdAgreement(UnsignWithholdAgreementRequest request);

    /**
     * @param request the request parameters of UpdateAddress  UpdateAddressRequest
     * @return UpdateAddressResponse
     */
    CompletableFuture<UpdateAddressResponse> updateAddress(UpdateAddressRequest request);

    /**
     * @param request the request parameters of ValidateTaobaoAccount  ValidateTaobaoAccountRequest
     * @return ValidateTaobaoAccountResponse
     */
    CompletableFuture<ValidateTaobaoAccountResponse> validateTaobaoAccount(ValidateTaobaoAccountRequest request);

}
