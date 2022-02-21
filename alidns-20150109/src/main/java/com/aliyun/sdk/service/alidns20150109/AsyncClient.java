// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alidns20150109.models.*;
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

    CompletableFuture<AddCustomLineResponse> addCustomLine(AddCustomLineRequest request);

    CompletableFuture<AddDnsCacheDomainResponse> addDnsCacheDomain(AddDnsCacheDomainRequest request);

    CompletableFuture<AddDnsGtmAccessStrategyResponse> addDnsGtmAccessStrategy(AddDnsGtmAccessStrategyRequest request);

    CompletableFuture<AddDnsGtmAddressPoolResponse> addDnsGtmAddressPool(AddDnsGtmAddressPoolRequest request);

    CompletableFuture<AddDnsGtmMonitorResponse> addDnsGtmMonitor(AddDnsGtmMonitorRequest request);

    CompletableFuture<AddDomainResponse> addDomain(AddDomainRequest request);

    CompletableFuture<AddDomainBackupResponse> addDomainBackup(AddDomainBackupRequest request);

    CompletableFuture<AddDomainGroupResponse> addDomainGroup(AddDomainGroupRequest request);

    CompletableFuture<AddDomainRecordResponse> addDomainRecord(AddDomainRecordRequest request);

    CompletableFuture<AddGtmAccessStrategyResponse> addGtmAccessStrategy(AddGtmAccessStrategyRequest request);

    CompletableFuture<AddGtmAddressPoolResponse> addGtmAddressPool(AddGtmAddressPoolRequest request);

    CompletableFuture<AddGtmMonitorResponse> addGtmMonitor(AddGtmMonitorRequest request);

    CompletableFuture<AddGtmRecoveryPlanResponse> addGtmRecoveryPlan(AddGtmRecoveryPlanRequest request);

    CompletableFuture<BindInstanceDomainsResponse> bindInstanceDomains(BindInstanceDomainsRequest request);

    CompletableFuture<ChangeDomainGroupResponse> changeDomainGroup(ChangeDomainGroupRequest request);

    CompletableFuture<ChangeDomainOfDnsProductResponse> changeDomainOfDnsProduct(ChangeDomainOfDnsProductRequest request);

    CompletableFuture<CopyGtmConfigResponse> copyGtmConfig(CopyGtmConfigRequest request);

    CompletableFuture<CreatePdnsAppKeyResponse> createPdnsAppKey(CreatePdnsAppKeyRequest request);

    CompletableFuture<CreatePdnsUdpIpSegmentResponse> createPdnsUdpIpSegment(CreatePdnsUdpIpSegmentRequest request);

    CompletableFuture<DeleteCustomLinesResponse> deleteCustomLines(DeleteCustomLinesRequest request);

    CompletableFuture<DeleteDnsCacheDomainResponse> deleteDnsCacheDomain(DeleteDnsCacheDomainRequest request);

    CompletableFuture<DeleteDnsGtmAccessStrategyResponse> deleteDnsGtmAccessStrategy(DeleteDnsGtmAccessStrategyRequest request);

    CompletableFuture<DeleteDnsGtmAddressPoolResponse> deleteDnsGtmAddressPool(DeleteDnsGtmAddressPoolRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteDomainGroupResponse> deleteDomainGroup(DeleteDomainGroupRequest request);

    CompletableFuture<DeleteDomainRecordResponse> deleteDomainRecord(DeleteDomainRecordRequest request);

    CompletableFuture<DeleteGtmAccessStrategyResponse> deleteGtmAccessStrategy(DeleteGtmAccessStrategyRequest request);

    CompletableFuture<DeleteGtmAddressPoolResponse> deleteGtmAddressPool(DeleteGtmAddressPoolRequest request);

    CompletableFuture<DeleteGtmRecoveryPlanResponse> deleteGtmRecoveryPlan(DeleteGtmRecoveryPlanRequest request);

    CompletableFuture<DeleteSubDomainRecordsResponse> deleteSubDomainRecords(DeleteSubDomainRecordsRequest request);

    CompletableFuture<DescribeBatchResultCountResponse> describeBatchResultCount(DescribeBatchResultCountRequest request);

    CompletableFuture<DescribeBatchResultDetailResponse> describeBatchResultDetail(DescribeBatchResultDetailRequest request);

    CompletableFuture<DescribeCustomLineResponse> describeCustomLine(DescribeCustomLineRequest request);

    CompletableFuture<DescribeCustomLinesResponse> describeCustomLines(DescribeCustomLinesRequest request);

    CompletableFuture<DescribeDNSSLBSubDomainsResponse> describeDNSSLBSubDomains(DescribeDNSSLBSubDomainsRequest request);

    CompletableFuture<DescribeDnsCacheDomainsResponse> describeDnsCacheDomains(DescribeDnsCacheDomainsRequest request);

    CompletableFuture<DescribeDnsGtmAccessStrategiesResponse> describeDnsGtmAccessStrategies(DescribeDnsGtmAccessStrategiesRequest request);

    CompletableFuture<DescribeDnsGtmAccessStrategyResponse> describeDnsGtmAccessStrategy(DescribeDnsGtmAccessStrategyRequest request);

    CompletableFuture<DescribeDnsGtmAccessStrategyAvailableConfigResponse> describeDnsGtmAccessStrategyAvailableConfig(DescribeDnsGtmAccessStrategyAvailableConfigRequest request);

    CompletableFuture<DescribeDnsGtmAddrAttributeInfoResponse> describeDnsGtmAddrAttributeInfo(DescribeDnsGtmAddrAttributeInfoRequest request);

    CompletableFuture<DescribeDnsGtmAddressPoolAvailableConfigResponse> describeDnsGtmAddressPoolAvailableConfig(DescribeDnsGtmAddressPoolAvailableConfigRequest request);

    CompletableFuture<DescribeDnsGtmAvailableAlertGroupResponse> describeDnsGtmAvailableAlertGroup(DescribeDnsGtmAvailableAlertGroupRequest request);

    CompletableFuture<DescribeDnsGtmInstanceResponse> describeDnsGtmInstance(DescribeDnsGtmInstanceRequest request);

    CompletableFuture<DescribeDnsGtmInstanceAddressPoolResponse> describeDnsGtmInstanceAddressPool(DescribeDnsGtmInstanceAddressPoolRequest request);

    CompletableFuture<DescribeDnsGtmInstanceAddressPoolsResponse> describeDnsGtmInstanceAddressPools(DescribeDnsGtmInstanceAddressPoolsRequest request);

    CompletableFuture<DescribeDnsGtmInstanceStatusResponse> describeDnsGtmInstanceStatus(DescribeDnsGtmInstanceStatusRequest request);

    CompletableFuture<DescribeDnsGtmInstanceSystemCnameResponse> describeDnsGtmInstanceSystemCname(DescribeDnsGtmInstanceSystemCnameRequest request);

    CompletableFuture<DescribeDnsGtmInstancesResponse> describeDnsGtmInstances(DescribeDnsGtmInstancesRequest request);

    CompletableFuture<DescribeDnsGtmLogsResponse> describeDnsGtmLogs(DescribeDnsGtmLogsRequest request);

    CompletableFuture<DescribeDnsGtmMonitorAvailableConfigResponse> describeDnsGtmMonitorAvailableConfig(DescribeDnsGtmMonitorAvailableConfigRequest request);

    CompletableFuture<DescribeDnsGtmMonitorConfigResponse> describeDnsGtmMonitorConfig(DescribeDnsGtmMonitorConfigRequest request);

    CompletableFuture<DescribeDnsProductInstanceResponse> describeDnsProductInstance(DescribeDnsProductInstanceRequest request);

    CompletableFuture<DescribeDnsProductInstancesResponse> describeDnsProductInstances(DescribeDnsProductInstancesRequest request);

    CompletableFuture<DescribeDohAccountStatisticsResponse> describeDohAccountStatistics(DescribeDohAccountStatisticsRequest request);

    CompletableFuture<DescribeDohDomainStatisticsResponse> describeDohDomainStatistics(DescribeDohDomainStatisticsRequest request);

    CompletableFuture<DescribeDohDomainStatisticsSummaryResponse> describeDohDomainStatisticsSummary(DescribeDohDomainStatisticsSummaryRequest request);

    CompletableFuture<DescribeDohSubDomainStatisticsResponse> describeDohSubDomainStatistics(DescribeDohSubDomainStatisticsRequest request);

    CompletableFuture<DescribeDohSubDomainStatisticsSummaryResponse> describeDohSubDomainStatisticsSummary(DescribeDohSubDomainStatisticsSummaryRequest request);

    CompletableFuture<DescribeDohUserInfoResponse> describeDohUserInfo(DescribeDohUserInfoRequest request);

    CompletableFuture<DescribeDomainDnssecInfoResponse> describeDomainDnssecInfo(DescribeDomainDnssecInfoRequest request);

    CompletableFuture<DescribeDomainGroupsResponse> describeDomainGroups(DescribeDomainGroupsRequest request);

    CompletableFuture<DescribeDomainInfoResponse> describeDomainInfo(DescribeDomainInfoRequest request);

    CompletableFuture<DescribeDomainLogsResponse> describeDomainLogs(DescribeDomainLogsRequest request);

    CompletableFuture<DescribeDomainNsResponse> describeDomainNs(DescribeDomainNsRequest request);

    CompletableFuture<DescribeDomainRecordInfoResponse> describeDomainRecordInfo(DescribeDomainRecordInfoRequest request);

    CompletableFuture<DescribeDomainRecordsResponse> describeDomainRecords(DescribeDomainRecordsRequest request);

    CompletableFuture<DescribeDomainStatisticsResponse> describeDomainStatistics(DescribeDomainStatisticsRequest request);

    CompletableFuture<DescribeDomainStatisticsSummaryResponse> describeDomainStatisticsSummary(DescribeDomainStatisticsSummaryRequest request);

    CompletableFuture<DescribeDomainsResponse> describeDomains(DescribeDomainsRequest request);

    CompletableFuture<DescribeGtmAccessStrategiesResponse> describeGtmAccessStrategies(DescribeGtmAccessStrategiesRequest request);

    CompletableFuture<DescribeGtmAccessStrategyResponse> describeGtmAccessStrategy(DescribeGtmAccessStrategyRequest request);

    CompletableFuture<DescribeGtmAccessStrategyAvailableConfigResponse> describeGtmAccessStrategyAvailableConfig(DescribeGtmAccessStrategyAvailableConfigRequest request);

    CompletableFuture<DescribeGtmAvailableAlertGroupResponse> describeGtmAvailableAlertGroup(DescribeGtmAvailableAlertGroupRequest request);

    CompletableFuture<DescribeGtmInstanceResponse> describeGtmInstance(DescribeGtmInstanceRequest request);

    CompletableFuture<DescribeGtmInstanceAddressPoolResponse> describeGtmInstanceAddressPool(DescribeGtmInstanceAddressPoolRequest request);

    CompletableFuture<DescribeGtmInstanceAddressPoolsResponse> describeGtmInstanceAddressPools(DescribeGtmInstanceAddressPoolsRequest request);

    CompletableFuture<DescribeGtmInstanceStatusResponse> describeGtmInstanceStatus(DescribeGtmInstanceStatusRequest request);

    CompletableFuture<DescribeGtmInstanceSystemCnameResponse> describeGtmInstanceSystemCname(DescribeGtmInstanceSystemCnameRequest request);

    CompletableFuture<DescribeGtmInstancesResponse> describeGtmInstances(DescribeGtmInstancesRequest request);

    CompletableFuture<DescribeGtmLogsResponse> describeGtmLogs(DescribeGtmLogsRequest request);

    CompletableFuture<DescribeGtmMonitorAvailableConfigResponse> describeGtmMonitorAvailableConfig(DescribeGtmMonitorAvailableConfigRequest request);

    CompletableFuture<DescribeGtmMonitorConfigResponse> describeGtmMonitorConfig(DescribeGtmMonitorConfigRequest request);

    CompletableFuture<DescribeGtmRecoveryPlanResponse> describeGtmRecoveryPlan(DescribeGtmRecoveryPlanRequest request);

    CompletableFuture<DescribeGtmRecoveryPlanAvailableConfigResponse> describeGtmRecoveryPlanAvailableConfig(DescribeGtmRecoveryPlanAvailableConfigRequest request);

    CompletableFuture<DescribeGtmRecoveryPlansResponse> describeGtmRecoveryPlans(DescribeGtmRecoveryPlansRequest request);

    CompletableFuture<DescribeInstanceDomainsResponse> describeInstanceDomains(DescribeInstanceDomainsRequest request);

    CompletableFuture<DescribeIspFlushCacheInstancesResponse> describeIspFlushCacheInstances(DescribeIspFlushCacheInstancesRequest request);

    CompletableFuture<DescribeIspFlushCacheRemainQuotaResponse> describeIspFlushCacheRemainQuota(DescribeIspFlushCacheRemainQuotaRequest request);

    CompletableFuture<DescribeIspFlushCacheTaskResponse> describeIspFlushCacheTask(DescribeIspFlushCacheTaskRequest request);

    CompletableFuture<DescribeIspFlushCacheTasksResponse> describeIspFlushCacheTasks(DescribeIspFlushCacheTasksRequest request);

    CompletableFuture<DescribePdnsAccountSummaryResponse> describePdnsAccountSummary(DescribePdnsAccountSummaryRequest request);

    CompletableFuture<DescribePdnsAppKeyResponse> describePdnsAppKey(DescribePdnsAppKeyRequest request);

    CompletableFuture<DescribePdnsAppKeysResponse> describePdnsAppKeys(DescribePdnsAppKeysRequest request);

    CompletableFuture<DescribePdnsOperateLogsResponse> describePdnsOperateLogs(DescribePdnsOperateLogsRequest request);

    CompletableFuture<DescribePdnsRequestStatisticResponse> describePdnsRequestStatistic(DescribePdnsRequestStatisticRequest request);

    CompletableFuture<DescribePdnsRequestStatisticsResponse> describePdnsRequestStatistics(DescribePdnsRequestStatisticsRequest request);

    CompletableFuture<DescribePdnsThreatLogsResponse> describePdnsThreatLogs(DescribePdnsThreatLogsRequest request);

    CompletableFuture<DescribePdnsThreatStatisticResponse> describePdnsThreatStatistic(DescribePdnsThreatStatisticRequest request);

    CompletableFuture<DescribePdnsThreatStatisticsResponse> describePdnsThreatStatistics(DescribePdnsThreatStatisticsRequest request);

    CompletableFuture<DescribePdnsUdpIpSegmentsResponse> describePdnsUdpIpSegments(DescribePdnsUdpIpSegmentsRequest request);

    CompletableFuture<DescribePdnsUserInfoResponse> describePdnsUserInfo(DescribePdnsUserInfoRequest request);

    CompletableFuture<DescribeRecordLogsResponse> describeRecordLogs(DescribeRecordLogsRequest request);

    CompletableFuture<DescribeRecordStatisticsResponse> describeRecordStatistics(DescribeRecordStatisticsRequest request);

    CompletableFuture<DescribeRecordStatisticsSummaryResponse> describeRecordStatisticsSummary(DescribeRecordStatisticsSummaryRequest request);

    CompletableFuture<DescribeSubDomainRecordsResponse> describeSubDomainRecords(DescribeSubDomainRecordsRequest request);

    CompletableFuture<DescribeSupportLinesResponse> describeSupportLines(DescribeSupportLinesRequest request);

    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeTransferDomainsResponse> describeTransferDomains(DescribeTransferDomainsRequest request);

    CompletableFuture<ExecuteGtmRecoveryPlanResponse> executeGtmRecoveryPlan(ExecuteGtmRecoveryPlanRequest request);

    CompletableFuture<GetMainDomainNameResponse> getMainDomainName(GetMainDomainNameRequest request);

    CompletableFuture<GetTxtRecordForVerifyResponse> getTxtRecordForVerify(GetTxtRecordForVerifyRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyHichinaDomainDNSResponse> modifyHichinaDomainDNS(ModifyHichinaDomainDNSRequest request);

    CompletableFuture<MoveDomainResourceGroupResponse> moveDomainResourceGroup(MoveDomainResourceGroupRequest request);

    CompletableFuture<MoveGtmResourceGroupResponse> moveGtmResourceGroup(MoveGtmResourceGroupRequest request);

    CompletableFuture<OperateBatchDomainResponse> operateBatchDomain(OperateBatchDomainRequest request);

    CompletableFuture<PausePdnsServiceResponse> pausePdnsService(PausePdnsServiceRequest request);

    CompletableFuture<PreviewGtmRecoveryPlanResponse> previewGtmRecoveryPlan(PreviewGtmRecoveryPlanRequest request);

    CompletableFuture<RemovePdnsAppKeyResponse> removePdnsAppKey(RemovePdnsAppKeyRequest request);

    CompletableFuture<RemovePdnsUdpIpSegmentResponse> removePdnsUdpIpSegment(RemovePdnsUdpIpSegmentRequest request);

    CompletableFuture<ResumePdnsServiceResponse> resumePdnsService(ResumePdnsServiceRequest request);

    CompletableFuture<RetrieveDomainResponse> retrieveDomain(RetrieveDomainRequest request);

    CompletableFuture<RollbackGtmRecoveryPlanResponse> rollbackGtmRecoveryPlan(RollbackGtmRecoveryPlanRequest request);

    CompletableFuture<SetDNSSLBStatusResponse> setDNSSLBStatus(SetDNSSLBStatusRequest request);

    CompletableFuture<SetDnsGtmAccessModeResponse> setDnsGtmAccessMode(SetDnsGtmAccessModeRequest request);

    CompletableFuture<SetDnsGtmMonitorStatusResponse> setDnsGtmMonitorStatus(SetDnsGtmMonitorStatusRequest request);

    CompletableFuture<SetDomainDnssecStatusResponse> setDomainDnssecStatus(SetDomainDnssecStatusRequest request);

    CompletableFuture<SetDomainRecordStatusResponse> setDomainRecordStatus(SetDomainRecordStatusRequest request);

    CompletableFuture<SetGtmAccessModeResponse> setGtmAccessMode(SetGtmAccessModeRequest request);

    CompletableFuture<SetGtmMonitorStatusResponse> setGtmMonitorStatus(SetGtmMonitorStatusRequest request);

    CompletableFuture<SubmitIspFlushCacheTaskResponse> submitIspFlushCacheTask(SubmitIspFlushCacheTaskRequest request);

    CompletableFuture<SwitchDnsGtmInstanceStrategyModeResponse> switchDnsGtmInstanceStrategyMode(SwitchDnsGtmInstanceStrategyModeRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<TransferDomainResponse> transferDomain(TransferDomainRequest request);

    CompletableFuture<UnbindInstanceDomainsResponse> unbindInstanceDomains(UnbindInstanceDomainsRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAppKeyStateResponse> updateAppKeyState(UpdateAppKeyStateRequest request);

    CompletableFuture<UpdateCustomLineResponse> updateCustomLine(UpdateCustomLineRequest request);

    CompletableFuture<UpdateDNSSLBWeightResponse> updateDNSSLBWeight(UpdateDNSSLBWeightRequest request);

    CompletableFuture<UpdateDnsCacheDomainResponse> updateDnsCacheDomain(UpdateDnsCacheDomainRequest request);

    CompletableFuture<UpdateDnsCacheDomainRemarkResponse> updateDnsCacheDomainRemark(UpdateDnsCacheDomainRemarkRequest request);

    CompletableFuture<UpdateDnsGtmAccessStrategyResponse> updateDnsGtmAccessStrategy(UpdateDnsGtmAccessStrategyRequest request);

    CompletableFuture<UpdateDnsGtmAddressPoolResponse> updateDnsGtmAddressPool(UpdateDnsGtmAddressPoolRequest request);

    CompletableFuture<UpdateDnsGtmInstanceGlobalConfigResponse> updateDnsGtmInstanceGlobalConfig(UpdateDnsGtmInstanceGlobalConfigRequest request);

    CompletableFuture<UpdateDnsGtmMonitorResponse> updateDnsGtmMonitor(UpdateDnsGtmMonitorRequest request);

    CompletableFuture<UpdateDomainGroupResponse> updateDomainGroup(UpdateDomainGroupRequest request);

    CompletableFuture<UpdateDomainRecordResponse> updateDomainRecord(UpdateDomainRecordRequest request);

    CompletableFuture<UpdateDomainRecordRemarkResponse> updateDomainRecordRemark(UpdateDomainRecordRemarkRequest request);

    CompletableFuture<UpdateDomainRemarkResponse> updateDomainRemark(UpdateDomainRemarkRequest request);

    CompletableFuture<UpdateGtmAccessStrategyResponse> updateGtmAccessStrategy(UpdateGtmAccessStrategyRequest request);

    CompletableFuture<UpdateGtmAddressPoolResponse> updateGtmAddressPool(UpdateGtmAddressPoolRequest request);

    CompletableFuture<UpdateGtmInstanceGlobalConfigResponse> updateGtmInstanceGlobalConfig(UpdateGtmInstanceGlobalConfigRequest request);

    CompletableFuture<UpdateGtmMonitorResponse> updateGtmMonitor(UpdateGtmMonitorRequest request);

    CompletableFuture<UpdateGtmRecoveryPlanResponse> updateGtmRecoveryPlan(UpdateGtmRecoveryPlanRequest request);

    CompletableFuture<UpdateIspFlushCacheInstanceConfigResponse> updateIspFlushCacheInstanceConfig(UpdateIspFlushCacheInstanceConfigRequest request);

    CompletableFuture<ValidateDnsGtmAttributeInfoResponse> validateDnsGtmAttributeInfo(ValidateDnsGtmAttributeInfoRequest request);

    CompletableFuture<ValidateDnsGtmCnameRrCanUseResponse> validateDnsGtmCnameRrCanUse(ValidateDnsGtmCnameRrCanUseRequest request);

    CompletableFuture<ValidatePdnsUdpIpSegmentResponse> validatePdnsUdpIpSegment(ValidatePdnsUdpIpSegmentRequest request);

}
