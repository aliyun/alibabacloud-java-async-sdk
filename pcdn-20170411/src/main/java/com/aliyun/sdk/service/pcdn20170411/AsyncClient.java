// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.pcdn20170411.models.*;
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

    CompletableFuture<AddConsumerResponse> addConsumer(AddConsumerRequest request);

    CompletableFuture<AddDomainResponse> addDomain(AddDomainRequest request);

    CompletableFuture<AddPcdnControlRuleResponse> addPcdnControlRule(AddPcdnControlRuleRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeletePcdnControlRuleResponse> deletePcdnControlRule(DeletePcdnControlRuleRequest request);

    CompletableFuture<DisablePcdnControlRuleResponse> disablePcdnControlRule(DisablePcdnControlRuleRequest request);

    CompletableFuture<EditPcdnControlRuleResponse> editPcdnControlRule(EditPcdnControlRuleRequest request);

    CompletableFuture<EnablePcdnControlRuleResponse> enablePcdnControlRule(EnablePcdnControlRuleRequest request);

    CompletableFuture<GetAccessDataResponse> getAccessData(GetAccessDataRequest request);

    CompletableFuture<GetAllAppVersionsResponse> getAllAppVersions(GetAllAppVersionsRequest request);

    CompletableFuture<GetAllIspResponse> getAllIsp(GetAllIspRequest request);

    CompletableFuture<GetAllMarketsResponse> getAllMarkets(GetAllMarketsRequest request);

    CompletableFuture<GetAllPlatformTypesResponse> getAllPlatformTypes(GetAllPlatformTypesRequest request);

    CompletableFuture<GetAllRegionsResponse> getAllRegions(GetAllRegionsRequest request);

    CompletableFuture<GetBalanceBandwidthDataResponse> getBalanceBandwidthData(GetBalanceBandwidthDataRequest request);

    CompletableFuture<GetBalanceTrafficDataResponse> getBalanceTrafficData(GetBalanceTrafficDataRequest request);

    CompletableFuture<GetBandwidthDataResponse> getBandwidthData(GetBandwidthDataRequest request);

    CompletableFuture<GetClientsRatioResponse> getClientsRatio(GetClientsRatioRequest request);

    CompletableFuture<GetConsumerStatusResponse> getConsumerStatus(GetConsumerStatusRequest request);

    CompletableFuture<GetControlRulesResponse> getControlRules(GetControlRulesRequest request);

    CompletableFuture<GetCoverRateDataResponse> getCoverRateData(GetCoverRateDataRequest request);

    CompletableFuture<GetCurrentModeResponse> getCurrentMode(GetCurrentModeRequest request);

    CompletableFuture<GetDomainCountResponse> getDomainCount(GetDomainCountRequest request);

    CompletableFuture<GetDomainsResponse> getDomains(GetDomainsRequest request);

    CompletableFuture<GetExpenseSummaryResponse> getExpenseSummary(GetExpenseSummaryRequest request);

    CompletableFuture<GetFeeHistoryResponse> getFeeHistory(GetFeeHistoryRequest request);

    CompletableFuture<GetFirstFrameDelayDataResponse> getFirstFrameDelayData(GetFirstFrameDelayDataRequest request);

    CompletableFuture<GetFluencyDataResponse> getFluencyData(GetFluencyDataRequest request);

    CompletableFuture<GetLogsListResponse> getLogsList(GetLogsListRequest request);

    CompletableFuture<GetShareRateDataResponse> getShareRateData(GetShareRateDataRequest request);

    CompletableFuture<GetTokenListResponse> getTokenList(GetTokenListRequest request);

    CompletableFuture<GetTrafficByRegionResponse> getTrafficByRegion(GetTrafficByRegionRequest request);

    CompletableFuture<GetTrafficDataResponse> getTrafficData(GetTrafficDataRequest request);

    CompletableFuture<StartDomainResponse> startDomain(StartDomainRequest request);

    CompletableFuture<StopDomainResponse> stopDomain(StopDomainRequest request);

}
