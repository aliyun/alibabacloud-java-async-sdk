// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cdn20180510.models.*;
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

    CompletableFuture<AddCdnDomainResponse> addCdnDomain(AddCdnDomainRequest request);

    CompletableFuture<AddFCTriggerResponse> addFCTrigger(AddFCTriggerRequest request);

    CompletableFuture<BatchAddCdnDomainResponse> batchAddCdnDomain(BatchAddCdnDomainRequest request);

    CompletableFuture<BatchDeleteCdnDomainConfigResponse> batchDeleteCdnDomainConfig(BatchDeleteCdnDomainConfigRequest request);

    CompletableFuture<BatchSetCdnDomainConfigResponse> batchSetCdnDomainConfig(BatchSetCdnDomainConfigRequest request);

    CompletableFuture<BatchSetCdnDomainServerCertificateResponse> batchSetCdnDomainServerCertificate(BatchSetCdnDomainServerCertificateRequest request);

    CompletableFuture<BatchStartCdnDomainResponse> batchStartCdnDomain(BatchStartCdnDomainRequest request);

    CompletableFuture<BatchStopCdnDomainResponse> batchStopCdnDomain(BatchStopCdnDomainRequest request);

    CompletableFuture<BatchUpdateCdnDomainResponse> batchUpdateCdnDomain(BatchUpdateCdnDomainRequest request);

    CompletableFuture<CreateCdnCertificateSigningRequestResponse> createCdnCertificateSigningRequest(CreateCdnCertificateSigningRequestRequest request);

    CompletableFuture<CreateCdnComputeDomainResponse> createCdnComputeDomain(CreateCdnComputeDomainRequest request);

    CompletableFuture<CreateCdnDeliverTaskResponse> createCdnDeliverTask(CreateCdnDeliverTaskRequest request);

    CompletableFuture<CreateCdnSubTaskResponse> createCdnSubTask(CreateCdnSubTaskRequest request);

    CompletableFuture<CreateIllegalUrlExportTaskResponse> createIllegalUrlExportTask(CreateIllegalUrlExportTaskRequest request);

    CompletableFuture<CreateRealTimeLogDeliveryResponse> createRealTimeLogDelivery(CreateRealTimeLogDeliveryRequest request);

    CompletableFuture<CreateUsageDetailDataExportTaskResponse> createUsageDetailDataExportTask(CreateUsageDetailDataExportTaskRequest request);

    CompletableFuture<CreateUserUsageDataExportTaskResponse> createUserUsageDataExportTask(CreateUserUsageDataExportTaskRequest request);

    CompletableFuture<DeleteCdnDeliverTaskResponse> deleteCdnDeliverTask(DeleteCdnDeliverTaskRequest request);

    CompletableFuture<DeleteCdnDomainResponse> deleteCdnDomain(DeleteCdnDomainRequest request);

    CompletableFuture<DeleteCdnSubTaskResponse> deleteCdnSubTask(DeleteCdnSubTaskRequest request);

    CompletableFuture<DeleteFCTriggerResponse> deleteFCTrigger(DeleteFCTriggerRequest request);

    CompletableFuture<DeleteRealtimeLogDeliveryResponse> deleteRealtimeLogDelivery(DeleteRealtimeLogDeliveryRequest request);

    CompletableFuture<DeleteSpecificConfigResponse> deleteSpecificConfig(DeleteSpecificConfigRequest request);

    CompletableFuture<DeleteSpecificStagingConfigResponse> deleteSpecificStagingConfig(DeleteSpecificStagingConfigRequest request);

    CompletableFuture<DeleteUsageDetailDataExportTaskResponse> deleteUsageDetailDataExportTask(DeleteUsageDetailDataExportTaskRequest request);

    CompletableFuture<DeleteUserUsageDataExportTaskResponse> deleteUserUsageDataExportTask(DeleteUserUsageDataExportTaskRequest request);

    CompletableFuture<DescribeActiveVersionOfConfigGroupResponse> describeActiveVersionOfConfigGroup(DescribeActiveVersionOfConfigGroupRequest request);

    CompletableFuture<DescribeBlockedRegionsResponse> describeBlockedRegions(DescribeBlockedRegionsRequest request);

    CompletableFuture<DescribeCdnCertificateDetailResponse> describeCdnCertificateDetail(DescribeCdnCertificateDetailRequest request);

    CompletableFuture<DescribeCdnCertificateListResponse> describeCdnCertificateList(DescribeCdnCertificateListRequest request);

    CompletableFuture<DescribeCdnComputeUserDomainResponse> describeCdnComputeUserDomain(DescribeCdnComputeUserDomainRequest request);

    CompletableFuture<DescribeCdnDeletedDomainsResponse> describeCdnDeletedDomains(DescribeCdnDeletedDomainsRequest request);

    CompletableFuture<DescribeCdnDeliverListResponse> describeCdnDeliverList(DescribeCdnDeliverListRequest request);

    CompletableFuture<DescribeCdnDomainByCertificateResponse> describeCdnDomainByCertificate(DescribeCdnDomainByCertificateRequest request);

    CompletableFuture<DescribeCdnDomainConfigsResponse> describeCdnDomainConfigs(DescribeCdnDomainConfigsRequest request);

    CompletableFuture<DescribeCdnDomainDetailResponse> describeCdnDomainDetail(DescribeCdnDomainDetailRequest request);

    CompletableFuture<DescribeCdnDomainLogsResponse> describeCdnDomainLogs(DescribeCdnDomainLogsRequest request);

    CompletableFuture<DescribeCdnDomainStagingConfigResponse> describeCdnDomainStagingConfig(DescribeCdnDomainStagingConfigRequest request);

    CompletableFuture<DescribeCdnHttpsDomainListResponse> describeCdnHttpsDomainList(DescribeCdnHttpsDomainListRequest request);

    CompletableFuture<DescribeCdnRegionAndIspResponse> describeCdnRegionAndIsp(DescribeCdnRegionAndIspRequest request);

    CompletableFuture<DescribeCdnReportResponse> describeCdnReport(DescribeCdnReportRequest request);

    CompletableFuture<DescribeCdnReportListResponse> describeCdnReportList(DescribeCdnReportListRequest request);

    CompletableFuture<DescribeCdnSMCertificateDetailResponse> describeCdnSMCertificateDetail(DescribeCdnSMCertificateDetailRequest request);

    CompletableFuture<DescribeCdnSMCertificateListResponse> describeCdnSMCertificateList(DescribeCdnSMCertificateListRequest request);

    CompletableFuture<DescribeCdnServiceResponse> describeCdnService(DescribeCdnServiceRequest request);

    CompletableFuture<DescribeCdnSubListResponse> describeCdnSubList(DescribeCdnSubListRequest request);

    CompletableFuture<DescribeCdnUserBillHistoryResponse> describeCdnUserBillHistory(DescribeCdnUserBillHistoryRequest request);

    CompletableFuture<DescribeCdnUserBillPredictionResponse> describeCdnUserBillPrediction(DescribeCdnUserBillPredictionRequest request);

    CompletableFuture<DescribeCdnUserBillTypeResponse> describeCdnUserBillType(DescribeCdnUserBillTypeRequest request);

    CompletableFuture<DescribeCdnUserConfigsResponse> describeCdnUserConfigs(DescribeCdnUserConfigsRequest request);

    CompletableFuture<DescribeCdnUserDomainsByFuncResponse> describeCdnUserDomainsByFunc(DescribeCdnUserDomainsByFuncRequest request);

    CompletableFuture<DescribeCdnUserQuotaResponse> describeCdnUserQuota(DescribeCdnUserQuotaRequest request);

    CompletableFuture<DescribeCdnUserResourcePackageResponse> describeCdnUserResourcePackage(DescribeCdnUserResourcePackageRequest request);

    CompletableFuture<DescribeCdnWafDomainResponse> describeCdnWafDomain(DescribeCdnWafDomainRequest request);

    CompletableFuture<DescribeCertificateInfoByIDResponse> describeCertificateInfoByID(DescribeCertificateInfoByIDRequest request);

    CompletableFuture<DescribeConfigGroupDetailResponse> describeConfigGroupDetail(DescribeConfigGroupDetailRequest request);

    CompletableFuture<DescribeConfigOfVersionResponse> describeConfigOfVersion(DescribeConfigOfVersionRequest request);

    CompletableFuture<DescribeCustomLogConfigResponse> describeCustomLogConfig(DescribeCustomLogConfigRequest request);

    CompletableFuture<DescribeDomainAverageResponseTimeResponse> describeDomainAverageResponseTime(DescribeDomainAverageResponseTimeRequest request);

    CompletableFuture<DescribeDomainBpsDataResponse> describeDomainBpsData(DescribeDomainBpsDataRequest request);

    CompletableFuture<DescribeDomainBpsDataByLayerResponse> describeDomainBpsDataByLayer(DescribeDomainBpsDataByLayerRequest request);

    CompletableFuture<DescribeDomainBpsDataByTimeStampResponse> describeDomainBpsDataByTimeStamp(DescribeDomainBpsDataByTimeStampRequest request);

    CompletableFuture<DescribeDomainCcActivityLogResponse> describeDomainCcActivityLog(DescribeDomainCcActivityLogRequest request);

    CompletableFuture<DescribeDomainCertificateInfoResponse> describeDomainCertificateInfo(DescribeDomainCertificateInfoRequest request);

    CompletableFuture<DescribeDomainCustomLogConfigResponse> describeDomainCustomLogConfig(DescribeDomainCustomLogConfigRequest request);

    CompletableFuture<DescribeDomainDetailDataByLayerResponse> describeDomainDetailDataByLayer(DescribeDomainDetailDataByLayerRequest request);

    CompletableFuture<DescribeDomainFileSizeProportionDataResponse> describeDomainFileSizeProportionData(DescribeDomainFileSizeProportionDataRequest request);

    CompletableFuture<DescribeDomainHitRateDataResponse> describeDomainHitRateData(DescribeDomainHitRateDataRequest request);

    CompletableFuture<DescribeDomainHttpCodeDataResponse> describeDomainHttpCodeData(DescribeDomainHttpCodeDataRequest request);

    CompletableFuture<DescribeDomainHttpCodeDataByLayerResponse> describeDomainHttpCodeDataByLayer(DescribeDomainHttpCodeDataByLayerRequest request);

    CompletableFuture<DescribeDomainISPDataResponse> describeDomainISPData(DescribeDomainISPDataRequest request);

    CompletableFuture<DescribeDomainMax95BpsDataResponse> describeDomainMax95BpsData(DescribeDomainMax95BpsDataRequest request);

    CompletableFuture<DescribeDomainMultiUsageDataResponse> describeDomainMultiUsageData(DescribeDomainMultiUsageDataRequest request);

    CompletableFuture<DescribeDomainNamesOfVersionResponse> describeDomainNamesOfVersion(DescribeDomainNamesOfVersionRequest request);

    CompletableFuture<DescribeDomainPathDataResponse> describeDomainPathData(DescribeDomainPathDataRequest request);

    CompletableFuture<DescribeDomainPvDataResponse> describeDomainPvData(DescribeDomainPvDataRequest request);

    CompletableFuture<DescribeDomainQpsDataResponse> describeDomainQpsData(DescribeDomainQpsDataRequest request);

    CompletableFuture<DescribeDomainQpsDataByLayerResponse> describeDomainQpsDataByLayer(DescribeDomainQpsDataByLayerRequest request);

    CompletableFuture<DescribeDomainRealTimeBpsDataResponse> describeDomainRealTimeBpsData(DescribeDomainRealTimeBpsDataRequest request);

    CompletableFuture<DescribeDomainRealTimeByteHitRateDataResponse> describeDomainRealTimeByteHitRateData(DescribeDomainRealTimeByteHitRateDataRequest request);

    CompletableFuture<DescribeDomainRealTimeDetailDataResponse> describeDomainRealTimeDetailData(DescribeDomainRealTimeDetailDataRequest request);

    CompletableFuture<DescribeDomainRealTimeHttpCodeDataResponse> describeDomainRealTimeHttpCodeData(DescribeDomainRealTimeHttpCodeDataRequest request);

    CompletableFuture<DescribeDomainRealTimeQpsDataResponse> describeDomainRealTimeQpsData(DescribeDomainRealTimeQpsDataRequest request);

    CompletableFuture<DescribeDomainRealTimeReqHitRateDataResponse> describeDomainRealTimeReqHitRateData(DescribeDomainRealTimeReqHitRateDataRequest request);

    CompletableFuture<DescribeDomainRealTimeSrcBpsDataResponse> describeDomainRealTimeSrcBpsData(DescribeDomainRealTimeSrcBpsDataRequest request);

    CompletableFuture<DescribeDomainRealTimeSrcHttpCodeDataResponse> describeDomainRealTimeSrcHttpCodeData(DescribeDomainRealTimeSrcHttpCodeDataRequest request);

    CompletableFuture<DescribeDomainRealTimeSrcTrafficDataResponse> describeDomainRealTimeSrcTrafficData(DescribeDomainRealTimeSrcTrafficDataRequest request);

    CompletableFuture<DescribeDomainRealTimeTrafficDataResponse> describeDomainRealTimeTrafficData(DescribeDomainRealTimeTrafficDataRequest request);

    CompletableFuture<DescribeDomainRealtimeLogDeliveryResponse> describeDomainRealtimeLogDelivery(DescribeDomainRealtimeLogDeliveryRequest request);

    CompletableFuture<DescribeDomainRegionDataResponse> describeDomainRegionData(DescribeDomainRegionDataRequest request);

    CompletableFuture<DescribeDomainReqHitRateDataResponse> describeDomainReqHitRateData(DescribeDomainReqHitRateDataRequest request);

    CompletableFuture<DescribeDomainSrcBpsDataResponse> describeDomainSrcBpsData(DescribeDomainSrcBpsDataRequest request);

    CompletableFuture<DescribeDomainSrcHttpCodeDataResponse> describeDomainSrcHttpCodeData(DescribeDomainSrcHttpCodeDataRequest request);

    CompletableFuture<DescribeDomainSrcQpsDataResponse> describeDomainSrcQpsData(DescribeDomainSrcQpsDataRequest request);

    CompletableFuture<DescribeDomainSrcTopUrlVisitResponse> describeDomainSrcTopUrlVisit(DescribeDomainSrcTopUrlVisitRequest request);

    CompletableFuture<DescribeDomainSrcTrafficDataResponse> describeDomainSrcTrafficData(DescribeDomainSrcTrafficDataRequest request);

    CompletableFuture<DescribeDomainTopClientIpVisitResponse> describeDomainTopClientIpVisit(DescribeDomainTopClientIpVisitRequest request);

    CompletableFuture<DescribeDomainTopReferVisitResponse> describeDomainTopReferVisit(DescribeDomainTopReferVisitRequest request);

    CompletableFuture<DescribeDomainTopUrlVisitResponse> describeDomainTopUrlVisit(DescribeDomainTopUrlVisitRequest request);

    CompletableFuture<DescribeDomainTrafficDataResponse> describeDomainTrafficData(DescribeDomainTrafficDataRequest request);

    CompletableFuture<DescribeDomainUsageDataResponse> describeDomainUsageData(DescribeDomainUsageDataRequest request);

    CompletableFuture<DescribeDomainUvDataResponse> describeDomainUvData(DescribeDomainUvDataRequest request);

    CompletableFuture<DescribeDomainsBySourceResponse> describeDomainsBySource(DescribeDomainsBySourceRequest request);

    CompletableFuture<DescribeDomainsUsageByDayResponse> describeDomainsUsageByDay(DescribeDomainsUsageByDayRequest request);

    CompletableFuture<DescribeEsExceptionDataResponse> describeEsExceptionData(DescribeEsExceptionDataRequest request);

    CompletableFuture<DescribeEsExecuteDataResponse> describeEsExecuteData(DescribeEsExecuteDataRequest request);

    CompletableFuture<DescribeFCTriggerResponse> describeFCTrigger(DescribeFCTriggerRequest request);

    CompletableFuture<DescribeIllegalUrlExportTaskResponse> describeIllegalUrlExportTask(DescribeIllegalUrlExportTaskRequest request);

    CompletableFuture<DescribeIpInfoResponse> describeIpInfo(DescribeIpInfoRequest request);

    CompletableFuture<DescribeL2VipsByDomainResponse> describeL2VipsByDomain(DescribeL2VipsByDomainRequest request);

    CompletableFuture<DescribeRangeDataByLocateAndIspServiceResponse> describeRangeDataByLocateAndIspService(DescribeRangeDataByLocateAndIspServiceRequest request);

    CompletableFuture<DescribeRealtimeDeliveryAccResponse> describeRealtimeDeliveryAcc(DescribeRealtimeDeliveryAccRequest request);

    CompletableFuture<DescribeRefreshQuotaResponse> describeRefreshQuota(DescribeRefreshQuotaRequest request);

    CompletableFuture<DescribeRefreshTaskByIdResponse> describeRefreshTaskById(DescribeRefreshTaskByIdRequest request);

    CompletableFuture<DescribeRefreshTasksResponse> describeRefreshTasks(DescribeRefreshTasksRequest request);

    CompletableFuture<DescribeStagingIpResponse> describeStagingIp(DescribeStagingIpRequest request);

    CompletableFuture<DescribeTagResourcesResponse> describeTagResources(DescribeTagResourcesRequest request);

    CompletableFuture<DescribeTopDomainsByFlowResponse> describeTopDomainsByFlow(DescribeTopDomainsByFlowRequest request);

    CompletableFuture<DescribeUserCertificateExpireCountResponse> describeUserCertificateExpireCount(DescribeUserCertificateExpireCountRequest request);

    CompletableFuture<DescribeUserConfigsResponse> describeUserConfigs(DescribeUserConfigsRequest request);

    CompletableFuture<DescribeUserDomainsResponse> describeUserDomains(DescribeUserDomainsRequest request);

    CompletableFuture<DescribeUserTagsResponse> describeUserTags(DescribeUserTagsRequest request);

    CompletableFuture<DescribeUserUsageDataExportTaskResponse> describeUserUsageDataExportTask(DescribeUserUsageDataExportTaskRequest request);

    CompletableFuture<DescribeUserUsageDetailDataExportTaskResponse> describeUserUsageDetailDataExportTask(DescribeUserUsageDetailDataExportTaskRequest request);

    CompletableFuture<DescribeUserVipsByDomainResponse> describeUserVipsByDomain(DescribeUserVipsByDomainRequest request);

    CompletableFuture<DescribeVerifyContentResponse> describeVerifyContent(DescribeVerifyContentRequest request);

    CompletableFuture<DisableRealtimeLogDeliveryResponse> disableRealtimeLogDelivery(DisableRealtimeLogDeliveryRequest request);

    CompletableFuture<EnableRealtimeLogDeliveryResponse> enableRealtimeLogDelivery(EnableRealtimeLogDeliveryRequest request);

    CompletableFuture<ListDomainsByLogConfigIdResponse> listDomainsByLogConfigId(ListDomainsByLogConfigIdRequest request);

    CompletableFuture<ListFCTriggerResponse> listFCTrigger(ListFCTriggerRequest request);

    CompletableFuture<ListRealtimeLogDeliveryDomainsResponse> listRealtimeLogDeliveryDomains(ListRealtimeLogDeliveryDomainsRequest request);

    CompletableFuture<ListRealtimeLogDeliveryInfosResponse> listRealtimeLogDeliveryInfos(ListRealtimeLogDeliveryInfosRequest request);

    CompletableFuture<ListUserCustomLogConfigResponse> listUserCustomLogConfig(ListUserCustomLogConfigRequest request);

    CompletableFuture<ModifyCdnDomainResponse> modifyCdnDomain(ModifyCdnDomainRequest request);

    CompletableFuture<ModifyCdnDomainSchdmByPropertyResponse> modifyCdnDomainSchdmByProperty(ModifyCdnDomainSchdmByPropertyRequest request);

    CompletableFuture<ModifyDomainCustomLogConfigResponse> modifyDomainCustomLogConfig(ModifyDomainCustomLogConfigRequest request);

    CompletableFuture<ModifyRealtimeLogDeliveryResponse> modifyRealtimeLogDelivery(ModifyRealtimeLogDeliveryRequest request);

    CompletableFuture<ModifyUserCustomLogConfigResponse> modifyUserCustomLogConfig(ModifyUserCustomLogConfigRequest request);

    CompletableFuture<OpenCdnServiceResponse> openCdnService(OpenCdnServiceRequest request);

    CompletableFuture<PublishStagingConfigToProductionResponse> publishStagingConfigToProduction(PublishStagingConfigToProductionRequest request);

    CompletableFuture<PushObjectCacheResponse> pushObjectCache(PushObjectCacheRequest request);

    CompletableFuture<RefreshObjectCachesResponse> refreshObjectCaches(RefreshObjectCachesRequest request);

    CompletableFuture<RollbackStagingConfigResponse> rollbackStagingConfig(RollbackStagingConfigRequest request);

    CompletableFuture<SetCcConfigResponse> setCcConfig(SetCcConfigRequest request);

    CompletableFuture<SetCdnDomainCSRCertificateResponse> setCdnDomainCSRCertificate(SetCdnDomainCSRCertificateRequest request);

    CompletableFuture<SetCdnDomainSMCertificateResponse> setCdnDomainSMCertificate(SetCdnDomainSMCertificateRequest request);

    CompletableFuture<SetCdnDomainStagingConfigResponse> setCdnDomainStagingConfig(SetCdnDomainStagingConfigRequest request);

    CompletableFuture<SetConfigOfVersionResponse> setConfigOfVersion(SetConfigOfVersionRequest request);

    CompletableFuture<SetDomainGreenManagerConfigResponse> setDomainGreenManagerConfig(SetDomainGreenManagerConfigRequest request);

    CompletableFuture<SetDomainServerCertificateResponse> setDomainServerCertificate(SetDomainServerCertificateRequest request);

    CompletableFuture<SetErrorPageConfigResponse> setErrorPageConfig(SetErrorPageConfigRequest request);

    CompletableFuture<SetFileCacheExpiredConfigResponse> setFileCacheExpiredConfig(SetFileCacheExpiredConfigRequest request);

    CompletableFuture<SetForceRedirectConfigResponse> setForceRedirectConfig(SetForceRedirectConfigRequest request);

    CompletableFuture<SetForwardSchemeConfigResponse> setForwardSchemeConfig(SetForwardSchemeConfigRequest request);

    CompletableFuture<SetHttpErrorPageConfigResponse> setHttpErrorPageConfig(SetHttpErrorPageConfigRequest request);

    CompletableFuture<SetHttpHeaderConfigResponse> setHttpHeaderConfig(SetHttpHeaderConfigRequest request);

    CompletableFuture<SetHttpsOptionConfigResponse> setHttpsOptionConfig(SetHttpsOptionConfigRequest request);

    CompletableFuture<SetIgnoreQueryStringConfigResponse> setIgnoreQueryStringConfig(SetIgnoreQueryStringConfigRequest request);

    CompletableFuture<SetIpAllowListConfigResponse> setIpAllowListConfig(SetIpAllowListConfigRequest request);

    CompletableFuture<SetIpBlackListConfigResponse> setIpBlackListConfig(SetIpBlackListConfigRequest request);

    CompletableFuture<SetOptimizeConfigResponse> setOptimizeConfig(SetOptimizeConfigRequest request);

    CompletableFuture<SetPageCompressConfigResponse> setPageCompressConfig(SetPageCompressConfigRequest request);

    CompletableFuture<SetRangeConfigResponse> setRangeConfig(SetRangeConfigRequest request);

    CompletableFuture<SetRefererConfigResponse> setRefererConfig(SetRefererConfigRequest request);

    CompletableFuture<SetRemoveQueryStringConfigResponse> setRemoveQueryStringConfig(SetRemoveQueryStringConfigRequest request);

    CompletableFuture<SetReqAuthConfigResponse> setReqAuthConfig(SetReqAuthConfigRequest request);

    CompletableFuture<SetReqHeaderConfigResponse> setReqHeaderConfig(SetReqHeaderConfigRequest request);

    CompletableFuture<SetSourceHostConfigResponse> setSourceHostConfig(SetSourceHostConfigRequest request);

    CompletableFuture<SetUserGreenManagerConfigResponse> setUserGreenManagerConfig(SetUserGreenManagerConfigRequest request);

    CompletableFuture<SetWaitingRoomConfigResponse> setWaitingRoomConfig(SetWaitingRoomConfigRequest request);

    CompletableFuture<StartCdnDomainResponse> startCdnDomain(StartCdnDomainRequest request);

    CompletableFuture<StopCdnDomainResponse> stopCdnDomain(StopCdnDomainRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateCdnDeliverTaskResponse> updateCdnDeliverTask(UpdateCdnDeliverTaskRequest request);

    CompletableFuture<UpdateCdnSubTaskResponse> updateCdnSubTask(UpdateCdnSubTaskRequest request);

    CompletableFuture<UpdateFCTriggerResponse> updateFCTrigger(UpdateFCTriggerRequest request);

    CompletableFuture<VerifyDomainOwnerResponse> verifyDomainOwner(VerifyDomainOwnerRequest request);

}
