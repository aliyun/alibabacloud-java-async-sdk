// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.nlb20220430.models.*;
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
     * @param request the request parameters of AddServersToServerGroup  AddServersToServerGroupRequest
     * @return AddServersToServerGroupResponse
     */
    CompletableFuture<AddServersToServerGroupResponse> addServersToServerGroup(AddServersToServerGroupRequest request);

    /**
     * <b>description</b> :
     * <p><em>AssociateAdditionalCertificatesWithListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/615175.html">ListListenerCertificates</a> operation to query the status of the task:</p>
     * <ul>
     * <li>If the listener is in the <strong>Associating</strong> state, the additional certificates are being associated.</li>
     * <li>If the listener is in the <strong>Associated</strong> state, the additional certificates are associated.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateAdditionalCertificatesWithListener  AssociateAdditionalCertificatesWithListenerRequest
     * @return AssociateAdditionalCertificatesWithListenerResponse
     */
    CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request);

    /**
     * @param request the request parameters of AttachCommonBandwidthPackageToLoadBalancer  AttachCommonBandwidthPackageToLoadBalancerRequest
     * @return AttachCommonBandwidthPackageToLoadBalancerResponse
     */
    CompletableFuture<AttachCommonBandwidthPackageToLoadBalancerResponse> attachCommonBandwidthPackageToLoadBalancer(AttachCommonBandwidthPackageToLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <p>Before you call this operation, the zone of the Network Load Balancer (NLB) instance is removed from the DNS record by using the console or calling the <a href="https://help.aliyun.com/document_detail/2411999.html">StartShiftLoadBalancerZones</a> API operation.</p>
     * 
     * @param request the request parameters of CancelShiftLoadBalancerZones  CancelShiftLoadBalancerZonesRequest
     * @return CancelShiftLoadBalancerZonesResponse
     */
    CompletableFuture<CancelShiftLoadBalancerZonesResponse> cancelShiftLoadBalancerZones(CancelShiftLoadBalancerZonesRequest request);

    /**
     * @param request the request parameters of CreateListener  CreateListenerRequest
     * @return CreateListenerResponse
     */
    CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request);

    /**
     * <b>description</b> :
     * <p>  When you create an NLB instance, the service-linked role AliyunServiceRoleForNlb is automatically created and assigned to you.</p>
     * <ul>
     * <li><strong>CreateLoadBalancer</strong> is an asynchronous operation. After you send a request, the system returns an instance ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/445873.html">GetLoadBalancerAttribute</a> to query the status of an NLB instance.<ul>
     * <li>If an NLB instance is in the <strong>Provisioning</strong> state, the NLB instance is being created.</li>
     * <li>If an NLB instance is in the <strong>Active</strong> state, the NLB instance is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
     * @param request the request parameters of CreateSecurityPolicy  CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     */
    CompletableFuture<CreateSecurityPolicyResponse> createSecurityPolicy(CreateSecurityPolicyRequest request);

    /**
     * <b>description</b> :
     * <p><em>CreateServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/445904.html">GetJobStatus</a> operation to query the creation status of the task.</p>
     * <ul>
     * <li>If the task is in the <strong>Succeeded</strong> status, the server group is created.</li>
     * <li>If the task is in the <strong>Processing</strong> status, the server group is being created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateServerGroup  CreateServerGroupRequest
     * @return CreateServerGroupResponse
     */
    CompletableFuture<CreateServerGroupResponse> createServerGroup(CreateServerGroupRequest request);

    /**
     * @param request the request parameters of DeleteListener  DeleteListenerRequest
     * @return DeleteListenerResponse
     */
    CompletableFuture<DeleteListenerResponse> deleteListener(DeleteListenerRequest request);

    /**
     * @param request the request parameters of DeleteLoadBalancer  DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request);

    /**
     * @param request the request parameters of DeleteSecurityPolicy  DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     */
    CompletableFuture<DeleteSecurityPolicyResponse> deleteSecurityPolicy(DeleteSecurityPolicyRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete server groups that are not associated with listeners.</p>
     * 
     * @param request the request parameters of DeleteServerGroup  DeleteServerGroupRequest
     * @return DeleteServerGroupResponse
     */
    CompletableFuture<DeleteServerGroupResponse> deleteServerGroup(DeleteServerGroupRequest request);

    /**
     * @param request the request parameters of DescribeHdMonitorRegionConfig  DescribeHdMonitorRegionConfigRequest
     * @return DescribeHdMonitorRegionConfigResponse
     */
    CompletableFuture<DescribeHdMonitorRegionConfigResponse> describeHdMonitorRegionConfig(DescribeHdMonitorRegionConfigRequest request);

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
     * @param request the request parameters of DetachCommonBandwidthPackageFromLoadBalancer  DetachCommonBandwidthPackageFromLoadBalancerRequest
     * @return DetachCommonBandwidthPackageFromLoadBalancerResponse
     */
    CompletableFuture<DetachCommonBandwidthPackageFromLoadBalancerResponse> detachCommonBandwidthPackageFromLoadBalancer(DetachCommonBandwidthPackageFromLoadBalancerRequest request);

    /**
     * @param request the request parameters of DisableLoadBalancerIpv6Internet  DisableLoadBalancerIpv6InternetRequest
     * @return DisableLoadBalancerIpv6InternetResponse
     */
    CompletableFuture<DisableLoadBalancerIpv6InternetResponse> disableLoadBalancerIpv6Internet(DisableLoadBalancerIpv6InternetRequest request);

    /**
     * <b>description</b> :
     * <p><em>DisassociateAdditionalCertificatesWithListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/615175.html">ListListenerCertificates</a> operation to query the status of the task:</p>
     * <ul>
     * <li>If an additional certificate is in the <strong>Dissociating</strong> state, the additional certificate is being disassociated.</li>
     * <li>If an additional certificate is in the <strong>Dissociated</strong> state, the additional certificate is disassociated.</li>
     * </ul>
     * 
     * @param request the request parameters of DisassociateAdditionalCertificatesWithListener  DisassociateAdditionalCertificatesWithListenerRequest
     * @return DisassociateAdditionalCertificatesWithListenerResponse
     */
    CompletableFuture<DisassociateAdditionalCertificatesWithListenerResponse> disassociateAdditionalCertificatesWithListener(DisassociateAdditionalCertificatesWithListenerRequest request);

    /**
     * @param request the request parameters of EnableLoadBalancerIpv6Internet  EnableLoadBalancerIpv6InternetRequest
     * @return EnableLoadBalancerIpv6InternetResponse
     */
    CompletableFuture<EnableLoadBalancerIpv6InternetResponse> enableLoadBalancerIpv6Internet(EnableLoadBalancerIpv6InternetRequest request);

    /**
     * @param request the request parameters of GetJobStatus  GetJobStatusRequest
     * @return GetJobStatusResponse
     */
    CompletableFuture<GetJobStatusResponse> getJobStatus(GetJobStatusRequest request);

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
     * @param request the request parameters of ListSecurityPolicy  ListSecurityPolicyRequest
     * @return ListSecurityPolicyResponse
     */
    CompletableFuture<ListSecurityPolicyResponse> listSecurityPolicy(ListSecurityPolicyRequest request);

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
     * @param request the request parameters of ListSystemSecurityPolicy  ListSystemSecurityPolicyRequest
     * @return ListSystemSecurityPolicyResponse
     */
    CompletableFuture<ListSystemSecurityPolicyResponse> listSystemSecurityPolicy(ListSystemSecurityPolicyRequest request);

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * <b>description</b> :
     * <p>  Make sure that you have created a security group. For more information about how to create a security group, see <a href="https://help.aliyun.com/document_detail/25553.html">CreateSecurityGroup</a>.</p>
     * <ul>
     * <li>An NLB instance can be associated with up to four security groups.</li>
     * <li>You can query the security groups that are associated with an NLB instance by calling the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation.</li>
     * <li>LoadBalancerJoinSecurityGroup is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/445904.html">GetJobStatus</a> operation to query the status of a task.<ul>
     * <li>If the task is in the <strong>Succeeded</strong> state, the security group is associated.</li>
     * <li>If the task is in the <strong>Processing</strong> state, the security group is being associated. In this case, you can perform only query operations.</li>
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
     * <p>LoadBalancerLeaveSecurityGroup is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/445904.html">GetJobStatus</a> operation to query the status of a task.</p>
     * <ul>
     * <li>If the task is in the <strong>Succeeded</strong> state, the security group is disassociated.</li>
     * <li>If the task is in the <strong>Processing</strong> state, the security group is being disassociated. In this case, you can perform only query operations.</li>
     * </ul>
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
     * @param request the request parameters of RemoveServersFromServerGroup  RemoveServersFromServerGroupRequest
     * @return RemoveServersFromServerGroupResponse
     */
    CompletableFuture<RemoveServersFromServerGroupResponse> removeServersFromServerGroup(RemoveServersFromServerGroupRequest request);

    /**
     * <b>description</b> :
     * <p>This operation is used to configure a data warehouse for the fine-grained monitoring feature. If a listener in the current region has fine-grained monitoring enabled, you must disable fine-grained monitoring before you can configure a warehouse.</p>
     * 
     * @param request the request parameters of SetHdMonitorRegionConfig  SetHdMonitorRegionConfigRequest
     * @return SetHdMonitorRegionConfigResponse
     */
    CompletableFuture<SetHdMonitorRegionConfigResponse> setHdMonitorRegionConfig(SetHdMonitorRegionConfigRequest request);

    /**
     * @param request the request parameters of StartListener  StartListenerRequest
     * @return StartListenerResponse
     */
    CompletableFuture<StartListenerResponse> startListener(StartListenerRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If the NLB instance is deployed in only one zone, you cannot remove the EIP or VIP from the DNS record.</p>
     * </blockquote>
     * 
     * @param request the request parameters of StartShiftLoadBalancerZones  StartShiftLoadBalancerZonesRequest
     * @return StartShiftLoadBalancerZonesResponse
     */
    CompletableFuture<StartShiftLoadBalancerZonesResponse> startShiftLoadBalancerZones(StartShiftLoadBalancerZonesRequest request);

    /**
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
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request);

    /**
     * @param request the request parameters of UpdateListenerAttribute  UpdateListenerAttributeRequest
     * @return UpdateListenerAttributeResponse
     */
    CompletableFuture<UpdateListenerAttributeResponse> updateListenerAttribute(UpdateListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  Make sure that an NLB instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/445868.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/445873.html">GetLoadBalancerAttribute</a> operation to query the <strong>AddressType</strong> value of an NLB instance after you change the network type.</li>
     * <li><strong>UpdateLoadBalancerAddressTypeConfig</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/445904.html">GetJobStatus</a> operation to query the task status:<ul>
     * <li>If the task is in the <strong>Succeeded</strong> state, the network type of the IPv4 address of the NLB instance is changed.</li>
     * <li>If the task is in the <strong>Processing</strong> state, the network type of the IPv4 address of the NLB instance is being changed. In this case, you can perform only query operations.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerAddressTypeConfig  UpdateLoadBalancerAddressTypeConfigRequest
     * @return UpdateLoadBalancerAddressTypeConfigResponse
     */
    CompletableFuture<UpdateLoadBalancerAddressTypeConfigResponse> updateLoadBalancerAddressTypeConfig(UpdateLoadBalancerAddressTypeConfigRequest request);

    /**
     * @param request the request parameters of UpdateLoadBalancerAttribute  UpdateLoadBalancerAttributeRequest
     * @return UpdateLoadBalancerAttributeResponse
     */
    CompletableFuture<UpdateLoadBalancerAttributeResponse> updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/445873.html">GetLoadBalancerAttribute</a> operation to query the details about deletion protection and the configuration read-only mode.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateLoadBalancerProtection  UpdateLoadBalancerProtectionRequest
     * @return UpdateLoadBalancerProtectionResponse
     */
    CompletableFuture<UpdateLoadBalancerProtectionResponse> updateLoadBalancerProtection(UpdateLoadBalancerProtectionRequest request);

    /**
     * <b>description</b> :
     * <p>When you call this operation, make sure that you specify all the zones of the NLB instance, including the existing zones and new zones. If you do not specify the existing zones, the existing zones are removed.
     * Prerequisites</p>
     * <ul>
     * <li>An NLB instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/445868.html">CreateLoadBalancer</a>.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/445873.html">GetLoadBalancerAttribute</a> operation to query the zones and zone attributes of an NLB instance.</li>
     * <li><strong>UpdateLoadBalancerZones</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/445904.html">GetJobStatus</a> operation query to query the status of a task:<ul>
     * <li>If the task is in the <strong>Succeeded</strong> state, the zones and zone attributes are modified.</li>
     * <li>If the task is in the <strong>Processing</strong> state, the zones and zone attributes are being modified. In this case, you can perform only query operations.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerZones  UpdateLoadBalancerZonesRequest
     * @return UpdateLoadBalancerZonesResponse
     */
    CompletableFuture<UpdateLoadBalancerZonesResponse> updateLoadBalancerZones(UpdateLoadBalancerZonesRequest request);

    /**
     * @param request the request parameters of UpdateSecurityPolicyAttribute  UpdateSecurityPolicyAttributeRequest
     * @return UpdateSecurityPolicyAttributeResponse
     */
    CompletableFuture<UpdateSecurityPolicyAttributeResponse> updateSecurityPolicyAttribute(UpdateSecurityPolicyAttributeRequest request);

    /**
     * @param request the request parameters of UpdateServerGroupAttribute  UpdateServerGroupAttributeRequest
     * @return UpdateServerGroupAttributeResponse
     */
    CompletableFuture<UpdateServerGroupAttributeResponse> updateServerGroupAttribute(UpdateServerGroupAttributeRequest request);

    /**
     * <b>description</b> :
     * <p><em>UpdateServerGroupServersAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/445895.html">ListServerGroups</a> operation to query the status of a server group.<ul>
     * <li>If a server group is in the <strong>Configuring</strong> state, the server group is being modified.</li>
     * <li>If a server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * </li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/445896.html">ListServerGroupServers</a> operation to query the status of a backend server.<ul>
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
