// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vpcpeer20220101.models.*;
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
     * <li>For a cross-account VPC peering connection, the VPC peering connection instance is activated only after the acceptor accepts the connection request.</li>
     * <li>The <strong>AcceptVpcPeerConnection</strong> operation is asynchronous. After you call this operation, the system returns a <strong>RequestId</strong>, but the VPC peering connection instance is not immediately activated. The activation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> to query the status of the VPC peering connection instance.<ul>
     * <li>If the VPC peering connection instance is in the <strong>Updating</strong> state, the instance is being activated.</li>
     * <li>If the VPC peering connection instance is in the <strong>Activated</strong> state, the instance is activated.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>AcceptVpcPeerConnection</strong> operation to concurrently accept requests for the same VPC peering connection instance.</li>
     * </ul>
     * 
     * @param request the request parameters of AcceptVpcPeerConnection  AcceptVpcPeerConnectionRequest
     * @return AcceptVpcPeerConnectionResponse
     */
    CompletableFuture<AcceptVpcPeerConnectionResponse> acceptVpcPeerConnection(AcceptVpcPeerConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Before you create a VPC peering connection, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateVpcPeerConnection</strong> is an asynchronous operation. After you call this operation, the system returns an <strong>InstanceId</strong>, but the VPC peering connection is not created yet and the creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/426095.html">GetVpcPeerConnectionAttribute</a> to query the status of the VPC peering connection.<ul>
     * <li>If the VPC peering connection is in the <strong>Creating</strong> state, the VPC peering connection is being created.    </li>
     * <li>If the VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is created.</li>
     * <li>If the VPC peering connection is in the <strong>Accepting</strong> state, the VPC peering connection is created across accounts and must be accepted by the acceptor.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateVpcPeerConnection</strong> operation to concurrently create VPC peering connections in the same VPC.
     * &lt;props=&quot;china&quot;&gt;When you create a VPC peering connection, the system automatically activates Cloud Data Transfer (CDT) for non-cross-border data transfer and cross-border data transfer.
     * &lt;props=&quot;intl&quot;&gt;When you create a VPC peering connection, the system automatically activates Cloud Data Transfer (CDT) for non-cross-border data transfer.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpcPeerConnection  CreateVpcPeerConnectionRequest
     * @return CreateVpcPeerConnectionResponse
     */
    CompletableFuture<CreateVpcPeerConnectionResponse> createVpcPeerConnection(CreateVpcPeerConnectionRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can delete a VPC peering connection instance. After the instance is deleted, your services will be interrupted. Perform this operation only when it does not affect your services.<ul>
     * <li>If you choose to force delete the instance, the system deletes the route entry that points to the VPC peering connection instance from the VPC routing table.</li>
     * <li>If you do not choose to force delete the instance, the system does not delete the route entry that points to the VPC peering connection instance from the VPC routing table. You must manually delete the route entry.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteVpcPeerConnection</strong> operation is asynchronous. After you call the operation, the system returns a <strong>RequestId</strong>, but the VPC peering connection instance is not immediately deleted. The deletion task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/2523294.html">GetVpcPeerConnectionAttribute</a> operation to query the status of the VPC peering connection instance.<ul>
     * <li>If the VPC peering connection instance is in the <strong>Deleting</strong> state, the instance is being deleted.</li>
     * <li>If the VPC peering connection instance is in the <strong>Deleted</strong> state, the instance is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>DeleteVpcPeerConnection</strong> operation to concurrently delete the same VPC peering connection instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVpcPeerConnection  DeleteVpcPeerConnectionRequest
     * @return DeleteVpcPeerConnectionResponse
     */
    CompletableFuture<DeleteVpcPeerConnectionResponse> deleteVpcPeerConnection(DeleteVpcPeerConnectionRequest request);

    /**
     * @param request the request parameters of GetVpcPeerConnectionAttribute  GetVpcPeerConnectionAttributeRequest
     * @return GetVpcPeerConnectionAttributeResponse
     */
    CompletableFuture<GetVpcPeerConnectionAttributeResponse> getVpcPeerConnectionAttribute(GetVpcPeerConnectionAttributeRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>Specify at least one of the <strong>ResourceId.N</strong> and <strong>Tag.N</strong> (<strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong>) parameters in the request to determine the resources to query.</li>
     * <li><strong>Tag.N</strong> is the tag of the resource and consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values associated with the tag key are returned. If you specify only <strong>Tag.N.Value</strong>, an error is reported.</li>
     * <li>If you specify both <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, the <strong>ResourceId.N</strong> parameter must match all the specified tag key-value pairs.</li>
     * <li>If you specify multiple tag key-value pairs, the returned resources contain all the specified key-value pairs.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    /**
     * @param request the request parameters of ListVpcPeerConnections  ListVpcPeerConnectionsRequest
     * @return ListVpcPeerConnectionsResponse
     */
    CompletableFuture<ListVpcPeerConnectionsResponse> listVpcPeerConnections(ListVpcPeerConnectionsRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>ModifyVpcPeerConnection</strong> is an asynchronous operation. The system returns a <strong>RequestId</strong>, but the VPC peering connection is not immediately modified. The modification task continues in the background. You can call <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> to query the status of the VPC peering connection.<ul>
     * <li>If the VPC peering connection is in the <strong>Updating</strong> state, it is being modified.</li>
     * <li>If the VPC peering connection is in the <strong>Activated</strong> state, the modification is complete.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyVpcPeerConnection</strong> does not support concurrent modifications to the name and description of the same VPC peering connection.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVpcPeerConnection  ModifyVpcPeerConnectionRequest
     * @return ModifyVpcPeerConnectionResponse
     */
    CompletableFuture<ModifyVpcPeerConnectionResponse> modifyVpcPeerConnection(ModifyVpcPeerConnectionRequest request);

    /**
     * @param request the request parameters of MoveResourceGroup  MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
     * <b>description</b> :
     * <ul>
     * <li>For a cross-account VPC peering connection instance, the acceptor can reject the connection request. A VPC peering connection instance whose connection request is rejected enters the <strong>Rejected</strong> state.</li>
     * <li><strong>RejectVpcPeerConnection</strong> does not support concurrent requests to reject the same peering connection instance.</li>
     * </ul>
     * 
     * @param request the request parameters of RejectVpcPeerConnection  RejectVpcPeerConnectionRequest
     * @return RejectVpcPeerConnectionResponse
     */
    CompletableFuture<RejectVpcPeerConnectionResponse> rejectVpcPeerConnection(RejectVpcPeerConnectionRequest request);

    /**
     * <b>description</b> :
     * <p>Tags are labels that you assign to instances. Instance tag consists of a key-value pair. Take note of the following limits on tags: </p>
     * <ul>
     * <li>The key of instance tag on an instance must be unique.</li>
     * <li>Tags must be attached to instances. Unattached tags are not supported.</li>
     * <li>Tag information is not shared across regions. 
     *   For example, tags created in the China (Hangzhou) region are not visible in the China (Shanghai) region.</li>
     * <li>Within the same account and region, tag information is shared across different VPC peering connections. 
     *  For example, if a tag is attached to a VPC peering connection within the same account and region, you can directly select and attach this tag to other VPC peering connections on the Edit Tags page without manually entering the key-value pair. You can modify the key and value of a tag, or delete the tag from an instance at any time. If an instance is deleted, all tags attached to the instance are also deleted.</li>
     * <li>You can attach up to 20 tags to a single instance. Before attaching tags, Alibaba Cloud verifies the number of existing tags on the resource. If the limit is exceeded, an error message is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    /**
     * @param request the request parameters of UnTagResources  UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

}
