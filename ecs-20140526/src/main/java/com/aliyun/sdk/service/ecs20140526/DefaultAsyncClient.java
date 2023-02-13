// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.ecs20140526.models.*;
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
        this.product = "Ecs";
        this.version = "2014-05-26";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-hangzhou", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "ecs.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "ecs.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-edge-1", "ecs.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-fujian", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "ecs.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "ecs.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "ecs.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "ecs.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "ecs.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-wuhan", "ecs.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "ecs.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "ecs.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "ecs-cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "ecs.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "ecs.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "ecs.cn-shenzhen-cloudstone.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "ecs.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    @Override
    public CompletableFuture<AcceptInquiredSystemEventResponse> acceptInquiredSystemEvent(AcceptInquiredSystemEventRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AcceptInquiredSystemEvent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AcceptInquiredSystemEventResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AcceptInquiredSystemEventResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ActivateRouterInterfaceResponse> activateRouterInterface(ActivateRouterInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActivateRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActivateRouterInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActivateRouterInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<AddBandwidthPackageIpsResponse> addBandwidthPackageIps(AddBandwidthPackageIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddBandwidthPackageIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddBandwidthPackageIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddBandwidthPackageIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   Up to 20 tags can be added to each ECS resource.
      * *   `Tag.N.Key` must match `Tag.N.Value` based on the value of N.
      * *   If you add a tag that has the same key (`Tag.N.Key`) as an existing tag on the specified resource, the new tag value (`Tag.N.Value`) overwrites the original tag value.
      *
     */
    @Override
    public CompletableFuture<AddTagsResponse> addTags(AddTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you create a dedicated host, you can call the [DescribeAvailableResource](~~66186~~) operation to query the available resources in a specific region or zone.
      * We recommend that you understand the billing methods of resources before you create a dedicated host. You are charged for resources used by the created dedicated host. For more information, see [Billing overview](~~68978~~).
      * * You can create up to 100 pay-as-you-go or subscription dedicated hosts at a time.
      * * After a dedicated host is created, you can use its ID that is returned by the system as the value of a request parameter to call the [DescribeDedicatedHosts](~~134242~~) operation to query the state of the dedicated host.
      * * After you submit a request to create a dedicated host, an error is returned if a specific parameter is invalid or the requested resources are insufficient. For more information about error reasons, see the "Error codes" section in this topic.
      * * After a dedicated host is created, you can call the [ModifyInstanceDeployment](~~134248~~) operation to migrate ECS instances from a shared host to the dedicated host. You can also migrate ECS instances from another dedicated host to the created dedicated host.
      *
     */
    @Override
    public CompletableFuture<AllocateDedicatedHostsResponse> allocateDedicatedHosts(AllocateDedicatedHostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateDedicatedHosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateDedicatedHostsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateDedicatedHostsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<AllocateEipAddressResponse> allocateEipAddress(AllocateEipAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateEipAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateEipAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   The instance to which to assign a public IP address must be in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      * *   If `OperationLocks` in the DescribeInstances response contains `"LockReason" : "security"` for an instance, the instance is [locked for security reasons](~~25695~~) and cannot be assigned a public IP address.
      * *   You can assign only a single public IP address to an instance. If the instance already has a public IP address, the `AllocatedAlready` error code is returned.
      * *   After you assign a public IP address to an instance, you must restart the instance ([RebootInstance](~~25502~~)) or start the instance ([StartInstance](~~25500~~)) for the public IP address to take effect.
      * If an instance is located in a virtual private cloud (VPC), you can assign a public IP address to the instance or associate an elastic IP address (EIP) with the instance. For more information, see [AssociateEipAddress](~~36017~~).
      * > After an EIP is associated with an instance located in a VPC, no public IP addresses can be assigned to the instance.
      *
     */
    @Override
    public CompletableFuture<AllocatePublicIpAddressResponse> allocatePublicIpAddress(AllocatePublicIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocatePublicIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocatePublicIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocatePublicIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Each disk can have only one automatic snapshot policy applied.
      * *   A single automatic snapshot policy can be applied to multiple disks.
      *
     */
    @Override
    public CompletableFuture<ApplyAutoSnapshotPolicyResponse> applyAutoSnapshotPolicy(ApplyAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can specify IPv6 addresses that are in the CIDR block of the vSwitch with which the ENI is associated, or specify the number of IPv6 addresses to automatically generate for the ENI. When you call this operation, take note of the following items:
      * *   IPv6 must be enabled for the vSwitch with which the ENI is associated. For more information, see [Enable IPv6 for a vSwitch](~~98923~~).
      * *   The ENI must be in the Available (Available) or InUse (InUse) state.
      * *   If you want to assign IPv6 addresses to a primary ENI, make sure that the instance to which the ENI is attached is in the Running (Running) or Stopped (Stopped) state.
      * *   The maximum number of IPv6 addresses that can be assigned to an ENI varies per instance type.
      *     *   If the ENI is in the Available (Available) state, it can be assigned a maximum of 10 IPv6 addresses.
      *     *   If the ENI is already attached to an Elastic Compute Service (ECS) instance, the maximum number of IPv6 addresses that can be assigned to the ENI varies based on the instance type. For more information, see [Overview of instance families](~~25378~~).
      * *   After the operation is called, you can obtain the IPv6 addresses that are assigned to the ENI from the response.
      *
     */
    @Override
    public CompletableFuture<AssignIpv6AddressesResponse> assignIpv6Addresses(AssignIpv6AddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignIpv6Addresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignIpv6AddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignIpv6AddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   The ENI to which you want to assign secondary private IP addresses must be in the Available (Available) or InUse (InUse) state.
      * *   When you assign secondary private IP addresses to a primary ENI, the instance to which the ENI is attached must be in the Running (Running) or Stopped (Stopped) state.
      * *   When an ENI is in the Available (Available) state, you can assign up to 50 secondary private IP addresses to it. When an ENI is attached to an instance, the number of secondary private IP addresses that can be assigned to the ENI is subject to the instance type. For more information, see [Instance families](~~25378~~).
      * *   After you call this operation for an ENI, you can obtain the secondary private IP addresses that are assigned to the ENI from the response.
      *
     */
    @Override
    public CompletableFuture<AssignPrivateIpAddressesResponse> assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssignPrivateIpAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssignPrivateIpAddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssignPrivateIpAddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<AssociateEipAddressResponse> associateEipAddress(AssociateEipAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateEipAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateEipAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<AssociateHaVipResponse> associateHaVip(AssociateHaVipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateHaVipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateHaVipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * When you call this operation, take note of the following items:
      * *   The instance to be connected must be in the **Running** state or **Stopped** state.
      * *   The ClassicLink feature must be enabled for the target VPC. For more information, see [Enable ClassicLink](~~65413~~).
      * *   The instance and the VPC must be in the same region.
      *
     */
    @Override
    public CompletableFuture<AttachClassicLinkVpcResponse> attachClassicLinkVpc(AttachClassicLinkVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachClassicLinkVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachClassicLinkVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachClassicLinkVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following points:
      * *   The disk to be attached must be in the **Unattached** (`Available`) state.
      * *   When the disk is attached as a data disk, take note of the following items:
      *     *   The instance must be in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      *     *   If the disk was separately purchased, the billing method of the disk must be pay-as-you-go.
      *     *   If the disk is a system disk detached from an instance, no limits apply to the billing method of the disk.
      * *   When the disk is attached as a system disk, take note of the following items:
      *     *   The instance must be the original instance from which the system disk was detached.
      *     *   The instance must be in the **Stopped** (`Stopped`) state.
      *     *   The logon credentials must be configured.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of the instance, the instance is locked for security reasons and all operations are prohibited on it.
      * *   Disks for which the multi-attach feature is enabled can be attached only to instances that support the NVMe protocol. For more information, see [NVMe protocol](~~256487~~) and [Use the multi-attach feature](~~262105~~).
      *
     */
    @Override
    public CompletableFuture<AttachDiskResponse> attachDisk(AttachDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AttachInstanceRamRoleResponse> attachInstanceRamRole(AttachInstanceRamRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachInstanceRamRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachInstanceRamRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachInstanceRamRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   SSH key pairs are not supported on Windows instances.
      * *   If an SSH key pair is attached to an instance, the username and password authentication method is disabled for the instance.
      * *   If you attach an SSH key pair to an instance in the **Running** state, you must call the [RebootInstance](~~25502~~) operation to restart the instance for the key pair to take effect.
      * *   If you attach an SSH key pair to an instance in the **Stopped** state, you must call the [StartInstance](~~25500~~) operation to start the instance for the key pair to take effect.
      * *   If an instance already has an SSH key pair attached, the new SSH key pair will replace the original one.
      *
     */
    @Override
    public CompletableFuture<AttachKeyPairResponse> attachKeyPair(AttachKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachKeyPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachKeyPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   The ENI must be in the **Available** (`Available`) state. Each ENI can be attached to only a single instance that resides in the same zone and VPC as the ENI.
      * *   The instance must be in the Running (Running) or Stopped (Stopped) state. When you attach ENIs to instances of some instance types, make sure that the instances are in the Stopped (Stopped) state. For more information, see the "Instance types of the ECS instances that must be in the Stopped (Stopped) state" section in [Bind an ENI](~~58503~~).
      *     > If the last start time of the instance (including the start time of the instance if it is newly purchased, the last restart time of the instance, and the last reactivation time of the instance) is before April 1, 2018 and the instance stays in the Running state, you must call the RebootInstance operation to restart the instance. If you do not call the RebootInstance operation to restart the instance, the ENI cannot be attached to the instance.
      * *   You can attach multiple ENIs to a single instance. For more information, see [ENI overview](~~58496~~).
      * *   The vSwitch to which the ENI is connected must be in the same zone and VPC as the vSwitch to which the instance is connected.
      * *   This operation is an asynchronous operation. After this operation is called to attach an ENI, you can check the status or events of the ENI to determine whether the ENI is attached. The following figure shows the transitions between the states of the ENI.
      * ![](https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/zh-CN/20221124/esgu/AttachNetworkInterface.jpg) If the ENI is in the Attaching state, the ENI attachment request is sent and the ENI is being attached to the specified instance. If the ENI is in the InUse state, the ENI is attached to the specified instance. If the ENI is in the Available state, the ENI fails to be attached.
      * **For information about examples on how to call this operation, see** [Attach an ENI](~~471550~~).
      *
     */
    @Override
    public CompletableFuture<AttachNetworkInterfaceResponse> attachNetworkInterface(AttachNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * In the security group-related API documents, inbound traffic refers to the traffic sent by the source and received by the destination.
      * When you call this operation, take note of the following items:
      * - The total number of outbound and inbound rules in each security group cannot exceed 200. For more information, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).
      * - The valid value of Priority ranges from 1 to 100. A smaller value indicates a higher priority.
      * - When multiple security group rules have the same priority, drop rules take precedence.
      * - The source can be a CIDR block specified by SourceCidrIp, Ipv6SourceCidrIp, or SourcePrefixListId or can be Elastic Compute Service (ECS) instances in a security group specified by SourceGroupId.
      * - For advanced security groups, security groups cannot be used as authorization objects.
      * - For each basic security group, a maximum of 20 security groups can be used as authorization objects.
      * - If the specified security group rule already exists, the call to AuthorizeSecurityGroup is successful but no security group rule is created.
      * - The `Permissions.N` prefix is added to some parameters to generate new parameters. Original parameters and corresponding parameters prefixed with Permissions.N cannot be specified together. We recommend that you use parameters prefixed with `Permissions.N`.
      * - You can determine a security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
      *     - Parameters used to specify an inbound security group rule that controls access from a specific CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and SourceCidrIp. For a security group of the Virtual Private Cloud (VPC) type, you must set the NicType parameter to intranet. For a security group of the classic network type, you can set the NicType parameter to either internet or intranet. Sample request:
      *         ```
      *                 http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroup
      *                 &SecurityGroupId=sg-bp67acfmxazb4p****
      *                 &Permissions.1.SourceCidrIp=10.0.0.0/8
      *                 &Permissions.1.IpProtocol=TCP
      *                 &Permissions.1.PortRange=22/22
      *                 &Permissions.1.NicType=intranet
      *                 &Permissions.1.Policy=Accept
      *                 &<Common request parameters>
      *                 
      *         ```
      *     - Parameters used to specify an inbound security group rule that controls access from a security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceGroupOwnerAccount, and SourceGroupId. In this case, you must set the NicType parameter to intranet. For mutual access between security groups in the classic network, you can allow or deny another security group within the same region access to your security group. The security group that is allowed access to your security group can belong to your own Alibaba Cloud account or another Alibaba Cloud account specified by the SourceGroupOwnerAccount parameter. For mutual access between security groups in VPCs, you can allow or deny another security group within the same VPC access to your security group. Sample request:
      *         ```
      *                 http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroup
      *                 &SecurityGroupId=sg-bp67acfmxazb4p****
      *                 &Permissions.1.SourceGroupId=sg-1651FBB**
      *                 &Permissions.1.SourceGroupOwnerAccount=test@aliyun.com
      *                 &Permissions.1.IpProtocol=TCP
      *                 &Permissions.1.PortRange=22/22
      *                 &Permissions.1.NicType=intranet
      *                 &Permissions.1.Policy=Drop
      *                 &<Common request parameters>
      *                 
      *         ```
      *     - Parameters used to specify an inbound security group rule that controls access from a prefix list: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, and SourcePrefixListId. In this case, prefix lists support only security groups in VPCs. NicType must be set to intranet. Sample request:
      *         ```
      *                 http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroup
      *                 &SecurityGroupId=sg-bp67acfmxazb4p****
      *                 &Permissions.1.SourcePrefixListId=pl-x1j1k5ykzqlixdcy****
      *                 &Permissions.1.SourceGroupOwnerAccount=test@aliyun.com
      *                 &Permissions.1.IpProtocol=TCP
      *                 &Permissions.1.PortRange=22/22
      *                 &Permissions.1.NicType=intranet
      *                 &Permissions.1.Policy=Drop
      *                 &<Common request parameters>
      *                
      *         ```
      * - For information about examples on security group rule settings, see [Security groups for different use cases](~~25475~~) and [Security group quintuple rules](~~97439~~).
      *
     */
    @Override
    public CompletableFuture<AuthorizeSecurityGroupResponse> authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   The total number of outbound and inbound rules in each security group cannot exceed 200. For more information, see the "Security group limits" section in [Limits](~~25412#SecurityGroupQuota1~~).
      * *   You can set Policy to accept or drop for each security group rule to allow or deny access.
      * *   The valid values of Priority range from 1 to 100. A smaller value indicates a higher priority.
      * *   When several security group rules have the same priority, drop rules take precedence.
      * *   In each rule, the destination can be a CIDR block specified by DestCidrIp, Ipv6DestCidrIp, or DestPrefixListId or can be Elastic Compute Service (ECS) instances in a security group specified by DestGroupId.
      * *   Security groups cannot be referenced as authorization objects (destinations or sources) in rules of advanced security groups.
      * *   Up to 20 security groups can be referenced as authorization objects in rules of each basic security group.
      * *   If the specified security group rule exists in the security group, the call to AuthorizeSecurityGroupEgress is successful but no security group rule is created.
      * *   Parameters and their `Permissions.N`-prefixed counterparts cannot be specified at the same time. We recommend that you use the `Permissions.N`-prefixed parameters.
      * *   You can determine a security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
      *     *   Parameters used to specify an outbound security group rule that controls access to a CIDR block: SecurityGroupId, Permissions.N.IpProtocol, Permissions.N.PortRange, Permissions.N.SourcePortRange, Permissions.N.NicType, Permissions.N.Policy, and Permissions.N.DestCidrIp. Permissions.N.SourcePortRange is an optional parameter. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroupEgress
      *             &SecurityGroupId=sg-bp67acfmxazb4ph***
      *             &Permissions.1.IpProtocol=ICMP
      *             &Permissions.1.DestCidrIp=10.0.0.0/8
      *             &Permissions.1.PortRange=-1/-1
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=Accept
      *             &<Common request parameters>
      *     *   Parameters used to specify an outbound security group rule that controls access to a security group: SecurityGroupId, Permissions.N.IpProtocol, Permissions.N.PortRange, Permissions.N.SourcePortRange, Permissions.N.NicType, Permissions.N.Policy, Permissions.N.DestGroupOwnerAccount, and Permissions.N.DestGroupId. Permissions.N.SourcePortRange is an optional parameter. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroupEgress
      *             &SecurityGroupId=sg-bp67acfmxazb4ph***
      *             &Permissions.1.DestGroupId=sg-bp67acfmxazb4pi***
      *             &Permissions.1.DestGroupOwnerAccount=Test@aliyun.com
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=22/22
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=Drop
      *             &<Common request parameters>
      *     *   Parameters used to specify an outbound security group rule that controls access to a prefix list: SecurityGroupId, Permissions.N.IpProtocol, Permissions.N.PortRange, Permissions.N.SourcePortRange, Permissions.N.NicType, Permissions.N.Policy, and Permissions.N.DestPrefixListId. Permissions.N.SourcePortRange is an optional parameter. In this case, prefix lists support only security groups in virtual private clouds (VPCs). Permissions.N.NicType must be set to intranet. Sample request:
      *             http(s)://ecs.aliyuncs.com/?Action=AuthorizeSecurityGroupEgress
      *             &SecurityGroupId=sg-bp67acfmxazb4ph***
      *             &Permissions.1.DestPrefixListId=pl-x1j1k5ykzqlixdcy****
      *             &Permissions.1.DestGroupOwnerAccount=Test@aliyun.com
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=22/22
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=Drop
      *             &<Common request parameters>
      *
     */
    @Override
    public CompletableFuture<AuthorizeSecurityGroupEgressResponse> authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AuthorizeSecurityGroupEgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AuthorizeSecurityGroupEgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AuthorizeSecurityGroupEgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelAutoSnapshotPolicyResponse> cancelAutoSnapshotPolicy(CancelAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   After you cancel the image copy task, the image copy created in the destination region is deleted, and the source image remains unchanged.
      * *   If the image copy task is complete, the CancelCopyImage operation fails and an error is returned.
      *
     */
    @Override
    public CompletableFuture<CancelCopyImageResponse> cancelCopyImage(CancelCopyImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelCopyImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelCopyImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelCopyImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, make sure that the image build task to be canceled is in the BUILDING, DISTRIBUTING, or RELEASING state.
      *
     */
    @Override
    public CompletableFuture<CancelImagePipelineExecutionResponse> cancelImagePipelineExecution(CancelImagePipelineExecutionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelImagePipelineExecution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelImagePipelineExecutionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelImagePipelineExecutionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CancelPhysicalConnectionResponse> cancelPhysicalConnection(CancelPhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelPhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelPhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelPhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelSimulatedSystemEventsResponse> cancelSimulatedSystemEvents(CancelSimulatedSystemEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelSimulatedSystemEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelSimulatedSystemEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelSimulatedSystemEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CancelTaskResponse> cancelTask(CancelTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ConnectRouterInterfaceResponse> connectRouterInterface(ConnectRouterInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConnectRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConnectRouterInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConnectRouterInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After a public IP address is converted into an EIP, the EIP is billed separately. Make sure that you understand the billing methods of EIPs. For more information, see [Billing overview](~~122035~~).
      * Before you call this operation, make sure that the following requirements are met:
      * *   The instance is in the **Stopped** (`Stopped`) or **Running** (`Running`) state.
      * *   No EIPs are associated with the instance.
      * *   The instance has no configuration change tasks that have not taken effect.
      * *   The public bandwidth of the instance is not 0 Mbit/s.
      * *   The instance uses the pay-by-traffic billing method for network usage.
      * *   If the instance is a subscription instance that resides in a VPC, the instance does not expire within 24 hours.
      *
     */
    @Override
    public CompletableFuture<ConvertNatPublicIpToEipResponse> convertNatPublicIpToEip(ConvertNatPublicIpToEipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConvertNatPublicIpToEip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConvertNatPublicIpToEipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConvertNatPublicIpToEipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you copy a custom image to the destination region, you can use the image copy to create Elastic Compute Service (ECS) instances by calling the RunInstances operation or replace the system disks of instances by calling the ReplaceSystemDisk operation in the destination region.
      * When you call this operation, take note of the following items:
      * *   Only custom images that are in the `Available` state can be copied.
      * *   You can only copy images within your own Alibaba Cloud account. Images cannot be copied from one account to another.
      * *   When an image is being copied, you cannot delete the image copy by calling the [DeleteImage](~~25537~~) operation, but you can cancel the running copy task by calling the [CancelCopyImage](~~25539~~) operation.
      * *   A single region can have only one image copy task running at a time. Other image copy tasks queue up for the current task to complete before they run in sequence.
      * *   You can set the `ResourceGroupId` parameter to specify the resource group to which the image copy belongs. If you do not set the `ResourceGroupId` parameter, the image copy belongs to the default resource group.
      *
     */
    @Override
    public CompletableFuture<CopyImageResponse> copyImage(CopyImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * When you call this operation, take note of the following items:
      * *   New snapshots, which are the copies of source snapshots, cannot be used to roll back the disks for which the source snapshots were created.
      * *   Encrypted snapshots cannot be copied.
      * *   Local snapshots cannot be copied.
      *
     */
    @Override
    public CompletableFuture<CopySnapshotResponse> copySnapshot(CopySnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopySnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopySnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopySnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you use an activation code to register a server that is not provided by Alibaba Cloud as an Alibaba Cloud managed instance, you can use a variety of online services provided by Alibaba Cloud in the managed instance, such as Cloud Assistant, Operation Orchestration Service (OOS), and Apsara Devops.
      * A server that is not provided by Alibaba Cloud can be registered as an Alibaba Cloud managed instance only when the server can access the Internet and runs an operating system of one of the following versions:
      * *   Alibaba Cloud Linux 2, Alibaba Cloud Linux 3, and later
      * *   CentOS 6, CentOS 7, CentOS 8, and later
      * *   Debian 8, Debian 9, Debian 10, and later
      * *   Ubuntu 12, Ubuntu 14, Ubuntu 16, Ubuntu 18, and later
      * *   CoreOS
      * *   OpenSUSE
      * *   Red Hat 5, Red Hat 6, Red Hat 7, and later
      * *   SUSE Linux Enterprise Server (SLES) 11, SLES 12, SLES 15, and later
      * *   Windows Server 2012, Windows Server 2016, Windows Server 2019, and later
      * You can create up to 5,000 activation codes for managed instances within an Alibaba Cloud region. When the number of activation codes exceeds 1,000, the usage of activation codes must be greater than 50% before you can proceed to create more activation codes.
      * > You can go to the **Cloud Assistant** page in the Elastic Compute Service (ECS) console and click **Register Instance** on the **Managed Instances** tab to check the usage of activation codes.
      *
     */
    @Override
    public CompletableFuture<CreateActivationResponse> createActivation(CreateActivationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateActivation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateActivationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateActivationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * Auto Provisioning is a service that allows quick deployment of an instance cluster that consists of preemptible and pay-as-you-go instances. Auto Provisioning supports one-click deployment of instance clusters across different billing methods, instance families, and zones. For more information, see [Use auto provisioning group-related API operations to create multiple ECS instances at the same time](~~200772~~).
      * * Auto Provisioning uses auto provisioning groups to schedule and maintain computing resources. You can use auto provisioning groups to obtain a steady supply of computing resources. This helps reduce the impact on computing capacity when preemptible instances are reclaimed.
      * * Auto Provisioning is provided free-of-charge. However, you are charged for instance resources that are created in auto provisioning groups. For more information about the billing, see [Overview](~~52088~~) and [Pay-as-you-go](~~40653~~).
      * * When you specify both the `LaunchTemplateId` and `LaunchConfiguration.*` parameters, the LaunchTemplateId parameter takes precedence.
      *
     */
    @Override
    public CompletableFuture<CreateAutoProvisioningGroupResponse> createAutoProvisioningGroup(CreateAutoProvisioningGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAutoProvisioningGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAutoProvisioningGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAutoProvisioningGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation to create an automatic snapshot policy, you can specify the days of the week on which to create automatic snapshots, the retention period of the automatic snapshots, and cross-region replication for snapshots in the policy to meet your diverse data backup requirements. After you create an automatic snapshot policy, you must call the [ApplyAutoSnapshotPolicy](~~25531~~) operation to apply it to disks. If you want to modify the automatic snapshot policy, you must call the [ModifyAutoSnapshotPolicyEx](~~25529~~) operation.
      * When you call this operation, take note of the following items:
      * *   You can create a maximum of 100 automatic snapshot policies within each region for a single Alibaba Cloud account.
      * *   If an automatic snapshot is being created when the time scheduled for creating another automatic snapshot is due, the new snapshot task is skipped. This may occur when a disk contains a large volume of data. For example, you have scheduled snapshots to be created at 09:00:00, 10:00:00, 11:00:00, and 12:00:00 for a disk. The system starts to create a snapshot for the disk at 09:00:00. The process takes 80 minutes because the disk contains a large volume of data and ends at 10:20:00. The system skips the automatic snapshot task scheduled for 10:00:00 and creates the next automatic snapshot for the disk at 11:00:00.
      * *   For information about how to copy a snapshot from one region to another, see the "Background information" section in [Copy a snapshot](~~159441~~).
      *
     */
    @Override
    public CompletableFuture<CreateAutoSnapshotPolicyResponse> createAutoSnapshotPolicy(CreateAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateCapacityReservationResponse> createCapacityReservation(CreateCapacityReservationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCapacityReservation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCapacityReservationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCapacityReservationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can create commands of the following types:
      *     *   RunBatScript: batch commands. These commands are applicable to Windows instances.
      *     *   RunPowerShellScript: PowerShell commands. These commands are applicable to Windows instances.
      *     *   RunShellScript: shell commands. These commands are applicable to Linux instances.
      * *   You can specify the TimeOut parameter to set the maximum timeout period for executions of a command on Elastic Compute Service (ECS) instances. If an execution times out, the Cloud Assistant client forcefully terminates the command process by canceling the process ID (PID) of the command. For more information, see [Install the Cloud Assistant client](~~64921~~).
      *     *   When the one-time execution of a command times out, the execution state ([InvokeRecordStatus](~~64845~~)) of the command becomes Failed.
      *     *   For a scheduled task, take note of the following items:
      *         *   The timeout period takes effect on each execution of the command.
      *         *   When a scheduled execution of a command times out, the execution state ([InvokeRecordStatus](~~64845~~)) of the command becomes Failed.
      *         *   The timeout of one execution does not affect the subsequent executions of the command.
      * *   You can retain up to 500 to 10,000 Cloud Assistant commands in each region.
      * *   You can use the WorkingDir parameter to specify the working directory of a Cloud Assistant command. For Linux instances, the default working directory of a command is the home directory of the root user, which is `/root`. For Windows instances, the default working directory of a command is the directory where the Cloud Assistant client process resides, such as `C:\\Windows\\System32`.
      * *   You can enable the custom parameter feature for a Cloud Assistant command by setting EnableParameter to true when you create the command. When you configure the CommandContent parameter, you can define custom parameters in the {{parameter}} format. Then, when the [InvokeCommand](~~64841~~) operation is called, the key-value pairs of custom parameters are passed in. For example, assume that the command content is `echo {{name}}`. You can use the Parameters parameter to pass in the `<name, Jack>` key-value pair when the InvokeCommand operation is called. The name key of the custom parameter is automatically replaced by the paired Jack value to generate a new command. Therefore, the `echo Jack` command is actually run.
      *
     */
    @Override
    public CompletableFuture<CreateCommandResponse> createCommand(CreateCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateDedicatedHostClusterResponse> createDedicatedHostCluster(CreateDedicatedHostClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDedicatedHostCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDedicatedHostClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDedicatedHostClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to file a demand for an ECS instance type. Alibaba Cloud provides the requested resources based on your demand.
      * You can file demands only for I/O optimized instance types and instances of the virtual private cloud (VPC) type.
      * > This operation is in internal preview and has not been officially released. We recommend that you do not call this operation.
      *
     */
    @Override
    public CompletableFuture<CreateDemandResponse> createDemand(CreateDemandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDemand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDemandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDemandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateDeploymentSetResponse> createDeploymentSet(CreateDeploymentSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDeploymentSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDeploymentSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDeploymentSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateDiagnosticMetricSetResponse> createDiagnosticMetricSet(CreateDiagnosticMetricSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDiagnosticMetricSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDiagnosticMetricSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDiagnosticMetricSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateDiagnosticReportResponse> createDiagnosticReport(CreateDiagnosticReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDiagnosticReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDiagnosticReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDiagnosticReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   You can enable the multi-attach feature when you create a disk. We recommend that you first understand this feature and its limits. For more information, see [NVMe protocol](~~256487~~) and [Use the multi-attach feature](~~262105~~).
      * <!---->
      * *   The disk can be a basic disk, an ultra disk, a standard SSD, or an enhanced SSD (ESSD).
      * *   When you create disks, you may be charged for the resources used. We recommend that you understand the Elastic Compute Service (ECS) billing methods before you create a disk. For more information, see [Billing overview](~~25398~~).
      * *   By default, the `DeleteAutoSnapshot` parameter is set to `true` when a disk is created. This indicates that when the disk is released, its automatic snapshots are also deleted. You can call the [ModifyDiskAttribute](~~25517~~) operation to modify the parameter.
      * *   If you do not configure the performance level when you create an ESSD, the performance level for the ESSD is PL1 by default. You can call the [ModifyDiskSpec](~~123780~~) operation to modify the performance level of the ESSD.
      * *   By default, for a disk that is created by calling the CreateDisk operation, the `Portable` attribute is set to `true` and the billing method is pay-as-you-go.
      *
     */
    @Override
    public CompletableFuture<CreateDiskResponse> createDisk(CreateDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Elasticity Assurance provides a new method to purchase and use resources with flexibility and assurance. It offers assured resource reservations for pay-as-you-go Elastic Compute Service (ECS) instances. For more information, see [Overview of Elasticity Assurance](~~193630~~).
      * *   Elasticity assurances are not refundable after purchase.
      * *   Elasticity assurances are applicable to only pay-as-you-go ECS instances.
      * *   Elasticity assurances only support the unlimited mode. Therefore, you can set `AssuranceTimes` only to `Unlimited`. Elasticity assurances in unlimited mode take effect immediately after they are purchased and can be applied an unlimited number of times within their effective duration.
      *
     */
    @Override
    public CompletableFuture<CreateElasticityAssuranceResponse> createElasticityAssurance(CreateElasticityAssuranceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateElasticityAssurance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateElasticityAssuranceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateElasticityAssuranceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateForwardEntryResponse> createForwardEntry(CreateForwardEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateForwardEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateForwardEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateForwardEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateHaVipResponse> createHaVip(CreateHaVipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHaVipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHaVipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateHpcClusterResponse> createHpcCluster(CreateHpcClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHpcCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHpcClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHpcClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * When you call this operation, take note of the following points:
      * *   The created custom image can be used only when it is in the Available (Available) state.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of the instance, the instance is locked for security reasons and all operations are prohibited on it.
      * You can call the CreateImage operation to create a custom image by using one of the following methods. The following request parameters are sorted by priority: `InstanceId` > `DiskDeviceMapping` > `SnapshotId`. If your request contains two or more parameters, the custom image is created based on the parameter that has a higher priority by default.
      * *   **Method 1**: Create a custom image from an instance. You need to only specify the instance ID (`InstanceId`). The instance must be in the Running (`Running`) or Stopped (`Stopped`) state. After the CreateImage operation is called, a snapshot is created for each disk of the instance. When you create a custom image from a running instance, some cache data may not be written to the disks. As a result, the data of the created custom image may be slightly inconsistent with that of the instance. We recommend that you create custom images from instances after you stop the instances ([StopInstances](~~155372~~)).
      * *   **Method 2**: Create a custom image from the system disk snapshot of an instance. You need to only specify the ID of the system disk snapshot (`SnapshotId`). The specified snapshot cannot be created on or before July 15, 2013.
      * *   **Method 3**: Create a custom image from multiple disk snapshots. You must specify the data mapping between the disks and the snapshots (`DiskDeviceMapping`).
      * When you use Method 3 to create a custom image, take note of the following items:
      * *   You can specify only one system disk snapshot. The device name of the system disk must be /dev/xvda.
      * *   You can specify multiple data disk snapshots. The device names of the data disks are unique and in alphabetical order from /dev/xvdb to /dev/xvdz.
      * *   `SnapshotId` may not be specified. In this case, an empty data disk with a specified size is created.
      * *   The specified snapshot cannot be created on or before July 15, 2013.
      *
     */
    @Override
    public CompletableFuture<CreateImageResponse> createImage(CreateImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * * Only custom image components can be created.
      * * Image components can be used to create only Linux images, so you must set the `SystemType` parameter to Linux.
      * * You must configure the image component type to image building component by setting the `ComponentType` parameter to Build.
      * * You can use Dockerfile to edit the content of image components and then pass the edited content into the `Content` parameter. The content cannot be greater than 16 KB in size and can contain up to 127 commands. `FROM` commands cannot be used in image components. For information about the commands that are supported, see [Commands supported by Image Builder](~~200206~~).
      * You can use image components to create image templates in the Elastic Compute Service (ECS) console, but cannot call API operations to use image components to create image templates. For more information, see [Overview](~~197410~~).
      *
     */
    @Override
    public CompletableFuture<CreateImageComponentResponse> createImageComponent(CreateImageComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImageComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImageComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImageComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * You can use image templates to customize image content and create images across regions and accounts. When you call this operation, take note of the following items:
      * *   You can create only custom image templates.
      * *   You can configure only public, custom, or shared Linux images or image families as the source images to create custom image templates.
      * *   When you use an image template to create an image, you must create an intermediate Elastic Compute Service (ECS) instance to help create the image. The intermediate instance is billed on a pay-as-you-go basis. For more information, see [Pay-as-you-go](~~40653~~).
      * For the `BuildContent` parameter that specifies the content of image templates, take note of the following items:
      * *   If the `BuildContent` value contains `FROM` commands, the values of `BaseImageType` that specifies the type of the source image and `BaseImage` that specifies the source image are overridden by the `FROM` commands.
      * *   If the `BuildContent` value does not contain `FROM` commands, the system adds the `FROM` command that consists of the `BaseImageType` and `BaseImage` values to the first line of the template content in the format of `<BaseImageType>:<BaseImage>`.
      * *   You can use Dockerfile to edit the content of image templates and then pass the edited content into the `BuildContent` parameter. The content cannot be greater than 16 KB in size, and can contain up to 127 commands. For information about the commands that are supported, see [Commands supported by Image Builder](~~200206~~).
      * You can use image components to create image templates in the ECS console, but cannot call API operations to use image components to create image templates. For more information, see [Overview](~~197410~~).
      *
     */
    @Override
    public CompletableFuture<CreateImagePipelineResponse> createImagePipeline(CreateImagePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateImagePipeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateImagePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateImagePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > You can call the [DescribeAvailableResource](~~66186~~) operation to query available resources in a specific region or zone. If you want to batch create instances that automatically enter the Running state after they are created, we recommend that you call the [RunInstances](~~63440~~) operation.
      * When you call this operation, take note of the following items:
      * * **Billing**:
      *     * You must fully understand the ECS billing methods before you create an instance because you may be charged for resources used by the instance. For more information, see [Billing overview](~~25398~~).
      *     * If you create a subscription instance (`PrePaid`), available coupons within your account are used by default.
      * * **Instance type**:
      *     * You can use the `IoOptimized` parameter to specify whether to create an I/O optimized instance.
      *     * Select an instance type. See [Instance families](~~25378~~) or call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of an instance type, or see [Best practices for instance type selection](~~58291~~) to learn about how to select instance types.
      *     * Query available resources. Call the [DescribeAvailableResource](~~66186~~) operation to query available resources in a specific region or zone.
      * > If the `QuotaExceed.ElasticQuota` error is returned when you call this operation, it indicates that you have reached the maximum number of instances of the specified instance type that can be created within the specified region or the maximum number of vCPUs for all instance types in a zone. You can go to the [ECS console](https://ecs.console.aliyun.com/?spm=a2c8b.12215451.favorites.decs.5e3a336aMGTtzy#/privileges/quota) or [Quota Center](https://quotas.console.aliyun.com/products/ecs/quotas) to request a quota increase.
      * * **Image**:
      *     * The image determines the system disk configurations of the new instance. The system disk of the new instance is a clone of the specified image.
      *     * If you want to create instances with 512 MiB of memory, you cannot use Windows Server images except for Windows Server Semi-Annual Channel images.
      *     * If you want to create instances with 4 GiB or more of memory, you cannot use 32-bit OS image.
      * * **Network type**:
      *     * Each instance that resides in a virtual private cloud (VPC) must be connected to only a single vSwitch.
      *     * If the `VSwitchId` parameter is specified, the security group specified by `SecurityGroupId` and the vSwitch specified by `VSwitchId` must belong to the same VPC.
      *     * The value of `PrivateIpAddress` depends on that of `VSwitchId` and cannot be separately specified.`` If both the `VSwitchId` and `PrivateIpAddress` parameters are specified, the IP address specified by `PrivateIpAddress` must be available in the CIDR block of the specified vSwitch.
      * * **Public bandwidth**:
      *     * As of November 27, 2020, the maximum bandwidth value available for you to create ECS instances or to change ECS instance configurations is subject to the throttling policy for your account. To increase the maximum bandwidth value, submit a ticket. The throttling policy imposes the following constraints: Within a single region, the total maximum bandwidth value of all instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s and that of all instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.
      *     * If you call the `CreateInstance` operation to create an instance, no public IP addresses are assigned to the instance. You can call the [AllocatePublicIpAddress](~~25544~~) operation to manually assign public IP addresses to instances.
      *     * Network usage fees are determined based on the settings of `InternetChargeType` and `InternetMaxBandwidthOut`.
      *     * The `InternetMaxBandwidthIn` value is irrelevant to billing because inbound data traffic is free of charge.
      *     * If `InternetChargeType` is set to PayByBandwidth, `InternetMaxBandwidthOut` specifies the fixed bandwidth value. A fixed bandwidth is a specified amount of public bandwidth allocated to an instance that uses the pay-by-bandwidth billing method for network usage.
      *     * If `InternetChargeType` is set to PayByTraffic, `InternetMaxBandwidthOut` specifies the peak bandwidth value. A peak bandwidth is the maximum amount of public bandwidth that an instance can consume when it uses the pay-by-traffic billing method for network usage. Network usage costs are calculated based on the volume of network traffic.
      * * **Security group**:
      *     * If no security groups are available in the region where you want to create an instance, you must call the [CreateSecurityGroup](~~25553~~) operation to create a security group in that region first.
      *     * The maximum number of instances that a security group can contain varies based on the security group type. For more information, see the "Security group limits" section in [Limits](~~25412~~).
      *     * Instances in the same security group can communicate with each other over the internal network. By default, instances in different security groups cannot communicate with each other. You can allow communication between instances by allowing mutual access between their security groups. For more information, see [AuthorizeSecurityGroup](~~25554~~) and [AuthorizeSecurityGroupEgress](~~25560~~).
      * * **Storage**:
      *     * The instance is assigned a system disk whose size is determined based on the specified image. The size of the system disk must be at least `20 GiB` and greater than or equal to the image size. For more information about system disk categories, see the description of the `SystemDisk.Category` parameter.
      *     * The system disk of an I/O optimized instance can only be an enhanced SSD (ESSD) (`cloud_essd`), a standard SSD (`cloud_ssd`), or an ultra disk (`cloud_efficiency`).
      *     * The maximum size of a data disk varies based on its category. For more information, see the description of the `DataDisk.N.Size` parameter.
      *     * A maximum of 16 data disks can be attached to each instance. The mount points of data disks are allocated by the system in alphabetical order from /dev/xvdb to /dev/xvdz.
      * * **User data**: If the instance type supports [user data](~~49121~~), you can use the UserData parameter to pass in user data. User data is encoded in Base64. We recommend that you do not pass in confidential information (such as passwords or private keys) in plaintext as user data. This is because the system does not encrypt `UserData` values when API requests are transmitted. If you must pass in confidential information, we recommend that you encrypt and encode the information in Base64 and then decode and decrypt the information in the same way within the instance.
      * * **Others**: When you call API operations by using Alibaba Cloud CLI or SDKs, you must delete periods (.) from some request parameters before you use the parameters. For example, use `SystemDiskCategory` instead of `SystemDisk.Category` as a request parameter.
      *
     */
    @Override
    public CompletableFuture<CreateInstanceResponse> createInstance(CreateInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * In addition to calling CreateKeyPair, you can create a key pair by using a third-party key pair generation tool and call the [ImportKeyPair](~~51774~~) operation to upload the key pair to an Alibaba Cloud region.
      * A maximum of 500 key pairs can be created in each region. For more information, see [Limits](~~25412~~).
      *
     */
    @Override
    public CompletableFuture<CreateKeyPairResponse> createKeyPair(CreateKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateKeyPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateKeyPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Launch templates contain preset configurations used to create instances, such as the region, image ID, instance type, security group ID, and public bandwidth settings. If a specific parameter is not included in a launch template, you must manually specify the parameter when you use the launch template to create an instance.
      * After you create a launch template (`CreateLaunchTemplate`), its version number is set to 1 by default. You can create multiple versions (`CreateLaunchTemplateVersion`) for the launch template. Version numbers start from 1 and increment by one. If you do not specify a template version number when you use a launch template to create instances ([RunInstances](~~63440~~)), the default version is used.
      * When you call this operation, take note of the following items:
      * * You can create up to 30 launch templates in each region. Each launch template can have up to 30 versions.
      * * Most parameters in launch templates are optional. When you create a launch template, ECS does not verify the existence or validity of specified parameter values. The validity of the parameter values are verified only when you use the launch template to create instances.
      * * If you set a specific parameter in a launch template, you cannot filter out this parameter when you use the launch template to create instances ([RunInstances](~~63440~~)). For example, if you set the `HostName` parameter to LocalHost in a launch template and do not specify the `HostName` parameter when you call the `RunInstances` operation to create instances from the launch template, the instance hostname is still `LocalHost`. If you want to overwrite the `LocalHost` value of HostName provided by the launch template, you can set `HostName` to MyHost or another value when you call the `RunInstances` operation.
      *
     */
    @Override
    public CompletableFuture<CreateLaunchTemplateResponse> createLaunchTemplate(CreateLaunchTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLaunchTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLaunchTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLaunchTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * If you want to modify the parameters of a launch template version, you can create another version with different parameter settings for the launch template. A maximum of 30 versions can be created for each launch template.
      *
     */
    @Override
    public CompletableFuture<CreateLaunchTemplateVersionResponse> createLaunchTemplateVersion(CreateLaunchTemplateVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLaunchTemplateVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLaunchTemplateVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLaunchTemplateVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateNatGatewayResponse> createNatGateway(CreateNatGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNatGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNatGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNatGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * When you call this operation, take note of the following items:
      * *   This operation is a synchronous operation. After an ENI is created, it immediately enters the Available state and can be attached to an Elastic Compute Service (ECS) instance.
      * *   If the NetworkInterfaceId parameter is empty in the response, it indicates that no ENI is created. Call the operation again to create an ENI.
      * *   An ENI can be attached only to a single instance that resides in a virtual private cloud (VPC).
      * *   When an ENI is detached from an instance and then attached to another instance, the attributes of the ENI remain unchanged and network traffic is directed to the new instance.
      * *   If you want to assign IPv6 addresses when you create an ENI, make sure that IPv6 has been enabled for the vSwitch with which to associate the ENI. For more information, see [What is an IPv6 gateway?](~~98896~~)
      * *   A quota is imposed on the number of ENIs that can be created per Alibaba Cloud region per account. You can view the quota in the ECS console. For more information, see [View and increase resource quotas](~~184115~~).
      * **For information about examples on how to call this operation, see **[Create an ENI](~~471552~~).
      *
     */
    @Override
    public CompletableFuture<CreateNetworkInterfaceResponse> createNetworkInterface(CreateNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateNetworkInterfacePermissionResponse> createNetworkInterfacePermission(CreateNetworkInterfacePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetworkInterfacePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNetworkInterfacePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNetworkInterfacePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreatePhysicalConnectionResponse> createPhysicalConnection(CreatePhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   A prefix list is a set of one or more network prefixes (CIDR blocks). You can reference prefix lists to configure network rules for other network resources. For more information, see [Overview](~~206223~~).
      * *   When you create a prefix list, take note of the following items:
      *     *   You must specify an IP address family (IPv4 or IPv6) for the prefix list, and cannot change the IP address family after the prefix list is created. You cannot combine IPv4 and IPv6 CIDR blocks in a single prefix list.
      *     *   You must specify the maximum number of entries that the prefix list can contain. You cannot modify the maximum number of entries after the prefix list is created.
      *     *   You can specify one or more entries for the prefix list. Each entry consists of a CIDR block and a description for the CIDR block. The total number of your specified entries cannot exceed the maximum number.
      * *   For more information about the limits on prefix lists and other resources, see [Limits](~~25412~~).
      * *   You can create RAM users and grant them minimum permissions. This eliminates the need to share the AccessKey pair of your Alibaba Cloud account with other users and reduces security risks for your enterprises. For information about how to grant permissions on prefix lists to RAM users, see [Grant permissions on prefix lists to RAM users](~~206175~~)
      *
     */
    @Override
    public CompletableFuture<CreatePrefixListResponse> createPrefixList(CreatePrefixListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePrefixListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePrefixListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateRouteEntryResponse> createRouteEntry(CreateRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateRouterInterfaceResponse> createRouterInterface(CreateRouterInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRouterInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRouterInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following points:
      * *   You can create up to 100 security groups within a single Alibaba Cloud region.
      * *   To create a security group of the Virtual Private Cloud (VPC) type, you must specify the VpcId parameter.
      *
     */
    @Override
    public CompletableFuture<CreateSecurityGroupResponse> createSecurityGroup(CreateSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can use the ECS console, call the [](~~63962~~)operation, or use CloudMonitor to view the scheduled simulated system events.
      * The following section describes the lifecycle of a simulated system event:
      * *   Scheduled: The state of the simulated system event is automatically changed to Scheduled after it is scheduled.
      * *   Executed: The state of the simulated system event is automatically changed to Executed at the scheduled time specified by the NotBefore parameter if no manual intervention is involved.
      * *   Canceled: The state of the simulated system event is changed to Canceled if you cancel the event by calling the [CancelSimulatedSystemEvents](~~88808~~) operation.
      * *   Avoided: The state of the simulated system event generated from maintenance-triggered instance restart can be changed to Avoided if you restart the instance before the scheduled time of the simulated system event. The maintenance-triggered instance restart is indicated by the SystemMaintenance.Reboot value. For more information, see [RebootInstance](~~25502~~).
      *
     */
    @Override
    public CompletableFuture<CreateSimulatedSystemEventsResponse> createSimulatedSystemEvents(CreateSimulatedSystemEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSimulatedSystemEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSimulatedSystemEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSimulatedSystemEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * The local snapshot feature is replaced by the instant access feature.
      * *   If you have used the local snapshot feature before December 14, 2020, you can use the `Category` or `InstantAccess` parameter as expected and must take note of the following items:
      *     *   The `Category` and `InstantAccess` parameters cannot be specified at the same time.
      *     *   If neither of the `Category` and `InstantAccess` parameters is specified, normal snapshots are created.
      * *   If you have not used the local snapshot feature before December 14, 2020, you can use the `InstantAccess` parameter and cannot use the `Category` parameter.
      * For more information, see [Snapshot service upgrade and addition of a new billable item on December 14, 2020](https://help.aliyun.com/noticelist/articleid/1060755542.html).
      * In the following scenarios, you cannot create snapshots for a disk:
      * *   The number of manual snapshots of the disk has reached 256.
      * *   A snapshot is being created for the disk.
      * *   The Elastic Compute Service (ECS) instance to which the disk is attached has never been started.
      * *   The ECS instance to which the disk is attached is not in the **Stopped** (`Stopped`) or **Running** (`Running`) state.
      * *   If the response contains `{"OperationLocks": {"LockReason" : "security"}}` when you query the information of the instance, the instance is locked for security reasons and all operations are prohibited on it.
      * When you create a snapshot, take note of the following items:
      * *   If a snapshot is being created, you cannot use this snapshot to create a custom image by calling the [CreateImage](~~25535~~) operation.
      * *   When a snapshot is being created for a disk that is attached to an ECS instance, do not change the instance state.
      * *   You can create snapshots for a disk that is in the **Expired** (`Expired`) state. If the release time scheduled for a disk arrives when a snapshot is being created for the disk, the snapshot is in the **Creating** (`Creating`) state and is deleted when the disk is released.
      *
     */
    @Override
    public CompletableFuture<CreateSnapshotResponse> createSnapshot(CreateSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * You can specify `InstanceId` to create a snapshot-consistent group for the specified disks in an instance. You can also specify `DiskId.N` to create a snapshot-consistent group for multiple disks that are attached to multiple instances within the same zone.
      * > You cannot specify both `DiskId.N` and `ExcludeDiskId.N`. If `InstanceId` is set, you can use `DiskId.N` to specify only disks attached to the instance specified by InstanceId. You cannot use DiskId.N to specify disks attached to multiple instances.
      * When you call this operation, take note of the following items:
      * *   The disk for which you want to create a snapshot must be in the **In Use** (`In_use`) or **Unattached** (`Available`) state.
      *     *   If the disk is in the **In Use** (`In_use`) state, the instance to which the disk is attached must be in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      *     *   If the disk is in the **Unattached** (`Available`) state, make sure that the disk has been attached to an ECS instance. Snapshots cannot be created for disks that have never been attached to ECS instances.
      * *   The snapshot-consistent group feature can be used to create snapshots only for enhanced SSDs (ESSDs).
      * *   A single snapshot-consistent group can contain snapshots of up to 16 disks including the system disk and data disks and cannot exceed 32 TiB in size.
      * *   Snapshots that you created by using the snapshot-consistent group feature are retained until they are deleted. We recommend that you delete unnecessary snapshots on a regular basis to prevent them from incurring excessive fees.
      * *   Snapshot-consistent groups cannot be created for disks that have the multi-attach feature enabled. If disks that have the multi-attach feature enabled are attached to an instance, you must set the `ExcludeDiskId.N` parameter to exclude these disks.
      * For information about the snapshot-consistent group feature and its billing, see [Create a snapshot-consistent group](~~199625~~).
      *
     */
    @Override
    public CompletableFuture<CreateSnapshotGroupResponse> createSnapshotGroup(CreateSnapshotGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSnapshotGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSnapshotGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSnapshotGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * A storage set can distribute disks or Shared Block Storage devices to different locations. You can specify the number of partitions in a storage set. A larger number of partitions indicate more discrete distribution of disks or Shared Block Storage devices.
      * When you call this operation, take note of the following items:
      * *   A limitation exists on the number of storage sets that you can create in a region. You can call the [DescribeAccountAttributes](~~73772~~) operation to query the allowed number of storage sets in a region.
      * *   A limitation exists on the number of partitions in a zone. You can call the [DescribeAccountAttributes](~~73772~~) operation to query the allowed number of storage sets in a zone.
      *
     */
    @Override
    public CompletableFuture<CreateStorageSetResponse> createStorageSet(CreateStorageSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateStorageSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateStorageSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateStorageSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateVSwitchResponse> createVSwitch(CreateVSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateVirtualBorderRouterResponse> createVirtualBorderRouter(CreateVirtualBorderRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVirtualBorderRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVirtualBorderRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateVpcResponse> createVpc(CreateVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeactivateRouterInterfaceResponse> deactivateRouterInterface(DeactivateRouterInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeactivateRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeactivateRouterInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeactivateRouterInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * Before you call this operation to delete an activation code, make sure that the activation code has never been used to register managed instances.
      *
     */
    @Override
    public CompletableFuture<DeleteActivationResponse> deleteActivation(DeleteActivationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteActivation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteActivationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteActivationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteAutoProvisioningGroupResponse> deleteAutoProvisioningGroup(DeleteAutoProvisioningGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAutoProvisioningGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAutoProvisioningGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAutoProvisioningGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteAutoSnapshotPolicyResponse> deleteAutoSnapshotPolicy(DeleteAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
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

    @Override
    public CompletableFuture<DeleteCommandResponse> deleteCommand(DeleteCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDedicatedHostClusterResponse> deleteDedicatedHostCluster(DeleteDedicatedHostClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDedicatedHostCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDedicatedHostClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDedicatedHostClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  This operation is in internal preview and has not been officially released. We recommend that you avoid using this operation.
      *
     */
    @Override
    public CompletableFuture<DeleteDemandResponse> deleteDemand(DeleteDemandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDemand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDemandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDemandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDeploymentSetResponse> deleteDeploymentSet(DeleteDeploymentSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDeploymentSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDeploymentSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDeploymentSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteDiagnosticMetricSetsResponse> deleteDiagnosticMetricSets(DeleteDiagnosticMetricSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDiagnosticMetricSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDiagnosticMetricSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDiagnosticMetricSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to delete the diagnostic reports that are no longer needed.
      *
     */
    @Override
    public CompletableFuture<DeleteDiagnosticReportsResponse> deleteDiagnosticReports(DeleteDiagnosticReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDiagnosticReports").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDiagnosticReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDiagnosticReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * When you call this operation to release a pay-as-you-go data disk, take note of the following items:
      * *   Manual snapshots of the disk are retained.
      * *   You can call the [ModifyDiskAttribute](~~25517~~) operation to configure whether to release automatic snapshots together with the disk. We recommend that you delete unneeded snapshots to maintain an enough snapshot quota for new automatic snapshots.
      * *   The disk must be in the Unattached (Available) state.
      * *   If the specified disk does not exist, the request is ignored.
      *
     */
    @Override
    public CompletableFuture<DeleteDiskResponse> deleteDisk(DeleteDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeleteForwardEntryResponse> deleteForwardEntry(DeleteForwardEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteForwardEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteForwardEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteForwardEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeleteHaVipResponse> deleteHaVip(DeleteHaVipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHaVipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHaVipResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteHpcClusterResponse> deleteHpcCluster(DeleteHpcClusterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHpcCluster").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHpcClusterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHpcClusterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteImageResponse> deleteImage(DeleteImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Only custom image components can be deleted.
      *
     */
    @Override
    public CompletableFuture<DeleteImageComponentResponse> deleteImageComponent(DeleteImageComponentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImageComponent").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImageComponentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImageComponentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * If an image build task based on an image template is in the BUILDING, DISTRIBUTING, RELEASING, or CANCELLING state, you cannot delete the template. You can delete the template only when the image build task is in the SUCCESS, FAILED, or CANCELLED state. You can call the DescribeImagePipelineExecutions operation to query the details of an image build task.
      *
     */
    @Override
    public CompletableFuture<DeleteImagePipelineResponse> deleteImagePipeline(DeleteImagePipelineRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteImagePipeline").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteImagePipelineResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteImagePipelineResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   After an instance is released, all the physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.
      * *   Disks attached to the instance:
      *     *   The disks for which `DeleteWithInstance` is set to false are retained as pay-as-you-go disks.
      *     *   The disks for which `DeleteWithInstance` is set to true are released along with the instance.
      *     *   For disks for which `DeleteAutoSnapshot` is set to false, the automatic snapshots of the disks are retained.
      *     *   For disks for which `DeleteAutoSnapshot` is set to true, the automatic snapshots of the disks are released.
      *     *   Manual snapshots of the disks are retained.
      *     *   If `OperationLocks` in the response contains `"LockReason" : "security"` for an instance, the instance is locked for security reasons. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~). Even if `DeleteWithInstance` is set to `false` for the data disks that are attached to the instance, this parameter is ignored and the data disks are released along with the instance.
      *
     */
    @Override
    public CompletableFuture<DeleteInstanceResponse> deleteInstance(DeleteInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   After an instance is released, all the physical resources used by the instance are recycled. Relevant data is erased and cannot be restored.
      * *   Disks attached to the instance:
      *     *   The disks for which `DeleteWithInstance` is set to false are retained as pay-as-you-go disks.
      *     *   The disks for which `DeleteWithInstance` is set to true are released along with the instance.
      *     *   For disks for which `DeleteAutoSnapshot` is set to false, the automatic snapshots of the disks are retained.
      *     *   For disks for which `DeleteAutoSnapshot` is set to true, the automatic snapshots of the disks are released.
      *     *   Manual snapshots of the disks are retained.
      *     *   If `OperationLocks` in the DeleteInstances response contains `"LockReason" : "security"` for an instance, the instance is locked for security reasons. Even if the `DeleteWithInstance` parameter is set to `false` for the data disks that are attached to the instance, the parameter is ignored and the data disks are released along with the instance. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      *
     */
    @Override
    public CompletableFuture<DeleteInstancesResponse> deleteInstances(DeleteInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   After an SSH key pair is deleted, you cannot query the SSH key pair by calling the [DescribeKeyPairs](~~51773~~) operation.
      * *   If an SSH key pair is bound to one or more Elastic Compute Service (ECS) instances, the SSH key pair cannot be deleted.
      *
     */
    @Override
    public CompletableFuture<DeleteKeyPairsResponse> deleteKeyPairs(DeleteKeyPairsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteKeyPairs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteKeyPairsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteKeyPairsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteLaunchTemplateResponse> deleteLaunchTemplate(DeleteLaunchTemplateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLaunchTemplate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLaunchTemplateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLaunchTemplateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteLaunchTemplateVersionResponse> deleteLaunchTemplateVersion(DeleteLaunchTemplateVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLaunchTemplateVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLaunchTemplateVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLaunchTemplateVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeleteNatGatewayResponse> deleteNatGateway(DeleteNatGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNatGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNatGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNatGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   The ENI must be in the Available state.
      * *   If the ENI is bound to an ECS instance, you must unbind the ENI from the ECS instance ([DetachNetworkInterface](~~58514~~)) before you can delete the ENI.
      * *   After an ENI is deleted:
      *     *   The primary private IP address of the ENI is automatically released.
      *     *   The ENI is automatically removed from its security groups.
      *
     */
    @Override
    public CompletableFuture<DeleteNetworkInterfaceResponse> deleteNetworkInterface(DeleteNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeleteNetworkInterfacePermissionResponse> deleteNetworkInterfacePermission(DeleteNetworkInterfacePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetworkInterfacePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNetworkInterfacePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNetworkInterfacePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeletePhysicalConnectionResponse> deletePhysicalConnection(DeletePhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * If a prefix list is associated with resources, you cannot delete the prefix list. You must disassociate the prefix list from the resources before you can delete the prefix list. You can call the [DescribePrefixListAssociations](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/describeprefixlistassociations) operation to query resources that are associated with a specific prefix list.
      *
     */
    @Override
    public CompletableFuture<DeletePrefixListResponse> deletePrefixList(DeletePrefixListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePrefixListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePrefixListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeleteRouteEntryResponse> deleteRouteEntry(DeleteRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeleteRouterInterfaceResponse> deleteRouterInterface(DeleteRouterInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRouterInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRouterInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRouterInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you delete a security group, make sure that no instances are present in the security group and that the security group is not referenced by other security groups [DescribeSecurityGroupReferences](~~57320~~)). Otherwise, the DeleteSecurityGroup request fails.
      *
     */
    @Override
    public CompletableFuture<DeleteSecurityGroupResponse> deleteSecurityGroup(DeleteSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * When you call this operation, take note of the following items:
      * *   If the specified snapshot ID does not exist, the request is ignored.
      * *   A snapshot that has been used to create custom images cannot be deleted. The snapshot can be deleted only after the created custom images are deleted ([DeleteImage](~~25537~~)).
      * *   A snapshot that has been used to create disks cannot be deleted. If you do want to delete the snapshot, set the `Force` parameter to true to force delete the snapshot. The disks created from the snapshot cannot be re-initialized after the snapshot is force deleted.
      *
     */
    @Override
    public CompletableFuture<DeleteSnapshotResponse> deleteSnapshot(DeleteSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * If you have custom images that were created from a disk snapshot contained in a snapshot-consistent group, the disk snapshot is retained when the snapshot-consistent group is deleted. Before you can delete the disk snapshot, you must call the [DeleteImage](~~25537~~) operation to delete the custom images. Then, you can call the [DeleteSnapshot](~~25525~~) operation to delete the disk snapshot.
      *
     */
    @Override
    public CompletableFuture<DeleteSnapshotGroupResponse> deleteSnapshotGroup(DeleteSnapshotGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSnapshotGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSnapshotGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSnapshotGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteStorageSetResponse> deleteStorageSet(DeleteStorageSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteStorageSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteStorageSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteStorageSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeleteVSwitchResponse> deleteVSwitch(DeleteVSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeleteVirtualBorderRouterResponse> deleteVirtualBorderRouter(DeleteVirtualBorderRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVirtualBorderRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVirtualBorderRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeleteVpcResponse> deleteVpc(DeleteVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeregisterManagedInstanceResponse> deregisterManagedInstance(DeregisterManagedInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeregisterManagedInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeregisterManagedInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeregisterManagedInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeAccessPointsResponse> describeAccessPoints(DescribeAccessPointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccessPoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccessPointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccessPointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you [create](https://account.alibabacloud.com/register/intl_register.htm) an Alibaba Cloud account, you can create a specific number of ECS instances in different regions within the account. For more information, see [Limits](~~25412~~).
      * You can also [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex) to request a quota increase.
      *
     */
    @Override
    public CompletableFuture<DescribeAccountAttributesResponse> describeAccountAttributes(DescribeAccountAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAccountAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAccountAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAccountAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeActivationsResponse> describeActivations(DescribeActivationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeActivations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeActivationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeActivationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAutoProvisioningGroupHistoryResponse> describeAutoProvisioningGroupHistory(DescribeAutoProvisioningGroupHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoProvisioningGroupHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoProvisioningGroupHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoProvisioningGroupHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAutoProvisioningGroupInstancesResponse> describeAutoProvisioningGroupInstances(DescribeAutoProvisioningGroupInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoProvisioningGroupInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoProvisioningGroupInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoProvisioningGroupInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAutoProvisioningGroupsResponse> describeAutoProvisioningGroups(DescribeAutoProvisioningGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoProvisioningGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoProvisioningGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoProvisioningGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeAutoSnapshotPolicyExResponse> describeAutoSnapshotPolicyEx(DescribeAutoSnapshotPolicyExRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoSnapshotPolicyEx").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoSnapshotPolicyExResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoSnapshotPolicyExResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The value of the `DestinationResource` parameter determines whether you need to specify additional parameters. The following sequence provides the order by which resources are filtered. You cannot query a higher order resource by specifying a lower order resource.
      * *   Sequence: `Zone > IoOptimized > InstanceType = Network = ddh > SystemDisk > DataDisk`
      * *   Examples:
      *     *   If you set `DestinationResource` to `DataDisk`, you must specify the `InstanceType` parameter or set the `ResourceType` parameter to `disk`.
      *     *   If you set `DestinationResource` to `SystemDisk`, you must specify the `InstanceType` parameter.
      *     *   If you set `DestinationResource` to `InstanceType`, you must specify the `IoOptimized` and `InstanceType` parameters.
      *     *   If you want to query available ecs.g5.large resources in all zones of the China (Hangzhou) region, you must set RegionId to cn-hangzhou, DestinationResource to InstanceType, IoOptimized to optimized, and InstanceType to ecs.g5.large.``
      *     *   If you want to query the zones where ecs.g5.large resources are available in the China (Hangzhou) region, you must set RegionId to cn-hangzhou, DestinationResource to Zone, IoOptimized to optimized, and InstanceType to ecs.g5.large.``
      *
     */
    @Override
    public CompletableFuture<DescribeAvailableResourceResponse> describeAvailableResource(DescribeAvailableResourceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAvailableResource").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAvailableResourceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAvailableResourceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeBandwidthLimitationResponse> describeBandwidthLimitation(DescribeBandwidthLimitationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBandwidthLimitation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBandwidthLimitationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBandwidthLimitationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeBandwidthPackagesResponse> describeBandwidthPackages(DescribeBandwidthPackagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBandwidthPackages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBandwidthPackagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBandwidthPackagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCapacityReservationInstancesResponse> describeCapacityReservationInstances(DescribeCapacityReservationInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCapacityReservationInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCapacityReservationInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCapacityReservationInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCapacityReservationsResponse> describeCapacityReservations(DescribeCapacityReservationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCapacityReservations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCapacityReservationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCapacityReservationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   This operation applies only to instances that reside in the classic network.
      * *   You can query up to 100 instances that reside in the classic network at a time.
      * *   At least one of the `VpcId` and `InstanceId` parameters must be specified.
      *
     */
    @Override
    public CompletableFuture<DescribeClassicLinkInstancesResponse> describeClassicLinkInstances(DescribeClassicLinkInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClassicLinkInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClassicLinkInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClassicLinkInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCloudAssistantStatusResponse> describeCloudAssistantStatus(DescribeCloudAssistantStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudAssistantStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudAssistantStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudAssistantStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeClustersResponse> describeClusters(DescribeClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * If you specify only the `Action` and `RegionId` parameters to call this operation, all the available commands (`CommandId`) that you created in the specified region are queried by default.
      *
     */
    @Override
    public CompletableFuture<DescribeCommandsResponse> describeCommands(DescribeCommandsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommands").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCommandsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCommandsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDedicatedHostAutoRenewResponse> describeDedicatedHostAutoRenew(DescribeDedicatedHostAutoRenewRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHostAutoRenew").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedHostAutoRenewResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedHostAutoRenewResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can specify multiple request parameters to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions. However, if `DedicatedHostClusterIds` is set to an empty JSON array (`[]`), it is regarded as a valid filter condition and an empty result is returned.
      *
     */
    @Override
    public CompletableFuture<DescribeDedicatedHostClustersResponse> describeDedicatedHostClusters(DescribeDedicatedHostClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHostClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedHostClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedHostClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDedicatedHostTypesResponse> describeDedicatedHostTypes(DescribeDedicatedHostTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHostTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedHostTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedHostTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * You can use one of the following methods to query the details of one or more dedicated hosts:
      * *   Specify the `DedicatedHostIds` parameter to query the details of specified dedicated hosts.
      * *   Specify the `DedicatedHostClusterId` parameter to query the details of the dedicated hosts in a dedicated host cluster.
      *
     */
    @Override
    public CompletableFuture<DescribeDedicatedHostsResponse> describeDedicatedHosts(DescribeDedicatedHostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDedicatedHosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDedicatedHostsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDedicatedHostsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query the details of resources you filed with Alibaba Cloud, including the types, delivery status, and consumption details of the resources.
      * By default, the filing tickets of I/O optimized VPC-type instances are queried.
      * For information about how to create (CreateDemand), modify (ModifyDemand), and delete (DeleteDemand) filing tickets on ECS resources, contact your account manager.
      *
     */
    @Override
    public CompletableFuture<DescribeDemandsResponse> describeDemands(DescribeDemandsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDemands").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDemandsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDemandsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * For more information about instance families, see [Instance families](~~25378~~).
      *
     */
    @Override
    public CompletableFuture<DescribeDeploymentSetSupportedInstanceTypeFamilyResponse> describeDeploymentSetSupportedInstanceTypeFamily(DescribeDeploymentSetSupportedInstanceTypeFamilyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeploymentSetSupportedInstanceTypeFamily").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeploymentSetSupportedInstanceTypeFamilyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeploymentSetSupportedInstanceTypeFamilyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDeploymentSetsResponse> describeDeploymentSets(DescribeDeploymentSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeploymentSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeploymentSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeploymentSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDiagnosticMetricSetsResponse> describeDiagnosticMetricSets(DescribeDiagnosticMetricSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiagnosticMetricSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiagnosticMetricSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiagnosticMetricSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDiagnosticMetricsResponse> describeDiagnosticMetrics(DescribeDiagnosticMetricsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiagnosticMetrics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiagnosticMetricsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiagnosticMetricsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDiagnosticReportAttributesResponse> describeDiagnosticReportAttributes(DescribeDiagnosticReportAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiagnosticReportAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiagnosticReportAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiagnosticReportAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeDiagnosticReportsResponse> describeDiagnosticReports(DescribeDiagnosticReportsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiagnosticReports").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiagnosticReportsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiagnosticReportsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The monitoring data includes read IOPS, write IOPS, read bandwidth (byte/s), write bandwidth (byte/s), read latency (microseconds), and write latency (microseconds) of the disk.
      * When you call this operation, take note of the following items:
      * *   Only the monitoring data of disks that are in the Running (`In_use`) state can be queried. For more information, see [Disk states](~~25689~~).
      *     > Some information may be missing from the monitoring data of a disk because the disk is not in the In Use (`In_Use`) state and the system cannot obtain the relevant information.
      * *   Up to 400 monitoring data entries can be returned at a time. An error is returned if the value calculated based on the following formula is greater than 400: `(EndTime - StartTime)/Period`.
      * *   You can query the monitoring data in the previous 30 days. If the value of `StartTime` is more than 30 days before the current time, an error is returned.
      *
     */
    @Override
    public CompletableFuture<DescribeDiskMonitorDataResponse> describeDiskMonitorData(DescribeDiskMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiskMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiskMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiskMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can specify multiple request parameters such as `RegionId`, `ZoneId`, `DiskIds`, and `InstanceId` to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      * * The `DiskIds` value is a JSON array. If DiskIds is not specified, it is not used as a filter condition. If `DiskIds` is set to an empty JSON array, it is regarded as a valid filter condition, and an empty result is returned.
      * * You can use one of the following methods to check the responses:
      *     * Method 1: Use `NextToken` to configure the query token. Set the value to the `NextToken` value that is returned in the last call to the DescribeDisks operation. Then, use `MaxResults` to specify the maximum number of entries to return on each page.
      *     * Method 2: Use `PageSize` to specify the number of entries to return on each page and then use `PageNumber` to specify the number of the page to return.
      *         You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use method 1. When `NextToken` is specified, `PageSize` and `PageNumber` do not take effect and `TotalCount` in the response is invalid.
      * * A disk that has the multi-attach feature enabled can be attached to multiple instances. You can query the attachment information of the disk based on the `Attachment` values in the response.
      * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    @Override
    public CompletableFuture<DescribeDisksResponse> describeDisks(DescribeDisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDisksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDisksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The full status information of an EBS device includes the lifecycle status provided by the `Status` parameter, health status provided by the `HealthStatus` parameter, and event type provided by the `EventType` parameter of the EBS device. You can filter the results based on these parameters.
      * *   The release time, scheduled execution time, and actual execution time of each EBS device event are identical. If you specify a period of time by using the `EventTime.Start` and `EventTime.End` parameters, all events that occurred within this period are queried. You can query events that occurred within the last seven days.
      *
     */
    @Override
    public CompletableFuture<DescribeDisksFullStatusResponse> describeDisksFullStatus(DescribeDisksFullStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDisksFullStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDisksFullStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDisksFullStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeEipAddressesResponse> describeEipAddresses(DescribeEipAddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEipAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEipAddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEipAddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeEipMonitorDataResponse> describeEipMonitorData(DescribeEipMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEipMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEipMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEipMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When an elasticity assurance expires, data about the association between instances and the private pool generated by the elasticity assurance becomes invalid. If you call this operation to query the expired elasticity assurance, no value is returned.
      *
     */
    @Override
    public CompletableFuture<DescribeElasticityAssuranceInstancesResponse> describeElasticityAssuranceInstances(DescribeElasticityAssuranceInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeElasticityAssuranceInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeElasticityAssuranceInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeElasticityAssuranceInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeElasticityAssurancesResponse> describeElasticityAssurances(DescribeElasticityAssurancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeElasticityAssurances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeElasticityAssurancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeElasticityAssurancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * The monitored data includes traffic sent and received over the internal network, the number of packets sent and received by the secondary ENI, and the number of dropped packets sent and received by the secondary ENI. Specific information may be missing from the returned monitored data. This is because the system cannot obtain the relevant information. For example, if the instance to which the secondary ENI is bound is in the Stopped state, or if the secondary ENI is not bound to an instance and is in the Available state, the monitored data of the secondary ENI cannot be obtained. When you call this operation, take note of the following items:
      * *   Up to 400 monitored data entries can be returned at a time. If the value calculated by using the (EndTime - StartTime)/Period formula is greater than 400, an error is returned.
      * *   Only the monitored data within the last 30 days can be queried. If the value of the StartTime parameter is earlier than 30 days from the time when you call this operation, an error is returned.
      *
     */
    @Override
    public CompletableFuture<DescribeEniMonitorDataResponse> describeEniMonitorData(DescribeEniMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEniMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEniMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEniMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeForwardTableEntriesResponse> describeForwardTableEntries(DescribeForwardTableEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeForwardTableEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeForwardTableEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeForwardTableEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeHaVipsResponse> describeHaVips(DescribeHaVipsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHaVips").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHaVipsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHaVipsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeHpcClustersResponse> describeHpcClusters(DescribeHpcClustersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHpcClusters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHpcClustersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHpcClustersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can use `NextToken` to configure the query token. Set the value to the `NextToken` value that is returned in the last call to the DescribeImageComponents operation. Then, use `MaxResults` to specify the maximum number of entries to return on each page.
      *
     */
    @Override
    public CompletableFuture<DescribeImageComponentsResponse> describeImageComponents(DescribeImageComponentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageComponents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageComponentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageComponentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   This API operation only returns the available custom images that are newly created in the specified image family. Public images, Alibaba Cloud Marketplace images, community images, or shared images are not queried.
      * *   If no available custom images exist in the specified image family, the response is empty.
      *
     */
    @Override
    public CompletableFuture<DescribeImageFromFamilyResponse> describeImageFromFamily(DescribeImageFromFamilyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageFromFamily").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageFromFamilyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageFromFamilyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * The image template specified by the `ImagePipelineId` parameter cannot be a deleted image template. The corresponding build task is deleted when an image template is deleted.
      * * You must set the `ImagePipelineId` parameter to specify the ID of an image template or the `ExecutionId` parameter to specify the ID of a build task.
      * * You can configure the query token by using the `NextToken` parameter. Set the value of NextToken to the `NextToken` value that was returned when you last called the `DescribeImagePipelineExecutions` operation. Then, use the `MaxResults` parameter to configure the maximum number of entries to return on each page to query the details of the image build task.
      *
     */
    @Override
    public CompletableFuture<DescribeImagePipelineExecutionsResponse> describeImagePipelineExecutions(DescribeImagePipelineExecutionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImagePipelineExecutions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImagePipelineExecutionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImagePipelineExecutionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeImagePipelinesResponse> describeImagePipelines(DescribeImagePipelinesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImagePipelines").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImagePipelinesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImagePipelinesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeImageSharePermissionResponse> describeImageSharePermission(DescribeImageSharePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageSharePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageSharePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageSharePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeImageSupportInstanceTypesResponse> describeImageSupportInstanceTypes(DescribeImageSupportInstanceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImageSupportInstanceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImageSupportInstanceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImageSupportInstanceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can query your custom images, public images provided by Alibaba Cloud, Alibaba Cloud Marketplace images, and shared images from other Alibaba Cloud accounts.
      * * This operation supports paged query. The response contains the total number of available images and the images on the returned page. By default, ten entries are displayed on each page.
      * * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in the required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    @Override
    public CompletableFuture<DescribeImagesResponse> describeImages(DescribeImagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeImages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeImagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeImagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * A private pool is generated after an elasticity assurance or a capacity reservation is created. The private pool is associated with the attributes of matching instances. You can configure a private pool when you create an instance, so that the instance matches the elasticity assurance or capacity reservation that is associated with the private pool.
      * When a private pool expires, data about the association between instances and the private pool becomes invalid. In this case, a call to this operation returns empty values related to private pools.
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceAttachmentAttributesResponse> describeInstanceAttachmentAttributes(DescribeInstanceAttachmentAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAttachmentAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAttachmentAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAttachmentAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceAttributeResponse> describeInstanceAttribute(DescribeInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Before you configure auto-renewal or manual renewal for subscription instances, you can query the auto-renewal status of the instances.
      * *   This operation is applicable to only subscription instances. An error is returned if you call this operation on pay-as-you-go instances.
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceAutoRenewAttributeResponse> describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can query system events that were finished within the last 30 days. The time range for querying unfinished system events is unlimited.
      * *   You can also specify the InstanceEventCycleStatus.N parameter to query the system events that are in the Scheduled, Executing, or Inquiring state.
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceHistoryEventsResponse> describeInstanceHistoryEvents(DescribeInstanceHistoryEventsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceHistoryEvents").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceHistoryEventsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceHistoryEventsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is used to query the specified maintenance policy of an instance, which contains the following maintenance attributes:
      * *   Maintenance window: the time period that you specify for maintenance.
      * *   Maintenance action: the action that you specify in response to instance shutdown.
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceMaintenanceAttributesResponse> describeInstanceMaintenanceAttributes(DescribeInstanceMaintenanceAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceMaintenanceAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceMaintenanceAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceMaintenanceAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   Pricing information can be queried for unexpired subscription ECS instances only when you upgrade their configurations. The pricing information cannot be queried when the instance configurations are downgraded.
      * *   Pricing information cannot be queried for pay-as-you-go ECS instances when you change their configurations. Prices of existing pay-as-you-go ECS instances whose configurations are changed are the same as those of new pay-as-you-go instances. You can call the [DescribePrice](~~107829~~) operation to query the latest prices of ECS instances.
      * *   Before you upgrade the configurations of an instance, we recommend that you call the [DescribeResourcesModification](~~66187~~) operation to query the instance types available for configuration upgrades in a specified zone.
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceModificationPriceResponse> describeInstanceModificationPrice(DescribeInstanceModificationPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceModificationPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceModificationPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceModificationPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   Up to 400 monitoring data entries can be returned at a time. An error is returned if the value calculated based on the following formula is greater than 400: `(EndTime − StartTime)/Period`.
      * *   You can query the monitoring data of the last 30 days. If the value of the `StartTime` parameter is more than 30 days earlier than the current time, an error is returned.
      * *   In some scenarios, such as when the instance is in the Stopped state, the system cannot obtain the relevant information and a portion may be missing from the returned monitoring data.
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceMonitorDataResponse> describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeInstanceRamRoleResponse> describeInstanceRamRole(DescribeInstanceRamRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceRamRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceRamRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceRamRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * For information about the lifecycle states of an ECS instance, see [Instance states](~~25687~~).
      * * You can also call this operation to query the list of ECS instances.
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceStatusResponse> describeInstanceStatus(DescribeInstanceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  The DescribeInstanceTopology operation is in invitational preview and is not commercially available.
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceTopologyResponse> describeInstanceTopology(DescribeInstanceTopologyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTopology").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceTopologyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceTopologyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeInstanceTypeFamiliesResponse> describeInstanceTypeFamilies(DescribeInstanceTypeFamiliesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTypeFamilies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceTypeFamiliesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceTypeFamiliesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * Before you call this operation, take note of the following items:
      * *   The MaxResults parameter specifies the maximum number of entries to return on each page. The maximum value of this parameter is changed from 1600 to 100. If you called this operation in 2022, you can continue to use 1600 as the maximum value of MaxResults until November 15, 2023. As of November 15, 2023, only 100 can be used as the maximum value of MaxResults. If you do not specify the NextToken parameter when you call the DescribeInstanceTypes operation, only the first page of results that contains up to 100 entries is returned. If you want to retrieve more results, specify the NextToken parameter to perform paged queries, or specify filter conditions to filter results. For information about the best practices for using DescribeInstanceTypes, see [Compare the specifications of instance types](https://help.aliyun.com/practice_detail/461278) .
      * *   We recommend that you specify the MaxResults and NextToken parameters to perform paged queries. The first time you call the DescribeInstanceTypes operation, specify MaxResults to limit the maximum number of entries to return in the call. If the number of entries to return exceeds the specified value of MaxResults, the response includes a NextToken value. You can set NextToken to the return value and specify MaxResults in your next request to DescribeInstanceTypes to retrieve the next page of results.
      * *   The DescribeInstanceTypes operation is used to query only the specifications and performance information of instance types. To query instance types that are available in a specific region, call the [DescribeAvailableResource](~~66186~~) operation.
      * *   To use special instance types such as instance types that are unavailable for purchase, [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm).
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceTypesResponse> describeInstanceTypes(DescribeInstanceTypesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceTypes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceTypesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceTypesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceVncPasswdResponse> describeInstanceVncPasswd(DescribeInstanceVncPasswdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceVncPasswd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceVncPasswdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceVncPasswdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * * The URL of an VNC management terminal is valid only for 15 seconds. If a connection is not established within 15 seconds after a successful query, the URL expires and you must query it again.
      * * The **KeepAlive** time of a connection to an VNC management terminal is 60 seconds. If you do not interact with the VNC management terminal within 60 seconds, the VNC management terminal is automatically disconnected.
      * * When the VNC management terminal is disconnected, you can only reconnect to the VNC management terminal a maximum of 30 times a minute.
      * * You must append the following parameters to the end of the `https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?` URL: `vncUrl`, `instanceId`, `isWindows` (True or `False`), and `password`. Connect these parameters with ampersands (`&`).
      *     * `vncUrl`: the `VncUrl` value returned after a successful query.
      *     * `instanceId`: the ID of your instance.
      *     * `isWindows`: specifies whether the operating system of the instance is Windows. If the parameter is set to `true`, the operating system is Windows. If the value is set to `false`, the operating system is not Windows.
      *     * `password`: Optional. The VNC password used to connect to the VNC management terminal. It must be six characters in length and can contain digits and letters. You can use this parameter to eliminate the need to enter your password when you connect to the VNC management terminal.
      *         Examples:
      *         ```
      *         https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%****&instanceId=i-wz9hhwq5a6tm****&isWindows=true
      *                
      *         ```
      *         Or:
      *         ```
      *         https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%****&instanceId=i-wz9hhwq5a6tm****&isWindows=true&password=****
      *                
      *         ```
      *
     */
    @Override
    public CompletableFuture<DescribeInstanceVncUrlResponse> describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstanceVncUrl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstanceVncUrlResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstanceVncUrlResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can specify multiple request parameters to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions. However, if InstanceIds is set to an empty JSON array, it is regarded as a valid filter condition and an empty result is returned.
      * * If you are using a Resource Access Management (RAM) user or RAM role that does not have the permissions to call this operation, an empty list is returned. You can include the `DryRun` parameter in your request to check whether the empty list is caused by lack of permissions.
      * * When you call an API operation by using Alibaba Cloud CLI, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      * * You can use one of the following methods to check the responses:
      *     * Method 1: During a paged query, when you call the DescribeInstances operation to retrieve the first page of results, set `MaxResults` to specify the maximum number of entries to return in the call. The return value of `NextToken` is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeInstances operation to retrieve a new page of results, set `NextToken` to the `NextToken` value returned in the previous call and set `MaxResults` to specify the maximum number of entries to return in this call.
      *     * Method 2: Use `PageSize` to specify the number of entries to return on each page and then use `PageNumber` to specify the number of the page to return.
      *         You can use only one of the preceding methods. If a large number of entries are to be returned, we recommend that you use method 1. When `MaxResults` or `NextToken` is specified, the `PageSize` and `PageNumber` request parameters do not take effect and the `TotalCount` response parameter is invalid.
      *
     */
    @Override
    public CompletableFuture<DescribeInstancesResponse> describeInstances(DescribeInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The response includes instance states and instance system events in the Scheduled state.
      * If a period is specified, events are queried based on the specified period.
      *
     */
    @Override
    public CompletableFuture<DescribeInstancesFullStatusResponse> describeInstancesFullStatus(DescribeInstancesFullStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInstancesFullStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInstancesFullStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInstancesFullStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   After you run a command, the command may not succeed or return the expected results. You can call this operation to query the actual execution results.
      * *   You can query the information about command executions within the last four weeks. A maximum of 100,000 pieces of execution information can be retained.
      *
     */
    @Override
    public CompletableFuture<DescribeInvocationResultsResponse> describeInvocationResults(DescribeInvocationResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInvocationResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInvocationResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInvocationResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   After you run a command, the command may not succeed or return the expected results. You can call this operation to query the execution results.
      * *   You can query information about command executions within the last four weeks. A maximum of 100,000 pieces of execution information can be retained.
      *
     */
    @Override
    public CompletableFuture<DescribeInvocationsResponse> describeInvocations(DescribeInvocationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeInvocations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeInvocationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeInvocationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeKeyPairsResponse> describeKeyPairs(DescribeKeyPairsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeKeyPairs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeKeyPairsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeKeyPairsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeLaunchTemplateVersionsResponse> describeLaunchTemplateVersions(DescribeLaunchTemplateVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLaunchTemplateVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLaunchTemplateVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLaunchTemplateVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeLaunchTemplatesResponse> describeLaunchTemplates(DescribeLaunchTemplatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLaunchTemplates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLaunchTemplatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLaunchTemplatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeLimitationResponse> describeLimitation(DescribeLimitationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLimitation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLimitationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLimitationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeManagedInstancesResponse> describeManagedInstances(DescribeManagedInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeManagedInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeManagedInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeManagedInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeNatGatewaysResponse> describeNatGateways(DescribeNatGatewaysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNatGateways").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNatGatewaysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNatGatewaysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeNetworkInterfaceAttributeResponse> describeNetworkInterfaceAttribute(DescribeNetworkInterfaceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkInterfaceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNetworkInterfaceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNetworkInterfaceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeNetworkInterfacePermissionsResponse> describeNetworkInterfacePermissions(DescribeNetworkInterfacePermissionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkInterfacePermissions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNetworkInterfacePermissionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNetworkInterfacePermissionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * The `DescribeNetworkInterfaces` operation supports multiple pagination mechanisms. We recommend that you set `MaxResults` to specify the maximum number of entries to return in each request. The returned value of `NextToken` is a pagination token, which can be used in the next request to retrieve a new page of results. When you perform the next request, set `NextToken` to the `NextToken` value returned in the previous call and set `MaxResults` to specify the maximum number of entries to return in this call.
      * > If you specify `MaxResults` or `NextToken`, the system returns results based on the preceding pagination mechanism. Otherwise, the system paginates the results based on the `PageNumber` and `PageSize` parameters.
      *
     */
    @Override
    public CompletableFuture<DescribeNetworkInterfacesResponse> describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkInterfaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNetworkInterfacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNetworkInterfacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeNewProjectEipMonitorDataResponse> describeNewProjectEipMonitorData(DescribeNewProjectEipMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNewProjectEipMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNewProjectEipMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNewProjectEipMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribePhysicalConnectionsResponse> describePhysicalConnections(DescribePhysicalConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhysicalConnections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhysicalConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhysicalConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribePrefixListAssociationsResponse> describePrefixListAssociations(DescribePrefixListAssociationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrefixListAssociations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePrefixListAssociationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePrefixListAssociationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribePrefixListAttributesResponse> describePrefixListAttributes(DescribePrefixListAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrefixListAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePrefixListAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePrefixListAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * You can specify the `AddressFamily`, `PrefixListId.N`, and `PrefixListName` request parameters to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      *
     */
    @Override
    public CompletableFuture<DescribePrefixListsResponse> describePrefixLists(DescribePrefixListsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrefixLists").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePrefixListsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePrefixListsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   The required parameters vary based on the types of resources whose prices you want to query.
      *     *   When the `ResourceType` parameter is set to instance, you must specify the `InstanceType` parameter.
      *     *   When the `ResourceType` parameter is set to disk, you must specify both the `DataDisk.1.Category` and `DataDisk.1.Size` parameters. When the `ResourceType` parameter is set to disk, only pay-as-you-go disk prices are returned. In this scenario, the `PriceUnit` parameter can be set only to `Hour`.
      *     *   When the `ResourceType`parameter is set to ddh, you must specify the `DedicatedHostType` parameter.
      *     *   When the `ResourceType`parameter is set to ElasticityAssurance, you must specify the `InstanceType` parameter.
      *     *   When the `ResourceType`parameter is set to CapacityReservation, you must specify the `InstanceType` parameter.
      * *   When the `ResourceType` parameter is set to bandwidth, only the pay-by-traffic (`PayByTraffic`) price for network usage is returned.
      * *   When the `ResourceType` parameter is set to instance, the prices of up to four data disks can be queried.
      * *   By default, the `ChargeType` parameter is set to `PostPaid`. You can specify the `PriceUnit` parameter to query prices of ECS resources that have different billing cycles.
      *
     */
    @Override
    public CompletableFuture<DescribePriceResponse> describePrice(DescribePriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRecommendInstanceTypeResponse> describeRecommendInstanceType(DescribeRecommendInstanceTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRecommendInstanceType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRecommendInstanceTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRecommendInstanceTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ****
      *
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
      * ## Description
      * *   You can call this operation to query the price for renewing a subscription instance for a specific period of time or to a synchronized expiration date.
      * *   Take note of the following items:
      *     *   If you set only the required parameters, the price for renewing a specified instance for one month is queried by default.
      *     *   The renewal period-related parameter pair (`Period` and `PeriodUnit`) and the synchronized expiration date-related parameter (`ExpectedRenewDay`) are mutually exclusive. You cannot set these parameters together to query the prices for renewing a specified instance for a period of time and to a synchronized expiration date at the same time.
      *
     */
    @Override
    public CompletableFuture<DescribeRenewalPriceResponse> describeRenewalPrice(DescribeRenewalPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRenewalPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRenewalPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRenewalPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeReservedInstanceAutoRenewAttributeResponse> describeReservedInstanceAutoRenewAttribute(DescribeReservedInstanceAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeReservedInstanceAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeReservedInstanceAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeReservedInstanceAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeReservedInstancesResponse> describeReservedInstances(DescribeReservedInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeReservedInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeReservedInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeReservedInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeResourceByTagsResponse> describeResourceByTags(DescribeResourceByTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourceByTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourceByTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourceByTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeResourcesModificationResponse> describeResourcesModification(DescribeResourcesModificationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeResourcesModification").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeResourcesModificationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeResourcesModificationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeRouteTablesResponse> describeRouteTables(DescribeRouteTablesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouteTables").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRouteTablesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRouteTablesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeRouterInterfacesResponse> describeRouterInterfaces(DescribeRouterInterfacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouterInterfaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRouterInterfacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRouterInterfacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSecurityGroupAttributeResponse> describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   A security group can be referenced by the inbound or outbound rules of other security groups.
      * *   Up to 100 entries can be returned each time.
      * *   If a security group cannot be deleted by calling the [DeleteSecurityGroup](~~25558~~) operation, you can call the DescribeSecurityGroupReferences operation to check whether the security group is referenced by the rules of other security groups. If the security group is referenced by the rules of other security groups, you must remove the reference before you can delete the security group.
      *
     */
    @Override
    public CompletableFuture<DescribeSecurityGroupReferencesResponse> describeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityGroupReferences").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityGroupReferencesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityGroupReferencesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   The basic information of security groups includes their IDs and descriptions. In the response, security groups are displayed in descending order of their IDs.
      * *   We recommend that you use the NextToken and MaxResults parameters for a paged query. During a paged query, when you call the DescribeSecurityGroups operation to retrieve the first page of results, set MaxResults to specify the maximum number of entries to return in the call. The return value of NextToken is a pagination token, which can be used in the next call to retrieve a new page of results. When you call the DescribeSecurityGroups operation to retrieve a new page of results, set NextToken to the NextToken value returned in the previous call and set MaxResults to specify the maximum number of entries to return in this call. If the return value of NextToken is empty, the current page of results is the last page and no more results are to be returned.
      * *   When you use Alibaba Cloud CLI to call an API operation, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    @Override
    public CompletableFuture<DescribeSecurityGroupsResponse> describeSecurityGroups(DescribeSecurityGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSecurityGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSecurityGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSecurityGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * *   When you send a file, the file may fail to be sent to specified Elastic Compute Service (ECS) instances. You can call this operation to check whether the file is successfully sent.
      * *   You can call this operation to query the records of files sent in the last six weeks.
      *
     */
    @Override
    public CompletableFuture<DescribeSendFileResultsResponse> describeSendFileResults(DescribeSendFileResultsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSendFileResults").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSendFileResultsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSendFileResultsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * You can specify multiple request parameters such as `InstanceId`, `SnapshotGroupId.N`, and `Status.N` to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      *
     */
    @Override
    public CompletableFuture<DescribeSnapshotGroupsResponse> describeSnapshotGroups(DescribeSnapshotGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSnapshotLinksResponse> describeSnapshotLinks(DescribeSnapshotLinksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotLinks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotLinksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotLinksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSnapshotMonitorDataResponse> describeSnapshotMonitorData(DescribeSnapshotMonitorDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotMonitorData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotMonitorDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotMonitorDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSnapshotPackageResponse> describeSnapshotPackage(DescribeSnapshotPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can specify multiple request parameters such as `InstanceId`, `DiskId`, and `SnapshotIds` to be queried. Specified parameters have logical AND relations. Only the specified parameters are included in the filter conditions.
      * When you use Alibaba Cloud CLI to call an API operation, you must specify request parameter values of different data types in required formats. For more information, see [Parameter format overview](~~110340~~).
      *
     */
    @Override
    public CompletableFuture<DescribeSnapshotsResponse> describeSnapshots(DescribeSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSnapshotsUsageResponse> describeSnapshotsUsage(DescribeSnapshotsUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnapshotsUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnapshotsUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnapshotsUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * You can call this operation to query information that is generated for preemptible instances in the last 30 days and select suitable instance types based on the query results. The information that you can query by calling this operation includes:
      *     * Average release rate of preemptible instances
      *     * Percentage of the average preemptible instance price relative to the pay-as-you-go instance price
      *     * Average preemptible instance price that is calculated based on the preceding percentage
      * * This operation is applicable only to I/O optimized preemptible instances that are located in virtual private clouds (VPCs).
      * * You can use one of the following methods to query information that is generated for preemptible instances in the last 30 days:
      *     * Set the `Cores` and `Memory` parameters or the `MinCores` and `MinMemory` parameters to query information about instance types that have the specified number of vCPUs and memory size.
      *     * Set the `InstanceTypes.N` parameter to query information of the specified instance types.
      *     * Set the `Cores` and `Memory` parameters or the `MinCores` and `MinMemory` parameters, and set the `InstanceTypeFamily` or `InstanceFamilyLevel` parameter to query information of the instance types that have the specified number of vCPUs and memory size within the specified instance family or at the specified instance family level.
      *
     */
    @Override
    public CompletableFuture<DescribeSpotAdviceResponse> describeSpotAdvice(DescribeSpotAdviceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSpotAdvice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSpotAdviceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSpotAdviceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSpotPriceHistoryResponse> describeSpotPriceHistory(DescribeSpotPriceHistoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSpotPriceHistory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSpotPriceHistoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSpotPriceHistoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeStorageCapacityUnitsResponse> describeStorageCapacityUnits(DescribeStorageCapacityUnitsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStorageCapacityUnits").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStorageCapacityUnitsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStorageCapacityUnitsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeStorageSetDetailsResponse> describeStorageSetDetails(DescribeStorageSetDetailsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStorageSetDetails").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStorageSetDetailsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStorageSetDetailsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeStorageSetsResponse> describeStorageSets(DescribeStorageSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeStorageSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeStorageSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeStorageSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeTagsResponse> describeTags(DescribeTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeTaskAttributeResponse> describeTaskAttribute(DescribeTaskAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTaskAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTaskAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTaskAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeTasksResponse> describeTasks(DescribeTasksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTasks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTasksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTasksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeUserBusinessBehaviorResponse> describeUserBusinessBehavior(DescribeUserBusinessBehaviorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserBusinessBehavior").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserBusinessBehaviorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserBusinessBehaviorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   The returned user data is encoded in Base64.
      * *   If the instance does not have user data configured, an empty result is returned.
      *
     */
    @Override
    public CompletableFuture<DescribeUserDataResponse> describeUserData(DescribeUserDataRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserData").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserDataResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserDataResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeVRoutersResponse> describeVRouters(DescribeVRoutersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVRouters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVRoutersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVRoutersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeVSwitchesResponse> describeVSwitches(DescribeVSwitchesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVSwitches").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVSwitchesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVSwitchesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeVirtualBorderRoutersResponse> describeVirtualBorderRouters(DescribeVirtualBorderRoutersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVirtualBorderRouters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVirtualBorderRoutersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVirtualBorderRoutersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeVirtualBorderRoutersForPhysicalConnectionResponse> describeVirtualBorderRoutersForPhysicalConnection(DescribeVirtualBorderRoutersForPhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVirtualBorderRoutersForPhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVirtualBorderRoutersForPhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVirtualBorderRoutersForPhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeVpcsResponse> describeVpcs(DescribeVpcsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, only a list of zones and some resource information of each zone are returned. If you want to query instance types and disk categories that are available for purchase in a specific zone, we recommend that you call the [DescribeAvailableResource](~~66186~~) operation.
      *
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

    @Override
    public CompletableFuture<DetachClassicLinkVpcResponse> detachClassicLinkVpc(DetachClassicLinkVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachClassicLinkVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachClassicLinkVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachClassicLinkVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachDiskResponse> detachDisk(DetachDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachInstanceRamRoleResponse> detachInstanceRamRole(DetachInstanceRamRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachInstanceRamRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachInstanceRamRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachInstanceRamRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DetachKeyPairResponse> detachKeyPair(DetachKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachKeyPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachKeyPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * * The primary ENIs of ECS instances cannot be unbound.
      * * The ENI must be in the Detaching (Detaching) or InUse (InUse) state.
      * * The instance must be in the Running (Running) or Stopped (Stopped) state.
      *
     */
    @Override
    public CompletableFuture<DetachNetworkInterfaceResponse> detachNetworkInterface(DetachNetworkInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachNetworkInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachNetworkInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachNetworkInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableActivationResponse> disableActivation(DisableActivationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableActivation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableActivationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableActivationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<EipFillParamsResponse> eipFillParams(EipFillParamsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EipFillParams").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EipFillParamsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EipFillParamsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<EipFillProductResponse> eipFillProduct(EipFillProductRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EipFillProduct").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EipFillProductResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EipFillProductResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<EipNotifyPaidResponse> eipNotifyPaid(EipNotifyPaidRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EipNotifyPaid").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EipNotifyPaidResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EipNotifyPaidResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<EnablePhysicalConnectionResponse> enablePhysicalConnection(EnablePhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnablePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnablePhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnablePhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * Before you export a custom image:
      * *   You must understand the prerequisites and precautions. For more information, see [Export a custom image](~~58181~~).
      * *   You must use Resource Access Management (RAM) to create a RAM role for ECS and authorize ECS to write data to OSS.
      *     1\\. Create a role named `AliyunECSImageExportDefaultRole`. Configure the following trust policy for the role:
      *     ```
      *              {
      *                "Statement": [
      *                  {
      *                    "Action": "sts:AssumeRole",
      *                    "Effect": "Allow",
      *                    "Principal": {
      *                      "Service": [
      *                        "ecs.aliyuncs.com"
      *                      ]
      *                    }
      *                  }
      *                ],
      *                "Version": "1"
      *              }
      *             
      *     ```
      *     2\\. Attach the `AliyunECSImageExportRolePolicy` system policy to the `AliyunECSImageExportDefaultRole` role. This policy is the default policy used for ECS to export images. For more information, go to the [Cloud Resource Access Authorization](https://ram.console.aliyun.com/?spm=5176.2020520101.0.0.64c64df5dfpmdY#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunECSImageImportDefaultRole%22,%20%22TemplateId%22:%20%22ECSImportRole%22%7D,%20%22request2%22:%20%7B%22RoleName%22:%20%22AliyunECSImageExportDefaultRole%22,%20%22TemplateId%22:%20%22ECSExportRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fecs.console.aliyun.com%2F%22,%20%22Service%22:%20%22ECS%22%7D) page. Alternatively, you can create a custom policy that contains the following content and attach the policy to the role:
      *     ```
      *              {
      *                "Version": "1",
      *                "Statement": [
      *                  {
      *                    "Action": [
      *                      "oss:GetObject",
      *                      "oss:PutObject",
      *                      "oss:DeleteObject",
      *                      "oss:GetBucketLocation",
      *                      "oss:GetBucketInfo",
      *                      "oss:AbortMultipartUpload",
      *                      "oss:ListMultipartUploads",
      *                      "oss:ListParts"
      *                    ],
      *                    "Resource": "*",
      *                    "Effect": "Allow"
      *                  }
      *                ]
      *              }
      *             
      *     ```
      * After you export a custom image:
      * The image is stored in the specified OSS bucket. You can download the image. For more information, see [Download objects](~~31912~~).
      *
     */
    @Override
    public CompletableFuture<ExportImageResponse> exportImage(ExportImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ExportSnapshotResponse> exportSnapshot(ExportSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ExportSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ExportSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ExportSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   ECS is a virtualized cloud-based service and cannot be connected to display devices. However, Alibaba Cloud caches system command outputs for the last start, restart, or shutdown of ECS instances. You can call the GetInstanceConsoleOutput operation to obtain the command outputs.
      * *   The command outputs of instances that use the retired instance types cannot be obtained. For more information, see [Retired instance types](~~55263~~).
      * *   The command outputs of Windows instances cannot be obtained.
      *
     */
    @Override
    public CompletableFuture<GetInstanceConsoleOutputResponse> getInstanceConsoleOutput(GetInstanceConsoleOutputRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceConsoleOutput").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceConsoleOutputResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceConsoleOutputResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ECS returns an instance screenshot that is in the JPG format and encoded in Base64. You must manually decode the screenshot. We recommend that you call this operation for troubleshooting and diagnosis. When you call this operation, take note of the following items:
      * *   The instance must be in the Running state.
      * *   For instances of the retired instance types, you cannot obtain screenshots. For more information, see [Retired instance types](~~55263~~).
      * *   If you call this operation on the same instance for multiple times, the call interval must be at least 10 seconds. Otherwise, the `Throttling` error code is returned.
      *
     */
    @Override
    public CompletableFuture<GetInstanceScreenshotResponse> getInstanceScreenshot(GetInstanceScreenshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetInstanceScreenshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetInstanceScreenshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetInstanceScreenshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * Before you call this operation, take note of the following items:
      * *   Before you can import an image, you must upload the image to an Object Storage Service (OSS) bucket. For more information, see [Upload objects](~~31886~~).
      * *   In some scenarios, you may want to create a custom image based on operating system data of a source server, import the image to Alibaba Cloud ECS, and then create an ECS instance from the image. The source server can be a physical server, a virtual machine, or a cloud host. If the virtio driver is not installed on the source server, the created ECS instance may be unable to start. To prevent this issue, you must check that the virtio driver is installed on the source server before you import an image to Alibaba Cloud. For more information, see [Install the virtio driver](~~62423~~).
      * *   Before you import images for the first time, you must use Resource Access Management (RAM) to authorize ECS to access your OSS buckets. If ECS is not authorized to access your OSS buckets, the `NoSetRoletoECSServiceAcount` error code is returned when you call the ImportImage operation. You can complete this authorization in one click on the [Cloud Resource Access Authorization](https://ram.console.aliyun.com/?spm=5176.2020520101image.0.0.2ffa4df57kSoHX#/role/authorize?request=%7B%22Requests%22%3A%20%7B%22request1%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageImportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSImportRole%22%7D%2C%20%22request2%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageExportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSExportRole%22%7D%7D%2C%20%22ReturnUrl%22%3A%20%22https%3A//ecs.console.aliyun.com/%22%2C%20%22Service%22%3A%20%22ECS%22%7D) page of the RAM console. You can also complete the authorization by using a RAM role and RAM policies. The following examples show the policies and permissions required for some steps in the authorization procedure. For more information, see [Control access to resources by using RAM users](~~25481~~).
      *     1\\. Create a role named `AliyunECSImageImportDefaultRole`. You must use this exact role name. Otherwise, the image cannot be imported. Configure the following trust policy for the role:
      *     ```
      *             {
      *                 "Statement": [
      *                 {
      *                     "Action": "sts:AssumeRole",
      *                     "Effect": "Allow",
      *                     "Principal": {
      *                     "Service": [
      *                         "ecs.aliyuncs.com"
      *                     ]
      *                     }
      *                 }
      *             ],
      *                 "Version": "1"
      *             }
      *             
      *     ```
      *     2\\. Attach the `AliyunECSImageImportRolePolicy` system policy to the role. You can also create a custom policy that contains the following content and attach the policy to the role:
      *     ```
      *             {
      *                 "Version": "1",
      *                 "Statement": [
      *                 {
      *                     "Action": [
      *                             "oss:GetObject",
      *                             "oss:GetBucketLocation",
      *                             "oss:GetBucketInfo"
      *                 ],
      *                         "Resource": "*",
      *                         "Effect": "Allow"
      *                         }
      *                 ]
      *             }
      *             
      *             
      *     ```
      * *   You cannot delete an image that is being imported. However, you can call the [CancelTask](~~25624~~) operation to cancel the image import task.
      * *   You can import an image only to the same region as the OSS bucket to which the image was uploaded.
      * *   The valid values of N in the `DiskDeviceMapping.N` parameter range from 1 to 17. When N is set to 1, the disk is a system disk. When N is set to a value from 2 to 17, the disk is a data disk.
      * *   When you set the `Architecture` parameter to `arm64` or when you set the `Platform` parameter to `CentOS Stream`, `Anolis`, `AlmaLinux`, `UOS`, `Kylin`, or `Rocky Linux`, take note of the following items:
      *     *   To allow the password to be set or the key pair to be modified for an imported image, make sure that the image meets the following requirements before you import it:
      *         *   The operating system kernel supports the `CONFIG_FW_CFG_SYSFS` feature. By default, Linux community kernel 4.6 and later and CentOS kernel 3.10.0-826.el7 and later support this feature. You can run the `grep -nr CONFIG_FW_CFG_SYSFS /boot/config-$(uname -r)` command on the source server of the image. If the command output contains `CONFIG_FW_CFG_SYSFS=y`, the operating system kernel in this image supports the `CONFIG_FW_CFG_SYSFS` feature.
      *         *   Alibaba Cloud cloud-init of the latest version is installed on the operating system. The version of cloud-init 19.1 must be 19.1.3 or later. The version of cloud-init 0.7.6a in some early versions of operating systems must be 0.7.6a15 or later. For more information, see [Install cloud-init](~~57803~~).
      *         *   The operating system supports the SHA-512 encryption algorithm.
      *     *   If you want an imported image to support the resizing of disks and file systems, make sure that the image meets the following requirements before you import it:
      *         *   The kernel version of the operating system is later than 3.6.
      *         *   The image supports the growpart command. To support this command, you must install the `cloud-utils-growpart` package. The methods of installing the package vary based on the operating systems. For more information, see [Resize partitions and file systems of Linux system disks](~~111738~~).
      *         *   The image supports the resize2fs command. To support this command, you must install the`e2fsprogs` package. By default, the package is installed on the operating system. If the package is not installed, install it on your own.
      *         *   Alibaba Cloud cloud-init of the latest version is installed on the operating system. The version of cloud-init 19.1 must be 19.1.3 or later. The version of cloud-init 0.7.6a in some early versions of operating systems must be 0.7.6a15 or later. For more information, see [Install cloud-init](~~57803~~).
      * *   If the image that you want to import uses the ARM64 architecture, you must set the real-time clock (RTC) to use the Coordinated Universal Time (UTC) time standard. For more information, see [Linux time and time zones](https://icms.alibaba-inc.com/content/ecs/image?l=1\\&m=4656\\&n=3385033).
      *
     */
    @Override
    public CompletableFuture<ImportImageResponse> importImage(ImportImageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportImage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportImageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportImageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * * A maximum of 500 key pairs can be created in each region.
      * * The key pair that you wan to import must support one of the following encryption methods:
      *     * rsa
      *     * dsa
      *     * ssh-rsa
      *     * ssh-dss
      *     * ecdsa
      *     * ssh-rsa-cert-v00@openssh.com
      *     * ssh-dss-cert-v00@openssh.com
      *     * ssh-rsa-cert-v01@openssh.com
      *     * ssh-dss-cert-v01@openssh.com
      *     * ecdsa-sha2-nistp256-cert-v01@openssh.com
      *     * ecdsa-sha2-nistp384-cert-v01@openssh.com
      *     * ecdsa-sha2-nistp521-cert-v01@openssh.com
      *
     */
    @Override
    public CompletableFuture<ImportKeyPairResponse> importKeyPair(ImportKeyPairRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportKeyPair").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportKeyPairResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportKeyPairResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ImportSnapshotResponse> importSnapshot(ImportSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ImportSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ImportSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ImportSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<InstallCloudAssistantResponse> installCloudAssistant(InstallCloudAssistantRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InstallCloudAssistant").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InstallCloudAssistantResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InstallCloudAssistantResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The ECS instances on which to run the Cloud Assistant command must meet the following requirements. If you specify multiple ECS instances and one of the instances does not meet the requirements for running the command, the call fails. Specify instances that meet the requirements and call the InvokeCommand operation again.
      *     *   The network type is Virtual Private Cloud (VPC). For more information, see [What is a VPC?](~~34217~~)
      *     *   The instances are in the Running (`Running`) state.
      *     *   The Cloud Assistant client is installed on the instances. For more information, see [Install the Cloud Assistant client](~~64921~~).
      *     *   Before you run PowerShell commands, make sure that the instances have the PowerShell module configured.
      * *   If `Timed` is set to false, the command is run only once.
      * *   If `Timed` is set to true, the command is run on a schedule.
      *     *   The schedule is specified by the `Frequency` parameter. The results of each execution of a command do not affect the next execution of the command.
      *     *   If you want to specify a schedule by using a cron expression, you can set a time zone based on your requirements. If you do not set a time zone, the schedule is based on the system time of the instance. Make sure that the time or time zone of the instance meets your business requirements. For more information, see [Configure the NTP service and time zone for Linux instances](~~92803~~) or [Configure the NTP service for Windows instances](~~51890~~).
      *     To ensure that scheduled tasks can run as expected, make sure that the version of the Cloud Assistant client is not earlier than the following ones. A scheduled task can run a command at a specified interval, only once at a specified time, or at designated times based on a cron expression with a specified year or time zone. If the ClientNeedUpgrade error code is returned, you must upgrade the Cloud Assistant client to the latest version. For more information, see [Update or disable updates for the Cloud Assistant client](~~134383~~).
      *           - Linux: 2.2.3.282 
      *           - Windows: 2.1.3.282 
      * *   Command executions may fail due to instance status exceptions, network exceptions, or exceptions on the Cloud Assistant client. If an execution fails, no execution information is generated.
      * *   If you enable the custom parameter feature by setting EnableParameter to true when you create a command, you must specify custom parameters (`Parameters`) when you run the command.
      *
     */
    @Override
    public CompletableFuture<InvokeCommandResponse> invokeCommand(InvokeCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("InvokeCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(InvokeCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<InvokeCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * A resource is a cloud service entity that you create in Alibaba Cloud, such as an ECS instance, elastic network interface (ENI), or image. A resource group is a collection of infrastructure for projects, environments, or stacks. In a resource group, you can manage resources and monitor and run tasks in a centralized manner without switching between Alibaba Cloud services.
      *
     */
    @Override
    public CompletableFuture<JoinResourceGroupResponse> joinResourceGroup(JoinResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JoinResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JoinResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JoinResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * > This operation is not recommended. We recommend that you call the [ModifyInstanceAttribute](~~25503~~) operation to add instances to or remove instances from a security group, and call the [ModifyNetworkInterfaceAttribute](~~58513~~) operation to add ENIs to or remove ENIs from a security group.
      * When you call this operation, take note of the following items:
      * *   Before you add an instance to a security group, the instance must be in the **Stopped** (Stopped) or **Running** (Running) state.
      * *   An instance can be added to up to five security groups.
      * *   To add an instance to more security groups, [submit a ticket](https://selfservice.console.aliyun.com/ticket/createIndex.htm). An instance can be added to up to 16 security groups.
      * *
      * *   A basic security group can contain up to 2,000 instances. An advanced security group can contain up to 65,536 instances.
      * *   The security group and the instance must belong to the same region.
      * *   The security group and the instance must be of the same network type. If the network type is Virtual Private Cloud (VPC), the security group and the instance must be in the same VPC.
      * *   An instance and an ENI cannot be added to a security group at the same time. You cannot specify the `InstanceId` and `NetworkInterfaceId` parameters at the same time.
      *
     */
    @Override
    public CompletableFuture<JoinSecurityGroupResponse> joinSecurityGroup(JoinSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("JoinSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(JoinSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<JoinSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<LeaveSecurityGroupResponse> leaveSecurityGroup(LeaveSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LeaveSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LeaveSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LeaveSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation to query the states of Cloud Assistant plug-ins on ECS instances, make sure that the versions of the Cloud Assistant client installed on the instances are not earlier than the following ones:
      * - 2.2.3.344 for Linux instances
      * - 2.1.3.344 for Windows instances
      *
     */
    @Override
    public CompletableFuture<ListPluginStatusResponse> listPluginStatus(ListPluginStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPluginStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPluginStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPluginStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Specify at least one of the following parameters or parameter pairs in a request to determine a query object:
      * *   `ResourceId.N`
      * *   `Tag.N` parameter pair (`Tag.N.Key` and `Tag.N.Value`)
      * *   `TagFilter.N`
      * If one of the following sets of request parameters is specified as filter conditions, only ECS resources that meet all of the specified filter conditions are returned:
      * *   Set 1: `Tag.N.Key, Tag.N.Value`, and `ResourceId.N`
      * *   Set 2: `TagFilter.N.TagKey, TagFilter.N.TagValues.N`, and `ResourceId.N`
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
    public CompletableFuture<ModifyAutoProvisioningGroupResponse> modifyAutoProvisioningGroup(ModifyAutoProvisioningGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoProvisioningGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoProvisioningGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoProvisioningGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyAutoSnapshotPolicyResponse> modifyAutoSnapshotPolicy(ModifyAutoSnapshotPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoSnapshotPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoSnapshotPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoSnapshotPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyAutoSnapshotPolicyExResponse> modifyAutoSnapshotPolicyEx(ModifyAutoSnapshotPolicyExRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyAutoSnapshotPolicyEx").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyAutoSnapshotPolicyExResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyAutoSnapshotPolicyExResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyBandwidthPackageSpecResponse> modifyBandwidthPackageSpec(ModifyBandwidthPackageSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBandwidthPackageSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBandwidthPackageSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBandwidthPackageSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyCapacityReservationResponse> modifyCapacityReservation(ModifyCapacityReservationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCapacityReservation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCapacityReservationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCapacityReservationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyCommandResponse> modifyCommand(ModifyCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   All the Elastic Compute Service (ECS) instances that are hosted on a dedicated host must be in the Stopped (`Stopped`) state before you can modify the CPU overcommit ratio of the dedicated host.
      * *   Modifications to the CPU overcommit ratio of a dedicated host do not affect the operation of the dedicated host. After the CPU overcommit ratio is modified, the number of allocated vCPUs on the dedicated host cannot exceed the new total number of vCPUs. Otherwise, ECS instances that use the excess vCPUs cannot start.
      *
     */
    @Override
    public CompletableFuture<ModifyDedicatedHostAttributeResponse> modifyDedicatedHostAttribute(ModifyDedicatedHostAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedHostAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedHostAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When the specified automatic release time arrives, the pay-as-you-go dedicated host is automatically released. Make sure that the dedicated host is no longer needed and that its data is backed up as needed.
      *
     */
    @Override
    public CompletableFuture<ModifyDedicatedHostAutoReleaseTimeResponse> modifyDedicatedHostAutoReleaseTime(ModifyDedicatedHostAutoReleaseTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostAutoReleaseTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedHostAutoReleaseTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedHostAutoReleaseTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   If you enable auto-renewal for your subscription dedicated host, the dedicated host is automatically renewed nine days before expiration. The renewal fees are automatically paid at 08:00:00 (UTC+8). If the fees are not paid, they are paid at the same point in time the next day. Automatic payment stops after the fees are paid or after the dedicated host expires and is locked. Make sure that you have sufficient balance within your account.
      * *   Subscription dedicated hosts can be automatically renewed along with the subscription Elastic Compute Service (ECS) instances hosted on the dedicated hosts. For more information, see the description of the AutoRenewWithEcs parameter.
      *
     */
    @Override
    public CompletableFuture<ModifyDedicatedHostAutoRenewAttributeResponse> modifyDedicatedHostAutoRenewAttribute(ModifyDedicatedHostAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedHostAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedHostAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDedicatedHostClusterAttributeResponse> modifyDedicatedHostClusterAttribute(ModifyDedicatedHostClusterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostClusterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedHostClusterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedHostClusterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDedicatedHostsChargeTypeResponse> modifyDedicatedHostsChargeType(ModifyDedicatedHostsChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDedicatedHostsChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDedicatedHostsChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDedicatedHostsChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDemandResponse> modifyDemand(ModifyDemandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDemand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDemandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDemandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDeploymentSetAttributeResponse> modifyDeploymentSetAttribute(ModifyDeploymentSetAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDeploymentSetAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDeploymentSetAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDeploymentSetAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDiagnosticMetricSetResponse> modifyDiagnosticMetricSet(ModifyDiagnosticMetricSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiagnosticMetricSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiagnosticMetricSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiagnosticMetricSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   If you set DeleteWithInstance to false for a disk and the instance to which the disk is attached is locked for security reasons, the DeleteWithInstance parameter is ignored and the disk will be released along with the instance. If the value of `LockReason` is security in OperationLocks of the API response when you query information of an instance, the instance is locked for security reasons.
      * *   You can use the `DiskIds.N` parameter to modify the properties of multiple EBS devices at a time, including their names, descriptions, and whether they are released along with their associated instances.
      *
     */
    @Override
    public CompletableFuture<ModifyDiskAttributeResponse> modifyDiskAttribute(ModifyDiskAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * After you change the billing method, automatic payment is enabled by default. Make sure that you have sufficient balance in your account. Otherwise, your order becomes invalid and must be canceled. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the [ECS console](https://ecs.console.aliyun.com/) to pay for the order.
      * When you call this operation, take note of the following items:
      * *   You can change the billing method from subscription to pay-as-you-go for subscription disks that are attached to a subscription instance.
      * *   You can change the billing method from pay-as-you-go to subscription for pay-as-you-go data disks that are attached to a subscription or pay-as-you-go instance.
      * *   The instance cannot be in the Stopped state due to overdue payments.
      * *   You can change the billing method for each disk three times at most. A maximum of three refunds can be made for price differences for a single instance.
      * *   The price difference is refunded to the payment account you used. Coupons that have been redeemed are not refundable.
      * *   You cannot change the billing method of a disk again within five minutes after the billing method is changed.
      *
     */
    @Override
    public CompletableFuture<ModifyDiskChargeTypeResponse> modifyDiskChargeType(ModifyDiskChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyDiskSpecResponse> modifyDiskSpec(ModifyDiskSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyEipAddressAttributeResponse> modifyEipAddressAttribute(ModifyEipAddressAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyEipAddressAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyEipAddressAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyEipAddressAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyElasticityAssuranceResponse> modifyElasticityAssurance(ModifyElasticityAssuranceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyElasticityAssurance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyElasticityAssuranceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyElasticityAssuranceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyForwardEntryResponse> modifyForwardEntry(ModifyForwardEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyForwardEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyForwardEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyForwardEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyHaVipAttributeResponse> modifyHaVipAttribute(ModifyHaVipAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHaVipAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHaVipAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHaVipAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyHpcClusterAttributeResponse> modifyHpcClusterAttribute(ModifyHpcClusterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHpcClusterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHpcClusterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHpcClusterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyImageAttributeResponse> modifyImageAttribute(ModifyImageAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImageAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyImageAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyImageAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyImageShareGroupPermissionResponse> modifyImageShareGroupPermission(ModifyImageShareGroupPermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImageShareGroupPermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyImageShareGroupPermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyImageShareGroupPermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyImageSharePermissionResponse> modifyImageSharePermission(ModifyImageSharePermissionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyImageSharePermission").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyImageSharePermissionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyImageSharePermissionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyInstanceAttachmentAttributesResponse> modifyInstanceAttachmentAttributes(ModifyInstanceAttachmentAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAttachmentAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAttachmentAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAttachmentAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyInstanceAttributeResponse> modifyInstanceAttribute(ModifyInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyInstanceAutoReleaseTimeResponse> modifyInstanceAutoReleaseTime(ModifyInstanceAutoReleaseTimeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAutoReleaseTime").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAutoReleaseTimeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAutoReleaseTimeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, make sure that you understand the billing methods and pricing schedule of Elastic Compute Service (ECS). For more information, see the [Elastic Compute Service](https://www.aliyun.com/price/product#/ecs/detail) product page.
      * *   The payment for auto-renewal is first deducted automatically at 08:00:00 (UTC+8) nine days before the instance expires.
      * *   If the subscription period of a new instance is one week, the renewal payment is automatically deducted on the day the instance is created.
      * *   If the first deduction attempt fails, Alibaba Cloud attempts to deduct the payment each day until the payment is deducted or until the instance is locked after the nine-day period ends. Make sure that your account balance or credit balance is sufficient.
      *
     */
    @Override
    public CompletableFuture<ModifyInstanceAutoRenewAttributeResponse> modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyInstanceChargeTypeResponse> modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceChargeType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceChargeTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceChargeTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation for an ECS instance, take note of the following items:
      * *   The ECS instance must be in the **Stopped** state. The instance is automatically restarted after it is migrated.
      * *   The network type of the instance must be Virtual Private Cloud (VPC).
      * *   The instance and the destination dedicated host to which to migrate the instance must belong to the same account and reside in the same region and zone.
      * *   A pay-as-you-go instance can be migrated to a subscription dedicated host. A subscription instance can be migrated only between subscription dedicated hosts. The expiration date of the subscription instance cannot be later than that of the destination dedicated host.
      * *   You can migrate only pay-as-you-go instances from a shared host to a dedicated host. You cannot migrate subscription or preemptible instances from a shared host to a dedicated host.
      * *   You can redeploy an instance to a specific dedicated host cluster.
      *
     */
    @Override
    public CompletableFuture<ModifyInstanceDeploymentResponse> modifyInstanceDeployment(ModifyInstanceDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceDeployment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * This operation is used to modify the maintenance policy of an instance. The maintenance policy consists of the following maintenance attributes:
      * *   Maintenance window: the time period that you specify for maintenance.
      * *   Maintenance action: the action that you specify in response to instance shutdown.
      *
     */
    @Override
    public CompletableFuture<ModifyInstanceMaintenanceAttributesResponse> modifyInstanceMaintenanceAttributes(ModifyInstanceMaintenanceAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceMaintenanceAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceMaintenanceAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceMaintenanceAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyInstanceMetadataOptionsResponse> modifyInstanceMetadataOptions(ModifyInstanceMetadataOptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceMetadataOptions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceMetadataOptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceMetadataOptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyInstanceNetworkSpecResponse> modifyInstanceNetworkSpec(ModifyInstanceNetworkSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceNetworkSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceNetworkSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceNetworkSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * Before you call this operation, make sure that you understand the billing methods and pricing schedule of ECS. For more information, visit the [Elastic Compute Service](https://www.aliyun.com/price/product#/ecs/detail) product page.
      * For information about ECS SDK for Python used to change resource configurations, see [Query available resources for configuration changes](~~109517~~).
      * When you call this operation, take note of the following items:
      * *   You must have no overdue payments in your account.
      * *   You can adjust the public bandwidth of an instance only when the instance is in the **Running** (`Running`) or **Stopped** (`Stopped`) state.
      * *   Before you change the instance type of a pay-as-you-go instance, you can call the [DescribeResourcesModification](~~66187~~) operation to query the instance types to which you can change.
      * *   You can change the instance type of an instance only when the instance is in the **Stopped** (`Stopped`) state.
      * *   The instance type and the public bandwidth of an instance cannot be changed together.
      * *   As of November 27, 2020, the maximum bandwidth value available for you to create ECS instances or to change ECS instance configurations is subject to throttling policies for your account. To increase the maximum bandwidth value, submit a ticket. The following throttling policies apply:
      *     *   Within a single region, the sum of actual maximum bandwidths of all ECS instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s.
      *     *   Within a single region, the sum of actual maximum bandwidths of all ECS instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.
      *
     */
    @Override
    public CompletableFuture<ModifyInstanceSpecResponse> modifyInstanceSpec(ModifyInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The password must be six characters in length and can contain only uppercase letters, lowercase letters, and digits.
      * *   After you modify the VNC password of an instance, take note of the following items:
      *     *   If the instance is I/O optimized, the new password takes effect immediately.
      *     *   If the instance is non-I/O optimized, you must [restart the instance](~~25440~~) by using the ECS console or by calling the [RebootInstance](~~25502~~) operation for the new password to take effect.
      *
     */
    @Override
    public CompletableFuture<ModifyInstanceVncPasswdResponse> modifyInstanceVncPasswd(ModifyInstanceVncPasswdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceVncPasswd").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceVncPasswdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceVncPasswdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyInstanceVpcAttributeResponse> modifyInstanceVpcAttribute(ModifyInstanceVpcAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceVpcAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceVpcAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceVpcAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyLaunchTemplateDefaultVersionResponse> modifyLaunchTemplateDefaultVersion(ModifyLaunchTemplateDefaultVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyLaunchTemplateDefaultVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyLaunchTemplateDefaultVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyLaunchTemplateDefaultVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * The ModifyManagedInstance operation can be called to modify only the name of a single managed instance.
      *
     */
    @Override
    public CompletableFuture<ModifyManagedInstanceResponse> modifyManagedInstance(ModifyManagedInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyManagedInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyManagedInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyManagedInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyNetworkInterfaceAttributeResponse> modifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNetworkInterfaceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNetworkInterfaceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNetworkInterfaceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyPhysicalConnectionAttributeResponse> modifyPhysicalConnectionAttribute(ModifyPhysicalConnectionAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPhysicalConnectionAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPhysicalConnectionAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPhysicalConnectionAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyPrefixListResponse> modifyPrefixList(ModifyPrefixListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPrefixListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPrefixListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * Before you call this operation, make sure that you understand the billing methods, pricing schedule, and refund rules of [Elastic Compute Service](https://www.alibabacloud.com/product/ecs#pricing). For more information, see [Refund rules for real-time configuration downgrade](~~201955~~).
      * Before you change the instance type of a subscription instance, you can call the [DescribeResourcesModification](~~66187~~) operation to query the instance types to which you can change. You can use ECS SDK for Python to query the instance types to which you can change. For more information, see [Query available resources for configuration changes](~~109517~~).
      * When you call this operation, take note of the following items:
      * *   The instance type of an expired instance cannot be changed. You can renew the instance and try again.
      * *   When you downgrade the instance type of an instance, take note of the following items:
      *     *   The instance must be in the **Stopped** (`Stopped`) state.
      *     *   You must specify the operation type by setting `OperatorType` to downgrade.
      *     *   You can downgrade the configurations of an instance a maximum of three times. Therefore, a maximum of three refunds for price difference can be made for an instance. Downgrade operations include instance type downgrades, bandwidth configuration downgrades, and the change of the disk billing method from subscription to pay-as-you-go.
      *     *   The price difference is refunded to the payment account you used. Vouchers that have been redeemed are not refundable.
      * *   This operation is asynchronous. It takes 5 to 10 seconds for the instance type of an instance to change. Then, you must restart the instance by calling the RebootInstance operation or by using the ECS console for the instance type change to take effect. If you restart only the operating system of the instance, the instance type change does not take effect.
      *     *   If the instance is in the **Stopped** state, you only need to start the instance. You do not need to restart the instance after it enters the Running state.
      *     *   If `RebootWhenFinished` is set to true for the instance, you do not need to manually restart the instance.
      *
     */
    @Override
    public CompletableFuture<ModifyPrepayInstanceSpecResponse> modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPrepayInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPrepayInstanceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPrepayInstanceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyReservedInstanceAttributeResponse> modifyReservedInstanceAttribute(ModifyReservedInstanceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyReservedInstanceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyReservedInstanceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyReservedInstanceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyReservedInstanceAutoRenewAttributeResponse> modifyReservedInstanceAutoRenewAttribute(ModifyReservedInstanceAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyReservedInstanceAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyReservedInstanceAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyReservedInstanceAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyReservedInstancesResponse> modifyReservedInstances(ModifyReservedInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyReservedInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyReservedInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyReservedInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyRouterInterfaceAttributeResponse> modifyRouterInterfaceAttribute(ModifyRouterInterfaceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRouterInterfaceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRouterInterfaceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRouterInterfaceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyRouterInterfaceSpecResponse> modifyRouterInterfaceSpec(ModifyRouterInterfaceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRouterInterfaceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRouterInterfaceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRouterInterfaceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifySecurityGroupAttributeResponse> modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * You can determine an outbound rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
      * *   Parameters used to specify an outbound security group rule that controls access to a specific CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceCidrIp (optional), and DestCidrIp.
      *     ```
      *         https://ecs.aliyuncs.com/?Action=ModifySecurityGroupEgressRule
      *         &SecurityGroupId=sg-bp67acfmxazb4p****
      *         &DestCidrIp=10.0.0.0/8
      *         &IpProtocol=tcp
      *         &PortRange=80/80
      *         &Policy=allow
      *         &Description=This is a new security group rule.
      *         &<Common request parameters>
      *         
      *     ```
      * *   Parameters used to specify an outbound security group rule that controls access to other security groups: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceCidrIp (optional), and DestGroupId.
      *     ```
      *         https://ecs.aliyuncs.com/?Action=ModifySecurityGroupEgressRule
      *         &SecurityGroupId=sg-bp67acfmxazb4p****
      *         &DestGroupId=sg-bp67acfmxa123b****
      *         &IpProtocol=tcp
      *         &PortRange=80/80
      *         &Policy=allow
      *         &Description=This is a new security group rule.
      *         &<Common request parameters>
      *         
      *     ```
      * *   Parameters used to specify an outbound security group rule in which a prefix list is referenced: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, SourceCidrIp (optional), and DestPrefixListId.
      *     ```
      *         https://ecs.aliyuncs.com/?Action=ModifySecurityGroupEgressRule
      *         &SecurityGroupId=sg-bp67acfmxazb4p****
      *         &DestPrefixListId=pl-x1j1k5ykzqlixdcy****
      *         &IpProtocol=tcp
      *         &PortRange=80/80
      *         &Policy=allow
      *         &Description=This is a new security group rule.
      *         &<Common request parameters>
      *         
      *     ```
      *
     */
    @Override
    public CompletableFuture<ModifySecurityGroupEgressRuleResponse> modifySecurityGroupEgressRule(ModifySecurityGroupEgressRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupEgressRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityGroupEgressRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityGroupEgressRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifySecurityGroupPolicyResponse> modifySecurityGroupPolicy(ModifySecurityGroupPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityGroupPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityGroupPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * In the security group-related API documents, inbound traffic refers to the traffic that is sent by the source device and received at the destination device.
      * You can determine an inbound security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
      * *   Parameters used to specify an inbound security group rule that controls access to a specific CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourceCidrIp.
      *     ```
      *         https://ecs.aliyuncs.com/?Action=ModifySecurityGroupRule
      *         &SecurityGroupId=sg-bp67acfmxazb4p****
      *         &SourceCidrIp=10.0.0.0/8
      *         &IpProtocol=tcp
      *         &PortRange=80/80
      *         &Policy=accept
      *         &Description=This is a new security group rule.
      *         &<Common request parameters>
      *         
      *     ```
      * *   Parameters used to specify an inbound security group rule that controls access to other security groups: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourceGroupId.
      *     ```
      *         https://ecs.aliyuncs.com/?Action=ModifySecurityGroupRule
      *         &SecurityGroupId=sg-bp67acfmxazb4p****
      *         &SourceGroupId=sg-bp67acfmxa123b****
      *         &IpProtocol=tcp
      *         &PortRange=80/80
      *         &Policy=accept
      *         &Description=This is a new security group rule.
      *         &<Common request parameters>
      *         
      *     ```
      * *   Parameters used to specify an inbound security group rule in which a prefix list is referenced: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourcePrefixListId.
      *     ```
      *         https://ecs.aliyuncs.com/?Action=ModifySecurityGroupRule
      *         &SecurityGroupId=sg-bp67acfmxazb4p****
      *         &SourcePrefixListId=pl-x1j1k5ykzqlixdcy****
      *         &IpProtocol=tcp
      *         &PortRange=80/80
      *         &Policy=accept
      *         &Description=This is a new security group rule.
      *         &<Common request parameters>
      *         
      *     ```
      *
     */
    @Override
    public CompletableFuture<ModifySecurityGroupRuleResponse> modifySecurityGroupRule(ModifySecurityGroupRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySecurityGroupRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySecurityGroupRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySecurityGroupRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifySnapshotAttributeResponse> modifySnapshotAttribute(ModifySnapshotAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySnapshotAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySnapshotAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySnapshotAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifySnapshotGroupResponse> modifySnapshotGroup(ModifySnapshotGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySnapshotGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySnapshotGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySnapshotGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyStorageCapacityUnitAttributeResponse> modifyStorageCapacityUnitAttribute(ModifyStorageCapacityUnitAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyStorageCapacityUnitAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyStorageCapacityUnitAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyStorageCapacityUnitAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyStorageSetAttributeResponse> modifyStorageSetAttribute(ModifyStorageSetAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyStorageSetAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyStorageSetAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyStorageSetAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyUserBusinessBehaviorResponse> modifyUserBusinessBehavior(ModifyUserBusinessBehaviorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyUserBusinessBehavior").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyUserBusinessBehaviorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyUserBusinessBehaviorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyVRouterAttributeResponse> modifyVRouterAttribute(ModifyVRouterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVRouterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVRouterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVRouterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyVSwitchAttributeResponse> modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVSwitchAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVSwitchAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVSwitchAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyVirtualBorderRouterAttributeResponse> modifyVirtualBorderRouterAttribute(ModifyVirtualBorderRouterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVirtualBorderRouterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVirtualBorderRouterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVirtualBorderRouterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyVpcAttributeResponse> modifyVpcAttribute(ModifyVpcAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PurchaseReservedInstancesOfferingResponse> purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PurchaseReservedInstancesOffering").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PurchaseReservedInstancesOfferingResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PurchaseReservedInstancesOfferingResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PurchaseStorageCapacityUnitResponse> purchaseStorageCapacityUnit(PurchaseStorageCapacityUnitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PurchaseStorageCapacityUnit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PurchaseStorageCapacityUnitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PurchaseStorageCapacityUnitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * When you call this operation, take note of the following items:
      * *   The instance must be in the **Expired** (`Stopped`) state.
      * *   You must pay the bills and reactivate the instance within 15 days after the instance is stopped due to overdue payments. If you fail to reactivate the instance within the preceding period, the instance is released and data on the instance cannot be recovered. If you cannot reactivate a VPC-type instance, try again later or [submit a ticket](https://workorder-intl.console.aliyun.com/#/ticket/createIndex).
      * *   After the operation is called, the instance enters the **Starting** (`Starting`) state.
      * *   You cannot call this operation on ECS instances that are locked for security reasons. An instance is locked for security reasons if `OperationLocks` in the response returned when you query information of the instance contains `"LockReason": "security"`. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      *
     */
    @Override
    public CompletableFuture<ReActivateInstancesResponse> reActivateInstances(ReActivateInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReActivateInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReActivateInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReActivateInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReInitDiskResponse> reInitDisk(ReInitDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReInitDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReInitDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReInitDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Only instances that are in the `Running` state can be restarted.****
      * *   After the ECS instance is restarted, the status of the instance changes to `Starting`.****
      * *   An instance can be forcibly restarted. A forced restart (`ForceStop`) is equivalent to performing a hard restart. This operation can cause data loss if data in the instance is not written to the disk.
      * *   If you call the DescribeInstances operation to query the details of an instance and `OperationLocks` in the response contains "LockReason": "security", the instance is locked for security reasons and cannot be restarted. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      *
     */
    @Override
    public CompletableFuture<RebootInstanceResponse> rebootInstance(RebootInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebootInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebootInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RebootInstancesResponse> rebootInstances(RebootInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebootInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebootInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<RecoverVirtualBorderRouterResponse> recoverVirtualBorderRouter(RecoverVirtualBorderRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecoverVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecoverVirtualBorderRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecoverVirtualBorderRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RedeployDedicatedHostResponse> redeployDedicatedHost(RedeployDedicatedHostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RedeployDedicatedHost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RedeployDedicatedHostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RedeployDedicatedHostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * RedeployInstance is an asynchronous operation. It migrates data before it restarts the instance. After the instance is redeployed, the instance enters the Running (`Running`) state. If the instance fails to be redeployed, the instance returns to its original physical server and original state.
      * When you call this operation, take note of the following items:
      * * The instance must be in the Running or Stopped state. After the instance is redeployed, the state of the instance has the following changes:
      *   * If the instance is in the Running (`Running`) state, the instance enters the Stopping (`Stopping`) state.
      *   * If the instance is in the Stopped (`Stopped`) state, the instance enters the Starting (`Starting`) state.
      * * If an instance is deployed on a dedicated host, the instance cannot be redeployed.
      * * If `OperationLocks` in the DescribeInstances response contains `"LockReason" : "security"` for an instance, the instance is locked for security reasons and cannot be redeployed.
      * * If an instance receives simulated events that are created by calling the CreateSimulatedSystemEvent operation, the instance cannot be redeployed.
      * * When you handle a local disk-related system event for an instance, if the damaged local disk is isolated but the SystemMaintenance.RebootAndReInitErrorDisk (**instance restart and re-initialization of damaged disks due to system maintenance**) event is not sent, you can still call the RedeployInstance operation to redeploy the instance. For more information, see [Overview of system events on ECS instances equipped with local disks](~~107693~~).
      * The following table lists the types and states of events that you can handle by calling the RedeployInstance operation.
      * |System event|Event state|
      * |---|---|
      * |Instance restart due to system maintenance: SystemMaintenance.Reboot|Inquiring and Scheduled|
      * |Instance redeployment due to system maintenance: SystemMaintenance.Redeploy|Inquiring and Scheduled|
      * |Instance restart and replacement of damaged disks due to system maintenance (SystemMaintenance.RebootAndIsolateErrorDisk)|Inquiring|
      * |Instance restart and re-initialization of damaged disks due to system maintenance (SystemMaintenance.RebootAndReInitErrorDisk)|Inquiring|
      * |Instance redeployment due to system errors: SystemFailure.Redeploy|Inquiring and Scheduled|
      * |For instances equipped with local disks only: instance restart due to a system error (SystemFailure.Reboot)|Executing|
      * |Isolation of damaged disks due to system maintenance (SystemMaintenance.IsolateErrorDisk)|Inquiring|
      * |Re-initialization of damaged disks due to system maintenance (SystemMaintenance.ReInitErrorDisk)|Inquiring|
      * **Note**When instances that use local disks are redeployed, the local disks are re-initialized and data in the local disks is cleared.
      *
     */
    @Override
    public CompletableFuture<RedeployInstanceResponse> redeployInstance(RedeployInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RedeployInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RedeployInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RedeployInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * When the release mode of a capacity reservation that takes effect immediately is set to manual release, you can call this operation to release the capacity reservation.
      *
     */
    @Override
    public CompletableFuture<ReleaseCapacityReservationResponse> releaseCapacityReservation(ReleaseCapacityReservationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseCapacityReservation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseCapacityReservationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseCapacityReservationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you release a pay-as-you-go dedicated host, make sure that no Elastic Compute Service (ECS) instances are deployed on the dedicated host.
      *
     */
    @Override
    public CompletableFuture<ReleaseDedicatedHostResponse> releaseDedicatedHost(ReleaseDedicatedHostRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseDedicatedHost").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseDedicatedHostResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseDedicatedHostResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ReleaseEipAddressResponse> releaseEipAddress(ReleaseEipAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseEipAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseEipAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReleasePublicIpAddressResponse> releasePublicIpAddress(ReleasePublicIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleasePublicIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleasePublicIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleasePublicIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<RemoveBandwidthPackageIpsResponse> removeBandwidthPackageIps(RemoveBandwidthPackageIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveBandwidthPackageIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveBandwidthPackageIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveBandwidthPackageIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RemoveTagsResponse> removeTags(RemoveTagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveTags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveTagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveTagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RenewDedicatedHostsResponse> renewDedicatedHosts(RenewDedicatedHostsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewDedicatedHosts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewDedicatedHostsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewDedicatedHostsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RenewInstanceResponse> renewInstance(RenewInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RenewReservedInstancesResponse> renewReservedInstances(RenewReservedInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewReservedInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewReservedInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewReservedInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReplaceSystemDiskResponse> replaceSystemDisk(ReplaceSystemDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReplaceSystemDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplaceSystemDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplaceSystemDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ReportInstancesStatusResponse> reportInstancesStatus(ReportInstancesStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReportInstancesStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReportInstancesStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReportInstancesStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * When you call this operation, take note of the following items:
      * *   The disk must be in the In Use (In_Use) or Unattached (Available) state.
      * *   The Elastic Compute Service (ECS) instance to which the disk is attached must be in the Stopped (Stopped) state. You can call the [StopInstances](~~155372~~) operation to stop an instance.
      * *   The snapshot specified by the SnapshotId parameter must be created from the disk specified by the DiskId parameter.
      * *   When you call the [DescribeInstances](~~25506~~) operation to query instance information, if the response contains `{"OperationLocks": {"LockReason" : "security"}}` for an instance, the instance is locked for security reasons and no operations can be performed on the instance.
      *
     */
    @Override
    public CompletableFuture<ResetDiskResponse> resetDisk(ResetDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ResetDisksResponse> resetDisks(ResetDisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetDisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetDisksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetDisksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ResizeDiskResponse> resizeDisk(ResizeDiskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResizeDisk").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResizeDiskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResizeDiskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * In the security group-related API documents, inbound traffic refers to the traffic sent by the source and received by the destination.
      * When you call this operation, take note of the following items:
      * *   The `Permissions.N` prefix is added to some parameters to generate new parameters. Original parameters and corresponding parameters prefixed with Permissions.N cannot be specified together. We recommend that you use parameters prefixed with `Permissions.N`.
      * *   If the specified security group rule does not exist, the call to RevokeSecurityGroup is successful but no security group rule is deleted.
      * *   You can determine an inbound rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.
      *     *   Parameters used to delete an inbound security group rule that controls access from a specified CIDR block: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourceCidrIp.
      *         ```
      *             http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
      *             &SecurityGroupId=sg-bp67acfmxazb4p****
      *             &Permissions.1.SourceCidrIp=10.0.0.0/8
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=80/80
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=accept
      *             &<Common request parameters>
      *             
      *         ```
      *     *   Parameters used to delete an inbound security group rule that controls access from a security group: IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourceGroupId.
      *         ```
      *             http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
      *             &SecurityGroupId=sg-bp67acfmxazb4p****
      *             &Permissions.1.SourceGroupId=sg-bp67acfmxa123b****
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=80/80
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=accept
      *             &<Common request parameters>
      *             
      *         ```
      *     *   Parameters used to delete an inbound security group rule that controls access from a prefix list. IpProtocol, PortRange, SourcePortRange (optional), NicType, Policy, DestCidrIp (optional), and SourcePrefixListId.
      *         ```
      *             http(s)://ecs.aliyuncs.com/?Action=RevokeSecurityGroup
      *             &SecurityGroupId=sg-bp67acfmxazb4p****
      *             &Permissions.1.SourcePrefixListId=pl-x1j1k5ykzqlixdcy****
      *             &Permissions.1.IpProtocol=TCP
      *             &Permissions.1.PortRange=80/80
      *             &Permissions.1.NicType=intranet
      *             &Permissions.1.Policy=accept
      *             &<Common request parameters>
      *             
      *         ```
      *
     */
    @Override
    public CompletableFuture<RevokeSecurityGroupResponse> revokeSecurityGroup(RevokeSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RevokeSecurityGroupEgressResponse> revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeSecurityGroupEgress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeSecurityGroupEgressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeSecurityGroupEgressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RunCommandResponse> runCommand(RunCommandRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunCommand").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunCommandResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunCommandResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * **Preparations**:
      *     * The real-name verification is complete. For more information, see [Real-name verification](~~48263~~).
      *     * Cost estimation: Learn about the billing methods of ECS resources. For more information, see [Billing overview](~~25398~~).
      *     * Instance type selection: Call the [DescribeInstanceTypes](~~25620~~) operation to query the performance data of instance types, or see [Best practices for instance type selection](~~58291~~) to learn about how to select instance types.
      *     * Query for available resources: Call the [DescribeAvailableResource](~~66186~~) operation to query available resources in a specific region or zone.
      *     * Network planning: Make sure that you have security groups available for use. For more information, see [CreateSecurityGroup](~~25553~~). Before you create an instance of the Virtual Private Cloud (VPC) type, create a VPC in the region where you want to create the instance. For more information, see [Create a VPC](~~65430~~).
      * * **Precautions**:
      *     * You can create a maximum of 100 instances at a time.
      *     * You can use the `AutoReleaseTime` parameter to set the time when you want the instances to be automatically released.
      *     * After instances are created, you can call the [DescribeInstances](~~25506~~) operation to check their states.
      *     * By default, instances automatically start after they are created. Instances are ready for use when they are in the Running (`Running`) state.
      *     * As of November 27, 2020, the maximum bandwidth value available for you to create ECS instances or to change ECS instance configurations is subject to the throttling policy for your account. To increase the maximum bandwidth value, submit a ticket. The throttling policy imposes the following constraints: Within a single region, the total maximum bandwidth value of all instances that use the pay-by-traffic billing method for network usage cannot exceed 5 Gbit/s and that of all instances that use the pay-by-bandwidth billing method for network usage cannot exceed 50 Gbit/s.
      *     * Different from the [CreateInstance](~~25499~~) operation, the `RunInstances` operation allows the system to assign public IP addresses to the new instances if you set the `InternetMaxBandwidthOut` parameter to a value greater than 0.
      *     * When you call the RunInstances operation to create an instance, you can use one of the following methods to bind a primary elastic network interface (ENI) to the instance. Note that you can use only one of the methods to configure the primary ENI in each call. Otherwise, the call fails and an error message is returned. Specify parameters such as `SecurityGroupId`, `VSwitchId`, `PrivateIpAddress`, `NetworkInterfaceQueueNumber`, and `Ipv6AddressCount` to configure the primary ENI. Specify parameters that start with `NetworkInterface.N.` to configure the primary and secondary ENIs. If `NetworkInterface.N.InstanceType` is set to `Primary`, the primary ENI is bound to the instance. If `NetworkInterface.N.InstanceType` is set to `Secondary` or left empty, a secondary ENI is bound to the instance.
      *     * After you call this operation, an error is returned if a parameter is invalid or if available resources are insufficient. For more information, see the "Error codes" section of this topic.
      * > If the `QuotaExceed.ElasticQuota` error is returned when you call this operation, you have reached the maximum number of instances of the specified instance type that can be created within the specified region or the maximum number of vCPUs for all instance types in a zone. You can go to the [ECS console](https://ecs.console.aliyun.com/?spm=a2c8b.12215451.favorites.decs.5e3a336aMGTtzy#/privileges/quota) or [Quota Center](https://quotas.console.aliyun.com/products/ecs/quotas) to request a quota increase.
      * * **Best practices**:
      *     * We recommend that you use auto provisioning groups in the following scenarios: Resources are insufficient to create more than 100 instances at a time, you want to quickly create instances regardless of resource configurations such as instance types or zones, or you want to create instances to consume a specific total number of vCPUs regardless of the number of the instances. You can call the [CreateAutoProvisioningGroup](~~122738~~) operation to create an auto provisioning group to deploy an instance cluster across different billing methods, instance families, and zones. For more information, see [Use auto provisioning group-related API operations to create multiple ECS instances at the same time](~~200772~~).
      *     * You can call the `RunInstances` operation to batch create instances. To better manage and search for these instances, we recommend that you specify tags for the instances by using the `Tag.N.Key` and `Tag.N.Value` parameters. You can also append incremental suffixes (`UniqueSuffix`) to the hostname (`HostName`) and to the instance name (`InstanceName`).
      *     * A launch template contains parameters required to create an instance so that you do not have to specify these parameters every time you create instances. You can call the [CreateLaunchTemplate](~~74686~~) operation to create a launch template. Then, in your request to call the `RunInstances` operation, you can specify the `LaunchTemplateId` and `LaunchTemplateVersion` parameters to use the launch template.
      *     * When you create an instance in the [ECS console](https://ecs.console.aliyun.com/), you can view the best practices for calling the `RunInstances` operation. In the Preview step, click View Open API in the Configurations Selected section. In the dialog box that appears, the left-side **API Workflow** section shows the operations and request parameters that are related to the `RunInstances` operation. The right-side section shows SDK examples for the **Java** and **Python** programming languages.
      *
     */
    @Override
    public CompletableFuture<RunInstancesResponse> runInstances(RunInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RunInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RunInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RunInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SendFileResponse> sendFile(SendFileRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendFile").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendFileResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendFileResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<StartElasticityAssuranceResponse> startElasticityAssurance(StartElasticityAssuranceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartElasticityAssurance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartElasticityAssuranceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartElasticityAssuranceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * * After an image template is created, you must call the StartImagePipelineExecution operation to execute an image creation task. The system creates, distributes, and shares an image based on the parameters configured in the image template.
      * * Only one image creation task can be executed at a time based on a single image template. You can call the CancelImagePipelineExecution operation multiple times to cancel multiple image creation tasks at a time. If you cancel some image creation tasks, the other tasks are not affected.
      *
     */
    @Override
    public CompletableFuture<StartImagePipelineExecutionResponse> startImagePipelineExecution(StartImagePipelineExecutionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartImagePipelineExecution").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartImagePipelineExecutionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartImagePipelineExecutionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StartInstanceResponse> startInstance(StartInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StartInstancesResponse> startInstances(StartInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StartTerminalSessionResponse> startTerminalSession(StartTerminalSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartTerminalSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartTerminalSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartTerminalSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Description
      * *   If you call the DescribeInstances operation to query the details of an instance and `OperationLocks` in the response contains "LockReason": "security", the instance is locked for security reasons and cannot be stopped. For more information, see [API behavior when an instance is locked for security reasons](~~25695~~).
      * *   If economical mode is enabled, you can set `StoppedMode` to KeepCharging to enable standard mode. Then, after your instance is stopped in standard mode, you continue to be charged for it, and its instance type resources and public IP address are retained.
      *
     */
    @Override
    public CompletableFuture<StopInstanceResponse> stopInstance(StopInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StopInstancesResponse> stopInstances(StopInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StopInvocationResponse> stopInvocation(StopInvocationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopInvocation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopInvocationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopInvocationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<TerminatePhysicalConnectionResponse> terminatePhysicalConnection(TerminatePhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TerminatePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminatePhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminatePhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<TerminateVirtualBorderRouterResponse> terminateVirtualBorderRouter(TerminateVirtualBorderRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TerminateVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TerminateVirtualBorderRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TerminateVirtualBorderRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UnassignIpv6AddressesResponse> unassignIpv6Addresses(UnassignIpv6AddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassignIpv6Addresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassignIpv6AddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassignIpv6AddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UnassignPrivateIpAddressesResponse> unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassignPrivateIpAddresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassignPrivateIpAddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassignPrivateIpAddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<UnassociateEipAddressResponse> unassociateEipAddress(UnassociateEipAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateEipAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassociateEipAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassociateEipAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<UnassociateHaVipResponse> unassociateHaVip(UnassociateHaVipRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateHaVip").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassociateHaVipResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassociateHaVipResponse> future = new CompletableFuture<>();
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

}
