// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cbn20170912.models.*;
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
      * *   After you create a flow log, it is enabled by default. You can call this operation to enable a disabled flow log.
      * *   The `ActiveFlowLog` operation is an asynchronous operation. After you send a request, the system returns a**request ID** and runs the task in the background. You can call the `DescribeFlowlogs` operation to query the status of a flow log.
      *     *   If a flow log is in the **Modifying** state, the flow log is being enabled. In this case, you can query the flow log but cannot perform other operations.
      *     *   If a flow log is in the **Active** state, the flow log is enabled.
      *
     */
    CompletableFuture<ActiveFlowLogResponse> activeFlowLog(ActiveFlowLogRequest request);

    /**
      * **AddTrafficMatchRuleToTrafficMarkingPolicy** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTrafficMarkingPolicies** operation to query the status of a traffic classification rule.
      * *   If a traffic classification rule is in the **Creating** state, the traffic classification rule is being created. In this case, you can query the traffic classification rule but cannot perform other operations.
      * *   If a traffic classification rule is in the **Active** state, the traffic classification rule is added to the traffic marking policy.
      *
     */
    CompletableFuture<AddTrafficMatchRuleToTrafficMarkingPolicyResponse> addTrafficMatchRuleToTrafficMarkingPolicy(AddTrafficMatchRuleToTrafficMarkingPolicyRequest request);

    /**
      * @deprecated
      * # Usage notes
      * The **AddTraficMatchRuleToTrafficMarkingPolicy** operation is deprecated and will be discontinued soon. If you need to add a traffic classification rule to a traffic marking policy, call the [AddTrafficMatchRuleToTrafficMarkingPolicy](~~427602~~) operation.
      *
     */
    CompletableFuture<AddTraficMatchRuleToTrafficMarkingPolicyResponse> addTraficMatchRuleToTrafficMarkingPolicy(AddTraficMatchRuleToTrafficMarkingPolicyRequest request);

    /**
      * You can associate multiple bandwidth plans with a CEN instance. However, the pair of areas connected by each bandwidth plan must be unique.
      * For example, if a CEN instance is associated with a bandwidth plan that connects networks in the Chinese mainland, you cannot associate another bandwidth plan that also connects networks in the Chinese mainland with the CEN instance. However, you can associate a bandwidth plan that connects the Chinese mainland to North America with the CEN instance.
      *
     */
    CompletableFuture<AssociateCenBandwidthPackageResponse> associateCenBandwidthPackage(AssociateCenBandwidthPackageRequest request);

    /**
      * After you create a network instance connection on a transit router, you can configure an associated forwarding correlation to associate the network instance connection with a route table. Then, the network instance connection can forward network traffic based on the associated route table. Before you begin, we recommend that you read and understand the following rules:
      * *   Only Enterprise Edition transit routers support associated forwarding correlations. For more information about the regions and zones that support Enterprise Edition transit routers, see [Transit routers](~~181681~~).
      * *   **AssociateTransitRouterAttachmentWithRouteTable** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call **ListTransitRouterRouteTableAssociations** to query the status of an associated forwarding correlation.
      *     *   If an associated forwarding correlation is in the **Associating** state, the associated forwarding correlation is being created. You can query the associated forwarding correlation but cannot perform other operations.
      *     *   If an associated forwarding correlation is in the **Active** state, the associated forwarding correlation is created.
      *
     */
    CompletableFuture<AssociateTransitRouterAttachmentWithRouteTableResponse> associateTransitRouterAttachmentWithRouteTable(AssociateTransitRouterAttachmentWithRouteTableRequest request);

    /**
      * *   A vSwitch can be associated with only one multicast domain. Make sure that the vSwitch is not associated with other multicast domains. For more information about how to disassociate a vSwitch from a multicast domain, see [DisassociateTransitRouterMulticastDomain](~~429774~~).
      * *   **AssociateTransitRouterMulticastDomain** is an asynchronous operation. After you send a request, a **request ID** is returned but the operation is still being performed in the system background. You can call the **ListTransitRouterMulticastDomainAssociations** operation to query the association status between a vSwitch and a multicast domain.
      *     *   **Associating**: The vSwitch is being associated with the multicast domain. In this case, you can query the vSwitch but cannot perform other operations.
      *     *   **Associated**: The vSwitch is associated with the multicast domain.
      *
     */
    CompletableFuture<AssociateTransitRouterMulticastDomainResponse> associateTransitRouterMulticastDomain(AssociateTransitRouterMulticastDomainRequest request);

    /**
      * CEN allows you to attach a network instance that belongs to another Alibaba Cloud account to your CEN instance. Before you attach the network instance, CEN must acquire permissions to access the network instance that belongs to another Alibaba Cloud account.
      * *   For more information about how to grant CEN permissions on virtual private clouds (VPCs) that belong to another Alibaba Cloud account, see [GrantInstanceToCen](~~126224~~).
      * *   For more information about how to grant CEN permissions on Cloud Connect Network (CCN) instances that belong to another Alibaba Cloud account, see [GrantInstanceToCbn](~~126141~~).
      * *   By default, you cannot grant permissions on virtual border routers (VBRs) that belong to another Alibaba Cloud account to a CEN instance. If you need to use this feature, contact your account manager.
      *
     */
    CompletableFuture<AttachCenChildInstanceResponse> attachCenChildInstance(AttachCenChildInstanceRequest request);

    CompletableFuture<CheckTransitRouterServiceResponse> checkTransitRouterService(CheckTransitRouterServiceRequest request);

    /**
      * **CreateCen** is an asynchronous operation. After you send a request, the system returns the CEN instance ID but the operation is still being performed in the system background. You can call **DescribeCens** to query the status of a CEN instance.
      * * If a CEN instance is in the **Creating** state, the CEN instance is being created. You can query the CEN instance but cannot perform other operations.
      * * If a CEN instance is in the **Active** state, the CEN instance is created.
      *
     */
    CompletableFuture<CreateCenResponse> createCen(CreateCenRequest request);

    /**
      * ## Usage notes
      * *   You must specify the areas to be connected when you create a bandwidth plan. An area contains one or more Alibaba Cloud regions. When you select areas for a bandwidth plan, make sure that the areas contain the regions that you want to connect. For more information about the supported areas and regions, see [Purchase a bandwidth plan](~~181560~~).
      * *   For more information about the billing rules, see [Billing](~~189836~~).
      * *   **CreateCenBandwidthPackage** is an asynchronous operation. After you send a request, the system returns the bandwidth plan ID but the operation is still being performed in the system background. You can call **DescribeCenBandwidthPackages** to query the status of a bandwidth plan. If a bandwidth plan is in the **Idle** or **InUse** state, the bandwidth plan is created.
      *
     */
    CompletableFuture<CreateCenBandwidthPackageResponse> createCenBandwidthPackage(CreateCenBandwidthPackageRequest request);

    /**
      * *   You can add routes only to virtual private clouds (VPCs) or virtual border routers (VBRs) that are connected to an Enterprise Edition transit router.
      * *   By default, the next hop of the routes is the **transit router connection**, which is the connection between the VBR and the Enterprise Edition transit router. You cannot modify the next hop.
      * *   **CreateCenChildInstanceRouteEntryToAttachment** is an asynchronous operation. After you send a request, a **request ID** is returned but the operation is still being performed in the system background. You can call the **DescribeRouteEntryList** operation to query the status of a route.
      *     *   If a route is in the **Pending** state, the route is being created. In this case, you can query the route but cannot perform other operations.
      *     *   If a route is in the **Available** state, the route is created.
      *
     */
    CompletableFuture<CreateCenChildInstanceRouteEntryToAttachmentResponse> createCenChildInstanceRouteEntryToAttachment(CreateCenChildInstanceRouteEntryToAttachmentRequest request);

    /**
      * ## Limits
      * *   By default, the CreateCenChildInstanceRouteEntryToCen operation is unavailable. To call this operation,[submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      * *   You cannot add a route entry to an Enterprise Edition transit router by calling the CreateCenChildInstanceRouteEntryToCen operation.
      * *   By default, the next hop of the route entry is the regional gateway of the Cloud Enterprise Network (CEN) instance. You cannot modify the next hop.
      *
     */
    CompletableFuture<CreateCenChildInstanceRouteEntryToCenResponse> createCenChildInstanceRouteEntryToCen(CreateCenChildInstanceRouteEntryToCenRequest request);

    /**
      * *   Only inter-region connections created on Enterprise Edition transit routers support QoS policies.
      *         If your inter-region connection uses test bandwidth, you cannot create QoS policies for the inter-region connection. 
      * *   QoS policies apply only to outbound traffic on Enterprise Edition transit routers.
      *         If you create an inter-region connection between the China (Hangzhou) region and the China (Qingdao) region, and create QoS policies for the transit router in the China (Hangzhou) region and the transit router in the China (Qingdao) region, the QoS policies apply only to the network traffic that flows from China (Hangzhou) to China (Qingdao). QoS policies allocate bandwidth resources to different services. 
      * *   **CreateCenInterRegionTrafficQosPolicy** is an asynchronous operation. After you send a request, the system returns a QoS policy ID and runs the task in the system background. You can call **ListCenInterRegionTrafficQosPolicies** to query the status of a QoS policy.
      *     *   If a QoS policy is in the **Creating** state, the QoS policy is being created. You can query the QoS policy but cannot perform other operations.
      *     *   If a QoS policy is in the **Active** state, the QoS policy is created.
      * ### Prerequisites
      * Make sure that the following requirements are met before you call the **CreateCenInterRegionTrafficQosPolicy** operation:
      * *   An inter-region connection is created. For more information, see [CreateTransitRouterPeerAttachment](~~261363~~).
      * *   A traffic marking policy is created. For more information, see [CreateTrafficMarkingPolicy](~~419025~~).
      *
     */
    CompletableFuture<CreateCenInterRegionTrafficQosPolicyResponse> createCenInterRegionTrafficQosPolicy(CreateCenInterRegionTrafficQosPolicyRequest request);

    /**
      * The **CreateCenInterRegionTrafficQosQueue** operation is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the **ListCenInterRegionTrafficQosPolicies** operation to query the status of the QoS policy to determine the status of the queue. When you call this operation, you must set the **TrafficQosPolicyId** parameter.
      * *   If a QoS policy is in the **Modifying** state, the queue is being created. In this case, you can query the QoS policy and queue but cannot perform other operations.
      * *   If a QoS policy is in the **Active** state, the queue is created.
      *
     */
    CompletableFuture<CreateCenInterRegionTrafficQosQueueResponse> createCenInterRegionTrafficQosQueue(CreateCenInterRegionTrafficQosQueueRequest request);

    /**
      * Routing policies are sorted by priority. A smaller value indicates a higher priority. Each routing policy is a collection of conditional statements and execution statements. Starting from the routing policy with the highest priority, the system matches routes against the match conditions specified by routing policies. If a route meets all the match conditions of a routing policy, the system permits or denies the route based on the action specified in the routing policy. You can also modify the attributes of permitted routes. By default, the system permits routes that meet none of the match conditions. For more information, see [Routing policy overview](~~124157~~).
      * `CreateCenRouteMap` is an asynchronous operation. After you send a request, the routing policy ID is returned but the operation is still being performed in the system background. You can call `DescribeCenRouteMaps` to query the status of a routing policy.
      * *   If a routing policy is in the **Creating** state, the routing policy is being created. In this case, you can query the routing policy but cannot perform other operations.
      * *   If a routing policy is in the **Active** state, the routing policy is created.
      *
     */
    CompletableFuture<CreateCenRouteMapResponse> createCenRouteMap(CreateCenRouteMapRequest request);

    /**
      * Flow logs are used to capture the information about network traffic between transit routers and between virtual border routers (VBRs). Before you create a flow log, take note of the following items:
      * *   Flow logs are supported only by Enterprise Edition transit routers.
      * *   Only flow logs in some regions can capture the information about network traffic over VBR connections. For more information, see [Limits](~~339822~~).
      * *   Flow logs are used to capture the information about outbound traffic on transit routers. Information about inbound traffic on transit routers is not captured.
      *     For example, an Elastic Compute Service (ECS) instance in the US (Silicon Valley) region accesses an ECS instance in the US (Virginia) region through CEN. After you enable the flow log feature for the transit router in the US (Virginia) region, you can check the log entries about packets sent from the ECS instance in the US (Virginia) region to the ECS instance in the US (Silicon Valley) region. However, packets sent from the ECS instance in the US (Silicon Valley) region to the ECS instance in the US (Virginia) region are not recorded. If you want to record the packets sent from the ECS instance in the US (Silicon Valley) region to the ECS instance in the US (Virginia) region, you must also enable the flow log feature on the transit router that is in the US (Silicon Valley) region.
      * *   `CreateFlowLog` is an asynchronous operation. After you send a request, the system returns a flow log ID and runs the task in the background. You can call the `DescribeFlowLogs` operation to query the status of a flow log.
      *     *   If a flow log is in the **Creating** state, the flow log is being created. In this case, you can query the flow log but cannot perform other operations.
      *     *   If a flow log is in the **Active** state, the flow log is created.
      * # Prerequisites
      * An inter-region connection or a VBR connection is created. For more information, see [CreateTransitRouterPeerAttachment](~~261363~~) or [CreateTransitRouterVbrAttachment](~~261361~~).
      *
     */
    CompletableFuture<CreateFlowlogResponse> createFlowlog(CreateFlowlogRequest request);

    /**
      * *   Only Enterprise Edition transit routers support traffic marking policies.
      * *   **CreateTrafficMarkingPolicy** is an asynchronous operation. After you send a request, the system returns a traffic marking policy ID and runs the task in the background. You can call the **ListTrafficMarkingPolicies** operation to query the status of a traffic marking policy.
      *     *   If a traffic marking policy is in the **Creating** state, the traffic marking policy is being created. You can query the traffic marking policy but cannot perform other operations.
      *     *   If a traffic marking policy is in the **Active** state, the traffic marking policy is created.
      *
     */
    CompletableFuture<CreateTrafficMarkingPolicyResponse> createTrafficMarkingPolicy(CreateTrafficMarkingPolicyRequest request);

    /**
      * # Prerequisites
      * After you add an aggregate route to a route table of an Enterprise Edition transit router, the Enterprise Edition transit router advertises its routes only to route tables of virtual private clouds (VPCs) that are associated with a route table of the Enterprise Edition transit router and have route synchronization enabled.
      * Perform the following operations before you create an aggregate route. Otherwise, the Enterprise Edition transit router does not advertise routes to VPC route tables:
      * *   Associated forwarding is enabled between the VPCs and the Enterprise Edition transit router. For more information, see [AssociateTransitRouterAttachmentWithRouteTable](~~261242~~).
      * *   Route synchronization is enabled for the VPCs. For more information, see [CreateTransitRouterVpcAttachment](~~261358~~).
      *
     */
    CompletableFuture<CreateTransitRouteTableAggregationResponse> createTransitRouteTableAggregation(CreateTransitRouteTableAggregationRequest request);

    /**
      * *   You can call the **CreateTransitRouter** operation to create an Enterprise Edition transit router. For more information about the regions that support Enterprise Edition transit routers, see [What is CEN?](~~181681~~)
      * *   **CreateTransitRouter** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListTransitRouters](~~261219~~) operation to query the status of an Enterprise Edition transit router.
      *     *   If an Enterprise Edition transit router is in the **Creating** state, the Enterprise Edition transit router is being created. In this case, you can query the Enterprise Edition transit router but cannot perform other operations.
      *     *   If an Enterprise Edition transit router is in the **Active** state, the Enterprise Edition transit router is created.
      *
     */
    CompletableFuture<CreateTransitRouterResponse> createTransitRouter(CreateTransitRouterRequest request);

    /**
      * You can specify a CIDR block for a transit router. The CIDR block works in a similar way as the CIDR block of the loopback interface on a router. IP addresses within the CIDR block can be assigned to IPsec-VPN connections. For more information, see [Transit router CIDR blocks](~~462635~~).
      * The **CreateTransitRouterCidr** operation can be used to create a CIDR block only after you create a transit router.
      * The CIDR block must meet the following requirements:
      * *   Only Enterprise Edition transit routers support custom CIDR blocks.
      * *   This feature is in pubic preview and is available only in some regions. For more information about the supported regions, see [Limits on transit router CIDR blocks](~~462635~~).
      * *   Each transit router supports at most five CIDR blocks. The subnet mask of a CIDR block must be 16 bits to 24 bits in length.
      * *   The following CIDR blocks and their subnets are not supported: 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, and 169.254.0.0/16.
      * *   The CIDR block cannot overlap with CIDR blocks that network instances attached to the CEN instance use to communicate with each other.
      * *   On the same CEN instance, each transit router CIDR block must be unique.
      * *   When you create the first VPN connection after you add a CIDR block for a transit router, three CIDR blocks within the CIDR block are reserved. An IP address is allocated from the remaining CIDR blocks to the IPsec-VPN connection.
      *     You can call [ListTransitRouterCidrAllocation](~~464173~~) to query reserved CIDR blocks and IP addresses allocated to network connections.
      *
     */
    CompletableFuture<CreateTransitRouterCidrResponse> createTransitRouterCidr(CreateTransitRouterCidrRequest request);

    /**
      * Before you call this operation, read the following rules:
      * *   Only Enterprise Edition transit routers in the Australia (Sydney) and UK (London) regions support the multicast feature. Multicast is unavailable by default. If you want to enable multicast, contact your sales manager or [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) to apply for multicast resources.
      * *   Make sure that an Enterprise Edition transit router is deployed in the region where you want to create the multicast domain, and the multicast feature is enabled for the Enterprise Edition transit router. For more information, see [CreateTransitRouter](~~261169~~).
      *     If an Enterprise Edition transit router was created before you apply for multicast resources, the transit router does not support multicast. You can delete the transit router and create a new one. For more information about how to delete an Enterprise Edition transit router, see [DeleteTransitRouter](~~261218~~).
      * *   When you call **CreateTransitRouterMulticastDomain**, if you set **CenId** and **RegionId**, you do not need to set **TransitRouterId**. If you set **TransitRouterId**, you do not need to set **CenId** or **RegionId**.
      *
     */
    CompletableFuture<CreateTransitRouterMulticastDomainResponse> createTransitRouterMulticastDomain(CreateTransitRouterMulticastDomainRequest request);

    /**
      * ## Background information
      * By default, 1 Kbit/s of bandwidth is provided for inter-region communication between transit routers. This allows you to test the connectivity of inter-region IPv4 networks. To allow services that are deployed in different regions to communicate with each other, you must create an inter-region connection and allocate bandwidth resources to the connection.  
      * Enterprise Edition transit routers allow you to allocate bandwidth resources to inter-region connections by using the following methods: 
      * - **Allocate bandwidth resources from a bandwidth plan**:  You must purchase a bandwidth plan, and then allocate bandwidth resources from the bandwidth plan to inter-region connections. For more information, see [CreateCenBandwidthPackage](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/createcenbandwidthpackage).
      * - **Use pay-by-data-transfer bandwidth resources**:  You can set a maximum bandwidth value for an inter-region connection. Then, you are charged for the amount of data transfer over the connection. For more information, see [Cross-region data transfers](https://www.alibabacloud.com/help/en/cloud-data-transmission/latest/cross-region-data-transfers).
      * ## Usage notes
      * **CreateTransitRouterPeerAttachment** is an asynchronous operation. After you send a request, the system returns the inter-region connection ID but the operation is still being performed in the system background. You can call **ListTransitRouterPeerAttachments** to query the status of an inter-region connection.  
      * - If an inter-region connection is in the **Attaching** state, the inter-region connection is being created. You can query the inter-region connection but cannot perform other regions.
      * - If an inter-region connection is in the **Attached** state, the inter-region connection is created.
      *
     */
    CompletableFuture<CreateTransitRouterPeerAttachmentResponse> createTransitRouterPeerAttachment(CreateTransitRouterPeerAttachmentRequest request);

    /**
      * *   Only the route tables of Enterprise Edition transit routers can be associated with prefix lists.
      * *   A prefix list can be associated only with one route table of an Enterprise Edition.
      * *   The CIDR blocks in the prefix list cannot overlap with those in the route table of the Enterprise Edition transit router. Otherwise, the prefix list fails to be associated with the route table.
      * *   If the route table of an Enterprise Edition transit router needs to be associated with multiple prefix lists, make sure that the CIDR blocks in the prefix lists do not overlap. Otherwise, the route table fails to be associated with the prefix lists.
      * # Prerequisites
      * *   A prefix list is created. For more information, see [CreateVpcPrefixList](~~437367~~).
      * *   The prefix list is shared with the Alibaba Cloud account that owns the Enterprise Edition transit router if the prefix list and the Enterprise Edition transit router belong to different Alibaba Cloud accounts. For more information about how to share a prefix list with another Alibaba Cloud account, see [Resource sharing overview](~~160622~~) and [API reference for resource sharing](~~193445~~).
      *
     */
    CompletableFuture<CreateTransitRouterPrefixListAssociationResponse> createTransitRouterPrefixListAssociation(CreateTransitRouterPrefixListAssociationRequest request);

    /**
      * **CreateTransitRouterRouteEntry** is an asynchronous operation. After you send a request, the system returns a route ID and runs the task in the background. You can call the **ListTransitRouterRouteEntries** operation to query the status of a route.
      * *   If a route is in the **Creating** state, the route is being created. In this case, you can query the route but cannot perform other operations.
      * *   If a route is in the **Active** state, the route is created.
      *
     */
    CompletableFuture<CreateTransitRouterRouteEntryResponse> createTransitRouterRouteEntry(CreateTransitRouterRouteEntryRequest request);

    /**
      * *   Only Enterprise Edition transit routers support custom route tables. For more information about the regions and zones that support Enterprise Edition transit routers, see [What is CEN?](~~181681~~)
      * *   **CreateTransitRouterRouteTable** is an asynchronous operation. After you send a request, the system returns a route table ID and runs the task in the background. You can call the **ListTransitRouterRouteTables** operation to query the status of a route table.
      *     *   If a route table is in the **Creating** state, the route table is being created. In this case, you can query the route table but cannot perform other operations.
      *     *   If a route table is in the **Active** state, the route table is created.
      *
     */
    CompletableFuture<CreateTransitRouterRouteTableResponse> createTransitRouterRouteTable(CreateTransitRouterRouteTableRequest request);

    /**
      * *   For more information about the regions and zones that support Enterprise Edition transit routers, see [What is CEN?](~~181681~~)
      * *   You can use the following methods to connect a VBR to an Enterprise Edition transit router:
      *     *   If an Enterprise Edition transit router is already created in the region where you want to create a VBR connection, set the **VbrId** and **TransitRouterId** parameters.
      *     *   If no Enterprise Edition transit router is created in the region where you want to create a VBR connection, set the **VbrId**, **CenId**, and **RegionId** parameters. Then, the system automatically creates an Enterprise Edition transit router in the specified region.
      * *   **CreateTransitRouterVbrAttachment** is an asynchronous operation. After you send a request, the system returns a VBR connection ID and runs the task in the background. You can call the **ListTransitRouterVbrAttachments** operation to query the status of a VBR connection.
      *     *   If a VBR connection is in the **Attaching** state, the VBR connection is being created. You can query the VBR connection but cannot perform other operations.
      *     *   If a VBR connection is in the **Attached** state, the VBR connection is created.
      *
     */
    CompletableFuture<CreateTransitRouterVbrAttachmentResponse> createTransitRouterVbrAttachment(CreateTransitRouterVbrAttachmentRequest request);

    /**
      * *   You can use the following methods to connect a VPC to an Enterprise Edition transit router:
      *     *   If an Enterprise Edition transit router is already created in the region where you want to create a VPC connection, set **VpcId**, **ZoneMappings.N.VSwitchId**, **ZoneMappings.N.ZoneId**, and **TransitRouterId**.
      *     *   If no Enterprise Edition transit router is created in the region where you want to create a VPC connection, set **VpcId**, **ZoneMappings.N.VSwitchId**, **ZoneMappings.N.ZoneId**, **CenId**, and **RegionId**. When you create a VPC connection, the system automatically creates an Enterprise Edition transit router in the specified region.
      * *   **CreateTransitRouterVpcAttachment** is an asynchronous operation. After you send a request, the system returns a VPC connection ID and runs the task in the background. You can call the [ListTransitRouterVpcAttachments](~~261222~~) operation to query the status of a VPC connection.
      *     *   If a VPC connection is in the **Attaching** state, the VPC connection is being created. You can query the VPC connection but cannot perform other operations.
      *     *   If a VPC connection is in the **Attached** state, the VPC connection is created.
      * *   By default, route learning and associated forwarding are disabled between transit router route tables and VPC connections.
      * ## Prerequisites
      * Before you call this operation, make sure that the following requirements are met:
      * *   At least one vSwitch is deployed for the VPC in the zones supported by Enterprise Edition transit routers. Each vSwitch must have at least one idle IP address. For more information, see [Regions and zones supported by Enterprise Edition transit routers](~~181681~~).
      * *   To connect to a network instance that belongs to another Alibaba Cloud account, you must first acquire the required permissions from the account. For more information, see [Acquire permissions to connect to a network instance that belongs to another account](~~181553~~).
      * *   VPC connections incur fees. Take note of the billing rules of VPC connections before you create a VPC connection. For more information, see [Billing](~~189836~~).
      *
     */
    CompletableFuture<CreateTransitRouterVpcAttachmentResponse> createTransitRouterVpcAttachment(CreateTransitRouterVpcAttachmentRequest request);

    /**
      * *   By default, route learning and associated forwarding are disabled between transit router route tables and IPsec-VPN attachments.
      * *   When you call `CreateTransitRouterVpnAttachment`, if you set **CenId** and **RegionId**, you do not need to set **TransitRouterId**. If you set **TransitRouterId** and **RegionId**, you do not need to set **CenId**.
      * ## Prerequisites
      * *   Before you attach an IPsec-VPN connection to a transit router, make sure that at least one IPsec-VPN connection is created in the region where the transit router is deployed. Make sure the IPsec-VPN connection is not associated with a resource. For more information, see [CreateVpnAttachment](~~442455~~).
      * *   If the IPsec-VPN connection to be attached to the transit router belongs to a different Alibaba Cloud account, make sure that the transit router has obtained the required permissions from the IPsec-VPN connection. For more information, see [GrantInstanceToTransitRouter](~~417520~~).
      *
     */
    CompletableFuture<CreateTransitRouterVpnAttachmentResponse> createTransitRouterVpnAttachment(CreateTransitRouterVpnAttachmentRequest request);

    /**
      * `DeactiveFlowLog` is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the `DescribeFlowlogs` operation to query the status of a flow log.
      * *   If a flow log is in the **Modifying** state, the flow log is being disabled. You can query the flow log but cannot perform other operations.
      * *   If a flow log is in the **Inactive** state, the flow log is disabled.
      *
     */
    CompletableFuture<DeactiveFlowLogResponse> deactiveFlowLog(DeactiveFlowLogRequest request);

    /**
      * **DeleteCen** is an asynchronous operation. After you send a request, the **request ID** is returned but the operation is still being performed in the system background. You can call **DescribeCens** to query the status of a CEN instance.   
      * - If a CEN instance is in the **Deleting** state, the CEN instance is being deleted. In this case, you can query the CEN instance but cannot perform other operations.
      * - If a CEN instance cannot be found, the CEN instance is deleted.
      * ## Prerequisites
      * The CEN instance that you want to delete is not associated with a bandwidth plan, and the transit router associated with the CEN instance does not have a network instance connection or a custom route table. 
      * - For more information about how to detach a network instance, see the following topics:   - [DeleteTransitRouterVpcAttachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/deletetransitroutervpcattachment)
      *   - [DeleteTransitRouterVbrAttachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/deletetransitroutervbrattachment)
      *   - [DeleteTransitRouterVpnAttachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/deletetransitroutervpnattachment)
      *   - [DeleteTransitRouterPeerAttachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/deletetransitrouterpeerattachment)>  For more information about how to detach network instances from a Basic Edition transit router, see [DetachCenChildInstance](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/detachcenchildinstance).
      * - For more information about how to delete a custom route table, see [DeleteTransitRouterRouteTable](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/deletetransitrouterroutetable).
      * - For more information about how to disassociate a bandwidth plan from a CEN instance, see [UnassociateCenBandwidthPackage](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/unassociatecenbandwidthpackage).
      *
     */
    CompletableFuture<DeleteCenResponse> deleteCen(DeleteCenRequest request);

    /**
      * Before you delete a bandwidth plan, make sure that it is disassociated from all Cloud Enterprise Network (CEN) instances. For more information, see [UnassociateCenBandwidthPackage](~~65935~~).
      *
     */
    CompletableFuture<DeleteCenBandwidthPackageResponse> deleteCenBandwidthPackage(DeleteCenBandwidthPackageRequest request);

    /**
      * ## Usage notes
      * *   You can delete routes only from virtual private clouds (VPCs) and virtual border routers (VBRs) whose next hop is an **Enterprise Edition transit router connection**, which is the connection to the network instance.
      * *   **DeleteCenChildInstanceRouteEntryToAttachment** is an asynchronous operation. After you send a request, the **request ID** is returned but the operation is still being performed in the system background. You can call **DescribeRouteEntryList** to query the status of a route.
      *     *   If a route is in the **Deleting** state, the route is being deleted. You can query the route but cannot perform other operations.
      *     *   If a route cannot be found, the route is deleted.
      *
     */
    CompletableFuture<DeleteCenChildInstanceRouteEntryToAttachmentResponse> deleteCenChildInstanceRouteEntryToAttachment(DeleteCenChildInstanceRouteEntryToAttachmentRequest request);

    /**
      * ## Limits
      * *   By default, the DeleteCenChildInstanceRouteEntryToCen operation is unavailable. To call this operation,[submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      * *   You cannot delete a route entry from an Enterprise Edition transit router by calling the DeleteCenChildInstanceRouteEntryToCen operation.
      *
     */
    CompletableFuture<DeleteCenChildInstanceRouteEntryToCenResponse> deleteCenChildInstanceRouteEntryToCen(DeleteCenChildInstanceRouteEntryToCenRequest request);

    /**
      * *   Before you delete a QoS policy, you must delete all queues in the QoS policy except the default queue. For more information, see [DeleteCenInterRegionTrafficQosQueue](~~419062~~).
      * *   **DeleteCenInterRegionTrafficQosPolicy** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListCenInterRegionTrafficQosPolicies** operation to query the status of a QoS policy.
      *     *   If a QoS policy is in the **Deleting** state, the QoS policy is being deleted. You can query the QoS policy but cannot perform other operations.
      *     *   If a QoS policy cannot be found, the QoS policy is deleted.
      *
     */
    CompletableFuture<DeleteCenInterRegionTrafficQosPolicyResponse> deleteCenInterRegionTrafficQosPolicy(DeleteCenInterRegionTrafficQosPolicyRequest request);

    /**
      * *   You cannot delete the default queue.
      * *   **DeleteCenInterRegionTrafficQosQueue** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListCenInterRegionTrafficQosPolicies** operation to query the status of a queue. If a queue cannot be found, the queue is deleted.
      *
     */
    CompletableFuture<DeleteCenInterRegionTrafficQosQueueResponse> deleteCenInterRegionTrafficQosQueue(DeleteCenInterRegionTrafficQosQueueRequest request);

    /**
      * `DeleteCenRouteMap` is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the `DescribeCenRouteMaps` operation to query the status of a routing policy.
      * *   If a routing policy is in the **Deleting** state, the routing policy is being deleted. You can query the routing policy but cannot perform other operations.
      * *   If a routing policy cannot be found, it is deleted.``
      *
     */
    CompletableFuture<DeleteCenRouteMapResponse> deleteCenRouteMap(DeleteCenRouteMapRequest request);

    /**
      * The `DeleteFlowlog` operation is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the `DescribeFlowlogs` operation to query the status of a flow log.
      * *   If a flow log is in the **Deleting** state, the flow log is being deleted. In this case, you can query the flow log but cannot perform other operations.
      * *   If a flow log cannot be found, the flow log is deleted.``
      *
     */
    CompletableFuture<DeleteFlowlogResponse> deleteFlowlog(DeleteFlowlogRequest request);

    /**
      * ## Usage notes
      * **DeleteRouteServiceInCen** is an asynchronous operation. After you send a request, the system returns the **request ID** but the operation is still being performed in the system background. You can call **DescribeRouteServicesInCen** to query the status of the connection to a cloud service.
      * *   If a cloud service is in the **Deleting** state, the connection to the cloud service is being deleted. You can query the connection but you cannot perform other operations.
      * *   If no connection to a cloud service can be found, the connection to the cloud service is deleted.
      *
     */
    CompletableFuture<DeleteRouteServiceInCenResponse> deleteRouteServiceInCen(DeleteRouteServiceInCenRequest request);

    /**
      * *   The **DeleteTrafficMarkingPolicy** operation is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call **ListTrafficMarkingPolicies** to query the status of a traffic marking policy.
      *     *   If a traffic marking policy is in the **Deleting** state, the traffic marking policy is being deleted. You can query the traffic marking policy, but cannot perform other operations.
      *     *   If a traffic marking policy cannot be found, the traffic marking policy is deleted.
      * *   Before you delete a traffic marking policy, you must delete all traffic classification rules from the policy. For more information, see [RemoveTraficMatchRuleFromTrafficMarkingPolicy](~~419012~~).
      *
     */
    CompletableFuture<DeleteTrafficMarkingPolicyResponse> deleteTrafficMarkingPolicy(DeleteTrafficMarkingPolicyRequest request);

    /**
      * *   Before you delete an aggregate route, make sure that your network has a redundant route to prevent service interruptions.
      * *   After an aggregate route is deleted, the aggregate route is automatically withdrawn from virtual private clouds (VPCs). Specific routes that fall within the aggregate route are advertised to the VPCs.
      *
     */
    CompletableFuture<DeleteTransitRouteTableAggregationResponse> deleteTransitRouteTableAggregation(DeleteTransitRouteTableAggregationRequest request);

    /**
      * **DeleteTransitRouter** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouters** operation to query the status of a transit router.
      * *   If a transit router is in the **Deleting** state, the transit router is being deleted. In this case, you can query the transit router but cannot perform other operations.
      * *   If a transit router cannot be found, the transit router is deleted.
      * ## Prerequisites
      * Before you delete a transit router, make sure that the following prerequisites are met:
      * *   No network instance connections are created on the transit router.
      *     *   For more information about how to delete a virtual private cloud (VPC) connection, see [DeleteTransitRouterVpcAttachment](~~261220~~).
      *     *   For more information about how to delete a virtual border router (VBR) connection, see [DeleteTransitRouterVbrAttachment](~~261223~~).
      *     *   For more information about how to delete a Cloud Connect Network (CCN) connection, see [DetachCenChildInstance](~~65915~~).
      *     *   For more information about how to delete a VPN connection, see [DeleteTransitRouterVpnAttachment](~~443992~~).
      *     *   For more information about how to delete an inter-region connection, see [DeleteTransitRouterPeerAttachment](~~261227~~).
      * *   No custom route tables are created on the transit router. For more information about how to delete a custom route table, see [DeleteTransitRouterRouteTable](~~261235~~).
      *
     */
    CompletableFuture<DeleteTransitRouterResponse> deleteTransitRouter(DeleteTransitRouterRequest request);

    /**
      * ## Usage notes
      * If IP addresses within the CIDR block have been allocated to network instances, the CIDR block cannot be deleted.
      *
     */
    CompletableFuture<DeleteTransitRouterCidrResponse> deleteTransitRouterCidr(DeleteTransitRouterCidrRequest request);

    /**
      * Before you delete a multicast domain, make sure that the following requirements are met:
      * *   The multicast domain is disassociated from all vSwitches. For more information, see [DisassociateTransitRouterMulticastDomain](~~429774~~).
      * *   All multicast sources and members are removed from the multicast domain. For more information, see [DeregisterTransitRouterMulticastGroupSources](~~429776~~) and [DeregisterTransitRouterMulticastGroupMembers](~~429779~~).
      * *   The multicast domain is not added to other multicast domains as a multicast member. If the multicast domain is added to another multicast domain as a multicast member, you must remove the multicast domain from the other multicast domain. For more information, see [DeregisterTransitRouterMulticastGroupMembers](~~429779~~).
      *
     */
    CompletableFuture<DeleteTransitRouterMulticastDomainResponse> deleteTransitRouterMulticastDomain(DeleteTransitRouterMulticastDomainRequest request);

    /**
      * **DeleteTransitRouterPeerAttachment** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the system background. You can call the **ListTransitRouterPeerAttachments** operation to query the status of an inter-region connection.
      * *   If an inter-region connection is in the **Detaching** state, the inter-region connection is being deleted. You can query the inter-region connection but cannot perform other operations.
      * *   If an inter-region connection cannot be found, the inter-region connection is deleted.
      * ## Prerequisites
      * Before you begin, make sure that the Enterprise Edition transit router that you use to create inter-region connections meets the following prerequisites:
      * *   No associated forwarding correlation is established between the inter-region connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see [DissociateTransitRouterAttachmentFromRouteTable](~~260944~~).
      * *   No route learning correlation is established between the inter-region connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see [DisableTransitRouterRouteTablePropagation](~~260945~~).
      * *   The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom routes from route tables of Enterprise Edition transit routers, see [DeleteTransitRouterRouteEntry](~~261240~~).
      * *   The route table does not contain a route whose next hop is the inter-region connection and that is generated from a prefix list. You can delete routes from a route table by disassociating the route table from the prefix list. For more information, see [DeleteTransitRouterPrefixListAssociation](~~445486~~).
      * *   No quality of service (QoS) policy is configured for the inter-region connection. For more information about how to delete QoS policies, see [DeleteCenInterRegionTrafficQosPolicy](~~427547~~).
      *
     */
    CompletableFuture<DeleteTransitRouterPeerAttachmentResponse> deleteTransitRouterPeerAttachment(DeleteTransitRouterPeerAttachmentRequest request);

    /**
      * ## Usage notes
      * After you disassociate a route table of an Enterprise Edition transit router from a prefix list, the routes that point to the CIDR blocks in the prefix list are automatically withdrawn from the route table. Before you disassociate the route table of an Enterprise Edition transit router from a prefix list, you must migrate workloads that use the routes in case services are interrupted.
      *
     */
    CompletableFuture<DeleteTransitRouterPrefixListAssociationResponse> deleteTransitRouterPrefixListAssociation(DeleteTransitRouterPrefixListAssociationRequest request);

    /**
      * Before you call this operation, take note of the following items:
      * *   If **TransitRouterRouteEntryId** is set, you must not set **TransitRouterRouteTableId** or **TransitRouterRouteEntryDestinationCidrBlock**. Otherwise, parameter conflicts will occur.
      * *   If **TransitRouterRouteEntryId** is not set, you must specify the set parameters based on the type of the next hop:
      *     *   To delete a blackhole route, you must set **TransitRouterRouteTableId**, **TransitRouterRouteEntryDestinationCidrBlock**, and **TransitRouterRouteEntryNextHopType**.
      *     *   If the route that you want to delete is not a blackhole route, you must set **TransitRouterRouteTableId**, **TransitRouterRouteEntryDestinationCidrBlock**, **TransitRouterRouteEntryNextHopType**, and **TransitRouterRouteEntryNextHopId**.
      * *   **DeleteTransitRouterRouteEntry** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the system background. You can call the **ListTransitRouterRouteEntries** operation to query the status of a route entry.
      *     *   If a route entry is in the **Deleting** state, the route entry is being deleted. You can query the route entry but cannot perform other operations.
      *     *   If a route entry cannot be found, it is deleted.
      * ## Limits
      * You can call this operation to delete only static routes. Automatically learned routes are not supported. You can call the [ListTransitRouterRouteEntries](~~260941~~) operation to query route types.
      *
     */
    CompletableFuture<DeleteTransitRouterRouteEntryResponse> deleteTransitRouterRouteEntry(DeleteTransitRouterRouteEntryRequest request);

    /**
      * *   You cannot delete the default route table of an Enterprise Edition transit router.
      * *   The **DeleteTransitRouterRouteTable** operation is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call **ListTransitRouterRouteTables** to query the status of a custom route table.
      *     *   If a custom route table is in the Deleting state, the custom route table is being deleted. In this case, you can query the custom route table but cannot perform other operations.
      *     *   If a custom route table cannot be found, the custom route table is deleted.
      *
     */
    CompletableFuture<DeleteTransitRouterRouteTableResponse> deleteTransitRouterRouteTable(DeleteTransitRouterRouteTableRequest request);

    /**
      * **DeleteTransitRouterVbrAttachment** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterVbrAttachments** operation to query the status of a VBR connection.
      * *   If a VBR connection is in the **Detaching** state, the VBR connection is being deleted. You can query the VBR connection but cannot perform other operations.
      * *   If a VBR connection cannot be found, the VBR connection is deleted.
      * ## Prerequisites
      * Before you delete a VBR connection for an Enterprise Edition transit router, make sure that the following requirements are met:
      * *   No associated forwarding correlation is established between the VBR connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see [DissociateTransitRouterAttachmentFromRouteTable](~~260944~~).
      * *   No route learning correlation is established between the VBR connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see [DisableTransitRouterRouteTablePropagation](~~260945~~).
      * *   The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom route entries, see [DeleteTransitRouterRouteEntry](~~261240~~).
      * *   The route tables of the Enterprise Edition transit router do not contain a route whose next hop is the VBR connection and that is generated from a prefix list. You can delete such routes by disassociating the route table from the prefix list. For more information, see [DeleteTransitRouterPrefixListAssociation](~~445486~~).
      *
     */
    CompletableFuture<DeleteTransitRouterVbrAttachmentResponse> deleteTransitRouterVbrAttachment(DeleteTransitRouterVbrAttachmentRequest request);

    /**
      * **DeleteTransitRouterVpcAttachment** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterVpcAttachments** operation to query the status of a VPC connection.
      * *   If a VPC is in the **Detaching** state, the VPC connection is being deleted. You can query the VPC connection but cannot perform other operations.
      * *   If a VPC connection cannot be found, it is deleted.
      * ## Prerequisites
      * Before you delete a VPC connection, make sure that the following requirements are met:
      * *   No associated forwarding correlation is established between the VPC connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see [DissociateTransitRouterAttachmentFromRouteTable](~~260944~~).
      * *   No route learning correlation is established between the VPC connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see [DisableTransitRouterRouteTablePropagation](~~260945~~).
      * *   The route table of the VPC does not contain routes that point to the VPC connection. For more information about how to delete routes from a VPC route table, see [DeleteRouteEntry](~~36013~~).
      * *   The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom routes from the route tables of an Enterprise Edition transit router, see [DeleteTransitRouterRouteEntry](~~261240~~).
      * *   The route tables of the Enterprise Edition transit router do not contain a route that is generated from a prefix list and the next hop is the VPC connection. You can delete such routes by disassociating the route table from the prefix list. For more information, see [DeleteTransitRouterPrefixListAssociation](~~445486~~).
      *
     */
    CompletableFuture<DeleteTransitRouterVpcAttachmentResponse> deleteTransitRouterVpcAttachment(DeleteTransitRouterVpcAttachmentRequest request);

    /**
      * ## Usage note
      * Before you delete a VPN connection, make sure that the following requirements are met:
      * *   No associated forwarding correlation is established between the VPN connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see [DissociateTransitRouterAttachmentFromRouteTable](~~260944~~).
      * *   No route learning correlation is established between the VPN connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see [DisableTransitRouterRouteTablePropagation](~~260945~~).
      * *   No route in the route table of the Enterprise Edition transit router points to the VPN connection. For more information, see [DeleteTransitRouterRouteEntry](~~261240~~).
      *
     */
    CompletableFuture<DeleteTransitRouterVpnAttachmentResponse> deleteTransitRouterVpnAttachment(DeleteTransitRouterVpnAttachmentRequest request);

    /**
      * `RegisterTransitRouterMulticastGroupMembers` is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the `ListTransitRouterMulticastGroups` operation to query the status of a multicast member.
      * *   If a multicast member is in the **Deregistering** state, the multicast member is being removed. In this case, you can query the multicast member but cannot perform other operations.
      * *   If a multicast member cannot be found, the multicast member is removed from the multicast group.``
      *
     */
    CompletableFuture<DeregisterTransitRouterMulticastGroupMembersResponse> deregisterTransitRouterMulticastGroupMembers(DeregisterTransitRouterMulticastGroupMembersRequest request);

    /**
      * ## Usage notes
      * `DeregisterTransitRouterMulticastGroupSources` is an asynchronous operation. After you send a request, the **request ID** is returned but the operation is still being performed in the system background. You can call `ListTransitRouterMulticastGroups` to query the status of a multicast source.
      * *   If a multicast source is in the **Deregistering** state, the multicast source is being deleted. You can query the multicast source but cannot perform other operations.
      * *   If a multicast source cannot be found, the multicast source is deleted.
      *
     */
    CompletableFuture<DeregisterTransitRouterMulticastGroupSourcesResponse> deregisterTransitRouterMulticastGroupSources(DeregisterTransitRouterMulticastGroupSourcesRequest request);

    CompletableFuture<DescribeCenAttachedChildInstanceAttributeResponse> describeCenAttachedChildInstanceAttribute(DescribeCenAttachedChildInstanceAttributeRequest request);

    /**
      * You can use one of the following methods to query the information about the network instances that are attached to a CEN instance:
      * *   You can query all the network instances that are attached to a CEN instance by setting the `CenId` parameter.
      * *   You can query the network instances that are attached to a CEN instance in a specified region by setting the `CenId` and `ChildInstanceRegionId` parameters.
      * *   You can query a specified type of network instances that are attached to a CEN instance by setting the `CenId` and `ChildInstanceType` parameters.
      *
     */
    CompletableFuture<DescribeCenAttachedChildInstancesResponse> describeCenAttachedChildInstances(DescribeCenAttachedChildInstancesRequest request);

    CompletableFuture<DescribeCenBandwidthPackagesResponse> describeCenBandwidthPackages(DescribeCenBandwidthPackagesRequest request);

    CompletableFuture<DescribeCenChildInstanceRouteEntriesResponse> describeCenChildInstanceRouteEntries(DescribeCenChildInstanceRouteEntriesRequest request);

    CompletableFuture<DescribeCenGeographicSpanRemainingBandwidthResponse> describeCenGeographicSpanRemainingBandwidth(DescribeCenGeographicSpanRemainingBandwidthRequest request);

    CompletableFuture<DescribeCenGeographicSpansResponse> describeCenGeographicSpans(DescribeCenGeographicSpansRequest request);

    CompletableFuture<DescribeCenInterRegionBandwidthLimitsResponse> describeCenInterRegionBandwidthLimits(DescribeCenInterRegionBandwidthLimitsRequest request);

    CompletableFuture<DescribeCenPrivateZoneRoutesResponse> describeCenPrivateZoneRoutes(DescribeCenPrivateZoneRoutesRequest request);

    CompletableFuture<DescribeCenRegionDomainRouteEntriesResponse> describeCenRegionDomainRouteEntries(DescribeCenRegionDomainRouteEntriesRequest request);

    CompletableFuture<DescribeCenRouteMapsResponse> describeCenRouteMaps(DescribeCenRouteMapsRequest request);

    CompletableFuture<DescribeCenVbrHealthCheckResponse> describeCenVbrHealthCheck(DescribeCenVbrHealthCheckRequest request);

    CompletableFuture<DescribeCensResponse> describeCens(DescribeCensRequest request);

    /**
      * The regions that support CEN vary based on the network instance type. To query the regions where you can attach a specified type of network instance to CEN, set the `ProductType` parameter. If you do not set the `ProductType` parameter, the system queries all regions in which you can attach network instances to CEN, regardless of the network instance type.
      *
     */
    CompletableFuture<DescribeChildInstanceRegionsResponse> describeChildInstanceRegions(DescribeChildInstanceRegionsRequest request);

    CompletableFuture<DescribeFlowlogsResponse> describeFlowlogs(DescribeFlowlogsRequest request);

    CompletableFuture<DescribeGeographicRegionMembershipResponse> describeGeographicRegionMembership(DescribeGeographicRegionMembershipRequest request);

    CompletableFuture<DescribeGrantRulesToCenResponse> describeGrantRulesToCen(DescribeGrantRulesToCenRequest request);

    CompletableFuture<DescribeGrantRulesToResourceResponse> describeGrantRulesToResource(DescribeGrantRulesToResourceRequest request);

    CompletableFuture<DescribePublishedRouteEntriesResponse> describePublishedRouteEntries(DescribePublishedRouteEntriesRequest request);

    CompletableFuture<DescribeRouteConflictResponse> describeRouteConflict(DescribeRouteConflictRequest request);

    CompletableFuture<DescribeRouteServicesInCenResponse> describeRouteServicesInCen(DescribeRouteServicesInCenRequest request);

    CompletableFuture<DescribeTransitRouteTableAggregationResponse> describeTransitRouteTableAggregation(DescribeTransitRouteTableAggregationRequest request);

    CompletableFuture<DescribeTransitRouteTableAggregationDetailResponse> describeTransitRouteTableAggregationDetail(DescribeTransitRouteTableAggregationDetailRequest request);

    CompletableFuture<DetachCenChildInstanceResponse> detachCenChildInstance(DetachCenChildInstanceRequest request);

    /**
      * **DisableCenVbrHealthCheck** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **DescribeCenVbrHealthCheck** operation to query the status of health check configurations. If the health check configurations cannot be found, the health check configurations are deleted.
      *
     */
    CompletableFuture<DisableCenVbrHealthCheckResponse> disableCenVbrHealthCheck(DisableCenVbrHealthCheckRequest request);

    /**
      * # Usage notes
      * **DisableTransitRouterRouteTablePropagation** is an synchronous operation. After you send a request, a **request ID** is returned but the operation is still being performed in the system background. You can call the **ListTransitRouterRouteTablePropagations** operation to query the status of a route learning correlation.
      * *   If a route learning correlation is in the **Disabling** state, the route learning correlation is being deleted. You can query the route learning correlation but cannot perform other operations.
      * *   If a route learning correlation cannot be found, the route learning correlation is deleted.
      *
     */
    CompletableFuture<DisableTransitRouterRouteTablePropagationResponse> disableTransitRouterRouteTablePropagation(DisableTransitRouterRouteTablePropagationRequest request);

    /**
      * *   After a vSwitch is disassociated from a multicast domain, the multicast sources and members on the vSwitch are also removed from the multicast domain.
      * *   **DisassociateTransitRouterMulticastDomain** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the system background. You can call the **ListTransitRouterMulticastDomainAssociations** operation to query the association status between a vSwitch and a multicast domain.
      *     *   The **Dissociating** state indicates that the vSwitch is being disassociated from the multicast domain. You can query the vSwitch but you cannot perform other operations.
      *     *   If the vSwitch cannot be found, the vSwitch is disassociated from the multicast domain.
      *
     */
    CompletableFuture<DisassociateTransitRouterMulticastDomainResponse> disassociateTransitRouterMulticastDomain(DisassociateTransitRouterMulticastDomainRequest request);

    /**
      * # Usage notes
      * **DissociateTransitRouterAttachmentFromRouteTable** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the system background. You can call the **ListTransitRouterRouteTableAssociations** operation to query an associated forwarding correlation between a network instance connection and a route table.
      * *   If an associated forwarding correlation is in the **Dissociating** state, the associated forwarding correlation is being deleted. In this case, you can query the associated forwarding correlation but cannot perform other operations.
      * *   If an associated forwarding correlation cannot be found, the associated forwarding correlation is deleted.
      *
     */
    CompletableFuture<DissociateTransitRouterAttachmentFromRouteTableResponse> dissociateTransitRouterAttachmentFromRouteTable(DissociateTransitRouterAttachmentFromRouteTableRequest request);

    /**
      * You can enable the health check feature for a VBR to monitor the Express Connect circuit between your data center and Alibaba Cloud. This helps you detect connection issues in a timely manner.
      * Before you use the health check feature, take note of the following information:
      * *   If your VBR uses static routing, you must add a static route for the data center that is connected to the VBR after you configure the health check feature. Set the destination CIDR block to the source IP address of health checks, set the mask length to 32, and set the next hop to the IP address of the VBR on the Alibaba Cloud side.
      * *   If your VBR uses dynamic Border Gateway Protocol (BGP) routing, you do not need to add routes for the data center.
      * *   **EnableCenVbrHealthCheck** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **DescribeCenVbrHealthCheck** operation to query the status of health check configurations. If health check configurations are returned, health check is configured or modified.
      *
     */
    CompletableFuture<EnableCenVbrHealthCheckResponse> enableCenVbrHealthCheck(EnableCenVbrHealthCheckRequest request);

    /**
      * After you establish a network instance connection on a transit router, you can create a route learning correlation for the network instance connection. Then, the routes of the connected network instance are automatically advertised to the route table of the transit router. Before you begin, we recommend that you read and understand the following rules:
      * *   You can create route learning correlations only on Enterprise Edition transit routers. For more information about the regions and zones that support Enterprise Edition transit routers, see [What is CEN?](~~181681~~)
      * *   **EnableTransitRouterRouteTablePropagation** is an asynchronous operation. After you send a request, the system returns a **request ID** but the operation is still being performed in the system background. You can call **ListTransitRouterRouteTablePropagations** to query the route learning status between a network instance connection and a route table.
      *     *   **Enabling** indicates that a route learning correlation is being created between the network instance connection and route table. You can query the route learning correlation but cannot perform other operations.
      *     *   **Active** indicates that the route learning correlation is created between the network instance connection and route table.
      *
     */
    CompletableFuture<EnableTransitRouterRouteTablePropagationResponse> enableTransitRouterRouteTablePropagation(EnableTransitRouterRouteTablePropagationRequest request);

    /**
      * ## Description
      * *   `GrantInstanceToTransitRouter` grants transit routes permissions to connect only to virtual private clouds (VPCs), virtual border routers (VBRs), and IPsec-VPN connections that belong to another Alibaba Cloud account.
      *     If you want to grant transit routers permissions to connect to Cloud Connect Network (CCN) instances, call the [GrantInstanceToCbn](~~126141~~) operation.
      * *   Before you call `GrantInstanceToTransitRouter`, take note of the billing rules, permission limits, and prerequisites on permission management of transit routers. For more information, see [Acquire permissions to connect to a network instance that belongs to another account](~~181553~~).
      *
     */
    CompletableFuture<GrantInstanceToTransitRouterResponse> grantInstanceToTransitRouter(GrantInstanceToTransitRouterRequest request);

    CompletableFuture<ListCenChildInstanceRouteEntriesToAttachmentResponse> listCenChildInstanceRouteEntriesToAttachment(ListCenChildInstanceRouteEntriesToAttachmentRequest request);

    /**
      * When you call the **ListCenInterRegionTrafficQosPolicies** operation, take note of the following information:
      * *   If you do not set the **TrafficQosPolicyId** parameter, the system returns information about QoS policies based on the values of the **TransitRouterId**, **TransitRouterAttachmentId**, **TrafficQosPolicyName**, and **TrafficQosPolicyDescription** parameters, but does not return information about the queues in the QoS policies. The **TrafficQosQueues** parameter is not included in the response.
      * *   If you specify a QoS policy ID in the **TrafficMarkingPolicyId** parameter, the system returns the information about the QoS policy and the queues. The **TrafficQosQueues** parameter is included in the response.
      *     If the **TrafficQosQueues** parameter contains an empty array, it indicates that the QoS policy contains only the default queue.
      *
     */
    CompletableFuture<ListCenInterRegionTrafficQosPoliciesResponse> listCenInterRegionTrafficQosPolicies(ListCenInterRegionTrafficQosPoliciesRequest request);

    CompletableFuture<ListCenInterRegionTrafficQosQueuesResponse> listCenInterRegionTrafficQosQueues(ListCenInterRegionTrafficQosQueuesRequest request);

    /**
      * Before you call `ListGrantVSwitchEnis`, make sure that the VPC is attached to a Cloud Enterprise Network (CEN) instance. For more information, see [CreateTransitRouterVpcAttachment](~~261358~~).
      *
     */
    CompletableFuture<ListGrantVSwitchEnisResponse> listGrantVSwitchEnis(ListGrantVSwitchEnisRequest request);

    /**
      * Before you call the `ListGrantVSwitchesToCen` operation, make sure that the following requirements are met:
      * *   The permissions on the VPC are granted to the CEN instance. For more information, see [GrantInstanceToCen](~~126224~~).
      * *   The VPC is attached to the CEN instance.
      *     *   For more information about how to connect an Enterprise Edition transit router to a VPC, see [CreateTransitRouterVpcAttachment](~~261358~~).
      *     *   For more information about how to connect a Basic Edition transit router to a VPC, see [AttachCenChildInstance](~~65902~~).
      *
     */
    CompletableFuture<ListGrantVSwitchesToCenResponse> listGrantVSwitchesToCen(ListGrantVSwitchesToCenRequest request);

    /**
      * To call this operation, you must set at least one of **ResourceId.N** and **Tag.N.Key**.
      * *   If you set only **ResourceId.N**, the tags that are added to the specified CEN instances are returned.
      * *   If you set only **Tag.N.Key**, the CEN instances that have the specified tags are returned.
      * *   If you set both **ResourceId.N** and **Tag.N.Key**, the specified tags that are added to the specified CEN instances are returned.
      *     *   Make sure that the CEN instance specified by **ResourceId.N** has the tag specified by **Tag.N.Key**. Otherwise, the response returns null.
      *     *   If multiple tag keys are specified, the logical operator among these tag keys is **AND**.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
      * Take note of the following rules when you call the **ListTrafficMarkingPolicies** operation:
      * *   If you do not specify a traffic marking policy ID in the **TrafficMarkingPolicyId** parameter, the system returns the information about the traffic marking policies based on the **TransitRouterId**, **TrafficMarkingPolicyName**, and **TrafficMarkingPolicyDescription** parameters. The information about the traffic classification rules in the policies is not returned. The **TrafficMatchRules** parameter is not included in the response.
      * *   If you specify a traffic marking policy ID in the **TrafficMarkingPolicyId** parameter, this operation returns the information about the traffic marking policy and the traffic classification rules. The **TrafficMatchRules** parameter is included in the response.
      *     If the **TrafficMatchRules** parameter contains an empty array, it indicates that the traffic marking policy does not contain a traffic classification rule.
      *
     */
    CompletableFuture<ListTrafficMarkingPoliciesResponse> listTrafficMarkingPolicies(ListTrafficMarkingPoliciesRequest request);

    /**
      * *   You can call **ListTransitRouterAvailableResource** to query the zones that support Enterprise Edition transit routers in a specified region.
      *     *   If you do not set **SupportMulticast** to **true**, general-purpose zones that support Enterprise Edition transit routers are queried.
      *     *   If you set **SupportMulticast** to **true**, zones in which Enterprise Edition transit routers support multicast are queried.
      * *   On May 31, 2022, VPC-connected Enterprise Edition transit routers were optimized. Optimized Enterprise Edition transit routers do not require you to specify the primary and secondary zones when you connect VPCs to the Enterprise Edition transit routers. You can specify one or more zones.
      *     *   If your Enterprise Edition transit router has not been optimized, you must specify the primary and secondary zones when you connect a VPC to your Enterprise Edition transit router. After you call **ListTransitRouterAvailableResource**, you can call **MasterZones** and **SlaveZones** to query the primary and secondary zones.
      *     *   If your Enterprise Edition transit router has been optimized, you can specify a zone as needed when you connect a VPC to your Enterprise Edition transit router. After you call **ListTransitRouterAvailableResource**, you can call **AvailableZones** to query the zones.
      *         For more information about the optimization, see [Announcement: Optimization on VPC-connected Enterprise Edition transit routers](~~434191~~).
      *
     */
    CompletableFuture<ListTransitRouterAvailableResourceResponse> listTransitRouterAvailableResource(ListTransitRouterAvailableResourceRequest request);

    CompletableFuture<ListTransitRouterCidrResponse> listTransitRouterCidr(ListTransitRouterCidrRequest request);

    CompletableFuture<ListTransitRouterCidrAllocationResponse> listTransitRouterCidrAllocation(ListTransitRouterCidrAllocationRequest request);

    /**
      * ## Usage notes
      * Multicast domains can be associated only with vSwitches that are in VPCs. You can call the **ListTransitRouterMulticastDomainAssociations** operation to query whether vSwitches in VPCs are associated with a specified multicast domain.
      *
     */
    CompletableFuture<ListTransitRouterMulticastDomainAssociationsResponse> listTransitRouterMulticastDomainAssociations(ListTransitRouterMulticastDomainAssociationsRequest request);

    /**
      * You can query vSwitches only in VPCs that are connected to Enterprise Edition transit routers.
      *
     */
    CompletableFuture<ListTransitRouterMulticastDomainVSwitchesResponse> listTransitRouterMulticastDomainVSwitches(ListTransitRouterMulticastDomainVSwitchesRequest request);

    CompletableFuture<ListTransitRouterMulticastDomainsResponse> listTransitRouterMulticastDomains(ListTransitRouterMulticastDomainsRequest request);

    /**
      * You can call the `ListTransitRouterMulticastGroups` operation to query the multicast sources and members in a multicast domain. Multicast sources and members are also known as multicast resources.
      * *   If you set **GroupIpAddress**, the system queries multicast resources in the multicast domain by multicast group.
      * *   If you set **VSwitchIds**, the system queries multicast resources in the multicast domain by vSwitch.
      * *   If you set **PeerTransitRouterMulticastDomains**, the system queries multicast resources that are also deployed in a different region.
      * *   If you set **ResourceType**, the system queries the multicast resources of the specified type in the multicast domain.
      * *   If you set **ResourceId**, the system queries multicast resources by resource.
      * *   If you set only **TransitRouterMulticastDomainId**, the system queries all the multicast resources in the multicast domain.
      *
     */
    CompletableFuture<ListTransitRouterMulticastGroupsResponse> listTransitRouterMulticastGroups(ListTransitRouterMulticastGroupsRequest request);

    /**
      * ## Description
      * You can use the following methods to query the cross-region connections on an Enterprise Edition transit router:
      * *   Query all cross-region connections on an Enterprise Edition transit router by specifying the ID of the Enterprise Edition transit router.
      * *   Query all cross-region connections on an Enterprise Edition transit router by specifying the ID of the Cloud Enterprise Network (CEN) instance and the ID of the region where the transit router is deployed.
      *
     */
    CompletableFuture<ListTransitRouterPeerAttachmentsResponse> listTransitRouterPeerAttachments(ListTransitRouterPeerAttachmentsRequest request);

    CompletableFuture<ListTransitRouterPrefixListAssociationResponse> listTransitRouterPrefixListAssociation(ListTransitRouterPrefixListAssociationRequest request);

    CompletableFuture<ListTransitRouterRouteEntriesResponse> listTransitRouterRouteEntries(ListTransitRouterRouteEntriesRequest request);

    /**
      * When you call **ListTransitRouterRouteTableAssociations**, you must set at least one of **TransitRouterRouteTableId** and **TransitRouterAttachmentId**.
      * *   If you set only **TransitRouterRouteTableId**, the network instance connections that are in associated forwarding correlation with a route table of an Enterprise Edition transit router are queried.
      * *   If you set only **TransitRouterAttachmentId**, the route table of an Enterprise Edition transit router that is in associated forwarding correlation with a network instance connection is queried.
      * *   If you set both **TransitRouterRouteTableId** and **TransitRouterAttachmentId**, the associated forwarding correlations between a specified network instance connection and a specified route table of an Enterprise Edition transit router are queried.
      *     *   If an associated forwarding correlation is created between the network instance connection and the route table of the Enterprise Edition transit router, the information about the associated forwarding correlation is returned.
      *     *   If no associated forwarding correlation is created between the network instance connection and the route table of the Enterprise Edition transit router, **TransitRouterAssociations** in the response is empty.
      *
     */
    CompletableFuture<ListTransitRouterRouteTableAssociationsResponse> listTransitRouterRouteTableAssociations(ListTransitRouterRouteTableAssociationsRequest request);

    CompletableFuture<ListTransitRouterRouteTablePropagationsResponse> listTransitRouterRouteTablePropagations(ListTransitRouterRouteTablePropagationsRequest request);

    CompletableFuture<ListTransitRouterRouteTablesResponse> listTransitRouterRouteTables(ListTransitRouterRouteTablesRequest request);

    /**
      * You can use the following methods to query VBR connections on an Enterprise Edition transit router:
      * *   Specify the ID of the Enterprise Edition transit router.
      * *   Specify the ID of the relevant Cloud Enterprise Network (CEN) instance and the region ID of the Enterprise Edition transit router.
      *
     */
    CompletableFuture<ListTransitRouterVbrAttachmentsResponse> listTransitRouterVbrAttachments(ListTransitRouterVbrAttachmentsRequest request);

    /**
      * You can use the following methods to query VPC connections on an Enterprise Edition transit router:
      * *   Specify the ID of the Enterprise Edition transit router.
      * *   Specify the ID of the relevant Cloud Enterprise Network (CEN) instance and the region ID of the Enterprise Edition transit router.
      * *   Specify the ID of the region where the Enterprise Edition transit router is deployed.
      *
     */
    CompletableFuture<ListTransitRouterVpcAttachmentsResponse> listTransitRouterVpcAttachments(ListTransitRouterVpcAttachmentsRequest request);

    /**
      * ## Usage note
      * When you call the **ListTransitRouterVpnAttachments** operation, take note of the following items: 
      * - If you set only **CenId** and **RegionId**, the VPN attachments in the current region are queried.
      * - If you set **CenId**, **RegionId**, and **TransitRouterAttachmentId**, only the specified VPN attachment is queried.
      * - If you set **CenId** and **RegionId**, you do not need to set **TransitRouterId**. If you set **TransitRouterId**, you do not need to set **CenId** or **RegionId**.
      *
     */
    CompletableFuture<ListTransitRouterVpnAttachmentsResponse> listTransitRouterVpnAttachments(ListTransitRouterVpnAttachmentsRequest request);

    /**
      * You can set the **RegionId** and **TransitRouterId** parameters based on your requirements.
      * *   If you do not set **RegionId** or **TransitRouterId**, the system queries all transit routers that are connected to the specified CEN instance.
      * *   If you set only **RegionId**, the system queries transit routers that are deployed in the specified region.
      * *   If you set only **TransitRouterId**, the system queries the specified transit router.
      * *   If you set both **RegionId** and **TransitRouterId**, the system queries the specified transit router in the specified region.
      *
     */
    CompletableFuture<ListTransitRoutersResponse> listTransitRouters(ListTransitRoutersRequest request);

    /**
      * **ModifyCenAttribute** is an asynchronous operation. After you send a request, the system returns the **request ID** but the operation is still being performed in the system background. You can call **DescribeCens** to query the status of a CEN instance.
      * *   If a CEN instance is in the **Modifying** state, the CEN instance is being modified. You can query the CEN instance but cannot perform other operations.
      * *   If a CEN instance is in the **Active** state, the CEN instance is modified.
      *
     */
    CompletableFuture<ModifyCenAttributeResponse> modifyCenAttribute(ModifyCenAttributeRequest request);

    CompletableFuture<ModifyCenBandwidthPackageAttributeResponse> modifyCenBandwidthPackageAttribute(ModifyCenBandwidthPackageAttributeRequest request);

    CompletableFuture<ModifyCenBandwidthPackageSpecResponse> modifyCenBandwidthPackageSpec(ModifyCenBandwidthPackageSpecRequest request);

    /**
      * `ModifyCenRouteMap` is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the `DescribeCenRouteMaps` operation to query the status of a routing policy.
      * *   **Modifying**: indicates that the system is modifying the routing policy. You can only query the routing policy, but cannot perform other operations.
      * *   **Active**: indicates that the routing policy is modified.
      *
     */
    CompletableFuture<ModifyCenRouteMapResponse> modifyCenRouteMap(ModifyCenRouteMapRequest request);

    /**
      * # Usage notes
      * `ModifyFlowLogAttribute` is an asynchronous operation. After you send a request, a **request ID** is returned but the operation is still being performed in the system background. You can call the `DescribeFlowlogs` operation to query the status of a flow log.
      * *   If a flow log is in the **Modifying** state, the flow log is being modified. In this case, you can query the flow log but cannot perform other operations.
      * *   If a flow log is in the **Active** state, the flow log is modified.
      *
     */
    CompletableFuture<ModifyFlowLogAttributeResponse> modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request);

    /**
      * ## Usage notes
      * *   Before you modify the CIDR block of a transit router, we recommend that you read the [limits on transit router CIDR blocks](~~462635~~).
      * *   If IP addresses within the CIDR block have been allocated to network instances, you cannot modify the CIDR block.
      * *   When you call **ModifyTransitRouterCidr**, if no parameter of the **PublishCidrRoute** operation is modified, ModifyTransitRouterCidr is a synchronous operation. After you call the operation, the new settings are immediately applied.
      * *   If a parameter of the **PublishCidrRoute** operation is modified, **ModifyTransitRouterCidr** is an asynchronous operation. After you call the operation, the request ID (**RequestId**) is returned but the operation is still being performed in the system background. You can call **ListTransitRouterCidr** to query the status of the CIDR block of the transit router.
      *     *   If the CIDR block of the transit router remains unchanged, the CIDR block is still being modified.
      *     *   If the CIDR block of the transit router is changed to the one that you specify in the request, the CIDR block has been modified.
      *
     */
    CompletableFuture<ModifyTransitRouterCidrResponse> modifyTransitRouterCidr(ModifyTransitRouterCidrRequest request);

    CompletableFuture<ModifyTransitRouterMulticastDomainResponse> modifyTransitRouterMulticastDomain(ModifyTransitRouterMulticastDomainRequest request);

    /**
      * ## Usage notes
      * By default, CEN instances and bandwidth plans are in the default resource group. You can call `MoveResourceGroup` to move CEN instances or bandwidth plans to another resource group.
      *
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
      * You can call the `OpenTransitRouterService` operation to activate the transit router feature free of charge. After the `OpenTransitRouterService` operation succeeds, an order is automatically generated. You can use the returned order ID to query the order information in [Alibaba Cloud User Center](https://usercenter2-intl.aliyun.com/billing/#/account/overview).
      *
     */
    CompletableFuture<OpenTransitRouterServiceResponse> openTransitRouterService(OpenTransitRouterServiceRequest request);

    /**
      * The following table describes whether routes of different types are advertised to CEN by default. You can call the PublishRouteEntries operation to advertise routes to CEN.
      * |Route|Network instance|Advertised to CEN by default|
      * |---|---|---|
      * |Routes that route network traffic to Elastic Compute Service (ECS) instances|VPC|No|
      * |Routes that route network traffic to VPN gateways|VPC|No|
      * |Routes that route network traffic to high-availability virtual IP addresses (HAVIPs)|VPC|No|
      * |Routes that route network traffic to router interfaces|VPC|No|
      * |Routes that route network traffic to elastic network interfaces (ENIs)|VPC|No|
      * |Routes that route network traffic to IPv6 gateways|VPC|No|
      * |Routes that route network traffic to NAT gateways|VPC|No|
      * |System routes of VPCs|VPC|Yes|
      * |Routes that route network traffic to data centers|VBR|Yes|
      * |Border Gateway Protocol (BGP) routes|VBR|Yes|
      *
     */
    CompletableFuture<PublishRouteEntriesResponse> publishRouteEntries(PublishRouteEntriesRequest request);

    /**
      * If you fail to advertise an aggregate route to a virtual private cloud (VPC), you can call the **RefreshTransitRouteTableAggregation** operation to re-advertise the aggregate route after you troubleshoot the error. If the error is fixed by using one of the following methods, the aggregate route is automatically advertised:
      * *   Delete the associated forwarding correlations
      * *   Disable automatic route synchronization
      * *   Delete the VPC route tables
      * *   Delete the aggregate route
      * You can call the **DescribeTransitRouteTableAggregationDetail** operation to query whether an aggregate route is advertised.
      *
     */
    CompletableFuture<RefreshTransitRouteTableAggregationResponse> refreshTransitRouteTableAggregation(RefreshTransitRouteTableAggregationRequest request);

    /**
      * Enterprise Edition transit routers allow you to specify elastic network interfaces (ENIs) as multicast members. You can call the `RegisterTransitRouterMulticastGroupMembers` operation to add ENIs in the same region or in different regions to a multicast group as multicast members.
      * *   If you set **NetworkInterfaceIds**, ENIs in the current region are specified as multicast members. Make sure that the vSwitches of the ENIs are associated with the multicast domain. For more information, see [AssociateTransitRouterMulticastDomain](~~429778~~).
      * *   If you set **PeerTransitRouterMulticastDomains**, multicast members in the multicast group that has the same IP address as the current multicast group but is in a different region are added to the current multicast group. Make sure that an inter-region connection is created. For more information, see [CreateTransitRouterPeerAttachment](~~261363~~).
      *         For example, Alice created a multicast domain (Domain A) in the Australia (Sydney) region and a multicast domain (Domain B) in the UK (London) region. Domain A contains a multicast group (Group A), and Domain B contains a multicast group (Group B). Group A and Group B have the same multicast IP address. Group B in UK (London) contains a multicast member (Member B). When Alice calls the `RegisterTransitRouterMulticastGroupMembers` operation, if she sets **PeerTransitRouterMulticastDomains** to the ID of Member B in Group B that is in the UK (London) region, Member B is added to Group A in the Australia (Sydney) region. 
      * *   The `RegisterTransitRouterMulticastGroupMembers` operation is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the `ListTransitRouterMulticastGroups` operation to query the status of a multicast member.
      *     *   If a multicast member is in the **Registering** state, the multicast member is being added. You can query the multicast member but cannot perform other operations.
      *     *   If a multicast member is in the **Registered** state, the multicast member is added.
      *
     */
    CompletableFuture<RegisterTransitRouterMulticastGroupMembersResponse> registerTransitRouterMulticastGroupMembers(RegisterTransitRouterMulticastGroupMembersRequest request);

    /**
      * ## Usage notes
      * - You can specify only elastic network interfaces (ENIs) as multicast sources.
      * - `RegisterTransitRouterMulticastGroupSources` is an asynchronous operation. After you send a request, the **request ID** is returned but the operation is still being performed in the system background. You can call `ListTransitRouterMulticastGroups` to query the status of a multicast source.     - If a multicast source is in the **Registering** state, the multicast source is being created. You can query the multicast source but cannot perform other operations.
      *   - If a multicast source is in the **Registered** state, the multicast source is created.
      * ## Prerequisites
      * Before you call `RegisterTransitRouterMulticastGroupSources`, make sure that the vSwitch on which the ENI is created is associated with the multicast domain. For more information, see [AssociateTransitRouterMulticastDomain](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/associatetransitroutermulticastdomain).
      *
     */
    CompletableFuture<RegisterTransitRouterMulticastGroupSourcesResponse> registerTransitRouterMulticastGroupSources(RegisterTransitRouterMulticastGroupSourcesRequest request);

    /**
      * *   When you call **RemoveTrafficMatchRuleFromTrafficMarkingPolicy**, take note of the following rules:
      *     *   If you specify the ID of a traffic classification rule in the **TrafficMarkRuleIds** parameter, the specified traffic classification rule is deleted.
      *     *   If you do not specify a traffic classification rule ID in the **TrafficMarkRuleIds** parameter, no operation is performed after you call this operation.
      *     If you want to delete a traffic classification rule, you must specify the rule ID before you call this operation.
      * *   **RemoveTrafficMatchRuleFromTrafficMarkingPolicy** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTrafficMarkingPolicies** operation to query the status of a traffic classification rule.
      *     *   If a traffic classification rule is in the **Deleting** state, the traffic classification rule is being deleted. In this case, you can query the traffic classification rule but cannot perform other operations.
      *     *   If a traffic classification rule cannot be found, the traffic classification rule is deleted.
      *
     */
    CompletableFuture<RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse> removeTrafficMatchRuleFromTrafficMarkingPolicy(RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest request);

    /**
      * @deprecated
      * ## Usage notes
      * The **RemoveTraficMatchRuleFromTrafficMarkingPolicy** is deprecated and will be discontinued soon. If you need to delete traffic classification rules from a traffic marking policy, call the [RemoveTrafficMatchRuleFromTrafficMarkingPolicy](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/removetrafficmatchrulefromtrafficmarkingpolicy) operation.
      *
     */
    CompletableFuture<RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse> removeTraficMatchRuleFromTrafficMarkingPolicy(RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest request);

    /**
      * *   The network instance connection that you want to associate with another route table must be created on an Enterprise Edition transit router.
      * *   **ReplaceTransitRouterRouteTableAssociation** is an asynchronous operation. After you send a request, the system returns the **request ID** but the operation is still being performed in the system background. You can call **ListTransitRouterRouteTableAssociations** to query the associated forwarding status between a network instance connection and transit router route table.
      *     *   The **Replacing** state indicates that the network instance connection is being associated with the specified transit router route table. You can query the associate forwarding correlation between the network instance connection and the transit router route table but cannot perform other operations.
      *     *   The **Active** state indicates that the network instance connection is associated with the specified transit router route table.
      *
     */
    CompletableFuture<ReplaceTransitRouterRouteTableAssociationResponse> replaceTransitRouterRouteTableAssociation(ReplaceTransitRouterRouteTableAssociationRequest request);

    /**
      * Cloud services refer to the Alibaba Cloud services that use the 100.64.0.0/10 CIDR block to provide services. These cloud services include Object Storage Service (OSS), Log Service, and Data Transmission Service (DTS). If your on-premises network needs to access a cloud service, you must attach the virtual border router (VBR) or Cloud Connect Network (CCN) instance that is connected to your on-premises network to a Cloud Enterprise Network (CEN) instance. In addition, you must attach a virtual private cloud (VPC) that is deployed in the same region as the cloud service to the CEN instance. This way, your on-premises network can connect to the VPC that is deployed in the same region as the cloud service and access the cloud service through the VPC.
      * *   An on-premises network associated with a VBR can use CEN to access only a cloud service that is deployed in the same region.
      *     For example, if cloud services are deployed in the China (Beijing) region, only on-premises networks connected to VBRs in the China (Beijing) region can access the cloud services.
      * *   **ResolveAndRouteServiceInCen** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **DescribeRouteServicesInCen** operation to query the status of a cloud service.
      *     *   If a cloud service is in the **Creating** state, the connection to the cloud service is being created. In this case, you can query the cloud service but cannot perform other operations.
      *     *   If a cloud service is in the **Active** state, the connection to the cloud service is created.
      *     *   If a cloud service is in the **Failed** state, the connection to the cloud service failed.
      * # Prerequisites
      * Before you call this operation, make sure that the following conditions are met:
      * *   The VBR or CCN instance to which your on-premises network is connected is attached to a CEN instance.
      * *   A VPC that is deployed in the same region as the cloud service is also attached to the CEN instance. For more information, see [AttachCenChildInstance](~~65902~~).
      *
     */
    CompletableFuture<ResolveAndRouteServiceInCenResponse> resolveAndRouteServiceInCen(ResolveAndRouteServiceInCenRequest request);

    /**
      * ## Usage notes
      * `RevokeInstanceFromTransitRouter` disallows transit routers only from connecting to virtual private clouds (VPCs), virtual border routers (VBRs), and IPsec-VPN connections.  
      * If you want to disallow transit routers from connecting to Cloud Connect Network (CCN) instances, call the [RevokeInstanceFromCbn](https://www.alibabacloud.com/help/en/smart-access-gateway/latest/revokeinstancefromcbn) operation.  
      * ## Prerequisites
      * Before you call `RevokeInstanceFromTransitRouter`, you must detach the network instances from the transit router.  
      * - For more information about how to detach VPCs from an Enterprise Edition transit router, see [DeleteTransitRouterVpcAttachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/deletetransitroutervpcattachment).
      * - For more information about how to detach VBRs from an Enterprise Edition transit router, see [DeleteTransitRouterVbrAttachment](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/deletetransitroutervbrattachment).
      * - For more information about how to detach network instances from a Basic Edition transit router, see [DetachCenChildInstance](https://www.alibabacloud.com/help/en/cloud-enterprise-network/latest/detachcenchildinstance).
      *
     */
    CompletableFuture<RevokeInstanceFromTransitRouterResponse> revokeInstanceFromTransitRouter(RevokeInstanceFromTransitRouterRequest request);

    /**
      * # Background information
      * PrivateZone is an Alibaba Cloud private domain name resolution and management service based on Virtual Private Cloud (VPC). After you attach virtual border routers (VBRs) and Cloud Connect Network (CCN) instances to a Cloud Enterprise Network (CEN) instance, you can enable the on-premises networks connected to the VBRs and CCN instances to access PrivateZone through the CEN instance.
      * *   The on-premises networks connected to VBRs or CCN instances must be deployed in the same region as the PrivateZone service.
      *     For example, if the PrivateZone service is deployed in the China (Beijing) region, only on-premises networks connected to VBRs or CCN instances in the China (Beijing) region can access the PrivateZone service.
      * *   **RoutePrivateZoneInCenToVpc** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **DescribeCenPrivateZoneRoutes** operation to query the status of PrivateZone.
      *     *   If PrivateZone is in the **Creating** state, access to PrivateZone is being configured. In this case, you can query PrivateZone configurations but cannot perform other operations.
      *     *   If PrivateZone is in the **Active** state, access to PrivateZone is enabled.
      *     *   If PrivateZone is in the **Failed** state, configurations of access to PrivateZone failed.
      * # Prerequisites
      * Before you call **RoutePrivateZoneInCenToVpc**, make sure that the following conditions are met:
      * *   PrivateZone is deployed. For more information, see [PrivateZone quick start](~~64627~~).
      * *   The following network instances are attached to the same CEN instance: the VPC that is associated with the PrivateZone service, and the VBR and CCN instance that want to access the PrivateZone service. For more information, see [AttachCenChildInstance](~~65902~~).
      * *   If your on-premises network uses a CCN instance to connect to Alibaba Cloud and the account that owns the CCN instance is different from the account that owns the VPC or CEN instance, you must grant the CCN instance required permissions. For more information, see [Grant permissions to CCN](~~106674~~).
      *
     */
    CompletableFuture<RoutePrivateZoneInCenToVpcResponse> routePrivateZoneInCenToVpc(RoutePrivateZoneInCenToVpcRequest request);

    /**
      * ## Prerequisites
      * The Cloud Enterprise Network (CEN) instance is associated with a bandwidth plan. For more information, see the [CreateCenBandwidthPackage](~~65919~~) and [AssociateCenBandwidthPackage](~~65934~~) topics.
      * You can call the **SetCenInterRegionBandwidthLimit** operation to configure, modify, or remove the maximum bandwidth value of an inter-region connection.
      * *   If you set **BandwidthLimit** to a value other than 0, the maximum bandwidth value of the inter-region connection is set or changed to the specified value.
      * *   If you set **BandwidthLimit** to 0, no bandwidth resource is allocated to the inter-region connection.
      * ## Limits
      * *   The maximum bandwidth value of an inter-region connection cannot exceed that of the associated bandwidth plan.
      * *   The sum of the maximum bandwidth values of all inter-region connections cannot exceed the maximum bandwidth value of the associated bandwidth plan.
      * *   If bandwidth multiplexing is enabled for an inter-region connection, you cannot change the maximum bandwidth value of the inter-region connection.
      * *   You can call the **SetCenInterRegionBandwidthLimit** operation to configure, modify, and remove the maximum bandwidth values of inter-region connections only on Basic Edition transit routers.
      *     For more information about how to configure, modify, and remove the maximum bandwidth values of inter-region connections on Enterprise Edition transit routers, see [CreateTransitRouterPeerAttachment](~~261363~~), [UpdateTransitRouterPeerAttachmentAttribute](~~261229~~), and [DeleteTransitRouterPeerAttachment](~~261227~~).
      *
     */
    CompletableFuture<SetCenInterRegionBandwidthLimitResponse> setCenInterRegionBandwidthLimit(SetCenInterRegionBandwidthLimitRequest request);

    /**
      * ## Description
      * *   Each tag consists of a tag key and a tag value. When you add a tag, you must specify the tag key and tag value.
      * *   If you want to add multiple tags to a Cloud Enterprise Network (CEN) instance, each tag key must be unique.
      * *   You can add at most 20 tags to a CEN instance.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
      * Subscription bandwidth plans support temporary upgrades. You can increase the bandwidth limit of a bandwidth plan within a specified time window. This way, you can manage your bandwidth to handle traffic spikes in a more efficient manner.
      * The minimum time window for a temporary upgrade is 3 hours. The bandwidth plan is upgraded immediately after you complete the payment. The upgrade process does not interrupt workloads.
      * >  After the specified time window ends, the bandwidth limit of the subscription bandwidth plan is reset to the original value. If the bandwidth required by your workloads is higher than this value, packets may be discarded due to network traffic throttling. We recommend that you set a proper time window for the temporary upgrade and make sure that the bandwidth limit meets your business requirements.
      * *   The temporary upgrade feature is unavailable by default. If you need to use this feature, contact your account manager.
      * *   Expired subscription bandwidth plans and pay-as-you-go bandwidth plans do not support temporary upgrades.
      * *   **TempUpgradeCenBandwidthPackageSpec** is an asynchronous operation. After you send a request, the system returns a **request ID** and performs the operation in the system background. You can call the **DescribeCenBandwidthPackages** operation to query the specification of a bandwidth plan. If the maximum bandwidth value of the bandwidth plan is set to the specified value, the bandwidth plan is upgraded.
      *
     */
    CompletableFuture<TempUpgradeCenBandwidthPackageSpecResponse> tempUpgradeCenBandwidthPackageSpec(TempUpgradeCenBandwidthPackageSpecRequest request);

    /**
      * No inter-region connections are configured in the bandwidth plan. For more information about how to delete inter-region connections, see [SetCenInterRegionBandwidthLimit](~~65942~~).
      *
     */
    CompletableFuture<UnassociateCenBandwidthPackageResponse> unassociateCenBandwidthPackage(UnassociateCenBandwidthPackageRequest request);

    /**
      * ## Usage notes
      * **UnroutePrivateZoneInCenToVpc** is an asynchronous operation. After you send a request, the **request ID** is returned but the operation is still being performed in the system background. You can call **DescribeCenPrivateZoneRoutes** to query the status of PrivateZone.
      * *   If PrivateZone is in the **Deleting** state, access to PrivateZone is being disabled. In this case, you can query PrivateZone configurations but cannot perform other operations.
      * *   If configurations of access to PrivateZone cannot be found, access to PrivateZone is disabled.
      *
     */
    CompletableFuture<UnroutePrivateZoneInCenToVpcResponse> unroutePrivateZoneInCenToVpc(UnroutePrivateZoneInCenToVpcRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateCenInterRegionTrafficQosPolicyAttributeResponse> updateCenInterRegionTrafficQosPolicyAttribute(UpdateCenInterRegionTrafficQosPolicyAttributeRequest request);

    CompletableFuture<UpdateCenInterRegionTrafficQosQueueAttributeResponse> updateCenInterRegionTrafficQosQueueAttribute(UpdateCenInterRegionTrafficQosQueueAttributeRequest request);

    CompletableFuture<UpdateTrafficMarkingPolicyAttributeResponse> updateTrafficMarkingPolicyAttribute(UpdateTrafficMarkingPolicyAttributeRequest request);

    /**
      * **UpdateTransitRouter** is an asynchronous operation. After you send a request, the system returns the **request ID** but the operation is still being performed in the system background. You can call **ListTransitRouters** to query the status of a transit router.
      * *   If a transit router is in the **Modifying** state, the configuration of the transit router is being modified. You can query the transit router but cannot perform other operations.
      * *   If a transit router is in the **Active** state, the configuration of the transit router is modified.
      *
     */
    CompletableFuture<UpdateTransitRouterResponse> updateTransitRouter(UpdateTransitRouterRequest request);

    /**
      * **UpdateTransitRouterPeerAttachmentAttribute** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the system background. You can call the **ListTransitRouterPeerAttachments** operation to query the status of an inter-region connection.
      * *   If an inter-region connection is in the **Modifying** state, the inter-region connection is being modified. You can query the inter-region connection but cannot perform other operations.
      * *   If an inter-region connection is in the **Attached** state, the inter-region connection is modified.
      *
     */
    CompletableFuture<UpdateTransitRouterPeerAttachmentAttributeResponse> updateTransitRouterPeerAttachmentAttribute(UpdateTransitRouterPeerAttachmentAttributeRequest request);

    CompletableFuture<UpdateTransitRouterRouteEntryResponse> updateTransitRouterRouteEntry(UpdateTransitRouterRouteEntryRequest request);

    CompletableFuture<UpdateTransitRouterRouteTableResponse> updateTransitRouterRouteTable(UpdateTransitRouterRouteTableRequest request);

    /**
      * ## Usage notes
      * **UpdateTransitRouterVbrAttachmentAttribute** is an asynchronous operation. After you send a request, the system returns the **request ID** but the operation is still being performed in the system background. You can call **ListTransitRouterVbrAttachments** to query the status of a VBR connection.
      * *   If a VBR connection is in the **Modifying** state, the VBR connection is being modified. You can query the VBR connection but cannot perform other operations.
      * *   If the VBR connection is in the **Attached** state, the VBR connection is modified.
      *
     */
    CompletableFuture<UpdateTransitRouterVbrAttachmentAttributeResponse> updateTransitRouterVbrAttachmentAttribute(UpdateTransitRouterVbrAttachmentAttributeRequest request);

    /**
      * **UpdateTransitRouterVpcAttachmentAttribute** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterVpcAttachments** operation to query the status of a VPC connection.
      * *   If a VPC connection is in the **Modifying** state, the VPC connection is being modified. You can query the VPC connection but cannot perform other operations.
      * *   If a VPC connection is in the **Attached** state, the VPC connection is modified.
      *
     */
    CompletableFuture<UpdateTransitRouterVpcAttachmentAttributeResponse> updateTransitRouterVpcAttachmentAttribute(UpdateTransitRouterVpcAttachmentAttributeRequest request);

    /**
      * *   When you add a zone and a vSwitch for a VPC connection, make sure that the vSwitch has at least one idle IP address. When you modify the zones and vSwitches of a VPC connection, the Enterprise Edition transit router creates an elastic network interface (ENI) in the vSwitch. The ENI occupies one IP address in the vSwitch. The ENI forwards traffic between the VPC and the Enterprise Edition transit router.
      * *   **UpdateTransitRouterVpcAttachmentZones** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterVpcAttachments** operation to query the status of a VPC connection.
      *     *   If a VPC connection is in the **Modifying** state, the VPC connection is being modified. You can query the VPC connection but cannot perform other operations.
      *     *   If a VPC connection is in the **Attached** state, the VPC connection is modified.
      *
     */
    CompletableFuture<UpdateTransitRouterVpcAttachmentZonesResponse> updateTransitRouterVpcAttachmentZones(UpdateTransitRouterVpcAttachmentZonesRequest request);

    CompletableFuture<UpdateTransitRouterVpnAttachmentAttributeResponse> updateTransitRouterVpnAttachmentAttribute(UpdateTransitRouterVpnAttachmentAttributeRequest request);

    CompletableFuture<WithdrawPublishedRouteEntriesResponse> withdrawPublishedRouteEntries(WithdrawPublishedRouteEntriesRequest request);

}
