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

    /**
     * @param request the request parameters of AcceptInquiredSystemEvent  AcceptInquiredSystemEventRequest
     * @return AcceptInquiredSystemEventResponse
     */
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
     * @deprecated OpenAPI ActivateRouterInterface is deprecated, please use Vpc::2016-04-28::ActivateRouterInterface instead.  * @param request  the request parameters of ActivateRouterInterface  ActivateRouterInterfaceRequest
     * @return ActivateRouterInterfaceResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI AddBandwidthPackageIps is deprecated  * @param request  the request parameters of AddBandwidthPackageIps  AddBandwidthPackageIpsRequest
     * @return AddBandwidthPackageIpsResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI AddTags is deprecated, please use Ecs::2014-05-26::TagResources instead.  * @description When you invoke this operation, take note of the following items:
     * -   You can add up to 20 tags to each Elastic Compute Service (ECS) resource.
     * -   The tag key (Tag.N.Key) and tag value (Tag.N.Value) must be specified as key-value pairs.
     * -   If the tag key (Tag.N.Key) already exists on the specified resource, the new tag value (Tag.N.Value) automatically overwrites the original tag value.
     * 
     * @param request the request parameters of AddTags  AddTagsRequest
     * @return AddTagsResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p>Before you create a dedicated host, invoke <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> to query the available resources in a specific region or zone.
     * Creating a dedicated host incurs fees. Familiarize yourself with the billing method of the resources in advance. For more details, see <a href="https://help.aliyun.com/document_detail/68978.html">Billing overview</a>.</p>
     * <ul>
     * <li>You can create up to 100 subscription or pay-as-you-go dedicated hosts at a time.</li>
     * <li>After the dedicated hosts are created, you can use the returned dedicated host IDs as request parameters and invoke <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the status of the new dedicated hosts.</li>
     * <li>After you commit a request to create dedicated hosts, a fault is returned if the specified parameter values are invalid or the resources are insufficient. For more information about fault causes, see the error codes section.</li>
     * <li>After you create a dedicated host, you can invoke <a href="https://help.aliyun.com/document_detail/134248.html">ModifyInstanceDeployment</a> to perform migration of ECS instances from a shared host to the dedicated host, or adjust instance deployment between two dedicated hosts.</li>
     * </ul>
     * 
     * @param request the request parameters of AllocateDedicatedHosts  AllocateDedicatedHostsRequest
     * @return AllocateDedicatedHostsResponse
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
     * @deprecated OpenAPI AllocateEipAddress is deprecated, please use Vpc::2016-04-28::AllocateEipAddress instead.  * @description > This operation has been upgraded. We recommend that you no longer use this operation. For more information about the new operation, see [AllocateEipAddress](https://help.aliyun.com/document_detail/120192.html).
     * 
     * @param request the request parameters of AllocateEipAddress  AllocateEipAddressRequest
     * @return AllocateEipAddressResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Before you assign a public IP address, the instance must be in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state.  </li>
     * <li>If <code>&quot;LockReason&quot; : &quot;security&quot;</code> is included in the <code>OperationLocks</code> of an instance that is under <a href="https://help.aliyun.com/document_detail/25695.html">security control</a>, you cannot assign a public IP address to the instance. </li>
     * <li>Make sure that the public bandwidth of the instance is greater than 0 before you call this operation. You can call the <a href="https://help.aliyun.com/document_detail/2679879.html">ModifyInstanceNetworkSpec</a> operation to adjust the bandwidth.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>Only users in the whitelist can specify the public IP address by using the <code>IpAddress</code> parameter. If the public bandwidth is greater than 0, you can set <code>InstanceId</code> to allocate a random public IP address. If the public bandwidth is 0, invoke <a href="https://help.aliyun.com/document_detail/2679879.html">ModifyInstanceNetworkSpec</a> to adjust the bandwidth before you invoke this operation to allocate a public IP address.</li>
     * <li>Only one public IP address can be allocated to an instance. If the instance already has a public IP address, the existing attached public IP address <code>IpAddress</code> is returned. </li>
     * <li>The new public IP address takes effect after you restart the instance (<a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a>) or start the instance (<a href="https://help.aliyun.com/document_detail/25500.html">StartInstance</a>).<br>In addition to assigning a public IP address, you can associate an Elastic IP Address (EIP) with a VPC-connected ECS instance. For more information, see <a href="https://help.aliyun.com/document_detail/2518064.html">AssociateEipAddress</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AllocatePublicIpAddress  AllocatePublicIpAddressRequest
     * @return AllocatePublicIpAddressResponse
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
     * <b>description</b> :
     * <ul>
     * <li>Each cloud disk supports up to 10 automatic snapshot policies.</li>
     * <li>If the target cloud disk already has an automatic snapshot policy applied, invoking this operation adds new policies without replacing existing ones.<blockquote>
     * <p>Cancel any unnecessary automatic snapshot policies to avoid unexpected costs.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ApplyAutoSnapshotPolicy  ApplyAutoSnapshotPolicyRequest
     * @return ApplyAutoSnapshotPolicyResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can specify IPv6 addresses within the CIDR block of the vSwitch to which the elastic network interface (ENI) belongs, or specify the number of IPv6 addresses for automatic creation of IPv6 addresses. Note the following items:</p>
     * <ul>
     * <li>The vSwitch to which the ENI belongs must have IPv6 enabled. For more information, see <a href="https://help.aliyun.com/document_detail/98923.html">Enable an IPv6 CIDR block for an existing vSwitch</a>.</li>
     * <li>The ENI must be in the Active or InUse state.</li>
     * <li>When you operate on a primary network interface controller (NIC), the instance to which the NIC is attached must be in the Running or Stopped state.</li>
     * <li>The number of IPv6 addresses that can be allocated to a single NIC depends on the instance type of the instance to which the NIC is attached.<ul>
     * <li>If the ENI is in the Active state, you can allocate up to 10 IPv6 addresses to the ENI.</li>
     * <li>If the ENI is attached to an instance, the number of IPv6 addresses that can be allocated is limited by the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
     * </ul>
     * </li>
     * <li>After you call this operation, you can obtain the allocated IPv6 address information from the response.</li>
     * </ul>
     * 
     * @param request the request parameters of AssignIpv6Addresses  AssignIpv6AddressesRequest
     * @return AssignIpv6AddressesResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Only elastic network interfaces (ENIs) in the Available or InUse state are supported.</li>
     * <li>When you operate the primary network interface controller (NIC), the instance to which the network interface controller (NIC) is attached must be in the Running or Stopped state.</li>
     * <li>When an elastic network interfaces (ENIs) is in the Available state, you can allocate up to 49 secondary private IP addresses to the ENI. After the ENI is attached to an instance, the number of secondary private IP addresses that can be allocated to the ENI is subject to the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</li>
     * <li>After you call this operation, you can obtain the allocated secondary private IP address information from the response.</li>
     * </ul>
     * 
     * @param request the request parameters of AssignPrivateIpAddresses  AssignPrivateIpAddressesRequest
     * @return AssignPrivateIpAddressesResponse
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
     * @deprecated OpenAPI AssociateEipAddress is deprecated, please use Vpc::2016-04-28::AssociateEipAddress instead.  * @param request  the request parameters of AssociateEipAddress  AssociateEipAddressRequest
     * @return AssociateEipAddressResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI AssociateHaVip is deprecated, please use Vpc::2016-04-28::AssociateHaVip instead.  * @param request  the request parameters of AssociateHaVip  AssociateHaVipRequest
     * @return AssociateHaVipResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p>When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>Before you connect a classic network type instance, the instance must be in the <strong>Running</strong> or <strong>Stopped</strong> state. </li>
     * <li>The destination VPC must have ClassicLink enabled. For more information, see <a href="https://help.aliyun.com/document_detail/65413.html">Enable ClassicLink feature</a>. </li>
     * <li>The classic network type instance and the VPC must be in the same region.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachClassicLinkVpc  AttachClassicLinkVpcRequest
     * @return AttachClassicLinkVpcResponse
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The instance and the disk must be in the same zone.</li>
     * <li>The disk must be in the <strong>Available</strong> (<code>Available</code>) state. </li>
     * <li>When you attach a data disk:<ul>
     * <li>The destination ECS instance must be in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state. </li>
     * <li>If the disk is separately purchased, the billing method must be pay-as-you-go.</li>
     * <li>A system disk that was uninstalled from an ECS instance can be attached as a data disk without billing method restrictions. </li>
     * <li>An elastic ephemeral disk that has been detached can only be re-attached to its original instance.</li>
     * </ul>
     * </li>
     * <li>When you attach a system disk:<ul>
     * <li>The destination ECS instance must be the original instance from which the system disk was detached.</li>
     * <li>The destination ECS instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state. </li>
     * <li>You must specify the logon credential for the instance.</li>
     * <li>Elastic ephemeral disks cannot be attached as system disks.</li>
     * <li>For more information about attaching system disks, see <a href="https://help.aliyun.com/document_detail/146752.html">Detach or attach a system disk</a>.</li>
     * </ul>
     * </li>
     * <li>When you query ECS instance information, if the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code>, all operations are prohibited.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>A disk with the multi-attach attribute enabled can only be attached to instances that support the NVMe protocol. 
     *  For more information, see <a href="https://help.aliyun.com/document_detail/256487.html">Standard SSDs that support NVMe</a> and <a href="https://help.aliyun.com/document_detail/262105.html">Use the multi-attach feature</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachDisk  AttachDiskRequest
     * @return AttachDiskResponse
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

    /**
     * <b>description</b> :
     * <p>You can call <a href="https://help.aliyun.com/document_detail/2679686.html">DescribeInstanceRamRole</a> to query the <a href="https://help.aliyun.com/document_detail/61175.html">instance RAM role</a> attached to an instance.</p>
     * <blockquote>
     * <p>If the instance already has an instance RAM role attached, an error is returned indicating that you cannot attach a new role.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AttachInstanceRamRole  AttachInstanceRamRoleRequest
     * @return AttachInstanceRamRoleResponse
     */
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Windows instances do not support SSH key pairs. </li>
     * <li>After you attach an SSH key pair, authentication by using a username and password is disabled. </li>
     * <li>If an instance is in the <strong>Running</strong> state, restart the instance (<a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a>) for the SSH key pair to take effect.  </li>
     * <li>If an instance is in the <strong>Stopped</strong> state, start the instance (<a href="https://help.aliyun.com/document_detail/25500.html">StartInstance</a>) for the SSH key pair to take effect.  </li>
     * <li>If an instance already has an SSH key pair attached, the new SSH key pair automatically replaces the original one.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachKeyPair  AttachKeyPairRequest
     * @return AttachKeyPairResponse
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li><p>The Elastic Network Interface (ENI) must be in the <strong>Active</strong> (<code>Available</code>) state. An ENI can be attached to only one instance that resides in the same zone and VPC as the ENI.</p>
     * </li>
     * <li><p>The instance must be in the Running or Stopped state. Some instance types require the instance to be in the Stopped state when you attach an Elastic Network Interface (ENI). For more information, see the ECS instance types that require instance stop section in <a href="https://help.aliyun.com/document_detail/58503.html">Attach an ENI</a>.</p>
     * <blockquote>
     * <p>If the instance was last started before April 1, 2018 (including but not limited to starting a newly purchased instance, restarting, or powering on), you must invoke RebootInstance to restart the instance that has been in the Running state. Otherwise, the Elastic Network Interface (ENI) cannot be attached.</p>
     * </blockquote>
     * </li>
     * <li><p>Multiple Elastic Network Interfaces (ENIs) can be attached to a single instance at the same time. For more information, see <a href="https://help.aliyun.com/document_detail/58496.html">ENI overview</a>.</p>
     * </li>
     * <li><p>The vSwitch to which the ENI belongs must be in the same zone and VPC as the instance.</p>
     * </li>
     * <li><p>This is an asynchronous operation. After you send a successful request, you can check the Elastic Network Interface (ENI) status or listen for network interface controller (NIC) operation events to obtain the operation result. The ENI state machine is shown in the following figure:
     * <img src="https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/zh-CN/20221124/esgu/AttachNetworkInterface.jpg" alt=""></p>
     * <ul>
     * <li>Attaching indicates that the attach ENI request has been sent and the ENI is being attached to the ECS instance.</li>
     * <li>InUse indicates that the ENI is attached to the ECS instance.</li>
     * <li>Available indicates that the ENI failed to be attached to the ECS instance.
     * <strong>For details about sample code, see</strong> <a href="https://help.aliyun.com/document_detail/471550.html">Attach an Elastic Network Interface (ENI)</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AttachNetworkInterface  AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
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
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li><strong>Quantity limit:</strong> The total number of rules (including both inbound rules and outbound rules) across all security groups associated with a single network interface controller (NIC) cannot exceed 1,000. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.  </li>
     * <li><strong>Priority settings:</strong> The priority (Priority) of inbound security group rules ranges from 1 to 100. A smaller number indicates a higher priority. If two security group rules have the same priority, the deny (drop) rule takes precedence. Access is denied for rules with the same priority.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>If the specified security group rule already exists, the call succeeds but no rule is added.</p>
     * <h3>How to determine a rule</h3>
     * <p>The following parameters are required to determine an inbound rule:</p>
     * <ul>
     * <li>Source settings: Specify one of the following: SourceCidrIp (IPv4 address), Ipv6SourceCidrIp (IPv6 address), SourcePrefixListId (prefix list ID), or SourceGroupId (source security group).</li>
     * <li>Destination port range: PortRange.</li>
     * <li>Protocol type: IpProtocol.</li>
     * <li>Access policy: Policy.<blockquote>
     * <p>Advanced security groups do not support authorization for access from other security groups. Basic security groups support a maximum of 20 authorized security groups.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Request examples</h3>
     * <p>The following examples show how to add inbound rules with different sources to a specified security group in the China (Hangzhou) region:</p>
     * <ul>
     * <li>Add access permissions for a specified IP address range.<pre><code>&quot;RegionId&quot;:&quot;ap-southeast-1&quot;, //Set the region
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;, //Set the security group
     * &quot;Permissions&quot;:[
     *      {
     *        &quot;SourceCidrIp&quot;:&quot;10.0.0.0/8&quot;, //Set the source IPv4 address
     *        &quot;PortRange&quot;:&quot;22/22&quot;, //Set the port range
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;, //Set the protocol type
     *        &quot;Policy&quot;:&quot;Accept&quot; //Set the access policy
     *      }
     * ]
     * </code></pre>
     * </li>
     * <li>Add access permissions for another security group and a prefix list.<pre><code>&quot;RegionId&quot;:&quot;ap-southeast-1&quot;,
     * &quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *      {
     *        &quot;SourceGroupId&quot;:&quot;sg-bp17vs63txqxbd****&quot;, //Set the source security group
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      },{
     *        &quot;SourcePrefixListId&quot;:&quot;pl-x1j1k5ykzqlixdcy****&quot;, //Set the source prefix list
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      }
     * ]
     * </code></pre>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AuthorizeSecurityGroup  AuthorizeSecurityGroupRequest
     * @return AuthorizeSecurityGroupResponse
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
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li><strong>Quantity limit:</strong> The total number of rules (including both inbound rules and outbound rules) across all security groups associated with a single network interface controller (NIC) cannot exceed 1,000. For more information, refer to <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.  </li>
     * <li><strong>Priority settings:</strong> The priority (Priority) of outbound rule ranges from 1 to 100. A smaller number indicates a higher priority. When two rules have the same priority, the deny (drop) rule takes precedence.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>If the specified security group rule already exists, the call succeeds but no rule is added.</p>
     * <h3>How rules are determined</h3>
     * <p>The following parameters are required to define an outbound rule:</p>
     * <ul>
     * <li>Destination settings: Specify one of the following: DestCidrIp (IPv4 address), Ipv6DestCidrIp (IPv6 address), DestPrefixListId (prefix list ID), or DestGroupId (destination security group).</li>
     * <li>Destination port range: PortRange.</li>
     * <li>Protocol type: IpProtocol.</li>
     * <li>Authorization policy: Policy.<blockquote>
     * <p>Advanced security groups do not support authorization to other security groups. Custom security groups support a maximum of 20 authorized security groups.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Request examples</h3>
     * <p>The following examples show how to add outbound rules with different destinations to a security group in the China (Hangzhou) region:</p>
     * <ul>
     * <li>Add access permissions for a specified IP address range.<pre><code>&quot;RegionId&quot;:&quot;ap-southeast-1&quot;,  // Specify the region.
     * &quot;SecurityGroupId&quot;:&quot;sg-bp17vs63txqxbds9***&quot;, // Specify the security group.
     * &quot;Permissions&quot;:[
     *      {
     *        &quot;DestCidrIp&quot;:&quot;10.0.0.0/8&quot;, // Specify the destination IPv4 address.
     *        &quot;PortRange&quot;:&quot;-1/-1&quot;, // Specify the port range.
     *        &quot;IpProtocol&quot;:&quot;ICMP&quot;, // Specify the protocol type.
     *        &quot;Policy&quot;:&quot;Accept&quot; // Specify the access policy.
     *      }
     * ]
     * </code></pre>
     * </li>
     * <li>Add access permissions for another security group and a prefix list.<pre><code>&quot;RegionId&quot;:&quot;ap-southeast-1&quot;,
     * &quot;SecurityGroupId&quot;:&quot;sg-bp17vs63txqxbds9***&quot;,
     * &quot;Permissions&quot;:[
     *      {
     *        &quot;DestGroupId&quot;:&quot;sg-bp67acfmxazb4pi***&quot;, // Specify the destination security group.
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      },{
     *        &quot;DestPrefixListId&quot;:&quot;pl-x1j1k5ykzqlixdcy****&quot;, // Specify the destination prefix list.
     *        &quot;PortRange&quot;:&quot;22/22&quot;,
     *        &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *        &quot;Policy&quot;:&quot;Drop&quot;
     *      }
     * ]
     * </code></pre>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AuthorizeSecurityGroupEgress  AuthorizeSecurityGroupEgressRequest
     * @return AuthorizeSecurityGroupEgressResponse
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

    /**
     * @param request the request parameters of CancelAutoSnapshotPolicy  CancelAutoSnapshotPolicyRequest
     * @return CancelAutoSnapshotPolicyResponse
     */
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>After you cancel the image copy task, the image that is being created in the destination region is automatically deleted, and the source image remains unchanged.</li>
     * <li>If the image has already been copied, the operation fails and an error message is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelCopyImage  CancelCopyImageRequest
     * @return CancelCopyImageResponse
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the image building task you want to cancel is in the PREPARING, REPAIRING, or BUILDING state.</p>
     * 
     * @param request the request parameters of CancelImagePipelineExecution  CancelImagePipelineExecutionRequest
     * @return CancelImagePipelineExecutionResponse
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
     * @deprecated OpenAPI CancelPhysicalConnection is deprecated, please use Vpc::2016-04-28::CancelPhysicalConnection instead.  * @param request  the request parameters of CancelPhysicalConnection  CancelPhysicalConnectionRequest
     * @return CancelPhysicalConnectionResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of CancelSimulatedSystemEvents  CancelSimulatedSystemEventsRequest
     * @return CancelSimulatedSystemEventsResponse
     */
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

    /**
     * @param request the request parameters of CancelTask  CancelTaskRequest
     * @return CancelTaskResponse
     */
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
     * <b>description</b> :
     * <blockquote>
     * <p>The disk cloning feature itself is free of charge, but the new disk generated by cloning is billed based on block storage billing rules. Billable items vary by disk type and include disk capacity fees, provisioned performance fees, and performance burst fees. Except for performance burst fees, which are billed after a burst occurs, other fees start to accrue after the disk is created, regardless of whether the disk is attached to an instance.</p>
     * </blockquote>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>This is an asynchronous operation. After a successful call, use the taskGroupId and call the DescribeTasks operation to query the execution result.</li>
     * </ul>
     * <h3>Features</h3>
     * <ul>
     * <li>Cloning supports only ESSD series disks (cloud_essd, cloud_auto, cloud_essd_entry, cloud_regional_disk_auto) as the source, and the <code>new disk</code> can only be an ESSD series disk type.<ul>
     * <li>Non-regional disks can only be cloned to non-regional disk types. Regional disks can only be cloned to regional disk types.</li>
     * <li>Local disks and elastic ephemeral disks cannot be cloned or used as clone sources.</li>
     * </ul>
     * </li>
     * <li>You can specify the <code>new disk</code> type and performance level (PL) during cloning.</li>
     * <li>You can specify the <code>new disk</code> capacity during cloning, but the new disk capacity must be greater than or equal to the <code>source disk</code> capacity.</li>
     * <li>You can configure provisioned performance and performance burst for the <code>new disk</code>, provided that the destination disk type supports provisioned performance and performance burst.</li>
     * <li>You can specify encryption or change the encryption key for the <code>new disk</code>. If the <code>source disk</code> is encrypted, you cannot clone it into an unencrypted disk, but you can change the encryption key.</li>
     * <li>You can use a subscription disk as the <code>source disk</code>. Even if the subscription disk has expired, it can still be used as the <code>source disk</code>.</li>
     * <li>The cloned <code>new disk</code> does not support reinitialization.</li>
     * <li>Cloning does not support storage sets or dedicated block storage clusters. However, disks in these resources can be used as the <code>source disk</code>. The cloned disk will not be placed in the storage set or dedicated block storage cluster.</li>
     * <li><code>Source disk</code> status restrictions:<ul>
     * <li>The <code>source disk</code> status is In Use, and the associated instance status is Running or Stopped.</li>
     * <li>The <code>source disk</code> status is Available, and the disk has been previously attached.</li>
     * <li>Disks undergoing specification changes cannot be used as the <code>source disk</code>.</li>
     * <li>Disks undergoing expansion cannot be used as the <code>source disk</code>.</li>
     * </ul>
     * </li>
     * <li>Disk cloning is not supported for instance hibernation scenarios. If a disk is on a hibernated instance, it cannot be used as the <code>source disk</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CloneDisks  CloneDisksRequest
     * @return CloneDisksResponse
     */
    @Override
    public CompletableFuture<CloneDisksResponse> cloneDisks(CloneDisksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CloneDisks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CloneDisksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CloneDisksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ConnectRouterInterface is deprecated, please use Vpc::2016-04-28::ConnectRouterInterface instead.  * @param request  the request parameters of ConnectRouterInterface  ConnectRouterInterfaceRequest
     * @return ConnectRouterInterfaceResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>After a public IP address is converted to an EIP, the EIP is billed separately. Make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/122035.html">billable methods of EIPs</a>.
     * When you invoke this operation, the ECS instance must meet the following conditions:</p>
     * <ul>
     * <li>The instance is in the <strong>Stopped</strong> (<code>Stopped</code>) or <strong>Running</strong> (<code>Running</code>) state.</li>
     * <li>No EIP is attached to the instance.</li>
     * <li>The instance has no pending configuration change nodes.</li>
     * <li>The public bandwidth cannot be 0 Mbit/s.</li>
     * <li>For subscription instances, the billing method for public bandwidth must be <code>pay-by-traffic</code>. Public IP addresses with the <code>pay-by-bandwidth</code> billing method cannot be converted to EIPs. Pay-as-you-go instances are not subject to this restriction. For more information, refer to <a href="https://help.aliyun.com/document_detail/178883.html">Transform the billing method for public bandwidth</a>.</li>
     * <li>The VPC-type subscription ECS instance does not expire within 24 hours.</li>
     * </ul>
     * 
     * @param request the request parameters of ConvertNatPublicIpToEip  ConvertNatPublicIpToEipRequest
     * @return ConvertNatPublicIpToEipResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can use the copied image in the destination region to create ECS instances (<a href="https://help.aliyun.com/document_detail/25499.html">RunInstances</a>) or replace system disks of instances (<a href="https://help.aliyun.com/document_detail/25521.html">ReplaceSystemDisk</a>). 
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The custom image must be in the <strong>Available</strong> (<code>Available</code>) state.  </li>
     * <li>If the image is a custom image under your account, you can copy it across regions. If the image is shared with you by another user, you can copy it only within the same region. </li>
     * <li>During the image copy process, you cannot directly delete (<a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a>) the image being copied. However, you can cancel the copy task (<a href="https://help.aliyun.com/document_detail/25539.html">CancelCopyImage</a>) to delete the image being copied.  </li>
     * <li>A maximum of five image copy tasks can run concurrently in the same region. Additional tasks are queued and run in sequence after any of the preceding tasks are completed.</li>
     * <li>You can use the <code>ResourceGroupId</code> parameter to specify the resource group to which the copied image belongs. If you do not set the <code>ResourceGroupId</code> parameter, the copied image belongs to the default resource group.</li>
     * </ul>
     * 
     * @param request the request parameters of CopyImage  CopyImageRequest
     * @return CopyImageResponse
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The new snapshot cannot be used to roll back the cloud disk that is associated with the source snapshot.</li>
     * <li>Local snapshots cannot be copied.</li>
     * </ul>
     * 
     * @param request the request parameters of CopySnapshot  CopySnapshotRequest
     * @return CopySnapshotResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>After you use an activation code to register a non-Alibaba Cloud server as an Alibaba Cloud managed instance, you can use various online services provided by Alibaba Cloud in the managed instance, such as Cloud Assistant, CloudOps Orchestration Service, and Alibaba Cloud DevOps.
     * The non-Alibaba Cloud server must run one of the following operating system versions and have Internet access to be registered as an Alibaba Cloud managed instance:</p>
     * <ul>
     * <li>Alibaba Cloud Linux 2/3 and later</li>
     * <li>CentOS 6/7/8 and later</li>
     * <li>Debian 8/9/10 and later</li>
     * <li>Ubuntu 12/14/16/18 and later</li>
     * <li>CoreOS</li>
     * <li>OpenSUSE</li>
     * <li>RedHat 5/6/7 and later</li>
     * <li>SUSE Linux Enterprise Server 11/12/15 and later</li>
     * <li>Windows Server 2012/2016/2019 and later
     * In each Alibaba Cloud region, you can have up to 10 activation codes for managed instances. Each activation code can be used to register up to 10 instances. The maximum validity period of a single activation code is 4 hours.<blockquote>
     * <p>On the <strong>Elastic Compute Service (ECS) Cloud Assistant</strong> page, click the <strong>Managed Instances</strong> tab, and then click <strong>Register New Instance</strong> to view the usage data of activation codes.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateActivation  CreateActivationRequest
     * @return CreateActivationResponse
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
     * <b>description</b> :
     * <ul>
     * <li>Auto provisioning is a solution that uses spot instances and pay-as-you-go instances to quickly deploy instance clusters. It supports one-click deployment of instance clusters across billing methods, zones, and instance families. For more information, see <a href="https://help.aliyun.com/document_detail/200772.html">Use the auto provisioning group API to create ECS instances in batches</a>.</li>
     * <li>Auto provisioning uses provisioning groups to schedule and maintain compute resources. You can use auto provisioning groups to provide stable computing power and mitigate the instability caused by the revoke mechanism of spot instances.</li>
     * <li>Auto provisioning is a free feature, but you are charged for the instance resources created by auto provisioning groups. For more information, see <a href="https://help.aliyun.com/document_detail/52088.html">Spot instance billing</a> and <a href="https://help.aliyun.com/document_detail/40653.html">Pay-as-you-go</a>.</li>
     * <li>If you specify both a launch template (<code>LaunchTemplateId</code>) and launch configuration information (<code>LaunchConfiguration.*</code>), the launch template takes precedence.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAutoProvisioningGroup  CreateAutoProvisioningGroupRequest
     * @return CreateAutoProvisioningGroupResponse
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
     * <b>description</b> :
     * <p>Before you call this operation, read <a href="https://help.aliyun.com/document_detail/127767.html">Create an automatic snapshot policy</a>.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can create a maximum of 100 automatic snapshot policies in each region for an Alibaba Cloud account. When the number of automatic snapshots for a disk reaches the quota limit, the system deletes the earliest automatic snapshot created by the automatic snapshot policy when a new snapshot task is created.</li>
     * <li>The system does not execute an automatic snapshot policy when an ECS instance has a pending stop or restart task.</li>
     * <li>If cross-region snapshot replication is enabled and no encryption parameters are configured, encrypted snapshots are encrypted by using the default service key of the destination region. For more information about cross-region snapshot replication, see <a href="https://help.aliyun.com/document_detail/159441.html">Copy a snapshot</a>.
     * After you create an automatic snapshot policy, call <a href="https://help.aliyun.com/document_detail/25531.html">ApplyAutoSnapshotPolicy</a> to apply the policy to disks. To modify an automatic snapshot policy, call <a href="https://help.aliyun.com/document_detail/25529.html">ModifyAutoSnapshotPolicyEx</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateAutoSnapshotPolicy  CreateAutoSnapshotPolicyRequest
     * @return CreateAutoSnapshotPolicyResponse
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can use the resource reservation service to reserve resources that match specified properties such as zone and instance type. The system reserves the resources as a private pool. For more information, see <a href="https://help.aliyun.com/document_detail/193633.html">Overview of immediate resource reservations</a>.</p>
     * <ul>
     * <li>Currently, only the immediate pattern is supported. After you purchase an immediate resource reservation, the instance type is billed on a pay-as-you-go basis, regardless of whether you actually create pay-as-you-go instances. Billing continues until you manually release the resource reservation (manual release) or it is automatically released upon expiration (automatic release).<ul>
     * <li>When you create an instance by invoking <a href="https://help.aliyun.com/document_detail/25499.html">CreateInstance</a> or <a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a>, you can configure the private pool capacity options. You can also invoke <a href="https://help.aliyun.com/document_detail/190006.html">ModifyInstanceAttachmentAttributes</a> to modify the private pool capacity options of an instance. After an instance matches the private pool capacity, you are charged for the instance type, disks, public bandwidth, and other resources based on your instance configurations.</li>
     * <li>If no pay-as-you-go instance is actually created, you are charged only for the instance type.</li>
     * </ul>
     * </li>
     * <li>The matched instances and unused capacity of an immediate resource reservation support hourly bill offset by savings plans and regional reserved instances, but do not support hourly bill offset by zonal reserved instances. Purchase reserved instances or savings plans first, and then use the immediate resource reservation service with the coverage of reserved instances or savings plans. This way, you can obtain resource availability assurance at no additional cost.<blockquote>
     * <p>You can create only immediate resource reservations by invoking this API operation. You can create immediate or scheduled resource reservations in the ECS console. For more information, see <a href="~~193626#section-oil-qh5-xvx~~">Resource Assurance</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateCapacityReservation  CreateCapacityReservationRequest
     * @return CreateCapacityReservationResponse
     */
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>You can create the following types of commands: <ul>
     * <li>Bat scripts for Windows instances (RunBatScript).</li>
     * <li>PowerShell scripts for Windows instances (RunPowerShellScript).</li>
     * <li>Shell scripts for Linux instances (RunShellScript).</li>
     * </ul>
     * </li>
     * <li>You can specify the Timeout parameter to set the maximum timeout period for command execution on ECS instances. If the command times out, <a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> forcefully terminates the command process by canceling the PID of the command.<ul>
     * <li>For a one-time execution, after the command times out, the execution status (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) of the command on the specified ECS instance becomes Failed.  </li>
     * <li>For a scheduled execution: <ul>
     * <li>The timeout period takes effect for each execution record. </li>
     * <li>After a specific execution times out, the status (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) of the execution record becomes Failed.  </li>
     * <li>The timeout of a previous execution does not affect the next execution.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>In a region, you can retain 500 to 50,000 Cloud Assistant commands. You can also request a quota increase. For information about how to query and increase quotas, see <a href="https://help.aliyun.com/document_detail/184116.html">Quota management</a>.</li>
     * <li>You can specify the WorkingDir parameter to set the execution path of the command. For Linux instances, the default path is the home directory of the root user, which is <code>/root</code>. For Windows instances, the default path is the directory where the Cloud Assistant Agent process is located, such as <code>C:\\Windows\\System32</code>.</li>
     * <li>You can enable the custom parameter feature by specifying EnableParameter=true. When you set CommandContent, you can define custom parameters in the {{parameter}} format and pass in custom parameter key-value pairs when you run the command (<a href="https://help.aliyun.com/document_detail/64841.html">InvokeCommand</a>). For example, if you create the command <code>echo {{name}}</code> and pass in the key-value pair <code>&lt;name, Jack&gt;</code> through the Parameters parameter when you call InvokeCommand, the custom parameter is automatically replaced. A new command <code>echo Jack</code> is generated and run on the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateCommand  CreateCommandRequest
     * @return CreateCommandResponse
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

    /**
     * @param request the request parameters of CreateDedicatedHostCluster  CreateDedicatedHostClusterRequest
     * @return CreateDedicatedHostClusterResponse
     */
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
     * @param request the request parameters of CreateDeploymentSet  CreateDeploymentSetRequest
     * @return CreateDeploymentSetResponse
     */
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

    /**
     * @param request the request parameters of CreateDiagnosticMetricSet  CreateDiagnosticMetricSetRequest
     * @return CreateDiagnosticMetricSetResponse
     */
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

    /**
     * @param request the request parameters of CreateDiagnosticReport  CreateDiagnosticReportRequest
     * @return CreateDiagnosticReportResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>When you create a disk, you can enable the multi-attach attribute (<code>MultiAttach</code>). Learn about this attribute and its usage limits before you proceed. For more information, see <a href="https://help.aliyun.com/document_detail/256487.html">ESSD disks that support NVMe</a> and <a href="https://help.aliyun.com/document_detail/262105.html">Use the multi-attach feature</a>.</li>
     * <li>The following disk types can be created: basic disks, ultra disks, standard SSDs, enterprise SSDs (ESSDs), ESSD Entry disks, regional Enterprise SSDs (ESSDs), ESSD AutoPL disks, elastic ephemeral disks - Standard Edition, and elastic ephemeral disks - Premium Edition.</li>
     * <li>To create a disk, complete real-name registration. Go to the <a href="https://account.console.aliyun.com/#/auth/home">Real-name Registration</a> page in Account Center.</li>
     * <li>Creating a disk incurs fees. Familiarize yourself with the billing methods of Elastic Compute Service (ECS) in advance. For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>.</li>
     * <li>Default settings when you create a disk:<ul>
     * <li>Automatic snapshots of the disk are deleted when the disk is deleted. In other words, <code>DeleteAutoSnapshot</code> is set to <code>true</code>. You can call <a href="https://help.aliyun.com/document_detail/2679767.html">DescribeDisks</a> to query the parameter settings, and call <a href="https://help.aliyun.com/document_detail/25517.html">ModifyDiskAttribute</a> to modify the property.</li>
     * <li>When you create an enterprise SSD, if you do not configure the performance level, the default performance level is PL1. You can call <a href="https://help.aliyun.com/document_detail/123780.html">ModifyDiskSpec</a> to change the disk performance level.</li>
     * <li>The billing method is pay-as-you-go, which means the default value of the <code>Portable</code> property is <code>true</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateDisk  CreateDiskRequest
     * @return CreateDiskResponse
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
     * <b>description</b> :
     * <p>Elasticity assurance provides a new resource purchase and usage method that balances flexibility and certainty. It is a resource reservation service that provides guaranteed resources for pay-as-you-go ECS instances. For more information, see <a href="https://help.aliyun.com/document_detail/193630.html">Overview of Elasticity Assurance</a>.</p>
     * <ul>
     * <li>After you purchase an elasticity assurance service, refunds are supported for regular elasticity assurance services but not for time-sharing elasticity assurance services. For billing information, see <a href="https://help.aliyun.com/document_detail/432502.html">Resource Assurance</a>.</li>
     * <li>Elasticity assurance can be used to create only ECS instances whose billable methods are pay-as-you-go.</li>
     * <li>Currently, only the unlimited pattern is available for elasticity assurance times. This means that the <code>AssuranceTimes</code> parameter supports only the <code>Unlimited</code> value. An elasticity assurance service in unlimited pattern automatically starts after the assurance takes effect.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateElasticityAssurance  CreateElasticityAssuranceRequest
     * @return CreateElasticityAssuranceResponse
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
     * @deprecated OpenAPI CreateForwardEntry is deprecated, please use Vpc::2016-04-28::CreateForwardEntry instead.  * @param request  the request parameters of CreateForwardEntry  CreateForwardEntryRequest
     * @return CreateForwardEntryResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI CreateHaVip is deprecated, please use Vpc::2016-04-28::CreateHaVip instead.  * @param request  the request parameters of CreateHaVip  CreateHaVipRequest
     * @return CreateHaVipResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of CreateHpcCluster  CreateHpcClusterRequest
     * @return CreateHpcClusterResponse
     */
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
     * <b>description</b> :
     * <h3>Precautions</h3>
     * <ul>
     * <li>This is an asynchronous operation. After a request to create a custom image is sent, the image ID is returned. However, the image creation is not immediately complete. Call <a href="https://help.aliyun.com/document_detail/2679797.html">DescribeImage</a> to query the image information. When the status in the response is <code>Available</code>, the image is created and ready for use. For more information, see <a href="https://help.aliyun.com/document_detail/172789.html">Custom image overview</a>.</li>
     * <li>When you query ECS instance information, if the response contains {&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}, you cannot create a custom image.</li>
     * <li>Configure the image detection parameter <code>DetectionStrategy</code> when creating an image to help the system optimize your image. For more information, see <a href="https://help.aliyun.com/document_detail/439819.html">Image detection overview</a>.
     * The following describes three methods to create a custom image by using this operation. The priority of request parameters is: InstanceId &gt; DiskDeviceMapping &gt; SnapshotId. If your request contains two or more of these parameters, the image is created based on the parameter with the highest priority.</li>
     * <li><strong>Create a custom image from an instance</strong>: Specify the instance ID (<code>InstanceId</code>).<ul>
     * <li>The instance must be in the Running (<code>Running</code>) or Stopped (<code>Stopped</code>) state.</li>
     * <li>After the operation is called, a new snapshot is created for each disk of the instance.<blockquote>
     * <p>Notice: Because a running instance may have cached data that has not been written to disks, the data of the created custom image may be inconsistent with the instance data. Stop the instance (<a href="https://help.aliyun.com/document_detail/155372.html">StopInstances</a>) before creating an image.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li><strong>Create a custom image from a snapshot (the specified snapshot cannot be one created on or before July 15, 2013.)</strong><ul>
     * <li><strong>Create a custom image from a system disk snapshot</strong>: Specify only the snapshot ID of the system disk (<code>SnapshotId</code>).</li>
     * <li><strong>Create a custom image from system disk and data disk snapshots</strong>: Establish data associations among multiple disks (<code>DiskDeviceMapping</code>).<ul>
     * <li>Only one system disk snapshot can be specified. </li>
     * <li>Multiple data disk snapshots can be specified, up to a maximum of 16. If <code>DiskDeviceMapping.N.SnapshotId</code> is not specified, an empty data disk with the default capacity is created.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When an instance is released, the system disk is retained as a pay-as-you-go data disk. Snapshots created from this disk do not support creating custom images. Create a custom image before releasing the instance as needed.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreateImage  CreateImageRequest
     * @return CreateImageResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Before you create an image component, take note of the following items:</p>
     * <ul>
     * <li>You can create only custom image components.</li>
     * <li>Component version numbers must be unique for components with the same name. When you use a component in a template, you can reference it by name and version number.</li>
     * <li>The content size of an image component cannot exceed 16 KB. For details about supported commands, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by Image Builder</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/197410.html">Image Builder overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImageComponent  CreateImageComponentRequest
     * @return CreateImageComponentResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can use image templates to customize image content and build images cross-region and across accounts. Before you create an image template, take note of the following items:</p>
     * <ul>
     * <li>You can create only custom image templates.</li>
     * <li>Only public images, custom images, shared images, or image families can be used as source images for building.</li>
     * <li>When you build an image by using an image template, multiple intermediate instances are created to assist in building the image. The intermediate instances are pay-as-you-go billing method ECS instances, and fees are incurred. For more information, see <a href="https://help.aliyun.com/document_detail/40653.html">Pay-as-you-go</a>.
     * Take note of the following items about the build template content <code>BuildContent</code>:</li>
     * <li>The <code>FROM</code> command is deprecated. Regardless of whether the <code>FROM</code> command is set in the <code>BuildContent</code> parameter, the system selects the source image based on the source image type <code>BaseImageType</code> and source image <code>BaseImage</code>.</li>
     * <li>The content size of an image template cannot exceed 16 KB. For details about supported commands, see <a href="https://help.aliyun.com/document_detail/200206.html">Commands supported by Image Builder</a>.
     * For more information, see <a href="https://help.aliyun.com/document_detail/197410.html">Overview of Image Builder</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateImagePipeline  CreateImagePipelineRequest
     * @return CreateImagePipelineResponse
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is no longer being updated. We recommend that you use <a href="https://help.aliyun.com/document_detail/2679677.html">RunInstances</a>.
     * &lt;props=&quot;china&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of ECS.</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of ECS.</strong>
     * This is an asynchronous operation. After a request to create an instance is sent, the instance ID is returned. The instance is not immediately created. Call <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Stopped</code>, the instance is created. Then, you can call <a href="https://help.aliyun.com/document_detail/2679679.html">StartInstance</a> to start the instance.</p>
     * </blockquote>
     * <h3>Before you begin</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>Make sure that your account has completed real-name registration. For more information, see <a href="https://help.aliyun.com/document_detail/48263.html">Real-name registration</a>.</p>
     * </li>
     * <li><p>Creating an instance incurs charges. Make sure that you understand the billing methods of Elastic Compute Service. For more information, see <a href="https://help.aliyun.com/document_detail/25398.html">Billing overview</a>.</p>
     * </li>
     * <li><p>Make sure that the total number of instances or the total number of vCPUs across all instance types does not exceed the quota. For more information, see <a href="https://quotas.console.aliyun.com/products/ecs/quotas">Quota Center</a>.</p>
     * </li>
     * <li><p>Before creating a VPC-connected instance, <a href="https://help.aliyun.com/document_detail/65430.html">create a VPC</a> in the corresponding Alibaba Cloud region.</p>
     * </li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>When you invoke this operation, the system does not send notifications (including text messages, emails, and internal messages) about instance creation.</li>
     * <li>If the billing method of the instance is subscription (<code>PrePaid</code>), your active coupons are used by default during payment.</li>
     * <li>If the instance memory is 512 MiB, you cannot use Windows Server images except through the half-year channel. If the instance memory is 4 GiB or more, you cannot use 32-bit operating system images.</li>
     * <li>Instances created by invoking this operation are not assigned Internet IP addresses. If the public bandwidth is greater than 0, you can invoke <a href="https://help.aliyun.com/document_detail/25544.html">AllocatePublicIpAddress</a> to assign an Internet IP address. If the public bandwidth is 0, invoke <a href="https://help.aliyun.com/document_detail/2679879.html">ModifyInstanceNetworkSpec</a> to adjust the bandwidth and then invoke <a href="https://help.aliyun.com/document_detail/25544.html">AllocatePublicIpAddress</a> to assign an Internet IP address.<blockquote>
     * <p>In a single region, the total peak Internet bandwidth billed on a pay-by-bandwidth basis for a single Alibaba Cloud account is limited. For more information, see <a href="~~25412#BandwidthQuota~~">Public bandwidth limits</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Suggestions</h3>
     * <ul>
     * <li><strong>Instance type selection</strong>: See <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a> or invoke <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> to query the performance data of the target instance type. You can also see <a href="https://help.aliyun.com/document_detail/58291.html">Best practices for instance type selection</a> to learn how to select an instance type.</li>
     * <li><strong>Check active resources</strong>: Invoke <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a> to query active resources in a specific region or zone.</li>
     * <li><strong>User data</strong>: If the instance meets the requirements for <a href="https://help.aliyun.com/document_detail/49121.html">instance user data</a>, you can pass in UserData. The <code>UserData</code> data is not encrypted when the API request is sent. Do not send confidential information such as passwords and private keys in plaintext. If you must pass in such information, encrypt it and use Base64 encoding before passing it in, and then perform decryption within the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateInstance  CreateInstanceRequest
     * @return CreateInstanceResponse
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
     * <b>description</b> :
     * <p>In addition to calling CreateKeyPair to create a key pair, you can use a third-party tool to create a key pair and then upload it (<a href="https://help.aliyun.com/document_detail/51774.html">ImportKeyPair</a>) to an Alibaba Cloud region. The uploaded key pair is used in the same way as a key pair created by the system.
     * You can have a maximum of 500 key pairs in each region. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
     * 
     * @param request the request parameters of CreateKeyPair  CreateKeyPairRequest
     * @return CreateKeyPairResponse
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
     * <b>description</b> :
     * <p>After you call CreateLaunchTemplate to create a template, a default version with version number 1 is automatically generated. You can then create multiple versions based on this template by calling <code>CreateLaunchTemplateVersion</code>, with version numbers incrementing sequentially from 1. If you do not specify a template version number when creating an instance (<a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a>), the default version is used.
     * A launch template version contains the configurations used to create instances, such as the region, image ID, instance type, security group ID, and public bandwidth. If a specific instance configuration is not specified in the version, you must specify it when you create the instance.
     * Before you begin:</p>
     * <ul>
     * <li>Each account can create up to 30 launch templates per region, and each template can have up to 30 versions.</li>
     * <li>Most parameters in a launch template are optional. When you create a template, Alibaba Cloud does not verify the existence or validity of parameter values. Parameter values are validated only when you actually create an instance.</li>
     * <li>If a configuration is set in the launch template, it cannot be filtered out when you create an instance (<a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a>). For example, if the template sets <code>HostName=LocalHost</code> and the <code>HostName</code> value in <code>RunInstances</code> is left empty, the hostname of the instance is still <code>LocalHost</code>. To override the <code>HostName=LocalHost</code> configuration, set <code>HostName=MyHost</code> or another value in <code>RunInstances</code>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateLaunchTemplate  CreateLaunchTemplateRequest
     * @return CreateLaunchTemplateResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>To modify the parameters of a specific version, create a new template version. Each instance launch template supports a maximum of 30 versions.</p>
     * 
     * @param request the request parameters of CreateLaunchTemplateVersion  CreateLaunchTemplateVersionRequest
     * @return CreateLaunchTemplateVersionResponse
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
     * @deprecated OpenAPI CreateNatGateway is deprecated, please use Vpc::2016-04-28::CreateNatGateway instead.  * @param request  the request parameters of CreateNatGateway  CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p>Take note of the following items when you invoke this operation:</p>
     * <ul>
     * <li>This is a synchronous operation. The newly created Elastic Network Interface (ENI) is in the active (<code>Available</code>) state and can be attached immediately.</li>
     * <li>If <code>NetworkInterfaceId</code> is empty in the response, try to create the ENI again.</li>
     * <li>An ENI can be attached only to a single instance in a virtual private cloud (VPC).</li>
     * <li>When an ENI is reattached to another instance, its properties remain unchanged and network traffic is redirected to the new instance.</li>
     * <li>When you create an ENI, you can allocate up to 49 secondary private IP addresses by invoking this operation.</li>
     * <li>When you create an ENI, if you want to configure IPv6 addresses, make sure that IPv6 is enabled for the specified vSwitch. For more information, see <a href="https://help.aliyun.com/document_detail/98896.html">What is IPv6 Gateway?</a>.</li>
     * <li>The number of ENIs that can be created per account in a region is limited. You can view resource quotas in the ECS console. For more information, see <a href="https://help.aliyun.com/document_detail/184115.html">View and increase resource quotas</a>.</li>
     * </ul>
     * <h3>Request examples</h3>
     * <details>
     * <summary>Create an Elastic Network Interface (ENI)</summary>
     * ```
     * RegionId:  cn-hangzhou,   //Set the China (Hangzhou) region.
     * SecurityGroupId:  sg-bp10jztp6b0sdsyl****,   //Set the security group ID.
     * VSwitchId:  vsw-bp19wo63nleroq22g****,   //Set the vSwitch ID.
     * ```
     * </details>
     * <details>
     * <summary>Create an Elastic Network Interface (ENI) and specify a primary private IP address</summary>
     * ```
     * RegionId:  cn-hangzhou,   //China (Hangzhou) region.
     * SecurityGroupId:  sg-bp10jztp6b0sdsyl****,   //Security group ID.
     * VSwitchId:  vsw-bp19wo63nleroq22g****,   //vSwitch ID.
     * PrimaryIpAddress:  192.168.0.*,   //Primary private IP address.
     * ```
     * </details>
     * 
     * @param request the request parameters of CreateNetworkInterface  CreateNetworkInterfaceRequest
     * @return CreateNetworkInterfaceResponse
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

    /**
     * @param request the request parameters of CreateNetworkInterfacePermission  CreateNetworkInterfacePermissionRequest
     * @return CreateNetworkInterfacePermissionResponse
     */
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
     * @deprecated OpenAPI CreatePhysicalConnection is deprecated, please use Vpc::2016-04-28::CreatePhysicalConnection instead.  * @param request  the request parameters of CreatePhysicalConnection  CreatePhysicalConnectionRequest
     * @return CreatePhysicalConnectionResponse
     */
    @Deprecated
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
     * @param request the request parameters of CreatePlanMaintenanceWindow  CreatePlanMaintenanceWindowRequest
     * @return CreatePlanMaintenanceWindowResponse
     */
    @Override
    public CompletableFuture<CreatePlanMaintenanceWindowResponse> createPlanMaintenanceWindow(CreatePlanMaintenanceWindowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePlanMaintenanceWindow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePlanMaintenanceWindowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePlanMaintenanceWindowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreatePortRangeList  CreatePortRangeListRequest
     * @return CreatePortRangeListResponse
     */
    @Override
    public CompletableFuture<CreatePortRangeListResponse> createPortRangeList(CreatePortRangeListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePortRangeList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePortRangeListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePortRangeListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li>A prefix list is a collection of network prefixes (CIDR blocks) and can be referenced to configure network rules for other resources. For more information, see <a href="https://help.aliyun.com/document_detail/206223.html">Overview</a>.</li>
     * <li>When you create a prefix list, take note of the following items:<ul>
     * <li>You must specify an IP address family (IPv4 or IPv6) for the prefix list, and cannot change the IP address family after the prefix list is created. You cannot combine IPv4 and IPv6 CIDR blocks in a single prefix list.</li>
     * <li>You must specify the maximum number of entries that the prefix list can contain. You cannot modify the maximum number of entries after the prefix list is created.</li>
     * <li>You can specify entries for the prefix list. Each entry consists of a CIDR block and the description for the CIDR block. The total number of entries cannot exceed the maximum number of entries that you specified.</li>
     * </ul>
     * </li>
     * <li>For more information about the limits on prefix lists and other resources, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</li>
     * <li>You can create Resource Access Management (RAM) users and grant them minimum permissions. This eliminates the need to share the AccessKey pair of your Alibaba Cloud account with other users and reduces security risks for your enterprises. For information about how to grant permissions on prefix lists to RAM users, see <a href="https://help.aliyun.com/document_detail/206175.html">Grant a RAM user permissions on prefix lists</a></li>
     * </ul>
     * 
     * @param request the request parameters of CreatePrefixList  CreatePrefixListRequest
     * @return CreatePrefixListResponse
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
     * @deprecated OpenAPI CreateRouteEntry is deprecated, please use Vpc::2016-04-28::CreateRouteEntry instead.  * @param request  the request parameters of CreateRouteEntry  CreateRouteEntryRequest
     * @return CreateRouteEntryResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI CreateRouterInterface is deprecated, please use Vpc::2016-04-28::CreateRouterInterface instead.  * @param request  the request parameters of CreateRouterInterface  CreateRouterInterfaceRequest
     * @return CreateRouterInterfaceResponse
     */
    @Deprecated
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
     * @param request the request parameters of CreateSavingsPlan  CreateSavingsPlanRequest
     * @return CreateSavingsPlanResponse
     */
    @Override
    public CompletableFuture<CreateSavingsPlanResponse> createSavingsPlan(CreateSavingsPlanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSavingsPlan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSavingsPlanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSavingsPlanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>By default, the internal connectivity policy of a basic security group created by calling this operation is <strong>intra-group connectivity</strong>. You can call <a href="https://help.aliyun.com/document_detail/2679846.html">ModifySecurityGroupPolicy</a> to modify the policy.</li>
     * <li>By default, the internal connectivity policy of an advanced security group created by calling this operation is <strong>internal isolation</strong>, and the policy cannot be modified.</li>
     * <li>The number of security groups in a single region is limited. You can create a minimum of 100 security groups. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
     * <li>To create a security group of the Virtual Private Cloud (VPC) type, you must specify the VpcId parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSecurityGroup  CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
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
     * <b>description</b> :
     * <p>After you schedule a simulated event, you can view the scheduled simulated system event in the ECS console, by calling an <a href="https://help.aliyun.com/document_detail/63962.html">ECS API operation</a>, or by using monitoring.
     * The following table describes the lifecycle of a simulated system event:</p>
     * <ul>
     * <li>Scheduled: After you schedule a simulated system event, the event undergoes automatic switchover to the Scheduled state.</li>
     * <li>Executed: Without manual intervention, the simulated system event automatically switches to the Executed state at the specified point in time (NotBefore).</li>
     * <li>Canceled: After you call <a href="https://help.aliyun.com/document_detail/88808.html">CancelSimulatedSystemEvents</a> to cancel the simulated system event, the event switches to the Canceled state.         </li>
     * <li>Avoided: For a simulated system event of the SystemMaintenance.Reboot type, you can <a href="https://help.aliyun.com/document_detail/25502.html">restart the instance</a> before the specified point in time to switch the event to the Avoided state.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSimulatedSystemEvents  CreateSimulatedSystemEventsRequest
     * @return CreateSimulatedSystemEventsResponse
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
     * <b>description</b> :
     * <p>Local snapshots have been replaced by the snapshot instant access feature. The following describes the parameters:</p>
     * <ul>
     * <li>If you used local snapshots before December 14, 2020, you can use the Category parameter as expected.</li>
     * <li>If you did not use local snapshots before December 14, 2020, no additional configuration is required. New snapshots created for ESSD series disks (ESSD, ESSD AutoPL, ESSD Entry, and regional ESSD) are instantly available by default after creation, and both manual snapshots and automatic snapshots are supported. The three snapshot instant access-related parameters InstantAccess, InstantAccessRetentionDays, and DisableInstantAccess in API operations no longer take effect. A new response parameter Available is added to the <a href="https://help.aliyun.com/document_detail/25524.html">DescribeSnapshots</a> and <a href="https://help.aliyun.com/document_detail/210940.html">DescribeSnapshotGroups</a> API operations to describe the availability status of snapshots.
     * Before you begin:</li>
     * <li>Activate the snapshot feature. For more information, see <a href="https://help.aliyun.com/document_detail/108381.html">Activate snapshots</a>.</li>
     * <li>The disk must be in the <strong>In Use</strong> or <strong>Unattached</strong> state. Take note of the following items for different states:<ul>
     * <li>If the disk is in the <strong>In Use</strong> state, the instance must be in the <strong>Running</strong> or <strong>Stopped</strong> state.</li>
     * <li>If the disk is in the <strong>Unattached</strong> state, the disk must have been previously attached to an ECS instance. Snapshots cannot be created for disks that have never been attached to an ECS instance.</li>
     * <li>When a disk is used to create a dynamic extended volume or a RAID array, use a snapshot-consistent group and enable application-consistent snapshots to back up data. A snapshot-consistent group ensures the write order consistency and crash consistency of data across multiple disks in a business system. For more information, see <a href="https://help.aliyun.com/document_detail/199625.html">Create a snapshot-consistent group</a> and <a href="https://help.aliyun.com/document_detail/208589.html">Create an application-consistent snapshot</a>.
     * When you create a snapshot, take note of the following items:</li>
     * </ul>
     * </li>
     * <li>Avoid creating snapshots during peak business hours. When a snapshot is being created, the I/O performance of the disk decreases by up to 10%, and read and write performance may be temporarily degraded.</li>
     * <li>If a snapshot has not been created, the snapshot cannot be used to create a custom image (<a href="https://help.aliyun.com/document_detail/25535.html">CreateImage</a>).</li>
     * <li>Incremental data generated by disk operations during snapshot creation is not included in the backup to the snapshot.</li>
     * <li>If the disk is attached to an ECS instance, do not change the instance status, such as stopping or restarting the ECS instance, during snapshot creation. Otherwise, the snapshot creation will have failed.</li>
     * <li>A disk for which a snapshot is being created does not support scale-out. Wait until the snapshot is created before you execute the scale-out operation.</li>
     * <li>You can create snapshots for disks in the <strong>Expired</strong> (<code>Expired</code>) state. If the disk reaches its scheduled release time during snapshot creation, the disk is released and the snapshot in the <strong>Creating</strong> (<code>Creating</code>) state is also deleted.</li>
     * <li>After a snapshot is created, you are charged based on the snapshot size. Fees are calculated separately for each region. For more information, see <a href="https://help.aliyun.com/document_detail/56159.html">Snapshot billing</a>.</li>
     * <li>In the following scenarios, you cannot create a snapshot for the specified disk:<ul>
     * <li>The number of manual snapshots retained for the disk has reached the upper limit. For more information, see <a href="~~25412#SnapshotQuota1~~">Snapshot limits</a>.</li>
     * <li>Snapshot creation has concurrency limits. Exceeding the limits causes creation failures. For more information, see <a href="~~25412#SnapshotQuota1~~">Snapshot limits</a>.</li>
     * <li>When you query ECS instance information, if the returned data contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code>, all operations are prohibited.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateSnapshot  CreateSnapshotRequest
     * @return CreateSnapshotResponse
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
     * <b>description</b> :
     * <p>You can set <code>InstanceId</code> to create a snapshot-consistent group for specified disks in an instance. Alternatively, you can use only <code>DiskId.N</code> to create a snapshot-consistent group for multiple disks attached to multiple ECS instances in the same zone.</p>
     * <blockquote>
     * <p><code>DiskId.N</code> and <code>ExcludeDiskId.N</code> cannot be specified at the same time. If <code>InstanceId</code> is specified, <code>DiskId.N</code> can only be set to disks attached to the specified instance and no longer supports specifying disk IDs across multiple instances.
     * When you create a snapshot-consistent group, take note of the following items:</p>
     * </blockquote>
     * <ul>
     * <li>The disks for which you want to create snapshots must be in the <strong>In Use</strong> (<code>In_use</code>) or <strong>Unattached</strong> (<code>Available</code>) state.<ul>
     * <li>If a disk is in the <strong>In Use</strong> (<code>In_use</code>) state, the ECS instance status must be <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>).</li>
     * <li>If a disk is in the <strong>Unattached</strong> (<code>Available</code>) state, the disk must have been previously attached to an ECS instance. Disks that have never been attached to an ECS instance do not support snapshot creation.</li>
     * </ul>
     * </li>
     * <li>Snapshot-consistent groups support only ESSD series disks (ESSD, ESSD AutoPL, and ESSD Entry).</li>
     * <li>A single snapshot-consistent group can contain up to 128 disks (including system disks and data disks) with a total snapshot size of no more than 256 TiB.</li>
     * <li>User-created snapshots are retained until you delete them. Delete snapshots that are no longer needed on a regular basis to avoid ongoing snapshot storage fees.</li>
     * <li>Disks with the multi-attach attribute enabled do not support snapshot-consistent groups. If an instance has a disk with the multi-attach attribute enabled, set the <code>ExcludeDiskId.N</code> parameter to exclude the disk.
     * For more information about the features and billing of snapshot-consistent groups, see <a href="https://help.aliyun.com/document_detail/199625.html">Snapshot-consistent groups</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSnapshotGroup  CreateSnapshotGroupRequest
     * @return CreateSnapshotGroupResponse
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
     * @param request the request parameters of CreateStorageSet  CreateStorageSetRequest
     * @return CreateStorageSetResponse
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
     * @deprecated OpenAPI CreateVSwitch is deprecated, please use Vpc::2016-04-28::CreateVSwitch instead.  * @param request  the request parameters of CreateVSwitch  CreateVSwitchRequest
     * @return CreateVSwitchResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI CreateVirtualBorderRouter is deprecated, please use Vpc::2016-04-28::CreateVirtualBorderRouter instead.  * @param request  the request parameters of CreateVirtualBorderRouter  CreateVirtualBorderRouterRequest
     * @return CreateVirtualBorderRouterResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI CreateVpc is deprecated, please use Vpc::2016-04-28::CreateVpc instead.  * @param request  the request parameters of CreateVpc  CreateVpcRequest
     * @return CreateVpcResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <ul>
     * <li>To create a VSC, the instance type must support VSC, and VSC must be enabled on the instance.</li>
     * <li>Only one Primary VSC can be created on a single instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVsc  CreateVscRequest
     * @return CreateVscResponse
     */
    @Override
    public CompletableFuture<CreateVscResponse> createVsc(CreateVscRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVsc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVscResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVscResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DeactivateRouterInterface is deprecated, please use Vpc::2016-04-28::DeactivateRouterInterface instead.  * @param request  the request parameters of DeactivateRouterInterface  DeactivateRouterInterfaceRequest
     * @return DeactivateRouterInterfaceResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>The activation code must be unused, meaning that the number of managed instances registered with the activation code is 0.</p>
     * 
     * @param request the request parameters of DeleteActivation  DeleteActivationRequest
     * @return DeleteActivationResponse
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

    /**
     * @param request the request parameters of DeleteAutoProvisioningGroup  DeleteAutoProvisioningGroupRequest
     * @return DeleteAutoProvisioningGroupResponse
     */
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

    /**
     * @param request the request parameters of DeleteAutoSnapshotPolicy  DeleteAutoSnapshotPolicyRequest
     * @return DeleteAutoSnapshotPolicyResponse
     */
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
     * @param request the request parameters of DeleteBandwidthPackage  DeleteBandwidthPackageRequest
     * @return DeleteBandwidthPackageResponse
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
     * @param request the request parameters of DeleteCommand  DeleteCommandRequest
     * @return DeleteCommandResponse
     */
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

    /**
     * @param request the request parameters of DeleteDedicatedHostCluster  DeleteDedicatedHostClusterRequest
     * @return DeleteDedicatedHostClusterResponse
     */
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
     * <b>description</b> :
     * <p>Before you delete a deployment set, make sure that no instances exist in the deployment set. If instances exist, remove or release them before you delete the deployment set. For more information, see <a href="https://help.aliyun.com/document_detail/108407.html">Change the deployment set of an instance</a> and <a href="https://help.aliyun.com/document_detail/25442.html">Release an ECS instance</a>.</p>
     * 
     * @param request the request parameters of DeleteDeploymentSet  DeleteDeploymentSetRequest
     * @return DeleteDeploymentSetResponse
     */
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

    /**
     * @param request the request parameters of DeleteDiagnosticMetricSets  DeleteDiagnosticMetricSetsRequest
     * @return DeleteDiagnosticMetricSetsResponse
     */
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
     * <b>description</b> :
     * <p>Reports that are being generated cannot be deleted.</p>
     * 
     * @param request the request parameters of DeleteDiagnosticReports  DeleteDiagnosticReportsRequest
     * @return DeleteDiagnosticReportsResponse
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
     * <b>description</b> :
     * <p>When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>Manual snapshots of the disk are retained.</li>
     * <li>You can invoke <a href="https://help.aliyun.com/document_detail/25517.html">ModifyDiskAttribute</a> to configure whether to retain or release automatic snapshots together with the disk. Delete unnecessary snapshots promptly to maintain sufficient snapshot quota for periodic automatic snapshot policies.</li>
     * <li>The disk must be in the Pending Attach (Available) state when you release it.</li>
     * <li>If the disk with the specified ID does not exist, the request is ignored.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDisk  DeleteDiskRequest
     * @return DeleteDiskResponse
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
     * @deprecated OpenAPI DeleteForwardEntry is deprecated, please use Vpc::2016-04-28::DeleteForwardEntry instead.  * @param request  the request parameters of DeleteForwardEntry  DeleteForwardEntryRequest
     * @return DeleteForwardEntryResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DeleteHaVip is deprecated, please use Vpc::2016-04-28::DeleteHaVip instead.  * @param request  the request parameters of DeleteHaVip  DeleteHaVipRequest
     * @return DeleteHaVipResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of DeleteHpcCluster  DeleteHpcClusterRequest
     * @return DeleteHpcClusterResponse
     */
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

    /**
     * <b>description</b> :
     * <p>For information about scenarios in which you cannot delete a custom image and considerations after an image is deleted, see <a href="https://help.aliyun.com/document_detail/25466.html">Delete a custom image</a>.</p>
     * 
     * @param request the request parameters of DeleteImage  DeleteImageRequest
     * @return DeleteImageResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>Only custom image components that you have created can be deleted.</li>
     * <li>Before deleting a component, make sure that the component is not used in any template. Otherwise, the deletion fails.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteImageComponent  DeleteImageComponentRequest
     * @return DeleteImageComponentResponse
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
     * <b>description</b> :
     * <p>If a build task is running, you cannot directly delete the template. Wait until the build task reaches a desired state: SUCCESS, FAILED, TEST_FAILED, PARTITION_SUCCESS, or CANCELLED. You can call <a href="~~DescribeImagePipelineExecutions~~">DescribeImagePipelineExecutions</a> to query the details of build tasks.</p>
     * 
     * @param request the request parameters of DeleteImagePipeline  DeleteImagePipelineRequest
     * @return DeleteImagePipelineResponse
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
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: 
     * After an instance is released, all physical resources used by the instance are recycled. All related data is permanently lost and cannot be recovered.</p>
     * </blockquote>
     * <ul>
     * <li>Manual snapshots of disks are retained and continue to incur charges. You can delete them by calling <a href="https://help.aliyun.com/document_detail/2679824.html">DeleteSnapshot</a>.</li>
     * <li>Whether disks attached to the instance and automatic snapshots are released depends on the parameter settings specified during creation. Before releasing an instance, you can call <a href="https://help.aliyun.com/document_detail/2679767.html">DescribeDisks</a> and <a href="https://help.aliyun.com/document_detail/2679770.html">ModifyDiskAttribute</a> to query and modify the related parameter settings:<ul>
     * <li><code>DeleteWithInstance=false</code>: The disk is converted to a pay-as-you-go disk and retained. Otherwise, the disk is released along with the instance.</li>
     * <li><code>DeleteAutoSnapshot=false</code>: Automatic snapshots are retained. Otherwise, they are released along with the instance.</li>
     * </ul>
     * </li>
     * <li>Elastic IP addresses (EIPs) are not released along with the instance. You can call <a href="https://help.aliyun.com/document_detail/448702.html">ReleaseEipAddress</a> to release them.<blockquote>
     * <p>Notice: For security-locked instances, even if the <code>DeleteWithInstance</code> parameter of a disk is set to <code>false</code>, this attribute is ignored and the disk is released along with the instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstance  DeleteInstanceRequest
     * @return DeleteInstanceResponse
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
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: 
     * After an instance is released, all physical resources used by the instance are recycled. All related data is permanently lost and cannot be recovered.</p>
     * </blockquote>
     * <ul>
     * <li>Manual snapshots of disks are retained and continue to incur fees. You can call <a href="https://help.aliyun.com/document_detail/2679824.html">DeleteSnapshot</a> to delete them.</li>
     * <li>Whether disks and automatic snapshots attached to the instance are released depends on the parameter settings specified when they were created. Before releasing an instance, you can call <a href="https://help.aliyun.com/document_detail/2679767.html">DescribeDisks</a> and <a href="https://help.aliyun.com/document_detail/2679770.html">ModifyDiskAttribute</a> to query and modify the related parameter settings:<ul>
     * <li>If <code>DeleteWithInstance=false</code>, the disk is converted to a pay-as-you-go disk and retained. Otherwise, the disk is released along with the instance.</li>
     * <li>If <code>DeleteAutoSnapshot=false</code>, automatic snapshots are retained. Otherwise, they are released along with the instance.</li>
     * </ul>
     * </li>
     * <li>Elastic IP addresses (EIPs) are not released along with the instance. You can call <a href="https://help.aliyun.com/document_detail/448702.html">ReleaseEipAddress</a> to release them.<blockquote>
     * <p>Notice: For security-locked instances, even if the <code>DeleteWithInstance</code> parameter of a disk is set to <code>false</code>, this attribute is ignored and the disk is released along with the instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteInstances  DeleteInstancesRequest
     * @return DeleteInstancesResponse
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
     * <b>description</b> :
     * <p>After you delete an SSH key pair, take note of the following items:</p>
     * <ul>
     * <li>The SSH key pair cannot be queried by calling <a href="https://help.aliyun.com/document_detail/51773.html">DescribeKeyPairs</a>.  </li>
     * <li>If an ECS instance is bound to the SSH key pair, the SSH key pair cannot be deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteKeyPairs  DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
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

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>After you delete a launch template, ECS instances that were created by using the launch template are not affected.</li>
     * <li>After you delete a launch template, all versions of the template are also deleted and cannot be recovered. If you want to delete only a specific version of a launch template, see <a href="https://help.aliyun.com/document_detail/2679735.html">DeleteLaunchTemplateVersion</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteLaunchTemplate  DeleteLaunchTemplateRequest
     * @return DeleteLaunchTemplateResponse
     */
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

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The default version cannot be deleted. You must delete the entire launch template to delete the default version.</li>
     * <li>If the version you want to delete is the default version, call <a href="https://help.aliyun.com/document_detail/2679734.html">ModifyLaunchTemplateDefaultVersion</a> or switch the default version in the <strong>Launch Templates</strong> console before you perform the deletion.</li>
     * <li>Deleting a version does not affect instances that were already created by using that version.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteLaunchTemplateVersion  DeleteLaunchTemplateVersionRequest
     * @return DeleteLaunchTemplateVersionResponse
     */
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
     * @deprecated OpenAPI DeleteNatGateway is deprecated, please use Vpc::2016-04-28::DeleteNatGateway instead.  * @param request  the request parameters of DeleteNatGateway  DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The ENI must be in the Available state.</li>
     * <li>If the ENI is attached to an ECS instance, you must first detach it from the instance (<a href="https://help.aliyun.com/document_detail/58514.html">DetachNetworkInterface</a>) before you can delete the ENI.</li>
     * <li>After the ENI is deleted:<ul>
     * <li>All private addresses (including the primary private IP address and secondary private IP addresses) of the ENI are automatically released.</li>
     * <li>The deleted ENI is removed from all associated security groups.</li>
     * </ul>
     * </li>
     * <li>This is an asynchronous operation. After a successful call, you can check the ENI status or listen for network interface controller (NIC) operation events to determine the result. The ENI state machine is shown in the following figure:
     * <img src="https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/zh-CN/20221208/xual/DeleteNetworkInterface.jpg" alt=""><ul>
     * <li>The Deleting state indicates that the delete request was sent successfully and the ENI is being deleted.</li>
     * <li>If the ENI cannot be found, the ENI is deleted.</li>
     * <li>If the ENI remains in the Deleting state for an extended period of time, the deletion failed. In this case, you can send a new delete request for the ENI.
     * <strong>For details about sample code, see</strong> <a href="https://help.aliyun.com/document_detail/471553.html">Delete an ENI</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteNetworkInterface  DeleteNetworkInterfaceRequest
     * @return DeleteNetworkInterfaceResponse
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
     * @deprecated OpenAPI DeleteNetworkInterfacePermission is deprecated, please use Ecs::2014-05-26::DeleteNetworkInterface instead.  * @param request  the request parameters of DeleteNetworkInterfacePermission  DeleteNetworkInterfacePermissionRequest
     * @return DeleteNetworkInterfacePermissionResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DeletePhysicalConnection is deprecated, please use Vpc::2016-04-28::DeletePhysicalConnection instead.  * @param request  the request parameters of DeletePhysicalConnection  DeletePhysicalConnectionRequest
     * @return DeletePhysicalConnectionResponse
     */
    @Deprecated
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
     * @param request the request parameters of DeletePlanMaintenanceWindow  DeletePlanMaintenanceWindowRequest
     * @return DeletePlanMaintenanceWindowResponse
     */
    @Override
    public CompletableFuture<DeletePlanMaintenanceWindowResponse> deletePlanMaintenanceWindow(DeletePlanMaintenanceWindowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePlanMaintenanceWindow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePlanMaintenanceWindowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePlanMaintenanceWindowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeletePortRangeList  DeletePortRangeListRequest
     * @return DeletePortRangeListResponse
     */
    @Override
    public CompletableFuture<DeletePortRangeListResponse> deletePortRangeList(DeletePortRangeListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePortRangeList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePortRangeListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePortRangeListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>If a prefix list is associated with other resources, you cannot directly delete it. Dissociate the prefix list from the resources first, and then delete it. You can call <a href="https://help.aliyun.com/document_detail/204724.html">DescribePrefixListAssociations</a> to query the resources that are associated with a specified prefix list.</p>
     * 
     * @param request the request parameters of DeletePrefixList  DeletePrefixListRequest
     * @return DeletePrefixListResponse
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
     * @deprecated OpenAPI DeleteRouteEntry is deprecated, please use Vpc::2016-04-28::DeleteRouteEntry instead.  * @param request  the request parameters of DeleteRouteEntry  DeleteRouteEntryRequest
     * @return DeleteRouteEntryResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DeleteRouterInterface is deprecated, please use Vpc::2016-04-28::DeleteRouterInterface instead.  * @param request  the request parameters of DeleteRouterInterface  DeleteRouterInterfaceRequest
     * @return DeleteRouterInterfaceResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <ul>
     * <li>Make sure that no ECS instances exist in the security group. You can call <a href="https://help.aliyun.com/document_detail/2679689.html">DescribeInstances</a> to check.</li>
     * <li>Make sure that no Elastic Network Interfaces (ENIs) exist in the security group. You can call <a href="https://help.aliyun.com/document_detail/2679884.html">DescribeNetworkInterfaces</a> to check.</li>
     * <li>Make sure that no other security groups have authorization dependencies on this security group. You can call <a href="https://help.aliyun.com/document_detail/57320.html">DescribeSecurityGroupReferences</a> to check.</li>
     * <li>If the error code <code>InvalidOperation.DeletionProtection</code> is returned when you call this operation, the deletion protection feature is enabled for the security group. When you create an ACK cluster, deletion protection is automatically enabled for the associated security group to prevent accidental deletion. The deletion protection feature cannot be manually disabled. It is automatically disabled only after the associated ACK cluster is deleted. For more information, see <a href="https://help.aliyun.com/document_detail/353191.html">Disable deletion protection for a security group</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSecurityGroup  DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
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
     * <b>description</b> :
     * <p>When you invoke this operation, note the following items:</p>
     * <ul>
     * <li>If the specified snapshot ID does not exist, the request is ignored. </li>
     * <li>If the snapshot has been used to create a custom image, the snapshot cannot be deleted. You must first delete the custom image (<a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a>) before you can delete the snapshot.</li>
     * <li>If the snapshot has been used to create a cloud disk and the <code>Force</code> parameter is not set or is set to <code>Force=false</code>, the snapshot cannot be directly deleted. To force delete the snapshot, set <code>Force=true</code>. After the snapshot is force deleted, the corresponding cloud disk cannot be reinitialized.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSnapshot  DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
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
     * <b>description</b> :
     * <p>If disk snapshots in a snapshot-consistent group have been used to create custom images, the related disk snapshots are not deleted when the snapshot-consistent group is deleted. To delete the related disk snapshots, first delete the custom images (<a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a>), and then delete the related disk snapshots (<a href="https://help.aliyun.com/document_detail/25525.html">DeleteSnapshot</a>).</p>
     * 
     * @param request the request parameters of DeleteSnapshotGroup  DeleteSnapshotGroupRequest
     * @return DeleteSnapshotGroupResponse
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

    /**
     * @param request the request parameters of DeleteStorageSet  DeleteStorageSetRequest
     * @return DeleteStorageSetResponse
     */
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
     * @deprecated OpenAPI DeleteVSwitch is deprecated, please use Vpc::2016-04-28::DeleteVSwitch instead.  * @param request  the request parameters of DeleteVSwitch  DeleteVSwitchRequest
     * @return DeleteVSwitchResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DeleteVirtualBorderRouter is deprecated, please use Vpc::2016-04-28::DeleteVirtualBorderRouter instead.  * @param request  the request parameters of DeleteVirtualBorderRouter  DeleteVirtualBorderRouterRequest
     * @return DeleteVirtualBorderRouterResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DeleteVpc is deprecated, please use Vpc::2016-04-28::DeleteVpc instead.  * @param request  the request parameters of DeleteVpc  DeleteVpcRequest
     * @return DeleteVpcResponse
     */
    @Deprecated
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

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Disassociate the VSC from file systems such as Cloud Parallel File Storage (CPFS) before you delete the VSC.</li>
     * <li>When you call this operation to release a VSC, the instance operating system must respond. If the operating system does not respond, the VSC deletion fails and the VSC enters the DetachFailed state. Check whether the operating system is running properly, or stop the instance and try again.</li>
     * <li>When you release an instance, VSCs attached to the instance are released together with the instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVsc  DeleteVscRequest
     * @return DeleteVscResponse
     */
    @Override
    public CompletableFuture<DeleteVscResponse> deleteVsc(DeleteVscRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVsc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVscResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVscResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeregisterManagedInstance  DeregisterManagedInstanceRequest
     * @return DeregisterManagedInstanceResponse
     */
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
     * @deprecated OpenAPI DescribeAccessPoints is deprecated, please use Vpc::2016-04-28::DescribeAccessPoints instead.  * @param request  the request parameters of DescribeAccessPoints  DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;After you <a href="https://account.aliyun.com/register/register.htm">register</a> an Alibaba Cloud account, you can create a specific number of ECS resources in different Alibaba Cloud regions. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.
     * &lt;props=&quot;intl&quot;&gt;After you <a href="https://account.alibabacloud.com/register/intl_register.htm">register</a> an Alibaba Cloud account, you can create a specific number of ECS resources in different Alibaba Cloud regions. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.
     * You can also request a quota increase in the <a href="https://quotas.console.aliyun.com/products">Quota Center</a> based on your needs.</p>
     * 
     * @param request the request parameters of DescribeAccountAttributes  DescribeAccountAttributesRequest
     * @return DescribeAccountAttributesResponse
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can use one of the following methods to view the returned data:</p>
     * <ul>
     * <li>Method 1: When paged query the first page, set only <code>MaxResults</code> to limit the number of entries to return. The <code>NextToken</code> value in the response can be used to query subsequent pages. When paged query subsequent pages, set <code>NextToken</code> to the value obtained from the previous response and set <code>MaxResults</code> to limit the number of entries to return.</li>
     * <li>Method 2: Use <code>PageSize</code> to specify the number of entries per page and <code>PageNumber</code> to specify the page number. You can use only one of the two methods. If you set <code>MaxResults</code> or <code>NextToken</code>, the <code>PageSize</code> and <code>PageNumber</code> request parameters do not take effect, and <code>TotalCount</code> in the response is invalid.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeActivations  DescribeActivationsRequest
     * @return DescribeActivationsResponse
     */
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

    /**
     * @param request the request parameters of DescribeAutoProvisioningGroupHistory  DescribeAutoProvisioningGroupHistoryRequest
     * @return DescribeAutoProvisioningGroupHistoryResponse
     */
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

    /**
     * @param request the request parameters of DescribeAutoProvisioningGroupInstances  DescribeAutoProvisioningGroupInstancesRequest
     * @return DescribeAutoProvisioningGroupInstancesResponse
     */
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

    /**
     * @param request the request parameters of DescribeAutoProvisioningGroups  DescribeAutoProvisioningGroupsRequest
     * @return DescribeAutoProvisioningGroupsResponse
     */
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

    /**
     * @param request the request parameters of DescribeAutoSnapshotPolicyAssociations  DescribeAutoSnapshotPolicyAssociationsRequest
     * @return DescribeAutoSnapshotPolicyAssociationsResponse
     */
    @Override
    public CompletableFuture<DescribeAutoSnapshotPolicyAssociationsResponse> describeAutoSnapshotPolicyAssociations(DescribeAutoSnapshotPolicyAssociationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeAutoSnapshotPolicyAssociations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeAutoSnapshotPolicyAssociationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeAutoSnapshotPolicyAssociationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAutoSnapshotPolicyEx  DescribeAutoSnapshotPolicyExRequest
     * @return DescribeAutoSnapshotPolicyExResponse
     */
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
     * <b>description</b> :
     * <p>The DestinationResource parameter has different logic and requirements for its values. In the following ordered list, lower-order values require more parameters to be set, and you cannot use a lower-order value to filter higher-order resource categories.</p>
     * <ul>
     * <li>Value order: <code>Zone &gt; IoOptimized &gt; InstanceType = Network = ddh &gt; SystemDisk &gt; DataDisk</code></li>
     * <li>Value examples:<ul>
     * <li>If DestinationResource is set to <code>DataDisk</code>:<ul>
     * <li>If <code>ResourceType</code> is set to <code>disk</code>, the query retrieves data disk types that are not associated with ECS instance types, and the InstanceType parameter is not required.</li>
     * <li>If <code>ResourceType</code> is set to <code>instance</code>, the query retrieves data disk types that can be attached to ECS instances. Because instance types impose restrictions on data disks, you must specify both <code>InstanceType</code> and <code>DataDiskCategory</code>.</li>
     * </ul>
     * </li>
     * <li>If DestinationResource is set to <code>SystemDisk</code> and <code>ResourceType</code> is set to <code>instance</code>, you must specify the InstanceType parameter because ECS instance types impose restrictions on system disks.</li>
     * <li>If DestinationResource is set to <code>InstanceType</code>, specify the IoOptimized and InstanceType parameters.</li>
     * <li>Query the inventory of ecs.g5.large across all zones in a specified region: <code>RegionId=ap-southeast-1 &amp;DestinationResource=InstanceType &amp;IoOptimized=optimized &amp;InstanceType=ecs.g5.large</code>.</li>
     * <li>Query the list of zones that have ecs.g5.large in stock in a specified region: <code>RegionId=ap-southeast-1 &amp;DestinationResource=Zone &amp;IoOptimized=optimized &amp;InstanceType=ecs.g5.large</code>.<details>
     * <summary>Query the list of active zones that supply the ecs.g5.large instance type in the Singapore region.</summary></li>
     * </ul>
     * </li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;: &quot;ap-southeast-1&quot;,
     * &quot;DestinationResource&quot;: &quot;Zone&quot;，
     * &quot;InstanceType&quot;: &quot;ecs.g5.large&quot;
     * </code></pre>
     * </details>
     * <details>
     * <summary>Query the inventory of ecs.g5.large across all zones in the Singapore region.</summary>
     * ```
     * "RegionId": "ap-southeast-1",
     * "DestinationResource": "InstanceType"，
     * "InstanceType": "ecs.g5.large"
     * ```
     * </details>
     * <details>
     * <summary>[Purchase data disk only] Query the inventory of cloud_efficiency data disks in Zone B of the Singapore region.</summary>
     * ```
     * "RegionId": "ap-southeast-1",
     * "ZoneId": "ap-southeast-1b",
     * "ResourceType": "disk",
     * "DestinationResource": "DataDisk"
     * ```
     * </details>
     * <details>
     * <summary>[Purchase ECS instance and system disk] Query the inventory of ecs.g7.large instances with cloud_essd system disks in Zone B of the Singapore region.</summary>
     * ```
     * "RegionId": "ap-southeast-1",
     * "ZoneId": "ap-southeast-1b",
     * "ResourceType": "instance",
     * "InstanceType": "ecs.g7.large",
     * "DestinationResource": "SystemDisk",
     * "SystemDiskCategory": "cloud_essd"
     * ```
     * </details>
     * 
     * @param request the request parameters of DescribeAvailableResource  DescribeAvailableResourceRequest
     * @return DescribeAvailableResourceResponse
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

    /**
     * @param request the request parameters of DescribeBandwidthLimitation  DescribeBandwidthLimitationRequest
     * @return DescribeBandwidthLimitationResponse
     */
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
     * @param request the request parameters of DescribeBandwidthPackages  DescribeBandwidthPackagesRequest
     * @return DescribeBandwidthPackagesResponse
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

    /**
     * @param request the request parameters of DescribeCapacityReservationInstances  DescribeCapacityReservationInstancesRequest
     * @return DescribeCapacityReservationInstancesResponse
     */
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

    /**
     * @param request the request parameters of DescribeCapacityReservations  DescribeCapacityReservationsRequest
     * @return DescribeCapacityReservationsResponse
     */
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
     * <b>description</b> :
     * <p>When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>This operation supports only classic network type instances.</li>
     * <li>You can query up to 100 classic network type instances at a time.</li>
     * <li>The <code>VpcId</code> and <code>InstanceId</code> parameters cannot both be empty.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeClassicLinkInstances  DescribeClassicLinkInstancesRequest
     * @return DescribeClassicLinkInstancesResponse
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

    /**
     * @param request the request parameters of DescribeCloudAssistantSettings  DescribeCloudAssistantSettingsRequest
     * @return DescribeCloudAssistantSettingsResponse
     */
    @Override
    public CompletableFuture<DescribeCloudAssistantSettingsResponse> describeCloudAssistantSettings(DescribeCloudAssistantSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudAssistantSettings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudAssistantSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudAssistantSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Call this operation paged query the Cloud Assistant status of an instance. Run commands or send files only when CloudAssistantStatus is true, especially for newly created instances.</li>
     * <li>When you call this operation paged query the first page of results, set only <code>MaxResults</code> to limit the number of entries to return. The <code>NextToken</code> value returned in the response can be used paged query subsequent pages. When you query subsequent pages, set <code>NextToken</code> to the value returned in the previous response and set <code>MaxResults</code> to limit the number of entries to return.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCloudAssistantStatus  DescribeCloudAssistantStatusRequest
     * @return DescribeCloudAssistantStatusResponse
     */
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
     * @deprecated OpenAPI DescribeClusters is deprecated  * @param request  the request parameters of DescribeClusters  DescribeClustersRequest
     * @return DescribeClustersResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>If you specify only the <code>Action</code> and <code>RegionId</code> parameters without specifying other request parameters, all active commands (<code>CommandId</code>) that you manually created are queried by default.</li>
     * <li>When querying the first page of results with a paged query, set only <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response serves as the token for querying subsequent pages. When querying subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response as the query token, and set <code>MaxResults</code> to limit the number of entries returned.
     * Settings: When performing paging, use <code>NextToken</code> and <code>MaxResults</code> for optimal results.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeCommands  DescribeCommandsRequest
     * @return DescribeCommandsResponse
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

    /**
     * @param request the request parameters of DescribeDedicatedHostAutoRenew  DescribeDedicatedHostAutoRenewRequest
     * @return DescribeDedicatedHostAutoRenewResponse
     */
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>The request parameters act as filters. Filters have a logical AND relationship. If a parameter is empty, the filter does not take effect. However, if the value of <code>DedicatedHostClusterIds</code> is an empty JSON array (<code>[]</code>), the filter is considered valid and an empty result is returned.</p>
     * 
     * @param request the request parameters of DescribeDedicatedHostClusters  DescribeDedicatedHostClustersRequest
     * @return DescribeDedicatedHostClustersResponse
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

    /**
     * @param request the request parameters of DescribeDedicatedHostTypes  DescribeDedicatedHostTypesRequest
     * @return DescribeDedicatedHostTypesResponse
     */
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>You can query the details of one or more dedicated hosts by using one of the following methods:</p>
     * <ul>
     * <li>Specify DedicatedHostIds to query the details of dedicated hosts.</li>
     * <li>Specify DedicatedHostClusterId to query the details of dedicated hosts in a dedicated host cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDedicatedHosts  DescribeDedicatedHostsRequest
     * @return DescribeDedicatedHostsResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>For more information about instance families, see <a href="https://help.aliyun.com/document_detail/25378.html">Instance families</a>.</p>
     * 
     * @param request the request parameters of DescribeDeploymentSetSupportedInstanceTypeFamily  DescribeDeploymentSetSupportedInstanceTypeFamilyRequest
     * @return DescribeDeploymentSetSupportedInstanceTypeFamilyResponse
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

    /**
     * @param request the request parameters of DescribeDeploymentSets  DescribeDeploymentSetsRequest
     * @return DescribeDeploymentSetsResponse
     */
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

    /**
     * @param request the request parameters of DescribeDiagnosticMetricSets  DescribeDiagnosticMetricSetsRequest
     * @return DescribeDiagnosticMetricSetsResponse
     */
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

    /**
     * @param request the request parameters of DescribeDiagnosticMetrics  DescribeDiagnosticMetricsRequest
     * @return DescribeDiagnosticMetricsResponse
     */
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

    /**
     * @param request the request parameters of DescribeDiagnosticReportAttributes  DescribeDiagnosticReportAttributesRequest
     * @return DescribeDiagnosticReportAttributesResponse
     */
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

    /**
     * @param request the request parameters of DescribeDiagnosticReports  DescribeDiagnosticReportsRequest
     * @return DescribeDiagnosticReportsResponse
     */
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
     * @param request the request parameters of DescribeDiskDefaultKMSKeyId  DescribeDiskDefaultKMSKeyIdRequest
     * @return DescribeDiskDefaultKMSKeyIdResponse
     */
    @Override
    public CompletableFuture<DescribeDiskDefaultKMSKeyIdResponse> describeDiskDefaultKMSKeyId(DescribeDiskDefaultKMSKeyIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiskDefaultKMSKeyId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiskDefaultKMSKeyIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiskDefaultKMSKeyIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDiskEncryptionByDefaultStatus  DescribeDiskEncryptionByDefaultStatusRequest
     * @return DescribeDiskEncryptionByDefaultStatusResponse
     */
    @Override
    public CompletableFuture<DescribeDiskEncryptionByDefaultStatusResponse> describeDiskEncryptionByDefaultStatus(DescribeDiskEncryptionByDefaultStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDiskEncryptionByDefaultStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDiskEncryptionByDefaultStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDiskEncryptionByDefaultStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>You can query usage information only for basic disks in the In Use (<code>In_use</code>) state. For more information, see <a href="https://help.aliyun.com/document_detail/25689.html">Basic disk status</a>.<blockquote>
     * <p>If the returned information contains missing content, the usage information for that time period cannot be obtained because the basic disk was not in the In Use (<code>In_use</code>) state.</p>
     * </blockquote>
     * </li>
     * <li>A maximum of 400 data entries can be returned at a time. The condition <code>(EndTime – StartTime) / Period</code> must be less than or equal to 400. In other words, the response parameter <code>TotalCount</code> cannot exceed 400. Otherwise, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.  </li>
     * <li>You can query monitoring information only for the last 30 days. The specified <code>StartTime</code> parameter cannot be more than 30 days earlier than the current time.</li>
     * </ul>
     * <h2>Request example</h2>
     * <p>Assume that you want to query the usage information of the disk whose ID is <code>d-bp14emm68wx98vjk****</code> in the China (Hangzhou) region at 600-second intervals from <code>2025-02-17T00:00:00Z</code> to <code>2025-02-18T10:00:00Z</code>. Configure the request parameters as follows:</p>
     * <pre><code>RegionId:&quot;ap-southeast-1&quot;, //Set the region
     * DiskId:&quot;d-bp14emm68wx98vjk****&quot;, //Set the disk ID
     * StartTime:&quot;2025-02-15T00:00:00Z&quot;, //Set the query start time
     * EndTime:&quot;2025-02-17T00:00:00Z&quot;, //Set the query end time
     * Period:&quot;600&quot;, //Set the data granularity
     * </code></pre>
     * 
     * @param request the request parameters of DescribeDiskMonitorData  DescribeDiskMonitorDataRequest
     * @return DescribeDiskMonitorDataResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The request parameters RegionId, ZoneId, DiskIds, and InstanceId are filters. The parameters have AND relationships.</li>
     * <li>The DiskIds request parameter is a JSON format array. If DiskIds is not specified, the filter does not take effect. If DiskIds is set to an empty JSON array, the filter is considered valid and an empty result is returned.</li>
     * <li>Token-based paged query is supported. Set NextToken to the pagination token. The value is the NextToken value returned in the previous invoke of DescribeDisks. Then, use MaxResults to settings the maximum number of entries per page.</li>
     * <li>A disk with the multi-attach feature enabled can be attached to multiple instances. You can check the Attachment list in the response to view all attachment information of the disk.
     * When you invoke an API operation by using Cloud Assistant CLI, specify request parameters of different data types in the required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDisks  DescribeDisksRequest
     * @return DescribeDisksResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The full status information of a block storage device includes the block storage lifecycle status (<code>Status</code>), block storage health status (<code>HealthStatus</code>), and block storage event type (<code>EventType</code>).  </li>
     * <li>Because the publish time, scheduled execution time, and actual execution time of block storage-related events are the same, you can specify a time period (<code>EventTime.Start</code> to <code>EventTime.End</code>) to query all historical events that occurred during that period. You can query historical events from the last seven days at most.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeDisksFullStatus  DescribeDisksFullStatusRequest
     * @return DescribeDisksFullStatusResponse
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
     * @deprecated OpenAPI DescribeEipAddresses is deprecated, please use Vpc::2016-04-28::DescribeEipAddresses instead.  * @param request  the request parameters of DescribeEipAddresses  DescribeEipAddressesRequest
     * @return DescribeEipAddressesResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DescribeEipMonitorData is deprecated, please use Vpc::2016-04-28::DescribeEipMonitorData instead.  * @param request  the request parameters of DescribeEipMonitorData  DescribeEipMonitorDataRequest
     * @return DescribeEipMonitorDataResponse
     */
    @Deprecated
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
     * @param request the request parameters of DescribeElasticityAssuranceAutoRenewAttribute  DescribeElasticityAssuranceAutoRenewAttributeRequest
     * @return DescribeElasticityAssuranceAutoRenewAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeElasticityAssuranceAutoRenewAttributeResponse> describeElasticityAssuranceAutoRenewAttribute(DescribeElasticityAssuranceAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeElasticityAssuranceAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeElasticityAssuranceAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeElasticityAssuranceAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>After an elasticity assurance expires, the matching data between instances and the private pool associated with the elasticity assurance also becomes invalid. If you call this operation to query an expired elasticity assurance, an empty result is returned.</p>
     * 
     * @param request the request parameters of DescribeElasticityAssuranceInstances  DescribeElasticityAssuranceInstancesRequest
     * @return DescribeElasticityAssuranceInstancesResponse
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

    /**
     * @param request the request parameters of DescribeElasticityAssurances  DescribeElasticityAssurancesRequest
     * @return DescribeElasticityAssurancesResponse
     */
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>The traffic information that you can query about a secondary ENI includes the number of packets sent and received by the secondary ENI, the internal network inbound and outbound traffic, and the number of packets dropped by the secondary ENI. If some information is missing from the response, the system may have failed to obtain the corresponding information. For example, the information cannot be obtained when the instance is in the Stopped state or when the secondary ENI is not attached to an instance and is in the Available state. Take note of the following items when you call this operation: </p>
     * <ul>
     * <li>A maximum of 400 data entries can be returned at a time. Make sure that the value of <code>(EndTime–StartTime)/Period</code> is less than or equal to 400, which means the value of the response parameter <code>TotalCount</code> cannot exceed 400. Otherwise, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.  </li>
     * <li>You can query monitoring information only within the last 30 days. The value of <code>StartTime</code> cannot be more than 30 days before the current time.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeEniMonitorData  DescribeEniMonitorDataRequest
     * @return DescribeEniMonitorDataResponse
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
     * @deprecated OpenAPI DescribeForwardTableEntries is deprecated, please use Vpc::2016-04-28::DescribeForwardTableEntries instead.  * @param request  the request parameters of DescribeForwardTableEntries  DescribeForwardTableEntriesRequest
     * @return DescribeForwardTableEntriesResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DescribeHaVips is deprecated, please use Vpc::2016-04-28::DescribeHaVips instead.  * @param request  the request parameters of DescribeHaVips  DescribeHaVipsRequest
     * @return DescribeHaVipsResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of DescribeHpcClusters  DescribeHpcClustersRequest
     * @return DescribeHpcClustersResponse
     */
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
     * <b>description</b> :
     * <p>You can set <code>NextToken</code> to the value of <code>NextToken</code> returned in the previous call to DescribeImageComponents, and set <code>MaxResults</code> to specify the maximum number of entries per page.</p>
     * 
     * @param request the request parameters of DescribeImageComponents  DescribeImageComponentsRequest
     * @return DescribeImageComponentsResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>If no available images exist in the specified image family, the response is empty.</p>
     * 
     * @param request the request parameters of DescribeImageFromFamily  DescribeImageFromFamilyRequest
     * @return DescribeImageFromFamilyResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>The specified image template ID (ImagePipelineId) cannot be a deleted image template. Deleted image templates also delete the corresponding build tasks.</li>
     * <li>The image template ID (ImagePipelineId) and the build task ID (ExecutionId) cannot both be empty.</li>
     * <li>You can set NextToken to the value of NextToken returned in the previous call to DescribeImagePipelineExecutions, and set MaxResults to specify the maximum number of entries per page.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeImagePipelineExecutions  DescribeImagePipelineExecutionsRequest
     * @return DescribeImagePipelineExecutionsResponse
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

    /**
     * <b>description</b> :
     * <p>You can set <code>NextToken</code> to the value of <code>NextToken</code> returned by the previous call to <code>DescribeImagePipelines</code>, and set <code>MaxResults</code> to specify the maximum number of entries per page for the query.</p>
     * 
     * @param request the request parameters of DescribeImagePipelines  DescribeImagePipelinesRequest
     * @return DescribeImagePipelinesResponse
     */
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

    /**
     * @param request the request parameters of DescribeImageSharePermission  DescribeImageSharePermissionRequest
     * @return DescribeImageSharePermissionResponse
     */
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

    /**
     * @param request the request parameters of DescribeImageSupportInstanceTypes  DescribeImageSupportInstanceTypesRequest
     * @return DescribeImageSupportInstanceTypesResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>Image resources that you can query include your custom images, public images provided by Alibaba Cloud, Alibaba Cloud Marketplace images, and shared images that other Alibaba Cloud users have shared with you.</li>
     * <li>Paging is supported. The query results include the total number of available image resources and the image resources on the current page. The default number of entries per page is 10.</li>
     * <li>When you invoke an API operation by using Cloud Assistant CLI, request parameters of different data types must comply with format requirements. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">CLI parameter format</a>.</li>
     * <li>When you query images provided by Alibaba Cloud or shared images (ImageOwnerAlias is set to system or others), the RAM authorization rules can be ignored for this request. For more information, see <a href="https://help.aliyun.com/document_detail/25497.html">Authentication rules</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeImages  DescribeImagesRequest
     * @return DescribeImagesResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>A private pool is generated after an elasticity assurance or capacity reservation is created. The private pool is associated with information about instances that match the private pool. You can configure a private pool when you create an instance. The instance is then matched with an elasticity assurance or capacity reservation.
     * After a private pool expires, the matching association data between the instance and the private pool also becomes invalid. If you call this operation at that point, the private pool information in the response is empty.</p>
     * 
     * @param request the request parameters of DescribeInstanceAttachmentAttributes  DescribeInstanceAttachmentAttributesRequest
     * @return DescribeInstanceAttachmentAttributesResponse
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
     * @param request the request parameters of DescribeInstanceAttribute  DescribeInstanceAttributeRequest
     * @return DescribeInstanceAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li>Only subscription instances are supported. An error is returned if you call this operation for pay-as-you-go instances.</li>
     * <li>Before you configure auto-renewal or manual renewal, you can query the renewal status of instances to check whether auto-renewal is already enabled.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceAutoRenewAttribute  DescribeInstanceAutoRenewAttributeRequest
     * @return DescribeInstanceAutoRenewAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li>You can query completed historical system events from the last 30 days. There is no time limit for querying uncompleted system events.</li>
     * <li>If neither EventCycleStatus nor InstanceEventCycleStatus is specified, the query results include only system events in the Avoided, Executed, Canceled, and Failed states by default.</li>
     * <li>By specifying the InstanceEventCycleStatus parameter, you can also query system events in the Scheduled, Executing, and Inquiring states.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceHistoryEvents  DescribeInstanceHistoryEventsRequest
     * @return DescribeInstanceHistoryEventsResponse
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
     * <b>description</b> :
     * <p>Queries the configured maintenance policy, which includes two maintenance properties:</p>
     * <ul>
     * <li>Maintenance time window: A time window that you specify during which maintenance is performed.</li>
     * <li>Maintenance action: An instance downtime handling policy that you specify.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceMaintenanceAttributes  DescribeInstanceMaintenanceAttributesRequest
     * @return DescribeInstanceMaintenanceAttributesResponse
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
     * <b>description</b> :
     * <ul>
     * <li>Only supports querying the price information for upgrading unexpired subscription ECS instances. Querying the price information for downgrading instances is not supported.</li>
     * <li>Does not support querying the price information for changing the specifications of pay-as-you-go ECS instances. Because the price of a pay-as-you-go ECS instance after a specification change is the same as the price of a new instance, you can directly call <a href="https://help.aliyun.com/document_detail/107829.html">DescribePrice</a> to query the latest price of an ECS instance.</li>
     * <li>Before upgrading an instance, call <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> to query the instance types available for upgrade in a specified zone.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceModificationPrice  DescribeInstanceModificationPriceRequest
     * @return DescribeInstanceModificationPriceResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>A maximum of 400 data entries can be returned at a time. The condition <code>(EndTime – StartTime) / Period</code> must be less than or equal to 400, which means the response parameter <code>TotalCount</code> cannot exceed 400. Otherwise, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.  </li>
     * <li>You can query monitoring information only for the last 30 days. The <code>StartTime</code> parameter cannot be more than 30 days earlier than the current time.</li>
     * <li>When some content is missing from the returned information, the system may not have obtained the corresponding information. For example, the instance was in the Stopped state at that time.</li>
     * <li>This operation cannot retrieve basic CPU monitoring information for ECS Bare Metal instances. Install the CloudMonitor agent to obtain CPU monitoring information. For more information, see <a href="https://help.aliyun.com/document_detail/183482.html">Install the CloudMonitor agent</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceMonitorData  DescribeInstanceMonitorDataRequest
     * @return DescribeInstanceMonitorDataResponse
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you invoke this operation by using Cloud Assistant CLI, request parameters of different data types must follow format requirements. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</p>
     * 
     * @param request the request parameters of DescribeInstanceRamRole  DescribeInstanceRamRoleRequest
     * @return DescribeInstanceRamRoleResponse
     */
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
     * <b>description</b> :
     * <p>For more information about the lifecycle states of ECS instances, see <a href="https://help.aliyun.com/document_detail/25687.html">Instance states</a>. </p>
     * <h2>Request examples</h2>
     * <ul>
     * <li>Query instances and instance status information by <strong>specified region</strong>. Sample request parameters:</li>
     * </ul>
     * <pre><code>&quot;RegionID&quot;: &quot;ap-southeast-1&quot;
     * </code></pre>
     * <ul>
     * <li>Query instances and instance status information in a <strong>specific zone</strong> within a <strong>specified region</strong>. Sample request parameters:</li>
     * </ul>
     * <pre><code>&quot;RegionID&quot;: &quot;ap-southeast-1&quot;,
     * &quot;ZoneID&quot;: &quot;ap-southeast-1a&quot;
     * </code></pre>
     * <ul>
     * <li>Query the status information of instances by <strong>specified region</strong> and <strong>instance IDs</strong>. Sample request parameters:</li>
     * </ul>
     * <pre><code>&quot;RegionID&quot;: &quot;ap-southeast-1&quot;,
     * &quot;InstancesID&quot;: [&quot;i-bp1f7c1zqp999zvp****&quot;, &quot;i-bp1dqjv36biueg61****&quot;]
     * </code></pre>
     * 
     * @param request the request parameters of DescribeInstanceStatus  DescribeInstanceStatusRequest
     * @return DescribeInstanceStatusResponse
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
     * @param request the request parameters of DescribeInstanceTopology  DescribeInstanceTopologyRequest
     * @return DescribeInstanceTopologyResponse
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

    /**
     * @param request the request parameters of DescribeInstanceTypeFamilies  DescribeInstanceTypeFamiliesRequest
     * @return DescribeInstanceTypeFamiliesResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li><strong>Paged query</strong>: You can set the MaxResults parameter to limit the number of instance type entries returned. If only some of the queried instance type entries are returned, the NextToken parameter value is returned in synchronization. Invoke this operation again with the NextToken parameter value returned from the previous call and the MaxResults parameter to implement paging for instance type information.</li>
     * <li>If you do not specify the NextToken parameter for paginated queries when calling this API operation, only the first page of data (up to 100 entries) is returned by default. To obtain more data, specify the NextToken parameter for paginated queries or specify filter conditions to limit the range of returned data.<blockquote>
     * <p> The maximum value of the MaxResults (maximum number of entries per page) parameter is 100. For users who called this API operation in 2022, the maximum value of the MaxResults parameter remains 1600. On and after November 15, 2023, the maximum value of the MaxResults parameter is reduced to 100 for all users, and 1600 is no longer supported.</p>
     * </blockquote>
     * </li>
     * <li>DescribeInstanceTypes only queries the configuration and performance information of instance types. To query the instance types available for purchase in a specific region, use <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a>.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>If you need to use instance types that are not publicly available or have special specification requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>If you need to use instance types that are not publicly available or have special specification requirements, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstanceTypes  DescribeInstanceTypesRequest
     * @return DescribeInstanceTypesResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The returned VNC logon URL (VncUrl) cannot be used directly. You can access the instance by using the <strong>management terminal URL</strong>.<blockquote>
     * <p>To construct the management terminal URL, append <code>vncUrl=\\*\\*\\*\\*</code>, <code>instanceId=****</code>, and <code>isWindows=true/false</code> to the end of <code>https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?</code>. Separate the parameters with <code>&amp;</code>. Parameters:</p>
     * <ul>
     * <li><code>vncUrl</code>: the VNC logon URL.</li>
     * <li><code>instanceId</code>: the instance ID.</li>
     * <li><code>isWindows</code>: specifies whether the operating system of the instance is Windows. A value of <code>true</code> indicates Windows. A value of <code>false</code> indicates a non-Windows operating system.</li>
     * <li>Passwordless VNC connections are now supported. You do not need to set the <code>password</code> parameter.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li>The KeepAlive time of a single management terminal URL is 300 seconds. If no interaction occurs within 300 seconds, the connection is automatically closed.</li>
     * <li>If the connection is interrupted, call this operation again to obtain a new <code>VncUrl</code> and construct a new management terminal URL to reconnect. You can reconnect up to 30 times per minute.
     * Example management terminal URL:</li>
     * </ul>
     * <pre><code>https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=ws%3A%2F%****&amp;instanceId=i-wz9hhwq5a6tm****&amp;isWindows=true
     * </code></pre>
     * 
     * @param request the request parameters of DescribeInstanceVncUrl  DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
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
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>When you invoke an API operation by using Cloud Assistant CLI, request parameters of different data types must comply with format requirements. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <ul>
     * <li>Send a dry run request by using the DryRun request parameter to check the validity of parameters and authorization.</li>
     * <li>When performing a paging query for the first page of results, set only <code>MaxResults</code> to limit the number of entries to return. The <code>NextToken</code> value in the response is used as the credential to query subsequent pages. When performing a paging query for subsequent pages, set <code>NextToken</code> to the <code>NextToken</code> value obtained from the previous response as the query credential, and set <code>MaxResults</code> to limit the number of entries to return.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInstances  DescribeInstancesRequest
     * @return DescribeInstancesResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>The response includes the instance status and instance system events in the Scheduled state.
     * If you specify a time range, events are filtered based on the time range.</p>
     * 
     * @param request the request parameters of DescribeInstancesFullStatus  DescribeInstancesFullStatusRequest
     * @return DescribeInstancesFullStatusResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>After you run a command, the command is not necessarily executed successfully or produces the expected results. You must call this operation to check the actual execution results based on the actual output.</li>
     * <li>You can query execution information from the last 30 days. A maximum of 10,000 entries of execution information can be retained.</li>
     * <li>You can use <a href="https://help.aliyun.com/document_detail/2669130.html">Cloud Assistant task status event subscription</a> to obtain task results through events, which avoids frequent polling and improves efficiency.</li>
     * <li>When paged query the first page of results, you need only to set <code>MaxResults</code> to limit the number of entries to return. The <code>NextToken</code> value in the response is used as the credential for querying subsequent pages. When paged query subsequent pages, set <code>NextToken</code> to the value obtained from the previous response and set <code>MaxResults</code> to limit the number of entries to return.</li>
     * <li>Differences between <code>DescribeInvocations</code> and <code>DescribeInvocationResults</code>:<ul>
     * <li>When a single <code>RunCommand</code>/<code>InvokeCommand</code> call specifies multiple instances:<ul>
     * <li><code>DescribeInvocations</code> returns the execution status on each instance and the aggregated status across multiple instances.</li>
     * <li><code>DescribeInvocationResults</code> returns only the individual execution status on each instance, without the aggregated status across multiple instances.</li>
     * </ul>
     * </li>
     * <li>When a single <code>RunCommand</code>/<code>InvokeCommand</code> call specifies one instance:<ul>
     * <li><code>DescribeInvocations</code> and <code>DescribeInvocationResults</code> are largely interchangeable.</li>
     * </ul>
     * </li>
     * <li>When you need to view the execution history of scheduled (periodic) tasks or tasks that run on each system startup (<code>RepeatMode=Period, EveryReboot</code>), only <code>DescribeInvocationResults</code> can return the historical execution records (you must specify <code>IncludeHistory=true</code>). <code>DescribeInvocations</code> returns only the latest task status.</li>
     * <li>When you need to view the command content or parameters, only <code>DescribeInvocations</code> returns <code>CommandContent</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInvocationResults  DescribeInvocationResultsRequest
     * @return DescribeInvocationResultsResponse
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
     * <b>description</b> :
     * <ul>
     * <li>After you run a command, it does not necessarily run successfully or produce the expected results. You need to check the actual execution results by viewing the return values of this operation. The actual output takes precedence.</li>
     * <li>You can query execution information from the last 30 days. A maximum of 10,000 execution records are retained.</li>
     * <li>You can subscribe to <a href="https://help.aliyun.com/document_detail/2669130.html">Cloud Assistant task status events</a> to obtain task results through events, which avoids frequent polling and improves efficiency.</li>
     * <li>When querying the first page of a paging query, set only <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response, and set <code>MaxResults</code> to limit the number of entries returned.</li>
     * <li>Differences between <code>DescribeInvocations</code> and <code>DescribeInvocationResults</code>:<ul>
     * <li>When a single <code>RunCommand</code>/<code>InvokeCommand</code> call specifies multiple instances:<ul>
     * <li><code>DescribeInvocations</code> returns the execution status on each instance and the aggregation status across multiple instances.</li>
     * <li><code>DescribeInvocationResults</code> returns only the individual execution status on each instance, without the aggregation status across multiple instances.</li>
     * </ul>
     * </li>
     * <li>When a single <code>RunCommand</code>/<code>InvokeCommand</code> call specifies one instance:<ul>
     * <li>There is little difference between <code>DescribeInvocations</code> and <code>DescribeInvocationResults</code>, and they can replace each other.</li>
     * </ul>
     * </li>
     * <li>When you need to view the execution details of each run for scheduled (periodic) tasks or tasks that execute automatically on instance startup (<code>RepeatMode=Period, EveryReboot</code>), only <code>DescribeInvocationResults</code> can return the historical execution records (you must specify <code>IncludeHistory=true</code>). <code>DescribeInvocations</code> returns only the latest task status.</li>
     * <li>When you need to view the command content and parameters, only <code>DescribeInvocations</code> returns <code>CommandContent</code>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeInvocations  DescribeInvocationsRequest
     * @return DescribeInvocationsResponse
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

    /**
     * @param request the request parameters of DescribeKeyPairs  DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     */
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

    /**
     * @param request the request parameters of DescribeLaunchTemplateVersions  DescribeLaunchTemplateVersionsRequest
     * @return DescribeLaunchTemplateVersionsResponse
     */
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

    /**
     * @param request the request parameters of DescribeLaunchTemplates  DescribeLaunchTemplatesRequest
     * @return DescribeLaunchTemplatesResponse
     */
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
     * @deprecated OpenAPI DescribeLimitation is deprecated  * @param request  the request parameters of DescribeLimitation  DescribeLimitationRequest
     * @return DescribeLimitationResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of DescribeLockedSnapshots  DescribeLockedSnapshotsRequest
     * @return DescribeLockedSnapshotsResponse
     */
    @Override
    public CompletableFuture<DescribeLockedSnapshotsResponse> describeLockedSnapshots(DescribeLockedSnapshotsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeLockedSnapshots").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeLockedSnapshotsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeLockedSnapshotsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When performing a paging query for the first page, set only <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response as the query credential, and set <code>MaxResults</code> to limit the number of entries returned.</p>
     * 
     * @param request the request parameters of DescribeManagedInstances  DescribeManagedInstancesRequest
     * @return DescribeManagedInstancesResponse
     */
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
     * @deprecated OpenAPI DescribeNatGateways is deprecated, please use Vpc::2016-04-28::DescribeNatGateways instead.  * @param request  the request parameters of DescribeNatGateways  DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of DescribeNetworkInterfaceAttribute  DescribeNetworkInterfaceAttributeRequest
     * @return DescribeNetworkInterfaceAttributeResponse
     */
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

    /**
     * @param request the request parameters of DescribeNetworkInterfacePermissions  DescribeNetworkInterfacePermissionsRequest
     * @return DescribeNetworkInterfacePermissionsResponse
     */
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>The <code>DescribeNetworkInterfaces</code> operation supports pagination by specifying the <code>MaxResults</code> or <code>NextToken</code> parameter. Usage notes:</p>
     * <ul>
     * <li>When paged query the first page, set only <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response is used as the credential to query subsequent pages.</li>
     * <li>When paged query subsequent pages, set <code>NextToken</code> to the <code>NextToken</code> value obtained from the previous response, and set <code>MaxResults</code> to limit the number of entries returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeNetworkInterfaces  DescribeNetworkInterfacesRequest
     * @return DescribeNetworkInterfacesResponse
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
     * @deprecated OpenAPI DescribeNewProjectEipMonitorData is deprecated, please use Vpc::2016-04-28::DescribeEipMonitorData instead.  * @param request  the request parameters of DescribeNewProjectEipMonitorData  DescribeNewProjectEipMonitorDataRequest
     * @return DescribeNewProjectEipMonitorDataResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DescribePhysicalConnections is deprecated, please use Vpc::2016-04-28::DescribePhysicalConnections instead.  * @param request  the request parameters of DescribePhysicalConnections  DescribePhysicalConnectionsRequest
     * @return DescribePhysicalConnectionsResponse
     */
    @Deprecated
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

    /**
     * <b>description</b> :
     * <p>Queries configured maintenance policies. Each policy contains two maintenance attributes:</p>
     * <ul>
     * <li>Maintenance time window: A time period you specify during which O&amp;M operations are performed.</li>
     * <li>Maintenance action: The instance downtime handling policy you specify.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePlanMaintenanceWindows  DescribePlanMaintenanceWindowsRequest
     * @return DescribePlanMaintenanceWindowsResponse
     */
    @Override
    public CompletableFuture<DescribePlanMaintenanceWindowsResponse> describePlanMaintenanceWindows(DescribePlanMaintenanceWindowsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePlanMaintenanceWindows").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePlanMaintenanceWindowsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePlanMaintenanceWindowsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePortRangeListAssociations  DescribePortRangeListAssociationsRequest
     * @return DescribePortRangeListAssociationsResponse
     */
    @Override
    public CompletableFuture<DescribePortRangeListAssociationsResponse> describePortRangeListAssociations(DescribePortRangeListAssociationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePortRangeListAssociations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePortRangeListAssociationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePortRangeListAssociationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePortRangeListEntries  DescribePortRangeListEntriesRequest
     * @return DescribePortRangeListEntriesResponse
     */
    @Override
    public CompletableFuture<DescribePortRangeListEntriesResponse> describePortRangeListEntries(DescribePortRangeListEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePortRangeListEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePortRangeListEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePortRangeListEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePortRangeLists  DescribePortRangeListsRequest
     * @return DescribePortRangeListsResponse
     */
    @Override
    public CompletableFuture<DescribePortRangeListsResponse> describePortRangeLists(DescribePortRangeListsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePortRangeLists").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePortRangeListsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePortRangeListsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribePrefixListAssociations  DescribePrefixListAssociationsRequest
     * @return DescribePrefixListAssociationsResponse
     */
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

    /**
     * @param request the request parameters of DescribePrefixListAttributes  DescribePrefixListAttributesRequest
     * @return DescribePrefixListAttributesResponse
     */
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
     * <b>description</b> :
     * <p>The request parameters <code>AddressFamily</code>, <code>PrefixListId.N</code>, and <code>PrefixListName</code> act as filters and have a logical AND relationship. If a parameter is empty, the corresponding filter does not take effect.</p>
     * 
     * @param request the request parameters of DescribePrefixLists  DescribePrefixListsRequest
     * @return DescribePrefixListsResponse
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
     * <b>description</b> :
     * <p>The parameter settings vary based on the type of resource whose price you want to query:</p>
     * <ul>
     * <li>If <code>ResourceType=instance</code>, you must also specify the <code>InstanceType</code> parameter.
     * By default, the price of the pay-as-you-go (<code>PostPaid</code>) billing method (<code>ChargeType</code>) is queried. You can specify the <code>PriceUnit</code> parameter to perform a parameter query for Elastic Compute Service (ECS) prices across different billing cycles.</li>
     * <li>If <code>ResourceType=disk</code>, you must also specify the <code>DataDisk.1.Category</code> and <code>DataDisk.1.Size</code> parameters. When you query the price of a <code>disk</code> resource, only the pay-as-you-go price of the disk is returned. This means that the <code>PriceUnit</code> parameter can only be set to <code>Hour</code>.</li>
     * <li>If <code>ResourceType=diskperformance</code>, you must also specify the <code>DataDisk.1.Category</code> and <code>DataDisk.1.ProvisionedIops</code> parameters.</li>
     * <li>If <code>ResourceType=ddh</code>, you must also specify the <code>DedicatedHostType</code> parameter.</li>
     * <li>If <code>ResourceType=ElasticityAssurance</code>, you must also specify the <code>InstanceType</code> parameter.</li>
     * <li>If <code>ResourceType=CapacityReservation</code>, you must also specify the <code>InstanceType</code> parameter.</li>
     * <li>If <code>ResourceType=bandwidth</code>, only the pay-by-traffic (<code>PayByTraffic</code>) price is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribePrice  DescribePriceRequest
     * @return DescribePriceResponse
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

    /**
     * @param request the request parameters of DescribeRecommendInstanceType  DescribeRecommendInstanceTypeRequest
     * @return DescribeRecommendInstanceTypeResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>Only the price for renewing a subscription ECS instance for a specified duration or the price for renewing an instance to a unified expiration date is supported.</li>
     * <li>Precautions for parameter settings:<ul>
     * <li>If only the required parameters are set, the price for renewing the instance for one month is queried by default.</li>
     * <li>You cannot query the renewal duration price and the renewal-to-unified-expiration-date price at the same time. The renewal duration parameters (<code>Period</code> and <code>PeriodUnit</code>) and the unified expiration date parameter (<code>ExpectedRenewDay</code>) cannot be set at the same time.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeRenewalPrice  DescribeRenewalPriceRequest
     * @return DescribeRenewalPriceResponse
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

    /**
     * @param request the request parameters of DescribeReservedInstanceAutoRenewAttribute  DescribeReservedInstanceAutoRenewAttributeRequest
     * @return DescribeReservedInstanceAutoRenewAttributeResponse
     */
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

    /**
     * <b>description</b> :
     * <h3>Scenarios</h3>
     * <ul>
     * <li>Query all reserved instances in a specified region.</li>
     * <li>Query the details of a reserved instance by its ID or name.</li>
     * <li>Filter purchased reserved instances by instance type or instance family.</li>
     * <li>Filter purchased reserved instances by scope or status.</li>
     * </ul>
     * <h3>Request examples</h3>
     * <details>
     * <summary>Example: Query all purchased reserved instances in the Singapore region</summary>
     * ```
     * "Region":"ap-southeast-1" //Set the region to Singapore
     * ```
     * </details>
     * <details>
     * <summary>Example: Query the details of the reserved instance with the ID ecsri-bp129enntoynwwj5**** in the Singapore region</summary>
     * ```
     * "Region":"ap-southeast-1", //Set the region to Singapore
     * "ReservedInstanceId":"ecsri-bp129enntoynwwj5****" //Set the reserved instance ID
     * ```
     * </details>
     * <details>
     * <summary>Example: Query reserved instances that can be applied to the ecs.c5.2xlarge instance type in the Singapore region</summary>
     * ```
     * "Region":"ap-southeast-1", //Set the region to Singapore
     * "InstanceType":"ecs.c5.2xlarge" //Set the instance type
     * ```
     * </details>
     * <details>
     * <summary>Example: Query active region-level reserved instances in the Singapore region</summary>
     * ```
     * "Region":"ap-southeast-1", //Set the region to Singapore
     * "Scope":"Region", //Set the reserved instance scope
     * "Status":["Active"] //Set the status to Active
     * ```
     * </details>
     * 
     * @param request the request parameters of DescribeReservedInstances  DescribeReservedInstancesRequest
     * @return DescribeReservedInstancesResponse
     */
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

    /**
     * @deprecated OpenAPI DescribeResourceByTags is deprecated, please use Tag::2018-08-28::ListResourcesByTag instead.  * @param request  the request parameters of DescribeResourceByTags  DescribeResourceByTagsRequest
     * @return DescribeResourceByTagsResponse
     */
    @Deprecated
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

    /**
     * <b>description</b> :
     * <p>The following examples describe common scenarios:</p>
     * <h3>Example 1: Query instance types supported for specification change</h3>
     * <p>Query the instance types to which instance i-bp67acfmxazb4p**** can be changed, and the inventory of the corresponding instance types in the zone where the instance resides.</p>
     * <pre><code>http(s)://ecs.aliyuncs.com/?Action=DescribeResourcesModification
     * &amp;RegionId=ap-southeast-1
     * &amp;ResourceId=i-bp67acfmxazb4p****
     * &amp;DestinationResource=InstanceType
     * &amp;OperationType=Upgrade
     * &amp;Common request parameters
     * </code></pre>
     * <h3>Example 2: Query instance types supported after changing the disk type</h3>
     * <p>Query the instance types to which instance i-bp67acfmxazb4p**** can be changed after the disk type is changed, and the inventory of the corresponding instance types in the zone where the instance resides.</p>
     * <pre><code>http(s)://ecs.aliyuncs.com/?Action=DescribeResourcesModification
     * &amp;RegionId=ap-southeast-1
     * &amp;ResourceId=i-bp67acfmxazb4p****
     * &amp;DestinationResource=InstanceType
     * &amp;OperationType=Upgrade
     * &amp;Conditions.0=DiskCategory
     * &amp;Common request parameters
     * </code></pre>
     * <h3>Example 3: Query the disk type required by the target instance type</h3>
     * <p>Query the disk type required by the target instance type (for example, ecs.g7.large). This means that instance i-bp67acfmxazb4p**** must change to this disk type before it can be changed to the target instance type. Also query the inventory of the disk type in the zone where the instance resides.</p>
     * <blockquote>
     * <p>The target instance type must be obtained by using Example 2.</p>
     * </blockquote>
     * <pre><code>http(s)://ecs.aliyuncs.com/?Action=DescribeResourcesModification
     * &amp;RegionId=ap-southeast-1
     * &amp;ResourceId=i-bp67acfmxazb4p****
     * &amp;DestinationResource=SystemDisk
     * &amp;OperationType=Upgrade
     * &amp;InstanceType=ecs.g7.large
     * &amp;Common request parameters
     * </code></pre>
     * 
     * @param request the request parameters of DescribeResourcesModification  DescribeResourcesModificationRequest
     * @return DescribeResourcesModificationResponse
     */
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
     * @deprecated OpenAPI DescribeRouteTables is deprecated, please use Vpc::2016-04-28::DescribeRouteTableList instead.  * @param request  the request parameters of DescribeRouteTables  DescribeRouteTablesRequest
     * @return DescribeRouteTablesResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DescribeRouterInterfaces is deprecated, please use Vpc::2016-04-28::DescribeRouterInterfaces instead.  * @param request  the request parameters of DescribeRouterInterfaces  DescribeRouterInterfacesRequest
     * @return DescribeRouterInterfacesResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of DescribeSavingsPlanEstimation  DescribeSavingsPlanEstimationRequest
     * @return DescribeSavingsPlanEstimationResponse
     */
    @Override
    public CompletableFuture<DescribeSavingsPlanEstimationResponse> describeSavingsPlanEstimation(DescribeSavingsPlanEstimationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSavingsPlanEstimation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSavingsPlanEstimationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSavingsPlanEstimationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSavingsPlanPrice  DescribeSavingsPlanPriceRequest
     * @return DescribeSavingsPlanPriceResponse
     */
    @Override
    public CompletableFuture<DescribeSavingsPlanPriceResponse> describeSavingsPlanPrice(DescribeSavingsPlanPriceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSavingsPlanPrice").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSavingsPlanPriceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSavingsPlanPriceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSecurityGroupAttribute  DescribeSecurityGroupAttributeRequest
     * @return DescribeSecurityGroupAttributeResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>If you cannot delete a security group (<a href="https://help.aliyun.com/document_detail/25558.html">DeleteSecurityGroup</a>), you can call this operation to check whether the specified security group has been authorized by other security groups. If the specified security group has been authorized, you can call <a href="https://help.aliyun.com/document_detail/2679855.html">RevokeSecurityGroup</a> and <a href="https://help.aliyun.com/document_detail/2679856.html">RevokeSecurityGroupEgress</a> to delete the corresponding security group rules to revoke the authorization.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityGroupReferences  DescribeSecurityGroupReferencesRequest
     * @return DescribeSecurityGroupReferencesResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>Paged query</strong>: Use <code>MaxResults</code> and <code>NextToken</code> for paging.<ul>
     * <li>If the response does not contain <code>NextToken</code>, the current page is the last page.</li>
     * <li>For the first page, set only <code>MaxResults</code> to limit the number of entries returned. The <code>NextToken</code> value in the response serves as the token for querying subsequent pages.</li>
     * <li>For subsequent pages, set <code>NextToken</code> to the value obtained from the previous response and set <code>MaxResults</code> to limit the number of entries returned.</li>
     * </ul>
     * </li>
     * <li>When you invoke this operation by using Cloud Assistant CLI, specify request parameters in their required formats. For more information, see <a href="https://help.aliyun.com/document_detail/110340.html">Parameter format overview</a>.<blockquote>
     * <p>Settings for request parameters of different data types must follow specific format requirements when calling the API through Alibaba Cloud CLI.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSecurityGroups  DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
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
     * <b>description</b> :
     * <h2>Operation description:</h2>
     * <ul>
     * <li>After you send a file, the file is not necessarily sent successfully. You must check the actual sending result based on the return value of this operation.</li>
     * <li>You can query execution information from the last day. A maximum of 1,000 entries of execution information can be retained.</li>
     * <li>When paged query the first page of results, set only MaxResults to limit the number of entries to return. The NextToken value returned in the result serves as the token for querying subsequent pages. When paged query subsequent pages, set NextToken to the value obtained from the previous response and set MaxResults to limit the number of entries to return.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSendFileResults  DescribeSendFileResultsRequest
     * @return DescribeSendFileResultsResponse
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
     * <b>description</b> :
     * <p>InstanceId, SnapshotGroupId.N, and Status.N are not required request parameters, but you can use them to build filter logic. The parameters have a logical AND relationship.</p>
     * 
     * @param request the request parameters of DescribeSnapshotGroups  DescribeSnapshotGroupsRequest
     * @return DescribeSnapshotGroupsResponse
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The request parameters RegionId, DiskIds, and InstanceId act as filters. These parameters have a logical AND relationship.  </li>
     * <li>If you do not specify any parameters, the filters do not take effect. If DiskIds and SnapshotLinkIds are both empty arrays, the filters are considered valid, but an empty result set is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSnapshotLinks  DescribeSnapshotLinksRequest
     * @return DescribeSnapshotLinksResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>A maximum of 400 data entries can be returned at a time. Make sure that the value of <code>(EndTime–StartTime)/Period</code> is less than or equal to 400. In other words, the response parameter <code>TotalCount</code> cannot exceed 400. Otherwise, the <code>InvalidParameter.TooManyDataQueried</code> error is returned.  </li>
     * <li>You can query monitoring data only within the last 30 days. The <code>StartTime</code> parameter cannot be more than 30 days earlier than the current time.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSnapshotMonitorData  DescribeSnapshotMonitorDataRequest
     * @return DescribeSnapshotMonitorDataResponse
     */
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

    /**
     * @param request the request parameters of DescribeSnapshotPackage  DescribeSnapshotPackageRequest
     * @return DescribeSnapshotPackageResponse
     */
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
     * <b>description</b> :
     * <p>InstanceId, DiskId, and SnapshotIds are not required request parameters, but you can use them to build filter logic. These parameters have a logical AND relationship.
     * When you invoke an API operation by using Cloud Assistant CLI, specify request parameters of different data types in the required formats. For details, see <a href="https://help.aliyun.com/document_detail/110340.html">CLI parameter format</a>.
     * Request examples:</p>
     * <details>
     * <summary>Query the snapshot list of all disks of an ECS instance in the China (Hangzhou) region</summary>
     * ```
     * RegionId:  cn-hangzhou,   // Set the region to China (Hangzhou).
     * InstanceId:  i-bp1fh7by6d9mw7zr****   // Set the instance ID to query.
     * ```
     * </details>
     * <details>
     * <summary>Query the snapshot information of a specific disk in the China (Hangzhou) region</summary>
     * ```
     * RegionId:  cn-hangzhou,   // Set the region to China (Hangzhou).
     * DiskId:   d-bp10e7ej8z743dmu****   // Set the disk ID to query.
     * ```
     * </details>
     * <details>
     * <summary>Query the information of two snapshots in the China (Hangzhou) region by snapshot ID</summary>
     * ```
     * RegionId:  cn-hangzhou,   // Set the region to China (Hangzhou).
     * SnapshotIds:   ["d-bp10e7ej8z743dmu****", "s-bp19vd1lorzgzt2s****"]   // Set the snapshot ID array to query.
     * ```
     * </details>
     * <details>
     * <summary>Query the snapshot information created after a specific point in time in the China (Hangzhou) region</summary>
     * ```
     * RegionId:  cn-hangzhou,   // Set the region to China (Hangzhou).
     * Filter.1.Key:   CreationStartTime,   // Set the filter key for the creation start time.
     * Filter.1.Value:   2024-11-27T00:00Z.
     * ```
     * </details>
     * 
     * @param request the request parameters of DescribeSnapshots  DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>To view the snapshot usage of each cloud disk in the current region, call <a href="https://help.aliyun.com/document_detail/55837.html">DescribeSnapshotLinks</a> to query snapshot chains.</p>
     * 
     * @param request the request parameters of DescribeSnapshotsUsage  DescribeSnapshotsUsageRequest
     * @return DescribeSnapshotsUsageResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>Only spot instances that are deployed in VPCs and are I/O optimized are supported.</li>
     * <li>You can call this operation by using one of the following methods:<ul>
     * <li>Set the <code>Cores</code> and <code>Memory</code> parameters or the <code>MinCores</code> and <code>MinMemory</code> parameters to query instance types that meet the vCPU and memory requirements.</li>
     * <li>Set the <code>InstanceTypes.N</code> parameter to query specified instance types.</li>
     * <li>Set the <code>Cores</code> and <code>Memory</code> parameters or the <code>MinCores</code> and <code>MinMemory</code> parameters, and then set the <code>InstanceTypeFamily</code> or <code>InstanceFamilyLevel</code> parameter to query instance types that meet the vCPU and memory requirements within a specific instance family or at a specific level.</li>
     * </ul>
     * </li>
     * <li>You can calculate the average price of spot instances based on the average discount rate and the price of pay-as-you-go instances.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSpotAdvice  DescribeSpotAdviceRequest
     * @return DescribeSpotAdviceResponse
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

    /**
     * <b>description</b> :
     * <ul>
     * <li>Only I/O optimized spot instances are supported.</li>
     * <li>The returned data may be paginated. If the returned data contains the <code>NextOffset</code> parameter, set the <code>Offset</code> request parameter to the <code>NextOffset</code> value to query subsequent data.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeSpotPriceHistory  DescribeSpotPriceHistoryRequest
     * @return DescribeSpotPriceHistoryResponse
     */
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

    /**
     * @param request the request parameters of DescribeStorageCapacityUnits  DescribeStorageCapacityUnitsRequest
     * @return DescribeStorageCapacityUnitsResponse
     */
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

    /**
     * @param request the request parameters of DescribeStorageSetDetails  DescribeStorageSetDetailsRequest
     * @return DescribeStorageSetDetailsResponse
     */
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

    /**
     * @param request the request parameters of DescribeStorageSets  DescribeStorageSetsRequest
     * @return DescribeStorageSetsResponse
     */
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

    /**
     * @deprecated OpenAPI DescribeTags is deprecated, please use Tag::2018-08-28::CountResourcesByTags instead.  * @description If you specify a tag key (Tag.N.Key) but do not specify a tag value (Tag.N.Value), all tag key-value pairs that contain the specified tag key are returned. If you specify a tag key-value pair, only the tag that is an exact match of the key-value pair is returned.
     * 
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of DescribeTaskAttribute  DescribeTaskAttributeRequest
     * @return DescribeTaskAttributeResponse
     */
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

    /**
     * @param request the request parameters of DescribeTasks  DescribeTasksRequest
     * @return DescribeTasksResponse
     */
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
     * <b>description</b> :
     * <p>You can query Session Manager session records created within the last 30 days. A maximum of 1,000 successful records are retained.</p>
     * 
     * @param request the request parameters of DescribeTerminalSessions  DescribeTerminalSessionsRequest
     * @return DescribeTerminalSessionsResponse
     */
    @Override
    public CompletableFuture<DescribeTerminalSessionsResponse> describeTerminalSessions(DescribeTerminalSessionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTerminalSessions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTerminalSessionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTerminalSessionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI DescribeUserBusinessBehavior is deprecated  * @param request  the request parameters of DescribeUserBusinessBehavior  DescribeUserBusinessBehaviorRequest
     * @return DescribeUserBusinessBehaviorResponse
     */
    @Deprecated
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
     * @param request the request parameters of DescribeUserData  DescribeUserDataRequest
     * @return DescribeUserDataResponse
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
     * @deprecated OpenAPI DescribeVRouters is deprecated, please use Vpc::2016-04-28::DescribeVRouters instead.  * @param request  the request parameters of DescribeVRouters  DescribeVRoutersRequest
     * @return DescribeVRoutersResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DescribeVSwitches is deprecated, please use Vpc::2016-04-28::DescribeVSwitches instead.  * @param request  the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DescribeVirtualBorderRouters is deprecated, please use Vpc::2016-04-28::DescribeVirtualBorderRouters instead.  * @param request  the request parameters of DescribeVirtualBorderRouters  DescribeVirtualBorderRoutersRequest
     * @return DescribeVirtualBorderRoutersResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DescribeVirtualBorderRoutersForPhysicalConnection is deprecated, please use Vpc::2016-04-28::DescribeVirtualBorderRoutersForPhysicalConnection instead.  * @param request  the request parameters of DescribeVirtualBorderRoutersForPhysicalConnection  DescribeVirtualBorderRoutersForPhysicalConnectionRequest
     * @return DescribeVirtualBorderRoutersForPhysicalConnectionResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DescribeVpcs is deprecated, please use Vpc::2016-04-28::DescribeVpcs instead.  * @param request  the request parameters of DescribeVpcs  DescribeVpcsRequest
     * @return DescribeVpcsResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p>If you specify a tag key (Tag.N.Key) but do not specify a tag value (Tag.N.Value), all tag key-value pairs that contain the specified tag key are queried. If you specify a tag key-value pair, only the tags that exact match the key-value pair are queried.</p>
     * 
     * @param request the request parameters of DescribeVscs  DescribeVscsRequest
     * @return DescribeVscsResponse
     */
    @Override
    public CompletableFuture<DescribeVscsResponse> describeVscs(DescribeVscsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVscs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVscsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVscsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>DescribeZones only queries the list of zones provided by Alibaba Cloud and returns limited inventory information. To query the instance types and disk categories available for purchase in a specific zone, use <a href="https://help.aliyun.com/document_detail/66186.html">DescribeAvailableResource</a>.</p>
     * 
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
     * @param request the request parameters of DetachClassicLinkVpc  DetachClassicLinkVpcRequest
     * @return DetachClassicLinkVpcResponse
     */
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

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>This is an asynchronous operation. After a successful call, wait approximately one minute for the detachment to complete.</li>
     * <li>The instance to which the disk is attached must not be locked with <code>&quot;LockReason&quot; : &quot;security&quot;</code> in <code>OperationLocks</code>.</li>
     * <li>After an elastic ephemeral disk is detached, it can only be reattached to its original instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachDisk  DetachDiskRequest
     * @return DetachDiskResponse
     */
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

    /**
     * @param request the request parameters of DetachInstanceRamRole  DetachInstanceRamRoleRequest
     * @return DetachInstanceRamRoleResponse
     */
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

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>After you unbind an SSH key pair, you must restart the instance (<a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a>) for the changes to take effect.  </li>
     * <li>After you unbind an SSH key pair, the instance uses the username and password authentication method by default.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachKeyPair  DetachKeyPairRequest
     * @return DetachKeyPairResponse
     */
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You cannot detach the primary ENI of an instance.</li>
     * <li>The network interface controller (NIC) must be in the Detaching or InUse state.</li>
     * <li>The instance must be in the Running or Stopped state.</li>
     * <li>This is an asynchronous operation. After you invoke the operation, you can check the Elastic Network Interface (ENI) status or listen for network interface controller (NIC) operation events to obtain the result. The following figure shows the ENI state machine:
     * <img src="https://static-aliyun-doc.oss-cn-hangzhou.aliyuncs.com/file-manage-files/zh-CN/20221124/mvga/DetachNetworkInterface.jpg" alt=""><ul>
     * <li>The Detaching state indicates that the detach Elastic Network Interface (ENI) request has been sent successfully and the network interface controller (NIC) is being detached from the ECS instance.</li>
     * <li>The Available state indicates that the network interface controller (NIC) has been detached from the ECS instance.</li>
     * <li>If the Elastic Network Interface (ENI) remains in the Detaching state for an extended period, the detachment may have failed because the operating system inside the instance did not respond to the network interface controller (NIC) detach request. In this case, initiate a new detach request for the ENI. If the issue persists, restart the instance and retry.
     * <strong>For details, see</strong> <a href="https://help.aliyun.com/document_detail/471551.html">Detach an Elastic Network Interface (ENI)</a>. To invoke this operation, refer to the sample code.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DetachNetworkInterface  DetachNetworkInterfaceRequest
     * @return DetachNetworkInterfaceResponse
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>If you are concerned that a created activation code may be leaked, call this operation to disable the activation code. After the activation code is disabled, it can no longer be used to register new managed instances, but existing managed instances that were already registered are not affected.</p>
     * 
     * @param request the request parameters of DisableActivation  DisableActivationRequest
     * @return DisableActivationResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li><strong>Before you begin</strong><ul>
     * <li>Resource Access Management (RAM) users require the <code>AliyunECSFullAccess</code> permission. For more information about how to grant authorization, see <a href="https://help.aliyun.com/document_detail/116146.html">Grant permissions to a RAM user</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Usage notes</strong><ul>
     * <li>After you shutdown account-level default encryption for block storage, the encryption status of existing cloud disks is not affected.</li>
     * <li>After you shutdown account-level default encryption for block storage, you can still manually select encryption when you create a cloud disk.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DisableDiskEncryptionByDefault  DisableDiskEncryptionByDefaultRequest
     * @return DisableDiskEncryptionByDefaultResponse
     */
    @Override
    public CompletableFuture<DisableDiskEncryptionByDefaultResponse> disableDiskEncryptionByDefault(DisableDiskEncryptionByDefaultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableDiskEncryptionByDefault").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableDiskEncryptionByDefaultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableDiskEncryptionByDefaultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableNetworkInterfaceQoS  DisableNetworkInterfaceQoSRequest
     * @return DisableNetworkInterfaceQoSResponse
     */
    @Override
    public CompletableFuture<DisableNetworkInterfaceQoSResponse> disableNetworkInterfaceQoS(DisableNetworkInterfaceQoSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableNetworkInterfaceQoS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableNetworkInterfaceQoSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableNetworkInterfaceQoSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>The EBS account-level default encryption feature is available only in specific regions and for specific users. If you want to use this feature, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.
     * &lt;props=&quot;intl&quot;&gt;
     * The EBS account-level default encryption feature is available only in specific regions and for specific users. If you want to use this feature, <a href="https://smartservice.console.aliyun.com/service/create-ticket-intl">submit a ticket</a>.</p>
     * </blockquote>
     * <ul>
     * <li><strong>Before you begin</strong><ul>
     * <li>Resource Access Management (RAM) users require the <code>AliyunECSFullAccess</code> permission. For details about the authorization operation, see <a href="https://help.aliyun.com/document_detail/116146.html">Grant permissions to a RAM user</a>.</li>
     * <li>Before enabling account-level default encryption for block storage, activate <a href="https://help.aliyun.com/document_detail/480156.html">Key Management Service (KMS)</a>.</li>
     * <li>After account-level default encryption for block storage is enabled, only encrypted cloud disks can be created. For details, see <a href="~~59643#50de175230erj~~">Encrypted cloud disks - Limits</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Notes</strong><ul>
     * <li>After account-level default encryption for block storage is enabled, all newly created pay-as-you-go or subscription cloud disks must be encrypted cloud disks. You can use the KMS key ID configured for account-level default encryption for block storage, or specify a different KMS key ID.</li>
     * <li>When account-level default encryption for block storage is enabled for the first time, the service key is used by default.</li>
     * </ul>
     * </li>
     * <li><strong>Recommendations</strong><ul>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/2851493.html">DescribeDiskEncryptionByDefaultStatus</a> and <a href="https://help.aliyun.com/document_detail/2851490.html">DescribeDiskDefaultKMSKeyId</a> to query whether account-level default encryption for block storage is enabled in a specified region and the KMS key ID in use.</li>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/2851492.html">ModifyDiskDefaultKMSKeyId</a> or <a href="https://help.aliyun.com/document_detail/2851539.html">ResetDiskDefaultKMSKeyId</a> to modify or reset the KMS key used for account-level default encryption for block storage.</li>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/2851491.html">DisableDiskEncryptionByDefault</a> to disable account-level default encryption for block storage in a specified region.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of EnableDiskEncryptionByDefault  EnableDiskEncryptionByDefaultRequest
     * @return EnableDiskEncryptionByDefaultResponse
     */
    @Override
    public CompletableFuture<EnableDiskEncryptionByDefaultResponse> enableDiskEncryptionByDefault(EnableDiskEncryptionByDefaultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableDiskEncryptionByDefault").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableDiskEncryptionByDefaultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableDiskEncryptionByDefaultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableNetworkInterfaceQoS  EnableNetworkInterfaceQoSRequest
     * @return EnableNetworkInterfaceQoSResponse
     */
    @Override
    public CompletableFuture<EnableNetworkInterfaceQoSResponse> enableNetworkInterfaceQoS(EnableNetworkInterfaceQoSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableNetworkInterfaceQoS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableNetworkInterfaceQoSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableNetworkInterfaceQoSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI EnablePhysicalConnection is deprecated, please use Vpc::2016-04-28::EnablePhysicalConnection instead.  * @param request  the request parameters of EnablePhysicalConnection  EnablePhysicalConnectionRequest
     * @return EnablePhysicalConnectionResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <ul>
     * <li>Closes the data connection of a specified session. The session can no longer be used.</li>
     * <li>The WebSocket URL associated with the session also becomes invalid and can no longer be used.</li>
     * </ul>
     * 
     * @param request the request parameters of EndTerminalSession  EndTerminalSessionRequest
     * @return EndTerminalSessionResponse
     */
    @Override
    public CompletableFuture<EndTerminalSessionResponse> endTerminalSession(EndTerminalSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EndTerminalSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EndTerminalSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EndTerminalSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you export an image:</p>
     * <ul>
     * <li>Learn about the prerequisites and considerations. For more information, see <a href="https://help.aliyun.com/document_detail/58181.html">Export images</a>.</li>
     * <li>The ImageFormat parameter for specifying the image export format is available only in specific regions, including Japan (Tokyo), Indonesia (Jakarta), Germany (Frankfurt), UAE (Dubai), US (Virginia), UK (London), Singapore, Malaysia (Kuala Lumpur), and US (Silicon Valley). In regions where this parameter is not supported, images are exported in RAW format by default.</li>
     * <li>Grant Elastic Compute Service (ECS) the permission to write to OSS by using RAM authorization. Perform the following steps:<ul>
     * <li>Create a role named <code>AliyunECSImageExportDefaultRole</code> (no other role name is valid) and configure the following trust policy for the role:<pre><code>   {
     *      &quot;Statement&quot;: [
     *        {
     *          &quot;Action&quot;: &quot;sts:AssumeRole&quot;,
     *          &quot;Effect&quot;: &quot;Allow&quot;,
     *          &quot;Principal&quot;: {
     *            &quot;Service&quot;: [
     *              &quot;ecs.aliyuncs.com&quot;
     *            ]
     *          }
     *        }
     *      ],
     *      &quot;Version&quot;: &quot;1&quot;
     *    }
     * </code></pre>
     * </li>
     * <li>Attach the default system access policy <code>AliyunECSImageExportRolePolicy</code> to the <code>AliyunECSImageExportDefaultRole</code> role. This policy is the default policy provided by Elastic Compute Service (ECS) for image export. For more details, see <a href="https://ram.console.aliyun.com/?spm=5176.2020520101.0.0.64c64df5dfpmdY#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunECSImageImportDefaultRole%22,%20%22TemplateId%22:%20%22ECSImportRole%22%7D,%20%22request2%22:%20%7B%22RoleName%22:%20%22AliyunECSImageExportDefaultRole%22,%20%22TemplateId%22:%20%22ECSExportRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fecs.console.aliyun.com%2F%22,%20%22Service%22:%20%22ECS%22%7D">Cloud resource access authorization</a>. You can also create a custom access policy that includes the following permissions:<pre><code>     {
     *        &quot;Version&quot;: &quot;1&quot;,
     *        &quot;Statement&quot;: [
     *          {
     *            &quot;Action&quot;: [
     *              &quot;oss:GetObject&quot;,
     *              &quot;oss:PutObject&quot;,
     *              &quot;oss:DeleteObject&quot;,
     *              &quot;oss:GetBucketLocation&quot;,
     *              &quot;oss:GetBucketInfo&quot;,
     *              &quot;oss:AbortMultipartUpload&quot;,
     *              &quot;oss:ListMultipartUploads&quot;,
     *              &quot;oss:ListParts&quot;
     *            ],
     *            &quot;Resource&quot;: &quot;*&quot;,
     *            &quot;Effect&quot;: &quot;Allow&quot;
     *          }
     *        ]
     *      }
     * </code></pre>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>After you export an image:
     * The custom image is saved to the specified OSS bucket. You can then download the custom image. For more information, see <a href="https://help.aliyun.com/document_detail/31912.html">Download a custom image</a>.</p>
     * 
     * @param request the request parameters of ExportImage  ExportImageRequest
     * @return ExportImageResponse
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
     * @deprecated OpenAPI ExportSnapshot is deprecated  * @param request  the request parameters of ExportSnapshot  ExportSnapshotRequest
     * @return ExportSnapshotResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <ul>
     * <li>Elastic Compute Service (ECS) is a virtualization-based cloud server that cannot be connected to display devices or manually screenshotted. However, Alibaba Cloud caches the system command line output from the last time an instance was started, restarted, or shut down. You can invoke GetInstanceConsoleOutput to retrieve this output.</li>
     * <li>You cannot retrieve the system command line output of <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>.</li>
     * <li>Windows instances do not support retrieving system command line output.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceConsoleOutput  GetInstanceConsoleOutputRequest
     * @return GetInstanceConsoleOutputResponse
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
     * <b>description</b> :
     * <p>Elastic Compute Service (ECS) returns the instance screenshot as a Base64-encoded JPG image. You must decode the image on your own. You can call this operation to troubleshoot faults. Note the following items:</p>
     * <ul>
     * <li>The instance must be in the Running state. </li>
     * <li>You cannot retrieve screenshot information for <a href="https://help.aliyun.com/document_detail/55263.html">retired instance types</a>. </li>
     * <li>If you call this operation multiple times on the same instance, wait at least 10 seconds between calls. Otherwise, the <code>Throttling</code> error code is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of GetInstanceScreenshot  GetInstanceScreenshotRequest
     * @return GetInstanceScreenshotResponse
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
     * <b>description</b> :
     * <h3>Operation description</h3>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You must upload the image file to Object Storage Service (OSS) in advance. For more information, see <a href="https://help.aliyun.com/document_detail/31886.html">Upload objects</a>.</li>
     * <li>To prevent ECS instances created from the imported custom image from failing to start due to operating system issues on some servers, virtual machines, or cloud hosts, check whether you need to install the virtio driver on the source server before importing the image. For more information, see <a href="https://help.aliyun.com/document_detail/62423.html">Install a virtio driver</a>.</li>
     * <li>When you import an image for the first time, you must use Resource Access Management (RAM) to authorize ECS to access your OSS bucket. Otherwise, the <code>NoSetRoletoECSServiceAccount</code> or <code>InvalidOperation.CloudBoxImageImportRoleRequired</code> error is reported. The following two scenarios apply:<ul>
     * <li><strong>Import an image file without using CloudBox</strong>: You can complete RAM authorization with one click in the RAM console. For RAM authorization page, see <a href="https://ram.console.aliyun.com/?spm=5176.2020520101image.0.0.2ffa4df57kSoHX#/role/authorize?request=%7B%22Requests%22%3A%20%7B%22request1%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageImportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSImportRole%22%7D%2C%20%22request2%22%3A%20%7B%22RoleName%22%3A%20%22AliyunECSImageExportDefaultRole%22%2C%20%22TemplateId%22%3A%20%22ECSExportRole%22%7D%7D%2C%20%22ReturnUrl%22%3A%20%22https%3A//ecs.console.aliyun.com/%22%2C%20%22Service%22%3A%20%22ECS%22%7D">Cloud resource access authorization</a>. You can also manually complete RAM authorization. The following policies and permissions are required for some operations. For more information, see <a href="https://help.aliyun.com/document_detail/25481.html">Account access control</a>.<ol>
     * <li>Create a role named <code>AliyunECSImageImportDefaultRole</code> (this exact name is required, otherwise the image import fails). The policy for the role is:<pre><code>{
     *     &quot;Statement&quot;: [
     *     {
     *         &quot;Action&quot;: &quot;sts:AssumeRole&quot;,
     *         &quot;Effect&quot;: &quot;Allow&quot;,
     *         &quot;Principal&quot;: {
     *         &quot;Service&quot;: [
     *             &quot;ecs.aliyuncs.com&quot;
     *         ]
     *         }
     *     }
     * ],
     *     &quot;Version&quot;: &quot;1&quot;
     * }
     * </code></pre>
     * </li>
     * <li>Attach the system policy <code>AliyunECSImageImportRolePolicy</code> to the role. You can also create a custom policy that must include the following permissions:<pre><code>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *     {
     *         &quot;Action&quot;: [
     *                 &quot;oss:GetObject&quot;,
     *                 &quot;oss:GetBucketLocation&quot;,
     *                 &quot;oss:GetBucketInfo&quot;
     *     ],
     *             &quot;Resource&quot;: &quot;*&quot;,
     *             &quot;Effect&quot;: &quot;Allow&quot;
     *             }
     *     ]
     * }
     * </code></pre>
     * </li>
     * </ol>
     * </li>
     * <li><strong>Import an image file by using CloudBox</strong>: You can complete RAM authorization with one click in the RAM console. For RAM authorization page, see <a href="https://ram.console.aliyun.com/role/authorize?request=%7B%22ReturnUrl%22%3A%22https%3A%2F%2Fecs.console.aliyun.com%2F%22%2C%22Services%22%3A%5B%7B%22Roles%22%3A%5B%7B%22RoleName%22%3A%22AliyunECSCloudBoxImageImportDefaultRole%22%2C%22TemplateId%22%3A%22AliyunECSCloudBoxImageImportDefaultRole%22%7D%5D%2C%22Service%22%3A%22ECS%22%7D%5D%7D">Cloud resource access authorization</a>. You can also manually complete RAM authorization. The following policies and permissions are required for some operations. For more information, see <a href="https://help.aliyun.com/document_detail/25481.html">Account access control</a>.<ol>
     * <li>Create a role named <code>AliyunECSCloudBoxImageImportDefaultRole</code> (this exact name is required, otherwise the image import fails). The policy for the role is:<pre><code>{
     *     &quot;Statement&quot;: [
     *     {
     *         &quot;Action&quot;: &quot;sts:AssumeRole&quot;,
     *         &quot;Effect&quot;: &quot;Allow&quot;,
     *         &quot;Principal&quot;: {
     *         &quot;Service&quot;: [
     *             &quot;ecs.aliyuncs.com&quot;
     *         ]
     *         }
     *     }
     * ],
     *     &quot;Version&quot;: &quot;1&quot;
     * }
     * </code></pre>
     * </li>
     * <li>Attach the system policy <code>AliyunECSCloudBoxImageImportRolePolicy</code> to the role. You can also create a custom policy that must include the following permissions:<pre><code>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *     {
     *         &quot;Action&quot;: [
     *                 &quot;oss-cloudbox:GetObject&quot;,
     *                 &quot;oss-cloudbox:GetBucketLocation&quot;,
     *                 &quot;oss-cloudbox:GetBucketInfo&quot;
     *     ],
     *             &quot;Resource&quot;: &quot;*&quot;,
     *             &quot;Effect&quot;: &quot;Allow&quot;
     *             }
     *     ]
     * }
     * </code></pre>
     * </li>
     * </ol>
     * </li>
     * </ul>
     * </li>
     * <li>You cannot delete an image that is being imported. You can only call <a href="https://help.aliyun.com/document_detail/25624.html">CancelTask</a> to cancel the image import task.</li>
     * <li>The region to which the image is imported must be the same as the region of the OSS bucket to which the image file is uploaded.</li>
     * <li>Valid values of N in the <code>DiskDeviceMapping.N</code> parameter: 1 to 17. N=1 indicates the system disk. N=2 to 17 indicates data disks. When N is greater than 17, the system automatically ignores the value.</li>
     * <li>When the <code>Architecture</code> parameter is set to <code>arm64</code>, or the <code>Platform</code> parameter is set to <code>CentOS Stream</code>, <code>Anolis</code>, <code>AlmaLinux</code>, <code>UOS</code>, <code>Kylin</code>, or <code>Rocky Linux</code>, take note of the following items:<ul>
     * <li>To enable the imported image to support password configuration or key pair modification, the image must meet the following conditions:<ul>
     * <li>The operating system kernel must support the <code>CONFIG_FW_CFG_SYSFS</code> feature. Linux community kernels later than version 4.6 support this feature by default. CentOS kernels later than version 3.10.0-826.el7 support this feature by default. You can run the <code>grep -nr CONFIG_FW_CFG_SYSFS /boot/config-$(uname -r)</code> command on the server that corresponds to the image. If the output contains <code>CONFIG_FW_CFG_SYSFS=y</code>, the kernel in the image supports the <code>CONFIG_FW_CFG_SYSFS</code> feature.</li>
     * <li>The latest version of Alibaba Cloud cloud-init is installed on the operating system. Cloud-init 19.1 must Milvus version 19.1.3 or later. Cloud-init 0.7.6a on some earlier operating systems must Milvus version 0.7.6a15 or later. For more information, see <a href="https://help.aliyun.com/document_detail/57803.html">Install cloud-init</a>.</li>
     * <li>The operating system must support the SHA-512 encryption algorithm.</li>
     * </ul>
     * </li>
     * <li>To enable the imported image to support disk resizing and file system resizing, the image must meet the following conditions:<ul>
     * <li>The operating system kernel version must be later than 3.6.</li>
     * <li>The growpart command is supported. To support this command, install the <code>cloud-utils-growpart</code> package. The installation method varies depending on the operating system. For more information, see <a href="~~2949817#bb3b1f02e51pj~~">Resize partitions and file systems (Linux)</a>.</li>
     * <li>The resize2fs command is supported. To support this command, install the <code>e2fsprogs</code> package. This package is installed by default on the operating system. If it is not installed, install it manually.</li>
     * <li>The latest version of Alibaba Cloud cloud-init is installed on the operating system. Cloud-init 19.1 must Milvus version 19.1.3 or later. Cloud-init 0.7.6a on some earlier operating systems must Milvus version 0.7.6a15 or later. For more information, see <a href="https://help.aliyun.com/document_detail/57803.html">Install cloud-init</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>If the system architecture of the custom image that you want to import is arm64, set the RTC clock to use the UTC time standard. For more information, see <a href="https://help.aliyun.com/document_detail/405080.html">Linux time and time zone description</a>.</li>
     * <li>We strongly recommend that you configure image detection parameters when importing an image. This helps the system optimize your image. For more information, see <a href="https://help.aliyun.com/document_detail/439819.html">Overview of image detection</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ImportImage  ImportImageRequest
     * @return ImportImageResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can have a maximum of 500 key pairs in each region.</li>
     * <li>The imported key pair must support one of the following encryption methods:<ul>
     * <li>rsa</li>
     * <li>dsa</li>
     * <li>ssh-rsa</li>
     * <li>ssh-dss</li>
     * <li>ecdsa</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ImportKeyPair  ImportKeyPairRequest
     * @return ImportKeyPairResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>After you call the InstallCloudAssistant operation, call <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> to make the Cloud Assistant Agent installation take effect.</p>
     * 
     * @param request the request parameters of InstallCloudAssistant  InstallCloudAssistantRequest
     * @return InstallCloudAssistantResponse
     */
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>The following limits apply to the target ECS instances. If you select multiple ECS instances and one of them does not meet the execution conditions, you must call the operation again.<ul>
     * <li>Target instance must be in the Running state. You can call <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> to query target instance status.</li>
     * <li><a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> must be pre-installed on target instance. </li>
     * <li>To run a PowerShell command, target instance must have the PowerShell module configured.</li>
     * </ul>
     * </li>
     * <li>One-time execution: The command is executed only once.</li>
     * <li>Scheduled execution:<ul>
     * <li>The command is executed at the frequency specified by the Frequency parameter. The result of the previous execution does not affect the next execution.</li>
     * <li>When you run a scheduled task based on a Cron expression and specify a time zone, the scheduled execution time is based on the specified time zone. If you do not specify a time zone, the scheduled execution time is based on the system time zone of the ECS instance, and the execution time is determined by the system time of target instance. Make sure that the time or time zone of the ECS instance is consistent with your expected time. For more information about time zones, see <a href="https://help.aliyun.com/document_detail/92704.html">Manage time synchronization services</a>.
     *    Cloud Assistant Agent must be at or later than the following versions to support new features of scheduled tasks (execution at fixed intervals, one-time execution at a specified time, and specifying a year or time zone for Cron expression-based scheduled execution). If the ClientNeedUpgrade error code is returned, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a> to update the agent to the latest version.</li>
     * <li>Linux: 2.2.3.282</li>
     * <li>Windows: 2.1.3.282</li>
     * </ul>
     * </li>
     * <li>A command may fail to be executed due to abnormal instance status, network exceptions, or Cloud Assistant Agent exceptions. No execution information is generated when a command fails to be executed. For more information, see <a href="https://help.aliyun.com/document_detail/87029.html">Common errors and solutions for execution failures</a>. </li>
     * <li>If you enabled the custom parameter feature when you created the command, you must pass in custom parameters (<code>Parameters</code>) when you run the command.</li>
     * <li>Call <a href="https://help.aliyun.com/document_detail/87346.html">DescribeCloudAssistantStatus</a> to query the Cloud Assistant status of target instance first. Run the command only when CloudAssistantStatus is true, especially for newly purchased instances.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>The following limits apply to the target ECS instances. If you select multiple ECS instances and one of them does not meet the execution conditions, you must call the operation again.<ul>
     * <li>Target instance must be in the Running state. You can call <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> to query target instance status.</li>
     * <li><a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> must be pre-installed on target instance. </li>
     * <li>To run a PowerShell command, target instance must have the PowerShell module configured.</li>
     * </ul>
     * </li>
     * <li>One-time execution: The command is executed only once.</li>
     * <li>Scheduled execution:<ul>
     * <li>The command is executed at the frequency specified by the Frequency parameter. The result of the previous execution does not affect the next execution.</li>
     * <li>When you run a scheduled task based on a Cron expression and specify a time zone, the scheduled execution time is based on the specified time zone. If you do not specify a time zone, the scheduled execution time is based on the system time zone of the ECS instance, and the execution time is determined by the system time of target instance. Make sure that the time or time zone of the ECS instance is consistent with your expected time. For more information about time zones, see <a href="https://help.aliyun.com/document_detail/92704.html">Manage time synchronization services</a>.
     *    Cloud Assistant Agent must be at or later than the following versions to support new features of scheduled tasks (execution at fixed intervals, one-time execution at a specified time, and specifying a year or time zone for Cron expression-based scheduled execution). If the ClientNeedUpgrade error code is returned, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a> to update the agent to the latest version.</li>
     * <li>Linux: 2.2.3.282</li>
     * <li>Windows: 2.1.3.282</li>
     * </ul>
     * </li>
     * <li>A command may fail to be executed due to abnormal instance status, network exceptions, or Cloud Assistant Agent exceptions. No execution information is generated when a command fails to be executed. For more information, see <a href="https://help.aliyun.com/document_detail/87029.html">Common errors and solutions for execution failures</a>. </li>
     * <li>If you enabled the custom parameter feature when you created the command, you must pass in custom parameters (<code>Parameters</code>) when you run the command.</li>
     * <li>Call <a href="https://help.aliyun.com/document_detail/87346.html">DescribeCloudAssistantStatus</a> to query the Cloud Assistant status of target instance first. Run the command only when CloudAssistantStatus is true, especially for newly purchased instances.</li>
     * </ul>
     * 
     * @param request the request parameters of InvokeCommand  InvokeCommandRequest
     * @return InvokeCommandResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>A resource is a cloud service entity that you create on Alibaba Cloud. For example, an ECS instance, an ECS Elastic Network Interface (ENI), or an ECS image can each be a resource. A resource group is a collection of infrastructure for projects, environments, or stacks. Managing resources in resource groups allows you to monitor and run tasks in a centralized manner, without the need to switch between multiple Alibaba Cloud services.</p>
     * 
     * @param request the request parameters of JoinResourceGroup  JoinResourceGroupRequest
     * @return JoinResourceGroupResponse
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
     * <b>description</b> :
     * <blockquote>
     * <p>This API operation is deprecated. Invoke <a href="https://help.aliyun.com/document_detail/25503.html">ModifyInstanceAttribute</a> to add an ECS instance to or remove it from a security group. Invoke <a href="https://help.aliyun.com/document_detail/58513.html">ModifyNetworkInterfaceAttribute</a> to add an Elastic Network Interface (ENI) to or remove it from a security group.</p>
     * </blockquote>
     * <ul>
     * <li>This operation does not support adding both an instance and an ENI to a security group at the same time. The InstanceId and NetworkInterfaceId parameters cannot be specified at the same time.</li>
     * <li>The security group and the instance must belong to the same region. </li>
     * <li>The security group and the instance must have the same network type. If the network type is Virtual Private Cloud (VPC), the security group and the instance must belong to the same VPC.</li>
     * <li>Before joining a security group, the instance must be in the <strong>Stopped</strong> or <strong>Running</strong> state.</li>
     * <li>An instance or an ENI can be added to up to five security groups. For more information, see <a href="~~25412#SecurityGroupQuota1~~">Security group limits</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of JoinSecurityGroup  JoinSecurityGroupRequest
     * @return JoinSecurityGroupResponse
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

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This API operation is no longer recommended. Invoke <a href="https://help.aliyun.com/document_detail/25503.html">ModifyInstanceAttribute</a> to add an ECS instance to or remove it from a security group. Invoke <a href="https://help.aliyun.com/document_detail/58513.html">ModifyNetworkInterfaceAttribute</a> to add an Elastic Network Interface (ENI) to or remove it from a security group.
     * Notice: Alibaba Cloud adjusted the validation rules for this operation on July 8, 2024. When you attempt to remove an instance or network interface controller (NIC) that is not in the specified security group, the operation now returns the error code InvalidSecurityGroupAssociation.NotFound instead of a success response. Update your code to be compatible with this error code to avoid impact on your production workloads.</p>
     * </blockquote>
     * <ul>
     * <li>You cannot remove an instance and an Elastic Network Interface (ENI) from a security group at the same time. The InstanceId and NetworkInterfaceId parameters are mutually exclusive.</li>
     * <li>Before you remove an instance from a security group, the instance must be in the <strong>Stopped</strong> or <strong>Running</strong> state.  </li>
     * <li>An instance or Elastic Network Interface (ENI) must belong to at least one security group. If the instance or ENI belongs to only one security group, the removal request fails.  </li>
     * <li>If the instance or network interface controller (NIC) is not in the specified security group, the removal request fails.</li>
     * </ul>
     * 
     * @param request the request parameters of LeaveSecurityGroup  LeaveSecurityGroupRequest
     * @return LeaveSecurityGroupResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>The Cloud Assistant Agent version on the instance must be at least the following version for the Cloud Assistant plugin status to be queried:<ul>
     * <li>Linux: 2.2.3.344.</li>
     * <li>Windows: 2.1.3.344.</li>
     * </ul>
     * </li>
     * <li>When you perform a paging query for the first page, set only <code>MaxResults</code> to limit the number of entries to return. The <code>NextToken</code> value returned in the result is used as the credential to query subsequent pages. When you perform a paging query for subsequent pages, set the <code>NextToken</code> parameter to the <code>NextToken</code> value obtained from the previous response and set <code>MaxResults</code> to limit the number of entries to return.</li>
     * </ul>
     * 
     * @param request the request parameters of ListPluginStatus  ListPluginStatusRequest
     * @return ListPluginStatusResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Specify at least one of the following parameters in the request to determine the query object.</p>
     * <ul>
     * <li><code>ResourceId.N</code></li>
     * <li><code>Tag.N</code> (<code>Tag.N.Key</code> and <code>Tag.N.Value</code>)</li>
     * <li><code>TagFilter.N</code>
     * If you specify the following parameters at the same time, the response contains only ECS resources that meet both conditions.</li>
     * <li><code>Tag.N</code> and <code>ResourceId.N</code></li>
     * <li><code>TagFilter.N</code> and <code>ResourceId.N</code></li>
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
     * <b>description</b> :
     * <p>You can also use this operation to reconfigure a locked snapshot. The configurable items depend on the lock mode and lock status:</p>
     * <ul>
     * <li>If the snapshot is locked in compliance mode and is within the cool-off period, you can extend or shorten the cool-off period and extend or shorten the lock duration.</li>
     * <li>If the snapshot is locked in compliance mode and the cool-off period has elapsed, you can only extend the lock duration.<blockquote>
     * <p>When you reconfigure a locked snapshot during the cool-off period, the system treats this as a re-lock operation. All lock parameters are reset rather than individually adjusted.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of LockSnapshot  LockSnapshotRequest
     * @return LockSnapshotResponse
     */
    @Override
    public CompletableFuture<LockSnapshotResponse> lockSnapshot(LockSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LockSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LockSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LockSnapshotResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you modify an auto provisioning group, take note of the following items:</p>
     * <ul>
     * <li>If you modify the capacity or capacity-related settings of the group, the group executes a scheduling node after the modification is complete.</li>
     * <li>If the auto provisioning group is being deleted, you cannot modify the group.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAutoProvisioningGroup  ModifyAutoProvisioningGroupRequest
     * @return ModifyAutoProvisioningGroupResponse
     */
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>System policies cannot be modified.</li>
     * <li>After you modify an automatic snapshot policy, the disks to which the policy has been applied immediately execute the modified automatic snapshot policy.</li>
     * <li>If cross-region snapshot replication is enabled and no encryption parameters are configured, encrypted snapshots are encrypted by using the service key of the destination region by default.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyAutoSnapshotPolicyEx  ModifyAutoSnapshotPolicyExRequest
     * @return ModifyAutoSnapshotPolicyExResponse
     */
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
     * @deprecated OpenAPI ModifyBandwidthPackageSpec is deprecated  * @param request  the request parameters of ModifyBandwidthPackageSpec  ModifyBandwidthPackageSpecRequest
     * @return ModifyBandwidthPackageSpecResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of ModifyCapacityReservation  ModifyCapacityReservationRequest
     * @return ModifyCapacityReservationResponse
     */
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

    /**
     * @param request the request parameters of ModifyCloudAssistantSettings  ModifyCloudAssistantSettingsRequest
     * @return ModifyCloudAssistantSettingsResponse
     */
    @Override
    public CompletableFuture<ModifyCloudAssistantSettingsResponse> modifyCloudAssistantSettings(ModifyCloudAssistantSettingsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCloudAssistantSettings").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCloudAssistantSettingsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCloudAssistantSettingsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCommand  ModifyCommandRequest
     * @return ModifyCommandResponse
     */
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>To modify the CPU overcommit ratio, all ECS instances on the dedicated host must be in the Stopped (<code>Stopped</code>) state.</li>
     * <li>Modifying the CPU overcommit ratio does not affect the running state of the dedicated host. However, the number of allocated vCPUs on the dedicated host cannot exceed the new total number of vCPUs after the modification. Otherwise, the excess ECS instances cannot be started.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDedicatedHostAttribute  ModifyDedicatedHostAttributeRequest
     * @return ModifyDedicatedHostAttributeResponse
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When the specified automatic release time is reached, the pay-as-you-go dedicated host is automatically released. Make sure that you no longer use the dedicated host and have backed up application data as needed.</p>
     * 
     * @param request the request parameters of ModifyDedicatedHostAutoReleaseTime  ModifyDedicatedHostAutoReleaseTimeRequest
     * @return ModifyDedicatedHostAutoReleaseTimeResponse
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
     * <b>description</b> :
     * <ul>
     * <li>After you enable the auto-renewal feature for a subscription dedicated host, the system automatically renews the host nine days before expiration. The fee is automatically executed at 08:00:00 (UTC+8). If the deduction failed on the previous day, the system retries at the same time the next day. The automatic deduction stops after the fee is successfully deducted or after the dedicated host expires and is locked nine days later. During this period, make sure that your payment method has a sufficient balance.</li>
     * <li>Subscription dedicated hosts support auto-renewal that follows the subscription ECS instances on the host. For more information, see the metric description of the AutoRenewWithEcs parameter.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDedicatedHostAutoRenewAttribute  ModifyDedicatedHostAutoRenewAttributeRequest
     * @return ModifyDedicatedHostAutoRenewAttributeResponse
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

    /**
     * @param request the request parameters of ModifyDedicatedHostClusterAttribute  ModifyDedicatedHostClusterAttributeRequest
     * @return ModifyDedicatedHostClusterAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyDedicatedHostsChargeType  ModifyDedicatedHostsChargeTypeRequest
     * @return ModifyDedicatedHostsChargeTypeResponse
     */
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

    /**
     * @param request the request parameters of ModifyDeploymentSetAttribute  ModifyDeploymentSetAttributeRequest
     * @return ModifyDeploymentSetAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyDiagnosticMetricSet  ModifyDiagnosticMetricSetRequest
     * @return ModifyDiagnosticMetricSetResponse
     */
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
     * <b>description</b> :
     * <p>You can call the <code>DiskId</code> parameter to modify the name, description, release behavior, and other attributes of a single block storage device, or call the <code>DiskIds.N</code> parameter to modify the attributes of multiple block storage devices in a batch.</p>
     * 
     * @param request the request parameters of ModifyDiskAttribute  ModifyDiskAttributeRequest
     * @return ModifyDiskAttributeResponse
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
     * <b>description</b> :
     * <p>Before you convert the billing method of data disks, read <a href="https://help.aliyun.com/document_detail/145018.html">Change the billing method of a disk</a>.
     * Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>You cannot change the billing method of data disks attached to pay-as-you-go instances. Pay-as-you-go instances support only pay-as-you-go disks.</li>
     * <li>The instance to which the data disks are attached cannot be in the expired and stopped state.</li>
     * <li>The price difference before and after the billing method change is refunded to your original payment method. Consumed coupons are not refundable.</li>
     * <li>After the billing method of a disk is successfully changed, you must wait at least five minutes before you can change it again.<br>&lt;props=&quot;china&quot;&gt;- Disks with the multi-attach attribute enabled support only the pay-as-you-go billing method and cannot be converted to subscription.
     * After the billing method is changed, automatic payment is enabled by default. Make sure that your account balance is sufficient. Otherwise, an abnormal order is generated, and you can only void the order. If your account balance is insufficient, you can set the AutoPay parameter to false. In this case, an unpaid order is generated. You can log on to the Alibaba Cloud <strong>Expenses and Costs</strong> console and go to the &lt;props=&quot;china&quot;&gt;<ph><a href="https://usercenter2.aliyun.com/order/list">Orders</a></ph>&lt;props=&quot;intl&quot;&gt;<ph><a href="https://usercenter2-intl.aliyun.com/order/list">Orders</a></ph> page to complete the payment.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskChargeType  ModifyDiskChargeTypeRequest
     * @return ModifyDiskChargeTypeResponse
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

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users require the <code>AliyunECSFullAccess</code> permission. For information about how to perform authorization, see <a href="https://help.aliyun.com/document_detail/116146.html">Grant permissions to a RAM user</a>.</li>
     * <li>The block storage account-level default encryption feature must be enabled in the specified region.</li>
     * <li>Before using a master key for the first time, grant ECS the <code>AliyunECSDiskEncryptDefaultRole</code> role to allow ECS to access KMS resources. For details, see <a href="https://help.aliyun.com/document_detail/2838993.html">Grant permissions to access KMS keys by using a RAM role</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskDefaultKMSKeyId  ModifyDiskDefaultKMSKeyIdRequest
     * @return ModifyDiskDefaultKMSKeyIdResponse
     */
    @Override
    public CompletableFuture<ModifyDiskDefaultKMSKeyIdResponse> modifyDiskDefaultKMSKeyId(ModifyDiskDefaultKMSKeyIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskDefaultKMSKeyId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskDefaultKMSKeyIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskDefaultKMSKeyIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The dedicated block storage cluster feature is supported in the China (Hangzhou), China (Shanghai), China (Beijing), China (Zhangjiakou), China (Ulanqab), China (Shenzhen), China (Heyuan), Indonesia (Jakarta), Germany (Frankfurt), and China South 1 Finance regions.
     * Before you call this operation, make sure that you fully understand the billing methods and pricing of disks and dedicated block storage clusters, and that the dedicated block storage cluster has not expired and your account does not have an overdue payment. For more information, see <a href="https://help.aliyun.com/document_detail/208883.html">Dedicated block storage cluster billing</a> and <a href="https://help.aliyun.com/document_detail/179022.html">Block storage billing</a>.
     * Take note of the following items when you call this operation:</p>
     * </blockquote>
     * <ul>
     * <li>The disk and the dedicated block storage cluster must be in the same zone.</li>
     * <li>Only pay-as-you-go disks are supported. Subscription disks must be converted to pay-as-you-go disks first. For more information, see <a href="https://help.aliyun.com/document_detail/145018.html">Change the billing method of a disk</a>.</li>
     * <li>The disk type must be consistent with the disk type supported by the destination cluster. When you migrate a disk between different dedicated block storage clusters, you can change the disk type to match the disk type supported by the destination cluster.</li>
     * <li>The disk must be in the <strong>In Use</strong> (In_use) or <strong>Active</strong> (Available) state.</li>
     * <li>If the disk is attached to an ECS instance, the instance must be in the <strong>Running</strong> (Running) or <strong>Stopped</strong> (Stopped) state. The ECS instance cannot be expired.</li>
     * <li>Because the enterprise SSD performance level (PL) is limited by its capacity, if you cannot upgrade the performance level (PL), scale out the disk and try again. For more information, see <a href="https://help.aliyun.com/document_detail/25522.html">ResizeDisk</a> and <a href="https://help.aliyun.com/document_detail/122389.html">Enterprise SSDs</a>.</li>
     * <li>A maximum of five disk migration tasks can run concurrently in the same region for a single account.</li>
     * <li>During the migration procedure, you cannot cancel the migration, create snapshots, perform specification changes, scale out, attach or detach the disk, or reinitialize the disk.<blockquote>
     * <p>After the disk is migrated, the billing method, disk type, and capabilities of the destination cluster take effect immediately. Alibaba Cloud charges you based on the new disk type and performance level (PL) after you call the operation. For more information, see <a href="https://help.aliyun.com/document_detail/208883.html">Dedicated block storage cluster billing</a> and <a href="https://help.aliyun.com/document_detail/179022.html">Block storage billing</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskDeployment  ModifyDiskDeploymentRequest
     * @return ModifyDiskDeploymentResponse
     */
    @Override
    public CompletableFuture<ModifyDiskDeploymentResponse> modifyDiskDeployment(ModifyDiskDeploymentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDiskDeployment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDiskDeploymentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDiskDeploymentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;Before you use this operation, make sure that you fully understand the billing and <a href="https://www.aliyun.com/price/product#/disk/detail">pricing</a> of disks.
     * To minimize the impact of specification changes on your business, perform specification changes during off-peak hours.
     * Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>To modify the performance level (PL) of an enterprise SSD (ESSD) disk:<ul>
     * <li>Subscription ESSD disks support only performance level (PL) upgrades.</li>
     * <li>Pay-as-you-go ESSD disks support both upgrades and downgrades of performance levels (PLs), but you cannot downgrade to PL0.</li>
     * <li>The ESSD disk must be in the <strong>In Use</strong> (In_use) or <strong>Pending Attach</strong> (Available) state.</li>
     * <li>If the ESSD disk is attached to an ECS instance, the instance must be in the <strong>Running</strong> (Running) or <strong>Stopped</strong> (Stopped) state and must not be expired or have an overdue payment.</li>
     * <li>Because the ESSD performance level is limited by its capacity, if you cannot upgrade the performance level (PL), scale out the disk by calling <a href="https://help.aliyun.com/document_detail/25522.html">ResizeDisk</a> and try again. For more information, see <a href="https://help.aliyun.com/document_detail/122389.html">ESSDs</a>.</li>
     * </ul>
     * </li>
     * <li>For precautions about changing the type of a disk, see <a href="~~161980#section_s4a_to0_1jx~~">Change the disk type</a>.</li>
     * <li>For information about the supported Upgrade/Downgrade scenarios for different disk types, see <a href="~~161980#eb8bb54032nho~~">Supported specification changes for disks</a>.
     * &lt;props=&quot;china&quot;&gt;* Disks with the multi-attach attribute enabled do not support disk specification changes.
     * After a disk specification change, the billing changes are as follows:</li>
     * <li>Pay-as-you-go disks: billed based on the new disk type.</li>
     * <li>Subscription disks: within the billing cycle, the amount to be paid is calculated based on the price difference between the old and new configurations and the remaining days (from 00:00 of the next day to the end of the validity period).
     * For billing information about disks, see <a href="https://help.aliyun.com/document_detail/179022.html">Block storage billing</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyDiskSpec  ModifyDiskSpecRequest
     * @return ModifyDiskSpecResponse
     */
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
     * @deprecated OpenAPI ModifyEipAddressAttribute is deprecated, please use Vpc::2016-04-28::ModifyEipAddressAttribute instead.  * @param request  the request parameters of ModifyEipAddressAttribute  ModifyEipAddressAttributeRequest
     * @return ModifyEipAddressAttributeResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of ModifyElasticityAssurance  ModifyElasticityAssuranceRequest
     * @return ModifyElasticityAssuranceResponse
     */
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
     * @param request the request parameters of ModifyElasticityAssuranceAutoRenewAttribute  ModifyElasticityAssuranceAutoRenewAttributeRequest
     * @return ModifyElasticityAssuranceAutoRenewAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyElasticityAssuranceAutoRenewAttributeResponse> modifyElasticityAssuranceAutoRenewAttribute(ModifyElasticityAssuranceAutoRenewAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyElasticityAssuranceAutoRenewAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyElasticityAssuranceAutoRenewAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyElasticityAssuranceAutoRenewAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ModifyForwardEntry is deprecated, please use Vpc::2016-04-28::ModifyForwardEntry instead.  * @param request  the request parameters of ModifyForwardEntry  ModifyForwardEntryRequest
     * @return ModifyForwardEntryResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI ModifyHaVipAttribute is deprecated, please use Vpc::2016-04-28::ModifyHaVipAttribute instead.  * @param request  the request parameters of ModifyHaVipAttribute  ModifyHaVipAttributeRequest
     * @return ModifyHaVipAttributeResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of ModifyHpcClusterAttribute  ModifyHpcClusterAttributeRequest
     * @return ModifyHpcClusterAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyImageAttribute  ModifyImageAttributeRequest
     * @return ModifyImageAttributeResponse
     */
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
     * @deprecated OpenAPI ModifyImageShareGroupPermission is deprecated, please use Ecs::2014-05-26::ModifyImageSharePermission instead.  * @param request  the request parameters of ModifyImageShareGroupPermission  ModifyImageShareGroupPermissionRequest
     * @return ModifyImageShareGroupPermissionResponse
     */
    @Deprecated
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

    /**
     * <b>description</b> :
     * <p>Before you invoke this operation, read <a href="https://help.aliyun.com/document_detail/25463.html">Share a custom image</a>.
     * When you call this operation, take note of the following sharing rules:</p>
     * <ul>
     * <li><strong>Sharing limits</strong>: You can share only custom images that you created under your account. Each image can be shared with up to 50 Alibaba Cloud accounts, and up to 10 Alibaba Cloud accounts per request.</li>
     * <li><strong>Impact on instances</strong>: After an ECS instance is created from a shared image (<a href="https://help.aliyun.com/document_detail/63440.html">RunInstances</a>), if the image owner cancels the image sharing relationship or deletes the custom image (<a href="https://help.aliyun.com/document_detail/25537.html">DeleteImage</a>), the instance cannot perform initialization of its system disk (<a href="https://help.aliyun.com/document_detail/25519.html">ReInitDisk</a>).<blockquote>
     * <p>Notice: Rule change for sharing encrypted images in Elastic Compute Service (ECS): Only images encrypted with a customer master key (CMK) can be shared. Images encrypted with a service key can no longer be shared and will return an error during sharing. If you have images encrypted with a service key and plan to share them, use CopyImage to change the encryption key to a CMK through image replication.
     * To publish or delist a community image, take note of the following:</p>
     * </blockquote>
     * </li>
     * <li><strong>Responsibilities and agreements</strong>: Community images are maintained by their owners, who are responsible for quality and updates. Alibaba Cloud provides only platform support. Before publishing, make sure that you have read and signed the community image agreement. Otherwise, publishing is not allowed. For more information, see <a href="https://help.aliyun.com/document_detail/208370.html">Publish a community image</a>.</li>
     * <li><strong>Encryption limits</strong>: Encrypted images cannot be published as community images.</li>
     * <li><strong>Visibility</strong>: Community images are fully public. All Alibaba Cloud accounts in the region where the image resides can use the image.</li>
     * <li><strong>Feature limits</strong>: Community images do not support sharing, export, or copying.</li>
     * <li><strong>Impact of delisting</strong>: After a community image is delisted, it is no longer publicly available to other Alibaba Cloud accounts. However, existing sharing relationships are retained.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyImageSharePermission  ModifyImageSharePermissionRequest
     * @return ModifyImageSharePermissionResponse
     */
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

    /**
     * <b>description</b> :
     * <p>A private pool is generated after an elasticity assurance or capacity reservation is created. The private pool is associated with instance information that matches the private pool. When you create an instance, you can specify whether to use a private pool to launch the instance. The instance is then matched with an elasticity assurance or capacity reservation.</p>
     * <ul>
     * <li>After you call this operation to modify the private pool attributes of an instance, you do not need to restart the instance.</li>
     * <li>When you call the following operations, the system re-matches the private pool of the instance. If the instance has already been matched with a specified private pool, the call may fail because the private pool capacity is exhausted or the private pool has expired. If the call fails, call the ModifyInstanceAttachmentAttributes operation to change the private pool matching mode to <code>Open</code>.<ul>
     * <li><a href="https://help.aliyun.com/document_detail/2679679.html">StartInstance - Restart an instance that has the economical mode enabled.</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2679707.html">ReActivateInstances - Restart an expired or overdue instance.</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2679704.html">ModifyInstanceChargeType - Change the billing method of an instance.</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2679706.html">ModifyPrepayInstanceSpec - Upgrade or downgrade the instance type of an instance.</a></li>
     * <li><a href="https://help.aliyun.com/document_detail/2679771.html">ReplaceSystemDisk - Replace the operating system.</a></li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceAttachmentAttributes  ModifyInstanceAttachmentAttributesRequest
     * @return ModifyInstanceAttachmentAttributesResponse
     */
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

    /**
     * <b>description</b> :
     * <p>Instances that are locked for security reasons do not support this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impact of resource security locks on API calls</a>.</p>
     * 
     * @param request the request parameters of ModifyInstanceAttribute  ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyInstanceAutoReleaseTime  ModifyInstanceAutoReleaseTimeRequest
     * @return ModifyInstanceAutoReleaseTimeResponse
     */
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
     * <b>description</b> :
     * <p><em>Before you invoke this operation, make sure that you fully understand the billing methods and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/ecs#pricing">pricing</a> of Elastic Compute Service (ECS).</em>*</p>
     * <ul>
     * <li>Make sure that your account balance or credit limit is sufficient.</li>
     * <li>Only subscription instances are supported. Invoking this operation for pay-as-you-go instances returns an error.</li>
     * <li>Auto-renewal deduction occurs on the ninth day before the instance expires. Deduction starts to execute at 08:00:00 (UTC+8).</li>
     * <li>If the auto-renewal deduction failed on the previous day, the system retries the deduction at the scheduled time on the next day until the deduction succeeds or the instance is locked after 9 days.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>If the purchase duration of a new instance is one week, the auto-renewal deduction is performed on the first day after the instance is created.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceAutoRenewAttribute  ModifyInstanceAutoRenewAttributeRequest
     * @return ModifyInstanceAutoRenewAttributeResponse
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

    /**
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Make sure that you are familiar with the <a href="https://help.aliyun.com/document_detail/56220.html">subscription</a> and <a href="https://help.aliyun.com/document_detail/40653.html">pay-as-you-go</a> billing methods and the &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/ecs#pricing">pricing</a> of Elastic Compute Service (ECS).</li>
     * <li>Make sure that the target instances are in the <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) state and that your account has no overdue payments.</li>
     * <li>After the billing method is changed, automatic payment is enabled by default. Make sure that your account balance is sufficient. Otherwise, abnormal orders are generated, and you can only cancel the orders. If your account balance is insufficient, set the AutoPay parameter to <code>false</code>. In this case, unpaid orders are generated. You can log on to the <a href="https://ecs.console.aliyun.com/">ECS console</a> to complete the payment.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li><strong>Subscription to pay-as-you-go</strong>:
     * &lt;props=&quot;china&quot;&gt;<ul>
     * <li>When you transform a subscription instance to a pay-as-you-go instance, the new billing method overwrites the entire lifecycle of the instance. You receive a refund for the price difference. The refund is returned to your original payment method. Consumed coupons are not refunded.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>When you transform a subscription instance to a pay-as-you-go instance, the new billing method overwrites the entire lifecycle of the instance. You receive a refund for the price difference. The refund is returned to your original payment method. Consumed coupons are not refunded.</li>
     * <li><strong>Refund rules</strong>: The refund amount that you can claim each month is limited and does not carry over to the next month. After the refund quota is exhausted, you must wait until the next month to switch the billing method. The refund quota consumed by each billing method change is calculated by using the following formula: <strong>vCPUs × (Refund days × 24 ± Floating hours)</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/85517.html">Switch the billing method from subscription to pay-as-you-go</a>.</li>
     * </ul>
     * </li>
     * <li><strong>Pay-as-you-go to subscription</strong>:<ul>
     * <li>All pay-as-you-go data disks attached to the instance can be transformed to subscription data disks at the same time.</li>
     * <li>If a release time is set for the pay-as-you-go instance, you cannot call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/49884.html">Switch the billing method from pay-as-you-go to subscription</a>.</li>
     * <li>If the instance is in economical mode, start the instance first.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceChargeType  ModifyInstanceChargeTypeRequest
     * @return ModifyInstanceChargeTypeResponse
     */
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>This is an asynchronous operation. After you call this operation, an asynchronous task ID is returned. You can query the asynchronous task result to determine whether the execution is complete.</li>
     * <li>To modify PtpStatus, the instance type must support the settings for this parameter. For information about supported instance types, call the <a href="https://help.aliyun.com/document_detail/25620.html">DescribeInstanceTypes</a> operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceClockOptions  ModifyInstanceClockOptionsRequest
     * @return ModifyInstanceClockOptionsResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceClockOptionsResponse> modifyInstanceClockOptions(ModifyInstanceClockOptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceClockOptions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceClockOptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceClockOptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you migrate an ECS instance to a dedicated host or change the ECS instance type while migrating the instance, the following conditions must be met:</p>
     * <ul>
     * <li>The ECS instance must be in the <strong>Stopped</strong> state. The instance automatically restarts after migration.</li>
     * <li>Only VPC-connected ECS instances are supported.</li>
     * <li>The ECS instance and the dedicated host must belong to the same account, region, and zone.</li>
     * <li>Pay-as-you-go ECS instances can be migrated to subscription dedicated hosts. Subscription ECS instances can be migrated only between subscription dedicated hosts, and the instance expiration time cannot be later than the expiration time of the destination dedicated host.</li>
     * <li>When you migrate an ECS instance from a shared host to a dedicated host, the billing method of the instance must be pay-as-you-go. Subscription instances and spot instances are not supported.</li>
     * <li>ECS instances can be redeployed to a specified dedicated host cluster.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceDeployment  ModifyInstanceDeploymentRequest
     * @return ModifyInstanceDeploymentResponse
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
     * <b>description</b> :
     * <p>Modifies the maintenance policy of an instance. The policy contains two maintenance properties:</p>
     * <ul>
     * <li>Maintenance time window: A time period that you specify. Maintenance is performed only within this period.</li>
     * <li>Maintenance action: The action that you specify to handle instance downtime.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceMaintenanceAttributes  ModifyInstanceMaintenanceAttributesRequest
     * @return ModifyInstanceMaintenanceAttributesResponse
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

    /**
     * @param request the request parameters of ModifyInstanceMetadataOptions  ModifyInstanceMetadataOptionsRequest
     * @return ModifyInstanceMetadataOptionsResponse
     */
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

    /**
     * <b>description</b> :
     * <p>Take note of the following items when you invoke this operation:</p>
     * <ul>
     * <li>This is an asynchronous operation. After you invoke this operation, an asynchronous task ID is returned. You can query the asynchronous task result to determine whether the operation has been executed.</li>
     * <li>Each call supports modifying only one property. To modify multiple properties, invoke this operation multiple times.</li>
     * <li>To modify BandwidthWeighting, the instance type must support settings for this parameter. You can call <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a> to check whether the current instance type supports bandwidth weighting and to query the supported bandwidth weight values.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceNetworkOptions  ModifyInstanceNetworkOptionsRequest
     * @return ModifyInstanceNetworkOptionsResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceNetworkOptionsResponse> modifyInstanceNetworkOptions(ModifyInstanceNetworkOptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceNetworkOptions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceNetworkOptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceNetworkOptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><p>When you modify the bandwidth configuration of a subscription (PrePaid) instance and the outbound public bandwidth (InternetMaxBandwidthOut) is upgraded from 0 Mbit/s to a non-zero value, a public IP address is automatically assigned.</p>
     * </li>
     * <li><p>When you modify the bandwidth configuration of a pay-as-you-go (PostPaid) instance and the outbound public bandwidth (InternetMaxBandwidthOut) is upgraded from 0 Mbit/s to a non-zero value, a public IP address is not automatically assigned. Set the <code>AllocatePublicIp</code> parameter to <code>true</code> to assign a public IP address.</p>
     * <blockquote>
     * <p>In a single region, the total peak pay-by-bandwidth public bandwidth for a single Alibaba Cloud account is limited. For more information, see <a href="~~25412#BandwidthQuota~~">Public bandwidth limits</a>.</p>
     * </blockquote>
     * </li>
     * <li><p>Fees:</p>
     * <ul>
     * <li>After the bandwidth is upgraded, fees are automatically deducted by default. Make sure that your payment method has a sufficient balance. Otherwise, an abnormal order is generated, and you can only void the order. If your account balance is insufficient, set the AutoPay parameter to false. A normal unpaid order is generated, and you can log on to the ECS console to complete the payment.</li>
     * <li>After the bandwidth is downgraded, the price difference is refunded to the original payment method. Used vouchers are not refunded.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceNetworkSpec  ModifyInstanceNetworkSpecRequest
     * @return ModifyInstanceNetworkSpecResponse
     */
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
     * @param request the request parameters of ModifyInstanceSecurityOptions  ModifyInstanceSecurityOptionsRequest
     * @return ModifyInstanceSecurityOptionsResponse
     */
    @Override
    public CompletableFuture<ModifyInstanceSecurityOptionsResponse> modifyInstanceSecurityOptions(ModifyInstanceSecurityOptionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInstanceSecurityOptions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInstanceSecurityOptionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInstanceSecurityOptionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of ECS.</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Before you use this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of ECS.</strong>
     * Before you <a href="https://help.aliyun.com/document_detail/60051.html">change the instance type of a pay-as-you-go instance</a>, you can call <a href="https://help.aliyun.com/document_detail/66187.html">DescribeResourcesModification</a> to query the instance types to which the current instance can be changed.
     * <strong>Precautions</strong></p>
     * <ul>
     * <li>Your account must not have overdue payments.</li>
     * <li>Each invoke can modify only one configuration. You can modify only the instance type or adjust only the public bandwidth in a single request.</li>
     * <li>The instance status must be <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>) before you can adjust the public bandwidth. The change takes effect immediately.</li>
     * <li>The instance status must be <strong>Stopped</strong> (<code>Stopped</code>) before you can modify the instance type. After the modification, you must <a href="https://help.aliyun.com/document_detail/25441.html">start the instance</a> for the change to take effect.<blockquote>
     * <p>The total peak public bandwidth billed on a pay-by-bandwidth basis in a single region for a single Alibaba Cloud account is subject to limits. For more information, see <a href="~~25412#BandwidthQuota~~">Public bandwidth limits</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceSpec  ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The password must be six characters in length and can contain only uppercase letters, lowercase letters, and digits. All three character types are required.</li>
     * <li>After you modify the password:<ul>
     * <li>For I/O optimized instances, the new password takes effect immediately without the need to restart the instance.</li>
     * <li>For non-I/O optimized instances, you must <a href="https://help.aliyun.com/document_detail/25440.html">restart the instance</a> in the console or call <a href="https://help.aliyun.com/document_detail/25502.html">RebootInstance</a> for the new password to take effect.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceVncPasswd  ModifyInstanceVncPasswdRequest
     * @return ModifyInstanceVncPasswdResponse
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

    /**
     * <b>description</b> :
     * <p>When you call this operation, the ECS instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</p>
     * <ul>
     * <li>When you modify the private IP address or vSwitch of an instance, note the following:<ul>
     * <li>A newly created ECS instance must be restarted before you can call this operation.</li>
     * <li>After a successful modification, the ECS instance must be restarted before you can call this operation again.</li>
     * </ul>
     * </li>
     * <li>When you modify the VPC of an instance, note the following:<ul>
     * <li><p><strong>Instance:</strong></p>
     * <ul>
     * <li>Instance status: The instance cannot be in the locked, pending release, expired, expiring, or overdue payment states. For more information, see <a href="https://help.aliyun.com/document_detail/25380.html">Instance lifetime</a>.</li>
     * <li>ECS instances associated with a load balancing instance are not supported.</li>
     * <li>The instance cannot be in use by other cloud services. For example, the instance cannot be undergoing migration, cannot already be switching VPCs, and databases deployed on the instance cannot be managed by DTS.</li>
     * </ul>
     * </li>
     * <li><p><strong>Network:</strong></p>
     * <ul>
     * <li>Instances configured with EIP-visible mode or multi-EIP-visible mode on their Elastic Network Interfaces (ENIs) are not supported.</li>
     * <li>Instances attached to a High Availability Virtual IP (HaVip) are not supported.</li>
     * <li>Instances whose vSwitch is attached to a custom route table are not supported.</li>
     * <li>Instances with Global Accelerator (GA) enabled are not supported.</li>
     * <li>Instances attached to secondary Elastic Network Interfaces (ENIs) are not supported.</li>
     * <li>Instances with IPv6 addresses allocated are not supported.</li>
     * <li>Instances whose primary network interface controller (NIC) has multiple IP addresses are not supported.</li>
     * <li>The specified vSwitch must belong to the target VPC.</li>
     * <li>The zone of the vSwitch must remain the same before and after the modification.</li>
     * <li>If you specify a private IP for the primary network interface controller (NIC), the IP address must be within the vSwitch CIDR block and available. If you do not specify one, an IP address is randomly allocated, and the target vSwitch must have sufficient available IP addresses.</li>
     * <li>If you are using a VPC shared with you by another account, make sure that the target security group is created by your account in the shared VPC, not by the VPC owner\&quot;s account.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInstanceVpcAttribute  ModifyInstanceVpcAttributeRequest
     * @return ModifyInstanceVpcAttributeResponse
     */
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

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can modify tasks with the following execution methods (see the <code>RepeatMode</code> value returned by <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocations</a>):<ul>
     * <li>Period: periodic execution.</li>
     * <li>NextRebootOnly: automatically executes the command the next time the instance starts.</li>
     * <li>EveryReboot: automatically executes the command every time the instance starts.</li>
     * </ul>
     * </li>
     * <li>You can modify tasks in the following states (see the <code>InvocationStatus</code> value returned by <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocations</a>):<ul>
     * <li>Pending: The system is verifying or sending the command. If the command execution state on at least one instance is Pending, the overall execution state is Pending.</li>
     * <li>Running: The command is running on the instance. If the command execution state on at least one instance is Running, the overall execution state is Running.</li>
     * <li>Scheduled: The scheduled command has been sent and is waiting to run. If the command execution state on at least one instance is Scheduled, the overall execution state is Scheduled.</li>
     * <li>Stopping: The task is being stopped. If the command execution state on at least one instance is Stopping, the overall execution state is Stopping.</li>
     * </ul>
     * </li>
     * <li>Before modifying scheduled task execution information (including command content, custom parameters, and execution frequency), the Cloud Assistant Agent version on the ECS instances or managed instances that have already executed the task must be later than the following versions:<ul>
     * <li>Linux: 2.2.3.541</li>
     * <li>Windows: 2.1.3.541</li>
     * <li>If the call result returns the <code>InvalidOperation.CloudAssistantVersionUnsupported</code> error code, update the Cloud Assistant Agent to the latest version.</li>
     * </ul>
     * </li>
     * <li>When you execute a Cloud Assistant common command, you cannot modify the command content <code>CommandContent</code>.</li>
     * <li>When you modify the command content <code>CommandContent</code>, and the task was created by calling <a href="https://help.aliyun.com/document_detail/64841.html">InvokeCommand</a> or <a href="https://help.aliyun.com/document_detail/141751.html">RunCommand</a> with <code>KeepCommand</code> set to <code>true</code>, a new command is created for long-term retention, which counts toward your Cloud Assistant command quota. You can retain up to 500 to 50,000 Cloud Assistant commands in a region. You can also request a quota increase. For information about how to query and increase quotas, see <a href="https://help.aliyun.com/document_detail/184116.html">Quota management</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyInvocationAttribute  ModifyInvocationAttributeRequest
     * @return ModifyInvocationAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyInvocationAttributeResponse> modifyInvocationAttribute(ModifyInvocationAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyInvocationAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyInvocationAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyInvocationAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyLaunchTemplateDefaultVersion  ModifyLaunchTemplateDefaultVersionRequest
     * @return ModifyLaunchTemplateDefaultVersionResponse
     */
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Currently, the ModifyManagedInstance operation only supports modifying the name of a managed instance.</p>
     * 
     * @param request the request parameters of ModifyManagedInstance  ModifyManagedInstanceRequest
     * @return ModifyManagedInstanceResponse
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

    /**
     * @param request the request parameters of ModifyNetworkInterfaceAttribute  ModifyNetworkInterfaceAttributeRequest
     * @return ModifyNetworkInterfaceAttributeResponse
     */
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
     * @deprecated OpenAPI ModifyPhysicalConnectionAttribute is deprecated, please use Vpc::2016-04-28::ModifyPhysicalConnectionAttribute instead.  * @param request  the request parameters of ModifyPhysicalConnectionAttribute  ModifyPhysicalConnectionAttributeRequest
     * @return ModifyPhysicalConnectionAttributeResponse
     */
    @Deprecated
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

    /**
     * <b>description</b> :
     * <p>Modifies the attributes of an O&amp;M window. When the TargetResource parameter of an O&amp;M window is set to associate ECS instances and an underlying hardware risk is detected that requires scheduled O&amp;M to mitigate, the execution time of the scheduled O&amp;M is determined based on the time range specified by the TimePeriod parameter of the O&amp;M window. When the execution time of an O&amp;M event is reached, the platform automatically performs the corresponding O&amp;M operation based on the type of the O&amp;M event.</p>
     * 
     * @param request the request parameters of ModifyPlanMaintenanceWindow  ModifyPlanMaintenanceWindowRequest
     * @return ModifyPlanMaintenanceWindowResponse
     */
    @Override
    public CompletableFuture<ModifyPlanMaintenanceWindowResponse> modifyPlanMaintenanceWindow(ModifyPlanMaintenanceWindowRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPlanMaintenanceWindow").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPlanMaintenanceWindowResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPlanMaintenanceWindowResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyPortRangeList  ModifyPortRangeListRequest
     * @return ModifyPortRangeListResponse
     */
    @Override
    public CompletableFuture<ModifyPortRangeListResponse> modifyPortRangeList(ModifyPortRangeListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyPortRangeList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyPortRangeListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyPortRangeListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>The specified Classless Inter-Domain Routing (CIDR) blocks must be in standard form. For example, 10.0.0.0/8 is a valid CIDR block, whereas 10.0.0.1/8 is a fault form. For more information, see <a href="~~40637#section-jua-0tj-q5m~~">What is CIDR?</a>.</li>
     * <li>When you add or delete entries, you cannot specify duplicate CIDR blocks. Examples:<ul>
     * <li>For IPv4 CIDR blocks: You cannot specify two entries that both have the CIDR block 10.0.0.0/8. You cannot specify two entries whose CIDR blocks are 10.0.0.1/32 and 10.0.0.1 respectively because these two CIDR blocks are duplicates.</li>
     * <li>For IPv6 CIDR blocks: You cannot specify two entries whose CIDR blocks are 2001:fd01:0:0:0:0:0:0/32 and 2001:fd01::/32 respectively because these two CIDR blocks are duplicates.</li>
     * </ul>
     * </li>
     * <li>The CIDR blocks of entries to be added cannot be the same as those of entries to be deleted. For example, when you add an entry whose CIDR block is 10.0.0.0/8, the entries to be deleted cannot contain the CIDR block 10.0.0.0/8.</li>
     * <li>To modify the description of an entry, specify the CIDR block of the entry (<code>AddEntry.N.Cidr</code>) and the new description (<code>AddEntry.N.Description</code>).</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyPrefixList  ModifyPrefixListRequest
     * @return ModifyPrefixListResponse
     */
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing methods, <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a>, and <a href="https://help.aliyun.com/document_detail/116043.html">refund rules for specification downgrades</a> of ECS.</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing methods, <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a>, and <a href="https://help.aliyun.com/document_detail/476339.html">refund rules for specification downgrades</a> of ECS.</strong>
     * This is an asynchronous operation. The configuration change takes effect after approximately 5 to 10 seconds. Before you upgrade or downgrade ECS instance type of a subscription ECS instance, you can call <a href="https://help.aliyun.com/document_detail/2679954.html">DescribeResourcesModification</a> to query ECS instance types to which the current instance can be changed.
     * <strong>Precautions</strong></p>
     * <ul>
     * <li>If the NVMe properties of the original and target instance types are different (the <code>NvmeSupport</code> property returned by <a href="https://help.aliyun.com/document_detail/2679699.html">DescribeInstanceTypes</a>) and the operating system is Windows (the <code>OSType</code> property returned by <a href="https://help.aliyun.com/document_detail/2679689.html">DescribeInstances</a>), complete the operations described in <a href="~~2978777#7de04a1c9fo50~~">Preventive measures</a> before you perform the Upgrade/Downgrade.</li>
     * <li>You cannot change the instance type of an expired instance. Complete the renewal and try again.</li>
     * <li>Downgrade the instance type:<ul>
     * <li>The instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>The price difference between the original and new instance types is refunded to your original payer. Consumed vouchers are not refundable.</li>
     * <li>The new instance type takes effect only after you <a href="https://help.aliyun.com/document_detail/25441.html">start the instance</a> following the Upgrade/Downgrade.</li>
     * </ul>
     * </li>
     * <li>Upgrade the instance type: <ul>
     * <li>The instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) or <strong>Running</strong> (<code>Running</code>) state.</li>
     * <li>The new instance type takes effect only after you <a href="https://help.aliyun.com/document_detail/25441.html">start the instance</a> or <a href="https://help.aliyun.com/document_detail/25440.html">restart the instance</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyPrepayInstanceSpec  ModifyPrepayInstanceSpecRequest
     * @return ModifyPrepayInstanceSpecResponse
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

    /**
     * @param request the request parameters of ModifyReservedInstanceAttribute  ModifyReservedInstanceAttributeRequest
     * @return ModifyReservedInstanceAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyReservedInstanceAutoRenewAttribute  ModifyReservedInstanceAutoRenewAttributeRequest
     * @return ModifyReservedInstanceAutoRenewAttributeResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. After a successful call, the IDs of the new reserved instances are returned. The original reserved instances enter the <code>Updating</code> state and eventually become <code>Expired</code>. At the same time, new reserved instances in the Creating state are generated and eventually become Active. You can call <a href="https://help.aliyun.com/document_detail/2679781.html">DescribeReservedInstances</a> to query the status.</p>
     * <ul>
     * <li>Reserved instances can be modified only when they are in the <strong>Active</strong> state.</li>
     * <li>Ensure that the <a href="~~140660#2742f3844abzz~~">normalization factor</a> remains unchanged before and after the modification. Otherwise, the request fails.</li>
     * <li>Splitting, merging, and scope changes of reserved instances cannot be performed simultaneously.
     * For more information, see <a href="https://help.aliyun.com/document_detail/100375.html">Split, merge, or modify reserved instances</a>.</li>
     * </ul>
     * <h2>Request examples</h2>
     * <ul>
     * <li><strong>Split</strong>: Split a reserved instance in the China (Hangzhou) region with instance type ecs.g5.xlarge and a quantity of 2 into two reserved instances with instance type ecs.g5.large and a quantity of 1 each.</li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;:&quot;ap-southeast-1&quot;, // Set the region
     * &quot;ReservedInstanceId&quot;:[&quot;ecsri-bp1hd03e9uv19e75****&quot;], // ID of the reserved instance to split
     * &quot;Configuration&quot;:[
     *   {
     *     &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName1&quot;, // Name of the new reserved instance
     *     &quot;InstanceType&quot;:&quot;ecs.g5.large&quot;, // Set the new instance type
     *     &quot;Scope&quot;:&quot;Region&quot;, // The scope of the reserved instance cannot be changed
     *     &quot;InstanceAmount&quot;:1 // The reserved instance can match 1 pay-as-you-go instance of the same type
     *   },
     *   {
     *     &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName2&quot;,
     *     &quot;InstanceType&quot;:&quot;ecs.g5.large&quot;,
     *     &quot;Scope&quot;:&quot;Region&quot;,
     *     &quot;InstanceAmount&quot;:1
     *   }
     * ]
     * </code></pre>
     * <ul>
     * <li><strong>Merge</strong>: Merge two reserved instances in Zone H of the China (Hangzhou) region with instance type ecs.g5.xlarge and a quantity of 4 into one reserved instance with instance type ecs.g5.4xlarge and a quantity of 2.</li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;:&quot;ap-southeast-1&quot;, // Set the region
     * &quot;ReservedInstanceId&quot;:[&quot;ecsri-bp1hd03e9uv16b75****&quot;,&quot;&quot;ecsri-bp1hd03e9uv16b76****&quot;&quot;], // IDs of the reserved instances to merge
     * &quot;Configuration&quot;:[
     *   {
     *     &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName&quot;, // Name of the new reserved instance
     *     &quot;InstanceType&quot;:&quot;ecs.g5.4xlarge&quot;, // Set the new instance type
     *     &quot;Scope&quot;:&quot;Zone&quot;, // The scope of the reserved instance cannot be changed
     *     &quot;ZoneId&quot;:&quot;ap-southeast-1a&quot;, //
     *     &quot;InstanceAmount&quot;:2 // The reserved instance can match 2 pay-as-you-go instances of the same type
     *   }
     * ]
     * </code></pre>
     * <ul>
     * <li><strong>Change scope</strong>: Change a reserved instance in Zone H of the China (Hangzhou) region with instance type ecs.g5.xlarge and a quantity of 6 to a region-level reserved instance in the China (Hangzhou) region with instance type ecs.g5.2xlarge and a quantity of 3.</li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;:&quot;ap-southeast-1&quot;, // Set the region
     * &quot;ReservedInstanceId&quot;:[&quot;ecsri-bp1hd03e9uv16b77****&quot;], // ID of the reserved instance whose scope you want to change
     * &quot;Configuration&quot;:[
     *   {
     *     &quot;ReservedInstanceName&quot;:&quot;testReservedInstanceName&quot;, // Name of the reserved instance after the scope change
     *     &quot;InstanceType&quot;:&quot;ecs.g5.2xlarge&quot;, // Set the new instance type
     *     &quot;Scope&quot;:&quot;Region&quot;, // The scope of the reserved instance after the change
     *     &quot;InstanceAmount&quot;:3 // The reserved instance can match 3 pay-as-you-go instances of the same type
     *   }
     * ]
     * </code></pre>
     * 
     * @param request the request parameters of ModifyReservedInstances  ModifyReservedInstancesRequest
     * @return ModifyReservedInstancesResponse
     */
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
     * @deprecated OpenAPI ModifyRouterInterfaceAttribute is deprecated, please use Vpc::2016-04-28::ModifyRouterInterfaceAttribute instead.  * @param request  the request parameters of ModifyRouterInterfaceAttribute  ModifyRouterInterfaceAttributeRequest
     * @return ModifyRouterInterfaceAttributeResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI ModifyRouterInterfaceSpec is deprecated, please use Vpc::2016-04-28::ModifyRouterInterfaceSpec instead.  * @param request  the request parameters of ModifyRouterInterfaceSpec  ModifyRouterInterfaceSpecRequest
     * @return ModifyRouterInterfaceSpecResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of ModifySecurityGroupAttribute  ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     */
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
     * <b>description</b> :
     * <p>When you modify a security group rule by specifying the security group rule ID, take note of the following limits:</p>
     * <ul>
     * <li>The authorization object of a security group rule can be an IPv4 Classless Inter-Domain Routing (CIDR) block (or IP address), an IPv6 CIDR block (or IP address), a security group, or a prefix list. You cannot use this operation to change the type of the authorization object of an existing security group rule. For example, if the original authorization object type is an IPv4 CIDR block, you can change it to another IPv4 CIDR block (or IP address), but you cannot change it to an IPv6 CIDR block (or IP address), a security group, or a prefix list.</li>
     * <li>You cannot change a field value from a non-empty value to an empty value. To modify security group rules in this case, increase a new rule and then delete the current rule.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupEgressRule  ModifySecurityGroupEgressRuleRequest
     * @return ModifySecurityGroupEgressRuleResponse
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

    /**
     * <b>description</b> :
     * <ul>
     * <li>Advanced security groups do not support modifying the intra-group connectivity policy. The default policy is <strong>internal isolation</strong>.</li>
     * <li>You can call <a href="https://help.aliyun.com/document_detail/25555.html">DescribeSecurityGroupAttribute</a> to query the current intra-group connectivity policy of a security group.</li>
     * <li>If the intra-group connectivity policy of a security group is <strong>intra-group connectivity</strong>, other custom access rules are ignored, and all instances in custom security group are connected over the internal network by default.  </li>
     * <li>If the intra-group connectivity policy of a security group is <strong>internal isolation</strong>, all instances in custom security group are disconnected over the internal network by default when no other access rules are added. However, you can customize security group rules to change the internal network status. For example, you can call <a href="https://help.aliyun.com/document_detail/25554.html">AuthorizeSecurityGroup</a> to allow two ECS instances in custom security group to communicate with each other over the internal network.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupPolicy  ModifySecurityGroupPolicyRequest
     * @return ModifySecurityGroupPolicyResponse
     */
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
     * <b>description</b> :
     * <p>When you modify a security group rule by specifying the security group rule ID, note the following limits:</p>
     * <ul>
     * <li>The authorization object of a security group rule can be an IPv4 Classless Inter-Domain Routing (CIDR) block (or IP address), an IPv6 CIDR block (or IP address), a security group, or a prefix list. You cannot use this operation to change the type of the authorization object of an existing security group rule. For example, if the original authorization object type is an IPv4 CIDR block, you can change it to another IPv4 CIDR block (or IP address), but you cannot change it to an IPv6 CIDR block (or IP address), a security group, or a prefix list.</li>
     * <li>You cannot change a field from a non-empty value to an empty value. To modify security group rules in this case, increase a new rule and then delete the current rule.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySecurityGroupRule  ModifySecurityGroupRuleRequest
     * @return ModifySecurityGroupRuleResponse
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

    /**
     * @param request the request parameters of ModifySnapshotAttribute  ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     */
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

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product?#/disk/detail/disk">pricing</a> of archived snapshots.</strong></p>
     * <ul>
     * <li>Archived snapshots cannot be reverted to standard snapshots.</li>
     * <li>A standard snapshot can be archived only after it has been retained for at least 14 days since its creation.</li>
     * <li>Shared snapshots, snapshots managed by cloud services, and snapshots in CloudBox cannot be archived.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySnapshotCategory  ModifySnapshotCategoryRequest
     * @return ModifySnapshotCategoryResponse
     */
    @Override
    public CompletableFuture<ModifySnapshotCategoryResponse> modifySnapshotCategory(ModifySnapshotCategoryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySnapshotCategory").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySnapshotCategoryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySnapshotCategoryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySnapshotGroup  ModifySnapshotGroupRequest
     * @return ModifySnapshotGroupResponse
     */
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

    /**
     * @param request the request parameters of ModifyStorageCapacityUnitAttribute  ModifyStorageCapacityUnitAttributeRequest
     * @return ModifyStorageCapacityUnitAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyStorageSetAttribute  ModifyStorageSetAttributeRequest
     * @return ModifyStorageSetAttributeResponse
     */
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>You can modify only scheduled O&amp;M events that are in the Scheduled state.</li>
     * <li>The value of NotBefore cannot be earlier than the current time.</li>
     * <li>The value of NotBefore cannot be later than the initial planned execution time that was set when the event was created.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySystemEventAttribute  ModifySystemEventAttributeRequest
     * @return ModifySystemEventAttributeResponse
     */
    @Override
    public CompletableFuture<ModifySystemEventAttributeResponse> modifySystemEventAttribute(ModifySystemEventAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySystemEventAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySystemEventAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySystemEventAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @deprecated OpenAPI ModifyUserBusinessBehavior is deprecated  * @param request  the request parameters of ModifyUserBusinessBehavior  ModifyUserBusinessBehaviorRequest
     * @return ModifyUserBusinessBehaviorResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI ModifyVRouterAttribute is deprecated, please use Vpc::2016-04-28::ModifyVRouterAttribute instead.  * @param request  the request parameters of ModifyVRouterAttribute  ModifyVRouterAttributeRequest
     * @return ModifyVRouterAttributeResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI ModifyVSwitchAttribute is deprecated, please use Vpc::2016-04-28::ModifyVSwitchAttribute instead.  * @param request  the request parameters of ModifyVSwitchAttribute  ModifyVSwitchAttributeRequest
     * @return ModifyVSwitchAttributeResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI ModifyVirtualBorderRouterAttribute is deprecated, please use Vpc::2016-04-28::ModifyVirtualBorderRouterAttribute instead.  * @param request  the request parameters of ModifyVirtualBorderRouterAttribute  ModifyVirtualBorderRouterAttributeRequest
     * @return ModifyVirtualBorderRouterAttributeResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI ModifyVpcAttribute is deprecated, please use Vpc::2016-04-28::ModifyVpcAttribute instead.  * @param request  the request parameters of ModifyVpcAttribute  ModifyVpcAttributeRequest
     * @return ModifyVpcAttributeResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of OpenSnapshotService  OpenSnapshotServiceRequest
     * @return OpenSnapshotServiceResponse
     */
    @Override
    public CompletableFuture<OpenSnapshotServiceResponse> openSnapshotService(OpenSnapshotServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenSnapshotService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenSnapshotServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenSnapshotServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of reserved instances.</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing method and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of reserved instances.</strong></p>
     * <ul>
     * <li>Before you call this operation, make sure that you fully understand the billing rules of reserved instances. For more information, see <a href="https://help.aliyun.com/document_detail/100371.html">Reserved instances</a>.</li>
     * <li>You can hold up to 20 regional reserved instances across all regions.</li>
     * <li>You can hold up to 20 zonal reserved instances in each zone.</li>
     * </ul>
     * <h2>Request examples</h2>
     * <ul>
     * <li>Purchase a one-year regional reserved instance in the China (Hangzhou) region to offset bills of three pay-as-you-go instances of the ecs.g5.large instance type that run Linux.</li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;:&quot;cn-hangzhou&quot;, // Set the region to China (Hangzhou).
     * &quot;InstanceType&quot;:&quot;ecs.g5.large&quot;, // Set the instance type.
     * &quot;Scope&quot;:&quot;Region&quot;, // Set the scope of the reserved instance to regional.
     * &quot;InstanceAmount&quot;:3, // The reserved instance can match three pay-as-you-go instances of the same instance type.
     * &quot;OfferingType&quot;:&quot;All Upfront&quot;, // Default value. The payment type is all upfront.
     * &quot;Platform&quot;:&quot;Linux&quot;, // The operating system type of the image used by the instance is Linux or Unix-like.
     * &quot;Period&quot;:1, // The term of the reserved instance is one year.
     * &quot;PeriodUnit&quot;:&quot;Year&quot;, // Set the unit of the term to year.
     * </code></pre>
     * <ul>
     * <li>Purchase a two-year zonal reserved instance in Zone H of the China (Hangzhou) region to offset bills of five pay-as-you-go instances of the ecs.g5.large instance type that run Windows.</li>
     * </ul>
     * <pre><code>&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,
     * &quot;ZoneId&quot;:&quot;cn-hangzhou-h&quot;, // Set the zone to Zone H.
     * &quot;InstanceType&quot;:&quot;ecs.g5.large&quot;,
     * &quot;Scope&quot;:&quot;Zone&quot;, // Set the scope of the reserved instance to zonal.
     * &quot;InstanceAmount&quot;:5, // The reserved instance can match five pay-as-you-go instances of the same instance type.
     * &quot;OfferingType&quot;:&quot;All Upfront&quot;,
     * &quot;Platform&quot;:&quot;Windows&quot;, // The operating system type of the image used by the instance is Windows.
     * &quot;Period&quot;:2, // The term of the reserved instance is two years.
     * &quot;PeriodUnit&quot;:&quot;Year&quot;, // Set the unit of the term to year.
     * </code></pre>
     * 
     * @param request the request parameters of PurchaseReservedInstancesOffering  PurchaseReservedInstancesOfferingRequest
     * @return PurchaseReservedInstancesOfferingResponse
     */
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

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/137897.html">billing</a> and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of storage capacity units (SCUs).</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/137897.html">billing</a> and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of storage capacity units (SCUs).</strong></p>
     * 
     * @param request the request parameters of PurchaseStorageCapacityUnit  PurchaseStorageCapacityUnitRequest
     * @return PurchaseStorageCapacityUnitResponse
     */
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
     * <b>description</b> :
     * <p>After you settle overdue bills for a pay-as-you-go instance, you do not need to call this operation to activate the instance. The system automatically restarts the instance and restores it to the state before the overdue payment. Automatic restart may occasionally fail. Check whether the automatic restart is successful. If the automatic restart fails, call this operation to manually restart the instance.
     * &lt;props=&quot;china&quot;&gt;- After you settle overdue bills, the total value of your Alibaba Cloud account balance (cash balance) and vouchers must be no less than CNY 100.00. Otherwise, the instance cannot be restarted.
     * &lt;props=&quot;china&quot;&gt;- The instance must be in the <strong>expired</strong> (<code>Stopped</code>) or <strong>overdue and being recycled</strong> (<code>Stopped</code>) state.
     * &lt;props=&quot;intl&quot;&gt;- The instance must be in the <strong>expired</strong> (<code>Stopped</code>) state.</p>
     * <ul>
     * <li>Instances that are locked for security reasons cannot be started by calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impact of resource security locks on API calls</a></li>
     * </ul>
     * 
     * @param request the request parameters of ReActivateInstances  ReActivateInstancesRequest
     * @return ReActivateInstancesResponse
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

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The disk must be in the <strong>In Use</strong> (<code>In_use</code>) state, and the ECS instance to which the disk is attached must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>You cannot re-initialize a disk that is attached to an instance before the instance starts for the first time.</li>
     * <li>A disk that has local snapshots cannot be re-initialized.
     * &lt;props=&quot;china&quot;&gt;- A disk with the multi-attach feature enabled cannot be re-initialized.</li>
     * <li>For a system disk, the disk is re-initialized to the initial state of the image. If the source image used to create the disk has been deleted, the disk cannot be re-initialized.</li>
     * <li>For a data disk that was created as an empty disk, the disk is re-initialized to an empty state. For a data disk that was created from a snapshot, the disk is re-initialized to the snapshot state. If the source snapshot has been deleted, the disk cannot be re-initialized and an error is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of ReInitDisk  ReInitDiskRequest
     * @return ReInitDiskResponse
     */
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
     * <b>description</b> :
     * <p>This is an asynchronous operation. After the instance is restarted, it enters the Starting state. You can call <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Running</code>, the instance is restarted.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>You cannot restart an instance that is locked for security reasons. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impacts of security lock on API operations</a>.</li>
     * <li>You can restart only ECS instances that are in the <strong>Running</strong> (<code>Running</code>) state.</li>
     * </ul>
     * 
     * @param request the request parameters of RebootInstance  RebootInstanceRequest
     * @return RebootInstanceResponse
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

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. Instance restarts are not completed immediately. After a successful call, the instance enters the Starting state. You can call <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Running</code>, the restart is successful.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Instances that are locked for security reasons cannot be restarted by calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impact of resource security locks on API calls</a>.</li>
     * <li>The ECS instance must be in the <strong>Running</strong> state.</li>
     * </ul>
     * 
     * @param request the request parameters of RebootInstances  RebootInstancesRequest
     * @return RebootInstancesResponse
     */
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
     * @deprecated OpenAPI RecoverVirtualBorderRouter is deprecated, please use Vpc::2016-04-28::RecoverVirtualBorderRouter instead.  * @param request  the request parameters of RecoverVirtualBorderRouter  RecoverVirtualBorderRouterRequest
     * @return RecoverVirtualBorderRouterResponse
     */
    @Deprecated
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

    /**
     * <b>description</b> :
     * <p>When a dedicated host is in the alert state (<code>UnderAssessment</code>), which indicates a latent fault, call this operation to perform fault migration for the dedicated host to prevent permanent failures. You can call <a href="https://help.aliyun.com/document_detail/134242.html">DescribeDedicatedHosts</a> to query the status of a dedicated host.</p>
     * 
     * @param request the request parameters of RedeployDedicatedHost  RedeployDedicatedHostRequest
     * @return RedeployDedicatedHostResponse
     */
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>RedeployInstance is an asynchronous invocation that restarts and migrates an instance. After the deployment succeeds, the instance enters the Running state. If the deployment failed, the instance is returned to the original physical server and recovers to the state before the deployment.
     * When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>The target instance must be in the Running or Stopped state. The instance status changes after the operation is invoked:<ul>
     * <li>An instance in the Running state enters the Stopping state.</li>
     * <li>An instance in the Stopped state enters the Starting state.</li>
     * </ul>
     * </li>
     * <li>Instances on dedicated hosts cannot be redeployed.</li>
     * <li>If <code>&quot;LockReason&quot;: &quot;security&quot;</code> is marked in the OperationLocks of a security-controlled instance, the instance cannot be redeployed.</li>
     * <li>Simulated events created by invoking CreateSimulatedSystemEvent cannot be responded to.</li>
     * <li>During the flow of isolating a local disk in a system event, you can also invoke RedeployInstance when the damaged local disk has been isolated but the <strong>SystemMaintenance.RebootAndReInitErrorDisk</strong> event has not been sent. For more information, see <a href="https://help.aliyun.com/document_detail/107693.html">Overview of local disk instance system events</a>.
     * The following table describes the system event types and event states that RedeployInstance can response to.<table>
     * <thead>
     * <tr>
     * <th>Event name and parameter</th>
     * <th>Event status</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Instance restart due to system maintenance (SystemMaintenance.Reboot)</td>
     * <td>Inquiring, Scheduled</td>
     * </tr>
     * <tr>
     * <td>Instance redeployment due to system maintenance (SystemMaintenance.Redeploy)</td>
     * <td>Inquiring, Scheduled</td>
     * </tr>
     * <tr>
     * <td>Instance restart and damaged disk replacement due to system maintenance (SystemMaintenance.RebootAndIsolateErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td>Instance restart and damaged disk reinitialization due to system maintenance (SystemMaintenance.RebootAndReInitErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td>Instance redeployment due to system fault (SystemFailure.Redeploy)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td>Only for ECS instances with local disks: Instance restart due to system fault (SystemFailure.Reboot)</td>
     * <td>Executing</td>
     * </tr>
     * <tr>
     * <td>Damaged disk isolation due to system maintenance (SystemMaintenance.IsolateErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * <tr>
     * <td>Damaged disk reinitialization due to system maintenance (SystemMaintenance.ReInitErrorDisk)</td>
     * <td>Inquiring</td>
     * </tr>
     * </tbody></table>
     * <blockquote>
     * <p>Redeploying an instance with local disks reinitializes the local disks, and all data on the storage devices is cleared.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of RedeployInstance  RedeployInstanceRequest
     * @return RedeployInstanceResponse
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
     * <b>description</b> :
     * <p>For an immediately effective capacity reservation whose release mode is set to manual release, you can call this operation to directly release the capacity reservation.</p>
     * 
     * @param request the request parameters of ReleaseCapacityReservation  ReleaseCapacityReservationRequest
     * @return ReleaseCapacityReservationResponse
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
     * <b>description</b> :
     * <p>Before you release a pay-as-you-go dedicated host, make sure that no ECS instances exist on the host.</p>
     * 
     * @param request the request parameters of ReleaseDedicatedHost  ReleaseDedicatedHostRequest
     * @return ReleaseDedicatedHostResponse
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
     * @deprecated OpenAPI ReleaseEipAddress is deprecated, please use Vpc::2016-04-28::ReleaseEipAddress instead.  * @param request  the request parameters of ReleaseEipAddress  ReleaseEipAddressRequest
     * @return ReleaseEipAddressResponse
     */
    @Deprecated
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

    /**
     * @deprecated OpenAPI ReleasePublicIpAddress is deprecated  * @param request  the request parameters of ReleasePublicIpAddress  ReleasePublicIpAddressRequest
     * @return ReleasePublicIpAddressResponse
     */
    @Deprecated
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
     * @param request the request parameters of RemoveBandwidthPackageIps  RemoveBandwidthPackageIpsRequest
     * @return RemoveBandwidthPackageIpsResponse
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

    /**
     * @deprecated OpenAPI RemoveTags is deprecated, please use Ecs::2014-05-26::UntagResources instead.  * @param request  the request parameters of RemoveTags  RemoveTagsRequest
     * @return RemoveTagsResponse
     */
    @Deprecated
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>&lt;props=&quot;china&quot;&gt;When you renew a dedicated host, deductible vouchers are used first. Your account must support balance payment or credit payment.
     * &lt;props=&quot;intl&quot;&gt;When you renew a dedicated host, deductible vouchers are used first. Your account must support balance payment or credit payment.</p>
     * 
     * @param request the request parameters of RenewDedicatedHosts  RenewDedicatedHostsRequest
     * @return RenewDedicatedHostsResponse
     */
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

    /**
     * @param request the request parameters of RenewElasticityAssurances  RenewElasticityAssurancesRequest
     * @return RenewElasticityAssurancesResponse
     */
    @Override
    public CompletableFuture<RenewElasticityAssurancesResponse> renewElasticityAssurances(RenewElasticityAssurancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RenewElasticityAssurances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RenewElasticityAssurancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RenewElasticityAssurancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>Before you use this operation, make sure that you fully understand the billing and &lt;props=&quot;china&quot;&gt;<a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/product/ecs#pricing">pricing</a> of Elastic Compute Service (ECS).</em>*</p>
     * <ul>
     * <li>Make sure that your account balance or credit limit is sufficient.</li>
     * <li>Only subscription instances are supported. Invoking this operation for pay-as-you-go instances returns an error.</li>
     * <li>You must specify either the renewal period parameters (Period and PeriodUnit) or the unified expiration date parameter (ExpectedRenewDay), but not both.</li>
     * </ul>
     * 
     * @param request the request parameters of RenewInstance  RenewInstanceRequest
     * @return RenewInstanceResponse
     */
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

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of reserved instances.</strong>
     * &lt;props=&quot;intl&quot;&gt;
     * <strong>Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of reserved instances.</strong></p>
     * <ul>
     * <li>Reserved instances support both manual renewal and auto-renewal. For more information, see <a href="~~100371#53bfc50b78sta~~">Renewal policy for reserved instances</a>.</li>
     * <li>You can invoke <a href="https://help.aliyun.com/document_detail/100065.html">DescribeReservedInstances</a> to query purchased reserved instances.</li>
     * <li>This operation supports enabling auto-renewal but does not support disabling auto-renewal. You can invoke <a href="https://help.aliyun.com/document_detail/2679786.html">ModifyReservedInstanceAutoRenewAttribute</a> to disable auto-renewal.</li>
     * </ul>
     * 
     * @param request the request parameters of RenewReservedInstances  RenewReservedInstancesRequest
     * @return RenewReservedInstancesResponse
     */
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

    /**
     * <b>description</b> :
     * <p>Before you call this operation, read <a href="https://help.aliyun.com/document_detail/50134.html">Replace the system disk (replace the operating system)</a>.
     * When you replace the system disk, take note of the following items:</p>
     * <ul>
     * <li><p>You cannot change the billing method of the system disk.</p>
     * </li>
     * <li><p>You cannot change the disk type of the system disk.</p>
     * </li>
     * <li><p>The ECS instance to which the system disk is attached must not have unpaid orders. </p>
     * </li>
     * <li><p>The instance must be in the Stopped (<code>Stopped</code>) state.</p>
     * <blockquote>
     * <p>This applies only to instances in virtual private clouds (VPCs). If the ECS instance uses the pay-as-you-go billing method and has the economical mode enabled by default, set the instance to the standard stop mode when you stop the instance to prevent the instance from failing to restart after the system disk is replaced due to insufficient resources in the region. For more information, see <a href="https://help.aliyun.com/document_detail/25501.html">StopInstance</a>.</p>
     * </blockquote>
     * </li>
     * <li><p>You can use the <code>SystemDisk.Size</code> parameter to specify a new capacity for the system disk. The new capacity cannot be smaller than the original capacity.</p>
     * </li>
     * <li><p>If the ECS instance is locked for security purposes, which means the <code>OperationLocks</code> parameter of the instance contains <code>&quot;LockReason&quot;: &quot;security&quot;</code>, the system disk cannot be replaced. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">API behavior when an instance is locked for security reasons</a>.
     * After the system disk is replaced, you can call the <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> operation to check the status of the instance and verify whether the replacement is successful. If the <code>OperationLocks</code> response parameter is empty, the system disk replacement is complete.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceSystemDisk  ReplaceSystemDiskRequest
     * @return ReplaceSystemDiskResponse
     */
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

    /**
     * @param request the request parameters of ReportInstancesStatus  ReportInstancesStatusRequest
     * @return ReportInstancesStatusResponse
     */
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
     * <b>description</b> :
     * <p>Before you call this operation, read <a href="https://help.aliyun.com/document_detail/25450.html">Roll back a disk by using a snapshot</a>.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The cloud disk must be in the In Use (<code>In_use</code>) or Available (<code>Available</code>) state.  </li>
     * <li>The instance to which the cloud disk is attached must be in the Stopped (<code>Stopped</code>) state. You can call <a href="https://help.aliyun.com/document_detail/155372.html">StopInstances</a> to stop an instance.  </li>
     * <li>The specified <code>SnapshotId</code> parameter must be a historical snapshot created from the cloud disk specified by <code>DiskId</code>.  </li>
     * <li>When you call <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> to query ECS instance information, if the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code>, all operations are prohibited.</li>
     * </ul>
     * 
     * @param request the request parameters of ResetDisk  ResetDiskRequest
     * @return ResetDiskResponse
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

    /**
     * <b>description</b> :
     * <ul>
     * <li>Resource Access Management (RAM) users require the <code>AliyunECSFullAccess</code> permission. For more information about authorization, see <a href="https://help.aliyun.com/document_detail/116146.html">Grant permissions to a RAM user</a>.</li>
     * <li>The <strong>account-level default encryption of block storage</strong> feature must be enabled in the specified region.</li>
     * </ul>
     * 
     * @param request the request parameters of ResetDiskDefaultKMSKeyId  ResetDiskDefaultKMSKeyIdRequest
     * @return ResetDiskDefaultKMSKeyIdResponse
     */
    @Override
    public CompletableFuture<ResetDiskDefaultKMSKeyIdResponse> resetDiskDefaultKMSKeyId(ResetDiskDefaultKMSKeyIdRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetDiskDefaultKMSKeyId").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetDiskDefaultKMSKeyIdResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetDiskDefaultKMSKeyIdResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is about to be deprecated. Use <a href="https://help.aliyun.com/document_detail/25520.html">ResetDisk</a> to roll back cloud disks.</p>
     * 
     * @param request the request parameters of ResetDisks  ResetDisksRequest
     * @return ResetDisksResponse
     */
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

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before expanding a disk, query the partition format of the disk. If the disk uses the MBR partition format, you cannot expand the disk to more than 2 TiB. Otherwise, data loss may occur. To expand an MBR-partitioned disk, create and attach a new data disk that uses the GUID Partition Table (GPT) format, and then copy the existing data to the new data disk. For more information, see <a href="https://help.aliyun.com/document_detail/44986.html">Expand a disk</a>.</p>
     * </blockquote>
     * <ul>
     * <li>Supported disk types include basic disks (<code>cloud</code>), ultra disks (<code>cloud_efficiency</code>), standard SSDs (<code>cloud_ssd</code>), enterprise SSDs (<code>cloud_essd</code>)&lt;props=&quot;china&quot;&gt;<ph>, ESSD Entry disks (cloud_essd_entry)</ph>, ESSD AutoPL disks (cloud_auto), elastic ephemeral disks - Standard (elastic_ephemeral_disk_standard), elastic ephemeral disks - Premium (elastic_ephemeral_disk_premium), and regional ESSDs (cloud_regional_disk_auto).</li>
     * <li>You cannot expand a disk while a snapshot is being created for the disk. Wait until the snapshot is created before you expand the disk.</li>
     * <li>This operation does not expand partitions or file systems. After you expand the disk capacity, you must allocate partitions and file systems. For more information, see <a href="~~2949817#bb3b1f02e51pj~~">Expand partitions and file systems (Linux)</a> and <a href="~~2932233#a9f9b78f3fujb~~">Expand partitions and file systems (Windows)</a>.</li>
     * <li>Disks that have the multi-attach feature enabled support both online and offline expansion. Make sure that the instances to which the disk is attached meet the following requirements:<ul>
     * <li>For online scale-out, the instance status must be <strong>Running</strong> (<code>Running</code>).</li>
     * <li>For offline scale-out, the instance status must be <strong>Running</strong> (<code>Running</code>) or <strong>Stopped</strong> (<code>Stopped</code>).</li>
     * </ul>
     * </li>
     * <li>Make sure that the disk meets the following requirements:<ul>
     * <li>The disk is in the In Use (<code>In Use</code>) or Available (<code>Available</code>) state.</li>
     * <li>(Strongly recommended) You have created a snapshot of the disk to back up data. For more information, see <a href="https://help.aliyun.com/document_detail/25455.html">Create a snapshot</a>.</li>
     * <li>If the data disk is newly purchased, initialize the data disk before you expand it. For more information, see <a href="https://help.aliyun.com/document_detail/466323.html">Initialization overview</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ResizeDisk  ResizeDiskRequest
     * @return ResizeDiskResponse
     */
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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: On July 8, 2024, Alibaba Cloud adjusted the validation rules for this operation. When you attempt to delete a security group rule that does not exist, the operation now returns the error code &quot;InvalidParam.SecurityGroupRuleId&quot; instead of a success response. Update your error code handling to be compatible with this change promptly to avoid impacts on your online services.
     * This operation supports two methods to pass parameters for deleting rules:</p>
     * </blockquote>
     * <ul>
     * <li>Delete rules by specifying security group rule IDs (recommended).<ul>
     * <li>If a specified security group rule ID does not exist, the invocation is failed.</li>
     * </ul>
     * </li>
     * <li>Delete rules by specifying Permissions.<ul>
     * <li>If no matching security group rule exists, the invocation succeeds but no rule is deleted.</li>
     * <li>The following parameters are required to identify an inbound rule:<ul>
     * <li>Source Settings: specify one of SourceCidrIp (IPv4 address), Ipv6SourceCidrIp (IPv6 address), SourcePrefixListId (prefix list ID), or SourceGroupId (source security group).</li>
     * <li>Destination port range: PortRange.</li>
     * <li>Protocol type: IpProtocol.</li>
     * <li>Access policy: Policy.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You cannot specify both security group rule IDs and Permissions at the same time.</p>
     * </blockquote>
     * <h3>Request examples</h3>
     * <ul>
     * <li>Delete by specifying security group rule IDs.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;, // Specify the security group ID.
     * &quot;SecurityGroupRuleId&quot;:[&quot;sgr-bpdfmk****&quot;,&quot;sgr-bpdfmg****&quot;] // Specify the security group rule IDs.
     * </code></pre>
     * <ul>
     * <li>Delete by specifying an IP address range.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;SourceCidrIp&quot;:&quot;10.0.0.0/8&quot;, // Specify the source IP address range.
     *     &quot;IpProtocol&quot;:&quot;TCP&quot;, // Specify the protocol type.
     *     &quot;PortRange&quot;:&quot;80/80&quot;, // Specify the destination port range.
     *     &quot;Policy&quot;:&quot;accept&quot; // Specify the access policy.
     *   }
     * ]
     * </code></pre>
     * <ul>
     * <li>Delete by specifying another security group.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;SourceGroupId&quot;:&quot;sg-bp67acfmxa123b****&quot;, // Specify the source security group ID.
     *     &quot;IpProtocol&quot;:&quot;TCP,&quot;
     *     &quot;PortRange&quot;:&quot;80/80&quot;,
     *     &quot;Policy&quot;:&quot;accept&quot;
     *   ]
     * }
     * </code></pre>
     * <ul>
     * <li>Delete by specifying a prefix list.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;SourcePrefixListId&quot;:pl-x1j1k5ykzqlixdcy****&quot;, // Specify the source prefix list ID.
     *     &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *     &quot;PortRange&quot;:&quot;80/80&quot;,
     *     &quot;Policy&quot;:&quot;accept&quot;
     *   }
     * ]
     * </code></pre>
     * 
     * @param request the request parameters of RevokeSecurityGroup  RevokeSecurityGroupRequest
     * @return RevokeSecurityGroupResponse
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

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: On July 8, 2024, Alibaba Cloud adjusted the validation rules for this operation. When you attempt to delete a security group rule that does not exist, the operation now returns the error code &quot;InvalidSecurityGroupRule.RuleNotExist&quot; instead of a success response. Make sure that your application is compatible with this fault code to avoid impacts on your workloads.
     * You can use one of the following methods to pass parameters to delete security group rules:</p>
     * </blockquote>
     * <ul>
     * <li>Delete rules by specifying security group rule IDs (recommended).<ul>
     * <li>If a specified security group rule ID does not exist, an error is returned.</li>
     * </ul>
     * </li>
     * <li>Delete rules by specifying the Permissions parameter.<ul>
     * <li>If no matching security group rule exists, the invocation succeeds but no rule is deleted.</li>
     * <li>The following parameters are required to delete a security group rule:<ul>
     * <li>Destination: Set one of DestCidrIp (IPv4 address), Ipv6DestCidrIp (IPv6 address), DestPrefixListId (prefix list ID), or DestGroupId (destination security group).</li>
     * <li>Destination port range: PortRange.</li>
     * <li>Protocol type: IpProtocol.</li>
     * <li>Access policy: Policy.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You cannot specify both security group rule IDs and the Permissions parameter at the same time.</p>
     * </blockquote>
     * <h3>Request examples</h3>
     * <ul>
     * <li>Delete by security group rule ID.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4p****&quot;, // Specify the security group ID.
     * &quot;SecurityGroupRuleId&quot;:[&quot;sgr-bpdfmk****&quot;,&quot;sgr-bpdfmg****&quot;] // Specify the security group rule IDs.
     * </code></pre>
     * <ul>
     * <li>Delete by IP CIDR block.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4ph***&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;IpProtocol&quot;:&quot;TCP&quot;, // Specify the protocol type.
     *     &quot;DestCidrIp&quot;:&quot;10.0.0.0/8&quot;, // Specify the destination IP CIDR block.
     *     &quot;PortRange&quot;:&quot;22/22&quot;, // Specify the destination port range.
     *     &quot;Policy&quot;:&quot;accept&quot; // Specify the access policy.
     *   }
     * ]
     * </code></pre>
     * <ul>
     * <li>Delete by destination security group.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4ph***&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;DestGroupId&quot;:&quot;sg-bp67acfmxa123b****&quot;, // Specify the destination security group ID.
     *     &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *     &quot;PortRange&quot;:&quot;22/22&quot;,
     *     &quot;Policy&quot;:&quot;accept&quot;
     *   }
     * ]
     * </code></pre>
     * <ul>
     * <li>Delete by prefix list.</li>
     * </ul>
     * <pre><code>&quot;SecurityGroupId&quot;:&quot;sg-bp67acfmxazb4ph***&quot;,
     * &quot;Permissions&quot;:[
     *   {
     *     &quot;IpProtocol&quot;:&quot;TCP&quot;,
     *     &quot;DestPrefixListId&quot;:&quot;pl-x1j1k5ykzqlixdcy****&quot;, // Specify the destination prefix list ID.
     *     &quot;PortRange&quot;:&quot;22/22&quot;,
     *     &quot;Policy&quot;:&quot;accept&quot;,
     *   }
     * ]
     * </code></pre>
     * 
     * @param request the request parameters of RevokeSecurityGroupEgress  RevokeSecurityGroupEgressRequest
     * @return RevokeSecurityGroupEgressResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. After the request is sent successfully, you can call <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocations</a> or <a href="https://help.aliyun.com/document_detail/2679916.html">DescribeInvocationResults</a> to query the execution results by using the returned command ID or invocation ID.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>The target instance must be in the Running state. You can call <a href="https://help.aliyun.com/document_detail/25506.html">DescribeInstances</a> to query the instance status.</li>
     * <li>The target instance must have <a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a> installed. You can install it by calling <a href="https://help.aliyun.com/document_detail/2679925.html">InstallCloudAssistant</a> and query the installation status by calling <a href="https://help.aliyun.com/document_detail/2679924.html">DescribeCloudAssistantStatus</a>.<blockquote>
     * <p>ECS instances created from public images after December 1, 2017 have Cloud Assistant Agent pre-installed by default.</p>
     * </blockquote>
     * </li>
     * <li>To run PowerShell commands, ensure that the Windows operating system on the target ECS instance has the PowerShell module configured.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>In a single region, you can retain 500 to 50,000 Cloud Assistant commands. You can also request a quota increase. For more information, see <a href="https://help.aliyun.com/document_detail/184116.html">Quota management</a>.</li>
     * <li>The Cloud Assistant Agent version must be no earlier than the following versions to support new features of scheduled tasks (execution at fixed intervals, one-time execution at a specified time, and Cron-based scheduled execution with year or time zone specified). If the <code>ClientNeedUpgrade</code> error code is returned, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for Cloud Assistant Agent</a> to update the agent to the latest version.
     * - Linux: 2.2.3.282
     * - Windows: 2.1.3.282</li>
     * <li>When you run a Cron-based scheduled task with a specified time zone, the scheduled execution time is based on the specified time zone. When you do not specify a time zone, the scheduled execution time is based on the system time zone of the ECS instance, and the execution time is determined by the system time of the instance. Ensure that the time or time zone of the ECS instance is consistent with your expectations. For more information about time zones, see <a href="https://help.aliyun.com/document_detail/92803.html">Configure the time zone and NTP service for a Linux instance</a> or <a href="https://help.aliyun.com/document_detail/51890.html">Configure the NTP service for a Windows instance</a>.</li>
     * </ul>
     * <h3>Recommendations</h3>
     * <ul>
     * <li><strong>Timeout settings</strong>: You can specify the <code>Timeout</code> parameter to set the maximum timeout period for command execution on an ECS instance. When a command times out, Cloud Assistant Agent forcefully stops the process.<ul>
     * <li>After a one-time execution times out, the execution status (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) changes to execution fault (Failed).</li>
     * <li>For scheduled executions, the timeout period applies to each execution record. A timeout in the previous execution does not affect the next execution. After a timeout occurs, the execution status (<a href="https://help.aliyun.com/document_detail/64845.html">InvokeRecordStatus</a>) changes to execution fault (Failed).</li>
     * </ul>
     * </li>
     * <li><strong>Execution failures</strong>: A command may fail to execute due to abnormal target instance status, network exceptions, or Cloud Assistant Agent exceptions. When a command fails to execute, no execution information is generated. For more information, see <a href="https://help.aliyun.com/document_detail/87029.html">Common errors and solutions for execution failures</a>.</li>
     * <li><strong>Custom parameters</strong>: When <code>EnableParameter=true</code>, the custom parameter feature is enabled. When setting <code>CommandContent</code>, you can define custom parameters in the <code>{{parameter}}</code> format and pass in custom parameter key-value pairs when running the command.</li>
     * </ul>
     * 
     * @param request the request parameters of RunCommand  RunCommandRequest
     * @return RunCommandResponse
     */
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
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * Creating instances incurs charges. Billable items include <a href="https://help.aliyun.com/document_detail/25398.html">instance types</a>, <a href="https://help.aliyun.com/document_detail/179021.html">images</a>, <a href="https://help.aliyun.com/document_detail/179022.html">block storage</a>, and <a href="https://help.aliyun.com/document_detail/25411.html">public bandwidth</a>. Before using this operation, make sure that you fully understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of ECS.
     * &lt;props=&quot;intl&quot;&gt;Before using this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/zh/pricing-calculator#/commodity/vm_intl">pricing</a> of ECS.
     * This is an asynchronous operation. After the instance creation request is sent, the instance IDs are returned. The instance creation and startup are not completed immediately. You can call <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query instance information. When the returned status is <code>Running</code>, the instances are created and started.</p>
     * <h3>Before you begin</h3>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Make sure that your account has passed real-name registration. For more information, refer to <a href="https://help.aliyun.com/document_detail/48263.html">Real-name registration</a>.</li>
     * <li>When the resource inventory is insufficient to complete the current instance creation, Alibaba Cloud immediately sends an instance creation failure event (SystemFailure.Delete). You can call <a href="https://help.aliyun.com/document_detail/2679897.html">DescribeInstanceHistoryEvents</a> to check whether an instance creation failure event exists. For more information, refer to <a href="https://help.aliyun.com/document_detail/2545990.html">Instance creation failure events</a>.</li>
     * <li>Make sure that the total number of instances you create or the total vCPUs across all instance types does not exceed the system quota. For more information, refer to <a href="https://quotas.console.aliyun.com/products/ecs/quotas">Quota Center</a>.</li>
     * <li>Before creating VPC-type instances, <a href="https://help.aliyun.com/document_detail/65430.html">create a VPC</a> in the corresponding Alibaba Cloud region.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li>If the billing method of the instance is subscription (<code>PrePaid</code>), your available coupon is used by default during payment.</li>
     * <li>A single request can create up to 100 instances. If you need more than 100 instances, invoke requests in batches or concurrently.</li>
     * <li>If the value of the <code>InternetMaxBandwidthOut</code> parameter is greater than 0, a public IP address is automatically allocated to the instance.<blockquote>
     * <p>In a single region, the total peak pay-by-bandwidth public bandwidth for a single Alibaba Cloud account is limited. For more information, refer to <a href="~~25412#BandwidthQuota~~">Public bandwidth limits</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * <h3>Suggestions</h3>
     * <ul>
     * <li><strong>Test scenarios</strong>: Send a dry run request by setting <code>DryRun=true</code>.</li>
     * <li><strong>Release instances</strong>: Set the automatic release time by using the <code>AutoReleaseTime</code> parameter, or invoke <a href="https://help.aliyun.com/document_detail/2679710.html">DeleteInstances</a> to perform manual release.</li>
     * <li><strong>Management and retrieval</strong>: Specify tags (<code>Tag.N.Key</code> and <code>Tag.N.Value</code>) for each batch of instances, and add sequential suffixes (<code>UniqueSuffix</code>) to hostnames (<code>HostName</code>) and instance names (<code>InstanceName</code>). For more information, refer to <a href="https://help.aliyun.com/document_detail/196048.html">Batch configure sequential names or hostnames for instances</a>.</li>
     * <li><strong>Launch templates</strong>: Use launch templates to avoid specifying a large number of configuration parameters each time you create instances. Create a launch template by invoking <a href="https://help.aliyun.com/document_detail/2679729.html">CreateLaunchTemplate</a>, and then specify <code>LaunchTemplateId</code> and <code>LaunchTemplateVersion</code> in the <code>RunInstances</code> request.</li>
     * <li><strong>Disable hyper-threading</strong>: In memory-intensive scenarios, set <code>CpuOptions.ThreadsPerCore=1</code> to disable hyper-threading and increase the memory-to-vCPU ratio.</li>
     * <li><strong>Enable jumbo frames</strong>: Specify <code>NetworkOptions.EnableJumboFrame=true</code> to enable the <code>Jumbo frame</code> attribute when creating instances. For more information, refer to <a href="https://help.aliyun.com/document_detail/200512.html">ECS instance MTU</a>.</li>
     * </ul>
     * <h2>Request examples</h2>
     * <p>Assume that you want to create ECS instances in the China (Hangzhou) region. You want to use a specific image, instance type, security group, and vSwitch, configure system and data disks with specific capacities, allocate public IP addresses, and set instance names and passwords. The relevant request parameters are as follows:</p>
     * <pre><code>RegionId:&quot;cn-hangzhou&quot;, //Set the China (Hangzhou) region
     * ImageId:&quot;aliyun_3_x64_20G_alibase_20221102.vhd&quot;, //Set the image ID
     * InstanceType:&quot;ecs.g7.large&quot;, //Set the instance type
     * SecurityGroupId:&quot;sg-bp150uqocpf9jj70****&quot;, //Set the security group ID
     * VSwitchId:&quot;vsw-bp1qo7s91cbch5i4l****&quot;, //Set the vSwitch ID
     * SystemDisk:{
     *   Category:&quot;cloud_essd&quot;, //Set the system disk category to enterprise SSD
     *   Size:40, //Set the system disk size to 40 GiB
     * },
     * DataDisk:[
     *   {
     *     Category:&quot;cloud_essd&quot;, //Set the data disk category to enterprise SSD
     *     Size:100, //Set the data disk size to 100 GiB
     *   }
     * ],
     * HostName:&quot;ECS-test&quot;, //Set the instance hostname
     * Password:&quot;ECS@test1234&quot;, //Set the instance logon password
     * InternetMaxBandwidthOut:10 //Set the outbound public bandwidth to 10 Mbit/s
     * </code></pre>
     * <p>Based on the preceding configurations, create different types of instances:</p>
     * <details>
     * <summary>Example: Create 5 subscription instances with auto-renewal</summary>
     * ```
     * Amount:5, //Create 5 instances
     * InstanceChargeType:"PrePaid", //Subscription
     * PeriodUnit:"Month", //Set the unit to month
     * Period:1, //Set the duration to 1 month
     * AutoRenew:true, //Enable auto-renewal
     * AutoRenewPeriod:1 //Set the auto-renewal period to 1 month
     * ```
     * </details>
     * <details>
     * <summary>Example: Create 10 pay-as-you-go instances</summary>
     * ```
     * Amount:10, //Create 10 instances
     * InstanceChargeType:"PostPaid", //Pay-as-you-go
     * SpotStrategy:"NoSpot" //Default value, Normal pay-as-you-go
     * ```
     * </details>
     * <details>
     * <summary>Example: Create 20 spot instances with a bidding policy and retention period</summary>
     * ```
     * Amount:20, //Create 20 instances
     * InstanceChargeType:"PostPaid",
     * SpotStrategy:"SpotAsPriceGo", //Automatically bid based on the current marketplace price
     * SpotDuration:1 //Set the retention period to 1 hour
     * ```
     * </details>
     * Assume that you have created a launch template by invoking [CreateLaunchTemplate](https://help.aliyun.com/document_detail/2679729.html) and want to use the template to create ECS instances in the China (Hangzhou) region. Example:
     * <details>
     * <summary>Example: Create 10 ECS instances based on a launch template</summary>
     * ```
     * RegionId:"cn-hangzhou", //Set the China (Hangzhou) region
     * Amount:10, //Create 10 instances
     * LaunchTemplateId:"lt-bp14xczpoxvb6rre****" //Set the launch template ID
     * ```
     * </details>
     * >Notice: If both instance parameters and template parameters are specified, the instance parameters take precedence. For example, if the billing method in the template is subscription but `InstanceChargeType` is set to `PostPaid`, the created instances are pay-as-you-go.
     * <details>
     * <summary>Example: Create 1 instance by using a full image (a whole-machine image that includes system and data disks)</summary>
     * ```
     * RegionId:"cn-hangzhou", //Set the China (Hangzhou) region
     * ImageId = m-bp13ohd32cvzpq9e****,//Custom image ID
     * InstanceType = ecs.u1-c1m1.large,//Instance type
     * SecurityGroupId = sg-bp10jztp6b0sdsyl****,//Security group ID
     * VSwitchId = vsw-bp19wo63nleroq22g****,//vSwitch ID
     * SystemDisk.Size = 50,//Set the size of the system disk included in the full image
     * SystemDisk.Category = cloud_auto,//Set the category of the system disk included in the full image
     * DataDisk.1.Device = /dev/xvdb,//Set the attach point of the data disk included in the full image
     * DataDisk.1.Size = 50,//Set the size of the data disk included in the full image
     * DataDisk.1.Category = cloud_essd,//Set the category of the data disk included in the full image
     * DataDisk.2.Device = /dev/xvdc,//Attach point of the new data disk. To replace the data disk included in the full image with a new data disk, set DataDisk.1.Device = /dev/xvdb (the default attach point of the data disk in the full image).
     * DataDisk.2.Size = 70,//Size of the new data disk
     * DataDisk.2.Category = cloud_auto,//Category of the new data disk
     * ```
     * </details>
     * 
     * @param request the request parameters of RunInstances  RunInstancesRequest
     * @return RunInstancesResponse
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation sends a diagnostic interrupt to an ECS instance that is inaccessible or unresponsive, manually triggering an operating system crash and generating a memory dump file (crash dump).</li>
     * <li>Sending a diagnostic interrupt triggers an operating system crash and restart, which may cause data loss. Proceed with caution.</li>
     * <li>The generated dump file can be used for root cause analysis and debugging instance issues.</li>
     * <li>Ensure that the required configurations (such as the kdump service and NMI response) are completed in the instance operating system in advance. Otherwise, a dump file may not be generated.</li>
     * <li>ECS Bare Metal instances do not support this feature.</li>
     * <li>If the instance system disk does not have sufficient space, the dump file may not be saved completely. The disk space may even be fully consumed, which prevents the instance from starting properly after the restart because the system disk is full.</li>
     * </ul>
     * 
     * @param request the request parameters of SendDiagnosticInterrupt  SendDiagnosticInterruptRequest
     * @return SendDiagnosticInterruptResponse
     */
    @Override
    public CompletableFuture<SendDiagnosticInterruptResponse> sendDiagnosticInterrupt(SendDiagnosticInterruptRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SendDiagnosticInterrupt").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SendDiagnosticInterruptResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SendDiagnosticInterruptResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>The target ECS instances must be in the running state.</li>
     * <li>Cloud Assistant Agent must be installed on the target ECS instances. For more information, see <a href="https://help.aliyun.com/document_detail/64921.html">Cloud Assistant Agent</a>.</li>
     * <li>The Cloud Assistant Agent version must be later than the following versions to support file sending. If the <code>ClientNeedUpgrade</code> error code is returned, update the agent to the latest version.<ul>
     * <li>Linux: 1.0.2.569</li>
     * <li>Windows: 1.0.0.149</li>
     * </ul>
     * </li>
     * <li>The file content cannot exceed 32 KB after Base64 encoding.</li>
     * <li>File sending may fail due to exceptions in the target ECS instance status, network issues, or Cloud Assistant Agent exceptions. Call <a href="https://help.aliyun.com/document_detail/184117.html">DescribeSendFileResults</a> or refer to <a href="https://help.aliyun.com/document_detail/87029.html">Common errors and solutions for execution failures</a> to troubleshoot issues.</li>
     * </ul>
     * 
     * @param request the request parameters of SendFile  SendFileRequest
     * @return SendFileResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>After an image template is created, call this operation to execute an image building task. The system builds, distributes, and creates shared images based on the parameters specified in the image template.</li>
     * <li>For the same image template, only one image building task can be executed at a time. You can call CancelImagePipelineExecution multiple times simultaneously, and canceling an image building task does not interfere with other image building tasks.</li>
     * <li>When you execute an image template, multiple intermediate instances are created to help build images. The intermediate instances are ECS instances that use the pay-as-you-go billing method, and billing fees are incurred. For more information, see <a href="https://help.aliyun.com/document_detail/40653.html">Pay-as-you-go</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of StartImagePipelineExecution  StartImagePipelineExecutionRequest
     * @return StartImagePipelineExecutionResponse
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

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. The instance does not start immediately after a successful call. The instance first enters the Starting state. Call <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Running</code>, the instance is started.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Instances that are locked for security reasons cannot be started by calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impact of resource security locks on API calls</a>.</li>
     * <li>The ECS instance must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>Instances in economical mode may fail to start due to insufficient inventory.</li>
     * </ul>
     * 
     * @param request the request parameters of StartInstance  StartInstanceRequest
     * @return StartInstanceResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. Instance startup is not immediate. After you invoke the operation, the instances enter the Starting state. You can invoke <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Running</code>, the instances are started.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Instances that are locked for security reasons cannot be started by invoking this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impacts of security lock on API operations</a>.</li>
     * <li>The ECS instances must be in the <strong>Stopped</strong> (<code>Stopped</code>) state.</li>
     * <li>Starting instances in economical mode may fail because of insufficient resources.</li>
     * </ul>
     * 
     * @param request the request parameters of StartInstances  StartInstancesRequest
     * @return StartInstancesResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you customize a remote connection client by using code, you can invoke this operation to obtain the WebSocketUrl for remotely connecting to an ECS instance. Take note of the following items:</p>
     * <ul>
     * <li>The specified ECS instance must be in the running state.</li>
     * <li>The Cloud Assistant Agent must be installed on the specified ECS instance. You can invoke <a href="https://help.aliyun.com/document_detail/87346.html">DescribeCloudAssistantStatus</a> to check whether the Cloud Assistant Agent is installed on the ECS instance and query the version number of the Cloud Assistant Agent.<ul>
     * <li>If the Cloud Assistant Agent is not installed on the ECS instance, invoke <a href="https://help.aliyun.com/document_detail/85916.html">InstallCloudAssistant</a> to install it.</li>
     * <li>The Cloud Assistant Agent version must be later than the following versions to support the session management feature. To upgrade the Cloud Assistant Agent, see <a href="https://help.aliyun.com/document_detail/134383.html">Upgrade or disable upgrades for the Cloud Assistant Agent</a>.<ul>
     * <li>Linux operating system: 2.2.3.256</li>
     * <li>Windows operating system: 2.1.3.256</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>After you successfully invoke this operation, the WebSocketUrl is valid for 10 minutes.</li>
     * <li>After a session is established, if no data is transmitted for 3 minutes, Cloud Assistant closes the connection.</li>
     * <li>In a single region, a maximum of 100 sessions can be created and active. A maximum of 20 sessions can be in the connected state for a single ECS instance. The bandwidth limit for a single session connection is 200 KB/s.</li>
     * <li>The port forwarding feature supports only TCP port forwarding. UDP is not supported.</li>
     * <li>To permanently shutdown a session and invalidate the WebSocketUrl, invoke the EndTerminalSession operation.</li>
     * </ul>
     * 
     * @param request the request parameters of StartTerminalSession  StartTerminalSessionRequest
     * @return StartTerminalSessionResponse
     */
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
     * <b>description</b> :
     * <p>This is an asynchronous operation. The ECS instance is not stopped immediately after a successful call. After the call succeeds, the instance enters the Stopping state. You can call <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Stopped</code>, the instance is stopped.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Instances that are locked for security reasons cannot be stopped by calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impact of resource security locks on API calls</a>.</li>
     * <li>After you enable the economical mode for instances in a VPC, you can set <code>StoppedMode=KeepCharging</code> to enable the standard stop mode. The ECS instance continues billing after it is stopped, and the ECS instance type inventory and public IP address are retained.</li>
     * </ul>
     * 
     * @param request the request parameters of StopInstance  StopInstanceRequest
     * @return StopInstanceResponse
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

    /**
     * <b>description</b> :
     * <p>This is an asynchronous operation. Instances are not stopped immediately after a successful call. After a successful call, the instance enters the Stopping state. Call <a href="https://help.aliyun.com/document_detail/2679688.html">DescribeInstanceStatus</a> to query the instance status. When the returned status is <code>Stopped</code>, the instance is stopped.</p>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>After an instance is stopped, it becomes unavailable. Make sure that stopping the instance does not affect your business. Call <a href="https://help.aliyun.com/document_detail/2679679.html">StartInstance</a> or <a href="https://help.aliyun.com/document_detail/2679680.html">StartInstances</a> to start the instance.</li>
     * <li>Instances that are locked for security reasons cannot be stopped by calling this operation. For more information, see <a href="https://help.aliyun.com/document_detail/25695.html">Impacts of resource security locks on API calls</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of StopInstances  StopInstancesRequest
     * @return StopInstancesResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>After you stop a one-time command process, instances that have started the execution continue to run, and instances that have not started the execution will not run.</li>
     * <li>After you stop a periodic command process, commands that have started the execution continue to run, but subsequent executions will not be triggered.</li>
     * </ul>
     * 
     * @param request the request parameters of StopInvocation  StopInvocationRequest
     * @return StopInvocationResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>Before you attach tags, Alibaba Cloud checks the number of existing tags on the resource. If the maximum number of tags is exceeded, an error message is returned. For more information, see <a href="https://help.aliyun.com/document_detail/25412.html">Limits</a>.</p>
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
     * @deprecated OpenAPI TerminatePhysicalConnection is deprecated, please use Vpc::2016-04-28::TerminatePhysicalConnection instead.  * @param request  the request parameters of TerminatePhysicalConnection  TerminatePhysicalConnectionRequest
     * @return TerminatePhysicalConnectionResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI TerminateVirtualBorderRouter is deprecated, please use Vpc::2016-04-28::TerminateVirtualBorderRouter instead.  * @param request  the request parameters of TerminateVirtualBorderRouter  TerminateVirtualBorderRouterRequest
     * @return TerminateVirtualBorderRouterResponse
     */
    @Deprecated
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>When you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>The network interface controller (NIC) must be in the <strong>active</strong> (Available) or <strong>InUse</strong> state.</li>
     * <li>If you are operating on a primary network interface controller (NIC), the ECS instance to which the NIC is attached must be in the <strong>Running</strong> or <strong>Stopped</strong> state.</li>
     * </ul>
     * 
     * @param request the request parameters of UnassignIpv6Addresses  UnassignIpv6AddressesRequest
     * @return UnassignIpv6AddressesResponse
     */
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

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Only Elastic Network Interfaces (ENIs) in the <strong>Active</strong> (Available) or <strong>InUse</strong> (InUse) state are supported.</li>
     * <li>When you operate on a primary ENI, the instance to which the network interface controller (NIC) is attached must be in the <strong>Running</strong> (Running) or <strong>Stopped</strong> (Stopped) state.</li>
     * </ul>
     * 
     * @param request the request parameters of UnassignPrivateIpAddresses  UnassignPrivateIpAddressesRequest
     * @return UnassignPrivateIpAddressesResponse
     */
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
     * @deprecated OpenAPI UnassociateEipAddress is deprecated, please use Vpc::2016-04-28::UnassociateEipAddress instead.  * @param request  the request parameters of UnassociateEipAddress  UnassociateEipAddressRequest
     * @return UnassociateEipAddressResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI UnassociateHaVip is deprecated, please use Vpc::2016-04-28::UnassociateHaVip instead.  * @param request  the request parameters of UnassociateHaVip  UnassociateHaVipRequest
     * @return UnassociateHaVipResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of UnlockSnapshot  UnlockSnapshotRequest
     * @return UnlockSnapshotResponse
     */
    @Override
    public CompletableFuture<UnlockSnapshotResponse> unlockSnapshot(UnlockSnapshotRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnlockSnapshot").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnlockSnapshotResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnlockSnapshotResponse> future = new CompletableFuture<>();
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
