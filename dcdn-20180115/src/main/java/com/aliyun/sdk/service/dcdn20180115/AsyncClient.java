// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.dcdn20180115.models.*;
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

    CompletableFuture<AddDcdnDomainResponse> addDcdnDomain(AddDcdnDomainRequest request);

    CompletableFuture<AddDcdnIpaDomainResponse> addDcdnIpaDomain(AddDcdnIpaDomainRequest request);

    CompletableFuture<BatchAddDcdnDomainResponse> batchAddDcdnDomain(BatchAddDcdnDomainRequest request);

    CompletableFuture<BatchDeleteDcdnDomainConfigsResponse> batchDeleteDcdnDomainConfigs(BatchDeleteDcdnDomainConfigsRequest request);

    CompletableFuture<BatchSetDcdnDomainCertificateResponse> batchSetDcdnDomainCertificate(BatchSetDcdnDomainCertificateRequest request);

    CompletableFuture<BatchSetDcdnDomainConfigsResponse> batchSetDcdnDomainConfigs(BatchSetDcdnDomainConfigsRequest request);

    CompletableFuture<BatchSetDcdnIpaDomainConfigsResponse> batchSetDcdnIpaDomainConfigs(BatchSetDcdnIpaDomainConfigsRequest request);

    CompletableFuture<BatchStartDcdnDomainResponse> batchStartDcdnDomain(BatchStartDcdnDomainRequest request);

    CompletableFuture<BatchStopDcdnDomainResponse> batchStopDcdnDomain(BatchStopDcdnDomainRequest request);

    CompletableFuture<CheckDcdnProjectExistResponse> checkDcdnProjectExist(CheckDcdnProjectExistRequest request);

    CompletableFuture<CommitStagingRoutineCodeResponse> commitStagingRoutineCode(CommitStagingRoutineCodeRequest request);

    CompletableFuture<CreateDcdnCertificateSigningRequestResponse> createDcdnCertificateSigningRequest(CreateDcdnCertificateSigningRequestRequest request);

    CompletableFuture<CreateDcdnDeliverTaskResponse> createDcdnDeliverTask(CreateDcdnDeliverTaskRequest request);

    CompletableFuture<CreateDcdnSLSRealTimeLogDeliveryResponse> createDcdnSLSRealTimeLogDelivery(CreateDcdnSLSRealTimeLogDeliveryRequest request);

    CompletableFuture<CreateDcdnSubTaskResponse> createDcdnSubTask(CreateDcdnSubTaskRequest request);

    CompletableFuture<CreateRoutineResponse> createRoutine(CreateRoutineRequest request);

    CompletableFuture<CreateSlrAndSlsProjectResponse> createSlrAndSlsProject(CreateSlrAndSlsProjectRequest request);

    CompletableFuture<DeleteDcdnDeliverTaskResponse> deleteDcdnDeliverTask(DeleteDcdnDeliverTaskRequest request);

    CompletableFuture<DeleteDcdnDomainResponse> deleteDcdnDomain(DeleteDcdnDomainRequest request);

    CompletableFuture<DeleteDcdnIpaDomainResponse> deleteDcdnIpaDomain(DeleteDcdnIpaDomainRequest request);

    CompletableFuture<DeleteDcdnIpaSpecificConfigResponse> deleteDcdnIpaSpecificConfig(DeleteDcdnIpaSpecificConfigRequest request);

    CompletableFuture<DeleteDcdnRealTimeLogProjectResponse> deleteDcdnRealTimeLogProject(DeleteDcdnRealTimeLogProjectRequest request);

    CompletableFuture<DeleteDcdnSpecificConfigResponse> deleteDcdnSpecificConfig(DeleteDcdnSpecificConfigRequest request);

    CompletableFuture<DeleteDcdnSpecificStagingConfigResponse> deleteDcdnSpecificStagingConfig(DeleteDcdnSpecificStagingConfigRequest request);

    CompletableFuture<DeleteDcdnSubTaskResponse> deleteDcdnSubTask(DeleteDcdnSubTaskRequest request);

    CompletableFuture<DeleteRoutineResponse> deleteRoutine(DeleteRoutineRequest request);

    CompletableFuture<DeleteRoutineCodeRevisionResponse> deleteRoutineCodeRevision(DeleteRoutineCodeRevisionRequest request);

    CompletableFuture<DeleteRoutineConfEnvsResponse> deleteRoutineConfEnvs(DeleteRoutineConfEnvsRequest request);

    CompletableFuture<DescribeDcdnAclFieldsResponse> describeDcdnAclFields(DescribeDcdnAclFieldsRequest request);

    CompletableFuture<DescribeDcdnBgpBpsDataResponse> describeDcdnBgpBpsData(DescribeDcdnBgpBpsDataRequest request);

    CompletableFuture<DescribeDcdnBgpTrafficDataResponse> describeDcdnBgpTrafficData(DescribeDcdnBgpTrafficDataRequest request);

    CompletableFuture<DescribeDcdnBlockedRegionsResponse> describeDcdnBlockedRegions(DescribeDcdnBlockedRegionsRequest request);

    CompletableFuture<DescribeDcdnCertificateDetailResponse> describeDcdnCertificateDetail(DescribeDcdnCertificateDetailRequest request);

    CompletableFuture<DescribeDcdnCertificateListResponse> describeDcdnCertificateList(DescribeDcdnCertificateListRequest request);

    CompletableFuture<DescribeDcdnConfigGroupDetailResponse> describeDcdnConfigGroupDetail(DescribeDcdnConfigGroupDetailRequest request);

    CompletableFuture<DescribeDcdnConfigOfVersionResponse> describeDcdnConfigOfVersion(DescribeDcdnConfigOfVersionRequest request);

    CompletableFuture<DescribeDcdnDeletedDomainsResponse> describeDcdnDeletedDomains(DescribeDcdnDeletedDomainsRequest request);

    CompletableFuture<DescribeDcdnDeliverListResponse> describeDcdnDeliverList(DescribeDcdnDeliverListRequest request);

    CompletableFuture<DescribeDcdnDomainBpsDataResponse> describeDcdnDomainBpsData(DescribeDcdnDomainBpsDataRequest request);

    CompletableFuture<DescribeDcdnDomainBpsDataByLayerResponse> describeDcdnDomainBpsDataByLayer(DescribeDcdnDomainBpsDataByLayerRequest request);

    CompletableFuture<DescribeDcdnDomainByCertificateResponse> describeDcdnDomainByCertificate(DescribeDcdnDomainByCertificateRequest request);

    CompletableFuture<DescribeDcdnDomainCcActivityLogResponse> describeDcdnDomainCcActivityLog(DescribeDcdnDomainCcActivityLogRequest request);

    CompletableFuture<DescribeDcdnDomainCertificateInfoResponse> describeDcdnDomainCertificateInfo(DescribeDcdnDomainCertificateInfoRequest request);

    CompletableFuture<DescribeDcdnDomainCnameResponse> describeDcdnDomainCname(DescribeDcdnDomainCnameRequest request);

    CompletableFuture<DescribeDcdnDomainConfigsResponse> describeDcdnDomainConfigs(DescribeDcdnDomainConfigsRequest request);

    CompletableFuture<DescribeDcdnDomainDetailResponse> describeDcdnDomainDetail(DescribeDcdnDomainDetailRequest request);

    CompletableFuture<DescribeDcdnDomainHitRateDataResponse> describeDcdnDomainHitRateData(DescribeDcdnDomainHitRateDataRequest request);

    CompletableFuture<DescribeDcdnDomainHttpCodeDataResponse> describeDcdnDomainHttpCodeData(DescribeDcdnDomainHttpCodeDataRequest request);

    CompletableFuture<DescribeDcdnDomainHttpCodeDataByLayerResponse> describeDcdnDomainHttpCodeDataByLayer(DescribeDcdnDomainHttpCodeDataByLayerRequest request);

    CompletableFuture<DescribeDcdnDomainIpaBpsDataResponse> describeDcdnDomainIpaBpsData(DescribeDcdnDomainIpaBpsDataRequest request);

    CompletableFuture<DescribeDcdnDomainIpaTrafficDataResponse> describeDcdnDomainIpaTrafficData(DescribeDcdnDomainIpaTrafficDataRequest request);

    CompletableFuture<DescribeDcdnDomainIspDataResponse> describeDcdnDomainIspData(DescribeDcdnDomainIspDataRequest request);

    CompletableFuture<DescribeDcdnDomainLogResponse> describeDcdnDomainLog(DescribeDcdnDomainLogRequest request);

    CompletableFuture<DescribeDcdnDomainMultiUsageDataResponse> describeDcdnDomainMultiUsageData(DescribeDcdnDomainMultiUsageDataRequest request);

    CompletableFuture<DescribeDcdnDomainOriginBpsDataResponse> describeDcdnDomainOriginBpsData(DescribeDcdnDomainOriginBpsDataRequest request);

    CompletableFuture<DescribeDcdnDomainOriginTrafficDataResponse> describeDcdnDomainOriginTrafficData(DescribeDcdnDomainOriginTrafficDataRequest request);

    CompletableFuture<DescribeDcdnDomainPropertyResponse> describeDcdnDomainProperty(DescribeDcdnDomainPropertyRequest request);

    CompletableFuture<DescribeDcdnDomainPvDataResponse> describeDcdnDomainPvData(DescribeDcdnDomainPvDataRequest request);

    CompletableFuture<DescribeDcdnDomainQpsDataResponse> describeDcdnDomainQpsData(DescribeDcdnDomainQpsDataRequest request);

    CompletableFuture<DescribeDcdnDomainQpsDataByLayerResponse> describeDcdnDomainQpsDataByLayer(DescribeDcdnDomainQpsDataByLayerRequest request);

    CompletableFuture<DescribeDcdnDomainRealTimeBpsDataResponse> describeDcdnDomainRealTimeBpsData(DescribeDcdnDomainRealTimeBpsDataRequest request);

    CompletableFuture<DescribeDcdnDomainRealTimeByteHitRateDataResponse> describeDcdnDomainRealTimeByteHitRateData(DescribeDcdnDomainRealTimeByteHitRateDataRequest request);

    CompletableFuture<DescribeDcdnDomainRealTimeDetailDataResponse> describeDcdnDomainRealTimeDetailData(DescribeDcdnDomainRealTimeDetailDataRequest request);

    CompletableFuture<DescribeDcdnDomainRealTimeHttpCodeDataResponse> describeDcdnDomainRealTimeHttpCodeData(DescribeDcdnDomainRealTimeHttpCodeDataRequest request);

    CompletableFuture<DescribeDcdnDomainRealTimeQpsDataResponse> describeDcdnDomainRealTimeQpsData(DescribeDcdnDomainRealTimeQpsDataRequest request);

    CompletableFuture<DescribeDcdnDomainRealTimeReqHitRateDataResponse> describeDcdnDomainRealTimeReqHitRateData(DescribeDcdnDomainRealTimeReqHitRateDataRequest request);

    CompletableFuture<DescribeDcdnDomainRealTimeSrcBpsDataResponse> describeDcdnDomainRealTimeSrcBpsData(DescribeDcdnDomainRealTimeSrcBpsDataRequest request);

    CompletableFuture<DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse> describeDcdnDomainRealTimeSrcHttpCodeData(DescribeDcdnDomainRealTimeSrcHttpCodeDataRequest request);

    CompletableFuture<DescribeDcdnDomainRealTimeSrcTrafficDataResponse> describeDcdnDomainRealTimeSrcTrafficData(DescribeDcdnDomainRealTimeSrcTrafficDataRequest request);

    CompletableFuture<DescribeDcdnDomainRealTimeTrafficDataResponse> describeDcdnDomainRealTimeTrafficData(DescribeDcdnDomainRealTimeTrafficDataRequest request);

    CompletableFuture<DescribeDcdnDomainRegionDataResponse> describeDcdnDomainRegionData(DescribeDcdnDomainRegionDataRequest request);

    CompletableFuture<DescribeDcdnDomainStagingConfigResponse> describeDcdnDomainStagingConfig(DescribeDcdnDomainStagingConfigRequest request);

    CompletableFuture<DescribeDcdnDomainTopReferVisitResponse> describeDcdnDomainTopReferVisit(DescribeDcdnDomainTopReferVisitRequest request);

    CompletableFuture<DescribeDcdnDomainTopUrlVisitResponse> describeDcdnDomainTopUrlVisit(DescribeDcdnDomainTopUrlVisitRequest request);

    CompletableFuture<DescribeDcdnDomainTrafficDataResponse> describeDcdnDomainTrafficData(DescribeDcdnDomainTrafficDataRequest request);

    CompletableFuture<DescribeDcdnDomainUsageDataResponse> describeDcdnDomainUsageData(DescribeDcdnDomainUsageDataRequest request);

    CompletableFuture<DescribeDcdnDomainUvDataResponse> describeDcdnDomainUvData(DescribeDcdnDomainUvDataRequest request);

    CompletableFuture<DescribeDcdnDomainWebsocketBpsDataResponse> describeDcdnDomainWebsocketBpsData(DescribeDcdnDomainWebsocketBpsDataRequest request);

    CompletableFuture<DescribeDcdnDomainWebsocketHttpCodeDataResponse> describeDcdnDomainWebsocketHttpCodeData(DescribeDcdnDomainWebsocketHttpCodeDataRequest request);

    CompletableFuture<DescribeDcdnDomainWebsocketTrafficDataResponse> describeDcdnDomainWebsocketTrafficData(DescribeDcdnDomainWebsocketTrafficDataRequest request);

    CompletableFuture<DescribeDcdnEsExceptionDataResponse> describeDcdnEsExceptionData(DescribeDcdnEsExceptionDataRequest request);

    CompletableFuture<DescribeDcdnEsExecuteDataResponse> describeDcdnEsExecuteData(DescribeDcdnEsExecuteDataRequest request);

    CompletableFuture<DescribeDcdnHttpsDomainListResponse> describeDcdnHttpsDomainList(DescribeDcdnHttpsDomainListRequest request);

    CompletableFuture<DescribeDcdnIpInfoResponse> describeDcdnIpInfo(DescribeDcdnIpInfoRequest request);

    CompletableFuture<DescribeDcdnIpaDomainConfigsResponse> describeDcdnIpaDomainConfigs(DescribeDcdnIpaDomainConfigsRequest request);

    CompletableFuture<DescribeDcdnIpaDomainDetailResponse> describeDcdnIpaDomainDetail(DescribeDcdnIpaDomainDetailRequest request);

    CompletableFuture<DescribeDcdnIpaServiceResponse> describeDcdnIpaService(DescribeDcdnIpaServiceRequest request);

    CompletableFuture<DescribeDcdnIpaUserDomainsResponse> describeDcdnIpaUserDomains(DescribeDcdnIpaUserDomainsRequest request);

    CompletableFuture<DescribeDcdnRealTimeDeliveryFieldResponse> describeDcdnRealTimeDeliveryField(DescribeDcdnRealTimeDeliveryFieldRequest request);

    CompletableFuture<DescribeDcdnRefreshQuotaResponse> describeDcdnRefreshQuota(DescribeDcdnRefreshQuotaRequest request);

    CompletableFuture<DescribeDcdnRefreshTaskByIdResponse> describeDcdnRefreshTaskById(DescribeDcdnRefreshTaskByIdRequest request);

    CompletableFuture<DescribeDcdnRefreshTasksResponse> describeDcdnRefreshTasks(DescribeDcdnRefreshTasksRequest request);

    CompletableFuture<DescribeDcdnRegionAndIspResponse> describeDcdnRegionAndIsp(DescribeDcdnRegionAndIspRequest request);

    CompletableFuture<DescribeDcdnReportResponse> describeDcdnReport(DescribeDcdnReportRequest request);

    CompletableFuture<DescribeDcdnReportListResponse> describeDcdnReportList(DescribeDcdnReportListRequest request);

    CompletableFuture<DescribeDcdnSLSRealtimeLogDeliveryResponse> describeDcdnSLSRealtimeLogDelivery(DescribeDcdnSLSRealtimeLogDeliveryRequest request);

    CompletableFuture<DescribeDcdnSMCertificateDetailResponse> describeDcdnSMCertificateDetail(DescribeDcdnSMCertificateDetailRequest request);

    CompletableFuture<DescribeDcdnSMCertificateListResponse> describeDcdnSMCertificateList(DescribeDcdnSMCertificateListRequest request);

    CompletableFuture<DescribeDcdnSecFuncInfoResponse> describeDcdnSecFuncInfo(DescribeDcdnSecFuncInfoRequest request);

    CompletableFuture<DescribeDcdnSecSpecInfoResponse> describeDcdnSecSpecInfo(DescribeDcdnSecSpecInfoRequest request);

    CompletableFuture<DescribeDcdnServiceResponse> describeDcdnService(DescribeDcdnServiceRequest request);

    CompletableFuture<DescribeDcdnStagingIpResponse> describeDcdnStagingIp(DescribeDcdnStagingIpRequest request);

    CompletableFuture<DescribeDcdnSubListResponse> describeDcdnSubList(DescribeDcdnSubListRequest request);

    CompletableFuture<DescribeDcdnTagResourcesResponse> describeDcdnTagResources(DescribeDcdnTagResourcesRequest request);

    CompletableFuture<DescribeDcdnTopDomainsByFlowResponse> describeDcdnTopDomainsByFlow(DescribeDcdnTopDomainsByFlowRequest request);

    CompletableFuture<DescribeDcdnUserBillHistoryResponse> describeDcdnUserBillHistory(DescribeDcdnUserBillHistoryRequest request);

    CompletableFuture<DescribeDcdnUserBillTypeResponse> describeDcdnUserBillType(DescribeDcdnUserBillTypeRequest request);

    CompletableFuture<DescribeDcdnUserCertificateExpireCountResponse> describeDcdnUserCertificateExpireCount(DescribeDcdnUserCertificateExpireCountRequest request);

    CompletableFuture<DescribeDcdnUserConfigsResponse> describeDcdnUserConfigs(DescribeDcdnUserConfigsRequest request);

    CompletableFuture<DescribeDcdnUserDomainsResponse> describeDcdnUserDomains(DescribeDcdnUserDomainsRequest request);

    CompletableFuture<DescribeDcdnUserDomainsByFuncResponse> describeDcdnUserDomainsByFunc(DescribeDcdnUserDomainsByFuncRequest request);

    CompletableFuture<DescribeDcdnUserQuotaResponse> describeDcdnUserQuota(DescribeDcdnUserQuotaRequest request);

    CompletableFuture<DescribeDcdnUserRealTimeDeliveryFieldResponse> describeDcdnUserRealTimeDeliveryField(DescribeDcdnUserRealTimeDeliveryFieldRequest request);

    CompletableFuture<DescribeDcdnUserResourcePackageResponse> describeDcdnUserResourcePackage(DescribeDcdnUserResourcePackageRequest request);

    CompletableFuture<DescribeDcdnUserSecDropResponse> describeDcdnUserSecDrop(DescribeDcdnUserSecDropRequest request);

    CompletableFuture<DescribeDcdnUserSecDropByMinuteResponse> describeDcdnUserSecDropByMinute(DescribeDcdnUserSecDropByMinuteRequest request);

    CompletableFuture<DescribeDcdnUserTagsResponse> describeDcdnUserTags(DescribeDcdnUserTagsRequest request);

    CompletableFuture<DescribeDcdnVerifyContentResponse> describeDcdnVerifyContent(DescribeDcdnVerifyContentRequest request);

    CompletableFuture<DescribeDcdnWafDomainResponse> describeDcdnWafDomain(DescribeDcdnWafDomainRequest request);

    CompletableFuture<DescribeDcdnsecServiceResponse> describeDcdnsecService(DescribeDcdnsecServiceRequest request);

    CompletableFuture<DescribeRoutineResponse> describeRoutine(DescribeRoutineRequest request);

    CompletableFuture<DescribeRoutineCanaryEnvsResponse> describeRoutineCanaryEnvs(DescribeRoutineCanaryEnvsRequest request);

    CompletableFuture<DescribeRoutineCodeRevisionResponse> describeRoutineCodeRevision(DescribeRoutineCodeRevisionRequest request);

    CompletableFuture<DescribeRoutineSpecResponse> describeRoutineSpec(DescribeRoutineSpecRequest request);

    CompletableFuture<DescribeRoutineUserInfoResponse> describeRoutineUserInfo(DescribeRoutineUserInfoRequest request);

    CompletableFuture<DescribeUserDcdnIpaStatusResponse> describeUserDcdnIpaStatus(DescribeUserDcdnIpaStatusRequest request);

    CompletableFuture<DescribeUserDcdnStatusResponse> describeUserDcdnStatus(DescribeUserDcdnStatusRequest request);

    CompletableFuture<DescribeUserErStatusResponse> describeUserErStatus(DescribeUserErStatusRequest request);

    CompletableFuture<DescribeUserLogserviceStatusResponse> describeUserLogserviceStatus(DescribeUserLogserviceStatusRequest request);

    CompletableFuture<EditRoutineConfResponse> editRoutineConf(EditRoutineConfRequest request);

    CompletableFuture<ListDcdnRealTimeDeliveryProjectResponse> listDcdnRealTimeDeliveryProject(ListDcdnRealTimeDeliveryProjectRequest request);

    CompletableFuture<ModifyDCdnDomainSchdmByPropertyResponse> modifyDCdnDomainSchdmByProperty(ModifyDCdnDomainSchdmByPropertyRequest request);

    CompletableFuture<OpenDcdnServiceResponse> openDcdnService(OpenDcdnServiceRequest request);

    CompletableFuture<PreloadDcdnObjectCachesResponse> preloadDcdnObjectCaches(PreloadDcdnObjectCachesRequest request);

    CompletableFuture<PublishDcdnStagingConfigToProductionResponse> publishDcdnStagingConfigToProduction(PublishDcdnStagingConfigToProductionRequest request);

    CompletableFuture<PublishRoutineCodeRevisionResponse> publishRoutineCodeRevision(PublishRoutineCodeRevisionRequest request);

    CompletableFuture<RefreshDcdnObjectCachesResponse> refreshDcdnObjectCaches(RefreshDcdnObjectCachesRequest request);

    CompletableFuture<RollbackDcdnStagingConfigResponse> rollbackDcdnStagingConfig(RollbackDcdnStagingConfigRequest request);

    CompletableFuture<SetDcdnConfigOfVersionResponse> setDcdnConfigOfVersion(SetDcdnConfigOfVersionRequest request);

    CompletableFuture<SetDcdnDomainCSRCertificateResponse> setDcdnDomainCSRCertificate(SetDcdnDomainCSRCertificateRequest request);

    CompletableFuture<SetDcdnDomainCertificateResponse> setDcdnDomainCertificate(SetDcdnDomainCertificateRequest request);

    CompletableFuture<SetDcdnDomainSMCertificateResponse> setDcdnDomainSMCertificate(SetDcdnDomainSMCertificateRequest request);

    CompletableFuture<SetDcdnDomainStagingConfigResponse> setDcdnDomainStagingConfig(SetDcdnDomainStagingConfigRequest request);

    CompletableFuture<SetDcdnFullDomainsBlockIPResponse> setDcdnFullDomainsBlockIP(SetDcdnFullDomainsBlockIPRequest request);

    CompletableFuture<SetDcdnUserConfigResponse> setDcdnUserConfig(SetDcdnUserConfigRequest request);

    CompletableFuture<SetRoutineSubdomainResponse> setRoutineSubdomain(SetRoutineSubdomainRequest request);

    CompletableFuture<StartDcdnDomainResponse> startDcdnDomain(StartDcdnDomainRequest request);

    CompletableFuture<StartDcdnIpaDomainResponse> startDcdnIpaDomain(StartDcdnIpaDomainRequest request);

    CompletableFuture<StopDcdnDomainResponse> stopDcdnDomain(StopDcdnDomainRequest request);

    CompletableFuture<StopDcdnIpaDomainResponse> stopDcdnIpaDomain(StopDcdnIpaDomainRequest request);

    CompletableFuture<TagDcdnResourcesResponse> tagDcdnResources(TagDcdnResourcesRequest request);

    CompletableFuture<UntagDcdnResourcesResponse> untagDcdnResources(UntagDcdnResourcesRequest request);

    CompletableFuture<UpdateDcdnDeliverTaskResponse> updateDcdnDeliverTask(UpdateDcdnDeliverTaskRequest request);

    CompletableFuture<UpdateDcdnDomainResponse> updateDcdnDomain(UpdateDcdnDomainRequest request);

    CompletableFuture<UpdateDcdnIpaDomainResponse> updateDcdnIpaDomain(UpdateDcdnIpaDomainRequest request);

    CompletableFuture<UpdateDcdnSLSRealtimeLogDeliveryResponse> updateDcdnSLSRealtimeLogDelivery(UpdateDcdnSLSRealtimeLogDeliveryRequest request);

    CompletableFuture<UpdateDcdnSubTaskResponse> updateDcdnSubTask(UpdateDcdnSubTaskRequest request);

    CompletableFuture<UpdateDcdnUserRealTimeDeliveryFieldResponse> updateDcdnUserRealTimeDeliveryField(UpdateDcdnUserRealTimeDeliveryFieldRequest request);

    CompletableFuture<UploadRoutineCodeResponse> uploadRoutineCode(UploadRoutineCodeRequest request);

    CompletableFuture<UploadStagingRoutineCodeResponse> uploadStagingRoutineCode(UploadStagingRoutineCodeRequest request);

    CompletableFuture<VerifyDcdnDomainOwnerResponse> verifyDcdnDomainOwner(VerifyDcdnDomainOwnerRequest request);

}
