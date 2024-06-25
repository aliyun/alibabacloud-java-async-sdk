// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.nlb20220430.models.*;
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

    CompletableFuture<AddServersToServerGroupResponse> addServersToServerGroup(AddServersToServerGroupRequest request);

    /**
      * **AssociateAdditionalCertificatesWithListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListListenerCertificates](~~615175~~) operation to query the status of the task:
      * *   If the listener is in the **Associating** state, the additional certificates are being associated.
      * *   If the listener is in the **Associated** state, the additional certificates are associated.
      *
     */
    CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request);

    CompletableFuture<AttachCommonBandwidthPackageToLoadBalancerResponse> attachCommonBandwidthPackageToLoadBalancer(AttachCommonBandwidthPackageToLoadBalancerRequest request);

    /**
      * Before you call this operation, the zone of the Network Load Balancer (NLB) instance is removed from the DNS record by using the console or calling the [StartShiftLoadBalancerZones](~~2411999~~) API operation.
      *
     */
    CompletableFuture<CancelShiftLoadBalancerZonesResponse> cancelShiftLoadBalancerZones(CancelShiftLoadBalancerZonesRequest request);

    CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request);

    /**
      * *   When you create an NLB instance, the service-linked role AliyunServiceRoleForNlb is automatically created and assigned to you.
      * *   **CreateLoadBalancer** is an asynchronous operation. After you send a request, the system returns an instance ID and runs the task in the background. You can call [GetLoadBalancerAttribute](~~445873~~) to query the status of an NLB instance.
      *     *   If an NLB instance is in the **Provisioning** state, the NLB instance is being created.
      *     *   If an NLB instance is in the **Active** state, the NLB instance is created.
      *
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    CompletableFuture<CreateSecurityPolicyResponse> createSecurityPolicy(CreateSecurityPolicyRequest request);

    /**
      * *   **protocol** specifies the protocol used to forward requests to the backend servers.
      * *   NLB instances support only backend server groups that use TCP, UDP, or SSL over TCP.
      * *   **CreateServerGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetJobStatus](~~445904~~) operation to query the creation status of the task.
      *     *   If the task is in the **Succeeded** status, the server group is created.
      *     *   If the task is in the **Processing** status, the server group is being created.
      *
     */
    CompletableFuture<CreateServerGroupResponse> createServerGroup(CreateServerGroupRequest request);

    CompletableFuture<DeleteListenerResponse> deleteListener(DeleteListenerRequest request);

    CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request);

    CompletableFuture<DeleteSecurityPolicyResponse> deleteSecurityPolicy(DeleteSecurityPolicyRequest request);

    /**
      * You can delete server groups that are not associated with listeners.
      *
     */
    CompletableFuture<DeleteServerGroupResponse> deleteServerGroup(DeleteServerGroupRequest request);

    CompletableFuture<DescribeHdMonitorRegionConfigResponse> describeHdMonitorRegionConfig(DescribeHdMonitorRegionConfigRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    CompletableFuture<DetachCommonBandwidthPackageFromLoadBalancerResponse> detachCommonBandwidthPackageFromLoadBalancer(DetachCommonBandwidthPackageFromLoadBalancerRequest request);

    CompletableFuture<DisableLoadBalancerIpv6InternetResponse> disableLoadBalancerIpv6Internet(DisableLoadBalancerIpv6InternetRequest request);

    /**
      * **DisassociateAdditionalCertificatesWithListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListListenerCertificates](~~615175~~) operation to query the status of the task:
      * *   If an additional certificate is in the **Dissociating** state, the additional certificate is being disassociated.
      * *   If an additional certificate is in the **Dissociated** state, the additional certificate is disassociated.
      *
     */
    CompletableFuture<DisassociateAdditionalCertificatesWithListenerResponse> disassociateAdditionalCertificatesWithListener(DisassociateAdditionalCertificatesWithListenerRequest request);

    CompletableFuture<EnableLoadBalancerIpv6InternetResponse> enableLoadBalancerIpv6Internet(EnableLoadBalancerIpv6InternetRequest request);

    CompletableFuture<GetJobStatusResponse> getJobStatus(GetJobStatusRequest request);

    CompletableFuture<GetListenerAttributeResponse> getListenerAttribute(GetListenerAttributeRequest request);

    CompletableFuture<GetListenerHealthStatusResponse> getListenerHealthStatus(GetListenerHealthStatusRequest request);

    CompletableFuture<GetLoadBalancerAttributeResponse> getLoadBalancerAttribute(GetLoadBalancerAttributeRequest request);

    CompletableFuture<ListListenerCertificatesResponse> listListenerCertificates(ListListenerCertificatesRequest request);

    CompletableFuture<ListListenersResponse> listListeners(ListListenersRequest request);

    CompletableFuture<ListLoadBalancersResponse> listLoadBalancers(ListLoadBalancersRequest request);

    CompletableFuture<ListSecurityPolicyResponse> listSecurityPolicy(ListSecurityPolicyRequest request);

    CompletableFuture<ListServerGroupServersResponse> listServerGroupServers(ListServerGroupServersRequest request);

    CompletableFuture<ListServerGroupsResponse> listServerGroups(ListServerGroupsRequest request);

    CompletableFuture<ListSystemSecurityPolicyResponse> listSystemSecurityPolicy(ListSystemSecurityPolicyRequest request);

    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * *   Make sure that you have created a security group. For more information about how to create a security group, see [CreateSecurityGroup](~~25553~~).
      * *   An NLB instance can be associated with up to four security groups.
      * *   You can query the security groups that are associated with an NLB instance by calling the [GetLoadBalancerAttribute](~~214362~~) operation.
      * *   LoadBalancerJoinSecurityGroup is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetJobStatus](~~445904~~) operation to query the status of a task.
      *     *   If the task is in the **Succeeded** state, the security group is associated.
      *     *   If the task is in the **Processing** state, the security group is being associated. In this case, you can perform only query operations.
      *
     */
    CompletableFuture<LoadBalancerJoinSecurityGroupResponse> loadBalancerJoinSecurityGroup(LoadBalancerJoinSecurityGroupRequest request);

    /**
      * LoadBalancerLeaveSecurityGroup is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetJobStatus](~~445904~~) operation to query the status of a task.
      * *   If the task is in the **Succeeded** state, the security group is disassociated.
      * *   If the task is in the **Processing** state, the security group is being disassociated. In this case, you can perform only query operations.
      *
     */
    CompletableFuture<LoadBalancerLeaveSecurityGroupResponse> loadBalancerLeaveSecurityGroup(LoadBalancerLeaveSecurityGroupRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<RemoveServersFromServerGroupResponse> removeServersFromServerGroup(RemoveServersFromServerGroupRequest request);

    CompletableFuture<SetHdMonitorRegionConfigResponse> setHdMonitorRegionConfig(SetHdMonitorRegionConfigRequest request);

    CompletableFuture<StartListenerResponse> startListener(StartListenerRequest request);

    /**
      * > If a Network Load Balancer (NLB) instance is deployed only in one zone, you cannot remove the NLB instance from the zone.
      *
     */
    CompletableFuture<StartShiftLoadBalancerZonesResponse> startShiftLoadBalancerZones(StartShiftLoadBalancerZonesRequest request);

    CompletableFuture<StopListenerResponse> stopListener(StopListenerRequest request);

    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateListenerAttributeResponse> updateListenerAttribute(UpdateListenerAttributeRequest request);

    /**
      * *   Make sure that an NLB instance is created. For more information, see [CreateLoadBalancer](~~445868~~).
      * *   You can call the [GetLoadBalancerAttribute](~~445873~~) operation to query the **AddressType** value of an NLB instance after you change the network type.
      * *   **UpdateLoadBalancerAddressTypeConfig** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetJobStatus](~~445904~~) operation to query the task status:
      *     *   If the task is in the **Succeeded** state, the network type of the IPv4 address of the NLB instance is changed.
      *     *   If the task is in the **Processing** state, the network type of the IPv4 address of the NLB instance is being changed. In this case, you can perform only query operations.
      *
     */
    CompletableFuture<UpdateLoadBalancerAddressTypeConfigResponse> updateLoadBalancerAddressTypeConfig(UpdateLoadBalancerAddressTypeConfigRequest request);

    CompletableFuture<UpdateLoadBalancerAttributeResponse> updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request);

    /**
      * > You can call the [GetLoadBalancerAttribute](~~445873~~) operation to query the details about deletion protection and the configuration read-only mode.
      *
     */
    CompletableFuture<UpdateLoadBalancerProtectionResponse> updateLoadBalancerProtection(UpdateLoadBalancerProtectionRequest request);

    /**
      * When you call this operation, make sure that you specify all the zones of the NLB instance, including the existing zones and new zones. If you do not specify the existing zones, the existing zones are removed.
      * Prerequisites
      * *   An NLB instance is created. For more information, see [CreateLoadBalancer](~~445868~~).
      * *   You can call the [GetLoadBalancerAttribute](~~445873~~) operation to query the zones and zone attributes of an NLB instance.
      * *   **UpdateLoadBalancerZones** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetJobStatus](~~445904~~) operation query to query the status of a task:
      *     *   If the task is in the **Succeeded** state, the zones and zone attributes are modified.
      *     *   If the task is in the **Processing** state, the zones and zone attributes are being modified. In this case, you can perform only query operations.
      *
     */
    CompletableFuture<UpdateLoadBalancerZonesResponse> updateLoadBalancerZones(UpdateLoadBalancerZonesRequest request);

    CompletableFuture<UpdateSecurityPolicyAttributeResponse> updateSecurityPolicyAttribute(UpdateSecurityPolicyAttributeRequest request);

    CompletableFuture<UpdateServerGroupAttributeResponse> updateServerGroupAttribute(UpdateServerGroupAttributeRequest request);

    /**
      * **UpdateServerGroupServersAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.
      * 1.  You can call the [ListServerGroups](~~445895~~) operation to query the status of a server group.
      *     *   If a server group is in the **Configuring** state, the server group is being modified.
      *     *   If a server group is in the **Available** state, the server group is running.
      * 2.  You can call the [ListServerGroupServers](~~445896~~) operation to query the status of a backend server.
      *     *   If a backend server is in the **Configuring** state, it indicates that the backend server is being modified.
      *     *   If a backend server is in the **Available** state, it indicates that the backend server is running.
      *
     */
    CompletableFuture<UpdateServerGroupServersAttributeResponse> updateServerGroupServersAttribute(UpdateServerGroupServersAttributeRequest request);

}
