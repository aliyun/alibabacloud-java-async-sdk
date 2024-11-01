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
    CompletableFuture<AddEntriesToAclResponse> addEntriesToAcl(AddEntriesToAclRequest request);

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
    CompletableFuture<AddServersToServerGroupResponse> addServersToServerGroup(AddServersToServerGroupRequest request);

    /**
     * @param request the request parameters of ApplyHealthCheckTemplateToServerGroup  ApplyHealthCheckTemplateToServerGroupRequest
     * @return ApplyHealthCheckTemplateToServerGroupResponse
     */
    CompletableFuture<ApplyHealthCheckTemplateToServerGroupResponse> applyHealthCheckTemplateToServerGroup(ApplyHealthCheckTemplateToServerGroupRequest request);

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
    CompletableFuture<AssociateAclsWithListenerResponse> associateAclsWithListener(AssociateAclsWithListenerRequest request);

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
    CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request);

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
    CompletableFuture<AttachCommonBandwidthPackageToLoadBalancerResponse> attachCommonBandwidthPackageToLoadBalancer(AttachCommonBandwidthPackageToLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported only by Application Load Balancer (ALB) instances that use static IP addresses. Before you call this operation, you must call the StartShiftLoadBalancerZones operation to remove the zone from the ALB instance.</p>
     * 
     * @param request the request parameters of CancelShiftLoadBalancerZones  CancelShiftLoadBalancerZonesRequest
     * @return CancelShiftLoadBalancerZonesResponse
     */
    CompletableFuture<CancelShiftLoadBalancerZonesResponse> cancelShiftLoadBalancerZones(CancelShiftLoadBalancerZonesRequest request);

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
    CompletableFuture<CreateAScriptsResponse> createAScripts(CreateAScriptsRequest request);

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
    CompletableFuture<CreateAclResponse> createAcl(CreateAclRequest request);

    /**
     * @param request the request parameters of CreateHealthCheckTemplate  CreateHealthCheckTemplateRequest
     * @return CreateHealthCheckTemplateResponse
     */
    CompletableFuture<CreateHealthCheckTemplateResponse> createHealthCheckTemplate(CreateHealthCheckTemplateRequest request);

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
    CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request);

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
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

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
    CompletableFuture<CreateRuleResponse> createRule(CreateRuleRequest request);

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
    CompletableFuture<CreateRulesResponse> createRules(CreateRulesRequest request);

    /**
     * @param request the request parameters of CreateSecurityPolicy  CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     */
    CompletableFuture<CreateSecurityPolicyResponse> createSecurityPolicy(CreateSecurityPolicyRequest request);

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
    CompletableFuture<CreateServerGroupResponse> createServerGroup(CreateServerGroupRequest request);

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
    CompletableFuture<DeleteAScriptsResponse> deleteAScripts(DeleteAScriptsRequest request);

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
    CompletableFuture<DeleteAclResponse> deleteAcl(DeleteAclRequest request);

    /**
     * @param request the request parameters of DeleteHealthCheckTemplates  DeleteHealthCheckTemplatesRequest
     * @return DeleteHealthCheckTemplatesResponse
     */
    CompletableFuture<DeleteHealthCheckTemplatesResponse> deleteHealthCheckTemplates(DeleteHealthCheckTemplatesRequest request);

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
    CompletableFuture<DeleteListenerResponse> deleteListener(DeleteListenerRequest request);

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
     * <p><em>DeleteRules</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214379.html">ListRules</a> operation to query the status of forwarding rules.</p>
     * <ul>
     * <li>If the forwarding rules are in the <strong>Deleting</strong> state, the forwarding rules are being deleted.</li>
     * <li>If the forwarding rules cannot be found, the forwarding rules are deleted.</li>
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
     * <p><em>DeleteDhcpOptionsSet</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/213618.html">ListAclRelations</a> operation to query the status of the task.</p>
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
     * <p><em>DissociateAdditionalCertificatesFromListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/214354.html">ListListenerCertificates</a> operation to query the status of the task. - If an additional certificate is in the <strong>Dissociating</strong> state, the additional certificate is being disassociated. - If an additional certificate is in the <strong>Dissociated</strong> state, the additional certificate is disassociated.</p>
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
     * <p>  LoadBalancerLeaveSecurityGroup is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254893.html">ListAsynJobs</a> operation to query the status of the task.
     *     *   If the task is in the Succeeded state, the ALB instance is removed from the security group.
     *     *   If the task is in the Processing state, the ALB instance is being removed from the security group. In this case, you can query the task but cannot perform other operations.</p>
     * 
     * @param request the request parameters of LoadBalancerLeaveSecurityGroup  LoadBalancerLeaveSecurityGroupRequest
     * @return LoadBalancerLeaveSecurityGroupResponse
     */
    CompletableFuture<LoadBalancerLeaveSecurityGroupResponse> loadBalancerLeaveSecurityGroup(LoadBalancerLeaveSecurityGroupRequest request);

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
    CompletableFuture<RemoveServersFromServerGroupResponse> removeServersFromServerGroup(RemoveServersFromServerGroupRequest request);

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
    CompletableFuture<ReplaceServersInServerGroupResponse> replaceServersInServerGroup(ReplaceServersInServerGroupRequest request);

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
    CompletableFuture<StartListenerResponse> startListener(StartListenerRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is supported by Application Load Balancer (ALB) instances that use static IP addresses. The zone cannot be removed if the ALB instance has only one available zone.</p>
     * 
     * @param request the request parameters of StartShiftLoadBalancerZones  StartShiftLoadBalancerZonesRequest
     * @return StartShiftLoadBalancerZonesResponse
     */
    CompletableFuture<StartShiftLoadBalancerZonesResponse> startShiftLoadBalancerZones(StartShiftLoadBalancerZonesRequest request);

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
     * <p><em>UpdateAScripts</em>* is an an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/472574.html">ListAScripts</a> operation to query the status of an AScript rule.</p>
     * <ul>
     * <li>If the rule is in the <strong>Configuring</strong> state, the rule is being updated.</li>
     * <li>If the rule is in the <strong>Available</strong> state, the rule is updated.</li>
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
     * <p><em>UpdateListenerAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2254865.html">GetListenerAttribute</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If a listener is in the <strong>Configuring</strong> state, the configuration of the listener is being modified.</li>
     * <li>If a listener is in the <strong>Running</strong> state, the configuration of the listener is modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateListenerAttribute  UpdateListenerAttributeRequest
     * @return UpdateListenerAttributeResponse
     */
    CompletableFuture<UpdateListenerAttributeResponse> updateListenerAttribute(UpdateListenerAttributeRequest request);

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
    CompletableFuture<UpdateListenerLogConfigResponse> updateListenerLogConfig(UpdateListenerLogConfigRequest request);

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
    CompletableFuture<UpdateLoadBalancerAddressTypeConfigResponse> updateLoadBalancerAddressTypeConfig(UpdateLoadBalancerAddressTypeConfigRequest request);

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
    CompletableFuture<UpdateLoadBalancerAttributeResponse> updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request);

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
    CompletableFuture<UpdateLoadBalancerEditionResponse> updateLoadBalancerEdition(UpdateLoadBalancerEditionRequest request);

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
    CompletableFuture<UpdateLoadBalancerZonesResponse> updateLoadBalancerZones(UpdateLoadBalancerZonesRequest request);

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
    CompletableFuture<UpdateRuleAttributeResponse> updateRuleAttribute(UpdateRuleAttributeRequest request);

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
    CompletableFuture<UpdateRulesAttributeResponse> updateRulesAttribute(UpdateRulesAttributeRequest request);

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
    CompletableFuture<UpdateSecurityPolicyAttributeResponse> updateSecurityPolicyAttribute(UpdateSecurityPolicyAttributeRequest request);

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
    CompletableFuture<UpdateServerGroupAttributeResponse> updateServerGroupAttribute(UpdateServerGroupAttributeRequest request);

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
    CompletableFuture<UpdateServerGroupServersAttributeResponse> updateServerGroupServersAttribute(UpdateServerGroupServersAttributeRequest request);

}
