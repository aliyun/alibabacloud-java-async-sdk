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

    /**
      * Each network ACL can contain one or more IP addresses or CIDR blocks. Take note of the following limits on network ACLs:
      * *   The number of IP entries that can be added to a network ACL with each Alibaba Cloud account at a time: 50
      * *   The maximum number of IP entries that each network ACL can contain: 300
      *
     */
    CompletableFuture<AddAccessControlListEntryResponse> addAccessControlListEntry(AddAccessControlListEntryRequest request);

    /**
      * >  If multiple identical Elastic Compute Service (ECS) instances are specified in a request, only the first ECS instance is added. The other ECS instances are ignored. If the backend server that you add is the same as one of the existing backend servers that are already associated with the listener, an error message is returned.
      *
     */
    CompletableFuture<AddBackendServersResponse> addBackendServers(AddBackendServersRequest request);

    CompletableFuture<AddListenerWhiteListItemResponse> addListenerWhiteListItem(AddListenerWhiteListItemRequest request);

    /**
      * # Limits
      * Before you call this API, note the following limits:
      * *   You can add up to 10 tags to each SLB instance.
      * *   You can add up to five pairs of tags at a time.
      * *   All the tags and keys added to an SLB instance must be unique.
      * *   If you add a tag of which the key is the same as that of an existing tag, but the value is different, the new tag overwrites the existing one.
      *
     */
    CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request);

    CompletableFuture<AddVServerGroupBackendServersResponse> addVServerGroupBackendServers(AddVServerGroupBackendServersRequest request);

    /**
      * You can create multiple ACLs. Each ACL can contain one or more IP addresses or CIDR blocks. Before you create an ACL, take note of the following limits:
      * *   An account can have a maximum of 50 ACLs in each region.
      * *   You can add a maximum of 50 IP addresses or CIDR blocks at a time within an account.
      * *   Each ACL can contain a maximum of 300 IP addresses or CIDR blocks.
      *
     */
    CompletableFuture<CreateAccessControlListResponse> createAccessControlList(CreateAccessControlListRequest request);

    CompletableFuture<CreateDomainExtensionResponse> createDomainExtension(CreateDomainExtensionRequest request);

    /**
      * *   Before you create a CLB instance, call the [DescribeAvailableResource](~~DescribeAvailableResource~~) operation to query the resources available for purchase in the region where you want to create the CLB instance.
      * *   After a CLB instance is created, you are charged for using the CLB instance.
      * *   The pay-as-you-go billing method supports the pay-by-specification and pay-by-LCU metering methods.
      *
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
      * A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](~~StartLoadBalancerListener~~) operation to start the listener. After the listener is started, the listener can forward traffic to backend servers.
      * ## Prerequisites
      * A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](~~StartLoadBalancerListener~~).
      *
     */
    CompletableFuture<CreateLoadBalancerHTTPListenerResponse> createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request);

    /**
      * A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](~~27597~~) operation to start the listener. After the listener is started, the listener can forward traffic to backend servers.
      * ## Prerequisites
      * A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer-2).
      *
     */
    CompletableFuture<CreateLoadBalancerHTTPSListenerResponse> createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request);

    /**
      * >  A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](~~27597~~) operation to enable the listener to forward traffic to backend servers.
      *
     */
    CompletableFuture<CreateLoadBalancerTCPListenerResponse> createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request);

    /**
      * UDP listeners of Classic Load Balancer (CLB) instances in a classic network cannot pass client IP addresses to backend servers.
      * >  A newly created listener is in the **stopped** state. After a listener is created, you can call the [StartLoadBalancerListener](~~27597~~) operation to enable the listener to forward traffic to backend servers.
      *
     */
    CompletableFuture<CreateLoadBalancerUDPListenerResponse> createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request);

    CompletableFuture<CreateMasterSlaveServerGroupResponse> createMasterSlaveServerGroup(CreateMasterSlaveServerGroupRequest request);

    CompletableFuture<CreateRulesResponse> createRules(CreateRulesRequest request);

    CompletableFuture<CreateTLSCipherPolicyResponse> createTLSCipherPolicy(CreateTLSCipherPolicyRequest request);

    CompletableFuture<CreateVServerGroupResponse> createVServerGroup(CreateVServerGroupRequest request);

    /**
      * You can delete an ACL only if it is not associated with a listener.
      *
     */
    CompletableFuture<DeleteAccessControlListResponse> deleteAccessControlList(DeleteAccessControlListRequest request);

    CompletableFuture<DeleteAccessLogsDownloadAttributeResponse> deleteAccessLogsDownloadAttribute(DeleteAccessLogsDownloadAttributeRequest request);

    /**
      * You cannot delete a CA certificate that is in use.
      *
     */
    CompletableFuture<DeleteCACertificateResponse> deleteCACertificate(DeleteCACertificateRequest request);

    CompletableFuture<DeleteDomainExtensionResponse> deleteDomainExtension(DeleteDomainExtensionRequest request);

    /**
      * > The listeners and tags of the SLB instance are deleted along with the SLB instance.
      *
     */
    CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request);

    /**
      * >  You can delete only listeners that are in the **stopped** or **running** state.
      *
     */
    CompletableFuture<DeleteLoadBalancerListenerResponse> deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request);

    CompletableFuture<DeleteMasterSlaveServerGroupResponse> deleteMasterSlaveServerGroup(DeleteMasterSlaveServerGroupRequest request);

    /**
      * ## Limits
      * The RuleIds parameter is required. You can specify up to 10 forwarding rules in each request.
      *
     */
    CompletableFuture<DeleteRulesResponse> deleteRules(DeleteRulesRequest request);

    /**
      * >  You cannot delete server certificates that are in use.
      *
     */
    CompletableFuture<DeleteServerCertificateResponse> deleteServerCertificate(DeleteServerCertificateRequest request);

    /**
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.](https://api.aliyun.com/#product=Slb\\&api=DeleteTLSCipherPolicy\\&type=RPC\\&version=2014-05-15)
      *
     */
    CompletableFuture<DeleteTLSCipherPolicyResponse> deleteTLSCipherPolicy(DeleteTLSCipherPolicyRequest request);

    CompletableFuture<DeleteVServerGroupResponse> deleteVServerGroup(DeleteVServerGroupRequest request);

    CompletableFuture<DescribeAccessControlListAttributeResponse> describeAccessControlListAttribute(DescribeAccessControlListAttributeRequest request);

    CompletableFuture<DescribeAccessControlListsResponse> describeAccessControlLists(DescribeAccessControlListsRequest request);

    CompletableFuture<DescribeAccessLogsDownloadAttributeResponse> describeAccessLogsDownloadAttribute(DescribeAccessLogsDownloadAttributeRequest request);

    /**
      * > Only the available resources and zones are returned.
      *
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    /**
      * > To ensure data confidentiality, only the certificate fingerprint and name are returned. The certificate content is not returned.
      *
     */
    CompletableFuture<DescribeCACertificatesResponse> describeCACertificates(DescribeCACertificatesRequest request);

    CompletableFuture<DescribeDomainExtensionAttributeResponse> describeDomainExtensionAttribute(DescribeDomainExtensionAttributeRequest request);

    CompletableFuture<DescribeDomainExtensionsResponse> describeDomainExtensions(DescribeDomainExtensionsRequest request);

    CompletableFuture<DescribeHealthStatusResponse> describeHealthStatus(DescribeHealthStatusRequest request);

    CompletableFuture<DescribeHighDefinationMonitorResponse> describeHighDefinationMonitor(DescribeHighDefinationMonitorRequest request);

    CompletableFuture<DescribeListenerAccessControlAttributeResponse> describeListenerAccessControlAttribute(DescribeListenerAccessControlAttributeRequest request);

    /**
      * >  If backend servers are deployed in a vServer group, you can call the [DescribeVServerGroupAttribute](~~35224~~) operation to query the backend servers.
      *
     */
    CompletableFuture<DescribeLoadBalancerAttributeResponse> describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request);

    /**
      * *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](~~27577~~).
      * *   An HTTP listener is created. For more information about how to create an HTTP listener, see [CreateLoadBalancerHTTPListener](~~27592~~).
      *
     */
    CompletableFuture<DescribeLoadBalancerHTTPListenerAttributeResponse> describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request);

    /**
      * *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](~~27577~~).
      * *   An HTTPS listener is created. For more information about how to create an HTTPS listener, see [CreateLoadBalancerHTTPSListener](~~27593~~).
      *
     */
    CompletableFuture<DescribeLoadBalancerHTTPSListenerAttributeResponse> describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request);

    /**
      * *   A CLB instance is created. For more information, see [CreateLoadBalancer](~~2401685~~).
      * *   One or more listeners are added to the CLB instance. For more information, see the following topics:
      *     *   [CreateLoadBalancerUDPListener](~~CreateLoadBalancerUDPListener~~)
      *     *   [CreateLoadBalancerTCPListener](~~CreateLoadBalancerTCPListener~~)
      *     *   [CreateLoadBalancerHTTPListener](~~CreateLoadBalancerHTTPListener~~)
      *     *   [CreateLoadBalancerHTTPSListener](~~CreateLoadBalancerHTTPSListener~~)
      *
     */
    CompletableFuture<DescribeLoadBalancerListenersResponse> describeLoadBalancerListeners(DescribeLoadBalancerListenersRequest request);

    CompletableFuture<DescribeLoadBalancerTCPListenerAttributeResponse> describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancerUDPListenerAttributeResponse> describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request);

    CompletableFuture<DescribeLoadBalancersResponse> describeLoadBalancers(DescribeLoadBalancersRequest request);

    CompletableFuture<DescribeMasterSlaveServerGroupAttributeResponse> describeMasterSlaveServerGroupAttribute(DescribeMasterSlaveServerGroupAttributeRequest request);

    CompletableFuture<DescribeMasterSlaveServerGroupsResponse> describeMasterSlaveServerGroups(DescribeMasterSlaveServerGroupsRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeRuleAttributeResponse> describeRuleAttribute(DescribeRuleAttributeRequest request);

    CompletableFuture<DescribeRulesResponse> describeRules(DescribeRulesRequest request);

    /**
      * >  For security reasons, only fingerprints and names of the server certificates are returned. The content of the server certificates and private keys is not returned.
      *
     */
    CompletableFuture<DescribeServerCertificatesResponse> describeServerCertificates(DescribeServerCertificatesRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   You can query tags by instance ID, tag key, and tag value. If the operation is successful, the system returns all tags that match the specified conditions.
      * *   The logical relationship among the specified conditions is AND. Only tags that match all the specified conditions are returned.
      * *   If the Tagkey parameter is set and the Tagvalue parameter is not set, all tags that contain the specified tag key are returned.
      * *   If you set the Tagvalue parameter in a request, you must also set the Tagkey parameter in the request.
      * *   If you set both the Tagkey and Tagvalue parameters, only tags that contain the specified keys and values are returned.
      *
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeVServerGroupAttributeResponse> describeVServerGroupAttribute(DescribeVServerGroupAttributeRequest request);

    CompletableFuture<DescribeVServerGroupsResponse> describeVServerGroups(DescribeVServerGroupsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<EnableHighDefinationMonitorResponse> enableHighDefinationMonitor(EnableHighDefinationMonitorRequest request);

    CompletableFuture<ListTLSCipherPoliciesResponse> listTLSCipherPolicies(ListTLSCipherPoliciesRequest request);

    /**
      * *   Set **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object to be queried.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you set only **Tag.N.Key**, all tag values that are associated with the specified tag key are returned. If you set only **Tag.N.Value**, an error message is returned.
      * *   If you set **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ModifyHighDefinationMonitorResponse> modifyHighDefinationMonitor(ModifyHighDefinationMonitorRequest request);

    /**
      * > *   For pay-as-you-go CLB instances, you can only change the metering method from pay-by-specification to pay-by-LCU. You cannot change the metering method from pay-by-LCU to pay-by-specification.
      * >*   This operation can change the metering method of only one instance at a time.
      *
     */
    CompletableFuture<ModifyLoadBalancerInstanceChargeTypeResponse> modifyLoadBalancerInstanceChargeType(ModifyLoadBalancerInstanceChargeTypeRequest request);

    CompletableFuture<ModifyLoadBalancerInstanceSpecResponse> modifyLoadBalancerInstanceSpec(ModifyLoadBalancerInstanceSpecRequest request);

    /**
      * ## Description
      * *   If you modify only the maximum bandwidth of a pay-by-bandwidth CLB instance, the new bandwidth immediately takes effect.
      * *   If you modify the metering method (for example, switch from pay-by-bandwidth to pay-by-data-transfer), the new metering method and the other changes specified in the operation take effect at 00:00:00 the next day.
      *
     */
    CompletableFuture<ModifyLoadBalancerInternetSpecResponse> modifyLoadBalancerInternetSpec(ModifyLoadBalancerInternetSpecRequest request);

    CompletableFuture<ModifyLoadBalancerPayTypeResponse> modifyLoadBalancerPayType(ModifyLoadBalancerPayTypeRequest request);

    /**
      * You can call this operation to replace the backend servers in a specified vServer group. To modify the configurations of the backend servers, such as their weights, you can call the [SetVServerGroupAttribute](~~35217~~) operation.
      *
     */
    CompletableFuture<ModifyVServerGroupBackendServersResponse> modifyVServerGroupBackendServers(ModifyVServerGroupBackendServersRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<RemoveAccessControlListEntryResponse> removeAccessControlListEntry(RemoveAccessControlListEntryRequest request);

    /**
      * >  If the backend servers that you want to remove are not in the server list of the Classic Load Balancer (CLB) instance, the request fails. However, the system does not report an error.
      *
     */
    CompletableFuture<RemoveBackendServersResponse> removeBackendServers(RemoveBackendServersRequest request);

    CompletableFuture<RemoveListenerWhiteListItemResponse> removeListenerWhiteListItem(RemoveListenerWhiteListItemRequest request);

    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    /**
      * >  If one or more backend servers specified by the **BackendServers** parameter do not exist in the specified vServer group, these backend servers are ignored and no error message is returned.
      *
     */
    CompletableFuture<RemoveVServerGroupBackendServersResponse> removeVServerGroupBackendServers(RemoveVServerGroupBackendServersRequest request);

    CompletableFuture<SetAccessControlListAttributeResponse> setAccessControlListAttribute(SetAccessControlListAttributeRequest request);

    CompletableFuture<SetAccessLogsDownloadAttributeResponse> setAccessLogsDownloadAttribute(SetAccessLogsDownloadAttributeRequest request);

    CompletableFuture<SetBackendServersResponse> setBackendServers(SetBackendServersRequest request);

    CompletableFuture<SetCACertificateNameResponse> setCACertificateName(SetCACertificateNameRequest request);

    /**
      * >  You cannot replace an additional certificate for a listener that is added to a shared-resource Server Load Balancer (SLB) instance.
      *
     */
    CompletableFuture<SetDomainExtensionAttributeResponse> setDomainExtensionAttribute(SetDomainExtensionAttributeRequest request);

    CompletableFuture<SetListenerAccessControlStatusResponse> setListenerAccessControlStatus(SetListenerAccessControlStatusRequest request);

    CompletableFuture<SetLoadBalancerDeleteProtectionResponse> setLoadBalancerDeleteProtection(SetLoadBalancerDeleteProtectionRequest request);

    /**
      * ### Prerequisites
      * *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](~~27577~~).
      * *   An HTTP listener is created. For more information about how to create an HTTP listener, see [CreateLoadBalancerHTTPListener](~~27592~~).
      *
     */
    CompletableFuture<SetLoadBalancerHTTPListenerAttributeResponse> setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request);

    /**
      * *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](~~27577~~).
      * *   An HTTPS listener is created. For more information about how to create an HTTPS listener, see [CreateLoadBalancerHTTPSListener](~~27593~~).
      *
     */
    CompletableFuture<SetLoadBalancerHTTPSListenerAttributeResponse> setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request);

    CompletableFuture<SetLoadBalancerModificationProtectionResponse> setLoadBalancerModificationProtection(SetLoadBalancerModificationProtectionRequest request);

    CompletableFuture<SetLoadBalancerNameResponse> setLoadBalancerName(SetLoadBalancerNameRequest request);

    CompletableFuture<SetLoadBalancerStatusResponse> setLoadBalancerStatus(SetLoadBalancerStatusRequest request);

    /**
      * *   A CLB instance is created. For more information, see [CreateLoadBalancer](~~2401685~~).
      * *   A TCP listener is created. For more information, see [CreateLoadBalancerTCPListener](~~CreateLoadBalancerTCPListener~~).
      *
     */
    CompletableFuture<SetLoadBalancerTCPListenerAttributeResponse> setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request);

    /**
      * *   A Classic Load Balancer (CLB) instance is created. For more information, see [CreateLoadBalancer](~~27577~~).
      * *   A UDP listener is created. For more information, see [CreateLoadBalancerUDPListener](~~27595~~).
      *
     */
    CompletableFuture<SetLoadBalancerUDPListenerAttributeResponse> setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request);

    CompletableFuture<SetRuleResponse> setRule(SetRuleRequest request);

    CompletableFuture<SetServerCertificateNameResponse> setServerCertificateName(SetServerCertificateNameRequest request);

    CompletableFuture<SetTLSCipherPolicyAttributeResponse> setTLSCipherPolicyAttribute(SetTLSCipherPolicyAttributeRequest request);

    /**
      * This operation allows you to modify only the name of a vServer group and the weights of the backend servers in the vServer group.
      * *   If you want to modify backend servers in a specified vServer group, call the [ModifyVServerGroupBackendServers](~~35220~~) operation.
      * *   If you want to add backend servers to a specified vServer group, call the [AddVServerGroupBackendServers](~~35218~~) operation.
      *
     */
    CompletableFuture<SetVServerGroupAttributeResponse> setVServerGroupAttribute(SetVServerGroupAttributeRequest request);

    /**
      * When you call this operation, note the following items:
      * *   You can call the operation only when the listener is in the Stopped state.
      * *   After the operation is called, the status of the listener changes to Starting.
      * *   You cannot call this operation when the SLB instance to which the listener is bound is in the Locked state.
      *
     */
    CompletableFuture<StartLoadBalancerListenerResponse> startLoadBalancerListener(StartLoadBalancerListenerRequest request);

    /**
      * Before you make this API call, note the following:
      * *   After the API call is successfully made, the listener enters the stopped state.
      * *   If the Server Load Balancer (SLB) instance to which the listener to be stopped belongs is in the locked state, this API call cannot be made.
      * >  If you stop the listener, your services will be disrupted. Exercise caution when you perform this action.
      *
     */
    CompletableFuture<StopLoadBalancerListenerResponse> stopLoadBalancerListener(StopLoadBalancerListenerRequest request);

    /**
      * >  You can add at most 20 tags to each instance. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number is reached, an error message is returned.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
      * You can upload only one CA certificate at a time. After a CA certificate is uploaded, the certificate ID, name, and fingerprint are returned.
      *
     */
    CompletableFuture<UploadCACertificateResponse> uploadCACertificate(UploadCACertificateRequest request);

    /**
      * *   You can upload only one server certificate and its private key in each call.
      * *   After a server certificate and its private key are uploaded, the fingerprints of all server certificates that belong to your Alibaba Cloud account are returned.
      *
     */
    CompletableFuture<UploadServerCertificateResponse> uploadServerCertificate(UploadServerCertificateRequest request);

}
