// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.scdn20171115.models.*;
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

    CompletableFuture<AddScdnDomainResponse> addScdnDomain(AddScdnDomainRequest request);

    CompletableFuture<BatchDeleteScdnDomainConfigsResponse> batchDeleteScdnDomainConfigs(BatchDeleteScdnDomainConfigsRequest request);

    CompletableFuture<BatchSetScdnDomainConfigsResponse> batchSetScdnDomainConfigs(BatchSetScdnDomainConfigsRequest request);

    CompletableFuture<BatchStartScdnDomainResponse> batchStartScdnDomain(BatchStartScdnDomainRequest request);

    CompletableFuture<BatchStopScdnDomainResponse> batchStopScdnDomain(BatchStopScdnDomainRequest request);

    CompletableFuture<BatchUpdateScdnDomainResponse> batchUpdateScdnDomain(BatchUpdateScdnDomainRequest request);

    CompletableFuture<CheckScdnServiceResponse> checkScdnService(CheckScdnServiceRequest request);

    CompletableFuture<DeleteScdnDomainResponse> deleteScdnDomain(DeleteScdnDomainRequest request);

    CompletableFuture<DeleteScdnSpecificConfigResponse> deleteScdnSpecificConfig(DeleteScdnSpecificConfigRequest request);

    CompletableFuture<DescribeScdnCcInfoResponse> describeScdnCcInfo(DescribeScdnCcInfoRequest request);

    CompletableFuture<DescribeScdnCcQpsInfoResponse> describeScdnCcQpsInfo(DescribeScdnCcQpsInfoRequest request);

    CompletableFuture<DescribeScdnCcTopIpResponse> describeScdnCcTopIp(DescribeScdnCcTopIpRequest request);

    CompletableFuture<DescribeScdnCcTopUrlResponse> describeScdnCcTopUrl(DescribeScdnCcTopUrlRequest request);

    CompletableFuture<DescribeScdnCertificateDetailResponse> describeScdnCertificateDetail(DescribeScdnCertificateDetailRequest request);

    CompletableFuture<DescribeScdnCertificateListResponse> describeScdnCertificateList(DescribeScdnCertificateListRequest request);

    CompletableFuture<DescribeScdnDDoSInfoResponse> describeScdnDDoSInfo(DescribeScdnDDoSInfoRequest request);

    CompletableFuture<DescribeScdnDDoSTrafficInfoResponse> describeScdnDDoSTrafficInfo(DescribeScdnDDoSTrafficInfoRequest request);

    CompletableFuture<DescribeScdnDomainBpsDataResponse> describeScdnDomainBpsData(DescribeScdnDomainBpsDataRequest request);

    CompletableFuture<DescribeScdnDomainCertificateInfoResponse> describeScdnDomainCertificateInfo(DescribeScdnDomainCertificateInfoRequest request);

    CompletableFuture<DescribeScdnDomainCnameResponse> describeScdnDomainCname(DescribeScdnDomainCnameRequest request);

    CompletableFuture<DescribeScdnDomainConfigsResponse> describeScdnDomainConfigs(DescribeScdnDomainConfigsRequest request);

    CompletableFuture<DescribeScdnDomainDetailResponse> describeScdnDomainDetail(DescribeScdnDomainDetailRequest request);

    CompletableFuture<DescribeScdnDomainHitRateDataResponse> describeScdnDomainHitRateData(DescribeScdnDomainHitRateDataRequest request);

    CompletableFuture<DescribeScdnDomainHttpCodeDataResponse> describeScdnDomainHttpCodeData(DescribeScdnDomainHttpCodeDataRequest request);

    CompletableFuture<DescribeScdnDomainIspDataResponse> describeScdnDomainIspData(DescribeScdnDomainIspDataRequest request);

    CompletableFuture<DescribeScdnDomainLogResponse> describeScdnDomainLog(DescribeScdnDomainLogRequest request);

    CompletableFuture<DescribeScdnDomainOriginBpsDataResponse> describeScdnDomainOriginBpsData(DescribeScdnDomainOriginBpsDataRequest request);

    CompletableFuture<DescribeScdnDomainOriginTrafficDataResponse> describeScdnDomainOriginTrafficData(DescribeScdnDomainOriginTrafficDataRequest request);

    CompletableFuture<DescribeScdnDomainPvDataResponse> describeScdnDomainPvData(DescribeScdnDomainPvDataRequest request);

    CompletableFuture<DescribeScdnDomainQpsDataResponse> describeScdnDomainQpsData(DescribeScdnDomainQpsDataRequest request);

    CompletableFuture<DescribeScdnDomainRealTimeBpsDataResponse> describeScdnDomainRealTimeBpsData(DescribeScdnDomainRealTimeBpsDataRequest request);

    CompletableFuture<DescribeScdnDomainRealTimeByteHitRateDataResponse> describeScdnDomainRealTimeByteHitRateData(DescribeScdnDomainRealTimeByteHitRateDataRequest request);

    CompletableFuture<DescribeScdnDomainRealTimeHttpCodeDataResponse> describeScdnDomainRealTimeHttpCodeData(DescribeScdnDomainRealTimeHttpCodeDataRequest request);

    CompletableFuture<DescribeScdnDomainRealTimeQpsDataResponse> describeScdnDomainRealTimeQpsData(DescribeScdnDomainRealTimeQpsDataRequest request);

    CompletableFuture<DescribeScdnDomainRealTimeReqHitRateDataResponse> describeScdnDomainRealTimeReqHitRateData(DescribeScdnDomainRealTimeReqHitRateDataRequest request);

    CompletableFuture<DescribeScdnDomainRealTimeSrcBpsDataResponse> describeScdnDomainRealTimeSrcBpsData(DescribeScdnDomainRealTimeSrcBpsDataRequest request);

    CompletableFuture<DescribeScdnDomainRealTimeSrcTrafficDataResponse> describeScdnDomainRealTimeSrcTrafficData(DescribeScdnDomainRealTimeSrcTrafficDataRequest request);

    CompletableFuture<DescribeScdnDomainRealTimeTrafficDataResponse> describeScdnDomainRealTimeTrafficData(DescribeScdnDomainRealTimeTrafficDataRequest request);

    CompletableFuture<DescribeScdnDomainRegionDataResponse> describeScdnDomainRegionData(DescribeScdnDomainRegionDataRequest request);

    CompletableFuture<DescribeScdnDomainTopReferVisitResponse> describeScdnDomainTopReferVisit(DescribeScdnDomainTopReferVisitRequest request);

    CompletableFuture<DescribeScdnDomainTopUrlVisitResponse> describeScdnDomainTopUrlVisit(DescribeScdnDomainTopUrlVisitRequest request);

    CompletableFuture<DescribeScdnDomainTrafficDataResponse> describeScdnDomainTrafficData(DescribeScdnDomainTrafficDataRequest request);

    CompletableFuture<DescribeScdnDomainUvDataResponse> describeScdnDomainUvData(DescribeScdnDomainUvDataRequest request);

    CompletableFuture<DescribeScdnRefreshQuotaResponse> describeScdnRefreshQuota(DescribeScdnRefreshQuotaRequest request);

    CompletableFuture<DescribeScdnRefreshTasksResponse> describeScdnRefreshTasks(DescribeScdnRefreshTasksRequest request);

    CompletableFuture<DescribeScdnServiceResponse> describeScdnService(DescribeScdnServiceRequest request);

    CompletableFuture<DescribeScdnTopDomainsByFlowResponse> describeScdnTopDomainsByFlow(DescribeScdnTopDomainsByFlowRequest request);

    CompletableFuture<DescribeScdnUserDomainsResponse> describeScdnUserDomains(DescribeScdnUserDomainsRequest request);

    CompletableFuture<DescribeScdnUserProtectInfoResponse> describeScdnUserProtectInfo(DescribeScdnUserProtectInfoRequest request);

    CompletableFuture<DescribeScdnUserQuotaResponse> describeScdnUserQuota(DescribeScdnUserQuotaRequest request);

    CompletableFuture<OpenScdnServiceResponse> openScdnService(OpenScdnServiceRequest request);

    CompletableFuture<PreloadScdnObjectCachesResponse> preloadScdnObjectCaches(PreloadScdnObjectCachesRequest request);

    CompletableFuture<RefreshScdnObjectCachesResponse> refreshScdnObjectCaches(RefreshScdnObjectCachesRequest request);

    CompletableFuture<SetScdnBotInfoResponse> setScdnBotInfo(SetScdnBotInfoRequest request);

    CompletableFuture<SetScdnCcInfoResponse> setScdnCcInfo(SetScdnCcInfoRequest request);

    CompletableFuture<SetScdnDDoSInfoResponse> setScdnDDoSInfo(SetScdnDDoSInfoRequest request);

    CompletableFuture<SetScdnDomainBizInfoResponse> setScdnDomainBizInfo(SetScdnDomainBizInfoRequest request);

    CompletableFuture<SetScdnDomainCertificateResponse> setScdnDomainCertificate(SetScdnDomainCertificateRequest request);

    CompletableFuture<StartScdnDomainResponse> startScdnDomain(StartScdnDomainRequest request);

    CompletableFuture<StopScdnDomainResponse> stopScdnDomain(StopScdnDomainRequest request);

    CompletableFuture<UpdateScdnDomainResponse> updateScdnDomain(UpdateScdnDomainRequest request);

}
