// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ddoscoo20200101.models.*;
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

    CompletableFuture<AddAutoCcBlacklistResponse> addAutoCcBlacklist(AddAutoCcBlacklistRequest request);

    CompletableFuture<AddAutoCcWhitelistResponse> addAutoCcWhitelist(AddAutoCcWhitelistRequest request);

    CompletableFuture<AssociateWebCertResponse> associateWebCert(AssociateWebCertRequest request);

    CompletableFuture<AttachSceneDefenseObjectResponse> attachSceneDefenseObject(AttachSceneDefenseObjectRequest request);

    CompletableFuture<ConfigL7RsPolicyResponse> configL7RsPolicy(ConfigL7RsPolicyRequest request);

    CompletableFuture<ConfigLayer4RemarkResponse> configLayer4Remark(ConfigLayer4RemarkRequest request);

    CompletableFuture<ConfigLayer4RuleBakModeResponse> configLayer4RuleBakMode(ConfigLayer4RuleBakModeRequest request);

    CompletableFuture<ConfigLayer4RulePolicyResponse> configLayer4RulePolicy(ConfigLayer4RulePolicyRequest request);

    CompletableFuture<ConfigNetworkRegionBlockResponse> configNetworkRegionBlock(ConfigNetworkRegionBlockRequest request);

    CompletableFuture<ConfigNetworkRulesResponse> configNetworkRules(ConfigNetworkRulesRequest request);

    CompletableFuture<ConfigNetworkRulesTfResponse> configNetworkRulesTf(ConfigNetworkRulesTfRequest request);

    CompletableFuture<ConfigUdpReflectResponse> configUdpReflect(ConfigUdpReflectRequest request);

    CompletableFuture<ConfigWebCCTemplateResponse> configWebCCTemplate(ConfigWebCCTemplateRequest request);

    CompletableFuture<ConfigWebIpSetResponse> configWebIpSet(ConfigWebIpSetRequest request);

    CompletableFuture<CreateAsyncTaskResponse> createAsyncTask(CreateAsyncTaskRequest request);

    CompletableFuture<CreateDomainResourceResponse> createDomainResource(CreateDomainResourceRequest request);

    CompletableFuture<CreateNetworkRulesResponse> createNetworkRules(CreateNetworkRulesRequest request);

    CompletableFuture<CreateNetworkRulesTfResponse> createNetworkRulesTf(CreateNetworkRulesTfRequest request);

    CompletableFuture<CreatePortResponse> createPort(CreatePortRequest request);

    CompletableFuture<CreateSceneDefensePolicyResponse> createSceneDefensePolicy(CreateSceneDefensePolicyRequest request);

    CompletableFuture<CreateSchedulerRuleResponse> createSchedulerRule(CreateSchedulerRuleRequest request);

    CompletableFuture<CreateTagResourcesResponse> createTagResources(CreateTagResourcesRequest request);

    CompletableFuture<CreateWebCCRuleResponse> createWebCCRule(CreateWebCCRuleRequest request);

    CompletableFuture<CreateWebRuleResponse> createWebRule(CreateWebRuleRequest request);

    CompletableFuture<CreateWebRuleTfResponse> createWebRuleTf(CreateWebRuleTfRequest request);

    CompletableFuture<DeleteAsyncTaskResponse> deleteAsyncTask(DeleteAsyncTaskRequest request);

    CompletableFuture<DeleteAutoCcBlacklistResponse> deleteAutoCcBlacklist(DeleteAutoCcBlacklistRequest request);

    CompletableFuture<DeleteAutoCcWhitelistResponse> deleteAutoCcWhitelist(DeleteAutoCcWhitelistRequest request);

    CompletableFuture<DeleteDomainResourceResponse> deleteDomainResource(DeleteDomainResourceRequest request);

    CompletableFuture<DeleteNetworkRuleResponse> deleteNetworkRule(DeleteNetworkRuleRequest request);

    CompletableFuture<DeleteNetworkRulesTfResponse> deleteNetworkRulesTf(DeleteNetworkRulesTfRequest request);

    CompletableFuture<DeletePortResponse> deletePort(DeletePortRequest request);

    CompletableFuture<DeleteSceneDefensePolicyResponse> deleteSceneDefensePolicy(DeleteSceneDefensePolicyRequest request);

    CompletableFuture<DeleteSchedulerRuleResponse> deleteSchedulerRule(DeleteSchedulerRuleRequest request);

    CompletableFuture<DeleteTagResourcesResponse> deleteTagResources(DeleteTagResourcesRequest request);

    CompletableFuture<DeleteWebCCRuleResponse> deleteWebCCRule(DeleteWebCCRuleRequest request);

    CompletableFuture<DeleteWebCacheCustomRuleResponse> deleteWebCacheCustomRule(DeleteWebCacheCustomRuleRequest request);

    CompletableFuture<DeleteWebPreciseAccessRuleResponse> deleteWebPreciseAccessRule(DeleteWebPreciseAccessRuleRequest request);

    CompletableFuture<DeleteWebRuleResponse> deleteWebRule(DeleteWebRuleRequest request);

    CompletableFuture<DeleteWebRuleTfResponse> deleteWebRuleTf(DeleteWebRuleTfRequest request);

    CompletableFuture<DescribeAsyncTasksResponse> describeAsyncTasks(DescribeAsyncTasksRequest request);

    CompletableFuture<DescribeAttackAnalysisMaxQpsResponse> describeAttackAnalysisMaxQps(DescribeAttackAnalysisMaxQpsRequest request);

    CompletableFuture<DescribeAutoCcBlacklistResponse> describeAutoCcBlacklist(DescribeAutoCcBlacklistRequest request);

    CompletableFuture<DescribeAutoCcListCountResponse> describeAutoCcListCount(DescribeAutoCcListCountRequest request);

    CompletableFuture<DescribeAutoCcWhitelistResponse> describeAutoCcWhitelist(DescribeAutoCcWhitelistRequest request);

    CompletableFuture<DescribeBackSourceCidrResponse> describeBackSourceCidr(DescribeBackSourceCidrRequest request);

    CompletableFuture<DescribeBlackholeStatusResponse> describeBlackholeStatus(DescribeBlackholeStatusRequest request);

    CompletableFuture<DescribeBlockStatusResponse> describeBlockStatus(DescribeBlockStatusRequest request);

    CompletableFuture<DescribeCertsResponse> describeCerts(DescribeCertsRequest request);

    CompletableFuture<DescribeCnameReusesResponse> describeCnameReuses(DescribeCnameReusesRequest request);

    CompletableFuture<DescribeDDoSEventsResponse> describeDDoSEvents(DescribeDDoSEventsRequest request);

    CompletableFuture<DescribeDDosAllEventListResponse> describeDDosAllEventList(DescribeDDosAllEventListRequest request);

    CompletableFuture<DescribeDDosEventAreaResponse> describeDDosEventArea(DescribeDDosEventAreaRequest request);

    CompletableFuture<DescribeDDosEventAttackTypeResponse> describeDDosEventAttackType(DescribeDDosEventAttackTypeRequest request);

    CompletableFuture<DescribeDDosEventIspResponse> describeDDosEventIsp(DescribeDDosEventIspRequest request);

    CompletableFuture<DescribeDDosEventMaxResponse> describeDDosEventMax(DescribeDDosEventMaxRequest request);

    CompletableFuture<DescribeDDosEventSrcIpResponse> describeDDosEventSrcIp(DescribeDDosEventSrcIpRequest request);

    CompletableFuture<DescribeDefenseCountStatisticsResponse> describeDefenseCountStatistics(DescribeDefenseCountStatisticsRequest request);

    CompletableFuture<DescribeDefenseRecordsResponse> describeDefenseRecords(DescribeDefenseRecordsRequest request);

    CompletableFuture<DescribeDomainAttackEventsResponse> describeDomainAttackEvents(DescribeDomainAttackEventsRequest request);

    CompletableFuture<DescribeDomainOverviewResponse> describeDomainOverview(DescribeDomainOverviewRequest request);

    CompletableFuture<DescribeDomainQPSListResponse> describeDomainQPSList(DescribeDomainQPSListRequest request);

    CompletableFuture<DescribeDomainQpsWithCacheResponse> describeDomainQpsWithCache(DescribeDomainQpsWithCacheRequest request);

    CompletableFuture<DescribeDomainResourceResponse> describeDomainResource(DescribeDomainResourceRequest request);

    CompletableFuture<DescribeDomainStatusCodeCountResponse> describeDomainStatusCodeCount(DescribeDomainStatusCodeCountRequest request);

    CompletableFuture<DescribeDomainStatusCodeListResponse> describeDomainStatusCodeList(DescribeDomainStatusCodeListRequest request);

    CompletableFuture<DescribeDomainTopAttackListResponse> describeDomainTopAttackList(DescribeDomainTopAttackListRequest request);

    CompletableFuture<DescribeDomainViewSourceCountriesResponse> describeDomainViewSourceCountries(DescribeDomainViewSourceCountriesRequest request);

    CompletableFuture<DescribeDomainViewSourceProvincesResponse> describeDomainViewSourceProvinces(DescribeDomainViewSourceProvincesRequest request);

    CompletableFuture<DescribeDomainViewTopCostTimeResponse> describeDomainViewTopCostTime(DescribeDomainViewTopCostTimeRequest request);

    CompletableFuture<DescribeDomainViewTopUrlResponse> describeDomainViewTopUrl(DescribeDomainViewTopUrlRequest request);

    CompletableFuture<DescribeDomainsResponse> describeDomains(DescribeDomainsRequest request);

    CompletableFuture<DescribeElasticBandwidthSpecResponse> describeElasticBandwidthSpec(DescribeElasticBandwidthSpecRequest request);

    CompletableFuture<DescribeHealthCheckListResponse> describeHealthCheckList(DescribeHealthCheckListRequest request);

    CompletableFuture<DescribeHealthCheckStatusResponse> describeHealthCheckStatus(DescribeHealthCheckStatusRequest request);

    CompletableFuture<DescribeInstanceDetailsResponse> describeInstanceDetails(DescribeInstanceDetailsRequest request);

    CompletableFuture<DescribeInstanceIdsResponse> describeInstanceIds(DescribeInstanceIdsRequest request);

    CompletableFuture<DescribeInstanceSpecsResponse> describeInstanceSpecs(DescribeInstanceSpecsRequest request);

    CompletableFuture<DescribeInstanceStatisticsResponse> describeInstanceStatistics(DescribeInstanceStatisticsRequest request);

    CompletableFuture<DescribeInstanceStatusResponse> describeInstanceStatus(DescribeInstanceStatusRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeL7RsPolicyResponse> describeL7RsPolicy(DescribeL7RsPolicyRequest request);

    CompletableFuture<DescribeLayer4RulePolicyResponse> describeLayer4RulePolicy(DescribeLayer4RulePolicyRequest request);

    CompletableFuture<DescribeLogStoreExistStatusResponse> describeLogStoreExistStatus(DescribeLogStoreExistStatusRequest request);

    CompletableFuture<DescribeNetworkRegionBlockResponse> describeNetworkRegionBlock(DescribeNetworkRegionBlockRequest request);

    CompletableFuture<DescribeNetworkRuleAttributesResponse> describeNetworkRuleAttributes(DescribeNetworkRuleAttributesRequest request);

    CompletableFuture<DescribeNetworkRulesResponse> describeNetworkRules(DescribeNetworkRulesRequest request);

    CompletableFuture<DescribeNetworkRulesTfResponse> describeNetworkRulesTf(DescribeNetworkRulesTfRequest request);

    CompletableFuture<DescribeOpEntitiesResponse> describeOpEntities(DescribeOpEntitiesRequest request);

    CompletableFuture<DescribePortResponse> describePort(DescribePortRequest request);

    CompletableFuture<DescribePortAttackMaxFlowResponse> describePortAttackMaxFlow(DescribePortAttackMaxFlowRequest request);

    CompletableFuture<DescribePortAutoCcStatusResponse> describePortAutoCcStatus(DescribePortAutoCcStatusRequest request);

    CompletableFuture<DescribePortConnsCountResponse> describePortConnsCount(DescribePortConnsCountRequest request);

    CompletableFuture<DescribePortConnsListResponse> describePortConnsList(DescribePortConnsListRequest request);

    CompletableFuture<DescribePortFlowListResponse> describePortFlowList(DescribePortFlowListRequest request);

    CompletableFuture<DescribePortMaxConnsResponse> describePortMaxConns(DescribePortMaxConnsRequest request);

    CompletableFuture<DescribePortViewSourceCountriesResponse> describePortViewSourceCountries(DescribePortViewSourceCountriesRequest request);

    CompletableFuture<DescribePortViewSourceIspsResponse> describePortViewSourceIsps(DescribePortViewSourceIspsRequest request);

    CompletableFuture<DescribePortViewSourceProvincesResponse> describePortViewSourceProvinces(DescribePortViewSourceProvincesRequest request);

    CompletableFuture<DescribeSceneDefenseObjectsResponse> describeSceneDefenseObjects(DescribeSceneDefenseObjectsRequest request);

    CompletableFuture<DescribeSceneDefensePoliciesResponse> describeSceneDefensePolicies(DescribeSceneDefensePoliciesRequest request);

    CompletableFuture<DescribeSchedulerRulesResponse> describeSchedulerRules(DescribeSchedulerRulesRequest request);

    CompletableFuture<DescribeSlsAuthStatusResponse> describeSlsAuthStatus(DescribeSlsAuthStatusRequest request);

    CompletableFuture<DescribeSlsLogstoreInfoResponse> describeSlsLogstoreInfo(DescribeSlsLogstoreInfoRequest request);

    CompletableFuture<DescribeSlsOpenStatusResponse> describeSlsOpenStatus(DescribeSlsOpenStatusRequest request);

    CompletableFuture<DescribeStsGrantStatusResponse> describeStsGrantStatus(DescribeStsGrantStatusRequest request);

    CompletableFuture<DescribeSystemLogResponse> describeSystemLog(DescribeSystemLogRequest request);

    CompletableFuture<DescribeTagKeysResponse> describeTagKeys(DescribeTagKeysRequest request);

    CompletableFuture<DescribeTagResourcesResponse> describeTagResources(DescribeTagResourcesRequest request);

    CompletableFuture<DescribeUdpReflectResponse> describeUdpReflect(DescribeUdpReflectRequest request);

    CompletableFuture<DescribeUnBlackholeCountResponse> describeUnBlackholeCount(DescribeUnBlackholeCountRequest request);

    CompletableFuture<DescribeUnBlockCountResponse> describeUnBlockCount(DescribeUnBlockCountRequest request);

    CompletableFuture<DescribeWebAccessLogDispatchStatusResponse> describeWebAccessLogDispatchStatus(DescribeWebAccessLogDispatchStatusRequest request);

    CompletableFuture<DescribeWebAccessLogEmptyCountResponse> describeWebAccessLogEmptyCount(DescribeWebAccessLogEmptyCountRequest request);

    CompletableFuture<DescribeWebAccessLogStatusResponse> describeWebAccessLogStatus(DescribeWebAccessLogStatusRequest request);

    CompletableFuture<DescribeWebAccessModeResponse> describeWebAccessMode(DescribeWebAccessModeRequest request);

    CompletableFuture<DescribeWebAreaBlockConfigsResponse> describeWebAreaBlockConfigs(DescribeWebAreaBlockConfigsRequest request);

    CompletableFuture<DescribeWebCCRulesResponse> describeWebCCRules(DescribeWebCCRulesRequest request);

    CompletableFuture<DescribeWebCacheConfigsResponse> describeWebCacheConfigs(DescribeWebCacheConfigsRequest request);

    CompletableFuture<DescribeWebCcProtectSwitchResponse> describeWebCcProtectSwitch(DescribeWebCcProtectSwitchRequest request);

    CompletableFuture<DescribeWebCustomPortsResponse> describeWebCustomPorts(DescribeWebCustomPortsRequest request);

    CompletableFuture<DescribeWebInstanceRelationsResponse> describeWebInstanceRelations(DescribeWebInstanceRelationsRequest request);

    CompletableFuture<DescribeWebPreciseAccessRuleResponse> describeWebPreciseAccessRule(DescribeWebPreciseAccessRuleRequest request);

    CompletableFuture<DescribeWebRulesResponse> describeWebRules(DescribeWebRulesRequest request);

    CompletableFuture<DescribeWebRulesTfResponse> describeWebRulesTf(DescribeWebRulesTfRequest request);

    CompletableFuture<DetachSceneDefenseObjectResponse> detachSceneDefenseObject(DetachSceneDefenseObjectRequest request);

    CompletableFuture<DisableSceneDefensePolicyResponse> disableSceneDefensePolicy(DisableSceneDefensePolicyRequest request);

    CompletableFuture<DisableWebAccessLogConfigResponse> disableWebAccessLogConfig(DisableWebAccessLogConfigRequest request);

    CompletableFuture<DisableWebCCResponse> disableWebCC(DisableWebCCRequest request);

    CompletableFuture<DisableWebCCRuleResponse> disableWebCCRule(DisableWebCCRuleRequest request);

    CompletableFuture<EmptyAutoCcBlacklistResponse> emptyAutoCcBlacklist(EmptyAutoCcBlacklistRequest request);

    CompletableFuture<EmptyAutoCcWhitelistResponse> emptyAutoCcWhitelist(EmptyAutoCcWhitelistRequest request);

    CompletableFuture<EmptySlsLogstoreResponse> emptySlsLogstore(EmptySlsLogstoreRequest request);

    CompletableFuture<EnableSceneDefensePolicyResponse> enableSceneDefensePolicy(EnableSceneDefensePolicyRequest request);

    CompletableFuture<EnableWebAccessLogConfigResponse> enableWebAccessLogConfig(EnableWebAccessLogConfigRequest request);

    CompletableFuture<EnableWebCCResponse> enableWebCC(EnableWebCCRequest request);

    CompletableFuture<EnableWebCCRuleResponse> enableWebCCRule(EnableWebCCRuleRequest request);

    CompletableFuture<ModifyBlackholeStatusResponse> modifyBlackholeStatus(ModifyBlackholeStatusRequest request);

    CompletableFuture<ModifyBlockStatusResponse> modifyBlockStatus(ModifyBlockStatusRequest request);

    CompletableFuture<ModifyCnameReuseResponse> modifyCnameReuse(ModifyCnameReuseRequest request);

    CompletableFuture<ModifyDomainResourceResponse> modifyDomainResource(ModifyDomainResourceRequest request);

    CompletableFuture<ModifyElasticBandWidthResponse> modifyElasticBandWidth(ModifyElasticBandWidthRequest request);

    CompletableFuture<ModifyFullLogTtlResponse> modifyFullLogTtl(ModifyFullLogTtlRequest request);

    CompletableFuture<ModifyHealthCheckConfigResponse> modifyHealthCheckConfig(ModifyHealthCheckConfigRequest request);

    CompletableFuture<ModifyHttp2EnableResponse> modifyHttp2Enable(ModifyHttp2EnableRequest request);

    CompletableFuture<ModifyInstanceRemarkResponse> modifyInstanceRemark(ModifyInstanceRemarkRequest request);

    CompletableFuture<ModifyNetworkRuleAttributeResponse> modifyNetworkRuleAttribute(ModifyNetworkRuleAttributeRequest request);

    CompletableFuture<ModifyPortResponse> modifyPort(ModifyPortRequest request);

    CompletableFuture<ModifyPortAutoCcStatusResponse> modifyPortAutoCcStatus(ModifyPortAutoCcStatusRequest request);

    CompletableFuture<ModifySceneDefensePolicyResponse> modifySceneDefensePolicy(ModifySceneDefensePolicyRequest request);

    CompletableFuture<ModifySchedulerRuleResponse> modifySchedulerRule(ModifySchedulerRuleRequest request);

    CompletableFuture<ModifyTlsConfigResponse> modifyTlsConfig(ModifyTlsConfigRequest request);

    CompletableFuture<ModifyWebAIProtectModeResponse> modifyWebAIProtectMode(ModifyWebAIProtectModeRequest request);

    CompletableFuture<ModifyWebAIProtectSwitchResponse> modifyWebAIProtectSwitch(ModifyWebAIProtectSwitchRequest request);

    CompletableFuture<ModifyWebAccessModeResponse> modifyWebAccessMode(ModifyWebAccessModeRequest request);

    CompletableFuture<ModifyWebAreaBlockResponse> modifyWebAreaBlock(ModifyWebAreaBlockRequest request);

    CompletableFuture<ModifyWebAreaBlockSwitchResponse> modifyWebAreaBlockSwitch(ModifyWebAreaBlockSwitchRequest request);

    CompletableFuture<ModifyWebCCRuleResponse> modifyWebCCRule(ModifyWebCCRuleRequest request);

    CompletableFuture<ModifyWebCacheCustomRuleResponse> modifyWebCacheCustomRule(ModifyWebCacheCustomRuleRequest request);

    CompletableFuture<ModifyWebCacheModeResponse> modifyWebCacheMode(ModifyWebCacheModeRequest request);

    CompletableFuture<ModifyWebCacheSwitchResponse> modifyWebCacheSwitch(ModifyWebCacheSwitchRequest request);

    CompletableFuture<ModifyWebIpSetSwitchResponse> modifyWebIpSetSwitch(ModifyWebIpSetSwitchRequest request);

    CompletableFuture<ModifyWebPreciseAccessRuleResponse> modifyWebPreciseAccessRule(ModifyWebPreciseAccessRuleRequest request);

    CompletableFuture<ModifyWebPreciseAccessSwitchResponse> modifyWebPreciseAccessSwitch(ModifyWebPreciseAccessSwitchRequest request);

    CompletableFuture<ModifyWebRuleResponse> modifyWebRule(ModifyWebRuleRequest request);

    CompletableFuture<ModifyWebRuleTfResponse> modifyWebRuleTf(ModifyWebRuleTfRequest request);

    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    CompletableFuture<SwitchSchedulerRuleResponse> switchSchedulerRule(SwitchSchedulerRuleRequest request);

}
