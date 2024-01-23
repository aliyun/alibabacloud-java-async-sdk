// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101;

import com.aliyun.core.utils.SdkAutoCloseable;
import com.aliyun.sdk.service.vpcpeer20220101.models.*;
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
      * *   For a cross-account VPC peering connection, the connection is activated only after the accepter VPC accepts the connection request.
      * *   **AcceptVpcPeerConnection** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the operation in the background. You can call the [GetVpcPeerConnectionAttribute](~~426100~~) operation to query the status of the task.
      *     *   If a VPC peering connection is in the **Updating** state, the VPC peering connection is being activated.
      *     *   If a VPC peering connection is in the **Activated** state, the VPC peering connection is activated.
      * *   You cannot repeatedly call the **AcceptVpcPeerConnection** operation within a specific period of time.
      *
     */
    CompletableFuture<AcceptVpcPeerConnectionResponse> acceptVpcPeerConnection(AcceptVpcPeerConnectionRequest request);

    /**
      * Before you create a VPC peering connection, make sure that the following requirements are met:
      * *   Cloud Data Transfer (CDT) is activated to manage the billing of intra-border data transfers. To activate CDT, call the [OpenCdtService](~~337842~~) operation.
      * *   **CreateVpcPeerConnection** is an asynchronous operation. After a request is sent, the system returns a request ID and an **instance ID** and runs the task in the background. You can call the [GetVpcPeerConnectionAttribute](~~426095~~) operation to query the status of the task.
      *     *   If a VPC peering connection is in the **Creating** state, the VPC peering connection is being created.
      *     *   If a VPC peering connection is in the **Activated** state, the VPC peering connection is created.
      *     *   If a VPC peering connection is in the **Accepting** state, the VPC peering connection is created across accounts and the accepter is accepting the VPC peering connection.
      * *   You cannot repeatedly call the **CreateVpcPeerConnection** operation within a specific period of time.
      *
     */
    CompletableFuture<CreateVpcPeerConnectionResponse> createVpcPeerConnection(CreateVpcPeerConnectionRequest request);

    /**
      * *   You can delete VPC peering connections. After you delete a VPC peering connection, your service is affected. Proceed with caution.
      *     *   If you forcefully delete a VPC peering connection, the system deletes the routes that point to the VPC peering connection from the VPC route table.
      *     *   If you do not forcefully delete a VPC peering connection, the system does not delete these routes. You must manually delete them.
      * *   The **DeleteVpcPeerConnection** operation is asynchronous. After you send a request, the system returns **RequestId**, but the operation is still being performed in the background. You can call the [GetVpcPeerConnectionAttribute](~~426100~~) operation to query the status of a VPC peering connection.
      *     *   If a VPC peering connection is in the **Deleting** state, it is being deleted.
      *     *   If a VPC peering connection is in the **Deleted** state, it is deleted.
      * *   You cannot repeatedly call the **DeleteVpcPeerConnection** operation for the same VPC peering connection within the specified period of time.
      *
     */
    CompletableFuture<DeleteVpcPeerConnectionResponse> deleteVpcPeerConnection(DeleteVpcPeerConnectionRequest request);

    CompletableFuture<GetVpcPeerConnectionAttributeResponse> getVpcPeerConnectionAttribute(GetVpcPeerConnectionAttributeRequest request);

    /**
      * *   Set **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object to be queried.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you set only **Tag.N.Key**, all tag values that are associated with the specified key are returned. If you set only **Tag.N.Value**, an error message is returned.
      * *   If you set **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.
      *
     */
    CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request);

    CompletableFuture<ListVpcPeerConnectionsResponse> listVpcPeerConnections(ListVpcPeerConnectionsRequest request);

    /**
      * *   The **ModifyVpcPeerConnection** operation is asynchronous. After you send a request, the system returns **RequestId**, but the operation is still being performed in the background. You can call the [GetVpcPeerConnectionAttribute](~~426100~~) operation to query the status of a VPC peering connection.
      *     *   If a VPC peering connection is in the **Updating** state, the VPC peering connection is being modified.
      *     *   If a VPC peering connection is in the **Activated** state, the VPC peering connection is modified.
      * *   You cannot repeatedly call the **ModifyVpcPeerConnection** operation for the same VPC peering connection within the specified period of time.
      *
     */
    CompletableFuture<ModifyVpcPeerConnectionResponse> modifyVpcPeerConnection(ModifyVpcPeerConnectionRequest request);

    CompletableFuture<MoveResourceGroupResponse> moveResourceGroup(MoveResourceGroupRequest request);

    /**
      * *   An acceptor VPC can reject a connection request from the requester VPC of a cross-account VPC peering connection. After the connection request is rejected, the VPC peering connection enters the **Rejected** state.
      * *   You cannot repeatedly call the **RejectVpcPeerConnection** operation for the same VPC peering connection within the specified period of time.
      *
     */
    CompletableFuture<RejectVpcPeerConnectionResponse> rejectVpcPeerConnection(RejectVpcPeerConnectionRequest request);

    /**
      * Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following limits:
      * *   The keys of tags that are added to the same instance must be unique.
      * *   You cannot create tags without adding them to instances. All tags must be added to instances.
      * *   Tag information is not shared across regions.
      *     For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.
      * *   For the same account and region, tags added to different VPC peering connections are shared.
      *     For example, if a tag is added to a VPC peering connection, the tag can also be added to other VPC peering connections within the same account and region. You can modify the key and the value of a tag or remove a tag from an instance. After you delete an instance, all tags that are added to the instance are deleted.
      * *   You can add up to 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.
      *
     */
    CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request);

    CompletableFuture<UnTagResourcesResponse> unTagResources(UnTagResourcesRequest request);

}
