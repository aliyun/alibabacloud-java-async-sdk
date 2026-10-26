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
     * @deprecated OpenAPI ActivateRouterInterface is deprecated, please use Vpc::2016-04-28::ActivateRouterInterface instead.  * @param request  the request parameters of ActivateRouterInterface  ActivateRouterInterfaceRequest
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
     * @deprecated OpenAPI AddTags is deprecated, please use Ecs::2014-05-26::TagResources instead.  * @param request  the request parameters of AddTags  AddTagsRequest
     * @return AddTagsResponse
     */
    @Deprecated
    CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request);

    /**
     * <b>description</b> :
     * <p>Before you create a dedicated host, invoke <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> to query the available resources in a specific region or zone.
     * Creating a dedicated host incurs fees. Familiarize yourself with the billing method of the resources in advance. For more details, see <a href="https://help.aliyun.com/document_detail/68978.html">Billing overview</a>.</p>
     * <ul>
     * <li>You can create up to 100 subscription or pay-as-you-go dedicated hosts at a time.</li>
     * <li>After the dedicated hosts are created, you can use the returned dedicated host IDs as request parameters and invoke <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the status of the new dedicated hosts.</li>
     * <li>After you commit a request to create dedicated hosts, a fault is returned if the specified parameter values are invalid or the resources are insufficient. For more information about fault causes, see the error codes section.</li>
     * <li>After you create a dedicated host, you can invoke <a href="https://help.aliyun.com/document_detail/134248.html">ModifyInstanceDeployment</a> to perform migration of ECS instances from a shared host to the dedicated host, or adjust instance deployment between two dedicated hosts.</li>
     * </ul>
     * 
     * @param request the request parameters of AllocateDedicatedHosts  AllocateDedicatedHostsRequest
     * @return AllocateDedicatedHostsResponse
     */
    CompletableFuture<AllocateDedicatedHostsResponse> allocateDedicatedHosts(AllocateDedicatedHostsRequest request);

    /**
     * @deprecated OpenAPI AllocateEipAddress is deprecated, please use Vpc::2016-04-28::AllocateEipAddress instead.  * @param request  the request parameters of AllocateEipAddress  AllocateEipAddressRequest
     * @return AllocateEipAddressResponse
     */
    @Deprecated
    CompletableFuture<AllocateEipAddressResponse> allocateEipAddress(AllocateEipAddressRequest request);

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Before you assign a public IP address, the instance must be in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state.  </li>
     * <li>You cannot assign a public IP address to an instance that is <a href="https://help.aliyun.com/document_detail/25695.html">locked for security reasons</a> and has <code>&quot;LockReason&quot; : &quot;security&quot;</code> in <code>OperationLocks</code>. </li>
     * <li>When you call this operation, make sure that the bandwidth of the instance is greater than 0. You can call the <a href="https://help.aliyun.com/document_detail/2679879.html">ModifyInstanceNetworkSpec</a> operation to adjust the bandwidth.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Only whitelisted users can specify the <code>IpAddress</code> parameter for the public IP address. If the public bandwidth is greater than 0, you can set <code>InstanceId</code> to randomly assign an IP address. If the public bandwidth is 0, you must call <a href="https://help.aliyun.com/document_detail/2679879.html">ModifyInstanceNetworkSpec</a> to adjust the bandwidth before you use this operation to assign an IP address.</li>
     * <li>Only one public IP address can be assigned to an instance. If the instance already has a public IP address, the assigned public IP address <code>IpAddress</code> is returned. </li>
     * <li>The new public IP address takes effect after you restart the instance by calling <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> or start the instance by calling <a href="https://help.aliyun.com/document_detail/25500.html">StartInstance</a>.<br>In addition to assigning a public IP address, you can also associate an Elastic IP Address (EIP) with a VPC-type ECS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2518064.html">AssociateEipAddress</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AllocatePublicIpAddress  AllocatePublicIpAddressRequest
     * @return AllocatePublicIpAddressResponse
     */
    CompletableFuture<AllocatePublicIpAddressResponse> allocatePublicIpAddress(AllocatePublicIpAddressRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Each cloud disk supports up to 10 automatic snapshot policies.</li>
     * <li>If the target cloud disk already has automatic snapshot policies applied, calling this operation adds new policies without replacing the existing ones.<blockquote>
     * <p>Cancel unnecessary automatic snapshot policies to avoid unexpected costs.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ApplyAutoSnapshotPolicy  ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
     */
    CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can specify IPv6 addresses within the CIDR block of the vSwitch to which the elastic network interface (ENI) belongs, or specify the number of IPv6 addresses for automatic creation of IPv6 addresses. Note the following items:</p>
     * <ul>
     * <li>The vSwitch to which the ENI belongs must have IPv6 enabled. For more information, see <a href="https://help.aliyun.com/document_detail/98923.html">Enable an IPv6 CIDR block for an existing vSwitch</a>.</li>
     * <li>The ENI must be in the Active or InUse state.</li>
     * <li>When you operate on a primary network interface controller (NIC), the instance to which the NIC is attached must be in the Running or Stopped state.</li>
     * <li>The number of IPv6 addresses that can be allocated to a single NIC depends on the instance type of the instance to which the NIC is attached.<ul>
     * <li>If the ENI is in the Active state, you can allocate up to 10 IPv6 addresses to the ENI.</li>
     * <li>If the ENI is attached to an instance, the number of IPv6 addresses that can be allocated is limited by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
     * </ul>
     * </li>
     * <li>After you call this operation, you can obtain the allocated IPv6 address information from the response.</li>
     * </ul>
     * 
     * @param request the request parameters of AssignIpv6Addresses  AssignIpv6AddressesRequest
     * @return AssignIpv6AddressesResponse
     */
    CompletableFuture<AssignIpv6AddressesResponse> assignIpv6Addresses(AssignIpv6AddressesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Only elastic network interfaces (ENIs) in the Available or InUse state are supported.</li>
     * <li>When you operate the primary network interface controller (NIC), the instance to which the network interface controller (NIC) is attached must be in the Running or Stopped state.</li>
     * <li>When an elastic network interfaces (ENIs) is in the Available state, you can allocate up to 49 secondary private IP addresses to the ENI. After the ENI is attached to an instance, the number of secondary private IP addresses that can be allocated to the ENI is subject to the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
     * <li>After you call this operation, you can obtain the allocated secondary private IP address information from the response.</li>
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
     * @deprecated OpenAPI AssociateHaVip is deprecated, please use Vpc::2016-04-28::AssociateHaVip instead.  * @param request  the request parameters of AssociateHaVip  AssociateHaVipRequest
     * @return AssociateHaVipResponse
     */
    @Deprecated
    CompletableFuture<AssociateHaVipResponse> associateHaVip(AssociateHaVipRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>Before you connect a classic network type instance, the instance must be in the <strong>Running</strong> or <strong>Stopped</strong> state. </li>
     * <li>The destination VPC must have ClassicLink enabled. For more information, see <a href="https://help.aliyun.com/document_detail/65413.html">Enable ClassicLink feature</a>. </li>
     * <li>The classic network type instance and the VPC must be in the same region.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachClassicLinkVpc  AttachClassicLinkVpcRequest
     * @return AttachClassicLinkVpcResponse
     */
    CompletableFuture<AttachClassicLinkVpcResponse> attachClassicLinkVpc(AttachClassicLinkVpcRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The instance and the disk must be in the same zone.</li>
     * <li>The disk must be in the <strong>Available</strong> (<code>Available</code>) state. </li>
     * <li>When you attach a data disk:<ul>
     * <li>The target ECS instance must be in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state. </li>
     * <li>If the disk was purchased separately, its billing method must be pay-as-you-go.</li>
     * <li>If a system disk detached from an ECS instance is attached as a data disk, its billing method is not limited. </li>
     * <li>Once an elastic ephemeral disk is detached, it can only be reattached to its original instance.</li>
     * </ul>
     * </li>
     * <li>When you attach a system disk:<ul>
     * <li>The destination ECS instance must be the source instance from which the system disk was detached.</li>
     * <li>The destination ECS instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state. </li>
     * <li>You must configure the logon credentials for the instance.</li>
     * <li>Elastic ephemeral disks cannot be attached as system disks.</li>
     * <li>For more information about attaching a system disk, see <a href="https://help.aliyun.com/document_detail/146752.html">Detach or attach a system disk</a>.</li>
     * </ul>
     * </li>
     * <li>When you query the information of an ECS instance, if the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code>, all operations on the instance are prohibited.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>Disks with the multi-attach attribute enabled can only be attached to instances that support the NVMe protocol. 
     *  For more information, see <a href="https://help.aliyun.com/document_detail/256487.html">standard SSD support NVMe</a> and <a href="https://help.aliyun.com/document_detail/262105.html">Use the multi-attach feature</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachDisk  AttachDiskRequest
     * @return AttachDiskResponse
     */
    CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request);

    /**
     * <b>description</b> :
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2679686.html">DescribeInstanceRamRole</a> to query the <a href="https://help.aliyun.com/document_detail/61175.html">instance RAM role</a> attached to an instance.</p>
     * <blockquote>
     * <p>If the instance already has an instance RAM role attached, an error is returned indicating that you cannot attach a new role.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AttachInstanceRamRole  AttachInstanceRamRoleRequest
     * @return AttachInstanceRamRoleResponse
     */
    CompletableFuture<AttachInstanceRamRoleResponse> attachInstanceRamRole(AttachInstanceRamRoleRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Windows instances do not support SSH key pairs. </li>
     * <li>After you attach an SSH key pair, authentication by using a username and password is disabled. </li>
     * <li>If an instance is in the <strong>Running</strong> state, restart the instance by calling <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> for the SSH key pair to take effect.  </li>
     * <li>If an instance is in the <strong>Stopped</strong> state, start the instance by calling <a href="https://help.aliyun.com/document_detail/25500.html">StartInstance</a> for the SSH key pair to take effect.  </li>
     * <li>If an SSH key pair is already attached to an instance, the new SSH key pair automatically replaces the original one.</li>
     * <li>This is a batch operation that supports partial success. An HTTP 200 response indicates only that the request has been processed, not that all instances are successfully attached. Check the FailCount value and the Code and Success fields of each element in Results.Result[] to determine the result for each instance:<ul>
     * <li>Request-level errors: Errors such as invalid parameters, nonexistent key pair, or more than 50 instances are intercepted before batch execution. The error is returned at the top level of the response with a non-200 HTTP status code, and the entire batch request fails.</li>
     * <li>Instance-level errors: Errors such as a Windows instance, an unsupported instance state, or an unsupported instance type affect only the corresponding instance. The error code is recorded in the corresponding Results.Result[] element, and the overall request still returns HTTP 200.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AttachKeyPair  AttachKeyPairRequest
     * @return AttachKeyPairResponse
     */
    CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><p>The Elastic Network Interface (ENI) must be in the <strong>Active</strong> (<code>Available</code>) state. An ENI can be attached to only one instance that resides in the same zone and VPC as the ENI.</p>
     * </li>
     * <li><p>The instance must be in the Running or Stopped state. Some instance types require the instance to be in the Stopped state when you attach an Elastic Network Interface (ENI). For more information, see the ECS instance types that require instance stop section in <a href="https://help.aliyun.com/document_detail/58503.html">Attach an ENI</a>.</p>
     * <blockquote>
     * <p>If the instance was last started before April 1, 2018 (including but not limited to starting a newly purchased instance, restarting, or powering on), you must invoke RebootInstance to restart the instance that has been in the Running state. Otherwise, the Elastic Network Interface (ENI) cannot be attached.</p>
     * </blockquote>
     * </li>
     * <li><p>Multiple Elastic Network Interfaces (ENIs) can be attached to a single instance at the same time. For more information, see <a href="https://help.aliyun.com/document_detail/58496.html">ENI overview</a>.</p>
     * </li>
     * <li><p>The vSwitch to which the ENI belongs must be in the same zone and VPC as the instance.</p>
     * </li>
     * <li><p>This is an asynchronous operation. After you send a successful request, you can check the Elastic Network Interface (ENI) status or listen for network interface controller (NIC) operation events to obtain the operation result. The ENI state machine is shown in the following figure:
     * <img src="https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/zh-CN/20221124/esgu/AttachNetworkInterface.jpg" alt=""></p>
     * <ul>
     * <li>Attaching indicates that the attach ENI request has been sent and the ENI is being attached to the ECS instance.</li>
     * <li>InUse indicates that the ENI is attached to the ECS instance.</li>
     * <li>Available indicates that the ENI failed to be attached to the ECS instance.
     * <strong>For details about sample code, see</strong> <a href="https://help.aliyun.com/document_detail/471550.html">Attach an Elastic Network Interface (ENI)</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AttachNetworkInterface  AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
     */
    CompletableFuture<AttachNetworkInterfaceResponse> attachNetworkInterface(AttachNetworkInterfaceRequest request);

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li><strong>Quota limit:</strong> The total number of rules (including inbound and outbound rules) in all security groups associated with a single Elastic Network Interface (ENI) cannot exceed 1,000. For more information about specific limits, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.  </li>
     * <li><strong>Priority settings:</strong> The priority of an inbound rule ranges from 1 to 100. A smaller value indicates a higher priority. For security group rules with the same priority, rules that deny access (drop) take precedence.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <p>If the specified security group rule already exists, the call succeeds but no new rule is added.</p>
     * <h3>Rule definition</h3>
     * <p>To define an inbound rule, you must specify the following parameters:</p>
     * <ul>
     * <li>Source settings: Specify one of the following parameters: SourceCidrIp (IPv4 address), Ipv6SourceCidrIp (IPv6 address), SourcePrefixListId (prefix list ID), or SourceGroupId (source security group).</li>
     * <li>Destination port range: PortRange.</li>
     * <li>Protocol type: IpProtocol.</li>
     * <li>Access policy: Policy.<blockquote>
     * <p>Advanced security groups do not support authorization of access from other security groups. A basic security group supports authorization of up to 20 security groups.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Request examples</h3>
     * <p>Assume that you want to add several inbound rules with different sources to a specified security group in the China (Hangzhou) region:</p>
     * <ul>
     * <li>Add access permissions for a specified IP address range.<pre><code class="language-json">&quot;RegionId&quot;:&quot;cn-hangzhou&quot;, // Specify the region.
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;, // Specify the security group.
     * &quot;Permissions&quot;:[
     *      {
     *        &quot;SourceCidrIp&quot;:&quot;10.0.0.0/8&quot;, // Specify the source IPv4 address.
     *        &quot;PortRange&quot;:&quot;22/22&quot;, // Specify the port range.
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;, // Specify the protocol type.
     *        &quot;Policy&quot;:&quot;Accept&quot; // Specify the access policy.
     *      }
     * ]
     * </code></pre>
     * </li>
     * <li>Add access permissions for another security group and a prefix list.<pre><code class="language-json">&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *      {
     *        &quot;SourceGroupId&quot;:&quot;sg-bp17vs63txqxbd****&quot;, // Specify the source security group.
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      },{
     *        &quot;SourcePrefixListId&quot;:&quot;pl-x1j1k5ykzqlixdcy****&quot;, // Specify the source prefix list.
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      }
     * ]
     * </code></pre>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AuthorizeSecurityGroup  AuthorizeSecurityGroupRequest
     * @return AuthorizeSecurityGroupResponse
     */
    CompletableFuture<AuthorizeSecurityGroupResponse> authorizeSecurityGroup(AuthorizeSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li><strong>Quota limit:</strong> The total number of rules (including inbound rules and outbound rules) in all security groups associated with a single Elastic Network Interface (ENI) cannot exceed 1,000. For more information about the limits, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.  </li>
     * <li><strong>Priority settings:</strong> The priority of an outbound security group rule ranges from 1 to 100. A smaller value indicates a higher priority. If multiple security group rules have the same priority, the deny (drop) rule takes precedence.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <p>If the specified security group rule already exists, the call succeeds but no new rule is added.</p>
     * <h3>Rule definition</h3>
     * <p>To define an outbound security group rule, you must specify the following parameters:</p>
     * <ul>
     * <li>Destination settings: Specify one of the following parameters: DestCidrIp (IPv4 address), Ipv6DestCidrIp (IPv6 address), DestPrefixListId (prefix list ID), or DestGroupId (destination security group).</li>
     * <li>Destination port range: PortRange.</li>
     * <li>Protocol type: IpProtocol.</li>
     * <li>Access policy: Policy.<blockquote>
     * <p>Advanced security groups do not support authorization for other security groups. A basic security group supports authorization for up to 20 security groups.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Request examples</h3>
     * <p>Assume that you want to add several outbound rules with different destinations to a specified security group in the China (Hangzhou) region:</p>
     * <ul>
     * <li>Add access permissions for a specified IP address range.<pre><code>&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,  // Set the region.
     * &quot;SecurityGroupId&quot;:&quot;sg-bp17vs63txqxbds9***&quot;, // Set the security group.
     * &quot;Permissions&quot;:[
     *      {
     *        &quot;DestCidrIp&quot;:&quot;10.0.0.0/8&quot;, // Set the destination IPv4 address.
     *        &quot;PortRange&quot;:&quot;-1/-1&quot;, // Set the port range.
     *        &quot;IpProtocol&quot;:&quot;ICMP&quot;, // Set the protocol type.
     *        &quot;Policy&quot;:&quot;Accept&quot; // Set the access policy.
     *      }
     * ]
     * </code></pre>
     * </li>
     * <li>Add access permissions for another security group and a prefix list.<pre><code>&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,
     * &quot;SecurityGroupId&quot;:&quot;sg-bp17vs63txqxbds9***&quot;,
     * &quot;Permissions&quot;:[
     *      {
     *        &quot;DestGroupId&quot;:&quot;sg-bp67acfmxazb4pi***&quot;, // Set the destination security group.
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      },{
     *        &quot;DestPrefixListId&quot;:&quot;pl-x1j1k5ykzqlixdcy****&quot;, // Set the destination prefix list.
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      }
     * ]
     * </code></pre>
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
     * <li>After the image copy task is canceled, the new image in the destination region is automatically deleted, and the source image remains unchanged.</li>
     * <li>If the image copy task is already completed, the operation fails and an error message is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelCopyImage  CancelCopyImageRequest
     * @return CancelCopyImageResponse
     */
    CompletableFuture<CancelCopyImageResponse> cancelCopyImage(CancelCopyImageRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure that the image build task to be canceled is in the PREPARING, REPAIRING, or BUILDING state.</p>
     * 
     * @param request the request parameters of CancelImagePipelineExecution  CancelImagePipelineExecutionRequest
     * @return CancelImagePipelineExecutionResponse
     */
    CompletableFuture<CancelImagePipelineExecutionResponse> cancelImagePipelineExecution(CancelImagePipelineExecutionRequest request);

    /**
     * @deprecated OpenAPI CancelPhysicalConnection is deprecated, please use Vpc::2016-04-28::CancelPhysicalConnection instead.  * @param request  the request parameters of CancelPhysicalConnection  CancelPhysicalConnectionRequest
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
     * <b>description</b> :
     * <blockquote>
     * <p>The cloud disk cloning feature itself is free of charge, but the new cloud disk generated by cloning is billed according to the block storage billing rules. The billable items of a cloud disk vary by type and include cloud disk capacity fees, provisioned performance fees, and performance burst fees. Except for performance burst fees, which are billed after a burst occurs, all other fees are billed immediately after creation, regardless of whether the cloud disk is attached to an instance.</p>
     * </blockquote>
     * <h3>Usage</h3>
     * <ul>
     * <li>This operation is asynchronous. After a successful call, use the taskGroupId parameter and call the DescribeTasks operation to obtain the execution result.</li>
     * </ul>
     * <h3>Features</h3>
     * <ul>
     * <li>Cloning only supports directly cloning a new cloud disk from the entire ESSD cloud disk family (cloud_essd, cloud_auto, cloud_essd_entry, and cloud_regional_disk_auto). The cloned new cloud disk only supports ESSD cloud disk types.<ul>
     * <li>Non-zone-redundant cloud disks can only be cloned to non-zone-redundant types, and zone-redundant cloud disks can only be cloned to zone-redundant cloud disks.</li>
     * <li>Local disks and elastic ephemeral disks neither support cloning nor can be cloned.</li>
     * </ul>
     * </li>
     * <li>You can specify the type and performance level of the new cloud disk.</li>
     * <li>You can specify the capacity of the new cloud disk, but the capacity of the new cloud disk must be greater than or equal to that of the source cloud disk.</li>
     * <li>You can configure provisioned performance and performance bursting for the new cloud disk, provided that the target disk type supports provisioned performance and performance bursting.</li>
     * <li>You can specify encryption and change the encryption key for the new cloud disk. If the source cloud disk is encrypted, you cannot clone it into an unencrypted cloud disk, but you can change the encryption key.</li>
     * <li>You can use a subscription cloud disk as the source cloud disk. Even if the subscription cloud disk has expired, it can still be used as the source cloud disk.</li>
     * <li>The cloned new cloud disk does not support re-initialization.</li>
     * <li>Cloning does not support storage sets or dedicated storage clusters, but disks within them can be used as the source cloud disk. The cloned disk will not be placed in a storage set or dedicated storage cluster.</li>
     * <li>Source cloud disk status restrictions:<ul>
     * <li>The source cloud disk is in the In Use state, and the corresponding instance status is Running or Stopped.</li>
     * <li>The source cloud disk is in the Unattached state, and the cloud disk has been mounted before.</li>
     * <li>Disks undergoing Upgrade/Downgrade cannot be used as the source cloud disk.</li>
     * <li>Disks undergoing capacity expansion cannot be used as the source cloud disk.</li>
     * </ul>
     * </li>
     * <li>Cloud disk cloning is not supported in instance hibernation scenarios. That is, if a disk is on a hibernated instance, it cannot be used as the source cloud disk.</li>
     * </ul>
     * 
     * @param request the request parameters of CloneDisks  CloneDisksRequest
     * @return CloneDisksResponse
     */
    CompletableFuture<CloneDisksResponse> cloneDisks(CloneDisksRequest request);

    /**
     * @deprecated OpenAPI ConnectRouterInterface is deprecated, please use Vpc::2016-04-28::ConnectRouterInterface instead.  * @param request  the request parameters of ConnectRouterInterface  ConnectRouterInterfaceRequest
     * @return ConnectRouterInterfaceResponse
     */
    @Deprecated
    CompletableFuture<ConnectRouterInterfaceResponse> connectRouterInterface(ConnectRouterInterfaceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>After a public IP address is converted to an EIP, the EIP is billed separately. Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/122035.html">billable methods of EIPs</a>.
     * When you invoke this operation, the ECS instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance is in the <strong>Stopped</strong> (<code>Stopped</code>) or <strong>Running</strong> (<code>Running</code>) state.</li>
     * <li>No EIP is attached to the instance.</li>
     * <li>The instance has no pending configuration change nodes.</li>
     * <li>The public bandwidth cannot be 0 Mbit/s.</li>
     * <li>For subscription instances, the billing method for public bandwidth must be <code>pay-by-traffic</code>. Public IP addresses with the <code>pay-by-bandwidth</code> billing method cannot be converted to EIPs. Pay-as-you-go instances are not subject to this restriction. For more information, refer to <a href="https://help.aliyun.com/document_detail/178883.html">Transform the billing method for public bandwidth</a>.</li>
     * <li>The VPC-type subscription ECS instance does not expire within 24 hours.</li>
     * </ul>
     * 
     * @param request the request parameters of ConvertNatPublicIpToEip  ConvertNatPublicIpToEipRequest
     * @return ConvertNatPublicIpToEipResponse
     */
    CompletableFuture<ConvertNatPublicIpToEipResponse> convertNatPublicIpToEip(ConvertNatPublicIpToEipRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can use the copied image to create an ECS instance by calling the RunInstances operation, or replace the system cloud disk of an instance by calling the ReplaceSystemDisk operation in the destination region. 
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The custom image must be in the Available state.  </li>
     * <li>If the image is a custom image under your account, you can copy it across regions. If the image is shared by another account, you can only copy it within the same region. </li>
     * <li>During the image copy process, you cannot directly delete the image that is being copied by calling the <a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a> operation. However, you can delete the image by canceling the copy task by calling the <a href="https://help.aliyun.com/document_detail/25539.html">CancelCopyImage</a> operation.  </li>
     * <li>A maximum of five image copy tasks can run concurrently in the same region. Other tasks must wait in queue until one of the running tasks is completed.</li>
     * <li>You can use the ResourceGroupId parameter to specify the resource group to which the copied image belongs. If you do not specify the ResourceGroupId parameter, the copied image belongs to the default resource group.</li>
     * </ul>
     * 
     * @param request the request parameters of CopyImage  CopyImageRequest
     * @return CopyImageResponse
     */
    CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The new snapshot cannot be used to roll back the cloud disk for which the source snapshot was created.</li>
     * <li>Copying local snapshots is not supported.</li>
     * </ul>
     * 
     * @param request the request parameters of CopySnapshot  CopySnapshotRequest
     * @return CopySnapshotResponse
     */
    CompletableFuture<CopySnapshotResponse> copySnapshot(CopySnapshotRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>After you use an activation code to register a non-Alibaba Cloud server as an Alibaba Cloud managed instance, you can use various online services provided by Alibaba Cloud in the managed instance, such as Cloud Assistant, operations management, and Alibaba Cloud DevOps.
     * The operating system of the non-Elastic Compute Service server must meet the following version requirements, and the server must have Internet access before it can be registered as an Alibaba Cloud managed instance.</p>
     * <ul>
     * <li>Alibaba Cloud Linux 2/3 and later</li>
     * <li>CentOS 6/7/8 and later</li>
     * <li>Debian 8/9/10 and later</li>
     * <li>Ubuntu 12/14/16/18 and later</li>
     * <li>CoreOS</li>
     * <li>OpenSUSE</li>
     * <li>RedHat 5/6/7 and later</li>
     * <li>SUSE Linux Enterprise Server 11/12/15 and later</li>
     * <li>Window Server 2012/2016/2019 and later
     * In a single Alibaba Cloud region, you can have up to 10 managed instance activation codes. Each activation code can be used to activate up to 10 instances. The maximum validity period of a single activation code is 4 hours.<blockquote>
     * <p>On the <strong>ECS Cloud Assistant</strong> page, click the <strong>Managed Instances</strong> tab, and then click <strong>Register New Instance</strong> to view the usage data of activation codes.</p>
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
     * <ul>
     * <li>Auto provisioning is a solution that uses spot instances and pay-as-you-go instances to quickly deploy instance clusters. It supports one-click deployment of instance clusters across Billable methods, zones, and instance family. For more information, see <a href="https://help.aliyun.com/document_detail/200772.html">Use the auto provisioning group API to create ECS instances in batches</a>.</li>
     * <li>Auto provisioning relies on auto provisioning groups for scheduling and maintenance of compute resources. You can use auto provisioning groups to stably provide computing power and mitigate the instability caused by the revoke mechanism of spot instances.</li>
     * <li>The auto provisioning feature is free of charge, but you are billed for the instance resources created by using auto provisioning groups. For more information, see <a href="https://help.aliyun.com/document_detail/52088.html">Billing of spot instances</a> and <a href="https://help.aliyun.com/document_detail/40653.html">Pay-as-you-go</a>.</li>
     * <li>If you specify both a launch template (<code>LaunchTemplateId</code>) and launch configurations (<code>LaunchConfiguration.*</code>), the system preferentially uses the launch template.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAutoProvisioningGroup  CreateAutoProvisioningGroupRequest
     * @return CreateAutoProvisioningGroupResponse
     */
    CompletableFuture<CreateAutoProvisioningGroupResponse> createAutoProvisioningGroup(CreateAutoProvisioningGroupRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, read <a href="https://help.aliyun.com/document_detail/127767.html">Create an automatic snapshot policy</a>.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>An Alibaba Cloud account can create up to 100 automatic snapshot policies in a region. When the number of automatic snapshots for a cloud disk reaches the quota limit, the system deletes the earliest automatic snapshot generated by the automatic snapshot policy when creating a new snapshot task.</li>
     * <li>The system does not execute the automatic snapshot policy when an ECS instance has a stop or restart task.</li>
     * <li>If cross-region snapshot replication is enabled and encryption parameters are not configured, encrypted snapshots are copied and encrypted by using the destination service key by default. For precautions on cross-region snapshot replication, see <a href="https://help.aliyun.com/document_detail/159441.html">Copy a snapshot</a>.
     * After creating an automatic snapshot policy, you must call <a href="https://help.aliyun.com/document_detail/25531.html">ApplyAutoSnapshotPolicy</a> to apply the policy to the target cloud disks. To modify the automatic snapshot policy, call <a href="https://help.aliyun.com/document_detail/25529.html">ModifyAutoSnapshotPolicyEx</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAutoSnapshotPolicy  CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
     */
    CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can use a capacity reservation to specify the zone, instance type, and other property settings. The system reserves resources that match the specified property in a private pool. For more information, see <a href="https://help.aliyun.com/document_detail/193633.html">Overview of immediate capacity reservations</a>.</p>
     * <ul>
     * <li>Currently, this service only supports the immediate effective pattern. After you purchase an immediate capacity reservation, the instance type follows the pay-as-you-go billing standard regardless of whether pay-as-you-go instances are actually created, until you perform a manual release or the system performs an automatic release upon expiration.<ul>
     * <li>You can set the private pool capacity options when you invoke <a href="https://help.aliyun.com/document_detail/25499.html">CreateInstance</a> or <a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a> to create an instance, or invoke <a href="https://help.aliyun.com/document_detail/190006.html">ModifyInstanceAttachmentAttributes</a> to modify the private pool capacity options of an instance. After an instance successfully matches the private pool capacity, you are billed for resources such as the instance type, cloud disks, and public bandwidth based on your instance configurations.</li>
     * <li>If no pay-as-you-go instances are actually created, you are billed only for the instance type.</li>
     * </ul>
     * </li>
     * <li>Bills for matched instances and unused capacity of immediate capacity reservations can be offset by savings plans or regional reserved instances on an hourly basis, but cannot be offset by zonal reserved instances. We recommend that you purchase reserved instances or savings plans first. Using immediate capacity reservations under the overwrite of reserved instances or savings plans allows you to obtain guaranteed resources for free.<blockquote>
     * <p>When you invoke this API operation, you can only create immediate capacity reservations. You can create immediate capacity reservations or scheduled capacity reservations in the ECS console. For more information, see <a href="~~193626#section-oil-qh5-xvx~~">Resource reservation</a>.</p>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>You can create the following types of commands: <ul>
     * <li>Bat scripts for Windows instances (RunBatScript).</li>
     * <li>PowerShell scripts for Windows instances (RunPowerShellScript).</li>
     * <li>Shell scripts for Linux instances (RunShellScript).</li>
     * </ul>
     * </li>
     * <li>You can specify the Timeout parameter to set the maximum timeout period for command execution on ECS instances. If the command times out, <a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> forcefully terminates the command process by canceling the PID of the command.<ul>
     * <li>For a one-time execution, after the command times out, the execution status (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) of the command on the specified ECS instance changes to Failed.  </li>
     * <li>For a scheduled execution: <ul>
     * <li>The timeout period takes effect for each execution record. </li>
     * <li>After a specific execution times out, the status (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) of the execution record changes to Failed.  </li>
     * <li>The timeout of a previous execution does not affect the next execution.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>You can retain up to 500 to 50,000 Cloud Assistant commands in a region. You can also request a quota increase. For information about how to query and increase quotas, see <a href="https://help.aliyun.com/document_detail/184116.html">Quota management</a>.</li>
     * <li>You can specify the WorkingDir parameter to set the execution path of the command. For Linux instances, the default path is the home directory of the root user, which is <code>/root</code>. For Windows instances, the default path is the directory where the Cloud Assistant Agent process is located, such as <code>C:\\Windows\\System32</code>.</li>
     * <li>You can specify EnableParameter=true to enable the custom parameter feature. When you set CommandContent, you can define custom parameters in the {{parameter}} format and pass in custom parameter key-value pairs when you run the command by calling <a href="https://help.aliyun.com/document_detail/64841.html">InvokeCommand</a>. For example, if you create the command <code>echo {{name}}</code> and pass in the key-value pair <code>&lt;name, Jack&gt;</code> by using the Parameters parameter when you call InvokeCommand, the custom parameter is automatically replaced. A new command <code>echo Jack</code> is generated and run on the instance.</li>
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
     * <ul>
     * <li>When you create a cloud disk, you can enable the multi-mount feature (<code>MultiAttach</code>). We recommend that you understand this feature and its limits before you enable it. For more information, see <a href="https://help.aliyun.com/document_detail/256487.html">ESSDs support NVMe</a> and <a href="https://help.aliyun.com/document_detail/262105.html">Use the multi-mount feature</a>.</li>
     * <li>Supported cloud disk types: basic cloud disk, ultra cloud disk, standard SSD, ESSD cloud disk, ESSD Entry disk, regional ESSD cloud disk, ESSD AutoPL cloud disk, elastic ephemeral disk - Standard Edition, and elastic ephemeral disk - Premium Edition.</li>
     * <li>To create a cloud disk, you must pass real-name verification. Go to the <a href="https://account.console.aliyun.com/#/auth/home">Real-name Verification</a> page in the user center.</li>
     * <li>Creating a cloud disk incurs fees. We recommend that you understand the billing methods of cloud servers in advance. For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>.</li>
     * <li>When you create a cloud disk, the following default settings apply:<ul>
     * <li>Automatic snapshots of the cloud disk are deleted when the cloud disk is deleted. This means that the <code>DeleteAutoSnapshot</code> parameter is set to <code>true</code>. You can call the <a href="https://help.aliyun.com/document_detail/2679767.html">DescribeDisks</a> operation to query the settings of this parameter and call the <a href="https://help.aliyun.com/document_detail/25517.html">ModifyDiskAttribute</a> operation to modify the parameter.</li>
     * <li>When you create an ESSD cloud disk, if you do not specify a performance level, the default performance level is PL1. You can call the <a href="https://help.aliyun.com/document_detail/123780.html">ModifyDiskSpec</a> operation to modify the performance level.</li>
     * <li>The billing method is pay-as-you-go. This means that the <code>Portable</code> property is set to <code>true</code> by default.</li>
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
     * <p>Elasticity assurance provides a new resource purchase and usage method that balances flexibility and certainty. It is a resource reservation service that provides guaranteed resources for pay-as-you-go ECS instances. For more information, see <a href="https://help.aliyun.com/document_detail/193630.html">Overview of Elasticity Assurance</a>.</p>
     * <ul>
     * <li>After you purchase an elasticity assurance service, refunds are supported for regular elasticity assurance services but not for time-sharing elasticity assurance services. For billing information, see <a href="https://help.aliyun.com/document_detail/432502.html">Resource Assurance</a>.</li>
     * <li>Elasticity assurance can be used to create only ECS instances whose billable methods are pay-as-you-go.</li>
     * <li>Currently, only the unlimited pattern is available for elasticity assurance times. This means that the <code>AssuranceTimes</code> parameter supports only the <code>Unlimited</code> value. An elasticity assurance service in unlimited pattern automatically starts after the assurance takes effect.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateElasticityAssurance  CreateElasticityAssuranceRequest
     * @return CreateElasticityAssuranceResponse
     */
    CompletableFuture<CreateElasticityAssuranceResponse> createElasticityAssurance(CreateElasticityAssuranceRequest request);

    /**
     * @deprecated OpenAPI CreateForwardEntry is deprecated, please use Vpc::2016-04-28::CreateForwardEntry instead.  * @param request  the request parameters of CreateForwardEntry  CreateForwardEntryRequest
     * @return CreateForwardEntryResponse
     */
    @Deprecated
    CompletableFuture<CreateForwardEntryResponse> createForwardEntry(CreateForwardEntryRequest request);

    /**
     * @deprecated OpenAPI CreateHaVip is deprecated, please use Vpc::2016-04-28::CreateHaVip instead.  * @param request  the request parameters of CreateHaVip  CreateHaVipRequest
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
     * <h3>Precautions</h3>
     * <ul>
     * <li>This operation is asynchronous. After a request to create a custom image is sent, an image ID is returned. The image is not created immediately. You must call <a href="https://help.aliyun.com/document_detail/2679797.html">DescribeImage</a> to query the image information. If the status in the response is <code>Available</code>, the image is created and available. For more information, see <a href="https://help.aliyun.com/document_detail/172789.html">Custom image overview</a>.</li>
     * <li>When you query ECS instance information, if the returned data contains {&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}, you cannot create a custom image.</li>
     * <li>Configure the image detection parameter <code>DetectionStrategy</code> when you create an image. This helps the system optimize your image. For more information, see <a href="https://help.aliyun.com/document_detail/439819.html">Image detection overview</a>.
     * The following section describes three methods to create a custom image by using this operation. The priority of request parameters is as follows: InstanceId &gt; DiskDeviceMapping &gt; SnapshotId. If your request contains two or more of these parameters, the parameter with the highest priority is used to create the image.</li>
     * <li><strong>Create a custom image from an instance</strong>: Specify the instance ID (<code>InstanceId</code>).<ul>
     * <li>The instance must be in the Running (<code>Running</code>) or Stopped (<code>Stopped</code>) state.</li>
     * <li>After the operation is called, a snapshot is created for each disk of the instance.<blockquote>
     * <p>Notice: Because an instance in the running state may have cached data that is not written to disks, the data in the created custom image may not be completely consistent with the instance data. Therefore, stop the instance (<a href="https://help.aliyun.com/document_detail/155372.html">StopInstances</a>) before you create an image.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><strong>Create a custom image from a snapshot (The specified snapshot cannot be created on or before July 15, 2013.)</strong><ul>
     * <li><strong>Create a custom image from a system disk snapshot</strong>: Specify only the snapshot ID of the instance system disk (<code>SnapshotId</code>).</li>
     * <li><strong>Create a custom image from a system disk snapshot and data disk snapshots</strong>: This requires establishing data associations for multiple disks (<code>DiskDeviceMapping</code>).<ul>
     * <li>Only one system disk snapshot can be specified. </li>
     * <li>Multiple data disk snapshots can be specified, up to 16. If <code>DiskDeviceMapping.N.SnapshotId</code> is not specified, an empty data disk with the default capacity is created.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When an instance is released, the system disk is converted to a pay-as-you-go data disk and retained. Snapshots created from this disk cannot be used to create custom images. Create custom images before the instance is released as needed.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateImage  CreateImageRequest
     * @return CreateImageResponse
     */
    CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Before you create an image component, take note of the following items:</p>
     * <ul>
     * <li>You can create only custom image components.</li>
     * <li>Component version numbers must be unique for components with the same name. When you use a component in a template, you can reference it by name and version number.</li>
     * <li>The content size of an image component cannot exceed 16 KB. For details about supported commands, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by Image Builder</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/197410.html">Image Builder overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageComponent  CreateImageComponentRequest
     * @return CreateImageComponentResponse
     */
    CompletableFuture<CreateImageComponentResponse> createImageComponent(CreateImageComponentRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can use an image template to customize image content and support cross-region and cross-account image building. Before you create an image template, take note of the following items:</p>
     * <ul>
     * <li>You can only create custom image templates.</li>
     * <li>You can only use public images, custom images, shared images, or an image family as source images for building.</li>
     * <li>When you build an image by using an image template, multiple intermediate instances are created to assist in the image building process. Intermediate instances are ECS instances that use the pay-as-you-go billing method and incur fees. For more information, see <a href="https://help.aliyun.com/document_detail/40653.html">Pay-as-you-go</a>.
     * Take note of the following items about the build template content BuildContent:</li>
     * <li>The FROM command is deprecated. Regardless of the FROM command Settings in the BuildContent parameter, the system selects the source image based on the BaseImageType and BaseImage parameters.</li>
     * <li>The content size of an image template cannot exceed 16 KB. For details about supported commands, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by the image building service</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/197410.html">Image building overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImagePipeline  CreateImagePipelineRequest
     * @return CreateImagePipelineResponse
     */
    CompletableFuture<CreateImagePipelineResponse> createImagePipeline(CreateImagePipelineRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API operation is no longer updated. Use the <a href="https://help.aliyun.com/document_detail/2679677.html">RunInstances</a> operation instead.
     * &lt;props=&quot;china&quot;&gt;
     * <strong>Before using this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of ECS.</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Before using this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of ECS.</strong>
     * This operation is asynchronous. After a request to create an instance is sent, the instance ID is returned. The instance is not created immediately. You must call the <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> operation to query the instance status. If the returned status is <code>Stopped</code>, the instance is created. Then, you can call the <a href="https://help.aliyun.com/document_detail/2679679.html">StartInstance</a> operation to start the instance.</p>
     * </blockquote>
     * <h3>Before you begin</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>Make sure that your account has passed real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification for accounts</a>.</p>
     * </li>
     * <li><p>Creating instances incurs fees. Make sure that you understand the billing methods of Elastic Compute Service (ECS). For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>.</p>
     * </li>
     * <li><p>Make sure that the total number of instances or vCPUs across all instance types does not exceed the system quota. For more information, see <a href="https://quotas.console.aliyun.com/products/ecs/quotas">Quota Center</a>.</p>
     * </li>
     * <li><p>Before creating a VPC-type instance, <a href="https://help.aliyun.com/document_detail/65430.html">create a VPC</a> in the corresponding Alibaba Cloud region.</p>
     * </li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>When you invoke this operation, the system does not send notifications (including text messages, emails, and internal messages) upon successful instance creation.</li>
     * <li>If the billing method of the instance is subscription (PrePaid), active coupons are used by default during payment.</li>
     * <li>If the instance memory is 512 MiB, you cannot use Windows Server images except for the Semi-Annual Channel images. If the instance memory is 4 GiB or larger, you cannot use 32-bit operating system images.</li>
     * <li>Instances created by using this operation are not assigned public IP addresses. If the Internet bandwidth is greater than 0, you can call the <a href="https://help.aliyun.com/document_detail/25544.html">AllocatePublicIpAddress</a> operation to assign a public IP address. If the Internet bandwidth is 0, you must call the <a href="https://help.aliyun.com/document_detail/2679879.html">ModifyInstanceNetworkSpec</a> operation to adjust the bandwidth and then call the <a href="https://help.aliyun.com/document_detail/25544.html">AllocatePublicIpAddress</a> operation to assign a public IP address.<blockquote>
     * <p>In a single region, the sum of peak Internet bandwidths billed by fixed bandwidth for a single Alibaba Cloud account is limited. For more information, see <a href="~~25412#BandwidthQuota~~">Internet bandwidth limits</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Usage recommendations</h3>
     * <ul>
     * <li><strong>Instance type selection</strong>: See <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to view the performance data of the target instance type. Alternatively, see <a href="https://help.aliyun.com/document_detail/58291.html">Instance type selection</a> to learn how to select an instance type.</li>
     * <li><strong>Inventory query</strong>: Call the <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> operation to check the resource availability in a specified region or zone.</li>
     * <li><strong>Custom data</strong>: If the instance meets the limits for using <a href="https://help.aliyun.com/document_detail/49121.html">instance user data</a>, you can pass in user data. When you send an API request, the UserData parameter is not encrypted. Do not pass in confidential information such as passwords and private keys in plaintext. If you must pass in such information, encrypt the information, encode it in Base64, and then pass it in. Decrypt the information inside the instance before use.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>In addition to calling CreateKeyPair to create a key pair, you can use a third-party tool to create a key pair and then upload it (<a href="https://help.aliyun.com/document_detail/51774.html">ImportKeyPair</a>) to an Alibaba Cloud region. The uploaded key pair is used in the same way as a key pair created by the system.
     * You can have a maximum of 500 key pairs in each region. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * 
     * @param request the request parameters of CreateKeyPair  CreateKeyPairRequest
     * @return CreateKeyPairResponse
     */
    CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>After you call CreateLaunchTemplate to create a launch template, a default version with the version number 1 is automatically generated. You can subsequently create multiple versions based on this template by calling CreateLaunchTemplateVersion. The version numbers increment sequentially starting from 1. If you do not specify a template version number when you create an instance by calling <a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a>, the default version is used.
     * A version of an instance launch template contains the configurations required to create an instance, such as the region, image ID, instance type, security group ID, and public bandwidth. If a specific instance configuration is not specified in the version, you must specify it when you create the instance.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can create up to 30 instance launch templates in a region for each account, and each template can have up to 30 versions.</li>
     * <li>Most parameters of an instance launch template are optional. When you create a template, Alibaba Cloud does not verify the existence or validity of the parameter values in the template. The validity of the parameter values is verified only when an instance is actually created.</li>
     * <li>If a configuration is set in the instance launch template, you cannot filter out this configuration when you create an instance by calling <a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a>. For example, if the template sets HostName=LocalHost and the HostName parameter in RunInstances is left empty, the hostname of the instance remains LocalHost. To override the HostName=LocalHost configuration, you can set HostName to MyHost or another value in RunInstances.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLaunchTemplate  CreateLaunchTemplateRequest
     * @return CreateLaunchTemplateResponse
     */
    CompletableFuture<CreateLaunchTemplateResponse> createLaunchTemplate(CreateLaunchTemplateRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you want to modify the parameters of a version, you can create a new template version. You can create up to 30 versions for each instance launch template.</p>
     * 
     * @param request the request parameters of CreateLaunchTemplateVersion  CreateLaunchTemplateVersionRequest
     * @return CreateLaunchTemplateVersionResponse
     */
    CompletableFuture<CreateLaunchTemplateVersionResponse> createLaunchTemplateVersion(CreateLaunchTemplateVersionRequest request);

    /**
     * @deprecated OpenAPI CreateNatGateway is deprecated, please use Vpc::2016-04-28::CreateNatGateway instead.  * @param request  the request parameters of CreateNatGateway  CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
     */
    @Deprecated
    CompletableFuture<CreateNatGatewayResponse> createNatGateway(CreateNatGatewayRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>This operation is a synchronization operation. A newly created Elastic Network Interface (ENI) is in the active (<code>Available</code>) state and can be attached to an instance immediately.</li>
     * <li>If the NetworkInterfaceId parameter in the response is empty, try to create the Elastic Network Interface (ENI) again.</li>
     * <li>An Elastic Network Interface (ENI) can be attached to only one instance in a VPC.</li>
     * <li>When an Elastic Network Interface (ENI) is reattached to another instance, its property remains unchanged, and network traffic is also redirected to the new instance.</li>
     * <li>When you create an Elastic Network Interface (ENI), you can allocate up to 49 secondary private IP addresses by invoking this operation.</li>
     * <li>When you create an Elastic Network Interface (ENI), if you need to configure Settings for IPv6 addresses, you must ensure that IPv6 is enabled for the specified vSwitch. For more information, see <a href="https://help.aliyun.com/document_detail/98896.html">What is an IPv6 gateway</a>.</li>
     * <li>The number of Elastic Network Interfaces (ENIs) that an Alibaba Cloud account can create in a region is limited. You can view the resource quota in the ECS console. For more information, see <a href="https://help.aliyun.com/document_detail/184115.html">View and increase resource quotas</a>.</li>
     * </ul>
     * <h3>Request examples</h3>
     * <details>
     * <summary>Create an Elastic Network Interface (ENI)</summary>
     * ```
     * RegionId:  cn-hangzhou,   // Settings: China (Hangzhou) region.
     * SecurityGroupId:  sg-bp10jztp6b0sdsyl****,   // Settings: security group ID.
     * VSwitchId:  vsw-bp19wo63nleroq22g****,   // Settings: vSwitch ID.
     * ```
     * </details>
     * <details>
     * <summary>Create an Elastic Network Interface (ENI) and specify the primary private IP address</summary>
     * ```
     * RegionId:  cn-hangzhou,   // The China (Hangzhou) region.
     * SecurityGroupId:  sg-bp10jztp6b0sdsyl****,   // The security group ID.
     * VSwitchId:  vsw-bp19wo63nleroq22g****,   // The vSwitch ID.
     * PrimaryIpAddress:  192.168.0.*,   // The primary private IP address.
     * ```
     * </details>
     * 
     * @param request the request parameters of CreateNetworkInterface  CreateNetworkInterfaceRequest
     * @return CreateNetworkInterfaceResponse
     */
    CompletableFuture<CreateNetworkInterfaceResponse> createNetworkInterface(CreateNetworkInterfaceRequest request);

    /**
     * @param request the request parameters of CreateNetworkInterfacePermission  CreateNetworkInterfacePermissionRequest
     * @return CreateNetworkInterfacePermissionResponse
     */
    CompletableFuture<CreateNetworkInterfacePermissionResponse> createNetworkInterfacePermission(CreateNetworkInterfacePermissionRequest request);

    /**
     * @deprecated OpenAPI CreatePhysicalConnection is deprecated, please use Vpc::2016-04-28::CreatePhysicalConnection instead.  * @param request  the request parameters of CreatePhysicalConnection  CreatePhysicalConnectionRequest
     * @return CreatePhysicalConnectionResponse
     */
    @Deprecated
    CompletableFuture<CreatePhysicalConnectionResponse> createPhysicalConnection(CreatePhysicalConnectionRequest request);

    /**
     * @param request the request parameters of CreatePlanMaintenanceWindow  CreatePlanMaintenanceWindowRequest
     * @return CreatePlanMaintenanceWindowResponse
     */
    CompletableFuture<CreatePlanMaintenanceWindowResponse> createPlanMaintenanceWindow(CreatePlanMaintenanceWindowRequest request);

    /**
     * @param request the request parameters of CreatePortRangeList  CreatePortRangeListRequest
     * @return CreatePortRangeListResponse
     */
    CompletableFuture<CreatePortRangeListResponse> createPortRangeList(CreatePortRangeListRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>A prefix list is a collection of network prefixes, which are Classless Inter-Domain Routing. You can reference a prefix list when you configure network rules for other resources. For more information about prefix lists, see <a href="https://help.aliyun.com/document_detail/206223.html">Prefix list overview</a>.</li>
     * <li>When you create a prefix list:<ul>
     * <li>You must specify an address family (IPv4 or IPv6) for the prefix list. Entries in the same prefix list must belong to the same address family, and the address family cannot be modified after the prefix list is created.</li>
     * <li>You must configure the Settings for the maximum number of entries for the prefix list, which cannot be modified after the prefix list is created.</li>
     * <li>You can specify entries for the prefix list. Each entry consists of a Classless Inter-Domain Routing and a description. The number of entries cannot exceed the maximum number of entries that you configured in the Settings.</li>
     * </ul>
     * </li>
     * <li>For information about the limits on prefix lists and other resources, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</li>
     * <li>RAM users help you avoid sharing the credentials of your Alibaba Cloud account with other users. You can allocate least privilege to users on demand to reduce information security risks for your enterprise. For more information about how to grant prefix list-related permissions to Resource Access Management (RAM) users, see <a href="https://help.aliyun.com/document_detail/206175.html">Grant prefix list-related permissions to RAM users</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePrefixList  CreatePrefixListRequest
     * @return CreatePrefixListResponse
     */
    CompletableFuture<CreatePrefixListResponse> createPrefixList(CreatePrefixListRequest request);

    /**
     * @deprecated OpenAPI CreateRouteEntry is deprecated, please use Vpc::2016-04-28::CreateRouteEntry instead.  * @param request  the request parameters of CreateRouteEntry  CreateRouteEntryRequest
     * @return CreateRouteEntryResponse
     */
    @Deprecated
    CompletableFuture<CreateRouteEntryResponse> createRouteEntry(CreateRouteEntryRequest request);

    /**
     * @deprecated OpenAPI CreateRouterInterface is deprecated, please use Vpc::2016-04-28::CreateRouterInterface instead.  * @param request  the request parameters of CreateRouterInterface  CreateRouterInterfaceRequest
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
     * <ul>
     * <li>By default, the internal connectivity policy of a basic security group created by calling this operation is <strong>intra-group connectivity</strong>. You can call <a href="https://help.aliyun.com/document_detail/2679846.html">ModifySecurityGroupPolicy</a> to modify the policy.</li>
     * <li>By default, the internal connectivity policy of an advanced security group created by calling this operation is <strong>internal isolation</strong>, and the policy cannot be modified.</li>
     * <li>The number of security groups in a single region is limited. You can create a minimum of 100 security groups. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
     * <li>To create a security group of the Virtual Private Cloud (VPC) type, you must specify the VpcId parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecurityGroup  CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
     */
    CompletableFuture<CreateSecurityGroupResponse> createSecurityGroup(CreateSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>After you schedule a simulated event, you can view the scheduled simulated system events in the ECS console, by invoking <a href="https://help.aliyun.com/document_detail/63962.html">ECS API</a> operations, or by using CloudMonitor monitoring.
     * The following table describes the lifecycle of a simulated system event:</p>
     * <ul>
     * <li>Scheduled: After you schedule a simulated system event, the event automatic switchover to the Scheduled state.</li>
     * <li>Executed: Without manual intervention, the simulated system event automatically enters the Executed state at the specified time (NotBefore).</li>
     * <li>Canceled: After you invoke <a href="https://help.aliyun.com/document_detail/88808.html">CancelSimulatedSystemEvents</a> to cancel the simulated system event, the event enters the Canceled state.         </li>
     * <li>Avoided: For a simulated system event of the SystemMaintenance.Reboot type, you can <a href="https://help.aliyun.com/document_detail/25502.html">restart the instance</a> before the specified time to change the event to the Avoided state.
     * Take note of the following items when you set TriggerRealOps to true:</li>
     * <li><blockquote>
     * <p>Warning: The system will actually stop or release the instance, which may cause data loss. Test with caution or use instances that do not run workloads.</p>
     * </blockquote>
     * </li>
     * <li>EventType supports only SystemMaintenance.Reboot, SystemMaintenance.Redeploy, SystemMaintenance.Stop, InstanceFailure.Reboot, SystemFailure.Reboot, and Instance:PreemptibleInstanceInterruption.</li>
     * <li>When EventType is set to SystemMaintenance.Redeploy, the NotBefore parameter is invalid. The execution time of the event is automatically generated by the system.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSimulatedSystemEvents  CreateSimulatedSystemEventsRequest
     * @return CreateSimulatedSystemEventsResponse
     */
    CompletableFuture<CreateSimulatedSystemEventsResponse> createSimulatedSystemEvents(CreateSimulatedSystemEventsRequest request);

    /**
     * <b>description</b> :
     * <p>Local snapshots have been replaced by the snapshot instant access feature. The metric description is as follows:</p>
     * <ul>
     * <li>If you used local snapshots before December 14, 2020, Normal use of the <code>Category</code> parameter is allowed.</li>
     * <li>If you did not use local snapshots before December 14, 2020, no additional configuration is required. Snapshots created for enterprise SSD series disks (enterprise SSD, ESSD AutoPL, ESSD Entry, and regional enterprise SSD) are active by default after creation, and both the manual snapshot and automatic snapshot features are supported. The <code>InstantAccess</code>, <code>InstantAccessRetentionDays</code>, and <code>DisableInstantAccess</code> parameters related to the instant access feature no longer take effect in API operations. The <code>DescribeSnapshots</code> and <code>DescribeSnapshotGroups</code> API operations add the <code>Available</code> response parameter to describe the active status of snapshots.
     * Before you begin:</li>
     * <li>The snapshot feature is activated. For more information, see <a href="https://help.aliyun.com/document_detail/108381.html">Activate the snapshot feature</a>.</li>
     * <li>The cloud disk must be in the <strong>In Use</strong> or <strong>Available</strong> state. Take note of the following items based on the disk state:<ul>
     * <li>If the cloud disk is in the <strong>In Use</strong> state, the instance must be in the <strong>Running</strong> or <strong>Stopped</strong> state.</li>
     * <li>If the cloud disk is in the <strong>Available</strong> state, make sure that the cloud disk was previously attached to an ECS instance. You cannot create snapshots for cloud disks that have never been attached to an ECS instance.</li>
     * <li>When a cloud disk is used to create a dynamic extended volume or a RAID array, we recommend that you use a snapshot-consistent group and enable application-consistent snapshots to back up data. A snapshot-consistent group ensures the chronological consistency of data written to cloud disks and guarantees crash consistency in scenarios where a business system spans multiple cloud disks. For more information, see <a href="https://help.aliyun.com/document_detail/199625.html">Create a snapshot-consistent group</a> and <a href="https://help.aliyun.com/document_detail/208589.html">Create an application-consistent snapshot</a>.
     * When you create a snapshot, take note of the following items:</li>
     * </ul>
     * </li>
     * <li>Avoid creating snapshots during peak business hours. When a snapshot is being created, the I/O performance of the disk decreases by less than 10%, and the read and write performance may experience brief instantaneous slowdowns.</li>
     * <li>If the snapshot creation is not complete, the snapshot cannot be used to create a custom image (<a href="https://help.aliyun.com/document_detail/25535.html">CreateImage</a>).</li>
     * <li>During snapshot creation, no backup of incremental data generated by operations on the disk is saved to the snapshot.</li>
     * <li>If the disk is attached to an ECS instance, do not change the instance status during snapshot creation, such as stopping or restarting the ECS instance. Otherwise, it results in a failed snapshot creation.</li>
     * <li>You cannot perform scale-out on a disk while a snapshot is being created for it. Wait until the snapshot is created before you execute scale-out operations.</li>
     * <li>You can create snapshots for cloud disks in the <strong>Expired</strong> (<code>Expired</code>) state. If a cloud disk reaches its expiration and release time while a snapshot is being created, the snapshot in the <strong>Creating</strong> (<code>Creating</code>) state is deleted when the cloud disk is released.</li>
     * <li>After a snapshot is created, the system bills you based on the snapshot size in each region. For more information, see <a href="https://help.aliyun.com/document_detail/56159.html">Snapshot billing</a>.</li>
     * <li>You cannot create snapshots for a specified cloud disk in the following scenarios:<ul>
     * <li>The number of manual snapshots retained for the cloud disk reaches the upper limit. For more information, see <a href="~~25412#SnapshotQuota1~~">Snapshot limits</a>.</li>
     * <li>Snapshot creation has concurrency limits. Exceeding the limits causes the creation to fail. For more information, see <a href="~~25412#SnapshotQuota1~~">Snapshot limits</a>.</li>
     * <li>If the response to a query for ECS instance information contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code>, all operations are prohibited.</li>
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
     * <p>You can set <code>InstanceId</code> to create a snapshot-consistent group for specified disks within an instance. Alternatively, you can use only <code>DiskId.N</code> to create a snapshot-consistent group for multiple disks attached to multiple ECS instances in the same zone.</p>
     * <blockquote>
     * <p><code>DiskId.N</code> and <code>ExcludeDiskId.N</code> cannot be set at the same time. In addition, if <code>InstanceId</code> is set, <code>DiskId.N</code> can only be set to the IDs of disks attached to the specified instance. Setting multiple cross-instance disk IDs is no longer supported.
     * When you create a snapshot-consistent group, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>The disks for which you want to create snapshots must be in the <strong>in use</strong> (<code>In_use</code>) or <strong>available</strong> (<code>Available</code>) state.<ul>
     * <li>If a disk is in the <strong>in use</strong> (<code>In_use</code>) state, the ECS instance must be in the <strong>running</strong> (<code>Running</code>) or <strong>stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>If a disk is in the <strong>available</strong> (<code>Available</code>) state, make sure that the disk has been attached to an ECS instance before. Snapshots cannot be created for disks that have never been attached to an ECS instance.</li>
     * </ul>
     * </li>
     * <li>Snapshot-consistent groups support only ESSD series disks (ESSD, ESSD AutoPL, and ESSD Entry).</li>
     * <li>A single snapshot-consistent group can contain up to 128 disks, including system disks and data disks, and the total capacity cannot exceed 256 TiB.</li>
     * <li>Snapshots that you create are retained indefinitely. Delete snapshots that you no longer need on a regular basis to avoid continuous billing for snapshot size.</li>
     * <li>Disks for which the multi-attach feature is enabled do not support snapshot-consistent groups. If an instance has a disk with the multi-attach feature enabled, you must set the <code>ExcludeDiskId.N</code> parameter to exclude the disk.
     * For more information about the features and billing of snapshot-consistent groups, see <a href="https://help.aliyun.com/document_detail/199625.html">Snapshot-consistent groups</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSnapshotGroup  CreateSnapshotGroupRequest
     * @return CreateSnapshotGroupResponse
     */
    CompletableFuture<CreateSnapshotGroupResponse> createSnapshotGroup(CreateSnapshotGroupRequest request);

    /**
     * @param request the request parameters of CreateStorageSet  CreateStorageSetRequest
     * @return CreateStorageSetResponse
     */
    CompletableFuture<CreateStorageSetResponse> createStorageSet(CreateStorageSetRequest request);

    /**
     * @deprecated OpenAPI CreateVSwitch is deprecated, please use Vpc::2016-04-28::CreateVSwitch instead.  * @param request  the request parameters of CreateVSwitch  CreateVSwitchRequest
     * @return CreateVSwitchResponse
     */
    @Deprecated
    CompletableFuture<CreateVSwitchResponse> createVSwitch(CreateVSwitchRequest request);

    /**
     * @deprecated OpenAPI CreateVirtualBorderRouter is deprecated, please use Vpc::2016-04-28::CreateVirtualBorderRouter instead.  * @param request  the request parameters of CreateVirtualBorderRouter  CreateVirtualBorderRouterRequest
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
     * <b>description</b> :
     * <ul>
     * <li>When you create a VSC, the instance type must support VSC and VSC must be enabled for the instance.</li>
     * <li>You can create only one primary VSC on a single instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVsc  CreateVscRequest
     * @return CreateVscResponse
     */
    CompletableFuture<CreateVscResponse> createVsc(CreateVscRequest request);

    /**
     * @deprecated OpenAPI DeactivateRouterInterface is deprecated, please use Vpc::2016-04-28::DeactivateRouterInterface instead.  * @param request  the request parameters of DeactivateRouterInterface  DeactivateRouterInterfaceRequest
     * @return DeactivateRouterInterfaceResponse
     */
    @Deprecated
    CompletableFuture<DeactivateRouterInterfaceResponse> deactivateRouterInterface(DeactivateRouterInterfaceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>The activation code must be unused, meaning that the number of managed instances registered with the activation code is 0.</p>
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
     * @param request the request parameters of DeleteBandwidthPackage  DeleteBandwidthPackageRequest
     * @return DeleteBandwidthPackageResponse
     */
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
     * <b>description</b> :
     * <p>Before you delete a deployment set, make sure that no instances exist in the deployment set. If instances exist, remove or release them before you delete the deployment set. For more information, see <a href="https://help.aliyun.com/document_detail/108407.html">Change the deployment set of an instance</a> and <a href="https://help.aliyun.com/document_detail/25442.html">Release an ECS instance</a>.</p>
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
     * <p>Reports that are currently being diagnosed cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteDiagnosticReports  DeleteDiagnosticReportsRequest
     * @return DeleteDiagnosticReportsResponse
     */
    CompletableFuture<DeleteDiagnosticReportsResponse> deleteDiagnosticReports(DeleteDiagnosticReportsRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke this operation, note the following items:</p>
     * <ul>
     * <li>Manual snapshots of the disk are retained.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/25517.html">ModifyDiskAttribute</a> operation to configure the Settings for whether to retain or release automatic snapshots along with the disk. Delete unnecessary snapshots promptly to maintain a sufficient snapshot quota to complete the automatic snapshot policy for the epoch.</li>
     * <li>The disk must be in the Available state (not attached to any instance) when it is released.</li>
     * <li>If the specified disk does not exist, the request is ignored.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDisk  DeleteDiskRequest
     * @return DeleteDiskResponse
     */
    CompletableFuture<DeleteDiskResponse> deleteDisk(DeleteDiskRequest request);

    /**
     * @deprecated OpenAPI DeleteForwardEntry is deprecated, please use Vpc::2016-04-28::DeleteForwardEntry instead.  * @param request  the request parameters of DeleteForwardEntry  DeleteForwardEntryRequest
     * @return DeleteForwardEntryResponse
     */
    @Deprecated
    CompletableFuture<DeleteForwardEntryResponse> deleteForwardEntry(DeleteForwardEntryRequest request);

    /**
     * @deprecated OpenAPI DeleteHaVip is deprecated, please use Vpc::2016-04-28::DeleteHaVip instead.  * @param request  the request parameters of DeleteHaVip  DeleteHaVipRequest
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
     * <p>For information about scenarios where custom images cannot be deleted and precautions after deletion, refer to <a href="https://help.aliyun.com/document_detail/25466.html">Delete a custom image</a>.</p>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
    CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only custom image components that you have created can be deleted.</li>
     * <li>Before deleting a component, make sure that the component is not used in any template. Otherwise, the deletion fails.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteImageComponent  DeleteImageComponentRequest
     * @return DeleteImageComponentResponse
     */
    CompletableFuture<DeleteImageComponentResponse> deleteImageComponent(DeleteImageComponentRequest request);

    /**
     * <b>description</b> :
     * <p>If a build task is running, you cannot directly delete the template. Wait until the build task reaches a desired state: SUCCESS, FAILED, TEST_FAILED, PARTITION_SUCCESS, or CANCELLED. You can call <a href="~~DescribeImagePipelineExecutions~~">DescribeImagePipelineExecutions</a> to query the details of build tasks.</p>
     * 
     * @param request the request parameters of DeleteImagePipeline  DeleteImagePipelineRequest
     * @return DeleteImagePipelineResponse
     */
    CompletableFuture<DeleteImagePipelineResponse> deleteImagePipeline(DeleteImagePipelineRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: 
     * After an instance is released, all physical resources used by the instance are recycled. All related data is permanently lost and cannot be recovered.</p>
     * </blockquote>
     * <ul>
     * <li>Manual snapshots of disks are retained and continue to incur charges. You can delete them by calling <a href="https://help.aliyun.com/document_detail/2679824.html">DeleteSnapshot</a>.</li>
     * <li>Whether disks attached to the instance and automatic snapshots are released depends on the parameter settings specified during creation. Before releasing an instance, you can call <a href="https://help.aliyun.com/document_detail/2679767.html">DescribeDisks</a> and <a href="https://help.aliyun.com/document_detail/2679770.html">ModifyDiskAttribute</a> to query and modify the related parameter settings:<ul>
     * <li><code>DeleteWithInstance=false</code>: The disk is converted to a pay-as-you-go disk and retained. Otherwise, the disk is released along with the instance.</li>
     * <li><code>DeleteAutoSnapshot=false</code>: Automatic snapshots are retained. Otherwise, they are released along with the instance.</li>
     * </ul>
     * </li>
     * <li>Elastic IP addresses (EIPs) are not released along with the instance. You can call <a href="https://help.aliyun.com/document_detail/448702.html">ReleaseEipAddress</a> to release them.<blockquote>
     * <p>Notice: For security-locked instances, even if the <code>DeleteWithInstance</code> parameter of a disk is set to <code>false</code>, this attribute is ignored and the disk is released along with the instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: 
     * After an instance is released, all physical resources used by the instance are recycled. All related data is permanently lost and cannot be recovered.</p>
     * </blockquote>
     * <ul>
     * <li>Manual snapshots of disks are retained and continue to incur fees. You can call <a href="https://help.aliyun.com/document_detail/2679824.html">DeleteSnapshot</a> to delete them.</li>
     * <li>Whether disks and automatic snapshots attached to the instance are released depends on the parameter settings specified when they were created. Before releasing an instance, you can call <a href="https://help.aliyun.com/document_detail/2679767.html">DescribeDisks</a> and <a href="https://help.aliyun.com/document_detail/2679770.html">ModifyDiskAttribute</a> to query and modify the related parameter settings:<ul>
     * <li>If <code>DeleteWithInstance=false</code>, the disk is converted to a pay-as-you-go disk and retained. Otherwise, the disk is released along with the instance.</li>
     * <li>If <code>DeleteAutoSnapshot=false</code>, automatic snapshots are retained. Otherwise, they are released along with the instance.</li>
     * </ul>
     * </li>
     * <li>Elastic IP addresses (EIPs) are not released along with the instance. You can call <a href="https://help.aliyun.com/document_detail/448702.html">ReleaseEipAddress</a> to release them.<blockquote>
     * <p>Notice: For security-locked instances, even if the <code>DeleteWithInstance</code> parameter of a disk is set to <code>false</code>, this attribute is ignored and the disk is released along with the instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstances  DeleteInstancesRequest
     * @return DeleteInstancesResponse
     */
    CompletableFuture<DeleteInstancesResponse> deleteInstances(DeleteInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>After you delete an SSH key pair, take note of the following items:</p>
     * <ul>
     * <li>The SSH key pair cannot be queried by calling <a href="https://help.aliyun.com/document_detail/51773.html">DescribeKeyPairs</a>.  </li>
     * <li>If an ECS instance is bound to the SSH key pair, the SSH key pair cannot be deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteKeyPairs  DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     */
    CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>After you delete a launch template, ECS instances that were created by using the launch template are not affected.</li>
     * <li>After you delete a launch template, all versions of the template are also deleted and cannot be recovered. If you want to delete only a specific version of a launch template, see <a href="https://help.aliyun.com/document_detail/2679735.html">DeleteLaunchTemplateVersion</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteLaunchTemplate  DeleteLaunchTemplateRequest
     * @return DeleteLaunchTemplateResponse
     */
    CompletableFuture<DeleteLaunchTemplateResponse> deleteLaunchTemplate(DeleteLaunchTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The default version cannot be deleted. You must delete the entire launch template to delete the default version.</li>
     * <li>If the version you want to delete is the default version, call <a href="https://help.aliyun.com/document_detail/2679734.html">ModifyLaunchTemplateDefaultVersion</a> or switch the default version in the <strong>Launch Templates</strong> console before you perform the deletion.</li>
     * <li>Deleting a version does not affect instances that were already created by using that version.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteLaunchTemplateVersion  DeleteLaunchTemplateVersionRequest
     * @return DeleteLaunchTemplateVersionResponse
     */
    CompletableFuture<DeleteLaunchTemplateVersionResponse> deleteLaunchTemplateVersion(DeleteLaunchTemplateVersionRequest request);

    /**
     * @deprecated OpenAPI DeleteNatGateway is deprecated, please use Vpc::2016-04-28::DeleteNatGateway instead.  * @param request  the request parameters of DeleteNatGateway  DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
     */
    @Deprecated
    CompletableFuture<DeleteNatGatewayResponse> deleteNatGateway(DeleteNatGatewayRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The ENI must be in the Available state.</li>
     * <li>If the ENI is attached to an ECS instance, you must first detach it from the instance (<a href="https://help.aliyun.com/document_detail/58514.html">DetachNetworkInterface</a>) before you can delete the ENI.</li>
     * <li>After the ENI is deleted:<ul>
     * <li>All private addresses (including the primary private IP address and secondary private IP addresses) of the ENI are automatically released.</li>
     * <li>The deleted ENI is removed from all associated security groups.</li>
     * </ul>
     * </li>
     * <li>This is an asynchronous operation. After a successful call, you can check the ENI status or listen for network interface controller (NIC) operation events to determine the result. The ENI state machine is shown in the following figure:
     * <img src="https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/zh-CN/20221208/xual/DeleteNetworkInterface.jpg" alt=""><ul>
     * <li>The Deleting state indicates that the delete request was sent successfully and the ENI is being deleted.</li>
     * <li>If the ENI cannot be found, the ENI is deleted.</li>
     * <li>If the ENI remains in the Deleting state for an extended period of time, the deletion failed. In this case, you can send a new delete request for the ENI.
     * <strong>For details about sample code, see</strong> <a href="https://help.aliyun.com/document_detail/471553.html">Delete an ENI</a>.</li>
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
     * @deprecated OpenAPI DeletePhysicalConnection is deprecated, please use Vpc::2016-04-28::DeletePhysicalConnection instead.  * @param request  the request parameters of DeletePhysicalConnection  DeletePhysicalConnectionRequest
     * @return DeletePhysicalConnectionResponse
     */
    @Deprecated
    CompletableFuture<DeletePhysicalConnectionResponse> deletePhysicalConnection(DeletePhysicalConnectionRequest request);

    /**
     * @param request the request parameters of DeletePlanMaintenanceWindow  DeletePlanMaintenanceWindowRequest
     * @return DeletePlanMaintenanceWindowResponse
     */
    CompletableFuture<DeletePlanMaintenanceWindowResponse> deletePlanMaintenanceWindow(DeletePlanMaintenanceWindowRequest request);

    /**
     * @param request the request parameters of DeletePortRangeList  DeletePortRangeListRequest
     * @return DeletePortRangeListResponse
     */
    CompletableFuture<DeletePortRangeListResponse> deletePortRangeList(DeletePortRangeListRequest request);

    /**
     * <b>description</b> :
     * <p>If a prefix list is associated with other resources, you cannot directly delete it. Dissociate the prefix list from the resources first, and then delete it. You can call <a href="https://help.aliyun.com/document_detail/204724.html">DescribePrefixListAssociations</a> to query the resources that are associated with a specified prefix list.</p>
     * 
     * @param request the request parameters of DeletePrefixList  DeletePrefixListRequest
     * @return DeletePrefixListResponse
     */
    CompletableFuture<DeletePrefixListResponse> deletePrefixList(DeletePrefixListRequest request);

    /**
     * @deprecated OpenAPI DeleteRouteEntry is deprecated, please use Vpc::2016-04-28::DeleteRouteEntry instead.  * @param request  the request parameters of DeleteRouteEntry  DeleteRouteEntryRequest
     * @return DeleteRouteEntryResponse
     */
    @Deprecated
    CompletableFuture<DeleteRouteEntryResponse> deleteRouteEntry(DeleteRouteEntryRequest request);

    /**
     * @deprecated OpenAPI DeleteRouterInterface is deprecated, please use Vpc::2016-04-28::DeleteRouterInterface instead.  * @param request  the request parameters of DeleteRouterInterface  DeleteRouterInterfaceRequest
     * @return DeleteRouterInterfaceResponse
     */
    @Deprecated
    CompletableFuture<DeleteRouterInterfaceResponse> deleteRouterInterface(DeleteRouterInterfaceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Make sure that no ECS instances exist in the security group. You can call <a href="https://help.aliyun.com/document_detail/2679689.html">DescribeInstances</a> to check.</li>
     * <li>Make sure that no Elastic Network Interfaces (ENIs) exist in the security group. You can call <a href="https://help.aliyun.com/document_detail/2679884.html">DescribeNetworkInterfaces</a> to check.</li>
     * <li>Make sure that no other security groups have authorization dependencies on this security group. You can call <a href="https://help.aliyun.com/document_detail/57320.html">DescribeSecurityGroupReferences</a> to check.</li>
     * <li>If the error code <code>InvalidOperation.DeletionProtection</code> is returned when you call this operation, the deletion protection feature is enabled for the security group. When you create an ACK cluster, deletion protection is automatically enabled for the associated security group to prevent accidental deletion. The deletion protection feature cannot be manually disabled. It is automatically disabled only after the associated ACK cluster is deleted. For more information, see <a href="https://help.aliyun.com/document_detail/353191.html">Disable deletion protection for a security group</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSecurityGroup  DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     */
    CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>If the specified snapshot ID does not exist, the request is ignored. </li>
     * <li>If the snapshot has been used to create a custom image, you cannot execute the delete operation. You must delete the created custom image (<a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a>) before you can delete the snapshot.</li>
     * <li>If the snapshot has been used to create a cloud disk and the Settings of the <code>Force</code> parameter are not specified or <code>Force=false</code>, you cannot directly delete the snapshot. If you are sure that you want to delete the snapshot, change the Settings to <code>Force=true</code> to force delete the snapshot. After the snapshot is force deleted, the corresponding cloud disk cannot execute initialization.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request);

    /**
     * <b>description</b> :
     * <p>If disk snapshots in a snapshot-consistent group have been used to create custom images, the related disk snapshots are not deleted when the snapshot-consistent group is deleted. To delete the related disk snapshots, first delete the custom images (<a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a>), and then delete the related disk snapshots (<a href="https://help.aliyun.com/document_detail/25525.html">DeleteSnapshot</a>).</p>
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
     * @deprecated OpenAPI DeleteVirtualBorderRouter is deprecated, please use Vpc::2016-04-28::DeleteVirtualBorderRouter instead.  * @param request  the request parameters of DeleteVirtualBorderRouter  DeleteVirtualBorderRouterRequest
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Before you delete a VSC, you must unbind file systems such as CPFS from the VSC.</li>
     * <li>When you release a VSC, the instance operating system must respond. If the operating system does not respond, the VSC deletion fails and the VSC enters the DetachFailed state. Check whether the operating system is running normally, or stop the instance and try again.</li>
     * <li>When you release an instance, the VSCs on the instance are also released.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVsc  DeleteVscRequest
     * @return DeleteVscResponse
     */
    CompletableFuture<DeleteVscResponse> deleteVsc(DeleteVscRequest request);

    /**
     * @param request the request parameters of DeregisterManagedInstance  DeregisterManagedInstanceRequest
     * @return DeregisterManagedInstanceResponse
     */
    CompletableFuture<DeregisterManagedInstanceResponse> deregisterManagedInstance(DeregisterManagedInstanceRequest request);

    /**
     * @deprecated OpenAPI DescribeAccessPoints is deprecated, please use Vpc::2016-04-28::DescribeAccessPoints instead.  * @param request  the request parameters of DescribeAccessPoints  DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
     */
    @Deprecated
    CompletableFuture<DescribeAccessPointsResponse> describeAccessPoints(DescribeAccessPointsRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;After you <a href="https://account.aliyun.com/register/register.htm">register</a> an Alibaba Cloud account, you can create a specific number of ECS resources in different Alibaba Cloud regions. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.
     * &lt;props=&quot;intl&quot;&gt;After you <a href="https://account.alibabacloud.com/register/intl_register.htm">register</a> an Alibaba Cloud account, you can create a specific number of ECS resources in different Alibaba Cloud regions. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.
     * You can also request a quota increase in the <a href="https://quotas.console.aliyun.com/products">Quota Center</a> based on your needs.</p>
     * 
     * @param request the request parameters of DescribeAccountAttributes  DescribeAccountAttributesRequest
     * @return DescribeAccountAttributesResponse
     */
    CompletableFuture<DescribeAccountAttributesResponse> describeAccountAttributes(DescribeAccountAttributesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can view the returned data by using one of the following methods:</p>
     * <ul>
     * <li>Method 1: When paged query the first page, you only need to set MaxResults to limit the number of returned entries. The NextToken value in the response is used as the token to query the next page. When paged query the next page, set the NextToken parameter to the NextToken value obtained from the previous response, and set MaxResults to limit the number of returned entries.</li>
     * <li>Method 2: Set PageSize to specify the number of entries to return on each page, and set PageNumber to specify the page number. You can use only one of the preceding methods. If you set the MaxResults or NextToken parameter, the PageSize and PageNumber request parameters become invalid, and the TotalCount value in the response is invalid.</li>
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
     * @param request the request parameters of DescribeAutoSnapshotPolicyAssociations  DescribeAutoSnapshotPolicyAssociationsRequest
     * @return DescribeAutoSnapshotPolicyAssociationsResponse
     */
    CompletableFuture<DescribeAutoSnapshotPolicyAssociationsResponse> describeAutoSnapshotPolicyAssociations(DescribeAutoSnapshotPolicyAssociationsRequest request);

    /**
     * @param request the request parameters of DescribeAutoSnapshotPolicyEx  DescribeAutoSnapshotPolicyExRequest
     * @return DescribeAutoSnapshotPolicyExResponse
     */
    CompletableFuture<DescribeAutoSnapshotPolicyExResponse> describeAutoSnapshotPolicyEx(DescribeAutoSnapshotPolicyExRequest request);

    /**
     * <b>description</b> :
     * <p>The DestinationResource parameter has different logic and requirements for its values. In the following ordered list, lower-order values require more parameters to be set, and you cannot use a lower-order value to filter higher-order resource categories.</p>
     * <ul>
     * <li>Value order: <code>Zone &gt; IoOptimized &gt; InstanceType = Network = ddh &gt; SystemDisk &gt; DataDisk</code></li>
     * <li>Value examples:<ul>
     * <li>If DestinationResource is set to <code>DataDisk</code>:<ul>
     * <li>If <code>ResourceType</code> is set to <code>disk</code>, the query retrieves data disk types that are not associated with ECS instance types, and the InstanceType parameter is not required.</li>
     * <li>If <code>ResourceType</code> is set to <code>instance</code>, the query retrieves data disk types that can be attached to ECS instances. Because instance types impose restrictions on data disks, you must specify both <code>InstanceType</code> and <code>DataDiskCategory</code>.</li>
     * </ul>
     * </li>
     * <li>If DestinationResource is set to <code>SystemDisk</code> and <code>ResourceType</code> is set to <code>instance</code>, you must specify the InstanceType parameter because ECS instance types impose restrictions on system disks.</li>
     * <li>If DestinationResource is set to <code>InstanceType</code>, specify the IoOptimized and InstanceType parameters.</li>
     * <li>Query the inventory of ecs.g5.large across all zones in a specified region: <code>RegionId=ap-southeast-1 &amp;DestinationResource=InstanceType &amp;IoOptimized=optimized &amp;InstanceType=ecs.g5.large</code>.</li>
     * <li>Query the list of zones that have ecs.g5.large in stock in a specified region: <code>RegionId=ap-southeast-1 &amp;DestinationResource=Zone &amp;IoOptimized=optimized &amp;InstanceType=ecs.g5.large</code>.<details>
     * <summary>Query the list of active zones that supply the ecs.g5.large instance type in the Singapore region.</summary></li>
     * </ul>
     * </li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;: &quot;ap-southeast-1&quot;,
     * &quot;DestinationResource&quot;: &quot;Zone&quot;，
     * &quot;InstanceType&quot;: &quot;ecs.g5.large&quot;
     * </code></pre>
     * </details>
     * <details>
     * <summary>Query the inventory of ecs.g5.large across all zones in the Singapore region.</summary>
     * ```
     * "RegionId": "ap-southeast-1",
     * "DestinationResource": "InstanceType"，
     * "InstanceType": "ecs.g5.large"
     * ```
     * </details>
     * <details>
     * <summary>[Purchase data disk only] Query the inventory of cloud_efficiency data disks in Zone B of the Singapore region.</summary>
     * ```
     * "RegionId": "ap-southeast-1",
     * "ZoneId": "ap-southeast-1b",
     * "ResourceType": "disk",
     * "DestinationResource": "DataDisk"
     * ```
     * </details>
     * <details>
     * <summary>[Purchase ECS instance and system disk] Query the inventory of ecs.g7.large instances with cloud_essd system disks in Zone B of the Singapore region.</summary>
     * ```
     * "RegionId": "ap-southeast-1",
     * "ZoneId": "ap-southeast-1b",
     * "ResourceType": "instance",
     * "InstanceType": "ecs.g7.large",
     * "DestinationResource": "SystemDisk",
     * "SystemDiskCategory": "cloud_essd"
     * ```
     * </details>
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
     * @param request the request parameters of DescribeBandwidthPackages  DescribeBandwidthPackagesRequest
     * @return DescribeBandwidthPackagesResponse
     */
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
     * <p>When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>This operation supports only classic network type instances.</li>
     * <li>You can query up to 100 classic network type instances at a time.</li>
     * <li>The <code>VpcId</code> and <code>InstanceId</code> parameters cannot both be empty.</li>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>Call this operation to query the Cloud Assistant status of instances before executing commands or sending files, especially for newly purchased instances. Execute commands or send files only when CloudAssistantStatus is true.</li>
     * <li>When paged query the first page, specify only <code>MaxResults</code> to limit the number of returned entries. The <code>NextToken</code> value in the response is used as the token to query the next page. When paged query the next page, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response and specify <code>MaxResults</code> to limit the number of returned entries.</li>
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
     * <h2>Operation description</h2>
     * <ul>
     * <li>If you specify only the Action and RegionId parameters and do not specify any other request parameters, the system queries all available commands (CommandId) that you manually created by default.</li>
     * <li>When paged query the first page, you only need to specify the MaxResults parameter to limit the number of entries to return. The NextToken value in the response is used as the token to query the next page. When paged query the next page, set the NextToken parameter to the NextToken value obtained from the previous response and specify the MaxResults parameter to limit the number of entries to return.</li>
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
     * <h2>Operation description</h2>
     * <p>Request parameters act as filters and are connected by the logical AND operator. If a parameter is left empty, the filter does not take effect. However, if the DedicatedHostClusterIds parameter is set to an empty JSON array, namely [], the filter is considered valid and an empty result is returned.</p>
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
     * <h2>Operation description</h2>
     * <p>You can query the details of one or more dedicated hosts by using one of the following methods:</p>
     * <ul>
     * <li>Specify <code>DedicatedHostIds</code> to query the details of dedicated hosts.</li>
     * <li>Specify <code>DedicatedHostClusterId</code> to query the details of dedicated hosts in a dedicated host cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDedicatedHosts  DescribeDedicatedHostsRequest
     * @return DescribeDedicatedHostsResponse
     */
    CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>For more information about instance families, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
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
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>You can only query the usage information of disks that are in the <code>In_use</code> state. For more information, see <a href="https://help.aliyun.com/document_detail/25689.html">Basic disk status table</a>.<blockquote>
     * <p>If the returned information is incomplete, it is because the usage information for that time period cannot be obtained, which means the disk was not in the <code>In_use</code> state.</p>
     * </blockquote>
     * </li>
     * <li>A maximum of 400 data entries can be returned at a time. The condition <code>(EndTime - StartTime) / Period</code> must be less than or equal to 400. That is, the value of the <code>TotalCount</code> response parameter cannot exceed 400. Otherwise, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.  </li>
     * <li>You can query monitoring information for up to the last 30 days. That is, the specified <code>StartTime</code> parameter cannot be more than 30 days before the current time.</li>
     * </ul>
     * <h2>Request example</h2>
     * <p>Suppose you want to query the usage information of a disk with the ID <code>d-bp14emm68wx98vjk****</code> in the China (Hangzhou) region from <code>2025-02-17T00:00:00Z</code> to <code>2025-02-18T10:00:00Z</code> at an interval of 600 seconds. The request parameters are configured as follows:</p>
     * <pre><code>RegionId:&quot;cn-hangzhou&quot;, // Set the region to China (Hangzhou).
     * DiskId:&quot;d-bp14emm68wx98vjk****&quot;, // Set the disk ID.
     * StartTime:&quot;2025-02-15T00:00:00Z&quot;, // Set the start time of the query.
     * EndTime:&quot;2025-02-17T00:00:00Z&quot;, // Set the end time of the query.
     * Period:&quot;600&quot;, // Set the data precision.
     * </code></pre>
     * 
     * @param request the request parameters of DescribeDiskMonitorData  DescribeDiskMonitorDataRequest
     * @return DescribeDiskMonitorDataResponse
     */
    CompletableFuture<DescribeDiskMonitorDataResponse> describeDiskMonitorData(DescribeDiskMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Request parameters such as <code>RegionId</code>, <code>ZoneId</code>, <code>DiskIds</code>, and <code>InstanceId</code> act as filters and are connected by the logical AND operator.</li>
     * <li>The <code>DiskIds</code> parameter is an array in JSON format. If the parameter is left empty, the filter does not take effect. However, if <code>DiskIds</code> is an empty array, the filter is considered valid and an empty result is returned.</li>
     * <li>Token-based paging is supported. You can use the <code>NextToken</code> parameter to specify the query token, which is the value of the <code>NextToken</code> parameter returned from the previous call to the DescribeDisks operation. You can also use the <code>MaxResults</code> parameter to specify the maximum number of entries to return on each page.</li>
     * <li>A cloud disk with the multi-attach feature enabled can be attached to multiple instances. You can view all attachment information of the cloud disk in the <code>Attachment</code> list of the response.
     * When you invoke API operations by using Cloud Assistant CLI, you must follow the format requirements for the values of request parameters of different data types. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Format requirements for CLI parameters</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDisks  DescribeDisksRequest
     * @return DescribeDisksResponse
     */
    CompletableFuture<DescribeDisksResponse> describeDisks(DescribeDisksRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The full status information of a block storage device includes the block storage lifecycle status (<code>Status</code>), block storage health status (<code>HealthStatus</code>), and block storage event type (<code>EventType</code>).  </li>
     * <li>Because the publish time, scheduled execution time, and actual execution time of block storage-related events are the same, you can specify a time period (<code>EventTime.Start</code> to <code>EventTime.End</code>) to query all historical events that occurred during that period. You can query historical events from the last seven days at most.</li>
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
     * @deprecated OpenAPI DescribeEipMonitorData is deprecated, please use Vpc::2016-04-28::DescribeEipMonitorData instead.  * @param request  the request parameters of DescribeEipMonitorData  DescribeEipMonitorDataRequest
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
     * <p>After an elasticity assurance expires, the matching data between instances and the private pool associated with the elasticity assurance becomes invalid. If you call this operation to query an expired assurance, an empty result is returned.</p>
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
     * <h2>Operation description</h2>
     * <p>The traffic information that you can query about a secondary ENI includes the number of packets sent and received by the secondary ENI, the inbound and outbound internal network traffic, and the number of packets dropped by the secondary ENI. If some information is missing from the response, the system may have failed to obtain the corresponding information. For example, if the instance is in the Stopped state or the secondary ENI is not attached to an instance and is in the Available state, the corresponding information cannot be obtained. When you call this operation, take note of the following items: </p>
     * <ul>
     * <li>A maximum of 400 data entries are returned at a time. Make sure that the value of <code>(EndTime–StartTime)/Period</code> is less than or equal to 400. In other words, the value of the response parameter <code>TotalCount</code> cannot exceed 400. Otherwise, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.  </li>
     * <li>You can query monitoring information only within the last 30 days. The <code>StartTime</code> parameter that you specify cannot be more than 30 days earlier than the current time.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeEniMonitorData  DescribeEniMonitorDataRequest
     * @return DescribeEniMonitorDataResponse
     */
    CompletableFuture<DescribeEniMonitorDataResponse> describeEniMonitorData(DescribeEniMonitorDataRequest request);

    /**
     * @deprecated OpenAPI DescribeForwardTableEntries is deprecated, please use Vpc::2016-04-28::DescribeForwardTableEntries instead.  * @param request  the request parameters of DescribeForwardTableEntries  DescribeForwardTableEntriesRequest
     * @return DescribeForwardTableEntriesResponse
     */
    @Deprecated
    CompletableFuture<DescribeForwardTableEntriesResponse> describeForwardTableEntries(DescribeForwardTableEntriesRequest request);

    /**
     * @deprecated OpenAPI DescribeHaVips is deprecated, please use Vpc::2016-04-28::DescribeHaVips instead.  * @param request  the request parameters of DescribeHaVips  DescribeHaVipsRequest
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
     * <p>You can set <code>NextToken</code> to the value of <code>NextToken</code> returned in the previous call to DescribeImageComponents, and set <code>MaxResults</code> to specify the maximum number of entries per page for a paged query.</p>
     * 
     * @param request the request parameters of DescribeImageComponents  DescribeImageComponentsRequest
     * @return DescribeImageComponentsResponse
     */
    CompletableFuture<DescribeImageComponentsResponse> describeImageComponents(DescribeImageComponentsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>If no available image exists in the specified image family, the response is empty.</p>
     * 
     * @param request the request parameters of DescribeImageFromFamily  DescribeImageFromFamilyRequest
     * @return DescribeImageFromFamilyResponse
     */
    CompletableFuture<DescribeImageFromFamilyResponse> describeImageFromFamily(DescribeImageFromFamilyRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>The specified image template ID ImagePipelineId cannot be a deleted image template. Deleted image templates also delete the corresponding build tasks.</li>
     * <li>The image template ID ImagePipelineId and the build task ID ExecutionId cannot both be empty.</li>
     * <li>You can set the NextToken query token, whose value is the NextToken parameter value returned by the previous call to <code>DescribeImagePipelineExecutions</code>. Then, set MaxResults to specify the maximum number of entries per page for the query.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeImagePipelineExecutions  DescribeImagePipelineExecutionsRequest
     * @return DescribeImagePipelineExecutionsResponse
     */
    CompletableFuture<DescribeImagePipelineExecutionsResponse> describeImagePipelineExecutions(DescribeImagePipelineExecutionsRequest request);

    /**
     * <b>description</b> :
     * <p>You can use the NextToken parameter to paginate queries. Set this parameter to the NextToken value returned from the previous call to the DescribeImagePipelines operation. You can also use the MaxResults parameter to specify the maximum number of entries to return per page.</p>
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
     * <ul>
     * <li>Image resources that you can query include your custom images, public images provided by Alibaba Cloud, Alibaba Cloud Marketplace images, and shared images that other Alibaba Cloud users have shared with you.</li>
     * <li>Paging is supported. The query results include the total number of available image resources and the image resources on the current page. The default number of entries per page is 10.</li>
     * <li>When you invoke an API operation by using Cloud Assistant CLI, request parameters of different data types must comply with format requirements. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">CLI parameter format</a>.</li>
     * <li>When you query images provided by Alibaba Cloud or shared images (ImageOwnerAlias is set to system or others), the RAM authentication rules can be ignored for this request. For more information, see <a href="https://help.aliyun.com/document_detail/25497.html">Authentication rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeImages  DescribeImagesRequest
     * @return DescribeImagesResponse
     */
    CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>A private pool is generated after an elasticity assurance or capacity reservation is created. The private pool is associated with information about instances that match the private pool. You can configure a private pool when you create an instance. The instance is then matched with an elasticity assurance or capacity reservation.
     * After a private pool expires, the matching association data between the instance and the private pool also becomes invalid. If you call this operation at that point, the private pool information in the response is empty.</p>
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
     * <ul>
     * <li>Only subscription instances are supported. An error is returned if you call this operation for pay-as-you-go instances.</li>
     * <li>Before you configure auto-renewal or manual renewal, you can query the renewal status of instances to check whether auto-renewal is already enabled.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceAutoRenewAttribute  DescribeInstanceAutoRenewAttributeRequest
     * @return DescribeInstanceAutoRenewAttributeResponse
     */
    CompletableFuture<DescribeInstanceAutoRenewAttributeResponse> describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can query completed historical system events that occurred within the last 30 days. There is no time limit for querying unfinished system events.</li>
     * <li>If you do not specify the EventCycleStatus and InstanceEventCycleStatus parameters, the query results include only system events in the Avoided, Executed, Canceled, and Failed states by default.</li>
     * <li>If you specify the InstanceEventCycleStatus parameter, you can also query system events in the Scheduled, Executing, and Inquiring states.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceHistoryEvents  DescribeInstanceHistoryEventsRequest
     * @return DescribeInstanceHistoryEventsResponse
     */
    CompletableFuture<DescribeInstanceHistoryEventsResponse> describeInstanceHistoryEvents(DescribeInstanceHistoryEventsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the configured maintenance policy, which includes two maintenance properties:</p>
     * <ul>
     * <li>Maintenance time window: A time window that you specify during which maintenance is performed.</li>
     * <li>Maintenance action: An instance downtime handling policy that you specify.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceMaintenanceAttributes  DescribeInstanceMaintenanceAttributesRequest
     * @return DescribeInstanceMaintenanceAttributesResponse
     */
    CompletableFuture<DescribeInstanceMaintenanceAttributesResponse> describeInstanceMaintenanceAttributes(DescribeInstanceMaintenanceAttributesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only querying the pricing information for upgrading unexpired subscription ECS instances is supported. Querying the pricing information for downgrading instances is not supported.</li>
     * <li>Querying the pricing information for changing the configurations of pay-as-you-go ECS instances is not supported. Because the price of a pay-as-you-go ECS instance after a configuration change is the same as that of a newly created instance, you can directly call <a href="https://help.aliyun.com/document_detail/107829.html">DescribePrice</a> to query the latest price of the ECS instance.</li>
     * <li>Before upgrading an instance, call <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> to query the instance types available for upgrade in the specified zone.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceModificationPrice  DescribeInstanceModificationPriceRequest
     * @return DescribeInstanceModificationPriceResponse
     */
    CompletableFuture<DescribeInstanceModificationPriceResponse> describeInstanceModificationPrice(DescribeInstanceModificationPriceRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>A maximum of 400 data entries can be returned at a time. Make sure that the value of <code>(EndTime – StartTime)/Period</code> is less than or equal to 400. In other words, the value of the <code>TotalCount</code> response parameter cannot exceed 400. Otherwise, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.  </li>
     * <li>You can query monitoring data from the last 30 days. The <code>StartTime</code> parameter value cannot be more than 30 days before the current date.</li>
     * <li>If some content is missing from the response, the system may not have obtained the corresponding information. For example, the instance was in the Stopped state at that time.</li>
     * <li>This operation cannot retrieve the basic CPU monitoring data of ECS Bare Metal instances. You can install the CloudMonitor agent to obtain CPU monitoring data. For more information, see <a href="https://help.aliyun.com/document_detail/183482.html">Install the CloudMonitor agent</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceMonitorData  DescribeInstanceMonitorDataRequest
     * @return DescribeInstanceMonitorDataResponse
     */
    CompletableFuture<DescribeInstanceMonitorDataResponse> describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you invoke this operation by using Cloud Assistant CLI, request parameters of different data types must follow format requirements. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</p>
     * 
     * @param request the request parameters of DescribeInstanceRamRole  DescribeInstanceRamRoleRequest
     * @return DescribeInstanceRamRoleResponse
     */
    CompletableFuture<DescribeInstanceRamRoleResponse> describeInstanceRamRole(DescribeInstanceRamRoleRequest request);

    /**
     * <b>description</b> :
     * <p>For more information about the lifecycle states of ECS instances, see <a href="https://help.aliyun.com/document_detail/25687.html">Instance states</a>. </p>
     * <h2>Request examples</h2>
     * <ul>
     * <li>Query instances and instance status information by <strong>specified region</strong>. Sample request parameters:</li>
     * </ul>
     * <pre><code>&quot;RegionID&quot;: &quot;ap-southeast-1&quot;
     * </code></pre>
     * <ul>
     * <li>Query instances and instance status information in a <strong>specific zone</strong> within a <strong>specified region</strong>. Sample request parameters:</li>
     * </ul>
     * <pre><code>&quot;RegionID&quot;: &quot;ap-southeast-1&quot;,
     * &quot;ZoneID&quot;: &quot;ap-southeast-1a&quot;
     * </code></pre>
     * <ul>
     * <li>Query the status information of instances by <strong>specified region</strong> and <strong>instance IDs</strong>. Sample request parameters:</li>
     * </ul>
     * <pre><code>&quot;RegionID&quot;: &quot;ap-southeast-1&quot;,
     * &quot;InstancesID&quot;: [&quot;i-bp1f7c1zqp999zvp****&quot;, &quot;i-bp1dqjv36biueg61****&quot;]
     * </code></pre>
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
     * <ul>
     * <li><strong>Paged query</strong>: You can set the MaxResults parameter to limit the number of instance types returned. If only a subset of the queried instance types is returned, the NextToken parameter is also returned. To implement paged queries, call this operation again and set the NextToken parameter to the value returned in the previous call, along with the MaxResults parameter.</li>
     * <li>If you do not specify the NextToken parameter for pagination when calling this API, only the first page of data (up to 100 entries) is returned by default. To retrieve more data, specify the NextToken parameter for pagination or specify filter conditions to limit the scope of the returned data.<blockquote>
     * <p>The maximum value of the MaxResults (maximum number of entries per page) parameter is 100. For users who called this API in 2022, the maximum value of the MaxResults parameter remains 1600. On and after November 15, 2023, the maximum value of the MaxResults parameter will be reduced to 100 for all users, and 1600 will no longer be supported.</p>
     * </blockquote>
     * </li>
     * <li>DescribeInstanceTypes only queries the configuration and performance information of instance types. If you need to query the instance types available for purchase in a specific region, use <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a>.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>If you need to use instance types that are not publicly available for sale or have special specification requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If you need to use instance types that are not publicly available for sale or have special specification requirements, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceTypes  DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
     */
    CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The returned VNC logon URL (VncUrl) cannot be used directly. You can access the instance by using the <strong>management terminal URL</strong>.<blockquote>
     * <p>To construct the management terminal URL, append <code>vncUrl=\\*\\*\\*\\*</code>, <code>instanceId=****</code>, and <code>isWindows=true/false</code> to the end of <code>https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?</code>. Separate the parameters with <code>&amp;</code>. Parameters:</p>
     * <ul>
     * <li><code>vncUrl</code>: the VNC logon URL.</li>
     * <li><code>instanceId</code>: the instance ID.</li>
     * <li><code>isWindows</code>: specifies whether the operating system of the instance is Windows. A value of <code>true</code> indicates Windows. A value of <code>false</code> indicates a non-Windows operating system.</li>
     * <li>Passwordless VNC connections are now supported. You do not need to set the <code>password</code> parameter.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>The KeepAlive time of a single management terminal URL is 300 seconds. If no interaction occurs within 300 seconds, the connection is automatically closed.</li>
     * <li>If the connection is interrupted, call this operation again to obtain a new <code>VncUrl</code> and construct a new management terminal URL to reconnect. You can reconnect up to 30 times per minute.
     * Example management terminal URL:</li>
     * </ul>
     * <pre><code>https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%****&amp;instanceId=i-wz9hhwq5a6tm****&amp;isWindows=true
     * </code></pre>
     * 
     * @param request the request parameters of DescribeInstanceVncUrl  DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     */
    CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request);

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>When you invoke an API operation by using Cloud Assistant CLI, make sure that the request parameter values of different data types comply with the format requirements. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">CLI parameter format overview</a>.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Send a dry run request by using the DryRun request parameter to check the validity of parameters and authorization.</li>
     * <li>When you perform a paging query for the first page of results, set only <code>MaxResults</code> to limit the number of entries to return. The <code>NextToken</code> value in the response is used as the credential to query subsequent pages. When you perform a paging query for subsequent pages, set <code>NextToken</code> to the <code>NextToken</code> value obtained from the previous response and set <code>MaxResults</code> to limit the number of entries to return.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>The response includes the instance status and instance system events in the Scheduled state.
     * If a time period is specified, events are filtered based on the time period.</p>
     * 
     * @param request the request parameters of DescribeInstancesFullStatus  DescribeInstancesFullStatusRequest
     * @return DescribeInstancesFullStatusResponse
     */
    CompletableFuture<DescribeInstancesFullStatusResponse> describeInstancesFullStatus(DescribeInstancesFullStatusRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>After you run a command, the command may not be successfully executed or produce the expected results. You must call this operation paged query the actual execution results. The actual output prevails.</li>
     * <li>You can query the execution information of the last 30 days. A maximum of 10,000 execution records can be retained.</li>
     * <li>You can subscribe to <a href="https://help.aliyun.com/document_detail/2669130.html">Cloud Assistant task status events</a> to obtain task results through events. This prevents frequent polling and improves efficiency.</li>
     * <li>When you query the first page, you only need to set <code>MaxResults</code> to limit the number of returned entries. The <code>NextToken</code> value in the response is used as the token paged query the next page. When you query the next page, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response, and set <code>MaxResults</code> to limit the number of returned entries.</li>
     * <li>Differences between <code>DescribeInvocations</code> and <code>DescribeInvocationResults</code>:<ul>
     * <li>When a <code>RunCommand</code> or <code>InvokeCommand</code> call specifies multiple instances:<ul>
     * <li>You can use <code>DescribeInvocations</code> to obtain the execution status of the task on each instance and the aggregated status of the task across multiple instances.</li>
     * <li>You can use <code>DescribeInvocationResults</code> to obtain only the individual execution status on each instance, which does not include the aggregated status across multiple instances.</li>
     * </ul>
     * </li>
     * <li>When a <code>RunCommand</code> or <code>InvokeCommand</code> call specifies a single instance:<ul>
     * <li><code>DescribeInvocations</code> and <code>DescribeInvocationResults</code> have little difference and can be used interchangeably.</li>
     * </ul>
     * </li>
     * <li>When you need to view each execution record of a scheduled task or a task that runs automatically on startup (<code>RepeatMode=Period, EveryReboot</code>), you can only use <code>DescribeInvocationResults</code> paged query the historical execution records (you must specify <code>IncludeHistory=true</code>). <code>DescribeInvocations</code> returns only the latest task status.</li>
     * <li>When you need to view the command content and parameters, only <code>DescribeInvocations</code> returns <code>CommandContent</code>.</li>
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
     * <ul>
     * <li>After you run a command, the command may not run successfully or produce the expected results. You must check the actual execution results based on the API response. The actual output prevails.</li>
     * <li>You can query the execution information of the last 30 days. A maximum of 10,000 execution records are retained.</li>
     * <li>You can subscribe to <a href="https://help.aliyun.com/document_detail/2669130.html">Cloud Assistant task status events</a> to obtain task results through events. This prevents frequent polling and improves efficiency.</li>
     * <li>When paged query the first page, you only need to set MaxResults to limit the number of returned entries. The NextToken value in the response is used as the token to query the next page. When paged query the next page, set the NextToken parameter to the NextToken value obtained from the previous response, and set MaxResults to limit the number of returned entries.</li>
     * <li>Differences between DescribeInvocations and DescribeInvocationResults:<ul>
     * <li>When multiple instances are specified in a single RunCommand or InvokeCommand call:<ul>
     * <li>You can use DescribeInvocations to obtain the execution status of the task on each instance and the aggregated status of the task across multiple instances.</li>
     * <li>You can use DescribeInvocationResults to obtain only the individual execution status on each instance, which does not include the aggregated status across multiple instances.</li>
     * </ul>
     * </li>
     * <li>When a single instance is specified in a single RunCommand or InvokeCommand call:<ul>
     * <li>DescribeInvocations and DescribeInvocationResults have little difference and can be used interchangeably.</li>
     * </ul>
     * </li>
     * <li>When you need to view the execution details of each run for scheduled (periodic) tasks or tasks that run automatically on boot (RepeatMode=Period, EveryReboot), you can only use DescribeInvocationResults to query the historical execution records (you must set IncludeHistory=true). DescribeInvocations returns only the latest task status.</li>
     * <li>When you need to view the command content and parameters, only DescribeInvocations returns CommandContent.</li>
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
     * @param request the request parameters of DescribeLockedSnapshots  DescribeLockedSnapshotsRequest
     * @return DescribeLockedSnapshotsResponse
     */
    CompletableFuture<DescribeLockedSnapshotsResponse> describeLockedSnapshots(DescribeLockedSnapshotsRequest request);

    /**
     * <b>description</b> :
     * <p>When paged query the first page, you only need to set MaxResults to limit the number of returned entries. The NextToken value in the response can be used as the token to query the next page. When paged query subsequent pages, set the NextToken parameter to the NextToken value returned in the previous response, and set MaxResults to limit the number of returned entries.</p>
     * 
     * @param request the request parameters of DescribeManagedInstances  DescribeManagedInstancesRequest
     * @return DescribeManagedInstancesResponse
     */
    CompletableFuture<DescribeManagedInstancesResponse> describeManagedInstances(DescribeManagedInstancesRequest request);

    /**
     * @deprecated OpenAPI DescribeNatGateways is deprecated, please use Vpc::2016-04-28::DescribeNatGateways instead.  * @param request  the request parameters of DescribeNatGateways  DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
     */
    @Deprecated
    CompletableFuture<DescribeNatGatewaysResponse> describeNatGateways(DescribeNatGatewaysRequest request);

    /**
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
     * <h2>Operation description</h2>
     * <p>The <code>DescribeNetworkInterfaces</code> operation supports pagination by specifying the <code>MaxResults</code> or <code>NextToken</code> parameter. Usage notes:</p>
     * <ul>
     * <li>When paged query the first page, you only need to specify <code>MaxResults</code> to limit the number of entries to return. The <code>NextToken</code> value in the response can be used as the token to query the next page.</li>
     * <li>When paged query subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value returned from the previous request, and specify <code>MaxResults</code> to limit the number of entries to return.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeNetworkInterfaces  DescribeNetworkInterfacesRequest
     * @return DescribeNetworkInterfacesResponse
     */
    CompletableFuture<DescribeNetworkInterfacesResponse> describeNetworkInterfaces(DescribeNetworkInterfacesRequest request);

    /**
     * @deprecated OpenAPI DescribeNewProjectEipMonitorData is deprecated, please use Vpc::2016-04-28::DescribeEipMonitorData instead.  * @param request  the request parameters of DescribeNewProjectEipMonitorData  DescribeNewProjectEipMonitorDataRequest
     * @return DescribeNewProjectEipMonitorDataResponse
     */
    @Deprecated
    CompletableFuture<DescribeNewProjectEipMonitorDataResponse> describeNewProjectEipMonitorData(DescribeNewProjectEipMonitorDataRequest request);

    /**
     * @deprecated OpenAPI DescribePhysicalConnections is deprecated, please use Vpc::2016-04-28::DescribePhysicalConnections instead.  * @param request  the request parameters of DescribePhysicalConnections  DescribePhysicalConnectionsRequest
     * @return DescribePhysicalConnectionsResponse
     */
    @Deprecated
    CompletableFuture<DescribePhysicalConnectionsResponse> describePhysicalConnections(DescribePhysicalConnectionsRequest request);

    /**
     * <b>description</b> :
     * <p>Queries the configured maintenance policies. Each policy contains two maintenance attributes:</p>
     * <ul>
     * <li>Maintenance time window: A time period you specify during which O&amp;M operations are performed.</li>
     * <li>Maintenance action: The instance down handling policy you specify.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlanMaintenanceWindows  DescribePlanMaintenanceWindowsRequest
     * @return DescribePlanMaintenanceWindowsResponse
     */
    CompletableFuture<DescribePlanMaintenanceWindowsResponse> describePlanMaintenanceWindows(DescribePlanMaintenanceWindowsRequest request);

    /**
     * @param request the request parameters of DescribePortRangeListAssociations  DescribePortRangeListAssociationsRequest
     * @return DescribePortRangeListAssociationsResponse
     */
    CompletableFuture<DescribePortRangeListAssociationsResponse> describePortRangeListAssociations(DescribePortRangeListAssociationsRequest request);

    /**
     * @param request the request parameters of DescribePortRangeListEntries  DescribePortRangeListEntriesRequest
     * @return DescribePortRangeListEntriesResponse
     */
    CompletableFuture<DescribePortRangeListEntriesResponse> describePortRangeListEntries(DescribePortRangeListEntriesRequest request);

    /**
     * @param request the request parameters of DescribePortRangeLists  DescribePortRangeListsRequest
     * @return DescribePortRangeListsResponse
     */
    CompletableFuture<DescribePortRangeListsResponse> describePortRangeLists(DescribePortRangeListsRequest request);

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
     * <p>The request parameters <code>AddressFamily</code>, <code>PrefixListId.N</code>, and <code>PrefixListName</code> act as filters and have a logical AND relationship. If a parameter is empty, the corresponding filter does not take effect.</p>
     * 
     * @param request the request parameters of DescribePrefixLists  DescribePrefixListsRequest
     * @return DescribePrefixListsResponse
     */
    CompletableFuture<DescribePrefixListsResponse> describePrefixLists(DescribePrefixListsRequest request);

    /**
     * <b>description</b> :
     * <p>The parameter settings vary based on the type of resource whose price you want to query:</p>
     * <ul>
     * <li>If <code>ResourceType=instance</code>, you must also specify the <code>InstanceType</code> parameter.
     * By default, the price of the pay-as-you-go (<code>PostPaid</code>) billing method (<code>ChargeType</code>) is queried. You can specify the <code>PriceUnit</code> parameter to query the prices of Elastic Compute Service (ECS) servers for different billing cycles.</li>
     * <li>If <code>ResourceType=disk</code>, you must also specify the <code>DataDisk.1.Category</code> and <code>DataDisk.1.Size</code> parameters. When you query the price of a <code>disk</code> resource, only the pay-as-you-go price of the disk is returned. This means that the <code>PriceUnit</code> parameter can only be set to <code>Hour</code>.</li>
     * <li>If <code>ResourceType=diskperformance</code>, you must also specify the <code>DataDisk.1.Category</code> and <code>DataDisk.1.ProvisionedIops</code> parameters.</li>
     * <li>If <code>ResourceType=ddh</code>, you must also specify the <code>DedicatedHostType</code> parameter.</li>
     * <li>If <code>ResourceType=ElasticityAssurance</code>, you must also specify the <code>InstanceType</code> parameter.</li>
     * <li>If <code>ResourceType=CapacityReservation</code>, you must also specify the <code>InstanceType</code> parameter.</li>
     * <li>If <code>ResourceType=bandwidth</code>, only the pay-by-traffic (<code>PayByTraffic</code>) price is returned.</li>
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
     * <ul>
     * <li>Only the price for renewing a subscription ECS instance for a specified duration or the price for renewing an instance to a unified expiration date is supported.</li>
     * <li>Precautions for parameter settings:<ul>
     * <li>If only the required parameters are set, the price for renewing the instance for one month is queried by default.</li>
     * <li>You cannot query the renewal duration price and the renewal-to-unified-expiration-date price at the same time. The renewal duration parameters (<code>Period</code> and <code>PeriodUnit</code>) and the unified expiration date parameter (<code>ExpectedRenewDay</code>) cannot be set at the same time.</li>
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
     * <h3>Scenarios</h3>
     * <ul>
     * <li>Query all reserved instances in a specified region.</li>
     * <li>Query the details of a reserved instance by its ID or name.</li>
     * <li>Filter reserved instances by instance type or instance family.</li>
     * <li>Filter reserved instances by scope or status.</li>
     * </ul>
     * <h3>Request examples</h3>
     * <details>
     * <summary>Example: Query all reserved instances purchased in the China (Hangzhou) region</summary>
     * ```
     * "Region":"cn-hangzhou" // Set the region to China (Hangzhou).
     * ```
     * </details>
     * <details>
     * <summary>Example: Query the details of the reserved instance whose ID is ecsri-bp129enntoynwwj5**** in the China (Hangzhou) region</summary>
     * ```
     * "Region":"cn-hangzhou", // Set the region to China (Hangzhou).
     * "ReservedInstanceId":"ecsri-bp129enntoynwwj5****" // Set the reserved instance ID.
     * ```
     * </details>
     * <details>
     * <summary>Example: Query reserved instances that can be applied to ecs.c5.2xlarge instances in the China (Hangzhou) region</summary>
     * ```
     * "Region":"cn-hangzhou", // Set the region to China (Hangzhou).
     * "InstanceType":"ecs.c5.2xlarge" // Set the instance type.
     * ```
     * </details>
     * <details>
     * <summary>Example: Query active regional reserved instances in the China (Hangzhou) region</summary>
     * ```
     * "Region":"cn-hangzhou", // Set the region to China (Hangzhou).
     * "Scope":"Region", // Set the scope of the reserved instance.
     * "Status":["Active"] // Set the status to Active.
     * ```
     * </details>
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
     * <p>The following examples describe common scenarios:</p>
     * <h3>Example 1: Query instance types supported for specification change</h3>
     * <p>Query the instance types to which instance i-bp67acfmxazb4p**** can be changed, and the inventory of the corresponding instance types in the zone where the instance resides.</p>
     * <pre><code>http(s)://ecs.aliyuncs.com/?Action=DescribeResourcesModification
     * &amp;RegionId=ap-southeast-1
     * &amp;ResourceId=i-bp67acfmxazb4p****
     * &amp;DestinationResource=InstanceType
     * &amp;OperationType=Upgrade
     * &amp;Common request parameters
     * </code></pre>
     * <h3>Example 2: Query instance types supported after changing the disk type</h3>
     * <p>Query the instance types to which instance i-bp67acfmxazb4p**** can be changed after the disk type is changed, and the inventory of the corresponding instance types in the zone where the instance resides.</p>
     * <pre><code>http(s)://ecs.aliyuncs.com/?Action=DescribeResourcesModification
     * &amp;RegionId=ap-southeast-1
     * &amp;ResourceId=i-bp67acfmxazb4p****
     * &amp;DestinationResource=InstanceType
     * &amp;OperationType=Upgrade
     * &amp;Conditions.0=DiskCategory
     * &amp;Common request parameters
     * </code></pre>
     * <h3>Example 3: Query the disk type required by the target instance type</h3>
     * <p>Query the disk type required by the target instance type (for example, ecs.g7.large). This means that instance i-bp67acfmxazb4p**** must change to this disk type before it can be changed to the target instance type. Also query the inventory of the disk type in the zone where the instance resides.</p>
     * <blockquote>
     * <p>The target instance type must be obtained by using Example 2.</p>
     * </blockquote>
     * <pre><code>http(s)://ecs.aliyuncs.com/?Action=DescribeResourcesModification
     * &amp;RegionId=ap-southeast-1
     * &amp;ResourceId=i-bp67acfmxazb4p****
     * &amp;DestinationResource=SystemDisk
     * &amp;OperationType=Upgrade
     * &amp;InstanceType=ecs.g7.large
     * &amp;Common request parameters
     * </code></pre>
     * 
     * @param request the request parameters of DescribeResourcesModification  DescribeResourcesModificationRequest
     * @return DescribeResourcesModificationResponse
     */
    CompletableFuture<DescribeResourcesModificationResponse> describeResourcesModification(DescribeResourcesModificationRequest request);

    /**
     * @deprecated OpenAPI DescribeRouteTables is deprecated, please use Vpc::2016-04-28::DescribeRouteTableList instead.  * @param request  the request parameters of DescribeRouteTables  DescribeRouteTablesRequest
     * @return DescribeRouteTablesResponse
     */
    @Deprecated
    CompletableFuture<DescribeRouteTablesResponse> describeRouteTables(DescribeRouteTablesRequest request);

    /**
     * @deprecated OpenAPI DescribeRouterInterfaces is deprecated, please use Vpc::2016-04-28::DescribeRouterInterfaces instead.  * @param request  the request parameters of DescribeRouterInterfaces  DescribeRouterInterfacesRequest
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
     * <ul>
     * <li>If you cannot delete a security group (<a href="https://help.aliyun.com/document_detail/25558.html">DeleteSecurityGroup</a>), you can call this operation to check whether the specified security group has been authorized by other security groups. If the specified security group has been authorized, you can call <a href="https://help.aliyun.com/document_detail/2679855.html">RevokeSecurityGroup</a> and <a href="https://help.aliyun.com/document_detail/2679856.html">RevokeSecurityGroupEgress</a> to delete the corresponding security group rules to revoke the authorization.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityGroupReferences  DescribeSecurityGroupReferencesRequest
     * @return DescribeSecurityGroupReferencesResponse
     */
    CompletableFuture<DescribeSecurityGroupReferencesResponse> describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Paged query</strong>: Use <code>MaxResults</code> and <code>NextToken</code> for paging.<ul>
     * <li>If the response does not contain <code>NextToken</code>, the current page is the last page.</li>
     * <li>For the first page, set only <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response serves as the token for querying subsequent pages.</li>
     * <li>For subsequent pages, set <code>NextToken</code> to the value obtained from the previous response and set <code>MaxResults</code> to limit the number of entries returned.</li>
     * </ul>
     * </li>
     * <li>When you invoke this operation by using Cloud Assistant CLI, specify request parameters in their required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.<blockquote>
     * <p>Settings for request parameters of different data types must follow specific format requirements when calling the API through Alibaba Cloud CLI.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityGroups  DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     */
    CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description:</h2>
     * <ul>
     * <li>After you deliver a file, the delivery is not necessarily successful. You must check the actual delivery result based on the return value of the API operation. The actual output result prevails.</li>
     * <li>You can query the execution information from the last 1 day. A maximum of 1,000 execution records can be retained.</li>
     * <li>When paged query the first page, you only need to specify <code>MaxResults</code> to limit the number of returned entries. The <code>NextToken</code> value in the response is used as the token to query the next page. When paged query the next page, set the <code>NextToken</code> parameter to the <code>NextToken</code> value returned from the previous request, and specify <code>MaxResults</code> to limit the number of returned entries.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSendFileResults  DescribeSendFileResultsRequest
     * @return DescribeSendFileResultsResponse
     */
    CompletableFuture<DescribeSendFileResultsResponse> describeSendFileResults(DescribeSendFileResultsRequest request);

    /**
     * <b>description</b> :
     * <p><code>InstanceId</code>, <code>SnapshotGroupId.N</code>, and <code>Status.N</code> are not required request parameters, but you can use them to build filter logic. The logical relationship between these parameters is AND.</p>
     * 
     * @param request the request parameters of DescribeSnapshotGroups  DescribeSnapshotGroupsRequest
     * @return DescribeSnapshotGroupsResponse
     */
    CompletableFuture<DescribeSnapshotGroupsResponse> describeSnapshotGroups(DescribeSnapshotGroupsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Request parameters such as <code>RegionId</code>, <code>DiskIds</code>, and <code>InstanceId</code> act as filters. The logical AND operator is applied between these parameters.  </li>
     * <li>If you do not specify any parameters, the filters do not take effect. If both <code>DiskIds</code> and <code>SnapshotLinkIds</code> are set to empty arrays, the filters are considered valid, but an empty result is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSnapshotLinks  DescribeSnapshotLinksRequest
     * @return DescribeSnapshotLinksResponse
     */
    CompletableFuture<DescribeSnapshotLinksResponse> describeSnapshotLinks(DescribeSnapshotLinksRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>A maximum of 400 data entries can be returned at a time. The condition <code>(EndTime – StartTime) / Period</code> must be less than or equal to 400. In other words, the response parameter <code>TotalCount</code> cannot exceed 400. Otherwise, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.  </li>
     * <li>You can query monitoring data only within the last 30 days. The <code>StartTime</code> parameter cannot be more than 30 days earlier than the current time.</li>
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
     * <p>InstanceId, DiskId, and SnapshotIds are not required request parameters, but you can use them to build filter logic. The logical relationship between these parameters is AND.
     * When you call API operations by using Alibaba Cloud CLI, the values of request parameters of different data types must follow specific format requirements. For details, see <a href="https://help.aliyun.com/document_detail/110340.html">CLI parameter format description</a>.
     * Request examples:</p>
     * <details>
     * <summary>Query the list of snapshots for all cloud disks of an ECS instance in the China (Hangzhou) region</summary>
     * ```
     * RegionId:  cn-hangzhou,   // Set the region to China (Hangzhou).
     * InstanceId:  i-bp1fh7by6d9mw7zr****   // Set the ID of the instance to query.
     * ```
     * </details>
     * <details>
     * <summary>Query the snapshot information of a specific cloud disk in the China (Hangzhou) region</summary>
     * ```
     * RegionId:  cn-hangzhou,   // Set the region to China (Hangzhou).
     * DiskId:   d-bp10e7ej8z743dmu****   // Set the ID of the cloud disk to query.
     * ```
     * </details>
     * <details>
     * <summary>Query the information of two snapshots by snapshot ID in the China (Hangzhou) region</summary>
     * ```
     * RegionId:  cn-hangzhou,   // Set the region to China (Hangzhou).
     * SnapshotIds:   ["d-bp10e7ej8z743dmu****", "s-bp19vd1lorzgzt2s****"]   // Set the array of snapshot IDs to query.
     * ```
     * </details>
     * <details>
     * <summary>Query the information of snapshots created after a specific point in time in the China (Hangzhou) region</summary>
     * ```
     * RegionId:  cn-hangzhou,   // Set the region to China (Hangzhou).
     * Filter.1.Key:   CreationStartTime,   // Set the array of snapshot IDs to query.
     * Filter.1.Value:   2024-11-27T00:00Z.
     * ```
     * </details>
     * 
     * @param request the request parameters of DescribeSnapshots  DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>To view the snapshot usage of each cloud disk in the current region, call <a href="https://help.aliyun.com/document_detail/55837.html">DescribeSnapshotLinks</a> to query snapshot chains.</p>
     * 
     * @param request the request parameters of DescribeSnapshotsUsage  DescribeSnapshotsUsageRequest
     * @return DescribeSnapshotsUsageResponse
     */
    CompletableFuture<DescribeSnapshotsUsageResponse> describeSnapshotsUsage(DescribeSnapshotsUsageRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only spot instances that are deployed in VPCs and are I/O optimized are supported.</li>
     * <li>You can call this operation by using one of the following methods:<ul>
     * <li>Set the <code>Cores</code> and <code>Memory</code> parameters or the <code>MinCores</code> and <code>MinMemory</code> parameters to query instance types that meet the vCPU and memory requirements.</li>
     * <li>Set the <code>InstanceTypes.N</code> parameter to query specified instance types.</li>
     * <li>Set the <code>Cores</code> and <code>Memory</code> parameters or the <code>MinCores</code> and <code>MinMemory</code> parameters, and then set the <code>InstanceTypeFamily</code> or <code>InstanceFamilyLevel</code> parameter to query instance types that meet the vCPU and memory requirements within a specific instance family or at a specific level.</li>
     * </ul>
     * </li>
     * <li>You can calculate the average price of spot instances based on the average discount rate and the price of pay-as-you-go instances.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSpotAdvice  DescribeSpotAdviceRequest
     * @return DescribeSpotAdviceResponse
     */
    CompletableFuture<DescribeSpotAdviceResponse> describeSpotAdvice(DescribeSpotAdviceRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only I/O optimized spot instances are supported.</li>
     * <li>The returned data may be paginated. If the response includes the <code>NextOffset</code> parameter, you can set the <code>Offset</code> request parameter to the <code>NextOffset</code> value to query subsequent data.</li>
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
     * @deprecated OpenAPI DescribeTags is deprecated, please use Tag::2018-08-28::CountResourcesByTags instead.  * @param request  the request parameters of DescribeTags  DescribeTagsRequest
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
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request);

    /**
     * <b>description</b> :
     * <p>You can query Session Manager session records created within the last 30 days. A maximum of 1,000 successful records are retained.</p>
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
     * @param request the request parameters of DescribeUserData  DescribeUserDataRequest
     * @return DescribeUserDataResponse
     */
    CompletableFuture<DescribeUserDataResponse> describeUserData(DescribeUserDataRequest request);

    /**
     * @deprecated OpenAPI DescribeVRouters is deprecated, please use Vpc::2016-04-28::DescribeVRouters instead.  * @param request  the request parameters of DescribeVRouters  DescribeVRoutersRequest
     * @return DescribeVRoutersResponse
     */
    @Deprecated
    CompletableFuture<DescribeVRoutersResponse> describeVRouters(DescribeVRoutersRequest request);

    /**
     * @deprecated OpenAPI DescribeVSwitches is deprecated, please use Vpc::2016-04-28::DescribeVSwitches instead.  * @param request  the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    @Deprecated
    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    /**
     * @deprecated OpenAPI DescribeVirtualBorderRouters is deprecated, please use Vpc::2016-04-28::DescribeVirtualBorderRouters instead.  * @param request  the request parameters of DescribeVirtualBorderRouters  DescribeVirtualBorderRoutersRequest
     * @return DescribeVirtualBorderRoutersResponse
     */
    @Deprecated
    CompletableFuture<DescribeVirtualBorderRoutersResponse> describeVirtualBorderRouters(DescribeVirtualBorderRoutersRequest request);

    /**
     * @deprecated OpenAPI DescribeVirtualBorderRoutersForPhysicalConnection is deprecated, please use Vpc::2016-04-28::DescribeVirtualBorderRoutersForPhysicalConnection instead.  * @param request  the request parameters of DescribeVirtualBorderRoutersForPhysicalConnection  DescribeVirtualBorderRoutersForPhysicalConnectionRequest
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
     * <p>If you specify a tag key (Tag.N.Key) but do not specify a tag value (Tag.N.Value), all key-value pairs that match the tag key are queried. If you specify a tag key-value pair, the tags that are an exact match for the key-value pair are queried.</p>
     * 
     * @param request the request parameters of DescribeVscs  DescribeVscsRequest
     * @return DescribeVscsResponse
     */
    CompletableFuture<DescribeVscsResponse> describeVscs(DescribeVscsRequest request);

    /**
     * <b>description</b> :
     * <p>DescribeZones queries only the list of zones provided by Alibaba Cloud and returns limited inventory information. To query the available instance types and disk categories in a specific zone, use <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a>.</p>
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
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>This operation is asynchronous. After a successful call, wait about one minute for the unmount process to complete.</li>
     * <li>If the instance to which the disk is mounted is under security control, <code>OperationLocks</code> cannot be marked with the <code>&quot;LockReason&quot; : &quot;security&quot;</code> lock state.</li>
     * <li>After an elastic ephemeral disk is unmounted, it can only be remounted to its original instance.</li>
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
     * <li>After you unbind an SSH key pair, you must restart the instance (<a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a>) for the changes to take effect.  </li>
     * <li>After you unbind an SSH key pair, the instance uses the username and password authentication method by default.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachKeyPair  DetachKeyPairRequest
     * @return DetachKeyPairResponse
     */
    CompletableFuture<DetachKeyPairResponse> detachKeyPair(DetachKeyPairRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You cannot detach the primary ENI of an instance.</li>
     * <li>The network interface controller (NIC) must be in the Detaching or InUse state.</li>
     * <li>The instance must be in the Running or Stopped state.</li>
     * <li>This is an asynchronous operation. After you invoke the operation, you can check the Elastic Network Interface (ENI) status or listen for network interface controller (NIC) operation events to obtain the result. The following figure shows the ENI state machine:
     * <img src="https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/zh-CN/20221124/mvga/DetachNetworkInterface.jpg" alt=""><ul>
     * <li>The Detaching state indicates that the detach Elastic Network Interface (ENI) request has been sent successfully and the network interface controller (NIC) is being detached from the ECS instance.</li>
     * <li>The Available state indicates that the network interface controller (NIC) has been detached from the ECS instance.</li>
     * <li>If the Elastic Network Interface (ENI) remains in the Detaching state for an extended period, the detachment may have failed because the operating system inside the instance did not respond to the network interface controller (NIC) detach request. In this case, initiate a new detach request for the ENI. If the issue persists, restart the instance and retry.
     * <strong>For details, see</strong> <a href="https://help.aliyun.com/document_detail/471551.html">Detach an Elastic Network Interface (ENI)</a>. To invoke this operation, refer to the sample code.</li>
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
     * <h2>Operation description</h2>
     * <p>If you are concerned that a created activation code may be leaked, you can call this operation to disable the activation code. After the activation code is disabled, it can no longer be used to register new managed instances. However, managed instances that are already registered are not affected.</p>
     * 
     * @param request the request parameters of DisableActivation  DisableActivationRequest
     * @return DisableActivationResponse
     */
    CompletableFuture<DisableActivationResponse> disableActivation(DisableActivationRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you begin</strong><ul>
     * <li>RAM users require the <code>AliyunECSFullAccess</code> permission. For more information about how to grant Resource Access Management (RAM) user, see <a href="https://help.aliyun.com/document_detail/116146.html">Grant Resource Access Management (RAM) user</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Precautions</strong><ul>
     * <li>After you disable account-level default encryption for block storage, the encryption status of existing cloud disks is not affected.</li>
     * <li>After you disable account-level default encryption for block storage, you can still manually select encryption when you purchase new cloud disks.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DisableDiskEncryptionByDefault  DisableDiskEncryptionByDefaultRequest
     * @return DisableDiskEncryptionByDefaultResponse
     */
    CompletableFuture<DisableDiskEncryptionByDefaultResponse> disableDiskEncryptionByDefault(DisableDiskEncryptionByDefaultRequest request);

    /**
     * @param request the request parameters of DisableNetworkInterfaceQoS  DisableNetworkInterfaceQoSRequest
     * @return DisableNetworkInterfaceQoSResponse
     */
    CompletableFuture<DisableNetworkInterfaceQoSResponse> disableNetworkInterfaceQoS(DisableNetworkInterfaceQoSRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>The EBS account-level default encryption feature is currently available only in specific regions and to specific users. To use this feature, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.
     * &lt;props=&quot;intl&quot;&gt;
     * The EBS account-level default encryption feature is currently available only in specific regions and to specific users. To use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
     * </blockquote>
     * <ul>
     * <li><strong>Before you begin</strong><ul>
     * <li>RAM users require the <code>AliyunECSFullAccess</code> permission. For more information about how to grant Resource Access Management (RAM) user, see <a href="https://help.aliyun.com/document_detail/116146.html">Grant Resource Access Management (RAM) user</a>.</li>
     * <li>Before you enable account-level default encryption for Elastic Block Storage, you must first <a href="https://help.aliyun.com/document_detail/480156.html">activate Key Management Service (KMS)</a>.</li>
     * <li>After you enable account-level default encryption for Elastic Block Storage, you can only purchase encrypted cloud disks. For more information, see <a href="~~59643#50de175230erj~~">Limits on encrypted cloud disks</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Precautions</strong><ul>
     * <li>After you enable account-level default encryption for Elastic Block Storage, all newly purchased pay-as-you-go or subscription cloud disks must be encrypted. You can use the KMS key ID configured for account-level default encryption, or change it to any other KMS key ID.</li>
     * <li>When you enable account-level default encryption for Elastic Block Storage for the first time, the service key is used by default.</li>
     * </ul>
     * </li>
     * <li><strong>Recommendations</strong><ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2851493.html">DescribeDiskEncryptionByDefaultStatus</a> and <a href="https://help.aliyun.com/document_detail/2851490.html">DescribeDiskDefaultKMSKeyId</a> operations to query whether account-level default encryption for Elastic Block Storage is enabled in a specified region and the KMS key ID in use.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2851492.html">ModifyDiskDefaultKMSKeyId</a> or <a href="https://help.aliyun.com/document_detail/2851539.html">ResetDiskDefaultKMSKeyId</a> operation to modify or reset the KMS key for account-level default encryption.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2851491.html">DisableDiskEncryptionByDefault</a> operation to disable account-level default encryption for Elastic Block Storage in a specified region.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of EnableDiskEncryptionByDefault  EnableDiskEncryptionByDefaultRequest
     * @return EnableDiskEncryptionByDefaultResponse
     */
    CompletableFuture<EnableDiskEncryptionByDefaultResponse> enableDiskEncryptionByDefault(EnableDiskEncryptionByDefaultRequest request);

    /**
     * @param request the request parameters of EnableNetworkInterfaceQoS  EnableNetworkInterfaceQoSRequest
     * @return EnableNetworkInterfaceQoSResponse
     */
    CompletableFuture<EnableNetworkInterfaceQoSResponse> enableNetworkInterfaceQoS(EnableNetworkInterfaceQoSRequest request);

    /**
     * @deprecated OpenAPI EnablePhysicalConnection is deprecated, please use Vpc::2016-04-28::EnablePhysicalConnection instead.  * @param request  the request parameters of EnablePhysicalConnection  EnablePhysicalConnectionRequest
     * @return EnablePhysicalConnectionResponse
     */
    @Deprecated
    CompletableFuture<EnablePhysicalConnectionResponse> enablePhysicalConnection(EnablePhysicalConnectionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Closes the data connection of a specified session. The session can no longer be used.</li>
     * <li>The WebSocket URL associated with the session also becomes invalid and can no longer be used.</li>
     * </ul>
     * 
     * @param request the request parameters of EndTerminalSession  EndTerminalSessionRequest
     * @return EndTerminalSessionResponse
     */
    CompletableFuture<EndTerminalSessionResponse> endTerminalSession(EndTerminalSessionRequest request);

    /**
     * <b>description</b> :
     * <p>Before exporting an image:</p>
     * <ul>
     * <li>Review the prerequisites and precautions. For more information, see <a href="https://help.aliyun.com/document_detail/58181.html">Export an image</a>.</li>
     * <li>The ImageFormat parameter that specifies the image export format is available only in specific regions, including Japan (Tokyo), Indonesia (Jakarta), Germany (Frankfurt), UAE (Dubai), US (Virginia), UK (London), Singapore, Malaysia (Kuala Lumpur), and US (Silicon Valley). In regions that do not support specifying the image format, images are exported in RAW format by default.</li>
     * <li>You must use RAM to authorize Elastic Compute Service to write data to OSS. The procedure is as follows:<ul>
     * <li>Create a role named <code>AliyunECSImageExportDefaultRole</code> (any other role name is invalid), and configure the following role policy:<pre><code>   {
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
     *    }
     * </code></pre>
     * </li>
     * <li>Attach the default system access policy <code>AliyunECSImageExportRolePolicy</code> to the <code>AliyunECSImageExportDefaultRole</code> role. This policy is the default policy provided by Elastic Compute Service for exporting images. For more details, see <a href="https://ram.console.aliyun.com/?spm=5176.2020520101.0.0.64c64df5dfpmdY#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunECSImageImportDefaultRole%22,%20%22TemplateId%22:%20%22ECSImportRole%22%7D,%20%22request2%22:%20%7B%22RoleName%22:%20%22AliyunECSImageExportDefaultRole%22,%20%22TemplateId%22:%20%22ECSExportRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fecs.console.aliyun.com%2F%22,%20%22Service%22:%20%22ECS%22%7D">Cloud resource access authorization</a>. You can also create a custom access policy, which must include the following permissions:</li>
     * </ul>
     * <pre><code>     {
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
     *      }
     *   ```
     * </code></pre>
     * </li>
     * </ul>
     * <p>After exporting the image:
     * The custom image is saved in the specified OSS bucket, and you can download the custom image. For more information, see <a href="https://help.aliyun.com/document_detail/31912.html">Download a custom image file</a>.</p>
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
     * <ul>
     * <li>Elastic Compute Service (ECS) is a virtualization-based cloud server that cannot be connected to display devices or manually screenshotted. However, Alibaba Cloud caches the system command line output from the last time an instance was started, restarted, or shut down. You can invoke GetInstanceConsoleOutput to retrieve this output.</li>
     * <li>You cannot retrieve the system command line output of <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>.</li>
     * <li>Windows instances do not support retrieving system command line output.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceConsoleOutput  GetInstanceConsoleOutputRequest
     * @return GetInstanceConsoleOutputResponse
     */
    CompletableFuture<GetInstanceConsoleOutputResponse> getInstanceConsoleOutput(GetInstanceConsoleOutputRequest request);

    /**
     * <b>description</b> :
     * <p>After Elastic Compute Service returns the instance screenshot in JPG format with Base64 encoding, you must decode it. You can call this operation to troubleshoot faults. Note the following precautions:</p>
     * <ul>
     * <li>The instance must be in the Running state. </li>
     * <li>Screenshots cannot be obtained for <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>. </li>
     * <li>If you call this operation multiple times on the same instance, the interval between calls must be at least 10 seconds. Otherwise, the <code>Throttling</code> error code is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceScreenshot  GetInstanceScreenshotRequest
     * @return GetInstanceScreenshotResponse
     */
    CompletableFuture<GetInstanceScreenshotResponse> getInstanceScreenshot(GetInstanceScreenshotRequest request);

    /**
     * <b>description</b> :
     * <h3>Operation description</h3>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You must upload the image file to Object Storage Service (OSS) in advance. For more information, see <a href="https://help.aliyun.com/document_detail/31886.html">Upload objects</a>.</li>
     * <li>To prevent ECS instances created from the imported custom image from failing to start due to operating system issues on some servers, virtual machines, or cloud hosts, check whether you need to install the virtio driver on the source server before importing the image. For more information, see <a href="https://help.aliyun.com/document_detail/62423.html">Install a virtio driver</a>.</li>
     * <li>When you import an image for the first time, you must use Resource Access Management (RAM) to authorize ECS to access your OSS bucket. Otherwise, the <code>NoSetRoletoECSServiceAccount</code> or <code>InvalidOperation.CloudBoxImageImportRoleRequired</code> error is reported. The following two scenarios apply:<ul>
     * <li><strong>Import an image file without using CloudBox</strong>: You can complete RAM authorization with one click in the RAM console. For RAM authorization page, see <a href="https://ram.console.aliyun.com/?spm=5176.2020520101image.0.0.2ffa4df57kSoHX#/role/authorize?request=%7B%22Requests%22%3A%20%7B%22request1%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageImportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSImportRole%22%7D%2C%20%22request2%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageExportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSExportRole%22%7D%7D%2C%20%22ReturnUrl%22%3A%20%22https%3A//ecs.console.aliyun.com/%22%2C%20%22Service%22%3A%20%22ECS%22%7D">Cloud resource access authorization</a>. You can also manually complete RAM authorization. The following policies and permissions are required for some operations. For more information, see <a href="https://help.aliyun.com/document_detail/25481.html">Account access control</a>.<ol>
     * <li>Create a role named <code>AliyunECSImageImportDefaultRole</code> (this exact name is required, otherwise the image import fails). The policy for the role is:<pre><code>{
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
     * }
     * </code></pre>
     * </li>
     * <li>Attach the system policy <code>AliyunECSImageImportRolePolicy</code> to the role. You can also create a custom policy that must include the following permissions:<pre><code>{
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
     * <li><strong>Import an image file by using CloudBox</strong>: You can complete RAM authorization with one click in the RAM console. For RAM authorization page, see <a href="https://ram.console.aliyun.com/role/authorize?request=%7B%22ReturnUrl%22%3A%22https%3A%2F%2Fecs.console.aliyun.com%2F%22%2C%22Services%22%3A%5B%7B%22Roles%22%3A%5B%7B%22RoleName%22%3A%22AliyunECSCloudBoxImageImportDefaultRole%22%2C%22TemplateId%22%3A%22AliyunECSCloudBoxImageImportDefaultRole%22%7D%5D%2C%22Service%22%3A%22ECS%22%7D%5D%7D">Cloud resource access authorization</a>. You can also manually complete RAM authorization. The following policies and permissions are required for some operations. For more information, see <a href="https://help.aliyun.com/document_detail/25481.html">Account access control</a>.<ol>
     * <li>Create a role named <code>AliyunECSCloudBoxImageImportDefaultRole</code> (this exact name is required, otherwise the image import fails). The policy for the role is:<pre><code>{
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
     * }
     * </code></pre>
     * </li>
     * <li>Attach the system policy <code>AliyunECSCloudBoxImageImportRolePolicy</code> to the role. You can also create a custom policy that must include the following permissions:<pre><code>{
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
     * <li>You cannot delete an image that is being imported. You can only call <a href="https://help.aliyun.com/document_detail/25624.html">CancelTask</a> to cancel the image import task.</li>
     * <li>The region to which the image is imported must be the same as the region of the OSS bucket to which the image file is uploaded.</li>
     * <li>Valid values of N in the <code>DiskDeviceMapping.N</code> parameter: 1 to 17. N=1 indicates the system disk. N=2 to 17 indicates data disks. When N is greater than 17, the system automatically ignores the value.</li>
     * <li>When the <code>Architecture</code> parameter is set to <code>arm64</code>, or the <code>Platform</code> parameter is set to <code>CentOS Stream</code>, <code>Anolis</code>, <code>AlmaLinux</code>, <code>UOS</code>, <code>Kylin</code>, or <code>Rocky Linux</code>, take note of the following items:<ul>
     * <li>To enable the imported image to support password configuration or key pair modification, the image must meet the following conditions:<ul>
     * <li>The operating system kernel must support the <code>CONFIG_FW_CFG_SYSFS</code> feature. Linux community kernels later than version 4.6 support this feature by default. CentOS kernels later than version 3.10.0-826.el7 support this feature by default. You can run the <code>grep -nr CONFIG_FW_CFG_SYSFS /boot/config-$(uname -r)</code> command on the server that corresponds to the image. If the output contains <code>CONFIG_FW_CFG_SYSFS=y</code>, the kernel in the image supports the <code>CONFIG_FW_CFG_SYSFS</code> feature.</li>
     * <li>The latest version of Alibaba Cloud cloud-init is installed on the operating system. Cloud-init 19.1 must Milvus version 19.1.3 or later. Cloud-init 0.7.6a on some earlier operating systems must Milvus version 0.7.6a15 or later. For more information, see <a href="https://help.aliyun.com/document_detail/57803.html">Install cloud-init</a>.</li>
     * <li>The operating system must support the SHA-512 encryption algorithm.</li>
     * </ul>
     * </li>
     * <li>To enable the imported image to support disk resizing and file system resizing, the image must meet the following conditions:<ul>
     * <li>The operating system kernel version must be later than 3.6.</li>
     * <li>The growpart command is supported. To support this command, install the <code>cloud-utils-growpart</code> package. The installation method varies depending on the operating system. For more information, see <a href="~~2949817#bb3b1f02e51pj~~">Resize partitions and file systems (Linux)</a>.</li>
     * <li>The resize2fs command is supported. To support this command, install the <code>e2fsprogs</code> package. This package is installed by default on the operating system. If it is not installed, install it manually.</li>
     * <li>The latest version of Alibaba Cloud cloud-init is installed on the operating system. Cloud-init 19.1 must Milvus version 19.1.3 or later. Cloud-init 0.7.6a on some earlier operating systems must Milvus version 0.7.6a15 or later. For more information, see <a href="https://help.aliyun.com/document_detail/57803.html">Install cloud-init</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>If the system architecture of the custom image that you want to import is arm64, set the RTC clock to use the UTC time standard. For more information, see <a href="https://help.aliyun.com/document_detail/405080.html">Linux time and time zone description</a>.</li>
     * <li>We strongly recommend that you configure image detection parameters when importing an image. This helps the system optimize your image. For more information, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview of image detection</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportImage  ImportImageRequest
     * @return ImportImageResponse
     */
    CompletableFuture<ImportImageResponse> importImage(ImportImageRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can have a maximum of 500 key pairs in each region.</li>
     * <li>The imported key pair must support one of the following encryption methods:<ul>
     * <li>rsa</li>
     * <li>dsa</li>
     * <li>ssh-rsa</li>
     * <li>ssh-dss</li>
     * <li>ecdsa</li>
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
     * <h2>Operation description</h2>
     * <p>After you call the InstallCloudAssistant operation, call <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> to make the Cloud Assistant Agent installation take effect.</p>
     * 
     * @param request the request parameters of InstallCloudAssistant  InstallCloudAssistantRequest
     * @return InstallCloudAssistantResponse
     */
    CompletableFuture<InstallCloudAssistantResponse> installCloudAssistant(InstallCloudAssistantRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>The following limits apply to the target ECS instances. If you select multiple ECS instances and one of them does not meet the execution conditions, you must call the operation again.<ul>
     * <li>Target instance must be in the Running state. You can call <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> to query target instance status.</li>
     * <li><a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> must be installed on target instance in advance. </li>
     * <li>To run a PowerShell command, target instance must have the PowerShell module configured.</li>
     * </ul>
     * </li>
     * <li>One-time execution: The command is executed only once.</li>
     * <li>Scheduled execution:<ul>
     * <li>The command is executed at the frequency specified by the Frequency parameter. The result of the previous execution does not affect the next execution.</li>
     * <li>If you specify a time zone when you run a scheduled task based on a Cron expression, the scheduled execution time is based on the specified time zone. If you do not specify a time zone, the scheduled execution time is based on the system time zone of the ECS instance. Make sure that the time or time zone of the ECS instance is consistent with your expected time. For more information about time zones, see <a href="https://help.aliyun.com/document_detail/92704.html">Manage time synchronization services</a>.
     *    The Cloud Assistant Agent version must be at least the following versions to support the new features of scheduled tasks (execution at fixed intervals, one-time execution at a specified time, and specifying a year or time zone for Cron expression-based scheduled execution). If the ClientNeedUpgrade error code is returned, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a> to update the agent to the latest version.</li>
     * <li>Linux: 2.2.3.282</li>
     * <li>Windows: 2.1.3.282</li>
     * </ul>
     * </li>
     * <li>A command may fail to be executed because of abnormal instance status, network exceptions, or Cloud Assistant Agent exceptions. No execution information is generated when a command fails to be executed. For more information, see <a href="https://help.aliyun.com/document_detail/87029.html">Common errors and solutions for execution failures</a>. </li>
     * <li>If you enabled the custom parameter feature when you created the command, you must pass in custom parameters (<code>Parameters</code>) when you execute the command.</li>
     * <li>Call <a href="https://help.aliyun.com/document_detail/87346.html">DescribeCloudAssistantStatus</a> to query the Cloud Assistant status of target instance first. Execute the command only when CloudAssistantStatus is true, especially for newly purchased instances.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>The following limits apply to the target ECS instances. If you select multiple ECS instances and one of them does not meet the execution conditions, you must call the operation again.<ul>
     * <li>Target instance must be in the Running state. You can call <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> to query target instance status.</li>
     * <li><a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> must be installed on target instance in advance. </li>
     * <li>To run a PowerShell command, target instance must have the PowerShell module configured.</li>
     * </ul>
     * </li>
     * <li>One-time execution: The command is executed only once.</li>
     * <li>Scheduled execution:<ul>
     * <li>The command is executed at the frequency specified by the Frequency parameter. The result of the previous execution does not affect the next execution.</li>
     * <li>If you specify a time zone when you run a scheduled task based on a Cron expression, the scheduled execution time is based on the specified time zone. If you do not specify a time zone, the scheduled execution time is based on the system time zone of the ECS instance. Make sure that the time or time zone of the ECS instance is consistent with your expected time. For more information about time zones, see <a href="https://help.aliyun.com/document_detail/92704.html">Manage time synchronization services</a>.
     *    The Cloud Assistant Agent version must be at least the following versions to support the new features of scheduled tasks (execution at fixed intervals, one-time execution at a specified time, and specifying a year or time zone for Cron expression-based scheduled execution). If the ClientNeedUpgrade error code is returned, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a> to update the agent to the latest version.</li>
     * <li>Linux: 2.2.3.282</li>
     * <li>Windows: 2.1.3.282</li>
     * </ul>
     * </li>
     * <li>A command may fail to be executed because of abnormal instance status, network exceptions, or Cloud Assistant Agent exceptions. No execution information is generated when a command fails to be executed. For more information, see <a href="https://help.aliyun.com/document_detail/87029.html">Common errors and solutions for execution failures</a>. </li>
     * <li>If you enabled the custom parameter feature when you created the command, you must pass in custom parameters (<code>Parameters</code>) when you execute the command.</li>
     * <li>Call <a href="https://help.aliyun.com/document_detail/87346.html">DescribeCloudAssistantStatus</a> to query the Cloud Assistant status of target instance first. Execute the command only when CloudAssistantStatus is true, especially for newly purchased instances.</li>
     * </ul>
     * 
     * @param request the request parameters of InvokeCommand  InvokeCommandRequest
     * @return InvokeCommandResponse
     */
    CompletableFuture<InvokeCommandResponse> invokeCommand(InvokeCommandRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>A resource is a cloud service entity that you create on Alibaba Cloud, such as an ECS instance, an Elastic Network Interface (ENI), or an ECS image. A resource group is a collection of infrastructure for projects, environments, or stacks. Managing resources in resource groups allows you to centrally monitor resources and execute tasks, which eliminates the need to switch between multiple Alibaba Cloud services.</p>
     * 
     * @param request the request parameters of JoinResourceGroup  JoinResourceGroupRequest
     * @return JoinResourceGroupResponse
     */
    CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API operation is deprecated. Use <a href="https://help.aliyun.com/document_detail/25503.html">ModifyInstanceAttribute</a> to add or remove an ECS instance from a security group, or use <a href="https://help.aliyun.com/document_detail/58513.html">ModifyNetworkInterfaceAttribute</a> to add or remove an Elastic Network Interface (ENI) from a security group.</p>
     * </blockquote>
     * <ul>
     * <li>This API operation does not support adding an instance and an ENI to a security group at the same time. You cannot specify both the InstanceId and NetworkInterfaceId parameters.</li>
     * <li>The security group and the instance must belong to the same Alibaba Cloud region. </li>
     * <li>The security group and the instance must have the same network type. If the network type is VPC, the security group and the instance must belong to the same VPC.</li>
     * <li>Before adding the instance to the security group, the instance must be in the <strong>Stopped</strong> or <strong>Running</strong> state.</li>
     * <li>An instance or an ENI can be added to a maximum of five security groups. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of JoinSecurityGroup  JoinSecurityGroupRequest
     * @return JoinSecurityGroupResponse
     */
    CompletableFuture<JoinSecurityGroupResponse> joinSecurityGroup(JoinSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API operation is deprecated. Call <a href="https://help.aliyun.com/document_detail/25503.html">ModifyInstanceAttribute</a> to add or remove an ECS instance from a security group, or call <a href="https://help.aliyun.com/document_detail/58513.html">ModifyNetworkInterfaceAttribute</a> to add or remove an Elastic Network Interface (ENI) from a security group.
     * Notice: Alibaba Cloud adjusted the validation rules for this API operation on July 8, 2024. When you remove an instance or network interface controller (NIC) that is not in the security group, the API operation returns the error code &quot;InvalidSecurityGroupAssociation.NotFound&quot; instead of a success response. Ensure that your application is compatible with this error code to avoid service interruptions.</notice></p>
     * </blockquote>
     * <ul>
     * <li>You cannot remove an instance and an Elastic Network Interface (ENI) from a security group at the same time. Specifically, you cannot specify both the InstanceId and NetworkInterfaceId parameters.</li>
     * <li>Before you remove an instance from a security group, the instance must be in the <strong>Stopped</strong> or <strong>Running</strong> state.  </li>
     * <li>An instance or Elastic Network Interface (ENI) must be added to at least one security group. If the instance or Elastic Network Interface (ENI) is added to only one security group, the removal request fails and returns an error.  </li>
     * <li>If you remove an instance or network interface controller (NIC) that is not in the security group, the removal request fails and returns an error.</li>
     * </ul>
     * 
     * @param request the request parameters of LeaveSecurityGroup  LeaveSecurityGroupRequest
     * @return LeaveSecurityGroupResponse
     */
    CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The Cloud Assistant Agent version on the instance must be at least the following version for the Cloud Assistant plugin status to be queried:<ul>
     * <li>Linux: 2.2.3.344</li>
     * <li>Windows: 2.1.3.344</li>
     * </ul>
     * </li>
     * <li>When performing a paged query for the first page, set only <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response, and set <code>MaxResults</code> to limit the number of entries returned. Settings for paging are handled through these two parameters.</li>
     * </ul>
     * 
     * @param request the request parameters of ListPluginStatus  ListPluginStatusRequest
     * @return ListPluginStatusResponse
     */
    CompletableFuture<ListPluginStatusResponse> listPluginStatus(ListPluginStatusRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Specify at least one of the following parameters in the request to determine the query object.</p>
     * <ul>
     * <li><code>ResourceId.N</code></li>
     * <li><code>Tag.N</code> (<code>Tag.N.Key</code> and <code>Tag.N.Value</code>)</li>
     * <li><code>TagFilter.N</code>
     * If you specify the following parameters at the same time, the response contains only ECS resources that meet both conditions.</li>
     * <li><code>Tag.N</code> and <code>ResourceId.N</code></li>
     * <li><code>TagFilter.N</code> and <code>ResourceId.N</code></li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can also use this operation to reconfigure a locked snapshot. The configurable items depend on the lock mode and lock status:</p>
     * <ul>
     * <li>If the snapshot is locked in compliance mode and is in the cool-off period, you can extend or shorten the cool-off period, or extend or shorten the lock duration.</li>
     * <li>If the snapshot is locked in compliance mode and the cool-off period has expired, you can only extend the lock duration.<blockquote>
     * <p>If you reconfigure a locked snapshot during the cool-off period, the system treats it as a re-lock operation. All lock parameters are reset instead of being adjusted individually.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of LockSnapshot  LockSnapshotRequest
     * @return LockSnapshotResponse
     */
    CompletableFuture<LockSnapshotResponse> lockSnapshot(LockSnapshotRequest request);

    /**
     * <b>description</b> :
     * <p>Before you modify an auto provisioning group, take note of the following items:</p>
     * <ul>
     * <li>If you modify the capacity or capacity-related settings of the group, the group executes a scheduling node after the modification is complete.</li>
     * <li>If the auto provisioning group is being deleted, you cannot modify the group.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAutoProvisioningGroup  ModifyAutoProvisioningGroupRequest
     * @return ModifyAutoProvisioningGroupResponse
     */
    CompletableFuture<ModifyAutoProvisioningGroupResponse> modifyAutoProvisioningGroup(ModifyAutoProvisioningGroupRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, note the following items:</p>
     * <ul>
     * <li>You cannot modify system policies.</li>
     * <li>After you modify an automatic snapshot policy, the disks to which the policy is applied immediately execute the modified automatic snapshot policy.</li>
     * <li>If cross-region replication is enabled for snapshots and encryption parameters are not configured, encrypted snapshots are copied and encrypted by using the service key of the destination region by default.</li>
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
     * <ul>
     * <li>After you enable the auto-renewal feature for a subscription dedicated host, the system automatically renews the host nine days before expiration. The fee is automatically executed at 08:00:00 (UTC+8). If the deduction failed on the previous day, the system retries at the same time the next day. The automatic deduction stops after the fee is successfully deducted or after the dedicated host expires and is locked nine days later. During this period, make sure that your payment method has a sufficient balance.</li>
     * <li>Subscription dedicated hosts support auto-renewal that follows the subscription ECS instances on the host. For more information, see the metric description of the AutoRenewWithEcs parameter.</li>
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
     * <p>You can specify the <code>DiskId</code> parameter to modify attributes such as the name, description, and release-with-instance setting of a single block storage device, or specify the <code>DiskIds.N</code> parameter to modify the attributes of multiple block storage devices in batches.</p>
     * 
     * @param request the request parameters of ModifyDiskAttribute  ModifyDiskAttributeRequest
     * @return ModifyDiskAttributeResponse
     */
    CompletableFuture<ModifyDiskAttributeResponse> modifyDiskAttribute(ModifyDiskAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>Before changing the billing method of a data cloud disk, carefully read <a href="https://help.aliyun.com/document_detail/145018.html">Change the billing method of a cloud disk</a>.
     * When you call this operation, note the following items:</p>
     * <ul>
     * <li>You cannot change the billing method of a data cloud disk mounted on a pay-as-you-go instance. Pay-as-you-go instances only support pay-as-you-go cloud disks.</li>
     * <li>The instance to which the data cloud disk is attached must not be stopped due to expiration.</li>
     * <li>Refunds for the price difference after the billing method is changed are returned to your original payment method. Used vouchers are not refunded.</li>
     * <li>After the billing method of a cloud disk is successfully changed, you cannot change it again within 5 minutes.<br>&lt;props=&quot;china&quot;&gt;- Cloud disks with the multi-attach feature enabled only support the pay-as-you-go billing method and cannot be changed to the subscription billing method.
     * After you change the billing method, automatic payment is enabled by default. You must ensure that your account balance is sufficient. Otherwise, an abnormal order is generated and can only be canceled. If your account balance is insufficient, you can set the AutoPay parameter to false. In this case, a normal unpaid order is generated. You can log on to the Alibaba Cloud <strong>Expenses and Costs</strong> console and pay the order on the &lt;props=&quot;china&quot;&gt;<ph><a href="https://usercenter2.aliyun.com/order/list">My Orders</a></ph>&lt;props=&quot;intl&quot;&gt;<ph><a href="https://usercenter2-intl.aliyun.com/order/list">Orders</a></ph> page.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskChargeType  ModifyDiskChargeTypeRequest
     * @return ModifyDiskChargeTypeResponse
     */
    CompletableFuture<ModifyDiskChargeTypeResponse> modifyDiskChargeType(ModifyDiskChargeTypeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>RAM users require the <code>AliyunECSFullAccess</code> permission. For more information about how to grant Resource Access Management (RAM) user, see <a href="https://help.aliyun.com/document_detail/116146.html">Grant Resource Access Management (RAM) user</a>.</li>
     * <li>You must first call the EnableDiskEncryptionByDefault operation to enable account-level default encryption for block storage in the specified region before you call this operation to modify the default key.</li>
     * <li>If you use a master key for the first time, you must first authorize ECS to assume the <code>AliyunECSDiskEncryptDefaultRole</code> role to allow ECS to access KMS resources. For more information, see <a href="https://help.aliyun.com/document_detail/2838993.html">Grant permissions to access KMS keys by using a RAM role</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskDefaultKMSKeyId  ModifyDiskDefaultKMSKeyIdRequest
     * @return ModifyDiskDefaultKMSKeyIdResponse
     */
    CompletableFuture<ModifyDiskDefaultKMSKeyIdResponse> modifyDiskDefaultKMSKeyId(ModifyDiskDefaultKMSKeyIdRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The dedicated block storage cluster feature is currently available in the China (Hangzhou), China (Shanghai), China (Beijing), China (Zhangjiakou), China (Ulanqab), China (Shenzhen), China (Heyuan), Indonesia (Jakarta), Germany (Frankfurt), and China South 1 Finance regions.
     * Before invoking this operation, make sure that you fully understand the billing methods and pricing of disks and dedicated block storage clusters, the dedicated block storage cluster has not expired, and your account has no overdue payments. For more information, see <a href="https://help.aliyun.com/document_detail/208883.html">Billing of dedicated block storage</a> and <a href="https://help.aliyun.com/document_detail/179022.html">Block storage billing</a>.
     * When you invoke this operation, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>The disk and the dedicated block storage cluster must be in the same zone.</li>
     * <li>Only pay-as-you-go disks are supported. Subscription disks must be switched to the pay-as-you-go billing method first. For more information, see <a href="https://help.aliyun.com/document_detail/145018.html">Change the billing method of a disk</a>.</li>
     * <li>During migration, the disk category must be consistent with the disk categories supported by the destination cluster. When migrating between different dedicated block storage clusters, you can change the disk category to match the disk categories supported by the destination cluster.</li>
     * <li>The disk must be in the <strong>in use</strong> (In_use) or <strong>available</strong> (Available) state.</li>
     * <li>If the disk is attached to an ECS instance, the instance must be in the <strong>running</strong> (Running) or <strong>stopped</strong> (Stopped) state, and the instance must not be expired.</li>
     * <li>Because the ESSD performance level is limited by capacity, if you cannot upgrade the performance level, expand the disk and try again. For more information, see <a href="https://help.aliyun.com/document_detail/25522.html">ResizeDisk</a> and <a href="https://help.aliyun.com/document_detail/122389.html">ESSD</a>.</li>
     * <li>A single account can run up to five disk migration tasks concurrently in the same region.</li>
     * <li>During the migration procedure, operations such as canceling the migration, creating snapshots, changing specifications, expanding the disk, attaching, detaching, and re-initializing the disk are not allowed.<blockquote>
     * <p>After the disk migration, it follows the billing methods, disk category, and capabilities of the destination cluster. The changes take effect immediately after you invoke the operation, and Alibaba Cloud bills the disk based on the new disk category and performance level. For more information, see <a href="https://help.aliyun.com/document_detail/208883.html">Billing of dedicated block storage</a> and <a href="https://help.aliyun.com/document_detail/179022.html">Block storage billing</a>.</p>
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
     * <p>&lt;props=&quot;china&quot;&gt;Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/disk/detail">pricing</a> of disks.
     * To minimize the impact on your business, upgrade or downgrade disks during off-peak hours.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Modify the performance level (PL) of an enterprise SSD:<ul>
     * <li>You can only upgrade the performance level (PL) of a subscription enterprise SSD.</li>
     * <li>You can upgrade or downgrade the performance level (PL) of a pay-as-you-go enterprise SSD, but you cannot downgrade to PL0.</li>
     * <li>The enterprise SSD must be in the <strong>in use</strong> (In_use) or <strong>Available</strong> state.</li>
     * <li>If the enterprise SSD is attached to an ECS instance, the instance must be in the <strong>Running</strong> or <strong>Stopped</strong> state, and cannot be expired or have an overdue payment.</li>
     * <li>The ESSD performance level is limited by capacity. If you cannot upgrade the performance level (PL), you can expand the disk (<a href="https://help.aliyun.com/document_detail/25522.html">ResizeDisk</a>) and try again. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">enterprise SSD</a>.</li>
     * </ul>
     * </li>
     * <li>For precautions on changing the category of a disk, see <a href="~~161980#section_s4a_to0_1jx~~">Change the category of a disk</a>.</li>
     * <li>For information about the disk categories that support specification changes, see <a href="~~161980#eb8bb54032nho~~">Disk categories that support specification changes</a>.
     * &lt;props=&quot;china&quot;&gt;* Disks with the multi-attach attribute enabled do not support specification changes.
     * After the specifications of a disk are changed, the billing changes are as follows:</li>
     * <li>Pay-as-you-go disks: Billed based on the new disk category.</li>
     * <li>Subscription disks: Within the billing cycle, the supplementary fee is calculated based on the price difference between the new and old configurations and the remaining days (from 00:00 the next day to the end of the validity period).
     * For more information about disk billing, see <a href="https://help.aliyun.com/document_detail/179022.html">Block storage billing</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskSpec  ModifyDiskSpecRequest
     * @return ModifyDiskSpecResponse
     */
    CompletableFuture<ModifyDiskSpecResponse> modifyDiskSpec(ModifyDiskSpecRequest request);

    /**
     * @deprecated OpenAPI ModifyEipAddressAttribute is deprecated, please use Vpc::2016-04-28::ModifyEipAddressAttribute instead.  * @param request  the request parameters of ModifyEipAddressAttribute  ModifyEipAddressAttributeRequest
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
     * @deprecated OpenAPI ModifyForwardEntry is deprecated, please use Vpc::2016-04-28::ModifyForwardEntry instead.  * @param request  the request parameters of ModifyForwardEntry  ModifyForwardEntryRequest
     * @return ModifyForwardEntryResponse
     */
    @Deprecated
    CompletableFuture<ModifyForwardEntryResponse> modifyForwardEntry(ModifyForwardEntryRequest request);

    /**
     * @deprecated OpenAPI ModifyHaVipAttribute is deprecated, please use Vpc::2016-04-28::ModifyHaVipAttribute instead.  * @param request  the request parameters of ModifyHaVipAttribute  ModifyHaVipAttributeRequest
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
     * <p>Before you call this operation, read <a href="https://help.aliyun.com/document_detail/25463.html">Share a custom image</a>.
     * When you call this operation, take note of the following sharing rules:</p>
     * <ul>
     * <li><strong>Sharing limits</strong>: You can share only custom images that you created under your account. Each image can be shared with up to 50 Alibaba Cloud accounts, and up to 10 Alibaba Cloud accounts at a time.</li>
     * <li><strong>Impact on instances</strong>: After an ECS instance is created from a shared image by calling <a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a>, if the image owner cancels the image sharing or deletes the custom image (<a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a>), the instance cannot reinitialize its system disk (<a href="https://help.aliyun.com/document_detail/25519.html">ReInitDisk</a>).<blockquote>
     * <p>Notice: Rule change for sharing encrypted images in Elastic Compute Service (ECS): Only images encrypted with a customer master key (CMK) can be shared. Images encrypted with a service key can no longer be shared and will return an error during sharing. If you have images encrypted with a service key and plan to share them, use the copy image operation (CopyImage) to change the encryption key to a CMK.
     * To publish or unpublish community images, take note of the following:</p>
     * </blockquote>
     * </li>
     * <li><strong>Responsibilities and agreements</strong>: Community image owners are responsible for the quality and iterative updates of their images. Alibaba Cloud provides only platform support. Before publishing, make sure that you have read and signed the community image agreement. Otherwise, publishing is not allowed. For more information, see <a href="https://help.aliyun.com/document_detail/208370.html">Publish a community image</a>.</li>
     * <li><strong>Encryption limits</strong>: Encrypted images cannot be published as community images.</li>
     * <li><strong>Public access</strong>: Community images are fully public. All Alibaba Cloud accounts in the region where the image resides can use the image.</li>
     * <li><strong>Feature limits</strong>: Community images do not support sharing, export, or copy.</li>
     * <li><strong>Impact of unpublishing</strong>: After a community image is unpublished, it is no longer publicly available to other Alibaba Cloud accounts. However, existing sharing relationships are retained.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyImageSharePermission  ModifyImageSharePermissionRequest
     * @return ModifyImageSharePermissionResponse
     */
    CompletableFuture<ModifyImageSharePermissionResponse> modifyImageSharePermission(ModifyImageSharePermissionRequest request);

    /**
     * <b>description</b> :
     * <p>A private pool is generated after an elasticity assurance or capacity reservation is created. The private pool is associated with instance information that matches the private pool. When you create an instance, you can specify whether to use a private pool to launch the instance. The instance is then matched with an elasticity assurance or capacity reservation.</p>
     * <ul>
     * <li>After you call this operation to modify the private pool attributes of an instance, you do not need to restart the instance.</li>
     * <li>When you call the following operations, the system re-matches the private pool of the instance. If the instance has already been matched with a specified private pool, the call may fail because the private pool capacity is exhausted or the private pool has expired. If the call fails, call the ModifyInstanceAttachmentAttributes operation to change the private pool matching mode to <code>Open</code>.<ul>
     * <li><a href="https://help.aliyun.com/document_detail/2679679.html">StartInstance - Restart an instance that has the economical mode enabled.</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2679707.html">ReActivateInstances - Restart an expired or overdue instance.</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2679704.html">ModifyInstanceChargeType - Change the billing method of an instance.</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2679706.html">ModifyPrepayInstanceSpec - Upgrade or downgrade the instance type of an instance.</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2679771.html">ReplaceSystemDisk - Replace the operating system.</a></li>
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
     * <p>You cannot call this operation on a security-locked instance. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impact of resource security locks on API calls</a>.</p>
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
     * <p><em>Before you invoke this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/ecs#pricing">pricing</a> of Elastic Compute Service (ECS).</em>*</p>
     * <ul>
     * <li>Make sure that your account balance or credit limit is sufficient.</li>
     * <li>Only subscription instances are supported. Invoking this operation for pay-as-you-go instances returns an error.</li>
     * <li>Auto-renewal deduction occurs on the ninth day before the instance expires. Deduction starts to execute at 08:00:00 (UTC+8).</li>
     * <li>If the auto-renewal deduction failed on the previous day, the system retries the deduction at the scheduled time on the next day until the deduction succeeds or the instance is locked after 9 days.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>If the purchase duration of a new instance is one week, the auto-renewal deduction is performed on the first day after the instance is created.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceAutoRenewAttribute  ModifyInstanceAutoRenewAttributeRequest
     * @return ModifyInstanceAutoRenewAttributeResponse
     */
    CompletableFuture<ModifyInstanceAutoRenewAttributeResponse> modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/56220.html">subscription</a>, <a href="https://help.aliyun.com/document_detail/40653.html">pay-as-you-go</a>, and other billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/ecs#pricing">pricing</a> of Elastic Compute Service (ECS).</li>
     * <li>Make sure that the target instances are in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state and that your account has no overdue payments.</li>
     * <li>After the billing method is changed, automatic payment is enabled by default. Make sure that your account balance is sufficient. Otherwise, abnormal orders are generated, and you can only cancel the orders. If your account balance is insufficient, you can set the <code>AutoPay</code> parameter to <code>false</code>. In this case, unpaid orders are generated, and you can log on to the <a href="https://ecs.console.aliyun.com/">ECS console</a> to complete the payment.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li><strong>Subscription to pay-as-you-go</strong>:
     * &lt;props=&quot;china&quot;&gt;<ul>
     * <li>When you convert a subscription instance to a pay-as-you-go instance, the new billing method overwrites the instance for its entire lifecycle. The price difference is refunded to your original payment method. Vouchers that have been redeemed are not refundable.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>When you convert a subscription instance to a pay-as-you-go instance, the new billing method overwrites the instance for its entire lifecycle. The price difference is refunded to your original payment method. Vouchers that have been redeemed are not refundable.</li>
     * <li><strong>Refund rules</strong>: The refund amount that you can claim each month is limited and does not carry over to the next month. After the refund quota is exhausted, you must wait until the next month to switch between billing methods. The refund quota consumed by each billing method change is calculated by using the following formula: <strong>vCPUs × (Refund days × 24 ± Floating hours)</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/85517.html">Change the billing method from subscription to pay-as-you-go</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Pay-as-you-go to subscription</strong>:<ul>
     * <li>All pay-as-you-go data disks attached to the instance can be converted to subscription data disks at the same time.</li>
     * <li>If a release time is set for the pay-as-you-go instance, you cannot call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/49884.html">Change the billing method from subscription to pay-as-you-go</a>.</li>
     * <li>If the instance is in economical mode, start the instance first.</li>
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
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>This operation is asynchronous. After you call this operation, an asynchronous task ID is returned. You can query the asynchronous task result to check whether the task is completed.</li>
     * <li>To modify PtpStatus, the instance type must support this parameter. For more information about supported instance types, call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation to query the instance type list.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceClockOptions  ModifyInstanceClockOptionsRequest
     * @return ModifyInstanceClockOptionsResponse
     */
    CompletableFuture<ModifyInstanceClockOptionsResponse> modifyInstanceClockOptions(ModifyInstanceClockOptionsRequest request);

    /**
     * <b>description</b> :
     * <p>When you migrate an ECS instance to a dedicated host or change the ECS instance type during the migration, the following conditions must be met:</p>
     * <ul>
     * <li>The ECS instance must be in the <strong>Stopped</strong> state. The instance automatically restarts after the migration.</li>
     * <li>Only ECS instances in a virtual private cloud (VPC) are supported.</li>
     * <li>The ECS instance and the dedicated host must belong to the same account, region, and zone.</li>
     * <li>Pay-as-you-go ECS instances can be migrated to subscription dedicated hosts. Subscription ECS instances can only be migrated between subscription dedicated hosts, and the time when the instance expires cannot be later than the expiration time of the destination dedicated host.</li>
     * <li>When you migrate an ECS instance from a shared host to a dedicated host, the billing method of the instance must be pay-as-you-go. Subscription instances and spot instances are not supported.</li>
     * <li>You can specify a dedicated host cluster for the deployment of ECS instances.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceDeployment  ModifyInstanceDeploymentRequest
     * @return ModifyInstanceDeploymentResponse
     */
    CompletableFuture<ModifyInstanceDeploymentResponse> modifyInstanceDeployment(ModifyInstanceDeploymentRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the maintenance policy of an instance. The policy contains two maintenance properties:</p>
     * <ul>
     * <li>Maintenance time window: A time period that you specify. Maintenance is performed only within this period.</li>
     * <li>Maintenance action: The action that you specify to handle instance downtime.</li>
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
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>This operation is asynchronous. After the call, an asynchronous task ID is returned. You can query the asynchronous task result to determine whether the task is completed.</li>
     * <li>You can modify only one attribute per call. To modify multiple attributes, make multiple calls.</li>
     * <li>To modify BandwidthWeighting, the instance type must support this parameter. You can call <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to check whether the instance type supports bandwidth weighting and the supported values.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceNetworkOptions  ModifyInstanceNetworkOptionsRequest
     * @return ModifyInstanceNetworkOptionsResponse
     */
    CompletableFuture<ModifyInstanceNetworkOptionsResponse> modifyInstanceNetworkOptions(ModifyInstanceNetworkOptionsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>When you modify the bandwidth configuration of a subscription (PrePaid) instance and the outbound public bandwidth (InternetMaxBandwidthOut) is upgraded from 0 Mbit/s to a non-zero value, a public IP address is automatically assigned.</p>
     * </li>
     * <li><p>When you modify the bandwidth configuration of a pay-as-you-go (PostPaid) instance and the outbound public bandwidth (InternetMaxBandwidthOut) is upgraded from 0 Mbit/s to a non-zero value, a public IP address is not automatically assigned. Set the <code>AllocatePublicIp</code> parameter to <code>true</code> to assign a public IP address.</p>
     * <blockquote>
     * <p>In a single region, the total peak pay-by-bandwidth public bandwidth for a single Alibaba Cloud account is limited. For more information, see <a href="~~25412#BandwidthQuota~~">Public bandwidth limits</a>.</p>
     * </blockquote>
     * </li>
     * <li><p>Fees:</p>
     * <ul>
     * <li>After the bandwidth is upgraded, fees are automatically deducted by default. Make sure that your payment method has a sufficient balance. Otherwise, an abnormal order is generated, and you can only void the order. If your account balance is insufficient, set the AutoPay parameter to false. A normal unpaid order is generated, and you can log on to the ECS console to complete the payment.</li>
     * <li>After the bandwidth is downgraded, the price difference is refunded to the original payment method. Used vouchers are not refunded.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceNetworkSpec  ModifyInstanceNetworkSpecRequest
     * @return ModifyInstanceNetworkSpecResponse
     */
    CompletableFuture<ModifyInstanceNetworkSpecResponse> modifyInstanceNetworkSpec(ModifyInstanceNetworkSpecRequest request);

    /**
     * @param request the request parameters of ModifyInstanceSecurityOptions  ModifyInstanceSecurityOptionsRequest
     * @return ModifyInstanceSecurityOptionsResponse
     */
    CompletableFuture<ModifyInstanceSecurityOptionsResponse> modifyInstanceSecurityOptions(ModifyInstanceSecurityOptionsRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of ECS.</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of ECS.</strong>
     * Before you <a href="https://help.aliyun.com/document_detail/60051.html">change the instance type of a pay-as-you-go instance</a>, you can call <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> to query the instance types to which the current instance can be changed.
     * <strong>Precautions</strong></p>
     * <ul>
     * <li>Your account must have no overdue payments.</li>
     * <li>You can modify only one configuration item each time you invoke the operation. Specifically, you can only modify the instance type or adjust the Internet bandwidth when you invoke the operation.</li>
     * <li>The instance status must be <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) when you adjust the Internet bandwidth. The modification takes effect immediately.</li>
     * <li>The instance status must be <strong>Stopped</strong> (<code>Stopped</code>) when you modify the instance type. The modification takes effect after you <a href="https://help.aliyun.com/document_detail/25441.html">start the instance</a>.<blockquote>
     * <p>In a single region, the sum of the peak Internet bandwidth values of all instances that use the pay-by-bandwidth billing method within a single Alibaba Cloud account is limited. For more information, see <a href="~~25412#BandwidthQuota~~">Internet bandwidth limits</a>.</p>
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
     * <ul>
     * <li>The password must be six characters in length and can contain only uppercase letters, lowercase letters, and digits. All three character types are required.</li>
     * <li>After you modify the password:<ul>
     * <li>For I/O optimized instances, the new password takes effect immediately without the need to restart the instance.</li>
     * <li>For non-I/O optimized instances, you must <a href="https://help.aliyun.com/document_detail/25440.html">restart the instance</a> in the console or call <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> for the new password to take effect.</li>
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
     * <p>When you call this operation, the ECS instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</p>
     * <ul>
     * <li>When you modify the private IP address or vSwitch of an instance, note the following:<ul>
     * <li>A newly created ECS instance must be restarted before you can call this operation.</li>
     * <li>After a successful modification, the ECS instance must be restarted before you can call this operation again.</li>
     * </ul>
     * </li>
     * <li>When you modify the VPC of an instance, note the following:<ul>
     * <li><p><strong>Instance:</strong></p>
     * <ul>
     * <li>Instance status: The instance cannot be in the locked, pending release, expired, expiring, or overdue payment states. For more information, see <a href="https://help.aliyun.com/document_detail/25380.html">Instance lifetime</a>.</li>
     * <li>ECS instances associated with a load balancing instance are not supported.</li>
     * <li>The instance cannot be in use by other cloud services. For example, the instance cannot be undergoing migration, cannot already be switching VPCs, and databases deployed on the instance cannot be managed by DTS.</li>
     * </ul>
     * </li>
     * <li><p><strong>Network:</strong></p>
     * <ul>
     * <li>Instances configured with EIP-visible mode or multi-EIP-visible mode on their Elastic Network Interfaces (ENIs) are not supported.</li>
     * <li>Instances attached to a High Availability Virtual IP (HaVip) are not supported.</li>
     * <li>Instances whose vSwitch is attached to a custom route table are not supported.</li>
     * <li>Instances with Global Accelerator (GA) enabled are not supported.</li>
     * <li>Instances attached to secondary Elastic Network Interfaces (ENIs) are not supported.</li>
     * <li>Instances with IPv6 addresses allocated are not supported.</li>
     * <li>Instances whose primary network interface controller (NIC) has multiple IP addresses are not supported.</li>
     * <li>The specified vSwitch must belong to the target VPC.</li>
     * <li>The zone of the vSwitch must remain the same before and after the modification.</li>
     * <li>If you specify a private IP for the primary network interface controller (NIC), the IP address must be within the vSwitch CIDR block and available. If you do not specify one, an IP address is randomly allocated, and the target vSwitch must have sufficient available IP addresses.</li>
     * <li>If you are using a VPC shared with you by another account, make sure that the target security group is created by your account in the shared VPC, not by the VPC owner\&quot;s account.</li>
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
     * <ul>
     * <li>You can modify scheduled tasks with the following execution modes (see the RepeatMode value returned by <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocations</a>):<ul>
     * <li>Period: periodic execution.</li>
     * <li>NextRebootOnly: automatically executes the command the next time the instance starts.</li>
     * <li>EveryReboot: automatically executes the command each time the instance starts.</li>
     * </ul>
     * </li>
     * <li>You can modify scheduled tasks in the following states (see the InvocationStatus value returned by <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocations</a>):<ul>
     * <li>Pending: The system is verifying or sending the command. If the command execution state on at least one instance is Pending, the overall execution state is Pending.</li>
     * <li>Running: The command is running on the instance. If the command execution state on at least one instance is Running, the overall execution state is Running.</li>
     * <li>Scheduled: The scheduled command has been sent and is waiting to run. If the command execution state on at least one instance is Scheduled, the overall execution state is Scheduled.</li>
     * <li>Stopping: The scheduled task is being stopped. If the command execution state on at least one instance is Stopping, the overall execution state is Stopping.</li>
     * </ul>
     * </li>
     * <li>Before modifying scheduled task execution information (including command content, custom parameters, and execution frequency), the Cloud Assistant Agent version on the ECS instances or managed instances that have already executed the scheduled task must be later than the following versions:<ul>
     * <li>Linux: 2.2.3.541</li>
     * <li>Windows: 2.1.3.541</li>
     * <li>If the call result returns the <code>InvalidOperation.CloudAssistantVersionUnsupported</code> error code, update the Cloud Assistant Agent to the latest version.</li>
     * </ul>
     * </li>
     * <li>When you execute a Cloud Assistant common command, you cannot modify the command content CommandContent.</li>
     * <li>When you modify the command content CommandContent, and the scheduled task was created by calling <a href="https://help.aliyun.com/document_detail/64841.html">InvokeCommand</a> or <a href="https://help.aliyun.com/document_detail/141751.html">RunCommand</a> with KeepCommand set to true, a new command is created and retained permanently, which counts toward your Cloud Assistant command quota. You can retain up to 500 to 50,000 Cloud Assistant commands per region. You can also request a quota increase. For information about how to query and increase quotas, see <a href="https://help.aliyun.com/document_detail/184116.html">Quota management</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInvocationAttribute  ModifyInvocationAttributeRequest
     * @return ModifyInvocationAttributeResponse
     */
    CompletableFuture<ModifyInvocationAttributeResponse> modifyInvocationAttribute(ModifyInvocationAttributeRequest request);

    /**
     * @param request the request parameters of ModifyLaunchTemplateDefaultVersion  ModifyLaunchTemplateDefaultVersionRequest
     * @return ModifyLaunchTemplateDefaultVersionResponse
     */
    CompletableFuture<ModifyLaunchTemplateDefaultVersionResponse> modifyLaunchTemplateDefaultVersion(ModifyLaunchTemplateDefaultVersionRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Currently, you can call the ModifyManagedInstance operation only to modify the name of a managed instance.</p>
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
     * @deprecated OpenAPI ModifyPhysicalConnectionAttribute is deprecated, please use Vpc::2016-04-28::ModifyPhysicalConnectionAttribute instead.  * @param request  the request parameters of ModifyPhysicalConnectionAttribute  ModifyPhysicalConnectionAttributeRequest
     * @return ModifyPhysicalConnectionAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyPhysicalConnectionAttributeResponse> modifyPhysicalConnectionAttribute(ModifyPhysicalConnectionAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>Modifies the attributes of an O&amp;M window. When the TargetResource parameter of the O&amp;M window is configured to associate ECS instances and underlying hardware risks occur that require scheduled O&amp;M for mitigation, the execution time of the scheduled O&amp;M is determined by the time range specified in the TimePeriod parameter of the O&amp;M window. When the execution time of an O&amp;M event arrives, the platform automatically performs the corresponding O&amp;M operations based on the type of the O&amp;M event.</p>
     * 
     * @param request the request parameters of ModifyPlanMaintenanceWindow  ModifyPlanMaintenanceWindowRequest
     * @return ModifyPlanMaintenanceWindowResponse
     */
    CompletableFuture<ModifyPlanMaintenanceWindowResponse> modifyPlanMaintenanceWindow(ModifyPlanMaintenanceWindowRequest request);

    /**
     * @param request the request parameters of ModifyPortRangeList  ModifyPortRangeListRequest
     * @return ModifyPortRangeListResponse
     */
    CompletableFuture<ModifyPortRangeListResponse> modifyPortRangeList(ModifyPortRangeListRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>The specified Classless Inter-Domain Routing (CIDR) blocks must be in standard form. For example, 10.0.0.0/8 is a valid CIDR block, whereas 10.0.0.1/8 is a fault form. For more information, see <a href="~~40637#section-jua-0tj-q5m~~">What is CIDR?</a>.</li>
     * <li>When you add or delete entries, you cannot specify duplicate CIDR blocks. Examples:<ul>
     * <li>For IPv4 CIDR blocks: You cannot specify two entries that both have the CIDR block 10.0.0.0/8. You cannot specify two entries whose CIDR blocks are 10.0.0.1/32 and 10.0.0.1 respectively because these two CIDR blocks are duplicates.</li>
     * <li>For IPv6 CIDR blocks: You cannot specify two entries whose CIDR blocks are 2001:fd01:0:0:0:0:0:0/32 and 2001:fd01::/32 respectively because these two CIDR blocks are duplicates.</li>
     * </ul>
     * </li>
     * <li>The CIDR blocks of entries to be added cannot be the same as those of entries to be deleted. For example, when you add an entry whose CIDR block is 10.0.0.0/8, the entries to be deleted cannot contain the CIDR block 10.0.0.0/8.</li>
     * <li>To modify the description of an entry, specify the CIDR block of the entry (<code>AddEntry.N.Cidr</code>) and the new description (<code>AddEntry.N.Description</code>).</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyPrefixList  ModifyPrefixListRequest
     * @return ModifyPrefixListResponse
     */
    CompletableFuture<ModifyPrefixListResponse> modifyPrefixList(ModifyPrefixListRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Before calling this operation, make sure that you fully understand the billing methods, <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a>, and <a href="https://help.aliyun.com/document_detail/116043.html">refund rules for downgrades</a> of Elastic Compute Service (ECS).</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Before calling this operation, make sure that you fully understand the billing methods, <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a>, and <a href="https://help.aliyun.com/document_detail/476339.html">refund rules for downgrades</a> of Elastic Compute Service (ECS).</strong>
     * This operation is asynchronous. Wait 5 to 10 seconds for the configuration change to complete. Before upgrading or downgrading ECS instance type of a subscription ECS instance, you can call the <a href="https://help.aliyun.com/document_detail/2679954.html">DescribeResourcesModification</a> operation to query ECS instance types available for the current instance.
     * <strong>Precautions</strong></p>
     * <ul>
     * <li>If the NVMe property of the original instance type is different from that of the target instance type (the <code>NvmeSupport</code> field in <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a>) and the operating system is Windows (the <code>OSType</code> field in <a href="https://help.aliyun.com/document_detail/2679689.html">DescribeInstances</a>), you must complete the operations described in <a href="~~2978777#7de04a1c9fo50~~">Preventive measures</a> before you upgrade or downgrade the instance type.</li>
     * <li>You cannot modify the instance type of an expired instance. You can renew the instance and try again.</li>
     * <li>Downgrade the instance type:<ul>
     * <li>The instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>The price difference between the original and new instance types is refunded to your original payment method. Used vouchers are not refunded.</li>
     * <li>The new instance type takes effect after you <a href="https://help.aliyun.com/document_detail/25441.html">start the instance</a>.</li>
     * </ul>
     * </li>
     * <li>Upgrade the instance type: <ul>
     * <li>The instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) or <strong>Running</strong> (<code>Running</code>) state.</li>
     * <li>The new instance type takes effect after you <a href="https://help.aliyun.com/document_detail/25441.html">start the instance</a> or <a href="https://help.aliyun.com/document_detail/25440.html">restart the instance</a>.</li>
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
     * <p>This is an asynchronous operation. After a successful call, the IDs of the new reserved instances are returned. The original reserved instances enter the <code>Updating</code> state and eventually become <code>Expired</code>. At the same time, new reserved instances in the Creating state are generated and eventually become Active. You can call <a href="https://help.aliyun.com/document_detail/2679781.html">DescribeReservedInstances</a> to query the status.</p>
     * <ul>
     * <li>Reserved instances can be modified only when they are in the <strong>Active</strong> state.</li>
     * <li>Ensure that the <a href="~~140660#2742f3844abzz~~">normalization factor</a> remains unchanged before and after the modification. Otherwise, the request fails.</li>
     * <li>Splitting, merging, and scope changes of reserved instances cannot be performed simultaneously.
     * For more information, see <a href="https://help.aliyun.com/document_detail/100375.html">Split, merge, or modify reserved instances</a>.</li>
     * </ul>
     * <h2>Request examples</h2>
     * <ul>
     * <li><strong>Split</strong>: Split a reserved instance in the China (Hangzhou) region with instance type ecs.g5.xlarge and a quantity of 2 into two reserved instances with instance type ecs.g5.large and a quantity of 1 each.</li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;:&quot;ap-southeast-1&quot;, // Set the region
     * &quot;ReservedInstanceId&quot;:[&quot;ecsri-bp1hd03e9uv19e75****&quot;], // ID of the reserved instance to split
     * &quot;Configuration&quot;:[
     *   {
     *     &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName1&quot;, // Name of the new reserved instance
     *     &quot;InstanceType&quot;:&quot;ecs.g5.large&quot;, // Set the new instance type
     *     &quot;Scope&quot;:&quot;Region&quot;, // The scope of the reserved instance cannot be changed
     *     &quot;InstanceAmount&quot;:1 // The reserved instance can match 1 pay-as-you-go instance of the same type
     *   },
     *   {
     *     &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName2&quot;,
     *     &quot;InstanceType&quot;:&quot;ecs.g5.large&quot;,
     *     &quot;Scope&quot;:&quot;Region&quot;,
     *     &quot;InstanceAmount&quot;:1
     *   }
     * ]
     * </code></pre>
     * <ul>
     * <li><strong>Merge</strong>: Merge two reserved instances in Zone H of the China (Hangzhou) region with instance type ecs.g5.xlarge and a quantity of 4 into one reserved instance with instance type ecs.g5.4xlarge and a quantity of 2.</li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;:&quot;ap-southeast-1&quot;, // Set the region
     * &quot;ReservedInstanceId&quot;:[&quot;ecsri-bp1hd03e9uv16b75****&quot;,&quot;&quot;ecsri-bp1hd03e9uv16b76****&quot;&quot;], // IDs of the reserved instances to merge
     * &quot;Configuration&quot;:[
     *   {
     *     &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName&quot;, // Name of the new reserved instance
     *     &quot;InstanceType&quot;:&quot;ecs.g5.4xlarge&quot;, // Set the new instance type
     *     &quot;Scope&quot;:&quot;Zone&quot;, // The scope of the reserved instance cannot be changed
     *     &quot;ZoneId&quot;:&quot;ap-southeast-1a&quot;, //
     *     &quot;InstanceAmount&quot;:2 // The reserved instance can match 2 pay-as-you-go instances of the same type
     *   }
     * ]
     * </code></pre>
     * <ul>
     * <li><strong>Change scope</strong>: Change a reserved instance in Zone H of the China (Hangzhou) region with instance type ecs.g5.xlarge and a quantity of 6 to a region-level reserved instance in the China (Hangzhou) region with instance type ecs.g5.2xlarge and a quantity of 3.</li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;:&quot;ap-southeast-1&quot;, // Set the region
     * &quot;ReservedInstanceId&quot;:[&quot;ecsri-bp1hd03e9uv16b77****&quot;], // ID of the reserved instance whose scope you want to change
     * &quot;Configuration&quot;:[
     *   {
     *     &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName&quot;, // Name of the reserved instance after the scope change
     *     &quot;InstanceType&quot;:&quot;ecs.g5.2xlarge&quot;, // Set the new instance type
     *     &quot;Scope&quot;:&quot;Region&quot;, // The scope of the reserved instance after the change
     *     &quot;InstanceAmount&quot;:3 // The reserved instance can match 3 pay-as-you-go instances of the same type
     *   }
     * ]
     * </code></pre>
     * 
     * @param request the request parameters of ModifyReservedInstances  ModifyReservedInstancesRequest
     * @return ModifyReservedInstancesResponse
     */
    CompletableFuture<ModifyReservedInstancesResponse> modifyReservedInstances(ModifyReservedInstancesRequest request);

    /**
     * @deprecated OpenAPI ModifyRouterInterfaceAttribute is deprecated, please use Vpc::2016-04-28::ModifyRouterInterfaceAttribute instead.  * @param request  the request parameters of ModifyRouterInterfaceAttribute  ModifyRouterInterfaceAttributeRequest
     * @return ModifyRouterInterfaceAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyRouterInterfaceAttributeResponse> modifyRouterInterfaceAttribute(ModifyRouterInterfaceAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyRouterInterfaceSpec is deprecated, please use Vpc::2016-04-28::ModifyRouterInterfaceSpec instead.  * @param request  the request parameters of ModifyRouterInterfaceSpec  ModifyRouterInterfaceSpecRequest
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
     * <p>When you modify security group rules by specifying the security group rule ID, take note of the following limits:</p>
     * <ul>
     * <li>The authorization object of a security group rule can be an IPv4 Classless Inter-Domain Routing (or IP address), an IPv6 Classless Inter-Domain Routing (or IP address), a security group, or a prefix list. You cannot change the type of the authorization object for an existing security group rule by calling this operation. For example, if the original authorization object type is an IPv4 Classless Inter-Domain Routing, you can change it to another IPv4 Classless Inter-Domain Routing (or IP address), but you cannot change it to an IPv6 Classless Inter-Domain Routing (or IP address), a security group, or a prefix list.</li>
     * <li>Fields cannot be changed from a non-empty value to an empty value. To clear a field, first increase a new rule and then delete the current rule.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupEgressRule  ModifySecurityGroupEgressRuleRequest
     * @return ModifySecurityGroupEgressRuleResponse
     */
    CompletableFuture<ModifySecurityGroupEgressRuleResponse> modifySecurityGroupEgressRule(ModifySecurityGroupEgressRuleRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Advanced security groups do not support modifying the intra-group connectivity policy. The default policy is <strong>internal isolation</strong>.</li>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/25555.html">DescribeSecurityGroupAttribute</a> to query the current intra-group connectivity policy of a security group.</li>
     * <li>If the intra-group connectivity policy of a security group is <strong>intra-group connectivity</strong>, other custom access rules are ignored, and all instances in custom security group are connected over the internal network by default.  </li>
     * <li>If the intra-group connectivity policy of a security group is <strong>internal isolation</strong>, all instances in custom security group are disconnected over the internal network by default when no other access rules are added. However, you can customize security group rules to change the internal network status. For example, you can call <a href="https://help.aliyun.com/document_detail/25554.html">AuthorizeSecurityGroup</a> to allow two ECS instances in custom security group to communicate with each other over the internal network.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupPolicy  ModifySecurityGroupPolicyRequest
     * @return ModifySecurityGroupPolicyResponse
     */
    CompletableFuture<ModifySecurityGroupPolicyResponse> modifySecurityGroupPolicy(ModifySecurityGroupPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>When you modify security group rules by specifying the security group rule ID, take note of the following limits:</p>
     * <ul>
     * <li>The authorization object of a security group rule can be an IPv4 CIDR block (or IP address), an IPv6 CIDR block (or IP address), a security group, or a prefix list. You cannot change the authorization object type for an existing security group rule by calling this operation. For example, if the original authorization object type is an IPv4 CIDR block, you can change it to another IPv4 CIDR block (or IP address), but you cannot change it to an IPv6 CIDR block (or IP address), a security group, or a prefix list.</li>
     * <li>You cannot change a field from a non-empty value to an empty value. To make such a change, add a new rule and then delete the current rule.</li>
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
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product?#/disk/detail/disk">pricing</a> of archive snapshots.</strong></p>
     * <ul>
     * <li>Archive snapshots cannot be restored to standard snapshots.</li>
     * <li>A standard snapshot must be retained for at least 14 days after it is created before it can be archived.</li>
     * <li>Shared snapshots, snapshots managed by other Alibaba Cloud services, and snapshots in CloudBox cannot be archived.</li>
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>You can modify only scheduled O&amp;M events that are in the Scheduled state.</li>
     * <li>The specified NotBefore time cannot be earlier than the current time.</li>
     * <li>The specified NotBefore time cannot be later than the initial scheduled execution time when the event was generated.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySystemEventAttribute  ModifySystemEventAttributeRequest
     * @return ModifySystemEventAttributeResponse
     */
    CompletableFuture<ModifySystemEventAttributeResponse> modifySystemEventAttribute(ModifySystemEventAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyUserBusinessBehavior is deprecated  * @param request  the request parameters of ModifyUserBusinessBehavior  ModifyUserBusinessBehaviorRequest
     * @return ModifyUserBusinessBehaviorResponse
     */
    @Deprecated
    CompletableFuture<ModifyUserBusinessBehaviorResponse> modifyUserBusinessBehavior(ModifyUserBusinessBehaviorRequest request);

    /**
     * @deprecated OpenAPI ModifyVRouterAttribute is deprecated, please use Vpc::2016-04-28::ModifyVRouterAttribute instead.  * @param request  the request parameters of ModifyVRouterAttribute  ModifyVRouterAttributeRequest
     * @return ModifyVRouterAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyVRouterAttributeResponse> modifyVRouterAttribute(ModifyVRouterAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyVSwitchAttribute is deprecated, please use Vpc::2016-04-28::ModifyVSwitchAttribute instead.  * @param request  the request parameters of ModifyVSwitchAttribute  ModifyVSwitchAttributeRequest
     * @return ModifyVSwitchAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyVSwitchAttributeResponse> modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyVirtualBorderRouterAttribute is deprecated, please use Vpc::2016-04-28::ModifyVirtualBorderRouterAttribute instead.  * @param request  the request parameters of ModifyVirtualBorderRouterAttribute  ModifyVirtualBorderRouterAttributeRequest
     * @return ModifyVirtualBorderRouterAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyVirtualBorderRouterAttributeResponse> modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request);

    /**
     * @deprecated OpenAPI ModifyVpcAttribute is deprecated, please use Vpc::2016-04-28::ModifyVpcAttribute instead.  * @param request  the request parameters of ModifyVpcAttribute  ModifyVpcAttributeRequest
     * @return ModifyVpcAttributeResponse
     */
    @Deprecated
    CompletableFuture<ModifyVpcAttributeResponse> modifyVpcAttribute(ModifyVpcAttributeRequest request);

    /**
     * @param request the request parameters of OpenSnapshotService  OpenSnapshotServiceRequest
     * @return OpenSnapshotServiceResponse
     */
    CompletableFuture<OpenSnapshotServiceResponse> openSnapshotService(OpenSnapshotServiceRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of reserved instances.</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of reserved instances.</strong></p>
     * <ul>
     * <li>Before you call this operation, make sure that you fully understand the billing rules of reserved instances. For more information, see <a href="https://help.aliyun.com/document_detail/100371.html">Reserved instances</a>.</li>
     * <li>You can hold up to 20 regional reserved instances across all regions.</li>
     * <li>You can hold up to 20 zonal reserved instances in each zone.</li>
     * </ul>
     * <h2>Request examples</h2>
     * <ul>
     * <li>Purchase a one-year regional reserved instance in the China (Hangzhou) region to offset bills of three pay-as-you-go instances of the ecs.g5.large instance type that run Linux.</li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;:&quot;cn-hangzhou&quot;, // Set the region to China (Hangzhou).
     * &quot;InstanceType&quot;:&quot;ecs.g5.large&quot;, // Set the instance type.
     * &quot;Scope&quot;:&quot;Region&quot;, // Set the scope of the reserved instance to regional.
     * &quot;InstanceAmount&quot;:3, // The reserved instance can match three pay-as-you-go instances of the same instance type.
     * &quot;OfferingType&quot;:&quot;All Upfront&quot;, // Default value. The payment type is all upfront.
     * &quot;Platform&quot;:&quot;Linux&quot;, // The operating system type of the image used by the instance is Linux or Unix-like.
     * &quot;Period&quot;:1, // The term of the reserved instance is one year.
     * &quot;PeriodUnit&quot;:&quot;Year&quot;, // Set the unit of the term to year.
     * </code></pre>
     * <ul>
     * <li>Purchase a two-year zonal reserved instance in Zone H of the China (Hangzhou) region to offset bills of five pay-as-you-go instances of the ecs.g5.large instance type that run Windows.</li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,
     * &quot;ZoneId&quot;:&quot;cn-hangzhou-h&quot;, // Set the zone to Zone H.
     * &quot;InstanceType&quot;:&quot;ecs.g5.large&quot;,
     * &quot;Scope&quot;:&quot;Zone&quot;, // Set the scope of the reserved instance to zonal.
     * &quot;InstanceAmount&quot;:5, // The reserved instance can match five pay-as-you-go instances of the same instance type.
     * &quot;OfferingType&quot;:&quot;All Upfront&quot;,
     * &quot;Platform&quot;:&quot;Windows&quot;, // The operating system type of the image used by the instance is Windows.
     * &quot;Period&quot;:2, // The term of the reserved instance is two years.
     * &quot;PeriodUnit&quot;:&quot;Year&quot;, // Set the unit of the term to year.
     * </code></pre>
     * 
     * @param request the request parameters of PurchaseReservedInstancesOffering  PurchaseReservedInstancesOfferingRequest
     * @return PurchaseReservedInstancesOfferingResponse
     */
    CompletableFuture<PurchaseReservedInstancesOfferingResponse> purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/137897.html">Billable methods</a> and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of the storage capacity unit (SCU) before you call this operation.</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/137897.html">Billable methods</a> and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of the storage capacity unit (SCU) before you call this operation.</strong></p>
     * 
     * @param request the request parameters of PurchaseStorageCapacityUnit  PurchaseStorageCapacityUnitRequest
     * @return PurchaseStorageCapacityUnitResponse
     */
    CompletableFuture<PurchaseStorageCapacityUnitResponse> purchaseStorageCapacityUnit(PurchaseStorageCapacityUnitRequest request);

    /**
     * <b>description</b> :
     * <p>After you settle overdue bills for a pay-as-you-go instance, you do not need to call this operation to activate the instance. The system automatically restarts the instance and restores it to the state before the overdue payment. Automatic restart may occasionally fail. Check whether the automatic restart is successful. If the automatic restart fails, call this operation to manually restart the instance.
     * &lt;props=&quot;china&quot;&gt;- After you settle overdue bills, the total value of your Alibaba Cloud account balance (cash balance) and vouchers must be no less than CNY 100.00. Otherwise, the instance cannot be restarted.
     * &lt;props=&quot;china&quot;&gt;- The instance must be in the <strong>expired</strong> (<code>Stopped</code>) or <strong>overdue and being recycled</strong> (<code>Stopped</code>) state.
     * &lt;props=&quot;intl&quot;&gt;- The instance must be in the <strong>expired</strong> (<code>Stopped</code>) state.</p>
     * <ul>
     * <li>Instances that are locked for security reasons cannot be started by calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impact of resource security locks on API calls</a></li>
     * </ul>
     * 
     * @param request the request parameters of ReActivateInstances  ReActivateInstancesRequest
     * @return ReActivateInstancesResponse
     */
    CompletableFuture<ReActivateInstancesResponse> reActivateInstances(ReActivateInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The cloud disk must be in the <strong>In Use</strong> (<code>In_use</code>) state, and the ECS instance to which the cloud disk is attached must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>You cannot reinitialize a cloud disk attached to an instance before the instance is started for the first time.</li>
     * <li>You cannot reinitialize a cloud disk for which local snapshots exist.
     * &lt;props=&quot;china&quot;&gt;- You cannot reinitialize a cloud disk for which the multi-attach feature is enabled.</li>
     * <li>A system cloud disk is reinitialized to the initial state of the image. If the source image from which the cloud disk was created is deleted, the system cloud disk cannot be reinitialized.</li>
     * <li>A data cloud disk created directly is reinitialized to an empty state. A data cloud disk created from a snapshot is reinitialized to the state of the snapshot. If the source snapshot is deleted, the data cloud disk cannot be reinitialized and an error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ReInitDisk  ReInitDiskRequest
     * @return ReInitDiskResponse
     */
    CompletableFuture<ReInitDiskResponse> reInitDisk(ReInitDiskRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. After the instance is restarted, it enters the Starting state. You can call <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Running</code>, the instance is restarted.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Instances that are locked for security reasons cannot be restarted by calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impacts of resource security locks on API operations</a>.</li>
     * <li>You can restart only ECS instances that are in the <strong>Running</strong> (<code>Running</code>) state.</li>
     * </ul>
     * 
     * @param request the request parameters of RebootInstance  RebootInstanceRequest
     * @return RebootInstanceResponse
     */
    CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. Instance restarts are not completed immediately. After a successful call, the instance enters the Starting state. You can call <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Running</code>, the restart is successful.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Instances that are locked for security reasons cannot be restarted by calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impact of resource security locks on API calls</a>.</li>
     * <li>The ECS instance must be in the <strong>Running</strong> state.</li>
     * </ul>
     * 
     * @param request the request parameters of RebootInstances  RebootInstancesRequest
     * @return RebootInstancesResponse
     */
    CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request);

    /**
     * @deprecated OpenAPI RecoverVirtualBorderRouter is deprecated, please use Vpc::2016-04-28::RecoverVirtualBorderRouter instead.  * @param request  the request parameters of RecoverVirtualBorderRouter  RecoverVirtualBorderRouterRequest
     * @return RecoverVirtualBorderRouterResponse
     */
    @Deprecated
    CompletableFuture<RecoverVirtualBorderRouterResponse> recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request);

    /**
     * <b>description</b> :
     * <p>When a DDH is in the alert state (<code>UnderAssessment</code>), which indicates a latent fault period, call this operation to perform failover migration for the DDH to prevent permanent failures. You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the status of a dedicated host.</p>
     * 
     * @param request the request parameters of RedeployDedicatedHost  RedeployDedicatedHostRequest
     * @return RedeployDedicatedHostResponse
     */
    CompletableFuture<RedeployDedicatedHostResponse> redeployDedicatedHost(RedeployDedicatedHostRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>RedeployInstance is an asynchronous invocation that restarts and migrates an instance. After the deployment succeeds, the instance enters the Running state. If the deployment failed, the instance is returned to the original physical server and recovers to the state before the deployment.
     * When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>The target instance must be in the Running or Stopped state. The instance status changes after the operation is invoked:<ul>
     * <li>An instance in the Running state enters the Stopping state.</li>
     * <li>An instance in the Stopped state enters the Starting state.</li>
     * </ul>
     * </li>
     * <li>Instances on dedicated hosts cannot be redeployed.</li>
     * <li>If <code>&quot;LockReason&quot;: &quot;security&quot;</code> is marked in the OperationLocks of a security-controlled instance, the instance cannot be redeployed.</li>
     * <li>Simulated events created by invoking CreateSimulatedSystemEvent cannot be responded to.</li>
     * <li>During the flow of isolating a local disk in a system event, you can also invoke RedeployInstance when the damaged local disk has been isolated but the <strong>SystemMaintenance.RebootAndReInitErrorDisk</strong> event has not been sent. For more information, see <a href="https://help.aliyun.com/document_detail/107693.html">Overview of local disk instance system events</a>.
     * The following table describes the system event types and event states that RedeployInstance can response to.<table>
     * <thead>
     * <tr>
     * <th>Event name and parameter</th>
     * <th>Event status</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Instance restart due to system maintenance (SystemMaintenance.Reboot)</td>
     * <td>Inquiring, Scheduled</td>
     * </tr>
     * <tr>
     * <td>Instance redeployment due to system maintenance (SystemMaintenance.Redeploy)</td>
     * <td>Inquiring, Scheduled</td>
     * </tr>
     * <tr>
     * <td>Instance restart and damaged disk replacement due to system maintenance (SystemMaintenance.RebootAndIsolateErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td>Instance restart and damaged disk reinitialization due to system maintenance (SystemMaintenance.RebootAndReInitErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td>Instance redeployment due to system fault (SystemFailure.Redeploy)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td>Only for ECS instances with local disks: Instance restart due to system fault (SystemFailure.Reboot)</td>
     * <td>Executing</td>
     * </tr>
     * <tr>
     * <td>Damaged disk isolation due to system maintenance (SystemMaintenance.IsolateErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td>Damaged disk reinitialization due to system maintenance (SystemMaintenance.ReInitErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>Redeploying an instance with local disks reinitializes the local disks, and all data on the storage devices is cleared.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RedeployInstance  RedeployInstanceRequest
     * @return RedeployInstanceResponse
     */
    CompletableFuture<RedeployInstanceResponse> redeployInstance(RedeployInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>For an immediately effective capacity reservation whose release mode is set to manual release, you can call this operation to directly release the capacity reservation.</p>
     * 
     * @param request the request parameters of ReleaseCapacityReservation  ReleaseCapacityReservationRequest
     * @return ReleaseCapacityReservationResponse
     */
    CompletableFuture<ReleaseCapacityReservationResponse> releaseCapacityReservation(ReleaseCapacityReservationRequest request);

    /**
     * <b>description</b> :
     * <p>Before releasing a pay-as-you-go dedicated host, make sure that no ECS instances are deployed on the host.</p>
     * 
     * @param request the request parameters of ReleaseDedicatedHost  ReleaseDedicatedHostRequest
     * @return ReleaseDedicatedHostResponse
     */
    CompletableFuture<ReleaseDedicatedHostResponse> releaseDedicatedHost(ReleaseDedicatedHostRequest request);

    /**
     * @deprecated OpenAPI ReleaseEipAddress is deprecated, please use Vpc::2016-04-28::ReleaseEipAddress instead.  * @param request  the request parameters of ReleaseEipAddress  ReleaseEipAddressRequest
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
     * @param request the request parameters of RemoveBandwidthPackageIps  RemoveBandwidthPackageIpsRequest
     * @return RemoveBandwidthPackageIpsResponse
     */
    CompletableFuture<RemoveBandwidthPackageIpsResponse> removeBandwidthPackageIps(RemoveBandwidthPackageIpsRequest request);

    /**
     * @deprecated OpenAPI RemoveTags is deprecated, please use Ecs::2014-05-26::UntagResources instead.  * @param request  the request parameters of RemoveTags  RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    @Deprecated
    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>&lt;props=&quot;china&quot;&gt;When you make a renewal payment, deductible vouchers are used first. Your account must support balance payment or credit payment.
     * &lt;props=&quot;intl&quot;&gt;When you make a renewal payment, deductible vouchers are used first. Your account must support balance payment or credit payment.</p>
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
     * <p><em>Before you use this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/ecs#pricing">pricing</a> of Elastic Compute Service.</em>*</p>
     * <ul>
     * <li>Make sure that your account balance or credit limit is sufficient.</li>
     * <li>Only subscription instances are supported. Invoking this operation for pay-as-you-go instances returns an error.</li>
     * <li>You must specify either the renewal period parameters (Period and PeriodUnit) or the unified expiration date parameter (ExpectedRenewDay), but not both.</li>
     * </ul>
     * 
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of reserved instances.</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of reserved instances.</strong></p>
     * <ul>
     * <li>Reserved instances support both manual renewal and auto-renewal. For more information, see <a href="~~100371#53bfc50b78sta~~">Renewal policy for reserved instances</a>.</li>
     * <li>You can invoke <a href="https://help.aliyun.com/document_detail/100065.html">DescribeReservedInstances</a> to query purchased reserved instances.</li>
     * <li>This operation supports enabling auto-renewal but does not support disabling auto-renewal. You can invoke <a href="https://help.aliyun.com/document_detail/2679786.html">ModifyReservedInstanceAutoRenewAttribute</a> to disable auto-renewal.</li>
     * </ul>
     * 
     * @param request the request parameters of RenewReservedInstances  RenewReservedInstancesRequest
     * @return RenewReservedInstancesResponse
     */
    CompletableFuture<RenewReservedInstancesResponse> renewReservedInstances(RenewReservedInstancesRequest request);

    /**
     * <b>description</b> :
     * <p>Before calling this operation, carefully read <a href="https://help.aliyun.com/document_detail/50134.html">Replace the system disk (replace the operating system)</a>.
     * When replacing the system disk, note the following:</p>
     * <ul>
     * <li><p>You cannot change the billing method of the system disk.</p>
     * </li>
     * <li><p>You cannot change the disk type of the system disk.</p>
     * </li>
     * <li><p>The ECS instance to which the system disk is attached must have no unpaid orders. </p>
     * </li>
     * <li><p>The instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</p>
     * <blockquote>
     * <p>This applies only to VPC-type instances. If the ECS instance uses the pay-as-you-go billing method and the economical mode is enabled by default, set the instance to the standard stop mode when stopping it. This prevents the instance from failing to restart after the system disk is replaced due to insufficient ECS instance inventory in the region. For more information, see <a href="https://help.aliyun.com/document_detail/25501.html">StopInstance</a>.</p>
     * </blockquote>
     * </li>
     * <li><p>You can use the <code>SystemDisk.Size</code> parameter to specify a new capacity for the system disk. The new capacity cannot be smaller than the original capacity.</p>
     * </li>
     * <li><p>If the ECS instance is security-locked, meaning the <code>OperationLocks</code> parameter of the instance contains <code>&quot;LockReason&quot;: &quot;security&quot;</code>, replacing the system disk is not supported. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.
     * After replacing the system disk, call <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> to query the instance status and verify whether the replacement was successful. If the returned <code>OperationLocks</code> value is empty, the system disk replacement is complete.</p>
     * </li>
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
     * <p>Read <a href="https://help.aliyun.com/document_detail/25450.html">Roll back a cloud disk by using a snapshot</a> before you call this operation.
     * Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>The cloud disk must be in the In Use (<code>In_use</code>) or Available (<code>Available</code>) state.  </li>
     * <li>The instance to which the cloud disk is attached must be in the Stopped (<code>Stopped</code>) state. You can call <a href="https://help.aliyun.com/document_detail/155372.html">StopInstances</a> to stop the instance.  </li>
     * <li>The specified <code>SnapshotId</code> parameter must be a historical snapshot created from the cloud disk specified by <code>DiskId</code>.  </li>
     * <li>When you call <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> to query ECS instance information, if the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code>, all operations are prohibited.</li>
     * </ul>
     * 
     * @param request the request parameters of ResetDisk  ResetDiskRequest
     * @return ResetDiskResponse
     */
    CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>RAM users require the <code>AliyunECSFullAccess</code> permission. For more information about how to grant Resource Access Management (RAM) user, see <a href="https://help.aliyun.com/document_detail/116146.html">Grant Resource Access Management (RAM) user</a>.</li>
     * <li>The account must have the permissions to use cloud disk encryption. If the API returns UserNotInTheWhiteList, apply to be added to the cloud disk encryption whitelist first.</li>
     * <li>You must call EnableDiskEncryptionByDefault to enable account-level default encryption for Block Storage in the specified region before you call this operation to reset the default key.</li>
     * </ul>
     * 
     * @param request the request parameters of ResetDiskDefaultKMSKeyId  ResetDiskDefaultKMSKeyIdRequest
     * @return ResetDiskDefaultKMSKeyIdResponse
     */
    CompletableFuture<ResetDiskDefaultKMSKeyIdResponse> resetDiskDefaultKMSKeyId(ResetDiskDefaultKMSKeyIdRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is deprecated. Use <a href="https://help.aliyun.com/document_detail/25520.html">ResetDisk</a> to roll back a cloud disk instead. Before calling this operation, ensure that the ECS instance to which the cloud disks are attached is in the Stopped state.</p>
     * 
     * @param request the request parameters of ResetDisks  ResetDisksRequest
     * @return ResetDisksResponse
     */
    CompletableFuture<ResetDisksResponse> resetDisks(ResetDisksRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before resizing a cloud disk, check its partition format. If the partition format is MBR, the cloud disk cannot be resized to more than 2 TiB. Otherwise, data loss may occur. To resize an MBR-partitioned cloud disk, create and attach a new data cloud disk, format it with the GPT partition format, and then copy the existing data to the new data cloud disk. For more information, see <a href="https://help.aliyun.com/document_detail/44986.html">Resize cloud disks</a>.</p>
     * </blockquote>
     * <ul>
     * <li>Supported cloud disk types include basic cloud disks (<code>cloud</code>), ultra cloud disks (<code>cloud_efficiency</code>), standard SSDs (<code>cloud_ssd</code>), ESSDs (<code>cloud_essd</code>)&lt;props=&quot;china&quot;&gt;<ph>, ESSD Entry disks (cloud_essd_entry)</ph>, ESSD AutoPL disks (cloud_auto), standard elastic ephemeral disks (elastic_ephemeral_disk_standard), premium elastic ephemeral disks (elastic_ephemeral_disk_premium), and regional ESSDs (cloud_regional_disk_auto).</li>
     * <li>Cloud disks for which snapshots are being created cannot be resized. Wait until the snapshot is created before resizing the cloud disk.</li>
     * <li>This operation does not resize partitions or file systems. After you resize the cloud disk, you must manually extend the partitions and file systems. For more information, see <a href="~~2949817#bb3b1f02e51pj~~">Extend partitions and file systems (Linux)</a> and <a href="~~2932233#a9f9b78f3fujb~~">Extend partitions and file systems (Windows)</a>.</li>
     * <li>Cloud disks with the multi-attach feature enabled support both online and offline resizing. Make sure that the instance to which the cloud disk is attached meets the following requirements:<ul>
     * <li>For online resizing, the instance status is <strong>Running</strong> (<code>Running</code>).</li>
     * <li>For offline resizing, the instance status is <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>).</li>
     * </ul>
     * </li>
     * <li>Make sure that the cloud disk meets the following requirements:<ul>
     * <li>The cloud disk is in the In Use (<code>In Use</code>) or Available (<code>Available</code>) state.</li>
     * <li>(Strongly recommended) A snapshot is created for the cloud disk to back up data. For more information, see <a href="https://help.aliyun.com/document_detail/25455.html">Create a snapshot</a>.</li>
     * <li>If the data cloud disk is newly purchased, initialize it before you resize it. For more information, see <a href="https://help.aliyun.com/document_detail/466323.html">Initialization overview</a>.</li>
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
     * <p>Notice: Alibaba Cloud adjusted the validation rules for this operation on July 8, 2024. When you delete a security group rule that does not exist, the operation returns the error code &quot;InvalidParam.SecurityGroupRuleId&quot; instead of a success response. Ensure your code is compatible with this error code to prevent impacts on your online business.
     * This operation provides two methods to pass parameters to delete rules:</p>
     * </blockquote>
     * <ul>
     * <li>Specify the security group rule IDs to delete rules (recommended).<ul>
     * <li>If a specified security group rule ID does not exist, the call failed.</li>
     * </ul>
     * </li>
     * <li>Specify the Permissions parameter to delete rules.<ul>
     * <li>If the matched security group rule does not exist, the call succeeds but no rule is deleted.</li>
     * <li>The following parameters are required to identify an inbound rule:<ul>
     * <li>Source settings: Specify one of the following parameters: SourceCidrIp (IPv4 address), Ipv6SourceCidrIp (IPv6 address), SourcePrefixListId (prefix list ID), or SourceGroupId (source security group).</li>
     * <li>Destination port range: PortRange.</li>
     * <li>Protocol type: IpProtocol.</li>
     * <li>Access policy: Policy.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You cannot specify both the security group rule IDs and the Permissions parameter at the same time.</p>
     * </blockquote>
     * <h3>Sample requests</h3>
     * <ul>
     * <li>Delete rules by specifying security group rule IDs.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;, // Specify the security group ID.
     * &quot;SecurityGroupRuleId&quot;:[&quot;sgr-bpdfmk****&quot;,&quot;sgr-bpdfmg****&quot;] // Specify the security group rule IDs.
     * </code></pre>
     * <ul>
     * <li>Delete rules by specifying an IP address range.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;SourceCidrIp&quot;:&quot;10.0.0.0/8&quot;, // Specify the source IPv4 CIDR block.
     *     &quot;IpProtocol&quot;:&quot;TCP&quot;, // Specify the protocol type.
     *     &quot;PortRange&quot;:&quot;80/80&quot;, // Specify the destination port range.
     *     &quot;Policy&quot;:&quot;accept&quot; // Specify the authorization policy.
     *   }
     * ]
     * </code></pre>
     * <ul>
     * <li>Delete rules by specifying another security group.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;SourceGroupId&quot;:&quot;sg-bp67acfmxa123b****&quot;, // Specify the source security group ID.
     *     &quot;IpProtocol&quot;:&quot;TCP,&quot;
     *     &quot;PortRange&quot;:&quot;80/80&quot;,
     *     &quot;Policy&quot;:&quot;accept&quot;
     *   }
     * }
     * </code></pre>
     * <ul>
     * <li>Delete rules by specifying a prefix list.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;SourcePrefixListId&quot;:pl-x1j1k5ykzqlixdcy****&quot;, // Specify the source prefix list ID.
     *     &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *     &quot;PortRange&quot;:&quot;80/80&quot;,
     *     &quot;Policy&quot;:&quot;accept&quot;
     *   }
     * ]
     * </code></pre>
     * 
     * @param request the request parameters of RevokeSecurityGroup  RevokeSecurityGroupRequest
     * @return RevokeSecurityGroupResponse
     */
    CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: Alibaba Cloud adjusted the validation rules for this API operation on July 8, 2024. When you delete a security group rule that does not exist, the API operation returns the fault code &quot;InvalidSecurityGroupRule.RuleNotExist&quot; instead of a success response. Ensure your code is compatible with this fault code to prevent impacts on your online services.
     * You can use one of the following methods to pass parameters and delete security group rules:</p>
     * </blockquote>
     * <ul>
     * <li>Specify the security group rule ID to delete rules. This method is recommended.<ul>
     * <li>If the specified security group rule ID does not exist, an exception is reported.</li>
     * </ul>
     * </li>
     * <li>Specify the Permissions parameter to delete rules.<ul>
     * <li>If no matching security group rule exists, the invoke succeeds but no rule is deleted.</li>
     * <li>Required parameters for deleting a security group rule:<ul>
     * <li>Destination Settings: Specify one of the following parameters: DestCidrIp (IPv4 address), Ipv6DestCidrIp (IPv6 address), DestPrefixListId (prefix list ID), or DestGroupId (destination security group).</li>
     * <li>Destination port range: PortRange.</li>
     * <li>Protocol type: IpProtocol.</li>
     * <li>Access policy: Policy.<blockquote>
     * <p>You cannot specify both the security group rule ID and the Permissions parameter at the same time.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Request examples</h3>
     * <ul>
     * <li>Delete rules by security group rule ID.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;, // Specify the security group ID.
     * &quot;SecurityGroupRuleId&quot;:[&quot;sgr-bpdfmk****&quot;,&quot;sgr-bpdfmg****&quot;] // Specify the security group rule IDs.
     * </code></pre>
     * <ul>
     * <li>Delete rules by IP address range.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4ph***&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;IpProtocol&quot;:&quot;TCP&quot;, // Specify the protocol type.
     *     &quot;DestCidrIp&quot;:&quot;10.0.0.0/8&quot;, // Specify the destination IP address range.
     *     &quot;PortRange&quot;:&quot;22/22&quot;, // Specify the destination port range.
     *     &quot;Policy&quot;:&quot;accept&quot; // Specify the authorization policy.
     *   }
     * ]
     * </code></pre>
     * <ul>
     * <li>Delete rules by destination security group.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4ph***&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;DestGroupId&quot;:&quot;sg-bp67acfmxa123b****&quot;, // Specify the destination security group ID.
     *     &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *     &quot;PortRange&quot;:&quot;22/22&quot;,
     *     &quot;Policy&quot;:&quot;accept&quot;
     *   }
     * ]
     * </code></pre>
     * <ul>
     * <li>Delete rules by specified prefix list.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4ph***&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *     &quot;DestPrefixListId&quot;:&quot;pl-x1j1k5ykzqlixdcy****&quot;, // Specify the destination prefix list ID.
     *     &quot;PortRange&quot;:&quot;22/22&quot;,
     *     &quot;Policy&quot;:&quot;accept&quot;,
     *   }
     * ]
     * </code></pre>
     * 
     * @param request the request parameters of RevokeSecurityGroupEgress  RevokeSecurityGroupEgressRequest
     * @return RevokeSecurityGroupEgressResponse
     */
    CompletableFuture<RevokeSecurityGroupEgressResponse> revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is asynchronous. After the request is sent, you can call the <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocationResults</a> operation and use the returned command ID or invocation ID to query the execution results.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>The target instances must be in the Running state. You can call the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation to query the instance status.</li>
     * <li>The Cloud Assistant Agent is installed on the target instances. You can call the <a href="https://help.aliyun.com/document_detail/2679925.html">InstallCloudAssistant</a> operation to install the agent and call the <a href="https://help.aliyun.com/document_detail/2679924.html">DescribeCloudAssistantStatus</a> operation to query the installation status.<blockquote>
     * <p>For ECS instances created from public images after December 1, 2017, the Cloud Assistant Agent is pre-installed by default.</p>
     * </blockquote>
     * </li>
     * <li>To run PowerShell commands, make sure that the PowerShell module is configured on the Windows operating system of the target ECS instances.
     * <a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a></li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>In a single region, you can retain 500 to 50,000 Cloud Assistant commands. You can apply for a quota increase. For more information, see <a href="https://help.aliyun.com/document_detail/184116.html">Quota management</a>.</li>
     * <li>The Cloud Assistant Agent must be of the following versions or later to support the new features of scheduled tasks (execution at fixed time intervals, one-time execution at a specified time, and specifying the year or time zone for cron expression-based scheduled execution). If the <code>ClientNeedUpgrade</code> error code is returned, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable the upgrade of the Cloud Assistant Agent</a> to update the client to the latest version.
     * - Linux: 2.2.3.282.
     * - Windows: 2.1.3.282.</li>
     * <li>When you execute a scheduled task based on a cron expression and specify a time zone, the scheduled execution time is based on the specified time zone. If you do not specify a time zone, the scheduled execution time is based on the system time zone of the ECS instance, and the execution time is subject to the system time of the instance. Make sure that the time or time zone of the ECS instance is consistent with your expected time. For more information about time zones, see <a href="https://help.aliyun.com/document_detail/92803.html">Set the time zone and NTP service for a Linux instance</a> or <a href="https://help.aliyun.com/document_detail/51890.html">Set the NTP service for a Windows instance</a>.</li>
     * </ul>
     * <h3>Best practices</h3>
     * <ul>
     * <li><strong>Timeout settings</strong>: You can specify the <code>Timeout</code> parameter to set the maximum timeout period for executing the command on the ECS instance. If the command execution times out, the Cloud Assistant Agent forcefully stops the process.<ul>
     * <li>After a one-time execution times out, the execution status (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) changes to Failed.</li>
     * <li>The timeout period for scheduled execution applies to each execution record. A timeout in the previous execution does not affect the next execution. After an execution times out, the execution status (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) changes to Failed.</li>
     * </ul>
     * </li>
     * <li><strong>Execution failures</strong>: A command may fail to execute because of abnormal target instance status, network exceptions, or Cloud Assistant Agent exceptions. In this case, no execution information is generated. For more information, see <a href="https://help.aliyun.com/document_detail/87029.html">Common faults and solutions for execution failures</a>.</li>
     * <li><strong>Custom parameters</strong>: If you set <code>EnableParameter</code> to true, the custom parameter feature is enabled. When you set <code>CommandContent</code>, you can use the <code>{{parameter}}</code> format to define custom parameters and pass in custom parameter key-value pairs when you execute the command.</li>
     * </ul>
     * 
     * @param request the request parameters of RunCommand  RunCommandRequest
     * @return RunCommandResponse
     */
    CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * Creating instances incurs fees. Billable items include <a href="https://help.aliyun.com/document_detail/25398.html">instance types</a>, <a href="https://help.aliyun.com/document_detail/179021.html">images</a>, <a href="https://help.aliyun.com/document_detail/179022.html">cloud disks</a>, and <a href="https://help.aliyun.com/document_detail/25411.html">public bandwidth</a>. Make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of ECS before you call this operation.
     * &lt;props=&quot;intl&quot;&gt;Make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of ECS before you call this operation.
     * This operation is asynchronous. After a create instance request is sent, the instance IDs are returned. However, the instances are not immediately created and started. You can call the <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> operation to query the instance information. If the returned status is Running, the instances are created and started.</p>
     * <h3>Before you begin</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Make sure that your account has passed real-name verification. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name verification</a>.</li>
     * <li>If the resource inventory is insufficient to create the instances, Alibaba Cloud immediately sends a SystemFailure.Delete event to indicate that the instance creation failed. You can call the <a href="https://help.aliyun.com/document_detail/2679897.html">DescribeInstanceHistoryEvents</a> operation to check whether a SystemFailure.Delete event exists. For more information, see <a href="https://help.aliyun.com/document_detail/2545990.html">System events for instance creation failures</a>.</li>
     * <li>Make sure that the total number of instances or the total number of vCPUs for all instance types does not exceed the system quota. For more information, see <a href="https://quotas.console.aliyun.com/products/ecs/quotas">Quota Center</a>.</li>
     * <li>Before you create a VPC-type instance, create a VPC in the corresponding Alibaba Cloud region. For more information, see <a href="https://help.aliyun.com/document_detail/65430.html">Create a VPC</a>.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>If the billing method of the instance is subscription (PrePaid), available coupons are used by default during payment.</li>
     * <li>A single request can create up to 100 instances. To create more than 100 instances, we recommend that you send multiple requests in batches or concurrently invoke the operation.</li>
     * <li>If the value of the InternetMaxBandwidthOut parameter is greater than 0, a public IP address is automatically allocated to the instance.<blockquote>
     * <p>In a single region, the total peak public bandwidth billed by fixed bandwidth for a single Alibaba Cloud account is limited. For more information, see <a href="~~25412#BandwidthQuota~~">Public bandwidth limits</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Usage suggestions</h3>
     * <ul>
     * <li><strong>Test scenarios</strong>: You can send a dry run request by setting DryRun=true.</li>
     * <li><strong>Release instances</strong>: You can set the automatic release time for an instance by using the AutoReleaseTime parameter, or call <a href="https://help.aliyun.com/document_detail/2679710.html">DeleteInstances</a> to manually release the instance.</li>
     * <li><strong>Management and retrieval</strong>: We recommend that you specify tags (Tag.N.Key and Tag.N.Value) for instances launched in each batch, and add sequential suffixes (UniqueSuffix) to hostnames (HostName) and instance names (InstanceName). For more information, see <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential instance names or hostnames</a>.</li>
     * <li><strong>Launch templates</strong>: Launch templates save you the trouble of entering a large number of configuration parameters each time you create an instance. You can call <a href="https://help.aliyun.com/document_detail/2679729.html">CreateLaunchTemplate</a> to create a launch template, and then specify LaunchTemplateId and LaunchTemplateVersion in the RunInstances request to use the launch template.</li>
     * <li><strong>Disable hyper-threading</strong>: In memory-intensive business scenarios, you can set CpuOptions.ThreadsPerCore=1 to disable hyper-threading and increase the memory ratio.</li>
     * <li><strong>Enable jumbo frames</strong>: You can specify NetworkOptions.EnableJumboFrame=true to enable the Jumbo frame feature during creation. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">ECS instance MTU</a>.</li>
     * </ul>
     * <h2>Request examples</h2>
     * <p>Assume that you need to create several ECS instances in the China (Hangzhou) region. You want to use a specific image, instance type, security group, and vSwitch, configure system disks and data disks of specific sizes, allocate public IP addresses, and set instance names and passwords. The relevant configuration request parameters are as follows:</p>
     * <pre><code>RegionId:&quot;cn-hangzhou&quot;, // Set the region to China (Hangzhou).
     * ImageId:&quot;aliyun_3_x64_20G_alibase_20221102.vhd&quot;, // Set the image ID.
     * InstanceType:&quot;ecs.g7.large&quot;, // Set the instance type.
     * SecurityGroupId:&quot;sg-bp150uqocpf9jj70****&quot;, // Set the security group ID.
     * VSwitchId:&quot;vsw-bp1qo7s91cbch5i4l****&quot;, // Set the vSwitch ID.
     * SystemDisk:{
     *   Category:&quot;cloud_essd&quot;, // Set the system disk category to enterprise SSD.
     *   Size:40, // Set the system disk size to 40 GiB.
     * },
     * DataDisk:[
     *   {
     *     Category:&quot;cloud_essd&quot;, // Set the data disk category to enterprise SSD.
     *     Size:100, // Set the data disk size to 100 GiB.
     *   }
     * ],
     * HostName:&quot;ECS-test&quot;, // Set the instance hostname.
     * Password:&quot;ECS@test1234&quot;, // Set the instance logon password.
     * InternetMaxBandwidthOut:10 // Set the outbound public bandwidth to 10 Mbit/s.
     * </code></pre>
     * <p>Based on the preceding configuration, create different types of instances:</p>
     * <details>
     * <summary>Example: Create 5 subscription instances with auto-renewal enabled</summary>
     * ```
     * Amount:5, // Set the number of instances to create to 5.
     * InstanceChargeType:"PrePaid", // Set the billing method to subscription.
     * PeriodUnit:"Month", // Set the time unit to Month.
     * Period:1, // Set the duration to 1 month.
     * AutoRenew:true, // Enable auto-renewal.
     * AutoRenewPeriod:1 // Set the auto-renewal duration to 1 month.
     * ```
     * </details>
     * <details>
     * <summary>Example: Create 10 pay-as-you-go instances</summary>
     * ```
     * Amount:10, // Set the number of instances to create to 10.
     * InstanceChargeType:"PostPaid", // Set the billing method to pay-as-you-go.
     * SpotStrategy:"NoSpot" // Default value, which indicates normal pay-as-you-go.
     * ```
     * </details>
     * <details>
     * <summary>Example: Create 20 spot instances and set the bidding policy and protection period</summary>
     * ```
     * Amount:20, // Set the number of instances to create to 20.
     * InstanceChargeType:"PostPaid",
     * SpotStrategy:"SpotAsPriceGo", // Set the bidding policy for spot instances to automatic bidding based on marketplace prices.
     * SpotDuration:1 // Set the protection period for spot instances to 1 hour.
     * ```
     * </details>
     * Assume that you have created a launch template by calling [CreateLaunchTemplate](https://help.aliyun.com/document_detail/2679729.html) and now need to use the template to create several ECS instances in the China (Hangzhou) region. Examples are as follows:
     * <details>
     * <summary>Example: Create 10 ECS instances based on a launch template</summary>
     * ```
     * RegionId:"cn-hangzhou", // Set the region to China (Hangzhou).
     * Amount:10, // Set the number of instances to create to 10.
     * LaunchTemplateId:"lt-bp14xczpoxvb6rre****" // Set the launch template ID.
     * ```
     * </details>
     * >Notice: When both instance parameters and template parameters are specified, the instance parameters take precedence. For example, if the billing method in the template is subscription and InstanceChargeType is set to PostPaid, the created instances are pay-as-you-go instances.</notice>
     * <details>
     * <summary>Example: Create 1 instance by using a full image (a full instance image that includes the system disk and data disks)</summary>
     * ```
     * RegionId:"cn-hangzhou", // Set the region to China (Hangzhou).
     * ImageId = m-bp13ohd32cvzpq9e****, // Custom image ID
     * InstanceType = ecs.u1-c1m1.large, // Instance type
     * SecurityGroupId = sg-bp10jztp6b0sdsyl****, // Security group ID
     * VSwitchId = vsw-bp19wo63nleroq22g****, // vSwitch ID
     * SystemDisk.Size = 50, // Set the size of the system disk included in the full image.
     * SystemDisk.Category = cloud_auto, // Set the category of the system disk included in the full image.
     * DataDisk.1.Device = /dev/xvdb, // Set the mount point of the data disk included in the full image.
     * DataDisk.1.Size = 50, // Set the size of the data disk included in the full image.
     * DataDisk.1.Category = cloud_essd, // Set the category of the data disk included in the full image.
     * DataDisk.2.Device = /dev/xvdc, // Set the mount point of the new data disk. If you want to use the new data disk to replace the data disk included in the full image, you can set DataDisk.1.Device = /dev/xvdb (the default mount point of the data disk in the full image).
     * DataDisk.2.Size = 70, // Set the size of the new data disk.
     * DataDisk.2.Category = cloud_auto, // Set the category of the new data disk.
     * ```
     * </details>
     * 
     * @param request the request parameters of RunInstances  RunInstancesRequest
     * @return RunInstancesResponse
     */
    CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to send a diagnostic interrupt to an inaccessible or unresponsive ECS instance to manually trigger an operating system crash and generate a crash dump.</li>
     * <li>Sending a diagnostic interrupt triggers an operating system crash and restart, which may cause data loss. Proceed with caution.</li>
     * <li>The generated dump file can be used for root cause analysis and debugging instance issues.</li>
     * <li>Make sure that relevant configurations, such as the kdump service and NMI response, are completed in advance in the operating system of the instance. Otherwise, the dump file may not be generated.</li>
     * <li>ECS Bare Metal instances do not support this feature.</li>
     * <li>If the system disk space of the instance is insufficient, the dump file may not be fully saved, or the disk space may be fully occupied. This may prevent the instance from starting properly after a restart due to a full system disk.</li>
     * </ul>
     * 
     * @param request the request parameters of SendDiagnosticInterrupt  SendDiagnosticInterruptRequest
     * @return SendDiagnosticInterruptResponse
     */
    CompletableFuture<SendDiagnosticInterruptResponse> sendDiagnosticInterrupt(SendDiagnosticInterruptRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>The target ECS instances must be in the running (<code>Running</code>) state.</li>
     * <li>The <a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> must be installed on the target ECS instances in advance.</li>
     * <li>The Cloud Assistant Agent version must be later than the following versions to support file sending. If the <code>ClientNeedUpgrade</code> error code is returned, update the agent to the latest version.<ul>
     * <li>Linux: 1.0.2.569</li>
     * <li>Windows: 1.0.0.149</li>
     * </ul>
     * </li>
     * <li>After Base64 encoding, the file content cannot exceed 32 KB in size.</li>
     * <li>File sending may fail due to exceptions in the target ECS instance status, network issues, or Cloud Assistant Agent exceptions. Call <a href="https://help.aliyun.com/document_detail/184117.html">DescribeSendFileResults</a> or refer to <a href="https://help.aliyun.com/document_detail/87029.html">Common errors and solutions for execution failures</a> to troubleshoot issues.</li>
     * </ul>
     * 
     * @param request the request parameters of SendFile  SendFileRequest
     * @return SendFileResponse
     */
    CompletableFuture<SendFileResponse> sendFile(SendFileRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>After an image template is created, you must call this operation to execute an image build task. The system builds, distributes, and creates a shared image based on the parameters configured in the image template.</li>
     * <li>Only one image build task can be executed for the same image template at a time. You can call the CancelImagePipelineExecution operation multiple times concurrently to cancel image build tasks. Canceling an image build task does not interfere with other image build tasks.</li>
     * <li>When you execute an image build template, multiple intermediate instances are created to assist in building the image. Intermediate instances are pay-as-you-go ECS instances and incur fees. For more information, see <a href="https://help.aliyun.com/document_detail/40653.html">Pay-as-you-go</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of StartImagePipelineExecution  StartImagePipelineExecutionRequest
     * @return StartImagePipelineExecutionResponse
     */
    CompletableFuture<StartImagePipelineExecutionResponse> startImagePipelineExecution(StartImagePipelineExecutionRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. The instance is not started immediately after a successful call. The instance first enters the Starting state. Call <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Running</code>, the instance is started.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Instances that are locked for security reasons cannot be started by calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">China site (Impacts of resource security locks on API calls)</a>.</li>
     * <li>The ECS instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>Instances in economical mode may fail to start due to insufficient inventory.</li>
     * </ul>
     * 
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
    CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. Instance startup is not immediate. After you invoke the operation, the instances enter the Starting state. You can invoke <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Running</code>, the instances are started.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Instances that are locked for security reasons cannot be started by invoking this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impacts of security lock on API operations</a>.</li>
     * <li>The ECS instances must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>Starting instances in economical mode may fail because of insufficient resources.</li>
     * </ul>
     * 
     * @param request the request parameters of StartInstances  StartInstancesRequest
     * @return StartInstancesResponse
     */
    CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you customize a remote connection client by using code, you can invoke this operation to obtain the WebSocketUrl for establishing a remote connection to an ECS instance. Take note of the following items:</p>
     * <ul>
     * <li>The specified ECS instance must be in the Running state.</li>
     * <li>The specified ECS instance must have Cloud Assistant Agent installed. You can invoke <a href="https://help.aliyun.com/document_detail/87346.html">DescribeCloudAssistantStatus</a> to check whether Cloud Assistant Agent is installed on the ECS instance and query the version number of Cloud Assistant Agent.<ul>
     * <li>If Cloud Assistant Agent is not installed on the ECS instance, invoke <a href="https://help.aliyun.com/document_detail/85916.html">InstallCloudAssistant</a> to install it.</li>
     * <li>Cloud Assistant Agent must be later than the following versions to support the session management feature. To upgrade Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a>.<ul>
     * <li>Linux operating system: 2.2.3.256</li>
     * <li>Windows operating system: 2.1.3.256</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>After this operation is invoked, the WebSocketUrl is valid for 10 minutes.</li>
     * <li>After a session is established, Cloud Assistant performs a shutdown of the connection if no data is transmitted for 3 minutes.</li>
     * <li>In a single region, a maximum of 100 sessions can be created and active. A maximum of 20 sessions can be in the connected state for a single ECS instance. The bandwidth limit for a single session connection is 200 KB/s.</li>
     * <li>The port forwarding feature supports only TCP port forwarding. UDP is not supported.</li>
     * <li>To permanently close a session and invalidate the WebSocketUrl, invoke the EndTerminalSession operation.</li>
     * </ul>
     * 
     * @param request the request parameters of StartTerminalSession  StartTerminalSessionRequest
     * @return StartTerminalSessionResponse
     */
    CompletableFuture<StartTerminalSessionResponse> startTerminalSession(StartTerminalSessionRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is asynchronous. The instance is not stopped immediately. After a successful call, the instance first enters the Stopping state. You can invoke <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Stopped</code>, the instance is stopped successfully.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Instances that are locked for security reasons cannot be stopped by invoking this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Effects of resource security lock on API calls</a>.</li>
     * <li>After you enable the economical mode for instances in a VPC, you can configure <code>StoppedMode=KeepCharging</code> in Settings to enable the standard stop mode. After the ECS instance is stopped, billing continues, and the ECS instance type inventory and Internet IP address are retained.</li>
     * </ul>
     * 
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
     */
    CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. Instances are not stopped immediately after a successful call. After a successful call, the instance enters the Stopping state. You can call <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Stopped</code>, the instance is stopped.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>After an instance is stopped, the instance becomes unavailable. Make sure that stopping the instance does not affect your business. You can call <a href="https://help.aliyun.com/document_detail/2679679.html">StartInstance</a> or <a href="https://help.aliyun.com/document_detail/2679680.html">StartInstances</a> to start the instance.</li>
     * <li>Instances that are locked for security reasons cannot be stopped by calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impacts of resource security locks on API operations</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of StopInstances  StopInstancesRequest
     * @return StopInstancesResponse
     */
    CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>If you stop a one-time command process, the command continues to run on instances where it has already started, but is not executed on instances where it has not started.</li>
     * <li>If you stop a periodic command process, the current execution continues if it has already started, but no subsequent executions are performed.</li>
     * </ul>
     * 
     * @param request the request parameters of StopInvocation  StopInvocationRequest
     * @return StopInvocationResponse
     */
    CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Before binding tags, Alibaba Cloud verifies the number of existing tags on the resource. If the limit is exceeded, an error message is returned. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @deprecated OpenAPI TerminatePhysicalConnection is deprecated, please use Vpc::2016-04-28::TerminatePhysicalConnection instead.  * @param request  the request parameters of TerminatePhysicalConnection  TerminatePhysicalConnectionRequest
     * @return TerminatePhysicalConnectionResponse
     */
    @Deprecated
    CompletableFuture<TerminatePhysicalConnectionResponse> terminatePhysicalConnection(TerminatePhysicalConnectionRequest request);

    /**
     * @deprecated OpenAPI TerminateVirtualBorderRouter is deprecated, please use Vpc::2016-04-28::TerminateVirtualBorderRouter instead.  * @param request  the request parameters of TerminateVirtualBorderRouter  TerminateVirtualBorderRouterRequest
     * @return TerminateVirtualBorderRouterResponse
     */
    @Deprecated
    CompletableFuture<TerminateVirtualBorderRouterResponse> terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>The network interface controller (NIC) must be in the <strong>active</strong> (Available) or <strong>InUse</strong> state.</li>
     * <li>If you are operating on a primary network interface controller (NIC), the ECS instance to which the NIC is attached must be in the <strong>Running</strong> or <strong>Stopped</strong> state.</li>
     * </ul>
     * 
     * @param request the request parameters of UnassignIpv6Addresses  UnassignIpv6AddressesRequest
     * @return UnassignIpv6AddressesResponse
     */
    CompletableFuture<UnassignIpv6AddressesResponse> unassignIpv6Addresses(UnassignIpv6AddressesRequest request);

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Only Elastic Network Interfaces (ENIs) in the <strong>Active</strong> (Available) or <strong>InUse</strong> (InUse) state are supported.</li>
     * <li>When you operate on a primary ENI, the instance to which the network interface controller (NIC) is attached must be in the <strong>Running</strong> (Running) or <strong>Stopped</strong> (Stopped) state.</li>
     * </ul>
     * 
     * @param request the request parameters of UnassignPrivateIpAddresses  UnassignPrivateIpAddressesRequest
     * @return UnassignPrivateIpAddressesResponse
     */
    CompletableFuture<UnassignPrivateIpAddressesResponse> unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request);

    /**
     * @deprecated OpenAPI UnassociateEipAddress is deprecated, please use Vpc::2016-04-28::UnassociateEipAddress instead.  * @param request  the request parameters of UnassociateEipAddress  UnassociateEipAddressRequest
     * @return UnassociateEipAddressResponse
     */
    @Deprecated
    CompletableFuture<UnassociateEipAddressResponse> unassociateEipAddress(UnassociateEipAddressRequest request);

    /**
     * @deprecated OpenAPI UnassociateHaVip is deprecated, please use Vpc::2016-04-28::UnassociateHaVip instead.  * @param request  the request parameters of UnassociateHaVip  UnassociateHaVipRequest
     * @return UnassociateHaVipResponse
     */
    @Deprecated
    CompletableFuture<UnassociateHaVipResponse> unassociateHaVip(UnassociateHaVipRequest request);

    /**
     * @param request the request parameters of UnlockSnapshot  UnlockSnapshotRequest
     * @return UnlockSnapshotResponse
     */
    CompletableFuture<UnlockSnapshotResponse> unlockSnapshot(UnlockSnapshotRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

}
