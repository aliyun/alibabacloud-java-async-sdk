// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gwlb20240415;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.gwlb20240415.models.*;
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
     * <p><em>AddServersToServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the ListServerGroups operation to query the status of the server group.</li>
     * </ol>
     * <ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * <ol start="2">
     * <li>You can call the ListServerGroupServers operation to query the status of the backend server.</li>
     * </ol>
     * <ul>
     * <li>If the backend server is in the <strong>Adding</strong> state, the backend server is being added to the server group.</li>
     * <li>If the backend server is in the <strong>Available</strong> state, the server is running.</li>
     * </ul>
     * 
     * @param request the request parameters of AddServersToServerGroup  AddServersToServerGroupRequest
     * @return AddServersToServerGroupResponse
     */
    CompletableFuture<AddServersToServerGroupResponse> addServersToServerGroup(AddServersToServerGroupRequest request);

    /**
     * <b>description</b> :
     * <p><em>CreateListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>GetListenerAttribute</strong> operation to query the status of the task.</p>
     * <ul>
     * <li>If the listener is in the <strong>Provisioning</strong> state, the listener is being created.</li>
     * <li>If the listener is in the <strong>Running</strong> state, the listener is running.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateListener  CreateListenerRequest
     * @return CreateListenerResponse
     */
    CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request);

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/2806160.html">pricing</a> of GWLB before calling this operation</em>*.</p>
     * <ul>
     * <li>When you create a GWLB instance, the service-linked role AliyunServiceRoleForGwlb is automatically created.</li>
     * <li>CreateLoadBalancer is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the GetLoadBalancerAttribute operation to query the status of a GWLB instance.<ul>
     * <li>If the GWLB instance is in the Provisioning state, the GWLB instance is being created.</li>
     * <li>If the GWLB instance is in the Active state, the GWLB instance is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <p><em>CreateServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListServerGroups operation to query the status of the task.</p>
     * <ul>
     * <li>If the server group is in the <strong>Creating</strong> state, it indicates that the server group is being created.</li>
     * <li>If the server group is in the <strong>Available</strong> state, it indicates that the server group is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateServerGroup  CreateServerGroupRequest
     * @return CreateServerGroupResponse
     */
    CompletableFuture<CreateServerGroupResponse> createServerGroup(CreateServerGroupRequest request);

    /**
     * <b>description</b> :
     * <p><em>DeleteListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>GetListenerAttribute</strong> operation to query the status of the task.</p>
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
     * @param request the request parameters of DeleteLoadBalancer  DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request);

    /**
     * <b>description</b> :
     * <p>You can delete server groups that are not associated with listeners.</p>
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
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <p><em>RemoveServersFromServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the ListServerGroups operation to query the status of a server group.<ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * </li>
     * <li>You can call the ListServerGroupServers operation to query the status of a backend server.<ul>
     * <li>If the backend server is in the <strong>Removing</strong> state, the backend server is being removed from the server group.</li>
     * <li>If the backend server cannot be found, the backend server is no longer in the server group.<blockquote>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>If connection draining id enabled (<strong>ConnectionDrainEnabled</strong> set to true) for the server group of the backend server, the backend server that you remove enters the <strong>Removing</strong> state before entering the <strong>Draining</strong> state. When the connection draining timeout period (<strong>ConnectionDrainTimeout</strong>) ends, the backend server is removed from the server group.</li>
     * <li>You can add the backend server to the server group again before the connection draining timeout period ends. In this case, the status of the backend server changes from <strong>Draining</strong> to <strong>Adding</strong>. After the backend server is added to the server group, the backend server enters the <strong>Available</strong> state.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveServersFromServerGroup  RemoveServersFromServerGroupRequest
     * @return RemoveServersFromServerGroupResponse
     */
    CompletableFuture<RemoveServersFromServerGroupResponse> removeServersFromServerGroup(RemoveServersFromServerGroupRequest request);

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
     * <b>description</b> :
     * <p><em>UpdateListenerAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>GetListenerAttribute</strong> operation to query the status of a listener.</p>
     * <ul>
     * <li>If the listener is in the <strong>Configuring</strong> state, the listener is being modified.</li>
     * <li>If the listener is in the <strong>Running</strong> state, the listener is modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateListenerAttribute  UpdateListenerAttributeRequest
     * @return UpdateListenerAttributeResponse
     */
    CompletableFuture<UpdateListenerAttributeResponse> updateListenerAttribute(UpdateListenerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  UpdateLoadBalancerAttribute is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the GetLoadBalancerAttribute operation to query the status of the GWLB instance.
     *     *   If the GWLB instance is in the Configuring state, the GWLB instance is being modified.
     *     *   If the GWLB instance is in the Active state, the GWLB instance is modified.</p>
     * 
     * @param request the request parameters of UpdateLoadBalancerAttribute  UpdateLoadBalancerAttributeRequest
     * @return UpdateLoadBalancerAttributeResponse
     */
    CompletableFuture<UpdateLoadBalancerAttributeResponse> updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request);

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/2806160.html">pricing</a> of GWLB before calling this operation</em>*.
     * UpdateLoadBalancerZones is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the GetLoadBalancerAttribute operation to query the status of the GWLB instance.</p>
     * <ul>
     * <li>If the GWLB instance is in the Configuring state, the GWLB instance is being modified.</li>
     * <li>If the GWLB instance is in the Active state, the GWLB instance is modified.<blockquote>
     * <p> Before you call this operation, make sure that all zone parameters, including the current zones and the zones that you want to add, are specified. If you do not specify the current zones, the current zones are deleted. You can call the GetLoadBalancerAttribute operation to query the current zones of a GWLB instance.</p>
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
     * <p><em>UpdateServerGroupAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListServerGroups operation to query the status of the task.</p>
     * <ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the configuration of the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the configuration of the server group is modified.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateServerGroupAttribute  UpdateServerGroupAttributeRequest
     * @return UpdateServerGroupAttributeResponse
     */
    CompletableFuture<UpdateServerGroupAttributeResponse> updateServerGroupAttribute(UpdateServerGroupAttributeRequest request);

}
