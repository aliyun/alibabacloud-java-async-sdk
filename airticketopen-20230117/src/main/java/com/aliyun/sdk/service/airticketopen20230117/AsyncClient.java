// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.airticketopen20230117.models.*;
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
     * @param request the request parameters of AccountFlowList  AccountFlowListRequest
     * @return AccountFlowListResponse
     */
    CompletableFuture<AccountFlowListResponse> accountFlowList(AccountFlowListRequest request);

    /**
     * @param request the request parameters of AncillarySuggest  AncillarySuggestRequest
     * @return AncillarySuggestResponse
     */
    CompletableFuture<AncillarySuggestResponse> ancillarySuggest(AncillarySuggestRequest request);

    /**
     * @param request the request parameters of Book  BookRequest
     * @return BookResponse
     */
    CompletableFuture<BookResponse> book(BookRequest request);

    /**
     * @param request the request parameters of Cancel  CancelRequest
     * @return CancelResponse
     */
    CompletableFuture<CancelResponse> cancel(CancelRequest request);

    /**
     * @param request the request parameters of ChangeApply  ChangeApplyRequest
     * @return ChangeApplyResponse
     */
    CompletableFuture<ChangeApplyResponse> changeApply(ChangeApplyRequest request);

    /**
     * @param request the request parameters of ChangeCancel  ChangeCancelRequest
     * @return ChangeCancelResponse
     */
    CompletableFuture<ChangeCancelResponse> changeCancel(ChangeCancelRequest request);

    /**
     * @param request the request parameters of ChangeConfirm  ChangeConfirmRequest
     * @return ChangeConfirmResponse
     */
    CompletableFuture<ChangeConfirmResponse> changeConfirm(ChangeConfirmRequest request);

    /**
     * @param request the request parameters of ChangeDetail  ChangeDetailRequest
     * @return ChangeDetailResponse
     */
    CompletableFuture<ChangeDetailResponse> changeDetail(ChangeDetailRequest request);

    /**
     * @param request the request parameters of ChangeDetailListOfBuyer  ChangeDetailListOfBuyerRequest
     * @return ChangeDetailListOfBuyerResponse
     */
    CompletableFuture<ChangeDetailListOfBuyerResponse> changeDetailListOfBuyer(ChangeDetailListOfBuyerRequest request);

    /**
     * @param request the request parameters of ChangeDetailListOfOrderNum  ChangeDetailListOfOrderNumRequest
     * @return ChangeDetailListOfOrderNumResponse
     */
    CompletableFuture<ChangeDetailListOfOrderNumResponse> changeDetailListOfOrderNum(ChangeDetailListOfOrderNumRequest request);

    /**
     * <b>description</b> :
     * <p>Collects lowest-price flight information.</p>
     * 
     * @param request the request parameters of CollectFlightLowestPrice  CollectFlightLowestPriceRequest
     * @return CollectFlightLowestPriceResponse
     */
    CompletableFuture<CollectFlightLowestPriceResponse> collectFlightLowestPrice(CollectFlightLowestPriceRequest request);

    /**
     * <b>description</b> :
     * <p>In the input parameters, choose either solution_id or journey_param_list. solution_id must be obtained from the Search API.</p>
     * 
     * @param request the request parameters of Enrich  EnrichRequest
     * @return EnrichResponse
     */
    CompletableFuture<EnrichResponse> enrich(EnrichRequest request);

    /**
     * @param request the request parameters of FileUpload  FileUploadRequest
     * @return FileUploadResponse
     */
    CompletableFuture<FileUploadResponse> fileUpload(FileUploadRequest request);

    /**
     * @param request the request parameters of FlightChangeOfOrder  FlightChangeOfOrderRequest
     * @return FlightChangeOfOrderResponse
     */
    CompletableFuture<FlightChangeOfOrderResponse> flightChangeOfOrder(FlightChangeOfOrderRequest request);

    /**
     * @param request the request parameters of GetToken  GetTokenRequest
     * @return GetTokenResponse
     */
    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    /**
     * <b>description</b> :
     * <p>Queries luggage through-check information for an itinerary. Provide itinerary information as input, and the API returns whether luggage through-check is supported for the itinerary. Luggage through-check applies to transfer and stopover scenarios.</p>
     * 
     * @param request the request parameters of LuggageDirect  LuggageDirectRequest
     * @return LuggageDirectResponse
     */
    CompletableFuture<LuggageDirectResponse> luggageDirect(LuggageDirectRequest request);

    /**
     * @param request the request parameters of OrderDetail  OrderDetailRequest
     * @return OrderDetailResponse
     */
    CompletableFuture<OrderDetailResponse> orderDetail(OrderDetailRequest request);

    /**
     * @param request the request parameters of OrderList  OrderListRequest
     * @return OrderListResponse
     */
    CompletableFuture<OrderListResponse> orderList(OrderListRequest request);

    /**
     * @param request the request parameters of Pricing  PricingRequest
     * @return PricingResponse
     */
    CompletableFuture<PricingResponse> pricing(PricingRequest request);

    /**
     * @param request the request parameters of RefundApply  RefundApplyRequest
     * @return RefundApplyResponse
     */
    CompletableFuture<RefundApplyResponse> refundApply(RefundApplyRequest request);

    /**
     * @param request the request parameters of RefundDetail  RefundDetailRequest
     * @return RefundDetailResponse
     */
    CompletableFuture<RefundDetailResponse> refundDetail(RefundDetailRequest request);

    /**
     * @param request the request parameters of RefundDetailList  RefundDetailListRequest
     * @return RefundDetailListResponse
     */
    CompletableFuture<RefundDetailListResponse> refundDetailList(RefundDetailListRequest request);

    /**
     * @param request the request parameters of Search  SearchRequest
     * @return SearchResponse
     */
    CompletableFuture<SearchResponse> search(SearchRequest request);

    /**
     * @param request the request parameters of StandardSearch  StandardSearchRequest
     * @return StandardSearchResponse
     */
    CompletableFuture<StandardSearchResponse> standardSearch(StandardSearchRequest request);

    /**
     * @param request the request parameters of TicketApplyRefund  TicketApplyRefundRequest
     * @return TicketApplyRefundResponse
     */
    CompletableFuture<TicketApplyRefundResponse> ticketApplyRefund(TicketApplyRefundRequest request);

    /**
     * @param request the request parameters of TicketCancelOrder  TicketCancelOrderRequest
     * @return TicketCancelOrderResponse
     */
    CompletableFuture<TicketCancelOrderResponse> ticketCancelOrder(TicketCancelOrderRequest request);

    /**
     * @param request the request parameters of TicketCheckRefund  TicketCheckRefundRequest
     * @return TicketCheckRefundResponse
     */
    CompletableFuture<TicketCheckRefundResponse> ticketCheckRefund(TicketCheckRefundRequest request);

    /**
     * @param request the request parameters of TicketCreateOrder  TicketCreateOrderRequest
     * @return TicketCreateOrderResponse
     */
    CompletableFuture<TicketCreateOrderResponse> ticketCreateOrder(TicketCreateOrderRequest request);

    /**
     * @param request the request parameters of TicketPageQueryProduct  TicketPageQueryProductRequest
     * @return TicketPageQueryProductResponse
     */
    CompletableFuture<TicketPageQueryProductResponse> ticketPageQueryProduct(TicketPageQueryProductRequest request);

    /**
     * @param request the request parameters of TicketPageQueryScenic  TicketPageQueryScenicRequest
     * @return TicketPageQueryScenicResponse
     */
    CompletableFuture<TicketPageQueryScenicResponse> ticketPageQueryScenic(TicketPageQueryScenicRequest request);

    /**
     * @param request the request parameters of TicketPayOrder  TicketPayOrderRequest
     * @return TicketPayOrderResponse
     */
    CompletableFuture<TicketPayOrderResponse> ticketPayOrder(TicketPayOrderRequest request);

    /**
     * @param request the request parameters of TicketQueryOrder  TicketQueryOrderRequest
     * @return TicketQueryOrderResponse
     */
    CompletableFuture<TicketQueryOrderResponse> ticketQueryOrder(TicketQueryOrderRequest request);

    /**
     * @param request the request parameters of TicketQueryPriceStock  TicketQueryPriceStockRequest
     * @return TicketQueryPriceStockResponse
     */
    CompletableFuture<TicketQueryPriceStockResponse> ticketQueryPriceStock(TicketQueryPriceStockRequest request);

    /**
     * @param request the request parameters of TicketQueryProduct  TicketQueryProductRequest
     * @return TicketQueryProductResponse
     */
    CompletableFuture<TicketQueryProductResponse> ticketQueryProduct(TicketQueryProductRequest request);

    /**
     * @param request the request parameters of TicketQueryRefundOrder  TicketQueryRefundOrderRequest
     * @return TicketQueryRefundOrderResponse
     */
    CompletableFuture<TicketQueryRefundOrderResponse> ticketQueryRefundOrder(TicketQueryRefundOrderRequest request);

    /**
     * @param request the request parameters of TicketQueryScenic  TicketQueryScenicRequest
     * @return TicketQueryScenicResponse
     */
    CompletableFuture<TicketQueryScenicResponse> ticketQueryScenic(TicketQueryScenicRequest request);

    /**
     * @param request the request parameters of TicketQueryShelf  TicketQueryShelfRequest
     * @return TicketQueryShelfResponse
     */
    CompletableFuture<TicketQueryShelfResponse> ticketQueryShelf(TicketQueryShelfRequest request);

    /**
     * @param request the request parameters of Ticketing  TicketingRequest
     * @return TicketingResponse
     */
    CompletableFuture<TicketingResponse> ticketing(TicketingRequest request);

    /**
     * <b>description</b> :
     * <p>Performs a pre-ticketing check. This operation is optional.</p>
     * 
     * @param request the request parameters of TicketingCheck  TicketingCheckRequest
     * @return TicketingCheckResponse
     */
    CompletableFuture<TicketingCheckResponse> ticketingCheck(TicketingCheckRequest request);

    /**
     * <b>description</b> :
     * <p>Queries transit visa requirements for a flight itinerary. You provide flight information, and the API returns whether a transit visa is required for the itinerary. Only transfer or stopover segments are valid input parameters (transfers or stopovers passing through a third country). The supported passenger type defaults to Chinese mainland travelers.</p>
     * 
     * @param request the request parameters of TransitVisa  TransitVisaRequest
     * @return TransitVisaResponse
     */
    CompletableFuture<TransitVisaResponse> transitVisa(TransitVisaRequest request);

    /**
     * @param request the request parameters of applyRefund  ApplyRefundRequest
     * @return ApplyRefundResponse
     */
    CompletableFuture<ApplyRefundResponse> applyRefund(ApplyRefundRequest request);

    /**
     * @param request the request parameters of batchGetHotelDetail  BatchGetHotelDetailRequest
     * @return BatchGetHotelDetailResponse
     */
    CompletableFuture<BatchGetHotelDetailResponse> batchGetHotelDetail(BatchGetHotelDetailRequest request);

    /**
     * @param request the request parameters of cancelOrRefund  CancelOrRefundRequest
     * @return CancelOrRefundResponse
     */
    CompletableFuture<CancelOrRefundResponse> cancelOrRefund(CancelOrRefundRequest request);

    /**
     * @param request the request parameters of cancelOrder  CancelOrderRequest
     * @return CancelOrderResponse
     */
    CompletableFuture<CancelOrderResponse> cancelOrder(CancelOrderRequest request);

    /**
     * @param request the request parameters of createAndPay  CreateAndPayRequest
     * @return CreateAndPayResponse
     */
    CompletableFuture<CreateAndPayResponse> createAndPay(CreateAndPayRequest request);

    /**
     * @param request the request parameters of createOrder  CreateOrderRequest
     * @return CreateOrderResponse
     */
    CompletableFuture<CreateOrderResponse> createOrder(CreateOrderRequest request);

    /**
     * @param request the request parameters of globalHotelApplyRefund  GlobalHotelApplyRefundRequest
     * @return GlobalHotelApplyRefundResponse
     */
    CompletableFuture<GlobalHotelApplyRefundResponse> globalHotelApplyRefund(GlobalHotelApplyRefundRequest request);

    /**
     * @param request the request parameters of globalHotelBatchGetHotelDetail  GlobalHotelBatchGetHotelDetailRequest
     * @return GlobalHotelBatchGetHotelDetailResponse
     */
    CompletableFuture<GlobalHotelBatchGetHotelDetailResponse> globalHotelBatchGetHotelDetail(GlobalHotelBatchGetHotelDetailRequest request);

    /**
     * @param request the request parameters of globalHotelCancelOrRefund  GlobalHotelCancelOrRefundRequest
     * @return GlobalHotelCancelOrRefundResponse
     */
    CompletableFuture<GlobalHotelCancelOrRefundResponse> globalHotelCancelOrRefund(GlobalHotelCancelOrRefundRequest request);

    /**
     * @param request the request parameters of globalHotelCancelOrder  GlobalHotelCancelOrderRequest
     * @return GlobalHotelCancelOrderResponse
     */
    CompletableFuture<GlobalHotelCancelOrderResponse> globalHotelCancelOrder(GlobalHotelCancelOrderRequest request);

    /**
     * @param request the request parameters of globalHotelCreateAndPay  GlobalHotelCreateAndPayRequest
     * @return GlobalHotelCreateAndPayResponse
     */
    CompletableFuture<GlobalHotelCreateAndPayResponse> globalHotelCreateAndPay(GlobalHotelCreateAndPayRequest request);

    /**
     * @param request the request parameters of globalHotelCreateOrder  GlobalHotelCreateOrderRequest
     * @return GlobalHotelCreateOrderResponse
     */
    CompletableFuture<GlobalHotelCreateOrderResponse> globalHotelCreateOrder(GlobalHotelCreateOrderRequest request);

    /**
     * @param request the request parameters of globalHotelPay  GlobalHotelPayRequest
     * @return GlobalHotelPayResponse
     */
    CompletableFuture<GlobalHotelPayResponse> globalHotelPay(GlobalHotelPayRequest request);

    /**
     * @param request the request parameters of globalHotelQueryAvailability  GlobalHotelQueryAvailabilityRequest
     * @return GlobalHotelQueryAvailabilityResponse
     */
    CompletableFuture<GlobalHotelQueryAvailabilityResponse> globalHotelQueryAvailability(GlobalHotelQueryAvailabilityRequest request);

    /**
     * @param request the request parameters of globalHotelQueryCalendarAvailability  GlobalHotelQueryCalendarAvailabilityRequest
     * @return GlobalHotelQueryCalendarAvailabilityResponse
     */
    CompletableFuture<GlobalHotelQueryCalendarAvailabilityResponse> globalHotelQueryCalendarAvailability(GlobalHotelQueryCalendarAvailabilityRequest request);

    /**
     * @param request the request parameters of globalHotelQueryOrder  GlobalHotelQueryOrderRequest
     * @return GlobalHotelQueryOrderResponse
     */
    CompletableFuture<GlobalHotelQueryOrderResponse> globalHotelQueryOrder(GlobalHotelQueryOrderRequest request);

    /**
     * @param request the request parameters of globalHotelSearchCityPage  GlobalHotelSearchCityPageRequest
     * @return GlobalHotelSearchCityPageResponse
     */
    CompletableFuture<GlobalHotelSearchCityPageResponse> globalHotelSearchCityPage(GlobalHotelSearchCityPageRequest request);

    /**
     * @param request the request parameters of globalHotelSearchHotelList  GlobalHotelSearchHotelListRequest
     * @return GlobalHotelSearchHotelListResponse
     */
    CompletableFuture<GlobalHotelSearchHotelListResponse> globalHotelSearchHotelList(GlobalHotelSearchHotelListRequest request);

    /**
     * @param request the request parameters of globalHotelValidatePrice  GlobalHotelValidatePriceRequest
     * @return GlobalHotelValidatePriceResponse
     */
    CompletableFuture<GlobalHotelValidatePriceResponse> globalHotelValidatePrice(GlobalHotelValidatePriceRequest request);

    /**
     * @param request the request parameters of pay  PayRequest
     * @return PayResponse
     */
    CompletableFuture<PayResponse> pay(PayRequest request);

    /**
     * @param request the request parameters of queryAvailability  QueryAvailabilityRequest
     * @return QueryAvailabilityResponse
     */
    CompletableFuture<QueryAvailabilityResponse> queryAvailability(QueryAvailabilityRequest request);

    /**
     * @param request the request parameters of queryCalendarAvailability  QueryCalendarAvailabilityRequest
     * @return QueryCalendarAvailabilityResponse
     */
    CompletableFuture<QueryCalendarAvailabilityResponse> queryCalendarAvailability(QueryCalendarAvailabilityRequest request);

    /**
     * @param request the request parameters of queryOrder  QueryOrderRequest
     * @return QueryOrderResponse
     */
    CompletableFuture<QueryOrderResponse> queryOrder(QueryOrderRequest request);

    /**
     * @param request the request parameters of searchCityPage  SearchCityPageRequest
     * @return SearchCityPageResponse
     */
    CompletableFuture<SearchCityPageResponse> searchCityPage(SearchCityPageRequest request);

    /**
     * @param request the request parameters of searchHotelList  SearchHotelListRequest
     * @return SearchHotelListResponse
     */
    CompletableFuture<SearchHotelListResponse> searchHotelList(SearchHotelListRequest request);

    /**
     * @param request the request parameters of validatePrice  ValidatePriceRequest
     * @return ValidatePriceResponse
     */
    CompletableFuture<ValidatePriceResponse> validatePrice(ValidatePriceRequest request);

}
