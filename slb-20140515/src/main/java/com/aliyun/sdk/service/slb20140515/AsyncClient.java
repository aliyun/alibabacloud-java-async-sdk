// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.slb20140515.models.*;
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

    CompletableFuture<AddAccessControlListEntryResponse> addAccessControlListEntry(AddAccessControlListEntryRequest request);

    CompletableFuture<AddBackendServersResponse> addBackendServers(AddBackendServersRequest request);

    CompletableFuture<AddListenerWhiteListItemResponse> addListenerWhiteListItem(AddListenerWhiteListItemRequest request);

    CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request);

    CompletableFuture<AddVServerGroupBackendServersResponse> addVServerGroupBackendServers(AddVServerGroupBackendServersRequest request);

    CompletableFuture<CreateAccessControlListResponse> createAccessControlList(CreateAccessControlListRequest request);

    CompletableFuture<CreateDomainExtensionResponse> createDomainExtension(CreateDomainExtensionRequest request);

    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    CompletableFuture<CreateLoadBalancerHTTPListenerResponse> createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request);

    CompletableFuture<CreateLoadBalancerHTTPSListenerResponse> createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request);

    CompletableFuture<CreateLoadBalancerTCPListenerResponse> createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request);

    CompletableFuture<CreateLoadBalancerUDPListenerResponse> createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request);

    CompletableFuture<CreateMasterSlaveServerGroupResponse> createMasterSlaveServerGroup(CreateMasterSlaveServerGroupRequest request);

    CompletableFuture<CreateRulesResponse> createRules(CreateRulesRequest request);

    CompletableFuture<CreateTLSCipherPolicyResponse> createTLSCipherPolicy(CreateTLSCipherPolicyRequest request);

    CompletableFuture<CreateVServerGroupResponse> createVServerGroup(CreateVServerGroupRequest request);

    CompletableFuture<DeleteAccessControlListResponse> deleteAccessControlList(DeleteAccessControlListRequest request);

    CompletableFuture<DeleteCACertificateResponse> deleteCACertificate(DeleteCACertificateRequest request);

    CompletableFuture<DeleteDomainExtensionResponse> deleteDomainExtension(DeleteDomainExtensionRequest request);

    CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request);

    CompletableFuture<DeleteLoadBalancerListenerResponse> deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request);

    CompletableFuture<DeleteMasterSlaveServerGroupResponse> deleteMasterSlaveServerGroup(DeleteMasterSlaveServerGroupRequest request);

    CompletableFuture<DeleteRulesResponse> deleteRules(DeleteRulesRequest request);

    CompletableFuture<DeleteServerCertificateResponse> deleteServerCertificate(DeleteServerCertificateRequest request);

    CompletableFuture<DeleteTLSCipherPolicyResponse> deleteTLSCipherPolicy(DeleteTLSCipherPolicyRequest request);

    CompletableFuture<DeleteVServerGroupResponse> deleteVServerGroup(DeleteVServerGroupRequest request);

    CompletableFuture<DescribeAccessControlListAttributeResponse> describeAccessControlListAttribute(DescribeAccessControlListAttributeRequest request);

    CompletableFuture<DescribeAccessControlListsResponse> describeAccessControlLists(DescribeAccessControlListsRequest request);

    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    CompletableFuture<DescribeCACertificatesResponse> describeCACertificates(DescribeCACertificatesRequest request);

    CompletableFuture<DescribeDomainExtensionAttributeResponse> describeDomainExtensionAttribute(DescribeDomainExtensionAttributeRequest request);

    CompletableFuture<DescribeDomainExtensionsResponse> describeDomainExtensions(DescribeDomainExtensionsRequest request);

    CompletableFuture<DescribeHealthStatusResponse> describeHealthStatus(DescribeHealthStatusRequest request);

    CompletableFuture<DescribeListenerAccessControlAttributeResponse> describeListenerAccessControlAttribute(DescribeListenerAccessControlAttributeRequest request);

    CompletableFuture<DescribeLoadBalancerAttributeResponse> describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancerHTTPListenerAttributeResponse> describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancerHTTPSListenerAttributeResponse> describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancerListenersResponse> describeLoadBalancerListeners(DescribeLoadBalancerListenersRequest request);

    CompletableFuture<DescribeLoadBalancerTCPListenerAttributeResponse> describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancerUDPListenerAttributeResponse> describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancersResponse> describeLoadBalancers(DescribeLoadBalancersRequest request);

    CompletableFuture<DescribeMasterSlaveServerGroupAttributeResponse> describeMasterSlaveServerGroupAttribute(DescribeMasterSlaveServerGroupAttributeRequest request);

    CompletableFuture<DescribeMasterSlaveServerGroupsResponse> describeMasterSlaveServerGroups(DescribeMasterSlaveServerGroupsRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRuleAttributeResponse> describeRuleAttribute(DescribeRuleAttributeRequest request);

    CompletableFuture<DescribeRulesResponse> describeRules(DescribeRulesRequest request);

    CompletableFuture<DescribeServerCertificatesResponse> describeServerCertificates(DescribeServerCertificatesRequest request);

    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeVServerGroupAttributeResponse> describeVServerGroupAttribute(DescribeVServerGroupAttributeRequest request);

    CompletableFuture<DescribeVServerGroupsResponse> describeVServerGroups(DescribeVServerGroupsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<ListTLSCipherPoliciesResponse> listTLSCipherPolicies(ListTLSCipherPoliciesRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyLoadBalancerInstanceSpecResponse> modifyLoadBalancerInstanceSpec(ModifyLoadBalancerInstanceSpecRequest request);

    CompletableFuture<ModifyLoadBalancerInternetSpecResponse> modifyLoadBalancerInternetSpec(ModifyLoadBalancerInternetSpecRequest request);

    CompletableFuture<ModifyLoadBalancerPayTypeResponse> modifyLoadBalancerPayType(ModifyLoadBalancerPayTypeRequest request);

    CompletableFuture<ModifyVServerGroupBackendServersResponse> modifyVServerGroupBackendServers(ModifyVServerGroupBackendServersRequest request);

    CompletableFuture<RemoveAccessControlListEntryResponse> removeAccessControlListEntry(RemoveAccessControlListEntryRequest request);

    CompletableFuture<RemoveBackendServersResponse> removeBackendServers(RemoveBackendServersRequest request);

    CompletableFuture<RemoveListenerWhiteListItemResponse> removeListenerWhiteListItem(RemoveListenerWhiteListItemRequest request);

    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    CompletableFuture<RemoveVServerGroupBackendServersResponse> removeVServerGroupBackendServers(RemoveVServerGroupBackendServersRequest request);

    CompletableFuture<SetAccessControlListAttributeResponse> setAccessControlListAttribute(SetAccessControlListAttributeRequest request);

    CompletableFuture<SetBackendServersResponse> setBackendServers(SetBackendServersRequest request);

    CompletableFuture<SetCACertificateNameResponse> setCACertificateName(SetCACertificateNameRequest request);

    CompletableFuture<SetDomainExtensionAttributeResponse> setDomainExtensionAttribute(SetDomainExtensionAttributeRequest request);

    CompletableFuture<SetListenerAccessControlStatusResponse> setListenerAccessControlStatus(SetListenerAccessControlStatusRequest request);

    CompletableFuture<SetLoadBalancerDeleteProtectionResponse> setLoadBalancerDeleteProtection(SetLoadBalancerDeleteProtectionRequest request);

    CompletableFuture<SetLoadBalancerHTTPListenerAttributeResponse> setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request);

    CompletableFuture<SetLoadBalancerHTTPSListenerAttributeResponse> setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request);

    CompletableFuture<SetLoadBalancerModificationProtectionResponse> setLoadBalancerModificationProtection(SetLoadBalancerModificationProtectionRequest request);

    CompletableFuture<SetLoadBalancerNameResponse> setLoadBalancerName(SetLoadBalancerNameRequest request);

    CompletableFuture<SetLoadBalancerStatusResponse> setLoadBalancerStatus(SetLoadBalancerStatusRequest request);

    CompletableFuture<SetLoadBalancerTCPListenerAttributeResponse> setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request);

    CompletableFuture<SetLoadBalancerUDPListenerAttributeResponse> setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request);

    CompletableFuture<SetRuleResponse> setRule(SetRuleRequest request);

    CompletableFuture<SetServerCertificateNameResponse> setServerCertificateName(SetServerCertificateNameRequest request);

    CompletableFuture<SetTLSCipherPolicyAttributeResponse> setTLSCipherPolicyAttribute(SetTLSCipherPolicyAttributeRequest request);

    CompletableFuture<SetVServerGroupAttributeResponse> setVServerGroupAttribute(SetVServerGroupAttributeRequest request);

    CompletableFuture<StartLoadBalancerListenerResponse> startLoadBalancerListener(StartLoadBalancerListenerRequest request);

    CompletableFuture<StopLoadBalancerListenerResponse> stopLoadBalancerListener(StopLoadBalancerListenerRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UploadCACertificateResponse> uploadCACertificate(UploadCACertificateRequest request);

    CompletableFuture<UploadServerCertificateResponse> uploadServerCertificate(UploadServerCertificateRequest request);

}
