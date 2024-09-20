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

    CompletableFuture<AccountFlowListResponse> accountFlowList(AccountFlowListRequest request);

    CompletableFuture<AncillarySuggestResponse> ancillarySuggest(AncillarySuggestRequest request);

    CompletableFuture<BookResponse> book(BookRequest request);

    CompletableFuture<CancelResponse> cancel(CancelRequest request);

    CompletableFuture<ChangeApplyResponse> changeApply(ChangeApplyRequest request);

    CompletableFuture<ChangeCancelResponse> changeCancel(ChangeCancelRequest request);

    CompletableFuture<ChangeConfirmResponse> changeConfirm(ChangeConfirmRequest request);

    CompletableFuture<ChangeDetailResponse> changeDetail(ChangeDetailRequest request);

    CompletableFuture<ChangeDetailListOfBuyerResponse> changeDetailListOfBuyer(ChangeDetailListOfBuyerRequest request);

    CompletableFuture<ChangeDetailListOfOrderNumResponse> changeDetailListOfOrderNum(ChangeDetailListOfOrderNumRequest request);

    CompletableFuture<EnrichResponse> enrich(EnrichRequest request);

    CompletableFuture<FileUploadResponse> fileUpload(FileUploadRequest request);

    CompletableFuture<FlightChangeOfOrderResponse> flightChangeOfOrder(FlightChangeOfOrderRequest request);

    CompletableFuture<GetTokenResponse> getToken(GetTokenRequest request);

    CompletableFuture<LuggageDirectResponse> luggageDirect(LuggageDirectRequest request);

    CompletableFuture<OrderDetailResponse> orderDetail(OrderDetailRequest request);

    CompletableFuture<OrderListResponse> orderList(OrderListRequest request);

    CompletableFuture<PricingResponse> pricing(PricingRequest request);

    CompletableFuture<RefundApplyResponse> refundApply(RefundApplyRequest request);

    CompletableFuture<RefundDetailResponse> refundDetail(RefundDetailRequest request);

    CompletableFuture<RefundDetailListResponse> refundDetailList(RefundDetailListRequest request);

    CompletableFuture<SearchResponse> search(SearchRequest request);

    CompletableFuture<TicketingResponse> ticketing(TicketingRequest request);

    CompletableFuture<TicketingCheckResponse> ticketingCheck(TicketingCheckRequest request);

    CompletableFuture<TransitVisaResponse> transitVisa(TransitVisaRequest request);

}
