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
     * <b>description</b> :
     * <ul>
     * <li><p>After a flow log is created, it is in the Active state by default. If you stop activate flow log, you can call this operation to restart it.</p>
     * </li>
     * <li><p>The <code>ActiveFlowLog</code> operation is asynchronous. After you call this operation, the system returns a <strong>RequestId</strong>, but activate flow log is not fully activated. The activation task is still running in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of activate flow log.</p>
     * <ul>
     * <li>If activate flow log is in the <strong>Modifying</strong> state, activate flow log is being activated. In this state, you can only perform query operations.</li>
     * <li>If activate flow log is in the <strong>Active</strong> state, activate flow log is activated.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ActiveFlowLog  ActiveFlowLogRequest
     * @return ActiveFlowLogResponse
     */
    CompletableFuture<ActiveFlowLogResponse> activeFlowLog(ActiveFlowLogRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>AddTrafficMatchRuleToTrafficMarkingPolicy</strong> API operation is asynchronous. After you send the request, the system returns a <strong>RequestId</strong>, but the traffic classification rule is not immediately created. The creation task is still running in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> API operation to query the status of the traffic classification rule. </p>
     * <ul>
     * <li>If the traffic classification rule is in the <strong>Creating</strong> state, the rule is being created. In this state, you can only query the rule and cannot perform other operations.</li>
     * <li>If the traffic classification rule is in the <strong>Active</strong> state, the rule is created.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTrafficMatchRuleToTrafficMarkingPolicy  AddTrafficMatchRuleToTrafficMarkingPolicyRequest
     * @return AddTrafficMatchRuleToTrafficMarkingPolicyResponse
     */
    CompletableFuture<AddTrafficMatchRuleToTrafficMarkingPolicyResponse> addTrafficMatchRuleToTrafficMarkingPolicy(AddTrafficMatchRuleToTrafficMarkingPolicyRequest request);

    /**
     * @deprecated OpenAPI AddTraficMatchRuleToTrafficMarkingPolicy is deprecated, please use Cbn::2017-09-12::AddTrafficMatchRuleToTrafficMarkingPolicy instead.  * @description ### Precautions
     * The **AddTraficMatchRuleToTrafficMarkingPolicy** operation is deprecated and will be retired soon. To add a traffic classification rule to a traffic marking policy, use the [AddTrafficMatchRuleToTrafficMarkingPolicy](https://help.aliyun.com/document_detail/427602.html) operation. This API document is no longer maintained.
     * 
     * @param request the request parameters of AddTraficMatchRuleToTrafficMarkingPolicy  AddTraficMatchRuleToTrafficMarkingPolicyRequest
     * @return AddTraficMatchRuleToTrafficMarkingPolicyResponse
     */
    @Deprecated
    CompletableFuture<AddTraficMatchRuleToTrafficMarkingPolicyResponse> addTraficMatchRuleToTrafficMarkingPolicy(AddTraficMatchRuleToTrafficMarkingPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>A CEN instance can be associated with multiple bandwidth plans, but cannot be associated with multiple bandwidth plans for the same connected areas.
     * For example, if a CEN instance is already associated with a bandwidth plan for the connected areas between the Chinese mainland and the Chinese mainland, you cannot associate another bandwidth plan for the same connected areas. However, you can associate a bandwidth plan for the connected areas between the Chinese mainland and North America.</p>
     * 
     * @param request the request parameters of AssociateCenBandwidthPackage  AssociateCenBandwidthPackageRequest
     * @return AssociateCenBandwidthPackageResponse
     */
    CompletableFuture<AssociateCenBandwidthPackageResponse> associateCenBandwidthPackage(AssociateCenBandwidthPackageRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a network instance connection, you must configure the route table association to associate the network instance connection with an Enterprise Edition transit router route table. After the association is established, the Enterprise Edition transit router forwards traffic from the network instance based on the route entry information in the route table. Before you call this operation to create a route table association, take note of the following information:</p>
     * <ul>
     * <li>Only Enterprise Edition transit router route tables support route table associations. For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network?</a>.</li>
     * <li>A network instance connection can be associated with only one Enterprise Edition transit router route table.</li>
     * <li>The <strong>AssociateTransitRouterAttachmentWithRouteTable</strong> operation is asynchronous. After you send the request, the system returns a <strong>RequestId</strong>, but the route table association is not immediately established. The system continues to process the association task in the background. You can call the <strong>ListTransitRouterRouteTableAssociations</strong> operation to query the association status between the network instance connection and the route table.<ul>
     * <li>If the association status is <strong>Associating</strong>, the route table association is being established between the network instance connection and the route table. In this state, you can only query the association status. You cannot perform other operations.</li>
     * <li>If the association status is <strong>Active</strong>, the route table association is successfully established between the network instance connection and the route table.</li>
     * </ul>
     * </li>
     * <li>Before you perform the association operation, make sure that the network instance connection is in the Attached state.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateTransitRouterAttachmentWithRouteTable  AssociateTransitRouterAttachmentWithRouteTableRequest
     * @return AssociateTransitRouterAttachmentWithRouteTableResponse
     */
    CompletableFuture<AssociateTransitRouterAttachmentWithRouteTableResponse> associateTransitRouterAttachmentWithRouteTable(AssociateTransitRouterAttachmentWithRouteTableRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>A vSwitch can be associated with only one multicast domain. Make sure that the vSwitch to be associated is not associated with other multicast domains. To disassociate a vSwitch from a multicast domain, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li><strong>AssociateTransitRouterMulticastDomain</strong> is an asynchronous API operation. After you call this operation, the system returns a <strong>RequestId</strong>, but the vSwitch is not immediately associated with the multicast domain. The association task is running in the background. You can call <strong>ListTransitRouterMulticastDomainAssociations</strong> to query the association status of the vSwitch and the multicast domain.<ul>
     * <li>If the association status is <strong>Associating</strong>, the vSwitch is being associated with the multicast domain. In this state, you can only perform query operations on the vSwitch.</li>
     * <li>If the association status is <strong>Associated</strong>, the vSwitch is associated with the multicast domain.</li>
     * </ul>
     * </li>
     * <li>The VPC to which the vSwitch belongs must be connected to an Enterprise Edition transit router. To create a VPC connection, see <a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateTransitRouterMulticastDomain  AssociateTransitRouterMulticastDomainRequest
     * @return AssociateTransitRouterMulticastDomainResponse
     */
    CompletableFuture<AssociateTransitRouterMulticastDomainResponse> associateTransitRouterMulticastDomain(AssociateTransitRouterMulticastDomainRequest request);

    /**
     * <b>description</b> :
     * <p>CEN supports attaching cross-account network instances. Before attaching a cross-account network instance, the CEN instance must be authorized by the network instance:</p>
     * <ul>
     * <li>To authorize a cross-account VPC instance, see <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</li>
     * <li>To authorize a cross-account CCN instance, see <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a>.</li>
     * <li>The cross-account VBR instance authorization feature is disabled by default. To use this feature, contact your account manager.
     * This operation applies only to CEN instances that do not have an Enterprise Edition transit router. If the specified CEN instance has an Enterprise Edition transit router, the OperationFailed.InvalidTransitRouter error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachCenChildInstance  AttachCenChildInstanceRequest
     * @return AttachCenChildInstanceResponse
     */
    CompletableFuture<AttachCenChildInstanceResponse> attachCenChildInstance(AttachCenChildInstanceRequest request);

    /**
     * @param request the request parameters of CheckTransitRouterService  CheckTransitRouterServiceRequest
     * @return CheckTransitRouterServiceResponse
     */
    CompletableFuture<CheckTransitRouterServiceResponse> checkTransitRouterService(CheckTransitRouterServiceRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>CreateCen</strong> operation is asynchronous. The system first returns a CEN instance ID, but the instance is not yet fully created because the creation task is still running in the background. You can call the <strong>DescribeCens</strong> operation to query the status of the CEN instance. </p>
     * <ul>
     * <li>When the CEN instance is in the <strong>Creating</strong> state, it is being created. In this state, you can only perform query operations on the CEN instance.</li>
     * <li>When the CEN instance is in the <strong>Active</strong> state, it is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCen  CreateCenRequest
     * @return CreateCenResponse
     */
    CompletableFuture<CreateCenResponse> createCen(CreateCenRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you create a bandwidth plan instance, you must specify the connected areas. An area is a collection of regions. Each area contains one or more Alibaba Cloud regions. You can select the connected areas based on the regions that you want to connect. For more information about the relationship between areas and regions, see <a href="https://help.aliyun.com/document_detail/181560.html">Purchase a bandwidth plan</a>.</li>
     * <li>For more information about the billing details of bandwidth plans, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing overview</a>.</li>
     * <li>The <strong>CreateCenBandwidthPackage</strong> operation is asynchronous. The system returns the instance ID of the bandwidth plan before the bandwidth plan is created. The creation node is still running in the background. You can invoke the <strong>DescribeCenBandwidthPackages</strong> operation to query the status of the bandwidth plan. If the bandwidth plan is in the <strong>Idle</strong> or <strong>InUse</strong> state, the bandwidth plan is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenBandwidthPackage  CreateCenBandwidthPackageRequest
     * @return CreateCenBandwidthPackageResponse
     */
    CompletableFuture<CreateCenBandwidthPackageResponse> createCenBandwidthPackage(CreateCenBandwidthPackageRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can add route entries only for virtual private cloud (VPC) instances and virtual border router (VBR) instances connected to an Enterprise Edition transit router.</li>
     * <li>The next hop of the route entry defaults to the <strong>transit router connection</strong> (that is, the network instance connection) and cannot be modified.</li>
     * <li>The <strong>CreateCenChildInstanceRouteEntryToAttachment</strong> operation is asynchronous. After you call the operation, the system returns a <strong>RequestId</strong>, but the route entry is not created yet and the creation task is still running in the background. You can call the <strong>DescribeRouteEntryList</strong> operation of the VPC to query the status of the route entry. <ul>
     * <li>If the route entry is in the <strong>Pending</strong> state, the route entry is being created. In this state, you can only query the route entry and cannot perform other operations.</li>
     * <li>If the route entry is in the <strong>Available</strong> state, the route entry is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenChildInstanceRouteEntryToAttachment  CreateCenChildInstanceRouteEntryToAttachmentRequest
     * @return CreateCenChildInstanceRouteEntryToAttachmentResponse
     */
    CompletableFuture<CreateCenChildInstanceRouteEntryToAttachmentResponse> createCenChildInstanceRouteEntryToAttachment(CreateCenChildInstanceRouteEntryToAttachmentRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>By default, the CreateCenChildInstanceRouteEntryToCen operation is not available. To use this operation, &lt;props=&quot;china&quot;&gt;<a href="https://selfservice.console.aliyun.com/ticket/category/cbn/today">submit a ticket</a>&lt;props=&quot;intl&quot;&gt;<a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>The CreateCenChildInstanceRouteEntryToCen operation does not support adding route entries to network instances in Enterprise Edition transit routers.</li>
     * <li>The next hop of the route entry defaults to the regional gateway of the Cloud Enterprise Network (CEN) and cannot be modified.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenChildInstanceRouteEntryToCen  CreateCenChildInstanceRouteEntryToCenRequest
     * @return CreateCenChildInstanceRouteEntryToCenResponse
     */
    CompletableFuture<CreateCenChildInstanceRouteEntryToCenResponse> createCenChildInstanceRouteEntryToCen(CreateCenChildInstanceRouteEntryToCenRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only inter-region connections of an Enterprise Edition transit router support inter-region traffic QoS policies.</li>
     * <li>The traffic QoS feature applies only to the outbound direction of an Enterprise Edition transit router.
     *    For example, if you create an inter-region connection between the China (Hangzhou) and China (Qingdao) regions and configure the traffic QoS feature for the transit router in the China (Hangzhou) region, the feature guarantees the bandwidth for various services when traffic flows from the China (Hangzhou) region to the China (Qingdao) region. However, the feature does not guarantee the service bandwidth when traffic flows from the China (Qingdao) region to the China (Hangzhou) region.</li>
     * <li>The <strong>CreateCenInterRegionTrafficQosPolicy</strong> operation is asynchronous. After you call this operation, the system returns a traffic QoS policy ID, but the policy is not immediately created. The creation task continues in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the traffic QoS policy. <ul>
     * <li>If the traffic QoS policy is in the <strong>Creating</strong> state, the policy is being created. In this state, you can only query the policy and cannot perform other operations.</li>
     * <li>If the traffic QoS policy is in the <strong>Active</strong> state, the policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you call the <strong>CreateCenInterRegionTrafficQosPolicy</strong> operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>An inter-region connection is created. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.</li>
     * <li>A traffic marking policy is created. For more information, see <a href="https://help.aliyun.com/document_detail/419025.html">CreateTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenInterRegionTrafficQosPolicy  CreateCenInterRegionTrafficQosPolicyRequest
     * @return CreateCenInterRegionTrafficQosPolicyResponse
     */
    CompletableFuture<CreateCenInterRegionTrafficQosPolicyResponse> createCenInterRegionTrafficQosPolicy(CreateCenInterRegionTrafficQosPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>CreateCenInterRegionTrafficQosQueue</strong> operation is asynchronous. The system first returns a queue ID, but the queue is not yet created and the creation task is still running in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the traffic scheduling policy and determine the creation status of the queue. When you query the status, you must specify the <strong>TrafficQosPolicyId</strong> parameter.</p>
     * <ul>
     * <li>If the traffic scheduling policy is in the <strong>Modifying</strong> state, the queue is being created. In this state, you can only perform query operations on the traffic scheduling policy and the queue. You cannot perform other operations.</li>
     * <li>If the traffic scheduling policy is in the <strong>Active</strong> state, the queue is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenInterRegionTrafficQosQueue  CreateCenInterRegionTrafficQosQueueRequest
     * @return CreateCenInterRegionTrafficQosQueueResponse
     */
    CompletableFuture<CreateCenInterRegionTrafficQosQueueResponse> createCenInterRegionTrafficQosQueue(CreateCenInterRegionTrafficQosQueueRequest request);

    /**
     * <b>description</b> :
     * <p>Route maps are sorted by priority. A smaller priority value indicates a higher priority. Each route map is a collection of conditional statements and execution statements. When a policy is executed, routing starts matching conditional statements from the policy with the highest priority. For routing that meets all match conditions, the policy will permit or deny the routing based on the policy action. Modifying the route property is supported for permitted routing. For routing that does not meet all match conditions, the system permits the routing to pass by default. For more information, see <a href="https://help.aliyun.com/document_detail/124157.html">Route map overview</a>.
     * The <code>CreateCenRouteMap</code> operation is asynchronous. After you invoke this operation, the system returns a route map ID, but the route map is not immediately created. The creation node is still running in the background. You can invoke the <code>DescribeCenRouteMaps</code> operation to query the status of the route map.</p>
     * <ul>
     * <li>If the route map is in the <strong>Creating</strong> state, the route map is being created. In this state, you can only execute query operations.</li>
     * <li>If the route map is in the <strong>Active</strong> state, the route map is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenRouteMap  CreateCenRouteMapRequest
     * @return CreateCenRouteMapResponse
     */
    CompletableFuture<CreateCenRouteMapResponse> createCenRouteMap(CreateCenRouteMapRequest request);

    /**
     * <b>description</b> :
     * <p>Flow logs help you capture traffic information transmitted by transit router instances and network instance connections (inter-region connections, VPC connections, VPN connections, ECR connections, and VBR connections). Before you create a flow log, take note of the following items:</p>
     * <ul>
     * <li><p>Only Enterprise Edition transit routers support flow logs.</p>
     * </li>
     * <li><p>For inter-region connections, flow logs capture only outbound traffic from the transit router and do not capture inbound traffic to the transit router.</p>
     * <p>  For example, if an Elastic Compute Service (ECS) instance in the US (Silicon Valley) region accesses an ECS instance in the US (Virginia) region through Cloud Enterprise Network (CEN), after you configure a flow log for the transit router in the US (Virginia) region, you can view the packet information that the ECS instance in the US (Virginia) region sends to the ECS instance in the US (Silicon Valley) region in the Simple Log Service console. However, you cannot view the packet information that the ECS instance in the US (Silicon Valley) region sends to the ECS instance in the US (Virginia) region. To view the packet information that the ECS instance in the US (Silicon Valley) region sends to the ECS instance in the US (Virginia) region, you must also configure a flow log for the transit router in the US (Silicon Valley) region.</p>
     * </li>
     * <li><p>When a flow log captures traffic information for a VPC connection, it captures only the traffic transmitted by the elastic network interfaces (ENIs) of the transit router. To view the traffic transmitted by other ENIs in the VPC, see <a href="https://help.aliyun.com/document_detail/127150.html">Overview of VPC flow logs</a>.</p>
     * </li>
     * <li><p>The <code>CreateFlowlog</code> operation is asynchronous. The system first returns a flow log ID, but the flow log is not yet created. The creation task continues to run in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Creating</strong> state, the flow log is being created. In this state, you can only perform query operations.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you create a flow log for a resource, make sure that you have the relevant resources. For more information about how to create each resource, see:</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2715446.html">CreateTransitRouterEcrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468249.html">CreateTransitRouterVpnAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468243.html">CreateTransitRouterVbrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468270.html">CreateTransitRouterPeerAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/468222.html">CreateTransitRouter</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreateFlowlog  CreateFlowlogRequest
     * @return CreateFlowlogResponse
     */
    CompletableFuture<CreateFlowlogResponse> createFlowlog(CreateFlowlogRequest request);

    /**
     * <b>description</b> :
     * <p>The <code>CreateRouteMap</code> operation is asynchronous. The system first returns a route map ID, but the route map is not yet created. The creation task continues to run in the background. You can call the <code>ListRouteMaps</code> operation to query the status of the route map.</p>
     * <ul>
     * <li>When the route map is in the <strong>Creating</strong> state, the route map is being created. In this state, you can only perform query operations and cannot perform other operations.</li>
     * <li>When the route map is in the <strong>Active</strong> state, the route map is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRouteMap  CreateRouteMapRequest
     * @return CreateRouteMapResponse
     */
    CompletableFuture<CreateRouteMapResponse> createRouteMap(CreateRouteMapRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><code>RouteMapId</code> is a required parameter that specifies the route map to which the new rule belongs.</li>
     * <li><code>Priority</code> is a required parameter. A smaller value indicates a higher priority. Rules within the same route map cannot have duplicate priorities.</li>
     * <li><code>Name</code> and <code>Description</code> are optional parameters used to identify the rule and describe its purpose.</li>
     * <li><code>MatchConditions</code> defines the match conditions for the rule, and <code>SetActions</code> defines the actions to be executed when a route meets all match conditions. Both are passed as JSON strings.</li>
     * <li><code>DryRun</code> is an optional parameter used to precheck the request without actually creating the route map rule.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRouteMapRule  CreateRouteMapRuleRequest
     * @return CreateRouteMapRuleResponse
     */
    CompletableFuture<CreateRouteMapRuleResponse> createRouteMapRule(CreateRouteMapRuleRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Enterprise Edition transit routers support creating traffic marking policies.</li>
     * <li><strong>CreateTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a traffic marking policy ID but the traffic marking policy is not yet created. The system continues to create the traffic marking policy in the background. You can call <strong>ListTrafficMarkingPolicies</strong> to query the status of the traffic marking policy. <ul>
     * <li>If the traffic marking policy is in the <strong>Creating</strong> state, the traffic marking policy is being created. In this state, you can only query the traffic marking policy but cannot perform other operations.</li>
     * <li>If the traffic marking policy is in the <strong>Active</strong> state, the traffic marking policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateTrafficMarkingPolicy  CreateTrafficMarkingPolicyRequest
     * @return CreateTrafficMarkingPolicyResponse
     */
    CompletableFuture<CreateTrafficMarkingPolicyResponse> createTrafficMarkingPolicy(CreateTrafficMarkingPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>After you add an aggregate route to an Enterprise Edition transit router route table, the Enterprise Edition transit router propagates the aggregate route only to the route tables of VPC-connected instances that are associated with the current Enterprise Edition transit router route table and have route synchronization enabled.
     * Before creating an aggregate route, make sure that the following operations are completed. Otherwise, the Enterprise Edition transit router does not propagate the aggregate route to VPC instance route tables:</p>
     * <ul>
     * <li>The VPC instance is associated with the Enterprise Edition transit router route table. For more information, see <a href="https://help.aliyun.com/document_detail/261242.html">AssociateTransitRouterAttachmentWithRouteTable</a>.</li>
     * <li>Route synchronization is enabled for the VPC instance. For more information, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouteTableAggregation  CreateTransitRouteTableAggregationRequest
     * @return CreateTransitRouteTableAggregationResponse
     */
    CompletableFuture<CreateTransitRouteTableAggregationResponse> createTransitRouteTableAggregation(CreateTransitRouteTableAggregationRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke the <strong>CreateTransitRouter</strong> operation to create an Enterprise Edition transit router instance to forward traffic and perform routing. Enterprise Edition transit routers are available only in specific regions. For more information about the supported regions, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network?</a>.</li>
     * <li>The <strong>CreateTransitRouter</strong> operation is asynchronous. After you invoke this operation, the system returns the Enterprise Edition transit router instance ID. However, the instance is not immediately created, and the creation node is still running in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/261219.html">ListTransitRouters</a> operation to query the status of the Enterprise Edition transit router instance.<ul>
     * <li>If the Enterprise Edition transit router instance is in the <strong>Creating</strong> state, the instance is being created. In this state, you can only execute query operations on the instance and cannot perform other operations.</li>
     * <li>If the Enterprise Edition transit router instance is in the <strong>Active</strong> state, the instance is created.</li>
     * </ul>
     * </li>
     * <li>You can create only one transit router instance in each region for a Cloud Enterprise Network (CEN) instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouter  CreateTransitRouterRequest
     * @return CreateTransitRouterResponse
     */
    CompletableFuture<CreateTransitRouterResponse> createTransitRouter(CreateTransitRouterRequest request);

    /**
     * <b>description</b> :
     * <p>A transit router CIDR block is a custom CIDR block that you define for a transit router, similar to a CIDR block used to assign IP addresses to a router loopback interface. Transit router CIDR blocks are used to assign addresses to network instance connections. For more information, see <a href="https://help.aliyun.com/document_detail/462635.html">Transit router CIDR blocks</a>.
     * The <strong>CreateTransitRouterCidr</strong> operation is used only to add a CIDR block to a transit router after the transit router is created.
     * Before you create a transit router CIDR block, take note of the following information:</p>
     * <ul>
     * <li>Only Enterprise Edition transit routers support transit router CIDR blocks.</li>
     * <li>For limits on transit router CIDR blocks, see <a href="https://help.aliyun.com/document_detail/462635.html">Limits on transit router CIDR blocks</a>.</li>
     * <li>A maximum of five CIDR blocks can be configured for a transit router. The subnet mask of each CIDR block must be 16 to 24 bits in length.</li>
     * <li>CIDR blocks that fall within 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 and their subnets are not supported.</li>
     * <li>Each CIDR block cannot conflict with any CIDR block that needs to communicate within the Cloud Enterprise Network (CEN) instance.</li>
     * <li>Each CIDR block must be unique within the same CEN instance.</li>
     * <li>After you add a CIDR block to a transit router, the system automatically reserves three CIDR blocks from the CIDR block when you create the first VPN connection on the transit router. The reserved CIDR blocks are used by the system to create VPN connections in the background. The system assigns IP addresses to IPsec connections from the remaining CIDR blocks.
     *   You can call the <a href="https://help.aliyun.com/document_detail/464173.html">ListTransitRouterCidrAllocation</a> operation to query the CIDR blocks that are reserved by the system or from which IP addresses are allocated.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterCidr  CreateTransitRouterCidrRequest
     * @return CreateTransitRouterCidrResponse
     */
    CompletableFuture<CreateTransitRouterCidrResponse> createTransitRouterCidr(CreateTransitRouterCidrRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Enterprise Edition transit routers support ECR connections.</li>
     * <li>You can create an ECR connection on an Enterprise Edition transit router in one of the following ways: <ul>
     * <li>If you have already created an Enterprise Edition transit router in the target region, you can create an ECR connection by specifying <strong>EcrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong>. </li>
     * <li>If you do not have an Enterprise Edition transit router in the target region, you can create an ECR connection by specifying <strong>EcrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong>. During the creation of the ECR connection, the system performs automatic creation of an Enterprise Edition transit router.</li>
     * </ul>
     * </li>
     * <li>The CreateTransitRouterEcrAttachment operation is asynchronous. The system first returns an ECR connection ID, but the ECR connection is not fully created and the creation node is still running in the background. You can invoke the ListTransitRouterEcrAttachments operation to query the status of the ECR connection. <ul>
     * <li>If the ECR connection is in the <strong>Attaching</strong> state, the ECR connection is being created. In this state, you can only query the ECR connection and cannot execute other operations. </li>
     * <li>If the ECR connection is in the <strong>Attached</strong> state, the ECR connection is created.</li>
     * </ul>
     * </li>
     * <li>After an ECR connection is created, the ECR connection does not establish routing learning or associated forwarding relationships with any Enterprise Edition transit router routing tables by default. 
     * After the ECR connection establishes a <a href="https://help.aliyun.com/document_detail/468300.html">routing learning relationship</a> with an Enterprise Edition transit router routing table, the system automatically propagates routing from the ECR instance to the Enterprise Edition transit router routing table.</li>
     * <li>After an ECR connection is created, the system automatically propagates routing from the associated Enterprise Edition transit router routing table to the routing table of the ECR instance.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>The Alibaba Cloud account to which the Enterprise Edition transit router belongs and the Alibaba Cloud account to which the ECR instance belongs must belong to the same enterprise. </li>
     * <li>Enterprise Edition transit routers support connections to ECR instances within the same account or across accounts. Before you create a cross-account ECR connection, obtain authorization for the cross-account ECR instance. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Grant permissions on cross-account network instances</a>.</li>
     * <li><strong>Before you invoke this operation to create an ECR connection, invoke the <a href="https://help.aliyun.com/document_detail/2712082.html">CreateExpressConnectRouterAssociation</a> operation to associate the ECR instance with the Enterprise Edition transit router instance.</strong>
     * <strong>When you invoke the DeleteTransitRouterEcrAttachment operation to force delete an ECR connection, the system also deletes the association between the ECR instance and the Enterprise Edition transit router instance. You do not need to delete the association separately.</strong></li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterEcrAttachment  CreateTransitRouterEcrAttachmentRequest
     * @return CreateTransitRouterEcrAttachmentResponse
     */
    CompletableFuture<CreateTransitRouterEcrAttachmentResponse> createTransitRouterEcrAttachment(CreateTransitRouterEcrAttachmentRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following information:</p>
     * <ul>
     * <li>Make sure that you have created an Enterprise Edition transit router in the region where you want to establish the multicast network, and enabled the multicast feature for the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/261169.html">CreateTransitRouter</a>.
     *   If you have already created an Enterprise Edition transit router instance before applying for multicast resources, the multicast feature cannot be enabled for the instance. You can delete the current Enterprise Edition transit router instance and create a new one. For more information about how to delete an Enterprise Edition transit router instance, see <a href="https://help.aliyun.com/document_detail/261218.html">DeleteTransitRouter</a>.</li>
     * <li>When you call the <strong>CreateTransitRouterMulticastDomain</strong> operation, if you specify the <strong>CenId</strong> and <strong>RegionId</strong> parameters, you do not need to specify the <strong>TransitRouterId</strong> parameter. If you specify the <strong>TransitRouterId</strong> parameter, you do not need to specify the <strong>CenId</strong> and <strong>RegionId</strong> parameters.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterMulticastDomain  CreateTransitRouterMulticastDomainRequest
     * @return CreateTransitRouterMulticastDomainResponse
     */
    CompletableFuture<CreateTransitRouterMulticastDomainResponse> createTransitRouterMulticastDomain(CreateTransitRouterMulticastDomainRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Enterprise Edition transit routers support the following two bandwidth allocation methods:<ul>
     * <li><strong>Allocate from bandwidth package</strong>:
     * To use this method, you must first purchase a bandwidth package and allocate bandwidth from the bandwidth package to the inter-region connection. For more information about how to purchase a bandwidth package, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a>.</li>
     * <li><strong>Pay-by-data-transfer</strong>:
     * To use this method, you must set a bandwidth limit for the inter-region connection. The system charges you based on the actual traffic of the inter-region connection. For more information about billing, see <a href="https://help.aliyun.com/document_detail/337827.html">Inter-region data transfer</a>.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTransitRouterPeerAttachment</strong> is an asynchronous operation. After you send a request, the system returns an inter-region connection ID, but the inter-region connection is not yet created. The creation task still runs in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of the inter-region connection.<ul>
     * <li>If the inter-region connection is in the <strong>Attaching</strong> state, the inter-region connection is being created. In this state, you can only query the inter-region connection but cannot perform other operations on it.</li>
     * <li>If the inter-region connection is in the <strong>Attached</strong> state, the inter-region connection is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterPeerAttachment  CreateTransitRouterPeerAttachmentRequest
     * @return CreateTransitRouterPeerAttachmentResponse
     */
    CompletableFuture<CreateTransitRouterPeerAttachmentResponse> createTransitRouterPeerAttachment(CreateTransitRouterPeerAttachmentRequest request);

    /**
     * <b>description</b> :
     * <p>Before you associate a prefix list with an Enterprise Edition transit router route table, make sure that the following conditions are met:</p>
     * <ul>
     * <li>You have learned about the limits and routing compatibility information of prefix lists. For more information, see <a href="https://help.aliyun.com/document_detail/445605.html">Prefix lists</a>.</li>
     * <li>You have created a prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/437367.html">CreateVpcPrefixList</a>.</li>
     * <li>If you want to associate a cross-account prefix list with an Enterprise Edition transit router route table, make sure that the prefix list has been shared with the Alibaba Cloud account that owns the Enterprise Edition transit router route table. For more information about how to share a prefix list, see <a href="https://help.aliyun.com/document_detail/160622.html">Overview of resource sharing</a> and <a href="https://help.aliyun.com/document_detail/193445.html">API reference (Resource Sharing)</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterPrefixListAssociation  CreateTransitRouterPrefixListAssociationRequest
     * @return CreateTransitRouterPrefixListAssociationResponse
     */
    CompletableFuture<CreateTransitRouterPrefixListAssociationResponse> createTransitRouterPrefixListAssociation(CreateTransitRouterPrefixListAssociationRequest request);

    /**
     * <b>description</b> :
     * <p><em>CreateTransitRouterRouteEntry</em>* is an asynchronous operation. After you send a request, the system returns a route entry ID but the route entry is not yet created. The creation task continues to run in the background. You can call <strong>ListTransitRouterRouteEntries</strong> to query the status of the route entry. </p>
     * <ul>
     * <li>If the route entry is in the <strong>Creating</strong> state, the route entry is being created. In this state, you can only query the route entry. You cannot perform other operations on the route entry.</li>
     * <li>If the route entry is in the <strong>Active</strong> state, the route entry is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterRouteEntry  CreateTransitRouterRouteEntryRequest
     * @return CreateTransitRouterRouteEntryResponse
     */
    CompletableFuture<CreateTransitRouterRouteEntryResponse> createTransitRouterRouteEntry(CreateTransitRouterRouteEntryRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Enterprise Edition transit routers support custom route tables. For information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a>.</li>
     * <li><strong>CreateTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a route table ID but the route table is not yet created. The system continues to create the route table in the background. You can call <strong>ListTransitRouterRouteTables</strong> to query the status of the route table.<ul>
     * <li>If the route table is in the <strong>Creating</strong> state, the route table is being created. In this state, you can only perform query operations.</li>
     * <li>If the route table is in the <strong>Active</strong> state, the route table is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterRouteTable  CreateTransitRouterRouteTableRequest
     * @return CreateTransitRouterRouteTableResponse
     */
    CompletableFuture<CreateTransitRouterRouteTableResponse> createTransitRouterRouteTable(CreateTransitRouterRouteTableRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the regions and zones supported by Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network?</a>.</li>
     * <li>You can create a VBR connection on an Enterprise Edition transit router by using one of the following methods:<ul>
     * <li>If you have already created an Enterprise Edition transit router instance that can forward and perform routing in the target region, you can create a VBR connection by specifying <strong>VbrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong>.</li>
     * <li>If you have not created an Enterprise Edition transit router instance in the target region, you can create a VBR connection by specifying <strong>VbrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong>. The system performs automatic creation of an Enterprise Edition transit router instance that can forward and perform routing when the VBR connection is created.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTransitRouterVbrAttachment</strong> is an asynchronous operation. The system returns a VBR connection ID, but the VBR connection is not yet created and the creation task is still running in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of the VBR connection.<ul>
     * <li>If the VBR connection is in the <strong>Attaching</strong> state, the VBR connection is being created. In this state, you can only query the VBR connection and cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is created.</li>
     * </ul>
     * </li>
     * <li>The Alibaba Cloud account to which the transit router belongs and the Alibaba Cloud account to which the VBR belongs must belong to the same enterprise.</li>
     * <li>Transit routers support connecting VBRs within the same account and across accounts. Before creating a cross-account VBR connection, obtain authorization for the cross-account VBR. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Grant permissions on cross-account network instances</a>.</li>
     * <li>After a VBR connection is created, the VBR connection does not establish route learning or associated forwarding relationships with any transit router route tables by default.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterVbrAttachment  CreateTransitRouterVbrAttachmentRequest
     * @return CreateTransitRouterVbrAttachmentResponse
     */
    CompletableFuture<CreateTransitRouterVbrAttachmentResponse> createTransitRouterVbrAttachment(CreateTransitRouterVbrAttachmentRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create a VPC attachment for an Enterprise Edition transit router in two ways:<ul>
     * <li>If you have already created an Enterprise Edition transit router instance in the target region, specify <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>TransitRouterId</strong>, and <strong>RegionId</strong> to create the VPC attachment.</li>
     * <li>If you have not created an Enterprise Edition transit router instance in the target region, specify <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong> to create the VPC attachment. The system uses automatic creation to create an Enterprise Edition transit router instance when you create the VPC attachment.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTransitRouterVpcAttachment</strong> is an asynchronous operation. The system returns a VPC attachment ID before the VPC attachment is created. The creation task runs in the background. Call <a href="https://help.aliyun.com/document_detail/261222.html">ListTransitRouterVpcAttachments</a> to query the status of the VPC attachment.<ul>
     * <li>When the VPC attachment is in the <strong>Attaching</strong> state, the VPC attachment is being created. In this state, you can only query the VPC attachment and cannot execute other operations.</li>
     * <li>When the VPC attachment is in the <strong>Attached</strong> state, the VPC attachment is created.</li>
     * </ul>
     * </li>
     * <li>After a VPC attachment is created, it does not associate with any transit router route table for route learning relationships or forwarding relationships by default.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you call this operation to create a VPC attachment, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The VPC instance has at least one vSwitch instance with at least one available IP address in a zone supported by the Enterprise Edition transit router. For information about the regions and zones supported by Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">Regions and zones supported by Enterprise Edition transit routers</a>.</li>
     * <li>If you want to attach a VPC-connected instance that belongs to a different account, obtain cross-account authorization first. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Cross-account VPC-connected instance authorization</a>.</li>
     * <li>Creating a VPC attachment incurs fees. Make sure that you understand the billing rules. For more information, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterVpcAttachment  CreateTransitRouterVpcAttachmentRequest
     * @return CreateTransitRouterVpcAttachmentResponse
     */
    CompletableFuture<CreateTransitRouterVpcAttachmentResponse> createTransitRouterVpcAttachment(CreateTransitRouterVpcAttachmentRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>After a VPN connection is created, the VPN connection does not establish route learning or association forwarding relationships with any transit router route table by default.</li>
     * <li>When you call the <code>CreateTransitRouterVpnAttachment</code> operation, if you specify values for the <strong>CenId</strong> and <strong>RegionId</strong> parameters, you do not need to specify the <strong>TransitRouterId</strong> parameter. If you specify values for the <strong>TransitRouterId</strong> and <strong>RegionId</strong> parameters, you do not need to specify the <strong>CenId</strong> parameter.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Before you create a VPN connection, make sure that you have created an IPsec connection in the region where the transit router instance resides and that the IPsec connection is not bindeded to any resource. For more information, see <a href="https://help.aliyun.com/document_detail/442455.html">CreateVpnAttachment</a>.</li>
     * <li>If the transit router instance needs to connect to an IPsec connection that belongs to a different Alibaba Cloud account, make sure that the IPsec connection has been authorized to the transit router instance. For more information, see <a href="https://help.aliyun.com/document_detail/417520.html">GrantInstanceToTransitRouter</a>.</li>
     * <li>Before you create a VPN connection, make sure that you have configured the TR CIDR block for the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/468230.html">CreateTransitRouterCidr</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterVpnAttachment  CreateTransitRouterVpnAttachmentRequest
     * @return CreateTransitRouterVpnAttachmentResponse
     */
    CompletableFuture<CreateTransitRouterVpnAttachmentResponse> createTransitRouterVpnAttachment(CreateTransitRouterVpnAttachmentRequest request);

    /**
     * <b>description</b> :
     * <p>The <code>DeactiveFlowLog</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the flow log is not completely deactivated. The deactivation task continues to run in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Modifying</strong> state, the flow log is being deactivated. In this state, you can only perform query operations.</li>
     * <li>If the flow log is in the <strong>Inactive</strong> state, the flow log is deactivated.</li>
     * </ul>
     * 
     * @param request the request parameters of DeactiveFlowLog  DeactiveFlowLogRequest
     * @return DeactiveFlowLogResponse
     */
    CompletableFuture<DeactiveFlowLogResponse> deactiveFlowLog(DeactiveFlowLogRequest request);

    /**
     * <b>description</b> :
     * <p><em>DeleteCen</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the CEN instance is not yet deleted. The deletion task continues to run in the background. You can call the <strong>DescribeCens</strong> operation to query the status of the CEN instance. </p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Deleting</strong> state, the CEN instance is being deleted. In this state, you can only query the CEN instance. You cannot perform other operations on it.</li>
     * <li>If the CEN instance cannot be found, the CEN instance is deleted.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you delete a CEN instance, make sure that no bandwidth plans exist under the CEN instance, and that no network instance connections or custom route tables exist under the transit routers of the CEN instance:</p>
     * <ul>
     * <li>To delete network instance connections, see:<ul>
     * <li><a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a><blockquote>
     * <p>To delete network instance connections under a Basic Edition transit router, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>To delete custom route tables of an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</li>
     * <li>To disassociate a bandwidth plan from a CEN instance, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCen  DeleteCenRequest
     * @return DeleteCenResponse
     */
    CompletableFuture<DeleteCenResponse> deleteCen(DeleteCenRequest request);

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Before you delete a bandwidth plan instance, make sure that the bandwidth plan instance is disassociated from the Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
     * <li>To delete a bandwidth plan instance whose billing method is PREPAY (subscription), go to the <a href="https://usercenter2.aliyun.com/refund/refund">Order Center</a> to unsubscribe. If you have questions about unsubscription, see <a href="https://www.alibabacloud.com/help/en/user-center/user-guide/unsubscription-rules#p-1qo-3ce-m7z">Unsubscription rules</a>. This operation does not support deleting subscription bandwidth plan instances.
     * &lt;props=&quot;intl&quot;&gt;
     * Before you delete a bandwidth plan instance, make sure that the bandwidth plan instance is disassociated from the Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCenBandwidthPackage  DeleteCenBandwidthPackageRequest
     * @return DeleteCenBandwidthPackageResponse
     */
    CompletableFuture<DeleteCenBandwidthPackageResponse> deleteCenBandwidthPackage(DeleteCenBandwidthPackageRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only route entries whose next hop is a <strong>transit router connection</strong> (network instance connection) in Virtual Private Cloud (VPC) instances and Virtual Border Router (VBR) instances can be deleted.</li>
     * <li><strong>DeleteCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the route entry is not yet deleted. The deletion task runs in the background. You can call the <strong>DescribeRouteEntryList</strong> operation of VPC to query the status of the route entry. <ul>
     * <li>If the route entry is in the <strong>Deleting</strong> state, the route entry is being deleted. In this state, you can only query the route entry but cannot perform other operations on it.</li>
     * <li>If the specified route entry cannot be found, the route entry is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCenChildInstanceRouteEntryToAttachment  DeleteCenChildInstanceRouteEntryToAttachmentRequest
     * @return DeleteCenChildInstanceRouteEntryToAttachmentResponse
     */
    CompletableFuture<DeleteCenChildInstanceRouteEntryToAttachmentResponse> deleteCenChildInstanceRouteEntryToAttachment(DeleteCenChildInstanceRouteEntryToAttachmentRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The DeleteCenChildInstanceRouteEntryToCen operation is not available by default. To use this operation, &lt;props=&quot;china&quot;&gt;<a href="https://selfservice.console.aliyun.com/ticket/category/cbn/today">submit a ticket</a>&lt;props=&quot;intl&quot;&gt;<a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>The DeleteCenChildInstanceRouteEntryToCen operation does not support deleting route entries from network instances attached to an Enterprise Edition transit router.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCenChildInstanceRouteEntryToCen  DeleteCenChildInstanceRouteEntryToCenRequest
     * @return DeleteCenChildInstanceRouteEntryToCenResponse
     */
    CompletableFuture<DeleteCenChildInstanceRouteEntryToCenResponse> deleteCenChildInstanceRouteEntryToCen(DeleteCenChildInstanceRouteEntryToCenRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you delete a traffic scheduling policy, you must delete all queues except the default queue from the traffic scheduling policy. For more information, see <a href="https://help.aliyun.com/document_detail/419062.html">DeleteCenInterRegionTrafficQosQueue</a>.</li>
     * <li><strong>DeleteCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the traffic scheduling policy is not yet deleted. The deletion task runs in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the traffic scheduling policy. <ul>
     * <li>If the traffic scheduling policy is in the <strong>Deleting</strong> state, the traffic scheduling policy is being deleted. In this state, you can only query the traffic scheduling policy but cannot perform other operations on it.</li>
     * <li>If the traffic scheduling policy cannot be found, the traffic scheduling policy is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCenInterRegionTrafficQosPolicy  DeleteCenInterRegionTrafficQosPolicyRequest
     * @return DeleteCenInterRegionTrafficQosPolicyResponse
     */
    CompletableFuture<DeleteCenInterRegionTrafficQosPolicyResponse> deleteCenInterRegionTrafficQosPolicy(DeleteCenInterRegionTrafficQosPolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The default queue cannot be deleted.</li>
     * <li><strong>DeleteCenInterRegionTrafficQosQueue</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the queue is not yet deleted because the deletion task is still running in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the queue information. If the specified queue cannot be found, the queue is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCenInterRegionTrafficQosQueue  DeleteCenInterRegionTrafficQosQueueRequest
     * @return DeleteCenInterRegionTrafficQosQueueResponse
     */
    CompletableFuture<DeleteCenInterRegionTrafficQosQueueResponse> deleteCenInterRegionTrafficQosQueue(DeleteCenInterRegionTrafficQosQueueRequest request);

    /**
     * <b>description</b> :
     * <p>DeleteCenRouteMap is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the routing policy is not yet fully deleted because the deletion task is still running in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of the routing policy.</p>
     * <ul>
     * <li>If the routing policy is in the <strong>Deleting</strong> state, the routing policy is being deleted. In this state, you can only perform query operations.</li>
     * <li>If the routing policy cannot be found by calling the <code>DescribeCenRouteMaps</code> operation, the routing policy is fully deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteCenRouteMap  DeleteCenRouteMapRequest
     * @return DeleteCenRouteMapResponse
     */
    CompletableFuture<DeleteCenRouteMapResponse> deleteCenRouteMap(DeleteCenRouteMapRequest request);

    /**
     * <b>description</b> :
     * <p>The <code>DeleteFlowlog</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the flow log is not completely deleted. The deletion task continues to run in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Deleting</strong> state, the flow log is being deleted. In this state, you can only perform query operations but cannot perform other operations.</li>
     * <li>If the <code>DescribeFlowlogs</code> operation cannot find the flow log, the flow log is completely deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFlowlog  DeleteFlowlogRequest
     * @return DeleteFlowlogResponse
     */
    CompletableFuture<DeleteFlowlogResponse> deleteFlowlog(DeleteFlowlogRequest request);

    /**
     * <b>description</b> :
     * <p>If the route map to be deleted is still associated with any resources, this operation fails.
     * If route map rules exist under the route map, this operation is not supported.
     * The DeleteRouteMap operation is asynchronous. The system returns a <strong>RequestId</strong>, but the route map is not completely deleted. The deletion task continues in the background. You can call the ListRouteMaps operation to query the status of the route map.</p>
     * <ul>
     * <li>If the route map is in the <strong>Deleting</strong> state, the route map is being deleted. In this state, you can only perform query operations.</li>
     * <li>If the route map cannot be queried by using the ListRouteMaps operation, the route map is completely deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRouteMap  DeleteRouteMapRequest
     * @return DeleteRouteMapResponse
     */
    CompletableFuture<DeleteRouteMapResponse> deleteRouteMap(DeleteRouteMapRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation deletes an existing route map rule.</li>
     * <li>If the rule to be deleted is still associated with any resources, this operation fails.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRouteMapRule  DeleteRouteMapRuleRequest
     * @return DeleteRouteMapRuleResponse
     */
    CompletableFuture<DeleteRouteMapRuleResponse> deleteRouteMapRule(DeleteRouteMapRuleRequest request);

    /**
     * <b>description</b> :
     * <p><em>DeleteRouteServiceInCen</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the operation continues in the background. The system returns a request ID even if you specify an invalid parameter. In this case, the Alibaba Cloud service configuration is not deleted. You can call the <strong>DescribeRouteServicesInCen</strong> operation to query the status of the Alibaba Cloud service.</p>
     * <ul>
     * <li>If the Alibaba Cloud service is in the <strong>Deleting</strong> state, you can only query its configuration. You cannot perform other operations.</li>
     * <li>If the specified Alibaba Cloud service configuration is not found, the configuration has been deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRouteServiceInCen  DeleteRouteServiceInCenRequest
     * @return DeleteRouteServiceInCenResponse
     */
    CompletableFuture<DeleteRouteServiceInCenResponse> deleteRouteServiceInCen(DeleteRouteServiceInCenRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the traffic marking policy is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTrafficMarkingPolicies</strong> to query the status of the traffic marking policy. <ul>
     * <li>If the traffic marking policy is in the <strong>Deleting</strong> state, the traffic marking policy is being deleted. In this state, you can only query the traffic marking policy but cannot perform other operations on it.</li>
     * <li>If the specified traffic marking policy cannot be found, the traffic marking policy is deleted.</li>
     * </ul>
     * </li>
     * <li>Before you delete a traffic marking policy, delete all traffic classification rules from the traffic marking policy. For more information, see <a href="https://help.aliyun.com/document_detail/468330.html">RemoveTrafficMatchRuleFromTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTrafficMarkingPolicy  DeleteTrafficMarkingPolicyRequest
     * @return DeleteTrafficMarkingPolicyResponse
     */
    CompletableFuture<DeleteTrafficMarkingPolicyResponse> deleteTrafficMarkingPolicy(DeleteTrafficMarkingPolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you delete an aggregate route, make sure that redundant routes exist in the current network. Otherwise, service breaks may occur.</li>
     * <li>After you delete an aggregate route, the system automatically withdraws the aggregate routing that has been propagated to Virtual Private Cloud (VPC)-connected instances and re-propagates the specific routes within the destination CIDR block of the aggregation route to the VPC-connected instances.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTransitRouteTableAggregation  DeleteTransitRouteTableAggregationRequest
     * @return DeleteTransitRouteTableAggregationResponse
     */
    CompletableFuture<DeleteTransitRouteTableAggregationResponse> deleteTransitRouteTableAggregation(DeleteTransitRouteTableAggregationRequest request);

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouter</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the transit router instance is not immediately deleted. The deletion task runs in the background. You can call the <strong>ListTransitRouters</strong> operation to query the status of the transit router instance. </p>
     * <ul>
     * <li>If the transit router instance is in the <strong>Deleting</strong> state, the transit router instance is being deleted. In this state, you can only query the transit router instance but cannot perform other operations on it.</li>
     * <li>If the transit router instance cannot be found, the transit router instance is deleted.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you delete a transit router instance, make sure that the following conditions are met:</p>
     * <ul>
     * <li>No connections exist on the transit router instance.<ul>
     * <li>To delete a virtual private cloud (VPC) connection, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>.</li>
     * <li>To delete an Express Connect Router (ECR) connection, see <a href="https://help.aliyun.com/document_detail/2715447.html">DeleteTransitRouterEcrAttachment</a>.</li>
     * <li>To delete a Cloud Connect Network (CCN) connection, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</li>
     * <li>To delete a VPN connection, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>To delete an inter-region connection, see <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a>.</li>
     * <li>To delete a virtual border router (VBR) connection, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>.</li>
     * </ul>
     * </li>
     * <li>No custom route tables exist on the transit router instance. For more information, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</li>
     * <li>No custom route entries, route prefixes, or aggregate routes exist in the default route table of the transit router instance. For more information, see:<ul>
     * <li>To delete custom route entries of an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/468291.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>To disassociate a prefix list, see <a href="https://help.aliyun.com/document_detail/468312.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
     * <li>To delete an aggregate route, see <a href="https://help.aliyun.com/document_detail/476070.html">DeleteTransitRouteTableAggregation</a>.</li>
     * </ul>
     * </li>
     * <li>No multicast domains exist on the transit router instance. To delete a multicast domain, see <a href="https://help.aliyun.com/document_detail/468386.html">DeleteTransitRouterMulticastDomain</a>.</li>
     * <li>No traffic marking policies exist on the transit router instance. To delete a traffic marking policy, see <a href="https://help.aliyun.com/document_detail/468324.html">DeleteTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTransitRouter  DeleteTransitRouterRequest
     * @return DeleteTransitRouterResponse
     */
    CompletableFuture<DeleteTransitRouterResponse> deleteTransitRouter(DeleteTransitRouterRequest request);

    /**
     * <b>description</b> :
     * <p>A transit router CIDR block that has allocated IP addresses cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteTransitRouterCidr  DeleteTransitRouterCidrRequest
     * @return DeleteTransitRouterCidrResponse
     */
    CompletableFuture<DeleteTransitRouterCidrResponse> deleteTransitRouterCidr(DeleteTransitRouterCidrRequest request);

    /**
     * <b>description</b> :
     * <p>DeleteTransitRouterEcrAttachment is an asynchronous operation. After you call this operation, the system returns a RequestId, but the ECR connection is not immediately deleted. The deletion task runs in the background. You can call the <a href="~~2361China~~">ListTransitRouterEcrAttachments</a> operation to query the status of the ECR connection.
     * If the ECR connection is in the <strong>Detaching</strong> state, the ECR connection is being deleted. In this state, you can only query the ECR connection but cannot perform other operations on it.
     * If the specified ECR connection cannot be found, the ECR connection is deleted.
     * When you call the DeleteTransitRouterEcrAttachment operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not delete the ECR connection from the Enterprise Edition transit router.</p>
     * 
     * @param request the request parameters of DeleteTransitRouterEcrAttachment  DeleteTransitRouterEcrAttachmentRequest
     * @return DeleteTransitRouterEcrAttachmentResponse
     */
    CompletableFuture<DeleteTransitRouterEcrAttachmentResponse> deleteTransitRouterEcrAttachment(DeleteTransitRouterEcrAttachmentRequest request);

    /**
     * <b>description</b> :
     * <p>Before you delete a multicast domain, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The multicast domain is not associated with any vSwitches. For more information, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li>No multicast sources or multicast members exist in the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429776.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>The multicast domain is not associated with other multicast domains as a multicast member. You can delete the multicast member from other multicast domains to dissociate the other multicast domains from the current multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>Make sure that the parameter values you specify are valid when you call this operation. If you specify invalid parameter values, the system still returns a RequestId but does not delete the multicast domain.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTransitRouterMulticastDomain  DeleteTransitRouterMulticastDomainRequest
     * @return DeleteTransitRouterMulticastDomainResponse
     */
    CompletableFuture<DeleteTransitRouterMulticastDomainResponse> deleteTransitRouterMulticastDomain(DeleteTransitRouterMulticastDomainRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>DeleteTransitRouterPeerAttachment</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the inter-region connection is not immediately deleted. The deletion task continues to run in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of the inter-region connection.</p>
     * <ul>
     * <li>If the inter-region connection is in the <strong>Detaching</strong> state, the inter-region connection is being deleted. In this state, you can only query the inter-region connection but cannot perform other operations on it.</li>
     * <li>If the specified inter-region connection cannot be found, the inter-region connection is deleted.
     * When calling the <strong>DeleteTransitRouterPeerAttachment</strong> operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a <strong>RequestId</strong> but does not delete the inter-region connection from the Enterprise Edition transit router.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTransitRouterPeerAttachment  DeleteTransitRouterPeerAttachmentRequest
     * @return DeleteTransitRouterPeerAttachmentResponse
     */
    CompletableFuture<DeleteTransitRouterPeerAttachmentResponse> deleteTransitRouterPeerAttachment(DeleteTransitRouterPeerAttachmentRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: After a prefix list is dissociated from an Enterprise Edition transit router route table, the system automatically withdraws all route entries related to the prefix list from the Enterprise Edition transit router route table. Before dissociating the prefix list, make sure that redundant routes exist in the Enterprise Edition transit router route table. Otherwise, network interruptions may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteTransitRouterPrefixListAssociation  DeleteTransitRouterPrefixListAssociationRequest
     * @return DeleteTransitRouterPrefixListAssociationResponse
     */
    CompletableFuture<DeleteTransitRouterPrefixListAssociationResponse> deleteTransitRouterPrefixListAssociation(DeleteTransitRouterPrefixListAssociationRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation to delete a route entry, take note of the following information:</p>
     * <ul>
     * <li>If you specify <strong>TransitRouterRouteEntryId</strong> to delete a route entry, you do not need to specify <strong>TransitRouterRouteTableId</strong> or <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>. Otherwise, a parameter conflict error occurs.</li>
     * <li>If you do not specify <strong>TransitRouterRouteEntryId</strong> to delete a route entry, specify the corresponding parameters based on the next hop type of the route entry:<ul>
     * <li>To delete a blackhole route, specify <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, and <strong>TransitRouterRouteEntryNextHopType</strong>.</li>
     * <li>To delete a non-blackhole route, specify <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, <strong>TransitRouterRouteEntryNextHopType</strong>, and <strong>TransitRouterRouteEntryNextHopId</strong>.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteTransitRouterRouteEntry</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the route entry is not yet deleted. The deletion task runs in the background. You can call <strong>ListTransitRouterRouteEntries</strong> to query the status of the route entry. <ul>
     * <li>If the route entry is in the <strong>Deleting</strong> state, the route entry is being deleted. In this state, you can only query the route entry but cannot perform other operations on it.</li>
     * <li>If the route entry cannot be found, the route entry is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Limits</h3>
     * <p>This operation can delete only static route entries. Automatically learned route entries cannot be deleted. You can call <a href="https://help.aliyun.com/document_detail/260941.html">ListTransitRouterRouteEntries</a> to query the type of a route entry.</p>
     * 
     * @param request the request parameters of DeleteTransitRouterRouteEntry  DeleteTransitRouterRouteEntryRequest
     * @return DeleteTransitRouterRouteEntryResponse
     */
    CompletableFuture<DeleteTransitRouterRouteEntryResponse> deleteTransitRouterRouteEntry(DeleteTransitRouterRouteEntryRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>The default route table of an Enterprise Edition transit router cannot be deleted.</li>
     * <li><strong>DeleteTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the custom route table is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTransitRouterRouteTables</strong> to query the status of the custom route table. <ul>
     * <li>If the custom route table is in the Deleting state, the custom route table is being deleted. In this state, you can only query the custom route table but cannot perform other operations on it.</li>
     * <li>If the custom route table cannot be found, the custom route table is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTransitRouterRouteTable  DeleteTransitRouterRouteTableRequest
     * @return DeleteTransitRouterRouteTableResponse
     */
    CompletableFuture<DeleteTransitRouterRouteTableResponse> deleteTransitRouterRouteTable(DeleteTransitRouterRouteTableRequest request);

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouterVbrAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VBR connection is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of the VBR connection. </p>
     * <ul>
     * <li>If the VBR connection is in the <strong>Detaching</strong> state, the VBR connection is being deleted. In this state, you can only query the VBR connection but cannot perform other operations on it.</li>
     * <li>If the specified VBR connection cannot be found, the VBR connection is deleted.
     * When calling the DeleteTransitRouterVbrAttachment operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not delete the VBR connection from the Enterprise Edition transit router.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTransitRouterVbrAttachment  DeleteTransitRouterVbrAttachmentRequest
     * @return DeleteTransitRouterVbrAttachmentResponse
     */
    CompletableFuture<DeleteTransitRouterVbrAttachmentResponse> deleteTransitRouterVbrAttachment(DeleteTransitRouterVbrAttachmentRequest request);

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouterVpcAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VPC connection is not yet deleted. The deletion task continues to run in the background. You can call <strong>ListTransitRouterVpcAttachments</strong> to query the status of the VPC connection. </p>
     * <ul>
     * <li>If the VPC connection is in the <strong>Detaching</strong> state, the VPC connection is being deleted. In this state, you can only query the VPC connection. You cannot perform other operations on the VPC connection.</li>
     * <li>If the VPC connection cannot be found, the VPC connection is deleted.
     * When you call <strong>DeleteTransitRouterVpcAttachment</strong>, make sure that the parameter values you specify are valid. If you specify invalid parameter values, the system still returns a <strong>RequestId</strong> but does not delete the VPC connection from the Enterprise Edition transit router.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you delete a VPC connection, make sure that you have not configured a routing rule to access PrivateZone by using the VPC-connected instance. To delete the routing rule to PrivateZone, see <a href="https://help.aliyun.com/document_detail/468375.html">UnroutePrivateZoneInCenToVpc</a>.</p>
     * 
     * @param request the request parameters of DeleteTransitRouterVpcAttachment  DeleteTransitRouterVpcAttachmentRequest
     * @return DeleteTransitRouterVpcAttachmentResponse
     */
    CompletableFuture<DeleteTransitRouterVpcAttachmentResponse> deleteTransitRouterVpcAttachment(DeleteTransitRouterVpcAttachmentRequest request);

    /**
     * @param request the request parameters of DeleteTransitRouterVpnAttachment  DeleteTransitRouterVpnAttachmentRequest
     * @return DeleteTransitRouterVpnAttachmentResponse
     */
    CompletableFuture<DeleteTransitRouterVpnAttachmentResponse> deleteTransitRouterVpnAttachment(DeleteTransitRouterVpnAttachmentRequest request);

    /**
     * <b>description</b> :
     * <p><code>DeregisterTransitRouterMulticastGroupMembers</code> is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong> but the multicast member is not immediately removed. The removal task continues to run in the background. You can call <code>ListTransitRouterMulticastGroups</code> to query the status of the multicast member.</p>
     * <ul>
     * <li>If the multicast member is in the <strong>Deregistering</strong> state, the multicast member is being removed. In this state, you can only query the multicast member but cannot perform other operations on it.</li>
     * <li>If the multicast member cannot be found in the multicast domain when you call the <code>ListTransitRouterMulticastGroups</code> operation, the multicast member has been removed.
     * When you call the DeregisterTransitRouterMulticastGroupMembers operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not remove the multicast member.</li>
     * </ul>
     * 
     * @param request the request parameters of DeregisterTransitRouterMulticastGroupMembers  DeregisterTransitRouterMulticastGroupMembersRequest
     * @return DeregisterTransitRouterMulticastGroupMembersResponse
     */
    CompletableFuture<DeregisterTransitRouterMulticastGroupMembersResponse> deregisterTransitRouterMulticastGroupMembers(DeregisterTransitRouterMulticastGroupMembersRequest request);

    /**
     * <b>description</b> :
     * <p><code>DeregisterTransitRouterMulticastGroupSources</code> is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong> but the multicast source is not immediately deleted. The deletion task continues to run in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of the multicast source.</p>
     * <ul>
     * <li>If the multicast source is in the <strong>Deregistering</strong> state, the multicast source is being deleted. In this state, you can only query the multicast source but cannot perform other operations on it.</li>
     * <li>If the <code>ListTransitRouterMulticastGroups</code> operation cannot find the multicast source in the multicast domain, the multicast source has been deleted.
     * When you call the DeregisterTransitRouterMulticastGroupSources operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not delete the multicast source.</li>
     * </ul>
     * 
     * @param request the request parameters of DeregisterTransitRouterMulticastGroupSources  DeregisterTransitRouterMulticastGroupSourcesRequest
     * @return DeregisterTransitRouterMulticastGroupSourcesResponse
     */
    CompletableFuture<DeregisterTransitRouterMulticastGroupSourcesResponse> deregisterTransitRouterMulticastGroupSources(DeregisterTransitRouterMulticastGroupSourcesRequest request);

    /**
     * @param request the request parameters of DescribeCenAttachedChildInstanceAttribute  DescribeCenAttachedChildInstanceAttributeRequest
     * @return DescribeCenAttachedChildInstanceAttributeResponse
     */
    CompletableFuture<DescribeCenAttachedChildInstanceAttributeResponse> describeCenAttachedChildInstanceAttribute(DescribeCenAttachedChildInstanceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You can use this operation to query network instances attached to a CEN instance in the following ways:</p>
     * <ul>
     * <li>Specify <code>CenId</code> to query all network instances attached to the CEN instance.</li>
     * <li>Specify <code>CenId</code> and <code>ChildInstanceRegionId</code> to query network instances attached to the CEN instance in a specific region.</li>
     * <li>Specify <code>CenId</code> and <code>ChildInstanceType</code> to query network instances of a specific type attached to the CEN instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCenAttachedChildInstances  DescribeCenAttachedChildInstancesRequest
     * @return DescribeCenAttachedChildInstancesResponse
     */
    CompletableFuture<DescribeCenAttachedChildInstancesResponse> describeCenAttachedChildInstances(DescribeCenAttachedChildInstancesRequest request);

    /**
     * @param request the request parameters of DescribeCenBandwidthPackages  DescribeCenBandwidthPackagesRequest
     * @return DescribeCenBandwidthPackagesResponse
     */
    CompletableFuture<DescribeCenBandwidthPackagesResponse> describeCenBandwidthPackages(DescribeCenBandwidthPackagesRequest request);

    /**
     * @param request the request parameters of DescribeCenChildInstanceRouteEntries  DescribeCenChildInstanceRouteEntriesRequest
     * @return DescribeCenChildInstanceRouteEntriesResponse
     */
    CompletableFuture<DescribeCenChildInstanceRouteEntriesResponse> describeCenChildInstanceRouteEntries(DescribeCenChildInstanceRouteEntriesRequest request);

    /**
     * @param request the request parameters of DescribeCenGeographicSpanRemainingBandwidth  DescribeCenGeographicSpanRemainingBandwidthRequest
     * @return DescribeCenGeographicSpanRemainingBandwidthResponse
     */
    CompletableFuture<DescribeCenGeographicSpanRemainingBandwidthResponse> describeCenGeographicSpanRemainingBandwidth(DescribeCenGeographicSpanRemainingBandwidthRequest request);

    /**
     * @param request the request parameters of DescribeCenGeographicSpans  DescribeCenGeographicSpansRequest
     * @return DescribeCenGeographicSpansResponse
     */
    CompletableFuture<DescribeCenGeographicSpansResponse> describeCenGeographicSpans(DescribeCenGeographicSpansRequest request);

    /**
     * @param request the request parameters of DescribeCenInterRegionBandwidthLimits  DescribeCenInterRegionBandwidthLimitsRequest
     * @return DescribeCenInterRegionBandwidthLimitsResponse
     */
    CompletableFuture<DescribeCenInterRegionBandwidthLimitsResponse> describeCenInterRegionBandwidthLimits(DescribeCenInterRegionBandwidthLimitsRequest request);

    /**
     * @param request the request parameters of DescribeCenPrivateZoneRoutes  DescribeCenPrivateZoneRoutesRequest
     * @return DescribeCenPrivateZoneRoutesResponse
     */
    CompletableFuture<DescribeCenPrivateZoneRoutesResponse> describeCenPrivateZoneRoutes(DescribeCenPrivateZoneRoutesRequest request);

    /**
     * @param request the request parameters of DescribeCenRegionDomainRouteEntries  DescribeCenRegionDomainRouteEntriesRequest
     * @return DescribeCenRegionDomainRouteEntriesResponse
     */
    CompletableFuture<DescribeCenRegionDomainRouteEntriesResponse> describeCenRegionDomainRouteEntries(DescribeCenRegionDomainRouteEntriesRequest request);

    /**
     * @param request the request parameters of DescribeCenRouteMaps  DescribeCenRouteMapsRequest
     * @return DescribeCenRouteMapsResponse
     */
    CompletableFuture<DescribeCenRouteMapsResponse> describeCenRouteMaps(DescribeCenRouteMapsRequest request);

    /**
     * @param request the request parameters of DescribeCenVbrHealthCheck  DescribeCenVbrHealthCheckRequest
     * @return DescribeCenVbrHealthCheckResponse
     */
    CompletableFuture<DescribeCenVbrHealthCheckResponse> describeCenVbrHealthCheck(DescribeCenVbrHealthCheckRequest request);

    /**
     * @param request the request parameters of DescribeCens  DescribeCensRequest
     * @return DescribeCensResponse
     */
    CompletableFuture<DescribeCensResponse> describeCens(DescribeCensRequest request);

    /**
     * <b>description</b> :
     * <p>CEN supports different regions for different network instance types. You can specify the ProductType parameter to query the regions supported by CEN for a specific network instance type. If you do not specify the ProductType parameter, the system queries the regions supported by CEN for all network instance types by default.</p>
     * 
     * @param request the request parameters of DescribeChildInstanceRegions  DescribeChildInstanceRegionsRequest
     * @return DescribeChildInstanceRegionsResponse
     */
    CompletableFuture<DescribeChildInstanceRegionsResponse> describeChildInstanceRegions(DescribeChildInstanceRegionsRequest request);

    /**
     * @param request the request parameters of DescribeFlowlogs  DescribeFlowlogsRequest
     * @return DescribeFlowlogsResponse
     */
    CompletableFuture<DescribeFlowlogsResponse> describeFlowlogs(DescribeFlowlogsRequest request);

    /**
     * @param request the request parameters of DescribeGeographicRegionMembership  DescribeGeographicRegionMembershipRequest
     * @return DescribeGeographicRegionMembershipResponse
     */
    CompletableFuture<DescribeGeographicRegionMembershipResponse> describeGeographicRegionMembership(DescribeGeographicRegionMembershipRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the <strong>DescribeGrantRulesToCen</strong> operation, make sure that the parameter values you specify are valid. If you specify invalid parameter values, a <strong>RequestId</strong> is still returned, but information about the cross-account network instances authorized to the CEN instance is not returned.</p>
     * 
     * @param request the request parameters of DescribeGrantRulesToCen  DescribeGrantRulesToCenRequest
     * @return DescribeGrantRulesToCenResponse
     */
    CompletableFuture<DescribeGrantRulesToCenResponse> describeGrantRulesToCen(DescribeGrantRulesToCenRequest request);

    /**
     * @param request the request parameters of DescribeGrantRulesToResource  DescribeGrantRulesToResourceRequest
     * @return DescribeGrantRulesToResourceResponse
     */
    CompletableFuture<DescribeGrantRulesToResourceResponse> describeGrantRulesToResource(DescribeGrantRulesToResourceRequest request);

    /**
     * @param request the request parameters of DescribePublishedRouteEntries  DescribePublishedRouteEntriesRequest
     * @return DescribePublishedRouteEntriesResponse
     */
    CompletableFuture<DescribePublishedRouteEntriesResponse> describePublishedRouteEntries(DescribePublishedRouteEntriesRequest request);

    /**
     * @param request the request parameters of DescribeRouteConflict  DescribeRouteConflictRequest
     * @return DescribeRouteConflictResponse
     */
    CompletableFuture<DescribeRouteConflictResponse> describeRouteConflict(DescribeRouteConflictRequest request);

    /**
     * @param request the request parameters of DescribeRouteServicesInCen  DescribeRouteServicesInCenRequest
     * @return DescribeRouteServicesInCenResponse
     */
    CompletableFuture<DescribeRouteServicesInCenResponse> describeRouteServicesInCen(DescribeRouteServicesInCenRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the information about a specific aggregate route by specifying the <strong>TransitRouteTableId</strong> and <strong>TransitRouteTableAggregationCidr</strong> parameters. If you specify only the <strong>TransitRouteTableId</strong> parameter, the system queries the information about all aggregate routes in the route table of the Enterprise Edition transit router by default.</p>
     * 
     * @param request the request parameters of DescribeTransitRouteTableAggregation  DescribeTransitRouteTableAggregationRequest
     * @return DescribeTransitRouteTableAggregationResponse
     */
    CompletableFuture<DescribeTransitRouteTableAggregationResponse> describeTransitRouteTableAggregation(DescribeTransitRouteTableAggregationRequest request);

    /**
     * @param request the request parameters of DescribeTransitRouteTableAggregationDetail  DescribeTransitRouteTableAggregationDetailRequest
     * @return DescribeTransitRouteTableAggregationDetailResponse
     */
    CompletableFuture<DescribeTransitRouteTableAggregationDetailResponse> describeTransitRouteTableAggregationDetail(DescribeTransitRouteTableAggregationDetailRequest request);

    /**
     * @param request the request parameters of DescribeTransitRouterCapacityReservations  DescribeTransitRouterCapacityReservationsRequest
     * @return DescribeTransitRouterCapacityReservationsResponse
     */
    CompletableFuture<DescribeTransitRouterCapacityReservationsResponse> describeTransitRouterCapacityReservations(DescribeTransitRouterCapacityReservationsRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>DetachCenChildInstance</strong> operation supports detaching only specified network instances from Basic Edition transit routers.</p>
     * 
     * @param request the request parameters of DetachCenChildInstance  DetachCenChildInstanceRequest
     * @return DetachCenChildInstanceResponse
     */
    CompletableFuture<DetachCenChildInstanceResponse> detachCenChildInstance(DetachCenChildInstanceRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>DisableCenVbrHealthCheck</strong> operation is asynchronous. The system returns a <strong>RequestId</strong> before the health check configuration is completely deleted, and the deletion task continues in the background. You can call the <strong>DescribeCenVbrHealthCheck</strong> operation to query the health check configuration. If the specified health check configuration cannot be found, the configuration is deleted.</p>
     * 
     * @param request the request parameters of DisableCenVbrHealthCheck  DisableCenVbrHealthCheckRequest
     * @return DisableCenVbrHealthCheckResponse
     */
    CompletableFuture<DisableCenVbrHealthCheckResponse> disableCenVbrHealthCheck(DisableCenVbrHealthCheckRequest request);

    /**
     * <b>description</b> :
     * <p><em>DisableTransitRouterRouteTablePropagation</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> before the route learning relationship between the network instance connection and the route table is fully removed. The removal task continues to run in the background. You can call <strong>ListTransitRouterRouteTablePropagations</strong> to query the route learning relationship between the network instance connection and the route table. </p>
     * <ul>
     * <li>If the route learning relationship is in the <strong>Disabling</strong> state, the network instance connection and the route table are being disassociated. In this state, you can only query the route learning relationship. You cannot perform other operations.</li>
     * <li>If the <strong>ListTransitRouterRouteTableAssociations</strong> operation does not return the route learning relationship between the network instance connection and the route table, the route learning relationship is successfully removed.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableTransitRouterRouteTablePropagation  DisableTransitRouterRouteTablePropagationRequest
     * @return DisableTransitRouterRouteTablePropagationResponse
     */
    CompletableFuture<DisableTransitRouterRouteTablePropagationResponse> disableTransitRouterRouteTablePropagation(DisableTransitRouterRouteTablePropagationRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before dissociating a vSwitch from a multicast domain, make sure that no multicast sources or multicast members exist under the vSwitch. To delete multicast sources and multicast members, see <a href="https://help.aliyun.com/document_detail/468416.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/468409.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>If you specify invalid parameters, the system still returns a RequestId but does not dissociate the vSwitch from the multicast domain.</li>
     * <li><strong>DisassociateTransitRouterMulticastDomain</strong> is an asynchronous operation. After you invoke this operation, the system returns a <strong>RequestId</strong> but the dissociation has not yet completed. The dissociation node continues to run in the background. You can invoke <strong>ListTransitRouterMulticastDomainAssociations</strong> to query the associate status between the vSwitch and the multicast domain.<ul>
     * <li>If the associate status is <strong>Dissociating</strong>, the vSwitch is being dissociated from the multicast domain. In this state, you can only execute query operations on the vSwitch but cannot execute other operations.</li>
     * <li>If the vSwitch information cannot be found under the multicast domain, the vSwitch has been successfully dissociated from the multicast domain.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DisassociateTransitRouterMulticastDomain  DisassociateTransitRouterMulticastDomainRequest
     * @return DisassociateTransitRouterMulticastDomainResponse
     */
    CompletableFuture<DisassociateTransitRouterMulticastDomainResponse> disassociateTransitRouterMulticastDomain(DisassociateTransitRouterMulticastDomainRequest request);

    /**
     * <b>description</b> :
     * <p><em>DissociateTransitRouterAttachmentFromRouteTable</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the dissociation between the network instance connection and the route table is not complete. The dissociation task continues to run in the background. You can call <strong>ListTransitRouterRouteTableAssociations</strong> to query the association status between the network instance connection and the route table. </p>
     * <ul>
     * <li>If the association status is <strong>Dissociating</strong>, the network instance connection is being dissociated from the route table. In this state, you can only query the forwarding association between the network instance connection and the route table. You cannot perform other operations.</li>
     * <li>If the <strong>ListTransitRouterRouteTableAssociations</strong> operation does not return the forwarding association between the network instance connection and the route table, the dissociation is successful.</li>
     * </ul>
     * 
     * @param request the request parameters of DissociateTransitRouterAttachmentFromRouteTable  DissociateTransitRouterAttachmentFromRouteTableRequest
     * @return DissociateTransitRouterAttachmentFromRouteTableResponse
     */
    CompletableFuture<DissociateTransitRouterAttachmentFromRouteTableResponse> dissociateTransitRouterAttachmentFromRouteTable(DissociateTransitRouterAttachmentFromRouteTableRequest request);

    /**
     * <b>description</b> :
     * <p>You can configure health checks for a VBR instance to monitor the connectivity of the physical Express Connect circuit between your on-premises data center and Alibaba Cloud, so that issues can be detected promptly.
     * Before using the health check feature, note the following information:</p>
     * <ul>
     * <li>If your VBR instance uses static routing, after you configure the health check, you must add a static route entry in the on-premises data center connected to the VBR instance.
     *   The destination CIDR block of the static route is the source IP address of the health check with a 32-bit subnet mask, and the next hop is the Alibaba Cloud-side IP address of the VBR instance.</li>
     * <li>If your border router instance uses the BGP dynamic routing protocol, you do not need to add a route entry in the on-premises data center.</li>
     * <li>The <strong>EnableCenVbrHealthCheck</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong>, but the health check instance is not yet created or modified. The creation or modification task continues to run in the background. You can call the <strong>DescribeCenVbrHealthCheck</strong> operation to query the health check configuration. If the health check configuration is returned, the health check has been created or modified.</li>
     * </ul>
     * 
     * @param request the request parameters of EnableCenVbrHealthCheck  EnableCenVbrHealthCheckRequest
     * @return EnableCenVbrHealthCheckResponse
     */
    CompletableFuture<EnableCenVbrHealthCheckResponse> enableCenVbrHealthCheck(EnableCenVbrHealthCheckRequest request);

    /**
     * <b>description</b> :
     * <p>After you create a network instance connection, you can configure a route learning relationship for it. After the configuration, the network instance connection automatically propagates routes of the network instance to its associated route table. Before you call this operation to create a route learning relationship, take note of the following information:</p>
     * <ul>
     * <li>Only Enterprise Edition transit routers support creating route learning relationships. For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network?</a>.</li>
     * <li>The <strong>EnableTransitRouterRouteTablePropagation</strong> operation is asynchronous. After you call the operation, the system returns a <strong>RequestId</strong>, but the route learning relationship between the network instance connection and the route table is not fully established, and the creation task is still running in the background. You can call the <strong>ListTransitRouterRouteTablePropagations</strong> operation to query the route learning relationship between the network instance connection and the route table.<ul>
     * <li>When the route learning relationship is in the <strong>Enabling</strong> state, the route learning relationship between the network instance connection and the route table is being established. In this state, you can only query the route learning relationship between the network instance connection and the route table, and cannot perform other operations.</li>
     * <li>When the route learning relationship is in the <strong>Active</strong> state, the route learning relationship between the network instance connection and the route table is successfully established.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of EnableTransitRouterRouteTablePropagation  EnableTransitRouterRouteTablePropagationRequest
     * @return EnableTransitRouterRouteTablePropagationResponse
     */
    CompletableFuture<EnableTransitRouterRouteTablePropagationResponse> enableTransitRouterRouteTablePropagation(EnableTransitRouterRouteTablePropagationRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>The GrantInstanceToTransitRouter operation only supports granting a transit router instance permissions to connect to cross-account Virtual Private Cloud (VPC) instances, Virtual Border Router (VBR) instances, IPsec connections, and Express Connect Router (ECR) instances.</p>
     * <p>  To grant a transit router instance permissions to connect to a Cloud Connect Network (CCN) instance, call the <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a> operation.</p>
     * </li>
     * <li><p>Before you call the GrantInstanceToTransitRouter operation, make sure that you understand the billing rules of transit routers, the limits on authorization operations, and the prerequisites for authorization operations. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Cross-account network instance authorization</a>.</p>
     * </li>
     * <li><p>Before you authorize a network instance, make sure that the following operations are completed:
     * Confirm that the account to which the network instance belongs and the account to which the transit router instance belongs are of the same type.
     * Obtain the Alibaba Cloud account ID of the account to which the transit router instance belongs.
     * Obtain the Cloud Enterprise Network (CEN) instance ID to which the transit router instance belongs.
     * Before you authorize a VBR instance, contact your account manager to activate the VBR instance authorization feature.
     * Before you authorize an IPsec connection, make sure that the IPsec connection is not associated with any resource:
     * If the IPsec connection is already associated with a VPN gateway instance, it cannot be associated with a transit router instance in the same account or a different account.
     * If the IPsec connection is already associated with a transit router instance, you must disassociate it first. For more information, see <a href="https://help.aliyun.com/document_detail/181554.html">Delete a network instance connection</a>.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of GrantInstanceToTransitRouter  GrantInstanceToTransitRouterRequest
     * @return GrantInstanceToTransitRouterResponse
     */
    CompletableFuture<GrantInstanceToTransitRouterResponse> grantInstanceToTransitRouter(GrantInstanceToTransitRouterRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the ListCenChildInstanceRouteEntriesToAttachment operation, make sure that the parameter values you specify are valid. If you specify invalid parameter values, the operation returns a RequestId but does not display the route entries of network instances connected to the Enterprise Edition transit router.</p>
     * 
     * @param request the request parameters of ListCenChildInstanceRouteEntriesToAttachment  ListCenChildInstanceRouteEntriesToAttachmentRequest
     * @return ListCenChildInstanceRouteEntriesToAttachmentResponse
     */
    CompletableFuture<ListCenChildInstanceRouteEntriesToAttachmentResponse> listCenChildInstanceRouteEntriesToAttachment(ListCenChildInstanceRouteEntriesToAttachmentRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation:</p>
     * <ul>
     * <li>Specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficQosPolicyId</strong> parameters.</li>
     * <li>If you do not specify a traffic scheduling policy ID (that is, you do not specify the <strong>TrafficQosPolicyId</strong> parameter), the operation returns only the traffic scheduling policy information based on the values of the <strong>TransitRouterId</strong>, <strong>TransitRouterAttachmentId</strong>, <strong>TrafficQosPolicyName</strong>, and <strong>TrafficQosPolicyDescription</strong> parameters. The queue information under the traffic scheduling policy is not returned (that is, the response does not include the <strong>TrafficQosQueues</strong> field).</li>
     * <li>If you specify a traffic scheduling policy ID (that is, you specify the <strong>TrafficQosPolicyId</strong> parameter), the operation returns the traffic scheduling policy information and the queue information under the traffic scheduling policy (that is, the response includes the <strong>TrafficQosQueues</strong> field). If the <strong>TrafficQosQueues</strong> field is an empty array, only the default queue exists under the traffic scheduling policy.</li>
     * <li>Make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the operation still returns a RequestId but does not return traffic scheduling policy information.</li>
     * </ul>
     * 
     * @param request the request parameters of ListCenInterRegionTrafficQosPolicies  ListCenInterRegionTrafficQosPoliciesRequest
     * @return ListCenInterRegionTrafficQosPoliciesResponse
     */
    CompletableFuture<ListCenInterRegionTrafficQosPoliciesResponse> listCenInterRegionTrafficQosPolicies(ListCenInterRegionTrafficQosPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, specify at least one of the following parameters: <strong>TransitRouterId</strong>, <strong>TrafficQosPolicyId</strong>, or <strong>TrafficQosQueueId</strong>.
     * Make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system returns a <strong>RequestId</strong> but does not return information about traffic scheduling policies.</p>
     * 
     * @param request the request parameters of ListCenInterRegionTrafficQosQueues  ListCenInterRegionTrafficQosQueuesRequest
     * @return ListCenInterRegionTrafficQosQueuesResponse
     */
    CompletableFuture<ListCenInterRegionTrafficQosQueuesResponse> listCenInterRegionTrafficQosQueues(ListCenInterRegionTrafficQosQueuesRequest request);

    /**
     * <b>description</b> :
     * <p>Before you invoke the <code>ListGrantVSwitchEnis</code> operation, make sure that the VPC-connected instance is connected to Cloud Enterprise Network (CEN). For more information, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</p>
     * 
     * @param request the request parameters of ListGrantVSwitchEnis  ListGrantVSwitchEnisRequest
     * @return ListGrantVSwitchEnisResponse
     */
    CompletableFuture<ListGrantVSwitchEnisResponse> listGrantVSwitchEnis(ListGrantVSwitchEnisRequest request);

    /**
     * <b>description</b> :
     * <p>Before you invoke the <code>ListGrantVSwitchesToCen</code> operation, make sure that the CEN instance has been granted authorization to access the cross-account VPC-connected instance. For more information, see <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</p>
     * 
     * @param request the request parameters of ListGrantVSwitchesToCen  ListGrantVSwitchesToCenRequest
     * @return ListGrantVSwitchesToCenResponse
     */
    CompletableFuture<ListGrantVSwitchesToCenResponse> listGrantVSwitchesToCen(ListGrantVSwitchesToCenRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>RouteMapId: specifies the route map whose rules you want to query.</li>
     * <li>RouteMapRuleIds: the list of rule IDs to query. This parameter and filter conditions can be used together for matching, and they have an OR relationship.</li>
     * <li>Filter: the filter. You can filter by attributes such as direction. Supported filter conditions include Status and Direction.</li>
     * <li>DryRun: specifies whether to enable the dry run mode. Default value: false.
     * You must specify at least one of RouteMapId and RouteMapRuleIds. If both are provided, a joint query is performed based on these two parameters. If only RouteMapId is provided, all rules under the route map are returned. If only RouteMapRuleIds is provided, the details of the specified rules are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRouteMapRules  ListRouteMapRulesRequest
     * @return ListRouteMapRulesResponse
     */
    CompletableFuture<ListRouteMapRulesResponse> listRouteMapRules(ListRouteMapRulesRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>RouteMapIds</strong>: optional. Specifies a list of one or more route map IDs to query. If you do not specify this parameter, all route maps are queried by default.</li>
     * <li><strong>Filter</strong>: optional. Filters route maps based on specific conditions such as the name and direction.</li>
     * <li><strong>ResourceGroupId</strong>: optional. Specifies the ID of the resource group to further filter the results.</li>
     * <li><strong>DryRun</strong>: optional. Specifies whether to check the request without actually performing the operation.</li>
     * <li><strong>MaxResults</strong> and <strong>NextToken</strong>: pagination parameters. Used to control the number of returned results and obtain the next page of data.
     * Note: If you specify both <code>RouteMapIds</code> and <code>Filter</code>, they are connected by an OR logical operator. Route maps that meet either condition are queried.</li>
     * </ul>
     * 
     * @param request the request parameters of ListRouteMaps  ListRouteMapsRequest
     * @return ListRouteMapsResponse
     */
    CompletableFuture<ListRouteMapsResponse> listRouteMaps(ListRouteMapsRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the ListTagResources operation, you must specify at least one of the request parameters <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>:</p>
     * <ul>
     * <li>If you specify only <strong>ResourceId.N</strong>, the tags bound to the specified CEN instance are queried.</li>
     * <li>If you specify only <strong>Tag.N.Key</strong>, all CEN instances that have the specified tag key bound are queried.</li>
     * <li>If you specify both <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>, the specified tags bound to the specified CEN instance are queried.<ul>
     * <li>Make sure that the values of <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong> correspond to each other. Otherwise, an empty result is returned.</li>
     * <li>If you specify multiple tag keys, the tag keys are evaluated by using the logical AND operator.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the <strong>ListTrafficMarkingPolicies</strong> operation:</p>
     * <ul>
     * <li>You must specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficMarkingPolicyId</strong> parameters.</li>
     * <li>If you do not specify a traffic marking policy ID (that is, you do not specify a value for the <strong>TrafficMarkingPolicyId</strong> parameter), the operation returns only the traffic marking policy information based on the values of the <strong>TransitRouterId</strong>, <strong>TrafficMarkingPolicyName</strong>, and <strong>TrafficMarkingPolicyDescription</strong> parameters. The traffic classification rule information under the traffic marking policy is not returned (that is, the response does not contain the <strong>TrafficMatchRules</strong> field).</li>
     * <li>If you specify a traffic marking policy ID (that is, you specify a value for the <strong>TrafficMarkingPolicyId</strong> parameter), the operation returns the traffic marking policy information and the traffic classification rule information under the traffic marking policy (that is, the response contains the <strong>TrafficMatchRules</strong> field).
     * If the <strong>TrafficMatchRules</strong> field is an empty array, no traffic classification rules exist under the current traffic marking policy.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTrafficMarkingPolicies  ListTrafficMarkingPoliciesRequest
     * @return ListTrafficMarkingPoliciesResponse
     */
    CompletableFuture<ListTrafficMarkingPoliciesResponse> listTrafficMarkingPolicies(ListTrafficMarkingPoliciesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can invoke <strong>ListTransitRouterAvailableResource</strong> to query information about regular zones or zones that support the multicast feature for Enterprise Edition transit routers in a specified region.<ul>
     * <li>If you do not set <strong>SupportMulticast</strong> to <strong>true</strong>, the system queries only the regular zones supported by Enterprise Edition transit routers by default.</li>
     * <li>If you set <strong>SupportMulticast</strong> to <strong>true</strong>, the system queries only the zones that support the multicast feature for Enterprise Edition transit routers.</li>
     * </ul>
     * </li>
     * <li>On May 31, 2022, Cloud Enterprise Network (CEN) performed an optimization upgrade on the mode in which Enterprise Edition transit routers connect to virtual private clouds (VPCs). After the upgrade, you no longer need to specify primary and secondary zones when connecting an Enterprise Edition transit router to a VPC-connected instance. You can specify one or more zones.<ul>
     * <li>If your Enterprise Edition transit router has not been upgraded, you must specify primary and secondary zones when connecting the Enterprise Edition transit router to a VPC-connected instance. After you invoke <strong>ListTransitRouterAvailableResource</strong>, you can obtain the primary and secondary zone information from the <strong>MasterZones</strong> and <strong>SlaveZones</strong> parameters.</li>
     * <li>If your Enterprise Edition transit router has been upgraded, you can specify any zones when connecting the Enterprise Edition transit router to a VPC-connected instance. After you invoke <strong>ListTransitRouterAvailableResource</strong>, you can obtain the zone information supported by the Enterprise Edition transit router from the <strong>AvailableZones</strong> parameter.
     * For more information about the Enterprise Edition transit router upgrade, see <a href="https://help.aliyun.com/document_detail/434191.html">Upgrade the mode in which an Enterprise Edition transit router connects to a VPC</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterAvailableResource  ListTransitRouterAvailableResourceRequest
     * @return ListTransitRouterAvailableResourceResponse
     */
    CompletableFuture<ListTransitRouterAvailableResourceResponse> listTransitRouterAvailableResource(ListTransitRouterAvailableResourceRequest request);

    /**
     * @param request the request parameters of ListTransitRouterCidr  ListTransitRouterCidrRequest
     * @return ListTransitRouterCidrResponse
     */
    CompletableFuture<ListTransitRouterCidrResponse> listTransitRouterCidr(ListTransitRouterCidrRequest request);

    /**
     * @param request the request parameters of ListTransitRouterCidrAllocation  ListTransitRouterCidrAllocationRequest
     * @return ListTransitRouterCidrAllocationResponse
     */
    CompletableFuture<ListTransitRouterCidrAllocationResponse> listTransitRouterCidrAllocation(ListTransitRouterCidrAllocationRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the information about ECR connections under an Enterprise Edition transit router in the following three ways: </p>
     * <ul>
     * <li>Query the information about all ECR connections under the instance by using the Enterprise Edition transit router instance ID. </li>
     * <li>Query the information about all ECR connections under the instance by using the Cloud Enterprise Network (CEN) instance ID and the region ID of the Enterprise Edition transit router. </li>
     * <li>Query specific ECR connection information by using only the <strong>TransitRouterAttachmentId</strong> parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterEcrAttachments  ListTransitRouterEcrAttachmentsRequest
     * @return ListTransitRouterEcrAttachmentsResponse
     */
    CompletableFuture<ListTransitRouterEcrAttachmentsResponse> listTransitRouterEcrAttachments(ListTransitRouterEcrAttachmentsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When calling this operation, you must specify at least one of the request parameters <strong>TransitRouterMulticastDomainId</strong> and <strong>TransitRouterAttachmentId</strong>. Specifying <strong>TransitRouterAttachmentId</strong> queries the information about vSwitches that are associated with a multicast domain under a VPC-connected instance. Specifying <strong>TransitRouterMulticastDomainId</strong> queries the information about vSwitches that are associated with the multicast domain.</li>
     * <li>When calling the <strong>ListTransitRouterMulticastDomainAssociations</strong> operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the operation still returns a <strong>RequestId</strong> but does not return the associations between the multicast domain and vSwitches.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterMulticastDomainAssociations  ListTransitRouterMulticastDomainAssociationsRequest
     * @return ListTransitRouterMulticastDomainAssociationsResponse
     */
    CompletableFuture<ListTransitRouterMulticastDomainAssociationsResponse> listTransitRouterMulticastDomainAssociations(ListTransitRouterMulticastDomainAssociationsRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the ListTransitRouterMulticastDomainVSwitches operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not return information about vSwitches that are associated with multicast domains in the VPC-connected instance.</p>
     * 
     * @param request the request parameters of ListTransitRouterMulticastDomainVSwitches  ListTransitRouterMulticastDomainVSwitchesRequest
     * @return ListTransitRouterMulticastDomainVSwitchesResponse
     */
    CompletableFuture<ListTransitRouterMulticastDomainVSwitchesResponse> listTransitRouterMulticastDomainVSwitches(ListTransitRouterMulticastDomainVSwitchesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>RegionId must be used in combination with CenId and cannot be used alone. Otherwise, the multicast domain information is not displayed. However, TransitRouterId and TransitRouterMulticastDomainId can be used alone.</li>
     * <li>Make sure that the input parameter values are correct when you call this operation. If the input parameters are invalid, the operation still returns <strong>RequestId</strong>, but the detailed information about the multicast domains is not displayed.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterMulticastDomains  ListTransitRouterMulticastDomainsRequest
     * @return ListTransitRouterMulticastDomainsResponse
     */
    CompletableFuture<ListTransitRouterMulticastDomainsResponse> listTransitRouterMulticastDomains(ListTransitRouterMulticastDomainsRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <code>ListTransitRouterMulticastGroups</code> operation to query information about multicast members and multicast sources (hereinafter referred to as multicast resources) in a multicast domain.</p>
     * <ul>
     * <li>If you specify the <strong>GroupIpAddress</strong> parameter, you can query multicast resources in a specified multicast group within the multicast domain.</li>
     * <li>If you specify the <strong>VSwitchIds</strong> parameter, you can query multicast resources under a specified vSwitch within the multicast domain.</li>
     * <li>If you specify the <strong>PeerTransitRouterMulticastDomains</strong> parameter, you can query cross-region multicast resources within the multicast domain.</li>
     * <li>If you specify the <strong>ResourceType</strong> parameter, you can query multicast resources of a specified resource type within the multicast domain.</li>
     * <li>If you specify the <strong>ResourceId</strong> parameter, you can query multicast resources associated with a specified resource.</li>
     * <li>If you specify only the <strong>TransitRouterMulticastDomainId</strong> parameter, you can query all multicast resources within the multicast domain.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterMulticastGroups  ListTransitRouterMulticastGroupsRequest
     * @return ListTransitRouterMulticastGroupsResponse
     */
    CompletableFuture<ListTransitRouterMulticastGroupsResponse> listTransitRouterMulticastGroups(ListTransitRouterMulticastGroupsRequest request);

    /**
     * <b>description</b> :
     * <p>You can query the information about inter-region connections under an Enterprise Edition transit router in the following two ways:</p>
     * <ul>
     * <li>Query the information about all inter-region connections under the Enterprise Edition transit router by using instance ID of the Enterprise Edition transit router.</li>
     * <li>Query the information about all inter-region connections under the Enterprise Edition transit router by using instance ID of the Cloud Enterprise Network (CEN) instance and the region ID of the Enterprise Edition transit router.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterPeerAttachments  ListTransitRouterPeerAttachmentsRequest
     * @return ListTransitRouterPeerAttachmentsResponse
     */
    CompletableFuture<ListTransitRouterPeerAttachmentsResponse> listTransitRouterPeerAttachments(ListTransitRouterPeerAttachmentsRequest request);

    /**
     * @param request the request parameters of ListTransitRouterPrefixListAssociation  ListTransitRouterPrefixListAssociationRequest
     * @return ListTransitRouterPrefixListAssociationResponse
     */
    CompletableFuture<ListTransitRouterPrefixListAssociationResponse> listTransitRouterPrefixListAssociation(ListTransitRouterPrefixListAssociationRequest request);

    /**
     * @param request the request parameters of ListTransitRouterRouteEntries  ListTransitRouterRouteEntriesRequest
     * @return ListTransitRouterRouteEntriesResponse
     */
    CompletableFuture<ListTransitRouterRouteEntriesResponse> listTransitRouterRouteEntries(ListTransitRouterRouteEntriesRequest request);

    /**
     * <b>description</b> :
     * <p>When you call the <strong>ListTransitRouterRouteTableAssociations</strong> operation, specify at least one of the request parameters <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong>:</p>
     * <ul>
     * <li>If you specify only the <strong>TransitRouterRouteTableId</strong> parameter, the system queries the network instance connections that have route association relationships with the specified Enterprise Edition transit router route table.</li>
     * <li>If you specify only the <strong>TransitRouterAttachmentId</strong> parameter, the system queries the Enterprise Edition transit router route tables that have route association relationships with the specified network instance connection.</li>
     * <li>If you specify both the <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong> parameters, the system queries the route association relationship between the specified network instance connection and the specified Enterprise Edition transit router route table.<ul>
     * <li>If a route association relationship exists between the network instance connection and the Enterprise Edition transit router route table, the system returns the information about the route association relationship.</li>
     * <li>If no route association relationship exists between the network instance connection and the Enterprise Edition transit router route table, the <strong>TransitRouterAssociations</strong> array is empty.
     * When you call the <strong>ListTransitRouterRouteTableAssociations</strong> operation, make sure that the parameter values you specify are correct.
     * If you specify incorrect parameter values, the system still returns a <strong>RequestId</strong> but does not return the route association relationships created for the Enterprise Edition transit router route table or network instance connection.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterRouteTableAssociations  ListTransitRouterRouteTableAssociationsRequest
     * @return ListTransitRouterRouteTableAssociationsResponse
     */
    CompletableFuture<ListTransitRouterRouteTableAssociationsResponse> listTransitRouterRouteTableAssociations(ListTransitRouterRouteTableAssociationsRequest request);

    /**
     * @param request the request parameters of ListTransitRouterRouteTablePropagations  ListTransitRouterRouteTablePropagationsRequest
     * @return ListTransitRouterRouteTablePropagationsResponse
     */
    CompletableFuture<ListTransitRouterRouteTablePropagationsResponse> listTransitRouterRouteTablePropagations(ListTransitRouterRouteTablePropagationsRequest request);

    /**
     * @param request the request parameters of ListTransitRouterRouteTables  ListTransitRouterRouteTablesRequest
     * @return ListTransitRouterRouteTablesResponse
     */
    CompletableFuture<ListTransitRouterRouteTablesResponse> listTransitRouterRouteTables(ListTransitRouterRouteTablesRequest request);

    /**
     * <b>description</b> :
     * <p>You can query information about virtual border router (VBR) connections on an Enterprise Edition transit router in the following ways:</p>
     * <ul>
     * <li>Query information about all VBR connections on an Enterprise Edition transit router by specifying the transit router instance ID.</li>
     * <li>Query information about all VBR connections on an Enterprise Edition transit router by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the transit router instance.</li>
     * <li>Query information about a VBR connection by specifying only the TransitRouterAttachmentId parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterVbrAttachments  ListTransitRouterVbrAttachmentsRequest
     * @return ListTransitRouterVbrAttachmentsResponse
     */
    CompletableFuture<ListTransitRouterVbrAttachmentsResponse> listTransitRouterVbrAttachments(ListTransitRouterVbrAttachmentsRequest request);

    /**
     * <b>description</b> :
     * <p>You can query information about VPC connections under an Enterprise Edition transit router in the following three ways:</p>
     * <ul>
     * <li>Query information about all VPC connections under an Enterprise Edition transit router instance by specifying the transit router instance ID.</li>
     * <li>Query information about all VPC connections under an Enterprise Edition transit router instance by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the Enterprise Edition transit router instance.</li>
     * <li>Query information about all VPC connections in a region by specifying the region ID of the Enterprise Edition transit router instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterVpcAttachments  ListTransitRouterVpcAttachmentsRequest
     * @return ListTransitRouterVpcAttachmentsResponse
     */
    CompletableFuture<ListTransitRouterVpcAttachmentsResponse> listTransitRouterVpcAttachments(ListTransitRouterVpcAttachmentsRequest request);

    /**
     * @param request the request parameters of ListTransitRouterVpnAttachments  ListTransitRouterVpnAttachmentsRequest
     * @return ListTransitRouterVpnAttachmentsResponse
     */
    CompletableFuture<ListTransitRouterVpnAttachmentsResponse> listTransitRouterVpnAttachments(ListTransitRouterVpnAttachmentsRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to query information about transit router instances under a CEN instance, you can specify the <strong>RegionId</strong> and <strong>TransitRouterId</strong> parameters as needed. The following describes the relationship between these two parameters:</p>
     * <ul>
     * <li>If you do not specify <strong>RegionId</strong> or <strong>TransitRouterId</strong>, all transit router instances under the CEN instance are queried.</li>
     * <li>If you specify only <strong>RegionId</strong>, transit router instances in the specified region under the CEN instance are queried.</li>
     * <li>If you specify only <strong>TransitRouterId</strong>, the specified transit router instance under the CEN instance is queried.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouters  ListTransitRoutersRequest
     * @return ListTransitRoutersResponse
     */
    CompletableFuture<ListTransitRoutersResponse> listTransitRouters(ListTransitRoutersRequest request);

    /**
     * <b>description</b> :
     * <p><em>ModifyCenAttribute</em>* is an asynchronous operation. The system first returns a <strong>RequestId</strong>, but the modification of the Cloud Enterprise Network (CEN) instance is not completed. The modification task continues in the background. You can call the <strong>DescribeCens</strong> operation to query the status of the CEN instance. </p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Modifying</strong> state, the instance is being modified. In this state, you can only perform query operations on the CEN instance and cannot perform other operations.</li>
     * <li>If the CEN instance is in the <strong>Active</strong> state, the modification of the CEN instance is completed.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCenAttribute  ModifyCenAttributeRequest
     * @return ModifyCenAttributeResponse
     */
    CompletableFuture<ModifyCenAttributeResponse> modifyCenAttribute(ModifyCenAttributeRequest request);

    /**
     * @param request the request parameters of ModifyCenBandwidthPackageAttribute  ModifyCenBandwidthPackageAttributeRequest
     * @return ModifyCenBandwidthPackageAttributeResponse
     */
    CompletableFuture<ModifyCenBandwidthPackageAttributeResponse> modifyCenBandwidthPackageAttribute(ModifyCenBandwidthPackageAttributeRequest request);

    /**
     * @param request the request parameters of ModifyCenBandwidthPackageSpec  ModifyCenBandwidthPackageSpecRequest
     * @return ModifyCenBandwidthPackageSpecResponse
     */
    CompletableFuture<ModifyCenBandwidthPackageSpecResponse> modifyCenBandwidthPackageSpec(ModifyCenBandwidthPackageSpecRequest request);

    /**
     * <b>description</b> :
     * <p>The <code>ModifyCenRouteMap</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the routing policy has not been modified yet. The modification task runs in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of the routing policy.</p>
     * <ul>
     * <li>If the routing policy is in the <strong>Modifying</strong> state, the routing policy is being modified. In this state, you can only perform query operations.</li>
     * <li>If the routing policy is in the <strong>Active</strong> state, the routing policy has been modified.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCenRouteMap  ModifyCenRouteMapRequest
     * @return ModifyCenRouteMapResponse
     */
    CompletableFuture<ModifyCenRouteMapResponse> modifyCenRouteMap(ModifyCenRouteMapRequest request);

    /**
     * <b>description</b> :
     * <p>The <code>ModifyFlowLogAttribute</code> operation is asynchronous. After you call this operation, the system returns a <strong>RequestId</strong>, but the modification has not been completed. The modification continues in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Modifying</strong> state, the flow log is being modified. In this state, you can only perform query operations.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log has been modified.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyFlowLogAttribute  ModifyFlowLogAttributeRequest
     * @return ModifyFlowLogAttributeResponse
     */
    CompletableFuture<ModifyFlowLogAttributeResponse> modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>The ModifyGrantInstanceToTransitRouter operation only supports modifying the payer for a cross-account virtual private cloud (VPC) instance, virtual border router (VBR) instance, or IPsec instance connected to a transit router instance.</p>
     * 
     * @param request the request parameters of ModifyGrantInstanceToTransitRouter  ModifyGrantInstanceToTransitRouterRequest
     * @return ModifyGrantInstanceToTransitRouterResponse
     */
    CompletableFuture<ModifyGrantInstanceToTransitRouterResponse> modifyGrantInstanceToTransitRouter(ModifyGrantInstanceToTransitRouterRequest request);

    /**
     * @param request the request parameters of ModifyTrafficMatchRuleToTrafficMarkingPolicy  ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest
     * @return ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse
     */
    CompletableFuture<ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse> modifyTrafficMatchRuleToTrafficMarkingPolicy(ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest request);

    /**
     * @param request the request parameters of ModifyTransitRouteTableAggregation  ModifyTransitRouteTableAggregationRequest
     * @return ModifyTransitRouteTableAggregationResponse
     */
    CompletableFuture<ModifyTransitRouteTableAggregationResponse> modifyTransitRouteTableAggregation(ModifyTransitRouteTableAggregationRequest request);

    /**
     * @param request the request parameters of ModifyTransitRouterCapacityReservations  ModifyTransitRouterCapacityReservationsRequest
     * @return ModifyTransitRouterCapacityReservationsResponse
     */
    CompletableFuture<ModifyTransitRouterCapacityReservationsResponse> modifyTransitRouterCapacityReservations(ModifyTransitRouterCapacityReservationsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you modify a transit router CIDR block, we recommend that you familiarize yourself with the <a href="https://help.aliyun.com/document_detail/462635.html">usage limits of transit router CIDR blocks</a>.</li>
     * <li>A transit router CIDR block that has allocated IP addresses cannot be modified.</li>
     * <li>If you call the <strong>ModifyTransitRouterCidr</strong> operation without modifying the <strong>PublishCidrRoute</strong> parameter, this operation is synchronous and the modification takes effect immediately.</li>
     * <li>If you call the <strong>ModifyTransitRouterCidr</strong> operation and modify the <strong>PublishCidrRoute</strong> parameter, this operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the transit router CIDR block is not yet modified. The modification task runs in the background. You can call the <strong>ListTransitRouterCidr</strong> operation to query the modification status of the transit router CIDR block.<ul>
     * <li>If the transit router CIDR block still shows the information before the modification, the transit router CIDR block is being modified.</li>
     * <li>If the transit router CIDR block shows the updated information, the transit router CIDR block has been modified.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyTransitRouterCidr  ModifyTransitRouterCidrRequest
     * @return ModifyTransitRouterCidrResponse
     */
    CompletableFuture<ModifyTransitRouterCidrResponse> modifyTransitRouterCidr(ModifyTransitRouterCidrRequest request);

    /**
     * @param request the request parameters of ModifyTransitRouterMulticastDomain  ModifyTransitRouterMulticastDomainRequest
     * @return ModifyTransitRouterMulticastDomainResponse
     */
    CompletableFuture<ModifyTransitRouterMulticastDomainResponse> modifyTransitRouterMulticastDomain(ModifyTransitRouterMulticastDomainRequest request);

    /**
     * <b>description</b> :
     * <p>By default, CEN instances and bandwidth plans belong to the default resource group. You can call the <code>MoveResourceGroup</code> operation to change the resource group of a CEN instance or a bandwidth plan.</p>
     * 
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can call the <code>OpenTransitRouterService</code> operation to activate the transit router service free of charge. After the transit router service is activated, the system automatically generates an order. You can use the order ID returned by the <code>OpenTransitRouterService</code> operation to query order information in the &lt;props=&quot;china&quot;&gt;<a href="https://usercenter2.aliyun.com/order/list?pageIndex=1&pageSize=20">Alibaba Cloud Management Console Order Center</a>&lt;props=&quot;intl&quot;&gt;<a href="https://usercenter2-intl.aliyun.com/order/list">Alibaba Cloud Management Console Order Center</a>.</p>
     * <blockquote>
     * <p>Before calling this operation, call <a href="~~CheckTransitRouterService~~">CheckTransitRouterService</a> to check whether the transit router service is already activated for the current account. If it is already activated, you do not need to call this operation again.</p>
     * </blockquote>
     * 
     * @param request the request parameters of OpenTransitRouterService  OpenTransitRouterServiceRequest
     * @return OpenTransitRouterServiceResponse
     */
    CompletableFuture<OpenTransitRouterServiceResponse> openTransitRouterService(OpenTransitRouterServiceRequest request);

    /**
     * <b>description</b> :
     * <p>The following table lists the default publish status of each type of route entry in CEN. You can call the PublishRouteEntries operation to publish route entries that are not published to CEN.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Route entry</th>
     * <th>Instance to which the route entry belongs</th>
     * <th>Published to CEN by default</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Route entry that points to an ECS instance</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a VPN gateway</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a high availability (HA) virtual IP address</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a router interface</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to an elastic network interfaces (ENIs)</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to an IPv6 gateway</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to a NAT gateway</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>VPC system route entry</td>
     * <td>VPC</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Route entry that points to an on-premises data center</td>
     * <td>VBR</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>BGP route</td>
     * <td>VBR</td>
     * <td>Yes</td>
     * </tr>
     * </tbody></table>
     * 
     * @param request the request parameters of PublishRouteEntries  PublishRouteEntriesRequest
     * @return PublishRouteEntriesResponse
     */
    CompletableFuture<PublishRouteEntriesResponse> publishRouteEntries(PublishRouteEntriesRequest request);

    /**
     * <b>description</b> :
     * <p>For aggregate routes that failed to be published or were partially published, you can call the <strong>RefreshTransitRouteTableAggregation</strong> operation to republish the aggregate route to Virtual Private Cloud (VPC) instances after you resolve the route issue.
     * If you resolve the problematic route by using one of the following methods, the system automatically republishes the aggregate route and you do not need to manually republish it:</p>
     * <ul>
     * <li>Delete the association forwarding relationship.</li>
     * <li>Disable the route synchronization feature.</li>
     * <li>Delete the VPC route table.</li>
     * <li>Delete the aggregate route.
     * You can call the <strong>DescribeTransitRouteTableAggregationDetail</strong> operation to query the propagation status of an aggregate route.</li>
     * </ul>
     * 
     * @param request the request parameters of RefreshTransitRouteTableAggregation  RefreshTransitRouteTableAggregationRequest
     * @return RefreshTransitRouteTableAggregationResponse
     */
    CompletableFuture<RefreshTransitRouteTableAggregationResponse> refreshTransitRouteTableAggregation(RefreshTransitRouteTableAggregationRequest request);

    /**
     * <b>description</b> :
     * <p>Currently, Enterprise Edition transit routers support only elastic network interfaces (ENIs) as multicast members. You can call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to specify ENIs in the same region or cross-region ENIs as multicast members.</p>
     * <ul>
     * <li>If you specify the <strong>NetworkInterfaceIds</strong> parameter, you want to specify ENIs in the current region as multicast members. Make sure that the vSwitch to which the ENI belongs is associated with the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</li>
     * <li>If you specify the <strong>PeerTransitRouterMulticastDomains</strong> parameter, you want to specify multicast members in a multicast group with the same multicast IP address in a different region as multicast members of your current multicast group. Make sure that you have created an inter-region connection. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.
     * For example, you have Multicast Domain 1 in the China (Hangzhou) region with Multicast Group 1, and Multicast Domain 2 in the China (Shanghai) region with Multicast Group 2. Multicast Group 1 and Multicast Group 2 have the same multicast IP address, and Multicast Group 2 in the China (Shanghai) region has Multicast Member 2. When you call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to create multicast members for Multicast Group 1 in the China (Hangzhou) region, if you set <strong>PeerTransitRouterMulticastDomains</strong> to the ID of Multicast Domain 2 in the China (Shanghai) region, Multicast Member 2 in Multicast Group 2 in the China (Shanghai) region also becomes a multicast member of Multicast Group 1 in the China (Hangzhou) region.</li>
     * <li>The <code>RegisterTransitRouterMulticastGroupMembers</code> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the multicast member is not completely created. The creation task continues to run in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of the multicast member.<ul>
     * <li>If the multicast member is in the <strong>Registering</strong> state, the multicast member is being created. In this state, you can only query the multicast member but cannot perform other operations.</li>
     * <li>If the multicast member is in the <strong>Registered</strong> state, the multicast member is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RegisterTransitRouterMulticastGroupMembers  RegisterTransitRouterMulticastGroupMembersRequest
     * @return RegisterTransitRouterMulticastGroupMembersResponse
     */
    CompletableFuture<RegisterTransitRouterMulticastGroupMembersResponse> registerTransitRouterMulticastGroupMembers(RegisterTransitRouterMulticastGroupMembersRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>Only elastic network interfaces (ENIs) can be specified as multicast sources.</p>
     * </li>
     * <li><p>RegisterTransitRouterMulticastGroupSources is an asynchronous operation. After a request is sent, the system returns a <strong>RequestId</strong> but the multicast source is not completely created. The creation task still runs in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of the multicast source. </p>
     * <ul>
     * <li>If the multicast source is in the <strong>Registering</strong> state, the multicast source is being created. In this state, you can only query the multicast source but cannot perform other operations.</li>
     * <li>If the multicast source is in the <strong>Registered</strong> state, the multicast source is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you invoke the <code>RegisterTransitRouterMulticastGroupSources</code> operation to create a multicast source, make sure that the vSwitch to which the network interface controller (NIC) of the elastic network interfaces (ENIs) belongs is associated with the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</p>
     * 
     * @param request the request parameters of RegisterTransitRouterMulticastGroupSources  RegisterTransitRouterMulticastGroupSourcesRequest
     * @return RegisterTransitRouterMulticastGroupSourcesResponse
     */
    CompletableFuture<RegisterTransitRouterMulticastGroupSourcesResponse> registerTransitRouterMulticastGroupSources(RegisterTransitRouterMulticastGroupSourcesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you call the <strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong> operation:<ul>
     * <li>If you specify traffic classification rule IDs (the <strong>TrafficMarkRuleIds</strong> parameter), the operation deletes the specified traffic classification rules.</li>
     * <li>If you do not specify traffic classification rule IDs (the <strong>TrafficMarkRuleIds</strong> parameter), the operation does not perform any action.
     *   If you want to delete specific traffic classification rules, make sure that you have specified the IDs of the traffic classification rules before you call this operation.</li>
     * </ul>
     * </li>
     * <li><strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the traffic classification rules are not immediately deleted. The deletion task runs in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of traffic classification rules. <ul>
     * <li>If a traffic classification rule is in the <strong>Deleting</strong> state, the rule is being deleted. In this state, you can only query the traffic classification rule. You cannot perform other operations on it.</li>
     * <li>If the specified traffic classification rule cannot be found, the rule has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RemoveTrafficMatchRuleFromTrafficMarkingPolicy  RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest
     * @return RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse
     */
    CompletableFuture<RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse> removeTrafficMatchRuleFromTrafficMarkingPolicy(RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest request);

    /**
     * @deprecated OpenAPI RemoveTraficMatchRuleFromTrafficMarkingPolicy is deprecated, please use Cbn::2017-09-12::RemoveTrafficMatchRuleFromTrafficMarkingPolicy instead.  * @description ### Precautions
     * The **RemoveTraficMatchRuleFromTrafficMarkingPolicy** operation is deprecated and will be discontinued. To delete traffic classification rules from a traffic marking policy, use the [RemoveTrafficMatchRuleFromTrafficMarkingPolicy](https://help.aliyun.com/document_detail/452726.html) operation. This API documentation is no longer maintained.
     * 
     * @param request the request parameters of RemoveTraficMatchRuleFromTrafficMarkingPolicy  RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest
     * @return RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse
     */
    @Deprecated
    CompletableFuture<RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse> removeTraficMatchRuleFromTrafficMarkingPolicy(RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only network instance connections under an Enterprise Edition transit router support changing the associated transit router route table.</li>
     * <li><strong>ReplaceTransitRouterRouteTableAssociation</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the transit router route table associated with the network instance connection has not been replaced yet. The replacement task is still running in the background. You can call <strong>ListTransitRouterRouteTableAssociations</strong> to query the association forwarding status between the network instance connection and the new transit router route table.<ul>
     * <li>If the association forwarding status is <strong>Replacing</strong>, the network instance connection is changing the associated transit router route table. In this state, you can only query the association forwarding relationship between the network instance connection and the transit router route table. You cannot perform other operations.</li>
     * <li>If the association forwarding status is <strong>Active</strong>, the network instance connection has successfully changed the associated transit router route table.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceTransitRouterRouteTableAssociation  ReplaceTransitRouterRouteTableAssociationRequest
     * @return ReplaceTransitRouterRouteTableAssociationResponse
     */
    CompletableFuture<ReplaceTransitRouterRouteTableAssociationResponse> replaceTransitRouterRouteTableAssociation(ReplaceTransitRouterRouteTableAssociationRequest request);

    /**
     * <b>description</b> :
     * <p>Cloud services refer to Alibaba Cloud services that use the 100.64.0.0/10 CIDR block, such as Object Storage Service (OSS), Simple Log Service (SLS), and Data Transmission Service (DTS). If your on-premises network needs to access cloud services, you must load the Virtual Border Router (VBR) instance or Cloud Connect Network (CCN) instance associated with your on-premises network to a Cloud Enterprise Network (CEN) instance. You must also load a VPC-connected instance in the region where the cloud service resides to the same CEN instance. After loading, your on-premises network can access the VPC-connected instance in the region of the cloud service through CEN, and then access the cloud service through the VPC by forwarding traffic. The CEN handles the routing accordingly.</p>
     * <ul>
     * <li>Limits: This operation applies only to Basic Edition transit routers. On-premises networks associated with VBR instances can access only cloud services in the same region through CEN.
     *   For example, if the cloud service resides in the China (Beijing) region, only on-premises networks associated with VBR instances in the China (Beijing) region can access the cloud service.</li>
     * <li>The <strong>ResolveAndRouteServiceInCen</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the cloud service configuration is not yet complete. The background node for adding the configuration continues to run. You can invoke the <strong>DescribeRouteServicesInCen</strong> operation to query the status of the cloud service. <ul>
     * <li>If the cloud service is in the <strong>Creating</strong> state, the cloud service configuration is being added. In this state, you can only execute a query on the cloud service configuration and cannot execute other operations.</li>
     * <li>If the cloud service is in the <strong>Active</strong> state, the cloud service configuration is added.</li>
     * <li>If the cloud service is in the <strong>Failed</strong> state, the cloud service configuration failed to be added.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you invoke the ResolveAndRouteServiceInCen operation, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The VBR or CCN instance with network connectivity to your on-premises network is loaded to the CEN instance.</li>
     * <li>A VPC-connected instance in the region where the cloud service resides is loaded to the CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ResolveAndRouteServiceInCen  ResolveAndRouteServiceInCenRequest
     * @return ResolveAndRouteServiceInCenResponse
     */
    CompletableFuture<ResolveAndRouteServiceInCenResponse> resolveAndRouteServiceInCen(ResolveAndRouteServiceInCenRequest request);

    /**
     * <b>description</b> :
     * <p>The <code>RevokeInstanceFromTransitRouter</code> operation only supports revoking the permissions that allow a transit router to connect to cross-account Virtual Private Cloud (VPC) instances, Virtual Border Router (VBR) instances, IPsec connections, and Express Connect Router (ECR) instances.
     * To revoke the permissions that allow a transit router to connect to a cross-account Cloud Connect Network (CCN) instance, call the <a href="https://help.aliyun.com/document_detail/126142.html">RevokeInstanceFromCbn</a> operation.</p>
     * <h3>Before you begin</h3>
     * <p>Before you call the <code>RevokeInstanceFromTransitRouter</code> operation, make sure that the connection between the transit router and the VPC-connected instance is deleted.</p>
     * <ul>
     * <li>To delete the connection between an Enterprise Edition transit router and a VPC instance, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>.</li>
     * <li>To delete the connection between an Enterprise Edition transit router and a VBR instance, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>.</li>
     * <li>To delete the connection between an Enterprise Edition transit router and an IPsec connection, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>To delete the connection between an Enterprise Edition transit router and an ECR instance, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterEcrAttachment</a>.</li>
     * <li>To delete the connection between a Basic Edition transit router and a VPC-connected instance, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of RevokeInstanceFromTransitRouter  RevokeInstanceFromTransitRouterRequest
     * @return RevokeInstanceFromTransitRouterResponse
     */
    CompletableFuture<RevokeInstanceFromTransitRouterResponse> revokeInstanceFromTransitRouter(RevokeInstanceFromTransitRouterRequest request);

    /**
     * <b>description</b> :
     * <p>PrivateZone is a private DNS domain name resolution and management service based on the Alibaba Cloud Virtual Private Cloud (VPC) environment. After a Virtual Border Router (VBR) instance or a Cloud Connect Network (CCN) instance is attached to a Cloud Enterprise Network (CEN) instance, the associated on-premises networks can access the PrivateZone service through the CEN instance.</p>
     * <ul>
     * <li>The on-premises networks associated with VBR and CCN instances can only access the PrivateZone service in the same region.
     *   For example, if the PrivateZone service is located in the China (Beijing) region, only the on-premises networks associated with VBR instances in the China (Beijing) region and CCN instances in the Chinese mainland can access the PrivateZone service.</li>
     * <li>The <strong>RoutePrivateZoneInCenToVpc</strong> operation is asynchronous. The system first returns a <strong>RequestId</strong>, but the PrivateZone service configuration is not yet complete, and the background task is still running. You can call the <strong>DescribeCenPrivateZoneRoutes</strong> operation to query the status of the PrivateZone service. <ul>
     * <li>When the PrivateZone service is in the <strong>Creating</strong> state, the PrivateZone service configuration is being added. In this state, you can only query the PrivateZone service configuration and cannot perform other operations.</li>
     * <li>When the PrivateZone service is in the <strong>Active</strong> state, the PrivateZone service configuration is added.</li>
     * <li>When the PrivateZone service is in the <strong>Failed</strong> state, the PrivateZone service configuration fails to be added.</li>
     * </ul>
     * </li>
     * </ul>
     * <h4>Before you begin</h4>
     * <p>Before you invoke the <strong>RoutePrivateZoneInCenToVpc</strong> operation, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The PrivateZone service deployment is complete. For more information, see <a href="https://help.aliyun.com/document_detail/64627.html">Quick start for PrivateZone DNS parse</a>.</li>
     * <li>Make sure that you load the VPC-connected instance associated with the PrivateZone service, and the VBR or CCN instance in the access region to the same CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * <li>If your on-premises network is connected to Alibaba Cloud by using a CCN instance, and the account to which the CCN instance belongs is different from the account to which the VPC-connected instance or the CEN instance belongs, you must first complete the authorization for the CCN instance. For more information, see <a href="https://help.aliyun.com/document_detail/106674.html">Authorize a Cloud Connect Network</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of RoutePrivateZoneInCenToVpc  RoutePrivateZoneInCenToVpcRequest
     * @return RoutePrivateZoneInCenToVpcResponse
     */
    CompletableFuture<RoutePrivateZoneInCenToVpcResponse> routePrivateZoneInCenToVpc(RoutePrivateZoneInCenToVpcRequest request);

    /**
     * <b>description</b> :
     * <p>This operation supports setting the inter-region bandwidth between two regions only in bandwidth packages of Basic Edition transit routers.</p>
     * <h3>Before you begin</h3>
     * <p>A bandwidth package instance is already associated with the target Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a> and <a href="https://help.aliyun.com/document_detail/65934.html">AssociateCenBandwidthPackage</a>.
     * You can call <strong>SetCenInterRegionBandwidthLimit</strong> to set, modify, or delete the inter-region bandwidth:</p>
     * <ul>
     * <li>If <strong>BandwidthLimit</strong> is not 0, the inter-region bandwidth is set or modified.</li>
     * <li>If <strong>BandwidthLimit</strong> is 0, the inter-region bandwidth is deleted.</li>
     * </ul>
     * <h3>Settings</h3>
     * <ul>
     * <li>The maximum inter-region bandwidth cannot exceed the peak bandwidth of the bandwidth package instance to which it belongs.</li>
     * <li>The total inter-region bandwidth under a bandwidth package instance cannot exceed the peak bandwidth of that bandwidth package instance.</li>
     * <li>If the bandwidth multiplexing feature is enabled for the inter-region connection, modifying the inter-region bandwidth is not supported.</li>
     * <li>The <strong>SetCenInterRegionBandwidthLimit</strong> operation supports setting, modifying, or deleting inter-region bandwidth only for Basic Edition transit routers.
     *   To set, modify, or delete inter-region bandwidth for Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>, <a href="https://help.aliyun.com/document_detail/261229.html">UpdateTransitRouterPeerAttachmentAttribute</a>, and <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetCenInterRegionBandwidthLimit  SetCenInterRegionBandwidthLimitRequest
     * @return SetCenInterRegionBandwidthLimitResponse
     */
    CompletableFuture<SetCenInterRegionBandwidthLimitResponse> setCenInterRegionBandwidthLimit(SetCenInterRegionBandwidthLimitRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>A tag consists of a tag key and a tag value. Both the tag key and tag value are required when you add a tag.</li>
     * <li>If you want to add multiple tags to a Cloud Enterprise Network (CEN) instance, the tag keys of the tags must be unique within the instance.</li>
     * <li>You can attach up to 20 tags to a CEN instance.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>Subscription bandwidth plans support the temporary upgrade feature. You can use this feature to increase the bandwidth value of a bandwidth plan within a specified period to flexibly handle business bandwidth fluctuations.
     * The minimum interval for a temporary upgrade is 3 hours. After the payment is completed, the bandwidth is upgraded immediately without service interruptions.</p>
     * <blockquote>
     * <p>After a temporary upgrade expires, the subscription bandwidth plan reverts to the original peak bandwidth. If the service traffic on the instance exceeds the original peak bandwidth limit, the traffic may be dropped due to throttling. Plan the expiration time of the temporary upgrade properly and make sure that the peak bandwidth matches your business requirements.</p>
     * </blockquote>
     * <ul>
     * <li>The temporary upgrade feature is not available by default. To use this feature, contact your account manager.</li>
     * <li>Pay-as-you-go bandwidth plans and expired subscription bandwidth plans do not support the temporary upgrade feature.</li>
     * <li>The <strong>TempUpgradeCenBandwidthPackageSpec</strong> operation is asynchronous. After you call this operation, the system returns a <strong>RequestId</strong> but the bandwidth plan is not yet upgraded. The upgrade task continues to run in the background. You can call the <strong>DescribeCenBandwidthPackages</strong> operation to query the specifications of the bandwidth plan. If the specifications meet your expectations, the upgrade is complete.</li>
     * </ul>
     * 
     * @param request the request parameters of TempUpgradeCenBandwidthPackageSpec  TempUpgradeCenBandwidthPackageSpecRequest
     * @return TempUpgradeCenBandwidthPackageSpecResponse
     */
    CompletableFuture<TempUpgradeCenBandwidthPackageSpecResponse> tempUpgradeCenBandwidthPackageSpec(TempUpgradeCenBandwidthPackageSpecRequest request);

    /**
     * <b>description</b> :
     * <p>Disassociates a CEN instance from a bandwidth plan. Before you call this operation, ensure that no inter-region bandwidth is configured for the target bandwidth plan. You can call <a href="https://help.aliyun.com/document_detail/468275.html">DescribeCenInterRegionBandwidthLimits</a> to query the inter-region bandwidth, and then call <a href="https://help.aliyun.com/document_detail/65942.html">SetCenInterRegionBandwidthLimit</a> to set BandwidthLimit to 0 to delete the configured inter-region bandwidth.</p>
     * 
     * @param request the request parameters of UnassociateCenBandwidthPackage  UnassociateCenBandwidthPackageRequest
     * @return UnassociateCenBandwidthPackageResponse
     */
    CompletableFuture<UnassociateCenBandwidthPackageResponse> unassociateCenBandwidthPackage(UnassociateCenBandwidthPackageRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>UnroutePrivateZoneInCenToVpc</strong> operation is asynchronous. The system first returns a <strong>RequestId</strong>, but the PrivateZone service configuration is not immediately deleted and the deletion task continues to run in the background. You can call the <strong>DescribeCenPrivateZoneRoutes</strong> operation to query the status of the PrivateZone service. </p>
     * <ul>
     * <li>If the PrivateZone service is in the <strong>Deleting</strong> state, the PrivateZone service configuration is being deleted. In this state, you can only perform query operations on the PrivateZone service configuration and cannot perform other operations.</li>
     * <li>If the specified PrivateZone service configuration cannot be queried, the PrivateZone service configuration is deleted.
     * If a PrivateZone configuration exists in an access region that is a Cloud Connect Network region, you must first delete the PrivateZone configuration in the Cloud Connect Network region before you delete PrivateZone configurations in other access regions.</li>
     * </ul>
     * 
     * @param request the request parameters of UnroutePrivateZoneInCenToVpc  UnroutePrivateZoneInCenToVpcRequest
     * @return UnroutePrivateZoneInCenToVpcResponse
     */
    CompletableFuture<UnroutePrivateZoneInCenToVpcResponse> unroutePrivateZoneInCenToVpc(UnroutePrivateZoneInCenToVpcRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateCenInterRegionTrafficQosPolicyAttribute  UpdateCenInterRegionTrafficQosPolicyAttributeRequest
     * @return UpdateCenInterRegionTrafficQosPolicyAttributeResponse
     */
    CompletableFuture<UpdateCenInterRegionTrafficQosPolicyAttributeResponse> updateCenInterRegionTrafficQosPolicyAttribute(UpdateCenInterRegionTrafficQosPolicyAttributeRequest request);

    /**
     * @param request the request parameters of UpdateCenInterRegionTrafficQosQueueAttribute  UpdateCenInterRegionTrafficQosQueueAttributeRequest
     * @return UpdateCenInterRegionTrafficQosQueueAttributeResponse
     */
    CompletableFuture<UpdateCenInterRegionTrafficQosQueueAttributeResponse> updateCenInterRegionTrafficQosQueueAttribute(UpdateCenInterRegionTrafficQosQueueAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>The UpdateRouteMap operation is asynchronous. After you call this operation, the system returns a <strong>RequestId</strong>, but the route map is not immediately updated. The update task continues to run in the background. You can call the ListRouteMaps operation to query the status of the route map.</p>
     * <ul>
     * <li>If the route map is in the <strong>Updating</strong> state, the route map is being updated. In this state, you can only perform query operations.</li>
     * <li>If the route map is in the <strong>Active</strong> state, the route map is updated.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRouteMap  UpdateRouteMapRequest
     * @return UpdateRouteMapResponse
     */
    CompletableFuture<UpdateRouteMapResponse> updateRouteMap(UpdateRouteMapRequest request);

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><code>RouteMapRuleId</code> specifies the route map rule to be updated.</li>
     * <li><code>Name</code>, <code>Description</code>, and <code>Priority</code> are used to update the name, description, and priority of the rule. Rule priorities under the same route map must be unique.</li>
     * <li><code>MatchConditions</code> is used to update the match conditions of the rule, and <code>SetActions</code> is used to update the actions to be performed when a route meets the match conditions.</li>
     * <li><code>DryRun</code> is an optional parameter used to precheck the request without actually updating the route map rule.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRouteMapRule  UpdateRouteMapRuleRequest
     * @return UpdateRouteMapRuleResponse
     */
    CompletableFuture<UpdateRouteMapRuleResponse> updateRouteMapRule(UpdateRouteMapRuleRequest request);

    /**
     * @param request the request parameters of UpdateTrafficMarkingPolicyAttribute  UpdateTrafficMarkingPolicyAttributeRequest
     * @return UpdateTrafficMarkingPolicyAttributeResponse
     */
    CompletableFuture<UpdateTrafficMarkingPolicyAttributeResponse> updateTrafficMarkingPolicyAttribute(UpdateTrafficMarkingPolicyAttributeRequest request);

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouter</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the modification of the transit router instance is not yet complete. The modification task continues to run in the background. You can call the <strong>ListTransitRouters</strong> operation to query the status of the transit router instance. </p>
     * <ul>
     * <li>If the transit router instance is in the <strong>Modifying</strong> state, the transit router instance is being modified. In this state, you can only query the transit router instance. You cannot perform other operations on it.</li>
     * <li>If the transit router instance is in the <strong>Active</strong> state, the transit router instance has been modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTransitRouter  UpdateTransitRouterRequest
     * @return UpdateTransitRouterResponse
     */
    CompletableFuture<UpdateTransitRouterResponse> updateTransitRouter(UpdateTransitRouterRequest request);

    /**
     * <b>description</b> :
     * <p>UpdateTransitRouterEcrAttachmentAttribute is an asynchronous operation. The system returns a RequestId immediately, but the ECR connection has not been modified yet because the modification task is still running in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of the ECR connection.
     * If the ECR connection is in the Modifying state, the ECR connection is being modified. In this state, you can only query the ECR connection but cannot perform other operations on it.
     * If the ECR connection is in the Attached state, the ECR connection has been modified.</p>
     * 
     * @param request the request parameters of UpdateTransitRouterEcrAttachmentAttribute  UpdateTransitRouterEcrAttachmentAttributeRequest
     * @return UpdateTransitRouterEcrAttachmentAttributeResponse
     */
    CompletableFuture<UpdateTransitRouterEcrAttachmentAttributeResponse> updateTransitRouterEcrAttachmentAttribute(UpdateTransitRouterEcrAttachmentAttributeRequest request);

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterPeerAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the inter-region connection is not yet modified. The modification task continues to run in the background. You can call <strong>ListTransitRouterPeerAttachments</strong> to query the status of the inter-region connection.</p>
     * <ul>
     * <li>If the inter-region connection is in the <strong>Modifying</strong> state, the inter-region connection is being modified. In this state, you can only query the inter-region connection but cannot perform other operations on it.</li>
     * <li>If the inter-region connection is in the <strong>Attached</strong> state, the inter-region connection is modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTransitRouterPeerAttachmentAttribute  UpdateTransitRouterPeerAttachmentAttributeRequest
     * @return UpdateTransitRouterPeerAttachmentAttributeResponse
     */
    CompletableFuture<UpdateTransitRouterPeerAttachmentAttributeResponse> updateTransitRouterPeerAttachmentAttribute(UpdateTransitRouterPeerAttachmentAttributeRequest request);

    /**
     * @param request the request parameters of UpdateTransitRouterRouteEntry  UpdateTransitRouterRouteEntryRequest
     * @return UpdateTransitRouterRouteEntryResponse
     */
    CompletableFuture<UpdateTransitRouterRouteEntryResponse> updateTransitRouterRouteEntry(UpdateTransitRouterRouteEntryRequest request);

    /**
     * @param request the request parameters of UpdateTransitRouterRouteTable  UpdateTransitRouterRouteTableRequest
     * @return UpdateTransitRouterRouteTableResponse
     */
    CompletableFuture<UpdateTransitRouterRouteTableResponse> updateTransitRouterRouteTable(UpdateTransitRouterRouteTableRequest request);

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterVbrAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VBR connection is not yet modified. The modification task continues to run in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of the VBR connection. </p>
     * <ul>
     * <li>If the VBR connection is in the <strong>Modifying</strong> state, the VBR connection is being modified. In this state, you can only query the VBR connection but cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTransitRouterVbrAttachmentAttribute  UpdateTransitRouterVbrAttachmentAttributeRequest
     * @return UpdateTransitRouterVbrAttachmentAttributeResponse
     */
    CompletableFuture<UpdateTransitRouterVbrAttachmentAttributeResponse> updateTransitRouterVbrAttachmentAttribute(UpdateTransitRouterVbrAttachmentAttributeRequest request);

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouterVpcAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the VPC connection has not been modified. The modification task continues to run in the background. You can call <strong>ListTransitRouterVpcAttachments</strong> to query the status of the VPC connection. </p>
     * <ul>
     * <li>If the VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. In this state, you can only query the VPC connection but cannot perform other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTransitRouterVpcAttachmentAttribute  UpdateTransitRouterVpcAttachmentAttributeRequest
     * @return UpdateTransitRouterVpcAttachmentAttributeResponse
     */
    CompletableFuture<UpdateTransitRouterVpcAttachmentAttributeResponse> updateTransitRouterVpcAttachmentAttribute(UpdateTransitRouterVpcAttachmentAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you add zones and vSwitches to a VPC connection, make sure that the vSwitch has an idle IP address. During the modification procedure, the Enterprise Edition transit router creates an elastic network interfaces (ENIs) in the vSwitch (which occupies one IP address of the vSwitch) as the interface for routing traffic between the VPC-connected instance and the Enterprise Edition transit router.</li>
     * <li>The <strong>UpdateTransitRouterVpcAttachmentZones</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the VPC connection is not yet modified. The modification task continues to run in the background. You can invoke the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of the VPC connection.<ul>
     * <li>If the VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. In this state, you can only query the VPC connection but cannot perform other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
     * </ul>
     * </li>
     * <li>At least one zone and vSwitch mapping must be retained under a <strong>VPC connection ID</strong>. You cannot delete all zone and vSwitch mappings.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTransitRouterVpcAttachmentZones  UpdateTransitRouterVpcAttachmentZonesRequest
     * @return UpdateTransitRouterVpcAttachmentZonesResponse
     */
    CompletableFuture<UpdateTransitRouterVpcAttachmentZonesResponse> updateTransitRouterVpcAttachmentZones(UpdateTransitRouterVpcAttachmentZonesRequest request);

    /**
     * @param request the request parameters of UpdateTransitRouterVpnAttachmentAttribute  UpdateTransitRouterVpnAttachmentAttributeRequest
     * @return UpdateTransitRouterVpnAttachmentAttributeResponse
     */
    CompletableFuture<UpdateTransitRouterVpnAttachmentAttributeResponse> updateTransitRouterVpnAttachmentAttribute(UpdateTransitRouterVpnAttachmentAttributeRequest request);

    /**
     * @param request the request parameters of WithdrawPublishedRouteEntries  WithdrawPublishedRouteEntriesRequest
     * @return WithdrawPublishedRouteEntriesResponse
     */
    CompletableFuture<WithdrawPublishedRouteEntriesResponse> withdrawPublishedRouteEntries(WithdrawPublishedRouteEntriesRequest request);

}
