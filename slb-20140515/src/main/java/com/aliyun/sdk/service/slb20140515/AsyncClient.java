// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.slb20140515.models.*;
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
     * <p>Each network ACL can contain one or more IP addresses or CIDR blocks. Take note of the following limits on network ACLs:</p>
     * <ul>
     * <li>The number of IP entries that can be added to a network ACL with each Alibaba Cloud account at a time: 50</li>
     * <li>The maximum number of IP entries that each network ACL can contain: 300</li>
     * </ul>
     * 
     * @param request the request parameters of AddAccessControlListEntry  AddAccessControlListEntryRequest
     * @return AddAccessControlListEntryResponse
     */
    CompletableFuture<AddAccessControlListEntryResponse> addAccessControlListEntry(AddAccessControlListEntryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If multiple identical Elastic Compute Service (ECS) instances are specified in a request, only the first ECS instance is added. The other ECS instances are ignored. If the backend server that you add is the same as one of the existing backend servers that are already associated with the listener, an error message is returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AddBackendServers  AddBackendServersRequest
     * @return AddBackendServersResponse
     */
    CompletableFuture<AddBackendServersResponse> addBackendServers(AddBackendServersRequest request);

    /**
     * @param request the request parameters of AddListenerWhiteListItem  AddListenerWhiteListItemRequest
     * @return AddListenerWhiteListItemResponse
     */
    CompletableFuture<AddListenerWhiteListItemResponse> addListenerWhiteListItem(AddListenerWhiteListItemRequest request);

    /**
     * <b>description</b> :
     * <h1>Limits</h1>
     * <p>Before you call this API, note the following limits:</p>
     * <ul>
     * <li>You can add up to 10 tags to each SLB instance.</li>
     * <li>You can add up to five pairs of tags at a time.</li>
     * <li>All the tags and keys added to an SLB instance must be unique.</li>
     * <li>If you add a tag of which the key is the same as that of an existing tag, but the value is different, the new tag overwrites the existing one.</li>
     * </ul>
     * 
     * @param request the request parameters of AddTags  AddTagsRequest
     * @return AddTagsResponse
     */
    CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request);

    /**
     * @param request the request parameters of AddVServerGroupBackendServers  AddVServerGroupBackendServersRequest
     * @return AddVServerGroupBackendServersResponse
     */
    CompletableFuture<AddVServerGroupBackendServersResponse> addVServerGroupBackendServers(AddVServerGroupBackendServersRequest request);

    /**
     * <b>description</b> :
     * <p>You can create multiple ACLs. Each ACL can contain one or more IP addresses or CIDR blocks. Before you create an ACL, take note of the following limits:</p>
     * <ul>
     * <li>An account can have a maximum of 50 ACLs in each region.</li>
     * <li>You can add a maximum of 50 IP addresses or CIDR blocks at a time within an account.</li>
     * <li>Each ACL can contain a maximum of 300 IP addresses or CIDR blocks.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAccessControlList  CreateAccessControlListRequest
     * @return CreateAccessControlListResponse
     */
    CompletableFuture<CreateAccessControlListResponse> createAccessControlList(CreateAccessControlListRequest request);

    /**
     * @param request the request parameters of CreateDomainExtension  CreateDomainExtensionRequest
     * @return CreateDomainExtensionResponse
     */
    CompletableFuture<CreateDomainExtensionResponse> createDomainExtension(CreateDomainExtensionRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you create a CLB instance, call the <a href="~~DescribeAvailableResource~~">DescribeAvailableResource</a> operation to query the resources available for purchase in the region where you want to create the CLB instance.</p>
     * <ul>
     * <li>After a CLB instance is created, you are charged for using the CLB instance.</li>
     * <li>The pay-as-you-go billing method supports the pay-by-specification and pay-by-LCU metering methods.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <p>A newly created listener is in the <strong>stopped</strong> state. After a listener is created, you can call the <a href="~~StartLoadBalancerListener~~">StartLoadBalancerListener</a> operation to start the listener. After the listener is started, the listener can forward traffic to backend servers.</p>
     * <h2>Prerequisites</h2>
     * <p>A Classic Load Balancer (CLB) instance is created. For more information, see <a href="~~StartLoadBalancerListener~~">CreateLoadBalancer</a>.</p>
     * 
     * @param request the request parameters of CreateLoadBalancerHTTPListener  CreateLoadBalancerHTTPListenerRequest
     * @return CreateLoadBalancerHTTPListenerResponse
     */
    CompletableFuture<CreateLoadBalancerHTTPListenerResponse> createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request);

    /**
     * <b>description</b> :
     * <p>A newly created listener is in the <strong>stopped</strong> state. After a listener is created, you can call the <a href="https://help.aliyun.com/document_detail/27597.html">StartLoadBalancerListener</a> operation to start the listener. After the listener is started, the listener can forward traffic to backend servers.</p>
     * <h2>Prerequisites</h2>
     * <p>A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://www.alibabacloud.com/help/en/server-load-balancer/latest/createloadbalancer-2">CreateLoadBalancer</a>.</p>
     * 
     * @param request the request parameters of CreateLoadBalancerHTTPSListener  CreateLoadBalancerHTTPSListenerRequest
     * @return CreateLoadBalancerHTTPSListenerResponse
     */
    CompletableFuture<CreateLoadBalancerHTTPSListenerResponse> createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A newly created listener is in the <strong>stopped</strong> state. After a listener is created, you can call the <a href="https://help.aliyun.com/document_detail/27597.html">StartLoadBalancerListener</a> operation to enable the listener to forward traffic to backend servers.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLoadBalancerTCPListener  CreateLoadBalancerTCPListenerRequest
     * @return CreateLoadBalancerTCPListenerResponse
     */
    CompletableFuture<CreateLoadBalancerTCPListenerResponse> createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request);

    /**
     * <b>description</b> :
     * <p>UDP listeners of Classic Load Balancer (CLB) instances in a classic network cannot pass client IP addresses to backend servers.</p>
     * <blockquote>
     * <p> A newly created listener is in the <strong>stopped</strong> state. After a listener is created, you can call the <a href="https://help.aliyun.com/document_detail/27597.html">StartLoadBalancerListener</a> operation to enable the listener to forward traffic to backend servers.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateLoadBalancerUDPListener  CreateLoadBalancerUDPListenerRequest
     * @return CreateLoadBalancerUDPListenerResponse
     */
    CompletableFuture<CreateLoadBalancerUDPListenerResponse> createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request);

    /**
     * @param request the request parameters of CreateMasterSlaveServerGroup  CreateMasterSlaveServerGroupRequest
     * @return CreateMasterSlaveServerGroupResponse
     */
    CompletableFuture<CreateMasterSlaveServerGroupResponse> createMasterSlaveServerGroup(CreateMasterSlaveServerGroupRequest request);

    /**
     * @param request the request parameters of CreateRules  CreateRulesRequest
     * @return CreateRulesResponse
     */
    CompletableFuture<CreateRulesResponse> createRules(CreateRulesRequest request);

    /**
     * @param request the request parameters of CreateTLSCipherPolicy  CreateTLSCipherPolicyRequest
     * @return CreateTLSCipherPolicyResponse
     */
    CompletableFuture<CreateTLSCipherPolicyResponse> createTLSCipherPolicy(CreateTLSCipherPolicyRequest request);

    /**
     * @param request the request parameters of CreateVServerGroup  CreateVServerGroupRequest
     * @return CreateVServerGroupResponse
     */
    CompletableFuture<CreateVServerGroupResponse> createVServerGroup(CreateVServerGroupRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete an ACL only if it is not associated with a listener.</p>
     * 
     * @param request the request parameters of DeleteAccessControlList  DeleteAccessControlListRequest
     * @return DeleteAccessControlListResponse
     */
    CompletableFuture<DeleteAccessControlListResponse> deleteAccessControlList(DeleteAccessControlListRequest request);

    /**
     * @param request the request parameters of DeleteAccessLogsDownloadAttribute  DeleteAccessLogsDownloadAttributeRequest
     * @return DeleteAccessLogsDownloadAttributeResponse
     */
    CompletableFuture<DeleteAccessLogsDownloadAttributeResponse> deleteAccessLogsDownloadAttribute(DeleteAccessLogsDownloadAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot delete a CA certificate that is in use.</p>
     * 
     * @param request the request parameters of DeleteCACertificate  DeleteCACertificateRequest
     * @return DeleteCACertificateResponse
     */
    CompletableFuture<DeleteCACertificateResponse> deleteCACertificate(DeleteCACertificateRequest request);

    /**
     * @param request the request parameters of DeleteDomainExtension  DeleteDomainExtensionRequest
     * @return DeleteDomainExtensionResponse
     */
    CompletableFuture<DeleteDomainExtensionResponse> deleteDomainExtension(DeleteDomainExtensionRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The listeners and tags of the SLB instance are deleted along with the SLB instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteLoadBalancer  DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can delete only listeners that are in the <strong>stopped</strong> or <strong>running</strong> state.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteLoadBalancerListener  DeleteLoadBalancerListenerRequest
     * @return DeleteLoadBalancerListenerResponse
     */
    CompletableFuture<DeleteLoadBalancerListenerResponse> deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request);

    /**
     * @param request the request parameters of DeleteMasterSlaveServerGroup  DeleteMasterSlaveServerGroupRequest
     * @return DeleteMasterSlaveServerGroupResponse
     */
    CompletableFuture<DeleteMasterSlaveServerGroupResponse> deleteMasterSlaveServerGroup(DeleteMasterSlaveServerGroupRequest request);

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>The RuleIds parameter is required. You can specify up to 10 forwarding rules in each request.</p>
     * 
     * @param request the request parameters of DeleteRules  DeleteRulesRequest
     * @return DeleteRulesResponse
     */
    CompletableFuture<DeleteRulesResponse> deleteRules(DeleteRulesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot delete server certificates that are in use.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteServerCertificate  DeleteServerCertificateRequest
     * @return DeleteServerCertificateResponse
     */
    CompletableFuture<DeleteServerCertificateResponse> deleteServerCertificate(DeleteServerCertificateRequest request);

    /**
     * <b>description</b> :
     * <h2>Debugging</h2>
     * <p><a href="https://api.aliyun.com/#product=Slb%5C&api=DeleteTLSCipherPolicy%5C&type=RPC%5C&version=2014-05-15">OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code of the operation for different SDKs.</a></p>
     * 
     * @param request the request parameters of DeleteTLSCipherPolicy  DeleteTLSCipherPolicyRequest
     * @return DeleteTLSCipherPolicyResponse
     */
    CompletableFuture<DeleteTLSCipherPolicyResponse> deleteTLSCipherPolicy(DeleteTLSCipherPolicyRequest request);

    /**
     * @param request the request parameters of DeleteVServerGroup  DeleteVServerGroupRequest
     * @return DeleteVServerGroupResponse
     */
    CompletableFuture<DeleteVServerGroupResponse> deleteVServerGroup(DeleteVServerGroupRequest request);

    /**
     * @param request the request parameters of DescribeAccessControlListAttribute  DescribeAccessControlListAttributeRequest
     * @return DescribeAccessControlListAttributeResponse
     */
    CompletableFuture<DescribeAccessControlListAttributeResponse> describeAccessControlListAttribute(DescribeAccessControlListAttributeRequest request);

    /**
     * @param request the request parameters of DescribeAccessControlLists  DescribeAccessControlListsRequest
     * @return DescribeAccessControlListsResponse
     */
    CompletableFuture<DescribeAccessControlListsResponse> describeAccessControlLists(DescribeAccessControlListsRequest request);

    /**
     * @param request the request parameters of DescribeAccessLogsDownloadAttribute  DescribeAccessLogsDownloadAttributeRequest
     * @return DescribeAccessLogsDownloadAttributeResponse
     */
    CompletableFuture<DescribeAccessLogsDownloadAttributeResponse> describeAccessLogsDownloadAttribute(DescribeAccessLogsDownloadAttributeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Only the available resources and zones are returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
     */
    CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>To ensure data confidentiality, only the certificate fingerprint and name are returned. The certificate content is not returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeCACertificates  DescribeCACertificatesRequest
     * @return DescribeCACertificatesResponse
     */
    CompletableFuture<DescribeCACertificatesResponse> describeCACertificates(DescribeCACertificatesRequest request);

    /**
     * @param request the request parameters of DescribeDomainExtensionAttribute  DescribeDomainExtensionAttributeRequest
     * @return DescribeDomainExtensionAttributeResponse
     */
    CompletableFuture<DescribeDomainExtensionAttributeResponse> describeDomainExtensionAttribute(DescribeDomainExtensionAttributeRequest request);

    /**
     * @param request the request parameters of DescribeDomainExtensions  DescribeDomainExtensionsRequest
     * @return DescribeDomainExtensionsResponse
     */
    CompletableFuture<DescribeDomainExtensionsResponse> describeDomainExtensions(DescribeDomainExtensionsRequest request);

    /**
     * @param request the request parameters of DescribeHealthStatus  DescribeHealthStatusRequest
     * @return DescribeHealthStatusResponse
     */
    CompletableFuture<DescribeHealthStatusResponse> describeHealthStatus(DescribeHealthStatusRequest request);

    /**
     * @param request the request parameters of DescribeHighDefinationMonitor  DescribeHighDefinationMonitorRequest
     * @return DescribeHighDefinationMonitorResponse
     */
    CompletableFuture<DescribeHighDefinationMonitorResponse> describeHighDefinationMonitor(DescribeHighDefinationMonitorRequest request);

    /**
     * @param request the request parameters of DescribeListenerAccessControlAttribute  DescribeListenerAccessControlAttributeRequest
     * @return DescribeListenerAccessControlAttributeResponse
     */
    CompletableFuture<DescribeListenerAccessControlAttributeResponse> describeListenerAccessControlAttribute(DescribeListenerAccessControlAttributeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If backend servers are deployed in a vServer group, you can call the <a href="https://help.aliyun.com/document_detail/35224.html">DescribeVServerGroupAttribute</a> operation to query the backend servers.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeLoadBalancerAttribute  DescribeLoadBalancerAttributeRequest
     * @return DescribeLoadBalancerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerAttributeResponse> describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/27577.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>An HTTP listener is created. For more information about how to create an HTTP listener, see <a href="https://help.aliyun.com/document_detail/27592.html">CreateLoadBalancerHTTPListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerHTTPListenerAttribute  DescribeLoadBalancerHTTPListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerHTTPListenerAttributeResponse> describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/27577.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>An HTTPS listener is created. For more information about how to create an HTTPS listener, see <a href="https://help.aliyun.com/document_detail/27593.html">CreateLoadBalancerHTTPSListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerHTTPSListenerAttribute  DescribeLoadBalancerHTTPSListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPSListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerHTTPSListenerAttributeResponse> describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  A CLB instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/2401685.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>One or more listeners are added to the CLB instance. For more information, see the following topics:<ul>
     * <li><a href="~~CreateLoadBalancerUDPListener~~">CreateLoadBalancerUDPListener</a></li>
     * <li><a href="~~CreateLoadBalancerTCPListener~~">CreateLoadBalancerTCPListener</a></li>
     * <li><a href="~~CreateLoadBalancerHTTPListener~~">CreateLoadBalancerHTTPListener</a></li>
     * <li><a href="~~CreateLoadBalancerHTTPSListener~~">CreateLoadBalancerHTTPSListener</a></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeLoadBalancerListeners  DescribeLoadBalancerListenersRequest
     * @return DescribeLoadBalancerListenersResponse
     */
    CompletableFuture<DescribeLoadBalancerListenersResponse> describeLoadBalancerListeners(DescribeLoadBalancerListenersRequest request);

    /**
     * @param request the request parameters of DescribeLoadBalancerTCPListenerAttribute  DescribeLoadBalancerTCPListenerAttributeRequest
     * @return DescribeLoadBalancerTCPListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerTCPListenerAttributeResponse> describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request);

    /**
     * @param request the request parameters of DescribeLoadBalancerUDPListenerAttribute  DescribeLoadBalancerUDPListenerAttributeRequest
     * @return DescribeLoadBalancerUDPListenerAttributeResponse
     */
    CompletableFuture<DescribeLoadBalancerUDPListenerAttributeResponse> describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request);

    /**
     * @param request the request parameters of DescribeLoadBalancers  DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     */
    CompletableFuture<DescribeLoadBalancersResponse> describeLoadBalancers(DescribeLoadBalancersRequest request);

    /**
     * @param request the request parameters of DescribeMasterSlaveServerGroupAttribute  DescribeMasterSlaveServerGroupAttributeRequest
     * @return DescribeMasterSlaveServerGroupAttributeResponse
     */
    CompletableFuture<DescribeMasterSlaveServerGroupAttributeResponse> describeMasterSlaveServerGroupAttribute(DescribeMasterSlaveServerGroupAttributeRequest request);

    /**
     * @param request the request parameters of DescribeMasterSlaveServerGroups  DescribeMasterSlaveServerGroupsRequest
     * @return DescribeMasterSlaveServerGroupsResponse
     */
    CompletableFuture<DescribeMasterSlaveServerGroupsResponse> describeMasterSlaveServerGroups(DescribeMasterSlaveServerGroupsRequest request);

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request);

    /**
     * @param request the request parameters of DescribeRuleAttribute  DescribeRuleAttributeRequest
     * @return DescribeRuleAttributeResponse
     */
    CompletableFuture<DescribeRuleAttributeResponse> describeRuleAttribute(DescribeRuleAttributeRequest request);

    /**
     * @param request the request parameters of DescribeRules  DescribeRulesRequest
     * @return DescribeRulesResponse
     */
    CompletableFuture<DescribeRulesResponse> describeRules(DescribeRulesRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> For security reasons, only the fingerprints and names of server certificates are returned. The content of server certificates and private keys is not returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeServerCertificates  DescribeServerCertificatesRequest
     * @return DescribeServerCertificatesResponse
     */
    CompletableFuture<DescribeServerCertificatesResponse> describeServerCertificates(DescribeServerCertificatesRequest request);

    /**
     * <b>description</b> :
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>The system queries tags based on the instance ID, tag key, and tag value specified by you.</li>
     * <li>If the logical relationship among the specified conditions is AND, only tags that match all the specified conditions are returned.</li>
     * <li>If the Tagkey parameter is specified and but Tagvalue parameter is not specified, all tags that contain the specified tag key are returned.</li>
     * <li>If you specify the Tagvalue parameter in a request, you must also specify the Tagkey parameter in the request.</li>
     * <li>If you specify both the Tagkey and Tagvalue parameters, only tags that contain the specified keys and values are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request);

    /**
     * @param request the request parameters of DescribeVServerGroupAttribute  DescribeVServerGroupAttributeRequest
     * @return DescribeVServerGroupAttributeResponse
     */
    CompletableFuture<DescribeVServerGroupAttributeResponse> describeVServerGroupAttribute(DescribeVServerGroupAttributeRequest request);

    /**
     * @param request the request parameters of DescribeVServerGroups  DescribeVServerGroupsRequest
     * @return DescribeVServerGroupsResponse
     */
    CompletableFuture<DescribeVServerGroupsResponse> describeVServerGroups(DescribeVServerGroupsRequest request);

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request);

    /**
     * @param request the request parameters of EnableHighDefinationMonitor  EnableHighDefinationMonitorRequest
     * @return EnableHighDefinationMonitorResponse
     */
    CompletableFuture<EnableHighDefinationMonitorResponse> enableHighDefinationMonitor(EnableHighDefinationMonitorRequest request);

    /**
     * @param request the request parameters of ListTLSCipherPolicies  ListTLSCipherPoliciesRequest
     * @return ListTLSCipherPoliciesResponse
     */
    CompletableFuture<ListTLSCipherPoliciesResponse> listTLSCipherPolicies(ListTLSCipherPoliciesRequest request);

    /**
     * <b>description</b> :
     * <p>  Set <strong>ResourceId.N</strong> or <strong>Tag.N</strong> that consists of <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> in the request to specify the object to be queried.</p>
     * <ul>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair. If you set only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified tag key are returned. If you set only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you set <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ModifyHighDefinationMonitor  ModifyHighDefinationMonitorRequest
     * @return ModifyHighDefinationMonitorResponse
     */
    CompletableFuture<ModifyHighDefinationMonitorResponse> modifyHighDefinationMonitor(ModifyHighDefinationMonitorRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>For pay-as-you-go CLB instances, you can only change the metering method from pay-by-specification to pay-by-LCU. You cannot change the metering method from pay-by-LCU to pay-by-specification.</li>
     * <li>This operation can change the metering method of only one instance at a time.</li>
     * </ul>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyLoadBalancerInstanceChargeType  ModifyLoadBalancerInstanceChargeTypeRequest
     * @return ModifyLoadBalancerInstanceChargeTypeResponse
     */
    CompletableFuture<ModifyLoadBalancerInstanceChargeTypeResponse> modifyLoadBalancerInstanceChargeType(ModifyLoadBalancerInstanceChargeTypeRequest request);

    /**
     * @param request the request parameters of ModifyLoadBalancerInstanceSpec  ModifyLoadBalancerInstanceSpecRequest
     * @return ModifyLoadBalancerInstanceSpecResponse
     */
    CompletableFuture<ModifyLoadBalancerInstanceSpecResponse> modifyLoadBalancerInstanceSpec(ModifyLoadBalancerInstanceSpecRequest request);

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <ul>
     * <li>If you modify only the maximum bandwidth of a pay-by-bandwidth CLB instance, the new bandwidth immediately takes effect.</li>
     * <li>If you modify the metering method (for example, switch from pay-by-bandwidth to pay-by-data-transfer), the new metering method and the other changes specified in the operation take effect at 00:00:00 the next day.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyLoadBalancerInternetSpec  ModifyLoadBalancerInternetSpecRequest
     * @return ModifyLoadBalancerInternetSpecResponse
     */
    CompletableFuture<ModifyLoadBalancerInternetSpecResponse> modifyLoadBalancerInternetSpec(ModifyLoadBalancerInternetSpecRequest request);

    /**
     * @deprecated OpenAPI ModifyLoadBalancerPayType is deprecated  * @param request  the request parameters of ModifyLoadBalancerPayType  ModifyLoadBalancerPayTypeRequest
     * @return ModifyLoadBalancerPayTypeResponse
     */
    @Deprecated
    CompletableFuture<ModifyLoadBalancerPayTypeResponse> modifyLoadBalancerPayType(ModifyLoadBalancerPayTypeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can be used only to replace backend servers in a vServer group. To modify the attributes of backend servers, such as weights, call the <a href="https://help.aliyun.com/document_detail/35217.html">SetVServerGroupAttribute</a> operation.</p>
     * 
     * @param request the request parameters of ModifyVServerGroupBackendServers  ModifyVServerGroupBackendServersRequest
     * @return ModifyVServerGroupBackendServersResponse
     */
    CompletableFuture<ModifyVServerGroupBackendServersResponse> modifyVServerGroupBackendServers(ModifyVServerGroupBackendServersRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * @param request the request parameters of RemoveAccessControlListEntry  RemoveAccessControlListEntryRequest
     * @return RemoveAccessControlListEntryResponse
     */
    CompletableFuture<RemoveAccessControlListEntryResponse> removeAccessControlListEntry(RemoveAccessControlListEntryRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If the backend servers that you want to remove are not in the server list of the Classic Load Balancer (CLB) instance, the request fails. However, the system does not report an error.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemoveBackendServers  RemoveBackendServersRequest
     * @return RemoveBackendServersResponse
     */
    CompletableFuture<RemoveBackendServersResponse> removeBackendServers(RemoveBackendServersRequest request);

    /**
     * @param request the request parameters of RemoveListenerWhiteListItem  RemoveListenerWhiteListItemRequest
     * @return RemoveListenerWhiteListItemResponse
     */
    CompletableFuture<RemoveListenerWhiteListItemResponse> removeListenerWhiteListItem(RemoveListenerWhiteListItemRequest request);

    /**
     * @param request the request parameters of RemoveTags  RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If the backend servers specified by the <strong>BackendServers</strong> parameter do not exist in the vServer group, the backend servers are ignored. No error message is returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of RemoveVServerGroupBackendServers  RemoveVServerGroupBackendServersRequest
     * @return RemoveVServerGroupBackendServersResponse
     */
    CompletableFuture<RemoveVServerGroupBackendServersResponse> removeVServerGroupBackendServers(RemoveVServerGroupBackendServersRequest request);

    /**
     * @param request the request parameters of SetAccessControlListAttribute  SetAccessControlListAttributeRequest
     * @return SetAccessControlListAttributeResponse
     */
    CompletableFuture<SetAccessControlListAttributeResponse> setAccessControlListAttribute(SetAccessControlListAttributeRequest request);

    /**
     * @param request the request parameters of SetAccessLogsDownloadAttribute  SetAccessLogsDownloadAttributeRequest
     * @return SetAccessLogsDownloadAttributeResponse
     */
    CompletableFuture<SetAccessLogsDownloadAttributeResponse> setAccessLogsDownloadAttribute(SetAccessLogsDownloadAttributeRequest request);

    /**
     * @param request the request parameters of SetBackendServers  SetBackendServersRequest
     * @return SetBackendServersResponse
     */
    CompletableFuture<SetBackendServersResponse> setBackendServers(SetBackendServersRequest request);

    /**
     * @param request the request parameters of SetCACertificateName  SetCACertificateNameRequest
     * @return SetCACertificateNameResponse
     */
    CompletableFuture<SetCACertificateNameResponse> setCACertificateName(SetCACertificateNameRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot replace an additional certificate for a listener that is added to a shared-resource Server Load Balancer (SLB) instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of SetDomainExtensionAttribute  SetDomainExtensionAttributeRequest
     * @return SetDomainExtensionAttributeResponse
     */
    CompletableFuture<SetDomainExtensionAttributeResponse> setDomainExtensionAttribute(SetDomainExtensionAttributeRequest request);

    /**
     * @param request the request parameters of SetListenerAccessControlStatus  SetListenerAccessControlStatusRequest
     * @return SetListenerAccessControlStatusResponse
     */
    CompletableFuture<SetListenerAccessControlStatusResponse> setListenerAccessControlStatus(SetListenerAccessControlStatusRequest request);

    /**
     * @param request the request parameters of SetLoadBalancerDeleteProtection  SetLoadBalancerDeleteProtectionRequest
     * @return SetLoadBalancerDeleteProtectionResponse
     */
    CompletableFuture<SetLoadBalancerDeleteProtectionResponse> setLoadBalancerDeleteProtection(SetLoadBalancerDeleteProtectionRequest request);

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <ul>
     * <li>A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/27577.html">CreateLoadBalancer</a>.</li>
     * <li>An HTTP listener is created. For more information about how to create an HTTP listener, see <a href="https://help.aliyun.com/document_detail/27592.html">CreateLoadBalancerHTTPListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerHTTPListenerAttribute  SetLoadBalancerHTTPListenerAttributeRequest
     * @return SetLoadBalancerHTTPListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerHTTPListenerAttributeResponse> setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/27577.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>An HTTPS listener is created. For more information about how to create an HTTPS listener, see <a href="https://help.aliyun.com/document_detail/27593.html">CreateLoadBalancerHTTPSListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerHTTPSListenerAttribute  SetLoadBalancerHTTPSListenerAttributeRequest
     * @return SetLoadBalancerHTTPSListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerHTTPSListenerAttributeResponse> setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request);

    /**
     * @param request the request parameters of SetLoadBalancerModificationProtection  SetLoadBalancerModificationProtectionRequest
     * @return SetLoadBalancerModificationProtectionResponse
     */
    CompletableFuture<SetLoadBalancerModificationProtectionResponse> setLoadBalancerModificationProtection(SetLoadBalancerModificationProtectionRequest request);

    /**
     * @param request the request parameters of SetLoadBalancerName  SetLoadBalancerNameRequest
     * @return SetLoadBalancerNameResponse
     */
    CompletableFuture<SetLoadBalancerNameResponse> setLoadBalancerName(SetLoadBalancerNameRequest request);

    /**
     * @param request the request parameters of SetLoadBalancerStatus  SetLoadBalancerStatusRequest
     * @return SetLoadBalancerStatusResponse
     */
    CompletableFuture<SetLoadBalancerStatusResponse> setLoadBalancerStatus(SetLoadBalancerStatusRequest request);

    /**
     * <b>description</b> :
     * <p>  A CLB instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/2401685.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>A TCP listener is created. For more information, see <a href="~~CreateLoadBalancerTCPListener~~">CreateLoadBalancerTCPListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerTCPListenerAttribute  SetLoadBalancerTCPListenerAttributeRequest
     * @return SetLoadBalancerTCPListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerTCPListenerAttributeResponse> setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  A Classic Load Balancer (CLB) instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/27577.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>A UDP listener is created. For more information, see <a href="https://help.aliyun.com/document_detail/27595.html">CreateLoadBalancerUDPListener</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of SetLoadBalancerUDPListenerAttribute  SetLoadBalancerUDPListenerAttributeRequest
     * @return SetLoadBalancerUDPListenerAttributeResponse
     */
    CompletableFuture<SetLoadBalancerUDPListenerAttributeResponse> setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request);

    /**
     * @param request the request parameters of SetRule  SetRuleRequest
     * @return SetRuleResponse
     */
    CompletableFuture<SetRuleResponse> setRule(SetRuleRequest request);

    /**
     * @param request the request parameters of SetServerCertificateName  SetServerCertificateNameRequest
     * @return SetServerCertificateNameResponse
     */
    CompletableFuture<SetServerCertificateNameResponse> setServerCertificateName(SetServerCertificateNameRequest request);

    /**
     * @param request the request parameters of SetTLSCipherPolicyAttribute  SetTLSCipherPolicyAttributeRequest
     * @return SetTLSCipherPolicyAttributeResponse
     */
    CompletableFuture<SetTLSCipherPolicyAttributeResponse> setTLSCipherPolicyAttribute(SetTLSCipherPolicyAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>This operation can be used to modify the weights of backend servers and names of vServer groups.</p>
     * <ul>
     * <li>If you want to modify backend servers in a specified vServer group, call the <a href="https://help.aliyun.com/document_detail/35220.html">ModifyVServerGroupBackendServers</a> operation.</li>
     * <li>If you want to add backend servers to a specified vServer group, call the <a href="https://help.aliyun.com/document_detail/35218.html">AddVServerGroupBackendServers</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of SetVServerGroupAttribute  SetVServerGroupAttributeRequest
     * @return SetVServerGroupAttributeResponse
     */
    CompletableFuture<SetVServerGroupAttributeResponse> setVServerGroupAttribute(SetVServerGroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can call the operation only when the listener is in the Stopped state.</li>
     * <li>If the operation is successful, the listener switches to the Starting state.</li>
     * <li>You cannot perform this operation when the Classic Load Balancer (CLB) instance to which the listener belongs is in the Locked state.</li>
     * </ul>
     * 
     * @param request the request parameters of StartLoadBalancerListener  StartLoadBalancerListenerRequest
     * @return StartLoadBalancerListenerResponse
     */
    CompletableFuture<StartLoadBalancerListenerResponse> startLoadBalancerListener(StartLoadBalancerListenerRequest request);

    /**
     * <b>description</b> :
     * <p>Before you make this API call, note the following:</p>
     * <ul>
     * <li>After the API call is successfully made, the listener enters the stopped state.</li>
     * <li>If the Server Load Balancer (SLB) instance to which the listener to be stopped belongs is in the locked state, this API call cannot be made.<blockquote>
     * <p> If you stop the listener, your services will be disrupted. Exercise caution when you perform this action.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of StopLoadBalancerListener  StopLoadBalancerListenerRequest
     * @return StopLoadBalancerListenerResponse
     */
    CompletableFuture<StopLoadBalancerListenerResponse> stopLoadBalancerListener(StopLoadBalancerListenerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can add at most 20 tags to each instance. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number is reached, an error message is returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>You can upload only one CA certificate at a time. After a CA certificate is uploaded, the certificate ID, name, and fingerprint are returned.</p>
     * 
     * @param request the request parameters of UploadCACertificate  UploadCACertificateRequest
     * @return UploadCACertificateResponse
     */
    CompletableFuture<UploadCACertificateResponse> uploadCACertificate(UploadCACertificateRequest request);

    /**
     * <b>description</b> :
     * <p>  You can upload only one server certificate and its private key in each call.</p>
     * <ul>
     * <li>After a server certificate and its private key are uploaded, the fingerprints of all server certificates that belong to your Alibaba Cloud account are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of UploadServerCertificate  UploadServerCertificateRequest
     * @return UploadServerCertificateResponse
     */
    CompletableFuture<UploadServerCertificateResponse> uploadServerCertificate(UploadServerCertificateRequest request);

}
