// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.vpc20160428.models.*;
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
        this.product = "Vpc";
        this.version = "2016-04-28";
        this.endpointRule = "regional";
        this.endpointMap = CommonUtil.buildMap(
            new TeaPair("cn-qingdao", "vpc.aliyuncs.com"),
            new TeaPair("cn-beijing", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai", "vpc.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "vpc.aliyuncs.com"),
            new TeaPair("cn-hongkong", "vpc.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "vpc.aliyuncs.com"),
            new TeaPair("us-east-1", "vpc.aliyuncs.com"),
            new TeaPair("us-west-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "vpc.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "vpc.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "vpc.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-edge-1", "vpc-nebula.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-fujian", "vpc.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "vpc.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "vpc.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "vpc.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "vpc-nebula.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "vpc-nebula.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "vpc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "vpc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "vpc.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-wuhan", "vpc.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "vpc.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "vpc.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "vpc.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "vpc-nebula.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "vpc-nebula.cn-shenzhen-cloudstone.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "vpc.aliyuncs.com")
        );
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
      * After you call this operation, the router interface enters the **Activating** state. After the router interface is activated, it enters the **Active** state.
      * >  You cannot activate a router interface that has overdue payments.
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
      * *   The **ActiveFlowLog** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      *     *   If the flow log is in the **Activating** state, the flow log is being started.
      *     *   If the flow log is in the **Active** state, the flow log is started.
      * *   You cannot repeatedly call the **ActiveFlowLog** operation to start a flow log within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ActiveFlowLogResponse> activeFlowLog(ActiveFlowLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActiveFlowLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActiveFlowLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActiveFlowLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AddBgpNetworkResponse> addBgpNetwork(AddBgpNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddBgpNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddBgpNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddBgpNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   When you call this operation to associate an EIP with an Internet Shared Bandwidth instance, make sure that the EIP meets the following requirements:
      *     *   The EIP uses the pay-as-you-go billing method.
      *     *   The EIP and the Internet Shared Bandwidth instance belong to the same region.
      *     *   The line type of the EIPs is the same as that of the Internet Shared Bandwidth instance.
      * *   **AddCommonBandwidthPackageIp** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeCommonBandwidthPackages](~~120309~~) operation to query the status of the operation.
      *     *   If the Internet Shared Bandwidth instance is in the **BINDING** state, the EIP is being associated with the Internet Shared Bandwidth instance. In this state, you can only query the Internet Shared Bandwidth instance and cannot perform other operations.
      *     *   If the Internet Shared Bandwidth instance is in the **BINDED** state, the EIP is associated with the Internet Shared Bandwidth instance.
      *
     */
    @Override
    public CompletableFuture<AddCommonBandwidthPackageIpResponse> addCommonBandwidthPackageIp(AddCommonBandwidthPackageIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCommonBandwidthPackageIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCommonBandwidthPackageIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCommonBandwidthPackageIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   When you call this operation to associate EIPs with an Internet Shared Bandwidth instance, make sure that the EIPs meet the following requirements:
      *     *   The EIPs use the pay-as-you-go billing method.
      *     *   The EIP and the Internet Shared Bandwidth instance belong to the same region.
      *     *   The line type of the EIPs is the same as that of the Internet Shared Bandwidth instance.
      * *   **AddCommonBandwidthPackageIps** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeCommonBandwidthPackages](~~DescribeCommonBandwidthPackages~~) operation to query the status of the task.
      *     *   If the Internet Shared Bandwidth instance is in the **BINDING** state, the EIP is being associated with the Internet Shared Bandwidth instance. In this state, you can only query the Internet Shared Bandwidth instance and cannot perform other operations.
      *     *   If the Internet Shared Bandwidth instance is in the **BINDED** state, the EIP is associated with the Internet Shared Bandwidth instance.
      *
     */
    @Override
    public CompletableFuture<AddCommonBandwidthPackageIpsResponse> addCommonBandwidthPackageIps(AddCommonBandwidthPackageIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddCommonBandwidthPackageIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddCommonBandwidthPackageIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddCommonBandwidthPackageIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AddGlobalAccelerationInstanceIpResponse> addGlobalAccelerationInstanceIp(AddGlobalAccelerationInstanceIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddGlobalAccelerationInstanceIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddGlobalAccelerationInstanceIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddGlobalAccelerationInstanceIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<AddIPv6TranslatorAclListEntryResponse> addIPv6TranslatorAclListEntry(AddIPv6TranslatorAclListEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddIPv6TranslatorAclListEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddIPv6TranslatorAclListEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddIPv6TranslatorAclListEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, take note of the following limits:
      * *   The CIDR block and the IP address pool must belong to the same region.
      * *   The CIDR block and the IP address pool must use the same line type.
      * *   **AddPublicIpAddressPoolCidrBlock** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListPublicIpAddressPoolCidrBlocks](~~429436~~) operation to query the status of the task.
      *     *   If the CIDR block is in the **Modifying** state, the CIDR block is being added. In this state, you can only query the CIDR block and cannot perform other operations.
      *     *   If the CIDR block is in the **Created** state, the CIDR block is added.
      * *   You cannot repeatedly call the **AddPublicIpAddressPoolCidrBlock** operation to add a CIDR block to an IP address pool within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<AddPublicIpAddressPoolCidrBlockResponse> addPublicIpAddressPoolCidrBlock(AddPublicIpAddressPoolCidrBlockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddPublicIpAddressPoolCidrBlock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddPublicIpAddressPoolCidrBlockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddPublicIpAddressPoolCidrBlockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **AddSourcesToTrafficMirrorSession** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListTrafficMirrorSessions](~~261367~~) operation to query the status of the task.
      *     *   If the traffic mirror session is in the **Modifying** state, the traffic mirror source is being added to the traffic mirror session.
      *     *   If the traffic mirror session is in the **Created** state, the traffic mirror source is added to the traffic mirror session.
      * *   You cannot repeatedly call the **AddSourcesToTrafficMirrorSession** operation to add a traffic mirror source to a traffic mirror session within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<AddSourcesToTrafficMirrorSessionResponse> addSourcesToTrafficMirrorSession(AddSourcesToTrafficMirrorSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddSourcesToTrafficMirrorSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSourcesToTrafficMirrorSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSourcesToTrafficMirrorSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, make sure that you are familiar with the billing methods and pricing of EIPs. For more information, see [Billing overview](~~122035~~).
      * After you call this operation, the system randomly allocates an EIP that is in the **Available** state in the specified region. EIPs support only the ICMP, TCP, and UDP transport layer protocols. The IGMP and SCTP protocols are not supported.
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

    @Override
    public CompletableFuture<AllocateEipAddressProResponse> allocateEipAddressPro(AllocateEipAddressProRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateEipAddressPro").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateEipAddressProResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateEipAddressProResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **AllocateEipSegmentAddress** is an asynchronous operation. After a request is sent, the system returns the ID of a contiguous EIP group and runs the task in the background. You can call the [DescribeEipSegment](~~156063~~) operation to query the status of the task.
      * *   If the contiguous EIP group is in the **Allocating** state, the EIPs are being allocated. In this case, you can only perform the query operation and cannot perform other operations.
      * *   If the contiguous EIP group is in the **Allocated** state, the EIPs are allocated.
      *
     */
    @Override
    public CompletableFuture<AllocateEipSegmentAddressResponse> allocateEipSegmentAddress(AllocateEipSegmentAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateEipSegmentAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateEipSegmentAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateEipSegmentAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **AllocateIpv6InternetBandwidth** operation within a specific time period.
      *
     */
    @Override
    public CompletableFuture<AllocateIpv6InternetBandwidthResponse> allocateIpv6InternetBandwidth(AllocateIpv6InternetBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateIpv6InternetBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateIpv6InternetBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateIpv6InternetBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * # [](#)
      * The following section describes how to allocate an IPv6 CIDR block to a virtual private cloud (VPC):
      * 1.  Call the AllocateVpcIpv6Cidr operation to reserve the IPv6 CIDR block.
      * 2.  To allocate an IPv6 CIDR block to an existing VPC, call the [AssociateVpcCidrBlock](~~146745~~) operation. Set **RegionId**, **VpcId**, and **IPv6CidrBlock** to the IPv6 CIDR bock, and set **IpVersion** to **ipv6**. To allocate an IPv6 CIDR block when you create a VPC, call the [CreateVpc](~~35737~~) operation. Set **RegionId** and **Ipv6CidrBlock** to the IPv6 CIDR block, and set **EnableIpv6** to **true**.
      *
     */
    @Override
    public CompletableFuture<AllocateVpcIpv6CidrResponse> allocateVpcIpv6Cidr(AllocateVpcIpv6CidrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateVpcIpv6Cidr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateVpcIpv6CidrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateVpcIpv6CidrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ApplyPhysicalConnectionLOAResponse> applyPhysicalConnectionLOA(ApplyPhysicalConnectionLOARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ApplyPhysicalConnectionLOA").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ApplyPhysicalConnectionLOAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ApplyPhysicalConnectionLOAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can associate an EIP with an Elastic Compute Service (ECS) instance, a Classic Load Balancer (CLB) instance, a secondary elastic network interface (ENI), a NAT gateway, or a high-availability virtual IP address (HAVIP) in the same region. The ECS instance and CLB instance must be deployed in a virtual private cloud (VPC).
      * *   **AssociateEipAddress** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeEipAddresses](~~120193~~) operation to query the status of the task.
      *     *   If the EIP is in the **Associating** state, the EIP is being associated. In this state, you can only query the EIP and cannot perform other operations.
      *     *   If the EIP is in the **InUse** state, the EIP is associated.
      * *   You cannot call the **AssociateEipAddress** operation to associate an EIP with multiple instances at a time.
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
      * *   You can call the **AssociateEipAddressBatch** operation to associate EIPs with an instance in the same region. The instance must be a NAT gateway or a secondary elastic network interface (ENI). For more information about how to associate EIPs with other instances, see [AssociateEipAddress](~~120195~~).
      * *   **AssociateEipAddressBatch** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEipAddresses](~~120193~~) operation to query the status of the task.
      *     *   If the EIP is in the **Associating** state, the EIP is being associated. You can only query the EIP and cannot perform other operations.
      *     *   If the EIP is in the **InUse** state, the EIP is associated.
      * *   You cannot call the **AssociateEipAddressBatch** operation to associate an EIP with multiple instances at a time.
      *
     */
    @Override
    public CompletableFuture<AssociateEipAddressBatchResponse> associateEipAddressBatch(AssociateEipAddressBatchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateEipAddressBatch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateEipAddressBatchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateEipAddressBatchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following limits:
      * *   An HAVIP immediately takes effect after it is associated. You do not need to restart the ECS instance. However, you must associate the HAVIP with the ENI of the ECS instance.
      * *   The HAVIP and ECS instance must belong to the same vSwitch.
      * *   You can associate an HAVIP with at most two ECS instances.
      * *   The ECS instance must be in the **Running** or **Stopped** state.
      * *   The HAVIP must be in the **Available** or **InUse** state.
      * *   The **AssociateHaVip** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeHaVips](~~114611~~) operation to query the status of an HAVIP:
      *     *   If the HAVIP is in the **Associating** state, the HAVIP is being associated.
      *     *   If the HAVIP is in the **InUse** state, the HAVIP is associated.
      * *   You cannot repeatedly call the **AssociateHaVip** operation to associate an HAVIP within the specified period of time.
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
      * ## [](#)Description
      * *   **AssociateNetworkAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeNetworkAclAttributes](~~116542~~) operation to query the status of the task.
      *     *   If the network ACL is in the **BINDING** state, the network ACL is being associated.
      *     *   If the network ACL is in the **BINDED** state, the network ACL is associated.
      * *   You cannot repeatedly call the **AssociateNetworkAcl** operation to associate a network ACL within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<AssociateNetworkAclResponse> associateNetworkAcl(AssociateNetworkAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateNetworkAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateNetworkAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateNetworkAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AssociatePhysicalConnectionToVirtualBorderRouterResponse> associatePhysicalConnectionToVirtualBorderRouter(AssociatePhysicalConnectionToVirtualBorderRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociatePhysicalConnectionToVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociatePhysicalConnectionToVirtualBorderRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociatePhysicalConnectionToVirtualBorderRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **AssociateRouteTable** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of the task:
      * *   If the vSwitch is in the **Pending** state, the route table is being associated with the vSwitch.
      * *   If the vSwitch is in the **Available** state, the route table is associated with the vSwitch.
      *
     */
    @Override
    public CompletableFuture<AssociateRouteTableResponse> associateRouteTable(AssociateRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AssociateRouteTableWithGatewayResponse> associateRouteTableWithGateway(AssociateRouteTableWithGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateRouteTableWithGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateRouteTableWithGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateRouteTableWithGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following limits:
      * *   The gateway endpoint to be associated with the route table cannot be in one of the following states: **Creating**, **Modifying**, **Associating**, **Dissociating**, or **Deleting**.
      * *   The route table cannot be in one of the following states: **Creating**, **Modifying**, **Associating**, **Dissociating**, or **Deleting**.
      * *   The gateway endpoint and route table must belong to the same virtual private cloud (VPC).
      * *   The route table cannot be shared.
      * *   You cannot associate a gateway endpoint with a virtual border router (VBR) route table.
      * *   You can associate a gateway endpoint with at most 20 route tables at a time.
      * *   **AssociateRouteTablesWithVpcGatewayEndpoint** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetVpcGatewayEndpointAttribute](~~311017~~) operation to query whether a route table is associated with a gateway endpoint.
      *     *   If the **Associating** status is returned, the route table is being associated with the gateway endpoint.
      *     *   If the **Created** status is returned, the route table is associated with the gateway endpoint.
      * *   You cannot repeatedly call the **AssociateRouteTablesWithVpcGatewayEndpoint** operation within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<AssociateRouteTablesWithVpcGatewayEndpointResponse> associateRouteTablesWithVpcGatewayEndpoint(AssociateRouteTablesWithVpcGatewayEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateRouteTablesWithVpcGatewayEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateRouteTablesWithVpcGatewayEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateRouteTablesWithVpcGatewayEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)
      * *   Take note of the following limits:
      *     *   Each VPC can contain up to five secondary IPv4 CIDR blocks.
      *     *   Each VPC can contain up to three secondary IPv6 CIDR blocks.
      * *   You cannot repeatedly call the **AssociateVpcCidrBlock** operation to add secondary CIDR blocks to a VPC within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<AssociateVpcCidrBlockResponse> associateVpcCidrBlock(AssociateVpcCidrBlockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateVpcCidrBlock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateVpcCidrBlockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateVpcCidrBlockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you associate a VPN gateway with an SSL certificate, take note of the following items:
      * *   You can associate only VPN gateways of the ShangMi (SM) type with SSL certificates. You need to associate a VPN gateway of the SM type with two SSL certificates, one as the encryption certificate and the other as the signature certificate.
      * *   The SSL certificates must use the SM algorithm.
      * *   You cannot specify one SSL certificate as both the encryption certificate and signature certificate for one VPN gateway.
      * *   **AssociateVpnGatewayWithCertificate** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the SSL certificate is being associated.
      *     *   If the VPN gateway is in the **active** state, the SSL certificate is being associated.
      * *   You cannot call **AssociateVpnGatewayWithCertificate** within a specific period of time.
      * ### [](#)Prerequisites
      * Make sure that you have two SSL certificates that use the SM algorithm in the Certificate Management Service console. For more information about SSL certificates, see [What is Certificate Management Service?](~~28535~~).
      *
     */
    @Override
    public CompletableFuture<AssociateVpnGatewayWithCertificateResponse> associateVpnGatewayWithCertificate(AssociateVpnGatewayWithCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateVpnGatewayWithCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateVpnGatewayWithCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateVpnGatewayWithCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The **AttachDhcpOptionsSetToVpc** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of a DHCP options set:
      *     *   If the DHCP options set is in the **Pending** state, the DHCP options set is being associated.
      *     *   If the DHCP options set is in the **InUse** state, the DHCP options set is associated.
      * *   You cannot repeatedly call the **AttachDhcpOptionsSetToVpc** operation to associate DHCP options sets with a VPC within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<AttachDhcpOptionsSetToVpcResponse> attachDhcpOptionsSetToVpc(AttachDhcpOptionsSetToVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachDhcpOptionsSetToVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachDhcpOptionsSetToVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachDhcpOptionsSetToVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<AttachVbrToVpconnResponse> attachVbrToVpconn(AttachVbrToVpconnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachVbrToVpconn").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachVbrToVpconnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachVbrToVpconnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   After this operation is performed, the maximum bandwidth of the EIP equals that of the Internet Shared Bandwidth instance.
      * *   You cannot repeatedly call the **CancelCommonBandwidthPackageIpBandwidth** operation within a specific time period.
      *
     */
    @Override
    public CompletableFuture<CancelCommonBandwidthPackageIpBandwidthResponse> cancelCommonBandwidthPackageIpBandwidth(CancelCommonBandwidthPackageIpBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelCommonBandwidthPackageIpBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelCommonBandwidthPackageIpBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelCommonBandwidthPackageIpBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can cancel only an Express Connect circuit that is in the **Initial**, **Approved**, **Allocated**, or **Confirmed** state.
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

    /**
      * ## [](#)
      * You cannot repeatedly call the **ChangeResourceGroup** operation to modify the resource group of the same Express Connect circuit.
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

    @Override
    public CompletableFuture<CheckCanAllocateVpcPrivateIpAddressResponse> checkCanAllocateVpcPrivateIpAddress(CheckCanAllocateVpcPrivateIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckCanAllocateVpcPrivateIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckCanAllocateVpcPrivateIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckCanAllocateVpcPrivateIpAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CheckVpnBgpEnabledResponse> checkVpnBgpEnabled(CheckVpnBgpEnabledRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CheckVpnBgpEnabled").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CheckVpnBgpEnabledResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CheckVpnBgpEnabledResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CompletePhysicalConnectionLOAResponse> completePhysicalConnectionLOA(CompletePhysicalConnectionLOARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CompletePhysicalConnectionLOA").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CompletePhysicalConnectionLOAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CompletePhysicalConnectionLOAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ConfirmPhysicalConnectionResponse> confirmPhysicalConnection(ConfirmPhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConfirmPhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConfirmPhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConfirmPhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you call this operation, the router interface enters the **Connecting** state. When the connection is established, it enters the **Active** state.
      * When you call this operation, take note of the following items:
      * *   Only an initiator router interface in the **Idle** state can initiate a connection.
      * *   You can create only one pair of connected router interfaces between two routers.
      * *   You cannot initiate a connection if your Alibaba Cloud account has a router interface with overdue payments.
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
      * Before you convert a NAT service plan to an Internet Shared Bandwidth instance, take note of the following limits:
      * *   You are not charged for the conversion.
      * *   When you convert a NAT service plan to an Internet Shared Bandwidth instance, you can continue to use the SNAT and DNAT features of the NAT gateway, and your workloads are not affected. However, we recommend that you convert your NAT service plan during off-peak hours.
      * *   After the NAT service plan is converted to an Internet Shared Bandwidth instance, the public IP addresses in the NAT service plan are converted to elastic IP addresses (EIPs). The maximum bandwidth and billing method of the Internet Shared Bandwidth instance are the same as those of the NAT service plan.
      *
     */
    @Override
    public CompletableFuture<ConvertBandwidthPackageResponse> convertBandwidthPackage(ConvertBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ConvertBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ConvertBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ConvertBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The **CopyNetworkAclEntries** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeNetworkAclAttributes](~~116542~~) operation to query the status of a network ACL:
      *     *   If the network ACL is in the **Modifying** state, the rules of the network ACL are being copied.
      *     *   If the network ACL is in the **Available** state, the rules of the network ACL are copied.
      * *   You cannot repeatedly call the **CopyNetworkAclEntries** operation to copy the rules of a network ACL within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CopyNetworkAclEntriesResponse> copyNetworkAclEntries(CopyNetworkAclEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CopyNetworkAclEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CopyNetworkAclEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CopyNetworkAclEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can connect a VBR to a data center through BGP. Each BGP group is associated with a VBR. You can add a BGP peer that needs to communicate with a VBR to a BGP group and advertise the BGP network in the VBR.
      * BGP groups are used to simplify BGP configurations. You can add BGP peers that use the same configurations to one BGP group. Before you start, you must create a BGP group with the requested autonomous system number (ASN).
      * When you call this operation, take note of the following limits:
      * *   You can specify only the data center that is connected to the VBR through an Express Connect circuit as a BGP peer.
      * *   VBRs support only BGP-4.
      * *   You can create at most eight BGP peers for each VBR.
      * *   Each BGP peer supports at most 110 dynamic routes.
      * *   The ASN of Alibaba Cloud is 45104. You can specify a 2-byte or 4-byte ASN for the data center.
      *
     */
    @Override
    public CompletableFuture<CreateBgpGroupResponse> createBgpGroup(CreateBgpGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBgpGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBgpGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBgpGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateBgpPeerResponse> createBgpPeer(CreateBgpPeerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateBgpPeer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateBgpPeerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateBgpPeerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateCommonBandwidthPackageResponse> createCommonBandwidthPackage(CreateCommonBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCommonBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCommonBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCommonBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateCustomerGatewayResponse> createCustomerGateway(CreateCustomerGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCustomerGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCustomerGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCustomerGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * When you call this operation, take note of the following items:
      * *   The first IP address and last three IP addresses of a default vSwitch CIDR block are reserved. For example, if the CIDR block of a vSwitch is 192.168.1.0/24, the IP addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved.
      * *   The number of instances in the default vSwitch cannot exceed the remaining number of instances supported by the VPC (15,000 minus the number of existing instances).
      * *   Default vSwitches do not support multicasting or broadcasting.
      * *   After you create a default vSwitch, you cannot modify its CIDR block.
      * *   **CreateDefaultVSwitch** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of a default vSwitch:
      *     *   If a default vSwitch is in the **Pending** state, it is being configured.
      *     *   If a default vSwitch is in the **Available** state, it is available.
      * *   If a default vSwitch already exists in a region, you cannot call this operation to create a default vSwitch in this region.
      * *   Before you create a default vSwitch, make sure that a default VPC is created. You can call the [CreateDefaultVpc](~~609152~~) operation to create a default VPC.
      *
     */
    @Override
    public CompletableFuture<CreateDefaultVSwitchResponse> createDefaultVSwitch(CreateDefaultVSwitchRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDefaultVSwitch").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDefaultVSwitchResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDefaultVSwitchResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * When you call this operation, take note of the following items:
      * *   After you create a default VPC, you cannot change its CIDR block. However, you can add secondary IPv4 CIDR blocks to it.
      * *   In each default VPC, cloud services can use a maximum of 60,000 private IP addresses. You cannot increase the quota.
      * *   After you create a default VPC, a vRouter and a route table are automatically created for the VPC.
      * *   At most three user CIDR blocks can be added to a VPC. If a user CIDR block includes another user CIDR block, the one with the shorter subnet mask takes effect. For example, if 10.0.0.0/8 and 10.1.0.0/16 are specified, only 10.0.0.0/8 takes effect.
      * *   **CreateDefaultVpc** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of the task:
      *     *   If the default VPC is in the **Pending** state, the VPC is being configured.
      *     *   If the default VPC is in the **Available** state, the VPC is available.
      * *   You cannot repeatedly call the **CreateDefaultVpc** operation within a specific time period.
      * *   You can create only one default VPC in each region.
      *
     */
    @Override
    public CompletableFuture<CreateDefaultVpcResponse> createDefaultVpc(CreateDefaultVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDefaultVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDefaultVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDefaultVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateDhcpOptionsSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [GetDhcpOptionsSet](~~448820~~) to query the status of the task.
      *     *   If the vSwitch is in the **Pending** state, the DHCP options set is being configured.
      *     *   If the vSwitch is in the **Available** state, the DHCP options set is available.
      *
     */
    @Override
    public CompletableFuture<CreateDhcpOptionsSetResponse> createDhcpOptionsSet(CreateDhcpOptionsSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateDhcpOptionsSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateDhcpOptionsSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateDhcpOptionsSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateExpressCloudConnectionResponse> createExpressCloudConnection(CreateExpressCloudConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateExpressCloudConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExpressCloudConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExpressCloudConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateFailoverTestJobResponse> createFailoverTestJob(CreateFailoverTestJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFailoverTestJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFailoverTestJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFailoverTestJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **CreateFlowLog** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      * *   If the flow log is in the **Activating** state, the flow log is being created.
      * *   If the flow log is in the **Active** state, the flow log is created and started.
      *
     */
    @Override
    public CompletableFuture<CreateFlowLogResponse> createFlowLog(CreateFlowLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFlowLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFlowLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFlowLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)
      * Each DNAT entry consists of the following parameters: **ExternalIp**, **ExternalPort**, **IpProtocol**, **InternalIp**, and **InternalPort**. After you add a DNAT entry, the NAT gateway forwards packets over the specified protocol from **ExternalIp:ExternalPort** to **InternalIp:InternalPort** and sends responses back through the same route.
      * When you call this operation, take note of the following limits:
      * *   **CreateForwardEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeForwardTableEntries](~~36053~~) operation to query the status of the task.
      *     *   If the DNAT entry is in the **Pending** state, the system is adding the DNAT entry. You can only query the DNAT entry, but cannot perform other operations.
      *     *   If the DNAT entry is in the **Available** state, the DNAT entry is added.
      * *   You cannot repeatedly call the **CreateForwardEntry** operation to add a DNAT entry within a specific period of time.
      * *   All combinations of **ExternalIp**, **ExternalPort**, and **IpProtocol** used in DNAT entries must be unique. You cannot distribute requests to more than one Elastic Compute Service (ECS) instance if these requests are initiated from the same source IP address, received on the same port, and use the same protocol.
      * *   The combinations of **IpProtocol**, **InternalIp**, and **InternalPort** must be unique.
      * *   If one or more DNAT entries in the DNAT table are in the **Pending** or **Modifying** state, you cannot add DNAT entries to the DNAT table.
      * *   You can add at most 100 DNAT entries to a DNAT table.
      * *   For an elastic IP address (EIP) used by an Internet NAT gateway or a NAT IP address used by a Virtual Private Cloud (VPC) NAT gateway, take note of the following limit: If the IP address has IP mapping enabled and is specified in a DNAT entry, the IP address cannot be used by another DNAT or SNAT entry.
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
      * *   **CreateFullNatEntry** is an asynchronous operation. After you send a request to call this operation, the system returns a FULLNAT entry and the FULLNAT entry is being added in the backend. You can call the [ListFullNatEntries](~~348779~~) operation to query the status of a FULLNAT entry.
      *     *   If the FULLNAT entry is in the **Creating** state, the system is adding the FULLNAT entry. You can only query the status of the FULLNAT entry, but cannot perform other operations.
      *     *   If the FULLNAT entry is in the **Available** state, the FULLNAT entry is added.
      * *   You cannot repeatedly call the **CreateFullNatEntry** operation for the same VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CreateFullNatEntryResponse> createFullNatEntry(CreateFullNatEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateFullNatEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateFullNatEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateFullNatEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * You can call this operation to create only pay-as-you-go GA instances.
      *
     */
    @Override
    public CompletableFuture<CreateGlobalAccelerationInstanceResponse> createGlobalAccelerationInstance(CreateGlobalAccelerationInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateGlobalAccelerationInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateGlobalAccelerationInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateGlobalAccelerationInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **CreateHaVip** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeHaVips](~~114611~~) operation to query the status of the task:
      * *   If the HAVIP is in the **Creating** state, the HAVIP is being created.
      * *   If the HAVIP is in the **Available** state, the HAVIP is created.
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
    public CompletableFuture<CreateHighReliablePhysicalConnectionResponse> createHighReliablePhysicalConnection(CreateHighReliablePhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHighReliablePhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHighReliablePhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHighReliablePhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateIPv6TranslatorResponse> createIPv6Translator(CreateIPv6TranslatorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIPv6Translator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIPv6TranslatorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIPv6TranslatorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateIPv6TranslatorAclListResponse> createIPv6TranslatorAclList(CreateIPv6TranslatorAclListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIPv6TranslatorAclList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIPv6TranslatorAclListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIPv6TranslatorAclListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<CreateIPv6TranslatorEntryResponse> createIPv6TranslatorEntry(CreateIPv6TranslatorEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIPv6TranslatorEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIPv6TranslatorEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIPv6TranslatorEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Before you create an IPsec server, you must create a VPN gateway and enable the SSL-VPN feature for the VPN gateway. For more information, see [CreateVpnGateway](~~120363~~).
      * *   **CreateIpsecServer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task:
      *     *   If the VPN gateway is in the **updating** state, the IPsec server is being created.
      *     *   If the VPN gateway is in the **active** state, the IPsec server is created.
      * *   You cannot repeatedly call the **CreateIpsecServer** operation for the same VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CreateIpsecServerResponse> createIpsecServer(CreateIpsecServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIpsecServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIpsecServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIpsecServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateIpv4Gateway** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [GetIpv4GatewayAttribute](~~407670~~) operation to query the status of an IPv4 gateway:
      *     *   If the IPv4 gateway is in the **Creating** state, the IPv4 gateway is being created.
      *     *   If the IPv4 gateway is in the **Created** state, the IPv4 gateway is created.
      * *   You cannot repeatedly call the **CreateIpv4Gateway** operation to create IPv4 gateways in a virtual private cloud (VPC) within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CreateIpv4GatewayResponse> createIpv4Gateway(CreateIpv4GatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIpv4Gateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIpv4GatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIpv4GatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateIpv6EgressOnlyRule** is an asynchronous operation. After a request is sent, the system returns a request ID and creates the rule in the background. You can call the [DescribeIpv6EgressOnlyRules](~~102208~~) operation to query the status of the task.
      *     *   If the egress-only rule is in the **Creating** state, the egress-only rule is being created.
      *     *   If the egress-only rule is in the **Created** state, the egress-only rule is created.
      * *   You cannot repeatedly call the **CreateIpv6EgressOnlyRule** operation to add egress-only rules for an IPv6 address within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CreateIpv6EgressOnlyRuleResponse> createIpv6EgressOnlyRule(CreateIpv6EgressOnlyRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIpv6EgressOnlyRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIpv6EgressOnlyRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIpv6EgressOnlyRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateIpv6Gateway** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeIpv6GatewayAttribute](~~102226~~) operation to query the status of the task.
      *     *   If the IPv6 gateway is in the **Creating** state, the IPv6 gateway is being created.
      *     *   If the IPv6 gateway is in the **Created** state, the IPv6 gateway is created.
      * *   You cannot repeatedly call the **CreateIpv6Gateway** operation within a specific time period.
      *
     */
    @Override
    public CompletableFuture<CreateIpv6GatewayResponse> createIpv6Gateway(CreateIpv6GatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateIpv6Gateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateIpv6GatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateIpv6GatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)
      * Before you call this operation, take note of the following items:
      * *   The first time you create a NAT gateway, the system automatically creates the service-linked role AliyunServiceRoleForNatgw. Then, the system attaches the permission policy AliyunServiceRolePolicyForNatgw to the role. This allows the NAT gateway to access other resources on Alibaba Cloud. For more information, see [Service-linked roles](~~174251~~).
      * *   After you create an enhanced Internet NAT gateway, a route entry is automatically added to the route table of the VPC. The destination CIDR block of the route entry is 0.0.0.0/0 and the next hop is the NAT gateway. This ensures that traffic is routed to the NAT gateway.
      * *   **CreateNatGateway** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeNatGateways](~~36054~~) operation to query the status of the task.
      *     *   If a NAT gateway is in the **Creating** state, the NAT gateway is being created. In this case, you can query the NAT gateway but cannot perform other operations.
      *     *   If a NAT gateway is in the **Available** state, the NAT gateway is created.
      * It takes 1 to 3 minutes to create a NAT gateway.
      * *   You cannot repeatedly call the **CreateNatGateway** operation within a specific period of time.
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
      * ## [](#)
      * **CreateNatIp** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListNatIps](~~287000~~) operation to query the status of the task.
      * *   If a NAT IP address is in the **Creating** state, the NAT IP address is being created. In this case, you can only query the NAT IP address and cannot perform other operations.
      * *   If a NAT IP address is in the **Available** state, the NAT IP address is created.
      * You cannot repeatedly call the **CreateNatIp** operation to create a NAT IP address within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<CreateNatIpResponse> createNatIp(CreateNatIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNatIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNatIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNatIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Description
      * You cannot repeatedly call the **CreateNatIpCidr** operation to create a NAT CIDR block within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CreateNatIpCidrResponse> createNatIpCidr(CreateNatIpCidrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNatIpCidr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNatIpCidrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNatIpCidrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateNetworkAclResponse> createNetworkAcl(CreateNetworkAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateNetworkAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateNetworkAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateNetworkAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can apply for a dedicated Express Connect circuit for yourself or create a hosted connection for a tenant. After your application is approved, the Express Connect circuit changes to the **Initial** state. You can contact the connectivity provider to start construction.
      * When you call this operation, take note of the following limits:
      * *   If your Alibaba Cloud account has more than five Express Connect circuits that are not in the **Enabled** state, you cannot apply for another Express Connect circuit.
      * *   If your Alibaba Cloud account has an Express Connect circuit with overdue payments, you cannot apply for another Express Connect circuit.
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
      * >  You can call this operation only when the Express Connect circuit is in the **Complete** state.
      *
     */
    @Override
    public CompletableFuture<CreatePhysicalConnectionOccupancyOrderResponse> createPhysicalConnectionOccupancyOrder(CreatePhysicalConnectionOccupancyOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePhysicalConnectionOccupancyOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePhysicalConnectionOccupancyOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePhysicalConnectionOccupancyOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreatePhysicalConnectionSetupOrderResponse> createPhysicalConnectionSetupOrder(CreatePhysicalConnectionSetupOrderRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePhysicalConnectionSetupOrder").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePhysicalConnectionSetupOrderResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePhysicalConnectionSetupOrderResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * By default, the IP address pool feature is unavailable. You can apply for the privilege to use the **IP address pool feature** in the Quota Center console. For more information, see the "Request a quota increase in the Quota Center console" section in the [Manage EIP quotas](~~108213~~) topic.
      *
     */
    @Override
    public CompletableFuture<CreatePublicIpAddressPoolResponse> createPublicIpAddressPool(CreatePublicIpAddressPoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreatePublicIpAddressPool").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreatePublicIpAddressPoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreatePublicIpAddressPoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)References
      * *   **CreateRouteEntries** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeRouteEntryList](~~138148~~) operation to query the status of the task.
      *     *   If the route entry is in the **Creating** state, the route entry is being created.
      *     *   If the route entry is in the **Created** state, the route entry is created.
      * *   You cannot repeatedly call the **CreateRouteEntries** operation to create the same route entry within the specified period of time.
      * **When you call this operation to add custom route entries to the route table of a vRouter, take note of the following items:**
      * *   A route table can contain up to 200 custom route entries.
      * *   The destination CIDR block (**DstCidrBlock**) of a custom route entry cannot be the same as or overlap with the CIDR block of a vSwitch in the VPC.
      * *   The destination CIDR block (**DstCidrBlock**) of a custom route entry cannot be 100.64.0.0/10 or its subnets.
      * *   The destination CIDR blocks (**DstCidrBlock**) of route entries in the same route table must be unique.
      * *   If you do not include the mask length when you specify the destination CIDR block (**DstCidrBlock**), the destination CIDR block is considered a host IP address whose mask length is 32 bits.
      * *   Multiple custom route entries can point to the same next hop (**NextHop**).
      * *   The next hop (**NextHop**) of a custom route entry must belong to the same VPC as the route table.
      *
     */
    @Override
    public CompletableFuture<CreateRouteEntriesResponse> createRouteEntries(CreateRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeRouteEntryList](~~138148~~) operation to query the status of the task:
      *     *   If a route is in the **Creating** state, the route is being added.
      *     *   If a route is in the **Created** state, the route is added.
      * *   You cannot repeatedly call **CreateRouteEntry** within a specific period of time.
      * **When you call this operation to add a custom route entry to the route table of a vRouter, take note of the following limits:**
      * >  When you add a route entry from a prefix list, the quota usage is calculated by adding the number of existing route entries and the maximum number of route entries of the prefix list.
      * *   A route table can contain up to 200 custom route entries.
      * *   The destination CIDR block (**DestinationCidrBlock**) of a custom route entry cannot be the same as or be a subset of the CIDR block of a vSwitch in the virtual private cloud (VPC). The destination CIDR block can contain the CIDR block of a vSwitch.
      * *   The destination CIDR block (**DestinationCidrBlock**) of a custom route entry cannot be 100.64.0.0/10 or a subset of it.
      * *   The destination CIDR blocks (**DestinationCidrBlock**) of route entries in the same route table must be unique.
      * *   If you do not include the mask length when you specify the destination CIDR block (**DestinationCidrBlock**), the destination CIDR block is considered a host IP address whose mask length is 32 bits.
      * *   Multiple custom route entries can point to the same next hop (**NextHopId**).
      * *   The next hop (**NextHopId**) of a custom route entry must in the same VPC as the route table.
      * *   Equal-cost multi-path (ECMP) routing can be configured by specifying the **NextHopList** parameter.
      *     *   When you add non-ECMP route entries, you must specify **DestinationCidrBlock**, **NextHopType**, and **NextHopId**, and you must not specify **NextHopList**.
      *     *   When you add route entries for ECMP routing, you must specify **DestinationCidrBlock** and **NextHopList**, and you must not specify **NextHopType** or **NextHopId**.
      * **When you call this operation to add a custom route entry to the route table of a VBR, take note of the following limits:**
      * *   A route table can contain up to 200 custom route entries.
      * *   **NextHopList** is not supported.
      * *   The destination CIDR block (**DestinationCidrBlock**) of a custom route entry cannot be 100.64.0.0/10 or a subset of it.
      * *   The destination CIDR blocks (**DestinationCidrBlock**) of route entries in the same route table must be unique.
      * *   If you do not include the mask length when you specify the destination CIDR block (**DestinationCidrBlock**), the destination CIDR block is considered a host IP address whose mask length is 32 bits.
      * *   Multiple custom route entries can point to the same next hop (**NextHopId**).
      * *   The next hop (**NextHopId**) of a custom route entry must be a router interface associated with the VBR.
      * *   You can add route entries only when the VBR is in the **Active** state, and the Express Connect circuit associated with the VBR is in the **Enabled** state and is not locked due to overdue payments.
      * *   Only non-ECMP route entries are supported. When you add non-ECMP route entries, you must specify **DestinationCidrBlock**, **NextHopType**, and **NextHopId**, and you cannot specify **NextHopList**.
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
      * *   The **CreateRouteTable** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeRouteTableList](~~87602~~) operation to query the status of a custom route table:
      *     *   If the custom route table is in the **Creating** state, the custom route table is being created.
      *     *   If the custom route table is in the **Created** state, the custom route table is created.
      * *   You cannot repeatedly call the **CreateRouteTable** operation to create a custom route table within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CreateRouteTableResponse> createRouteTable(CreateRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)
      * When you call this operation, take note of the following limits:
      * *   You can create only one pair of interfaces to be connected between two routers.
      * *   You can create a maximum of five router interfaces for a router.
      * *   If your Alibaba Cloud account has a router interface with overdue payments, you cannot create new router interfaces.
      * *   Each destination CIDR block of route entries in the same route table must be unique.
      * *   A virtual border router (VBR) can serve only as a requester. The VBR must be in the Activated state.
      * *   You can call this operation to create subscription and pay-as-you-go router interfaces.
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
      * You can call this operation to add SNAT entries to Internet NAT gateways and Virtual Private Cloud (VPC) NAT gateways. In this topic, a **NAT gateway** refers to both gateway types.
      * Before you call this operation, take note of the following limits:
      * *   **CreateSnatEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeSnatTableEntries](~~42677~~) operation to query the status of the task.
      *     *   If the SNAT entry is in the **Pending** state, the system is adding the SNAT entry. You can only query the status of the SNAT entry, but cannot perform other operations.
      *     *   If the SNAT entry is in the **Available** state, the SNAT entry is added.
      * *   You cannot repeatedly call the **CreateSnatEntry** operation to add an SNAT entry to an SNAT table within the specified period of time.
      * *   The vSwitch and Elastic Compute Service (ECS) instance specified in an SNAT entry must be created in the VPC where the NAT gateway is deployed.
      * *   Each vSwitch or ECS instance can be specified in only one SNAT entry.
      * *   If a high-availability virtual IP address (HAVIP) exists in a vSwitch, you cannot create SNAT entries.
      *
     */
    @Override
    public CompletableFuture<CreateSnatEntryResponse> createSnatEntry(CreateSnatEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSnatEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSnatEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSnatEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateSslVpnClientCertResponse> createSslVpnClientCert(CreateSslVpnClientCertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSslVpnClientCert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSslVpnClientCertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSslVpnClientCertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateSslVpnServer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the SSL server is being created.
      *     *   If the VPN gateway is in the **active** state, the SSL server is created.
      * *   You cannot repeatedly call the **CreateSslVpnServer** operation for the same VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CreateSslVpnServerResponse> createSslVpnServer(CreateSslVpnServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSslVpnServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSslVpnServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSslVpnServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **CreateTrafficMirrorFilter** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListTrafficMirrorFilters](~~261353~~) operation to query the status of a filter.
      * *   If the filter is in the **Creating** state, the filter is being created.
      * *   If the filter is in the **Created** state, the filter is created.
      *
     */
    @Override
    public CompletableFuture<CreateTrafficMirrorFilterResponse> createTrafficMirrorFilter(CreateTrafficMirrorFilterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTrafficMirrorFilter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrafficMirrorFilterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrafficMirrorFilterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The **CreateTrafficMirrorFilterRules** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListTrafficMirrorFilters](~~261353~~) operation to query the status of an inbound or outbound rule:
      *     *   If the rule is in the **Creating** state, the rule is being created.
      *     *   If the rule is in the **Created** state, the rule is created.
      * *   You cannot repeatedly call the **CreateTrafficMirrorFilterRules** operation to create an inbound or outbound rule for a traffic mirroring filter.
      *
     */
    @Override
    public CompletableFuture<CreateTrafficMirrorFilterRulesResponse> createTrafficMirrorFilterRules(CreateTrafficMirrorFilterRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTrafficMirrorFilterRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrafficMirrorFilterRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrafficMirrorFilterRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * **CreateTrafficMirrorSession** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [ListTrafficMirrorSessions](~~261367~~) operation to query the status of a traffic mirror session:
      * *   If the traffic mirror session is in the **Creating** state, the traffic mirror session is being created.
      * *   If the traffic mirror session is in the **Created** state, the traffic mirror session is created.
      *
     */
    @Override
    public CompletableFuture<CreateTrafficMirrorSessionResponse> createTrafficMirrorSession(CreateTrafficMirrorSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateTrafficMirrorSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateTrafficMirrorSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateTrafficMirrorSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following limits:
      * *   You can create at most 150 vSwitches in a virtual private cloud (VPC).
      * *   The first IP address and last three IP addresses of each vSwitch CIDR block are reserved. For example, if the CIDR block of a vSwitch is 192.168.1.0/24, the IP addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved.
      * *   The number of instances in a vSwitch cannot exceed the remaining capacity of the VPC. The remaining capacity is the difference between 15,000 and the current number of instances.
      * *   Each instance can belong to only one vSwitch.
      * *   vSwitches do not support multicast or broadcast.
      * *   After you create a vSwitch, you cannot modify its CIDR block.
      * *   The **CreateVSwitch** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of a vSwitch:
      *     *   If the vSwitch is in the **Pending** state, the vSwitch is being configured.
      *     *   If the vSwitch is in the **Available** state, the vSwitch is available.
      * *   You cannot repeatedly call the **CreateVSwitch** operation to create a vSwitch in a VPC within the specified period of time.
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
      * ## [](#)Description
      * Take note of the following items:
      * *   You can create at most 10 reserved IPv4 CIDR blocks and 10 reserved IPv6 CIDR blocks for each vSwitch in a virtual private cloud (VPC).
      * *   After you create a reserved CIDR block for a vSwitch, the CIDR block cannot contain the IP address of the subnet gateway of the VPC to which the vSwitch belongs.
      * *   **CreateVSwitchCidrReservation** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [ListVSwitchCidrReservations](~~610155~~) to query the status of the task:
      *     *   If the vSwitch is in the **Assigning** state, the reserved CIDR block is being created.
      *     *   If the vSwitch is in the **Assigned** state, the reserved CIDR block is created.
      * *   When you create a reserved IPv4 CIDR block for a vSwitch, the first IP address and the last three IP addresses of the vSwitch are reserved by the system. The four IP addresses will not be allocated.
      * *   When you create a reserved IPv6 CIDR block for a vSwitch, the first IP address and the last nine IP addresses of the vSwitch are reserved by the system. The 10 IP addresses will not be allocated. For example, if you create a reserved IPv4 CIDR block for a vSwitch whose CIDR block is 192.168.1.0/24, the reserved CIDR block cannot contain the following IP addresses: 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.
      *
     */
    @Override
    public CompletableFuture<CreateVSwitchCidrReservationResponse> createVSwitchCidrReservation(CreateVSwitchCidrReservationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVSwitchCidrReservation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVSwitchCidrReservationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVSwitchCidrReservationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<CreateVbrHaResponse> createVbrHa(CreateVbrHaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVbrHa").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVbrHaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVbrHaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You cannot create a destination-based route whose destination CIDR block is 0.0.0.0/0.
      * *   Do not add a route whose destination CIDR block is 100.64.0.0/10, a subset of 100.64.0.0/10, or a CIDR block that contains 100.64.0.0/10. If such a route is added, the status of the IPsec-VPN connection cannot be displayed in the console or IPsec negotiations fail.
      * *   **CreateVcoRouteEntry** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of the task.
      *     *   If the IPsec-VPN connection is in the **updating** state, the route is being created.
      *     *   If the IPsec-VPN connection is in the **attached** state, the route is created.
      * *   You cannot repeatedly call **CreateVcoRouteEntry** to create a route for the same IPsec-VPN connection within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CreateVcoRouteEntryResponse> createVcoRouteEntry(CreateVcoRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVcoRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVcoRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVcoRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you create a VBR, the VBR is in the **active** state by default.
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
      * # [](#)Description
      * Before you call this operation, we recommend that you learn about the workflow for creating a hosted connection and the environment requirements. For more information, see [Overview of hosted connections](~~146571~~) and [Operations performed by Express Connect partners](~~155987~~).
      *
     */
    @Override
    public CompletableFuture<CreateVirtualPhysicalConnectionResponse> createVirtualPhysicalConnection(CreateVirtualPhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVirtualPhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVirtualPhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVirtualPhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   You can specify only one CIDR block for each VPC.
      * *   After you create a VPC, you cannot change its CIDR block. However, you can add secondary IPv4 CIDR blocks to the VPC.
      * *   In each VPC, cloud services can use a maximum of 60,000 private IP addresses. You cannot increase the quota.
      * *   After you create a VPC, a vRouter and a route table are automatically created.
      * *   At most three user CIDR blocks can be added to a VPC. If a user CIDR block includes another user CIDR block, the one with the shorter subnet mask takes effect. For example, if both 10.0.0.0/8 and 10.1.0.0/16 are specified, only 10.0.0.0/8 takes effect.
      * *   **CreateVpc** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of the task:
      *     *   If the VPC is in the **Creating** state, the VPC is being created.
      *     *   If the VPC is in the **Created** state, the VPC is created.
      * *   You cannot repeatedly call the **DeleteRouteEntry** operation to create default VPCs within a specific time period. However, you can repeatedly call this operation to create custom VPCs within a specific time period.
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

    @Override
    public CompletableFuture<CreateVpcGatewayEndpointResponse> createVpcGatewayEndpoint(CreateVpcGatewayEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpcGatewayEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcGatewayEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcGatewayEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **CreateVpcPrefixList** operation to create a prefix list in a region within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CreateVpcPrefixListResponse> createVpcPrefixList(CreateVpcPrefixListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpcPrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpcPrefixListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpcPrefixListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * If an Express Connect partner has created a virtual border router (VBR) for a tenant before, the Express Connect partner can push the Express Connect circuit that is associated with the VBR to the tenant account by adding a shared port for the tenant account. The service of the tenant is not interrupted in this process.
      * Preparations:
      * Before the Express Connect partner performs the operation, the Express Connect partner must notify the tenant and request the tenant to enable outbound data transfer billing. For more information, see [Enable outbound data transfer billing](~~274385~~).
      * What to do next:
      * 1.  After the Express Connect partner performs the operation, a shared port is added for the tenant account. The tenant must call the [ConfirmPhysicalConnection](~~324198~~) operation to accept the shared port.
      * 2.  Then, the Express Connect partner must call the [AttachVbrToVpconn](~~324191~~) operation to associate the VBR with the newly added shared port that belongs to the tenant account.
      *
     */
    @Override
    public CompletableFuture<CreateVpconnFromVbrResponse> createVpconnFromVbr(CreateVpconnFromVbrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpconnFromVbr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpconnFromVbrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpconnFromVbrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * By default, an IPsec-VPN connection created by calling the `CreateVpnAttachment` operation is not associated with a resource. You can associate an IPsec-VPN connection with a transit router by calling the [CreateTransitRouterVpnAttachment](~~443993~~) operation.
      * ### [](#)Prerequisites
      * Before you create an IPsec-VPN connection, make sure that you created a customer gateway in the region where you want to create the IPsec-VPN connection. For more information, see [CreateCustomerGateway](~~120368~~).
      * If you want to add BGP configurations to an IPsec-VPN connection, make sure that an autonomous system number (ASN) is assigned to the customer gateway.
      *
     */
    @Override
    public CompletableFuture<CreateVpnAttachmentResponse> createVpnAttachment(CreateVpnAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpnAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpnAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpnAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If the VPN gateway supports the dual-tunnel mode, you can specify the following parameters in addition to the required parameters when you call `CreateVpnConnection`:
      *     **ClientToken**, **Name**, **EffectImmediately**, **AutoConfigRoute**, **Tags** array, **TunnelOptionsSpecification** array, and **EnableTunnelsBgp**.
      *     For more information about the regions and zones that support the dual-tunnel mode, see [IPsec-VPN connections support the dual-tunnel mode](~~2358946~~).
      * *   If the VPN gateway supports only the dual-tunnel mode, you can specify the following parameters in addition to the required parameters when you call `CreateVpnConnection`:
      *     **ClientToken**, **CustomerGatewayId**, **Name**, **EffectImmediately**, **IkeConfig**, **IpsecConfig**, **HealthCheckConfig**, **AutoConfigRoute**, **EnableDpd**, **EnableNatTraversal**, **BgpConfig**, **RemoteCaCertificate**, and **Tags** array.
      * *   **CreateVpnConnection** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the IPsec-VPN connection is being created.
      *     *   If the VPN gateway is in the **active** state, the IPsec-VPN connection is created.
      * *   You cannot call **CreateVpnConnection** to create multiple IPsec-VPN connections associated with a VPN gateway at the same time.
      *
     */
    @Override
    public CompletableFuture<CreateVpnConnectionResponse> createVpnConnection(CreateVpnConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpnConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpnConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpnConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Before you create a VPN gateway, we recommend that you know more about the limits of VPN gateways. For more information, see the [Limits](~~65290~~) section in the "Create and manage a VPN gateway" topic.
      * *   VPN gateways in some regions support only IPsec-VPN connections in dual-tunnel mode. If you call `CreateVpnGateway` in these regions, you must specify **VSwitchId** and **DisasterRecoveryVSwitchId** in addition to the required parameters. For more information about the regions and zones that support the IPsec-VPN connections in dual-tunnel mode, see [IPsec-VPN connections support the dual-tunnel mode](~~2358946~~).
      * *   **CreateVpnGateway** is an asynchronous operation. After you send a request to call this operation, the system returns a request ID and the endpoint service is being created in the backend. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **provisioning** state, the VPN gateway is being created.
      *     *   If the VPN gateway is in the **active** state, the VPN gateway is created.
      *
     */
    @Override
    public CompletableFuture<CreateVpnGatewayResponse> createVpnGateway(CreateVpnGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpnGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpnGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpnGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Before you call this operation, make sure that you are familiar with the match rules of and limits on policy-based routes. For more information, see [Manage policy-based routes](~~110777~~).
      * *   Before you create a policy-based route, make sure that an IPsec-VPN connection is created. For more information, see [CreateVpnConnection](~~120391~~).
      * *   **CreateVpnPbrRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the policy-based route is being created.
      *     *   If the VPN gateway is in the **active** state, the policy-based route is created.
      * *   You cannot call the **CreateVpnPbrRouteEntry** operation to create multiple policy-based routes for a VPN gateway at a time.
      *
     */
    @Override
    public CompletableFuture<CreateVpnPbrRouteEntryResponse> createVpnPbrRouteEntry(CreateVpnPbrRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpnPbrRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpnPbrRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpnPbrRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **CreateVpnRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the destination-based route entry is being created.
      *     *   If a VPN gateway is in the **active** state, the destination-based route entry has been created.
      * *   You cannot repeatedly call **CreateVpnRouteEntry** to create a destination-based route entry for a VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<CreateVpnRouteEntryResponse> createVpnRouteEntry(CreateVpnRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpnRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpnRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpnRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * *   The **DeactiveFlowLog** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      *     *   If the flow log is in the **Deactivating** state, the flow log is being disabled.
      *     *   If the flow log is in the **Inactive** state, the flow log is disabled.
      * *   You cannot repeatedly call the **DeactiveFlowLog** operation to disable a flow log within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeactiveFlowLogResponse> deactiveFlowLog(DeactiveFlowLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeactiveFlowLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeactiveFlowLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeactiveFlowLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteBgpGroupResponse> deleteBgpGroup(DeleteBgpGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBgpGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBgpGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBgpGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteBgpNetworkResponse> deleteBgpNetwork(DeleteBgpNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBgpNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBgpNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBgpNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteBgpPeerResponse> deleteBgpPeer(DeleteBgpPeerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteBgpPeer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteBgpPeerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteBgpPeerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **DeleteCommonBandwidthPackage** operation to delete an Internet Shared Bandwidth instance within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteCommonBandwidthPackageResponse> deleteCommonBandwidthPackage(DeleteCommonBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCommonBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCommonBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCommonBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteCustomerGatewayResponse> deleteCustomerGateway(DeleteCustomerGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCustomerGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCustomerGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCustomerGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Description
      * *   **DeleteDhcpOptionsSet** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [GetDhcpOptionsSet](~~189208~~) operation to query the status of the task.
      *     *   If the DHCP options set is in the **Deleting** state, the DHCP options set is being deleted.
      *     *   If you cannot query the DHCP options set, the DHCP options set is deleted.
      * *   You cannot repeatedly call the **DeleteDhcpOptionsSet** operation to delete a DHCP options set within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteDhcpOptionsSetResponse> deleteDhcpOptionsSet(DeleteDhcpOptionsSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDhcpOptionsSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDhcpOptionsSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDhcpOptionsSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteFailoverTestJobResponse> deleteFailoverTestJob(DeleteFailoverTestJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFailoverTestJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFailoverTestJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFailoverTestJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The **DeleteFlowLog** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      *     *   If the flow log is in the **Deleting** state, the flow log is being deleted.
      *     *   If you cannot query the flow log, the flow log is deleted.
      * *   You cannot repeatedly call the **DeleteFlowLog** operation to delete a flow log within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteFlowLogResponse> deleteFlowLog(DeleteFlowLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFlowLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFlowLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFlowLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Description
      * *   **DeleteForwardEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeForwardTableEntries](~~36053~~) operation to query the status of the task.
      *     *   If the DNAT entry is in the **Deleting** state, the system is deleting the DNAT entry. In this case, you can only query the status of the DNAT entry, but cannot perform other operations.
      *     *   If the DNAT entry cannot be found, it is deleted.
      * >  If a DNAT table has DNAT entries in the **Pending** state, you cannot delete the DNAT entries.
      * *   You cannot repeatedly call the **DeleteForwardEntry** operation to delete a DNAT entry within the specified period of time.
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
      * ## [](#)Description
      * **DeleteFullNatEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListFullNatEntries](~~348779~~) operation to query the status of a FULLNAT entry.
      * *   If the FULLNAT entry is in the **Deleting** state, the system is deleting the FULLNAT entry. In this case, you can query the status of the FULLNAT entry, but cannot perform other operations.
      * *   If the FULLNAT entry cannot be found, the FULLNAT entry is deleted.
      * You cannot repeatedly call the **DeleteFullNatEntry** operation to delete a FULLNAT entry within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteFullNatEntryResponse> deleteFullNatEntry(DeleteFullNatEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteFullNatEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteFullNatEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteFullNatEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   You can delete only pay-as-you-go instances.
      * *   Before you can delete a dedicated instance, disassociate the backend server from the instance first.
      * *   Before you can delete a shared instance, disassociate the elastic IP address (EIP) from the instance first.
      *
     */
    @Override
    public CompletableFuture<DeleteGlobalAccelerationInstanceResponse> deleteGlobalAccelerationInstance(DeleteGlobalAccelerationInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteGlobalAccelerationInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteGlobalAccelerationInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteGlobalAccelerationInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following rules:
      * *   You can delete only HAVIPs that are in the Available state.
      * *   Make sure that no route points to the HAVIP that you want to delete.
      * *   Make sure that no elastic IP address (EIP) is associated with the HAVIP that you want to delete.
      * *   The **DeleteHaVip** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeHaVips](~~114611~~) operation to query the status of an HAVIP:
      *     *   If the HAVIP is in the **Deleting** state, the HAVIP is being deleted.
      *     *   If you cannot query the HAVIP, the HAVIP is deleted.
      * *   You cannot repeatedly call the **DeleteHaVip** operation to delete an HAVIP within the specified period of time.
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
    public CompletableFuture<DeleteIPv6TranslatorResponse> deleteIPv6Translator(DeleteIPv6TranslatorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIPv6Translator").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIPv6TranslatorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIPv6TranslatorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeleteIPv6TranslatorAclListResponse> deleteIPv6TranslatorAclList(DeleteIPv6TranslatorAclListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIPv6TranslatorAclList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIPv6TranslatorAclListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIPv6TranslatorAclListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DeleteIPv6TranslatorEntryResponse> deleteIPv6TranslatorEntry(DeleteIPv6TranslatorEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIPv6TranslatorEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIPv6TranslatorEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIPv6TranslatorEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteIpsecServer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the IPsec server is being deleted.
      *     *   If a VPN gateway is in the **active** state, the IPsec server is deleted.
      * *   You cannot repeatedly call **DeleteIpsecServer** to delete an IPsec server from a VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteIpsecServerResponse> deleteIpsecServer(DeleteIpsecServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIpsecServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIpsecServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIpsecServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ### [](#)Description
      * *   Before you delete an IPv4 gateway, make sure that no route tables are associated with the IPv4 gateway.
      * *   **DeleteIpv4Gateway** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the [GetIpv4GatewayAttribute](~~407670~~) operation to query the status of the task.
      *     *   If the IPv4 gateway is in the **Deleting** state, the IPv4 gateway is being deleted.
      *     *   If the IPv4 gateway cannot be queried, the IPv4 gateway is deleted.
      * *   After you call the **DeleteIpv4Gateway** operation to delete an IPv4 gateway, you cannot call the operation again to delete the IPv4 gateway until the deletion task is complete.
      *
     */
    @Override
    public CompletableFuture<DeleteIpv4GatewayResponse> deleteIpv4Gateway(DeleteIpv4GatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIpv4Gateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIpv4GatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIpv4GatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteIpv6EgressOnlyRule** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeIpv6EgressOnlyRules](~~102208~~) operation to query the status of the task.
      *     *   If the egress-only rule is in the **Deleting** state, the egress-only rule is being deleted.
      *     *   If you cannot query the egress-only rule, the egress-only rule is deleted.
      * *   You cannot call the **DeleteIpv6EgressOnlyRule** operation to delete an egress-only rule within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteIpv6EgressOnlyRuleResponse> deleteIpv6EgressOnlyRule(DeleteIpv6EgressOnlyRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIpv6EgressOnlyRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIpv6EgressOnlyRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIpv6EgressOnlyRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you delete an IPv6 gateway, you must delete the egress-only rules of the IPv6 gateway. For more information, see [DeleteIpv6EgressOnlyRule](~~102201~~).
      * *   **DeleteIpv6Gateway** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeIpv6GatewayAttribute](~~102226~~) operation to query the status of the task:
      *     *   If the IPv6 gateway is in the **Deleting** state, the IPv6 gateway is being deleted.
      *     *   If you cannot query the IPv6 gateway, the IPv6 gateway is deleted.
      * *   You cannot repeatedly call the **DeleteIpv6Gateway** operation to delete an IPv6 gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteIpv6GatewayResponse> deleteIpv6Gateway(DeleteIpv6GatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIpv6Gateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIpv6GatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIpv6GatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot call the **DeleteIpv6InternetBandwidth** operation to delete the same Internet bandwidth at the same time.
      *
     */
    @Override
    public CompletableFuture<DeleteIpv6InternetBandwidthResponse> deleteIpv6InternetBandwidth(DeleteIpv6InternetBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteIpv6InternetBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteIpv6InternetBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteIpv6InternetBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Description
      * *   **DeleteNatGateway** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeNatGateways](~~36054~~) to query the status of the task.
      *     *   If a NAT gateway is in the **Deleting** state, the NAT gateway is being deleted. In this case, you can query the NAT gateway but you cannot perform other operations.
      *     *   If the NAT gateway cannot be found, the NAT gateway is deleted.
      *         After you delete a NAT gateway, you cannot restore the NAT gateway. Proceed with caution.
      * *   You cannot repeatedly call the **DeleteNatGateway** operation to delete a NAT gateway within the specified period of time.
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
      * ## [](#)Description
      * *   **DeleteNatIp** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListNatIps](~~281979~~) operation to query the status of the task.
      *     *   If the NAT IP address is in the **Deleting** state, the NAT IP address is being deleted. In this case, you can only query the NAT IP address but cannot perform other operations.
      *     *   If the NAT IP address cannot be found, it is deleted.
      * *   You cannot repeatedly call the **DeleteNatIp** operation to delete a NAT IP address within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteNatIpResponse> deleteNatIp(DeleteNatIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNatIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNatIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNatIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Description
      * You cannot repeatedly call the **DeleteNatIpCidr** operation to delete a NAT CIDR block within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteNatIpCidrResponse> deleteNatIpCidr(DeleteNatIpCidrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNatIpCidr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNatIpCidrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNatIpCidrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **DeleteNetworkAcl** operation to delete a network ACL within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteNetworkAclResponse> deleteNetworkAcl(DeleteNetworkAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteNetworkAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteNetworkAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteNetworkAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can only delete a connection over an Express Connect circuit that is in the **Rejected**, **Canceled**, **AllocationFailed**, or **Terminated** state.
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
      * Before you call this operation, take note of the following items:
      * *   Before you delete an IP address pool, make sure that no IP address in the pool is being used.
      * *   **DeletePublicIpAddressPool** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListPublicIpAddressPools](~~429433~~) operation to query the status of the task.
      *     *   If the IP address pool is in the **Deleting** state, the IP address pool is being deleted. In this state. you can only query the IP address pool and cannot perform other operations.
      *     *   If you cannot query the IP address pool, the IP address pool is deleted.
      * *   You cannot repeatedly call the **DeletePublicIpAddressPool** operation to delete an IP address pool within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeletePublicIpAddressPoolResponse> deletePublicIpAddressPool(DeletePublicIpAddressPoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePublicIpAddressPool").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePublicIpAddressPoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePublicIpAddressPoolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   Before you delete a CIDR block, make sure that it is not being used.
      * *   **DeletePublicIpAddressPoolCidrBlock** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListPublicIpAddressPoolCidrBlocks](~~429436~~) operation to query the status of the task.
      *     *   If the CIDR block is in the **Deleting** state, the CIDR block is being deleted. In this state, you can only query the CIDR block and cannot perform other operations.
      *     *   If you cannot query the CIDR block, the CIDR block is deleted.
      * *   You cannot repeatedly call the **DeletePublicIpAddressPoolCidrBlock** operation to delete a CIDR block within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeletePublicIpAddressPoolCidrBlockResponse> deletePublicIpAddressPoolCidrBlock(DeletePublicIpAddressPoolCidrBlockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletePublicIpAddressPoolCidrBlock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletePublicIpAddressPoolCidrBlockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletePublicIpAddressPoolCidrBlockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following items:
      * *   You can delete only routes that are in the **Available** state.
      * *   You cannot delete a route of a virtual private cloud (VPC) in which a vSwitch or another route is being created or deleted.
      * *   **DeleteRouteEntries** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeRouteEntryList](~~138148~~) operation to query the status of the task.
      *     *   If the route is in the **Deleting** state, the route is being deleted.
      *     *   If you cannot query the route, the route is deleted.
      * *   You cannot repeatedly call **DeleteRouteEntries** within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteRouteEntriesResponse> deleteRouteEntries(DeleteRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following rules:
      * *   You can delete only routes that are in the **Available** state.
      * *   You cannot delete a route of a virtual private cloud (VPC) in which a vSwitch or a route is being created.
      * *   Before you call this operation to delete a route of a VBR route table, call the [DescribeRouteEntryList](~~138148~~) operation to query the **NextHopId** of the route first.
      * *   The **DeleteRouteEntry** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeRouteEntryList](~~138148~~) operation to query the status of a route:
      *     *   If the route is in the **Deleting** state, the route is being deleted.
      *     *   If you cannot query the route, the route is deleted.
      * *   You cannot repeatedly call the **DeleteRouteEntry** operation to delete a route from the route table of a vRouter or a VBR within the specified period of time.
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
      * ## [](#)Description
      * *   **DeleteRouteTable** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeRouteTableList](~~87602~~) operation to query the status of the task.
      *     *   If the custom route table is in the **Deleting** state, the custom route table is being deleted.
      *     *   If you cannot query the custom route table, the custom route table is deleted.
      * *   You cannot repeatedly call the **DeleteRouteTable** operation to delete a custom route table within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteRouteTableResponse> deleteRouteTable(DeleteRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following limits:
      * *   You can delete only a router interface that is in the **Idle** or **Inactive** state.
      * *   Before you delete a router interface, you must delete all custom route entries destined for the router interface.
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
      * DeleteSnatEntry is an asynchronous operation. After you make a request, the ID of the request is returned but the specified SNAT entry is not deleted. The system deletes the SNAT entry in the background. You can call the [DescribeSnatTableEntries](~~42677~~) operation to query the status of SNAT entries.
      * *   If the SNAT entries are in the **Deleting** state, the system is deleting the SNAT entries. In this case, you can only query the status of the SNAT entries, and cannot perform other operations.
      * *   If no SNAT entry is returned in the response, the SNAT entry is deleted.
      * If some SNAT entries are in the **Pending** state, you cannot delete these SNAT entries.
      *
     */
    @Override
    public CompletableFuture<DeleteSnatEntryResponse> deleteSnatEntry(DeleteSnatEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSnatEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSnatEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSnatEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteSslVpnClientCert** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the SSL client certificate is being deleted.
      *     *   If the VPN gateway is in the **active** state, the SSL client certificate is deleted.
      * *   You cannot repeatedly call **DeleteSslVpnClientCert** to delete an SSL client certificate from the same VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteSslVpnClientCertResponse> deleteSslVpnClientCert(DeleteSslVpnClientCertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSslVpnClientCert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSslVpnClientCertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSslVpnClientCertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteSslVpnServer** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the SSL server is being deleted.
      *     *   If the VPN gateway is in the **active** state, the SSL server is deleted.
      * *   You cannot repeatedly call the **DeleteSslVpnServer** operation to delete an SSL server from the same VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteSslVpnServerResponse> deleteSslVpnServer(DeleteSslVpnServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSslVpnServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSslVpnServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSslVpnServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The **DeleteTrafficMirrorFilter** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListTrafficMirrorFilters](~~261353~~) operation to query the status of a filter:
      *     *   If the filter is in the **Deleting** state, the filter is being deleted.
      *     *   If you cannot query the filter, the filter is deleted.
      * *   You cannot repeatedly call the **DeleteTrafficMirrorFilter** operation to delete a filter within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteTrafficMirrorFilterResponse> deleteTrafficMirrorFilter(DeleteTrafficMirrorFilterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTrafficMirrorFilter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrafficMirrorFilterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrafficMirrorFilterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The **DeleteTrafficMirrorFilterRules** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListTrafficMirrorFilters](~~261353~~) operation to query the status of an inbound or outbound rule:
      *     *   If the rule is in the **Deleting** state, the rule is being deleted.
      *     *   If you cannot query the rule, the rule is deleted.
      * *   You cannot repeatedly call the **DeleteTrafficMirrorFilterRules** operation to delete an inbound or outbound rule within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteTrafficMirrorFilterRulesResponse> deleteTrafficMirrorFilterRules(DeleteTrafficMirrorFilterRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTrafficMirrorFilterRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrafficMirrorFilterRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrafficMirrorFilterRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteTrafficMirrorSession** is an asynchronous operation. After you send the request, the system returns a request ID and runs the task in the background. You can call the [ListTrafficMirrorSessions](~~261367~~) operation to query the status of a traffic mirror session.
      *     *   If the traffic mirror session is in the **Deleting** state, the traffic mirror session is being deleted.
      *     *   If you cannot query the traffic mirror session, the traffic mirror session is deleted.
      * *   You cannot repeatedly call the **DeleteTrafficMirrorSession** operation to delete a traffic mirror session within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteTrafficMirrorSessionResponse> deleteTrafficMirrorSession(DeleteTrafficMirrorSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteTrafficMirrorSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteTrafficMirrorSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteTrafficMirrorSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following limits:
      * *   Before you delete a vSwitch, you must first release or remove all virtual private cloud (VPC) resources, including vSwitches, instances, router interfaces, and high-availability virtual IP addresses (HAVIPs).
      * *   You can delete only vSwitches that are in the **Available** state.
      * *   You cannot delete a vSwitch from a VPC where a vSwitch or a route is being created or deleted.
      * *   **DeleteVSwitch** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of the task:
      *     *   If the vSwitch is in the **Pending** state, the vSwitch is being deleted.
      *     *   If you cannot query the vSwitch, the vSwitch is deleted.
      * *   You cannot repeatedly call the **DeleteVSwitch** operation to delete a vSwitch within the specified period of time.
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
      * ## [](#)Description
      * *   Before you call this operation, make sure that the IP address allocated to an elastic network interface (ENI) from the reserved CIDR block is deleted. If the IP address of the ENI is not deleted, call [UnassignPrivateIpAddresses](~~85919~~) or [UnassignIpv6Addresses](~~98611~~) to delete the IPv4 or IPv6 address.
      * *   **DeleteVSwitchCidrReservation** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [ListVSwitchCidrReservations](~~610155~~) to query the status of the task:
      *     *   If the reserved CIDR block is in the **Releasing** state, it is being released.
      *     *   If the reserved CIDR block is in the **Released** state, it is released.
      *
     */
    @Override
    public CompletableFuture<DeleteVSwitchCidrReservationResponse> deleteVSwitchCidrReservation(DeleteVSwitchCidrReservationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVSwitchCidrReservation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVSwitchCidrReservationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVSwitchCidrReservationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DeleteVbrHaResponse> deleteVbrHa(DeleteVbrHaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVbrHa").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVbrHaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVbrHaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteVcoRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of the task.
      *     *   If the IPsec-VPN connection is in the **updating** state, the route is being deleted.
      *     *   If the IPsec-VPN connection is in the **attached** state, the route is deleted.
      * *   You cannot repeatedly call the **DeleteVcoRouteEntry** operation within a specific time period.
      *
     */
    @Override
    public CompletableFuture<DeleteVcoRouteEntryResponse> deleteVcoRouteEntry(DeleteVcoRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVcoRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVcoRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVcoRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, take note of the following limits:
      * *   Before you delete a VBR, you must delete all router interfaces of the VBR.
      * *   You can delete only a VBR in the **unconfirmed**, **active**, or **terminated** state.
      * *   If the VBR belongs to another Alibaba Cloud account, you can delete the VBR only if it is in the **unconfirmed** state.
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
      * When you call this operation, take note of the following limits:
      * *   Before you delete a VPC, make sure that all resources deployed in the VPC are released or removed, such as vSwitches, instances, and high-availability virtual IP addresses (HAVIPs).
      * *   You can delete only a VPC that is in the **Available** state.
      * *   The **DeleteVpc** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of a VPC:
      *     *   If the VPC is in the **Deleting** state, the VPC is being deleted.
      *     *   If you cannot query the VPC, the VPC is deleted.
      * *   You cannot repeatedly call the **DeleteVpc** operation to delete a VPC within the specified period of time.
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
    public CompletableFuture<DeleteVpcGatewayEndpointResponse> deleteVpcGatewayEndpoint(DeleteVpcGatewayEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpcGatewayEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcGatewayEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcGatewayEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **DeleteDhcpOptionsSet** operation to delete a prefix list within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteVpcPrefixListResponse> deleteVpcPrefixList(DeleteVpcPrefixListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpcPrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpcPrefixListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpcPrefixListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If the IPsec-VPN connection is associated with a transit router, you must first disassociate the IPsec-VPN connection from the transit router before you delete the IPsec-VPN connection.
      * *   If the IPsec-VPN connection is not associated with a resource, you can call the `DeleteVpnAttachment` to delete the IPsec-VPN connection.
      *
     */
    @Override
    public CompletableFuture<DeleteVpnAttachmentResponse> deleteVpnAttachment(DeleteVpnAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpnAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpnAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpnAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteVpnConnection** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the IPsec-VPN connection is being deleted.
      *     *   If the VPN gateway is in the **active** state, the IPsec-VPN connection is deleted.
      * *   You cannot repeatedly call **DeleteVpnConnection** to delete an IPsec-VPN connection from the same VPN gateway within the specified period of time.
      * >  After an IPsec-VPN connection between a virtual private cloud (VPC) and a data center is deleted, the communication between the VPC and data center is interrupted.
      *
     */
    @Override
    public CompletableFuture<DeleteVpnConnectionResponse> deleteVpnConnection(DeleteVpnConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpnConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpnConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpnConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * >  You cannot delete a VPN gateway associated with existing IPsec-VPN connections.
      *
     */
    @Override
    public CompletableFuture<DeleteVpnGatewayResponse> deleteVpnGateway(DeleteVpnGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpnGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpnGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpnGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteVpnPbrRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the policy-based route is being deleted.
      *     *   If a VPN gateway is in the **active** state, the policy-based route has been deleted.
      * *   You cannot repeatedly call **DeleteVpnPbrRouteEntry** to delete a policy-based route within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteVpnPbrRouteEntryResponse> deleteVpnPbrRouteEntry(DeleteVpnPbrRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpnPbrRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpnPbrRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpnPbrRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DeleteVpnRouteEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the destination-based route is being deleted.
      *     *   If the VPN gateway is in the **active** state, the destination-based route is deleted.
      * *   You cannot repeatedly call **DeleteVpnRouteEntry** to delete a destination-based route from a VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DeleteVpnRouteEntryResponse> deleteVpnRouteEntry(DeleteVpnRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteVpnRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteVpnRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteVpnRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you enable deletion protection for an instance, you cannot delete the instance. You must disable deletion protection before you can delete the instance.
      *
     */
    @Override
    public CompletableFuture<DeletionProtectionResponse> deletionProtection(DeletionProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeletionProtection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeletionProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeletionProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DescribeBgpGroupsResponse> describeBgpGroups(DescribeBgpGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBgpGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBgpGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBgpGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeBgpNetworksResponse> describeBgpNetworks(DescribeBgpNetworksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBgpNetworks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBgpNetworksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBgpNetworksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeBgpPeersResponse> describeBgpPeers(DescribeBgpPeersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBgpPeers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBgpPeersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBgpPeersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCommonBandwidthPackagesResponse> describeCommonBandwidthPackages(DescribeCommonBandwidthPackagesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCommonBandwidthPackages").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCommonBandwidthPackagesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCommonBandwidthPackagesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCustomerGatewayResponse> describeCustomerGateway(DescribeCustomerGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomerGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomerGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomerGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeCustomerGatewaysResponse> describeCustomerGateways(DescribeCustomerGatewaysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCustomerGateways").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCustomerGatewaysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCustomerGatewaysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeEcGrantRelationResponse> describeEcGrantRelation(DescribeEcGrantRelationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEcGrantRelation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEcGrantRelationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEcGrantRelationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query information about EIPs in a region, including maximum bandwidth, billing methods, and associated instances.
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
      * You can query only EIPs that are associated with secondary elastic network interfaces (ENIs) in multi-EIP-to-ENI mode.
      *
     */
    @Override
    public CompletableFuture<DescribeEipGatewayInfoResponse> describeEipGatewayInfo(DescribeEipGatewayInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEipGatewayInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEipGatewayInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEipGatewayInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * To improve user experience in querying monitoring data, we recommend that you call the DescribeMetricList API operation provided by CloudMonitor to query EIP monitoring data. For more information, see [DescribeMetricList](~~51936~~) and [EIP monitoring data](~~162874~~).
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

    @Override
    public CompletableFuture<DescribeEipSegmentResponse> describeEipSegment(DescribeEipSegmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeEipSegment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeEipSegmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeEipSegmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeFailoverTestJobResponse> describeFailoverTestJob(DescribeFailoverTestJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFailoverTestJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFailoverTestJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFailoverTestJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeFailoverTestJobsResponse> describeFailoverTestJobs(DescribeFailoverTestJobsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFailoverTestJobs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFailoverTestJobsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFailoverTestJobsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeFlowLogsResponse> describeFlowLogs(DescribeFlowLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFlowLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFlowLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFlowLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DescribeGlobalAccelerationInstancesResponse> describeGlobalAccelerationInstances(DescribeGlobalAccelerationInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGlobalAccelerationInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGlobalAccelerationInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGlobalAccelerationInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeGrantRulesToCenResponse> describeGrantRulesToCen(DescribeGrantRulesToCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGrantRulesToCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGrantRulesToCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGrantRulesToCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    public CompletableFuture<DescribeHighDefinitionMonitorLogAttributeResponse> describeHighDefinitionMonitorLogAttribute(DescribeHighDefinitionMonitorLogAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHighDefinitionMonitorLogAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHighDefinitionMonitorLogAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHighDefinitionMonitorLogAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeIPv6TranslatorAclListAttributesResponse> describeIPv6TranslatorAclListAttributes(DescribeIPv6TranslatorAclListAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIPv6TranslatorAclListAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIPv6TranslatorAclListAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIPv6TranslatorAclListAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeIPv6TranslatorAclListsResponse> describeIPv6TranslatorAclLists(DescribeIPv6TranslatorAclListsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIPv6TranslatorAclLists").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIPv6TranslatorAclListsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIPv6TranslatorAclListsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeIPv6TranslatorEntriesResponse> describeIPv6TranslatorEntries(DescribeIPv6TranslatorEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIPv6TranslatorEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIPv6TranslatorEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIPv6TranslatorEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<DescribeIPv6TranslatorsResponse> describeIPv6Translators(DescribeIPv6TranslatorsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIPv6Translators").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIPv6TranslatorsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIPv6TranslatorsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeIpv6AddressesResponse> describeIpv6Addresses(DescribeIpv6AddressesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIpv6Addresses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIpv6AddressesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIpv6AddressesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeIpv6EgressOnlyRulesResponse> describeIpv6EgressOnlyRules(DescribeIpv6EgressOnlyRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIpv6EgressOnlyRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIpv6EgressOnlyRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIpv6EgressOnlyRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeIpv6GatewayAttributeResponse> describeIpv6GatewayAttribute(DescribeIpv6GatewayAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIpv6GatewayAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIpv6GatewayAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIpv6GatewayAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeIpv6GatewaysResponse> describeIpv6Gateways(DescribeIpv6GatewaysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeIpv6Gateways").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeIpv6GatewaysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeIpv6GatewaysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query both Virtual Private Cloud (VPC) NAT gateways and Internet NAT gateways. NAT gateways in this topic refer to both VPC NAT gateways and Internet NAT gateways.
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
    public CompletableFuture<DescribeNetworkAclAttributesResponse> describeNetworkAclAttributes(DescribeNetworkAclAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkAclAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNetworkAclAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNetworkAclAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeNetworkAclsResponse> describeNetworkAcls(DescribeNetworkAclsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNetworkAcls").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNetworkAclsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNetworkAclsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribePhysicalConnectionLOAResponse> describePhysicalConnectionLOA(DescribePhysicalConnectionLOARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePhysicalConnectionLOA").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePhysicalConnectionLOAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePhysicalConnectionLOAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * By default, the system queries information about all Express Connect circuits in the specified region. You can query Express Connect circuits that meet specific conditions by specifying filter conditions provided by the **DescribePhysicalConnections** operation. For more information about the supported filter conditions, see **Key** in the **Request parameters** section.
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

    /**
      * You cannot query the range of public IP addresses of a classic network by calling the **DescribePublicIpAddress** operation.
      *
     */
    @Override
    public CompletableFuture<DescribePublicIpAddressResponse> describePublicIpAddress(DescribePublicIpAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribePublicIpAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribePublicIpAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribePublicIpAddressResponse> future = new CompletableFuture<>();
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
      * ## [](#)References
      * Before you call the [DeleteRouteEntry](~~36013~~) operation to delete a route, you can call this operation to query the next hop of the route that you want to delete.
      *
     */
    @Override
    public CompletableFuture<DescribeRouteEntryListResponse> describeRouteEntryList(DescribeRouteEntryListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouteEntryList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRouteEntryListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRouteEntryListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeRouteTableListResponse> describeRouteTableList(DescribeRouteTableListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouteTableList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRouteTableListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRouteTableListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DescribeRouterInterfaceAttributeResponse> describeRouterInterfaceAttribute(DescribeRouterInterfaceAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouterInterfaceAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRouterInterfaceAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRouterInterfaceAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * > You can call this operation to query only dedicated-bandwidth GA instances.
      *
     */
    @Override
    public CompletableFuture<DescribeServerRelatedGlobalAccelerationInstancesResponse> describeServerRelatedGlobalAccelerationInstances(DescribeServerRelatedGlobalAccelerationInstancesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeServerRelatedGlobalAccelerationInstances").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeServerRelatedGlobalAccelerationInstancesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeServerRelatedGlobalAccelerationInstancesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSnatTableEntriesResponse> describeSnatTableEntries(DescribeSnatTableEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnatTableEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnatTableEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnatTableEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSslVpnClientCertResponse> describeSslVpnClientCert(DescribeSslVpnClientCertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSslVpnClientCert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSslVpnClientCertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSslVpnClientCertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSslVpnClientCertsResponse> describeSslVpnClientCerts(DescribeSslVpnClientCertsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSslVpnClientCerts").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSslVpnClientCertsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSslVpnClientCertsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * If your VPN gateway was created before December 10, 2022, you must upgrade your VPN gateway to the latest version before you can view connection information about SSL clients. For more information, see [Upgrade a VPN gateway](~~303968~~).
      * If your VPN gateway was created after December 10, 2022, you can view connection information about SSL clients by default.
      *
     */
    @Override
    public CompletableFuture<DescribeSslVpnClientsResponse> describeSslVpnClients(DescribeSslVpnClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSslVpnClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSslVpnClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSslVpnClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeSslVpnServersResponse> describeSslVpnServers(DescribeSslVpnServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSslVpnServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSslVpnServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSslVpnServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeTagKeysResponse> describeTagKeys(DescribeTagKeysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTagKeys").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTagKeysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTagKeysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeTagKeysForExpressConnectResponse> describeTagKeysForExpressConnect(DescribeTagKeysForExpressConnectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeTagKeysForExpressConnect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeTagKeysForExpressConnectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeTagKeysForExpressConnectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You must specify **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object that you want to query.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you specify only **Tag.N.Key**, all tag values that are associated with the specified tag key are returned. If you specify only **Tag.N.Value**, an error message is returned.
      * *   If you specify **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, all tags that match the key-value pairs are returned.
      *
     */
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

    @Override
    public CompletableFuture<DescribeVSwitchAttributesResponse> describeVSwitchAttributes(DescribeVSwitchAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVSwitchAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVSwitchAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVSwitchAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DescribeVbrHaResponse> describeVbrHa(DescribeVbrHaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVbrHa").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVbrHaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVbrHaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVcoRouteEntriesResponse> describeVcoRouteEntries(DescribeVcoRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVcoRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVcoRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVcoRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DescribeVpcAttributeResponse> describeVpcAttribute(DescribeVpcAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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

    @Override
    public CompletableFuture<DescribeVpnAttachmentsResponse> describeVpnAttachments(DescribeVpnAttachmentsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpnAttachments").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpnAttachmentsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpnAttachmentsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVpnConnectionResponse> describeVpnConnection(DescribeVpnConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpnConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpnConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpnConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVpnConnectionLogsResponse> describeVpnConnectionLogs(DescribeVpnConnectionLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpnConnectionLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpnConnectionLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpnConnectionLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVpnConnectionsResponse> describeVpnConnections(DescribeVpnConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpnConnections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpnConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpnConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVpnCrossAccountAuthorizationsResponse> describeVpnCrossAccountAuthorizations(DescribeVpnCrossAccountAuthorizationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpnCrossAccountAuthorizations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpnCrossAccountAuthorizationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpnCrossAccountAuthorizationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVpnGatewayResponse> describeVpnGateway(DescribeVpnGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpnGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpnGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpnGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVpnGatewaysResponse> describeVpnGateways(DescribeVpnGatewaysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpnGateways").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpnGatewaysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpnGatewaysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVpnPbrRouteEntriesResponse> describeVpnPbrRouteEntries(DescribeVpnPbrRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpnPbrRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpnPbrRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpnPbrRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVpnRouteEntriesResponse> describeVpnRouteEntries(DescribeVpnRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpnRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpnRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpnRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DescribeVpnSslServerLogsResponse> describeVpnSslServerLogs(DescribeVpnSslServerLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpnSslServerLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpnSslServerLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpnSslServerLogsResponse> future = new CompletableFuture<>();
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
      * ## [](#)Description
      * *   **DetachDhcpOptionsSetFromVpc** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of the task.
      *     *   If the DHCP options set is in the **Pending** state, the DHCP options set is being disassociated.
      *     *   If the DHCP options set is in the **UnUsed** state, the DHCP options set is disassociated.
      * *   You cannot repeatedly call the **DetachDhcpOptionsSetFromVpc** operation to disassociate a DHCP options set from a VPC within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<DetachDhcpOptionsSetFromVpcResponse> detachDhcpOptionsSetFromVpc(DetachDhcpOptionsSetFromVpcRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachDhcpOptionsSetFromVpc").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachDhcpOptionsSetFromVpcResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachDhcpOptionsSetFromVpcResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Only VPN gateways in specific regions support the quick diagnostics feature. For more information about the supported regions, see [Supported regions](~~430697~~).
      *
     */
    @Override
    public CompletableFuture<DiagnoseVpnGatewayResponse> diagnoseVpnGateway(DiagnoseVpnGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DiagnoseVpnGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DiagnoseVpnGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DiagnoseVpnGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableNatGatewayEcsMetricResponse> disableNatGatewayEcsMetric(DisableNatGatewayEcsMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableNatGatewayEcsMetric").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableNatGatewayEcsMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableNatGatewayEcsMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DisableVpcClassicLinkResponse> disableVpcClassicLink(DisableVpcClassicLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableVpcClassicLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableVpcClassicLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableVpcClassicLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DissociateRouteTableFromGatewayResponse> dissociateRouteTableFromGateway(DissociateRouteTableFromGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateRouteTableFromGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateRouteTableFromGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateRouteTableFromGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DissociateRouteTablesFromVpcGatewayEndpointResponse> dissociateRouteTablesFromVpcGatewayEndpoint(DissociateRouteTablesFromVpcGatewayEndpointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateRouteTablesFromVpcGatewayEndpoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateRouteTablesFromVpcGatewayEndpointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateRouteTablesFromVpcGatewayEndpointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **DissociateVpnGatewayWithCertificate** is an asynchronous operation. After a request is sent, the system returns a request and runs the task in the background. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status the task.
      *     *   If the VPN gateway is in the **updating** state, the SSL certificate is being disassociated from the VPN gateway.
      *     *   If the VPN gateway is in the **active** state, the SSL certificate is disassociated from the VPN gateway.
      * *   You cannot repeatedly call **DissociateVpnGatewayWithCertificate** within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<DissociateVpnGatewayWithCertificateResponse> dissociateVpnGatewayWithCertificate(DissociateVpnGatewayWithCertificateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateVpnGatewayWithCertificate").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateVpnGatewayWithCertificateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateVpnGatewayWithCertificateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<DownloadVpnConnectionConfigResponse> downloadVpnConnectionConfig(DownloadVpnConnectionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DownloadVpnConnectionConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DownloadVpnConnectionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DownloadVpnConnectionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<EnableNatGatewayEcsMetricResponse> enableNatGatewayEcsMetric(EnableNatGatewayEcsMetricRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableNatGatewayEcsMetric").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableNatGatewayEcsMetricResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableNatGatewayEcsMetricResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following limits:
      * *   You can enable only an Express Connect circuit that is in the **Confirmed** state.
      * *   After you enable an Express Connect circuit, it enters the **Enabled** state.
      * *   **EnablePhysicalConnection** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribePhysicalConnections](~~36042~~) operation to query the status of the task.
      * *   You cannot repeatedly call **EnablePhysicalConnection** for an Express Connect circuit in the **Confirmed** state within a specific time period.
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

    @Override
    public CompletableFuture<EnableVpcClassicLinkResponse> enableVpcClassicLink(EnableVpcClassicLinkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableVpcClassicLink").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableVpcClassicLinkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableVpcClassicLinkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Description
      * *   **EnableVpcIpv4Gateway** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the [GetIpv4GatewayAttribute](~~407670~~) operation to query the status of an IPv4 gateway.
      *     *   If the IPv4 gateway is in the **Activating** state, the IPv4 gateway is being activated.
      *     *   If the IPv4 gateway is in the **Created** state, the IPv4 gateway is activated.
      * *   You cannot repeatedly call the **EnableVpcIpv4Gateway** operation to activate an IPv4 gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<EnableVpcIpv4GatewayResponse> enableVpcIpv4Gateway(EnableVpcIpv4GatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableVpcIpv4Gateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableVpcIpv4GatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableVpcIpv4GatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetDhcpOptionsSetResponse> getDhcpOptionsSet(GetDhcpOptionsSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetDhcpOptionsSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetDhcpOptionsSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetDhcpOptionsSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetFlowLogServiceStatusResponse> getFlowLogServiceStatus(GetFlowLogServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetFlowLogServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetFlowLogServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetFlowLogServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetIpv4GatewayAttributeResponse> getIpv4GatewayAttribute(GetIpv4GatewayAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetIpv4GatewayAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetIpv4GatewayAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetIpv4GatewayAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query information about a specified Internet NAT gateway or Virtual Private Cloud (VPC) NAT gateway. In this topic, "NAT gateway" refers to both gateway types.
      *
     */
    @Override
    public CompletableFuture<GetNatGatewayAttributeResponse> getNatGatewayAttribute(GetNatGatewayAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetNatGatewayAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetNatGatewayAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetNatGatewayAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this API operation to query the status of outbound data transfer billing for the current account. For more information about outbound data transfer billing, see [Outbound data transfer billing](~~274385~~) and [Billing](~~54582~~).
      *
     */
    @Override
    public CompletableFuture<GetPhysicalConnectionServiceStatusResponse> getPhysicalConnectionServiceStatus(GetPhysicalConnectionServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPhysicalConnectionServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPhysicalConnectionServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPhysicalConnectionServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetTrafficMirrorServiceStatusResponse> getTrafficMirrorServiceStatus(GetTrafficMirrorServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetTrafficMirrorServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetTrafficMirrorServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetTrafficMirrorServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetVSwitchCidrReservationUsageResponse> getVSwitchCidrReservationUsage(GetVSwitchCidrReservationUsageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVSwitchCidrReservationUsage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVSwitchCidrReservationUsageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVSwitchCidrReservationUsageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetVpcGatewayEndpointAttributeResponse> getVpcGatewayEndpointAttribute(GetVpcGatewayEndpointAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVpcGatewayEndpointAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVpcGatewayEndpointAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVpcGatewayEndpointAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetVpcPrefixListAssociationsResponse> getVpcPrefixListAssociations(GetVpcPrefixListAssociationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVpcPrefixListAssociations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVpcPrefixListAssociationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVpcPrefixListAssociationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetVpcPrefixListEntriesResponse> getVpcPrefixListEntries(GetVpcPrefixListEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVpcPrefixListEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVpcPrefixListEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVpcPrefixListEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<GetVpcRouteEntrySummaryResponse> getVpcRouteEntrySummary(GetVpcRouteEntrySummaryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVpcRouteEntrySummary").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVpcRouteEntrySummaryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVpcRouteEntrySummaryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call the **GetVpnGatewayDiagnoseResult** operation, you must specify one of **DiagnoseId** and **VpnGatewayId**.
      *
     */
    @Override
    public CompletableFuture<GetVpnGatewayDiagnoseResultResponse> getVpnGatewayDiagnoseResult(GetVpnGatewayDiagnoseResultRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetVpnGatewayDiagnoseResult").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetVpnGatewayDiagnoseResultResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetVpnGatewayDiagnoseResultResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Before you can attach a network instance that belongs to another Alibaba Cloud account to your CEN instance, you must grant permissions to your CEN instance.
      * >  **GrantInstanceToCen** is a Virtual Private Cloud (VPC) operation. Therefore, you must use the `vpc.aliyuncs.com` domain name to call this operation. The API version is `2016-04-28`.
      * *   You cannot repeatedly call the **GrantInstanceToCen** operation to grant the permissions on a network instance to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.
      *
     */
    @Override
    public CompletableFuture<GrantInstanceToCenResponse> grantInstanceToCen(GrantInstanceToCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GrantInstanceToCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantInstanceToCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantInstanceToCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * When you connect a VBR to a VPC that belongs to another Alibaba Cloud account, the VBR must acquire the required permissions from the VPC.
      *
     */
    @Override
    public CompletableFuture<GrantInstanceToVbrResponse> grantInstanceToVbr(GrantInstanceToVbrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GrantInstanceToVbr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantInstanceToVbrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantInstanceToVbrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListBusinessAccessPointsResponse> listBusinessAccessPoints(ListBusinessAccessPointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBusinessAccessPoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBusinessAccessPointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBusinessAccessPointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListDhcpOptionsSetsResponse> listDhcpOptionsSets(ListDhcpOptionsSetsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDhcpOptionsSets").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDhcpOptionsSetsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDhcpOptionsSetsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call this operation to query zones that support NAT gateways, including Internet NAT gateways and Virtual Private Cloud (VPC) NAT gateways.
      *
     */
    @Override
    public CompletableFuture<ListEnhanhcedNatGatewayAvailableZonesResponse> listEnhanhcedNatGatewayAvailableZones(ListEnhanhcedNatGatewayAvailableZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEnhanhcedNatGatewayAvailableZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnhanhcedNatGatewayAvailableZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnhanhcedNatGatewayAvailableZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListFullNatEntriesResponse> listFullNatEntries(ListFullNatEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListFullNatEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListFullNatEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListFullNatEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListGatewayRouteTableEntriesResponse> listGatewayRouteTableEntries(ListGatewayRouteTableEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGatewayRouteTableEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGatewayRouteTableEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGatewayRouteTableEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListGeographicSubRegionsResponse> listGeographicSubRegions(ListGeographicSubRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListGeographicSubRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListGeographicSubRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListGeographicSubRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListIpsecServerLogsResponse> listIpsecServerLogs(ListIpsecServerLogsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIpsecServerLogs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIpsecServerLogsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIpsecServerLogsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListIpsecServersResponse> listIpsecServers(ListIpsecServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIpsecServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIpsecServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIpsecServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListIpv4GatewaysResponse> listIpv4Gateways(ListIpv4GatewaysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListIpv4Gateways").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListIpv4GatewaysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListIpv4GatewaysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListNatIpCidrsResponse> listNatIpCidrs(ListNatIpCidrsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNatIpCidrs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNatIpCidrsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNatIpCidrsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListNatIpsResponse> listNatIps(ListNatIpsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListNatIps").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListNatIpsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListNatIpsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListPrefixListsResponse> listPrefixLists(ListPrefixListsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPrefixLists").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPrefixListsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPrefixListsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListPublicIpAddressPoolCidrBlocksResponse> listPublicIpAddressPoolCidrBlocks(ListPublicIpAddressPoolCidrBlocksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPublicIpAddressPoolCidrBlocks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPublicIpAddressPoolCidrBlocksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPublicIpAddressPoolCidrBlocksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListPublicIpAddressPoolsResponse> listPublicIpAddressPools(ListPublicIpAddressPoolsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPublicIpAddressPools").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPublicIpAddressPoolsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPublicIpAddressPoolsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * *   You must specify **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request to specify the object that you want to query.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you specify only **Tag.N.Key**, all tag values that are associated with the specified key are returned. If you specify only **Tag.N.Value**, an error message is returned.
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

    /**
      * ## [](#)
      * *   If you want to query a specific object, you must specify **ResourceId.N** or **Tag.N** that consists of **Tag.N.Key** and **Tag.N.Value** in the request.
      * *   **Tag.N** is a resource tag that consists of a key-value pair. If you specify only **Tag.N.Key**, all tag values that are associated with the specified key are returned. If you specify only **Tag.N.Value**, an error message is returned.
      * *   If you specify **Tag.N** and **ResourceId.N** to filter tags, **ResourceId.N** must match all specified key-value pairs.
      * *   If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.
      *
     */
    @Override
    public CompletableFuture<ListTagResourcesForExpressConnectResponse> listTagResourcesForExpressConnect(ListTagResourcesForExpressConnectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResourcesForExpressConnect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTagResourcesForExpressConnectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTagResourcesForExpressConnectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTrafficMirrorFiltersResponse> listTrafficMirrorFilters(ListTrafficMirrorFiltersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTrafficMirrorFilters").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrafficMirrorFiltersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrafficMirrorFiltersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListTrafficMirrorSessionsResponse> listTrafficMirrorSessions(ListTrafficMirrorSessionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTrafficMirrorSessions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListTrafficMirrorSessionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListTrafficMirrorSessionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListVSwitchCidrReservationsResponse> listVSwitchCidrReservations(ListVSwitchCidrReservationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVSwitchCidrReservations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVSwitchCidrReservationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVSwitchCidrReservationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ListVirtualPhysicalConnectionsResponse> listVirtualPhysicalConnections(ListVirtualPhysicalConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVirtualPhysicalConnections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVirtualPhysicalConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVirtualPhysicalConnectionsResponse> future = new CompletableFuture<>();
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
    public CompletableFuture<ListVpcGatewayEndpointsResponse> listVpcGatewayEndpoints(ListVpcGatewayEndpointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpcGatewayEndpoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcGatewayEndpointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcGatewayEndpointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call **ListVpnCertificateAssociations**, take note of the following information:
      * *   If you specify only **RegionId**, the SSL certificates associated with all VPN gateways in the specified region are queried.
      * *   If you specify **RegionId** and **CertificateType**, the SSL certificates of the specified type that are associated with the VPN gateways in the specified region are queried.
      * *   If you specify **RegionId** and **VpnGatewayId**, the SSL certificates associated with the specified VPN gateway in the specified region are queried.
      * *   If you specify **RegionId** and **CertificateId**, the VPN gateways associated with the specified SSL certificate in the specified region are queried.
      *
     */
    @Override
    public CompletableFuture<ListVpnCertificateAssociationsResponse> listVpnCertificateAssociations(ListVpnCertificateAssociationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpnCertificateAssociations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpnCertificateAssociationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpnCertificateAssociationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyBgpGroupAttributeResponse> modifyBgpGroupAttribute(ModifyBgpGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBgpGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBgpGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBgpGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyBgpPeerAttributeResponse> modifyBgpPeerAttribute(ModifyBgpPeerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyBgpPeerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyBgpPeerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyBgpPeerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyCommonBandwidthPackageAttributeResponse> modifyCommonBandwidthPackageAttribute(ModifyCommonBandwidthPackageAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCommonBandwidthPackageAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCommonBandwidthPackageAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCommonBandwidthPackageAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You can call the **ModifyCommonBandwidthPackageIpBandwidth** operation to set the maximum bandwidth of an EIP that is associated with an Internet Shared Bandwidth instance. This prevents an EIP from exhausting the bandwidth resources of an Internet Shared Bandwidth instance.
      * For example, two EIPs are associated with an Internet Shared Bandwidth instance whose maximum bandwidth is 800 Mbit/s. In this case, you can set the maximum bandwidth of one EIP to 500 Mbit/s and that of the other EIP to 400 Mbit/s. After you set the maximum bandwidth values, the first EIP cannot consume bandwidth higher than 500 Mbit/s. The second EIP cannot consume bandwidth higher than 400 Mbit/s.
      * When you call this operation, take note of the following items:
      * *   This operation is valid only for EIPs that are associated with Elastic Compute Service (ECS) instances. This operation is invalid for EIPs that are associated with Server Load Balancer (SLB) instances, NAT gateways, secondary elastic network interfaces (ENIs), or high-availability virtual IP addresses (HAVIPs).
      * *   This operation is in public preview. You can call this operation to set the maximum bandwidth of EIPs only if the EIPs are associated with an Internet Shared Bandwidth instance. The feature is not supported in the console.
      * *   You cannot repeatedly call this operation to set the maximum bandwidth of an EIP within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyCommonBandwidthPackageIpBandwidthResponse> modifyCommonBandwidthPackageIpBandwidth(ModifyCommonBandwidthPackageIpBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCommonBandwidthPackageIpBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCommonBandwidthPackageIpBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCommonBandwidthPackageIpBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, take note of the following items:
      * *   **ModifyCommonBandwidthPackageSpec** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeCommonBandwidthPackages](~~120309~~) operation to query the status of the task.
      *     *   If the Internet Shared Bandwidth instance is in the **Modifying** state, the maximum bandwidth of the Internet Shared Bandwidth instance is being modified. In this state, you can only query the Internet Shared Bandwidth instance and cannot perform other operations.
      *     *   If the Internet Shared Bandwidth instance is in the **Available** state, the maximum bandwidth of the Internet Shared Bandwidth instance is modified.
      * *   You cannot repeatedly call the **ModifyCommonBandwidthPackageSpec** operation to modify the maximum bandwidth of an Internet Shared Bandwidth instance within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyCommonBandwidthPackageSpecResponse> modifyCommonBandwidthPackageSpec(ModifyCommonBandwidthPackageSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCommonBandwidthPackageSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCommonBandwidthPackageSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCommonBandwidthPackageSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   When you call **ModifyCustomerGatewayAttribute**, if a value is assigned to **AuthKey**, the operation is asynchronous. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the configurations are being modified.
      *     *   If a VPN gateway is in the **active** state, the configurations are modified.
      * *   When you call **ModifyCustomerGatewayAttribute**, if no value is assigned to **AuthKey**, the operation is synchronous.
      * *   You cannot repeatedly call **ModifyCustomerGatewayAttribute** to modify the configurations of a customer gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyCustomerGatewayAttributeResponse> modifyCustomerGatewayAttribute(ModifyCustomerGatewayAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCustomerGatewayAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCustomerGatewayAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCustomerGatewayAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
    public CompletableFuture<ModifyExpressCloudConnectionAttributeResponse> modifyExpressCloudConnectionAttribute(ModifyExpressCloudConnectionAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyExpressCloudConnectionAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyExpressCloudConnectionAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyExpressCloudConnectionAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyExpressCloudConnectionBandwidthResponse> modifyExpressCloudConnectionBandwidth(ModifyExpressCloudConnectionBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyExpressCloudConnectionBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyExpressCloudConnectionBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyExpressCloudConnectionBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **ModifyFlowLogAttribute** is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the [DescribeFlowLogs](~~87923~~) operation to query the status of a flow log:
      *     *   If the flow log is in the **Modifying** state, the flow log is being modified.
      *     *   If the flow log is in the **Active** or **Inactive** state, the flow log is modified.
      * *   You cannot repeatedly call the **ModifyFlowLogAttribute** operation to modify a flow log within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyFlowLogAttributeResponse> modifyFlowLogAttribute(ModifyFlowLogAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyFlowLogAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFlowLogAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFlowLogAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **ModifyForwardEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeForwardTableEntries](~~36053~~) operation to query the status of the task.
      *     *   **Pending**: indicates that the system is modifying the DNAT entry. You can only query the DNAT entry, but cannot perform other operations.
      *     *   **Available**: indicates that the DNAT entry is modified.
      * *   You cannot repeatedly call the **ModifyForwardEntry** operation to modify a DNAT entry within the specified period of time.
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
      * ## [](#)
      * *   **ModifyFullNatEntryAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListFullNatEntries](~~348779~~) operation to query the status of a FULLNAT entry.
      *     *   **Modifying**: indicates that the system is modifying the FULLNAT entry. You can query the FULLNAT entry, but cannot perform other operations.
      *     *   **Available**: indicates that the FULLNAT entry is modified.
      * *   You cannot repeatedly call the **ModifyFullNatEntryAttribute** operation to modify a FULLNAT entry within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyFullNatEntryAttributeResponse> modifyFullNatEntryAttribute(ModifyFullNatEntryAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyFullNatEntryAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyFullNatEntryAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyFullNatEntryAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyGlobalAccelerationInstanceAttributesResponse> modifyGlobalAccelerationInstanceAttributes(ModifyGlobalAccelerationInstanceAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyGlobalAccelerationInstanceAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyGlobalAccelerationInstanceAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyGlobalAccelerationInstanceAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * You cannot call this operation to modify the maximum bandwidth of a subscription GA instance.
      *
     */
    @Override
    public CompletableFuture<ModifyGlobalAccelerationInstanceSpecResponse> modifyGlobalAccelerationInstanceSpec(ModifyGlobalAccelerationInstanceSpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyGlobalAccelerationInstanceSpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyGlobalAccelerationInstanceSpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyGlobalAccelerationInstanceSpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **ModifyHaVipAttribute** operation to modify the name and description of an HAVIP within the specified period of time.
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

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyIPv6TranslatorAclAttributeResponse> modifyIPv6TranslatorAclAttribute(ModifyIPv6TranslatorAclAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIPv6TranslatorAclAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIPv6TranslatorAclAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIPv6TranslatorAclAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyIPv6TranslatorAclListEntryResponse> modifyIPv6TranslatorAclListEntry(ModifyIPv6TranslatorAclListEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIPv6TranslatorAclListEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIPv6TranslatorAclListEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIPv6TranslatorAclListEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyIPv6TranslatorAttributeResponse> modifyIPv6TranslatorAttribute(ModifyIPv6TranslatorAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIPv6TranslatorAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIPv6TranslatorAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIPv6TranslatorAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyIPv6TranslatorBandwidthResponse> modifyIPv6TranslatorBandwidth(ModifyIPv6TranslatorBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIPv6TranslatorBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIPv6TranslatorBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIPv6TranslatorBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * @deprecated
      *
     */
    @Override
    public CompletableFuture<ModifyIPv6TranslatorEntryResponse> modifyIPv6TranslatorEntry(ModifyIPv6TranslatorEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIPv6TranslatorEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIPv6TranslatorEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIPv6TranslatorEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyIpv6AddressAttributeResponse> modifyIpv6AddressAttribute(ModifyIpv6AddressAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIpv6AddressAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIpv6AddressAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIpv6AddressAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyIpv6GatewayAttributeResponse> modifyIpv6GatewayAttribute(ModifyIpv6GatewayAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIpv6GatewayAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIpv6GatewayAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIpv6GatewayAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **ModifyIpv6InternetBandwidth** operation to modify the Internet bandwidth value of an IPv6 CIDR block within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyIpv6InternetBandwidthResponse> modifyIpv6InternetBandwidth(ModifyIpv6InternetBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyIpv6InternetBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyIpv6InternetBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyIpv6InternetBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Description
      * You can call this operation to query an Internet NAT gateway or a virtual private cloud (VPC) NAT gateway. The term NAT gateway in this topic refers to both NAT gateway types.
      *
     */
    @Override
    public CompletableFuture<ModifyNatGatewayAttributeResponse> modifyNatGatewayAttribute(ModifyNatGatewayAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNatGatewayAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNatGatewayAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNatGatewayAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * - You cannot call this operation to downgrade a subscription Internet NAT gateway. You can downgrade a subscription Internet NAT gateway only in the console.
      * - When you call this operation to upgrade a subscription Internet NAT gateway, an order is generated. After you complete the payment in the order center, the Internet NAT gateway is upgraded.
      * - **ModifyNatGatewaySpec** is an asynchronous operation. After you make a request, the ID of the request is returned but the Internet NAT gateway is not upgraded. The system upgrades the NAT gateway in the background. You can call the [DescribeNatGateways](/help/en/virtual-private-cloud/latest/describenatgateways) operation to query the status of an Internet NAT gateway.    - If an Internet NAT gateway is in the **Modifying** state, the NAT gateway is being upgraded. In this case, you can only query the NAT gateway but cannot perform other operations.
      *   - If an Internet NAT gateway is in the **Available** state, the Internet NAT gateway is upgraded.
      * - You cannot repeatedly call the **ModifyNatGatewaySpec** operation to resize a pay-by-specification NAT gateway.
      * Internet NAT gateways are available in different sizes. The size of an Internet NAT gateway determines the SNAT performance, which includes the maximum number of connections and the number of new connections per second. However, the size of a NAT gateway does not affect the data throughput. The following table describes the correlations between different sizes of Internet NAT gateways and SNAT performance metrics.  
      * | Size | Maximum number of connections | Number of new connections per second |
      * | ---- | ----------------------------- | ------------------------------------ |
      * | Small | 10,000 | 1,000 |
      * | Medium | 50,000 | 5,000 |
      * | Large | 200,000 | 10,000 |
      *
     */
    @Override
    public CompletableFuture<ModifyNatGatewaySpecResponse> modifyNatGatewaySpec(ModifyNatGatewaySpecRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNatGatewaySpec").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNatGatewaySpecResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNatGatewaySpecResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Description
      * You cannot repeatedly call the **ModifyNatIpAttribute** operation to modify the name and description of a NAT IP address within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyNatIpAttributeResponse> modifyNatIpAttribute(ModifyNatIpAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNatIpAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNatIpAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNatIpAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyNatIpCidrAttributeResponse> modifyNatIpCidrAttribute(ModifyNatIpCidrAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNatIpCidrAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNatIpCidrAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNatIpCidrAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyNetworkAclAttributesResponse> modifyNetworkAclAttributes(ModifyNetworkAclAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyNetworkAclAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyNetworkAclAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyNetworkAclAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * When you call this operation, take note of the following limits:
      * *   If an Express Connect circuit is in the **Initial**, **Enabled**, or **Rejected** state, you can modify the specifications of the Express Connect circuit and the ID of the redundant circuit.
      * *   If an Express Connect circuit is in the **Canceled**, **Allocating**, **AllocationFailed**, or **Terminated** state, you cannot modify the specifications of the Express Connect circuit.
      * *   After you modify the specifications of an Express Connect circuit that is in the **Rejected** state, the Express Connect circuit enters the **Initial** state.
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

    /**
      * You cannot repeatedly call the **ModifyRouteEntry** operation to modify the name and description of a custom route within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyRouteEntryResponse> modifyRouteEntry(ModifyRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)References
      * You cannot repeatedly call the **ModifyRouteTableAttributes** operation to modify the name and description of a route table within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyRouteTableAttributesResponse> modifyRouteTableAttributes(ModifyRouteTableAttributesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRouteTableAttributes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRouteTableAttributesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRouteTableAttributesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

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
      * ## [](#)Description
      * After you call this operation, the router interface enters the **Activating** state. After the router interface is activated, the router interface enters the **Active** state.
      * >  You cannot modify the specification of a router interface that has overdue payments.
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

    /**
      * ## [](#)
      * **ModifySnatEntry** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeSnatTableEntries](~~42677~~) operation to query the status of the task.
      * *   **Pending**: indicates that the system is modifying the SNAT entry. You can only query the status of the SNAT entry, but cannot perform other operations.
      * *   **Available**: indicates that the SNAT entry is modified.
      * >  If an SNAT entry is in the **Pending** state, it indicates that you cannot modify the SNAT entry.
      * You cannot repeatedly call the **ModifySnatEntry** operation to modify an SNAT entry within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<ModifySnatEntryResponse> modifySnatEntry(ModifySnatEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySnatEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySnatEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySnatEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifySslVpnClientCertResponse> modifySslVpnClientCert(ModifySslVpnClientCertRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySslVpnClientCert").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySslVpnClientCertResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySslVpnClientCertResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If you modify only the **name** of the SSL server, the operation is synchronous. If you also modify other configurations besides the **name**, the operation is asynchronous.
      * *   When **ModifySslVpnServer** is an asynchronous operation, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the configurations of the SSL server are being modified.
      *     *   If a VPN gateway is in the **active** state, the configurations of the SSL server are modified.
      * *   You cannot repeatedly call **ModifySslVpnServer** to modify the configurations of an SSL server within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifySslVpnServerResponse> modifySslVpnServer(ModifySslVpnServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySslVpnServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySslVpnServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySslVpnServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<ModifyTunnelAttributeResponse> modifyTunnelAttribute(ModifyTunnelAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyTunnelAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyTunnelAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyTunnelAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **ModifyVRouterAttribute** operation within a specific period of time.
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
      * *   The **ModifyVSwitchAttribute** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of a vSwitch:
      *     *   If the vSwitch is in the **Pending** state, the vSwitch is being modified.
      *     *   If the vSwitch is in the **Available** state, the vSwitch is available.
      * *   You cannot repeatedly call the **ModifyVSwitchAttribute** operation to modify the name and description of a vSwitch within the specified period of time.
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
      * ## [](#)Usage notes
      * You cannot repeatedly call **ModifyVSwitchCidrReservationAttribute** within a specific time period.
      *
     */
    @Override
    public CompletableFuture<ModifyVSwitchCidrReservationAttributeResponse> modifyVSwitchCidrReservationAttribute(ModifyVSwitchCidrReservationAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVSwitchCidrReservationAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVSwitchCidrReservationAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVSwitchCidrReservationAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **ModifyVcoRouteEntryWeight** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of the associated IPsec-VPN connection and determine whether the weight of the specified destination-based route is modified.
      *     *   If the IPsec-VPN connection is in the **updating** state, the weight of the destination-based route is being modified.
      *     *   If the IPsec-VPN connection is in the **attached** state, the weight of the destination-based route is modified.
      * *   You cannot repeatedly call the **ModifyVcoRouteEntryWeight** operation for the same IPsec-VPN connection within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyVcoRouteEntryWeightResponse> modifyVcoRouteEntryWeight(ModifyVcoRouteEntryWeightRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVcoRouteEntryWeight").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVcoRouteEntryWeightResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVcoRouteEntryWeightResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * # [](#)
      * *   Only the owner of an Express Connect circuit can modify the **VlanId** parameter.
      * *   One VLAN ID of an Express Connect circuit cannot be used only by one VBR at the same time.
      * *   The VLAN ID of a VBR in the **Terminated** state is reserved for seven days and cannot be used by other VBRs. The VLAN ID can be used by other VBRs after 7 days.
      * *   You cannot set **LocalGatewayIp**, **PeerGatewayIp**, or **PeeringSubnetMask** for VBRs that do not belong to your Alibaba Cloud account.
      * *   Set **PeeringSubnetMask** to a subnet mask with 24 to 30 bits in length (255.255.255.0～255.255.255.252).
      * *   Set **LocalGatewayIp** and **PeerGatewayIp** to IP addresses that belong to the same CIDR block. For example, you can set LocalGatewayIp to 192.168.XX.XX, PeerGatewayIp to 192.168.XX.XX, and PeeringSubnetMask to 255.255.255.248.
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
      * ## [](#)Description
      * You cannot repeatedly call the **ModifyVpcAttribute** operation to modify the name and description of a VPC within the specified period of time.
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

    /**
      * *   The **ModifyVpcPrefixList** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListPrefixLists](~~311535~~) to query the status of a prefix list.
      *     *   If the prefix list is in the **Modifying** state, the configuration of the prefix list is being modified.
      *     *   If the prefix list is in the **Created** state, the configuration of the prefix list is modified.
      *     *   After the configuration of the prefix list is modified, you can call the [GetVpcPrefixListAssociations](~~445478~~) operation to query information about the network instances that are associated with the prefix list and determine whether the associated network instances use the new CIDR blocks. If the association **status** of the prefix list is **Created**, the new CIDR blocks are used by the network instances that are associated with the prefix list.
      * *   You cannot repeatedly call **ModifyVpcPrefixList** to modify the configuration of a prefix list within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyVpcPrefixListResponse> modifyVpcPrefixList(ModifyVpcPrefixListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcPrefixList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcPrefixListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcPrefixListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **ModifyVpnAttachmentAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task to modify the configuration of an IPsec-VPN connection in the background. You can call the [DescribeVpnConnection](~~53046~~) operation to query the status of the task.
      *     *   If the IPsec-VPN connection is in the **updating** state, the configuration of the IPsec-VPN connection is being modified.
      *     *   If the IPsec-VPN connection is in the **attached** state, the configuration of the IPsec-VPN connection is modified.
      * *   You cannot call the **ModifyVpnAttachmentAttribute** operation again on the same IPsec-VPN connection before the previous operation is complete.
      * *   When you call the **ModifyVpnAttachmentAttribute** operation, take note of the following items:
      *     *   If the IPsec-VPN connection is associated with a transit router, you cannot change the type of the gateway connected to the IPsec-VPN connection.
      *     *   If the IPsec-VPN connection is not associated with a resource, you cannot change the type of the gateway connected to the IPsec-VPN connection or the customer gateway connected to the IPsec-VPN connection.
      *
     */
    @Override
    public CompletableFuture<ModifyVpnAttachmentAttributeResponse> modifyVpnAttachmentAttribute(ModifyVpnAttachmentAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpnAttachmentAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpnAttachmentAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpnAttachmentAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If you want to modify a IPsec-VPN connection in dual-tunnel mode, call the `ModifyVpnConnectionAttribute` operation. You can modify the required parameters and the following request parameters:
      *     **ClientToken**, **Name**, **LocalSubnet**, **RemoteSubnet**, **EffectImmediately**, **AutoConfigRoute**, **TunnelOptionsSpecification**, and **EnableTunnelsBgp**.
      * *   If you want to modify a IPsec-VPN connection in single-tunnel mode, call the `ModifyVpnConnectionAttribute` operation. You can modify the required parameters and the following request parameters:
      *     **ClientToken**, **Name**, **LocalSubnet**, **RemoteSubnet**, **EffectImmediately**, **IkeConfig**, **IpsecConfig**, **HealthCheckConfig**, **AutoConfigRoute**, **EnableDpd**, **EnableNatTraversal**, **BgpConfig**, and **RemoteCaCertificate**.
      * *   **ModifyVpnConnectionAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and modifies the configuration of the IPsec-VPN connection in the backend. You can call the [DescribeVpnGateway](~~73720~~) operation to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the configuration of the IPsec-VPN connection is being modified.
      *     *   If the VPN gateway is in the **active** state, the configuration of the IPsec-VPN connection is modified.
      * *   You cannot repeatedly call the **ModifyVpnConnectionAttribute** operation for the same VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyVpnConnectionAttributeResponse> modifyVpnConnectionAttribute(ModifyVpnConnectionAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpnConnectionAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpnConnectionAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpnConnectionAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **ModifyVpnGatewayAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the VPN gateway is being modified.
      *     *   If the VPN gateway is in the **active** state, the VPN gateway is modified.
      * *   You cannot repeatedly call **ModifyVpnGatewayAttribute** to modify a VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyVpnGatewayAttributeResponse> modifyVpnGatewayAttribute(ModifyVpnGatewayAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpnGatewayAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpnGatewayAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpnGatewayAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You can call the **ModifyVpnPbrRouteEntryAttribute** operation to modify the weight and priority of a policy-based route.
      *     *   If you want to modify only the weight of a policy-based route, call [ModifyVpnPbrRouteEntryWeight](~~127249~~).
      *     *   If you want to modify only the priority of a policy-based route, call [ModifyVpnPbrRouteEntryPriority](~~466870~~).
      *     *   If a policy-based route does not support priorities, you can only call [ModifyVpnPbrRouteEntryWeight](~~127249~~) to modify its weight.
      * *   The **ModifyVpnPbrRouteEntryAttribute** operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If a VPN gateway is in the **updating** state, the policy-based route entry is being modified.
      *     *   If a VPN gateway is in the **active** state, the policy-based route entry is modified.
      * *   You cannot repeatedly call the **ModifyVpnPbrRouteEntryAttribute** operation for the same VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyVpnPbrRouteEntryAttributeResponse> modifyVpnPbrRouteEntryAttribute(ModifyVpnPbrRouteEntryAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpnPbrRouteEntryAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpnPbrRouteEntryAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpnPbrRouteEntryAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **ModifyVpnPbrRouteEntryPriority** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the policy-based route entry is being modified.
      *     *   If the VPN gateway is in the **active** state, the policy-based route is created.
      * *   You cannot repeatedly call the **ModifyVpnPbrRouteEntryPriority** operation for the same VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyVpnPbrRouteEntryPriorityResponse> modifyVpnPbrRouteEntryPriority(ModifyVpnPbrRouteEntryPriorityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpnPbrRouteEntryPriority").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpnPbrRouteEntryPriorityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpnPbrRouteEntryPriorityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **ModifyVpnPbrRouteEntryWeight** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If a VPN gateway is in the **updating** state, the policy-based route entry is being modified.
      *     *   If a VPN gateway is in the **active** state, the policy-based route entry is modified.
      * *   You cannot repeatedly call the **ModifyVpnPbrRouteEntryWeight** operation for the same VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyVpnPbrRouteEntryWeightResponse> modifyVpnPbrRouteEntryWeight(ModifyVpnPbrRouteEntryWeightRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpnPbrRouteEntryWeight").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpnPbrRouteEntryWeightResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpnPbrRouteEntryWeightResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **ModifyVpnRouteEntryWeight** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call [DescribeVpnGateway](~~73720~~) to query the status of the task.
      *     *   If the VPN gateway is in the **updating** state, the weight of the destination-based route is being modified.
      *     *   If the VPN gateway is in the **active** state, the weight of the destination-based route is modified.
      * *   You cannot repeatedly call the **ModifyVpnRouteEntryWeight** operation to modify the weight of destination-based route for the same VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ModifyVpnRouteEntryWeightResponse> modifyVpnRouteEntryWeight(ModifyVpnRouteEntryWeightRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpnRouteEntryWeight").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpnRouteEntryWeightResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpnRouteEntryWeightResponse> future = new CompletableFuture<>();
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

    @Override
    public CompletableFuture<MoveVpnResourceGroupResponse> moveVpnResourceGroup(MoveVpnResourceGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveVpnResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveVpnResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveVpnResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   You cannot repeatedly call the **OpenFlowLogService** operation within the specified period of time by using an Alibaba Cloud account.
      * *   You can call the [GetFlowLogServiceStatus](~~449624~~) operation to query the status of the flow log feature.
      *
     */
    @Override
    public CompletableFuture<OpenFlowLogServiceResponse> openFlowLogService(OpenFlowLogServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenFlowLogService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenFlowLogServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenFlowLogServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<OpenPhysicalConnectionServiceResponse> openPhysicalConnectionService(OpenPhysicalConnectionServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenPhysicalConnectionService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenPhysicalConnectionServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenPhysicalConnectionServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * You can enable traffic mirroring for different regions. You cannot repeatedly call the **OpenTrafficMirrorService** operation to enable traffic mirroring for one region within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<OpenTrafficMirrorServiceResponse> openTrafficMirrorService(OpenTrafficMirrorServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenTrafficMirrorService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenTrafficMirrorServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenTrafficMirrorServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<PublishVpnRouteEntryResponse> publishVpnRouteEntry(PublishVpnRouteEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishVpnRouteEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishVpnRouteEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishVpnRouteEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * # [](#)Description
      * You can call this API operation to resume a suspended Express Connect circuit. You can resume only shared Express Connect circuits by calling this API operation.
      *
     */
    @Override
    public CompletableFuture<RecoverPhysicalConnectionResponse> recoverPhysicalConnection(RecoverPhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RecoverPhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RecoverPhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RecoverPhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After the operation is called, the VBR changes from the **terminated** state to the **recovering** state. When the VBR recovers, it enters the **active** state.
      * When you call this operation, take note of the following items:
      * *   Only the owner of the Express Connect circuit can call this operation.
      * *   The Express Connect circuit to which the VBR connects must be in the **Enabled** state.
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

    /**
      * Before you call this operation, take note of the following items:
      * *   Before you release an EIP, make sure that the EIP meets the following requirements:
      *     *   You can release only an EIP that is in the **Available** state.
      *     *   You can release only a pay-as-you-go EIP. You cannot release a subscription EIP.
      * *   **ReleaseEipAddress** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEipAddresses](~~120193~~) operation to query the status of the task:
      *     *   If the EIP is in the **Releasing** state, the EIP is being released. In this state, you can only query the EIP and cannot perform other operations.
      *     *   If you cannot query the EIP, the EIP is released.
      * *   You cannot repeatedly call the **ReleaseEipAddress** operation to release an EIP within the specified period of time.
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

    /**
      * *   After you call the **ReleaseEipSegmentAddress** operation, all EIPs in the specified group are released.
      * *   **ReleaseEipSegmentAddress** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEipSegment](~~156063~~) operation to query the status of the task.
      *     *   If the group is in the **Releasing** state, EIPs in the group are being released. In this state, you can only query the group and cannot perform other operations.
      *     *   If you cannot query the group of contiguous EIPs, the contiguous EIPs are released.
      * *   You cannot repeatedly call the **ReleaseEipSegmentAddress** operation to release a group of contiguous EIPs within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ReleaseEipSegmentAddressResponse> releaseEipSegmentAddress(ReleaseEipSegmentAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseEipSegmentAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseEipSegmentAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseEipSegmentAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RemoveCommonBandwidthPackageIpResponse> removeCommonBandwidthPackageIp(RemoveCommonBandwidthPackageIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveCommonBandwidthPackageIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveCommonBandwidthPackageIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveCommonBandwidthPackageIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RemoveGlobalAccelerationInstanceIpResponse> removeGlobalAccelerationInstanceIp(RemoveGlobalAccelerationInstanceIpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveGlobalAccelerationInstanceIp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveGlobalAccelerationInstanceIpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveGlobalAccelerationInstanceIpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RemoveIPv6TranslatorAclListEntryResponse> removeIPv6TranslatorAclListEntry(RemoveIPv6TranslatorAclListEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveIPv6TranslatorAclListEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveIPv6TranslatorAclListEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveIPv6TranslatorAclListEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The **RemoveSourcesFromTrafficMirrorSession** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListTrafficMirrorSessions](~~261367~~) operation to query the status of a traffic mirror session:
      *     *   If the traffic mirror session is in the **Modifying** state, the traffic mirror source is being deleted.
      *     *   If the traffic mirror session is in the **Created** state, the traffic mirror source is deleted.
      * *   You cannot repeatedly call the **RemoveSourcesFromTrafficMirrorSession** operation to delete a traffic mirror source from a traffic mirror session within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<RemoveSourcesFromTrafficMirrorSessionResponse> removeSourcesFromTrafficMirrorSession(RemoveSourcesFromTrafficMirrorSessionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveSourcesFromTrafficMirrorSession").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveSourcesFromTrafficMirrorSessionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveSourcesFromTrafficMirrorSessionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The **ReplaceVpcDhcpOptionsSet** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [DescribeVpcAttribute](~~94565~~) operation to query the status of a DHCP options set:
      *     *   If the DHCP options set is in the **Pending** state, the DHCP options set is being replaced.
      *     *   If the DHCP options set is in the **InUse** state, the DHCP options set is replaced.
      * *   You cannot repeatedly call the **ReplaceVpcDhcpOptionsSet** operation to replace the DHCP options set associated with a VPC within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<ReplaceVpcDhcpOptionsSetResponse> replaceVpcDhcpOptionsSet(ReplaceVpcDhcpOptionsSetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReplaceVpcDhcpOptionsSet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReplaceVpcDhcpOptionsSetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReplaceVpcDhcpOptionsSetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If you modify the information about a prefix list but the modification is not automatically applied to the route table that is associated with the prefix list, you can call this operation to apply the latest prefix list to the associated route table.
      * *   The **RetryVpcPrefixListAssociation** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the background. You can call the [GetVpcPrefixListAssociations](~~445478~~) to check whether the prefix list is re-applied.
      *     *   If the prefix list is in the **Modifying** state, the prefix list is being re-applied.
      *     *   If the prefix list is in the **ModifyFailed** state, the prefix list fails to be re-applied.
      *     *   If the prefix list is in the **Created** state, the prefix list is re-applied.
      * *   After you call the **RetryVpcPrefixListAssociation** operation to re-apply a prefix list, you cannot call the operation again until the current task is complete.
      *
     */
    @Override
    public CompletableFuture<RetryVpcPrefixListAssociationResponse> retryVpcPrefixListAssociation(RetryVpcPrefixListAssociationRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RetryVpcPrefixListAssociation").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RetryVpcPrefixListAssociationResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RetryVpcPrefixListAssociationResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)Usage notes
      * *   **RevokeInstanceFromCen** is a Virtual Private Cloud (VPC) operation. Therefore, you must use `vpc.aliyuncs.com` as the domain name when you call this operation. The API version is `2016-04-28`.
      * *   You cannot repeatedly call the **RevokeInstanceFromCen** operation to revoke the permissions on a network instance that is attached to a CEN instance within the specified period of time. The network instance can be a VPC, virtual border router (VBR), or a Cloud Connect Network (CCN) instance.
      *
     */
    @Override
    public CompletableFuture<RevokeInstanceFromCenResponse> revokeInstanceFromCen(RevokeInstanceFromCenRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeInstanceFromCen").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeInstanceFromCenResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeInstanceFromCenResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<RevokeInstanceFromVbrResponse> revokeInstanceFromVbr(RevokeInstanceFromVbrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeInstanceFromVbr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeInstanceFromVbrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeInstanceFromVbrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<SecondApplyPhysicalConnectionLOAResponse> secondApplyPhysicalConnectionLOA(SecondApplyPhysicalConnectionLOARequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SecondApplyPhysicalConnectionLOA").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SecondApplyPhysicalConnectionLOAResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SecondApplyPhysicalConnectionLOAResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call **SetHighDefinitionMonitorLogStatus** within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<SetHighDefinitionMonitorLogStatusResponse> setHighDefinitionMonitorLogStatus(SetHighDefinitionMonitorLogStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetHighDefinitionMonitorLogStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetHighDefinitionMonitorLogStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetHighDefinitionMonitorLogStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StartFailoverTestJobResponse> startFailoverTestJob(StartFailoverTestJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartFailoverTestJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartFailoverTestJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartFailoverTestJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<StopFailoverTestJobResponse> stopFailoverTestJob(StopFailoverTestJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopFailoverTestJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopFailoverTestJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopFailoverTestJobResponse> future = new CompletableFuture<>();
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
      * *   Virtual private clouds (VPCs), route tables, vSwitches, and elastic IP addresses (EIPs) that belong to the same Alibaba Cloud account and are deployed in the same region share tag information with each other.
      *     For example, if you added a tag to a VPC, the tag is available to vSwitches, route tables, and EIPs that belong to the same account and are deployed in the same region in which the VPC is created. You can select this tag from the editing page without the need to enter the tag again. You can modify the key and the value of a tag or remove a tag from an instance. After you delete an instance, all tags that are added to the instance are deleted.
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

    /**
      * ## [](#)
      * Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following items:
      * *   Each tag key that is added to an instance must be unique.
      * *   You cannot create tags without adding them to instances. All tags must be added to instances.
      * *   Tag information is not shared across regions.
      *     For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.
      * *   You can add up to 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.
      *
     */
    @Override
    public CompletableFuture<TagResourcesForExpressConnectResponse> tagResourcesForExpressConnect(TagResourcesForExpressConnectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TagResourcesForExpressConnect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TagResourcesForExpressConnectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TagResourcesForExpressConnectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * After you call this operation, the specified Express Connect circuit changes to the **Terminating** state. After the Express Connect circuit is disabled, it changes to the **Terminated** state. When you call this operation, take note of the following limits:
      * *   You can only disable an Express Connect circuit that is in the **Enabled** state.
      * *   Before you disable an Express Connect circuit, you must delete the virtual border routers (VBRs) associated with it.
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
      * After the operation is performed, the VBR changes from the **active** state to the **terminating** state. After the VBR is terminated, it enters the **terminated** state.
      * >  Only the owner of an Express Connect circuit can call this operation.
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

    /**
      * *   **UnassociateEipAddress** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeEipAddresses](~~120193~~) operation to query the status of the task.
      *     *   If the EIP is in the **Unassociating** state, the EIP is being disassociated. In this state, you can only query the EIP and cannot perform other operations.
      *     *   If the EIP is in the **Available** state, the EIP is disassociated.
      * *   You cannot repeatedly call the **UnassociateEipAddress** operation within the specified period of time.
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

    @Override
    public CompletableFuture<UnassociateGlobalAccelerationInstanceResponse> unassociateGlobalAccelerationInstance(UnassociateGlobalAccelerationInstanceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateGlobalAccelerationInstance").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassociateGlobalAccelerationInstanceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassociateGlobalAccelerationInstanceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)
      * When you call this operation, take note of the following limits:
      * *   The ECS instance must be in the **Running** or **Stopped** state.
      * *   The HAVIP must be in the **Available** or **InUse** state.
      * *   **UnassociateHaVip** is an asynchronous operation. After a request is sent, the system returns a request ID and an instance ID and runs the task in the background. You can call the [DescribeHaVips](~~114611~~) operation to query the status of an HAVIP:
      *     *   If the HAVIP is in the **Unassociating** state, the HAVIP is being disassociated.
      *     *   If the HAVIP is in the **Inuse** or **Available** state, the HAVIP is disassociated.
      * *   You cannot repeatedly call the **UnassociateHaVip** operation to disassociate an HAVIP within the specified period of time.
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

    /**
      * ## [](#)Description
      * *   **UnassociateNetworkAcl** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeNetworkAclAttributes](~~116542~~) operation to query the status of the task.
      *     *   If the network ACL is in the **UNBINDING** state, the network ACL is being disassociated from the vSwitch.
      *     *   If the network ACL is in the **UNBINDED** state, the network ACL is disassociated from the vSwitch.
      * *   You cannot repeatedly call the **UnassociateNetworkAcl** operation to disassociate a network ACL from a vSwitch within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<UnassociateNetworkAclResponse> unassociateNetworkAcl(UnassociateNetworkAclRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateNetworkAcl").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassociateNetworkAclResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassociateNetworkAclResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UnassociatePhysicalConnectionFromVirtualBorderRouterResponse> unassociatePhysicalConnectionFromVirtualBorderRouter(UnassociatePhysicalConnectionFromVirtualBorderRouterRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociatePhysicalConnectionFromVirtualBorderRouter").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassociatePhysicalConnectionFromVirtualBorderRouterResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassociatePhysicalConnectionFromVirtualBorderRouterResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## [](#)References
      * *   **UnassociateRouteTable** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeVSwitchAttributes](~~94567~~) operation to query the status of the task.
      *     *   If the vSwitch is in the **Pending** state, the route table is being disassociated.
      *     *   If the vSwitch is in the **Available** state, the route table is disassociated.
      * *   You cannot repeatedly call the **UnassociateRouteTable** operation to disassociate a route table from a vSwitch within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<UnassociateRouteTableResponse> unassociateRouteTable(UnassociateRouteTableRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateRouteTable").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassociateRouteTableResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassociateRouteTableResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   Before you delete a secondary CIDR block from a VPC, delete the vSwitch which is created with the CIDR block. For more information, see [DeleteVSwitch](~~35746~~).
      * *   You cannot repeatedly call the **UnassociateVpcCidrBlock** operation to delete a secondary CIDR block from a VPC within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<UnassociateVpcCidrBlockResponse> unassociateVpcCidrBlock(UnassociateVpcCidrBlockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnassociateVpcCidrBlock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnassociateVpcCidrBlockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnassociateVpcCidrBlockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UntagResourcesForExpressConnectResponse> untagResourcesForExpressConnect(UntagResourcesForExpressConnectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UntagResourcesForExpressConnect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UntagResourcesForExpressConnectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UntagResourcesForExpressConnectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateDhcpOptionsSetAttributeResponse> updateDhcpOptionsSetAttribute(UpdateDhcpOptionsSetAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateDhcpOptionsSetAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateDhcpOptionsSetAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateDhcpOptionsSetAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateFailoverTestJobResponse> updateFailoverTestJob(UpdateFailoverTestJobRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateFailoverTestJob").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateFailoverTestJobResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateFailoverTestJobResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateGatewayRouteTableEntryAttributeResponse> updateGatewayRouteTableEntryAttribute(UpdateGatewayRouteTableEntryAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateGatewayRouteTableEntryAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateGatewayRouteTableEntryAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateGatewayRouteTableEntryAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   If you modify only the **IpsecServerName** parameter, this operation is synchronous. If you modify parameters other than **IpsecServerName**, this operation is asynchronous.
      * *   When the **UpdateIpsecServer** operation is asynchronous, the system returns a request ID after you send a request to call this operation and the IPsec server is being modified in the backend. You can call [DescribeVpnGateway](~~73720~~) to query the status of a VPN gateway.
      *     *   If the VPN gateway is in the **updating** state, the configuration of the IPsec server is being modified.
      *     *   If the VPN gateway is in the **active** state, the configuration of the IPsec server is modified.
      * *   You cannot repeatedly call the **UpdateIpsecServer** operation for the same VPN gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateIpsecServerResponse> updateIpsecServer(UpdateIpsecServerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateIpsecServer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIpsecServerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIpsecServerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **UpdateIpv4GatewayAttribute** operation to modify the name or description of an IPv4 gateway within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateIpv4GatewayAttributeResponse> updateIpv4GatewayAttribute(UpdateIpv4GatewayAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateIpv4GatewayAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateIpv4GatewayAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateIpv4GatewayAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, take note of the following limits:
      * *   **UpdateNatGatewayNatType** is an asynchronous operation. After you send a request to call this operation, the system returns a request ID and the NAT gateway is still being upgraded in the backend. You can call the GetNatGatewayConvertStatus operation to query the upgrade progress of a NAT gateway. For more information, see [GetNatGatewayConvertStatus](~~184744~~).
      *     *   If the NAT gateway is in the **processing** state, the NAT gateway is being upgraded. You can only query the status of the NAT gateway but cannot perform other operations.
      *     *   If the NAT gateway is in the **successful** state, the NAT gateway is upgraded.
      *     *   If the NAT gateway is in the **failed** state, the system failed to upgrade the NAT gateway.
      * *   You cannot repeatedly call the **UpdateNatGatewayNatType** operation for the same VPN gateway within the specified period of time.
      * *   The billing method and billable items remain the same after the upgrade.
      * *   It takes about five minutes to upgrade a standard NAT gateway to an enhanced NAT gateway. During the upgrade, transient connection errors may occur once or twice. The service can be recovered by reconnection. You can determine whether to enable automatic reconnection or use manual reconnection based on your business requirements.
      * *   You can only upgrade standard NAT gateways to enhanced NAT gateways. You are not allowed to downgrade enhanced NAT gateways to standard NAT gateways.
      *
     */
    @Override
    public CompletableFuture<UpdateNatGatewayNatTypeResponse> updateNatGatewayNatType(UpdateNatGatewayNatTypeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNatGatewayNatType").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNatGatewayNatTypeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNatGatewayNatTypeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **UpdateNetworkAclEntries** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [DescribeNetworkAclAttributes](~~116542~~) operation to query the status of a network ACL:
      *     *   If the network ACL is in the **Modifying** state, the rules of the network ACL are being updated.
      *     *   If the network ACL is in the **Available** state, the rules of the network ACL are updated.
      * *   You cannot repeatedly call the **UpdateNetworkAclEntries** operation to update the rules of a network ACL within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateNetworkAclEntriesResponse> updateNetworkAclEntries(UpdateNetworkAclEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateNetworkAclEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateNetworkAclEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateNetworkAclEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **UpdatePublicIpAddressPoolAttribute** operation to modify the attributes of an IP address pool within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<UpdatePublicIpAddressPoolAttributeResponse> updatePublicIpAddressPoolAttribute(UpdatePublicIpAddressPoolAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdatePublicIpAddressPoolAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdatePublicIpAddressPoolAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdatePublicIpAddressPoolAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * You cannot repeatedly call the **UpdateTrafficMirrorFilterAttribute** operation to modify the configuration of a filter for traffic mirroring within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateTrafficMirrorFilterAttributeResponse> updateTrafficMirrorFilterAttribute(UpdateTrafficMirrorFilterAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTrafficMirrorFilterAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrafficMirrorFilterAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrafficMirrorFilterAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   The **UpdateTrafficMirrorFilterRuleAttribute** operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the [ListTrafficMirrorFilters](~~261353~~) operation to query the status of an inbound or outbound rule:
      *     *   If the rule is in the **Modifying** state, the rule is being modified.
      *     *   If the rule is in the **Created** state, the rule is modified.
      * *   You cannot repeatedly call the **UpdateTrafficMirrorFilterRuleAttribute** operation to modify an inbound or outbound rule within the specified period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateTrafficMirrorFilterRuleAttributeResponse> updateTrafficMirrorFilterRuleAttribute(UpdateTrafficMirrorFilterRuleAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTrafficMirrorFilterRuleAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrafficMirrorFilterRuleAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrafficMirrorFilterRuleAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * ## Usage notes
      * *   **UpdateTrafficMirrorSessionAttribute** is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the [ListTrafficMirrorSessions](~~261367~~) operation to query the status of the task.
      *     *   If the traffic mirror session is in the **Modifying** state, the configuration of the traffic mirror session is being modified.
      *     *   If the traffic mirror session is in the **Created** state, the configuration of the traffic mirror session is modified.
      * *   You cannot repeatedly call the **UpdateTrafficMirrorSessionAttribute** operation within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateTrafficMirrorSessionAttributeResponse> updateTrafficMirrorSessionAttribute(UpdateTrafficMirrorSessionAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateTrafficMirrorSessionAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateTrafficMirrorSessionAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateTrafficMirrorSessionAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateVirtualBorderBandwidthResponse> updateVirtualBorderBandwidth(UpdateVirtualBorderBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVirtualBorderBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVirtualBorderBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVirtualBorderBandwidthResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    @Override
    public CompletableFuture<UpdateVirtualPhysicalConnectionResponse> updateVirtualPhysicalConnection(UpdateVirtualPhysicalConnectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVirtualPhysicalConnection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVirtualPhysicalConnectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVirtualPhysicalConnectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * *   **UpdateVpcGatewayEndpointAttribute** is an asynchronous operation. After a request is sent, the system returns a **request ID** and runs the task in the background. You can call the [GetVpcGatewayEndpointAttribute](~~311017~~) operation to query the status of the task.
      *     *   If the gateway endpoint is in the **Updating** state, it is being modified.
      *     *   If the gateway endpoint is in the **Created** state, it is modified.
      * *   You cannot call the **UpdateVpcGatewayEndpointAttribute** operation within a specific period of time.
      *
     */
    @Override
    public CompletableFuture<UpdateVpcGatewayEndpointAttributeResponse> updateVpcGatewayEndpointAttribute(UpdateVpcGatewayEndpointAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateVpcGatewayEndpointAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateVpcGatewayEndpointAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateVpcGatewayEndpointAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
      * Before you call this operation, make sure that a VPC NAT gateway is created. For more information, see [CreateNatGateway](~~120219~~).
      *
     */
    @Override
    public CompletableFuture<VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse> vpcDescribeVpcNatGatewayNetworkInterfaceQuota(VpcDescribeVpcNatGatewayNetworkInterfaceQuotaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("VpcDescribeVpcNatGatewayNetworkInterfaceQuota").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
