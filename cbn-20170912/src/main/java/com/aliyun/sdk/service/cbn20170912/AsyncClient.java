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
      * *   `ActiveFlowLog` is an asynchronous operation. After you send a request, the system returns a**request ID** and runs the task in the background. You can call the `DescribeFlowlogs` operation to query the status of a flow log.
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
      * The ID of the request.
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
      * After you create a network instance connection on a transit router, you can configure an associated forwarding correlation to associate the network instance connection with a route table. Then, the network instance connection can forward network traffic based on the associated route table. Before you begin, we recommend that you take note of the following rules:
      * *   Only Enterprise Edition transit routers support associated forwarding correlations. For more information about the regions and zones that support Enterprise Edition transit routers, see [Transit routers](~~181681~~).
      * *   **AssociateTransitRouterAttachmentWithRouteTable** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **ListTransitRouterRouteTableAssociations** operation to query the status of an associated forwarding correlation.
      *     *   If an associated forwarding correlation is in the **Associating** state, the associated forwarding correlation is being created. You can query the associated forwarding correlation but cannot perform other operations.
      *     *   If an associated forwarding correlation is in the **Active** state, the associated forwarding correlation is created.
      *
     */
    CompletableFuture<AssociateTransitRouterAttachmentWithRouteTableResponse> associateTransitRouterAttachmentWithRouteTable(AssociateTransitRouterAttachmentWithRouteTableRequest request);

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
      * The description of the CEN instance.
      * The description must be 2 to 256 characters in length. It must start with a letter and cannot start with `http://` or `https://`.
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
      * The ID of the request.
      *
     */
    CompletableFuture<CreateCenInterRegionTrafficQosQueueResponse> createCenInterRegionTrafficQosQueue(CreateCenInterRegionTrafficQosQueueRequest request);

    /**
      * The IDs of the source regions from which routes are evaluated. You can enter at most 32 region IDs.
      * You can call the [DescribeChildInstanceRegions](~~132080~~) operation to query the most recent region list.
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
      * The ID of the request.
      *
     */
    CompletableFuture<CreateTransitRouterResponse> createTransitRouter(CreateTransitRouterRequest request);

    /**
      * The client token that is used to ensure the idempotence of the request.
      * You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.
      * >  If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.
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
      * The name of the inter-region connection.
      * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\\_), and hyphens (-). The name must start with a letter.
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
      * The ID of the request.
      *
     */
    CompletableFuture<CreateTransitRouterRouteEntryResponse> createTransitRouterRouteEntry(CreateTransitRouterRouteEntryRequest request);

    /**
      * The ID of the request.
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
      * DeleteCen
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
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteCenInterRegionTrafficQosPolicyResponse> deleteCenInterRegionTrafficQosPolicy(DeleteCenInterRegionTrafficQosPolicyRequest request);

    /**
      * The ID of the request.
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
      * The response.
      *
     */
    CompletableFuture<DeleteFlowlogResponse> deleteFlowlog(DeleteFlowlogRequest request);

    /**
      * **DeleteRouteServiceInCen** is an asynchronous operation. After you send a request, the system returns a **request ID** and runs the task in the background. You can call the **DescribeRouteServicesInCen** operation to query the status of the connection to a cloud service.
      *     - If a cloud service is in the **Deleting** state, the configuration of the cloud service is being deleted. You can query the configuration but cannot perform other operations. 
      *     - If no configuration of a cloud service can be found, the configuration of the cloud service is deleted.
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

    CompletableFuture<DeleteTransitRouteTableAggregationResponse> deleteTransitRouteTableAggregation(DeleteTransitRouteTableAggregationRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<DeleteTransitRouterResponse> deleteTransitRouter(DeleteTransitRouterRequest request);

    /**
      * The client token that is used to ensure the idempotence of the request.
      * You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.
      * >  If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.
      *
     */
    CompletableFuture<DeleteTransitRouterCidrResponse> deleteTransitRouterCidr(DeleteTransitRouterCidrRequest request);

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
      * # Usage notes
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
      * Before you delete a VPN attachment, make sure that the following requirements are met:
      * *   No associated forwarding correlation is established between the VPN attachment and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see [DissociateTransitRouterAttachmentFromRouteTable](~~260944~~).
      * *   No route learning correlation is established between the VPn attachment and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see [DisableTransitRouterRouteTablePropagation](~~260945~~).
      * *   No route in the route table of the Enterprise Edition transit router points to the VPN attachment. For more information, see [DeleteTransitRouterRouteEntry](~~261240~~).
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
      * The ID of the multicast source.
      * You can create only one multicast source in a multicast group.
      * >  This parameter is required.
      *
     */
    CompletableFuture<DeregisterTransitRouterMulticastGroupSourcesResponse> deregisterTransitRouterMulticastGroupSources(DeregisterTransitRouterMulticastGroupSourcesRequest request);

    CompletableFuture<DescribeCenAttachedChildInstanceAttributeResponse> describeCenAttachedChildInstanceAttribute(DescribeCenAttachedChildInstanceAttributeRequest request);

    /**
      * The time when the network instance was attached to the CEN instance.
      * The time follows the ISO8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.
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
      * The ID of the route table of the Enterprise Edition transit router.
      *
     */
    CompletableFuture<DisableTransitRouterRouteTablePropagationResponse> disableTransitRouterRouteTablePropagation(DisableTransitRouterRouteTablePropagationRequest request);

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
      * The type of the network instance. Valid values:
      * *   **VPC**: VPC
      * *   **ExpressConnect**: VBR
      * *   **VPN**: IPsec-VPN connection
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
      * Indicates whether the ENI is created by a transit router. Valid values:
      * *   **true**: yes
      * *   **false**: no
      * ENIs that are created by transit routers cannot be used as multicast sources or members.
      *
     */
    CompletableFuture<ListGrantVSwitchEnisResponse> listGrantVSwitchEnis(ListGrantVSwitchEnisRequest request);

    /**
      * The ID of the VPC to which the vSwitch belongs.
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

    CompletableFuture<ListTrafficMarkingPoliciesResponse> listTrafficMarkingPolicies(ListTrafficMarkingPoliciesRequest request);

    /**
      * A list of primary zones.
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
      * When you call the **ListTransitRouterVpnAttachments** operation, take note of the following items:
      * *   If you set only **CenId** and **RegionId**, the VPN attachments in the current region are queried.
      * *   If you set **CenId**, **RegionId**, and **TransitRouterAttachmentId**, only the specified VPN attachment is queried.
      * *   If you set **CenId** and **RegionId**, you do not need to set **TransitRouterId**. If you set **TransitRouterId**, you do not need to set **CenId** or **RegionId**.
      *
     */
    CompletableFuture<ListTransitRouterVpnAttachmentsResponse> listTransitRouterVpnAttachments(ListTransitRouterVpnAttachmentsRequest request);

    /**
      * The tag value.
      *
     */
    CompletableFuture<ListTransitRoutersResponse> listTransitRouters(ListTransitRoutersRequest request);

    /**
      * The operation that you want to perform. Set the value to **ModifyCenAttribute**.
      *
     */
    CompletableFuture<ModifyCenAttributeResponse> modifyCenAttribute(ModifyCenAttributeRequest request);

    CompletableFuture<ModifyCenBandwidthPackageAttributeResponse> modifyCenBandwidthPackageAttribute(ModifyCenBandwidthPackageAttributeRequest request);

    CompletableFuture<ModifyCenBandwidthPackageSpecResponse> modifyCenBandwidthPackageSpec(ModifyCenBandwidthPackageSpecRequest request);

    /**
      * The response.
      *
     */
    CompletableFuture<ModifyCenRouteMapResponse> modifyCenRouteMap(ModifyCenRouteMapRequest request);

    CompletableFuture<ModifyFlowLogAttributeResponse> modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request);

    /**
      * The new description of the transit router CIDR block.
      * The description must be 1 to 256 characters in length.
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
      * The ID of the request.
      *
     */
    CompletableFuture<RegisterTransitRouterMulticastGroupMembersResponse> registerTransitRouterMulticastGroupMembers(RegisterTransitRouterMulticastGroupMembersRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<RegisterTransitRouterMulticastGroupSourcesResponse> registerTransitRouterMulticastGroupSources(RegisterTransitRouterMulticastGroupSourcesRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse> removeTrafficMatchRuleFromTrafficMarkingPolicy(RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest request);

    /**
      * @deprecated
      * The ID of the traffic marking policy.
      *
     */
    CompletableFuture<RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse> removeTraficMatchRuleFromTrafficMarkingPolicy(RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest request);

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
      * The operation that you want to perform. Set the value to **RevokeInstanceFromTransitRouter**.
      *
     */
    CompletableFuture<RevokeInstanceFromTransitRouterResponse> revokeInstanceFromTransitRouter(RevokeInstanceFromTransitRouterRequest request);

    /**
      * The ID of the request.
      *
     */
    CompletableFuture<RoutePrivateZoneInCenToVpcResponse> routePrivateZoneInCenToVpc(RoutePrivateZoneInCenToVpcRequest request);

    CompletableFuture<SetCenInterRegionBandwidthLimitResponse> setCenInterRegionBandwidthLimit(SetCenInterRegionBandwidthLimitRequest request);

    /**
      * The ID of the resource.
      * You can enter multiple resource IDs. Valid values of **N**: **1** to **20**.
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
      * The ID of the transit router.
      *
     */
    CompletableFuture<UpdateTransitRouterResponse> updateTransitRouter(UpdateTransitRouterRequest request);

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
      * The ID of the request.
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
