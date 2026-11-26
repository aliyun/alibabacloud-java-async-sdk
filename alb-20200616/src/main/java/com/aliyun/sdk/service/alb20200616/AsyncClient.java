// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.alb20200616.models.*;
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
     * <li>Each policy group can contain multiple IP address entries or CIDR block entries. The entry limits for an access control policy group are as follows: <ul>
     * <li>Maximum number of IP address entries that can be added per account per call: 20. </li>
     * <li>Maximum number of entries that each access control policy group can contain: 500.</li>
     * </ul>
     * </li>
     * <li>The <strong>AddEntriesToAcl</strong> operation is asynchronous. After you call this operation, the system returns a request ID, but the IP entries are not immediately added to the access control policy group. The addition task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/213616.html">ListAclEntries</a> to query the addition status of the IP entries:<ul>
     * <li>If the access control policy group is in the <strong>Adding</strong> state, the IP entries are being added.</li>
     * <li>If the access control policy group is in the <strong>Available</strong> state, the IP entries are added.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AddEntriesToAcl  AddEntriesToAclRequest
     * @return AddEntriesToAclResponse
     */
    CompletableFuture<AddEntriesToAclResponse> addEntriesToAcl(AddEntriesToAclRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>AddServersToServerGroup</strong> operation is asynchronous. After you send the request, the system returns a request ID, but the backend servers are not immediately added. The addition task is still running in the background.</p>
     * <ol>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query the status of the server group:</li>
     * </ol>
     * <ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the server group is being reconfigured.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * <ol start="2">
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/213628.html">ListServerGroupServers</a> operation to query the status of the backend servers:</li>
     * </ol>
     * <ul>
     * <li>If a backend server is in the <strong>Adding</strong> state, the backend server is being added to the server group.</li>
     * <li>If a backend server is in the <strong>Available</strong> state, the backend server is running.</li>
     * </ul>
     * 
     * @param request the request parameters of AddServersToServerGroup  AddServersToServerGroupRequest
     * @return AddServersToServerGroupResponse
     */
    CompletableFuture<AddServersToServerGroupResponse> addServersToServerGroup(AddServersToServerGroupRequest request);

    /**
     * @param request the request parameters of ApplyHealthCheckTemplateToServerGroup  ApplyHealthCheckTemplateToServerGroupRequest
     * @return ApplyHealthCheckTemplateToServerGroupResponse
     */
    CompletableFuture<ApplyHealthCheckTemplateToServerGroupResponse> applyHealthCheckTemplateToServerGroup(ApplyHealthCheckTemplateToServerGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>AssociateAclsWithListener</strong> operation is asynchronous. After you call this operation, the system returns a request ID, but the ACLs are not yet associated with the listener. The association task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/213618.html">ListAclRelations</a> to query the association status of the ACLs:</p>
     * <ul>
     * <li>If the ACL is in the <strong>Associating</strong> state, the ACL is being associated with the listener.</li>
     * <li>If the ACL is in the <strong>Associated</strong> state, the ACL is associated with the listener.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateAclsWithListener  AssociateAclsWithListenerRequest
     * @return AssociateAclsWithListenerResponse
     */
    CompletableFuture<AssociateAclsWithListenerResponse> associateAclsWithListener(AssociateAclsWithListenerRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>AssociateAdditionalCertificatesWithListener</strong> operation is asynchronous. After you call this operation, the system returns a request ID, but the additional certificates are not immediately associated. The association task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> to query the association status of the additional certificates:</p>
     * <ul>
     * <li>If the HTTPS or QUIC listener is in the <strong>Associating</strong> state, the additional certificates are being associated.</li>
     * <li>If the HTTPS or QUIC listener is in the <strong>Associated</strong> state, the additional certificates are associated.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateAdditionalCertificatesWithListener  AssociateAdditionalCertificatesWithListenerRequest
     * @return AssociateAdditionalCertificatesWithListenerResponse
     */
    CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>AttachCommonBandwidthPackageToLoadBalancer</strong> operation is asynchronous. After you send the request, the system returns a request ID, but the Internet Shared Bandwidth instance is not yet associated with the load balancing instance. The association task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254835.html">GetLoadBalancerAttribute</a> operation to query the association status of the Internet Shared Bandwidth instance:</p>
     * <ul>
     * <li>When the load balancing instance is in the <strong>Configuring</strong> state, the Internet Shared Bandwidth instance is being associated.</li>
     * <li>When the load balancing instance is in the <strong>Active</strong> state, the Internet Shared Bandwidth instance is associated.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachCommonBandwidthPackageToLoadBalancer  AttachCommonBandwidthPackageToLoadBalancerRequest
     * @return AttachCommonBandwidthPackageToLoadBalancerResponse
     */
    CompletableFuture<AttachCommonBandwidthPackageToLoadBalancerResponse> attachCommonBandwidthPackageToLoadBalancer(AttachCommonBandwidthPackageToLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only for Application Load Balancer (ALB) instances in static IP mode. Before you call this operation, you must have removed a zone from the ALB instance by calling the StartShiftLoadBalancerZones operation or by using the console.</p>
     * 
     * @param request the request parameters of CancelShiftLoadBalancerZones  CancelShiftLoadBalancerZonesRequest
     * @return CancelShiftLoadBalancerZonesResponse
     */
    CompletableFuture<CancelShiftLoadBalancerZonesResponse> cancelShiftLoadBalancerZones(CancelShiftLoadBalancerZonesRequest request);

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Create a Standard Edition or WAF-enhanced ALB instance. For more information, see <a href="https://help.aliyun.com/document_detail/214358.html">CreateLoadBalancer</a>.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p><strong>CreateAScripts</strong> is an asynchronous operation. After a request is sent, the system returns a request ID, but the programmable script is not yet created. The creation task continues in the background. Call <a href="https://help.aliyun.com/document_detail/472574.html">ListAScripts</a> to query the creation status of the programmable script:</p>
     * <ul>
     * <li>If the programmable script is in the <strong>Creating</strong> state, the script is being created.</li>
     * <li>If the programmable script is in the <strong>Available</strong> state, the script is created successfully.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAScripts  CreateAScriptsRequest
     * @return CreateAScriptsResponse
     */
    CompletableFuture<CreateAScriptsResponse> createAScripts(CreateAScriptsRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>CreateAcl</strong> operation is asynchronous. After you invoke this operation, the system returns an instance ID, but the access control policy group is not immediately created because the creation node is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/213617.html">ListAcls</a> to query the creation status of the access control policy group:</p>
     * <ul>
     * <li>If the access control policy group is in the <strong>Creating</strong> state, the access control policy group is being created.</li>
     * <li>If the access control policy group is in the <strong>Available</strong> state, the access control policy group is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAcl  CreateAclRequest
     * @return CreateAclResponse
     */
    CompletableFuture<CreateAclResponse> createAcl(CreateAclRequest request);

    /**
     * @param request the request parameters of CreateHealthCheckTemplate  CreateHealthCheckTemplateRequest
     * @return CreateHealthCheckTemplateResponse
     */
    CompletableFuture<CreateHealthCheckTemplateResponse> createHealthCheckTemplate(CreateHealthCheckTemplateRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>CreateListener</strong> operation is asynchronous. The system returns a request ID, but the HTTP, HTTPS, or QUIC listener is not yet created. The creation task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> operation to query the creation status of the HTTP, HTTPS, or QUIC listener:</p>
     * <ul>
     * <li>If the HTTP, HTTPS, or QUIC listener is in the <strong>Provisioning</strong> state, the listener is being created.</li>
     * <li>If the HTTP, HTTPS, or QUIC listener is in the <strong>Running</strong> state, the listener is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateListener  CreateListenerRequest
     * @return CreateListenerResponse
     */
    CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>CreateLoadBalancer</strong> operation is asynchronous. The system returns an instance ID, but the Application Load Balancing (ALB) instance is not yet created and the creation task is still running in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation to query the creation status of the Application Load Balancing (ALB) instance:</p>
     * <ul>
     * <li>When the Application Load Balancing (ALB) instance is in the <strong>Provisioning</strong> state, the instance is being created.</li>
     * <li>When the Application Load Balancing (ALB) instance is in the <strong>Active</strong> state, the instance is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a forwarding rule, note the following items:</p>
     * <ul>
     * <li>When you configure the <strong>Redirect</strong> action, you cannot set all parameters except the <strong>HttpCode</strong> parameter to their default values.</li>
     * <li>When you configure multiple actions for the same forwarding rule, you must set the action type of the <strong>Rewrite</strong> action to <strong>ForwardGroup</strong>.</li>
     * <li>The <strong>CreateRule</strong> operation is asynchronous. After you send the request, the system returns an instance ID, but the forwarding rule is not yet created and the creation node in the background is still in progress. You can invoke the <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> operation to query the creation status of the forwarding rule:<ul>
     * <li>If the forwarding rule is in the <strong>Provisioning</strong> state, the forwarding rule is being created.</li>
     * <li>If the forwarding rule is in the <strong>Available</strong> state, the forwarding rule is created.</li>
     * </ul>
     * </li>
     * <li>The maximum number of conditions (<strong>RuleConditions</strong>) and actions (<strong>RuleActions</strong>) that you can add to a forwarding rule varies based on the edition:<ul>
     * <li>Number of conditions: 5 for Basic Edition, 10 for Standard Edition, and 10 for WAF-enhanced Edition.</li>
     * <li>Number of actions: 3 for Basic Edition, 5 for Standard Edition, and 5 for WAF-enhanced Edition.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateRule  CreateRuleRequest
     * @return CreateRuleResponse
     */
    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

    /**
     * <b>description</b> :
     * <p>When you invoke this operation to create forwarding rules, take note of the following items:</p>
     * <ul>
     * <li>When you configure the <strong>Redirect</strong> action, you cannot set all parameters except <strong>HttpCode</strong> to their default values.</li>
     * <li>If you configure multiple actions for the same forwarding rule, the action type of the <strong>Rewrite</strong> action must be set to <strong>ForwardGroup</strong>.</li>
     * <li>The <strong>CreateRules</strong> operation is asynchronous. After you send the request, the system returns an instance ID, but the forwarding rules are not yet created. The creation node is still running in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> operation to query the creation status of the forwarding rules:<ul>
     * <li>If the forwarding rules are in the <strong>Provisioning</strong> state, the forwarding rules are being created.</li>
     * <li>If the forwarding rules are in the <strong>Available</strong> state, the forwarding rules are created.</li>
     * </ul>
     * </li>
     * <li>A forwarding rule supports the following maximum numbers of conditions (<strong>RuleConditions</strong>) and actions (<strong>RuleActions</strong>):<ul>
     * <li>Number of conditions: 5 for Basic Edition, 10 for Standard Edition, and 10 for WAF-enhanced Edition.</li>
     * <li>Number of actions: 3 for Basic Edition, 5 for Standard Edition, and 5 for WAF-enhanced Edition.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateRules  CreateRulesRequest
     * @return CreateRulesResponse
     */
    CompletableFuture<CreateRulesResponse> createRules(CreateRulesRequest request);

    /**
     * @param request the request parameters of CreateSecurityPolicy  CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     */
    CompletableFuture<CreateSecurityPolicyResponse> createSecurityPolicy(CreateSecurityPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>CreateServerGroup</strong> API operation is asynchronous. After you call this operation, the system returns a request ID, but the server group is not yet created and the creation task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query the creation status of the server group:</p>
     * <ul>
     * <li>If the server group is in the <strong>Creating</strong> state, the server group is being created.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the server group is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateServerGroup  CreateServerGroupRequest
     * @return CreateServerGroupResponse
     */
    CompletableFuture<CreateServerGroupResponse> createServerGroup(CreateServerGroupRequest request);

    /**
     * <b>description</b> :
     * <p><em>DeleteAScripts</em>* is an asynchronous operation. After you call this operation, the system returns a request ID, but the programmable scripts are not immediately deleted. The deletion task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/472574.html">ListAScripts</a> to query the deletion status of the programmable scripts:</p>
     * <ul>
     * <li>If a programmable script is in the <strong>Deleting</strong> state, the script is being deleted.</li>
     * <li>If the programmable script cannot be queried, the script is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAScripts  DeleteAScriptsRequest
     * @return DeleteAScriptsResponse
     */
    CompletableFuture<DeleteAScriptsResponse> deleteAScripts(DeleteAScriptsRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>DeleteAcl</strong> API operation is asynchronous. The system returns a request ID, but the access control list (ACL) is not yet deleted and the deletion task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/213617.html">ListAcls</a> to query the deletion status of the ACL:</p>
     * <ul>
     * <li>If the ACL is in the <strong>Deleting</strong> state, it indicates that the ACL is being deleted.</li>
     * <li>If the status of the ACL cannot be queried, it indicates that the ACL is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteAcl  DeleteAclRequest
     * @return DeleteAclResponse
     */
    CompletableFuture<DeleteAclResponse> deleteAcl(DeleteAclRequest request);

    /**
     * @param request the request parameters of DeleteHealthCheckTemplates  DeleteHealthCheckTemplatesRequest
     * @return DeleteHealthCheckTemplatesResponse
     */
    CompletableFuture<DeleteHealthCheckTemplatesResponse> deleteHealthCheckTemplates(DeleteHealthCheckTemplatesRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>DeleteListener</strong> operation is asynchronous. After you call this operation, the system returns a request ID, but the listener is not immediately deleted. The deletion task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> to query the deletion status of the listener:</p>
     * <ul>
     * <li>If the listener is in the <strong>Deleting</strong> state, the listener is being deleted.</li>
     * <li>If the listener cannot be queried, the listener is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteListener  DeleteListenerRequest
     * @return DeleteListenerResponse
     */
    CompletableFuture<DeleteListenerResponse> deleteListener(DeleteListenerRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>DeleteLoadBalancer</strong> API operation is asynchronous. After you invoke this operation, the system returns a request ID, but the application load balancing instance is not immediately deleted. The deletion node is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> to query the deletion status of the application load balancing instance:</p>
     * <ul>
     * <li>When the application load balancing instance is in the <strong>Deleting</strong> state, the instance is being deleted.</li>
     * <li>When the specified application load balancing instance cannot be queried, the instance is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteLoadBalancer  DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request);

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
    CompletableFuture<DeleteRuleResponse> deleteRule(DeleteRuleRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>DeleteRules</strong> operation is asynchronous. After you call this operation, the system returns a request ID, but the forwarding rules are not immediately deleted. The deletion task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> operation to query the deletion status of the forwarding rules:</p>
     * <ul>
     * <li>If the forwarding rules are in the <strong>Deleting</strong> state, the forwarding rules are being deleted.</li>
     * <li>If the status of the forwarding rules cannot be queried, the forwarding rules are deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRules  DeleteRulesRequest
     * @return DeleteRulesResponse
     */
    CompletableFuture<DeleteRulesResponse> deleteRules(DeleteRulesRequest request);

    /**
     * @param request the request parameters of DeleteSecurityPolicy  DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     */
    CompletableFuture<DeleteSecurityPolicyResponse> deleteSecurityPolicy(DeleteSecurityPolicyRequest request);

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
    CompletableFuture<DeleteServerGroupResponse> deleteServerGroup(DeleteServerGroupRequest request);

    /**
     * @param request the request parameters of DescribeCapacityReservation  DescribeCapacityReservationRequest
     * @return DescribeCapacityReservationResponse
     */
    CompletableFuture<DescribeCapacityReservationResponse> describeCapacityReservation(DescribeCapacityReservationRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

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
    CompletableFuture<DetachCommonBandwidthPackageFromLoadBalancerResponse> detachCommonBandwidthPackageFromLoadBalancer(DetachCommonBandwidthPackageFromLoadBalancerRequest request);

    /**
     * @param request the request parameters of DisableDeletionProtection  DisableDeletionProtectionRequest
     * @return DisableDeletionProtectionResponse
     */
    CompletableFuture<DisableDeletionProtectionResponse> disableDeletionProtection(DisableDeletionProtectionRequest request);

    /**
     * @param request the request parameters of DisableLoadBalancerAccessLog  DisableLoadBalancerAccessLogRequest
     * @return DisableLoadBalancerAccessLogResponse
     */
    CompletableFuture<DisableLoadBalancerAccessLogResponse> disableLoadBalancerAccessLog(DisableLoadBalancerAccessLogRequest request);

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
    CompletableFuture<DisableLoadBalancerIpv6InternetResponse> disableLoadBalancerIpv6Internet(DisableLoadBalancerIpv6InternetRequest request);

    /**
     * <b>description</b> :
     * <p><em>DissociateAclsFromListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/213618.html">ListAclRelations</a> to query the status of an ACL.</p>
     * <ul>
     * <li>If an ACL is in the <strong>Dissociating</strong> state, the ACL is being disassociated from the listener.</li>
     * <li>If an ACL is in the <strong>Dissociated</strong> state, the ACL is disassociated from the listener.</li>
     * </ul>
     * 
     * @param request the request parameters of DissociateAclsFromListener  DissociateAclsFromListenerRequest
     * @return DissociateAclsFromListenerResponse
     */
    CompletableFuture<DissociateAclsFromListenerResponse> dissociateAclsFromListener(DissociateAclsFromListenerRequest request);

    /**
     * <b>description</b> :
     * <p><em>DissociateAdditionalCertificatesFromListener</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the background. You can call <a href="t2324486.xdita#"></a>to query the status of the dissociation task:</p>
     * <ul>
     * <li>If an additional certificate is in the <strong>Dissociating</strong> state, the dissociation is in progress.</li>
     * <li>If an additional certificate is in the <strong>Dissociated</strong> state, the dissociation is complete.</li>
     * </ul>
     * 
     * @param request the request parameters of DissociateAdditionalCertificatesFromListener  DissociateAdditionalCertificatesFromListenerRequest
     * @return DissociateAdditionalCertificatesFromListenerResponse
     */
    CompletableFuture<DissociateAdditionalCertificatesFromListenerResponse> dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request);

    /**
     * @param request the request parameters of EnableDeletionProtection  EnableDeletionProtectionRequest
     * @return EnableDeletionProtectionResponse
     */
    CompletableFuture<EnableDeletionProtectionResponse> enableDeletionProtection(EnableDeletionProtectionRequest request);

    /**
     * @param request the request parameters of EnableLoadBalancerAccessLog  EnableLoadBalancerAccessLogRequest
     * @return EnableLoadBalancerAccessLogResponse
     */
    CompletableFuture<EnableLoadBalancerAccessLogResponse> enableLoadBalancerAccessLog(EnableLoadBalancerAccessLogRequest request);

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
    CompletableFuture<EnableLoadBalancerIpv6InternetResponse> enableLoadBalancerIpv6Internet(EnableLoadBalancerIpv6InternetRequest request);

    /**
     * @param request the request parameters of GetHealthCheckTemplateAttribute  GetHealthCheckTemplateAttributeRequest
     * @return GetHealthCheckTemplateAttributeResponse
     */
    CompletableFuture<GetHealthCheckTemplateAttributeResponse> getHealthCheckTemplateAttribute(GetHealthCheckTemplateAttributeRequest request);

    /**
     * @param request the request parameters of GetListenerAttribute  GetListenerAttributeRequest
     * @return GetListenerAttributeResponse
     */
    CompletableFuture<GetListenerAttributeResponse> getListenerAttribute(GetListenerAttributeRequest request);

    /**
     * @param request the request parameters of GetListenerHealthStatus  GetListenerHealthStatusRequest
     * @return GetListenerHealthStatusResponse
     */
    CompletableFuture<GetListenerHealthStatusResponse> getListenerHealthStatus(GetListenerHealthStatusRequest request);

    /**
     * @param request the request parameters of GetLoadBalancerAttribute  GetLoadBalancerAttributeRequest
     * @return GetLoadBalancerAttributeResponse
     */
    CompletableFuture<GetLoadBalancerAttributeResponse> getLoadBalancerAttribute(GetLoadBalancerAttributeRequest request);

    /**
     * @param request the request parameters of ListAScripts  ListAScriptsRequest
     * @return ListAScriptsResponse
     */
    CompletableFuture<ListAScriptsResponse> listAScripts(ListAScriptsRequest request);

    /**
     * @param request the request parameters of ListAclEntries  ListAclEntriesRequest
     * @return ListAclEntriesResponse
     */
    CompletableFuture<ListAclEntriesResponse> listAclEntries(ListAclEntriesRequest request);

    /**
     * @param request the request parameters of ListAclRelations  ListAclRelationsRequest
     * @return ListAclRelationsResponse
     */
    CompletableFuture<ListAclRelationsResponse> listAclRelations(ListAclRelationsRequest request);

    /**
     * @param request the request parameters of ListAcls  ListAclsRequest
     * @return ListAclsResponse
     */
    CompletableFuture<ListAclsResponse> listAcls(ListAclsRequest request);

    /**
     * @param request the request parameters of ListAsynJobs  ListAsynJobsRequest
     * @return ListAsynJobsResponse
     */
    CompletableFuture<ListAsynJobsResponse> listAsynJobs(ListAsynJobsRequest request);

    /**
     * @param request the request parameters of ListHealthCheckTemplates  ListHealthCheckTemplatesRequest
     * @return ListHealthCheckTemplatesResponse
     */
    CompletableFuture<ListHealthCheckTemplatesResponse> listHealthCheckTemplates(ListHealthCheckTemplatesRequest request);

    /**
     * @param request the request parameters of ListListenerCertificates  ListListenerCertificatesRequest
     * @return ListListenerCertificatesResponse
     */
    CompletableFuture<ListListenerCertificatesResponse> listListenerCertificates(ListListenerCertificatesRequest request);

    /**
     * @param request the request parameters of ListListeners  ListListenersRequest
     * @return ListListenersResponse
     */
    CompletableFuture<ListListenersResponse> listListeners(ListListenersRequest request);

    /**
     * @param request the request parameters of ListLoadBalancers  ListLoadBalancersRequest
     * @return ListLoadBalancersResponse
     */
    CompletableFuture<ListLoadBalancersResponse> listLoadBalancers(ListLoadBalancersRequest request);

    /**
     * @param request the request parameters of ListRules  ListRulesRequest
     * @return ListRulesResponse
     */
    CompletableFuture<ListRulesResponse> listRules(ListRulesRequest request);

    /**
     * @param request the request parameters of ListSecurityPolicies  ListSecurityPoliciesRequest
     * @return ListSecurityPoliciesResponse
     */
    CompletableFuture<ListSecurityPoliciesResponse> listSecurityPolicies(ListSecurityPoliciesRequest request);

    /**
     * @param request the request parameters of ListSecurityPolicyRelations  ListSecurityPolicyRelationsRequest
     * @return ListSecurityPolicyRelationsResponse
     */
    CompletableFuture<ListSecurityPolicyRelationsResponse> listSecurityPolicyRelations(ListSecurityPolicyRelationsRequest request);

    /**
     * @param request the request parameters of ListServerGroupServers  ListServerGroupServersRequest
     * @return ListServerGroupServersResponse
     */
    CompletableFuture<ListServerGroupServersResponse> listServerGroupServers(ListServerGroupServersRequest request);

    /**
     * @param request the request parameters of ListServerGroups  ListServerGroupsRequest
     * @return ListServerGroupsResponse
     */
    CompletableFuture<ListServerGroupsResponse> listServerGroups(ListServerGroupsRequest request);

    /**
     * @param request the request parameters of ListSystemSecurityPolicies  ListSystemSecurityPoliciesRequest
     * @return ListSystemSecurityPoliciesResponse
     */
    CompletableFuture<ListSystemSecurityPoliciesResponse> listSystemSecurityPolicies(ListSystemSecurityPoliciesRequest request);

    /**
     * @param request the request parameters of ListTagKeys  ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    CompletableFuture<ListTagKeysResponse> listTagKeys(ListTagKeysRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListTagValues  ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    CompletableFuture<ListTagValuesResponse> listTagValues(ListTagValuesRequest request);

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
    CompletableFuture<LoadBalancerJoinSecurityGroupResponse> loadBalancerJoinSecurityGroup(LoadBalancerJoinSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>LoadBalancerLeaveSecurityGroup is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254893.html">ListAsynJobs</a> operation to query the status of the task.<ul>
     * <li>If the task is in the Succeeded state, the ALB instance is removed from the security group.</li>
     * <li>If the task is in the Processing state, the ALB instance is being removed from the security group. In this case, you can query the task but cannot perform other operations.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of LoadBalancerLeaveSecurityGroup  LoadBalancerLeaveSecurityGroupRequest
     * @return LoadBalancerLeaveSecurityGroupResponse
     */
    CompletableFuture<LoadBalancerLeaveSecurityGroupResponse> loadBalancerLeaveSecurityGroup(LoadBalancerLeaveSecurityGroupRequest request);

    /**
     * <b>description</b> :
     * <p><em>ModifyCapacityReservation</em>* is an asynchronous operation. The system returns a request ID, but the capacity reservation is not yet complete and the reservation task continues to run in the background. You can call DescribeCapacityReservation to query the status of the capacity reservation:</p>
     * <ul>
     * <li><strong>Pending</strong>: The capacity reservation is in progress.</li>
     * <li><strong>Provisioned</strong>: The capacity reservation is complete.</li>
     * <li><strong>Rebalancing</strong>: The capacity reservation is being redistributed across zones.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCapacityReservation  ModifyCapacityReservationRequest
     * @return ModifyCapacityReservationResponse
     */
    CompletableFuture<ModifyCapacityReservationResponse> modifyCapacityReservation(ModifyCapacityReservationRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

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
    CompletableFuture<RemoveEntriesFromAclResponse> removeEntriesFromAcl(RemoveEntriesFromAclRequest request);

    /**
     * <b>description</b> :
     * <p><em>RemoveServersFromServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/2254862.html">ListServerGroups</a> to query the status of a server group.<ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * </li>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/2254863.html">ListServerGroupServers</a> to query the status of a backend server.<ul>
     * <li>If the backend server is in the <strong>Removing</strong> state, the backend server is being removed from the server group.</li>
     * <li>If the backend server cannot be found, the backend server is no longer in the server group.</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of RemoveServersFromServerGroup  RemoveServersFromServerGroupRequest
     * @return RemoveServersFromServerGroupResponse
     */
    CompletableFuture<RemoveServersFromServerGroupResponse> removeServersFromServerGroup(RemoveServersFromServerGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>ReplaceServersInServerGroup</strong> operation is asynchronous. After a request ID is returned, the backend server replacement task is still being processed in the background.</p>
     * <ol>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> to query the status of a server group:<ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * </li>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/213628.html">ListServerGroupServers</a> to query the status of a backend server:<ul>
     * <li>If the backend server is in the <strong>Replacing</strong> state, the server group is removing the server and adding a new server.</li>
     * <li>If the backend server is in the <strong>Available</strong> state, the backend server is running.</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of ReplaceServersInServerGroup  ReplaceServersInServerGroupRequest
     * @return ReplaceServersInServerGroupResponse
     */
    CompletableFuture<ReplaceServersInServerGroupResponse> replaceServersInServerGroup(ReplaceServersInServerGroupRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>StartListener</strong> API operation is asynchronous. The system returns a request ID, but the listener has not been started and the start task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> to query the start status of the listener:</p>
     * <ul>
     * <li>If the listener is in the <strong>Configuring</strong> state, the listener is being started.</li>
     * <li>If the listener is in the <strong>Running</strong> state, the listener is started.</li>
     * </ul>
     * 
     * @param request the request parameters of StartListener  StartListenerRequest
     * @return StartListenerResponse
     */
    CompletableFuture<StartListenerResponse> startListener(StartListenerRequest request);

    /**
     * <b>description</b> :
     * <p>Only ALB instances in fixed IP mode are supported.
     * You cannot remove a zone from an ALB instance if the instance has only one zone in the Active state.</p>
     * 
     * @param request the request parameters of StartShiftLoadBalancerZones  StartShiftLoadBalancerZonesRequest
     * @return StartShiftLoadBalancerZonesResponse
     */
    CompletableFuture<StartShiftLoadBalancerZonesResponse> startShiftLoadBalancerZones(StartShiftLoadBalancerZonesRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>StopListener</strong> operation is asynchronous. After you call this operation, the system returns a request ID, but the listener is not immediately stopped. The stop task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> to query the stop status of the listener:</p>
     * <ul>
     * <li>If the listener is in the <strong>Configuring</strong> state, the listener is being stopped.</li>
     * <li>If the listener is in the <strong>Stopped</strong> state, the listener is stopped.</li>
     * </ul>
     * 
     * @param request the request parameters of StopListener  StopListenerRequest
     * @return StopListenerResponse
     */
    CompletableFuture<StopListenerResponse> stopListener(StopListenerRequest request);

    /**
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnTagResources  UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p><em>UpdateAScripts</em>* is an asynchronous operation. After a request is sent, the system returns a request ID. However, the programmable script is not yet updated, and the update task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/472574.html">ListAScripts</a> to query the update status of the programmable script:</p>
     * <ul>
     * <li>If the programmable script is in the <strong>Configuring</strong> state, the programmable script is being updated.</li>
     * <li>If the programmable script is in the <strong>Available</strong> state, the programmable script is updated.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateAScripts  UpdateAScriptsRequest
     * @return UpdateAScriptsResponse
     */
    CompletableFuture<UpdateAScriptsResponse> updateAScripts(UpdateAScriptsRequest request);

    /**
     * @param request the request parameters of UpdateAclAttribute  UpdateAclAttributeRequest
     * @return UpdateAclAttributeResponse
     */
    CompletableFuture<UpdateAclAttributeResponse> updateAclAttribute(UpdateAclAttributeRequest request);

    /**
     * @param request the request parameters of UpdateHealthCheckTemplateAttribute  UpdateHealthCheckTemplateAttributeRequest
     * @return UpdateHealthCheckTemplateAttributeResponse
     */
    CompletableFuture<UpdateHealthCheckTemplateAttributeResponse> updateHealthCheckTemplateAttribute(UpdateHealthCheckTemplateAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>UpdateListenerAttribute</strong> operation is asynchronous. After you call this operation, the system returns a request ID, but the listener configurations are not immediately updated. The update task continues to run in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> operation to query the update status of the listener configurations:</p>
     * <ul>
     * <li>If the listener is in the <strong>Configuring</strong> state, the listener configurations are being updated.</li>
     * <li>If the listener is in the <strong>Running</strong> state, the listener configurations are updated.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateListenerAttribute  UpdateListenerAttributeRequest
     * @return UpdateListenerAttributeResponse
     */
    CompletableFuture<UpdateListenerAttributeResponse> updateListenerAttribute(UpdateListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>UpdateListenerLogConfig</strong> operation is asynchronous. The system returns a request ID, but the log configuration of the listener is not immediately updated. The update task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> operation to query the update status of the log configuration:</p>
     * <ul>
     * <li>If the listener is in the <strong>Configuring</strong> state, the log configuration is being updated.</li>
     * <li>If the listener is in the <strong>Running</strong> state, the log configuration is updated.<blockquote>
     * <p>You can update the log configuration of a listener only after you enable the access log feature for the instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateListenerLogConfig  UpdateListenerLogConfigRequest
     * @return UpdateListenerLogConfigResponse
     */
    CompletableFuture<UpdateListenerLogConfigResponse> updateListenerLogConfig(UpdateListenerLogConfigRequest request);

    /**
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>You have created an ALB instance. For more information, see <a href="https://help.aliyun.com/document_detail/214358.html">CreateLoadBalancer</a>.</li>
     * <li>To change the network type of an ALB instance from private network to public network using this operation, you must first create an elastic IP address (EIP). For more information, see <a href="https://help.aliyun.com/document_detail/120192.html">AllocateEipAddress</a>.
     * Usage notes:
     * <strong>UpdateLoadBalancerAddressTypeConfig</strong> is an asynchronous operation. After a request is sent, the system returns a request ID, but the network type of the ALB instance is not yet changed. The change node continues in the background. You can invoke <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> to query the network type change status of the ALB instance:</li>
     * <li>If the ALB instance is in the <strong>Configuring</strong> state, the load balancing instance network type is being changed.</li>
     * <li>If the ALB instance is in the <strong>Active</strong> state, the load balancing instance network type has been changed successfully.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerAddressTypeConfig  UpdateLoadBalancerAddressTypeConfigRequest
     * @return UpdateLoadBalancerAddressTypeConfigResponse
     */
    CompletableFuture<UpdateLoadBalancerAddressTypeConfigResponse> updateLoadBalancerAddressTypeConfig(UpdateLoadBalancerAddressTypeConfigRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>UpdateLoadBalancerAttribute</strong> operation is asynchronous. After you invoke this operation, the system returns a request ID, but the property of the application load balancing instance is not immediately updated. The update task is still running in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation to query the update status of the application load balancing instance property:</p>
     * <ul>
     * <li>When the property of the application load balancing instance is in the <strong>Configuring</strong> state, it indicates that the property is being updated.</li>
     * <li>When the property of the application load balancing instance is in the <strong>Active</strong> state, it indicates that the property is updated.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerAttribute  UpdateLoadBalancerAttributeRequest
     * @return UpdateLoadBalancerAttributeResponse
     */
    CompletableFuture<UpdateLoadBalancerAttributeResponse> updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>ALB instances can only be upgraded from Basic Edition to Standard Edition or WAF-enhanced Edition, or downgraded from WAF-enhanced Edition to Standard Edition. Downgrading from Standard Edition or WAF-enhanced Edition to Basic Edition is not supported. For more information, see <a href="https://help.aliyun.com/document_detail/214654.html">Upgrade the feature edition of an instance</a>.</li>
     * <li>The <strong>UpdateLoadBalancerEdition</strong> operation is asynchronous. After you invoke the operation, the system returns a request ID, but the application load balancing edition has not been modified. The modification node is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> to query the modification status of the application load balancing edition:<ul>
     * <li>If the application load balancing edition is in the <strong>Configuring</strong> state, the edition is being modified.</li>
     * <li>If the application load balancing edition is in the <strong>Active</strong> state, the edition is successfully modified.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerEdition  UpdateLoadBalancerEditionRequest
     * @return UpdateLoadBalancerEditionResponse
     */
    CompletableFuture<UpdateLoadBalancerEditionResponse> updateLoadBalancerEdition(UpdateLoadBalancerEditionRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>UpdateLoadBalancerZones</strong> API operation is asynchronous. After you invoke this operation, the system returns a request ID, but the active zone property of the application load balancing instance is not immediately modified. The modification node is still running in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation to query the modification status of the active zone property:</p>
     * <ul>
     * <li>If the application load balancing instance is in the <strong>Configuring</strong> state, the active zone property is being modified.</li>
     * <li>If the application load balancing instance is in the <strong>Active</strong> state, the active zone property is modified.<blockquote>
     * <p>Invoking the UpdateLoadBalancerZones operation may incur fees.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerZones  UpdateLoadBalancerZonesRequest
     * @return UpdateLoadBalancerZonesResponse
     */
    CompletableFuture<UpdateLoadBalancerZonesResponse> updateLoadBalancerZones(UpdateLoadBalancerZonesRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>UpdateRuleAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID. However, the forwarding rule attributes are not yet updated. The update task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> to query the update status of the forwarding rule attributes:<ul>
     * <li>If the forwarding rule attributes are in the <strong>Configuring</strong> state, the attributes are being updated.</li>
     * <li>If the forwarding rule attributes are in the <strong>Available</strong> state, the attributes are updated.</li>
     * </ul>
     * </li>
     * <li>The maximum number of conditions (<strong>RuleConditions</strong>) and actions (<strong>RuleActions</strong>) that can be added to a forwarding rule is as follows:<ul>
     * <li>Conditions: 5 for Basic Edition, 10 for Standard Edition, and 10 for WAF-enabled Edition.</li>
     * <li>Actions: 3 for Basic Edition, 5 for Standard Edition, and 5 for WAF-enabled Edition.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRuleAttribute  UpdateRuleAttributeRequest
     * @return UpdateRuleAttributeResponse
     */
    CompletableFuture<UpdateRuleAttributeResponse> updateRuleAttribute(UpdateRuleAttributeRequest request);

    /**
     * <b>description</b> :
     * <p><em>UpdateRulesAttribute</em>* is an asynchronous operation. The system returns a request ID, but the forwarding rule attributes are not immediately updated. The update task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> to query the update status of the forwarding rule attributes:</p>
     * <ul>
     * <li>If the attributes of multiple forwarding rules are in the <strong>Configuring</strong> state, the forwarding rule attributes are being updated in batches.</li>
     * <li>If the attributes of multiple forwarding rules are in the <strong>Available</strong> state, the forwarding rule attributes are successfully updated in batches.</li>
     * <li>The maximum numbers of conditions (<strong>RuleConditions</strong>) and actions (<strong>RuleActions</strong>) that can be added to a single forwarding rule are as follows:<ul>
     * <li>Conditions: 5 for Basic Edition, 10 for Standard Edition, and 10 for WAF-enhanced Edition.</li>
     * <li>Actions: 3 for Basic Edition, 5 for Standard Edition, and 5 for WAF-enhanced Edition.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRulesAttribute  UpdateRulesAttributeRequest
     * @return UpdateRulesAttributeResponse
     */
    CompletableFuture<UpdateRulesAttributeResponse> updateRulesAttribute(UpdateRulesAttributeRequest request);

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>The <strong>UpdateSecurityPolicyAttribute</strong> operation is asynchronous. After you call this operation, the system returns a request ID, but the security policy attributes are not immediately updated. The update task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/213609.html">ListSecurityPolicies</a> to query the update status of the security policy attributes:</p>
     * <ul>
     * <li>If the security policy is in the <strong>Configuring</strong> state, the attributes are being updated.</li>
     * <li>If the security policy is in the <strong>Available</strong> state, the attributes are updated.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSecurityPolicyAttribute  UpdateSecurityPolicyAttributeRequest
     * @return UpdateSecurityPolicyAttributeResponse
     */
    CompletableFuture<UpdateSecurityPolicyAttributeResponse> updateSecurityPolicyAttribute(UpdateSecurityPolicyAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>The <strong>UpdateServerGroupAttribute</strong> operation is asynchronous. After you send the request, the system returns a request ID, but the server group configurations are not immediately updated. The update task runs in the background. You can call the <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> operation to query the update status of the server group configurations:</p>
     * <ul>
     * <li>If the server group configurations are in the <strong>Configuring</strong> state, the configurations are being updated.</li>
     * <li>If the server group configurations are in the <strong>Available</strong> state, the configurations are updated.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateServerGroupAttribute  UpdateServerGroupAttributeRequest
     * @return UpdateServerGroupAttributeResponse
     */
    CompletableFuture<UpdateServerGroupAttributeResponse> updateServerGroupAttribute(UpdateServerGroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <p><em>UpdateServerGroupServersAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID. However, the backend server configurations are not yet updated, and the update task is still running in the background.</p>
     * <ol>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/213627.html">ListServerGroups</a> to query the status of a server group:<ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * </li>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/213628.html">ListServerGroupServers</a> to query the status of a backend server:<ul>
     * <li>If the backend server is in the <strong>Configuring</strong> state, the backend server is being modified.</li>
     * <li>If the backend server is in the <strong>Available</strong> state, the backend server is running.</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of UpdateServerGroupServersAttribute  UpdateServerGroupServersAttributeRequest
     * @return UpdateServerGroupServersAttributeResponse
     */
    CompletableFuture<UpdateServerGroupServersAttributeResponse> updateServerGroupServersAttribute(UpdateServerGroupServersAttributeRequest request);

}
