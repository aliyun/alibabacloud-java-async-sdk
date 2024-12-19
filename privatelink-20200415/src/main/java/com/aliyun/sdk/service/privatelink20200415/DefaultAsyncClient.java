// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.privatelink20200415;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.privatelink20200415.models.*;
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
        this.product = "Privatelink";
        this.version = "2020-04-15";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
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
    @Override
    public CompletableFuture<AddUserToVpcEndpointServiceResponse> addUserToVpcEndpointService(AddUserToVpcEndpointServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddUserToVpcEndpointService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddUserToVpcEndpointServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddUserToVpcEndpointServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<AddZoneToVpcEndpointResponse> addZoneToVpcEndpoint(AddZoneToVpcEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddZoneToVpcEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddZoneToVpcEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddZoneToVpcEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<AttachResourceToVpcEndpointServiceResponse> attachResourceToVpcEndpointService(AttachResourceToVpcEndpointServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachResourceToVpcEndpointService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachResourceToVpcEndpointServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachResourceToVpcEndpointServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<AttachSecurityGroupToVpcEndpointResponse> attachSecurityGroupToVpcEndpoint(AttachSecurityGroupToVpcEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachSecurityGroupToVpcEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachSecurityGroupToVpcEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachSecurityGroupToVpcEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ChangeResourceGroup  ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    @Override
    public CompletableFuture<ChangeResourceGroupResponse> changeResourceGroup(ChangeResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ChangeResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ChangeResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ChangeResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CheckProductOpen  CheckProductOpenRequest
     * @return CheckProductOpenResponse
     */
    @Override
    public CompletableFuture<CheckProductOpenResponse> checkProductOpen(CheckProductOpenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckProductOpen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckProductOpenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckProductOpenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateVpcEndpointResponse> createVpcEndpoint(CreateVpcEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpcEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<CreateVpcEndpointServiceResponse> createVpcEndpointService(CreateVpcEndpointServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpcEndpointService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcEndpointServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcEndpointServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteVpcEndpointResponse> deleteVpcEndpoint(DeleteVpcEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpcEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DeleteVpcEndpointServiceResponse> deleteVpcEndpointService(DeleteVpcEndpointServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpcEndpointService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcEndpointServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcEndpointServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeRegions  DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    @Override
    public CompletableFuture<DescribeRegionsResponse> describeRegions(DescribeRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeZones  DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    @Override
    public CompletableFuture<DescribeZonesResponse> describeZones(DescribeZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DetachResourceFromVpcEndpointServiceResponse> detachResourceFromVpcEndpointService(DetachResourceFromVpcEndpointServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachResourceFromVpcEndpointService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachResourceFromVpcEndpointServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachResourceFromVpcEndpointServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DetachSecurityGroupFromVpcEndpointResponse> detachSecurityGroupFromVpcEndpoint(DetachSecurityGroupFromVpcEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachSecurityGroupFromVpcEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachSecurityGroupFromVpcEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachSecurityGroupFromVpcEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DisableVpcEndpointConnectionResponse> disableVpcEndpointConnection(DisableVpcEndpointConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableVpcEndpointConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableVpcEndpointConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableVpcEndpointConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<DisableVpcEndpointZoneConnectionResponse> disableVpcEndpointZoneConnection(DisableVpcEndpointZoneConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableVpcEndpointZoneConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableVpcEndpointZoneConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableVpcEndpointZoneConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<EnableVpcEndpointConnectionResponse> enableVpcEndpointConnection(EnableVpcEndpointConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableVpcEndpointConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableVpcEndpointConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableVpcEndpointConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<EnableVpcEndpointZoneConnectionResponse> enableVpcEndpointZoneConnection(EnableVpcEndpointZoneConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableVpcEndpointZoneConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableVpcEndpointZoneConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableVpcEndpointZoneConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVpcEndpointAttribute  GetVpcEndpointAttributeRequest
     * @return GetVpcEndpointAttributeResponse
     */
    @Override
    public CompletableFuture<GetVpcEndpointAttributeResponse> getVpcEndpointAttribute(GetVpcEndpointAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVpcEndpointAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVpcEndpointAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVpcEndpointAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVpcEndpointServiceAttribute  GetVpcEndpointServiceAttributeRequest
     * @return GetVpcEndpointServiceAttributeResponse
     */
    @Override
    public CompletableFuture<GetVpcEndpointServiceAttributeResponse> getVpcEndpointServiceAttribute(GetVpcEndpointServiceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVpcEndpointServiceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVpcEndpointServiceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVpcEndpointServiceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
     * @param request the request parameters of ListVpcEndpointConnections  ListVpcEndpointConnectionsRequest
     * @return ListVpcEndpointConnectionsResponse
     */
    @Override
    public CompletableFuture<ListVpcEndpointConnectionsResponse> listVpcEndpointConnections(ListVpcEndpointConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpcEndpointConnections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcEndpointConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcEndpointConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpcEndpointSecurityGroups  ListVpcEndpointSecurityGroupsRequest
     * @return ListVpcEndpointSecurityGroupsResponse
     */
    @Override
    public CompletableFuture<ListVpcEndpointSecurityGroupsResponse> listVpcEndpointSecurityGroups(ListVpcEndpointSecurityGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpcEndpointSecurityGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcEndpointSecurityGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcEndpointSecurityGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpcEndpointServiceResources  ListVpcEndpointServiceResourcesRequest
     * @return ListVpcEndpointServiceResourcesResponse
     */
    @Override
    public CompletableFuture<ListVpcEndpointServiceResourcesResponse> listVpcEndpointServiceResources(ListVpcEndpointServiceResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpcEndpointServiceResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcEndpointServiceResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcEndpointServiceResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpcEndpointServiceUsers  ListVpcEndpointServiceUsersRequest
     * @return ListVpcEndpointServiceUsersResponse
     */
    @Override
    public CompletableFuture<ListVpcEndpointServiceUsersResponse> listVpcEndpointServiceUsers(ListVpcEndpointServiceUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpcEndpointServiceUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcEndpointServiceUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcEndpointServiceUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpcEndpointServices  ListVpcEndpointServicesRequest
     * @return ListVpcEndpointServicesResponse
     */
    @Override
    public CompletableFuture<ListVpcEndpointServicesResponse> listVpcEndpointServices(ListVpcEndpointServicesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpcEndpointServices").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcEndpointServicesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcEndpointServicesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpcEndpointServicesByEndUser  ListVpcEndpointServicesByEndUserRequest
     * @return ListVpcEndpointServicesByEndUserResponse
     */
    @Override
    public CompletableFuture<ListVpcEndpointServicesByEndUserResponse> listVpcEndpointServicesByEndUser(ListVpcEndpointServicesByEndUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpcEndpointServicesByEndUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcEndpointServicesByEndUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcEndpointServicesByEndUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpcEndpointZones  ListVpcEndpointZonesRequest
     * @return ListVpcEndpointZonesResponse
     */
    @Override
    public CompletableFuture<ListVpcEndpointZonesResponse> listVpcEndpointZones(ListVpcEndpointZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpcEndpointZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcEndpointZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcEndpointZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpcEndpoints  ListVpcEndpointsRequest
     * @return ListVpcEndpointsResponse
     */
    @Override
    public CompletableFuture<ListVpcEndpointsResponse> listVpcEndpoints(ListVpcEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpcEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of OpenPrivateLinkService  OpenPrivateLinkServiceRequest
     * @return OpenPrivateLinkServiceResponse
     */
    @Override
    public CompletableFuture<OpenPrivateLinkServiceResponse> openPrivateLinkService(OpenPrivateLinkServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenPrivateLinkService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenPrivateLinkServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenPrivateLinkServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RemoveUserFromVpcEndpointServiceResponse> removeUserFromVpcEndpointService(RemoveUserFromVpcEndpointServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveUserFromVpcEndpointService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveUserFromVpcEndpointServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveUserFromVpcEndpointServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<RemoveZoneFromVpcEndpointResponse> removeZoneFromVpcEndpoint(RemoveZoneFromVpcEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveZoneFromVpcEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveZoneFromVpcEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveZoneFromVpcEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can add up to 20 tags to an instance. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number is reached, an error message is returned.</p>
     * </blockquote>
     * 
     * @param request the request parameters of TagResources  TagResourcesRequest
     * @return TagResourcesResponse
     */
    @Override
    public CompletableFuture<TagResourcesResponse> tagResources(TagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UntagResources  UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    @Override
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointAttribute</strong> operation to modify the attributes of an endpoint that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * @param request the request parameters of UpdateVpcEndpointAttribute  UpdateVpcEndpointAttributeRequest
     * @return UpdateVpcEndpointAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateVpcEndpointAttributeResponse> updateVpcEndpointAttribute(UpdateVpcEndpointAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVpcEndpointAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVpcEndpointAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVpcEndpointAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointConnectionAttribute</strong> operation to modify the bandwidth of an endpoint connection that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * @param request the request parameters of UpdateVpcEndpointConnectionAttribute  UpdateVpcEndpointConnectionAttributeRequest
     * @return UpdateVpcEndpointConnectionAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateVpcEndpointConnectionAttributeResponse> updateVpcEndpointConnectionAttribute(UpdateVpcEndpointConnectionAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVpcEndpointConnectionAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVpcEndpointConnectionAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVpcEndpointConnectionAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointServiceAttribute</strong> operation to modify the attributes of an endpoint service that belongs to an Alibaba Cloud account within a specified period of time.</p>
     * 
     * @param request the request parameters of UpdateVpcEndpointServiceAttribute  UpdateVpcEndpointServiceAttributeRequest
     * @return UpdateVpcEndpointServiceAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateVpcEndpointServiceAttributeResponse> updateVpcEndpointServiceAttribute(UpdateVpcEndpointServiceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVpcEndpointServiceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVpcEndpointServiceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVpcEndpointServiceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You cannot repeatedly call the <strong>UpdateVpcEndpointServiceResourceAttribute</strong> operation to modify the attributes of a service resource that is added to an endpoint service within a specified period of time.</p>
     * 
     * @param request the request parameters of UpdateVpcEndpointServiceResourceAttribute  UpdateVpcEndpointServiceResourceAttributeRequest
     * @return UpdateVpcEndpointServiceResourceAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateVpcEndpointServiceResourceAttributeResponse> updateVpcEndpointServiceResourceAttribute(UpdateVpcEndpointServiceResourceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVpcEndpointServiceResourceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVpcEndpointServiceResourceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVpcEndpointServiceResourceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    @Override
    public CompletableFuture<UpdateVpcEndpointZoneConnectionResourceAttributeResponse> updateVpcEndpointZoneConnectionResourceAttribute(UpdateVpcEndpointZoneConnectionResourceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVpcEndpointZoneConnectionResourceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVpcEndpointZoneConnectionResourceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVpcEndpointZoneConnectionResourceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
