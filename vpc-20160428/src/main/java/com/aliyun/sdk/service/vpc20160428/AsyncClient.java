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
      * *   When you call this operation to associate an EIP with an EIP bandwidth plan, make sure that the EIP meets the following requirements:
      *     *   The EIP uses the pay-as-you-go billing method.
      *     *   The EIP and the EIP bandwidth plan belong to the same region.
      *     *   The line type of the EIP is the same as that of the EIP bandwidth plan.
      * *   The **AddCommonBandwidthPackageIp** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeCommonBandwidthPackages](~~120309~~) operation to query the status of an EIP bandwidth plan:
      *     *   If the EIP bandwidth plan is in the **BINDING** state, the EIP is being associated with the EIP bandwidth plan. In this state, you can only query the EIP bandwidth plan and cannot perform other operations.
      *     *   If the EIP bandwidth plan is in the **BINDED** state, the EIP is associated with the EIP bandwidth plan.
      *
     */
    CompletableFuture<AddCommonBandwidthPackageIpResponse> addCommonBandwidthPackageIp(AddCommonBandwidthPackageIpRequest request);

    /**
      * *   When you call this operation to associate EIPs with an EIP bandwidth plan, make sure that the EIPs meet the following requirements:
      *     *   The EIPs use the pay-as-you-go billing method.
      *     *   The EIPs and the EIP bandwidth plan belong to the same region.
      *     *   The line type of the EIPs is the same as that of the EIP bandwidth plan.
      * *   The **AddCommonBandwidthPackageIps** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeCommonBandwidthPackages](~~120309~~) operation to query the status of an EIP bandwidth plan:
      *     *   If the EIP bandwidth plan is in the **BINDING** state, the EIPs are being associated with the EIP bandwidth plan. In this state, you can only query the EIP bandwidth plan and cannot perform other operations.
      *     *   If the EIP bandwidth plan is in the **BINDED** state, the EIPs are associated with the EIP bandwidth plan.
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
      * The CIDR block.
      * >  You cannot set the **CidrBlock** and **CidrMask** parameters at the same time.
      *
     */
    CompletableFuture<AddPublicIpAddressPoolCidrBlockResponse> addPublicIpAddressPoolCidrBlock(AddPublicIpAddressPoolCidrBlockRequest request);

    /**
      * The client token that is used to ensure the idempotence of the request.
      * You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.
      * >  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.
      *
     */
    CompletableFuture<AddSourcesToTrafficMirrorSessionResponse> addSourcesToTrafficMirrorSession(AddSourcesToTrafficMirrorSessionRequest request);

    /**
      * The maximum bandwidth of the EIP. Unit: Mbit/s.
      * *   When **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByBandwidth**, valid values for **Bandwidth** are **1** to **500**.
      * *   When **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByTraffic**, valid values for **Bandwidth** are **1** to **200**.
      * *   When **InstanceChargeType** is set to **PrePaid**, valid values for **Bandwidth** are **1** to **1000**.
      * Default value: **5**. Unit: Mbit/s.
      *
     */
    CompletableFuture<AllocateEipAddressResponse> allocateEipAddress(AllocateEipAddressRequest request);

    CompletableFuture<AllocateEipAddressProResponse> allocateEipAddressPro(AllocateEipAddressProRequest request);

    /**
      * The operation that you want to perform. The operation that you want to perform. Set the value to **AllocateEipSegmentAddress**.
      *
     */
    CompletableFuture<AllocateEipSegmentAddressResponse> allocateEipSegmentAddress(AllocateEipSegmentAddressRequest request);

    /**
      * You cannot call the **AllocateIpv6InternetBandwidth** operation to purchase Internet bandwidth for an IPv6 gateway at the same time.
      *
     */
    CompletableFuture<AllocateIpv6InternetBandwidthResponse> allocateIpv6InternetBandwidth(AllocateIpv6InternetBandwidthRequest request);

    /**
      * The following section describes how to allocate an IPv6 CIDR block to a virtual private cloud (VPC):
      * 1\\. Call the AllocateVpcIpv6Cidr operation to reserve an IPv6 CIDR block.
      * 2\\. If you want to allocate the reserved IPv6 CIDR block to an existing VPC, call the [AssociateVpcCidrBlock](~~146745~~) operation, specify the **RegionId** and **VpcId** parameters, and set the **IPv6CidrBlock** parameter to the reserved IPv6 CIDR block and the **IpVersion** parameter to **IPV6**. If you want to allocate the reserved IPv6 CIDR block to a new VPC, call the [CreateVpc](~~35737~~) operation, specify the **RegionId** parameter, and set the **Ipv6CidrBlock** parameter to the reserved IPv6 CIDR block and the **EnableIpv6** parameter to **true**.
      *
     */
    CompletableFuture<AllocateVpcIpv6CidrResponse> allocateVpcIpv6Cidr(AllocateVpcIpv6CidrRequest request);

    CompletableFuture<ApplyPhysicalConnectionLOAResponse> applyPhysicalConnectionLOA(ApplyPhysicalConnectionLOARequest request);

    /**
      * The ID of the region to which the EIP belongs.
      * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
      *
     */
    CompletableFuture<AssociateEipAddressResponse> associateEipAddress(AssociateEipAddressRequest request);

    /**
      * *   You can call the **AssociateEipAddressBatch** operation to associate EIPs with a NAT gateway or a secondary elastic network interface (ENI) in the same region. For more information about how to associate EIPs with other instances, see [AssociateEipAddress](~~120195~~).
      * *   The **AssociateEipAddressBatch** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeEipAddresses](~~120193~~) operation to query the status of an EIP.
      *     *   If the EIP is in the **Associating** state, the EIP is being associated. In this state, you can only query the EIP and cannot perform other operations.
      *     *   If the EIP is in the **InUse** state, the EIP is associated.
      * *   You cannot repeatedly call **AssociateEipAddressBatch** to associate an EIP with an instance within the specified period of time.
      *
     */
    CompletableFuture<AssociateEipAddressBatchResponse> associateEipAddressBatch(AssociateEipAddressBatchRequest request);

    /**
      * ## Usage notes
      * When you call this operation, take note of the following items:
      * *   You can specify only an Elastic Compute Service (ECS) instance in a virtual private cloud (VPC) or a Server Load Balancer (SLB) instance as a backend server.
      * *   You can associate each GA instance with only one backend server.
      * *   You can associate multiple GA instances with the same backend server.
      * *   The backend server and the GA instance must belong to the same Alibaba Cloud account.
      * *   The region of the backend server must belong to the service area of the GA instance.
      * *   You can call this operation to associate only a dedicated-bandwidth GA instance with a backend server.
      * To associate a shared-bandwidth GA instance with a backend server, perform the following operations:
      * 1.  Associate an elastic IP address (EIP) with the shared-bandwidth GA instance: For more information, see [AddGlobalAccelerationInstanceIp](~~86045~~).
      * 2.  Associate the EIP with a backend server. For more information, see [AssociateEipAddress](~~120195~~). When you call AssociateEipAddress, specify **InstanceRegionId**.
      *
     */
    CompletableFuture<AssociateGlobalAccelerationInstanceResponse> associateGlobalAccelerationInstance(AssociateGlobalAccelerationInstanceRequest request);

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
      * The ID of the resource with which you want to associate the network ACL.
      *
     */
    CompletableFuture<AssociateNetworkAclResponse> associateNetworkAcl(AssociateNetworkAclRequest request);

    CompletableFuture<AssociatePhysicalConnectionToVirtualBorderRouterResponse> associatePhysicalConnectionToVirtualBorderRouter(AssociatePhysicalConnectionToVirtualBorderRouterRequest request);

    /**
      * The **AssociateRouteTable** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of a vSwitch:
      * *   If the vSwitch is in the **Pending** state, the route table is being associated with the vSwitch.
      * *   If the vSwitch is in the **Available** state, the route table is associated with the vSwitch.
      *
     */
    CompletableFuture<AssociateRouteTableResponse> associateRouteTable(AssociateRouteTableRequest request);

    CompletableFuture<AssociateRouteTableWithGatewayResponse> associateRouteTableWithGateway(AssociateRouteTableWithGatewayRequest request);

    /**
      * The ID of the gateway endpoint to be associated with the route table.
      *
     */
    CompletableFuture<AssociateRouteTablesWithVpcGatewayEndpointResponse> associateRouteTablesWithVpcGatewayEndpoint(AssociateRouteTablesWithVpcGatewayEndpointRequest request);

    /**
      * The IP version. Valid values:
      * *   **IPV4**: IPv4
      * *   **IPV6**: IPv6. If you set **IpVersion** to **IPV6** and do not set **SecondaryCidrBlock**, you can add IPv6 CIDR blocks to the VPC.
      *
     */
    CompletableFuture<AssociateVpcCidrBlockResponse> associateVpcCidrBlock(AssociateVpcCidrBlockRequest request);

    /**
      * ## Usage notes
      * Before you associate a VPN gateway with an SSL certificate, take note of the following items:
      * *   You can associate only VPN gateways of the ShangMi (SM) type with SSL certificates. You need to associate a VPN gateway of the SM type with two SSL certificates, one as the encryption certificate and the other as the signature certificate.
      * *   The SSL certificates must use the SM algorithm.
      * *   You cannot specify one SSL certificate as both the encryption certificate and signature certificate for one VPN gateway.
      * *   The first time you associate a VPN gateway of the SM type with an SSL certificate, the system automatically creates the AliyunServiceRoleForVPNCertificate service-linked role. In addition, the system adds the AliyunServiceRolePolicyForVPNCertificate policy to the role, which allows the VPN gateway to access other cloud resources. For more information, see [AliyunServiceRoleForVPNCertificate](~~203323~~).
      * *   **AssociateVpnGatewayWithCertificate** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the SSL certificate is being associated.
      *     *   If the VPN gateway is in the **active** state, the SSL certificate is being associated.
      * *   You cannot call **AssociateVpnGatewayWithCertificate** within a specific period of time.
      * ## Prerequisites
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
      * *   After this operation is performed, the maximum bandwidth of the EIP equals that of the EIP bandwidth plan.
      * *   You cannot repeatedly call the **CancelCommonBandwidthPackageIpBandwidth** operation to remove the maximum bandwidth configured for an EIP within the specified period of time.
      *
     */
    CompletableFuture<CancelCommonBandwidthPackageIpBandwidthResponse> cancelCommonBandwidthPackageIpBandwidth(CancelCommonBandwidthPackageIpBandwidthRequest request);

    /**
      * ## Limits
      * You can cancel only an Express Connect circuit that is in the **Initial**, **Approved**, **Allocated**, or **Confirmed** state.
      *
     */
    CompletableFuture<CancelPhysicalConnectionResponse> cancelPhysicalConnection(CancelPhysicalConnectionRequest request);

    /**
      * You cannot repeatedly call the **ChangeResourceGroup** operation within the specified period of time.
      *
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    CompletableFuture<CheckCanAllocateVpcPrivateIpAddressResponse> checkCanAllocateVpcPrivateIpAddress(CheckCanAllocateVpcPrivateIpAddressRequest request);

    CompletableFuture<CheckVpnBgpEnabledResponse> checkVpnBgpEnabled(CheckVpnBgpEnabledRequest request);

    CompletableFuture<CompletePhysicalConnectionLOAResponse> completePhysicalConnectionLOA(CompletePhysicalConnectionLOARequest request);

    CompletableFuture<ConfirmPhysicalConnectionResponse> confirmPhysicalConnection(ConfirmPhysicalConnectionRequest request);

    /**
      * After you call this operation, the router interface enters the **Connecting** state. When the connection is established, it enters the **Active** state.
      * When you call this operation, take note of the following rules:
      * *   Only an initiator router interface in the **Idle** state can initiate a connection.
      * *   You can create only one pair of connected router interfaces between two routers.
      * *   You cannot initiate a connection if your Alibaba Cloud account has a router interface with overdue payments.
      *
     */
    CompletableFuture<ConnectRouterInterfaceResponse> connectRouterInterface(ConnectRouterInterfaceRequest request);

    /**
      * Before you convert a NAT bandwidth package to an Internet Shared Bandwidth instance, make sure you are aware of the following:
      * *   The conversion does not incur any additional fees.
      * *   The conversion does not affect the SNAT or DNAT entries of the NAT Gateway, and has no impact on the running services. However, we recommend that you perform the conversion during off-peak hours.
      * *   After the conversion, the public IP address in the NAT bandwidth package is converted to an EIP. The peak bandwidth and billing method of the Internet Shared Bandwidth instance are consistent with those of the original NAT bandwidth package.
      *
     */
    CompletableFuture<ConvertBandwidthPackageResponse> convertBandwidthPackage(ConvertBandwidthPackageRequest request);

    /**
      * *   The **CopyNetworkAclEntries** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeNetworkAclAttributes](~~116542~~) operation to query the status of a network ACL:
      *     *   If the network ACL is in the **Modifying** state, the rules of the network ACL are being copied.
      *     *   If the network ACL is in the **Available** state, the rules of the network ACL are copied.
      * *   You cannot repeatedly call the **CopyNetworkAclEntries** operation to copy the rules of a network ACL within the specified period of time.
      *
     */
    CompletableFuture<CopyNetworkAclEntriesResponse> copyNetworkAclEntries(CopyNetworkAclEntriesRequest request);

    /**
      * You can use BGP to connect a VBR to a data center. Each BGP group is associated with a VBR. You can add a BGP peer that needs to communicate with a VBR to a BGP group and advertise the BGP network in the VBR.
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
      * ## Usage notes
      * When you call this operation, take note of the following items:
      * *   The first IP address and last three IP addresses of a default vSwitch CIDR block are reserved. For example, if the CIDR block of a vSwitch is 192.168.1.0/24, the IP addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved.
      * *   The number of instances in the default vSwitch cannot exceed the remaining number of instances supported by the VPC (15,000 minus the number of existing instances).
      * *   Default vSwitches do not support multicasting or broadcasting.
      * *   After you create a default vSwitch, you cannot modify its CIDR block.
      * *   **CreateDefaultVSwitch** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of a default vSwitch:
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

    CompletableFuture<CreateDhcpOptionsSetResponse> createDhcpOptionsSet(CreateDhcpOptionsSetRequest request);

    CompletableFuture<CreateExpressCloudConnectionResponse> createExpressCloudConnection(CreateExpressCloudConnectionRequest request);

    /**
      * **CreateFlowLog** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      * *   If the flow log is in the **Activating** state, the flow log is being created.
      * *   If the flow log is in the **Active** state, the flow log is created and started.
      *
     */
    CompletableFuture<CreateFlowLogResponse> createFlowLog(CreateFlowLogRequest request);

    /**
      * The region ID of the NAT gateway.
      * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
      *
     */
    CompletableFuture<CreateForwardEntryResponse> createForwardEntry(CreateForwardEntryRequest request);

    /**
      * The operation that you want to perform. Set the value to **CreateFullNatEntry**.
      *
     */
    CompletableFuture<CreateFullNatEntryResponse> createFullNatEntry(CreateFullNatEntryRequest request);

    /**
      * ## Usage notes
      * You can call this operation to create only pay-as-you-go GA instances.
      *
     */
    CompletableFuture<CreateGlobalAccelerationInstanceResponse> createGlobalAccelerationInstance(CreateGlobalAccelerationInstanceRequest request);

    /**
      * **CreateHaVip** is an asynchronous operation. After you send the request, the system returns a request ID and runs the task in the background. You can call the [DescribeHaVips](~~114611~~) operation to query the status of an HAVIP:
      * *   If the HAVIP is in the **Creating** state, the HAVIP is being created.
      * *   If the HAVIP is in the **Available** state, the HAVIP is created.
      *
     */
    CompletableFuture<CreateHaVipResponse> createHaVip(CreateHaVipRequest request);

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
      * *   The **CreateIpsecServer** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the IPsec server is being created.
      *     *   If the VPN gateway is in the **active** state, the IPsec server is created.
      * *   You cannot repeatedly call **CreateIpsecServer** to create an IPsec server for a VPN gateway within the specified period of time.
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
      * *   The **CreateIpv6EgressOnlyRule** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeIpv6EgressOnlyRules](~~102208~~) operation to query the status of an egress-only rule.
      *     *   If the egress-only rule is in the **Creating** state, the egress-only rule is being created.
      *     *   If the egress-only rule is in the **Created** state, the egress-only rule is created.
      * *   You cannot repeatedly call the **CreateIpv6EgressOnlyRule** operation to add egress-only rules for an IPv6 address within the specified period of time.
      *
     */
    CompletableFuture<CreateIpv6EgressOnlyRuleResponse> createIpv6EgressOnlyRule(CreateIpv6EgressOnlyRuleRequest request);

    /**
      * *   **CreateIpv6Gateway** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeIpv6GatewayAttribute](~~102226~~) operation to query the state of an IPv6 gateway.
      *     *   If the IPv6 gateway is in the **Creating** state, the IPv6 gateway is being created.
      *     *   If the IPv6 gateway is in the **Created** state, the IPv6 gateway is created.
      * *   You cannot call the **CreateIpv6Gateway** operation to create multiple IPv6 gateways in a virtual private cloud (VPC) at the same time.
      *
     */
    CompletableFuture<CreateIpv6GatewayResponse> createIpv6Gateway(CreateIpv6GatewayRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   When you create an enhanced NAT gateway for the first time, the system automatically creates the service-linked role AliyunServiceRoleForNatgw. Then, the system attaches the permission policy AliyunServiceRolePolicyForNatgw to the role. This allows the NAT gateway to access other resources on Alibaba Cloud. For more information, see [Service-linked roles](~~174251~~).
      * *   After you create an enhanced Internet NAT gateway, a route entry is automatically added to the route table of the VPC. The destination CIDR block of the route entry is 0.0.0.0/0 and the next hop is the NAT gateway. This ensures that traffic is routed to the NAT gateway.
      * *   **CreateNatGateway** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeNatGateways](~~36054~~) operation to query the status of a NAT gateway.
      *     *   If a NAT gateway is in the **Creating** state, the NAT gateway is being created. In this case, you can query the NAT gateway but cannot perform other operations.
      *     *   If a NAT gateway is in the **Available** state, the NAT gateway is created.
      *         It takes 1 to 3 minutes to create a NAT gateway.
      * *   You cannot repeatedly call the **CreateNatGateway** operation to create a VPC NAT gateway or an Internet NAT gateway within the specified period of time.
      *
     */
    CompletableFuture<CreateNatGatewayResponse> createNatGateway(CreateNatGatewayRequest request);

    /**
      * The ID of the Virtual Private Cloud (VPC) NAT gateway for which you want to create the NAT IP address.
      *
     */
    CompletableFuture<CreateNatIpResponse> createNatIp(CreateNatIpRequest request);

    /**
      * The ID of the Virtual Private Cloud (VPC) NAT gateway with which you want to associate the CIDR block.
      *
     */
    CompletableFuture<CreateNatIpCidrResponse> createNatIpCidr(CreateNatIpCidrRequest request);

    CompletableFuture<CreateNetworkAclResponse> createNetworkAcl(CreateNetworkAclRequest request);

    /**
      * The access point ID of the Express Connect circuit.
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
      * ## Limits
      * By default, the IP address pool feature is unavailable. You can apply for the privilege to use the **IP address pool feature** on the Quota Center page. For more information, see [Request a quota increase in the Quota Center console](~~108213~~).
      *
     */
    CompletableFuture<CreatePublicIpAddressPoolResponse> createPublicIpAddressPool(CreatePublicIpAddressPoolRequest request);

    /**
      * The operation that you want to perform. Set the value to **CreateRouteEntries**.
      *
     */
    CompletableFuture<CreateRouteEntriesResponse> createRouteEntries(CreateRouteEntriesRequest request);

    /**
      * The ID of the route table to which you want to add a custom route entry.
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
      * You can call this operation to add SNAT entries to Internet NAT gateways and Virtual Private Cloud (VPC) NAT gateways. In this topic, a NAT gateway refers to both gateway types.
      * Before you call this operation, take note of the following limits:
      * *   **CreateSnatEntry** is an asynchronous operation. After you make a request, an SNAT entry ID is returned but the specified SNAT entry is not added. The system adds the entry in the background. You can call the [DescribeSnatTableEntries](~~42677~~) operation to query the status of the SNAT entry.
      *     *   If the SNAT entry is in the **Pending** state, the system is adding the SNAT entry. You can only query the status of the SNAT entry, but cannot perform other operations.
      *     *   If the SNAT entry is in the **Available** state, the SNAT entry is added.
      * *   You cannot repeatedly call the **CreateSnatEntry** operation to add an SNAT entry to an SNAT table within the specified period of time.
      * *   The vSwitch and Elastic Compute Service (ECS) instance specified in an SNAT entry must be created in the virtual private cloud (VPC) where the NAT gateway is deployed.
      * *   Each vSwitch or ECS instance can be specified in only one SNAT entry.
      * *   If a high-availability virtual IP address (HAVIP) exists in a vSwitch, you cannot create SNAT entries.
      *
     */
    CompletableFuture<CreateSnatEntryResponse> createSnatEntry(CreateSnatEntryRequest request);

    CompletableFuture<CreateSslVpnClientCertResponse> createSslVpnClientCert(CreateSslVpnClientCertRequest request);

    /**
      * *   The **CreateSslVpnServer** operation is asynchronous. After you send the request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the associated VPN gateway and determine whether the SSL server is created.
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
      * The ID of the filter.
      *
     */
    CompletableFuture<CreateTrafficMirrorFilterRulesResponse> createTrafficMirrorFilterRules(CreateTrafficMirrorFilterRulesRequest request);

    /**
      * The description of the traffic mirror session.
      * The description must be 1 to 256 characters in length and cannot start with `http://` or `https://`.
      *
     */
    CompletableFuture<CreateTrafficMirrorSessionResponse> createTrafficMirrorSession(CreateTrafficMirrorSessionRequest request);

    /**
      * The zone ID of the vSwitch.
      * You can call the [DescribeZones](~~36064~~) operation to query the most recent zone list.
      *
     */
    CompletableFuture<CreateVSwitchResponse> createVSwitch(CreateVSwitchRequest request);

    CompletableFuture<CreateVbrHaResponse> createVbrHa(CreateVbrHaRequest request);

    /**
      * *   You cannot create a destination-based route whose destination CIDR block is 0.0.0.0/0.
      * *   When you create a destination-based route for an IPsec-VPN connection, do not create a route that meets the following conditions: The destination CIDR block is 100.64.0.0/10 or one of its subnets. The next hop is the IPsec-VPN connection. Such a route results in one of the following errors: The status of the IPsec-VPN connection cannot be displayed in the console. The negotiations of the IPsec-VPN connection fail.
      * *   **CreateVcoRouteEntry** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of a route based on the status of the associated IPsec-VPN connection.
      *     *   If the IPsec-VPN connection is in the **updating** state, the route is being created.
      *     *   If the IPsec-VPN connection is in the **attached** state, the route is created.
      * *   You cannot repeatedly call **CreateVcoRouteEntry** to create a route for the same IPsec-VPN connection within the specified period of time.
      *
     */
    CompletableFuture<CreateVcoRouteEntryResponse> createVcoRouteEntry(CreateVcoRouteEntryRequest request);

    /**
      * The ID of the Express Connect circuit.
      * You can create a VBR for a dedicated connection or a hosted connection.
      *
     */
    CompletableFuture<CreateVirtualBorderRouterResponse> createVirtualBorderRouter(CreateVirtualBorderRouterRequest request);

    /**
      * The payer for the hosted connection. Valid values:
      * *   **PayByPhysicalConnectionOwner**: The partner pays for the hosted connection.
      * *   **PayByVirtualPhysicalConnectionOwner**: The tenant pays for the hosted connection.
      *
     */
    CompletableFuture<CreateVirtualPhysicalConnectionResponse> createVirtualPhysicalConnection(CreateVirtualPhysicalConnectionRequest request);

    /**
      * When you call this operation, take note of the following rules:
      * *   You can specify only one CIDR block for each VPC.
      * *   After you create a VPC, you cannot change its CIDR block. However, you can add secondary IPv4 CIDR blocks to the VPC.
      * *   In each VPC, cloud services can use a maximum of 60,000 private IP addresses. You cannot increase the quota.
      * *   After you create a VPC, a vRouter and a route table are automatically created.
      * *   At most three user CIDR blocks can be added to a VPC. If a user CIDR block includes another user CIDR block, the one with the shorter subnet mask takes effect. For example, if 10.0.0.0/8 and 10.1.0.0/16 are specified, only 10.0.0.0/8 takes effect.
      * *   The **CreateVpc** operation is asynchronous. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of a VPC:
      *     *   If the VPC is in the **Creating** state, the VPC is being created.
      *     *   If the VPC is in the **Created** state, the VPC is created.
      * *   You cannot repeatedly call the **CreateVpc** operation to create default VPCs within the specified period of time. However, you can repeatedly call this operation to create custom VPCs within the specified period of time.
      *
     */
    CompletableFuture<CreateVpcResponse> createVpc(CreateVpcRequest request);

    /**
      * The description of the gateway endpoint.
      * The description must be 1 to 255 characters in length.
      *
     */
    CompletableFuture<CreateVpcGatewayEndpointResponse> createVpcGatewayEndpoint(CreateVpcGatewayEndpointRequest request);

    /**
      * You cannot repeatedly call the **CreateVpcPrefixList** operation to create a prefix list in a region within the specified period of time.
      *
     */
    CompletableFuture<CreateVpcPrefixListResponse> createVpcPrefixList(CreateVpcPrefixListRequest request);

    /**
      * Specifies the party that must pay for the shared Express Connect circuit. Valid values:
      * *   **PayByPhysicalConnectionOwner**: If you set the value to PayByPhysicalConnectionOwner, the Express Connect partner must pay for the shared Express Connect circuit.
      * *   **PayByVirtualPhysicalConnectionOwner**: If you set the value to PayByVirtualPhysicalConnectionOwner, the tenant must pay for the shared Express Connect circuit.
      *
     */
    CompletableFuture<CreateVpconnFromVbrResponse> createVpconnFromVbr(CreateVpconnFromVbrRequest request);

    /**
      * By default, an IPsec-VPN connection created by calling the `CreateVpnAttachment` operation is not associated with a resource. You can associate an IPsec-VPN connection with a transit router by calling the [CreateTransitRouterVpnAttachment](~~443993~~) operation.
      * ## Prerequisites
      * Before you create an IPsec-VPN connection, make sure that you created a customer gateway in the region where you want to create the IPsec-VPN connection. For more information, see [CreateCustomerGateway](/help/en/vpn-gateway/latest/createcustomergateway). 
      * If you want to add BGP configurations to an IPsec-VPN connection, make sure that an autonomous system number (ASN) is assigned to the customer gateway.
      *
     */
    CompletableFuture<CreateVpnAttachmentResponse> createVpnAttachment(CreateVpnAttachmentRequest request);

    /**
      * *   **CreateVpnConnection** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the IPsec-VPN connection is being created.
      *     *   If the VPN gateway is in the **active** state, the IPsec-VPN connection has been created.
      * *   You cannot repeatedly call **CreateVpnConnection** to create an IPsec-VPN connection on a VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<CreateVpnConnectionResponse> createVpnConnection(CreateVpnConnectionRequest request);

    /**
      * The region ID of the VPN gateway. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
      *
     */
    CompletableFuture<CreateVpnGatewayResponse> createVpnGateway(CreateVpnGatewayRequest request);

    /**
      * *   Before you call this operation, we recommend that you learn about the match rules of policy-based routes and limits on policy-based routes. For more information, see [Work with policy-based routes](~~110777~~).
      * *   Before you create a policy-based route, make sure that an IPsec-VPN connection is created. For more information, see [CreateVpnConnection](~~120391~~).
      * *   **CreateVpnPbrRouteEntry** is an asynchronous operation. After you send the request, the route information is returned but the operation is still being performed in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If a VPN gateway is in the **updating** state, the policy-based route entry is being created.
      *     *   If a VPN gateway is in the **active** state, the policy-based route entry is created.
      * *   You cannot repeatedly call **CreateVpnPbrRouteEntry** to create a policy-based route for a VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<CreateVpnPbrRouteEntryResponse> createVpnPbrRouteEntry(CreateVpnPbrRouteEntryRequest request);

    /**
      * *   **CreateVpnRouteEntry** is an asynchronous operation. After you call the operation, the route configurations are returned but the operation is still being performed in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a destination-based route entry.
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
      * You cannot repeatedly call the **DeleteCommonBandwidthPackage** operation to delete an EIP bandwidth plan within the specified period of time.
      *
     */
    CompletableFuture<DeleteCommonBandwidthPackageResponse> deleteCommonBandwidthPackage(DeleteCommonBandwidthPackageRequest request);

    CompletableFuture<DeleteCustomerGatewayResponse> deleteCustomerGateway(DeleteCustomerGatewayRequest request);

    /**
      * *   The **DeleteDhcpOptionsSet** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [GetDhcpOptionsSet](~~189208~~) operation to query the status of a DHCP options set:
      *     *   If the DHCP options set is in the **Deleting** state, the DHCP options set is being deleted.
      *     *   If you cannot query the DHCP options set, the DHCP options set is deleted.
      * *   You cannot repeatedly call the **DeleteDhcpOptionsSet** operation to delete a DHCP options set within the specified period of time.
      *
     */
    CompletableFuture<DeleteDhcpOptionsSetResponse> deleteDhcpOptionsSet(DeleteDhcpOptionsSetRequest request);

    /**
      * *   The **DeleteFlowLog** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      *     *   If the flow log is in the **Deleting** state, the flow log is being deleted.
      *     *   If you cannot query the flow log, the flow log is deleted.
      * *   You cannot repeatedly call the **DeleteFlowLog** operation to delete a flow log within the specified period of time.
      *
     */
    CompletableFuture<DeleteFlowLogResponse> deleteFlowLog(DeleteFlowLogRequest request);

    /**
      * The region ID of the NAT gateway.
      * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
      *
     */
    CompletableFuture<DeleteForwardEntryResponse> deleteForwardEntry(DeleteForwardEntryRequest request);

    /**
      * The operation that you want to perform. Set the value to **DeleteFullNatEntry**.
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
      * *   The **DeleteIpsecServer** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If a VPN gateway is in the **updating** state, the IPsec server is being deleted.
      *     *   If a VPN gateway is in the **active** state, the IPsec server has been deleted.
      * *   You cannot repeatedly call **DeleteIpsecServer** to delete an IPsec server from a VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<DeleteIpsecServerResponse> deleteIpsecServer(DeleteIpsecServerRequest request);

    /**
      * The ID of the IPv4 gateway that you want to delete.
      *
     */
    CompletableFuture<DeleteIpv4GatewayResponse> deleteIpv4Gateway(DeleteIpv4GatewayRequest request);

    /**
      * *   **DeleteIpv6EgressOnlyRule** is an asynchronous operation. After you send a request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeIpv6EgressOnlyRules](~~102208~~) operation to query whether the egress-only rule is deleted.
      *     *   If the egress-only rule is in the **Deleting** state, it indicates that the egress-only rule is being deleted.
      *     *   If you cannot query the egress-only rule, it indicates that the egress-only rule is deleted.
      * *   You cannot call the **DeleteIpv6EgressOnlyRule** operation to delete an egress-only rule again when the rule is being deleted.
      *
     */
    CompletableFuture<DeleteIpv6EgressOnlyRuleResponse> deleteIpv6EgressOnlyRule(DeleteIpv6EgressOnlyRuleRequest request);

    /**
      * - The **DeleteIpv6Gateway** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeIpv6GatewayAttribute](/help/en/virtual-private-cloud/latest/describeipv6gatewayattribute) operation to query the status of an IPv6 gateway:   - If the IPv6 gateway is in the **Deleting** state, the IPv6 gateway is being deleted.
      *   - If you cannot query the IPv6 gateway, the IPv6 gateway is deleted.
      * - After you call the **DeleteIpv6Gateway** operation to delete an IPv6 gateway, you cannot call the operation again to delete the IPv6 gateway until the deletion task is complete.
      * ## Prerequisites
      * Before you delete an IPv6 gateway, you must delete the egress-only rules of the IPv6 gateway. For more information, see [DeleteIpv6EgressOnlyRule](~~102201~~).
      *
     */
    CompletableFuture<DeleteIpv6GatewayResponse> deleteIpv6Gateway(DeleteIpv6GatewayRequest request);

    /**
      * You cannot call the **DeleteIpv6InternetBandwidth** operation to delete the same Internet bandwidth at the same time.
      *
     */
    CompletableFuture<DeleteIpv6InternetBandwidthResponse> deleteIpv6InternetBandwidth(DeleteIpv6InternetBandwidthRequest request);

    /**
      * The ID of the region where the NAT gateway is deployed.
      * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
      *
     */
    CompletableFuture<DeleteNatGatewayResponse> deleteNatGateway(DeleteNatGatewayRequest request);

    /**
      * The ID of the NAT IP address that you want to delete.
      *
     */
    CompletableFuture<DeleteNatIpResponse> deleteNatIp(DeleteNatIpRequest request);

    /**
      * You cannot repeatedly call the **DeleteNatIpCidr** operation to delete a NAT CIDR block within the specified period of time.
      *
     */
    CompletableFuture<DeleteNatIpCidrResponse> deleteNatIpCidr(DeleteNatIpCidrRequest request);

    /**
      * You cannot repeatedly call the **DeleteNetworkAcl** operation to delete a network ACL within the specified period of time.
      *
     */
    CompletableFuture<DeleteNetworkAclResponse> deleteNetworkAcl(DeleteNetworkAclRequest request);

    /**
      * ## Limit
      * You can only delete a connection over an Express Connect circuit that is in the **Rejected**, **Canceled**, **AllocationFailed**, or **Terminated** state.
      *
     */
    CompletableFuture<DeletePhysicalConnectionResponse> deletePhysicalConnection(DeletePhysicalConnectionRequest request);

    /**
      * The ID of the IP address pool.
      *
     */
    CompletableFuture<DeletePublicIpAddressPoolResponse> deletePublicIpAddressPool(DeletePublicIpAddressPoolRequest request);

    /**
      * The ID of the IP address pool.
      *
     */
    CompletableFuture<DeletePublicIpAddressPoolCidrBlockResponse> deletePublicIpAddressPoolCidrBlock(DeletePublicIpAddressPoolCidrBlockRequest request);

    /**
      * When you call this operation, take note of the following items:
      * *   You can delete only route entries that are in the **Available** state.
      * *   You cannot delete a route entry of a virtual private cloud (VPC) in which a vSwitch or another route entry is being created or deleted.
      * *   **DeleteRouteEntries** is an asynchronous operation. After you call this operation, the system returns a request ID and runs the task in the background. You can call the [DescribeRouteEntryList](~~138148~~) operation to query the status of a route entry.
      *     *   If the route entry is in the **Deleting** state, the route entry is being deleted.
      *     *   If you cannot query the route entry, the route entry is deleted.
      * *   You cannot repeatedly call **DeleteRouteEntries** within a specific period of time.
      *
     */
    CompletableFuture<DeleteRouteEntriesResponse> deleteRouteEntries(DeleteRouteEntriesRequest request);

    /**
      * When you call this operation, take note of the following rules:
      * *   You can delete only routes that are in the **Available** state.
      * *   You cannot delete a route of a virtual private cloud (VPC) in which a vSwitch or a route is being created.
      * *   Before you call this operation to delete a route of a VBR route table, call the [DescribeRouteEntryList](~~138148~~) operation to query the **NextHopId** of the route first.
      * *   The **DeleteRouteEntry** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeRouteEntryList](~~138148~~) operation to query the status of a route:
      *     *   If the route is in the **Deleting** state, the route is being deleted.
      *     *   If you cannot query the route, the route is deleted.
      * *   You cannot repeatedly call the **DeleteRouteEntry** operation to delete a route from the route table of a vRouter or a VBR within the specified period of time.
      *
     */
    CompletableFuture<DeleteRouteEntryResponse> deleteRouteEntry(DeleteRouteEntryRequest request);

    /**
      * *   The **DeleteRouteTable** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeRouteTableList](~~87602~~) operation to query the status of a custom route table:
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
      * *   The **DeleteSslVpnClientCert** operation is asynchronous. After you send a request, the system returns a request ID. However, the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway associated with an SSL server. You can check whether an SSL client certificate is deleted based on the status of the VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the SSL client certificate is being deleted.
      *     *   If the VPN gateway is in the **active** state, the SSL client certificate is deleted.
      * *   You cannot repeatedly call **DeleteSslVpnClientCert** to delete an SSL client certificate from the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<DeleteSslVpnClientCertResponse> deleteSslVpnClientCert(DeleteSslVpnClientCertRequest request);

    /**
      * *   The **DeleteSslVpnServer** operation is asynchronous. After you send a request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of an SSL server based on the status of the associated VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the SSL server is being deleted.
      *     *   If the VPN gateway is in the **active** state, the SSL server is deleted.
      * *   You cannot repeatedly call the **DeleteSslVpnServer** operation to delete an SSL server from the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<DeleteSslVpnServerResponse> deleteSslVpnServer(DeleteSslVpnServerRequest request);

    /**
      * The ID of the filter.
      *
     */
    CompletableFuture<DeleteTrafficMirrorFilterResponse> deleteTrafficMirrorFilter(DeleteTrafficMirrorFilterRequest request);

    /**
      * The ID of the filter.
      *
     */
    CompletableFuture<DeleteTrafficMirrorFilterRulesResponse> deleteTrafficMirrorFilterRules(DeleteTrafficMirrorFilterRulesRequest request);

    /**
      * The client token that is used to ensure the idempotence of the request.
      * You can use the client to generate the value, but you must make sure that it is unique among all requests. ClientToken can contain only ASCII characters.
      * >  If you do not specify this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.
      *
     */
    CompletableFuture<DeleteTrafficMirrorSessionResponse> deleteTrafficMirrorSession(DeleteTrafficMirrorSessionRequest request);

    /**
      * When you call this operation, take note of the following limits:
      * *   Before you delete a vSwitch, you must first release or remove all virtual private cloud (VPC) resources, including vSwitches, instances, router interfaces, and high-availability virtual IP addresses (HAVIPs).
      * *   You can delete only vSwitches that are in the **Available** state.
      * *   You cannot delete a vSwitch from a VPC where a vSwitch or a route is being created or deleted.
      * *   **DeleteVSwitch** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of a vSwitch:
      *     *   If the vSwitch is in the **Pending** state, the vSwitch is being deleted.
      *     *   If you cannot query the vSwitch, the vSwitch is deleted.
      * *   You cannot repeatedly call the **DeleteVSwitch** operation to delete a vSwitch within the specified period of time.
      *
     */
    CompletableFuture<DeleteVSwitchResponse> deleteVSwitch(DeleteVSwitchRequest request);

    CompletableFuture<DeleteVbrHaResponse> deleteVbrHa(DeleteVbrHaRequest request);

    /**
      * *   The **DeleteVcoRouteEntry** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of a route based on the status of the associated IPsec-VPN connection.
      *     *   If the IPsec-VPN connection is in the **updating** state, the route is being deleted.
      *     *   If the IPsec-VPN connection is in the **attached** state, the route is deleted.
      * *   You cannot repeatedly call the **DeleteVcoRouteEntry** operation to delete a route from the same IPsec-VPN connection within the specified period of time.
      *
     */
    CompletableFuture<DeleteVcoRouteEntryResponse> deleteVcoRouteEntry(DeleteVcoRouteEntryRequest request);

    /**
      * ## Limits
      * Before you call this operation, take note of the following limits:
      * *   Before you delete a VBR, you must delete all router interfaces of the VBR.
      * *   You can delete only a VBR that is in the** Unconfirmed**,** Enabled**, or** Terminated** state.
      * *   If the owner of an Express Connect circuit wants to delete a VBR that belongs to another Alibaba Cloud account, the VBR must be in the **Unconfirmed** state.
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
      * The ID of the prefix list that you want to delete.
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
      * *   The **DeleteVpnConnection** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the IPsec-VPN connection is being deleted.
      *     *   If the VPN gateway is in the **active** state, the IPsec-VPN connection is deleted.
      * *   You cannot repeatedly call **DeleteVpnConnection** to delete an IPsec-VPN connection from the same VPN gateway within the specified period of time.
      * >  After an IPsec-VPN connection between a virtual private cloud (VPC) and a data center is deleted, the communication between the VPC and data center is interrupted.
      *
     */
    CompletableFuture<DeleteVpnConnectionResponse> deleteVpnConnection(DeleteVpnConnectionRequest request);

    /**
      * >  You cannot delete a VPN gateway that is associated with an IPsec-VPN connection.
      *
     */
    CompletableFuture<DeleteVpnGatewayResponse> deleteVpnGateway(DeleteVpnGatewayRequest request);

    /**
      * *   The **DeleteVpnPbrRouteEntry** operation is asynchronous. After you call the operation, the request ID is returned but the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If a VPN gateway is in the **updating** state, the policy-based route is being deleted.
      *     *   If a VPN gateway is in the **active** state, the policy-based route has been deleted.
      * *   You cannot repeatedly call **DeleteVpnPbrRouteEntry** to delete a policy-based route within the specified period of time.
      *
     */
    CompletableFuture<DeleteVpnPbrRouteEntryResponse> deleteVpnPbrRouteEntry(DeleteVpnPbrRouteEntryRequest request);

    /**
      * *   The **DeleteRouteEntry** operation is asynchronous. After you send the request, the system returns a request ID but the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If a VPN gateway is in the **updating** state, the destination-based route is being deleted.
      *     *   If the VPN gateway is in the **active** state, the destination-based route has been deleted.
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
      * The number of the page to return. Default value: **1**.
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

    CompletableFuture<DescribeVpnGatewaysResponse> describeVpnGateways(DescribeVpnGatewaysRequest request);

    CompletableFuture<DescribeVpnPbrRouteEntriesResponse> describeVpnPbrRouteEntries(DescribeVpnPbrRouteEntriesRequest request);

    CompletableFuture<DescribeVpnRouteEntriesResponse> describeVpnRouteEntries(DescribeVpnRouteEntriesRequest request);

    CompletableFuture<DescribeVpnSslServerLogsResponse> describeVpnSslServerLogs(DescribeVpnSslServerLogsRequest request);

    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
      * The region to which the DHCP options set belongs. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
      *
     */
    CompletableFuture<DetachDhcpOptionsSetFromVpcResponse> detachDhcpOptionsSetFromVpc(DetachDhcpOptionsSetFromVpcRequest request);

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
      * ## Usage notes
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
      * The region ID of the Express Connect circuit.
      * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
      *
     */
    CompletableFuture<EnablePhysicalConnectionResponse> enablePhysicalConnection(EnablePhysicalConnectionRequest request);

    CompletableFuture<EnableVpcClassicLinkResponse> enableVpcClassicLink(EnableVpcClassicLinkRequest request);

    /**
      * The ID of the IPv4 gateway that you want to activate.
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

    CompletableFuture<GetNatGatewayConvertStatusResponse> getNatGatewayConvertStatus(GetNatGatewayConvertStatusRequest request);

    /**
      * You can call this API operation to query the status of outbound data transfer billing for the current account. For more information about outbound data transfer billing, see [Outbound data transfer billing](~~274385~~) and [Billing](~~54582~~).
      *
     */
    CompletableFuture<GetPhysicalConnectionServiceStatusResponse> getPhysicalConnectionServiceStatus(GetPhysicalConnectionServiceStatusRequest request);

    CompletableFuture<GetTrafficMirrorServiceStatusResponse> getTrafficMirrorServiceStatus(GetTrafficMirrorServiceStatusRequest request);

    CompletableFuture<GetVpcGatewayEndpointAttributeResponse> getVpcGatewayEndpointAttribute(GetVpcGatewayEndpointAttributeRequest request);

    CompletableFuture<GetVpcPrefixListAssociationsResponse> getVpcPrefixListAssociations(GetVpcPrefixListAssociationsRequest request);

    CompletableFuture<GetVpcPrefixListEntriesResponse> getVpcPrefixListEntries(GetVpcPrefixListEntriesRequest request);

    CompletableFuture<GetVpcRouteEntrySummaryResponse> getVpcRouteEntrySummary(GetVpcRouteEntrySummaryRequest request);

    /**
      * When you call the **GetVpnGatewayDiagnoseResult** operation, you must set one of the **DiagnoseId** and **VpnGatewayId** parameters.
      *
     */
    CompletableFuture<GetVpnGatewayDiagnoseResultResponse> getVpnGatewayDiagnoseResult(GetVpnGatewayDiagnoseResultRequest request);

    /**
      * *   Before you can attach a network instance that belongs to another Alibaba Cloud account to your CEN instance, you must grant permissions to your CEN instance.
      * >  **GrantInstanceToCen** is a Virtual Private Cloud (VPC) operation. Therefore, you must use `vpc.aliyuncs.com` as the domain name when you call this operation. The API version is `2016-04-28`.
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
      * *   Set **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object to be queried.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you set only **Tag.N.Key**, all tag values that are associated with the specified key are returned. If you set only **Tag.N.Value**, an error message is returned.
      * *   If you set **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * *   You must specify **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object that you want to query.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you specify only **Tag.N.Key**, all tag values that are associated with the specified tag key are returned. If you specify only **Tag.N.Value**, an error message is returned.
      * *   If you specify **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.
      *
     */
    CompletableFuture<ListTagResourcesForExpressConnectResponse> listTagResourcesForExpressConnect(ListTagResourcesForExpressConnectRequest request);

    CompletableFuture<ListTrafficMirrorFiltersResponse> listTrafficMirrorFilters(ListTrafficMirrorFiltersRequest request);

    CompletableFuture<ListTrafficMirrorSessionsResponse> listTrafficMirrorSessions(ListTrafficMirrorSessionsRequest request);

    CompletableFuture<ListVirtualPhysicalConnectionsResponse> listVirtualPhysicalConnections(ListVirtualPhysicalConnectionsRequest request);

    CompletableFuture<ListVpcEndpointServicesByEndUserResponse> listVpcEndpointServicesByEndUser(ListVpcEndpointServicesByEndUserRequest request);

    CompletableFuture<ListVpcGatewayEndpointsResponse> listVpcGatewayEndpoints(ListVpcGatewayEndpointsRequest request);

    /**
      * ## Usage notes
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
      * You can call the **ModifyCommonBandwidthPackageIpBandwidth** operation to set the maximum bandwidth of an EIP that is associated with an EIP bandwidth plan. This prevents an EIP from exhausting the bandwidth resources of an EIP bandwidth plan.
      * For example, two EIPs are associated with an EIP bandwidth plan whose maximum bandwidth is 800 Mbit/s. In this case, you can set the maximum bandwidth of one EIP to 500 Mbit/s and that of the other EIP to 400 Mbit/s. After you set the maximum bandwidth values, the first EIP cannot consume bandwidth higher than 500 Mbit/s. The second EIP cannot consume bandwidth higher than 400 Mbit/s.
      * When you call this operation, take note of the following items:
      * *   This operation is valid only for EIPs that are associated with Elastic Compute Service (ECS) instances. This operation is invalid for EIPs that are associated with Server Load Balancer (SLB) instances, NAT gateways, secondary elastic network interfaces (ENIs), or high-availability virtual IP addresses (HAVIPs).
      * *   This operation is in public preview. You can call this operation to set the maximum bandwidth of EIPs only if the EIPs are associated with an EIP bandwidth plan. The feature is not supported in the console.
      * *   You cannot repeatedly call this operation to set the maximum bandwidth of an EIP within the specified period of time.
      *
     */
    CompletableFuture<ModifyCommonBandwidthPackageIpBandwidthResponse> modifyCommonBandwidthPackageIpBandwidth(ModifyCommonBandwidthPackageIpBandwidthRequest request);

    /**
      * The region ID of the EIP bandwidth plan.
      * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
      *
     */
    CompletableFuture<ModifyCommonBandwidthPackageSpecResponse> modifyCommonBandwidthPackageSpec(ModifyCommonBandwidthPackageSpecRequest request);

    /**
      * *   When you call **ModifyCustomerGatewayAttribute**, if a value is assigned to **AuthKey**, the operation is asynchronous. After you call the operation, the information about the customer gateway is returned but the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a customer gateway.
      *     *   If a VPN gateway is in the **updating** state, the configurations are being modified.
      *     *   If a VPN gateway is in the **active** state, the configurations have been modified.
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
      * The ID of the DNAT table to which the DNAT entry belongs.
      *
     */
    CompletableFuture<ModifyForwardEntryResponse> modifyForwardEntry(ModifyForwardEntryRequest request);

    /**
      * The operation that you want to perform. Set the value to **ModifyFullNatEntryAttribute**.
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
      * You cannot repeatedly call the **ModifyIpv6GatewaySpec** operation to change the specification of an IPv6 gateway within the specified period of time.
      *
     */
    CompletableFuture<ModifyIpv6GatewaySpecResponse> modifyIpv6GatewaySpec(ModifyIpv6GatewaySpecRequest request);

    /**
      * You cannot call the **ModifyIpv6InternetBandwidth** operation to modify the Internet bandwidth value of an IPv6 CIDR block at the same time.
      *
     */
    CompletableFuture<ModifyIpv6InternetBandwidthResponse> modifyIpv6InternetBandwidth(ModifyIpv6InternetBandwidthRequest request);

    /**
      * You can call this operation to query an Internet NAT gateway or a virtual private cloud (VPC) NAT gateway. The term NAT gateway in this topic refers to both types of NAT gateway.
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
      * The ID of the NAT IP address that you want to modify.
      *
     */
    CompletableFuture<ModifyNatIpAttributeResponse> modifyNatIpAttribute(ModifyNatIpAttributeRequest request);

    CompletableFuture<ModifyNatIpCidrAttributeResponse> modifyNatIpCidrAttribute(ModifyNatIpCidrAttributeRequest request);

    CompletableFuture<ModifyNetworkAclAttributesResponse> modifyNetworkAclAttributes(ModifyNetworkAclAttributesRequest request);

    /**
      * ## Limits
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
      * After you call this operation, the router interface enters the **Activating** state. After the router interface is activated, the router interface enters the **Active** state.
      * >  You cannot modify the specifications of a router interface that has overdue payments.
      *
     */
    CompletableFuture<ModifyRouterInterfaceSpecResponse> modifyRouterInterfaceSpec(ModifyRouterInterfaceSpecRequest request);

    /**
      * **ModifySnatEntry** is an asynchronous operation. After you make a request, the ID of the request is returned but the specified SNAT entry is not modified. The system modifies the entry in the background. You can call the [DescribeSnatTableEntries](~~42677~~) operation to query the status of a SNAT entry.
      * *   **Pending**: indicates that the system is modifying the SNAT entry. You can only query the status of the SNAT entry, but cannot perform other operations.
      * *   **Available**: indicates that the SNAT entry is modified.
      * >  **Pending**: indicates that you cannot modify the SNAT entry in the SNAT table.
      * You cannot repeatedly call the **ModifySnatEntry** operation to modify an SNAT entry within the specified period of time.
      *
     */
    CompletableFuture<ModifySnatEntryResponse> modifySnatEntry(ModifySnatEntryRequest request);

    CompletableFuture<ModifySslVpnClientCertResponse> modifySslVpnClientCert(ModifySslVpnClientCertRequest request);

    /**
      * *   If you modify only the **name** of the SSL server, the operation is synchronous. If you also modify other configurations, the operation is asynchronous.
      * *   When **ModifySslVpnServer** is an asynchronous operation, the system returns the request ID but the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If a VPN gateway is in the **updating** state, the configurations of the SSL server are being modified.
      *     *   If a VPN gateway is in the **active** state, the configurations of the SSL server have been modified.
      * *   You cannot repeatedly call **ModifySslVpnServer** to modify the configurations of an SSL server within the specified period of time.
      *
     */
    CompletableFuture<ModifySslVpnServerResponse> modifySslVpnServer(ModifySslVpnServerRequest request);

    /**
      * The ID of the vRouter.
      *
     */
    CompletableFuture<ModifyVRouterAttributeResponse> modifyVRouterAttribute(ModifyVRouterAttributeRequest request);

    /**
      * *   The **ModifyVSwitchAttribute** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of a vSwitch:
      *     *   If the vSwitch is in the **Pending** state, the vSwitch is being modified.
      *     *   If the vSwitch is in the **Available** state, the vSwitch is available.
      * *   You cannot repeatedly call the **ModifyVSwitchAttribute** operation to modify the name and description of a vSwitch within the specified period of time.
      *
     */
    CompletableFuture<ModifyVSwitchAttributeResponse> modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request);

    /**
      * *   **ModifyVcoRouteEntryWeight** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of the associated IPsec-VPN connection and determine whether the weight of the specified destination-based route is modified.
      *     *   If the IPsec-VPN connection is in the **updating** state, the weight of the destination-based route is being modified.
      *     *   If the IPsec-VPN connection is in the **attached** state, the weight of the destination-based route is modified.
      * *   You cannot repeatedly call the **ModifyVcoRouteEntryWeight** operation for the same IPsec-VPN connection within the specified period of time.
      *
     */
    CompletableFuture<ModifyVcoRouteEntryWeightResponse> modifyVcoRouteEntryWeight(ModifyVcoRouteEntryWeightRequest request);

    /**
      * *   Only the owner of an Express Connect circuit can modify the **VlanId** parameter.
      * *   One VLAN ID of an Express Connect circuit cannot be used by two VBRs at the same time.
      * *   The VLAN ID of a VBR in the **Terminated** state is reserved for seven days and cannot be used by other VBRs. The VLAN ID can be used by other VBRs after 7 days.
      * *   You cannot set **LocalGatewayIp**, **PeerGatewayIp**, or **PeeringSubnetMask** for VBRs that do not belong to your Alibaba Cloud account.
      * *   Set **PeeringSubnetMask** to a subnet mask with 24 to 30 bits in length (255.255.255.0～255.255.255.252).
      * *   Set **LocalGatewayIp** and **PeerGatewayIp** to IP addresses that belong to the same CIDR block. For example, you can set LocalGatewayIp to 192.168.XX.XX, PeerGatewayIp to 192.168.XX.XX, and PeeringSubnetMask to 255.255.255.248.
      *
     */
    CompletableFuture<ModifyVirtualBorderRouterAttributeResponse> modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request);

    /**
      * You cannot repeatedly call the **ModifyVpcAttribute** operation to modify the name and description of a VPC within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpcAttributeResponse> modifyVpcAttribute(ModifyVpcAttributeRequest request);

    /**
      * The ID of the prefix list.
      *
     */
    CompletableFuture<ModifyVpcPrefixListResponse> modifyVpcPrefixList(ModifyVpcPrefixListRequest request);

    /**
      * *   **ModifyVpnAttachmentAttribute** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of an IPsec-VPN connection.
      *     *   If the IPsec-VPN connection is in the **updating** state, it indicates that the IPsec-VPN connection is being modified.
      *     *   If the IPsec-VPN connection is in the **attached** state, it indicates that the IPsec-VPN connection is modified.
      * *   You cannot call the **ModifyVpnAttachmentAttribute** operation again on the same IPsec-VPN connection before the previous operation is complete.
      * *   When you call the **ModifyVpnAttachmentAttribute** operation, take note of the following items:
      *     *   If the IPsec-VPN connection is associated with a transit router, you cannot change the type of the gateway connected to the IPsec-VPN connection.
      *     *   If the IPsec-VPN connection is not associated with a resource, you cannot change the type of the gateway connected to the IPsec-VPN connection or the customer gateway connected to the IPsec-VPN connection.
      *
     */
    CompletableFuture<ModifyVpnAttachmentAttributeResponse> modifyVpnAttachmentAttribute(ModifyVpnAttachmentAttributeRequest request);

    /**
      * *   **ModifyVpnConnectionAttribute** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the VPN gateway. The status of the VPN gateway indicates whether the IPsec-VPN connection is modified.
      *     *   If the VPN gateway is in the **updating** state, it indicates that the IPsec-VPN connection is being modified.
      *     *   If the VPN gateway is in the **active** state, it indicates that the IPsec-VPN connection is modified.
      * *   You cannot call the **ModifyVpnConnectionAttribute** operation again on the same VPN gateway to modify the configuration of an IPsec-VPN connection before the previous operation is complete.
      *
     */
    CompletableFuture<ModifyVpnConnectionAttributeResponse> modifyVpnConnectionAttribute(ModifyVpnConnectionAttributeRequest request);

    /**
      * *   **ModifyVpnGatewayAttribute** is an asynchronous operation. After you send the request, the information about the VPN gateway is returned but the operation is still being performed in the system background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of a VPN gateway.
      *     *   If a VPN gateway is in the **updating** state, the VPN gateway is being modified.
      *     *   If a VPN gateway is in the **active** state, the VPN gateway has been modified.
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
      *     *   If the VPN gateway is in the **updating** state, the policy-based route is being created.
      *     *   If the VPN gateway is in the **active** state, the policy-based route is created.
      * *   You cannot repeatedly call the **ModifyVpnPbrRouteEntryAttribute** operation for the same VPN gateway within the specified period of time
      *
     */
    CompletableFuture<ModifyVpnPbrRouteEntryAttributeResponse> modifyVpnPbrRouteEntryAttribute(ModifyVpnPbrRouteEntryAttributeRequest request);

    /**
      * *   The **ModifyVpnPbrRouteEntryPriority** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the policy-based route is being created.
      *     *   If the VPN gateway is in the **active** state, the policy-based route is created.
      * *   You cannot repeatedly call the **ModifyVpnPbrRouteEntryPriority** operation for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpnPbrRouteEntryPriorityResponse> modifyVpnPbrRouteEntryPriority(ModifyVpnPbrRouteEntryPriorityRequest request);

    /**
      * *   The **ModifyVpnPbrRouteEntryWeight** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If a VPN gateway is in the **updating** state, the policy-based route entry is being modified.
      *     *   If a VPN gateway is in the **active** state, the policy-based route entry is modified.
      * *   You cannot repeatedly call the **ModifyVpnPbrRouteEntryWeight** operation for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpnPbrRouteEntryWeightResponse> modifyVpnPbrRouteEntryWeight(ModifyVpnPbrRouteEntryWeightRequest request);

    /**
      * *   The **ModifyVpnRouteEntryWeight** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the weight of the destination-based route is being modified.
      *     *   If the VPN gateway is in the **active** state, the weight of the destination-based route is modified.
      * *   You cannot repeatedly call the **ModifyVpnRouteEntryWeight** operation to modify the weight of destination-based route for the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpnRouteEntryWeightResponse> modifyVpnRouteEntryWeight(ModifyVpnRouteEntryWeightRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
      * *   You cannot repeatedly call the **OpenFlowLogService** operation within the specified period of time by using an Alibaba Cloud account.
      * *   You can call the [GetFlowLogServiceStatus](~~449624~~) operation to query the status of the flow log feature.
      *
     */
    CompletableFuture<OpenFlowLogServiceResponse> openFlowLogService(OpenFlowLogServiceRequest request);

    CompletableFuture<OpenPhysicalConnectionServiceResponse> openPhysicalConnectionService(OpenPhysicalConnectionServiceRequest request);

    /**
      * You can enable traffic mirroring for different regions. You cannot repeatedly call the **OpenTrafficMirrorService** operation to enable traffic mirroring for one region within the specified period of time.
      *
     */
    CompletableFuture<OpenTrafficMirrorServiceResponse> openTrafficMirrorService(OpenTrafficMirrorServiceRequest request);

    CompletableFuture<PublishVpnRouteEntryResponse> publishVpnRouteEntry(PublishVpnRouteEntryRequest request);

    /**
      * The ID of the Express Connect circuit.
      * >  You can resume only shared Express Connect circuits.
      *
     */
    CompletableFuture<RecoverPhysicalConnectionResponse> recoverPhysicalConnection(RecoverPhysicalConnectionRequest request);

    /**
      * After the operation is called, the virtual border router (VBR) changes from the **Terminated** state to the **Recovering** state. When the VBR recovers, it enters the **Enabled** state.
      * When you call this operation, take note of the following items:
      * *   Only the owner of the Express Connect circuit can call this operation.
      * *   The Express Connect circuit to which the VBR connects must be in the **Enabled** state.
      *
     */
    CompletableFuture<RecoverVirtualBorderRouterResponse> recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request);

    /**
      * Before you call this operation, take note of the following limits:
      * *   Before you release an EIP, make sure that the EIP meets the following requirements:
      *     *   You can release only an EIP that is in the **Available** state.
      *     *   You can release only a pay-as-you-go EIP. You cannot release a subscription EIP.
      * *   The **ReleaseEipAddress** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeEipAddresses](~~120193~~) operation to query the status of an EIP:
      *     *   If the EIP is in the **Releasing** state, the EIP is being released. In this state, you can only query the EIP and cannot perform other operations.
      *     *   If you cannot query the EIP, the EIP is released.
      * *   You cannot repeatedly call the **ReleaseEipAddress** operation to release an EIP within the specified period of time.
      *
     */
    CompletableFuture<ReleaseEipAddressResponse> releaseEipAddress(ReleaseEipAddressRequest request);

    /**
      * *   After you call the **ReleaseEipSegmentAddress** operation, all EIPs in the specified group are released.
      * *   The **ReleaseEipSegmentAddress** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeEipSegment](~~156063~~) operation to query the status of a group of contiguous EIPs:
      *     *   If the group is in the **Releasing** state, EIPs in the group are being released. In this state, you can only query the group and cannot perform other operations.
      *     *   If you cannot query the group of contiguous EIPs, the contiguous EIPs are released.
      * *   You cannot repeatedly call the **ReleaseEipSegmentAddress** operation to release a group of contiguous EIPs within the specified period of time.
      *
     */
    CompletableFuture<ReleaseEipSegmentAddressResponse> releaseEipSegmentAddress(ReleaseEipSegmentAddressRequest request);

    CompletableFuture<RemoveCommonBandwidthPackageIpResponse> removeCommonBandwidthPackageIp(RemoveCommonBandwidthPackageIpRequest request);

    CompletableFuture<RemoveGlobalAccelerationInstanceIpResponse> removeGlobalAccelerationInstanceIp(RemoveGlobalAccelerationInstanceIpRequest request);

    CompletableFuture<RemoveIPv6TranslatorAclListEntryResponse> removeIPv6TranslatorAclListEntry(RemoveIPv6TranslatorAclListEntryRequest request);

    /**
      * The client token that is used to ensure the idempotence of the request.
      * You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
      * >  If you do not set this parameter, the system uses **RequestId** as **ClientToken**. **RequestId** may be different for each API request.
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
      * ## Scenarios
      * A prefix list can be successfully modified if the following requirements are met: CIDR blocks are valid, CIDR blocks do not conflict, and the number of CIDR blocks does not exceed the maximum number of CIDR blocks supported by the prefix list. If issues occur on the resource that references the prefix list, the reference may fail. The issues include the number of prefix list entries exceeding the quota or CIDR blocks conflicting with existing routes. After you resolve the issues, you can call the **RetryVpcPrefixListAssociation** operation to re-apply the prefix list.
      *
     */
    CompletableFuture<RetryVpcPrefixListAssociationResponse> retryVpcPrefixListAssociation(RetryVpcPrefixListAssociationRequest request);

    /**
      * *   **RevokeInstanceFromCen** is a Virtual Private Cloud (VPC) operation. Therefore, you must use `vpc.aliyuncs.com` as the domain name when you call this operation. The API version is `2016-04-28`.
      * *   You cannot repeatedly call the **RevokeInstanceFromCen** operation to revoke the permissions on a network instance that is attached to a CEN instance within the specified period of time. The network instance can be a VPC, virtual border router (VBR), or a Cloud Connect Network (CCN) instance.
      *
     */
    CompletableFuture<RevokeInstanceFromCenResponse> revokeInstanceFromCen(RevokeInstanceFromCenRequest request);

    CompletableFuture<RevokeInstanceFromVbrResponse> revokeInstanceFromVbr(RevokeInstanceFromVbrRequest request);

    /**
      * You cannot repeatedly call **SetHighDefinitionMonitorLogStatus** within a specific period of time.
      *
     */
    CompletableFuture<SetHighDefinitionMonitorLogStatusResponse> setHighDefinitionMonitorLogStatus(SetHighDefinitionMonitorLogStatusRequest request);

    /**
      * The ID of the resource. You can specify up to 20 IDs.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * Tags are used to classify instances. Each tag consists of a key-value pair. To use tags, make sure that the following requirements are met:
      * *   The keys of tags that are added to the same instance must be unique.
      * *   You cannot create tags without adding them to instances. All tags must be added to instances.
      * *   Tag information is not shared across regions.
      *     For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.
      * *   You can add up to 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. If the maximum number of tags is reached, an error message is returned.
      *
     */
    CompletableFuture<TagResourcesForExpressConnectResponse> tagResourcesForExpressConnect(TagResourcesForExpressConnectRequest request);

    /**
      * After you call this operation, the specified Express Connect circuit changes to the **Terminating** state. After the Express Connect circuit is disabled, it changes to the **Terminated** state.
      * When you call this operation, take note of the following limits:
      * *   You can only terminate an Express Connect circuit that is in the **Enabled** state.
      * *   Before you disable an Express Connect circuit, you must delete the virtual border routers (VBRs) associated with it.
      *
     */
    CompletableFuture<TerminatePhysicalConnectionResponse> terminatePhysicalConnection(TerminatePhysicalConnectionRequest request);

    /**
      * After the operation is called, the VBR changes from the **Enabled** state to the **Terminating** state. After the VBR is terminated, it enters the **Terminated** state.
      * >  Only the owner of an Express Connect circuit can call this operation.
      *
     */
    CompletableFuture<TerminateVirtualBorderRouterResponse> terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request);

    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    /**
      * Specifies whether to disassociate the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway. Valid values:
      * *   **false** (default): does not disassociate the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway.
      * *   **true**: disassociates the EIP from a NAT gateway if a DNAT or SNAT entry is added to the NAT gateway.
      *
     */
    CompletableFuture<UnassociateEipAddressResponse> unassociateEipAddress(UnassociateEipAddressRequest request);

    CompletableFuture<UnassociateGlobalAccelerationInstanceResponse> unassociateGlobalAccelerationInstance(UnassociateGlobalAccelerationInstanceRequest request);

    /**
      * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The `ClientToken` value can contain only ASCII characters and cannot exceed 64 characters in length.
      *
     */
    CompletableFuture<UnassociateHaVipResponse> unassociateHaVip(UnassociateHaVipRequest request);

    /**
      * The ID of the resource from which you want to disassociate the network ACL.
      *
     */
    CompletableFuture<UnassociateNetworkAclResponse> unassociateNetworkAcl(UnassociateNetworkAclRequest request);

    CompletableFuture<UnassociatePhysicalConnectionFromVirtualBorderRouterResponse> unassociatePhysicalConnectionFromVirtualBorderRouter(UnassociatePhysicalConnectionFromVirtualBorderRouterRequest request);

    /**
      * *   The **UnassociateRouteTable** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of a vSwitch:
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

    CompletableFuture<UpdateGatewayRouteTableEntryAttributeResponse> updateGatewayRouteTableEntryAttribute(UpdateGatewayRouteTableEntryAttributeRequest request);

    /**
      * *   If you modify only the **IpsecServerName** parameter, this operation is synchronous. If you modify parameters other than **IpsecServerName**, this operation is asynchronous.
      * *   When the **UpdateIpsecServer** operation is asynchronous, the system returns a request ID after you send the request. However, the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the configuration of the IPsec server is being modified.
      *     *   If the VPN gateway is in the **active** state, the configuration of the IPsec server is modified.
      * *   You cannot repeatedly call **UpdateIpsecServer** to modify the configuration of an IPsec server of the same VPN gateway within the specified period of time.
      *
     */
    CompletableFuture<UpdateIpsecServerResponse> updateIpsecServer(UpdateIpsecServerRequest request);

    /**
      * The ID of the IPv4 gateway whose name or description you want to modify.
      *
     */
    CompletableFuture<UpdateIpv4GatewayAttributeResponse> updateIpv4GatewayAttribute(UpdateIpv4GatewayAttributeRequest request);

    /**
      * Before you call this operation, take note of the following limits:
      * *   **UpdateNatGatewayNatType** is an asynchronous operation. After you make a request, the ID of the request is returned but the NAT gateway is not upgraded. The system upgrades the NAT gateway in the background. You can call the GetNatGatewayConvertStatus operation to query the upgrade progress of a NAT gateway. For more information, see [GetNatGatewayConvertStatus](~~184744~~).
      *     *   If a NAT gateway is in the **processing** state, it indicates that the NAT gateway is being upgraded. You can only query the state of the NAT gateway but cannot perform other operations.
      *     *   If a NAT gateway is in the **successful** state, it indicates that the NAT gateway is upgraded.
      *     *   If a NAT gateway is in the **failed** state, it indicates that the system failed to upgrade the NAT gateway.
      * *   You cannot repeatedly call the **UpdateNatGatewayNatType** operation to upgrade a NAT gateway within the specified period of time.
      * *   The billing method and billable items remain the same after the upgrade.
      * *   It takes about 5 minutes to upgrade a standard NAT gateway to an enhanced NAT gateway. During the upgrade, transient connections may occur once or twice. You can determine whether to enable automatic reconnection or use manual reconnection based on your business requirements.
      * *   You can only upgrade standard NAT gateways to enhanced NAT gateways. You are not allowed to downgrade enhanced NAT gateways to standard NAT gateways.
      *
     */
    CompletableFuture<UpdateNatGatewayNatTypeResponse> updateNatGatewayNatType(UpdateNatGatewayNatTypeRequest request);

    /**
      * *   The **UpdateNetworkAclEntries** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeNetworkAclAttributes](~~116542~~) operation to query the status of a network ACL:
      *     *   If the network ACL is in the **Modifying** state, the rules of the network ACL are being updated.
      *     *   If the network ACL is in the **Available** state, the rules of the network ACL are updated.
      * *   You cannot repeatedly call the **UpdateNetworkAclEntries** operation to update the rules of a network ACL within the specified period of time.
      *
     */
    CompletableFuture<UpdateNetworkAclEntriesResponse> updateNetworkAclEntries(UpdateNetworkAclEntriesRequest request);

    /**
      * The ID of the IP address pool.
      *
     */
    CompletableFuture<UpdatePublicIpAddressPoolAttributeResponse> updatePublicIpAddressPoolAttribute(UpdatePublicIpAddressPoolAttributeRequest request);

    /**
      * The ID of the filter.
      *
     */
    CompletableFuture<UpdateTrafficMirrorFilterAttributeResponse> updateTrafficMirrorFilterAttribute(UpdateTrafficMirrorFilterAttributeRequest request);

    /**
      * The ID of the inbound or outbound rule.
      *
     */
    CompletableFuture<UpdateTrafficMirrorFilterRuleAttributeResponse> updateTrafficMirrorFilterRuleAttribute(UpdateTrafficMirrorFilterRuleAttributeRequest request);

    /**
      * The description of the traffic mirror session.
      * The description must be 1 to 256 characters in length and cannot start with `http://` or `https://`.
      *
     */
    CompletableFuture<UpdateTrafficMirrorSessionAttributeResponse> updateTrafficMirrorSessionAttribute(UpdateTrafficMirrorSessionAttributeRequest request);

    CompletableFuture<UpdateVirtualBorderBandwidthResponse> updateVirtualBorderBandwidth(UpdateVirtualBorderBandwidthRequest request);

    CompletableFuture<UpdateVirtualPhysicalConnectionResponse> updateVirtualPhysicalConnection(UpdateVirtualPhysicalConnectionRequest request);

    /**
      * The ID of the gateway endpoint that you want to modify.
      *
     */
    CompletableFuture<UpdateVpcGatewayEndpointAttributeResponse> updateVpcGatewayEndpointAttribute(UpdateVpcGatewayEndpointAttributeRequest request);

    /**
      * Before you call this operation, make sure that a VPC NAT gateway is created. For more information, see [CreateNatGateway](~~120219~~).
      *
     */
    CompletableFuture<VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse> vpcDescribeVpcNatGatewayNetworkInterfaceQuota(VpcDescribeVpcNatGatewayNetworkInterfaceQuotaRequest request);

}
