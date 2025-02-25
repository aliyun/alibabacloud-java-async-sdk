// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.eflo20220530.models.*;
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
        this.product = "eflo";
        this.version = "2022-05-30";
        this.endpointRule = "";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * <b>description</b> :
     * <p>Apply for a secondary private IP address for the specified Lingjun Elastic Network Interface.</p>
     * <ul>
     * <li>If the PrivateIp field is empty, a secondary private IP address is automatically assigned and the unique identifier of the IP address is returned.</li>
     * <li>You can use the GetLeniPrivateIpAddress or ListLeniPrivateIpAddresses interface to check whether the secondary private IP address is assigned.</li>
     * </ul>
     * 
     * @param request the request parameters of AssignLeniPrivateIpAddress  AssignLeniPrivateIpAddressRequest
     * @return AssignLeniPrivateIpAddressResponse
     */
    @Override
    public CompletableFuture<AssignLeniPrivateIpAddressResponse> assignLeniPrivateIpAddress(AssignLeniPrivateIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignLeniPrivateIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignLeniPrivateIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignLeniPrivateIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Apply for secondary private IP addresses</p>
     * </blockquote>
     * <ul>
     * <li>By default, each network interface controller can apply for three secondary private IP addresses. If the quota is exceeded, contact the administrator.</li>
     * <li>The secondary private IP address is allocated from the Lingjun subnet to which the current network interface controller belongs. The first address and the last two addresses belong to reserved addresses and do not participate in the allocation.</li>
     * </ul>
     * 
     * @param request the request parameters of AssignPrivateIpAddress  AssignPrivateIpAddressRequest
     * @return AssignPrivateIpAddressResponse
     */
    @Override
    public CompletableFuture<AssignPrivateIpAddressResponse> assignPrivateIpAddress(AssignPrivateIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignPrivateIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignPrivateIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignPrivateIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> <strong>Add a CIDR block</strong></p>
     * </blockquote>
     * <ul>
     * <li>The CIDR block cannot start with 0. The subnet mask must be 8 to 28 bits in length.</li>
     * <li>The secondary IPv4 CIDR block must not overlap with the primary IPv4 CIDR block of the Lingjun CIDR block and the added secondary IPv4 CIDR block.</li>
     * <li>You cannot use 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 as the CIDR block of Lingjun. Example: In the Lingjun CIDR block whose primary IPv4 CIDR block is 192.168.0.0/16, you cannot add the following CIDR blocks as additional IPv4 CIDR blocks. The CIDR block that is in the same range as 192.168.0.0/16. A CIDR block that is larger than 192.168.0.0/16. Example: 192.168.0.0/8. A CIDR block that is smaller than 192.168.0.0/16. Example: 192.168.0.0/24.</li>
     * <li>By default, each tenant can create three additional CIDR blocks in each region.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateVpdCidrBlock  AssociateVpdCidrBlockRequest
     * @return AssociateVpdCidrBlockResponse
     */
    @Override
    public CompletableFuture<AssociateVpdCidrBlockResponse> associateVpdCidrBlock(AssociateVpdCidrBlockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateVpdCidrBlock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateVpdCidrBlockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateVpdCidrBlockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This interface is an asynchronous interface. You need to use the query interface to wait for the Lingjun Elastic Network Interface to reach the available state.</p>
     * 
     * @param request the request parameters of AttachElasticNetworkInterface  AttachElasticNetworkInterfaceRequest
     * @return AttachElasticNetworkInterfaceResponse
     */
    @Override
    public CompletableFuture<AttachElasticNetworkInterfaceResponse> attachElasticNetworkInterface(AttachElasticNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachElasticNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachElasticNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachElasticNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateElasticNetworkInterface  CreateElasticNetworkInterfaceRequest
     * @return CreateElasticNetworkInterfaceResponse
     */
    @Override
    public CompletableFuture<CreateElasticNetworkInterfaceResponse> createElasticNetworkInterface(CreateElasticNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateElasticNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateElasticNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateElasticNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that you have sufficient Lingjun HUB quota.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the system will return the ID of a Lingjun HUB. At this time, the Lingjun HUB instance may not be created yet, and the system background creation task is still in progress. You can call the ListErs or GetEr operation to query the status of the Lingjun HUB.<ul>
     * <li>If the status of the Lingjun HUB is Executing, it indicates that it is being created.</li>
     * <li>If the status of the Lingjun HUB is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateEr  CreateErRequest
     * @return CreateErResponse
     */
    @Override
    public CompletableFuture<CreateErResponse> createEr(CreateErRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateErResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateErResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a network instance connection, note that:</p>
     * <ul>
     * <li>Make sure that you have created a Lingjun HUB instance.</li>
     * <li>Make sure that you have sufficient quota for network instance connections.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the system returns the ID of the network instance connection. In this case, the network instance connection may not be created yet, and the system is still creating the network instance in the background. You can query the connection status of a network instance by ListErAttachments or GetErAttachment:<ul>
     * <li>If the connection status of the network instance is Executing, the network instance is being created.</li>
     * <li>If the connection status of the network instance is Available, the network instance is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateErAttachment  CreateErAttachmentRequest
     * @return CreateErAttachmentResponse
     */
    @Override
    public CompletableFuture<CreateErAttachmentResponse> createErAttachment(CreateErAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateErAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateErAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateErAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a routing policy, note that:</p>
     * <ul>
     * <li>Make sure that you have created a Lingjun HUB instance.</li>
     * <li>Make sure that you have created a network instance connection.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the system returns the ID of the routing policy. In this case, the routing policy instance may not be created yet, and the system background creation task is still in progress. You can use ListErRouteMaps or GetErRouteMap to query the status of a routing policy.<ul>
     * <li>If the status of the routing policy is Execute, the system is creating the instance.</li>
     * <li>If the status of the routing policy is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateErRouteMap  CreateErRouteMapRequest
     * @return CreateErRouteMapResponse
     */
    @Override
    public CompletableFuture<CreateErRouteMapResponse> createErRouteMap(CreateErRouteMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateErRouteMap").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateErRouteMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateErRouteMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun subnet, note that:</p>
     * <ul>
     * <li>You have created a Lingjun CIDR block.</li>
     * <li>Only one network segment can be specified for a Lingjun subnet.</li>
     * <li>The network segment cannot be modified after the Lingjun subnet is created.</li>
     * <li>Make sure that you have sufficient Lingjun subnet quota.</li>
     * <li>This interface is an asynchronous interface. After calling this interface, the system will return the ID of a Lingjun subnet. At this time, the Lingjun network segment may not be created yet, and the system background creation task is still in progress. You can call the ListSubnets or GetSubnet operation to query the status of the CIDR block of Lingjun.<ul>
     * <li>If the status of the Lingjun subnet is Executed, it indicates that it is being created.</li>
     * <li>If the status of the Lingjun subnet is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateSubnet  CreateSubnetRequest
     * @return CreateSubnetResponse
     */
    @Override
    public CompletableFuture<CreateSubnetResponse> createSubnet(CreateSubnetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSubnet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSubnetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSubnetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun connection, note that:</p>
     * <ul>
     * <li>When you specify the vccId parameter, the system will configure the purchased Lingjun connection for you. When the default vccId parameter is set, the system will automatically place an order and configure the Lingjun connection for you.</li>
     * <li>Make sure that you have called the InitializeVcc operation to grant permissions.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the system will return the Lingjun connection ID, but the Lingjun connection instance may not be created yet, and the system background creation task is still in progress. You can call the ListVccs or GetVcc operation to query the status of the Lingjun connection.<ul>
     * <li>If the status of the Lingjun connection is Executed, the Lingjun connection is being created.</li>
     * <li>If the status of the Lingjun connection is Available, the Lingjun connection is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateVcc  CreateVccRequest
     * @return CreateVccResponse
     */
    @Override
    public CompletableFuture<CreateVccResponse> createVcc(CreateVccRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVcc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVccResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVccResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create cross-account authorization for Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that the Alibaba Cloud ID and Lingjun HUB instance that you want to authorize are correct.</li>
     * <li>If you authorize the account of the other party, the account of the other party can load your local network instance to its Lingjun HUB, and the other party\&quot;s network will be connected to your network. Please proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVccGrantRule  CreateVccGrantRuleRequest
     * @return CreateVccGrantRuleResponse
     */
    @Override
    public CompletableFuture<CreateVccGrantRuleResponse> createVccGrantRule(CreateVccGrantRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVccGrantRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVccGrantRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVccGrantRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a VBR route entry, take note of the following items:</p>
     * <ul>
     * <li>After you call this operation, static route entries and BGP network announcements are created on the VBR to which the Lingjun connection belongs.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the VBR static route entry may not be created yet, and the system still creates the static route entry in the background. You can query the status of VBR static route entries by ListVccRouteEntries or GetVccRouteEntry:<ul>
     * <li>If the VBR static route entry is in the Executing state, it indicates that it is being created.</li>
     * <li>If the status of the VBR static route entry is Available, the VBR is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateVccRouteEntry  CreateVccRouteEntryRequest
     * @return CreateVccRouteEntryResponse
     */
    @Override
    public CompletableFuture<CreateVccRouteEntryResponse> createVccRouteEntry(CreateVccRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVccRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVccRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVccRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a CIDR block for Lingjun, take note of the following:</p>
     * <ul>
     * <li>A Lingjun network segment can specify an additional network segment in addition to a main network segment.</li>
     * <li>After the Lingjun network segment is created, the network segment cannot be modified.</li>
     * <li>Make sure that you have a sufficient quota of Lingjun CIDR blocks.</li>
     * <li>This interface is an asynchronous interface. After calling this interface, the system will return the ID of a Lingjun network segment. At this time, the Lingjun network segment may not be created yet, and the system background creation task is still in progress. You can call the ListVpds or GetVpd operation to query the status of the CIDR block of Lingjun.<ul>
     * <li>If the status of the Lingjun CIDR block is Executed, the CIDR block is being created.</li>
     * <li>If the status of the Lingjun CIDR block is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpd  CreateVpdRequest
     * @return CreateVpdResponse
     */
    @Override
    public CompletableFuture<CreateVpdResponse> createVpd(CreateVpdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create cross-account authorization for Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that the Alibaba Cloud ID and Lingjun HUB instance that you want to authorize are correct.</li>
     * <li>If you authorize the account of the other party, the account of the other party can load your local network instance to its Lingjun HUB, and the other party\&quot;s network will be connected to your network. Please proceed with caution.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpdGrantRule  CreateVpdGrantRuleRequest
     * @return CreateVpdGrantRuleResponse
     */
    @Override
    public CompletableFuture<CreateVpdGrantRuleResponse> createVpdGrantRule(CreateVpdGrantRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpdGrantRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpdGrantRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpdGrantRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteElasticNetworkInterface  DeleteElasticNetworkInterfaceRequest
     * @return DeleteElasticNetworkInterfaceResponse
     */
    @Override
    public CompletableFuture<DeleteElasticNetworkInterfaceResponse> deleteElasticNetworkInterface(DeleteElasticNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteElasticNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteElasticNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteElasticNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete the Lingjun HUB, note that:</p>
     * <ul>
     * <li>Before you delete the instance, make sure that no network instance is connected to the Lingjun HUB instance.</li>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun HUB instance may not be deleted, and the system background deletion task is still in progress. You can call the ListErs or GetEr operation to query the deletion status of the Lingjun HUB.<ul>
     * <li>If the status of the Lingjun HUB is Deleting, the Lingjun HUB instance is being deleted.</li>
     * <li>If no Lingjun HUB instance is recorded, the Lingjun HUB instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEr  DeleteErRequest
     * @return DeleteErResponse
     */
    @Override
    public CompletableFuture<DeleteErResponse> deleteEr(DeleteErRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteErResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteErResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a network instance connection, take note of the following:</p>
     * <ul>
     * <li>Before you delete the instance, make sure that no routing policy exists under the network instance connection instance.</li>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the network instance that is connected to the instance may not be deleted. The system still deletes the instance in the background. You can call the ListErAttachments or GetErAttachment to query the deletion status of network instance connections:<ul>
     * <li>If the status of the network instance connection is Deleting, the network instance connection is being deleted.</li>
     * <li>If there is no connection record for the network instance, the connection to the network instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteErAttachment  DeleteErAttachmentRequest
     * @return DeleteErAttachmentResponse
     */
    @Override
    public CompletableFuture<DeleteErAttachmentResponse> deleteErAttachment(DeleteErAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteErAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteErAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteErAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a routing policy, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the routing policy instance may not be deleted yet, and the system background deletion task is still in progress. You can call the ListErRouteMaps or GetErRouteMap operation to query the deletion status of a routing policy.<ul>
     * <li>If the routing policy is in the Deleting state, the routing policy instance is being deleted.</li>
     * <li>If no routing policy instance is recorded, the routing policy instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteErRouteMap  DeleteErRouteMapRequest
     * @return DeleteErRouteMapResponse
     */
    @Override
    public CompletableFuture<DeleteErRouteMapResponse> deleteErRouteMap(DeleteErRouteMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteErRouteMap").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteErRouteMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteErRouteMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a Lingjun subnet, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun subnet instance may not be deleted, and the system background deletion task is still in progress. You can call the ListSubnets or GetSubnet operation to query the deletion status of the subnet.<ul>
     * <li>If the status of the Lingjun subnet is Deleting, the Lingjun subnet instance is being deleted.</li>
     * <li>If there is no record of the Lingjun subnet instance, the Lingjun subnet instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSubnet  DeleteSubnetRequest
     * @return DeleteSubnetResponse
     */
    @Override
    public CompletableFuture<DeleteSubnetResponse> deleteSubnet(DeleteSubnetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSubnet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSubnetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSubnetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVccGrantRule  DeleteVccGrantRuleRequest
     * @return DeleteVccGrantRuleResponse
     */
    @Override
    public CompletableFuture<DeleteVccGrantRuleResponse> deleteVccGrantRule(DeleteVccGrantRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVccGrantRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVccGrantRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVccGrantRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a VBR static route entry, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the VBR static route entries may not be deleted. The system still deletes the VBR static route entries in the background. You can call the ListVccRouteEntries or GetVccRouteEntry to query the deletion status of VBR static route entries:<ul>
     * <li>If the VBR static route entry is in the Deleting state, the VBR static route entry is being deleted.</li>
     * <li>If no VBR static route entry instance is recorded, the VBR static route entry instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVccRouteEntry  DeleteVccRouteEntryRequest
     * @return DeleteVccRouteEntryResponse
     */
    @Override
    public CompletableFuture<DeleteVccRouteEntryResponse> deleteVccRouteEntry(DeleteVccRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVccRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVccRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVccRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a Lingjun CIDR block, take note of the following items:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>Before deleting, make sure that all Lingjun subnet instances under the Lingjun CIDR block have been deleted.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun network segment instance may not be deleted, and the system background deletion task is still in progress. You can call the ListVpds or GetVpd operation to query the deletion status of the CIDR block.<ul>
     * <li>If the status of the Lingjun CIDR block is Deleting, the Lingjun CIDR block is being deleted.</li>
     * <li>If there is no record of the Lingjun CIDR block instance, the Lingjun CIDR block instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVpd  DeleteVpdRequest
     * @return DeleteVpdResponse
     */
    @Override
    public CompletableFuture<DeleteVpdResponse> deleteVpd(DeleteVpdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteVpdGrantRule  DeleteVpdGrantRuleRequest
     * @return DeleteVpdGrantRuleResponse
     */
    @Override
    public CompletableFuture<DeleteVpdGrantRuleResponse> deleteVpdGrantRule(DeleteVpdGrantRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpdGrantRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpdGrantRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpdGrantRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query whether a user account has a <strong>AliyunServiceRoleForEfloVcc</strong> role.</p>
     * <blockquote>
     * <p> If you do not have a <strong>AliyunServiceRoleForEfloVcc</strong> role, you need to use the initializeVcc interface to complete authorization, otherwise users will not be able to use Lingjun to connect to the product.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeSlr  DescribeSlrRequest
     * @return DescribeSlrResponse
     */
    @Override
    public CompletableFuture<DescribeSlrResponse> describeSlr(DescribeSlrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSlr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSlrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSlrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This interface is an asynchronous interface, and you need to use the query interface to wait for the Lingjun Elastic Network Interface to reach the unbound state.</p>
     * 
     * @param request the request parameters of DetachElasticNetworkInterface  DetachElasticNetworkInterfaceRequest
     * @return DetachElasticNetworkInterfaceResponse
     */
    @Override
    public CompletableFuture<DetachElasticNetworkInterfaceResponse> detachElasticNetworkInterface(DetachElasticNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachElasticNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachElasticNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachElasticNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetDestinationCidrBlock  GetDestinationCidrBlockRequest
     * @return GetDestinationCidrBlockResponse
     */
    @Override
    public CompletableFuture<GetDestinationCidrBlockResponse> getDestinationCidrBlock(GetDestinationCidrBlockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDestinationCidrBlock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDestinationCidrBlockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDestinationCidrBlockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetElasticNetworkInterface  GetElasticNetworkInterfaceRequest
     * @return GetElasticNetworkInterfaceResponse
     */
    @Override
    public CompletableFuture<GetElasticNetworkInterfaceResponse> getElasticNetworkInterface(GetElasticNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetElasticNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetElasticNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetElasticNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetEr  GetErRequest
     * @return GetErResponse
     */
    @Override
    public CompletableFuture<GetErResponse> getEr(GetErRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetEr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetErResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetErResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetErAttachment  GetErAttachmentRequest
     * @return GetErAttachmentResponse
     */
    @Override
    public CompletableFuture<GetErAttachmentResponse> getErAttachment(GetErAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetErAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetErAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetErAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetErRouteEntry  GetErRouteEntryRequest
     * @return GetErRouteEntryResponse
     */
    @Override
    public CompletableFuture<GetErRouteEntryResponse> getErRouteEntry(GetErRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetErRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetErRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetErRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetErRouteMap  GetErRouteMapRequest
     * @return GetErRouteMapResponse
     */
    @Override
    public CompletableFuture<GetErRouteMapResponse> getErRouteMap(GetErRouteMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetErRouteMap").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetErRouteMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetErRouteMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetFabricTopology  GetFabricTopologyRequest
     * @return GetFabricTopologyResponse
     */
    @Override
    public CompletableFuture<GetFabricTopologyResponse> getFabricTopology(GetFabricTopologyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFabricTopology").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFabricTopologyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFabricTopologyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLeniPrivateIpAddress  GetLeniPrivateIpAddressRequest
     * @return GetLeniPrivateIpAddressResponse
     */
    @Override
    public CompletableFuture<GetLeniPrivateIpAddressResponse> getLeniPrivateIpAddress(GetLeniPrivateIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLeniPrivateIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLeniPrivateIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLeniPrivateIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLniPrivateIpAddress  GetLniPrivateIpAddressRequest
     * @return GetLniPrivateIpAddressResponse
     */
    @Override
    public CompletableFuture<GetLniPrivateIpAddressResponse> getLniPrivateIpAddress(GetLniPrivateIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLniPrivateIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLniPrivateIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLniPrivateIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNetworkInterface  GetNetworkInterfaceRequest
     * @return GetNetworkInterfaceResponse
     */
    @Override
    public CompletableFuture<GetNetworkInterfaceResponse> getNetworkInterface(GetNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetNodeInfoForPod  GetNodeInfoForPodRequest
     * @return GetNodeInfoForPodResponse
     */
    @Override
    public CompletableFuture<GetNodeInfoForPodResponse> getNodeInfoForPod(GetNodeInfoForPodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNodeInfoForPod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNodeInfoForPodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNodeInfoForPodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSubnet  GetSubnetRequest
     * @return GetSubnetResponse
     */
    @Override
    public CompletableFuture<GetSubnetResponse> getSubnet(GetSubnetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSubnet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSubnetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSubnetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVcc  GetVccRequest
     * @return GetVccResponse
     */
    @Override
    public CompletableFuture<GetVccResponse> getVcc(GetVccRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVcc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVccResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVccResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVccGrantRule  GetVccGrantRuleRequest
     * @return GetVccGrantRuleResponse
     */
    @Override
    public CompletableFuture<GetVccGrantRuleResponse> getVccGrantRule(GetVccGrantRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVccGrantRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVccGrantRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVccGrantRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVccRouteEntry  GetVccRouteEntryRequest
     * @return GetVccRouteEntryResponse
     */
    @Override
    public CompletableFuture<GetVccRouteEntryResponse> getVccRouteEntry(GetVccRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVccRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVccRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVccRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVpd  GetVpdRequest
     * @return GetVpdResponse
     */
    @Override
    public CompletableFuture<GetVpdResponse> getVpd(GetVpdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVpd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVpdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVpdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVpdGrantRule  GetVpdGrantRuleRequest
     * @return GetVpdGrantRuleResponse
     */
    @Override
    public CompletableFuture<GetVpdGrantRuleResponse> getVpdGrantRule(GetVpdGrantRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVpdGrantRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVpdGrantRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVpdGrantRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetVpdRouteEntry  GetVpdRouteEntryRequest
     * @return GetVpdRouteEntryResponse
     */
    @Override
    public CompletableFuture<GetVpdRouteEntryResponse> getVpdRouteEntry(GetVpdRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVpdRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVpdRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVpdRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of InitializeVcc  InitializeVccRequest
     * @return InitializeVccResponse
     */
    @Override
    public CompletableFuture<InitializeVccResponse> initializeVcc(InitializeVccRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InitializeVcc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InitializeVccResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InitializeVccResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListElasticNetworkInterfaces  ListElasticNetworkInterfacesRequest
     * @return ListElasticNetworkInterfacesResponse
     */
    @Override
    public CompletableFuture<ListElasticNetworkInterfacesResponse> listElasticNetworkInterfaces(ListElasticNetworkInterfacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListElasticNetworkInterfaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListElasticNetworkInterfacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListElasticNetworkInterfacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListErAttachments  ListErAttachmentsRequest
     * @return ListErAttachmentsResponse
     */
    @Override
    public CompletableFuture<ListErAttachmentsResponse> listErAttachments(ListErAttachmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListErAttachments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListErAttachmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListErAttachmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListErRouteEntries  ListErRouteEntriesRequest
     * @return ListErRouteEntriesResponse
     */
    @Override
    public CompletableFuture<ListErRouteEntriesResponse> listErRouteEntries(ListErRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListErRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListErRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListErRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListErRouteMaps  ListErRouteMapsRequest
     * @return ListErRouteMapsResponse
     */
    @Override
    public CompletableFuture<ListErRouteMapsResponse> listErRouteMaps(ListErRouteMapsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListErRouteMaps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListErRouteMapsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListErRouteMapsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListErs  ListErsRequest
     * @return ListErsResponse
     */
    @Override
    public CompletableFuture<ListErsResponse> listErs(ListErsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListErs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListErsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListErsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListInstancesByNcd  ListInstancesByNcdRequest
     * @return ListInstancesByNcdResponse
     */
    @Override
    public CompletableFuture<ListInstancesByNcdResponse> listInstancesByNcd(ListInstancesByNcdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListInstancesByNcd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListInstancesByNcdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListInstancesByNcdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLeniPrivateIpAddresses  ListLeniPrivateIpAddressesRequest
     * @return ListLeniPrivateIpAddressesResponse
     */
    @Override
    public CompletableFuture<ListLeniPrivateIpAddressesResponse> listLeniPrivateIpAddresses(ListLeniPrivateIpAddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLeniPrivateIpAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLeniPrivateIpAddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLeniPrivateIpAddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListLniPrivateIpAddress  ListLniPrivateIpAddressRequest
     * @return ListLniPrivateIpAddressResponse
     */
    @Override
    public CompletableFuture<ListLniPrivateIpAddressResponse> listLniPrivateIpAddress(ListLniPrivateIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLniPrivateIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLniPrivateIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLniPrivateIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNetworkInterfaces  ListNetworkInterfacesRequest
     * @return ListNetworkInterfacesResponse
     */
    @Override
    public CompletableFuture<ListNetworkInterfacesResponse> listNetworkInterfaces(ListNetworkInterfacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNetworkInterfaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNetworkInterfacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNetworkInterfacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListNodeInfosForPod  ListNodeInfosForPodRequest
     * @return ListNodeInfosForPodResponse
     */
    @Override
    public CompletableFuture<ListNodeInfosForPodResponse> listNodeInfosForPod(ListNodeInfosForPodRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNodeInfosForPod").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNodeInfosForPodResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNodeInfosForPodResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSubnets  ListSubnetsRequest
     * @return ListSubnetsResponse
     */
    @Override
    public CompletableFuture<ListSubnetsResponse> listSubnets(ListSubnetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSubnets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSubnetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSubnetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVccFlowInfos  ListVccFlowInfosRequest
     * @return ListVccFlowInfosResponse
     */
    @Override
    public CompletableFuture<ListVccFlowInfosResponse> listVccFlowInfos(ListVccFlowInfosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVccFlowInfos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVccFlowInfosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVccFlowInfosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVccGrantRules  ListVccGrantRulesRequest
     * @return ListVccGrantRulesResponse
     */
    @Override
    public CompletableFuture<ListVccGrantRulesResponse> listVccGrantRules(ListVccGrantRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVccGrantRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVccGrantRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVccGrantRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVccRouteEntries  ListVccRouteEntriesRequest
     * @return ListVccRouteEntriesResponse
     */
    @Override
    public CompletableFuture<ListVccRouteEntriesResponse> listVccRouteEntries(ListVccRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVccRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVccRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVccRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVccs  ListVccsRequest
     * @return ListVccsResponse
     */
    @Override
    public CompletableFuture<ListVccsResponse> listVccs(ListVccsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVccs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVccsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVccsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpdGrantRules  ListVpdGrantRulesRequest
     * @return ListVpdGrantRulesResponse
     */
    @Override
    public CompletableFuture<ListVpdGrantRulesResponse> listVpdGrantRules(ListVpdGrantRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpdGrantRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpdGrantRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpdGrantRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpdRouteEntries  ListVpdRouteEntriesRequest
     * @return ListVpdRouteEntriesResponse
     */
    @Override
    public CompletableFuture<ListVpdRouteEntriesResponse> listVpdRouteEntries(ListVpdRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpdRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpdRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpdRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListVpds  ListVpdsRequest
     * @return ListVpdsResponse
     */
    @Override
    public CompletableFuture<ListVpdsResponse> listVpds(ListVpdsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpds").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpdsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpdsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of QueryInstanceNcd  QueryInstanceNcdRequest
     * @return QueryInstanceNcdResponse
     */
    @Override
    public CompletableFuture<QueryInstanceNcdResponse> queryInstanceNcd(QueryInstanceNcdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryInstanceNcd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryInstanceNcdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryInstanceNcdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only unsubscribable for Lingjun connections in the prepayment status.</p>
     * 
     * @param request the request parameters of RefundVcc  RefundVccRequest
     * @return RefundVccResponse
     */
    @Override
    public CompletableFuture<RefundVccResponse> refundVcc(RefundVccRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RefundVcc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RefundVccResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RefundVccResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows the user to retry the operation if the Lingjun connection creation and deletion processes fail. Only the Lingjun connection in the creation failure and deletion failure state can be retried</p>
     * 
     * @param request the request parameters of RetryVcc  RetryVccRequest
     * @return RetryVccResponse
     */
    @Override
    public CompletableFuture<RetryVccResponse> retryVcc(RetryVccRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetryVcc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryVccResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryVccResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnAssignPrivateIpAddress  UnAssignPrivateIpAddressRequest
     * @return UnAssignPrivateIpAddressResponse
     */
    @Override
    public CompletableFuture<UnAssignPrivateIpAddressResponse> unAssignPrivateIpAddress(UnAssignPrivateIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnAssignPrivateIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnAssignPrivateIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnAssignPrivateIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning</strong> If the attached CIDR block has Lingjun subnet resources, you must delete the dependent resources before you can delete the attached CIDR block.</li>
     * </ul>
     * 
     * @param request the request parameters of UnAssociateVpdCidrBlock  UnAssociateVpdCidrBlockRequest
     * @return UnAssociateVpdCidrBlockResponse
     */
    @Override
    public CompletableFuture<UnAssociateVpdCidrBlockResponse> unAssociateVpdCidrBlock(UnAssociateVpdCidrBlockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnAssociateVpdCidrBlock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnAssociateVpdCidrBlockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnAssociateVpdCidrBlockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnassignLeniPrivateIpAddress  UnassignLeniPrivateIpAddressRequest
     * @return UnassignLeniPrivateIpAddressResponse
     */
    @Override
    public CompletableFuture<UnassignLeniPrivateIpAddressResponse> unassignLeniPrivateIpAddress(UnassignLeniPrivateIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassignLeniPrivateIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassignLeniPrivateIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassignLeniPrivateIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateElasticNetworkInterface  UpdateElasticNetworkInterfaceRequest
     * @return UpdateElasticNetworkInterfaceResponse
     */
    @Override
    public CompletableFuture<UpdateElasticNetworkInterfaceResponse> updateElasticNetworkInterface(UpdateElasticNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateElasticNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateElasticNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateElasticNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEr  UpdateErRequest
     * @return UpdateErResponse
     */
    @Override
    public CompletableFuture<UpdateErResponse> updateEr(UpdateErRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateErResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateErResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateErAttachment  UpdateErAttachmentRequest
     * @return UpdateErAttachmentResponse
     */
    @Override
    public CompletableFuture<UpdateErAttachmentResponse> updateErAttachment(UpdateErAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateErAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateErAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateErAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateErRouteMap  UpdateErRouteMapRequest
     * @return UpdateErRouteMapResponse
     */
    @Override
    public CompletableFuture<UpdateErRouteMapResponse> updateErRouteMap(UpdateErRouteMapRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateErRouteMap").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateErRouteMapResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateErRouteMapResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLeniPrivateIpAddress  UpdateLeniPrivateIpAddressRequest
     * @return UpdateLeniPrivateIpAddressResponse
     */
    @Override
    public CompletableFuture<UpdateLeniPrivateIpAddressResponse> updateLeniPrivateIpAddress(UpdateLeniPrivateIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLeniPrivateIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLeniPrivateIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLeniPrivateIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSubnet  UpdateSubnetRequest
     * @return UpdateSubnetResponse
     */
    @Override
    public CompletableFuture<UpdateSubnetResponse> updateSubnet(UpdateSubnetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSubnet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSubnetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSubnetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateVcc  UpdateVccRequest
     * @return UpdateVccResponse
     */
    @Override
    public CompletableFuture<UpdateVccResponse> updateVcc(UpdateVccRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVcc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVccResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVccResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateVpd  UpdateVpdRequest
     * @return UpdateVpdResponse
     */
    @Override
    public CompletableFuture<UpdateVpdResponse> updateVpd(UpdateVpdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVpd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVpdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVpdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
