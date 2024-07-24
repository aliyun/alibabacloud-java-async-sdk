// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alb20200616.models.*;
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
      * *   Each ACL can contain IP addresses or CIDR blocks. Take note of the following limits on ACLs:
      *     *   The maximum number of IP entries that can be added to an ACL with each Alibaba Cloud account at a time: 20
      *     *   The maximum number of IP entries that each ACL can contain: 1,000
      * *   **AddEntriesToAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclEntries](~~213616~~) operation to query the status of the task.
      *     *   If the ACL is in the **Adding** state, the IP entries are being added.
      *     *   If the ACL is in the **Available** state, the IP entries are added.
      *
     */
    CompletableFuture<AddEntriesToAclResponse> addEntriesToAcl(AddEntriesToAclRequest request);

    /**
      * **AddServersToServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
      * 1.  You can call the [ListServerGroups](~~213627~~) operation to query the status of a server group.
      * *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
      * *   If a server group is in the **Available** state, it indicates that the server group is running.
      * 2.  You can call the [ListServerGroupServers](~~213628~~) operation to query the status of a backend server.
      * *   If a backend server is in the **Adding** state, it indicates that the backend server is being added to a server group.
      * *   If a backend server is in the **Available** state, it indicates that the server is running.
      *
     */
    CompletableFuture<AddServersToServerGroupResponse> addServersToServerGroup(AddServersToServerGroupRequest request);

    CompletableFuture<ApplyHealthCheckTemplateToServerGroupResponse> applyHealthCheckTemplateToServerGroup(ApplyHealthCheckTemplateToServerGroupRequest request);

    /**
      * **DeleteDhcpOptionsSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclRelations](~~213618~~) operation to query the status of the task.
      * *   If an ACL is in the **Associating** state, the ACL is being associated with a listener.
      * *   If an ACL is in the **Associated** state, the ACL is associated with a listener.
      *
     */
    CompletableFuture<AssociateAclsWithListenerResponse> associateAclsWithListener(AssociateAclsWithListenerRequest request);

    /**
      * **AssociateAdditionalCertificatesWithListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetListenerAttribute](~~2254865~~) operation to query the status of the task:
      * *   If the HTTPS or QUIC listener is in the **Associating** state, the additional certificates are being associated.
      * *   If the HTTPS or QUIC listener is in the **Associated** state, the additional certificates are associated.
      *
     */
    CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request);

    /**
      * **AttachCommonBandwidthPackageToLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](~~214362~~) to query the status of the task.
      * *   If the ALB instance is in the **Configuring** state, the EIP bandwidth plan is being associated with the ALB instance.
      * *   If the ALB instance is in the **Active** state, the EIP bandwidth plan is associated with the ALB instance.
      *
     */
    CompletableFuture<AttachCommonBandwidthPackageToLoadBalancerResponse> attachCommonBandwidthPackageToLoadBalancer(AttachCommonBandwidthPackageToLoadBalancerRequest request);

    /**
      * This operation is supported only by Application Load Balancer (ALB) instances that use static IP addresses. Before you call this operation, you must call the StartShiftLoadBalancerZones operation to remove the zone from the ALB instance.
      *
     */
    CompletableFuture<CancelShiftLoadBalancerZonesResponse> cancelShiftLoadBalancerZones(CancelShiftLoadBalancerZonesRequest request);

    /**
      * ### [](#)Prerequisites
      * *   A standard or WAF-enabled Application Load Balancer (ALB) instance is created. For more information, see [CreateLoadBalancer](~~214358~~).
      * ### [](#)Usage notes
      * **CreateAScripts** an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAScripts](~~472574~~) operation to query the status of a script.
      * *   If the script is in the **Creating** state, the script is being created.
      * *   If the script is in the **Available**, the script is created.
      *
     */
    CompletableFuture<CreateAScriptsResponse> createAScripts(CreateAScriptsRequest request);

    /**
      * ## Usage notes
      * The **CreateAcl** operation is asynchronous. After you send a request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListAcls](~~213617~~) operation to query the status of an ACL:
      * *   If an ACL is in the **Creating** state, the ACL is being created.
      * *   If an ACL is in the **Available** state, the ACL is created.
      *
     */
    CompletableFuture<CreateAclResponse> createAcl(CreateAclRequest request);

    CompletableFuture<CreateHealthCheckTemplateResponse> createHealthCheckTemplate(CreateHealthCheckTemplateRequest request);

    /**
      * ## Usage notes
      * **CreateListener** is an asynchronous operation. After you call this operation, the system returns a request ID. However, the operation is still being performed in the background. You can call the [GetListenerAttribute](~~214353~~) operation to query the status of the HTTP, HTTPS, or QUIC listener.
      * *   If the HTTP, HTTPS, or QUIC listener is in the **Provisioning** state, it indicates that the listener is being created.
      * *   If the HTTP, HTTPS, or QUIC listener is in the **Running** state, it indicates that the listener has been created successfully.
      *
     */
    CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request);

    /**
      * **CreateLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](~~214362~~) operation to query the status of an ALB instance.
      * *   If an ALB instance is in the **Provisioning** state, it indicates that the ALB instance is being created.
      * *   If an ALB instance is in the **Active** state, it indicates that the ALB instance is created.
      *
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
      * Take note of the following limits:
      * *   When you configure the **Redirect** action, you can use the default value only for the **HttpCode** parameter. Do not use the default values for the other parameters.
      * *   If you specify the **Rewrite** action together with other actions in a forwarding rule, make sure that the **ForwardGroup** action is specified.
      * *   **CreateRule** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](~~214379~~) operation to query the status of a forwarding rule.
      *     *   If a forwarding rule is in the **Provisioning** state, the forwarding rule is being created.
      *     *   If a forwarding rule is in the **Available** state, the forwarding rule is created.
      * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. The limits on conditions and actions are:
      *     *   Limits on conditions: 5 for a basic Application Load Balancer (ALB) instance, 10 for a standard ALB instance, and 10 for a WAF-enabled ALB instance.
      *     *   Limits on actions: 3 for a basic ALB instance, 5 for a standard ALB instance, and 5 for a WAF-enabled ALB instance.
      *
     */
    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * *   When you configure the **Redirect** action, you can use the default value for the **HttpCode** parameter but you cannot use the default values for all of the other parameters.
      * *   If you specify the **Rewrite** action and other actions in a forwarding rule, make sure that one of the actions is **ForwardGroup**.
      * *   **CreateRules** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](~~214379~~) operation to query the status of forwarding rules.
      *     *   If forwarding rules are in the **Provisioning** state, the forwarding rules are being created.
      *     *   If forwarding rules are in the **Available** state, the forwarding rules have been created.
      * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. Take note of the following limits on the number of conditions and the number of actions in each forwarding rule:
      *     *   Limits on conditions: You can specify at most 5 conditions if you use a basic Application Load Balancer (ALB) instance, at most 10 conditions if you use a standard ALB instance, and at most 10 conditions if you use a WAF-enabled ALB instance.
      *     *   Limits on actions: You can specify at most 3 actions if you use a basic ALB instance, at most 5 actions if you use a standard ALB instance, and at most 10 actions if you use a WAF-enabled ALB instance.
      *
     */
    CompletableFuture<CreateRulesResponse> createRules(CreateRulesRequest request);

    CompletableFuture<CreateSecurityPolicyResponse> createSecurityPolicy(CreateSecurityPolicyRequest request);

    /**
      * **CreateServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [ListServerGroups](~~213627~~) to query the status of a server group.
      * *   If a server group is in the **Creating** state, it indicates that the server group is being created.
      * *   If a server group is in the **Available** state, it indicates that the server group is created.
      *
     */
    CompletableFuture<CreateServerGroupResponse> createServerGroup(CreateServerGroupRequest request);

    /**
      * **DeleteAScripts** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAScripts](~~472574~~) operation to query the status of the task:
      * *   If an AScript rule is in the **Deleting** state, the AScript rule is being deleted.
      * *   If an AScript rule cannot be found, the AScript rule is deleted.
      *
     */
    CompletableFuture<DeleteAScriptsResponse> deleteAScripts(DeleteAScriptsRequest request);

    /**
      * **DeleteAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAcls](~~213617~~) operation to query the status of the task.
      * *   If the ACL is in the **Deleting** state, the ACL is being deleted.
      * *   If the ACL cannot be found, the ACL is deleted.
      *
     */
    CompletableFuture<DeleteAclResponse> deleteAcl(DeleteAclRequest request);

    CompletableFuture<DeleteHealthCheckTemplatesResponse> deleteHealthCheckTemplates(DeleteHealthCheckTemplatesRequest request);

    /**
      * **DeleteListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetListenerAttribute](~~2254865~~) to query the status of the task.
      * *   If the listener is in the **Deleting** state, the listener is being deleted.
      * *   If the listener cannot be found, the listener is deleted.
      *
     */
    CompletableFuture<DeleteListenerResponse> deleteListener(DeleteListenerRequest request);

    /**
      * **DeleteLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](~~214362~~) to query the status of the task.
      * *   If an ALB instance is in the **Deleting** state, the ALB instance is being deleted.
      * *   If an ALB instance cannot be found, the ALB instance is deleted.
      *
     */
    CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request);

    /**
      * **DeleteRule** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](~~214379~~) operation to query the status of a forwarding rule:
      * *   If the forwarding rule is in the **Deleting** state, the forwarding rule is being deleted.
      * *   If the forwarding rule cannot be found, the forwarding rule is deleted.
      *
     */
    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    /**
      * **DeleteRules** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](~~214379~~) operation to query the status of forwarding rules.
      * *   If the forwarding rules are in the **Deleting** state, the forwarding rules are being deleted.
      * *   If the forwarding rules cannot be found, the forwarding rules are deleted.
      *
     */
    CompletableFuture<DeleteRulesResponse> deleteRules(DeleteRulesRequest request);

    CompletableFuture<DeleteSecurityPolicyResponse> deleteSecurityPolicy(DeleteSecurityPolicyRequest request);

    /**
      * **DeleteServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListServerGroups](~~213627~~) operation to query the status of the task.
      * *   If a server group is in the **Deleting** state, it indicates that the server group is being deleted.
      * *   If a specified server group cannot be found, it indicates that the server group has been deleted.
      *
     */
    CompletableFuture<DeleteServerGroupResponse> deleteServerGroup(DeleteServerGroupRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
      * **DetachCommonBandwidthPackageFromLoadBalancer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](~~214359~~) operation to query the status of the task.
      * *   If an ALB instance is in the **Configuring** state, the EIP bandwidth plan is being disassociated from the ALB instance.
      * *   If an ALB instance is in the **Active** state, the EIP bandwidth plan is disassociated from the ALB instance.
      *
     */
    CompletableFuture<DetachCommonBandwidthPackageFromLoadBalancerResponse> detachCommonBandwidthPackageFromLoadBalancer(DetachCommonBandwidthPackageFromLoadBalancerRequest request);

    CompletableFuture<DisableDeletionProtectionResponse> disableDeletionProtection(DisableDeletionProtectionRequest request);

    CompletableFuture<DisableLoadBalancerAccessLogResponse> disableLoadBalancerAccessLog(DisableLoadBalancerAccessLogRequest request);

    /**
      * ### Prerequisites
      * An ALB instance is created and IPv4/IPv6 dual stack is enabled for the instance. You can call the [CreateLoadBalancer](~~214358~~) operation and set **AddressIpVersion** to **DualStack** to create a dual-stack ALB instance.
      * > If you set **AddressIpVersion** to **DualStack**:
      * *   If you set **AddressType** to **Internet**, the ALB instance uses a public IPv4 IP address and a private IPv6 address.
      * *   If you set **AddressType** to **Intranet**, the ALB instance uses a private IPv4 IP address and a private IPv6 address.
      * ### Description
      * *   After the DisableLoadBalancerIpv6Internet operation is called, the value of **Ipv6AddressType** is changed to **Intranet** and the type of the IPv6 address of the ALB instance is changed from public to private. If you upgrade the instance or the instance scales elastic network interfaces (ENIs) along with workloads, private IPv6 addresses are automatically enabled for the instance and the new ENIs. You can call the [GetLoadBalancerAttribute](~~214362~~) operation to query the value of **Ipv6AddressType**.
      * *   **DisableLoadBalancerIpv6Internet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](~~214362~~) operation to query the status of the task.
      *     *   If the ALB instance is in the **Configuring** state, the network type of the IPv6 address that is used by the ALB instance is being changed.
      *     *   If the ALB instance is in the **Active** state, the network type of the IPv6 address that is used by the ALB instance is changed.
      *
     */
    CompletableFuture<DisableLoadBalancerIpv6InternetResponse> disableLoadBalancerIpv6Internet(DisableLoadBalancerIpv6InternetRequest request);

    /**
      * **DeleteDhcpOptionsSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclRelations](~~213618~~) operation to query the status of the task.
      * *   If an ACL is in the **Dissociating** state, the ACL is being disassociated from the listener.
      * *   If an ACL is in the **Dissociated** state, the ACL is disassociated from the listener.
      *
     */
    CompletableFuture<DissociateAclsFromListenerResponse> dissociateAclsFromListener(DissociateAclsFromListenerRequest request);

    /**
      * **DissociateAdditionalCertificatesFromListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListListenerCertificates](~~214354~~) operation to query the status of the task. - If an additional certificate is in the **Dissociating** state, the additional certificate is being disassociated. - If an additional certificate is in the **Dissociated** state, the additional certificate is disassociated.
      *
     */
    CompletableFuture<DissociateAdditionalCertificatesFromListenerResponse> dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request);

    CompletableFuture<EnableDeletionProtectionResponse> enableDeletionProtection(EnableDeletionProtectionRequest request);

    CompletableFuture<EnableLoadBalancerAccessLogResponse> enableLoadBalancerAccessLog(EnableLoadBalancerAccessLogRequest request);

    /**
      * ### Prerequisites
      * An ALB instance is created and IPv4/IPv6 dual stack is enabled for the instance. You can call the [CreateLoadBalancer](~~214358~~) operation and set **AddressIpVersion** to **DualStack** to create a dual-stack ALB instance.
      * > If you set **AddressIpVersion** to **DualStack**:
      * *   If you set **AddressType** to **Internet**, the ALB instance uses a public IPv4 IP address and a private IPv6 address.
      * *   If you set **AddressType** to **Intranet**, the ALB instance uses a private IPv4 IP address and a private IPv6 address.
      * ### Description
      * *   After the EnableLoadBalancerIpv6Internet operation is called, the value of **Ipv6AddressType** is changed to **Internet** and the type of the IPv6 address of the ALB instance is changed from private to public. If you upgrade the instance or the instance scales elastic network interfaces (ENIs) along with workloads, public IPv6 addresses are automatically enabled for the instance and the new ENIs. You can call the [GetLoadBalancerAttribute](~~214362~~) operation to query the value of **Ipv6AddressType**.
      * *   **EnableLoadBalancerIpv6Internet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](~~214362~~) operation to query the status of the task.
      *     *   If the ALB instance is in the **Configuring** state, the network type of the IPv6 address that is used by the ALB instance is being changed.
      *     *   If the ALB instance is in the **Active** state, the network type of the IPv6 address that is used by the ALB instance is changed.
      *
     */
    CompletableFuture<EnableLoadBalancerIpv6InternetResponse> enableLoadBalancerIpv6Internet(EnableLoadBalancerIpv6InternetRequest request);

    CompletableFuture<GetHealthCheckTemplateAttributeResponse> getHealthCheckTemplateAttribute(GetHealthCheckTemplateAttributeRequest request);

    CompletableFuture<GetListenerAttributeResponse> getListenerAttribute(GetListenerAttributeRequest request);

    CompletableFuture<GetListenerHealthStatusResponse> getListenerHealthStatus(GetListenerHealthStatusRequest request);

    CompletableFuture<GetLoadBalancerAttributeResponse> getLoadBalancerAttribute(GetLoadBalancerAttributeRequest request);

    CompletableFuture<ListAScriptsResponse> listAScripts(ListAScriptsRequest request);

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

    /**
      * *   By default, security groups are unavailable. To use security groups, contact your account manager.
      * *   Make sure that a security group is created. For more information about how to create security groups, see [CreateSecurityGroup](~~2679843~~).
      * *   Each ALB instance can be added to at most four security groups.
      * *   To query the security groups of an ALB instance, call the [GetLoadBalancerAttribute](~~2254835~~) operation.
      * *   GetLoadBalancerAttribute is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAsynJobs](~~2254893~~) operation to query the status of the task.
      *     *   If the task is in the Succeeded state, the ALB instance is added to the security group.
      *     *   If the task is in the Processing state, the ALB instance is being added to the security group. In this case, you can query the task but cannot perform other operations.
      *
     */
    CompletableFuture<LoadBalancerJoinSecurityGroupResponse> loadBalancerJoinSecurityGroup(LoadBalancerJoinSecurityGroupRequest request);

    /**
      * *   LoadBalancerLeaveSecurityGroup is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAsynJobs](~~2254893~~) operation to query the status of the task.
      *     *   If the task is in the Succeeded state, the ALB instance is removed from the security group.
      *     *   If the task is in the Processing state, the ALB instance is being removed from the security group. In this case, you can query the task but cannot perform other operations.
      *
     */
    CompletableFuture<LoadBalancerLeaveSecurityGroupResponse> loadBalancerLeaveSecurityGroup(LoadBalancerLeaveSecurityGroupRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
      * **RemoveEntriesFromAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAclEntries](~~213616~~) operation to query the status of the task.
      * *   If an ACL is in the **Removing** state, the entries are being removed.
      * *   If an ACL cannot be found, the entries are removed.
      *
     */
    CompletableFuture<RemoveEntriesFromAclResponse> removeEntriesFromAcl(RemoveEntriesFromAclRequest request);

    /**
      * **RemoveServersFromServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
      * 1.  You can call the [ListServerGroups](~~213627~~) operation to query the status of a server group.
      *     *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
      *     *   If a server group is in the **Available** state, it indicates that the server group is running.
      * 2.  You can call the [ListServerGroupServers](~~213628~~) operation to query the status of a backend server.
      *     *   If a backend server is in the **Removing** state, the server is being removed from the server group.
      *     *   If a backend server cannot be found, the server is no longer in the server group.
      *
     */
    CompletableFuture<RemoveServersFromServerGroupResponse> removeServersFromServerGroup(RemoveServersFromServerGroupRequest request);

    /**
      * **ReplaceServersInServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
      * 1.  You can call the [ListServerGroups](~~213627~~) operation to query the status of a server group.
      *     *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
      *     *   If a server group is in the **Available** state, it indicates that the server group is running.
      * 2.  You can call the [ListServerGroupServers](~~213628~~) operation to query the status of a backend server.
      *     *   If a backend server is in the **Replacing** state, it indicates that the server is being removed from the server group and a new server is added to the server group.
      *     *   If a backend server is in the \\*\\*Available\\*\\* state, it indicates that the server is running.
      *
     */
    CompletableFuture<ReplaceServersInServerGroupResponse> replaceServersInServerGroup(ReplaceServersInServerGroupRequest request);

    /**
      * **StartListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetListenerAttribute](~~2254865~~) to query the status of the task.
      * *   If a listener is in the **Configuring** state, the listener is being enabled.
      * *   If a listener is in the **Running** state, the listener is enabled.
      *
     */
    CompletableFuture<StartListenerResponse> startListener(StartListenerRequest request);

    /**
      * This operation is supported by Application Load Balancer (ALB) instances that use static IP addresses. The zone cannot be removed if the ALB instance has only one available zone.
      *
     */
    CompletableFuture<StartShiftLoadBalancerZonesResponse> startShiftLoadBalancerZones(StartShiftLoadBalancerZonesRequest request);

    /**
      * **StopListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetListenerAttribute](~~2254865~~) operation to query the status of the task:
      * *   If a listener is in the **Configuring** state, the listener is being disabled.
      * *   If a listener is in the **Stopped** state, the listener is disabled.
      *
     */
    CompletableFuture<StopListenerResponse> stopListener(StopListenerRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    /**
      * **UpdateAScripts** is an an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListAScripts](~~472574~~) operation to query the status of an AScript rule.
      * *   If the rule is in the **Configuring** state, the rule is being updated.
      * *   If the rule is in the **Available** state, the rule is updated.
      *
     */
    CompletableFuture<UpdateAScriptsResponse> updateAScripts(UpdateAScriptsRequest request);

    CompletableFuture<UpdateAclAttributeResponse> updateAclAttribute(UpdateAclAttributeRequest request);

    CompletableFuture<UpdateHealthCheckTemplateAttributeResponse> updateHealthCheckTemplateAttribute(UpdateHealthCheckTemplateAttributeRequest request);

    /**
      * **UpdateListenerAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetListenerAttribute](~~2254865~~) operation to query the status of the task.
      * *   If a listener is in the **Configuring** state, the configuration of the listener is being modified.
      * *   If a listener is in the **Running** state, the configuration of the listener is modified.
      *
     */
    CompletableFuture<UpdateListenerAttributeResponse> updateListenerAttribute(UpdateListenerAttributeRequest request);

    /**
      * **UpdateListenerLogConfig** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetListenerAttribute](~~2254865~~) to query the status of the task:
      * *   If a listener is in the **Configuring** state, the log configuration of the listener is being modified.
      * *   If a listener is in the **Running** state, the log configuration of the listener is modified.
      * > You can update the log configuration of a listener only after you enable the access log feature.
      *
     */
    CompletableFuture<UpdateListenerLogConfigResponse> updateListenerLogConfig(UpdateListenerLogConfigRequest request);

    /**
      * ## Prerequisites
      * *   An ALB instance is created. For more information about how to create an ALB instance, see [CreateLoadBalancer](~~214358~~).
      * *   If you want to change the network type from internal-facing to Internet-facing, you must first create an elastic IP address (EIP). For more information, see [AllocateEipAddress](~~120192~~).
      * ## Usage notes
      * **UpdateLoadBalancerAddressTypeConfig** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](~~214362~~) operation to query the status of the task.
      * *   If an ALB instance is in the **Configuring** state, the network type is being changed.
      * *   If an ALB instance is in the **Active** state, the network type has been changed.
      *
     */
    CompletableFuture<UpdateLoadBalancerAddressTypeConfigResponse> updateLoadBalancerAddressTypeConfig(UpdateLoadBalancerAddressTypeConfigRequest request);

    /**
      * **UpdateLoadBalancerAttribute** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](~~214362~~) to query the status of the task.
      * *   If the ALB instance is in the **Configuring** state, the ALB instance is being modified.
      * *   If the ALB instance is in the **Active** state, the ALB instance is modified.
      *
     */
    CompletableFuture<UpdateLoadBalancerAttributeResponse> updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request);

    /**
      * *   You can only upgrade a basic ALB instance to a standard ALB instance or a WAF-enabled ALB instance. You cannot downgrade a standard ALB instance or a WAF-enabled ALB instance to a basic ALB instance. For more information, see [Upgrade an ALB instance](~~214654~~).
      * *   **UpdateLoadBalancerEdition** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetLoadBalancerAttribute](~~214362~~) operation to query the status of an ALB instance.
      *     *   If the ALB instance is in the **Configuring** state, the edition of the ALB instance is being modified.
      *     *   If the ALB instance is in the **Active** state, the edition of the ALB instance is modified.
      *
     */
    CompletableFuture<UpdateLoadBalancerEditionResponse> updateLoadBalancerEdition(UpdateLoadBalancerEditionRequest request);

    /**
      * **UpdateLoadBalancerZones** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetLoadBalancerAttribute](~~214362~~) to query the status of the task.
      * *   If an ALB instance is in the **Configuring** state, the zones are being modified.
      * *   If an ALB instance is in the **Active** state, the zones are modified.
      * > You may be charged after you call UpdateLoadBalancerZones.
      *
     */
    CompletableFuture<UpdateLoadBalancerZonesResponse> updateLoadBalancerZones(UpdateLoadBalancerZonesRequest request);

    /**
      * *   **UpdateRuleAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](~~214379~~) operation to query the status of a forwarding rule:
      *     *   If a forwarding rule is in the **Configuring** state, the forwarding rule is being updated.
      *     *   If a forwarding rule is in the **Available** state, the forwarding rule is updated.
      * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. Take note of the following limits on the number of conditions and the number of actions in each forwarding rule:
      *     *   Number of conditions: You can specify at most 5 for a basic Application Load Balancer (ALB) instance, at most 10 for a standard ALB instance, and at most 10 for a WAF-enabled ALB instance.
      *     *   Number of actions: You can specify at most 3 for a basic ALB instance, at most 5 for a standard ALB instance, and at most 5 for a WAF-enabled ALB instance.
      *
     */
    CompletableFuture<UpdateRuleAttributeResponse> updateRuleAttribute(UpdateRuleAttributeRequest request);

    /**
      * **UpdateRulesAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListRules](~~214379~~) operation to query the status of the task.
      * *   If a forwarding rule is in the **Configuring** state, the forwarding rule is being updated.
      * *   If a forwarding rule is in the **Available** state, the forwarding rule is updated.
      * *   You can set **RuleConditions** and **RuleActions** to add conditions and actions to a forwarding rule. Take note of the following limits on the maximum number of conditions and the maximum number of actions in each forwarding rule:
      *     *   Limits on conditions: 5 for a basic Application Load Balancer (ALB) instance, 10 for a standard ALB instance, and 10 for a WAF-enabled ALB instance.
      *     *   Limits on actions: 3 for a basic ALB instance, 5 for a standard ALB instance, and 5 for a WAF-enabled ALB instance.
      *
     */
    CompletableFuture<UpdateRulesAttributeResponse> updateRulesAttribute(UpdateRulesAttributeRequest request);

    /**
      * ##
      * **UpdateSecurityPolicyAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [ListSecurityPolicies](~~213609~~) to query the status of the task.
      * *   If a security policy is in the **Configuring** state, the security policy is being updated.
      * *   If a security policy is in the **Available** state, the security policy is updated.
      *
     */
    CompletableFuture<UpdateSecurityPolicyAttributeResponse> updateSecurityPolicyAttribute(UpdateSecurityPolicyAttributeRequest request);

    /**
      * ## Description
      * **UpdateServerGroupAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListServerGroups](~~213627~~) operation to query the status of a server group:
      * *   If a server group is in the **Configuring** state, the configuration of the server group is being modified.
      * *   If a server group is in the **Available** state, the configuration of the server group is modified.
      *
     */
    CompletableFuture<UpdateServerGroupAttributeResponse> updateServerGroupAttribute(UpdateServerGroupAttributeRequest request);

    /**
      * **UpdateServerGroupServersAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
      * 1.  You can call the [ListServerGroups](~~213627~~) operation to query the status of a server group.
      *     *   If a server group is in the **Configuring** state, it indicates that the server group is being modified.
      *     *   If a server group is in the **Available** state, it indicates that the server group is running.
      * 2.  You can call the [ListServerGroupServers](~~213628~~) operation to query the status of a backend server.
      *     *   If a backend server is in the **Configuring** state, it indicates that the backend server is being modified.
      *     *   If a backend server is in the **Available** state, it indicates that the backend server is running.
      *
     */
    CompletableFuture<UpdateServerGroupServersAttributeResponse> updateServerGroupServersAttribute(UpdateServerGroupServersAttributeRequest request);

}
