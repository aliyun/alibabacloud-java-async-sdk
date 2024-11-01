// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.alb20200616.models.*;
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
        this.product = "Alb";
        this.version = "2020-06-16";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>  Each ACL can contain IP addresses or CIDR blocks. Take note of the following limits on ACLs:
     *     *   The maximum number of IP entries that can be added to an ACL with each Alibaba Cloud account at a time: 20
     *     *   The maximum number of IP entries that each ACL can contain: 1,000</p>
     * <ul>
     * <li><strong>AddEntriesToAcl</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/213616.html">ListAclEntries</a> operation to query the status of the task.<ul>
     * <li>If the ACL is in the <strong>Adding</strong> state, the IP entries are being added.</li>
     * <li>If the ACL is in the <strong>Available</strong> state, the IP entries are added.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AddEntriesToAcl  AddEntriesToAclRequest
     * @return AddEntriesToAclResponse
     */
    @Override
    public CompletableFuture<AddEntriesToAclResponse> addEntriesToAcl(AddEntriesToAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddEntriesToAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddEntriesToAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddEntriesToAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>AddServersToServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query the status of a server group.</li>
     * </ol>
     * <ul>
     * <li>If a server group is in the <strong>Configuring</strong> state, it indicates that the server group is being modified.</li>
     * <li>If a server group is in the <strong>Available</strong> state, it indicates that the server group is running.</li>
     * </ul>
     * <ol start="2">
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/213628.html">ListServerGroupServers</a> operation to query the status of a backend server.</li>
     * </ol>
     * <ul>
     * <li>If a backend server is in the <strong>Adding</strong> state, it indicates that the backend server is being added to a server group.</li>
     * <li>If a backend server is in the <strong>Available</strong> state, it indicates that the server is running.</li>
     * </ul>
     * 
     * @param request the request parameters of AddServersToServerGroup  AddServersToServerGroupRequest
     * @return AddServersToServerGroupResponse
     */
    @Override
    public CompletableFuture<AddServersToServerGroupResponse> addServersToServerGroup(AddServersToServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddServersToServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddServersToServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddServersToServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ApplyHealthCheckTemplateToServerGroup  ApplyHealthCheckTemplateToServerGroupRequest
     * @return ApplyHealthCheckTemplateToServerGroupResponse
     */
    @Override
    public CompletableFuture<ApplyHealthCheckTemplateToServerGroupResponse> applyHealthCheckTemplateToServerGroup(ApplyHealthCheckTemplateToServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyHealthCheckTemplateToServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyHealthCheckTemplateToServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyHealthCheckTemplateToServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteDhcpOptionsSet</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/213618.html">ListAclRelations</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If an ACL is in the <strong>Associating</strong> state, the ACL is being associated with a listener.</li>
     * <li>If an ACL is in the <strong>Associated</strong> state, the ACL is associated with a listener.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateAclsWithListener  AssociateAclsWithListenerRequest
     * @return AssociateAclsWithListenerResponse
     */
    @Override
    public CompletableFuture<AssociateAclsWithListenerResponse> associateAclsWithListener(AssociateAclsWithListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateAclsWithListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateAclsWithListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateAclsWithListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>AssociateAdditionalCertificatesWithListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> operation to query the status of the task:</p>
     * <ul>
     * <li>If the HTTPS or QUIC listener is in the <strong>Associating</strong> state, the additional certificates are being associated.</li>
     * <li>If the HTTPS or QUIC listener is in the <strong>Associated</strong> state, the additional certificates are associated.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateAdditionalCertificatesWithListener  AssociateAdditionalCertificatesWithListenerRequest
     * @return AssociateAdditionalCertificatesWithListenerResponse
     */
    @Override
    public CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateAdditionalCertificatesWithListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateAdditionalCertificatesWithListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>AttachCommonBandwidthPackageToLoadBalancer</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> to query the status of the task.</p>
     * <ul>
     * <li>If the ALB instance is in the <strong>Configuring</strong> state, the EIP bandwidth plan is being associated with the ALB instance.</li>
     * <li>If the ALB instance is in the <strong>Active</strong> state, the EIP bandwidth plan is associated with the ALB instance.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachCommonBandwidthPackageToLoadBalancer  AttachCommonBandwidthPackageToLoadBalancerRequest
     * @return AttachCommonBandwidthPackageToLoadBalancerResponse
     */
    @Override
    public CompletableFuture<AttachCommonBandwidthPackageToLoadBalancerResponse> attachCommonBandwidthPackageToLoadBalancer(AttachCommonBandwidthPackageToLoadBalancerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachCommonBandwidthPackageToLoadBalancer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachCommonBandwidthPackageToLoadBalancerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachCommonBandwidthPackageToLoadBalancerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported only by Application Load Balancer (ALB) instances that use static IP addresses. Before you call this operation, you must call the StartShiftLoadBalancerZones operation to remove the zone from the ALB instance.</p>
     * 
     * @param request the request parameters of CancelShiftLoadBalancerZones  CancelShiftLoadBalancerZonesRequest
     * @return CancelShiftLoadBalancerZonesResponse
     */
    @Override
    public CompletableFuture<CancelShiftLoadBalancerZonesResponse> cancelShiftLoadBalancerZones(CancelShiftLoadBalancerZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelShiftLoadBalancerZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelShiftLoadBalancerZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelShiftLoadBalancerZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <ul>
     * <li>A standard or WAF-enabled Application Load Balancer (ALB) instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/214358.html">CreateLoadBalancer</a>.</li>
     * </ul>
     * <h3><a href="#"></a>Usage notes</h3>
     * <p><strong>CreateAScripts</strong> an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/472574.html">ListAScripts</a> operation to query the status of a script.</p>
     * <ul>
     * <li>If the script is in the <strong>Creating</strong> state, the script is being created.</li>
     * <li>If the script is in the <strong>Available</strong>, the script is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAScripts  CreateAScriptsRequest
     * @return CreateAScriptsResponse
     */
    @Override
    public CompletableFuture<CreateAScriptsResponse> createAScripts(CreateAScriptsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAScripts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAScriptsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAScriptsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>The <strong>CreateAcl</strong> operation is asynchronous. After you send a request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/213617.html">ListAcls</a> operation to query the status of an ACL:</p>
     * <ul>
     * <li>If an ACL is in the <strong>Creating</strong> state, the ACL is being created.</li>
     * <li>If an ACL is in the <strong>Available</strong> state, the ACL is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAcl  CreateAclRequest
     * @return CreateAclResponse
     */
    @Override
    public CompletableFuture<CreateAclResponse> createAcl(CreateAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateHealthCheckTemplate  CreateHealthCheckTemplateRequest
     * @return CreateHealthCheckTemplateResponse
     */
    @Override
    public CompletableFuture<CreateHealthCheckTemplateResponse> createHealthCheckTemplate(CreateHealthCheckTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHealthCheckTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHealthCheckTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHealthCheckTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p><strong>CreateListener</strong> is an asynchronous operation. After you call this operation, the system returns a request ID. However, the operation is still being performed in the background. You can call the <a href="https://help.aliyun.com/document_detail/214353.html">GetListenerAttribute</a> operation to query the status of the HTTP, HTTPS, or QUIC listener.</p>
     * <ul>
     * <li>If the HTTP, HTTPS, or QUIC listener is in the <strong>Provisioning</strong> state, it indicates that the listener is being created.</li>
     * <li>If the HTTP, HTTPS, or QUIC listener is in the <strong>Running</strong> state, it indicates that the listener has been created successfully.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateListener  CreateListenerRequest
     * @return CreateListenerResponse
     */
    @Override
    public CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>CreateLoadBalancer</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation to query the status of an ALB instance.</p>
     * <ul>
     * <li>If an ALB instance is in the <strong>Provisioning</strong> state, it indicates that the ALB instance is being created.</li>
     * <li>If an ALB instance is in the <strong>Active</strong> state, it indicates that the ALB instance is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    @Override
    public CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLoadBalancer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLoadBalancerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLoadBalancerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Take note of the following limits:</p>
     * <ul>
     * <li>When you configure the <strong>Redirect</strong> action, you can use the default value only for the <strong>HttpCode</strong> parameter. Do not use the default values for the other parameters.</li>
     * <li>If you specify the <strong>Rewrite</strong> action together with other actions in a forwarding rule, make sure that the <strong>ForwardGroup</strong> action is specified.</li>
     * <li><strong>CreateRule</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> operation to query the status of a forwarding rule.<ul>
     * <li>If a forwarding rule is in the <strong>Provisioning</strong> state, the forwarding rule is being created.</li>
     * <li>If a forwarding rule is in the <strong>Available</strong> state, the forwarding rule is created.</li>
     * </ul>
     * </li>
     * <li>You can set <strong>RuleConditions</strong> and <strong>RuleActions</strong> to add conditions and actions to a forwarding rule. The limits on conditions and actions are:<ul>
     * <li>Limits on conditions: 5 for a basic Application Load Balancer (ALB) instance, 10 for a standard ALB instance, and 10 for a WAF-enabled ALB instance.</li>
     * <li>Limits on actions: 3 for a basic ALB instance, 5 for a standard ALB instance, and 5 for a WAF-enabled ALB instance.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateRule  CreateRuleRequest
     * @return CreateRuleResponse
     */
    @Override
    public CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>When you configure the <strong>Redirect</strong> action, do not use the default values for parameters other than <strong>HttpCode</strong>.</li>
     * <li>If you specify multiple actions in a forward rule, you must specify the <strong>ForwardGroup</strong> parameter along with the <strong>Rewrite</strong> parameter.</li>
     * <li><strong>CreateRules</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> operation to query the status of the forwarding rules.<ul>
     * <li>If the forwarding rules are in the <strong>Provisioning</strong> state, the forwarding rules are being created.</li>
     * <li>If the forwarding rules are in the <strong>Available</strong> state, the forwarding rules are created.</li>
     * </ul>
     * </li>
     * <li>You can set <strong>RuleConditions</strong> and <strong>RuleActions</strong> to add conditions and actions to a forwarding rule. Take note of the following limits on the number of conditions and the number of actions in each forwarding rule:<ul>
     * <li>Conditions: 5 for each basic ALB instance, 10 for each standard ALB instance, and 10 for each WAF-enabled ALB instance.</li>
     * <li>Actions: 3 for each basic ALB instance, 5 for each standard ALB instance, and 5 for each WAF-enabled ALB instance.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateRules  CreateRulesRequest
     * @return CreateRulesResponse
     */
    @Override
    public CompletableFuture<CreateRulesResponse> createRules(CreateRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSecurityPolicy  CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     */
    @Override
    public CompletableFuture<CreateSecurityPolicyResponse> createSecurityPolicy(CreateSecurityPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSecurityPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSecurityPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSecurityPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>CreateServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> to query the status of a server group.</p>
     * <ul>
     * <li>If a server group is in the <strong>Creating</strong> state, it indicates that the server group is being created.</li>
     * <li>If a server group is in the <strong>Available</strong> state, it indicates that the server group is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateServerGroup  CreateServerGroupRequest
     * @return CreateServerGroupResponse
     */
    @Override
    public CompletableFuture<CreateServerGroupResponse> createServerGroup(CreateServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteAScripts</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/472574.html">ListAScripts</a> operation to query the status of the task:</p>
     * <ul>
     * <li>If an AScript rule is in the <strong>Deleting</strong> state, the AScript rule is being deleted.</li>
     * <li>If an AScript rule cannot be found, the AScript rule is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAScripts  DeleteAScriptsRequest
     * @return DeleteAScriptsResponse
     */
    @Override
    public CompletableFuture<DeleteAScriptsResponse> deleteAScripts(DeleteAScriptsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAScripts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAScriptsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAScriptsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteAcl</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/213617.html">ListAcls</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If the ACL is in the <strong>Deleting</strong> state, the ACL is being deleted.</li>
     * <li>If the ACL cannot be found, the ACL is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAcl  DeleteAclRequest
     * @return DeleteAclResponse
     */
    @Override
    public CompletableFuture<DeleteAclResponse> deleteAcl(DeleteAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteHealthCheckTemplates  DeleteHealthCheckTemplatesRequest
     * @return DeleteHealthCheckTemplatesResponse
     */
    @Override
    public CompletableFuture<DeleteHealthCheckTemplatesResponse> deleteHealthCheckTemplates(DeleteHealthCheckTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHealthCheckTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHealthCheckTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHealthCheckTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> to query the status of the task.</p>
     * <ul>
     * <li>If the listener is in the <strong>Deleting</strong> state, the listener is being deleted.</li>
     * <li>If the listener cannot be found, the listener is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteListener  DeleteListenerRequest
     * @return DeleteListenerResponse
     */
    @Override
    public CompletableFuture<DeleteListenerResponse> deleteListener(DeleteListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteLoadBalancer</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> to query the status of the task.</p>
     * <ul>
     * <li>If an ALB instance is in the <strong>Deleting</strong> state, the ALB instance is being deleted.</li>
     * <li>If an ALB instance cannot be found, the ALB instance is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteLoadBalancer  DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    @Override
    public CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLoadBalancer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLoadBalancerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLoadBalancerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteRule</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> operation to query the status of a forwarding rule:</p>
     * <ul>
     * <li>If the forwarding rule is in the <strong>Deleting</strong> state, the forwarding rule is being deleted.</li>
     * <li>If the forwarding rule cannot be found, the forwarding rule is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRule  DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    @Override
    public CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteRules</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> operation to query the status of forwarding rules.</p>
     * <ul>
     * <li>If the forwarding rules are in the <strong>Deleting</strong> state, the forwarding rules are being deleted.</li>
     * <li>If the forwarding rules cannot be found, the forwarding rules are deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRules  DeleteRulesRequest
     * @return DeleteRulesResponse
     */
    @Override
    public CompletableFuture<DeleteRulesResponse> deleteRules(DeleteRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSecurityPolicy  DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteSecurityPolicyResponse> deleteSecurityPolicy(DeleteSecurityPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSecurityPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSecurityPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSecurityPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If a server group is in the <strong>Deleting</strong> state, it indicates that the server group is being deleted.</li>
     * <li>If a specified server group cannot be found, it indicates that the server group has been deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteServerGroup  DeleteServerGroupRequest
     * @return DeleteServerGroupResponse
     */
    @Override
    public CompletableFuture<DeleteServerGroupResponse> deleteServerGroup(DeleteServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    @Override
    public CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DetachCommonBandwidthPackageFromLoadBalancer</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214359.html">GetLoadBalancerAttribute</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If an ALB instance is in the <strong>Configuring</strong> state, the EIP bandwidth plan is being disassociated from the ALB instance.</li>
     * <li>If an ALB instance is in the <strong>Active</strong> state, the EIP bandwidth plan is disassociated from the ALB instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachCommonBandwidthPackageFromLoadBalancer  DetachCommonBandwidthPackageFromLoadBalancerRequest
     * @return DetachCommonBandwidthPackageFromLoadBalancerResponse
     */
    @Override
    public CompletableFuture<DetachCommonBandwidthPackageFromLoadBalancerResponse> detachCommonBandwidthPackageFromLoadBalancer(DetachCommonBandwidthPackageFromLoadBalancerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachCommonBandwidthPackageFromLoadBalancer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachCommonBandwidthPackageFromLoadBalancerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachCommonBandwidthPackageFromLoadBalancerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableDeletionProtection  DisableDeletionProtectionRequest
     * @return DisableDeletionProtectionResponse
     */
    @Override
    public CompletableFuture<DisableDeletionProtectionResponse> disableDeletionProtection(DisableDeletionProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableDeletionProtection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableDeletionProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableDeletionProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableLoadBalancerAccessLog  DisableLoadBalancerAccessLogRequest
     * @return DisableLoadBalancerAccessLogResponse
     */
    @Override
    public CompletableFuture<DisableLoadBalancerAccessLogResponse> disableLoadBalancerAccessLog(DisableLoadBalancerAccessLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableLoadBalancerAccessLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableLoadBalancerAccessLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableLoadBalancerAccessLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>An ALB instance is created and IPv4/IPv6 dual stack is enabled for the instance. You can call the <a href="https://help.aliyun.com/document_detail/214358.html">CreateLoadBalancer</a> operation and set <strong>AddressIpVersion</strong> to <strong>DualStack</strong> to create a dual-stack ALB instance.</p>
     * <blockquote>
     * <p>If you set <strong>AddressIpVersion</strong> to <strong>DualStack</strong>:</p>
     * </blockquote>
     * <ul>
     * <li>If you set <strong>AddressType</strong> to <strong>Internet</strong>, the ALB instance uses a public IPv4 IP address and a private IPv6 address.</li>
     * <li>If you set <strong>AddressType</strong> to <strong>Intranet</strong>, the ALB instance uses a private IPv4 IP address and a private IPv6 address.</li>
     * </ul>
     * <h3>Description</h3>
     * <ul>
     * <li>After the DisableLoadBalancerIpv6Internet operation is called, the value of <strong>Ipv6AddressType</strong> is changed to <strong>Intranet</strong> and the type of the IPv6 address of the ALB instance is changed from public to private. If you upgrade the instance or the instance scales elastic network interfaces (ENIs) along with workloads, private IPv6 addresses are automatically enabled for the instance and the new ENIs. You can call the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation to query the value of <strong>Ipv6AddressType</strong>.</li>
     * <li><strong>DisableLoadBalancerIpv6Internet</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation to query the status of the task.<ul>
     * <li>If the ALB instance is in the <strong>Configuring</strong> state, the network type of the IPv6 address that is used by the ALB instance is being changed.</li>
     * <li>If the ALB instance is in the <strong>Active</strong> state, the network type of the IPv6 address that is used by the ALB instance is changed.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DisableLoadBalancerIpv6Internet  DisableLoadBalancerIpv6InternetRequest
     * @return DisableLoadBalancerIpv6InternetResponse
     */
    @Override
    public CompletableFuture<DisableLoadBalancerIpv6InternetResponse> disableLoadBalancerIpv6Internet(DisableLoadBalancerIpv6InternetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableLoadBalancerIpv6Internet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableLoadBalancerIpv6InternetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableLoadBalancerIpv6InternetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteDhcpOptionsSet</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/213618.html">ListAclRelations</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If an ACL is in the <strong>Dissociating</strong> state, the ACL is being disassociated from the listener.</li>
     * <li>If an ACL is in the <strong>Dissociated</strong> state, the ACL is disassociated from the listener.</li>
     * </ul>
     * 
     * @param request the request parameters of DissociateAclsFromListener  DissociateAclsFromListenerRequest
     * @return DissociateAclsFromListenerResponse
     */
    @Override
    public CompletableFuture<DissociateAclsFromListenerResponse> dissociateAclsFromListener(DissociateAclsFromListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateAclsFromListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateAclsFromListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateAclsFromListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DissociateAdditionalCertificatesFromListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214354.html">ListListenerCertificates</a> operation to query the status of the task. - If an additional certificate is in the <strong>Dissociating</strong> state, the additional certificate is being disassociated. - If an additional certificate is in the <strong>Dissociated</strong> state, the additional certificate is disassociated.</p>
     * 
     * @param request the request parameters of DissociateAdditionalCertificatesFromListener  DissociateAdditionalCertificatesFromListenerRequest
     * @return DissociateAdditionalCertificatesFromListenerResponse
     */
    @Override
    public CompletableFuture<DissociateAdditionalCertificatesFromListenerResponse> dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateAdditionalCertificatesFromListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateAdditionalCertificatesFromListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateAdditionalCertificatesFromListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableDeletionProtection  EnableDeletionProtectionRequest
     * @return EnableDeletionProtectionResponse
     */
    @Override
    public CompletableFuture<EnableDeletionProtectionResponse> enableDeletionProtection(EnableDeletionProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableDeletionProtection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableDeletionProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableDeletionProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableLoadBalancerAccessLog  EnableLoadBalancerAccessLogRequest
     * @return EnableLoadBalancerAccessLogResponse
     */
    @Override
    public CompletableFuture<EnableLoadBalancerAccessLogResponse> enableLoadBalancerAccessLog(EnableLoadBalancerAccessLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableLoadBalancerAccessLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableLoadBalancerAccessLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableLoadBalancerAccessLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>An ALB instance is created and IPv4/IPv6 dual stack is enabled for the instance. You can call the <a href="https://help.aliyun.com/document_detail/214358.html">CreateLoadBalancer</a> operation and set <strong>AddressIpVersion</strong> to <strong>DualStack</strong> to create a dual-stack ALB instance.</p>
     * <blockquote>
     * <p>If you set <strong>AddressIpVersion</strong> to <strong>DualStack</strong>:</p>
     * </blockquote>
     * <ul>
     * <li>If you set <strong>AddressType</strong> to <strong>Internet</strong>, the ALB instance uses a public IPv4 IP address and a private IPv6 address.</li>
     * <li>If you set <strong>AddressType</strong> to <strong>Intranet</strong>, the ALB instance uses a private IPv4 IP address and a private IPv6 address.</li>
     * </ul>
     * <h3>Description</h3>
     * <ul>
     * <li>After the EnableLoadBalancerIpv6Internet operation is called, the value of <strong>Ipv6AddressType</strong> is changed to <strong>Internet</strong> and the type of the IPv6 address of the ALB instance is changed from private to public. If you upgrade the instance or the instance scales elastic network interfaces (ENIs) along with workloads, public IPv6 addresses are automatically enabled for the instance and the new ENIs. You can call the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation to query the value of <strong>Ipv6AddressType</strong>.</li>
     * <li><strong>EnableLoadBalancerIpv6Internet</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation to query the status of the task.<ul>
     * <li>If the ALB instance is in the <strong>Configuring</strong> state, the network type of the IPv6 address that is used by the ALB instance is being changed.</li>
     * <li>If the ALB instance is in the <strong>Active</strong> state, the network type of the IPv6 address that is used by the ALB instance is changed.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of EnableLoadBalancerIpv6Internet  EnableLoadBalancerIpv6InternetRequest
     * @return EnableLoadBalancerIpv6InternetResponse
     */
    @Override
    public CompletableFuture<EnableLoadBalancerIpv6InternetResponse> enableLoadBalancerIpv6Internet(EnableLoadBalancerIpv6InternetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableLoadBalancerIpv6Internet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableLoadBalancerIpv6InternetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableLoadBalancerIpv6InternetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetHealthCheckTemplateAttribute  GetHealthCheckTemplateAttributeRequest
     * @return GetHealthCheckTemplateAttributeResponse
     */
    @Override
    public CompletableFuture<GetHealthCheckTemplateAttributeResponse> getHealthCheckTemplateAttribute(GetHealthCheckTemplateAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHealthCheckTemplateAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHealthCheckTemplateAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHealthCheckTemplateAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetListenerAttribute  GetListenerAttributeRequest
     * @return GetListenerAttributeResponse
     */
    @Override
    public CompletableFuture<GetListenerAttributeResponse> getListenerAttribute(GetListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetListenerHealthStatus  GetListenerHealthStatusRequest
     * @return GetListenerHealthStatusResponse
     */
    @Override
    public CompletableFuture<GetListenerHealthStatusResponse> getListenerHealthStatus(GetListenerHealthStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetListenerHealthStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetListenerHealthStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetListenerHealthStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLoadBalancerAttribute  GetLoadBalancerAttributeRequest
     * @return GetLoadBalancerAttributeResponse
     */
    @Override
    public CompletableFuture<GetLoadBalancerAttributeResponse> getLoadBalancerAttribute(GetLoadBalancerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLoadBalancerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLoadBalancerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLoadBalancerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAScripts  ListAScriptsRequest
     * @return ListAScriptsResponse
     */
    @Override
    public CompletableFuture<ListAScriptsResponse> listAScripts(ListAScriptsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAScripts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAScriptsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAScriptsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAclEntries  ListAclEntriesRequest
     * @return ListAclEntriesResponse
     */
    @Override
    public CompletableFuture<ListAclEntriesResponse> listAclEntries(ListAclEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAclEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAclEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAclEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAclRelations  ListAclRelationsRequest
     * @return ListAclRelationsResponse
     */
    @Override
    public CompletableFuture<ListAclRelationsResponse> listAclRelations(ListAclRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAclRelations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAclRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAclRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAcls  ListAclsRequest
     * @return ListAclsResponse
     */
    @Override
    public CompletableFuture<ListAclsResponse> listAcls(ListAclsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAcls").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAclsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAclsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAsynJobs  ListAsynJobsRequest
     * @return ListAsynJobsResponse
     */
    @Override
    public CompletableFuture<ListAsynJobsResponse> listAsynJobs(ListAsynJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAsynJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAsynJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAsynJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListHealthCheckTemplates  ListHealthCheckTemplatesRequest
     * @return ListHealthCheckTemplatesResponse
     */
    @Override
    public CompletableFuture<ListHealthCheckTemplatesResponse> listHealthCheckTemplates(ListHealthCheckTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListHealthCheckTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListHealthCheckTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListHealthCheckTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListListenerCertificates  ListListenerCertificatesRequest
     * @return ListListenerCertificatesResponse
     */
    @Override
    public CompletableFuture<ListListenerCertificatesResponse> listListenerCertificates(ListListenerCertificatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListListenerCertificates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListListenerCertificatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListListenerCertificatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListListeners  ListListenersRequest
     * @return ListListenersResponse
     */
    @Override
    public CompletableFuture<ListListenersResponse> listListeners(ListListenersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListListeners").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListListenersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListListenersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLoadBalancers  ListLoadBalancersRequest
     * @return ListLoadBalancersResponse
     */
    @Override
    public CompletableFuture<ListLoadBalancersResponse> listLoadBalancers(ListLoadBalancersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLoadBalancers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLoadBalancersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLoadBalancersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListRules  ListRulesRequest
     * @return ListRulesResponse
     */
    @Override
    public CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSecurityPolicies  ListSecurityPoliciesRequest
     * @return ListSecurityPoliciesResponse
     */
    @Override
    public CompletableFuture<ListSecurityPoliciesResponse> listSecurityPolicies(ListSecurityPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSecurityPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSecurityPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSecurityPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSecurityPolicyRelations  ListSecurityPolicyRelationsRequest
     * @return ListSecurityPolicyRelationsResponse
     */
    @Override
    public CompletableFuture<ListSecurityPolicyRelationsResponse> listSecurityPolicyRelations(ListSecurityPolicyRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSecurityPolicyRelations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSecurityPolicyRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSecurityPolicyRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServerGroupServers  ListServerGroupServersRequest
     * @return ListServerGroupServersResponse
     */
    @Override
    public CompletableFuture<ListServerGroupServersResponse> listServerGroupServers(ListServerGroupServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServerGroupServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServerGroupServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServerGroupServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServerGroups  ListServerGroupsRequest
     * @return ListServerGroupsResponse
     */
    @Override
    public CompletableFuture<ListServerGroupsResponse> listServerGroups(ListServerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServerGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSystemSecurityPolicies  ListSystemSecurityPoliciesRequest
     * @return ListSystemSecurityPoliciesResponse
     */
    @Override
    public CompletableFuture<ListSystemSecurityPoliciesResponse> listSystemSecurityPolicies(ListSystemSecurityPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSystemSecurityPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSystemSecurityPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSystemSecurityPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    @Override
    public CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    @Override
    public CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagValues").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagValuesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagValuesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  By default, security groups are unavailable. To use security groups, contact your account manager.</p>
     * <ul>
     * <li>Make sure that a security group is created. For more information about how to create security groups, see <a href="https://help.aliyun.com/document_detail/2679843.html">CreateSecurityGroup</a>.</li>
     * <li>Each ALB instance can be added to at most four security groups.</li>
     * <li>To query the security groups of an ALB instance, call the <a href="https://help.aliyun.com/document_detail/2254835.html">GetLoadBalancerAttribute</a> operation.</li>
     * <li>GetLoadBalancerAttribute is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254893.html">ListAsynJobs</a> operation to query the status of the task.<ul>
     * <li>If the task is in the Succeeded state, the ALB instance is added to the security group.</li>
     * <li>If the task is in the Processing state, the ALB instance is being added to the security group. In this case, you can query the task but cannot perform other operations.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of LoadBalancerJoinSecurityGroup  LoadBalancerJoinSecurityGroupRequest
     * @return LoadBalancerJoinSecurityGroupResponse
     */
    @Override
    public CompletableFuture<LoadBalancerJoinSecurityGroupResponse> loadBalancerJoinSecurityGroup(LoadBalancerJoinSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LoadBalancerJoinSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LoadBalancerJoinSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LoadBalancerJoinSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  LoadBalancerLeaveSecurityGroup is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254893.html">ListAsynJobs</a> operation to query the status of the task.
     *     *   If the task is in the Succeeded state, the ALB instance is removed from the security group.
     *     *   If the task is in the Processing state, the ALB instance is being removed from the security group. In this case, you can query the task but cannot perform other operations.</p>
     * 
     * @param request the request parameters of LoadBalancerLeaveSecurityGroup  LoadBalancerLeaveSecurityGroupRequest
     * @return LoadBalancerLeaveSecurityGroupResponse
     */
    @Override
    public CompletableFuture<LoadBalancerLeaveSecurityGroupResponse> loadBalancerLeaveSecurityGroup(LoadBalancerLeaveSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LoadBalancerLeaveSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LoadBalancerLeaveSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LoadBalancerLeaveSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * <p><em>RemoveEntriesFromAcl</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/213616.html">ListAclEntries</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If an ACL is in the <strong>Removing</strong> state, the entries are being removed.</li>
     * <li>If an ACL cannot be found, the entries are removed.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveEntriesFromAcl  RemoveEntriesFromAclRequest
     * @return RemoveEntriesFromAclResponse
     */
    @Override
    public CompletableFuture<RemoveEntriesFromAclResponse> removeEntriesFromAcl(RemoveEntriesFromAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveEntriesFromAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveEntriesFromAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveEntriesFromAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>RemoveServersFromServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query the status of a server group.<ul>
     * <li>If a server group is in the <strong>Configuring</strong> state, it indicates that the server group is being modified.</li>
     * <li>If a server group is in the <strong>Available</strong> state, it indicates that the server group is running.</li>
     * </ul>
     * </li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/213628.html">ListServerGroupServers</a> operation to query the status of a backend server.<ul>
     * <li>If a backend server is in the <strong>Removing</strong> state, the server is being removed from the server group.</li>
     * <li>If a backend server cannot be found, the server is no longer in the server group.</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of RemoveServersFromServerGroup  RemoveServersFromServerGroupRequest
     * @return RemoveServersFromServerGroupResponse
     */
    @Override
    public CompletableFuture<RemoveServersFromServerGroupResponse> removeServersFromServerGroup(RemoveServersFromServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveServersFromServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveServersFromServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveServersFromServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>ReplaceServersInServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query the status of a server group.<ul>
     * <li>If a server group is in the <strong>Configuring</strong> state, it indicates that the server group is being modified.</li>
     * <li>If a server group is in the <strong>Available</strong> state, it indicates that the server group is running.</li>
     * </ul>
     * </li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/213628.html">ListServerGroupServers</a> operation to query the status of a backend server.<ul>
     * <li>If a backend server is in the <strong>Replacing</strong> state, it indicates that the server is being removed from the server group and a new server is added to the server group.</li>
     * <li>If a backend server is in the \<em>\<em>Available\</em>\</em> state, it indicates that the server is running.</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of ReplaceServersInServerGroup  ReplaceServersInServerGroupRequest
     * @return ReplaceServersInServerGroupResponse
     */
    @Override
    public CompletableFuture<ReplaceServersInServerGroupResponse> replaceServersInServerGroup(ReplaceServersInServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReplaceServersInServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplaceServersInServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplaceServersInServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>StartListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> to query the status of the task.</p>
     * <ul>
     * <li>If a listener is in the <strong>Configuring</strong> state, the listener is being enabled.</li>
     * <li>If a listener is in the <strong>Running</strong> state, the listener is enabled.</li>
     * </ul>
     * 
     * @param request the request parameters of StartListener  StartListenerRequest
     * @return StartListenerResponse
     */
    @Override
    public CompletableFuture<StartListenerResponse> startListener(StartListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is supported by Application Load Balancer (ALB) instances that use static IP addresses. The zone cannot be removed if the ALB instance has only one available zone.</p>
     * 
     * @param request the request parameters of StartShiftLoadBalancerZones  StartShiftLoadBalancerZonesRequest
     * @return StartShiftLoadBalancerZonesResponse
     */
    @Override
    public CompletableFuture<StartShiftLoadBalancerZonesResponse> startShiftLoadBalancerZones(StartShiftLoadBalancerZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartShiftLoadBalancerZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartShiftLoadBalancerZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartShiftLoadBalancerZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>StopListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> operation to query the status of the task:</p>
     * <ul>
     * <li>If a listener is in the <strong>Configuring</strong> state, the listener is being disabled.</li>
     * <li>If a listener is in the <strong>Stopped</strong> state, the listener is disabled.</li>
     * </ul>
     * 
     * @param request the request parameters of StopListener  StopListenerRequest
     * @return StopListenerResponse
     */
    @Override
    public CompletableFuture<StopListenerResponse> stopListener(StopListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of UnTagResources  UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    @Override
    public CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnTagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnTagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateAScripts</em>* is an an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/472574.html">ListAScripts</a> operation to query the status of an AScript rule.</p>
     * <ul>
     * <li>If the rule is in the <strong>Configuring</strong> state, the rule is being updated.</li>
     * <li>If the rule is in the <strong>Available</strong> state, the rule is updated.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAScripts  UpdateAScriptsRequest
     * @return UpdateAScriptsResponse
     */
    @Override
    public CompletableFuture<UpdateAScriptsResponse> updateAScripts(UpdateAScriptsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAScripts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAScriptsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAScriptsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateAclAttribute  UpdateAclAttributeRequest
     * @return UpdateAclAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateAclAttributeResponse> updateAclAttribute(UpdateAclAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAclAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAclAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAclAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateHealthCheckTemplateAttribute  UpdateHealthCheckTemplateAttributeRequest
     * @return UpdateHealthCheckTemplateAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateHealthCheckTemplateAttributeResponse> updateHealthCheckTemplateAttribute(UpdateHealthCheckTemplateAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateHealthCheckTemplateAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateHealthCheckTemplateAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateHealthCheckTemplateAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateListenerAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If a listener is in the <strong>Configuring</strong> state, the configuration of the listener is being modified.</li>
     * <li>If a listener is in the <strong>Running</strong> state, the configuration of the listener is modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateListenerAttribute  UpdateListenerAttributeRequest
     * @return UpdateListenerAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateListenerAttributeResponse> updateListenerAttribute(UpdateListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateListenerLogConfig</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> to query the status of the task:</p>
     * <ul>
     * <li>If a listener is in the <strong>Configuring</strong> state, the log configuration of the listener is being modified.</li>
     * <li>If a listener is in the <strong>Running</strong> state, the log configuration of the listener is modified.<blockquote>
     * <p>You can update the log configuration of a listener only after you enable the access log feature.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateListenerLogConfig  UpdateListenerLogConfigRequest
     * @return UpdateListenerLogConfigResponse
     */
    @Override
    public CompletableFuture<UpdateListenerLogConfigResponse> updateListenerLogConfig(UpdateListenerLogConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateListenerLogConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateListenerLogConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateListenerLogConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <ul>
     * <li>An ALB instance is created. For more information about how to create an ALB instance, see <a href="https://help.aliyun.com/document_detail/214358.html">CreateLoadBalancer</a>.</li>
     * <li>If you want to change the network type from internal-facing to Internet-facing, you must first create an elastic IP address (EIP). For more information, see <a href="https://help.aliyun.com/document_detail/120192.html">AllocateEipAddress</a>.</li>
     * </ul>
     * <h2>Usage notes</h2>
     * <p><strong>UpdateLoadBalancerAddressTypeConfig</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If an ALB instance is in the <strong>Configuring</strong> state, the network type is being changed.</li>
     * <li>If an ALB instance is in the <strong>Active</strong> state, the network type has been changed.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerAddressTypeConfig  UpdateLoadBalancerAddressTypeConfigRequest
     * @return UpdateLoadBalancerAddressTypeConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLoadBalancerAddressTypeConfigResponse> updateLoadBalancerAddressTypeConfig(UpdateLoadBalancerAddressTypeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLoadBalancerAddressTypeConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLoadBalancerAddressTypeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLoadBalancerAddressTypeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateLoadBalancerAttribute</em>* is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> to query the status of the task.</p>
     * <ul>
     * <li>If the ALB instance is in the <strong>Configuring</strong> state, the ALB instance is being modified.</li>
     * <li>If the ALB instance is in the <strong>Active</strong> state, the ALB instance is modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerAttribute  UpdateLoadBalancerAttributeRequest
     * @return UpdateLoadBalancerAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateLoadBalancerAttributeResponse> updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLoadBalancerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLoadBalancerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLoadBalancerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  You can only upgrade a basic ALB instance to a standard ALB instance or a WAF-enabled ALB instance. You cannot downgrade a standard ALB instance or a WAF-enabled ALB instance to a basic ALB instance. For more information, see <a href="https://help.aliyun.com/document_detail/214654.html">Upgrade an ALB instance</a>.</p>
     * <ul>
     * <li><strong>UpdateLoadBalancerEdition</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation to query the status of an ALB instance.<ul>
     * <li>If the ALB instance is in the <strong>Configuring</strong> state, the edition of the ALB instance is being modified.</li>
     * <li>If the ALB instance is in the <strong>Active</strong> state, the edition of the ALB instance is modified.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerEdition  UpdateLoadBalancerEditionRequest
     * @return UpdateLoadBalancerEditionResponse
     */
    @Override
    public CompletableFuture<UpdateLoadBalancerEditionResponse> updateLoadBalancerEdition(UpdateLoadBalancerEditionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLoadBalancerEdition").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLoadBalancerEditionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLoadBalancerEditionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateLoadBalancerZones</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> to query the status of the task.</p>
     * <ul>
     * <li>If an ALB instance is in the <strong>Configuring</strong> state, the zones are being modified.</li>
     * <li>If an ALB instance is in the <strong>Active</strong> state, the zones are modified.<blockquote>
     * <p>You may be charged after you call UpdateLoadBalancerZones.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerZones  UpdateLoadBalancerZonesRequest
     * @return UpdateLoadBalancerZonesResponse
     */
    @Override
    public CompletableFuture<UpdateLoadBalancerZonesResponse> updateLoadBalancerZones(UpdateLoadBalancerZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLoadBalancerZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLoadBalancerZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLoadBalancerZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  <strong>UpdateRuleAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> operation to query the status of a forwarding rule:
     *     *   If a forwarding rule is in the <strong>Configuring</strong> state, the forwarding rule is being updated.
     *     *   If a forwarding rule is in the <strong>Available</strong> state, the forwarding rule is updated.</p>
     * <ul>
     * <li>You can set <strong>RuleConditions</strong> and <strong>RuleActions</strong> to add conditions and actions to a forwarding rule. Take note of the following limits on the number of conditions and the number of actions in each forwarding rule:<ul>
     * <li>Number of conditions: You can specify at most 5 for a basic Application Load Balancer (ALB) instance, at most 10 for a standard ALB instance, and at most 10 for a WAF-enabled ALB instance.</li>
     * <li>Number of actions: You can specify at most 3 for a basic ALB instance, at most 5 for a standard ALB instance, and at most 5 for a WAF-enabled ALB instance.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRuleAttribute  UpdateRuleAttributeRequest
     * @return UpdateRuleAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateRuleAttributeResponse> updateRuleAttribute(UpdateRuleAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRuleAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRuleAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRuleAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateRulesAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If a forwarding rule is in the <strong>Configuring</strong> state, the forwarding rule is being updated.</li>
     * <li>If a forwarding rule is in the <strong>Available</strong> state, the forwarding rule is updated.</li>
     * <li>You can set <strong>RuleConditions</strong> and <strong>RuleActions</strong> to add conditions and actions to a forwarding rule. Take note of the following limits on the maximum number of conditions and the maximum number of actions in each forwarding rule:<ul>
     * <li>Limits on conditions: 5 for a basic Application Load Balancer (ALB) instance, 10 for a standard ALB instance, and 10 for a WAF-enabled ALB instance.</li>
     * <li>Limits on actions: 3 for a basic ALB instance, 5 for a standard ALB instance, and 5 for a WAF-enabled ALB instance.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRulesAttribute  UpdateRulesAttributeRequest
     * @return UpdateRulesAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateRulesAttributeResponse> updateRulesAttribute(UpdateRulesAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRulesAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRulesAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRulesAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p><strong>UpdateSecurityPolicyAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/213609.html">ListSecurityPolicies</a> to query the status of the task.</p>
     * <ul>
     * <li>If a security policy is in the <strong>Configuring</strong> state, the security policy is being updated.</li>
     * <li>If a security policy is in the <strong>Available</strong> state, the security policy is updated.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSecurityPolicyAttribute  UpdateSecurityPolicyAttributeRequest
     * @return UpdateSecurityPolicyAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateSecurityPolicyAttributeResponse> updateSecurityPolicyAttribute(UpdateSecurityPolicyAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSecurityPolicyAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSecurityPolicyAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSecurityPolicyAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p><strong>UpdateServerGroupAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query the status of a server group:</p>
     * <ul>
     * <li>If a server group is in the <strong>Configuring</strong> state, the configuration of the server group is being modified.</li>
     * <li>If a server group is in the <strong>Available</strong> state, the configuration of the server group is modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateServerGroupAttribute  UpdateServerGroupAttributeRequest
     * @return UpdateServerGroupAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateServerGroupAttributeResponse> updateServerGroupAttribute(UpdateServerGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateServerGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServerGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServerGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateServerGroupServersAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query the status of a server group.<ul>
     * <li>If a server group is in the <strong>Configuring</strong> state, it indicates that the server group is being modified.</li>
     * <li>If a server group is in the <strong>Available</strong> state, it indicates that the server group is running.</li>
     * </ul>
     * </li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/213628.html">ListServerGroupServers</a> operation to query the status of a backend server.<ul>
     * <li>If a backend server is in the <strong>Configuring</strong> state, it indicates that the backend server is being modified.</li>
     * <li>If a backend server is in the <strong>Available</strong> state, it indicates that the backend server is running.</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of UpdateServerGroupServersAttribute  UpdateServerGroupServersAttributeRequest
     * @return UpdateServerGroupServersAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateServerGroupServersAttributeResponse> updateServerGroupServersAttribute(UpdateServerGroupServersAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateServerGroupServersAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServerGroupServersAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServerGroupServersAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
