// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.nlb20220430.models.*;
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
        this.product = "Nlb";
        this.version = "2022-04-30";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of AddServersToServerGroup  AddServersToServerGroupRequest
     * @return AddServersToServerGroupResponse
     */
    @Override
    public CompletableFuture<AddServersToServerGroupResponse> addServersToServerGroup(AddServersToServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddServersToServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddServersToServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddServersToServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>AssociateAdditionalCertificatesWithListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/615175.html">ListListenerCertificates</a> operation to query the status of the task:</p>
     * <ul>
     * <li>If the listener is in the <strong>Associating</strong> state, the additional certificates are being associated.</li>
     * <li>If the listener is in the <strong>Associated</strong> state, the additional certificates are associated.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateAdditionalCertificatesWithListener  AssociateAdditionalCertificatesWithListenerRequest
     * @return AssociateAdditionalCertificatesWithListenerResponse
     */
    @Override
    public CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> associateAdditionalCertificatesWithListener(AssociateAdditionalCertificatesWithListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateAdditionalCertificatesWithListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateAdditionalCertificatesWithListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateAdditionalCertificatesWithListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AttachCommonBandwidthPackageToLoadBalancer  AttachCommonBandwidthPackageToLoadBalancerRequest
     * @return AttachCommonBandwidthPackageToLoadBalancerResponse
     */
    @Override
    public CompletableFuture<AttachCommonBandwidthPackageToLoadBalancerResponse> attachCommonBandwidthPackageToLoadBalancer(AttachCommonBandwidthPackageToLoadBalancerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AttachCommonBandwidthPackageToLoadBalancer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AttachCommonBandwidthPackageToLoadBalancerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AttachCommonBandwidthPackageToLoadBalancerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, the zone of the Network Load Balancer (NLB) instance is removed from the DNS record by using the console or calling the <a href="https://help.aliyun.com/document_detail/2411999.html">StartShiftLoadBalancerZones</a> API operation.</p>
     * 
     * @param request the request parameters of CancelShiftLoadBalancerZones  CancelShiftLoadBalancerZonesRequest
     * @return CancelShiftLoadBalancerZonesResponse
     */
    @Override
    public CompletableFuture<CancelShiftLoadBalancerZonesResponse> cancelShiftLoadBalancerZones(CancelShiftLoadBalancerZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CancelShiftLoadBalancerZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CancelShiftLoadBalancerZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CancelShiftLoadBalancerZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateListener  CreateListenerRequest
     * @return CreateListenerResponse
     */
    @Override
    public CompletableFuture<CreateListenerResponse> createListener(CreateListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  When you create an NLB instance, the service-linked role AliyunServiceRoleForNlb is automatically created and assigned to you.</p>
     * <ul>
     * <li><strong>CreateLoadBalancer</strong> is an asynchronous operation. After you send a request, the system returns an instance ID and runs the task in the background. You can call <a href="https://help.aliyun.com/document_detail/445873.html">GetLoadBalancerAttribute</a> to query the status of an NLB instance.<ul>
     * <li>If an NLB instance is in the <strong>Provisioning</strong> state, the NLB instance is being created.</li>
     * <li>If an NLB instance is in the <strong>Active</strong> state, the NLB instance is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of CreateLoadBalancer  CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    @Override
    public CompletableFuture<CreateLoadBalancerResponse> createLoadBalancer(CreateLoadBalancerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateLoadBalancer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateLoadBalancerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateLoadBalancerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSecurityPolicy  CreateSecurityPolicyRequest
     * @return CreateSecurityPolicyResponse
     */
    @Override
    public CompletableFuture<CreateSecurityPolicyResponse> createSecurityPolicy(CreateSecurityPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSecurityPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSecurityPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSecurityPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>CreateServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/445904.html">GetJobStatus</a> operation to query the creation status of the task.</p>
     * <ul>
     * <li>If the task is in the <strong>Succeeded</strong> status, the server group is created.</li>
     * <li>If the task is in the <strong>Processing</strong> status, the server group is being created.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateServerGroup  CreateServerGroupRequest
     * @return CreateServerGroupResponse
     */
    @Override
    public CompletableFuture<CreateServerGroupResponse> createServerGroup(CreateServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteListener  DeleteListenerRequest
     * @return DeleteListenerResponse
     */
    @Override
    public CompletableFuture<DeleteListenerResponse> deleteListener(DeleteListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteLoadBalancer  DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    @Override
    public CompletableFuture<DeleteLoadBalancerResponse> deleteLoadBalancer(DeleteLoadBalancerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteLoadBalancer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteLoadBalancerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteLoadBalancerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSecurityPolicy  DeleteSecurityPolicyRequest
     * @return DeleteSecurityPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteSecurityPolicyResponse> deleteSecurityPolicy(DeleteSecurityPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSecurityPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSecurityPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSecurityPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can delete server groups that are not associated with listeners.</p>
     * 
     * @param request the request parameters of DeleteServerGroup  DeleteServerGroupRequest
     * @return DeleteServerGroupResponse
     */
    @Override
    public CompletableFuture<DeleteServerGroupResponse> deleteServerGroup(DeleteServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHdMonitorRegionConfig  DescribeHdMonitorRegionConfigRequest
     * @return DescribeHdMonitorRegionConfigResponse
     */
    @Override
    public CompletableFuture<DescribeHdMonitorRegionConfigResponse> describeHdMonitorRegionConfig(DescribeHdMonitorRegionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHdMonitorRegionConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHdMonitorRegionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHdMonitorRegionConfigResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRegions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * @param request the request parameters of DetachCommonBandwidthPackageFromLoadBalancer  DetachCommonBandwidthPackageFromLoadBalancerRequest
     * @return DetachCommonBandwidthPackageFromLoadBalancerResponse
     */
    @Override
    public CompletableFuture<DetachCommonBandwidthPackageFromLoadBalancerResponse> detachCommonBandwidthPackageFromLoadBalancer(DetachCommonBandwidthPackageFromLoadBalancerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DetachCommonBandwidthPackageFromLoadBalancer").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DetachCommonBandwidthPackageFromLoadBalancerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DetachCommonBandwidthPackageFromLoadBalancerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableLoadBalancerIpv6Internet  DisableLoadBalancerIpv6InternetRequest
     * @return DisableLoadBalancerIpv6InternetResponse
     */
    @Override
    public CompletableFuture<DisableLoadBalancerIpv6InternetResponse> disableLoadBalancerIpv6Internet(DisableLoadBalancerIpv6InternetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableLoadBalancerIpv6Internet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableLoadBalancerIpv6InternetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableLoadBalancerIpv6InternetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>DisassociateAdditionalCertificatesWithListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/615175.html">ListListenerCertificates</a> operation to query the status of the task:</p>
     * <ul>
     * <li>If an additional certificate is in the <strong>Dissociating</strong> state, the additional certificate is being disassociated.</li>
     * <li>If an additional certificate is in the <strong>Dissociated</strong> state, the additional certificate is disassociated.</li>
     * </ul>
     * 
     * @param request the request parameters of DisassociateAdditionalCertificatesWithListener  DisassociateAdditionalCertificatesWithListenerRequest
     * @return DisassociateAdditionalCertificatesWithListenerResponse
     */
    @Override
    public CompletableFuture<DisassociateAdditionalCertificatesWithListenerResponse> disassociateAdditionalCertificatesWithListener(DisassociateAdditionalCertificatesWithListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisassociateAdditionalCertificatesWithListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisassociateAdditionalCertificatesWithListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisassociateAdditionalCertificatesWithListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableLoadBalancerIpv6Internet  EnableLoadBalancerIpv6InternetRequest
     * @return EnableLoadBalancerIpv6InternetResponse
     */
    @Override
    public CompletableFuture<EnableLoadBalancerIpv6InternetResponse> enableLoadBalancerIpv6Internet(EnableLoadBalancerIpv6InternetRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableLoadBalancerIpv6Internet").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableLoadBalancerIpv6InternetResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableLoadBalancerIpv6InternetResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetJobStatus  GetJobStatusRequest
     * @return GetJobStatusResponse
     */
    @Override
    public CompletableFuture<GetJobStatusResponse> getJobStatus(GetJobStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetJobStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetJobStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetJobStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetListenerAttribute  GetListenerAttributeRequest
     * @return GetListenerAttributeResponse
     */
    @Override
    public CompletableFuture<GetListenerAttributeResponse> getListenerAttribute(GetListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetListenerHealthStatus  GetListenerHealthStatusRequest
     * @return GetListenerHealthStatusResponse
     */
    @Override
    public CompletableFuture<GetListenerHealthStatusResponse> getListenerHealthStatus(GetListenerHealthStatusRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetListenerHealthStatus").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetListenerHealthStatusResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetListenerHealthStatusResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetLoadBalancerAttribute  GetLoadBalancerAttributeRequest
     * @return GetLoadBalancerAttributeResponse
     */
    @Override
    public CompletableFuture<GetLoadBalancerAttributeResponse> getLoadBalancerAttribute(GetLoadBalancerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetLoadBalancerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetLoadBalancerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetLoadBalancerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListListenerCertificates  ListListenerCertificatesRequest
     * @return ListListenerCertificatesResponse
     */
    @Override
    public CompletableFuture<ListListenerCertificatesResponse> listListenerCertificates(ListListenerCertificatesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListListenerCertificates").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListListenerCertificatesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListListenerCertificatesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListListeners  ListListenersRequest
     * @return ListListenersResponse
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

    /**
     * @param request the request parameters of ListLoadBalancers  ListLoadBalancersRequest
     * @return ListLoadBalancersResponse
     */
    @Override
    public CompletableFuture<ListLoadBalancersResponse> listLoadBalancers(ListLoadBalancersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListLoadBalancers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListLoadBalancersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListLoadBalancersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSecurityPolicy  ListSecurityPolicyRequest
     * @return ListSecurityPolicyResponse
     */
    @Override
    public CompletableFuture<ListSecurityPolicyResponse> listSecurityPolicy(ListSecurityPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSecurityPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSecurityPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSecurityPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServerGroupServers  ListServerGroupServersRequest
     * @return ListServerGroupServersResponse
     */
    @Override
    public CompletableFuture<ListServerGroupServersResponse> listServerGroupServers(ListServerGroupServersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServerGroupServers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServerGroupServersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServerGroupServersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListServerGroups  ListServerGroupsRequest
     * @return ListServerGroupsResponse
     */
    @Override
    public CompletableFuture<ListServerGroupsResponse> listServerGroups(ListServerGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListServerGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListServerGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListServerGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSystemSecurityPolicy  ListSystemSecurityPolicyRequest
     * @return ListSystemSecurityPolicyResponse
     */
    @Override
    public CompletableFuture<ListSystemSecurityPolicyResponse> listSystemSecurityPolicy(ListSystemSecurityPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSystemSecurityPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSystemSecurityPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSystemSecurityPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListTagResources  ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    @Override
    public CompletableFuture<ListTagResourcesResponse> listTagResources(ListTagResourcesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListTagResources").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
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
     * <p>  Make sure that you have created a security group. For more information about how to create a security group, see <a href="https://help.aliyun.com/document_detail/25553.html">CreateSecurityGroup</a>.</p>
     * <ul>
     * <li>An NLB instance can be associated with up to four security groups.</li>
     * <li>You can query the security groups that are associated with an NLB instance by calling the <a href="https://help.aliyun.com/document_detail/214362.html">GetLoadBalancerAttribute</a> operation.</li>
     * <li>LoadBalancerJoinSecurityGroup is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/445904.html">GetJobStatus</a> operation to query the status of a task.<ul>
     * <li>If the task is in the <strong>Succeeded</strong> state, the security group is associated.</li>
     * <li>If the task is in the <strong>Processing</strong> state, the security group is being associated. In this case, you can perform only query operations.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of LoadBalancerJoinSecurityGroup  LoadBalancerJoinSecurityGroupRequest
     * @return LoadBalancerJoinSecurityGroupResponse
     */
    @Override
    public CompletableFuture<LoadBalancerJoinSecurityGroupResponse> loadBalancerJoinSecurityGroup(LoadBalancerJoinSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LoadBalancerJoinSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LoadBalancerJoinSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LoadBalancerJoinSecurityGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>LoadBalancerLeaveSecurityGroup is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/445904.html">GetJobStatus</a> operation to query the status of a task.</p>
     * <ul>
     * <li>If the task is in the <strong>Succeeded</strong> state, the security group is disassociated.</li>
     * <li>If the task is in the <strong>Processing</strong> state, the security group is being disassociated. In this case, you can perform only query operations.</li>
     * </ul>
     * 
     * @param request the request parameters of LoadBalancerLeaveSecurityGroup  LoadBalancerLeaveSecurityGroupRequest
     * @return LoadBalancerLeaveSecurityGroupResponse
     */
    @Override
    public CompletableFuture<LoadBalancerLeaveSecurityGroupResponse> loadBalancerLeaveSecurityGroup(LoadBalancerLeaveSecurityGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("LoadBalancerLeaveSecurityGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(LoadBalancerLeaveSecurityGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<LoadBalancerLeaveSecurityGroupResponse> future = new CompletableFuture<>();
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
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("MoveResourceGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(MoveResourceGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<MoveResourceGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RemoveServersFromServerGroup  RemoveServersFromServerGroupRequest
     * @return RemoveServersFromServerGroupResponse
     */
    @Override
    public CompletableFuture<RemoveServersFromServerGroupResponse> removeServersFromServerGroup(RemoveServersFromServerGroupRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RemoveServersFromServerGroup").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RemoveServersFromServerGroupResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RemoveServersFromServerGroupResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation is used to configure a data warehouse for the fine-grained monitoring feature. If a listener in the current region has fine-grained monitoring enabled, you must disable fine-grained monitoring before you can configure a warehouse.</p>
     * 
     * @param request the request parameters of SetHdMonitorRegionConfig  SetHdMonitorRegionConfigRequest
     * @return SetHdMonitorRegionConfigResponse
     */
    @Override
    public CompletableFuture<SetHdMonitorRegionConfigResponse> setHdMonitorRegionConfig(SetHdMonitorRegionConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetHdMonitorRegionConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetHdMonitorRegionConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetHdMonitorRegionConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StartListener  StartListenerRequest
     * @return StartListenerResponse
     */
    @Override
    public CompletableFuture<StartListenerResponse> startListener(StartListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If the NLB instance is deployed in only one zone, you cannot remove the EIP or VIP from the DNS record.</p>
     * </blockquote>
     * 
     * @param request the request parameters of StartShiftLoadBalancerZones  StartShiftLoadBalancerZonesRequest
     * @return StartShiftLoadBalancerZonesResponse
     */
    @Override
    public CompletableFuture<StartShiftLoadBalancerZonesResponse> startShiftLoadBalancerZones(StartShiftLoadBalancerZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StartShiftLoadBalancerZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StartShiftLoadBalancerZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StartShiftLoadBalancerZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of StopListener  StopListenerRequest
     * @return StopListenerResponse
     */
    @Override
    public CompletableFuture<StopListenerResponse> stopListener(StopListenerRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("StopListener").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(StopListenerResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<StopListenerResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of UpdateListenerAttribute  UpdateListenerAttributeRequest
     * @return UpdateListenerAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateListenerAttributeResponse> updateListenerAttribute(UpdateListenerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateListenerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateListenerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateListenerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Make sure that an NLB instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/445868.html">CreateLoadBalancer</a>.</p>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/445873.html">GetLoadBalancerAttribute</a> operation to query the <strong>AddressType</strong> value of an NLB instance after you change the network type.</li>
     * <li><strong>UpdateLoadBalancerAddressTypeConfig</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/445904.html">GetJobStatus</a> operation to query the task status:<ul>
     * <li>If the task is in the <strong>Succeeded</strong> state, the network type of the IPv4 address of the NLB instance is changed.</li>
     * <li>If the task is in the <strong>Processing</strong> state, the network type of the IPv4 address of the NLB instance is being changed. In this case, you can perform only query operations.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerAddressTypeConfig  UpdateLoadBalancerAddressTypeConfigRequest
     * @return UpdateLoadBalancerAddressTypeConfigResponse
     */
    @Override
    public CompletableFuture<UpdateLoadBalancerAddressTypeConfigResponse> updateLoadBalancerAddressTypeConfig(UpdateLoadBalancerAddressTypeConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLoadBalancerAddressTypeConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLoadBalancerAddressTypeConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLoadBalancerAddressTypeConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateLoadBalancerAttribute  UpdateLoadBalancerAttributeRequest
     * @return UpdateLoadBalancerAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateLoadBalancerAttributeResponse> updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLoadBalancerAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLoadBalancerAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLoadBalancerAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/445873.html">GetLoadBalancerAttribute</a> operation to query the details about deletion protection and the configuration read-only mode.</p>
     * </blockquote>
     * 
     * @param request the request parameters of UpdateLoadBalancerProtection  UpdateLoadBalancerProtectionRequest
     * @return UpdateLoadBalancerProtectionResponse
     */
    @Override
    public CompletableFuture<UpdateLoadBalancerProtectionResponse> updateLoadBalancerProtection(UpdateLoadBalancerProtectionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLoadBalancerProtection").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLoadBalancerProtectionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLoadBalancerProtectionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, make sure that you specify all the zones of the NLB instance, including the existing zones and new zones. If you do not specify the existing zones, the existing zones are removed.
     * Prerequisites</p>
     * <ul>
     * <li>An NLB instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/445868.html">CreateLoadBalancer</a>.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/445873.html">GetLoadBalancerAttribute</a> operation to query the zones and zone attributes of an NLB instance.</li>
     * <li><strong>UpdateLoadBalancerZones</strong> is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <a href="https://help.aliyun.com/document_detail/445904.html">GetJobStatus</a> operation query to query the status of a task:<ul>
     * <li>If the task is in the <strong>Succeeded</strong> state, the zones and zone attributes are modified.</li>
     * <li>If the task is in the <strong>Processing</strong> state, the zones and zone attributes are being modified. In this case, you can perform only query operations.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param request the request parameters of UpdateLoadBalancerZones  UpdateLoadBalancerZonesRequest
     * @return UpdateLoadBalancerZonesResponse
     */
    @Override
    public CompletableFuture<UpdateLoadBalancerZonesResponse> updateLoadBalancerZones(UpdateLoadBalancerZonesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateLoadBalancerZones").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateLoadBalancerZonesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateLoadBalancerZonesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSecurityPolicyAttribute  UpdateSecurityPolicyAttributeRequest
     * @return UpdateSecurityPolicyAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateSecurityPolicyAttributeResponse> updateSecurityPolicyAttribute(UpdateSecurityPolicyAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSecurityPolicyAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSecurityPolicyAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSecurityPolicyAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateServerGroupAttribute  UpdateServerGroupAttributeRequest
     * @return UpdateServerGroupAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateServerGroupAttributeResponse> updateServerGroupAttribute(UpdateServerGroupAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateServerGroupAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServerGroupAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServerGroupAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateServerGroupServersAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/445895.html">ListServerGroups</a> operation to query the status of a server group.<ul>
     * <li>If a server group is in the <strong>Configuring</strong> state, the server group is being modified.</li>
     * <li>If a server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * </li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/445896.html">ListServerGroupServers</a> operation to query the status of a backend server.<ul>
     * <li>If a backend server is in the <strong>Configuring</strong> state, it indicates that the backend server is being modified.</li>
     * <li>If a backend server is in the <strong>Available</strong> state, it indicates that the backend server is running.</li>
     * </ul>
     * </li>
     * </ol>
     * 
     * @param request the request parameters of UpdateServerGroupServersAttribute  UpdateServerGroupServersAttributeRequest
     * @return UpdateServerGroupServersAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateServerGroupServersAttributeResponse> updateServerGroupServersAttribute(UpdateServerGroupServersAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateServerGroupServersAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(true).setReqBodyType(BodyType.FORM).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateServerGroupServersAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateServerGroupServersAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
