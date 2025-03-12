// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ddoscoo20171228.models.*;
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
     * @param request the request parameters of AddLayer7CCRule  AddLayer7CCRuleRequest
     * @return AddLayer7CCRuleResponse
     */
    CompletableFuture<AddLayer7CCRuleResponse> addLayer7CCRule(AddLayer7CCRuleRequest request);

    /**
     * @param request the request parameters of CloseDomainSlsConfig  CloseDomainSlsConfigRequest
     * @return CloseDomainSlsConfigResponse
     */
    CompletableFuture<CloseDomainSlsConfigResponse> closeDomainSlsConfig(CloseDomainSlsConfigRequest request);

    /**
     * @param request the request parameters of ConfigHealthCheck  ConfigHealthCheckRequest
     * @return ConfigHealthCheckResponse
     */
    CompletableFuture<ConfigHealthCheckResponse> configHealthCheck(ConfigHealthCheckRequest request);

    /**
     * @param request the request parameters of ConfigLayer4Rule  ConfigLayer4RuleRequest
     * @return ConfigLayer4RuleResponse
     */
    CompletableFuture<ConfigLayer4RuleResponse> configLayer4Rule(ConfigLayer4RuleRequest request);

    /**
     * @param request the request parameters of ConfigLayer4RuleAttribute  ConfigLayer4RuleAttributeRequest
     * @return ConfigLayer4RuleAttributeResponse
     */
    CompletableFuture<ConfigLayer4RuleAttributeResponse> configLayer4RuleAttribute(ConfigLayer4RuleAttributeRequest request);

    /**
     * @param request the request parameters of ConfigLayer7BlackWhiteList  ConfigLayer7BlackWhiteListRequest
     * @return ConfigLayer7BlackWhiteListResponse
     */
    CompletableFuture<ConfigLayer7BlackWhiteListResponse> configLayer7BlackWhiteList(ConfigLayer7BlackWhiteListRequest request);

    /**
     * @param request the request parameters of ConfigLayer7CCRule  ConfigLayer7CCRuleRequest
     * @return ConfigLayer7CCRuleResponse
     */
    CompletableFuture<ConfigLayer7CCRuleResponse> configLayer7CCRule(ConfigLayer7CCRuleRequest request);

    /**
     * @param request the request parameters of ConfigLayer7CCTemplate  ConfigLayer7CCTemplateRequest
     * @return ConfigLayer7CCTemplateResponse
     */
    CompletableFuture<ConfigLayer7CCTemplateResponse> configLayer7CCTemplate(ConfigLayer7CCTemplateRequest request);

    /**
     * @param request the request parameters of ConfigLayer7Cert  ConfigLayer7CertRequest
     * @return ConfigLayer7CertResponse
     */
    CompletableFuture<ConfigLayer7CertResponse> configLayer7Cert(ConfigLayer7CertRequest request);

    /**
     * @param request the request parameters of ConfigLayer7Rule  ConfigLayer7RuleRequest
     * @return ConfigLayer7RuleResponse
     */
    CompletableFuture<ConfigLayer7RuleResponse> configLayer7Rule(ConfigLayer7RuleRequest request);

    /**
     * @param request the request parameters of CreateAsyncTask  CreateAsyncTaskRequest
     * @return CreateAsyncTaskResponse
     */
    CompletableFuture<CreateAsyncTaskResponse> createAsyncTask(CreateAsyncTaskRequest request);

    /**
     * @param request the request parameters of CreateLayer4Rule  CreateLayer4RuleRequest
     * @return CreateLayer4RuleResponse
     */
    CompletableFuture<CreateLayer4RuleResponse> createLayer4Rule(CreateLayer4RuleRequest request);

    /**
     * @param request the request parameters of CreateLayer7Rule  CreateLayer7RuleRequest
     * @return CreateLayer7RuleResponse
     */
    CompletableFuture<CreateLayer7RuleResponse> createLayer7Rule(CreateLayer7RuleRequest request);

    /**
     * @param request the request parameters of DeleteAsyncTask  DeleteAsyncTaskRequest
     * @return DeleteAsyncTaskResponse
     */
    CompletableFuture<DeleteAsyncTaskResponse> deleteAsyncTask(DeleteAsyncTaskRequest request);

    /**
     * @param request the request parameters of DeleteLayer4Rule  DeleteLayer4RuleRequest
     * @return DeleteLayer4RuleResponse
     */
    CompletableFuture<DeleteLayer4RuleResponse> deleteLayer4Rule(DeleteLayer4RuleRequest request);

    /**
     * @param request the request parameters of DeleteLayer7CCRule  DeleteLayer7CCRuleRequest
     * @return DeleteLayer7CCRuleResponse
     */
    CompletableFuture<DeleteLayer7CCRuleResponse> deleteLayer7CCRule(DeleteLayer7CCRuleRequest request);

    /**
     * @param request the request parameters of DeleteLayer7Rule  DeleteLayer7RuleRequest
     * @return DeleteLayer7RuleResponse
     */
    CompletableFuture<DeleteLayer7RuleResponse> deleteLayer7Rule(DeleteLayer7RuleRequest request);

    /**
     * @param request the request parameters of DescribeBackSourceCidr  DescribeBackSourceCidrRequest
     * @return DescribeBackSourceCidrResponse
     */
    CompletableFuture<DescribeBackSourceCidrResponse> describeBackSourceCidr(DescribeBackSourceCidrRequest request);

    /**
     * @param request the request parameters of DescribeBatchSlsDispatchStatus  DescribeBatchSlsDispatchStatusRequest
     * @return DescribeBatchSlsDispatchStatusResponse
     */
    CompletableFuture<DescribeBatchSlsDispatchStatusResponse> describeBatchSlsDispatchStatus(DescribeBatchSlsDispatchStatusRequest request);

    /**
     * @param request the request parameters of DescribeDDoSEvents  DescribeDDoSEventsRequest
     * @return DescribeDDoSEventsResponse
     */
    CompletableFuture<DescribeDDoSEventsResponse> describeDDoSEvents(DescribeDDoSEventsRequest request);

    /**
     * @param request the request parameters of DescribeDDoSTraffic  DescribeDDoSTrafficRequest
     * @return DescribeDDoSTrafficResponse
     */
    CompletableFuture<DescribeDDoSTrafficResponse> describeDDoSTraffic(DescribeDDoSTrafficRequest request);

    /**
     * @param request the request parameters of DescribeDefenseCountStatistics  DescribeDefenseCountStatisticsRequest
     * @return DescribeDefenseCountStatisticsResponse
     */
    CompletableFuture<DescribeDefenseCountStatisticsResponse> describeDefenseCountStatistics(DescribeDefenseCountStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeDomainAccessMode  DescribeDomainAccessModeRequest
     * @return DescribeDomainAccessModeResponse
     */
    CompletableFuture<DescribeDomainAccessModeResponse> describeDomainAccessMode(DescribeDomainAccessModeRequest request);

    /**
     * @param request the request parameters of DescribeDomainAttackEventList  DescribeDomainAttackEventListRequest
     * @return DescribeDomainAttackEventListResponse
     */
    CompletableFuture<DescribeDomainAttackEventListResponse> describeDomainAttackEventList(DescribeDomainAttackEventListRequest request);

    /**
     * @param request the request parameters of DescribeDomainAttackMaxQps  DescribeDomainAttackMaxQpsRequest
     * @return DescribeDomainAttackMaxQpsResponse
     */
    CompletableFuture<DescribeDomainAttackMaxQpsResponse> describeDomainAttackMaxQps(DescribeDomainAttackMaxQpsRequest request);

    /**
     * @param request the request parameters of DescribeDomainOverview  DescribeDomainOverviewRequest
     * @return DescribeDomainOverviewResponse
     */
    CompletableFuture<DescribeDomainOverviewResponse> describeDomainOverview(DescribeDomainOverviewRequest request);

    /**
     * @param request the request parameters of DescribeDomainQpsList  DescribeDomainQpsListRequest
     * @return DescribeDomainQpsListResponse
     */
    CompletableFuture<DescribeDomainQpsListResponse> describeDomainQpsList(DescribeDomainQpsListRequest request);

    /**
     * @param request the request parameters of DescribeDomainQpsWithCache  DescribeDomainQpsWithCacheRequest
     * @return DescribeDomainQpsWithCacheResponse
     */
    CompletableFuture<DescribeDomainQpsWithCacheResponse> describeDomainQpsWithCache(DescribeDomainQpsWithCacheRequest request);

    /**
     * @param request the request parameters of DescribeDomainSlsStatus  DescribeDomainSlsStatusRequest
     * @return DescribeDomainSlsStatusResponse
     */
    CompletableFuture<DescribeDomainSlsStatusResponse> describeDomainSlsStatus(DescribeDomainSlsStatusRequest request);

    /**
     * @param request the request parameters of DescribeDomainStatusCodeList  DescribeDomainStatusCodeListRequest
     * @return DescribeDomainStatusCodeListResponse
     */
    CompletableFuture<DescribeDomainStatusCodeListResponse> describeDomainStatusCodeList(DescribeDomainStatusCodeListRequest request);

    /**
     * @param request the request parameters of DescribeDomains  DescribeDomainsRequest
     * @return DescribeDomainsResponse
     */
    CompletableFuture<DescribeDomainsResponse> describeDomains(DescribeDomainsRequest request);

    /**
     * @param request the request parameters of DescribeElasticBandwidthSpec  DescribeElasticBandwidthSpecRequest
     * @return DescribeElasticBandwidthSpecResponse
     */
    CompletableFuture<DescribeElasticBandwidthSpecResponse> describeElasticBandwidthSpec(DescribeElasticBandwidthSpecRequest request);

    /**
     * @param request the request parameters of DescribeHealthCheckList  DescribeHealthCheckListRequest
     * @return DescribeHealthCheckListResponse
     */
    CompletableFuture<DescribeHealthCheckListResponse> describeHealthCheckList(DescribeHealthCheckListRequest request);

    /**
     * @param request the request parameters of DescribeHealthCheckStatusList  DescribeHealthCheckStatusListRequest
     * @return DescribeHealthCheckStatusListResponse
     */
    CompletableFuture<DescribeHealthCheckStatusListResponse> describeHealthCheckStatusList(DescribeHealthCheckStatusListRequest request);

    /**
     * @param request the request parameters of DescribeInstanceDetails  DescribeInstanceDetailsRequest
     * @return DescribeInstanceDetailsResponse
     */
    CompletableFuture<DescribeInstanceDetailsResponse> describeInstanceDetails(DescribeInstanceDetailsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceSpecs  DescribeInstanceSpecsRequest
     * @return DescribeInstanceSpecsResponse
     */
    CompletableFuture<DescribeInstanceSpecsResponse> describeInstanceSpecs(DescribeInstanceSpecsRequest request);

    /**
     * @param request the request parameters of DescribeInstanceStatistics  DescribeInstanceStatisticsRequest
     * @return DescribeInstanceStatisticsResponse
     */
    CompletableFuture<DescribeInstanceStatisticsResponse> describeInstanceStatistics(DescribeInstanceStatisticsRequest request);

    /**
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * @param request the request parameters of DescribeIpTraffic  DescribeIpTrafficRequest
     * @return DescribeIpTrafficResponse
     */
    CompletableFuture<DescribeIpTrafficResponse> describeIpTraffic(DescribeIpTrafficRequest request);

    /**
     * @param request the request parameters of DescribeLayer4RuleAttributes  DescribeLayer4RuleAttributesRequest
     * @return DescribeLayer4RuleAttributesResponse
     */
    CompletableFuture<DescribeLayer4RuleAttributesResponse> describeLayer4RuleAttributes(DescribeLayer4RuleAttributesRequest request);

    /**
     * @param request the request parameters of DescribeLayer4Rules  DescribeLayer4RulesRequest
     * @return DescribeLayer4RulesResponse
     */
    CompletableFuture<DescribeLayer4RulesResponse> describeLayer4Rules(DescribeLayer4RulesRequest request);

    /**
     * @param request the request parameters of DescribeLayer7CCRules  DescribeLayer7CCRulesRequest
     * @return DescribeLayer7CCRulesResponse
     */
    CompletableFuture<DescribeLayer7CCRulesResponse> describeLayer7CCRules(DescribeLayer7CCRulesRequest request);

    /**
     * @param request the request parameters of DescribeLogStoreExistStatus  DescribeLogStoreExistStatusRequest
     * @return DescribeLogStoreExistStatusResponse
     */
    CompletableFuture<DescribeLogStoreExistStatusResponse> describeLogStoreExistStatus(DescribeLogStoreExistStatusRequest request);

    /**
     * @param request the request parameters of DescribeOpEntities  DescribeOpEntitiesRequest
     * @return DescribeOpEntitiesResponse
     */
    CompletableFuture<DescribeOpEntitiesResponse> describeOpEntities(DescribeOpEntitiesRequest request);

    /**
     * @param request the request parameters of DescribeSimpleDomains  DescribeSimpleDomainsRequest
     * @return DescribeSimpleDomainsResponse
     */
    CompletableFuture<DescribeSimpleDomainsResponse> describeSimpleDomains(DescribeSimpleDomainsRequest request);

    /**
     * @param request the request parameters of DescribeSlsAuthStatus  DescribeSlsAuthStatusRequest
     * @return DescribeSlsAuthStatusResponse
     */
    CompletableFuture<DescribeSlsAuthStatusResponse> describeSlsAuthStatus(DescribeSlsAuthStatusRequest request);

    /**
     * @param request the request parameters of DescribeSlsEmptyCount  DescribeSlsEmptyCountRequest
     * @return DescribeSlsEmptyCountResponse
     */
    CompletableFuture<DescribeSlsEmptyCountResponse> describeSlsEmptyCount(DescribeSlsEmptyCountRequest request);

    /**
     * @param request the request parameters of DescribeSlsLogstoreInfo  DescribeSlsLogstoreInfoRequest
     * @return DescribeSlsLogstoreInfoResponse
     */
    CompletableFuture<DescribeSlsLogstoreInfoResponse> describeSlsLogstoreInfo(DescribeSlsLogstoreInfoRequest request);

    /**
     * @param request the request parameters of DescribeSlsOpenStatus  DescribeSlsOpenStatusRequest
     * @return DescribeSlsOpenStatusResponse
     */
    CompletableFuture<DescribeSlsOpenStatusResponse> describeSlsOpenStatus(DescribeSlsOpenStatusRequest request);

    /**
     * @param request the request parameters of DescribleCertList  DescribleCertListRequest
     * @return DescribleCertListResponse
     */
    CompletableFuture<DescribleCertListResponse> describleCertList(DescribleCertListRequest request);

    /**
     * @param request the request parameters of DescribleLayer7InstanceRelations  DescribleLayer7InstanceRelationsRequest
     * @return DescribleLayer7InstanceRelationsResponse
     */
    CompletableFuture<DescribleLayer7InstanceRelationsResponse> describleLayer7InstanceRelations(DescribleLayer7InstanceRelationsRequest request);

    /**
     * @param request the request parameters of DisableLayer7CC  DisableLayer7CCRequest
     * @return DisableLayer7CCResponse
     */
    CompletableFuture<DisableLayer7CCResponse> disableLayer7CC(DisableLayer7CCRequest request);

    /**
     * @param request the request parameters of DisableLayer7CCRule  DisableLayer7CCRuleRequest
     * @return DisableLayer7CCRuleResponse
     */
    CompletableFuture<DisableLayer7CCRuleResponse> disableLayer7CCRule(DisableLayer7CCRuleRequest request);

    /**
     * @param request the request parameters of EmptySlsLogstore  EmptySlsLogstoreRequest
     * @return EmptySlsLogstoreResponse
     */
    CompletableFuture<EmptySlsLogstoreResponse> emptySlsLogstore(EmptySlsLogstoreRequest request);

    /**
     * @param request the request parameters of EnableLayer7CC  EnableLayer7CCRequest
     * @return EnableLayer7CCResponse
     */
    CompletableFuture<EnableLayer7CCResponse> enableLayer7CC(EnableLayer7CCRequest request);

    /**
     * @param request the request parameters of EnableLayer7CCRule  EnableLayer7CCRuleRequest
     * @return EnableLayer7CCRuleResponse
     */
    CompletableFuture<EnableLayer7CCRuleResponse> enableLayer7CCRule(EnableLayer7CCRuleRequest request);

    /**
     * @param request the request parameters of ListAsyncTask  ListAsyncTaskRequest
     * @return ListAsyncTaskResponse
     */
    CompletableFuture<ListAsyncTaskResponse> listAsyncTask(ListAsyncTaskRequest request);

    /**
     * @param request the request parameters of ListLayer7CustomPorts  ListLayer7CustomPortsRequest
     * @return ListLayer7CustomPortsResponse
     */
    CompletableFuture<ListLayer7CustomPortsResponse> listLayer7CustomPorts(ListLayer7CustomPortsRequest request);

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
     * @param request the request parameters of ListValueAdded  ListValueAddedRequest
     * @return ListValueAddedResponse
     */
    CompletableFuture<ListValueAddedResponse> listValueAdded(ListValueAddedRequest request);

    /**
     * @param request the request parameters of ModifyElasticBandWidth  ModifyElasticBandWidthRequest
     * @return ModifyElasticBandWidthResponse
     */
    CompletableFuture<ModifyElasticBandWidthResponse> modifyElasticBandWidth(ModifyElasticBandWidthRequest request);

    /**
     * @param request the request parameters of ModifyFullLogTtl  ModifyFullLogTtlRequest
     * @return ModifyFullLogTtlResponse
     */
    CompletableFuture<ModifyFullLogTtlResponse> modifyFullLogTtl(ModifyFullLogTtlRequest request);

    /**
     * @param request the request parameters of ModifyInstanceRemark  ModifyInstanceRemarkRequest
     * @return ModifyInstanceRemarkResponse
     */
    CompletableFuture<ModifyInstanceRemarkResponse> modifyInstanceRemark(ModifyInstanceRemarkRequest request);

    /**
     * @param request the request parameters of OpenDomainSlsConfig  OpenDomainSlsConfigRequest
     * @return OpenDomainSlsConfigResponse
     */
    CompletableFuture<OpenDomainSlsConfigResponse> openDomainSlsConfig(OpenDomainSlsConfigRequest request);

    /**
     * @param request the request parameters of ReleaseInstance  ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    /**
     * @param request the request parameters of ReleaseValueAdded  ReleaseValueAddedRequest
     * @return ReleaseValueAddedResponse
     */
    CompletableFuture<ReleaseValueAddedResponse> releaseValueAdded(ReleaseValueAddedRequest request);

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
