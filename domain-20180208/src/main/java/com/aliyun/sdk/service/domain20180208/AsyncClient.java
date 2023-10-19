// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.domain20180208.models.*;
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

    CompletableFuture<AcceptDemandResponse> acceptDemand(AcceptDemandRequest request);

    CompletableFuture<BidDomainResponse> bidDomain(BidDomainRequest request);

    CompletableFuture<ChangeAuctionResponse> changeAuction(ChangeAuctionRequest request);

    CompletableFuture<CheckDomainStatusResponse> checkDomainStatus(CheckDomainStatusRequest request);

    CompletableFuture<CheckSelectedDomainStatusResponse> checkSelectedDomainStatus(CheckSelectedDomainStatusRequest request);

    CompletableFuture<CreateFixedPriceDemandOrderResponse> createFixedPriceDemandOrder(CreateFixedPriceDemandOrderRequest request);

    CompletableFuture<CreateFixedPriceSelectedOrderResponse> createFixedPriceSelectedOrder(CreateFixedPriceSelectedOrderRequest request);

    CompletableFuture<FailDemandResponse> failDemand(FailDemandRequest request);

    CompletableFuture<FinishDemandResponse> finishDemand(FinishDemandRequest request);

    CompletableFuture<GetIntlDomainDownloadUrlResponse> getIntlDomainDownloadUrl(GetIntlDomainDownloadUrlRequest request);

    CompletableFuture<GetReserveDomainUrlResponse> getReserveDomainUrl(GetReserveDomainUrlRequest request);

    CompletableFuture<PurchaseIntlDomainResponse> purchaseIntlDomain(PurchaseIntlDomainRequest request);

    CompletableFuture<QueryAuctionDetailResponse> queryAuctionDetail(QueryAuctionDetailRequest request);

    CompletableFuture<QueryAuctionsResponse> queryAuctions(QueryAuctionsRequest request);

    CompletableFuture<QueryBidRecordsResponse> queryBidRecords(QueryBidRecordsRequest request);

    CompletableFuture<QueryBookingDomainInfoResponse> queryBookingDomainInfo(QueryBookingDomainInfoRequest request);

    CompletableFuture<QueryBrokerDemandResponse> queryBrokerDemand(QueryBrokerDemandRequest request);

    CompletableFuture<QueryBrokerDemandRecordResponse> queryBrokerDemandRecord(QueryBrokerDemandRecordRequest request);

    CompletableFuture<QueryDomainTransferStatusResponse> queryDomainTransferStatus(QueryDomainTransferStatusRequest request);

    CompletableFuture<QueryPurchasedDomainsResponse> queryPurchasedDomains(QueryPurchasedDomainsRequest request);

    CompletableFuture<RecordDemandResponse> recordDemand(RecordDemandRequest request);

    CompletableFuture<RefuseDemandResponse> refuseDemand(RefuseDemandRequest request);

    CompletableFuture<RequestPayDemandResponse> requestPayDemand(RequestPayDemandRequest request);

    CompletableFuture<ReserveDomainResponse> reserveDomain(ReserveDomainRequest request);

    CompletableFuture<ReserveIntlDomainResponse> reserveIntlDomain(ReserveIntlDomainRequest request);

    CompletableFuture<SelectedDomainListResponse> selectedDomainList(SelectedDomainListRequest request);

    CompletableFuture<UpdatePartnerReservePriceResponse> updatePartnerReservePrice(UpdatePartnerReservePriceRequest request);

}
