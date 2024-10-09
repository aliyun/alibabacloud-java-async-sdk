// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.ecs20140526.models.*;
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
     * @param request the request parameters of AcceptInquiredSystemEvent  AcceptInquiredSystemEventRequest
     * @return AcceptInquiredSystemEventResponse
     */
    CompletableFuture<AcceptInquiredSystemEventResponse> acceptInquiredSystemEvent(AcceptInquiredSystemEventRequest request);

    /**
     * @deprecated OpenAPI ActivateRouterInterface is deprecated  * @param request  the request parameters of ActivateRouterInterface  ActivateRouterInterfaceRequest
     * @return ActivateRouterInterfaceResponse
     */
    @Deprecated
    CompletableFuture<ActivateRouterInterfaceResponse> activateRouterInterface(ActivateRouterInterfaceRequest request);

    /**
     * @deprecated OpenAPI AddBandwidthPackageIps is deprecated  * @param request  the request parameters of AddBandwidthPackageIps  AddBandwidthPackageIpsRequest
     * @return AddBandwidthPackageIpsResponse
     */
    @Deprecated
    CompletableFuture<AddBandwidthPackageIpsResponse> addBandwidthPackageIps(AddBandwidthPackageIpsRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Up to 20 tags can be added to each ECS resource.</li>
     * <li><code>Tag.N.Key</code> must match <code>Tag.N.Value</code> based on the value of N.</li>
     * <li>If you add a tag that has the same key (<code>Tag.N.Key</code>) as an existing tag on the specified resource, the new tag value (<code>Tag.N.Value</code>) overwrites the original tag value.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTags  AddTagsRequest
     * @return AddTagsResponse
     */
    CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you create a dedicated host, you can call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation to query the resources available in a specific region or zone.
     * We recommend that you understand the billing methods of resources before you create a dedicated host. You are charged for resources used by the created dedicated host. For more information, see <a href="https://help.aliyun.com/document_detail/68978.html">Billing overview</a>.</p>
     * <ul>
     * <li>You can create up to 100 pay-as-you-go or subscription dedicated hosts at a time.</li>
     * <li>After a dedicated host is created, you can use the returned dedicated host ID as the value of a request parameter to call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query the state of the dedicated host.</li>
     * <li>After you submit a request to create a dedicated host, an error is returned if a specific parameter is invalid or if the requested resources are insufficient. For more information about error causes, see the &quot;Error codes&quot; section of this topic.</li>
     * <li>After a dedicated host is created, you can call the <a href="https://help.aliyun.com/document_detail/134248.html">ModifyInstanceDeployment</a> operation to migrate ECS instances from a shared host to the dedicated host. You can also migrate ECS instances from another dedicated host to the created dedicated host.</li>
     * </ul>
     * 
     * @param request the request parameters of AllocateDedicatedHosts  AllocateDedicatedHostsRequest
     * @return AllocateDedicatedHostsResponse
     */
    CompletableFuture<AllocateDedicatedHostsResponse> allocateDedicatedHosts(AllocateDedicatedHostsRequest request);

    /**
     * @deprecated OpenAPI AllocateEipAddress is deprecated, please use Vpc::2016-04-28::AllocateEipAddress instead.  * @description > This operation has been upgraded. We recommend that you do not use it. For information about the new version of this operation, see [AllocateEipAddress](https://help.aliyun.com/document_detail/120192.html).
     * 
     * @param request the request parameters of AllocateEipAddress  AllocateEipAddressRequest
     * @return AllocateEipAddressResponse
     */
    @Deprecated
    CompletableFuture<AllocateEipAddressResponse> allocateEipAddress(AllocateEipAddressRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The instance to which you want to assign a public IP address must be in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>If <code>OperationLocks</code> in the response of the DescribeInstances operation contains <code>&quot;LockReason&quot; : &quot;security&quot;</code> for an instance, the instance is <a href="https://help.aliyun.com/document_detail/25695.html">locked for security reasons</a> and cannot be assigned a public IP address.</li>
     * <li>You can assign only one public IP address to an instance. If the instance already has a public IP address, the <code>AllocatedAlready</code> error code is returned.</li>
     * <li>After you assign a public IP address to an instance, you must restart the instance (<a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a>) or start the instance (<a href="https://help.aliyun.com/document_detail/25500.html">StartInstance</a>) for the public IP address to take effect.
     * If an instance resides in a virtual private cloud (VPC), you can assign a public IP address to the instance or associate an elastic IP address (EIP) with the instance. For more information, see <a href="https://help.aliyun.com/document_detail/2518064.html">AssociateEipAddress</a>.<blockquote>
     * <p> After you associate an EIP with an instance that resides in a VPC, you cannot assign a public IP address to the instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AllocatePublicIpAddress  AllocatePublicIpAddressRequest
     * @return AllocatePublicIpAddressResponse
     */
    CompletableFuture<AllocatePublicIpAddressResponse> allocatePublicIpAddress(AllocatePublicIpAddressRequest request);

    /**
     * <b>description</b> :
     * <p>  Each disk can have only one automatic snapshot policy.</p>
     * <ul>
     * <li>Each automatic snapshot policy can be applied to multiple disks.</li>
     * </ul>
     * 
     * @param request the request parameters of ApplyAutoSnapshotPolicy  ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can specify IPv6 addresses in the CIDR block of the vSwitch to which the ENI is connected. You can also specify the number of IPv6 addresses that the system assigns to the ENI. Take note of the following items:</p>
     * <ul>
     * <li>IPv6 must be enabled on the vSwitch to which the ENI is connected. For more information, see <a href="https://help.aliyun.com/document_detail/98923.html">Enable IPv6 for a vSwitch</a>.</li>
     * <li>The ENI must be in the Available (Available) or InUse (InUse) state.</li>
     * <li>If you want to assign IPv6 addresses to a primary ENI, make sure that the Elastic Compute Service (ECS) instance to which the ENI is attached is in the Running (Running) or Stopped (Stopped) state.</li>
     * <li>The maximum number of IPv6 addresses that can be assigned to an ENI varies based on the instance type of the instance to which the ENI is attached.<ul>
     * <li>If the ENI is in the Available (Available) state, up to 10 IPv6 addresses can be assigned to the ENI.</li>
     * <li>If the ENI is attached to an ECS instance, the maximum number of IPv6 addresses that can be assigned to the ENI varies based on the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
     * </ul>
     * </li>
     * <li>After the operation is called, you can obtain the IPv6 addresses that are assigned to the ENI from the response.</li>
     * </ul>
     * 
     * @param request the request parameters of AssignIpv6Addresses  AssignIpv6AddressesRequest
     * @return AssignIpv6AddressesResponse
     */
    CompletableFuture<AssignIpv6AddressesResponse> assignIpv6Addresses(AssignIpv6AddressesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The ENI to which you want to assign secondary private IP addresses must be in the Available (Available) or InUse (InUse) state.</li>
     * <li>When you assign private IP addresses to a primary ENI, the Elastic Compute Service (ECS) instance to which the ENI is attached must be in the Running (Running) or Stopped (Stopped) state.</li>
     * <li>When an ENI is in the Available state, you can assign up to 49 secondary private IP addresses to the ENI. When an ENI is attached to an instance, the number of secondary private IP addresses that can be assigned to the ENI varies based on the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</li>
     * <li>After the operation is called, you can obtain the assigned secondary private IP addresses from the response.</li>
     * </ul>
     * 
     * @param request the request parameters of AssignPrivateIpAddresses  AssignPrivateIpAddressesRequest
     * @return AssignPrivateIpAddressesResponse
     */
    CompletableFuture<AssignPrivateIpAddressesResponse> assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request);

    /**
     * @deprecated OpenAPI AssociateEipAddress is deprecated, please use Vpc::2016-04-28::AssociateEipAddress instead.  * @param request  the request parameters of AssociateEipAddress  AssociateEipAddressRequest
     * @return AssociateEipAddressResponse
     */
    @Deprecated
    CompletableFuture<AssociateEipAddressResponse> associateEipAddress(AssociateEipAddressRequest request);

    /**
     * @deprecated OpenAPI AssociateHaVip is deprecated  * @param request  the request parameters of AssociateHaVip  AssociateHaVipRequest
     * @return AssociateHaVipResponse
     */
    @Deprecated
    CompletableFuture<AssociateHaVipResponse> associateHaVip(AssociateHaVipRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The instance that you want to connect to a VPC must be in the <strong>Running</strong> or <strong>Stopped</strong> state.</li>
     * <li>The ClassicLink feature must be enabled for the destination VPC. For more information, see <a href="https://help.aliyun.com/document_detail/65413.html">Create a ClassicLink connection</a>.</li>
     * <li>The instance and the VPC must reside in the same region.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachClassicLinkVpc  AttachClassicLinkVpcRequest
     * @return AttachClassicLinkVpcResponse
     */
    CompletableFuture<AttachClassicLinkVpcResponse> attachClassicLinkVpc(AttachClassicLinkVpcRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The disk must be in the <strong>Unattached</strong> (<code>Available</code>) state.</li>
     * <li>When you attach the disk as a data disk to an ECS instance, take note of the following items:<ul>
     * <li>The ECS instance must be in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>If the disk was separately purchased, the billing method of the disk must be pay-as-you-go.</li>
     * <li>If the disk is a system disk that was detached from an ECS instance, no limits apply to the billing method of the disk.</li>
     * <li>If the disk is an elastic ephemeral disk that was detached from an ECS instance, the disk can be attached only to the instance.</li>
     * </ul>
     * </li>
     * <li>When you attach the disk as the system disk to an ECS instance, take note of the following items:<ul>
     * <li>The ECS instance must be the original instance from which the system disk was detached.</li>
     * <li>The ECS instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>Logon credentials must be configured.</li>
     * <li>The disk cannot be an elastic ephemeral disk.</li>
     * </ul>
     * </li>
     * <li>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> when you query information about an ECS instance, the instance is locked for security reasons and no operations are allowed on the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachDisk  AttachDiskRequest
     * @return AttachDiskResponse
     */
    CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request);

    /**
     * @param request the request parameters of AttachInstanceRamRole  AttachInstanceRamRoleRequest
     * @return AttachInstanceRamRoleResponse
     */
    CompletableFuture<AttachInstanceRamRoleResponse> attachInstanceRamRole(AttachInstanceRamRoleRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>SSH key pairs are not supported on Windows instances.</li>
     * <li>If an SSH key pair is bound to an instance, authentication by using the username and password is disabled for the instance.</li>
     * <li>If you bind an SSH key pair to an instance in the <strong>running</strong> state, you must call the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation to restart the instance for the key pair to take effect.</li>
     * <li>If you bind an SSH key pair to an instance in the <strong>stopped</strong> state, you must call the <a href="https://help.aliyun.com/document_detail/25500.html">StartInstance</a> operation to start the instance for the key pair to take effect.</li>
     * <li>If an instance is already bound to an SSH key pair, the new SSH key pair will replace the original one.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachKeyPair  AttachKeyPairRequest
     * @return AttachKeyPairResponse
     */
    CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The ENI must be in the <strong>Available</strong> state. You can attach an ENI to only one instance that resides in the same zone and VPC as the ENI.</li>
     * <li>The instance must be in the Running or Stopped state. When you attach ENIs to instances of specific instance types, make sure that the instances are in the Stopped state. For more information, see the &quot;Instance types of the ECS instances that must be in the Stopped (Stopped) state&quot; section in the <a href="https://help.aliyun.com/document_detail/58503.html">Bind an ENI</a> topic.<blockquote>
     * <p>If the last start time of the instance (including the start time of the instance if it is a new instance, the last restart time of the instance, and the last reactivation time of the instance) is before April 1st, 2018 and the instance is in the Running state, you must call the RebootInstance operation to restart the instance. If you do not call the RebootInstance operation to restart the instance, you cannot attach the ENI to the instance.</p>
     * </blockquote>
     * </li>
     * <li>You can attach multiple ENIs to one instance. For more information, see <a href="https://help.aliyun.com/document_detail/58496.html">ENI overview</a>.</li>
     * <li>The vSwitch to which the ENI is connected must be in the same zone and VPC as the vSwitch to which the instance is connected.</li>
     * <li>This operation is an asynchronous operation. After you call this operation to attach an ENI, you can view the status or events of the ENI to check whether the ENI is attached. The following figure shows the transitions between the statuses of the ENI.
     * <img src="https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/en-US/20230223/vqky/AttachNetworkInterface.png" alt=""></li>
     * </ul>
     * <ul>
     * <li>If the ENI is in the Attaching state, the ENI attachment request is sent and the ENI is being attached to the specified instance. </li>
     * <li>If the ENI is in the InUse state, the ENI is attached to the specified instance.</li>
     * <li>If the ENI is in the Available state, the ENI failed to be attached.
     * <strong>For examples on how to call this operation, see</strong> <a href="https://help.aliyun.com/document_detail/471550.html">Attach an ENI</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachNetworkInterface  AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
     */
    CompletableFuture<AttachNetworkInterfaceResponse> attachNetworkInterface(AttachNetworkInterfaceRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The total number of outbound and inbound rules in each security group cannot exceed 200. For more information, see the &quot;Security group limits&quot; section in <a href="~~25412#SecurityGroupQuota1~~">Limits</a>.</li>
     * <li>The valid values of Priority range from 1 to 100. A smaller value indicates a higher priority.</li>
     * <li>When multiple security group rules have the same priority, drop rules take precedence.</li>
     * <li>The source can be a CIDR block that is specified by SourceCidrIp, Ipv6SourceCidrIp, or SourcePrefixListId. The source can also be Elastic Compute Service (ECS) instances in a security group that is specified by SourceGroupId.</li>
     * <li>You cannot reference security groups as sources or destinations in the rules of advanced security groups.</li>
     * <li>You can reference up to 20 security groups as sources or destinations in the rules of each basic security group.</li>
     * <li>If the specified security group rule already exists in the security group, the call is successful but no security group rule is created.</li>
     * <li>Parameters and their <code>Permissions.N</code>-prefixed counterparts cannot be specified at the same time. We recommend that you use the <code>Permissions.N</code>-prefixed parameters.</li>
     * <li>You can determine a security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.<ul>
     * <li>Parameters used to specify an inbound security group rule that controls access from a specific CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and SourceCidrIp. For a security group of the Virtual Private Cloud (VPC) type, you must set NicType to intranet. For a security group of the classic network type, you can set NicType to either internet or intranet. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroup
     * &amp;SecurityGroupId=sg-bp67acfmxazb4p****
     * &amp;Permissions.1.SourceCidrIp=10.0.0.0/8
     * &amp;Permissions.1.IpProtocol=TCP
     * &amp;Permissions.1.PortRange=22/22
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=Accept
     * &amp;<Common request parameters></li>
     * <li>Parameters used to determine an inbound security group rule that controls access from a security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceGroupOwnerAccount, and SourceGroupId. In this case, you must set NicType to intranet. For mutual access between security groups in the classic network, you can allow or deny another security group within the same region access to your security group. The security group that is allowed access to your security group can belong to your own Alibaba Cloud account or another Alibaba Cloud account specified by SourceGroupOwnerAccount. For mutual access between security groups in VPCs, you can allow or deny another security group within the same VPC access to your security group. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroup
     * &amp;SecurityGroupId=sg-bp67acfmxazb4p****
     * &amp;Permissions.1.SourceGroupId=sg-1651FBB**
     * &amp;Permissions.1.SourceGroupOwnerAccount=<a href="mailto:test@aliyun.com">test@aliyun.com</a>
     * &amp;Permissions.1.IpProtocol=TCP
     * &amp;Permissions.1.PortRange=22/22
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=Drop
     * &amp;<Common request parameters></li>
     * <li>Parameters used to determine an inbound security group rule that controls access from a prefix list: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and SourcePrefixListId. In this case, prefix lists support only security groups in VPCs. NicType must be set to intranet. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroup
     * &amp;SecurityGroupId=sg-bp67acfmxazb4p****
     * &amp;Permissions.1.SourcePrefixListId=pl-x1j1k5ykzqlixdcy****
     * &amp;Permissions.1.SourceGroupOwnerAccount=<a href="mailto:test@aliyun.com">test@aliyun.com</a>
     * &amp;Permissions.1.IpProtocol=TCP
     * &amp;Permissions.1.PortRange=22/22
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=Drop
     * &amp;<Common request parameters></li>
     * </ul>
     * </li>
     * <li>For information about examples on security group rule settings, see <a href="https://help.aliyun.com/document_detail/25475.html">Security groups for different use cases</a> and <a href="https://help.aliyun.com/document_detail/97439.html">Security group quintuple rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AuthorizeSecurityGroup  AuthorizeSecurityGroupRequest
     * @return AuthorizeSecurityGroupResponse
     */
    CompletableFuture<AuthorizeSecurityGroupResponse> authorizeSecurityGroup(AuthorizeSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <p>In the security group-related API documents, outbound traffic refers to the traffic that is sent by the source device and received at the destination device.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The total number of inbound and outbound security group rules in each security group cannot exceed 200. For more information, see the &quot;Security group limits&quot; section in <a href="~~25412#SecurityGroupQuota1~~"></a>.</li>
     * <li>You can set Policy to accept or drop for each security group rule to allow or deny access.</li>
     * <li>The valid value of Priority ranges from 1 to 100. A smaller value indicates a higher priority.</li>
     * <li>When several security group rules have the same priority, drop rules take precedence.</li>
     * <li>The destination can be a CIDR block specified by DestCidrIp, Ipv6DestCidrIp, or DestPrefixListId or can be Elastic Compute Service (ECS) instances in a security group specified by DestGroupId.</li>
     * <li>For advanced security groups, security groups cannot be used as authorization objects.</li>
     * <li>For each basic security group, a maximum of 20 security groups can be used as authorization objects.</li>
     * <li>If the specified security group rule exists in the security group, the call is successful but no security group rule is created.</li>
     * <li>The <code>Permissions.N</code> prefix is added to some parameters to generate new parameters. Original parameters and corresponding parameters prefixed with Permissions.N cannot be configured together. We recommend that you use parameters prefixed with <code>Permissions.N</code>.</li>
     * <li>You can determine a security group rule by configuring one of the following groups of parameters. You cannot determine a security group rule by configuring only one parameter.<ul>
     * <li>Parameters used to specify a security group rule that controls access to a specified CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and DestCidrIp. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroupEgress
     * &amp;SecurityGroupId=sg-bp67acfmxazb4ph***
     * &amp;Permissions.1.IpProtocol=ICMP
     * &amp;Permissions.1.DestCidrIp=10.0.0.0/8
     * &amp;Permissions.1.PortRange=-1/-1
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=Accept
     * &amp;<Common request parameters></li>
     * <li>Parameters used to specify a security group rule that controls access to a security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestGroupOwnerAccount, and DestGroupId. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroupEgress
     * &amp;SecurityGroupId=sg-bp67acfmxazb4ph***
     * &amp;Permissions.1.DestGroupId=sg-bp67acfmxazb4pi***
     * &amp;Permissions.1.DestGroupOwnerAccount=<a href="mailto:Test@aliyun.com">Test@aliyun.com</a>
     * &amp;Permissions.1.IpProtocol=TCP
     * &amp;Permissions.1.PortRange=22/22
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=Drop
     * &amp;<Common request parameters></li>
     * <li>Parameters used to specify a security group rule that controls access to a prefix list: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and DestPrefixListId. In this case, prefix lists support only security groups in virtual private clouds (VPCs). NicType must be set to intranet. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroupEgress
     * &amp;SecurityGroupId=sg-bp67acfmxazb4ph***
     * &amp;Permissions.1.DestPrefixListId=pl-x1j1k5ykzqlixdcy****
     * &amp;Permissions.1.DestGroupOwnerAccount=<a href="mailto:Test@aliyun.com">Test@aliyun.com</a>
     * &amp;Permissions.1.IpProtocol=TCP
     * &amp;Permissions.1.PortRange=22/22
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=Drop
     * &amp;<Common request parameters></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AuthorizeSecurityGroupEgress  AuthorizeSecurityGroupEgressRequest
     * @return AuthorizeSecurityGroupEgressResponse
     */
    CompletableFuture<AuthorizeSecurityGroupEgressResponse> authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request);

    /**
     * @param request the request parameters of CancelAutoSnapshotPolicy  CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
    CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>After you cancel an image copy task, the image copy created in the destination region is deleted, and the copied image remains unchanged.</li>
     * <li>If the image copy task is complete, the CancelCopyImage operation fails, and an error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelCopyImage  CancelCopyImageRequest
     * @return CancelCopyImageResponse
     */
    CompletableFuture<CancelCopyImageResponse> cancelCopyImage(CancelCopyImageRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the image build task to be canceled is in the BUILDING, DISTRIBUTING, or RELEASING state.</p>
     * 
     * @param request the request parameters of CancelImagePipelineExecution  CancelImagePipelineExecutionRequest
     * @return CancelImagePipelineExecutionResponse
     */
    CompletableFuture<CancelImagePipelineExecutionResponse> cancelImagePipelineExecution(CancelImagePipelineExecutionRequest request);

    /**
     * @deprecated OpenAPI CancelPhysicalConnection is deprecated  * @param request  the request parameters of CancelPhysicalConnection  CancelPhysicalConnectionRequest
     * @return CancelPhysicalConnectionResponse
     */
    @Deprecated
    CompletableFuture<CancelPhysicalConnectionResponse> cancelPhysicalConnection(CancelPhysicalConnectionRequest request);

    /**
     * @param request the request parameters of CancelSimulatedSystemEvents  CancelSimulatedSystemEventsRequest
     * @return CancelSimulatedSystemEventsResponse
     */
    CompletableFuture<CancelSimulatedSystemEventsResponse> cancelSimulatedSystemEvents(CancelSimulatedSystemEventsRequest request);

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
    CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request);

    /**
     * @deprecated OpenAPI ConnectRouterInterface is deprecated  * @param request  the request parameters of ConnectRouterInterface  ConnectRouterInterfaceRequest
     * @return ConnectRouterInterfaceResponse
     */
    @Deprecated
    CompletableFuture<ConnectRouterInterfaceResponse> connectRouterInterface(ConnectRouterInterfaceRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>After a public IP address is converted into an EIP, the EIP is billed separately. Make sure that you fully understand the billing methods of EIPs. For more information, see <a href="https://help.aliyun.com/document_detail/122035.html">Billing overview</a>.
     * When you call this operation, make sure that the ECS instance meets the following requirements:</p>
     * <ul>
     * <li>The instance is in the <strong>Stopped</strong> (<code>Stopped</code>) or <strong>Running</strong> (<code>Running</code>) state.</li>
     * <li>The instance has no EIPs associated.</li>
     * <li>The instance has no configuration change tasks that have not taken effect.</li>
     * <li>The public bandwidth of the instance is not 0 Mbit/s.</li>
     * <li>If the instance is a subscription instance, the billing method for network usage of the instance must be <code>pay-by-traffic</code>. The public IP address of a subscription instance that uses the <code>pay-by-bandwidth</code> billing method for network usage cannot be converted into an EIP. This requirement does not apply to pay-as-you-go instances. For more information, see <a href="https://help.aliyun.com/document_detail/178883.html">Change the billing method for network usage</a>.</li>
     * <li>If the instance is a subscription instance that resides in a VPC, the instance does not expire within 24 hours.</li>
     * </ul>
     * 
     * @param request the request parameters of ConvertNatPublicIpToEip  ConvertNatPublicIpToEipRequest
     * @return ConvertNatPublicIpToEipResponse
     */
    CompletableFuture<ConvertNatPublicIpToEipResponse> convertNatPublicIpToEip(ConvertNatPublicIpToEipRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>After you copy a custom image to the destination region, you can use the image copy (new image) to create ECS instances by calling the RunInstances operation or replace the system disks of instances by calling the ReplaceSystemDisk operation in the destination region.
     * Take note of the following items:</p>
     * <ul>
     * <li>Only custom images that are in the <code>Available</code> state can be copied.</li>
     * <li>Custom images that you want to copy must belong to your Alibaba Cloud account or be shared to you by others, and cannot be copied across accounts.</li>
     * <li>When an image is being copied, the image copy cannot be deleted by calling the <a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a> operation. However, you can cancel the ongoing image copy task by calling the <a href="https://help.aliyun.com/document_detail/25539.html">CancelCopyImage</a> operation.</li>
     * <li>A region supports only up to five concurrent image copy tasks. Excess image copy tasks are queued for execution.</li>
     * <li>You can configure <code>ResourceGroupId</code> to specify the resource group to which to assign the new image. If you do not configure <code>ResourceGroupId</code>, the new image is assigned to the default resource group.</li>
     * </ul>
     * 
     * @param request the request parameters of CopyImage  CopyImageRequest
     * @return CopyImageResponse
     */
    CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>New snapshots (snapshot copies) cannot be used to roll back the disks for which source snapshots (copied snapshots) were created.</li>
     * <li>Local snapshots cannot be copied.</li>
     * </ul>
     * 
     * @param request the request parameters of CopySnapshot  CopySnapshotRequest
     * @return CopySnapshotResponse
     */
    CompletableFuture<CopySnapshotResponse> copySnapshot(CopySnapshotRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>After you use an activation code to register a server that is not provided by Alibaba Cloud as an Alibaba Cloud managed instance, you can use a variety of online services provided by Alibaba Cloud, such as Cloud Assistant, CloudOps Orchestration Service (OOS), and Apsara Devops on the managed instance.
     * If a server is not provided by Alibaba Cloud, you can register the server as an Alibaba Cloud managed instance only if the server has Internet connectivity and runs one of the following operating systems:</p>
     * <ul>
     * <li>Alibaba Cloud Linux 2 and Alibaba Cloud Linux 3 and later</li>
     * <li>CentOS 6, CentOS 7, and CentOS 8 and later</li>
     * <li>Debian 8, Debian 9, and Debian 10 and later</li>
     * <li>Ubuntu 12, Ubuntu 14, Ubuntu 16, and Ubuntu 18 and later</li>
     * <li>CoreOS</li>
     * <li>OpenSUSE</li>
     * <li>Red Hat 5, Red Hat 6, and Red Hat 7 and later</li>
     * <li>SUSE Linux Enterprise Server 11, SUSE Linux Enterprise Server 12, and SUSE Linux Enterprise Server 15 and later</li>
     * <li>Windows Server 2012, Windows Server 2016, and Windows Server 2019 and later
     * You can have up to 5,000 activation codes per Alibaba Cloud region. When the number of activation codes exceeds 1,000, the usage of the activation codes must be greater than 50% before you can create additional activation codes.<blockquote>
     * <p> To obtain the usage of activation codes, go to the <strong>ECS Cloud Assistant</strong> page, click the <strong>Manage Instances</strong> tab, and then click <strong>Register Instance</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateActivation  CreateActivationRequest
     * @return CreateActivationResponse
     */
    CompletableFuture<CreateActivationResponse> createActivation(CreateActivationRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>Auto Provisioning is a service that allows quick deployment of an instance cluster that consists of preemptible instances and pay-as-you-go instances. Auto Provisioning supports push-button deployment of instance clusters across different billing methods, instance families, and zones. For more information, see <a href="https://help.aliyun.com/document_detail/200772.html">Use auto provisioning group-related API operations to create multiple ECS instances at the same time</a>.</li>
     * <li>Auto Provisioning uses auto provisioning groups to schedule and maintain computing resources. You can use auto provisioning groups to obtain a steady supply of computing resources. This helps reduce the impact on compute capacity when preemptible instances are reclaimed.</li>
     * <li>Auto Provisioning is provided free of charge. However, you are charged for instance resources that are created in auto provisioning groups. For more information, see <a href="https://help.aliyun.com/document_detail/52088.html">Overview of preemptible instances</a> and <a href="https://help.aliyun.com/document_detail/40653.html">Pay-as-you-go</a>.</li>
     * <li>When you specify both a launch template (<code>LaunchTemplateId</code>) and extended configurations (<code>LaunchConfiguration.*</code> parameters), LaunchTemplateId takes precedence.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAutoProvisioningGroup  CreateAutoProvisioningGroupRequest
     * @return CreateAutoProvisioningGroupResponse
     */
    CompletableFuture<CreateAutoProvisioningGroupResponse> createAutoProvisioningGroup(CreateAutoProvisioningGroupRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>When you call this operation to create an automatic snapshot policy, you can specify the days of the week on which to create automatic snapshots, the retention period of the automatic snapshots, and whether to enable cross-region replication for the snapshots in the policy to meet your diverse data backup requirements. After the automatic snapshot policy is created, call the <a href="https://help.aliyun.com/document_detail/25531.html">ApplyAutoSnapshotPolicy</a> operation to apply the policy to disks. If you want to modify the automatic snapshot policy, call the <a href="https://help.aliyun.com/document_detail/25529.html">ModifyAutoSnapshotPolicyEx</a> operation.
     * Take note of the following items:</p>
     * <ul>
     * <li>You can create up to 100 automatic snapshot policies per region for a single Alibaba Cloud account.</li>
     * <li>If an automatic snapshot is being created when the time scheduled for creating another automatic snapshot is due, the new snapshot task is skipped. This may occur when a disk contains a large volume of data. For example, you have scheduled snapshots to be created at 09:00:00, 10:00:00, 11:00:00, and 12:00:00 for a disk. The system starts to create a snapshot for the disk at 09:00:00. The process takes 80 minutes to complete because the disk contains a large volume of data and ends at 10:20:00. In this case, the system does not create a snapshot at 10:00, but creates a snapshot at 11:00.</li>
     * <li>For information about how to copy a snapshot from one region to another region, see the &quot;Background information&quot; section in <a href="https://help.aliyun.com/document_detail/159441.html">Copy a snapshot</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAutoSnapshotPolicy  CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     */
    CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>When you create a capacity reservation, you can specify attributes such as a zone and an instance type. The system uses a private pool to reserve resources that match the specified attributes. For more information, see <a href="https://help.aliyun.com/document_detail/193633.html">Overview of Immediate Capacity Reservation</a>.</p>
     * <ul>
     * <li>Currently, only immediate capacity reservations are supported. Immediate capacity reservations take effect immediately after you purchase them. After you purchase an immediate capacity reservation, you are charged for the specified instance type based on the pay-as-you-go billing method regardless of whether you use the capacity reservation to create pay-as-you-go instances. Billing stops when you manually release the capacity reservation or when the capacity reservation expires and is automatically released.<ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/25499.html">CreateInstance</a> or <a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a> operation to specify private pool attributes when you create instances. To modify the attributes of a private pool, you can call the <a href="https://help.aliyun.com/document_detail/190006.html">ModifyInstanceAttachmentAttributes</a> operation. If an instance matches a private pool associated with a capacity reservation, you are charged based on the configurations of the instance such as the instance type, disks, and public bandwidth.</li>
     * <li>Before you use a private pool associated with a capacity reservation to create pay-as-you-go instances, you are charged only for the specified instance type.</li>
     * </ul>
     * </li>
     * <li>You can apply savings plans or regional reserved instances to offset hourly billing of unused immediate capacity reservations, and hourly fees of the instances that match the immediate capacity reservations. However, you cannot use zonal reserved instances to offset the hourly fees. We recommend that you purchase reserved instances or savings plans before you purchase immediate capacity reservations. This way, you can access resources free of charge within the coverage of the reserved instances or savings plans.<blockquote>
     * <p>You can call the CreateCapacityReservation operation to create only immediate capacity reservations. You can create immediate or scheduled capacity reservations in the Elastic Compute Service (ECS) console. For more information, see <a href="~~193626#section-oil-qh5-xvx~~">Overview</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateCapacityReservation  CreateCapacityReservationRequest
     * @return CreateCapacityReservationResponse
     */
    CompletableFuture<CreateCapacityReservationResponse> createCapacityReservation(CreateCapacityReservationRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>You can create commands of the following types:<ul>
     * <li>Batch commands (RunBatScript), applicable to Windows instances</li>
     * <li>PowerShell commands (RunPowerShellScript), applicable to Windows instances</li>
     * <li>Shell commands (RunShellScript), applicable to Linux instances</li>
     * </ul>
     * </li>
     * <li>You can specify the Timeout parameter to set the maximum timeout period for executions of a command on Elastic Compute Service (ECS) instances. If an execution times out, <a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> forcefully terminates the command process by canceling the process ID (PID) of the command.<ul>
     * <li>For a one-time task, when the execution times out, the state of the command (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) becomes Failed.</li>
     * <li>For a scheduled task, take note of the following items:<ul>
     * <li>The timeout period takes effect on each execution.</li>
     * <li>When an execution times out, the state (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) of the command becomes Failed.</li>
     * <li>The timeout of one execution does not affect the subsequent executions.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>You can retain up to 500 to 50,000 Cloud Assistant commands in each region. You can also apply for a quota increase. For information about how to query and increase quotas, see <a href="https://help.aliyun.com/document_detail/184116.html">Manage quotas</a>.</li>
     * <li>You can use WorkingDir to specify the execution directory of a Cloud Assistant command. For Linux instances, the default execution directory of Cloud Assistant commands is the home directory of the root user, which is <code>/root</code>. For Windows instances, the default execution directory of Cloud Assistant commands is the directory where the Cloud Assistant Agent process resides, such as <code>C:\\Windows\\System32</code>.</li>
     * <li>You can enable the custom parameter feature for a Cloud Assistant command by setting EnableParameter to true. When you set CommandContent, you can define custom parameters in the {{parameter}} format. Then, when the <a href="https://help.aliyun.com/document_detail/64841.html">InvokeCommand</a> operation is called, the key-value pairs of custom parameters are passed in. For example, if a command is <code>echo {{name}}</code>, the Parameters parameter can be used to pass in the <code>&lt;name, Jack&gt;</code> key-value pair when the InvokeCommand operation is called. The name key of the custom parameter is automatically replaced by the paired Jack value to generate a new command. As a result, the <code>echo Jack</code> command is run.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCommand  CreateCommandRequest
     * @return CreateCommandResponse
     */
    CompletableFuture<CreateCommandResponse> createCommand(CreateCommandRequest request);

    /**
     * @param request the request parameters of CreateDedicatedHostCluster  CreateDedicatedHostClusterRequest
     * @return CreateDedicatedHostClusterResponse
     */
    CompletableFuture<CreateDedicatedHostClusterResponse> createDedicatedHostCluster(CreateDedicatedHostClusterRequest request);

    /**
     * @deprecated OpenAPI CreateDemand is deprecated, please use Ecs::2014-05-26::CreateCapacityReservation instead.  * @description You can call this operation to file a demand for an ECS instance type. Alibaba Cloud provides the requested resources based on your demand.
     * You can file demands only for I/O optimized instance types and instances of the virtual private cloud (VPC) type.
     * > This operation is in internal preview and has not been officially released. We recommend that you do not call this operation.
     * 
     * @param request the request parameters of CreateDemand  CreateDemandRequest
     * @return CreateDemandResponse
     */
    @Deprecated
    CompletableFuture<CreateDemandResponse> createDemand(CreateDemandRequest request);

    /**
     * @param request the request parameters of CreateDeploymentSet  CreateDeploymentSetRequest
     * @return CreateDeploymentSetResponse
     */
    CompletableFuture<CreateDeploymentSetResponse> createDeploymentSet(CreateDeploymentSetRequest request);

    /**
     * @param request the request parameters of CreateDiagnosticMetricSet  CreateDiagnosticMetricSetRequest
     * @return CreateDiagnosticMetricSetResponse
     */
    CompletableFuture<CreateDiagnosticMetricSetResponse> createDiagnosticMetricSet(CreateDiagnosticMetricSetRequest request);

    /**
     * @param request the request parameters of CreateDiagnosticReport  CreateDiagnosticReportRequest
     * @return CreateDiagnosticReportResponse
     */
    CompletableFuture<CreateDiagnosticReportResponse> createDiagnosticReport(CreateDiagnosticReportRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>You can enable the multi-attach (<code>MultiAttach</code>) feature when you create a disk. Before you enable the multi-attach feature, we recommend that you familiarize yourself with the feature and its limits. For more information, see <a href="https://help.aliyun.com/document_detail/256487.html">NVMe disks</a> and <a href="https://help.aliyun.com/document_detail/262105.html">Enable multi-attach</a>.</li>
     * <li>You can create disks of the following disk categories: basic disks, ultra disks, standard SSDs, Enterprise SSDs (ESSDs), ESSD Entry disks, ESSD AutoPL disks, standard elastic ephemeral disks, and premium elastic ephemeral disks.</li>
     * <li>Before you can create a disk, you must complete real-name verification. Complete real-name verification on the <a href="https://account.console.aliyun.com/#/auth/home">Real-name Verification</a> page in the Alibaba Cloud Management Console.</li>
     * <li>When you create disks, you may be charged for the resources used. We recommend that you familiarize yourself with the billing methods of Elastic Compute Service (ECS) resources before you create a disk. For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>.</li>
     * <li>By default, <code>DeleteAutoSnapshot</code> is set to <code>true</code> when a disk is created. This indicates that the automatic snapshots of the disk are deleted when the disk is released. You can call the <a href="https://help.aliyun.com/document_detail/25517.html">ModifyDiskAttribute</a> operation to change the parameter value.</li>
     * <li>If you do not specify a performance level when you create an ESSD, the performance level of the ESSD is automatically set to PL1. To change the performance level of the ESSD, you can call the <a href="https://help.aliyun.com/document_detail/123780.html">ModifyDiskSpec</a> operation.</li>
     * <li>By default, <code>Portable</code> is set to <code>true</code> and the billing method is pay-as-you-go for a disk that is created by calling the CreateDisk operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDisk  CreateDiskRequest
     * @return CreateDiskResponse
     */
    CompletableFuture<CreateDiskResponse> createDisk(CreateDiskRequest request);

    /**
     * <b>description</b> :
     * <p>Elasticity Assurance provides a new way to purchase and use resources with flexibility and assurance. It offers assured resource reservations for pay-as-you-go Elastic Compute Service (ECS) instances. For more information, see <a href="https://help.aliyun.com/document_detail/193630.html">Overview of Elasticity Assurance</a>.</p>
     * <ul>
     * <li>Elasticity assurances are not refundable after purchase.</li>
     * <li>Elasticity assurances are applicable to only pay-as-you-go ECS instances.</li>
     * <li>Elasticity assurances support only the unlimited mode. Therefore, you can set <code>AssuranceTimes</code> only to <code>Unlimited</code>. Elasticity assurances in unlimited mode can be applied an unlimited number of times within their effective period and take effect immediately after they are purchased.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateElasticityAssurance  CreateElasticityAssuranceRequest
     * @return CreateElasticityAssuranceResponse
     */
    CompletableFuture<CreateElasticityAssuranceResponse> createElasticityAssurance(CreateElasticityAssuranceRequest request);

    /**
     * @deprecated OpenAPI CreateForwardEntry is deprecated  * @param request  the request parameters of CreateForwardEntry  CreateForwardEntryRequest
     * @return CreateForwardEntryResponse
     */
    @Deprecated
    CompletableFuture<CreateForwardEntryResponse> createForwardEntry(CreateForwardEntryRequest request);

    /**
     * @deprecated OpenAPI CreateHaVip is deprecated  * @param request  the request parameters of CreateHaVip  CreateHaVipRequest
     * @return CreateHaVipResponse
     */
    @Deprecated
    CompletableFuture<CreateHaVipResponse> createHaVip(CreateHaVipRequest request);

    /**
     * @param request the request parameters of CreateHpcCluster  CreateHpcClusterRequest
     * @return CreateHpcClusterResponse
     */
    CompletableFuture<CreateHpcClusterResponse> createHpcCluster(CreateHpcClusterRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>You can use the created custom image only if the image is in the Available (Available) state.</li>
     * <li>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> when you query the information of an instance, the instance is locked for security reasons. No operations are allowed on the instance.</li>
     * <li>To optimize the image, we recommend that you specify DetectionStrategy when you create the image. For more information, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview of image check</a>.
     * You can call the CreateImage operation to create a custom image by using one of the following methods. The following request parameters are sorted by priority: <code>InstanceId</code> &gt; <code>DiskDeviceMapping</code> &gt; <code>SnapshotId</code>. If your request contains two or more of these parameters, the custom image is created based on the parameter that has a higher priority.</li>
     * <li><strong>Method 1</strong>: Create a custom image from an instance. You need to only specify the ID of the instance by using <code>InstanceId</code>. The instance must be in the Running (<code>Running</code>) or Stopped (<code>Stopped</code>) state. After you call the CreateImage operation, a snapshot is created for each disk of the instance. When you create a custom image from a running instance, cache data may not be written to disks. In this case, the data of the custom image may be slightly different from the data of the instance. We recommend that you stop instances by calling the <a href="https://help.aliyun.com/document_detail/155372.html">StopInstances</a> operation before you create custom images from the instances.</li>
     * <li><strong>Method 2</strong>: Create a custom image from the system disk snapshot of an instance. You need to only specify the ID of the system disk snapshot by using <code>SnapshotId</code>. The specified system disk snapshot must be created after July 15, 2013.</li>
     * <li><strong>Method 3</strong>: Create a custom image from multiple disk snapshots. You must specify data mappings between the snapshots and the disks to be created by using the parameters that start with <code>DiskDeviceMapping</code>.
     * When you use Method 3 to create a custom image, take note of the following items:</li>
     * <li>You can specify only one snapshot to use to create the system disk in the custom image. The device name of the system disk must be /dev/xvda.</li>
     * <li>You can specify up to 16 snapshots to use to create data disks in the custom image. The device names of the data disks are unique and range from /dev/xvdb to /dev/xvdz in alphabetical order.</li>
     * <li>You can leave <code>SnapshotId</code> empty. In this case, an empty data disk with the specified size is created.</li>
     * <li>The specified disk snapshot must be created after July 15, 2013.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImage  CreateImageRequest
     * @return CreateImageResponse
     */
    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>Only custom image components can be created.</li>
     * <li>The images must run Linux operating systems. This indicates that you must set <code>SystemType</code> to Linux.</li>
     * <li>You must set the image component type to image build component by setting the <code>ComponentType</code> parameter to Build.</li>
     * <li>You can use Dockerfile to edit the content of image components, and then pass the edited content into the <code>Content</code> parameter. The content size must not be greater than 16 KB. <code>FROM</code> commands cannot be used in image components. An image component supports up to 127 commands. For information about supported commands, see <a href="https://help.aliyun.com/document_detail/200206.html">Description of commands supported by Image Builder</a>.
     * You can use image components to create image templates in the Elastic Compute Service (ECS) console, but cannot call API operations to use image components to create image templates. For more information, see <a href="https://help.aliyun.com/document_detail/197410.html">Overview of Image Builder</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageComponent  CreateImageComponentRequest
     * @return CreateImageComponentResponse
     */
    CompletableFuture<CreateImageComponentResponse> createImageComponent(CreateImageComponentRequest request);

    /**
     * <b>description</b> :
     * <p>You can use image templates to specify custom image content and create images across regions and accounts. When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can create only custom image templates.</li>
     * <li>You can configure only public, custom, or shared Linux images or image families as the source images when you create image templates.</li>
     * <li>When you use an image template to create an image, you must create an intermediate Elastic Compute Service (ECS) instance to help create the image. The intermediate instance is billed by using the pay-as-you-go billing method. For more information, see <a href="https://help.aliyun.com/document_detail/40653.html">Pay-as-you-go</a>.
     * For the <code>BuildContent</code> parameter that specifies the content of image templates, take note of the following items:</li>
     * <li>If the <code>BuildContent</code> value contains <code>FROM</code> commands, the <code>FROM</code> commands override the values of <code>BaseImageType</code> that specifies the type of the source images and <code>BaseImage</code> that specifies the source image.</li>
     * <li>If the <code>BuildContent</code> value does not contain <code>FROM</code> commands, the system creates a <code>FROM</code> command that consists of the <code>BaseImageType</code> and <code>BaseImage</code> values in the format of <code>&lt;BaseImageType&gt;:&lt;BaseImage&gt;</code> and adds the command to the first line of the template content.</li>
     * <li>You can use Dockerfile to edit the content of image templates and then pass the edited content into the <code>BuildContent</code> parameter. The content of an image template cannot exceed 16 KB in size and can contain up to 127 commands. For information about commands supported by image templates, see <a href="https://help.aliyun.com/document_detail/200206.html">Description of commands supported by Image Builder</a>.
     * You can use image components to create image templates in the ECS console, but cannot call API operations to use image components to create image templates. For more information, see <a href="https://help.aliyun.com/document_detail/197410.html">Overview of Image Builder</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImagePipeline  CreateImagePipelineRequest
     * @return CreateImagePipelineResponse
     */
    CompletableFuture<CreateImagePipelineResponse> createImagePipeline(CreateImagePipelineRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation to query available resources in a specific region or zone. If you want to batch create instances that automatically enter the Running state after they are created, we recommend that you call the <a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a> operation.
     * Take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li><strong>Billing</strong>:<ul>
     * <li>You must familiarize yourself with ECS billing methods before you create an instance because you may be charged for the resources used by the instance. For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>.</li>
     * <li>If you create a subscription instance (<code>PrePaid</code>), available coupons in your account are used by default.</li>
     * </ul>
     * </li>
     * <li><strong>Instance type</strong>:<ul>
     * <li>You can use the <code>IoOptimized</code> parameter to specify whether to create an I/O optimized instance.</li>
     * <li>Instance type selection: See <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the performance data of instance types, or see <a href="https://help.aliyun.com/document_detail/58291.html">Best practices for instance type selection</a> to learn about how to select instance types.</li>
     * <li>Query of available resources: Call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation to query resources available in a specific region or zone.<blockquote>
     * <p> If the <code>QuotaExceed.ElasticQuota</code> error is returned when you call this operation, it indicates that the maximum number of instances of the specified instance type in the region has been reached, or the maximum number of vCPUs for all instance types in a zone has been reached. You can go to the <a href="https://ecs.console.aliyun.com/?spm=a2c8b.12215451.favorites.decs.5e3a336aMGTtzy#/privileges/quota">ECS console</a> or <a href="https://quotas.console.aliyun.com/products/ecs/quotas">Quota Center</a> to request a quota increase.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><strong>Image</strong>:<ul>
     * <li>The image determines the system disk configurations of the new instance. The system disk of the new instance is a clone of the specified image.</li>
     * <li>If you want to create instances with 512 MiB of memory, you cannot use Windows Server images except for Windows Server Semi-Annual Channel images.</li>
     * <li>If you want to create instances with 4 GiB or more of memory, you cannot use 32-bit OS image.</li>
     * </ul>
     * </li>
     * <li><strong>Network type</strong>:<ul>
     * <li>Each instance that resides in a virtual private cloud (VPC) must be connected to only a single vSwitch.</li>
     * <li>If <code>VSwitchId</code> is specified, the security group specified by <code>SecurityGroupId</code> and the vSwitch specified by <code>VSwitchId</code> must belong to the same VPC.</li>
     * <li>The value of <code>PrivateIpAddress</code> varies based on the value of <code>VSwitchId</code>. <code>PrivateIpAddress</code> cannot be separately specified. If <code>VSwitchId</code> and <code>PrivateIpAddress</code> are specified, the IP address specified by <code>PrivateIpAddress</code> must be an idle IP address in the CIDR block of the specified vSwitch.</li>
     * </ul>
     * </li>
     * <li><strong>Public bandwidth</strong>:<ul>
     * <li>Starting November 27, 2020, the maximum bandwidth value that is available for you to create ECS instances or change ECS instance configurations is subject to the throttling policy of your account. To increase the bandwidth limit, submit a ticket. The throttling policy imposes the following constraints: In a single region, the total maximum bandwidth value of all instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s and the total maximum bandwidth value of all instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.</li>
     * <li>If you call the <code>CreateInstance</code> operation to create an instance, no public IP addresses are assigned to the instance. You can call the <a href="https://help.aliyun.com/document_detail/25544.html">AllocatePublicIpAddress</a> operation to assign a public IP address to an instance.</li>
     * <li>Network usage fees vary based on the settings of <code>InternetChargeType</code> and <code>InternetMaxBandwidthOut</code>.</li>
     * <li>The value of <code>InternetMaxBandwidthIn</code> does not affect billing because inbound data traffic is free of charge.</li>
     * <li>If <code>InternetChargeType</code> is set to PayByBandwidth, <code>InternetMaxBandwidthOut</code> specifies the fixed bandwidth. A fixed bandwidth is a specified amount of public bandwidth allocated to an instance that uses the pay-by-bandwidth billing method for network usage.</li>
     * <li>If <code>InternetChargeType</code> is set to PayByTraffic, <code>InternetMaxBandwidthOut</code> specifies the peak bandwidth. A peak bandwidth is the maximum amount of public bandwidth that an instance can consume when the instance uses the pay-by-traffic billing method for network usage. Network usage costs are calculated based on the volume of network traffic.</li>
     * </ul>
     * </li>
     * <li><strong>Security group</strong>:<ul>
     * <li>If no security groups are available in the region where you want to create an instance, you must call the <a href="https://help.aliyun.com/document_detail/25553.html">CreateSecurityGroup</a> operation to create a security group in that region first.</li>
     * <li>The maximum number of instances that a security group can contain varies based on the security group type. For more information, see the &quot;Security group limits&quot; section in the <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a> topic.</li>
     * <li>Instances in the same security group can communicate with each other over the internal network. By default, instances in different security groups cannot communicate with each other. You can allow communication between instances by allowing mutual access between the security groups to which the instances belong. For more information, see <a href="https://help.aliyun.com/document_detail/25554.html">AuthorizeSecurityGroup</a> and <a href="https://help.aliyun.com/document_detail/25560.html">AuthorizeSecurityGroupEgress</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Storage</strong>:<ul>
     * <li>The instance is assigned a system disk whose capacity varies based on the size of the specified image. The size of the system disk must be at least <code>20 GiB</code> and greater than or equal to the image size. For information about system disk categories, see the description of <code>SystemDisk.Category</code>.</li>
     * <li>The system disk of an I/O optimized instance can only be an enhanced SSD (ESSD) (<code>cloud_essd</code>), a standard SSD (<code>cloud_ssd</code>), or an ultra disk (<code>cloud_efficiency</code>).</li>
     * <li>The maximum size of a data disk varies based on the disk category. For more information, see the description of <code>DataDisk.N.Size</code>.</li>
     * <li>Up to 16 data disks can be added to an instance. Mount points /dev/xvd[b-z] are automatically assigned to data disks in ascending alphanumeric order.<blockquote>
     * <p> If the <code>QuotaExceed.DiskCapacity</code> error is returned when you call this operation, it indicates that the maximum capacity of the disks of the selected disk category in the specified zone has been reached. You can go to the <a href="https://quotas.console.aliyun.com/products/disk/quotas">Quota Center</a> to query and request a quota increase.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><strong>User data</strong>: If the instance type supports user data, you can use the UserData parameter to pass in user data.<a href="~~49121~~"></a> User data is encoded in Base64. We recommend that you do not pass in confidential information (such as passwords or private keys) in plaintext as user data. This is because the system does not encrypt <code>UserData</code> values when API requests are transmitted. If you must pass in confidential information, we recommend that you encrypt and encode the information in Base64 before you pass in the information. Then decode and decrypt the information in the same way within the instance.</li>
     * <li><strong>Others</strong>: When you call API operations by using Alibaba Cloud CLI or SDKs, you must delete periods (.) from some request parameters before you use the parameters. For example, use <code>SystemDiskCategory</code> instead of <code>SystemDisk.Category</code> as a request parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>In addition to calling the CreateKeyPair operation to create a key pair, you can use a third-party tool to create a key pair and then call the <a href="https://help.aliyun.com/document_detail/51774.html">ImportKeyPair</a> operation to upload the key pair to an Alibaba Cloud region.
     * Up to 500 key pairs can be created in each region. For more information, see the &quot;SSH key pair limits&quot; section in <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * 
     * @param request the request parameters of CreateKeyPair  CreateKeyPairRequest
     * @return CreateKeyPairResponse
     */
    CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a launch template by calling the CreateLaunchTemplate operation, a default version that has a version number of 1 is automatically generated for the launch template. You can call the <code>CreateLaunchTemplateVersion</code> operation to create additional versions for the launch template. Version numbers start from 1 and increment by 1. If you specify a launch template but do not specify a launch template version number when you call the <a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a> operation to create instances, the default version of the launch template is used.
     * Launch templates contain preset configurations that are used to create instances, such as the region ID, image ID, instance type, security group ID, and public bandwidth settings. If a specific parameter is not included in a launch template, you need to manually specify the parameter when you use the launch template to create instances.
     * Take note of the following items:</p>
     * <ul>
     * <li>You can retain up to 30 launch templates in each region in your Alibaba Cloud account. Each launch template can have up to 30 versions.</li>
     * <li>Most parameters in launch templates are optional. When you create a launch template, ECS does not verify the existence or validity of specified parameter values. The parameter values are verified only when you use the launch template to create instances.</li>
     * <li>If you configured a specific parameter in a launch template, you cannot filter out the parameter when you call the <a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a> operation to create instances from the launch template. For example, if you set <code>HostName</code> to LocalHost in a launch template but do not specify <code>HostName</code> when you call the <code>RunInstances</code> operation to create instances from the launch template, the hostname of the created instances is <code>LocalHost</code>. If you want to overwrite <code>LocalHost</code>, which is the value of HostName in the launch template, you can set <code>HostName</code> to MyHost or a different value when you call the <code>RunInstances</code> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLaunchTemplate  CreateLaunchTemplateRequest
     * @return CreateLaunchTemplateResponse
     */
    CompletableFuture<CreateLaunchTemplateResponse> createLaunchTemplate(CreateLaunchTemplateRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>If you want to modify the parameters of a launch template version, you can create another version with different parameter settings for the launch template. You can create up to 30 versions for each launch template.</p>
     * 
     * @param request the request parameters of CreateLaunchTemplateVersion  CreateLaunchTemplateVersionRequest
     * @return CreateLaunchTemplateVersionResponse
     */
    CompletableFuture<CreateLaunchTemplateVersionResponse> createLaunchTemplateVersion(CreateLaunchTemplateVersionRequest request);

    /**
     * @deprecated OpenAPI CreateNatGateway is deprecated  * @param request  the request parameters of CreateNatGateway  CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
     */
    @Deprecated
    CompletableFuture<CreateNatGatewayResponse> createNatGateway(CreateNatGatewayRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>This operation is a synchronous operation. After an ENI is created, it immediately enters the Available (<code>Available</code>) state and can be attached to an Elastic Compute Service (ECS) instance.</li>
     * <li>If NetworkInterfaceId is empty in the response, no ENI is created. Call the operation again to create an ENI.</li>
     * <li>An ENI can be attached only to a single instance that resides in a virtual private cloud (VPC).</li>
     * <li>When an ENI is detached from an instance and attached to another instance, the attributes of the ENI remain unchanged and network traffic is redirected to the new instance.</li>
     * <li>When you call this operation to create an ENI, you can assign up to 49 secondary private IP addresses to the ENI.</li>
     * <li>If you want to assign IPv6 addresses when you create an ENI, make sure that IPv6 is enabled for the vSwitch with which you want to associate the ENI. For more information, see <a href="https://help.aliyun.com/document_detail/98896.html">What is an IPv6 gateway?</a></li>
     * <li>A quota is imposed on the number of ENIs that can be created per Alibaba Cloud region per account. You can view the quota in the ECS console. For more information, see <a href="https://help.aliyun.com/document_detail/184115.html">View and increase resource quotas</a>.
     * <strong>For information about examples on how to call this operation, see</strong> <a href="https://help.aliyun.com/document_detail/471552.html">Create an ENI</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateNetworkInterface  CreateNetworkInterfaceRequest
     * @return CreateNetworkInterfaceResponse
     */
    CompletableFuture<CreateNetworkInterfaceResponse> createNetworkInterface(CreateNetworkInterfaceRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, submit a ticket to apply for using this operation.</p>
     * 
     * @param request the request parameters of CreateNetworkInterfacePermission  CreateNetworkInterfacePermissionRequest
     * @return CreateNetworkInterfacePermissionResponse
     */
    CompletableFuture<CreateNetworkInterfacePermissionResponse> createNetworkInterfacePermission(CreateNetworkInterfacePermissionRequest request);

    /**
     * @deprecated OpenAPI CreatePhysicalConnection is deprecated  * @param request  the request parameters of CreatePhysicalConnection  CreatePhysicalConnectionRequest
     * @return CreatePhysicalConnectionResponse
     */
    @Deprecated
    CompletableFuture<CreatePhysicalConnectionResponse> createPhysicalConnection(CreatePhysicalConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>  A prefix list is a collection of network prefixes (CIDR blocks) and can be referenced to configure network rules for other resources. For more information, see <a href="https://help.aliyun.com/document_detail/206223.html">Overview</a>.</p>
     * <ul>
     * <li>When you create a prefix list, take note of the following items:<ul>
     * <li>You must specify an IP address family (IPv4 or IPv6) for the prefix list, and cannot change the IP address family after the prefix list is created. You cannot combine IPv4 and IPv6 CIDR blocks in a single prefix list.</li>
     * <li>You must specify the maximum number of entries that the prefix list can contain. You cannot modify the maximum number of entries after the prefix list is created.</li>
     * <li>You can specify entries for the prefix list. Each entry consists of a CIDR block and the description for the CIDR block. The total number of entries cannot exceed the maximum number of entries that you specified.</li>
     * </ul>
     * </li>
     * <li>For more information about the limits on prefix lists and other resources, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</li>
     * <li>You can create Resource Access Management (RAM) users and grant them minimum permissions. This eliminates the need to share the AccessKey pair of your Alibaba Cloud account with other users and reduces security risks for your enterprises. For information about how to grant permissions on prefix lists to RAM users, see <a href="https://help.aliyun.com/document_detail/206175.html">Grant a RAM user permissions on prefix lists</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreatePrefixList  CreatePrefixListRequest
     * @return CreatePrefixListResponse
     */
    CompletableFuture<CreatePrefixListResponse> createPrefixList(CreatePrefixListRequest request);

    /**
     * @deprecated OpenAPI CreateRouteEntry is deprecated  * @param request  the request parameters of CreateRouteEntry  CreateRouteEntryRequest
     * @return CreateRouteEntryResponse
     */
    @Deprecated
    CompletableFuture<CreateRouteEntryResponse> createRouteEntry(CreateRouteEntryRequest request);

    /**
     * @deprecated OpenAPI CreateRouterInterface is deprecated  * @param request  the request parameters of CreateRouterInterface  CreateRouterInterfaceRequest
     * @return CreateRouterInterfaceResponse
     */
    @Deprecated
    CompletableFuture<CreateRouterInterfaceResponse> createRouterInterface(CreateRouterInterfaceRequest request);

    /**
     * @param request the request parameters of CreateSavingsPlan  CreateSavingsPlanRequest
     * @return CreateSavingsPlanResponse
     */
    CompletableFuture<CreateSavingsPlanResponse> createSavingsPlan(CreateSavingsPlanRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>You can create up to 100 security groups in a single Alibaba Cloud region.</li>
     * <li>To create a security group of the Virtual Private Cloud (VPC) type, you must specify VpcId.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecurityGroup  CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
     */
    CompletableFuture<CreateSecurityGroupResponse> createSecurityGroup(CreateSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can use the ECS console, call <a href="https://help.aliyun.com/document_detail/63962.html">ECS API</a> operations, or use CloudMonitor to view the scheduled simulated system events.
     * The following descriptions provide the lifecycle of a simulated system event:</p>
     * <ul>
     * <li>Scheduled: The state of the simulated system event is automatically changed to Scheduled after it is scheduled.</li>
     * <li>Executed: The state of the simulated system event is automatically changed to Executed at the time specified by the NotBefore parameter if no manual intervention is involved.</li>
     * <li>Canceled: The state of the simulated system event is changed to Canceled if you cancel the event by calling the <a href="https://help.aliyun.com/document_detail/88808.html">CancelSimulatedSystemEvents</a> operation.</li>
     * <li>Avoided: The state of the simulated system event generated from maintenance-triggered instance restart can be changed to Avoided if you restart the instance before the scheduled time of the simulated system event. The maintenance-triggered instance restart is indicated by the SystemMaintenance.Reboot value. For more information, see <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSimulatedSystemEvents  CreateSimulatedSystemEventsRequest
     * @return CreateSimulatedSystemEventsResponse
     */
    CompletableFuture<CreateSimulatedSystemEventsResponse> createSimulatedSystemEvents(CreateSimulatedSystemEventsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The local snapshot feature is replaced by the instant access feature. Take note of the following items:</p>
     * <ul>
     * <li>If you have used the local snapshot feature before December 14, 2020, you can use the Category parameter.</li>
     * <li>If you have not used the local snapshot feature before December 14, 2020, new snapshots of your enhanced SSDs (ESSDs) at performance levels 0, 1, 2, and 3 (PL0, PL1, PL2, and PL3 ESSDs) and ESSD AutoPL disks are instantly available after creation without the need for additional configurations, regardless of whether the snapshots are manually or automatically created. The InstantAccess, InstantAccessRetentionDays, and DisableInstantAccess parameters in this operation that are related to the instant access feature no longer take effect. Available is added to the response parameters of the DescribeSnapshots and DescribeSnapshotGroup operations to indicate whether the snapshot is available.
     * In the following scenarios, you cannot create snapshots for a disk:</li>
     * <li>The number of manual snapshots of the disk has reached 256.</li>
     * <li>A snapshot is being created for the disk.</li>
     * <li>The Elastic Compute Service (ECS) instance to which the disk is attached has never been started.</li>
     * <li>The ECS instance to which the disk is attached is not in the <strong>Stopped</strong> (<code>Stopped</code>) or <strong>Running</strong> (<code>Running</code>) state.</li>
     * <li>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> when you query the information of the instance, the instance is locked for security reasons and all operations are prohibited on it.
     * When you create a snapshot, take note of the following items:</li>
     * <li>If a snapshot is being created, you cannot use this snapshot to create a custom image by calling the <a href="https://help.aliyun.com/document_detail/25535.html">CreateImage</a> operation.</li>
     * <li>When a snapshot is being created for a disk that is attached to an ECS instance, do not change the instance state.</li>
     * <li>You can create snapshots for a disk that is in the <strong>Expired</strong> (<code>Expired</code>) state. If the release time scheduled for a disk arrives while a snapshot is being created for the disk, the snapshot is in the <strong>Creating</strong> (<code>Creating</code> state and is deleted when the disk is released.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can specify <code>InstanceId</code> to create a snapshot-consistent group for disks on a specific (ECS instance. You can also specify <code>DiskId.N</code> to create a snapshot-consistent group for multiple disks on multiple ECS instances within the same zone.</p>
     * <blockquote>
     * <p> You cannot specify both <code>DiskId.N</code> and <code>ExcludeDiskId.N</code> in the same request. If <code>InstanceId</code> is specified, you can use <code>DiskId.N</code> to specify only disks on the ECS instance specified by InstanceId and cannot use DiskId.N to specify disks across ECS instances.
     * Take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>The disks for which you want to create a snapshot must be in the <strong>In Use</strong> (<code>In_use</code>) or <strong>Unattached</strong> (<code>Available</code>) state.<ul>
     * <li>If a disk is in the <strong>In Use</strong> (<code>In_use</code>) state, make sure that the ECS instance to which the disk is attached is in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>If a disk is in the <strong>Unattached</strong> (<code>Available</code>) state, make sure that the disk has been attached to ECS instances. Snapshots cannot be created for disks that have never been attached to an ECS instance.</li>
     * </ul>
     * </li>
     * <li>Snapshot-consistent groups can be used to create snapshots only for enhanced SSDs (ESSDs).</li>
     * <li>A snapshot-consistent group can contain snapshots of up to 16 disks, including system disks and data disks, and cannot exceed 32 TiB in size.</li>
     * <li>Snapshots that you created are stored indefinitely until you delete the snapshots. We recommend that you delete unnecessary snapshots on a regular basis to prevent excess snapshot storage fees.</li>
     * <li>Snapshot-consistent groups cannot be created for disks for which multi-attach feature is enabled. If disks for which the multi-attach feature is enabled are attached to an ECS instance, specify the <code>ExcludeDiskId.N</code> parameter to exclude the disks.
     * For more information about the snapshot-consistent group feature, see <a href="https://help.aliyun.com/document_detail/199625.html">Create a snapshot-consistent group</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSnapshotGroup  CreateSnapshotGroupRequest
     * @return CreateSnapshotGroupResponse
     */
    CompletableFuture<CreateSnapshotGroupResponse> createSnapshotGroup(CreateSnapshotGroupRequest request);

    /**
     * <b>description</b> :
     * <p>A storage set can distribute disks or Shared Block Storage devices to different locations. You can specify the number of partitions in a storage set. A larger number of partitions indicate more discrete distribution of disks or Shared Block Storage devices.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The number of storage sets that you can create in a region is limited. You can call the <a href="https://help.aliyun.com/document_detail/73772.html">DescribeAccountAttributes</a> operation to query the limit.</li>
     * <li>The number of partitions in a zone is limited. You can call the <a href="https://help.aliyun.com/document_detail/73772.html">DescribeAccountAttributes</a> operation to query the limit.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateStorageSet  CreateStorageSetRequest
     * @return CreateStorageSetResponse
     */
    CompletableFuture<CreateStorageSetResponse> createStorageSet(CreateStorageSetRequest request);

    /**
     * @deprecated OpenAPI CreateVSwitch is deprecated  * @param request  the request parameters of CreateVSwitch  CreateVSwitchRequest
     * @return CreateVSwitchResponse
     */
    @Deprecated
    CompletableFuture<CreateVSwitchResponse> createVSwitch(CreateVSwitchRequest request);

    /**
     * @deprecated OpenAPI CreateVirtualBorderRouter is deprecated  * @param request  the request parameters of CreateVirtualBorderRouter  CreateVirtualBorderRouterRequest
     * @return CreateVirtualBorderRouterResponse
     */
    @Deprecated
    CompletableFuture<CreateVirtualBorderRouterResponse> createVirtualBorderRouter(CreateVirtualBorderRouterRequest request);

    /**
     * @deprecated OpenAPI CreateVpc is deprecated, please use Vpc::2016-04-28::CreateVpc instead.  * @param request  the request parameters of CreateVpc  CreateVpcRequest
     * @return CreateVpcResponse
     */
    @Deprecated
    CompletableFuture<CreateVpcResponse> createVpc(CreateVpcRequest request);

    /**
     * @deprecated OpenAPI DeactivateRouterInterface is deprecated  * @param request  the request parameters of DeactivateRouterInterface  DeactivateRouterInterfaceRequest
     * @return DeactivateRouterInterfaceResponse
     */
    @Deprecated
    CompletableFuture<DeactivateRouterInterfaceResponse> deactivateRouterInterface(DeactivateRouterInterfaceRequest request);

    /**
     * <b>description</b> :
     * <p>$.parameters[4].schema.description</p>
     * 
     * @param request the request parameters of DeleteActivation  DeleteActivationRequest
     * @return DeleteActivationResponse
     */
    CompletableFuture<DeleteActivationResponse> deleteActivation(DeleteActivationRequest request);

    /**
     * @param request the request parameters of DeleteAutoProvisioningGroup  DeleteAutoProvisioningGroupRequest
     * @return DeleteAutoProvisioningGroupResponse
     */
    CompletableFuture<DeleteAutoProvisioningGroupResponse> deleteAutoProvisioningGroup(DeleteAutoProvisioningGroupRequest request);

    /**
     * @param request the request parameters of DeleteAutoSnapshotPolicy  DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     */
    CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request);

    /**
     * @deprecated OpenAPI DeleteBandwidthPackage is deprecated  * @param request  the request parameters of DeleteBandwidthPackage  DeleteBandwidthPackageRequest
     * @return DeleteBandwidthPackageResponse
     */
    @Deprecated
    CompletableFuture<DeleteBandwidthPackageResponse> deleteBandwidthPackage(DeleteBandwidthPackageRequest request);

    /**
     * @param request the request parameters of DeleteCommand  DeleteCommandRequest
     * @return DeleteCommandResponse
     */
    CompletableFuture<DeleteCommandResponse> deleteCommand(DeleteCommandRequest request);

    /**
     * @param request the request parameters of DeleteDedicatedHostCluster  DeleteDedicatedHostClusterRequest
     * @return DeleteDedicatedHostClusterResponse
     */
    CompletableFuture<DeleteDedicatedHostClusterResponse> deleteDedicatedHostCluster(DeleteDedicatedHostClusterRequest request);

    /**
     * @deprecated OpenAPI DeleteDemand is deprecated, please use Ecs::2014-05-26::ReleaseCapacityReservation instead.  * @description >  This operation is in internal preview and has not been officially released. We recommend that you avoid using this operation.
     * 
     * @param request the request parameters of DeleteDemand  DeleteDemandRequest
     * @return DeleteDemandResponse
     */
    @Deprecated
    CompletableFuture<DeleteDemandResponse> deleteDemand(DeleteDemandRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a deployment set, make sure that no instances exist in the deployment set. If instances exist in the deployment set, move the instances to a different deployment set or release the instances before you delete the deployment set. For more information, see <a href="https://help.aliyun.com/document_detail/108407.html">Change the deployment set of an instance</a> and <a href="https://help.aliyun.com/document_detail/25442.html">Release an ECS instance</a>.</p>
     * 
     * @param request the request parameters of DeleteDeploymentSet  DeleteDeploymentSetRequest
     * @return DeleteDeploymentSetResponse
     */
    CompletableFuture<DeleteDeploymentSetResponse> deleteDeploymentSet(DeleteDeploymentSetRequest request);

    /**
     * @param request the request parameters of DeleteDiagnosticMetricSets  DeleteDiagnosticMetricSetsRequest
     * @return DeleteDiagnosticMetricSetsResponse
     */
    CompletableFuture<DeleteDiagnosticMetricSetsResponse> deleteDiagnosticMetricSets(DeleteDiagnosticMetricSetsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call this operation to delete the diagnostic reports that are no longer needed.</p>
     * 
     * @param request the request parameters of DeleteDiagnosticReports  DeleteDiagnosticReportsRequest
     * @return DeleteDiagnosticReportsResponse
     */
    CompletableFuture<DeleteDiagnosticReportsResponse> deleteDiagnosticReports(DeleteDiagnosticReportsRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Manual snapshots of the disk are retained.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/25517.html">ModifyDiskAttribute</a> operation to configure whether to retain automatic snapshots of the disk or release the snapshots along with the disk. We recommend that you delete the snapshots that are no longer needed to maintain a sufficient quota for new automatic snapshots.</li>
     * <li>The disk must be in the Unattached (Available) state.</li>
     * <li>If the specified DiskId parameter does not exist, the request is ignored.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDisk  DeleteDiskRequest
     * @return DeleteDiskResponse
     */
    CompletableFuture<DeleteDiskResponse> deleteDisk(DeleteDiskRequest request);

    /**
     * @deprecated OpenAPI DeleteForwardEntry is deprecated  * @param request  the request parameters of DeleteForwardEntry  DeleteForwardEntryRequest
     * @return DeleteForwardEntryResponse
     */
    @Deprecated
    CompletableFuture<DeleteForwardEntryResponse> deleteForwardEntry(DeleteForwardEntryRequest request);

    /**
     * @deprecated OpenAPI DeleteHaVip is deprecated  * @param request  the request parameters of DeleteHaVip  DeleteHaVipRequest
     * @return DeleteHaVipResponse
     */
    @Deprecated
    CompletableFuture<DeleteHaVipResponse> deleteHaVip(DeleteHaVipRequest request);

    /**
     * @param request the request parameters of DeleteHpcCluster  DeleteHpcClusterRequest
     * @return DeleteHpcClusterResponse
     */
    CompletableFuture<DeleteHpcClusterResponse> deleteHpcCluster(DeleteHpcClusterRequest request);

    /**
     * <b>description</b> :
     * <p>For information about scenarios in which you cannot delete a custom image and the considerations related to custom image deletion, see <a href="https://help.aliyun.com/document_detail/25466.html">Delete a custom image</a>.</p>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
     * <b>description</b> :
     * <p>Only custom image components can be deleted.</p>
     * 
     * @param request the request parameters of DeleteImageComponent  DeleteImageComponentRequest
     * @return DeleteImageComponentResponse
     */
    CompletableFuture<DeleteImageComponentResponse> deleteImageComponent(DeleteImageComponentRequest request);

    /**
     * <b>description</b> :
     * <p>If an image build task based on an image template is in the BUILDING, DISTRIBUTING, RELEASING, or CANCELLING state, you cannot delete the image template. You can delete the image template only when the image build task is in the SUCCESS, FAILED, or CANCELLED state. You can call the DescribeImagePipelineExecutions operation to query the details of an image build task.</p>
     * 
     * @param request the request parameters of DeleteImagePipeline  DeleteImagePipelineRequest
     * @return DeleteImagePipelineResponse
     */
    CompletableFuture<DeleteImagePipelineResponse> deleteImagePipeline(DeleteImagePipelineRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>After an ECS instance is released, all the physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</li>
     * <li>When you release an ECS instance, take note of the following items for the disks attached to the instance:<ul>
     * <li>The disks for which <code>DeleteWithInstance</code> is set to false are retained as pay-as-you-go disks after the instance is released.</li>
     * <li>The disks for which <code>DeleteWithInstance</code> is set to true are released along with the instance.</li>
     * <li>For disks for which <code>DeleteAutoSnapshot</code> is set to false, the automatic snapshots of the disks are retained after the instance is released.</li>
     * <li>For disks for which <code>DeleteAutoSnapshot</code> is set to true, the automatic snapshots of the disks are released along with the instance.</li>
     * <li>Manual snapshots of the disks are retained.</li>
     * <li>If <code>OperationLocks</code> in the response contains <code>&quot;LockReason&quot; : &quot;security&quot;</code> when you query the information of the instance, the instance is locked for security reasons. In this case, even if <code>DeleteWithInstance</code> is set to <code>false</code> for the disks that are attached to the instance, the system ignores the DeleteWithInstance value and releases the disks along with the instance. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>After an ECS instance is released, all the physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</li>
     * <li>When you release an ECS instance, take note of the following items for the disks attached to the instance:<ul>
     * <li>The disks for which <code>DeleteWithInstance</code> is set to false are retained as pay-as-you-go disks after the instance is released.</li>
     * <li>The disks for which <code>DeleteWithInstance</code> is set to true are released along with the instance.</li>
     * <li>If <code>DeleteAutoSnapshot</code> is set to false for a disk attached to the instance, the automatic snapshots of the disk are retained when the instance is released.</li>
     * <li>If <code>DeleteAutoSnapshot</code> is set to true for a disk attached to the instance, the automatic snapshots of the disk are released along with the instance.</li>
     * <li>Manual snapshots of the disks are retained.</li>
     * <li>If <code>OperationLocks</code> in the response contains <code>&quot;LockReason&quot; : &quot;security&quot;</code> when you query the information of the instance, the instance is locked for security reasons. In this case, even if <code>DeleteWithInstance</code> is set to <code>false</code> for the disks that are attached to the instance, the system ignores the DeleteWithInstance value and releases the disks along with the instance. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstances  DeleteInstancesRequest
     * @return DeleteInstancesResponse
     */
    CompletableFuture<DeleteInstancesResponse> deleteInstances(DeleteInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>After an SSH key pair is deleted, you cannot query the SSH key pair by calling the <a href="https://help.aliyun.com/document_detail/51773.html">DescribeKeyPairs</a> operation.</li>
     * <li>If an SSH key pair is bound to one or more Elastic Compute Service (ECS) instances, the SSH key pair cannot be deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteKeyPairs  DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     */
    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>After you delete a launch template, Elastic Compute Service (ECS) instances created based on the launch template are not affected.</li>
     * <li>After you delete a launch template, all versions of the launch template are deleted and cannot be restored. If you want to delete only a specific version of the launch template, call the <a href="https://help.aliyun.com/document_detail/2679735.html">DeleteLaunchTemplateVersion</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteLaunchTemplate  DeleteLaunchTemplateRequest
     * @return DeleteLaunchTemplateResponse
     */
    CompletableFuture<DeleteLaunchTemplateResponse> deleteLaunchTemplate(DeleteLaunchTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>You cannot delete the default version of a launch template by calling this operation. To delete the default version of a launch template, you must delete the launch template.</li>
     * <li>If the version of a launch template that you want to delete is the default version, call the <a href="https://help.aliyun.com/document_detail/2679734.html">ModifyLaunchTemplateDefaultVersion</a> operation or go to the <strong>Launch Templates</strong> page in the Elastic Compute Service (ECS) console to change the default version to a different version, and then delete the original default version.</li>
     * <li>After you delete a version of a launch template, the ECS instances that were created based on the version are not affected.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteLaunchTemplateVersion  DeleteLaunchTemplateVersionRequest
     * @return DeleteLaunchTemplateVersionResponse
     */
    CompletableFuture<DeleteLaunchTemplateVersionResponse> deleteLaunchTemplateVersion(DeleteLaunchTemplateVersionRequest request);

    /**
     * @deprecated OpenAPI DeleteNatGateway is deprecated  * @param request  the request parameters of DeleteNatGateway  DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
     */
    @Deprecated
    CompletableFuture<DeleteNatGatewayResponse> deleteNatGateway(DeleteNatGatewayRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The ENI to be deleted must be in the Available state.</li>
     * <li>If the ENI to be deleted is attached to an Elastic Compute Service (ECS) instance, you must detach the ENI from the instance before you can delete the ENI. To detach the ENI, you can call the <a href="https://help.aliyun.com/document_detail/58514.html">DetachNetworkInterface</a> operation.</li>
     * <li>After an ENI is deleted, the following situations occur:<ul>
     * <li>All private IP addresses (including primary and secondary private IP addresses) of the ENI are automatically released.</li>
     * <li>The ENI is automatically removed from all security groups.</li>
     * </ul>
     * </li>
     * <li>The DeleteNetworkInterface operation is an asynchronous operation. After this operation is called to delete an ENI, you can check the status or events of the ENI to determine whether the ENI is deleted. The following figure shows the transitions between the states of the ENI.
     * <img src="https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/en-US/20230223/krcd/DeleteNetworkInterface.png" alt=""><ul>
     * <li>If the ENI is in the Deleting state, the ENI deletion request is sent and the ENI is being deleted.</li>
     * <li>If the ENI is not found, the ENI is deleted.</li>
     * <li>If the ENI is stuck in the Deleting state, the ENI fails to be deleted. You can re-initiate the request to delete the ENI.
     * For information about examples on how to call the DeleteNetworkInterface operation, see <a href="https://help.aliyun.com/document_detail/471553.html">Delete an ENI</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteNetworkInterface  DeleteNetworkInterfaceRequest
     * @return DeleteNetworkInterfaceResponse
     */
    CompletableFuture<DeleteNetworkInterfaceResponse> deleteNetworkInterface(DeleteNetworkInterfaceRequest request);

    /**
     * @deprecated OpenAPI DeleteNetworkInterfacePermission is deprecated, please use Ecs::2014-05-26::DeleteNetworkInterface instead.  * @param request  the request parameters of DeleteNetworkInterfacePermission  DeleteNetworkInterfacePermissionRequest
     * @return DeleteNetworkInterfacePermissionResponse
     */
    @Deprecated
    CompletableFuture<DeleteNetworkInterfacePermissionResponse> deleteNetworkInterfacePermission(DeleteNetworkInterfacePermissionRequest request);

    /**
     * @deprecated OpenAPI DeletePhysicalConnection is deprecated  * @param request  the request parameters of DeletePhysicalConnection  DeletePhysicalConnectionRequest
     * @return DeletePhysicalConnectionResponse
     */
    @Deprecated
    CompletableFuture<DeletePhysicalConnectionResponse> deletePhysicalConnection(DeletePhysicalConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>If a prefix list is associated with resources, you cannot delete the prefix list. You must disassociate the prefix list from the resources before you delete the prefix list. You can call the <a href="https://help.aliyun.com/document_detail/204724.html">DescribePrefixListAssociations</a> operation to query resources that are associated with a specific prefix list.</p>
     * 
     * @param request the request parameters of DeletePrefixList  DeletePrefixListRequest
     * @return DeletePrefixListResponse
     */
    CompletableFuture<DeletePrefixListResponse> deletePrefixList(DeletePrefixListRequest request);

    /**
     * @deprecated OpenAPI DeleteRouteEntry is deprecated  * @param request  the request parameters of DeleteRouteEntry  DeleteRouteEntryRequest
     * @return DeleteRouteEntryResponse
     */
    @Deprecated
    CompletableFuture<DeleteRouteEntryResponse> deleteRouteEntry(DeleteRouteEntryRequest request);

    /**
     * @deprecated OpenAPI DeleteRouterInterface is deprecated  * @param request  the request parameters of DeleteRouterInterface  DeleteRouterInterfaceRequest
     * @return DeleteRouterInterfaceResponse
     */
    @Deprecated
    CompletableFuture<DeleteRouterInterfaceResponse> deleteRouterInterface(DeleteRouterInterfaceRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>Before you delete a security group, make sure that the security group does not contain instances and is not referenced by other security groups. Otherwise, the DeleteSecurityGroup request fails. You can call the <a href="https://help.aliyun.com/document_detail/57320.html">DescribeSecurityGroupReferences</a> operation to query the reference details of the security group.</li>
     * <li>If the InvalidOperation.DeletionProtection error code is returned when you call the DeleteSecurityGroup operation to delete a security group or if a deletion protection-related message appears when you delete a security group in the Elastic Compute Service (ECS) console, the deletion protection feature is enabled for the security group. When you create a Container Service for Kubernetes (ACK) cluster, the deletion protection feature is enabled for an associated security group to prevent accidental deletion. You cannot manually disable the deletion protection feature for the security group. The deletion protection feature can be automatically disabled only after the ACK cluster is deleted. For more information, see <a href="https://help.aliyun.com/document_detail/353191.html">Disable deletion protection for a security group</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSecurityGroup  DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     */
    CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>If the snapshot does not exist, the request is ignored.</li>
     * <li>If the snapshot has been used to create custom images, the snapshot cannot be deleted. You need to call the <a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a> operation to delete the custom images before you can delete the snapshot.</li>
     * <li>If the snapshot has been used to create disks and <code>Force</code> is not specified or is set to <code>false</code>, the snapshot cannot be deleted directly. If you want to delete the snapshot, set <code>Force</code> to true to forcibly delete the snapshot. The disks created from the snapshot cannot be re-initialized after the snapshot is forcibly deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * <b>description</b> :
     * <p>If you have custom images that were created from a disk snapshot contained in a snapshot-consistent group, the disk snapshot is retained when the snapshot-consistent group is deleted. Before you can delete the disk snapshot, you must call the <a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a> operation to delete the custom images. After the custom images are deleted, you can call the <a href="https://help.aliyun.com/document_detail/25525.html">DeleteSnapshot</a> operation to delete the disk snapshot.</p>
     * 
     * @param request the request parameters of DeleteSnapshotGroup  DeleteSnapshotGroupRequest
     * @return DeleteSnapshotGroupResponse
     */
    CompletableFuture<DeleteSnapshotGroupResponse> deleteSnapshotGroup(DeleteSnapshotGroupRequest request);

    /**
     * @param request the request parameters of DeleteStorageSet  DeleteStorageSetRequest
     * @return DeleteStorageSetResponse
     */
    CompletableFuture<DeleteStorageSetResponse> deleteStorageSet(DeleteStorageSetRequest request);

    /**
     * @deprecated OpenAPI DeleteVSwitch is deprecated  * @param request  the request parameters of DeleteVSwitch  DeleteVSwitchRequest
     * @return DeleteVSwitchResponse
     */
    @Deprecated
    CompletableFuture<DeleteVSwitchResponse> deleteVSwitch(DeleteVSwitchRequest request);

    /**
     * @deprecated OpenAPI DeleteVirtualBorderRouter is deprecated  * @param request  the request parameters of DeleteVirtualBorderRouter  DeleteVirtualBorderRouterRequest
     * @return DeleteVirtualBorderRouterResponse
     */
    @Deprecated
    CompletableFuture<DeleteVirtualBorderRouterResponse> deleteVirtualBorderRouter(DeleteVirtualBorderRouterRequest request);

    /**
     * @deprecated OpenAPI DeleteVpc is deprecated, please use Vpc::2016-04-28::DeleteVpc instead.  * @param request  the request parameters of DeleteVpc  DeleteVpcRequest
     * @return DeleteVpcResponse
     */
    @Deprecated
    CompletableFuture<DeleteVpcResponse> deleteVpc(DeleteVpcRequest request);

    /**
     * @param request the request parameters of DeregisterManagedInstance  DeregisterManagedInstanceRequest
     * @return DeregisterManagedInstanceResponse
     */
    CompletableFuture<DeregisterManagedInstanceResponse> deregisterManagedInstance(DeregisterManagedInstanceRequest request);

    /**
     * @deprecated OpenAPI DescribeAccessPoints is deprecated  * @param request  the request parameters of DescribeAccessPoints  DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
     */
    @Deprecated
    CompletableFuture<DescribeAccessPointsResponse> describeAccessPoints(DescribeAccessPointsRequest request);

    /**
     * <b>description</b> :
     * <p>After you <a href="https://account.alibabacloud.com/register/intl_register.htm">create</a> an Alibaba Cloud account, you can create a specific number of ECS instances in different regions within the account. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.
     * You can apply for a quota increase in the <a href="https://quotas.console.aliyun.com/products">Quota Center console</a>.</p>
     * 
     * @param request the request parameters of DescribeAccountAttributes  DescribeAccountAttributesRequest
     * @return DescribeAccountAttributesResponse
     */
    CompletableFuture<DescribeAccountAttributesResponse> describeAccountAttributes(DescribeAccountAttributesRequest request);

    /**
     * <b>description</b> :
     * <p>You can use one of the following methods to check the responses:</p>
     * <ul>
     * <li>Method 1: When you call the DescribeActivations operation to retrieve the first page of results during a paged query, use MaxResults to specify the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which you can use in the next request to retrieve a new page of results. When you call the DescribeActivations operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and use MaxResults to specify the maximum number of entries to return in this call.</li>
     * <li>Method 2: Use PageSize to specify the number of entries to return on each page, and then use PageNumber to specify the number of the page to return. You can use only one of the preceding methods. If you specify MaxResults or NextToken, the PageSize and PageNumber request parameters do not take effect and the TotalCount response parameter is invalid.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeActivations  DescribeActivationsRequest
     * @return DescribeActivationsResponse
     */
    CompletableFuture<DescribeActivationsResponse> describeActivations(DescribeActivationsRequest request);

    /**
     * @param request the request parameters of DescribeAutoProvisioningGroupHistory  DescribeAutoProvisioningGroupHistoryRequest
     * @return DescribeAutoProvisioningGroupHistoryResponse
     */
    CompletableFuture<DescribeAutoProvisioningGroupHistoryResponse> describeAutoProvisioningGroupHistory(DescribeAutoProvisioningGroupHistoryRequest request);

    /**
     * @param request the request parameters of DescribeAutoProvisioningGroupInstances  DescribeAutoProvisioningGroupInstancesRequest
     * @return DescribeAutoProvisioningGroupInstancesResponse
     */
    CompletableFuture<DescribeAutoProvisioningGroupInstancesResponse> describeAutoProvisioningGroupInstances(DescribeAutoProvisioningGroupInstancesRequest request);

    /**
     * @param request the request parameters of DescribeAutoProvisioningGroups  DescribeAutoProvisioningGroupsRequest
     * @return DescribeAutoProvisioningGroupsResponse
     */
    CompletableFuture<DescribeAutoProvisioningGroupsResponse> describeAutoProvisioningGroups(DescribeAutoProvisioningGroupsRequest request);

    /**
     * @param request the request parameters of DescribeAutoSnapshotPolicyEx  DescribeAutoSnapshotPolicyExRequest
     * @return DescribeAutoSnapshotPolicyExResponse
     */
    CompletableFuture<DescribeAutoSnapshotPolicyExResponse> describeAutoSnapshotPolicyEx(DescribeAutoSnapshotPolicyExRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The value of <code>DestinationResource</code> determines whether you need to specify additional parameters. When you select a value in the following chain for DestinationResource, the more to the right the selected value is ordered, the more parameters you must specify.</p>
     * <ul>
     * <li>Sequence: <code>Zone &gt; IoOptimized &gt; InstanceType = Network = ddh &gt; SystemDisk &gt; DataDisk</code></li>
     * <li>Examples:<ul>
     * <li>If you set <code>DestinationResource</code> to <code>DataDisk</code>, take note of the following items:<ul>
     * <li>If you set <code>ResourceType</code> to <code>disk</code> to query the categories of data disks that are not attached to ECS instances, you do not need to specify <code>InstanceType</code>.</li>
     * <li>If you set <code>ResourceType</code> to <code>instance</code> to query the categories of data disks that are purchased together with ECS instances, you must specify <code>InstanceType</code> and <code>SystemDiskCategory</code> due to instance type-specific limits on system disks and data disks.</li>
     * </ul>
     * </li>
     * <li>If you set <code>DestinationResource</code> to <code>SystemDisk</code> and <code>ResourceType</code> to <code>instance</code>, you must specify <code>InstanceType</code> due to instance type-specific limits on system disks.</li>
     * <li>If you set <code>DestinationResource</code> to <code>InstanceType</code>, we recommend that you specify <code>IoOptimized</code> and <code>InstanceType</code>.</li>
     * <li>If you want to query the available ecs.g5.large resources in all zones of the China (Hangzhou) region, set <code>RegionId to cn-hangzhou, DestinationResource to InstanceType, IoOptimized to optimized, and InstanceType to ecs.g5.large</code>.</li>
     * <li>If you want to query the zones where ecs.g5.large resources are available in the China (Hangzhou) region, set <code>RegionId to cn-hangzhou, DestinationResource to Zone, IoOptimized to optimized, and InstanceType to ecs.g5.large</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    /**
     * @param request the request parameters of DescribeBandwidthLimitation  DescribeBandwidthLimitationRequest
     * @return DescribeBandwidthLimitationResponse
     */
    CompletableFuture<DescribeBandwidthLimitationResponse> describeBandwidthLimitation(DescribeBandwidthLimitationRequest request);

    /**
     * @deprecated OpenAPI DescribeBandwidthPackages is deprecated  * @param request  the request parameters of DescribeBandwidthPackages  DescribeBandwidthPackagesRequest
     * @return DescribeBandwidthPackagesResponse
     */
    @Deprecated
    CompletableFuture<DescribeBandwidthPackagesResponse> describeBandwidthPackages(DescribeBandwidthPackagesRequest request);

    /**
     * @param request the request parameters of DescribeCapacityReservationInstances  DescribeCapacityReservationInstancesRequest
     * @return DescribeCapacityReservationInstancesResponse
     */
    CompletableFuture<DescribeCapacityReservationInstancesResponse> describeCapacityReservationInstances(DescribeCapacityReservationInstancesRequest request);

    /**
     * @param request the request parameters of DescribeCapacityReservations  DescribeCapacityReservationsRequest
     * @return DescribeCapacityReservationsResponse
     */
    CompletableFuture<DescribeCapacityReservationsResponse> describeCapacityReservations(DescribeCapacityReservationsRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>This operation applies only to instances that reside in the classic network.</li>
     * <li>You can query a maximum of 100 instances that reside in the classic network at a time.</li>
     * <li>At least one of the <code>VpcId</code> and <code>InstanceId</code> parameters must be configured.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeClassicLinkInstances  DescribeClassicLinkInstancesRequest
     * @return DescribeClassicLinkInstancesResponse
     */
    CompletableFuture<DescribeClassicLinkInstancesResponse> describeClassicLinkInstances(DescribeClassicLinkInstancesRequest request);

    /**
     * @param request the request parameters of DescribeCloudAssistantSettings  DescribeCloudAssistantSettingsRequest
     * @return DescribeCloudAssistantSettingsResponse
     */
    CompletableFuture<DescribeCloudAssistantSettingsResponse> describeCloudAssistantSettings(DescribeCloudAssistantSettingsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>Before you run commands on or send files to instances, especially new instances, we recommend that you query the status of Cloud Assistant on the instances by calling this operation and checking the return value of CloudAssistantStatus. Run commands on or send files to the instances only when the return value is true.</li>
     * <li>You can use one of the following methods to check the responses:<ul>
     * <li>Method 1: During a paged query, when you call the DescribeCloudAssistantStatus operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeCloudAssistantStatus operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
     * <li>Method 2: Use <code>PageSize</code> to specify the number of entries to return on each page and then use <code>PageNumber</code> to specify the number of the page to return. You can use only one of the preceding methods. If you specify <code>MaxResults</code> or <code>NextToken</code>, the <code>PageSize</code> and <code>PageNumber</code> request parameters do not take effect and the <code>TotalCount</code> response parameter is invalid.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCloudAssistantStatus  DescribeCloudAssistantStatusRequest
     * @return DescribeCloudAssistantStatusResponse
     */
    CompletableFuture<DescribeCloudAssistantStatusResponse> describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request);

    /**
     * @deprecated OpenAPI DescribeClusters is deprecated  * @param request  the request parameters of DescribeClusters  DescribeClustersRequest
     * @return DescribeClustersResponse
     */
    @Deprecated
    CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>If you specify only <code>Action</code> and <code>RegionId</code>, all available commands (<code>CommandId</code>) that you created in the specified region are queried by default.</li>
     * <li>You can use one of the following methods to check the responses:<ul>
     * <li>Method 1: During a paged query, when you call the DescribeCommands operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeCommands operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
     * <li>Method 2: Use <code>PageSize</code> to specify the number of entries to return on each page and then use <code>PageNumber</code> to specify the number of the page to return. You can use only one of the preceding methods. If you specify <code>MaxResults</code> or <code>NextToken</code>, the <code>PageSize</code> and <code>PageNumber</code> request parameters do not take effect and the <code>TotalCount</code> response parameter is invalid.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCommands  DescribeCommandsRequest
     * @return DescribeCommandsResponse
     */
    CompletableFuture<DescribeCommandsResponse> describeCommands(DescribeCommandsRequest request);

    /**
     * @param request the request parameters of DescribeDedicatedHostAutoRenew  DescribeDedicatedHostAutoRenewRequest
     * @return DescribeDedicatedHostAutoRenewResponse
     */
    CompletableFuture<DescribeDedicatedHostAutoRenewResponse> describeDedicatedHostAutoRenew(DescribeDedicatedHostAutoRenewRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can specify multiple request parameters to filter query results. Specified request parameters have logical AND relations. Only the specified parameters are included in the filter conditions. However, if <code>DedicatedHostClusterIds</code> is set to an empty JSON array (<code>[]</code>), this parameter is regarded as a valid filter condition and an empty result is returned.</p>
     * 
     * @param request the request parameters of DescribeDedicatedHostClusters  DescribeDedicatedHostClustersRequest
     * @return DescribeDedicatedHostClustersResponse
     */
    CompletableFuture<DescribeDedicatedHostClustersResponse> describeDedicatedHostClusters(DescribeDedicatedHostClustersRequest request);

    /**
     * @param request the request parameters of DescribeDedicatedHostTypes  DescribeDedicatedHostTypesRequest
     * @return DescribeDedicatedHostTypesResponse
     */
    CompletableFuture<DescribeDedicatedHostTypesResponse> describeDedicatedHostTypes(DescribeDedicatedHostTypesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can use one of the following methods to query the information about dedicated hosts:</p>
     * <ul>
     * <li>Specify <code>DedicatedHostIds</code> to query the details of specified dedicated hosts.</li>
     * <li>Specify <code>DedicatedHostClusterId</code> to query the details of dedicated hosts in a dedicated host cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDedicatedHosts  DescribeDedicatedHostsRequest
     * @return DescribeDedicatedHostsResponse
     */
    CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request);

    /**
     * @deprecated OpenAPI DescribeDemands is deprecated, please use Ecs::2014-05-26::DescribeCapacityReservations instead.  * @description You can call this operation to query the details of resources that you filed with Alibaba Cloud, including the types, delivery status, and consumption details of the resources.
     * By default, the demands for I/O optimized instances of the Virtual Private Cloud (VPC) type are queried.
     * For information about how to create (CreateDemand), modify (ModifyDemand), and delete (DeleteDemand) demands for ECS resources, contact your account manager.
     * 
     * @param request the request parameters of DescribeDemands  DescribeDemandsRequest
     * @return DescribeDemandsResponse
     */
    @Deprecated
    CompletableFuture<DescribeDemandsResponse> describeDemands(DescribeDemandsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>For information about instance families, see <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a>.</p>
     * 
     * @param request the request parameters of DescribeDeploymentSetSupportedInstanceTypeFamily  DescribeDeploymentSetSupportedInstanceTypeFamilyRequest
     * @return DescribeDeploymentSetSupportedInstanceTypeFamilyResponse
     */
    CompletableFuture<DescribeDeploymentSetSupportedInstanceTypeFamilyResponse> describeDeploymentSetSupportedInstanceTypeFamily(DescribeDeploymentSetSupportedInstanceTypeFamilyRequest request);

    /**
     * @param request the request parameters of DescribeDeploymentSets  DescribeDeploymentSetsRequest
     * @return DescribeDeploymentSetsResponse
     */
    CompletableFuture<DescribeDeploymentSetsResponse> describeDeploymentSets(DescribeDeploymentSetsRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosticMetricSets  DescribeDiagnosticMetricSetsRequest
     * @return DescribeDiagnosticMetricSetsResponse
     */
    CompletableFuture<DescribeDiagnosticMetricSetsResponse> describeDiagnosticMetricSets(DescribeDiagnosticMetricSetsRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosticMetrics  DescribeDiagnosticMetricsRequest
     * @return DescribeDiagnosticMetricsResponse
     */
    CompletableFuture<DescribeDiagnosticMetricsResponse> describeDiagnosticMetrics(DescribeDiagnosticMetricsRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosticReportAttributes  DescribeDiagnosticReportAttributesRequest
     * @return DescribeDiagnosticReportAttributesResponse
     */
    CompletableFuture<DescribeDiagnosticReportAttributesResponse> describeDiagnosticReportAttributes(DescribeDiagnosticReportAttributesRequest request);

    /**
     * @param request the request parameters of DescribeDiagnosticReports  DescribeDiagnosticReportsRequest
     * @return DescribeDiagnosticReportsResponse
     */
    CompletableFuture<DescribeDiagnosticReportsResponse> describeDiagnosticReports(DescribeDiagnosticReportsRequest request);

    /**
     * @param request the request parameters of DescribeDiskDefaultKMSKeyId  DescribeDiskDefaultKMSKeyIdRequest
     * @return DescribeDiskDefaultKMSKeyIdResponse
     */
    CompletableFuture<DescribeDiskDefaultKMSKeyIdResponse> describeDiskDefaultKMSKeyId(DescribeDiskDefaultKMSKeyIdRequest request);

    /**
     * @param request the request parameters of DescribeDiskEncryptionByDefaultStatus  DescribeDiskEncryptionByDefaultStatusRequest
     * @return DescribeDiskEncryptionByDefaultStatusResponse
     */
    CompletableFuture<DescribeDiskEncryptionByDefaultStatusResponse> describeDiskEncryptionByDefaultStatus(DescribeDiskEncryptionByDefaultStatusRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can query the following monitoring data of a disk: the read IOPS, write IOPS, read bandwidth (byte/s), write bandwidth (byte/s), read latency (microseconds), and write latency (microseconds).
     * Take note of the following items:</p>
     * <ul>
     * <li>Monitoring data of only disks that are in the In Use (<code>In_use</code>) state can be queried. For more information, see <a href="https://help.aliyun.com/document_detail/25689.html">Disk states</a>.
     * **
     * <strong>Note</strong> Some information may be missing from the monitoring data of a disk because the disk is not in the In Use <code>(In_use)</code> state and the system cannot obtain the relevant information.</li>
     * <li>Up to 400 monitoring data entries can be returned at a time. Make sure that the <code>TotalCount</code> value does not exceed 400. The value is calculated by using the following formula: <code>TotalCount = (EndTime - StartTime)/Period</code>. If the TotalCount value is greater than 400, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.</li>
     * <li>You can query the monitoring data in the last 30 days. If the value of <code>StartTime</code> is more than 30 days earlier than the current time, an error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDiskMonitorData  DescribeDiskMonitorDataRequest
     * @return DescribeDiskMonitorDataResponse
     */
    CompletableFuture<DescribeDiskMonitorDataResponse> describeDiskMonitorData(DescribeDiskMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <ul>
     * <li>You can specify multiple request parameters such as <code>RegionId</code>, <code>ZoneId</code>, <code>DiskIds</code>, and <code>InstanceId</code> as filters. The specified parameters are evaluated by using the &quot;AND&quot; operator. If you specify more than one filter, the records that match all filters are returned.</li>
     * <li>The value of <code>DiskIds</code> is a JSON array. If you do not specify DiskIds, the parameter is not used as a filter condition. If you set <code>DiskIds</code> to an empty JSON array, the parameter is regarded as a valid filter, and an empty result is returned.</li>
     * <li>You can use one of the following methods to check the responses:<ul>
     * <li>Method 1: Use <code>NextToken</code> to specify the pagination token. Set the value to the <code>NextToken</code> value that is obtained from the previous query. Then, use <code>MaxResults</code> to specify the maximum number of entries to return on each page.</li>
     * <li>Method 2: Use <code>PageSize</code> to specify the number of entries to return on each page, and then use <code>PageNumber</code> to specify the number of the page to return.
     * You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use Method 1. If <code>NextToken</code> is specified, <code>PageSize</code> and <code>PageNumber</code> do not take effect and <code>TotalCount</code> in the response is invalid.</li>
     * </ul>
     * </li>
     * <li>You can attach a disk for which the multi-attach feature is enabled to multiple instances. You can query the attachment information of the disk based on the <code>Attachment</code> values in the response.
     * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDisks  DescribeDisksRequest
     * @return DescribeDisksResponse
     */
    CompletableFuture<DescribeDisksResponse> describeDisks(DescribeDisksRequest request);

    /**
     * <b>description</b> :
     * <p>  The full status information about an EBS device includes the lifecycle status specified by the <code>Status</code> parameter, health status specified by the <code>HealthStatus</code> parameter, and event type specified by the <code>EventType</code> parameter of the EBS device. You can filter the results based on these parameters.</p>
     * <ul>
     * <li>The release time, scheduled execution time, and actual execution time of each EBS device event are identical. If you specify a period of time by using the <code>EventTime.Start</code> and <code>EventTime.End</code> parameters, all events that occurred within this period are queried. You can query events that occurred within the last seven days.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDisksFullStatus  DescribeDisksFullStatusRequest
     * @return DescribeDisksFullStatusResponse
     */
    CompletableFuture<DescribeDisksFullStatusResponse> describeDisksFullStatus(DescribeDisksFullStatusRequest request);

    /**
     * @deprecated OpenAPI DescribeEipAddresses is deprecated, please use Vpc::2016-04-28::DescribeEipAddresses instead.  * @param request  the request parameters of DescribeEipAddresses  DescribeEipAddressesRequest
     * @return DescribeEipAddressesResponse
     */
    @Deprecated
    CompletableFuture<DescribeEipAddressesResponse> describeEipAddresses(DescribeEipAddressesRequest request);

    /**
     * @deprecated OpenAPI DescribeEipMonitorData is deprecated  * @param request  the request parameters of DescribeEipMonitorData  DescribeEipMonitorDataRequest
     * @return DescribeEipMonitorDataResponse
     */
    @Deprecated
    CompletableFuture<DescribeEipMonitorDataResponse> describeEipMonitorData(DescribeEipMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <p>When an elasticity assurance expires, data about the association between the instances and the private pool generated by the elasticity assurance becomes invalid. When you call this operation to query the expired elasticity assurance, no value is returned.</p>
     * 
     * @param request the request parameters of DescribeElasticityAssuranceInstances  DescribeElasticityAssuranceInstancesRequest
     * @return DescribeElasticityAssuranceInstancesResponse
     */
    CompletableFuture<DescribeElasticityAssuranceInstancesResponse> describeElasticityAssuranceInstances(DescribeElasticityAssuranceInstancesRequest request);

    /**
     * @param request the request parameters of DescribeElasticityAssurances  DescribeElasticityAssurancesRequest
     * @return DescribeElasticityAssurancesResponse
     */
    CompletableFuture<DescribeElasticityAssurancesResponse> describeElasticityAssurances(DescribeElasticityAssurancesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The monitoring data of a secondary ENI includes the amount of traffic sent and received over the internal network, the number of packets sent and received by the secondary ENI, and the number of sent and received packets that are dropped by the secondary ENI. Specific information may be missing from the returned monitoring data. This may be because the system cannot obtain the relevant information. For example, if the instance to which the secondary ENI is attached is in the Stopped state or if the secondary ENI is not attached to an instance and is in the Available state, the monitoring data of the secondary ENI cannot be obtained. Take note of the following items:</p>
     * <ul>
     * <li>Up to 400 monitoring data entries can be returned at a time. Make sure that the <code>TotalCount</code> value does not exceed 400. The value is calculated by using the following formula: <code>TotalCount = (EndTime - StartTime)/Period</code>. If the TotalCount value is greater than 400, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.</li>
     * <li>You can query the monitoring data in the last 30 days. If the value of <code>StartTime</code> is more than 30 days earlier than the current time, an error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeEniMonitorData  DescribeEniMonitorDataRequest
     * @return DescribeEniMonitorDataResponse
     */
    CompletableFuture<DescribeEniMonitorDataResponse> describeEniMonitorData(DescribeEniMonitorDataRequest request);

    /**
     * @deprecated OpenAPI DescribeForwardTableEntries is deprecated  * @param request  the request parameters of DescribeForwardTableEntries  DescribeForwardTableEntriesRequest
     * @return DescribeForwardTableEntriesResponse
     */
    @Deprecated
    CompletableFuture<DescribeForwardTableEntriesResponse> describeForwardTableEntries(DescribeForwardTableEntriesRequest request);

    /**
     * @deprecated OpenAPI DescribeHaVips is deprecated  * @param request  the request parameters of DescribeHaVips  DescribeHaVipsRequest
     * @return DescribeHaVipsResponse
     */
    @Deprecated
    CompletableFuture<DescribeHaVipsResponse> describeHaVips(DescribeHaVipsRequest request);

    /**
     * @param request the request parameters of DescribeHpcClusters  DescribeHpcClustersRequest
     * @return DescribeHpcClustersResponse
     */
    CompletableFuture<DescribeHpcClustersResponse> describeHpcClusters(DescribeHpcClustersRequest request);

    /**
     * <b>description</b> :
     * <p>You can use <code>NextToken</code> to configure the query token. Set the value to the <code>NextToken</code> value that is returned in the previous call to the DescribeImageComponents operation. Then, use <code>MaxResults</code> to specify the maximum number of entries to return on each page.</p>
     * 
     * @param request the request parameters of DescribeImageComponents  DescribeImageComponentsRequest
     * @return DescribeImageComponentsResponse
     */
    CompletableFuture<DescribeImageComponentsResponse> describeImageComponents(DescribeImageComponentsRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>This API operation only returns the available custom images that are newly created in the specified image family. Public images, Alibaba Cloud Marketplace images, community images, or shared images are not queried.</li>
     * <li>If no available custom images exist in the specified image family, the response is empty.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeImageFromFamily  DescribeImageFromFamilyRequest
     * @return DescribeImageFromFamilyResponse
     */
    CompletableFuture<DescribeImageFromFamilyResponse> describeImageFromFamily(DescribeImageFromFamilyRequest request);

    /**
     * <b>description</b> :
     * <p>  The image template that is specified by the <code>ImagePipelineId</code> parameter cannot be a deleted image template. When an image template is deleted, the corresponding image creation task is deleted.</p>
     * <ul>
     * <li>You must specify <code>ImagePipelineId</code> or <code>ExecutionId</code>.</li>
     * <li>You can configure the query token by using the <code>NextToken</code> parameter. Set the value of NextToken to the value of <code>NextToken</code> that was returned the last time you called the <code>DescribeImagePipelineExecutions</code> operation. Then, use the <code>MaxResults</code> parameter to specify the maximum number of entries to return on each page to query the details of the image creation task.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeImagePipelineExecutions  DescribeImagePipelineExecutionsRequest
     * @return DescribeImagePipelineExecutionsResponse
     */
    CompletableFuture<DescribeImagePipelineExecutionsResponse> describeImagePipelineExecutions(DescribeImagePipelineExecutionsRequest request);

    /**
     * <b>description</b> :
     * <p>You can use <code>NextToken</code> to configure the query token. Set the value to the <code>NextToken</code> value that is returned in the previous call to the <code>DescribeImagePipelines</code> operation. Then, use <code>MaxResults</code> to specify the maximum number of entries to return on each page.</p>
     * 
     * @param request the request parameters of DescribeImagePipelines  DescribeImagePipelinesRequest
     * @return DescribeImagePipelinesResponse
     */
    CompletableFuture<DescribeImagePipelinesResponse> describeImagePipelines(DescribeImagePipelinesRequest request);

    /**
     * @param request the request parameters of DescribeImageSharePermission  DescribeImageSharePermissionRequest
     * @return DescribeImageSharePermissionResponse
     */
    CompletableFuture<DescribeImageSharePermissionResponse> describeImageSharePermission(DescribeImageSharePermissionRequest request);

    /**
     * @param request the request parameters of DescribeImageSupportInstanceTypes  DescribeImageSupportInstanceTypesRequest
     * @return DescribeImageSupportInstanceTypesResponse
     */
    CompletableFuture<DescribeImageSupportInstanceTypesResponse> describeImageSupportInstanceTypes(DescribeImageSupportInstanceTypesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>You can query your custom images, public images provided by Alibaba Cloud, Alibaba Cloud Marketplace images, and shared images from other Alibaba Cloud accounts.</li>
     * <li>This is a paginated query. The response contains the total number of available images and the images on the returned page. By default,10 entries are displayed on each page.</li>
     * <li>When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter formats</a>.</li>
     * <li>If you set ImageOwnerAlias to system or others when you call the DescribeImages operation to query public images that are provided by Alibaba Cloud or shared images, Resource Access Management (RAM) policies are ignored in the request. For more information, see <a href="https://help.aliyun.com/document_detail/25497.html">RAM authorization</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeImages  DescribeImagesRequest
     * @return DescribeImagesResponse
     */
    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    /**
     * <b>description</b> :
     * <p>A private pool is generated after an elasticity assurance or a capacity reservation is created. The private pool is associated with information about the instances that are created by using the private pool. You can configure a private pool when you create an instance. This way, the instance matches the elasticity assurance or capacity reservation that is associated with the private pool.
     * When a private pool expires, data about the association between instances and the private pool becomes invalid. If you call this operation to query the information about the private pool, empty values are returned.</p>
     * 
     * @param request the request parameters of DescribeInstanceAttachmentAttributes  DescribeInstanceAttachmentAttributesRequest
     * @return DescribeInstanceAttachmentAttributesResponse
     */
    CompletableFuture<DescribeInstanceAttachmentAttributesResponse> describeInstanceAttachmentAttributes(DescribeInstanceAttachmentAttributesRequest request);

    /**
     * @param request the request parameters of DescribeInstanceAttribute  DescribeInstanceAttributeRequest
     * @return DescribeInstanceAttributeResponse
     */
    CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you configure auto-renewal or manual renewal for subscription instances, you can query the auto-renewal status of the instances.</p>
     * <ul>
     * <li>This operation is applicable to only subscription instances. An error is returned if you call this operation on pay-as-you-go instances.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceAutoRenewAttribute  DescribeInstanceAutoRenewAttributeRequest
     * @return DescribeInstanceAutoRenewAttributeResponse
     */
    CompletableFuture<DescribeInstanceAutoRenewAttributeResponse> describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can query system events that were completed within the last 30 days. No limits apply to the time range for querying uncompleted system events.</p>
     * <ul>
     * <li>You can also specify InstanceEventCycleStatus to query the system events that are in the Scheduled, Executing, or Inquiring state.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceHistoryEvents  DescribeInstanceHistoryEventsRequest
     * @return DescribeInstanceHistoryEventsResponse
     */
    CompletableFuture<DescribeInstanceHistoryEventsResponse> describeInstanceHistoryEvents(DescribeInstanceHistoryEventsRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to query the specified maintenance policy of an instance, which contains the following maintenance attributes:</p>
     * <ul>
     * <li>Maintenance window: the time period that you specify for maintenance.</li>
     * <li>Maintenance action: the action that you specify in response to instance shutdown.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceMaintenanceAttributes  DescribeInstanceMaintenanceAttributesRequest
     * @return DescribeInstanceMaintenanceAttributesResponse
     */
    CompletableFuture<DescribeInstanceMaintenanceAttributesResponse> describeInstanceMaintenanceAttributes(DescribeInstanceMaintenanceAttributesRequest request);

    /**
     * <b>description</b> :
     * <p>  Pricing information can be queried for unexpired subscription ECS instances only when you upgrade their configurations. The pricing information cannot be queried when the instance configurations are downgraded.</p>
     * <ul>
     * <li>Pricing information cannot be queried for pay-as-you-go ECS instances when you change their configurations. Prices of existing pay-as-you-go ECS instances whose configurations are changed are the same as those of new pay-as-you-go instances. You can call the <a href="https://help.aliyun.com/document_detail/107829.html">DescribePrice</a> operation to query the latest prices of ECS instances.</li>
     * <li>Before you upgrade the configurations of an instance, we recommend that you call the <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> operation to query the instance types available for configuration upgrades in a specified zone.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceModificationPrice  DescribeInstanceModificationPriceRequest
     * @return DescribeInstanceModificationPriceResponse
     */
    CompletableFuture<DescribeInstanceModificationPriceResponse> describeInstanceModificationPrice(DescribeInstanceModificationPriceRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>Up to 400 monitoring data entries can be returned at a time. Make sure that the <code>TotalCount</code> value does not exceed 400. The value is calculated by using the following formula: <code>TotalCount = (EndTime - StartTime)/Period</code>. If the TotalCount value is greater than 400, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.</li>
     * <li>You can query the monitoring data in the last 30 days. If the value of <code>StartTime</code> is more than 30 days earlier than the current time, an error is returned.</li>
     * <li>In some scenarios, such as when the instance is in the Stopped state, the system cannot obtain the relevant information and specific information may be missing from the returned monitoring data.</li>
     * <li>You cannot call this operation to obtain the CPU basic monitoring information of an ECS bare metal instance. To obtain the CPU monitoring information of an ECS bare metal instance, install the CloudMonitor agent on the instance. For more information, see <a href="https://help.aliyun.com/document_detail/183482.html">InstallCloudMonitor</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceMonitorData  DescribeInstanceMonitorDataRequest
     * @return DescribeInstanceMonitorDataResponse
     */
    CompletableFuture<DescribeInstanceMonitorDataResponse> describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</p>
     * 
     * @param request the request parameters of DescribeInstanceRamRole  DescribeInstanceRamRoleRequest
     * @return DescribeInstanceRamRoleResponse
     */
    CompletableFuture<DescribeInstanceRamRoleResponse> describeInstanceRamRole(DescribeInstanceRamRoleRequest request);

    /**
     * <b>description</b> :
     * <p>  For information about the lifecycle states of an ECS instance, see <a href="https://help.aliyun.com/document_detail/25687.html">Instance states</a>.</p>
     * <ul>
     * <li>You can also call this operation to query the list of ECS instances.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceStatus  DescribeInstanceStatusRequest
     * @return DescribeInstanceStatusResponse
     */
    CompletableFuture<DescribeInstanceStatusResponse> describeInstanceStatus(DescribeInstanceStatusRequest request);

    /**
     * @param request the request parameters of DescribeInstanceTopology  DescribeInstanceTopologyRequest
     * @return DescribeInstanceTopologyResponse
     */
    CompletableFuture<DescribeInstanceTopologyResponse> describeInstanceTopology(DescribeInstanceTopologyRequest request);

    /**
     * @param request the request parameters of DescribeInstanceTypeFamilies  DescribeInstanceTypeFamiliesRequest
     * @return DescribeInstanceTypeFamiliesResponse
     */
    CompletableFuture<DescribeInstanceTypeFamiliesResponse> describeInstanceTypeFamilies(DescribeInstanceTypeFamiliesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>MaxResults specifies the maximum number of entries per page. The maximum value of this parameter is changed from 1600 to 100. As of November 15, 2023, only 100 can be used as the maximum value of MaxResults. If you called the DescribeInstanceTypes operation in 2022, you can use 1600 as the maximum value before November 15, 2023. If you do not specify NextToken when you call the DescribeInstanceTypes operation, only the first page of results that contains up to 100 entries is returned. If you want to retrieve more results, specify NextToken to perform paged queries, or specify filter conditions to filter results.</li>
     * <li>We recommend that you specify MaxResults and NextToken to perform paged queries. The first time you call the DescribeInstanceTypes operation, set MaxResults to limit the maximum number of entries that can be returned in a single call. If the number of entries to return exceeds the specified MaxResults value, the response includes a NextToken value. You can set NextToken to the return value and specify MaxResults in your next request to DescribeInstanceTypes to retrieve the next page of results.</li>
     * <li>The DescribeInstanceTypes operation is used to query only the specifications and performance information of instance types. To query instance types that are available in a specific region, call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation.</li>
     * <li>To use special instance types such as instance types that are unavailable for purchase, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceTypes  DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
     */
    CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The <strong>keepalive</strong> time of a connection to a VNC management terminal is 300 seconds. If you do not interact with the VNC management terminal for 300 seconds, the VNC management terminal is automatically disconnected.</li>
     * <li>If the connection is interrupted, you must recall this operation to obtain a new logon address that is specified by <code>VncUrl</code> and use the new logon address to construct a URL that can be used to reconnect to the VNC management terminal. You can reconnect to a VNC management terminal for a maximum of 30 times per minute.</li>
     * <li>You need to add the <code>vncUrl=\\*\\*\\*\\*</code>, <code>instanceId=\\*\\*\\*\\*</code>, and <code>isWindows=true/false</code> parameters to the end of the link <code>https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?</code> and use an ampersand (<code>&amp;</code>) between the parameters.<ul>
     * <li><code>vncUrl</code>: the value of <code>VncUrl</code> that is returned after a successful call of this operation.</li>
     * <li><code>instanceId</code>: the ID of your instance.</li>
     * <li><code>isWindows</code>: specifies whether the operating system of your instance is Windows. A value of <code>true</code> indicates that the operating system is Windows. A value of <code>false</code> indicates that the operating system is not Windows.<blockquote>
     * <p> You can connect to an instance without a VNC logon password. Therefore, you do not need to configure the <code>password</code> parameter.
     * Sample URL:
     * <a href="https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%****&instanceId=i-wz9hhwq5a6tm****&isWindows=true">https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%****&amp;instanceId=i-wz9hhwq5a6tm****&amp;isWindows=true</a></p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceVncUrl  DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     */
    CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>You can specify multiple request parameters to filter query results. Specified request parameters have logical AND relations. Only the specified parameters are included in the filter conditions. However, if InstanceIds is set to an empty JSON array, this parameter is regarded as a valid filter condition and an empty result is returned.</li>
     * <li>If you are using a Resource Access Management (RAM) user or RAM role that does not have the permissions to call this operation, an empty list is returned. You can include <code>DryRun</code> in your request to check whether the empty list is caused by lack of permissions.</li>
     * <li>When you call the API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter formats</a>.</li>
     * <li>You can use one of the following methods to check the responses:<ul>
     * <li>Method 1: During a paged query, when you call the DescribeInstances operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeInstances operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
     * <li>Method 2: Use <code>PageSize</code> to specify the number of entries to return on each page and then use <code>PageNumber</code> to specify the number of the page to return.
     * You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use Method 1. When <code>MaxResults</code> or <code>NextToken</code> is specified, the <code>PageSize</code> and <code>PageNumber</code> request parameters do not take effect and the <code>TotalCount</code> response parameter is invalid.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The response includes the instance status and the instance system events that are in the Scheduled state.
     * You can specify a period of time to query events that occurred within the period of time.</p>
     * 
     * @param request the request parameters of DescribeInstancesFullStatus  DescribeInstancesFullStatusRequest
     * @return DescribeInstancesFullStatusResponse
     */
    CompletableFuture<DescribeInstancesFullStatusResponse> describeInstancesFullStatus(DescribeInstancesFullStatusRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>After you run a command, the command may fail to run or may return unexpected results. You can call this operation to query the execution results.</li>
     * <li>You can query information about command executions within the last four weeks. Up to 100,000 pieces of execution information can be retained.</li>
     * <li>You can <a href="https://help.aliyun.com/document_detail/2669130.html">subscribe to Cloud Assistant task status events</a> to obtain command execution results from the events. This helps you reduce the number of times to poll API operations and improve efficiency.</li>
     * <li>You can use one of the following methods to check the responses:<ul>
     * <li>Method 1: During a paged query, when you call the DescribeInvocationResults operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeInvocationResults operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
     * <li>Method 2: Use <code>PageSize</code> to specify the number of entries per page, and then use <code>PageNumber</code> to specify the page number. You can use only one of the preceding methods. If you specify <code>MaxResults</code> or <code>NextToken</code>, the <code>PageSize</code> and <code>PageNumber</code> request parameters do not take effect and the <code>TotalCount</code> response parameter is invalid.</li>
     * </ul>
     * </li>
     * <li>Comparison between the <code>DescribeInvocations</code> and <code>DescribeInvocationResults</code> operations:<ul>
     * <li>Scenario in which the <code>RunCommand</code> or <code>InvokeCommand</code> operation is called to run a Cloud Assistant command on multiple instances:<ul>
     * <li>The <code>DescribeInvocations</code> operation queries the execution status of the command on each instance and the overall execution status of the command on all instances.</li>
     * <li>The <code>DescribeInvocationResults</code> operation queries only the execution status of the command on each instance.</li>
     * </ul>
     * </li>
     * <li>Scenario in which the <code>RunCommand</code> or <code>InvokeCommand</code> operation is called to run a Cloud Assistant command on a single instance:<ul>
     * <li>The <code>DescribeInvocations</code> operation is equivalent to the <code>DescribeInvocationResults</code> operation.</li>
     * </ul>
     * </li>
     * <li>If you want to query the status of each execution for a scheduled (recurring) task or a task that is automatically executed on instance startup (<code>RepeatMode is set to Period or EveryReboot</code>), you can call only the <code>DescribeInvocationResults</code> operation and must set <code>IncludeHistory</code> to true. The <code>DescribeInvocations</code> operation queries only the most recent execution status of the command.</li>
     * <li>If you want to view the command content and parameters, you can call only the <code>DescribeInvocations</code> operation and check the <code>CommandContent</code> value in the response.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInvocationResults  DescribeInvocationResultsRequest
     * @return DescribeInvocationResultsResponse
     */
    CompletableFuture<DescribeInvocationResultsResponse> describeInvocationResults(DescribeInvocationResultsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>After you run a command, the command may fail to run or may return unexpected results. You can call this operation to query the execution results.</li>
     * <li>You can query information about command executions within the last four weeks. Up to 100,000 pieces of execution information can be retained.</li>
     * <li>You can <a href="https://help.aliyun.com/document_detail/2669130.html">subscribe to Cloud Assistant task status events</a> to obtain command execution results from the events. This helps you reduce the number of times to poll API operations and improve efficiency.</li>
     * <li>You can use one of the following methods to check the responses:<ul>
     * <li>Method 1: During a paged query, when you call the DescribeInvocations operation to retrieve the first page of results, use <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token, which you can use in the next request to retrieve a new page of results. When you call the DescribeInvocations operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
     * <li>Method 2: Use <code>PageSize</code> to specify the number of entries per page, and then use <code>PageNumber</code> to specify the page number. You can use only one of the preceding methods. If you specify <code>MaxResults</code> or <code>NextToken</code>, the <code>PageSize</code> and <code>PageNumber</code> request parameters do not take effect and the <code>TotalCount</code> response parameter is invalid.</li>
     * </ul>
     * </li>
     * <li>Comparison between the <code>DescribeInvocations</code> and <code>DescribeInvocationResults</code> operations:<ul>
     * <li>Scenario in which the <code>RunCommand</code> or <code>InvokeCommand</code> operation is called to run a Cloud Assistant command on multiple instances:<ul>
     * <li>The <code>DescribeInvocations</code> operation queries the execution status of the command on each instance and the overall execution status of the command on all instances.</li>
     * <li>The <code>DescribeInvocationResults</code> operation queries only the execution status of the command on each instance.</li>
     * </ul>
     * </li>
     * <li>Scenario in which the <code>RunCommand</code> or <code>InvokeCommand</code> operation is called to run a Cloud Assistant command on a single instance:<ul>
     * <li>The <code>DescribeInvocations</code> operation is equivalent to the <code>DescribeInvocationResults</code> operation.</li>
     * </ul>
     * </li>
     * <li>If you want to query the status of each execution for a scheduled (recurring) task or a task that is automatically executed on instance startup (<code>RepeatMode is set to Period or EveryReboot</code>), you can call only the <code>DescribeInvocationResults</code> operation and must set <code>IncludeHistory</code> to true. The <code>DescribeInvocations</code> operation queries only the most recent execution status of the command.</li>
     * <li>If you want to view the command content and parameters, you can call only the <code>DescribeInvocations</code> operation and check the <code>CommandContent</code> value in the response.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInvocations  DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
     */
    CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request);

    /**
     * @param request the request parameters of DescribeKeyPairs  DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     */
    CompletableFuture<DescribeKeyPairsResponse> describeKeyPairs(DescribeKeyPairsRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Ecs%5C&api=DescribeLaunchTemplateVersions%5C&type=RPC%5C&version=2014-05-26">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of DescribeLaunchTemplateVersions  DescribeLaunchTemplateVersionsRequest
     * @return DescribeLaunchTemplateVersionsResponse
     */
    CompletableFuture<DescribeLaunchTemplateVersionsResponse> describeLaunchTemplateVersions(DescribeLaunchTemplateVersionsRequest request);

    /**
     * @param request the request parameters of DescribeLaunchTemplates  DescribeLaunchTemplatesRequest
     * @return DescribeLaunchTemplatesResponse
     */
    CompletableFuture<DescribeLaunchTemplatesResponse> describeLaunchTemplates(DescribeLaunchTemplatesRequest request);

    /**
     * @deprecated OpenAPI DescribeLimitation is deprecated  * @param request  the request parameters of DescribeLimitation  DescribeLimitationRequest
     * @return DescribeLimitationResponse
     */
    @Deprecated
    CompletableFuture<DescribeLimitationResponse> describeLimitation(DescribeLimitationRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can use one of the following methods to check the responses:</p>
     * <ul>
     * <li>Method 1: During a paged query, when you call the DescribeManagedInstances operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeManagedInstances operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
     * <li>Method 2: Use <code>PageSize</code> to specify the number of entries to return on each page and then use <code>PageNumber</code> to specify the number of the page to return. You can use only one of the preceding methods. If you specify <code>MaxResults</code> or <code>NextToken</code>, the <code>PageSize</code> and <code>PageNumber</code> request parameters do not take effect and the <code>TotalCount</code> response parameter is invalid.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeManagedInstances  DescribeManagedInstancesRequest
     * @return DescribeManagedInstancesResponse
     */
    CompletableFuture<DescribeManagedInstancesResponse> describeManagedInstances(DescribeManagedInstancesRequest request);

    /**
     * @deprecated OpenAPI DescribeNatGateways is deprecated  * @param request  the request parameters of DescribeNatGateways  DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
     */
    @Deprecated
    CompletableFuture<DescribeNatGatewaysResponse> describeNatGateways(DescribeNatGatewaysRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Ecs%5C&api=DescribeNetworkInterfaceAttribute%5C&type=RPC%5C&version=2014-05-26">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of DescribeNetworkInterfaceAttribute  DescribeNetworkInterfaceAttributeRequest
     * @return DescribeNetworkInterfaceAttributeResponse
     */
    CompletableFuture<DescribeNetworkInterfaceAttributeResponse> describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest request);

    /**
     * @param request the request parameters of DescribeNetworkInterfacePermissions  DescribeNetworkInterfacePermissionsRequest
     * @return DescribeNetworkInterfacePermissionsResponse
     */
    CompletableFuture<DescribeNetworkInterfacePermissionsResponse> describeNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can call the <code>DescribeNetworkInterfaces</code> operation for paged query by specifying the <code>MaxResults</code> or <code>NextToken</code> parameter. Take note of the following items:</p>
     * <ul>
     * <li>During a paged query, when you call the DescribeNetworkInterfaces operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results.</li>
     * <li>When you call the DescribeNetworkInterfaces operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeNetworkInterfaces  DescribeNetworkInterfacesRequest
     * @return DescribeNetworkInterfacesResponse
     */
    CompletableFuture<DescribeNetworkInterfacesResponse> describeNetworkInterfaces(DescribeNetworkInterfacesRequest request);

    /**
     * @deprecated OpenAPI DescribeNewProjectEipMonitorData is deprecated  * @param request  the request parameters of DescribeNewProjectEipMonitorData  DescribeNewProjectEipMonitorDataRequest
     * @return DescribeNewProjectEipMonitorDataResponse
     */
    @Deprecated
    CompletableFuture<DescribeNewProjectEipMonitorDataResponse> describeNewProjectEipMonitorData(DescribeNewProjectEipMonitorDataRequest request);

    /**
     * @deprecated OpenAPI DescribePhysicalConnections is deprecated  * @param request  the request parameters of DescribePhysicalConnections  DescribePhysicalConnectionsRequest
     * @return DescribePhysicalConnectionsResponse
     */
    @Deprecated
    CompletableFuture<DescribePhysicalConnectionsResponse> describePhysicalConnections(DescribePhysicalConnectionsRequest request);

    /**
     * @param request the request parameters of DescribePrefixListAssociations  DescribePrefixListAssociationsRequest
     * @return DescribePrefixListAssociationsResponse
     */
    CompletableFuture<DescribePrefixListAssociationsResponse> describePrefixListAssociations(DescribePrefixListAssociationsRequest request);

    /**
     * @param request the request parameters of DescribePrefixListAttributes  DescribePrefixListAttributesRequest
     * @return DescribePrefixListAttributesResponse
     */
    CompletableFuture<DescribePrefixListAttributesResponse> describePrefixListAttributes(DescribePrefixListAttributesRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>You can specify the <code>AddressFamily</code>, <code>PrefixListId.N</code>, and <code>PrefixListName</code> request parameters to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.</p>
     * 
     * @param request the request parameters of DescribePrefixLists  DescribePrefixListsRequest
     * @return DescribePrefixListsResponse
     */
    CompletableFuture<DescribePrefixListsResponse> describePrefixLists(DescribePrefixListsRequest request);

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Usage notes</h1>
     * <ul>
     * <li>The required parameters vary based on the types of resources whose prices you want to query.<ul>
     * <li>When <code>ResourceType</code> is set to instance, you must specify <code>InstanceType</code>.</li>
     * <li>When <code>ResourceType</code> is set to disk, you must specify both <code>DataDisk.1.Category</code> and <code>DataDisk.1.Size</code>. When <code>ResourceType</code> is set to disk, only pay-as-you-go prices of cloud disks are returned. In this scenario, <code>PriceUnit</code> can be set only to <code>Hour</code>.</li>
     * <li>When <code>ResourceType</code> is set to ddh, you must specify <code>DedicatedHostType</code>.</li>
     * <li>When <code>ResourceType</code> is set to ElasticityAssurance, you must specify <code>InstanceType</code>.</li>
     * <li>When <code>ResourceType</code> is set to CapacityReservation, you must specify <code>InstanceType</code>.</li>
     * </ul>
     * </li>
     * <li>When <code>ResourceType</code> is set to bandwidth, only the pay-by-traffic (<code>PayByTraffic</code>) price for network usage is returned.</li>
     * <li>When <code>ResourceType</code> is set to instance, the prices of up to four data disks can be queried.</li>
     * <li>By default, <code>ChargeType</code> is set to <code>PostPaid</code>. You can specify <code>PriceUnit</code> to query prices of ECS resources that have different billing cycles.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
     */
    CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request);

    /**
     * @param request the request parameters of DescribeRecommendInstanceType  DescribeRecommendInstanceTypeRequest
     * @return DescribeRecommendInstanceTypeResponse
     */
    CompletableFuture<DescribeRecommendInstanceTypeResponse> describeRecommendInstanceType(DescribeRecommendInstanceTypeRequest request);

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the price for renewing a subscription instance for a specific period of time or to a synchronized expiration date.</p>
     * <ul>
     * <li>Take note of the following items:<ul>
     * <li>If you specify only the required parameters, the price for renewing an instance for one month is queried by default.</li>
     * <li>The renewal period-related parameter pair (<code>Period</code> and <code>PeriodUnit</code>) and the synchronized expiration date-related parameter (<code>ExpectedRenewDay</code>) are mutually exclusive. You cannot set these parameters together to query the prices for renewing a specified instance for a period of time and to a synchronized expiration date at the same time.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRenewalPrice  DescribeRenewalPriceRequest
     * @return DescribeRenewalPriceResponse
     */
    CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request);

    /**
     * @param request the request parameters of DescribeReservedInstanceAutoRenewAttribute  DescribeReservedInstanceAutoRenewAttributeRequest
     * @return DescribeReservedInstanceAutoRenewAttributeResponse
     */
    CompletableFuture<DescribeReservedInstanceAutoRenewAttributeResponse> describeReservedInstanceAutoRenewAttribute(DescribeReservedInstanceAutoRenewAttributeRequest request);

    /**
     * @param request the request parameters of DescribeReservedInstances  DescribeReservedInstancesRequest
     * @return DescribeReservedInstancesResponse
     */
    CompletableFuture<DescribeReservedInstancesResponse> describeReservedInstances(DescribeReservedInstancesRequest request);

    /**
     * @param request the request parameters of DescribeResourceByTags  DescribeResourceByTagsRequest
     * @return DescribeResourceByTagsResponse
     */
    CompletableFuture<DescribeResourceByTagsResponse> describeResourceByTags(DescribeResourceByTagsRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Ecs%5C&api=DescribeResourcesModification%5C&type=RPC%5C&version=2014-05-26">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of DescribeResourcesModification  DescribeResourcesModificationRequest
     * @return DescribeResourcesModificationResponse
     */
    CompletableFuture<DescribeResourcesModificationResponse> describeResourcesModification(DescribeResourcesModificationRequest request);

    /**
     * @deprecated OpenAPI DescribeRouteTables is deprecated  * @param request  the request parameters of DescribeRouteTables  DescribeRouteTablesRequest
     * @return DescribeRouteTablesResponse
     */
    @Deprecated
    CompletableFuture<DescribeRouteTablesResponse> describeRouteTables(DescribeRouteTablesRequest request);

    /**
     * @deprecated OpenAPI DescribeRouterInterfaces is deprecated  * @param request  the request parameters of DescribeRouterInterfaces  DescribeRouterInterfacesRequest
     * @return DescribeRouterInterfacesResponse
     */
    @Deprecated
    CompletableFuture<DescribeRouterInterfacesResponse> describeRouterInterfaces(DescribeRouterInterfacesRequest request);

    /**
     * @param request the request parameters of DescribeSavingsPlanEstimation  DescribeSavingsPlanEstimationRequest
     * @return DescribeSavingsPlanEstimationResponse
     */
    CompletableFuture<DescribeSavingsPlanEstimationResponse> describeSavingsPlanEstimation(DescribeSavingsPlanEstimationRequest request);

    /**
     * @param request the request parameters of DescribeSavingsPlanPrice  DescribeSavingsPlanPriceRequest
     * @return DescribeSavingsPlanPriceResponse
     */
    CompletableFuture<DescribeSavingsPlanPriceResponse> describeSavingsPlanPrice(DescribeSavingsPlanPriceRequest request);

    /**
     * @param request the request parameters of DescribeSecurityGroupAttribute  DescribeSecurityGroupAttributeRequest
     * @return DescribeSecurityGroupAttributeResponse
     */
    CompletableFuture<DescribeSecurityGroupAttributeResponse> describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>A security group can be referenced by the inbound or outbound rules of other security groups.</li>
     * <li>Up to 100 entries can be returned each time.</li>
     * <li>If a security group cannot be deleted by calling the <a href="https://help.aliyun.com/document_detail/25558.html">DeleteSecurityGroup</a> operation, you can call the DescribeSecurityGroupReferences operation to check whether the security group is referenced by the rules of other security groups. If the security group is referenced by the rules of other security groups, you must remove the reference before you can delete the security group.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityGroupReferences  DescribeSecurityGroupReferencesRequest
     * @return DescribeSecurityGroupReferencesResponse
     */
    CompletableFuture<DescribeSecurityGroupReferencesResponse> describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The basic information about security groups includes their IDs and descriptions. The response returns security groups in descending order of the IDs of the security groups.</li>
     * <li>We recommend that you use <code>MaxResults</code> and <code>NextToken</code> for a paged query. We recommend that you use <code>MaxResults</code> to specify the maximum number of entries to return for each request. The return value of <code>NextToken</code> is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeSecurityGroups operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value that is returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call. If the return value of <code>NextToken</code> is empty, the current page of results is the last page and no more results are to be returned.</li>
     * <li>When you use Alibaba Cloud CLI to call an API operation, you must specify request parameter values of different data types in required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityGroups  DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     */
    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes:</h2>
     * <ul>
     * <li>When you send a file, the file may fail to be sent to specific Elastic Compute Service (ECS) instances. You can call this operation to check the file sending results.</li>
     * <li>You can call this operation to query the file sending records within the last six weeks.</li>
     * <li>You can use one of the following methods to check the responses:<ul>
     * <li>Method 1: During a paged query, when you call the DescribeSendFileResults operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token, which can be used in the next request to retrieve a new page of results. When you call the DescribeSendFileResults operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
     * <li>Method 2: Use <code>PageSize</code> to specify the number of entries to return on each page and then use <code>PageNumber</code> to specify the number of the page to return. You can use only one of the preceding methods. If you specify <code>MaxResults</code> or <code>NextToken</code>, the <code>PageSize</code> and <code>PageNumber</code> request parameters do not take effect and the <code>TotalCount</code> response parameter is invalid.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSendFileResults  DescribeSendFileResultsRequest
     * @return DescribeSendFileResultsResponse
     */
    CompletableFuture<DescribeSendFileResultsResponse> describeSendFileResults(DescribeSendFileResultsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can specify multiple request parameters to be queried, such as <code>InstanceId</code>, <code>SnapshotGroupId.N</code>, and <code>Status.N</code>. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.</p>
     * 
     * @param request the request parameters of DescribeSnapshotGroups  DescribeSnapshotGroupsRequest
     * @return DescribeSnapshotGroupsResponse
     */
    CompletableFuture<DescribeSnapshotGroupsResponse> describeSnapshotGroups(DescribeSnapshotGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>You can specify multiple request parameters, such as <code>RegionId</code>, <code>DiskIds</code>, and <code>InstanceId</code>, to query snapshot chains. Specified parameters have logical AND relations.</li>
     * <li>Only the specified parameters are used as filter conditions. If the <code>DiskIds</code> and <code>SnapshotLinkIds</code> parameters are set to empty JSON arrays, the values are considered as valid filter conditions. In this case, an empty result is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSnapshotLinks  DescribeSnapshotLinksRequest
     * @return DescribeSnapshotLinksResponse
     */
    CompletableFuture<DescribeSnapshotLinksResponse> describeSnapshotLinks(DescribeSnapshotLinksRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>Up to 400 monitoring data entries can be returned at a time. Make sure that the <code>TotalCount</code> value does not exceed 400. The value is calculated by using the following formula: <code>TotalCount = (EndTime - StartTime)/Period</code>. If the TotalCount value is greater than 400, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.</li>
     * <li>You can query the monitoring data of snapshot sizes in the last 30 days. If the value of <code>StartTime</code> is more than 30 days earlier than the current time, an error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSnapshotMonitorData  DescribeSnapshotMonitorDataRequest
     * @return DescribeSnapshotMonitorDataResponse
     */
    CompletableFuture<DescribeSnapshotMonitorDataResponse> describeSnapshotMonitorData(DescribeSnapshotMonitorDataRequest request);

    /**
     * @param request the request parameters of DescribeSnapshotPackage  DescribeSnapshotPackageRequest
     * @return DescribeSnapshotPackageResponse
     */
    CompletableFuture<DescribeSnapshotPackageResponse> describeSnapshotPackage(DescribeSnapshotPackageRequest request);

    /**
     * <b>description</b> :
     * <p>You can configure multiple request parameters such as <code>InstanceId</code>, <code>DiskId</code>, and <code>SnapshotIds</code> to query snapshots. Configured parameters have logical AND relations. Only the configured parameters are included in the filter conditions.
     * When you use Alibaba Cloud CLI to call an API operation, you must specify request parameter values of different data types in required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</p>
     * 
     * @param request the request parameters of DescribeSnapshots  DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>If you want to view the snapshot usage of each disk in the current region, we recommend that you call the <a href="https://help.aliyun.com/document_detail/55837.html">DescribeSnapshotLinks</a> operation to query snapshot chain information.</p>
     * 
     * @param request the request parameters of DescribeSnapshotsUsage  DescribeSnapshotsUsageRequest
     * @return DescribeSnapshotsUsageResponse
     */
    CompletableFuture<DescribeSnapshotsUsageResponse> describeSnapshotsUsage(DescribeSnapshotsUsageRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>You can call this operation to query information about preemptible instances in the previous 30 days and select suitable instance types based on the query results. The information that you can query includes:<ul>
     * <li>Average release rate of preemptible instances</li>
     * <li>Percentage of the average preemptible instance price relative to the pay-as-you-go instance price</li>
     * <li>Average preemptible instance price that is calculated based on the preceding percentage</li>
     * </ul>
     * </li>
     * <li>This operation is applicable only to I/O optimized preemptible instances that reside in virtual private clouds (VPCs).</li>
     * <li>You can use one of the following methods to query information about preemptible instances in the previous 30 days:<ul>
     * <li>Configure the <code>Cores</code> and <code>Memory</code> parameters or the <code>MinCores</code> and <code>MinMemory</code> parameters to query information about instance types that meet the specified vCPU and memory requirements.</li>
     * <li>Configure the <code>InstanceTypes.N</code> parameter to query information about specified instance types.</li>
     * <li>Configure the <code>Cores</code> and <code>Memory</code> parameters or the <code>MinCores</code> and <code>MinMemory</code> parameters and then configure the <code>InstanceTypeFamily</code> or <code>InstanceFamilyLevel</code> parameter to query information about instance types that meet the specified vCPU and memory requirements within the specified instance family or at a specified instance family level.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSpotAdvice  DescribeSpotAdviceRequest
     * @return DescribeSpotAdviceResponse
     */
    CompletableFuture<DescribeSpotAdviceResponse> describeSpotAdvice(DescribeSpotAdviceRequest request);

    /**
     * @param request the request parameters of DescribeSpotPriceHistory  DescribeSpotPriceHistoryRequest
     * @return DescribeSpotPriceHistoryResponse
     */
    CompletableFuture<DescribeSpotPriceHistoryResponse> describeSpotPriceHistory(DescribeSpotPriceHistoryRequest request);

    /**
     * @param request the request parameters of DescribeStorageCapacityUnits  DescribeStorageCapacityUnitsRequest
     * @return DescribeStorageCapacityUnitsResponse
     */
    CompletableFuture<DescribeStorageCapacityUnitsResponse> describeStorageCapacityUnits(DescribeStorageCapacityUnitsRequest request);

    /**
     * @param request the request parameters of DescribeStorageSetDetails  DescribeStorageSetDetailsRequest
     * @return DescribeStorageSetDetailsResponse
     */
    CompletableFuture<DescribeStorageSetDetailsResponse> describeStorageSetDetails(DescribeStorageSetDetailsRequest request);

    /**
     * @param request the request parameters of DescribeStorageSets  DescribeStorageSetsRequest
     * @return DescribeStorageSetsResponse
     */
    CompletableFuture<DescribeStorageSetsResponse> describeStorageSets(DescribeStorageSetsRequest request);

    /**
     * <b>description</b> :
     * <p>If a tag key that has no tag value is specified, all tags that contain the tag key are returned. If a tag key-value pair is specified, only tags that exactly match the key-value pair are returned.</p>
     * 
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
     * @param request the request parameters of DescribeTaskAttribute  DescribeTaskAttributeRequest
     * @return DescribeTaskAttributeResponse
     */
    CompletableFuture<DescribeTaskAttributeResponse> describeTaskAttribute(DescribeTaskAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Ecs%5C&api=DescribeTasks%5C&type=RPC%5C&version=2014-05-26">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the session records of Session Manager that were generated in the last four weeks.</p>
     * 
     * @param request the request parameters of DescribeTerminalSessions  DescribeTerminalSessionsRequest
     * @return DescribeTerminalSessionsResponse
     */
    CompletableFuture<DescribeTerminalSessionsResponse> describeTerminalSessions(DescribeTerminalSessionsRequest request);

    /**
     * @deprecated OpenAPI DescribeUserBusinessBehavior is deprecated  * @param request  the request parameters of DescribeUserBusinessBehavior  DescribeUserBusinessBehaviorRequest
     * @return DescribeUserBusinessBehaviorResponse
     */
    @Deprecated
    CompletableFuture<DescribeUserBusinessBehaviorResponse> describeUserBusinessBehavior(DescribeUserBusinessBehaviorRequest request);

    /**
     * <b>description</b> :
     * <p>  The returned custom data is encoded in Base64.</p>
     * <ul>
     * <li>If no user data is configured for the ECS instance, an empty result is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeUserData  DescribeUserDataRequest
     * @return DescribeUserDataResponse
     */
    CompletableFuture<DescribeUserDataResponse> describeUserData(DescribeUserDataRequest request);

    /**
     * @deprecated OpenAPI DescribeVRouters is deprecated  * @param request  the request parameters of DescribeVRouters  DescribeVRoutersRequest
     * @return DescribeVRoutersResponse
     */
    @Deprecated
    CompletableFuture<DescribeVRoutersResponse> describeVRouters(DescribeVRoutersRequest request);

    /**
     * @deprecated OpenAPI DescribeVSwitches is deprecated  * @param request  the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    @Deprecated
    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
     * @deprecated OpenAPI DescribeVirtualBorderRouters is deprecated  * @param request  the request parameters of DescribeVirtualBorderRouters  DescribeVirtualBorderRoutersRequest
     * @return DescribeVirtualBorderRoutersResponse
     */
    @Deprecated
    CompletableFuture<DescribeVirtualBorderRoutersResponse> describeVirtualBorderRouters(DescribeVirtualBorderRoutersRequest request);

    /**
     * @deprecated OpenAPI DescribeVirtualBorderRoutersForPhysicalConnection is deprecated  * @param request  the request parameters of DescribeVirtualBorderRoutersForPhysicalConnection  DescribeVirtualBorderRoutersForPhysicalConnectionRequest
     * @return DescribeVirtualBorderRoutersForPhysicalConnectionResponse
     */
    @Deprecated
    CompletableFuture<DescribeVirtualBorderRoutersForPhysicalConnectionResponse> describeVirtualBorderRoutersForPhysicalConnection(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request);

    /**
     * @deprecated OpenAPI DescribeVpcs is deprecated, please use Vpc::2016-04-28::DescribeVpcs instead.  * @param request  the request parameters of DescribeVpcs  DescribeVpcsRequest
     * @return DescribeVpcsResponse
     */
    @Deprecated
    CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, only a list of zones and some resource information of each zone are returned. If you want to query instance types and disk categories that are available for purchase in a specific zone, we recommend that you call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation.</p>
     * 
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * @param request the request parameters of DetachClassicLinkVpc  DetachClassicLinkVpcRequest
     * @return DetachClassicLinkVpcResponse
     */
    CompletableFuture<DetachClassicLinkVpcResponse> detachClassicLinkVpc(DetachClassicLinkVpcRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The disk that you want to detach must be attached to an ECS instance and in the In Use (<code>In_use</code>) state.</li>
     * <li>The instance from which you want to detach a data disk must be in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>The instance from which you want to detach a system disk must be in the <strong>Stopped</strong> state.``</li>
     * <li>If the <code>OperationLocks</code> parameter in the response contains <code>&quot;LockReason&quot; : &quot;security&quot;</code> when you query the instance information, the instance is locked for security reasons and all operations are prohibited on the instance.</li>
     * <li>DetachDisk is an asynchronous operation. After you call the operation to detach a disk from an ECS instance, the disk is detached in approximately 1 minute.</li>
     * <li>If you want to attach an elastic ephemeral disk that you detached from an instance, you can attach the disk only to the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachDisk  DetachDiskRequest
     * @return DetachDiskResponse
     */
    CompletableFuture<DetachDiskResponse> detachDisk(DetachDiskRequest request);

    /**
     * @param request the request parameters of DetachInstanceRamRole  DetachInstanceRamRoleRequest
     * @return DetachInstanceRamRoleResponse
     */
    CompletableFuture<DetachInstanceRamRoleResponse> detachInstanceRamRole(DetachInstanceRamRoleRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>After you unbind an SSH key pair from an instance, you must call the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation to restart the instance to allow the unbind operation to take effect.</li>
     * <li>After you unbind an SSH key pair from an instance, the username and password authentication method is selected for the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachKeyPair  DetachKeyPairRequest
     * @return DetachKeyPairResponse
     */
    CompletableFuture<DetachKeyPairResponse> detachKeyPair(DetachKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>You cannot detach the primary ENI of an instance.</li>
     * <li>Make sure that the ENI to be detached is in the Detaching (Unbinding) or InUse (Bound) state.</li>
     * <li>Make sure that the instance from which you want to detach an ENI is in the Running (Running) or Stopped (Stopped) state.</li>
     * <li>The DetachNetworkInterface operation is an asynchronous operation. After this operation is called to detach an ENI, you can check the status or events of the ENI to determine whether the ENI is detached. The following figure shows the transitions between the states of the ENI.<img src="https://help-static-aliyun-doc.aliyuncs.com/file-manage-files/en-US/20230223/uemr/DetachNetworkInterface.png" alt=""><ul>
     * <li>If the ENI is in the Detaching state, the ENI detachment request is sent and the ENI is being detached from the associated instance.</li>
     * <li>If the ENI is in the Available state, the ENI is detached from the associated instance.</li>
     * <li>If the ENI is stuck in the Detaching state, the ENI may fail to be detached from the associated instance due to specific reasons. For example, the ENI may fail to be detached because the operating system of the instance did not respond to the ENI detachment request. If this issue occurs, you can re-initiate the request to detach the ENI. If the issue persists, restart the instance.
     * For information about examples on how to call the DetachNetworkInterface operation, see <a href="https://help.aliyun.com/document_detail/471551.html">Detach an ENI from an ECS instance</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DetachNetworkInterface  DetachNetworkInterfaceRequest
     * @return DetachNetworkInterfaceResponse
     */
    CompletableFuture<DetachNetworkInterfaceResponse> detachNetworkInterface(DetachNetworkInterfaceRequest request);

    /**
     * <b>description</b> :
     * <p>The region ID. The following regions are supported: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), China (Shanghai), China (Shenzhen), China (Heyuan), and China (Hong Kong).
     * You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * @param request the request parameters of DisableActivation  DisableActivationRequest
     * @return DisableActivationResponse
     */
    CompletableFuture<DisableActivationResponse> disableActivation(DisableActivationRequest request);

    /**
     * <b>description</b> :
     * <p>You can use only an Alibaba Cloud account to call this operation.</p>
     * 
     * @param request the request parameters of DisableDiskEncryptionByDefault  DisableDiskEncryptionByDefaultRequest
     * @return DisableDiskEncryptionByDefaultResponse
     */
    CompletableFuture<DisableDiskEncryptionByDefaultResponse> disableDiskEncryptionByDefault(DisableDiskEncryptionByDefaultRequest request);

    /**
     * @deprecated OpenAPI EipFillParams is deprecated  * @param request  the request parameters of EipFillParams  EipFillParamsRequest
     * @return EipFillParamsResponse
     */
    @Deprecated
    CompletableFuture<EipFillParamsResponse> eipFillParams(EipFillParamsRequest request);

    /**
     * @deprecated OpenAPI EipFillProduct is deprecated  * @param request  the request parameters of EipFillProduct  EipFillProductRequest
     * @return EipFillProductResponse
     */
    @Deprecated
    CompletableFuture<EipFillProductResponse> eipFillProduct(EipFillProductRequest request);

    /**
     * @deprecated OpenAPI EipNotifyPaid is deprecated  * @param request  the request parameters of EipNotifyPaid  EipNotifyPaidRequest
     * @return EipNotifyPaidResponse
     */
    @Deprecated
    CompletableFuture<EipNotifyPaidResponse> eipNotifyPaid(EipNotifyPaidRequest request);

    /**
     * <b>description</b> :
     * <p>  You can use only an Alibaba Cloud account to call the EnableDiskEncryptionByDefault operation.</p>
     * <ul>
     * <li>Before you call the EnableDiskEncryptionByDefault operation, you must activate KMS.</li>
     * <li>After you enable the account-level default encryption feature of EBS resources, you can purchase only encrypted cloud disks. For more information, see the <a href="https://help.aliyun.com/zh/ecs/user-guide/encryption-overview?#59e20ff07fko1">Limits</a> section of the &quot;Encrypt cloud disks&quot; topic.</li>
     * </ul>
     * 
     * @param request the request parameters of EnableDiskEncryptionByDefault  EnableDiskEncryptionByDefaultRequest
     * @return EnableDiskEncryptionByDefaultResponse
     */
    CompletableFuture<EnableDiskEncryptionByDefaultResponse> enableDiskEncryptionByDefault(EnableDiskEncryptionByDefaultRequest request);

    /**
     * @deprecated OpenAPI EnablePhysicalConnection is deprecated  * @param request  the request parameters of EnablePhysicalConnection  EnablePhysicalConnectionRequest
     * @return EnablePhysicalConnectionResponse
     */
    @Deprecated
    CompletableFuture<EnablePhysicalConnectionResponse> enablePhysicalConnection(EnablePhysicalConnectionRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you export images, take note of the following items:</p>
     * <ul>
     * <li>Make sure that you are familiar with the prerequisites and considerations. For more information, see <a href="https://help.aliyun.com/document_detail/58181.html">Export a custom image</a>.</li>
     * <li>The <code>ImageFormat</code> parameter is available only for the following regions: Japan (Tokyo), Australia (Sydney) Closing Down, Indonesia (Jakarta), Germany (Frankfurt), UAE (Dubai), US (Virginia), UK (London), Singapore, Malaysia (Kuala Lumpur), and US (Silicon Valley). Alibaba Cloud services will be discontinued in the India (Mumbai) region. By default, custom images are exported in the RAW format in regions where the ImageFormat parameter is unsupported.</li>
     * <li>Use Resource Access Management (RAM) to authorize Elastic Compute Service (ECS) to write data to OSS. To complete the authorization, perform the following operations:<ul>
     * <li>Create a role named <code>AliyunECSImageExportDefaultRole</code> and attach the following policy to the role:
     *    {
     *      &quot;Statement&quot;: [
     *        {
     *          &quot;Action&quot;: &quot;sts:AssumeRole&quot;,
     *          &quot;Effect&quot;: &quot;Allow&quot;,
     *          &quot;Principal&quot;: {
     *            &quot;Service&quot;: [
     *              &quot;ecs.aliyuncs.com&quot;
     *            ]
     *          }
     *        }
     *      ],
     *      &quot;Version&quot;: &quot;1&quot;
     *    }</li>
     * <li>Attach the <code>AliyunECSImageExportRolePolicy</code> system policy, which is the default policy that grants ECS the permissions to export images, to the <code>AliyunECSImageExportDefaultRole</code> role. For more information, go to the <a href="https://ram.console.aliyun.com/?spm=5176.2020520101.0.0.64c64df5dfpmdY#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunECSImageImportDefaultRole%22,%20%22TemplateId%22:%20%22ECSImportRole%22%7D,%20%22request2%22:%20%7B%22RoleName%22:%20%22AliyunECSImageExportDefaultRole%22,%20%22TemplateId%22:%20%22ECSExportRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fecs.console.aliyun.com%2F%22,%20%22Service%22:%20%22ECS%22%7D">Cloud Resource Access Authorization</a> page. You can also create a custom policy that contains the following content and attach the policy to the role:
     *      {
     *        &quot;Version&quot;: &quot;1&quot;,
     *        &quot;Statement&quot;: [
     *          {
     *            &quot;Action&quot;: [
     *              &quot;oss:GetObject&quot;,
     *              &quot;oss:PutObject&quot;,
     *              &quot;oss:DeleteObject&quot;,
     *              &quot;oss:GetBucketLocation&quot;,
     *              &quot;oss:GetBucketInfo&quot;,
     *              &quot;oss:AbortMultipartUpload&quot;,
     *              &quot;oss:ListMultipartUploads&quot;,
     *              &quot;oss:ListParts&quot;
     *            ],
     *            &quot;Resource&quot;: &quot;*&quot;,
     *            &quot;Effect&quot;: &quot;Allow&quot;
     *          }
     *        ]
     *      }</li>
     * </ul>
     * </li>
     * </ul>
     * <p>After you export the images, take note of the following items:
     * Each exported custom image is stored in the specified OSS bucket. You can download the custom image. For more information, see <a href="https://help.aliyun.com/document_detail/31912.html">Download objects</a>.</p>
     * 
     * @param request the request parameters of ExportImage  ExportImageRequest
     * @return ExportImageResponse
     */
    CompletableFuture<ExportImageResponse> exportImage(ExportImageRequest request);

    /**
     * @deprecated OpenAPI ExportSnapshot is deprecated  * @param request  the request parameters of ExportSnapshot  ExportSnapshotRequest
     * @return ExportSnapshotResponse
     */
    @Deprecated
    CompletableFuture<ExportSnapshotResponse> exportSnapshot(ExportSnapshotRequest request);

    /**
     * <b>description</b> :
     * <p>  ECS is a virtualized cloud-based service and cannot be connected to display devices. Alibaba Cloud caches system command outputs for the last start, restart, or shutdown of ECS instances. You can call the GetInstanceConsoleOutput operation to query the command outputs.</p>
     * <ul>
     * <li>For instances of the retired instance types, you cannot obtain command outputs. For more information, see <a href="https://help.aliyun.com/document_detail/55263.html">Retired instance types</a>.</li>
     * <li>You cannot obtain the command outputs of Windows instances.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceConsoleOutput  GetInstanceConsoleOutputRequest
     * @return GetInstanceConsoleOutputResponse
     */
    CompletableFuture<GetInstanceConsoleOutputResponse> getInstanceConsoleOutput(GetInstanceConsoleOutputRequest request);

    /**
     * <b>description</b> :
     * <p>After ECS returns a Base64-encoded instance screenshot in the JPG format, you must decode the screenshot. We recommend that you call this operation for troubleshooting and diagnosis. When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The instance must be in the Running state.</li>
     * <li>For instances of the retired instance types, you cannot obtain screenshots. For more information, see <a href="https://help.aliyun.com/document_detail/55263.html">Retired instance types</a>.</li>
     * <li>If you call this operation on an instance for multiple times, the call interval must be at least 10 seconds. Otherwise, the <code>Throttling</code> error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceScreenshot  GetInstanceScreenshotRequest
     * @return GetInstanceScreenshotResponse
     */
    CompletableFuture<GetInstanceScreenshotResponse> getInstanceScreenshot(GetInstanceScreenshotRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>Before you import an image, you must upload the image to an Object Storage Service (OSS) bucket. For more information, see <a href="https://help.aliyun.com/document_detail/31886.html">Upload objects</a>.</li>
     * <li>In specific scenarios, you may want to create a custom image based on the operating system data of a source server, import the image to Alibaba Cloud, and then create an ECS instance from the image. The source server can be a physical server, a virtual machine, or a cloud host. If the virtio driver is not installed on the source server, the created ECS instance may be unable to start. To prevent this issue, verify that the virtio driver is installed on the source server before you import the image to Alibaba Cloud. For more information, see <a href="https://help.aliyun.com/document_detail/62423.html">Install the virtio driver</a>.</li>
     * <li>Before you import images for the first time, you must use Resource Access Management (RAM) to authorize ECS to access your OSS buckets. If ECS is not authorized to access your OSS buckets, the <code>NoSetRoletoECSServiceAccount</code> or <code>InvalidOperation.CloudBoxImageImportRoleRequired</code> error code is returned when you call the ImportImage operation. The authorization configuration varies based on whether the image files are imported from a cloud box.<ul>
     * <li><strong>If the image files are not imported from a cloud box</strong>, you can complete the authorization on the <a href="https://ram.console.aliyun.com/?spm=5176.2020520101image.0.0.2ffa4df57kSoHX#/role/authorize?request=%7B%22Requests%22%3A%20%7B%22request1%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageImportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSImportRole%22%7D%2C%20%22request2%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageExportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSExportRole%22%7D%7D%2C%20%22ReturnUrl%22%3A%20%22https%3A//ecs.console.aliyun.com/%22%2C%20%22Service%22%3A%20%22ECS%22%7D">Cloud Resource Access Authorization</a> page of the RAM console. You can also complete the authorization by using a RAM role and RAM policies. The following example shows the policies and permissions required for specific steps in the authorization procedure. For more information, see <a href="https://help.aliyun.com/document_detail/25481.html">Control access to ECS resources by using RAM users</a>.<ol>
     * <li>Create a RAM role named <code>AliyunECSImageImportDefaultRole</code>. You must use this exact role name. Otherwise, the image cannot be imported. Configure the following trust policy for the role:
     * {
     *     &quot;Statement&quot;: [
     *     {
     *         &quot;Action&quot;: &quot;sts:AssumeRole&quot;,
     *         &quot;Effect&quot;: &quot;Allow&quot;,
     *         &quot;Principal&quot;: {
     *         &quot;Service&quot;: [
     *             &quot;ecs.aliyuncs.com&quot;
     *         ]
     *         }
     *     }
     * ],
     *     &quot;Version&quot;: &quot;1&quot;
     * }</li>
     * <li>Attach the <code>AliyunECSImageImportRolePolicy</code> system policy to the RAM role. You can also create a custom policy that contains the following content and attach the policy to the role:<pre><code>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *     {
     *         &quot;Action&quot;: [
     *                 &quot;oss:GetObject&quot;,
     *                 &quot;oss:GetBucketLocation&quot;,
     *                 &quot;oss:GetBucketInfo&quot;
     *     ],
     *             &quot;Resource&quot;: &quot;*&quot;,
     *             &quot;Effect&quot;: &quot;Allow&quot;
     *             }
     *     ]
     * }
     * </code></pre>
     * </li>
     * </ol>
     * </li>
     * <li><strong>If the image files are imported from a cloud box</strong>, you can complete the authorization on the <a href="https://ram.console.aliyun.com/role/authorize?request=%7B%22ReturnUrl%22%3A%22https%3A%2F%2Fecs.console.aliyun.com%2F%22%2C%22Services%22%3A%5B%7B%22Roles%22%3A%5B%7B%22RoleName%22%3A%22AliyunECSCloudBoxImageImportDefaultRole%22%2C%22TemplateId%22%3A%22AliyunECSCloudBoxImageImportDefaultRole%22%7D%5D%2C%22Service%22%3A%22ECS%22%7D%5D%7D">Cloud Resource Access Authorization</a> page of the RAM console. You can also complete the authorization by using a RAM role and RAM policies. The following example shows the policies and permissions required for specific steps in the authorization procedure. For more information, see <a href="https://help.aliyun.com/document_detail/25481.html">Control access to ECS resources by using RAM users</a>.<ol>
     * <li>Create a RAM role named <code>AliyunECSCloudBoxImageImportDefaultRole</code>. You must use this exact role name. Otherwise, the image cannot be imported. Configure the following trust policy for the role:
     * {
     *     &quot;Statement&quot;: [
     *     {
     *         &quot;Action&quot;: &quot;sts:AssumeRole&quot;,
     *         &quot;Effect&quot;: &quot;Allow&quot;,
     *         &quot;Principal&quot;: {
     *         &quot;Service&quot;: [
     *             &quot;ecs.aliyuncs.com&quot;
     *         ]
     *         }
     *     }
     * ],
     *     &quot;Version&quot;: &quot;1&quot;
     * }</li>
     * <li>Attach the <code>AliyunECSCloudBoxImageImportRolePolicy</code> system policy to the RAM role. You can also create a custom policy that contains the following content and attach the policy to the role:<pre><code>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *     {
     *         &quot;Action&quot;: [
     *                 &quot;oss-cloudbox:GetObject&quot;,
     *                 &quot;oss-cloudbox:GetBucketLocation&quot;,
     *                 &quot;oss-cloudbox:GetBucketInfo&quot;
     *     ],
     *             &quot;Resource&quot;: &quot;*&quot;,
     *             &quot;Effect&quot;: &quot;Allow&quot;
     *             }
     *     ]
     * }
     * </code></pre>
     * </li>
     * </ol>
     * </li>
     * </ul>
     * </li>
     * <li>You cannot delete an image that is being imported. However, you can call the <a href="https://help.aliyun.com/document_detail/25624.html">CancelTask</a> operation to cancel the image import task.</li>
     * <li>You can import an image only to the same region as the OSS bucket to which the image file is uploaded.</li>
     * <li>The valid values of N in <code>DiskDeviceMapping.N</code> range from 1 to 17. When N is set to 1, the disk is a system disk. When N is set to a value from 2 to 17, the disk is a data disk. When N is set to a value greater than 17, parameters prefixed with DiskDeviceMapping.N are ignored.</li>
     * <li>When you set <code>Architecture</code> to <code>arm64</code> or when you set <code>Platform</code> to <code>CentOS Stream</code>, <code>Anolis</code>, <code>AlmaLinux</code>, <code>UOS</code>, <code>Kylin</code>, or <code>Rocky Linux</code>, take note of the following items:<ul>
     * <li>To ensure that the password can be set or the key pair can be modified for an imported image, make sure that the image meets the following requirements before you import it:<ul>
     * <li>The kernel of the operating system supports the <code>CONFIG_FW_CFG_SYSFS</code> feature. By default, Linux community kernel 4.6 and later and CentOS kernel 3.10.0-826.el7 and later support the CONFIG_FW_CFG_SYSFS feature. You can run the <code>grep -nr CONFIG_FW_CFG_SYSFS /boot/config-$(uname -r)</code> command on the source server of the image. If the command output contains <code>CONFIG_FW_CFG_SYSFS=y</code>, the kernel of the image supports the <code>CONFIG_FW_CFG_SYSFS</code> feature.</li>
     * <li>Alibaba Cloud cloud-init of the latest version is installed on the operating system. If the version of cloud-init is 19.1, the minor version must be 19.1.3 or later. If the version of cloud-init is 0.7.6a in some early versions of operating systems, the minor version must be 0.7.6a15 or later. For more information, see <a href="https://help.aliyun.com/document_detail/57803.html">Install cloud-init</a>.</li>
     * <li>The operating system supports the SHA-512 encryption algorithm.</li>
     * </ul>
     * </li>
     * <li>If you want an imported image to support the resizing of disks and file systems, make sure that the image meets the following requirements before you import it:<ul>
     * <li>The kernel version of the operating system is later than 3.6.</li>
     * <li>The image supports the growpart command. To support this command, you must install the <code>cloud-utils-growpart</code> package. The methods of installing the package vary based on operating systems. For more information, see <a href="https://help.aliyun.com/document_detail/25451.html">Extend the partitions and file systems of disks on a Linux instance</a>.</li>
     * <li>The image supports the resize2fs command. To support this command, you must install the <code>e2fsprogs</code> package. By default, the package is installed on the operating system. If the package is not installed, install it.</li>
     * <li>Alibaba Cloud cloud-init of the latest version is installed on the operating system. If the version of cloud-init is 19.1, the minor version must be 19.1.3 or later. If the version of cloud-init is 0.7.6a in some early versions of operating systems, the minor version must be 0.7.6a15 or later. For more information, see <a href="https://help.aliyun.com/document_detail/57803.html">Install cloud-init</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>If the image that you want to import uses the Arm64 architecture, configure the real-time clock (RTC) to use the Coordinated Universal Time (UTC) time standard. For more information, see <a href="https://help.aliyun.com/document_detail/405080.html">Linux time and time zones</a>.</li>
     * <li>When you import images, we recommend that you specify DetectionStrategy. This way, you can optimize the images based on the image check results. For more information, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview of image check</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportImage  ImportImageRequest
     * @return ImportImageResponse
     */
    CompletableFuture<ImportImageResponse> importImage(ImportImageRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>A maximum of 500 key pairs can be created in each region.</li>
     * <li>The key pair to be imported must support one of the following encryption methods:<ul>
     * <li>rsa</li>
     * <li>dsa</li>
     * <li>ssh-rsa</li>
     * <li>ssh-dss</li>
     * <li>ecdsa</li>
     * <li><a href="mailto:ssh-rsa-cert-v00@openssh.com">ssh-rsa-cert-v00@openssh.com</a></li>
     * <li><a href="mailto:ssh-dss-cert-v00@openssh.com">ssh-dss-cert-v00@openssh.com</a></li>
     * <li><a href="mailto:ssh-rsa-cert-v01@openssh.com">ssh-rsa-cert-v01@openssh.com</a></li>
     * <li><a href="mailto:ssh-dss-cert-v01@openssh.com">ssh-dss-cert-v01@openssh.com</a></li>
     * <li><a href="mailto:ecdsa-sha2-nistp256-cert-v01@openssh.com">ecdsa-sha2-nistp256-cert-v01@openssh.com</a></li>
     * <li><a href="mailto:ecdsa-sha2-nistp384-cert-v01@openssh.com">ecdsa-sha2-nistp384-cert-v01@openssh.com</a></li>
     * <li><a href="mailto:ecdsa-sha2-nistp521-cert-v01@openssh.com">ecdsa-sha2-nistp521-cert-v01@openssh.com</a></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ImportKeyPair  ImportKeyPairRequest
     * @return ImportKeyPairResponse
     */
    CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>After you call the InstallCloudAssistant operation to install Cloud Assistant Agent on an ECS instance, call the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation to restart the instance to make the installation take effect.</p>
     * 
     * @param request the request parameters of InstallCloudAssistant  InstallCloudAssistantRequest
     * @return InstallCloudAssistantResponse
     */
    CompletableFuture<InstallCloudAssistantResponse> installCloudAssistant(InstallCloudAssistantRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The ECS instances on which you want to run the Cloud Assistant command must meet the following requirements. If multiple ECS instances are specified and one of the instances does not meet the requirements for running the command, the call fails. You must specify instances that meet the requirements and call the InvokeCommand operation again.<ul>
     * <li>The instances are in the Running (<code>Running</code>) state. You can call the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation to query the status of instances.</li>
     * <li>Cloud Assistant Agent is installed on the instances. For more information, see <a href="https://help.aliyun.com/document_detail/64921.html">Install Cloud Assistant Agent</a>.</li>
     * <li>If the command is a PowerShell command, make sure that the instances have the PowerShell module configured.</li>
     * </ul>
     * </li>
     * <li>You can configure the command to run only once on the instances.</li>
     * <li>You can configure the command to run on the instances based on a schedule.<ul>
     * <li>The schedule is specified by Frequency. The results of each execution of the command do not affect the next execution of the command.</li>
     * <li>When you use a cron expression to specify a schedule, you can specify a time zone based on your business requirements. If you do not specify a time zone, the schedule is determined by the system time of the instances. Make sure that the time or time zone of the instances meets your business requirements. For more information, see <a href="https://help.aliyun.com/document_detail/92704.html">Manage the time synchronization service</a>.
     * To ensure that scheduled tasks can run as expected, make sure that the version of Cloud Assistant Agent is not earlier than the following versions. A scheduled task can run a command at a fixed interval, only once at a specific time, or at specific times based on a cron expression in a specified year or time zone. If the ClientNeedUpgrade error code is returned, you must upgrade Cloud Assistant Agent to the latest version. For more information, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.</li>
     * <li>Linux: 2.2.3.282</li>
     * <li>Windows: 2.1.3.282</li>
     * </ul>
     * </li>
     * <li>Command executions may fail due to instance status exceptions, network exceptions, or exceptions on Cloud Assistant Agent. If a command execution fails, no execution information is generated. For more information, see <a href="https://help.aliyun.com/document_detail/87029.html">Check execution results and troubleshoot common issues</a>.</li>
     * <li>If you enable the custom parameter feature when you create the command, you must specify custom parameters (<code>Parameters</code>) to run the command.</li>
     * <li>Before you run the command on instances, especially new instances, we recommend that you call the <a href="https://help.aliyun.com/document_detail/87346.html">DescribeCloudAssistantStatus</a> operation to query the status of Cloud Assistant Agent on the instances and run the command when the value of CloudAssistantStatus in the response is true for the instances.</li>
     * </ul>
     * 
     * @param request the request parameters of InvokeCommand  InvokeCommandRequest
     * @return InvokeCommandResponse
     */
    CompletableFuture<InvokeCommandResponse> invokeCommand(InvokeCommandRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>A resource is a cloud service entity that you create on Alibaba Cloud, such as an ECS instance, an elastic network interface (ENI), or an image. A resource group is a collection of infrastructure for projects, environments, or stacks. In a resource group, you can manage resources and monitor and run tasks in a centralized manner without the need to switch between Alibaba Cloud services.</p>
     * 
     * @param request the request parameters of JoinResourceGroup  JoinResourceGroupRequest
     * @return JoinResourceGroupResponse
     */
    CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <blockquote>
     * <p> This operation is not recommended. We recommend that you call the <a href="https://help.aliyun.com/document_detail/25503.html">ModifyInstanceAttribute</a> operation to add an instance to or remove an instance from a security group, and call the <a href="https://help.aliyun.com/document_detail/58513.html">ModifyNetworkInterfaceAttribute</a> operation to add an ENI to or remove an ENI from a security group.
     * Take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>Before you add an instance to a security group, the instance must be in the <strong>Stopped</strong> (Stopped) or <strong>Running</strong> (Running) state.</li>
     * <li>An instance can be added to up to five security groups by default.</li>
     * <li>You can <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a> to change the maximum number of security groups to which an instance can be added to 4 or 10.</li>
     * <li>A basic security group can contain up to 2,000 instances. An advanced security group can contain up to 65,536 instances.</li>
     * <li>The security group and the instance must reside in the same region.</li>
     * <li>The security group and the instance must be of the same network type. If the network type is Virtual Private Cloud (VPC), the security group and the instance must reside in the same VPC.</li>
     * <li>An instance and an ENI cannot be added to a security group at the same time. You cannot specify <code>InstanceId</code> and <code>NetworkInterfaceId</code> at the same time in a request.
     * For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of JoinSecurityGroup  JoinSecurityGroupRequest
     * @return JoinSecurityGroupResponse
     */
    CompletableFuture<JoinSecurityGroupResponse> joinSecurityGroup(JoinSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>To improve user experience, Alibaba Cloud modified the verification rules for the LeaveSecurityGroup operation on July 8, 2024. When you remove an ECS instance or ENI that does not belong to a security group from the security group, the &quot;InvalidSecurityGroupAssociation.NotFound&quot; error code is returned instead of a success response. Update the LeaveSecurityGroup operation to use the new verification rules with the new error code based on your business requirements.</li>
     * <li>This operation is not recommended. We recommend that you call the <a href="https://help.aliyun.com/document_detail/25503.html">ModifyInstanceAttribute</a> operation to add an ECS instance to or remove an ECS instance from a security group, and call the <a href="https://help.aliyun.com/document_detail/58513.html">ModifyNetworkInterfaceAttribute</a> operation to add an ENI to or remove an ENI from a security group.
     * Take note of the following items:</li>
     * <li>Before you remove an instance from a security group, the instance must be in the <strong>Stopped</strong> (Stopped) or <strong>Running</strong> (Running) state.</li>
     * <li>An instance must belong to at least one security group. Therefore, if the instance to be removed belongs to only one security group, the LeaveSecurityGroup request fails.</li>
     * <li>You cannot remove an instance and an ENI from a security group at the same time. This indicates that you cannot specify <code>InstanceId</code> and <code>NetworkInterfaceId</code> in one request.</li>
     * </ul>
     * 
     * @param request the request parameters of LeaveSecurityGroup  LeaveSecurityGroupRequest
     * @return LeaveSecurityGroupResponse
     */
    CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <ul>
     * <li>Before you call this operation to query the status of Cloud Assistant plug-ins on ECS instances, make sure that the versions of Cloud Assistant Agent on the instances are not earlier than the following ones:<ul>
     * <li>2.2.3.344 for Linux instances</li>
     * <li>2.1.3.344 for Windows instances</li>
     * </ul>
     * </li>
     * <li>You can use one of the following methods to check the responses:<ul>
     * <li>Method 1: When you call the ListPluginStatus operation to retrieve the first page of results during a paged query, use MaxResults to specify the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which you can use in the next request to retrieve a new page of results. When you call the ListPluginStatus operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and use MaxResults to specify the maximum number of entries to return in this call. </li>
     * <li>Method 2: Use PageSize to specify the number of entries to return on each page, and then use PageNumber to specify the number of the page to return. You can use only one of the preceding methods. If you specify MaxResults or NextToken, the PageSize and PageNumber request parameters do not take effect and the TotalCount response parameter is invalid.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListPluginStatus  ListPluginStatusRequest
     * @return ListPluginStatusResponse
     */
    CompletableFuture<ListPluginStatusResponse> listPluginStatus(ListPluginStatusRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Specify at least one of the following parameters or parameter pairs in a request to determine a query object:</p>
     * <ul>
     * <li><code>ResourceId.N</code></li>
     * <li><code>Tag.N</code> parameter pair (<code>Tag.N.Key</code> and <code>Tag.N.Value</code>)</li>
     * <li><code>TagFilter.N</code>
     * If one of the following sets of request parameters is specified as filter conditions, only ECS resources that meet all the specified filter conditions are returned:</li>
     * <li>Set 1: <code>Tag.N.Key, Tag.N.Value</code> and <code>ResourceId.N</code></li>
     * <li>Set 2: <code>TagFilter.N.TagKey, TagFilter.N.TagValues.N</code> and <code>ResourceId.N</code></li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you modify the capacity or capacity-related settings of an auto-provisioning group, the group executes a scheduling task after the group is modified.</li>
     * <li>You cannot modify an auto-provisioning group when the group is being deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAutoProvisioningGroup  ModifyAutoProvisioningGroupRequest
     * @return ModifyAutoProvisioningGroupResponse
     */
    CompletableFuture<ModifyAutoProvisioningGroupResponse> modifyAutoProvisioningGroup(ModifyAutoProvisioningGroupRequest request);

    /**
     * @deprecated OpenAPI ModifyAutoSnapshotPolicy is deprecated  * @param request  the request parameters of ModifyAutoSnapshotPolicy  ModifyAutoSnapshotPolicyRequest
     * @return ModifyAutoSnapshotPolicyResponse
     */
    @Deprecated
    CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request);

    /**
     * @param request the request parameters of ModifyAutoSnapshotPolicyEx  ModifyAutoSnapshotPolicyExRequest
     * @return ModifyAutoSnapshotPolicyExResponse
     */
    CompletableFuture<ModifyAutoSnapshotPolicyExResponse> modifyAutoSnapshotPolicyEx(ModifyAutoSnapshotPolicyExRequest request);

    /**
     * @deprecated OpenAPI ModifyBandwidthPackageSpec is deprecated  * @param request  the request parameters of ModifyBandwidthPackageSpec  ModifyBandwidthPackageSpecRequest
     * @return ModifyBandwidthPackageSpecResponse
     */
    @Deprecated
    CompletableFuture<ModifyBandwidthPackageSpecResponse> modifyBandwidthPackageSpec(ModifyBandwidthPackageSpecRequest request);

    /**
     * @param request the request parameters of ModifyCapacityReservation  ModifyCapacityReservationRequest
     * @return ModifyCapacityReservationResponse
     */
    CompletableFuture<ModifyCapacityReservationResponse> modifyCapacityReservation(ModifyCapacityReservationRequest request);

    /**
     * @param request the request parameters of ModifyCloudAssistantSettings  ModifyCloudAssistantSettingsRequest
     * @return ModifyCloudAssistantSettingsResponse
     */
    CompletableFuture<ModifyCloudAssistantSettingsResponse> modifyCloudAssistantSettings(ModifyCloudAssistantSettingsRequest request);

    /**
     * <b>description</b> :
     * <p>You can modify a command when it is run. After the command is modified, the new command content applies to subsequent executions.
     * You cannot modify the command type. For example, you cannot change a shell command (RunShellScript) to a batch command (RunBatScript).</p>
     * 
     * @param request the request parameters of ModifyCommand  ModifyCommandRequest
     * @return ModifyCommandResponse
     */
    CompletableFuture<ModifyCommandResponse> modifyCommand(ModifyCommandRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>All Elastic Compute Service (ECS) instances that are hosted on a dedicated host must be in the Stopped (<code>Stopped</code>) state before you can modify the CPU overcommit ratio of the dedicated host.</li>
     * <li>Changes to the CPU overcommit ratio of a dedicated host do not affect the running status of the dedicated host. After the CPU overcommit ratio is changed, the number of allocated vCPUs on the dedicated host cannot exceed the new total number of vCPUs. Otherwise, ECS instances that use the excess vCPUs cannot start.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDedicatedHostAttribute  ModifyDedicatedHostAttributeRequest
     * @return ModifyDedicatedHostAttributeResponse
     */
    CompletableFuture<ModifyDedicatedHostAttributeResponse> modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>A pay-as-you-go dedicated host can be automatically released at the specified time. Before you release a pay-as-you-go dedicated host, make sure that the host is no longer required and all necessary application data is backed up.</p>
     * 
     * @param request the request parameters of ModifyDedicatedHostAutoReleaseTime  ModifyDedicatedHostAutoReleaseTimeRequest
     * @return ModifyDedicatedHostAutoReleaseTimeResponse
     */
    CompletableFuture<ModifyDedicatedHostAutoReleaseTimeResponse> modifyDedicatedHostAutoReleaseTime(ModifyDedicatedHostAutoReleaseTimeRequest request);

    /**
     * <b>description</b> :
     * <p>  If you enable auto-renewal for your subscription dedicated host, the system attempts to deduct the renewal payment at 08:00:00 (UTC+8) nine days before the dedicated host expires to renew the dedicated host. If this deduction attempt fails, the system attempt to deduct the payment at the same point in time the next day. The system attempts to deduct the payment once every day until the dedicated host expires or until the payment is deducted. Make sure that your account balance is sufficient.</p>
     * <ul>
     * <li>Subscription dedicated hosts can be automatically renewed along with the subscription Elastic Compute Service (ECS) instances hosted on the dedicated hosts. For more information, see the description of the AutoRenewWithEcs parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDedicatedHostAutoRenewAttribute  ModifyDedicatedHostAutoRenewAttributeRequest
     * @return ModifyDedicatedHostAutoRenewAttributeResponse
     */
    CompletableFuture<ModifyDedicatedHostAutoRenewAttributeResponse> modifyDedicatedHostAutoRenewAttribute(ModifyDedicatedHostAutoRenewAttributeRequest request);

    /**
     * @param request the request parameters of ModifyDedicatedHostClusterAttribute  ModifyDedicatedHostClusterAttributeRequest
     * @return ModifyDedicatedHostClusterAttributeResponse
     */
    CompletableFuture<ModifyDedicatedHostClusterAttributeResponse> modifyDedicatedHostClusterAttribute(ModifyDedicatedHostClusterAttributeRequest request);

    /**
     * @param request the request parameters of ModifyDedicatedHostsChargeType  ModifyDedicatedHostsChargeTypeRequest
     * @return ModifyDedicatedHostsChargeTypeResponse
     */
    CompletableFuture<ModifyDedicatedHostsChargeTypeResponse> modifyDedicatedHostsChargeType(ModifyDedicatedHostsChargeTypeRequest request);

    /**
     * @deprecated OpenAPI ModifyDemand is deprecated, please use Ecs::2014-05-26::ModifyCapacityReservation instead.  * @description You can call this operation to modify the demand information of instance types. Alibaba Cloud provides the requested resources based on your demand. You can file demands only for I/O optimized instance types and instances of the virtual private cloud (VPC) type. Parameters except `DemandName` and `DemandDescription` can be modified only for demands that are in the Rejected state.
     * > This operation is in invitational preview and is not publicly available.
     * 
     * @param request the request parameters of ModifyDemand  ModifyDemandRequest
     * @return ModifyDemandResponse
     */
    @Deprecated
    CompletableFuture<ModifyDemandResponse> modifyDemand(ModifyDemandRequest request);

    /**
     * @param request the request parameters of ModifyDeploymentSetAttribute  ModifyDeploymentSetAttributeRequest
     * @return ModifyDeploymentSetAttributeResponse
     */
    CompletableFuture<ModifyDeploymentSetAttributeResponse> modifyDeploymentSetAttribute(ModifyDeploymentSetAttributeRequest request);

    /**
     * @param request the request parameters of ModifyDiagnosticMetricSet  ModifyDiagnosticMetricSetRequest
     * @return ModifyDiagnosticMetricSetResponse
     */
    CompletableFuture<ModifyDiagnosticMetricSetResponse> modifyDiagnosticMetricSet(ModifyDiagnosticMetricSetRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>When you call this operation to modify the attributes of a disk, if you set DeleteWithInstance to false and the instance to which the disk is attached is locked for security reasons, the DeleteWithInstance settings of the disk are ignored and the disk is released together with the instance. If <code>&quot;LockReason&quot; : &quot;security&quot;</code> is displayed in the response when you query the information about an instance, the instance is locked for security reasons.</li>
     * <li>You can use <code>DiskIds.N</code> to specify multiple block storage devices and batch modify the attributes of the devices, including the names and descriptions of the devices and whether to release the devices together with the associated instances.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskAttribute  ModifyDiskAttributeRequest
     * @return ModifyDiskAttributeResponse
     */
    CompletableFuture<ModifyDiskAttributeResponse> modifyDiskAttribute(ModifyDiskAttributeRequest request);

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Usage notes</h1>
     * <p>After you change the billing method, the payment (if any) is automatically completed. Maintain sufficient balance in your account. Otherwise, your order becomes invalid and must be canceled. If your account balance is insufficient, you can set AutoPay to false to generate an unpaid order. Then, log on to the <strong>Expenses and Costs console</strong>, go to the <a href="https://usercenter2-intl.aliyun.com/order/list">Orders page</a>, and pay for the order.
     * Take note of the following items:</p>
     * <ul>
     * <li>Only pay-as-you-go disks can be attached to pay-as-you-go instances, and the billing methods of the disks cannot be changed.</li>
     * <li>The instance cannot be in the Stopped state due to expiration.</li>
     * <li>The price difference is refunded to the payment account that you used. Vouchers that have been redeemed are nonrefundable.</li>
     * <li>You cannot change the billing method again within 5 minutes of a successful change.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskChargeType  ModifyDiskChargeTypeRequest
     * @return ModifyDiskChargeTypeResponse
     */
    CompletableFuture<ModifyDiskChargeTypeResponse> modifyDiskChargeType(ModifyDiskChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>  Only Alibaba Cloud accounts can call this operation.</p>
     * <ul>
     * <li>Before you can call this operation in a region, you must enable account-level default encryption of Elastic Block Storage (EBS) resources in the region.</li>
     * <li>The first time you use a custom master key (CMK), you must use the AliyunECSDiskEncryptDefaultRole role to grant Elastic Compute Service (ECS) access to KMS resources. For more information, see <a href="https://help.aliyun.com/zh/ecs/access-ecs-encrypted-resources-through-the-ram-role?#b82bf8fbd42t8">Grant access to KMS keys through RAM roles</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskDefaultKMSKeyId  ModifyDiskDefaultKMSKeyIdRequest
     * @return ModifyDiskDefaultKMSKeyIdResponse
     */
    CompletableFuture<ModifyDiskDefaultKMSKeyIdResponse> modifyDiskDefaultKMSKeyId(ModifyDiskDefaultKMSKeyIdRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Usage notes</h3>
     * <blockquote>
     * <p> The Dedicated Block Storage Cluster feature is available in the following regions: China (Hangzhou), China (Shanghai), China (Beijing), China (Zhangjiakou), China (Ulanqab), China (Shenzhen), China (Heyuan), Indonesia (Jakarta), Germany (Frankfurt), and China South 1 Finance.
     * Before you call the ModifyDiskDeployment operation, make sure that you fully understand the billing methods and prices of disks and dedicated block storage clusters. In addition, make sure that the dedicated block storage clusters are unexpired and your account has no overdue payments. For more information, see <a href="https://help.aliyun.com/document_detail/208883.html">Dedicated block storage cluster</a> and <a href="https://help.aliyun.com/document_detail/179022.html">Block storage devices</a>.
     * Take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>The disks and a dedicated block storage cluster to which you want to migrate the disk must be in the same zone.</li>
     * <li>You can migrate only pay-as-you-go disks. If you want to migrate subscription disks, change the disks to pay-as-you-go disks first. For more information, see <a href="https://help.aliyun.com/document_detail/145018.html">Change the billing method of a disk</a>.</li>
     * <li>The specifications of disks that you want to migrate to a destination block storage cluster must the same as the disk specifications that the destination dedicated block storage cluster supports. During migration, you can change the specifications of the disks to ensure specification consistency.</li>
     * <li>The disk must be in the <strong>In Use</strong> (In_Use) or <strong>Available</strong> (Available) state.</li>
     * <li>If the disk is attached to an Elastic Compute Service (ECS) instance, the instance must be in the <strong>Running</strong> (Running) or <strong>Stopped</strong> (Stopped) state. The ECS instance cannot be in the Expired state.</li>
     * <li>The performance level of an enhanced SSD (ESSD) is limited by the ESSD disk size. If you cannot upgrade the performance level of an ESSD, you can resize the ESSD. For more information, see <a href="https://help.aliyun.com/document_detail/25522.html">ResizeDisk</a> and <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</li>
     * <li>An account can perform up to five disk migration tasks in the same region at the same time.</li>
     * <li>When a disk is being migrated, you cannot cancel the migration task, create snapshots for the disk, change the disk configurations, resize the disk, mount the disk, unmount the disk, or re-initialize the disk.<blockquote>
     * <p> After you migrate a disk to a destination cluster by calling the ModifyDiskDeployment operation, the billing method, disk specifications, and capabilities of the destination cluster take effect immediately on the disk. Alibaba Cloud charges the disk based on the disk category and performance level. For more information, see <a href="https://help.aliyun.com/document_detail/208883.html">Dedicated block storage cluster</a> and <a href="https://help.aliyun.com/document_detail/179022.html">Block storage devices</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskDeployment  ModifyDiskDeploymentRequest
     * @return ModifyDiskDeploymentResponse
     */
    CompletableFuture<ModifyDiskDeploymentResponse> modifyDiskDeployment(ModifyDiskDeploymentRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>To modify the performance level of an ESSD, take note of the following items:<ul>
     * <li>For a subscription ESSD, you can only upgrade its performance level.</li>
     * <li>For a pay-as-you-go ESSD, you can upgrade or downgrade its performance level. However, you cannot downgrade the performance level to PL0.</li>
     * <li>The ESSD must be in the <strong>In Use</strong> (In_Use) or <strong>Unattached</strong> (Available) state.</li>
     * <li>If the ESSD is attached to an Elastic Compute Service (ECS) instance, the instance must be in the <strong>Running</strong> (Running) or <strong>Stopped</strong> (Stopped) state. The instance cannot be in the Expired state or stopped due to an overdue payment.</li>
     * <li>If you cannot upgrade the performance level of the ESSD due to the capacity limit, resize the ESSD by calling the <a href="https://help.aliyun.com/document_detail/25522.html">ResizeDisk</a> operation and then try again. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</li>
     * </ul>
     * </li>
     * <li>For information about the limits on changing the category of a disk, see the &quot;Limits&quot; section of the <a href="https://help.aliyun.com/document_detail/161980.html">Change the category of a disk</a> topic.
     * The new disk category or performance level takes effect immediately after this operation is performed. Alibaba Cloud calculates the bill based on the new disk category and performance level.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskSpec  ModifyDiskSpecRequest
     * @return ModifyDiskSpecResponse
     */
    CompletableFuture<ModifyDiskSpecResponse> modifyDiskSpec(ModifyDiskSpecRequest request);

    /**
     * @deprecated OpenAPI ModifyEipAddressAttribute is deprecated  * @param request  the request parameters of ModifyEipAddressAttribute  ModifyEipAddressAttributeRequest
     * @return ModifyEipAddressAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyEipAddressAttributeResponse> modifyEipAddressAttribute(ModifyEipAddressAttributeRequest request);

    /**
     * @param request the request parameters of ModifyElasticityAssurance  ModifyElasticityAssuranceRequest
     * @return ModifyElasticityAssuranceResponse
     */
    CompletableFuture<ModifyElasticityAssuranceResponse> modifyElasticityAssurance(ModifyElasticityAssuranceRequest request);

    /**
     * @deprecated OpenAPI ModifyForwardEntry is deprecated  * @param request  the request parameters of ModifyForwardEntry  ModifyForwardEntryRequest
     * @return ModifyForwardEntryResponse
     */
    @Deprecated
    CompletableFuture<ModifyForwardEntryResponse> modifyForwardEntry(ModifyForwardEntryRequest request);

    /**
     * @deprecated OpenAPI ModifyHaVipAttribute is deprecated  * @param request  the request parameters of ModifyHaVipAttribute  ModifyHaVipAttributeRequest
     * @return ModifyHaVipAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyHaVipAttributeResponse> modifyHaVipAttribute(ModifyHaVipAttributeRequest request);

    /**
     * @param request the request parameters of ModifyHpcClusterAttribute  ModifyHpcClusterAttributeRequest
     * @return ModifyHpcClusterAttributeResponse
     */
    CompletableFuture<ModifyHpcClusterAttributeResponse> modifyHpcClusterAttribute(ModifyHpcClusterAttributeRequest request);

    /**
     * @param request the request parameters of ModifyImageAttribute  ModifyImageAttributeRequest
     * @return ModifyImageAttributeResponse
     */
    CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyImageShareGroupPermission is deprecated  * @param request  the request parameters of ModifyImageShareGroupPermission  ModifyImageShareGroupPermissionRequest
     * @return ModifyImageShareGroupPermissionResponse
     */
    @Deprecated
    CompletableFuture<ModifyImageShareGroupPermissionResponse> modifyImageShareGroupPermission(ModifyImageShareGroupPermissionRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>You can share only your own custom images to other Alibaba Cloud accounts.</li>
     * <li>You can share a custom image to up to 10 Alibaba Cloud accounts at a time. You can specify up to 10 Alibaba Cloud account IDs by using AddAccount.N or RemoveAccount.N. If you specify more than 10 account IDs, the system processes only the first 10 account IDs. The excess account IDs are ignored.</li>
     * <li>You can share a custom image to up to 50 Alibaba Cloud accounts.</li>
     * <li>If an Elastic Compute Service (ECS) instance was created (<a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a>) from a shared image, you cannot re-initialize the instance (<a href="https://help.aliyun.com/document_detail/25519.html">ReInitDisk</a>) after the image owner unshares or deletes the image (<a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a>).
     * When you publish or unpublish a community image, take note of the following items:</li>
     * <li>Alibaba Cloud provides only the platform on which community images can be published and managed. The owner of a community image is responsible for the quality and updates of the image. Make sure that you acknowledge and agree to the Community Image Agreement. Otherwise, you cannot publish community images. For more information, see <a href="https://help.aliyun.com/document_detail/208370.html">Publish a community image</a>.</li>
     * <li>You cannot publish encrypted images as community images.</li>
     * <li>Community images are publicly available. A community image is available to all Alibaba Cloud accounts in the region where the image resides.</li>
     * <li>You cannot share, export, or copy community images.</li>
     * <li>After you unpublish a community image, the image is no longer available to other Alibaba Cloud accounts. If an image is shared to other Alibaba Cloud accounts before it is unpublished, the image remains available to the accounts.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyImageSharePermission  ModifyImageSharePermissionRequest
     * @return ModifyImageSharePermissionResponse
     */
    CompletableFuture<ModifyImageSharePermissionResponse> modifyImageSharePermission(ModifyImageSharePermissionRequest request);

    /**
     * <b>description</b> :
     * <p>A private pool is generated after an elasticity assurance or a capacity reservation is created. The private pool is associated with information about the instances that are created by using the resources in the private pool. When you create ECS instances, you can configure the instances to use private pool resources, matching them to active elasticity assurances or capacity reservations.</p>
     * <ul>
     * <li>This operation does not require you to restart the instances for the changes to take effect.</li>
     * <li>When you call the following operations on an instance, the system attempts to match the instance with active private pools. If the instance is configured to a specific private pool. the call may fail because the private pool is no longer active or does not have sufficient resources. If the call fails, call the ModifyInstanceAttachmentAttributes operation to change the match mode of the private pool to <code>Open</code>.<ul>
     * <li>StartInstance: starts an instance that is stopped in economical mode.</li>
     * <li>ReActivateInstances</li>
     * <li>ModifyInstanceChargeType</li>
     * <li>ModifyPrepayInstanceSpec</li>
     * <li>ReplaceSystemDisk</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceAttachmentAttributes  ModifyInstanceAttachmentAttributesRequest
     * @return ModifyInstanceAttachmentAttributesResponse
     */
    CompletableFuture<ModifyInstanceAttachmentAttributesResponse> modifyInstanceAttachmentAttributes(ModifyInstanceAttachmentAttributesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> when you query the information of the instance, the instance is locked for security reasons and no operations are allowed on the instance.
     * Take note of the following items:</p>
     * <ul>
     * <li>If you change the hostname (<code>HostName</code>), restart the instance in the ECS console or by calling the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation for the new hostname to take effect. For information about how to restart an instance in the ECS console, see <a href="https://help.aliyun.com/document_detail/25440.html">Restart an instance</a>. The new hostname may not take effect if you restart the instance from within the operating system.</li>
     * <li>If you reset the password (<code>Password</code>), take note of the following items:<ul>
     * <li>The instance cannot be in the <strong>Starting</strong> (<code>Starting</code>) state.</li>
     * <li>After you reset the password, restart the instance in the ECS console or by calling the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation for the new password to take effect. For information about how to restart an instance in the ECS console, see <a href="https://help.aliyun.com/document_detail/25440.html">Restart an instance</a>. The new password does not take effect if you restart the instance from within the operating system.</li>
     * </ul>
     * </li>
     * <li>If you modify user data (<code>UserData</code>), take note of the following items: The instance must meet the limits for user data. For more information, see <a href="https://help.aliyun.com/document_detail/49121.html">Instance user data</a>.
     * **
     * <strong>Note</strong> After you restart the instance, the new user data is displayed but not run as scripts.</li>
     * <li>If you change the security groups (<code>SecurityGroupIds.N</code>), take note of the following items:<ul>
     * <li>You can move the instance to a security group of a different type. If you want to move the instance to a security group of a different type, you must familiarize yourself with the differences between the rule configurations of the two security group types to prevent impacts on the instance network.</li>
     * <li>Security groups of instances in the classic network cannot be changed. For more information, see the description of <code>SecurityGroupIds.N</code>.</li>
     * </ul>
     * </li>
     * <li>If you change the number of queues supported by the primary elastic network interface (ENI) (<code>NetworkInterfaceQueueNumber</code>), take note of the following items:<ul>
     * <li>The instance must be in the Stopped (<code>Stopped</code>) state.</li>
     * <li>The value of this parameter cannot exceed the maximum number of queues allowed per ENI.</li>
     * <li>The total number of queues for all ENIs on the instance cannot exceed the queue quota for the instance type. To query the maximum number of queues per ENI and the queue quota for an instance type, you can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation and view the values of the <code>MaximumQueueNumberPerEni</code> and <code>TotalEniQueueQuantity</code> response parameters.</li>
     * <li>If you set this parameter to -1, the value is reset to the default value for the instance type. To query the default number of queues supported per primary ENI for an instance type, you can call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation and view the value of the <code>PrimaryEniQueueNumber</code> response parameter.</li>
     * </ul>
     * </li>
     * <li>If you enable or disable the Jumbo Frames feature (<code>EnableJumboFrame</code>), take note of the following items. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">MTUs</a>.<ul>
     * <li>The instance must be in the Running (<code>Running</code>) or Stopped (<code>Stopped</code>) state.</li>
     * <li>The instance must reside in a virtual private cloud (VPC).</li>
     * <li>After the Jumbo Frames feature is enabled, the MTU value of the instance is set to 8500. After the Jumbo Frames feature is disabled, the MTU value of the instance is set to 1500.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceAttribute  ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request);

    /**
     * @param request the request parameters of ModifyInstanceAutoReleaseTime  ModifyInstanceAutoReleaseTimeRequest
     * @return ModifyInstanceAutoReleaseTimeResponse
     */
    CompletableFuture<ModifyInstanceAutoReleaseTimeResponse> modifyInstanceAutoReleaseTime(ModifyInstanceAutoReleaseTimeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the billing methods and pricing of Elastic Compute Service (ECS). For more information, see the <a href="https://www.alibabacloud.com/product/ecs#pricing">Elastic Compute Service</a> product page.</p>
     * <ul>
     * <li>The payment for auto-renewal of an instance is automatically deducted at 08:00:00 (UTC+8) nine days before the instance expires.</li>
     * <li>If the deduction fails, Alibaba Cloud attempts to deduct the payment every day until the payment is deducted or until the instance is locked after the nine-day period ends. Make sure that your account balance or credit balance is sufficient.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceAutoRenewAttribute  ModifyInstanceAutoRenewAttributeRequest
     * @return ModifyInstanceAutoRenewAttributeResponse
     */
    CompletableFuture<ModifyInstanceAutoRenewAttributeResponse> modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you are familiar with the billing methods and pricing of Elastic Compute Service (ECS). For more information, see the <a href="https://www.alibabacloud.com/product/ecs#pricing">Elastic Compute Service</a> product page.
     * Take note of the following items:</p>
     * <ul>
     * <li>The instances must be in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state, and you cannot have overdue payments for them.</li>
     * <li>After you change the billing method, outstanding payments are automatically completed. Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and is canceled. If your account balance is insufficient, you can set <code>AutoPay</code> to <code>false</code> to generate an unpaid order. Then, you can log on to the <a href="https://ecs.console.aliyun.com/">ECS console</a> to pay for the order.</li>
     * <li><strong>Change the billing method from subscription to pay-as-you-go</strong>:<ul>
     * <li>Your ECS usage determines whether the billing method of an instance can be changed from subscription to pay-as-you-go.</li>
     * <li>After you change the billing method of an instance from subscription to pay-as-you-go, the new billing method remains in effect for the remaining lifecycle of the instance. The price difference is refunded to the payment account that you used. Vouchers that have been redeemed are not refundable.</li>
     * <li><strong>Refund rule</strong>: You have a quota for the total refund amount each month, and unused balance of this quota is not carried forward into the next month. After you use up the refund quota of the current month, you can change the billing method only in the next month. The refund amount incurred when you change the billing method is calculated based on the following formula: <strong>Number of vCPUs × (Number of remaining days × 24 ± Number of remaining or elapsed hours)</strong>.</li>
     * </ul>
     * </li>
     * <li><strong>Change the billing method from pay-as-you-go to subscription</strong>:<ul>
     * <li>You can change the billing method of all data disks that are attached to an instance from pay-as-you-go to subscription.</li>
     * <li>This operation cannot be called for a pay-as-you-go instance that has an automatic release time set.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceChargeType  ModifyInstanceChargeTypeRequest
     * @return ModifyInstanceChargeTypeResponse
     */
    CompletableFuture<ModifyInstanceChargeTypeResponse> modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The instance must be in the <strong>Stopped</strong> (Stopped) state. The instance is automatically restarted after it is migrated.</li>
     * <li>The network type of the instance must be Virtual Private Cloud (VPC).</li>
     * <li>The instance and the destination dedicated host to which to migrate the instance must belong to the same account and reside in the same region and zone.</li>
     * <li>A pay-as-you-go instance can be migrated to a subscription dedicated host. A subscription instance can be migrated only between subscription dedicated hosts. The expiration date of the subscription instance cannot be later than that of the destination dedicated host.</li>
     * <li>You can migrate only pay-as-you-go instances from a shared host to a dedicated host. You cannot migrate subscription instances or preemptible instances from a shared host to a dedicated host.</li>
     * <li>You can redeploy an instance to a specific dedicated host cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceDeployment  ModifyInstanceDeploymentRequest
     * @return ModifyInstanceDeploymentResponse
     */
    CompletableFuture<ModifyInstanceDeploymentResponse> modifyInstanceDeployment(ModifyInstanceDeploymentRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to modify the maintenance policy of an instance. The maintenance policy consists of the following maintenance attributes:</p>
     * <ul>
     * <li>Maintenance window: the time period that you specify for maintenance.</li>
     * <li>Maintenance action: the action that you specify in response to instance shutdown.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceMaintenanceAttributes  ModifyInstanceMaintenanceAttributesRequest
     * @return ModifyInstanceMaintenanceAttributesResponse
     */
    CompletableFuture<ModifyInstanceMaintenanceAttributesResponse> modifyInstanceMaintenanceAttributes(ModifyInstanceMaintenanceAttributesRequest request);

    /**
     * @param request the request parameters of ModifyInstanceMetadataOptions  ModifyInstanceMetadataOptionsRequest
     * @return ModifyInstanceMetadataOptionsResponse
     */
    CompletableFuture<ModifyInstanceMetadataOptionsResponse> modifyInstanceMetadataOptions(ModifyInstanceMetadataOptionsRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>From November 27, 2020, the maximum bandwidth value available for you to create ECS instances or to change ECS instance configurations is subject to the throttling policy for your account. To increase the maximum bandwidth value, submit a ticket. The following throttling policies apply:<ul>
     * <li>Within a single region, the sum of actual peak bandwidths of all ECS instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s.</li>
     * <li>Within a single region, the sum of actual peak bandwidths of all ECS instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.</li>
     * </ul>
     * </li>
     * <li>If you upgrade the outbound public bandwidth (InternetMaxBandwidthOut) of a subscription (PrePaid) instance from 0 Mbit/s when you modify the bandwidth configurations of the instance, a public IP address is automatically assigned to the instance.</li>
     * <li>If you upgrade the outbound public bandwidth (InternetMaxBandwidthOut) of a pay-as-you-go (PostPaid) instance from 0 Mbit/s when you modify the bandwidth configurations of the instance, no public IP address is assigned to the instance. You must set <code>AllocatePublicIp</code> to true or call the <a href="https://help.aliyun.com/document_detail/25544.html">AllocatePublicIpAddress</a> operation to assign a public IP address to the instance.</li>
     * <li>An instance in the classic network must be in the Stopped state before you can upgrade its outbound public bandwidth (InternetMaxBandwidthOut) from 0 Mbit/s.</li>
     * <li>After the bandwidth is upgraded, AutoPay is set to true by default and the payment is automatically made. Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and must be canceled. If your account balance is insufficient, you can set AutoPay to false. In this case, when you call the ModifyInstanceNetworkSpec operation, an unpaid order is generated. Then, you can log on to the ECS console to pay for the order.</li>
     * <li>The price difference is refunded to the payment account that you used. Vouchers or coupons that have been redeemed cannot be returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceNetworkSpec  ModifyInstanceNetworkSpecRequest
     * @return ModifyInstanceNetworkSpecResponse
     */
    CompletableFuture<ModifyInstanceNetworkSpecResponse> modifyInstanceNetworkSpec(ModifyInstanceNetworkSpecRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>For information about how to use ECS SDK for Python to change resource configurations, see <a href="https://help.aliyun.com/document_detail/109517.html">Query available resources for configuration changes</a>.
     * Take note of the following items:</p>
     * <ul>
     * <li>Make sure that you have no overdue payments in your account.</li>
     * <li>You can adjust the public bandwidth of an instance only when the instance is in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>Before you change the instance type of a pay-as-you-go instance, call the <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> operation to query compatible instance types.</li>
     * <li>You can change the instance type of an instance only when the instance is in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>The instance type and the public bandwidth of an instance cannot be changed together.</li>
     * <li>Starting November 27, 2020, the maximum bandwidth value that is available for you to create ECS instances or change ECS instance configurations is subject to the throttling policy of your account. To increase the maximum bandwidth value, submit a ticket. The following throttling policies apply:<ul>
     * <li>In each region, the sum of actual maximum bandwidths of all ECS instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s.</li>
     * <li>In each region, the sum of actual maximum bandwidths of all ECS instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceSpec  ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
     * <b>description</b> :
     * <p>  The password must be six characters in length and can contain only uppercase letters, lowercase letters, and digits.</p>
     * <ul>
     * <li>After you modify the VNC password of an instance, take note of the following items:<ul>
     * <li>If the instance is I/O optimized, the new password takes effect immediately.</li>
     * <li>If the instance is not I/O optimized, you must <a href="https://help.aliyun.com/document_detail/25440.html">restart the instance</a> by using the ECS console or by calling the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation for the new password to take effect.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceVncPasswd  ModifyInstanceVncPasswdRequest
     * @return ModifyInstanceVncPasswdResponse
     */
    CompletableFuture<ModifyInstanceVncPasswdResponse> modifyInstanceVncPasswd(ModifyInstanceVncPasswdRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The instance that you want to manage must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</p>
     * <ul>
     * <li>When you call this operation to change the private IP address or vSwitch of an instance, take note of the following items:<ul>
     * <li>If the instance is a new instance, you must restart the instance before you call this operation.</li>
     * <li>After the private IP address or vSwitch of the instance is changed, you must restart the instance before you can recall this operation.</li>
     * </ul>
     * </li>
     * <li>When you call this operation to change the VPC of an instance, take note of the following items:<ul>
     * <li><strong>Instance:</strong><ul>
     * <li>The instance cannot be associated with Server Load Balancer (SLB) instances.</li>
     * <li>The instance cannot be in the Locked, To Be Released, Expired, Expired and Being Recycled, or Overdue and Being Recycled state. For more information, see <a href="https://help.aliyun.com/document_detail/25380.html">Instance lifecycle</a>.</li>
     * <li>The instance cannot be used in other Alibaba Cloud services. For example, the instance cannot be in the process of being migrated or having its VPC changed, or the databases deployed on the instance cannot be managed by Data Transmission Service (DTS).</li>
     * </ul>
     * </li>
     * <li><strong>Network:</strong><ul>
     * <li>The cut-through mode or the multi-elastic IP address (EIP)-to-elastic network interface (ENI) mode cannot be enabled for the instance.</li>
     * <li>The instance cannot be associated with a high-availability virtual IP address (HAVIP).</li>
     * <li>The vSwitch of the instance cannot be associated with a custom route table.</li>
     * <li>Global Accelerator (GA) cannot be activated for the instance.</li>
     * <li>The instance cannot have secondary ENIs.</li>
     * <li>The instance cannot be assigned an IPv6 address.</li>
     * <li>The primary ENI of the instance cannot be associated with multiple IP addresses.</li>
     * <li>The new vSwitch that you specify must belong to the new VPC.</li>
     * <li>The original and new vSwitches must reside in the same zone.</li>
     * <li>If you assign a private IP address to the primary ENI of the instance, the private IP address must be an idle IP address within the CIDR block of the new vSwitch. If you do not assign a private IP address to the primary ENI of the instance, a private IP address is randomly assigned to the ENI. Make sure that sufficient IP addresses are available in the CIDR block of the new vSwitch.</li>
     * <li>The Alibaba Cloud account that owns the new VPC cannot share the VPC with other accounts.</li>
     * </ul>
     * </li>
     * <li><strong>Security group (SecurityGroupId.N):</strong><ul>
     * <li>All security groups must be of the same type.</li>
     * <li>The valid values of N vary based on the maximum number of security groups to which an instance can belong. For more information, see the &quot;Security group limits&quot; section in <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</li>
     * <li>The security groups that you specify must belong to the new VPC.</li>
     * <li>You can switch the instance to security groups of a different type. To ensure network connectivity, we recommend that you understand the differences in rule configurations of the two security group types before you switch an instance to security groups of a different type. For more information, see <a href="https://help.aliyun.com/document_detail/25387.html">Overview</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceVpcAttribute  ModifyInstanceVpcAttributeRequest
     * @return ModifyInstanceVpcAttributeResponse
     */
    CompletableFuture<ModifyInstanceVpcAttributeResponse> modifyInstanceVpcAttribute(ModifyInstanceVpcAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You can modify the execution information of a task that runs a command in one of the following modes. To query the execution mode of a command, you can call the <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocations</a> operation and check the <code>RepeatMode</code> value in the response.
     *     *   Period: The task runs the command on a schedule.
     *     *   NextRebootOnly: The task runs the command the next time the associated instances start.
     *     *   EveryReboot: The task runs the command every time the associated instances start.</p>
     * <ul>
     * <li>You can modify the execution information of a command task in one of the following execution states. To query the execution status of a command, you can call the <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocations</a> operation and check the <code>InvocationStatus</code> value.<ul>
     * <li>Pending: The command is being verified or sent. When the execution state on at least one instance is Pending, the overall execution state is Pending.</li>
     * <li>Running: The command is being run on instances. When the execution state on at least one instance is Running, the overall execution state is Running.</li>
     * <li>Scheduled: The command that is set to run on a schedule is sent and waiting to be run. When the execution state on at least one instance is Scheduled, the overall execution state is Scheduled.</li>
     * <li>Stopping: The command task is being stopped. When the execution state on at least one instance is Stopping, the overall execution state is Stopping.</li>
     * </ul>
     * </li>
     * <li>Before you modify the execution information of a scheduled task, such as the command content, custom parameters, and execution frequency, make sure that the version of Cloud Assistant Agent on the ECS instances or managed instances associated with the task is later than the following versions:<ul>
     * <li>Linux: 2.2.3.541</li>
     * <li>Windows: 2.1.3.541</li>
     * <li>If the <code>InvalidOperation.CloudAssistantVersionUnsupported</code> error code is returned in the response, update Cloud Assistant Agent to the latest version.</li>
     * </ul>
     * </li>
     * <li>You cannot modify <code>CommandContent</code> for a common Cloud Assistant command.</li>
     * <li>If you modify the <code>CommandContent</code> value of a command and set <code>KeepCommand</code> to <code>true</code> when you call the <a href="https://help.aliyun.com/document_detail/64841.html">InvokeCommand</a> or <a href="https://help.aliyun.com/document_detail/141751.html">RunCommand</a> operation to run the command, a new command is added and retained. The new command consumes the quota for Cloud Assistant commands. You can retain up to 500 to 50,000 Cloud Assistant commands in each region. You can apply for a quota increase. For information about how to query and increase quotas, see <a href="https://help.aliyun.com/document_detail/184116.html">Manage quotas</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInvocationAttribute  ModifyInvocationAttributeRequest
     * @return ModifyInvocationAttributeResponse
     */
    CompletableFuture<ModifyInvocationAttributeResponse> modifyInvocationAttribute(ModifyInvocationAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Ecs%5C&api=ModifyLaunchTemplateDefaultVersion%5C&type=RPC%5C&version=2014-05-26">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of ModifyLaunchTemplateDefaultVersion  ModifyLaunchTemplateDefaultVersionRequest
     * @return ModifyLaunchTemplateDefaultVersionResponse
     */
    CompletableFuture<ModifyLaunchTemplateDefaultVersionResponse> modifyLaunchTemplateDefaultVersion(ModifyLaunchTemplateDefaultVersionRequest request);

    /**
     * <b>description</b> :
     * <p>The region ID. The following regions are supported: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), China (Shanghai), China (Shenzhen), China (Heyuan), and China (Hong Kong).
     * You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * @param request the request parameters of ModifyManagedInstance  ModifyManagedInstanceRequest
     * @return ModifyManagedInstanceResponse
     */
    CompletableFuture<ModifyManagedInstanceResponse> modifyManagedInstance(ModifyManagedInstanceRequest request);

    /**
     * @param request the request parameters of ModifyNetworkInterfaceAttribute  ModifyNetworkInterfaceAttributeRequest
     * @return ModifyNetworkInterfaceAttributeResponse
     */
    CompletableFuture<ModifyNetworkInterfaceAttributeResponse> modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyPhysicalConnectionAttribute is deprecated  * @param request  the request parameters of ModifyPhysicalConnectionAttribute  ModifyPhysicalConnectionAttributeRequest
     * @return ModifyPhysicalConnectionAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyPhysicalConnectionAttributeResponse> modifyPhysicalConnectionAttribute(ModifyPhysicalConnectionAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The specified CIDR block must be valid. For example, 10.0.0.0/8 is a valid CIDR block while 10.0.0.1/8 is not. For more information, see the <a href="~~40637#section-jua-0tj-q5m~~">What is CIDR?</a> section in the &quot;Network FAQ&quot; topic.</li>
     * <li>When you add or delete an entry, you cannot specify duplicate CIDR blocks. Examples:<ul>
     * <li>For IPv4 CIDR blocks, you cannot specify the 10.0.0.0/8 CIDR block in two entries. You cannot specify the 10.0.0.1/32 CIDR block in one entry and the 10.0.0.1 CIDR block in another entry. The two CIDR blocks are the same.</li>
     * <li>For IPv6 CIDR blocks, you cannot specify the 2001:fd01:0:0:0:0:0:0/32 CIDR block in one entry and the 2001:fd01::/32 CIDR block in another entry. The two CIDR blocks are the same.</li>
     * </ul>
     * </li>
     * <li>The CIDR block in an entry to be added cannot the same as that in an entry to be deleted. For example, when you add an entry in which the 10.0.0.0/8 CIDR block is specified, make sure that the 10.0.0.0/8 CIDR block is not specified in an entry to be deleted.</li>
     * <li>If you want to modify the description of an entry, you must specify the CIDR block (<code>AddEntry.N.Cidr</code>) and new description (<code>AddEntry.N.Description</code>) for the entry.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyPrefixList  ModifyPrefixListRequest
     * @return ModifyPrefixListResponse
     */
    CompletableFuture<ModifyPrefixListResponse> modifyPrefixList(ModifyPrefixListRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you call this operation, we recommend that you familiarize yourself with the billing methods, pricing schedule, and refund rules of <a href="https://www.alibabacloud.com/product/ecs#pricing">ECS</a>. For information about the refund rules, see <a href="https://help.aliyun.com/document_detail/476339.html">Rules for unsubscribing from resources</a>.
     * Before you change the instance type of a subscription instance, call the <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> operation to query the instance types to which you can change the instance. You can use ECS SDK for Python. For more information, see <a href="https://help.aliyun.com/document_detail/109517.html">Query available resources for configuration changes</a>.
     * Take note of the following items:</p>
     * <ul>
     * <li>To change the instance type of an expired instance, you must first renew the instance.</li>
     * <li>When you downgrade the instance type of an instance, take note of the following items:<ul>
     * <li>The instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>The price difference is refunded to the payment account you used. Vouchers that have been redeemed are not refundable.</li>
     * </ul>
     * </li>
     * <li>The operation is asynchronous. Wait 5 to 10 seconds for the instance type change to complete. Then, restart the instance by calling the RebootInstance operation or by using the ECS console for the instance type change to take effect. If you restart only the operating system of the instance, the instance type change does not take effect.<ul>
     * <li>If the instance is in the <strong>Stopped</strong> state, you only need to start the instance. You do not need to restart the instance after it enters the Running state.</li>
     * <li>If <code>RebootWhenFinished</code> is set to true for the instance, you do not need to restart the instance.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyPrepayInstanceSpec  ModifyPrepayInstanceSpecRequest
     * @return ModifyPrepayInstanceSpecResponse
     */
    CompletableFuture<ModifyPrepayInstanceSpecResponse> modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request);

    /**
     * @param request the request parameters of ModifyReservedInstanceAttribute  ModifyReservedInstanceAttributeRequest
     * @return ModifyReservedInstanceAttributeResponse
     */
    CompletableFuture<ModifyReservedInstanceAttributeResponse> modifyReservedInstanceAttribute(ModifyReservedInstanceAttributeRequest request);

    /**
     * @param request the request parameters of ModifyReservedInstanceAutoRenewAttribute  ModifyReservedInstanceAutoRenewAttributeRequest
     * @return ModifyReservedInstanceAutoRenewAttributeResponse
     */
    CompletableFuture<ModifyReservedInstanceAutoRenewAttributeResponse> modifyReservedInstanceAutoRenewAttribute(ModifyReservedInstanceAutoRenewAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>The region ID of the reserved instance.
     * You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
     * 
     * @param request the request parameters of ModifyReservedInstances  ModifyReservedInstancesRequest
     * @return ModifyReservedInstancesResponse
     */
    CompletableFuture<ModifyReservedInstancesResponse> modifyReservedInstances(ModifyReservedInstancesRequest request);

    /**
     * @deprecated OpenAPI ModifyRouterInterfaceAttribute is deprecated  * @param request  the request parameters of ModifyRouterInterfaceAttribute  ModifyRouterInterfaceAttributeRequest
     * @return ModifyRouterInterfaceAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyRouterInterfaceAttributeResponse> modifyRouterInterfaceAttribute(ModifyRouterInterfaceAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyRouterInterfaceSpec is deprecated  * @param request  the request parameters of ModifyRouterInterfaceSpec  ModifyRouterInterfaceSpecRequest
     * @return ModifyRouterInterfaceSpecResponse
     */
    @Deprecated
    CompletableFuture<ModifyRouterInterfaceSpecResponse> modifyRouterInterfaceSpec(ModifyRouterInterfaceSpecRequest request);

    /**
     * @param request the request parameters of ModifySecurityGroupAttribute  ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     */
    CompletableFuture<ModifySecurityGroupAttributeResponse> modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>In security group-related API documents, inbound traffic refers to the traffic that is sent by the source device and received at the destination device.
     * Take note of the following items:</p>
     * <ul>
     * <li>An authorization object in a security group rule can be of one of the following types: IP address or CIDR block, security group, or prefix list. You cannot call this operation to change the type of an existing authorization object. For example, if an authorization object is an IP address, you can change the authorization object to another IP address or a CIDR block, but you cannot change the authorization object to a security group or prefix list.</li>
     * <li>You cannot change the IP address family of an existing authorization object. For example, if an authorization object is an IPv4 CIDR block, you cannot change the authorization object to an IPv6 CIDR block. If an authorization object is a prefix list of the IPv4 address family, you cannot change the authorization object to a prefix list of the IPv6 address family.</li>
     * <li>The modified security group rule cannot be the same as other existing rules.</li>
     * <li>You cannot delete the value of a non-empty parameter. If you want to delete the values of non-empty parameters, we recommend that you create another rule and delete the original rule.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupEgressRule  ModifySecurityGroupEgressRuleRequest
     * @return ModifySecurityGroupEgressRuleResponse
     */
    CompletableFuture<ModifySecurityGroupEgressRuleResponse> modifySecurityGroupEgressRule(ModifySecurityGroupEgressRuleRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>When InnerAccessPolicy is set to Accept for a security group, the instances in the security group can communicate with each other. In this case, the Accept internal access control policy takes precedence over user-created security group rules to keep instances in the security group accessible to each other.</li>
     * <li>When InnerAccessPolicy is set to Drop for a security group, the instances in the security group are isolated from each other. In this case, user-created security group rules take precedence over the Drop internal access control policy and can be used to allow access between the instances. For example, you can call the <a href="https://help.aliyun.com/document_detail/25554.html">AuthorizeSecurityGroup</a> operation to create an inbound security group rule that allows the instances in the security group to communicate with each other.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/25555.html">DescribeSecurityGroupAttribute</a> operation to query the internal access policy of a security group.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupPolicy  ModifySecurityGroupPolicyRequest
     * @return ModifySecurityGroupPolicyResponse
     */
    CompletableFuture<ModifySecurityGroupPolicyResponse> modifySecurityGroupPolicy(ModifySecurityGroupPolicyRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>In security group-related API documents, inbound traffic refers to the traffic that is sent by the source device and received at the destination device.
     * Take note of the following items:</p>
     * <ul>
     * <li>An authorization object in a security group rule can be one of the following types: IP address or CIDR block, security group, or prefix list. You cannot call this operation to change the type of an existing authorization object. For example, if an authorization object is an IP address, you can change the authorization object to another IP address or a CIDR block, but you cannot change the authorization object to a security group or prefix list.</li>
     * <li>You cannot change the IP address family of an existing authorization object. For example, if an authorization object is an IPv4 CIDR block, you cannot change the authorization object to an IPv6 CIDR block. If an authorization object is a prefix list of the IPv4 address family, you cannot change the authorization object to a prefix list of the IPv6 address family.</li>
     * <li>The new security group rule after modification cannot be the same as other existing rules.</li>
     * <li>You cannot delete the value of a non-empty parameter. If you want to delete the values of non-empty parameters, we recommend that you create another rule and delete the original rule.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupRule  ModifySecurityGroupRuleRequest
     * @return ModifySecurityGroupRuleResponse
     */
    CompletableFuture<ModifySecurityGroupRuleResponse> modifySecurityGroupRule(ModifySecurityGroupRuleRequest request);

    /**
     * @param request the request parameters of ModifySnapshotAttribute  ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     */
    CompletableFuture<ModifySnapshotAttributeResponse> modifySnapshotAttribute(ModifySnapshotAttributeRequest request);

    /**
     * @param request the request parameters of ModifySnapshotGroup  ModifySnapshotGroupRequest
     * @return ModifySnapshotGroupResponse
     */
    CompletableFuture<ModifySnapshotGroupResponse> modifySnapshotGroup(ModifySnapshotGroupRequest request);

    /**
     * @param request the request parameters of ModifyStorageCapacityUnitAttribute  ModifyStorageCapacityUnitAttributeRequest
     * @return ModifyStorageCapacityUnitAttributeResponse
     */
    CompletableFuture<ModifyStorageCapacityUnitAttributeResponse> modifyStorageCapacityUnitAttribute(ModifyStorageCapacityUnitAttributeRequest request);

    /**
     * @param request the request parameters of ModifyStorageSetAttribute  ModifyStorageSetAttributeRequest
     * @return ModifyStorageSetAttributeResponse
     */
    CompletableFuture<ModifyStorageSetAttributeResponse> modifyStorageSetAttribute(ModifyStorageSetAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyUserBusinessBehavior is deprecated  * @param request  the request parameters of ModifyUserBusinessBehavior  ModifyUserBusinessBehaviorRequest
     * @return ModifyUserBusinessBehaviorResponse
     */
    @Deprecated
    CompletableFuture<ModifyUserBusinessBehaviorResponse> modifyUserBusinessBehavior(ModifyUserBusinessBehaviorRequest request);

    /**
     * @deprecated OpenAPI ModifyVRouterAttribute is deprecated  * @param request  the request parameters of ModifyVRouterAttribute  ModifyVRouterAttributeRequest
     * @return ModifyVRouterAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyVRouterAttributeResponse> modifyVRouterAttribute(ModifyVRouterAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyVSwitchAttribute is deprecated  * @param request  the request parameters of ModifyVSwitchAttribute  ModifyVSwitchAttributeRequest
     * @return ModifyVSwitchAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyVSwitchAttributeResponse> modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyVirtualBorderRouterAttribute is deprecated  * @param request  the request parameters of ModifyVirtualBorderRouterAttribute  ModifyVirtualBorderRouterAttributeRequest
     * @return ModifyVirtualBorderRouterAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyVirtualBorderRouterAttributeResponse> modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyVpcAttribute is deprecated  * @param request  the request parameters of ModifyVpcAttribute  ModifyVpcAttributeRequest
     * @return ModifyVpcAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyVpcAttributeResponse> modifyVpcAttribute(ModifyVpcAttributeRequest request);

    /**
     * @param request the request parameters of PurchaseElasticityAssurance  PurchaseElasticityAssuranceRequest
     * @return PurchaseElasticityAssuranceResponse
     */
    CompletableFuture<PurchaseElasticityAssuranceResponse> purchaseElasticityAssurance(PurchaseElasticityAssuranceRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>Before you call this operation, make sure that you fully understand the billing method of reserved instances. For more information, see <a href="https://help.aliyun.com/document_detail/100371.html">Reserved instances</a>.</li>
     * <li>Before you purchase a reserved instance, you can call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation to query available instance resources.</li>
     * </ul>
     * 
     * @param request the request parameters of PurchaseReservedInstancesOffering  PurchaseReservedInstancesOfferingRequest
     * @return PurchaseReservedInstancesOfferingResponse
     */
    CompletableFuture<PurchaseReservedInstancesOfferingResponse> purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you call this operation, make sure that you are familiar with the billing and pricing of SCUs. For more information, see <a href="https://help.aliyun.com/document_detail/137897.html">Storage capacity units</a>.</p>
     * 
     * @param request the request parameters of PurchaseStorageCapacityUnit  PurchaseStorageCapacityUnitRequest
     * @return PurchaseStorageCapacityUnitResponse
     */
    CompletableFuture<PurchaseStorageCapacityUnitResponse> purchaseStorageCapacityUnit(PurchaseStorageCapacityUnitRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The instance must be in the <code>Stopped</code> state.****</li>
     * <li>If an instance has overdue payments for more than 15 days, the instance is stopped and released, and data on the instance can no longer be recovered. You must complete the overdue payments and reactivate the instance within 15 days. If you cannot reactivate an instance that resides in a virtual private cloud (VPC), wait a few minutes and try again.</li>
     * <li>After the operation is called, the instance enters the <code>Starting</code> state.****</li>
     * <li>You cannot call this operation on ECS instances that are locked for security reasons. If <code>OperationLocks</code> in the response returned for the DescribeInstances operation contains <code>LockReason: security</code>, the instance is locked for security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ReActivateInstances  ReActivateInstancesRequest
     * @return ReActivateInstancesResponse
     */
    CompletableFuture<ReActivateInstancesResponse> reActivateInstances(ReActivateInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The disk that you want to re-initialize must be in the <strong>In Use</strong> (In_use) state and the instance to which the disk is attached must be in the <strong>Stopped</strong> (Stopped) state.</li>
     * <li>If an instance has never been started since it was created, the disks attached to it cannot be re-initialized.</li>
     * <li>If a local snapshot has been created for a disk, the disk cannot be re-initialized.</li>
     * <li>If a system disk is re-initialized, the disk is restored to the state of the image from which it was created. If the image has been deleted, the disk cannot be re-initialized.</li>
     * <li>If a separately created data disk is re-initialized, the disk is restored to an empty data disk.</li>
     * <li>If a data disk that was created from a snapshot is re-initialized, the disk is restored to the state of the snapshot.<blockquote>
     * <p> If the source snapshot is deleted, the disk cannot be re-initialized and an error is returned.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ReInitDisk  ReInitDiskRequest
     * @return ReInitDiskResponse
     */
    CompletableFuture<ReInitDiskResponse> reInitDisk(ReInitDiskRequest request);

    /**
     * <b>description</b> :
     * <p>  Only instances that are in the <code>Running</code> state can be restarted.****</p>
     * <ul>
     * <li>After an instance is restarted, the status of the instance changes to <code>Starting</code>.****</li>
     * <li>An instance can be forcibly restarted. A forced restart (<code>ForceStop</code>) is equivalent to performing a hard restart. This operation can cause data loss if data in the instance is not written to the disk.</li>
     * <li>If you call the DescribeInstances operation to query the details of an instance and <code>OperationLocks</code> in the response contains &quot;LockReason&quot;: &quot;security&quot;, the instance is locked for security reasons and cannot be restarted. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of RebootInstance  RebootInstanceRequest
     * @return RebootInstanceResponse
     */
    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The ECS instances to be restarted must be in the <strong>Running</strong> (<code>Running</code>) state.</li>
     * <li>You can use <code>BatchOptimization</code> to specify the batch operation mode and restart multiple instances at a time.</li>
     * <li>Instances can be forcefully restarted. A forced restart (<code>ForceReboot</code>) is equivalent to powering off a traditional server and then starting the server. If data in the instance operating system is not written to block storage devices when the operation is called, the data is lost.</li>
     * <li>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> when you query the information of the instance, the instance is locked for security reasons and all operations are prohibited on it.</li>
     * </ul>
     * 
     * @param request the request parameters of RebootInstances  RebootInstancesRequest
     * @return RebootInstancesResponse
     */
    CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request);

    /**
     * @deprecated OpenAPI RecoverVirtualBorderRouter is deprecated  * @param request  the request parameters of RecoverVirtualBorderRouter  RecoverVirtualBorderRouterRequest
     * @return RecoverVirtualBorderRouterResponse
     */
    @Deprecated
    CompletableFuture<RecoverVirtualBorderRouterResponse> recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request);

    /**
     * <b>description</b> :
     * <p>If a dedicated host is in the UnderAssessment state, we recommend that you call this operation to migrate ECS instances away from the dedicated host to prevent permanent failures. You can call the <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> operation to query the status of a dedicated host.</p>
     * 
     * @param request the request parameters of RedeployDedicatedHost  RedeployDedicatedHostRequest
     * @return RedeployDedicatedHostResponse
     */
    CompletableFuture<RedeployDedicatedHostResponse> redeployDedicatedHost(RedeployDedicatedHostRequest request);

    /**
     * <b>description</b> :
     * <p>RedeployInstance is an asynchronous operation. This operation migrates data before it restarts the instance. After the instance is redeployed, the instance enters the <code>Running</code> state. If the instance fails to be redeployed, the instance returns to the original physical server and the state before redeployment.
     * Take note of the following items:</p>
     * <ul>
     * <li>The instance must be in the Running or Stopped state. After the instance is redeployed, the following changes occur to the status of the instance:<ul>
     * <li>If the instance is in the <code>Running</code> state before redeployment, the instance enters the <code>Stopping</code> state.</li>
     * <li>If the instance is in the <code>Stopped</code> state before redeployment, the instance enters the <code>Starting</code> state.</li>
     * </ul>
     * </li>
     * <li>If an instance is deployed on a dedicated host, you cannot redeploy the instance.</li>
     * <li>If the <code>OperationLocks</code> parameter in the response of the DescribeInstances operation contains <code>&quot;LockReason&quot; : &quot;security&quot;</code> for an instance, the instance is locked for security reasons and cannot be redeployed.</li>
     * <li>If you receive notifications about simulated events that are created by calling the CreateSimulatedSystemEvent operation for an instance, you cannot redeploy the instance.</li>
     * <li>If the damaged local disk is isolated but the <strong>SystemMaintenance.RebootAndReInitErrorDisk</strong> event is not sent when you handle a local disk-related system event for an instance, you can still call the RedeployInstance operation to redeploy the instance. The SystemMaintenance.RebootAndReInitErrorDisk event indicates that the instance is restarted and the damaged disks are reinitialized due to system maintenance. For more information, see <a href="https://help.aliyun.com/document_detail/107693.html">System events for ECS instances equipped with local disks</a>.
     * The following table describes the system events that you can handle by calling the RedeployInstance operation. The table also provides possible event status.<table>
     * <thead>
     * <tr>
     * <th>System event</th>
     * <th>Event status</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Instance restart due to system maintenance (SystemMaintenance.Reboot)</td>
     * <td>Inquiring and Scheduled</td>
     * </tr>
     * <tr>
     * <td>Instance redeployment due to system maintenance (SystemMaintenance.Redeploy)</td>
     * <td>Inquiring and Scheduled</td>
     * </tr>
     * <tr>
     * <td>Instance restart and replacement of damaged disks due to system maintenance (SystemMaintenance.RebootAndIsolateErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td>Instance restart and re-initialization of damaged disks due to system maintenance (SystemMaintenance.RebootAndReInitErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td>Instance redeployment due to system errors (SystemFailure.Redeploy)</td>
     * <td>Inquiring and Scheduled</td>
     * </tr>
     * <tr>
     * <td>For ECS instances that use only local disks: instance restart due to a system error (SystemFailure.Reboot)</td>
     * <td>Executing</td>
     * </tr>
     * <tr>
     * <td>Isolation of damaged disks due to system maintenance (SystemMaintenance.IsolateErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td>Re-initialization of damaged disks due to system maintenance (SystemMaintenance.ReInitErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td><strong>Note</strong>When instances that use local disks are redeployed, the local disks are re-initialized and data on the local disks is cleared.</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RedeployInstance  RedeployInstanceRequest
     * @return RedeployInstanceResponse
     */
    CompletableFuture<RedeployInstanceResponse> redeployInstance(RedeployInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>If the release mode of a capacity reservation that takes effect immediately is set to manual release, you can call this operation to release the capacity reservation.</p>
     * 
     * @param request the request parameters of ReleaseCapacityReservation  ReleaseCapacityReservationRequest
     * @return ReleaseCapacityReservationResponse
     */
    CompletableFuture<ReleaseCapacityReservationResponse> releaseCapacityReservation(ReleaseCapacityReservationRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you release a pay-as-you-go dedicated host, make sure that no ECS instances are deployed on the dedicated host.</p>
     * 
     * @param request the request parameters of ReleaseDedicatedHost  ReleaseDedicatedHostRequest
     * @return ReleaseDedicatedHostResponse
     */
    CompletableFuture<ReleaseDedicatedHostResponse> releaseDedicatedHost(ReleaseDedicatedHostRequest request);

    /**
     * @deprecated OpenAPI ReleaseEipAddress is deprecated  * @param request  the request parameters of ReleaseEipAddress  ReleaseEipAddressRequest
     * @return ReleaseEipAddressResponse
     */
    @Deprecated
    CompletableFuture<ReleaseEipAddressResponse> releaseEipAddress(ReleaseEipAddressRequest request);

    /**
     * @param request the request parameters of ReleasePublicIpAddress  ReleasePublicIpAddressRequest
     * @return ReleasePublicIpAddressResponse
     */
    CompletableFuture<ReleasePublicIpAddressResponse> releasePublicIpAddress(ReleasePublicIpAddressRequest request);

    /**
     * @deprecated OpenAPI RemoveBandwidthPackageIps is deprecated  * @param request  the request parameters of RemoveBandwidthPackageIps  RemoveBandwidthPackageIpsRequest
     * @return RemoveBandwidthPackageIpsResponse
     */
    @Deprecated
    CompletableFuture<RemoveBandwidthPackageIpsResponse> removeBandwidthPackageIps(RemoveBandwidthPackageIpsRequest request);

    /**
     * @param request the request parameters of RemoveTags  RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    /**
     * <b>description</b> :
     * <p>Valid vouchers can be applied when you renew the subscription plan dedicated hosts. In order to use vouchers, make sure that your account supports the credit card payment method.</p>
     * 
     * @param request the request parameters of RenewDedicatedHosts  RenewDedicatedHostsRequest
     * @return RenewDedicatedHostsResponse
     */
    CompletableFuture<RenewDedicatedHostsResponse> renewDedicatedHosts(RenewDedicatedHostsRequest request);

    /**
     * @param request the request parameters of RenewElasticityAssurances  RenewElasticityAssurancesRequest
     * @return RenewElasticityAssurancesResponse
     */
    CompletableFuture<RenewElasticityAssurancesResponse> renewElasticityAssurances(RenewElasticityAssurancesRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, make sure that you are familiar with the billing methods and pricing of ECS. For more information, see the <a href="https://www.alibabacloud.com/product/ecs#pricing">Elastic Compute Service</a> product page.</p>
     * <ul>
     * <li>You can call this operation to renew a subscription instance for a specific period of time or to a synchronized expiration date.</li>
     * <li>You cannot call this operation to renew a subscription instance for a specific period of time and to a synchronized expiration date at the same time. The parameter pair (<code>Period</code> and <code>PeriodUnit</code>) that is related to the renewal period and <code>ExpectedRenewDay</code> are mutually exclusive.</li>
     * <li>Your account must have sufficient credits.</li>
     * </ul>
     * 
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>The IDs of the reserved instances.</p>
     * 
     * @param request the request parameters of RenewReservedInstances  RenewReservedInstancesRequest
     * @return RenewReservedInstancesResponse
     */
    CompletableFuture<RenewReservedInstancesResponse> renewReservedInstances(RenewReservedInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The category of the system disk cannot be changed.</li>
     * <li>The billing method of the system disk cannot be changed.</li>
     * <li>The instance must be in the <code>Stopped</code> state.
     * **
     * <strong>Note</strong> The operation is applicable only to instances of the Virtual Private Cloud (VPC) type. If the instance is a pay-as-you-go instance and economical mode is enabled by default for the instance, you must disable economical mode and enable standard mode when you stop the instance. This prevents the instance from being unable to restart due to insufficient ECS resources after the system disk is replaced. For more information, see <a href="https://help.aliyun.com/document_detail/25501.html">StopInstance</a>.</li>
     * <li>The ECS instance cannot be locked for security reasons. If the value of <code>OperationLocks</code> in the DescribeInstances response contains <code>&quot;LockReason&quot;: &quot;security&quot;</code> for an instance, the instance is locked for security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
     * <li>No unpaid orders are associated with the instance.</li>
     * <li>You can configure <code>SystemDisk.Size</code> to specify the capacity of the new system disk.
     * After you call the ReplaceSystemDisk operation, you can use one of the following methods to check whether the system disk is replaced:</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/25514.html">DescribeDisks</a> operation to query the status of the new system disk. If the new system disk is in the In Use state, the system disk is replaced.</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation to query the status of the instance whose system disk is replaced. If the <code>OperationLocks</code> parameter is empty, the system disk is replaced.</li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceSystemDisk  ReplaceSystemDiskRequest
     * @return ReplaceSystemDiskResponse
     */
    CompletableFuture<ReplaceSystemDiskResponse> replaceSystemDisk(ReplaceSystemDiskRequest request);

    /**
     * @param request the request parameters of ReportInstancesStatus  ReportInstancesStatusRequest
     * @return ReportInstancesStatusResponse
     */
    CompletableFuture<ReportInstancesStatusResponse> reportInstancesStatus(ReportInstancesStatusRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The disk must be in the In Use (In_Use) or Unattached (Available) state.</li>
     * <li>The Elastic Compute Service (ECS) instance to which the disk is attached must be in the Stopped (Stopped) state. You can call the <a href="https://help.aliyun.com/document_detail/155372.html">StopInstances</a> operation to stop an instance.</li>
     * <li>The snapshot specified by the SnapshotId parameter must be created from the disk specified by the DiskId parameter.</li>
     * <li>When you call the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation to query instance information and the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code>, then this indicates that the instance is locked for security reasons and no operations can be performed on the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ResetDisk  ResetDiskRequest
     * @return ResetDiskResponse
     */
    CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request);

    /**
     * <b>description</b> :
     * <p>  Only Alibaba Cloud accounts can call this operation.</p>
     * <ul>
     * <li>Before you can call this operation in a region, you must enable account-level default encryption of Elastic Block Storage (EBS) resources in the region.</li>
     * </ul>
     * 
     * @param request the request parameters of ResetDiskDefaultKMSKeyId  ResetDiskDefaultKMSKeyIdRequest
     * @return ResetDiskDefaultKMSKeyIdResponse
     */
    CompletableFuture<ResetDiskDefaultKMSKeyIdResponse> resetDiskDefaultKMSKeyId(ResetDiskDefaultKMSKeyIdRequest request);

    /**
     * <b>description</b> :
     * <p>This operation will be removed in the future. We recommend that you call the <a href="https://help.aliyun.com/document_detail/25520.html">ResetDisk</a> operation to roll back a disk.</p>
     * 
     * @param request the request parameters of ResetDisks  ResetDisksRequest
     * @return ResetDisksResponse
     */
    CompletableFuture<ResetDisksResponse> resetDisks(ResetDisksRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <blockquote>
     * <p> Before you call this operation to resize a disk, you must check the partition format of the disk. A master boot record (MBR) disk cannot be resized to a size that is larger than 2 TiB. If you resize an MBR disk to a size that is larger than 2 TiB, data may be lost. If you want to resize an MBR disk to a size that is larger than 2 TiB, we recommend that you perform the following steps: Create another data disk that is larger than 2 TiB in size, partition and format the new data disk to GUID partition table (GPT), and then copy data from the MBR disk to the new GPT data disk. For more information, see <a href="https://help.aliyun.com/document_detail/44986.html">Step 1: Resize a disk to extend its capacity</a>.</p>
     * </blockquote>
     * <ul>
     * <li>You can resize disks of the following disk categories: basic disks (<code>cloud</code>), ultra disks (<code>cloud_efficiency</code>), standard SSDs (<code>cloud_ssd</code>), Enterprise SSDs (ESSDs) (<code>cloud_essd</code>), ESSD AutoPL disks (cloud_auto), standard elastic ephemeral disks (elastic_ephemeral_disk_standard), and premium elastic ephemeral disks (elastic_ephemeral_disk_premium).</li>
     * <li>You cannot resize a disk when a snapshot is being created for the disk.</li>
     * <li>The Elastic Compute Service (ECS) instance to which the disk is attached must be in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>After you resize a disk, the partitions and file systems of the disk are not changed. You must allocate the increased storage space on the disk after the disk is resized.</li>
     * <li>Disks for which the multi-attach feature is enabled support online and offline resizing. Before you resize the disks offline, make sure that the instances to which the disks are attached are in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * </ul>
     * 
     * @param request the request parameters of ResizeDisk  ResizeDiskRequest
     * @return ResizeDiskResponse
     */
    CompletableFuture<ResizeDiskResponse> resizeDisk(ResizeDiskRequest request);

    /**
     * <b>description</b> :
     * <p>In the security group-related API documents, inbound traffic refers to the traffic sent by the source and received by the destination.
     * When you call this operation, you can use one of the following groups of parameters to specify the security group rules that you want to delete:</p>
     * <ul>
     * <li>Parameters used to specify the IDs of security group rules. We recommend that you specify the IDs of security group rules to delete the rules. - If the security group rule ID that you specify does not exist, an error is reported. - You cannot specify the parameters that are no longer available and their Permissions.N-prefixed counterparts at the same time. - Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
     * &amp;SecurityGroupId=sg-bp67acfmxazb4p****
     * &amp;SecurityGroupRuleId.1=sgr-bpdfmk****
     * &amp;SecurityGroupRuleId.2=sgr-bpdfmg****
     * &amp;<Common request parameters></li>
     * <li>Parameters that are prefixed with Permissions.N.<ul>
     * <li>If no security group rule matches the specified parameters, the call to RevokeSecurityGroup is successful but no security group rules are deleted.</li>
     * <li>You cannot specify SecurityGroupRuleId.N or the parameters that are not prefixed with Permissions.N.</li>
     * <li>You can determine an inbound security group rule by specifying one of the following groups of parameters. You cannot determine an inbound security group rule by specifying only one parameter.</li>
     * <li>Parameters used to determine an inbound security group rule that controls access from a CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourceCidrIp. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
     * &amp;SecurityGroupId=sg-bp67acfmxazb4p****
     * &amp;Permissions.1.SourceCidrIp=10.0.0.0/8
     * &amp;Permissions.1.IpProtocol=TCP
     * &amp;Permissions.1.PortRange=80/80
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=accept
     * &amp;<Common request parameters></li>
     * <li>Parameters used to determine an inbound security group rule that controls access from another security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourceGroupId. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
     * &amp;SecurityGroupId=sg-bp67acfmxazb4p****
     * &amp;Permissions.1.SourceGroupId=sg-bp67acfmxa123b****
     * &amp;Permissions.1.IpProtocol=TCP
     * &amp;Permissions.1.PortRange=80/80
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=accept
     * &amp;<Common request parameters></li>
     * <li>Parameters used to determine an inbound security group rule that controls access from a prefix list: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourcePrefixListId. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
     * &amp;SecurityGroupId=sg-bp67acfmxazb4p****
     * &amp;Permissions.1.SourcePrefixListId=pl-x1j1k5ykzqlixdcy****
     * &amp;Permissions.1.IpProtocol=TCP
     * &amp;Permissions.1.PortRange=80/80
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=accept
     * &amp;<Common request parameters></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RevokeSecurityGroup  RevokeSecurityGroupRequest
     * @return RevokeSecurityGroupResponse
     */
    CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <p>In the security group-related API documents, outbound traffic refers to the traffic sent by the source and received by the destination.
     * When you call this operation, you can use one of the following groups of parameters to specify the security group rules that you want to delete:</p>
     * <ul>
     * <li>Parameters used to specify the IDs of security group rules. We recommend that you specify the IDs of security group rules to delete the rules. - If the security group rule ID that you specify does not exist, an error is reported. - You cannot specify the parameters that are no longer available and their Permissions.N-prefixed counterparts at the same time. - Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroupEgress
     * &amp;SecurityGroupId=sg-bp67acfmxazb4p****
     * &amp;SecurityGroupRuleId.1=sgr-bpdfmk****
     * &amp;SecurityGroupRuleId.2=sgr-bpdfmg****
     * &amp;<Common request parameters></li>
     * <li>Parameters that are prefixed with Permissions.N.<ul>
     * <li>If no security group rule matches the specified parameters, the call to RevokeSecurityGroupEgress is successful but no security group rules are deleted.</li>
     * <li>You cannot specify SecurityGroupRuleId.N or the parameters that are not prefixed with Permissions.N.</li>
     * <li>You can determine a security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.<ul>
     * <li>Parameters used to determine an outbound security group rule that controls access to a CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceCidrIp (optional), and DestCidrIp. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroupEgress
     * &amp;SecurityGroupId=sg-bp67acfmxazb4ph***
     * &amp;Permissions.1.IpProtocol=TCP
     * &amp;Permissions.1.DestCidrIp=10.0.0.0/8
     * &amp;Permissions.1.PortRange=-22/22
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=accept
     * &amp;<Common request parameters></li>
     * <li>Parameters used to determine an outbound security group rule that controls access to another security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceCidrIp (optional), and DestGroupId. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroupEgress
     * &amp;SecurityGroupId=sg-bp67acfmxazb4ph***
     * &amp;Permissions.1.DestGroupId=sg-bp67acfmxa123b****
     * &amp;Permissions.1.IpProtocol=TCP
     * &amp;Permissions.1.PortRange=22/22
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=accept
     * &amp;<Common request parameters></li>
     * <li>Parameters used to determine an outbound security group rule that controls access to a prefix list: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceCidrIp (optional), and DestPrefixListId. Sample request:
     * http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroupEgress
     * &amp;SecurityGroupId=sg-bp67acfmxazb4ph***
     * &amp;Permissions.1.IpProtocol=TCP
     * &amp;Permissions.1.DestPrefixListId=pl-x1j1k5ykzqlixdcy****
     * &amp;Permissions.1.PortRange=-22/22
     * &amp;Permissions.1.NicType=intranet
     * &amp;Permissions.1.Policy=accept
     * &amp;<Common request parameters></li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RevokeSecurityGroupEgress  RevokeSecurityGroupEgressRequest
     * @return RevokeSecurityGroupEgressResponse
     */
    CompletableFuture<RevokeSecurityGroupEgressResponse> revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Unlike the <a href="https://help.aliyun.com/document_detail/64844.html">CreateCommand</a> and <a href="https://help.aliyun.com/document_detail/64841.html">InvokeCommand</a> operations, the RunCommand operation can be used to create and run a command in a single request.
     * Take note of the following items:</p>
     * <ul>
     * <li>The instances on which you want to run a command must be in the Running (<code>Running</code>) state. You can call the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation to query the status of instances.</li>
     * <li><a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> must be installed on the instances.</li>
     * <li>Before you run a PowerShell command on a Windows instance, make sure that the PowerShell module is installed on the instance.</li>
     * <li>When you use a cron expression to specify a schedule, you can specify a time zone based on your business requirements. If you do not specify a time zone, the schedule is determined by the system time of the instances. Make sure that the time or time zone of the instances meets your business requirements. For information about time zones, see <a href="https://help.aliyun.com/document_detail/92803.html">Configure the NTP service for ECS instances that run CentOS 6</a> or <a href="https://help.aliyun.com/document_detail/51890.html">Configure the NTP service for Windows instances</a>.</li>
     * <li>You can set <code>Timeout</code> to specify the timeout period for executions of the command on ECS instances. If an execution times out, Cloud Assistant Agent forcefully terminates the command process.<ul>
     * <li>When the one-time execution of the command times out, the execution state (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) of the command becomes Failed.</li>
     * <li>For a scheduled task, the timeout period takes effect on each execution of the command. When a command execution times out, the subsequent executions of the command are not affected. When a scheduled execution of the command times out, the execution state (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) of the command becomes Failed.
     * To ensure that scheduled tasks can run as expected, make sure that the version of Cloud Assistant Agent is not earlier than the following ones. A scheduled task can run a command at a specified interval, only once at a specified time, or at designated times based on a cron expression in a specified year or time zone. If the <code>ClientNeedUpgrade</code> error code is returned, you must update Cloud Assistant Agent to the latest version. For more information, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades of Cloud Assistant Agent</a>.<ul>
     * <li>Linux: 2.2.3.282.</li>
     * <li>Windows: 2.1.3.282.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Command executions may fail due to instance status exceptions, network exceptions, or exceptions on Cloud Assistant Agent. If a command execution fails, no execution information is generated. For more information, see the <a href="https://help.aliyun.com/document_detail/87029.html">Command errors and solutions</a> section in the &quot;Check execution results and troubleshoot common issues&quot; topic.</li>
     * <li>If you set <code>EnableParameter</code> to true, the custom parameter feature is enabled. When you configure <code>CommandContent</code>, you can define custom parameters in the <code>{{parameter}}</code> format. Then, when the command is run, the key-value pairs of the custom parameters are passed in.</li>
     * <li>You can retain up to 500 to 50,000 Cloud Assistant commands in each region. You can also apply for a quota increase. For information about how to query and increase quotas, see <a href="https://help.aliyun.com/document_detail/184116.html">Manage quotas</a>.</li>
     * <li>Before you run a command on instances, especially new instances, we recommend that you call the <a href="https://help.aliyun.com/document_detail/87346.html">DescribeCloudAssistantStatus</a> operation to query the status of Cloud Assistant Agent on the instances and run the command when the value of CloudAssistantStatus in the response is true for the instances.</li>
     * </ul>
     * 
     * @param request the request parameters of RunCommand  RunCommandRequest
     * @return RunCommandResponse
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li><strong>Preparations</strong>:<ul>
     * <li>Cost estimation: Learn about the billing methods of ECS resources. For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>.</li>
     * <li>Instance type selection: Call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the performance data of instance types, or see <a href="https://help.aliyun.com/document_detail/58291.html">Best practices for selecting instance types</a> to learn about how to select instance types.</li>
     * <li>Query of available resources: Call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation to query resources available in a specific region or zone.</li>
     * <li>Network planning: Make sure that you have security groups available for use. For more information, see <a href="https://help.aliyun.com/document_detail/25553.html">CreateSecurityGroup</a>. Before you create an instance of the Virtual Private Cloud (VPC) type, <a href="https://help.aliyun.com/document_detail/65430.html">create a VPC</a> in the region where you want to create the instance.</li>
     * </ul>
     * </li>
     * <li><strong>Comparison with CreateInstance</strong>:
     * RunInstances has the following advantages over CreateInstance:<ul>
     * <li>You can call the RunInstances operation to create up to 100 instances at a time, instead of repeatedly calling the CreateInstance operation.</li>
     * <li>After an instance is created, the instance enters the <code>Starting</code> state and then transitions to the <code>Running</code> state. You do not need to call the <a href="https://help.aliyun.com/document_detail/25500.html">StartInstance</a> operation to start the instance.</li>
     * <li>When you create an instance, you can specify <code>InternetMaxBandwidthOut</code> to assign a public IP address to the instance, without the need to call the <a href="https://help.aliyun.com/document_detail/25544.html">AllocatePublicIpAddress</a> operation.</li>
     * <li>You can use <code>AutoReleaseTime</code> to set the time when to automatically release the instances, without the need to call the <a href="https://help.aliyun.com/document_detail/47576.html">ModifyInstanceAutoReleaseTime</a> operation.</li>
     * <li>You can specify <code>LaunchTemplateId</code> and <code>LaunchTemplateVersion</code> to use a launch template. This way, you do not need to configure a large number of parameters every time you create instances.</li>
     * <li>You can specify <code>UniqueSuffix</code> to batch configure sequential names or hostnames for multiple instances for easy management and retrieval.</li>
     * <li>When you call the RunInstances operation to create instances, you can configure the enclave-based confidential computing mode and the trusted system mode for the instances.</li>
     * <li>You can set <code>NetworkOptions.EnableJumboFrame</code> to true to enable the Jumbo Frames feature when you create instances. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">MTUs</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Considerations</strong>:<ul>
     * <li>You can create up to 100 instances at a time.</li>
     * <li>You can use <code>AutoReleaseTime</code> to set the time when to automatically release the instances.</li>
     * <li>After you create instances and obtain their IDs, you can call the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation to check the status of the instances.</li>
     * <li>By default, instances automatically start after they are created. Instances are ready for use when they are in the Running (<code>Running</code>) state.</li>
     * <li>Starting November 27, 2020, the maximum bandwidth value that is available for you to create ECS instances or change ECS instance configurations is subject to the throttling policy of your account. To increase the maximum bandwidth value, submit a ticket. The throttling policy imposes the following constraints: In a single region, the total maximum bandwidth value of all instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s and the total maximum bandwidth value of all instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.</li>
     * <li>Different from the <a href="https://help.aliyun.com/document_detail/25499.html">CreateInstance</a> operation, the <code>RunInstances</code> operation allows the system to assign public IP addresses to new instances if you set <code>InternetMaxBandwidthOut</code> to a value greater than 0.</li>
     * <li>When you call the RunInstances operation to create an instance, you can use one of the following methods to attach a primary elastic network interface (ENI) to the instance. Take note that you can use only one of the methods to configure the primary ENI in each call. Otherwise, the call fails and an error message is returned.<ul>
     * <li>Specify parameters such as <code>SecurityGroupId</code>, <code>VSwitchId</code>, <code>PrivateIpAddress</code>, <code>NetworkInterfaceQueueNumber</code>, and <code>Ipv6AddressCount</code> to configure the primary ENI.</li>
     * <li>Specify parameters that start with <code>NetworkInterface.N.</code> to configure the primary and secondary ENIs. If <code>NetworkInterface.N.InstanceType</code> is set to <code>Primary</code>, the primary ENI is attached to the instance. If <code>NetworkInterface.N.InstanceType</code> is set to <code>Secondary</code> or left empty, the secondary ENI is attached to the instance.</li>
     * </ul>
     * </li>
     * <li>If a parameter is invalid or available resources are insufficient, an error is returned after you call the RunInstances operation. For more information, see the &quot;Error codes&quot; section of this topic.<ul>
     * <li>If the maximum number of instances of the specified instance type that can be created in the specified region or the maximum number of vCPUs for all instance types in a zone is exceeded, the <code>QuotaExceed.ElasticQuota</code> error is returned when you call the operation. You can go to the <a href="https://ecs.console.aliyun.com/?spm=a2c8b.12215451.favorites.decs.5e3a336aMGTtzy#/privileges/quota">ECS console</a> or the <a href="https://quotas.console.aliyun.com/products/ecs/quotas">Quota Center</a> to request a quota increase.</li>
     * <li>If the capacity of disks that belong to the specified disk category exceeds the quota limit for the specified zone, the <code>QuotaExceed.DiskCapacity</code> error is returned when you call the operation. You can go to the <a href="https://quotas.console.aliyun.com/products/disk/quotas">Quota Center</a> to view and increase the disk capacity quota.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li><strong>Best practices</strong>:<ul>
     * <li>We recommend that you use auto provisioning groups in the following scenarios: Resources are insufficient to create more than 100 instances at a time, you want to quickly create instances regardless of resource configurations such as instance types or zones, or you want to create instances to consume a specific total number of vCPUs regardless of the number of instances. You can call the <a href="https://help.aliyun.com/document_detail/122738.html">CreateAutoProvisioningGroup</a> operation to create an auto provisioning group to deploy an instance cluster across different zones, different billing methods, and instance families. For more information, see <a href="https://help.aliyun.com/document_detail/200772.html">Use auto provisioning group-related API operations to batch create ECS instances</a>.</li>
     * <li>You can call the <code>RunInstances</code> operation to batch create instances. To better manage and search for the instances, we recommend that you add tags to the instances by specifying <code>Tag.N.Key</code> and <code>Tag.N.Value</code>. You can also append incremental suffixes (<code>UniqueSuffix</code>) to the hostname (<code>HostName</code>) and to the instance name (<code>InstanceName</code>).</li>
     * <li>A launch template contains parameters required to create an instance so that you do not have to specify these parameters every time you create instances. You can call the <a href="https://help.aliyun.com/document_detail/74686.html">CreateLaunchTemplate</a> operation to create a launch template. Then, in your request to call the <code>RunInstances</code> operation, you can specify <code>LaunchTemplateId</code> and <code>LaunchTemplateVersion</code> to use the launch template.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#-1"></a>Example 1: Create a subscription instance</h3>
     * <p>Use the aliyun_3_x64_20G_alibase_20221102.vhd image to create a one-month subscription instance of the ecs.g7.large instance type in the China (Hangzhou) region, and enable auto-renewal to renew the instance for one month on expiration. The instance uses a 40 GiB enhanced SSD (ESSD) as the system disk and a 100 GiB ESSD as a data disk and is automatically assigned private and public IP addresses. The outbound public bandwidth of the instance is 10 Mbit/s. The instance name is ECS-test and the logon password of the instance is ECS@test1234.
     *     http(s)://ecs.aliyuncs.com/?Action=RunInstances
     *     &amp;RegionId=cn-hangzhou
     *     &amp;ImageId=aliyun_3_x64_20G_alibase_20221102.vhd
     *     &amp;InstanceType=ecs.g7.large
     *     &amp;SecurityGroupId=sg-bp150uqocpf9jj70****
     *     &amp;VSwitchId=vsw-bp1qo7s91cbch5i4l****
     *     &amp;InstanceChargeType=PrePaid
     *     &amp;SystemDisk.Size=40
     *     &amp;DataDisk.1.Size=100
     *     &amp;DataDisk.1.Category=cloud_essd
     *     &amp;SystemDisk.Category=cloud_essd
     *     &amp;Amount=1
     *     &amp;Period=1
     *     &amp;PeriodUnit=Month
     *     &amp;AutoRenew=true
     *     &amp;AutoRenewPeriod=1
     *     &amp;HostName=ECS-test
     *     &amp;Password=ECS@test1234
     *     &amp;InternetMaxBandwidthOut=10
     *     &amp;<Common request parameters></p>
     * <h3><a href="#-2"></a>Example 2: Create a pay-as-you-go instance</h3>
     * <p>Use the aliyun_3_x64_20G_alibase_20221102.vhd image to create a pay-as-you-go instance of the ecs.g7.large instance type in the China (Hangzhou) region. The instance uses a 40 GiB ESSD as the system disk and a 100 GiB ESSD as a data disk and is automatically assigned private and public IP addresses. The outbound public bandwidth of the instance is 10 Mbit/s. The instance name is ECS-test and the logon password of the instance is ECS@test1234.
     *     http(s)://ecs.aliyuncs.com/?Action=RunInstances
     *     &amp;RegionId=cn-hangzhou
     *     &amp;ImageId=aliyun_3_x64_20G_alibase_20221102.vhd
     *     &amp;InstanceType=ecs.g7.large
     *     &amp;SecurityGroupId=sg-bp150uqocpf9jj70****
     *     &amp;VSwitchId=vsw-bp1qo7s91cbch5i4l****
     *     &amp;InstanceChargeType=PostPaid
     *     &amp;SystemDisk.Size=40
     *     &amp;DataDisk.1.Size=100
     *     &amp;DataDisk.1.Category=cloud_essd
     *     &amp;SystemDisk.Category=cloud_essd
     *     &amp;HostName=ECS-test
     *     &amp;Password=ECS@test1234
     *     &amp;InternetMaxBandwidthOut=10
     *     &amp;<Common request parameters></p>
     * <h3><a href="#-3"></a>Example 3: Create a preemptible instance</h3>
     * <p>Use the aliyun_3_x64_20G_alibase_20221102.vhd image to create a preemptible instance of the ecs.g7.large instance type that has a 1-hour protection period in the China (Hangzhou) region. The market price of the instance type at the time of purchase is automatically used as the bidding price. The instance uses a 40 GiB ESSD as the system disk and a 100 GiB ESSD as a data disk and is automatically assigned private and public IP addresses. The outbound public bandwidth of the instance is 10 Mbit/s. The instance name is ECS-test and the logon password of the instance is ECS@test1234.
     *     http(s)://ecs.aliyuncs.com/?Action=RunInstances
     *     &amp;RegionId=cn-hangzhou
     *     &amp;ImageId=aliyun_3_x64_20G_alibase_20221102.vhd
     *     &amp;InstanceType=ecs.g7.large
     *     &amp;SecurityGroupId=sg-bp150uqocpf9jj70****
     *     &amp;VSwitchId=vsw-bp1qo7s91cbch5i4l****
     *     &amp;InstanceChargeType=PostPaid
     *     &amp;SystemDisk.Size=40
     *     &amp;DataDisk.1.Size=100
     *     &amp;DataDisk.1.Category=cloud_essd
     *     &amp;SystemDisk.Category=cloud_essd
     *     &amp;HostName=ECS-test
     *     &amp;Password=ECS@test1234
     *     &amp;InternetMaxBandwidthOut=10
     *     &amp;SpotStrategy=SpotAsPriceGo
     *     &amp;SpotDuration=1
     *     &amp;<Common request parameters></p>
     * <h3><a href="#-4"></a>Example 4: Create a subscription instance on a dedicated host</h3>
     * <p>Use the aliyun_3_x64_20G_alibase_20221102.vhd image to create a one-month subscription instance of the ecs.g7.large instance type on the dh-bp12w10wll9xcjq2\<em>\</em>\<em>\</em> dedicated host in the China (Hangzhou) region. The instance uses a 40 GiB ESSD as the system disk and a 100 GiB ESSD as a data disk and is automatically assigned private and public IP addresses. The outbound public bandwidth of the instance is 10 Mbit/s. The instance name is ECS-test and the logon password of the instance is ECS@test1234.
     *     http(s)://ecs.aliyuncs.com/?Action=RunInstances
     *     &amp;RegionId=cn-hangzhou
     *     &amp;ImageId=aliyun_3_x64_20G_alibase_20221102.vhd
     *     &amp;InstanceType=ecs.g7.large
     *     &amp;SecurityGroupId=sg-bp150uqocpf9jj70****
     *     &amp;VSwitchId=vsw-bp1qo7s91cbch5i4l****
     *     &amp;InstanceChargeType=PrePaid
     *     &amp;Amount=1
     *     &amp;Period=1
     *     &amp;PeriodUnit=Month
     *     &amp;SystemDisk.Size=40
     *     &amp;DataDisk.1.Size=100
     *     &amp;DataDisk.1.Category=cloud_essd
     *     &amp;SystemDisk.Category=cloud_essd
     *     &amp;HostName=ECS-test
     *     &amp;Password=ECS@test1234
     *     &amp;InternetMaxBandwidthOut=10
     *     &amp;DedicatedHostId=dh-bp12w10wll9xcjq2****
     *     &amp;<Common request parameters></p>
     * 
     * @param request the request parameters of RunInstances  RunInstancesRequest
     * @return RunInstancesResponse
     */
    CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The instances to which you want to send a file must be in the Running (<code>Running</code>) state.</li>
     * <li><a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> must be installed on the instances.</li>
     * <li>Only Cloud Assistant Agent versions that are later than the following ones support file sending. If the <code>ClientNeedUpgrade</code> error code is returned, update Cloud Assistant Agent to the latest version.<ul>
     * <li>For Linux instances, the version of Cloud Assistant Agent must be later than 1.0.2.569.</li>
     * <li>For Windows instances, the version of Cloud Assistant Agent must be later than 1.0.0.149.</li>
     * </ul>
     * </li>
     * <li>The file to be sent must not exceed 32 KB in size after it is encoded in Base64.</li>
     * <li>The file may fail to be sent due to instance exceptions, network exceptions, or exceptions on Cloud Assistant Agent. If the file fails to be sent, call the <a href="https://help.aliyun.com/document_detail/184117.html">DescribeSendFileResults</a> operation or see <a href="https://help.aliyun.com/document_detail/87029.html">Check execution results and troubleshoot common issues</a> for troubleshooting.</li>
     * </ul>
     * 
     * @param request the request parameters of SendFile  SendFileRequest
     * @return SendFileResponse
     */
    CompletableFuture<SendFileResponse> sendFile(SendFileRequest request);

    /**
     * <b>description</b> :
     * <p>  After you create an image template, you can call the StartImagePipelineExecution operation to create a pipeline task. The system creates, copies, and shares images based on the parameters configured in the image template.</p>
     * <ul>
     * <li>You can execute only one pipeline task for each image template.</li>
     * </ul>
     * 
     * @param request the request parameters of StartImagePipelineExecution  StartImagePipelineExecutionRequest
     * @return StartImagePipelineExecutionResponse
     */
    CompletableFuture<StartImagePipelineExecutionResponse> startImagePipelineExecution(StartImagePipelineExecutionRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The ECS instance must be in the <code>Stopped</code> state.</li>
     * <li>If <code>OperationLocks</code> in the response of the DescribeInstances operation contains <code>&quot;LockReason&quot; : &quot;security&quot;</code> for an instance, the instance is <a href="https://help.aliyun.com/document_detail/25695.html">locked for security reasons</a> and cannot be started.</li>
     * </ul>
     * 
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The ECS instances that you want to start must be in the <strong>Stopped</strong> state.``</li>
     * <li>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code>, the ECS instance is locked to ensure security. No operations are allowed on the ECS instance.</li>
     * <li>You can start multiple ECS instances at the same time and use the <code>BatchOptimization</code> parameter to specify the batch operation mode.</li>
     * </ul>
     * 
     * @param request the request parameters of StartInstances  StartInstancesRequest
     * @return StartInstancesResponse
     */
    CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>When you use custom code to connect to an ECS instance that serves as a client, you can call this operation to obtain the WebSocket URL that is used to connect to the instance. Take note of the following items:</p>
     * <ul>
     * <li>The ECS instance must be in the Running state.</li>
     * <li>Cloud Assistant Agent must be installed on the ECS instance. You can call the <a href="https://help.aliyun.com/document_detail/87346.html">DescribeCloudAssistantStatus</a> operation to check whether Cloud Assistant Agent is installed on the ECS instance and query the version number of the installed Cloud Assistant Agent.<ul>
     * <li>If Cloud Assistant Agent is not installed on the ECS instance, call the <a href="https://help.aliyun.com/document_detail/85916.html">InstallCloudAssistant</a> operation to install Cloud Assistant Agent.</li>
     * <li>The Cloud Assistant Agent versions that are later than the following ones support the session management feature. If you need to upgrade the Cloud Assistant Agent version, follow the instructions in <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.<ul>
     * <li>Linux operating system: 2.2.3.256</li>
     * <li>Windows operating system: 2.1.3.256</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Each WebSocket URL returned by the StartTerminalSession operation remains valid for 10 minutes.</li>
     * <li>Up to 1,000 sessions can be created and available in a region. Each ECS instance can have up to 20 sessions in the connected state.</li>
     * </ul>
     * 
     * @param request the request parameters of StartTerminalSession  StartTerminalSessionRequest
     * @return StartTerminalSessionResponse
     */
    CompletableFuture<StartTerminalSessionResponse> startTerminalSession(StartTerminalSessionRequest request);

    /**
     * <b>description</b> :
     * <p>  If you call the DescribeInstances operation to query the details of an instance and <code>OperationLocks</code> in the response contains <code>&quot;LockReason&quot;: &quot;security&quot;</code>, the instance is locked for security reasons and cannot be stopped. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</p>
     * <ul>
     * <li>If the economical mode is enabled, you can set <code>StoppedMode</code> to KeepCharging to switch to the standard mode. This allows an instance that is stopped in standard mode to retain its instance type resources and public IP address. However, you continue to be charged for the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> when you query the information of an instance, the instance is locked for security reasons. No operations are allowed on the instance.</li>
     * <li>After you enable economical mode for a pay-as-you-go instance that resides in a virtual private cloud (VPC), you can set <code>StoppedMode</code> to KeepCharging. This way, the pay-as-you-go instance continues to be billed after the instance is stopped. The instance type resources and public IP address of the instance are retained.</li>
     * <li>Batch operations are supported. You can use <code>BatchOptimization</code> to specify the batch operation mode.</li>
     * </ul>
     * 
     * @param request the request parameters of StopInstances  StopInstancesRequest
     * @return StopInstancesResponse
     */
    CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>If you stop the process of a command that runs only once, the executions that have started are not interrupted. The executions that have not started are canceled.</li>
     * <li>If you stop the process of a command that runs on a schedule, the executions that have started are not interrupted. Subsequent executions are not scheduled.</li>
     * </ul>
     * 
     * @param request the request parameters of StopInvocation  StopInvocationRequest
     * @return StopInvocationResponse
     */
    CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number of tags is reached, an error message is returned. For more information, see the &quot;Tag limits&quot; section in <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @deprecated OpenAPI TerminatePhysicalConnection is deprecated  * @param request  the request parameters of TerminatePhysicalConnection  TerminatePhysicalConnectionRequest
     * @return TerminatePhysicalConnectionResponse
     */
    @Deprecated
    CompletableFuture<TerminatePhysicalConnectionResponse> terminatePhysicalConnection(TerminatePhysicalConnectionRequest request);

    /**
     * @deprecated OpenAPI TerminateVirtualBorderRouter is deprecated  * @param request  the request parameters of TerminateVirtualBorderRouter  TerminateVirtualBorderRouterRequest
     * @return TerminateVirtualBorderRouterResponse
     */
    @Deprecated
    CompletableFuture<TerminateVirtualBorderRouterResponse> terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The ENI must be in the <strong>Available</strong> (Available) or <strong>InUse</strong> (InUse) state.</li>
     * <li>If the ENI is a primary ENI, the Elastic Compute Service (ECS) instance to which the ENI is attached must be in the <strong>Running</strong> (Running) or <strong>Stopped</strong> (Stopped) state.</li>
     * </ul>
     * 
     * @param request the request parameters of UnassignIpv6Addresses  UnassignIpv6AddressesRequest
     * @return UnassignIpv6AddressesResponse
     */
    CompletableFuture<UnassignIpv6AddressesResponse> unassignIpv6Addresses(UnassignIpv6AddressesRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The ENI from which to unassign secondary private IP addresses must be in the <strong>Available</strong> (Available) or <strong>InUse</strong> (InUse) state.</li>
     * <li>If the ENI is a primary ENI, the Elastic Compute Service (ECS) instance to which the ENI is attached must be in the <strong>Running</strong> (Running) or <strong>Stopped</strong> (Stopped) state.</li>
     * </ul>
     * 
     * @param request the request parameters of UnassignPrivateIpAddresses  UnassignPrivateIpAddressesRequest
     * @return UnassignPrivateIpAddressesResponse
     */
    CompletableFuture<UnassignPrivateIpAddressesResponse> unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request);

    /**
     * @deprecated OpenAPI UnassociateEipAddress is deprecated  * @param request  the request parameters of UnassociateEipAddress  UnassociateEipAddressRequest
     * @return UnassociateEipAddressResponse
     */
    @Deprecated
    CompletableFuture<UnassociateEipAddressResponse> unassociateEipAddress(UnassociateEipAddressRequest request);

    /**
     * @deprecated OpenAPI UnassociateHaVip is deprecated  * @param request  the request parameters of UnassociateHaVip  UnassociateHaVipRequest
     * @return UnassociateHaVipResponse
     */
    @Deprecated
    CompletableFuture<UnassociateHaVipResponse> unassociateHaVip(UnassociateHaVipRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
