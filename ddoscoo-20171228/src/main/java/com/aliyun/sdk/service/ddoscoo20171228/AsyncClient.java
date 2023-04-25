// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ddoscoo20171228.models.*;
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

    CompletableFuture<AddLayer7CCRuleResponse> addLayer7CCRule(AddLayer7CCRuleRequest request);

    CompletableFuture<CloseDomainSlsConfigResponse> closeDomainSlsConfig(CloseDomainSlsConfigRequest request);

    CompletableFuture<ConfigHealthCheckResponse> configHealthCheck(ConfigHealthCheckRequest request);

    CompletableFuture<ConfigLayer4RuleResponse> configLayer4Rule(ConfigLayer4RuleRequest request);

    CompletableFuture<ConfigLayer4RuleAttributeResponse> configLayer4RuleAttribute(ConfigLayer4RuleAttributeRequest request);

    CompletableFuture<ConfigLayer7BlackWhiteListResponse> configLayer7BlackWhiteList(ConfigLayer7BlackWhiteListRequest request);

    CompletableFuture<ConfigLayer7CCRuleResponse> configLayer7CCRule(ConfigLayer7CCRuleRequest request);

    CompletableFuture<ConfigLayer7CCTemplateResponse> configLayer7CCTemplate(ConfigLayer7CCTemplateRequest request);

    CompletableFuture<ConfigLayer7CertResponse> configLayer7Cert(ConfigLayer7CertRequest request);

    CompletableFuture<ConfigLayer7RuleResponse> configLayer7Rule(ConfigLayer7RuleRequest request);

    CompletableFuture<CreateAsyncTaskResponse> createAsyncTask(CreateAsyncTaskRequest request);

    CompletableFuture<CreateLayer4RuleResponse> createLayer4Rule(CreateLayer4RuleRequest request);

    CompletableFuture<CreateLayer7RuleResponse> createLayer7Rule(CreateLayer7RuleRequest request);

    CompletableFuture<DeleteAsyncTaskResponse> deleteAsyncTask(DeleteAsyncTaskRequest request);

    CompletableFuture<DeleteLayer4RuleResponse> deleteLayer4Rule(DeleteLayer4RuleRequest request);

    CompletableFuture<DeleteLayer7CCRuleResponse> deleteLayer7CCRule(DeleteLayer7CCRuleRequest request);

    CompletableFuture<DeleteLayer7RuleResponse> deleteLayer7Rule(DeleteLayer7RuleRequest request);

    CompletableFuture<DescribeBackSourceCidrResponse> describeBackSourceCidr(DescribeBackSourceCidrRequest request);

    CompletableFuture<DescribeBatchSlsDispatchStatusResponse> describeBatchSlsDispatchStatus(DescribeBatchSlsDispatchStatusRequest request);

    CompletableFuture<DescribeDDoSEventsResponse> describeDDoSEvents(DescribeDDoSEventsRequest request);

    CompletableFuture<DescribeDDoSTrafficResponse> describeDDoSTraffic(DescribeDDoSTrafficRequest request);

    CompletableFuture<DescribeDefenseCountStatisticsResponse> describeDefenseCountStatistics(DescribeDefenseCountStatisticsRequest request);

    CompletableFuture<DescribeDomainAccessModeResponse> describeDomainAccessMode(DescribeDomainAccessModeRequest request);

    CompletableFuture<DescribeDomainAttackEventListResponse> describeDomainAttackEventList(DescribeDomainAttackEventListRequest request);

    CompletableFuture<DescribeDomainAttackEventsResponse> describeDomainAttackEvents(DescribeDomainAttackEventsRequest request);

    CompletableFuture<DescribeDomainAttackMaxQpsResponse> describeDomainAttackMaxQps(DescribeDomainAttackMaxQpsRequest request);

    CompletableFuture<DescribeDomainOverviewResponse> describeDomainOverview(DescribeDomainOverviewRequest request);

    CompletableFuture<DescribeDomainQpsResponse> describeDomainQps(DescribeDomainQpsRequest request);

    CompletableFuture<DescribeDomainQpsListResponse> describeDomainQpsList(DescribeDomainQpsListRequest request);

    CompletableFuture<DescribeDomainQpsWithCacheResponse> describeDomainQpsWithCache(DescribeDomainQpsWithCacheRequest request);

    CompletableFuture<DescribeDomainSlsStatusResponse> describeDomainSlsStatus(DescribeDomainSlsStatusRequest request);

    CompletableFuture<DescribeDomainStatusCodeListResponse> describeDomainStatusCodeList(DescribeDomainStatusCodeListRequest request);

    CompletableFuture<DescribeDomainsResponse> describeDomains(DescribeDomainsRequest request);

    CompletableFuture<DescribeElasticBandwidthSpecResponse> describeElasticBandwidthSpec(DescribeElasticBandwidthSpecRequest request);

    CompletableFuture<DescribeHealthCheckListResponse> describeHealthCheckList(DescribeHealthCheckListRequest request);

    CompletableFuture<DescribeHealthCheckStatusListResponse> describeHealthCheckStatusList(DescribeHealthCheckStatusListRequest request);

    CompletableFuture<DescribeInstanceDetailsResponse> describeInstanceDetails(DescribeInstanceDetailsRequest request);

    CompletableFuture<DescribeInstanceSpecsResponse> describeInstanceSpecs(DescribeInstanceSpecsRequest request);

    CompletableFuture<DescribeInstanceStatisticsResponse> describeInstanceStatistics(DescribeInstanceStatisticsRequest request);

    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    CompletableFuture<DescribeIpTrafficResponse> describeIpTraffic(DescribeIpTrafficRequest request);

    CompletableFuture<DescribeLayer4RuleAttributesResponse> describeLayer4RuleAttributes(DescribeLayer4RuleAttributesRequest request);

    CompletableFuture<DescribeLayer4RulesResponse> describeLayer4Rules(DescribeLayer4RulesRequest request);

    CompletableFuture<DescribeLayer7CCRulesResponse> describeLayer7CCRules(DescribeLayer7CCRulesRequest request);

    CompletableFuture<DescribeLogStoreExistStatusResponse> describeLogStoreExistStatus(DescribeLogStoreExistStatusRequest request);

    CompletableFuture<DescribeOpEntitiesResponse> describeOpEntities(DescribeOpEntitiesRequest request);

    CompletableFuture<DescribeSimpleDomainsResponse> describeSimpleDomains(DescribeSimpleDomainsRequest request);

    CompletableFuture<DescribeSlsAuthStatusResponse> describeSlsAuthStatus(DescribeSlsAuthStatusRequest request);

    CompletableFuture<DescribeSlsEmptyCountResponse> describeSlsEmptyCount(DescribeSlsEmptyCountRequest request);

    CompletableFuture<DescribeSlsLogstoreInfoResponse> describeSlsLogstoreInfo(DescribeSlsLogstoreInfoRequest request);

    CompletableFuture<DescribeSlsOpenStatusResponse> describeSlsOpenStatus(DescribeSlsOpenStatusRequest request);

    CompletableFuture<DescribleCertListResponse> describleCertList(DescribleCertListRequest request);

    CompletableFuture<DescribleLayer7InstanceRelationsResponse> describleLayer7InstanceRelations(DescribleLayer7InstanceRelationsRequest request);

    CompletableFuture<DisableLayer7CCResponse> disableLayer7CC(DisableLayer7CCRequest request);

    CompletableFuture<DisableLayer7CCRuleResponse> disableLayer7CCRule(DisableLayer7CCRuleRequest request);

    CompletableFuture<EmptySlsLogstoreResponse> emptySlsLogstore(EmptySlsLogstoreRequest request);

    CompletableFuture<EnableLayer7CCResponse> enableLayer7CC(EnableLayer7CCRequest request);

    CompletableFuture<EnableLayer7CCRuleResponse> enableLayer7CCRule(EnableLayer7CCRuleRequest request);

    CompletableFuture<ListAsyncTaskResponse> listAsyncTask(ListAsyncTaskRequest request);

    CompletableFuture<ListLayer7CustomPortsResponse> listLayer7CustomPorts(ListLayer7CustomPortsRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListValueAddedResponse> listValueAdded(ListValueAddedRequest request);

    CompletableFuture<ModifyElasticBandWidthResponse> modifyElasticBandWidth(ModifyElasticBandWidthRequest request);

    CompletableFuture<ModifyFullLogTtlResponse> modifyFullLogTtl(ModifyFullLogTtlRequest request);

    CompletableFuture<ModifyInstanceRemarkResponse> modifyInstanceRemark(ModifyInstanceRemarkRequest request);

    CompletableFuture<OpenDomainSlsConfigResponse> openDomainSlsConfig(OpenDomainSlsConfigRequest request);

    CompletableFuture<ReleaseInstanceResponse> releaseInstance(ReleaseInstanceRequest request);

    CompletableFuture<ReleaseValueAddedResponse> releaseValueAdded(ReleaseValueAddedRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
