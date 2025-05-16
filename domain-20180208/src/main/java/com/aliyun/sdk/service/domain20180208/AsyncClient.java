// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.domain20180208.models.*;
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
     * @param request the request parameters of AcceptDemand  AcceptDemandRequest
     * @return AcceptDemandResponse
     */
    CompletableFuture<AcceptDemandResponse> acceptDemand(AcceptDemandRequest request);

    /**
     * @param request the request parameters of BidDomain  BidDomainRequest
     * @return BidDomainResponse
     */
    CompletableFuture<BidDomainResponse> bidDomain(BidDomainRequest request);

    /**
     * @param request the request parameters of ChangeAuction  ChangeAuctionRequest
     * @return ChangeAuctionResponse
     */
    CompletableFuture<ChangeAuctionResponse> changeAuction(ChangeAuctionRequest request);

    /**
     * @param request the request parameters of CheckDomainStatus  CheckDomainStatusRequest
     * @return CheckDomainStatusResponse
     */
    CompletableFuture<CheckDomainStatusResponse> checkDomainStatus(CheckDomainStatusRequest request);

    /**
     * @param request the request parameters of CheckSelectedDomainStatus  CheckSelectedDomainStatusRequest
     * @return CheckSelectedDomainStatusResponse
     */
    CompletableFuture<CheckSelectedDomainStatusResponse> checkSelectedDomainStatus(CheckSelectedDomainStatusRequest request);

    /**
     * @param request the request parameters of CreateFixedPriceDemandOrder  CreateFixedPriceDemandOrderRequest
     * @return CreateFixedPriceDemandOrderResponse
     */
    CompletableFuture<CreateFixedPriceDemandOrderResponse> createFixedPriceDemandOrder(CreateFixedPriceDemandOrderRequest request);

    /**
     * @param request the request parameters of CreateFixedPriceSelectedOrder  CreateFixedPriceSelectedOrderRequest
     * @return CreateFixedPriceSelectedOrderResponse
     */
    CompletableFuture<CreateFixedPriceSelectedOrderResponse> createFixedPriceSelectedOrder(CreateFixedPriceSelectedOrderRequest request);

    /**
     * @param request the request parameters of FailDemand  FailDemandRequest
     * @return FailDemandResponse
     */
    CompletableFuture<FailDemandResponse> failDemand(FailDemandRequest request);

    /**
     * @param request the request parameters of FinishDemand  FinishDemandRequest
     * @return FinishDemandResponse
     */
    CompletableFuture<FinishDemandResponse> finishDemand(FinishDemandRequest request);

    /**
     * @param request the request parameters of GetIntlDomainDownloadUrl  GetIntlDomainDownloadUrlRequest
     * @return GetIntlDomainDownloadUrlResponse
     */
    CompletableFuture<GetIntlDomainDownloadUrlResponse> getIntlDomainDownloadUrl(GetIntlDomainDownloadUrlRequest request);

    /**
     * @param request the request parameters of GetReserveDomainUrl  GetReserveDomainUrlRequest
     * @return GetReserveDomainUrlResponse
     */
    CompletableFuture<GetReserveDomainUrlResponse> getReserveDomainUrl(GetReserveDomainUrlRequest request);

    /**
     * @param request the request parameters of PurchaseIntlDomain  PurchaseIntlDomainRequest
     * @return PurchaseIntlDomainResponse
     */
    CompletableFuture<PurchaseIntlDomainResponse> purchaseIntlDomain(PurchaseIntlDomainRequest request);

    /**
     * @param request the request parameters of QueryAuctionDetail  QueryAuctionDetailRequest
     * @return QueryAuctionDetailResponse
     */
    CompletableFuture<QueryAuctionDetailResponse> queryAuctionDetail(QueryAuctionDetailRequest request);

    /**
     * @param request the request parameters of QueryAuctions  QueryAuctionsRequest
     * @return QueryAuctionsResponse
     */
    CompletableFuture<QueryAuctionsResponse> queryAuctions(QueryAuctionsRequest request);

    /**
     * @param request the request parameters of QueryBidRecords  QueryBidRecordsRequest
     * @return QueryBidRecordsResponse
     */
    CompletableFuture<QueryBidRecordsResponse> queryBidRecords(QueryBidRecordsRequest request);

    /**
     * @param request the request parameters of QueryBookingDomainInfo  QueryBookingDomainInfoRequest
     * @return QueryBookingDomainInfoResponse
     */
    CompletableFuture<QueryBookingDomainInfoResponse> queryBookingDomainInfo(QueryBookingDomainInfoRequest request);

    /**
     * @param request the request parameters of QueryBrokerDemand  QueryBrokerDemandRequest
     * @return QueryBrokerDemandResponse
     */
    CompletableFuture<QueryBrokerDemandResponse> queryBrokerDemand(QueryBrokerDemandRequest request);

    /**
     * @param request the request parameters of QueryBrokerDemandRecord  QueryBrokerDemandRecordRequest
     * @return QueryBrokerDemandRecordResponse
     */
    CompletableFuture<QueryBrokerDemandRecordResponse> queryBrokerDemandRecord(QueryBrokerDemandRecordRequest request);

    /**
     * @param request the request parameters of QueryDomainTransferStatus  QueryDomainTransferStatusRequest
     * @return QueryDomainTransferStatusResponse
     */
    CompletableFuture<QueryDomainTransferStatusResponse> queryDomainTransferStatus(QueryDomainTransferStatusRequest request);

    /**
     * @param request the request parameters of QueryExchangeRate  QueryExchangeRateRequest
     * @return QueryExchangeRateResponse
     */
    CompletableFuture<QueryExchangeRateResponse> queryExchangeRate(QueryExchangeRateRequest request);

    /**
     * @param request the request parameters of QueryExportDomainExpireSnatchs  QueryExportDomainExpireSnatchsRequest
     * @return QueryExportDomainExpireSnatchsResponse
     */
    CompletableFuture<QueryExportDomainExpireSnatchsResponse> queryExportDomainExpireSnatchs(QueryExportDomainExpireSnatchsRequest request);

    /**
     * @param request the request parameters of QueryPurchasedDomains  QueryPurchasedDomainsRequest
     * @return QueryPurchasedDomainsResponse
     */
    CompletableFuture<QueryPurchasedDomainsResponse> queryPurchasedDomains(QueryPurchasedDomainsRequest request);

    /**
     * @param request the request parameters of RecordDemand  RecordDemandRequest
     * @return RecordDemandResponse
     */
    CompletableFuture<RecordDemandResponse> recordDemand(RecordDemandRequest request);

    /**
     * @param request the request parameters of RefuseDemand  RefuseDemandRequest
     * @return RefuseDemandResponse
     */
    CompletableFuture<RefuseDemandResponse> refuseDemand(RefuseDemandRequest request);

    /**
     * @param request the request parameters of RequestPayDemand  RequestPayDemandRequest
     * @return RequestPayDemandResponse
     */
    CompletableFuture<RequestPayDemandResponse> requestPayDemand(RequestPayDemandRequest request);

    /**
     * @param request the request parameters of ReserveDomain  ReserveDomainRequest
     * @return ReserveDomainResponse
     */
    CompletableFuture<ReserveDomainResponse> reserveDomain(ReserveDomainRequest request);

    /**
     * @param request the request parameters of ReserveIntlDomain  ReserveIntlDomainRequest
     * @return ReserveIntlDomainResponse
     */
    CompletableFuture<ReserveIntlDomainResponse> reserveIntlDomain(ReserveIntlDomainRequest request);

    /**
     * @param request the request parameters of SelectedDomainList  SelectedDomainListRequest
     * @return SelectedDomainListResponse
     */
    CompletableFuture<SelectedDomainListResponse> selectedDomainList(SelectedDomainListRequest request);

    /**
     * @param request the request parameters of SubmitPurchaseInfo  SubmitPurchaseInfoRequest
     * @return SubmitPurchaseInfoResponse
     */
    CompletableFuture<SubmitPurchaseInfoResponse> submitPurchaseInfo(SubmitPurchaseInfoRequest request);

    /**
     * @param request the request parameters of UpdatePartnerReservePrice  UpdatePartnerReservePriceRequest
     * @return UpdatePartnerReservePriceResponse
     */
    CompletableFuture<UpdatePartnerReservePriceResponse> updatePartnerReservePrice(UpdatePartnerReservePriceRequest request);

}
