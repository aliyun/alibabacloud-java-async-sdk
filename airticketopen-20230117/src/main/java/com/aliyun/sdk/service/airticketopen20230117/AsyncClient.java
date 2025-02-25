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
     * <b>description</b> :
     * <p>search ancillary for selected solution, you should enter the solution_id returned by enrich.</p>
     * 
     * @param request the request parameters of AncillarySuggest  AncillarySuggestRequest
     * @return AncillarySuggestResponse
     */
    CompletableFuture<AncillarySuggestResponse> ancillarySuggest(AncillarySuggestRequest request);

    /**
     * <b>description</b> :
     * <p>Enter solution_id returned by enrich, ancillary_id returned by ancillarySuggest(optional), passengers information and contact information, the book interface will create an order wait for pay.
     * There are two issues should be noticed:</p>
     * <ol>
     * <li>the solution_id must be processed by pricing.</li>
     * <li>the order created by book interface should be pay within 30 minutes, otherwise the order will be closed.</li>
     * </ol>
     * 
     * @param request the request parameters of Book  BookRequest
     * @return BookResponse
     */
    CompletableFuture<BookResponse> book(BookRequest request);

    /**
     * <b>description</b> :
     * <p>close an unpaid order</p>
     * 
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
     * @param request the request parameters of CollectFlightLowestPrice  CollectFlightLowestPriceRequest
     * @return CollectFlightLowestPriceResponse
     */
    CompletableFuture<CollectFlightLowestPriceResponse> collectFlightLowestPrice(CollectFlightLowestPriceRequest request);

    /**
     * <b>description</b> :
     * <p>Enrich supports two modes:</p>
     * <ol>
     * <li>mode1: enter solution_id returned by Search.</li>
     * <li>mode2: enter journeyParamList.
     * If you already confirm which flight to fly with, then you can use mode2, otherwise, use mode1(search first, then chose one solution_ID and Enrich).</li>
     * </ol>
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
     * @param request the request parameters of LuggageDirect  LuggageDirectRequest
     * @return LuggageDirectResponse
     */
    CompletableFuture<LuggageDirectResponse> luggageDirect(LuggageDirectRequest request);

    /**
     * <b>description</b> :
     * <p>query order detail</p>
     * 
     * @param request the request parameters of OrderDetail  OrderDetailRequest
     * @return OrderDetailResponse
     */
    CompletableFuture<OrderDetailResponse> orderDetail(OrderDetailRequest request);

    /**
     * <b>description</b> :
     * <p>query order list</p>
     * 
     * @param request the request parameters of OrderList  OrderListRequest
     * @return OrderListResponse
     */
    CompletableFuture<OrderListResponse> orderList(OrderListRequest request);

    /**
     * <b>description</b> :
     * <p>Check is price and remaining seats of solution you selected has changed. You should enter the solution_id returned by enrich.</p>
     * 
     * @param request the request parameters of Pricing  PricingRequest
     * @return PricingResponse
     */
    CompletableFuture<PricingResponse> pricing(PricingRequest request);

    /**
     * <b>description</b> :
     * <p>Apply for a refund and generate a refund order.</p>
     * 
     * @param request the request parameters of RefundApply  RefundApplyRequest
     * @return RefundApplyResponse
     */
    CompletableFuture<RefundApplyResponse> refundApply(RefundApplyRequest request);

    /**
     * <b>description</b> :
     * <p>Query refund order detail.</p>
     * 
     * @param request the request parameters of RefundDetail  RefundDetailRequest
     * @return RefundDetailResponse
     */
    CompletableFuture<RefundDetailResponse> refundDetail(RefundDetailRequest request);

    /**
     * <b>description</b> :
     * <p>Query refund order detail.</p>
     * 
     * @param request the request parameters of RefundDetailList  RefundDetailListRequest
     * @return RefundDetailListResponse
     */
    CompletableFuture<RefundDetailListResponse> refundDetailList(RefundDetailListRequest request);

    /**
     * <b>description</b> :
     * <p>Enter the information of departure, arrival, departure date, passenger number and cabin, return the lowest price for each flight.</p>
     * 
     * @param request the request parameters of Search  SearchRequest
     * @return SearchResponse
     */
    CompletableFuture<SearchResponse> search(SearchRequest request);

    /**
     * @param request the request parameters of Ticketing  TicketingRequest
     * @return TicketingResponse
     */
    CompletableFuture<TicketingResponse> ticketing(TicketingRequest request);

    /**
     * <b>description</b> :
     * <p>Pre-check for Ticketing, this interface is optional to use.</p>
     * 
     * @param request the request parameters of TicketingCheck  TicketingCheckRequest
     * @return TicketingCheckResponse
     */
    CompletableFuture<TicketingCheckResponse> ticketingCheck(TicketingCheckRequest request);

    /**
     * @param request the request parameters of TransitVisa  TransitVisaRequest
     * @return TransitVisaResponse
     */
    CompletableFuture<TransitVisaResponse> transitVisa(TransitVisaRequest request);

}
