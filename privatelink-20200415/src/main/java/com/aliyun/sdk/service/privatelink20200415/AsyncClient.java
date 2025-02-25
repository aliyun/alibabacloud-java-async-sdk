// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.privatelink20200415.models.*;
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
     * <p>  Before you add an account ID to the whitelist of an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AddUserToVpcEndpointService</strong> operation to add the ID of an Alibaba Cloud account to the whitelist of an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of AddUserToVpcEndpointService  AddUserToVpcEndpointServiceRequest
     * @return AddUserToVpcEndpointServiceResponse
     */
    CompletableFuture<AddUserToVpcEndpointServiceResponse> addUserToVpcEndpointService(AddUserToVpcEndpointServiceRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>AddZoneToVpcEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to query the state of the zone.
     *     *   If the zone is in the <strong>Creating</strong> state, the zone is being added.
     *     *   If the zone is in the Wait state, the zone is added.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AddZoneToVpcEndpoint</strong> operation to add a zone to an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of AddZoneToVpcEndpoint  AddZoneToVpcEndpointRequest
     * @return AddZoneToVpcEndpointResponse
     */
    CompletableFuture<AddZoneToVpcEndpointResponse> addZoneToVpcEndpoint(AddZoneToVpcEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you add a service resource to an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AttachResourceToVpcEndpointService</strong> operation to add a service resource to an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachResourceToVpcEndpointService  AttachResourceToVpcEndpointServiceRequest
     * @return AttachResourceToVpcEndpointServiceResponse
     */
    CompletableFuture<AttachResourceToVpcEndpointServiceResponse> attachResourceToVpcEndpointService(AttachResourceToVpcEndpointServiceRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>AttachSecurityGroupToVpcEndpoint</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183558.html">ListVpcEndpoints</a> operation to query the state of the endpoint.
     *     *   If the endpoint is in the <strong>Pending</strong> state, the endpoint is being associated with the security group.
     *     *   If the endpoint is in the <strong>Active</strong> state, the endpoint is associated with the security group.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AttachSecurityGroupToVpcEndpoint</strong> operation to associate an endpoint with a security group within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachSecurityGroupToVpcEndpoint  AttachSecurityGroupToVpcEndpointRequest
     * @return AttachSecurityGroupToVpcEndpointResponse
     */
    CompletableFuture<AttachSecurityGroupToVpcEndpointResponse> attachSecurityGroupToVpcEndpoint(AttachSecurityGroupToVpcEndpointRequest request);

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request);

    /**
     * @param request the request parameters of CheckProductOpen  CheckProductOpenRequest
     * @return CheckProductOpenResponse
     */
    CompletableFuture<CheckProductOpenResponse> checkProductOpen(CheckProductOpenRequest request);

    /**
     * <b>description</b> :
     * <p><em>CreateVpcEndpoint</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to check whether the endpoint is created.</p>
     * <ul>
     * <li>If the endpoint is in the <strong>Creating</strong> state, the endpoint is being created.</li>
     * <li>If the endpoint is in the <strong>Active</strong> state, the endpoint is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpcEndpoint  CreateVpcEndpointRequest
     * @return CreateVpcEndpointResponse
     */
    CompletableFuture<CreateVpcEndpointResponse> createVpcEndpoint(CreateVpcEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you create an endpoint service, make sure that you have created a Server Load Balancer (SLB) instance that supports PrivateLink. For more information, see <a href="https://help.aliyun.com/document_detail/174064.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li><strong>CreateVpcEndpointService</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and an instance ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183542.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.<ul>
     * <li>If the endpoint service is in the <strong>Creating</strong> state, the endpoint service is being created.</li>
     * <li>If the endpoint service is in the <strong>Active</strong> state, the endpoint service is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpcEndpointService  CreateVpcEndpointServiceRequest
     * @return CreateVpcEndpointServiceResponse
     */
    CompletableFuture<CreateVpcEndpointServiceResponse> createVpcEndpointService(CreateVpcEndpointServiceRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you delete an endpoint, you must delete the zones that are added to the endpoint.</p>
     * <ul>
     * <li><strong>DeleteVpcEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to check whether the endpoint is deleted.<ul>
     * <li>If the endpoint is in the <strong>Deleting</strong> state, the endpoint is being deleted.</li>
     * <li>If the endpoint cannot be queried, the endpoint is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVpcEndpoint  DeleteVpcEndpointRequest
     * @return DeleteVpcEndpointResponse
     */
    CompletableFuture<DeleteVpcEndpointResponse> deleteVpcEndpoint(DeleteVpcEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you delete an endpoint service, you must disconnect the endpoint from the endpoint service and remove the service resources.</p>
     * <ul>
     * <li><strong>DeleteVpcEndpointService</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183542.html">GetVpcEndpointServiceAttribute</a> operation to check whether the endpoint service is deleted.<ul>
     * <li>If the endpoint service is in the <strong>Deleting</strong> state, the endpoint service is being deleted.</li>
     * <li>If the endpoint service cannot be queried, the endpoint service is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteVpcEndpointService</strong> operation to delete an endpoint service that belongs to an Alibaba Cloud account within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVpcEndpointService  DeleteVpcEndpointServiceRequest
     * @return DeleteVpcEndpointServiceResponse
     */
    CompletableFuture<DeleteVpcEndpointServiceResponse> deleteVpcEndpointService(DeleteVpcEndpointServiceRequest request);

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
     * <p>  Before you remove a service resource from an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DetachResourceFromVpcEndpointService</strong> operation to remove a service resource from an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachResourceFromVpcEndpointService  DetachResourceFromVpcEndpointServiceRequest
     * @return DetachResourceFromVpcEndpointServiceResponse
     */
    CompletableFuture<DetachResourceFromVpcEndpointServiceResponse> detachResourceFromVpcEndpointService(DetachResourceFromVpcEndpointServiceRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DetachSecurityGroupFromVpcEndpoint</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183558.html">ListVpcEndpoints</a> to check whether the endpoint is disassociated from the security group.
     *     *   If the endpoint is in the <strong>Pending</strong> state, the endpoint is being disassociated from the security group.
     *     *   If you cannot query the endpoint in the security group, the endpoint is disassociated from the security group.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DetachSecurityGroupFromVpcEndpoint</strong> operation to disassociate an endpoint from a security group within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachSecurityGroupFromVpcEndpoint  DetachSecurityGroupFromVpcEndpointRequest
     * @return DetachSecurityGroupFromVpcEndpointResponse
     */
    CompletableFuture<DetachSecurityGroupFromVpcEndpointResponse> detachSecurityGroupFromVpcEndpoint(DetachSecurityGroupFromVpcEndpointRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>DisableVpcEndpointConnection</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to query the state of the endpoint connection.
     *     *   If the endpoint connection is in the <strong>Disconnecting</strong> state, the endpoint is being disconnected from the endpoint service.
     *     *   If the endpoint connection is in the <strong>Disconnected</strong> state, the endpoint is disconnected from the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DisableVpcEndpointConnection</strong> operation to allow an endpoint service to reject a connection request from an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableVpcEndpointConnection  DisableVpcEndpointConnectionRequest
     * @return DisableVpcEndpointConnectionResponse
     */
    CompletableFuture<DisableVpcEndpointConnectionResponse> disableVpcEndpointConnection(DisableVpcEndpointConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation only when the state of the endpoint is <strong>Connected</strong> and the state of the zone associated with the endpoint is <strong>Connected</strong> or <strong>Migrated</strong>.</p>
     * <ul>
     * <li><strong>DisableVpcEndpointZoneConnection</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to query the status of the task.<ul>
     * <li>If the zone is in the <strong>Disconnecting</strong> state, the task is running.</li>
     * <li>If the zone is in the <strong>Disconnected</strong> state, the task is successful.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DisableVpcEndpointZoneConnection</strong> operation to allow an endpoint service to reject a connection request from the endpoint in the zone within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DisableVpcEndpointZoneConnection  DisableVpcEndpointZoneConnectionRequest
     * @return DisableVpcEndpointZoneConnectionResponse
     */
    CompletableFuture<DisableVpcEndpointZoneConnectionResponse> disableVpcEndpointZoneConnection(DisableVpcEndpointZoneConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>EnableVpcEndpointConnection</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183568.html">GetVpcEndpointAttribute</a> operation to query the state of the endpoint connection.
     *     *   If the state is <strong>Connecting</strong>, the endpoint connection is being established.
     *     *   If the state is <strong>Connected</strong>, the endpoint connection is established.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>EnableVpcEndpointConnection</strong> operation to allow an endpoint service of an Alibaba Cloud account to accept a connection request from an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of EnableVpcEndpointConnection  EnableVpcEndpointConnectionRequest
     * @return EnableVpcEndpointConnectionResponse
     */
    CompletableFuture<EnableVpcEndpointConnectionResponse> enableVpcEndpointConnection(EnableVpcEndpointConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>  You can call this operation only when the state of the endpoint is <strong>Connected</strong> and the state of the associated zone is <strong>Disconnected</strong>.</p>
     * <ul>
     * <li><strong>EnableVpcEndpointZoneConnection</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to check whether the endpoint service accepts a connection request from the endpoint in the associated zone.<ul>
     * <li>If the zone is in the <strong>Connecting</strong> state, the endpoint service is accepting the connection request from the endpoint.</li>
     * <li>If the zone is in the <strong>Connected</strong> state, the endpoint service has accepted the connection request from the endpoint.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>EnableVpcEndpointZoneConnection</strong> operation to allow an endpoint service to accept a connection request from an endpoint in the associated zone within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of EnableVpcEndpointZoneConnection  EnableVpcEndpointZoneConnectionRequest
     * @return EnableVpcEndpointZoneConnectionResponse
     */
    CompletableFuture<EnableVpcEndpointZoneConnectionResponse> enableVpcEndpointZoneConnection(EnableVpcEndpointZoneConnectionRequest request);

    /**
     * @param request the request parameters of GetVpcEndpointAttribute  GetVpcEndpointAttributeRequest
     * @return GetVpcEndpointAttributeResponse
     */
    CompletableFuture<GetVpcEndpointAttributeResponse> getVpcEndpointAttribute(GetVpcEndpointAttributeRequest request);

    /**
     * @param request the request parameters of GetVpcEndpointServiceAttribute  GetVpcEndpointServiceAttributeRequest
     * @return GetVpcEndpointServiceAttributeResponse
     */
    CompletableFuture<GetVpcEndpointServiceAttributeResponse> getVpcEndpointServiceAttribute(GetVpcEndpointServiceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>  You must specify <strong>ResourceId.N</strong> or <strong>Tag.N</strong> in the request to specify the object that you want to query.</p>
     * <ul>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair (Tag.N.Key and Tag.N.Value). If you specify only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified key are returned. If you specify only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you specify <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListVpcEndpointConnections  ListVpcEndpointConnectionsRequest
     * @return ListVpcEndpointConnectionsResponse
     */
    CompletableFuture<ListVpcEndpointConnectionsResponse> listVpcEndpointConnections(ListVpcEndpointConnectionsRequest request);

    /**
     * @param request the request parameters of ListVpcEndpointSecurityGroups  ListVpcEndpointSecurityGroupsRequest
     * @return ListVpcEndpointSecurityGroupsResponse
     */
    CompletableFuture<ListVpcEndpointSecurityGroupsResponse> listVpcEndpointSecurityGroups(ListVpcEndpointSecurityGroupsRequest request);

    /**
     * @param request the request parameters of ListVpcEndpointServiceResources  ListVpcEndpointServiceResourcesRequest
     * @return ListVpcEndpointServiceResourcesResponse
     */
    CompletableFuture<ListVpcEndpointServiceResourcesResponse> listVpcEndpointServiceResources(ListVpcEndpointServiceResourcesRequest request);

    /**
     * @param request the request parameters of ListVpcEndpointServiceUsers  ListVpcEndpointServiceUsersRequest
     * @return ListVpcEndpointServiceUsersResponse
     */
    CompletableFuture<ListVpcEndpointServiceUsersResponse> listVpcEndpointServiceUsers(ListVpcEndpointServiceUsersRequest request);

    /**
     * @param request the request parameters of ListVpcEndpointServices  ListVpcEndpointServicesRequest
     * @return ListVpcEndpointServicesResponse
     */
    CompletableFuture<ListVpcEndpointServicesResponse> listVpcEndpointServices(ListVpcEndpointServicesRequest request);

    /**
     * @param request the request parameters of ListVpcEndpointServicesByEndUser  ListVpcEndpointServicesByEndUserRequest
     * @return ListVpcEndpointServicesByEndUserResponse
     */
    CompletableFuture<ListVpcEndpointServicesByEndUserResponse> listVpcEndpointServicesByEndUser(ListVpcEndpointServicesByEndUserRequest request);

    /**
     * @param request the request parameters of ListVpcEndpointZones  ListVpcEndpointZonesRequest
     * @return ListVpcEndpointZonesResponse
     */
    CompletableFuture<ListVpcEndpointZonesResponse> listVpcEndpointZones(ListVpcEndpointZonesRequest request);

    /**
     * @param request the request parameters of ListVpcEndpoints  ListVpcEndpointsRequest
     * @return ListVpcEndpointsResponse
     */
    CompletableFuture<ListVpcEndpointsResponse> listVpcEndpoints(ListVpcEndpointsRequest request);

    /**
     * @param request the request parameters of OpenPrivateLinkService  OpenPrivateLinkServiceRequest
     * @return OpenPrivateLinkServiceResponse
     */
    CompletableFuture<OpenPrivateLinkServiceResponse> openPrivateLinkService(OpenPrivateLinkServiceRequest request);

    /**
     * <b>description</b> :
     * <p>  Before you remove an account ID from the whitelist of an endpoint service, make sure that the endpoint service is in the <strong>Active</strong> state. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to query the status of the endpoint service.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>RemoveUserFromVpcEndpointService</strong> operation to remove the ID of an Alibaba Cloud account from the whitelist of an endpoint service within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveUserFromVpcEndpointService  RemoveUserFromVpcEndpointServiceRequest
     * @return RemoveUserFromVpcEndpointServiceResponse
     */
    CompletableFuture<RemoveUserFromVpcEndpointServiceResponse> removeUserFromVpcEndpointService(RemoveUserFromVpcEndpointServiceRequest request);

    /**
     * <b>description</b> :
     * <p>  <strong>RemoveZoneFromVpcEndpoint</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/183560.html">ListVpcEndpointZones</a> operation to check whether the zone of the endpoint is deleted.
     *     *   If the zone of the endpoint is in the <strong>Deleting</strong> state, the zone is being deleted.
     *     *   If the zone cannot be queried, the zone is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>RemoveZoneFromVpcEndpoint</strong> operation to delete a zone of an endpoint within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveZoneFromVpcEndpoint  RemoveZoneFromVpcEndpointRequest
     * @return RemoveZoneFromVpcEndpointResponse
     */
    CompletableFuture<RemoveZoneFromVpcEndpointResponse> removeZoneFromVpcEndpoint(RemoveZoneFromVpcEndpointRequest request);

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can add up to 20 tags to an instance. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number is reached, an error message is returned.</p>
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
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointAttribute</strong> operation to modify the attributes of an endpoint that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * @param request the request parameters of UpdateVpcEndpointAttribute  UpdateVpcEndpointAttributeRequest
     * @return UpdateVpcEndpointAttributeResponse
     */
    CompletableFuture<UpdateVpcEndpointAttributeResponse> updateVpcEndpointAttribute(UpdateVpcEndpointAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointConnectionAttribute</strong> operation to modify the bandwidth of an endpoint connection that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * @param request the request parameters of UpdateVpcEndpointConnectionAttribute  UpdateVpcEndpointConnectionAttributeRequest
     * @return UpdateVpcEndpointConnectionAttributeResponse
     */
    CompletableFuture<UpdateVpcEndpointConnectionAttributeResponse> updateVpcEndpointConnectionAttribute(UpdateVpcEndpointConnectionAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointServiceAttribute</strong> operation to modify the attributes of an endpoint service that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * @param request the request parameters of UpdateVpcEndpointServiceAttribute  UpdateVpcEndpointServiceAttributeRequest
     * @return UpdateVpcEndpointServiceAttributeResponse
     */
    CompletableFuture<UpdateVpcEndpointServiceAttributeResponse> updateVpcEndpointServiceAttribute(UpdateVpcEndpointServiceAttributeRequest request);

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointServiceResourceAttribute</strong> operation to modify the attributes of a service resource that is added to an endpoint service within a specified period of time.</p>
     * 
     * @param request the request parameters of UpdateVpcEndpointServiceResourceAttribute  UpdateVpcEndpointServiceResourceAttributeRequest
     * @return UpdateVpcEndpointServiceResourceAttributeResponse
     */
    CompletableFuture<UpdateVpcEndpointServiceResourceAttributeResponse> updateVpcEndpointServiceResourceAttribute(UpdateVpcEndpointServiceResourceAttributeRequest request);

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>By default, the feature of modifying a service resource of a zone to which an endpoint connection belongs is unavailable. To use this feature, log on to the <a href="https://quotas.console.aliyun.com/white-list-products/privatelink/quotas">Quota Center console</a>. Click Whitelist Quotas in the left-side navigation pane and click PrivateLink in the Networking section. On the page that appears, search for <code>privatelink_whitelist/svc_res_mgt_uat</code> and click Apply in the Actions column.</p>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>If the endpoint connection is in the <strong>Disconnected</strong> state, you can manually allocate the service resource in the zone.</li>
     * <li>If the endpoint connection is in the <strong>Connected</strong> state, you can manually migrate the service resource in the zone. In this case, the connection might be interrupted.</li>
     * <li><strong>UpdateVpcEndpointZoneConnectionResourceAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/469330.html">GetVpcEndpointServiceAttribute</a> operation to check whether the service resource is modified.<ul>
     * <li>If the endpoint service is in the <strong>Pending</strong> state, the service resource is being modified.</li>
     * <li>If the endpoint service is in the <strong>Active</strong> state, the service resource is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateVpcEndpointZoneConnectionResourceAttribute</strong> operation to modify a service resource in the zone to which an endpoint connection belongs within a specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateVpcEndpointZoneConnectionResourceAttribute  UpdateVpcEndpointZoneConnectionResourceAttributeRequest
     * @return UpdateVpcEndpointZoneConnectionResourceAttributeResponse
     */
    CompletableFuture<UpdateVpcEndpointZoneConnectionResourceAttributeResponse> updateVpcEndpointZoneConnectionResourceAttribute(UpdateVpcEndpointZoneConnectionResourceAttributeRequest request);

}
