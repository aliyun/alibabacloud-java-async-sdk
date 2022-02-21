// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alb20200616.models.*;
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

    CompletableFuture<AddEntriesToAclResponse> addEntriesToAcl(AddEntriesToAclRequest request);

    CompletableFuture<AddServersToServerGroupResponse> addServersToServerGroup(AddServersToServerGroupRequest request);

    CompletableFuture<ApplyHealthCheckTemplateToServerGroupResponse> applyHealthCheckTemplateToServerGroup(ApplyHealthCheckTemplateToServerGroupRequest request);

    CompletableFuture<AssociateAclsWithListenerResponse> associateAclsWithListener(AssociateAclsWithListenerRequest request);

    CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request);

    CompletableFuture<AttachCommonBandwidthPackageToLoadBalancerResponse> attachCommonBandwidthPackageToLoadBalancer(AttachCommonBandwidthPackageToLoadBalancerRequest request);

    CompletableFuture<CreateAclResponse> createAcl(CreateAclRequest request);

    CompletableFuture<CreateHealthCheckTemplateResponse> createHealthCheckTemplate(CreateHealthCheckTemplateRequest request);

    CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request);

    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    CompletableFuture<CreateRulesResponse> createRules(CreateRulesRequest request);

    CompletableFuture<CreateSecurityPolicyResponse> createSecurityPolicy(CreateSecurityPolicyRequest request);

    CompletableFuture<CreateServerGroupResponse> createServerGroup(CreateServerGroupRequest request);

    CompletableFuture<DeleteAclResponse> deleteAcl(DeleteAclRequest request);

    CompletableFuture<DeleteHealthCheckTemplatesResponse> deleteHealthCheckTemplates(DeleteHealthCheckTemplatesRequest request);

    CompletableFuture<DeleteListenerResponse> deleteListener(DeleteListenerRequest request);

    CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request);

    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    CompletableFuture<DeleteRulesResponse> deleteRules(DeleteRulesRequest request);

    CompletableFuture<DeleteSecurityPolicyResponse> deleteSecurityPolicy(DeleteSecurityPolicyRequest request);

    CompletableFuture<DeleteServerGroupResponse> deleteServerGroup(DeleteServerGroupRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<DetachCommonBandwidthPackageFromLoadBalancerResponse> detachCommonBandwidthPackageFromLoadBalancer(DetachCommonBandwidthPackageFromLoadBalancerRequest request);

    CompletableFuture<DisableDeletionProtectionResponse> disableDeletionProtection(DisableDeletionProtectionRequest request);

    CompletableFuture<DisableLoadBalancerAccessLogResponse> disableLoadBalancerAccessLog(DisableLoadBalancerAccessLogRequest request);

    CompletableFuture<DissociateAclsFromListenerResponse> dissociateAclsFromListener(DissociateAclsFromListenerRequest request);

    CompletableFuture<DissociateAdditionalCertificatesFromListenerResponse> dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request);

    CompletableFuture<EnableDeletionProtectionResponse> enableDeletionProtection(EnableDeletionProtectionRequest request);

    CompletableFuture<EnableLoadBalancerAccessLogResponse> enableLoadBalancerAccessLog(EnableLoadBalancerAccessLogRequest request);

    CompletableFuture<GetHealthCheckTemplateAttributeResponse> getHealthCheckTemplateAttribute(GetHealthCheckTemplateAttributeRequest request);

    CompletableFuture<GetListenerAttributeResponse> getListenerAttribute(GetListenerAttributeRequest request);

    CompletableFuture<GetListenerHealthStatusResponse> getListenerHealthStatus(GetListenerHealthStatusRequest request);

    CompletableFuture<GetLoadBalancerAttributeResponse> getLoadBalancerAttribute(GetLoadBalancerAttributeRequest request);

    CompletableFuture<ListAclEntriesResponse> listAclEntries(ListAclEntriesRequest request);

    CompletableFuture<ListAclRelationsResponse> listAclRelations(ListAclRelationsRequest request);

    CompletableFuture<ListAclsResponse> listAcls(ListAclsRequest request);

    CompletableFuture<ListAsynJobsResponse> listAsynJobs(ListAsynJobsRequest request);

    CompletableFuture<ListHealthCheckTemplatesResponse> listHealthCheckTemplates(ListHealthCheckTemplatesRequest request);

    CompletableFuture<ListListenerCertificatesResponse> listListenerCertificates(ListListenerCertificatesRequest request);

    CompletableFuture<ListListenersResponse> listListeners(ListListenersRequest request);

    CompletableFuture<ListLoadBalancersResponse> listLoadBalancers(ListLoadBalancersRequest request);

    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    CompletableFuture<ListSecurityPoliciesResponse> listSecurityPolicies(ListSecurityPoliciesRequest request);

    CompletableFuture<ListSecurityPolicyRelationsResponse> listSecurityPolicyRelations(ListSecurityPolicyRelationsRequest request);

    CompletableFuture<ListServerGroupServersResponse> listServerGroupServers(ListServerGroupServersRequest request);

    CompletableFuture<ListServerGroupsResponse> listServerGroups(ListServerGroupsRequest request);

    CompletableFuture<ListSystemSecurityPoliciesResponse> listSystemSecurityPolicies(ListSystemSecurityPoliciesRequest request);

    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<RemoveEntriesFromAclResponse> removeEntriesFromAcl(RemoveEntriesFromAclRequest request);

    CompletableFuture<RemoveServersFromServerGroupResponse> removeServersFromServerGroup(RemoveServersFromServerGroupRequest request);

    CompletableFuture<ReplaceServersInServerGroupResponse> replaceServersInServerGroup(ReplaceServersInServerGroupRequest request);

    CompletableFuture<StartListenerResponse> startListener(StartListenerRequest request);

    CompletableFuture<StopListenerResponse> stopListener(StopListenerRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    CompletableFuture<UpdateAclAttributeResponse> updateAclAttribute(UpdateAclAttributeRequest request);

    CompletableFuture<UpdateHealthCheckTemplateAttributeResponse> updateHealthCheckTemplateAttribute(UpdateHealthCheckTemplateAttributeRequest request);

    CompletableFuture<UpdateListenerAttributeResponse> updateListenerAttribute(UpdateListenerAttributeRequest request);

    CompletableFuture<UpdateListenerLogConfigResponse> updateListenerLogConfig(UpdateListenerLogConfigRequest request);

    CompletableFuture<UpdateLoadBalancerAddressTypeConfigResponse> updateLoadBalancerAddressTypeConfig(UpdateLoadBalancerAddressTypeConfigRequest request);

    CompletableFuture<UpdateLoadBalancerAttributeResponse> updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request);

    CompletableFuture<UpdateLoadBalancerEditionResponse> updateLoadBalancerEdition(UpdateLoadBalancerEditionRequest request);

    CompletableFuture<UpdateLoadBalancerZonesResponse> updateLoadBalancerZones(UpdateLoadBalancerZonesRequest request);

    CompletableFuture<UpdateRuleAttributeResponse> updateRuleAttribute(UpdateRuleAttributeRequest request);

    CompletableFuture<UpdateRulesAttributeResponse> updateRulesAttribute(UpdateRulesAttributeRequest request);

    CompletableFuture<UpdateSecurityPolicyAttributeResponse> updateSecurityPolicyAttribute(UpdateSecurityPolicyAttributeRequest request);

    CompletableFuture<UpdateServerGroupAttributeResponse> updateServerGroupAttribute(UpdateServerGroupAttributeRequest request);

    CompletableFuture<UpdateServerGroupServersAttributeResponse> updateServerGroupServersAttribute(UpdateServerGroupServersAttributeRequest request);

}
