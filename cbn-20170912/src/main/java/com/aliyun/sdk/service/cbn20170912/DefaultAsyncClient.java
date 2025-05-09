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
     * <p>  After you create a flow log, it is enabled by default. You can call this operation to enable a disabled flow log.</p>
     * <ul>
     * <li><code>ActiveFlowLog</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.<ul>
     * <li>If a flow log is in the <strong>Modifying</strong> state, the flow log is being enabled. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log is in the <strong>Active</strong> state, the flow log is enabled.</li>
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
     * <p><em>AddTrafficMatchRuleToTrafficMarkingPolicy</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic classification rule.</p>
     * <ul>
     * <li>If a traffic classification rule is in the <strong>Creating</strong> state, the traffic classification rule is being created. In this case, you can query the traffic classification rule but cannot perform other operations.</li>
     * <li>If a traffic classification rule is in the <strong>Active</strong> state, the traffic classification rule is added to the traffic marking policy.</li>
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
     * @deprecated OpenAPI AddTraficMatchRuleToTrafficMarkingPolicy is deprecated, please use Cbn::2017-09-12::AddTrafficMatchRuleToTrafficMarkingPolicy instead.  * @description ### Usage notes
     * The **AddTraficMatchRuleToTrafficMarkingPolicy** operation is deprecated and will be discontinued soon. If you need to add a traffic classification rule to a traffic marking policy, call the [AddTrafficMatchRuleToTrafficMarkingPolicy](https://help.aliyun.com/document_detail/427602.html) operation.
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
     * <p>You can associate multiple bandwidth plans with a CEN instance. However, the pair of areas connected by each bandwidth plan must be unique.
     * For example, if a CEN instance is associated with a bandwidth plan that connects networks in the Chinese mainland, you cannot associate another bandwidth plan that also connects networks in the Chinese mainland with the CEN instance. However, you can associate a bandwidth plan that connects the Chinese mainland to North America with the CEN instance.</p>
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
     * <p>After you create a network instance connection on a transit router, you can configure an associated forwarding correlation to associate the network instance connection with the route table of an Enterprise Edition transit router. The Enterprise Edition transit router forwards traffic for the network instance based on the routes in the route table. Before you begin, we recommend that you take note of the following rules:</p>
     * <ul>
     * <li>Only route tables of Enterprise Edition transit routers support associated forwarding correlations. For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></li>
     * <li>Each network instance connection can have an associated forwarding correlation with only one route table of only one Enterprise Edition transit router.</li>
     * <li><strong>AssociateTransitRouterAttachmentWithRouteTable</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTableAssociations</strong> operation to query the status of an associated forwarding correlation.<ul>
     * <li>If an associated forwarding correlation is in the <strong>Associating</strong> state, the associated forwarding correlation is being created. You can query the associated forwarding correlation but cannot perform other operations.</li>
     * <li>If an associated forwarding correlation is in the <strong>Active</strong> state, the associated forwarding correlation is created.</li>
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
     * <li>A vSwitch can be associated with only one multicast domain. Make sure that the vSwitch is not associated with other multicast domains. For more information about how to disassociate a vSwitch from a multicast domain, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li>AssociateTransitRouterMulticastDomain is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterMulticastDomainAssociations operation to query whether a vSwitch is associated with the specified multicast domain.<ul>
     * <li>If the status is Associating, it indicates that the vSwitch is being associated with the specified multicast domain. You can query the vSwitch but cannot perform other operations on the vSwitch.</li>
     * <li>If the status is Associated, the vSwitch is associated with the specified multicast domain.</li>
     * </ul>
     * </li>
     * <li>The VPC of the vSwitch must be associated with an Enterprise Edition transit router. For more information about how to associate a VPC with an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a>.</li>
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
     * <p>CEN allows you to attach a network instance that belongs to another Alibaba Cloud account to your CEN instance. Before you attach the network instance, CEN must acquire permissions to access the network instance that belongs to another Alibaba Cloud account.</p>
     * <ul>
     * <li>For more information about how to grant CEN permissions on virtual private clouds (VPCs) that belong to another Alibaba Cloud account, see <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</li>
     * <li>For more information about how to grant CEN permissions on Cloud Connect Network (CCN) instances that belong to another Alibaba Cloud account, see <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a>.</li>
     * <li>By default, you cannot grant permissions on virtual border routers (VBRs) that belong to another Alibaba Cloud account to a CEN instance. If you need to use this feature, contact your account manager.</li>
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
     * <p><em>CreateCen</em>* is an asynchronous operation. After you a request is sent, the system returns a request ID and runs the task in the background. You can call <strong>DescribeCens</strong> to query the status of the task.</p>
     * <ul>
     * <li>If a CEN instance is in the <strong>Creating</strong> state, the CEN instance is being created. You can query the CEN instance but cannot perform other operations.</li>
     * <li>If a CEN instance is in the <strong>Active</strong> state, the CEN instance is created.</li>
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
     * <p>  You must specify the areas to be connected when you create a bandwidth plan. An area contains one or more Alibaba Cloud regions. When you select areas for a bandwidth plan, make sure that the areas contain the regions that you want to connect. For more information about the supported areas and regions, see <a href="https://help.aliyun.com/document_detail/181560.html">Purchase a bandwidth plan</a>.</p>
     * <ul>
     * <li>For more information about the billing rules, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
     * <li><strong>CreateCenBandwidthPackage</strong> is an asynchronous operation. After you send a request, the system returns a bandwidth plan instance ID and runs the task in the background. You can call the <strong>DescribeCenBandwidthPackages</strong> operation to query the status of a bandwidth plan. If a bandwidth plan is in the <strong>Idle</strong> or <strong>InUse</strong> state, the bandwidth plan is created.</li>
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
     * <p>  You can add routes only to virtual private clouds (VPCs) or virtual border routers (VBRs) that are connected to an Enterprise Edition transit router.</p>
     * <ul>
     * <li>By default, the next hop of the routes is the <strong>transit router connection</strong>, which is the connection between the VBR and the Enterprise Edition transit router. You cannot modify the next hop.</li>
     * <li><strong>CreateCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeRouteEntryList</strong> operation to query the status of a route.<ul>
     * <li>If a route is in the <strong>Pending</strong> state, the route is being created. You can query the route but cannot perform other operations.</li>
     * <li>If a route is in the <strong>Available</strong> state, the route is created.</li>
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
     * <h2>Limits</h2>
     * <ul>
     * <li>By default, the CreateCenChildInstanceRouteEntryToCen operation is unavailable. To call this operation,<a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>You cannot add a route entry to an Enterprise Edition transit router by calling the CreateCenChildInstanceRouteEntryToCen operation.</li>
     * <li>By default, the next hop of the route entry is the regional gateway of the Cloud Enterprise Network (CEN) instance. You cannot modify the next hop.</li>
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
     * <p>  Only inter-region connections created on Enterprise Edition transit routers support QoS policies.</p>
     * <ul>
     * <li>Traffic scheduling applies only to outbound traffic on Enterprise Edition transit routers.
     * For example, you create an inter-region connection between the China (Hangzhou) and China (Qingdao) regions, and create a QoS policy for the transit router in the China (Hangzhou) region. In this case, the QoS policy can ensure bandwidth for network traffic from the China (Hangzhou) region to the China (Qingdao) region. However, the QoS policy does not apply to network traffic from the China (Qingdao) region to the China (Hangzhou) region.</li>
     * <li><strong>CreateCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the task.<ul>
     * <li>If the QoS policy is in the <strong>Creating</strong> state, the QoS policy is being created. You can query the QoS policy but cannot perform other operations on the QoS policy.</li>
     * <li>If the QoS policy is in the <strong>Active</strong> state, the QoS policy is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call the <strong>CreateCenInterRegionTrafficQosPolicy</strong> operation, make sure that the following requirements are met:</p>
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
     * <p>The <strong>CreateCenInterRegionTrafficQosQueue</strong> operation is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of the QoS policy to determine the status of the queue. When you call this operation, you must set the <strong>TrafficQosPolicyId</strong> parameter.</p>
     * <ul>
     * <li>If a QoS policy is in the <strong>Modifying</strong> state, the queue is being created. In this case, you can query the QoS policy and queue but cannot perform other operations.</li>
     * <li>If a QoS policy is in the <strong>Active</strong> state, the queue is created.</li>
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
     * <p>Routing policies are sorted by priority. A smaller value indicates a higher priority. Each routing policy is a collection of conditional statements and execution statements. Starting from the routing policy with the highest priority, the system matches routes against the match conditions specified by routing policies. If a route meets all the match conditions of a routing policy, the system permits or denies the route based on the action specified in the routing policy. You can also modify the attributes of permitted routes. By default, the system permits routes that meet none of the match conditions. For more information, see <a href="https://help.aliyun.com/document_detail/124157.html">Routing policy overview</a>.
     * <code>CreateCenRouteMap</code> is an asynchronous operation. After you send a request, the routing policy ID is returned but the operation is still being performed in the system background. You can call <code>DescribeCenRouteMaps</code> to query the status of a routing policy.</p>
     * <ul>
     * <li>If a routing policy is in the <strong>Creating</strong> state, the routing policy is being created. In this case, you can query the routing policy but cannot perform other operations.</li>
     * <li>If a routing policy is in the <strong>Active</strong> state, the routing policy is created.</li>
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
     * <p>Flow logs can be used to capture traffic information about transit routers and network instance connections, including inter-region connections, virtual private cloud (VPC) connections, VPN connections, Express Connect Router (ECR) connections, and virtual border router (VBR) connections. Before you create a flow log, take note of the following items:</p>
     * <ul>
     * <li>Flow logs are supported only by Enterprise Edition transit routers.</li>
     * <li>Flow logs are used to capture information about outbound traffic on transit routers. Information about inbound traffic on transit routers is not captured.
     * For example, an Elastic Compute Service (ECS) instance in the US (Silicon Valley) region accesses an ECS instance in the US (Virginia) region through Cloud Enterprise Network (CEN). After you enable the flow log feature for the transit router in the US (Virginia) region, you can check the log entries about packets sent from the ECS instance in the US (Virginia) region to the ECS instance in the US (Silicon Valley) region. However, packets sent from the ECS instance in the US (Silicon Valley) region to the ECS instance in the US (Virginia) region are not recorded. If you want to record the packets sent from the ECS instance in the US (Silicon Valley) region to the ECS instance in the US (Virginia) region, you must also enable the flow log feature on the transit router that is in the US (Silicon Valley) region.</li>
     * <li>If you use a flow log to capture traffic information about VPC connections, the flow log captures information only about traffic on the elastic network interface (ENI) of the transit router. For more information about how to view traffic information about other ENIs in the VPC, see <a href="https://help.aliyun.com/document_detail/127150.html">VPC flow log overview</a>.</li>
     * <li><code>CreateFlowLog</code> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.<ul>
     * <li>If the flow log is in the <strong>Creating</strong> state, the flow log is being created. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Required resources are created. For more information about how to create resources, see the following topics:</p>
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
     * <p>  Only Enterprise Edition transit routers support traffic marking policies.</p>
     * <ul>
     * <li><strong>CreateTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a traffic marking policy ID and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic marking policy.<ul>
     * <li>If a traffic marking policy is in the <strong>Creating</strong> state, the traffic marking policy is being created. You can query the traffic marking policy but cannot perform other operations.</li>
     * <li>If a traffic marking policy is in the <strong>Active</strong> state, the traffic marking policy is created.</li>
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
     * <p>After you add an aggregate route to a route table of an Enterprise Edition transit router, the transit router advertises its routes only to route tables of associated virtual private clouds (VPCs) and have route synchronization enabled.
     * Perform the following operations before you create an aggregate route. Otherwise, the Enterprise Edition transit router does not advertise routes to VPC route tables:</p>
     * <ul>
     * <li>Associated forwarding is enabled between the VPCs and the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/261242.html">AssociateTransitRouterAttachmentWithRouteTable</a>.</li>
     * <li>Route synchronization is enabled for the VPCs. For more information, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</li>
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
     * <p>  You can call <strong>CreateTransitRouter</strong> to create an Enterprise Edition transit router. For more information about the regions that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></p>
     * <ul>
     * <li><strong>CreateTransitRouter</strong> is an asynchronous operation. After you send a request, the transit router ID is returned but the operation is still being performed in the system background. You can call <a href="https://help.aliyun.com/document_detail/261219.html">ListTransitRouters</a> to query the status of an Enterprise Edition transit router.<ul>
     * <li>If an Enterprise Edition transit router is in the <strong>Creating</strong> state, the Enterprise Edition transit router is being created. In this case, you can query the Enterprise Edition transit router but cannot perform other operations.</li>
     * <li>If an Enterprise Edition transit router is in the <strong>Active</strong> state, the Enterprise Edition transit router is created.</li>
     * </ul>
     * </li>
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
     * <p>You can specify a CIDR block for a transit router. The CIDR block works in a similar way as the CIDR block of the loopback interface on a router. IP addresses within the CIDR block can be assigned to IPsec-VPN connections. For more information, see <a href="https://help.aliyun.com/document_detail/462635.html">Transit router CIDR blocks</a>.
     * The <strong>CreateTransitRouterCidr</strong> operation can be used to create a CIDR block only after you create a transit router.
     * The CIDR block must meet the following requirements:</p>
     * <ul>
     * <li>Only Enterprise Edition transit routers support custom CIDR blocks.</li>
     * <li>For more information, see <a href="https://help.aliyun.com/document_detail/462635.html">Limits in transit router CIDR blocks</a>.</li>
     * <li>Each transit router supports at most five CIDR blocks. The subnet mask of a CIDR block must be 16 bits to 24 bits in length.</li>
     * <li>The following CIDR blocks and their subnets are not supported: 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, and 169.254.0.0/16.</li>
     * <li>The CIDR block cannot overlap with the CIDR blocks of the network instances that communicate with each other by using the CEN instance.</li>
     * <li>On the same CEN instance, each transit router CIDR block must be unique.</li>
     * <li>When you create the first VPN connection after you add a CIDR block for a transit router, three CIDR blocks within the CIDR block are reserved. An IP address is allocated from the remaining CIDR blocks to the IPsec-VPN connection.
     * You can call the <a href="https://help.aliyun.com/document_detail/464173.html">ListTransitRouterCidrAllocation</a> operation to query reserved CIDR blocks and IP addresses allocated to network connections.</li>
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
     * <p>  Only Enterprise Edition transit routers support ECR connections.</p>
     * <ul>
     * <li>The following methods describe how to attach an ECR connection to an Enterprise Edition transit router:<ul>
     * <li>If an Enterprise Edition transit router is created in the region, specify the <strong>EcrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong> parameters.</li>
     * <li>If no Enterprise Edition transit router is created in the region, specify the <strong>EcrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong> parameters. An Enterprise Edition transit router is automatically created when you create an ECR connection.</li>
     * </ul>
     * </li>
     * <li>CreateTransitRouterEcrAttachment is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>ListTransitRouterEcrAttachments</strong> operation to query the status of an ECR connection.<ul>
     * <li>If the ECR connection is in the <strong>Attaching</strong> state, the ECR connection is being created. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection.</li>
     * <li>If the ECR connection is in the <strong>Attached</strong> state, the ECR connection is created.</li>
     * </ul>
     * </li>
     * <li>After you create an ECR connection, the ECR connection is not in route learning or associated forwarding relationships with Enterprise Edition transit routers.
     * After you enable <a href="https://help.aliyun.com/document_detail/468300.html">route learning</a> between the ECR connection and an Enterprise Edition transit router, the routes of the ECR are automatically advertised to the route tables of the Enterprise Edition transit router.</li>
     * <li>After you create an ECR connection, the routes in the route tables of the Enterprise Edition transit router to which the ECR connection is attached are automatically advertised to the route table of the ECR.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisite</h3>
     * <ul>
     * <li>The Alibaba Cloud account of the Enterprise Edition transit router and the Alibaba Cloud account of the ECR belong to the same enterprise.</li>
     * <li>The Enterprise Edition transit router and ECR can belong to the same Alibaba Cloud account or different Alibaba Cloud accounts. If the Enterprise Edition transit router and ECR belong to different Alibaba Cloud accounts, grant the transit router permissions on the ECR before you can attach the ECR to the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Acquire permissions to connect to a network instance that belongs to another account</a>.</li>
     * <li><strong>Before you call this operation to attach an ECR connection to an Enterprise Edition transit router, you must call the <a href="https://help.aliyun.com/document_detail/2712082.html">CreateExpressConnectRouterAssociation</a> operation to create an association between the ECR and transit router.</strong>
     * <strong>If you call the DeleteTransitRouterEcrAttachment operation to forcefully delete an ECR connection, the association between the ECR connection and Enterprise Edition transit router is deleted.</strong></li>
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
     * <p>Before you call this operation, read the following rules:</p>
     * <ul>
     * <li>Make sure that an Enterprise Edition transit router is deployed in the region where you want to create the multicast domain, and the multicast feature is enabled for the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/261169.html">CreateTransitRouter</a>.
     * If an Enterprise Edition transit router was created before you apply for multicast resources, the transit router does not support multicast. You can delete the transit router and create a new one. For more information about how to delete an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261218.html">DeleteTransitRouter</a>.</li>
     * <li>When you call <strong>CreateTransitRouterMulticastDomain</strong>, if you set <strong>CenId</strong> and <strong>RegionId</strong>, you do not need to set <strong>TransitRouterId</strong>. If you set <strong>TransitRouterId</strong>, you do not need to set <strong>CenId</strong> or <strong>RegionId</strong>.</li>
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
     * <p>  Enterprise Edition transit routers allow you to allocate bandwidth resources to inter-region connections by using the following methods:
     *     *   <strong>Allocate bandwidth resources from a bandwidth plan</strong>:
     *         You must purchase a bandwidth plan, and then allocate bandwidth resources from the bandwidth plan to inter-region connections. For more information about how to purchase a bandwidth plan, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a>.
     *     *   <strong>Use pay-by-data-transfer bandwidth resources</strong>:
     *         You can set a maximum bandwidth value for an inter-region connection. Then, you are charged for the amount of data transfer over the connection. For more information, see <a href="https://help.aliyun.com/document_detail/337827.html">Inter-region data transfer</a>.</p>
     * <ul>
     * <li><strong>CreateTransitRouterPeerAttachment</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of an inter-region connection.<ul>
     * <li>If the inter-region connection is in the <strong>Attaching</strong> state, the inter-region connection is being created. In this case, you can query the connection but cannot perform other operations on the connection.</li>
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
     * <p>To associate an Enterprise Edition transit router with a route prefix, you must meet the following requirements:</p>
     * <ul>
     * <li>You are familiar with the limits and route compatibility notes of prefix lists. For more information, see <a href="https://help.aliyun.com/document_detail/445605.html">Prefix lists</a>.</li>
     * <li>A prefix list is created. For more information, see <a href="https://help.aliyun.com/document_detail/437367.html">CreateVpcPrefixList</a>.</li>
     * <li>If the prefix list and the Enterprise Edition transit router belong to different Alibaba Cloud accounts, the prefix list is shared with the Alibaba Cloud account that owns the Enterprise Edition transit router. For more information, see <a href="https://help.aliyun.com/document_detail/160622.html">Resource sharing</a> and <a href="https://help.aliyun.com/document_detail/193445.html">API references for resource sharing</a>.</li>
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
     * <p><em>CreateTransitRouterRouteEntry</em>* is an asynchronous operation. After you send a request, the route ID is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouterRouteEntries</strong> to query the status of a route.</p>
     * <ul>
     * <li>If a route is in the <strong>Creating</strong> state, the route is being created. In this case, you can query the route but cannot perform other operations.</li>
     * <li>If a route is in the <strong>Active</strong> state, the route is created.</li>
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
     * <p>  Only Enterprise Edition transit routers support custom route tables. For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></p>
     * <ul>
     * <li><strong>CreateTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the route table ID is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouterRouteTables</strong> to query the status of a route table.<ul>
     * <li>If a route table is in the <strong>Creating</strong> state, the route table is being created. In this case, you can query the route table but cannot perform other operations.</li>
     * <li>If a route table is in the <strong>Active</strong> state, the route table is created.</li>
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
     * <p>  For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></p>
     * <ul>
     * <li>You can use the following methods to create a VBR connection on an Enterprise Edition transit router:<ul>
     * <li>If an Enterprise Edition transit router is already created in the region, specify the <strong>VbrId</strong>, <strong>RegionId</strong>, and <strong>TransitRouterId</strong> parameters to create a VBR connection.</li>
     * <li>If no Enterprise Edition transit router is already created in the region, specify the <strong>VbrId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong> parameters to create a VBR connection. When you create a VBR connection, the system automatically creates an Enterprise Edition transit router in the specified region.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTransitRouterVbrAttachment</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <strong>ListTransitRouterVbrAttachments</strong> to query the status of a VBR connection.<ul>
     * <li>If the VBR connection is in the <strong>Attaching</strong> state, the VBR connection is being created. In this case, you can query the VBR connection but cannot perform other operations.</li>
     * <li>If the VBR connection is in the <strong>Attached</strong> state, the VBR connection is created.</li>
     * </ul>
     * </li>
     * <li>The transit router and the VBR must belong to the same Alibaba Cloud account.</li>
     * <li>Transit routers can connect to VBRs that belong to the same or a different Alibaba Cloud account. To connect a transit router to a VBR that belongs to a different Alibaba Cloud account, grant permissions on the VBR to the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Grant a transit router permissions on a network instance that belongs to another Alibaba Cloud account</a>.</li>
     * <li>After you create a VBR connection, it is not in route learning or associated forwarding relationship with transit router route tables by default.</li>
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
     * <p>  You can use the following methods to create a VPC connection from an Enterprise Edition transit router:
     *     *   If an Enterprise Edition transit router is already created in the region where you want to create a VPC connection, configure the <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>TransitRouterId</strong>, and <strong>RegionId</strong> parameters.
     *     *   If no Enterprise Edition transit router is created in the region where you want to create a VPC connection, configure the <strong>VpcId</strong>, <strong>ZoneMappings.N.VSwitchId</strong>, <strong>ZoneMappings.N.ZoneId</strong>, <strong>CenId</strong>, and <strong>RegionId</strong> parameters. Then, the system automatically creates an Enterprise Edition transit router in the specified region.</p>
     * <ul>
     * <li><strong>CreateTransitRouterVpcAttachment</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/261222.html">ListTransitRouterVpcAttachments</a> operation to query the status of a VPC connection.<ul>
     * <li>If the VPC connection is in the <strong>Attaching</strong> state, the VPC connection is being created. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If the VPC connection is in the <strong>Attached</strong> state, the VPC connection is created.</li>
     * </ul>
     * </li>
     * <li>By default, route learning and associated forwarding are disabled between transit router route tables and VPC connections.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The VPC in the zones of the Enterprise Edition transit router contains at least one vSwitch. Each vSwitch must have at least one idle IP address. For more information, see <a href="https://help.aliyun.com/document_detail/181681.html">Regions and zones supported by Enterprise Edition transit routers</a>.</li>
     * <li>To connect to a network instance that belongs to another Alibaba Cloud account, you must first acquire the permissions from the account. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Acquire permissions to connect to a network instance that belongs to another account</a>.</li>
     * <li>VPC connections incur fees. Make sure that you understand the billing rules of VPC connections before you create a VPC connection. For more information, see <a href="https://help.aliyun.com/document_detail/189836.html">Billing</a>.</li>
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
     * <p>  By default, route learning and associated forwarding are disabled between transit router route tables and IPsec-VPN attachments.</p>
     * <ul>
     * <li>When you call <code>CreateTransitRouterVpnAttachment</code>, if you set <strong>CenId</strong> and <strong>RegionId</strong>, you do not need to set <strong>TransitRouterId</strong>. If you set <strong>TransitRouterId</strong> and <strong>RegionId</strong>, you do not need to set <strong>CenId</strong>.</li>
     * </ul>
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>Before you attach an IPsec-VPN connection to a transit router, make sure that at least one IPsec-VPN connection is created in the region where the transit router is deployed. Make sure the IPsec-VPN connection is not associated with a resource. For more information, see <a href="https://help.aliyun.com/document_detail/442455.html">CreateVpnAttachment</a>.</li>
     * <li>If the IPsec-VPN connection to be attached to the transit router belongs to a different Alibaba Cloud account, make sure that the transit router has obtained the required permissions from the IPsec-VPN connection. For more information, see <a href="https://help.aliyun.com/document_detail/417520.html">GrantInstanceToTransitRouter</a>.</li>
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
     * <p><code>DeactiveFlowLog</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.</p>
     * <ul>
     * <li>If a flow log is in the <strong>Modifying</strong> state, the flow log is being disabled. You can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log is in the <strong>Inactive</strong> state, the flow log is disabled.</li>
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
     * <p><em>DeleteCen</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call <strong>DescribeCens</strong> to query the status of a CEN instance.</p>
     * <ul>
     * <li>If the CEN instance is in the <strong>Deleting</strong> state, the CEN instance is being deleted. In this case, you can query the CEN instance but cannot perform other operations.</li>
     * <li>If the CEN instance cannot be found, the CEN instance is deleted.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The CEN instance that you want to delete is not associated with a bandwidth plan, and the transit router associated with the CEN instance does not have a network instance connection or a custom route table.</p>
     * <ul>
     * <li>For more information about how to detach a network instance, see the following topics:<ul>
     * <li><a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a><blockquote>
     * <p>For more information about how to detach network instances from a Basic Edition transit router, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>For more information about how to delete custom route tables from an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</li>
     * <li>For more information about how to disassociate a bandwidth plan from a CEN instance, see <a href="https://help.aliyun.com/document_detail/65935.html">UnassociateCenBandwidthPackage</a>.</li>
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
     * <p>  You can delete routes only from virtual private clouds (VPCs) and virtual border routers (VBRs) whose next hop is an <strong>Enterprise Edition transit router connection</strong>, which is the connection to the network instance.</p>
     * <ul>
     * <li><strong>DeleteCenChildInstanceRouteEntryToAttachment</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeRouteEntryList</strong> operation to query the status of a route.<ul>
     * <li>If a route is in the <strong>Deleting</strong> state, the route is being deleted. You can query the route but cannot perform other operations.</li>
     * <li>If a route cannot be found, the route is deleted.</li>
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
     * <h2>Limits</h2>
     * <ul>
     * <li>By default, the DeleteCenChildInstanceRouteEntryToCen operation is unavailable. To call this operation, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * <li>You cannot delete a route entry from an Enterprise Edition transit router by calling the DeleteCenChildInstanceRouteEntryToCen operation.</li>
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
     * <p>  Before you delete a QoS policy, you must delete all queues in the QoS policy except the default queue. For more information, see <a href="https://help.aliyun.com/document_detail/419062.html">DeleteCenInterRegionTrafficQosQueue</a>.</p>
     * <ul>
     * <li><strong>DeleteCenInterRegionTrafficQosPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of a QoS policy.<ul>
     * <li>If a QoS policy is in the <strong>Deleting</strong> state, the QoS policy is being deleted. You can query the QoS policy but cannot perform other operations.</li>
     * <li>If a QoS policy cannot be found, the QoS policy is deleted.</li>
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
     * <p>  You cannot delete the default queue.</p>
     * <ul>
     * <li><strong>DeleteCenInterRegionTrafficQosQueue</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation to query the status of a queue. If a queue cannot be found, the queue is deleted.</li>
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
     * <p><code>DeleteCenRouteMap</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of a routing policy.</p>
     * <ul>
     * <li>If a routing policy is in the <strong>Deleting</strong> state, the routing policy is being deleted. You can query the routing policy but cannot perform other operations.</li>
     * <li>If a routing policy cannot be found, it is deleted.</li>
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
     * <p><code>DeleteFlowlog</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.</p>
     * <ul>
     * <li>If a flow log is in the <strong>Deleting</strong> state, the flow log is being deleted. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log cannot be found, the flow log is deleted.</li>
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
     * <p><em>DeleteRouteServiceInCen</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. If the request parameters are invalid, the system returns a request ID, but the cloud service configuration is not deleted. You can call <strong>DescribeRouteServicesInCen</strong> to query the status of the task.</p>
     * <ul>
     * <li>If a cloud service is in the <strong>Deleting</strong> state, the cloud service configuration is being deleted. In this case, you can only query the cloud service configuration and cannot perform other operations.</li>
     * <li>If the specified cloud service configuration cannot be found, the cloud service configuration is deleted.</li>
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
     * <p>  <strong>DeleteTrafficMarkingPolicy</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic marking policy.
     *     *   If a traffic marking policy is in the <strong>Deleting</strong> state, the traffic marking policy is being deleted. You can query the traffic marking policy but cannot perform other operations.
     *     *   If a traffic marking policy cannot be found, the traffic marking policy is deleted.</p>
     * <ul>
     * <li>Before you delete a traffic marking policy, you must delete all traffic classification rules from the policy. For more information, see <a href="https://help.aliyun.com/document_detail/468330.html">RemoveTrafficMatchRuleFromTrafficMarkingPolicy</a>.</li>
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
     * <p>  Before you delete an aggregate route, make sure that your network has a redundant route to prevent service interruptions.</p>
     * <ul>
     * <li>After an aggregate route is deleted, the aggregate route is automatically withdrawn from virtual private clouds (VPCs). Specific routes that fall within the aggregate route are advertised to the VPCs.</li>
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
     * <p><em>DeleteTransitRouter</em>* is an asynchronous operation. After you send a request, the <strong>request ID</strong> is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouters</strong> to query the status of a transit router.</p>
     * <ul>
     * <li>If a transit router is in the <strong>Deleting</strong> state, the transit router is being deleted. In this case, you can query the transit router but cannot perform other operations.</li>
     * <li>If a transit router cannot be found, the transit router is deleted.</li>
     * </ul>
     * <h4>Prerequisites</h4>
     * <p>Before you delete a transit router, make sure that the following prerequisites are met:</p>
     * <ul>
     * <li><p>No network instance connections are created on the transit router. </p>
     * <ul>
     * <li>For more information about how to delete a virtual private cloud (VPC) connection, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>. </li>
     * <li>For more information about how to delete a virtual border router (VBR) connection, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>. </li>
     * <li>For more information about how to delete a Cloud Connect Network (CCN) connection, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>. </li>
     * <li>For more information about how to delete a VPN connection, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>For more information about how to delete an inter-region connection, see <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a>.</li>
     * </ul>
     * </li>
     * <li><p>No custom route tables are created on the transit router. For more information about how to delete a custom route table, see <a href="https://help.aliyun.com/document_detail/261235.html">DeleteTransitRouterRouteTable</a>.</p>
     * </li>
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
     * <p>If IP addresses within the CIDR block have been allocated to network instances, the CIDR block cannot be deleted.</p>
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
     * <p>DeleteTransitRouterEcrAttachment is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of an ECR connection.
     * If the ECR connection is in the Detaching state, the ECR connection is being deleted. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection. If the ECR connection cannot be found, the ECR connection is deleted. Before you call the DeleteTransitRouterEcrAttachment operation, make sure that all request parameters are valid. If a request is invalid, a request ID is returned but the ECR connection is not deleted.</p>
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
     * <p>Before you delete a multicast domain, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The multicast domain is disassociated from all vSwitches. For more information, see <a href="https://help.aliyun.com/document_detail/429774.html">DisassociateTransitRouterMulticastDomain</a>.</li>
     * <li>All multicast sources and members are removed from the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429776.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>The multicast domain is not added to other multicast domains as a multicast member. If the multicast domain is added to another multicast domain as a multicast member, you must remove the multicast domain from the other multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429779.html">DeregisterTransitRouterMulticastGroupMembers</a>.</li>
     * <li>Make sure all the request parameters are valid. If a request parameter is invalid, a request ID is returned after you call the operation, but the multicast domain is not deleted.</li>
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
     * <p><em>DeleteTransitRouterPeerAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call <strong>ListTransitRouterPeerAttachments</strong> to query the status of an inter-region connection.</p>
     * <ul>
     * <li>If an inter-region connection is in the <strong>Detaching</strong> state, the inter-region connection is being deleted. You can query the inter-region connection but cannot perform other operations.</li>
     * <li>If an inter-region connection cannot be found, the inter-region connection is deleted.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before you begin, make sure that the Enterprise Edition transit router that you use to create inter-region connections meets the following prerequisites:</p>
     * <ul>
     * <li>No associated forwarding correlation is established between the inter-region connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see <a href="https://help.aliyun.com/document_detail/260944.html">DissociateTransitRouterAttachmentFromRouteTable</a>.</li>
     * <li>No route learning correlation is established between the inter-region connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see <a href="https://help.aliyun.com/document_detail/260945.html">DisableTransitRouterRouteTablePropagation</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom routes from route tables of Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261240.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>The route table does not contain a route whose next hop is the inter-region connection and that is generated from a prefix list. You can delete routes from a route table by disassociating the route table from the prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/445486.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
     * <li>No quality of service (QoS) policy is configured for the inter-region connection. For more information about how to delete QoS policies, see <a href="https://help.aliyun.com/document_detail/427547.html">DeleteCenInterRegionTrafficQosPolicy</a>.</li>
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
     * <p>After you disassociate a route table of an Enterprise Edition transit router from a prefix list, the routes that point to the CIDR blocks in the prefix list are automatically withdrawn from the route table. Before you disassociate the route table of an Enterprise Edition transit router from a prefix list, you must migrate workloads that use the routes in case services are interrupted.</p>
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
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>If you specify the <strong>TransitRouterRouteEntryId</strong> parameter to delete a specific route, you do not need to configure the <strong>TransitRouterRouteTableId</strong> or <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>. Otherwise, parameter conflicts occur.</li>
     * <li>If you do not specify the <strong>TransitRouterRouteEntryId</strong> parameter, configure the following parameters based on the next hop type of the route that you want to delete:<ul>
     * <li>To delete a blackhole route, configure the following parameters: <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, and <strong>TransitRouterRouteEntryNextHopType</strong>.</li>
     * <li>To delete routes other than blackhole routes, configure the following parameters: <strong>TransitRouterRouteTableId</strong>, <strong>TransitRouterRouteEntryDestinationCidrBlock</strong>, <strong>TransitRouterRouteEntryNextHopType</strong>, and <strong>TransitRouterRouteEntryNextHopId</strong>.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteTransitRouterRouteEntry</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteEntries</strong> operation to query the status of a route entry.<ul>
     * <li>If the route entry is in the <strong>Deleting</strong> state, the route entry is being deleted. In this case, you can query the route entry but cannot perform other operations.</li>
     * <li>If a route entry cannot be found, it is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Limits</h3>
     * <p>You can call this operation to delete only static routes. Automatically learned routes are not supported. You can call the <a href="https://help.aliyun.com/document_detail/260941.html">ListTransitRouterRouteEntries</a> operation to query route types.</p>
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
     * <p>  You cannot delete the default route table of an Enterprise Edition transit router.</p>
     * <ul>
     * <li><strong>DeleteTransitRouterRouteTable</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTables</strong> operation to query the status of a custom route table.<ul>
     * <li>If a custom route table is in the Deleting state, the custom route table is being deleted. In this case, you can query the custom route table but cannot perform other operations.</li>
     * <li>If a custom route table cannot be found, the custom route table is deleted.</li>
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
     * <p><em>DeleteTransitRouterVbrAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVbrAttachments</strong> operation to query the status of a VBR connection.</p>
     * <ul>
     * <li>If a VBR connection is in the <strong>Detaching</strong> state, the VBR connection is being deleted. You can query the VBR connection but cannot perform other operations.</li>
     * <li>If a VBR connection cannot be found, the VBR connection is deleted.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before you delete a VBR connection for an Enterprise Edition transit router, make sure that the following requirements are met:</p>
     * <ul>
     * <li>No associated forwarding correlation is established between the VBR connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see <a href="https://help.aliyun.com/document_detail/260944.html">DissociateTransitRouterAttachmentFromRouteTable</a>.</li>
     * <li>No route learning correlation is established between the VBR connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see <a href="https://help.aliyun.com/document_detail/260945.html">DisableTransitRouterRouteTablePropagation</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom route entries, see <a href="https://help.aliyun.com/document_detail/261240.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a route whose next hop is the VBR connection and that is generated from a prefix list. You can delete such routes by disassociating the route table from the prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/445486.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
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
     * <p><em>DeleteTransitRouterVpcAttachment</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of a VPC connection.</p>
     * <ul>
     * <li>If a VPC connection is in the <strong>Detaching</strong> state, the VPC connection is being deleted. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If a VPC connection cannot be found, it is deleted.</li>
     * </ul>
     * <h2>Prerequisites</h2>
     * <p>Before you delete a VPC connection, make sure that the following requirements are met:</p>
     * <ul>
     * <li>No associated forwarding correlation is established between the VPC connection and the route tables of the Enterprise Edition transit router. For more information about how to delete an associated forwarding correlation, see <a href="https://help.aliyun.com/document_detail/260944.html">DissociateTransitRouterAttachmentFromRouteTable</a>.</li>
     * <li>No route learning correlation is established between the VPC connection and the route tables of the Enterprise Edition transit router. For more information about how to delete a route learning correlation, see <a href="https://help.aliyun.com/document_detail/260945.html">DisableTransitRouterRouteTablePropagation</a>.</li>
     * <li>The route table of the VPC does not contain routes that point to the VPC connection. For more information about how to delete routes from a VPC route table, see <a href="https://help.aliyun.com/document_detail/36013.html">DeleteRouteEntry</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a custom route entry whose next hop is the network instance connection. For more information about how to delete custom routes from the route tables of an Enterprise Edition transit router, see <a href="https://help.aliyun.com/document_detail/261240.html">DeleteTransitRouterRouteEntry</a>.</li>
     * <li>The route tables of the Enterprise Edition transit router do not contain a route that is generated from a prefix list and the next hop is the VPC connection. You can delete such routes by disassociating the route table from the prefix list. For more information, see <a href="https://help.aliyun.com/document_detail/445486.html">DeleteTransitRouterPrefixListAssociation</a>.</li>
     * </ul>
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
     * <p>Before you call the <strong>DeleteTransitRouterVpnAttachment</strong> operation, make sure that all request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned, but the VPN attachment is not deleted.</p>
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
     * <p><code>DeregisterTransitRouterMulticastGroupMembers</code> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast member.</p>
     * <ul>
     * <li>If the multicast member is in the <strong>Deregistering</strong> state, the multicast member is being removed. In this case, you can query the multicast member but cannot perform other operations on the multicast member.</li>
     * <li>If a multicast member cannot be found, the multicast member is removed from the multicast group.``
     * Before you call the DeregisterTransitRouterMulticastGroupMembers operation, make sure that all request parameters are valid. If a request parameter is invalid, a request ID is returned but the multicast member is not removed.</li>
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
     * <p><code>DeregisterTransitRouterMulticastGroupSources</code> is an asynchronous operation. After a request a sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast source.</p>
     * <ul>
     * <li>If a multicast source is in the <strong>Deregistering</strong> state, the multicast source is being deleted. You can query the multicast source but cannot perform other operations.</li>
     * <li>If a multicast source cannot be found, the multicast source is deleted.
     * Before you call DeregisterTransitRouterMulticastGroupSources, make sure that all the request parameters are valid. If a request parameter is invalid, a request ID is returned but the multicast source is not deleted.</li>
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
     * <p>You can use one of the following methods to query the information about the network instances that are attached to a CEN instance:</p>
     * <ul>
     * <li>You can query all the network instances that are attached to a CEN instance by setting the <code>CenId</code> parameter.</li>
     * <li>You can query the network instances that are attached to a CEN instance in a specified region by setting the <code>CenId</code> and <code>ChildInstanceRegionId</code> parameters.</li>
     * <li>You can query a specified type of network instances that are attached to a CEN instance by setting the <code>CenId</code> and <code>ChildInstanceType</code> parameters.</li>
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
     * <p>The regions that support CEN vary based on the network instance type. To query the regions where you can attach a specified type of network instance to CEN, set the <code>ProductType</code> parameter. If you do not set the <code>ProductType</code> parameter, the system queries all regions in which you can attach network instances to CEN, regardless of the network instance type.</p>
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
     * <p>Before you call the <strong>DescribeGrantRulesToCen</strong> operation, make sure that all request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned, but the network instances are not returned.</p>
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
     * <p>You can specify the values of the <strong>TransitRouteTableId</strong> and <strong>TransitRouteTableAggregationCidr</strong> parameters to query a specified aggregate route. If you specify only the <strong>TransitRouteTableId</strong> parameter, all aggregated routes in the route table are queried.</p>
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
     * <p><em>DisableCenVbrHealthCheck</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeCenVbrHealthCheck</strong> operation to query the status of health check configurations. If the health check configurations cannot be found, the health check configurations are deleted.</p>
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
     * <p><em>DisableTransitRouterRouteTablePropagation</em>* is an synchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTablePropagations</strong> operation to query the status of a route learning correlation.</p>
     * <ul>
     * <li>If a route learning correlation is in the <strong>Disabling</strong> state, the route learning correlation is being deleted. You can query the route learning correlation but cannot perform other operations.</li>
     * <li>If a route learning correlation cannot be found, the route learning correlation is deleted.</li>
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
     * <p>  Before you delete a vSwitch from a multicast domain, make sure that the vSwitch does not contain a multicast source or a multicast member. For more information about how to remove a multicast source or member from a vSwitch, see <a href="https://help.aliyun.com/document_detail/468416.html">DeregisterTransitRouterMulticastGroupSources</a> and <a href="https://help.aliyun.com/document_detail/468409.html">DeregisterTransitRouterMulticastGroupMembers</a>.</p>
     * <ul>
     * <li>If a request parameter is invalid, the system returns a request ID but does not disassociate the vSwitch from the multicast domain.</li>
     * <li><strong>DisassociateTransitRouterMulticastDomain</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterMulticastDomainAssociations</strong> operation to query whether a vSwitch is disassociated from the specified multicast domain.<ul>
     * <li>If the status is <strong>Dissociating</strong>, it indicates that the vSwitch is being disassociated from the specified multicast domain. You can query the vSwitch but cannot perform other operations on the vSwitch.</li>
     * <li>If the vSwitch cannot be found, the vSwitch is disassociated from the multicast domain.</li>
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
     * <p><em>DissociateTransitRouterAttachmentFromRouteTable</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTableAssociations</strong> operation to query an associated forwarding correlation between a network instance connection and a route table.</p>
     * <ul>
     * <li>If an associated forwarding correlation is in the <strong>Dissociating</strong> state, the associated forwarding correlation is being deleted. You can query the associated forwarding correlation but cannot perform other operations.</li>
     * <li>If an associated forwarding correlation cannot be found, the associated forwarding correlation is deleted.</li>
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
     * <p>You can enable the health check feature for a VBR to monitor the Express Connect circuit between your data center and Alibaba Cloud. This helps you detect connection issues in a timely manner.
     * Before you use the health check feature, take note of the following information:</p>
     * <ul>
     * <li>If your VBR uses static routing, you must add a static route for the data center that is connected to the VBR after you configure the health check feature. Set the destination CIDR block to the source IP address of health checks, set the mask length to 32, and set the next hop to the IP address of the VBR on the Alibaba Cloud side.</li>
     * <li>If your VBR uses dynamic Border Gateway Protocol (BGP) routing, you do not need to add routes for the data center.</li>
     * <li><strong>EnableCenVbrHealthCheck</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>DescribeCenVbrHealthCheck</strong> operation to query the status of health check configurations. If health check configurations are returned, health check is configured or modified.</li>
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
     * <p>After you establish a network instance connection on a transit router, you can create a route learning correlation for the network instance connection. Then, the routes of the connected network instance are automatically advertised to the route table of the transit router. Before you begin, we recommend that you take note of the following rules:</p>
     * <ul>
     * <li>You can create route learning correlations only on Enterprise Edition transit routers. For more information about the regions and zones that support Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/181681.html">What is CEN?</a></li>
     * <li><strong>EnableTransitRouterRouteTablePropagation</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterRouteTablePropagations</strong> operation to query the route learning status between a network instance connection and a route table.<ul>
     * <li><strong>Enabling</strong> indicates that a route learning correlation is being created between the network instance connection and route table. You can query the route learning correlation but cannot perform other operations.</li>
     * <li><strong>Active</strong> indicates that the route learning correlation is created between the network instance connection and route table.</li>
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
     * <p>  The <code>GrantInstanceToTransitRouter</code> operation can be used to grant transit routers permissions on network instances that belong to other Alibaba Cloud accounts, including virtual private clouds (VPCs), virtual border routers (VBRs), IPsec-VPN connections, and Express Connect Router (ECRs).
     *     To grant transit routers permissions on Cloud Connect Network (CCN) instances, call the <a href="https://help.aliyun.com/document_detail/126141.html">GrantInstanceToCbn</a> operation.</p>
     * <ul>
     * <li>Before you call <code>GrantInstanceToTransitRouter</code>, take note of the billing rules, permission limits, and prerequisites on permission management of transit routers. For more information, see <a href="https://help.aliyun.com/document_detail/181553.html">Acquire permissions to connect to a network instance that belongs to another account</a>.</li>
     * <li>Before you grant a transit router permissions on a network instance, make sure that the following requirements are met:
     * The account to which the network instance belongs and the account to which the transit router belongs are of the same type.
     * The ID of the Alibaba Cloud account to which the transit router belongs is obtained.
     * The ID of the Cloud Enterprise Network (CEN) instance to which the Enterprise Edition transit router belongs is obtained.
     * Before you grant a transit router permissions on a VBR, contact your account manager to acquire permissions on the VBR.
     * Before you grant a transit router permissions on an IPsec-VPN connection, make sure that the IPsec-VPN connection is not associated with a resource.
     * If the IPsec-VPN connection is attached to a VPN gateway, the IPsec-VPN connection cannot be attached to transit routers within the same account or different accounts.
     * If the IPsec-VPN connection is attached to a transit router, detach the IPsec-VPN connection from the transit router. For more information, see <a href="https://help.aliyun.com/document_detail/181554.html">Delete a network instance connection</a>.</li>
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
     * <p>Before you call the ListCenChildInstanceRouteEntriesToAttachment operation, make sure that all request parameter values are valid. If a parameter is set to an invalid value, a request ID is returned, but the routes to the network instance are not returned.</p>
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
     * <p>Before you call the <strong>ListCenInterRegionTrafficQosPolicies</strong> operation, take note of the following information:</p>
     * <ul>
     * <li>You must specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficQosPolicyId</strong> parameters.</li>
     * <li>If you do not specify a QoS policy ID (<strong>TrafficQosPolicyId</strong>), the system returns information based on the values of the <strong>TransitRouterId</strong>, <strong>TransitRouterAttachmentId</strong>, <strong>TrafficQosPolicyName</strong>, and <strong>TrafficQosPolicyDescription</strong> parameters. The information about the queues in the QoS policies is not returned. In this case, the <strong>TrafficQosQueues</strong> parameter is not included in the response.</li>
     * <li>If you specify a QoS policy ID (<strong>TrafficQosPolicyId</strong>), the system returns the information about the QoS policy and queues in the QoS policy. In this case, the <strong>TrafficQosQueues</strong> parameter is included in the response. If the value of the <strong>TrafficQosQueues</strong> parameter is an empty string, it indicates that the QoS policy contains only the default queue.</li>
     * <li>Make sure that all the request parameters are valid. If a request parameter is invalid, a request ID is returned but the information about the QoS policy is not returned.</li>
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
     * <p>You must specify at least one of the <strong>TransitRouterId</strong>, <strong>TrafficQosPolicyId</strong>, and <strong>TrafficQosQueueId</strong> parameters.
     * Make sure that all the request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned but the QoS queue information is not returned.</p>
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
     * <p>Before you call <code>ListGrantVSwitchEnis</code>, make sure that the VPC is attached to a Cloud Enterprise Network (CEN) instance. For more information, see <a href="https://help.aliyun.com/document_detail/468237.html">CreateTransitRouterVpcAttachment</a>.</p>
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
     * <p>Before you call the <code>ListGrantVSwitchesToCen</code> operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The permissions on the VPC are granted to the CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/126224.html">GrantInstanceToCen</a>.</li>
     * <li>The VPC is attached to the CEN instance.<ul>
     * <li>For more information about how to connect an Enterprise Edition transit router to a VPC, see <a href="https://help.aliyun.com/document_detail/261358.html">CreateTransitRouterVpcAttachment</a>.</li>
     * <li>For more information about how to connect a Basic Edition transit router to a VPC, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
     * </ul>
     * </li>
     * </ul>
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
     * <p>To call this operation, you must set at least one of <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>.</p>
     * <ul>
     * <li>If you set only <strong>ResourceId.N</strong>, the tags that are added to the specified CEN instances are returned.</li>
     * <li>If you set only <strong>Tag.N.Key</strong>, the CEN instances that have the specified tags are returned.</li>
     * <li>If you set both <strong>ResourceId.N</strong> and <strong>Tag.N.Key</strong>, the specified tags that are added to the specified CEN instances are returned.<ul>
     * <li>Make sure that the CEN instance specified by <strong>ResourceId.N</strong> has the tag specified by <strong>Tag.N.Key</strong>. Otherwise, the response returns null.</li>
     * <li>If multiple tag keys are specified, the logical operator among these tag keys is <strong>AND</strong>.</li>
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
     * <p>Before you call the <strong>ListTrafficMarkingPolicies</strong> operation, take note of the following limits:</p>
     * <ul>
     * <li>Specify at least one of the <strong>TransitRouterId</strong> and <strong>TrafficMarkingPolicyId</strong> parameters.</li>
     * <li>If you do not specify a traffic marking policy ID (<strong>TrafficMarkingPolicyId</strong>), the operation queries only the information about the traffic marking policy based on the <strong>TransitRouterId</strong>, <strong>TrafficMarkingPolicyName</strong>, and <strong>TrafficMarkingPolicyDescription</strong> parameters. The <strong>TrafficMatchRules</strong> parameter that contains the information about the traffic classification rules is not returned.</li>
     * <li>If you specify a traffic marking policy ID (<strong>TrafficMarkingPolicyId</strong>), the operation queries the information about the traffic marking policy and traffic classification rules. The <strong>TrafficMatchRules</strong> parameter is returned in the response. If the value of the <strong>TrafficMatchRules</strong> parameter is an empty array, the traffic marking policy does not contain a traffic classification rule.</li>
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
     * <p>  You can call the <strong>ListTransitRouterAvailableResource</strong> operation to query the zones that support Enterprise Edition transit routers in a specified region.
     *     *   If you do not set <strong>SupportMulticast</strong> to <strong>true</strong>, general-purpose zones that support Enterprise Edition transit routers are queried.
     *     *   If you set <strong>SupportMulticast</strong> to <strong>true</strong>, zones in which Enterprise Edition transit routers support multicast are queried.</p>
     * <ul>
     * <li>On May 31, 2022, VPC-connected Enterprise Edition transit routers were optimized. Optimized Enterprise Edition transit routers do not require you to specify the primary and secondary zones when you connect VPCs to the Enterprise Edition transit routers. You can specify one or more zones.<ul>
     * <li>If your Enterprise Edition transit router has not been optimized, you must specify the primary and secondary zones when you connect a VPC to your Enterprise Edition transit router. After you call <strong>ListTransitRouterAvailableResource</strong>, you can call <strong>MasterZones</strong> and <strong>SlaveZones</strong> to query the primary and secondary zones.</li>
     * <li>If your Enterprise Edition transit router has been optimized, you can specify a zone as needed when you connect a VPC to your Enterprise Edition transit router. After you call <strong>ListTransitRouterAvailableResource</strong>, you can call <strong>AvailableZones</strong> to query the zones.
     * For more information about the optimization, see <a href="https://help.aliyun.com/document_detail/434191.html">Announcement: Optimization on VPC-connected Enterprise Edition transit routers</a>.</li>
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
     * <p>You can use the following methods to query ECR connection information:</p>
     * <ul>
     * <li>Specify the ID of an Enterprise Edition transit router.</li>
     * <li>Specify the ID of an Enterprise Edition transit router and the ID of the region in which the Enterprise Edition transit router is deployed.</li>
     * <li>Configure the <strong>TransitRouterAttachmentId</strong> parameter to specify the ECR connection that you want to query.</li>
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
     * <p>  You must set at least <strong>TransitRouterMulticastDomainId</strong> and <strong>TransitRouterAttachmentId</strong>. If you set <strong>TransitRouterAttachmentId</strong>, the information about the vSwitches in a virtual private cloud (VPC) that are associated with a multicast domain is returned. If you set <strong>TransitRouterMulticastDomainId</strong>, the information about the vSwitches that are associated with a multicast domain is returned.</p>
     * <ul>
     * <li>Before you call <strong>ListTransitRouterMulticastDomainAssociations</strong>, make sure that all the request parameters are valid. If a request parameter is invalid, the system returns a <strong>request ID</strong> but does not return the vSwitches that are associated with the multicast domain.</li>
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
     * <p>  If you configure one of the RegionId and CenId parameters, you must configure the other parameter. Otherwise, no information about the multicast domain is returned. You can configure only one of the TransitRouterId and TransitRouterMulticastDomainId parameters.</p>
     * <ul>
     * <li>Make sure that all the request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned but the information about the multicast domain is not returned.</li>
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
     * <p>You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the multicast sources and members in a multicast domain. Multicast sources and members are also known as multicast resources.</p>
     * <ul>
     * <li>If you set <strong>GroupIpAddress</strong>, the system queries multicast resources in the multicast domain by multicast group.</li>
     * <li>If you set <strong>VSwitchIds</strong>, the system queries multicast resources in the multicast domain by vSwitch.</li>
     * <li>If you set <strong>PeerTransitRouterMulticastDomains</strong>, the system queries multicast resources that are also deployed in a different region.</li>
     * <li>If you set <strong>ResourceType</strong>, the system queries the multicast resources of the specified type in the multicast domain.</li>
     * <li>If you set <strong>ResourceId</strong>, the system queries multicast resources by resource.</li>
     * <li>If you set only <strong>TransitRouterMulticastDomainId</strong>, the system queries all the multicast resources in the multicast domain.</li>
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
     * <p>You can use the following methods to query inter-region connections on an Enterprise Edition transit router:</p>
     * <ul>
     * <li>Query all inter-region connections on an Enterprise Edition transit router by specifying the ID of the Enterprise Edition transit router.</li>
     * <li>Query all inter-region connections on an Enterprise Edition transit router by specifying the ID of the Cloud Enterprise Network (CEN) instance and the ID of the region where the transit router is deployed.</li>
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
     * <p>When you call <strong>ListTransitRouterRouteTableAssociations</strong>, you must set at least one of <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong>.</p>
     * <ul>
     * <li>If you set only <strong>TransitRouterRouteTableId</strong>, the network instance connections that are in associated forwarding correlation with a route table of an Enterprise Edition transit router are queried.</li>
     * <li>If you set only <strong>TransitRouterAttachmentId</strong>, the route table of an Enterprise Edition transit router that is in associated forwarding correlation with a network instance connection is queried.</li>
     * <li>If you set both <strong>TransitRouterRouteTableId</strong> and <strong>TransitRouterAttachmentId</strong>, the associated forwarding correlations between a specified network instance connection and a specified route table of an Enterprise Edition transit router are queried.<ul>
     * <li>If an associated forwarding correlation is created between the network instance connection and the route table of the Enterprise Edition transit router, the information about the associated forwarding correlation is returned.</li>
     * <li>If no associated forwarding correlation is created between the network instance connection and the route table of the Enterprise Edition transit router, <strong>TransitRouterAssociations</strong> in the response is empty.</li>
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
     * <p>You can use the following methods to query VBR connections on an Enterprise Edition transit router:</p>
     * <ul>
     * <li>Specify the ID of the Enterprise Edition transit router.</li>
     * <li>Specify the ID of the relevant Cloud Enterprise Network (CEN) instance and the region ID of the Enterprise Edition transit router.</li>
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
     * <p>You can use the following methods to query VPC connections on an Enterprise Edition transit router:</p>
     * <ul>
     * <li>Specify the ID of the Enterprise Edition transit router.</li>
     * <li>Specify the ID of the relevant Cloud Enterprise Network (CEN) instance and the region ID of the Enterprise Edition transit router.</li>
     * <li>Specify the ID of the region where the Enterprise Edition transit router is deployed.</li>
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
     * <p>You can use the following methods to call the ListTransitRouterVpnAttachments operation:</p>
     * <ul>
     * <li>Specify only the <strong>TransitRouterAttachmentId</strong> parameter to query the information about a VPN attachment.</li>
     * <li>Specify only the <strong>TransitRouterId</strong> parameter to query the information about all VPN attachments on a transit router.</li>
     * <li>Specify the <strong>CenId</strong> and <strong>RegionId</strong> parameter to query the information about VPN attachments in a specified region.
     * Before you call the <strong>ListTransitRouterVpnAttachments</strong> operation, make sure that all request parameters are valid. If a request parameter is invalid, a <strong>request ID</strong> is returned, but the information about the VPN attachments is not returned.</li>
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
     * <p>You can set the <strong>RegionId</strong> and <strong>TransitRouterId</strong> parameters based on your requirements.</p>
     * <ul>
     * <li>If you do not set <strong>RegionId</strong> or <strong>TransitRouterId</strong>, the system queries all transit routers that are connected to the specified CEN instance.</li>
     * <li>If you set only <strong>RegionId</strong>, the system queries transit routers that are deployed in the specified region.</li>
     * <li>If you set only <strong>TransitRouterId</strong>, the system queries the specified transit router.</li>
     * <li>If you set both <strong>RegionId</strong> and <strong>TransitRouterId</strong>, the system queries the specified transit router in the specified region.</li>
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
     * <p><em>ModifyCenAttribute</em>* is an asynchronous operation. After you send a request, the system returns the <strong>request ID</strong> but the operation is still being performed in the system background. You can call <strong>DescribeCens</strong> to query the status of a CEN instance.</p>
     * <ul>
     * <li>If a CEN instance is in the <strong>Modifying</strong> state, the CEN instance is being modified. You can query the CEN instance but cannot perform other operations.</li>
     * <li>If a CEN instance is in the <strong>Active</strong> state, the CEN instance is modified.</li>
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
     * <p><code>ModifyCenRouteMap</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeCenRouteMaps</code> operation to query the status of a routing policy.</p>
     * <ul>
     * <li><strong>Modifying</strong>: indicates that the system is modifying the routing policy. You can only query the routing policy, but cannot perform other operations.</li>
     * <li><strong>Active</strong>: indicates that the routing policy is modified.</li>
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
     * <p><code>ModifyFlowLogAttribute</code> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>DescribeFlowlogs</code> operation to query the status of a flow log.</p>
     * <ul>
     * <li>If a flow log is in the <strong>Modifying</strong> state, the flow log is being modified. In this case, you can query the flow log but cannot perform other operations.</li>
     * <li>If a flow log is in the <strong>Active</strong> state, the flow log is modified.</li>
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
     * <p>  Before you modify the CIDR block of a transit router, we recommend that you read the <a href="https://help.aliyun.com/document_detail/462635.html">limits on transit router CIDR blocks</a>.</p>
     * <ul>
     * <li>If IP addresses within the CIDR block have been allocated to network instances, you cannot modify the CIDR block.</li>
     * <li>When you call <strong>ModifyTransitRouterCidr</strong>, if no parameter of the <strong>PublishCidrRoute</strong> operation is modified, ModifyTransitRouterCidr is a synchronous operation. After you call the operation, the new settings are immediately applied.</li>
     * <li>If a parameter of the <strong>PublishCidrRoute</strong> operation is modified, <strong>ModifyTransitRouterCidr</strong> is an asynchronous operation. After you call the operation, the request ID (<strong>RequestId</strong>) is returned but the operation is still being performed in the system background. You can call <strong>ListTransitRouterCidr</strong> to query the status of the CIDR block of the transit router.<ul>
     * <li>If the CIDR block of the transit router remains unchanged, the CIDR block is still being modified.</li>
     * <li>If the CIDR block of the transit router is changed to the one that you specify in the request, the CIDR block has been modified.</li>
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
     * <p>By default, CEN instances and bandwidth plans are in the default resource group. You can call the <code>MoveResourceGroup</code> operation to move CEN instances or bandwidth plans to another resource group.</p>
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
     * <p>You can call the <code>OpenTransitRouterService</code> operation to activate the transit router feature free of charge. After the <code>OpenTransitRouterService</code> operation succeeds, an order is automatically generated. You can use the returned order ID to query the order information in <a href="https://usercenter2-intl.aliyun.com/billing/#/account/overview">Alibaba Cloud User Center</a>.</p>
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
     * <p>The following table describes whether routes of different types are advertised to CEN by default. You can call the PublishRouteEntries operation to advertise routes to CEN.</p>
     * <table>
     * <thead>
     * <tr>
     * <th>Route</th>
     * <th>Network instance</th>
     * <th>Advertised to CEN by default</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Routes that route network traffic to Elastic Compute Service (ECS) instances</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to VPN gateways</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to high-availability virtual IP addresses (HAVIPs)</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to router interfaces</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to elastic network interfaces (ENIs)</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to IPv6 gateways</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to NAT gateways</td>
     * <td>VPC</td>
     * <td>No</td>
     * </tr>
     * <tr>
     * <td>System routes of VPCs</td>
     * <td>VPC</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Routes that route network traffic to data centers</td>
     * <td>VBR</td>
     * <td>Yes</td>
     * </tr>
     * <tr>
     * <td>Border Gateway Protocol (BGP) routes</td>
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
     * <p>Enterprise Edition transit routers support only elastic network interfaces (ENIs) as multicast members. You can call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to specify an ENI in the current region or a different region as a multicast member.</p>
     * <ul>
     * <li>If you specify a value for the <strong>NetworkInterfaceIds</strong> parameter, an ENI in the current region is to be specified as a multicast member. Make sure that the ENI and vSwitch are associated with the multicast group. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</li>
     * <li>If you specify a value for the <strong>PeerTransitRouterMulticastDomains</strong>, a multicast member in a multicast group that belongs to another region but has the same IP address as the current multicast group is to be specified as a multicast member for the current multicast group. Make sure that an inter-region connection is established between the regions. For more information, see <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>.
     * For example, you created Multicast Group 1 in Multicast Domain 1, which is in the China (Hangzhou) region. You created Multicast Group 2 in Multicast Domain 2, which is in the China (Shanghai) region. Multicast Group 1 and Multicast Group 2 use the same multicast IP address, and Multicast Member 2 is in Multicast Group 2 in the China (Shanghai) region. If you call the <code>RegisterTransitRouterMulticastGroupMembers</code> operation to add multicast members to Multicast Group 1 in the China (Hangzhou) region and set <strong>PeerTransitRouterMulticastDomains</strong> to the ID of Multicast Group 2, which is in the China (Shanghai) region, Multicast Member 2, which is in Multicast Domain 2 in the China (Shanghai) region is added to Multicast Group 1 in the China (Hangzhou) region.</li>
     * <li><code>RegisterTransitRouterMulticastGroupMembers</code> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast member.<ul>
     * <li>If the multicast member is in the <strong>Registering</strong>, the multicast member is being created. In this case, you can query the multicast member but cannot perform other operations on the multicast member.</li>
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
     * <p>  You can specify only elastic network interfaces (ENIs) as multicast sources.</p>
     * <ul>
     * <li><code>RegisterTransitRouterMulticastGroupSources</code> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <code>ListTransitRouterMulticastGroups</code> operation to query the status of a multicast source.<ul>
     * <li>If a multicast source is in the <strong>Registering</strong> state, the multicast source is being created. You can query the multicast source but cannot perform other operations on the multicast source.</li>
     * <li>If a multicast source is in the <strong>Registered</strong> state, the multicast source is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3>Prerequisite</h3>
     * <p>Before you call <code>RegisterTransitRouterMulticastGroupSources</code>, make sure that the vSwitch on which the ENI is created is associated with the multicast domain. For more information, see <a href="https://help.aliyun.com/document_detail/429778.html">AssociateTransitRouterMulticastDomain</a>.</p>
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
     * <p>  When you call <strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong>, take note of the following rules:
     *     *   If you specify the ID of a traffic classification rule in the <strong>TrafficMarkRuleIds</strong> parameter, the specified traffic classification rule is deleted.
     *     *   If you do not specify a traffic classification rule ID in the <strong>TrafficMarkRuleIds</strong> parameter, no operation is performed after you call this operation.
     *     If you want to delete a traffic classification rule, you must specify the rule ID before you call this operation.</p>
     * <ul>
     * <li><strong>RemoveTrafficMatchRuleFromTrafficMarkingPolicy</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTrafficMarkingPolicies</strong> operation to query the status of a traffic classification rule.<ul>
     * <li>If a traffic classification rule is in the <strong>Deleting</strong> state, the traffic classification rule is being deleted. In this case, you can query the traffic classification rule but cannot perform other operations.</li>
     * <li>If a traffic classification rule cannot be found, the traffic classification rule is deleted.</li>
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
     * @deprecated OpenAPI RemoveTraficMatchRuleFromTrafficMarkingPolicy is deprecated, please use Cbn::2017-09-12::RemoveTrafficMatchRuleFromTrafficMarkingPolicy instead.  * @description ### [](#)Precautions
     * The **RemoveTraficMatchRuleFromTrafficMarkingPolicy** operation is deprecated and will be discontinued soon. To delete a traffic classification rule, call the [RemoveTrafficMatchRuleFromTrafficMarkingPolicy](https://help.aliyun.com/document_detail/452726.html) operation. Maintenance on this document has stopped.
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
     * <p>Cloud services refer to Alibaba Cloud services that use the 100.64.0.0/10 CIDR block to provide services. These cloud services include Object Storage Service (OSS), Simple Log Service (SLS), and Data Transmission Service (DTS). If your on-premises network needs to access a cloud service, you must attach the virtual border router (VBR) or Cloud Connect Network (CCN) instance that is connected to your on-premises network to a Cloud Enterprise Network (CEN) instance. In addition, you must attach a virtual private cloud (VPC) that is deployed in the same region as the cloud service to the CEN instance. This way, your on-premises network can connect to the VPC that is deployed in the same region as the cloud service and access the cloud service through the VPC.</p>
     * <ul>
     * <li>This operation is supported only by Basic Edition transit routers. An on-premises network associated with a VBR can use CEN to access only a cloud service that is deployed in the same region.
     * For example, if cloud services are deployed in the China (Beijing) region, only on-premises networks connected to VBRs in the China (Beijing) region can access the cloud services.</li>
     * <li><strong>ResolveAndRouteServiceInCen</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call <strong>DescribeRouteServicesInCen</strong> to query the status of a cloud service.<ul>
     * <li>If the cloud service is in the <strong>Creating</strong> state, the connection to the cloud service is being created. In this case, you can query the cloud service but cannot perform other operations.</li>
     * <li>If the cloud service is in the <strong>Active</strong> state, the connection to the cloud service is created.</li>
     * <li>If the cloud service is in the <strong>Failed</strong> state, the connection to the cloud service failed.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the following conditions are met:</p>
     * <ul>
     * <li>The VBR or CCN instance to which your on-premises network is connected is attached to a CEN instance.</li>
     * <li>A VPC that is deployed in the same region as the cloud service is attached to the CEN instance. For more information, see <a href="https://help.aliyun.com/document_detail/65902.html">AttachCenChildInstance</a>.</li>
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
     * <p><code>RevokeInstanceFromTransitRouter</code> can be used to revoke permissions on virtual private clouds (VPCs), virtual border routers (VBRs), IPsec-VPN connections, and Express Connect Router (ECRs) that belong to another Alibaba Cloud account.
     * To revoke permissions on Cloud Connect Network (CCN) instances that belong to another Alibaba Cloud account, call the <a href="https://help.aliyun.com/document_detail/126142.html">RevokeInstanceFromCbn</a> operation.</p>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you call <code>RevokeInstanceFromTransitRouter</code>, you must detach the network instances from the transit router.</p>
     * <ul>
     * <li>For more information about how to detach VPCs from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261220.html">DeleteTransitRouterVpcAttachment</a>.</li>
     * <li>For more information about how to detach VBRs from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/261223.html">DeleteTransitRouterVbrAttachment</a>.</li>
     * <li>For more information about how to detach IPsec-VPN connections from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>For more information about how to detach ECRs from Enterprise Edition transit routers, see <a href="https://help.aliyun.com/document_detail/443992.html">DeleteTransitRouterEcrAttachment</a>.</li>
     * <li>For more information about how to detach network instances from Basic Edition transit routers, see <a href="https://help.aliyun.com/document_detail/65915.html">DetachCenChildInstance</a>.</li>
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
     * <p>Alibaba Cloud DNS PrivateZone (PrivateZone) is an Alibaba Cloud private domain name resolution and management service based on Virtual Private Cloud (VPC). After you attach virtual border routers (VBRs) and Cloud Connect Network (CCN) instances to a Cloud Enterprise Network (CEN) instance, you can enable the on-premises networks connected to the VBRs and CCN instances to access PrivateZone through the CEN instance. </p>
     * <h4>Usage notes</h4>
     * <ul>
     * <li>The on-premises networks connected to VBRs or CCN instances must be deployed in the same region as the PrivateZone service. For example, if the PrivateZone service is deployed in the China (Beijing) region, only on-premises networks connected to VBRs or CCN instances in the China (Beijing) region can access the PrivateZone service. </li>
     * <li><strong>RoutePrivateZoneInCenToVpc</strong> is an asynchronous operation. After you send a request, the <strong>request ID</strong> is returned but the operation is still being performed in the system background. You can call <strong>DescribeCenPrivateZoneRoutes</strong> to query the status of PrivateZone. <ul>
     * <li>If PrivateZone is in the <strong>Creating</strong> state, access to PrivateZone is being configured. In this case, you can query PrivateZone configurations but cannot perform other operations. </li>
     * <li>If PrivateZone is in the <strong>Active</strong> state, access to PrivateZone is enabled. </li>
     * <li>If PrivateZone is in the <strong>Failed</strong> state, configurations of access to PrivateZone failed.</li>
     * </ul>
     * </li>
     * </ul>
     * <h4>Prerequisites</h4>
     * <p>Before you call <strong>RoutePrivateZoneInCenToVpc</strong>, make sure that the following conditions are met:</p>
     * <ul>
     * <li>PrivateZone is deployed. For more information, see <a href="https://help.aliyun.com/document_detail/64627.html">PrivateZone quick start</a>.</li>
     * <li>The following network instances are attached to the same CEN instance: the VPC that is associated with the PrivateZone service, and the VBR and CCN instance that want to access the PrivateZone service. For more information, see <a href="https://help.aliyun.com/document_detail/468684.html">AttachCenChildInstance</a>. </li>
     * <li>If your on-premises network uses a CCN instance to connect to Alibaba Cloud and the account that owns the CCN instance is different from the account that owns the VPC or CEN instance, you must grant the CCN instance required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/181654.html">Grant permissions to CCN</a>.</li>
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
     * <p>This operation is used to manage bandwidth of inter-region connections only for Basic Edition transit routers.</p>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The Cloud Enterprise Network (CEN) instance is associated with a bandwidth plan. For more information, see <a href="https://help.aliyun.com/document_detail/65919.html">CreateCenBandwidthPackage</a> and <a href="https://help.aliyun.com/document_detail/65934.html">AssociateCenBandwidthPackage</a>.
     * You can call the <strong>SetCenInterRegionBandwidthLimit</strong> operation to configure, change, or remove the bandwidth limit of an inter-region connection.</p>
     * <ul>
     * <li>If you set <strong>BandwidthLimit</strong> to a value other than 0, the bandwidth of the inter-region connection is set to the specified value.</li>
     * <li>If you set <strong>BandwidthLimit</strong> to 0, the bandwidth of the inter-region connection is no longer limited.</li>
     * </ul>
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>The bandwidth limit of an inter-region connection cannot exceed the bandwidth limit of the associated bandwidth plan.</li>
     * <li>The sum of bandwidth limits of all inter-region connections cannot exceed the bandwidth limit of the associated bandwidth plan.</li>
     * <li>If bandwidth multiplexing is enabled for an inter-region connection, you cannot change the bandwidth of the inter-region connection.</li>
     * <li>The <strong>SetCenInterRegionBandwidthLimit</strong> operation can be used to configure, modify, or delete the bandwidth of inter-region connections only for Basic Edition transit routers.
     * To configure, modify, or delete the bandwidth of inter-region connections for Enterprise Edition transit routers, call the <a href="https://help.aliyun.com/document_detail/261363.html">CreateTransitRouterPeerAttachment</a>, <a href="https://help.aliyun.com/document_detail/261229.html">UpdateTransitRouterPeerAttachmentAttribute</a>, or <a href="https://help.aliyun.com/document_detail/261227.html">DeleteTransitRouterPeerAttachment</a> operation.</li>
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
     * <p>  Each tag consists of a tag key and a tag value. When you add a tag, you must specify the tag key and tag value.</p>
     * <ul>
     * <li>If you want to add multiple tags to a Cloud Enterprise Network (CEN) instance, each tag key must be unique.</li>
     * <li>You can add at most 20 tags to a CEN instance.</li>
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
     * <p>No inter-region connections are configured in the bandwidth plan. For more information about how to delete inter-region connections, see <a href="https://help.aliyun.com/document_detail/65942.html">SetCenInterRegionBandwidthLimit</a>.</p>
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
     * <p><em>UpdateTransitRouter</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouters</strong> operation to query the status of a transit router.</p>
     * <ul>
     * <li>If a transit router is in the <strong>Modifying</strong> state, the configuration of the transit router is being modified. You can query the transit router but cannot perform other operations.</li>
     * <li>If a transit router is in the <strong>Active</strong> state, the configuration of the transit router is modified.</li>
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
     * <p>UpdateTransitRouterEcrAttachmentAttribute is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListTransitRouterEcrAttachments operation to query the status of an ECR connection.
     * If an ECR connection is in the Modifying state, the ECR connection is being modified. In this case, you can query the ECR connection but cannot perform other operations on the ECR connection. If an ECR connection is in the Attached state, the ECR connection is modified.</p>
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
     * <p><em>UpdateTransitRouterPeerAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterPeerAttachments</strong> operation to query the status of an inter-region connection.</p>
     * <ul>
     * <li>If an inter-region connection is in the <strong>Modifying</strong> state, the inter-region connection is being modified. You can query the inter-region connection but cannot perform other operations.</li>
     * <li>If an inter-region connection is in the <strong>Attached</strong> state, the inter-region connection is modified.</li>
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
     * <p><em>UpdateTransitRouterVbrAttachmentAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVbrAttachments</strong> operation to query the status of a VBR connection.</p>
     * <ul>
     * <li>If a VBR connection is in the <strong>Modifying</strong> state, the VBR connection is being modified. You can query the VBR connection but cannot perform other operations.</li>
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
     * <p><em>UpdateTransitRouterVpcAttachmentAttribute</em>* is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of a VPC connection.</p>
     * <ul>
     * <li>If a VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If a VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
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
     * <p>  When you add a zone and a vSwitch for a VPC connection, make sure that the vSwitch has at least one idle IP address. When you modify the zones and vSwitches of a VPC connection, the Enterprise Edition transit router creates an elastic network interface (ENI) in the vSwitch. The ENI occupies one IP address in the vSwitch. The ENI forwards traffic between the VPC and the Enterprise Edition transit router.</p>
     * <ul>
     * <li><strong>UpdateTransitRouterVpcAttachmentZones</strong> is an asynchronous operation. After you send a request, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <strong>ListTransitRouterVpcAttachments</strong> operation to query the status of a VPC connection.<ul>
     * <li>If a VPC connection is in the <strong>Modifying</strong> state, the VPC connection is being modified. You can query the VPC connection but cannot perform other operations.</li>
     * <li>If a VPC connection is in the <strong>Attached</strong> state, the VPC connection is modified.</li>
     * </ul>
     * </li>
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
