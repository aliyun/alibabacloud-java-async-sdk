// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.waf_openapi20211001.models.*;
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
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of ClearMajorProtectionBlackIp  ClearMajorProtectionBlackIpRequest
     * @return ClearMajorProtectionBlackIpResponse
     */
    CompletableFuture<ClearMajorProtectionBlackIpResponse> clearMajorProtectionBlackIp(ClearMajorProtectionBlackIpRequest request);

    /**
     * @param request the request parameters of CopyDefenseTemplate  CopyDefenseTemplateRequest
     * @return CopyDefenseTemplateResponse
     */
    CompletableFuture<CopyDefenseTemplateResponse> copyDefenseTemplate(CopyDefenseTemplateRequest request);

    /**
     * @param request the request parameters of CreateApiExport  CreateApiExportRequest
     * @return CreateApiExportResponse
     */
    CompletableFuture<CreateApiExportResponse> createApiExport(CreateApiExportRequest request);

    /**
     * @param request the request parameters of CreateCloudResource  CreateCloudResourceRequest
     * @return CreateCloudResourceResponse
     */
    CompletableFuture<CreateCloudResourceResponse> createCloudResource(CreateCloudResourceRequest request);

    /**
     * @param request the request parameters of CreateDefenseResourceGroup  CreateDefenseResourceGroupRequest
     * @return CreateDefenseResourceGroupResponse
     */
    CompletableFuture<CreateDefenseResourceGroupResponse> createDefenseResourceGroup(CreateDefenseResourceGroupRequest request);

    /**
     * @param request the request parameters of CreateDefenseRule  CreateDefenseRuleRequest
     * @return CreateDefenseRuleResponse
     */
    CompletableFuture<CreateDefenseRuleResponse> createDefenseRule(CreateDefenseRuleRequest request);

    /**
     * @param request the request parameters of CreateDefenseTemplate  CreateDefenseTemplateRequest
     * @return CreateDefenseTemplateResponse
     */
    CompletableFuture<CreateDefenseTemplateResponse> createDefenseTemplate(CreateDefenseTemplateRequest request);

    /**
     * @param request the request parameters of CreateDomain  CreateDomainRequest
     * @return CreateDomainResponse
     */
    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
     * @param request the request parameters of CreateHybridCloudGroup  CreateHybridCloudGroupRequest
     * @return CreateHybridCloudGroupResponse
     */
    CompletableFuture<CreateHybridCloudGroupResponse> createHybridCloudGroup(CreateHybridCloudGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is available only on the China site (aliyun.com).</p>
     * 
     * @param request the request parameters of CreateMajorProtectionBlackIp  CreateMajorProtectionBlackIpRequest
     * @return CreateMajorProtectionBlackIpResponse
     */
    CompletableFuture<CreateMajorProtectionBlackIpResponse> createMajorProtectionBlackIp(CreateMajorProtectionBlackIpRequest request);

    /**
     * @param request the request parameters of CreateMemberAccounts  CreateMemberAccountsRequest
     * @return CreateMemberAccountsResponse
     */
    CompletableFuture<CreateMemberAccountsResponse> createMemberAccounts(CreateMemberAccountsRequest request);

    /**
     * @param request the request parameters of CreatePostpaidInstance  CreatePostpaidInstanceRequest
     * @return CreatePostpaidInstanceResponse
     */
    CompletableFuture<CreatePostpaidInstanceResponse> createPostpaidInstance(CreatePostpaidInstanceRequest request);

    /**
     * @param request the request parameters of CreateSM2Cert  CreateSM2CertRequest
     * @return CreateSM2CertResponse
     */
    CompletableFuture<CreateSM2CertResponse> createSM2Cert(CreateSM2CertRequest request);

    /**
     * @param request the request parameters of DeleteApisecAbnormals  DeleteApisecAbnormalsRequest
     * @return DeleteApisecAbnormalsResponse
     */
    CompletableFuture<DeleteApisecAbnormalsResponse> deleteApisecAbnormals(DeleteApisecAbnormalsRequest request);

    /**
     * @param request the request parameters of DeleteApisecEvents  DeleteApisecEventsRequest
     * @return DeleteApisecEventsResponse
     */
    CompletableFuture<DeleteApisecEventsResponse> deleteApisecEvents(DeleteApisecEventsRequest request);

    /**
     * @param request the request parameters of DeleteCloudResource  DeleteCloudResourceRequest
     * @return DeleteCloudResourceResponse
     */
    CompletableFuture<DeleteCloudResourceResponse> deleteCloudResource(DeleteCloudResourceRequest request);

    /**
     * @param request the request parameters of DeleteDefenseResourceGroup  DeleteDefenseResourceGroupRequest
     * @return DeleteDefenseResourceGroupResponse
     */
    CompletableFuture<DeleteDefenseResourceGroupResponse> deleteDefenseResourceGroup(DeleteDefenseResourceGroupRequest request);

    /**
     * @param request the request parameters of DeleteDefenseRule  DeleteDefenseRuleRequest
     * @return DeleteDefenseRuleResponse
     */
    CompletableFuture<DeleteDefenseRuleResponse> deleteDefenseRule(DeleteDefenseRuleRequest request);

    /**
     * @param request the request parameters of DeleteDefenseTemplate  DeleteDefenseTemplateRequest
     * @return DeleteDefenseTemplateResponse
     */
    CompletableFuture<DeleteDefenseTemplateResponse> deleteDefenseTemplate(DeleteDefenseTemplateRequest request);

    /**
     * @param request the request parameters of DeleteDomain  DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    /**
     * @param request the request parameters of DeleteMajorProtectionBlackIp  DeleteMajorProtectionBlackIpRequest
     * @return DeleteMajorProtectionBlackIpResponse
     */
    CompletableFuture<DeleteMajorProtectionBlackIpResponse> deleteMajorProtectionBlackIp(DeleteMajorProtectionBlackIpRequest request);

    /**
     * @param request the request parameters of DeleteMemberAccount  DeleteMemberAccountRequest
     * @return DeleteMemberAccountResponse
     */
    CompletableFuture<DeleteMemberAccountResponse> deleteMemberAccount(DeleteMemberAccountRequest request);

    /**
     * @param request the request parameters of DescribeAccountDelegatedStatus  DescribeAccountDelegatedStatusRequest
     * @return DescribeAccountDelegatedStatusResponse
     */
    CompletableFuture<DescribeAccountDelegatedStatusResponse> describeAccountDelegatedStatus(DescribeAccountDelegatedStatusRequest request);

    /**
     * @param request the request parameters of DescribeApiExports  DescribeApiExportsRequest
     * @return DescribeApiExportsResponse
     */
    CompletableFuture<DescribeApiExportsResponse> describeApiExports(DescribeApiExportsRequest request);

    /**
     * @param request the request parameters of DescribeApisecAbnormalDomainStatistic  DescribeApisecAbnormalDomainStatisticRequest
     * @return DescribeApisecAbnormalDomainStatisticResponse
     */
    CompletableFuture<DescribeApisecAbnormalDomainStatisticResponse> describeApisecAbnormalDomainStatistic(DescribeApisecAbnormalDomainStatisticRequest request);

    /**
     * @param request the request parameters of DescribeApisecAbnormals  DescribeApisecAbnormalsRequest
     * @return DescribeApisecAbnormalsResponse
     */
    CompletableFuture<DescribeApisecAbnormalsResponse> describeApisecAbnormals(DescribeApisecAbnormalsRequest request);

    /**
     * @param request the request parameters of DescribeApisecApiResources  DescribeApisecApiResourcesRequest
     * @return DescribeApisecApiResourcesResponse
     */
    CompletableFuture<DescribeApisecApiResourcesResponse> describeApisecApiResources(DescribeApisecApiResourcesRequest request);

    /**
     * @param request the request parameters of DescribeApisecAssetTrend  DescribeApisecAssetTrendRequest
     * @return DescribeApisecAssetTrendResponse
     */
    CompletableFuture<DescribeApisecAssetTrendResponse> describeApisecAssetTrend(DescribeApisecAssetTrendRequest request);

    /**
     * @param request the request parameters of DescribeApisecEventDomainStatistic  DescribeApisecEventDomainStatisticRequest
     * @return DescribeApisecEventDomainStatisticResponse
     */
    CompletableFuture<DescribeApisecEventDomainStatisticResponse> describeApisecEventDomainStatistic(DescribeApisecEventDomainStatisticRequest request);

    /**
     * @param request the request parameters of DescribeApisecEvents  DescribeApisecEventsRequest
     * @return DescribeApisecEventsResponse
     */
    CompletableFuture<DescribeApisecEventsResponse> describeApisecEvents(DescribeApisecEventsRequest request);

    /**
     * @param request the request parameters of DescribeApisecLogDeliveries  DescribeApisecLogDeliveriesRequest
     * @return DescribeApisecLogDeliveriesResponse
     */
    CompletableFuture<DescribeApisecLogDeliveriesResponse> describeApisecLogDeliveries(DescribeApisecLogDeliveriesRequest request);

    /**
     * @param request the request parameters of DescribeApisecMatchedHosts  DescribeApisecMatchedHostsRequest
     * @return DescribeApisecMatchedHostsResponse
     */
    CompletableFuture<DescribeApisecMatchedHostsResponse> describeApisecMatchedHosts(DescribeApisecMatchedHostsRequest request);

    /**
     * @param request the request parameters of DescribeApisecProtectionGroups  DescribeApisecProtectionGroupsRequest
     * @return DescribeApisecProtectionGroupsResponse
     */
    CompletableFuture<DescribeApisecProtectionGroupsResponse> describeApisecProtectionGroups(DescribeApisecProtectionGroupsRequest request);

    /**
     * @param request the request parameters of DescribeApisecProtectionResources  DescribeApisecProtectionResourcesRequest
     * @return DescribeApisecProtectionResourcesResponse
     */
    CompletableFuture<DescribeApisecProtectionResourcesResponse> describeApisecProtectionResources(DescribeApisecProtectionResourcesRequest request);

    /**
     * @param request the request parameters of DescribeApisecRules  DescribeApisecRulesRequest
     * @return DescribeApisecRulesResponse
     */
    CompletableFuture<DescribeApisecRulesResponse> describeApisecRules(DescribeApisecRulesRequest request);

    /**
     * @param request the request parameters of DescribeApisecSensitiveDomainStatistic  DescribeApisecSensitiveDomainStatisticRequest
     * @return DescribeApisecSensitiveDomainStatisticResponse
     */
    CompletableFuture<DescribeApisecSensitiveDomainStatisticResponse> describeApisecSensitiveDomainStatistic(DescribeApisecSensitiveDomainStatisticRequest request);

    /**
     * @param request the request parameters of DescribeApisecSlsLogStores  DescribeApisecSlsLogStoresRequest
     * @return DescribeApisecSlsLogStoresResponse
     */
    CompletableFuture<DescribeApisecSlsLogStoresResponse> describeApisecSlsLogStores(DescribeApisecSlsLogStoresRequest request);

    /**
     * @param request the request parameters of DescribeApisecSlsProjects  DescribeApisecSlsProjectsRequest
     * @return DescribeApisecSlsProjectsResponse
     */
    CompletableFuture<DescribeApisecSlsProjectsResponse> describeApisecSlsProjects(DescribeApisecSlsProjectsRequest request);

    /**
     * @param request the request parameters of DescribeApisecStatistics  DescribeApisecStatisticsRequest
     * @return DescribeApisecStatisticsResponse
     */
    CompletableFuture<DescribeApisecStatisticsResponse> describeApisecStatistics(DescribeApisecStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeApisecSuggestions  DescribeApisecSuggestionsRequest
     * @return DescribeApisecSuggestionsResponse
     */
    CompletableFuture<DescribeApisecSuggestionsResponse> describeApisecSuggestions(DescribeApisecSuggestionsRequest request);

    /**
     * @param request the request parameters of DescribeApisecUserOperations  DescribeApisecUserOperationsRequest
     * @return DescribeApisecUserOperationsResponse
     */
    CompletableFuture<DescribeApisecUserOperationsResponse> describeApisecUserOperations(DescribeApisecUserOperationsRequest request);

    /**
     * @param request the request parameters of DescribeCertDetail  DescribeCertDetailRequest
     * @return DescribeCertDetailResponse
     */
    CompletableFuture<DescribeCertDetailResponse> describeCertDetail(DescribeCertDetailRequest request);

    /**
     * @param request the request parameters of DescribeCerts  DescribeCertsRequest
     * @return DescribeCertsResponse
     */
    CompletableFuture<DescribeCertsResponse> describeCerts(DescribeCertsRequest request);

    /**
     * @param request the request parameters of DescribeCloudResourceAccessPortDetails  DescribeCloudResourceAccessPortDetailsRequest
     * @return DescribeCloudResourceAccessPortDetailsResponse
     */
    CompletableFuture<DescribeCloudResourceAccessPortDetailsResponse> describeCloudResourceAccessPortDetails(DescribeCloudResourceAccessPortDetailsRequest request);

    /**
     * @param request the request parameters of DescribeCloudResourceAccessedPorts  DescribeCloudResourceAccessedPortsRequest
     * @return DescribeCloudResourceAccessedPortsResponse
     */
    CompletableFuture<DescribeCloudResourceAccessedPortsResponse> describeCloudResourceAccessedPorts(DescribeCloudResourceAccessedPortsRequest request);

    /**
     * @param request the request parameters of DescribeCloudResources  DescribeCloudResourcesRequest
     * @return DescribeCloudResourcesResponse
     */
    CompletableFuture<DescribeCloudResourcesResponse> describeCloudResources(DescribeCloudResourcesRequest request);

    /**
     * @param request the request parameters of DescribeCnameCount  DescribeCnameCountRequest
     * @return DescribeCnameCountResponse
     */
    CompletableFuture<DescribeCnameCountResponse> describeCnameCount(DescribeCnameCountRequest request);

    /**
     * @param request the request parameters of DescribeDDoSStatus  DescribeDDoSStatusRequest
     * @return DescribeDDoSStatusResponse
     */
    CompletableFuture<DescribeDDoSStatusResponse> describeDDoSStatus(DescribeDDoSStatusRequest request);

    /**
     * @param request the request parameters of DescribeDefaultHttps  DescribeDefaultHttpsRequest
     * @return DescribeDefaultHttpsResponse
     */
    CompletableFuture<DescribeDefaultHttpsResponse> describeDefaultHttps(DescribeDefaultHttpsRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResource  DescribeDefenseResourceRequest
     * @return DescribeDefenseResourceResponse
     */
    CompletableFuture<DescribeDefenseResourceResponse> describeDefenseResource(DescribeDefenseResourceRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResourceGroup  DescribeDefenseResourceGroupRequest
     * @return DescribeDefenseResourceGroupResponse
     */
    CompletableFuture<DescribeDefenseResourceGroupResponse> describeDefenseResourceGroup(DescribeDefenseResourceGroupRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResourceGroupNames  DescribeDefenseResourceGroupNamesRequest
     * @return DescribeDefenseResourceGroupNamesResponse
     */
    CompletableFuture<DescribeDefenseResourceGroupNamesResponse> describeDefenseResourceGroupNames(DescribeDefenseResourceGroupNamesRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResourceGroups  DescribeDefenseResourceGroupsRequest
     * @return DescribeDefenseResourceGroupsResponse
     */
    CompletableFuture<DescribeDefenseResourceGroupsResponse> describeDefenseResourceGroups(DescribeDefenseResourceGroupsRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResourceNames  DescribeDefenseResourceNamesRequest
     * @return DescribeDefenseResourceNamesResponse
     */
    CompletableFuture<DescribeDefenseResourceNamesResponse> describeDefenseResourceNames(DescribeDefenseResourceNamesRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResourceTemplates  DescribeDefenseResourceTemplatesRequest
     * @return DescribeDefenseResourceTemplatesResponse
     */
    CompletableFuture<DescribeDefenseResourceTemplatesResponse> describeDefenseResourceTemplates(DescribeDefenseResourceTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeDefenseResources  DescribeDefenseResourcesRequest
     * @return DescribeDefenseResourcesResponse
     */
    CompletableFuture<DescribeDefenseResourcesResponse> describeDefenseResources(DescribeDefenseResourcesRequest request);

    /**
     * @param request the request parameters of DescribeDefenseRule  DescribeDefenseRuleRequest
     * @return DescribeDefenseRuleResponse
     */
    CompletableFuture<DescribeDefenseRuleResponse> describeDefenseRule(DescribeDefenseRuleRequest request);

    /**
     * @param request the request parameters of DescribeDefenseRules  DescribeDefenseRulesRequest
     * @return DescribeDefenseRulesResponse
     */
    CompletableFuture<DescribeDefenseRulesResponse> describeDefenseRules(DescribeDefenseRulesRequest request);

    /**
     * @param request the request parameters of DescribeDefenseTemplate  DescribeDefenseTemplateRequest
     * @return DescribeDefenseTemplateResponse
     */
    CompletableFuture<DescribeDefenseTemplateResponse> describeDefenseTemplate(DescribeDefenseTemplateRequest request);

    /**
     * @param request the request parameters of DescribeDefenseTemplateValidGroups  DescribeDefenseTemplateValidGroupsRequest
     * @return DescribeDefenseTemplateValidGroupsResponse
     */
    CompletableFuture<DescribeDefenseTemplateValidGroupsResponse> describeDefenseTemplateValidGroups(DescribeDefenseTemplateValidGroupsRequest request);

    /**
     * @param request the request parameters of DescribeDefenseTemplates  DescribeDefenseTemplatesRequest
     * @return DescribeDefenseTemplatesResponse
     */
    CompletableFuture<DescribeDefenseTemplatesResponse> describeDefenseTemplates(DescribeDefenseTemplatesRequest request);

    /**
     * @param request the request parameters of DescribeDomainDNSRecord  DescribeDomainDNSRecordRequest
     * @return DescribeDomainDNSRecordResponse
     */
    CompletableFuture<DescribeDomainDNSRecordResponse> describeDomainDNSRecord(DescribeDomainDNSRecordRequest request);

    /**
     * @param request the request parameters of DescribeDomainDetail  DescribeDomainDetailRequest
     * @return DescribeDomainDetailResponse
     */
    CompletableFuture<DescribeDomainDetailResponse> describeDomainDetail(DescribeDomainDetailRequest request);

    /**
     * @param request the request parameters of DescribeDomains  DescribeDomainsRequest
     * @return DescribeDomainsResponse
     */
    CompletableFuture<DescribeDomainsResponse> describeDomains(DescribeDomainsRequest request);

    /**
     * @param request the request parameters of DescribeFlowChart  DescribeFlowChartRequest
     * @return DescribeFlowChartResponse
     */
    CompletableFuture<DescribeFlowChartResponse> describeFlowChart(DescribeFlowChartRequest request);

    /**
     * @param request the request parameters of DescribeFlowTopResource  DescribeFlowTopResourceRequest
     * @return DescribeFlowTopResourceResponse
     */
    CompletableFuture<DescribeFlowTopResourceResponse> describeFlowTopResource(DescribeFlowTopResourceRequest request);

    /**
     * @param request the request parameters of DescribeFlowTopUrl  DescribeFlowTopUrlRequest
     * @return DescribeFlowTopUrlResponse
     */
    CompletableFuture<DescribeFlowTopUrlResponse> describeFlowTopUrl(DescribeFlowTopUrlRequest request);

    /**
     * @param request the request parameters of DescribeFreeUserAssetCount  DescribeFreeUserAssetCountRequest
     * @return DescribeFreeUserAssetCountResponse
     */
    CompletableFuture<DescribeFreeUserAssetCountResponse> describeFreeUserAssetCount(DescribeFreeUserAssetCountRequest request);

    /**
     * @param request the request parameters of DescribeFreeUserEventCount  DescribeFreeUserEventCountRequest
     * @return DescribeFreeUserEventCountResponse
     */
    CompletableFuture<DescribeFreeUserEventCountResponse> describeFreeUserEventCount(DescribeFreeUserEventCountRequest request);

    /**
     * @param request the request parameters of DescribeFreeUserEventTypes  DescribeFreeUserEventTypesRequest
     * @return DescribeFreeUserEventTypesResponse
     */
    CompletableFuture<DescribeFreeUserEventTypesResponse> describeFreeUserEventTypes(DescribeFreeUserEventTypesRequest request);

    /**
     * @param request the request parameters of DescribeFreeUserEvents  DescribeFreeUserEventsRequest
     * @return DescribeFreeUserEventsResponse
     */
    CompletableFuture<DescribeFreeUserEventsResponse> describeFreeUserEvents(DescribeFreeUserEventsRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudClusterRule  DescribeHybridCloudClusterRuleRequest
     * @return DescribeHybridCloudClusterRuleResponse
     */
    CompletableFuture<DescribeHybridCloudClusterRuleResponse> describeHybridCloudClusterRule(DescribeHybridCloudClusterRuleRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudClusters  DescribeHybridCloudClustersRequest
     * @return DescribeHybridCloudClustersResponse
     */
    CompletableFuture<DescribeHybridCloudClustersResponse> describeHybridCloudClusters(DescribeHybridCloudClustersRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudGroups  DescribeHybridCloudGroupsRequest
     * @return DescribeHybridCloudGroupsResponse
     */
    CompletableFuture<DescribeHybridCloudGroupsResponse> describeHybridCloudGroups(DescribeHybridCloudGroupsRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudResources  DescribeHybridCloudResourcesRequest
     * @return DescribeHybridCloudResourcesResponse
     */
    CompletableFuture<DescribeHybridCloudResourcesResponse> describeHybridCloudResources(DescribeHybridCloudResourcesRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudServerRegions  DescribeHybridCloudServerRegionsRequest
     * @return DescribeHybridCloudServerRegionsResponse
     */
    CompletableFuture<DescribeHybridCloudServerRegionsResponse> describeHybridCloudServerRegions(DescribeHybridCloudServerRegionsRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudUnassignedMachines  DescribeHybridCloudUnassignedMachinesRequest
     * @return DescribeHybridCloudUnassignedMachinesResponse
     */
    CompletableFuture<DescribeHybridCloudUnassignedMachinesResponse> describeHybridCloudUnassignedMachines(DescribeHybridCloudUnassignedMachinesRequest request);

    /**
     * @param request the request parameters of DescribeHybridCloudUser  DescribeHybridCloudUserRequest
     * @return DescribeHybridCloudUserResponse
     */
    CompletableFuture<DescribeHybridCloudUserResponse> describeHybridCloudUser(DescribeHybridCloudUserRequest request);

    /**
     * @param request the request parameters of DescribeInstance  DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    /**
     * @param request the request parameters of DescribeMajorProtectionBlackIps  DescribeMajorProtectionBlackIpsRequest
     * @return DescribeMajorProtectionBlackIpsResponse
     */
    CompletableFuture<DescribeMajorProtectionBlackIpsResponse> describeMajorProtectionBlackIps(DescribeMajorProtectionBlackIpsRequest request);

    /**
     * @param request the request parameters of DescribeMemberAccounts  DescribeMemberAccountsRequest
     * @return DescribeMemberAccountsResponse
     */
    CompletableFuture<DescribeMemberAccountsResponse> describeMemberAccounts(DescribeMemberAccountsRequest request);

    /**
     * @param request the request parameters of DescribeNetworkFlowTimeSeriesMetric  DescribeNetworkFlowTimeSeriesMetricRequest
     * @return DescribeNetworkFlowTimeSeriesMetricResponse
     */
    CompletableFuture<DescribeNetworkFlowTimeSeriesMetricResponse> describeNetworkFlowTimeSeriesMetric(DescribeNetworkFlowTimeSeriesMetricRequest request);

    /**
     * @param request the request parameters of DescribeNetworkFlowTopNMetric  DescribeNetworkFlowTopNMetricRequest
     * @return DescribeNetworkFlowTopNMetricResponse
     */
    CompletableFuture<DescribeNetworkFlowTopNMetricResponse> describeNetworkFlowTopNMetric(DescribeNetworkFlowTopNMetricRequest request);

    /**
     * @param request the request parameters of DescribePauseProtectionStatus  DescribePauseProtectionStatusRequest
     * @return DescribePauseProtectionStatusResponse
     */
    CompletableFuture<DescribePauseProtectionStatusResponse> describePauseProtectionStatus(DescribePauseProtectionStatusRequest request);

    /**
     * @param request the request parameters of DescribePeakTrend  DescribePeakTrendRequest
     * @return DescribePeakTrendResponse
     */
    CompletableFuture<DescribePeakTrendResponse> describePeakTrend(DescribePeakTrendRequest request);

    /**
     * @param request the request parameters of DescribeProductInstances  DescribeProductInstancesRequest
     * @return DescribeProductInstancesResponse
     */
    CompletableFuture<DescribeProductInstancesResponse> describeProductInstances(DescribeProductInstancesRequest request);

    /**
     * @param request the request parameters of DescribePunishedDomains  DescribePunishedDomainsRequest
     * @return DescribePunishedDomainsResponse
     */
    CompletableFuture<DescribePunishedDomainsResponse> describePunishedDomains(DescribePunishedDomainsRequest request);

    /**
     * @param request the request parameters of DescribeResourceInstanceCerts  DescribeResourceInstanceCertsRequest
     * @return DescribeResourceInstanceCertsResponse
     */
    CompletableFuture<DescribeResourceInstanceCertsResponse> describeResourceInstanceCerts(DescribeResourceInstanceCertsRequest request);

    /**
     * @param request the request parameters of DescribeResourceLogStatus  DescribeResourceLogStatusRequest
     * @return DescribeResourceLogStatusResponse
     */
    CompletableFuture<DescribeResourceLogStatusResponse> describeResourceLogStatus(DescribeResourceLogStatusRequest request);

    /**
     * @param request the request parameters of DescribeResourcePort  DescribeResourcePortRequest
     * @return DescribeResourcePortResponse
     */
    CompletableFuture<DescribeResourcePortResponse> describeResourcePort(DescribeResourcePortRequest request);

    /**
     * @param request the request parameters of DescribeResourceRegionId  DescribeResourceRegionIdRequest
     * @return DescribeResourceRegionIdResponse
     */
    CompletableFuture<DescribeResourceRegionIdResponse> describeResourceRegionId(DescribeResourceRegionIdRequest request);

    /**
     * @param request the request parameters of DescribeResourceSupportRegions  DescribeResourceSupportRegionsRequest
     * @return DescribeResourceSupportRegionsResponse
     */
    CompletableFuture<DescribeResourceSupportRegionsResponse> describeResourceSupportRegions(DescribeResourceSupportRegionsRequest request);

    /**
     * @param request the request parameters of DescribeResponseCodeTrendGraph  DescribeResponseCodeTrendGraphRequest
     * @return DescribeResponseCodeTrendGraphResponse
     */
    CompletableFuture<DescribeResponseCodeTrendGraphResponse> describeResponseCodeTrendGraph(DescribeResponseCodeTrendGraphRequest request);

    /**
     * @param request the request parameters of DescribeRuleGroups  DescribeRuleGroupsRequest
     * @return DescribeRuleGroupsResponse
     */
    CompletableFuture<DescribeRuleGroupsResponse> describeRuleGroups(DescribeRuleGroupsRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopClientIp  DescribeRuleHitsTopClientIpRequest
     * @return DescribeRuleHitsTopClientIpResponse
     */
    CompletableFuture<DescribeRuleHitsTopClientIpResponse> describeRuleHitsTopClientIp(DescribeRuleHitsTopClientIpRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopResource  DescribeRuleHitsTopResourceRequest
     * @return DescribeRuleHitsTopResourceResponse
     */
    CompletableFuture<DescribeRuleHitsTopResourceResponse> describeRuleHitsTopResource(DescribeRuleHitsTopResourceRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopRuleId  DescribeRuleHitsTopRuleIdRequest
     * @return DescribeRuleHitsTopRuleIdResponse
     */
    CompletableFuture<DescribeRuleHitsTopRuleIdResponse> describeRuleHitsTopRuleId(DescribeRuleHitsTopRuleIdRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopTuleType  DescribeRuleHitsTopTuleTypeRequest
     * @return DescribeRuleHitsTopTuleTypeResponse
     */
    CompletableFuture<DescribeRuleHitsTopTuleTypeResponse> describeRuleHitsTopTuleType(DescribeRuleHitsTopTuleTypeRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopUa  DescribeRuleHitsTopUaRequest
     * @return DescribeRuleHitsTopUaResponse
     */
    CompletableFuture<DescribeRuleHitsTopUaResponse> describeRuleHitsTopUa(DescribeRuleHitsTopUaRequest request);

    /**
     * @param request the request parameters of DescribeRuleHitsTopUrl  DescribeRuleHitsTopUrlRequest
     * @return DescribeRuleHitsTopUrlResponse
     */
    CompletableFuture<DescribeRuleHitsTopUrlResponse> describeRuleHitsTopUrl(DescribeRuleHitsTopUrlRequest request);

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to the traffic of requests that match protection rules and are identified as risky. The following types of requests are excluded:</p>
     * <ul>
     * <li>Requests that match the protection rules of the whitelist module.</li>
     * <li>Requests that match the protection rules of the bot management module. The actions of the protection rules are set to Add Tag.</li>
     * <li>Requests that match protection rules with actions set to Dynamic Token-based Authentication, Slider CAPTCHA, Strict Slider CAPTCHA Verification, and JavaScript Validation, pass the verifications specified by the actions, and are allowed.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityEventLogs  DescribeSecurityEventLogsRequest
     * @return DescribeSecurityEventLogsResponse
     */
    CompletableFuture<DescribeSecurityEventLogsResponse> describeSecurityEventLogs(DescribeSecurityEventLogsRequest request);

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to the traffic of requests that match protection rules and are identified as risky. The following types of requests are excluded:</p>
     * <ul>
     * <li>Requests that match the protection rules of the whitelist module.</li>
     * <li>Requests that match the protection rules of the bot management module. The actions of the protection rules are set to Add Tag.</li>
     * <li>Requests that match protection rules with actions set to Dynamic Token-based Authentication, Slider CAPTCHA, Strict Slider CAPTCHA Verification, and JavaScript Validation, pass the verifications specified by the actions, and are allowed.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityEventTimeSeriesMetric  DescribeSecurityEventTimeSeriesMetricRequest
     * @return DescribeSecurityEventTimeSeriesMetricResponse
     */
    CompletableFuture<DescribeSecurityEventTimeSeriesMetricResponse> describeSecurityEventTimeSeriesMetric(DescribeSecurityEventTimeSeriesMetricRequest request);

    /**
     * <b>description</b> :
     * <p>Attack traffic refers to the traffic of requests that match protection rules and are identified as risky. The following types of requests are excluded:</p>
     * <ul>
     * <li>Requests that match the protection rules of the whitelist module.</li>
     * <li>Requests that match the protection rules of the bot management module. The actions of the protection rules are set to Add Tag.</li>
     * <li>Requests that match protection rules with actions set to Dynamic Token-based Authentication, Slider CAPTCHA, Strict Slider CAPTCHA Verification, and JavaScript Validation, pass the verifications specified by the actions, and are allowed.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityEventTopNMetric  DescribeSecurityEventTopNMetricRequest
     * @return DescribeSecurityEventTopNMetricResponse
     */
    CompletableFuture<DescribeSecurityEventTopNMetricResponse> describeSecurityEventTopNMetric(DescribeSecurityEventTopNMetricRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveApiStatistic  DescribeSensitiveApiStatisticRequest
     * @return DescribeSensitiveApiStatisticResponse
     */
    CompletableFuture<DescribeSensitiveApiStatisticResponse> describeSensitiveApiStatistic(DescribeSensitiveApiStatisticRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveDetectionResult  DescribeSensitiveDetectionResultRequest
     * @return DescribeSensitiveDetectionResultResponse
     */
    CompletableFuture<DescribeSensitiveDetectionResultResponse> describeSensitiveDetectionResult(DescribeSensitiveDetectionResultRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveOutboundDistribution  DescribeSensitiveOutboundDistributionRequest
     * @return DescribeSensitiveOutboundDistributionResponse
     */
    CompletableFuture<DescribeSensitiveOutboundDistributionResponse> describeSensitiveOutboundDistribution(DescribeSensitiveOutboundDistributionRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveOutboundStatistic  DescribeSensitiveOutboundStatisticRequest
     * @return DescribeSensitiveOutboundStatisticResponse
     */
    CompletableFuture<DescribeSensitiveOutboundStatisticResponse> describeSensitiveOutboundStatistic(DescribeSensitiveOutboundStatisticRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveOutboundTrend  DescribeSensitiveOutboundTrendRequest
     * @return DescribeSensitiveOutboundTrendResponse
     */
    CompletableFuture<DescribeSensitiveOutboundTrendResponse> describeSensitiveOutboundTrend(DescribeSensitiveOutboundTrendRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveRequestLog  DescribeSensitiveRequestLogRequest
     * @return DescribeSensitiveRequestLogResponse
     */
    CompletableFuture<DescribeSensitiveRequestLogResponse> describeSensitiveRequestLog(DescribeSensitiveRequestLogRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveRequests  DescribeSensitiveRequestsRequest
     * @return DescribeSensitiveRequestsResponse
     */
    CompletableFuture<DescribeSensitiveRequestsResponse> describeSensitiveRequests(DescribeSensitiveRequestsRequest request);

    /**
     * @param request the request parameters of DescribeSensitiveStatistic  DescribeSensitiveStatisticRequest
     * @return DescribeSensitiveStatisticResponse
     */
    CompletableFuture<DescribeSensitiveStatisticResponse> describeSensitiveStatistic(DescribeSensitiveStatisticRequest request);

    /**
     * @param request the request parameters of DescribeSlsAuthStatus  DescribeSlsAuthStatusRequest
     * @return DescribeSlsAuthStatusResponse
     */
    CompletableFuture<DescribeSlsAuthStatusResponse> describeSlsAuthStatus(DescribeSlsAuthStatusRequest request);

    /**
     * @param request the request parameters of DescribeSlsLogStore  DescribeSlsLogStoreRequest
     * @return DescribeSlsLogStoreResponse
     */
    CompletableFuture<DescribeSlsLogStoreResponse> describeSlsLogStore(DescribeSlsLogStoreRequest request);

    /**
     * @param request the request parameters of DescribeSlsLogStoreStatus  DescribeSlsLogStoreStatusRequest
     * @return DescribeSlsLogStoreStatusResponse
     */
    CompletableFuture<DescribeSlsLogStoreStatusResponse> describeSlsLogStoreStatus(DescribeSlsLogStoreStatusRequest request);

    /**
     * @param request the request parameters of DescribeTemplateResourceCount  DescribeTemplateResourceCountRequest
     * @return DescribeTemplateResourceCountResponse
     */
    CompletableFuture<DescribeTemplateResourceCountResponse> describeTemplateResourceCount(DescribeTemplateResourceCountRequest request);

    /**
     * @param request the request parameters of DescribeTemplateResources  DescribeTemplateResourcesRequest
     * @return DescribeTemplateResourcesResponse
     */
    CompletableFuture<DescribeTemplateResourcesResponse> describeTemplateResources(DescribeTemplateResourcesRequest request);

    /**
     * @param request the request parameters of DescribeUserAbnormalTrend  DescribeUserAbnormalTrendRequest
     * @return DescribeUserAbnormalTrendResponse
     */
    CompletableFuture<DescribeUserAbnormalTrendResponse> describeUserAbnormalTrend(DescribeUserAbnormalTrendRequest request);

    /**
     * @param request the request parameters of DescribeUserAbnormalType  DescribeUserAbnormalTypeRequest
     * @return DescribeUserAbnormalTypeResponse
     */
    CompletableFuture<DescribeUserAbnormalTypeResponse> describeUserAbnormalType(DescribeUserAbnormalTypeRequest request);

    /**
     * @param request the request parameters of DescribeUserApiRequest  DescribeUserApiRequestRequest
     * @return DescribeUserApiRequestResponse
     */
    CompletableFuture<DescribeUserApiRequestResponse> describeUserApiRequest(DescribeUserApiRequestRequest request);

    /**
     * @param request the request parameters of DescribeUserAsset  DescribeUserAssetRequest
     * @return DescribeUserAssetResponse
     */
    CompletableFuture<DescribeUserAssetResponse> describeUserAsset(DescribeUserAssetRequest request);

    /**
     * @param request the request parameters of DescribeUserEventTrend  DescribeUserEventTrendRequest
     * @return DescribeUserEventTrendResponse
     */
    CompletableFuture<DescribeUserEventTrendResponse> describeUserEventTrend(DescribeUserEventTrendRequest request);

    /**
     * @param request the request parameters of DescribeUserEventType  DescribeUserEventTypeRequest
     * @return DescribeUserEventTypeResponse
     */
    CompletableFuture<DescribeUserEventTypeResponse> describeUserEventType(DescribeUserEventTypeRequest request);

    /**
     * @param request the request parameters of DescribeUserSlsLogRegions  DescribeUserSlsLogRegionsRequest
     * @return DescribeUserSlsLogRegionsResponse
     */
    CompletableFuture<DescribeUserSlsLogRegionsResponse> describeUserSlsLogRegions(DescribeUserSlsLogRegionsRequest request);

    /**
     * @param request the request parameters of DescribeUserWafLogStatus  DescribeUserWafLogStatusRequest
     * @return DescribeUserWafLogStatusResponse
     */
    CompletableFuture<DescribeUserWafLogStatusResponse> describeUserWafLogStatus(DescribeUserWafLogStatusRequest request);

    /**
     * @param request the request parameters of DescribeVisitTopIp  DescribeVisitTopIpRequest
     * @return DescribeVisitTopIpResponse
     */
    CompletableFuture<DescribeVisitTopIpResponse> describeVisitTopIp(DescribeVisitTopIpRequest request);

    /**
     * @param request the request parameters of DescribeVisitUas  DescribeVisitUasRequest
     * @return DescribeVisitUasResponse
     */
    CompletableFuture<DescribeVisitUasResponse> describeVisitUas(DescribeVisitUasRequest request);

    /**
     * @param request the request parameters of DescribeWafSourceIpSegment  DescribeWafSourceIpSegmentRequest
     * @return DescribeWafSourceIpSegmentResponse
     */
    CompletableFuture<DescribeWafSourceIpSegmentResponse> describeWafSourceIpSegment(DescribeWafSourceIpSegmentRequest request);

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    /**
     * @param request the request parameters of ModifyApisecAbnormals  ModifyApisecAbnormalsRequest
     * @return ModifyApisecAbnormalsResponse
     */
    CompletableFuture<ModifyApisecAbnormalsResponse> modifyApisecAbnormals(ModifyApisecAbnormalsRequest request);

    /**
     * @param request the request parameters of ModifyApisecApiResource  ModifyApisecApiResourceRequest
     * @return ModifyApisecApiResourceResponse
     */
    CompletableFuture<ModifyApisecApiResourceResponse> modifyApisecApiResource(ModifyApisecApiResourceRequest request);

    /**
     * @param request the request parameters of ModifyApisecEvents  ModifyApisecEventsRequest
     * @return ModifyApisecEventsResponse
     */
    CompletableFuture<ModifyApisecEventsResponse> modifyApisecEvents(ModifyApisecEventsRequest request);

    /**
     * @param request the request parameters of ModifyApisecLogDelivery  ModifyApisecLogDeliveryRequest
     * @return ModifyApisecLogDeliveryResponse
     */
    CompletableFuture<ModifyApisecLogDeliveryResponse> modifyApisecLogDelivery(ModifyApisecLogDeliveryRequest request);

    /**
     * @param request the request parameters of ModifyApisecLogDeliveryStatus  ModifyApisecLogDeliveryStatusRequest
     * @return ModifyApisecLogDeliveryStatusResponse
     */
    CompletableFuture<ModifyApisecLogDeliveryStatusResponse> modifyApisecLogDeliveryStatus(ModifyApisecLogDeliveryStatusRequest request);

    /**
     * @param request the request parameters of ModifyApisecModuleStatus  ModifyApisecModuleStatusRequest
     * @return ModifyApisecModuleStatusResponse
     */
    CompletableFuture<ModifyApisecModuleStatusResponse> modifyApisecModuleStatus(ModifyApisecModuleStatusRequest request);

    /**
     * @param request the request parameters of ModifyApisecStatus  ModifyApisecStatusRequest
     * @return ModifyApisecStatusResponse
     */
    CompletableFuture<ModifyApisecStatusResponse> modifyApisecStatus(ModifyApisecStatusRequest request);

    /**
     * @param request the request parameters of ModifyCloudResource  ModifyCloudResourceRequest
     * @return ModifyCloudResourceResponse
     */
    CompletableFuture<ModifyCloudResourceResponse> modifyCloudResource(ModifyCloudResourceRequest request);

    /**
     * @param request the request parameters of ModifyDefaultHttps  ModifyDefaultHttpsRequest
     * @return ModifyDefaultHttpsResponse
     */
    CompletableFuture<ModifyDefaultHttpsResponse> modifyDefaultHttps(ModifyDefaultHttpsRequest request);

    /**
     * @param request the request parameters of ModifyDefenseResourceGroup  ModifyDefenseResourceGroupRequest
     * @return ModifyDefenseResourceGroupResponse
     */
    CompletableFuture<ModifyDefenseResourceGroupResponse> modifyDefenseResourceGroup(ModifyDefenseResourceGroupRequest request);

    /**
     * @param request the request parameters of ModifyDefenseResourceXff  ModifyDefenseResourceXffRequest
     * @return ModifyDefenseResourceXffResponse
     */
    CompletableFuture<ModifyDefenseResourceXffResponse> modifyDefenseResourceXff(ModifyDefenseResourceXffRequest request);

    /**
     * @param request the request parameters of ModifyDefenseRule  ModifyDefenseRuleRequest
     * @return ModifyDefenseRuleResponse
     */
    CompletableFuture<ModifyDefenseRuleResponse> modifyDefenseRule(ModifyDefenseRuleRequest request);

    /**
     * @param request the request parameters of ModifyDefenseRuleCache  ModifyDefenseRuleCacheRequest
     * @return ModifyDefenseRuleCacheResponse
     */
    CompletableFuture<ModifyDefenseRuleCacheResponse> modifyDefenseRuleCache(ModifyDefenseRuleCacheRequest request);

    /**
     * @param request the request parameters of ModifyDefenseRuleStatus  ModifyDefenseRuleStatusRequest
     * @return ModifyDefenseRuleStatusResponse
     */
    CompletableFuture<ModifyDefenseRuleStatusResponse> modifyDefenseRuleStatus(ModifyDefenseRuleStatusRequest request);

    /**
     * @param request the request parameters of ModifyDefenseTemplate  ModifyDefenseTemplateRequest
     * @return ModifyDefenseTemplateResponse
     */
    CompletableFuture<ModifyDefenseTemplateResponse> modifyDefenseTemplate(ModifyDefenseTemplateRequest request);

    /**
     * @param request the request parameters of ModifyDefenseTemplateStatus  ModifyDefenseTemplateStatusRequest
     * @return ModifyDefenseTemplateStatusResponse
     */
    CompletableFuture<ModifyDefenseTemplateStatusResponse> modifyDefenseTemplateStatus(ModifyDefenseTemplateStatusRequest request);

    /**
     * @param request the request parameters of ModifyDomain  ModifyDomainRequest
     * @return ModifyDomainResponse
     */
    CompletableFuture<ModifyDomainResponse> modifyDomain(ModifyDomainRequest request);

    /**
     * @param request the request parameters of ModifyDomainPunishStatus  ModifyDomainPunishStatusRequest
     * @return ModifyDomainPunishStatusResponse
     */
    CompletableFuture<ModifyDomainPunishStatusResponse> modifyDomainPunishStatus(ModifyDomainPunishStatusRequest request);

    /**
     * @param request the request parameters of ModifyHybridCloudClusterBypassStatus  ModifyHybridCloudClusterBypassStatusRequest
     * @return ModifyHybridCloudClusterBypassStatusResponse
     */
    CompletableFuture<ModifyHybridCloudClusterBypassStatusResponse> modifyHybridCloudClusterBypassStatus(ModifyHybridCloudClusterBypassStatusRequest request);

    /**
     * @param request the request parameters of ModifyHybridCloudClusterRule  ModifyHybridCloudClusterRuleRequest
     * @return ModifyHybridCloudClusterRuleResponse
     */
    CompletableFuture<ModifyHybridCloudClusterRuleResponse> modifyHybridCloudClusterRule(ModifyHybridCloudClusterRuleRequest request);

    /**
     * @param request the request parameters of ModifyHybridCloudGroup  ModifyHybridCloudGroupRequest
     * @return ModifyHybridCloudGroupResponse
     */
    CompletableFuture<ModifyHybridCloudGroupResponse> modifyHybridCloudGroup(ModifyHybridCloudGroupRequest request);

    /**
     * @param request the request parameters of ModifyHybridCloudGroupExpansionServer  ModifyHybridCloudGroupExpansionServerRequest
     * @return ModifyHybridCloudGroupExpansionServerResponse
     */
    CompletableFuture<ModifyHybridCloudGroupExpansionServerResponse> modifyHybridCloudGroupExpansionServer(ModifyHybridCloudGroupExpansionServerRequest request);

    /**
     * @param request the request parameters of ModifyHybridCloudGroupShrinkServer  ModifyHybridCloudGroupShrinkServerRequest
     * @return ModifyHybridCloudGroupShrinkServerResponse
     */
    CompletableFuture<ModifyHybridCloudGroupShrinkServerResponse> modifyHybridCloudGroupShrinkServer(ModifyHybridCloudGroupShrinkServerRequest request);

    /**
     * @param request the request parameters of ModifyHybridCloudSdkPullinStatus  ModifyHybridCloudSdkPullinStatusRequest
     * @return ModifyHybridCloudSdkPullinStatusResponse
     */
    CompletableFuture<ModifyHybridCloudSdkPullinStatusResponse> modifyHybridCloudSdkPullinStatus(ModifyHybridCloudSdkPullinStatusRequest request);

    /**
     * @param request the request parameters of ModifyHybridCloudServer  ModifyHybridCloudServerRequest
     * @return ModifyHybridCloudServerResponse
     */
    CompletableFuture<ModifyHybridCloudServerResponse> modifyHybridCloudServer(ModifyHybridCloudServerRequest request);

    /**
     * @param request the request parameters of ModifyMajorProtectionBlackIp  ModifyMajorProtectionBlackIpRequest
     * @return ModifyMajorProtectionBlackIpResponse
     */
    CompletableFuture<ModifyMajorProtectionBlackIpResponse> modifyMajorProtectionBlackIp(ModifyMajorProtectionBlackIpRequest request);

    /**
     * @param request the request parameters of ModifyMemberAccount  ModifyMemberAccountRequest
     * @return ModifyMemberAccountResponse
     */
    CompletableFuture<ModifyMemberAccountResponse> modifyMemberAccount(ModifyMemberAccountRequest request);

    /**
     * @param request the request parameters of ModifyPauseProtectionStatus  ModifyPauseProtectionStatusRequest
     * @return ModifyPauseProtectionStatusResponse
     */
    CompletableFuture<ModifyPauseProtectionStatusResponse> modifyPauseProtectionStatus(ModifyPauseProtectionStatusRequest request);

    /**
     * @param request the request parameters of ModifyResourceLogStatus  ModifyResourceLogStatusRequest
     * @return ModifyResourceLogStatusResponse
     */
    CompletableFuture<ModifyResourceLogStatusResponse> modifyResourceLogStatus(ModifyResourceLogStatusRequest request);

    /**
     * @param request the request parameters of ModifyTemplateResources  ModifyTemplateResourcesRequest
     * @return ModifyTemplateResourcesResponse
     */
    CompletableFuture<ModifyTemplateResourcesResponse> modifyTemplateResources(ModifyTemplateResourcesRequest request);

    /**
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>SyncProductInstance is an asynchronous operation. You can call the <a href="https://help.aliyun.com/document_detail/2743168.html">DescribeProductInstances</a> operation to query the status of the task.</p>
     * 
     * @param request the request parameters of SyncProductInstance  SyncProductInstanceRequest
     * @return SyncProductInstanceResponse
     */
    CompletableFuture<SyncProductInstanceResponse> syncProductInstance(SyncProductInstanceRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
