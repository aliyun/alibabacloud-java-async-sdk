// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ga20191120.models.*;
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
        this.product = "Ga";
        this.version = "2019-11-20";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * *   **AddEntriesToAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetAcl](~~258292~~) or [ListAcls](~~258291~~) operation to query the status of the ACL to which you want to add IP entries.
      *     *   If the ACL is in the **configuring** state, it indicates that IP entries are added to the ACL. In this case, you can perform only query operations.
      *     *   If the ACL is in the **active** state, it indicates that IP entries are added to the ACL.
      * *   The **AddEntriesToAcl** operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<AddEntriesToAclResponse> addEntriesToAcl(AddEntriesToAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddEntriesToAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddEntriesToAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddEntriesToAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   **AssociateAclsWithListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of the listener with which you attempt to associate an ACL.
      *     *   If the listener is in the **updating** state, it indicates that the ACL is being associated. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that the ACL is associated.
      * *   The **AssociateAclsWithListener** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<AssociateAclsWithListenerResponse> associateAclsWithListener(AssociateAclsWithListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateAclsWithListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateAclsWithListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateAclsWithListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Only HTTPS listeners can be associated with additional certificates.
      * *   **AssociateAdditionalCertificatesWithListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeListener](~~153254~~) operation to query the status of the listener with which you want to associate an additional certificate.
      *     *   If the listener is in the **updating** state, it indicates that the additional certificate is being associated. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that the additional certificate is associated.
      * *   The **AssociateAdditionalCertificatesWithListener** operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateAdditionalCertificatesWithListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateAdditionalCertificatesWithListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   **AttachDdosToAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) or [ListAccelerators](~~153236~~) operation to query the status of the GA instance.
      *     *   If the GA instance is in the **configuring** state, the Anti-DDoS Pro or Anti-DDoS Premium instance is being associated with the GA instance. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, the Anti-DDoS Pro or Anti-DDoS Premium instance is associated with the GA instance.
      * *   You cannot repeatedly call the **AttachDdosToAccelerator** operation for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<AttachDdosToAcceleratorResponse> attachDdosToAccelerator(AttachDdosToAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachDdosToAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachDdosToAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachDdosToAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **AttachLogStoreToEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, it indicates that a Logstore is being associated with the group. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that a Logstore is associated with the group.
      * *   The **AttachLogStoreToEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<AttachLogStoreToEndpointGroupResponse> attachLogStoreToEndpointGroup(AttachLogStoreToEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachLogStoreToEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachLogStoreToEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachLogStoreToEndpointGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **BandwidthPackageAddAccelerator** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the status of the bandwidth plan that you want to associate.
      *     *   If the bandwidth plan is in the **binding** state, it indicates that the bandwidth plan is being associated. In this case, you can perform only query operations.
      *     *   If the bandwidth plan is in the **active** state, it indicates that the bandwidth plan is associated.
      * *   The **BandwidthPackageAddAccelerator** operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<BandwidthPackageAddAcceleratorResponse> bandwidthPackageAddAccelerator(BandwidthPackageAddAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BandwidthPackageAddAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BandwidthPackageAddAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BandwidthPackageAddAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **BandwidthPackageRemoveAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the status of the bandwidth plan that you attempt to disassociate.
      *     *   If the bandwidth plan is in the **unbinding** state, it indicates that the bandwidth plan is being disassociated. In this case, you can perform only query operations.
      *     *   If the bandwidth plan is in the **active** state, it indicates that the bandwidth plan is disassociated.
      * *   The **BandwidthPackageRemoveAccelerator** cannot be called repeatedly for the same GA instance.
      *
     */
    @Override
    public CompletableFuture<BandwidthPackageRemoveAcceleratorResponse> bandwidthPackageRemoveAccelerator(BandwidthPackageRemoveAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BandwidthPackageRemoveAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BandwidthPackageRemoveAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BandwidthPackageRemoveAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The **ChangeResourceGroup** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
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
      * *   **ConfigEndpointProbe** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the status of the endpoint group to which an endpoint belongs and determine whether latency monitoring is configured for the endpoint.
      *     *   If the endpoint group is in the **updating** state, it indicates that latency monitoring is being configured for the endpoint. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that latency monitoring is configured for the endpoint.
      * *   The **ConfigEndpointProbe** operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<ConfigEndpointProbeResponse> configEndpointProbe(ConfigEndpointProbeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfigEndpointProbe").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfigEndpointProbeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfigEndpointProbeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * **CreateAccelerator** is an asynchronous operation. After you send a request, the system returns the ID of a GA instance, but the operation is still being performed in the system background. You can call the [DescribeAccelerator](~~153235~~) operation to query the state of a GA instance.
      * *   If the GA instance is in the **init** state, it indicates that the GA instance is being created. In this case, you can perform only query operations.
      * *   If the GA instance is in the **active** state, it indicates that the GA instance is created.
      *
     */
    @Override
    public CompletableFuture<CreateAcceleratorResponse> createAccelerator(CreateAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **CreateAcl** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetAcl](~~258292~~) or [ListAcls](~~258291~~) operation to query the state of an ACL.
      * *   If the ACL is in the **init** state, the ACL is being created. In this case, you can only perform only query operations.
      * *   If the ACL is in the **active** state, the ACL is created.
      *
     */
    @Override
    public CompletableFuture<CreateAclResponse> createAcl(CreateAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call the **CreateApplicationMonitor** operation to create an origin probing task. An origin probing task monitors the network quality between a client and an origin server and checks the availability of the origin server.
      * Before you call this operation, take note of the following items:
      * *   You can create origin detection tasks only for subscription Standard Global Accelerator (GA) instances whose specification is Medium Ⅰ.
      * *   You cannot create an origin probe task for a UDP listener.
      * *   The service port of the URL or IP address that is probed must be within the listening port range.
      * *   **CreateApplicationMonitor** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeApplicationMonitor](~~408463~~) or [ListApplicationMonitor](~~408462~~) operation to query the status of the origin probing task.
      *     *   If the origin probing task is in the **init** state, it indicates that the task is being created. You can perform only query operations.
      *     *   If the origin probing task is in the **active** state, it indicates that the task is created.
      * *   The **CreateApplicationMonitor** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<CreateApplicationMonitorResponse> createApplicationMonitor(CreateApplicationMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateApplicationMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateApplicationMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateApplicationMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * To use Global Accelerator (GA) for acceleration, you must purchase a basic bandwidth plan. A basic bandwidth plan supports the following bandwidth types:
      * *   **Basic**: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service is deployed on Alibaba Cloud.
      * *   **Enhanced**: Both the default acceleration region and the default service region are in the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud.
      * *   **Premium**: Both the default acceleration region and the default service region are outside the Chinese mainland. The accelerated service can be deployed on and off Alibaba Cloud. If you want to accelerate data transfer for clients in the Chinese mainland, you must select China (Hong Kong) as the acceleration region.
      * When you call this operation, take note of the following items:
      * *   **CreateBandwidthPackage** is an asynchronous operation. After you send a request, the system returns the ID of a bandwidth plan, but the bandwidth plan is still being created in the system background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the status of the bandwidth plan.
      *     *   If the bandwidth plan is in the **init** state, it indicates that the bandwidth plan is being created. In this case, you can perform only query operations.
      *     *   If the bandwidth plan is in the **active** state, it indicates that the bandwidth plan is created.
      * *   The **CreateBandwidthPackage** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<CreateBandwidthPackageResponse> createBandwidthPackage(CreateBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateBasicAccelerateIp** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetBasicAccelerateIp](~~466794~~) operation to query the status of an accelerated IP address:
      *     *   If no status information is returned, the accelerated IP address is being created. In this case, you can perform only query operations.
      *     *   If the accelerated IP address is in the **active** state, the accelerated IP address is created.
      * *   The **CreateBasicAccelerateIp** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<CreateBasicAccelerateIpResponse> createBasicAccelerateIp(CreateBasicAccelerateIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBasicAccelerateIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBasicAccelerateIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBasicAccelerateIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateBasicAccelerateIpEndpointRelation** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetBasicAccelerateIp](~~466794~~) or [ListBasicEndpoints](~~466831~~) API operation to query the status of an accelerated IP address or an endpoint to determine the association status between the accelerated IP address and endpoint.
      *     *   If the status of the accelerated IP address and endpoint is **binding**, the accelerated IP address is being associated with the endpoint. In this case, you can query the accelerated IP address and endpoint but cannot perform other operations.
      *     *   If the status of the accelerated IP address and endpoint is **bound** and the status returned by the [ListBasicAccelerateIpEndpointRelations](~~466803~~) API operation is **active**, the accelerated IP address is associated with the endpoint.
      * *   The **CreateBasicAccelerateIpEndpointRelation** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
     */
    @Override
    public CompletableFuture<CreateBasicAccelerateIpEndpointRelationResponse> createBasicAccelerateIpEndpointRelation(CreateBasicAccelerateIpEndpointRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBasicAccelerateIpEndpointRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBasicAccelerateIpEndpointRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBasicAccelerateIpEndpointRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The **CreateBasicAccelerateIpEndpointRelations** is asynchronous. After you send a request, the system returns a request ID and runs the task in the system background. You can call the [GetBasicAccelerateIp](~~466794~~) or [ListBasicEndpoints](~~466831~~) API operation to query the status of an accelerated IP address or an endpoint to determine the association status.
      *     *   If an accelerated IP address and the endpoint are in the **binding** state, the accelerated IP address is being associated with the endpoint. In this case, you can only query the accelerated IP address and endpoint, but cannot perform other operations.
      *     *   If all the accelerated IP addresses and the endpoint are in the **bound** state, and the association status returned by the [ListBasicAccelerateIpEndpointRelations](~~466803~~) API operation is **active**, the accelerated IP addresses are associated with the endpoints.
      * *   The **CreateBasicAccelerateIpEndpointRelations** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
     */
    @Override
    public CompletableFuture<CreateBasicAccelerateIpEndpointRelationsResponse> createBasicAccelerateIpEndpointRelations(CreateBasicAccelerateIpEndpointRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBasicAccelerateIpEndpointRelations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBasicAccelerateIpEndpointRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBasicAccelerateIpEndpointRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **CreateBasicAccelerator** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetBasicAccelerator](~~353188~~) or [ListBasicAccelerators](~~353189~~) operation to query the status of the task.
      * *   If the basic GA instance is in the **init** state, it indicates that the basic GA instance is being created. In this case, you can perform only query operations.
      * *   If the basic GA instance is in the **active** state, it indicates that the basic GA instance is created.
      *
     */
    @Override
    public CompletableFuture<CreateBasicAcceleratorResponse> createBasicAccelerator(CreateBasicAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBasicAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBasicAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBasicAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateBasicEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListBasicEndpoints](~~466831~~) API operation to query the status of an endpoint.
      *     *   If the endpoint is in the **init** state, the endpoint is being created. In this case, you can perform only query operations.
      *     *   If the endpoint is in the **active** state, the endpoint is created.
      * *   The **CreateBasicEndpoint** API operation cannot be repeatedly called for the same basic GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<CreateBasicEndpointResponse> createBasicEndpoint(CreateBasicEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBasicEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBasicEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBasicEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateBasicEndpointGroup** is an asynchronous operation. After a request is sent, the system returns an endpoint group ID and runs the task in the background. You can call the [GetBasicEndpointGroup](~~362984~~) operation to query the status of the task.
      *     *   If the endpoint group is in the **init** state, the endpoint is being created. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, the endpoint group is created.
      * *   You cannot call the **CreateBasicEndpointGroup** operation again on the same GA instance before the previous request is completed.
      *
     */
    @Override
    public CompletableFuture<CreateBasicEndpointGroupResponse> createBasicEndpointGroup(CreateBasicEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBasicEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBasicEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBasicEndpointGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateBasicEndpoints** is an asynchronous operation. After you call this operation, the system returns a request ID and runs the task in the background. You can call the [ListBasicEndpoints](~~466831~~) operation to query the status of endpoints. - If one or more endpoints are in the **init** state, it indicates that the endpoints are being created. In this case, you can continue to perform query operations on the endpoints. If all endpoints are in the **active** state, it indicates that the endpoints are created.
      * *   You cannot call the **CreateBasicEndpoints** operation again on the same GA instance before the previous operation is complete.
      *
     */
    @Override
    public CompletableFuture<CreateBasicEndpointsResponse> createBasicEndpoints(CreateBasicEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBasicEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBasicEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBasicEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Take note of the following limits:
      * *   You can specify only one acceleration region for each basic GA instance, and only IPv4 clients can connect to basic GA instances.
      * *   **CreateBasicIpSet** is an asynchronous operation. After you send a request, the system returns an acceleration region ID and runs the task in the background. You can call the [GetBasicIpSet](~~362987~~) operation to query the status of the task.
      *     *   If the acceleration region is in the **init** state, the acceleration region is being created. In this case, you can perform only query operations.
      *     *   If the acceleration region is in the **active** state, the acceleration region is created.
      * *   You cannot call the **CreateBasicIpSet** operation again on the same GA instance before the previous task is completed.
      *
     */
    @Override
    public CompletableFuture<CreateBasicIpSetResponse> createBasicIpSet(CreateBasicIpSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBasicIpSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBasicIpSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBasicIpSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * readAndWrite
      *
     */
    @Override
    public CompletableFuture<CreateCustomRoutingEndpointGroupDestinationsResponse> createCustomRoutingEndpointGroupDestinations(CreateCustomRoutingEndpointGroupDestinationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomRoutingEndpointGroupDestinations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomRoutingEndpointGroupDestinationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomRoutingEndpointGroupDestinationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Global Accelerator (GA) forwards client requests to endpoints in an endpoint group based on the routing type of the listener that is associated with the endpoint group.
      * *   After you configure an intelligent routing listener for a GA instance, the GA instance selects a nearby and healthy endpoint group and forwards client requests to a healthy endpoint in the endpoint group.
      * *   After you configure a custom routing listener for a GA instance, the instance generates a port mapping table based on the listener port range, protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches), and forwards client requests to specified IP addresses and ports in the vSwitches.
      * You can call this operation to create endpoint groups for custom routing listeners. For information about how to create endpoint groups for intelligent routing listeners, see [CreateEndpointGroup](~~153259~~).
      * When you call this operation, take note of the following items:
      * *   **CreateCustomRoutingEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) or [ListCustomRoutingEndpointGroups](~~449374~~) operation to query the status of the endpoint groups that are associated with custom routing listeners.
      *     *   If one or more endpoint groups are in the **init** state, it indicates that the endpoint groups are being created. In this case, you can perform only query operations.
      *     *   If all endpoint groups are in the **active** state, it indicates that the endpoint groups are created.
      * *   The **CreateCustomRoutingEndpointGroups** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      * ### Prerequisites
      * Make sure that the following requirements are met before you call this operation:
      * *   A standard GA instance is created. For more information, see [CreateAccelerator](~~206786~~).
      * *   A bandwidth plan is associated with the standard GA instance. For more information, see [BandwidthPackageAddAccelerator](~~153239~~).
      * *   An application is deployed to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.
      * *   The permissions to use custom routing listeners are acquired and a custom routing listener is created for the GA instance. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see [CreateListener](~~153253~~).
      *
     */
    @Override
    public CompletableFuture<CreateCustomRoutingEndpointGroupsResponse> createCustomRoutingEndpointGroups(CreateCustomRoutingEndpointGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomRoutingEndpointGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomRoutingEndpointGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomRoutingEndpointGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation takes effect only when the traffic access policy of an endpoint allows traffic to specified destinations. You can call the [DescribeCustomRoutingEndpoint](~~449386~~) operation to query the traffic access policy of an endpoint. This operation takes effect only if the value of **TrafficToEndpointPolicy** is set to **AllowCustom**, which allows traffic to specific destinations.
      * When you call this operation, take note of the following items:
      * *   **CreateCustomRoutingEndpointTrafficPolicies** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the status of the task.
      *     *   If the endpoint group is in the **updating** state, the traffic destinations are being created. In this state, you can only query the traffic destinations.
      *     *   If the endpoint group is in the **active** state, the traffic destinations are created.
      * *   You cannot call the **CreateCustomRoutingEndpointTrafficPolicies** operation repeatedly for the same GA instance in a specific period of time.
      * ### [](#)Prerequisites
      * Before you call this operation, make sure that the following requirements are met:
      * *   A standard GA instance is created. For more information, see [CreateAccelerator](~~206786~~).
      * *   If the bandwidth metering method of the standard GA instance is **pay-by-bandwidth**, a bandwidth plan must be associated with the standard GA instance. For more information, see [BandwidthPackageAddAccelerator](~~153239~~).
      * *   An application that serves as the endpoint of the standard GA instance is deployed to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.
      * *   The permissions to use custom routing listeners are acquired, and a custom routing listener is created. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see [CreateListener](~~153253~~).
      * *   Endpoint groups are created for the custom routing listener. For more information, see [CreateCustomRoutingEndpointGroups](~~449363~~).
      * *   Endpoints are created for the custom routing listener. For more information, see [CreateCustomRoutingEndpoints](~~449382~~).
      *
     */
    @Override
    public CompletableFuture<CreateCustomRoutingEndpointTrafficPoliciesResponse> createCustomRoutingEndpointTrafficPolicies(CreateCustomRoutingEndpointTrafficPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomRoutingEndpointTrafficPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomRoutingEndpointTrafficPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomRoutingEndpointTrafficPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, the protocols and port ranges of the associated endpoint groups, and the IP addresses of endpoints (vSwitches), and forwards client requests to specified IP addresses and ports in the vSwitches.
      * This operation is used to create endpoints for custom routing listeners. When you call this operation, take note of the following items:
      * *   **CreateCustomRoutingEndpoints** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the status of an endpoint group and determine whether endpoints are created in the endpoint group.
      *     *   If the endpoint group is in the **updating** state, it indicates that endpoints are being created. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that endpoints are created.
      * *   The **CreateCustomRoutingEndpoints** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      * ### Prerequisites
      * The following operations are complete before you call this operation:
      * *   Create a standard GA instance. For more information, see [CreateAccelerator](~~206786~~).
      * *   Associate a bandwidth plan with the standard GA instance. For more information, see [BandwidthPackageAddAccelerator](~~153239~~).
      * *   Deploy an application that serves as the endpoint of the GA instance. The application is used to receive requests that are forwarded from GA. You can specify only vSwitches as endpoints for custom routing listeners.
      * *   Apply for permissions to use custom routing listeners and create a custom routing listener for the standard GA instance. Custom routing listeners are in invitational preview. To use custom routing listeners, contact your account manager. For more information about how to create a custom routing listener, see [CreateListener](~~153253~~).
      * *   Create an endpoint group for the custom routing listener. For more information, see [CreateCustomRoutingEndpointGroups](~~449363~~).
      *
     */
    @Override
    public CompletableFuture<CreateCustomRoutingEndpointsResponse> createCustomRoutingEndpoints(CreateCustomRoutingEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomRoutingEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomRoutingEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomRoutingEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you associate an accelerated domain name that has obtained an ICP number with a Global Accelerator (GA) instance, you do not need to complete filing for the accelerated domain name or its subdomains on Alibaba Cloud.
      * You can call this operation to add an accelerated domain name and associate the accelerated domain name with GA instances. When you call this operation, take note of the following items:
      * *   If your accelerated domain name is hosted in the Chinese mainland, you must obtain an ICP number for the domain name.
      * *   The same accelerated domain name cannot be repeatedly associated with the same GA instance.
      * *   You cannot repeatedly call the **CreateDomain** operation by using the same Alibaba Cloud account within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<CreateDomainResponse> createDomain(CreateDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   When you call this operation to create a virtual endpoint group for a Layer 4 listener, make sure that a default endpoint group is created.
      * *   **CreateEndpointGroup** is an asynchronous operation. After you send a request, the system returns the ID of an endpoint group, but the endpoint group is still being created in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of the endpoint group.
      *     *   If the endpoint group is in the **init** state, it indicates that the endpoint group is being created. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that the endpoint group is created.
      * *   The **CreateEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<CreateEndpointGroupResponse> createEndpointGroup(CreateEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEndpointGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateEndpointGroups** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEndpointGroup](~~153260~~) or [ListEndpointGroups](~~153261~~) operation to query the status of the task:
      *     *   If the endpoint groups are in the **init** state, the endpoint groups are being created. In this case, you can perform only query operations.
      *     *   If all endpoint groups are in the **active** state, the endpoint groups are created.
      * *   The **CreateEndpointGroups** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<CreateEndpointGroupsResponse> createEndpointGroups(CreateEndpointGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEndpointGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEndpointGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEndpointGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * HTTP and HTTPS listeners of Global Accelerator (GA) support domain name-based and path-based forwarding rules. After an HTTP or HTTPS listener receives a request, the system matches the request against the forwarding conditions in a forwarding rule and then performs the corresponding forwarding action. For example, if you set **Host** to `www.example.com` as the forwarding condition and **Forward** to `epg-bp1enpdcrqhl78g6r****` as the forwarding action in a forwarding rule, requests to the `www.example.com` domain name match this forwarding rule and are forwarded to the `epg-bp1enpdcrqhl78g6r****` endpoint group. Before you call this API operation to create a forwarding rule, we recommend that you understand forwarding rules. For more information, see [Forwarding rules](~~204224~~).
      * When you call this operation, take note of the following items:
      * *   **CreateForwardingRules** is an asynchronous operation. After you send a request, the system returns the ID of a forwarding rule, but the forwarding rule is still being created in the system background. You can call the [ListForwardingRules](~~205817~~) operation to query the state of the forwarding rule.
      *     *   If the forwarding rule is in the **configuring** state, it indicates that the rule is being created. In this case, you can only perform query operations.
      *     *   If the forwarding rule is in the **active** state, it indicates that the rule is created.
      * *   The **CreateForwardingRules** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<CreateForwardingRulesResponse> createForwardingRules(CreateForwardingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateForwardingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateForwardingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateForwardingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateIpSets** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeIpSet](~~153246~~) operation to query the status of the task.
      *     *   If acceleration regions are in the **init** state, it indicates that the acceleration regions are being created. In this case, you can perform only query operations.
      *     *   If acceleration regions are in the **active** state, it indicates that the acceleration regions are created.
      * *   You cannot call the **CreateIpSets** operation again on the same GA instance before the previous operation is completed.
      *
     */
    @Override
    public CompletableFuture<CreateIpSetsResponse> createIpSets(CreateIpSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIpSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIpSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIpSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   **CreateListener** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeListener](~~153254~~) operation to query the status of the task.
      *     *   If the listener is in the **init** state, the listener is being created. In this state, you can perform only query operations.
      *     *   If the listener is in the **active** state, the listener is created.
      * *   You cannot repeatedly call the **CreateListener** operation for the same GA instance within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateSpareIps** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) operation to query the status of a GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that secondary IP addresses are being created for the CNAME that is assigned to the GA instance. In this case, you can only perform query operations.
      *     *   If the GA instance is in the **active** state, it indicates that secondary IP addresses are created for the CNAME that is assigned to the GA instance.
      * *   The **CreateSpareIps** operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<CreateSpareIpsResponse> createSpareIps(CreateSpareIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSpareIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSpareIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSpareIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You cannot delete subscription GA instances.
      * *   **DeleteAccelerator** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) operation to query the status of the task.
      *     *   If the GA instance is in the **deleting** state, the GA instance is being deleted. In this case, you can perform only query operations.
      *     *   If the GA instance cannot be queried, the GA instance is deleted.
      *
     */
    @Override
    public CompletableFuture<DeleteAcceleratorResponse> deleteAccelerator(DeleteAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **DeleteAcl** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [GetAcl](~~258292~~) operation to query the state of a network ACL.
      * *   If the network ACL is in the **deleting** state, it indicates that the network ACL is being deleted. In this case, you can perform only query operations.
      * *   If the network ACL cannot be queried, it indicates that the network ACL is deleted.
      *
     */
    @Override
    public CompletableFuture<DeleteAclResponse> deleteAcl(DeleteAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteApplicationMonitor** is an asynchronous operation. After you call this operation, the system returns a request ID, but the operation is still being performed in the system background. You can call the [ListApplicationMonitor](~~408462~~) operation to query the state of an origin probing task.
      *     *   If the origin probing task is in the **deleting** state, it indicates that the task is being deleted. In this case, you can perform only query operations.
      *     *   If the origin probing task cannot be queried, it indicates that the task is deleted.
      * *   The **DeleteApplicationMonitor** operation cannot be called repeatedly for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteApplicationMonitorResponse> deleteApplicationMonitor(DeleteApplicationMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteApplicationMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteApplicationMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteApplicationMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   By default, subscription bandwidth plans cannot be deleted. If you want to unsubscribe from subscription bandwidth plans, go to the [Unsubscribe](https://usercenter2-intl.aliyun.com/refund/refund) page. Before you can unsubscribe from a subscription bandwidth plan that is associated with a Global Accelerator (GA) instance, you must disassociate the bandwidth plan from the GA instance. For information about how to disassociate a bandwidth plan from a GA instance, see [BandwidthPackageRemoveAccelerator](~~153240~~).
      * *   Bandwidth plans that are associated with GA instances cannot be deleted. Before you can delete a bandwidth plan that is associated with a GA instance, you must disassociate the bandwidth plan from the GA instance. For information about how to disassociate a bandwidth plan from a GA instance, see [BandwidthPackageRemoveAccelerator](~~153240~~).
      * *   **DeleteBandwidthPackage** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the status of the task.
      *     *   If the bandwidth plan is in the **deleting** state, the bandwidth plan is being deleted. In this case, you can perform only query operations.
      *     *   If the bandwidth plan cannot be found, the bandwidth plan is deleted.
      * *   The **DeleteBandwidthPackage** operation cannot be repeatedly called for the same bandwidth plan within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteBandwidthPackageResponse> deleteBandwidthPackage(DeleteBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteBasicAccelerateIp** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetBasicAccelerateIp](~~466794~~) operation to query the status of an accelerated IP address.
      *     *   If an accelerated IP address is in the **deleting** state, the accelerated IP address is being deleted. In this case, you can perform only query operations.
      *     *   If the system fails to return information about an accelerated IP address, the accelerated IP address is deleted.
      * *   You cannot repeatedly call the **DeleteBasicAccelerateIp** operation for the same basic GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteBasicAccelerateIpResponse> deleteBasicAccelerateIp(DeleteBasicAccelerateIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBasicAccelerateIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBasicAccelerateIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBasicAccelerateIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteBasicAccelerateIpEndpointRelation** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the following operations to check whether an accelerated IP address is disassociated from an endpoint:
      *     *   You can call the [GetBasicAccelerateIp](~~466794~~) and [ListBasicEndpoints](~~466831~~) operations to query the status of an accelerated IP address and an endpoint. If the accelerated IP address and the endpoint are in the **unbinding** state, the accelerated IP address is being disassociated from the endpoint. In this case, you can query the IP address and endpoint but cannot perform other operations.
      *     *   If the association status between the accelerated IP address and the endpoint cannot be queried by calling the [ListBasicAccelerateIpEndpointRelations](~~466803~~) operation, the accelerated IP address is disassociated from the endpoint.
      * *   The **DeleteBasicAccelerateIpEndpointRelation** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteBasicAccelerateIpEndpointRelationResponse> deleteBasicAccelerateIpEndpointRelation(DeleteBasicAccelerateIpEndpointRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBasicAccelerateIpEndpointRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBasicAccelerateIpEndpointRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBasicAccelerateIpEndpointRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You cannot delete subscription basic GA instances. You can unsubscribe from a basic GA instance on the [Unsubscribe](https://usercenter2-intl.aliyun.com/refund/refund) page. Before you unsubscribe from a basic GA instance, make sure that the acceleration areas and endpoint groups of the GA instance are deleted and no bandwidth plans are associated with the GA instance.
      *     *   For information about how to delete an acceleration area, see [DeleteBasicIpSet](~~2253388~~).
      *     *   For information about how to delete an endpoint group, see [DeleteBasicEndpointGroup](~~2253399~~).
      *     *   For information about how to disassociate a bandwidth plan from a basic GA instance, see [BandwidthPackageRemoveAccelerator](~~153240~~).
      * *   Before you call this operation to delete a pay-as-you-go basic GA instance, make sure that all data is migrated and the acceleration areas and endpoint groups of the instance are deleted.
      *     *   For information about how to delete an acceleration area, see [DeleteBasicIpSet](~~2253388~~).
      *     *   For information about how to delete an endpoint group, see [DeleteBasicEndpointGroup](~~2253399~~).
      * *   **DeleteBasicAccelerator** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetBasicAccelerator](~~353188~~) operation to query the status of the task.
      *     *   If the basic GA instance is in the **deleting** state, it indicates that the instance is being deleted. In this case, you can perform only query operations.
      *     *   If the information about the basic GA instance is not displayed in the response, it indicates that the instance is deleted.
      *
     */
    @Override
    public CompletableFuture<DeleteBasicAcceleratorResponse> deleteBasicAccelerator(DeleteBasicAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBasicAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBasicAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBasicAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteBasicEndpoint** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListBasicEndpoints](~~466831~~) operation to query the status of endpoints.
      *     *   If the endpoint is in the **deleting** state, it indicates that the endpoint is being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint cannot be found, it indicates that the endpoint is deleted.
      * *   The **DeleteBasicEndpoint** API operation cannot be repeatedly called for the same basic GA instance within a period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteBasicEndpointResponse> deleteBasicEndpoint(DeleteBasicEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBasicEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBasicEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBasicEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you delete an endpoint group, take note of the following items:
      * *   If an endpoint in the endpoint group is associated with an accelerated IP address, you cannot delete the endpoint group. You can call the [DeleteBasicAccelerateIpEndpointRelation](~~2253413~~) operation to disassociate the endpoint from the accelerated IP address.
      * *   If no endpoint in the endpoint group is associated with an accelerated IP address, you can delete the endpoint group. When you delete an endpoint group, all endpoints in the endpoint group are deleted.
      * *   **DeleteBasicEndpointGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetBasicEndpointGroup](~~362984~~) operation to query the status of the task.
      *     *   If the endpoint group is in the **deleting** state, the endpoint group is being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint group cannot be queried, the endpoint group is deleted.
      * *   The **DeleteBasicEndpointGroup** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteBasicEndpointGroupResponse> deleteBasicEndpointGroup(DeleteBasicEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBasicEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBasicEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBasicEndpointGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If an accelerated IP address is associated with an endpoint, you cannot delete the acceleration region. You can call the [DeleteBasicAccelerateIpEndpointRelation](~~2253413~~) operation to disassociate the accelerated IP address from the endpoint.
      * *   \\*\\*DeleteBasicIpSet\\*\\* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetBasicIpSet](~~362987~~) operation to query the status of the task.
      *     *   If the acceleration region is in the **deleting** state, it indicates that the acceleration region is being deleted. In this case, you can perform only query operations.
      *     *   If the acceleration region cannot be queried, it indicates that the acceleration region is deleted.
      * *   The \\*\\*DeleteBasicIpSet\\*\\* operation cannot be repeatedly called for the same basic GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteBasicIpSetResponse> deleteBasicIpSet(DeleteBasicIpSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBasicIpSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBasicIpSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBasicIpSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteCustomRoutingEndpointGroupDestinations** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) to query the status of the task.
      *     *   If the endpoint group is in the **updating** state, it indicates that mappings are being deleted from the endpoint group. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state and no information about the mappings that you want to delete is found in the response when you call the [DescribeCustomRoutingEndpointGroupDestinations](~~449378~~) operation, it indicates the mappings are deleted from the endpoint group.
      * *   You cannot call the **DeleteCustomRoutingEndpointGroupDestinations** operation again on the same Global Accelerator (GA) instance before the previous request is completed.
      *
     */
    @Override
    public CompletableFuture<DeleteCustomRoutingEndpointGroupDestinationsResponse> deleteCustomRoutingEndpointGroupDestinations(DeleteCustomRoutingEndpointGroupDestinationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomRoutingEndpointGroupDestinations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomRoutingEndpointGroupDestinationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomRoutingEndpointGroupDestinationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteCustomRoutingEndpointGroups** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of the endpoint groups associated with a custom routing listener that you attempt to delete.
      *     *   If the endpoint groups are in the **deleting** state, the endpoint groups are being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint groups cannot be queried, the endpoint groups are deleted.
      * *   You cannot use the **DeleteCustomRoutingEndpointGroups** operation on the same Global Accelerator (GA) instance before the previous operation is complete.
      *
     */
    @Override
    public CompletableFuture<DeleteCustomRoutingEndpointGroupsResponse> deleteCustomRoutingEndpointGroups(DeleteCustomRoutingEndpointGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomRoutingEndpointGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomRoutingEndpointGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomRoutingEndpointGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteCustomRoutingEndpointTrafficPolicies** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the status of an endpoint group to check whether the traffic destinations are deleted.
      *     *   If the endpoint group is in the **updating** state, the traffic destinations are being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state and the traffic destinations that you want to delete cannot be queried by calling the [DescribeCustomRoutingEndPointTrafficPolicy](~~449392~~) operation, the traffic destinations are deleted.
      * *   The **DeleteCustomRoutingEndpointTrafficPolicies** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteCustomRoutingEndpointTrafficPoliciesResponse> deleteCustomRoutingEndpointTrafficPolicies(DeleteCustomRoutingEndpointTrafficPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomRoutingEndpointTrafficPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomRoutingEndpointTrafficPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomRoutingEndpointTrafficPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteCustomRoutingEndpoints** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) to query the status of the task.
      *     *   If an endpoint group is in the **updating** state, the endpoint is being deleted. In this case, you can perform only query operations.
      *     *   If an endpoint group is in the **active** state and the endpoint cannot be found after you call the [DescribeCustomRoutingEndpoint](~~449386~~) operation, the endpoint is deleted.
      * *   You cannot call the **DeleteCustomRoutingEndpoints** operation again on the same Global Accelerator (GA) instance before the previous task is completed.
      *
     */
    @Override
    public CompletableFuture<DeleteCustomRoutingEndpointsResponse> deleteCustomRoutingEndpoints(DeleteCustomRoutingEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomRoutingEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomRoutingEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomRoutingEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot call the **DeleteDomainAcceleratorRelation** operation again by using the same Alibaba Cloud account before the previous operation is complete.
      *
     */
    @Override
    public CompletableFuture<DeleteDomainAcceleratorRelationResponse> deleteDomainAcceleratorRelation(DeleteDomainAcceleratorRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDomainAcceleratorRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDomainAcceleratorRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDomainAcceleratorRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteEndpointGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the status of the endpoint group.
      *     *   If the endpoint group is in the **deleting** state, it indicates that the endpoint group is being deleted. In this case, you can perform only query operations.
      *     *   If the endpoint group cannot be queried, it indicates that the endpoint group is deleted.
      * *   The **DeleteEndpointGroup** operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<DeleteEndpointGroupResponse> deleteEndpointGroup(DeleteEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEndpointGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteEndpointGroups** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the status of the task.
      *     *   If an endpoint group is in the **deleting** state, the endpoint group is being deleted. In this case, you can perform only query operations.
      *     *   If an endpoint group cannot be queried, the endpoint group is deleted.
      * *   The **DeleteEndpointGroups** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteEndpointGroupsResponse> deleteEndpointGroups(DeleteEndpointGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEndpointGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEndpointGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEndpointGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteForwardingRules** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListForwardingRules](~~205817~~) operation to query the status of the task.
      *     *   If a forwarding rule is in the **deleting** state, the forwarding rule is being deleted. In this case, you can perform only query operations.
      *     *   If a forwarding rule cannot be queried, the forwarding rule is deleted.
      * *   The **DeleteForwardingRules** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteForwardingRulesResponse> deleteForwardingRules(DeleteForwardingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteForwardingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteForwardingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteForwardingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteIpSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeIpSet](~~153246~~) operation to query the status of an acceleration region.
      *     *   If the acceleration region is in the **deleting** state, it indicates that the acceleration region is being deleted. In this case, you can perform only query operations.
      *     *   If the acceleration region cannot be queried, it indicates that the acceleration region is deleted.
      * *   The **DeleteIpSet** operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<DeleteIpSetResponse> deleteIpSet(DeleteIpSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIpSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIpSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIpSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteIpSets** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeIpSet](~~153246~~) operation to query the status of the task.
      *     *   If the acceleration region is in the **deleting** state, the acceleration region is being deleted. In this case, you can perform only query operations.
      *     *   If you cannot query the acceleration region, the acceleration region is deleted.
      * *   You cannot repeatedly call the **DeleteIpSets** operation for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteIpSetsResponse> deleteIpSets(DeleteIpSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIpSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIpSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIpSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Before you call the **DeleteListener** operation, make sure that no endpoint groups are associated with the listener that you want to delete. For information about how to delete an endpoint group, see the following topics:
      *     *   [DeleteEndpointGroup](~~2253305~~): deletes an endpoint group that is associated with an intelligent routing listener.
      *     *   [DeleteEndpointGroups](~~2253311~~): deletes multiple endpoint groups that are associated with intelligent routing listeners at the same time.
      *     *   [DeleteCustomRoutingEndpointGroups](~~2303183~~): deletes multiple endpoint groups that are associated with custom routing listeners at the same time.
      * *   **DeleteListener** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeListener](~~153254~~) operation to query the status of the listener.
      *     *   If the listener is in the **deleting** state, the listener is being deleted. In this case, you can perform only query operations.
      *     *   If the listener cannot be queried, the listener is deleted.
      * *   You cannot repeatedly call the **DeleteListener** operation to delete the listeners of the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteListenerResponse> deleteListener(DeleteListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteSpareIps** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) operation to query the status of a GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that the secondary IP addresses for the CNAME are being deleted. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state and the secondary IP addresses for the CNAME cannot be queried by calling the [ListSpareIps](~~262121~~) operation, it indicates that the IP addresses are deleted.
      * *   The **DeleteSpareIps** operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<DeleteSpareIpsResponse> deleteSpareIps(DeleteSpareIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSpareIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSpareIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSpareIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAcceleratorResponse> describeAccelerator(DescribeAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAcceleratorAutoRenewAttributeResponse> describeAcceleratorAutoRenewAttribute(DescribeAcceleratorAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAcceleratorAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAcceleratorAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAcceleratorAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAcceleratorServiceStatusResponse> describeAcceleratorServiceStatus(DescribeAcceleratorServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAcceleratorServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAcceleratorServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAcceleratorServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeApplicationMonitorResponse> describeApplicationMonitor(DescribeApplicationMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeApplicationMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeApplicationMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeApplicationMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeBandwidthPackageResponse> describeBandwidthPackage(DescribeBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeBandwidthPackageAutoRenewAttributeResponse> describeBandwidthPackageAutoRenewAttribute(DescribeBandwidthPackageAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBandwidthPackageAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBandwidthPackageAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBandwidthPackageAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCommodityResponse> describeCommodity(DescribeCommodityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommodity").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCommodityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCommodityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call the [DescribeCommodity](~~2253233~~) operation to query information about the commodity modules.
      *
     */
    @Override
    public CompletableFuture<DescribeCommodityPriceResponse> describeCommodityPrice(DescribeCommodityPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommodityPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCommodityPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCommodityPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCustomRoutingEndPointTrafficPolicyResponse> describeCustomRoutingEndPointTrafficPolicy(DescribeCustomRoutingEndPointTrafficPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomRoutingEndPointTrafficPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomRoutingEndPointTrafficPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomRoutingEndPointTrafficPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCustomRoutingEndpointResponse> describeCustomRoutingEndpoint(DescribeCustomRoutingEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomRoutingEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomRoutingEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomRoutingEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCustomRoutingEndpointGroupResponse> describeCustomRoutingEndpointGroup(DescribeCustomRoutingEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomRoutingEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomRoutingEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomRoutingEndpointGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCustomRoutingEndpointGroupDestinationsResponse> describeCustomRoutingEndpointGroupDestinations(DescribeCustomRoutingEndpointGroupDestinationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomRoutingEndpointGroupDestinations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomRoutingEndpointGroupDestinationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomRoutingEndpointGroupDestinationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeEndpointGroupResponse> describeEndpointGroup(DescribeEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEndpointGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeIpSetResponse> describeIpSet(DescribeIpSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIpSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIpSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIpSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is used to query configuration information about a listener of a GA instance. The information includes the routing type of the listener, the status of the listener, the timestamp that indicates when the listener was created, and the listener ports.
      *
     */
    @Override
    public CompletableFuture<DescribeListenerResponse> describeListener(DescribeListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeLogStoreOfEndpointGroupResponse> describeLogStoreOfEndpointGroup(DescribeLogStoreOfEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLogStoreOfEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLogStoreOfEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLogStoreOfEndpointGroupResponse> future = new CompletableFuture<>();
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

    /**
      * *   The **DetachDdosFromAccelerator** operation is asynchronous. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) or [ListAccelerators](~~153236~~) operation to query the status of the GA instance.
      *     *   If the GA instance is in the **configuring** state, the Anti-DDoS Pro/Premium instance is being disassociated from the GA instance. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, the Anti-DDoS Pro/Premium instance is disassociated from the GA instance.
      * *   **DetachDdosFromAccelerator** cannot be repeatedly called for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DetachDdosFromAcceleratorResponse> detachDdosFromAccelerator(DetachDdosFromAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachDdosFromAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachDdosFromAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachDdosFromAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   **DetachLogStoreFromEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, the Log Service Logstore is being disassociated from the endpoint group. In this case, you can perform only query operations.
      *     <!---->
      *     *   If the endpoint group is in the **active** state, the Log Service Logstore is disassociated from the endpoint group.
      * *   The **DetachLogStoreFromEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DetachLogStoreFromEndpointGroupResponse> detachLogStoreFromEndpointGroup(DetachLogStoreFromEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachLogStoreFromEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachLogStoreFromEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachLogStoreFromEndpointGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetectApplicationMonitorResponse> detectApplicationMonitor(DetectApplicationMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetectApplicationMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetectApplicationMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetectApplicationMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableApplicationMonitorResponse> disableApplicationMonitor(DisableApplicationMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableApplicationMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableApplicationMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableApplicationMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   **DissociateAclsFromListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of a listener:
      *     *   If the listener is in the **updating** state, ACLs are being disassociated from the listener. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, ACLs are disassociated from the listener.
      * *   The **DissociateAclsFromListener** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DissociateAclsFromListenerResponse> dissociateAclsFromListener(DissociateAclsFromListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateAclsFromListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateAclsFromListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateAclsFromListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   **DissociateAdditionalCertificatesFromListener** is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the [DescribeListener](~~153254~~) operation to query the state of an HTTPS listener.
      *     *   If the listener is in the **updating** state, it indicates that the additional certificate is being dissociated from the listener. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that the additional certificate is dissociated from the listener.
      * *   The **DissociateAdditionalCertificatesFromListener** operation cannot be repeatedly called for the same Global Accelerator (GA) instance with a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DissociateAdditionalCertificatesFromListenerResponse> dissociateAdditionalCertificatesFromListener(DissociateAdditionalCertificatesFromListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateAdditionalCertificatesFromListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateAdditionalCertificatesFromListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateAdditionalCertificatesFromListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnableApplicationMonitorResponse> enableApplicationMonitor(EnableApplicationMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableApplicationMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableApplicationMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableApplicationMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetAclResponse> getAcl(GetAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetBasicAccelerateIpResponse> getBasicAccelerateIp(GetBasicAccelerateIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBasicAccelerateIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBasicAccelerateIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBasicAccelerateIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetBasicAccelerateIpEndpointRelationResponse> getBasicAccelerateIpEndpointRelation(GetBasicAccelerateIpEndpointRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBasicAccelerateIpEndpointRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBasicAccelerateIpEndpointRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBasicAccelerateIpEndpointRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetBasicAccelerateIpIdleCountResponse> getBasicAccelerateIpIdleCount(GetBasicAccelerateIpIdleCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBasicAccelerateIpIdleCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBasicAccelerateIpIdleCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBasicAccelerateIpIdleCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetBasicAcceleratorResponse> getBasicAccelerator(GetBasicAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBasicAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBasicAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBasicAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetBasicEndpointResponse> getBasicEndpoint(GetBasicEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBasicEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBasicEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBasicEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetBasicEndpointGroupResponse> getBasicEndpointGroup(GetBasicEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBasicEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBasicEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBasicEndpointGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetBasicIpSetResponse> getBasicIpSet(GetBasicIpSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetBasicIpSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetBasicIpSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetBasicIpSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetHealthStatusResponse> getHealthStatus(GetHealthStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetHealthStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetHealthStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetHealthStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetInvalidDomainCountResponse> getInvalidDomainCount(GetInvalidDomainCountRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInvalidDomainCount").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInvalidDomainCountResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInvalidDomainCountResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetIpsetsBandwidthLimitResponse> getIpsetsBandwidthLimit(GetIpsetsBandwidthLimitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIpsetsBandwidthLimit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIpsetsBandwidthLimitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIpsetsBandwidthLimitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetSpareIpResponse> getSpareIp(GetSpareIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSpareIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSpareIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSpareIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListAccelerateAreasResponse> listAccelerateAreas(ListAccelerateAreasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAccelerateAreas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAccelerateAreasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAccelerateAreasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListAcceleratorsResponse> listAccelerators(ListAcceleratorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAccelerators").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAcceleratorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAcceleratorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListAclsResponse> listAcls(ListAclsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAcls").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAclsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAclsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListApplicationMonitorResponse> listApplicationMonitor(ListApplicationMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApplicationMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListApplicationMonitorDetectResultResponse> listApplicationMonitorDetectResult(ListApplicationMonitorDetectResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListApplicationMonitorDetectResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListApplicationMonitorDetectResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListApplicationMonitorDetectResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListAvailableAccelerateAreasResponse> listAvailableAccelerateAreas(ListAvailableAccelerateAreasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAvailableAccelerateAreas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvailableAccelerateAreasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvailableAccelerateAreasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListAvailableBusiRegionsResponse> listAvailableBusiRegions(ListAvailableBusiRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAvailableBusiRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvailableBusiRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvailableBusiRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListBandwidthPackagesResponse> listBandwidthPackages(ListBandwidthPackagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBandwidthPackages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBandwidthPackagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBandwidthPackagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * To query the detailed information about a bandwidth plan, call the **ListBandwidthPackages** operation. For more information, see [ListBandwidthPackages](~~2253239~~).
      *
     */
    @Override
    public CompletableFuture<ListBandwidthackagesResponse> listBandwidthackages(ListBandwidthackagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBandwidthackages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBandwidthackagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBandwidthackagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListBasicAccelerateIpEndpointRelationsResponse> listBasicAccelerateIpEndpointRelations(ListBasicAccelerateIpEndpointRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBasicAccelerateIpEndpointRelations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBasicAccelerateIpEndpointRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBasicAccelerateIpEndpointRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListBasicAccelerateIpsResponse> listBasicAccelerateIps(ListBasicAccelerateIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBasicAccelerateIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBasicAccelerateIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBasicAccelerateIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListBasicAcceleratorsResponse> listBasicAccelerators(ListBasicAcceleratorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBasicAccelerators").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBasicAcceleratorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBasicAcceleratorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListBasicEndpointsResponse> listBasicEndpoints(ListBasicEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBasicEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBasicEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBasicEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListBusiRegionsResponse> listBusiRegions(ListBusiRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBusiRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBusiRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBusiRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query the acceleration areas and regions that you can specify on the wizard page of Global Accelerator (GA) and for free-trial GA instances. You can filter acceleration areas and regions based on specified conditions.
      *
     */
    @Override
    public CompletableFuture<ListCommonAreasResponse> listCommonAreas(ListCommonAreasRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCommonAreas").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCommonAreasResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCommonAreasResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListCustomRoutingEndpointGroupDestinationsResponse> listCustomRoutingEndpointGroupDestinations(ListCustomRoutingEndpointGroupDestinationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomRoutingEndpointGroupDestinations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomRoutingEndpointGroupDestinationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomRoutingEndpointGroupDestinationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Debugging
      * [OpenAPI Explorer automatically calculates the signature value. For your convenience, we recommend that you call this operation in OpenAPI Explorer. OpenAPI Explorer dynamically generates the sample code for different SDKs.](https://api.aliyun.com/#product=Ga\\&api=ListCustomRoutingEndpointGroups\\&type=RPC\\&version=2019-11-20)
      *
     */
    @Override
    public CompletableFuture<ListCustomRoutingEndpointGroupsResponse> listCustomRoutingEndpointGroups(ListCustomRoutingEndpointGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomRoutingEndpointGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomRoutingEndpointGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomRoutingEndpointGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListCustomRoutingEndpointTrafficPoliciesResponse> listCustomRoutingEndpointTrafficPolicies(ListCustomRoutingEndpointTrafficPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomRoutingEndpointTrafficPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomRoutingEndpointTrafficPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomRoutingEndpointTrafficPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListCustomRoutingEndpointsResponse> listCustomRoutingEndpoints(ListCustomRoutingEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomRoutingEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomRoutingEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomRoutingEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you configure a custom routing listener for a Global Accelerator (GA) instance, the instance generates a port mapping table based on the listener port range, backend service protocols and port ranges of the associated endpoint groups, and IP addresses of endpoints (vSwitches). The custom routing listener forwards client requests to specified IP addresses and ports in the vSwitches based on the port mapping table. This operation is used to query the generated port mapping table.
      *
     */
    @Override
    public CompletableFuture<ListCustomRoutingPortMappingsResponse> listCustomRoutingPortMappings(ListCustomRoutingPortMappingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomRoutingPortMappings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomRoutingPortMappingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomRoutingPortMappingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListCustomRoutingPortMappingsByDestinationResponse> listCustomRoutingPortMappingsByDestination(ListCustomRoutingPortMappingsByDestinationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListCustomRoutingPortMappingsByDestination").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListCustomRoutingPortMappingsByDestinationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListCustomRoutingPortMappingsByDestinationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListDomainsResponse> listDomains(ListDomainsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDomains").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDomainsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDomainsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListEndpointGroupIpAddressCidrBlocksResponse> listEndpointGroupIpAddressCidrBlocks(ListEndpointGroupIpAddressCidrBlocksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEndpointGroupIpAddressCidrBlocks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEndpointGroupIpAddressCidrBlocksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEndpointGroupIpAddressCidrBlocksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListEndpointGroupsResponse> listEndpointGroups(ListEndpointGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEndpointGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEndpointGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEndpointGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  This operation is used to query only custom forwarding rules, not the default forwarding rule.
      *
     */
    @Override
    public CompletableFuture<ListForwardingRulesResponse> listForwardingRules(ListForwardingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListForwardingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListForwardingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListForwardingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListIpSetsResponse> listIpSets(ListIpSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIpSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIpSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIpSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListIspTypesResponse> listIspTypes(ListIspTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIspTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIspTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIspTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListListenerCertificatesResponse> listListenerCertificates(ListListenerCertificatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListListenerCertificates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListListenerCertificatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListListenerCertificatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is used to query information about the listeners of a GA instance, including the status of each listener, the timestamp that indicates when each listener was created, and the listener ports.
      *
     */
    @Override
    public CompletableFuture<ListListenersResponse> listListeners(ListListenersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListListeners").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListListenersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListListenersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListSpareIpsResponse> listSpareIps(ListSpareIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSpareIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSpareIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSpareIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can select a TLS security policy when you create an HTTPS listener. This API operation is used to query the TLS security policies that are supported by HTTPS listeners.
      *
     */
    @Override
    public CompletableFuture<ListSystemSecurityPoliciesResponse> listSystemSecurityPolicies(ListSystemSecurityPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSystemSecurityPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSystemSecurityPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSystemSecurityPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You must specify **ResourceId** or **Tag** in the request to specify the object that you want to query.********
      * *   **Tag** is a resource tag that consists of a key-value pair (Key and Value). If you specify only **Key**, all tag values that are associated with the specified tag key are returned. If you specify only **Value**, an error message is returned.
      * *   If you specify **Tag** and **ResourceId** to filter tags, **ResourceId** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain the key-value pairs are returned.
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
    public CompletableFuture<OpenAcceleratorServiceResponse> openAcceleratorService(OpenAcceleratorServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenAcceleratorService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenAcceleratorServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenAcceleratorServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<QueryCrossBorderApprovalStatusResponse> queryCrossBorderApprovalStatus(QueryCrossBorderApprovalStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("QueryCrossBorderApprovalStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(QueryCrossBorderApprovalStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<QueryCrossBorderApprovalStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **RemoveEntriesFromAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetAcl](~~258292~~) or [ListAcls](~~258291~~) operation to query the status of the ACL from which you want to delete IP entries.
      *     *   If the ACL is in the **configuring** state, it indicates that the IP entries are being deleted. In this case, you can perform only query operations.
      *     *   If the ACL is in the **active** state, it indicates that the IP entries are deleted.
      * *   The **RemoveEntriesFromAcl** operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<RemoveEntriesFromAclResponse> removeEntriesFromAcl(RemoveEntriesFromAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveEntriesFromAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveEntriesFromAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveEntriesFromAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   The GA instance continues to forward network traffic.
      * *   **ReplaceBandwidthPackage** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) or [ListAccelerators](~~153236~~) operation to query the status of the GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that the associated bandwidth plan is being replaced. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, it indicates that the associated bandwidth plan is replaced.
      * *   The **ReplaceBandwidthPackage** operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<ReplaceBandwidthPackageResponse> replaceBandwidthPackage(ReplaceBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReplaceBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplaceBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplaceBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Description
      * You can add up to 20 tags to each GA resource. When you call this operation, Alibaba Cloud first checks the number of existing tags attached to the resource. If the quota is reached, an error message is returned.
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
    public CompletableFuture<UntagResourcesResponse> untagResources(UntagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **UpdateAccelerator** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) operation to query the status of a GA instance.
      *     *   If the GA instance is in the **configuring** state, the GA instance is being modified. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, the GA instance is modified.
      * *   The **UpdateAccelerator** operation cannot be repeatedly called for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateAcceleratorResponse> updateAccelerator(UpdateAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **UpdateAcceleratorAutoRenewAttribute** operation for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateAcceleratorAutoRenewAttributeResponse> updateAcceleratorAutoRenewAttribute(UpdateAcceleratorAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAcceleratorAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAcceleratorAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAcceleratorAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you modify the specification of a GA instance, you must confirm the modification. The **UpdateAcceleratorConfirm** operation is used to confirm the specification of a GA instance that is modified. When you call this operation to confirm the specification of a GA instance, take note of the following items:
      * *   **UpdateAcceleratorConfirm** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) operation to query the status of a GA instance.
      *     *   If the GA instance is in the **configuring** state, it indicates that the specification of the instance is being modified. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, it indicates that the specification of the instance is modified.
      * *   The **UpdateAcceleratorConfirm** operation cannot be called repeatedly for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateAcceleratorConfirmResponse> updateAcceleratorConfirm(UpdateAcceleratorConfirmRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAcceleratorConfirm").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAcceleratorConfirmResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAcceleratorConfirmResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to change the type of transmission network for a **standard** GA instance whose bandwidth metering method is **pay-by-data-transfer**. Before you call this operation, make sure that the following requirements are met:
      * *   Cloud Data Transfer (CDT) is activated. When you call the [CreateAccelerator](~~206786~~) operation and set **BandwidthBillingType** to **CDT** to create a **standard** GA instance whose bandwidth metering method is **pay-by-data-transfer**, CDT is automatically activated. The data transfer fees are managed by CDT.
      * *   If you want to set **CrossBorderMode** to **private**, which specifies cross-border Express Connect circuit as the type of transmission network, make sure that real-name verification is complete for your enterprise account. For more information, see [Real-name verification](~~52595~~).
      *
     */
    @Override
    public CompletableFuture<UpdateAcceleratorCrossBorderModeResponse> updateAcceleratorCrossBorderMode(UpdateAcceleratorCrossBorderModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAcceleratorCrossBorderMode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAcceleratorCrossBorderModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAcceleratorCrossBorderModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can use this operation to enable or disable the cross-border data transmission feature for a GA instance. Before you enable the cross-border data transmission feature, make sure that the following requirements are met:
      * - **Basic GA instances**:
      * Cloud Data Transfer (CDT) is activated. When you call the CreateBasicAccelerator operation to create a basic GA instance, set BandwidthBillingType to CDT. Then, the system automatically activates CDT. The data transfer fees are managed by CDT.
      * If you want to enable the cross-border data transmission feature, make sure that the current account has completed enterprise real-name registration. For more information, see Real-name registration FAQs.
      * - **Standard GA instances**:
      * CDT is activated. When you call the CreateAccelerator operation to create a standard GA instance, set BandwidthBillingType to CDT. Then, the system automatically activates CDT. The data transfer fees are managed by CDT.
      *
     */
    @Override
    public CompletableFuture<UpdateAcceleratorCrossBorderStatusResponse> updateAcceleratorCrossBorderStatus(UpdateAcceleratorCrossBorderStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAcceleratorCrossBorderStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAcceleratorCrossBorderStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAcceleratorCrossBorderStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateAclAttributeResponse> updateAclAttribute(UpdateAclAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAclAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAclAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAclAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The UpdateAdditionalCertificateWithListener operation is used to replace an additional certificate. You can use this operation when you want to replace an expired additional certificate with a new additional certificate without changing the associated domain name.
      * *   **UpdateAdditionalCertificateWithListener** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can use the [ListListenerCertificates](~~307743~~) operation to query the state of the additional certificate that is associated with an HTTP listener:
      *     *   If the certificate that you want to replace is in the **updating** state, it is being replaced for the HTTP listener. In this case, you can perform only query operations.
      *     *   If the replacement certificate is in the **active** state, it indicates that the replacement operation is complete and the replacement certificate is associated with the HTTP listener.
      * *   You cannot perform the **UpdateAdditionalCertificateWithListener** operation again on the same Global Accelerator (GA) instance before the previous operation is complete.
      *
     */
    @Override
    public CompletableFuture<UpdateAdditionalCertificateWithListenerResponse> updateAdditionalCertificateWithListener(UpdateAdditionalCertificateWithListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateAdditionalCertificateWithListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateAdditionalCertificateWithListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateAdditionalCertificateWithListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **UpdateApplicationMonitor** is an asynchronous operation. After you send a request, the system returns a request ID, but this operation is still being performed in the system background. You can call the [DescribeApplicationMonitor](~~408463~~) or [ListApplicationMonitor](~~408462~~) operation to check whether the configurations of an origin probing task are modified.
      * *   If the values of modified parameters remain unchanged, it indicates that the origin probing task is being modified. In this case, you can perform only query operations.
      * *   If the values of modified parameters change, it indicates that the origin probing task is modified.
      *
     */
    @Override
    public CompletableFuture<UpdateApplicationMonitorResponse> updateApplicationMonitor(UpdateApplicationMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateApplicationMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateApplicationMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateApplicationMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **UpdateBandwidthPackagaAutoRenewAttribute** operation to modify the auto-renewal settings of a bandwidth plan.
      *
     */
    @Override
    public CompletableFuture<UpdateBandwidthPackagaAutoRenewAttributeResponse> updateBandwidthPackagaAutoRenewAttribute(UpdateBandwidthPackagaAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBandwidthPackagaAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBandwidthPackagaAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBandwidthPackagaAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Take note of the following items:
      * *   **UpdateBandwidthPackage** is a synchronous operation when you call the operation to modify the configuration excluding the bandwidth value of a bandwidth plan. The new configuration immediately takes effect after the operation is performed.
      * *   **UpdateBandwidthPackage** is an asynchronous operation when you call the operation to modify the configuration including the bandwidth value of a bandwidth plan that is not associated with a Global Accelerator (GA) instance. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeBandwidthPackage](~~153241~~) operation to query the status of the task.
      *     *   If the parameter values of the bandwidth plan remain unchanged, the bandwidth plan is being modified. In this case, you can perform only query operations.
      *     *   If the parameter values of the bandwidth plan are changed, the bandwidth plan is modified.
      * *   **UpdateBandwidthPackage** is an asynchronous operation when you call the operation to modify the configuration including the bandwidth value of a bandwidth plan that is associated with a GA instance. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeAccelerator](~~153235~~) operation to query the status of the task.
      *     *   If the GA instance is in the **configuring** state, the bandwidth plan is being modified. In this case, you can perform only query operations.
      *     *   If the GA instance is in the **active** state, the bandwidth plan is modified.
      * *   You cannot repeatedly call the **UpdateBandwidthPackage** operation for the same bandwidth plan within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateBandwidthPackageResponse> updateBandwidthPackage(UpdateBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateBasicAcceleratorResponse> updateBasicAccelerator(UpdateBasicAcceleratorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBasicAccelerator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBasicAcceleratorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBasicAcceleratorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateBasicEndpointResponse> updateBasicEndpoint(UpdateBasicEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBasicEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBasicEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBasicEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **UpdateBasicEndpointGroup** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. The system modifies the configurations of an endpoint group that is associated with a basic GA instance by deleting the endpoint group and creating a new endpoint group. You can call the [GetBasicAccelerator](~~353188~~) operation to query the status of the task.
      *     *   If the basic GA instance is in the **configuring** state, the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If the basic GA instance is in the **active** state, the configurations of the endpoint group are modified.
      * *   The **UpdateBasicEndpointGroup** operation cannot be repeatedly called for the same basic GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateBasicEndpointGroupResponse> updateBasicEndpointGroup(UpdateBasicEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBasicEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBasicEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBasicEndpointGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, take note of the following limits:
      * *   You can modify the bandwidth of an acceleration region of a basic GA instance only if the bandwidth metering method of the basic GA instance is **pay-by-data-transfer**.
      * *   **UpdateBasicIpSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetBasicIpSet](~~362987~~) operation to query the status of the task.
      *     *   If the acceleration region is in the **updating** state, it indicates that the bandwidth of the acceleration region is being modified. In this case, you can perform only query operations.
      *     *   If the acceleration region is in the **active** state, it indicates that the bandwidth of the acceleration region is modified.
      * *   You cannot repeatedly call the **UpdateBasicIpSet** operation for the same basic GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateBasicIpSetResponse> updateBasicIpSet(UpdateBasicIpSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateBasicIpSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateBasicIpSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateBasicIpSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateCustomRoutingEndpointGroupAttributeResponse> updateCustomRoutingEndpointGroupAttribute(UpdateCustomRoutingEndpointGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomRoutingEndpointGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomRoutingEndpointGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomRoutingEndpointGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **UpdateCustomRoutingEndpointGroupDestinations** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the status of an endpoint group associated with a custom routing listener to check whether the mapping configurations of the endpoint group are modified.
      *     *   If the endpoint group is in the **updating** state, the mapping configurations of the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, the mapping configurations of the endpoint group are modified.
      * *   The **UpdateCustomRoutingEndpointGroupDestinations** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateCustomRoutingEndpointGroupDestinationsResponse> updateCustomRoutingEndpointGroupDestinations(UpdateCustomRoutingEndpointGroupDestinationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomRoutingEndpointGroupDestinations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomRoutingEndpointGroupDestinationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomRoutingEndpointGroupDestinationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **UpdateCustomRoutingEndpointTrafficPolicies** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the status of the task.
      *     *   If the endpoint group is in the **updating** state, traffic policies are being modified for endpoints in the endpoint group. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, traffic policies are modified for endpoints in the endpoint group.
      * *   The **UpdateCustomRoutingEndpointTrafficPolicies** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateCustomRoutingEndpointTrafficPoliciesResponse> updateCustomRoutingEndpointTrafficPolicies(UpdateCustomRoutingEndpointTrafficPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomRoutingEndpointTrafficPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomRoutingEndpointTrafficPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomRoutingEndpointTrafficPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   **UpdateCustomRoutingEndpoints** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeCustomRoutingEndpointGroup](~~449373~~) operation to query the state of the endpoint groups associated with a custom routing listener to check whether the endpoints in the endpoint groups are modified.
      *     *   If an endpoint group is in the **updating** state, the endpoints in the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If an endpoint group is in the **active** state, the endpoints in the endpoint group are modified.
      * *   The **UpdateCustomRoutingEndpoints** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateCustomRoutingEndpointsResponse> updateCustomRoutingEndpoints(UpdateCustomRoutingEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateCustomRoutingEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateCustomRoutingEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateCustomRoutingEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to modify an accelerated domain name. If the new accelerated domain name is hosted in the Chinese mainland, you must obtain an Internet content provider (ICP) number for the domain name.
      * You cannot call the **UpdateDomain** operation again by using the same Alibaba Cloud account before the previous request is completed.
      *
     */
    @Override
    public CompletableFuture<UpdateDomainResponse> updateDomain(UpdateDomainRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDomain").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDomainResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDomainResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query and update the ICP filing status of an accelerated domain name.
      * The **UpdateDomainState** operation holds an exclusive lock on the GA instance. While the operation is in progress, you cannot call the same operation with the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<UpdateDomainStateResponse> updateDomainState(UpdateDomainStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDomainState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDomainStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDomainStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **UpdateEndpointGroup** is an asynchronous operation. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call the [DescribeEndpointGroup](~~153260~~) operation to query the state of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, it indicates that the configurations of the endpoint group are being modified. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that the configurations of the endpoint group are modified.
      * *   The **UpdateEndpointGroup** operation cannot be repeatedly called for the same Global Accelerator (GA) instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateEndpointGroupResponse> updateEndpointGroup(UpdateEndpointGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEndpointGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEndpointGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEndpointGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateEndpointGroupAttributeResponse> updateEndpointGroupAttribute(UpdateEndpointGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEndpointGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEndpointGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEndpointGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### Description
      * *   **UpdateEndpointGroups** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEndpointGroup](~~153260~~) or [ListEndpointGroups](~~153261~~) operation to query the status of an endpoint group.
      *     *   If the endpoint group is in the **updating** state, it indicates that the configuration of the endpoint group is being modified. In this case, you can perform only query operations.
      *     *   If the endpoint group is in the **active** state, it indicates that the configuration of the endpoint group is modified.
      * *   The **UpdateEndpointGroups** operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<UpdateEndpointGroupsResponse> updateEndpointGroups(UpdateEndpointGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEndpointGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEndpointGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEndpointGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **UpdateForwardingRules** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListForwardingRules](~~205817~~) operation to query the status of a forwarding rule.
      *     *   If the forwarding rule is in the **configuring** state, it indicates that the forwarding rule is being modified. In this case, you can perform only query operations.
      *     *   If the forwarding rule is in the **active** state, it indicates that the forwarding rule is modified.
      * *   The **UpdateForwardingRules** operation holds an exclusive lock on the Global Accelerator (GA) instance. While the operation is in progress, you cannot call the same operation in the same Alibaba Cloud account.
      *
     */
    @Override
    public CompletableFuture<UpdateForwardingRulesResponse> updateForwardingRules(UpdateForwardingRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateForwardingRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateForwardingRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateForwardingRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **UpdateIpSet** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeIpSet](~~153246~~) operation to query the status of an acceleration region.
      *     *   If the acceleration region is in the **updating** state, it indicates that the acceleration region is being modified. In this case, you can continue to perform query operations on the acceleration regions.
      *     *   If the acceleration region is in the **active** state, it indicates that the acceleration region is modified.
      * *   You cannot call the **UpdateIpSet** operation again on the same GA instance before the previous operation is complete.
      *
     */
    @Override
    public CompletableFuture<UpdateIpSetResponse> updateIpSet(UpdateIpSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateIpSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIpSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIpSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **UpdateIpSets** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeIpSet](~~153246~~) operation to query the status of the task.
      *     *   If an acceleration region is in the **updating** state, the acceleration region is being modified. In this case, you can perform only query operations.
      *     *   If an acceleration region is in the **active** state, the acceleration region is modified.
      * *   You cannot repeatedly call the **UpdateIpSets** operation for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateIpSetsResponse> updateIpSets(UpdateIpSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateIpSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIpSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIpSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation can be called to modify the configurations such as the protocol and ports of a listener to meet your business requirements.
      * When you call this operation, take note of the following items:
      * *   **UpdateListener** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeListener](~~153254~~) operation to query the status of a listener.
      *     *   If the listener is in the **updating** state, it indicates that its configurations are being modified. In this case, you can perform only query operations.
      *     *   If the listener is in the **active** state, it indicates that its configurations are modified.
      * *   The **UpdateListener** operation cannot be repeatedly called to modify listener configurations for the same GA instance within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateListenerResponse> updateListener(UpdateListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   This operation is applicable only to **managed** Global Accelerator (GA) instances.
      * *   After you change the control mode of a GA instance from managed mode to unmanaged mode, you cannot change the mode of the instance to managed mode.
      * *   After you change the control mode of a GA instance from managed mode to unmanaged mode, you can obtain all operation permissions on the instance.
      *   <warning>If you change or delete a configuration of a GA instance whose control mode is changed from managed mode to unmanaged mode, the cloud services that depend on the instance may not work as expected. Proceed with caution.></warning>
      *
     */
    @Override
    public CompletableFuture<UpdateServiceManagedControlResponse> updateServiceManagedControl(UpdateServiceManagedControlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateServiceManagedControl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServiceManagedControlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServiceManagedControlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
