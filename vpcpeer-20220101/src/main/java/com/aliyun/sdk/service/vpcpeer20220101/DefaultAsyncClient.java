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
     * <b>description</b> :
     * <p>  For a cross-account VPC peering connection, the connection is activated only after the accepter VPC accepts the connection request.</p>
     * <ul>
     * <li><strong>AcceptVpcPeerConnection</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the operation in the background. You can call the <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> operation to query the status of the task.<ul>
     * <li>If a VPC peering connection is in the <strong>Updating</strong> state, the VPC peering connection is being activated.</li>
     * <li>If a VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is activated.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>AcceptVpcPeerConnection</strong> operation within a specific period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of AcceptVpcPeerConnection  AcceptVpcPeerConnectionRequest
     * @return AcceptVpcPeerConnectionResponse
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
     * <b>description</b> :
     * <p>Before you create a VPC peering connection, take note of the following items:</p>
     * <ul>
     * <li><strong>CreateVpcPeerConnection</strong> is an asynchronous operation. After a request is sent, the system returns an <strong>instance ID</strong> and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/426095.html">GetVpcPeerConnectionAttribute</a> to query the status of the task.<ul>
     * <li>If the VPC peering connection is in the <strong>Creating</strong> state, the VPC peering connection is being created.</li>
     * <li>If the VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is created.</li>
     * <li>If the VPC peering connection is in the <strong>Accepting</strong> state, it is a cross-account connection. The connection needs to be accepted on the accepter side.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call <strong>CreateVpcPeerConnection</strong> within the specified period of time.
     * When you create a VPC peering connection, the system automatically activates Cloud Data Transfer (CDT) for you.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpcPeerConnection  CreateVpcPeerConnectionRequest
     * @return CreateVpcPeerConnectionResponse
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
     * <b>description</b> :
     * <p>  You can delete VPC peering connections. After you delete a VPC peering connection, your service is affected. Proceed with caution.
     *     *   If you forcefully delete a VPC peering connection, the system deletes the routes that point to the VPC peering connection from the VPC route table.
     *     *   If you do not forcefully delete a VPC peering connection, the system does not delete these routes. You must manually delete them.</p>
     * <ul>
     * <li>The <strong>DeleteVpcPeerConnection</strong> operation is asynchronous. After you send a request, the system returns <strong>RequestId</strong>, but the operation is still being performed in the background. You can call the <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> operation to query the status of a VPC peering connection.<ul>
     * <li>If a VPC peering connection is in the <strong>Deleting</strong> state, it is being deleted.</li>
     * <li>If a VPC peering connection is in the <strong>Deleted</strong> state, it is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteVpcPeerConnection</strong> operation for the same VPC peering connection within the specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVpcPeerConnection  DeleteVpcPeerConnectionRequest
     * @return DeleteVpcPeerConnectionResponse
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

    /**
     * @param request the request parameters of GetVpcPeerConnectionAttribute  GetVpcPeerConnectionAttributeRequest
     * @return GetVpcPeerConnectionAttributeResponse
     */
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
     * <b>description</b> :
     * <p>  Set <strong>ResourceId.N</strong> or <strong>Tag.N</strong> that consists of <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> in the request to specify the object to be queried.</p>
     * <ul>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair. If you set only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified key are returned. If you set only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you set <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
     * </ul>
     * 
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
     * @param request the request parameters of ListVpcPeerConnections  ListVpcPeerConnectionsRequest
     * @return ListVpcPeerConnectionsResponse
     */
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
     * <b>description</b> :
     * <p>  The <strong>ModifyVpcPeerConnection</strong> operation is asynchronous. After you send a request, the system returns <strong>RequestId</strong>, but the operation is still being performed in the background. You can call the <a href="https://help.aliyun.com/document_detail/426100.html">GetVpcPeerConnectionAttribute</a> operation to query the status of a VPC peering connection.
     *     *   If a VPC peering connection is in the <strong>Updating</strong> state, the VPC peering connection is being modified.
     *     *   If a VPC peering connection is in the <strong>Activated</strong> state, the VPC peering connection is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>ModifyVpcPeerConnection</strong> operation for the same VPC peering connection within the specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVpcPeerConnection  ModifyVpcPeerConnectionRequest
     * @return ModifyVpcPeerConnectionResponse
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
     * <p>  An acceptor VPC can reject a connection request from the requester VPC of a cross-account VPC peering connection. After the connection request is rejected, the VPC peering connection enters the <strong>Rejected</strong> state.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>RejectVpcPeerConnection</strong> operation for the same VPC peering connection within the specified period of time.</li>
     * </ul>
     * 
     * @param request the request parameters of RejectVpcPeerConnection  RejectVpcPeerConnectionRequest
     * @return RejectVpcPeerConnectionResponse
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
     * <b>description</b> :
     * <p>Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following limits:</p>
     * <ul>
     * <li>The keys of tags that are added to the same instance must be unique.</li>
     * <li>You cannot create tags without adding them to instances. All tags must be added to instances.</li>
     * <li>Tag information is not shared across regions.
     * For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.</li>
     * <li>For the same account and region, tags added to different VPC peering connections are shared.
     * For example, if a tag is added to a VPC peering connection, the tag can also be added to other VPC peering connections within the same account and region. You can modify the key and the value of a tag or remove a tag from an instance. After you delete an instance, all tags that are added to the instance are deleted.</li>
     * <li>You can add up to 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.</li>
     * </ul>
     * 
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

}
