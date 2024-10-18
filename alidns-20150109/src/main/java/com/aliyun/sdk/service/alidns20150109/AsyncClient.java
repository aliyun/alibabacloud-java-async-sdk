// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alidns20150109.models.*;
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
     * <b>description</b> :
     * <p>In each CIDR block, the end IP address must be greater than or equal to the start IP address.\
     * The CIDR blocks that are specified for all custom lines of a domain name cannot be overlapped.</p>
     * 
     * @param request the request parameters of AddCustomLine  AddCustomLineRequest
     * @return AddCustomLineResponse
     */
    CompletableFuture<AddCustomLineResponse> addCustomLine(AddCustomLineRequest request);

    /**
     * @param request the request parameters of AddDnsCacheDomain  AddDnsCacheDomainRequest
     * @return AddDnsCacheDomainResponse
     */
    CompletableFuture<AddDnsCacheDomainResponse> addDnsCacheDomain(AddDnsCacheDomainRequest request);

    /**
     * @param request the request parameters of AddDnsGtmAccessStrategy  AddDnsGtmAccessStrategyRequest
     * @return AddDnsGtmAccessStrategyResponse
     */
    CompletableFuture<AddDnsGtmAccessStrategyResponse> addDnsGtmAccessStrategy(AddDnsGtmAccessStrategyRequest request);

    /**
     * @param request the request parameters of AddDnsGtmAddressPool  AddDnsGtmAddressPoolRequest
     * @return AddDnsGtmAddressPoolResponse
     */
    CompletableFuture<AddDnsGtmAddressPoolResponse> addDnsGtmAddressPool(AddDnsGtmAddressPoolRequest request);

    /**
     * <b>description</b> :
     * <p>**</p>
     * 
     * @param request the request parameters of AddDnsGtmMonitor  AddDnsGtmMonitorRequest
     * @return AddDnsGtmMonitorResponse
     */
    CompletableFuture<AddDnsGtmMonitorResponse> addDnsGtmMonitor(AddDnsGtmMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about how to check whether a domain name is valid, see
     * <a href="https://www.alibabacloud.com/help/zh/doc-detail/67788.htm">Domain name validity</a>.</p>
     * 
     * @param request the request parameters of AddDomain  AddDomainRequest
     * @return AddDomainResponse
     */
    CompletableFuture<AddDomainResponse> addDomain(AddDomainRequest request);

    /**
     * @param request the request parameters of AddDomainBackup  AddDomainBackupRequest
     * @return AddDomainBackupResponse
     */
    CompletableFuture<AddDomainBackupResponse> addDomainBackup(AddDomainBackupRequest request);

    /**
     * @param request the request parameters of AddDomainGroup  AddDomainGroupRequest
     * @return AddDomainGroupResponse
     */
    CompletableFuture<AddDomainGroupResponse> addDomainGroup(AddDomainGroupRequest request);

    /**
     * @param request the request parameters of AddDomainRecord  AddDomainRecordRequest
     * @return AddDomainRecordResponse
     */
    CompletableFuture<AddDomainRecordResponse> addDomainRecord(AddDomainRecordRequest request);

    /**
     * @param request the request parameters of AddGtmAccessStrategy  AddGtmAccessStrategyRequest
     * @return AddGtmAccessStrategyResponse
     */
    CompletableFuture<AddGtmAccessStrategyResponse> addGtmAccessStrategy(AddGtmAccessStrategyRequest request);

    /**
     * @param request the request parameters of AddGtmAddressPool  AddGtmAddressPoolRequest
     * @return AddGtmAddressPoolResponse
     */
    CompletableFuture<AddGtmAddressPoolResponse> addGtmAddressPool(AddGtmAddressPoolRequest request);

    /**
     * @param request the request parameters of AddGtmMonitor  AddGtmMonitorRequest
     * @return AddGtmMonitorResponse
     */
    CompletableFuture<AddGtmMonitorResponse> addGtmMonitor(AddGtmMonitorRequest request);

    /**
     * @param request the request parameters of AddGtmRecoveryPlan  AddGtmRecoveryPlanRequest
     * @return AddGtmRecoveryPlanResponse
     */
    CompletableFuture<AddGtmRecoveryPlanResponse> addGtmRecoveryPlan(AddGtmRecoveryPlanRequest request);

    /**
     * <b>description</b> :
     * <p>A paid Alibaba Cloud DNS instance whose ID starts with dns is an instance of the new version. You can call this API operation to bind multiple domain names to the instance. If the upper limit is exceeded, an error message is returned.\
     * A paid Alibaba Cloud DNS instance whose ID does not start with dns is an instance of the old version. You can call this API operation to bind only one domain name to the instance. However, if the instance is already bound to a domain name, you must unbind the original domain name from the instance and bind the desired domain name to the instance.</p>
     * 
     * @param request the request parameters of BindInstanceDomains  BindInstanceDomainsRequest
     * @return BindInstanceDomainsResponse
     */
    CompletableFuture<BindInstanceDomainsResponse> bindInstanceDomains(BindInstanceDomainsRequest request);

    /**
     * <b>description</b> :
     * <p>You can specify GroupId to move a domain name to a specific domain name group. You can move the domain name to the group that contains all domain names or the default group.</p>
     * 
     * @param request the request parameters of ChangeDomainGroup  ChangeDomainGroupRequest
     * @return ChangeDomainGroupResponse
     */
    CompletableFuture<ChangeDomainGroupResponse> changeDomainGroup(ChangeDomainGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>You can call this operation regardless of whether the Alibaba Cloud DNS instance is bound to a domain name. You can also call this operation to unbind the domain name from the Alibaba Cloud DNS instance by leaving the NewDomain parameter empty.</strong></p>
     * <ul>
     * <li>**This operation applies to instances of the custom edition. To change the domain name that is bound to an Alibaba Cloud DNS instance of Personal Edition, Enterprise Standard Edition, or Enterprise Ultimate Edition, call the BindInstanceDomains operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ChangeDomainOfDnsProduct  ChangeDomainOfDnsProductRequest
     * @return ChangeDomainOfDnsProductResponse
     */
    CompletableFuture<ChangeDomainOfDnsProductResponse> changeDomainOfDnsProduct(ChangeDomainOfDnsProductRequest request);

    /**
     * @param request the request parameters of CopyGtmConfig  CopyGtmConfigRequest
     * @return CopyGtmConfigResponse
     */
    CompletableFuture<CopyGtmConfigResponse> copyGtmConfig(CopyGtmConfigRequest request);

    /**
     * @param request the request parameters of CreateCloudGtmAddress  CreateCloudGtmAddressRequest
     * @return CreateCloudGtmAddressResponse
     */
    CompletableFuture<CreateCloudGtmAddressResponse> createCloudGtmAddress(CreateCloudGtmAddressRequest request);

    /**
     * @param request the request parameters of CreateCloudGtmAddressPool  CreateCloudGtmAddressPoolRequest
     * @return CreateCloudGtmAddressPoolResponse
     */
    CompletableFuture<CreateCloudGtmAddressPoolResponse> createCloudGtmAddressPool(CreateCloudGtmAddressPoolRequest request);

    /**
     * @param request the request parameters of CreateCloudGtmInstanceConfig  CreateCloudGtmInstanceConfigRequest
     * @return CreateCloudGtmInstanceConfigResponse
     */
    CompletableFuture<CreateCloudGtmInstanceConfigResponse> createCloudGtmInstanceConfig(CreateCloudGtmInstanceConfigRequest request);

    /**
     * @param request the request parameters of CreateCloudGtmMonitorTemplate  CreateCloudGtmMonitorTemplateRequest
     * @return CreateCloudGtmMonitorTemplateResponse
     */
    CompletableFuture<CreateCloudGtmMonitorTemplateResponse> createCloudGtmMonitorTemplate(CreateCloudGtmMonitorTemplateRequest request);

    /**
     * @param request the request parameters of CreatePdnsAppKey  CreatePdnsAppKeyRequest
     * @return CreatePdnsAppKeyResponse
     */
    CompletableFuture<CreatePdnsAppKeyResponse> createPdnsAppKey(CreatePdnsAppKeyRequest request);

    /**
     * @param request the request parameters of CreatePdnsUdpIpSegment  CreatePdnsUdpIpSegmentRequest
     * @return CreatePdnsUdpIpSegmentResponse
     */
    CompletableFuture<CreatePdnsUdpIpSegmentResponse> createPdnsUdpIpSegment(CreatePdnsUdpIpSegmentRequest request);

    /**
     * @param request the request parameters of DeleteCloudGtmAddress  DeleteCloudGtmAddressRequest
     * @return DeleteCloudGtmAddressResponse
     */
    CompletableFuture<DeleteCloudGtmAddressResponse> deleteCloudGtmAddress(DeleteCloudGtmAddressRequest request);

    /**
     * @param request the request parameters of DeleteCloudGtmAddressPool  DeleteCloudGtmAddressPoolRequest
     * @return DeleteCloudGtmAddressPoolResponse
     */
    CompletableFuture<DeleteCloudGtmAddressPoolResponse> deleteCloudGtmAddressPool(DeleteCloudGtmAddressPoolRequest request);

    /**
     * @param request the request parameters of DeleteCloudGtmInstanceConfig  DeleteCloudGtmInstanceConfigRequest
     * @return DeleteCloudGtmInstanceConfigResponse
     */
    CompletableFuture<DeleteCloudGtmInstanceConfigResponse> deleteCloudGtmInstanceConfig(DeleteCloudGtmInstanceConfigRequest request);

    /**
     * @param request the request parameters of DeleteCloudGtmMonitorTemplate  DeleteCloudGtmMonitorTemplateRequest
     * @return DeleteCloudGtmMonitorTemplateResponse
     */
    CompletableFuture<DeleteCloudGtmMonitorTemplateResponse> deleteCloudGtmMonitorTemplate(DeleteCloudGtmMonitorTemplateRequest request);

    /**
     * @param request the request parameters of DeleteCustomLines  DeleteCustomLinesRequest
     * @return DeleteCustomLinesResponse
     */
    CompletableFuture<DeleteCustomLinesResponse> deleteCustomLines(DeleteCustomLinesRequest request);

    /**
     * @param request the request parameters of DeleteDnsCacheDomain  DeleteDnsCacheDomainRequest
     * @return DeleteDnsCacheDomainResponse
     */
    CompletableFuture<DeleteDnsCacheDomainResponse> deleteDnsCacheDomain(DeleteDnsCacheDomainRequest request);

    /**
     * @param request the request parameters of DeleteDnsGtmAccessStrategy  DeleteDnsGtmAccessStrategyRequest
     * @return DeleteDnsGtmAccessStrategyResponse
     */
    CompletableFuture<DeleteDnsGtmAccessStrategyResponse> deleteDnsGtmAccessStrategy(DeleteDnsGtmAccessStrategyRequest request);

    /**
     * @param request the request parameters of DeleteDnsGtmAddressPool  DeleteDnsGtmAddressPoolRequest
     * @return DeleteDnsGtmAddressPoolResponse
     */
    CompletableFuture<DeleteDnsGtmAddressPoolResponse> deleteDnsGtmAddressPool(DeleteDnsGtmAddressPoolRequest request);

    /**
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The default group cannot be deleted.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteDomainGroup  DeleteDomainGroupRequest
     * @return DeleteDomainGroupResponse
     */
    CompletableFuture<DeleteDomainGroupResponse> deleteDomainGroup(DeleteDomainGroupRequest request);

    /**
     * @param request the request parameters of DeleteDomainRecord  DeleteDomainRecordRequest
     * @return DeleteDomainRecordResponse
     */
    CompletableFuture<DeleteDomainRecordResponse> deleteDomainRecord(DeleteDomainRecordRequest request);

    /**
     * @param request the request parameters of DeleteGtmAccessStrategy  DeleteGtmAccessStrategyRequest
     * @return DeleteGtmAccessStrategyResponse
     */
    CompletableFuture<DeleteGtmAccessStrategyResponse> deleteGtmAccessStrategy(DeleteGtmAccessStrategyRequest request);

    /**
     * @param request the request parameters of DeleteGtmAddressPool  DeleteGtmAddressPoolRequest
     * @return DeleteGtmAddressPoolResponse
     */
    CompletableFuture<DeleteGtmAddressPoolResponse> deleteGtmAddressPool(DeleteGtmAddressPoolRequest request);

    /**
     * @param request the request parameters of DeleteGtmRecoveryPlan  DeleteGtmRecoveryPlanRequest
     * @return DeleteGtmRecoveryPlanResponse
     */
    CompletableFuture<DeleteGtmRecoveryPlanResponse> deleteGtmRecoveryPlan(DeleteGtmRecoveryPlanRequest request);

    /**
     * <b>description</b> :
     * <p>If the DNS records to be deleted contain locked DNS records, locked DNS records will not be deleted.</p>
     * 
     * @param request the request parameters of DeleteSubDomainRecords  DeleteSubDomainRecordsRequest
     * @return DeleteSubDomainRecordsResponse
     */
    CompletableFuture<DeleteSubDomainRecordsResponse> deleteSubDomainRecords(DeleteSubDomainRecordsRequest request);

    /**
     * @param request the request parameters of DescribeBatchResultCount  DescribeBatchResultCountRequest
     * @return DescribeBatchResultCountResponse
     */
    CompletableFuture<DescribeBatchResultCountResponse> describeBatchResultCount(DescribeBatchResultCountRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the batch operation task is complete.</p>
     * 
     * @param request the request parameters of DescribeBatchResultDetail  DescribeBatchResultDetailRequest
     * @return DescribeBatchResultDetailResponse
     */
    CompletableFuture<DescribeBatchResultDetailResponse> describeBatchResultDetail(DescribeBatchResultDetailRequest request);

    /**
     * @param request the request parameters of DescribeCloudGtmAddress  DescribeCloudGtmAddressRequest
     * @return DescribeCloudGtmAddressResponse
     */
    CompletableFuture<DescribeCloudGtmAddressResponse> describeCloudGtmAddress(DescribeCloudGtmAddressRequest request);

    /**
     * @param request the request parameters of DescribeCloudGtmAddressPool  DescribeCloudGtmAddressPoolRequest
     * @return DescribeCloudGtmAddressPoolResponse
     */
    CompletableFuture<DescribeCloudGtmAddressPoolResponse> describeCloudGtmAddressPool(DescribeCloudGtmAddressPoolRequest request);

    /**
     * @param request the request parameters of DescribeCloudGtmAddressPoolReference  DescribeCloudGtmAddressPoolReferenceRequest
     * @return DescribeCloudGtmAddressPoolReferenceResponse
     */
    CompletableFuture<DescribeCloudGtmAddressPoolReferenceResponse> describeCloudGtmAddressPoolReference(DescribeCloudGtmAddressPoolReferenceRequest request);

    /**
     * @param request the request parameters of DescribeCloudGtmAddressReference  DescribeCloudGtmAddressReferenceRequest
     * @return DescribeCloudGtmAddressReferenceResponse
     */
    CompletableFuture<DescribeCloudGtmAddressReferenceResponse> describeCloudGtmAddressReference(DescribeCloudGtmAddressReferenceRequest request);

    /**
     * @param request the request parameters of DescribeCloudGtmGlobalAlert  DescribeCloudGtmGlobalAlertRequest
     * @return DescribeCloudGtmGlobalAlertResponse
     */
    CompletableFuture<DescribeCloudGtmGlobalAlertResponse> describeCloudGtmGlobalAlert(DescribeCloudGtmGlobalAlertRequest request);

    /**
     * @param request the request parameters of DescribeCloudGtmInstanceConfigAlert  DescribeCloudGtmInstanceConfigAlertRequest
     * @return DescribeCloudGtmInstanceConfigAlertResponse
     */
    CompletableFuture<DescribeCloudGtmInstanceConfigAlertResponse> describeCloudGtmInstanceConfigAlert(DescribeCloudGtmInstanceConfigAlertRequest request);

    /**
     * @param request the request parameters of DescribeCloudGtmInstanceConfigFullInfo  DescribeCloudGtmInstanceConfigFullInfoRequest
     * @return DescribeCloudGtmInstanceConfigFullInfoResponse
     */
    CompletableFuture<DescribeCloudGtmInstanceConfigFullInfoResponse> describeCloudGtmInstanceConfigFullInfo(DescribeCloudGtmInstanceConfigFullInfoRequest request);

    /**
     * @param request the request parameters of DescribeCloudGtmMonitorTemplate  DescribeCloudGtmMonitorTemplateRequest
     * @return DescribeCloudGtmMonitorTemplateResponse
     */
    CompletableFuture<DescribeCloudGtmMonitorTemplateResponse> describeCloudGtmMonitorTemplate(DescribeCloudGtmMonitorTemplateRequest request);

    /**
     * @param request the request parameters of DescribeCloudGtmSummary  DescribeCloudGtmSummaryRequest
     * @return DescribeCloudGtmSummaryResponse
     */
    CompletableFuture<DescribeCloudGtmSummaryResponse> describeCloudGtmSummary(DescribeCloudGtmSummaryRequest request);

    /**
     * @param request the request parameters of DescribeCloudGtmSystemLines  DescribeCloudGtmSystemLinesRequest
     * @return DescribeCloudGtmSystemLinesResponse
     */
    CompletableFuture<DescribeCloudGtmSystemLinesResponse> describeCloudGtmSystemLines(DescribeCloudGtmSystemLinesRequest request);

    /**
     * @param request the request parameters of DescribeCustomLine  DescribeCustomLineRequest
     * @return DescribeCustomLineResponse
     */
    CompletableFuture<DescribeCustomLineResponse> describeCustomLine(DescribeCustomLineRequest request);

    /**
     * @param request the request parameters of DescribeCustomLines  DescribeCustomLinesRequest
     * @return DescribeCustomLinesResponse
     */
    CompletableFuture<DescribeCustomLinesResponse> describeCustomLines(DescribeCustomLinesRequest request);

    /**
     * @param request the request parameters of DescribeDNSSLBSubDomains  DescribeDNSSLBSubDomainsRequest
     * @return DescribeDNSSLBSubDomainsResponse
     */
    CompletableFuture<DescribeDNSSLBSubDomainsResponse> describeDNSSLBSubDomains(DescribeDNSSLBSubDomainsRequest request);

    /**
     * @param request the request parameters of DescribeDnsCacheDomains  DescribeDnsCacheDomainsRequest
     * @return DescribeDnsCacheDomainsResponse
     */
    CompletableFuture<DescribeDnsCacheDomainsResponse> describeDnsCacheDomains(DescribeDnsCacheDomainsRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmAccessStrategies  DescribeDnsGtmAccessStrategiesRequest
     * @return DescribeDnsGtmAccessStrategiesResponse
     */
    CompletableFuture<DescribeDnsGtmAccessStrategiesResponse> describeDnsGtmAccessStrategies(DescribeDnsGtmAccessStrategiesRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmAccessStrategy  DescribeDnsGtmAccessStrategyRequest
     * @return DescribeDnsGtmAccessStrategyResponse
     */
    CompletableFuture<DescribeDnsGtmAccessStrategyResponse> describeDnsGtmAccessStrategy(DescribeDnsGtmAccessStrategyRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmAccessStrategyAvailableConfig  DescribeDnsGtmAccessStrategyAvailableConfigRequest
     * @return DescribeDnsGtmAccessStrategyAvailableConfigResponse
     */
    CompletableFuture<DescribeDnsGtmAccessStrategyAvailableConfigResponse> describeDnsGtmAccessStrategyAvailableConfig(DescribeDnsGtmAccessStrategyAvailableConfigRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmAddrAttributeInfo  DescribeDnsGtmAddrAttributeInfoRequest
     * @return DescribeDnsGtmAddrAttributeInfoResponse
     */
    CompletableFuture<DescribeDnsGtmAddrAttributeInfoResponse> describeDnsGtmAddrAttributeInfo(DescribeDnsGtmAddrAttributeInfoRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmAddressPoolAvailableConfig  DescribeDnsGtmAddressPoolAvailableConfigRequest
     * @return DescribeDnsGtmAddressPoolAvailableConfigResponse
     */
    CompletableFuture<DescribeDnsGtmAddressPoolAvailableConfigResponse> describeDnsGtmAddressPoolAvailableConfig(DescribeDnsGtmAddressPoolAvailableConfigRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmAvailableAlertGroup  DescribeDnsGtmAvailableAlertGroupRequest
     * @return DescribeDnsGtmAvailableAlertGroupResponse
     */
    CompletableFuture<DescribeDnsGtmAvailableAlertGroupResponse> describeDnsGtmAvailableAlertGroup(DescribeDnsGtmAvailableAlertGroupRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmInstance  DescribeDnsGtmInstanceRequest
     * @return DescribeDnsGtmInstanceResponse
     */
    CompletableFuture<DescribeDnsGtmInstanceResponse> describeDnsGtmInstance(DescribeDnsGtmInstanceRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmInstanceAddressPool  DescribeDnsGtmInstanceAddressPoolRequest
     * @return DescribeDnsGtmInstanceAddressPoolResponse
     */
    CompletableFuture<DescribeDnsGtmInstanceAddressPoolResponse> describeDnsGtmInstanceAddressPool(DescribeDnsGtmInstanceAddressPoolRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmInstanceAddressPools  DescribeDnsGtmInstanceAddressPoolsRequest
     * @return DescribeDnsGtmInstanceAddressPoolsResponse
     */
    CompletableFuture<DescribeDnsGtmInstanceAddressPoolsResponse> describeDnsGtmInstanceAddressPools(DescribeDnsGtmInstanceAddressPoolsRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmInstanceStatus  DescribeDnsGtmInstanceStatusRequest
     * @return DescribeDnsGtmInstanceStatusResponse
     */
    CompletableFuture<DescribeDnsGtmInstanceStatusResponse> describeDnsGtmInstanceStatus(DescribeDnsGtmInstanceStatusRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmInstanceSystemCname  DescribeDnsGtmInstanceSystemCnameRequest
     * @return DescribeDnsGtmInstanceSystemCnameResponse
     */
    CompletableFuture<DescribeDnsGtmInstanceSystemCnameResponse> describeDnsGtmInstanceSystemCname(DescribeDnsGtmInstanceSystemCnameRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmInstances  DescribeDnsGtmInstancesRequest
     * @return DescribeDnsGtmInstancesResponse
     */
    CompletableFuture<DescribeDnsGtmInstancesResponse> describeDnsGtmInstances(DescribeDnsGtmInstancesRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmLogs  DescribeDnsGtmLogsRequest
     * @return DescribeDnsGtmLogsResponse
     */
    CompletableFuture<DescribeDnsGtmLogsResponse> describeDnsGtmLogs(DescribeDnsGtmLogsRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmMonitorAvailableConfig  DescribeDnsGtmMonitorAvailableConfigRequest
     * @return DescribeDnsGtmMonitorAvailableConfigResponse
     */
    CompletableFuture<DescribeDnsGtmMonitorAvailableConfigResponse> describeDnsGtmMonitorAvailableConfig(DescribeDnsGtmMonitorAvailableConfigRequest request);

    /**
     * @param request the request parameters of DescribeDnsGtmMonitorConfig  DescribeDnsGtmMonitorConfigRequest
     * @return DescribeDnsGtmMonitorConfigResponse
     */
    CompletableFuture<DescribeDnsGtmMonitorConfigResponse> describeDnsGtmMonitorConfig(DescribeDnsGtmMonitorConfigRequest request);

    /**
     * @param request the request parameters of DescribeDnsProductInstance  DescribeDnsProductInstanceRequest
     * @return DescribeDnsProductInstanceResponse
     */
    CompletableFuture<DescribeDnsProductInstanceResponse> describeDnsProductInstance(DescribeDnsProductInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If the response parameters of an Alibaba Cloud DNS instance do not contain domain names, no domain names are bound to the instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDnsProductInstances  DescribeDnsProductInstancesRequest
     * @return DescribeDnsProductInstancesResponse
     */
    CompletableFuture<DescribeDnsProductInstancesResponse> describeDnsProductInstances(DescribeDnsProductInstancesRequest request);

    /**
     * @param request the request parameters of DescribeDohAccountStatistics  DescribeDohAccountStatisticsRequest
     * @return DescribeDohAccountStatisticsResponse
     */
    CompletableFuture<DescribeDohAccountStatisticsResponse> describeDohAccountStatistics(DescribeDohAccountStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeDohDomainStatistics  DescribeDohDomainStatisticsRequest
     * @return DescribeDohDomainStatisticsResponse
     */
    CompletableFuture<DescribeDohDomainStatisticsResponse> describeDohDomainStatistics(DescribeDohDomainStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeDohDomainStatisticsSummary  DescribeDohDomainStatisticsSummaryRequest
     * @return DescribeDohDomainStatisticsSummaryResponse
     */
    CompletableFuture<DescribeDohDomainStatisticsSummaryResponse> describeDohDomainStatisticsSummary(DescribeDohDomainStatisticsSummaryRequest request);

    /**
     * @param request the request parameters of DescribeDohSubDomainStatistics  DescribeDohSubDomainStatisticsRequest
     * @return DescribeDohSubDomainStatisticsResponse
     */
    CompletableFuture<DescribeDohSubDomainStatisticsResponse> describeDohSubDomainStatistics(DescribeDohSubDomainStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeDohSubDomainStatisticsSummary  DescribeDohSubDomainStatisticsSummaryRequest
     * @return DescribeDohSubDomainStatisticsSummaryResponse
     */
    CompletableFuture<DescribeDohSubDomainStatisticsSummaryResponse> describeDohSubDomainStatisticsSummary(DescribeDohSubDomainStatisticsSummaryRequest request);

    /**
     * @param request the request parameters of DescribeDohUserInfo  DescribeDohUserInfoRequest
     * @return DescribeDohUserInfoResponse
     */
    CompletableFuture<DescribeDohUserInfoResponse> describeDohUserInfo(DescribeDohUserInfoRequest request);

    /**
     * @param request the request parameters of DescribeDomainDnssecInfo  DescribeDomainDnssecInfoRequest
     * @return DescribeDomainDnssecInfoResponse
     */
    CompletableFuture<DescribeDomainDnssecInfoResponse> describeDomainDnssecInfo(DescribeDomainDnssecInfoRequest request);

    /**
     * @param request the request parameters of DescribeDomainGroups  DescribeDomainGroupsRequest
     * @return DescribeDomainGroupsResponse
     */
    CompletableFuture<DescribeDomainGroupsResponse> describeDomainGroups(DescribeDomainGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the domain name is bound to an instance of Alibaba Cloud DNS Enterprise Ultimate Edition. For more information about valid Domain Name System (DNS) request lines, see the return values of the RecordLines parameter.</p>
     * 
     * @param request the request parameters of DescribeDomainInfo  DescribeDomainInfoRequest
     * @return DescribeDomainInfoResponse
     */
    CompletableFuture<DescribeDomainInfoResponse> describeDomainInfo(DescribeDomainInfoRequest request);

    /**
     * @param request the request parameters of DescribeDomainLogs  DescribeDomainLogsRequest
     * @return DescribeDomainLogsResponse
     */
    CompletableFuture<DescribeDomainLogsResponse> describeDomainLogs(DescribeDomainLogsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation to query the authoritative servers of a domain name registry to obtain the name servers for a domain name. If the domain name is in an invalid state, such as serverHold or clientHold, an error may be returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeDomainNs  DescribeDomainNsRequest
     * @return DescribeDomainNsResponse
     */
    CompletableFuture<DescribeDomainNsResponse> describeDomainNs(DescribeDomainNsRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Alidns%5C&api=DescribeDomainRecordInfo%5C&type=RPC%5C&version=2015-01-09">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of DescribeDomainRecordInfo  DescribeDomainRecordInfoRequest
     * @return DescribeDomainRecordInfoResponse
     */
    CompletableFuture<DescribeDomainRecordInfoResponse> describeDomainRecordInfo(DescribeDomainRecordInfoRequest request);

    /**
     * <b>description</b> :
     * <p>  You can specify DomainName, PageNumber, and PageSize to query the DNS records of the specified domain names.</p>
     * <ul>
     * <li>You can also specify RRKeyWord, TypeKeyWord, or ValueKeyWord to query the DNS records that contain the specified keyword.</li>
     * <li>By default, the DNS records are sorted in reverse chronological order based on the time when they were added.</li>
     * <li>You can specify GroupId to query the DNS records of the specified domain names based on the group ID. You can query the DNS records of all domain names and the domain names in the default group.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomainRecords  DescribeDomainRecordsRequest
     * @return DescribeDomainRecordsResponse
     */
    CompletableFuture<DescribeDomainRecordsResponse> describeDomainRecords(DescribeDomainRecordsRequest request);

    /**
     * @param request the request parameters of DescribeDomainResolveStatisticsSummary  DescribeDomainResolveStatisticsSummaryRequest
     * @return DescribeDomainResolveStatisticsSummaryResponse
     */
    CompletableFuture<DescribeDomainResolveStatisticsSummaryResponse> describeDomainResolveStatisticsSummary(DescribeDomainResolveStatisticsSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>Real-time data is collected per hour.</p>
     * 
     * @param request the request parameters of DescribeDomainStatistics  DescribeDomainStatisticsRequest
     * @return DescribeDomainStatisticsResponse
     */
    CompletableFuture<DescribeDomainStatisticsResponse> describeDomainStatistics(DescribeDomainStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeDomainStatisticsSummary  DescribeDomainStatisticsSummaryRequest
     * @return DescribeDomainStatisticsSummaryResponse
     */
    CompletableFuture<DescribeDomainStatisticsSummaryResponse> describeDomainStatisticsSummary(DescribeDomainStatisticsSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>  You can specify the PageNumber and PageSize parameters to query domain names.</p>
     * <ul>
     * <li>You can specify the KeyWord parameter to query domain names that contain the specified keyword.</li>
     * <li>By default, the domain names in a list are sorted in descending order of the time they were added.</li>
     * <li>You can specify the GroupId parameter. If you do not specify this parameter, all domain names are queried by default.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDomains  DescribeDomainsRequest
     * @return DescribeDomainsResponse
     */
    CompletableFuture<DescribeDomainsResponse> describeDomains(DescribeDomainsRequest request);

    /**
     * @param request the request parameters of DescribeGtmAccessStrategies  DescribeGtmAccessStrategiesRequest
     * @return DescribeGtmAccessStrategiesResponse
     */
    CompletableFuture<DescribeGtmAccessStrategiesResponse> describeGtmAccessStrategies(DescribeGtmAccessStrategiesRequest request);

    /**
     * @param request the request parameters of DescribeGtmAccessStrategy  DescribeGtmAccessStrategyRequest
     * @return DescribeGtmAccessStrategyResponse
     */
    CompletableFuture<DescribeGtmAccessStrategyResponse> describeGtmAccessStrategy(DescribeGtmAccessStrategyRequest request);

    /**
     * @param request the request parameters of DescribeGtmAccessStrategyAvailableConfig  DescribeGtmAccessStrategyAvailableConfigRequest
     * @return DescribeGtmAccessStrategyAvailableConfigResponse
     */
    CompletableFuture<DescribeGtmAccessStrategyAvailableConfigResponse> describeGtmAccessStrategyAvailableConfig(DescribeGtmAccessStrategyAvailableConfigRequest request);

    /**
     * @param request the request parameters of DescribeGtmAvailableAlertGroup  DescribeGtmAvailableAlertGroupRequest
     * @return DescribeGtmAvailableAlertGroupResponse
     */
    CompletableFuture<DescribeGtmAvailableAlertGroupResponse> describeGtmAvailableAlertGroup(DescribeGtmAvailableAlertGroupRequest request);

    /**
     * @param request the request parameters of DescribeGtmInstance  DescribeGtmInstanceRequest
     * @return DescribeGtmInstanceResponse
     */
    CompletableFuture<DescribeGtmInstanceResponse> describeGtmInstance(DescribeGtmInstanceRequest request);

    /**
     * @param request the request parameters of DescribeGtmInstanceAddressPool  DescribeGtmInstanceAddressPoolRequest
     * @return DescribeGtmInstanceAddressPoolResponse
     */
    CompletableFuture<DescribeGtmInstanceAddressPoolResponse> describeGtmInstanceAddressPool(DescribeGtmInstanceAddressPoolRequest request);

    /**
     * @param request the request parameters of DescribeGtmInstanceAddressPools  DescribeGtmInstanceAddressPoolsRequest
     * @return DescribeGtmInstanceAddressPoolsResponse
     */
    CompletableFuture<DescribeGtmInstanceAddressPoolsResponse> describeGtmInstanceAddressPools(DescribeGtmInstanceAddressPoolsRequest request);

    /**
     * @param request the request parameters of DescribeGtmInstanceStatus  DescribeGtmInstanceStatusRequest
     * @return DescribeGtmInstanceStatusResponse
     */
    CompletableFuture<DescribeGtmInstanceStatusResponse> describeGtmInstanceStatus(DescribeGtmInstanceStatusRequest request);

    /**
     * @param request the request parameters of DescribeGtmInstanceSystemCname  DescribeGtmInstanceSystemCnameRequest
     * @return DescribeGtmInstanceSystemCnameResponse
     */
    CompletableFuture<DescribeGtmInstanceSystemCnameResponse> describeGtmInstanceSystemCname(DescribeGtmInstanceSystemCnameRequest request);

    /**
     * @param request the request parameters of DescribeGtmInstances  DescribeGtmInstancesRequest
     * @return DescribeGtmInstancesResponse
     */
    CompletableFuture<DescribeGtmInstancesResponse> describeGtmInstances(DescribeGtmInstancesRequest request);

    /**
     * @param request the request parameters of DescribeGtmLogs  DescribeGtmLogsRequest
     * @return DescribeGtmLogsResponse
     */
    CompletableFuture<DescribeGtmLogsResponse> describeGtmLogs(DescribeGtmLogsRequest request);

    /**
     * @param request the request parameters of DescribeGtmMonitorAvailableConfig  DescribeGtmMonitorAvailableConfigRequest
     * @return DescribeGtmMonitorAvailableConfigResponse
     */
    CompletableFuture<DescribeGtmMonitorAvailableConfigResponse> describeGtmMonitorAvailableConfig(DescribeGtmMonitorAvailableConfigRequest request);

    /**
     * @param request the request parameters of DescribeGtmMonitorConfig  DescribeGtmMonitorConfigRequest
     * @return DescribeGtmMonitorConfigResponse
     */
    CompletableFuture<DescribeGtmMonitorConfigResponse> describeGtmMonitorConfig(DescribeGtmMonitorConfigRequest request);

    /**
     * @param request the request parameters of DescribeGtmRecoveryPlan  DescribeGtmRecoveryPlanRequest
     * @return DescribeGtmRecoveryPlanResponse
     */
    CompletableFuture<DescribeGtmRecoveryPlanResponse> describeGtmRecoveryPlan(DescribeGtmRecoveryPlanRequest request);

    /**
     * @param request the request parameters of DescribeGtmRecoveryPlanAvailableConfig  DescribeGtmRecoveryPlanAvailableConfigRequest
     * @return DescribeGtmRecoveryPlanAvailableConfigResponse
     */
    CompletableFuture<DescribeGtmRecoveryPlanAvailableConfigResponse> describeGtmRecoveryPlanAvailableConfig(DescribeGtmRecoveryPlanAvailableConfigRequest request);

    /**
     * @param request the request parameters of DescribeGtmRecoveryPlans  DescribeGtmRecoveryPlansRequest
     * @return DescribeGtmRecoveryPlansResponse
     */
    CompletableFuture<DescribeGtmRecoveryPlansResponse> describeGtmRecoveryPlans(DescribeGtmRecoveryPlansRequest request);

    /**
     * @param request the request parameters of DescribeInstanceDomains  DescribeInstanceDomainsRequest
     * @return DescribeInstanceDomainsResponse
     */
    CompletableFuture<DescribeInstanceDomainsResponse> describeInstanceDomains(DescribeInstanceDomainsRequest request);

    /**
     * @param request the request parameters of DescribeInternetDnsLogs  DescribeInternetDnsLogsRequest
     * @return DescribeInternetDnsLogsResponse
     */
    CompletableFuture<DescribeInternetDnsLogsResponse> describeInternetDnsLogs(DescribeInternetDnsLogsRequest request);

    /**
     * @param request the request parameters of DescribeIspFlushCacheInstances  DescribeIspFlushCacheInstancesRequest
     * @return DescribeIspFlushCacheInstancesResponse
     */
    CompletableFuture<DescribeIspFlushCacheInstancesResponse> describeIspFlushCacheInstances(DescribeIspFlushCacheInstancesRequest request);

    /**
     * @param request the request parameters of DescribeIspFlushCacheRemainQuota  DescribeIspFlushCacheRemainQuotaRequest
     * @return DescribeIspFlushCacheRemainQuotaResponse
     */
    CompletableFuture<DescribeIspFlushCacheRemainQuotaResponse> describeIspFlushCacheRemainQuota(DescribeIspFlushCacheRemainQuotaRequest request);

    /**
     * @param request the request parameters of DescribeIspFlushCacheTask  DescribeIspFlushCacheTaskRequest
     * @return DescribeIspFlushCacheTaskResponse
     */
    CompletableFuture<DescribeIspFlushCacheTaskResponse> describeIspFlushCacheTask(DescribeIspFlushCacheTaskRequest request);

    /**
     * @param request the request parameters of DescribeIspFlushCacheTasks  DescribeIspFlushCacheTasksRequest
     * @return DescribeIspFlushCacheTasksResponse
     */
    CompletableFuture<DescribeIspFlushCacheTasksResponse> describeIspFlushCacheTasks(DescribeIspFlushCacheTasksRequest request);

    /**
     * @param request the request parameters of DescribePdnsAccountSummary  DescribePdnsAccountSummaryRequest
     * @return DescribePdnsAccountSummaryResponse
     */
    CompletableFuture<DescribePdnsAccountSummaryResponse> describePdnsAccountSummary(DescribePdnsAccountSummaryRequest request);

    /**
     * @param request the request parameters of DescribePdnsAppKey  DescribePdnsAppKeyRequest
     * @return DescribePdnsAppKeyResponse
     */
    CompletableFuture<DescribePdnsAppKeyResponse> describePdnsAppKey(DescribePdnsAppKeyRequest request);

    /**
     * @param request the request parameters of DescribePdnsAppKeys  DescribePdnsAppKeysRequest
     * @return DescribePdnsAppKeysResponse
     */
    CompletableFuture<DescribePdnsAppKeysResponse> describePdnsAppKeys(DescribePdnsAppKeysRequest request);

    /**
     * @param request the request parameters of DescribePdnsOperateLogs  DescribePdnsOperateLogsRequest
     * @return DescribePdnsOperateLogsResponse
     */
    CompletableFuture<DescribePdnsOperateLogsResponse> describePdnsOperateLogs(DescribePdnsOperateLogsRequest request);

    /**
     * @param request the request parameters of DescribePdnsRequestStatistic  DescribePdnsRequestStatisticRequest
     * @return DescribePdnsRequestStatisticResponse
     */
    CompletableFuture<DescribePdnsRequestStatisticResponse> describePdnsRequestStatistic(DescribePdnsRequestStatisticRequest request);

    /**
     * @param request the request parameters of DescribePdnsRequestStatistics  DescribePdnsRequestStatisticsRequest
     * @return DescribePdnsRequestStatisticsResponse
     */
    CompletableFuture<DescribePdnsRequestStatisticsResponse> describePdnsRequestStatistics(DescribePdnsRequestStatisticsRequest request);

    /**
     * @param request the request parameters of DescribePdnsThreatLogs  DescribePdnsThreatLogsRequest
     * @return DescribePdnsThreatLogsResponse
     */
    CompletableFuture<DescribePdnsThreatLogsResponse> describePdnsThreatLogs(DescribePdnsThreatLogsRequest request);

    /**
     * @param request the request parameters of DescribePdnsThreatStatistic  DescribePdnsThreatStatisticRequest
     * @return DescribePdnsThreatStatisticResponse
     */
    CompletableFuture<DescribePdnsThreatStatisticResponse> describePdnsThreatStatistic(DescribePdnsThreatStatisticRequest request);

    /**
     * @param request the request parameters of DescribePdnsThreatStatistics  DescribePdnsThreatStatisticsRequest
     * @return DescribePdnsThreatStatisticsResponse
     */
    CompletableFuture<DescribePdnsThreatStatisticsResponse> describePdnsThreatStatistics(DescribePdnsThreatStatisticsRequest request);

    /**
     * @param request the request parameters of DescribePdnsUdpIpSegments  DescribePdnsUdpIpSegmentsRequest
     * @return DescribePdnsUdpIpSegmentsResponse
     */
    CompletableFuture<DescribePdnsUdpIpSegmentsResponse> describePdnsUdpIpSegments(DescribePdnsUdpIpSegmentsRequest request);

    /**
     * @param request the request parameters of DescribePdnsUserInfo  DescribePdnsUserInfoRequest
     * @return DescribePdnsUserInfoResponse
     */
    CompletableFuture<DescribePdnsUserInfoResponse> describePdnsUserInfo(DescribePdnsUserInfoRequest request);

    /**
     * @param request the request parameters of DescribeRecordLogs  DescribeRecordLogsRequest
     * @return DescribeRecordLogsResponse
     */
    CompletableFuture<DescribeRecordLogsResponse> describeRecordLogs(DescribeRecordLogsRequest request);

    /**
     * @param request the request parameters of DescribeRecordResolveStatisticsSummary  DescribeRecordResolveStatisticsSummaryRequest
     * @return DescribeRecordResolveStatisticsSummaryResponse
     */
    CompletableFuture<DescribeRecordResolveStatisticsSummaryResponse> describeRecordResolveStatisticsSummary(DescribeRecordResolveStatisticsSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>Real-time data is collected per hour.</p>
     * 
     * @param request the request parameters of DescribeRecordStatistics  DescribeRecordStatisticsRequest
     * @return DescribeRecordStatisticsResponse
     */
    CompletableFuture<DescribeRecordStatisticsResponse> describeRecordStatistics(DescribeRecordStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeRecordStatisticsSummary  DescribeRecordStatisticsSummaryRequest
     * @return DescribeRecordStatisticsSummaryResponse
     */
    CompletableFuture<DescribeRecordStatisticsSummaryResponse> describeRecordStatisticsSummary(DescribeRecordStatisticsSummaryRequest request);

    /**
     * @param request the request parameters of DescribeSubDomainRecords  DescribeSubDomainRecordsRequest
     * @return DescribeSubDomainRecordsResponse
     */
    CompletableFuture<DescribeSubDomainRecordsResponse> describeSubDomainRecords(DescribeSubDomainRecordsRequest request);

    /**
     * @param request the request parameters of DescribeSupportLines  DescribeSupportLinesRequest
     * @return DescribeSupportLinesResponse
     */
    CompletableFuture<DescribeSupportLinesResponse> describeSupportLines(DescribeSupportLinesRequest request);

    /**
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
     * @param request the request parameters of DescribeTransferDomains  DescribeTransferDomainsRequest
     * @return DescribeTransferDomainsResponse
     */
    CompletableFuture<DescribeTransferDomainsResponse> describeTransferDomains(DescribeTransferDomainsRequest request);

    /**
     * @param request the request parameters of ExecuteGtmRecoveryPlan  ExecuteGtmRecoveryPlanRequest
     * @return ExecuteGtmRecoveryPlanResponse
     */
    CompletableFuture<ExecuteGtmRecoveryPlanResponse> executeGtmRecoveryPlan(ExecuteGtmRecoveryPlanRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the difference between primary domain names and subdomain names, see
     * <a href="https://www.alibabacloud.com/help/zh/faq-detail/39803.htm">Subdomain levels</a>. For example, if you enter <code>www.abc.com</code>, abc.com is obtained.</p>
     * 
     * @param request the request parameters of GetMainDomainName  GetMainDomainNameRequest
     * @return GetMainDomainNameResponse
     */
    CompletableFuture<GetMainDomainNameResponse> getMainDomainName(GetMainDomainNameRequest request);

    /**
     * @param request the request parameters of GetTxtRecordForVerify  GetTxtRecordForVerifyRequest
     * @return GetTxtRecordForVerifyResponse
     */
    CompletableFuture<GetTxtRecordForVerifyResponse> getTxtRecordForVerify(GetTxtRecordForVerifyRequest request);

    /**
     * @param request the request parameters of ListCloudGtmAddressPools  ListCloudGtmAddressPoolsRequest
     * @return ListCloudGtmAddressPoolsResponse
     */
    CompletableFuture<ListCloudGtmAddressPoolsResponse> listCloudGtmAddressPools(ListCloudGtmAddressPoolsRequest request);

    /**
     * @param request the request parameters of ListCloudGtmAddresses  ListCloudGtmAddressesRequest
     * @return ListCloudGtmAddressesResponse
     */
    CompletableFuture<ListCloudGtmAddressesResponse> listCloudGtmAddresses(ListCloudGtmAddressesRequest request);

    /**
     * @param request the request parameters of ListCloudGtmAlertLogs  ListCloudGtmAlertLogsRequest
     * @return ListCloudGtmAlertLogsResponse
     */
    CompletableFuture<ListCloudGtmAlertLogsResponse> listCloudGtmAlertLogs(ListCloudGtmAlertLogsRequest request);

    /**
     * @param request the request parameters of ListCloudGtmAvailableAlertGroups  ListCloudGtmAvailableAlertGroupsRequest
     * @return ListCloudGtmAvailableAlertGroupsResponse
     */
    CompletableFuture<ListCloudGtmAvailableAlertGroupsResponse> listCloudGtmAvailableAlertGroups(ListCloudGtmAvailableAlertGroupsRequest request);

    /**
     * @param request the request parameters of ListCloudGtmInstanceConfigs  ListCloudGtmInstanceConfigsRequest
     * @return ListCloudGtmInstanceConfigsResponse
     */
    CompletableFuture<ListCloudGtmInstanceConfigsResponse> listCloudGtmInstanceConfigs(ListCloudGtmInstanceConfigsRequest request);

    /**
     * @param request the request parameters of ListCloudGtmInstances  ListCloudGtmInstancesRequest
     * @return ListCloudGtmInstancesResponse
     */
    CompletableFuture<ListCloudGtmInstancesResponse> listCloudGtmInstances(ListCloudGtmInstancesRequest request);

    /**
     * @param request the request parameters of ListCloudGtmMonitorNodes  ListCloudGtmMonitorNodesRequest
     * @return ListCloudGtmMonitorNodesResponse
     */
    CompletableFuture<ListCloudGtmMonitorNodesResponse> listCloudGtmMonitorNodes(ListCloudGtmMonitorNodesRequest request);

    /**
     * @param request the request parameters of ListCloudGtmMonitorTemplates  ListCloudGtmMonitorTemplatesRequest
     * @return ListCloudGtmMonitorTemplatesResponse
     */
    CompletableFuture<ListCloudGtmMonitorTemplatesResponse> listCloudGtmMonitorTemplates(ListCloudGtmMonitorTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>  Set ResourceId.N or Tag.N that consists of Tag.N.Key and Tag.N.Value in the request to specify the object to be queried.</p>
     * <ul>
     * <li>Tag.N is a resource tag that consists of a key-value pair. If you set only Tag.N.Key, all tag values that are assigned to the specified key are returned. If you set only Tag.N.Value, an error message is returned.</li>
     * <li>If you set both Tag.N and ResourceId.N to filter tags, ResourceId.N must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>If the operation succeeds, the names of DNS servers change to those of Alibaba Cloud DNS servers (ending with hichina.com).</p>
     * <blockquote>
     * <p> **Before you call this operation, make sure that your domain name has been registered with Alibaba Cloud and the DNS servers in use are not Alibaba Cloud DNS servers.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyHichinaDomainDNS  ModifyHichinaDomainDNSRequest
     * @return ModifyHichinaDomainDNSResponse
     */
    CompletableFuture<ModifyHichinaDomainDNSResponse> modifyHichinaDomainDNS(ModifyHichinaDomainDNSRequest request);

    /**
     * @param request the request parameters of MoveDomainResourceGroup  MoveDomainResourceGroupRequest
     * @return MoveDomainResourceGroupResponse
     */
    CompletableFuture<MoveDomainResourceGroupResponse> moveDomainResourceGroup(MoveDomainResourceGroupRequest request);

    /**
     * @param request the request parameters of MoveGtmResourceGroup  MoveGtmResourceGroupRequest
     * @return MoveGtmResourceGroupResponse
     */
    CompletableFuture<MoveGtmResourceGroupResponse> moveGtmResourceGroup(MoveGtmResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Scenario: You need to execute a large number of tasks related to DNS resolution and you do not have high requirements for efficiency.</p>
     * 
     * @param request the request parameters of OperateBatchDomain  OperateBatchDomainRequest
     * @return OperateBatchDomainResponse
     */
    CompletableFuture<OperateBatchDomainResponse> operateBatchDomain(OperateBatchDomainRequest request);

    /**
     * @param request the request parameters of PausePdnsService  PausePdnsServiceRequest
     * @return PausePdnsServiceResponse
     */
    CompletableFuture<PausePdnsServiceResponse> pausePdnsService(PausePdnsServiceRequest request);

    /**
     * @param request the request parameters of PreviewGtmRecoveryPlan  PreviewGtmRecoveryPlanRequest
     * @return PreviewGtmRecoveryPlanResponse
     */
    CompletableFuture<PreviewGtmRecoveryPlanResponse> previewGtmRecoveryPlan(PreviewGtmRecoveryPlanRequest request);

    /**
     * @param request the request parameters of RemovePdnsAppKey  RemovePdnsAppKeyRequest
     * @return RemovePdnsAppKeyResponse
     */
    CompletableFuture<RemovePdnsAppKeyResponse> removePdnsAppKey(RemovePdnsAppKeyRequest request);

    /**
     * @param request the request parameters of RemovePdnsUdpIpSegment  RemovePdnsUdpIpSegmentRequest
     * @return RemovePdnsUdpIpSegmentResponse
     */
    CompletableFuture<RemovePdnsUdpIpSegmentResponse> removePdnsUdpIpSegment(RemovePdnsUdpIpSegmentRequest request);

    /**
     * @param request the request parameters of ReplaceCloudGtmAddressPoolAddress  ReplaceCloudGtmAddressPoolAddressRequest
     * @return ReplaceCloudGtmAddressPoolAddressResponse
     */
    CompletableFuture<ReplaceCloudGtmAddressPoolAddressResponse> replaceCloudGtmAddressPoolAddress(ReplaceCloudGtmAddressPoolAddressRequest request);

    /**
     * @param request the request parameters of ReplaceCloudGtmInstanceConfigAddressPool  ReplaceCloudGtmInstanceConfigAddressPoolRequest
     * @return ReplaceCloudGtmInstanceConfigAddressPoolResponse
     */
    CompletableFuture<ReplaceCloudGtmInstanceConfigAddressPoolResponse> replaceCloudGtmInstanceConfigAddressPool(ReplaceCloudGtmInstanceConfigAddressPoolRequest request);

    /**
     * @param request the request parameters of ResumePdnsService  ResumePdnsServiceRequest
     * @return ResumePdnsServiceResponse
     */
    CompletableFuture<ResumePdnsServiceResponse> resumePdnsService(ResumePdnsServiceRequest request);

    /**
     * <b>description</b> :
     * <p>To retrieve a domain name, you must verify a text (TXT) record. Therefore, before you call this API operation to retrieve a domain name, call the <a href="https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/generating-a-txt-record">GetTxtRecordForVerify</a> operation to generate a TXT record.</p>
     * 
     * @param request the request parameters of RetrieveDomain  RetrieveDomainRequest
     * @return RetrieveDomainResponse
     */
    CompletableFuture<RetrieveDomainResponse> retrieveDomain(RetrieveDomainRequest request);

    /**
     * @param request the request parameters of RollbackGtmRecoveryPlan  RollbackGtmRecoveryPlanRequest
     * @return RollbackGtmRecoveryPlanResponse
     */
    CompletableFuture<RollbackGtmRecoveryPlanResponse> rollbackGtmRecoveryPlan(RollbackGtmRecoveryPlanRequest request);

    /**
     * @param request the request parameters of SearchCloudGtmAddressPools  SearchCloudGtmAddressPoolsRequest
     * @return SearchCloudGtmAddressPoolsResponse
     */
    CompletableFuture<SearchCloudGtmAddressPoolsResponse> searchCloudGtmAddressPools(SearchCloudGtmAddressPoolsRequest request);

    /**
     * @param request the request parameters of SearchCloudGtmAddresses  SearchCloudGtmAddressesRequest
     * @return SearchCloudGtmAddressesResponse
     */
    CompletableFuture<SearchCloudGtmAddressesResponse> searchCloudGtmAddresses(SearchCloudGtmAddressesRequest request);

    /**
     * @param request the request parameters of SearchCloudGtmInstanceConfigs  SearchCloudGtmInstanceConfigsRequest
     * @return SearchCloudGtmInstanceConfigsResponse
     */
    CompletableFuture<SearchCloudGtmInstanceConfigsResponse> searchCloudGtmInstanceConfigs(SearchCloudGtmInstanceConfigsRequest request);

    /**
     * @param request the request parameters of SearchCloudGtmInstances  SearchCloudGtmInstancesRequest
     * @return SearchCloudGtmInstancesResponse
     */
    CompletableFuture<SearchCloudGtmInstancesResponse> searchCloudGtmInstances(SearchCloudGtmInstancesRequest request);

    /**
     * @param request the request parameters of SearchCloudGtmMonitorTemplates  SearchCloudGtmMonitorTemplatesRequest
     * @return SearchCloudGtmMonitorTemplatesResponse
     */
    CompletableFuture<SearchCloudGtmMonitorTemplatesResponse> searchCloudGtmMonitorTemplates(SearchCloudGtmMonitorTemplatesRequest request);

    /**
     * @param request the request parameters of SetDNSSLBStatus  SetDNSSLBStatusRequest
     * @return SetDNSSLBStatusResponse
     */
    CompletableFuture<SetDNSSLBStatusResponse> setDNSSLBStatus(SetDNSSLBStatusRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of SetDnsGtmAccessMode  SetDnsGtmAccessModeRequest
     * @return SetDnsGtmAccessModeResponse
     */
    CompletableFuture<SetDnsGtmAccessModeResponse> setDnsGtmAccessMode(SetDnsGtmAccessModeRequest request);

    /**
     * @param request the request parameters of SetDnsGtmMonitorStatus  SetDnsGtmMonitorStatusRequest
     * @return SetDnsGtmMonitorStatusResponse
     */
    CompletableFuture<SetDnsGtmMonitorStatusResponse> setDnsGtmMonitorStatus(SetDnsGtmMonitorStatusRequest request);

    /**
     * @param request the request parameters of SetDomainDnssecStatus  SetDomainDnssecStatusRequest
     * @return SetDomainDnssecStatusResponse
     */
    CompletableFuture<SetDomainDnssecStatusResponse> setDomainDnssecStatus(SetDomainDnssecStatusRequest request);

    /**
     * @param request the request parameters of SetDomainRecordStatus  SetDomainRecordStatusRequest
     * @return SetDomainRecordStatusResponse
     */
    CompletableFuture<SetDomainRecordStatusResponse> setDomainRecordStatus(SetDomainRecordStatusRequest request);

    /**
     * @param request the request parameters of SetGtmAccessMode  SetGtmAccessModeRequest
     * @return SetGtmAccessModeResponse
     */
    CompletableFuture<SetGtmAccessModeResponse> setGtmAccessMode(SetGtmAccessModeRequest request);

    /**
     * @param request the request parameters of SetGtmMonitorStatus  SetGtmMonitorStatusRequest
     * @return SetGtmMonitorStatusResponse
     */
    CompletableFuture<SetGtmMonitorStatusResponse> setGtmMonitorStatus(SetGtmMonitorStatusRequest request);

    /**
     * @param request the request parameters of SubmitIspFlushCacheTask  SubmitIspFlushCacheTaskRequest
     * @return SubmitIspFlushCacheTaskResponse
     */
    CompletableFuture<SubmitIspFlushCacheTaskResponse> submitIspFlushCacheTask(SubmitIspFlushCacheTaskRequest request);

    /**
     * @param request the request parameters of SwitchDnsGtmInstanceStrategyMode  SwitchDnsGtmInstanceStrategyModeRequest
     * @return SwitchDnsGtmInstanceStrategyModeResponse
     */
    CompletableFuture<SwitchDnsGtmInstanceStrategyModeResponse> switchDnsGtmInstanceStrategyMode(SwitchDnsGtmInstanceStrategyModeRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of TransferDomain  TransferDomainRequest
     * @return TransferDomainResponse
     */
    CompletableFuture<TransferDomainResponse> transferDomain(TransferDomainRequest request);

    /**
     * <b>description</b> :
     * <p>A paid Alibaba Cloud DNS instance whose ID starts with dns is an instance of the new version. You can call an API operation to bind multiple domain names to the instance. If the upper limit is exceeded, an error message is returned.\
     * A paid Alibaba Cloud DNS instance whose ID does not start with dns is an instance of the old version. You can call an API operation to bind only one domain name to the instance. However, if the instance that you want to bind to the desired domain name is already bound to a domain name, you can call this operation to unbind the original domain name from the instance and then bind the desired domain name to the instance.</p>
     * 
     * @param request the request parameters of UnbindInstanceDomains  UnbindInstanceDomainsRequest
     * @return UnbindInstanceDomainsResponse
     */
    CompletableFuture<UnbindInstanceDomainsResponse> unbindInstanceDomains(UnbindInstanceDomainsRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateAppKeyState  UpdateAppKeyStateRequest
     * @return UpdateAppKeyStateResponse
     */
    CompletableFuture<UpdateAppKeyStateResponse> updateAppKeyState(UpdateAppKeyStateRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmAddress  UpdateCloudGtmAddressRequest
     * @return UpdateCloudGtmAddressResponse
     */
    CompletableFuture<UpdateCloudGtmAddressResponse> updateCloudGtmAddress(UpdateCloudGtmAddressRequest request);

    /**
     * <b>description</b> :
     * <p>  If an address is <strong>enabled</strong> and the health status of the address is <strong>Normal</strong>, the availability status of the address is <strong>Available</strong>.</p>
     * <ul>
     * <li>If an address is <strong>disabled</strong> or the health status of the address is <strong>Abnormal</strong>, the availability status of the address is <strong>Unavailable</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateCloudGtmAddressEnableStatus  UpdateCloudGtmAddressEnableStatusRequest
     * @return UpdateCloudGtmAddressEnableStatusResponse
     */
    CompletableFuture<UpdateCloudGtmAddressEnableStatusResponse> updateCloudGtmAddressEnableStatus(UpdateCloudGtmAddressEnableStatusRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmAddressManualAvailableStatus  UpdateCloudGtmAddressManualAvailableStatusRequest
     * @return UpdateCloudGtmAddressManualAvailableStatusResponse
     */
    CompletableFuture<UpdateCloudGtmAddressManualAvailableStatusResponse> updateCloudGtmAddressManualAvailableStatus(UpdateCloudGtmAddressManualAvailableStatusRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmAddressPoolBasicConfig  UpdateCloudGtmAddressPoolBasicConfigRequest
     * @return UpdateCloudGtmAddressPoolBasicConfigResponse
     */
    CompletableFuture<UpdateCloudGtmAddressPoolBasicConfigResponse> updateCloudGtmAddressPoolBasicConfig(UpdateCloudGtmAddressPoolBasicConfigRequest request);

    /**
     * <b>description</b> :
     * <p>  If an address pool is <strong>enabled</strong> and the health status of the address pool is <strong>Normal</strong>, the availability status of the address pool is <strong>Available</strong>.</p>
     * <ul>
     * <li>If an address pool is <strong>disabled</strong> or the health status of the address pool is <strong>Abnormal</strong>, the availability status of the address pool is <strong>unavailable</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateCloudGtmAddressPoolEnableStatus  UpdateCloudGtmAddressPoolEnableStatusRequest
     * @return UpdateCloudGtmAddressPoolEnableStatusResponse
     */
    CompletableFuture<UpdateCloudGtmAddressPoolEnableStatusResponse> updateCloudGtmAddressPoolEnableStatus(UpdateCloudGtmAddressPoolEnableStatusRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmAddressPoolLbStrategy  UpdateCloudGtmAddressPoolLbStrategyRequest
     * @return UpdateCloudGtmAddressPoolLbStrategyResponse
     */
    CompletableFuture<UpdateCloudGtmAddressPoolLbStrategyResponse> updateCloudGtmAddressPoolLbStrategy(UpdateCloudGtmAddressPoolLbStrategyRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmAddressPoolRemark  UpdateCloudGtmAddressPoolRemarkRequest
     * @return UpdateCloudGtmAddressPoolRemarkResponse
     */
    CompletableFuture<UpdateCloudGtmAddressPoolRemarkResponse> updateCloudGtmAddressPoolRemark(UpdateCloudGtmAddressPoolRemarkRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmAddressRemark  UpdateCloudGtmAddressRemarkRequest
     * @return UpdateCloudGtmAddressRemarkResponse
     */
    CompletableFuture<UpdateCloudGtmAddressRemarkResponse> updateCloudGtmAddressRemark(UpdateCloudGtmAddressRemarkRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmGlobalAlert  UpdateCloudGtmGlobalAlertRequest
     * @return UpdateCloudGtmGlobalAlertResponse
     */
    CompletableFuture<UpdateCloudGtmGlobalAlertResponse> updateCloudGtmGlobalAlert(UpdateCloudGtmGlobalAlertRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmInstanceConfigAlert  UpdateCloudGtmInstanceConfigAlertRequest
     * @return UpdateCloudGtmInstanceConfigAlertResponse
     */
    CompletableFuture<UpdateCloudGtmInstanceConfigAlertResponse> updateCloudGtmInstanceConfigAlert(UpdateCloudGtmInstanceConfigAlertRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmInstanceConfigBasic  UpdateCloudGtmInstanceConfigBasicRequest
     * @return UpdateCloudGtmInstanceConfigBasicResponse
     */
    CompletableFuture<UpdateCloudGtmInstanceConfigBasicResponse> updateCloudGtmInstanceConfigBasic(UpdateCloudGtmInstanceConfigBasicRequest request);

    /**
     * <b>description</b> :
     * <p>  If an access domain name is <strong>enabled</strong> and the health state is <strong>normal</strong>, the access domain name is deemed <strong>available</strong>.</p>
     * <ul>
     * <li>If an access domain name is <strong>disabled</strong> or the health state is <strong>abnormal</strong>, the access domain name is deemed <strong>unavailable</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateCloudGtmInstanceConfigEnableStatus  UpdateCloudGtmInstanceConfigEnableStatusRequest
     * @return UpdateCloudGtmInstanceConfigEnableStatusResponse
     */
    CompletableFuture<UpdateCloudGtmInstanceConfigEnableStatusResponse> updateCloudGtmInstanceConfigEnableStatus(UpdateCloudGtmInstanceConfigEnableStatusRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmInstanceConfigLbStrategy  UpdateCloudGtmInstanceConfigLbStrategyRequest
     * @return UpdateCloudGtmInstanceConfigLbStrategyResponse
     */
    CompletableFuture<UpdateCloudGtmInstanceConfigLbStrategyResponse> updateCloudGtmInstanceConfigLbStrategy(UpdateCloudGtmInstanceConfigLbStrategyRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmInstanceConfigRemark  UpdateCloudGtmInstanceConfigRemarkRequest
     * @return UpdateCloudGtmInstanceConfigRemarkResponse
     */
    CompletableFuture<UpdateCloudGtmInstanceConfigRemarkResponse> updateCloudGtmInstanceConfigRemark(UpdateCloudGtmInstanceConfigRemarkRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmInstanceName  UpdateCloudGtmInstanceNameRequest
     * @return UpdateCloudGtmInstanceNameResponse
     */
    CompletableFuture<UpdateCloudGtmInstanceNameResponse> updateCloudGtmInstanceName(UpdateCloudGtmInstanceNameRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmMonitorTemplate  UpdateCloudGtmMonitorTemplateRequest
     * @return UpdateCloudGtmMonitorTemplateResponse
     */
    CompletableFuture<UpdateCloudGtmMonitorTemplateResponse> updateCloudGtmMonitorTemplate(UpdateCloudGtmMonitorTemplateRequest request);

    /**
     * @param request the request parameters of UpdateCloudGtmMonitorTemplateRemark  UpdateCloudGtmMonitorTemplateRemarkRequest
     * @return UpdateCloudGtmMonitorTemplateRemarkResponse
     */
    CompletableFuture<UpdateCloudGtmMonitorTemplateRemarkResponse> updateCloudGtmMonitorTemplateRemark(UpdateCloudGtmMonitorTemplateRemarkRequest request);

    /**
     * <b>description</b> :
     * <p>In each CIDR block, the end IP address must be greater than or equal to the start IP address.\
     * The CIDR blocks that are specified for all custom lines of a domain name cannot be overlapped.</p>
     * 
     * @param request the request parameters of UpdateCustomLine  UpdateCustomLineRequest
     * @return UpdateCustomLineResponse
     */
    CompletableFuture<UpdateCustomLineResponse> updateCustomLine(UpdateCustomLineRequest request);

    /**
     * @param request the request parameters of UpdateDNSSLBWeight  UpdateDNSSLBWeightRequest
     * @return UpdateDNSSLBWeightResponse
     */
    CompletableFuture<UpdateDNSSLBWeightResponse> updateDNSSLBWeight(UpdateDNSSLBWeightRequest request);

    /**
     * @param request the request parameters of UpdateDnsCacheDomain  UpdateDnsCacheDomainRequest
     * @return UpdateDnsCacheDomainResponse
     */
    CompletableFuture<UpdateDnsCacheDomainResponse> updateDnsCacheDomain(UpdateDnsCacheDomainRequest request);

    /**
     * @param request the request parameters of UpdateDnsCacheDomainRemark  UpdateDnsCacheDomainRemarkRequest
     * @return UpdateDnsCacheDomainRemarkResponse
     */
    CompletableFuture<UpdateDnsCacheDomainRemarkResponse> updateDnsCacheDomainRemark(UpdateDnsCacheDomainRemarkRequest request);

    /**
     * @param request the request parameters of UpdateDnsGtmAccessStrategy  UpdateDnsGtmAccessStrategyRequest
     * @return UpdateDnsGtmAccessStrategyResponse
     */
    CompletableFuture<UpdateDnsGtmAccessStrategyResponse> updateDnsGtmAccessStrategy(UpdateDnsGtmAccessStrategyRequest request);

    /**
     * @param request the request parameters of UpdateDnsGtmAddressPool  UpdateDnsGtmAddressPoolRequest
     * @return UpdateDnsGtmAddressPoolResponse
     */
    CompletableFuture<UpdateDnsGtmAddressPoolResponse> updateDnsGtmAddressPool(UpdateDnsGtmAddressPoolRequest request);

    /**
     * @param request the request parameters of UpdateDnsGtmInstanceGlobalConfig  UpdateDnsGtmInstanceGlobalConfigRequest
     * @return UpdateDnsGtmInstanceGlobalConfigResponse
     */
    CompletableFuture<UpdateDnsGtmInstanceGlobalConfigResponse> updateDnsGtmInstanceGlobalConfig(UpdateDnsGtmInstanceGlobalConfigRequest request);

    /**
     * @param request the request parameters of UpdateDnsGtmMonitor  UpdateDnsGtmMonitorRequest
     * @return UpdateDnsGtmMonitorResponse
     */
    CompletableFuture<UpdateDnsGtmMonitorResponse> updateDnsGtmMonitor(UpdateDnsGtmMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the name of an existing domain name group.</p>
     * 
     * @param request the request parameters of UpdateDomainGroup  UpdateDomainGroupRequest
     * @return UpdateDomainGroupResponse
     */
    CompletableFuture<UpdateDomainGroupResponse> updateDomainGroup(UpdateDomainGroupRequest request);

    /**
     * @param request the request parameters of UpdateDomainRecord  UpdateDomainRecordRequest
     * @return UpdateDomainRecordResponse
     */
    CompletableFuture<UpdateDomainRecordResponse> updateDomainRecord(UpdateDomainRecordRequest request);

    /**
     * @param request the request parameters of UpdateDomainRecordRemark  UpdateDomainRecordRemarkRequest
     * @return UpdateDomainRecordRemarkResponse
     */
    CompletableFuture<UpdateDomainRecordRemarkResponse> updateDomainRecordRemark(UpdateDomainRecordRemarkRequest request);

    /**
     * @param request the request parameters of UpdateDomainRemark  UpdateDomainRemarkRequest
     * @return UpdateDomainRemarkResponse
     */
    CompletableFuture<UpdateDomainRemarkResponse> updateDomainRemark(UpdateDomainRemarkRequest request);

    /**
     * @param request the request parameters of UpdateGtmAccessStrategy  UpdateGtmAccessStrategyRequest
     * @return UpdateGtmAccessStrategyResponse
     */
    CompletableFuture<UpdateGtmAccessStrategyResponse> updateGtmAccessStrategy(UpdateGtmAccessStrategyRequest request);

    /**
     * @param request the request parameters of UpdateGtmAddressPool  UpdateGtmAddressPoolRequest
     * @return UpdateGtmAddressPoolResponse
     */
    CompletableFuture<UpdateGtmAddressPoolResponse> updateGtmAddressPool(UpdateGtmAddressPoolRequest request);

    /**
     * @param request the request parameters of UpdateGtmInstanceGlobalConfig  UpdateGtmInstanceGlobalConfigRequest
     * @return UpdateGtmInstanceGlobalConfigResponse
     */
    CompletableFuture<UpdateGtmInstanceGlobalConfigResponse> updateGtmInstanceGlobalConfig(UpdateGtmInstanceGlobalConfigRequest request);

    /**
     * @param request the request parameters of UpdateGtmMonitor  UpdateGtmMonitorRequest
     * @return UpdateGtmMonitorResponse
     */
    CompletableFuture<UpdateGtmMonitorResponse> updateGtmMonitor(UpdateGtmMonitorRequest request);

    /**
     * @param request the request parameters of UpdateGtmRecoveryPlan  UpdateGtmRecoveryPlanRequest
     * @return UpdateGtmRecoveryPlanResponse
     */
    CompletableFuture<UpdateGtmRecoveryPlanResponse> updateGtmRecoveryPlan(UpdateGtmRecoveryPlanRequest request);

    /**
     * @param request the request parameters of UpdateIspFlushCacheInstanceConfig  UpdateIspFlushCacheInstanceConfigRequest
     * @return UpdateIspFlushCacheInstanceConfigResponse
     */
    CompletableFuture<UpdateIspFlushCacheInstanceConfigResponse> updateIspFlushCacheInstanceConfig(UpdateIspFlushCacheInstanceConfigRequest request);

    /**
     * @param request the request parameters of ValidateDnsGtmCnameRrCanUse  ValidateDnsGtmCnameRrCanUseRequest
     * @return ValidateDnsGtmCnameRrCanUseResponse
     */
    CompletableFuture<ValidateDnsGtmCnameRrCanUseResponse> validateDnsGtmCnameRrCanUse(ValidateDnsGtmCnameRrCanUseRequest request);

    /**
     * @param request the request parameters of ValidatePdnsUdpIpSegment  ValidatePdnsUdpIpSegmentRequest
     * @return ValidatePdnsUdpIpSegmentResponse
     */
    CompletableFuture<ValidatePdnsUdpIpSegmentResponse> validatePdnsUdpIpSegment(ValidatePdnsUdpIpSegmentRequest request);

}
