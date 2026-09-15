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
            new TeaPair("cn-hangzhou", "vpc.aliyuncs.com"),
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
            new TeaPair("cn-hangzhou-internal-test-1", "vpc-pre.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "vpc-inner-pre.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "vpc-pre.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "vpc-pre.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "vpc.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "vpc-nebula.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "vpc-nebula.cn-qingdao-nebula.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "vpc-pre.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "vpc.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "vpc-pre.cn-hangzhou.aliyuncs.com"),
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
     * <b>description</b> :
     * <p>After you call the ActivateRouterInterface operation, the router interface enters the <strong>Activating</strong> state. After the activation succeeds, the router interface enters the <strong>Active</strong> state.
     * Before you call this operation, the router interface must be in the <strong>Inactive</strong> state. The initial state of a newly created router interface is <strong>Idle</strong>. In non-express connect mode, you can call CreateRouterInterface to create both ends of the connection, call ModifyRouterInterfaceAttribute to configure peer information for each end, and then call ConnectRouterInterface to establish the connection. When the interface is in the <strong>Active</strong> state, you can call DeactivateRouterInterface to change it to the <strong>Inactive</strong> state, and then call this operation to reactivate it. You can call DescribeRouterInterfaceAttribute to query the current state.</p>
     * <blockquote>
     * <p>You cannot activate a router interface that has an overdue payment.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ActivateRouterInterface  ActivateRouterInterfaceRequest
     * @return ActivateRouterInterfaceResponse
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
     * <b>description</b> :
     * <p>The <strong>ActiveFlowLog</strong> operation is asynchronous. After you send a request, the system returns a request ID. However, the flow log is not yet activated, and the activation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/87923.html">DescribeFlowLogs</a> to query the activation status of the flow log:
     *     - If the flow log is in the <strong>Activating</strong> state, the flow log is being activated.
     *     - If the flow log is in the <strong>Active</strong> state, the flow log is activated.</p>
     * <ul>
     * <li>The <strong>ActiveFlowLog</strong> operation does not support concurrent activation of the same flow log.</li>
     * </ul>
     * 
     * @param request the request parameters of ActiveFlowLog  ActiveFlowLogRequest
     * @return ActiveFlowLogResponse
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

    /**
     * @param request the request parameters of AddBgpNetwork  AddBgpNetworkRequest
     * @return AddBgpNetworkResponse
     */
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
     * <b>description</b> :
     * <p>Before you invoke this operation, take note of the following items:</p>
     * <ul>
     * <li>When you invoke this operation to add an EIP to an Internet Shared Bandwidth instance, the EIP must meet the following conditions:<ul>
     * <li>The billing method of the EIP is pay-as-you-go.</li>
     * <li>The EIP is in the same region as the Internet Shared Bandwidth instance.</li>
     * <li>The line type of the EIP is the same as that of the Internet Shared Bandwidth instance.</li>
     * </ul>
     * </li>
     * <li>The <strong>AddCommonBandwidthPackageIp</strong> operation is asynchronous. After you send a request, the system returns a request ID. However, the EIP is not yet added to the Internet Shared Bandwidth instance. The addition node is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/120309.html">DescribeCommonBandwidthPackages</a> to query the association status between the Internet Shared Bandwidth instance and the EIP. <ul>
     * <li>If the association status is <strong>BINDING</strong>, the Internet Shared Bandwidth instance is being associated with the EIP. In this state, you can only execute query operations.</li>
     * <li>If the association status is <strong>BINDED</strong>, the Internet Shared Bandwidth instance is associated with the EIP.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AddCommonBandwidthPackageIp  AddCommonBandwidthPackageIpRequest
     * @return AddCommonBandwidthPackageIpResponse
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
     * <b>description</b> :
     * <ul>
     * <li>When you invoke this operation to add multiple EIPs to an Internet Shared Bandwidth instance, the EIPs must meet the following conditions:<ul>
     * <li>The EIPs use the pay-as-you-go billing method.</li>
     * <li>The EIPs are in the same region as the Internet Shared Bandwidth instance.</li>
     * <li>The line type of the EIPs is the same as that of the Internet Shared Bandwidth instance.</li>
     * </ul>
     * </li>
     * <li>The <strong>AddCommonBandwidthPackageIps</strong> operation is asynchronous. After you send a request, the system returns a request ID. However, the EIPs are not immediately added to the Internet Shared Bandwidth instance. The addition node is still running in the background. You can invoke <a href="~~DescribeCommonBandwidthPackages~~">DescribeCommonBandwidthPackages</a> to query the association status between the Internet Shared Bandwidth instance and the EIPs. <ul>
     * <li>If the association status is <strong>BINDING</strong>, the Internet Shared Bandwidth instance is being associated with the EIPs. In this state, you can only execute query operations.</li>
     * <li>If the association status is <strong>BINDED</strong>, the Internet Shared Bandwidth instance is associated with the EIPs.
     * Billable methods: The EIPs must use the pay-as-you-go billing method.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AddCommonBandwidthPackageIps  AddCommonBandwidthPackageIpsRequest
     * @return AddCommonBandwidthPackageIpsResponse
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

    /**
     * @param request the request parameters of AddGlobalAccelerationInstanceIp  AddGlobalAccelerationInstanceIpRequest
     * @return AddGlobalAccelerationInstanceIpResponse
     */
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
     * @deprecated OpenAPI AddIPv6TranslatorAclListEntry is deprecated  * @param request  the request parameters of AddIPv6TranslatorAclListEntry  AddIPv6TranslatorAclListEntryRequest
     * @return AddIPv6TranslatorAclListEntryResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p>Before calling this operation, note the following:</p>
     * <ul>
     * <li>The CIDR block and the IP address pool must belong to the same region.</li>
     * <li>The CIDR block and the IP address pool must belong to the same ISP line type.</li>
     * <li><strong>AddPublicIpAddressPoolCidrBlock</strong> is an asynchronous operation. After a request is sent, the system returns a request ID, but the CIDR block has not been added yet. The system continues to process the addition task in the background. You can call <a href="https://help.aliyun.com/document_detail/429436.html">ListPublicIpAddressPoolCidrBlocks</a> to query the status of the CIDR block in the IP address pool.<ul>
     * <li>If the CIDR block is in the <strong>Modifying</strong> state, the CIDR block is being added. In this state, you can only perform query operations.</li>
     * <li>If the CIDR block is in the <strong>Created</strong> state, the CIDR block has been added.</li>
     * </ul>
     * </li>
     * <li><strong>AddPublicIpAddressPoolCidrBlock</strong> does not support concurrently adding the same CIDR block to an IP address pool.</li>
     * </ul>
     * 
     * @param request the request parameters of AddPublicIpAddressPoolCidrBlock  AddPublicIpAddressPoolCidrBlockRequest
     * @return AddPublicIpAddressPoolCidrBlockResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>AddSourcesToTrafficMirrorSession</strong> is an asynchronous operation. After a request is sent, the system returns a request ID. However, the traffic mirror source is not yet added, and the addition task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/261367.html">ListTrafficMirrorSessions</a> to query the status of the traffic mirror source addition:<ul>
     * <li>If the traffic mirror session is in the <strong>Modifying</strong> state, the traffic mirror source is being added.</li>
     * <li>If the traffic mirror session is in the <strong>Created</strong> state, the traffic mirror source is added.</li>
     * </ul>
     * </li>
     * <li><strong>AddSourcesToTrafficMirrorSession</strong> does not support concurrent requests to add traffic mirror sources to the same traffic mirror session.</li>
     * </ul>
     * 
     * @param request the request parameters of AddSourcesToTrafficMirrorSession  AddSourcesToTrafficMirrorSessionRequest
     * @return AddSourcesToTrafficMirrorSessionResponse
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
     * <b>description</b> :
     * <p>Make sure that you are familiar with the billing methods and pricing of EIPs before you call this operation. For more information, see <a href="https://help.aliyun.com/document_detail/122035.html">Billing overview</a>.
     * After you call this operation, an EIP in the <strong>Available</strong> state is randomly allocated in the specified region. EIPs support only ICMP, TCP, and UDP at the transport layer. IGMP and SCTP are not supported.</p>
     * 
     * @param request the request parameters of AllocateEipAddress  AllocateEipAddressRequest
     * @return AllocateEipAddressResponse
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
     * @param request the request parameters of AllocateEipAddressPro  AllocateEipAddressProRequest
     * @return AllocateEipAddressProResponse
     */
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
     * @deprecated OpenAPI AllocateEipSegmentAddress is deprecated  * @description **AllocateEipSegmentAddress** is an asynchronous operation. After you call this operation, the system returns the instance ID of a contiguous EIP group, but the contiguous EIP group is not yet created. The creation task is still running in the background. You can call [DescribeEipSegment](https://help.aliyun.com/document_detail/156063.html) to query the status of the contiguous EIP group.
     * - If the contiguous EIP group is in the **Allocating** state, the contiguous EIP group is being allocated. In this state, you can only perform query operations.
     * - If the contiguous EIP group is in the **Allocated** state, the contiguous EIP group is allocated.
     * 
     * @param request the request parameters of AllocateEipSegmentAddress  AllocateEipSegmentAddressRequest
     * @return AllocateEipSegmentAddressResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p>Scenarios: After you enable Internet bandwidth for a free IPv6 address, configure an inbound routing rule in the IPv6 gateway route table to direct public IPv6 traffic to the data center through an Express Connect circuit. This way, data center resources can provide services over the Internet by using an Alibaba Cloud IPv6 address.</p>
     * <blockquote>
     * <p>To allocate an IPv6 address to a network interface controller (NIC) of an ECS instance, invoke the <a href="https://www.alibabacloud.com/help/en/ecs/developer-reference/api-ecs-2014-05-26-assignipv6addresses">AssignIpv6Addresses</a> operation of ECS.</p>
     * </blockquote>
     * 
     * @param request the request parameters of AllocateIpv6Address  AllocateIpv6AddressRequest
     * @return AllocateIpv6AddressResponse
     */
    @Override
    public CompletableFuture<AllocateIpv6AddressResponse> allocateIpv6Address(AllocateIpv6AddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AllocateIpv6Address").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AllocateIpv6AddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AllocateIpv6AddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can enable Internet bandwidth for the following types of IPv6 addresses:<ul>
     * <li>IPv6 addresses assigned to elastic network interfaces (ENIs) of ECS instances.</li>
     * <li>Unassociated IPv6 addresses that are not attached to any resource instance.</li>
     * </ul>
     * </li>
     * <li>Before you call this operation, make sure that the target IPv6 address already exists. This means that an ECS instance in the VPC has been assigned an IPv6 address, or an unassociated IPv6 address has been created by calling <a href="https://www.alibabacloud.com/help/en/vpc/developer-reference/api-vpc-2016-04-28-allocateipv6address">AllocateIpv6Address</a>.</li>
     * <li>After Internet bandwidth is enabled, the IPv6 address can both initiate outbound connections to the Internet and be accessed from the Internet. To allow public network access to the Internet, call <a href="https://www.alibabacloud.com/help/en/ipv6-gateway/developer-reference/api-vpc-2016-04-28-createipv6egressonlyrule-ipv6s">CreateIpv6EgressOnlyRule</a>
     * to configure an IPv6 egress-only rule.</li>
     * <li>The <strong>AllocateIpv6InternetBandwidth</strong> operation does not support concurrent purchases of Internet bandwidth for the same IPv6 address.</li>
     * <li>Scenarios:<ul>
     * <li>ECS instance IPv6 Internet access: Allows an ECS instance to access the Internet or provide services over IPv6.</li>
     * <li>Unassociated IPv6 Internet access: Works with IPv6 gateway route tables to route Internet traffic to on-premises IDCs.</li>
     * <li>Outbound-only communication: Works with CreateIpv6EgressOnlyRule to allow public network access and reject inbound connections from the Internet.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of AllocateIpv6InternetBandwidth  AllocateIpv6InternetBandwidthRequest
     * @return AllocateIpv6InternetBandwidthResponse
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
     * <b>description</b> :
     * <p>To assign a specified IPv6 CIDR block to a VPC, perform the following steps:</p>
     * <ol>
     * <li>Call this operation to reserve the specified IPv6 CIDR block.</li>
     * <li>To assign the specified IPv6 CIDR block to an existing VPC, call the <a href="https://help.aliyun.com/document_detail/146745.html">AssociateVpcCidrBlock</a> operation and set <strong>RegionId</strong>, <strong>VpcId</strong>, and <strong>IPv6CidrBlock</strong> to the specified IPv6 CIDR block, and set <strong>IpVersion</strong> to <strong>ipv6</strong>. To assign the specified IPv6 CIDR block to a new VPC, call the <a href="https://help.aliyun.com/document_detail/35737.html">CreateVpc</a> operation and set <strong>RegionId</strong> and <strong>Ipv6CidrBlock</strong> to the specified IPv6 CIDR block, and set <strong>EnableIpv6</strong> to <strong>true</strong>.</li>
     * </ol>
     * 
     * @param request the request parameters of AllocateVpcIpv6Cidr  AllocateVpcIpv6CidrRequest
     * @return AllocateVpcIpv6CidrResponse
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

    /**
     * @param request the request parameters of ApplyPhysicalConnectionLOA  ApplyPhysicalConnectionLOARequest
     * @return ApplyPhysicalConnectionLOAResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>An EIP can be associated with an Elastic Compute Service (ECS) instance of the virtual private cloud (VPC) network type, a CLB instance of the VPC network type, a secondary elastic network interface, a NAT gateway, or a high-availability virtual IP address (HAVIP) in the same region.</li>
     * <li>The <strong>AssociateEipAddress</strong> operation is asynchronous. After you send a request, the system returns a request ID, but the association between the EIP and the cloud resource instance is not yet complete. The association task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/120193.html">DescribeEipAddresses</a> to query the status of the EIP:<ul>
     * <li>If the EIP is in the <strong>Associating</strong> state, the EIP is being associated. In this state, you can only perform query operations.</li>
     * <li>If the EIP is in the <strong>InUse</strong> state, the EIP is associated.</li>
     * </ul>
     * </li>
     * <li>The <strong>AssociateEipAddress</strong> operation does not support concurrent requests to associate the same EIP with cloud resource instances.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateEipAddress  AssociateEipAddressRequest
     * @return AssociateEipAddressResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>AssociateEipAddressBatch</strong> associates multiple EIPs with a cloud service instance in a batch. This operation supports only associating EIPs with an Internet NAT gateway instance or a secondary elastic network interface (ENI) in the same region. To associate an EIP with other cloud service instances, call <a href="https://help.aliyun.com/document_detail/120195.html">AssociateEipAddress</a>.</li>
     * <li><strong>AssociateEipAddressBatch</strong> is an asynchronous operation. After you send a request, the system returns a request ID. However, the association is not complete. The association task runs in the background. You can invoke <a href="https://help.aliyun.com/document_detail/120193.html">DescribeEipAddresses</a> to query the status of an EIP:<ul>
     * <li>If the EIP is in the <strong>Associating</strong> state, the EIP is being attached. In this state, you can only execute query operations.</li>
     * <li>If the EIP is in the <strong>InUse</strong> state, the association is complete.</li>
     * </ul>
     * </li>
     * <li><strong>AssociateEipAddressBatch</strong> does not support concurrent attachment of the same EIP with cloud service instances.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateEipAddressBatch  AssociateEipAddressBatchRequest
     * @return AssociateEipAddressBatchResponse
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
     * <b>description</b> :
     * <p>When you call this operation to associate an HaVip, take note of the following items:</p>
     * <ul>
     * <li>The HaVip takes effect immediately after being attached without the need to restart the ECS instance. However, you must configure the HaVip on the elastic network interface (ENI) of the ECS instance.</li>
     * <li>The HaVip and the ECS instance to be associated must belong to the same vSwitch.</li>
     * <li>An HaVip can be attached to up to 10 ECS instances or up to 10 elastic network interfaces (ENIs) at the same time. However, an HaVip cannot be associated with both ECS instances and ENIs simultaneously.</li>
     * <li>The ECS instance to be associated must be in the <strong>Running</strong> or <strong>Stopped</strong> state.</li>
     * <li>The HaVip instance must be in the <strong>Available</strong> or <strong>InUse</strong> state.</li>
     * <li><strong>AssociateHaVip</strong> is an asynchronous operation. After you call this operation, the system returns a request ID, but the HaVip is not yet associated. The association task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/114611.html">DescribeHaVips</a> to query the association status of the HaVip:<ul>
     * <li>If the HaVip is in the <strong>Associating</strong> state, the HaVip is being associated.</li>
     * <li>If the HaVip is in the <strong>InUse</strong> state, the HaVip is associated.</li>
     * </ul>
     * </li>
     * <li>The <strong>AssociateHaVip</strong> operation does not support concurrent association of the same HaVip.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateHaVip  AssociateHaVipRequest
     * @return AssociateHaVipResponse
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
     * <b>description</b> :
     * <p>To use this feature, the following conditions must be met:</p>
     * <ul>
     * <li>The device on which the Express Connect circuit resides supports the MACsec feature.</li>
     * <li>The Express Connect circuit payment must be completed.</li>
     * <li>Only dedicated Express Connect circuits are supported.
     * Other notes:</li>
     * <li>A maximum of three CKN and CAK pairs can be configured.</li>
     * <li>Associating a key that is currently in the Disassociated state disassociates the previously active key.</li>
     * <li>Associating a key that is currently in the AssociatedFailed state triggers the device to renegotiate the session.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateMacSecKey  AssociateMacSecKeyRequest
     * @return AssociateMacSecKeyResponse
     */
    @Override
    public CompletableFuture<AssociateMacSecKeyResponse> associateMacSecKey(AssociateMacSecKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateMacSecKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateMacSecKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateMacSecKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>AssociateNetworkAcl</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the network ACL is not yet associated. The association task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/116542.html">DescribeNetworkAclAttributes</a> to query the association status of the network ACL:<ul>
     * <li>If the network ACL is in the <strong>BINDING</strong> state, the network ACL is being associated.</li>
     * <li>If the network ACL is in the <strong>BINDED</strong> state, the network ACL is associated.</li>
     * </ul>
     * </li>
     * <li><strong>AssociateNetworkAcl</strong> does not support concurrent association of the same network ACL.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateNetworkAcl  AssociateNetworkAclRequest
     * @return AssociateNetworkAclResponse
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

    /**
     * @param request the request parameters of AssociatePhysicalConnectionToVirtualBorderRouter  AssociatePhysicalConnectionToVirtualBorderRouterRequest
     * @return AssociatePhysicalConnectionToVirtualBorderRouterResponse
     */
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
     * <b>description</b> :
     * <p><em>AssociateRouteTable</em>* is an asynchronous operation. After you call this operation, the system returns a request ID, but the association is not yet complete. The association task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> to query the association status of the route table:</p>
     * <ul>
     * <li>If the vSwitch is in the <strong>Pending</strong> state, the route table is being associated.</li>
     * <li>If the vSwitch is in the <strong>Available</strong> state, the route table is associated.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateRouteTable  AssociateRouteTableRequest
     * @return AssociateRouteTableResponse
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

    /**
     * @param request the request parameters of AssociateRouteTableWithGateway  AssociateRouteTableWithGatewayRequest
     * @return AssociateRouteTableWithGatewayResponse
     */
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
     * <b>description</b> :
     * <p>Before you call this operation to associate route tables with a gateway endpoint, take note of the following items:</p>
     * <ul>
     * <li>The gateway endpoint instance with which you want to associate route tables cannot be in a transient state, such as <strong>Creating</strong>, <strong>Modifying</strong>, <strong>Associating</strong>, <strong>Dissociating</strong>, or <strong>Deleting</strong>.</li>
     * <li>The route tables that you want to associate cannot be in a transient state, such as <strong>Creating</strong>, <strong>Modifying</strong>, <strong>Associating</strong>, <strong>Dissociating</strong>, or <strong>Deleting</strong>.</li>
     * <li>The route tables and the gateway endpoint must belong to the same VPC.</li>
     * <li>The route tables to be associated cannot be shared route tables.</li>
     * <li>Virtual Border Router (VBR) route tables are not supported.</li>
     * <li>You can associate up to 20 route tables at a time.</li>
     * <li>The <strong>AssociateRouteTablesWithVpcGatewayEndpoint</strong> operation is asynchronous. After you send a request, the system returns an instance ID, but the route tables have not yet been associated with the gateway endpoint. The association task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/311017.html">GetVpcGatewayEndpointAttribute</a> to query the association status of the route tables and the gateway endpoint:<ul>
     * <li>If the route tables and the gateway endpoint are in the <strong>Associating</strong> state, the association is in progress.</li>
     * <li>If the route tables and the gateway endpoint are in the <strong>Created</strong> state, the association is complete.</li>
     * </ul>
     * </li>
     * <li>The <strong>AssociateRouteTablesWithVpcGatewayEndpoint</strong> operation does not support concurrent association of the same route table with a gateway endpoint.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateRouteTablesWithVpcGatewayEndpoint  AssociateRouteTablesWithVpcGatewayEndpointRequest
     * @return AssociateRouteTablesWithVpcGatewayEndpointResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The maximum number of secondary CIDR blocks that can be added to a VPC is as follows:<ul>
     * <li>A maximum of 5 secondary IPv4 CIDR blocks can be added to a VPC.</li>
     * <li>A maximum of 5 secondary IPv6 CIDR blocks can be added to a VPC.</li>
     * </ul>
     * </li>
     * <li>The <strong>AssociateVpcCidrBlock</strong> operation does not support concurrently adding secondary CIDR blocks to the same VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateVpcCidrBlock  AssociateVpcCidrBlockRequest
     * @return AssociateVpcCidrBlockResponse
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
     * <b>description</b> :
     * <p>Before you associate a VPN gateway with an SSL certificate, take note of the following information:</p>
     * <ul>
     * <li>Only ShangMi (SM) VPN gateways support SSL certificate binding. You must attach two SSL certificates to an SM VPN gateway: one as the encryption certificate and the other as the signing certificate.</li>
     * <li>The SSL certificates must use SM algorithms.</li>
     * <li>You cannot specify the same SSL certificate as both the encryption certificate and the signing certificate for the same VPN gateway instance.
     * &lt;props=&quot;china&quot;&gt;</li>
     * <li>When you attach a VPN gateway to an SSL certificate for the first time, the system performs automatic creation of a service-linked role named AliyunServiceRoleForVPNCertificate and adds the access policy named AliyunServiceRolePolicyForVPNCertificate to the role. This grants the VPN gateway permissions to access other cloud resources. For more information, see <a href="https://help.aliyun.com/document_detail/203323.html">AliyunServiceRoleForVPNCertificate</a>.</li>
     * <li>The <strong>AssociateVpnGatewayWithCertificate</strong> operation is asynchronous. After you send a request, the system returns a request ID, but the SSL certificate is not yet attached to the VPN gateway. The binding node continues to run in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> operation to query the binding status of the SSL certificate:<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the SSL certificate is being attached.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the SSL certificate is attached.</li>
     * </ul>
     * </li>
     * <li>The <strong>AssociateVpnGatewayWithCertificate</strong> operation does not support concurrent SSL certificate binding requests for the same VPN gateway.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <p>Make sure that you have two SSL certificates that use SM algorithms in the Alibaba Cloud Certificate Management Service console. For more information about SSL certificates, see <a href="https://help.aliyun.com/document_detail/28535.html">What is Certificate Management Service?</a>.</p>
     * 
     * @param request the request parameters of AssociateVpnGatewayWithCertificate  AssociateVpnGatewayWithCertificateRequest
     * @return AssociateVpnGatewayWithCertificateResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>AttachDhcpOptionsSetToVpc</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the DHCP options set is not yet attached to the VPC. The attachment task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> to query the attachment status of the DHCP options set:<ul>
     * <li>If the DHCP options set is in the <strong>Pending</strong> state, the DHCP options set is being attached.</li>
     * <li>If the DHCP options set is in the <strong>InUse</strong> state, the DHCP options set is attached.</li>
     * </ul>
     * </li>
     * <li><strong>AttachDhcpOptionsSetToVpc</strong> does not support concurrent attachment of DHCP options sets to the same VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of AttachDhcpOptionsSetToVpc  AttachDhcpOptionsSetToVpcRequest
     * @return AttachDhcpOptionsSetToVpcResponse
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

    /**
     * @param request the request parameters of AttachVbrToVpconn  AttachVbrToVpconnRequest
     * @return AttachVbrToVpconnResponse
     */
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
     * <b>description</b> :
     * <p>Before you begin:</p>
     * <ul>
     * <li>After the setting is canceled, the maximum available bandwidth of the EIP becomes the same as that of the Internet Shared Bandwidth instance.</li>
     * <li>The <strong>CancelCommonBandwidthPackageIpBandwidth</strong> operation does not support concurrent requests to cancel the maximum available bandwidth setting for the same EIP.</li>
     * </ul>
     * 
     * @param request the request parameters of CancelCommonBandwidthPackageIpBandwidth  CancelCommonBandwidthPackageIpBandwidthRequest
     * @return CancelCommonBandwidthPackageIpBandwidthResponse
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
     * <b>description</b> :
     * <p>You can cancel the access of an Express Connect circuit only when it is in the <strong>Initial</strong>, <strong>Approved</strong>, <strong>Allocated</strong>, or <strong>Confirmed</strong> state (not enabled). After an Express Connect circuit is created by calling CreatePhysicalConnection, it may briefly be in the <strong>Allocating</strong> state, during which it cannot be canceled. Poll the status by calling DescribePhysicalConnections and call this operation after the state changes to <strong>Allocated</strong>.</p>
     * 
     * @param request the request parameters of CancelPhysicalConnection  CancelPhysicalConnectionRequest
     * @return CancelPhysicalConnectionResponse
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
     * <b>description</b> :
     * <p>The <strong>ChangeResourceGroup</strong> operation does not support concurrent modifications of the resource group to which an Express Connect circuit resource belongs within the same Express Connect circuit instance.</p>
     * 
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
     * <b>description</b> :
     * <ul>
     * <li>The first and last 3 IPv4 addresses of each vSwitch are system reserved IP addresses, and the first and last 9 IPv6 addresses are system reserved IP addresses. These addresses cannot be allocated.</li>
     * </ul>
     * 
     * @param request the request parameters of CheckCanAllocateVpcPrivateIpAddress  CheckCanAllocateVpcPrivateIpAddressRequest
     * @return CheckCanAllocateVpcPrivateIpAddressResponse
     */
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

    /**
     * @param request the request parameters of CheckVpnBgpEnabled  CheckVpnBgpEnabledRequest
     * @return CheckVpnBgpEnabledResponse
     */
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

    /**
     * <b>description</b> :
     * <p>Calls the CompletePhysicalConnectionLOA operation to complete the construction. Before calling this operation, call DescribePhysicalConnectionLOA to query the LOA status. You can call this operation only when the status is <strong>Available</strong> or <strong>Complete</strong>. After an LOA application is submitted, the status changes to <strong>Applying</strong>. After the application is approved, the status changes to <strong>Available</strong>. If the application is rejected, the status changes to <strong>Rejected</strong>. For a rejected application, call SecondApplyPhysicalConnectionLOA to reapply. After the construction is completed, the LOA status changes to <strong>Complete</strong>.
     * Complete call chain:
     * CreatePhysicalConnection → ApplyPhysicalConnectionLOA (LOA enters the Applying state) → Wait for approval (Available after approval; Rejected if denied, in which case call SecondApplyPhysicalConnectionLOA or ApplyPhysicalConnectionLOA again to reapply) → CompletePhysicalConnectionLOA (backfill completion information, LOA enters the Completing state) → ConfirmPhysicalConnection (confirm the Express Connect circuit, LOA enters the Complete state).</p>
     * 
     * @param request the request parameters of CompletePhysicalConnectionLOA  CompletePhysicalConnectionLOARequest
     * @return CompletePhysicalConnectionLOAResponse
     */
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

    /**
     * @param request the request parameters of ConfirmPhysicalConnection  ConfirmPhysicalConnectionRequest
     * @return ConfirmPhysicalConnectionResponse
     */
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
     * <b>description</b> :
     * <p>After you invoke this operation, the router interface enters the <strong>Connecting</strong> state and transitions to the <strong>Active</strong> state after the connection is established.
     * When you invoke this operation to create a VPC, note the following items: </p>
     * <ul>
     * <li>Only a requester VPC router interface in the <strong>Idle</strong> state can initiate a connection to the accepter VPC. </li>
     * <li>A maximum of one pair of interconnected router interfaces can exist between any two routers. </li>
     * <li>If your account has a router interface with an overdue payment, you cannot initiate a connection.</li>
     * </ul>
     * 
     * @param request the request parameters of ConnectRouterInterface  ConnectRouterInterfaceRequest
     * @return ConnectRouterInterfaceResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>CopyNetworkAclEntries</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the network ACL rules have not been replicated yet. The replication node is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/116542.html">DescribeNetworkAclAttributes</a> to query the replication status of the network ACL rules:<ul>
     * <li>If the network ACL rules are in the <strong>Modifying</strong> state, the network ACL rules are being replicated.</li>
     * <li>If the network ACL rules are in the <strong>Available</strong> state, the network ACL rules are replicated. Copy succeeded.</li>
     * </ul>
     * </li>
     * <li><strong>CopyNetworkAclEntries</strong> does not support concurrent replication of the same network ACL rules.</li>
     * </ul>
     * 
     * @param request the request parameters of CopyNetworkAclEntries  CopyNetworkAclEntriesRequest
     * @return CopyNetworkAclEntriesResponse
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
     * <b>description</b> :
     * <p>You can use Border Gateway Protocol (BGP) to enable communication between a VBR and an on-premises data center. Each BGP group is associated with a VBR. You only need to add the BGP peers that communicate with the VBR to the corresponding BGP group, and then advertise the Border Gateway Protocol (BGP) networks in the VBR. 
     * BGP groups simplify BGP configurations by merging BGP peers with the same configurations into a single BGP group, which reduces configuration complexity. Create a BGP group based on the requested Autonomous System Number (ASN). 
     * When you invoke this operation to create a BGP group, take note of the following items: </p>
     * <ul>
     * <li>A VBR supports establishing BGP peers only with the on-premises data center at the other end of the Express Connect circuit.</li>
     * <li>The BGP version supported by VBRs is BGP-4.</li>
     * <li>Each VBR supports up to 8 BGP peers.</li>
     * <li>Each BGP peer supports up to 110 dynamic routes.</li>
     * <li>The ASN on the Alibaba Cloud side is 45104. The ASN on the user side can be a 2-byte or 4-byte value.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateBgpGroup  CreateBgpGroupRequest
     * @return CreateBgpGroupResponse
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

    /**
     * @param request the request parameters of CreateBgpPeer  CreateBgpPeerRequest
     * @return CreateBgpPeerResponse
     */
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

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;<ph>This operation supports only the creation of pay-as-you-go Internet Shared Bandwidth instances. To create a subscription Internet Shared Bandwidth instance, see <a href="https://help.aliyun.com/document_detail/65223.html">Create an Internet Shared Bandwidth instance</a>.</ph></p>
     * 
     * @param request the request parameters of CreateCommonBandwidthPackage  CreateCommonBandwidthPackageRequest
     * @return CreateCommonBandwidthPackageResponse
     */
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

    /**
     * @param request the request parameters of CreateCustomerGateway  CreateCustomerGatewayRequest
     * @return CreateCustomerGatewayResponse
     */
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
     * <b>description</b> :
     * <p>When you call this operation to create a default vSwitch, take note of the following items:</p>
     * <ul>
     * <li>The first and last three IP addresses of each default vSwitch CIDR block are reserved by the system. For example, the system reserved IP addresses for 192.168.1.0/24 are 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
     * <li>The number of cloud service instances in a default vSwitch cannot exceed the remaining available cloud service instances in the VPC (15,000 minus the current number of cloud service instances).</li>
     * <li>Default vSwitches do not support multicast or broadcast.</li>
     * <li>After a default vSwitch is created, you cannot modify its CIDR block.</li>
     * <li>The <strong>CreateDefaultVSwitch</strong> operation is asynchronous. After you call this operation, the system returns an instance ID, but the default vSwitch has not been created yet. The background task is still in progress. You can call <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> to query the creation status of the default vSwitch:<ul>
     * <li>If the default vSwitch is in the <strong>Pending</strong> state, the default vSwitch is being configured.</li>
     * <li>If the default vSwitch is in the <strong>Available</strong> state, the default vSwitch is available.</li>
     * </ul>
     * </li>
     * <li>If a default vSwitch already exists in a zone of the specified region, the call to this operation fails.</li>
     * <li>Before creating a default vSwitch, create a default VPC first. You can call the <a href="https://help.aliyun.com/document_detail/609152.html">CreateDefaultVpc</a> operation to create a default VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateDefaultVSwitch  CreateDefaultVSwitchRequest
     * @return CreateDefaultVSwitchResponse
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
     * <b>description</b> :
     * <p>When you call this operation to create a default VPC, note the following items:</p>
     * <ul>
     * <li><p>After a default VPC is created, you cannot modify its CIDR block, but you can add secondary IPv4 CIDR blocks.</p>
     * </li>
     * <li><p>Each default VPC supports up to 300,000 private network IP addresses for cloud resources. This quota cannot be upgraded.</p>
     * </li>
     * <li><p>After a default VPC is created, a vRouter and a route table are automatically created.</p>
     * </li>
     * <li><p>Each default VPC supports up to three user CIDR blocks. If one user CIDR block contains another, the CIDR block with the shorter mask takes effect. For example, if both 10.0.0.0/16 and 10.0.0.0/24 are specified, 10.0.0.0/16 takes effect.</p>
     * </li>
     * <li><p>The <strong>CreateDefaultVpc</strong> operation is asynchronous. After you call this operation, the system returns an instance ID, but the default VPC is not yet created. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> to query the creation status of the default VPC:</p>
     * <ul>
     * <li>If the default VPC is in the <strong>Pending</strong> state, the default VPC is being configured.</li>
     * <li>If the default VPC is in the <strong>Available</strong> state, the default VPC is available.</li>
     * </ul>
     * </li>
     * <li><p>The <strong>CreateDefaultVpc</strong> operation does not support concurrent creation of default VPCs in the same region.</p>
     * </li>
     * <li><p>Only one default VPC can exist in a region.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateDefaultVpc  CreateDefaultVpcRequest
     * @return CreateDefaultVpcResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>CreateDhcpOptionsSet</strong> is an asynchronous operation. After you invoke this operation, the system returns an instance ID but the DHCP options set is not yet created. The background node is still in progress. You can invoke <a href="https://help.aliyun.com/document_detail/448820.html">GetDhcpOptionsSet</a> to query the creation status of the DHCP options set:<ul>
     * <li>If the vSwitch is in the <strong>Pending</strong> state, the DHCP options set is being configured.</li>
     * <li>If the vSwitch is in the <strong>Active</strong> state, the DHCP options set is active.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateDhcpOptionsSet  CreateDhcpOptionsSetRequest
     * @return CreateDhcpOptionsSetResponse
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

    /**
     * <b>description</b> :
     * <ul>
     * <li>Before you create an enhanced VPN gateway, we recommend that you understand the limits of VPN gateways. For more information, see <a href="https://www.alibabacloud.com/help/en/vpn/sub-product-ipsec-vpn/user-guide/vpn-gateway-instance/">Limits of VPN Gateway</a>.</li>
     * <li>Enhanced VPN gateway instances support only dual-tunnel IPsec-VPN connections. When you call the <code>CreateEnhancedVpnGateway</code> operation to create a VPN gateway instance, in addition to the required parameters, you must also specify the <strong>VSwitchId</strong> and <strong>DisasterRecoveryVSwitchId</strong> parameters.</li>
     * <li>The <strong>CreateEnhancedVpnGateway</strong> operation is asynchronous. After you send a request, the system returns an instance ID, but the enhanced VPN gateway is not yet created. The creation task is still running in the background. You can call <a href="https://www.alibabacloud.com/help/en/vpn/sub-product-ipsec-vpn/developer-reference/api-vpc-2016-04-28-describevpngateway-vpns">DescribeVpnGateway</a> to query the creation status of the enhanced VPN gateway:<ul>
     * <li>If the enhanced VPN gateway is in the <strong>provisioning</strong> state, the enhanced VPN gateway is being created.</li>
     * <li>If the enhanced VPN gateway is in the <strong>active</strong> state, the enhanced VPN gateway is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateEnhancedVpnGateway  CreateEnhancedVpnGatewayRequest
     * @return CreateEnhancedVpnGatewayResponse
     */
    @Override
    public CompletableFuture<CreateEnhancedVpnGatewayResponse> createEnhancedVpnGateway(CreateEnhancedVpnGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEnhancedVpnGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEnhancedVpnGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEnhancedVpnGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateExpressCloudConnection  CreateExpressCloudConnectionRequest
     * @return CreateExpressCloudConnectionResponse
     */
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

    /**
     * <b>description</b> :
     * <ul>
     * <li>The Express Connect QoS feature is currently in invitational preview. To call this operation, contact your account manager to be added to the whitelist.</li>
     * <li>The number of QoS policies that each user can create is subject to a quota limit. To increase the quota, contact your account manager.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateExpressConnectTrafficQos  CreateExpressConnectTrafficQosRequest
     * @return CreateExpressConnectTrafficQosResponse
     */
    @Override
    public CompletableFuture<CreateExpressConnectTrafficQosResponse> createExpressConnectTrafficQos(CreateExpressConnectTrafficQosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateExpressConnectTrafficQos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExpressConnectTrafficQosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExpressConnectTrafficQosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The default queue cannot be created.</li>
     * <li>The number of high-priority queues has an upper limit. To increase the quota, contact your account manager.</li>
     * <li>The number of lower-priority queues has an upper limit. To increase the quota, contact your account manager.</li>
     * <li>The total bandwidth percentage of all lower-priority queues has an upper limit.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateExpressConnectTrafficQosQueue  CreateExpressConnectTrafficQosQueueRequest
     * @return CreateExpressConnectTrafficQosQueueResponse
     */
    @Override
    public CompletableFuture<CreateExpressConnectTrafficQosQueueResponse> createExpressConnectTrafficQosQueue(CreateExpressConnectTrafficQosQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateExpressConnectTrafficQosQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExpressConnectTrafficQosQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExpressConnectTrafficQosQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The priority of a QoS rule must be unique within a QoS policy.</li>
     * <li>The number of QoS rules in a single QoS queue is limited. To increase the quota, contact your account manager.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateExpressConnectTrafficQosRule  CreateExpressConnectTrafficQosRuleRequest
     * @return CreateExpressConnectTrafficQosRuleResponse
     */
    @Override
    public CompletableFuture<CreateExpressConnectTrafficQosRuleResponse> createExpressConnectTrafficQosRule(CreateExpressConnectTrafficQosRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateExpressConnectTrafficQosRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateExpressConnectTrafficQosRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateExpressConnectTrafficQosRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Resource status requirements (prerequisites)</p>
     * <ul>
     * <li><p>Before creating a failover test job, ensure that the test resources and their associated resources are in the following states. Otherwise, the creation fails:</p>
     * </li>
     * <li><p>ResourceType set to PHYSICALCONNECTION: The Express Connect circuit (including shared Express Connect circuits) must be in the Enabled state with normal billing status (no overdue payment). Otherwise, IncorrectStatus.ResourceId or IncorrectBusinessStatus.ResourceId is returned.</p>
     * </li>
     * <li><p>ResourceType set to VIRTUALBORDERROUTER: The VBR must be in the active state with no overdue payment, and the Express Connect circuit to which the VBR belongs must also be in the Enabled state with no overdue payment.</p>
     * </li>
     * <li><p>ResourceType set to BGPPEER: The BGP peer must be in the Available state, the VBR to which it belongs must be in the active state, and the Express Connect circuit to which the VBR belongs must be in the Enabled state, all with no overdue payment.
     * How to check and advance the Express Connect circuit status</p>
     * </li>
     * <li><p>Call DescribePhysicalConnections to query the Status field of the Express Connect circuit. If the circuit is not in the Enabled state (for example, it is in the Allocated or Confirmed state), advance it along the following state transition path:</p>
     * <ul>
     * <li>Allocated (port reserved, pending confirmation) → Call ConfirmPhysicalConnection to confirm → Confirmed → Call EnablePhysicalConnection to activate (asynchronous; poll DescribePhysicalConnections after activation to confirm) → Enabled.</li>
     * <li>Note: EnablePhysicalConnection only supports activating Express Connect circuits in the Confirmed state. If the circuit is in the Allocated state, call ConfirmPhysicalConnection first.</li>
     * </ul>
     * </li>
     * <li><p>When JobType is set to StartLater, the status check described above is performed during the job creation phase. When you subsequently call StartFailoverTestJob to start the job, the resource status is checked again. If the resource status does not meet the requirements at that time (for example, the circuit is no longer in the Enabled state), the start operation fails.
     * The following scenarios do not support creating failover test jobs:</p>
     * </li>
     * <li><p>A failover test job is already running in the current region, and the job type of the new failover test job is set to start immediately.</p>
     * </li>
     * <li><p>The Express Connect circuit instance or shared Express Connect circuit instance has not been paid for or has an overdue payment.</p>
     * </li>
     * <li><p>The Express Connect circuit instance or shared Express Connect circuit instance is already in another running failover test job.</p>
     * </li>
     * <li><p>The Express Connect circuit instance has more than one shared Express Connect circuit.</p>
     * </li>
     * <li><p>The Express Connect circuit instance has more than one cross-account VBR.</p>
     * </li>
     * <li><p>The shared Express Connect circuit instance is not associated with a VBR.</p>
     * </li>
     * <li><p>The VLAN configuration of the shared Express Connect circuit instance is 0.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateFailoverTestJob  CreateFailoverTestJobRequest
     * @return CreateFailoverTestJobResponse
     */
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
     * <b>description</b> :
     * <p><em>CreateFlowLog</em>* is an asynchronous operation. After you call this operation, the system returns an instance ID, but the flow log has not been created yet. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/448670.html">DescribeFlowLogs</a> to query the creation status of the flow log:</p>
     * <ul>
     * <li>If the flow log is in the <strong>Activating</strong> state, the flow log is being created.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log is created and activated.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFlowLog  CreateFlowLogRequest
     * @return CreateFlowLogResponse
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
     * <b>description</b> :
     * <p>Each DNAT entry consists of five parts: <strong>ExternalIp</strong>, <strong>ExternalPort</strong>, <strong>IpProtocol</strong>, <strong>InternalIp</strong>, and <strong>InternalPort</strong>. After you add a DNAT entry, the NAT gateway forwards packets of the specified protocol received on <strong>ExternalIp:ExternalPort</strong> to <strong>InternalIp:InternalPort</strong> and returns responses along the same path.
     * Note the following when you call this operation to add a DNAT entry: </p>
     * <ul>
     * <li><p>The <strong>CreateForwardEntry</strong> operation is asynchronous. After you send a request, the system returns a DNAT entry ID, but the DNAT entry is not yet added. The system adds the entry in the background. You can call <a href="https://help.aliyun.com/document_detail/36053.html">DescribeForwardTableEntries</a> to query the status of the DNAT entry:</p>
     * <ul>
     * <li>If the DNAT entry is in the <strong>Pending</strong> state, the DNAT entry is being added. In this state, you can only perform query operations.</li>
     * <li>If the DNAT entry is in the <strong>Available</strong> state, the DNAT entry is added.</li>
     * </ul>
     * </li>
     * <li><p>The combination of <strong>ExternalIp</strong>, <strong>ExternalPort</strong>, and <strong>IpProtocol</strong> of each DNAT entry must be unique. You cannot forward packets from the same source IP address, port, and protocol to multiple destination ECS instances.</p>
     * </li>
     * <li><p>The combination of <strong>InternalIp</strong>, <strong>InternalPort</strong>, and <strong>IpProtocol</strong> of each DNAT entry must also be unique.</p>
     * </li>
     * <li><p>The IP addresses specified by <strong>ExternalIp</strong> and <strong>InternalIp</strong> in a DNAT entry cannot be the same. If your business requires the two IP addresses to be the same, contact your account manager.</p>
     * </li>
     * <li><p>A maximum of 100 DNAT entries can be added to a DNAT table.</p>
     * </li>
     * <li><p>An IP address configured with IP mapping in a DNAT entry (an EIP used by an Internet NAT gateway or a NAT IP address used by a VPC NAT gateway) cannot be used by other DNAT entries or SNAT entries.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateForwardEntry  CreateForwardEntryRequest
     * @return CreateForwardEntryResponse
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
     * <b>description</b> :
     * <p><em>CreateFullNatEntry</em>* is an asynchronous operation. After you send a request, the system returns a FULLNAT entry, but the FULLNAT entry has not been added yet. The addition task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/348779.html">ListFullNatEntries</a> to query the status of the FULLNAT entry:</p>
     * <ul>
     * <li>If the FULLNAT entry is in the <strong>Creating</strong> state, the FULLNAT entry is being added. In this state, you can only perform query operations and cannot perform other operations.</li>
     * <li>If the FULLNAT entry is in the <strong>Available</strong> state, the FULLNAT entry has been added.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateFullNatEntry  CreateFullNatEntryRequest
     * @return CreateFullNatEntryResponse
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
     * @deprecated OpenAPI CreateGlobalAccelerationInstance is deprecated  * @description ## Operation description
     * This operation supports only the creation of pay-as-you-go Alibaba Cloud Global Accelerator (GA) instances.
     * 
     * @param request the request parameters of CreateGlobalAccelerationInstance  CreateGlobalAccelerationInstanceRequest
     * @return CreateGlobalAccelerationInstanceResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p><em>CreateHaVip</em>* is an asynchronous operation. After you call this operation, the system returns the HAVIP ID, but the HAVIP is not yet created. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/114611.html">DescribeHaVips</a> to query the creation status of the HAVIP:</p>
     * <ul>
     * <li>If the HAVIP is in the <strong>Creating</strong> state, the HAVIP is being created.</li>
     * <li>If the HAVIP is in the <strong>Available</strong> state, the HAVIP is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateHaVip  CreateHaVipRequest
     * @return CreateHaVipResponse
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

    /**
     * <b>description</b> :
     * <p>When you purchase ports, you can select one of the following three combination types to provide disaster recovery capabilities for your business or workloads.</p>
     * <ul>
     * <li>Maximum disaster recovery: You apply for resources in two access points and establish four independent Express Connect circuit connections. The SLA availability for maximum disaster recovery is no less than 99.99%.</li>
     * <li>Enhanced disaster recovery: You apply for resources in two access points and establish two independent Express Connect circuit connections. The SLA availability for enhanced disaster recovery is no less than 99.95%.</li>
     * <li>Development and testing: You apply for resources in one access point and establish two independent Express Connect circuit connections.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateHighReliablePhysicalConnection  CreateHighReliablePhysicalConnectionRequest
     * @return CreateHighReliablePhysicalConnectionResponse
     */
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
     * @deprecated OpenAPI CreateIPv6Translator is deprecated  * @param request  the request parameters of CreateIPv6Translator  CreateIPv6TranslatorRequest
     * @return CreateIPv6TranslatorResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI CreateIPv6TranslatorAclList is deprecated  * @param request  the request parameters of CreateIPv6TranslatorAclList  CreateIPv6TranslatorAclListRequest
     * @return CreateIPv6TranslatorAclListResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI CreateIPv6TranslatorEntry is deprecated  * @param request  the request parameters of CreateIPv6TranslatorEntry  CreateIPv6TranslatorEntryRequest
     * @return CreateIPv6TranslatorEntryResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <ul>
     * <li>Before you create an IPsec server, create a VPN gateway and make sure that the SSL-VPN feature is enabled for the VPN gateway. For more information, see <a href="https://help.aliyun.com/document_detail/2794049.html">CreateVpnGateway</a>.</li>
     * <li>Before you create an IPsec server, make sure that no IPsec-VPN connections exist on the VPN gateway instance. For more information, see <a href="https://help.aliyun.com/document_detail/2526948.html">DeleteVpnConnection</a>.</li>
     * <li><strong>CreateIpsecServer</strong> is an asynchronous operation. After you send a request, the system returns an instance ID but the IPsec server is not yet created. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> to query the status of the VPN gateway instance to determine the creation status of the IPsec server:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the IPsec server is being created.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the IPsec server is created.</li>
     * </ul>
     * </li>
     * <li><strong>CreateIpsecServer</strong> does not support concurrent creation of IPsec servers on the same VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIpsecServer  CreateIpsecServerRequest
     * @return CreateIpsecServerResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>CreateIpv4Gateway</strong> is an asynchronous operation. After you call this operation, the system returns an instance ID, but the IPv4 gateway is not yet created. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/407670.html">GetIpv4GatewayAttribute</a> to query the creation status of the IPv4 gateway:<ul>
     * <li>If the IPv4 gateway is in the <strong>Creating</strong> state, the IPv4 gateway is being created.</li>
     * <li>If the IPv4 gateway is in the <strong>Created</strong> state, the IPv4 gateway is created.</li>
     * </ul>
     * </li>
     * <li>You cannot call <strong>CreateIpv4Gateway</strong> to concurrently create IPv4 gateways in the same VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIpv4Gateway  CreateIpv4GatewayRequest
     * @return CreateIpv4GatewayResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>CreateIpv6EgressOnlyRule</strong> is an asynchronous operation. After you send a request, the system returns an instance ID but the IPv6 egress-only rule is not yet created. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/102208.html">DescribeIpv6EgressOnlyRules</a> to query the creation status of the IPv6 egress-only rule:<ul>
     * <li>When the IPv6 egress-only rule is in the <strong>Creating</strong> state, the rule is being created.</li>
     * <li>When the IPv6 egress-only rule is in the <strong>Created</strong> state, the rule is created.</li>
     * </ul>
     * </li>
     * <li><strong>CreateIpv6EgressOnlyRule</strong> does not support concurrent creation of egress-only rules for the same IPv6 address.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIpv6EgressOnlyRule  CreateIpv6EgressOnlyRuleRequest
     * @return CreateIpv6EgressOnlyRuleResponse
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
     * <b>description</b> :
     * <ul>
     * <li>Before you create an IPv6 gateway, make sure that the target VPC and vSwitch have IPv6 CIDR blocks enabled. You can call <a href="https://help.aliyun.com/document_detail/448582.html">DescribeVpcAttribute</a> to query the VPC configurations.</li>
     * <li>You can create only one IPv6 gateway for each VPC.</li>
     * <li><strong>CreateIpv6Gateway</strong> is an asynchronous operation. After you send a request, the system returns an instance ID but enable IPv6 gateway is not yet created. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/102226.html">DescribeIpv6GatewayAttribute</a> to query the creation status of enable IPv6 gateway:<ul>
     * <li>If enable IPv6 gateway is in the <strong>Creating</strong> state, enable IPv6 gateway is being created.</li>
     * <li>If enable IPv6 gateway is in the <strong>Created</strong> state, enable IPv6 gateway is created.</li>
     * </ul>
     * </li>
     * <li><strong>CreateIpv6Gateway</strong> does not support concurrent creation of IPv6 gateways in the same VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateIpv6Gateway  CreateIpv6GatewayRequest
     * @return CreateIpv6GatewayResponse
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
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following information:</p>
     * <ul>
     * <li>When you create a NAT gateway for the first time, the system performs automatic creation of a service-linked role named AliyunServiceRoleForNatgw and associates the access policy named AliyunServiceRolePolicyForNatgw with the role. This grants the NAT gateway permissions to access other cloud resources. For more information, see <a href="https://help.aliyun.com/document_detail/174251.html">Service-linked role</a>.</li>
     * <li>After an enhanced Internet NAT gateway is created, the system automatically adds a route to the VPC route table with the destination CIDR block 0.0.0.0/0 and the next hop set to the NAT gateway. This route directs traffic to the NAT gateway.</li>
     * <li>The <strong>CreateNatGateway</strong> operation is asynchronous. After you call this operation, the system returns the instance ID of a NAT gateway (Internet NAT gateway or VPC NAT gateway), but the NAT gateway instance is not yet created. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/36054.html">DescribeNatGateways</a> to query the status of the NAT gateway.<ul>
     * <li>If the NAT gateway is in the <strong>Creating</strong> state, the NAT gateway is being created. In this state, you can only perform query operations.</li>
     * <li>If the NAT gateway is in the <strong>Available</strong> state, the NAT gateway is created.</li>
     * </ul>
     * </li>
     * </ul>
     * <p> It takes 1 to 3 minutes to create a NAT gateway.</p>
     * 
     * @param request the request parameters of CreateNatGateway  CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
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
     * <b>description</b> :
     * <p><em>CreateNatIp</em>* is an asynchronous operation. After you call this operation, the system returns a NAT IP address, but the NAT IP address is not yet created. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/287000.html">ListNatIps</a> to query the status of the NAT IP address:</p>
     * <ul>
     * <li>If the NAT IP address is in the <strong>Creating</strong> state, the NAT IP address is being created. In this state, you can only perform query operations.</li>
     * <li>If the NAT IP address is in the <strong>Available</strong> state, the NAT IP address is created.
     * The <strong>CreateNatIp</strong> operation does not support concurrent creation of NAT IP addresses within the same NAT gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateNatIp  CreateNatIpRequest
     * @return CreateNatIpResponse
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
     * <b>description</b> :
     * <p>The <strong>CreateNatIpCidr</strong> operation does not support concurrent creation of NAT IP CIDR blocks within the same NAT gateway.</p>
     * 
     * @param request the request parameters of CreateNatIpCidr  CreateNatIpCidrRequest
     * @return CreateNatIpCidrResponse
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

    /**
     * @param request the request parameters of CreateNetworkAcl  CreateNetworkAclRequest
     * @return CreateNetworkAclResponse
     */
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
     * <b>description</b> :
     * <p>You can apply for a dedicated Express Connect circuit or apply for a shared Express Connect circuit for a tenant. After the application is complete, the Express Connect circuit enters the <strong>Initial</strong> state. Contact the carrier to start construction. </p>
     * <p>When you call this operation, note the following items: </p>
     * <ul>
     * <li>When you apply for an Express Connect circuit, the number of Express Connect circuits that are not in the <strong>Enabled</strong> state cannot exceed 5.  </li>
     * <li>If your account has an Express Connect circuit with an overdue payment, you cannot apply for a new Express Connect circuit.</li>
     * </ul>
     * 
     * @param request the request parameters of CreatePhysicalConnection  CreatePhysicalConnectionRequest
     * @return CreatePhysicalConnectionResponse
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
     * <b>description</b> :
     * <blockquote>
     * <p>Only Express Connect circuits in the Waiting for Payment (<strong>Complete</strong>) state support this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of CreatePhysicalConnectionOccupancyOrder  CreatePhysicalConnectionOccupancyOrderRequest
     * @return CreatePhysicalConnectionOccupancyOrderResponse
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

    /**
     * @param request the request parameters of CreatePhysicalConnectionSetupOrder  CreatePhysicalConnectionSetupOrderRequest
     * @return CreatePhysicalConnectionSetupOrderResponse
     */
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
     * <b>description</b> :
     * <p>The IP address pool feature is not available by default. To use this feature, apply for the <strong>IP address pool feature</strong> privilege quota in Quota Center. For more information, see <a href="https://help.aliyun.com/document_detail/108213.html">Increase a quota in Quota Center</a>.</p>
     * 
     * @param request the request parameters of CreatePublicIpAddressPool  CreatePublicIpAddressPoolRequest
     * @return CreatePublicIpAddressPoolResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>CreateRouteEntries</strong> is an asynchronous operation. After you invoke this operation, the system returns an instance ID, but the custom route entry has not been created yet. The system is still running the task in the background. You can invoke <a href="https://help.aliyun.com/document_detail/138148.html">DescribeRouteEntryList</a> to query the creation status of the custom route entry:<ul>
     * <li>If the custom route entry is in the <strong>Creating</strong> state, the custom route entry is being created.</li>
     * <li>If the custom route entry is in the <strong>Created</strong> state, the custom route entry has been created.</li>
     * </ul>
     * </li>
     * <li><strong>CreateRouteEntries</strong> does not support concurrent bulk creation of custom route entries in the same VPC.
     * <strong>When you use this operation to add custom route entries to a route table of a vRouter, take note of the following items:</strong></li>
     * <li>A route table can contain a maximum of 200 custom route entries.</li>
     * <li>The destination CIDR block (<strong>DstCidrBlock</strong>) of a custom route entry cannot be the same as, contain, or be contained by the CIDR block of a vSwitch in the VPC.</li>
     * <li>The destination CIDR block (<strong>DstCidrBlock</strong>) of a custom route entry cannot point to 100.64.0.0/10 or be contained by 100.64.0.0/10.</li>
     * <li>The destination CIDR blocks (<strong>DstCidrBlock</strong>) of route entries in the same route table must be unique.</li>
     * <li>If the specified destination CIDR block (<strong>DstCidrBlock</strong>) is an IP address, the system processes it with a 32-bit mask.</li>
     * <li>Multiple custom route entries can point to the same next hop (<strong>NextHop</strong>).</li>
     * <li>The next hop (<strong>NextHop</strong>) of a custom route entry must be in the same VPC as the route table.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRouteEntries  CreateRouteEntriesRequest
     * @return CreateRouteEntriesResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>CreateRouteEntry</strong> operation is asynchronous. After you send a request, the system returns an instance ID while the custom route entry is still being added in the background. You can invoke <a href="https://help.aliyun.com/document_detail/138148.html">DescribeRouteEntryList</a> to query the status of the custom route entry:<ul>
     * <li>If the custom route entry is in the <strong>Creating</strong> state, the custom route entry is being added.</li>
     * <li>If the custom route entry is in the <strong>Created</strong> state, the custom route entry has been added.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateRouteEntry</strong> operation does not support concurrent addition of custom route entries in the same VPC or the same VBR.</li>
     * <li>The <strong>CreateRouteEntry</strong> operation may return the <strong>TaskConflict</strong> error code in concurrent scenarios. Retry the request as appropriate.
     * <strong>When you use this operation to add custom route entries to a route table of a vRouter, take note of the following items:</strong><blockquote>
     * <p>When the route to be added is a prefix list route, the route quota is calculated based on the sum of existing routes and the maximum number of route entries in the prefix list route. The sum cannot exceed the route quota limit.</p>
     * </blockquote>
     * </li>
     * <li>A route table can contain a maximum of 200 custom route entries.</li>
     * <li>The destination CIDR block (<strong>DestinationCidrBlock</strong>) of a custom route entry cannot be the same as the CIDR block of a vSwitch in the VPC. The destination CIDR block can contain the CIDR block of a vSwitch but cannot be contained by the CIDR block of a vSwitch.</li>
     * <li>The destination CIDR block (<strong>DestinationCidrBlock</strong>) of a custom route entry can be a more specific CIDR block than the system route CIDR block <code>100.64.0.0/10</code> used by cloud services, but cannot be the same as this CIDR block.
     * <notice>The system route with the destination CIDR block <code>100.64.0.0/10</code> is used for communication among cloud services within the VPC. Exercise caution when you configure a more specific route. Incorrect configurations may cause cloud services to become inaccessible.</notice></li>
     * <li>Route entries in the same route table cannot have the same destination CIDR block (<strong>DestinationCidrBlock</strong>).</li>
     * <li>If the specified destination CIDR block (<strong>DestinationCidrBlock</strong>) is an IP address, the system processes it with a 32-bit mask.</li>
     * <li>Multiple custom route entries can point to the same next hop (<strong>NextHopId</strong>).</li>
     * <li>The next hop (<strong>NextHopId</strong>) of a custom route entry must be in the same VPC as the route table.</li>
     * <li>You can configure ECMP routing by using the <strong>NextHopList</strong> parameter settings:<ul>
     * <li><p>To add a non-ECMP custom route, specify the <strong>DestinationCidrBlock</strong>, <strong>NextHopType</strong>, and <strong>NextHopId</strong> parameters. Do not specify the <strong>NextHopList</strong> parameter.   </p>
     * </li>
     * <li><p>To add an ECMP route, specify the <strong>DestinationCidrBlock</strong> and <strong>NextHopList</strong> parameters. Do not specify the <strong>NextHopType</strong> or <strong>NextHopId</strong> parameter.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p><strong>When you use this operation to add custom route entries to a route table of a Virtual Border Router (VBR), take note of the following items:</strong></p>
     * <ul>
     * <li><p>A route table can contain a maximum of 200 custom route entries.  </p>
     * </li>
     * <li><p>The <strong>NextHopList</strong> parameter is not supported.   </p>
     * </li>
     * <li><p>The destination CIDR block (<strong>DestinationCidrBlock</strong>) of a custom route entry can be a more specific CIDR block than the system route CIDR block <code>100.64.0.0/10</code> used by cloud services, but cannot be the same as this CIDR block.
     * <notice>The system route with the destination CIDR block <code>100.64.0.0/10</code> is used for communication among cloud services within the VPC. Exercise caution when you configure a more specific route. Incorrect configurations may cause cloud services to become inaccessible.</notice></p>
     * </li>
     * <li><p>Route entries in the same route table cannot have the same destination CIDR block (<strong>DestinationCidrBlock</strong>).   </p>
     * </li>
     * <li><p>If the specified destination CIDR block (<strong>DestinationCidrBlock</strong>) is an IP address, the system processes it with a 32-bit mask.   </p>
     * </li>
     * <li><p>Multiple custom route entries can point to the same next hop (<strong>NextHopId</strong>).  </p>
     * </li>
     * <li><p>The next hop (<strong>NextHopId</strong>) of a custom route entry must be the vRouter interface associated with the VBR.  </p>
     * </li>
     * <li><p>You can add route entries to a VBR only when the VBR is in the <strong>Active</strong> state, the corresponding Express Connect circuit is in the <strong>Enabled</strong> state, and the circuit is not locked due to overdue payment.  </p>
     * </li>
     * <li><p>Only non-ECMP route entries are supported. Specify the <strong>DestinationCidrBlock</strong>, <strong>NextHopType</strong>, and <strong>NextHopId</strong> parameters. Do not specify the <strong>NextHopList</strong> parameter.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateRouteEntry  CreateRouteEntryRequest
     * @return CreateRouteEntryResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>CreateRouteTable</strong> is an asynchronous operation. After you call this operation, the system returns an instance ID, but the custom route table has not been created yet. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/87602.html">DescribeRouteTableList</a> to query the creation status of the custom route table:<ul>
     * <li>If the custom route table is in the <strong>Creating</strong> state, the custom route table is being created.</li>
     * <li>If the custom route table is in the <strong>Available</strong> state, the custom route table is created.</li>
     * </ul>
     * </li>
     * <li><strong>CreateRouteTable</strong> does not support concurrent creation of custom route tables in the same VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRouteTable  CreateRouteTableRequest
     * @return CreateRouteTableResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>CreateRouteTargetGroup</strong> is an asynchronous operation. After you invoke this operation, the system returns an instance ID, but the routing target group instance is not yet created. The creation task continues in the background. You can invoke <strong>ListRouteTargetGroup</strong> to query the creation status of the routing target group:<ul>
     * <li>If the routing target group is in the <strong>Pending</strong> state, the routing target group is being created.</li>
     * <li>If the routing target group is in the <strong>Available</strong>, <strong>Unavailable</strong>, <strong>Switched</strong>, or <strong>Abnormal</strong> state, the routing target group is created.</li>
     * </ul>
     * </li>
     * <li><strong>Active/standby mode</strong>: When you create a routing target group, configure primary and secondary instances that are in different zones and of the same type.</li>
     * <li><strong>Primary instance</strong>: The weight is 100. The primary instance handles all traffic under normal conditions and takes effect when health checks are successful.</li>
     * <li><strong>Secondary instance</strong>: The weight is 0. The secondary instance takes over traffic when the primary instance fails, serving as disaster recovery and backup.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateRouteTargetGroup  CreateRouteTargetGroupRequest
     * @return CreateRouteTargetGroupResponse
     */
    @Override
    public CompletableFuture<CreateRouteTargetGroupResponse> createRouteTargetGroup(CreateRouteTargetGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateRouteTargetGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateRouteTargetGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateRouteTargetGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a router interface, take note of the following items: </p>
     * <ul>
     * <li><p>A maximum of one pair of interconnected router interfaces can exist between any two routers.  </p>
     * </li>
     * <li><p>A maximum of five router interfaces can be created on a router.  </p>
     * </li>
     * <li><p>If your account has router interfaces with overdue payments, you cannot create router interfaces.  </p>
     * </li>
     * <li><p>Route entries in the same route table cannot have the same destination CIDR block (DestinationCidrBlock).   </p>
     * </li>
     * <li><p>A Virtual Border Router (VBR) can only be the requester and must be in the activated state.  </p>
     * </li>
     * <li><p>You can use this operation to create subscription and pay-as-you-go router interfaces.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateRouterInterface  CreateRouterInterfaceRequest
     * @return CreateRouterInterfaceResponse
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
     * <b>description</b> :
     * <p>This operation can add SNAT entries for enhanced Internet NAT gateways and VPC NAT gateways. The term <strong>NAT gateway</strong> in this topic refers to both types without distinction.
     * Before you call this operation to add an SNAT entry, take note of the following information:</p>
     * <ul>
     * <li><p><strong>CreateSnatEntry</strong> is an asynchronous operation. After you call this operation, the system returns an SNAT entry ID but the SNAT entry is not yet added. The system adds the SNAT entry in the background. You can call <a href="https://help.aliyun.com/document_detail/42677.html">DescribeSnatTableEntries</a> to query the status of the SNAT entry:</p>
     * <ul>
     * <li>If the SNAT entry is in the <strong>Pending</strong> state, the SNAT entry is being added. In this state, you can only perform query operations and cannot perform other operations.</li>
     * <li>If the SNAT entry is in the <strong>Available</strong> state, the SNAT entry is added.</li>
     * </ul>
     * </li>
     * <li><p>The vSwitch and ECS instance specified in the SNAT entry must be in the VPC to which the NAT gateway belongs.</p>
     * </li>
     * <li><p>Each vSwitch and ECS instance can belong to only one SNAT entry.</p>
     * </li>
     * <li><p>If a high-availability virtual IP address instance exists in the vSwitch, you cannot add an SNAT entry.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateSnatEntry  CreateSnatEntryRequest
     * @return CreateSnatEntryResponse
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

    /**
     * <b>description</b> :
     * <p>Before you create an SSL client certificate, make sure that an SSL server has been created for the VPN gateway instance. For more information, see <a href="https://help.aliyun.com/document_detail/2794075.html">CreateSslVpnServer</a>.</p>
     * 
     * @param request the request parameters of CreateSslVpnClientCert  CreateSslVpnClientCertRequest
     * @return CreateSslVpnClientCertResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li><strong>CreateSslVpnServer</strong> is an asynchronous operation. After you call this operation, the system returns an instance ID but the SSL-VPN server is not yet created. The creation task continues in the background. You can call <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> to query the status of the VPN gateway instance to determine the creation status of the SSL-VPN server:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the SSL-VPN server is being created.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the SSL-VPN server is created.</li>
     * </ul>
     * </li>
     * <li><strong>CreateSslVpnServer</strong> does not support concurrent creation of SSL-VPN servers under the same VPN gateway.</li>
     * </ul>
     * <h3>Before you begin</h3>
     * <ul>
     * <li>You have created a VPN gateway with the SSL-VPN feature enabled. For more information, see <a href="https://help.aliyun.com/document_detail/2794049.html">CreateVpnGateway</a>.</li>
     * <li>If you want to enable two-factor authentication for the SSL server, make sure that the VPN gateway instance supports this feature. You may need to upgrade the VPN gateway instance. For more information, see <a href="https://help.aliyun.com/document_detail/2785320.html">SSL-VPN two-factor authentication supports IDaaS EIAM 2.0</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateSslVpnServer  CreateSslVpnServerRequest
     * @return CreateSslVpnServerResponse
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
     * <b>description</b> :
     * <p><em>CreateTrafficMirrorFilter</em>* is an asynchronous operation. After you send a request, the system returns an instance ID but the traffic mirror filter is not yet created. The creation task is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/261353.html">ListTrafficMirrorFilters</a> to query the creation status of the traffic mirror filter:</p>
     * <ul>
     * <li>If the traffic mirror filter is in the <strong>Creating</strong> state, the traffic mirror filter is being created.</li>
     * <li>If the traffic mirror filter is in the <strong>Created</strong> state, the traffic mirror filter is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTrafficMirrorFilter  CreateTrafficMirrorFilterRequest
     * @return CreateTrafficMirrorFilterResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>CreateTrafficMirrorFilterRules</strong> is an asynchronous operation. After a request is sent, the system returns an instance ID but the inbound or outbound traffic mirroring filter rule is not yet created. The creation node is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/261353.html">ListTrafficMirrorFilters</a> to query the creation status of the inbound or outbound traffic mirroring filter rule:<ul>
     * <li>If the inbound or outbound traffic mirroring filter rule is in the <strong>Creating</strong> state, the rule is being created.</li>
     * <li>If the inbound or outbound traffic mirroring filter rule is in the <strong>Created</strong> state, the rule is created.</li>
     * </ul>
     * </li>
     * <li><strong>CreateTrafficMirrorFilterRules</strong> does not support concurrent creation of inbound or outbound traffic mirroring filter rules for the same traffic mirror filter.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTrafficMirrorFilterRules  CreateTrafficMirrorFilterRulesRequest
     * @return CreateTrafficMirrorFilterRulesResponse
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
     * <b>description</b> :
     * <p><em>CreateTrafficMirrorSession</em>* is an asynchronous operation. After you send a request, the system returns an instance ID while the traffic mirror session is still being created in the background. You can invoke <a href="https://help.aliyun.com/document_detail/261367.html">ListTrafficMirrorSessions</a> to query the creation status of the traffic mirror session:</p>
     * <ul>
     * <li>If the traffic mirror session is in the <strong>Creating</strong> state, the traffic mirror session is being created.</li>
     * <li>If the traffic mirror session is in the <strong>Created</strong> state, the traffic mirror session is created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateTrafficMirrorSession  CreateTrafficMirrorSessionRequest
     * @return CreateTrafficMirrorSessionResponse
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
     * <b>description</b> :
     * <p>When you call this operation to create a vSwitch, take note of the following items:</p>
     * <ul>
     * <li>The number of vSwitches in each VPC cannot exceed 150.</li>
     * <li>The first and last three IP addresses of each vSwitch CIDR block are reserved by the system. For example, the system reserved IP addresses of 192.168.1.0/24 are 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
     * <li>The number of cloud service instances in a vSwitch cannot exceed the remaining available cloud service instances in the VPC (15,000 minus the current number of cloud service instances).</li>
     * <li>A cloud service instance can belong to only one vSwitch.</li>
     * <li>vSwitches do not support multicast or broadcast.</li>
     * <li>After a vSwitch is created, you cannot modify its CIDR block.</li>
     * <li>The <strong>CreateVSwitch</strong> operation is asynchronous. After you send a request, the system returns an instance ID but the vSwitch is not yet created. The background task is still in progress. You can call <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> to query the creation status of the vSwitch:<ul>
     * <li>When the vSwitch is in the <strong>Pending</strong> state, the vSwitch is being configured.</li>
     * <li>When the vSwitch is in the <strong>Available</strong> state, the vSwitch is available.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateVSwitch</strong> operation does not support concurrent creation of vSwitches in the same VPC.</li>
     * <li>When you call the <strong>CreateVSwitch</strong> operation, the CIDR block of the vSwitch cannot be within the following reserved address ranges: 100.64.0.0/10, 127.0.0.0/8, 169.254.0.0/16, or 224.0.0.0/4.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVSwitch  CreateVSwitchRequest
     * @return CreateVSwitchResponse
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
     * <b>description</b> :
     * <p>When you invoke this operation to create a reserved CIDR block for a vSwitch, take note of the following items:</p>
     * <ul>
     * <li>The maximum number of reserved IPv4 CIDR blocks and reserved IPv6 CIDR blocks in a VPC is 100 each.</li>
     * <li>A reserved CIDR block cannot contain the system reserved IP addresses of the vSwitch to which it belongs.<ul>
     * <li>IPv4 CIDR block: The first IP address and the last three IP addresses of the vSwitch are system reserved IP addresses.</li>
     * <li>IPv6 CIDR block: The first IP address and the last nine IP addresses of the vSwitch are system reserved IP addresses.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateVSwitchCidrReservation</strong> operation is asynchronous. After you send a request, the system returns an instance ID, but the reserved CIDR block for a vSwitch has not been created. The system continues to run the background node. You can invoke <a href="https://help.aliyun.com/document_detail/610155.html">ListVSwitchCidrReservations</a> to query the creation status of the reserved CIDR block for a vSwitch:<ul>
     * <li>If the reserved CIDR block for a vSwitch is in the <strong>Assigning</strong> state, the reserved CIDR block for a vSwitch is being allocated.</li>
     * <li>If the reserved CIDR block for a vSwitch is in the <strong>Assigned</strong> state, the reserved CIDR block for a vSwitch has been allocated.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateVSwitchCidrReservation  CreateVSwitchCidrReservationRequest
     * @return CreateVSwitchCidrReservationResponse
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

    /**
     * @param request the request parameters of CreateVbrHa  CreateVbrHaRequest
     * @return CreateVbrHaResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>The IPsec-VPN connection must be associated with a transit router instance. For more information, see <a href="https://help.aliyun.com/document_detail/468249.html">CreateTransitRouterVpnAttachment</a>.</li>
     * <li>Adding a destination route with a destination CIDR block of 0.0.0.0/0 is not supported.</li>
     * <li>Do not add a destination route whose destination CIDR block is 100.64.0.0/10, a subnet of 100.64.0.0/10, or a CIDR block that contains 100.64.0.0/10. Such route entries cause the console to fail to display the status of the IPsec-VPN connection or cause IPsec negotiation to fail.</li>
     * <li><strong>CreateVcoRouteEntry</strong> is an asynchronous operation. After you send a request, the system returns an instance ID but the destination route entry is not yet created. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/53046.html">DescribeVpnConnection</a> to query the creation status of the destination route entry:<ul>
     * <li>If the IPsec-VPN connection is in the <strong>updating</strong> state, the destination route entry is being created.</li>
     * <li>If the IPsec-VPN connection is in the <strong>attached</strong> state, the destination route entry is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateVcoRouteEntry</strong> operation does not support concurrent creation of destination route entries for the same IPsec-VPN connection.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVcoRouteEntry  CreateVcoRouteEntryRequest
     * @return CreateVcoRouteEntryResponse
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
     * <b>description</b> :
     * <p>After a VBR instance is created, the VBR instance status is <strong>active</strong>.</p>
     * 
     * @param request the request parameters of CreateVirtualBorderRouter  CreateVirtualBorderRouterRequest
     * @return CreateVirtualBorderRouterResponse
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
     * <b>description</b> :
     * <p>Before you call this operation, familiarize yourself with the creation process and environment requirements for shared Express Connect circuits. For more information, see <a href="https://help.aliyun.com/document_detail/146571.html">Overview of shared Express Connect circuits</a> and <a href="https://help.aliyun.com/document_detail/155987.html">Partner operation guide</a>.
     * Before you call this operation, make sure the following conditions are met:</p>
     * <ul>
     * <li>The Express Connect circuit specified by PhysicalConnectionId is in the Enabled state. The complete process for an Express Connect circuit to reach the Enabled state includes payment and manual steps that cannot be fully automated through OpenAPI:<ul>
     * <li>CreatePhysicalConnection: Creates an Express Connect circuit.</li>
     * <li>LOA construction authorization: If you need to enter the data center for construction, call ApplyPhysicalConnectionLOA → wait for manual LOA approval → CompletePhysicalConnectionLOA (FinishWork=true). LOA approval and construction are manual/offline steps.</li>
     * <li>ConfirmPhysicalConnection: Reports construction completion. The circuit must be in the Allocated state. After success, it enters the Confirmed state.</li>
     * <li>After the Confirmed state, port usage fees must be paid before the circuit enters the Enabled state. For automation scenarios, call DescribePhysicalConnections first to confirm the target circuit is in the Enabled state before calling this operation.</li>
     * </ul>
     * </li>
     * <li>The VlanId is not already used by an existing VBR or shared Express Connect circuit on the Express Connect circuit (valid values: 0 to 2999).</li>
     * <li>The Spec value does not exceed the remaining allocatable bandwidth of the Express Connect circuit or the shared circuit bandwidth limit configured for the account that owns the Express Connect circuit.</li>
     * <li>VpconnAliUid is the tenant\&quot;s Alibaba Cloud account (RAM users or partner accounts are not supported). Cross-site pushing is not allowed by default.</li>
     * <li>The number of shared Express Connect circuits on a single Express Connect circuit has not exceeded the quota.</li>
     * <li>The Express Connect circuit is not bound to a QoS policy, the access device supports MPBGP, and the access point allows the creation of shared Express Connect circuits.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVirtualPhysicalConnection  CreateVirtualPhysicalConnectionRequest
     * @return CreateVirtualPhysicalConnectionResponse
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
     * <b>description</b> :
     * <p>When you call this operation to create a VPC, take note of the following items:</p>
     * <ul>
     * <li><p>A VPC can have only one primary IPv4 CIDR block. You can add IPv4 secondary CIDR blocks to expand the address space.</p>
     * </li>
     * <li><p>After a VPC is created, you can expand or shrink the original IPv4 CIDR block. When you shrink the IPv4 CIDR block of a VPC, if IP addresses already in use fall outside the target CIDR block, the modification fails.</p>
     * </li>
     * <li><p>Each VPC supports up to 300,000 private network IP addresses for cloud resources. This quota cannot be upgraded.</p>
     * </li>
     * <li><p>After a VPC is created, a vRouter and a routing table are automatically created.</p>
     * </li>
     * <li><p>Each VPC supports up to three user CIDR blocks. If multiple user CIDR blocks overlap, the CIDR block with the shorter mask takes effect. For example, between 10.0.0.0/16 and 10.0.0.0/24, 10.0.0.0/16 takes effect.</p>
     * </li>
     * <li><p><strong>CreateVpc</strong> is an asynchronous operation. After you send a request, the system returns an instance ID, but the VPC is not yet created. The creation task is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> to query the VPC creation status:</p>
     * <ul>
     * <li>If the VPC is in the <strong>Creating</strong> state, the VPC is being created.</li>
     * <li>If the VPC is in the <strong>Created</strong> state, the VPC is created.</li>
     * </ul>
     * </li>
     * <li><p><strong>CreateVpc</strong> supports concurrent creation of non-default VPCs in the same region, subject to <a href="https://help.aliyun.com/document_detail/27750.html">quota</a> limits.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpc  CreateVpcRequest
     * @return CreateVpcResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>CreateVpcGatewayEndpoint</strong> is an asynchronous operation. After you send a request, the system returns an <strong>EndpointId</strong> but the gateway endpoint is not yet created. The creation task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/448682.html">ListVpcGatewayEndpoints</a> to query the creation status of the gateway endpoint:<ul>
     * <li>If the gateway endpoint is in the <strong>Creating</strong> state, the gateway endpoint is being created.</li>
     * <li>If the gateway endpoint is in the <strong>Created</strong> state, the gateway endpoint is created.</li>
     * </ul>
     * </li>
     * <li>You cannot call <strong>CreateVpcGatewayEndpoint</strong> to concurrently create gateway endpoints for the same endpoint service.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpcGatewayEndpoint  CreateVpcGatewayEndpointRequest
     * @return CreateVpcGatewayEndpointResponse
     */
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
     * <b>description</b> :
     * <p>The <strong>CreateVpcPrefixList</strong> operation does not support concurrent creation of prefix lists within the same region.</p>
     * 
     * @param request the request parameters of CreateVpcPrefixList  CreateVpcPrefixListRequest
     * @return CreateVpcPrefixListResponse
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
     * <b>description</b> :
     * <p>By invoking the CreateVpconnFromVbr operation, a partner can transform the routing mode of shared Express Connect circuits used by a tenant from cross-account VBR push to cross-account shared port push. The transform procedure does not affect the tenant\&quot;s services.
     * Before you execute the transform procedure:
     * The partner must notify the tenant about the service upgrade in advance and ensure that the tenant has enabled outbound traffic billing. For information about how to enable outbound traffic billing, see <a href="https://help.aliyun.com/document_detail/274385.html">Enable outbound traffic billing</a>.
     * After the transform procedure is complete:</p>
     * <ol>
     * <li>A shared port is added to the tenant\&quot;s account. The tenant must invoke the <a href="https://help.aliyun.com/document_detail/324198.html">ConfirmPhysicalConnection</a> operation to accept the shared port.</li>
     * <li>After the tenant accepts the shared port, the partner must invoke the <a href="https://help.aliyun.com/document_detail/324191.html">AttachVbrToVpconn</a> operation to associate the VBR instance with the tenant\&quot;s shared Express Connect circuits instance.</li>
     * </ol>
     * 
     * @param request the request parameters of CreateVpconnFromVbr  CreateVpconnFromVbrRequest
     * @return CreateVpconnFromVbrResponse
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
     * <b>description</b> :
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <h3>Before you begin.</h3>
     * 
     * @param request the request parameters of CreateVpnAttachment  CreateVpnAttachmentRequest
     * @return CreateVpnAttachmentResponse
     */
    @Override
    public CompletableFuture<CreateVpnAttachmentResponse> createVpnAttachment(CreateVpnAttachmentRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateVpnAttachment").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateVpnAttachmentResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateVpnAttachmentResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>If the VPN gateway instance supports creating IPsec-VPN connections in dual-tunnel mode, you can configure the following request parameters in addition to the required parameters when you call the <code>CreateVpnConnection</code> operation:
     *   <strong>ClientToken</strong>, <strong>Name</strong>, <strong>EffectImmediately</strong>, <strong>AutoConfigRoute</strong>, <strong>Tags</strong> array, <strong>TunnelOptionsSpecification</strong> array, and <strong>EnableTunnelsBgp</strong>.
     *   For information about the regions and zones that support IPsec-VPN connections in dual-tunnel mode, see <a href="https://help.aliyun.com/document_detail/2358946.html">Upgrade an IPsec-VPN connection to dual-tunnel mode</a>.
     *    <strong>ClientToken</strong>, <strong>CustomerGatewayId</strong>, <strong>Name</strong>, <strong>EffectImmediately</strong>, <strong>IkeConfig</strong>, <strong>IpsecConfig</strong>, <strong>HealthCheckConfig</strong>, <strong>AutoConfigRoute</strong>, <strong>EnableDpd</strong>, <strong>EnableNatTraversal</strong>, <strong>BgpConfig</strong>, <strong>RemoteCaCertificate</strong>, and <strong>Tags</strong> array.</li>
     * <li>The <strong>CreateVpnConnection</strong> operation is asynchronous. After you send a request, the system returns an instance ID, but the IPsec-VPN connection is not yet created. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of the VPN gateway instance to determine the creation status of the IPsec-VPN connection.</li>
     * <li>The <strong>CreateVpnConnection</strong> operation does not support concurrent creation of IPsec-VPN connections under the same VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpnConnection  CreateVpnConnectionRequest
     * @return CreateVpnConnectionResponse
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
     * <b>description</b> :
     * <ul>
     * <li><p>Before you create a VPN gateway, we recommend that you familiarize yourself with the limits of VPN gateways. For more information, see <a href="https://help.aliyun.com/document_detail/65290.html">VPN gateway limits</a>.</p>
     * </li>
     * <li><p>VPN gateway instances in some regions support only dual-tunnel mode IPsec-VPN connections by default. When you call the <code>CreateVpnGateway</code> operation to create a VPN gateway instance in these regions, you must specify the <strong>VSwitchId</strong> and <strong>DisasterRecoveryVSwitchId</strong> parameters in addition to the required parameters. For information about the regions and zones that support dual-tunnel mode IPsec-VPN connections, see <a href="https://help.aliyun.com/document_detail/2358946.html">Upgrade an IPsec-VPN connection to dual-tunnel mode</a>.</p>
     * </li>
     * <li><p>The <strong>CreateVpnGateway</strong> operation is asynchronous. After you call this operation, the system returns an instance ID, but the VPN gateway is not yet created. The creation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the creation status of the VPN gateway:</p>
     * <ul>
     * <li>If the VPN gateway is in the <strong>provisioning</strong> state, the VPN gateway is being created.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the VPN gateway is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpnGateway  CreateVpnGatewayRequest
     * @return CreateVpnGatewayResponse
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
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Before you create a policy-based route, make sure that you have created an IPsec-VPN connection. For more information, see <a href="https://help.aliyun.com/document_detail/120391.html">CreateVpnConnection</a>.</li>
     * <li>Before you create a policy-based route, we recommend that you familiarize yourself with the limits and matching rules of policy-based routes. For more information, see <a href="https://help.aliyun.com/document_detail/110777.html">Use policy-based routes</a>.</li>
     * </ul>
     * <h3>Limits</h3>
     * <ul>
     * <li>For single-tunnel VPN gateways:<ul>
     * <li>0.0.0.0/0 is not supported as the destination CIDR block of a policy-based route.</li>
     * <li>CIDR blocks that overlap with 100.64.0.0/10 (including 100.64.0.0/10 itself, its subnets, and parent CIDR blocks that contain it) are not supported as the destination CIDR block of a policy-based route.</li>
     * </ul>
     * </li>
     * <li><strong>CreateVpnPbrRouteEntry</strong> is an asynchronous operation. After you send a request, the system returns the policy-based route information, but the route has not been created yet. The system continues to create the route in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> operation to query the instance status of the VPN gateway to determine the creation status of the policy-based routing node:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the policy-based route is being created.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the policy-based route is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateVpnPbrRouteEntry</strong> operation does not support concurrent creation of policy-based routes for the same VPN gateway instance.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpnPbrRouteEntry  CreateVpnPbrRouteEntryRequest
     * @return CreateVpnPbrRouteEntryResponse
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
     * <b>description</b> :
     * <h3>Before you begin</h3>
     * <ul>
     * <li>Before you create a destination route, make sure that you have created an IPsec-VPN connection. For more information, see <a href="https://help.aliyun.com/document_detail/2526947.html">CreateVpnConnection</a>.</li>
     * <li>Before you create a destination route, we recommend that you understand the matching rules of destination routes. For more information, see <a href="https://help.aliyun.com/document_detail/112476.html">Configure destination routes</a>.</li>
     * </ul>
     * <h3>Limits</h3>
     * <ul>
     * <li>0.0.0.0/0 is not supported as the destination CIDR block of a destination route.</li>
     * <li>For single-tunnel VPN gateways, CIDR blocks that overlap with 100.64.0.0/10 (including 100.64.0.0/10 itself, its subnets, and parent CIDR blocks that contain it) are not supported as the destination CIDR block of a destination route.</li>
     * <li>The <strong>CreateVpnRouteEntry</strong> operation is asynchronous. After you send a request, the system returns the destination routing configuration but the destination route is not yet created. The creation node is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the creation status of the destination route:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the destination route is being created.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the destination route is created.</li>
     * </ul>
     * </li>
     * <li>The <strong>CreateVpnRouteEntry</strong> operation does not support concurrent creation of destination routes for the same VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateVpnRouteEntry  CreateVpnRouteEntryRequest
     * @return CreateVpnRouteEntryResponse
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

    /**
     * @param request the request parameters of DeactivateRouterInterface  DeactivateRouterInterfaceRequest
     * @return DeactivateRouterInterfaceResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeactiveFlowLog</strong> is an asynchronous operation. After you send a request, the system returns a request ID. However, the flow log is not yet stopped, and the system is still processing the stop task in the background. You can call <a href="https://help.aliyun.com/document_detail/87923.html">DescribeFlowLogs</a> to query the status of the flow log:<ul>
     * <li>If the flow log is in the <strong>Deactivating</strong> state, the flow log is being stopped.</li>
     * <li>If the flow log is in the <strong>Inactive</strong> state, the flow log is stopped.</li>
     * </ul>
     * </li>
     * <li>You cannot concurrently stop the same flow log by calling <strong>DeactiveFlowLog</strong>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeactiveFlowLog  DeactiveFlowLogRequest
     * @return DeactiveFlowLogResponse
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

    /**
     * @param request the request parameters of DeleteBgpGroup  DeleteBgpGroupRequest
     * @return DeleteBgpGroupResponse
     */
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

    /**
     * <b>description</b> :
     * <p>Before calling this operation, ensure that the BgpNetwork is in the Available state. You can query the Status field by calling DescribeBgpNetworks. After a resource is created by AddBgpNetwork, it enters the Pending state. Wait until the state changes to Available before calling this operation.</p>
     * 
     * @param request the request parameters of DeleteBgpNetwork  DeleteBgpNetworkRequest
     * @return DeleteBgpNetworkResponse
     */
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

    /**
     * @param request the request parameters of DeleteBgpPeer  DeleteBgpPeerRequest
     * @return DeleteBgpPeerResponse
     */
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
     * <b>description</b> :
     * <p>The <strong>DeleteCommonBandwidthPackage</strong> operation does not support concurrent deletion of the same Internet Shared Bandwidth instance.</p>
     * 
     * @param request the request parameters of DeleteCommonBandwidthPackage  DeleteCommonBandwidthPackageRequest
     * @return DeleteCommonBandwidthPackageResponse
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

    /**
     * <b>description</b> :
     * <p>Before deleting a customer gateway, make sure that the customer gateway is not associated with any IPsec-VPN connections. To delete an IPsec-VPN connection, see <a href="https://help.aliyun.com/document_detail/2526938.html">DeleteVpnAttachment</a> or <a href="https://help.aliyun.com/document_detail/2526948.html">DeleteVpnConnection</a>.</p>
     * 
     * @param request the request parameters of DeleteCustomerGateway  DeleteCustomerGatewayRequest
     * @return DeleteCustomerGatewayResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteDhcpOptionsSet</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the DHCP options set is not yet deleted. The deletion task runs in the background. You can call <a href="https://help.aliyun.com/document_detail/448820.html">GetDhcpOptionsSet</a> to query the deletion status of the DHCP options set:<ul>
     * <li>If the DHCP options set is in the <strong>Deleting</strong> state, the DHCP options set is being deleted.</li>
     * <li>If the specified DHCP options set cannot be found, the DHCP options set is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteDhcpOptionsSet</strong> does not support concurrent deletion of the same DHCP options set.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteDhcpOptionsSet  DeleteDhcpOptionsSetRequest
     * @return DeleteDhcpOptionsSetResponse
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

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You cannot delete an enhanced VPN gateway that has existing IPsec-VPN connections.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteEnhancedVpnGateway  DeleteEnhancedVpnGatewayRequest
     * @return DeleteEnhancedVpnGatewayResponse
     */
    @Override
    public CompletableFuture<DeleteEnhancedVpnGatewayResponse> deleteEnhancedVpnGateway(DeleteEnhancedVpnGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEnhancedVpnGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEnhancedVpnGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEnhancedVpnGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExpressConnect  DeleteExpressConnectRequest
     * @return DeleteExpressConnectResponse
     */
    @Override
    public CompletableFuture<DeleteExpressConnectResponse> deleteExpressConnect(DeleteExpressConnectRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteExpressConnect").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExpressConnectResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExpressConnectResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>A QoS policy that is associated with an Express Connect circuit cannot be directly deleted. You must dissociate the QoS policy from the Express Connect circuit first.</p>
     * 
     * @param request the request parameters of DeleteExpressConnectTrafficQos  DeleteExpressConnectTrafficQosRequest
     * @return DeleteExpressConnectTrafficQosResponse
     */
    @Override
    public CompletableFuture<DeleteExpressConnectTrafficQosResponse> deleteExpressConnectTrafficQos(DeleteExpressConnectTrafficQosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteExpressConnectTrafficQos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExpressConnectTrafficQosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExpressConnectTrafficQosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExpressConnectTrafficQosQueue  DeleteExpressConnectTrafficQosQueueRequest
     * @return DeleteExpressConnectTrafficQosQueueResponse
     */
    @Override
    public CompletableFuture<DeleteExpressConnectTrafficQosQueueResponse> deleteExpressConnectTrafficQosQueue(DeleteExpressConnectTrafficQosQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteExpressConnectTrafficQosQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExpressConnectTrafficQosQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExpressConnectTrafficQosQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteExpressConnectTrafficQosRule  DeleteExpressConnectTrafficQosRuleRequest
     * @return DeleteExpressConnectTrafficQosRuleResponse
     */
    @Override
    public CompletableFuture<DeleteExpressConnectTrafficQosRuleResponse> deleteExpressConnectTrafficQosRule(DeleteExpressConnectTrafficQosRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteExpressConnectTrafficQosRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteExpressConnectTrafficQosRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteExpressConnectTrafficQosRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only failover test jobs in the <strong>Pending</strong> or <strong>Completed</strong> state can be deleted. Before calling this operation, create a failover test job by calling CreateFailoverTestJob and obtain the <strong>JobId</strong>. If the test resource is an Express Connect circuit, the circuit must be in the <strong>Enabled</strong> state and its business status must be <strong>Normal</strong>.</p>
     * 
     * @param request the request parameters of DeleteFailoverTestJob  DeleteFailoverTestJobRequest
     * @return DeleteFailoverTestJobResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteFlowLog</strong> is an asynchronous operation. After you call this operation, the system returns an instance ID, but the flow log has not been deleted yet. The deletion task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/87923.html">DescribeFlowLogs</a> to query the deletion status of the flow log:<ul>
     * <li>If the flow log is in the <strong>Deleting</strong> state, the flow log is being deleted.</li>
     * <li>If the specified flow log cannot be found, the flow log is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteFlowLog</strong> does not support concurrent deletion of the same flow log.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFlowLog  DeleteFlowLogRequest
     * @return DeleteFlowLogResponse
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
     * <b>description</b> :
     * <p><em>DeleteForwardEntry</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the DNAT entry is not yet deleted. The deletion task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/36053.html">DescribeForwardTableEntries</a> to query the status of the DNAT entry:</p>
     * <ul>
     * <li>If the DNAT entry is in the <strong>Deleting</strong> state, the DNAT entry is being deleted. In this state, you can only perform query operations.</li>
     * <li>If the DNAT entry is no longer found, the DNAT entry is deleted.<blockquote>
     * <p> If a DNAT entry in the DNAT table is in the <strong>Pending</strong> state, you cannot delete any DNAT entries from the DNAT table.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteForwardEntry  DeleteForwardEntryRequest
     * @return DeleteForwardEntryResponse
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
     * <b>description</b> :
     * <p><em>DeleteFullNatEntry</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the FULLNAT entry is not yet deleted. The deletion task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/348779.html">ListFullNatEntries</a> to query the status of the FULLNAT entry:</p>
     * <ul>
     * <li>If the FULLNAT entry is in the <strong>Deleting</strong> state, the FULLNAT entry is being deleted. In this state, you can only perform query operations.</li>
     * <li>If the FULLNAT entry cannot be found, the FULLNAT entry is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteFullNatEntry  DeleteFullNatEntryRequest
     * @return DeleteFullNatEntryResponse
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
     * <b>description</b> :
     * <p>Before calling this operation, note the following: </p>
     * <ul>
     * <li>Only pay-as-you-go instances can be deleted.</li>
     * <li>To delete a dedicated instance, disassociate all backend servers from the instance before deletion.</li>
     * <li>To delete a shared instance, remove all EIPs from the instance before deletion.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteGlobalAccelerationInstance  DeleteGlobalAccelerationInstanceRequest
     * @return DeleteGlobalAccelerationInstanceResponse
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
     * <b>description</b> :
     * <p>When you call this operation to delete an HaVip, take note of the following items:</p>
     * <ul>
     * <li>The HaVip must be in the available state before it can be deleted.</li>
     * <li>Make sure that no routes point to the HaVip that you want to delete.</li>
     * <li>Make sure that the HaVip that you want to delete is not associated with any elastic IP address (EIP).</li>
     * <li><strong>DeleteHaVip</strong> is an asynchronous operation. After you send a request, the system returns a request ID. However, the HaVip is not yet deleted. The deletion task runs in the background. You can call <a href="https://help.aliyun.com/document_detail/114611.html">DescribeHaVips</a> to query the deletion status of the HaVip:<ul>
     * <li>If the HaVip is in the <strong>Deleting</strong> state, the HaVip is being deleted.</li>
     * <li>If the specified HaVip cannot be found, the HaVip is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteHaVip</strong> does not support concurrent deletion of the same HaVip.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteHaVip  DeleteHaVipRequest
     * @return DeleteHaVipResponse
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

    /**
     * @param request the request parameters of DeleteIPv6Translator  DeleteIPv6TranslatorRequest
     * @return DeleteIPv6TranslatorResponse
     */
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
     * @deprecated OpenAPI DeleteIPv6TranslatorAclList is deprecated  * @param request  the request parameters of DeleteIPv6TranslatorAclList  DeleteIPv6TranslatorAclListRequest
     * @return DeleteIPv6TranslatorAclListResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DeleteIPv6TranslatorEntry is deprecated  * @param request  the request parameters of DeleteIPv6TranslatorEntry  DeleteIPv6TranslatorEntryRequest
     * @return DeleteIPv6TranslatorEntryResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteIpsecServer</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the IPsec server is not yet deleted. The deletion node continues to run in the background. You can invoke <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> to query the instance status of the VPN gateway to determine the deletion status of the IPsec server:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the IPsec server is being deleted.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the IPsec server is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteIpsecServer</strong> does not support concurrent deletion of IPsec servers under the same VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpsecServer  DeleteIpsecServerRequest
     * @return DeleteIpsecServerResponse
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
     * <b>description</b> :
     * <ul>
     * <li>Before you delete an IPv4 gateway, make sure that the route table associated with the IPv4 gateway is disassociated.</li>
     * <li>The <strong>DeleteIpv4Gateway</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong>, but the IPv4 gateway is not yet deleted. The deletion task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/407670.html">GetIpv4GatewayAttribute</a> to query the status of the IPv4 gateway.<ul>
     * <li>If the IPv4 gateway is in the <strong>Deleting</strong> state, the IPv4 gateway is being deleted.</li>
     * <li>If the IPv4 gateway cannot be found, the IPv4 gateway is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteIpv4Gateway</strong> operation does not support concurrent deletion of the same IPv4 gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpv4Gateway  DeleteIpv4GatewayRequest
     * @return DeleteIpv4GatewayResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteIpv6EgressOnlyRule</strong> is an asynchronous operation. After a request is sent, the system returns a request ID. However, the IPv6 egress-only rule is not immediately deleted. The deletion task runs in the background. You can call <a href="https://help.aliyun.com/document_detail/102208.html">DescribeIpv6EgressOnlyRules</a> to query the deletion status of the IPv6 egress-only rule:<ul>
     * <li>If the IPv6 egress-only rule is in the <strong>Deleting</strong> state, the rule is being deleted.</li>
     * <li>If the specified IPv6 egress-only rule cannot be found, the rule is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteIpv6EgressOnlyRule</strong> does not support concurrent deletion of the same IPv6 egress-only rule.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpv6EgressOnlyRule  DeleteIpv6EgressOnlyRuleRequest
     * @return DeleteIpv6EgressOnlyRuleResponse
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
     * <b>description</b> :
     * <p>Before you delete an IPv6 gateway, delete the IPv6 egress-only rules first. For more information, see <a href="https://help.aliyun.com/document_detail/102201.html">DeleteIpv6EgressOnlyRule</a>.</p>
     * <ul>
     * <li>The <strong>DeleteIpv6Gateway</strong> operation is asynchronous. After a request is sent, the system returns a request ID. However, the IPv6 gateway is not yet deleted. The deletion task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/102226.html">DescribeIpv6GatewayAttribute</a> to query the deletion status of the IPv6 gateway:<ul>
     * <li>If the IPv6 gateway is in the <strong>Deleting</strong> state, the IPv6 gateway is being deleted.</li>
     * <li>If the specified IPv6 gateway cannot be found, the IPv6 gateway is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteIpv6Gateway</strong> operation does not support concurrent deletion of the same IPv6 gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteIpv6Gateway  DeleteIpv6GatewayRequest
     * @return DeleteIpv6GatewayResponse
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
     * <b>description</b> :
     * <p>The <strong>DeleteIpv6InternetBandwidth</strong> operation does not support concurrent deletion of the same Internet bandwidth.</p>
     * 
     * @param request the request parameters of DeleteIpv6InternetBandwidth  DeleteIpv6InternetBandwidthRequest
     * @return DeleteIpv6InternetBandwidthResponse
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
     * <b>description</b> :
     * <p><em>DeleteNatGateway</em>* is an asynchronous operation. After you send a request, the system returns a request ID. However, the NAT gateway is not immediately deleted. The deletion task runs in the background. You can call <a href="https://www.alibabacloud.com/help/en/nat-gateway/developer-reference/api-vpc-2016-04-28-describenatgateways-natgws">DescribeNatGateways</a> to query the status of the NAT gateway:</p>
     * <ul>
     * <li>If the NAT gateway is in the <strong>Deleting</strong> state, the NAT gateway is being deleted. In this state, you can only perform query operations.</li>
     * <li>If the NAT gateway cannot be found, the NAT gateway is deleted.</li>
     * </ul>
     * <blockquote>
     * <p>Deleting a NAT gateway is irreversible. Proceed with caution.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteNatGateway  DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
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
     * <b>description</b> :
     * <p><em>DeleteNatIp</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the NAT IP address is not yet deleted. The deletion task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/2522486.html">ListNatIps</a> to query the deletion status of the NAT IP address:</p>
     * <ul>
     * <li>If the NAT IP address is in the <strong>Deleting</strong> state, the NAT IP address is being deleted. In this state, you can only perform query operations.</li>
     * <li>If the NAT IP address cannot be found, the NAT IP address is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteNatIp  DeleteNatIpRequest
     * @return DeleteNatIpResponse
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
     * @param request the request parameters of DeleteNatIpCidr  DeleteNatIpCidrRequest
     * @return DeleteNatIpCidrResponse
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
     * <b>description</b> :
     * <p>The <strong>DeleteNetworkAcl</strong> operation does not support concurrent deletion of the same network ACL.</p>
     * 
     * @param request the request parameters of DeleteNetworkAcl  DeleteNetworkAclRequest
     * @return DeleteNetworkAclResponse
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
     * <b>description</b> :
     * <p>You can delete only Express Connect circuits that are in the <strong>Allocated</strong>, <strong>Confirmed</strong>, <strong>Rejected</strong>, <strong>Canceled</strong>, <strong>AllocationFailed</strong>, or <strong>Terminated</strong> state.</p>
     * 
     * @param request the request parameters of DeletePhysicalConnection  DeletePhysicalConnectionRequest
     * @return DeletePhysicalConnectionResponse
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
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Before you delete an IP address pool, make sure that the IP addresses in the pool are not in use.</li>
     * <li><strong>DeletePublicIpAddressPool</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/429433.html">ListPublicIpAddressPools</a> to query the status of the IP address pool. <ul>
     * <li>If the IP address pool is in the <strong>Deleting</strong> state, the IP address pool is being deleted. In this state, you can only perform query operations.</li>
     * <li>If the IP address pool cannot be found, the IP address pool is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot call <strong>DeletePublicIpAddressPool</strong> to concurrently delete the same IP address pool.</li>
     * </ul>
     * 
     * @param request the request parameters of DeletePublicIpAddressPool  DeletePublicIpAddressPoolRequest
     * @return DeletePublicIpAddressPoolResponse
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
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following information:</p>
     * <ul>
     * <li>Before deleting a CIDR block, make sure that the CIDR block is not in use.</li>
     * <li><strong>DeletePublicIpAddressPoolCidrBlock</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the deletion task in the background. You can call <a href="https://help.aliyun.com/document_detail/429436.html">ListPublicIpAddressPoolCidrBlocks</a> to query the status of the CIDR block in the IP address pool. <ul>
     * <li>If the CIDR block is in the <strong>Deleting</strong> state, the CIDR block is being deleted. In this state, you can only perform query operations.</li>
     * <li>If the CIDR block cannot be found, the CIDR block is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeletePublicIpAddressPoolCidrBlock</strong> operation does not support concurrent deletion of the same CIDR block.</li>
     * </ul>
     * 
     * @param request the request parameters of DeletePublicIpAddressPoolCidrBlock  DeletePublicIpAddressPoolCidrBlockRequest
     * @return DeletePublicIpAddressPoolCidrBlockResponse
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
     * <b>description</b> :
     * <p>When you call this operation to delete route entries, take note of the following items: </p>
     * <ul>
     * <li>Only route entries in the <strong>Available</strong> state can be deleted.  </li>
     * <li>Route entries cannot be deleted if the VPC to which the route table belongs has a vSwitch or route entry being created or deleted. </li>
     * <li>The <strong>DeleteRouteEntries</strong> operation is asynchronous. After you send a request, the system returns a request ID. However, the route entry is not yet deleted. The deletion task runs in the background. You can call <a href="https://help.aliyun.com/document_detail/138148.html">DescribeRouteEntryList</a> to query the deletion status of the route entry:<ul>
     * <li>If the route entry is in the <strong>Deleting</strong> state, the route entry is being deleted.</li>
     * <li>If the specified route entry cannot be found, the route entry is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteRouteEntries</strong> operation does not support concurrent batch deletion of route entries from route tables in the same VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRouteEntries  DeleteRouteEntriesRequest
     * @return DeleteRouteEntriesResponse
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
     * <b>description</b> :
     * <p>When you call this operation to delete a route, take note of the following items:</p>
     * <ul>
     * <li>Only routes in the <strong>Available</strong> state can be deleted.</li>
     * <li>A route cannot be deleted while the VPC that contains the route table is creating or deleting a vSwitch or route.</li>
     * <li>To delete a route from the route table of a VBR, call the <a href="https://help.aliyun.com/document_detail/138148.html">DescribeRouteEntryList</a> operation to query the <strong>NextHopId</strong> of the route that you want to delete, and then call this operation to delete the route.</li>
     * <li>The <strong>DeleteRouteEntry</strong> operation is asynchronous. After you send a request, the system returns a request ID, but the route has not been deleted yet. The deletion task runs in the background. You can call <a href="https://help.aliyun.com/document_detail/138148.html">DescribeRouteEntryList</a> to query the deletion status of the route:<ul>
     * <li>If the route is in the <strong>Deleting</strong> state, the route is being deleted.</li>
     * <li>If the specified route cannot be found, the route is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteRouteEntry</strong> operation does not support concurrent deletion of routes from the route table within the same VPC or VBR.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRouteEntry  DeleteRouteEntryRequest
     * @return DeleteRouteEntryResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteRouteTable</strong> is an asynchronous operation. After you call this operation, the system returns a request ID, but the custom route table is not yet deleted. The deletion task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/87602.html">DescribeRouteTableList</a> to query the deletion status of the custom route table:<ul>
     * <li>If the custom route table is in the <strong>Deleting</strong> state, the custom route table is being deleted.</li>
     * <li>If the specified custom route table cannot be found, the custom route table is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteRouteTable</strong> does not support concurrent deletion of custom route tables in the same VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRouteTable  DeleteRouteTableRequest
     * @return DeleteRouteTableResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteRouteTargetGroup</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the route target group is not yet deleted. The deletion task continues to run in the background. You can call ListRouteTargetGroup to query the deletion status of the route target group:<ul>
     * <li>If the route target group is in the <strong>Deleting</strong> state, the route target group is being deleted.</li>
     * <li>If the specified route target group cannot be found, the route target group is deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRouteTargetGroup  DeleteRouteTargetGroupRequest
     * @return DeleteRouteTargetGroupResponse
     */
    @Override
    public CompletableFuture<DeleteRouteTargetGroupResponse> deleteRouteTargetGroup(DeleteRouteTargetGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRouteTargetGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRouteTargetGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRouteTargetGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you invoke this operation to delete a router interface, take note of the following items: </p>
     * <ul>
     * <li>You can delete only router interfaces that are in the <strong>Idle</strong> or <strong>Inactive</strong> state. </li>
     * <li>Before you delete a router interface, delete all custom route entries that point to it.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteRouterInterface  DeleteRouterInterfaceRequest
     * @return DeleteRouterInterfaceResponse
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
     * <b>description</b> :
     * <p><em>DeleteSnatEntry</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the SNAT entry is not yet deleted. The deletion task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/42677.html">DescribeSnatTableEntries</a> to query the status of the SNAT entry:</p>
     * <ul>
     * <li>If the SNAT entry is in the <strong>Deleting</strong> state, the SNAT entry is being deleted. In this state, you can only perform query operations.</li>
     * <li>If the returned SNAT entry list is empty, the SNAT entry is deleted.
     * If a SNAT entry in the SNAT table is in the <strong>Pending</strong> state, you cannot delete SNAT entries from the SNAT table.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSnatEntry  DeleteSnatEntryRequest
     * @return DeleteSnatEntryResponse
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
     * <b>description</b> :
     * <ul>
     * <li>Deleting an SSL-VPN client certificate disconnects all clients under the SSL server from their SSL-VPN connections. If clients need to continue using SSL-VPN connections, they must re-initiate the connections.
     * For example, if SSL-VPN client certificate 1 and SSL-VPN client certificate 2 are created under an SSL server, deleting SSL-VPN client certificate 1 disconnects all clients associated with both SSL-VPN client certificate 1 and SSL-VPN client certificate 2.<ul>
     * <li>If clients associated with SSL-VPN client certificate 1 need to continue using SSL-VPN connections, they must install another certificate and then re-initiate the connections.</li>
     * <li>If clients associated with SSL-VPN client certificate 2 need to continue using SSL-VPN connections, they only need to re-initiate the connections.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteSslVpnClientCert</strong> operation is asynchronous. After a request is sent, the system returns a request ID, but the SSL-VPN client certificate is not yet deleted. The deletion task continues in the background. You can call <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> to query the status of the VPN gateway instance associated with the SSL server to confirm the deletion status of the SSL-VPN client certificate:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the SSL-VPN client certificate is being deleted.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the SSL-VPN client certificate is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteSslVpnClientCert</strong> operation does not support concurrent deletion of SSL-VPN client certificates under the same VPN gateway instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSslVpnClientCert  DeleteSslVpnClientCertRequest
     * @return DeleteSslVpnClientCertResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>DeleteSslVpnServer</strong> operation is asynchronous. After you send a request, the system returns a request ID. However, the SSL server is not yet deleted. The deletion task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> to query the status of the VPN gateway instance to determine the deletion status of the SSL server:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the SSL server is being deleted.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the SSL server is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteSslVpnServer</strong> operation does not support concurrent deletion of SSL servers under the same VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSslVpnServer  DeleteSslVpnServerRequest
     * @return DeleteSslVpnServerResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteTrafficMirrorFilter</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the traffic mirror filter is not yet deleted. The deletion task runs in the background. You can invoke <a href="https://help.aliyun.com/document_detail/261353.html">ListTrafficMirrorFilters</a> to query the deletion status of the traffic mirror filter:<ul>
     * <li>If the traffic mirror filter is in the <strong>Deleting</strong> state, the traffic mirror filter is being deleted.</li>
     * <li>If the specified traffic mirror filter cannot be found, the traffic mirror filter is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteTrafficMirrorFilter</strong> does not support concurrent deletion of the same traffic mirror filter.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTrafficMirrorFilter  DeleteTrafficMirrorFilterRequest
     * @return DeleteTrafficMirrorFilterResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteTrafficMirrorFilterRules</strong> is an asynchronous operation. After a request is sent, the system returns a request ID, but the inbound or outbound rules of the traffic mirror filter have not been deleted yet. The deletion task is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/261353.html">ListTrafficMirrorFilters</a> to query the deletion status of the inbound or outbound rules of the traffic mirror filter:<ul>
     * <li>If the inbound or outbound rules of the traffic mirror filter are in the <strong>Deleting</strong> state, the rules are being deleted.</li>
     * <li>If the specified inbound or outbound rules of the traffic mirror filter cannot be found, the rules have been deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteTrafficMirrorFilterRules</strong> does not support concurrent deletion of inbound or outbound rules of the same traffic mirror filter.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTrafficMirrorFilterRules  DeleteTrafficMirrorFilterRulesRequest
     * @return DeleteTrafficMirrorFilterRulesResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteTrafficMirrorSession</strong> is an asynchronous operation. After you send a request, the system returns a request ID. However, the traffic mirror session is not yet deleted. The deletion task runs in the background. You can call <a href="https://help.aliyun.com/document_detail/261367.html">ListTrafficMirrorSessions</a> to query the deletion status of the traffic mirror session:<ul>
     * <li>If the traffic mirror session is in the <strong>Deleting</strong> state, the traffic mirror session is being deleted.</li>
     * <li>If the specified traffic mirror session cannot be found, the traffic mirror session is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteTrafficMirrorSession</strong> does not support concurrent deletion of the same traffic mirror session.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteTrafficMirrorSession  DeleteTrafficMirrorSessionRequest
     * @return DeleteTrafficMirrorSessionResponse
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
     * <b>description</b> :
     * <p>Before you call this operation to delete a vSwitch, take note of the following items: </p>
     * <ul>
     * <li>Before deleting a vSwitch, release or move all resources in the VPC, including vSwitches, cloud service instances, router interfaces, and HaVips.  </li>
     * <li>Only vSwitches in the <strong>Available</strong> state can be deleted.  </li>
     * <li>A vSwitch cannot be deleted if the VPC to which it belongs is creating or deleting a vSwitch or route. </li>
     * <li>The <strong>DeleteVSwitch</strong> operation is asynchronous. After you send a request, the system returns a request ID, but the vSwitch is not yet deleted. The deletion task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> to query the deletion status of the vSwitch:<ul>
     * <li>If the vSwitch is in the <strong>Pending</strong> state, the vSwitch is being deleted.</li>
     * <li>If the specified vSwitch cannot be found, the vSwitch is deleted.</li>
     * </ul>
     * </li>
     * <li>The <strong>DeleteVSwitch</strong> operation does not support concurrent deletion of the same vSwitch.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVSwitch  DeleteVSwitchRequest
     * @return DeleteVSwitchResponse
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
     * <b>description</b> :
     * <ul>
     * <li>Before you invoke this operation to delete a reserved vSwitch CIDR block, make sure that all prefix CIDR blocks allocated from the reserved CIDR block to elastic network interfaces (ENIs) are deleted. If any exist, first invoke <a href="https://help.aliyun.com/document_detail/85919.html">UnassignPrivateIpAddresses</a> or <a href="https://help.aliyun.com/document_detail/98611.html">UnassignIpv6Addresses</a> to release the IPv4 or IPv6 addresses of the ENI.</li>
     * <li><strong>DeleteVSwitchCidrReservation</strong> is an asynchronous operation. After you invoke this operation, the system returns an instance ID, but the reserved vSwitch CIDR block is not yet deleted. The background task is still in progress. You can invoke <a href="https://help.aliyun.com/document_detail/610155.html">ListVSwitchCidrReservations</a> to query the deletion status of the reserved vSwitch CIDR block:<ul>
     * <li>If the reserved vSwitch CIDR block is in the <strong>Releasing</strong> state, the reserved vSwitch CIDR block is being released.</li>
     * <li>If the reserved vSwitch CIDR block is in the <strong>Released</strong> state, the reserved vSwitch CIDR block is released.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVSwitchCidrReservation  DeleteVSwitchCidrReservationRequest
     * @return DeleteVSwitchCidrReservationResponse
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

    /**
     * @param request the request parameters of DeleteVbrHa  DeleteVbrHaRequest
     * @return DeleteVbrHaResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteVcoRouteEntry</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the destination route entry is not yet deleted. The deletion task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/53046.html">DescribeVpnConnection</a> to query the deletion status of the destination route entry:<ul>
     * <li>If the IPsec-VPN connection is in the <strong>updating</strong> state, the destination route entry is being deleted.</li>
     * <li>If the IPsec-VPN connection is in the <strong>attached</strong> state, the destination route entry is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteVcoRouteEntry</strong> does not support concurrent deletion of destination route entries for the same IPsec-VPN connection.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVcoRouteEntry  DeleteVcoRouteEntryRequest
     * @return DeleteVcoRouteEntryResponse
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
     * <b>description</b> :
     * <p>Before you call the DeleteVirtualBorderRouter operation to delete a VBR instance, note the following: </p>
     * <ul>
     * <li>Before deleting a VBR instance, you must delete all router interfaces on the VBR instance. </li>
     * <li>You can delete only VBR instances in the <strong>unconfirmed</strong>, <strong>active</strong>, or <strong>terminated</strong> state. </li>
     * <li>A VBR instance owned by another account can be deleted by the Express Connect circuit owner only when the VBR instance is in the <strong>unconfirmed</strong> state.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVirtualBorderRouter  DeleteVirtualBorderRouterRequest
     * @return DeleteVirtualBorderRouterResponse
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
     * <b>description</b> :
     * <p>When you call this operation to delete a VPC, take note of the following items: </p>
     * <ul>
     * <li><p>Before deleting a VPC, release or migrate all resources in the VPC, including vSwitches, cloud service instances, and high-availability virtual IP addresses.</p>
     * </li>
     * <li><p>Only VPCs in the <strong>Available</strong> state can be deleted.  </p>
     * </li>
     * <li><p><strong>DeleteVpc</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the VPC is not yet deleted. The deletion task runs in the background. You can call <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> to query the deletion status of the VPC:</p>
     * <ul>
     * <li>If the VPC is in the <strong>Deleting</strong> state, the VPC is being deleted.</li>
     * <li>If the VPC cannot be found, the VPC is deleted.</li>
     * </ul>
     * </li>
     * <li><p><strong>DeleteVpc</strong> does not support concurrent deletion of the same VPC.</p>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVpc  DeleteVpcRequest
     * @return DeleteVpcResponse
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

    /**
     * @param request the request parameters of DeleteVpcGatewayEndpoint  DeleteVpcGatewayEndpointRequest
     * @return DeleteVpcGatewayEndpointResponse
     */
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
     * <b>description</b> :
     * <p>The <strong>DeleteVpcPrefixList</strong> operation does not support concurrent deletion of the same prefix list instance.</p>
     * 
     * @param request the request parameters of DeleteVpcPrefixList  DeleteVpcPrefixListRequest
     * @return DeleteVpcPrefixListResponse
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
     * <b>description</b> :
     * <ul>
     * <li>If the IPsec-VPN connection is bindded to a transit router instance, disassociate the IPsec-VPN connection from the transit router instance before you delete the IPsec-VPN connection. For more information, see <a href="https://help.aliyun.com/document_detail/468251.html">DeleteTransitRouterVpnAttachment</a>.</li>
     * <li>If the IPsec-VPN connection is not bindded to any resource, you can call the <code>DeleteVpnAttachment</code> operation to directly delete the IPsec-VPN connection.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVpnAttachment  DeleteVpnAttachmentRequest
     * @return DeleteVpnAttachmentResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteVpnConnection</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the IPsec-VPN connection is not yet deleted. The deletion task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of the VPN gateway instance to determine the deletion status of the IPsec-VPN connection:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the IPsec-VPN connection is being deleted.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the IPsec-VPN connection is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteVpnConnection</strong> does not support concurrent deletion of IPsec-VPN connections under the same VPN gateway.<blockquote>
     * <p>After the IPsec-VPN connection is deleted, the connection between the on-premises data center and Alibaba Cloud is interrupted.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVpnConnection  DeleteVpnConnectionRequest
     * @return DeleteVpnConnectionResponse
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
     * <b>description</b> :
     * <blockquote>
     * <p>You cannot delete a VPN gateway that has IPsec-VPN connections.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteVpnGateway  DeleteVpnGatewayRequest
     * @return DeleteVpnGatewayResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteVpnPbrRouteEntry</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the policy-based route is not yet deleted. The deletion node continues to run in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> operation to query the instance status of the VPN gateway to determine the deletion status of the policy-based routing:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the policy-based routing is being deleted.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the policy-based routing is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteVpnPbrRouteEntry</strong> does not support concurrent deletion of policy-based routing for the same VPN gateway instance.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVpnPbrRouteEntry  DeleteVpnPbrRouteEntryRequest
     * @return DeleteVpnPbrRouteEntryResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DeleteVpnRouteEntry</strong> is an asynchronous operation. After you send a request, the system returns a request ID. However, the VPN destination route is not yet deleted, and the deletion node is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the instance status of the VPN gateway, and determine the deletion status of the VPN destination routing:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the VPN destination route is being deleted.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the VPN destination route is deleted.</li>
     * </ul>
     * </li>
     * <li><strong>DeleteVpnRouteEntry</strong> does not support concurrent deletion of VPN destination routes for the same VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteVpnRouteEntry  DeleteVpnRouteEntryRequest
     * @return DeleteVpnRouteEntryResponse
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
     * <b>description</b> :
     * <h2>API description</h2>
     * <p>After you enable deletion protection for an instance, you cannot delete the instance. To delete the instance, disable deletion protection first.</p>
     * 
     * @param request the request parameters of DeletionProtection  DeletionProtectionRequest
     * @return DeletionProtectionResponse
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

    /**
     * @param request the request parameters of Describe95Traffic  Describe95TrafficRequest
     * @return Describe95TrafficResponse
     */
    @Override
    public CompletableFuture<Describe95TrafficResponse> describe95Traffic(Describe95TrafficRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("Describe95Traffic").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(Describe95TrafficResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<Describe95TrafficResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeAccessPoints  DescribeAccessPointsRequest
     * @return DescribeAccessPointsResponse
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
     * @param request the request parameters of DescribeBgpGroups  DescribeBgpGroupsRequest
     * @return DescribeBgpGroupsResponse
     */
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

    /**
     * @param request the request parameters of DescribeBgpNetworks  DescribeBgpNetworksRequest
     * @return DescribeBgpNetworksResponse
     */
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

    /**
     * @param request the request parameters of DescribeBgpPeers  DescribeBgpPeersRequest
     * @return DescribeBgpPeersResponse
     */
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

    /**
     * @param request the request parameters of DescribeCommonBandwidthPackages  DescribeCommonBandwidthPackagesRequest
     * @return DescribeCommonBandwidthPackagesResponse
     */
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

    /**
     * @param request the request parameters of DescribeCustomerGateway  DescribeCustomerGatewayRequest
     * @return DescribeCustomerGatewayResponse
     */
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

    /**
     * @param request the request parameters of DescribeCustomerGateways  DescribeCustomerGatewaysRequest
     * @return DescribeCustomerGatewaysResponse
     */
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

    /**
     * @param request the request parameters of DescribeEcGrantRelation  DescribeEcGrantRelationRequest
     * @return DescribeEcGrantRelationResponse
     */
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
     * <b>description</b> :
     * <p>This operation queries information about EIPs created in a specified region, including the maximum bandwidth, billing method, and the type of instance currently attached to each EIP. If you frequently perform deep paging or page skipping, the <strong>Throttling.DeepPageSkip</strong> error code may be returned. Reduce the query frequency or use sequential pagination.</p>
     * 
     * @param request the request parameters of DescribeEipAddresses  DescribeEipAddressesRequest
     * @return DescribeEipAddressesResponse
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
     * <b>description</b> :
     * <p>Only EIPs that are associated with secondary elastic network interfaces (ENIs) in multi-EIP-to-ENI mode are supported.</p>
     * 
     * @param request the request parameters of DescribeEipGatewayInfo  DescribeEipGatewayInfoRequest
     * @return DescribeEipGatewayInfoResponse
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
     * <b>description</b> :
     * <p>For a better experience when retrieving monitoring data, use the DescribeMetricList operation provided by CloudMonitor to query EIP-related data. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a> and <a href="https://help.aliyun.com/document_detail/162874.html">EIP-related metrics</a>.</p>
     * 
     * @param request the request parameters of DescribeEipMonitorData  DescribeEipMonitorDataRequest
     * @return DescribeEipMonitorDataResponse
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
     * @param request the request parameters of DescribeEipSegment  DescribeEipSegmentRequest
     * @return DescribeEipSegmentResponse
     */
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

    /**
     * @param request the request parameters of DescribeExpressConnectTrafficQos  DescribeExpressConnectTrafficQosRequest
     * @return DescribeExpressConnectTrafficQosResponse
     */
    @Override
    public CompletableFuture<DescribeExpressConnectTrafficQosResponse> describeExpressConnectTrafficQos(DescribeExpressConnectTrafficQosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExpressConnectTrafficQos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExpressConnectTrafficQosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExpressConnectTrafficQosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, call CreateExpressConnectTrafficQos to create a QoS policy and obtain the <strong>QosId</strong>.</p>
     * 
     * @param request the request parameters of DescribeExpressConnectTrafficQosQueue  DescribeExpressConnectTrafficQosQueueRequest
     * @return DescribeExpressConnectTrafficQosQueueResponse
     */
    @Override
    public CompletableFuture<DescribeExpressConnectTrafficQosQueueResponse> describeExpressConnectTrafficQosQueue(DescribeExpressConnectTrafficQosQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExpressConnectTrafficQosQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExpressConnectTrafficQosQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExpressConnectTrafficQosQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeExpressConnectTrafficQosRule  DescribeExpressConnectTrafficQosRuleRequest
     * @return DescribeExpressConnectTrafficQosRuleResponse
     */
    @Override
    public CompletableFuture<DescribeExpressConnectTrafficQosRuleResponse> describeExpressConnectTrafficQosRule(DescribeExpressConnectTrafficQosRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeExpressConnectTrafficQosRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeExpressConnectTrafficQosRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeExpressConnectTrafficQosRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFailoverTestJob  DescribeFailoverTestJobRequest
     * @return DescribeFailoverTestJobResponse
     */
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

    /**
     * @param request the request parameters of DescribeFailoverTestJobs  DescribeFailoverTestJobsRequest
     * @return DescribeFailoverTestJobsResponse
     */
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

    /**
     * @param request the request parameters of DescribeFlowLogs  DescribeFlowLogsRequest
     * @return DescribeFlowLogsResponse
     */
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

    /**
     * @param request the request parameters of DescribeForwardTableEntries  DescribeForwardTableEntriesRequest
     * @return DescribeForwardTableEntriesResponse
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
     * @param request the request parameters of DescribeGlobalAccelerationInstances  DescribeGlobalAccelerationInstancesRequest
     * @return DescribeGlobalAccelerationInstancesResponse
     */
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

    /**
     * @param request the request parameters of DescribeGrantRulesToCen  DescribeGrantRulesToCenRequest
     * @return DescribeGrantRulesToCenResponse
     */
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

    /**
     * @param request the request parameters of DescribeGrantRulesToEcr  DescribeGrantRulesToEcrRequest
     * @return DescribeGrantRulesToEcrResponse
     */
    @Override
    public CompletableFuture<DescribeGrantRulesToEcrResponse> describeGrantRulesToEcr(DescribeGrantRulesToEcrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGrantRulesToEcr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGrantRulesToEcrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGrantRulesToEcrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHaVips  DescribeHaVipsRequest
     * @return DescribeHaVipsResponse
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

    /**
     * @param request the request parameters of DescribeHighDefinitionMonitorLogAttribute  DescribeHighDefinitionMonitorLogAttributeRequest
     * @return DescribeHighDefinitionMonitorLogAttributeResponse
     */
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

    /**
     * @param request the request parameters of DescribeIPv6TranslatorAclListAttributes  DescribeIPv6TranslatorAclListAttributesRequest
     * @return DescribeIPv6TranslatorAclListAttributesResponse
     */
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
     * @deprecated OpenAPI DescribeIPv6TranslatorAclLists is deprecated  * @param request  the request parameters of DescribeIPv6TranslatorAclLists  DescribeIPv6TranslatorAclListsRequest
     * @return DescribeIPv6TranslatorAclListsResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DescribeIPv6TranslatorEntries is deprecated  * @param request  the request parameters of DescribeIPv6TranslatorEntries  DescribeIPv6TranslatorEntriesRequest
     * @return DescribeIPv6TranslatorEntriesResponse
     */
    @Deprecated
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
     * @deprecated OpenAPI DescribeIPv6Translators is deprecated  * @param request  the request parameters of DescribeIPv6Translators  DescribeIPv6TranslatorsRequest
     * @return DescribeIPv6TranslatorsResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of DescribeIpv6Addresses  DescribeIpv6AddressesRequest
     * @return DescribeIpv6AddressesResponse
     */
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

    /**
     * @param request the request parameters of DescribeIpv6EgressOnlyRules  DescribeIpv6EgressOnlyRulesRequest
     * @return DescribeIpv6EgressOnlyRulesResponse
     */
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

    /**
     * @param request the request parameters of DescribeIpv6GatewayAttribute  DescribeIpv6GatewayAttributeRequest
     * @return DescribeIpv6GatewayAttributeResponse
     */
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

    /**
     * @param request the request parameters of DescribeIpv6Gateways  DescribeIpv6GatewaysRequest
     * @return DescribeIpv6GatewaysResponse
     */
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
     * @param request the request parameters of DescribeNatGatewayAssociateNetworkInterfaces  DescribeNatGatewayAssociateNetworkInterfacesRequest
     * @return DescribeNatGatewayAssociateNetworkInterfacesResponse
     */
    @Override
    public CompletableFuture<DescribeNatGatewayAssociateNetworkInterfacesResponse> describeNatGatewayAssociateNetworkInterfaces(DescribeNatGatewayAssociateNetworkInterfacesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeNatGatewayAssociateNetworkInterfaces").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeNatGatewayAssociateNetworkInterfacesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeNatGatewayAssociateNetworkInterfacesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation allows you to query the details of Internet NAT gateways or VPC NAT gateways. In this topic, &quot;NAT gateway&quot; refers to both types without distinction.</p>
     * 
     * @param request the request parameters of DescribeNatGateways  DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
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

    /**
     * @param request the request parameters of DescribeNetworkAclAttributes  DescribeNetworkAclAttributesRequest
     * @return DescribeNetworkAclAttributesResponse
     */
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

    /**
     * @param request the request parameters of DescribeNetworkAcls  DescribeNetworkAclsRequest
     * @return DescribeNetworkAclsResponse
     */
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

    /**
     * @param request the request parameters of DescribePhysicalConnectionLOA  DescribePhysicalConnectionLOARequest
     * @return DescribePhysicalConnectionLOAResponse
     */
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
     * <b>description</b> :
     * <p>By default, the system queries information about all Express Connect circuits in the specified region. You can use the filter options provided by the <strong>DescribePhysicalConnections</strong> operation to query information about specific Express Connect circuits. For the filter options supported by the system, see the description of <strong>Key</strong> in the <strong>request parameters</strong> section of this topic.</p>
     * 
     * @param request the request parameters of DescribePhysicalConnections  DescribePhysicalConnectionsRequest
     * @return DescribePhysicalConnectionsResponse
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
     * <b>description</b> :
     * <p>You cannot call the <strong>DescribePublicIpAddress</strong> operation to query the range of public IP addresses in the classic network.</p>
     * 
     * @param request the request parameters of DescribePublicIpAddress  DescribePublicIpAddressRequest
     * @return DescribePublicIpAddressResponse
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
     * <p>Before you call <a href="https://help.aliyun.com/document_detail/36013.html">DeleteRouteEntry</a> to delete a route, you can call this operation to query the next hop information of the route that you want to delete.</p>
     * 
     * @param request the request parameters of DescribeRouteEntryList  DescribeRouteEntryListRequest
     * @return DescribeRouteEntryListResponse
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

    /**
     * @param request the request parameters of DescribeRouteTableList  DescribeRouteTableListRequest
     * @return DescribeRouteTableListResponse
     */
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
     * @param request the request parameters of DescribeRouterInterfaceAttribute  DescribeRouterInterfaceAttributeRequest
     * @return DescribeRouterInterfaceAttributeResponse
     */
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

    /**
     * @param request the request parameters of DescribeRouterInterfaces  DescribeRouterInterfacesRequest
     * @return DescribeRouterInterfacesResponse
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

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation supports only dedicated-bandwidth instances.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DescribeServerRelatedGlobalAccelerationInstances  DescribeServerRelatedGlobalAccelerationInstancesRequest
     * @return DescribeServerRelatedGlobalAccelerationInstancesResponse
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

    /**
     * @param request the request parameters of DescribeSnatTableEntries  DescribeSnatTableEntriesRequest
     * @return DescribeSnatTableEntriesResponse
     */
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

    /**
     * @param request the request parameters of DescribeSslVpnClientCert  DescribeSslVpnClientCertRequest
     * @return DescribeSslVpnClientCertResponse
     */
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

    /**
     * @param request the request parameters of DescribeSslVpnClientCerts  DescribeSslVpnClientCertsRequest
     * @return DescribeSslVpnClientCertsResponse
     */
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
     * <b>description</b> :
     * <p>If your VPN gateway instance was created before December 10, 2022, you must upgrade the VPN gateway instance to the latest version before you can view SSL client connection information. For more information, see <a href="https://help.aliyun.com/document_detail/2671058.html">Upgrade a VPN gateway</a>.
     * VPN gateway instances created after December 10, 2022 support viewing SSL client connection information by default.</p>
     * 
     * @param request the request parameters of DescribeSslVpnClients  DescribeSslVpnClientsRequest
     * @return DescribeSslVpnClientsResponse
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

    /**
     * @param request the request parameters of DescribeSslVpnServers  DescribeSslVpnServersRequest
     * @return DescribeSslVpnServersResponse
     */
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

    /**
     * @param request the request parameters of DescribeTagKeys  DescribeTagKeysRequest
     * @return DescribeTagKeysResponse
     */
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

    /**
     * @param request the request parameters of DescribeTagKeysForExpressConnect  DescribeTagKeysForExpressConnectRequest
     * @return DescribeTagKeysForExpressConnectResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>Specify at least <strong>ResourceId.N</strong> or <strong>Tag.N</strong> (<strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong>) in the request to determine the objects to query.</li>
     * <li><strong>Tag.N</strong> is a tag of a resource and consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values associated with the tag key are returned. If you specify only <strong>Tag.N.Value</strong>, an error is returned.</li>
     * <li>If you specify both <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match any of the specified tag key-value pairs.</li>
     * <li>If you specify multiple tag key-value pairs, the results contain all tags that match any of the tag key-value pairs.</li>
     * </ul>
     * 
     * @param request the request parameters of DescribeTags  DescribeTagsRequest
     * @return DescribeTagsResponse
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

    /**
     * @param request the request parameters of DescribeVRouters  DescribeVRoutersRequest
     * @return DescribeVRoutersResponse
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
     * @param request the request parameters of DescribeVSwitchAttributes  DescribeVSwitchAttributesRequest
     * @return DescribeVSwitchAttributesResponse
     */
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

    /**
     * <b>description</b> :
     * <p>The <strong>DescribeVSwitches</strong> operation may return the <strong>Throttling.DeepPageSkip</strong> error code during frequent deep paging or page skipping. Reduce the query frequency or use sequential paging.</p>
     * 
     * @param request the request parameters of DescribeVSwitches  DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
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
     * @param request the request parameters of DescribeVbrHa  DescribeVbrHaRequest
     * @return DescribeVbrHaResponse
     */
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

    /**
     * @param request the request parameters of DescribeVcoRouteEntries  DescribeVcoRouteEntriesRequest
     * @return DescribeVcoRouteEntriesResponse
     */
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

    /**
     * @param request the request parameters of DescribeVirtualBorderRouters  DescribeVirtualBorderRoutersRequest
     * @return DescribeVirtualBorderRoutersResponse
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
     * @param request the request parameters of DescribeVirtualBorderRoutersForPhysicalConnection  DescribeVirtualBorderRoutersForPhysicalConnectionRequest
     * @return DescribeVirtualBorderRoutersForPhysicalConnectionResponse
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
     * @param request the request parameters of DescribeVpcAttribute  DescribeVpcAttributeRequest
     * @return DescribeVpcAttributeResponse
     */
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

    /**
     * @param request the request parameters of DescribeVpcGrantRulesToEcr  DescribeVpcGrantRulesToEcrRequest
     * @return DescribeVpcGrantRulesToEcrResponse
     */
    @Override
    public CompletableFuture<DescribeVpcGrantRulesToEcrResponse> describeVpcGrantRulesToEcr(DescribeVpcGrantRulesToEcrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpcGrantRulesToEcr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpcGrantRulesToEcrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpcGrantRulesToEcrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The <strong>DescribeVpcs</strong> operation may return the <strong>Throttling.DeepPageSkip</strong> error code during frequent deep paging or page skipping. Reduce the query frequency or use sequential paging.</p>
     * 
     * @param request the request parameters of DescribeVpcs  DescribeVpcsRequest
     * @return DescribeVpcsResponse
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
     * @param request the request parameters of DescribeVpnAttachments  DescribeVpnAttachmentsRequest
     * @return DescribeVpnAttachmentsResponse
     */
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

    /**
     * @param request the request parameters of DescribeVpnConnection  DescribeVpnConnectionRequest
     * @return DescribeVpnConnectionResponse
     */
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

    /**
     * @param request the request parameters of DescribeVpnConnectionLogs  DescribeVpnConnectionLogsRequest
     * @return DescribeVpnConnectionLogsResponse
     */
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

    /**
     * @param request the request parameters of DescribeVpnConnections  DescribeVpnConnectionsRequest
     * @return DescribeVpnConnectionsResponse
     */
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

    /**
     * @param request the request parameters of DescribeVpnCrossAccountAuthorizations  DescribeVpnCrossAccountAuthorizationsRequest
     * @return DescribeVpnCrossAccountAuthorizationsResponse
     */
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

    /**
     * @param request the request parameters of DescribeVpnGateway  DescribeVpnGatewayRequest
     * @return DescribeVpnGatewayResponse
     */
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

    /**
     * @param request the request parameters of DescribeVpnGatewayAvailableZones  DescribeVpnGatewayAvailableZonesRequest
     * @return DescribeVpnGatewayAvailableZonesResponse
     */
    @Override
    public CompletableFuture<DescribeVpnGatewayAvailableZonesResponse> describeVpnGatewayAvailableZones(DescribeVpnGatewayAvailableZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeVpnGatewayAvailableZones").setMethod(HttpMethod.GET).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeVpnGatewayAvailableZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeVpnGatewayAvailableZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeVpnGateways  DescribeVpnGatewaysRequest
     * @return DescribeVpnGatewaysResponse
     */
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

    /**
     * @param request the request parameters of DescribeVpnPbrRouteEntries  DescribeVpnPbrRouteEntriesRequest
     * @return DescribeVpnPbrRouteEntriesResponse
     */
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

    /**
     * @param request the request parameters of DescribeVpnRouteEntries  DescribeVpnRouteEntriesRequest
     * @return DescribeVpnRouteEntriesResponse
     */
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

    /**
     * @param request the request parameters of DescribeVpnSslServerLogs  DescribeVpnSslServerLogsRequest
     * @return DescribeVpnSslServerLogsResponse
     */
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
     * <ul>
     * <li><strong>DetachDhcpOptionsSetFromVpc</strong> is an asynchronous operation. After you send a request, the system returns a request ID. However, the DHCP options set is not yet disassociated. The disassociation task runs in the background. You can call <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> to query the disassociation status of the DHCP options set:<ul>
     * <li>If the DHCP options set is in the <strong>Pending</strong> state, the DHCP options set is being disassociated.</li>
     * <li>If the DHCP options set is in the <strong>UnUsed</strong> state, the DHCP options set is disassociated.</li>
     * </ul>
     * </li>
     * <li><strong>DetachDhcpOptionsSetFromVpc</strong> does not support concurrent disassociation of DHCP options sets from the same VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of DetachDhcpOptionsSetFromVpc  DetachDhcpOptionsSetFromVpcRequest
     * @return DetachDhcpOptionsSetFromVpcResponse
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
     * <b>description</b> :
     * <ul>
     * <li>If the IPsec-VPN connection is in single-tunnel mode, the request parameter <code>VpnConnectionIds</code> is required when you call the <strong>DiagnoseVpnConnections</strong> operation.</li>
     * <li>If the IPsec-VPN connection is in dual-tunnel mode, the request parameter <code>TunnelIds</code> is required when you call the <strong>DiagnoseVpnConnections</strong> operation.</li>
     * <li>After you call the <strong>DiagnoseVpnConnections</strong> operation, if the current IPsec-VPN connection has issues, the operation returns the corresponding error code (the <strong>FailedReasonCode</strong> response parameter) and log information (the <strong>SourceLog</strong> response parameter). You can troubleshoot issues based on the error code and log information. For more information, see <a href="https://help.aliyun.com/document_detail/477862.html">Common errors and troubleshooting methods for IPsec-VPN connections</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DiagnoseVpnConnections  DiagnoseVpnConnectionsRequest
     * @return DiagnoseVpnConnectionsResponse
     */
    @Override
    public CompletableFuture<DiagnoseVpnConnectionsResponse> diagnoseVpnConnections(DiagnoseVpnConnectionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DiagnoseVpnConnections").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DiagnoseVpnConnectionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DiagnoseVpnConnectionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only VPN gateway instances in specific regions support the one-click diagnosis feature. For more information about regions, see <a href="https://help.aliyun.com/document_detail/430697.html">Regions that support VPN Gateway features</a>.</p>
     * 
     * @param request the request parameters of DiagnoseVpnGateway  DiagnoseVpnGatewayRequest
     * @return DiagnoseVpnGatewayResponse
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

    /**
     * @deprecated OpenAPI DisableVpcClassicLink is deprecated  * @param request  the request parameters of DisableVpcClassicLink  DisableVpcClassicLinkRequest
     * @return DisableVpcClassicLinkResponse
     */
    @Deprecated
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

    /**
     * <b>description</b> :
     * <ul>
     * <li>If you dissociate a key that is in the Associated state, the most recently effective key is automatically associated.</li>
     * <li>If you dissociate a key that is in the Disassociated state, the key is deleted.</li>
     * </ul>
     * 
     * @param request the request parameters of DisassociateMacSecKey  DisassociateMacSecKeyRequest
     * @return DisassociateMacSecKeyResponse
     */
    @Override
    public CompletableFuture<DisassociateMacSecKeyResponse> disassociateMacSecKey(DisassociateMacSecKeyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisassociateMacSecKey").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisassociateMacSecKeyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisassociateMacSecKeyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DissociateRouteTableFromGateway  DissociateRouteTableFromGatewayRequest
     * @return DissociateRouteTableFromGatewayResponse
     */
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

    /**
     * @param request the request parameters of DissociateRouteTablesFromVpcGatewayEndpoint  DissociateRouteTablesFromVpcGatewayEndpointRequest
     * @return DissociateRouteTablesFromVpcGatewayEndpointResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li><strong>DissociateVpnGatewayWithCertificate</strong> is an asynchronous operation. After a request is sent, the system returns a request ID, but the VPN gateway has not yet been dissociated from the SSL certificate. The dissociation task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> operation to query the status of the VPN gateway instance and confirm the dissociation status of the SSL certificate:<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the SSL certificate is being dissociated.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the SSL certificate is dissociated.</li>
     * </ul>
     * </li>
     * <li><strong>DissociateVpnGatewayWithCertificate</strong> does not support concurrent dissociation of SSL certificates from the same VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of DissociateVpnGatewayWithCertificate  DissociateVpnGatewayWithCertificateRequest
     * @return DissociateVpnGatewayWithCertificateResponse
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

    /**
     * @param request the request parameters of DownloadVpnConnectionConfig  DownloadVpnConnectionConfigRequest
     * @return DownloadVpnConnectionConfigResponse
     */
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

    /**
     * <b>description</b> :
     * <p>When you invoke this operation, note the following items:</p>
     * <ul>
     * <li>You can enable only an Express Connect circuit that is in the Confirmed state. After the circuit is enabled, it enters the Enabled state. To reach the Confirmed state, complete the following steps in sequence: call CreatePhysicalConnection to create a circuit (Initial → Allocating), wait for resource allocation to complete (Allocating → Allocated), and then call ConfirmPhysicalConnection after construction is complete (Allocated → Confirmed).</li>
     * <li>A billing activation step occurs between the Confirmed and Enabled states. By default (if ByPassSp is not specified or ByPassSp is set to false), the system automatically creates a billing order in the sales and billing system when you invoke this operation. The circuit is enabled only after the order is created. To skip the billing order flow and directly enable the circuit, set ByPassSp to true. This capability is available only to whitelist accounts. For more information, see the ByPassSp parameter description.</li>
     * <li>The EnablePhysicalConnection operation is asynchronous. The system returns a success response, but the Express Connect circuit is not yet fully enabled because the backend enablement task is still in progress. You can invoke DescribePhysicalConnections to query the enablement status of the Express Connect circuit.</li>
     * <li>The EnablePhysicalConnection operation does not support concurrent enablement of the same Express Connect circuit that is in the Confirmed state. Concurrent invocations return an error.
     * If the Express Connect circuit is already in the Enabled state, invoking this operation again returns a success response (idempotent).</li>
     * </ul>
     * 
     * @param request the request parameters of EnablePhysicalConnection  EnablePhysicalConnectionRequest
     * @return EnablePhysicalConnectionResponse
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
     * @deprecated OpenAPI EnableVpcClassicLink is deprecated  * @param request  the request parameters of EnableVpcClassicLink  EnableVpcClassicLinkRequest
     * @return EnableVpcClassicLinkResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>EnableVpcIpv4Gateway</strong> operation is asynchronous. After you send a request, the system returns a <strong>RequestId</strong>, but the IPv4 gateway is not yet activated. The activation task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/407670.html">GetIpv4GatewayAttribute</a> to query the status of the IPv4 gateway.<ul>
     * <li>If the IPv4 gateway is in the <strong>Activating</strong> state, the gateway is being activated.</li>
     * <li>If the IPv4 gateway is in the <strong>Created</strong> state, the gateway is activated.</li>
     * </ul>
     * </li>
     * <li>The <strong>EnableVpcIpv4Gateway</strong> operation does not support concurrent activation of the same IPv4 gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of EnableVpcIpv4Gateway  EnableVpcIpv4GatewayRequest
     * @return EnableVpcIpv4GatewayResponse
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

    /**
     * @param request the request parameters of GetDhcpOptionsSet  GetDhcpOptionsSetRequest
     * @return GetDhcpOptionsSetResponse
     */
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

    /**
     * @param request the request parameters of GetFlowLogServiceStatus  GetFlowLogServiceStatusRequest
     * @return GetFlowLogServiceStatusResponse
     */
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

    /**
     * @param request the request parameters of GetIpv4GatewayAttribute  GetIpv4GatewayAttributeRequest
     * @return GetIpv4GatewayAttributeResponse
     */
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
     * <b>description</b> :
     * <p>This operation queries the information about a single Internet NAT gateway or VPC NAT gateway. The term &quot;NAT gateway&quot; in this topic does not distinguish between the two types.</p>
     * 
     * @param request the request parameters of GetNatGatewayAttribute  GetNatGatewayAttributeRequest
     * @return GetNatGatewayAttributeResponse
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
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>You can call the GetPhysicalConnectionServiceStatus operation to check whether outbound traffic billing is enabled for the current account. For more information about outbound traffic billing, see <a href="https://help.aliyun.com/document_detail/274385.html">Enable outbound traffic billing</a> and <a href="https://help.aliyun.com/document_detail/54582.html">Billing</a>.</p>
     * 
     * @param request the request parameters of GetPhysicalConnectionServiceStatus  GetPhysicalConnectionServiceStatusRequest
     * @return GetPhysicalConnectionServiceStatusResponse
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

    /**
     * @param request the request parameters of GetPublicIpAddressPoolServiceStatus  GetPublicIpAddressPoolServiceStatusRequest
     * @return GetPublicIpAddressPoolServiceStatusResponse
     */
    @Override
    public CompletableFuture<GetPublicIpAddressPoolServiceStatusResponse> getPublicIpAddressPoolServiceStatus(GetPublicIpAddressPoolServiceStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetPublicIpAddressPoolServiceStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetPublicIpAddressPoolServiceStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetPublicIpAddressPoolServiceStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Retrieves information about a route target group instance.</p>
     * 
     * @param request the request parameters of GetRouteTargetGroup  GetRouteTargetGroupRequest
     * @return GetRouteTargetGroupResponse
     */
    @Override
    public CompletableFuture<GetRouteTargetGroupResponse> getRouteTargetGroup(GetRouteTargetGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetRouteTargetGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetRouteTargetGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetRouteTargetGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetTrafficMirrorServiceStatus  GetTrafficMirrorServiceStatusRequest
     * @return GetTrafficMirrorServiceStatusResponse
     */
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

    /**
     * @param request the request parameters of GetVSwitchCidrReservationUsage  GetVSwitchCidrReservationUsageRequest
     * @return GetVSwitchCidrReservationUsageResponse
     */
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

    /**
     * @param request the request parameters of GetVpcGatewayEndpointAttribute  GetVpcGatewayEndpointAttributeRequest
     * @return GetVpcGatewayEndpointAttributeResponse
     */
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

    /**
     * @param request the request parameters of GetVpcPrefixListAssociations  GetVpcPrefixListAssociationsRequest
     * @return GetVpcPrefixListAssociationsResponse
     */
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

    /**
     * @param request the request parameters of GetVpcPrefixListEntries  GetVpcPrefixListEntriesRequest
     * @return GetVpcPrefixListEntriesResponse
     */
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

    /**
     * @param request the request parameters of GetVpcRouteEntrySummary  GetVpcRouteEntrySummaryRequest
     * @return GetVpcRouteEntrySummaryResponse
     */
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
     * <b>description</b> :
     * <p>When you call the <strong>GetVpnGatewayDiagnoseResult</strong> operation, in addition to the required parameters, you must specify at least one of the <strong>DiagnoseId</strong> and <strong>VpnGatewayId</strong> parameters.</p>
     * 
     * @param request the request parameters of GetVpnGatewayDiagnoseResult  GetVpnGatewayDiagnoseResultRequest
     * @return GetVpnGatewayDiagnoseResultResponse
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
     * <b>description</b> :
     * <ul>
     * <li>Before you attach a network instance that belongs to a different Alibaba Cloud account, you must grant permissions to the CEN instance under the Alibaba Cloud account to which the network instance belongs.<blockquote>
     * <p>The <strong>GrantInstanceToCen</strong> operation is a VPC API operation. Therefore, you must use the <code>vpc.aliyuncs.com</code> endpoint to call this operation. The API version is <code>2016-04-28</code>. </p>
     * </blockquote>
     * </li>
     * <li>The <strong>GrantInstanceToCen</strong> operation does not support concurrent calls to grant permissions to a CEN instance for the same VPC, VBR, or CCN.</li>
     * </ul>
     * 
     * @param request the request parameters of GrantInstanceToCen  GrantInstanceToCenRequest
     * @return GrantInstanceToCenResponse
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
     * <b>description</b> :
     * <p>This operation is used for cross-account scenarios. Before calling this operation, ensure that the following resources are ready:
     * <strong>Account A (VPC owner, the caller of this operation):</strong></p>
     * <ul>
     * <li>A VPC has been created and is in the Available state (CreateVpc).
     * <strong>Account B (VBR owner, the account specified by VbrOwnerUid):</strong> When GrantType=Specify, the VBRs specified in VbrInstanceIds must already be created. Creating a VBR depends on the complete Express Connect circuit lifecycle:</li>
     * </ul>
     * <ol>
     * <li>Call CreatePhysicalConnection to create an Express Connect circuit.</li>
     * <li>Apply for a Letter of Authorization (LOA) and complete the construction (ApplyPhysicalConnectionLOA → CompletePhysicalConnectionLOA). The Express Connect circuit enters the Confirmed state.</li>
     * <li>Call EnablePhysicalConnection to enable the Express Connect circuit (the circuit must be in the Confirmed state).</li>
     * <li>Call CreateVirtualBorderRouter to create a VBR (the Express Connect circuit must be in the Enabled state. Otherwise, the error InvalidPhysicalConnectionId.NotEnabled is returned).
     * After the preceding preparations are complete, Account A calls this operation to grant the VPC to the VBR of Account B:</li>
     * </ol>
     * <ul>
     * <li>GrantType=All: Grants authorization to all VBRs under Account B (only the validity of VbrOwnerUid is verified. The VBRs do not need to be created yet).</li>
     * <li>GrantType=Specify: Grants authorization to specified VBRs. The instances in VbrInstanceIds must already exist in the region specified by VbrRegionNo under the account specified by VbrOwnerUid. Otherwise, the error Instance.NotExist is returned.
     * Note: VbrOwnerUid cannot be the same as the caller\&quot;s account. Otherwise, the error Parameter.Illegal is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of GrantInstanceToVbr  GrantInstanceToVbrRequest
     * @return GrantInstanceToVbrResponse
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

    /**
     * @param request the request parameters of ListBusinessAccessPoints  ListBusinessAccessPointsRequest
     * @return ListBusinessAccessPointsResponse
     */
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

    /**
     * @param request the request parameters of ListBusinessRegions  ListBusinessRegionsRequest
     * @return ListBusinessRegionsResponse
     */
    @Override
    public CompletableFuture<ListBusinessRegionsResponse> listBusinessRegions(ListBusinessRegionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListBusinessRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListBusinessRegionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListBusinessRegionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDhcpOptionsSets  ListDhcpOptionsSetsRequest
     * @return ListDhcpOptionsSetsResponse
     */
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
     * <b>description</b> :
     * <p>This operation queries the zones available for Internet NAT gateway or VPC NAT gateway resources. In this topic, &quot;NAT gateway&quot; refers to both types without distinction.</p>
     * 
     * @param request the request parameters of ListEnhanhcedNatGatewayAvailableZones  ListEnhanhcedNatGatewayAvailableZonesRequest
     * @return ListEnhanhcedNatGatewayAvailableZonesResponse
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

    /**
     * @param request the request parameters of ListFullNatEntries  ListFullNatEntriesRequest
     * @return ListFullNatEntriesResponse
     */
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

    /**
     * @param request the request parameters of ListGatewayRouteTableEntries  ListGatewayRouteTableEntriesRequest
     * @return ListGatewayRouteTableEntriesResponse
     */
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

    /**
     * @param request the request parameters of ListGeographicSubRegions  ListGeographicSubRegionsRequest
     * @return ListGeographicSubRegionsResponse
     */
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

    /**
     * @param request the request parameters of ListIpsecServerLogs  ListIpsecServerLogsRequest
     * @return ListIpsecServerLogsResponse
     */
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

    /**
     * @param request the request parameters of ListIpsecServers  ListIpsecServersRequest
     * @return ListIpsecServersResponse
     */
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

    /**
     * @param request the request parameters of ListIpv4Gateways  ListIpv4GatewaysRequest
     * @return ListIpv4GatewaysResponse
     */
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

    /**
     * @param request the request parameters of ListNatIpCidrs  ListNatIpCidrsRequest
     * @return ListNatIpCidrsResponse
     */
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

    /**
     * @param request the request parameters of ListNatIps  ListNatIpsRequest
     * @return ListNatIpsResponse
     */
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

    /**
     * @param request the request parameters of ListPhysicalConnectionFeatures  ListPhysicalConnectionFeaturesRequest
     * @return ListPhysicalConnectionFeaturesResponse
     */
    @Override
    public CompletableFuture<ListPhysicalConnectionFeaturesResponse> listPhysicalConnectionFeatures(ListPhysicalConnectionFeaturesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListPhysicalConnectionFeatures").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListPhysicalConnectionFeaturesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListPhysicalConnectionFeaturesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListPrefixLists  ListPrefixListsRequest
     * @return ListPrefixListsResponse
     */
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

    /**
     * @param request the request parameters of ListPublicIpAddressPoolCidrBlocks  ListPublicIpAddressPoolCidrBlocksRequest
     * @return ListPublicIpAddressPoolCidrBlocksResponse
     */
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

    /**
     * @param request the request parameters of ListPublicIpAddressPools  ListPublicIpAddressPoolsRequest
     * @return ListPublicIpAddressPoolsResponse
     */
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
     * <b>description</b> :
     * <p>Queries a list of route target groups.</p>
     * 
     * @param request the request parameters of ListRouteTargetGroups  ListRouteTargetGroupsRequest
     * @return ListRouteTargetGroupsResponse
     */
    @Override
    public CompletableFuture<ListRouteTargetGroupsResponse> listRouteTargetGroups(ListRouteTargetGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListRouteTargetGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListRouteTargetGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListRouteTargetGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Specify at least <strong>ResourceId.N</strong> or <strong>Tag.N</strong> (<strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong>) in the request to determine the query object.</li>
     * <li><strong>Tag.N</strong> is a tag of the resource, which consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values associated with the tag key are returned. If you specify only <strong>Tag.N.Value</strong>, an error is returned.</li>
     * <li>If you specify both <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified tag key-value pairs.</li>
     * <li>If you specify multiple tag key-value pairs, the returned results contain resources that include all specified key-value pairs.</li>
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
     * <ul>
     * <li>To specify the objects to query, set <strong>ResourceId.N</strong> or <strong>Tag.N</strong> (<strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong>) in the request parameters.</li>
     * <li><strong>Tag.N</strong> is a tag of a resource and consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values associated with the specified tag key are returned. If you specify only <strong>Tag.N.Value</strong>, an error is returned.</li>
     * <li>If you specify both <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified tag key-value pairs.</li>
     * <li>If you specify multiple tag key-value pairs, the returned results contain resources that include all specified key-value pairs.</li>
     * </ul>
     * 
     * @param request the request parameters of ListTagResourcesForExpressConnect  ListTagResourcesForExpressConnectRequest
     * @return ListTagResourcesForExpressConnectResponse
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

    /**
     * @param request the request parameters of ListTrafficMirrorFilters  ListTrafficMirrorFiltersRequest
     * @return ListTrafficMirrorFiltersResponse
     */
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

    /**
     * @param request the request parameters of ListTrafficMirrorSessions  ListTrafficMirrorSessionsRequest
     * @return ListTrafficMirrorSessionsResponse
     */
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

    /**
     * @param request the request parameters of ListVSwitchCidrReservations  ListVSwitchCidrReservationsRequest
     * @return ListVSwitchCidrReservationsResponse
     */
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

    /**
     * @param request the request parameters of ListVirtualPhysicalConnections  ListVirtualPhysicalConnectionsRequest
     * @return ListVirtualPhysicalConnectionsResponse
     */
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
     * @param request the request parameters of ListVpcGatewayEndpoints  ListVpcGatewayEndpointsRequest
     * @return ListVpcGatewayEndpointsResponse
     */
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
     * @param request the request parameters of ListVpcPublishedRouteEntries  ListVpcPublishedRouteEntriesRequest
     * @return ListVpcPublishedRouteEntriesResponse
     */
    @Override
    public CompletableFuture<ListVpcPublishedRouteEntriesResponse> listVpcPublishedRouteEntries(ListVpcPublishedRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListVpcPublishedRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListVpcPublishedRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListVpcPublishedRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call <strong>ListVpnCertificateAssociations</strong>:</p>
     * <ul>
     * <li>If you specify only the <strong>RegionId</strong> parameter, all associations between VPN gateway instances and SSL certificates in the specified region are queried.</li>
     * <li>If you specify the <strong>RegionId</strong> and <strong>CertificateType</strong> parameters, the associations between VPN gateway instances and SSL certificates of the specified type in the specified region are queried.</li>
     * <li>If you specify the <strong>RegionId</strong> and <strong>VpnGatewayId</strong> parameters, the associations between the specified VPN gateway instances and SSL certificates in the specified region are queried.</li>
     * <li>If you specify the <strong>RegionId</strong> and <strong>CertificateId</strong> parameters, the associations between the specified SSL certificates and VPN gateway instances in the specified region are queried.</li>
     * </ul>
     * 
     * @param request the request parameters of ListVpnCertificateAssociations  ListVpnCertificateAssociationsRequest
     * @return ListVpnCertificateAssociationsResponse
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

    /**
     * @param request the request parameters of ModifyBgpGroupAttribute  ModifyBgpGroupAttributeRequest
     * @return ModifyBgpGroupAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyBgpPeerAttribute  ModifyBgpPeerAttributeRequest
     * @return ModifyBgpPeerAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyCommonBandwidthPackageAttribute  ModifyCommonBandwidthPackageAttributeRequest
     * @return ModifyCommonBandwidthPackageAttributeResponse
     */
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
     * <b>description</b> :
     * <p>By calling the <strong>ModifyCommonBandwidthPackageIpBandwidth</strong> operation, you can flexibly allocate the maximum available bandwidth for each EIP added to an Internet Shared Bandwidth instance, preventing the bandwidth from being consumed by a single EIP.
     * For example, if two EIPs are added to an 800 Mbps Internet Shared Bandwidth instance, you can set the maximum available bandwidth to 500 Mbps for the first EIP and 400 Mbps for the second EIP. After the configuration, the available bandwidth of the first EIP does not exceed 500 Mbps, and the available bandwidth of the second EIP does not exceed 400 Mbps.
     * Before you begin:</p>
     * <ul>
     * <li>This operation takes effect only when the EIP is associated with an ECS instance. The configuration does not take effect when the EIP is attached to a CLB instance, NAT gateway, secondary elastic network interface (ENI), or high-availability virtual IP address (HAVIP). This feature is not active in those scenarios.</li>
     * <li>This operation is in public preview and can only be used through the API to set the maximum available bandwidth for an EIP that has been added to an Internet Shared Bandwidth instance. The console does not support this feature.</li>
     * <li>This operation does not support concurrent requests to set the maximum available bandwidth for the same EIP.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCommonBandwidthPackageIpBandwidth  ModifyCommonBandwidthPackageIpBandwidthRequest
     * @return ModifyCommonBandwidthPackageIpBandwidthResponse
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
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following information:</p>
     * <ul>
     * <li><strong>ModifyCommonBandwidthPackageSpec</strong> is an asynchronous operation. After a request is sent, the system returns a request ID, but the maximum bandwidth of the Internet Shared Bandwidth instance has not been modified yet. The modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/120309.html">DescribeCommonBandwidthPackages</a> to query the status of the Internet Shared Bandwidth instance.<ul>
     * <li>If the Internet Shared Bandwidth instance is in the <strong>Modifying</strong> state, the maximum bandwidth is being modified. In this state, you can only perform query operations and cannot perform other operations.</li>
     * <li>If the Internet Shared Bandwidth instance is in the <strong>Available</strong> state, the maximum bandwidth has been modified.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyCommonBandwidthPackageSpec</strong> does not support concurrent modifications to the maximum bandwidth of the same Internet Shared Bandwidth instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCommonBandwidthPackageSpec  ModifyCommonBandwidthPackageSpecRequest
     * @return ModifyCommonBandwidthPackageSpecResponse
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
     * <b>description</b> :
     * <ul>
     * <li>When you call the <strong>ModifyCustomerGatewayAttribute</strong> operation, if the <strong>AuthKey</strong> parameter is not empty, this operation is asynchronous. The system returns the customer gateway information first, but the configuration has not been modified yet because the modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the modification status of the customer gateway configuration:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the customer gateway configuration is being modified.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the customer gateway configuration has been modified.</li>
     * </ul>
     * </li>
     * <li>When you call the <strong>ModifyCustomerGatewayAttribute</strong> operation, if the <strong>AuthKey</strong> parameter is empty, this operation is synchronous.</li>
     * <li>The <strong>ModifyCustomerGatewayAttribute</strong> operation does not support concurrent modifications to the configuration of the same customer gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyCustomerGatewayAttribute  ModifyCustomerGatewayAttributeRequest
     * @return ModifyCustomerGatewayAttributeResponse
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

    /**
     * @param request the request parameters of ModifyEipAddressAttribute  ModifyEipAddressAttributeRequest
     * @return ModifyEipAddressAttributeResponse
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

    /**
     * @param request the request parameters of ModifyEipForwardMode  ModifyEipForwardModeRequest
     * @return ModifyEipForwardModeResponse
     */
    @Override
    public CompletableFuture<ModifyEipForwardModeResponse> modifyEipForwardMode(ModifyEipForwardModeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyEipForwardMode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyEipForwardModeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyEipForwardModeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyExpressCloudConnectionAttribute  ModifyExpressCloudConnectionAttributeRequest
     * @return ModifyExpressCloudConnectionAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyExpressCloudConnectionBandwidth  ModifyExpressCloudConnectionBandwidthRequest
     * @return ModifyExpressCloudConnectionBandwidthResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>Only dedicated Express Connect circuits that are in the Normal state and do not have overdue payments can be associated. Shared Express Connect circuit ports and Virtual Border Router (VBR) instances are not supported.</li>
     * <li>When associating dedicated Express Connect circuits, only full replacement is supported. To disassociate all circuits, pass an empty string.</li>
     * <li>If a dedicated Express Connect circuit has shared Express Connect circuits or cross-account VBRs, you must be added to the whitelist before you can associate it.</li>
     * <li>The device on which the dedicated Express Connect circuit resides must support the QoS feature before association.</li>
     * <li>If a single VBR is associated with multiple Express Connect circuits, you must associate all Express Connect circuits of the VBR at the same time.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyExpressConnectTrafficQos  ModifyExpressConnectTrafficQosRequest
     * @return ModifyExpressConnectTrafficQosResponse
     */
    @Override
    public CompletableFuture<ModifyExpressConnectTrafficQosResponse> modifyExpressConnectTrafficQos(ModifyExpressConnectTrafficQosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyExpressConnectTrafficQos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyExpressConnectTrafficQosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyExpressConnectTrafficQosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyExpressConnectTrafficQosQueue  ModifyExpressConnectTrafficQosQueueRequest
     * @return ModifyExpressConnectTrafficQosQueueResponse
     */
    @Override
    public CompletableFuture<ModifyExpressConnectTrafficQosQueueResponse> modifyExpressConnectTrafficQosQueue(ModifyExpressConnectTrafficQosQueueRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyExpressConnectTrafficQosQueue").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyExpressConnectTrafficQosQueueResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyExpressConnectTrafficQosQueueResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyExpressConnectTrafficQosRule  ModifyExpressConnectTrafficQosRuleRequest
     * @return ModifyExpressConnectTrafficQosRuleResponse
     */
    @Override
    public CompletableFuture<ModifyExpressConnectTrafficQosRuleResponse> modifyExpressConnectTrafficQosRule(ModifyExpressConnectTrafficQosRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyExpressConnectTrafficQosRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyExpressConnectTrafficQosRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyExpressConnectTrafficQosRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>ModifyFlowLogAttribute</strong> is an asynchronous operation. After you send a request, the system returns a request ID. However, the flow log has not been modified yet because the modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/87923.html">DescribeFlowLogs</a> to query the modification status of the flow log:<ul>
     * <li>If the flow log is in the <strong>Modifying</strong> state, the flow log is being modified.</li>
     * <li>If the flow log is in the <strong>Active</strong> or <strong>Inactive</strong> state, the flow log has been modified.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyFlowLogAttribute</strong> does not support concurrent modifications to the same flow log.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyFlowLogAttribute  ModifyFlowLogAttributeRequest
     * @return ModifyFlowLogAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>ModifyForwardEntry</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the DNAT entry has not been modified yet. The modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/36053.html">DescribeForwardTableEntries</a> to query the status of the DNAT entry:<ul>
     * <li>If the DNAT entry is in the <strong>Pending</strong> state, the DNAT entry is being modified. In this state, you can only perform query operations and cannot perform other operations.</li>
     * <li>If the DNAT entry is in the <strong>Available</strong> state, the DNAT entry has been modified.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyForwardEntry</strong> does not support concurrent modifications of the same DNAT entry.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyForwardEntry  ModifyForwardEntryRequest
     * @return ModifyForwardEntryResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>ModifyFullNatEntryAttribute</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the FULLNAT entry is not yet modified. The modification task runs in the background. You can call <a href="https://help.aliyun.com/document_detail/348779.html">ListFullNatEntries</a> to query the modification status of the FULLNAT entry:<ul>
     * <li>If the FULLNAT entry is in the <strong>Modifying</strong> state, the FULLNAT entry is being modified. In this state, you can only perform query operations.</li>
     * <li>If the FULLNAT entry is in the <strong>Available</strong> state, the FULLNAT entry is modified.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyFullNatEntryAttribute</strong> does not support concurrent modifications of a specified FULLNAT entry within the same FULLNAT table.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyFullNatEntryAttribute  ModifyFullNatEntryAttributeRequest
     * @return ModifyFullNatEntryAttributeResponse
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

    /**
     * @param request the request parameters of ModifyGlobalAccelerationInstanceAttributes  ModifyGlobalAccelerationInstanceAttributesRequest
     * @return ModifyGlobalAccelerationInstanceAttributesResponse
     */
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
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation does not support modifying the bandwidth of a subscription Alibaba Cloud Global Accelerator (GA) instance.</p>
     * 
     * @param request the request parameters of ModifyGlobalAccelerationInstanceSpec  ModifyGlobalAccelerationInstanceSpecRequest
     * @return ModifyGlobalAccelerationInstanceSpecResponse
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
     * <b>description</b> :
     * <p><em>ModifyHaVipAttribute</em>* does not support concurrent modifications to the name and description of the same HaVip.</p>
     * 
     * @param request the request parameters of ModifyHaVipAttribute  ModifyHaVipAttributeRequest
     * @return ModifyHaVipAttributeResponse
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
     * @deprecated OpenAPI ModifyIPv6TranslatorAclAttribute is deprecated  * @param request  the request parameters of ModifyIPv6TranslatorAclAttribute  ModifyIPv6TranslatorAclAttributeRequest
     * @return ModifyIPv6TranslatorAclAttributeResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of ModifyIPv6TranslatorAclListEntry  ModifyIPv6TranslatorAclListEntryRequest
     * @return ModifyIPv6TranslatorAclListEntryResponse
     */
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

    /**
     * @param request the request parameters of ModifyIPv6TranslatorAttribute  ModifyIPv6TranslatorAttributeRequest
     * @return ModifyIPv6TranslatorAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyIPv6TranslatorBandwidth  ModifyIPv6TranslatorBandwidthRequest
     * @return ModifyIPv6TranslatorBandwidthResponse
     */
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
     * @deprecated OpenAPI ModifyIPv6TranslatorEntry is deprecated  * @param request  the request parameters of ModifyIPv6TranslatorEntry  ModifyIPv6TranslatorEntryRequest
     * @return ModifyIPv6TranslatorEntryResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of ModifyIpv6AddressAttribute  ModifyIpv6AddressAttributeRequest
     * @return ModifyIpv6AddressAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyIpv6GatewayAttribute  ModifyIpv6GatewayAttributeRequest
     * @return ModifyIpv6GatewayAttributeResponse
     */
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
     * <b>description</b> :
     * <p>The <strong>ModifyIpv6InternetBandwidth</strong> operation does not support concurrent modifications to the same IPv6 Internet bandwidth.</p>
     * 
     * @param request the request parameters of ModifyIpv6InternetBandwidth  ModifyIpv6InternetBandwidthRequest
     * @return ModifyIpv6InternetBandwidthResponse
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
     * <b>description</b> :
     * <p>The NAT gateways queried by this operation include Internet NAT gateways and VPC NAT gateways. The term &quot;NAT gateway&quot; in this topic is not specific to either type.</p>
     * 
     * @param request the request parameters of ModifyNatGatewayAttribute  ModifyNatGatewayAttributeRequest
     * @return ModifyNatGatewayAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>ModifyNatGatewaySpec</strong> operation does not support downgrading the specification of a subscription Internet NAT gateway. Perform the downgrade in the console.</li>
     * <li>When you call the <strong>ModifyNatGatewaySpec</strong> operation to upgrade the specification of a subscription Internet NAT gateway, an upgrade order is generated. Complete the payment in the Order Center for the upgrade to take effect.</li>
     * <li>The <strong>ModifyNatGatewaySpec</strong> operation is asynchronous. After you call this operation, the system returns a request ID, but the specification change of the Internet NAT gateway is not yet complete because the task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/2522327.html">DescribeNatGateways</a> to query the status of the Internet NAT gateway:<ul>
     * <li>If the Internet NAT gateway is in the <strong>Modifying</strong> state, the specification change is in progress. In this state, you can only perform query operations.</li>
     * <li>If the Internet NAT gateway is in the <strong>Available</strong> state, the specification change is complete.</li>
     * </ul>
     * </li>
     * <li>The <strong>ModifyNatGatewaySpec</strong> operation does not support concurrent specification changes for NAT gateway instances that are billed by specification.
     * Internet NAT gateways are available in different specifications. The specification of an Internet NAT gateway affects the maximum number of connections and the number of new connections per second for the SNAT feature, but does not affect data throughput. The following table describes the relationship between Internet NAT gateway specifications and SNAT performance.<table>
     * <thead>
     * <tr>
     * <th>Specification</th>
     * <th>Maximum connections</th>
     * <th>New connections per second</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Small</td>
     * <td>10,000</td>
     * <td>1,000</td>
     * </tr>
     * <tr>
     * <td>Medium</td>
     * <td>50,000</td>
     * <td>5,000</td>
     * </tr>
     * <tr>
     * <td>Large</td>
     * <td>200,000</td>
     * <td>10,000</td>
     * </tr>
     * </tbody></table>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifyNatGatewaySpec  ModifyNatGatewaySpecRequest
     * @return ModifyNatGatewaySpecResponse
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
     * <b>description</b> :
     * <p>The <strong>ModifyNatIpAttribute</strong> operation does not support concurrent modifications to the name and description of the same NAT IP address.</p>
     * 
     * @param request the request parameters of ModifyNatIpAttribute  ModifyNatIpAttributeRequest
     * @return ModifyNatIpAttributeResponse
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

    /**
     * @param request the request parameters of ModifyNatIpCidrAttribute  ModifyNatIpCidrAttributeRequest
     * @return ModifyNatIpCidrAttributeResponse
     */
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

    /**
     * @param request the request parameters of ModifyNetworkAclAttributes  ModifyNetworkAclAttributesRequest
     * @return ModifyNetworkAclAttributesResponse
     */
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
     * <b>description</b> :
     * <p>When you call this operation, note the following items: </p>
     * <ul>
     * <li>You can modify the specifications and redundant circuit ID only for Express Connect circuits in the <strong>Initial</strong>, <strong>Enabled</strong>, or <strong>Rejected</strong> state.  </li>
     * <li>You cannot modify Express Connect circuits in the <strong>Canceled</strong>, <strong>Allocating</strong>, <strong>AllocationFailed</strong>, or <strong>Terminated</strong> state.  </li>
     * <li>After an Express Connect circuit in the <strong>Rejected</strong> state is modified, it enters the <strong>Initial</strong> state.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyPhysicalConnectionAttribute  ModifyPhysicalConnectionAttributeRequest
     * @return ModifyPhysicalConnectionAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>ModifyRouteEntry</strong> operation does not support concurrent modifications to the name and description of the same custom route entry.</li>
     * <li>The <strong>ModifyRouteEntry</strong> operation may return the <strong>TaskConflict</strong> error code in concurrent scenarios. Retry the operation as needed.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyRouteEntry  ModifyRouteEntryRequest
     * @return ModifyRouteEntryResponse
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
     * <b>description</b> :
     * <p>The <strong>ModifyRouteTableAttributes</strong> operation does not support concurrent modifications to the attributes of the same route table, such as the name, description, or whether to receive dynamic routes.
     * When you call the <strong>ModifyRouteTableAttributes</strong> operation to enable or disable route propagation, note the following:</p>
     * <ul>
     * <li>Enabling or disabling route propagation is an asynchronous operation.</li>
     * <li>The time required to enable or disable route propagation depends on the number of propagated routes.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyRouteTableAttributes  ModifyRouteTableAttributesRequest
     * @return ModifyRouteTableAttributesResponse
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

    /**
     * @param request the request parameters of ModifyRouterInterfaceAttribute  ModifyRouterInterfaceAttributeRequest
     * @return ModifyRouterInterfaceAttributeResponse
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
     * <b>description</b> :
     * <p>After you call this operation, the router interface enters the Activating (<strong>Activating</strong>) state. After the activation succeeds, the router interface enters the Active (<strong>Active</strong>) state. </p>
     * <blockquote>
     * <p>You cannot modify the specification of a router interface that has an overdue payment.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifyRouterInterfaceSpec  ModifyRouterInterfaceSpecRequest
     * @return ModifyRouterInterfaceSpecResponse
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
     * <b>description</b> :
     * <p><em>ModifySnatEntry</em>* is an asynchronous operation. After you send a request, the system returns a request ID, but the SNAT entry has not been modified yet. The modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/42677.html">DescribeSnatTableEntries</a> to query the status of the SNAT entry:</p>
     * <ul>
     * <li>If the SNAT entry is in the <strong>Pending</strong> state, the SNAT entry is being modified. In this state, you can only perform query operations and cannot perform other operations.</li>
     * <li>If the SNAT entry is in the <strong>Available</strong> state, the SNAT entry is modified.<blockquote>
     * <p>If a SNAT entry in the SNAT table is in the <strong>Pending</strong> state, you cannot modify SNAT entries in the SNAT table.
     * <strong>ModifySnatEntry</strong> does not support concurrent modifications of a specified SNAT entry within the same SNAT entry instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of ModifySnatEntry  ModifySnatEntryRequest
     * @return ModifySnatEntryResponse
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

    /**
     * @param request the request parameters of ModifySslVpnClientCert  ModifySslVpnClientCertRequest
     * @return ModifySslVpnClientCertResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>If you want to enable two-factor authentication for the SSL server, make sure that the VPN gateway instance supports this feature. You may need to upgrade the VPN gateway instance. For more information, see <a href="https://help.aliyun.com/document_detail/2785320.html">SSL-VPN two-factor authentication supports IDaaS EIAM 2.0</a>.</li>
     * <li>When you modify only the <strong>Name</strong> of the SSL-VPN server, this operation is synchronous. If you modify configurations other than <strong>Name</strong>, this operation is asynchronous.</li>
     * <li>When the <strong>ModifySslVpnServer</strong> operation is asynchronous, the system returns a request ID but the configuration of the SSL-VPN server has not been modified. The modification task is still running in the background. You can call the <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> operation to query the status of the VPN gateway instance associated with the SSL-VPN server to check the modification status:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the configuration of the SSL-VPN server is being modified.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the configuration of the SSL-VPN server has been modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>ModifySslVpnServer</strong> operation does not support concurrent modifications to the SSL-VPN server configuration under the same VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifySslVpnServer  ModifySslVpnServerRequest
     * @return ModifySslVpnServerResponse
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

    /**
     * @param request the request parameters of ModifyTunnelAttribute  ModifyTunnelAttributeRequest
     * @return ModifyTunnelAttributeResponse
     */
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
     * <b>description</b> :
     * <p>The <strong>ModifyVRouterAttribute</strong> operation does not support concurrent modifications to the name and description of the same vRouter.</p>
     * 
     * @param request the request parameters of ModifyVRouterAttribute  ModifyVRouterAttributeRequest
     * @return ModifyVRouterAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>ModifyVSwitchAttribute</strong> is an asynchronous operation. After you call this operation, the system returns a request ID, but the vSwitch configuration has not been modified yet. The modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> to query the modification status of the vSwitch:<ul>
     * <li>If the vSwitch is in the <strong>Pending</strong> state, the configuration is being modified.</li>
     * <li>If the vSwitch is in the <strong>Available</strong> state, the vSwitch is available.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyVSwitchAttribute</strong> does not support concurrent modifications to the same vSwitch.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVSwitchAttribute  ModifyVSwitchAttributeRequest
     * @return ModifyVSwitchAttributeResponse
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
     * <b>description</b> :
     * <p>The <strong>ModifyVSwitchCidrReservationAttribute</strong> operation does not support concurrently modifying the name and description of a reserved CIDR block within the same vSwitch.</p>
     * 
     * @param request the request parameters of ModifyVSwitchCidrReservationAttribute  ModifyVSwitchCidrReservationAttributeRequest
     * @return ModifyVSwitchCidrReservationAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>ModifyVcoRouteEntryWeight</strong> is an asynchronous operation. After a request is sent, the system returns a request ID, but the weight of the destination route entry has not been modified yet. The modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/53046.html">DescribeVpnConnection</a> to query the modification status of the destination route entry weight:<ul>
     * <li>If the IPsec-VPN connection is in the <strong>updating</strong> state, the weight of the destination route entry is being modified.</li>
     * <li>If the IPsec-VPN connection is in the <strong>attached</strong> state, the weight of the destination route entry is modified.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyVcoRouteEntryWeight</strong> does not support concurrent modifications of destination route entry weights for the same IPsec-VPN connection.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVcoRouteEntryWeight  ModifyVcoRouteEntryWeightRequest
     * @return ModifyVcoRouteEntryWeightResponse
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
     * <b>description</b> :
     * <p><strong>VlanId</strong> can be modified only by the owner of the Express Connect circuit.</p>
     * <ul>
     * <li>The same VLAN ID on the same Express Connect circuit cannot be used by two VBRs at the same time.</li>
     * <li>A VBR that enters the <strong>terminated</strong> state automatically retains its VLAN ID for 7 days, during which other VBRs cannot use the VLAN ID. After 7 days, the VLAN ID can be used by other VBRs.</li>
     * <li>For VBR instances owned by other accounts, you cannot configure <strong>LocalGatewayIp</strong>, <strong>PeerGatewayIp</strong>, or <strong>PeeringSubnetMask</strong>.</li>
     * <li><strong>PeeringSubnetMask</strong> supports 24 to 30 bits (255.255.255.0 to 255.255.255.252).</li>
     * <li><strong>LocalGatewayIp</strong> and <strong>PeerGatewayIp</strong> must be in the same CIDR block. For example, LocalGatewayIp: 192.168.XX.XX, PeerGatewayIp: 192.168.XX.XX, PeeringSubnetMask: 255.255.255.248.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVirtualBorderRouterAttribute  ModifyVirtualBorderRouterAttributeRequest
     * @return ModifyVirtualBorderRouterAttributeResponse
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
     * <b>description</b> :
     * <p>The <strong>ModifyVpcAttribute</strong> operation does not support concurrent modifications to the configuration of the same VPC.</p>
     * <ul>
     * <li>The <strong>ModifyVpcAttribute</strong> operation can enable IPv6 for a VPC. However, you cannot modify the IPv6 CIDR block or IPv6 address type for a VPC that already has IPv6 enabled.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVpcAttribute  ModifyVpcAttributeRequest
     * @return ModifyVpcAttributeResponse
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
     * @param request the request parameters of ModifyVpcCidrBlock  ModifyVpcCidrBlockRequest
     * @return ModifyVpcCidrBlockResponse
     */
    @Override
    public CompletableFuture<ModifyVpcCidrBlockResponse> modifyVpcCidrBlock(ModifyVpcCidrBlockRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpcCidrBlock").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpcCidrBlockResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpcCidrBlockResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>ModifyVpcPrefixList</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the prefix list instance configuration has not been modified yet. The modification node continues to run in the background. You can invoke <a href="https://help.aliyun.com/document_detail/311535.html">ListPrefixLists</a> to query the status of the prefix list instance.<ul>
     * <li>If the prefix list instance is in the <strong>Modifying</strong> state, the configuration is being modified.</li>
     * <li>If the prefix list instance is in the <strong>Created</strong> state, the configuration has been modified.</li>
     * <li>After the configuration is modified, you can invoke <a href="https://help.aliyun.com/document_detail/445478.html">GetVpcPrefixListAssociations</a> to query the associations of the prefix list and check whether the associated resources use the updated Classless Inter-Domain Routing blocks. If the <strong>Status</strong> parameter of the prefix list association is <strong>Created</strong>, the associated resources use the updated Classless Inter-Domain Routing blocks.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyVpcPrefixList</strong> does not support concurrent modifications to the same prefix list instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVpcPrefixList  ModifyVpcPrefixListRequest
     * @return ModifyVpcPrefixListResponse
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
     * <b>description</b> :
     * <ul>
     * <li>When you modify a dual-tunnel IPsec-VPN connection, in addition to the required parameters, the following request parameters are supported: <strong>ClientToken</strong>, <strong>Name</strong>, <strong>LocalSubnet</strong>, <strong>RemoteSubnet</strong>, <strong>EffectImmediately</strong>, the <strong>TunnelOptionsSpecification</strong> array, and <strong>EnableTunnelsBgp</strong>.</li>
     * <li>When you modify a single-tunnel IPsec-VPN connection, in addition to the required parameters, the following request parameters are supported: <strong>ClientToken</strong>, <strong>Name</strong>, <strong>LocalSubnet</strong>, <strong>RemoteSubnet</strong>, <strong>EffectImmediately</strong>, <strong>IkeConfig</strong>, <strong>IpsecConfig</strong>, <strong>HealthCheckConfig</strong>, <strong>EnableDpd</strong>, <strong>EnableNatTraversal</strong>, <strong>BgpConfig</strong>, and <strong>CustomerGatewayId</strong>.</li>
     * <li>The <strong>ModifyVpnAttachmentAttribute</strong> operation is asynchronous. After a request is sent, the system returns a request ID. However, the IPsec-VPN connection configuration has not been modified. The modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/53046.html">DescribeVpnConnection</a> to query the modification status of the IPsec-VPN connection configuration:<ul>
     * <li>If the IPsec-VPN connection is in the <strong>updating</strong> state, the configuration is being modified.</li>
     * <li>If the IPsec-VPN connection is in the <strong>attached</strong> state, the configuration has been modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>ModifyVpnAttachmentAttribute</strong> operation does not support concurrent modifications to the IPsec-VPN connection configuration.</li>
     * <li>When you call the <strong>ModifyVpnAttachmentAttribute</strong> operation, you cannot modify the gateway type of the IPsec-VPN connection.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVpnAttachmentAttribute  ModifyVpnAttachmentAttributeRequest
     * @return ModifyVpnAttachmentAttributeResponse
     */
    @Override
    public CompletableFuture<ModifyVpnAttachmentAttributeResponse> modifyVpnAttachmentAttribute(ModifyVpnAttachmentAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyVpnAttachmentAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyVpnAttachmentAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyVpnAttachmentAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>To modify a dual-tunnel mode IPsec-VPN connection, the <code>ModifyVpnConnectionAttribute</code> operation supports the following request parameters in addition to the required parameters:
     *  <strong>ClientToken</strong>, <strong>Name</strong>, <strong>LocalSubnet</strong>, <strong>RemoteSubnet</strong>, <strong>EffectImmediately</strong>, <strong>AutoConfigRoute</strong>, <strong>TunnelOptionsSpecification</strong> array, and <strong>EnableTunnelsBgp</strong>.</li>
     * <li>To modify a single-tunnel mode IPsec-VPN connection, the <code>ModifyVpnConnectionAttribute</code> operation supports the following request parameters in addition to the required parameters:
     *    <strong>ClientToken</strong>, <strong>Name</strong>, <strong>LocalSubnet</strong>, <strong>RemoteSubnet</strong>, <strong>EffectImmediately</strong>, <strong>IkeConfig</strong>, <strong>IpsecConfig</strong>, <strong>HealthCheckConfig</strong>, <strong>AutoConfigRoute</strong>, <strong>EnableDpd</strong>, <strong>EnableNatTraversal</strong>, <strong>BgpConfig</strong>, and <strong>RemoteCaCertificate</strong>.</li>
     * <li>The <strong>ModifyVpnConnectionAttribute</strong> operation is asynchronous. After a request is sent, the system returns a request ID, but the configuration of the IPsec-VPN connection has not been modified yet. The modification node is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the instance status of the VPN gateway to determine the modification status of the IPsec-VPN connection configuration:</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVpnConnectionAttribute  ModifyVpnConnectionAttributeRequest
     * @return ModifyVpnConnectionAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>ModifyVpnGatewayAttribute</strong> is an asynchronous operation. After you call this operation, the system returns the VPN gateway information, but the configuration of the VPN gateway has not been modified yet. The modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the modification status of the VPN gateway configuration:<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the configuration is being modified.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the configuration has been modified.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyVpnGatewayAttribute</strong> does not support concurrent modifications to the configuration of the same VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVpnGatewayAttribute  ModifyVpnGatewayAttributeRequest
     * @return ModifyVpnGatewayAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>ModifyVpnPbrRouteEntryAttribute</strong> operation is used to modify both the weight and policy priority of a policy-based route that supports policy priority.<ul>
     * <li>If you only need to modify the weight of a policy-based route, call the <a href="https://help.aliyun.com/document_detail/127249.html">ModifyVpnPbrRouteEntryWeight</a> operation.</li>
     * <li>If you only need to modify the policy priority of a policy-based route, call the <a href="https://help.aliyun.com/document_detail/466870.html">ModifyVpnPbrRouteEntryPriority</a> operation.</li>
     * <li>If your policy-based route does not support policy priority, you can only call the <a href="https://help.aliyun.com/document_detail/127249.html">ModifyVpnPbrRouteEntryWeight</a> operation to modify the weight of the policy-based route.<blockquote>
     * <p>For VPN gateway instances that support dual-tunnel mode IPsec-VPN connections, you can only call this operation to modify the priority of policy-based routes.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>The <strong>ModifyVpnPbrRouteEntryAttribute</strong> operation is asynchronous. After you send a request, the system returns a request ID, but the policy-based route has not been modified yet. The modification node is still running in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> operation to query the instance status of the VPN gateway to determine the modification status of the policy-based routing:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the policy-based route is being modified.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the policy-based route has been modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>ModifyVpnPbrRouteEntryAttribute</strong> operation does not support concurrent modifications of policy-based routes on the same VPN gateway instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVpnPbrRouteEntryAttribute  ModifyVpnPbrRouteEntryAttributeRequest
     * @return ModifyVpnPbrRouteEntryAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>ModifyVpnPbrRouteEntryPriority</strong> is an asynchronous operation. After you send a request, the system returns a request ID. However, the policy-based routing has not been modified yet because the modification node is still running in the background. You can invoke the <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> operation to query the instance status of the VPN gateway and determine the modification status of the policy-based routing:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the policy-based routing is being modified.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the policy-based routing has been modified.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyVpnPbrRouteEntryPriority</strong> does not support concurrent modifications of policy-based routing on the same VPN gateway instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVpnPbrRouteEntryPriority  ModifyVpnPbrRouteEntryPriorityRequest
     * @return ModifyVpnPbrRouteEntryPriorityResponse
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to VPN gateway instances that support IPsec-VPN connections in single-tunnel mode. For VPN gateway instances that support IPsec-VPN connections in dual-tunnel mode, the weight does not take effect even if this operation is called successfully.</p>
     * </blockquote>
     * <ul>
     * <li>If active/standby policy-based routing exists on a VPN gateway instance and you want to modify the weight of the active policy-based route, delete the standby policy-based route first, modify the active policy-based route, and then reconfigure the standby policy-based route. If you want to modify the weight of the standby policy-based route, delete the active policy-based route first, modify the standby policy-based route, and then reconfigure the active policy-based route. To delete a policy-based route, see <a href="https://help.aliyun.com/document_detail/2526956.html">DeleteVpnPbrRouteEntry</a>.</li>
     * <li><strong>ModifyVpnPbrRouteEntryWeight</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the node in the background. You can invoke <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the instance status of the VPN gateway, to determine the modification status of the policy-based routing:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the policy-based routing is being modified.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the policy-based routing is modified.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyVpnPbrRouteEntryWeight</strong> does not support concurrent modifications of policy-based routing on the same VPN gateway instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVpnPbrRouteEntryWeight  ModifyVpnPbrRouteEntryWeightRequest
     * @return ModifyVpnPbrRouteEntryWeightResponse
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
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to VPN gateway instances that support IPsec-VPN connections in single-tunnel mode. For VPN gateway instances that support IPsec-VPN connections in dual-tunnel mode, the weight does not take effect even if it is modified by calling this operation.</p>
     * </blockquote>
     * <ul>
     * <li>If active/standby destination routes exist on a VPN gateway instance and you want to modify the weight of the active destination route, delete the standby destination route first. After the active destination route is modified, reconfigure the standby destination route. If you want to modify the weight of the standby destination route, delete the active destination route first. After the standby destination route is modified, reconfigure the active destination route. To delete a destination route, see <a href="https://help.aliyun.com/document_detail/2526961.html">DeleteVpnRouteEntry</a>.</li>
     * <li><strong>ModifyVpnRouteEntryWeight</strong> is an asynchronous operation. After a request is sent, the system returns a request ID. However, the weight of the VPN destination route has not been modified yet because the modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the modification status of the weight:<ul>
     * <li>If the VPN destination route is in the <strong>updating</strong> state, the weight is being modified.</li>
     * <li>If the VPN destination route is in the <strong>active</strong> state, the weight has been modified.</li>
     * </ul>
     * </li>
     * <li><strong>ModifyVpnRouteEntryWeight</strong> does not support concurrent modification of destination route weights on the same VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of ModifyVpnRouteEntryWeight  ModifyVpnRouteEntryWeightRequest
     * @return ModifyVpnRouteEntryWeightResponse
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

    /**
     * <b>description</b> :
     * <p>The <strong>ChangeResourceGroup</strong> operation does not support concurrent modifications of the resource group for Express Connect circuit resources within the same Express Connect circuit instance.</p>
     * 
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
     * @param request the request parameters of MoveVpnResourceGroup  MoveVpnResourceGroupRequest
     * @return MoveVpnResourceGroupResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>OpenFlowLogService</strong> operation does not support concurrent activation of the flow log service within the same Alibaba Cloud account.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/449624.html">GetFlowLogServiceStatus</a> operation to query the activation status of the flow log service.</li>
     * </ul>
     * 
     * @param request the request parameters of OpenFlowLogService  OpenFlowLogServiceRequest
     * @return OpenFlowLogServiceResponse
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

    /**
     * @param request the request parameters of OpenPhysicalConnectionService  OpenPhysicalConnectionServiceRequest
     * @return OpenPhysicalConnectionServiceResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>OpenPublicIpAddressPoolService</strong> operation does not support concurrent activation of the IP address pool feature within the same Alibaba Cloud account.</li>
     * <li>You can call the GetPublicIpAddressPoolServiceStatu operation to query the activation status of the IP address pool feature.</li>
     * </ul>
     * 
     * @param request the request parameters of OpenPublicIpAddressPoolService  OpenPublicIpAddressPoolServiceRequest
     * @return OpenPublicIpAddressPoolServiceResponse
     */
    @Override
    public CompletableFuture<OpenPublicIpAddressPoolServiceResponse> openPublicIpAddressPoolService(OpenPublicIpAddressPoolServiceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("OpenPublicIpAddressPoolService").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(OpenPublicIpAddressPoolServiceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<OpenPublicIpAddressPoolServiceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The traffic mirroring feature is activated on a per-region basis. The OpenTrafficMirrorService operation does not support concurrent activation of the traffic mirroring feature within the same region.</p>
     * 
     * @param request the request parameters of OpenTrafficMirrorService  OpenTrafficMirrorServiceRequest
     * @return OpenTrafficMirrorServiceResponse
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

    /**
     * @param request the request parameters of PublishVpcRouteEntries  PublishVpcRouteEntriesRequest
     * @return PublishVpcRouteEntriesResponse
     */
    @Override
    public CompletableFuture<PublishVpcRouteEntriesResponse> publishVpcRouteEntries(PublishVpcRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("PublishVpcRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(PublishVpcRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<PublishVpcRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of PublishVpnRouteEntry  PublishVpnRouteEntryRequest
     * @return PublishVpnRouteEntryResponse
     */
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
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>You can call the RecoverPhysicalConnection operation to recover the access of an Express Connect circuit that has been terminated. Currently, only shared Express Connect circuits can be recovered.</p>
     * 
     * @param request the request parameters of RecoverPhysicalConnection  RecoverPhysicalConnectionRequest
     * @return RecoverPhysicalConnectionResponse
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
     * <b>description</b> :
     * <p>After you call this operation, the VBR changes from the <strong>terminated</strong> state to the <strong>recovering</strong> state. After the VBR is recovered, it enters the <strong>active</strong> state.
     * Before you call this operation to recover a VBR, take note of the following items: </p>
     * <ul>
     * <li>Only the owner of the Express Connect circuit can call this operation.  </li>
     * <li>The Express Connect circuit to which the VBR belongs must be in the <strong>Enabled</strong> state.</li>
     * </ul>
     * 
     * @param request the request parameters of RecoverVirtualBorderRouter  RecoverVirtualBorderRouterRequest
     * @return RecoverVirtualBorderRouterResponse
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
     * <b>description</b> :
     * <p>Before you invoke this operation, take note of the following information:</p>
     * <ul>
     * <li>Before you release an EIP, make sure that the following conditions are met:<ul>
     * <li>Only EIPs in the <strong>Available</strong> state can be released.</li>
     * <li>Only EIPs that use the pay-as-you-go billing method can be released. Subscription EIPs cannot be released.</li>
     * </ul>
     * </li>
     * <li>The <strong>ReleaseEipAddress</strong> operation is asynchronous. After you send a request, the system returns a request ID. However, the EIP instance is not immediately released because the release node is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/120193.html">DescribeEipAddresses</a> to query the status of the EIP instance:<ul>
     * <li>If the EIP instance is in the <strong>Releasing</strong> state, the EIP instance is being released. In this state, you can only execute query operations and cannot execute other operations.</li>
     * <li>If the EIP instance cannot be found, the EIP instance is released.</li>
     * </ul>
     * </li>
     * <li>The <strong>ReleaseEipAddress</strong> operation does not support concurrent release of the same EIP instance.</li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseEipAddress  ReleaseEipAddressRequest
     * @return ReleaseEipAddressResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>ReleaseEipSegmentAddress</strong> operation releases all EIPs in a contiguous EIP group.</li>
     * <li>Before you call <strong>ReleaseEipSegmentAddress</strong>, make sure that:<ul>
     * <li>All EIPs in the contiguous EIP group are in the unassociated state. To disassociate an EIP from a cloud resource, call <a href="https://help.aliyun.com/document_detail/2518066.html">UnassociateEipAddress</a>.</li>
     * <li>No EIPs in the contiguous EIP group are added to an Internet Shared Bandwidth instance. To remove an EIP from an Internet Shared Bandwidth instance, call <a href="https://help.aliyun.com/document_detail/2518602.html">RemoveCommonBandwidthPackageIp</a>.</li>
     * </ul>
     * </li>
     * <li><strong>ReleaseEipSegmentAddress</strong> is an asynchronous operation. After you call this operation, the system returns a request ID, but the contiguous EIPs are not yet released. The release task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/156063.html">DescribeEipSegment</a> to query the status of the contiguous EIP group: <ul>
     * <li>If the contiguous EIP group is in the <strong>Releasing</strong> state, the contiguous EIPs are being released. In this state, you can only perform query operations.</li>
     * <li>If the contiguous EIP group cannot be found, the contiguous EIPs are released.</li>
     * </ul>
     * </li>
     * <li><strong>ReleaseEipSegmentAddress</strong> does not support concurrent release of the same contiguous EIP group.</li>
     * </ul>
     * 
     * @param request the request parameters of ReleaseEipSegmentAddress  ReleaseEipSegmentAddressRequest
     * @return ReleaseEipSegmentAddressResponse
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

    /**
     * @param request the request parameters of ReleaseIpv6Address  ReleaseIpv6AddressRequest
     * @return ReleaseIpv6AddressResponse
     */
    @Override
    public CompletableFuture<ReleaseIpv6AddressResponse> releaseIpv6Address(ReleaseIpv6AddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ReleaseIpv6Address").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ReleaseIpv6AddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ReleaseIpv6AddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveCommonBandwidthPackageIp  RemoveCommonBandwidthPackageIpRequest
     * @return RemoveCommonBandwidthPackageIpResponse
     */
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

    /**
     * @param request the request parameters of RemoveGlobalAccelerationInstanceIp  RemoveGlobalAccelerationInstanceIpRequest
     * @return RemoveGlobalAccelerationInstanceIpResponse
     */
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

    /**
     * @param request the request parameters of RemoveIPv6TranslatorAclListEntry  RemoveIPv6TranslatorAclListEntryRequest
     * @return RemoveIPv6TranslatorAclListEntryResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li><strong>RemoveSourcesFromTrafficMirrorSession</strong> is an asynchronous operation. After a request is sent, the system returns a request ID, but the traffic mirror sources have not been removed yet. The removal task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/261367.html">ListTrafficMirrorSessions</a> to query the status of the traffic mirror session:<ul>
     * <li>If the traffic mirror session is in the <strong>Modifying</strong> state, the traffic mirror sources are being removed.</li>
     * <li>If the traffic mirror session is in the <strong>Created</strong> state, the traffic mirror sources have been removed.</li>
     * </ul>
     * </li>
     * <li><strong>RemoveSourcesFromTrafficMirrorSession</strong> does not support concurrent removal of traffic mirror sources from the same traffic mirror session.</li>
     * </ul>
     * 
     * @param request the request parameters of RemoveSourcesFromTrafficMirrorSession  RemoveSourcesFromTrafficMirrorSessionRequest
     * @return RemoveSourcesFromTrafficMirrorSessionResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>ReplaceVpcDhcpOptionsSet</strong> is an asynchronous operation. After a request is sent, the system returns a request ID. However, the DHCP options set has not been changed yet because the change task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> to query the change status of the DHCP options set:<ul>
     * <li>If the DHCP options set is in the <strong>Pending</strong> state, the DHCP options set is being changed.</li>
     * <li>If the DHCP options set is in the <strong>InUse</strong> state, the DHCP options set has been changed.</li>
     * </ul>
     * </li>
     * <li><strong>ReplaceVpcDhcpOptionsSet</strong> does not support concurrent changes to the DHCP options set associated with the same VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of ReplaceVpcDhcpOptionsSet  ReplaceVpcDhcpOptionsSetRequest
     * @return ReplaceVpcDhcpOptionsSetResponse
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
     * <b>description</b> :
     * <ul>
     * <li>After you modify the information of a prefix list instance, if the route table associated with the prefix list instance does not automatically update the prefix list instance information, you can call this operation to redeploy the latest prefix list instance to the associated route table.</li>
     * <li>The <strong>RetryVpcPrefixListAssociation</strong> operation is asynchronous. After you send a request, the system returns a request ID. However, the latest prefix list instance is not yet redeployed, and the redeployment task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/445478.html">GetVpcPrefixListAssociations</a> to query the latest deployment status of the prefix list instance:<ul>
     * <li>If the deployment status of the prefix list instance is <strong>Modifying</strong>, the latest prefix list instance is being redeployed.</li>
     * <li>If the deployment status of the prefix list instance is <strong>ModifyFailed</strong>, the latest prefix list instance failed to be redeployed.</li>
     * <li>If the deployment status of the prefix list instance is <strong>Created</strong>, the latest prefix list instance is redeployed.</li>
     * </ul>
     * </li>
     * <li>The <strong>RetryVpcPrefixListAssociation</strong> operation does not support concurrent retry of redeploying the latest prefix list instance for the same prefix list.</li>
     * </ul>
     * <h2>Scenarios</h2>
     * <p>When you modify a prefix list instance, the modification succeeds as long as the CIDR blocks are valid, no conflicting CIDR blocks exist, and the maximum number of entries for the prefix list instance is not exceeded. However, the reference may fail due to issues on the referencing side, such as quota limits or a route conflict with existing routing entries. After you resolve the issue on the referencing side, call the <strong>RetryVpcPrefixListAssociation</strong> operation to redeploy the latest prefix list instance.</p>
     * 
     * @param request the request parameters of RetryVpcPrefixListAssociation  RetryVpcPrefixListAssociationRequest
     * @return RetryVpcPrefixListAssociationResponse
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
     * <b>description</b> :
     * <ul>
     * <li>The <strong>RevokeInstanceFromCen</strong> operation is a VPC API operation. Therefore, you must use the <code>vpc.aliyuncs.com</code> endpoint to call this operation. The API version is <code>2016-04-28</code>.</li>
     * <li>The <strong>RevokeInstanceFromCen</strong> operation does not support concurrent revocation of authorization of a network instance for a specified CEN instance within the same VPC, VBR, or CCN.</li>
     * </ul>
     * 
     * @param request the request parameters of RevokeInstanceFromCen  RevokeInstanceFromCenRequest
     * @return RevokeInstanceFromCenResponse
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

    /**
     * @param request the request parameters of RevokeInstanceFromVbr  RevokeInstanceFromVbrRequest
     * @return RevokeInstanceFromVbrResponse
     */
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

    /**
     * @param request the request parameters of SecondApplyPhysicalConnectionLOA  SecondApplyPhysicalConnectionLOARequest
     * @return SecondApplyPhysicalConnectionLOAResponse
     */
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
     * <b>description</b> :
     * <p>The <strong>SetHighDefinitionMonitorLogStatus</strong> operation does not support concurrent configuration of high-definition second-level monitoring for the same EIP instance.</p>
     * 
     * @param request the request parameters of SetHighDefinitionMonitorLogStatus  SetHighDefinitionMonitorLogStatusRequest
     * @return SetHighDefinitionMonitorLogStatusResponse
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

    /**
     * <b>description</b> :
     * <p>Only disaster recovery drill tasks in the <strong>Pending</strong> state can be started.</p>
     * 
     * @param request the request parameters of StartFailoverTestJob  StartFailoverTestJobRequest
     * @return StartFailoverTestJobResponse
     */
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

    /**
     * <b>description</b> :
     * <p>Only failover test jobs in the <strong>Testing</strong> state can be stopped.</p>
     * 
     * @param request the request parameters of StopFailoverTestJob  StopFailoverTestJobRequest
     * @return StopFailoverTestJobResponse
     */
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
     * <b>description</b> :
     * <p>Performs an active/standby switchover for a route target group.</p>
     * 
     * @param request the request parameters of SwitchActiveRouteTarget  SwitchActiveRouteTargetRequest
     * @return SwitchActiveRouteTargetResponse
     */
    @Override
    public CompletableFuture<SwitchActiveRouteTargetResponse> switchActiveRouteTarget(SwitchActiveRouteTargetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SwitchActiveRouteTarget").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SwitchActiveRouteTargetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SwitchActiveRouteTargetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Labels are marks that you allocate to instances. Each label consists of a key-value pair. The following rules apply to labels: </p>
     * <ul>
     * <li>Each label key must be unique on an instance.</li>
     * <li>Empty labels that are not attached to instances are not supported. Labels must be attached to instances.</li>
     * <li>Label information is not shared across regions. 
     *   For example, labels created in the China (Hangzhou) region are not visible in the China (Shanghai) region.</li>
     * <li>Within the same account and region, label information is shared among virtual private clouds (VPCs), route tables, vSwitches, and elastic IP addresses (EIPs). 
     *   For example, if a virtual private cloud (VPC) is attached with a label within the same account and region, you can directly select and attach that label to a vSwitch, route table, or EIP on the label editing page without manually entering the label key-value information. You can modify the key and value of a label, or delete labels from instances at any time. If you delete an instance, all labels attached to the instance are also deleted.</li>
     * <li>A maximum of 20 labels can be attached to a single instance. Before attaching labels, Alibaba Cloud verifies the number of existing labels on the resource. If the limit is exceeded, an error message is returned.</li>
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
     * <b>description</b> :
     * <p>Tags are labels that you assign to instances. Each tag consists of a key-value pair. Take note of the following items when you use tags: </p>
     * <ul>
     * <li>Each tag key (Key) must be unique on an instance.</li>
     * <li>Empty tags that are not bound to instances are not supported. A tag must be bound to an instance.</li>
     * <li>Tag information is not shared across regions. 
     *   For example, tags created in the China (Hangzhou) region are not visible in the China (Shanghai) region.</li>
     * <li>You can bind up to 20 tags to a single instance. Before binding tags, Alibaba Cloud checks the number of existing tags on the resource. If the limit is exceeded, an error message is returned.</li>
     * </ul>
     * 
     * @param request the request parameters of TagResourcesForExpressConnect  TagResourcesForExpressConnectRequest
     * @return TagResourcesForExpressConnectResponse
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
     * <b>description</b> :
     * <p>After you call the TerminatePhysicalConnection operation, the Express Connect circuit enters the <strong>Terminating</strong> state. After the operation is complete, the circuit enters the <strong>Terminated</strong> state.
     * When you call this operation to terminate an Express Connect circuit, note the following items:</p>
     * <ul>
     * <li>You can terminate only an Express Connect circuit that is in the <strong>Enabled</strong> state.</li>
     * <li>Before you terminate an Express Connect circuit, you must delete the VBR associated with it.</li>
     * </ul>
     * 
     * @param request the request parameters of TerminatePhysicalConnection  TerminatePhysicalConnectionRequest
     * @return TerminatePhysicalConnectionResponse
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
     * <b>description</b> :
     * <p>After you call this operation, the VBR changes from the <strong>active</strong> state to the <strong>terminating</strong> state. After the VBR is terminated, it enters the <strong>terminated</strong> state. </p>
     * <blockquote>
     * <p>Only the owner of the Express Connect circuit can call this operation.</p>
     * </blockquote>
     * 
     * @param request the request parameters of TerminateVirtualBorderRouter  TerminateVirtualBorderRouterRequest
     * @return TerminateVirtualBorderRouterResponse
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

    /**
     * @param request the request parameters of TransformEipSegmentToPublicIpAddressPool  TransformEipSegmentToPublicIpAddressPoolRequest
     * @return TransformEipSegmentToPublicIpAddressPoolResponse
     */
    @Override
    public CompletableFuture<TransformEipSegmentToPublicIpAddressPoolResponse> transformEipSegmentToPublicIpAddressPool(TransformEipSegmentToPublicIpAddressPoolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("TransformEipSegmentToPublicIpAddressPool").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(TransformEipSegmentToPublicIpAddressPoolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<TransformEipSegmentToPublicIpAddressPoolResponse> future = new CompletableFuture<>();
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

    /**
     * <b>description</b> :
     * <ul>
     * <li>The <strong>UnassociateEipAddress</strong> operation is asynchronous. After you send a request, the system returns a request ID, but the EIP is not yet disassociated. The disassociation task continues to run in the background. You can call <a href="https://help.aliyun.com/document_detail/120193.html">DescribeEipAddresses</a> to query the status of the EIP: <ul>
     * <li>If the EIP is in the <strong>Unassociating</strong> state, the EIP is being disassociated. In this state, you can only perform query operations.</li>
     * <li>If the EIP is in the <strong>Available</strong> state, the EIP is disassociated.</li>
     * </ul>
     * </li>
     * <li>The <strong>UnassociateEipAddress</strong> operation does not support concurrent disassociation requests for the same EIP.</li>
     * </ul>
     * 
     * @param request the request parameters of UnassociateEipAddress  UnassociateEipAddressRequest
     * @return UnassociateEipAddressResponse
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
     * @param request the request parameters of UnassociateGlobalAccelerationInstance  UnassociateGlobalAccelerationInstanceRequest
     * @return UnassociateGlobalAccelerationInstanceResponse
     */
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
     * <b>description</b> :
     * <p>When you invoke this operation to disassociate an HaVip from an ECS instance or network interface controller (NIC) in a virtual private cloud (VPC), take note of the following items: </p>
     * <ul>
     * <li>The ECS instance to be disassociated must be in the <strong>Running</strong> or <strong>Stopped</strong> state. </li>
     * <li>The HaVip to be disassociated must be in the <strong>Available</strong> or <strong>InUse</strong> state.</li>
     * <li>The <strong>UnassociateHaVip</strong> operation is asynchronous. After you send a request, the system returns a request ID, but the HaVip is not yet disassociated. The disassociation task is still running in the background. You can invoke <a href="https://help.aliyun.com/document_detail/114611.html">DescribeHaVips</a> to query the disassociation status of the HaVip:<ul>
     * <li>If the HaVip is in the <strong>Unassociating</strong> state, the HaVip is being disassociated.</li>
     * <li>If the HaVip is in the <strong>Inuse</strong> or <strong>Available</strong> state, the HaVip is disassociated.</li>
     * </ul>
     * </li>
     * <li>The <strong>UnassociateHaVip</strong> operation does not support concurrent disassociation of the same HaVip.</li>
     * </ul>
     * 
     * @param request the request parameters of UnassociateHaVip  UnassociateHaVipRequest
     * @return UnassociateHaVipResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>UnassociateNetworkAcl</strong> is an asynchronous operation. After you send a request, the system returns a request ID, but the network ACL is not yet disassociated from the vSwitch. The disassociation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/116542.html">DescribeNetworkAclAttributes</a> to query the disassociation status of the network ACL and the vSwitch:<ul>
     * <li>If the network ACL and the vSwitch are in the <strong>UNBINDING</strong> state, the disassociation is in progress.</li>
     * <li>If no binding record is found, the network ACL is disassociated from the vSwitch.</li>
     * </ul>
     * </li>
     * <li><strong>UnassociateNetworkAcl</strong> does not support concurrent disassociation of vSwitches from the same network ACL.</li>
     * </ul>
     * 
     * @param request the request parameters of UnassociateNetworkAcl  UnassociateNetworkAclRequest
     * @return UnassociateNetworkAclResponse
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

    /**
     * @param request the request parameters of UnassociatePhysicalConnectionFromVirtualBorderRouter  UnassociatePhysicalConnectionFromVirtualBorderRouterRequest
     * @return UnassociatePhysicalConnectionFromVirtualBorderRouterResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li><strong>UnassociateRouteTable</strong> is an asynchronous operation. After you call this operation, the system returns a request ID, but the route table has not been disassociated yet. The disassociation task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> to query the disassociation status of the route table:<ul>
     * <li>If the vSwitch is in the <strong>Pending</strong> state, the route table is being disassociated.</li>
     * <li>If the vSwitch is in the <strong>Available</strong> state, the route table is disassociated.</li>
     * </ul>
     * </li>
     * <li><strong>UnassociateRouteTable</strong> does not support concurrent disassociation of the same route table from the same vSwitch.</li>
     * </ul>
     * 
     * @param request the request parameters of UnassociateRouteTable  UnassociateRouteTableRequest
     * @return UnassociateRouteTableResponse
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
     * <b>description</b> :
     * <ul>
     * <li>Before deleting a secondary CIDR block from a VPC, delete the vSwitches that are created with the secondary CIDR block. For more information, see <a href="https://help.aliyun.com/document_detail/35746.html">DeleteVSwitch</a>.</li>
     * <li>The <strong>UnassociateVpcCidrBlock</strong> operation does not support concurrently deleting secondary CIDR blocks from the same VPC.</li>
     * </ul>
     * 
     * @param request the request parameters of UnassociateVpcCidrBlock  UnassociateVpcCidrBlockRequest
     * @return UnassociateVpcCidrBlockResponse
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

    /**
     * @param request the request parameters of UntagResourcesForExpressConnect  UntagResourcesForExpressConnectRequest
     * @return UntagResourcesForExpressConnectResponse
     */
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

    /**
     * @param request the request parameters of UpdateDhcpOptionsSetAttribute  UpdateDhcpOptionsSetAttributeRequest
     * @return UpdateDhcpOptionsSetAttributeResponse
     */
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

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>UpdateEnhancedVpnGateway</strong> is an asynchronous operation. After you call this operation, the system returns the information about the enhanced VPN gateway, but the configuration has not been modified yet. The modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the modification status of the enhanced VPN gateway:<ul>
     * <li>If the enhanced VPN gateway is in the <strong>updating</strong> state, the configuration is being modified.</li>
     * <li>If the enhanced VPN gateway is in the <strong>active</strong> state, the configuration has been modified.</li>
     * </ul>
     * </li>
     * <li><strong>UpdateEnhancedVpnGateway</strong> does not support concurrent modifications to the same enhanced VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateEnhancedVpnGateway  UpdateEnhancedVpnGatewayRequest
     * @return UpdateEnhancedVpnGatewayResponse
     */
    @Override
    public CompletableFuture<UpdateEnhancedVpnGatewayResponse> updateEnhancedVpnGateway(UpdateEnhancedVpnGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEnhancedVpnGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEnhancedVpnGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEnhancedVpnGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Only failover test jobs in the <strong>Pending</strong> state can be updated.</p>
     * 
     * @param request the request parameters of UpdateFailoverTestJob  UpdateFailoverTestJobRequest
     * @return UpdateFailoverTestJobResponse
     */
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

    /**
     * @param request the request parameters of UpdateGatewayRouteTableEntryAttribute  UpdateGatewayRouteTableEntryAttributeRequest
     * @return UpdateGatewayRouteTableEntryAttributeResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li>If you modify only the <strong>IpsecServerName</strong> of the IPsec server, this operation is synchronous. If you modify configurations other than <strong>IpsecServerName</strong>, this operation is asynchronous.</li>
     * <li>When the <strong>UpdateIpsecServer</strong> operation is asynchronous, the system returns a request ID first, but the IPsec server configuration has not been modified yet because the modification task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> to query the status of the VPN gateway instance to determine the modification status of the IPsec server configuration:<ul>
     * <li>If the VPN gateway instance is in the <strong>updating</strong> state, the IPsec server configuration is being modified.</li>
     * <li>If the VPN gateway instance is in the <strong>active</strong> state, the IPsec server configuration has been modified.</li>
     * </ul>
     * </li>
     * <li>The <strong>UpdateIpsecServer</strong> operation does not support concurrent modifications to IPsec server configurations under the same VPN gateway.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateIpsecServer  UpdateIpsecServerRequest
     * @return UpdateIpsecServerResponse
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
     * <b>description</b> :
     * <p>The <strong>UpdateIpv4GatewayAttribute</strong> operation does not support concurrent modifications to the name or description of the same IPv4 gateway.</p>
     * 
     * @param request the request parameters of UpdateIpv4GatewayAttribute  UpdateIpv4GatewayAttributeRequest
     * @return UpdateIpv4GatewayAttributeResponse
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
     * @deprecated OpenAPI UpdateNatGatewayNatType is deprecated  * @description ## Operation description
     * Before you invoke the UpdateNatGatewayNatType operation, take note of the following information:
     * - **UpdateNatGatewayNatType** is an asynchronous operation. After you send a request, the system returns a request ID, but the NAT gateway type has not been upgraded yet. The upgrade node is still running in the background. You can invoke GetNatGatewayConvertStatus to query the upgrade status of the NAT gateway. For more information, see [GetNatGatewayConvertStatus](https://help.aliyun.com/document_detail/184744.html).
     *     - If the upgrade status is **processing**, the NAT gateway is being upgraded. In this state, you can only execute query operations and cannot execute other operations.
     *     - If the upgrade status is **successful**, the NAT gateway type has been upgraded.
     *     - If the upgrade status is **failed**, the NAT gateway type failed to be upgraded.
     * - The **UpdateNatGatewayNatType** operation does not support concurrent upgrades of the NAT gateway type for the same NAT gateway.
     * - Enhanced NAT gateways and standard NAT gateways have the same billing. The billable methods do not change during or after the upgrade procedure.
     * - Each resource upgrade procedure may take up to 5 minutes. During the upgrade, 1 to 2 transient connections that last a few seconds may occur. Use the reconnection mechanism to recover the service. Whether the reconnection mechanism is automatic or manual depends on the service itself.
     * - You can only upgrade a standard NAT gateway to an enhanced NAT gateway. You cannot downgrade an enhanced NAT gateway to a standard NAT gateway.
     * 
     * @param request the request parameters of UpdateNatGatewayNatType  UpdateNatGatewayNatTypeRequest
     * @return UpdateNatGatewayNatTypeResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <ul>
     * <li><strong>UpdateNetworkAclEntries</strong> is an asynchronous operation. After you send a request, the system returns a request ID. However, the network ACL rules are not yet updated. The update task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/116542.html">DescribeNetworkAclAttributes</a> to query the update status of the network ACL rules:<ul>
     * <li>If the network ACL rules are in the <strong>Modifying</strong> state, the rules are being updated.</li>
     * <li>If the network ACL rules are in the <strong>Available</strong> state, the rules are updated.</li>
     * </ul>
     * </li>
     * <li><strong>UpdateNetworkAclEntries</strong> does not support concurrent updates to the same network ACL rules.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateNetworkAclEntries  UpdateNetworkAclEntriesRequest
     * @return UpdateNetworkAclEntriesResponse
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
     * <b>description</b> :
     * <p>The <strong>UpdatePublicIpAddressPoolAttribute</strong> operation does not support concurrent modifications to the attributes of the same IP address pool.</p>
     * 
     * @param request the request parameters of UpdatePublicIpAddressPoolAttribute  UpdatePublicIpAddressPoolAttributeRequest
     * @return UpdatePublicIpAddressPoolAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>UpdateRouteTargetGroup</strong> is an asynchronous operation. After you call this operation, the system returns a request ID, but the route target group has not been updated yet. The update task is still running in the background. You can call ListRouteTargetGroup to query the update status of the route target group:<ul>
     * <li>If the route target group is in the <strong>Updating</strong> state, the route target group is being updated.</li>
     * <li>If the route target group is in the <strong>Available</strong>, <strong>Unavailable</strong>, <strong>Switched</strong>, or <strong>Abnormal</strong> state, the route target group has been updated.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateRouteTargetGroup  UpdateRouteTargetGroupRequest
     * @return UpdateRouteTargetGroupResponse
     */
    @Override
    public CompletableFuture<UpdateRouteTargetGroupResponse> updateRouteTargetGroup(UpdateRouteTargetGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateRouteTargetGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateRouteTargetGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateRouteTargetGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>The <strong>UpdateTrafficMirrorFilterAttribute</strong> operation does not support concurrent modifications to the configuration of the same traffic mirror filter.</p>
     * 
     * @param request the request parameters of UpdateTrafficMirrorFilterAttribute  UpdateTrafficMirrorFilterAttributeRequest
     * @return UpdateTrafficMirrorFilterAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>UpdateTrafficMirrorFilterRuleAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the node in the background. You can invoke <a href="https://help.aliyun.com/document_detail/261353.html">ListTrafficMirrorFilters</a> to query the status of an inbound or outbound rule of a traffic mirroring filter:<ul>
     * <li>If the inbound or outbound rule is in the <strong>Modifying</strong> state, the configuration of the rule is being modified.</li>
     * <li>If the inbound or outbound rule is in the <strong>Created</strong> state, the configuration of the rule is modified.</li>
     * </ul>
     * </li>
     * <li><strong>UpdateTrafficMirrorFilterRuleAttribute</strong> does not support concurrent modification of the same inbound or outbound rule of a traffic mirroring filter.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTrafficMirrorFilterRuleAttribute  UpdateTrafficMirrorFilterRuleAttributeRequest
     * @return UpdateTrafficMirrorFilterRuleAttributeResponse
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
     * <b>description</b> :
     * <ul>
     * <li><strong>UpdateTrafficMirrorSessionAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID. However, the configuration of the traffic mirror session is not yet modified. The modification task runs in the background. You can call <a href="https://help.aliyun.com/document_detail/261367.html">ListTrafficMirrorSessions</a> to query the modification status of the traffic mirror session:<ul>
     * <li>If the traffic mirror session is in the <strong>Modifying</strong> state, the configuration is being modified.</li>
     * <li>If the traffic mirror session is in the <strong>Created</strong> state, the configuration is modified.</li>
     * </ul>
     * </li>
     * <li><strong>UpdateTrafficMirrorSessionAttribute</strong> does not support concurrent modifications to the same traffic mirror session.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateTrafficMirrorSessionAttribute  UpdateTrafficMirrorSessionAttributeRequest
     * @return UpdateTrafficMirrorSessionAttributeResponse
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

    /**
     * @param request the request parameters of UpdateVirtualBorderBandwidth  UpdateVirtualBorderBandwidthRequest
     * @return UpdateVirtualBorderBandwidthResponse
     */
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

    /**
     * @param request the request parameters of UpdateVirtualPhysicalConnection  UpdateVirtualPhysicalConnectionRequest
     * @return UpdateVirtualPhysicalConnectionResponse
     */
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
     * <b>description</b> :
     * <ul>
     * <li><strong>UpdateVpcGatewayEndpointAttribute</strong> is an asynchronous operation. After you send a request, the system returns a <strong>RequestId</strong>, but the configuration of the gateway endpoint has not been updated yet. The update task is still running in the background. You can call <a href="https://help.aliyun.com/document_detail/311017.html">GetVpcGatewayEndpointAttribute</a> to query the status of the gateway endpoint.<ul>
     * <li>If the gateway endpoint is in the <strong>Updating</strong> state, the configuration is being updated.</li>
     * <li>If the gateway endpoint is in the <strong>Created</strong> state, the configuration has been updated.</li>
     * </ul>
     * </li>
     * <li><strong>UpdateVpcGatewayEndpointAttribute</strong> does not support concurrent updates to the same gateway endpoint.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateVpcGatewayEndpointAttribute  UpdateVpcGatewayEndpointAttributeRequest
     * @return UpdateVpcGatewayEndpointAttributeResponse
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
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have created a VPC NAT gateway instance. For more information, see <a href="https://help.aliyun.com/document_detail/2522320.html">CreateNatGateway</a>.</p>
     * 
     * @param request the request parameters of VpcDescribeVpcNatGatewayNetworkInterfaceQuota  VpcDescribeVpcNatGatewayNetworkInterfaceQuotaRequest
     * @return VpcDescribeVpcNatGatewayNetworkInterfaceQuotaResponse
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

    /**
     * @param request the request parameters of WithdrawVpcPublishedRouteEntries  WithdrawVpcPublishedRouteEntriesRequest
     * @return WithdrawVpcPublishedRouteEntriesResponse
     */
    @Override
    public CompletableFuture<WithdrawVpcPublishedRouteEntriesResponse> withdrawVpcPublishedRouteEntries(WithdrawVpcPublishedRouteEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("WithdrawVpcPublishedRouteEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(WithdrawVpcPublishedRouteEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<WithdrawVpcPublishedRouteEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
