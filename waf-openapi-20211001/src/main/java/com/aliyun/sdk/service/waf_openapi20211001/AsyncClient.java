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

    CompletableFuture<ClearMajorProtectionBlackIpResponse> clearMajorProtectionBlackIp(ClearMajorProtectionBlackIpRequest request);

    CompletableFuture<CopyDefenseTemplateResponse> copyDefenseTemplate(CopyDefenseTemplateRequest request);

    CompletableFuture<CreateDefenseResourceGroupResponse> createDefenseResourceGroup(CreateDefenseResourceGroupRequest request);

    CompletableFuture<CreateDefenseRuleResponse> createDefenseRule(CreateDefenseRuleRequest request);

    CompletableFuture<CreateDefenseTemplateResponse> createDefenseTemplate(CreateDefenseTemplateRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
      * This operation is available only on the China site (aliyun.com).
      *
     */
    CompletableFuture<CreateMajorProtectionBlackIpResponse> createMajorProtectionBlackIp(CreateMajorProtectionBlackIpRequest request);

    CompletableFuture<CreateMemberAccountsResponse> createMemberAccounts(CreateMemberAccountsRequest request);

    CompletableFuture<CreatePostpaidInstanceResponse> createPostpaidInstance(CreatePostpaidInstanceRequest request);

    CompletableFuture<CreateSM2CertResponse> createSM2Cert(CreateSM2CertRequest request);

    CompletableFuture<DeleteApisecAbnormalResponse> deleteApisecAbnormal(DeleteApisecAbnormalRequest request);

    CompletableFuture<DeleteApisecEventResponse> deleteApisecEvent(DeleteApisecEventRequest request);

    CompletableFuture<DeleteDefenseResourceGroupResponse> deleteDefenseResourceGroup(DeleteDefenseResourceGroupRequest request);

    CompletableFuture<DeleteDefenseRuleResponse> deleteDefenseRule(DeleteDefenseRuleRequest request);

    CompletableFuture<DeleteDefenseTemplateResponse> deleteDefenseTemplate(DeleteDefenseTemplateRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteMajorProtectionBlackIpResponse> deleteMajorProtectionBlackIp(DeleteMajorProtectionBlackIpRequest request);

    CompletableFuture<DeleteMemberAccountResponse> deleteMemberAccount(DeleteMemberAccountRequest request);

    CompletableFuture<DescribeAccountDelegatedStatusResponse> describeAccountDelegatedStatus(DescribeAccountDelegatedStatusRequest request);

    CompletableFuture<DescribeApisecAbnormalDomainStatisticResponse> describeApisecAbnormalDomainStatistic(DescribeApisecAbnormalDomainStatisticRequest request);

    CompletableFuture<DescribeApisecAssetTrendResponse> describeApisecAssetTrend(DescribeApisecAssetTrendRequest request);

    CompletableFuture<DescribeApisecEventDomainStatisticResponse> describeApisecEventDomainStatistic(DescribeApisecEventDomainStatisticRequest request);

    CompletableFuture<DescribeApisecLogDeliveriesResponse> describeApisecLogDeliveries(DescribeApisecLogDeliveriesRequest request);

    CompletableFuture<DescribeApisecSensitiveDomainStatisticResponse> describeApisecSensitiveDomainStatistic(DescribeApisecSensitiveDomainStatisticRequest request);

    CompletableFuture<DescribeApisecSlsLogStoresResponse> describeApisecSlsLogStores(DescribeApisecSlsLogStoresRequest request);

    CompletableFuture<DescribeApisecSlsProjectsResponse> describeApisecSlsProjects(DescribeApisecSlsProjectsRequest request);

    CompletableFuture<DescribeCertDetailResponse> describeCertDetail(DescribeCertDetailRequest request);

    CompletableFuture<DescribeCertsResponse> describeCerts(DescribeCertsRequest request);

    CompletableFuture<DescribeCloudResourcesResponse> describeCloudResources(DescribeCloudResourcesRequest request);

    CompletableFuture<DescribeDDoSStatusResponse> describeDDoSStatus(DescribeDDoSStatusRequest request);

    CompletableFuture<DescribeDefenseResourceResponse> describeDefenseResource(DescribeDefenseResourceRequest request);

    CompletableFuture<DescribeDefenseResourceGroupResponse> describeDefenseResourceGroup(DescribeDefenseResourceGroupRequest request);

    CompletableFuture<DescribeDefenseResourceGroupNamesResponse> describeDefenseResourceGroupNames(DescribeDefenseResourceGroupNamesRequest request);

    CompletableFuture<DescribeDefenseResourceGroupsResponse> describeDefenseResourceGroups(DescribeDefenseResourceGroupsRequest request);

    CompletableFuture<DescribeDefenseResourceNamesResponse> describeDefenseResourceNames(DescribeDefenseResourceNamesRequest request);

    CompletableFuture<DescribeDefenseResourceTemplatesResponse> describeDefenseResourceTemplates(DescribeDefenseResourceTemplatesRequest request);

    CompletableFuture<DescribeDefenseResourcesResponse> describeDefenseResources(DescribeDefenseResourcesRequest request);

    CompletableFuture<DescribeDefenseRuleResponse> describeDefenseRule(DescribeDefenseRuleRequest request);

    CompletableFuture<DescribeDefenseRulesResponse> describeDefenseRules(DescribeDefenseRulesRequest request);

    CompletableFuture<DescribeDefenseTemplateResponse> describeDefenseTemplate(DescribeDefenseTemplateRequest request);

    CompletableFuture<DescribeDefenseTemplateValidGroupsResponse> describeDefenseTemplateValidGroups(DescribeDefenseTemplateValidGroupsRequest request);

    CompletableFuture<DescribeDefenseTemplatesResponse> describeDefenseTemplates(DescribeDefenseTemplatesRequest request);

    CompletableFuture<DescribeDomainDNSRecordResponse> describeDomainDNSRecord(DescribeDomainDNSRecordRequest request);

    CompletableFuture<DescribeDomainDetailResponse> describeDomainDetail(DescribeDomainDetailRequest request);

    CompletableFuture<DescribeDomainsResponse> describeDomains(DescribeDomainsRequest request);

    CompletableFuture<DescribeFlowChartResponse> describeFlowChart(DescribeFlowChartRequest request);

    CompletableFuture<DescribeFlowTopResourceResponse> describeFlowTopResource(DescribeFlowTopResourceRequest request);

    CompletableFuture<DescribeFlowTopUrlResponse> describeFlowTopUrl(DescribeFlowTopUrlRequest request);

    CompletableFuture<DescribeHybridCloudGroupsResponse> describeHybridCloudGroups(DescribeHybridCloudGroupsRequest request);

    CompletableFuture<DescribeHybridCloudResourcesResponse> describeHybridCloudResources(DescribeHybridCloudResourcesRequest request);

    CompletableFuture<DescribeHybridCloudUserResponse> describeHybridCloudUser(DescribeHybridCloudUserRequest request);

    CompletableFuture<DescribeInstanceResponse> describeInstance(DescribeInstanceRequest request);

    CompletableFuture<DescribeMajorProtectionBlackIpsResponse> describeMajorProtectionBlackIps(DescribeMajorProtectionBlackIpsRequest request);

    CompletableFuture<DescribeMemberAccountsResponse> describeMemberAccounts(DescribeMemberAccountsRequest request);

    CompletableFuture<DescribePauseProtectionStatusResponse> describePauseProtectionStatus(DescribePauseProtectionStatusRequest request);

    CompletableFuture<DescribePeakTrendResponse> describePeakTrend(DescribePeakTrendRequest request);

    CompletableFuture<DescribeProductInstancesResponse> describeProductInstances(DescribeProductInstancesRequest request);

    CompletableFuture<DescribePunishedDomainsResponse> describePunishedDomains(DescribePunishedDomainsRequest request);

    CompletableFuture<DescribeResourceInstanceCertsResponse> describeResourceInstanceCerts(DescribeResourceInstanceCertsRequest request);

    CompletableFuture<DescribeResourceLogStatusResponse> describeResourceLogStatus(DescribeResourceLogStatusRequest request);

    CompletableFuture<DescribeResourcePortResponse> describeResourcePort(DescribeResourcePortRequest request);

    CompletableFuture<DescribeResourceRegionIdResponse> describeResourceRegionId(DescribeResourceRegionIdRequest request);

    CompletableFuture<DescribeResourceSupportRegionsResponse> describeResourceSupportRegions(DescribeResourceSupportRegionsRequest request);

    CompletableFuture<DescribeResponseCodeTrendGraphResponse> describeResponseCodeTrendGraph(DescribeResponseCodeTrendGraphRequest request);

    CompletableFuture<DescribeRuleGroupsResponse> describeRuleGroups(DescribeRuleGroupsRequest request);

    CompletableFuture<DescribeRuleHitsTopClientIpResponse> describeRuleHitsTopClientIp(DescribeRuleHitsTopClientIpRequest request);

    CompletableFuture<DescribeRuleHitsTopResourceResponse> describeRuleHitsTopResource(DescribeRuleHitsTopResourceRequest request);

    CompletableFuture<DescribeRuleHitsTopRuleIdResponse> describeRuleHitsTopRuleId(DescribeRuleHitsTopRuleIdRequest request);

    CompletableFuture<DescribeRuleHitsTopTuleTypeResponse> describeRuleHitsTopTuleType(DescribeRuleHitsTopTuleTypeRequest request);

    CompletableFuture<DescribeRuleHitsTopUaResponse> describeRuleHitsTopUa(DescribeRuleHitsTopUaRequest request);

    CompletableFuture<DescribeRuleHitsTopUrlResponse> describeRuleHitsTopUrl(DescribeRuleHitsTopUrlRequest request);

    CompletableFuture<DescribeSlsAuthStatusResponse> describeSlsAuthStatus(DescribeSlsAuthStatusRequest request);

    CompletableFuture<DescribeSlsLogStoreResponse> describeSlsLogStore(DescribeSlsLogStoreRequest request);

    CompletableFuture<DescribeSlsLogStoreStatusResponse> describeSlsLogStoreStatus(DescribeSlsLogStoreStatusRequest request);

    CompletableFuture<DescribeTemplateResourceCountResponse> describeTemplateResourceCount(DescribeTemplateResourceCountRequest request);

    CompletableFuture<DescribeTemplateResourcesResponse> describeTemplateResources(DescribeTemplateResourcesRequest request);

    CompletableFuture<DescribeUserSlsLogRegionsResponse> describeUserSlsLogRegions(DescribeUserSlsLogRegionsRequest request);

    CompletableFuture<DescribeUserWafLogStatusResponse> describeUserWafLogStatus(DescribeUserWafLogStatusRequest request);

    CompletableFuture<DescribeVisitTopIpResponse> describeVisitTopIp(DescribeVisitTopIpRequest request);

    CompletableFuture<DescribeVisitUasResponse> describeVisitUas(DescribeVisitUasRequest request);

    CompletableFuture<DescribeWafSourceIpSegmentResponse> describeWafSourceIpSegment(DescribeWafSourceIpSegmentRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    CompletableFuture<ModifyApisecLogDeliveryResponse> modifyApisecLogDelivery(ModifyApisecLogDeliveryRequest request);

    CompletableFuture<ModifyApisecLogDeliveryStatusResponse> modifyApisecLogDeliveryStatus(ModifyApisecLogDeliveryStatusRequest request);

    CompletableFuture<ModifyDefenseResourceGroupResponse> modifyDefenseResourceGroup(ModifyDefenseResourceGroupRequest request);

    CompletableFuture<ModifyDefenseResourceXffResponse> modifyDefenseResourceXff(ModifyDefenseResourceXffRequest request);

    CompletableFuture<ModifyDefenseRuleResponse> modifyDefenseRule(ModifyDefenseRuleRequest request);

    CompletableFuture<ModifyDefenseRuleCacheResponse> modifyDefenseRuleCache(ModifyDefenseRuleCacheRequest request);

    CompletableFuture<ModifyDefenseRuleStatusResponse> modifyDefenseRuleStatus(ModifyDefenseRuleStatusRequest request);

    CompletableFuture<ModifyDefenseTemplateResponse> modifyDefenseTemplate(ModifyDefenseTemplateRequest request);

    CompletableFuture<ModifyDefenseTemplateStatusResponse> modifyDefenseTemplateStatus(ModifyDefenseTemplateStatusRequest request);

    CompletableFuture<ModifyDomainResponse> modifyDomain(ModifyDomainRequest request);

    CompletableFuture<ModifyDomainPunishStatusResponse> modifyDomainPunishStatus(ModifyDomainPunishStatusRequest request);

    CompletableFuture<ModifyHybridCloudClusterBypassStatusResponse> modifyHybridCloudClusterBypassStatus(ModifyHybridCloudClusterBypassStatusRequest request);

    CompletableFuture<ModifyMajorProtectionBlackIpResponse> modifyMajorProtectionBlackIp(ModifyMajorProtectionBlackIpRequest request);

    CompletableFuture<ModifyMemberAccountResponse> modifyMemberAccount(ModifyMemberAccountRequest request);

    CompletableFuture<ModifyPauseProtectionStatusResponse> modifyPauseProtectionStatus(ModifyPauseProtectionStatusRequest request);

    CompletableFuture<ModifyResourceLogStatusResponse> modifyResourceLogStatus(ModifyResourceLogStatusRequest request);

    CompletableFuture<ModifyTemplateResourcesResponse> modifyTemplateResources(ModifyTemplateResourcesRequest request);

    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
      * SyncProductInstance is an asynchronous operation. You can call the [DescribeProductInstances](~~2743168~~) operation to query the status of the task.
      *
     */
    CompletableFuture<SyncProductInstanceResponse> syncProductInstance(SyncProductInstanceRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
