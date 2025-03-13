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
     * @deprecated OpenAPI AddTags is deprecated, please use Ecs::2014-05-26::TagResources instead.  * @description When you call this operation, take note of the following items:
     * *   Up to 20 tags can be added to each ECS resource.
     * *   `Tag.N.Key` must match `Tag.N.Value` based on the value of N.
     * *   If you add a tag that has the same key (`Tag.N.Key`) as an existing tag on the specified resource, the new tag value (`Tag.N.Value`) overwrites the original tag value.
     * 
     * @param request the request parameters of AddTags  AddTagsRequest
     * @return AddTagsResponse
     */
    @Deprecated
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
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>The ECS instance to which you want to assign a static public IP address must be in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>If <code>OperationLocks</code> in the response of the DescribeInstances operation contains <code>&quot;LockReason&quot; : &quot;security&quot;</code> for an ECS instance, the instance is <a href="https://help.aliyun.com/document_detail/25695.html">locked for security reasons</a> and cannot be assigned a static public IP address.</li>
     * <li>When you call the AllocatePublicIpAddress operation for an ECS instance, make sure that the public bandwidth of the instance is greater than 0 Mbit/s. You can call the <a href="https://help.aliyun.com/document_detail/2679879.html">ModifyInstanceNetworkSpec</a> operation to change the public bandwidth.</li>
     * </ul>
     * <h3><a href="#"></a>Considerations</h3>
     * <ul>
     * <li>Only users in the whitelist can specify <code>IpAddress</code> in the AllocatePublicIpAddress operation. If the public bandwidth of your ECS instance is greater than 0 Mbit/s, you can specify the ID of the instance (<code>InstanceId</code>) to randomly assign a static public IP address to the instance. If the public bandwidth of your ECS instance is 0 Mbit/s, you must call the <a href="https://help.aliyun.com/document_detail/2679879.html">ModifyInstanceNetworkSpec</a> operation to increase the public bandwidth of the instance before you call the AllocatePublicIpAddress operation.</li>
     * <li>You can assign only one static public IP address to an ECS instance. If the instance already has a static public IP address, the static public IP address is returned for the <code>IpAddress</code> response parameter.</li>
     * <li>After you assign a static public IP address to an ECS instance, you must restart the instance (<a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a>) or start the instance (<a href="https://help.aliyun.com/document_detail/25500.html">StartInstance</a>) for the public IP address to take effect.
     * If an ECS instance resides in a virtual private cloud (VPC), you can assign a static public IP address to the instance or associate an elastic IP address (EIP) with the instance. For more information, see <a href="https://help.aliyun.com/document_detail/2518064.html">AssociateEipAddress</a>.</li>
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
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The ECS instance and the disk must reside in the same zone.</li>
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
     * <li>You must configure logon credentials for the ECS instance.</li>
     * <li>The disk cannot be an elastic ephemeral disk.</li>
     * <li>For more information about how to attach a system disk, see <a href="https://help.aliyun.com/document_detail/146752.html">Detach or attach a system disk</a>.</li>
     * </ul>
     * </li>
     * <li>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> when you query information about an ECS instance, the instance is locked for security reasons. No operations are allowed on the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachDisk  AttachDiskRequest
     * @return AttachDiskResponse
     */
    CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2679686.html">DescribeInstanceRamRole</a> operation to query the <a href="https://help.aliyun.com/document_detail/61175.html">instance RAM roles</a> that are attached to ECS instances.</p>
     * <blockquote>
     * <p> If an ECS instance already has an instance RAM role, an error is returned when you attach another instance RAM role to the instance.</p>
     * </blockquote>
     * 
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
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li><strong>Quantity limit</strong>: The total number of inbound security group rules in each security group cannot exceed 200. For more information, see the <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a> section of the &quot;Limits&quot; topic.</li>
     * <li><strong>Rule types</strong>: For inbound security group rules, you can set Policy to accept or drop to specify whether to allow or deny access.</li>
     * <li><strong>Rule priorities</strong>: For inbound security group rules, the valid values of Priority range from 1 to 100. A smaller value indicates a higher priority. When multiple security group rules have the same priority, drop rules take precedence.</li>
     * </ul>
     * <h3><a href="#"></a>Considerations</h3>
     * <ul>
     * <li>If the security group rule that you call the AuthorizeSecurityGroup operation to create exists in the security group, the call is successful but no security group rule is created.</li>
     * </ul>
     * <h3><a href="#"></a>Parameters that define a security group rule</h3>
     * <p>Define an inbound security group rule by configuring the following parameters together:</p>
     * <ul>
     * <li>Source: You can specify one parameter from SourceCidrIp (IPv4 address), Ipv6SourceCidrIp (IPv6 address), SourcetPrefixListId (prefix list ID), and SourceGroupId (source security group ID).</li>
     * <li>PortRange: specifies the range of destination port numbers.</li>
     * <li>IpProtocol: specifies the protocol.</li>
     * <li>Policy: specifies the action.<blockquote>
     * <p> Advanced security groups do not support security group rules that reference security groups as authorization objects. Each basic security group can contain up to 20 security group rules that reference security groups as authorization objects.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Sample requests</h3>
     * <p>Sample requests to create inbound security group rules that control access to different sources in a security group in the China (Hangzhou) region:---to different sources or from different sources?</p>
     * <ul>
     * <li>Sample request to create an inbound security group rule that controls access to a specific CIDR block: to or from?
     * &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, // The region ID.
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,   // The ID of the security group.&quot;Permissions&quot;:[
     *      {
     *        &quot;SourceCidrIp&quot;:&quot;10.0.0.0/8&quot;, // The source IPv4 CIDR block.       &quot;PortRange&quot;:&quot;22/22&quot; // The port range.
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;, //The protocol.
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;, //The action.
     *      }
     * ]</li>
     * <li>Sample request to create an inbound security group rule that controls access to a security group and an inbound security group rule that controls access to a prefix list:----to or from?
     * &quot;RegionId&quot;:&quot;cn-hangzhou&quot;,
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *      {
     *        &quot;SourceGroupId&quot;:&quot;sg-bp17vs63txqxbd****&quot;, // The source security group.
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      },{
     *        &quot;SourcePrefixListId&quot;:&quot;pl-x1j1k5ykzqlixdcy****&quot;, //The ID of the source prefix list.
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      }
     * ]</li>
     * </ul>
     * 
     * @param request the request parameters of AuthorizeSecurityGroup  AuthorizeSecurityGroupRequest
     * @return AuthorizeSecurityGroupResponse
     */
    CompletableFuture<AuthorizeSecurityGroupResponse> authorizeSecurityGroup(AuthorizeSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li><strong>Quantity limit</strong>: The total number of outbound security group rules in each security group cannot exceed 200. For more information, see the <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a> section of the &quot;Limits&quot; topic.</li>
     * <li><strong>Rule types</strong>: For outbound security group rules, you can set Policy to accept or drop to specify whether to allow or deny access.</li>
     * <li><strong>Rule priorities</strong>: For outbound security group rules, the valid values of Priority range from 1 to 100. A smaller value indicates a higher priority. When multiple security group rules have the same priority, drop rules take precedence.</li>
     * </ul>
     * <h3><a href="#"></a>Considerations</h3>
     * <ul>
     * <li>If the security group rule that you call the AuthorizeSecurityGroupEgress operation to create exists in the security group, the call is successful but no security group rule is created.</li>
     * </ul>
     * <h3><a href="#"></a>Parameters that define a security group rule</h3>
     * <p>Define an outbound security group rule by configuring the following parameters together:</p>
     * <ul>
     * <li>One of the following parameters: DestCidrIp, Ipv6DestCidrIp, DestPrefixListId, and DestGroupId. DestCidrIp specifies the destination IPv4 CIDR block. Ipv6DestCidrIp specifies the destination IPv6 CIDR block. DestPrefixListId specifies the ID of the destination prefix list. DestGroupId specifies the destination security group.</li>
     * <li>PortRange: specifies the range of destination port numbers.</li>
     * <li>IpProtocol: specifies the protocol.</li>
     * <li>Policy: specifies the action.<blockquote>
     * <p> Advanced security groups do not support security group rules that reference security groups as authorization objects. Each basic security group can contain up to 20 security group rules that reference security groups as authorization objects.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Sample requests</h3>
     * <p>Sample requests to create outbound security group rules that control access to different destinations in a security group in the China (Hangzhou) region:</p>
     * <ul>
     * <li>Sample request to create an outbound security group rule that controls access to a specified CIDR block:
     * &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, //The region ID.
     * &quot;SecurityGroupId&quot;:&quot;sg-bp17vs63txqxbds9***&quot;, //The ID of the source security group.
     * &quot;Permissions&quot;:[
     *      {
     *        &quot;DestCidrIp&quot;:&quot;10.0.0.0/8&quot;, //The destination IPv4 CIDR block.
     *        &quot;PortRange&quot;:&quot;-1/-1&quot;, //The range of destination port numbers.
     *        &quot;IpProtocol&quot;:&quot;ICMP&quot;, //The protocol.       &quot;Policy&quot;:&quot;Accept&quot; //The action.
     *      }
     * ]</li>
     * <li>Sample request to create an outbound security group rule that controls access to a security group and an outbound security group rule that controls access to a prefix list:
     * &quot;RegionId&quot;:&quot;cn-hangzhou&quot;,
     * &quot;SecurityGroupId&quot;:&quot;sg-bp17vs63txqxbds9***&quot;,
     * &quot;Permissions&quot;:[
     *      {
     *        &quot;DestGroupId&quot;:&quot;sg-bp67acfmxazb4pi***&quot;, //The ID of the destination security group.
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      },{
     *        &quot;DestPrefixListId&quot;:&quot;pl-x1j1k5ykzqlixdcy****&quot;, //The ID of the destination prefix list.
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      }
     * ]</li>
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
     * <p>Before you call the CancelImagePipelineExecution operation, make sure that the image building task to be canceled is in the BUILDING, PREPARING, or REPAIRING state.</p>
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
     * <li>Custom images that belong to your Alibaba Cloud account can be copied across regions. Images that are shared with you by others can be copied only within the regions where the images reside.</li>
     * <li>When an image is being copied, the new image cannot be deleted by calling the <a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a> operation. However, you can cancel the ongoing image copy task by calling the <a href="https://help.aliyun.com/document_detail/25539.html">CancelCopyImage</a> operation.</li>
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
     * <p>After you use an activation code to register a server that is not provided by Alibaba Cloud as an Alibaba Cloud managed instance, you can use various online services of Alibaba Cloud, such as Cloud Assistant, CloudOps Orchestration Service (OOS), and Apsara Devops, on the managed instance.
     * If a server is not provided by Alibaba Cloud, you can register the server as an Alibaba Cloud managed instance only if the server has Internet connectivity and runs one of the following operating systems:</p>
     * <ul>
     * <li>Alibaba Cloud Linux 2, Alibaba Cloud Linux 3, or later</li>
     * <li>CentOS 6, CentOS 7, CentOS 8, or later</li>
     * <li>Debian 8, Debian 9, Debian 10, or later</li>
     * <li>Ubuntu 12, Ubuntu 14, Ubuntu 16, Ubuntu 18, or later</li>
     * <li>CoreOS</li>
     * <li>OpenSUSE</li>
     * <li>Red Hat 5, Red Hat 6, Red Hat 7, or later</li>
     * <li>SUSE Linux Enterprise Server 11, SUSE Linux Enterprise Server 12, SUSE Linux Enterprise Server 15, or later</li>
     * <li>Windows Server 2012, Windows Server 2016, Windows Server 2019, or later
     * You can have up to 5,000 activation codes per Alibaba Cloud region. When the number of activation codes exceeds 1,000, the usage of the activation codes must be greater than 50% before you can create additional activation codes.<blockquote>
     * <p> To obtain the usage of activation codes, go to the <strong>ECS Cloud Assistant</strong> page in the Elastic Compute Service (ECS) console, click the <strong>Manage Instances</strong> tab, and then click <strong>Register Instance</strong>.</p>
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
     * <p>Before you call this operation, learn about how to <a href="https://help.aliyun.com/document_detail/127767.html">create an automatic snapshot policy</a>.
     * Take note of the following items:</p>
     * <ul>
     * <li>You can create up to 100 automatic snapshot policies per region for a single Alibaba Cloud account. If the maximum number of automatic snapshots for a disk is reached and a new snapshot creation task is created, the system deletes the oldest automatic snapshot of the disk.</li>
     * <li>If the instance to which a disk is attached is being stopped or restarted, the system cannot create snapshots for the disk based on the associated automatic snapshot policy.</li>
     * <li>If cross-region snapshot replication is enabled and no encryption parameters are configured, encrypted snapshots are copied to the destination region and snapshot copies are encrypted by using the service key of the destination region. For more information about the limits on cross-region snapshot replication, see <a href="https://help.aliyun.com/document_detail/159441.html">Copy a snapshot</a>.
     * After the automatic snapshot policy is created, call the <a href="https://help.aliyun.com/document_detail/25531.html">ApplyAutoSnapshotPolicy</a> operation to apply the policy to disks. If you want to modify the automatic snapshot policy, call the <a href="https://help.aliyun.com/document_detail/25529.html">ModifyAutoSnapshotPolicyEx</a> operation.</li>
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
     * <p>  You can enable the multi-attach (<code>MultiAttach</code>) feature when you create a disk. Before you enable the multi-attach feature, we recommend that you familiarize yourself with the feature and the limits on the feature. For more information, see <a href="https://help.aliyun.com/document_detail/256487.html">NVMe protocol</a> and <a href="https://help.aliyun.com/document_detail/262105.html">Use the multi-attach feature to attach a cloud disk to multiple ECS instances</a>.</p>
     * <ul>
     * <li>You can create disks of the following disk categories: basic disks, ultra disks, standard SSDs, Enterprise SSDs (ESSDs), ESSD Entry disks, Regional ESSDs, ESSD AutoPL disks, standard elastic ephemeral disks, and premium elastic ephemeral disks.</li>
     * <li>Before you can create a disk, you must complete real-name verification. Complete real-name verification on the <a href="https://account.console.aliyun.com/#/auth/home">Real-name Verification</a> page in the Alibaba Cloud Management Console.</li>
     * <li>When you create disks, you may be charged for the resources used. We recommend that you familiarize yourself with the billing methods of Elastic Compute Service (ECS) resources before you create a disk. For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>.</li>
     * <li>When you call this operation to create a disk, specific parameters are automatically specified.<ul>
     * <li><code>DeleteAutoSnapshot</code> is automatically set to <code>true</code> when a disk is created. This indicates that the automatic snapshots of the disk are deleted when the disk is released. You can call the <a href="https://help.aliyun.com/document_detail/2679767.html">DescribeDisks</a> operation to query the DeleteAutoSnapshot value for the disk and call the <a href="https://help.aliyun.com/document_detail/25517.html">ModifyDiskAttribute</a> operation to change the DeleteAutoSnapshot value for the disk.</li>
     * <li>If you do not specify a performance level when you create an ESSD, the performance level of the ESSD is automatically set to PL1. To change the performance level of the ESSD, you can call the <a href="https://help.aliyun.com/document_detail/123780.html">ModifyDiskSpec</a> operation.</li>
     * <li><code>Portable</code> is automatically set to <code>true</code> when a disk is created, which indicates that the disk is a pay-as-you-go disk.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateDisk  CreateDiskRequest
     * @return CreateDiskResponse
     */
    CompletableFuture<CreateDiskResponse> createDisk(CreateDiskRequest request);

    /**
     * <b>description</b> :
     * <p>Elasticity Assurance provides a new method to purchase and use guaranteed resources in a flexible manner. Elasticity Assurance is a resource reservation service that provides assured access to resources for pay-as-you-go Elastic Compute Service (ECS) instances. For more information, see <a href="https://help.aliyun.com/document_detail/193630.html">Overview of Elasticity Assurance</a>.</p>
     * <ul>
     * <li>After you purchase an elasticity assurance, you cannot request a refund for the elasticity assurance. For information about the billing of elasticity assurances, see <a href="https://help.aliyun.com/document_detail/432502.html">Resource assurance</a>.</li>
     * <li>Elasticity assurances can be used to create only pay-as-you-go ECS instances.</li>
     * <li>Elasticity assurances only support the unlimited mode. You can set <code>AssuranceTimes</code> only to <code>Unlimited</code>. Elasticity assurances in unlimited mode can be used for an unlimited number of times within their terms. Elasticity assurances in unlimited mode take effect immediately after creation.</li>
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
     * <p>Before you call this operation, read <a href="https://help.aliyun.com/document_detail/172789.html">Overview</a>.
     * Take note of the following items:</p>
     * <ul>
     * <li>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> when you query information about an ECS instance, the instance is locked for security reasons, and you cannot create a custom image from the instance.</li>
     * <li>To optimize the image, we recommend that you specify <code>DetectionStrategy</code> when you create a custom image. For more information, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview</a>.</li>
     * <li>You can use the created custom image only if the image is in the Available (<code>Available</code>) state.
     * You can call the CreateImage operation to create a custom image by using one of the following methods. The following request parameters are sorted by priority from high to low: <code>InstanceId</code> &gt; <code>DiskDeviceMapping</code> &gt; <code>SnapshotId</code>. If your request contains two or more of the preceding parameters, the custom image is created based on the parameter that has a higher priority.</li>
     * <li><strong>Create a custom image from an ECS instance</strong>. You need to only specify the instance ID by using <code>InstanceId</code>. The instance must be in the Running (<code>Running</code>) or Stopped (<code>Stopped</code>) state. After you call the CreateImage operation, a snapshot is created for each disk of the instance. When you create a custom image from a running ECS instance, cache data may not be written to disks. In this case, the data of the custom image may be slightly different from the data of the instance. Before you create a custom image from the instance, we recommend that you stop the instance by calling the <a href="https://help.aliyun.com/document_detail/155372.html">StopInstances</a> operation.</li>
     * <li><strong>Create a custom image from a system disk snapshot of an ECS instance</strong>. You need to only specify the ID of the system disk snapshot by using <code>SnapshotId</code>. The specified system disk snapshot must be created after July 15, 2013.</li>
     * <li><strong>Create a custom image from multiple snapshots</strong>. You must specify data mappings between the snapshots and the disks to be created by using the parameters that start with <code>DiskDeviceMapping</code>. Take note of the following items:<ul>
     * <li>You can specify only one snapshot to create the system disk in the custom image. The device name of the system disk must be /dev/xvda.</li>
     * <li>You can specify up to 16 snapshots to create data disks in the custom image. The device names of the data disks must be unique and range from /dev/xvdb to /dev/xvdz in alphabetical order.</li>
     * <li>You can leave <code>SnapshotId</code> empty. In this case, an empty data disk with the specified size is created.</li>
     * <li>The specified snapshot must be created after July 15, 2013.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateImage  CreateImageRequest
     * @return CreateImageResponse
     */
    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>You can create only custom image components.</li>
     * <li>Each version number of an image component must be unique. When you add a version of an image component to an image template, you can specify the component by its name and version number.</li>
     * <li>The content size of an image component cannot exceed 16 KB. For information about the commands supported by Image Builder, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by Image Builder</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/197410.html">Image Builder</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageComponent  CreateImageComponentRequest
     * @return CreateImageComponentResponse
     */
    CompletableFuture<CreateImageComponentResponse> createImageComponent(CreateImageComponentRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can use image templates to customize image content and create images across regions and accounts. Take note of the following items:</p>
     * <ul>
     * <li>You can create only custom image templates.</li>
     * <li>You can specify only a public image, a custom image, a shared image, or an image family as the source image when you create an image template.</li>
     * <li>When you use an image template to create an image, multiple intermediate instances are created. You are charged for the intermediate instances on a pay-as-you-go basis. For more information, see <a href="https://help.aliyun.com/document_detail/40653.html">Pay-as-you-go</a>.
     * When you use <code>BuildContent</code> to specify the build content in an image template, take note of the following items:</li>
     * <li>The <code>FROM</code> command is deprecated. Regardless of whether you specify the <code>FROM</code> command in <code>BuildContent</code>, the system uses the source image specified by <code>BaseImageType</code> and <code>BaseImage</code>. BaseImageType specifies the type of the source image and BaseImage specifies the source image.</li>
     * <li>The size of BuildContent cannot exceed 16 KB. For information about the commands supported by Image Builder, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by Image Builder</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/197410.html">Image Builder</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImagePipeline  CreateImagePipelineRequest
     * @return CreateImagePipelineResponse
     */
    CompletableFuture<CreateImagePipelineResponse> createImagePipeline(CreateImagePipelineRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is no longer iterated or updated. We recommend that you call the <a href="https://help.aliyun.com/document_detail/2679677.html">RunInstances</a> operation instead.
     * <strong>Before you call this operation, familiarize yourself with the billing rules and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of ECS resources.</strong>
     * This operation is an asynchronous operation. After a request to create an ECS instance is sent, an ECS instance ID is immediately returned but the instance may be still being created. You can call the <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> operation to query the status of the instance. If the status of the instance is <code>Stopped</code> in the DescribeInstanceStatus response, the instance is created. In this case, you can call the <a href="https://help.aliyun.com/document_detail/2679679.html">StartInstance</a> operation to start the instance.</p>
     * </blockquote>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <ul>
     * <li>Make sure that you are familiar with the ECS billing methods because you may be charged for the resources that are used by the instance. For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>.</li>
     * <li>Make sure that the number of ECS instances you create or the number of vCPUs on ECS instances of all instance types you create does not exceed the corresponding quota. Go to the <a href="https://quotas.console.aliyun.com/products/ecs/quotas">Quota Center</a> to view the quotas.</li>
     * <li>Before you create ECS instances of the Virtual Private Cloud (VPC) type in a region, create a VPC in the region. For more information, see <a href="https://help.aliyun.com/document_detail/65430.html">Create a VPC</a>.</li>
     * </ul>
     * <h3><a href="#"></a>Considerations</h3>
     * <ul>
     * <li>If you create a subscription instance (<code>PrePaid</code>), available coupons in your account are automatically used.</li>
     * <li>If you want to create instances with 512 MiB of memory, you cannot use Windows Server images except for Windows Server Semi-Annual Channel images. If you want to create instances with 4 GiB or more of memory, you cannot use 32-bit OS image.</li>
     * <li>If you call the CreateInstance operation to create an instance, no public IP address is automatically assigned to the instance. If the InternetMaxBandwidthOut value of the instance is greater than 0 Mbit/s, call the <a href="https://help.aliyun.com/document_detail/25544.html">AllocatePublicIpAddress</a> operation to assign a public IP address to the instance. If the InternetMaxBandwidthOut value of the instance is 0 Mbit/s, call the <a href="https://help.aliyun.com/document_detail/2679879.html">ModifyInstanceNetworkSpec</a> operation to set InternetMaxBandwidthOut to a value greater than 0 Mbit/s and then call the <a href="https://help.aliyun.com/document_detail/25544.html">AllocatePublicIpAddress</a> operation to assign a public IP address to the instance.<blockquote>
     * <p> For the limits on the sum of maximum public bandwidths of ECS instances that use the pay-by-bandwidth billing method for network usage per region per Alibaba Cloud account, see the <a href="~~25412#BandwidthQuota~~">Public bandwidth limits</a> section of the &quot;Limits&quot; topic.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Suggestions</h3>
     * <ul>
     * <li><strong>Instance type selection</strong>: See <a href="https://help.aliyun.com/document_detail/25378.html">Overview of instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the performance data of instance types, or see <a href="https://help.aliyun.com/document_detail/58291.html">Instance type selection</a> to learn about how to select instance types.</li>
     * <li><strong>Query of available resources</strong>: Call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation to query resources available in a specific region or zone.</li>
     * <li><strong>User data</strong>: If the instance type supports <a href="https://help.aliyun.com/document_detail/49121.html">user data</a>, you can use UserData to pass in user data. We recommend that you do not pass in confidential information, such as passwords or private keys, in plaintext as user data. This is because the system does not encrypt <code>UserData</code> values when API requests are sent. If you must pass in confidential information as user data, we recommend that you encrypt and encode the information in Base64 before you pass in the information. Then, decode and decrypt the information within the instance for subsequent use.</li>
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
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>This operation is a synchronous operation. After an ENI is created, the ENI immediately enters the Available (<code>Available</code>) state and can be attached to an Elastic Compute Service (ECS) instance.</li>
     * <li>If <code>NetworkInterfaceId</code> is empty in the response, no ENI is created. Recall the operation to create an ENI.</li>
     * <li>An ENI can be attached only to a single ECS instance that resides in a virtual private cloud (VPC).</li>
     * <li>When an ENI is detached from an ECS instance and attached to another ECS instance, the attributes of the ENI remain unchanged and network traffic is redirected to the new instance.</li>
     * <li>When you call this operation to create an ENI, you can assign up to 49 secondary private IP addresses to the ENI.</li>
     * <li>If you want to assign IPv6 addresses when you create an ENI, make sure that IPv6 is enabled for the vSwitch with which you want to associate the ENI. For more information, see <a href="https://help.aliyun.com/document_detail/98896.html">What is an IPv6 gateway?</a></li>
     * <li>A limit is imposed on the number of ENIs that can be created per Alibaba Cloud region per account. You can view the quota limit in the ECS console. For more information, see <a href="https://help.aliyun.com/document_detail/184115.html">Manage ECS quotas</a>.</li>
     * </ul>
     * <h3><a href="#"></a>Sample requests</h3>
     * <p><strong>Create an ENI</strong>
     *     RegionId:  cn-hangzhou,   // Specify the China (Hangzhou) region.SecurityGroupId:  sg-bp10jztp6b0sdsyl****,   // Specify the ID of the security group in which to create the ENI.VSwitchId:  vsw-bp19wo63nleroq22g****,   // Specify the ID of the vSwitch to which to connect the ENI.
     * <strong>Create an ENI and specify an IP address as the primary private IP address of the ENI</strong>
     *     RegionId:  cn-hangzhou,   // Specify the China (Hangzhou) region.SecurityGroupId:  sg-bp10jztp6b0sdsyl****,   // Specify the ID of the security group in which to create the ENI.VSwitchId:  vsw-bp19wo63nleroq22g****,   // Specify the ID of the vSwitch to which to connect the ENI.PrimaryIpAddress:  192.168.0.*,   // Specify an IP address as the primary private IP address of the ENI.</p>
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
     * <p>  By default, the internal access control policy (InnerAccessPolicy) of the basic security group that you create by calling this operation is internal interconnectivity (<strong>Accept</strong>). You can call the <a href="https://help.aliyun.com/document_detail/2679846.html">ModifySecurityGroupPolicy</a> operation to change the value of InnerAccessPolicy for the basic security group.</p>
     * <ul>
     * <li>By default, the internal access control policy (InnerAccessPolicy) of the advanced security group that you create by calling this operation is internal isolation (<strong>Drop</strong>). The InnerAccessPolicy value of the advanced security group cannot be changed.</li>
     * <li>You can create a limited number of security groups per region. You can create at least 100 security groups per region. For more information, see the <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a> section in the &quot;Limits&quot; topic.</li>
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
     * <p>The local snapshot feature is replaced by the instant access feature. Take note of the following items:</p>
     * <ul>
     * <li>If you have used the local snapshot feature before December 14, 2020, you can use <code>Category</code>.</li>
     * <li>If you have not used the local snapshot feature before December 14, 2020, new snapshots of your Enterprise SSD (ESSD) series disks are instantly available after creation without the need for additional configurations, regardless of whether the snapshots are manually or automatically created. ESSD-series disks include ESSDs, ESSD AutoPL disks, ESSD Entry disks, and Regional ESSDs. InstantAccess, InstantAccessRetentionDays, and DisableInstantAccess that are related to the instant access feature no longer take effect in API operations. Available is added to the DescribeSnapshots and DescribeSnapshotGroups operations to indicate whether snapshots are available.
     * Prerequisites:</li>
     * <li>Elastic Compute Service (ECS) Snapshot is activated. For more information, see <a href="https://help.aliyun.com/document_detail/108381.html">Activate ECS Snapshot</a>.</li>
     * <li>The disk for which you want to create a snapshot is in the <strong>In_use</strong> or <strong>Available</strong> state. Take note of the following items:<ul>
     * <li>If the disk is in the <strong>In_use</strong> state, make sure that the ECS instance to which the disk is attached is in the <strong>Running</strong> or <strong>Stopped</strong> state.</li>
     * <li>If the disk is in the <strong>Available</strong> state, make sure that the disk was attached to an ECS instance. Snapshots cannot be created for disks that have never been attached to an ECS instance.</li>
     * <li>When you use a disk to create a dynamic extended volume or a RAID array, we recommend that you create a snapshot-consistent group and enable the application-consistent snapshot feature to back up data. When a business system involves multiple disks, you can create a snapshot-consistent group to ensure a consistent write order and the crash consistency of business system data. For more information, see <a href="https://help.aliyun.com/document_detail/199625.html">Create a snapshot-consistent group</a> and <a href="https://help.aliyun.com/document_detail/208589.html">Create application-consistent snapshots</a>.
     * When you create a snapshot, take note of the following items:</li>
     * </ul>
     * </li>
     * <li>We recommend that you create snapshots during off-peak hours because snapshot creation degrades disk I/O performance by up to 10% and slows down data reads and writes.</li>
     * <li>If a snapshot is being created, you cannot use this snapshot to create a custom image by calling the <a href="https://help.aliyun.com/document_detail/25535.html">CreateImage</a> operation.</li>
     * <li>If operations are performed on the disk and incremental data is generated when a snapshot is being created, the incremental data is not included in the snapshot.</li>
     * <li>When a snapshot is being created for a disk that is attached to an ECS instance, do not perform operations that change the status of the instance, such as stopping or restarting the instance. Otherwise, the snapshot may fail to be created.</li>
     * <li>You cannot resize a disk for which a snapshot is being created. Wait until the snapshot is created before you resize the disk.</li>
     * <li>You can create snapshots for a disk that is in the <strong>Expired</strong> (<code>Expired</code>) state. If the release time scheduled for a disk arrives while a snapshot is being created for the disk, the snapshot is in the <strong>Creating</strong> (<code>Creating</code>) state and is deleted when the disk is released.</li>
     * <li>After you create snapshots, you are charged snapshot storage fees per region based on the total size of the snapshots that are stored in the region. For more information, see <a href="https://help.aliyun.com/document_detail/56159.html">Snapshots</a>.</li>
     * <li>In the following scenarios, you cannot create snapshots for a disk:<ul>
     * <li>The number of manual snapshots of the disk has reached 256.</li>
     * <li>A snapshot is being created for the disk.</li>
     * <li>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> when you query information about an ECS instance, the instance is locked for security reasons and no operations are allowed on the instance.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request);

    /**
     * <b>description</b> :
     * <p>You can specify <code>InstanceId</code> to create a snapshot-consistent group for disks on a specific ECS instance. You can also specify <code>DiskId.N</code> to create a snapshot-consistent group for multiple disks on multiple ECS instances within the same zone.</p>
     * <blockquote>
     * <p> You cannot specify both <code>DiskId.N</code> and <code>ExcludeDiskId.N</code> in the same request. If you specify <code>InstanceId</code>, you can use <code>DiskId.N</code> to specify only disks on the specified ECS instance and cannot use DiskId.N to specify disks across ECS instances.
     * Take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>The disks for which you want to create a snapshot must be in the <strong>In Use</strong> (<code>In_use</code>) or <strong>Unattached</strong> (<code>Available</code>) state.<ul>
     * <li>If a disk is in the <strong>In Use</strong> (<code>In_use</code>) state, make sure that the ECS instance to which the disk is attached is in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>If a disk is in the <strong>Unattached</strong> (<code>Available</code>) state, make sure that the disk has been attached to ECS instances. Snapshots cannot be created for disks that have never been attached to an ECS instance.</li>
     * </ul>
     * </li>
     * <li>Snapshot-consistent groups can be used to create snapshots only for Enterprise SSDs (ESSDs), ESSD AutoPL disks, and ESSD Entry disks.</li>
     * <li>A snapshot-consistent group can contain snapshots of up to 16 disks, including system disks and data disks, and cannot exceed 32 TiB in size.</li>
     * <li>Snapshots that you created are stored indefinitely until you delete the snapshots. We recommend that you delete unnecessary snapshots on a regular basis to prevent excess snapshot storage fees.</li>
     * <li>Snapshot-consistent groups cannot be created for disks for which multi-attach feature is enabled. If disks for which the multi-attach feature is enabled are attached to an ECS instance, you must specify the <code>ExcludeDiskId.N</code> parameter to exclude the disks.
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you call this operation to delete an activation code, make sure that no managed instances are registered with the activation code.</p>
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
     * @deprecated OpenAPI DeleteDemand is deprecated, please use Ecs::2014-05-26::ReleaseCapacityReservation instead.  * @description >  This operation is in invitational preview and is not publicly available.
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
     * <ul>
     * <li><strong>Warning</strong> After you release an instance, the physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</li>
     * <li>After you release an instance, manual snapshots of the cloud disks attached to the instance are retained and continue to be billed. You can call the <a href="https://help.aliyun.com/document_detail/2679824.html">DeleteSnapshot</a> operation to delete the snapshots.</li>
     * <li>After you release an instance, whether the cloud disks attached to the instance and the automatic snapshots of the disks are released is determined by the disk attributes. Before you release an instance, you can call the <a href="https://help.aliyun.com/document_detail/2679767.html">DescribeDisks</a> and <a href="https://help.aliyun.com/document_detail/2679770.html">ModifyDiskAttribute</a> operations to query and modify disk attributes.<ul>
     * <li>The cloud disks for which <code>DeleteWithInstance</code> is set to false are retained as pay-as-you-go disks after the instance is released. The cloud disks for which DeleteWithInstance is set to true are released along with the instance.</li>
     * <li>If <code>DeleteAutoSnapshot</code> is set to false for a cloud disk attached to the instance, the automatic snapshots of the cloud disk are retained when the instance is released. If DeleteAutoSnapshot is set to true for the cloud disk, the automatic snapshots of the disk are released along with the instance.</li>
     * </ul>
     * </li>
     * <li>Elastic IP addresses (EIPs) are not released together with instances. You can call the <a href="https://help.aliyun.com/document_detail/448702.html">ReleaseEipAddress</a> operation to release EIPs.
     * **
     * <strong>Note</strong> When you release an instance that is locked for security reasons, the cloud disks attached to the instance are released even if DeleteWithInstance is set to false.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning</strong> After you release an instance, the physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.</li>
     * <li>After you release an instance, manual snapshots of the cloud disks attached to the instance are retained and continue to be billed. You can call the <a href="https://help.aliyun.com/document_detail/2679824.html">DeleteSnapshot</a> operation to delete the snapshots.</li>
     * <li>After you release an instance, whether the cloud disks attached to the instance and the automatic snapshots of the disks are released is determined by the disk attributes. Before you release an instance, you can call the <a href="https://help.aliyun.com/document_detail/2679767.html">DescribeDisks</a> and <a href="https://help.aliyun.com/document_detail/2679770.html">ModifyDiskAttribute</a> operations to query and modify disk attributes.<ul>
     * <li>If <code>DeleteWithInstance</code> is set to false for a cloud disk attached to the instance, the cloud disk is changed to a pay-as-you-go disk and retained after the instance is released. If DeleteWithInstance is set to true for the cloud disk, the disk is released together with the instance.</li>
     * <li>If <code>DeleteAutoSnapshot</code> is set to false for a cloud disk attached to the instance, the automatic snapshots of the disk are retained when the instance is released. If DeleteAutoSnapshot is set to true for the cloud disk, the automatic snapshots of the disk are released together with the instance.</li>
     * </ul>
     * </li>
     * <li>Elastic IP addresses (EIPs) are not released together with instances. You can call the <a href="https://help.aliyun.com/document_detail/448702.html">ReleaseEipAddress</a> operation to release EIPs.
     * **
     * <strong>Note</strong> When you release an instance that is locked for security reasons, the cloud disks attached to the instance are released together with the instance even if DeleteWithInstance is set to false for the disks.</li>
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
     * <p>  Make sure that no Elastic Compute Service (ECS) instances exist in the security group. You can query instances by calling the <a href="https://help.aliyun.com/document_detail/2679689.html">DescribeInstances</a> operation.</p>
     * <ul>
     * <li>Make sure that no elastic network interfaces (ENIs) exist in the security group. You can query ENIs by calling the <a href="https://help.aliyun.com/document_detail/2679884.html">DescribeNetworkInterfaces</a> operation.</li>
     * <li>Make sure that the security group that you want to delete is not referenced by rules of other security groups. You can query the associations by calling the <a href="https://help.aliyun.com/document_detail/57320.html">DescribeSecurityGroupReferences</a> operation.</li>
     * <li>If the <code>InvalidOperation.DeletionProtection</code> error code is returned when you call the DeleteSecurityGroup operation to delete a security group, the deletion protection feature is enabled for the security group. When you create a Container Service for Kubernetes (ACK) cluster, the deletion protection feature is enabled for an associated security group to prevent accidental deletion. You cannot manually disable the deletion protection feature for the security group. The deletion protection feature can be automatically disabled only after the ACK cluster is deleted. For more information, see the <a href="https://help.aliyun.com/document_detail/353191.html">Disable deletion protection for a security group</a> section of the &quot;Configure and manage security groups for an ACK cluster&quot; topic.</li>
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>If a disk snapshot that is contained in a snapshot-consistent group has been used to create a custom image, the disk snapshot is retained after the snapshot-consistent group is deleted. Before you can delete the disk snapshot, you must call the <a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a> operation to delete the custom image. Then, you can call the <a href="https://help.aliyun.com/document_detail/25525.html">DeleteSnapshot</a> operation to delete the disk snapshot.</p>
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
     * @deprecated OpenAPI DeleteVSwitch is deprecated, please use Vpc::2016-04-28::DeleteVSwitch instead.  * @param request  the request parameters of DeleteVSwitch  DeleteVSwitchRequest
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can use one of the following methods to check the responses:</p>
     * <ul>
     * <li>Method 1: During a paged query, when you call the DescribeActivations operation to retrieve the first page of results, use <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token, which you can use in the next request to retrieve a new page of results. When you call the DescribeActivations operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
     * <li>Method 2: Use <code>PageSize</code> to specify the number of entries to return on each page, and then use <code>PageNumber</code> to specify the number of the page to return. You can use only one of the preceding methods. If you specify <code>MaxResults</code> or <code>NextToken</code>, the <code>PageSize</code> and <code>PageNumber</code> request parameters do not take effect and the <code>TotalCount</code> response parameter is invalid.</li>
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
     * <li>During a paged query, when you call the DescribeCloudAssistantStatus operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results. When you call the DescribeCloudAssistantStatus operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
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
     * <li>During a paged query, when you call the DescribeCommands operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results. When you call the DescribeCommands operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
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
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>Monitoring data of only disks that are in the In Use (<code>In_use</code>) state can be queried. For more information, see <a href="https://help.aliyun.com/document_detail/25689.html">Disk states</a>.
     * **
     * <strong>Note</strong> Some information may be missing from the monitoring data of a disk because the disk is not in the In Use <code>(In_use)</code> state and the system cannot obtain the relevant information.</li>
     * <li>Up to 400 monitoring data entries can be returned at a time. Make sure that the <code>TotalCount</code> value does not exceed 400. The value is calculated by using the following formula: <code>TotalCount = (EndTime - StartTime)/Period</code>. If the TotalCount value is greater than 400, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.</li>
     * <li>You can query the monitoring data in the last 30 days. If the value of <code>StartTime</code> is more than 30 days earlier than the current time, an error is returned.</li>
     * </ul>
     * <h2><a href="#"></a>Sample requests</h2>
     * <p>For example, you want to query the monitoring data of a cloud disk whose ID is <code>d-bp14emm68wx98vjk****</code> in the China (Hangzhou) region every 600 seconds from <code>2025-02-17T00:00:00Z</code> to <code>2025-02-18T10:00:00Z</code>. Request parameters:
     *     RegionId:&quot;cn-hangzhou&quot;, // Set the region ID to cn-hangzhou, which specifies the China (Hangzhou) region.
     *     DiskId:&quot;d-bp14emm68wx98vjk****&quot;, // Specify the disk ID.
     *     StartTime:&quot;2025-02-15T00:00:00Z&quot;, // Specify the beginning of the time range to query.
     *     EndTime:&quot;2025-02-17T00:00:00Z&quot;, // Specify the end of the time range to query.
     *     Period:&quot;600&quot;, // Specify the interval at which to retrieve the monitoring data.</p>
     * 
     * @param request the request parameters of DescribeDiskMonitorData  DescribeDiskMonitorDataRequest
     * @return DescribeDiskMonitorDataResponse
     */
    CompletableFuture<DescribeDiskMonitorDataResponse> describeDiskMonitorData(DescribeDiskMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <p>  You can specify multiple request parameters such as <code>RegionId</code>, <code>ZoneId</code>, <code>DiskIds</code>, and <code>InstanceId</code> as filters. The specified parameters are evaluated by using the &quot;AND&quot; operator. If you specify more than one filter, the records that match all filters are returned.</p>
     * <ul>
     * <li>The value of <code>DiskIds</code> is a JSON array. If you do not specify DiskIds, the parameter is not used as a filter. If you set <code>DiskIds</code> to an empty JSON array, the parameter is regarded as a valid filter, and an empty result is returned.</li>
     * <li>Token-based paged query: Use <code>NextToken</code> to configure the query token. Set the value to the <code>NextToken</code> value returned in the previous call to the DescribeDisks operation. Then, use <code>MaxResults</code> to specify the maximum number of entries to return on each page.</li>
     * <li>You can attach a disk for which the multi-attach feature is enabled to multiple instances. You can query the attachment information of the disk based on the <code>Attachment</code> values in the response.
     * When you call the API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter formats</a>.</li>
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
     * @param request the request parameters of DescribeElasticityAssuranceAutoRenewAttribute  DescribeElasticityAssuranceAutoRenewAttributeRequest
     * @return DescribeElasticityAssuranceAutoRenewAttributeResponse
     */
    CompletableFuture<DescribeElasticityAssuranceAutoRenewAttributeResponse> describeElasticityAssuranceAutoRenewAttribute(DescribeElasticityAssuranceAutoRenewAttributeRequest request);

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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>If no available image exists in a specific image family, the response is empty.</p>
     * 
     * @param request the request parameters of DescribeImageFromFamily  DescribeImageFromFamilyRequest
     * @return DescribeImageFromFamilyResponse
     */
    CompletableFuture<DescribeImageFromFamilyResponse> describeImageFromFamily(DescribeImageFromFamilyRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>The image template that is specified by the <code>ImagePipelineId</code> parameter cannot be a deleted image template. When an image template is deleted, the corresponding image creation task is deleted.</li>
     * <li>You must specify <code>ImagePipelineId</code> or <code>ExecutionId</code>.</li>
     * <li>You can configure the query token by using the <code>NextToken</code> parameter. Set NextToken to the value of <code>NextToken</code> that was returned the previous call to the <code>DescribeImagePipelineExecutions</code> operation. Then, use the <code>MaxResults</code> parameter to specify the maximum number of entries to return on each page.</li>
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>After an elasticity assurance or a capacity reservation is created, a private pool is generated and associated with information about the instances that are created by using the private pool. You can specify a private pool when you create an instance. This way, the instance matches the elasticity assurance or capacity reservation that is associated with the private pool.
     * When a private pool expires, data related to the association between instances and the private pool becomes invalid. If you call this operation to query information about the private pool, empty values are returned.</p>
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
     * <p>  Only subscription instances are supported. If you call this operation for a pay-as-you-go instance, an error is returned.</p>
     * <ul>
     * <li>Before you configure auto-renewal or manual renewal for subscription instances, you can query the auto-renewal status of the instances.</li>
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>When you call the API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter formats</a>.</p>
     * 
     * @param request the request parameters of DescribeInstanceRamRole  DescribeInstanceRamRoleRequest
     * @return DescribeInstanceRamRoleResponse
     */
    CompletableFuture<DescribeInstanceRamRoleResponse> describeInstanceRamRole(DescribeInstanceRamRoleRequest request);

    /**
     * <b>description</b> :
     * <p>For information about the lifecycle states of an ECS instance, see <a href="https://help.aliyun.com/document_detail/25687.html">Instance lifecycle</a>.</p>
     * <h2><a href="#"></a>Sample requests</h2>
     * <ul>
     * <li>Query the ECS instances and the status of the instances in a <strong>specific region</strong>. Sample request:<!---->
     * &quot;RegionID&quot;: &quot;cn-hangzhou&quot;</li>
     * <li>Query the ECS instances and the status of the instances in a <strong>zone</strong> of a <strong>specific region</strong>. Sample request:<!---->
     * &quot;RegionID&quot;: &quot;cn-hangzhou&quot;,
     * &quot;ZoneID&quot;: &quot;cn-hangzhou-a&quot;</li>
     * <li>Query the status of an ECS instance in a <strong>specific region</strong> based on the <strong>instance ID</strong>. Sample request:<!---->
     * &quot;RegionID&quot;: &quot;cn-hangzhou&quot;,
     * &quot;InstancesID&quot;: [&quot;i-bp1f7c1zqp999zvp****&quot;, &quot;i-bp1dqjv36biueg61****&quot;]</li>
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
     * <p>  You cannot directly use the VNC logon address (VncUrl) in the response to log on to an ECS instance. To log on to the ECS instance, you can use the <strong>web management terminal URL</strong> that contains the VNC logon address.</p>
     * <blockquote>
     * <p> To construct a web management terminal URL, add the <code>vncUrl=\\*\\*\\*\\*</code>, <code>instanceId=****</code>, and <code>isWindows=true/false</code> parameters at the end of <code>https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?</code>. Separate each parameter with an ampersand (<code>&amp;</code>). Parameter description:</p>
     * </blockquote>
     * <ul>
     * <li><code>vncUrl</code>: the VNC logon address.</li>
     * <li><code>instanceId</code>: the instance ID.</li>
     * <li><code>isWindows</code>: specifies whether the operating system of your ECS instance is Windows. A value of <code>true</code> specifies that the operating system is Windows. A value of <code>false</code> specifies that the operating system is not Windows.</li>
     * <li>You can connect to an ECS instance without using a VNC logon password. Therefore, you do not need to specify the <code>password</code> parameter.</li>
     * <li>The keepalive time of a connection to a VNC management terminal is 300 seconds. If you do not interact with the VNC management terminal within 300 seconds, the VNC management terminal is automatically disconnected.</li>
     * <li>If the connection is interrupted, you must call the DescribeInstanceVncUrl operation to obtain a new VNC logon address (<code>VncUrl</code>) and use the new logon address to construct a new web management terminal URL that you can use to reconnect to the VNC management terminal. You can reconnect to a VNC management terminal up to 30 times per minute.
     * Sample web management terminal URL:
     * <a href="https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%****&instanceId=i-wz9hhwq5a6tm****&isWindows=true">https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%****&amp;instanceId=i-wz9hhwq5a6tm****&amp;isWindows=true</a></li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceVncUrl  DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     */
    CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request);

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>When you call the API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</li>
     * <li>If you use a Resource Access Management (RAM) user or RAM role that does not have the permissions to call this operation, an empty list is returned.</li>
     * </ul>
     * <h3><a href="#"></a>Suggestions</h3>
     * <ul>
     * <li>Specify DryRun in the request to perform a dry run. In the dry run, the system checks the validity and authorization status of the parameters.</li>
     * <li>During a paged query, when you call the DescribeInstances operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results. When you call the DescribeInstances operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
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
     * <li>During a paged query, when you call the DescribeInvocationResults operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results. When you call the DescribeInvocationResults operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
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
     * <p>  After you run a command, the command may fail to run or may return unexpected results. You can call this operation to query the execution results.</p>
     * <ul>
     * <li>You can query information about command executions within the last four weeks. Up to 100,000 pieces of execution information can be retained.</li>
     * <li>You can <a href="https://help.aliyun.com/document_detail/2669130.html">subscribe to Cloud Assistant task status events</a> to obtain command execution results from the events. This helps you reduce the number of times to poll API operations and improve efficiency.</li>
     * <li>During a paged query, when you call the DescribeInvocations operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results. When you call the DescribeInvocations operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
     * <li>Differences between the <code>DescribeInvocations</code> and <code>DescribeInvocationResults</code> operations:<ul>
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
     * <p>During a paged query, when you call the DescribeManagedInstances operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results. When you call the DescribeManagedInstances operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</p>
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
     * <p>You can specify the <code>AddressFamily</code>, <code>PrefixListId.N</code>, and <code>PrefixListName</code> request parameters in the request. Specified parameters have logical AND relations. Only the parameters that you set are included in the filter conditions.</p>
     * 
     * @param request the request parameters of DescribePrefixLists  DescribePrefixListsRequest
     * @return DescribePrefixListsResponse
     */
    CompletableFuture<DescribePrefixListsResponse> describePrefixLists(DescribePrefixListsRequest request);

    /**
     * <b>description</b> :
     * <p>The required parameters vary based on the type of resource whose prices you want to query.</p>
     * <ul>
     * <li>When <code>ResourceType</code> is set to instance, you must specify <code>InstanceType</code>. By default, <code>ChargeType</code> is set to <code>PostPaid</code>. You can specify <code>PriceUnit</code> to query the ECS resource prices in different billing cycles.</li>
     * <li>When <code>ResourceType</code> is set to disk, you must specify <code>DataDisk.1.Category</code> and <code>DataDisk.1.Size</code> in the same request. When <code>ResourceType</code> is set to disk, only pay-as-you-go prices of cloud disks are returned. In this scenario, <code>PriceUnit</code> can be set only to <code>Hour</code>.</li>
     * <li>When <code>ResourceType</code> is set to diskperformance, you must specify <code>DataDisk.1.Category</code> and <code>DataDisk.1.ProvisionedIops</code>.</li>
     * <li>When <code>ResourceType</code> is set to ddh, you must specify <code>DedicatedHostType</code>.</li>
     * <li>When <code>ResourceType</code> is set to ElasticityAssurance, you must specify <code>InstanceType</code>.</li>
     * <li>When <code>ResourceType</code> is set to CapacityReservation, you must specify <code>InstanceType</code>.</li>
     * <li>When <code>ResourceType</code> is set to bandwidth, only the pay-by-traffic (<code>PayByTraffic</code>) prices for network usage are returned.</li>
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
     * <b>description</b> :
     * <h3><a href="#"></a>Scenarios</h3>
     * <ul>
     * <li>Query all reserved instances in a specific region.</li>
     * <li>Query the details of a reserved instance based on the ID or name.</li>
     * <li>Query your purchased reserved instances based on the instance type or instance family.</li>
     * <li>Query your purchased reserved instances based on the scope or status of reserved instances.</li>
     * </ul>
     * <h3><a href="#"></a>Sample requests</h3>
     * <p><strong>Example: Query all purchased reserved instances in the China (Hangzhou) region</strong>
     *     &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, //The ID of the region.
     * <strong>Example: Query the details of the reserved instance whose ID is ecsri-bp129enntoynwwj5\<em>\</em>\<em>\</em> in the China (Hangzhou) region</strong>
     *     &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, //The ID of the region.&quot;ReservedInstanceId&quot;:&quot;ecsri-bp129enntoynwwj5****&quot; //The ID of the reserved instance.
     * <strong>Example: Query the reserved instances that can be used to offset the bills of ecs.c5.2xlarge instances in the China (Hangzhou) region</strong>
     *     &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, //The ID of the region.&quot;InstanceType&quot;:&quot;ecs.c5.2xlarge&quot;, //The instance type.
     * <strong>Example: Query the regional reserved instances that are within the validity period in the China (Hangzhou) region</strong>
     *     &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, //The ID of the region.&quot;Scope&quot;:&quot;Region&quot;, //Set the scope of the reserved instance to regional.&quot;Status&quot;:[&quot;Active&quot;] //Set the status to Active, which indicates that the reserved instance is within the validity period.</p>
     * 
     * @param request the request parameters of DescribeReservedInstances  DescribeReservedInstancesRequest
     * @return DescribeReservedInstancesResponse
     */
    CompletableFuture<DescribeReservedInstancesResponse> describeReservedInstances(DescribeReservedInstancesRequest request);

    /**
     * @deprecated OpenAPI DescribeResourceByTags is deprecated, please use Tag::2018-08-28::ListResourcesByTag instead.  * @param request  the request parameters of DescribeResourceByTags  DescribeResourceByTagsRequest
     * @return DescribeResourceByTagsResponse
     */
    @Deprecated
    CompletableFuture<DescribeResourceByTagsResponse> describeResourceByTags(DescribeResourceByTagsRequest request);

    /**
     * <b>description</b> :
     * <p>Examples of common scenarios in which this operation is used:</p>
     * <h3><a href="#-1"></a>Example 1: Query the instance types to which you can change the instance type of an instance.</h3>
     * <p>Query the instance types to which you can change the instance type of the i-bp67acfmxazb4p\<em>\</em>\<em>\</em> instance and the inventory of the queried instance types in the zone in which the instance resides.
     *     http(s)://ecs.aliyuncs.com/?Action=DescribeResourcesModification
     *     &amp;RegionId=cn-hangzhou
     *     &amp;ResourceId=i-bp67acfmxazb4p****
     *     &amp;DestinationResource=InstanceType
     *     &amp;OperationType=Upgrade
     *     &amp;<Common request parameters></p>
     * <h3><a href="#-2"></a>Example 2: Query the instance types to which you can change the instance type of an instance after a system disk category change.</h3>
     * <p>Query the instance types to which you can change the instance type of the i-bp67acfmxazb4p\<em>\</em>\<em>\</em> instance after a system disk category change and the inventory of the queried instance types in the zone in which the instance resides.
     *     http(s)://ecs.aliyuncs.com/?Action=DescribeResourcesModification
     *     &amp;RegionId=cn-hangzhou
     *     &amp;ResourceId=i-bp67acfmxazb4p****
     *     &amp;DestinationResource=InstanceType
     *     &amp;OperationType=Upgrade
     *     &amp;Conditions.0=DiskCategory
     *     &amp;<Common request parameters></p>
     * <h3><a href="#-3"></a>Example 3: Query the system disk categories supported by the instance type to which you want to change the instance type of an instance.</h3>
     * <p>Query the system disk categories supported by the instance type to which you want to change the instance type of the i-bp67acfmxazb4p\<em>\</em>\<em>\</em> instance and the inventory of the disk categories in the zone in which the instance resides. In this example, the ecs.g7.large instance type is used. To change to the instance type, you must change the system disk category of the instance to a category supported by the instance type.</p>
     * <blockquote>
     * <p> You can call this operation as described in Example 2 to query the instance types to which you can change the instance type of an instance.
     *     http(s)://ecs.aliyuncs.com/?Action=DescribeResourcesModification
     *     &amp;RegionId=cn-hangzhou
     *     &amp;ResourceId=i-bp67acfmxazb4p****
     *     &amp;DestinationResource=SystemDisk
     *     &amp;OperationType=Upgrade
     *     &amp;InstanceType=ecs.g7.large
     *     &amp;<Common request parameters></p>
     * </blockquote>
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
     * <p>  If you cannot delete a security group by calling the <a href="https://help.aliyun.com/document_detail/25558.html">DeleteSecurityGroup</a> operation, call the DescribeSecurityGroupReferences operation to check whether the security group is referenced by the rules of other security groups. If the security group is referenced by the rules of other security groups, you must call the <a href="https://help.aliyun.com/document_detail/2679855.html">RevokeSecurityGroup</a> and <a href="https://help.aliyun.com/document_detail/2679856.html">RevokeSecurityGroupEgress</a> operations to remove the references before you can delete the security group.</p>
     * 
     * @param request the request parameters of DescribeSecurityGroupReferences  DescribeSecurityGroupReferencesRequest
     * @return DescribeSecurityGroupReferencesResponse
     */
    CompletableFuture<DescribeSecurityGroupReferencesResponse> describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Paged query</strong>: We recommend that you specify <code>MaxResults</code> and <code>NextToken</code>.
     *     *   If the response does not include <code>NextToken</code>, the current page of results is the last page and no more results are to be returned.
     *     *   During a paged query, when you call the DescribeSecurityGroups operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results.
     *     *   When you call the DescribeSecurityGroups operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</p>
     * <ul>
     * <li>When you use Alibaba Cloud CLI to call an API operation, you must specify request parameter values of different data types in required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter formats</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityGroups  DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     */
    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>When you send a file, the file may fail to be sent to specific Elastic Compute Service (ECS) instances. You can call this operation to check the file sending results.</li>
     * <li>You can call this operation to query the file sending records within the last six weeks.</li>
     * <li>During a paged query, when you call the DescribeSendFileResults operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results. When you call the DescribeSendFileResults operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSendFileResults  DescribeSendFileResultsRequest
     * @return DescribeSendFileResultsResponse
     */
    CompletableFuture<DescribeSendFileResultsResponse> describeSendFileResults(DescribeSendFileResultsRequest request);

    /**
     * <b>description</b> :
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
     * <p>You can specify multiple request parameters, such as <code>InstanceId</code>, <code>DiskId</code>, and <code>SnapshotIds</code>, to query snapshots. The specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
     * When you use Alibaba Cloud CLI to call an API operation, you must specify request parameter values of different data types in required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter formats</a>.
     * Sample requests:
     * <strong>Query the snapshots of all cloud disks attached to an Elastic Compute Service (ECS) instance in the China (Hangzhou) region</strong>
     *     RegionId:  cn-hangzhou,   // Specify the China (Hangzhou) region.InstanceId:  i-bp1fh7by6d9mw7zr****   // Specify the ID of the instance that you want to query.
     * <strong>Query the snapshots of a specific cloud disk in the China (Hangzhou) region</strong>
     *     RegionId:  cn-hangzhou,   // Specify the China (Hangzhou) region.DiskId:   d-bp10e7ej8z743dmu****   // Specify the ID of the cloud disk that you want to query.
     * <strong>Query information about two snapshots in the China (Hangzhou) region by snapshot ID</strong>
     *     RegionId:  cn-hangzhou,   // Specify the China (Hangzhou) region.SnapshotIds:   [&quot;d-bp10e7ej8z743dmu****&quot;, &quot;s-bp19vd1lorzgzt2s****&quot;]   // Specify the IDs of the snapshots that you want to query.
     * <strong>Query snapshots created after a specific point in time in the China (Hangzhou) region</strong>
     *     RegionId:  cn-hangzhou,   // Specify the China (Hangzhou) region.Filter.1.Key:   CreationStartTime,   // Specify a point in time to query snapshots that were created after the specified point in time.Filter.1.Value:   2024-11-27T00:00Z</p>
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
     * <p>  This operation is applicable only to I/O optimized preemptible instances that reside in virtual private clouds (VPCs).</p>
     * <ul>
     * <li>You can use one of the following methods to call this operation:<ul>
     * <li>Specify <code>Cores</code> and <code>Memory</code> or <code>MinCores</code> and <code>MinMemory</code> to query information about the instance types that meet the specified vCPU and memory requirements.</li>
     * <li>Specify <code>InstanceTypes.N</code> to query information about the specified instance types.</li>
     * <li>Specify <code>Cores</code> and <code>Memory</code> or <code>MinCores</code> and <code>MinMemory</code>, and then specify <code>InstanceTypeFamily</code> or <code>InstanceFamilyLevel</code> to query information about the instance types that meet the specified vCPU and memory requirements within the specified instance family or at a specified instance family level.</li>
     * </ul>
     * </li>
     * <li>You can calculate the average price of preemptible instances based on the percentage of the average preemptible instance price relative to the pay-as-you-go instance price and the pay-as-you-go instance price.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSpotAdvice  DescribeSpotAdviceRequest
     * @return DescribeSpotAdviceResponse
     */
    CompletableFuture<DescribeSpotAdviceResponse> describeSpotAdvice(DescribeSpotAdviceRequest request);

    /**
     * <b>description</b> :
     * <p>  This operation is applicable only to I/O optimized preemptible instances.</p>
     * <ul>
     * <li>The data returned by the interface may be paginated. If the returned data contains the <code>NextOffset</code> parameter, you can set the <code>Offset</code> parameter in the request to the value of the <code>NextOffset</code> parameter for subsequent data query.</li>
     * </ul>
     * 
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
     * @deprecated OpenAPI DescribeTags is deprecated, please use Tag::2018-08-28::CountResourcesByTags instead.  * @description If a tag key that has no tag value is specified, all tags that contain the tag key are returned. If a tag key-value pair is specified, only tags that exactly match the key-value pair are returned.
     * 
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    @Deprecated
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
     * <p>  If no user data is configured for the ECS instance, an empty string is returned.</p>
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
     * <li>This operation is an asynchronous operation. After you call the operation to detach a disk from an ECS instance, the disk is detached in approximately 1 minute.</li>
     * <li>If <code>OperationLocks</code> in the response contains <code>&quot;LockReason&quot; : &quot;security&quot;</code> when you query information about an instance, the instance is locked for security reasons and all operations are prohibited on the instance.</li>
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>To prevent an activation code from being leaked, you can call the DisableActivation operation to disable the activation code. Disabled activation codes cannot be used to register new managed instances. However, managed instances that are already registered are not affected.</p>
     * 
     * @param request the request parameters of DisableActivation  DisableActivationRequest
     * @return DisableActivationResponse
     */
    CompletableFuture<DisableActivationResponse> disableActivation(DisableActivationRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>Instructions</strong>
     *     *   Only Alibaba Cloud accounts can call this operation.</p>
     * <ul>
     * <li><strong>Considerations</strong><ul>
     * <li>After Account-level EBS Default Encryption is disabled, the encryption status of existing cloud disks is not affected.</li>
     * <li>After Account-level EBS Default Encryption is disabled, you can still choose to encrypt new cloud disks when you purchase the disks.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DisableDiskEncryptionByDefault  DisableDiskEncryptionByDefaultRequest
     * @return DisableDiskEncryptionByDefaultResponse
     */
    CompletableFuture<DisableDiskEncryptionByDefaultResponse> disableDiskEncryptionByDefault(DisableDiskEncryptionByDefaultRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> The Account-level EBS Default Encryption feature is available only in specific regions and to specific users. To use Account-level EBS Default Encryption, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
     * </blockquote>
     * <ul>
     * <li><strong>Precautions</strong><ul>
     * <li>Only Alibaba Cloud accounts can call this operation.</li>
     * <li>Before you can enable the Account-level EBS Default Encryption feature in a region, you must <a href="https://help.aliyun.com/document_detail/480156.html">activate Key Management Service (KMS)</a> in the region.</li>
     * <li>After you enable the Account-level EBS Default Encryption feature in a region, you can purchase only encrypted cloud disks in the region. For more information, see the <a href="~~59643#50de175230erj~~">Limits</a> section of the &quot;Encrypt cloud disks&quot; topic.</li>
     * </ul>
     * </li>
     * <li><strong>Considerations</strong><ul>
     * <li>After you enable the Account-level EBS Default Encryption feature in a region, new pay-as-you-go and subscription cloud disks in the region must be encrypted. You can use the KMS key configured for the Account-level EBS Default Encryption feature or specify other KMS keys to encrypt the cloud disks.</li>
     * <li>The first time you enable the Account-level EBS Default Encryption feature in a region, the service key in the region is automatically used to encrypt EBS resources.</li>
     * </ul>
     * </li>
     * <li><strong>Suggestions</strong><ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2851493.html">DescribeDiskEncryptionByDefaultStatus</a> operation to query whether the Account-level EBS Default Encryption feature is enabled in a region and the <a href="https://help.aliyun.com/document_detail/2851490.html">DescribeDiskDefaultKMSKeyId</a> operation to query the ID of the KMS key used by the Account-level EBS Default Encryption feature in a region.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2851492.html">ModifyDiskDefaultKMSKeyId</a> or <a href="https://help.aliyun.com/document_detail/2851539.html">ResetDiskDefaultKMSKeyId</a> operation to change or reset the KMS key used by the Account-level EBS Default Encryption feature in a region.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2851491.html">DisableDiskEncryptionByDefault</a> operation to disable the Account-level EBS Default Encryption feature in a region.</li>
     * </ul>
     * </li>
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
     * <p>  After you closes a session, the session is no longer available.</p>
     * <ul>
     * <li>The WebSocket URL that is associated with a closed session is invalid and no longer available.</li>
     * </ul>
     * 
     * @param request the request parameters of EndTerminalSession  EndTerminalSessionRequest
     * @return EndTerminalSessionResponse
     */
    CompletableFuture<EndTerminalSessionResponse> endTerminalSession(EndTerminalSessionRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>Make sure that you are familiar with the prerequisites and considerations. For more information, see <a href="https://help.aliyun.com/document_detail/58181.html">Export a custom image</a>.</li>
     * <li>The <code>ImageFormat</code> parameter is available only for the following regions: Japan (Tokyo), Indonesia (Jakarta), Germany (Frankfurt), UAE (Dubai), US (Virginia), UK (London), Singapore, Malaysia (Kuala Lumpur), and US (Silicon Valley). By default, custom images are exported in the RAW format in regions where the ImageFormat parameter is unsupported.</li>
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
     * Each exported custom image is stored in the specified OSS bucket. You can download the custom image. For more information, see <a href="https://help.aliyun.com/document_detail/31912.html">Download OSS objects by using simple download</a>.</p>
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
     * <blockquote>
     * <p> This operation is not recommended. We recommend that you call the <a href="https://help.aliyun.com/document_detail/25503.html">ModifyInstanceAttribute</a> operation to add an instance to or remove an instance from a security group, and call the <a href="https://help.aliyun.com/document_detail/58513.html">ModifyNetworkInterfaceAttribute</a> operation to add an ENI to or remove an ENI from a security group.
     *  Alibaba Cloud modified verification rules for the LeaveSecurityGroup operation on July 8, 2024. When you remove an ECS instance or ENI that does not belong to a security group from the security group, the &quot;InvalidSecurityGroupAssociation.NotFound&quot; error code is returned instead of a success response. Update the LeaveSecurityGroup operation to use the new verification rules with the new error code based on your business requirements.</p>
     * </blockquote>
     * <ul>
     * <li>You cannot remove an instance and an ENI from a security group at the same time. This indicates that you cannot specify <code>InstanceId</code> and <code>NetworkInterfaceId</code> in one request.</li>
     * <li>Before you remove an instance from a security group, the instance must be in the <strong>Stopped</strong> (Stopped) or <strong>Running</strong> (Running) state.</li>
     * <li>An instance or ENI must be added to at least one security group. If you remove an instance or ENI from the only security group, the removal request fails and an error is returned.</li>
     * <li>When you remove an instance or ENI that is not in a security group from the security group, the removal request fails and an error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of LeaveSecurityGroup  LeaveSecurityGroupRequest
     * @return LeaveSecurityGroupResponse
     */
    CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you call this operation to query the status of Cloud Assistant plug-ins on ECS instances, make sure that the versions of Cloud Assistant Agent on the instances are not earlier than the following ones:
     *     *   2.2.3.344 for Linux instances
     *     *   2.1.3.344 for Windows instances</p>
     * <ul>
     * <li>During a paged query, when you call the ListPluginStatus operation to retrieve the first page of results, set <code>MaxResults</code> to specify the maximum number of entries to return in the call. The return value of <code>NextToken</code> is a pagination token that can be used in the next call to retrieve a new page of results. When you call the ListPluginStatus operation to retrieve a new page of results, set <code>NextToken</code> to the <code>NextToken</code> value returned in the previous call and set <code>MaxResults</code> to specify the maximum number of entries to return in this call.</li>
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
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You cannot modify system policies.</li>
     * <li>After an automatic snapshot policy is modified, the modifications immediately take effect on the disks that are associated with the policy.</li>
     * <li>If cross-region replication for snapshots is enabled and no encryption parameters are configured, the generated encrypted snapshot copies are encrypted by using the Key Management Service (KMS) encryption keys in the region to which the snapshots are copied.</li>
     * </ul>
     * 
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
     * <p>You can use <code>DiskId</code> to specify a block storage device and modify the attributes of the device, such as the name and description of the device and whether to release the device together with the associated instance. You can use <code>DiskIds.N</code> to specify multiple block storage devices and batch modify the attributes of the devices.</p>
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
     * <li>Before you can call this operation in a region, make sure that the Account-level EBS Default Encryption feature is enabled in the region.</li>
     * <li>The first time you use a customer master key (CMK), you must use the <code>AliyunECSDiskEncryptDefaultRole</code> role to grant Elastic Compute Service (ECS) access to KMS resources. For more information, see <a href="https://help.aliyun.com/document_detail/2838993.html">Grant access to KMS keys through RAM roles</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskDefaultKMSKeyId  ModifyDiskDefaultKMSKeyIdRequest
     * @return ModifyDiskDefaultKMSKeyIdResponse
     */
    CompletableFuture<ModifyDiskDefaultKMSKeyIdResponse> modifyDiskDefaultKMSKeyId(ModifyDiskDefaultKMSKeyIdRequest request);

    /**
     * <b>description</b> :
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
     * <li>The performance level of an Enterprise SSD (ESSD) is limited by the ESSD disk size. If you cannot upgrade the performance level of an ESSD, extend the ESSD and try again. For more information, see <a href="https://help.aliyun.com/document_detail/25522.html">ResizeDisk</a> and <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</li>
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
     * <p>To minimize impacts on your business, change the disk categories or performance levels of cloud disks during off-peak hours.
     * Take note of the following items:</p>
     * <ul>
     * <li>To change the performance level of an ESSD, take note of the following items:<ul>
     * <li>If the ESSD is a subscription ESSD, you can only upgrade its performance level.</li>
     * <li>If the ESSD is a pay-as-you-go ESSD, you can upgrade or downgrade its performance level. However, you cannot downgrade the performance level to PL0.</li>
     * <li>The ESSD must be in the <strong>In Use</strong> (In_Use) or <strong>Unattached</strong> (Available) state.</li>
     * <li>If the ESSD is attached to an Elastic Compute Service (ECS) instance, the instance must be in the <strong>Running</strong> (Running) or <strong>Stopped</strong> (Stopped) state. The instance cannot be in the Expired state or stopped due to an overdue payment.</li>
     * <li>If you cannot upgrade the performance level of an ESSD due to the capacity limit, extend the ESSD by calling the <a href="https://help.aliyun.com/document_detail/25522.html">ResizeDisk</a> operation and then try again. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</li>
     * </ul>
     * </li>
     * <li>For information about the limits on changing the disk category of a cloud disk, see <a href="~~161980#section_s4a_to0_1jx~~">Change the category of a disk</a>.</li>
     * <li>For the disk categories to which cloud disks of each disk category can be changed, see <a href="~~161980#eb8bb54032nho~~">Change the category of a disk</a>.
     * After the disk category of a cloud disk is changed, the billing of the cloud disk has the following changes:</li>
     * <li>If the cloud disk is a pay-as-you-go disk, you are charged for the disk based on the new disk category.</li>
     * <li>If the cloud disk is a subscription disk, you may be charged additionally based on the price difference between the old and new disk categories and the remaining days of the billing cycle, starting from 00:00 the next day until the end of the subscription period.
     * For information about the billing of cloud disks, see <a href="https://help.aliyun.com/document_detail/179022.html">Block storage devices</a>.</li>
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
     * @param request the request parameters of ModifyElasticityAssuranceAutoRenewAttribute  ModifyElasticityAssuranceAutoRenewAttributeRequest
     * @return ModifyElasticityAssuranceAutoRenewAttributeResponse
     */
    CompletableFuture<ModifyElasticityAssuranceAutoRenewAttributeResponse> modifyElasticityAssuranceAutoRenewAttribute(ModifyElasticityAssuranceAutoRenewAttributeRequest request);

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
     * @deprecated OpenAPI ModifyImageShareGroupPermission is deprecated, please use Ecs::2014-05-26::ModifyImageSharePermission instead.  * @param request  the request parameters of ModifyImageShareGroupPermission  ModifyImageShareGroupPermissionRequest
     * @return ModifyImageShareGroupPermissionResponse
     */
    @Deprecated
    CompletableFuture<ModifyImageShareGroupPermissionResponse> modifyImageShareGroupPermission(ModifyImageShareGroupPermissionRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, read <a href="https://help.aliyun.com/document_detail/25463.html">Share custom images</a>.
     * When you call this operation, take note of the following sharing rules:</p>
     * <ul>
     * <li>You can share only your custom images that were created in your Alibaba Cloud to other accounts.</li>
     * <li>You can share a custom image to up to 10 Alibaba Cloud accounts at a time. You can specify up to 10 Alibaba Cloud account IDs by using the AddAccount.N or RemoveAccount.N parameter. If you specify more than 10 account IDs, the system processes only the previous 10 account IDs. The excess account IDs are ignored.</li>
     * <li>You can share a custom image with up to 50 Alibaba Cloud accounts.</li>
     * <li>If an Elastic Compute Service (ECS) instance was created (<a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a>) from a shared image, you cannot re-initialize the instance (<a href="https://help.aliyun.com/document_detail/25519.html">ReInitDisk</a>) after the image owner unshares or deletes the image (<a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a>).
     * When you publish or unpublish a community image, take note of the following items:</li>
     * <li>Alibaba Cloud provides only the platform on which community images can be published and managed. The owner of a community image is responsible for the quality and updates of the image. Make sure that you acknowledge and agree to the Community Image Agreement. Otherwise, you cannot publish community images. For more information, see <a href="https://help.aliyun.com/document_detail/208370.html">Publish a community image</a>.</li>
     * <li>You cannot publish encrypted images as community images.</li>
     * <li>Community images are publicly available. A community image is available to all Alibaba Cloud accounts in the region where the image resides.</li>
     * <li>You cannot share, export, or copy community images.</li>
     * <li>After you unpublish a community image, the image is no longer available to other Alibaba Cloud accounts. If an image is shared with other Alibaba Cloud accounts before it is unpublished, the image remains available to the accounts.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyImageSharePermission  ModifyImageSharePermissionRequest
     * @return ModifyImageSharePermissionResponse
     */
    CompletableFuture<ModifyImageSharePermissionResponse> modifyImageSharePermission(ModifyImageSharePermissionRequest request);

    /**
     * <b>description</b> :
     * <p>A private pool is generated after an elasticity assurance or a capacity reservation is created. The private pool is associated with information about the instances that use the private pool. You can specify whether to use a private pool when you create an ECS instance to match the instance with the associated elasticity assurance or capacity reservation.</p>
     * <ul>
     * <li>After you call this operation to modify the private pool attributes of an ECS instance, you do not need to restart the instance for the changes to take effect.</li>
     * <li>When you call the following operations on an ECS instance, the system attempts to match the instance with active private pools. If the instance is already matched to a specified private pool, the call to an operation may fail when the private pool capacity is used up or the private pool expires. If the call fails, call the ModifyInstanceAttachmentAttributes operation to change the type of the private pool to <code>Open</code>.<ul>
     * <li><a href="https://help.aliyun.com/document_detail/2679679.html">StartInstance</a>: start an ECS instance that is stopped in economical mode.</li>
     * <li><a href="https://help.aliyun.com/document_detail/2679707.html">ReActivateInstances</a>: reactivates an ECS instance that has expired or is reclaimed due to an overdue payment.</li>
     * <li><a href="https://help.aliyun.com/document_detail/2679704.html">ModifyInstanceChargeType</a>: changes the billing method of an ECS instance.</li>
     * <li><a href="https://help.aliyun.com/document_detail/2679706.html">ModifyPrepayInstanceSpec</a>: changes the instance type of an ECS instance.</li>
     * <li><a href="https://help.aliyun.com/document_detail/2679771.html">ReplaceSystemDisk</a>: replaces the operating system of an ECS instance.</li>
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
     * <p>You cannot call this operation to modify the attributes of the ECS instances that are locked for security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</p>
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
     * <p>*Before you call this operation, make sure that you are familiar with the billing methods and <a href="https://www.alibabacloud.com/product/ecs#pricing">pricing</a> of Elastic Compute Service (ECS)**.</p>
     * <ul>
     * <li>Make sure that your account balance or credit balance is sufficient.</li>
     * <li>Only subscription instances are supported. If you call this operation for a pay-as-you-go instance, an error is returned.</li>
     * <li>The payment for auto-renewal of an instance is automatically deducted at 08:00:00 (UTC+8) nine days before the instance expires.</li>
     * <li>If the deduction fails, Alibaba Cloud attempts to deduct the payment every day until the payment is deducted or until the instance is locked on expiration.</li>
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
     * <li>If you upgrade the outbound public bandwidth (InternetMaxBandwidthOut) of a subscription (PrePaid) instance from 0 Mbit/s when you modify the network configurations of the instance, a static public IP address is automatically assigned to the instance.</li>
     * <li>If you upgrade the outbound public bandwidth (InternetMaxBandwidthOut) of a pay-as-you-go (PostPaid) instance from 0 Mbit/s when you modify the network configurations of the instance, no static public IP address is automatically assigned to the instance. In this case, to assign a static public IP address to the instance, you must set <code>AllocatePublicIp</code> to <code>true</code>.</li>
     * <li>You can upgrade the outbound public bandwidth (InternetMaxBandwidthOut) of an instance in the classic network from 0 Mbit/s only if the instance is in the Stopped state.<blockquote>
     * <p> For the limits on the sum of maximum public bandwidths of ECS instances that use the pay-by-bandwidth billing method for network usage per region per Alibaba Cloud account, see the <a href="~~25412#BandwidthQuota~~">Public bandwidth limits</a> section of the &quot;Limits&quot; topic.</p>
     * </blockquote>
     * </li>
     * <li>Billing:<ul>
     * <li>After the public bandwidth is upgraded, AutoPay is automatically set to true and the payment is automatically made. Make sure that your account balance is sufficient. Otherwise, your order becomes invalid and is canceled. If your account balance is insufficient, you can set AutoPay to false. In this case, when you call the ModifyInstanceNetworkSpec operation, an unpaid order is generated. Then, you can log on to the ECS console to pay for the order.</li>
     * <li>After the public bandwidth is downgraded, the price difference is refunded to the payment account that you used. Vouchers or coupons that have been redeemed are not refundable.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceNetworkSpec  ModifyInstanceNetworkSpecRequest
     * @return ModifyInstanceNetworkSpecResponse
     */
    CompletableFuture<ModifyInstanceNetworkSpecResponse> modifyInstanceNetworkSpec(ModifyInstanceNetworkSpecRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, familiarize yourself with the billing and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of ECS resources.</em>*
     * Before you <a href="https://help.aliyun.com/document_detail/60051.html">change the instance type of a pay-as-you-go instance</a>, call the <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> operation to query compatible instance types.
     * <strong>Considerations</strong></p>
     * <ul>
     * <li>Make sure that you have no overdue payments in your account.</li>
     * <li>You can change only the instance type or only the public bandwidth of an ECS instance at a time. The instance type and the public bandwidth of an ECS instance cannot be changed together.</li>
     * <li>You can change the public bandwidth of an ECS instance only when the instance is in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state. The change immediately takes effect.</li>
     * <li>You can change the instance type of an ECS instance only when the instance is in the <strong>Stopped</strong> (<code>Stopped</code>) state. You must <a href="https://help.aliyun.com/document_detail/25441.html">start the instance</a> for the change to take effect.<blockquote>
     * <p> A limit is imposed on the sum of public bandwidths of all ECS instances that use the pay-by-bandwidth billing method for network usage per region in an Alibaba Cloud account. For more information, see the <a href="~~25412#BandwidthQuota~~">Public bandwidth limits</a> section of the &quot;Limits and quotas&quot; topic.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceSpec  ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request);

    /**
     * <b>description</b> :
     * <p>  The VNC password must be six characters in length and can contain uppercase letters, lowercase letters, and digits.</p>
     * <ul>
     * <li>After you modify the VNC password of an ECS instance, take note of the following items:<ul>
     * <li>If the instance is I/O optimized, the new password takes effect immediately without the need to restart the instance.</li>
     * <li>If the instance is not I/O optimized, you must <a href="https://help.aliyun.com/document_detail/25440.html">restart the instance</a> in the ECS console or by calling the <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> operation for the new password to take effect.</li>
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>The ModifyManagedInstance operation can be called to change only the name of a single managed instance.</p>
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
     * <p><em>Before you call this operation, make sure that you are familiar with the billing methods, <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">prices</a>, and <a href="https://help.aliyun.com/document_detail/476339.html">rules for unsubscribing from resources</a> of ECS.</em>*
     * ModifyPrepayInstanceSpec is an asynchronous operation. After a request is sent, wait for 5 to 10 seconds for the instance type change to complete. Before you change the instance type of a subscription ECS instance, call the <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> operation to query the instance types to which you can change the instance.
     * <strong>Considerations</strong></p>
     * <ul>
     * <li>Before you change the instance type of an expired instance, you must renew the instance.</li>
     * <li>When you downgrade the instance type of a subscription ECS instance, take note of the following items:<ul>
     * <li>The instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>The price difference is refunded to the payment account that you used. Redeemed vouchers are not refundable.</li>
     * <li>The new instance type takes effect only after you <a href="https://help.aliyun.com/document_detail/25441.html">start the instance</a>.</li>
     * </ul>
     * </li>
     * <li>When you upgrade the instance type of a subscription ECS instance, take note of the following items:<ul>
     * <li>The instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) or <strong>Running</strong> (<code>Running</code>) state.</li>
     * <li>The new instance type takes effect only after you <a href="https://help.aliyun.com/document_detail/25441.html">start the instance</a> or <a href="https://help.aliyun.com/document_detail/25440.html">restart the instance</a>.</li>
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
     * <p>This operation is an asynchronous operation. After you call this operation to modify a reserved instance, the operation starts the modification process and returns the ID of the resulting new reserved instance. The original reserved instance enters the <code>Updating</code> state and then the <code>Inactive</code> state. At the same time, the resulting new reserved instance is generated and enters the Creating state and then the Active state. You can call the <a href="https://help.aliyun.com/document_detail/2679781.html">DescribeReservedInstances</a> operation to query the states of the reserved instance.</p>
     * <ul>
     * <li>You can modify the configurations of a reserved instance only if the reserved instance is in the <strong>Active</strong> state.</li>
     * <li>Make sure that the <a href="~~140660#2742f3844abzz~~">computing power</a> of the reserved instance remains unchanged before and after the modification. Otherwise, the modification fails.</li>
     * <li>You cannot split, merge, or change the scope of a reserved instance at the same time.
     * For more information, see <a href="https://help.aliyun.com/document_detail/100375.html">Split, merge, or modify reserved instances</a>.</li>
     * </ul>
     * <h2><a href="#"></a>Sample requests</h2>
     * <ul>
     * <li><strong>Sample request to split a reserved instance</strong>: Split a regional reserved instance that is scoped to the China (Hangzhou) region and can match two pay-as-you-go instances of the ecs.g5.xlarge instance type into two regional reserved instances that are scoped to the China (Hangzhou) region and each can match one pay-as-you-go instance of the ecs.g5.large instance type:<!---->
     * &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, //The ID of the region.
     * &quot;ReservedInstanceId&quot;:[&quot;ecsri-bp1hd03e9uv19e75****&quot;], //The ID of the reserved instance that you want to split.
     * &quot;Configuration&quot;:[
     *   {
     * &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName1&quot;, //The name of the new reserved instance.
     * &quot;InstanceType&quot;:&quot;ecs.g5.large&quot;, //The instance type that the new reserved instance can match.
     * &quot;Scope&quot;:&quot;Region&quot;, //The scope level of the new reserved instance, which must be the same as the scope level of the original reserved instance.
     * &quot;InstanceAmount&quot;:1 //The number of pay-as-you-go instances of the specified instance type that each new reserved instance can match.
     *   },
     *   {
     * &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName2&quot;,
     * &quot;InstanceType&quot;:&quot;ecs.g5.large&quot;,
     * &quot;Scope&quot;:&quot;Region&quot;,
     * &quot;InstanceAmount&quot;:1
     *   }
     * ]</li>
     * <li><strong>Sample request to merge reserved instance:</strong>: Merge two zonal reserved instances that are scoped to Hangzhou Zone H and can match four pay-as-you-go instances of the ecs.g5.xlarge instance type into one zonal reserved instance that is scoped to Hangzhou Zone H and can match two pay-as-you-go instances of the ecs.g5.4xlarge instance type:<!---->
     * &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, //The ID of the region.
     * &quot;ReservedInstanceId&quot;:[&quot;ecsri-bp1hd03e9uv16b75****&quot;,&quot;&quot;ecsri-bp1hd03e9uv16b76****&quot;&quot;], //The IDs of the reserved instances that you want to merge.
     * &quot;Configuration&quot;:[
     *   {
     * &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName&quot;, //The name of the new reserved instance.
     * &quot;InstanceType&quot;:&quot;ecs.g5.4xlarge&quot;, //The instance type that the new reserved instance can match.
     * &quot;Scope&quot;:&quot;Zone&quot;, //The scope level of the new reserved instance, which must be the same as the scope level of the original reserved instances.
     * &quot;ZoneId&quot;:&quot;cn-hangzhou-h&quot;, //
     * &quot;InstanceAmount&quot;:2 //The number of pay-as-you-go instances of the specified instance type that the new reserved instance can match.
     *   }
     * ]</li>
     * <li><strong>Sample request to change the scope of a reserved instance</strong>: Change a regional reserved instance that is scoped to Hangzhou Zone H and can match six pay-as-you-go instances of the ecs.g5.xlarge instance type to a regional reserved instance that is scoped to the China (Hangzhou) region and can match three pay-as-you-go instances of the ecs.g5.2xlarge instance type.<!---->
     * &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, //The ID of the region.
     * &quot;ReservedInstanceId&quot;:[&quot;ecsri-bp1hd03e9uv16b77****&quot;], //The ID of the reserved instance whose scope you want to change.
     * &quot;Configuration&quot;:[
     *   {
     * &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName&quot;, //The name of the new reserved instance.
     * &quot;InstanceType&quot;:&quot;ecs.g5.2xlarge&quot;, //The instance type that the new reserved instance can match.
     * &quot;Scope&quot;:&quot;Region&quot;, //The scope level of the new reserved instance.
     * &quot;InstanceAmount&quot;:3 //The number of pay-as-you-go instances of the specified instance type that the new reserved instance can match.
     *   }
     * ]</li>
     * </ul>
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
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>An authorization object in a security group rule can be of one of the following types: IPv4 CIDR block or address, IPv6 CIDR block or address, security group, or prefix list. You cannot call this operation to change the type of an existing authorization object. For example, if an authorization object is an IPv4 CIDR block, you can change the authorization object to a different IPv4 CIDR block or an IPv4 address, but you cannot change the authorization object to an IPv6 CIDR block or address, a security group, or a prefix list.</li>
     * <li>You cannot delete the value of a non-empty parameter. If you want to delete the values of non-empty parameters, we recommend that you create another rule and delete the original rule.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupEgressRule  ModifySecurityGroupEgressRuleRequest
     * @return ModifySecurityGroupEgressRuleResponse
     */
    CompletableFuture<ModifySecurityGroupEgressRuleResponse> modifySecurityGroupEgressRule(ModifySecurityGroupEgressRuleRequest request);

    /**
     * <b>description</b> :
     * <p>  By default, advanced security groups use the <strong>internal isolation policy</strong>, and Elastic Compute Service (ECS) instances in each advanced security group cannot communicate with each other. The internal access control policy of advanced security groups cannot be modified.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/25555.html">DescribeSecurityGroupAttribute</a> operation to query the internal access control policy of a security group.</li>
     * <li>If the internal access control policy of a security group is set to <strong>Accept</strong>, the security group uses the internal interconnectivity policy and all ECS instances in the security group can communicate with each other over the internal network, regardless of whether custom rules exist in the security group.</li>
     * <li>If the internal access control policy of a security group is set to <strong>Drop</strong> and the security group contains no custom rules, the security group uses the internal isolation policy and all ECS instances in the security group cannot communicate with each other over the internal network. In this case, you can use custom rules to allow ECS instances in the security group to communicate with each other. For example, you can call the <a href="https://help.aliyun.com/document_detail/25554.html">AuthorizeSecurityGroup</a> operation to configure custom rules.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupPolicy  ModifySecurityGroupPolicyRequest
     * @return ModifySecurityGroupPolicyResponse
     */
    CompletableFuture<ModifySecurityGroupPolicyResponse> modifySecurityGroupPolicy(ModifySecurityGroupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>An authorization object in a security group rule can be of one of the following types: IPv4 CIDR block or address, IPv6 CIDR block or address, security group, or prefix list. You cannot call this operation to change the type of an existing authorization object. For example, if an authorization object is an IPv4 CIDR block, you can change the authorization object to a different IPv4 CIDR block or an IPv4 address, but you cannot change the authorization object to an IPv6 CIDR block or address, a security group, or a prefix list.</li>
     * <li>You cannot delete the value of a non-empty parameter. If you want to delete the values of non-empty parameters, we recommend that you create a security group rule and delete the original security group rule.</li>
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
     * <b>description</b> :
     * <p>  Archive snapshots cannot be restored to standard snapshots.</p>
     * <ul>
     * <li>You can archive only standard snapshots that have been retained for at least 14 days.</li>
     * <li>You cannot archive encrypted snapshots.</li>
     * <li>You cannot archive snapshots that are shared to you, snapshots managed by Cloud Backup, or snapshots in cloud boxes.</li>
     * <li>The archive snapshot feature is available only in the China (Hohhot), Malaysia (Kuala Lumpur), South Korea (Seoul), Philippines (Manila), Thailand (Bangkok), and Mexico regions. The availability of the feature in other regions is subject to notice.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySnapshotCategory  ModifySnapshotCategoryRequest
     * @return ModifySnapshotCategoryResponse
     */
    CompletableFuture<ModifySnapshotCategoryResponse> modifySnapshotCategory(ModifySnapshotCategoryRequest request);

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
     * <b>description</b> :
     * <p>Before you call this operation, familiarize yourself with the billing rules and <a href="https://www.alibabacloud.com/zh?spm=5176.28117011.nav-v2-dropdown-language.exp-location-zh.9ae4165bF98IHz&_p_lc=1">pricing</a> of elasticity assurances.
     * Before you purchase an elasticity assurance, you can call the <a href="https://help.aliyun.com/document_detail/2679748.html">DescribeElasticityAssurances</a> operation to query the elasticity assurances that you can purchase.</p>
     * 
     * @param request the request parameters of PurchaseElasticityAssurance  PurchaseElasticityAssuranceRequest
     * @return PurchaseElasticityAssuranceResponse
     */
    CompletableFuture<PurchaseElasticityAssuranceResponse> purchaseElasticityAssurance(PurchaseElasticityAssuranceRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you are familiar with the billing methods and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of reserved instances.</em>*</p>
     * <ul>
     * <li>Before you call this operation, make sure that you are familiar with the billing rules of reserved instances. For more information, see <a href="https://help.aliyun.com/document_detail/100371.html">Reserved instances</a>.</li>
     * <li>You can retain up to 20 regional reserved instances in all regions per Alibaba Cloud account.</li>
     * <li>You can retain up to 20 zonal reserved instances per zone per Alibaba Cloud account.</li>
     * </ul>
     * <h2><a href="#"></a>Sample requests</h2>
     * <ul>
     * <li>Purchase a one-year regional reserved instance in the China (Hangzhou) region to offset the bills of three ecs.g5.large Linux pay-as-you-go instances.<!---->
     * &quot;RegionId&quot;:&quot;cn-hangzhou&quot;, // Specify the China (Hangzhou) region.&quot;InstanceType&quot;:&quot;ecs.g5.large&quot;, // Specify the instance type.&quot;Scope&quot;:&quot;Region&quot;, // Set the scope of the reserved instance to regional.&quot;InstanceAmount&quot;:3, // Specify the reserved instance to match three pay-as-you-go instances of the same instance type.&quot;OfferingType&quot;:&quot;All Upfront&quot;, // Specify the payment option. In this example, the default value is used, which is All Upfront.&quot;Platform&quot;:&quot;Linux&quot;, // Specify the operating system platform of the ECS instances eligible for the reserved instance. In this example, the Linux or Unix-like operating system is used.&quot;Period&quot;:1, // Specify the term of the reserved instance. In this example, the one-year duration is used.&quot;PeriodUnit&quot;:&quot;Year&quot;, // Set the unit of the term to year.</li>
     * <li>Purchase a two-year zonal reserved instance in Hangzhou Zone H to offset the bills of five ecs.g5.large Windows pay-as-you-go instances.<!---->
     * &quot;RegionId&quot;:&quot;cn-hangzhou&quot;,
     * &quot;ZoneId&quot;:&quot;cn-hangzhou-h&quot;, // Specify Hangzhou Zone H.&quot;InstanceType&quot;:&quot;ecs.g5.large&quot;,
     * &quot;Scope&quot;:&quot;Zone&quot;, // Set the scope of the reserved instance to zonal.&quot;InstanceAmount&quot;:5, // Specify the reserved instance to match five pay-as-you-go instances of the same instance type.&quot;OfferingType&quot;:&quot;All Upfront&quot;,
     * &quot;Platform&quot;:&quot;Windows&quot;, // Specify the operating system platform of the ECS instances eligible for the reserved instance. In this example, the Windows operating system is used.&quot;Period&quot;:2, // Specify the term of the reserved instance. In this example, the two-year duration is used.&quot;PeriodUnit&quot;:&quot;Year&quot;, // Set the unit of the term to year.</li>
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
     * <p>  You cannot call this operation to start ECS instances that are locked for security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</p>
     * <ul>
     * <li>The instance must be in the <strong>Stopped</strong> <code>(Stopped)</code> state.</li>
     * <li>You must pay the bills and reactivate the instance within 15 days after the instance is suspended due to overdue payments. Otherwise, the instance is released and the data cannot be restored. If you cannot restart an instance of the Virtual Private Cloud (VPC) type, try again later.</li>
     * <li>After the operation is called, the instance enters the <strong>Starting</strong> <code>(Starting)</code> state.</li>
     * </ul>
     * 
     * @param request the request parameters of ReActivateInstances  ReActivateInstancesRequest
     * @return ReActivateInstancesResponse
     */
    CompletableFuture<ReActivateInstancesResponse> reActivateInstances(ReActivateInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The disk that you want to re-initialize must be in the <strong>In Use</strong> (<code>In_use</code>) state and the instance to which the disk is attached must be in the <strong>Stopped</strong> (<code>Stoppe</code>) state.</li>
     * <li>If an instance has never been started since it was created, the disks attached to it cannot be re-initialized.</li>
     * <li>If a local snapshot has been created for a disk, the disk cannot be re-initialized.</li>
     * <li>If a system disk is re-initialized, the disk is restored to the state of the image from which it was created. If the image has been deleted, the disk cannot be re-initialized.</li>
     * <li>For a data disk that was created from scratch, the disk is initialized to the empty disk state. For a data disk that is created from a snapshot, the disk is initialized to the snapshot state. If the snapshots were deleted, the disks cannot be re-initialized and an error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ReInitDisk  ReInitDiskRequest
     * @return ReInitDiskResponse
     */
    CompletableFuture<ReInitDiskResponse> reInitDisk(ReInitDiskRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After you call this operation to restart an ECS instance, the operation sets the status of the ECS instance to <code>Starting</code> and begins the restart process. You can call the <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> operation to query the status of the instance. When the status of the ECS instance changes to <code>Running</code>, the instance is restarted.</p>
     * <h3><a href="#"></a>Considerations</h3>
     * <ul>
     * <li>You cannot call this operation to restart an ECS instance that is locked for security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
     * <li>The ECS instance that you want to restart must be in the <strong>Running</strong> (<code>Running</code>) state.</li>
     * </ul>
     * 
     * @param request the request parameters of RebootInstance  RebootInstanceRequest
     * @return RebootInstanceResponse
     */
    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After you call this operation to restart an ECS instance, the operation sets the status of the ECS instance to <code>Starting</code> and begins the restart process. You can call the <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> operation to query the status of the instance. When the status of the ECS instance changes to <code>Running</code>, the instance is restarted.</p>
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>You cannot call this operation to restart ECS instances that are locked due to security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
     * <li>The ECS instances that you want to restart must be in the <strong>Running</strong> (<code>Running</code>) state.</li>
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
     * @deprecated OpenAPI ReleasePublicIpAddress is deprecated  * @param request  the request parameters of ReleasePublicIpAddress  ReleasePublicIpAddressRequest
     * @return ReleasePublicIpAddressResponse
     */
    @Deprecated
    CompletableFuture<ReleasePublicIpAddressResponse> releasePublicIpAddress(ReleasePublicIpAddressRequest request);

    /**
     * @deprecated OpenAPI RemoveBandwidthPackageIps is deprecated  * @param request  the request parameters of RemoveBandwidthPackageIps  RemoveBandwidthPackageIpsRequest
     * @return RemoveBandwidthPackageIpsResponse
     */
    @Deprecated
    CompletableFuture<RemoveBandwidthPackageIpsResponse> removeBandwidthPackageIps(RemoveBandwidthPackageIpsRequest request);

    /**
     * @deprecated OpenAPI RemoveTags is deprecated, please use Ecs::2014-05-26::UntagResources instead.  * @param request  the request parameters of RemoveTags  RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    @Deprecated
    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>When you renew subscription dedicated hosts, vouchers are used first by default. Make sure that your account supports credit card payments or balance payments.</p>
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
     * <p><em>Before you call this operation, make sure that you are familiar with the billing and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of reserved instances.</em>*</p>
     * <ul>
     * <li>You can manually renew reserved instances or enable auto-renewal for reserved instances. For more information, see the <a href="~~100371#53bfc50b78sta~~">Renewal</a> section of the &quot;Reserved instances&quot; topic.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/100065.html">DescribeReservedInstances</a> operation to query the reserved instances that you purchased.</li>
     * <li>You can call this operation to enable auto-renewal for reserved instances but cannot call this operation to disable auto-renewal for reserved instances. To disable auto-renewal for a reserved instance, call the <a href="https://help.aliyun.com/document_detail/2679786.html">ModifyReservedInstanceAutoRenewAttribute</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of RenewReservedInstances  RenewReservedInstancesRequest
     * @return RenewReservedInstancesResponse
     */
    CompletableFuture<RenewReservedInstancesResponse> renewReservedInstances(RenewReservedInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, refer to <a href="https://help.aliyun.com/document_detail/50134.html">Replace the operating system (system disk) of an instance</a>.
     * When you call this operation for an ECS instance, take note of the following items:</p>
     * <ul>
     * <li>The billing method of the system disk cannot be changed.</li>
     * <li>The category of the system disk cannot be changed.</li>
     * <li>Make sure that no unpaid orders are associated with the instance.</li>
     * <li>The instance must be in the <code>Stopped</code> state.
     * **
     * <strong>Note</strong> The operation is applicable only to instances of the Virtual Private Cloud (VPC) type. If the instance is a pay-as-you-go instance and default economical mode is enabled, enable standard mode when you stop the instance. This prevents the instance from being unable to restart due to insufficient ECS resources after the system disk is replaced. For more information, see <a href="https://help.aliyun.com/document_detail/25501.html">StopInstance</a>.</li>
     * <li>The instance cannot be locked for security reasons. If the value of <code>OperationLocks</code> in the DescribeInstances response contains <code>&quot;LockReason&quot;: &quot;security&quot;</code> for an instance, the instance is locked for security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
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
     * <p>Before you call this operation, read <a href="https://help.aliyun.com/document_detail/25450.html">Roll back a disk by using a snapshot</a>.
     * Take note of the following items:</p>
     * <ul>
     * <li>The cloud disk that you want to roll back must be in the In Use (<code>In_use</code>) or Unattached (<code>Available</code>) state.</li>
     * <li>The instance to which the cloud disk is attached must be in the <code>Stopped</code> state. You can call the <a href="https://help.aliyun.com/document_detail/155372.html">StopInstances</a> operation to stop the instance.</li>
     * <li>The snapshot specified by <code>SnapshotId</code> must be created from the disk specified by <code>DiskId</code>.</li>
     * <li>If the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> when you query information about an instance by calling the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation, the instance is locked for security reasons and no operations can be performed on the instance.</li>
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
     * <li>Before you can call this operation in a region, make sure that the Account-level Elastic Block Storage (EBS) Default Encryption feature is enabled in the region.</li>
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
     * <blockquote>
     * <p> Before you call this operation to resize a disk, you must check the partition format of the disk. You cannot resize a master boot record (MBR) disk to a size that is larger than 2 TiB. If you resize an MBR disk to a size that is larger than 2 TiB, data may be lost. If you want to resize an MBR disk to a size that is larger than 2 TiB, we recommend that you perform the following steps: Create a new data disk that is larger than 2 TiB in size, partition and format the new data disk by using the GUID Partition Table (GPT) format, and then copy data from the MBR disk to the GPT data disk. For more information, see <a href="https://help.aliyun.com/document_detail/44986.html">Step 1: Resize a disk to extend the disk capacity</a>.</p>
     * </blockquote>
     * <ul>
     * <li>You can resize disks of the following disk categories: basic disks (<code>cloud</code>), ultra disks (<code>cloud_efficiency</code>), standard SSDs (<code>cloud_ssd</code>), Enterprise SSDs (ESSDs) (<code>cloud_essd</code>), ESSD AutoPL disks (cloud_auto), standard elastic ephemeral disks (elastic_ephemeral_disk_standard), and premium elastic ephemeral disks (elastic_ephemeral_disk_premium).</li>
     * <li>You cannot resize a cloud disk when a snapshot is being created for the disk. Wait until the snapshot is created before you resize the cloud disk.</li>
     * <li>You cannot call this operation to resize partitions or file systems on a cloud disk. You must manually resize the partitions and file systems after the disk is resized. For more information, see <a href="https://help.aliyun.com/document_detail/470068.html">Step 2: Resize partitions and file systems</a>.</li>
     * <li>If the multi-attach feature is enabled for a cloud disk, you can resize the disk online or offline. Make sure that the Elastic Compute Service (ECS) instances to which the disk is attached meet the following requirements:<ul>
     * <li>If you want to resize the disk online, the ECS instances must be in the <strong>Running</strong> (<code>Running</code>) state.</li>
     * <li>If you want to resize the disk offline, the ECS instances must be in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * </ul>
     * </li>
     * <li>The cloud disk that you want to resize must meet the following requirements:<ul>
     * <li>The disk is in the In Use (<code>In_use</code>) or Unattached (<code>Available</code>) state.</li>
     * <li>(Recommended) Snapshots are created for the disk to back up disk data. For information about how to create snapshots for a disk, see <a href="https://help.aliyun.com/document_detail/25455.html">Create a snapshot</a>.</li>
     * <li>If the disk is a new data disk, initialize the disk before you resize the disk. For more information, see <a href="https://help.aliyun.com/document_detail/466323.html">Overview</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ResizeDisk  ResizeDiskRequest
     * @return ResizeDiskResponse
     */
    CompletableFuture<ResizeDiskResponse> resizeDisk(ResizeDiskRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Alibaba Cloud modified verification rules for the RevokeSecurityGroup operation on July 8, 2024. When you use the RevokeSecurityGroup operation to delete a security group rule that does not exist, the &quot;InvalidSecurityGroupRule.RuleNotExist&quot; error code is returned instead of a success response. Update the RevokeSecurityGroup operation to use the new verification rules with the new error code based on your business requirements.
     * When you call this operation, you can use one of the following groups of parameters to specify the security group rules that you want to delete:</p>
     * </blockquote>
     * <ul>
     * <li>Parameters used to specify the IDs of security group rules. We recommend that you specify the IDs of security group rules to delete the rules.<ul>
     * <li>If a security group rule ID that you specify does not exist, an error is reported.</li>
     * </ul>
     * </li>
     * <li>Parameters that start with Permissions.<ul>
     * <li>If no security group rule matches the specified parameters, the call to RevokeSecurityGroup is successful but no security group rules are deleted.</li>
     * <li>Define an inbound security group rule by configuring the following parameters together:<ul>
     * <li>Source: You can specify one parameter from SourceCidrIp (IPv4 address), Ipv6SourceCidrIp (IPv6 address), SourcePrefixListId (prefix list ID), and SourceGroupId (source security group ID).</li>
     * <li>PortRange: specifies the range of destination port numbers.</li>
     * <li>IpProtocol: specifies the protocol.</li>
     * <li>Policy: specifies the action.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You cannot specify the security group rule IDs and the parameters that start with Permissions in the same request.</p>
     * </blockquote>
     * <h3><a href="#"></a>Sample requests</h3>
     * <ul>
     * <li>Delete security group rules by specifying their IDs.<!---->
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;, // The security group ID.
     * &quot;SecurityGroupRuleId&quot;:[&quot;sgr-bpdfmk****&quot;,&quot;sgr-bpdfmg****&quot;] // The IDs of the security group rules.</li>
     * <li>Delete security group rules by specifying a CIDR block.<!---->
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *   {
     * &quot;SourceCidrIp&quot;:&quot;10.0.0.0/8&quot;, // The source IPv4 CIDR block.
     * &quot;IpProtocol&quot;:&quot;TCP&quot;, // The protocol.
     * &quot;PortRange&quot;:&quot;80/80&quot;, // The range of destination port numbers.    &quot;Policy&quot;:&quot;accept&quot; // The action.  }
     * ]</li>
     * <li>Delete security group rules in which a security group is specified.<!---->
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *   {
     * &quot;SourceGroupId&quot;:&quot;sg-bp67acfmxa123b****&quot;, // The ID of the source security group.    &quot;IpProtocol&quot;:&quot;TCP,&quot;
     * &quot;PortRange&quot;:&quot;80/80&quot;,
     * &quot;Policy&quot;:&quot;accept&quot;
     *   ]
     * }</li>
     * <li>Delete security group rules in which a prefix list is specified.<!---->
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *    &quot;SourcePrefixListId&quot;:&quot;pl-x1j1k5ykzqlixdcy****&quot;, // The ID of the source prefix list.    &quot;IpProtocol&quot;:&quot;TCP&quot;,
     * &quot;PortRange&quot;:&quot;80/80&quot;,
     * &quot;Policy&quot;:&quot;accept&quot;
     *   }
     * ]</li>
     * </ul>
     * 
     * @param request the request parameters of RevokeSecurityGroup  RevokeSecurityGroupRequest
     * @return RevokeSecurityGroupResponse
     */
    CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Alibaba Cloud modified verification rules for the RevokeSecurityGroupEgress operation on July 8, 2024. When you use the RevokeSecurityGroupEgress operation to delete a security group rule that does not exist, the &quot;InvalidSecurityGroupRule.RuleNotExist&quot; error code is returned instead of a success response. Update the RevokeSecurityGroupEgress operation to use the new verification rules with the new error code based on your business requirements.
     * You can use one of the following methods to delete a security group rule:</p>
     * </blockquote>
     * <ul>
     * <li>Delete a rule by specifying the IDs of security group rules. We recommend that you specify the IDs of security group rules to delete the rules.<ul>
     * <li>If a security group rule ID that you specify does not exist, an error is reported.</li>
     * </ul>
     * </li>
     * <li>Delete a rule by specifying the Permissions parameter.<ul>
     * <li>If no security group rule matches the specified parameters, the call to RevokeSecurityGroup is successful but no security group rules are deleted.</li>
     * <li>Delete a security group rule by configuring the following parameters together:<ul>
     * <li>One of the following parameters: DestCidrIp, Ipv6DestCidrIp, DestPrefixListId, and DestGroupId. DestCidrIp specifies the destination IPv4 CIDR block. Ipv6DestCidrIp specifies the destination IPv6 CIDR block. DestPrefixListId specifies the ID of the destination prefix list. DestGroupId specifies the destination security group.</li>
     * <li>PortRange: specifies the range of destination port numbers.</li>
     * <li>IpProtocol: specifies the protocol.</li>
     * <li>Policy: specifies the action.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p> You cannot set the security group rule ID and the Permissions parameter at the same time.</p>
     * </blockquote>
     * <h3><a href="#"></a>Sample requests</h3>
     * <ul>
     * <li>Delete a security group rule.<!---->
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;, //The security group ID.
     * &quot;SecurityGroupRuleId&quot;:[&quot;sgr-bpdfmk****&quot;,&quot;sgr-bpdfmg****&quot;]  //The ID of the security group rule.</li>
     * <li>Delete a security group rule based on the CIDR block.<!---->
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4ph***&quot;,
     * &quot;Permissions&quot;:[
     *   {
     * &quot;IpProtocol&quot;:&quot;TCP&quot;, //The protocol.
     *    &quot;DestCidrIp&quot;:&quot;10.0.0.0/8&quot;, //The destination IPv4 CIDR block.
     * &quot;PortRange&quot;:&quot;22/22&quot;, //The destination port range.
     *    &quot;Policy&quot;:&quot;accept&quot; //The action.  }
     * ]</li>
     * <li>Delete a security group rule based on the ID of the destination security group.<!---->
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4ph***&quot;,
     * &quot;Permissions&quot;:[
     *   {
     * &quot;DestGroupId&quot;:&quot;sg-bp67acfmxa123b****&quot;, //Set the ID of the target security group.
     * &quot;IpProtocol&quot;:&quot;TCP&quot;,
     * &quot;PortRange&quot;:&quot;22/22&quot;,
     * &quot;Policy&quot;:&quot;accept&quot;
     *   }
     * ]</li>
     * <li>Delete a security group rule based on a specified prefix list.<!---->
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4ph***&quot;,
     * &quot;Permissions&quot;:[
     *   {
     * &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *    &quot;DestPrefixListId&quot;:&quot;pl-x1j1k5ykzqlixdcy****&quot;, //The ID of the destination prefix list.    &quot;PortRange&quot;:&quot;22/22&quot;,
     * &quot;Policy&quot;:&quot;accept&quot;,
     *   }
     * ]</li>
     * </ul>
     * 
     * @param request the request parameters of RevokeSecurityGroupEgress  RevokeSecurityGroupEgressRequest
     * @return RevokeSecurityGroupEgressResponse
     */
    CompletableFuture<RevokeSecurityGroupEgressResponse> revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After a request is sent, a response that contains a command ID and a command task ID is immediately returned. You can call the <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocationResults</a> operation with the command ID or task ID to query the execution results of the command.</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>The instances on which you want to create and run a Cloud Assistant command must be in the Running (<code>Running</code>) state. You can call the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation to query the status of instances.</li>
     * <li><a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> must be pre-installed on the instances on which you want to create and run a Cloud Assistant command. You can call the <a href="https://help.aliyun.com/document_detail/2679925.html">InstallCloudAssistant</a> operation to install Cloud Assistant Agent on instances and the <a href="https://help.aliyun.com/document_detail/2679924.html">DescribeCloudAssistantStatus</a> operation to query whether Cloud Assistant Agent is installed on instances.
     * **
     * <strong>Note</strong> By default, Cloud Assistant Agent is pre-installed on instances created from public images on or after December 1, 2017.</li>
     * <li>Before you run a PowerShell command on a Windows instance, make sure that the PowerShell module is installed on the instance.</li>
     * </ul>
     * <h3><a href="#"></a>Considerations</h3>
     * <ul>
     * <li>You can retain up to 500 to 50,000 Cloud Assistant commands in each region. You can also request a quota increase. For information about how to view quotas and request a quota increase, see <a href="https://help.aliyun.com/document_detail/184116.html">Manage quotas</a>.</li>
     * <li>To ensure that scheduled tasks can run as expected, make sure that the Cloud Assistant Agent version is not earlier than the following versions. A scheduled task can run a command at a specific interval, only once at a specific time, or at designated times based on a cron expression in a specific year or time zone. If the <code>ClientNeedUpgrade</code> error code is returned, you must update Cloud Assistant Agent to the latest version. For more information, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades of Cloud Assistant Agent</a>.
     * - Linux: 2.2.3.282
     * - Windows: 2.1.3.282</li>
     * <li>When you use a cron expression to specify a schedule, you can specify a time zone based on your business requirements. If you do not specify a time zone, the schedule is determined by the system time of the instances. Make sure that the time or time zone of the instances meets your business requirements. For information about time zones, see <a href="https://help.aliyun.com/document_detail/92803.html">Configure the NTP service for ECS instances that run CentOS 6</a> or <a href="https://help.aliyun.com/document_detail/51890.html">Configure the NTP service for Windows instances</a>.</li>
     * </ul>
     * <h3><a href="#"></a>Suggestions</h3>
     * <ul>
     * <li><strong>Timeout settings</strong>: You can set <code>Timeout</code> to specify the timeout period for command executions on instances. If an execution times out, Cloud Assistant Agent forcefully terminates the command process.<ul>
     * <li>When the one-time execution of the command times out, the execution status (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) of the command becomes Failed.</li>
     * <li>For a scheduled task, the timeout period takes effect on every execution of the command. When a command execution times out, the subsequent executions of the command are not affected. When a scheduled execution of the command times out, the execution status (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) of the command becomes Failed.</li>
     * </ul>
     * </li>
     * <li><strong>Execution failure</strong>: Command executions may fail due to instance status exceptions, network exceptions, or exceptions on Cloud Assistant Agent. If a command execution fails, no execution information is generated. For more information, see <a href="https://help.aliyun.com/document_detail/87029.html">Check execution results and troubleshoot common issues</a>.</li>
     * <li><strong>Custom parameters</strong>: If you set <code>EnableParameter</code> to true, the custom parameter feature is enabled. When you specify <code>CommandContent</code>, you can define custom parameters in the <code>{{parameter}}</code> format. Then, the key-value pairs of the custom parameters are passed in when you run the command.</li>
     * </ul>
     * 
     * @param request the request parameters of RunCommand  RunCommandRequest
     * @return RunCommandResponse
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, familiarize yourself with the billing and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of ECS resources.</em>*
     * This operation is an asynchronous operation. After a request to create ECS instances is sent, ECS instance IDs are returned but the creation and startup of the instances may be incomplete. You can call the <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> operation to query the status of the instances. When the status of an instance is <code>Running</code> in the DescribeInstanceStatus response, the instance is created and started.</p>
     * <h3><a href="#"></a>Considerations</h3>
     * <ul>
     * <li>Make sure that the number of ECS instances you created or the number of vCPUs on ECS instances of all instance types you created does not exceed the corresponding quota. Go to the <a href="https://quotas.console.aliyun.com/products/ecs/quotas">Quota Center</a> to view the quotas.</li>
     * <li>Before you create ECS instances of the Virtual Private Cloud (VPC) type in a region, create a VPC in the region. For more information, see <a href="https://help.aliyun.com/document_detail/65430.html">Create a VPC</a>.</li>
     * </ul>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>If you create a subscription instance (<code>PrePaid</code>), available coupons in your account are used by default.</li>
     * <li>You can call the RunInstances operation to create up to 100 ECS instances at a time. To create more than 100 ECS instances, we recommend that you initiate multiple requests in batches or concurrently.</li>
     * <li>If you set <code>InternetMaxBandwidthOut</code> to a value greater than 0, public IP addresses are automatically assigned to the ECS instances to be created.<blockquote>
     * <p> For the limits on the sum of maximum public bandwidths of ECS instances that use the pay-by-bandwidth billing method for network usage per region per Alibaba Cloud account, see the <a href="~~25412#BandwidthQuota~~">Public bandwidth limits</a> section of the &quot;Limits&quot; topic.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Suggestions</h3>
     * <ul>
     * <li><strong>Test scenarios</strong>: Set <code>DryRun</code> to true to perform a dry run without performing the actual request.</li>
     * <li><strong>Release of ECS instances</strong>: Use <code>AutoReleaseTime</code> to configure an automatic release time for ECS instances in the request to RunInstances or call the <a href="https://help.aliyun.com/document_detail/2679710.html">DeleteInstances</a> operation to release the instances.</li>
     * <li><strong>Management and search of ECS instances</strong>: Add tags to the ECS instances by specifying <code>Tag.N.Key</code> and <code>Tag.N.Value</code> and append incremental suffixes by specifying <code>UniqueSuffix</code> to the hostname specified by <code>HostName</code> and the instance name specified by <code>InstanceName</code>. For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for multiple instances</a>.</li>
     * <li><strong>Launch template</strong>: A launch template contains the parameters required to create an ECS instance so that you do not have to specify the parameters every time you create ECS instances. You can call the <a href="https://help.aliyun.com/document_detail/2679729.html">CreateLaunchTemplate</a> operation to create a launch template. Then, in the request to <code>RunInstances</code>, you can specify <code>LaunchTemplateId</code> and <code>LaunchTemplateVersion</code> to use the launch template.</li>
     * <li><strong>Disabling of Hyper-Threading (HT)</strong>: In memory-intensive scenarios, set <code>CpuOptions.ThreadsPerCore</code> to 1 to disable HT and increase the memory-to-vCPU ratio.</li>
     * <li><strong>Enabling of Jumbo Frames</strong>: Set <code>NetworkOptions.EnableJumboFrame</code> to true to enable the <code>Jumbo Frames</code> feature when you create ECS instances. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">MTUs</a>.</li>
     * </ul>
     * <h2><a href="#"></a>Sample requests</h2>
     * <p>Use a specific image to create ECS instances of a specific instance type in the China (Hangzhou) region. The instances use disks with a specific capacity as the system disk and data disks and are automatically assigned public IP addresses. The instances have user-defined names and logon passwords. The instances are assigned to a specific security group and connected to a specific vSwitch. Request parameters:
     *     RegionId:&quot;cn-hangzhou&quot;, //Set the region ID to cn-hangzhou, which specifies the China (Hangzhou) region.
     *     ImageId:&quot;aliyun_3_x64_20G_alibase_20221102.vhd&quot;, //Set the image ID to aliyun_3_x64_20G_alibase_20221102.vhd.
     *     InstanceType:&quot;ecs.g7.large&quot;, //Set the instance type to ecs.g7.large.
     *     SecurityGroupId:&quot;sg-bp150uqocpf9jj70****&quot;, //Set the security group ID to sg-bp150uqocpf9jj70****.
     *     VSwitchId:&quot;vsw-bp1qo7s91cbch5i4l****&quot;, //Set the vSwitch ID to vsw-bp1qo7s91cbch5i4l****.
     *     SystemDisk:{
     *       Category:&quot;cloud_essd&quot;, //Set the system disk category to cloud_essd, which specifies the Enterprise SSD (ESSD) category.
     *       Size:40, //Set the system disk size to 40. Unit: GiB.
     *     },
     *     DataDisk:[
     *       {
     *         Category:&quot;cloud_essd&quot;, //Set the data disk category to cloud_essd, which specifies the ESSD category.
     *         Size:100, //Set the data disk size to 100. Unit: GiB.
     *       }
     *     ],
     *     HostName:&quot;ECS-test&quot;, //Set the instance hostname to ECS-test.
     *     Password:&quot;ECS@test1234&quot;, //Set the logon password to ECS@test1234.
     *     InternetMaxBandwidthOut:10 //Set the outbound public bandwidth to 10. Unit: Mbit/s.
     * Examples on how to create instances of different types based on the preceding parameters:
     * <strong>Example: Create five subscription ECS instances for which auto-renewal is enabled</strong>
     *     Amount:5, //Set the number of ECS instances that you want to create to 5.
     *     InstanceChargeType:&quot;PrePaid&quot;, //Set the billing method to PrePaid, which specifies the subscription billing method.
     *     PeriodUnit:&quot;Month&quot;, //Set the subscription period unit to Month.
     *     Period:1, //Set the subscription period to 1. The unit is specified by PeriodUnit, which is Month in this example.
     *     AutoRenew:true, //Set this parameter to true to enable auto-renewal.
     *     AutoRenewPeriod:1 //Set the renewal period to 1. The unit is specified by PeriodUnit, which is Month in this example.
     * <strong>Example: Create 10 pay-as-you-go ECS instances</strong>
     *     Amount:10, //Set the number of ECS instances that you want to create to 10.
     *     InstanceChargeType:&quot;PostPaid&quot;, //Set the billing method to PostPaid, which specifies the pay-as-you-go billing method.
     *     SpotStrategy:&quot;NoSpot&quot; //Set this parameter to NoSpot, which is the default value and specifies that the instances are created as pay-as-you-go instances.
     * <strong>Example: Create 20 preemptible instances that use a specified bidding policy and a protection period</strong>
     *     Amount:20, //Set the number of ECS instances that you want to create to 20.
     *     InstanceChargeType:&quot;PostPaid&quot;,
     *     SpotStrategy:&quot;SpotAsPriceGo&quot;, //Set the bidding policy to SpotAsPriceGo, which specifies that the instances are created as preemptible instances for which the market price at the time of purchase is automatically used as the bid price.
     *     SpotDuration:1 //Set the protection period of the preemptible instances to 1. Unit: hours.
     * Call the <a href="https://help.aliyun.com/document_detail/2679729.html">CreateLaunchTemplate</a> operation to create a launch template. Then, use the launch template to create ECS instances in the China (Hangzhou) region. Examples:
     * <strong>Example: Create 10 ECS instances based on a launch template</strong>
     *     RegionId:&quot;cn-hangzhou&quot;, //Set the region ID to cn-hangzhou, which specifies the China (Hangzhou) region.
     *     Amount:10, //Set the number of ECS instances that you want to create to 10.
     *     LaunchTemplateId:&quot;lt-bp14xczpoxvb6rre****&quot; //Set the launch template ID to lt-bp14xczpoxvb6rre****.</p>
     * <blockquote>
     * <p> If a parameter is specified both in the launch template that you reference in a request and in the instance parameters of the same request, the value specified in the instance parameters takes precedence. For example, if you set InstanceChargeType in the launch template to PrePaid (subscription) and set InstanceChargeType in the instance parameters to PostPaid (pay-as-you-go), the created instances are pay-as-you-go instances.</p>
     * </blockquote>
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
     * <p>This operation is an asynchronous operation. After you call this operation to start an ECS instance, the operation sets the status of the ECS instance to Starting and begins the startup process. You can call the <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> operation to query the status of the ECS instance. When the status of the ECS instance changes to <code>Running</code>, the instance is started.</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>You cannot call this operation to start an ECS instance that is locked for security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
     * <li>The ECS instance that you want to start must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>If an ECS instance is stopped in economical mode, the instance may fail to be started due to insufficient resources.</li>
     * </ul>
     * 
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After you call this operation to start ECS instances, the operation sets the status of the ECS instances to Starting and begins the startup process. You can call the <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> operation to query the status of the instances. When the status of the ECS instances changes to <code>Running</code>, the instances are started.</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>You cannot call this operation to start ECS instances that are locked for security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
     * <li>The ECS instances that you want to start must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>ECS instances stopped in economical mode may fail to be started due to insufficient resources.</li>
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
     * <li>The Cloud Assistant Agent versions that are later than the following ones support the session management feature. If you need to upgrade the Cloud Assistant Agent version, follow the instructions in <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades of Cloud Assistant Agent</a>.<ul>
     * <li>Linux operating system: 2.2.3.256</li>
     * <li>Windows operating system: 2.1.3.256</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Each WebSocket URL returned by the StartTerminalSession operation remains valid for 10 minutes.</li>
     * <li>If no data is transferred over a session within 3 minutes, Cloud Assistant closes the session connection.</li>
     * <li>Up to 1,000 sessions can be created and available in a region. Each ECS instance can have up to 20 sessions in the connected state. Each session supports a bandwidth of up to 200 Kbit/s.</li>
     * <li>The port forwarding feature supports only TCP port forwarding. UDP port forwarding is not supported.</li>
     * <li>If you want to permanently close a session and invalidate the WebSocket URL, call the EndTerminalSession operation.</li>
     * </ul>
     * 
     * @param request the request parameters of StartTerminalSession  StartTerminalSessionRequest
     * @return StartTerminalSessionResponse
     */
    CompletableFuture<StartTerminalSessionResponse> startTerminalSession(StartTerminalSessionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After you call this operation to stop an ECS instance, the operation sets the status of the ECS instance to Stopping and begins the stop process. You can call the <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> operation to query the status of the ECS instance. When the status of the ECS instance changes to <code>Stopped</code>, the instance is stopped.</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>You cannot call this operation to stop an ECS instance that is locked for security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
     * <li>After you enable the default economical mode for all pay-as-you-go ECS instances located in virtual private clouds (VPCs) in your account, you can set <code>StoppedMode</code> to KeepCharging for the ECS instance that you want to stop to enable standard mode. This way, the ECS instance continues to be billed after the instance is stopped. The instance type resources and public IP address of the instance are retained.</li>
     * </ul>
     * 
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is an asynchronous operation. After you call this operation to stop ECS instances, the operation sets the status of the ECS instances to Stopping and begins the stop process. You can call the <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> operation to query the status of the ECS instances. When the status of the ECS instances changes to <code>Stopped</code>, the instances are stopped.</p>
     * <h3><a href="#"></a>Precautions</h3>
     * <ul>
     * <li>You cannot call this operation to stop ECS instances that are locked for security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.</li>
     * <li>After you enable the default economical mode for all pay-as-you-go ECS instances located in virtual private clouds (VPCs) in your account, you can set <code>StoppedMode</code> to KeepCharging for the pay-as-you-go ECS instances that you want to stop to enable standard mode. This way, the instances continue to be billed after they are stopped. The instance type resources and public IP addresses of the instances are retained.</li>
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
