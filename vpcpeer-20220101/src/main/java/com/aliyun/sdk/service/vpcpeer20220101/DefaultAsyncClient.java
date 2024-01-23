// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcpeer20220101;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.vpcpeer20220101.models.*;
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
        this.product = "VpcPeer";
        this.version = "2022-01-01";
        this.endpointRule = "central";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * *   For a cross-account VPC peering connection, the connection is activated only after the accepter VPC accepts the connection request.
      * *   **AcceptVpcPeerConnection** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the operation in the background. You can call the [GetVpcPeerConnectionAttribute](~~426100~~) operation to query the status of the task.
      *     *   If a VPC peering connection is in the **Updating** state, the VPC peering connection is being activated.
      *     *   If a VPC peering connection is in the **Activated** state, the VPC peering connection is activated.
      * *   You cannot repeatedly call the **AcceptVpcPeerConnection** operation within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<AcceptVpcPeerConnectionResponse> acceptVpcPeerConnection(AcceptVpcPeerConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AcceptVpcPeerConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AcceptVpcPeerConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AcceptVpcPeerConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateVpcPeerConnectionResponse> createVpcPeerConnection(CreateVpcPeerConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpcPeerConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcPeerConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcPeerConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteVpcPeerConnectionResponse> deleteVpcPeerConnection(DeleteVpcPeerConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpcPeerConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcPeerConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcPeerConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetVpcPeerConnectionAttributeResponse> getVpcPeerConnectionAttribute(GetVpcPeerConnectionAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVpcPeerConnectionAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVpcPeerConnectionAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVpcPeerConnectionAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Set **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object to be queried.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you set only **Tag.N.Key**, all tag values that are associated with the specified key are returned. If you set only **Tag.N.Value**, an error message is returned.
      * *   If you set **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.
      *
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

    @Override
    public CompletableFuture<ListVpcPeerConnectionsResponse> listVpcPeerConnections(ListVpcPeerConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpcPeerConnections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcPeerConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcPeerConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The **ModifyVpcPeerConnection** operation is asynchronous. After you send a request, the system returns **RequestId**, but the operation is still being performed in the background. You can call the [GetVpcPeerConnectionAttribute](~~426100~~) operation to query the status of a VPC peering connection.
      *     *   If a VPC peering connection is in the **Updating** state, the VPC peering connection is being modified.
      *     *   If a VPC peering connection is in the **Activated** state, the VPC peering connection is modified.
      * *   You cannot repeatedly call the **ModifyVpcPeerConnection** operation for the same VPC peering connection within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyVpcPeerConnectionResponse> modifyVpcPeerConnection(ModifyVpcPeerConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcPeerConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcPeerConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcPeerConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * *   An acceptor VPC can reject a connection request from the requester VPC of a cross-account VPC peering connection. After the connection request is rejected, the VPC peering connection enters the **Rejected** state.
      * *   You cannot repeatedly call the **RejectVpcPeerConnection** operation for the same VPC peering connection within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<RejectVpcPeerConnectionResponse> rejectVpcPeerConnection(RejectVpcPeerConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RejectVpcPeerConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RejectVpcPeerConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RejectVpcPeerConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

}
