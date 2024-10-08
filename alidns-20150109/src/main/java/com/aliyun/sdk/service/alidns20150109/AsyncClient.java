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
     */
    CompletableFuture<AddCustomLineResponse> addCustomLine(AddCustomLineRequest request);

    CompletableFuture<AddDnsCacheDomainResponse> addDnsCacheDomain(AddDnsCacheDomainRequest request);

    CompletableFuture<AddDnsGtmAccessStrategyResponse> addDnsGtmAccessStrategy(AddDnsGtmAccessStrategyRequest request);

    CompletableFuture<AddDnsGtmAddressPoolResponse> addDnsGtmAddressPool(AddDnsGtmAddressPoolRequest request);

    /**
     * <b>description</b> :
     * <hr>
     */
    CompletableFuture<AddDnsGtmMonitorResponse> addDnsGtmMonitor(AddDnsGtmMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about how to check whether a domain name is valid, see
     * <a href="https://www.alibabacloud.com/help/zh/doc-detail/67788.htm">Domain name validity</a>.</p>
     */
    CompletableFuture<AddDomainResponse> addDomain(AddDomainRequest request);

    CompletableFuture<AddDomainBackupResponse> addDomainBackup(AddDomainBackupRequest request);

    CompletableFuture<AddDomainGroupResponse> addDomainGroup(AddDomainGroupRequest request);

    CompletableFuture<AddDomainRecordResponse> addDomainRecord(AddDomainRecordRequest request);

    CompletableFuture<AddGtmAccessStrategyResponse> addGtmAccessStrategy(AddGtmAccessStrategyRequest request);

    CompletableFuture<AddGtmAddressPoolResponse> addGtmAddressPool(AddGtmAddressPoolRequest request);

    CompletableFuture<AddGtmMonitorResponse> addGtmMonitor(AddGtmMonitorRequest request);

    CompletableFuture<AddGtmRecoveryPlanResponse> addGtmRecoveryPlan(AddGtmRecoveryPlanRequest request);

    /**
     * <b>description</b> :
     * <p>A paid Alibaba Cloud DNS instance whose ID starts with dns is an instance of the new version. You can call this API operation to bind multiple domain names to the instance. If the upper limit is exceeded, an error message is returned.\
     * A paid Alibaba Cloud DNS instance whose ID does not start with dns is an instance of the old version. You can call this API operation to bind only one domain name to the instance. However, if the instance is already bound to a domain name, you must unbind the original domain name from the instance and bind the desired domain name to the instance.</p>
     */
    CompletableFuture<BindInstanceDomainsResponse> bindInstanceDomains(BindInstanceDomainsRequest request);

    /**
     * <b>description</b> :
     * <p>You can specify GroupId to move a domain name to a specific domain name group. You can move the domain name to the group that contains all domain names or the default group.</p>
     */
    CompletableFuture<ChangeDomainGroupResponse> changeDomainGroup(ChangeDomainGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>You can call this operation regardless of whether the Alibaba Cloud DNS instance is bound to a domain name. You can also call this operation to unbind the domain name from the Alibaba Cloud DNS instance by leaving the NewDomain parameter empty.</strong></li>
     * <li>**This operation applies to instances of the custom edition. To change the domain name that is bound to an Alibaba Cloud DNS instance of Personal Edition, Enterprise Standard Edition, or Enterprise Ultimate Edition, call the BindInstanceDomains operation.</li>
     * </ul>
     */
    CompletableFuture<ChangeDomainOfDnsProductResponse> changeDomainOfDnsProduct(ChangeDomainOfDnsProductRequest request);

    CompletableFuture<CopyGtmConfigResponse> copyGtmConfig(CopyGtmConfigRequest request);

    CompletableFuture<CreateCloudGtmAddressResponse> createCloudGtmAddress(CreateCloudGtmAddressRequest request);

    CompletableFuture<CreateCloudGtmAddressPoolResponse> createCloudGtmAddressPool(CreateCloudGtmAddressPoolRequest request);

    CompletableFuture<CreateCloudGtmInstanceConfigResponse> createCloudGtmInstanceConfig(CreateCloudGtmInstanceConfigRequest request);

    CompletableFuture<CreateCloudGtmMonitorTemplateResponse> createCloudGtmMonitorTemplate(CreateCloudGtmMonitorTemplateRequest request);

    CompletableFuture<CreatePdnsAppKeyResponse> createPdnsAppKey(CreatePdnsAppKeyRequest request);

    CompletableFuture<CreatePdnsUdpIpSegmentResponse> createPdnsUdpIpSegment(CreatePdnsUdpIpSegmentRequest request);

    CompletableFuture<DeleteCloudGtmAddressResponse> deleteCloudGtmAddress(DeleteCloudGtmAddressRequest request);

    CompletableFuture<DeleteCloudGtmAddressPoolResponse> deleteCloudGtmAddressPool(DeleteCloudGtmAddressPoolRequest request);

    CompletableFuture<DeleteCloudGtmInstanceConfigResponse> deleteCloudGtmInstanceConfig(DeleteCloudGtmInstanceConfigRequest request);

    CompletableFuture<DeleteCloudGtmMonitorTemplateResponse> deleteCloudGtmMonitorTemplate(DeleteCloudGtmMonitorTemplateRequest request);

    CompletableFuture<DeleteCustomLinesResponse> deleteCustomLines(DeleteCustomLinesRequest request);

    CompletableFuture<DeleteDnsCacheDomainResponse> deleteDnsCacheDomain(DeleteDnsCacheDomainRequest request);

    CompletableFuture<DeleteDnsGtmAccessStrategyResponse> deleteDnsGtmAccessStrategy(DeleteDnsGtmAccessStrategyRequest request);

    CompletableFuture<DeleteDnsGtmAddressPoolResponse> deleteDnsGtmAddressPool(DeleteDnsGtmAddressPoolRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The default group cannot be deleted.</p>
     * </blockquote>
     */
    CompletableFuture<DeleteDomainGroupResponse> deleteDomainGroup(DeleteDomainGroupRequest request);

    CompletableFuture<DeleteDomainRecordResponse> deleteDomainRecord(DeleteDomainRecordRequest request);

    CompletableFuture<DeleteGtmAccessStrategyResponse> deleteGtmAccessStrategy(DeleteGtmAccessStrategyRequest request);

    CompletableFuture<DeleteGtmAddressPoolResponse> deleteGtmAddressPool(DeleteGtmAddressPoolRequest request);

    CompletableFuture<DeleteGtmRecoveryPlanResponse> deleteGtmRecoveryPlan(DeleteGtmRecoveryPlanRequest request);

    /**
     * <b>description</b> :
     * <p>If the DNS records to be deleted contain locked DNS records, locked DNS records will not be deleted.</p>
     */
    CompletableFuture<DeleteSubDomainRecordsResponse> deleteSubDomainRecords(DeleteSubDomainRecordsRequest request);

    CompletableFuture<DescribeBatchResultCountResponse> describeBatchResultCount(DescribeBatchResultCountRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the batch operation task is complete.</p>
     */
    CompletableFuture<DescribeBatchResultDetailResponse> describeBatchResultDetail(DescribeBatchResultDetailRequest request);

    CompletableFuture<DescribeCloudGtmAddressResponse> describeCloudGtmAddress(DescribeCloudGtmAddressRequest request);

    CompletableFuture<DescribeCloudGtmAddressPoolResponse> describeCloudGtmAddressPool(DescribeCloudGtmAddressPoolRequest request);

    CompletableFuture<DescribeCloudGtmAddressPoolReferenceResponse> describeCloudGtmAddressPoolReference(DescribeCloudGtmAddressPoolReferenceRequest request);

    CompletableFuture<DescribeCloudGtmAddressReferenceResponse> describeCloudGtmAddressReference(DescribeCloudGtmAddressReferenceRequest request);

    CompletableFuture<DescribeCloudGtmGlobalAlertResponse> describeCloudGtmGlobalAlert(DescribeCloudGtmGlobalAlertRequest request);

    CompletableFuture<DescribeCloudGtmInstanceConfigAlertResponse> describeCloudGtmInstanceConfigAlert(DescribeCloudGtmInstanceConfigAlertRequest request);

    CompletableFuture<DescribeCloudGtmInstanceConfigFullInfoResponse> describeCloudGtmInstanceConfigFullInfo(DescribeCloudGtmInstanceConfigFullInfoRequest request);

    CompletableFuture<DescribeCloudGtmMonitorTemplateResponse> describeCloudGtmMonitorTemplate(DescribeCloudGtmMonitorTemplateRequest request);

    CompletableFuture<DescribeCloudGtmSummaryResponse> describeCloudGtmSummary(DescribeCloudGtmSummaryRequest request);

    CompletableFuture<DescribeCloudGtmSystemLinesResponse> describeCloudGtmSystemLines(DescribeCloudGtmSystemLinesRequest request);

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

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If the response parameters of an Alibaba Cloud DNS instance do not contain domain names, no domain names are bound to the instance.</p>
     * </blockquote>
     */
    CompletableFuture<DescribeDnsProductInstancesResponse> describeDnsProductInstances(DescribeDnsProductInstancesRequest request);

    CompletableFuture<DescribeDohAccountStatisticsResponse> describeDohAccountStatistics(DescribeDohAccountStatisticsRequest request);

    CompletableFuture<DescribeDohDomainStatisticsResponse> describeDohDomainStatistics(DescribeDohDomainStatisticsRequest request);

    CompletableFuture<DescribeDohDomainStatisticsSummaryResponse> describeDohDomainStatisticsSummary(DescribeDohDomainStatisticsSummaryRequest request);

    CompletableFuture<DescribeDohSubDomainStatisticsResponse> describeDohSubDomainStatistics(DescribeDohSubDomainStatisticsRequest request);

    CompletableFuture<DescribeDohSubDomainStatisticsSummaryResponse> describeDohSubDomainStatisticsSummary(DescribeDohSubDomainStatisticsSummaryRequest request);

    CompletableFuture<DescribeDohUserInfoResponse> describeDohUserInfo(DescribeDohUserInfoRequest request);

    CompletableFuture<DescribeDomainDnssecInfoResponse> describeDomainDnssecInfo(DescribeDomainDnssecInfoRequest request);

    CompletableFuture<DescribeDomainGroupsResponse> describeDomainGroups(DescribeDomainGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>In this example, the domain name is bound to an instance of Alibaba Cloud DNS Enterprise Ultimate Edition. For more information about valid Domain Name System (DNS) request lines, see the return values of the RecordLines parameter.</p>
     */
    CompletableFuture<DescribeDomainInfoResponse> describeDomainInfo(DescribeDomainInfoRequest request);

    CompletableFuture<DescribeDomainLogsResponse> describeDomainLogs(DescribeDomainLogsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation to query the authoritative servers of a domain name registry to obtain the name servers for a domain name. If the domain name is in an invalid state, such as serverHold or clientHold, an error may be returned.</p>
     * </blockquote>
     */
    CompletableFuture<DescribeDomainNsResponse> describeDomainNs(DescribeDomainNsRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Alidns%5C&api=DescribeDomainRecordInfo%5C&type=RPC%5C&version=2015-01-09">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     */
    CompletableFuture<DescribeDomainRecordInfoResponse> describeDomainRecordInfo(DescribeDomainRecordInfoRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can specify DomainName, PageNumber, and PageSize to query the DNS records of the specified domain names.</li>
     * <li>You can also specify RRKeyWord, TypeKeyWord, or ValueKeyWord to query the DNS records that contain the specified keyword.</li>
     * <li>By default, the DNS records are sorted in reverse chronological order based on the time when they were added.</li>
     * <li>You can specify GroupId to query the DNS records of the specified domain names based on the group ID. You can query the DNS records of all domain names and the domain names in the default group.</li>
     * </ul>
     */
    CompletableFuture<DescribeDomainRecordsResponse> describeDomainRecords(DescribeDomainRecordsRequest request);

    CompletableFuture<DescribeDomainResolveStatisticsSummaryResponse> describeDomainResolveStatisticsSummary(DescribeDomainResolveStatisticsSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>Real-time data is collected per hour.</p>
     */
    CompletableFuture<DescribeDomainStatisticsResponse> describeDomainStatistics(DescribeDomainStatisticsRequest request);

    CompletableFuture<DescribeDomainStatisticsSummaryResponse> describeDomainStatisticsSummary(DescribeDomainStatisticsSummaryRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can specify the PageNumber and PageSize parameters to query domain names.</li>
     * <li>You can specify the KeyWord parameter to query domain names that contain the specified keyword.</li>
     * <li>By default, the domain names in a list are sorted in descending order of the time they were added.</li>
     * <li>You can specify the GroupId parameter. If you do not specify this parameter, all domain names are queried by default.</li>
     * </ul>
     */
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

    CompletableFuture<DescribeInternetDnsLogsResponse> describeInternetDnsLogs(DescribeInternetDnsLogsRequest request);

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

    CompletableFuture<DescribeRecordResolveStatisticsSummaryResponse> describeRecordResolveStatisticsSummary(DescribeRecordResolveStatisticsSummaryRequest request);

    /**
     * <b>description</b> :
     * <p>Real-time data is collected per hour.</p>
     */
    CompletableFuture<DescribeRecordStatisticsResponse> describeRecordStatistics(DescribeRecordStatisticsRequest request);

    CompletableFuture<DescribeRecordStatisticsSummaryResponse> describeRecordStatisticsSummary(DescribeRecordStatisticsSummaryRequest request);

    CompletableFuture<DescribeSubDomainRecordsResponse> describeSubDomainRecords(DescribeSubDomainRecordsRequest request);

    CompletableFuture<DescribeSupportLinesResponse> describeSupportLines(DescribeSupportLinesRequest request);

    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeTransferDomainsResponse> describeTransferDomains(DescribeTransferDomainsRequest request);

    CompletableFuture<ExecuteGtmRecoveryPlanResponse> executeGtmRecoveryPlan(ExecuteGtmRecoveryPlanRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the difference between primary domain names and subdomain names, see
     * <a href="https://www.alibabacloud.com/help/zh/faq-detail/39803.htm">Subdomain levels</a>. For example, if you enter <code>www.abc.com</code>, abc.com is obtained.</p>
     */
    CompletableFuture<GetMainDomainNameResponse> getMainDomainName(GetMainDomainNameRequest request);

    CompletableFuture<GetTxtRecordForVerifyResponse> getTxtRecordForVerify(GetTxtRecordForVerifyRequest request);

    CompletableFuture<ListCloudGtmAddressPoolsResponse> listCloudGtmAddressPools(ListCloudGtmAddressPoolsRequest request);

    CompletableFuture<ListCloudGtmAddressesResponse> listCloudGtmAddresses(ListCloudGtmAddressesRequest request);

    CompletableFuture<ListCloudGtmAlertLogsResponse> listCloudGtmAlertLogs(ListCloudGtmAlertLogsRequest request);

    CompletableFuture<ListCloudGtmAvailableAlertGroupsResponse> listCloudGtmAvailableAlertGroups(ListCloudGtmAvailableAlertGroupsRequest request);

    CompletableFuture<ListCloudGtmInstanceConfigsResponse> listCloudGtmInstanceConfigs(ListCloudGtmInstanceConfigsRequest request);

    CompletableFuture<ListCloudGtmInstancesResponse> listCloudGtmInstances(ListCloudGtmInstancesRequest request);

    CompletableFuture<ListCloudGtmMonitorNodesResponse> listCloudGtmMonitorNodes(ListCloudGtmMonitorNodesRequest request);

    CompletableFuture<ListCloudGtmMonitorTemplatesResponse> listCloudGtmMonitorTemplates(ListCloudGtmMonitorTemplatesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Set ResourceId.N or Tag.N that consists of Tag.N.Key and Tag.N.Value in the request to specify the object to be queried.</li>
     * <li>Tag.N is a resource tag that consists of a key-value pair. If you set only Tag.N.Key, all tag values that are assigned to the specified key are returned. If you set only Tag.N.Value, an error message is returned.</li>
     * <li>If you set both Tag.N and ResourceId.N to filter tags, ResourceId.N must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>If the operation succeeds, the names of DNS servers change to those of Alibaba Cloud DNS servers (ending with hichina.com).</p>
     * <blockquote>
     * <p> **Before you call this operation, make sure that your domain name has been registered with Alibaba Cloud and the DNS servers in use are not Alibaba Cloud DNS servers.</p>
     * </blockquote>
     */
    CompletableFuture<ModifyHichinaDomainDNSResponse> modifyHichinaDomainDNS(ModifyHichinaDomainDNSRequest request);

    CompletableFuture<MoveDomainResourceGroupResponse> moveDomainResourceGroup(MoveDomainResourceGroupRequest request);

    CompletableFuture<MoveGtmResourceGroupResponse> moveGtmResourceGroup(MoveGtmResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Scenario: You need to execute a large number of tasks related to DNS resolution and you do not have high requirements for efficiency.</p>
     */
    CompletableFuture<OperateBatchDomainResponse> operateBatchDomain(OperateBatchDomainRequest request);

    CompletableFuture<PausePdnsServiceResponse> pausePdnsService(PausePdnsServiceRequest request);

    CompletableFuture<PreviewGtmRecoveryPlanResponse> previewGtmRecoveryPlan(PreviewGtmRecoveryPlanRequest request);

    CompletableFuture<RemovePdnsAppKeyResponse> removePdnsAppKey(RemovePdnsAppKeyRequest request);

    CompletableFuture<RemovePdnsUdpIpSegmentResponse> removePdnsUdpIpSegment(RemovePdnsUdpIpSegmentRequest request);

    CompletableFuture<ReplaceCloudGtmAddressPoolAddressResponse> replaceCloudGtmAddressPoolAddress(ReplaceCloudGtmAddressPoolAddressRequest request);

    CompletableFuture<ReplaceCloudGtmInstanceConfigAddressPoolResponse> replaceCloudGtmInstanceConfigAddressPool(ReplaceCloudGtmInstanceConfigAddressPoolRequest request);

    CompletableFuture<ResumePdnsServiceResponse> resumePdnsService(ResumePdnsServiceRequest request);

    /**
     * <b>description</b> :
     * <p>To retrieve a domain name, you must verify a text (TXT) record. Therefore, before you call this API operation to retrieve a domain name, call the <a href="https://www.alibabacloud.com/help/en/alibaba-cloud-dns/latest/generating-a-txt-record">GetTxtRecordForVerify</a> operation to generate a TXT record.</p>
     */
    CompletableFuture<RetrieveDomainResponse> retrieveDomain(RetrieveDomainRequest request);

    CompletableFuture<RollbackGtmRecoveryPlanResponse> rollbackGtmRecoveryPlan(RollbackGtmRecoveryPlanRequest request);

    CompletableFuture<SearchCloudGtmAddressPoolsResponse> searchCloudGtmAddressPools(SearchCloudGtmAddressPoolsRequest request);

    CompletableFuture<SearchCloudGtmAddressesResponse> searchCloudGtmAddresses(SearchCloudGtmAddressesRequest request);

    CompletableFuture<SearchCloudGtmInstanceConfigsResponse> searchCloudGtmInstanceConfigs(SearchCloudGtmInstanceConfigsRequest request);

    CompletableFuture<SearchCloudGtmInstancesResponse> searchCloudGtmInstances(SearchCloudGtmInstancesRequest request);

    CompletableFuture<SearchCloudGtmMonitorTemplatesResponse> searchCloudGtmMonitorTemplates(SearchCloudGtmMonitorTemplatesRequest request);

    CompletableFuture<SetDNSSLBStatusResponse> setDNSSLBStatus(SetDNSSLBStatusRequest request);

    /**
     * <b>description</b> :
     * <hr>
     */
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

    /**
     * <b>description</b> :
     * <p>A paid Alibaba Cloud DNS instance whose ID starts with dns is an instance of the new version. You can call an API operation to bind multiple domain names to the instance. If the upper limit is exceeded, an error message is returned.\
     * A paid Alibaba Cloud DNS instance whose ID does not start with dns is an instance of the old version. You can call an API operation to bind only one domain name to the instance. However, if the instance that you want to bind to the desired domain name is already bound to a domain name, you can call this operation to unbind the original domain name from the instance and then bind the desired domain name to the instance.</p>
     */
    CompletableFuture<UnbindInstanceDomainsResponse> unbindInstanceDomains(UnbindInstanceDomainsRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateAppKeyStateResponse> updateAppKeyState(UpdateAppKeyStateRequest request);

    CompletableFuture<UpdateCloudGtmAddressResponse> updateCloudGtmAddress(UpdateCloudGtmAddressRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If an address is <strong>enabled</strong> and the health status of the address is <strong>Normal</strong>, the availability status of the address is <strong>Available</strong>.</li>
     * <li>If an address is <strong>disabled</strong> or the health status of the address is <strong>Abnormal</strong>, the availability status of the address is <strong>Unavailable</strong>.</li>
     * </ul>
     */
    CompletableFuture<UpdateCloudGtmAddressEnableStatusResponse> updateCloudGtmAddressEnableStatus(UpdateCloudGtmAddressEnableStatusRequest request);

    CompletableFuture<UpdateCloudGtmAddressManualAvailableStatusResponse> updateCloudGtmAddressManualAvailableStatus(UpdateCloudGtmAddressManualAvailableStatusRequest request);

    CompletableFuture<UpdateCloudGtmAddressPoolBasicConfigResponse> updateCloudGtmAddressPoolBasicConfig(UpdateCloudGtmAddressPoolBasicConfigRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If an address pool is <strong>enabled</strong> and the health status of the address pool is <strong>Normal</strong>, the availability status of the address pool is <strong>Available</strong>.</li>
     * <li>If an address pool is <strong>disabled</strong> or the health status of the address pool is <strong>Abnormal</strong>, the availability status of the address pool is <strong>unavailable</strong>.</li>
     * </ul>
     */
    CompletableFuture<UpdateCloudGtmAddressPoolEnableStatusResponse> updateCloudGtmAddressPoolEnableStatus(UpdateCloudGtmAddressPoolEnableStatusRequest request);

    CompletableFuture<UpdateCloudGtmAddressPoolLbStrategyResponse> updateCloudGtmAddressPoolLbStrategy(UpdateCloudGtmAddressPoolLbStrategyRequest request);

    CompletableFuture<UpdateCloudGtmAddressPoolRemarkResponse> updateCloudGtmAddressPoolRemark(UpdateCloudGtmAddressPoolRemarkRequest request);

    CompletableFuture<UpdateCloudGtmAddressRemarkResponse> updateCloudGtmAddressRemark(UpdateCloudGtmAddressRemarkRequest request);

    CompletableFuture<UpdateCloudGtmGlobalAlertResponse> updateCloudGtmGlobalAlert(UpdateCloudGtmGlobalAlertRequest request);

    CompletableFuture<UpdateCloudGtmInstanceConfigAlertResponse> updateCloudGtmInstanceConfigAlert(UpdateCloudGtmInstanceConfigAlertRequest request);

    CompletableFuture<UpdateCloudGtmInstanceConfigBasicResponse> updateCloudGtmInstanceConfigBasic(UpdateCloudGtmInstanceConfigBasicRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>If an access domain name is <strong>enabled</strong> and the health state is <strong>normal</strong>, the access domain name is deemed <strong>available</strong>.</li>
     * <li>If an access domain name is <strong>disabled</strong> or the health state is <strong>abnormal</strong>, the access domain name is deemed <strong>unavailable</strong>.</li>
     * </ul>
     */
    CompletableFuture<UpdateCloudGtmInstanceConfigEnableStatusResponse> updateCloudGtmInstanceConfigEnableStatus(UpdateCloudGtmInstanceConfigEnableStatusRequest request);

    CompletableFuture<UpdateCloudGtmInstanceConfigLbStrategyResponse> updateCloudGtmInstanceConfigLbStrategy(UpdateCloudGtmInstanceConfigLbStrategyRequest request);

    CompletableFuture<UpdateCloudGtmInstanceConfigRemarkResponse> updateCloudGtmInstanceConfigRemark(UpdateCloudGtmInstanceConfigRemarkRequest request);

    CompletableFuture<UpdateCloudGtmInstanceNameResponse> updateCloudGtmInstanceName(UpdateCloudGtmInstanceNameRequest request);

    CompletableFuture<UpdateCloudGtmMonitorTemplateResponse> updateCloudGtmMonitorTemplate(UpdateCloudGtmMonitorTemplateRequest request);

    CompletableFuture<UpdateCloudGtmMonitorTemplateRemarkResponse> updateCloudGtmMonitorTemplateRemark(UpdateCloudGtmMonitorTemplateRemarkRequest request);

    /**
     * <b>description</b> :
     * <p>In each CIDR block, the end IP address must be greater than or equal to the start IP address.\
     * The CIDR blocks that are specified for all custom lines of a domain name cannot be overlapped.</p>
     */
    CompletableFuture<UpdateCustomLineResponse> updateCustomLine(UpdateCustomLineRequest request);

    CompletableFuture<UpdateDNSSLBWeightResponse> updateDNSSLBWeight(UpdateDNSSLBWeightRequest request);

    CompletableFuture<UpdateDnsCacheDomainResponse> updateDnsCacheDomain(UpdateDnsCacheDomainRequest request);

    CompletableFuture<UpdateDnsCacheDomainRemarkResponse> updateDnsCacheDomainRemark(UpdateDnsCacheDomainRemarkRequest request);

    CompletableFuture<UpdateDnsGtmAccessStrategyResponse> updateDnsGtmAccessStrategy(UpdateDnsGtmAccessStrategyRequest request);

    CompletableFuture<UpdateDnsGtmAddressPoolResponse> updateDnsGtmAddressPool(UpdateDnsGtmAddressPoolRequest request);

    CompletableFuture<UpdateDnsGtmInstanceGlobalConfigResponse> updateDnsGtmInstanceGlobalConfig(UpdateDnsGtmInstanceGlobalConfigRequest request);

    CompletableFuture<UpdateDnsGtmMonitorResponse> updateDnsGtmMonitor(UpdateDnsGtmMonitorRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the name of an existing domain name group.</p>
     */
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

    CompletableFuture<ValidateDnsGtmCnameRrCanUseResponse> validateDnsGtmCnameRrCanUse(ValidateDnsGtmCnameRrCanUseRequest request);

    CompletableFuture<ValidatePdnsUdpIpSegmentResponse> validatePdnsUdpIpSegment(ValidatePdnsUdpIpSegmentRequest request);

}
