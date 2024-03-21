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

    CompletableFuture<CreateDefenseResourceGroupResponse> createDefenseResourceGroup(CreateDefenseResourceGroupRequest request);

    CompletableFuture<CreateDefenseRuleResponse> createDefenseRule(CreateDefenseRuleRequest request);

    CompletableFuture<CreateDefenseTemplateResponse> createDefenseTemplate(CreateDefenseTemplateRequest request);

    CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request);

    /**
      * This operation is available only on the China site (aliyun.com).
      *
     */
    CompletableFuture<CreateMajorProtectionBlackIpResponse> createMajorProtectionBlackIp(CreateMajorProtectionBlackIpRequest request);

    CompletableFuture<DeleteDefenseResourceGroupResponse> deleteDefenseResourceGroup(DeleteDefenseResourceGroupRequest request);

    CompletableFuture<DeleteDefenseRuleResponse> deleteDefenseRule(DeleteDefenseRuleRequest request);

    CompletableFuture<DeleteDefenseTemplateResponse> deleteDefenseTemplate(DeleteDefenseTemplateRequest request);

    CompletableFuture<DeleteDomainResponse> deleteDomain(DeleteDomainRequest request);

    CompletableFuture<DeleteMajorProtectionBlackIpResponse> deleteMajorProtectionBlackIp(DeleteMajorProtectionBlackIpRequest request);

    CompletableFuture<DescribeDefenseResourceGroupResponse> describeDefenseResourceGroup(DescribeDefenseResourceGroupRequest request);

    CompletableFuture<DescribeDefenseResourceTemplatesResponse> describeDefenseResourceTemplates(DescribeDefenseResourceTemplatesRequest request);

    CompletableFuture<DescribeDefenseResourcesResponse> describeDefenseResources(DescribeDefenseResourcesRequest request);

    CompletableFuture<DescribeDefenseRuleResponse> describeDefenseRule(DescribeDefenseRuleRequest request);

    CompletableFuture<DescribeDefenseRulesResponse> describeDefenseRules(DescribeDefenseRulesRequest request);

    CompletableFuture<DescribeDefenseTemplateResponse> describeDefenseTemplate(DescribeDefenseTemplateRequest request);

    CompletableFuture<DescribeDefenseTemplatesResponse> describeDefenseTemplates(DescribeDefenseTemplatesRequest request);

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

    CompletableFuture<DescribePeakTrendResponse> describePeakTrend(DescribePeakTrendRequest request);

    CompletableFuture<DescribeResourceLogStatusResponse> describeResourceLogStatus(DescribeResourceLogStatusRequest request);

    CompletableFuture<DescribeResourcePortResponse> describeResourcePort(DescribeResourcePortRequest request);

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

    CompletableFuture<DescribeTemplateResourcesResponse> describeTemplateResources(DescribeTemplateResourcesRequest request);

    CompletableFuture<DescribeUserSlsLogRegionsResponse> describeUserSlsLogRegions(DescribeUserSlsLogRegionsRequest request);

    CompletableFuture<DescribeUserWafLogStatusResponse> describeUserWafLogStatus(DescribeUserWafLogStatusRequest request);

    CompletableFuture<DescribeVisitTopIpResponse> describeVisitTopIp(DescribeVisitTopIpRequest request);

    CompletableFuture<DescribeVisitUasResponse> describeVisitUas(DescribeVisitUasRequest request);

    CompletableFuture<DescribeWafSourceIpSegmentResponse> describeWafSourceIpSegment(DescribeWafSourceIpSegmentRequest request);

    CompletableFuture<ModifyDefenseResourceGroupResponse> modifyDefenseResourceGroup(ModifyDefenseResourceGroupRequest request);

    CompletableFuture<ModifyDefenseRuleResponse> modifyDefenseRule(ModifyDefenseRuleRequest request);

    CompletableFuture<ModifyDefenseRuleStatusResponse> modifyDefenseRuleStatus(ModifyDefenseRuleStatusRequest request);

    CompletableFuture<ModifyDefenseTemplateResponse> modifyDefenseTemplate(ModifyDefenseTemplateRequest request);

    CompletableFuture<ModifyDefenseTemplateStatusResponse> modifyDefenseTemplateStatus(ModifyDefenseTemplateStatusRequest request);

    CompletableFuture<ModifyDomainResponse> modifyDomain(ModifyDomainRequest request);

    CompletableFuture<ModifyHybridCloudClusterBypassStatusResponse> modifyHybridCloudClusterBypassStatus(ModifyHybridCloudClusterBypassStatusRequest request);

    CompletableFuture<ModifyMajorProtectionBlackIpResponse> modifyMajorProtectionBlackIp(ModifyMajorProtectionBlackIpRequest request);

    CompletableFuture<ModifyResourceLogStatusResponse> modifyResourceLogStatus(ModifyResourceLogStatusRequest request);

    CompletableFuture<ModifyTemplateResourcesResponse> modifyTemplateResources(ModifyTemplateResourcesRequest request);

}
