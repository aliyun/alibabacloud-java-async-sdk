// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313;

import com.aliyun.core.http.*;
import com.aliyun.sdk.service.smartag20180313.models.*;
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
        this.product = "Smartag";
        this.version = "2018-03-13";
        this.endpointRule = "regional";
        this.endpointMap = new java.util.HashMap<>();
        this.REQUEST = TeaRequest.create().setProduct(product).setEndpointRule(endpointRule).setEndpointMap(endpointMap).setVersion(version);
    }

    @Override
    public void close() {
        this.handler.close();
    }

    /**
     * @param request the request parameters of ActivateSmartAccessGateway  ActivateSmartAccessGatewayRequest
     * @return ActivateSmartAccessGatewayResponse
     */
    @Override
    public CompletableFuture<ActivateSmartAccessGatewayResponse> activateSmartAccessGateway(ActivateSmartAccessGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ActivateSmartAccessGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ActivateSmartAccessGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ActivateSmartAccessGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of AddACLRule  AddACLRuleRequest
     * @return AddACLRuleResponse
     */
    @Override
    public CompletableFuture<AddACLRuleResponse> addACLRule(AddACLRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddACLRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddACLRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddACLRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddDnatEntry  AddDnatEntryRequest
     * @return AddDnatEntryResponse
     */
    @Override
    public CompletableFuture<AddDnatEntryResponse> addDnatEntry(AddDnatEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddDnatEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddDnatEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddDnatEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddSmartAccessGatewayDnsForward  AddSmartAccessGatewayDnsForwardRequest
     * @return AddSmartAccessGatewayDnsForwardResponse
     */
    @Override
    public CompletableFuture<AddSmartAccessGatewayDnsForwardResponse> addSmartAccessGatewayDnsForward(AddSmartAccessGatewayDnsForwardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddSmartAccessGatewayDnsForward").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSmartAccessGatewayDnsForwardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSmartAccessGatewayDnsForwardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AddSnatEntry  AddSnatEntryRequest
     * @return AddSnatEntryResponse
     */
    @Override
    public CompletableFuture<AddSnatEntryResponse> addSnatEntry(AddSnatEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AddSnatEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AddSnatEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AddSnatEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssociateACL  AssociateACLRequest
     * @return AssociateACLResponse
     */
    @Override
    public CompletableFuture<AssociateACLResponse> associateACL(AssociateACLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateACL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateACLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateACLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssociateFlowLog  AssociateFlowLogRequest
     * @return AssociateFlowLogResponse
     */
    @Override
    public CompletableFuture<AssociateFlowLogResponse> associateFlowLog(AssociateFlowLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateFlowLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateFlowLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateFlowLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of AssociateQos  AssociateQosRequest
     * @return AssociateQosResponse
     */
    @Override
    public CompletableFuture<AssociateQosResponse> associateQos(AssociateQosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateQos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateQosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateQosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you associate a bandwidth plan for application acceleration with an SAG instance, make sure that the following requirements are met:</p>
     * <ul>
     * <li>If you want to associate a bandwidth plan for application acceleration with an SAG CPE instance, the version of the SAG device associated with the SAG CPE instance must be 2.4.0 or later.
     * If the version of the SAG device is earlier than 2.4.0, update it. For more information, see <a href="https://help.aliyun.com/document_detail/163948.html">Update the version of an SAG device</a>.</li>
     * <li>If you want to associate a bandwidth plan for application acceleration with an SAG app instance, the version of the SAG app must be 2.4.0 or later.
     * If the version of the SAG app is earlier than 2.4.0, update it. For more information, see <a href="https://help.aliyun.com/document_detail/102544.html">Install the SAG app</a>.</li>
     * <li>The SAG instance to be associated is in the available state.</li>
     * </ul>
     * 
     * @param request the request parameters of AssociateSmartAGWithApplicationBandwidthPackage  AssociateSmartAGWithApplicationBandwidthPackageRequest
     * @return AssociateSmartAGWithApplicationBandwidthPackageResponse
     */
    @Override
    public CompletableFuture<AssociateSmartAGWithApplicationBandwidthPackageResponse> associateSmartAGWithApplicationBandwidthPackage(AssociateSmartAGWithApplicationBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("AssociateSmartAGWithApplicationBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(AssociateSmartAGWithApplicationBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<AssociateSmartAGWithApplicationBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindSerialNumber  BindSerialNumberRequest
     * @return BindSerialNumberResponse
     */
    @Override
    public CompletableFuture<BindSerialNumberResponse> bindSerialNumber(BindSerialNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindSerialNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindSerialNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindSerialNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindSmartAccessGateway  BindSmartAccessGatewayRequest
     * @return BindSmartAccessGatewayResponse
     */
    @Override
    public CompletableFuture<BindSmartAccessGatewayResponse> bindSmartAccessGateway(BindSmartAccessGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindSmartAccessGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindSmartAccessGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindSmartAccessGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of BindVbr  BindVbrRequest
     * @return BindVbrResponse
     */
    @Override
    public CompletableFuture<BindVbrResponse> bindVbr(BindVbrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("BindVbr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(BindVbrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<BindVbrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClearSagCipher  ClearSagCipherRequest
     * @return ClearSagCipherResponse
     */
    @Override
    public CompletableFuture<ClearSagCipherResponse> clearSagCipher(ClearSagCipherRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClearSagCipher").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClearSagCipherResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClearSagCipherResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ClearSagRouteableAddress  ClearSagRouteableAddressRequest
     * @return ClearSagRouteableAddressResponse
     */
    @Override
    public CompletableFuture<ClearSagRouteableAddressResponse> clearSagRouteableAddress(ClearSagRouteableAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ClearSagRouteableAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ClearSagRouteableAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ClearSagRouteableAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateACL  CreateACLRequest
     * @return CreateACLResponse
     */
    @Override
    public CompletableFuture<CreateACLResponse> createACL(CreateACLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateACL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateACLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateACLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>CCN is a matrix consisting of Alibaba Cloud distributed access gateways. It is an important component of Smart Access Gateway (SAG). After you associate an SAG instance with a CCN instance, the SAG instance connects the private networks associated with Alibaba Cloud. For more information, see <a href="https://help.aliyun.com/document_detail/93667.html">Overview of Cloud Connect Network</a>.</p>
     * 
     * @param request the request parameters of CreateCloudConnectNetwork  CreateCloudConnectNetworkRequest
     * @return CreateCloudConnectNetworkResponse
     */
    @Override
    public CompletableFuture<CreateCloudConnectNetworkResponse> createCloudConnectNetwork(CreateCloudConnectNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateCloudConnectNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateCloudConnectNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateCloudConnectNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateEnterpriseCode  CreateEnterpriseCodeRequest
     * @return CreateEnterpriseCodeResponse
     */
    @Override
    public CompletableFuture<CreateEnterpriseCodeResponse> createEnterpriseCode(CreateEnterpriseCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateEnterpriseCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateEnterpriseCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateEnterpriseCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of CreateHealthCheck  CreateHealthCheckRequest
     * @return CreateHealthCheckResponse
     */
    @Override
    public CompletableFuture<CreateHealthCheckResponse> createHealthCheck(CreateHealthCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateHealthCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateHealthCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateHealthCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  Only SAG-1000 devices whose software version is 2.7.0 or later support the probing feature.</p>
     * <ul>
     * <li>The SAG instance must have the deep packet inspection (DPI) feature enabled. You can call the <a href="https://help.aliyun.com/document_detail/476404.html">SetAdvancedMonitorState</a> operation to enable or disable the DPI feature.</li>
     * </ul>
     * 
     * @param request the request parameters of CreateProbeTask  CreateProbeTaskRequest
     * @return CreateProbeTaskResponse
     */
    @Override
    public CompletableFuture<CreateProbeTaskResponse> createProbeTask(CreateProbeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateProbeTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateProbeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateProbeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQos  CreateQosRequest
     * @return CreateQosResponse
     */
    @Override
    public CompletableFuture<CreateQosResponse> createQos(CreateQosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateQosCar  CreateQosCarRequest
     * @return CreateQosCarResponse
     */
    @Override
    public CompletableFuture<CreateQosCarResponse> createQosCar(CreateQosCarRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQosCar").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQosCarResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQosCarResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>A traffic throttling rule is created. For more information, see <a href="https://help.aliyun.com/document_detail/131806.html">CreateQosCar</a>.</p>
     * 
     * @param request the request parameters of CreateQosPolicy  CreateQosPolicyRequest
     * @return CreateQosPolicyResponse
     */
    @Override
    public CompletableFuture<CreateQosPolicyResponse> createQosPolicy(CreateQosPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateQosPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateQosPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateQosPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSagExpressConnectInterface  CreateSagExpressConnectInterfaceRequest
     * @return CreateSagExpressConnectInterfaceResponse
     */
    @Override
    public CompletableFuture<CreateSagExpressConnectInterfaceResponse> createSagExpressConnectInterface(CreateSagExpressConnectInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSagExpressConnectInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSagExpressConnectInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSagExpressConnectInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSagStaticRoute  CreateSagStaticRouteRequest
     * @return CreateSagStaticRouteResponse
     */
    @Override
    public CompletableFuture<CreateSagStaticRouteResponse> createSagStaticRoute(CreateSagStaticRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSagStaticRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSagStaticRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSagStaticRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateServiceAddress  CreateServiceAddressRequest
     * @return CreateServiceAddressResponse
     */
    @Override
    public CompletableFuture<CreateServiceAddressResponse> createServiceAddress(CreateServiceAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateServiceAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateServiceAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateServiceAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSmartAccessGateway  CreateSmartAccessGatewayRequest
     * @return CreateSmartAccessGatewayResponse
     */
    @Override
    public CompletableFuture<CreateSmartAccessGatewayResponse> createSmartAccessGateway(CreateSmartAccessGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSmartAccessGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSmartAccessGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSmartAccessGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSmartAccessGatewayClientUser  CreateSmartAccessGatewayClientUserRequest
     * @return CreateSmartAccessGatewayClientUserResponse
     */
    @Override
    public CompletableFuture<CreateSmartAccessGatewayClientUserResponse> createSmartAccessGatewayClientUser(CreateSmartAccessGatewayClientUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSmartAccessGatewayClientUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSmartAccessGatewayClientUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSmartAccessGatewayClientUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of CreateSmartAccessGatewaySoftware  CreateSmartAccessGatewaySoftwareRequest
     * @return CreateSmartAccessGatewaySoftwareResponse
     */
    @Override
    public CompletableFuture<CreateSmartAccessGatewaySoftwareResponse> createSmartAccessGatewaySoftware(CreateSmartAccessGatewaySoftwareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("CreateSmartAccessGatewaySoftware").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(CreateSmartAccessGatewaySoftwareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<CreateSmartAccessGatewaySoftwareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of DeleteACL  DeleteACLRequest
     * @return DeleteACLResponse
     */
    @Override
    public CompletableFuture<DeleteACLResponse> deleteACL(DeleteACLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteACL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteACLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteACLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteACLRule  DeleteACLRuleRequest
     * @return DeleteACLRuleResponse
     */
    @Override
    public CompletableFuture<DeleteACLRuleResponse> deleteACLRule(DeleteACLRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteACLRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteACLRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteACLRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Make sure that the CCN instance you want to delete is not associated with a Smart Access Gateway (SAG) instance or a Cloud Enterprise Network (CEN) instance.</p>
     * </blockquote>
     * 
     * @param request the request parameters of DeleteCloudConnectNetwork  DeleteCloudConnectNetworkRequest
     * @return DeleteCloudConnectNetworkResponse
     */
    @Override
    public CompletableFuture<DeleteCloudConnectNetworkResponse> deleteCloudConnectNetwork(DeleteCloudConnectNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteCloudConnectNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteCloudConnectNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteCloudConnectNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteDnatEntry  DeleteDnatEntryRequest
     * @return DeleteDnatEntryResponse
     */
    @Override
    public CompletableFuture<DeleteDnatEntryResponse> deleteDnatEntry(DeleteDnatEntryRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteDnatEntry").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteDnatEntryResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteDnatEntryResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following rules:</p>
     * <ul>
     * <li>You cannot delete default enterprise codes.
     * To delete a default enterprise code, change it to a custom enterprise code and then delete it. For more information, see <a href="https://help.aliyun.com/document_detail/197700.html">UpdateEnterpriseCode</a>.</li>
     * <li>You cannot delete enterprise codes that are associated with a Smart Access Gateway (SAG) APP instance.
     * To delete an enterprise code that is associated with an SAG APP instance, associate the SAG APP instance with another enterprise code, and then delete the enterprise code. For more information, see <a href="https://help.aliyun.com/document_detail/197701.html">UpdateSmartAGEnterpriseCode</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteEnterpriseCode  DeleteEnterpriseCodeRequest
     * @return DeleteEnterpriseCodeResponse
     */
    @Override
    public CompletableFuture<DeleteEnterpriseCodeResponse> deleteEnterpriseCode(DeleteEnterpriseCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteEnterpriseCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteEnterpriseCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteEnterpriseCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of DeleteHealthCheck  DeleteHealthCheckRequest
     * @return DeleteHealthCheckResponse
     */
    @Override
    public CompletableFuture<DeleteHealthCheckResponse> deleteHealthCheck(DeleteHealthCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteHealthCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteHealthCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteHealthCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteProbeTask  DeleteProbeTaskRequest
     * @return DeleteProbeTaskResponse
     */
    @Override
    public CompletableFuture<DeleteProbeTaskResponse> deleteProbeTask(DeleteProbeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteProbeTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteProbeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteProbeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteQos  DeleteQosRequest
     * @return DeleteQosResponse
     */
    @Override
    public CompletableFuture<DeleteQosResponse> deleteQos(DeleteQosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteQosCar  DeleteQosCarRequest
     * @return DeleteQosCarResponse
     */
    @Override
    public CompletableFuture<DeleteQosCarResponse> deleteQosCar(DeleteQosCarRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQosCar").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQosCarResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQosCarResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteQosPolicy  DeleteQosPolicyRequest
     * @return DeleteQosPolicyResponse
     */
    @Override
    public CompletableFuture<DeleteQosPolicyResponse> deleteQosPolicy(DeleteQosPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteQosPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteQosPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteQosPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteRouteDistributionStrategy  DeleteRouteDistributionStrategyRequest
     * @return DeleteRouteDistributionStrategyResponse
     */
    @Override
    public CompletableFuture<DeleteRouteDistributionStrategyResponse> deleteRouteDistributionStrategy(DeleteRouteDistributionStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteRouteDistributionStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteRouteDistributionStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteRouteDistributionStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSagExpressConnectInterface  DeleteSagExpressConnectInterfaceRequest
     * @return DeleteSagExpressConnectInterfaceResponse
     */
    @Override
    public CompletableFuture<DeleteSagExpressConnectInterfaceResponse> deleteSagExpressConnectInterface(DeleteSagExpressConnectInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSagExpressConnectInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSagExpressConnectInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSagExpressConnectInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSagStaticRoute  DeleteSagStaticRouteRequest
     * @return DeleteSagStaticRouteResponse
     */
    @Override
    public CompletableFuture<DeleteSagStaticRouteResponse> deleteSagStaticRoute(DeleteSagStaticRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSagStaticRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSagStaticRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSagStaticRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteServiceAddress  DeleteServiceAddressRequest
     * @return DeleteServiceAddressResponse
     */
    @Override
    public CompletableFuture<DeleteServiceAddressResponse> deleteServiceAddress(DeleteServiceAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteServiceAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteServiceAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteServiceAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The SAG instance that you want to delete is an SAG CPE instance or an SAG vCPE instance.</p>
     * <ul>
     * <li>The SAG instance that you want to delete is locked due to overdue payments.</li>
     * <li>The SAG instance that you want to delete is not associated with a Cloud Connect Network (CCN) instance or a virtual border router (VBR). If the SAG instance is associated with a CCN instance or a VBR, dissociate the SAG instance from the CCN instance or VBR first. For more information, see <a href="https://help.aliyun.com/document_detail/164903.html">Detach a network</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of DeleteSmartAccessGateway  DeleteSmartAccessGatewayRequest
     * @return DeleteSmartAccessGatewayResponse
     */
    @Override
    public CompletableFuture<DeleteSmartAccessGatewayResponse> deleteSmartAccessGateway(DeleteSmartAccessGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSmartAccessGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSmartAccessGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSmartAccessGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSmartAccessGatewayClientUser  DeleteSmartAccessGatewayClientUserRequest
     * @return DeleteSmartAccessGatewayClientUserResponse
     */
    @Override
    public CompletableFuture<DeleteSmartAccessGatewayClientUserResponse> deleteSmartAccessGatewayClientUser(DeleteSmartAccessGatewayClientUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSmartAccessGatewayClientUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSmartAccessGatewayClientUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSmartAccessGatewayClientUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DeleteSmartAccessGatewayDnsForward  DeleteSmartAccessGatewayDnsForwardRequest
     * @return DeleteSmartAccessGatewayDnsForwardResponse
     */
    @Override
    public CompletableFuture<DeleteSmartAccessGatewayDnsForwardResponse> deleteSmartAccessGatewayDnsForward(DeleteSmartAccessGatewayDnsForwardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DeleteSmartAccessGatewayDnsForward").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DeleteSmartAccessGatewayDnsForwardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DeleteSmartAccessGatewayDnsForwardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of DescribeACLAttribute  DescribeACLAttributeRequest
     * @return DescribeACLAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeACLAttributeResponse> describeACLAttribute(DescribeACLAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeACLAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeACLAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeACLAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeACLs  DescribeACLsRequest
     * @return DescribeACLsResponse
     */
    @Override
    public CompletableFuture<DescribeACLsResponse> describeACLs(DescribeACLsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeACLs").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeACLsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeACLsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeBindableSmartAccessGateways  DescribeBindableSmartAccessGatewaysRequest
     * @return DescribeBindableSmartAccessGatewaysResponse
     */
    @Override
    public CompletableFuture<DescribeBindableSmartAccessGatewaysResponse> describeBindableSmartAccessGateways(DescribeBindableSmartAccessGatewaysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeBindableSmartAccessGateways").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeBindableSmartAccessGatewaysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeBindableSmartAccessGatewaysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeClientUserDNS  DescribeClientUserDNSRequest
     * @return DescribeClientUserDNSResponse
     */
    @Override
    public CompletableFuture<DescribeClientUserDNSResponse> describeClientUserDNS(DescribeClientUserDNSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeClientUserDNS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeClientUserDNSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeClientUserDNSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeCloudConnectNetworks  DescribeCloudConnectNetworksRequest
     * @return DescribeCloudConnectNetworksResponse
     */
    @Override
    public CompletableFuture<DescribeCloudConnectNetworksResponse> describeCloudConnectNetworks(DescribeCloudConnectNetworksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeCloudConnectNetworks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeCloudConnectNetworksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeCloudConnectNetworksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDeviceAutoUpgradePolicy  DescribeDeviceAutoUpgradePolicyRequest
     * @return DescribeDeviceAutoUpgradePolicyResponse
     */
    @Override
    public CompletableFuture<DescribeDeviceAutoUpgradePolicyResponse> describeDeviceAutoUpgradePolicy(DescribeDeviceAutoUpgradePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDeviceAutoUpgradePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDeviceAutoUpgradePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDeviceAutoUpgradePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeDnatEntries  DescribeDnatEntriesRequest
     * @return DescribeDnatEntriesResponse
     */
    @Override
    public CompletableFuture<DescribeDnatEntriesResponse> describeDnatEntries(DescribeDnatEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeDnatEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeDnatEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeDnatEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeFlowLogSags  DescribeFlowLogSagsRequest
     * @return DescribeFlowLogSagsResponse
     */
    @Override
    public CompletableFuture<DescribeFlowLogSagsResponse> describeFlowLogSags(DescribeFlowLogSagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeFlowLogSags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeFlowLogSagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeFlowLogSagsResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeGrantRules  DescribeGrantRulesRequest
     * @return DescribeGrantRulesResponse
     */
    @Override
    public CompletableFuture<DescribeGrantRulesResponse> describeGrantRules(DescribeGrantRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGrantRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGrantRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGrantRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGrantSagRules  DescribeGrantSagRulesRequest
     * @return DescribeGrantSagRulesResponse
     */
    @Override
    public CompletableFuture<DescribeGrantSagRulesResponse> describeGrantSagRules(DescribeGrantSagRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGrantSagRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGrantSagRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGrantSagRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeGrantSagVbrRules  DescribeGrantSagVbrRulesRequest
     * @return DescribeGrantSagVbrRulesResponse
     */
    @Override
    public CompletableFuture<DescribeGrantSagVbrRulesResponse> describeGrantSagVbrRules(DescribeGrantSagVbrRulesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeGrantSagVbrRules").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeGrantSagVbrRulesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeGrantSagVbrRulesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHealthCheckAttribute  DescribeHealthCheckAttributeRequest
     * @return DescribeHealthCheckAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeHealthCheckAttributeResponse> describeHealthCheckAttribute(DescribeHealthCheckAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHealthCheckAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHealthCheckAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHealthCheckAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeHealthChecks  DescribeHealthChecksRequest
     * @return DescribeHealthChecksResponse
     */
    @Override
    public CompletableFuture<DescribeHealthChecksResponse> describeHealthChecks(DescribeHealthChecksRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeHealthChecks").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeHealthChecksResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeHealthChecksResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeQosCars  DescribeQosCarsRequest
     * @return DescribeQosCarsResponse
     */
    @Override
    public CompletableFuture<DescribeQosCarsResponse> describeQosCars(DescribeQosCarsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeQosCars").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeQosCarsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeQosCarsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeQosPolicies  DescribeQosPoliciesRequest
     * @return DescribeQosPoliciesResponse
     */
    @Override
    public CompletableFuture<DescribeQosPoliciesResponse> describeQosPolicies(DescribeQosPoliciesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeQosPolicies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeQosPoliciesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeQosPoliciesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeQoses  DescribeQosesRequest
     * @return DescribeQosesResponse
     */
    @Override
    public CompletableFuture<DescribeQosesResponse> describeQoses(DescribeQosesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeQoses").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeQosesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeQosesResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of DescribeRouteDistributionStrategies  DescribeRouteDistributionStrategiesRequest
     * @return DescribeRouteDistributionStrategiesResponse
     */
    @Override
    public CompletableFuture<DescribeRouteDistributionStrategiesResponse> describeRouteDistributionStrategies(DescribeRouteDistributionStrategiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeRouteDistributionStrategies").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeRouteDistributionStrategiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeRouteDistributionStrategiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSAGDeviceInfo  DescribeSAGDeviceInfoRequest
     * @return DescribeSAGDeviceInfoResponse
     */
    @Override
    public CompletableFuture<DescribeSAGDeviceInfoResponse> describeSAGDeviceInfo(DescribeSAGDeviceInfoRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSAGDeviceInfo").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSAGDeviceInfoResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSAGDeviceInfoResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagCurrentDns  DescribeSagCurrentDnsRequest
     * @return DescribeSagCurrentDnsResponse
     */
    @Override
    public CompletableFuture<DescribeSagCurrentDnsResponse> describeSagCurrentDns(DescribeSagCurrentDnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagCurrentDns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagCurrentDnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagCurrentDnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagDropTopN  DescribeSagDropTopNRequest
     * @return DescribeSagDropTopNResponse
     */
    @Override
    public CompletableFuture<DescribeSagDropTopNResponse> describeSagDropTopN(DescribeSagDropTopNRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagDropTopN").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagDropTopNResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagDropTopNResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagExpressConnectInterfaceList  DescribeSagExpressConnectInterfaceListRequest
     * @return DescribeSagExpressConnectInterfaceListResponse
     */
    @Override
    public CompletableFuture<DescribeSagExpressConnectInterfaceListResponse> describeSagExpressConnectInterfaceList(DescribeSagExpressConnectInterfaceListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagExpressConnectInterfaceList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagExpressConnectInterfaceListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagExpressConnectInterfaceListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagGlobalRouteProtocol  DescribeSagGlobalRouteProtocolRequest
     * @return DescribeSagGlobalRouteProtocolResponse
     */
    @Override
    public CompletableFuture<DescribeSagGlobalRouteProtocolResponse> describeSagGlobalRouteProtocol(DescribeSagGlobalRouteProtocolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagGlobalRouteProtocol").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagGlobalRouteProtocolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagGlobalRouteProtocolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagHa  DescribeSagHaRequest
     * @return DescribeSagHaResponse
     */
    @Override
    public CompletableFuture<DescribeSagHaResponse> describeSagHa(DescribeSagHaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagHa").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagHaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagHaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagLanList  DescribeSagLanListRequest
     * @return DescribeSagLanListResponse
     */
    @Override
    public CompletableFuture<DescribeSagLanListResponse> describeSagLanList(DescribeSagLanListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagLanList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagLanListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagLanListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagManagementPort  DescribeSagManagementPortRequest
     * @return DescribeSagManagementPortResponse
     */
    @Override
    public CompletableFuture<DescribeSagManagementPortResponse> describeSagManagementPort(DescribeSagManagementPortRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagManagementPort").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagManagementPortResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagManagementPortResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagOnlineClientStatistics  DescribeSagOnlineClientStatisticsRequest
     * @return DescribeSagOnlineClientStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeSagOnlineClientStatisticsResponse> describeSagOnlineClientStatistics(DescribeSagOnlineClientStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagOnlineClientStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagOnlineClientStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagOnlineClientStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagPortList  DescribeSagPortListRequest
     * @return DescribeSagPortListResponse
     */
    @Override
    public CompletableFuture<DescribeSagPortListResponse> describeSagPortList(DescribeSagPortListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagPortList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagPortListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagPortListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagPortRouteProtocolList  DescribeSagPortRouteProtocolListRequest
     * @return DescribeSagPortRouteProtocolListResponse
     */
    @Override
    public CompletableFuture<DescribeSagPortRouteProtocolListResponse> describeSagPortRouteProtocolList(DescribeSagPortRouteProtocolListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagPortRouteProtocolList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagPortRouteProtocolListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagPortRouteProtocolListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagRemoteAccess  DescribeSagRemoteAccessRequest
     * @return DescribeSagRemoteAccessResponse
     */
    @Override
    public CompletableFuture<DescribeSagRemoteAccessResponse> describeSagRemoteAccess(DescribeSagRemoteAccessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagRemoteAccess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagRemoteAccessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagRemoteAccessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagRouteList  DescribeSagRouteListRequest
     * @return DescribeSagRouteListResponse
     */
    @Override
    public CompletableFuture<DescribeSagRouteListResponse> describeSagRouteList(DescribeSagRouteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagRouteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagRouteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagRouteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagRouteProtocolBgp  DescribeSagRouteProtocolBgpRequest
     * @return DescribeSagRouteProtocolBgpResponse
     */
    @Override
    public CompletableFuture<DescribeSagRouteProtocolBgpResponse> describeSagRouteProtocolBgp(DescribeSagRouteProtocolBgpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagRouteProtocolBgp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagRouteProtocolBgpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagRouteProtocolBgpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagRouteProtocolOspf  DescribeSagRouteProtocolOspfRequest
     * @return DescribeSagRouteProtocolOspfResponse
     */
    @Override
    public CompletableFuture<DescribeSagRouteProtocolOspfResponse> describeSagRouteProtocolOspf(DescribeSagRouteProtocolOspfRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagRouteProtocolOspf").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagRouteProtocolOspfResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagRouteProtocolOspfResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagStaticRouteList  DescribeSagStaticRouteListRequest
     * @return DescribeSagStaticRouteListResponse
     */
    @Override
    public CompletableFuture<DescribeSagStaticRouteListResponse> describeSagStaticRouteList(DescribeSagStaticRouteListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagStaticRouteList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagStaticRouteListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagStaticRouteListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagTrafficTopN  DescribeSagTrafficTopNRequest
     * @return DescribeSagTrafficTopNResponse
     */
    @Override
    public CompletableFuture<DescribeSagTrafficTopNResponse> describeSagTrafficTopN(DescribeSagTrafficTopNRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagTrafficTopN").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagTrafficTopNResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagTrafficTopNResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagUserDns  DescribeSagUserDnsRequest
     * @return DescribeSagUserDnsResponse
     */
    @Override
    public CompletableFuture<DescribeSagUserDnsResponse> describeSagUserDns(DescribeSagUserDnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagUserDns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagUserDnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagUserDnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagVbrRelations  DescribeSagVbrRelationsRequest
     * @return DescribeSagVbrRelationsResponse
     */
    @Override
    public CompletableFuture<DescribeSagVbrRelationsResponse> describeSagVbrRelations(DescribeSagVbrRelationsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagVbrRelations").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagVbrRelationsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagVbrRelationsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagWan4G  DescribeSagWan4GRequest
     * @return DescribeSagWan4GResponse
     */
    @Override
    public CompletableFuture<DescribeSagWan4GResponse> describeSagWan4G(DescribeSagWan4GRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagWan4G").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagWan4GResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagWan4GResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagWanList  DescribeSagWanListRequest
     * @return DescribeSagWanListResponse
     */
    @Override
    public CompletableFuture<DescribeSagWanListResponse> describeSagWanList(DescribeSagWanListRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagWanList").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagWanListResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagWanListResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagWanSnat  DescribeSagWanSnatRequest
     * @return DescribeSagWanSnatResponse
     */
    @Override
    public CompletableFuture<DescribeSagWanSnatResponse> describeSagWanSnat(DescribeSagWanSnatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagWanSnat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagWanSnatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagWanSnatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSagWifi  DescribeSagWifiRequest
     * @return DescribeSagWifiResponse
     */
    @Override
    public CompletableFuture<DescribeSagWifiResponse> describeSagWifi(DescribeSagWifiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSagWifi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSagWifiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSagWifiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSmartAccessGatewayAttribute  DescribeSmartAccessGatewayAttributeRequest
     * @return DescribeSmartAccessGatewayAttributeResponse
     */
    @Override
    public CompletableFuture<DescribeSmartAccessGatewayAttributeResponse> describeSmartAccessGatewayAttribute(DescribeSmartAccessGatewayAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSmartAccessGatewayAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSmartAccessGatewayAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSmartAccessGatewayAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSmartAccessGatewayClientUsers  DescribeSmartAccessGatewayClientUsersRequest
     * @return DescribeSmartAccessGatewayClientUsersResponse
     */
    @Override
    public CompletableFuture<DescribeSmartAccessGatewayClientUsersResponse> describeSmartAccessGatewayClientUsers(DescribeSmartAccessGatewayClientUsersRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSmartAccessGatewayClientUsers").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSmartAccessGatewayClientUsersResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSmartAccessGatewayClientUsersResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSmartAccessGatewayHa  DescribeSmartAccessGatewayHaRequest
     * @return DescribeSmartAccessGatewayHaResponse
     */
    @Override
    public CompletableFuture<DescribeSmartAccessGatewayHaResponse> describeSmartAccessGatewayHa(DescribeSmartAccessGatewayHaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSmartAccessGatewayHa").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSmartAccessGatewayHaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSmartAccessGatewayHaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSmartAccessGatewayVersions  DescribeSmartAccessGatewayVersionsRequest
     * @return DescribeSmartAccessGatewayVersionsResponse
     */
    @Override
    public CompletableFuture<DescribeSmartAccessGatewayVersionsResponse> describeSmartAccessGatewayVersions(DescribeSmartAccessGatewayVersionsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSmartAccessGatewayVersions").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSmartAccessGatewayVersionsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSmartAccessGatewayVersionsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSmartAccessGateways  DescribeSmartAccessGatewaysRequest
     * @return DescribeSmartAccessGatewaysResponse
     */
    @Override
    public CompletableFuture<DescribeSmartAccessGatewaysResponse> describeSmartAccessGateways(DescribeSmartAccessGatewaysRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSmartAccessGateways").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSmartAccessGatewaysResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSmartAccessGatewaysResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeSnatEntries  DescribeSnatEntriesRequest
     * @return DescribeSnatEntriesResponse
     */
    @Override
    public CompletableFuture<DescribeSnatEntriesResponse> describeSnatEntries(DescribeSnatEntriesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeSnatEntries").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeSnatEntriesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeSnatEntriesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUnbindFlowLogSags  DescribeUnbindFlowLogSagsRequest
     * @return DescribeUnbindFlowLogSagsResponse
     */
    @Override
    public CompletableFuture<DescribeUnbindFlowLogSagsResponse> describeUnbindFlowLogSags(DescribeUnbindFlowLogSagsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUnbindFlowLogSags").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUnbindFlowLogSagsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUnbindFlowLogSagsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserFlowStatistics  DescribeUserFlowStatisticsRequest
     * @return DescribeUserFlowStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeUserFlowStatisticsResponse> describeUserFlowStatistics(DescribeUserFlowStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserFlowStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserFlowStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserFlowStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserOnlineClientStatistics  DescribeUserOnlineClientStatisticsRequest
     * @return DescribeUserOnlineClientStatisticsResponse
     */
    @Override
    public CompletableFuture<DescribeUserOnlineClientStatisticsResponse> describeUserOnlineClientStatistics(DescribeUserOnlineClientStatisticsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserOnlineClientStatistics").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserOnlineClientStatisticsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserOnlineClientStatisticsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DescribeUserOnlineClients  DescribeUserOnlineClientsRequest
     * @return DescribeUserOnlineClientsResponse
     */
    @Override
    public CompletableFuture<DescribeUserOnlineClientsResponse> describeUserOnlineClients(DescribeUserOnlineClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DescribeUserOnlineClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DescribeUserOnlineClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DescribeUserOnlineClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DiagnoseSmartAccessGateway  DiagnoseSmartAccessGatewayRequest
     * @return DiagnoseSmartAccessGatewayResponse
     */
    @Override
    public CompletableFuture<DiagnoseSmartAccessGatewayResponse> diagnoseSmartAccessGateway(DiagnoseSmartAccessGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DiagnoseSmartAccessGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DiagnoseSmartAccessGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DiagnoseSmartAccessGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableSmartAGDpiMonitor  DisableSmartAGDpiMonitorRequest
     * @return DisableSmartAGDpiMonitorResponse
     */
    @Override
    public CompletableFuture<DisableSmartAGDpiMonitorResponse> disableSmartAGDpiMonitor(DisableSmartAGDpiMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableSmartAGDpiMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableSmartAGDpiMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableSmartAGDpiMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisableSmartAccessGatewayUser  DisableSmartAccessGatewayUserRequest
     * @return DisableSmartAccessGatewayUserResponse
     */
    @Override
    public CompletableFuture<DisableSmartAccessGatewayUserResponse> disableSmartAccessGatewayUser(DisableSmartAccessGatewayUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisableSmartAccessGatewayUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisableSmartAccessGatewayUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisableSmartAccessGatewayUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisassociateACL  DisassociateACLRequest
     * @return DisassociateACLResponse
     */
    @Override
    public CompletableFuture<DisassociateACLResponse> disassociateACL(DisassociateACLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisassociateACL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisassociateACLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisassociateACLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisassociateFlowLog  DisassociateFlowLogRequest
     * @return DisassociateFlowLogResponse
     */
    @Override
    public CompletableFuture<DisassociateFlowLogResponse> disassociateFlowLog(DisassociateFlowLogRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisassociateFlowLog").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisassociateFlowLogResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisassociateFlowLogResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DisassociateQos  DisassociateQosRequest
     * @return DisassociateQosResponse
     */
    @Override
    public CompletableFuture<DisassociateQosResponse> disassociateQos(DisassociateQosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DisassociateQos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DisassociateQosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DisassociateQosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DiscribeSmartAccessGatewayDiagnosisReport  DiscribeSmartAccessGatewayDiagnosisReportRequest
     * @return DiscribeSmartAccessGatewayDiagnosisReportResponse
     */
    @Override
    public CompletableFuture<DiscribeSmartAccessGatewayDiagnosisReportResponse> discribeSmartAccessGatewayDiagnosisReport(DiscribeSmartAccessGatewayDiagnosisReportRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DiscribeSmartAccessGatewayDiagnosisReport").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DiscribeSmartAccessGatewayDiagnosisReportResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DiscribeSmartAccessGatewayDiagnosisReportResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>When you call <strong>DissociateSmartAGFromApplicationBandwidthPackage</strong>, you can set the <strong>SmartAGId</strong> parameter to specify an SAG instance, or set the <strong>SmartAGIdList</strong> to specify multiple SAG instances.</p>
     * 
     * @param request the request parameters of DissociateSmartAGFromApplicationBandwidthPackage  DissociateSmartAGFromApplicationBandwidthPackageRequest
     * @return DissociateSmartAGFromApplicationBandwidthPackageResponse
     */
    @Override
    public CompletableFuture<DissociateSmartAGFromApplicationBandwidthPackageResponse> dissociateSmartAGFromApplicationBandwidthPackage(DissociateSmartAGFromApplicationBandwidthPackageRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DissociateSmartAGFromApplicationBandwidthPackage").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DissociateSmartAGFromApplicationBandwidthPackageResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DissociateSmartAGFromApplicationBandwidthPackageResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DowngradeSmartAccessGateway  DowngradeSmartAccessGatewayRequest
     * @return DowngradeSmartAccessGatewayResponse
     */
    @Override
    public CompletableFuture<DowngradeSmartAccessGatewayResponse> downgradeSmartAccessGateway(DowngradeSmartAccessGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DowngradeSmartAccessGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DowngradeSmartAccessGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DowngradeSmartAccessGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of DowngradeSmartAccessGatewaySoftware  DowngradeSmartAccessGatewaySoftwareRequest
     * @return DowngradeSmartAccessGatewaySoftwareResponse
     */
    @Override
    public CompletableFuture<DowngradeSmartAccessGatewaySoftwareResponse> downgradeSmartAccessGatewaySoftware(DowngradeSmartAccessGatewaySoftwareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("DowngradeSmartAccessGatewaySoftware").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(DowngradeSmartAccessGatewaySoftwareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<DowngradeSmartAccessGatewaySoftwareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  The DPI feature is enabled for the SAG instance. For more information, see <a href="https://help.aliyun.com/document_detail/196146.html">UpdateSmartAGDpiAttribute</a>.</p>
     * <ul>
     * <li>Log Service is activated. For more information, see <a href="https://help.aliyun.com/document_detail/54604.html">Quick Start</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of EnableSmartAGDpiMonitor  EnableSmartAGDpiMonitorRequest
     * @return EnableSmartAGDpiMonitorResponse
     */
    @Override
    public CompletableFuture<EnableSmartAGDpiMonitorResponse> enableSmartAGDpiMonitor(EnableSmartAGDpiMonitorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableSmartAGDpiMonitor").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableSmartAGDpiMonitorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableSmartAGDpiMonitorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of EnableSmartAccessGatewayUser  EnableSmartAccessGatewayUserRequest
     * @return EnableSmartAccessGatewayUserResponse
     */
    @Override
    public CompletableFuture<EnableSmartAccessGatewayUserResponse> enableSmartAccessGatewayUser(EnableSmartAccessGatewayUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("EnableSmartAccessGatewayUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(EnableSmartAccessGatewayUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<EnableSmartAccessGatewayUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>  An application-aware ACL is created. For more information, see <a href="https://help.aliyun.com/document_detail/114012.html">AddACLRule</a>.</p>
     * <ul>
     * <li>The application-aware ACL is applied to a Smart Access Gateway (SAG) instance. For more information, see <a href="https://help.aliyun.com/document_detail/114009.html">AssociateACL</a>.</li>
     * </ul>
     * 
     * @param request the request parameters of GetAclAttribute  GetAclAttributeRequest
     * @return GetAclAttributeResponse
     */
    @Override
    public CompletableFuture<GetAclAttributeResponse> getAclAttribute(GetAclAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAclAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAclAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAclAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetAdvancedMonitorState  GetAdvancedMonitorStateRequest
     * @return GetAdvancedMonitorStateResponse
     */
    @Override
    public CompletableFuture<GetAdvancedMonitorStateResponse> getAdvancedMonitorState(GetAdvancedMonitorStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetAdvancedMonitorState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetAdvancedMonitorStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetAdvancedMonitorStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetCloudConnectNetworkUseLimit  GetCloudConnectNetworkUseLimitRequest
     * @return GetCloudConnectNetworkUseLimitResponse
     */
    @Override
    public CompletableFuture<GetCloudConnectNetworkUseLimitResponse> getCloudConnectNetworkUseLimit(GetCloudConnectNetworkUseLimitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetCloudConnectNetworkUseLimit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetCloudConnectNetworkUseLimitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetCloudConnectNetworkUseLimitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetQosAttribute  GetQosAttributeRequest
     * @return GetQosAttributeResponse
     */
    @Override
    public CompletableFuture<GetQosAttributeResponse> getQosAttribute(GetQosAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetQosAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetQosAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetQosAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSmartAGDpiAttribute  GetSmartAGDpiAttributeRequest
     * @return GetSmartAGDpiAttributeResponse
     */
    @Override
    public CompletableFuture<GetSmartAGDpiAttributeResponse> getSmartAGDpiAttribute(GetSmartAGDpiAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSmartAGDpiAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSmartAGDpiAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSmartAGDpiAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GetSmartAccessGatewayUseLimit  GetSmartAccessGatewayUseLimitRequest
     * @return GetSmartAccessGatewayUseLimitResponse
     */
    @Override
    public CompletableFuture<GetSmartAccessGatewayUseLimitResponse> getSmartAccessGatewayUseLimit(GetSmartAccessGatewayUseLimitRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GetSmartAccessGatewayUseLimit").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GetSmartAccessGatewayUseLimitResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GetSmartAccessGatewayUseLimitResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GrantInstanceToCbn  GrantInstanceToCbnRequest
     * @return GrantInstanceToCbnResponse
     */
    @Override
    public CompletableFuture<GrantInstanceToCbnResponse> grantInstanceToCbn(GrantInstanceToCbnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GrantInstanceToCbn").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantInstanceToCbnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantInstanceToCbnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GrantSagInstanceToCcn  GrantSagInstanceToCcnRequest
     * @return GrantSagInstanceToCcnResponse
     */
    @Override
    public CompletableFuture<GrantSagInstanceToCcnResponse> grantSagInstanceToCcn(GrantSagInstanceToCcnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GrantSagInstanceToCcn").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantSagInstanceToCcnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantSagInstanceToCcnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of GrantSagInstanceToVbr  GrantSagInstanceToVbrRequest
     * @return GrantSagInstanceToVbrResponse
     */
    @Override
    public CompletableFuture<GrantSagInstanceToVbrResponse> grantSagInstanceToVbr(GrantSagInstanceToVbrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("GrantSagInstanceToVbr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(GrantSagInstanceToVbrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<GrantSagInstanceToVbrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of KickOutClients  KickOutClientsRequest
     * @return KickOutClientsResponse
     */
    @Override
    public CompletableFuture<KickOutClientsResponse> kickOutClients(KickOutClientsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("KickOutClients").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(KickOutClientsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<KickOutClientsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAccessPointNetworkQualities  ListAccessPointNetworkQualitiesRequest
     * @return ListAccessPointNetworkQualitiesResponse
     */
    @Override
    public CompletableFuture<ListAccessPointNetworkQualitiesResponse> listAccessPointNetworkQualities(ListAccessPointNetworkQualitiesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAccessPointNetworkQualities").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAccessPointNetworkQualitiesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAccessPointNetworkQualitiesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>An access point connects Smart Access Gateway (SAG) instances to Cloud Connect Network (CCN). Some regions may contain more than one access point. After an SAG instance is associated with a CCN instance, the system selects the nearest access point to establish connections to Alibaba Cloud. This topic describes how to query access points in a specific region. For more information about the areas that support CCN, see <a href="https://help.aliyun.com/document_detail/93667.html">Introduction to CCN</a>.</p>
     * 
     * @param request the request parameters of ListAccessPoints  ListAccessPointsRequest
     * @return ListAccessPointsResponse
     */
    @Override
    public CompletableFuture<ListAccessPointsResponse> listAccessPoints(ListAccessPointsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAccessPoints").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAccessPointsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAccessPointsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListAvailableServiceAddress  ListAvailableServiceAddressRequest
     * @return ListAvailableServiceAddressResponse
     */
    @Override
    public CompletableFuture<ListAvailableServiceAddressResponse> listAvailableServiceAddress(ListAvailableServiceAddressRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListAvailableServiceAddress").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListAvailableServiceAddressResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListAvailableServiceAddressResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Background information</h2>
     * <p>If you have configured an application-aware access control list (ACL) or a quality of service (QoS) policy and associated it with a Smart Access Gateway (SAG) instance, you can call this operation to query whether the ACL rules or 5-tuples in the QoS policy are applied to the SAG instance. If settings are not applied to the SAG instance, the error information is returned.</p>
     * 
     * @param request the request parameters of ListDpiConfigError  ListDpiConfigErrorRequest
     * @return ListDpiConfigErrorResponse
     */
    @Override
    public CompletableFuture<ListDpiConfigErrorResponse> listDpiConfigError(ListDpiConfigErrorRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDpiConfigError").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDpiConfigErrorResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDpiConfigErrorResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListDpiGroups  ListDpiGroupsRequest
     * @return ListDpiGroupsResponse
     */
    @Override
    public CompletableFuture<ListDpiGroupsResponse> listDpiGroups(ListDpiGroupsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDpiGroups").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDpiGroupsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDpiGroupsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>This operation supports the following features:</p>
     * <ul>
     * <li>Queries the information about all applications supported by the SAG instance in a specified region.</li>
     * <li>Queries the information about an application by application ID in a specified region.</li>
     * <li>Queries the information about an application by application name in a specified region.</li>
     * <li>Queries the information about an application group by group ID in a specified region.
     * If this is the first time you call this operation, we recommend that you query all applications supported by the SAG instance in the specified region by region ID. Then, you can query the information about a specified application.</li>
     * </ul>
     * 
     * @param request the request parameters of ListDpiSignatures  ListDpiSignaturesRequest
     * @return ListDpiSignaturesResponse
     */
    @Override
    public CompletableFuture<ListDpiSignaturesResponse> listDpiSignatures(ListDpiSignaturesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListDpiSignatures").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListDpiSignaturesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListDpiSignaturesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListEnterpriseCode  ListEnterpriseCodeRequest
     * @return ListEnterpriseCodeResponse
     */
    @Override
    public CompletableFuture<ListEnterpriseCodeResponse> listEnterpriseCode(ListEnterpriseCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListEnterpriseCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListEnterpriseCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListEnterpriseCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListProbeTask  ListProbeTaskRequest
     * @return ListProbeTaskResponse
     */
    @Override
    public CompletableFuture<ListProbeTaskResponse> listProbeTask(ListProbeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListProbeTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListProbeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListProbeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSmartAGApiUnsupportedFeature  ListSmartAGApiUnsupportedFeatureRequest
     * @return ListSmartAGApiUnsupportedFeatureResponse
     */
    @Override
    public CompletableFuture<ListSmartAGApiUnsupportedFeatureResponse> listSmartAGApiUnsupportedFeature(ListSmartAGApiUnsupportedFeatureRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSmartAGApiUnsupportedFeature").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSmartAGApiUnsupportedFeatureResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSmartAGApiUnsupportedFeatureResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ListSmartAGByAccessPoint  ListSmartAGByAccessPointRequest
     * @return ListSmartAGByAccessPointResponse
     */
    @Override
    public CompletableFuture<ListSmartAGByAccessPointResponse> listSmartAGByAccessPoint(ListSmartAGByAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ListSmartAGByAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ListSmartAGByAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ListSmartAGByAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyACL  ModifyACLRequest
     * @return ModifyACLResponse
     */
    @Override
    public CompletableFuture<ModifyACLResponse> modifyACL(ModifyACLRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyACL").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyACLResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyACLResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyACLRule  ModifyACLRuleRequest
     * @return ModifyACLRuleResponse
     */
    @Override
    public CompletableFuture<ModifyACLRuleResponse> modifyACLRule(ModifyACLRuleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyACLRule").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyACLRuleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyACLRuleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyClientUserDNS  ModifyClientUserDNSRequest
     * @return ModifyClientUserDNSResponse
     */
    @Override
    public CompletableFuture<ModifyClientUserDNSResponse> modifyClientUserDNS(ModifyClientUserDNSRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyClientUserDNS").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyClientUserDNSResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyClientUserDNSResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyCloudConnectNetwork  ModifyCloudConnectNetworkRequest
     * @return ModifyCloudConnectNetworkResponse
     */
    @Override
    public CompletableFuture<ModifyCloudConnectNetworkResponse> modifyCloudConnectNetwork(ModifyCloudConnectNetworkRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyCloudConnectNetwork").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyCloudConnectNetworkResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyCloudConnectNetworkResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyDeviceAutoUpgradePolicy  ModifyDeviceAutoUpgradePolicyRequest
     * @return ModifyDeviceAutoUpgradePolicyResponse
     */
    @Override
    public CompletableFuture<ModifyDeviceAutoUpgradePolicyResponse> modifyDeviceAutoUpgradePolicy(ModifyDeviceAutoUpgradePolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyDeviceAutoUpgradePolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyDeviceAutoUpgradePolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyDeviceAutoUpgradePolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
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
     * @param request the request parameters of ModifyHealthCheck  ModifyHealthCheckRequest
     * @return ModifyHealthCheckResponse
     */
    @Override
    public CompletableFuture<ModifyHealthCheckResponse> modifyHealthCheck(ModifyHealthCheckRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyHealthCheck").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyHealthCheckResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyHealthCheckResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyQos  ModifyQosRequest
     * @return ModifyQosResponse
     */
    @Override
    public CompletableFuture<ModifyQosResponse> modifyQos(ModifyQosRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyQos").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyQosResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyQosResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyQosCar  ModifyQosCarRequest
     * @return ModifyQosCarResponse
     */
    @Override
    public CompletableFuture<ModifyQosCarResponse> modifyQosCar(ModifyQosCarRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyQosCar").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyQosCarResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyQosCarResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyQosPolicy  ModifyQosPolicyRequest
     * @return ModifyQosPolicyResponse
     */
    @Override
    public CompletableFuture<ModifyQosPolicyResponse> modifyQosPolicy(ModifyQosPolicyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyQosPolicy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyQosPolicyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyQosPolicyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifyRouteDistributionStrategy  ModifyRouteDistributionStrategyRequest
     * @return ModifyRouteDistributionStrategyResponse
     */
    @Override
    public CompletableFuture<ModifyRouteDistributionStrategyResponse> modifyRouteDistributionStrategy(ModifyRouteDistributionStrategyRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifyRouteDistributionStrategy").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifyRouteDistributionStrategyResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifyRouteDistributionStrategyResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySAGAdminPassword  ModifySAGAdminPasswordRequest
     * @return ModifySAGAdminPasswordResponse
     */
    @Override
    public CompletableFuture<ModifySAGAdminPasswordResponse> modifySAGAdminPassword(ModifySAGAdminPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySAGAdminPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySAGAdminPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySAGAdminPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagExpressConnectInterface  ModifySagExpressConnectInterfaceRequest
     * @return ModifySagExpressConnectInterfaceResponse
     */
    @Override
    public CompletableFuture<ModifySagExpressConnectInterfaceResponse> modifySagExpressConnectInterface(ModifySagExpressConnectInterfaceRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagExpressConnectInterface").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagExpressConnectInterfaceResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagExpressConnectInterfaceResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagGlobalRouteProtocol  ModifySagGlobalRouteProtocolRequest
     * @return ModifySagGlobalRouteProtocolResponse
     */
    @Override
    public CompletableFuture<ModifySagGlobalRouteProtocolResponse> modifySagGlobalRouteProtocol(ModifySagGlobalRouteProtocolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagGlobalRouteProtocol").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagGlobalRouteProtocolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagGlobalRouteProtocolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagHa  ModifySagHaRequest
     * @return ModifySagHaResponse
     */
    @Override
    public CompletableFuture<ModifySagHaResponse> modifySagHa(ModifySagHaRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagHa").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagHaResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagHaResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagLan  ModifySagLanRequest
     * @return ModifySagLanResponse
     */
    @Override
    public CompletableFuture<ModifySagLanResponse> modifySagLan(ModifySagLanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagLan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagLanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagLanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagManagementPort  ModifySagManagementPortRequest
     * @return ModifySagManagementPortResponse
     */
    @Override
    public CompletableFuture<ModifySagManagementPortResponse> modifySagManagementPort(ModifySagManagementPortRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagManagementPort").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagManagementPortResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagManagementPortResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> If you modify the role of a port, the current role configurations of the port are deleted.</p>
     * </blockquote>
     * 
     * @param request the request parameters of ModifySagPortRole  ModifySagPortRoleRequest
     * @return ModifySagPortRoleResponse
     */
    @Override
    public CompletableFuture<ModifySagPortRoleResponse> modifySagPortRole(ModifySagPortRoleRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagPortRole").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagPortRoleResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagPortRoleResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagPortRouteProtocol  ModifySagPortRouteProtocolRequest
     * @return ModifySagPortRouteProtocolResponse
     */
    @Override
    public CompletableFuture<ModifySagPortRouteProtocolResponse> modifySagPortRouteProtocol(ModifySagPortRouteProtocolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagPortRouteProtocol").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagPortRouteProtocolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagPortRouteProtocolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagRemoteAccess  ModifySagRemoteAccessRequest
     * @return ModifySagRemoteAccessResponse
     */
    @Override
    public CompletableFuture<ModifySagRemoteAccessResponse> modifySagRemoteAccess(ModifySagRemoteAccessRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagRemoteAccess").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagRemoteAccessResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagRemoteAccessResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagRouteProtocolBgp  ModifySagRouteProtocolBgpRequest
     * @return ModifySagRouteProtocolBgpResponse
     */
    @Override
    public CompletableFuture<ModifySagRouteProtocolBgpResponse> modifySagRouteProtocolBgp(ModifySagRouteProtocolBgpRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagRouteProtocolBgp").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagRouteProtocolBgpResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagRouteProtocolBgpResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagRouteProtocolOspf  ModifySagRouteProtocolOspfRequest
     * @return ModifySagRouteProtocolOspfResponse
     */
    @Override
    public CompletableFuture<ModifySagRouteProtocolOspfResponse> modifySagRouteProtocolOspf(ModifySagRouteProtocolOspfRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagRouteProtocolOspf").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagRouteProtocolOspfResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagRouteProtocolOspfResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagStaticRoute  ModifySagStaticRouteRequest
     * @return ModifySagStaticRouteResponse
     */
    @Override
    public CompletableFuture<ModifySagStaticRouteResponse> modifySagStaticRoute(ModifySagStaticRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagStaticRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagStaticRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagStaticRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagUserDns  ModifySagUserDnsRequest
     * @return ModifySagUserDnsResponse
     */
    @Override
    public CompletableFuture<ModifySagUserDnsResponse> modifySagUserDns(ModifySagUserDnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagUserDns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagUserDnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagUserDnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>We recommend that you understand the functionality of a WAN port before you modify its settings. For more information, see <a href="https://help.aliyun.com/document_detail/163955.html">Configure a WAN port</a>.</p>
     * 
     * @param request the request parameters of ModifySagWan  ModifySagWanRequest
     * @return ModifySagWanResponse
     */
    @Override
    public CompletableFuture<ModifySagWanResponse> modifySagWan(ModifySagWanRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagWan").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagWanResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagWanResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagWanSnat  ModifySagWanSnatRequest
     * @return ModifySagWanSnatResponse
     */
    @Override
    public CompletableFuture<ModifySagWanSnatResponse> modifySagWanSnat(ModifySagWanSnatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagWanSnat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagWanSnatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagWanSnatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySagWifi  ModifySagWifiRequest
     * @return ModifySagWifiResponse
     */
    @Override
    public CompletableFuture<ModifySagWifiResponse> modifySagWifi(ModifySagWifiRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySagWifi").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySagWifiResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySagWifiResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySmartAccessGateway  ModifySmartAccessGatewayRequest
     * @return ModifySmartAccessGatewayResponse
     */
    @Override
    public CompletableFuture<ModifySmartAccessGatewayResponse> modifySmartAccessGateway(ModifySmartAccessGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySmartAccessGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySmartAccessGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySmartAccessGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySmartAccessGatewayClientUser  ModifySmartAccessGatewayClientUserRequest
     * @return ModifySmartAccessGatewayClientUserResponse
     */
    @Override
    public CompletableFuture<ModifySmartAccessGatewayClientUserResponse> modifySmartAccessGatewayClientUser(ModifySmartAccessGatewayClientUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySmartAccessGatewayClientUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySmartAccessGatewayClientUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySmartAccessGatewayClientUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ModifySmartAccessGatewayUpBandwidth  ModifySmartAccessGatewayUpBandwidthRequest
     * @return ModifySmartAccessGatewayUpBandwidthResponse
     */
    @Override
    public CompletableFuture<ModifySmartAccessGatewayUpBandwidthResponse> modifySmartAccessGatewayUpBandwidth(ModifySmartAccessGatewayUpBandwidthRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ModifySmartAccessGatewayUpBandwidth").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ModifySmartAccessGatewayUpBandwidthResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ModifySmartAccessGatewayUpBandwidthResponse> future = new CompletableFuture<>();
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
     * <b>description</b> :
     * <p>You can call this operation to test the connectivity between an SAG instance and a specified access point.</p>
     * <ul>
     * <li>If the SAG instance can connect to the access point, the ID of the request is returned in this operation.</li>
     * <li>If the SAG instance cannot connect to the access point, the ID of the request and corresponding error messages are returned in this operation.</li>
     * </ul>
     * 
     * @param request the request parameters of ProbeAccessPointNetworkQuality  ProbeAccessPointNetworkQualityRequest
     * @return ProbeAccessPointNetworkQualityResponse
     */
    @Override
    public CompletableFuture<ProbeAccessPointNetworkQualityResponse> probeAccessPointNetworkQuality(ProbeAccessPointNetworkQualityRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ProbeAccessPointNetworkQuality").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ProbeAccessPointNetworkQualityResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ProbeAccessPointNetworkQualityResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RebootSmartAccessGateway  RebootSmartAccessGatewayRequest
     * @return RebootSmartAccessGatewayResponse
     */
    @Override
    public CompletableFuture<RebootSmartAccessGatewayResponse> rebootSmartAccessGateway(RebootSmartAccessGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RebootSmartAccessGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RebootSmartAccessGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RebootSmartAccessGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ResetSmartAccessGatewayClientUserPassword  ResetSmartAccessGatewayClientUserPasswordRequest
     * @return ResetSmartAccessGatewayClientUserPasswordResponse
     */
    @Override
    public CompletableFuture<ResetSmartAccessGatewayClientUserPasswordResponse> resetSmartAccessGatewayClientUserPassword(ResetSmartAccessGatewayClientUserPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ResetSmartAccessGatewayClientUserPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ResetSmartAccessGatewayClientUserPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ResetSmartAccessGatewayClientUserPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of RevokeInstanceFromCbn  RevokeInstanceFromCbnRequest
     * @return RevokeInstanceFromCbnResponse
     */
    @Override
    public CompletableFuture<RevokeInstanceFromCbnResponse> revokeInstanceFromCbn(RevokeInstanceFromCbnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeInstanceFromCbn").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeInstanceFromCbnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeInstanceFromCbnResponse> future = new CompletableFuture<>();
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
     * @param request the request parameters of RevokeSagInstanceFromCcn  RevokeSagInstanceFromCcnRequest
     * @return RevokeSagInstanceFromCcnResponse
     */
    @Override
    public CompletableFuture<RevokeSagInstanceFromCcnResponse> revokeSagInstanceFromCcn(RevokeSagInstanceFromCcnRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RevokeSagInstanceFromCcn").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RevokeSagInstanceFromCcnResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RevokeSagInstanceFromCcnResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you call <code>RoamClientUser</code>, we recommend that you read and understand the features and usage notes of roaming. For more information, see <a href="https://help.aliyun.com/document_detail/177220.html">Configure roaming on clients</a>.</p>
     * 
     * @param request the request parameters of RoamClientUser  RoamClientUserRequest
     * @return RoamClientUserResponse
     */
    @Override
    public CompletableFuture<RoamClientUserResponse> roamClientUser(RoamClientUserRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("RoamClientUser").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(RoamClientUserResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<RoamClientUserResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of SetAdvancedMonitorState  SetAdvancedMonitorStateRequest
     * @return SetAdvancedMonitorStateResponse
     */
    @Override
    public CompletableFuture<SetAdvancedMonitorStateResponse> setAdvancedMonitorState(SetAdvancedMonitorStateRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SetAdvancedMonitorState").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SetAdvancedMonitorStateResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SetAdvancedMonitorStateResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p><em>SynchronizeSmartAGWebConfig</em>* is an asynchronous operation. After you send a request, the request ID is returned but the operation is still being performed in the system background. You can call the <a href="https://help.aliyun.com/document_detail/164279.html">DescribeSAGDeviceInfo</a> operation to query the status of an SAG device.</p>
     * <ul>
     * <li>If an SAG device is in the <strong>Synchronizing</strong> state, the settings of the SAG device are being synchronized to the associated SAG instance.</li>
     * <li>If an SAG device is in the <strong>Synchronized</strong> state, the settings of the SAG device are synchronized to the associated SAG instance.</li>
     * </ul>
     * 
     * @param request the request parameters of SynchronizeSmartAGWebConfig  SynchronizeSmartAGWebConfigRequest
     * @return SynchronizeSmartAGWebConfigResponse
     */
    @Override
    public CompletableFuture<SynchronizeSmartAGWebConfigResponse> synchronizeSmartAGWebConfig(SynchronizeSmartAGWebConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("SynchronizeSmartAGWebConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(SynchronizeSmartAGWebConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<SynchronizeSmartAGWebConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindSerialNumber  UnbindSerialNumberRequest
     * @return UnbindSerialNumberResponse
     */
    @Override
    public CompletableFuture<UnbindSerialNumberResponse> unbindSerialNumber(UnbindSerialNumberRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindSerialNumber").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindSerialNumberResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindSerialNumberResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindSmartAccessGateway  UnbindSmartAccessGatewayRequest
     * @return UnbindSmartAccessGatewayResponse
     */
    @Override
    public CompletableFuture<UnbindSmartAccessGatewayResponse> unbindSmartAccessGateway(UnbindSmartAccessGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindSmartAccessGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindSmartAccessGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindSmartAccessGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnbindVbr  UnbindVbrRequest
     * @return UnbindVbrResponse
     */
    @Override
    public CompletableFuture<UnbindVbrResponse> unbindVbr(UnbindVbrRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnbindVbr").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnbindVbrResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnbindVbrResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UnlockSmartAccessGateway  UnlockSmartAccessGatewayRequest
     * @return UnlockSmartAccessGatewayResponse
     */
    @Override
    public CompletableFuture<UnlockSmartAccessGatewayResponse> unlockSmartAccessGateway(UnlockSmartAccessGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UnlockSmartAccessGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UnlockSmartAccessGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UnlockSmartAccessGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateEnterpriseCode  UpdateEnterpriseCodeRequest
     * @return UpdateEnterpriseCodeResponse
     */
    @Override
    public CompletableFuture<UpdateEnterpriseCodeResponse> updateEnterpriseCode(UpdateEnterpriseCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateEnterpriseCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateEnterpriseCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateEnterpriseCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateProbeTask  UpdateProbeTaskRequest
     * @return UpdateProbeTaskResponse
     */
    @Override
    public CompletableFuture<UpdateProbeTaskResponse> updateProbeTask(UpdateProbeTaskRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateProbeTask").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateProbeTaskResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateProbeTaskResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <h2>Prerequisites</h2>
     * <p>Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/183876.html">ListAccessPoints</a> operation to view the switchable access points of the SAG instance.</p>
     * 
     * @param request the request parameters of UpdateSmartAGAccessPoint  UpdateSmartAGAccessPointRequest
     * @return UpdateSmartAGAccessPointResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAGAccessPointResponse> updateSmartAGAccessPoint(UpdateSmartAGAccessPointRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAGAccessPoint").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAGAccessPointResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAGAccessPointResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSmartAGDpiAttribute  UpdateSmartAGDpiAttributeRequest
     * @return UpdateSmartAGDpiAttributeResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAGDpiAttributeResponse> updateSmartAGDpiAttribute(UpdateSmartAGDpiAttributeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAGDpiAttribute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAGDpiAttributeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAGDpiAttributeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSmartAGEnterpriseCode  UpdateSmartAGEnterpriseCodeRequest
     * @return UpdateSmartAGEnterpriseCodeResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAGEnterpriseCodeResponse> updateSmartAGEnterpriseCode(UpdateSmartAGEnterpriseCodeRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAGEnterpriseCode").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAGEnterpriseCodeResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAGEnterpriseCodeResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>Before you set a maximum bandwidth value for a client, take note of the following rules:</p>
     * <ul>
     * <li>The maximum bandwidth value of a client cannot exceed that of the SAG app instance to which the client belongs.</li>
     * <li>If you have not set maximum bandwidth values for clients that belong to an SAG app instance, and the maximum bandwidth value of the instance is less than 5 Mbit/s, for example, 4 Mbit/s, the maximum bandwidth value of each client that belongs to the SAG app instance is 4 Mbit/s by default.</li>
     * <li>If you have not set maximum bandwidth values for clients that belong to an SAG app instance, and the maximum bandwidth value of the instance is 5 Mbit/s or higher, the maximum bandwidth value of each client that belongs to the SAG app instance is 5 Mbit/s by default.</li>
     * </ul>
     * 
     * @param request the request parameters of UpdateSmartAGUserAccelerateConfig  UpdateSmartAGUserAccelerateConfigRequest
     * @return UpdateSmartAGUserAccelerateConfigResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAGUserAccelerateConfigResponse> updateSmartAGUserAccelerateConfig(UpdateSmartAGUserAccelerateConfigRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAGUserAccelerateConfig").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAGUserAccelerateConfigResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAGUserAccelerateConfigResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can modify passwords that are used to log on to only SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayAdminPassword  UpdateSmartAccessGatewayAdminPasswordRequest
     * @return UpdateSmartAccessGatewayAdminPasswordResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAccessGatewayAdminPasswordResponse> updateSmartAccessGatewayAdminPassword(UpdateSmartAccessGatewayAdminPasswordRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAccessGatewayAdminPassword").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAccessGatewayAdminPasswordResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAccessGatewayAdminPasswordResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can modify the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayBgpRoute  UpdateSmartAccessGatewayBgpRouteRequest
     * @return UpdateSmartAccessGatewayBgpRouteResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAccessGatewayBgpRouteResponse> updateSmartAccessGatewayBgpRoute(UpdateSmartAccessGatewayBgpRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAccessGatewayBgpRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAccessGatewayBgpRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAccessGatewayBgpRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can modify the DNS configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayDns  UpdateSmartAccessGatewayDnsRequest
     * @return UpdateSmartAccessGatewayDnsResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAccessGatewayDnsResponse> updateSmartAccessGatewayDns(UpdateSmartAccessGatewayDnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAccessGatewayDns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAccessGatewayDnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAccessGatewayDnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSmartAccessGatewayDnsForward  UpdateSmartAccessGatewayDnsForwardRequest
     * @return UpdateSmartAccessGatewayDnsForwardResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAccessGatewayDnsForwardResponse> updateSmartAccessGatewayDnsForward(UpdateSmartAccessGatewayDnsForwardRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAccessGatewayDnsForward").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAccessGatewayDnsForwardResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAccessGatewayDnsForwardResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can modify the global routing protocol only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayGlobalRouteProtocol  UpdateSmartAccessGatewayGlobalRouteProtocolRequest
     * @return UpdateSmartAccessGatewayGlobalRouteProtocolResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAccessGatewayGlobalRouteProtocolResponse> updateSmartAccessGatewayGlobalRouteProtocol(UpdateSmartAccessGatewayGlobalRouteProtocolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAccessGatewayGlobalRouteProtocol").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAccessGatewayGlobalRouteProtocolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAccessGatewayGlobalRouteProtocolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSmartAccessGatewayOspfRoute  UpdateSmartAccessGatewayOspfRouteRequest
     * @return UpdateSmartAccessGatewayOspfRouteResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAccessGatewayOspfRouteResponse> updateSmartAccessGatewayOspfRoute(UpdateSmartAccessGatewayOspfRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAccessGatewayOspfRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAccessGatewayOspfRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAccessGatewayOspfRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can modify the port protocol only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayPortRouteProtocol  UpdateSmartAccessGatewayPortRouteProtocolRequest
     * @return UpdateSmartAccessGatewayPortRouteProtocolResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAccessGatewayPortRouteProtocolResponse> updateSmartAccessGatewayPortRouteProtocol(UpdateSmartAccessGatewayPortRouteProtocolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAccessGatewayPortRouteProtocol").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAccessGatewayPortRouteProtocolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAccessGatewayPortRouteProtocolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpdateSmartAccessGatewayVersion  UpdateSmartAccessGatewayVersionRequest
     * @return UpdateSmartAccessGatewayVersionResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAccessGatewayVersionResponse> updateSmartAccessGatewayVersion(UpdateSmartAccessGatewayVersionRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAccessGatewayVersion").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAccessGatewayVersionResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAccessGatewayVersionResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can modify the SNAT configuration of the WAN port only on SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of UpdateSmartAccessGatewayWanSnat  UpdateSmartAccessGatewayWanSnatRequest
     * @return UpdateSmartAccessGatewayWanSnatResponse
     */
    @Override
    public CompletableFuture<UpdateSmartAccessGatewayWanSnatResponse> updateSmartAccessGatewayWanSnat(UpdateSmartAccessGatewayWanSnatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpdateSmartAccessGatewayWanSnat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpdateSmartAccessGatewayWanSnatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpdateSmartAccessGatewayWanSnatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeSmartAccessGateway  UpgradeSmartAccessGatewayRequest
     * @return UpgradeSmartAccessGatewayResponse
     */
    @Override
    public CompletableFuture<UpgradeSmartAccessGatewayResponse> upgradeSmartAccessGateway(UpgradeSmartAccessGatewayRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeSmartAccessGateway").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeSmartAccessGatewayResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeSmartAccessGatewayResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of UpgradeSmartAccessGatewaySoftware  UpgradeSmartAccessGatewaySoftwareRequest
     * @return UpgradeSmartAccessGatewaySoftwareResponse
     */
    @Override
    public CompletableFuture<UpgradeSmartAccessGatewaySoftwareResponse> upgradeSmartAccessGatewaySoftware(UpgradeSmartAccessGatewaySoftwareRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("UpgradeSmartAccessGatewaySoftware").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(UpgradeSmartAccessGatewaySoftwareResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<UpgradeSmartAccessGatewaySoftwareResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayBgpRoute  ViewSmartAccessGatewayBgpRouteRequest
     * @return ViewSmartAccessGatewayBgpRouteResponse
     */
    @Override
    public CompletableFuture<ViewSmartAccessGatewayBgpRouteResponse> viewSmartAccessGatewayBgpRoute(ViewSmartAccessGatewayBgpRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ViewSmartAccessGatewayBgpRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ViewSmartAccessGatewayBgpRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ViewSmartAccessGatewayBgpRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the DNS configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayDns  ViewSmartAccessGatewayDnsRequest
     * @return ViewSmartAccessGatewayDnsResponse
     */
    @Override
    public CompletableFuture<ViewSmartAccessGatewayDnsResponse> viewSmartAccessGatewayDns(ViewSmartAccessGatewayDnsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ViewSmartAccessGatewayDns").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ViewSmartAccessGatewayDnsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ViewSmartAccessGatewayDnsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ViewSmartAccessGatewayDnsForwards  ViewSmartAccessGatewayDnsForwardsRequest
     * @return ViewSmartAccessGatewayDnsForwardsResponse
     */
    @Override
    public CompletableFuture<ViewSmartAccessGatewayDnsForwardsResponse> viewSmartAccessGatewayDnsForwards(ViewSmartAccessGatewayDnsForwardsRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ViewSmartAccessGatewayDnsForwards").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ViewSmartAccessGatewayDnsForwardsResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ViewSmartAccessGatewayDnsForwardsResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the global protocol only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayGlobalRouteProtocol  ViewSmartAccessGatewayGlobalRouteProtocolRequest
     * @return ViewSmartAccessGatewayGlobalRouteProtocolResponse
     */
    @Override
    public CompletableFuture<ViewSmartAccessGatewayGlobalRouteProtocolResponse> viewSmartAccessGatewayGlobalRouteProtocol(ViewSmartAccessGatewayGlobalRouteProtocolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ViewSmartAccessGatewayGlobalRouteProtocol").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ViewSmartAccessGatewayGlobalRouteProtocolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ViewSmartAccessGatewayGlobalRouteProtocolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the BGP configuration only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later and have OSPF enabled.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayOspfRoute  ViewSmartAccessGatewayOspfRouteRequest
     * @return ViewSmartAccessGatewayOspfRouteResponse
     */
    @Override
    public CompletableFuture<ViewSmartAccessGatewayOspfRouteResponse> viewSmartAccessGatewayOspfRoute(ViewSmartAccessGatewayOspfRouteRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ViewSmartAccessGatewayOspfRoute").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ViewSmartAccessGatewayOspfRouteResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ViewSmartAccessGatewayOspfRouteResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * @param request the request parameters of ViewSmartAccessGatewayPortRouteProtocol  ViewSmartAccessGatewayPortRouteProtocolRequest
     * @return ViewSmartAccessGatewayPortRouteProtocolResponse
     */
    @Override
    public CompletableFuture<ViewSmartAccessGatewayPortRouteProtocolResponse> viewSmartAccessGatewayPortRouteProtocol(ViewSmartAccessGatewayPortRouteProtocolRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ViewSmartAccessGatewayPortRouteProtocol").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ViewSmartAccessGatewayPortRouteProtocolResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ViewSmartAccessGatewayPortRouteProtocolResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the route details only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayRoutes  ViewSmartAccessGatewayRoutesRequest
     * @return ViewSmartAccessGatewayRoutesResponse
     */
    @Override
    public CompletableFuture<ViewSmartAccessGatewayRoutesResponse> viewSmartAccessGatewayRoutes(ViewSmartAccessGatewayRoutesRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ViewSmartAccessGatewayRoutes").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ViewSmartAccessGatewayRoutesResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ViewSmartAccessGatewayRoutesResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

    /**
     * <b>description</b> :
     * <p>You can query the SNAT configuration of the WAN port only of SCG5000 and SCG5000-5G devices whose version is 3.4.2 or later.</p>
     * 
     * @param request the request parameters of ViewSmartAccessGatewayWanSnat  ViewSmartAccessGatewayWanSnatRequest
     * @return ViewSmartAccessGatewayWanSnatResponse
     */
    @Override
    public CompletableFuture<ViewSmartAccessGatewayWanSnatResponse> viewSmartAccessGatewayWanSnat(ViewSmartAccessGatewayWanSnatRequest request) {
        try {
            this.handler.validateRequestModel(request);
            TeaRequest teaRequest = REQUEST.copy().setStyle(RequestStyle.RPC).setAction("ViewSmartAccessGatewayWanSnat").setMethod(HttpMethod.POST).setPathRegex("/").setBodyType(BodyType.JSON).setBodyIsForm(false).setReqBodyType(BodyType.JSON).formModel(request);
            ClientExecutionParams params = new ClientExecutionParams().withInput(request).withRequest(teaRequest).withOutput(ViewSmartAccessGatewayWanSnatResponse.create());
            return this.handler.execute(params);
        } catch (Exception e) {
            CompletableFuture<ViewSmartAccessGatewayWanSnatResponse> future = new CompletableFuture<>();
            future.completeExceptionally(e);
            return future;
        }
    }

}
