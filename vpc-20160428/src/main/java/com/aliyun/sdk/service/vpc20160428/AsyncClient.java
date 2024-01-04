// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vpc20160428.models.*;
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
      * After you call this operation, the router interface enters the **Activating** state. After the router interface is activated, it enters the **Active** state.
      * >  You cannot activate a router interface that has overdue payments.
      *
     */
    CompletableFuture<ActivateRouterInterfaceResponse> activateRouterInterface(ActivateRouterInterfaceRequest request);

    /**
      * *   The **ActiveFlowLog** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      *     *   If the flow log is in the **Activating** state, the flow log is being started.
      *     *   If the flow log is in the **Active** state, the flow log is started.
      * *   You cannot repeatedly call the **ActiveFlowLog** operation to start a flow log within the specified period of time.
      *
     */
    CompletableFuture<ActiveFlowLogResponse> activeFlowLog(ActiveFlowLogRequest request);

    CompletableFuture<AddBgpNetworkResponse> addBgpNetwork(AddBgpNetworkRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   When you call this operation to associate an EIP with an Internet Shared Bandwidth instance, make sure that the EIP meets the following requirements:
      *     *   The EIP uses the pay-as-you-go billing method.
      *     *   The EIP and the Internet Shared Bandwidth instance belong to the same region.
      *     *   The line type of the EIPs is the same as that of the Internet Shared Bandwidth instance.
      * *   **AddCommonBandwidthPackageIp** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeCommonBandwidthPackages](~~120309~~) operation to query the status of the operation.
      *     *   If the Internet Shared Bandwidth instance is in the **BINDING** state, the EIP is being associated with the Internet Shared Bandwidth instance. In this state, you can only query the Internet Shared Bandwidth instance and cannot perform other operations.
      *     *   If the Internet Shared Bandwidth instance is in the **BINDED** state, the EIP is associated with the Internet Shared Bandwidth instance.
      *
     */
    CompletableFuture<AddCommonBandwidthPackageIpResponse> addCommonBandwidthPackageIp(AddCommonBandwidthPackageIpRequest request);

    /**
      * *   When you call this operation to associate EIPs with an Internet Shared Bandwidth instance, make sure that the EIPs meet the following requirements:
      *     *   The EIPs use the pay-as-you-go billing method.
      *     *   The EIP and the Internet Shared Bandwidth instance belong to the same region.
      *     *   The line type of the EIPs is the same as that of the Internet Shared Bandwidth instance.
      * *   **AddCommonBandwidthPackageIps** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeCommonBandwidthPackages](~~DescribeCommonBandwidthPackages~~) operation to query the status of the task.
      *     *   If the Internet Shared Bandwidth instance is in the **BINDING** state, the EIP is being associated with the Internet Shared Bandwidth instance. In this state, you can only query the Internet Shared Bandwidth instance and cannot perform other operations.
      *     *   If the Internet Shared Bandwidth instance is in the **BINDED** state, the EIP is associated with the Internet Shared Bandwidth instance.
      *
     */
    CompletableFuture<AddCommonBandwidthPackageIpsResponse> addCommonBandwidthPackageIps(AddCommonBandwidthPackageIpsRequest request);

    CompletableFuture<AddGlobalAccelerationInstanceIpResponse> addGlobalAccelerationInstanceIp(AddGlobalAccelerationInstanceIpRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<AddIPv6TranslatorAclListEntryResponse> addIPv6TranslatorAclListEntry(AddIPv6TranslatorAclListEntryRequest request);

    /**
      * Before you call this operation, take note of the following limits:
      * *   The CIDR block and the IP address pool must belong to the same region.
      * *   The CIDR block and the IP address pool must use the same line type.
      * *   **AddPublicIpAddressPoolCidrBlock** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListPublicIpAddressPoolCidrBlocks](~~429436~~) operation to query the status of the task.
      *     *   If the CIDR block is in the **Modifying** state, the CIDR block is being added. In this state, you can only query the CIDR block and cannot perform other operations.
      *     *   If the CIDR block is in the **Created** state, the CIDR block is added.
      * *   You cannot repeatedly call the **AddPublicIpAddressPoolCidrBlock** operation to add a CIDR block to an IP address pool within the specified period of time.
      *
     */
    CompletableFuture<AddPublicIpAddressPoolCidrBlockResponse> addPublicIpAddressPoolCidrBlock(AddPublicIpAddressPoolCidrBlockRequest request);

    /**
      * *   **AddSourcesToTrafficMirrorSession** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListTrafficMirrorSessions](~~261367~~) operation to query the status of the task.
      *     *   If the traffic mirror session is in the **Modifying** state, the traffic mirror source is being added to the traffic mirror session.
      *     *   If the traffic mirror session is in the **Created** state, the traffic mirror source is added to the traffic mirror session.
      * *   You cannot repeatedly call the **AddSourcesToTrafficMirrorSession** operation to add a traffic mirror source to a traffic mirror session within the specified period of time.
      *
     */
    CompletableFuture<AddSourcesToTrafficMirrorSessionResponse> addSourcesToTrafficMirrorSession(AddSourcesToTrafficMirrorSessionRequest request);

    /**
      * Before you call this operation, make sure that you are familiar with the billing methods and pricing of EIPs. For more information, see [Billing overview](~~122035~~).
      * After you call this operation, the system randomly allocates an EIP that is in the **Available** state in the specified region. EIPs support only the ICMP, TCP, and UDP transport layer protocols. The IGMP and SCTP protocols are not supported.
      *
     */
    CompletableFuture<AllocateEipAddressResponse> allocateEipAddress(AllocateEipAddressRequest request);

    CompletableFuture<AllocateEipAddressProResponse> allocateEipAddressPro(AllocateEipAddressProRequest request);

    /**
      * **AllocateEipSegmentAddress** is an asynchronous operation. After a request is sent, the system returns the ID of a contiguous EIP group and runs the task in the background. You can call the [DescribeEipSegment](~~156063~~) operation to query the status of the task.
      * *   If the contiguous EIP group is in the **Allocating** state, the EIPs are being allocated. In this case, you can only perform the query operation and cannot perform other operations.
      * *   If the contiguous EIP group is in the **Allocated** state, the EIPs are allocated.
      *
     */
    CompletableFuture<AllocateEipSegmentAddressResponse> allocateEipSegmentAddress(AllocateEipSegmentAddressRequest request);

    CompletableFuture<AllocateIpv6AddressResponse> allocateIpv6Address(AllocateIpv6AddressRequest request);

    /**
      * You cannot repeatedly call the **AllocateIpv6InternetBandwidth** operation within a specific time period.
      *
     */
    CompletableFuture<AllocateIpv6InternetBandwidthResponse> allocateIpv6InternetBandwidth(AllocateIpv6InternetBandwidthRequest request);

    /**
      * # [](#)
      * The following section describes how to allocate an IPv6 CIDR block to a virtual private cloud (VPC):
      * 1.  Call the AllocateVpcIpv6Cidr operation to reserve the IPv6 CIDR block.
      * 2.  To allocate an IPv6 CIDR block to an existing VPC, call the [AssociateVpcCidrBlock](~~146745~~) operation. Set **RegionId**, **VpcId**, and **IPv6CidrBlock** to the IPv6 CIDR bock, and set **IpVersion** to **ipv6**. To allocate an IPv6 CIDR block when you create a VPC, call the [CreateVpc](~~35737~~) operation. Set **RegionId** and **Ipv6CidrBlock** to the IPv6 CIDR block, and set **EnableIpv6** to **true**.
      *
     */
    CompletableFuture<AllocateVpcIpv6CidrResponse> allocateVpcIpv6Cidr(AllocateVpcIpv6CidrRequest request);

    CompletableFuture<ApplyPhysicalConnectionLOAResponse> applyPhysicalConnectionLOA(ApplyPhysicalConnectionLOARequest request);

    /**
      * *   You can associate an EIP with an Elastic Compute Service (ECS) instance, a Classic Load Balancer (CLB) instance, a secondary elastic network interface (ENI), a NAT gateway, or a high-availability virtual IP address (HAVIP) in the same region. The ECS instance and CLB instance must be deployed in a virtual private cloud (VPC).
      * *   **AssociateEipAddress** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeEipAddresses](~~120193~~) operation to query the status of the task.
      *     *   If the EIP is in the **Associating** state, the EIP is being associated. In this state, you can only query the EIP and cannot perform other operations.
      *     *   If the EIP is in the **InUse** state, the EIP is associated.
      * *   You cannot call the **AssociateEipAddress** operation to associate an EIP with multiple instances at a time.
      *
     */
    CompletableFuture<AssociateEipAddressResponse> associateEipAddress(AssociateEipAddressRequest request);

    /**
      * *   You can call the **AssociateEipAddressBatch** operation to associate EIPs with an instance in the same region. The instance must be a NAT gateway or a secondary elastic network interface (ENI). For more information about how to associate EIPs with other instances, see [AssociateEipAddress](~~120195~~).
      * *   **AssociateEipAddressBatch** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEipAddresses](~~120193~~) operation to query the status of the task.
      *     *   If the EIP is in the **Associating** state, the EIP is being associated. You can only query the EIP and cannot perform other operations.
      *     *   If the EIP is in the **InUse** state, the EIP is associated.
      * *   You cannot call the **AssociateEipAddressBatch** operation to associate an EIP with multiple instances at a time.
      *
     */
    CompletableFuture<AssociateEipAddressBatchResponse> associateEipAddressBatch(AssociateEipAddressBatchRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * *   An HAVIP immediately takes effect after it is associated. You do not need to restart the ECS instance. However, you must associate the HAVIP with the ENI of the ECS instance.
      * *   The HAVIP and ECS instance must belong to the same vSwitch.
      * *   You can associate an HAVIP with at most two ECS instances.
      * *   The ECS instance must be in the **Running** or **Stopped** state.
      * *   The HAVIP must be in the **Available** or **InUse** state.
      * *   The **AssociateHaVip** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeHaVips](~~114611~~) operation to query the status of an HAVIP:
      *     *   If the HAVIP is in the **Associating** state, the HAVIP is being associated.
      *     *   If the HAVIP is in the **InUse** state, the HAVIP is associated.
      * *   You cannot repeatedly call the **AssociateHaVip** operation to associate an HAVIP within the specified period of time.
      *
     */
    CompletableFuture<AssociateHaVipResponse> associateHaVip(AssociateHaVipRequest request);

    /**
      * ## [](#)Description
      * *   **AssociateNetworkAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeNetworkAclAttributes](~~116542~~) operation to query the status of the task.
      *     *   If the network ACL is in the **BINDING** state, the network ACL is being associated.
      *     *   If the network ACL is in the **BINDED** state, the network ACL is associated.
      * *   You cannot repeatedly call the **AssociateNetworkAcl** operation to associate a network ACL within the specified period of time.
      *
     */
    CompletableFuture<AssociateNetworkAclResponse> associateNetworkAcl(AssociateNetworkAclRequest request);

    CompletableFuture<AssociatePhysicalConnectionToVirtualBorderRouterResponse> associatePhysicalConnectionToVirtualBorderRouter(AssociatePhysicalConnectionToVirtualBorderRouterRequest request);

    /**
      * **AssociateRouteTable** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of the task:
      * *   If the vSwitch is in the **Pending** state, the route table is being associated with the vSwitch.
      * *   If the vSwitch is in the **Available** state, the route table is associated with the vSwitch.
      *
     */
    CompletableFuture<AssociateRouteTableResponse> associateRouteTable(AssociateRouteTableRequest request);

    CompletableFuture<AssociateRouteTableWithGatewayResponse> associateRouteTableWithGateway(AssociateRouteTableWithGatewayRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * *   The gateway endpoint to be associated with the route table cannot be in one of the following states: **Creating**, **Modifying**, **Associating**, **Dissociating**, or **Deleting**.
      * *   The route table cannot be in one of the following states: **Creating**, **Modifying**, **Associating**, **Dissociating**, or **Deleting**.
      * *   The gateway endpoint and route table must belong to the same virtual private cloud (VPC).
      * *   The route table cannot be shared.
      * *   You cannot associate a gateway endpoint with a virtual border router (VBR) route table.
      * *   You can associate a gateway endpoint with at most 20 route tables at a time.
      * *   **AssociateRouteTablesWithVpcGatewayEndpoint** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetVpcGatewayEndpointAttribute](~~311017~~) operation to query whether a route table is associated with a gateway endpoint.
      *     *   If the **Associating** status is returned, the route table is being associated with the gateway endpoint.
      *     *   If the **Created** status is returned, the route table is associated with the gateway endpoint.
      * *   You cannot repeatedly call the **AssociateRouteTablesWithVpcGatewayEndpoint** operation within a specific period of time.
      *
     */
    CompletableFuture<AssociateRouteTablesWithVpcGatewayEndpointResponse> associateRouteTablesWithVpcGatewayEndpoint(AssociateRouteTablesWithVpcGatewayEndpointRequest request);

    /**
      * ## [](#)
      * *   Take note of the following limits:
      *     *   Each VPC can contain up to five secondary IPv4 CIDR blocks.
      *     *   Each VPC can contain up to three secondary IPv6 CIDR blocks.
      * *   You cannot repeatedly call the **AssociateVpcCidrBlock** operation to add secondary CIDR blocks to a VPC within the specified period of time.
      *
     */
    CompletableFuture<AssociateVpcCidrBlockResponse> associateVpcCidrBlock(AssociateVpcCidrBlockRequest request);

    /**
      * Before you associate a VPN gateway with an SSL certificate, take note of the following items:
      * *   You can associate only VPN gateways of the ShangMi (SM) type with SSL certificates. You need to associate a VPN gateway of the SM type with two SSL certificates, one as the encryption certificate and the other as the signature certificate.
      * *   The SSL certificates must use the SM algorithm.
      * *   You cannot specify one SSL certificate as both the encryption certificate and signature certificate for one VPN gateway.
      * *   **AssociateVpnGatewayWithCertificate** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the SSL certificate is being associated.
      *     *   If the VPN gateway is in the **active** state, the SSL certificate is being associated.
      * *   You cannot call **AssociateVpnGatewayWithCertificate** within a specific period of time.
      * ### [](#)Prerequisites
      * Make sure that you have two SSL certificates that use the SM algorithm in the Certificate Management Service console. For more information about SSL certificates, see [What is Certificate Management Service?](~~28535~~).
      *
     */
    CompletableFuture<AssociateVpnGatewayWithCertificateResponse> associateVpnGatewayWithCertificate(AssociateVpnGatewayWithCertificateRequest request);

    /**
      * *   The **AttachDhcpOptionsSetToVpc** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of a DHCP options set:
      *     *   If the DHCP options set is in the **Pending** state, the DHCP options set is being associated.
      *     *   If the DHCP options set is in the **InUse** state, the DHCP options set is associated.
      * *   You cannot repeatedly call the **AttachDhcpOptionsSetToVpc** operation to associate DHCP options sets with a VPC within the specified period of time.
      *
     */
    CompletableFuture<AttachDhcpOptionsSetToVpcResponse> attachDhcpOptionsSetToVpc(AttachDhcpOptionsSetToVpcRequest request);

    CompletableFuture<AttachVbrToVpconnResponse> attachVbrToVpconn(AttachVbrToVpconnRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   After this operation is performed, the maximum bandwidth of the EIP equals that of the Internet Shared Bandwidth instance.
      * *   You cannot repeatedly call the **CancelCommonBandwidthPackageIpBandwidth** operation within a specific time period.
      *
     */
    CompletableFuture<CancelCommonBandwidthPackageIpBandwidthResponse> cancelCommonBandwidthPackageIpBandwidth(CancelCommonBandwidthPackageIpBandwidthRequest request);

    /**
      * You can cancel only an Express Connect circuit that is in the **Initial**, **Approved**, **Allocated**, or **Confirmed** state.
      *
     */
    CompletableFuture<CancelPhysicalConnectionResponse> cancelPhysicalConnection(CancelPhysicalConnectionRequest request);

    /**
      * ## [](#)
      * You cannot repeatedly call the **ChangeResourceGroup** operation to modify the resource group of the same Express Connect circuit.
      *
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CheckCanAllocateVpcPrivateIpAddressResponse> checkCanAllocateVpcPrivateIpAddress(CheckCanAllocateVpcPrivateIpAddressRequest request);

    CompletableFuture<CheckVpnBgpEnabledResponse> checkVpnBgpEnabled(CheckVpnBgpEnabledRequest request);

    CompletableFuture<CompletePhysicalConnectionLOAResponse> completePhysicalConnectionLOA(CompletePhysicalConnectionLOARequest request);

    CompletableFuture<ConfirmPhysicalConnectionResponse> confirmPhysicalConnection(ConfirmPhysicalConnectionRequest request);

    /**
      * After you call this operation, the router interface enters the **Connecting** state. When the connection is established, it enters the **Active** state.
      * When you call this operation, take note of the following items:
      * *   Only an initiator router interface in the **Idle** state can initiate a connection.
      * *   You can create only one pair of connected router interfaces between two routers.
      * *   You cannot initiate a connection if your Alibaba Cloud account has a router interface with overdue payments.
      *
     */
    CompletableFuture<ConnectRouterInterfaceResponse> connectRouterInterface(ConnectRouterInterfaceRequest request);

    /**
      * Before you convert a NAT service plan to an Internet Shared Bandwidth instance, take note of the following limits:
      * *   You are not charged for the conversion.
      * *   When you convert a NAT service plan to an Internet Shared Bandwidth instance, you can continue to use the SNAT and DNAT features of the NAT gateway, and your workloads are not affected. However, we recommend that you convert your NAT service plan during off-peak hours.
      * *   After the NAT service plan is converted to an Internet Shared Bandwidth instance, the public IP addresses in the NAT service plan are converted to elastic IP addresses (EIPs). The maximum bandwidth and billing method of the Internet Shared Bandwidth instance are the same as those of the NAT service plan.
      *
     */
    CompletableFuture<ConvertBandwidthPackageResponse> convertBandwidthPackage(ConvertBandwidthPackageRequest request);

    /**
      * ## [](#)Description
      * *   **CopyNetworkAclEntries** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeNetworkAclAttributes](~~116542~~) operation to query the status of the task.
      *     *   If the network ACL is in the **Modifying** state, the rules of the network ACL are being copied.
      *     *   If the network ACL is in the **Available** state, the rules of the network ACL are copied.
      * *   You cannot repeatedly call the **CopyNetworkAclEntries** operation within the specified period of time.
      *
     */
    CompletableFuture<CopyNetworkAclEntriesResponse> copyNetworkAclEntries(CopyNetworkAclEntriesRequest request);

    /**
      * You can connect a VBR to a data center through BGP. Each BGP group is associated with a VBR. You can add a BGP peer that needs to communicate with a VBR to a BGP group and advertise the BGP network in the VBR.
      * BGP groups are used to simplify BGP configurations. You can add BGP peers that use the same configurations to one BGP group. Before you start, you must create a BGP group with the requested autonomous system number (ASN).
      * When you call this operation, take note of the following limits:
      * *   You can specify only the data center that is connected to the VBR through an Express Connect circuit as a BGP peer.
      * *   VBRs support only BGP-4.
      * *   You can create at most eight BGP peers for each VBR.
      * *   Each BGP peer supports at most 110 dynamic routes.
      * *   The ASN of Alibaba Cloud is 45104. You can specify a 2-byte or 4-byte ASN for the data center.
      *
     */
    CompletableFuture<CreateBgpGroupResponse> createBgpGroup(CreateBgpGroupRequest request);

    CompletableFuture<CreateBgpPeerResponse> createBgpPeer(CreateBgpPeerRequest request);

    CompletableFuture<CreateCommonBandwidthPackageResponse> createCommonBandwidthPackage(CreateCommonBandwidthPackageRequest request);

    CompletableFuture<CreateCustomerGatewayResponse> createCustomerGateway(CreateCustomerGatewayRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * *   The first IP address and last three IP addresses of a vSwitch CIDR block are reserved. For example, if the CIDR block of a vSwitch is 192.168.1.0/24, the IP addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved.
      * *   The number of instances in the default vSwitch cannot exceed the remaining number of instances supported by the VPC (15,000 minus the number of existing instances).
      * *   Default vSwitches do not support multicasting or broadcasting.
      * *   After you create a default vSwitch, you cannot modify its CIDR block.
      * *   **CreateDefaultVSwitch** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of a default vSwitch:
      *     *   If a default vSwitch is in the **Pending** state, it is being configured.
      *     *   If a default vSwitch is in the **Available** state, it is available.
      * *   If a default vSwitch already exists in a region, you cannot call this operation to create a default vSwitch in this region.
      * *   Before you create a default vSwitch, make sure that a default VPC is created. You can call the [CreateDefaultVpc](~~609152~~) operation to create a default VPC.
      *
     */
    CompletableFuture<CreateDefaultVSwitchResponse> createDefaultVSwitch(CreateDefaultVSwitchRequest request);

    /**
      * ## Usage notes
      * When you call this operation, take note of the following items:
      * *   After you create a default VPC, you cannot change its CIDR block. However, you can add secondary IPv4 CIDR blocks to it.
      * *   In each default VPC, cloud services can use a maximum of 60,000 private IP addresses. You cannot increase the quota.
      * *   After you create a default VPC, a vRouter and a route table are automatically created for the VPC.
      * *   At most three user CIDR blocks can be added to a VPC. If a user CIDR block includes another user CIDR block, the one with the shorter subnet mask takes effect. For example, if 10.0.0.0/8 and 10.1.0.0/16 are specified, only 10.0.0.0/8 takes effect.
      * *   **CreateDefaultVpc** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of the task:
      *     *   If the default VPC is in the **Pending** state, the VPC is being configured.
      *     *   If the default VPC is in the **Available** state, the VPC is available.
      * *   You cannot repeatedly call the **CreateDefaultVpc** operation within a specific time period.
      * *   You can create only one default VPC in each region.
      *
     */
    CompletableFuture<CreateDefaultVpcResponse> createDefaultVpc(CreateDefaultVpcRequest request);

    /**
      * *   **CreateDhcpOptionsSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetDhcpOptionsSet](~~448820~~) to query the status of the task.
      *     *   If the vSwitch is in the **Pending** state, the DHCP options set is being configured.
      *     *   If the vSwitch is in the **Available** state, the DHCP options set is available.
      *
     */
    CompletableFuture<CreateDhcpOptionsSetResponse> createDhcpOptionsSet(CreateDhcpOptionsSetRequest request);

    CompletableFuture<CreateExpressCloudConnectionResponse> createExpressCloudConnection(CreateExpressCloudConnectionRequest request);

    CompletableFuture<CreateFailoverTestJobResponse> createFailoverTestJob(CreateFailoverTestJobRequest request);

    /**
      * **CreateFlowLog** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      * *   If the flow log is in the **Activating** state, the flow log is being created.
      * *   If the flow log is in the **Active** state, the flow log is created and started.
      *
     */
    CompletableFuture<CreateFlowLogResponse> createFlowLog(CreateFlowLogRequest request);

    /**
      * ## [](#)
      * Each DNAT entry consists of the following parameters: **ExternalIp**, **ExternalPort**, **IpProtocol**, **InternalIp**, and **InternalPort**. After you add a DNAT entry, the NAT gateway forwards packets over the specified protocol from **ExternalIp:ExternalPort** to **InternalIp:InternalPort** and sends responses back through the same route.
      * When you call this operation, take note of the following limits:
      * *   **CreateForwardEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeForwardTableEntries](~~36053~~) operation to query the status of the task.
      *     *   If the DNAT entry is in the **Pending** state, the system is adding the DNAT entry. You can only query the DNAT entry, but cannot perform other operations.
      *     *   If the DNAT entry is in the **Available** state, the DNAT entry is added.
      * *   You cannot repeatedly call the **CreateForwardEntry** operation to add a DNAT entry within a specific period of time.
      * *   All combinations of **ExternalIp**, **ExternalPort**, and **IpProtocol** used in DNAT entries must be unique. You cannot distribute requests to more than one Elastic Compute Service (ECS) instance if these requests are initiated from the same source IP address, received on the same port, and use the same protocol.
      * *   The combinations of **IpProtocol**, **InternalIp**, and **InternalPort** must be unique.
      * *   If one or more DNAT entries in the DNAT table are in the **Pending** or **Modifying** state, you cannot add DNAT entries to the DNAT table.
      * *   You can add at most 100 DNAT entries to a DNAT table.
      * *   For an elastic IP address (EIP) used by an Internet NAT gateway or a NAT IP address used by a Virtual Private Cloud (VPC) NAT gateway, take note of the following limit: If the IP address has IP mapping enabled and is specified in a DNAT entry, the IP address cannot be used by another DNAT or SNAT entry.
      *
     */
    CompletableFuture<CreateForwardEntryResponse> createForwardEntry(CreateForwardEntryRequest request);

    /**
      * *   **CreateFullNatEntry** is an asynchronous operation. After you send a request to call this operation, the system returns a FULLNAT entry and the FULLNAT entry is being added in the backend. You can call the [ListFullNatEntries](~~348779~~) operation to query the status of a FULLNAT entry.
      *     *   If the FULLNAT entry is in the **Creating** state, the system is adding the FULLNAT entry. You can only query the status of the FULLNAT entry, but cannot perform other operations.
      *     *   If the FULLNAT entry is in the **Available** state, the FULLNAT entry is added.
      * *   You cannot repeatedly call the **CreateFullNatEntry** operation for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<CreateFullNatEntryResponse> createFullNatEntry(CreateFullNatEntryRequest request);

    /**
      * @deprecated
      * ## Usage notes
      * You can call this operation to create only pay-as-you-go GA instances.
      *
     */
    CompletableFuture<CreateGlobalAccelerationInstanceResponse> createGlobalAccelerationInstance(CreateGlobalAccelerationInstanceRequest request);

    /**
      * **CreateHaVip** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeHaVips](~~114611~~) operation to query the status of the task:
      * *   If the HAVIP is in the **Creating** state, the HAVIP is being created.
      * *   If the HAVIP is in the **Available** state, the HAVIP is created.
      *
     */
    CompletableFuture<CreateHaVipResponse> createHaVip(CreateHaVipRequest request);

    CompletableFuture<CreateHighReliablePhysicalConnectionResponse> createHighReliablePhysicalConnection(CreateHighReliablePhysicalConnectionRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateIPv6TranslatorResponse> createIPv6Translator(CreateIPv6TranslatorRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateIPv6TranslatorAclListResponse> createIPv6TranslatorAclList(CreateIPv6TranslatorAclListRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<CreateIPv6TranslatorEntryResponse> createIPv6TranslatorEntry(CreateIPv6TranslatorEntryRequest request);

    /**
      * *   Before you create an IPsec server, you must create a VPN gateway and enable the SSL-VPN feature for the VPN gateway. For more information, see [CreateVpnGateway](~~120363~~).
      * *   **CreateIpsecServer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task:
      *     *   If the VPN gateway is in the **updating** state, the IPsec server is being created.
      *     *   If the VPN gateway is in the **active** state, the IPsec server is created.
      * *   You cannot repeatedly call the **CreateIpsecServer** operation for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<CreateIpsecServerResponse> createIpsecServer(CreateIpsecServerRequest request);

    /**
      * *   **CreateIpv4Gateway** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetIpv4GatewayAttribute](~~407670~~) operation to query the status of an IPv4 gateway:
      *     *   If the IPv4 gateway is in the **Creating** state, the IPv4 gateway is being created.
      *     *   If the IPv4 gateway is in the **Created** state, the IPv4 gateway is created.
      * *   You cannot repeatedly call the **CreateIpv4Gateway** operation to create IPv4 gateways in a virtual private cloud (VPC) within the specified period of time.
      *
     */
    CompletableFuture<CreateIpv4GatewayResponse> createIpv4Gateway(CreateIpv4GatewayRequest request);

    /**
      * *   **CreateIpv6EgressOnlyRule** is an asynchronous operation. After a request is sent, the system returns a request ID and creates the rule in the background. You can call the [DescribeIpv6EgressOnlyRules](~~102208~~) operation to query the status of the task.
      *     *   If the egress-only rule is in the **Creating** state, the egress-only rule is being created.
      *     *   If the egress-only rule is in the **Created** state, the egress-only rule is created.
      * *   You cannot repeatedly call the **CreateIpv6EgressOnlyRule** operation to add egress-only rules for an IPv6 address within the specified period of time.
      *
     */
    CompletableFuture<CreateIpv6EgressOnlyRuleResponse> createIpv6EgressOnlyRule(CreateIpv6EgressOnlyRuleRequest request);

    /**
      * *   **CreateIpv6Gateway** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeIpv6GatewayAttribute](~~102226~~) operation to query the status of the task.
      *     *   If the IPv6 gateway is in the **Creating** state, the IPv6 gateway is being created.
      *     *   If the IPv6 gateway is in the **Created** state, the IPv6 gateway is created.
      * *   You cannot repeatedly call the **CreateIpv6Gateway** operation within a specific time period.
      *
     */
    CompletableFuture<CreateIpv6GatewayResponse> createIpv6Gateway(CreateIpv6GatewayRequest request);

    /**
      * ## [](#)
      * Before you call this operation, take note of the following items:
      * *   The first time you create a NAT gateway, the system automatically creates the service-linked role AliyunServiceRoleForNatgw. Then, the system attaches the permission policy AliyunServiceRolePolicyForNatgw to the role. This allows the NAT gateway to access other resources on Alibaba Cloud. For more information, see [Service-linked roles](~~174251~~).
      * *   After you create an enhanced Internet NAT gateway, a route entry is automatically added to the route table of the VPC. The destination CIDR block of the route entry is 0.0.0.0/0 and the next hop is the NAT gateway. This ensures that traffic is routed to the NAT gateway.
      * *   **CreateNatGateway** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeNatGateways](~~36054~~) operation to query the status of the task.
      *     *   If a NAT gateway is in the **Creating** state, the NAT gateway is being created. In this case, you can query the NAT gateway but cannot perform other operations.
      *     *   If a NAT gateway is in the **Available** state, the NAT gateway is created.
      * It takes 1 to 3 minutes to create a NAT gateway.
      * *   You cannot repeatedly call the **CreateNatGateway** operation within a specific period of time.
      *
     */
    CompletableFuture<CreateNatGatewayResponse> createNatGateway(CreateNatGatewayRequest request);

    /**
      * ## [](#)
      * **CreateNatIp** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListNatIps](~~287000~~) operation to query the status of the task.
      * *   If a NAT IP address is in the **Creating** state, the NAT IP address is being created. In this case, you can only query the NAT IP address and cannot perform other operations.
      * *   If a NAT IP address is in the **Available** state, the NAT IP address is created.
      * You cannot repeatedly call the **CreateNatIp** operation to create a NAT IP address within a specific period of time.
      *
     */
    CompletableFuture<CreateNatIpResponse> createNatIp(CreateNatIpRequest request);

    /**
      * ## [](#)Description
      * You cannot repeatedly call the **CreateNatIpCidr** operation to create a NAT CIDR block within the specified period of time.
      *
     */
    CompletableFuture<CreateNatIpCidrResponse> createNatIpCidr(CreateNatIpCidrRequest request);

    CompletableFuture<CreateNetworkAclResponse> createNetworkAcl(CreateNetworkAclRequest request);

    /**
      * You can apply for a dedicated Express Connect circuit for yourself or create a hosted connection for a tenant. After your application is approved, the Express Connect circuit changes to the **Initial** state. You can contact the connectivity provider to start construction.
      * When you call this operation, take note of the following limits:
      * *   If your Alibaba Cloud account has more than five Express Connect circuits that are not in the **Enabled** state, you cannot apply for another Express Connect circuit.
      * *   If your Alibaba Cloud account has an Express Connect circuit with overdue payments, you cannot apply for another Express Connect circuit.
      *
     */
    CompletableFuture<CreatePhysicalConnectionResponse> createPhysicalConnection(CreatePhysicalConnectionRequest request);

    /**
      * >  You can call this operation only when the Express Connect circuit is in the **Complete** state.
      *
     */
    CompletableFuture<CreatePhysicalConnectionOccupancyOrderResponse> createPhysicalConnectionOccupancyOrder(CreatePhysicalConnectionOccupancyOrderRequest request);

    CompletableFuture<CreatePhysicalConnectionSetupOrderResponse> createPhysicalConnectionSetupOrder(CreatePhysicalConnectionSetupOrderRequest request);

    /**
      * By default, the IP address pool feature is unavailable. You can apply for the privilege to use the **IP address pool feature** in the Quota Center console. For more information, see the "Request a quota increase in the Quota Center console" section in the [Manage EIP quotas](~~108213~~) topic.
      *
     */
    CompletableFuture<CreatePublicIpAddressPoolResponse> createPublicIpAddressPool(CreatePublicIpAddressPoolRequest request);

    /**
      * ## [](#)References
      * *   **CreateRouteEntries** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeRouteEntryList](~~138148~~) operation to query the status of the task.
      *     *   If the route entry is in the **Creating** state, the route entry is being created.
      *     *   If the route entry is in the **Created** state, the route entry is created.
      * *   You cannot repeatedly call the **CreateRouteEntries** operation to create the same route entry within the specified period of time.
      * **When you call this operation to add custom route entries to the route table of a vRouter, take note of the following items:**
      * *   A route table can contain up to 200 custom route entries.
      * *   The destination CIDR block (**DstCidrBlock**) of a custom route entry cannot be the same as or overlap with the CIDR block of a vSwitch in the VPC.
      * *   The destination CIDR block (**DstCidrBlock**) of a custom route entry cannot be 100.64.0.0/10 or its subnets.
      * *   The destination CIDR blocks (**DstCidrBlock**) of route entries in the same route table must be unique.
      * *   If you do not include the mask length when you specify the destination CIDR block (**DstCidrBlock**), the destination CIDR block is considered a host IP address whose mask length is 32 bits.
      * *   Multiple custom route entries can point to the same next hop (**NextHop**).
      * *   The next hop (**NextHop**) of a custom route entry must belong to the same VPC as the route table.
      *
     */
    CompletableFuture<CreateRouteEntriesResponse> createRouteEntries(CreateRouteEntriesRequest request);

    /**
      * *   **CreateRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeRouteEntryList](~~138148~~) operation to query the status of the task:
      *     *   If a route is in the **Creating** state, the route is being added.
      *     *   If a route is in the **Created** state, the route is added.
      * *   You cannot repeatedly call **CreateRouteEntry** within a specific period of time.
      * **When you call this operation to add a custom route entry to the route table of a vRouter, take note of the following limits:**
      * >  When you add a route entry from a prefix list, the quota usage is calculated by adding the number of existing route entries and the maximum number of route entries of the prefix list.
      * *   A route table can contain up to 200 custom route entries.
      * *   The destination CIDR block (**DestinationCidrBlock**) of a custom route entry cannot be the same as or be a subset of the CIDR block of a vSwitch in the virtual private cloud (VPC). The destination CIDR block can contain the CIDR block of a vSwitch.
      * *   The destination CIDR block (**DestinationCidrBlock**) of a custom route entry cannot be 100.64.0.0/10 or a subset of it.
      * *   The destination CIDR blocks (**DestinationCidrBlock**) of route entries in the same route table must be unique.
      * *   If you do not include the mask length when you specify the destination CIDR block (**DestinationCidrBlock**), the destination CIDR block is considered a host IP address whose mask length is 32 bits.
      * *   Multiple custom route entries can point to the same next hop (**NextHopId**).
      * *   The next hop (**NextHopId**) of a custom route entry must in the same VPC as the route table.
      * *   Equal-cost multi-path (ECMP) routing can be configured by specifying the **NextHopList** parameter.
      *     *   When you add non-ECMP route entries, you must specify **DestinationCidrBlock**, **NextHopType**, and **NextHopId**, and you must not specify **NextHopList**.
      *     *   When you add route entries for ECMP routing, you must specify **DestinationCidrBlock** and **NextHopList**, and you must not specify **NextHopType** or **NextHopId**.
      * **When you call this operation to add a custom route entry to the route table of a VBR, take note of the following limits:**
      * *   A route table can contain up to 200 custom route entries.
      * *   **NextHopList** is not supported.
      * *   The destination CIDR block (**DestinationCidrBlock**) of a custom route entry cannot be 100.64.0.0/10 or a subset of it.
      * *   The destination CIDR blocks (**DestinationCidrBlock**) of route entries in the same route table must be unique.
      * *   If you do not include the mask length when you specify the destination CIDR block (**DestinationCidrBlock**), the destination CIDR block is considered a host IP address whose mask length is 32 bits.
      * *   Multiple custom route entries can point to the same next hop (**NextHopId**).
      * *   The next hop (**NextHopId**) of a custom route entry must be a router interface associated with the VBR.
      * *   You can add route entries only when the VBR is in the **Active** state, and the Express Connect circuit associated with the VBR is in the **Enabled** state and is not locked due to overdue payments.
      * *   Only non-ECMP route entries are supported. When you add non-ECMP route entries, you must specify **DestinationCidrBlock**, **NextHopType**, and **NextHopId**, and you cannot specify **NextHopList**.
      *
     */
    CompletableFuture<CreateRouteEntryResponse> createRouteEntry(CreateRouteEntryRequest request);

    /**
      * *   The **CreateRouteTable** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeRouteTableList](~~87602~~) operation to query the status of a custom route table:
      *     *   If the custom route table is in the **Creating** state, the custom route table is being created.
      *     *   If the custom route table is in the **Created** state, the custom route table is created.
      * *   You cannot repeatedly call the **CreateRouteTable** operation to create a custom route table within the specified period of time.
      *
     */
    CompletableFuture<CreateRouteTableResponse> createRouteTable(CreateRouteTableRequest request);

    /**
      * ## [](#)
      * When you call this operation, take note of the following limits:
      * *   You can create only one pair of interfaces to be connected between two routers.
      * *   You can create a maximum of five router interfaces for a router.
      * *   If your Alibaba Cloud account has a router interface with overdue payments, you cannot create new router interfaces.
      * *   Each destination CIDR block of route entries in the same route table must be unique.
      * *   A virtual border router (VBR) can serve only as a requester. The VBR must be in the Activated state.
      * *   You can call this operation to create subscription and pay-as-you-go router interfaces.
      *
     */
    CompletableFuture<CreateRouterInterfaceResponse> createRouterInterface(CreateRouterInterfaceRequest request);

    /**
      * You can call this operation to add SNAT entries to Internet NAT gateways and Virtual Private Cloud (VPC) NAT gateways. In this topic, a **NAT** gateway refers to both gateway types.
      * Before you call this operation, take note of the following limits:
      * *   **CreateSnatEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeSnatTableEntries](~~42677~~) operation to query the status of the task.
      *     *   If the SNAT entry is in the **Pending** state, the system is adding the SNAT entry. You can only query the status of the SNAT entry, and cannot perform other operations.
      *     *   If the SNAT entry is in the **Available** state, the SNAT entry is added.
      * *   You cannot repeatedly call the **CreateSnatEntry** operation to add an SNAT entry to an SNAT table within the specified period of time.
      * *   The vSwitch and Elastic Compute Service (ECS) instance specified in an SNAT entry must be created in the VPC where the NAT gateway is deployed.
      * *   Each vSwitch or ECS instance can be specified in only one SNAT entry.
      * *   If a high-availability virtual IP address (HAVIP) exists in a vSwitch, you cannot create SNAT entries.
      *
     */
    CompletableFuture<CreateSnatEntryResponse> createSnatEntry(CreateSnatEntryRequest request);

    CompletableFuture<CreateSslVpnClientCertResponse> createSslVpnClientCert(CreateSslVpnClientCertRequest request);

    /**
      * *   **CreateSslVpnServer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the SSL server is being created.
      *     *   If the VPN gateway is in the **active** state, the SSL server is created.
      * *   You cannot repeatedly call the **CreateSslVpnServer** operation for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<CreateSslVpnServerResponse> createSslVpnServer(CreateSslVpnServerRequest request);

    /**
      * **CreateTrafficMirrorFilter** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListTrafficMirrorFilters](~~261353~~) operation to query the status of a filter.
      * *   If the filter is in the **Creating** state, the filter is being created.
      * *   If the filter is in the **Created** state, the filter is created.
      *
     */
    CompletableFuture<CreateTrafficMirrorFilterResponse> createTrafficMirrorFilter(CreateTrafficMirrorFilterRequest request);

    /**
      * *   The **CreateTrafficMirrorFilterRules** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListTrafficMirrorFilters](~~261353~~) operation to query the status of an inbound or outbound rule:
      *     *   If the rule is in the **Creating** state, the rule is being created.
      *     *   If the rule is in the **Created** state, the rule is created.
      * *   You cannot repeatedly call the **CreateTrafficMirrorFilterRules** operation to create an inbound or outbound rule for a traffic mirroring filter.
      *
     */
    CompletableFuture<CreateTrafficMirrorFilterRulesResponse> createTrafficMirrorFilterRules(CreateTrafficMirrorFilterRulesRequest request);

    /**
      * **CreateTrafficMirrorSession** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListTrafficMirrorSessions](~~261367~~) operation to query the status of a traffic mirror session:
      * *   If the traffic mirror session is in the **Creating** state, the traffic mirror session is being created.
      * *   If the traffic mirror session is in the **Created** state, the traffic mirror session is created.
      *
     */
    CompletableFuture<CreateTrafficMirrorSessionResponse> createTrafficMirrorSession(CreateTrafficMirrorSessionRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * *   You can create at most 150 vSwitches in a virtual private cloud (VPC).
      * *   The first IP address and last three IP addresses of each vSwitch CIDR block are reserved. For example, if the CIDR block of a vSwitch is 192.168.1.0/24, the IP addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved.
      * *   The number of instances in a vSwitch cannot exceed the remaining capacity of the VPC. The remaining capacity is the difference between 15,000 and the current number of instances.
      * *   Each instance can belong to only one vSwitch.
      * *   vSwitches do not support multicast or broadcast.
      * *   After you create a vSwitch, you cannot modify its CIDR block.
      * *   **CreateVSwitch** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVSwitchAttributes](~~94567~~) to query the status of the task.
      *     *   If the vSwitch is in the **Pending** state, the vSwitch is being configured.
      *     *   If the vSwitch is in the **Available** state, the vSwitch is available.
      * *   You cannot repeatedly call the **CreateVSwitch** operation to create a vSwitch in a VPC within the specified period of time.
      *
     */
    CompletableFuture<CreateVSwitchResponse> createVSwitch(CreateVSwitchRequest request);

    /**
      * ## [](#)Description
      * Take note of the following items:
      * *   You can create at most 10 reserved IPv4 CIDR blocks and 10 reserved IPv6 CIDR blocks for each vSwitch in a virtual private cloud (VPC).
      * *   After you create a reserved CIDR block for a vSwitch, the CIDR block cannot contain the IP address of the subnet gateway of the VPC to which the vSwitch belongs.
      * *   **CreateVSwitchCidrReservation** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [ListVSwitchCidrReservations](~~610155~~) to query the status of the task:
      *     *   If the vSwitch is in the **Assigning** state, the reserved CIDR block is being created.
      *     *   If the vSwitch is in the **Assigned** state, the reserved CIDR block is created.
      * *   When you create a reserved IPv4 CIDR block for a vSwitch, the first IP address and the last three IP addresses of the vSwitch are reserved by the system. The four IP addresses will not be allocated.
      * *   When you create a reserved IPv6 CIDR block for a vSwitch, the first IP address and the last nine IP addresses of the vSwitch are reserved by the system. The 10 IP addresses will not be allocated. For example, if you create a reserved IPv4 CIDR block for a vSwitch whose CIDR block is 192.168.1.0/24, the reserved CIDR block cannot contain the following IP addresses: 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.
      *
     */
    CompletableFuture<CreateVSwitchCidrReservationResponse> createVSwitchCidrReservation(CreateVSwitchCidrReservationRequest request);

    CompletableFuture<CreateVbrHaResponse> createVbrHa(CreateVbrHaRequest request);

    /**
      * *   You cannot create a destination-based route whose destination CIDR block is 0.0.0.0/0.
      * *   Do not add a route whose destination CIDR block is 100.64.0.0/10, a subset of 100.64.0.0/10, or a CIDR block that contains 100.64.0.0/10. If such a route is added, the status of the IPsec-VPN connection cannot be displayed in the console or IPsec negotiations fail.
      * *   **CreateVcoRouteEntry** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of the task.
      *     *   If the IPsec-VPN connection is in the **updating** state, the route is being created.
      *     *   If the IPsec-VPN connection is in the **attached** state, the route is created.
      * *   You cannot repeatedly call **CreateVcoRouteEntry** to create a route for the same IPsec-VPN connection within the specified period of time.
      *
     */
    CompletableFuture<CreateVcoRouteEntryResponse> createVcoRouteEntry(CreateVcoRouteEntryRequest request);

    /**
      * When you create a VBR, the VBR is in the **active** state by default.
      *
     */
    CompletableFuture<CreateVirtualBorderRouterResponse> createVirtualBorderRouter(CreateVirtualBorderRouterRequest request);

    /**
      * # [](#)Description
      * Before you call this operation, we recommend that you learn about the workflow for creating a hosted connection and the environment requirements. For more information, see [Overview of hosted connections](~~146571~~) and [Operations performed by Express Connect partners](~~155987~~).
      *
     */
    CompletableFuture<CreateVirtualPhysicalConnectionResponse> createVirtualPhysicalConnection(CreateVirtualPhysicalConnectionRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   You can specify only one CIDR block for each VPC.
      * *   After you create a VPC, you cannot change its CIDR block. However, you can add secondary IPv4 CIDR blocks to the VPC.
      * *   In each VPC, cloud services can use a maximum of 60,000 private IP addresses. You cannot increase the quota.
      * *   After you create a VPC, a vRouter and a route table are automatically created.
      * *   At most three user CIDR blocks can be added to a VPC. If a user CIDR block includes another user CIDR block, the one with the shorter subnet mask takes effect. For example, if both 10.0.0.0/8 and 10.1.0.0/16 are specified, only 10.0.0.0/8 takes effect.
      * *   **CreateVpc** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of the task:
      *     *   If the VPC is in the **Creating** state, the VPC is being created.
      *     *   If the VPC is in the **Created** state, the VPC is created.
      * *   You cannot repeatedly call the **DeleteRouteEntry** operation to create default VPCs within a specific time period. However, you can repeatedly call this operation to create custom VPCs within a specific time period.
      *
     */
    CompletableFuture<CreateVpcResponse> createVpc(CreateVpcRequest request);

    CompletableFuture<CreateVpcGatewayEndpointResponse> createVpcGatewayEndpoint(CreateVpcGatewayEndpointRequest request);

    /**
      * You cannot repeatedly call the **CreateVpcPrefixList** operation to create a prefix list in a region within the specified period of time.
      *
     */
    CompletableFuture<CreateVpcPrefixListResponse> createVpcPrefixList(CreateVpcPrefixListRequest request);

    /**
      * If an Express Connect partner has created a virtual border router (VBR) for a tenant before, the Express Connect partner can push the Express Connect circuit that is associated with the VBR to the tenant account by adding a shared port for the tenant account. The service of the tenant is not interrupted in this process.
      * Preparations:
      * Before the Express Connect partner performs the operation, the Express Connect partner must notify the tenant and request the tenant to enable outbound data transfer billing. For more information, see [Enable outbound data transfer billing](~~274385~~).
      * What to do next:
      * 1.  After the Express Connect partner performs the operation, a shared port is added for the tenant account. The tenant must call the [ConfirmPhysicalConnection](~~324198~~) operation to accept the shared port.
      * 2.  Then, the Express Connect partner must call the [AttachVbrToVpconn](~~324191~~) operation to associate the VBR with the newly added shared port that belongs to the tenant account.
      *
     */
    CompletableFuture<CreateVpconnFromVbrResponse> createVpconnFromVbr(CreateVpconnFromVbrRequest request);

    /**
      * By default, an IPsec-VPN connection created by calling the `CreateVpnAttachment` operation is not associated with a resource. You can associate an IPsec-VPN connection with a transit router by calling the [CreateTransitRouterVpnAttachment](~~443993~~) operation.
      * ### [](#)Prerequisites
      * Before you create an IPsec-VPN connection, make sure that you created a customer gateway in the region where you want to create the IPsec-VPN connection. For more information, see [CreateCustomerGateway](~~120368~~).
      * If you want to add BGP configurations to an IPsec-VPN connection, make sure that an autonomous system number (ASN) is assigned to the customer gateway.
      *
     */
    CompletableFuture<CreateVpnAttachmentResponse> createVpnAttachment(CreateVpnAttachmentRequest request);

    /**
      * *   If the VPN gateway supports the dual-tunnel mode, you can specify the following parameters in addition to the required parameters when you call `CreateVpnConnection`:
      *     **ClientToken**, **Name**, **EffectImmediately**, **AutoConfigRoute**, **Tags** array, **TunnelOptionsSpecification** array, and **EnableTunnelsBgp**.
      *     For more information about the regions and zones that support the dual-tunnel mode, see [IPsec-VPN connections support the dual-tunnel mode](~~2358946~~).
      * *   If the VPN gateway supports only the dual-tunnel mode, you can specify the following parameters in addition to the required parameters when you call `CreateVpnConnection`:
      *     **ClientToken**, **CustomerGatewayId**, **Name**, **EffectImmediately**, **IkeConfig**, **IpsecConfig**, **HealthCheckConfig**, **AutoConfigRoute**, **EnableDpd**, **EnableNatTraversal**, **BgpConfig**, **RemoteCaCertificate**, and **Tags** array.
      * *   **CreateVpnConnection** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the IPsec-VPN connection is being created.
      *     *   If the VPN gateway is in the **active** state, the IPsec-VPN connection is created.
      * *   You cannot call **CreateVpnConnection** to create multiple IPsec-VPN connections associated with a VPN gateway at the same time.
      *
     */
    CompletableFuture<CreateVpnConnectionResponse> createVpnConnection(CreateVpnConnectionRequest request);

    /**
      * *   Before you create a VPN gateway, we recommend that you know more about the limits of VPN gateways. For more information, see the [Limits](~~65290~~) section in the "Create and manage a VPN gateway" topic.
      * *   VPN gateways in some regions support only IPsec-VPN connections in dual-tunnel mode. If you call `CreateVpnGateway` in these regions, you must specify **VSwitchId** and **DisasterRecoveryVSwitchId** in addition to the required parameters. For more information about the regions and zones that support the IPsec-VPN connections in dual-tunnel mode, see [IPsec-VPN connections support the dual-tunnel mode](~~2358946~~).
      * *   **CreateVpnGateway** is an asynchronous operation. After you send a request to call this operation, the system returns a request ID and the endpoint service is being created in the backend. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **provisioning** state, the VPN gateway is being created.
      *     *   If the VPN gateway is in the **active** state, the VPN gateway is created.
      *
     */
    CompletableFuture<CreateVpnGatewayResponse> createVpnGateway(CreateVpnGatewayRequest request);

    /**
      * *   Before you call this operation, make sure that you are familiar with the match rules of and limits on policy-based routes. For more information, see [Manage policy-based routes](~~110777~~).
      * *   Before you create a policy-based route, make sure that an IPsec-VPN connection is created. For more information, see [CreateVpnConnection](~~120391~~).
      * *   **CreateVpnPbrRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the policy-based route is being created.
      *     *   If the VPN gateway is in the **active** state, the policy-based route is created.
      * *   You cannot call the **CreateVpnPbrRouteEntry** operation to create multiple policy-based routes for a VPN gateway at a time.
      *
     */
    CompletableFuture<CreateVpnPbrRouteEntryResponse> createVpnPbrRouteEntry(CreateVpnPbrRouteEntryRequest request);

    /**
      * *   **CreateVpnRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the destination-based route entry is being created.
      *     *   If a VPN gateway is in the **active** state, the destination-based route entry has been created.
      * *   You cannot repeatedly call **CreateVpnRouteEntry** to create a destination-based route entry for a VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<CreateVpnRouteEntryResponse> createVpnRouteEntry(CreateVpnRouteEntryRequest request);

    CompletableFuture<DeactivateRouterInterfaceResponse> deactivateRouterInterface(DeactivateRouterInterfaceRequest request);

    /**
      * *   The **DeactiveFlowLog** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      *     *   If the flow log is in the **Deactivating** state, the flow log is being disabled.
      *     *   If the flow log is in the **Inactive** state, the flow log is disabled.
      * *   You cannot repeatedly call the **DeactiveFlowLog** operation to disable a flow log within the specified period of time.
      *
     */
    CompletableFuture<DeactiveFlowLogResponse> deactiveFlowLog(DeactiveFlowLogRequest request);

    CompletableFuture<DeleteBgpGroupResponse> deleteBgpGroup(DeleteBgpGroupRequest request);

    CompletableFuture<DeleteBgpNetworkResponse> deleteBgpNetwork(DeleteBgpNetworkRequest request);

    CompletableFuture<DeleteBgpPeerResponse> deleteBgpPeer(DeleteBgpPeerRequest request);

    /**
      * You cannot repeatedly call the **DeleteCommonBandwidthPackage** operation to delete an Internet Shared Bandwidth instance within the specified period of time.
      *
     */
    CompletableFuture<DeleteCommonBandwidthPackageResponse> deleteCommonBandwidthPackage(DeleteCommonBandwidthPackageRequest request);

    CompletableFuture<DeleteCustomerGatewayResponse> deleteCustomerGateway(DeleteCustomerGatewayRequest request);

    /**
      * ## [](#)Description
      * *   **DeleteDhcpOptionsSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetDhcpOptionsSet](~~189208~~) operation to query the status of the task.
      *     *   If the DHCP options set is in the **Deleting** state, the DHCP options set is being deleted.
      *     *   If you cannot query the DHCP options set, the DHCP options set is deleted.
      * *   You cannot repeatedly call the **DeleteDhcpOptionsSet** operation to delete a DHCP options set within the specified period of time.
      *
     */
    CompletableFuture<DeleteDhcpOptionsSetResponse> deleteDhcpOptionsSet(DeleteDhcpOptionsSetRequest request);

    CompletableFuture<DeleteFailoverTestJobResponse> deleteFailoverTestJob(DeleteFailoverTestJobRequest request);

    /**
      * *   The **DeleteFlowLog** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      *     *   If the flow log is in the **Deleting** state, the flow log is being deleted.
      *     *   If you cannot query the flow log, the flow log is deleted.
      * *   You cannot repeatedly call the **DeleteFlowLog** operation to delete a flow log within the specified period of time.
      *
     */
    CompletableFuture<DeleteFlowLogResponse> deleteFlowLog(DeleteFlowLogRequest request);

    /**
      * ## [](#)Description
      * *   **DeleteForwardEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeForwardTableEntries](~~36053~~) operation to query the status of the task.
      *     *   If the DNAT entry is in the **Deleting** state, the system is deleting the DNAT entry. In this case, you can only query the status of the DNAT entry, but cannot perform other operations.
      *     *   If the DNAT entry cannot be found, it is deleted.
      * >  If a DNAT table has DNAT entries in the **Pending** state, you cannot delete the DNAT entries.
      * *   You cannot repeatedly call the **DeleteForwardEntry** operation to delete a DNAT entry within the specified period of time.
      *
     */
    CompletableFuture<DeleteForwardEntryResponse> deleteForwardEntry(DeleteForwardEntryRequest request);

    /**
      * ## [](#)Description
      * **DeleteFullNatEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListFullNatEntries](~~348779~~) operation to query the status of a FULLNAT entry.
      * *   If the FULLNAT entry is in the **Deleting** state, the system is deleting the FULLNAT entry. In this case, you can query the status of the FULLNAT entry, but cannot perform other operations.
      * *   If the FULLNAT entry cannot be found, the FULLNAT entry is deleted.
      * You cannot repeatedly call the **DeleteFullNatEntry** operation to delete a FULLNAT entry within the specified period of time.
      *
     */
    CompletableFuture<DeleteFullNatEntryResponse> deleteFullNatEntry(DeleteFullNatEntryRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   You can delete only pay-as-you-go instances.
      * *   Before you can delete a dedicated instance, disassociate the backend server from the instance first.
      * *   Before you can delete a shared instance, disassociate the elastic IP address (EIP) from the instance first.
      *
     */
    CompletableFuture<DeleteGlobalAccelerationInstanceResponse> deleteGlobalAccelerationInstance(DeleteGlobalAccelerationInstanceRequest request);

    /**
      * When you call this operation, take note of the following rules:
      * *   You can delete only HAVIPs that are in the Available state.
      * *   Make sure that no route points to the HAVIP that you want to delete.
      * *   Make sure that no elastic IP address (EIP) is associated with the HAVIP that you want to delete.
      * *   The **DeleteHaVip** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeHaVips](~~114611~~) operation to query the status of an HAVIP:
      *     *   If the HAVIP is in the **Deleting** state, the HAVIP is being deleted.
      *     *   If you cannot query the HAVIP, the HAVIP is deleted.
      * *   You cannot repeatedly call the **DeleteHaVip** operation to delete an HAVIP within the specified period of time.
      *
     */
    CompletableFuture<DeleteHaVipResponse> deleteHaVip(DeleteHaVipRequest request);

    CompletableFuture<DeleteIPv6TranslatorResponse> deleteIPv6Translator(DeleteIPv6TranslatorRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteIPv6TranslatorAclListResponse> deleteIPv6TranslatorAclList(DeleteIPv6TranslatorAclListRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DeleteIPv6TranslatorEntryResponse> deleteIPv6TranslatorEntry(DeleteIPv6TranslatorEntryRequest request);

    /**
      * *   **DeleteIpsecServer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the IPsec server is being deleted.
      *     *   If a VPN gateway is in the **active** state, the IPsec server is deleted.
      * *   You cannot repeatedly call **DeleteIpsecServer** to delete an IPsec server from a VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<DeleteIpsecServerResponse> deleteIpsecServer(DeleteIpsecServerRequest request);

    /**
      * ### [](#)Description
      * *   Before you delete an IPv4 gateway, make sure that no route tables are associated with the IPv4 gateway.
      * *   **DeleteIpv4Gateway** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the [GetIpv4GatewayAttribute](~~407670~~) operation to query the status of the task.
      *     *   If the IPv4 gateway is in the **Deleting** state, the IPv4 gateway is being deleted.
      *     *   If the IPv4 gateway cannot be queried, the IPv4 gateway is deleted.
      * *   After you call the **DeleteIpv4Gateway** operation to delete an IPv4 gateway, you cannot call the operation again to delete the IPv4 gateway until the deletion task is complete.
      *
     */
    CompletableFuture<DeleteIpv4GatewayResponse> deleteIpv4Gateway(DeleteIpv4GatewayRequest request);

    /**
      * *   **DeleteIpv6EgressOnlyRule** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeIpv6EgressOnlyRules](~~102208~~) operation to query the status of the task.
      *     *   If the egress-only rule is in the **Deleting** state, the egress-only rule is being deleted.
      *     *   If you cannot query the egress-only rule, the egress-only rule is deleted.
      * *   You cannot call the **DeleteIpv6EgressOnlyRule** operation to delete an egress-only rule within the specified period of time.
      *
     */
    CompletableFuture<DeleteIpv6EgressOnlyRuleResponse> deleteIpv6EgressOnlyRule(DeleteIpv6EgressOnlyRuleRequest request);

    /**
      * Before you delete an IPv6 gateway, you must delete the egress-only rules of the IPv6 gateway. For more information, see [DeleteIpv6EgressOnlyRule](~~102201~~).
      * *   **DeleteIpv6Gateway** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeIpv6GatewayAttribute](~~102226~~) operation to query the status of the task:
      *     *   If the IPv6 gateway is in the **Deleting** state, the IPv6 gateway is being deleted.
      *     *   If you cannot query the IPv6 gateway, the IPv6 gateway is deleted.
      * *   You cannot repeatedly call the **DeleteIpv6Gateway** operation to delete an IPv6 gateway within the specified period of time.
      *
     */
    CompletableFuture<DeleteIpv6GatewayResponse> deleteIpv6Gateway(DeleteIpv6GatewayRequest request);

    /**
      * You cannot call the **DeleteIpv6InternetBandwidth** operation to delete the same Internet bandwidth at the same time.
      *
     */
    CompletableFuture<DeleteIpv6InternetBandwidthResponse> deleteIpv6InternetBandwidth(DeleteIpv6InternetBandwidthRequest request);

    /**
      * ## [](#)Description
      * *   **DeleteNatGateway** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeNatGateways](~~36054~~) to query the status of the task.
      *     *   If a NAT gateway is in the **Deleting** state, the NAT gateway is being deleted. In this case, you can query the NAT gateway but you cannot perform other operations.
      *     *   If the NAT gateway cannot be found, the NAT gateway is deleted.
      *         After you delete a NAT gateway, you cannot restore the NAT gateway. Proceed with caution.
      * *   You cannot repeatedly call the **DeleteNatGateway** operation to delete a NAT gateway within the specified period of time.
      *
     */
    CompletableFuture<DeleteNatGatewayResponse> deleteNatGateway(DeleteNatGatewayRequest request);

    /**
      * ## [](#)Description
      * *   **DeleteNatIp** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListNatIps](~~281979~~) operation to query the status of the task.
      *     *   If the NAT IP address is in the **Deleting** state, the NAT IP address is being deleted. In this case, you can only query the NAT IP address but cannot perform other operations.
      *     *   If the NAT IP address cannot be found, it is deleted.
      * *   You cannot repeatedly call the **DeleteNatIp** operation to delete a NAT IP address within the specified period of time.
      *
     */
    CompletableFuture<DeleteNatIpResponse> deleteNatIp(DeleteNatIpRequest request);

    /**
      * ## [](#)Description
      * You cannot repeatedly call the **DeleteNatIpCidr** operation to delete a NAT CIDR block within the specified period of time.
      *
     */
    CompletableFuture<DeleteNatIpCidrResponse> deleteNatIpCidr(DeleteNatIpCidrRequest request);

    /**
      * ## [](#)Description
      * You cannot repeatedly call the **DeleteNetworkAcl** operation within the specified period of time.
      *
     */
    CompletableFuture<DeleteNetworkAclResponse> deleteNetworkAcl(DeleteNetworkAclRequest request);

    /**
      * You can only delete a connection over an Express Connect circuit that is in the **Rejected**, **Canceled**, **AllocationFailed**, or **Terminated** state.
      *
     */
    CompletableFuture<DeletePhysicalConnectionResponse> deletePhysicalConnection(DeletePhysicalConnectionRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   Before you delete an IP address pool, make sure that no IP address in the pool is being used.
      * *   **DeletePublicIpAddressPool** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListPublicIpAddressPools](~~429433~~) operation to query the status of the task.
      *     *   If the IP address pool is in the **Deleting** state, the IP address pool is being deleted. In this state. you can only query the IP address pool and cannot perform other operations.
      *     *   If you cannot query the IP address pool, the IP address pool is deleted.
      * *   You cannot repeatedly call the **DeletePublicIpAddressPool** operation to delete an IP address pool within the specified period of time.
      *
     */
    CompletableFuture<DeletePublicIpAddressPoolResponse> deletePublicIpAddressPool(DeletePublicIpAddressPoolRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   Before you delete a CIDR block, make sure that it is not being used.
      * *   **DeletePublicIpAddressPoolCidrBlock** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListPublicIpAddressPoolCidrBlocks](~~429436~~) operation to query the status of the task.
      *     *   If the CIDR block is in the **Deleting** state, the CIDR block is being deleted. In this state, you can only query the CIDR block and cannot perform other operations.
      *     *   If you cannot query the CIDR block, the CIDR block is deleted.
      * *   You cannot repeatedly call the **DeletePublicIpAddressPoolCidrBlock** operation to delete a CIDR block within the specified period of time.
      *
     */
    CompletableFuture<DeletePublicIpAddressPoolCidrBlockResponse> deletePublicIpAddressPoolCidrBlock(DeletePublicIpAddressPoolCidrBlockRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   You can delete only routes that are in the **Available** state.
      * *   You cannot delete a route of a virtual private cloud (VPC) in which a vSwitch or another route is being created or deleted.
      * *   **DeleteRouteEntries** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeRouteEntryList](~~138148~~) operation to query the status of the task.
      *     *   If the route is in the **Deleting** state, the route is being deleted.
      *     *   If you cannot query the route, the route is deleted.
      * *   You cannot repeatedly call **DeleteRouteEntries** within a specific period of time.
      *
     */
    CompletableFuture<DeleteRouteEntriesResponse> deleteRouteEntries(DeleteRouteEntriesRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   You can delete only routes that are in the **Available** state.
      * *   You cannot delete a route entry of a virtual private cloud (VPC) in which a vSwitch or another route entry is being created or deleted.
      * *   Before you call this operation to delete a route of a VBR route table, call the [DescribeRouteEntryList](~~138148~~) operation to query the **NextHopId** of the route first.
      * *   **DeleteRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeRouteEntryList](~~138148~~) operation to query the status of the task.
      *     *   If the route is in the **Deleting** state, the route is being deleted.
      *     *   If you cannot query the route entry, the route entry is deleted.
      * *   You cannot repeatedly call the **DeleteRouteEntry** operation to delete a route from the route table of a vRouter or a VBR within the specified period of time.
      *
     */
    CompletableFuture<DeleteRouteEntryResponse> deleteRouteEntry(DeleteRouteEntryRequest request);

    /**
      * ## [](#)Description
      * *   **DeleteRouteTable** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeRouteTableList](~~87602~~) operation to query the status of the task.
      *     *   If the custom route table is in the **Deleting** state, the custom route table is being deleted.
      *     *   If you cannot query the custom route table, the custom route table is deleted.
      * *   You cannot repeatedly call the **DeleteRouteTable** operation to delete a custom route table within the specified period of time.
      *
     */
    CompletableFuture<DeleteRouteTableResponse> deleteRouteTable(DeleteRouteTableRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * *   You can delete only a router interface that is in the **Idle** or **Inactive** state.
      * *   Before you delete a router interface, you must delete all custom route entries destined for the router interface.
      *
     */
    CompletableFuture<DeleteRouterInterfaceResponse> deleteRouterInterface(DeleteRouterInterfaceRequest request);

    /**
      * DeleteSnatEntry is an asynchronous operation. After you make a request, the ID of the request is returned but the specified SNAT entry is not deleted. The system deletes the SNAT entry in the background. You can call the [DescribeSnatTableEntries](~~42677~~) operation to query the status of SNAT entries.
      * *   If the SNAT entries are in the **Deleting** state, the system is deleting the SNAT entries. In this case, you can only query the status of the SNAT entries, and cannot perform other operations.
      * *   If no SNAT entry is returned in the response, the SNAT entry is deleted.
      * If some SNAT entries are in the **Pending** state, you cannot delete these SNAT entries.
      *
     */
    CompletableFuture<DeleteSnatEntryResponse> deleteSnatEntry(DeleteSnatEntryRequest request);

    /**
      * *   **DeleteSslVpnClientCert** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the SSL client certificate is being deleted.
      *     *   If the VPN gateway is in the **active** state, the SSL client certificate is deleted.
      * *   You cannot repeatedly call **DeleteSslVpnClientCert** to delete an SSL client certificate from the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<DeleteSslVpnClientCertResponse> deleteSslVpnClientCert(DeleteSslVpnClientCertRequest request);

    /**
      * *   **DeleteSslVpnServer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the SSL server is being deleted.
      *     *   If the VPN gateway is in the **active** state, the SSL server is deleted.
      * *   You cannot repeatedly call the **DeleteSslVpnServer** operation to delete an SSL server from the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<DeleteSslVpnServerResponse> deleteSslVpnServer(DeleteSslVpnServerRequest request);

    /**
      * *   The **DeleteTrafficMirrorFilter** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListTrafficMirrorFilters](~~261353~~) operation to query the status of a filter:
      *     *   If the filter is in the **Deleting** state, the filter is being deleted.
      *     *   If you cannot query the filter, the filter is deleted.
      * *   You cannot repeatedly call the **DeleteTrafficMirrorFilter** operation to delete a filter within the specified period of time.
      *
     */
    CompletableFuture<DeleteTrafficMirrorFilterResponse> deleteTrafficMirrorFilter(DeleteTrafficMirrorFilterRequest request);

    /**
      * *   The **DeleteTrafficMirrorFilterRules** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListTrafficMirrorFilters](~~261353~~) operation to query the status of an inbound or outbound rule:
      *     *   If the rule is in the **Deleting** state, the rule is being deleted.
      *     *   If you cannot query the rule, the rule is deleted.
      * *   You cannot repeatedly call the **DeleteTrafficMirrorFilterRules** operation to delete an inbound or outbound rule within the specified period of time.
      *
     */
    CompletableFuture<DeleteTrafficMirrorFilterRulesResponse> deleteTrafficMirrorFilterRules(DeleteTrafficMirrorFilterRulesRequest request);

    /**
      * *   **DeleteTrafficMirrorSession** is an asynchronous operation. After you send the request, the system returns a request ID and runs the task in the background. You can call the [ListTrafficMirrorSessions](~~261367~~) operation to query the status of a traffic mirror session.
      *     *   If the traffic mirror session is in the **Deleting** state, the traffic mirror session is being deleted.
      *     *   If you cannot query the traffic mirror session, the traffic mirror session is deleted.
      * *   You cannot repeatedly call the **DeleteTrafficMirrorSession** operation to delete a traffic mirror session within the specified period of time.
      *
     */
    CompletableFuture<DeleteTrafficMirrorSessionResponse> deleteTrafficMirrorSession(DeleteTrafficMirrorSessionRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * *   Before you delete a vSwitch, you must first release or remove all virtual private cloud (VPC) resources, including vSwitches, instances, router interfaces, and high-availability virtual IP addresses (HAVIPs).
      * *   You can delete only vSwitches that are in the **Available** state.
      * *   You cannot delete a vSwitch from a VPC where a vSwitch or a route is being created or deleted.
      * *   **DeleteVSwitch** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of the task:
      *     *   If the vSwitch is in the **Pending** state, the vSwitch is being deleted.
      *     *   If you cannot query the vSwitch, the vSwitch is deleted.
      * *   You cannot repeatedly call the **DeleteVSwitch** operation to delete a vSwitch within the specified period of time.
      *
     */
    CompletableFuture<DeleteVSwitchResponse> deleteVSwitch(DeleteVSwitchRequest request);

    /**
      * ## [](#)Description
      * *   Before you call this operation, make sure that the IP address allocated to an elastic network interface (ENI) from the reserved CIDR block is deleted. If the IP address of the ENI is not deleted, call [UnassignPrivateIpAddresses](~~85919~~) or [UnassignIpv6Addresses](~~98611~~) to delete the IPv4 or IPv6 address.
      * *   **DeleteVSwitchCidrReservation** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [ListVSwitchCidrReservations](~~610155~~) to query the status of the task:
      *     *   If the reserved CIDR block is in the **Releasing** state, it is being released.
      *     *   If the reserved CIDR block is in the **Released** state, it is released.
      *
     */
    CompletableFuture<DeleteVSwitchCidrReservationResponse> deleteVSwitchCidrReservation(DeleteVSwitchCidrReservationRequest request);

    CompletableFuture<DeleteVbrHaResponse> deleteVbrHa(DeleteVbrHaRequest request);

    /**
      * *   **DeleteVcoRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of the task.
      *     *   If the IPsec-VPN connection is in the **updating** state, the route is being deleted.
      *     *   If the IPsec-VPN connection is in the **attached** state, the route is deleted.
      * *   You cannot repeatedly call the **DeleteVcoRouteEntry** operation within a specific time period.
      *
     */
    CompletableFuture<DeleteVcoRouteEntryResponse> deleteVcoRouteEntry(DeleteVcoRouteEntryRequest request);

    /**
      * Before you call this operation, take note of the following limits:
      * *   Before you delete a VBR, you must delete all router interfaces of the VBR.
      * *   You can delete only a VBR in the **unconfirmed**, **active**, or **terminated** state.
      * *   If the VBR belongs to another Alibaba Cloud account, you can delete the VBR only if it is in the **unconfirmed** state.
      *
     */
    CompletableFuture<DeleteVirtualBorderRouterResponse> deleteVirtualBorderRouter(DeleteVirtualBorderRouterRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * *   Before you delete a VPC, make sure that all resources deployed in the VPC are released or removed, such as vSwitches, instances, and high-availability virtual IP addresses (HAVIPs).
      * *   You can delete only a VPC that is in the **Available** state.
      * *   The **DeleteVpc** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of a VPC:
      *     *   If the VPC is in the **Deleting** state, the VPC is being deleted.
      *     *   If you cannot query the VPC, the VPC is deleted.
      * *   You cannot repeatedly call the **DeleteVpc** operation to delete a VPC within the specified period of time.
      *
     */
    CompletableFuture<DeleteVpcResponse> deleteVpc(DeleteVpcRequest request);

    CompletableFuture<DeleteVpcGatewayEndpointResponse> deleteVpcGatewayEndpoint(DeleteVpcGatewayEndpointRequest request);

    /**
      * You cannot repeatedly call the **DeleteDhcpOptionsSet** operation to delete a prefix list within the specified period of time.
      *
     */
    CompletableFuture<DeleteVpcPrefixListResponse> deleteVpcPrefixList(DeleteVpcPrefixListRequest request);

    /**
      * *   If the IPsec-VPN connection is associated with a transit router, you must first disassociate the IPsec-VPN connection from the transit router before you delete the IPsec-VPN connection.
      * *   If the IPsec-VPN connection is not associated with a resource, you can call the `DeleteVpnAttachment` to delete the IPsec-VPN connection.
      *
     */
    CompletableFuture<DeleteVpnAttachmentResponse> deleteVpnAttachment(DeleteVpnAttachmentRequest request);

    /**
      * *   **DeleteVpnConnection** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the IPsec-VPN connection is being deleted.
      *     *   If the VPN gateway is in the **active** state, the IPsec-VPN connection is deleted.
      * *   You cannot repeatedly call **DeleteVpnConnection** to delete an IPsec-VPN connection from the same VPN gateway within the specified period of time.
      * >  After an IPsec-VPN connection between a virtual private cloud (VPC) and a data center is deleted, the communication between the VPC and data center is interrupted.
      *
     */
    CompletableFuture<DeleteVpnConnectionResponse> deleteVpnConnection(DeleteVpnConnectionRequest request);

    /**
      * >  You cannot delete a VPN gateway associated with existing IPsec-VPN connections.
      *
     */
    CompletableFuture<DeleteVpnGatewayResponse> deleteVpnGateway(DeleteVpnGatewayRequest request);

    /**
      * *   **DeleteVpnPbrRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the policy-based route is being deleted.
      *     *   If a VPN gateway is in the **active** state, the policy-based route has been deleted.
      * *   You cannot repeatedly call **DeleteVpnPbrRouteEntry** to delete a policy-based route within the specified period of time.
      *
     */
    CompletableFuture<DeleteVpnPbrRouteEntryResponse> deleteVpnPbrRouteEntry(DeleteVpnPbrRouteEntryRequest request);

    /**
      * *   **DeleteVpnRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the destination-based route is being deleted.
      *     *   If the VPN gateway is in the **active** state, the destination-based route is deleted.
      * *   You cannot repeatedly call **DeleteVpnRouteEntry** to delete a destination-based route from a VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<DeleteVpnRouteEntryResponse> deleteVpnRouteEntry(DeleteVpnRouteEntryRequest request);

    /**
      * After you enable deletion protection for an instance, you cannot delete the instance. You must disable deletion protection before you can delete the instance.
      *
     */
    CompletableFuture<DeletionProtectionResponse> deletionProtection(DeletionProtectionRequest request);

    CompletableFuture<DescribeAccessPointsResponse> describeAccessPoints(DescribeAccessPointsRequest request);

    CompletableFuture<DescribeBgpGroupsResponse> describeBgpGroups(DescribeBgpGroupsRequest request);

    CompletableFuture<DescribeBgpNetworksResponse> describeBgpNetworks(DescribeBgpNetworksRequest request);

    CompletableFuture<DescribeBgpPeersResponse> describeBgpPeers(DescribeBgpPeersRequest request);

    CompletableFuture<DescribeCommonBandwidthPackagesResponse> describeCommonBandwidthPackages(DescribeCommonBandwidthPackagesRequest request);

    CompletableFuture<DescribeCustomerGatewayResponse> describeCustomerGateway(DescribeCustomerGatewayRequest request);

    CompletableFuture<DescribeCustomerGatewaysResponse> describeCustomerGateways(DescribeCustomerGatewaysRequest request);

    CompletableFuture<DescribeEcGrantRelationResponse> describeEcGrantRelation(DescribeEcGrantRelationRequest request);

    /**
      * You can call this operation to query information about EIPs in a region, including maximum bandwidth, billing methods, and associated instances.
      *
     */
    CompletableFuture<DescribeEipAddressesResponse> describeEipAddresses(DescribeEipAddressesRequest request);

    /**
      * You can query only EIPs that are associated with secondary elastic network interfaces (ENIs) in multi-EIP-to-ENI mode.
      *
     */
    CompletableFuture<DescribeEipGatewayInfoResponse> describeEipGatewayInfo(DescribeEipGatewayInfoRequest request);

    /**
      * To improve user experience in querying monitoring data, we recommend that you call the DescribeMetricList API operation provided by CloudMonitor to query EIP monitoring data. For more information, see [DescribeMetricList](~~51936~~) and [EIP monitoring data](~~162874~~).
      *
     */
    CompletableFuture<DescribeEipMonitorDataResponse> describeEipMonitorData(DescribeEipMonitorDataRequest request);

    CompletableFuture<DescribeEipSegmentResponse> describeEipSegment(DescribeEipSegmentRequest request);

    CompletableFuture<DescribeFailoverTestJobResponse> describeFailoverTestJob(DescribeFailoverTestJobRequest request);

    CompletableFuture<DescribeFailoverTestJobsResponse> describeFailoverTestJobs(DescribeFailoverTestJobsRequest request);

    CompletableFuture<DescribeFlowLogsResponse> describeFlowLogs(DescribeFlowLogsRequest request);

    CompletableFuture<DescribeForwardTableEntriesResponse> describeForwardTableEntries(DescribeForwardTableEntriesRequest request);

    CompletableFuture<DescribeGlobalAccelerationInstancesResponse> describeGlobalAccelerationInstances(DescribeGlobalAccelerationInstancesRequest request);

    CompletableFuture<DescribeGrantRulesToCenResponse> describeGrantRulesToCen(DescribeGrantRulesToCenRequest request);

    CompletableFuture<DescribeHaVipsResponse> describeHaVips(DescribeHaVipsRequest request);

    CompletableFuture<DescribeHighDefinitionMonitorLogAttributeResponse> describeHighDefinitionMonitorLogAttribute(DescribeHighDefinitionMonitorLogAttributeRequest request);

    CompletableFuture<DescribeIPv6TranslatorAclListAttributesResponse> describeIPv6TranslatorAclListAttributes(DescribeIPv6TranslatorAclListAttributesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeIPv6TranslatorAclListsResponse> describeIPv6TranslatorAclLists(DescribeIPv6TranslatorAclListsRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeIPv6TranslatorEntriesResponse> describeIPv6TranslatorEntries(DescribeIPv6TranslatorEntriesRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<DescribeIPv6TranslatorsResponse> describeIPv6Translators(DescribeIPv6TranslatorsRequest request);

    CompletableFuture<DescribeIpv6AddressesResponse> describeIpv6Addresses(DescribeIpv6AddressesRequest request);

    CompletableFuture<DescribeIpv6EgressOnlyRulesResponse> describeIpv6EgressOnlyRules(DescribeIpv6EgressOnlyRulesRequest request);

    CompletableFuture<DescribeIpv6GatewayAttributeResponse> describeIpv6GatewayAttribute(DescribeIpv6GatewayAttributeRequest request);

    CompletableFuture<DescribeIpv6GatewaysResponse> describeIpv6Gateways(DescribeIpv6GatewaysRequest request);

    /**
      * You can call this operation to query both Virtual Private Cloud (VPC) NAT gateways and Internet NAT gateways. NAT gateways in this topic refer to both VPC NAT gateways and Internet NAT gateways.
      *
     */
    CompletableFuture<DescribeNatGatewaysResponse> describeNatGateways(DescribeNatGatewaysRequest request);

    CompletableFuture<DescribeNetworkAclAttributesResponse> describeNetworkAclAttributes(DescribeNetworkAclAttributesRequest request);

    CompletableFuture<DescribeNetworkAclsResponse> describeNetworkAcls(DescribeNetworkAclsRequest request);

    CompletableFuture<DescribePhysicalConnectionLOAResponse> describePhysicalConnectionLOA(DescribePhysicalConnectionLOARequest request);

    /**
      * By default, the system queries information about all Express Connect circuits in the specified region. You can query Express Connect circuits that meet specific conditions by specifying filter conditions provided by the **DescribePhysicalConnections** operation. For more information about the supported filter conditions, see **Key** in the **Request parameters** section.
      *
     */
    CompletableFuture<DescribePhysicalConnectionsResponse> describePhysicalConnections(DescribePhysicalConnectionsRequest request);

    /**
      * You cannot query the range of public IP addresses of a classic network by calling the **DescribePublicIpAddress** operation.
      *
     */
    CompletableFuture<DescribePublicIpAddressResponse> describePublicIpAddress(DescribePublicIpAddressRequest request);

    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
      * ## [](#)References
      * Before you call the [DeleteRouteEntry](~~36013~~) operation to delete a route, you can call this operation to query the next hop of the route that you want to delete.
      *
     */
    CompletableFuture<DescribeRouteEntryListResponse> describeRouteEntryList(DescribeRouteEntryListRequest request);

    CompletableFuture<DescribeRouteTableListResponse> describeRouteTableList(DescribeRouteTableListRequest request);

    CompletableFuture<DescribeRouteTablesResponse> describeRouteTables(DescribeRouteTablesRequest request);

    CompletableFuture<DescribeRouterInterfaceAttributeResponse> describeRouterInterfaceAttribute(DescribeRouterInterfaceAttributeRequest request);

    CompletableFuture<DescribeRouterInterfacesResponse> describeRouterInterfaces(DescribeRouterInterfacesRequest request);

    /**
      * > You can call this operation to query only dedicated-bandwidth GA instances.
      *
     */
    CompletableFuture<DescribeServerRelatedGlobalAccelerationInstancesResponse> describeServerRelatedGlobalAccelerationInstances(DescribeServerRelatedGlobalAccelerationInstancesRequest request);

    CompletableFuture<DescribeSnatTableEntriesResponse> describeSnatTableEntries(DescribeSnatTableEntriesRequest request);

    CompletableFuture<DescribeSslVpnClientCertResponse> describeSslVpnClientCert(DescribeSslVpnClientCertRequest request);

    CompletableFuture<DescribeSslVpnClientCertsResponse> describeSslVpnClientCerts(DescribeSslVpnClientCertsRequest request);

    /**
      * If your VPN gateway was created before December 10, 2022, you must upgrade your VPN gateway to the latest version before you can view connection information about SSL clients. For more information, see [Upgrade a VPN gateway](~~303968~~).
      * If your VPN gateway was created after December 10, 2022, you can view connection information about SSL clients by default.
      *
     */
    CompletableFuture<DescribeSslVpnClientsResponse> describeSslVpnClients(DescribeSslVpnClientsRequest request);

    CompletableFuture<DescribeSslVpnServersResponse> describeSslVpnServers(DescribeSslVpnServersRequest request);

    CompletableFuture<DescribeTagKeysResponse> describeTagKeys(DescribeTagKeysRequest request);

    CompletableFuture<DescribeTagKeysForExpressConnectResponse> describeTagKeysForExpressConnect(DescribeTagKeysForExpressConnectRequest request);

    /**
      * *   You must specify **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object that you want to query.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you specify only **Tag.N.Key**, all tag values that are associated with the specified tag key are returned. If you specify only **Tag.N.Value**, an error message is returned.
      * *   If you specify **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, all tags that match the key-value pairs are returned.
      *
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    CompletableFuture<DescribeVRoutersResponse> describeVRouters(DescribeVRoutersRequest request);

    CompletableFuture<DescribeVSwitchAttributesResponse> describeVSwitchAttributes(DescribeVSwitchAttributesRequest request);

    CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request);

    CompletableFuture<DescribeVbrHaResponse> describeVbrHa(DescribeVbrHaRequest request);

    CompletableFuture<DescribeVcoRouteEntriesResponse> describeVcoRouteEntries(DescribeVcoRouteEntriesRequest request);

    CompletableFuture<DescribeVirtualBorderRoutersResponse> describeVirtualBorderRouters(DescribeVirtualBorderRoutersRequest request);

    CompletableFuture<DescribeVirtualBorderRoutersForPhysicalConnectionResponse> describeVirtualBorderRoutersForPhysicalConnection(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request);

    CompletableFuture<DescribeVpcAttributeResponse> describeVpcAttribute(DescribeVpcAttributeRequest request);

    CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request);

    CompletableFuture<DescribeVpnAttachmentsResponse> describeVpnAttachments(DescribeVpnAttachmentsRequest request);

    CompletableFuture<DescribeVpnConnectionResponse> describeVpnConnection(DescribeVpnConnectionRequest request);

    CompletableFuture<DescribeVpnConnectionLogsResponse> describeVpnConnectionLogs(DescribeVpnConnectionLogsRequest request);

    CompletableFuture<DescribeVpnConnectionsResponse> describeVpnConnections(DescribeVpnConnectionsRequest request);

    CompletableFuture<DescribeVpnCrossAccountAuthorizationsResponse> describeVpnCrossAccountAuthorizations(DescribeVpnCrossAccountAuthorizationsRequest request);

    CompletableFuture<DescribeVpnGatewayResponse> describeVpnGateway(DescribeVpnGatewayRequest request);

    CompletableFuture<DescribeVpnGatewayAvailableZonesResponse> describeVpnGatewayAvailableZones(DescribeVpnGatewayAvailableZonesRequest request);

    CompletableFuture<DescribeVpnGatewaysResponse> describeVpnGateways(DescribeVpnGatewaysRequest request);

    CompletableFuture<DescribeVpnPbrRouteEntriesResponse> describeVpnPbrRouteEntries(DescribeVpnPbrRouteEntriesRequest request);

    CompletableFuture<DescribeVpnRouteEntriesResponse> describeVpnRouteEntries(DescribeVpnRouteEntriesRequest request);

    CompletableFuture<DescribeVpnSslServerLogsResponse> describeVpnSslServerLogs(DescribeVpnSslServerLogsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
      * ## [](#)Description
      * *   **DetachDhcpOptionsSetFromVpc** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of the task.
      *     *   If the DHCP options set is in the **Pending** state, the DHCP options set is being disassociated.
      *     *   If the DHCP options set is in the **UnUsed** state, the DHCP options set is disassociated.
      * *   You cannot repeatedly call the **DetachDhcpOptionsSetFromVpc** operation to disassociate a DHCP options set from a VPC within the specified period of time.
      *
     */
    CompletableFuture<DetachDhcpOptionsSetFromVpcResponse> detachDhcpOptionsSetFromVpc(DetachDhcpOptionsSetFromVpcRequest request);

    CompletableFuture<DiagnoseVpnConnectionsResponse> diagnoseVpnConnections(DiagnoseVpnConnectionsRequest request);

    /**
      * Only VPN gateways in specific regions support the quick diagnostics feature. For more information about the supported regions, see [Supported regions](~~430697~~).
      *
     */
    CompletableFuture<DiagnoseVpnGatewayResponse> diagnoseVpnGateway(DiagnoseVpnGatewayRequest request);

    CompletableFuture<DisableNatGatewayEcsMetricResponse> disableNatGatewayEcsMetric(DisableNatGatewayEcsMetricRequest request);

    CompletableFuture<DisableVpcClassicLinkResponse> disableVpcClassicLink(DisableVpcClassicLinkRequest request);

    CompletableFuture<DissociateRouteTableFromGatewayResponse> dissociateRouteTableFromGateway(DissociateRouteTableFromGatewayRequest request);

    CompletableFuture<DissociateRouteTablesFromVpcGatewayEndpointResponse> dissociateRouteTablesFromVpcGatewayEndpoint(DissociateRouteTablesFromVpcGatewayEndpointRequest request);

    /**
      * *   **DissociateVpnGatewayWithCertificate** is an asynchronous operation. After a request is sent, the system returns a request and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status the task.
      *     *   If the VPN gateway is in the **updating** state, the SSL certificate is being disassociated from the VPN gateway.
      *     *   If the VPN gateway is in the **active** state, the SSL certificate is disassociated from the VPN gateway.
      * *   You cannot repeatedly call **DissociateVpnGatewayWithCertificate** within a specific period of time.
      *
     */
    CompletableFuture<DissociateVpnGatewayWithCertificateResponse> dissociateVpnGatewayWithCertificate(DissociateVpnGatewayWithCertificateRequest request);

    CompletableFuture<DownloadVpnConnectionConfigResponse> downloadVpnConnectionConfig(DownloadVpnConnectionConfigRequest request);

    CompletableFuture<EnableNatGatewayEcsMetricResponse> enableNatGatewayEcsMetric(EnableNatGatewayEcsMetricRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * *   You can enable only an Express Connect circuit that is in the **Confirmed** state.
      * *   After you enable an Express Connect circuit, it enters the **Enabled** state.
      * *   **EnablePhysicalConnection** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribePhysicalConnections](~~36042~~) operation to query the status of the task.
      * *   You cannot repeatedly call **EnablePhysicalConnection** for an Express Connect circuit in the **Confirmed** state within a specific time period.
      *
     */
    CompletableFuture<EnablePhysicalConnectionResponse> enablePhysicalConnection(EnablePhysicalConnectionRequest request);

    CompletableFuture<EnableVpcClassicLinkResponse> enableVpcClassicLink(EnableVpcClassicLinkRequest request);

    /**
      * ## [](#)Description
      * *   **EnableVpcIpv4Gateway** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the [GetIpv4GatewayAttribute](~~407670~~) operation to query the status of an IPv4 gateway.
      *     *   If the IPv4 gateway is in the **Activating** state, the IPv4 gateway is being activated.
      *     *   If the IPv4 gateway is in the **Created** state, the IPv4 gateway is activated.
      * *   You cannot repeatedly call the **EnableVpcIpv4Gateway** operation to activate an IPv4 gateway within the specified period of time.
      *
     */
    CompletableFuture<EnableVpcIpv4GatewayResponse> enableVpcIpv4Gateway(EnableVpcIpv4GatewayRequest request);

    CompletableFuture<GetDhcpOptionsSetResponse> getDhcpOptionsSet(GetDhcpOptionsSetRequest request);

    CompletableFuture<GetFlowLogServiceStatusResponse> getFlowLogServiceStatus(GetFlowLogServiceStatusRequest request);

    CompletableFuture<GetIpv4GatewayAttributeResponse> getIpv4GatewayAttribute(GetIpv4GatewayAttributeRequest request);

    /**
      * You can call this operation to query information about a specified Internet NAT gateway or Virtual Private Cloud (VPC) NAT gateway. In this topic, "NAT gateway" refers to both gateway types.
      *
     */
    CompletableFuture<GetNatGatewayAttributeResponse> getNatGatewayAttribute(GetNatGatewayAttributeRequest request);

    /**
      * You can call this API operation to query the status of outbound data transfer billing for the current account. For more information about outbound data transfer billing, see [Outbound data transfer billing](~~274385~~) and [Billing](~~54582~~).
      *
     */
    CompletableFuture<GetPhysicalConnectionServiceStatusResponse> getPhysicalConnectionServiceStatus(GetPhysicalConnectionServiceStatusRequest request);

    CompletableFuture<GetTrafficMirrorServiceStatusResponse> getTrafficMirrorServiceStatus(GetTrafficMirrorServiceStatusRequest request);

    CompletableFuture<GetVSwitchCidrReservationUsageResponse> getVSwitchCidrReservationUsage(GetVSwitchCidrReservationUsageRequest request);

    CompletableFuture<GetVpcGatewayEndpointAttributeResponse> getVpcGatewayEndpointAttribute(GetVpcGatewayEndpointAttributeRequest request);

    CompletableFuture<GetVpcPrefixListAssociationsResponse> getVpcPrefixListAssociations(GetVpcPrefixListAssociationsRequest request);

    CompletableFuture<GetVpcPrefixListEntriesResponse> getVpcPrefixListEntries(GetVpcPrefixListEntriesRequest request);

    CompletableFuture<GetVpcRouteEntrySummaryResponse> getVpcRouteEntrySummary(GetVpcRouteEntrySummaryRequest request);

    /**
      * When you call the **GetVpnGatewayDiagnoseResult** operation, you must specify one of **DiagnoseId** and **VpnGatewayId**.
      *
     */
    CompletableFuture<GetVpnGatewayDiagnoseResultResponse> getVpnGatewayDiagnoseResult(GetVpnGatewayDiagnoseResultRequest request);

    /**
      * *   Before you can attach a network instance that belongs to another Alibaba Cloud account to your CEN instance, you must grant permissions to your CEN instance.
      * >  **GrantInstanceToCen** is a Virtual Private Cloud (VPC) operation. Therefore, you must use the `vpc.aliyuncs.com` domain name to call this operation. The API version is `2016-04-28`.
      * *   You cannot repeatedly call the **GrantInstanceToCen** operation to grant the permissions on a network instance to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.
      *
     */
    CompletableFuture<GrantInstanceToCenResponse> grantInstanceToCen(GrantInstanceToCenRequest request);

    /**
      * ## Usage notes
      * When you connect a VBR to a VPC that belongs to another Alibaba Cloud account, the VBR must acquire the required permissions from the VPC.
      *
     */
    CompletableFuture<GrantInstanceToVbrResponse> grantInstanceToVbr(GrantInstanceToVbrRequest request);

    CompletableFuture<ListBusinessAccessPointsResponse> listBusinessAccessPoints(ListBusinessAccessPointsRequest request);

    CompletableFuture<ListDhcpOptionsSetsResponse> listDhcpOptionsSets(ListDhcpOptionsSetsRequest request);

    /**
      * You can call this operation to query zones that support NAT gateways, including Internet NAT gateways and Virtual Private Cloud (VPC) NAT gateways.
      *
     */
    CompletableFuture<ListEnhanhcedNatGatewayAvailableZonesResponse> listEnhanhcedNatGatewayAvailableZones(ListEnhanhcedNatGatewayAvailableZonesRequest request);

    CompletableFuture<ListFullNatEntriesResponse> listFullNatEntries(ListFullNatEntriesRequest request);

    CompletableFuture<ListGatewayRouteTableEntriesResponse> listGatewayRouteTableEntries(ListGatewayRouteTableEntriesRequest request);

    CompletableFuture<ListGeographicSubRegionsResponse> listGeographicSubRegions(ListGeographicSubRegionsRequest request);

    CompletableFuture<ListIpsecServerLogsResponse> listIpsecServerLogs(ListIpsecServerLogsRequest request);

    CompletableFuture<ListIpsecServersResponse> listIpsecServers(ListIpsecServersRequest request);

    CompletableFuture<ListIpv4GatewaysResponse> listIpv4Gateways(ListIpv4GatewaysRequest request);

    CompletableFuture<ListNatIpCidrsResponse> listNatIpCidrs(ListNatIpCidrsRequest request);

    CompletableFuture<ListNatIpsResponse> listNatIps(ListNatIpsRequest request);

    CompletableFuture<ListPrefixListsResponse> listPrefixLists(ListPrefixListsRequest request);

    CompletableFuture<ListPublicIpAddressPoolCidrBlocksResponse> listPublicIpAddressPoolCidrBlocks(ListPublicIpAddressPoolCidrBlocksRequest request);

    CompletableFuture<ListPublicIpAddressPoolsResponse> listPublicIpAddressPools(ListPublicIpAddressPoolsRequest request);

    /**
      * ## Usage notes
      * *   You must specify **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object that you want to query.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you specify only **Tag.N.Key**, all tag values that are associated with the specified key are returned. If you specify only **Tag.N.Value**, an error message is returned.
      * *   If you specify **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * ## [](#)
      * *   If you want to query a specific object, you must specify **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you specify only **Tag.N.Key**, all tag values that are associated with the specified key are returned. If you specify only **Tag.N.Value**, an error message is returned.
      * *   If you specify **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.
      *
     */
    CompletableFuture<ListTagResourcesForExpressConnectResponse> listTagResourcesForExpressConnect(ListTagResourcesForExpressConnectRequest request);

    CompletableFuture<ListTrafficMirrorFiltersResponse> listTrafficMirrorFilters(ListTrafficMirrorFiltersRequest request);

    CompletableFuture<ListTrafficMirrorSessionsResponse> listTrafficMirrorSessions(ListTrafficMirrorSessionsRequest request);

    CompletableFuture<ListVSwitchCidrReservationsResponse> listVSwitchCidrReservations(ListVSwitchCidrReservationsRequest request);

    CompletableFuture<ListVirtualPhysicalConnectionsResponse> listVirtualPhysicalConnections(ListVirtualPhysicalConnectionsRequest request);

    CompletableFuture<ListVpcEndpointServicesByEndUserResponse> listVpcEndpointServicesByEndUser(ListVpcEndpointServicesByEndUserRequest request);

    CompletableFuture<ListVpcGatewayEndpointsResponse> listVpcGatewayEndpoints(ListVpcGatewayEndpointsRequest request);

    /**
      * When you call **ListVpnCertificateAssociations**, take note of the following information:
      * *   If you specify only **RegionId**, the SSL certificates associated with all VPN gateways in the specified region are queried.
      * *   If you specify **RegionId** and **CertificateType**, the SSL certificates of the specified type that are associated with the VPN gateways in the specified region are queried.
      * *   If you specify **RegionId** and **VpnGatewayId**, the SSL certificates associated with the specified VPN gateway in the specified region are queried.
      * *   If you specify **RegionId** and **CertificateId**, the VPN gateways associated with the specified SSL certificate in the specified region are queried.
      *
     */
    CompletableFuture<ListVpnCertificateAssociationsResponse> listVpnCertificateAssociations(ListVpnCertificateAssociationsRequest request);

    CompletableFuture<ModifyBgpGroupAttributeResponse> modifyBgpGroupAttribute(ModifyBgpGroupAttributeRequest request);

    CompletableFuture<ModifyBgpPeerAttributeResponse> modifyBgpPeerAttribute(ModifyBgpPeerAttributeRequest request);

    CompletableFuture<ModifyCommonBandwidthPackageAttributeResponse> modifyCommonBandwidthPackageAttribute(ModifyCommonBandwidthPackageAttributeRequest request);

    /**
      * You can call the **ModifyCommonBandwidthPackageIpBandwidth** operation to set the maximum bandwidth of an EIP that is associated with an Internet Shared Bandwidth instance. This prevents an EIP from exhausting the bandwidth resources of an Internet Shared Bandwidth instance.
      * For example, two EIPs are associated with an Internet Shared Bandwidth instance whose maximum bandwidth is 800 Mbit/s. In this case, you can set the maximum bandwidth of one EIP to 500 Mbit/s and that of the other EIP to 400 Mbit/s. After you set the maximum bandwidth values, the first EIP cannot consume bandwidth higher than 500 Mbit/s. The second EIP cannot consume bandwidth higher than 400 Mbit/s.
      * When you call this operation, take note of the following items:
      * *   This operation is valid only for EIPs that are associated with Elastic Compute Service (ECS) instances. This operation is invalid for EIPs that are associated with Server Load Balancer (SLB) instances, NAT gateways, secondary elastic network interfaces (ENIs), or high-availability virtual IP addresses (HAVIPs).
      * *   This operation is in public preview. You can call this operation to set the maximum bandwidth of EIPs only if the EIPs are associated with an Internet Shared Bandwidth instance. The feature is not supported in the console.
      * *   You cannot repeatedly call this operation to set the maximum bandwidth of an EIP within the specified period of time.
      *
     */
    CompletableFuture<ModifyCommonBandwidthPackageIpBandwidthResponse> modifyCommonBandwidthPackageIpBandwidth(ModifyCommonBandwidthPackageIpBandwidthRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   **ModifyCommonBandwidthPackageSpec** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeCommonBandwidthPackages](~~120309~~) operation to query the status of the task.
      *     *   If the Internet Shared Bandwidth instance is in the **Modifying** state, the maximum bandwidth of the Internet Shared Bandwidth instance is being modified. In this state, you can only query the Internet Shared Bandwidth instance and cannot perform other operations.
      *     *   If the Internet Shared Bandwidth instance is in the **Available** state, the maximum bandwidth of the Internet Shared Bandwidth instance is modified.
      * *   You cannot repeatedly call the **ModifyCommonBandwidthPackageSpec** operation to modify the maximum bandwidth of an Internet Shared Bandwidth instance within the specified period of time.
      *
     */
    CompletableFuture<ModifyCommonBandwidthPackageSpecResponse> modifyCommonBandwidthPackageSpec(ModifyCommonBandwidthPackageSpecRequest request);

    /**
      * *   When you call **ModifyCustomerGatewayAttribute**, if a value is assigned to **AuthKey**, the operation is asynchronous. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the configurations are being modified.
      *     *   If a VPN gateway is in the **active** state, the configurations are modified.
      * *   When you call **ModifyCustomerGatewayAttribute**, if no value is assigned to **AuthKey**, the operation is synchronous.
      * *   You cannot repeatedly call **ModifyCustomerGatewayAttribute** to modify the configurations of a customer gateway within the specified period of time.
      *
     */
    CompletableFuture<ModifyCustomerGatewayAttributeResponse> modifyCustomerGatewayAttribute(ModifyCustomerGatewayAttributeRequest request);

    CompletableFuture<ModifyEipAddressAttributeResponse> modifyEipAddressAttribute(ModifyEipAddressAttributeRequest request);

    CompletableFuture<ModifyExpressCloudConnectionAttributeResponse> modifyExpressCloudConnectionAttribute(ModifyExpressCloudConnectionAttributeRequest request);

    CompletableFuture<ModifyExpressCloudConnectionBandwidthResponse> modifyExpressCloudConnectionBandwidth(ModifyExpressCloudConnectionBandwidthRequest request);

    /**
      * *   **ModifyFlowLogAttribute** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      *     *   If the flow log is in the **Modifying** state, the flow log is being modified.
      *     *   If the flow log is in the **Active** or **Inactive** state, the flow log is modified.
      * *   You cannot repeatedly call the **ModifyFlowLogAttribute** operation to modify a flow log within the specified period of time.
      *
     */
    CompletableFuture<ModifyFlowLogAttributeResponse> modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request);

    /**
      * *   **ModifyForwardEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeForwardTableEntries](~~36053~~) operation to query the status of the task.
      *     *   **Pending**: indicates that the system is modifying the DNAT entry. You can only query the DNAT entry, but cannot perform other operations.
      *     *   **Available**: indicates that the DNAT entry is modified.
      * *   You cannot repeatedly call the **ModifyForwardEntry** operation to modify a DNAT entry within the specified period of time.
      *
     */
    CompletableFuture<ModifyForwardEntryResponse> modifyForwardEntry(ModifyForwardEntryRequest request);

    /**
      * ## [](#)
      * *   **ModifyFullNatEntryAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListFullNatEntries](~~348779~~) operation to query the status of a FULLNAT entry.
      *     *   **Modifying**: indicates that the system is modifying the FULLNAT entry. You can query the FULLNAT entry, but cannot perform other operations.
      *     *   **Available**: indicates that the FULLNAT entry is modified.
      * *   You cannot repeatedly call the **ModifyFullNatEntryAttribute** operation to modify a FULLNAT entry within the specified period of time.
      *
     */
    CompletableFuture<ModifyFullNatEntryAttributeResponse> modifyFullNatEntryAttribute(ModifyFullNatEntryAttributeRequest request);

    CompletableFuture<ModifyGlobalAccelerationInstanceAttributesResponse> modifyGlobalAccelerationInstanceAttributes(ModifyGlobalAccelerationInstanceAttributesRequest request);

    /**
      * ## Usage notes
      * You cannot call this operation to modify the maximum bandwidth of a subscription GA instance.
      *
     */
    CompletableFuture<ModifyGlobalAccelerationInstanceSpecResponse> modifyGlobalAccelerationInstanceSpec(ModifyGlobalAccelerationInstanceSpecRequest request);

    /**
      * You cannot repeatedly call the **ModifyHaVipAttribute** operation to modify the name and description of an HAVIP within the specified period of time.
      *
     */
    CompletableFuture<ModifyHaVipAttributeResponse> modifyHaVipAttribute(ModifyHaVipAttributeRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyIPv6TranslatorAclAttributeResponse> modifyIPv6TranslatorAclAttribute(ModifyIPv6TranslatorAclAttributeRequest request);

    CompletableFuture<ModifyIPv6TranslatorAclListEntryResponse> modifyIPv6TranslatorAclListEntry(ModifyIPv6TranslatorAclListEntryRequest request);

    CompletableFuture<ModifyIPv6TranslatorAttributeResponse> modifyIPv6TranslatorAttribute(ModifyIPv6TranslatorAttributeRequest request);

    CompletableFuture<ModifyIPv6TranslatorBandwidthResponse> modifyIPv6TranslatorBandwidth(ModifyIPv6TranslatorBandwidthRequest request);

    /**
      * @deprecated
      *
     */
    CompletableFuture<ModifyIPv6TranslatorEntryResponse> modifyIPv6TranslatorEntry(ModifyIPv6TranslatorEntryRequest request);

    CompletableFuture<ModifyIpv6AddressAttributeResponse> modifyIpv6AddressAttribute(ModifyIpv6AddressAttributeRequest request);

    CompletableFuture<ModifyIpv6GatewayAttributeResponse> modifyIpv6GatewayAttribute(ModifyIpv6GatewayAttributeRequest request);

    /**
      * You cannot repeatedly call the **ModifyIpv6InternetBandwidth** operation to modify the Internet bandwidth value of an IPv6 CIDR block within the specified period of time.
      *
     */
    CompletableFuture<ModifyIpv6InternetBandwidthResponse> modifyIpv6InternetBandwidth(ModifyIpv6InternetBandwidthRequest request);

    /**
      * ## [](#)Description
      * You can call this operation to query an Internet NAT gateway or a virtual private cloud (VPC) NAT gateway. The term NAT gateway in this topic refers to both NAT gateway types.
      *
     */
    CompletableFuture<ModifyNatGatewayAttributeResponse> modifyNatGatewayAttribute(ModifyNatGatewayAttributeRequest request);

    /**
      * - You cannot call this operation to downgrade a subscription Internet NAT gateway. You can downgrade a subscription Internet NAT gateway only in the console.
      * - When you call this operation to upgrade a subscription Internet NAT gateway, an order is generated. After you complete the payment in the order center, the Internet NAT gateway is upgraded.
      * - **ModifyNatGatewaySpec** is an asynchronous operation. After you make a request, the ID of the request is returned but the Internet NAT gateway is not upgraded. The system upgrades the NAT gateway in the background. You can call the [DescribeNatGateways](/help/en/virtual-private-cloud/latest/describenatgateways) operation to query the status of an Internet NAT gateway.    - If an Internet NAT gateway is in the **Modifying** state, the NAT gateway is being upgraded. In this case, you can only query the NAT gateway but cannot perform other operations.
      *   - If an Internet NAT gateway is in the **Available** state, the Internet NAT gateway is upgraded.
      * - You cannot repeatedly call the **ModifyNatGatewaySpec** operation to resize a pay-by-specification NAT gateway.
      * Internet NAT gateways are available in different sizes. The size of an Internet NAT gateway determines the SNAT performance, which includes the maximum number of connections and the number of new connections per second. However, the size of a NAT gateway does not affect the data throughput. The following table describes the correlations between different sizes of Internet NAT gateways and SNAT performance metrics.  
      * | Size | Maximum number of connections | Number of new connections per second |
      * | ---- | ----------------------------- | ------------------------------------ |
      * | Small | 10,000 | 1,000 |
      * | Medium | 50,000 | 5,000 |
      * | Large | 200,000 | 10,000 |
      *
     */
    CompletableFuture<ModifyNatGatewaySpecResponse> modifyNatGatewaySpec(ModifyNatGatewaySpecRequest request);

    /**
      * ## [](#)Description
      * You cannot repeatedly call the **ModifyNatIpAttribute** operation to modify the name and description of a NAT IP address within the specified period of time.
      *
     */
    CompletableFuture<ModifyNatIpAttributeResponse> modifyNatIpAttribute(ModifyNatIpAttributeRequest request);

    CompletableFuture<ModifyNatIpCidrAttributeResponse> modifyNatIpCidrAttribute(ModifyNatIpCidrAttributeRequest request);

    CompletableFuture<ModifyNetworkAclAttributesResponse> modifyNetworkAclAttributes(ModifyNetworkAclAttributesRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * *   If an Express Connect circuit is in the **Initial**, **Enabled**, or **Rejected** state, you can modify the specifications of the Express Connect circuit and the ID of the redundant circuit.
      * *   If an Express Connect circuit is in the **Canceled**, **Allocating**, **AllocationFailed**, or **Terminated** state, you cannot modify the specifications of the Express Connect circuit.
      * *   After you modify the specifications of an Express Connect circuit that is in the **Rejected** state, the Express Connect circuit enters the **Initial** state.
      *
     */
    CompletableFuture<ModifyPhysicalConnectionAttributeResponse> modifyPhysicalConnectionAttribute(ModifyPhysicalConnectionAttributeRequest request);

    /**
      * You cannot repeatedly call the **ModifyRouteEntry** operation to modify the name and description of a custom route within the specified period of time.
      *
     */
    CompletableFuture<ModifyRouteEntryResponse> modifyRouteEntry(ModifyRouteEntryRequest request);

    /**
      * You cannot repeatedly call the **ModifyRouteTableAttributes** operation to modify the name and description of a route table within the specified period of time.
      *
     */
    CompletableFuture<ModifyRouteTableAttributesResponse> modifyRouteTableAttributes(ModifyRouteTableAttributesRequest request);

    CompletableFuture<ModifyRouterInterfaceAttributeResponse> modifyRouterInterfaceAttribute(ModifyRouterInterfaceAttributeRequest request);

    /**
      * ## [](#)Description
      * After you call this operation, the router interface enters the **Activating** state. After the router interface is activated, the router interface enters the **Active** state.
      * >  You cannot modify the specification of a router interface that has overdue payments.
      *
     */
    CompletableFuture<ModifyRouterInterfaceSpecResponse> modifyRouterInterfaceSpec(ModifyRouterInterfaceSpecRequest request);

    /**
      * ## [](#)
      * **ModifySnatEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeSnatTableEntries](~~42677~~) operation to query the status of the task.
      * *   **Pending**: indicates that the system is modifying the SNAT entry. You can only query the status of the SNAT entry, but cannot perform other operations.
      * *   **Available**: indicates that the SNAT entry is modified.
      * >  If an SNAT entry is in the **Pending** state, it indicates that you cannot modify the SNAT entry.
      * You cannot repeatedly call the **ModifySnatEntry** operation to modify an SNAT entry within a specific period of time.
      *
     */
    CompletableFuture<ModifySnatEntryResponse> modifySnatEntry(ModifySnatEntryRequest request);

    CompletableFuture<ModifySslVpnClientCertResponse> modifySslVpnClientCert(ModifySslVpnClientCertRequest request);

    /**
      * *   If you modify only the **name** of the SSL server, the operation is synchronous. If you also modify other configurations besides the **name**, the operation is asynchronous.
      * *   When **ModifySslVpnServer** is an asynchronous operation, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the configurations of the SSL server are being modified.
      *     *   If a VPN gateway is in the **active** state, the configurations of the SSL server are modified.
      * *   You cannot repeatedly call **ModifySslVpnServer** to modify the configurations of an SSL server within the specified period of time.
      *
     */
    CompletableFuture<ModifySslVpnServerResponse> modifySslVpnServer(ModifySslVpnServerRequest request);

    CompletableFuture<ModifyTunnelAttributeResponse> modifyTunnelAttribute(ModifyTunnelAttributeRequest request);

    /**
      * You cannot repeatedly call the **ModifyVRouterAttribute** operation within a specific period of time.
      *
     */
    CompletableFuture<ModifyVRouterAttributeResponse> modifyVRouterAttribute(ModifyVRouterAttributeRequest request);

    /**
      * *   **ModifyVSwitchAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of the task:
      *     *   If the vSwitch is in the **Pending** state, the name and description of the vSwitch are being modified.
      *     *   If the vSwitch is in the **Available** state, the name and description of the vSwitch are modified.
      * *   You cannot repeatedly call the **ModifyVSwitchAttribute** operation to modify the name and description of a vSwitch within the specified period of time.
      *
     */
    CompletableFuture<ModifyVSwitchAttributeResponse> modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request);

    /**
      * ## [](#)Usage notes
      * You cannot repeatedly call **ModifyVSwitchCidrReservationAttribute** within a specific time period.
      *
     */
    CompletableFuture<ModifyVSwitchCidrReservationAttributeResponse> modifyVSwitchCidrReservationAttribute(ModifyVSwitchCidrReservationAttributeRequest request);

    /**
      * *   **ModifyVcoRouteEntryWeight** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of the associated IPsec-VPN connection and determine whether the weight of the specified destination-based route is modified.
      *     *   If the IPsec-VPN connection is in the **updating** state, the weight of the destination-based route is being modified.
      *     *   If the IPsec-VPN connection is in the **attached** state, the weight of the destination-based route is modified.
      * *   You cannot repeatedly call the **ModifyVcoRouteEntryWeight** operation for the same IPsec-VPN connection within the specified period of time.
      *
     */
    CompletableFuture<ModifyVcoRouteEntryWeightResponse> modifyVcoRouteEntryWeight(ModifyVcoRouteEntryWeightRequest request);

    /**
      * # [](#)
      * *   Only the owner of an Express Connect circuit can modify the **VlanId** parameter.
      * *   One VLAN ID of an Express Connect circuit cannot be used only by one VBR at the same time.
      * *   The VLAN ID of a VBR in the **Terminated** state is reserved for seven days and cannot be used by other VBRs. The VLAN ID can be used by other VBRs after 7 days.
      * *   You cannot set **LocalGatewayIp**, **PeerGatewayIp**, or **PeeringSubnetMask** for VBRs that do not belong to your Alibaba Cloud account.
      * *   Set **PeeringSubnetMask** to a subnet mask with 24 to 30 bits in length (255.255.255.0～255.255.255.252).
      * *   Set **LocalGatewayIp** and **PeerGatewayIp** to IP addresses that belong to the same CIDR block. For example, you can set LocalGatewayIp to 192.168.XX.XX, PeerGatewayIp to 192.168.XX.XX, and PeeringSubnetMask to 255.255.255.248.
      *
     */
    CompletableFuture<ModifyVirtualBorderRouterAttributeResponse> modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request);

    /**
      * ## [](#)Description
      * You cannot repeatedly call the **ModifyVpcAttribute** operation to modify the name and description of a VPC within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpcAttributeResponse> modifyVpcAttribute(ModifyVpcAttributeRequest request);

    /**
      * *   The **ModifyVpcPrefixList** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListPrefixLists](~~311535~~) to query the status of a prefix list.
      *     *   If the prefix list is in the **Modifying** state, the configuration of the prefix list is being modified.
      *     *   If the prefix list is in the **Created** state, the configuration of the prefix list is modified.
      *     *   After the configuration of the prefix list is modified, you can call the [GetVpcPrefixListAssociations](~~445478~~) operation to query information about the network instances that are associated with the prefix list and determine whether the associated network instances use the new CIDR blocks. If the association **status** of the prefix list is **Created**, the new CIDR blocks are used by the network instances that are associated with the prefix list.
      * *   You cannot repeatedly call **ModifyVpcPrefixList** to modify the configuration of a prefix list within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpcPrefixListResponse> modifyVpcPrefixList(ModifyVpcPrefixListRequest request);

    /**
      * *   **ModifyVpnAttachmentAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task to modify the configuration of an IPsec-VPN connection in the background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of the task.
      *     *   If the IPsec-VPN connection is in the **updating** state, the configuration of the IPsec-VPN connection is being modified.
      *     *   If the IPsec-VPN connection is in the **attached** state, the configuration of the IPsec-VPN connection is modified.
      * *   You cannot call the **ModifyVpnAttachmentAttribute** operation again on the same IPsec-VPN connection before the previous operation is complete.
      * *   When you call the **ModifyVpnAttachmentAttribute** operation, take note of the following items:
      *     *   If the IPsec-VPN connection is associated with a transit router, you cannot change the type of the gateway connected to the IPsec-VPN connection.
      *     *   If the IPsec-VPN connection is not associated with a resource, you cannot change the type of the gateway connected to the IPsec-VPN connection or the customer gateway connected to the IPsec-VPN connection.
      *
     */
    CompletableFuture<ModifyVpnAttachmentAttributeResponse> modifyVpnAttachmentAttribute(ModifyVpnAttachmentAttributeRequest request);

    /**
      * *   If you want to modify a IPsec-VPN connection in dual-tunnel mode, call the `ModifyVpnConnectionAttribute` operation. You can modify the required parameters and the following request parameters:
      *     **ClientToken**, **Name**, **LocalSubnet**, **RemoteSubnet**, **EffectImmediately**, **AutoConfigRoute**, **TunnelOptionsSpecification**, and **EnableTunnelsBgp**.
      * *   If you want to modify a IPsec-VPN connection in single-tunnel mode, call the `ModifyVpnConnectionAttribute` operation. You can modify the required parameters and the following request parameters:
      *     **ClientToken**, **Name**, **LocalSubnet**, **RemoteSubnet**, **EffectImmediately**, **IkeConfig**, **IpsecConfig**, **HealthCheckConfig**, **AutoConfigRoute**, **EnableDpd**, **EnableNatTraversal**, **BgpConfig**, and **RemoteCaCertificate**.
      * *   **ModifyVpnConnectionAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and modifies the configuration of the IPsec-VPN connection in the backend. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the configuration of the IPsec-VPN connection is being modified.
      *     *   If the VPN gateway is in the **active** state, the configuration of the IPsec-VPN connection is modified.
      * *   You cannot repeatedly call the **ModifyVpnConnectionAttribute** operation for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpnConnectionAttributeResponse> modifyVpnConnectionAttribute(ModifyVpnConnectionAttributeRequest request);

    /**
      * *   **ModifyVpnGatewayAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the VPN gateway is being modified.
      *     *   If the VPN gateway is in the **active** state, the VPN gateway is modified.
      * *   You cannot repeatedly call **ModifyVpnGatewayAttribute** to modify a VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpnGatewayAttributeResponse> modifyVpnGatewayAttribute(ModifyVpnGatewayAttributeRequest request);

    /**
      * *   You can call the **ModifyVpnPbrRouteEntryAttribute** operation to modify the weight and priority of a policy-based route.
      *     *   If you want to modify only the weight of a policy-based route, call [ModifyVpnPbrRouteEntryWeight](~~127249~~).
      *     *   If you want to modify only the priority of a policy-based route, call [ModifyVpnPbrRouteEntryPriority](~~466870~~).
      *     *   If a policy-based route does not support priorities, you can only call [ModifyVpnPbrRouteEntryWeight](~~127249~~) to modify its weight.
      * *   The **ModifyVpnPbrRouteEntryAttribute** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If a VPN gateway is in the **updating** state, the policy-based route entry is being modified.
      *     *   If a VPN gateway is in the **active** state, the policy-based route entry is modified.
      * *   You cannot repeatedly call the **ModifyVpnPbrRouteEntryAttribute** operation for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpnPbrRouteEntryAttributeResponse> modifyVpnPbrRouteEntryAttribute(ModifyVpnPbrRouteEntryAttributeRequest request);

    /**
      * *   **ModifyVpnPbrRouteEntryPriority** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the policy-based route entry is being modified.
      *     *   If the VPN gateway is in the **active** state, the policy-based route is created.
      * *   You cannot repeatedly call the **ModifyVpnPbrRouteEntryPriority** operation for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpnPbrRouteEntryPriorityResponse> modifyVpnPbrRouteEntryPriority(ModifyVpnPbrRouteEntryPriorityRequest request);

    /**
      * *   **ModifyVpnPbrRouteEntryWeight** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the policy-based route entry is being modified.
      *     *   If a VPN gateway is in the **active** state, the policy-based route entry is modified.
      * *   You cannot repeatedly call the **ModifyVpnPbrRouteEntryWeight** operation for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpnPbrRouteEntryWeightResponse> modifyVpnPbrRouteEntryWeight(ModifyVpnPbrRouteEntryWeightRequest request);

    /**
      * *   **ModifyVpnRouteEntryWeight** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the weight of the destination-based route is being modified.
      *     *   If the VPN gateway is in the **active** state, the weight of the destination-based route is modified.
      * *   You cannot repeatedly call the **ModifyVpnRouteEntryWeight** operation to modify the weight of destination-based route for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpnRouteEntryWeightResponse> modifyVpnRouteEntryWeight(ModifyVpnRouteEntryWeightRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    CompletableFuture<MoveVpnResourceGroupResponse> moveVpnResourceGroup(MoveVpnResourceGroupRequest request);

    /**
      * *   You cannot repeatedly call the **OpenFlowLogService** operation within the specified period of time by using an Alibaba Cloud account.
      * *   You can call the [GetFlowLogServiceStatus](~~449624~~) operation to query the status of the flow log feature.
      *
     */
    CompletableFuture<OpenFlowLogServiceResponse> openFlowLogService(OpenFlowLogServiceRequest request);

    CompletableFuture<OpenPhysicalConnectionServiceResponse> openPhysicalConnectionService(OpenPhysicalConnectionServiceRequest request);

    /**
      * ## [](#)Usage notes
      * You can enable traffic mirroring for different regions. You cannot repeatedly call the **OpenTrafficMirrorService** operation to enable traffic mirroring for one region within the specified period of time.
      *
     */
    CompletableFuture<OpenTrafficMirrorServiceResponse> openTrafficMirrorService(OpenTrafficMirrorServiceRequest request);

    CompletableFuture<PublishVpnRouteEntryResponse> publishVpnRouteEntry(PublishVpnRouteEntryRequest request);

    /**
      * # [](#)Description
      * You can call this API operation to resume a suspended Express Connect circuit. You can resume only shared Express Connect circuits by calling this API operation.
      *
     */
    CompletableFuture<RecoverPhysicalConnectionResponse> recoverPhysicalConnection(RecoverPhysicalConnectionRequest request);

    /**
      * After the operation is called, the VBR changes from the **terminated** state to the **recovering** state. When the VBR recovers, it enters the **active** state.
      * When you call this operation, take note of the following items:
      * *   Only the owner of the Express Connect circuit can call this operation.
      * *   The Express Connect circuit to which the VBR connects must be in the **Enabled** state.
      *
     */
    CompletableFuture<RecoverVirtualBorderRouterResponse> recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   Before you release an EIP, make sure that the EIP meets the following requirements:
      *     *   You can release only an EIP that is in the **Available** state.
      *     *   You can release only a pay-as-you-go EIP. You cannot release a subscription EIP.
      * *   **ReleaseEipAddress** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEipAddresses](~~120193~~) operation to query the status of the task:
      *     *   If the EIP is in the **Releasing** state, the EIP is being released. In this state, you can only query the EIP and cannot perform other operations.
      *     *   If you cannot query the EIP, the EIP is released.
      * *   You cannot repeatedly call the **ReleaseEipAddress** operation to release an EIP within the specified period of time.
      *
     */
    CompletableFuture<ReleaseEipAddressResponse> releaseEipAddress(ReleaseEipAddressRequest request);

    /**
      * *   After you call the **ReleaseEipSegmentAddress** operation, all EIPs in the specified group are released.
      * *   **ReleaseEipSegmentAddress** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEipSegment](~~156063~~) operation to query the status of the task.
      *     *   If the group is in the **Releasing** state, EIPs in the group are being released. In this state, you can only query the group and cannot perform other operations.
      *     *   If you cannot query the group of contiguous EIPs, the contiguous EIPs are released.
      * *   You cannot repeatedly call the **ReleaseEipSegmentAddress** operation to release a group of contiguous EIPs within the specified period of time.
      *
     */
    CompletableFuture<ReleaseEipSegmentAddressResponse> releaseEipSegmentAddress(ReleaseEipSegmentAddressRequest request);

    CompletableFuture<ReleaseIpv6AddressResponse> releaseIpv6Address(ReleaseIpv6AddressRequest request);

    CompletableFuture<RemoveCommonBandwidthPackageIpResponse> removeCommonBandwidthPackageIp(RemoveCommonBandwidthPackageIpRequest request);

    CompletableFuture<RemoveGlobalAccelerationInstanceIpResponse> removeGlobalAccelerationInstanceIp(RemoveGlobalAccelerationInstanceIpRequest request);

    CompletableFuture<RemoveIPv6TranslatorAclListEntryResponse> removeIPv6TranslatorAclListEntry(RemoveIPv6TranslatorAclListEntryRequest request);

    /**
      * *   The **RemoveSourcesFromTrafficMirrorSession** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListTrafficMirrorSessions](~~261367~~) operation to query the status of a traffic mirror session:
      *     *   If the traffic mirror session is in the **Modifying** state, the traffic mirror source is being deleted.
      *     *   If the traffic mirror session is in the **Created** state, the traffic mirror source is deleted.
      * *   You cannot repeatedly call the **RemoveSourcesFromTrafficMirrorSession** operation to delete a traffic mirror source from a traffic mirror session within the specified period of time.
      *
     */
    CompletableFuture<RemoveSourcesFromTrafficMirrorSessionResponse> removeSourcesFromTrafficMirrorSession(RemoveSourcesFromTrafficMirrorSessionRequest request);

    /**
      * *   The **ReplaceVpcDhcpOptionsSet** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of a DHCP options set:
      *     *   If the DHCP options set is in the **Pending** state, the DHCP options set is being replaced.
      *     *   If the DHCP options set is in the **InUse** state, the DHCP options set is replaced.
      * *   You cannot repeatedly call the **ReplaceVpcDhcpOptionsSet** operation to replace the DHCP options set associated with a VPC within the specified period of time.
      *
     */
    CompletableFuture<ReplaceVpcDhcpOptionsSetResponse> replaceVpcDhcpOptionsSet(ReplaceVpcDhcpOptionsSetRequest request);

    /**
      * *   If you modify the information about a prefix list but the modification is not automatically applied to the route table that is associated with the prefix list, you can call this operation to apply the latest prefix list to the associated route table.
      * *   The **RetryVpcPrefixListAssociation** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the background. You can call the [GetVpcPrefixListAssociations](~~445478~~) to check whether the prefix list is re-applied.
      *     *   If the prefix list is in the **Modifying** state, the prefix list is being re-applied.
      *     *   If the prefix list is in the **ModifyFailed** state, the prefix list fails to be re-applied.
      *     *   If the prefix list is in the **Created** state, the prefix list is re-applied.
      * *   After you call the **RetryVpcPrefixListAssociation** operation to re-apply a prefix list, you cannot call the operation again until the current task is complete.
      *
     */
    CompletableFuture<RetryVpcPrefixListAssociationResponse> retryVpcPrefixListAssociation(RetryVpcPrefixListAssociationRequest request);

    /**
      * ## [](#)Usage notes
      * *   **RevokeInstanceFromCen** is a Virtual Private Cloud (VPC) operation. Therefore, you must use `vpc.aliyuncs.com` as the domain name when you call this operation. The API version is `2016-04-28`.
      * *   You cannot repeatedly call the **RevokeInstanceFromCen** operation to revoke the permissions on a network instance that is attached to a CEN instance within the specified period of time. The network instance can be a VPC, virtual border router (VBR), or a Cloud Connect Network (CCN) instance.
      *
     */
    CompletableFuture<RevokeInstanceFromCenResponse> revokeInstanceFromCen(RevokeInstanceFromCenRequest request);

    CompletableFuture<RevokeInstanceFromVbrResponse> revokeInstanceFromVbr(RevokeInstanceFromVbrRequest request);

    CompletableFuture<SecondApplyPhysicalConnectionLOAResponse> secondApplyPhysicalConnectionLOA(SecondApplyPhysicalConnectionLOARequest request);

    /**
      * You cannot repeatedly call **SetHighDefinitionMonitorLogStatus** within a specific period of time.
      *
     */
    CompletableFuture<SetHighDefinitionMonitorLogStatusResponse> setHighDefinitionMonitorLogStatus(SetHighDefinitionMonitorLogStatusRequest request);

    CompletableFuture<StartFailoverTestJobResponse> startFailoverTestJob(StartFailoverTestJobRequest request);

    CompletableFuture<StopFailoverTestJobResponse> stopFailoverTestJob(StopFailoverTestJobRequest request);

    /**
      * Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following limits:
      * *   The keys of tags that are added to the same instance must be unique.
      * *   You cannot create tags without adding them to instances. All tags must be added to instances.
      * *   Tag information is not shared across regions.
      *     For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.
      * *   Virtual private clouds (VPCs), route tables, vSwitches, and elastic IP addresses (EIPs) that belong to the same Alibaba Cloud account and are deployed in the same region share tag information with each other.
      *     For example, if you added a tag to a VPC, the tag is available to vSwitches, route tables, and EIPs that belong to the same account and are deployed in the same region in which the VPC is created. You can select this tag from the editing page without the need to enter the tag again. You can modify the key and the value of a tag or remove a tag from an instance. After you delete an instance, all tags that are added to the instance are deleted.
      * *   You can add up to 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * ## [](#)
      * Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following items:
      * *   Each tag key that is added to an instance must be unique.
      * *   You cannot create tags without adding them to instances. All tags must be added to instances.
      * *   Tag information is not shared across regions.
      *     For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.
      * *   You can add up to 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.
      *
     */
    CompletableFuture<TagResourcesForExpressConnectResponse> tagResourcesForExpressConnect(TagResourcesForExpressConnectRequest request);

    /**
      * After you call this operation, the specified Express Connect circuit changes to the **Terminating** state. After the Express Connect circuit is disabled, it changes to the **Terminated** state. When you call this operation, take note of the following limits:
      * *   You can only disable an Express Connect circuit that is in the **Enabled** state.
      * *   Before you disable an Express Connect circuit, you must delete the virtual border routers (VBRs) associated with it.
      *
     */
    CompletableFuture<TerminatePhysicalConnectionResponse> terminatePhysicalConnection(TerminatePhysicalConnectionRequest request);

    /**
      * After the operation is performed, the VBR changes from the **active** state to the **terminating** state. After the VBR is terminated, it enters the **terminated** state.
      * >  Only the owner of an Express Connect circuit can call this operation.
      *
     */
    CompletableFuture<TerminateVirtualBorderRouterResponse> terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request);

    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    /**
      * *   **UnassociateEipAddress** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEipAddresses](~~120193~~) operation to query the status of the task.
      *     *   If the EIP is in the **Unassociating** state, the EIP is being disassociated. In this state, you can only query the EIP and cannot perform other operations.
      *     *   If the EIP is in the **Available** state, the EIP is disassociated.
      * *   You cannot repeatedly call the **UnassociateEipAddress** operation within the specified period of time.
      *
     */
    CompletableFuture<UnassociateEipAddressResponse> unassociateEipAddress(UnassociateEipAddressRequest request);

    CompletableFuture<UnassociateGlobalAccelerationInstanceResponse> unassociateGlobalAccelerationInstance(UnassociateGlobalAccelerationInstanceRequest request);

    /**
      * ## [](#)
      * When you call this operation, take note of the following limits:
      * *   The ECS instance must be in the **Running** or **Stopped** state.
      * *   The HAVIP must be in the **Available** or **InUse** state.
      * *   **UnassociateHaVip** is an asynchronous operation. After a request is sent, the system returns a request ID and an instance ID and runs the task in the background. You can call the [DescribeHaVips](~~114611~~) operation to query the status of an HAVIP:
      *     *   If the HAVIP is in the **Unassociating** state, the HAVIP is being disassociated.
      *     *   If the HAVIP is in the **Inuse** or **Available** state, the HAVIP is disassociated.
      * *   You cannot repeatedly call the **UnassociateHaVip** operation to disassociate an HAVIP within the specified period of time.
      *
     */
    CompletableFuture<UnassociateHaVipResponse> unassociateHaVip(UnassociateHaVipRequest request);

    /**
      * ## [](#)Description
      * *   **UnassociateNetworkAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeNetworkAclAttributes](~~116542~~) operation to query the status of the task.
      *     *   If the network ACL is in the **UNBINDING** state, the network ACL is being disassociated from the vSwitch.
      *     *   If the network ACL is in the **UNBINDED** state, the network ACL is disassociated from the vSwitch.
      * *   You cannot repeatedly call the **UnassociateNetworkAcl** operation to disassociate a network ACL from a vSwitch within the specified period of time.
      *
     */
    CompletableFuture<UnassociateNetworkAclResponse> unassociateNetworkAcl(UnassociateNetworkAclRequest request);

    CompletableFuture<UnassociatePhysicalConnectionFromVirtualBorderRouterResponse> unassociatePhysicalConnectionFromVirtualBorderRouter(UnassociatePhysicalConnectionFromVirtualBorderRouterRequest request);

    /**
      * ## [](#)References
      * *   **UnassociateRouteTable** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of the task.
      *     *   If the vSwitch is in the **Pending** state, the route table is being disassociated.
      *     *   If the vSwitch is in the **Available** state, the route table is disassociated.
      * *   You cannot repeatedly call the **UnassociateRouteTable** operation to disassociate a route table from a vSwitch within the specified period of time.
      *
     */
    CompletableFuture<UnassociateRouteTableResponse> unassociateRouteTable(UnassociateRouteTableRequest request);

    /**
      * *   Before you delete a secondary CIDR block from a VPC, delete the vSwitch which is created with the CIDR block. For more information, see [DeleteVSwitch](~~35746~~).
      * *   You cannot repeatedly call the **UnassociateVpcCidrBlock** operation to delete a secondary CIDR block from a VPC within the specified period of time.
      *
     */
    CompletableFuture<UnassociateVpcCidrBlockResponse> unassociateVpcCidrBlock(UnassociateVpcCidrBlockRequest request);

    CompletableFuture<UntagResourcesForExpressConnectResponse> untagResourcesForExpressConnect(UntagResourcesForExpressConnectRequest request);

    CompletableFuture<UpdateDhcpOptionsSetAttributeResponse> updateDhcpOptionsSetAttribute(UpdateDhcpOptionsSetAttributeRequest request);

    CompletableFuture<UpdateFailoverTestJobResponse> updateFailoverTestJob(UpdateFailoverTestJobRequest request);

    CompletableFuture<UpdateGatewayRouteTableEntryAttributeResponse> updateGatewayRouteTableEntryAttribute(UpdateGatewayRouteTableEntryAttributeRequest request);

    /**
      * *   If you modify only the **IpsecServerName** parameter, this operation is synchronous. If you modify parameters other than **IpsecServerName**, this operation is asynchronous.
      * *   When the **UpdateIpsecServer** operation is asynchronous, the system returns a request ID after you send a request to call this operation and the IPsec server is being modified in the backend. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the configuration of the IPsec server is being modified.
      *     *   If the VPN gateway is in the **active** state, the configuration of the IPsec server is modified.
      * *   You cannot repeatedly call the **UpdateIpsecServer** operation for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<UpdateIpsecServerResponse> updateIpsecServer(UpdateIpsecServerRequest request);

    /**
      * You cannot repeatedly call the **UpdateIpv4GatewayAttribute** operation to modify the name or description of an IPv4 gateway within the specified period of time.
      *
     */
    CompletableFuture<UpdateIpv4GatewayAttributeResponse> updateIpv4GatewayAttribute(UpdateIpv4GatewayAttributeRequest request);

    /**
      * Before you call this operation, take note of the following limits:
      * *   **UpdateNatGatewayNatType** is an asynchronous operation. After you send a request to call this operation, the system returns a request ID and the NAT gateway is still being upgraded in the backend. You can call the GetNatGatewayConvertStatus operation to query the upgrade progress of a NAT gateway. For more information, see [GetNatGatewayConvertStatus](~~184744~~).
      *     *   If the NAT gateway is in the **processing** state, the NAT gateway is being upgraded. You can only query the status of the NAT gateway but cannot perform other operations.
      *     *   If the NAT gateway is in the **successful** state, the NAT gateway is upgraded.
      *     *   If the NAT gateway is in the **failed** state, the system failed to upgrade the NAT gateway.
      * *   You cannot repeatedly call the **UpdateNatGatewayNatType** operation for the same VPN gateway within the specified period of time.
      * *   The billing method and billable items remain the same after the upgrade.
      * *   It takes about five minutes to upgrade a standard NAT gateway to an enhanced NAT gateway. During the upgrade, transient connection errors may occur once or twice. The service can be recovered by reconnection. You can determine whether to enable automatic reconnection or use manual reconnection based on your business requirements.
      * *   You can only upgrade standard NAT gateways to enhanced NAT gateways. You are not allowed to downgrade enhanced NAT gateways to standard NAT gateways.
      *
     */
    CompletableFuture<UpdateNatGatewayNatTypeResponse> updateNatGatewayNatType(UpdateNatGatewayNatTypeRequest request);

    /**
      * *   **UpdateNetworkAclEntries** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeNetworkAclAttributes](~~116542~~) operation to query the status of a network ACL:
      *     *   If the network ACL is in the **Modifying** state, the rules of the network ACL are being updated.
      *     *   If the network ACL is in the **Available** state, the rules of the network ACL are updated.
      * *   You cannot repeatedly call the **UpdateNetworkAclEntries** operation to update the rules of a network ACL within the specified period of time.
      *
     */
    CompletableFuture<UpdateNetworkAclEntriesResponse> updateNetworkAclEntries(UpdateNetworkAclEntriesRequest request);

    /**
      * You cannot repeatedly call the **UpdatePublicIpAddressPoolAttribute** operation to modify the attributes of an IP address pool within the specified period of time.
      *
     */
    CompletableFuture<UpdatePublicIpAddressPoolAttributeResponse> updatePublicIpAddressPoolAttribute(UpdatePublicIpAddressPoolAttributeRequest request);

    /**
      * You cannot repeatedly call the **UpdateTrafficMirrorFilterAttribute** operation to modify the configuration of a filter for traffic mirroring within the specified period of time.
      *
     */
    CompletableFuture<UpdateTrafficMirrorFilterAttributeResponse> updateTrafficMirrorFilterAttribute(UpdateTrafficMirrorFilterAttributeRequest request);

    /**
      * *   The **UpdateTrafficMirrorFilterRuleAttribute** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListTrafficMirrorFilters](~~261353~~) operation to query the status of an inbound or outbound rule:
      *     *   If the rule is in the **Modifying** state, the rule is being modified.
      *     *   If the rule is in the **Created** state, the rule is modified.
      * *   You cannot repeatedly call the **UpdateTrafficMirrorFilterRuleAttribute** operation to modify an inbound or outbound rule within the specified period of time.
      *
     */
    CompletableFuture<UpdateTrafficMirrorFilterRuleAttributeResponse> updateTrafficMirrorFilterRuleAttribute(UpdateTrafficMirrorFilterRuleAttributeRequest request);

    /**
      * ## Usage notes
      * *   **UpdateTrafficMirrorSessionAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListTrafficMirrorSessions](~~261367~~) operation to query the status of the task.
      *     *   If the traffic mirror session is in the **Modifying** state, the configuration of the traffic mirror session is being modified.
      *     *   If the traffic mirror session is in the **Created** state, the configuration of the traffic mirror session is modified.
      * *   You cannot repeatedly call the **UpdateTrafficMirrorSessionAttribute** operation within a specific period of time.
      *
     */
    CompletableFuture<UpdateTrafficMirrorSessionAttributeResponse> updateTrafficMirrorSessionAttribute(UpdateTrafficMirrorSessionAttributeRequest request);

    CompletableFuture<UpdateVirtualBorderBandwidthResponse> updateVirtualBorderBandwidth(UpdateVirtualBorderBandwidthRequest request);

    CompletableFuture<UpdateVirtualPhysicalConnectionResponse> updateVirtualPhysicalConnection(UpdateVirtualPhysicalConnectionRequest request);

    /**
      * *   **UpdateVpcGatewayEndpointAttribute** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the [GetVpcGatewayEndpointAttribute](~~311017~~) operation to query the status of the task.
      *     *   If the gateway endpoint is in the **Updating** state, it is being modified.
      *     *   If the gateway endpoint is in the **Created** state, it is modified.
      * *   You cannot call the **UpdateVpcGatewayEndpointAttribute** operation within a specific period of time.
      *
     */
    CompletableFuture<UpdateVpcGatewayEndpointAttributeResponse> updateVpcGatewayEndpointAttribute(UpdateVpcGatewayEndpointAttributeRequest request);

    /**
      * Before you call this operation, make sure that a VPC NAT gateway is created. For more information, see [CreateNatGateway](~~120219~~).
      *
     */
    CompletableFuture<VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse> vpcDescribeVpcNatGatewayNetworkInterfaceQuota(VpcDescribeVpcNatGatewayNetworkInterfaceQuotaRequest request);

}
