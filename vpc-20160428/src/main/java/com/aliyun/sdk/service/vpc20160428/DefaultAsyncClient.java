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
     * <p>After you call this operation, the router interface enters the <strong>Activating</strong> state. After the router interface is activated, it enters the <strong>Active</strong> state.</p>
     * <blockquote>
     * <p> You cannot activate a router interface that has overdue payments.</p>
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
     * <p>  The <strong>ActiveFlowLog</strong> operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/87923.html">DescribeFlowLogs</a> operation to query the status of a flow log:
     *     *   If the flow log is in the <strong>Activating</strong> state, the flow log is being started.
     *     *   If the flow log is in the <strong>Active</strong> state, the flow log is started.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>ActiveFlowLog</strong> operation to start a flow log within the specified period of time.</li>
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
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>When you call this operation to associate an EIP with an Internet Shared Bandwidth instance, make sure that the EIP meets the following requirements:<ul>
     * <li>The EIP uses the pay-as-you-go billing method.</li>
     * <li>The EIP and the Internet Shared Bandwidth instance belong to the same region.</li>
     * <li>The line type of the EIPs is the same as that of the Internet Shared Bandwidth instance.</li>
     * </ul>
     * </li>
     * <li><strong>AddCommonBandwidthPackageIp</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/120309.html">DescribeCommonBandwidthPackages</a> operation to query the status of the operation.<ul>
     * <li>If the Internet Shared Bandwidth instance is in the <strong>BINDING</strong> state, the EIP is being associated with the Internet Shared Bandwidth instance. In this state, you can only query the Internet Shared Bandwidth instance and cannot perform other operations.</li>
     * <li>If the Internet Shared Bandwidth instance is in the <strong>BINDED</strong> state, the EIP is associated with the Internet Shared Bandwidth instance.</li>
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
     * <p>  When you call this operation to associate EIPs with an Internet Shared Bandwidth instance, make sure that the EIPs meet the following requirements:
     *     *   The EIPs use the pay-as-you-go billing method.
     *     *   The EIP and the Internet Shared Bandwidth instance belong to the same region.
     *     *   The line type of the EIPs is the same as that of the Internet Shared Bandwidth instance.</p>
     * <ul>
     * <li><strong>AddCommonBandwidthPackageIps</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="~~DescribeCommonBandwidthPackages~~">DescribeCommonBandwidthPackages</a> operation to query the status of the task.<ul>
     * <li>If the Internet Shared Bandwidth instance is in the <strong>BINDING</strong> state, the EIP is being associated with the Internet Shared Bandwidth instance. In this state, you can only query the Internet Shared Bandwidth instance and cannot perform other operations.</li>
     * <li>If the Internet Shared Bandwidth instance is in the <strong>BINDED</strong> state, the EIP is associated with the Internet Shared Bandwidth instance.</li>
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
     * <p>Before you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>The CIDR block and the IP address pool must belong to the same region.</li>
     * <li>The CIDR block and the IP address pool must use the same line type.</li>
     * <li><strong>AddPublicIpAddressPoolCidrBlock</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/429436.html">ListPublicIpAddressPoolCidrBlocks</a> operation to query the status of the task.<ul>
     * <li>If the CIDR block is in the <strong>Modifying</strong> state, the CIDR block is being added. In this state, you can only query the CIDR block and cannot perform other operations.</li>
     * <li>If the CIDR block is in the <strong>Created</strong> state, the CIDR block is added.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>AddPublicIpAddressPoolCidrBlock</strong> operation to add a CIDR block to an IP address pool within the specified period of time.</li>
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
     * <p>  <strong>AddSourcesToTrafficMirrorSession</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/261367.html">ListTrafficMirrorSessions</a> operation to query the status of the task.
     *     *   If the traffic mirror session is in the <strong>Modifying</strong> state, the traffic mirror source is being added to the traffic mirror session.
     *     *   If the traffic mirror session is in the <strong>Created</strong> state, the traffic mirror source is added to the traffic mirror session.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AddSourcesToTrafficMirrorSession</strong> operation to add a traffic mirror source to a traffic mirror session within the specified period of time.</li>
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
     * <p>Before you call this operation, make sure that you are familiar with the billing methods and pricing of EIPs. For more information, see <a href="https://help.aliyun.com/document_detail/122035.html">Billing overview</a>.
     * After you call this operation, the system randomly allocates an EIP that is in the <strong>Available</strong> state in the specified region. EIPs support only the ICMP, TCP, and UDP transport layer protocols. The IGMP and SCTP protocols are not supported.</p>
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
     * <b>description</b> :
     * <p><em>AllocateEipSegmentAddress</em>* is an asynchronous operation. After a request is sent, the system returns the ID of a contiguous EIP group and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/156063.html">DescribeEipSegment</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If the contiguous EIP group is in the <strong>Allocating</strong> state, the EIPs are being allocated. In this case, you can only perform the query operation and cannot perform other operations.</li>
     * <li>If the contiguous EIP group is in the <strong>Allocated</strong> state, the EIPs are allocated.</li>
     * </ul>
     * 
     * @param request the request parameters of AllocateEipSegmentAddress  AllocateEipSegmentAddressRequest
     * @return AllocateEipSegmentAddressResponse
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
     * <p>  Before you call this operation, make sure that an ECS instance that supports IPv6 is created in a VPC that has an IPv6 CIDR block. For more information, see <a href="https://help.aliyun.com/document_detail/100540.html">Create a VPC with an IPv6 CIDR block</a>.</p>
     * <ul>
     * <li>You cannot repeatedly call <strong>AllocateIpv6InternetBandwidth</strong> within the specified period of time.</li>
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
     * <h1><a href="#"></a></h1>
     * <p>The following section describes how to allocate an IPv6 CIDR block to a virtual private cloud (VPC):</p>
     * <ol>
     * <li>Call the AllocateVpcIpv6Cidr operation to reserve the IPv6 CIDR block.</li>
     * <li>To allocate an IPv6 CIDR block to an existing VPC, call the <a href="https://help.aliyun.com/document_detail/146745.html">AssociateVpcCidrBlock</a> operation. Set <strong>RegionId</strong>, <strong>VpcId</strong>, and <strong>IPv6CidrBlock</strong> to the IPv6 CIDR bock, and set <strong>IpVersion</strong> to <strong>ipv6</strong>. To allocate an IPv6 CIDR block when you create a VPC, call the <a href="https://help.aliyun.com/document_detail/35737.html">CreateVpc</a> operation. Set <strong>RegionId</strong> and <strong>Ipv6CidrBlock</strong> to the IPv6 CIDR block, and set <strong>EnableIpv6</strong> to <strong>true</strong>.</li>
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
     * <p>  You can associate an EIP with an Elastic Compute Service (ECS) instance, a Classic Load Balancer (CLB) instance, a secondary elastic network interface (ENI), a NAT gateway, or a high-availability virtual IP address (HAVIP) in the same region. The ECS instance and CLB instance must be deployed in a virtual private cloud (VPC).</p>
     * <ul>
     * <li><strong>AssociateEipAddress</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/120193.html">DescribeEipAddresses</a> operation to query the status of the task.<ul>
     * <li>If the EIP is in the <strong>Associating</strong> state, the EIP is being associated. In this state, you can only query the EIP and cannot perform other operations.</li>
     * <li>If the EIP is in the <strong>InUse</strong> state, the EIP is associated.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>AssociateEipAddress</strong> operation to associate an EIP with multiple instances at a time.</li>
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
     * <p>  You can call the <strong>AssociateEipAddressBatch</strong> operation to associate EIPs with an instance in the same region. The instance must be a NAT gateway or a secondary elastic network interface (ENI). For more information about how to associate EIPs with other instances, see <a href="https://help.aliyun.com/document_detail/120195.html">AssociateEipAddress</a>.</p>
     * <ul>
     * <li><strong>AssociateEipAddressBatch</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/120193.html">DescribeEipAddresses</a> operation to query the status of the task.<ul>
     * <li>If the EIP is in the <strong>Associating</strong> state, the EIP is being associated. You can only query the EIP and cannot perform other operations.</li>
     * <li>If the EIP is in the <strong>InUse</strong> state, the EIP is associated.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>AssociateEipAddressBatch</strong> operation to associate an EIP with multiple instances at a time.</li>
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
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>An HAVIP immediately takes effect after it is associated. You do not need to restart the ECS instance. However, you must associate the HAVIP with the ENI of the ECS instance.</li>
     * <li>The HAVIP and ECS instance must belong to the same vSwitch.</li>
     * <li>You can associate an HAVIP with at most two ECS instances.</li>
     * <li>The ECS instance must be in the <strong>Running</strong> or <strong>Stopped</strong> state.</li>
     * <li>The HAVIP must be in the <strong>Available</strong> or <strong>InUse</strong> state.</li>
     * <li>The <strong>AssociateHaVip</strong> operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/114611.html">DescribeHaVips</a> operation to query the status of an HAVIP:<ul>
     * <li>If the HAVIP is in the <strong>Associating</strong> state, the HAVIP is being associated.</li>
     * <li>If the HAVIP is in the <strong>InUse</strong> state, the HAVIP is associated.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>AssociateHaVip</strong> operation to associate an HAVIP within the specified period of time.</li>
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
     * <h2><a href="#"></a>Description</h2>
     * <ul>
     * <li><strong>AssociateNetworkAcl</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/116542.html">DescribeNetworkAclAttributes</a> operation to query the status of the task.<ul>
     * <li>If the network ACL is in the <strong>BINDING</strong> state, the network ACL is being associated.</li>
     * <li>If the network ACL is in the <strong>BINDED</strong> state, the network ACL is associated.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>AssociateNetworkAcl</strong> operation to associate a network ACL within the specified period of time.</li>
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
     * <p><em>AssociateRouteTable</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> operation to query the status of the task:</p>
     * <ul>
     * <li>If the vSwitch is in the <strong>Pending</strong> state, the route table is being associated with the vSwitch.</li>
     * <li>If the vSwitch is in the <strong>Available</strong> state, the route table is associated with the vSwitch.</li>
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
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>The gateway endpoint to be associated with the route table cannot be in one of the following states: <strong>Creating</strong>, <strong>Modifying</strong>, <strong>Associating</strong>, <strong>Dissociating</strong>, or <strong>Deleting</strong>.</li>
     * <li>The route table cannot be in one of the following states: <strong>Creating</strong>, <strong>Modifying</strong>, <strong>Associating</strong>, <strong>Dissociating</strong>, or <strong>Deleting</strong>.</li>
     * <li>The gateway endpoint and route table must belong to the same virtual private cloud (VPC).</li>
     * <li>The route table cannot be shared.</li>
     * <li>You cannot associate a gateway endpoint with a virtual border router (VBR) route table.</li>
     * <li>You can associate a gateway endpoint with at most 20 route tables at a time.</li>
     * <li><strong>AssociateRouteTablesWithVpcGatewayEndpoint</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/311017.html">GetVpcGatewayEndpointAttribute</a> operation to query whether a route table is associated with a gateway endpoint.<ul>
     * <li>If the <strong>Associating</strong> status is returned, the route table is being associated with the gateway endpoint.</li>
     * <li>If the <strong>Created</strong> status is returned, the route table is associated with the gateway endpoint.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>AssociateRouteTablesWithVpcGatewayEndpoint</strong> operation within a specific period of time.</li>
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
     * <h2><a href="#"></a></h2>
     * <ul>
     * <li>Take note of the following limits:<ul>
     * <li>Each VPC can contain up to five secondary IPv4 CIDR blocks.</li>
     * <li>Each VPC can contain up to five secondary IPv6 CIDR blocks.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>AssociateVpcCidrBlock</strong> operation to add secondary CIDR blocks to a VPC within the specified period of time.</li>
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
     * <p>Before you associate a VPN gateway with an SSL certificate, take note of the following items:</p>
     * <ul>
     * <li>You can associate only VPN gateways of the ShangMi (SM) type with SSL certificates. You need to associate a VPN gateway of the SM type with two SSL certificates, one as the encryption certificate and the other as the signature certificate.</li>
     * <li>The SSL certificates must use the SM algorithm.</li>
     * <li>You cannot specify one SSL certificate as both the encryption certificate and signature certificate for one VPN gateway.</li>
     * <li><strong>AssociateVpnGatewayWithCertificate</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> operation to query the status of the task.<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the SSL certificate is being associated.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the SSL certificate is being associated.</li>
     * </ul>
     * </li>
     * <li>You cannot call <strong>AssociateVpnGatewayWithCertificate</strong> within a specific period of time.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Make sure that you have two SSL certificates that use the SM algorithm in the Certificate Management Service console. For more information about SSL certificates, see <a href="https://help.aliyun.com/document_detail/28535.html">What is Certificate Management Service?</a>.</p>
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
     * <p>  The <strong>AttachDhcpOptionsSetToVpc</strong> operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> operation to query the status of a DHCP options set:
     *     *   If the DHCP options set is in the <strong>Pending</strong> state, the DHCP options set is being associated.
     *     *   If the DHCP options set is in the <strong>InUse</strong> state, the DHCP options set is associated.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>AttachDhcpOptionsSetToVpc</strong> operation to associate DHCP options sets with a VPC within the specified period of time.</li>
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
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>After this operation is performed, the maximum bandwidth of the EIP equals that of the Internet Shared Bandwidth instance.</li>
     * <li>You cannot repeatedly call the <strong>CancelCommonBandwidthPackageIpBandwidth</strong> operation within a specific time period.</li>
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
     * <p>You can cancel only an Express Connect circuit that is in the <strong>Initial</strong>, <strong>Approved</strong>, <strong>Allocated</strong>, or <strong>Confirmed</strong> state.</p>
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
     * <h2><a href="#"></a></h2>
     * <p>You cannot repeatedly call the <strong>ChangeResourceGroup</strong> operation to modify the resource group of the same Express Connect circuit.</p>
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
     * <p>After you call this operation, the router interface enters the <strong>Connecting</strong> state. When the connection is established, it enters the <strong>Active</strong> state.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Only an initiator router interface in the <strong>Idle</strong> state can initiate a connection.</li>
     * <li>You can create only one pair of connected router interfaces between two routers.</li>
     * <li>You cannot initiate a connection if your Alibaba Cloud account has a router interface with overdue payments.</li>
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
     * <p>Before you convert a NAT service plan to an Internet Shared Bandwidth instance, take note of the following limits:</p>
     * <ul>
     * <li>You are not charged for the conversion.</li>
     * <li>When you convert a NAT service plan to an Internet Shared Bandwidth instance, you can continue to use the SNAT and DNAT features of the NAT gateway, and your workloads are not affected. However, we recommend that you convert your NAT service plan during off-peak hours.</li>
     * <li>After the NAT service plan is converted to an Internet Shared Bandwidth instance, the public IP addresses in the NAT service plan are converted to elastic IP addresses (EIPs). The maximum bandwidth and billing method of the Internet Shared Bandwidth instance are the same as those of the NAT service plan.</li>
     * </ul>
     * 
     * @param request the request parameters of ConvertBandwidthPackage  ConvertBandwidthPackageRequest
     * @return ConvertBandwidthPackageResponse
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
     * <b>description</b> :
     * <h2><a href="#"></a>Description</h2>
     * <ul>
     * <li><strong>CopyNetworkAclEntries</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/116542.html">DescribeNetworkAclAttributes</a> operation to query the status of the task.<ul>
     * <li>If the network ACL is in the <strong>Modifying</strong> state, the rules of the network ACL are being copied.</li>
     * <li>If the network ACL is in the <strong>Available</strong> state, the rules of the network ACL are copied.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>CopyNetworkAclEntries</strong> operation within the specified period of time.</li>
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
     * <p>You can connect a VBR to a data center through BGP. Each BGP group is associated with a VBR. You can add a BGP peer that needs to communicate with a VBR to a BGP group and advertise the BGP network in the VBR.
     * BGP groups are used to simplify BGP configurations. You can add BGP peers that use the same configurations to one BGP group. Before you start, you must create a BGP group with the requested autonomous system number (ASN).
     * When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>You can specify only the data center that is connected to the VBR through an Express Connect circuit as a BGP peer.</li>
     * <li>VBRs support only BGP-4.</li>
     * <li>You can create at most eight BGP peers for each VBR.</li>
     * <li>Each BGP peer supports at most 110 dynamic routes.</li>
     * <li>The ASN of Alibaba Cloud is 45104. You can specify a 2-byte or 4-byte ASN for the data center.</li>
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
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>The first IP address and last three IP addresses of a vSwitch CIDR block are reserved. For example, if the CIDR block of a vSwitch is 192.168.1.0/24, the IP addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved.</li>
     * <li>The number of instances in the default vSwitch cannot exceed the remaining number of instances supported by the VPC (15,000 minus the number of existing instances).</li>
     * <li>Default vSwitches do not support multicasting or broadcasting.</li>
     * <li>After you create a default vSwitch, you cannot modify its CIDR block.</li>
     * <li><strong>CreateDefaultVSwitch</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> operation to query the status of a default vSwitch:<ul>
     * <li>If a default vSwitch is in the <strong>Pending</strong> state, it is being configured.</li>
     * <li>If a default vSwitch is in the <strong>Available</strong> state, it is available.</li>
     * </ul>
     * </li>
     * <li>If a default vSwitch already exists in a region, you cannot call this operation to create a default vSwitch in this region.</li>
     * <li>Before you create a default vSwitch, make sure that a default VPC is created. You can call the <a href="https://help.aliyun.com/document_detail/609152.html">CreateDefaultVpc</a> operation to create a default VPC.</li>
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
     * <h2>Usage notes</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>After you create a default VPC, you cannot change its CIDR block. However, you can add secondary IPv4 CIDR blocks to it.</li>
     * <li>In each default VPC, cloud services can use a maximum of 60,000 private IP addresses. You cannot increase the quota.</li>
     * <li>After you create a default VPC, a vRouter and a route table are automatically created for the VPC.</li>
     * <li>At most three user CIDR blocks can be added to a VPC. If a user CIDR block includes another user CIDR block, the one with the shorter subnet mask takes effect. For example, if 10.0.0.0/8 and 10.1.0.0/16 are specified, only 10.0.0.0/8 takes effect.</li>
     * <li><strong>CreateDefaultVpc</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> operation to query the status of the task:<ul>
     * <li>If the default VPC is in the <strong>Pending</strong> state, the VPC is being configured.</li>
     * <li>If the default VPC is in the <strong>Available</strong> state, the VPC is available.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>CreateDefaultVpc</strong> operation within a specific time period.</li>
     * <li>You can create only one default VPC in each region.</li>
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
     * <p>  <strong>CreateDhcpOptionsSet</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/448820.html">GetDhcpOptionsSet</a> to query the status of the task.
     *     *   If the vSwitch is in the <strong>Pending</strong> state, the DHCP options set is being configured.
     *     *   If the vSwitch is in the <strong>Available</strong> state, the DHCP options set is available.</p>
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
     * <p>You cannot create a failover test in the following scenarios:</p>
     * <ul>
     * <li>You have created a failover test in the region and its type is StartNow.</li>
     * <li>The Express Connect circuit or hosted connection has pending orders or overdue payments.</li>
     * <li>A failover test is already performed on the Express Connect circuit or hosted connection.</li>
     * <li>More than one hosted connection is created over the Express Connect circuit.</li>
     * <li>More than one cross-account VBR is created on the Express Connect circuit.</li>
     * <li>No VBR is associated with the hosted connection.</li>
     * <li>The VLAN ID of the hosted connection is set to 0.</li>
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
     * <p><em>CreateFlowLog</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/87923.html">DescribeFlowLogs</a> operation to query the status of the flow log.</p>
     * <ul>
     * <li>If the flow log is in the <strong>Activating</strong> state, the flow log is being created.</li>
     * <li>If the flow log is in the <strong>Active</strong> state, the flow log is created and started.</li>
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
     * <h2><a href="#"></a></h2>
     * <p>Each DNAT entry consists of the following parameters: <strong>ExternalIp</strong>, <strong>ExternalPort</strong>, <strong>IpProtocol</strong>, <strong>InternalIp</strong>, and <strong>InternalPort</strong>. After you add a DNAT entry, the NAT gateway forwards packets over the specified protocol from <strong>ExternalIp:ExternalPort</strong> to <strong>InternalIp:InternalPort</strong> and sends responses back through the same route.
     * When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li><strong>CreateForwardEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/36053.html">DescribeForwardTableEntries</a> operation to query the status of the task.<ul>
     * <li>If the DNAT entry is in the <strong>Pending</strong> state, the system is adding the DNAT entry. You can only query the DNAT entry, but cannot perform other operations.</li>
     * <li>If the DNAT entry is in the <strong>Available</strong> state, the DNAT entry is added.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>CreateForwardEntry</strong> operation to add a DNAT entry within a specific period of time.</li>
     * <li>All combinations of <strong>ExternalIp</strong>, <strong>ExternalPort</strong>, and <strong>IpProtocol</strong> used in DNAT entries must be unique. You cannot distribute requests to more than one Elastic Compute Service (ECS) instance if these requests are initiated from the same source IP address, received on the same port, and use the same protocol.</li>
     * <li>The combinations of <strong>IpProtocol</strong>, <strong>InternalIp</strong>, and <strong>InternalPort</strong> must be unique.</li>
     * <li>If one or more DNAT entries in the DNAT table are in the <strong>Pending</strong> or <strong>Modifying</strong> state, you cannot add DNAT entries to the DNAT table.</li>
     * <li>You can add at most 100 DNAT entries to a DNAT table.</li>
     * <li>For an elastic IP address (EIP) used by an Internet NAT gateway or a NAT IP address used by a Virtual Private Cloud (VPC) NAT gateway, take note of the following limit: If the IP address has IP mapping enabled and is specified in a DNAT entry, the IP address cannot be used by another DNAT or SNAT entry.</li>
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
     * <p>  <strong>CreateFullNatEntry</strong> is an asynchronous operation. After you send a request to call this operation, the system returns a FULLNAT entry and the FULLNAT entry is being added in the backend. You can call the <a href="https://help.aliyun.com/document_detail/348779.html">ListFullNatEntries</a> operation to query the status of a FULLNAT entry.
     *     *   If the FULLNAT entry is in the <strong>Creating</strong> state, the system is adding the FULLNAT entry. You can only query the status of the FULLNAT entry, but cannot perform other operations.
     *     *   If the FULLNAT entry is in the <strong>Available</strong> state, the FULLNAT entry is added.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>CreateFullNatEntry</strong> operation for the same VPN gateway within the specified period of time.</li>
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
     * @deprecated OpenAPI CreateGlobalAccelerationInstance is deprecated  * @description ## Usage notes
     * You can call this operation to create only pay-as-you-go GA instances.
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
     * <p><em>CreateHaVip</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/114611.html">DescribeHaVips</a> operation to query the status of the task:</p>
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
     * <p>  Before you create an IPsec server, you must create a VPN gateway and enable the SSL-VPN feature for the VPN gateway. For more information, see <a href="https://help.aliyun.com/document_detail/2794049.html">CreateVpnGateway</a>.</p>
     * <ul>
     * <li>Before you create an IPsec server, make sure that no IPsec-VPN connection exists on the VPN gateway. For more information, see <a href="https://help.aliyun.com/document_detail/2526948.html">DeleteVpnConnection</a>.</li>
     * <li><strong>CreateIpsecServer</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> to query the status of the task.<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the IPsec server is being created.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the IPsec server is created.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call <strong>CreateIpsecServer</strong> within the specified period of time.</li>
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
     * <p>  <strong>CreateIpv4Gateway</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/407670.html">GetIpv4GatewayAttribute</a> operation to query the status of an IPv4 gateway:
     *     *   If the IPv4 gateway is in the <strong>Creating</strong> state, the IPv4 gateway is being created.
     *     *   If the IPv4 gateway is in the <strong>Created</strong> state, the IPv4 gateway is created.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>CreateIpv4Gateway</strong> operation to create IPv4 gateways in a virtual private cloud (VPC) within the specified period of time.</li>
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
     * <p>  <strong>CreateIpv6EgressOnlyRule</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and creates the rule in the background. You can call the <a href="https://help.aliyun.com/document_detail/102208.html">DescribeIpv6EgressOnlyRules</a> operation to query the status of the task.
     *     *   If the egress-only rule is in the <strong>Creating</strong> state, the egress-only rule is being created.
     *     *   If the egress-only rule is in the <strong>Created</strong> state, the egress-only rule is created.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>CreateIpv6EgressOnlyRule</strong> operation to add egress-only rules for an IPv6 address within the specified period of time.</li>
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
     * <p>  <strong>CreateIpv6Gateway</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/102226.html">DescribeIpv6GatewayAttribute</a> operation to query the status of the task.
     *     *   If the IPv6 gateway is in the <strong>Creating</strong> state, the IPv6 gateway is being created.
     *     *   If the IPv6 gateway is in the <strong>Created</strong> state, the IPv6 gateway is created.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>CreateIpv6Gateway</strong> operation within a specific time period.</li>
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
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>When you create an enhanced NAT gateway for the first time, the system automatically creates the service-linked role AliyunServiceRoleForNatgw. Then, the system attaches the permission policy AliyunServiceRolePolicyForNatgw to the role. This allows the NAT gateway to access other resources on Alibaba Cloud. For more information, see <a href="https://help.aliyun.com/document_detail/174251.html">Service-linked roles</a>.</li>
     * <li>After you create an enhanced Internet NAT gateway, a route entry is automatically added to the route table of the VPC. The destination CIDR block of the route entry is 0.0.0.0/0 and the next hop is the NAT gateway. This ensures that traffic is routed to the NAT gateway.</li>
     * <li><strong>CreateNatGateway</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/36054.html">DescribeNatGateways</a> operation to query the status of the task.<ul>
     * <li>If a NAT gateway is in the <strong>Creating</strong> state, the NAT gateway is being created. In this case, you can query the NAT gateway but cannot perform other operations.</li>
     * <li>If a NAT gateway is in the <strong>Available</strong> state, the NAT gateway is created.
     * It takes 1 to 3 minutes to create a NAT gateway.</li>
     * </ul>
     * </li>
     * </ul>
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
     * <h2><a href="#"></a></h2>
     * <p><strong>CreateNatIp</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/287000.html">ListNatIps</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If a NAT IP address is in the <strong>Creating</strong> state, the NAT IP address is being created. In this case, you can only query the NAT IP address and cannot perform other operations.</li>
     * <li>If a NAT IP address is in the <strong>Available</strong> state, the NAT IP address is created.
     * You cannot repeatedly call the <strong>CreateNatIp</strong> operation to create a NAT IP address within a specific period of time.</li>
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
     * <h2><a href="#"></a>Description</h2>
     * <p>You cannot repeatedly call the <strong>CreateNatIpCidr</strong> operation to create a NAT CIDR block within the specified period of time.</p>
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
     * <p>You can apply for a dedicated Express Connect circuit for yourself or create a hosted connection for a tenant. After your application is approved, the Express Connect circuit changes to the <strong>Initial</strong> state. You can contact the connectivity provider to start construction.
     * When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>If your Alibaba Cloud account has more than five Express Connect circuits that are not in the <strong>Enabled</strong> state, you cannot apply for another Express Connect circuit.</li>
     * <li>If your Alibaba Cloud account has an Express Connect circuit with overdue payments, you cannot apply for another Express Connect circuit.</li>
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
     * <p> You can call this operation only when the Express Connect circuit is in the <strong>Complete</strong> state.</p>
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
     * <p>By default, the IP address pool feature is unavailable. You can apply for the privilege to use the <strong>IP address pool feature</strong> in the Quota Center console. For more information, see the &quot;Request a quota increase in the Quota Center console&quot; section in the <a href="https://help.aliyun.com/document_detail/108213.html">Manage EIP quotas</a> topic.</p>
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
     * <h2><a href="#"></a>References</h2>
     * <ul>
     * <li><strong>CreateRouteEntries</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/138148.html">DescribeRouteEntryList</a> operation to query the status of the task.<ul>
     * <li>If the route entry is in the <strong>Creating</strong> state, the route entry is being created.</li>
     * <li>If the route entry is in the <strong>Created</strong> state, the route entry is created.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>CreateRouteEntries</strong> operation to create the same route entry within the specified period of time.
     * <strong>When you call this operation to add custom route entries to the route table of a vRouter, take note of the following items:</strong></li>
     * <li>A route table can contain up to 200 custom route entries.</li>
     * <li>The destination CIDR block (<strong>DstCidrBlock</strong>) of a custom route entry cannot be the same as or overlap with the CIDR block of a vSwitch in the VPC.</li>
     * <li>The destination CIDR block (<strong>DstCidrBlock</strong>) of a custom route entry cannot be 100.64.0.0/10 or its subnets.</li>
     * <li>The destination CIDR blocks (<strong>DstCidrBlock</strong>) of route entries in the same route table must be unique.</li>
     * <li>If you do not include the mask length when you specify the destination CIDR block (<strong>DstCidrBlock</strong>), the destination CIDR block is considered a host IP address whose mask length is 32 bits.</li>
     * <li>Multiple custom route entries can point to the same next hop (<strong>NextHop</strong>).</li>
     * <li>The next hop (<strong>NextHop</strong>) of a custom route entry must belong to the same VPC as the route table.</li>
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
     * <p>  <strong>CreateRouteEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/138148.html">DescribeRouteEntryList</a> operation to query the status of the task:
     *     *   If a route is in the <strong>Creating</strong> state, the route is being added.
     *     *   If a route is in the <strong>Created</strong> state, the route is added.</p>
     * <ul>
     * <li>You cannot repeatedly call <strong>CreateRouteEntry</strong> within a specific period of time.
     * <strong>When you call this operation to add a custom route entry to the route table of a vRouter, take note of the following limits:</strong><blockquote>
     * <p> When you add a route entry from a prefix list, the quota usage is calculated by adding the number of existing route entries and the maximum number of route entries of the prefix list.</p>
     * </blockquote>
     * </li>
     * <li>A route table can contain up to 200 custom route entries.</li>
     * <li>The destination CIDR block (<strong>DestinationCidrBlock</strong>) of a custom route entry cannot be the same as or be a subset of the CIDR block of a vSwitch in the virtual private cloud (VPC). The destination CIDR block can contain the CIDR block of a vSwitch.</li>
     * <li>The destination CIDR block (<strong>DestinationCidrBlock</strong>) of a custom route entry cannot be 100.64.0.0/10 or a subset of it.</li>
     * <li>The destination CIDR blocks (<strong>DestinationCidrBlock</strong>) of route entries in the same route table must be unique.</li>
     * <li>If you do not include the mask length when you specify the destination CIDR block (<strong>DestinationCidrBlock</strong>), the destination CIDR block is considered a host IP address whose mask length is 32 bits.</li>
     * <li>Multiple custom route entries can point to the same next hop (<strong>NextHopId</strong>).</li>
     * <li>The next hop (<strong>NextHopId</strong>) of a custom route entry must in the same VPC as the route table.</li>
     * <li>Equal-cost multi-path (ECMP) routing can be configured by specifying the <strong>NextHopList</strong> parameter.<ul>
     * <li>When you add non-ECMP route entries, you must specify <strong>DestinationCidrBlock</strong>, <strong>NextHopType</strong>, and <strong>NextHopId</strong>, and you must not specify <strong>NextHopList</strong>.</li>
     * <li>When you add route entries for ECMP routing, you must specify <strong>DestinationCidrBlock</strong> and <strong>NextHopList</strong>, and you must not specify <strong>NextHopType</strong> or <strong>NextHopId</strong>.
     * <strong>When you call this operation to add a custom route entry to the route table of a VBR, take note of the following limits:</strong></li>
     * </ul>
     * </li>
     * <li>A route table can contain up to 200 custom route entries.</li>
     * <li><strong>NextHopList</strong> is not supported.</li>
     * <li>The destination CIDR block (<strong>DestinationCidrBlock</strong>) of a custom route entry cannot be 100.64.0.0/10 or a subset of it.</li>
     * <li>The destination CIDR blocks (<strong>DestinationCidrBlock</strong>) of route entries in the same route table must be unique.</li>
     * <li>If you do not include the mask length when you specify the destination CIDR block (<strong>DestinationCidrBlock</strong>), the destination CIDR block is considered a host IP address whose mask length is 32 bits.</li>
     * <li>Multiple custom route entries can point to the same next hop (<strong>NextHopId</strong>).</li>
     * <li>The next hop (<strong>NextHopId</strong>) of a custom route entry must be a router interface associated with the VBR.</li>
     * <li>You can add route entries only when the VBR is in the <strong>Active</strong> state, and the Express Connect circuit associated with the VBR is in the <strong>Enabled</strong> state and is not locked due to overdue payments.</li>
     * <li>Only non-ECMP route entries are supported. When you add non-ECMP route entries, you must specify <strong>DestinationCidrBlock</strong>, <strong>NextHopType</strong>, and <strong>NextHopId</strong>, and you cannot specify <strong>NextHopList</strong>.</li>
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
     * <p>  <strong>CreateRouteTable</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the operation in the background. You can call the <a href="https://help.aliyun.com/document_detail/87602.html">DescribeRouteTableList</a> operation to query the status of the task.
     *     *   If the custom route table is in the <strong>Creating</strong> state, the custom route table is being created.
     *     *   If the custom route table is in the <strong>Created</strong> state, the custom route table is created.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>CreateRouteTable</strong> operation within the specified period of time.</li>
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
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>You can create only one pair of interfaces to be connected between two routers.</li>
     * <li>You can create a maximum of five router interfaces for a router.</li>
     * <li>If your Alibaba Cloud account has a router interface with overdue payments, you cannot create new router interfaces.</li>
     * <li>Each destination CIDR block of route entries in the same route table must be unique.</li>
     * <li>A virtual border router (VBR) can serve only as a requester. The VBR must be in the Activated state.</li>
     * <li>You can call this operation to create subscription and pay-as-you-go router interfaces.</li>
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
     * <p>You can call this operation to add SNAT entries to Internet NAT gateways and Virtual Private Cloud (VPC) NAT gateways. In this topic, a <strong>NAT</strong> gateway refers to both gateway types.
     * Before you call this operation, take note of the following limits:</p>
     * <ul>
     * <li><strong>CreateSnatEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/42677.html">DescribeSnatTableEntries</a> operation to query the status of the task.<ul>
     * <li>If the SNAT entry is in the <strong>Pending</strong> state, the system is adding the SNAT entry. You can only query the status of the SNAT entry, and cannot perform other operations.</li>
     * <li>If the SNAT entry is in the <strong>Available</strong> state, the SNAT entry is added.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>CreateSnatEntry</strong> operation to add an SNAT entry to an SNAT table within the specified period of time.</li>
     * <li>The vSwitch and Elastic Compute Service (ECS) instance specified in an SNAT entry must be created in the VPC where the NAT gateway is deployed.</li>
     * <li>Each vSwitch or ECS instance can be specified in only one SNAT entry.</li>
     * <li>If a high-availability virtual IP address (HAVIP) exists in a vSwitch, you cannot create SNAT entries.</li>
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
     * <p>Before you create an SSL client certificate, make sure that an SSL server is created on the VPN gateway. For more information, see <a href="https://help.aliyun.com/document_detail/2794075.html">CreateSslVpnServer</a>.</p>
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
     * <p>  <strong>CreateSslVpnServer</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> operation to query the status of the task.
     *     *   If the VPN gateway is in the <strong>updating</strong> state, the SSL server is being created.
     *     *   If the VPN gateway is in the <strong>active</strong> state, the SSL server is created.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>CreateSslVpnServer</strong> operation within the specified period of time.</li>
     * </ul>
     * <h3><a href="#"></a>Prerequisite</h3>
     * <ul>
     * <li>A VPN gateway is created, and the SSL-VPN feature is enabled for the VPN gateway. For more information, see <a href="https://help.aliyun.com/document_detail/2794049.html">CreateVpnGateway</a>.</li>
     * <li>If you want to enable two-factor authentication for the SSL server, make sure that the VPN gateway supports two-factor authentication. You may need to upgrade the VPN gateway. For more information, see <a href="https://help.aliyun.com/document_detail/2785320.html">Two-factor authentication supports IDaaS EIAM 2.0</a>.</li>
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
     * <p><em>CreateTrafficMirrorFilter</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/261353.html">ListTrafficMirrorFilters</a> operation to query the status of the task.</p>
     * <ul>
     * <li>If the filter is in the <strong>Creating</strong> state, the filter is being created.</li>
     * <li>If the filter is in the <strong>Created</strong> state, the filter is created.</li>
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
     * <p>  <strong>CreateTrafficMirrorFilterRules</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/261353.html">ListTrafficMirrorFilters</a> to query the status of the task.
     *     *   If the inbound or outbound rule is in the <strong>Creating</strong> state, the rule is being created.
     *     *   If the inbound or outbound rule is in the <strong>Created</strong> state, the rule is created.</p>
     * <ul>
     * <li>You cannot call <strong>CreateTrafficMirrorFilterRules</strong> within the specified period of time.</li>
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
     * <p><em>CreateTrafficMirrorSession</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/261367.html">ListTrafficMirrorSessions</a> to query the status of the task.</p>
     * <ul>
     * <li>If the traffic mirror session is in the <strong>Creating</strong> state, it is being created.</li>
     * <li>If the traffic mirror session is in the <strong>Created</strong> state, it is created.</li>
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
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>You can create at most 150 vSwitches in a virtual private cloud (VPC).</li>
     * <li>The first IP address and last three IP addresses of each vSwitch CIDR block are reserved. For example, if the CIDR block of a vSwitch is 192.168.1.0/24, the IP addresses 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255 are reserved.</li>
     * <li>The number of instances in a vSwitch cannot exceed the remaining capacity of the VPC. The remaining capacity is the difference between 15,000 and the current number of instances.</li>
     * <li>Each instance can belong to only one vSwitch.</li>
     * <li>vSwitches do not support multicast or broadcast.</li>
     * <li>After you create a vSwitch, you cannot modify its CIDR block.</li>
     * <li><strong>CreateVSwitch</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> to query the status of the task.<ul>
     * <li>If the vSwitch is in the <strong>Pending</strong> state, the vSwitch is being configured.</li>
     * <li>If the vSwitch is in the <strong>Available</strong> state, the vSwitch is available.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>CreateVSwitch</strong> operation to create a vSwitch in a VPC within the specified period of time.</li>
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
     * <h2><a href="#"></a>Description</h2>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>You can create at most 10 reserved IPv4 CIDR blocks and 10 reserved IPv6 CIDR blocks for each vSwitch in a virtual private cloud (VPC).</li>
     * <li>After you create a reserved CIDR block for a vSwitch, the CIDR block cannot contain the IP address of the subnet gateway of the VPC to which the vSwitch belongs.</li>
     * <li><strong>CreateVSwitchCidrReservation</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/610155.html">ListVSwitchCidrReservations</a> to query the status of the task:<ul>
     * <li>If the vSwitch is in the <strong>Assigning</strong> state, the reserved CIDR block is being created.</li>
     * <li>If the vSwitch is in the <strong>Assigned</strong> state, the reserved CIDR block is created.</li>
     * </ul>
     * </li>
     * <li>When you create a reserved IPv4 CIDR block for a vSwitch, the first IP address and the last three IP addresses of the vSwitch are reserved by the system. The four IP addresses will not be allocated.</li>
     * <li>When you create a reserved IPv6 CIDR block for a vSwitch, the first IP address and the last nine IP addresses of the vSwitch are reserved by the system. The 10 IP addresses will not be allocated. For example, if you create a reserved IPv4 CIDR block for a vSwitch whose CIDR block is 192.168.1.0/24, the reserved CIDR block cannot contain the following IP addresses: 192.168.1.0, 192.168.1.253, 192.168.1.254, and 192.168.1.255.</li>
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
     * <p>  The IPsec-VPN connection must be associated with a transit router. For more information, see <a href="https://help.aliyun.com/document_detail/468249.html">CreateTransitRouterVpnAttachment</a>.</p>
     * <ul>
     * <li>You cannot create a destination-based route whose destination CIDR block is 0.0.0.0/0.</li>
     * <li>Do not add a destination-based route whose destination CIDR block is 100.64.0.0/10, or a CIDR block that contains 100.64.0.0/10 or belongs to 100.64.0.0/10. Such a route will make the console fail to display the status of the IPsec-VPN connection or cause IPsec negotiation failures.</li>
     * <li><strong>CreateVcoRouteEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/53046.html">DescribeVpnConnection</a> to query the status of the task.<ul>
     * <li>If the IPsec-VPN connection is in the <strong>updating</strong> state, the destination-based route is being created.</li>
     * <li>If the IPsec-VPN connection is in the <strong>attached</strong> state, the destination-based route is created.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call <strong>CreateVcoRouteEntry</strong> within the specified period of time.</li>
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
     * <p>After you create a VBR, the VBR is in the <strong>active</strong> state.</p>
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
     * <h1><a href="#"></a>Description</h1>
     * <p>Before you call this operation, we recommend that you learn about the workflow for creating a hosted connection and the environment requirements. For more information, see <a href="https://help.aliyun.com/document_detail/146571.html">Overview of hosted connections</a> and <a href="https://help.aliyun.com/document_detail/155987.html">Operations performed by Express Connect partners</a>.</p>
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
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can specify only one CIDR block for each VPC.</li>
     * <li>After you create a VPC, you cannot change its CIDR block. However, you can add secondary IPv4 CIDR blocks to the VPC.</li>
     * <li>In each VPC, cloud services can use a maximum of 60,000 private IP addresses. You cannot increase the quota.</li>
     * <li>After you create a VPC, a vRouter and a route table are automatically created.</li>
     * <li>At most three user CIDR blocks can be added to a VPC. If a user CIDR block includes another user CIDR block, the one with the shorter subnet mask takes effect. For example, if both 10.0.0.0/8 and 10.1.0.0/16 are specified, only 10.0.0.0/8 takes effect.</li>
     * <li><strong>CreateVpc</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> operation to query the status of the task:<ul>
     * <li>If the VPC is in the <strong>Creating</strong> state, the VPC is being created.</li>
     * <li>If the VPC is in the <strong>Created</strong> state, the VPC is created.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteRouteEntry</strong> operation to create default VPCs within a specific time period. However, you can repeatedly call this operation to create custom VPCs within a specific time period.</li>
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
     * <p>  <strong>CreateVpcGatewayEndpoint</strong> is an asynchronous operation. After a request is sent, the system returns an <strong>EndpointId</strong> and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/448682.html">ListVpcGatewayEndpoints</a> operation to query the status of the task.
     *     *   If the gateway endpoint is in the <strong>Creating</strong> state, the gateway endpoint is being created.
     *     *   If the gateway endpoint is in the <strong>Created</strong> state, the gateway endpoint is created.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>CreateVpcGatewayEndpoint</strong> operation for the same endpoint service within the specified period of time.</li>
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
     * <p>You cannot repeatedly call the <strong>CreateVpcPrefixList</strong> operation within the specified period of time.</p>
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
     * <p>If an Express Connect partner has created a virtual border router (VBR) for a tenant before, the Express Connect partner can push the Express Connect circuit that is associated with the VBR to the tenant account by adding a shared port for the tenant account. The service of the tenant is not interrupted in this process.
     * Preparations:
     * Before the Express Connect partner performs the operation, the Express Connect partner must notify the tenant and request the tenant to enable outbound data transfer billing. For more information, see <a href="https://help.aliyun.com/document_detail/274385.html">Enable outbound data transfer billing</a>.
     * What to do next:</p>
     * <ol>
     * <li>After the Express Connect partner performs the operation, a shared port is added for the tenant account. The tenant must call the <a href="https://help.aliyun.com/document_detail/324198.html">ConfirmPhysicalConnection</a> operation to accept the shared port.</li>
     * <li>Then, the Express Connect partner must call the <a href="https://help.aliyun.com/document_detail/324191.html">AttachVbrToVpconn</a> operation to associate the VBR with the newly added shared port that belongs to the tenant account.</li>
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
     * <p>  By default, the IPsec-VPN connection created by calling the <code>CreateVpnAttachment</code> operation is not bound to any resources. You can call the <a href="https://help.aliyun.com/document_detail/443993.html">CreateTransitRouterVpnAttachment</a> operation to bind the IPsec-VPN connection to a transit router.</p>
     * <ul>
     * <li>If you want to associate an IPsec-VPN connection with a transit router, you can create a dual-tunnel connection in some regions. For more information, see <a href="https://help.aliyun.com/document_detail/2853535.html">Dual-tunnel IPsec-VPN connections</a>.<ul>
     * <li>When you create a IPsec-VPN connection in dual tunnel mode, you can configure the following request parameters in addition to the required parameters: <strong>ClientToken</strong>, <strong>Name</strong>, <strong>NetworkType</strong>, <strong>EffectImmediately</strong>, <strong>AutoConfigRoute</strong>, <strong>Tags</strong> array, <strong>ResourceGroupId</strong>, <strong>TunnelOptionsSpecification</strong> array, and <strong>EnableTunnelsBgp</strong>.</li>
     * <li>When you create a IPsec-VPN connection in single tunnel mode, you can configure the following request parameters in addition to the required parameters: <strong>ClientToken</strong>, <strong>CustomerGatewayId</strong>, <strong>NetworkType</strong>, <strong>Name</strong>, <strong>EffectImmediately</strong>, <strong>IkeConfig</strong>, <strong>IpsecConfig</strong>, <strong>HealthCheckConfig</strong>, <strong>AutoConfigRoute</strong>, <strong>EnableDpd</strong>, <strong>EnableNatTraversal</strong>, <strong>BgpConfig</strong>, <strong>Tags</strong> array, and <strong>ResourceGroupId</strong>.</li>
     * </ul>
     * </li>
     * </ul>
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you create an IPsec-VPN connection, you must create a customer gateway in the region where you want to create the IPsec-VPN connection. For more information, see <a href="https://help.aliyun.com/document_detail/120368.html">CreateCustomerGateway</a>.
     * If you want to add BGP configurations to an IPsec-VPN connection, make sure that an autonomous system number (ASN) is assigned to the customer gateway.</p>
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
     * <p>  If the VPN gateway supports the dual-tunnel mode, you can specify the following parameters in addition to the required parameters when you call <code>CreateVpnConnection</code>:
     *     <strong>ClientToken</strong>, <strong>Name</strong>, <strong>EffectImmediately</strong>, <strong>AutoConfigRoute</strong>, <strong>Tags</strong> array, <strong>TunnelOptionsSpecification</strong> array, and <strong>EnableTunnelsBgp</strong>.
     *     For more information about the regions and zones that support the dual-tunnel mode, see <a href="https://help.aliyun.com/document_detail/2358946.html">IPsec-VPN connections support the dual-tunnel mode</a>.</p>
     * <ul>
     * <li>If the VPN gateway supports only the dual-tunnel mode, you can specify the following parameters in addition to the required parameters when you call <code>CreateVpnConnection</code>:
     * <strong>ClientToken</strong>, <strong>CustomerGatewayId</strong>, <strong>Name</strong>, <strong>EffectImmediately</strong>, <strong>IkeConfig</strong>, <strong>IpsecConfig</strong>, <strong>HealthCheckConfig</strong>, <strong>AutoConfigRoute</strong>, <strong>EnableDpd</strong>, <strong>EnableNatTraversal</strong>, <strong>BgpConfig</strong>, <strong>RemoteCaCertificate</strong>, and <strong>Tags</strong> array.</li>
     * <li><strong>CreateVpnConnection</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of the task.<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the IPsec-VPN connection is being created.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the IPsec-VPN connection is created.</li>
     * </ul>
     * </li>
     * <li>You cannot call <strong>CreateVpnConnection</strong> to create multiple IPsec-VPN connections associated with a VPN gateway at the same time.</li>
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
     * <p>  Before you create a VPN gateway, we recommend that you know more about the limits of VPN gateways. For more information, see the <a href="https://help.aliyun.com/document_detail/65290.html">Limits</a> section in the &quot;Create and manage a VPN gateway&quot; topic.</p>
     * <ul>
     * <li>VPN gateways in some regions support only IPsec-VPN connections in dual-tunnel mode. If you call <code>CreateVpnGateway</code> in these regions, you must specify <strong>VSwitchId</strong> and <strong>DisasterRecoveryVSwitchId</strong> in addition to the required parameters. For more information about the regions and zones that support the IPsec-VPN connections in dual-tunnel mode, see <a href="https://help.aliyun.com/document_detail/2358946.html">IPsec-VPN connections support the dual-tunnel mode</a>.</li>
     * <li><strong>CreateVpnGateway</strong> is an asynchronous operation. After you send a request to call this operation, the system returns a request ID and the endpoint service is being created in the backend. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of a VPN gateway.<ul>
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
     * <p>  Before you call this operation, make sure that you are familiar with the match rules of and limits on policy-based routes. For more information, see <a href="https://help.aliyun.com/document_detail/110777.html">Manage policy-based routes</a>.</p>
     * <ul>
     * <li>Before you create a policy-based route, make sure that an IPsec-VPN connection is created. For more information, see <a href="https://help.aliyun.com/document_detail/120391.html">CreateVpnConnection</a>.</li>
     * <li><strong>CreateVpnPbrRouteEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> operation to query the status of the VPN gateway.<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the policy-based route is being created.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the policy-based route is created.</li>
     * </ul>
     * </li>
     * <li>You cannot call the <strong>CreateVpnPbrRouteEntry</strong> operation to create multiple policy-based routes for a VPN gateway at a time.</li>
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
     * <p>  <strong>CreateVpnRouteEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of the task.
     *     *   If a VPN gateway is in the <strong>updating</strong> state, the destination-based route entry is being created.
     *     *   If a VPN gateway is in the <strong>active</strong> state, the destination-based route entry has been created.</p>
     * <ul>
     * <li>You cannot repeatedly call <strong>CreateVpnRouteEntry</strong> to create a destination-based route entry for a VPN gateway within the specified period of time.</li>
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
     * <p>  The <strong>DeactiveFlowLog</strong> operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/87923.html">DescribeFlowLogs</a> operation to query the status of a flow log:
     *     *   If the flow log is in the <strong>Deactivating</strong> state, the flow log is being disabled.
     *     *   If the flow log is in the <strong>Inactive</strong> state, the flow log is disabled.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeactiveFlowLog</strong> operation to disable a flow log within the specified period of time.</li>
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
     * <p>You cannot repeatedly call the <strong>DeleteCommonBandwidthPackage</strong> operation to delete an Internet Shared Bandwidth instance within the specified period of time.</p>
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
     * <p>Before you delete a customer gateway, make sure that no IPsec-VPN connection is associated with the customer gateway. For more information about how to delete an IPsec-VPN connection, see <a href="https://help.aliyun.com/document_detail/2526938.html">DeleteVpnAttachment</a> or <a href="https://help.aliyun.com/document_detail/2526948.html">DeleteVpnConnection</a>.</p>
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
     * <h2><a href="#"></a>Description</h2>
     * <ul>
     * <li><strong>DeleteDhcpOptionsSet</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/189208.html">GetDhcpOptionsSet</a> operation to query the status of the task.<ul>
     * <li>If the DHCP options set is in the <strong>Deleting</strong> state, the DHCP options set is being deleted.</li>
     * <li>If you cannot query the DHCP options set, the DHCP options set is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteDhcpOptionsSet</strong> operation to delete a DHCP options set within the specified period of time.</li>
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
     * <p>You can delete only failover tests that are in the <strong>Pending</strong> or <strong>Complete</strong> state.</p>
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
     * <p>  The <strong>DeleteFlowLog</strong> operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/87923.html">DescribeFlowLogs</a> operation to query the status of a flow log:
     *     *   If the flow log is in the <strong>Deleting</strong> state, the flow log is being deleted.
     *     *   If you cannot query the flow log, the flow log is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeleteFlowLog</strong> operation to delete a flow log within the specified period of time.</li>
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
     * <h2><a href="#"></a>Description</h2>
     * <ul>
     * <li><strong>DeleteForwardEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/36053.html">DescribeForwardTableEntries</a> operation to query the status of the task.<ul>
     * <li>If the DNAT entry is in the <strong>Deleting</strong> state, the system is deleting the DNAT entry. In this case, you can only query the status of the DNAT entry, but cannot perform other operations.</li>
     * <li>If the DNAT entry cannot be found, it is deleted.<blockquote>
     * <p> If a DNAT table has DNAT entries in the <strong>Pending</strong> state, you cannot delete the DNAT entries.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteForwardEntry</strong> operation to delete a DNAT entry within the specified period of time.</li>
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
     * <h2><a href="#"></a>Description</h2>
     * <p><strong>DeleteFullNatEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/348779.html">ListFullNatEntries</a> operation to query the status of a FULLNAT entry.</p>
     * <ul>
     * <li>If the FULLNAT entry is in the <strong>Deleting</strong> state, the system is deleting the FULLNAT entry. In this case, you can query the status of the FULLNAT entry, but cannot perform other operations.</li>
     * <li>If the FULLNAT entry cannot be found, the FULLNAT entry is deleted.
     * You cannot repeatedly call the <strong>DeleteFullNatEntry</strong> operation to delete a FULLNAT entry within the specified period of time.</li>
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
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can delete only pay-as-you-go instances.</li>
     * <li>Before you can delete a dedicated instance, disassociate the backend server from the instance first.</li>
     * <li>Before you can delete a shared instance, disassociate the elastic IP address (EIP) from the instance first.</li>
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
     * <p>When you call this operation, take note of the following rules:</p>
     * <ul>
     * <li>You can delete only HAVIPs that are in the Available state.</li>
     * <li>Make sure that no route points to the HAVIP that you want to delete.</li>
     * <li>Make sure that no elastic IP address (EIP) is associated with the HAVIP that you want to delete.</li>
     * <li>The <strong>DeleteHaVip</strong> operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/114611.html">DescribeHaVips</a> operation to query the status of an HAVIP:<ul>
     * <li>If the HAVIP is in the <strong>Deleting</strong> state, the HAVIP is being deleted.</li>
     * <li>If you cannot query the HAVIP, the HAVIP is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteHaVip</strong> operation to delete an HAVIP within the specified period of time.</li>
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
     * <p>  <strong>DeleteIpsecServer</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> to query the status of the task.
     *     *   If the VPN gateway is in the <strong>updating</strong> state, the IPsec server is being deleted.
     *     *   If the VPN gateway is in the <strong>active</strong> state, the IPsec server is deleted.</p>
     * <ul>
     * <li>You cannot call <strong>DeleteIpsecServer</strong> within the specified period of time.</li>
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
     * <h3><a href="#"></a>Description</h3>
     * <ul>
     * <li>Before you delete an IPv4 gateway, make sure that no route tables are associated with the IPv4 gateway.</li>
     * <li><strong>DeleteIpv4Gateway</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/407670.html">GetIpv4GatewayAttribute</a> operation to query the status of the task.<ul>
     * <li>If the IPv4 gateway is in the <strong>Deleting</strong> state, the IPv4 gateway is being deleted.</li>
     * <li>If the IPv4 gateway cannot be queried, the IPv4 gateway is deleted.</li>
     * </ul>
     * </li>
     * <li>After you call the <strong>DeleteIpv4Gateway</strong> operation to delete an IPv4 gateway, you cannot call the operation again to delete the IPv4 gateway until the deletion task is complete.</li>
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
     * <p>  <strong>DeleteIpv6EgressOnlyRule</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/102208.html">DescribeIpv6EgressOnlyRules</a> operation to query the status of the task.
     *     *   If the egress-only rule is in the <strong>Deleting</strong> state, the egress-only rule is being deleted.
     *     *   If you cannot query the egress-only rule, the egress-only rule is deleted.</p>
     * <ul>
     * <li>You cannot call the <strong>DeleteIpv6EgressOnlyRule</strong> within the specified period of time.</li>
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
     * <p>Before you delete an IPv6 gateway, you must delete the egress-only rules of the IPv6 gateway. For more information, see <a href="https://help.aliyun.com/document_detail/102201.html">DeleteIpv6EgressOnlyRule</a>.</p>
     * <ul>
     * <li><strong>DeleteIpv6Gateway</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/102226.html">DescribeIpv6GatewayAttribute</a> operation to query the status of the task:<ul>
     * <li>If the IPv6 gateway is in the <strong>Deleting</strong> state, the IPv6 gateway is being deleted.</li>
     * <li>If you cannot query the IPv6 gateway, the IPv6 gateway is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteIpv6Gateway</strong> operation to delete an IPv6 gateway within the specified period of time.</li>
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
     * <p>You cannot call the <strong>DeleteIpv6InternetBandwidth</strong> operation within the specified period of time.</p>
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
     * <h2><a href="#"></a>Description</h2>
     * <ul>
     * <li><strong>DeleteNatGateway</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/36054.html">DescribeNatGateways</a> to query the status of the task.<ul>
     * <li>If a NAT gateway is in the <strong>Deleting</strong> state, the NAT gateway is being deleted. In this case, you can query the NAT gateway but you cannot perform other operations.</li>
     * <li>If the NAT gateway cannot be found, the NAT gateway is deleted.
     * After you delete a NAT gateway, you cannot restore the NAT gateway. Proceed with caution.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteNatGateway</strong> operation to delete a NAT gateway within the specified period of time.</li>
     * </ul>
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
     * <h2><a href="#"></a>Description</h2>
     * <ul>
     * <li><strong>DeleteNatIp</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/281979.html">ListNatIps</a> operation to query the status of the task.<ul>
     * <li>If the NAT IP address is in the <strong>Deleting</strong> state, the NAT IP address is being deleted. In this case, you can only query the NAT IP address but cannot perform other operations.</li>
     * <li>If the NAT IP address cannot be found, it is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteNatIp</strong> operation to delete a NAT IP address within the specified period of time.</li>
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
     * <b>description</b> :
     * <h2><a href="#"></a>Description</h2>
     * <p>You cannot repeatedly call the <strong>DeleteNatIpCidr</strong> operation to delete a NAT CIDR block within the specified period of time.</p>
     * 
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
     * <h2><a href="#"></a>Description</h2>
     * <p>You cannot repeatedly call the <strong>DeleteNetworkAcl</strong> operation within the specified period of time.</p>
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
     * <p>You can only delete a connection over an Express Connect circuit that is in the <strong>Rejected</strong>, <strong>Canceled</strong>, <strong>AllocationFailed</strong>, or <strong>Terminated</strong> state.</p>
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
     * <li>Before you delete an IP address pool, make sure that no IP address in the pool is being used.</li>
     * <li><strong>DeletePublicIpAddressPool</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/429433.html">ListPublicIpAddressPools</a> operation to query the status of the task.<ul>
     * <li>If the IP address pool is in the <strong>Deleting</strong> state, the IP address pool is being deleted. In this state. you can only query the IP address pool and cannot perform other operations.</li>
     * <li>If you cannot query the IP address pool, the IP address pool is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeletePublicIpAddressPool</strong> operation to delete an IP address pool within the specified period of time.</li>
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
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Before you delete a CIDR block, make sure that it is not being used.</li>
     * <li><strong>DeletePublicIpAddressPoolCidrBlock</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/429436.html">ListPublicIpAddressPoolCidrBlocks</a> operation to query the status of the task.<ul>
     * <li>If the CIDR block is in the <strong>Deleting</strong> state, the CIDR block is being deleted. In this state, you can only query the CIDR block and cannot perform other operations.</li>
     * <li>If you cannot query the CIDR block, the CIDR block is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeletePublicIpAddressPoolCidrBlock</strong> operation to delete a CIDR block within the specified period of time.</li>
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
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can delete only routes that are in the <strong>Available</strong> state.</li>
     * <li>You cannot delete a route of a virtual private cloud (VPC) in which a vSwitch or another route is being created or deleted.</li>
     * <li><strong>DeleteRouteEntries</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/138148.html">DescribeRouteEntryList</a> operation to query the status of the task.<ul>
     * <li>If the route is in the <strong>Deleting</strong> state, the route is being deleted.</li>
     * <li>If you cannot query the route, the route is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call <strong>DeleteRouteEntries</strong> within a specific period of time.</li>
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
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can delete only routes that are in the <strong>Available</strong> state.</li>
     * <li>You cannot delete a route entry of a virtual private cloud (VPC) in which a vSwitch or another route entry is being created or deleted.</li>
     * <li>Before you call this operation to delete a route of a VBR route table, call the <a href="https://help.aliyun.com/document_detail/138148.html">DescribeRouteEntryList</a> operation to query the <strong>NextHopId</strong> of the route first.</li>
     * <li><strong>DeleteRouteEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/138148.html">DescribeRouteEntryList</a> operation to query the status of the task.<ul>
     * <li>If the route is in the <strong>Deleting</strong> state, the route is being deleted.</li>
     * <li>If you cannot query the route entry, the route entry is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteRouteEntry</strong> operation to delete a route from the route table of a vRouter or a VBR within the specified period of time.</li>
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
     * <h2><a href="#"></a>Description</h2>
     * <ul>
     * <li><strong>DeleteRouteTable</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/87602.html">DescribeRouteTableList</a> operation to query the status of the task.<ul>
     * <li>If the custom route table is in the <strong>Deleting</strong> state, the custom route table is being deleted.</li>
     * <li>If you cannot query the custom route table, the custom route table is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteRouteTable</strong> operation to delete a custom route table within the specified period of time.</li>
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
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>You can delete only a router interface that is in the <strong>Idle</strong> or <strong>Inactive</strong> state.</li>
     * <li>Before you delete a router interface, you must delete all custom route entries destined for the router interface.</li>
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
     * <p>DeleteSnatEntry is an asynchronous operation. After you make a request, the ID of the request is returned but the specified SNAT entry is not deleted. The system deletes the SNAT entry in the background. You can call the <a href="https://help.aliyun.com/document_detail/42677.html">DescribeSnatTableEntries</a> operation to query the status of SNAT entries.</p>
     * <ul>
     * <li>If the SNAT entries are in the <strong>Deleting</strong> state, the system is deleting the SNAT entries. In this case, you can only query the status of the SNAT entries, and cannot perform other operations.</li>
     * <li>If no SNAT entry is returned in the response, the SNAT entry is deleted.
     * If some SNAT entries are in the <strong>Pending</strong> state, you cannot delete these SNAT entries.</li>
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
     * <p>  If you delete an SSL client certificate, all SSL-VPN client connections to the SSL server are disconnected. You need to reinitiate connections from SSL clients.
     *     For example, SSL client certificate 1 and SSL client certificate 2 are created on an SSL server. After you delete certificate 1, all client connections associated with certificate 1 and certificate 2 are disconnected from the SSL server.
     *     *   If clients associated with certificate 1 require SSL-VPN connections, you need to install other certificates on the clients and reinitiate connections from the clients.
     *     *   If clients associated with certificate 2 require SSL-VPN connections, you can directly reinitiate connections from the clients.</p>
     * <ul>
     * <li><strong>DeleteSslVpnClientCert</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> operation to query the status of the task.<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the SSL client certificate is being deleted.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the SSL client certificate is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot call <strong>DeleteSslVpnClientCert</strong> within the specified period of time.</li>
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
     * <p>  <strong>DeleteSslVpnServer</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> operation to query the status of the task.
     *     *   If the VPN gateway is in the <strong>updating</strong> state, the SSL server is being deleted.
     *     *   If the VPN gateway is in the <strong>active</strong> state, the SSL server is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeleteSslVpnServer</strong> operation to delete an SSL server from the same VPN gateway within the specified period of time.</li>
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
     * <p>  The <strong>DeleteTrafficMirrorFilter</strong> operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/261353.html">ListTrafficMirrorFilters</a> operation to query the status of a filter:
     *     *   If the filter is in the <strong>Deleting</strong> state, the filter is being deleted.
     *     *   If you cannot query the filter, the filter is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeleteTrafficMirrorFilter</strong> operation to delete a filter within the specified period of time.</li>
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
     * <p>  <strong>DeleteTrafficMirrorFilterRules</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/261353.html">ListTrafficMirrorFilters</a> to query the status of the task.
     *     *   If the inbound or outbound rule is in the <strong>Deleting</strong> state, the rule is being deleted.
     *     *   If you cannot query the rule, the rule is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call <strong>DeleteTrafficMirrorFilterRules</strong> within the specified period of time.</li>
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
     * <p>  <strong>DeleteTrafficMirrorSession</strong> is an asynchronous operation. After you send the request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/261367.html">ListTrafficMirrorSessions</a> operation to query the status of a traffic mirror session.
     *     *   If the traffic mirror session is in the <strong>Deleting</strong> state, the traffic mirror session is being deleted.
     *     *   If you cannot query the traffic mirror session, the traffic mirror session is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeleteTrafficMirrorSession</strong> operation to delete a traffic mirror session within the specified period of time.</li>
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
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>Before you delete a vSwitch, you must first release or remove all virtual private cloud (VPC) resources, including vSwitches, instances, router interfaces, and high-availability virtual IP addresses (HAVIPs).</li>
     * <li>You can delete only vSwitches that are in the <strong>Available</strong> state.</li>
     * <li>You cannot delete a vSwitch from a VPC where a vSwitch or a route is being created or deleted.</li>
     * <li><strong>DeleteVSwitch</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> operation to query the status of the task:<ul>
     * <li>If the vSwitch is in the <strong>Pending</strong> state, the vSwitch is being deleted.</li>
     * <li>If you cannot query the vSwitch, the vSwitch is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteVSwitch</strong> operation to delete a vSwitch within the specified period of time.</li>
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
     * <h2><a href="#"></a>Description</h2>
     * <ul>
     * <li>Before you call this operation, make sure that the IP address allocated to an elastic network interface (ENI) from the reserved CIDR block is deleted. If the IP address of the ENI is not deleted, call <a href="https://help.aliyun.com/document_detail/85919.html">UnassignPrivateIpAddresses</a> or <a href="https://help.aliyun.com/document_detail/98611.html">UnassignIpv6Addresses</a> to delete the IPv4 or IPv6 address.</li>
     * <li><strong>DeleteVSwitchCidrReservation</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/610155.html">ListVSwitchCidrReservations</a> to query the status of the task:<ul>
     * <li>If the reserved CIDR block is in the <strong>Releasing</strong> state, it is being released.</li>
     * <li>If the reserved CIDR block is in the <strong>Released</strong> state, it is released.</li>
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
     * <p>  <strong>DeleteVcoRouteEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/53046.html">DescribeVpnConnection</a> operation to query the status of the task.
     *     *   If the IPsec-VPN connection is in the <strong>updating</strong> state, the route is being deleted.
     *     *   If the IPsec-VPN connection is in the <strong>attached</strong> state, the route is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>DeleteVcoRouteEntry</strong> operation within a specific time period.</li>
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
     * <p>Before you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>Before you delete a VBR, you must delete all router interfaces of the VBR.</li>
     * <li>You can delete only a VBR in the <strong>unconfirmed</strong>, <strong>active</strong>, or <strong>terminated</strong> state.</li>
     * <li>The owner of an Express Connect circuit can delete a VBR that belongs to another account only if the VBR is in the <strong>unconfirmed</strong> state.</li>
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
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>Before you delete a VPC, make sure that all resources deployed in the VPC are released or removed, such as vSwitches, instances, and high-availability virtual IP addresses (HAVIPs).</li>
     * <li>You can delete only a VPC that is in the <strong>Available</strong> state.</li>
     * <li>The <strong>DeleteVpc</strong> operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> operation to query the status of a VPC:<ul>
     * <li>If the VPC is in the <strong>Deleting</strong> state, the VPC is being deleted.</li>
     * <li>If you cannot query the VPC, the VPC is deleted.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DeleteVpc</strong> operation to delete a VPC within the specified period of time.</li>
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
     * <p>You cannot repeatedly call the <strong>DeleteDhcpOptionsSet</strong> operation to delete a prefix list within the specified period of time.</p>
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
     * <p>  If an IPsec-VPN connection is associated with a transit router, you must disassociate the transit router from the IPsec-VPN connection before you delete the IPsec-VPN connection. For more information, see <a href="https://help.aliyun.com/document_detail/468251.html">DeleteTransitRouterVpnAttachment</a>.</p>
     * <ul>
     * <li>If an IPsec-VPN connection is not associated with a resource, you can call <code>DeleteVpnAttachment</code> to directly delete the IPsec-VPN connection.</li>
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
     * <p>  <strong>DeleteVpnConnection</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> operation to query the status of a VPN gateway.
     *     *   If a VPN gateway is in the <strong>updating</strong> state, the IPsec-VPN connection is being deleted.
     *     *   If a VPN gateway is in the <strong>active</strong> state, the IPsec-VPN connection has been deleted.</p>
     * <ul>
     * <li>You cannot call the <strong>DeleteVpnConnection</strong> operation to delete multiple IPsec-VPN connections for a VPN gateway at a time.<blockquote>
     * <p> After an IPsec-VPN connection between a data center and Alibaba Cloud is deleted, the connection between the data center and Alibaba Cloud is closed.</p>
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
     * <p> You cannot delete a VPN gateway associated with existing IPsec-VPN connections.</p>
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
     * <p>  <strong>DeleteVpnPbrRouteEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of the task.
     *     *   If a VPN gateway is in the <strong>updating</strong> state, the policy-based route is being deleted.
     *     *   If a VPN gateway is in the <strong>active</strong> state, the policy-based route has been deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call <strong>DeleteVpnPbrRouteEntry</strong> to delete a policy-based route within the specified period of time.</li>
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
     * <p>  <strong>DeleteVpnRouteEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of the task.
     *     *   If a VPN gateway is in the <strong>updating</strong> state, the destination-based route is being deleted.
     *     *   If the VPN gateway is in the <strong>active</strong> state, the destination-based route is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call <strong>DeleteVpnRouteEntry</strong> to delete a destination-based route from a VPN gateway within the specified period of time.</li>
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
     * <p>After you enable deletion protection for an instance, you cannot delete the instance. You must disable deletion protection before you can delete the instance.</p>
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
     * <p>You can call this operation to query information about EIPs in a region, including maximum bandwidth, billing methods, and associated instances.</p>
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
     * <p>You can query only EIPs that are associated with secondary elastic network interfaces (ENIs) in multi-EIP-to-ENI mode.</p>
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
     * <p>To improve user experience in querying monitoring data, we recommend that you call the DescribeMetricList API operation provided by CloudMonitor to query EIP monitoring data. For more information, see <a href="https://help.aliyun.com/document_detail/51936.html">DescribeMetricList</a> and <a href="https://help.aliyun.com/document_detail/162874.html">EIP monitoring data</a>.</p>
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
     * <p>You can call this operation to query both Virtual Private Cloud (VPC) NAT gateways and Internet NAT gateways. NAT gateways in this topic refer to both VPC NAT gateways and Internet NAT gateways.</p>
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
     * <p>By default, the system queries information about all Express Connect circuits in the specified region. You can query Express Connect circuits that meet specific conditions by specifying filter conditions provided by the <strong>DescribePhysicalConnections</strong> operation. For more information about the supported filter conditions, see <strong>Key</strong> in the <strong>Request parameters</strong> section.</p>
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
     * <p>You cannot query the range of public IP addresses of a classic network by calling the <strong>DescribePublicIpAddress</strong> operation.</p>
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
     * <p>Before you call the <a href="https://help.aliyun.com/document_detail/36013.html">DeleteRouteEntry</a> operation to delete a route, you can call this operation to query the next hop of the route that you want to delete.</p>
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
     * <p>You can call this operation to query only dedicated-bandwidth GA instances.</p>
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
     * <p>If your VPN gateway was created before December 10, 2022, you need to upgrade the VPN gateway to the latest version to view the connection information about SSL clients. For more information, see <a href="https://help.aliyun.com/document_detail/2671058.html">Upgrade a VPN gateway</a>.
     * If your VPN gateway was created after December 10, 2022, you can view the connection information about SSL clients by default.</p>
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
     * <p>  You must specify <strong>ResourceId.N</strong> or <strong>Tag.N</strong> that consists of <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> in the request to specify the object that you want to query.</p>
     * <ul>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified tag key are returned. If you specify only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you specify <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, all tags that match the key-value pairs are returned.</li>
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
     * <h2><a href="#"></a>Description</h2>
     * <ul>
     * <li><strong>DetachDhcpOptionsSetFromVpc</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> operation to query the status of the task.<ul>
     * <li>If the DHCP options set is in the <strong>Pending</strong> state, the DHCP options set is being disassociated.</li>
     * <li>If the DHCP options set is in the <strong>UnUsed</strong> state, the DHCP options set is disassociated.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>DetachDhcpOptionsSetFromVpc</strong> operation to disassociate a DHCP options set from a VPC within the specified period of time.</li>
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
     * <p>  If the IPsec-VPN connection is in single-tunnel mode, the request parameter <code>VpnConnectionIds</code> is required when you call the <strong>DiagnoseVpnConnections</strong> operation.</p>
     * <ul>
     * <li>If the IPsec-VPN connection is in dual-tunnel mode, the request parameter <code>TunnelIds</code> is required when you call the <strong>DiagnoseVpnConnections</strong> operation.</li>
     * <li>After you call the <strong>DiagnoseVpnConnections</strong> operation, if the current IPsec-VPN connection is faulty, the operation returns the corresponding error code (<strong>FailedReasonCode</strong>) and log (<strong>SourceLog</strong>). You can troubleshoot based on the error code and log information. For more information, see <a href="https://help.aliyun.com/document_detail/477862.html">Common errors and troubleshooting methods for IPsec-VPN connections</a>.</li>
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
     * <p>VPN网关发起诊断</p>
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
     * @deprecated OpenAPI DisableNatGatewayEcsMetric is deprecated  * @param request  the request parameters of DisableNatGatewayEcsMetric  DisableNatGatewayEcsMetricRequest
     * @return DisableNatGatewayEcsMetricResponse
     */
    @Deprecated
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

    /**
     * @param request the request parameters of DisableVpcClassicLink  DisableVpcClassicLinkRequest
     * @return DisableVpcClassicLinkResponse
     */
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
     * <p>  <strong>DissociateVpnGatewayWithCertificate</strong> is an asynchronous operation. After a request is sent, the system returns a request and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> operation to query the status the task.
     *     *   If the VPN gateway is in the <strong>updating</strong> state, the SSL certificate is being disassociated from the VPN gateway.
     *     *   If the VPN gateway is in the <strong>active</strong> state, the SSL certificate is disassociated from the VPN gateway.</p>
     * <ul>
     * <li>You cannot repeatedly call <strong>DissociateVpnGatewayWithCertificate</strong> within a specific period of time.</li>
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
     * @deprecated OpenAPI EnableNatGatewayEcsMetric is deprecated  * @param request  the request parameters of EnableNatGatewayEcsMetric  EnableNatGatewayEcsMetricRequest
     * @return EnableNatGatewayEcsMetricResponse
     */
    @Deprecated
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
     * <b>description</b> :
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>You can enable only an Express Connect circuit that is in the <strong>Confirmed</strong> state.</li>
     * <li>After you enable an Express Connect circuit, it enters the <strong>Enabled</strong> state.</li>
     * <li><strong>EnablePhysicalConnection</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/36042.html">DescribePhysicalConnections</a> operation to query the status of the task.</li>
     * <li>You cannot repeatedly call <strong>EnablePhysicalConnection</strong> for an Express Connect circuit in the <strong>Confirmed</strong> state within a specific time period.</li>
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
     * @param request the request parameters of EnableVpcClassicLink  EnableVpcClassicLinkRequest
     * @return EnableVpcClassicLinkResponse
     */
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
     * <h2><a href="#"></a>Description</h2>
     * <ul>
     * <li><strong>EnableVpcIpv4Gateway</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/407670.html">GetIpv4GatewayAttribute</a> operation to query the status of an IPv4 gateway.<ul>
     * <li>If the IPv4 gateway is in the <strong>Activating</strong> state, the IPv4 gateway is being activated.</li>
     * <li>If the IPv4 gateway is in the <strong>Created</strong> state, the IPv4 gateway is activated.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>EnableVpcIpv4Gateway</strong> operation to activate an IPv4 gateway within the specified period of time.</li>
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
     * <p>You can call this operation to query information about a specified Internet NAT gateway or Virtual Private Cloud (VPC) NAT gateway. In this topic, &quot;NAT gateway&quot; refers to both gateway types.</p>
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
     * <p>You can call this API operation to query the status of outbound data transfer billing for the current account. For more information about outbound data transfer billing, see <a href="https://help.aliyun.com/document_detail/274385.html">Outbound data transfer billing</a> and <a href="https://help.aliyun.com/document_detail/54582.html">Billing</a>.</p>
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
     * <p>When you call the <strong>GetVpnGatewayDiagnoseResult</strong> operation, you must specify one of <strong>DiagnoseId</strong> and <strong>VpnGatewayId</strong>.</p>
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
     * <p>  Before you can attach a network instance that belongs to another Alibaba Cloud account to your CEN instance, you must grant permissions to your CEN instance.</p>
     * <blockquote>
     * <p> <strong>GrantInstanceToCen</strong> is a Virtual Private Cloud (VPC) operation. Therefore, you must use the <code>vpc.aliyuncs.com</code> domain name to call this operation. The API version is <code>2016-04-28</code>.</p>
     * </blockquote>
     * <ul>
     * <li>You cannot repeatedly call the <strong>GrantInstanceToCen</strong> operation to grant the permissions on a network instance to a CEN instance. The network instance can be a VPC, a virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</li>
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
     * <h2>Usage notes</h2>
     * <p>When you connect a VBR to a VPC that belongs to another Alibaba Cloud account, the VBR must acquire the required permissions from the VPC.</p>
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
     * <p>You can call this operation to query zones that support NAT gateways, including Internet NAT gateways and Virtual Private Cloud (VPC) NAT gateways.</p>
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
     * <h2>Usage notes</h2>
     * <ul>
     * <li>You must specify <strong>ResourceId.N</strong> or <strong>Tag.N</strong> that consists of <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> in the request to specify the object that you want to query.</li>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified key are returned. If you specify only <strong>Tag.N.Value</strong>, an error message is returned.</li>
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
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * <ul>
     * <li>If you want to query a specific object, you must specify <strong>ResourceId.N</strong> or <strong>Tag.N</strong> that consists of <strong>Tag.N.Key</strong> and <strong>Tag.N.Value</strong> in the request.</li>
     * <li><strong>Tag.N</strong> is a resource tag that consists of a key-value pair. If you specify only <strong>Tag.N.Key</strong>, all tag values that are associated with the specified key are returned. If you specify only <strong>Tag.N.Value</strong>, an error message is returned.</li>
     * <li>If you specify <strong>Tag.N</strong> and <strong>ResourceId.N</strong> to filter tags, <strong>ResourceId.N</strong> must match all specified key-value pairs.</li>
     * <li>If you specify multiple key-value pairs, resources that contain these key-value pairs are returned.</li>
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
     * <p>When you call <strong>ListVpnCertificateAssociations</strong>, take note of the following information:</p>
     * <ul>
     * <li>If you specify only <strong>RegionId</strong>, the SSL certificates associated with all VPN gateways in the specified region are queried.</li>
     * <li>If you specify <strong>RegionId</strong> and <strong>CertificateType</strong>, the SSL certificates of the specified type that are associated with the VPN gateways in the specified region are queried.</li>
     * <li>If you specify <strong>RegionId</strong> and <strong>VpnGatewayId</strong>, the SSL certificates associated with the specified VPN gateway in the specified region are queried.</li>
     * <li>If you specify <strong>RegionId</strong> and <strong>CertificateId</strong>, the VPN gateways associated with the specified SSL certificate in the specified region are queried.</li>
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
     * <p>You can call the <strong>ModifyCommonBandwidthPackageIpBandwidth</strong> operation to set the maximum bandwidth of an EIP that is associated with an Internet Shared Bandwidth instance. This prevents an EIP from exhausting the bandwidth resources of an Internet Shared Bandwidth instance.
     * For example, two EIPs are associated with an Internet Shared Bandwidth instance whose maximum bandwidth is 800 Mbit/s. In this case, you can set the maximum bandwidth of one EIP to 500 Mbit/s and that of the other EIP to 400 Mbit/s. After you set the maximum bandwidth values, the first EIP cannot consume bandwidth higher than 500 Mbit/s. The second EIP cannot consume bandwidth higher than 400 Mbit/s.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>This operation is valid only for EIPs that are associated with Elastic Compute Service (ECS) instances. This operation is invalid for EIPs that are associated with Server Load Balancer (SLB) instances, NAT gateways, secondary elastic network interfaces (ENIs), or high-availability virtual IP addresses (HAVIPs).</li>
     * <li>This operation is in public preview. You can call this operation to set the maximum bandwidth of EIPs only if the EIPs are associated with an Internet Shared Bandwidth instance. The feature is not supported in the console.</li>
     * <li>You cannot repeatedly call this operation to set the maximum bandwidth of an EIP within the specified period of time.</li>
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
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li><strong>ModifyCommonBandwidthPackageSpec</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/120309.html">DescribeCommonBandwidthPackages</a> operation to query the status of the task.<ul>
     * <li>If the Internet Shared Bandwidth instance is in the <strong>Modifying</strong> state, the maximum bandwidth of the Internet Shared Bandwidth instance is being modified. In this state, you can only query the Internet Shared Bandwidth instance and cannot perform other operations.</li>
     * <li>If the Internet Shared Bandwidth instance is in the <strong>Available</strong> state, the maximum bandwidth of the Internet Shared Bandwidth instance is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>ModifyCommonBandwidthPackageSpec</strong> operation to modify the maximum bandwidth of an Internet Shared Bandwidth instance within the specified period of time.</li>
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
     * <p>  When you call <strong>ModifyCustomerGatewayAttribute</strong>, if a value is assigned to <strong>AuthKey</strong>, the operation is asynchronous. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of the task.
     *     *   If a VPN gateway is in the <strong>updating</strong> state, the configurations are being modified.
     *     *   If a VPN gateway is in the <strong>active</strong> state, the configurations are modified.</p>
     * <ul>
     * <li>When you call <strong>ModifyCustomerGatewayAttribute</strong>, if no value is assigned to <strong>AuthKey</strong>, the operation is synchronous.</li>
     * <li>You cannot repeatedly call <strong>ModifyCustomerGatewayAttribute</strong> to modify the configurations of a customer gateway within the specified period of time.</li>
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
     * <p>  <strong>ModifyFlowLogAttribute</strong> is an asynchronous operation. After you send a request, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/87923.html">DescribeFlowLogs</a> operation to query the status of a flow log:
     *     *   If the flow log is in the <strong>Modifying</strong> state, the flow log is being modified.
     *     *   If the flow log is in the <strong>Active</strong> or <strong>Inactive</strong> state, the flow log is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>ModifyFlowLogAttribute</strong> operation to modify a flow log within the specified period of time.</li>
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
     * <p>  <strong>ModifyForwardEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/36053.html">DescribeForwardTableEntries</a> operation to query the status of the task.
     *     *   <strong>Pending</strong>: indicates that the system is modifying the DNAT entry. You can only query the DNAT entry, but cannot perform other operations.
     *     *   <strong>Available</strong>: indicates that the DNAT entry is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>ModifyForwardEntry</strong> operation to modify a DNAT entry within the specified period of time.</li>
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
     * <h2><a href="#"></a></h2>
     * <ul>
     * <li><strong>ModifyFullNatEntryAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/348779.html">ListFullNatEntries</a> operation to query the status of a FULLNAT entry.<ul>
     * <li><strong>Modifying</strong>: indicates that the system is modifying the FULLNAT entry. You can query the FULLNAT entry, but cannot perform other operations.</li>
     * <li><strong>Available</strong>: indicates that the FULLNAT entry is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>ModifyFullNatEntryAttribute</strong> operation to modify a FULLNAT entry within the specified period of time.</li>
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
     * <h2>Usage notes</h2>
     * <p>You cannot call this operation to modify the maximum bandwidth of a subscription GA instance.</p>
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
     * <p>You cannot repeatedly call the <strong>ModifyHaVipAttribute</strong> operation to modify the name and description of an HAVIP within the specified periods of time.</p>
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
     * <p>You cannot repeatedly call the <strong>ModifyIpv6InternetBandwidth</strong> operation to modify the Internet bandwidth value of an IPv6 CIDR block within the specified period of time.</p>
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
     * <h2><a href="#"></a>Description</h2>
     * <p>You can call this operation to query an Internet NAT gateway or a virtual private cloud (VPC) NAT gateway. The term NAT gateway in this topic refers to both NAT gateway types.</p>
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
     * <li>You cannot call this operation to downgrade a subscription Internet NAT gateway. You can downgrade a subscription Internet NAT gateway only in the console.</li>
     * <li>When you call this operation to upgrade a subscription Internet NAT gateway, an order is generated. After you complete the payment in the order center, the Internet NAT gateway is upgraded.</li>
     * <li><strong>ModifyNatGatewaySpec</strong> is an asynchronous operation. After you make a request, the ID of the request is returned but the Internet NAT gateway is not upgraded. The system upgrades the NAT gateway in the background. You can call the <a href="/help/en/virtual-private-cloud/latest/describenatgateways">DescribeNatGateways</a> operation to query the status of an Internet NAT gateway.    - If an Internet NAT gateway is in the <strong>Modifying</strong> state, the NAT gateway is being upgraded. In this case, you can only query the NAT gateway but cannot perform other operations.<ul>
     * <li>If an Internet NAT gateway is in the <strong>Available</strong> state, the Internet NAT gateway is upgraded.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>ModifyNatGatewaySpec</strong> operation to resize a pay-by-specification NAT gateway.
     * Internet NAT gateways are available in different sizes. The size of an Internet NAT gateway determines the SNAT performance, which includes the maximum number of connections and the number of new connections per second. However, the size of a NAT gateway does not affect the data throughput. The following table describes the correlations between different sizes of Internet NAT gateways and SNAT performance metrics.  <table>
     * <thead>
     * <tr>
     * <th>Size</th>
     * <th>Maximum number of connections</th>
     * <th>Number of new connections per second</th>
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
     * <h2><a href="#"></a>Description</h2>
     * <p>You cannot repeatedly call the <strong>ModifyNatIpAttribute</strong> operation to modify the name and description of a NAT IP address within the specified period of time.</p>
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
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>If an Express Connect circuit is in the <strong>Initial</strong>, <strong>Enabled</strong>, or <strong>Rejected</strong> state, you can modify the specifications of the Express Connect circuit and the ID of the redundant circuit.</li>
     * <li>If an Express Connect circuit is in the <strong>Canceled</strong>, <strong>Allocating</strong>, <strong>AllocationFailed</strong>, or <strong>Terminated</strong> state, you cannot modify the specifications of the Express Connect circuit.</li>
     * <li>After you modify the specifications of an Express Connect circuit that is in the <strong>Rejected</strong> state, the Express Connect circuit enters the <strong>Initial</strong> state.</li>
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
     * <p>You cannot repeatedly call the <strong>ModifyRouteEntry</strong> operation to modify the name and description of a custom route within the specified period of time.</p>
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
     * <p>You cannot repeatedly call the <strong>ModifyRouteTableAttributes</strong> operation to modify the name and description of a route table within the specified period of time.</p>
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
     * <p>After you call this operation, the router interface enters the <strong>Activating</strong> state. After the router interface is activated, the router interface enters the <strong>Active</strong> state.</p>
     * <blockquote>
     * <p> You cannot modify the specification of a router interface that has overdue payments.</p>
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
     * <h2><a href="#"></a></h2>
     * <p><strong>ModifySnatEntry</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/42677.html">DescribeSnatTableEntries</a> operation to query the status of the task.</p>
     * <ul>
     * <li><strong>Pending</strong>: indicates that the system is modifying the SNAT entry. You can only query the status of the SNAT entry, but cannot perform other operations.</li>
     * <li><strong>Available</strong>: indicates that the SNAT entry is modified.<blockquote>
     * <p> If an SNAT entry is in the <strong>Pending</strong> state, it indicates that you cannot modify the SNAT entry.
     * You cannot repeatedly call the <strong>ModifySnatEntry</strong> operation to modify an SNAT entry within a specific period of time.</p>
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
     * <p>  To enable two-factor authentication for an SSL server, make sure that the VPN gateway supports two-factor authentication. You may need to upgrade the VPN gateway. For more information, see <a href="https://help.aliyun.com/document_detail/2785320.html">Two-factor authentication supports IDaaS EIAM 2.0</a>.</p>
     * <ul>
     * <li>If you modify only <strong>Name</strong>, this operation is synchronous. If you modify other parameters besides <strong>Name</strong>, this operation is asynchronous.</li>
     * <li><strong>ModifySslVpnServer</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> operation to query the status of the task.<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the SSL server is being modified.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the SSL server is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call <strong>ModifySslVpnServer</strong> within the specified period of time.</li>
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
     * <p>You cannot repeatedly call the <strong>ModifyVRouterAttribute</strong> operation within a specific period of time.</p>
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
     * <p>  <strong>ModifyVSwitchAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> operation to query the status of the task:
     *     *   If the vSwitch is in the <strong>Pending</strong> state, the name and description of the vSwitch are being modified.
     *     *   If the vSwitch is in the <strong>Available</strong> state, the name and description of the vSwitch are modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>ModifyVSwitchAttribute</strong> operation to modify the name and description of a vSwitch within the specified period of time.</li>
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You cannot repeatedly call <strong>ModifyVSwitchCidrReservationAttribute</strong> within a specific time period.</p>
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
     * <p>  <strong>ModifyVcoRouteEntryWeight</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/53046.html">DescribeVpnConnection</a> operation to query the status of the associated IPsec-VPN connection and determine whether the weight of the specified destination-based route is modified.
     *     *   If the IPsec-VPN connection is in the <strong>updating</strong> state, the weight of the destination-based route is being modified.
     *     *   If the IPsec-VPN connection is in the <strong>attached</strong> state, the weight of the destination-based route is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>ModifyVcoRouteEntryWeight</strong> operation for the same IPsec-VPN connection within the specified period of time.</li>
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
     * <h1><a href="#"></a></h1>
     * <ul>
     * <li>Only the owner of an Express Connect circuit can modify the <strong>VlanId</strong> parameter.</li>
     * <li>One VLAN ID of an Express Connect circuit cannot be used only by one VBR at the same time.</li>
     * <li>The VLAN ID of a VBR in the <strong>Terminated</strong> state is reserved for seven days and cannot be used by other VBRs. The VLAN ID can be used by other VBRs after 7 days.</li>
     * <li>You cannot set <strong>LocalGatewayIp</strong>, <strong>PeerGatewayIp</strong>, or <strong>PeeringSubnetMask</strong> for VBRs that do not belong to your Alibaba Cloud account.</li>
     * <li>Set <strong>PeeringSubnetMask</strong> to a subnet mask with 24 to 30 bits in length (255.255.255.0～255.255.255.252).</li>
     * <li>Set <strong>LocalGatewayIp</strong> and <strong>PeerGatewayIp</strong> to IP addresses that belong to the same CIDR block. For example, you can set LocalGatewayIp to 192.168.XX.XX, PeerGatewayIp to 192.168.XX.XX, and PeeringSubnetMask to 255.255.255.248.</li>
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
     * <h2><a href="#"></a>Description</h2>
     * <p>You cannot repeatedly call the <strong>ModifyVpcAttribute</strong> operation to modify the name and description of a VPC within the specified period of time.</p>
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
     * <b>description</b> :
     * <p>  <strong>ModifyVpcPrefixList</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/311535.html">ListPrefixLists</a> to query the status of the task.
     *     *   If the prefix list is in the <strong>Modifying</strong> state, the configuration of the prefix list is being modified.
     *     *   If the prefix list is in the <strong>Created</strong> state, the configuration of the prefix list is modified.
     *     *   After the configuration of the prefix list is modified, you can call the <a href="https://help.aliyun.com/document_detail/445478.html">GetVpcPrefixListAssociations</a> operation to query the information about the network instances that are associated with the prefix list and determine whether the associated network instances use the new CIDR blocks. If the association <strong>status</strong> of the prefix list is <strong>Created</strong>, the new CIDR blocks are used by the network instances that are associated with the prefix list.</p>
     * <ul>
     * <li>You cannot repeatedly call <strong>ModifyVpcPrefixList</strong> to modify the configuration of a prefix list within the specified period of time.</li>
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
     * <p>  When you modify a IPsec-VPN connection in dual-tunnel mode, you can configure the following parameters in addition to the required request parameters: <strong>ClientToken</strong>, <strong>Name</strong>, <strong>LocalSubnet</strong>, <strong>RemoteSubnet</strong>, <strong>EffectImmediately</strong>, <strong>AutoConfigRoute</strong>, <strong>TunnelOptionsSpecification</strong> array, and <strong>EnableTunnelsBgp</strong>.</p>
     * <ul>
     * <li>When you modify a IPsec-VPN connection in single tunnel mode, you can configure the following parameters in addition to the required request parameters: <strong>ClientToken</strong>, <strong>Name</strong>, <strong>LocalSubnet</strong>, <strong>RemoteSubnet</strong>, <strong>EffectImmediately</strong>, <strong>IkeConfig</strong>, <strong>IpsecConfig</strong>, <strong>HealthCheckConfig</strong>, <strong>AutoConfigRoute</strong>, <strong>EnableDpd</strong>, <strong>EnableNatTraversal</strong>, <strong>BgpConfig</strong>, and <strong>CustomerGatewayId</strong>.</li>
     * <li><strong>ModifyVpnAttachmentAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/53046.html">DescribeVpnConnection</a> operation to query the status of the task:<ul>
     * <li>If the IPsec-VPN connection is in the <strong>updating</strong> state, the IPsec-VPN connection is being modified.</li>
     * <li>If the IPsec-VPN connection is in the <strong>attached</strong> state, the IPsec-VPN connection is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot concurrently call <strong>ModifyVpnAttachmentAttribute</strong> within the specified period of time.</li>
     * <li>You cannot call <strong>ModifyVpnAttachmentAttribute</strong> to modify the gateway type of an IPsec-VPN connection.</li>
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
     * <p>  If you want to modify a IPsec-VPN connection in dual-tunnel mode, call the <code>ModifyVpnConnectionAttribute</code> operation. You can modify the required parameters and the following request parameters:
     *     <strong>ClientToken</strong>, <strong>Name</strong>, <strong>LocalSubnet</strong>, <strong>RemoteSubnet</strong>, <strong>EffectImmediately</strong>, <strong>AutoConfigRoute</strong>, <strong>TunnelOptionsSpecification</strong>, and <strong>EnableTunnelsBgp</strong>.</p>
     * <ul>
     * <li>If you want to modify a IPsec-VPN connection in single-tunnel mode, call the <code>ModifyVpnConnectionAttribute</code> operation. You can modify the required parameters and the following request parameters:
     * <strong>ClientToken</strong>, <strong>Name</strong>, <strong>LocalSubnet</strong>, <strong>RemoteSubnet</strong>, <strong>EffectImmediately</strong>, <strong>IkeConfig</strong>, <strong>IpsecConfig</strong>, <strong>HealthCheckConfig</strong>, <strong>AutoConfigRoute</strong>, <strong>EnableDpd</strong>, <strong>EnableNatTraversal</strong>, <strong>BgpConfig</strong>, and <strong>RemoteCaCertificate</strong>.</li>
     * <li><strong>ModifyVpnConnectionAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and modifies the configuration of the IPsec-VPN connection in the backend. You can call the <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> operation to query the status of a VPN gateway.<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the configuration of the IPsec-VPN connection is being modified.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the configuration of the IPsec-VPN connection is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>ModifyVpnConnectionAttribute</strong> operation for the same VPN gateway within the specified period of time.</li>
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
     * <p>  <strong>ModifyVpnGatewayAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of the task.
     *     *   If the VPN gateway is in the <strong>updating</strong> state, the VPN gateway is being modified.
     *     *   If the VPN gateway is in the <strong>active</strong> state, the VPN gateway is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call <strong>ModifyVpnGatewayAttribute</strong> to modify a VPN gateway within the specified period of time.</li>
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
     * <p>  You can call the <strong>ModifyVpnPbrRouteEntryAttribute</strong> operation to modify the weight and priority of a policy-based route.
     *     *   If you want to modify only the weight of a policy-based route, call <a href="https://help.aliyun.com/document_detail/127249.html">ModifyVpnPbrRouteEntryWeight</a>.
     *     *   If you want to modify only the priority of a policy-based route, call <a href="https://help.aliyun.com/document_detail/466870.html">ModifyVpnPbrRouteEntryPriority</a>.
     *     *   If a policy-based route does not support priorities, you can only call <a href="https://help.aliyun.com/document_detail/127249.html">ModifyVpnPbrRouteEntryWeight</a> to modify its weight.</p>
     * <ul>
     * <li>The <strong>ModifyVpnPbrRouteEntryAttribute</strong> operation is asynchronous. After you send a request, the system returns a request ID, but the operation is still being performed in the system background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of a VPN gateway.<ul>
     * <li>If a VPN gateway is in the <strong>updating</strong> state, the policy-based route entry is being modified.</li>
     * <li>If a VPN gateway is in the <strong>active</strong> state, the policy-based route entry is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>ModifyVpnPbrRouteEntryAttribute</strong> operation for the same VPN gateway within the specified period of time.</li>
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
     * <p>  <strong>ModifyVpnPbrRouteEntryPriority</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of the task.
     *     *   If a VPN gateway is in the <strong>updating</strong> state, the policy-based route entry is being modified.
     *     *   If the VPN gateway is in the <strong>active</strong> state, the policy-based route is created.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>ModifyVpnPbrRouteEntryPriority</strong> operation for the same VPN gateway within the specified period of time.</li>
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
     * <p>  <strong>ModifyVpnPbrRouteEntryWeight</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of the task.
     *     *   If a VPN gateway is in the <strong>updating</strong> state, the policy-based route entry is being modified.
     *     *   If a VPN gateway is in the <strong>active</strong> state, the policy-based route entry is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>ModifyVpnPbrRouteEntryWeight</strong> operation for the same VPN gateway within the specified period of time.</li>
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
     * <p>  In scenarios where a VPN gateway has an active and a standby destination-based route, if you need to modify the weight of the active destination-based route, you must first delete the standby destination-based route. After you modify the active destination-based route, configure a standby destination-based route. If you need to modify the weight of the standby destination-based route, you also need to delete the active destination-based route first. After you modify the standby destination-based route, configure an active destination-based route. For more information about how to delete a destination-based route, see <a href="https://help.aliyun.com/document_detail/2526961.html">DeleteVpnRouteEntry</a>.</p>
     * <ul>
     * <li><strong>ModifyVpnRouteEntryWeight</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/73720.html">DescribeVpnGateway</a> to query the status of the task.<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the weight of the destination-based route is being modified.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the weight of the destination-based route is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>ModifyVpnRouteEntryWeight</strong> operation to modify the weight of destination-based route for the same VPN gateway within the specified period of time.</li>
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
     * <p>  You cannot repeatedly call the <strong>OpenFlowLogService</strong> operation within the specified period of time by using an Alibaba Cloud account.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/449624.html">GetFlowLogServiceStatus</a> operation to query the status of the flow log feature.</li>
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>You can enable traffic mirroring for different regions. You cannot repeatedly call the <strong>OpenTrafficMirrorService</strong> operation to enable traffic mirroring for one region within the specified period of time.</p>
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
     * <h1><a href="#"></a>Description</h1>
     * <p>You can call this API operation to resume a suspended Express Connect circuit. You can resume only shared Express Connect circuits by calling this API operation.</p>
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
     * <p>After you call this operation, the VBR changes from the <strong>terminated</strong> state to the <strong>recovering</strong> state. After the operation is performed, the VBR enters the <strong>active</strong> state.
     * When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Only the owner of the Express Connect circuit can call this operation.</li>
     * <li>The Express Connect circuit to which the VBR connects must be in the <strong>Enabled</strong> state.</li>
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
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Before you release an EIP, make sure that the EIP meets the following requirements:<ul>
     * <li>You can release only an EIP that is in the <strong>Available</strong> state.</li>
     * <li>You can release only a pay-as-you-go EIP. You cannot release a subscription EIP.</li>
     * </ul>
     * </li>
     * <li><strong>ReleaseEipAddress</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/120193.html">DescribeEipAddresses</a> operation to query the status of the task:<ul>
     * <li>If the EIP is in the <strong>Releasing</strong> state, the EIP is being released. In this state, you can only query the EIP and cannot perform other operations.</li>
     * <li>If you cannot query the EIP, the EIP is released.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>ReleaseEipAddress</strong> operation to release an EIP within the specified period of time.</li>
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
     * <p>  After you call the <strong>ReleaseEipSegmentAddress</strong> operation, all EIPs in the specified group are released.</p>
     * <ul>
     * <li><strong>ReleaseEipSegmentAddress</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/156063.html">DescribeEipSegment</a> operation to query the status of the task.<ul>
     * <li>If the group is in the <strong>Releasing</strong> state, EIPs in the group are being released. In this state, you can only query the group and cannot perform other operations.</li>
     * <li>If you cannot query the group of contiguous EIPs, the contiguous EIPs are released.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>ReleaseEipSegmentAddress</strong> operation to release a group of contiguous EIPs within the specified period of time.</li>
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
     * <p>  <strong>RemoveSourcesFromTrafficMirrorSession</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/261367.html">ListTrafficMirrorSessions</a> operation to query the status of the task.
     *     *   If the traffic mirror session is in the <strong>Modifying</strong> state, the traffic mirror source is being deleted.
     *     *   If the traffic mirror session is in the <strong>Created</strong> state, the traffic mirror source is deleted.</p>
     * <ul>
     * <li>You cannot repeatedly call <strong>RemoveSourcesFromTrafficMirrorSession</strong> within the specified period of time.</li>
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
     * <p>  The <strong>ReplaceVpcDhcpOptionsSet</strong> operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/94565.html">DescribeVpcAttribute</a> operation to query the status of a DHCP options set:
     *     *   If the DHCP options set is in the <strong>Pending</strong> state, the DHCP options set is being replaced.
     *     *   If the DHCP options set is in the <strong>InUse</strong> state, the DHCP options set is replaced.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>ReplaceVpcDhcpOptionsSet</strong> operation to replace the DHCP options set associated with a VPC within the specified period of time.</li>
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
     * <p>  If you modify the information about a prefix list but the modification is not automatically applied to the route table that is associated with the prefix list, you can call this operation to apply the latest prefix list to the associated route table.</p>
     * <ul>
     * <li>The <strong>RetryVpcPrefixListAssociation</strong> operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the background. You can call the <a href="https://help.aliyun.com/document_detail/445478.html">GetVpcPrefixListAssociations</a> to check whether the prefix list is re-applied.<ul>
     * <li>If the prefix list is in the <strong>Modifying</strong> state, the prefix list is being re-applied.</li>
     * <li>If the prefix list is in the <strong>ModifyFailed</strong> state, the prefix list fails to be re-applied.</li>
     * <li>If the prefix list is in the <strong>Created</strong> state, the prefix list is re-applied.</li>
     * </ul>
     * </li>
     * <li>After you call the <strong>RetryVpcPrefixListAssociation</strong> operation to re-apply a prefix list, you cannot call the operation again until the current task is complete.</li>
     * </ul>
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
     * <h2><a href="#"></a>Usage notes</h2>
     * <ul>
     * <li><strong>RevokeInstanceFromCen</strong> is a Virtual Private Cloud (VPC) operation. Therefore, you must use <code>vpc.aliyuncs.com</code> as the domain name when you call this operation. The API version is <code>2016-04-28</code>.</li>
     * <li>You cannot repeatedly call the <strong>RevokeInstanceFromCen</strong> operation to revoke the permissions on a network instance that is attached to a CEN instance within the specified period of time. The network instance can be a VPC, virtual border router (VBR), or a Cloud Connect Network (CCN) instance.</li>
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
     * <p>You cannot repeatedly call <strong>SetHighDefinitionMonitorLogStatus</strong> within a specific period of time.</p>
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
     * <p>You can perform only failover tests that are in the <strong>Pending</strong> state.</p>
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
     * <p>Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following limits:</p>
     * <ul>
     * <li>The keys of tags that are added to the same instance must be unique.</li>
     * <li>You cannot create tags without adding them to instances. All tags must be added to instances.</li>
     * <li>Tag information is not shared across regions.
     * For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.</li>
     * <li>Virtual private clouds (VPCs), route tables, vSwitches, and elastic IP addresses (EIPs) that belong to the same Alibaba Cloud account and are deployed in the same region share tag information with each other.
     * For example, if you added a tag to a VPC, the tag is available to vSwitches, route tables, and EIPs that belong to the same account and are deployed in the same region in which the VPC is created. You can select this tag from the editing page without the need to enter the tag again. You can modify the key and the value of a tag or remove a tag from an instance. After you delete an instance, all tags that are added to the instance are deleted.</li>
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
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * <p>Tags are used to classify instances. Each tag consists of a key-value pair. Before you use tags, take note of the following items:</p>
     * <ul>
     * <li>Each tag key that is added to an instance must be unique.</li>
     * <li>You cannot create tags without adding them to instances. All tags must be added to instances.</li>
     * <li>Tag information is not shared across regions.
     * For example, you cannot view the tags that are created in the China (Hangzhou) region from the China (Shanghai) region.</li>
     * <li>You can add up to 20 tags to each instance. Before you add a tag to an instance, the system automatically checks the number of existing tags. An error message is returned if the maximum number of tags is reached.</li>
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
     * <p>After you call this operation, the specified Express Connect circuit changes to the <strong>Terminating</strong> state. After the Express Connect circuit is disabled, it changes to the <strong>Terminated</strong> state. When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>You can only disable an Express Connect circuit that is in the <strong>Enabled</strong> state.</li>
     * <li>Before you disable an Express Connect circuit, you must delete the virtual border routers (VBRs) associated with it.</li>
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
     * <p>After you call this operation, the VBR enters the <strong>terminating</strong> state from the <strong>active</strong> state. After the VBR is terminated, the VBR enters the <strong>terminated</strong> state.</p>
     * <blockquote>
     * <p> Only the owner of an Express Connect circuit can call this operation.</p>
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
     * <p>  <strong>UnassociateEipAddress</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/120193.html">DescribeEipAddresses</a> operation to query the status of the task.
     *     *   If the EIP is in the <strong>Unassociating</strong> state, the EIP is being disassociated. In this state, you can only query the EIP and cannot perform other operations.
     *     *   If the EIP is in the <strong>Available</strong> state, the EIP is disassociated.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>UnassociateEipAddress</strong> operation within the specified period of time.</li>
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
     * <h2><a href="#"></a></h2>
     * <p>When you call this operation, take note of the following limits:</p>
     * <ul>
     * <li>The ECS instance must be in the <strong>Running</strong> or <strong>Stopped</strong> state.</li>
     * <li>The HAVIP must be in the <strong>Available</strong> or <strong>InUse</strong> state.</li>
     * <li><strong>UnassociateHaVip</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and an instance ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/114611.html">DescribeHaVips</a> operation to query the status of an HAVIP:<ul>
     * <li>If the HAVIP is in the <strong>Unassociating</strong> state, the HAVIP is being disassociated.</li>
     * <li>If the HAVIP is in the <strong>Inuse</strong> or <strong>Available</strong> state, the HAVIP is disassociated.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UnassociateHaVip</strong> operation to disassociate an HAVIP within the specified period of time.</li>
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
     * <h2><a href="#"></a>Description</h2>
     * <ul>
     * <li><strong>UnassociateNetworkAcl</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/116542.html">DescribeNetworkAclAttributes</a> operation to query the status of the task.<ul>
     * <li>If the network ACL is in the <strong>UNBINDING</strong> state, the network ACL is being disassociated from the vSwitch.</li>
     * <li>If the network ACL is in the <strong>UNBINDED</strong> state, the network ACL is disassociated from the vSwitch.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UnassociateNetworkAcl</strong> operation to disassociate a network ACL from a vSwitch within the specified period of time.</li>
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
     * <h2><a href="#"></a>References</h2>
     * <ul>
     * <li><strong>UnassociateRouteTable</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/94567.html">DescribeVSwitchAttributes</a> operation to query the status of the task.<ul>
     * <li>If the vSwitch is in the <strong>Pending</strong> state, the route table is being disassociated.</li>
     * <li>If the vSwitch is in the <strong>Available</strong> state, the route table is disassociated.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UnassociateRouteTable</strong> operation to disassociate a route table from a vSwitch within the specified period of time.</li>
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
     * <p>  Before you delete a secondary CIDR block from a VPC, delete the vSwitch which is created with the CIDR block. For more information, see <a href="https://help.aliyun.com/document_detail/35746.html">DeleteVSwitch</a>.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>UnassociateVpcCidrBlock</strong> operation to delete a secondary CIDR block from a VPC within the specified period of time.</li>
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
     * <p>  If you modify only <strong>IpsecServerName</strong> of the IPsec server, this operation is synchronous. If you modify other parameters besides <strong>IpsecServerName</strong>, this operation is asynchronous.</p>
     * <ul>
     * <li>If <strong>UpdateIpsecServer</strong> is an asynchronous operation, after a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/2794055.html">DescribeVpnGateway</a> operation to query the status of the task.<ul>
     * <li>If the VPN gateway is in the <strong>updating</strong> state, the IPsec server is being modified.</li>
     * <li>If the VPN gateway is in the <strong>active</strong> state, the IPsec server is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call <strong>UpdateIpsecServer</strong> within the specified period of time.</li>
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
     * <p>You cannot repeatedly call the <strong>UpdateIpv4GatewayAttribute</strong> operation to modify the name or description of an IPv4 gateway within the specified period of time.</p>
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
     * @deprecated OpenAPI UpdateNatGatewayNatType is deprecated  * @description Before you call this operation, take note of the following limits:
     * *   **UpdateNatGatewayNatType** is an asynchronous operation. After you send a request to call this operation, the system returns a request ID and the NAT gateway is still being upgraded in the backend. You can call the GetNatGatewayConvertStatus operation to query the upgrade progress of a NAT gateway. For more information, see [GetNatGatewayConvertStatus](https://help.aliyun.com/document_detail/184744.html).
     *     *   If the NAT gateway is in the **processing** state, the NAT gateway is being upgraded. You can only query the status of the NAT gateway but cannot perform other operations.
     *     *   If the NAT gateway is in the **successful** state, the NAT gateway is upgraded.
     *     *   If the NAT gateway is in the **failed** state, the system failed to upgrade the NAT gateway.
     * *   You cannot repeatedly call the **UpdateNatGatewayNatType** operation for the same VPN gateway within the specified period of time.
     * *   The billing method and billable items remain the same after the upgrade.
     * *   It takes about five minutes to upgrade a standard NAT gateway to an enhanced NAT gateway. During the upgrade, transient connection errors may occur once or twice. The service can be recovered by reconnection. You can determine whether to enable automatic reconnection or use manual reconnection based on your business requirements.
     * *   You can only upgrade standard NAT gateways to enhanced NAT gateways. You are not allowed to downgrade enhanced NAT gateways to standard NAT gateways.
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
     * <p>  <strong>UpdateNetworkAclEntries</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/116542.html">DescribeNetworkAclAttributes</a> operation to query the status of a network ACL:
     *     *   If the network ACL is in the <strong>Modifying</strong> state, the rules of the network ACL are being updated.
     *     *   If the network ACL is in the <strong>Available</strong> state, the rules of the network ACL are updated.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>UpdateNetworkAclEntries</strong> operation to update the rules of a network ACL within the specified period of time.</li>
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
     * <p>You cannot repeatedly call the <strong>UpdatePublicIpAddressPoolAttribute</strong> operation to modify the attributes of an IP address pool within the specified period of time.</p>
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
     * <p>You cannot repeatedly call the <strong>UpdateTrafficMirrorFilterAttribute</strong> operation to modify the configuration of a filter for traffic mirroring within the specified period of time.</p>
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
     * <p>  The <strong>UpdateTrafficMirrorFilterRuleAttribute</strong> operation is asynchronous. After you send the request, the system returns a request ID. However, the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/261353.html">ListTrafficMirrorFilters</a> operation to query the status of an inbound or outbound rule:
     *     *   If the rule is in the <strong>Modifying</strong> state, the rule is being modified.
     *     *   If the rule is in the <strong>Created</strong> state, the rule is modified.</p>
     * <ul>
     * <li>You cannot repeatedly call the <strong>UpdateTrafficMirrorFilterRuleAttribute</strong> operation to modify an inbound or outbound rule within the specified period of time.</li>
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
     * <h2>Usage notes</h2>
     * <ul>
     * <li><strong>UpdateTrafficMirrorSessionAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/261367.html">ListTrafficMirrorSessions</a> operation to query the status of the task.<ul>
     * <li>If the traffic mirror session is in the <strong>Modifying</strong> state, the configuration of the traffic mirror session is being modified.</li>
     * <li>If the traffic mirror session is in the <strong>Created</strong> state, the configuration of the traffic mirror session is modified.</li>
     * </ul>
     * </li>
     * <li>You cannot repeatedly call the <strong>UpdateTrafficMirrorSessionAttribute</strong> operation within a specific period of time.</li>
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
     * <p>  <strong>UpdateVpcGatewayEndpointAttribute</strong> is an asynchronous operation. After a request is sent, the system returns a <strong>request ID</strong> and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/311017.html">GetVpcGatewayEndpointAttribute</a> operation to query the status of the task.
     *     *   If the gateway endpoint is in the <strong>Updating</strong> state, it is being modified.
     *     *   If the gateway endpoint is in the <strong>Created</strong> state, it is modified.</p>
     * <ul>
     * <li>You cannot call the <strong>UpdateVpcGatewayEndpointAttribute</strong> operation within a specific period of time.</li>
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
     * <p>Before you call this operation, make sure that a VPC NAT gateway is created. For more information, see <a href="https://help.aliyun.com/document_detail/120219.html">CreateNatGateway</a>.</p>
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
