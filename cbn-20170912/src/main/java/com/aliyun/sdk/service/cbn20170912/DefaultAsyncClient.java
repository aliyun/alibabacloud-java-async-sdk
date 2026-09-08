// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.cbn20170912.models.*;
import darabonba.core.utils.*;
import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;

import java.util.concurrent.CompletableFuture;


/**
 * <p>Main client.</p>
 */
public final class DefaultAsyncClient implements AsyncClient {

    protected final String product;
    protected final String version;
    protected final String endpointRule;
    protected final java.util.Map<String, String> endpointMap;
    protected final TeaRequest REQUEST;
    protected final TeaAsyncHandler handler;

    protected DefaultAsyncClient(ClientConfiguration configuration) {
        this.handler = new TeaAsyncHandler(configuration);
        this.product = "Cbn";
        this.version = "2017-09-12";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>After a flow log is created, it is in the Active state by default. If you stopped a flow log, you can call this operation to reactivate it.</p>
     * </li>
     * <li><p><code>ActiveFlowLog</code> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but activate flow log is not fully activated. The activation task is still running in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of activate flow log.</p>
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
    @Override
    public CompletableFuture<ActiveFlowLogResponse> activeFlowLog(ActiveFlowLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActiveFlowLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActiveFlowLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActiveFlowLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>AddTrafficMatchRuleToTrafficMarkingPolicy</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the traffic classification rule is not yet created. The creation task continues to run in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of the traffic classification rule. </p>
     * <ul>
     * <li>If the traffic classification rule is in the <strong>Creating</strong> state, the rule is being created. In this state, you can only query the rule and cannot perform other operations on it.</li>
     * <li>If the traffic classification rule is in the <strong>Active</strong> state, the rule is created.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTrafficMatchRuleToTrafficMarkingPolicy  AddTrafficMatchRuleToTrafficMarkingPolicyRequest
     * @return AddTrafficMatchRuleToTrafficMarkingPolicyResponse
     */
    @Override
    public CompletableFuture<AddTrafficMatchRuleToTrafficMarkingPolicyResponse> addTrafficMatchRuleToTrafficMarkingPolicy(AddTrafficMatchRuleToTrafficMarkingPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTrafficMatchRuleToTrafficMarkingPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTrafficMatchRuleToTrafficMarkingPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTrafficMatchRuleToTrafficMarkingPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI AddTraficMatchRuleToTrafficMarkingPolicy is deprecated, please use Cbn::2017-09-12::AddTrafficMatchRuleToTrafficMarkingPolicy instead.  * @description ### Precautions
     * The **AddTraficMatchRuleToTrafficMarkingPolicy** operation is deprecated and will be discontinued. To add traffic classification rules to a traffic marking policy, use the [AddTrafficMatchRuleToTrafficMarkingPolicy](https://help.aliyun.com/document_detail/427602.html) operation. This documentation is no longer maintained.
     * 
     * @param request the request parameters of AddTraficMatchRuleToTrafficMarkingPolicy  AddTraficMatchRuleToTrafficMarkingPolicyRequest
     * @return AddTraficMatchRuleToTrafficMarkingPolicyResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<AddTraficMatchRuleToTrafficMarkingPolicyResponse> addTraficMatchRuleToTrafficMarkingPolicy(AddTraficMatchRuleToTrafficMarkingPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTraficMatchRuleToTrafficMarkingPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTraficMatchRuleToTrafficMarkingPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTraficMatchRuleToTrafficMarkingPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A CEN instance supports binding multiple bandwidth packages, but does not support binding multiple bandwidth packages with the same connected areas.
     * For example, if a CEN instance already has a bandwidth package bound for the Chinese mainland-to-Chinese mainland connected areas, you cannot bind another bandwidth package for the Chinese mainland-to-Chinese mainland connected areas. However, you can bind a bandwidth package for the Chinese mainland-to-North America connected areas.</p>
     * 
     * @param request the request parameters of AssociateCenBandwidthPackage  AssociateCenBandwidthPackageRequest
     * @return AssociateCenBandwidthPackageResponse
     */
    @Override
    public CompletableFuture<AssociateCenBandwidthPackageResponse> associateCenBandwidthPackage(AssociateCenBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateCenBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateCenBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateCenBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you create a network instance connection, you must set the association and forwarding relationship for it by associating the network instance connection with an Enterprise Edition transit router route table. After the association is created, the Enterprise Edition transit router forwards traffic of the network instance based on the route entries in the route table. Before you invoke this operation, take note of the following information:</p>
     * <ul>
     * <li>Only Enterprise Edition transit router route tables support route table associations. For information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network (CEN)?</a>.</li>
     * <li>Each network instance connection can be associated with only one Enterprise Edition transit router route table.</li>
     * <li><strong>AssociateTransitRouterAttachmentWithRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the association between the network instance connection and the route table is not complete. The association task is still running in the background. You can call <strong>ListTransitRouterRouteTableAssociations</strong> to query the association status between the network instance connection and the route table.<ul>
     * <li>If the association status is <strong>Associating</strong>, the network instance connection is being associated with the route table. In this state, you can only query the association but cannot perform other operations.</li>
     * <li>If the association status is <strong>Active</strong>, the network instance connection is associated with the route table.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AssociateTransitRouterAttachmentWithRouteTable  AssociateTransitRouterAttachmentWithRouteTableRequest
     * @return AssociateTransitRouterAttachmentWithRouteTableResponse
     */
    @Override
    public CompletableFuture<AssociateTransitRouterAttachmentWithRouteTableResponse> associateTransitRouterAttachmentWithRouteTable(AssociateTransitRouterAttachmentWithRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateTransitRouterAttachmentWithRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateTransitRouterAttachmentWithRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateTransitRouterAttachmentWithRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>A vSwitch can be associated with only one multicast domain. Make sure that the vSwitch to be associated is not already associated with another multicast domain. To disassociate a vSwitch from a multicast domain, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li><strong>AssociateTransitRouterMulticastDomain</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the association between the vSwitch and the multicast domain is not yet complete. The association task continues to run in the background. You can call <strong>ListTransitRouterMulticastDomainAssociations</strong> to query the association status between the vSwitch and the multicast domain.<ul>
     * <li>If the association status is <strong>Associating</strong>, the association between the vSwitch and the multicast domain is being established. In this state, you can only query the vSwitch but cannot perform other operations.</li>
     * <li>If the association status is <strong>Associated</strong>, the association between the vSwitch and the multicast domain is established.</li>
     * </ul>
     * </li>
     * <li>The VPC to which the vSwitch belongs must be connected to an Enterprise Edition transit router. To create a VPC connection, see <a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateTransitRouterMulticastDomain  AssociateTransitRouterMulticastDomainRequest
     * @return AssociateTransitRouterMulticastDomainResponse
     */
    @Override
    public CompletableFuture<AssociateTransitRouterMulticastDomainResponse> associateTransitRouterMulticastDomain(AssociateTransitRouterMulticastDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateTransitRouterMulticastDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateTransitRouterMulticastDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateTransitRouterMulticastDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>CEN supports attaching cross-account network instances. Before attaching a cross-account network instance, the CEN instance must be authorized by the cross-account network instance:</p>
     * <ul>
     * <li>For cross-account VPC instance authorization, refer to <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</li>
     * <li>For cross-account Cloud Connect Network instance authorization, refer to <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a>.</li>
     * <li>Cross-account border router instance authorization is not available by default. To use this feature, contact your account manager.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachCenChildInstance  AttachCenChildInstanceRequest
     * @return AttachCenChildInstanceResponse
     */
    @Override
    public CompletableFuture<AttachCenChildInstanceResponse> attachCenChildInstance(AttachCenChildInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachCenChildInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachCenChildInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachCenChildInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckTransitRouterService  CheckTransitRouterServiceRequest
     * @return CheckTransitRouterServiceResponse
     */
    @Override
    public CompletableFuture<CheckTransitRouterServiceResponse> checkTransitRouterService(CheckTransitRouterServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckTransitRouterService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckTransitRouterServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckTransitRouterServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The <strong>CreateCen</strong> operation is asynchronous. The system returns a CEN instance ID before the CEN instance is fully created, while the creation task continues in the background. You can call the <strong>DescribeCens</strong> operation to query the status of the CEN instance. </p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Creating</strong> state, the CEN instance is being created. In this state, you can only query the CEN instance but cannot perform other operations on it.</li>
     * <li>If the CEN instance is in the <strong>Active</strong> state, the CEN instance is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCen  CreateCenRequest
     * @return CreateCenResponse
     */
    @Override
    public CompletableFuture<CreateCenResponse> createCen(CreateCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>When you create a bandwidth plan instance, you must specify the connected areas. An area of a bandwidth plan is a collection of regions. Each area contains one or more Alibaba Cloud regions. Select the connected areas based on the regions that you want to connect. For more information about the relationship between areas and regions, see <a href="https://help.aliyun.com/document_detail/181560.html">Purchase a bandwidth plan</a>.</li>
     * <li>For more information about the billing details of bandwidth plans, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * <li><strong>CreateCenBandwidthPackage</strong> is an asynchronous operation. After you invoke the operation, the system returns a bandwidth plan instance ID but the bandwidth plan is not yet created. The creation node is still running in the background. You can invoke the <strong>DescribeCenBandwidthPackages</strong> operation to query the status of the bandwidth plan. When the bandwidth plan is in the <strong>Idle</strong> or <strong>InUse</strong> state, the bandwidth plan is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenBandwidthPackage  CreateCenBandwidthPackageRequest
     * @return CreateCenBandwidthPackageResponse
     */
    @Override
    public CompletableFuture<CreateCenBandwidthPackageResponse> createCenBandwidthPackage(CreateCenBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCenBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCenBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCenBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can add route entries only to Virtual Private Cloud (VPC) instances and Virtual Border Router (VBR) instances that are connected to an Enterprise Edition transit router.</li>
     * <li>The next hop of the route entry defaults to the <strong>transit router connection</strong> (network instance connection) and cannot be modified.</li>
     * <li><strong>CreateCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the route entry is not yet created. The creation task continues to run in the background. You can call the <strong>DescribeRouteEntryList</strong> operation of VPC to query the status of the route entry. <ul>
     * <li>If the route entry is in the <strong>Pending</strong> state, the route entry is being created. In this state, you can only query the route entry but cannot perform other operations.</li>
     * <li>If the route entry is in the <strong>Available</strong> state, the route entry is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenChildInstanceRouteEntryToAttachment  CreateCenChildInstanceRouteEntryToAttachmentRequest
     * @return CreateCenChildInstanceRouteEntryToAttachmentResponse
     */
    @Override
    public CompletableFuture<CreateCenChildInstanceRouteEntryToAttachmentResponse> createCenChildInstanceRouteEntryToAttachment(CreateCenChildInstanceRouteEntryToAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCenChildInstanceRouteEntryToAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCenChildInstanceRouteEntryToAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCenChildInstanceRouteEntryToAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The CreateCenChildInstanceRouteEntryToCen operation is not available by default. To use this operation, &lt;props=&quot;china&quot;&gt;<a href="https://selfservice.console.aliyun.com/ticket/category/cbn/today">submit a ticket</a>&lt;props=&quot;intl&quot;&gt;<a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>The CreateCenChildInstanceRouteEntryToCen operation does not support adding route entries to network instances in an Enterprise Edition transit router.</li>
     * <li>The next hop of the route entry defaults to the regional gateway of Cloud Enterprise Network (CEN) and cannot be modified.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenChildInstanceRouteEntryToCen  CreateCenChildInstanceRouteEntryToCenRequest
     * @return CreateCenChildInstanceRouteEntryToCenResponse
     */
    @Override
    public CompletableFuture<CreateCenChildInstanceRouteEntryToCenResponse> createCenChildInstanceRouteEntryToCen(CreateCenChildInstanceRouteEntryToCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCenChildInstanceRouteEntryToCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCenChildInstanceRouteEntryToCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCenChildInstanceRouteEntryToCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only inter-region connections of Enterprise Edition transit routers support the creation of cross-region traffic scheduling policies.</li>
     * <li>The traffic scheduling feature takes effect only in the outbound direction of an Enterprise Edition transit router.
     *    For example, if you create an inter-region connection between the China (Hangzhou) and China (Qingdao) regions and configure the traffic scheduling feature on the transit router in the China (Hangzhou) region, the traffic scheduling feature can guarantee bandwidth for various services when traffic flows from the China (Hangzhou) region to the China (Qingdao) region. However, the traffic scheduling feature does not guarantee service bandwidth when traffic flows from the China (Qingdao) region to the China (Hangzhou) region.</li>
     * <li><strong>CreateCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After you send a request, the system returns a traffic scheduling policy ID but the policy is not yet created. The creation task continues to run in the background. You can call <strong>ListCenInterRegionTrafficQosPolicies</strong> to query the status of the traffic scheduling policy. <ul>
     * <li>If the traffic scheduling policy is in the <strong>Creating</strong> state, the policy is being created. In this state, you can only query the policy but cannot perform other operations on it.</li>
     * <li>If the traffic scheduling policy is in the <strong>Active</strong> state, the policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you call <strong>CreateCenInterRegionTrafficQosPolicy</strong>, make sure that the following conditions are met:</p>
     * <ul>
     * <li>An inter-region connection is created. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.</li>
     * <li>A traffic marking policy is created. For more information, see <a href="https://help.aliyun.com/document_detail/419025.html">CreateTrafficMarkingPolicy</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenInterRegionTrafficQosPolicy  CreateCenInterRegionTrafficQosPolicyRequest
     * @return CreateCenInterRegionTrafficQosPolicyResponse
     */
    @Override
    public CompletableFuture<CreateCenInterRegionTrafficQosPolicyResponse> createCenInterRegionTrafficQosPolicy(CreateCenInterRegionTrafficQosPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCenInterRegionTrafficQosPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCenInterRegionTrafficQosPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCenInterRegionTrafficQosPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>CreateCenInterRegionTrafficQosQueue</em>* is an asynchronous operation. After you send a request, the system returns a queue ID but the queue is not yet created. The creation task continues to run in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the traffic scheduling policy to determine the creation status of the queue. When you call this operation, you must specify the <strong>TrafficQosPolicyId</strong> parameter.</p>
     * <ul>
     * <li>If the traffic scheduling policy is in the <strong>Modifying</strong> state, the queue is being created. In this state, you can only query the traffic scheduling policy and queue. You cannot perform other operations.</li>
     * <li>If the traffic scheduling policy is in the <strong>Active</strong> state, the queue is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenInterRegionTrafficQosQueue  CreateCenInterRegionTrafficQosQueueRequest
     * @return CreateCenInterRegionTrafficQosQueueResponse
     */
    @Override
    public CompletableFuture<CreateCenInterRegionTrafficQosQueueResponse> createCenInterRegionTrafficQosQueue(CreateCenInterRegionTrafficQosQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCenInterRegionTrafficQosQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCenInterRegionTrafficQosQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCenInterRegionTrafficQosQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Routing policies are sorted by priority. A smaller priority value indicates a higher priority. Each routing policy is a collection of conditional statements and execution statements. When a routing policy is executed, routes are matched against conditional statements starting from the routing policy with the highest priority. For routes that match all conditions, the routing policy either permits or denies the routes based on the policy action. Routes that are permitted can have their attributes modified. For routes that do not match all conditions, the system permits the routes by default. For more information, see <a href="https://help.aliyun.com/document_detail/124157.html">Routing policy overview</a>.
     * <code>CreateCenRouteMap</code> is an asynchronous operation. After you call this operation, a routing policy ID is returned, but the routing policy has not been created. The system continues to create the routing policy in the background. You can call <code>DescribeCenRouteMaps</code> to query the status of the routing policy.</p>
     * <ul>
     * <li>If the routing policy is in the <strong>Creating</strong> state, the routing policy is being created. In this state, you can only perform query operations.</li>
     * <li>If the routing policy is in the <strong>Active</strong> state, the routing policy is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCenRouteMap  CreateCenRouteMapRequest
     * @return CreateCenRouteMapResponse
     */
    @Override
    public CompletableFuture<CreateCenRouteMapResponse> createCenRouteMap(CreateCenRouteMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCenRouteMap").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCenRouteMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCenRouteMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Flow logs help you catch traffic information transmitted by transit router instances and network instance connections (inter-region connections, VPC connections, VPN connections, ECR connections, and VBR connections). Before creating a flow log, note the following:</p>
     * <ul>
     * <li><p>Only Enterprise Edition transit routers support flow log creation.</p>
     * </li>
     * <li><p>For traffic information of inter-region connections, flow logs catch only outbound traffic of the transit router. Inbound traffic of the transit router is not caught.</p>
     * <p>  For example, an Elastic Computing Service (ECS) instance in the US (Silicon Valley) region accesses an ECS instance in the US (Virginia) region through Cloud Enterprise Network (CEN). After you configure a flow log for the transit router in the US (Virginia) region, you can view the packet information sent from the US (Virginia) ECS instance to the US (Silicon Valley) ECS instance in the Simple Log Service console. However, you cannot view the packet information sent from the US (Silicon Valley) ECS instance to the US (Virginia) ECS instance. To view the packet information sent from the US (Silicon Valley) ECS instance to the US (Virginia) ECS instance, configure a flow log on the transit router in the US (Silicon Valley) region.</p>
     * </li>
     * <li><p>When a flow log catches traffic information of a VPC connection, it catches only the traffic transmitted by the transit router elastic network interface (ENI). To view traffic information of other ENIs in the VPC, see <a href="https://help.aliyun.com/document_detail/127150.html">VPC flow log overview</a>.</p>
     * </li>
     * <li><p>The <code>CreateFlowlog</code> operation is asynchronous. After you send a request, the system returns a flow log ID while the flow log is still being created in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Creating</strong> state, the flow log is being created. In this state, you can only perform query operations.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before creating a flow log for a resource, make sure that you have created the required resources. For information about how to create each resource, see:</p>
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
    @Override
    public CompletableFuture<CreateFlowlogResponse> createFlowlog(CreateFlowlogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFlowlog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFlowlogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFlowlogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateTrafficMarkingPolicyResponse> createTrafficMarkingPolicy(CreateTrafficMarkingPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTrafficMarkingPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrafficMarkingPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrafficMarkingPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateTransitRouteTableAggregationResponse> createTransitRouteTableAggregation(CreateTransitRouteTableAggregationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouteTableAggregation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouteTableAggregationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouteTableAggregationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can call the <strong>CreateTransitRouter</strong> operation to create an Enterprise Edition transit router instance. Enterprise Edition transit routers are available only in some regions. For more information about regions, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network?</a>.</li>
     * <li><strong>CreateTransitRouter</strong> is an asynchronous operation. After you send a request, the system returns an Enterprise Edition transit router instance ID but the instance is not yet created. The creation task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/261219.html">ListTransitRouters</a> operation to query the status of the Enterprise Edition transit router instance.<ul>
     * <li>If the Enterprise Edition transit router instance is in the <strong>Creating</strong> state, the instance is being created. In this state, you can only query the instance but cannot perform other operations on it.</li>
     * <li>If the Enterprise Edition transit router instance is in the <strong>Active</strong> state, the instance is created.</li>
     * </ul>
     * </li>
     * <li>Only one transit router instance can be created in each region within a Cloud Enterprise Network (CEN) instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouter  CreateTransitRouterRequest
     * @return CreateTransitRouterResponse
     */
    @Override
    public CompletableFuture<CreateTransitRouterResponse> createTransitRouter(CreateTransitRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateTransitRouterCidrResponse> createTransitRouterCidr(CreateTransitRouterCidrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouterCidr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouterCidrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouterCidrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only Enterprise Edition transit routers support ECR connections.</li>
     * <li>You can create an ECR connection on an Enterprise Edition transit router in the following ways: <ul>
     * <li>If you have already created an Enterprise Edition transit router instance in the target region, you can create an ECR connection by specifying <strong>EcrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong>. </li>
     * <li>If you do not have an Enterprise Edition transit router instance in the target region, you can create an ECR connection by specifying <strong>EcrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong>. The system performs automatic creation of an Enterprise Edition transit router instance when the ECR connection is created.</li>
     * </ul>
     * </li>
     * <li>The CreateTransitRouterEcrAttachment operation is asynchronous. After you send a request, the system returns an ECR connection ID but the ECR connection is not yet created. The creation node runs in the background. You can invoke the ListTransitRouterEcrAttachments operation to query the status of the ECR connection. <ul>
     * <li>If the ECR connection is in the <strong>Attaching</strong> state, the ECR connection is being created. In this state, you can only execute query operations on the ECR connection but cannot execute other operations on it. </li>
     * <li>If the ECR connection is in the <strong>Attached</strong> state, the ECR connection is created.</li>
     * </ul>
     * </li>
     * <li>After an ECR connection is created, the ECR connection does not have a routing learning relationship or an associated forwarding relationship with any Enterprise Edition transit router route table by default. 
     * After the ECR connection establishes a <a href="https://help.aliyun.com/document_detail/468300.html">routing learning relationship</a> with an Enterprise Edition transit router route table, the system automatically propagates the routes of the ECR instance to the Enterprise Edition transit router route table.</li>
     * <li>After an ECR connection is created, the system automatically propagates the routes in the Enterprise Edition transit router route table associated with the ECR connection to the route table of the ECR instance.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>The Alibaba Cloud account that owns the Enterprise Edition transit router and the Alibaba Cloud account that owns the ECR instance must belong to the same enterprise. </li>
     * <li>Enterprise Edition transit routers support connections to ECR instances that belong to the same account or a different account. Before creating a cross-account ECR connection, obtain authorization from the cross-account ECR instance. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Cross-account authorization for network instances</a>.</li>
     * <li><strong>Before invoking this operation to create an ECR connection, invoke the <a href="https://help.aliyun.com/document_detail/2712082.html">CreateExpressConnectRouterAssociation</a> operation to associate the ECR instance with the Enterprise Edition transit router instance.</strong>
     * <strong>When you invoke the DeleteTransitRouterEcrAttachment operation to force delete an ECR connection, the system also deletes the association between the ECR instance and the Enterprise Edition transit router instance. You do not need to delete the association separately.</strong></li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterEcrAttachment  CreateTransitRouterEcrAttachmentRequest
     * @return CreateTransitRouterEcrAttachmentResponse
     */
    @Override
    public CompletableFuture<CreateTransitRouterEcrAttachmentResponse> createTransitRouterEcrAttachment(CreateTransitRouterEcrAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouterEcrAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouterEcrAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouterEcrAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>Make sure that you have created an Enterprise Edition transit router in the region where you want to establish a multicast network and that you have enabled the multicast feature for the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/261169.html">CreateTransitRouter</a>.
     *   If you created an Enterprise Edition transit router instance before applying for multicast resources, the Enterprise Edition transit router instance does not support the multicast feature. You can delete the current Enterprise Edition transit router instance and create a new one. For information about how to delete an Enterprise Edition transit router instance, see <a href="https://help.aliyun.com/document_detail/261218.html">DeleteTransitRouter</a>.</li>
     * <li>When you call the <strong>CreateTransitRouterMulticastDomain</strong> operation, if you specify the <strong>CenId</strong> and <strong>RegionId</strong> parameters, you do not need to specify the <strong>TransitRouterId</strong> parameter. If you specify the <strong>TransitRouterId</strong> parameter, you do not need to specify the <strong>CenId</strong> or <strong>RegionId</strong> parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterMulticastDomain  CreateTransitRouterMulticastDomainRequest
     * @return CreateTransitRouterMulticastDomainResponse
     */
    @Override
    public CompletableFuture<CreateTransitRouterMulticastDomainResponse> createTransitRouterMulticastDomain(CreateTransitRouterMulticastDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouterMulticastDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouterMulticastDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouterMulticastDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateTransitRouterPeerAttachmentResponse> createTransitRouterPeerAttachment(CreateTransitRouterPeerAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouterPeerAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouterPeerAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouterPeerAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateTransitRouterPrefixListAssociationResponse> createTransitRouterPrefixListAssociation(CreateTransitRouterPrefixListAssociationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouterPrefixListAssociation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouterPrefixListAssociationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouterPrefixListAssociationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateTransitRouterRouteEntryResponse> createTransitRouterRouteEntry(CreateTransitRouterRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouterRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouterRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouterRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateTransitRouterRouteTableResponse> createTransitRouterRouteTable(CreateTransitRouterRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouterRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouterRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouterRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>For information about the regions and zones supported by Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network?</a>.</li>
     * <li>You can create a VBR connection on an Enterprise Edition transit router in the following ways:<ul>
     * <li>If you have already created an Enterprise Edition transit router instance in the target region, you can create a VBR connection by specifying <strong>VbrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong>.</li>
     * <li>If you do not have an Enterprise Edition transit router instance in the target region, you can create a VBR connection by specifying <strong>VbrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong>. The system automatically creates an Enterprise Edition transit router instance when the VBR connection is created.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTransitRouterVbrAttachment</strong> is an asynchronous operation. After you send a request, the system returns a VBR connection ID but the VBR connection is not yet created. The creation task runs in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of the VBR connection.<ul>
     * <li>If the VBR connection is in the <strong>Attaching</strong> state, the VBR connection is being created. In this state, you can only query the VBR connection and cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is created.</li>
     * </ul>
     * </li>
     * <li>The Alibaba Cloud account that owns the transit router and the Alibaba Cloud account that owns the VBR instance must belong to the same enterprise.</li>
     * <li>Transit routers support connecting to VBR instances that belong to the same account or a different account. Before creating a cross-account VBR connection, obtain authorization from the VBR instance owner. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Grant permissions for cross-account network instances</a>.</li>
     * <li>After a VBR connection is created, the VBR connection does not establish route learning or association forwarding relationships with any transit router route table by default.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterVbrAttachment  CreateTransitRouterVbrAttachmentRequest
     * @return CreateTransitRouterVbrAttachmentResponse
     */
    @Override
    public CompletableFuture<CreateTransitRouterVbrAttachmentResponse> createTransitRouterVbrAttachment(CreateTransitRouterVbrAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouterVbrAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouterVbrAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouterVbrAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create a VPC connection on an Enterprise Edition transit router in the following two ways:<ul>
     * <li>If you have already created an Enterprise Edition transit router instance in the target region, you can create a VPC connection by specifying <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>TransitRouterId</strong>, and <strong>RegionId</strong>.</li>
     * <li>If you do not have an Enterprise Edition transit router instance in the target region, you can create a VPC connection by specifying <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong>. The system performs automatic creation of an Enterprise Edition transit router instance when the VPC connection is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateTransitRouterVpcAttachment</strong> operation is asynchronous. After you send a request, the system returns a VPC connection ID, but the VPC connection is not yet created. The creation node is still running in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/261222.html">ListTransitRouterVpcAttachments</a> operation to query the status of the VPC connection.<ul>
     * <li>If the VPC connection is in the <strong>Attaching</strong> state, the VPC connection is being created. In this state, you can only execute query operations on the VPC connection but cannot execute other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is created.</li>
     * </ul>
     * </li>
     * <li>After a VPC connection is created, the VPC connection does not establish routing learning or associate forwarding relationships with any transit router routing table by default.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you call this operation to create a VPC connection, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The VPC instance has at least one vSwitch instance in a zone supported by the Enterprise Edition transit router, and the vSwitch instance has at least one idle IP address. For information about the regions and zones supported by Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">Regions and zones supported by Enterprise Edition transit routers</a>.</li>
     * <li>If you want to connect a cross-account VPC-connected instance, obtain the cross-account VPC-connected instance authorization first. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Cross-account VPC-connected instance authorization</a>.</li>
     * <li>Fees are incurred after a VPC connection is created. Make sure that you understand the billing rules. For more information, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTransitRouterVpcAttachment  CreateTransitRouterVpcAttachmentRequest
     * @return CreateTransitRouterVpcAttachmentResponse
     */
    @Override
    public CompletableFuture<CreateTransitRouterVpcAttachmentResponse> createTransitRouterVpcAttachment(CreateTransitRouterVpcAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouterVpcAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouterVpcAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouterVpcAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateTransitRouterVpnAttachmentResponse> createTransitRouterVpnAttachment(CreateTransitRouterVpnAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTransitRouterVpnAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTransitRouterVpnAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTransitRouterVpnAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeactiveFlowLogResponse> deactiveFlowLog(DeactiveFlowLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeactiveFlowLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeactiveFlowLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeactiveFlowLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteCenResponse> deleteCen(DeleteCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteCenBandwidthPackageResponse> deleteCenBandwidthPackage(DeleteCenBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCenBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCenBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCenBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteCenChildInstanceRouteEntryToAttachmentResponse> deleteCenChildInstanceRouteEntryToAttachment(DeleteCenChildInstanceRouteEntryToAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCenChildInstanceRouteEntryToAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCenChildInstanceRouteEntryToAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCenChildInstanceRouteEntryToAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteCenChildInstanceRouteEntryToCenResponse> deleteCenChildInstanceRouteEntryToCen(DeleteCenChildInstanceRouteEntryToCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCenChildInstanceRouteEntryToCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCenChildInstanceRouteEntryToCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCenChildInstanceRouteEntryToCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteCenInterRegionTrafficQosPolicyResponse> deleteCenInterRegionTrafficQosPolicy(DeleteCenInterRegionTrafficQosPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCenInterRegionTrafficQosPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCenInterRegionTrafficQosPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCenInterRegionTrafficQosPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteCenInterRegionTrafficQosQueueResponse> deleteCenInterRegionTrafficQosQueue(DeleteCenInterRegionTrafficQosQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCenInterRegionTrafficQosQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCenInterRegionTrafficQosQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCenInterRegionTrafficQosQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteCenRouteMapResponse> deleteCenRouteMap(DeleteCenRouteMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCenRouteMap").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCenRouteMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCenRouteMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteFlowlogResponse> deleteFlowlog(DeleteFlowlogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFlowlog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFlowlogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFlowlogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteRouteServiceInCenResponse> deleteRouteServiceInCen(DeleteRouteServiceInCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRouteServiceInCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRouteServiceInCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRouteServiceInCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteTrafficMarkingPolicyResponse> deleteTrafficMarkingPolicy(DeleteTrafficMarkingPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTrafficMarkingPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrafficMarkingPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrafficMarkingPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteTransitRouteTableAggregationResponse> deleteTransitRouteTableAggregation(DeleteTransitRouteTableAggregationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouteTableAggregation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouteTableAggregationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouteTableAggregationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteTransitRouter</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong> but the transit router instance is not yet deleted. The deletion task continues to run in the background. You can call the <strong>ListTransitRouters</strong> operation to query the status of the transit router instance. </p>
     * <ul>
     * <li>If the transit router instance is in the <strong>Deleting</strong> state, the transit router instance is being deleted. In this state, you can only query the transit router instance. You cannot perform other operations on the transit router instance.</li>
     * <li>If the transit router instance cannot be found, the transit router instance is deleted.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Before you delete a transit router instance, make sure that the following conditions are met:</p>
     * <ul>
     * <li>No connections exist on the transit router instance.<ul>
     * <li>To delete a Virtual Private Cloud (VPC) connection, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>.</li>
     * <li>To delete an Express Connect Router (ECR) connection, see <a href="https://help.aliyun.com/document_detail/2715447.html">DeleteTransitRouterEcrAttachment</a>.</li>
     * <li>To delete a Cloud Connect Network (CCN) connection, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</li>
     * <li>To delete a VPN connection, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>To delete an inter-region connection, see <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a>.</li>
     * <li>To delete a Virtual Border Router (VBR) connection, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>.</li>
     * </ul>
     * </li>
     * <li>No custom route tables exist on the transit router instance. For more information, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</li>
     * <li>No custom route entries, route prefixes, or aggregate routes exist in the default route table of the transit router instance. For more information, see<ul>
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
    @Override
    public CompletableFuture<DeleteTransitRouterResponse> deleteTransitRouter(DeleteTransitRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A transit router CIDR block that has allocated IP addresses cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteTransitRouterCidr  DeleteTransitRouterCidrRequest
     * @return DeleteTransitRouterCidrResponse
     */
    @Override
    public CompletableFuture<DeleteTransitRouterCidrResponse> deleteTransitRouterCidr(DeleteTransitRouterCidrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouterCidr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouterCidrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouterCidrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteTransitRouterEcrAttachmentResponse> deleteTransitRouterEcrAttachment(DeleteTransitRouterEcrAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouterEcrAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouterEcrAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouterEcrAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteTransitRouterMulticastDomainResponse> deleteTransitRouterMulticastDomain(DeleteTransitRouterMulticastDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouterMulticastDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouterMulticastDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouterMulticastDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteTransitRouterPeerAttachmentResponse> deleteTransitRouterPeerAttachment(DeleteTransitRouterPeerAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouterPeerAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouterPeerAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouterPeerAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: After a prefix list is dissociated from an Enterprise Edition transit router route table, the system automatically withdraws all route entries related to the prefix list from the Enterprise Edition transit router route table. Before dissociating the prefix list, make sure that redundant routes exist in the Enterprise Edition transit router route table. Otherwise, network interruptions may occur.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteTransitRouterPrefixListAssociation  DeleteTransitRouterPrefixListAssociationRequest
     * @return DeleteTransitRouterPrefixListAssociationResponse
     */
    @Override
    public CompletableFuture<DeleteTransitRouterPrefixListAssociationResponse> deleteTransitRouterPrefixListAssociation(DeleteTransitRouterPrefixListAssociationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouterPrefixListAssociation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouterPrefixListAssociationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouterPrefixListAssociationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteTransitRouterRouteEntryResponse> deleteTransitRouterRouteEntry(DeleteTransitRouterRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouterRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouterRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouterRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteTransitRouterRouteTableResponse> deleteTransitRouterRouteTable(DeleteTransitRouterRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouterRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouterRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouterRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteTransitRouterVbrAttachmentResponse> deleteTransitRouterVbrAttachment(DeleteTransitRouterVbrAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouterVbrAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouterVbrAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouterVbrAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteTransitRouterVpcAttachmentResponse> deleteTransitRouterVpcAttachment(DeleteTransitRouterVpcAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouterVpcAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouterVpcAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouterVpcAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call the <strong>DeleteTransitRouterVpnAttachment</strong> operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a <strong>RequestId</strong> but does not delete the VPN connection.</p>
     * 
     * @param request the request parameters of DeleteTransitRouterVpnAttachment  DeleteTransitRouterVpnAttachmentRequest
     * @return DeleteTransitRouterVpnAttachmentResponse
     */
    @Override
    public CompletableFuture<DeleteTransitRouterVpnAttachmentResponse> deleteTransitRouterVpnAttachment(DeleteTransitRouterVpnAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTransitRouterVpnAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTransitRouterVpnAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTransitRouterVpnAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeregisterTransitRouterMulticastGroupMembersResponse> deregisterTransitRouterMulticastGroupMembers(DeregisterTransitRouterMulticastGroupMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeregisterTransitRouterMulticastGroupMembers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeregisterTransitRouterMulticastGroupMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeregisterTransitRouterMulticastGroupMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeregisterTransitRouterMulticastGroupSourcesResponse> deregisterTransitRouterMulticastGroupSources(DeregisterTransitRouterMulticastGroupSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeregisterTransitRouterMulticastGroupSources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeregisterTransitRouterMulticastGroupSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeregisterTransitRouterMulticastGroupSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCenAttachedChildInstanceAttribute  DescribeCenAttachedChildInstanceAttributeRequest
     * @return DescribeCenAttachedChildInstanceAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeCenAttachedChildInstanceAttributeResponse> describeCenAttachedChildInstanceAttribute(DescribeCenAttachedChildInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCenAttachedChildInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCenAttachedChildInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCenAttachedChildInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DescribeCenAttachedChildInstancesResponse> describeCenAttachedChildInstances(DescribeCenAttachedChildInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCenAttachedChildInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCenAttachedChildInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCenAttachedChildInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCenBandwidthPackages  DescribeCenBandwidthPackagesRequest
     * @return DescribeCenBandwidthPackagesResponse
     */
    @Override
    public CompletableFuture<DescribeCenBandwidthPackagesResponse> describeCenBandwidthPackages(DescribeCenBandwidthPackagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCenBandwidthPackages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCenBandwidthPackagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCenBandwidthPackagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCenChildInstanceRouteEntries  DescribeCenChildInstanceRouteEntriesRequest
     * @return DescribeCenChildInstanceRouteEntriesResponse
     */
    @Override
    public CompletableFuture<DescribeCenChildInstanceRouteEntriesResponse> describeCenChildInstanceRouteEntries(DescribeCenChildInstanceRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCenChildInstanceRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCenChildInstanceRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCenChildInstanceRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCenGeographicSpanRemainingBandwidth  DescribeCenGeographicSpanRemainingBandwidthRequest
     * @return DescribeCenGeographicSpanRemainingBandwidthResponse
     */
    @Override
    public CompletableFuture<DescribeCenGeographicSpanRemainingBandwidthResponse> describeCenGeographicSpanRemainingBandwidth(DescribeCenGeographicSpanRemainingBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCenGeographicSpanRemainingBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCenGeographicSpanRemainingBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCenGeographicSpanRemainingBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCenGeographicSpans  DescribeCenGeographicSpansRequest
     * @return DescribeCenGeographicSpansResponse
     */
    @Override
    public CompletableFuture<DescribeCenGeographicSpansResponse> describeCenGeographicSpans(DescribeCenGeographicSpansRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCenGeographicSpans").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCenGeographicSpansResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCenGeographicSpansResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCenInterRegionBandwidthLimits  DescribeCenInterRegionBandwidthLimitsRequest
     * @return DescribeCenInterRegionBandwidthLimitsResponse
     */
    @Override
    public CompletableFuture<DescribeCenInterRegionBandwidthLimitsResponse> describeCenInterRegionBandwidthLimits(DescribeCenInterRegionBandwidthLimitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCenInterRegionBandwidthLimits").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCenInterRegionBandwidthLimitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCenInterRegionBandwidthLimitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCenPrivateZoneRoutes  DescribeCenPrivateZoneRoutesRequest
     * @return DescribeCenPrivateZoneRoutesResponse
     */
    @Override
    public CompletableFuture<DescribeCenPrivateZoneRoutesResponse> describeCenPrivateZoneRoutes(DescribeCenPrivateZoneRoutesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCenPrivateZoneRoutes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCenPrivateZoneRoutesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCenPrivateZoneRoutesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCenRegionDomainRouteEntries  DescribeCenRegionDomainRouteEntriesRequest
     * @return DescribeCenRegionDomainRouteEntriesResponse
     */
    @Override
    public CompletableFuture<DescribeCenRegionDomainRouteEntriesResponse> describeCenRegionDomainRouteEntries(DescribeCenRegionDomainRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCenRegionDomainRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCenRegionDomainRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCenRegionDomainRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCenRouteMaps  DescribeCenRouteMapsRequest
     * @return DescribeCenRouteMapsResponse
     */
    @Override
    public CompletableFuture<DescribeCenRouteMapsResponse> describeCenRouteMaps(DescribeCenRouteMapsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCenRouteMaps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCenRouteMapsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCenRouteMapsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCenVbrHealthCheck  DescribeCenVbrHealthCheckRequest
     * @return DescribeCenVbrHealthCheckResponse
     */
    @Override
    public CompletableFuture<DescribeCenVbrHealthCheckResponse> describeCenVbrHealthCheck(DescribeCenVbrHealthCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCenVbrHealthCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCenVbrHealthCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCenVbrHealthCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCens  DescribeCensRequest
     * @return DescribeCensResponse
     */
    @Override
    public CompletableFuture<DescribeCensResponse> describeCens(DescribeCensRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCens").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCensResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCensResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>CEN supports different regions for different network instance types. You can specify the ProductType parameter to query the regions supported by CEN for a specific network instance type. If you do not specify the ProductType parameter, the system queries the regions supported by CEN for all network instance types by default.</p>
     * 
     * @param request the request parameters of DescribeChildInstanceRegions  DescribeChildInstanceRegionsRequest
     * @return DescribeChildInstanceRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeChildInstanceRegionsResponse> describeChildInstanceRegions(DescribeChildInstanceRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeChildInstanceRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeChildInstanceRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeChildInstanceRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFlowlogs  DescribeFlowlogsRequest
     * @return DescribeFlowlogsResponse
     */
    @Override
    public CompletableFuture<DescribeFlowlogsResponse> describeFlowlogs(DescribeFlowlogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFlowlogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFlowlogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFlowlogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGeographicRegionMembership  DescribeGeographicRegionMembershipRequest
     * @return DescribeGeographicRegionMembershipResponse
     */
    @Override
    public CompletableFuture<DescribeGeographicRegionMembershipResponse> describeGeographicRegionMembership(DescribeGeographicRegionMembershipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGeographicRegionMembership").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGeographicRegionMembershipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGeographicRegionMembershipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call the <strong>DescribeGrantRulesToCen</strong> operation, make sure that the parameter values you specify are valid. If you specify invalid parameter values, a <strong>RequestId</strong> is still returned, but information about the cross-account network instances authorized to the CEN instance is not returned.</p>
     * 
     * @param request the request parameters of DescribeGrantRulesToCen  DescribeGrantRulesToCenRequest
     * @return DescribeGrantRulesToCenResponse
     */
    @Override
    public CompletableFuture<DescribeGrantRulesToCenResponse> describeGrantRulesToCen(DescribeGrantRulesToCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGrantRulesToCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGrantRulesToCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGrantRulesToCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGrantRulesToResource  DescribeGrantRulesToResourceRequest
     * @return DescribeGrantRulesToResourceResponse
     */
    @Override
    public CompletableFuture<DescribeGrantRulesToResourceResponse> describeGrantRulesToResource(DescribeGrantRulesToResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGrantRulesToResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGrantRulesToResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGrantRulesToResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePublishedRouteEntries  DescribePublishedRouteEntriesRequest
     * @return DescribePublishedRouteEntriesResponse
     */
    @Override
    public CompletableFuture<DescribePublishedRouteEntriesResponse> describePublishedRouteEntries(DescribePublishedRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePublishedRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePublishedRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePublishedRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRouteConflict  DescribeRouteConflictRequest
     * @return DescribeRouteConflictResponse
     */
    @Override
    public CompletableFuture<DescribeRouteConflictResponse> describeRouteConflict(DescribeRouteConflictRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouteConflict").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRouteConflictResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRouteConflictResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRouteServicesInCen  DescribeRouteServicesInCenRequest
     * @return DescribeRouteServicesInCenResponse
     */
    @Override
    public CompletableFuture<DescribeRouteServicesInCenResponse> describeRouteServicesInCen(DescribeRouteServicesInCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouteServicesInCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRouteServicesInCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRouteServicesInCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can specify the <strong>TransitRouteTableId</strong> and <strong>TransitRouteTableAggregationCidr</strong> parameters to query information about a specific aggregate route. If you specify only the <strong>TransitRouteTableId</strong> parameter, the system queries information about all aggregate routes in the specified Enterprise Edition transit router route table.</p>
     * 
     * @param request the request parameters of DescribeTransitRouteTableAggregation  DescribeTransitRouteTableAggregationRequest
     * @return DescribeTransitRouteTableAggregationResponse
     */
    @Override
    public CompletableFuture<DescribeTransitRouteTableAggregationResponse> describeTransitRouteTableAggregation(DescribeTransitRouteTableAggregationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTransitRouteTableAggregation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTransitRouteTableAggregationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTransitRouteTableAggregationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeTransitRouteTableAggregationDetail  DescribeTransitRouteTableAggregationDetailRequest
     * @return DescribeTransitRouteTableAggregationDetailResponse
     */
    @Override
    public CompletableFuture<DescribeTransitRouteTableAggregationDetailResponse> describeTransitRouteTableAggregationDetail(DescribeTransitRouteTableAggregationDetailRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTransitRouteTableAggregationDetail").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTransitRouteTableAggregationDetailResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTransitRouteTableAggregationDetailResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The <strong>DetachCenChildInstance</strong> operation supports detaching only network instances from a Basic Edition transit router.</p>
     * 
     * @param request the request parameters of DetachCenChildInstance  DetachCenChildInstanceRequest
     * @return DetachCenChildInstanceResponse
     */
    @Override
    public CompletableFuture<DetachCenChildInstanceResponse> detachCenChildInstance(DetachCenChildInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachCenChildInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachCenChildInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachCenChildInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DisableCenVbrHealthCheck</em>* is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong>, but the health check configuration has not been deleted. The deletion task continues to run in the background. You can call <strong>DescribeCenVbrHealthCheck</strong> to query the health check configuration. If the specified health check configuration is not found, the deletion is complete.</p>
     * 
     * @param request the request parameters of DisableCenVbrHealthCheck  DisableCenVbrHealthCheckRequest
     * @return DisableCenVbrHealthCheckResponse
     */
    @Override
    public CompletableFuture<DisableCenVbrHealthCheckResponse> disableCenVbrHealthCheck(DisableCenVbrHealthCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableCenVbrHealthCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableCenVbrHealthCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableCenVbrHealthCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DisableTransitRouterRouteTablePropagationResponse> disableTransitRouterRouteTablePropagation(DisableTransitRouterRouteTablePropagationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableTransitRouterRouteTablePropagation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableTransitRouterRouteTablePropagationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableTransitRouterRouteTablePropagationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DisassociateTransitRouterMulticastDomainResponse> disassociateTransitRouterMulticastDomain(DisassociateTransitRouterMulticastDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisassociateTransitRouterMulticastDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisassociateTransitRouterMulticastDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisassociateTransitRouterMulticastDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DissociateTransitRouterAttachmentFromRouteTableResponse> dissociateTransitRouterAttachmentFromRouteTable(DissociateTransitRouterAttachmentFromRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateTransitRouterAttachmentFromRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateTransitRouterAttachmentFromRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateTransitRouterAttachmentFromRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<EnableCenVbrHealthCheckResponse> enableCenVbrHealthCheck(EnableCenVbrHealthCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableCenVbrHealthCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableCenVbrHealthCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableCenVbrHealthCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After you create a network instance connection, you can set up a route learning relationship for it. Once configured, the network instance connection automatically propagates routes from the network instance to its associated route table. Before calling this operation to create a route learning relationship, note the following information:</p>
     * <ul>
     * <li>Only Enterprise Edition transit routers support creating route learning relationships. For information about the regions and zones supported by Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is Cloud Enterprise Network (CEN)?</a>.</li>
     * <li>The <strong>EnableTransitRouterRouteTablePropagation</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong>, but the route learning relationship between the network instance connection and the route table is not fully established. The creation task is still running in the background. You can call the <strong>ListTransitRouterRouteTablePropagations</strong> operation to query the route learning relationship between the network instance connection and the route table.<ul>
     * <li>If the route learning relationship is in the <strong>Enabling</strong> state, the route learning relationship between the network instance connection and the route table is being established. In this state, you can only query the route learning relationship. You cannot perform other operations.</li>
     * <li>If the route learning relationship is in the <strong>Active</strong> state, the route learning relationship between the network instance connection and the route table is established.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of EnableTransitRouterRouteTablePropagation  EnableTransitRouterRouteTablePropagationRequest
     * @return EnableTransitRouterRouteTablePropagationResponse
     */
    @Override
    public CompletableFuture<EnableTransitRouterRouteTablePropagationResponse> enableTransitRouterRouteTablePropagation(EnableTransitRouterRouteTablePropagationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableTransitRouterRouteTablePropagation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableTransitRouterRouteTablePropagationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableTransitRouterRouteTablePropagationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<GrantInstanceToTransitRouterResponse> grantInstanceToTransitRouter(GrantInstanceToTransitRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GrantInstanceToTransitRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantInstanceToTransitRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantInstanceToTransitRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call the ListCenChildInstanceRouteEntriesToAttachment operation, make sure that the parameter values you specify are valid. If you specify invalid parameter values, the operation returns a RequestId but does not display the route entries of network instances connected to the Enterprise Edition transit router.</p>
     * 
     * @param request the request parameters of ListCenChildInstanceRouteEntriesToAttachment  ListCenChildInstanceRouteEntriesToAttachmentRequest
     * @return ListCenChildInstanceRouteEntriesToAttachmentResponse
     */
    @Override
    public CompletableFuture<ListCenChildInstanceRouteEntriesToAttachmentResponse> listCenChildInstanceRouteEntriesToAttachment(ListCenChildInstanceRouteEntriesToAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCenChildInstanceRouteEntriesToAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCenChildInstanceRouteEntriesToAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCenChildInstanceRouteEntriesToAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListCenInterRegionTrafficQosPoliciesResponse> listCenInterRegionTrafficQosPolicies(ListCenInterRegionTrafficQosPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCenInterRegionTrafficQosPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCenInterRegionTrafficQosPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCenInterRegionTrafficQosPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, specify at least one of the following parameters: <strong>TransitRouterId</strong>, <strong>TrafficQosPolicyId</strong>, or <strong>TrafficQosQueueId</strong>.
     * Make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system returns a <strong>RequestId</strong> but does not return information about traffic scheduling policies.</p>
     * 
     * @param request the request parameters of ListCenInterRegionTrafficQosQueues  ListCenInterRegionTrafficQosQueuesRequest
     * @return ListCenInterRegionTrafficQosQueuesResponse
     */
    @Override
    public CompletableFuture<ListCenInterRegionTrafficQosQueuesResponse> listCenInterRegionTrafficQosQueues(ListCenInterRegionTrafficQosQueuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCenInterRegionTrafficQosQueues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCenInterRegionTrafficQosQueuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCenInterRegionTrafficQosQueuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you invoke the <code>ListGrantVSwitchEnis</code> operation, make sure that the VPC-connected instance is connected to Cloud Enterprise Network (CEN). For more information, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</p>
     * 
     * @param request the request parameters of ListGrantVSwitchEnis  ListGrantVSwitchEnisRequest
     * @return ListGrantVSwitchEnisResponse
     */
    @Override
    public CompletableFuture<ListGrantVSwitchEnisResponse> listGrantVSwitchEnis(ListGrantVSwitchEnisRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGrantVSwitchEnis").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGrantVSwitchEnisResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGrantVSwitchEnisResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you invoke the <code>ListGrantVSwitchesToCen</code> operation, make sure that the CEN instance has been granted authorization to access the cross-account VPC-connected instance. For more information, see <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</p>
     * 
     * @param request the request parameters of ListGrantVSwitchesToCen  ListGrantVSwitchesToCenRequest
     * @return ListGrantVSwitchesToCenResponse
     */
    @Override
    public CompletableFuture<ListGrantVSwitchesToCenResponse> listGrantVSwitchesToCen(ListGrantVSwitchesToCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGrantVSwitchesToCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGrantVSwitchesToCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGrantVSwitchesToCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListTrafficMarkingPoliciesResponse> listTrafficMarkingPolicies(ListTrafficMarkingPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTrafficMarkingPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrafficMarkingPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrafficMarkingPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListTransitRouterAvailableResourceResponse> listTransitRouterAvailableResource(ListTransitRouterAvailableResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterAvailableResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterAvailableResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterAvailableResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTransitRouterCidr  ListTransitRouterCidrRequest
     * @return ListTransitRouterCidrResponse
     */
    @Override
    public CompletableFuture<ListTransitRouterCidrResponse> listTransitRouterCidr(ListTransitRouterCidrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterCidr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterCidrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterCidrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTransitRouterCidrAllocation  ListTransitRouterCidrAllocationRequest
     * @return ListTransitRouterCidrAllocationResponse
     */
    @Override
    public CompletableFuture<ListTransitRouterCidrAllocationResponse> listTransitRouterCidrAllocation(ListTransitRouterCidrAllocationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterCidrAllocation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterCidrAllocationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterCidrAllocationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the information about ECR connections under an Enterprise Edition transit router in the following three ways: </p>
     * <ul>
     * <li>Query the information about all ECR connections under an Enterprise Edition transit router instance by specifying the transit router instance ID. </li>
     * <li>Query the information about all ECR connections under an Enterprise Edition transit router instance by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the transit router instance. </li>
     * <li>Query the information about a specific ECR connection by specifying only the <strong>TransitRouterAttachmentId</strong> parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterEcrAttachments  ListTransitRouterEcrAttachmentsRequest
     * @return ListTransitRouterEcrAttachmentsResponse
     */
    @Override
    public CompletableFuture<ListTransitRouterEcrAttachmentsResponse> listTransitRouterEcrAttachments(ListTransitRouterEcrAttachmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterEcrAttachments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterEcrAttachmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterEcrAttachmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListTransitRouterMulticastDomainAssociationsResponse> listTransitRouterMulticastDomainAssociations(ListTransitRouterMulticastDomainAssociationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterMulticastDomainAssociations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterMulticastDomainAssociationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterMulticastDomainAssociationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call the ListTransitRouterMulticastDomainVSwitches operation, make sure that the parameter values you specify are correct. If you specify incorrect parameter values, the system still returns a RequestId but does not return information about vSwitches that are associated with multicast domains in the VPC-connected instance.</p>
     * 
     * @param request the request parameters of ListTransitRouterMulticastDomainVSwitches  ListTransitRouterMulticastDomainVSwitchesRequest
     * @return ListTransitRouterMulticastDomainVSwitchesResponse
     */
    @Override
    public CompletableFuture<ListTransitRouterMulticastDomainVSwitchesResponse> listTransitRouterMulticastDomainVSwitches(ListTransitRouterMulticastDomainVSwitchesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterMulticastDomainVSwitches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterMulticastDomainVSwitchesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterMulticastDomainVSwitchesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>RegionId must be used together with CenId and cannot be used alone. Otherwise, multicast domain information is not displayed. However, TransitRouterId and TransitRouterMulticastDomainId can be used independently.</li>
     * <li>Ensure that the parameter values you specify are correct when you call this operation. If you specify invalid parameter values, the system still returns a <strong>RequestId</strong> but does not display detailed multicast domain information.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterMulticastDomains  ListTransitRouterMulticastDomainsRequest
     * @return ListTransitRouterMulticastDomainsResponse
     */
    @Override
    public CompletableFuture<ListTransitRouterMulticastDomainsResponse> listTransitRouterMulticastDomains(ListTransitRouterMulticastDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterMulticastDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterMulticastDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterMulticastDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListTransitRouterMulticastGroupsResponse> listTransitRouterMulticastGroups(ListTransitRouterMulticastGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterMulticastGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterMulticastGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterMulticastGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query inter-region connections under an Enterprise Edition transit router in the following ways:</p>
     * <ul>
     * <li>Query all inter-region connections under an Enterprise Edition transit router by specifying the transit router instance ID.</li>
     * <li>Query all inter-region connections under an Enterprise Edition transit router by specifying the Cloud Enterprise Network (CEN) instance ID and the region ID of the Enterprise Edition transit router instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterPeerAttachments  ListTransitRouterPeerAttachmentsRequest
     * @return ListTransitRouterPeerAttachmentsResponse
     */
    @Override
    public CompletableFuture<ListTransitRouterPeerAttachmentsResponse> listTransitRouterPeerAttachments(ListTransitRouterPeerAttachmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterPeerAttachments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterPeerAttachmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterPeerAttachmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTransitRouterPrefixListAssociation  ListTransitRouterPrefixListAssociationRequest
     * @return ListTransitRouterPrefixListAssociationResponse
     */
    @Override
    public CompletableFuture<ListTransitRouterPrefixListAssociationResponse> listTransitRouterPrefixListAssociation(ListTransitRouterPrefixListAssociationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterPrefixListAssociation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterPrefixListAssociationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterPrefixListAssociationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTransitRouterRouteEntries  ListTransitRouterRouteEntriesRequest
     * @return ListTransitRouterRouteEntriesResponse
     */
    @Override
    public CompletableFuture<ListTransitRouterRouteEntriesResponse> listTransitRouterRouteEntries(ListTransitRouterRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListTransitRouterRouteTableAssociationsResponse> listTransitRouterRouteTableAssociations(ListTransitRouterRouteTableAssociationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterRouteTableAssociations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterRouteTableAssociationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterRouteTableAssociationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTransitRouterRouteTablePropagations  ListTransitRouterRouteTablePropagationsRequest
     * @return ListTransitRouterRouteTablePropagationsResponse
     */
    @Override
    public CompletableFuture<ListTransitRouterRouteTablePropagationsResponse> listTransitRouterRouteTablePropagations(ListTransitRouterRouteTablePropagationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterRouteTablePropagations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterRouteTablePropagationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterRouteTablePropagationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTransitRouterRouteTables  ListTransitRouterRouteTablesRequest
     * @return ListTransitRouterRouteTablesResponse
     */
    @Override
    public CompletableFuture<ListTransitRouterRouteTablesResponse> listTransitRouterRouteTables(ListTransitRouterRouteTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterRouteTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterRouteTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterRouteTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListTransitRouterVbrAttachmentsResponse> listTransitRouterVbrAttachments(ListTransitRouterVbrAttachmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterVbrAttachments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterVbrAttachmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterVbrAttachmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListTransitRouterVpcAttachmentsResponse> listTransitRouterVpcAttachments(ListTransitRouterVpcAttachmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterVpcAttachments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterVpcAttachmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterVpcAttachmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The ListTransitRouterVpnAttachments operation supports the following three query methods:</p>
     * <ul>
     * <li>Specify only <strong>TransitRouterAttachmentId</strong> to query information about a specific VPN connection.</li>
     * <li>Specify only <strong>TransitRouterId</strong> to query information about all VPN connections associated with the specified transit router.</li>
     * <li>Specify <strong>CenId</strong> and <strong>RegionId</strong> to query information about VPN connections in a specific region of the Cloud Enterprise Network (CEN) instance.
     * When calling the <strong>ListTransitRouterVpnAttachments</strong> operation, make sure that the parameter values are correct. If you specify incorrect parameter values, the response still returns a <strong>RequestId</strong>, but does not include the information about the target VPN connections.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTransitRouterVpnAttachments  ListTransitRouterVpnAttachmentsRequest
     * @return ListTransitRouterVpnAttachmentsResponse
     */
    @Override
    public CompletableFuture<ListTransitRouterVpnAttachmentsResponse> listTransitRouterVpnAttachments(ListTransitRouterVpnAttachmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouterVpnAttachments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRouterVpnAttachmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRouterVpnAttachmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ListTransitRoutersResponse> listTransitRouters(ListTransitRoutersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTransitRouters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTransitRoutersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTransitRoutersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>ModifyCenAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the CEN instance has not been modified yet. The modification task is still running in the background. You can call the <strong>DescribeCens</strong> operation to query the status of the CEN instance. </p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Modifying</strong> state, the CEN instance is being modified. In this state, you can only query the CEN instance but cannot perform other operations on it.</li>
     * <li>If the CEN instance is in the <strong>Active</strong> state, the CEN instance has been modified.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCenAttribute  ModifyCenAttributeRequest
     * @return ModifyCenAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyCenAttributeResponse> modifyCenAttribute(ModifyCenAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCenAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCenAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCenAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCenBandwidthPackageAttribute  ModifyCenBandwidthPackageAttributeRequest
     * @return ModifyCenBandwidthPackageAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyCenBandwidthPackageAttributeResponse> modifyCenBandwidthPackageAttribute(ModifyCenBandwidthPackageAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCenBandwidthPackageAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCenBandwidthPackageAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCenBandwidthPackageAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCenBandwidthPackageSpec  ModifyCenBandwidthPackageSpecRequest
     * @return ModifyCenBandwidthPackageSpecResponse
     */
    @Override
    public CompletableFuture<ModifyCenBandwidthPackageSpecResponse> modifyCenBandwidthPackageSpec(ModifyCenBandwidthPackageSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCenBandwidthPackageSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCenBandwidthPackageSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCenBandwidthPackageSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyCenRouteMapResponse> modifyCenRouteMap(ModifyCenRouteMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCenRouteMap").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCenRouteMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCenRouteMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyFlowLogAttributeResponse> modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyFlowLogAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFlowLogAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFlowLogAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The ModifyGrantInstanceToTransitRouter operation supports modifying only the payer for cross-account virtual private cloud (VPC), virtual border router (VBR), and IPsec connection instances connected to a transit router instance.</p>
     * 
     * @param request the request parameters of ModifyGrantInstanceToTransitRouter  ModifyGrantInstanceToTransitRouterRequest
     * @return ModifyGrantInstanceToTransitRouterResponse
     */
    @Override
    public CompletableFuture<ModifyGrantInstanceToTransitRouterResponse> modifyGrantInstanceToTransitRouter(ModifyGrantInstanceToTransitRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyGrantInstanceToTransitRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyGrantInstanceToTransitRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyGrantInstanceToTransitRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTrafficMatchRuleToTrafficMarkingPolicy  ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest
     * @return ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse> modifyTrafficMatchRuleToTrafficMarkingPolicy(ModifyTrafficMatchRuleToTrafficMarkingPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTrafficMatchRuleToTrafficMarkingPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTrafficMatchRuleToTrafficMarkingPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTransitRouteTableAggregation  ModifyTransitRouteTableAggregationRequest
     * @return ModifyTransitRouteTableAggregationResponse
     */
    @Override
    public CompletableFuture<ModifyTransitRouteTableAggregationResponse> modifyTransitRouteTableAggregation(ModifyTransitRouteTableAggregationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTransitRouteTableAggregation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTransitRouteTableAggregationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTransitRouteTableAggregationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ModifyTransitRouterCidrResponse> modifyTransitRouterCidr(ModifyTransitRouterCidrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTransitRouterCidr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTransitRouterCidrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTransitRouterCidrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyTransitRouterMulticastDomain  ModifyTransitRouterMulticastDomainRequest
     * @return ModifyTransitRouterMulticastDomainResponse
     */
    @Override
    public CompletableFuture<ModifyTransitRouterMulticastDomainResponse> modifyTransitRouterMulticastDomain(ModifyTransitRouterMulticastDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTransitRouterMulticastDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTransitRouterMulticastDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTransitRouterMulticastDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>CEN instances and bandwidth plan instances belong to the default resource group by default. You can call the <code>MoveResourceGroup</code> operation to modify the resource group to which a CEN instance or a bandwidth plan instance belongs.</p>
     * 
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    @Override
    public CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<OpenTransitRouterServiceResponse> openTransitRouterService(OpenTransitRouterServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenTransitRouterService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenTransitRouterServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenTransitRouterServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<PublishRouteEntriesResponse> publishRouteEntries(PublishRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RefreshTransitRouteTableAggregationResponse> refreshTransitRouteTableAggregation(RefreshTransitRouteTableAggregationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefreshTransitRouteTableAggregation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefreshTransitRouteTableAggregationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefreshTransitRouteTableAggregationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RegisterTransitRouterMulticastGroupMembersResponse> registerTransitRouterMulticastGroupMembers(RegisterTransitRouterMulticastGroupMembersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterTransitRouterMulticastGroupMembers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterTransitRouterMulticastGroupMembersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterTransitRouterMulticastGroupMembersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RegisterTransitRouterMulticastGroupSourcesResponse> registerTransitRouterMulticastGroupSources(RegisterTransitRouterMulticastGroupSourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RegisterTransitRouterMulticastGroupSources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RegisterTransitRouterMulticastGroupSourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RegisterTransitRouterMulticastGroupSourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse> removeTrafficMatchRuleFromTrafficMarkingPolicy(RemoveTrafficMatchRuleFromTrafficMarkingPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveTrafficMatchRuleFromTrafficMarkingPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveTrafficMatchRuleFromTrafficMarkingPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI RemoveTraficMatchRuleFromTrafficMarkingPolicy is deprecated, please use Cbn::2017-09-12::RemoveTrafficMatchRuleFromTrafficMarkingPolicy instead.  * @description ### Precautions
     * The **RemoveTraficMatchRuleFromTrafficMarkingPolicy** operation is deprecated and will be discontinued. To delete traffic classification rules from a traffic marking policy, use the [RemoveTrafficMatchRuleFromTrafficMarkingPolicy](https://help.aliyun.com/document_detail/452726.html) operation. This API documentation is no longer maintained.
     * 
     * @param request the request parameters of RemoveTraficMatchRuleFromTrafficMarkingPolicy  RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest
     * @return RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse
     */
    @Deprecated
    @Override
    public CompletableFuture<RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse> removeTraficMatchRuleFromTrafficMarkingPolicy(RemoveTraficMatchRuleFromTrafficMarkingPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveTraficMatchRuleFromTrafficMarkingPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveTraficMatchRuleFromTrafficMarkingPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ReplaceTransitRouterRouteTableAssociationResponse> replaceTransitRouterRouteTableAssociation(ReplaceTransitRouterRouteTableAssociationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReplaceTransitRouterRouteTableAssociation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplaceTransitRouterRouteTableAssociationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplaceTransitRouterRouteTableAssociationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<ResolveAndRouteServiceInCenResponse> resolveAndRouteServiceInCen(ResolveAndRouteServiceInCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResolveAndRouteServiceInCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResolveAndRouteServiceInCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResolveAndRouteServiceInCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RevokeInstanceFromTransitRouterResponse> revokeInstanceFromTransitRouter(RevokeInstanceFromTransitRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeInstanceFromTransitRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeInstanceFromTransitRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeInstanceFromTransitRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>PrivateZone is a private DNS resolution and management service based on the Alibaba Cloud Virtual Private Cloud (VPC) environment. After a Virtual Border Router (VBR) instance or a Cloud Connect Network (CCN) instance is attached to a Cloud Enterprise Network (CEN) instance, the associated on-premises network can access the PrivateZone service through CEN.</p>
     * <ul>
     * <li>On-premises networks associated with VBR instances and CCN instances can access only the PrivateZone service in the same region.
     *   For example, if the PrivateZone service is deployed in the China (Beijing) region, only on-premises networks associated with VBR instances in the China (Beijing) region and CCN instances in the Chinese mainland can access the PrivateZone service.</li>
     * <li>The <strong>RoutePrivateZoneInCenToVpc</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong> but the PrivateZone service configuration is not complete. The configuration task continues to run in the background. You can call the <strong>DescribeCenPrivateZoneRoutes</strong> operation to query the status of the PrivateZone service. <ul>
     * <li>If the PrivateZone service is in the <strong>Creating</strong> state, the configuration is being added. In this state, you can only query the PrivateZone service configuration. You cannot perform other operations.</li>
     * <li>If the PrivateZone service is in the <strong>Active</strong> state, the configuration is complete.</li>
     * <li>If the PrivateZone service is in the <strong>Failed</strong> state, the configuration failed to be added.</li>
     * </ul>
     * </li>
     * </ul>
     * <h4>Before you begin</h4>
     * <p>Before you invoke the <strong>RoutePrivateZoneInCenToVpc</strong> operation, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The PrivateZone service is deployed. For more information, see <a href="https://help.aliyun.com/document_detail/64627.html">Alibaba Cloud DNS PrivateZone Getting Started</a>.</li>
     * <li>The VPC-connected instance associated with the PrivateZone service, and the VBR instance or CCN instance in the access region are attached to the same CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * <li>If your on-premises network uses a CCN instance to connect to Alibaba Cloud, and the CCN instance belongs to a different account from the VPC-connected instance or the CEN instance, complete the authorization for the CCN instance first. For more information, see <a href="https://help.aliyun.com/document_detail/106674.html">Cloud Connect Network authorization</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of RoutePrivateZoneInCenToVpc  RoutePrivateZoneInCenToVpcRequest
     * @return RoutePrivateZoneInCenToVpcResponse
     */
    @Override
    public CompletableFuture<RoutePrivateZoneInCenToVpcResponse> routePrivateZoneInCenToVpc(RoutePrivateZoneInCenToVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RoutePrivateZoneInCenToVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RoutePrivateZoneInCenToVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RoutePrivateZoneInCenToVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<SetCenInterRegionBandwidthLimitResponse> setCenInterRegionBandwidthLimit(SetCenInterRegionBandwidthLimitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetCenInterRegionBandwidthLimit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetCenInterRegionBandwidthLimitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetCenInterRegionBandwidthLimitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<TempUpgradeCenBandwidthPackageSpecResponse> tempUpgradeCenBandwidthPackageSpec(TempUpgradeCenBandwidthPackageSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TempUpgradeCenBandwidthPackageSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TempUpgradeCenBandwidthPackageSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TempUpgradeCenBandwidthPackageSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Disassociates a bandwidth package from a Cloud Enterprise Network (CEN) instance. Before you call this operation, make sure that no inter-region bandwidth is configured for the bandwidth package. You can call <a href="https://help.aliyun.com/document_detail/468275.html">DescribeCenInterRegionBandwidthLimits</a> to query inter-region bandwidth, and then call <a href="https://help.aliyun.com/document_detail/65942.html">SetCenInterRegionBandwidthLimit</a> to set BandwidthLimit to 0 to delete the configured inter-region bandwidth.</p>
     * 
     * @param request the request parameters of UnassociateCenBandwidthPackage  UnassociateCenBandwidthPackageRequest
     * @return UnassociateCenBandwidthPackageResponse
     */
    @Override
    public CompletableFuture<UnassociateCenBandwidthPackageResponse> unassociateCenBandwidthPackage(UnassociateCenBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateCenBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassociateCenBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassociateCenBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>UnroutePrivateZoneInCenToVpc</em>* is an asynchronous operation. After you call this operation, the system returns a <strong>RequestId</strong> but the PrivateZone service configuration is not immediately deleted. The deletion task continues to run in the background. You can call the <strong>DescribeCenPrivateZoneRoutes</strong> operation to query the status of the PrivateZone service. </p>
     * <ul>
     * <li>If the PrivateZone service is in the <strong>Deleting</strong> state, the PrivateZone service configuration is being deleted. In this state, you can only query the PrivateZone service configuration. You cannot perform other operations.</li>
     * <li>If the specified PrivateZone service configuration cannot be found, the deletion is complete.
     * If a PrivateZone configuration exists with the access region set to a Cloud Connect Network region, delete the PrivateZone configuration for the Cloud Connect Network region first, and then delete the PrivateZone configurations for other access regions.</li>
     * </ul>
     * 
     * @param request the request parameters of UnroutePrivateZoneInCenToVpc  UnroutePrivateZoneInCenToVpcRequest
     * @return UnroutePrivateZoneInCenToVpcResponse
     */
    @Override
    public CompletableFuture<UnroutePrivateZoneInCenToVpcResponse> unroutePrivateZoneInCenToVpc(UnroutePrivateZoneInCenToVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnroutePrivateZoneInCenToVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnroutePrivateZoneInCenToVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnroutePrivateZoneInCenToVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCenInterRegionTrafficQosPolicyAttribute  UpdateCenInterRegionTrafficQosPolicyAttributeRequest
     * @return UpdateCenInterRegionTrafficQosPolicyAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateCenInterRegionTrafficQosPolicyAttributeResponse> updateCenInterRegionTrafficQosPolicyAttribute(UpdateCenInterRegionTrafficQosPolicyAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCenInterRegionTrafficQosPolicyAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCenInterRegionTrafficQosPolicyAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCenInterRegionTrafficQosPolicyAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateCenInterRegionTrafficQosQueueAttribute  UpdateCenInterRegionTrafficQosQueueAttributeRequest
     * @return UpdateCenInterRegionTrafficQosQueueAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateCenInterRegionTrafficQosQueueAttributeResponse> updateCenInterRegionTrafficQosQueueAttribute(UpdateCenInterRegionTrafficQosQueueAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCenInterRegionTrafficQosQueueAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCenInterRegionTrafficQosQueueAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCenInterRegionTrafficQosQueueAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTrafficMarkingPolicyAttribute  UpdateTrafficMarkingPolicyAttributeRequest
     * @return UpdateTrafficMarkingPolicyAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateTrafficMarkingPolicyAttributeResponse> updateTrafficMarkingPolicyAttribute(UpdateTrafficMarkingPolicyAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTrafficMarkingPolicyAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrafficMarkingPolicyAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrafficMarkingPolicyAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateTransitRouter</em>* is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the modification of the transit router instance is not yet complete. The modification task continues to run in the background. You can call the <strong>ListTransitRouters</strong> operation to query the status of the transit router instance. </p>
     * <ul>
     * <li>If the transit router instance is in the <strong>Modifying</strong> state, the transit router instance is being modified. In this state, you can only query the transit router instance but cannot perform other operations on it.</li>
     * <li>If the transit router instance is in the <strong>Active</strong> state, the transit router instance has been modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTransitRouter  UpdateTransitRouterRequest
     * @return UpdateTransitRouterResponse
     */
    @Override
    public CompletableFuture<UpdateTransitRouterResponse> updateTransitRouter(UpdateTransitRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTransitRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTransitRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTransitRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>UpdateTransitRouterEcrAttachmentAttribute is an asynchronous operation. The system returns a RequestId immediately, but the ECR connection has not been modified yet because the modification task is still running in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of the ECR connection.
     * If the ECR connection is in the Modifying state, the ECR connection is being modified. In this state, you can only query the ECR connection but cannot perform other operations on it.
     * If the ECR connection is in the Attached state, the ECR connection has been modified.</p>
     * 
     * @param request the request parameters of UpdateTransitRouterEcrAttachmentAttribute  UpdateTransitRouterEcrAttachmentAttributeRequest
     * @return UpdateTransitRouterEcrAttachmentAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateTransitRouterEcrAttachmentAttributeResponse> updateTransitRouterEcrAttachmentAttribute(UpdateTransitRouterEcrAttachmentAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTransitRouterEcrAttachmentAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTransitRouterEcrAttachmentAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTransitRouterEcrAttachmentAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateTransitRouterPeerAttachmentAttributeResponse> updateTransitRouterPeerAttachmentAttribute(UpdateTransitRouterPeerAttachmentAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTransitRouterPeerAttachmentAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTransitRouterPeerAttachmentAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTransitRouterPeerAttachmentAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTransitRouterRouteEntry  UpdateTransitRouterRouteEntryRequest
     * @return UpdateTransitRouterRouteEntryResponse
     */
    @Override
    public CompletableFuture<UpdateTransitRouterRouteEntryResponse> updateTransitRouterRouteEntry(UpdateTransitRouterRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTransitRouterRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTransitRouterRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTransitRouterRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTransitRouterRouteTable  UpdateTransitRouterRouteTableRequest
     * @return UpdateTransitRouterRouteTableResponse
     */
    @Override
    public CompletableFuture<UpdateTransitRouterRouteTableResponse> updateTransitRouterRouteTable(UpdateTransitRouterRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTransitRouterRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTransitRouterRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTransitRouterRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateTransitRouterVbrAttachmentAttributeResponse> updateTransitRouterVbrAttachmentAttribute(UpdateTransitRouterVbrAttachmentAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTransitRouterVbrAttachmentAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTransitRouterVbrAttachmentAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTransitRouterVbrAttachmentAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateTransitRouterVpcAttachmentAttributeResponse> updateTransitRouterVpcAttachmentAttribute(UpdateTransitRouterVpcAttachmentAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTransitRouterVpcAttachmentAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTransitRouterVpcAttachmentAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTransitRouterVpcAttachmentAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateTransitRouterVpcAttachmentZonesResponse> updateTransitRouterVpcAttachmentZones(UpdateTransitRouterVpcAttachmentZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTransitRouterVpcAttachmentZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTransitRouterVpcAttachmentZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTransitRouterVpcAttachmentZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateTransitRouterVpnAttachmentAttribute  UpdateTransitRouterVpnAttachmentAttributeRequest
     * @return UpdateTransitRouterVpnAttachmentAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateTransitRouterVpnAttachmentAttributeResponse> updateTransitRouterVpnAttachmentAttribute(UpdateTransitRouterVpnAttachmentAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTransitRouterVpnAttachmentAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTransitRouterVpnAttachmentAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTransitRouterVpnAttachmentAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of WithdrawPublishedRouteEntries  WithdrawPublishedRouteEntriesRequest
     * @return WithdrawPublishedRouteEntriesResponse
     */
    @Override
    public CompletableFuture<WithdrawPublishedRouteEntriesResponse> withdrawPublishedRouteEntries(WithdrawPublishedRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("WithdrawPublishedRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WithdrawPublishedRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WithdrawPublishedRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
