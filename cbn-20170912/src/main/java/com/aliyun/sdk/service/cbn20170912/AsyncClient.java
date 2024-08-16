// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.cbn20170912.models.*;
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
      * *   After you create a flow log, it is enabled by default. You can call this operation to enable a disabled flow log.
      * *   `ActiveFlowLog` is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the `DescribeFlowlogs` operation to query the status of a flow log.
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
      * ### Usage notes
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
      * After you create a network instance connection on a transit router, you can configure an associated forwarding correlation to associate the network instance connection with the route table of an Enterprise Edition transit router. The Enterprise Edition transit router forwards traffic for the network instance based on the routes in the route table. Before you begin, we recommend that you take note of the following rules:
      * *   Only route tables of Enterprise Edition transit routers support associated forwarding correlations. For more information about the regions and zones that support Enterprise Edition transit routers, see [What is CEN?](~~181681~~)
      * *   Each network instance connection can have an associated forwarding correlation with only one route table of only one Enterprise Edition transit router.
      * *   **AssociateTransitRouterAttachmentWithRouteTable** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterRouteTableAssociations** operation to query the status of an associated forwarding correlation.
      *     *   If an associated forwarding correlation is in the **Associating** state, the associated forwarding correlation is being created. You can query the associated forwarding correlation but cannot perform other operations.
      *     *   If an associated forwarding correlation is in the **Active** state, the associated forwarding correlation is created.
      *
     */
    CompletableFuture<AssociateTransitRouterAttachmentWithRouteTableResponse> associateTransitRouterAttachmentWithRouteTable(AssociateTransitRouterAttachmentWithRouteTableRequest request);

    /**
      * - A vSwitch can be associated with only one multicast domain. Make sure that the vSwitch is not associated with other multicast domains. For more information about how to disassociate a vSwitch from a multicast domain, see [DisassociateTransitRouterMulticastDomain](~~429774~~).
      * - AssociateTransitRouterMulticastDomain is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterMulticastDomainAssociations operation to query whether a vSwitch is associated with the specified multicast domain.
      *   - If the status is Associating, it indicates that the vSwitch is being associated with the specified multicast domain. You can query the vSwitch but cannot perform other operations on the vSwitch.
      *   - If the status is Associated, the vSwitch is associated with the specified multicast domain.
      * - The VPC of the vSwitch must be associated with an Enterprise Edition transit router. For more information about how to associate a VPC with an Enterprise Edition transit router, see [CreateTransitRouterVpcAttachment](~~468237~~).
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
      * **CreateCen** is an asynchronous operation. After you a request is sent, the system returns a request ID and runs the task in the background. You can call **DescribeCens** to query the status of the task.
      * *   If a CEN instance is in the **Creating** state, the CEN instance is being created. You can query the CEN instance but cannot perform other operations.
      * *   If a CEN instance is in the **Active** state, the CEN instance is created.
      *
     */
    CompletableFuture<CreateCenResponse> createCen(CreateCenRequest request);

    /**
      * *   You must specify the areas to be connected when you create a bandwidth plan. An area contains one or more Alibaba Cloud regions. When you select areas for a bandwidth plan, make sure that the areas contain the regions that you want to connect. For more information about the supported areas and regions, see [Purchase a bandwidth plan](~~181560~~).
      * *   For more information about the billing rules, see [Billing](~~189836~~).
      * *   **CreateCenBandwidthPackage** is an asynchronous operation. After you send a request, the system returns a bandwidth plan instance ID and runs the task in the background. You can call the **DescribeCenBandwidthPackages** operation to query the status of a bandwidth plan. If a bandwidth plan is in the **Idle** or **InUse** state, the bandwidth plan is created.
      *
     */
    CompletableFuture<CreateCenBandwidthPackageResponse> createCenBandwidthPackage(CreateCenBandwidthPackageRequest request);

    /**
      * *   You can add routes only to virtual private clouds (VPCs) or virtual border routers (VBRs) that are connected to an Enterprise Edition transit router.
      * *   By default, the next hop of the routes is the **transit router connection**, which is the connection between the VBR and the Enterprise Edition transit router. You cannot modify the next hop.
      * *   **CreateCenChildInstanceRouteEntryToAttachment** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **DescribeRouteEntryList** operation to query the status of a route.
      *     *   If a route is in the **Pending** state, the route is being created. You can query the route but cannot perform other operations.
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
      * *   Traffic scheduling applies only to outbound traffic on Enterprise Edition transit routers.
      *     For example, you create an inter-region connection between the China (Hangzhou) and China (Qingdao) regions, and create a QoS policy for the transit router in the China (Hangzhou) region. In this case, the QoS policy can ensure bandwidth for network traffic from the China (Hangzhou) region to the China (Qingdao) region. However, the QoS policy does not apply to network traffic from the China (Qingdao) region to the China (Hangzhou) region.
      * *   **CreateCenInterRegionTrafficQosPolicy** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the **ListCenInterRegionTrafficQosPolicies** operation to query the status of the task.
      *     *   If the QoS policy is in the **Creating** state, the QoS policy is being created. You can query the QoS policy but cannot perform other operations on the QoS policy.
      *     *   If the QoS policy is in the **Active** state, the QoS policy is created.
      * ## [](#)Prerequisite
      * Before you call the **CreateCenInterRegionTrafficQosPolicy** operation, make sure that the following requirements are met:
      * *   An inter-region connection is created. For more information, see [CreateTransitRouterPeerAttachment](~~261363~~).
      * *   A traffic marking policy is created. For more information, see [CreateTrafficMarkingPolicy](~~419025~~).
      *
     */
    CompletableFuture<CreateCenInterRegionTrafficQosPolicyResponse> createCenInterRegionTrafficQosPolicy(CreateCenInterRegionTrafficQosPolicyRequest request);

    /**
      * The ID of the request.
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
      * After you add an aggregate route to a route table of an Enterprise Edition transit router, the Enterprise Edition transit router advertises its routes only to route tables of virtual private clouds (VPCs) that are associated with a route table of the Enterprise Edition transit router and have route synchronization enabled.
      * Perform the following operations before you create an aggregate route. Otherwise, the Enterprise Edition transit router does not advertise routes to VPC route tables:
      * *   Associated forwarding is enabled between the VPCs and the Enterprise Edition transit router. For more information, see [AssociateTransitRouterAttachmentWithRouteTable](~~261242~~).
      * *   Route synchronization is enabled for the VPCs. For more information, see [CreateTransitRouterVpcAttachment](~~261358~~).
      *
     */
    CompletableFuture<CreateTransitRouteTableAggregationResponse> createTransitRouteTableAggregation(CreateTransitRouteTableAggregationRequest request);

    /**
      * *   You can call **CreateTransitRouter** to create an Enterprise Edition transit router. For more information about the regions that support Enterprise Edition transit routers, see [What is CEN?](~~181681~~)
      * *   **CreateTransitRouter** is an asynchronous operation. After you send a request, the transit router ID is returned but the operation is still being performed in the system background. You can call [ListTransitRouters](~~261219~~) to query the status of an Enterprise Edition transit router.
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
      * *   For more information, see [Limits in transit router CIDR blocks](~~462635~~).
      * *   Each transit router supports at most five CIDR blocks. The subnet mask of a CIDR block must be 16 bits to 24 bits in length.
      * *   The following CIDR blocks and their subnets are not supported: 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, and 169.254.0.0/16.
      * *   The CIDR block cannot overlap with the CIDR blocks of the network instances that communicate with each other by using the CEN instance.
      * *   On the same CEN instance, each transit router CIDR block must be unique.
      * *   When you create the first VPN connection after you add a CIDR block for a transit router, three CIDR blocks within the CIDR block are reserved. An IP address is allocated from the remaining CIDR blocks to the IPsec-VPN connection.
      *     You can call the [ListTransitRouterCidrAllocation](~~464173~~) operation to query reserved CIDR blocks and IP addresses allocated to network connections.
      *
     */
    CompletableFuture<CreateTransitRouterCidrResponse> createTransitRouterCidr(CreateTransitRouterCidrRequest request);

    /**
      * *   Only Enterprise Edition transit routers support ECR connections.
      * *   The following methods describe how to attach an ECR connection to an Enterprise Edition transit router:
      *     *   If an Enterprise Edition transit router is created in the region, specify the **EcrId**, **RegionId**, and **TransitRouterId** parameters.
      *     *   If no Enterprise Edition transit router is created in the region, specify the **EcrId**, **CenId**, and **RegionId** parameters. An Enterprise Edition transit router is automatically created when you create an ECR connection.
      * *   CreateTransitRouterEcrAttachment is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the **ListTransitRouterEcrAttachments** operation to query the status of an ECR connection.
      *     *   If the ECR connection is in the **Attaching** state, the ECR connection is being created. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection.
      *     *   If the ECR connection is in the **Attached** state, the ECR connection is created.
      * *   After you create an ECR connection, the ECR connection is not in route learning or associated forwarding relationships with Enterprise Edition transit routers.
      *     After you enable [route learning](~~468300~~) between the ECR connection and an Enterprise Edition transit router, the routes of the ECR are automatically advertised to the route tables of the Enterprise Edition transit router.
      * *   After you create an ECR connection, the routes in the route tables of the Enterprise Edition transit router to which the ECR connection is attached are automatically advertised to the route table of the ECR.
      * ### [](#)Prerequisite
      * *   The Alibaba Cloud account of the Enterprise Edition transit router and the Alibaba Cloud account of the ECR belong to the same enterprise.
      * *   The Enterprise Edition transit router and ECR can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. If the Enterprise Edition transit router and ECR belong to different Alibaba Cloud accounts, grant the transit router permissions on the ECR before you can attach the ECR to the transit router. For more information, see [Acquire permissions to connect to a network instance that belongs to another account](~~181553~~).
      * *   **Before you call this operation to attach an ECR connection to an Enterprise Edition transit router, you must call the [CreateExpressConnectRouterAssociation](~~2712082~~) operation to create an association between the ECR and transit router.**
      *     **If you call the DeleteTransitRouterEcrAttachment operation to forcefully delete an ECR connection, the association between the ECR connection and Enterprise Edition transit router is deleted.**
      *
     */
    CompletableFuture<CreateTransitRouterEcrAttachmentResponse> createTransitRouterEcrAttachment(CreateTransitRouterEcrAttachmentRequest request);

    /**
      * Before you call this operation, read the following rules:
      * *   Make sure that an Enterprise Edition transit router is deployed in the region where you want to create the multicast domain, and the multicast feature is enabled for the Enterprise Edition transit router. For more information, see [CreateTransitRouter](~~261169~~).
      *     If an Enterprise Edition transit router was created before you apply for multicast resources, the transit router does not support multicast. You can delete the transit router and create a new one. For more information about how to delete an Enterprise Edition transit router, see [DeleteTransitRouter](~~261218~~).
      * *   When you call **CreateTransitRouterMulticastDomain**, if you set **CenId** and **RegionId**, you do not need to set **TransitRouterId**. If you set **TransitRouterId**, you do not need to set **CenId** or **RegionId**.
      *
     */
    CompletableFuture<CreateTransitRouterMulticastDomainResponse> createTransitRouterMulticastDomain(CreateTransitRouterMulticastDomainRequest request);

    /**
      * *   Enterprise Edition transit routers allow you to allocate bandwidth resources to inter-region connections by using the following methods:
      *     *   **Allocate bandwidth resources from a bandwidth plan**:
      *         You must purchase a bandwidth plan, and then allocate bandwidth resources from the bandwidth plan to inter-region connections. For more information about how to purchase a bandwidth plan, see [CreateCenBandwidthPackage](~~65919~~).
      *     *   **Use pay-by-data-transfer bandwidth resources**:
      *         You can set a maximum bandwidth value for an inter-region connection. Then, you are charged for the amount of data transfer over the connection. For more information, see [Inter-region data transfer](~~337827~~).
      * *   **CreateTransitRouterPeerAttachment** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the **ListTransitRouterPeerAttachments** operation to query the status of an inter-region connection.
      *     *   If the inter-region connection is in the **Attaching** state, the inter-region connection is being created. In this case, you can query the connection but cannot perform other operations on the connection.
      *     *   If the inter-region connection is in the **Attached** state, the inter-region connection is created.
      *
     */
    CompletableFuture<CreateTransitRouterPeerAttachmentResponse> createTransitRouterPeerAttachment(CreateTransitRouterPeerAttachmentRequest request);

    /**
      * *   Only the route tables of Enterprise Edition transit routers can be associated with prefix lists.
      * *   A prefix list can be associated only with one route table of an Enterprise Edition.
      * *   The CIDR blocks in the prefix list cannot overlap with those in the route table of the Enterprise Edition transit router. Otherwise, the prefix list fails to be associated with the route table.
      * *   If the route table of an Enterprise Edition transit router needs to be associated with multiple prefix lists, make sure that the CIDR blocks in the prefix lists do not overlap. Otherwise, the route table fails to be associated with the prefix lists.
      * ### Prerequisites
      * *   A prefix list is created. For more information, see [CreateVpcPrefixList](~~437367~~).
      * *   The prefix list is shared with the Alibaba Cloud account that owns the Enterprise Edition transit router if the prefix list and the Enterprise Edition transit router belong to different Alibaba Cloud accounts. For more information about how to share a prefix list with another Alibaba Cloud account, see [Resource sharing overview](~~160622~~) and [API reference for resource sharing](~~193445~~).
      *
     */
    CompletableFuture<CreateTransitRouterPrefixListAssociationResponse> createTransitRouterPrefixListAssociation(CreateTransitRouterPrefixListAssociationRequest request);

    /**
      * **CreateTransitRouterRouteEntry** is an asynchronous operation. After you send a request, the route ID is returned but the operation is still being performed in the system background. You can call **ListTransitRouterRouteEntries** to query the status of a route.
      * *   If a route is in the **Creating** state, the route is being created. In this case, you can query the route but cannot perform other operations.
      * *   If a route is in the **Active** state, the route is created.
      *
     */
    CompletableFuture<CreateTransitRouterRouteEntryResponse> createTransitRouterRouteEntry(CreateTransitRouterRouteEntryRequest request);

    /**
      * *   Only Enterprise Edition transit routers support custom route tables. For more information about the regions and zones that support Enterprise Edition transit routers, see [What is CEN?](~~181681~~)
      * *   **CreateTransitRouterRouteTable** is an asynchronous operation. After you send a request, the route table ID is returned but the operation is still being performed in the system background. You can call **ListTransitRouterRouteTables** to query the status of a route table.
      *     *   If a route table is in the **Creating** state, the route table is being created. In this case, you can query the route table but cannot perform other operations.
      *     *   If a route table is in the **Active** state, the route table is created.
      *
     */
    CompletableFuture<CreateTransitRouterRouteTableResponse> createTransitRouterRouteTable(CreateTransitRouterRouteTableRequest request);

    /**
      * *   For more information about the regions and zones that support Enterprise Edition transit routers, see [What is CEN?](~~181681~~)
      * *   You can use the following methods to create a VBR connection on an Enterprise Edition transit router:
      *     *   If an Enterprise Edition transit router is already created in the region, specify the **VbrId**, **RegionId**, and **TransitRouterId** parameters to create a VBR connection.
      *     *   If no Enterprise Edition transit router is already created in the region, specify the **VbrId**, **CenId**, and **RegionId** parameters to create a VBR connection. When you create a VBR connection, the system automatically creates an Enterprise Edition transit router in the specified region.
      * *   **CreateTransitRouterVbrAttachment** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call **ListTransitRouterVbrAttachments** to query the status of a VBR connection.
      *     *   If the VBR connection is in the **Attaching** state, the VBR connection is being created. In this case, you can query the VBR connection but cannot perform other operations.
      *     *   If the VBR connection is in the **Attached** state, the VBR connection is created.
      * *   The transit router and the VBR must belong to the same Alibaba Cloud account.
      * *   Transit routers can connect to VBRs that belong to the same or a different Alibaba Cloud account. To connect a transit router to a VBR that belongs to a different Alibaba Cloud account, grant permissions on the VBR to the transit router. For more information, see [Grant a transit router permissions on a network instance that belongs to another Alibaba Cloud account](~~181553~~).
      * *   After you create a VBR connection, it is not in route learning or associated forwarding relationship with transit router route tables by default.
      *
     */
    CompletableFuture<CreateTransitRouterVbrAttachmentResponse> createTransitRouterVbrAttachment(CreateTransitRouterVbrAttachmentRequest request);

    /**
      * *   You can use the following methods to attach a VPC to an Enterprise Edition transit router:
      *     *   If an Enterprise Edition transit router is already created in the region where you want to create a VPC connection, set **VpcId**, **ZoneMappings.N.VSwitchId**, **ZoneMappings.N.ZoneId**, and **TransitRouterId**.
      *     *   If no Enterprise Edition transit router is created in the region where you want to create a VPC connection, set **VpcId**, **ZoneMappings.N.VSwitchId**, **ZoneMappings.N.ZoneId**, **CenId**, and **RegionId**. When you create a VPC connection, the system automatically creates an Enterprise Edition transit router in the specified region.
      * *   **CreateTransitRouterVpcAttachment** is an asynchronous operation. After you send a request, the VPC connection ID is returned but the operation is still being performed in the system background. You can call the [ListTransitRouterVpcAttachments](~~261222~~) operation to query the status of a VPC connection.
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
      * ### Prerequisites
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
      * **DeleteCen** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the **DescribeCens** operation to query the status of a CEN instance.
      * *   If a CEN instance is in the **Deleting** state, the CEN instance is being deleted. In this case, you can query the CEN instance but cannot perform other operations.
      * *   If a CEN instance cannot be found, the CEN instance is deleted.
      * #### Prerequisites
      * The CEN instance that you want to delete is not associated with a bandwidth plan, and the transit router associated with the CEN instance does not have a network instance connection or a custom route table.
      * *   For more information about how to detach a network instance, see the following topics:
      *     *   [DeleteTransitRouterVpcAttachment](~~261220~~)
      *     *   [DeleteTransitRouterVbrAttachment](~~261223~~)
      *     *   [DeleteTransitRouterVpnAttachment](~~443992~~)
      *     *   [DeleteTransitRouterPeerAttachment](~~261227~~)
      *      >For more information about how to detach network instances from a Basic Edition transit router, see [DetachCenChildInstance](~~65915~~).
      * *   For more information about how to delete a custom route table, see [DeleteTransitRouterRouteTable](~~261235~~).
      * *   For more information about how to disassociate a bandwidth plan from a CEN instance, see [UnassociateCenBandwidthPackage](~~65935~~).
      *
     */
    CompletableFuture<DeleteCenResponse> deleteCen(DeleteCenRequest request);

    CompletableFuture<DeleteCenBandwidthPackageResponse> deleteCenBandwidthPackage(DeleteCenBandwidthPackageRequest request);

    /**
      * *   You can delete routes only from virtual private clouds (VPCs) and virtual border routers (VBRs) whose next hop is an **Enterprise Edition transit router connection**, which is the connection to the network instance.
      * *   **DeleteCenChildInstanceRouteEntryToAttachment** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **DescribeRouteEntryList** operation to query the status of a route.
      *     *   If a route is in the **Deleting** state, the route is being deleted. You can query the route but cannot perform other operations.
      *     *   If a route cannot be found, the route is deleted.
      *
     */
    CompletableFuture<DeleteCenChildInstanceRouteEntryToAttachmentResponse> deleteCenChildInstanceRouteEntryToAttachment(DeleteCenChildInstanceRouteEntryToAttachmentRequest request);

    /**
      * ## Limits
      * *   By default, the DeleteCenChildInstanceRouteEntryToCen operation is unavailable. To call this operation, [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
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
      * `DeleteFlowlog` is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the `DescribeFlowlogs` operation to query the status of a flow log.
      * *   If a flow log is in the **Deleting** state, the flow log is being deleted. In this case, you can query the flow log but cannot perform other operations.
      * *   If a flow log cannot be found, the flow log is deleted.
      *
     */
    CompletableFuture<DeleteFlowlogResponse> deleteFlowlog(DeleteFlowlogRequest request);

    /**
      * **DeleteRouteServiceInCen** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. If the request parameters are invalid, the system returns a request ID, but the cloud service configuration is not deleted. You can call **DescribeRouteServicesInCen** to query the status of the task.
      * *   If a cloud service is in the **Deleting** state, the cloud service configuration is being deleted. In this case, you can only query the cloud service configuration and cannot perform other operations.
      * *   If the specified cloud service configuration cannot be found, the cloud service configuration is deleted.
      *
     */
    CompletableFuture<DeleteRouteServiceInCenResponse> deleteRouteServiceInCen(DeleteRouteServiceInCenRequest request);

    /**
      * *   **DeleteTrafficMarkingPolicy** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the **ListTrafficMarkingPolicies** operation to query the status of a traffic marking policy.
      *     *   If a traffic marking policy is in the **Deleting** state, the traffic marking policy is being deleted. You can query the traffic marking policy but cannot perform other operations.
      *     *   If a traffic marking policy cannot be found, the traffic marking policy is deleted.
      * *   Before you delete a traffic marking policy, you must delete all traffic classification rules from the policy. For more information, see [RemoveTrafficMatchRuleFromTrafficMarkingPolicy](~~468330~~).
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
      * **DeleteTransitRouter** is an asynchronous operation. After you send a request, the **request ID** is returned but the operation is still being performed in the system background. You can call **ListTransitRouters** to query the status of a transit router.
      * *   If a transit router is in the **Deleting** state, the transit router is being deleted. In this case, you can query the transit router but cannot perform other operations.
      * *   If a transit router cannot be found, the transit router is deleted.
      * #### Prerequisites
      * Before you delete a transit router, make sure that the following prerequisites are met:
      * - No network instance connections are created on the transit router. 
      * 	
      *     - For more information about how to delete a virtual private cloud (VPC) connection, see [DeleteTransitRouterVpcAttachment](~~261220~~). 
      *     - For more information about how to delete a virtual border router (VBR) connection, see [DeleteTransitRouterVbrAttachment](~~261223~~). 
      *     - For more information about how to delete a Cloud Connect Network (CCN) connection, see [DetachCenChildInstance](~~65915~~). 
      *     - For more information about how to delete a VPN connection, see [DeleteTransitRouterVpnAttachment](~~443992~~).
      *     - For more information about how to delete an inter-region connection, see [DeleteTransitRouterPeerAttachment](~~261227~~). 
      * - No custom route tables are created on the transit router. For more information about how to delete a custom route table, see [DeleteTransitRouterRouteTable](~~261235~~).
      *
     */
    CompletableFuture<DeleteTransitRouterResponse> deleteTransitRouter(DeleteTransitRouterRequest request);

    /**
      * If IP addresses within the CIDR block have been allocated to network instances, the CIDR block cannot be deleted.
      *
     */
    CompletableFuture<DeleteTransitRouterCidrResponse> deleteTransitRouterCidr(DeleteTransitRouterCidrRequest request);

    /**
      * DeleteTransitRouterEcrAttachment is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of an ECR connection.
      * If the ECR connection is in the Detaching state, the ECR connection is being deleted. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection. If the ECR connection cannot be found, the ECR connection is deleted. Before you call the DeleteTransitRouterEcrAttachment operation, make sure that all request parameters are valid. If a request is invalid, a request ID is returned but the ECR connection is not deleted.
      *
     */
    CompletableFuture<DeleteTransitRouterEcrAttachmentResponse> deleteTransitRouterEcrAttachment(DeleteTransitRouterEcrAttachmentRequest request);

    /**
      * Before you delete a multicast domain, make sure that the following requirements are met:
      * *   The multicast domain is disassociated from all vSwitches. For more information, see [DisassociateTransitRouterMulticastDomain](~~429774~~).
      * *   All multicast sources and members are removed from the multicast domain. For more information, see [DeregisterTransitRouterMulticastGroupSources](~~429776~~) and [DeregisterTransitRouterMulticastGroupMembers](~~429779~~).
      * *   The multicast domain is not added to other multicast domains as a multicast member. If the multicast domain is added to another multicast domain as a multicast member, you must remove the multicast domain from the other multicast domain. For more information, see [DeregisterTransitRouterMulticastGroupMembers](~~429779~~).
      * *   Make sure all the request parameters are valid. If a request parameter is invalid, a request ID is returned after you call the operation, but the multicast domain is not deleted.
      *
     */
    CompletableFuture<DeleteTransitRouterMulticastDomainResponse> deleteTransitRouterMulticastDomain(DeleteTransitRouterMulticastDomainRequest request);

    /**
      * **DeleteTransitRouterPeerAttachment** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call **ListTransitRouterPeerAttachments** to query the status of an inter-region connection.
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
      * *   **DeleteTransitRouterRouteTable** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterRouteTables** operation to query the status of a custom route table.
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
      * *   If a VPC connection is in the **Detaching** state, the VPC connection is being deleted. You can query the VPC connection but cannot perform other operations.
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
      * Before you call the **DeleteTransitRouterVpnAttachment** operation, make sure that all request parameters are valid. If a request parameter is invalid, a **request ID** is returned, but the VPN attachment is not deleted.
      *
     */
    CompletableFuture<DeleteTransitRouterVpnAttachmentResponse> deleteTransitRouterVpnAttachment(DeleteTransitRouterVpnAttachmentRequest request);

    /**
      * `DeregisterTransitRouterMulticastGroupMembers` is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the `ListTransitRouterMulticastGroups` operation to query the status of a multicast member.
      * *   If the multicast member is in the **Deregistering** state, the multicast member is being removed. In this case, you can query the multicast member but cannot perform other operations on the multicast member.
      * *   If a multicast member cannot be found, the multicast member is removed from the multicast group.``
      * Before you call the DeregisterTransitRouterMulticastGroupMembers operation, make sure that all request parameters are valid. If a request parameter is invalid, a request ID is returned but the multicast member is not removed.
      *
     */
    CompletableFuture<DeregisterTransitRouterMulticastGroupMembersResponse> deregisterTransitRouterMulticastGroupMembers(DeregisterTransitRouterMulticastGroupMembersRequest request);

    /**
      * `DeregisterTransitRouterMulticastGroupSources` is an asynchronous operation. After a request a sent, the system returns a **request ID** and runs the task in the background. You can call the `ListTransitRouterMulticastGroups` operation to query the status of a multicast source.
      * *   If a multicast source is in the **Deregistering** state, the multicast source is being deleted. You can query the multicast source but cannot perform other operations.
      * *   If a multicast source cannot be found, the multicast source is deleted.
      * Before you call DeregisterTransitRouterMulticastGroupSources, make sure that all the request parameters are valid. If a request parameter is invalid, a request ID is returned but the multicast source is not deleted.
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

    /**
      * Before you call the **DescribeGrantRulesToCen** operation, make sure that all request parameters are valid. If a request parameter is invalid, a **request ID** is returned, but the network instances are not returned.
      *
     */
    CompletableFuture<DescribeGrantRulesToCenResponse> describeGrantRulesToCen(DescribeGrantRulesToCenRequest request);

    CompletableFuture<DescribeGrantRulesToResourceResponse> describeGrantRulesToResource(DescribeGrantRulesToResourceRequest request);

    CompletableFuture<DescribePublishedRouteEntriesResponse> describePublishedRouteEntries(DescribePublishedRouteEntriesRequest request);

    CompletableFuture<DescribeRouteConflictResponse> describeRouteConflict(DescribeRouteConflictRequest request);

    CompletableFuture<DescribeRouteServicesInCenResponse> describeRouteServicesInCen(DescribeRouteServicesInCenRequest request);

    /**
      * You can set the **TransitRouteTableId** and **TransitRouteTableAggregationCidr** parameters to specify the aggregate routes that you want to query. If you set only the **TransitRouteTableId** parameter, all aggregate routes in the specified route table are queried.
      *
     */
    CompletableFuture<DescribeTransitRouteTableAggregationResponse> describeTransitRouteTableAggregation(DescribeTransitRouteTableAggregationRequest request);

    CompletableFuture<DescribeTransitRouteTableAggregationDetailResponse> describeTransitRouteTableAggregationDetail(DescribeTransitRouteTableAggregationDetailRequest request);

    CompletableFuture<DetachCenChildInstanceResponse> detachCenChildInstance(DetachCenChildInstanceRequest request);

    /**
      * **DisableCenVbrHealthCheck** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **DescribeCenVbrHealthCheck** operation to query the status of health check configurations. If the health check configurations cannot be found, the health check configurations are deleted.
      *
     */
    CompletableFuture<DisableCenVbrHealthCheckResponse> disableCenVbrHealthCheck(DisableCenVbrHealthCheckRequest request);

    /**
      * **DisableTransitRouterRouteTablePropagation** is an synchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterRouteTablePropagations** operation to query the status of a route learning correlation.
      * *   If a route learning correlation is in the **Disabling** state, the route learning correlation is being deleted. You can query the route learning correlation but cannot perform other operations.
      * *   If a route learning correlation cannot be found, the route learning correlation is deleted.
      *
     */
    CompletableFuture<DisableTransitRouterRouteTablePropagationResponse> disableTransitRouterRouteTablePropagation(DisableTransitRouterRouteTablePropagationRequest request);

    /**
      * *   Before you delete a vSwitch from a multicast domain, make sure that the vSwitch does not contain a multicast source or a multicast member. For more information about how to remove a multicast source or member from a vSwitch, see [DeregisterTransitRouterMulticastGroupSources](~~468416~~) and [DeregisterTransitRouterMulticastGroupMembers](~~468409~~).
      * *   If a request parameter is invalid, the system returns a request ID but does not disassociate the vSwitch from the multicast domain.
      * *   **DisassociateTransitRouterMulticastDomain** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterMulticastDomainAssociations** operation to query whether a vSwitch is disassociated from the specified multicast domain.
      *     *   If the status is **Dissociating**, it indicates that the vSwitch is being disassociated from the specified multicast domain. You can query the vSwitch but cannot perform other operations on the vSwitch.
      *     *   If the vSwitch cannot be found, the vSwitch is disassociated from the multicast domain.
      *
     */
    CompletableFuture<DisassociateTransitRouterMulticastDomainResponse> disassociateTransitRouterMulticastDomain(DisassociateTransitRouterMulticastDomainRequest request);

    /**
      * **DissociateTransitRouterAttachmentFromRouteTable** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterRouteTableAssociations** operation to query an associated forwarding correlation between a network instance connection and a route table.
      * *   If an associated forwarding correlation is in the **Dissociating** state, the associated forwarding correlation is being deleted. You can query the associated forwarding correlation but cannot perform other operations.
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
      * After you establish a network instance connection on a transit router, you can create a route learning correlation for the network instance connection. Then, the routes of the connected network instance are automatically advertised to the route table of the transit router. Before you begin, we recommend that you take note of the following rules:
      * *   You can create route learning correlations only on Enterprise Edition transit routers. For more information about the regions and zones that support Enterprise Edition transit routers, see [What is CEN?](~~181681~~)
      * *   **EnableTransitRouterRouteTablePropagation** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterRouteTablePropagations** operation to query the route learning status between a network instance connection and a route table.
      *     *   **Enabling** indicates that a route learning correlation is being created between the network instance connection and route table. You can query the route learning correlation but cannot perform other operations.
      *     *   **Active** indicates that the route learning correlation is created between the network instance connection and route table.
      *
     */
    CompletableFuture<EnableTransitRouterRouteTablePropagationResponse> enableTransitRouterRouteTablePropagation(EnableTransitRouterRouteTablePropagationRequest request);

    /**
      * *   The `GrantInstanceToTransitRouter` operation can be used to grant transit routers permissions on network instances that belong to other Alibaba Cloud accounts, including virtual private clouds (VPCs), virtual border routers (VBRs), IPsec-VPN connections, and Express Connect Router (ECRs).
      *     To grant transit routers permissions on Cloud Connect Network (CCN) instances, call the [GrantInstanceToCbn](~~126141~~) operation.
      * *   Before you call `GrantInstanceToTransitRouter`, take note of the billing rules, permission limits, and prerequisites on permission management of transit routers. For more information, see [Acquire permissions to connect to a network instance that belongs to another account](~~181553~~).
      * *   Before you grant a transit router permissions on a network instance, make sure that the following requirements are met:
      *     The account to which the network instance belongs and the account to which the transit router belongs are of the same type.
      *     The ID of the Alibaba Cloud account to which the transit router belongs is obtained.
      *     The ID of the Cloud Enterprise Network (CEN) instance to which the Enterprise Edition transit router belongs is obtained.
      *     Before you grant a transit router permissions on a VBR, contact your account manager to acquire permissions on the VBR.
      *     Before you grant a transit router permissions on an IPsec-VPN connection, make sure that the IPsec-VPN connection is not associated with a resource.
      *     If the IPsec-VPN connection is attached to a VPN gateway, the IPsec-VPN connection cannot be attached to transit routers within the same account or different accounts.
      *     If the IPsec-VPN connection is attached to a transit router, detach the IPsec-VPN connection from the transit router. For more information, see [Delete a network instance connection](~~181554~~).
      *
     */
    CompletableFuture<GrantInstanceToTransitRouterResponse> grantInstanceToTransitRouter(GrantInstanceToTransitRouterRequest request);

    CompletableFuture<ListCenChildInstanceRouteEntriesToAttachmentResponse> listCenChildInstanceRouteEntriesToAttachment(ListCenChildInstanceRouteEntriesToAttachmentRequest request);

    /**
      * Before you call the **ListCenInterRegionTrafficQosPolicies** operation, take note of the following information:
      * *   You must specify at least one of the **TransitRouterId** and **TrafficQosPolicyId** parameters.
      * *   If you do not specify a QoS policy ID (**TrafficQosPolicyId**), the system returns information based on the values of the **TransitRouterId**, **TransitRouterAttachmentId**, **TrafficQosPolicyName**, and **TrafficQosPolicyDescription** parameters. The information about the queues in the QoS policies is not returned. In this case, the **TrafficQosQueues** parameter is not included in the response.
      * *   If you specify a QoS policy ID (**TrafficQosPolicyId**), the system returns the information about the QoS policy and queues in the QoS policy. In this case, the **TrafficQosQueues** parameter is included in the response. If the value of the **TrafficQosQueues** parameter is an empty string, it indicates that the QoS policy contains only the default queue.
      * *   Make sure that all the request parameters are valid. If a request parameter is invalid, a request ID is returned but the information about the QoS policy is not returned.
      *
     */
    CompletableFuture<ListCenInterRegionTrafficQosPoliciesResponse> listCenInterRegionTrafficQosPolicies(ListCenInterRegionTrafficQosPoliciesRequest request);

    /**
      * You must specify at least one of the **TransitRouterId**, **TrafficQosPolicyId**, and **TrafficQosQueueId** parameters.
      * Make sure that all the request parameters are valid. If a request parameter is invalid, a **request ID** is returned but the QoS queue information is not returned.
      *
     */
    CompletableFuture<ListCenInterRegionTrafficQosQueuesResponse> listCenInterRegionTrafficQosQueues(ListCenInterRegionTrafficQosQueuesRequest request);

    /**
      * Before you call `ListGrantVSwitchEnis`, make sure that the VPC is attached to a Cloud Enterprise Network (CEN) instance. For more information, see [CreateTransitRouterVpcAttachment](~~468237~~).
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
      * Before you call the **ListTrafficMarkingPolicies** operation, take note of the following limits:
      * *   Specify at least one of the **TransitRouterId** and **TrafficMarkingPolicyId** parameters.
      * *   If you do not specify a traffic marking policy ID (**TrafficMarkingPolicyId**), the operation queries only the information about the traffic marking policy based on the **TransitRouterId**, **TrafficMarkingPolicyName**, and **TrafficMarkingPolicyDescription** parameters. The **TrafficMatchRules** parameter that contains the information about the traffic classification rules is not returned.
      * *   If you specify a traffic marking policy ID (**TrafficMarkingPolicyId**), the operation queries the information about the traffic marking policy and traffic classification rules. The **TrafficMatchRules** parameter is returned in the response. If the value of the **TrafficMatchRules** parameter is an empty array, the traffic marking policy does not contain a traffic classification rule.
      *
     */
    CompletableFuture<ListTrafficMarkingPoliciesResponse> listTrafficMarkingPolicies(ListTrafficMarkingPoliciesRequest request);

    /**
      * *   You can call the **ListTransitRouterAvailableResource** operation to query the zones that support Enterprise Edition transit routers in a specified region.
      *     *   If you do not set **SupportMulticast** to **true**, general-purpose zones that support Enterprise Edition transit routers are queried.
      *     *   If you set **SupportMulticast** to **true**, zones in which Enterprise Edition transit routers support multicast are queried.
      * *   On May 31, 2022, VPC-connected Enterprise Edition transit routers were optimized. Optimized Enterprise Edition transit routers do not require you to specify the primary and secondary zones when you connect VPCs to the Enterprise Edition transit routers. You can specify one or more zones.
      *     *   If your Enterprise Edition transit router has not been optimized, you must specify the primary and secondary zones when you connect a VPC to your Enterprise Edition transit router. After you call **ListTransitRouterAvailableResource**, you can call **MasterZones** and **SlaveZones** to query the primary and secondary zones.
      *     *   If your Enterprise Edition transit router has been optimized, you can specify a zone as needed when you connect a VPC to your Enterprise Edition transit router. After you call **ListTransitRouterAvailableResource**, you can call **AvailableZones** to query the zones.
      * For more information about the optimization, see [Announcement: Optimization on VPC-connected Enterprise Edition transit routers](~~434191~~).
      *
     */
    CompletableFuture<ListTransitRouterAvailableResourceResponse> listTransitRouterAvailableResource(ListTransitRouterAvailableResourceRequest request);

    CompletableFuture<ListTransitRouterCidrResponse> listTransitRouterCidr(ListTransitRouterCidrRequest request);

    CompletableFuture<ListTransitRouterCidrAllocationResponse> listTransitRouterCidrAllocation(ListTransitRouterCidrAllocationRequest request);

    /**
      * You can use the following methods to query ECR connection information:
      * *   Specify the ID of an Enterprise Edition transit router.
      * *   Specify the ID of an Enterprise Edition transit router and the ID of the region in which the Enterprise Edition transit router is deployed.
      * *   Configure the **TransitRouterAttachmentId** parameter to specify the ECR connection that you want to query.
      *
     */
    CompletableFuture<ListTransitRouterEcrAttachmentsResponse> listTransitRouterEcrAttachments(ListTransitRouterEcrAttachmentsRequest request);

    /**
      * *   You must set at least **TransitRouterMulticastDomainId** and **TransitRouterAttachmentId**. If you set **TransitRouterAttachmentId**, the information about the vSwitches in a virtual private cloud (VPC) that are associated with a multicast domain is returned. If you set **TransitRouterMulticastDomainId**, the information about the vSwitches that are associated with a multicast domain is returned.
      * *   Before you call **ListTransitRouterMulticastDomainAssociations**, make sure that all the request parameters are valid. If a request parameter is invalid, the system returns a **request ID** but does not return the vSwitches that are associated with the multicast domain.
      *
     */
    CompletableFuture<ListTransitRouterMulticastDomainAssociationsResponse> listTransitRouterMulticastDomainAssociations(ListTransitRouterMulticastDomainAssociationsRequest request);

    CompletableFuture<ListTransitRouterMulticastDomainVSwitchesResponse> listTransitRouterMulticastDomainVSwitches(ListTransitRouterMulticastDomainVSwitchesRequest request);

    /**
      * *   If you configure one of the RegionId and CenId parameters, you must configure the other parameter. Otherwise, no information about the multicast domain is returned. You can configure only one of the TransitRouterId and TransitRouterMulticastDomainId parameters.
      * *   Make sure that all the request parameters are valid. If a request parameter is invalid, a **request ID** is returned but the information about the multicast domain is not returned.
      *
     */
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
      * You can use the following methods to query inter-region connections on an Enterprise Edition transit router:
      * *   Query all inter-region connections on an Enterprise Edition transit router by specifying the ID of the Enterprise Edition transit router.
      * *   Query all inter-region connections on an Enterprise Edition transit router by specifying the ID of the Cloud Enterprise Network (CEN) instance and the ID of the region where the transit router is deployed.
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
      * You can use the following methods to call the ListTransitRouterVpnAttachments operation:
      * *   Specify only the **TransitRouterAttachmentId** parameter to query the information about a VPN attachment.
      * *   Specify only the **TransitRouterId** parameter to query the information about all VPN attachments on a transit router.
      * *   Specify the **CenId** and **RegionId** parameter to query the information about VPN attachments in a specified region.
      * Before you call the **ListTransitRouterVpnAttachments** operation, make sure that all request parameters are valid. If a request parameter is invalid, a **request ID** is returned, but the information about the VPN attachments is not returned.
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
      * `ModifyFlowLogAttribute` is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the `DescribeFlowlogs` operation to query the status of a flow log.
      * *   If a flow log is in the **Modifying** state, the flow log is being modified. In this case, you can query the flow log but cannot perform other operations.
      * *   If a flow log is in the **Active** state, the flow log is modified.
      *
     */
    CompletableFuture<ModifyFlowLogAttributeResponse> modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request);

    /**
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
      * By default, CEN instances and bandwidth plans are in the default resource group. You can call the `MoveResourceGroup` operation to move CEN instances or bandwidth plans to another resource group.
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

    CompletableFuture<RefreshTransitRouteTableAggregationResponse> refreshTransitRouteTableAggregation(RefreshTransitRouteTableAggregationRequest request);

    /**
      * Enterprise Edition transit routers support only elastic network interfaces (ENIs) as multicast members. You can call the `RegisterTransitRouterMulticastGroupMembers` operation to specify an ENI in the current region or a different region as a multicast member.
      * *   If you specify a value for the **NetworkInterfaceIds** parameter, an ENI in the current region is to be specified as a multicast member. Make sure that the ENI and vSwitch are associated with the multicast group. For more information, see [AssociateTransitRouterMulticastDomain](~~429778~~).
      * *   If you specify a value for the **PeerTransitRouterMulticastDomains**, a multicast member in a multicast group that belongs to another region but has the same IP address as the current multicast group is to be specified as a multicast member for the current multicast group. Make sure that an inter-region connection is established between the regions. For more information, see [CreateTransitRouterPeerAttachment](~~261363~~).
      *     For example, you created Multicast Group 1 in Multicast Domain 1, which is in the China (Hangzhou) region. You created Multicast Group 2 in Multicast Domain 2, which is in the China (Shanghai) region. Multicast Group 1 and Multicast Group 2 use the same multicast IP address, and Multicast Member 2 is in Multicast Group 2 in the China (Shanghai) region. If you call the `RegisterTransitRouterMulticastGroupMembers` operation to add multicast members to Multicast Group 1 in the China (Hangzhou) region and set **PeerTransitRouterMulticastDomains** to the ID of Multicast Group 2, which is in the China (Shanghai) region, Multicast Member 2, which is in Multicast Domain 2 in the China (Shanghai) region is added to Multicast Group 1 in the China (Hangzhou) region.
      * *   `RegisterTransitRouterMulticastGroupMembers` is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the `ListTransitRouterMulticastGroups` operation to query the status of a multicast member.
      *     *   If the multicast member is in the **Registering**, the multicast member is being created. In this case, you can query the multicast member but cannot perform other operations on the multicast member.
      *     *   If the multicast member is in the **Registered** state, the multicast member is created.
      *
     */
    CompletableFuture<RegisterTransitRouterMulticastGroupMembersResponse> registerTransitRouterMulticastGroupMembers(RegisterTransitRouterMulticastGroupMembersRequest request);

    /**
      * *   You can specify only elastic network interfaces (ENIs) as multicast sources.
      * *   `RegisterTransitRouterMulticastGroupSources` is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the `ListTransitRouterMulticastGroups` operation to query the status of a multicast source.
      *     *   If a multicast source is in the **Registering** state, the multicast source is being created. You can query the multicast source but cannot perform other operations on the multicast source.
      *     *   If a multicast source is in the **Registered** state, the multicast source is created.
      * ### Prerequisite
      * Before you call `RegisterTransitRouterMulticastGroupSources`, make sure that the vSwitch on which the ENI is created is associated with the multicast domain. For more information, see [AssociateTransitRouterMulticastDomain](~~429778~~).
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
      * ### [](#)Precautions
      * The **RemoveTraficMatchRuleFromTrafficMarkingPolicy** operation is deprecated and will be discontinued soon. If you need to delete traffic classification rules from a traffic marking policy, call the [RemoveTrafficMatchRuleFromTrafficMarkingPolicy](~~452726~~) operation.
      *
     */
    CompletableFuture<RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse> removeTraficMatchRuleFromTrafficMarkingPolicy(RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest request);

    CompletableFuture<ReplaceTransitRouterRouteTableAssociationResponse> replaceTransitRouterRouteTableAssociation(ReplaceTransitRouterRouteTableAssociationRequest request);

    /**
      * Cloud services refer to Alibaba Cloud services that use the 100.64.0.0/10 CIDR block to provide services. These cloud services include Object Storage Service (OSS), Simple Log Service, and Data Transmission Service (DTS). If your on-premises network needs to access a cloud service, you must attach the virtual border router (VBR) or Cloud Connect Network (CCN) instance that is connected to your on-premises network to a Cloud Enterprise Network (CEN) instance. In addition, you must attach a virtual private cloud (VPC) that is deployed in the same region as the cloud service to the CEN instance. This way, your on-premises network can connect to the VPC that is deployed in the same region as the cloud service and access the cloud service through the VPC.
      * *   You can call this operation only for a Basic Edition transit router. An on-premises network associated with a VBR can use CEN to access only a cloud service that is deployed in the same region.
      *     For example, if cloud services are deployed in the China (Beijing) region, only on-premises networks connected to VBRs in the China (Beijing) region can access the cloud services.
      * *   **ResolveAndRouteServiceInCen** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call **DescribeRouteServicesInCen** to query the status of a cloud service.
      *     *   If a cloud service is in the **Creating** state, the connection to the cloud service is being created. In this case, you can query the cloud service but cannot perform other operations.
      *     *   If a cloud service is in the **Active** state, the connection to the cloud service is created.
      *     *   If a cloud service is in the **Failed** state, the connection to the cloud service failed.
      * # [](#)Prerequisites
      * Before you call this operation, make sure that the following conditions are met:
      * *   The VBR or CCN instance to which your on-premises network is connected is attached to a CEN instance.
      * *   A VPC that is deployed in the same region as the cloud service is attached to the CEN instance. For more information, see [AttachCenChildInstance](~~65902~~).
      *
     */
    CompletableFuture<ResolveAndRouteServiceInCenResponse> resolveAndRouteServiceInCen(ResolveAndRouteServiceInCenRequest request);

    /**
      * `RevokeInstanceFromTransitRouter` disallows transit routers only from connecting to virtual private clouds (VPCs), virtual border routers (VBRs), and IPsec-VPN connections.
      * If you want to disallow transit routers from connecting to Cloud Connect Network (CCN) instances, call the [RevokeInstanceFromCbn](~~126142~~) operation.
      * ## [](#)Prerequisite
      * Before you call `RevokeInstanceFromTransitRouter`, you must detach the network instances from the transit router.
      * *   For more information about how to detach VPCs from an Enterprise Edition transit router, see [DeleteTransitRouterVpcAttachment](~~261220~~).
      * *   For more information about how to detach VBRs from an Enterprise Edition transit router, see [DeleteTransitRouterVbrAttachment](~~261223~~).
      * *   For more information about how to detach IPsec-VPN connections from an Enterprise Edition transit router, see [DeleteTransitRouterVpnAttachment](~~443992~~).
      * *   For more information about how to detach network instances from a Basic Edition transit router, see [DetachCenChildInstance](~~65915~~).
      *
     */
    CompletableFuture<RevokeInstanceFromTransitRouterResponse> revokeInstanceFromTransitRouter(RevokeInstanceFromTransitRouterRequest request);

    /**
      * Alibaba Cloud DNS PrivateZone (PrivateZone) is an Alibaba Cloud private domain name resolution and management service based on Virtual Private Cloud (VPC). After you attach virtual border routers (VBRs) and Cloud Connect Network (CCN) instances to a Cloud Enterprise Network (CEN) instance, you can enable the on-premises networks connected to the VBRs and CCN instances to access PrivateZone through the CEN instance. 
      * #### Usage notes
      * - The on-premises networks connected to VBRs or CCN instances must be deployed in the same region as the PrivateZone service. For example, if the PrivateZone service is deployed in the China (Beijing) region, only on-premises networks connected to VBRs or CCN instances in the China (Beijing) region can access the PrivateZone service. 
      * - **RoutePrivateZoneInCenToVpc** is an asynchronous operation. After you send a request, the **request ID** is returned but the operation is still being performed in the system background. You can call **DescribeCenPrivateZoneRoutes** to query the status of PrivateZone. 
      *     - If PrivateZone is in the **Creating** state, access to PrivateZone is being configured. In this case, you can query PrivateZone configurations but cannot perform other operations. 
      *     - If PrivateZone is in the **Active** state, access to PrivateZone is enabled. 
      *     - If PrivateZone is in the **Failed** state, configurations of access to PrivateZone failed. 
      * #### Prerequisites
      * Before you call **RoutePrivateZoneInCenToVpc**, make sure that the following conditions are met:
      * - PrivateZone is deployed. For more information, see [PrivateZone quick start](~~64627~~).
      * - The following network instances are attached to the same CEN instance: the VPC that is associated with the PrivateZone service, and the VBR and CCN instance that want to access the PrivateZone service. For more information, see [AttachCenChildInstance](~~468684~~). 
      * - If your on-premises network uses a CCN instance to connect to Alibaba Cloud and the account that owns the CCN instance is different from the account that owns the VPC or CEN instance, you must grant the CCN instance required permissions. For more information, see [Grant permissions to CCN](~~181654~~).
      *
     */
    CompletableFuture<RoutePrivateZoneInCenToVpcResponse> routePrivateZoneInCenToVpc(RoutePrivateZoneInCenToVpcRequest request);

    /**
      * ### Prerequisites
      * The Cloud Enterprise Network (CEN) instance is associated with a bandwidth plan. For more information, see the [CreateCenBandwidthPackage](~~65919~~) and [AssociateCenBandwidthPackage](~~65934~~) topics.
      * You can call the **SetCenInterRegionBandwidthLimit** operation to configure, modify, or remove the maximum bandwidth value of an inter-region connection.
      * - If you set **BandwidthLimit** to a value other than 0, the maximum bandwidth value of the inter-region connection is set or changed to the specified value.
      * - If you set **BandwidthLimit** to 0, no bandwidth resource is allocated to the inter-region connection.
      *
     */
    CompletableFuture<SetCenInterRegionBandwidthLimitResponse> setCenInterRegionBandwidthLimit(SetCenInterRegionBandwidthLimitRequest request);

    /**
      * *   Each tag consists of a tag key and a tag value. When you add a tag, you must specify the tag key and tag value.
      * *   If you want to add multiple tags to a Cloud Enterprise Network (CEN) instance, each tag key must be unique.
      * *   You can add at most 20 tags to a CEN instance.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<TempUpgradeCenBandwidthPackageSpecResponse> tempUpgradeCenBandwidthPackageSpec(TempUpgradeCenBandwidthPackageSpecRequest request);

    /**
      * No inter-region connections are configured in the bandwidth plan. For more information about how to delete inter-region connections, see [SetCenInterRegionBandwidthLimit](~~65942~~).
      *
     */
    CompletableFuture<UnassociateCenBandwidthPackageResponse> unassociateCenBandwidthPackage(UnassociateCenBandwidthPackageRequest request);

    CompletableFuture<UnroutePrivateZoneInCenToVpcResponse> unroutePrivateZoneInCenToVpc(UnroutePrivateZoneInCenToVpcRequest request);

    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    CompletableFuture<UpdateCenInterRegionTrafficQosPolicyAttributeResponse> updateCenInterRegionTrafficQosPolicyAttribute(UpdateCenInterRegionTrafficQosPolicyAttributeRequest request);

    CompletableFuture<UpdateCenInterRegionTrafficQosQueueAttributeResponse> updateCenInterRegionTrafficQosQueueAttribute(UpdateCenInterRegionTrafficQosQueueAttributeRequest request);

    CompletableFuture<UpdateTrafficMarkingPolicyAttributeResponse> updateTrafficMarkingPolicyAttribute(UpdateTrafficMarkingPolicyAttributeRequest request);

    /**
      * **UpdateTransitRouter** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouters** operation to query the status of a transit router.
      * *   If a transit router is in the **Modifying** state, the configuration of the transit router is being modified. You can query the transit router but cannot perform other operations.
      * *   If a transit router is in the **Active** state, the configuration of the transit router is modified.
      *
     */
    CompletableFuture<UpdateTransitRouterResponse> updateTransitRouter(UpdateTransitRouterRequest request);

    /**
      * UpdateTransitRouterEcrAttachmentAttribute is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of an ECR connection.
      * If an ECR connection is in the Modifying state, the ECR connection is being modified. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection. If an ECR connection is in the Attached state, the ECR connection is modified.
      *
     */
    CompletableFuture<UpdateTransitRouterEcrAttachmentAttributeResponse> updateTransitRouterEcrAttachmentAttribute(UpdateTransitRouterEcrAttachmentAttributeRequest request);

    /**
      * **UpdateTransitRouterPeerAttachmentAttribute** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterPeerAttachments** operation to query the status of an inter-region connection.
      * *   If an inter-region connection is in the **Modifying** state, the inter-region connection is being modified. You can query the inter-region connection but cannot perform other operations.
      * *   If an inter-region connection is in the **Attached** state, the inter-region connection is modified.
      *
     */
    CompletableFuture<UpdateTransitRouterPeerAttachmentAttributeResponse> updateTransitRouterPeerAttachmentAttribute(UpdateTransitRouterPeerAttachmentAttributeRequest request);

    CompletableFuture<UpdateTransitRouterRouteEntryResponse> updateTransitRouterRouteEntry(UpdateTransitRouterRouteEntryRequest request);

    CompletableFuture<UpdateTransitRouterRouteTableResponse> updateTransitRouterRouteTable(UpdateTransitRouterRouteTableRequest request);

    /**
      * **UpdateTransitRouterVbrAttachmentAttribute** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterVbrAttachments** operation to query the status of a VBR connection.
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
