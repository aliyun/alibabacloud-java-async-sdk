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
      * *   Before you add an account ID to the whitelist of an endpoint service, make sure that the endpoint service is in the **Active** state. You can call the [GetVpcEndpointServiceAttribute](~~469330~~) operation to query the status of the endpoint service.
      * *   You cannot repeatedly call the **AddUserToVpcEndpointService** operation to add the ID of an Alibaba Cloud account to the whitelist of an endpoint service within a specified period of time.
      *
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
      * *   **AddZoneToVpcEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpointZones](~~183560~~) operation to query the state of the zone.
      *     *   If the zone is in the **Creating** state, the zone is being added.
      *     *   If the zone is in the Wait state, the zone is added.
      * *   You cannot repeatedly call the **AddZoneToVpcEndpoint** operation to add a zone to an endpoint within a specified period of time.
      *
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
      * *   Before you add a service resource to an endpoint service, make sure that the endpoint service is in the **Active** state. You can call the [GetVpcEndpointServiceAttribute](~~469330~~) operation to query the status of the endpoint service.
      * *   You cannot repeatedly call the **AttachResourceToVpcEndpointService** operation to add a service resource to an endpoint service within a specified period of time.
      *
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
      * *   **AttachSecurityGroupToVpcEndpoint** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpoints](~~183558~~) operation to query the state of the endpoint.
      *     *   If the endpoint is in the **Pending** state, the endpoint is being associated with the security group.
      *     *   If the endpoint is in the **Active** state, the endpoint is associated with the security group.
      * *   You cannot repeatedly call the **AttachSecurityGroupToVpcEndpoint** operation to associate an endpoint with a security group within a specified period of time.
      *
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
      * **CreateVpcEndpoint** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointAttribute](~~183568~~) operation to check whether the endpoint is created.
      * *   If the endpoint is in the **Creating** state, the endpoint is being created.
      * *   If the endpoint is in the **Active** state, the endpoint is created.
      *
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
      * *   Before you create an endpoint service, make sure that you have created a Server Load Balancer (SLB) instance that supports PrivateLink. For more information, see [CreateLoadBalancer](~~174064~~).
      * *   **CreateVpcEndpointService** is an asynchronous operation. After a request is sent, the system returns a request ID and an instance ID and runs the task in the background. You can call the [GetVpcEndpointServiceAttribute](~~183542~~) operation to query the status of the endpoint service.
      *     *   If the endpoint service is in the **Creating** state, the endpoint service is being created.
      *     *   If the endpoint service is in the **Active** state, the endpoint service is created.
      *
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
      * *   Before you delete an endpoint, you must delete the zones that are added to the endpoint.
      * *   **DeleteVpcEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointAttribute](~~183568~~) operation to check whether the endpoint is deleted.
      *     *   If the endpoint is in the **Deleting** state, the endpoint is being deleted.
      *     *   If the endpoint cannot be queried, the endpoint is deleted.
      *
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
      * *   Before you delete an endpoint service, you must disconnect the endpoint from the endpoint service and remove the service resources.
      * *   **DeleteVpcEndpointService** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointServiceAttribute](~~183542~~) operation to check whether the endpoint service is deleted.
      *     *   If the endpoint service is in the **Deleting** state, the endpoint service is being deleted.
      *     *   If the endpoint service cannot be queried, the endpoint service is deleted.
      * *   You cannot repeatedly call the **DeleteVpcEndpointService** operation to delete an endpoint service that belongs to an Alibaba Cloud account within a specified period of time.
      *
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
      * *   Before you remove a service resource from an endpoint service, make sure that the endpoint service is in the **Active** state. You can call the [GetVpcEndpointServiceAttribute](~~469330~~) operation to query the status of the endpoint service.
      * *   You cannot repeatedly call the **DetachResourceFromVpcEndpointService** operation to remove a service resource from an endpoint service within a specified period of time.
      *
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
      * *   **DetachSecurityGroupFromVpcEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpoints](~~183558~~) to check whether the endpoint is disassociated from the security group.
      *     *   If the endpoint is in the **Pending** state, the endpoint is being disassociated from the security group.
      *     *   If you cannot query the endpoint in the security group, the endpoint is disassociated from the security group.
      * *   You cannot repeatedly call the **DetachSecurityGroupFromVpcEndpoint** operation to disassociate an endpoint from a security group within a specified period of time.
      *
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
      * *   **DisableVpcEndpointConnection** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointAttribute](~~183568~~) operation to query the state of the endpoint connection.
      *     *   If the endpoint connection is in the **Disconnecting** state, the endpoint is being disconnected from the endpoint service.
      *     *   If the endpoint connection is in the **Disconnected** state, the endpoint is disconnected from the endpoint service.
      * *   You cannot repeatedly call the **DisableVpcEndpointConnection** operation to allow an endpoint service to reject a connection request from an endpoint within a specified period of time.
      *
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
      * *   You can call this operation only when the state of the endpoint is **Connected** and the state of the zone associated with the endpoint is **Connected** or **Migrated**.
      * *   **DisableVpcEndpointZoneConnection** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpointZones](~~183560~~) operation to query the status of the task.
      *     *   If the zone is in the **Disconnecting** state, the task is running.
      *     *   If the zone is in the **Disconnected** state, the task is successful.
      * *   You cannot repeatedly call the **DisableVpcEndpointZoneConnection** operation to allow an endpoint service to reject a connection request from the endpoint in the zone within a specified period of time.
      *
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
      * *   **EnableVpcEndpointConnection** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointAttribute](~~183568~~) operation to query the state of the endpoint connection.
      *     *   If the state is **Connecting**, the endpoint connection is being established.
      *     *   If the state is **Connected**, the endpoint connection is established.
      * *   You cannot repeatedly call the **EnableVpcEndpointConnection** operation to allow an endpoint service of an Alibaba Cloud account to accept a connection request from an endpoint within a specified period of time.
      *
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
      * *   You can call this operation only when the state of the endpoint is **Connected** and the state of the associated zone is **Disconnected**.
      * *   **EnableVpcEndpointZoneConnection** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpointZones](~~183560~~) operation to check whether the endpoint service accepts a connection request from the endpoint in the associated zone.
      *     *   If the zone is in the **Connecting** state, the endpoint service is accepting the connection request from the endpoint.
      *     *   If the zone is in the **Connected** state, the endpoint service has accepted the connection request from the endpoint.
      * *   You cannot repeatedly call the **EnableVpcEndpointZoneConnection** operation to allow an endpoint service to accept a connection request from an endpoint in the associated zone within a specified period of time.
      *
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
      * *   You must specify **ResourceId.N** or **Tag.N** in the request to specify the object that you want to query.
      * *   **Tag.N** is a resource tag that consists of a key-value pair (Tag.N.Key and Tag.N.Value). If you specify only **Tag.N.Key**, all tag values that are associated with the specified key are returned. If you specify only **Tag.N.Value**, an error message is returned.
      * *   If you specify **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
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
      * *   Before you remove an account ID from the whitelist of an endpoint service, make sure that the endpoint service is in the **Active** state. You can call the [GetVpcEndpointServiceAttribute](~~469330~~) operation to query the status of the endpoint service.
      * *   You cannot repeatedly call the **RemoveUserFromVpcEndpointService** operation to remove the ID of an Alibaba Cloud account from the whitelist of an endpoint service within a specified period of time.
      *
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
      * *   **RemoveZoneFromVpcEndpoint** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListVpcEndpointZones](~~183560~~) operation to check whether the zone of the endpoint is deleted.
      *     *   If the zone of the endpoint is in the **Deleting** state, the zone is being deleted.
      *     *   If the zone cannot be queried, the zone is deleted.
      * *   You cannot repeatedly call the **RemoveZoneFromVpcEndpoint** operation to delete a zone of an endpoint within a specified period of time.
      *
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
      * > You can add up to 20 tags to an instance. Before you add tags to a resource, Alibaba Cloud checks the number of existing tags of the resource. If the maximum number is reached, an error message is returned.
      *
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
      * You cannot repeatedly call the **UpdateVpcEndpointAttribute** operation to modify the attributes of an endpoint that belongs to an Alibaba Cloud account within a specified period of time.
      *
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
      * You cannot repeatedly call the **UpdateVpcEndpointConnectionAttribute** operation to modify the bandwidth of an endpoint connection that belongs to an Alibaba Cloud account within a specified period of time.
      *
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
      * You cannot repeatedly call the **UpdateVpcEndpointServiceAttribute** operation to modify the attributes of an endpoint service that belongs to an Alibaba Cloud account within a specified period of time.
      *
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
      * You cannot repeatedly call the **UpdateVpcEndpointServiceResourceAttribute** operation to modify the attributes of a service resource that is added to an endpoint service within a specified period of time.
      *
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
      * ### Prerequisites
      * By default, the feature of modifying a service resource of a zone to which an endpoint connection belongs is unavailable. To use this feature, log on to the [Quota Center console](https://quotas.console.aliyun.com/white-list-products/privatelink/quotas). Click Whitelist Quotas in the left-side navigation pane and click PrivateLink in the Networking section. On the page that appears, search for `privatelink_whitelist/svc_res_mgt_uat` and click Apply in the Actions column.
      * ### Usage notes
      * *   If the endpoint connection is in the **Disconnected** state, you can manually allocate the service resource in the zone.
      * *   If the endpoint connection is in the **Connected** state, you can manually migrate the service resource in the zone. In this case, the connection might be interrupted.
      * *   **UpdateVpcEndpointZoneConnectionResourceAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetVpcEndpointServiceAttribute](~~469330~~) operation to check whether the service resource is modified.
      *     *   If the endpoint service is in the **Pending** state, the service resource is being modified.
      *     *   If the endpoint service is in the **Active** state, the service resource is modified.
      * *   You cannot repeatedly call the **UpdateVpcEndpointZoneConnectionResourceAttribute** operation to modify a service resource in the zone to which an endpoint connection belongs within a specified period of time.
      *
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
